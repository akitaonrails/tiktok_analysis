package com.ss.android.ugc.aweme.cubes.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class GoogleCubesVideosError implements Serializable {

    @C09CT("code")
    public final String code;

    @C09CT("message")
    public final String message;

    public GoogleCubesVideosError(String str, String str2) {
        this.message = str;
        this.code = str2;
    }
}
