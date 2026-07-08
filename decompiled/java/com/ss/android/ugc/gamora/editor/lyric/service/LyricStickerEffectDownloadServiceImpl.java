package com.ss.android.ugc.gamora.editor.lyric.service;

import X.AnonymousClass0957;
import X.C01GW;
import X.C054G;
import X.C05WI;
import X.C05WK;
import X.C099R;
import X.C09A1;
import X.C0PEM;
import X.C1343905Nt;
import X.C1424605hs;
import X.C189200o6;
import X.C2296808zG;
import X.C2296908zH;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricFailbackFont;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.lyric.api.ILyricStickerEffectDownloadService;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class LyricStickerEffectDownloadServiceImpl implements ILyricStickerEffectDownloadService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(724));
    public final ConcurrentHashMap<String, Effect> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C05WK> LIZJ = new ConcurrentHashMap<>();
    public final C054G LIZLLL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final ConcurrentHashMap<String, AnonymousClass0957<C189200o6<C05WK>>> LJ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.gamora.editor.lyric.api.ILyricStickerEffectDownloadService
    public final Object LIZ(List<LyricFailbackFont> list, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C05WI(list, this, null), interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.gamora.editor.lyric.api.ILyricStickerEffectDownloadService
    public final Object LIZIZ(List list, C1424605hs c1424605hs) {
        Object objLJ = C2296808zG.LJ(new C1343905Nt(list, this, null), c1424605hs);
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.gamora.editor.lyric.model.LyricEffectDependResource r8, X.InterfaceC1364105Vn<? super X.C189200o6<X.C05WE>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1344105Nv
            if (r0 == 0) goto L72
            r6 = r9
            X.05Nv r6 = (X.C1344105Nv) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r4 = r6.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r1 = 1
            java.lang.String r5 = ""
            if (r0 == 0) goto L56
            if (r0 != r1) goto L9a
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.String r2 = (java.lang.String) r2
            com.ss.android.ugc.gamora.editor.lyric.model.LyricEffectDependResource r8 = r6.LL
            X.C155000ia.LIZIZ(r4)
            X.00o6 r4 = (X.C189200o6) r4
            java.lang.Object r4 = r4.m10unboximpl()
        L30:
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r4)
            if (r3 != 0) goto L78
            kotlin.Pair r4 = (kotlin.Pair) r4
            X.05WE r2 = new X.05WE
            java.lang.Object r1 = r4.getFirst()
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r1
            java.lang.String r0 = r8.originResUrl
            if (r0 == 0) goto L45
            r5 = r0
        L45:
            java.lang.Object r0 = r4.getSecond()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2.<init>(r1, r5, r0)
            X.C189200o6.m2constructorimpl(r2)
            return r2
        L56:
            X.C155000ia.LIZIZ(r4)
            java.lang.String r2 = r8.resourceId
            if (r2 != 0) goto L5e
            r2 = r5
        L5e:
            java.lang.String r0 = r8.LIZ()
            if (r0 != 0) goto L65
            r0 = r5
        L65:
            r6.LL = r8
            r6.LLILLJJLI = r2
            r6.LLILZIL = r1
            java.lang.Object r4 = r7.LJII(r0, r2, r6)
            if (r4 != r3) goto L30
            return r3
        L72:
            X.05Nv r6 = new X.05Nv
            r6.<init>(r7, r9)
            goto L12
        L78:
            boolean r0 = r3 instanceof X.C1365905Wf
            if (r0 != 0) goto L91
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "download failed resId:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r3.<init>(r0)
        L91:
            X.00Yq r2 = new X.00Yq
            r2.<init>(r3)
            X.C189200o6.m2constructorimpl(r2)
            return r2
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl.LIZLLL(com.ss.android.ugc.gamora.editor.lyric.model.LyricEffectDependResource, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r14, X.InterfaceC1364105Vn<? super java.lang.String> r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl.LJFF(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r9, java.util.List<java.lang.String> r10, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect>>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C1344005Nu
            if (r0 == 0) goto L6a
            r6 = r11
            X.05Nu r6 = (X.C1344005Nu) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r1 = r6.LLILLL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r5 = 1
            if (r0 == 0) goto L29
            if (r0 != r5) goto L70
            X.C155000ia.LIZIZ(r1)
        L22:
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            r6.LL = r9
            r6.LLILLJJLI = r10
            r6.LLILZIL = r5
            X.1DEt r4 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r6)
            r4.<init>(r5, r0)
            r4.LJIJJ()
            X.01GW r0 = r8.LIZ
            java.lang.Object r3 = r0.getValue()
            X.0sev r3 = (X.InterfaceC1635390sev) r3
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "panel"
            r1.<init>(r0, r9)
            java.util.Map r2 = X.C2097908Jt.LIZJ(r1)
            X.06wD r1 = new X.06wD
            r0 = 0
            r1.<init>(r4, r0)
            r3.LJJIJIIJI(r10, r5, r2, r1)
            java.lang.Object r1 = r4.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L67
            X.C099Q.LIZJ(r6)
        L67:
            if (r1 != r7) goto L22
            return r7
        L6a:
            X.05Nu r6 = new X.05Nu
            r6.<init>(r8, r11)
            goto L12
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl.LJI(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r10, java.lang.String r11, X.InterfaceC1364105Vn<? super X.C189200o6<? extends kotlin.Pair<? extends com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Boolean>>> r12) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl.LJII(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0048 A[EDGE_INSN: B:60:0x0048->B:20:0x0048 BREAK  A[LOOP:0: B:24:0x0052->B:64:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[LOOP:0: B:24:0x0052->B:64:?, LOOP_END, SYNTHETIC] */
    @Override // com.ss.android.ugc.gamora.editor.lyric.api.ILyricStickerEffectDownloadService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r15, java.lang.String r16, java.lang.String r17, X.C05WF r18, X.InterfaceC1364105Vn<? super X.C189200o6<X.C05WK>> r19) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl.LIZJ(java.lang.String, java.lang.String, java.lang.String, X.05WF, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r13, java.lang.String r14, java.lang.String r15, X.C05WF r16, X.InterfaceC1364105Vn<? super X.C189200o6<X.C05WK>> r17) {
        /*
            r12 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C05FD
            r6 = r12
            if (r0 == 0) goto L43
            r4 = r3
            X.05FD r4 = (X.C05FD) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.LLILLL = r2
        L15:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L2c
            if (r1 != r0) goto L49
            X.C155000ia.LIZIZ(r3)
        L25:
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
            return r0
        L2c:
            X.C155000ia.LIZIZ(r3)
            X.05WC r5 = new X.05WC
            r11 = 0
            r7 = r16
            r8 = r15
            r10 = r14
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.LLILLL = r0
            java.lang.Object r3 = X.C2296808zG.LJ(r5, r4)
            if (r3 != r2) goto L25
            return r2
        L43:
            X.05FD r4 = new X.05FD
            r4.<init>(r6, r3)
            goto L15
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl.LJ(java.lang.String, java.lang.String, java.lang.String, X.05WF, X.05Vn):java.lang.Object");
    }
}
