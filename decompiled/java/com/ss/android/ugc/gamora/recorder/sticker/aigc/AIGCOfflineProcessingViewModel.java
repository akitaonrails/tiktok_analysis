package com.ss.android.ugc.gamora.recorder.sticker.aigc;

import X.AnonymousClass0950;
import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C095G;
import X.C099R;
import X.C09AE;
import X.C09IC;
import X.C09IR;
import X.C0LC0;
import X.C0LC1;
import X.C0LY0;
import X.C0LY2;
import X.C0LY3;
import X.C0LY8;
import X.C0LYM;
import X.C0LYS;
import X.C0LZB;
import X.C0LZT;
import X.C0MGL;
import X.C0PEM;
import X.C1BNE;
import X.C1DEK;
import X.C1DEV;
import X.C2188811AlT;
import X.C2191201ApK;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C426001lC;
import X.C543010LRj;
import X.C544490LXb;
import X.C544550LXh;
import X.C544560LXi;
import X.C544670LXt;
import X.C544700LXw;
import X.C544710LXx;
import X.C544820LYi;
import X.C545090LZj;
import X.C861640Xr8;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.AigcArchSeparatePollingTaskFromServerTaskExperiment;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCOfflineProcessingViewModel extends ViewModel {
    public static final /* synthetic */ int LLJJJIL = 0;
    public final C0LZB LL;
    public final C426001lC LLILLJJLI;
    public final C0LY2 LLILLL;
    public final C0MGL LLILZ;
    public AnonymousClass0956 LLILZIL;
    public AnonymousClass0956 LLILZLL;
    public AnonymousClass0956 LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public AnonymousClass0956 LLJ;
    public AnonymousClass0956 LLJI;
    public int LLJIJIL;
    public final C545090LZj LLJILJIL = C545090LZj.LIZ;
    public final C1DEK LLJILJILJ;
    public final C2252321DDq LLJILLL;
    public final C2252331DDr LLJJ;
    public final C2252331DDr LLJJI;
    public long LLJJIII;
    public final C1DEV LLJJIJI;
    public final AnonymousClass0950 LLJJIJIIJIL;
    public final AnonymousClass0951 LLJJIJIL;
    public final InterfaceC346201Wa<C0LYS> LLJJJ;

    public final void EQ2() {
        this.LLJIJIL = 0;
        C2252321DDq c2252321DDq = this.LLJILLL;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), new C0LY8(0))) {
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLILZLL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09563 = this.LLJI;
        if (anonymousClass09563 != null) {
            anonymousClass09563.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09564 = this.LLIZ;
        if (anonymousClass09564 != null) {
            anonymousClass09564.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09565 = this.LLIZLLLIL;
        if (anonymousClass09565 != null) {
            anonymousClass09565.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09566 = this.LLJ;
        if (anonymousClass09566 != null) {
            anonymousClass09566.LIZIZ(null);
        }
        this.LLILLJJLI.LIZIZ();
        this.LLILLL.LIZIZ();
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLJI = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJJIII = 0L;
        C0LC0.LIZ("AIGCOfflineProcessingViewModel", "resetInternalState");
    }

    public final void M10() {
        String str = ((C0LY8) this.LLJILLL.getValue()).LIZ;
        if (str != null) {
            this.LLJILJIL.getClass();
            C23250099c.LIZLLL(C545090LZj.LIZLLL, null, null, new C0LZT(str, null), 3);
        }
        EQ2();
    }

    public final void vQ2() {
        wQ2(this.LLIZ);
        this.LLIZ = null;
        wQ2(this.LLIZLLLIL);
        this.LLIZLLLIL = null;
        wQ2(this.LLJ);
        this.LLJ = null;
    }

    public final void GQ2() {
        if (AigcArchSeparatePollingTaskFromServerTaskExperiment.isEnabled()) {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("aigc_offline_processing_background_polling_optimization_killswitch", false)) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ())), null, null, new C544670LXt(this, null), 3);
                return;
            }
            String str = ((C0LY8) this.LLJJIJIL.getValue()).LJIIL;
            if (!Intrinsics.LJFF(str, "PROGRESS") && !Intrinsics.LJFF(str, "DOWNLOAD") && !Intrinsics.LJFF(str, "POST_PROCESSING")) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C544490LXb(this, null), 3);
            } else {
                this.LLJILJIL.getClass();
                C545090LZj.LJIIJJI();
            }
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLJILJILJ.LJIIJJI(null);
    }

    public static void wQ2(C09AE c09ae) {
        if (c09ae != null && c09ae.isActive()) {
            c09ae.LIZIZ(null);
        }
    }

    public final void AQ2(C0LYM c0lym) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0LY3(this, c0lym, null), 3);
    }

    public static C544820LYi zQ2(ShortVideoContext shortVideoContext, C0LY8 c0ly8) {
        Integer numValueOf;
        String creationId;
        AIGCOfflineModel aIGCOfflineModelLIZ;
        CreativeModel creativeModel;
        CreativeInfo creativeInfo;
        String str = C0LC1.LIZIZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Creating snapshot with imageUriList size: ");
        List<String> list = c0ly8.LJIIIZ;
        CreativeModel creativeModelLIZIZ = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C0LC0.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (shortVideoContext != null && (creativeInfo = shortVideoContext.creativeInfo) != null) {
            creationId = creativeInfo.getCreationId();
        } else {
            creationId = null;
        }
        CreativeInfo creativeInfo2 = new CreativeInfo(null, 0, null, 7, null);
        List<String> list2 = c0ly8.LJIIIZ;
        if (list2 == null) {
            return null;
        }
        AIGCOfflineModel aIGCOfflineModel = c0ly8.LJIIJJI;
        if (aIGCOfflineModel != null) {
            aIGCOfflineModelLIZ = AIGCOfflineModel.LIZ(aIGCOfflineModel, false, false, false, null, null, null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, false, null, -1, 260095);
        } else {
            aIGCOfflineModelLIZ = null;
        }
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            creativeModelLIZIZ = CreativeModel.LIZIZ(creativeModel, null, null, null, null, -1, -1, -1, 2097151);
        }
        return new C544820LYi(creationId, list2, aIGCOfflineModelLIZ, creativeModelLIZIZ, creativeInfo2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(X.C0LYT r24, X.InterfaceC1364105Vn<? super java.lang.Boolean> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel.BQ2(X.0LYT, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x055b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0570 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5 A[PHI: r7
      0x00e5: PHI (r7v25 java.util.List<java.lang.String>) = (r7v23 java.util.List<java.lang.String>), (r7v30 java.util.List<java.lang.String>) binds: [B:35:0x00e4, B:22:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0198 A[PHI: r1
      0x0198: PHI (r1v13 java.util.List<java.lang.String>) = (r1v11 java.util.List<java.lang.String>), (r1v20 java.util.List<java.lang.String>) binds: [B:62:0x0197, B:51:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(X.C0LYM r41, X.InterfaceC1364105Vn<? super kotlin.Unit> r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel.CQ2(X.0LYM, X.05Vn):java.lang.Object");
    }

    public final Object FQ2(int i, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        if (C543010LRj.LIZ()) {
            return null;
        }
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZ, new C544560LXi(i, this, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(X.C0LY5 r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0LYA
            if (r0 == 0) goto L44
            r5 = r8
            X.0LYA r5 = (X.C0LYA) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L36
            if (r0 != r2) goto L4a
            X.C155000ia.LIZIZ(r4)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            X.0LZj r0 = r6.LLJILJIL
            r5.LLILLL = r1
            java.lang.Object r4 = r0.LIZIZ(r7, r5)
            if (r4 != r3) goto L39
            return r3
        L36:
            X.C155000ia.LIZIZ(r4)
        L39:
            X.0LYT r4 = (X.C0LYT) r4
            r5.LLILLL = r2
            java.lang.Object r0 = r6.BQ2(r4, r5)
            if (r0 != r3) goto L25
            return r3
        L44:
            X.0LYA r5 = new X.0LYA
            r5.<init>(r6, r8)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel.xQ2(X.0LY5, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object DQ2(boolean r9, boolean r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C0LYC
            if (r0 == 0) goto L59
            r7 = r11
            X.0LYC r7 = (X.C0LYC) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L28
            if (r0 == r4) goto L46
            if (r0 != r5) goto L5f
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            r8.EQ2()
            X.1DDr r3 = r8.LLJJI
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r2.<init>(r1, r0)
            r7.LLILLL = r4
            java.lang.Object r0 = r3.emit(r2, r7)
            if (r0 != r6) goto L49
            return r6
        L46:
            X.C155000ia.LIZIZ(r1)
        L49:
            X.1DEK r1 = r8.LLJILJILJ
            X.0LYK r0 = new X.0LYK
            r0.<init>(r4)
            r7.LLILLL = r5
            java.lang.Object r0 = r1.LJIJI(r0, r7)
            if (r0 != r6) goto L25
            return r6
        L59:
            X.0LYC r7 = new X.0LYC
            r7.<init>(r8, r11)
            goto L12
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel.DQ2(boolean, boolean, X.05Vn):java.lang.Object");
    }

    public final AnonymousClass0956 yQ2(int i, int i2, int i3) {
        return C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZ, null, new C544550LXh(i, i2, this, LSPassThroughRecordSizeConfig.DEFAULT, i3, null), 2);
    }

    public AIGCOfflineProcessingViewModel(C0LZB c0lzb, C426001lC c426001lC, C0LY2 c0ly2, C0MGL c0mgl) {
        this.LL = c0lzb;
        this.LLILLJJLI = c426001lC;
        this.LLILLL = c0ly2;
        this.LLILZ = c0mgl;
        C1DEK c1dekLIZ = C095G.LIZ(0, null, 7);
        this.LLJILJILJ = c1dekLIZ;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C0LY8(0));
        this.LLJILLL = c2252321DDqLIZ;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJJ = c2252331DDrLIZIZ;
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJJI = c2252331DDrLIZIZ2;
        this.LLJJIJI = C2191201ApK.LIZ();
        this.LLJJIJIIJIL = C09IC.LIZ(c2252331DDrLIZIZ2);
        this.LLJJIJIL = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLJJJ = C09IC.LJJIIJ(c1dekLIZ);
        C09IC.LJJI(ViewModelKt.getViewModelScope(this), new C861640Xr8(new C0LY0(this, null), c2252331DDrLIZIZ));
        if (C543010LRj.LIZ()) {
            C09IC.LJJI(ViewModelKt.getViewModelScope(this), new C861640Xr8(new C544710LXx(this, null), c426001lC.LJ));
            C09IC.LJJI(ViewModelKt.getViewModelScope(this), new C861640Xr8(new C544700LXw(this, null), c0ly2.LIZLLL));
        }
    }
}
