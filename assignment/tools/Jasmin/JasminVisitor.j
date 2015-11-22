;; Produced by JasminVisitor (BCEL)
;; http://bcel.sourceforge.net/
;; Sun Nov 15 23:08:46 ICT 2015

.source JasminVisitor.java
.class public JasminVisitor
.super org/apache/bcel/classfile/EmptyVisitor

.field private clazz Lorg/apache/bcel/classfile/JavaClass;
.field private out Ljava/io/PrintWriter;
.field private class_name Ljava/lang/String;
.field private cp Lorg/apache/bcel/generic/ConstantPoolGen;
.field private method Lorg/apache/bcel/classfile/Method;
.field private map Ljava/util/Hashtable;

.method public <init>(Lorg/apache/bcel/classfile/JavaClass;Ljava/io/OutputStream;)V
.limit stack 4
.limit locals 3
.var 0 is this LJasminVisitor; from Label0 to Label1
.var 1 is arg0 Lorg/apache/bcel/classfile/JavaClass; from Label0 to Label1
.var 2 is arg1 Ljava/io/OutputStream; from Label0 to Label1

Label0:
.line 15
	aload_0
	invokespecial org/apache/bcel/classfile/EmptyVisitor/<init>()V
.line 16
	aload_0
	aload_1
	putfield JasminVisitor.clazz Lorg/apache/bcel/classfile/JavaClass;
.line 17
	aload_0
	new java/io/PrintWriter
	dup
	aload_2
	invokespecial java/io/PrintWriter/<init>(Ljava/io/OutputStream;)V
	putfield JasminVisitor.out Ljava/io/PrintWriter;
.line 18
	aload_0
	aload_1
	invokevirtual org/apache/bcel/classfile/JavaClass/getClassName()Ljava/lang/String;
	putfield JasminVisitor.class_name Ljava/lang/String;
.line 19
	aload_0
	new org/apache/bcel/generic/ConstantPoolGen
	dup
	aload_1
	invokevirtual org/apache/bcel/classfile/JavaClass/getConstantPool()Lorg/apache/bcel/classfile/ConstantPool;
	invokespecial org/apache/bcel/generic/ConstantPoolGen/<init>(Lorg/apache/bcel/classfile/ConstantPool;)V
	putfield JasminVisitor.cp Lorg/apache/bcel/generic/ConstantPoolGen;
Label1:
.line 20
	return

.end method

.method public disassemble()V
.limit stack 4
.limit locals 1
.var 0 is this LJasminVisitor; from Label0 to Label1

Label0:
.line 26
	new org/apache/bcel/classfile/DescendingVisitor
	dup
	aload_0
	getfield JasminVisitor.clazz Lorg/apache/bcel/classfile/JavaClass;
	aload_0
	invokespecial org/apache/bcel/classfile/DescendingVisitor/<init>(Lorg/apache/bcel/classfile/JavaClass;Lorg/apache/bcel/classfile/Visitor;)V
	invokevirtual org/apache/bcel/classfile/DescendingVisitor/visit()V
.line 27
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	invokevirtual java/io/PrintWriter/close()V
Label1:
.line 28
	return

.end method

.method public visitJavaClass(Lorg/apache/bcel/classfile/JavaClass;)V
.limit stack 5
.limit locals 4
.var 0 is this LJasminVisitor; from Label2 to Label3
.var 1 is arg0 Lorg/apache/bcel/classfile/JavaClass; from Label2 to Label3

Label2:
.line 31
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	ldc ";; Produced by JasminVisitor (BCEL)"
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 32
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	ldc ";; http://bcel.sourceforge.net/"
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 33
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc ";; "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	new java/util/Date
	dup
	invokespecial java/util/Date/<init>()V
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	ldc "\n"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 35
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc ".source "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_1
	invokevirtual org/apache/bcel/classfile/JavaClass/getSourceFileName()Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 36
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc "."
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_1
	invokevirtual org/apache/bcel/classfile/JavaClass/getAccessFlags()I
	invokestatic org/apache/bcel/classfile/Utility/classOrInterface(I)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	ldc " "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_1
	invokevirtual org/apache/bcel/classfile/JavaClass/getAccessFlags()I
	iconst_1
	invokestatic org/apache/bcel/classfile/Utility/accessToString(IZ)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	ldc " "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_1
	invokevirtual org/apache/bcel/classfile/JavaClass/getClassName()Ljava/lang/String;
	bipush 46
	bipush 47
	invokevirtual java/lang/String/replace(CC)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 39
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc ".super "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_1
	invokevirtual org/apache/bcel/classfile/JavaClass/getSuperclassName()Ljava/lang/String;
	bipush 46
	bipush 47
	invokevirtual java/lang/String/replace(CC)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 41
	aload_1
	invokevirtual org/apache/bcel/classfile/JavaClass/getInterfaceNames()[Ljava/lang/String;
	astore_2
.line 43
	iconst_0
	istore_3
Label1:
	iload_3
	aload_2
	arraylength
	if_icmpge Label0
.line 44
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc ".implements "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_2
	iload_3
	aaload
	bipush 46
	bipush 47
	invokevirtual java/lang/String/replace(CC)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 43
	iinc 3 1
	goto Label1
Label0:
.line 46
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	ldc "\n"
	invokevirtual java/io/PrintWriter/print(Ljava/lang/String;)V
Label3:
.line 47
	return

.end method

.method public visitField(Lorg/apache/bcel/classfile/Field;)V
.limit stack 3
.limit locals 2
.var 0 is this LJasminVisitor; from Label1 to Label0
.var 1 is arg0 Lorg/apache/bcel/classfile/Field; from Label1 to Label0

Label1:
.line 50
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc ".field "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_1
	invokevirtual org/apache/bcel/classfile/Field/getAccessFlags()I
	invokestatic org/apache/bcel/classfile/Utility/accessToString(I)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	ldc " "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_1
	invokevirtual org/apache/bcel/classfile/Field/getName()Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	ldc " "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_1
	invokevirtual org/apache/bcel/classfile/Field/getSignature()Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/print(Ljava/lang/String;)V
.line 52
	aload_1
	invokevirtual org/apache/bcel/classfile/Field/getAttributes()[Lorg/apache/bcel/classfile/Attribute;
	arraylength
	ifne Label0
.line 53
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	ldc "\n"
	invokevirtual java/io/PrintWriter/print(Ljava/lang/String;)V
Label0:
.line 54
	return

.end method

.method public visitConstantValue(Lorg/apache/bcel/classfile/ConstantValue;)V
.limit stack 3
.limit locals 2
.var 0 is this LJasminVisitor; from Label0 to Label1
.var 1 is arg0 Lorg/apache/bcel/classfile/ConstantValue; from Label0 to Label1

Label0:
.line 57
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc " = "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_1
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
Label1:
.line 58
	return

.end method

.method private final printEndMethod(Lorg/apache/bcel/classfile/Attribute;)V
.limit stack 4
.limit locals 3
.var 0 is this LJasminVisitor; from Label1 to Label0
.var 1 is arg0 Lorg/apache/bcel/classfile/Attribute; from Label1 to Label0

Label1:
.line 68
	aload_0
	getfield JasminVisitor.method Lorg/apache/bcel/classfile/Method;
	invokevirtual org/apache/bcel/classfile/Method/getAttributes()[Lorg/apache/bcel/classfile/Attribute;
	astore_2
.line 70
	aload_1
	aload_2
	aload_2
	arraylength
	iconst_1
	isub
	aaload
	if_acmpne Label0
.line 71
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	ldc ".end method"
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
Label0:
.line 72
	return

.end method

.method public visitDeprecated(Lorg/apache/bcel/classfile/Deprecated;)V
.limit stack 2
.limit locals 2
.var 0 is this LJasminVisitor; from Label0 to Label1
.var 1 is arg0 Lorg/apache/bcel/classfile/Deprecated; from Label0 to Label1

Label0:
.line 74
	aload_0
	aload_1
	invokespecial JasminVisitor/printEndMethod(Lorg/apache/bcel/classfile/Attribute;)V
Label1:
	return

.end method

.method public visitSynthetic(Lorg/apache/bcel/classfile/Synthetic;)V
.limit stack 2
.limit locals 2
.var 0 is this LJasminVisitor; from Label0 to Label1
.var 1 is arg0 Lorg/apache/bcel/classfile/Synthetic; from Label0 to Label1

Label0:
.line 75
	aload_0
	aload_1
	invokespecial JasminVisitor/printEndMethod(Lorg/apache/bcel/classfile/Attribute;)V
Label1:
	return

.end method

.method public visitMethod(Lorg/apache/bcel/classfile/Method;)V
.limit stack 3
.limit locals 3
.var 0 is this LJasminVisitor; from Label2 to Label1
.var 1 is arg0 Lorg/apache/bcel/classfile/Method; from Label2 to Label1

Label2:
.line 78
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc "\n.method "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_1
	invokevirtual org/apache/bcel/classfile/Method/getAccessFlags()I
	invokestatic org/apache/bcel/classfile/Utility/accessToString(I)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	ldc " "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_1
	invokevirtual org/apache/bcel/classfile/Method/getName()Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_1
	invokevirtual org/apache/bcel/classfile/Method/getSignature()Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 81
	aload_0
	aload_1
	putfield JasminVisitor.method Lorg/apache/bcel/classfile/Method;
.line 83
	aload_1
	invokevirtual org/apache/bcel/classfile/Method/getAttributes()[Lorg/apache/bcel/classfile/Attribute;
	astore_2
.line 84
	aload_2
	ifnull Label0
	aload_2
	arraylength
	ifne Label1
Label0:
.line 85
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	ldc ".end method"
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
Label1:
.line 86
	return

.end method

.method public visitExceptionTable(Lorg/apache/bcel/classfile/ExceptionTable;)V
.limit stack 5
.limit locals 4
.var 0 is this LJasminVisitor; from Label2 to Label3
.var 1 is arg0 Lorg/apache/bcel/classfile/ExceptionTable; from Label2 to Label3

Label2:
.line 89
	aload_1
	invokevirtual org/apache/bcel/classfile/ExceptionTable/getExceptionNames()[Ljava/lang/String;
	astore_2
.line 90
	iconst_0
	istore_3
Label1:
	iload_3
	aload_2
	arraylength
	if_icmpge Label0
.line 91
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc ".throws "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_2
	iload_3
	aaload
	bipush 46
	bipush 47
	invokevirtual java/lang/String/replace(CC)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 90
	iinc 3 1
	goto Label1
Label0:
.line 93
	aload_0
	aload_1
	invokespecial JasminVisitor/printEndMethod(Lorg/apache/bcel/classfile/Attribute;)V
Label3:
.line 94
	return

.end method

.method public visitCode(Lorg/apache/bcel/classfile/Code;)V
.limit stack 5
.limit locals 17
.var 0 is this LJasminVisitor; from Label31 to Label32
.var 1 is arg0 Lorg/apache/bcel/classfile/Code; from Label31 to Label32

Label31:
.line 99
	iconst_0
	istore_2
.line 101
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc ".limit stack "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_1
	invokevirtual org/apache/bcel/classfile/Code/getMaxStack()I
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 102
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc ".limit locals "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_1
	invokevirtual org/apache/bcel/classfile/Code/getMaxLocals()I
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 104
	new org/apache/bcel/generic/MethodGen
	dup
	aload_0
	getfield JasminVisitor.method Lorg/apache/bcel/classfile/Method;
	aload_0
	getfield JasminVisitor.class_name Ljava/lang/String;
	aload_0
	getfield JasminVisitor.cp Lorg/apache/bcel/generic/ConstantPoolGen;
	invokespecial org/apache/bcel/generic/MethodGen/<init>(Lorg/apache/bcel/classfile/Method;Ljava/lang/String;Lorg/apache/bcel/generic/ConstantPoolGen;)V
	astore_3
.line 105
	aload_3
	invokevirtual org/apache/bcel/generic/MethodGen/getInstructionList()Lorg/apache/bcel/generic/InstructionList;
	astore 4
.line 106
	aload 4
	invokevirtual org/apache/bcel/generic/InstructionList/getInstructionHandles()[Lorg/apache/bcel/generic/InstructionHandle;
	astore 5
.line 111
	aload_0
	new java/util/Hashtable
	dup
	invokespecial java/util/Hashtable/<init>()V
	putfield JasminVisitor.map Ljava/util/Hashtable;
.line 113
	iconst_0
	istore 6
Label5:
	iload 6
	aload 5
	arraylength
	if_icmpge Label0
.line 114
	aload 5
	iload 6
	aaload
	instanceof org/apache/bcel/generic/BranchHandle
	ifeq Label1
.line 115
	aload 5
	iload 6
	aaload
	invokevirtual org/apache/bcel/generic/InstructionHandle/getInstruction()Lorg/apache/bcel/generic/Instruction;
	checkcast org/apache/bcel/generic/BranchInstruction
	astore 7
.line 117
	aload 7
	instanceof org/apache/bcel/generic/Select
	ifeq Label2
.line 118
	aload 7
	checkcast org/apache/bcel/generic/Select
	invokevirtual org/apache/bcel/generic/Select/getTargets()[Lorg/apache/bcel/generic/InstructionHandle;
	astore 8
.line 120
	iconst_0
	istore 9
Label4:
	iload 9
	aload 8
	arraylength
	if_icmpge Label2
.line 121
	aload_0
	aload 8
	iload 9
	aaload
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc "Label"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	iload_2
	iinc 2 1
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	ldc ":"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokespecial JasminVisitor/put(Lorg/apache/bcel/generic/InstructionHandle;Ljava/lang/String;)V
.line 120
	iinc 9 1
	goto Label4
Label2:
.line 124
	aload 7
	invokevirtual org/apache/bcel/generic/BranchInstruction/getTarget()Lorg/apache/bcel/generic/InstructionHandle;
	astore 8
.line 125
	aload_0
	aload 8
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc "Label"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	iload_2
	iinc 2 1
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	ldc ":"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokespecial JasminVisitor/put(Lorg/apache/bcel/generic/InstructionHandle;Ljava/lang/String;)V
Label1:
.line 113
	iinc 6 1
	goto Label5
Label0:
.line 129
	aload_3
	invokevirtual org/apache/bcel/generic/MethodGen/getLocalVariables()[Lorg/apache/bcel/generic/LocalVariableGen;
	astore 6
.line 130
	iconst_0
	istore 7
Label7:
	iload 7
	aload 6
	arraylength
	if_icmpge Label6
.line 131
	aload 6
	iload 7
	aaload
	invokevirtual org/apache/bcel/generic/LocalVariableGen/getStart()Lorg/apache/bcel/generic/InstructionHandle;
	astore 8
.line 132
	aload_0
	aload 8
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc "Label"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	iload_2
	iinc 2 1
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	ldc ":"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokespecial JasminVisitor/put(Lorg/apache/bcel/generic/InstructionHandle;Ljava/lang/String;)V
.line 133
	aload 6
	iload 7
	aaload
	invokevirtual org/apache/bcel/generic/LocalVariableGen/getEnd()Lorg/apache/bcel/generic/InstructionHandle;
	astore 8
.line 134
	aload_0
	aload 8
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc "Label"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	iload_2
	iinc 2 1
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	ldc ":"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokespecial JasminVisitor/put(Lorg/apache/bcel/generic/InstructionHandle;Ljava/lang/String;)V
.line 130
	iinc 7 1
	goto Label7
Label6:
.line 137
	aload_3
	invokevirtual org/apache/bcel/generic/MethodGen/getExceptionHandlers()[Lorg/apache/bcel/generic/CodeExceptionGen;
	astore 7
.line 138
	iconst_0
	istore 8
Label9:
	iload 8
	aload 7
	arraylength
	if_icmpge Label8
.line 139
	aload 7
	iload 8
	aaload
	astore 9
.line 140
	aload 9
	invokevirtual org/apache/bcel/generic/CodeExceptionGen/getStartPC()Lorg/apache/bcel/generic/InstructionHandle;
	astore 10
.line 142
	aload_0
	aload 10
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc "Label"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	iload_2
	iinc 2 1
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	ldc ":"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokespecial JasminVisitor/put(Lorg/apache/bcel/generic/InstructionHandle;Ljava/lang/String;)V
.line 143
	aload 9
	invokevirtual org/apache/bcel/generic/CodeExceptionGen/getEndPC()Lorg/apache/bcel/generic/InstructionHandle;
	astore 10
.line 144
	aload_0
	aload 10
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc "Label"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	iload_2
	iinc 2 1
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	ldc ":"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokespecial JasminVisitor/put(Lorg/apache/bcel/generic/InstructionHandle;Ljava/lang/String;)V
.line 145
	aload 9
	invokevirtual org/apache/bcel/generic/CodeExceptionGen/getHandlerPC()Lorg/apache/bcel/generic/InstructionHandle;
	astore 10
.line 146
	aload_0
	aload 10
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc "Label"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	iload_2
	iinc 2 1
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	ldc ":"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokespecial JasminVisitor/put(Lorg/apache/bcel/generic/InstructionHandle;Ljava/lang/String;)V
.line 138
	iinc 8 1
	goto Label9
Label8:
.line 149
	aload_3
	invokevirtual org/apache/bcel/generic/MethodGen/getLineNumbers()[Lorg/apache/bcel/generic/LineNumberGen;
	astore 8
.line 150
	iconst_0
	istore 9
Label11:
	iload 9
	aload 8
	arraylength
	if_icmpge Label10
.line 151
	aload 8
	iload 9
	aaload
	invokevirtual org/apache/bcel/generic/LineNumberGen/getInstruction()Lorg/apache/bcel/generic/InstructionHandle;
	astore 10
.line 152
	aload_0
	aload 10
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc ".line "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload 8
	iload 9
	aaload
	invokevirtual org/apache/bcel/generic/LineNumberGen/getSourceLine()I
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokespecial JasminVisitor/put(Lorg/apache/bcel/generic/InstructionHandle;Ljava/lang/String;)V
.line 150
	iinc 9 1
	goto Label11
Label10:
.line 157
	iconst_0
	istore 9
Label13:
	iload 9
	aload 6
	arraylength
	if_icmpge Label12
.line 158
	aload 6
	iload 9
	aaload
	astore 10
.line 159
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc ".var "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload 10
	invokevirtual org/apache/bcel/generic/LocalVariableGen/getIndex()I
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	ldc " is "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload 10
	invokevirtual org/apache/bcel/generic/LocalVariableGen/getName()Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	ldc " "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload 10
	invokevirtual org/apache/bcel/generic/LocalVariableGen/getType()Lorg/apache/bcel/generic/Type;
	invokevirtual org/apache/bcel/generic/Type/getSignature()Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	ldc " from "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_0
	aload 10
	invokevirtual org/apache/bcel/generic/LocalVariableGen/getStart()Lorg/apache/bcel/generic/InstructionHandle;
	invokespecial JasminVisitor/get(Lorg/apache/bcel/generic/InstructionHandle;)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	ldc " to "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_0
	aload 10
	invokevirtual org/apache/bcel/generic/LocalVariableGen/getEnd()Lorg/apache/bcel/generic/InstructionHandle;
	invokespecial JasminVisitor/get(Lorg/apache/bcel/generic/InstructionHandle;)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 157
	iinc 9 1
	goto Label13
Label12:
.line 165
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	ldc "\n"
	invokevirtual java/io/PrintWriter/print(Ljava/lang/String;)V
.line 167
	iconst_0
	istore 9
Label26:
	iload 9
	aload 5
	arraylength
	if_icmpge Label14
.line 168
	aload 5
	iload 9
	aaload
	astore 10
.line 169
	aload 10
	invokevirtual org/apache/bcel/generic/InstructionHandle/getInstruction()Lorg/apache/bcel/generic/Instruction;
	astore 11
.line 170
	aload_0
	getfield JasminVisitor.map Ljava/util/Hashtable;
	aload 10
	invokevirtual java/util/Hashtable/get(Ljava/lang/Object;)Ljava/lang/Object;
	checkcast java/lang/String
	astore 12
.line 172
	aload 12
	ifnull Label15
.line 173
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	aload 12
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
Label15:
.line 175
	aload 11
	instanceof org/apache/bcel/generic/BranchInstruction
	ifeq Label16
.line 176
	aload 11
	instanceof org/apache/bcel/generic/Select
	ifeq Label17
.line 177
	aload 11
	checkcast org/apache/bcel/generic/Select
	astore 13
.line 178
	aload 13
	invokevirtual org/apache/bcel/generic/Select/getMatchs()[I
	astore 14
.line 179
	aload 13
	invokevirtual org/apache/bcel/generic/Select/getTargets()[Lorg/apache/bcel/generic/InstructionHandle;
	astore 15
.line 181
	aload 13
	instanceof org/apache/bcel/generic/TABLESWITCH
	ifeq Label18
.line 182
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc "\ttableswitch "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload 14
	iconst_0
	iaload
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	ldc " "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload 14
	aload 14
	arraylength
	iconst_1
	isub
	iaload
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 185
	iconst_0
	istore 16
Label20:
	iload 16
	aload 15
	arraylength
	if_icmpge Label19
.line 186
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc "\t\t"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_0
	aload 15
	iload 16
	aaload
	invokespecial JasminVisitor/get(Lorg/apache/bcel/generic/InstructionHandle;)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 185
	iinc 16 1
	goto Label20
Label19:
.line 188
	goto Label21
Label18:
.line 189
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	ldc "\tlookupswitch "
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 191
	iconst_0
	istore 16
Label23:
	iload 16
	aload 15
	arraylength
	if_icmpge Label21
.line 192
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc "\t\t"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload 14
	iload 16
	iaload
	invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
	ldc " : "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_0
	aload 15
	iload 16
	aaload
	invokespecial JasminVisitor/get(Lorg/apache/bcel/generic/InstructionHandle;)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 191
	iinc 16 1
	goto Label23
Label21:
.line 195
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc "\t\tdefault: "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_0
	aload 13
	invokevirtual org/apache/bcel/generic/Select/getTarget()Lorg/apache/bcel/generic/InstructionHandle;
	invokespecial JasminVisitor/get(Lorg/apache/bcel/generic/InstructionHandle;)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 196
	goto Label24
Label17:
.line 197
	aload 11
	checkcast org/apache/bcel/generic/BranchInstruction
	astore 13
.line 198
	aload 13
	invokevirtual org/apache/bcel/generic/BranchInstruction/getTarget()Lorg/apache/bcel/generic/InstructionHandle;
	astore 10
.line 199
	aload_0
	aload 10
	invokespecial JasminVisitor/get(Lorg/apache/bcel/generic/InstructionHandle;)Ljava/lang/String;
	astore 12
.line 200
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc "\t"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	getstatic org.apache.bcel.Constants.OPCODE_NAMES [Ljava/lang/String;
	aload 13
	invokevirtual org/apache/bcel/generic/BranchInstruction/getOpcode()S
	aaload
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	ldc " "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload 12
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 202
	goto Label24
Label16:
.line 204
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc "\t"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload 11
	aload_0
	getfield JasminVisitor.cp Lorg/apache/bcel/generic/ConstantPoolGen;
	invokevirtual org/apache/bcel/generic/ConstantPoolGen/getConstantPool()Lorg/apache/bcel/classfile/ConstantPool;
	invokevirtual org/apache/bcel/generic/Instruction/toString(Lorg/apache/bcel/classfile/ConstantPool;)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
Label24:
.line 167
	iinc 9 1
	goto Label26
Label14:
.line 207
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	ldc "\n"
	invokevirtual java/io/PrintWriter/print(Ljava/lang/String;)V
.line 209
	iconst_0
	istore 9
Label30:
	iload 9
	aload 7
	arraylength
	if_icmpge Label27
.line 210
	aload 7
	iload 9
	aaload
	astore 10
.line 211
	aload 10
	invokevirtual org/apache/bcel/generic/CodeExceptionGen/getCatchType()Lorg/apache/bcel/generic/ObjectType;
	astore 11
.line 212
	aload 11
	ifnonnull Label28
	ldc "all"
	goto Label29
Label28:
	aload 11
	invokevirtual org/apache/bcel/generic/ObjectType/getClassName()Ljava/lang/String;
	bipush 46
	bipush 47
	invokevirtual java/lang/String/replace(CC)Ljava/lang/String;
Label29:
	astore 12
.line 215
	aload_0
	getfield JasminVisitor.out Ljava/io/PrintWriter;
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	ldc ".catch "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload 12
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	ldc " from "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_0
	aload 10
	invokevirtual org/apache/bcel/generic/CodeExceptionGen/getStartPC()Lorg/apache/bcel/generic/InstructionHandle;
	invokespecial JasminVisitor/get(Lorg/apache/bcel/generic/InstructionHandle;)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	ldc " to "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_0
	aload 10
	invokevirtual org/apache/bcel/generic/CodeExceptionGen/getEndPC()Lorg/apache/bcel/generic/InstructionHandle;
	invokespecial JasminVisitor/get(Lorg/apache/bcel/generic/InstructionHandle;)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	ldc " using "
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_0
	aload 10
	invokevirtual org/apache/bcel/generic/CodeExceptionGen/getHandlerPC()Lorg/apache/bcel/generic/InstructionHandle;
	invokespecial JasminVisitor/get(Lorg/apache/bcel/generic/InstructionHandle;)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/io/PrintWriter/println(Ljava/lang/String;)V
.line 209
	iinc 9 1
	goto Label30
Label27:
.line 220
	aload_0
	aload_1
	invokespecial JasminVisitor/printEndMethod(Lorg/apache/bcel/classfile/Attribute;)V
Label32:
.line 221
	return

.end method

.method private final get(Lorg/apache/bcel/generic/InstructionHandle;)Ljava/lang/String;
.limit stack 4
.limit locals 3
.var 0 is this LJasminVisitor; from Label0 to Label1
.var 1 is arg0 Lorg/apache/bcel/generic/InstructionHandle; from Label0 to Label1

Label0:
.line 225
	new java/util/StringTokenizer
	dup
	aload_0
	getfield JasminVisitor.map Ljava/util/Hashtable;
	aload_1
	invokevirtual java/util/Hashtable/get(Ljava/lang/Object;)Ljava/lang/Object;
	checkcast java/lang/String
	ldc "\n"
	invokespecial java/util/StringTokenizer/<init>(Ljava/lang/String;Ljava/lang/String;)V
	invokevirtual java/util/StringTokenizer/nextToken()Ljava/lang/String;
	astore_2
.line 226
	aload_2
	iconst_0
	aload_2
	invokevirtual java/lang/String/length()I
	iconst_1
	isub
	invokevirtual java/lang/String/substring(II)Ljava/lang/String;
Label1:
	areturn

.end method

.method private final put(Lorg/apache/bcel/generic/InstructionHandle;Ljava/lang/String;)V
.limit stack 4
.limit locals 4
.var 0 is this LJasminVisitor; from Label4 to Label1
.var 1 is arg0 Lorg/apache/bcel/generic/InstructionHandle; from Label4 to Label1
.var 2 is arg1 Ljava/lang/String; from Label4 to Label1

Label4:
.line 230
	aload_0
	getfield JasminVisitor.map Ljava/util/Hashtable;
	aload_1
	invokevirtual java/util/Hashtable/get(Ljava/lang/Object;)Ljava/lang/Object;
	checkcast java/lang/String
	astore_3
.line 232
	aload_3
	ifnonnull Label0
.line 233
	aload_0
	getfield JasminVisitor.map Ljava/util/Hashtable;
	aload_1
	aload_2
	invokevirtual java/util/Hashtable/put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	pop
	goto Label1
Label0:
.line 235
	aload_2
	ldc "Label"
	invokevirtual java/lang/String/startsWith(Ljava/lang/String;)Z
	ifne Label2
	aload_3
	aload_2
	invokevirtual java/lang/String/endsWith(Ljava/lang/String;)Z
	ifeq Label3
Label2:
.line 236
	return
Label3:
.line 238
	aload_0
	getfield JasminVisitor.map Ljava/util/Hashtable;
	aload_1
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	aload_3
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	ldc "\n"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload_2
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokevirtual java/util/Hashtable/put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	pop
Label1:
.line 240
	return

.end method

.method public static main([Ljava/lang/String;)V
.limit stack 4
.limit locals 9
.var 0 is arg0 [Ljava/lang/String; from Label8 to Label7

Label8:
.line 243
	aconst_null
	astore_1
.line 245
	new org/apache/bcel/util/ClassPath
	dup
	invokespecial org/apache/bcel/util/ClassPath/<init>()V
	astore_3
Label10:
.line 248
	aload_0
	arraylength
	ifne Label0
.line 249
	getstatic java.lang.System.err Ljava/io/PrintStream;
	ldc "disassemble: No input files specified"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
.line 250
	goto Label1
Label0:
.line 252
	iconst_0
	istore 4
Label6:
	iload 4
	aload_0
	arraylength
	if_icmpge Label1
.line 253
	aload_0
	iload 4
	aaload
	ldc ".class"
	invokevirtual java/lang/String/endsWith(Ljava/lang/String;)Z
	ifeq Label3
.line 254
	new org/apache/bcel/classfile/ClassParser
	dup
	aload_0
	iload 4
	aaload
	invokespecial org/apache/bcel/classfile/ClassParser/<init>(Ljava/lang/String;)V
	astore_1
	goto Label4
Label3:
.line 256
	aload_3
	aload_0
	iload 4
	aaload
	invokevirtual org/apache/bcel/util/ClassPath/getInputStream(Ljava/lang/String;)Ljava/io/InputStream;
	astore 5
.line 257
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	aload_0
	iload 4
	aaload
	bipush 46
	bipush 47
	invokevirtual java/lang/String/replace(CC)Ljava/lang/String;
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	ldc ".class"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	astore 6
.line 259
	new org/apache/bcel/classfile/ClassParser
	dup
	aload 5
	aload 6
	invokespecial org/apache/bcel/classfile/ClassParser/<init>(Ljava/io/InputStream;Ljava/lang/String;)V
	astore_1
Label4:
.line 262
	aload_1
	invokevirtual org/apache/bcel/classfile/ClassParser/parse()Lorg/apache/bcel/classfile/JavaClass;
	astore_2
.line 264
	aload_2
	invokevirtual org/apache/bcel/classfile/JavaClass/getClassName()Ljava/lang/String;
	astore 5
.line 265
	aload 5
	bipush 46
	invokevirtual java/lang/String/lastIndexOf(I)I
	istore 6
.line 266
	aload 5
	iconst_0
	iload 6
	iconst_1
	iadd
	invokevirtual java/lang/String/substring(II)Ljava/lang/String;
	bipush 46
	getstatic java.io.File.separatorChar C
	invokevirtual java/lang/String/replace(CC)Ljava/lang/String;
	astore 7
.line 267
	aload 5
	iload 6
	iconst_1
	iadd
	invokevirtual java/lang/String/substring(I)Ljava/lang/String;
	astore 5
.line 269
	aload 7
	ldc ""
	invokevirtual java/lang/String/equals(Ljava/lang/Object;)Z
	ifne Label5
.line 270
	new java/io/File
	dup
	aload 7
	invokespecial java/io/File/<init>(Ljava/lang/String;)V
	astore 8
.line 271
	aload 8
	invokevirtual java/io/File/mkdirs()Z
	pop
Label5:
.line 274
	new java/io/FileOutputStream
	dup
	new java/lang/StringBuilder
	dup
	invokespecial java/lang/StringBuilder/<init>()V
	aload 7
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	aload 5
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	ldc ".j"
	invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
	invokespecial java/io/FileOutputStream/<init>(Ljava/lang/String;)V
	astore 8
.line 275
	new JasminVisitor
	dup
	aload_2
	aload 8
	invokespecial JasminVisitor/<init>(Lorg/apache/bcel/classfile/JavaClass;Ljava/io/OutputStream;)V
	invokevirtual JasminVisitor/disassemble()V
.line 252
	iinc 4 1
Label11:
	goto Label6
Label1:
.line 280
	goto Label7
Label12:
.line 278
	astore 4
.line 279
	aload 4
	invokevirtual java/lang/Exception/printStackTrace()V
Label7:
.line 281
	return

.catch java/lang/Exception from Label10 to Label11 using Label12
.end method
