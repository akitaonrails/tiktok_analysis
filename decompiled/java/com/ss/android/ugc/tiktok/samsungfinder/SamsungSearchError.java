package com.ss.android.ugc.tiktok.samsungfinder;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class SamsungSearchError implements Serializable {

    @C09CT("code")
    public final String code;

    @C09CT("message")
    public final String message;

    public SamsungSearchError(String str, String str2) {
        this.message = str;
        this.code = str2;
    }
}
