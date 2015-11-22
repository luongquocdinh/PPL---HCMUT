;; Produced by JasminVisitor (BCEL)
;; http://bcel.sourceforge.net/
;; Sun Nov 15 23:08:46 ICT 2015

.source Input.java
.class  Input$_A$_B
.super java/lang/Object


.method  <init>()V
.limit stack 1
.limit locals 1
.var 0 is this LInput$_A$_B; from Label0 to Label1

Label0:
.line 9
	aload_0
	invokespecial java/lang/Object/<init>()V
Label1:
	return

.end method

.method static B()V
.limit stack 2
.limit locals 0

.line 11
	iconst_1
	putstatic Input$_A.g I
.line 12
	getstatic java.lang.System.out Ljava/io/PrintStream;
	getstatic Input$_A.g I
	invokevirtual java/io/PrintStream/print(I)V
.line 13
	return

.end method
