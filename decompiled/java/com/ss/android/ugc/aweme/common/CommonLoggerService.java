package com.ss.android.ugc.aweme.common;

import X.C1720106oR;
import X.C2187451AjH;
import com.ss.android.ugc.aweme.api.ICommonLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class CommonLoggerService implements ICommonLogger {
    @Override // com.ss.android.ugc.aweme.api.ICommonLogger
    public final void d() {
        int i = C2187451AjH.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.api.ICommonLogger
    public final void LIZIZ(Throwable th) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZLLL(th);
    }

    @Override // com.ss.android.ugc.aweme.api.ICommonLogger
    public final void e(String str, String str2) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.api.ICommonLogger
    public final void i(String str, String str2) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.api.ICommonLogger
    public final void e(String str, Throwable th) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZJ(str, th);
    }

    @Override // com.ss.android.ugc.aweme.api.ICommonLogger
    public final void e(String str, String str2, Throwable th) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZIZ(str, str2, th);
    }
}
