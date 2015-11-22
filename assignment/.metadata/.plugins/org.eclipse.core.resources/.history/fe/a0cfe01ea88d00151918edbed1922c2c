

/**
 * @author nhphung
 */
package bkool

import java.io.{PrintWriter,File}
import java.lang.RuntimeException
import java.util.concurrent.{Executors,TimeUnit,TimeoutException}
import org.antlr.v4.runtime.ANTLRFileStream

//import bkool.utils._
import bkool.parser._
import bkool.checker._
import bkool.codegeneration._

trait Timed {
  def timeoutAfter(timeout: Long)(codeToTest: => Unit): Unit = {
    val executor = Executors.newSingleThreadExecutor
    val future = executor.submit(new Runnable {
      def run = codeToTest
    })

    try {
      future.get(timeout, TimeUnit.MILLISECONDS)
    }
    finally {
      executor.shutdown()
    }
  }
}

object Main extends  Timed {
  
  val sepa = "/" // dung cho linux
  
  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      val option = args(0).drop(1)
      
      val startphase1 = 1
      val endphase1 = 100
      val indirphase1 = "lexertestcases"
      val outdirphase1 = "lexersolutions"
      
      val startphase2 = 1
      val endphase2 = 70
      val indirphase2 = "phase3test"
      val outdirphase2 = "phase3sol"
      
      val startphase3 = 1
      val endphase3 = 100
      val indirphase3 = "asttestcases"
      val outdirphase3 = "astsolutions"
      
      val starta2p1 = 1
      val enda2p1 = 40
      val indira2p1 = "phase1test"
      val outdira2p1 = "phase1sol"
      
       val starta2p2 = 1
      val enda2p2 = 110
      val indira2p2 = "phase2test"
      val outdira2p2 = "phase2sol"
      
      val starta2p3 = 1
      val enda2p3 = 70
      val indira2p3 = "phase3test"
      val outdira2p3 = "phase3sol"
      
      val starta3p1 = 1
      val enda3p1 = 1
      val indira3p1 = "testcases"
      val outdira3p1 = "solutions"
      option match {
        
        case "testphase1" => runTest(option,startphase1,endphase1,indirphase1,outdirphase1)
        case "testphase2" => {
            //runTest("testphase1",startphase1,endphase1,indirphase1,outdirphase1)
            runTest(option,startphase2,endphase2,indirphase2,outdirphase2)
        }
        case "testphase3" => {
            runTest("testphase1",startphase1,endphase1,indirphase1,outdirphase1)
            runTest("testphase2",startphase2,endphase2,indirphase2,outdirphase2)
            runTest(option,startphase3,endphase3,indirphase3,outdirphase3)
        }
        case "testa2p1" => runTest("testa2p1",starta2p1,enda2p1,indira2p1,outdira2p1)
        case "testa2p2" => runTest("testa2p2",starta2p2,enda2p2,indira2p2,outdira2p2)
        case "testa2p3" => runTest("testa2p3",starta2p3,enda2p3,indira2p3,outdira2p3)
        
        case "testa3" => runTest("testa3",starta3p1,enda3p1,indira3p1,outdira3p1)
        
        case _ => throw new ClassCastException
      }
    }
    else  println("Usage: scala Main -option ")
  }
  
  def runTest(opt:String,start:Int,end:Int,indir:String,outdir:String) = {
    
    for (i <- start to end) {
      
      println("Test "+i)
      
      
      val source = new ANTLRFileStream(s"$indir$sepa$i.txt")
      val dest = new PrintWriter(new File(s"$outdir$sepa$i.txt"))
      
      try 
      {
        timeoutAfter(1000)  
        {
            opt match {
              case "testphase1" => TestLexer.test(source,dest) 
              case "testphase2" => TestParser.test(source,dest)              
              case "testphase3"  => TestAst.test(source,dest)
              case "testa2p1" => TestChecker.test(source,dest)
              case "testa2p2" => TestChecker.test(source,dest)
              case "testa2p3" => TestChecker.test(source,dest)
              case "testa3" => {
                val dir = new File(s"$outdir$sepa$i")
                if (!dir.mkdir()) dir.listFiles().toList.map(_.delete())
                TestCodeGenerator.check(source,dest,dir)
              }
              case _ => throw new ClassCastException
          }
        }
      } 
      catch 
      {
        case te: TimeoutException => dest.println("Test runs timeout")
        case re: RuntimeException => dest.println(re.getMessage())
        //case e : Exception => dest.println(e)
      } 
      finally 
      {
        //source.close()
        dest.close()

      }
    }
  } 
}