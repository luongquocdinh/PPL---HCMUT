;; Produced by JasminVisitor (BCEL)
;; http://bcel.sourceforge.net/
;; Sun Nov 15 23:08:46 ICT 2015

.source Input.java
.class  Input$_A
.super java/lang/Object

.field static g I

.method  <init>()V
.limit stack 1
.limit locals 1
.var 0 is this LInput$_A; from Label0 to Label1

Label0:
.line 7
	aload_0
	invokespecial java/lang/Object/<init>()V
Label1:
.line 9
	return

.end method

.method static A(I)I
.limit stack 2
.limit locals 1
.var 0 is arg0 I from Label0 to Label1

Label0:
.line 16
	getstatic java.lang.System.out Ljava/io/PrintStream;
	getstatic Input.i I
	invokevirtual java/io/PrintStream/print(I)V
.line 17
	iload_0
Label1:
	ireturn

.end method
