package com.ss.android.ugc.aweme.localservice.optimistic;

import X.C0O35;
import X.C0O38;
import X.C0OA0;
import X.C1323820kYO;
import X.C1548820qPI;
import X.C397901gf;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.service.optimistic.IVideoLikeService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class VideoLikeService extends C0O38<C0OA0> implements IVideoLikeService {
    public final String LIZLLL = "video_like";

    @Override // X.C0O38
    public final boolean LJ() {
        return false;
    }

    @Override // X.C0O38
    public final String LJFF() {
        return this.LIZLLL;
    }

    @Override // X.C0O38
    public final C0O35 LJII(C0O35 c0o35) {
        C0OA0 c0oa0 = (C0OA0) c0o35;
        return new C0OA0(!c0oa0.LIZ, c0oa0.LIZIZ, c0oa0.LIZJ);
    }

    public static void LJIIJ(Aweme aweme, int i) {
        Aweme awemeLLILZ = null;
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if (iAwemeService != null) {
            iAwemeService.yr(i, aweme.getAid());
        }
        AwemeStatistics statistics = null;
        if (iAwemeService != null) {
            awemeLLILZ = iAwemeService.LLILZ(aweme.getAid());
        }
        aweme.setUserDigg(i);
        if (awemeLLILZ != aweme) {
            if (awemeLLILZ != null) {
                statistics = awemeLLILZ.getStatistics();
            }
            if (statistics != aweme.getStatistics()) {
                AwemeStatistics statistics2 = aweme.getStatistics();
                if (i == 0) {
                    if (statistics2 != null) {
                        statistics2.setDiggCount(statistics2.getDiggCount() - 1);
                    }
                } else if (statistics2 != null) {
                    statistics2.setDiggCount(statistics2.getDiggCount() + 1);
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("awemeId", aweme.getAid());
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
            C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), "likeStatusChange"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.util.HashMap<java.lang.String, java.lang.String> r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.base.api.BaseResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0OA7
            if (r0 == 0) goto L4d
            r5 = r8
            X.0OA7 r5 = (X.C0OA7) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L53
            X.C155000ia.LIZIZ(r4)
        L22:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "end like request, response: "
            r1.append(r0)
            r1.append(r4)
            X.C2188811AlT.LIZIZ(r1)
            return r4
        L32:
            X.C155000ia.LIZIZ(r4)
            X.0O9r r0 = com.ss.android.ugc.aweme.localservice.optimistic.base.NetOptimisticApi.LIZ
            r0.getClass()
            java.lang.String r1 = com.ss.android.ugc.aweme.app.api.Api.LIZ
            java.lang.Class<com.ss.android.ugc.aweme.localservice.optimistic.base.NetOptimisticApi> r0 = com.ss.android.ugc.aweme.localservice.optimistic.base.NetOptimisticApi.class
            java.lang.Object r0 = X.C09S2.LIZJ(r0, r1)
            com.ss.android.ugc.aweme.localservice.optimistic.base.NetOptimisticApi r0 = (com.ss.android.ugc.aweme.localservice.optimistic.base.NetOptimisticApi) r0
            r5.LLILLL = r2
            java.lang.Object r4 = r0.diggAweme(r7, r5)
            if (r4 != r3) goto L22
            return r3
        L4d:
            X.0OA7 r5 = new X.0OA7
            r5.<init>(r6, r8)
            goto L12
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.localservice.optimistic.VideoLikeService.LJIIIZ(java.util.HashMap, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
    @Override // com.ss.android.ugc.aweme.localservice.service.optimistic.IVideoLikeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(androidx.fragment.app.Fragment r14, com.ss.android.ugc.aweme.feed.model.Aweme r15, java.util.List r16, kotlin.jvm.internal.AwS447S0200000_11 r17, kotlin.jvm.internal.AwS479S0200000_11 r18) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.localservice.optimistic.VideoLikeService.LIZ(androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.model.Aweme, java.util.List, kotlin.jvm.internal.AwS447S0200000_11, kotlin.jvm.internal.AwS479S0200000_11):void");
    }
}
