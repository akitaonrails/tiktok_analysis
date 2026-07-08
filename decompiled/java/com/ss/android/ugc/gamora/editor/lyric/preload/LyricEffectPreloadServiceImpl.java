package com.ss.android.ugc.gamora.editor.lyric.preload;

import X.C01GW;
import X.C054G;
import X.C05WF;
import X.C05WK;
import X.C09A1;
import X.C09AE;
import X.C0EQL;
import X.C0PEM;
import X.C1398350mUb;
import X.C1424405hq;
import X.C1424505hr;
import X.C1424905hv;
import X.C1426005i6;
import X.C1DEV;
import X.C2188811AlT;
import X.C2191201ApK;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C452501pT;
import X.EnumC1426605iC;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.gamora.lyrics.ILyricEffectPreloadService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class LyricEffectPreloadServiceImpl implements ILyricEffectPreloadService {
    public final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final ConcurrentHashMap<String, Pair<List<C0EQL>, C05WK>> LIZJ = new ConcurrentHashMap<>();
    public final C1DEV LIZLLL = C2191201ApK.LIZ();
    public final ConcurrentHashMap<String, C09AE> LJ = new ConcurrentHashMap<>();
    public final AtomicBoolean LJFF = new AtomicBoolean(false);
    public final ConcurrentHashSet LJI = new ConcurrentHashSet();
    public final ConcurrentHashMap<String, String> LJII = new ConcurrentHashMap<>();
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public final ConcurrentHashMap<String, CopyOnWriteArrayList<C05WF>> LJIIIZ = new ConcurrentHashMap<>();
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(721));

    @Override // com.ss.android.ugc.gamora.lyrics.ILyricEffectPreloadService
    public final void LIZLLL() {
        if (!this.LJIIIIZZ.compareAndSet(false, true)) {
            C1426005i6.LIZ(C1398350mUb.LIZIZ, "Anchor.Preload.LyricEffect.PanelAll", "SKIP-ALREADY-STARTED");
        } else {
            C1426005i6.LIZ(C1398350mUb.LIZIZ, "Anchor.Preload.LyricEffect.PanelAll", "NEW-TASK");
            C23250099c.LIZLLL(this.LIZIZ, null, null, new C1424405hq(this, null), 3);
        }
    }

    @Override // com.ss.android.ugc.gamora.lyrics.ILyricEffectPreloadService
    public final String LIZ(String str) {
        return this.LJII.get(str);
    }

    @Override // com.ss.android.ugc.gamora.lyrics.ILyricEffectPreloadService
    public final boolean LIZIZ(String str) {
        return this.LJI.contains(str);
    }

    @Override // com.ss.android.ugc.gamora.lyrics.ILyricEffectPreloadService
    public final boolean LJFF(String str) {
        C09AE c09ae = this.LJ.get(str);
        if (c09ae == null || !c09ae.isActive()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01dc  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable, java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lyric.preload.LyricEffectPreloadServiceImpl.LJIIIIZZ(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.gamora.lyrics.ILyricEffectPreloadService
    public final void LIZJ(String str, String str2) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ENTRY musicId=");
        sbLIZ.append(str);
        sbLIZ.append(" resourceId=");
        sbLIZ.append(str2);
        C1426005i6.LIZ(c1398350mUb, "Anchor.Preload.LyricEffect.Preload", C2188811AlT.LIZIZ(sbLIZ));
        if (str.length() != 0 && str2.length() != 0) {
            ILyricEffectPreloadService.LIZ.getClass();
            String strLIZ = C1424905hv.LIZ(str2, str);
            if (this.LJ.containsKey(strLIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("SKIP-INFLIGHT key=");
                sbLIZ2.append(strLIZ);
                C1426005i6.LIZ(c1398350mUb, "Anchor.Preload.LyricEffect.Preload", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            if (this.LIZJ.containsKey(strLIZ)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("SKIP-CACHED key=");
                sbLIZ3.append(strLIZ);
                C1426005i6.LIZ(c1398350mUb, "Anchor.Preload.LyricEffect.Preload", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("NEW-TASK key=");
            sbLIZ4.append(strLIZ);
            C1426005i6.LIZ(c1398350mUb, "Anchor.Preload.LyricEffect.Preload", C2188811AlT.LIZIZ(sbLIZ4));
            this.LJ.put(strLIZ, C23250099c.LIZLLL(this.LIZIZ, null, null, new C1424505hr(this, strLIZ, str, str2, null), 3));
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("REJECT-EMPTY musicId=");
        sbLIZ5.append(str);
        sbLIZ5.append(" resourceId=");
        sbLIZ5.append(str2);
        C1426005i6.LIZJ(c1398350mUb, "Anchor.Preload.LyricEffect.Preload", C2188811AlT.LIZIZ(sbLIZ5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    @Override // com.ss.android.ugc.gamora.lyrics.ILyricEffectPreloadService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r10, X.C05WF r11, X.InterfaceC1364105Vn<? super kotlin.Pair<? extends java.util.List<X.C0EQL>, X.C05WK>> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lyric.preload.LyricEffectPreloadServiceImpl.LJ(java.lang.String, X.05WF, X.05Vn):java.lang.Object");
    }

    public final void LJI(String str, String str2, float f, EnumC1426605iC enumC1426605iC) {
        CopyOnWriteArrayList<C05WF> copyOnWriteArrayList = this.LJIIIZ.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        Iterator<C05WF> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(f, enumC1426605iC);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0472 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r24, java.lang.String r25, java.lang.String r26, X.InterfaceC1364105Vn<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instruction units count: 1193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lyric.preload.LyricEffectPreloadServiceImpl.LJII(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
