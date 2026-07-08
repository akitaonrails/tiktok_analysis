package com.bytedance.geckox.settings.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class Operator {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ Operator[] $VALUES;

    @C09CT("eq")
    public static final Operator EQ = new Operator("EQ", 0);

    @C09CT("ct")
    public static final Operator CT = new Operator("CT", 1);

    @C09CT("gt")
    public static final Operator GT = new Operator("GT", 2);

    @C09CT("ge")
    public static final Operator GE = new Operator("GE", 3);

    @C09CT("lt")
    public static final Operator LT = new Operator("LT", 4);

    @C09CT("le")
    public static final Operator LE = new Operator("LE", 5);

    @C09CT("ne")
    public static final Operator NE = new Operator("NE", 6);

    @C09CT("in")
    public static final Operator IN = new Operator("IN", 7);

    @C09CT("ni")
    public static final Operator NI = new Operator("NI", 8);

    public static final /* synthetic */ Operator[] $values() {
        return new Operator[]{EQ, CT, GT, GE, LT, LE, NE, IN, NI};
    }

    public static InterfaceC2044707zh<Operator> getEntries() {
        return $ENTRIES;
    }

    static {
        Operator[] operatorArr$values = $values();
        $VALUES = operatorArr$values;
        $ENTRIES = new C2254308sP(operatorArr$values);
    }

    public static Operator[] values() {
        return (Operator[]) $VALUES.clone();
    }

    public static Operator valueOf(String str) {
        return (Operator) C08FF.LIZ(Operator.class, str);
    }

    public Operator(String str, int i) {
    }
}
