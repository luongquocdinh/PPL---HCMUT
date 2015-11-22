;; Produced by JasminVisitor (BCEL)
;; http://bcel.sourceforge.net/
;; Sun Nov 15 23:08:46 ICT 2015

.source Input.java
.class  Input
.super java/lang/Object

.field static final f I = 5
.field static i I
.field static final a [I

.method  <init>()V
.limit stack 1
.limit locals 1
.var 0 is this LInput; from Label0 to Label1

Label0:
.line 2
	aload_0
	invokespecial java/lang/Object/<init>()V
Label1:
.line 7
	return

.end method

.method public static main([Ljava/lang/String;)V
.limit stack 1
.limit locals 1
.var 0 is arg0 [Ljava/lang/String; from Label0 to Label1

Label0:
.line 22
	iconst_5
	invokestatic Input$_A/A(I)I
	pop
Label1:
.line 24
	return

.end method

.method static <clinit>()V
.limit stack 1
.limit locals 0

.line 6
	iconst_5
	newarray int
	putstatic Input.a [I
	return

.end method
