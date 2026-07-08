package com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.download;

import X.C19EG;
import com.ss.android.ugc.aweme.photomv.IPhotoMvResDownloadService;

/* JADX INFO: loaded from: classes9.dex */
public final class PhotoMvResDownloadService implements IPhotoMvResDownloadService {
    public C19EG LIZ;

    @Override // com.ss.android.ugc.aweme.photomv.IPhotoMvResDownloadService
    public final void reset() {
        this.LIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.photomv.IPhotoMvResDownloadService
    public final void LIZJ(C19EG c19eg) {
        this.LIZ = c19eg;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[PHI: r0
      0x005b: PHI (r0v10 int) = (r0v9 int), (r0v11 int) binds: [B:12:0x0045, B:14:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.photomv.IPhotoMvResDownloadService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.creative.model.CreativeModel r16, java.util.List<java.lang.String> r17, int r18, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.effectmanager.effect.model.Effect, kotlin.Unit> r19, kotlin.jvm.functions.Function0<kotlin.Unit> r20) {
        /*
            r15 = this;
            X.19EG r3 = r15.LIZ
            if (r3 == 0) goto L5a
            X.0Me9 r4 = new X.0Me9
            r2 = 0
            r0 = 6
            r1 = 0
            r4.<init>(r3, r2, r1, r0)
            X.0Mdk r11 = new X.0Mdk
            r11.<init>()
            boolean r0 = X.C296010Bix.LIZ()
            if (r0 != 0) goto L1d
            boolean r0 = X.C295930Bip.LIZ()
            if (r0 == 0) goto L27
        L1d:
            X.01GW r0 = X.C2506409ry.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r11.LJIIIIZZ = r0
        L27:
            java.lang.String r5 = "slideshoweffect"
            X.0Mdh r6 = new X.0Mdh
            r0 = r20
            r2 = r19
            r7 = r17
            r3 = r16
            r6.<init>(r7, r3, r2, r0)
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r0 = r3.creativeInfo
            java.lang.String r8 = r0.getCreationId()
            r9 = 0
            r12 = 1
            X.0Mdp r14 = new X.0Mdp
            r2 = r18
            if (r2 == 0) goto L4a
            r0 = 1
            if (r2 == r12) goto L5b
            r0 = 2
            if (r2 == r0) goto L5b
        L4a:
            r14.<init>(r1)
            X.0XED r0 = X.C526890KlT.LIZIZ
            java.util.Map r0 = X.C0XED.LJ(r0)
            r14.LIZIZ = r0
            r10 = r9
            r13 = r9
            r4.LIZJ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L5a:
            return
        L5b:
            r1 = r0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.download.PhotoMvResDownloadService.LIZLLL(com.ss.android.ugc.aweme.creative.model.CreativeModel, java.util.List, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void");
    }
}
