package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiself;

import X.C1BNE;
import X.C2252321DDq;
import X.C563290M7j;
import X.InterfaceC550750Lir;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumAiSelfTaskViewModel extends ViewModel {
    public final C2252321DDq LL;
    public final C2252321DDq LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final C2252321DDq LLILZ;
    public final C2252321DDq LLILZIL;
    public final C2252321DDq LLILZLL;

    public static InterfaceC550750Lir wQ2() {
        AITheaterProfileService.LIZ.getClass();
        AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
        if (aITheaterProfileServiceLIZ != null) {
            return aITheaterProfileServiceLIZ.g9();
        }
        return null;
    }

    public AlbumAiSelfTaskViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(null);
        this.LLILLL = c2252321DDqLIZ2;
        this.LLILZ = c2252321DDqLIZ2;
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(Boolean.FALSE);
        this.LLILZIL = c2252321DDqLIZ3;
        this.LLILZLL = c2252321DDqLIZ3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(X.InterfaceC1364105Vn<? super X.C528850Kod> r14) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiself.AlbumAiSelfTaskViewModel.vQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C554350Lof
            if (r0 == 0) goto Lb2
            r3 = r12
            X.0Lof r3 = (X.C554350Lof) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb2
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r5 = r3.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r6 = 0
            r2 = 1
            r10 = 0
            r1 = 2
            if (r0 == 0) goto L5d
            if (r0 == r2) goto L92
            if (r0 != r1) goto Lb9
            X.C155000ia.LIZIZ(r5)
        L27:
            X.0Kod r5 = (X.C528850Kod) r5
        L29:
            X.1DDq r0 = r11.LLILLL
            r0.setValue(r5)
            if (r5 == 0) goto L57
            X.03IT r1 = new X.03IT
            java.lang.String r0 = r5.LIZIZ
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.<init>(r0)
            X.0kl3 r3 = X.C1331660kl2.LJIIJ(r1)
            r0 = 150(0x96, float:2.1E-43)
            r3.LJIIIIZZ = r0
            r3.LJIIIZ = r0
            r3.LJJIL = r2
            r3.LJJJJLL = r6
            r3.LJJJJZ = r6
            X.0Mq7 r1 = new X.0Mq7
            r0 = 0
            r1.<init>(r11, r0)
            r3.LJJII(r1)
        L54:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L57:
            X.1DDq r0 = r11.LL
            r0.setValue(r10)
            goto L54
        L5d:
            X.C155000ia.LIZIZ(r5)
            X.0M7j r0 = com.ss.android.ugc.aweme.theater.service.AITheaterProfileService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.theater.service.AITheaterProfileService r0 = X.C563290M7j.LIZ()
            if (r0 == 0) goto L80
            X.0LbO r0 = r0.LIZIZ()
            if (r0 == 0) goto L80
            boolean r0 = r0.isFeatureEnabled()
            if (r0 != r2) goto L80
        L77:
            r3.LLILLL = r2
            java.lang.Object r5 = r11.vQ2(r3)
            if (r5 != r4) goto L95
            return r4
        L80:
            X.0Le5 r0 = com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService r0 = X.C547790Le5.LIZ()
            if (r0 == 0) goto L98
            boolean r0 = r0.isFeatureEnabled()
            if (r0 != r2) goto L98
            goto L77
        L92:
            X.C155000ia.LIZIZ(r5)
        L95:
            X.0Kod r5 = (X.C528850Kod) r5
            goto L29
        L98:
            java.lang.Class<com.ss.android.ugc.aweme.aime.IAIMEServices> r5 = com.ss.android.ugc.aweme.aime.IAIMEServices.class
            r9 = 14
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.aime.IAIMEServices r0 = (com.ss.android.ugc.aweme.aime.IAIMEServices) r0
            if (r0 == 0) goto Laf
            r3.LLILLL = r1
            java.lang.Object r5 = r0.LJI(r3)
            if (r5 != r4) goto L27
            return r4
        Laf:
            r5 = r10
            goto L29
        Lb2:
            X.0Lof r3 = new X.0Lof
            r3.<init>(r11, r12)
            goto L12
        Lb9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiself.AlbumAiSelfTaskViewModel.xQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C554360Log
            if (r0 == 0) goto L98
            r2 = r12
            X.0Log r2 = (X.C554360Log) r2
            int r3 = r2.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L98
            int r3 = r3 - r1
            r2.LLILLL = r3
        L12:
            java.lang.Object r4 = r2.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r2.LLILLL
            r1 = 1
            r6 = 0
            if (r0 == 0) goto L39
            if (r0 != r1) goto L9f
            X.C155000ia.LIZIZ(r4)
        L23:
            X.0Kyw r4 = (X.C535240Kyw) r4
        L25:
            X.1DDq r2 = r11.LLILZIL
            if (r4 == 0) goto L37
            boolean r0 = r4.LIZ
            if (r0 != r1) goto L37
        L2d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.setValue(r0)
        L34:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L37:
            r1 = 0
            goto L2d
        L39:
            X.C155000ia.LIZIZ(r4)
            X.0M7j r0 = com.ss.android.ugc.aweme.theater.service.AITheaterProfileService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.theater.service.AITheaterProfileService r0 = X.C563290M7j.LIZ()
            if (r0 == 0) goto L7e
            X.0LbO r0 = r0.LIZIZ()
            if (r0 == 0) goto L7e
            boolean r0 = r0.isFeatureEnabled()
            if (r0 != r1) goto L7e
            r0 = 1
        L54:
            r4 = 0
            if (r0 != 0) goto L68
            X.0Le5 r0 = com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService r0 = X.C547790Le5.LIZ()
            if (r0 == 0) goto L80
            boolean r0 = r0.isFeatureEnabled()
            if (r0 != r1) goto L80
        L68:
            X.1DDq r1 = r11.LLILZIL
            X.0Lir r0 = wQ2()
            if (r0 == 0) goto L74
            X.0LgP r4 = r0.LIZLLL()
        L74:
            boolean r0 = r4 instanceof X.C316340Cae
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.setValue(r0)
            goto L34
        L7e:
            r0 = 0
            goto L54
        L80:
            java.lang.Class<com.ss.android.ugc.aweme.aime.IAIMEServices> r5 = com.ss.android.ugc.aweme.aime.IAIMEServices.class
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.aime.IAIMEServices r0 = (com.ss.android.ugc.aweme.aime.IAIMEServices) r0
            if (r0 == 0) goto L25
            r2.LLILLL = r1
            java.lang.Object r4 = r0.LJIIJ(r6, r1, r2)
            if (r4 != r3) goto L23
            return r3
        L98:
            X.0Log r2 = new X.0Log
            r2.<init>(r11, r12)
            goto L12
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiself.AlbumAiSelfTaskViewModel.yQ2(X.05Vn):java.lang.Object");
    }
}
