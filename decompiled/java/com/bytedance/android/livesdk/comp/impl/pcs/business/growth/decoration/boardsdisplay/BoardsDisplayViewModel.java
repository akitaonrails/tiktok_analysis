package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay;

import X.AbstractC1700910uMb;
import X.C05YD;
import X.C09JN;
import X.C1161920gLG;
import X.C11KS;
import X.C11NJ;
import X.C1DEV;
import X.C2191201ApK;
import X.C480460Ism;
import X.InterfaceC1814530xJr;
import X.InterfaceC390601fU;
import X.InterfaceC395901gL;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.LiveBoardApi;

/* JADX INFO: loaded from: classes28.dex */
public final class BoardsDisplayViewModel extends ViewModel {
    public final LiveBoardApi LL;
    public final InterfaceC1814530xJr LLILLJJLI;
    public final InterfaceC390601fU LLILLL;
    public final C05YD<AbstractC1700910uMb> LLILZ;
    public String LLILZIL;
    public final C11NJ LLILZLL;
    public final C1DEV LLIZ;
    public long LLIZLLLIL;

    public BoardsDisplayViewModel() {
        this(0);
    }

    public BoardsDisplayViewModel(int i) {
        InterfaceC1814530xJr boardsDisplayStateManager;
        InterfaceC390601fU effectBoardService;
        C480460Ism.LIZ().getClass();
        LiveBoardApi liveBoardApi = (LiveBoardApi) C480460Ism.LIZLLL(LiveBoardApi.class);
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        if (iEffectService != null) {
            boardsDisplayStateManager = iEffectService.getBoardsDisplayStateManager();
        } else {
            boardsDisplayStateManager = null;
        }
        IEffectService iEffectService2 = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        if (iEffectService2 != null) {
            effectBoardService = iEffectService2.getEffectBoardService("anchor", "");
        } else {
            effectBoardService = null;
        }
        this.LL = liveBoardApi;
        this.LLILLJJLI = boardsDisplayStateManager;
        this.LLILLL = effectBoardService;
        this.LLILZ = boardsDisplayStateManager != null ? boardsDisplayStateManager.LJIIL() : null;
        this.LLILZIL = "live_take_page";
        this.LLILZLL = new C11NJ();
        this.LLIZ = C2191201ApK.LIZ();
    }

    public final void vQ2(final InterfaceC395901gL interfaceC395901gL, Context context) {
        C11KS c11ksLJIIJ;
        InterfaceC390601fU interfaceC390601fU = this.LLILLL;
        if (interfaceC390601fU != null && (c11ksLJIIJ = interfaceC390601fU.LJIIJ(context, interfaceC395901gL, null)) != null) {
            this.LLILZLL.LIZ(c11ksLJIIJ.LJJIIZ(new C09JN() { // from class: X.01oz
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("BoardsDisplayViewModel@4c6d.addOrRefreshBoard$1");
                    if (((Boolean) obj).booleanValue()) {
                        C20441214yg.LIZIZ("BoardsDisplayViewModel", "addOrRefreshBoard suc");
                    } else {
                        C20441214yg.LJ("BoardsDisplayViewModel", "addOrRefreshBoard failed");
                    }
                    C1C7U.LIZIZ("BoardsDisplayViewModel@4c6d.addOrRefreshBoard$1");
                }
            }, new C09JN() { // from class: X.01oy
                @Override // X.C09JN
                public final void accept(Object obj) {
                    String message;
                    C1C7U.LIZ("BoardsDisplayViewModel@4c6d.addOrRefreshBoard$2");
                    Throwable th = (Throwable) obj;
                    C20441214yg.LJI("BoardsDisplayViewModel", th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("BoardsDisplayViewModel.addOrRefreshBoard onError boardId=");
                    sbLIZ.append(interfaceC395901gL.getBoardId());
                    sbLIZ.append(": ");
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    C470401sM.LIZIZ(-5005, 5, C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("BoardsDisplayViewModel@4c6d.addOrRefreshBoard$2");
                }
            }));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0022 A[PHI: r9
      0x0022: PHI (r9v7 java.lang.String) = (r9v0 java.lang.String), (r9v8 java.lang.String) binds: [B:15:0x0020, B:13:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026 A[PHI: r9
      0x0026: PHI (r9v6 java.lang.String) = (r9v0 java.lang.String), (r9v7 java.lang.String) binds: [B:15:0x0020, B:17:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0029 A[PHI: r9 r10
      0x0029: PHI (r9v1 java.lang.String) = (r9v6 java.lang.String), (r9v7 java.lang.String) binds: [B:19:0x0027, B:17:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r10v0 java.lang.String) = (r10v5 java.lang.String), (r10v6 java.lang.String) binds: [B:19:0x0027, B:17:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002d A[PHI: r9 r10
      0x002d: PHI (r9v5 java.lang.String) = (r9v1 java.lang.String), (r9v6 java.lang.String) binds: [B:21:0x002b, B:19:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r10v4 java.lang.String) = (r10v0 java.lang.String), (r10v5 java.lang.String) binds: [B:21:0x002b, B:19:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030 A[PHI: r9 r10 r11
      0x0030: PHI (r9v4 java.lang.String) = (r9v1 java.lang.String), (r9v5 java.lang.String) binds: [B:21:0x002b, B:23:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r10v3 java.lang.String) = (r10v0 java.lang.String), (r10v4 java.lang.String) binds: [B:21:0x002b, B:23:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r11v3 java.lang.String) = (r11v0 java.lang.String), (r11v4 java.lang.String) binds: [B:21:0x002b, B:23:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c A[PHI: r9 r10 r11
      0x003c: PHI (r9v2 java.lang.String) = (r9v4 java.lang.String), (r9v4 java.lang.String), (r9v4 java.lang.String), (r9v5 java.lang.String) binds: [B:25:0x0032, B:27:0x0036, B:29:0x003a, B:23:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r10v1 java.lang.String) = (r10v3 java.lang.String), (r10v3 java.lang.String), (r10v3 java.lang.String), (r10v4 java.lang.String) binds: [B:25:0x0032, B:27:0x0036, B:29:0x003a, B:23:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r11v1 java.lang.String) = (r11v3 java.lang.String), (r11v3 java.lang.String), (r11v3 java.lang.String), (r11v4 java.lang.String) binds: [B:25:0x0032, B:27:0x0036, B:29:0x003a, B:23:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(X.InterfaceC1776570wKd r14, X.C1814980xKa r15) {
        /*
            r13 = this;
            java.lang.String r3 = "delete"
            java.lang.String r4 = r13.LLILZIL
            java.lang.String r2 = ""
            if (r15 == 0) goto Lc
            java.lang.String r8 = r15.LJ
            if (r8 != 0) goto Ld
        Lc:
            r8 = r2
        Ld:
            r0 = 0
            if (r15 == 0) goto L48
            long r5 = r15.LIZ
            long r0 = r15.LIZIZ
        L15:
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            if (r15 == 0) goto L1f
            java.lang.String r9 = r15.LJFF
            if (r9 != 0) goto L22
        L1f:
            r9 = r2
            if (r15 == 0) goto L26
        L22:
            java.lang.String r10 = r15.LJII
            if (r10 != 0) goto L29
        L26:
            r10 = r2
            if (r15 == 0) goto L2d
        L29:
            java.lang.String r11 = r15.LJIIIIZZ
            if (r11 != 0) goto L30
        L2d:
            r11 = r2
            if (r15 == 0) goto L3c
        L30:
            com.bytedance.android.livesdk.model.RecommendBoardInfo r0 = r15.LJI
            if (r0 == 0) goto L3c
            com.bytedance.android.livesdk.model.SourcePB r0 = r0.sourcePb
            if (r0 == 0) goto L3c
            java.lang.String r12 = r0.generateVersion
            if (r12 != 0) goto L3d
        L3c:
            r12 = r2
        L3d:
            X.C01DX.LIZ(r3, r4, r5, r7, r8, r9, r10, r11, r12)
            X.0xJr r0 = r13.LLILLJJLI
            if (r0 == 0) goto L47
            r0.LJIILJJIL(r14)
        L47:
            return
        L48:
            r5 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel.xQ2(X.0wKd, X.0xKa):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(com.bytedance.android.livesdk.model.Board r22, java.lang.String r23, int r24) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel.wQ2(com.bytedance.android.livesdk.model.Board, java.lang.String, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026 A[PHI: r10
      0x0026: PHI (r10v7 java.lang.String) = (r10v0 java.lang.String), (r10v8 java.lang.String) binds: [B:16:0x0024, B:14:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002a A[PHI: r10
      0x002a: PHI (r10v6 java.lang.String) = (r10v0 java.lang.String), (r10v7 java.lang.String) binds: [B:16:0x0024, B:18:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d A[PHI: r10 r11
      0x002d: PHI (r10v1 java.lang.String) = (r10v6 java.lang.String), (r10v7 java.lang.String) binds: [B:20:0x002b, B:18:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r11v0 java.lang.String) = (r11v5 java.lang.String), (r11v6 java.lang.String) binds: [B:20:0x002b, B:18:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031 A[PHI: r10 r11
      0x0031: PHI (r10v5 java.lang.String) = (r10v1 java.lang.String), (r10v6 java.lang.String) binds: [B:22:0x002f, B:20:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r11v4 java.lang.String) = (r11v0 java.lang.String), (r11v5 java.lang.String) binds: [B:22:0x002f, B:20:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034 A[PHI: r10 r11 r12
      0x0034: PHI (r10v4 java.lang.String) = (r10v1 java.lang.String), (r10v5 java.lang.String) binds: [B:22:0x002f, B:24:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r11v3 java.lang.String) = (r11v0 java.lang.String), (r11v4 java.lang.String) binds: [B:22:0x002f, B:24:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r12v3 java.lang.String) = (r12v0 java.lang.String), (r12v4 java.lang.String) binds: [B:22:0x002f, B:24:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040 A[PHI: r10 r11 r12
      0x0040: PHI (r10v2 java.lang.String) = (r10v4 java.lang.String), (r10v4 java.lang.String), (r10v4 java.lang.String), (r10v5 java.lang.String) binds: [B:26:0x0036, B:28:0x003a, B:30:0x003e, B:24:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r11v1 java.lang.String) = (r11v3 java.lang.String), (r11v3 java.lang.String), (r11v3 java.lang.String), (r11v4 java.lang.String) binds: [B:26:0x0036, B:28:0x003a, B:30:0x003e, B:24:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r12v1 java.lang.String) = (r12v3 java.lang.String), (r12v3 java.lang.String), (r12v3 java.lang.String), (r12v4 java.lang.String) binds: [B:26:0x0036, B:28:0x003a, B:30:0x003e, B:24:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(boolean r15, X.InterfaceC1776570wKd r16, com.bytedance.android.livesdk.model.BoardItemPosition r17, X.C1814980xKa r18) {
        /*
            r14 = this;
            if (r15 != 0) goto L44
            java.lang.String r4 = "drag"
            java.lang.String r5 = r14.LLILZIL
            java.lang.String r2 = ""
            r3 = r18
            if (r3 == 0) goto L10
            java.lang.String r9 = r3.LJ
            if (r9 != 0) goto L11
        L10:
            r9 = r2
        L11:
            r0 = 0
            if (r3 == 0) goto L55
            long r6 = r3.LIZ
            long r0 = r3.LIZIZ
        L19:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            if (r3 == 0) goto L23
            java.lang.String r10 = r3.LJFF
            if (r10 != 0) goto L26
        L23:
            r10 = r2
            if (r3 == 0) goto L2a
        L26:
            java.lang.String r11 = r3.LJII
            if (r11 != 0) goto L2d
        L2a:
            r11 = r2
            if (r3 == 0) goto L31
        L2d:
            java.lang.String r12 = r3.LJIIIIZZ
            if (r12 != 0) goto L34
        L31:
            r12 = r2
            if (r3 == 0) goto L40
        L34:
            com.bytedance.android.livesdk.model.RecommendBoardInfo r0 = r3.LJI
            if (r0 == 0) goto L40
            com.bytedance.android.livesdk.model.SourcePB r0 = r0.sourcePb
            if (r0 == 0) goto L40
            java.lang.String r13 = r0.generateVersion
            if (r13 != 0) goto L41
        L40:
            r13 = r2
        L41:
            X.C01DX.LIZ(r4, r5, r6, r8, r9, r10, r11, r12, r13)
        L44:
            X.0xJr r1 = r14.LLILLJJLI
            if (r1 == 0) goto L54
            X.0xJu r0 = new X.0xJu
            r0.<init>(r14, r15)
            r2 = r17
            r3 = r16
            r1.LIZLLL(r3, r2, r0)
        L54:
            return
        L55:
            r6 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel.yQ2(boolean, X.0wKd, com.bytedance.android.livesdk.model.BoardItemPosition, X.0xKa):void");
    }
}
