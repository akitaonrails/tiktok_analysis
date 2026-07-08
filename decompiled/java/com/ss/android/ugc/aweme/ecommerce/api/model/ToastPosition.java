package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ToastPosition {

    @C09CT("1")
    public static final ToastPosition CENTER;
    public static final /* synthetic */ ToastPosition[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final ToastPosition TOP;
    public final int LL;

    public static InterfaceC2044707zh<ToastPosition> getEntries() {
        return LLILLL;
    }

    static {
        ToastPosition toastPosition = new ToastPosition("TOP", 0, 0);
        TOP = toastPosition;
        ToastPosition toastPosition2 = new ToastPosition("CENTER", 1, 1);
        CENTER = toastPosition2;
        ToastPosition[] toastPositionArr = {toastPosition, toastPosition2};
        LLILLJJLI = toastPositionArr;
        LLILLL = new C2254308sP(toastPositionArr);
    }

    public static ToastPosition[] values() {
        return (ToastPosition[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static ToastPosition valueOf(String str) {
        return (ToastPosition) C08FF.LIZ(ToastPosition.class, str);
    }

    public ToastPosition(String str, int i, int i2) {
        this.LL = i2;
    }
}
