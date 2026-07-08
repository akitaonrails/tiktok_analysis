package com.ss.android.ugc.gamora.editor.lyric.service;

import X.C01GW;
import X.C098200Yq;
import X.C0CHQ;
import X.C13OY;
import X.C13RD;
import X.C13RE;
import X.C1533950q1J;
import X.C15438062q;
import X.C189200o6;
import X.C201955140j;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import X.C563650M8t;
import X.InterfaceC1635390sev;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.gamora.editor.lyric.api.ILyricMiniDraftService;
import com.ss.android.ugc.gamora.editor.lyric.api.LyricStickerReqInputParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes6.dex */
public final class LyricMiniDraftServiceImpl implements ILyricMiniDraftService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(722));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(723));

    public final Map<String, String> LJ() {
        C13OY effectPlatform;
        C13RD c13rd;
        EffectManager effectManagerLLJILJILJ = ((InterfaceC1635390sev) this.LIZIZ.getValue()).LLJILJILJ();
        return (effectManagerLLJILJILJ == null || (effectPlatform = effectManagerLLJILJILJ.getEffectPlatform()) == null || (c13rd = effectPlatform.LIZ) == null) ? C2097608Jq.LJ() : C13RE.LIZ(c13rd, true);
    }

    public static String LIZLLL(String str, List list) {
        Object c098200Yq;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (C1533950q1J.LJ((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (true) {
            String str2 = "";
            if (!it2.hasNext()) {
                break;
            }
            String str3 = (String) it2.next();
            if (str3 != null) {
                str2 = str3;
            }
            arrayList2.add(new LyricStickerReqInputParams(str2, str));
        }
        try {
            c098200Yq = C0CHQ.LIZ().getGson().LJIILLIIL(arrayList2, new TypeToken<List<? extends LyricStickerReqInputParams>>() { // from class: X.04Zf
            }.getType());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("buildLyricStickerReqInput failed e:");
            sbLIZ.append(Unit.LIZ);
            C201955140j.LJIJI(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str4 = (String) c098200Yq;
        if (str4 == null) {
            return "";
        }
        return str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0353  */
    @Override // com.ss.android.ugc.gamora.editor.lyric.api.ILyricMiniDraftService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricMiniDraftData LIZJ(X.C05WK r33, java.lang.String r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lyric.service.LyricMiniDraftServiceImpl.LIZJ(X.05WK, java.lang.String):com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricMiniDraftData");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.ss.android.ugc.gamora.editor.lyric.api.ILyricMiniDraftService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List r11, java.lang.String r12, java.lang.String r13, X.InterfaceC1364105Vn r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof X.C0EP6
            if (r0 == 0) goto L20
            r9 = r14
            X.0EP6 r9 = (X.C0EP6) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r3 = r9.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L52
        L20:
            X.0EP6 r9 = new X.0EP6
            r9.<init>(r10, r14)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            java.lang.String r5 = LIZLLL(r13, r11)
            java.lang.System.currentTimeMillis()
            X.01GW r0 = r10.LIZ     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r3 = r0.getValue()     // Catch: java.lang.Throwable -> L5b
            com.ss.android.ugc.gamora.editor.lyric.api.ILyricMiniDraftApi r3 = (com.ss.android.ugc.gamora.editor.lyric.api.ILyricMiniDraftApi) r3     // Catch: java.lang.Throwable -> L5b
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
            java.util.Map r8 = r10.LJ()     // Catch: java.lang.Throwable -> L5b
            r9.LLILLL = r1     // Catch: java.lang.Throwable -> L5b
            r4 = r12
            java.lang.Object r3 = r3.requestMiniDraft(r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L5b
            if (r3 != r2) goto L55
            return r2
        L52:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L5b
        L55:
            X.05i3 r3 = (X.C1425705i3) r3     // Catch: java.lang.Throwable -> L5b
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L5b
            goto L67
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L67:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r0 == 0) goto L6e
            r3 = 0
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lyric.service.LyricMiniDraftServiceImpl.LIZ(java.util.List, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // com.ss.android.ugc.gamora.editor.lyric.api.ILyricMiniDraftService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List r16, java.lang.String r17, java.lang.String r18, X.InterfaceC1364105Vn r19) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lyric.service.LyricMiniDraftServiceImpl.LIZIZ(java.util.List, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
