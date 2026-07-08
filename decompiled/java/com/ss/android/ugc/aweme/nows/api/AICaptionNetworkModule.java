package com.ss.android.ugc.aweme.nows.api;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class AICaptionNetworkModule {
    public static final C01GW<AICaptionApi> LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(289));
    public static final C01GW<String> LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(288));

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule.AICaptionResponse> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C859450Xnb
            if (r0 == 0) goto L21
            r7 = r10
            X.0Xnb r7 = (X.C859450Xnb) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L33
            if (r0 != r4) goto L2b
            goto L27
        L21:
            X.0Xnb r7 = new X.0Xnb
            r7.<init>(r8, r10)
            goto L12
        L27:
            X.C155000ia.LIZIZ(r1)     // Catch: java.io.IOException -> L53
            return r1
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.retrofit2.mime.TypedFile r3 = new com.bytedance.retrofit2.mime.TypedFile
            X.0VSJ r1 = new X.0VSJ
            r1.<init>(r9)
            java.lang.String r0 = "image/*"
            r3.<init>(r0, r1)
            X.0Xna r2 = new X.0Xna     // Catch: java.io.IOException -> L53
            r2.<init>(r3, r5)     // Catch: java.io.IOException -> L53
            r7.LLILLL = r4     // Catch: java.io.IOException -> L53
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r1 = X.C099A.LIZJ(r0, r2, r7)     // Catch: java.io.IOException -> L53
            if (r1 != r6) goto L52
            return r6
        L52:
            return r1
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = "AICaption: submitImage IOException"
            X.C201955140j.LJIIZILJ(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List r8, java.lang.String r9, X.InterfaceC1364105Vn r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C859460Xnc
            if (r0 == 0) goto L23
            r6 = r10
            X.0Xnc r6 = (X.C859460Xnc) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r2 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r6.LLILLL
            java.lang.String r4 = "MemeAudio: e:"
            r0 = 1
            r3 = 0
            if (r1 == 0) goto L35
            if (r1 != r0) goto L2d
            goto L29
        L23:
            X.0Xnc r6 = new X.0Xnc
            r6.<init>(r7, r10)
            goto L12
        L29:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.IllegalArgumentException -> L49 java.io.IOException -> L5f
            return r2
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.C155000ia.LIZIZ(r2)
            X.0XnZ r2 = new X.0XnZ     // Catch: java.lang.IllegalArgumentException -> L49 java.io.IOException -> L5f
            r2.<init>(r9, r8, r3)     // Catch: java.lang.IllegalArgumentException -> L49 java.io.IOException -> L5f
            r6.LLILLL = r0     // Catch: java.lang.IllegalArgumentException -> L49 java.io.IOException -> L5f
            r0 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r2 = X.C099A.LIZJ(r0, r2, r6)     // Catch: java.lang.IllegalArgumentException -> L49 java.io.IOException -> L5f
            if (r2 != r5) goto L48
            return r5
        L48:
            return r2
        L49:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            X.C201955140j.LJIIZILJ(r0)
            return r3
        L5f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            X.C201955140j.LJIIZILJ(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule.LIZIZ(java.util.List, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX INFO: loaded from: classes30.dex */
    public static final class AICaptionResponse {

        @C09CT("descriptions")
        public final List<String> descriptions;

        @C09CT("log_pb")
        public LogPbBean logPb;

        @C09CT("status_code")
        public final int statusCode;

        @C09CT("status_msg")
        public final String statusMsg;

        @C09CT("generated_text_list")
        public final List<String> textList;

        public AICaptionResponse(int i, String str, List<String> list, List<String> list2, LogPbBean logPbBean) {
            this.statusCode = i;
            this.statusMsg = str;
            this.textList = list;
            this.descriptions = list2;
            this.logPb = logPbBean;
        }
    }
}
