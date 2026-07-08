package com.ss.android.ugc.aweme.prop.presenter;

import android.content.Intent;

/* JADX INFO: loaded from: classes22.dex */
public final class StickerMobProvider implements IStickerMobAbility {
    public final Intent LL;

    public StickerMobProvider(Intent intent) {
        this.LL = intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r4 = this;
            android.content.Intent r1 = r4.LL
            java.lang.String r3 = ""
            if (r1 == 0) goto L14
            java.lang.String r0 = "followup_square_rec_type"
            java.lang.String r2 = r1.getStringExtra(r0)     // Catch: java.lang.Exception -> Ld
            goto L12
        Ld:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r2 = 0
        L12:
            if (r2 != 0) goto L15
        L14:
            r2 = r3
        L15:
            int r0 = r2.length()
            r1 = 1
            if (r0 != 0) goto L3d
            r0 = 1
        L1d:
            if (r0 == 0) goto L3f
            if (r5 == 0) goto L3b
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isMDPSquareType(r5)
            if (r0 != r1) goto L3b
            r0 = 1
        L28:
            if (r0 == 0) goto L3f
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.music.service.IMusicDetailService> r0 = com.ss.android.ugc.aweme.music.service.IMusicDetailService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.music.service.IMusicDetailService r0 = (com.ss.android.ugc.aweme.music.service.IMusicDetailService) r0
            java.lang.String r3 = r0.LJI(r5)
            return r3
        L3b:
            r0 = 0
            goto L28
        L3d:
            r0 = 0
            goto L1d
        L3f:
            if (r5 == 0) goto L5a
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isMDPSquareType(r5)
            if (r0 != r1) goto L5a
            r0 = 1
        L48:
            if (r0 != 0) goto L5c
            android.content.Intent r0 = r4.LL
            java.lang.String r0 = com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel.curSquareActionPosition(r5, r0)
            int r0 = r0.length()
            if (r0 == 0) goto L57
            r1 = 0
        L57:
            if (r1 == 0) goto L5c
            return r3
        L5a:
            r0 = 0
            goto L48
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.presenter.StickerMobProvider.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(android.content.Context r6, com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            r5 = this;
            android.content.Intent r2 = r5.LL
            r4 = 0
            java.lang.String r1 = ""
            if (r2 == 0) goto L15
            java.lang.String r0 = "followup_square_rec_reason"
            java.lang.String r3 = r2.getStringExtra(r0)     // Catch: java.lang.Exception -> Le
            goto L13
        Le:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r3 = r4
        L13:
            if (r3 != 0) goto L16
        L15:
            r3 = r1
        L16:
            int r0 = r3.length()
            r2 = 1
            if (r0 != 0) goto L4a
            r0 = 1
        L1e:
            if (r0 == 0) goto L4c
            if (r7 == 0) goto L48
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isMDPSquareType(r7)
            if (r0 != r2) goto L48
            r0 = 1
        L29:
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.music.service.IMusicDetailService> r0 = com.ss.android.ugc.aweme.music.service.IMusicDetailService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.music.service.IMusicDetailService r0 = (com.ss.android.ugc.aweme.music.service.IMusicDetailService) r0
            if (r7 == 0) goto L3d
            com.ss.android.ugc.aweme.music.model.Music r4 = r7.getMusic()
        L3d:
            kotlin.Pair r0 = r0.LJIIIIZZ(r6, r4)
            java.lang.Object r1 = r0.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L48:
            r0 = 0
            goto L29
        L4a:
            r0 = 0
            goto L1e
        L4c:
            if (r7 == 0) goto L67
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isMDPSquareType(r7)
            if (r0 != r2) goto L67
            r0 = 1
        L55:
            if (r0 != 0) goto L69
            android.content.Intent r0 = r5.LL
            java.lang.String r0 = com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel.curSquareActionPosition(r7, r0)
            int r0 = r0.length()
            if (r0 == 0) goto L64
            r2 = 0
        L64:
            if (r2 == 0) goto L69
            return r1
        L67:
            r0 = 0
            goto L55
        L69:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.presenter.StickerMobProvider.LIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }
}
