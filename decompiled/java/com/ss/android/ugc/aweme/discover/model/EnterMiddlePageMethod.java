package com.ss.android.ugc.aweme.discover.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class EnterMiddlePageMethod {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ EnterMiddlePageMethod[] $VALUES;
    public final int value;
    public static final EnterMiddlePageMethod SYSTEM_BACK_METHOD = new EnterMiddlePageMethod("SYSTEM_BACK_METHOD", 0, 0);
    public static final EnterMiddlePageMethod PRESS_LEFT_BACK = new EnterMiddlePageMethod("PRESS_LEFT_BACK", 1, 1);
    public static final EnterMiddlePageMethod PRESS_CLEAR = new EnterMiddlePageMethod("PRESS_CLEAR", 2, 2);
    public static final EnterMiddlePageMethod OTHERS = new EnterMiddlePageMethod("OTHERS", 3, -1);

    public static final /* synthetic */ EnterMiddlePageMethod[] $values() {
        return new EnterMiddlePageMethod[]{SYSTEM_BACK_METHOD, PRESS_LEFT_BACK, PRESS_CLEAR, OTHERS};
    }

    public static InterfaceC2044707zh<EnterMiddlePageMethod> getEntries() {
        return $ENTRIES;
    }

    static {
        EnterMiddlePageMethod[] enterMiddlePageMethodArr$values = $values();
        $VALUES = enterMiddlePageMethodArr$values;
        $ENTRIES = new C2254308sP(enterMiddlePageMethodArr$values);
    }

    public static EnterMiddlePageMethod[] values() {
        return (EnterMiddlePageMethod[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static EnterMiddlePageMethod valueOf(String str) {
        return (EnterMiddlePageMethod) C08FF.LIZ(EnterMiddlePageMethod.class, str);
    }

    public EnterMiddlePageMethod(String str, int i, int i2) {
        this.value = i2;
    }
}
