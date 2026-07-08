package com.ss.android.ugc.aweme.account.otl;

import X.C09CT;
import X.C824470WVx;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes14.dex */
public final class LoginSyncLocalServer {
    public static volatile C824470WVx LJI;
    public static volatile Uri LJII;
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public static final class ErrorResponse {

        @C09CT("error_code")
        public final String errorCode;

        public ErrorResponse() {
            this("UNKNOWN");
        }

        public ErrorResponse(String str) {
            this.errorCode = str;
        }
    }

    public static final class SuccessResponse {

        @C09CT("nonce")
        public final String nonce;

        @C09CT("token")
        public final String token;

        public SuccessResponse() {
            this("", "");
        }

        public SuccessResponse(String str, String str2) {
            this.nonce = str;
            this.token = str2;
        }
    }

    public LoginSyncLocalServer(Context context, String str, String str2, String str3, String str4, String str5) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
    }
}
