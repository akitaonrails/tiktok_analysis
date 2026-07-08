package com.ss.android.ugc.gamora.recorder.sticker.aigc;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class Error {

    @C09CT("code")
    public final Integer code;

    @C09CT("msg")
    public final String msg;

    public Error() {
        this(null, null);
    }

    public Error(Integer num, String str) {
        this.code = num;
        this.msg = str;
    }
}
