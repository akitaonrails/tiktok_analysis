package com.ss.android.ugc.aweme.music.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TT2DspFlowError {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ TT2DspFlowError[] $VALUES;
    public final String msg;
    public static final TT2DspFlowError ERROR_UNKNOWN = new TT2DspFlowError("ERROR_UNKNOWN", 0, null);
    public static final TT2DspFlowError AUTH_USER_CLICK_CANCEL = new TT2DspFlowError("AUTH_USER_CLICK_CANCEL", 1, null);
    public static final TT2DspFlowError AUTH_USER_DEVICE_BACK = new TT2DspFlowError("AUTH_USER_DEVICE_BACK", 2, null);
    public static final TT2DspFlowError AUTH_CODE_FOR_TOKEN = new TT2DspFlowError("AUTH_CODE_FOR_TOKEN", 3, null);
    public static final TT2DspFlowError ADD_SONG = new TT2DspFlowError("ADD_SONG", 4, null);
    public static final TT2DspFlowError ALBUM_PRE_SAVE = new TT2DspFlowError("ALBUM_PRE_SAVE", 5, null);

    public static final /* synthetic */ TT2DspFlowError[] $values() {
        return new TT2DspFlowError[]{ERROR_UNKNOWN, AUTH_USER_CLICK_CANCEL, AUTH_USER_DEVICE_BACK, AUTH_CODE_FOR_TOKEN, ADD_SONG, ALBUM_PRE_SAVE};
    }

    public static InterfaceC2044707zh<TT2DspFlowError> getEntries() {
        return $ENTRIES;
    }

    static {
        TT2DspFlowError[] tT2DspFlowErrorArr$values = $values();
        $VALUES = tT2DspFlowErrorArr$values;
        $ENTRIES = new C2254308sP(tT2DspFlowErrorArr$values);
    }

    public static TT2DspFlowError[] values() {
        return (TT2DspFlowError[]) $VALUES.clone();
    }

    public final String getMsg() {
        return this.msg;
    }

    public static TT2DspFlowError valueOf(String str) {
        return (TT2DspFlowError) C08FF.LIZ(TT2DspFlowError.class, str);
    }

    public TT2DspFlowError(String str, int i, String str2) {
        this.msg = str2;
    }
}
