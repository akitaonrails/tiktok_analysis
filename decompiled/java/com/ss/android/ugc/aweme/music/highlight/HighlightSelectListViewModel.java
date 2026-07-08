package com.ss.android.ugc.aweme.music.highlight;

import X.AbstractC316870CbV;
import X.C003D;
import X.C00XA;
import X.C13BV;
import X.C13LP;
import X.C1559260qg8;
import X.C2215091Bml;
import X.C259800zU;
import X.C317290CcB;
import X.C615860ODo;
import X.C616870OHl;
import X.C623470Ocr;
import X.C627660Ojc;
import X.C631740OqC;
import X.C631750OqD;
import X.C632050Oqh;
import X.C632090Oql;
import X.C723600SZy;
import X.EnumC2215081Bmk;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC615870ODp;
import X.InterfaceC736910SvR;
import Y.AComparatorS28S0000000_9;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class HighlightSelectListViewModel extends AssemListViewModel<C631750OqD, InterfaceC1891350zJl, Integer> {
    public final InterfaceC736910SvR<InterfaceC615870ODp> LL;
    public String LLILLJJLI;
    public List<MusicGroup> LLILLL = C13BV.INSTANCE;
    public final C1559260qg8 LLILZ = new C1559260qg8(new C723600SZy(this, C631740OqC.class, null), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C631750OqD(0);
    }

    public HighlightSelectListViewModel(C615860ODo c615860ODo) {
        this.LL = c615860ODo;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return wQ2(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof X.C631720OqA
            r7 = r13
            if (r0 == 0) goto L9a
            r6 = r14
            X.0OqA r6 = (X.C631720OqA) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r6.LLILLL = r2
        L13:
            java.lang.Object r5 = r6.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 1
            r2 = 2
            if (r0 == 0) goto L64
            if (r0 == r3) goto L8c
            if (r0 != r2) goto Lb5
            X.C155000ia.LIZIZ(r5)
        L26:
            X.0O7A r5 = (X.C0O7A) r5
            boolean r0 = r5 instanceof X.C0O79
            if (r0 == 0) goto La1
            X.0O79 r5 = (X.C0O79) r5
            D extends X.0O5h r0 = r5.LJ
            X.0ODg r0 = (X.C615780ODg) r0
            com.ss.android.ugc.aweme.music.model.NewReleasedList r0 = r0.LIZ
            java.util.List r0 = r0.getNewReleasedMusicGroups()
            if (r0 != 0) goto L3c
            X.13BV r0 = X.C13BV.INSTANCE
        L3c:
            r7.LLILLL = r0
            java.lang.Class<X.0Otq> r0 = X.InterfaceC634000Otq.class
            X.12Dl r0 = X.C13LE.LIZ(r0)
            X.0Hgj r0 = X.C1252710ihh.LJIIIZ(r7, r0)
            X.0Oq2 r0 = (X.C631640Oq2) r0
            if (r0 == 0) goto L62
            java.lang.String r8 = r0.LJIIJ
        L4e:
            X.0CcB r1 = X.AbstractC316870CbV.LIZ
            r9 = 0
            r12 = 14
            r10 = r9
            r11 = r9
            java.util.List r0 = vQ2(r7, r8, r9, r10, r11, r12)
            r1.getClass()
            X.0Cb8 r1 = new X.0Cb8
            r1.<init>(r0)
            return r1
        L62:
            r8 = 0
            goto L4e
        L64:
            X.C155000ia.LIZIZ(r5)
            X.0SvR<X.0ODp> r0 = r7.LL
            X.00hg r1 = r0.getOperator()
            X.0Opq r1 = (X.InterfaceC631520Opq) r1
            java.lang.Class<X.0Otq> r0 = X.InterfaceC634000Otq.class
            X.12Dl r0 = X.C13LE.LIZ(r0)
            X.0Hgj r0 = X.C1252710ihh.LJIIIZ(r7, r0)
            X.0Oq2 r0 = (X.C631640Oq2) r0
            if (r0 == 0) goto L81
            java.lang.String r0 = r0.LIZIZ
            if (r0 != 0) goto L83
        L81:
            java.lang.String r0 = ""
        L83:
            r6.LLILLL = r3
            X.01Wa r5 = r1.LLZLLIL(r0)
            if (r5 != r4) goto L8f
            return r4
        L8c:
            X.C155000ia.LIZIZ(r5)
        L8f:
            X.01Wa r5 = (X.InterfaceC346201Wa) r5
            r6.LLILLL = r2
            java.lang.Object r5 = X.C09IC.LJIIZILJ(r5, r6)
            if (r5 != r4) goto L26
            return r4
        L9a:
            X.0OqA r6 = new X.0OqA
            r6.<init>(r7, r14)
            goto L13
        La1:
            boolean r0 = r5 instanceof X.C0O7B
            if (r0 == 0) goto Laf
            X.0Cb9 r1 = new X.0Cb9
            X.0O7B r5 = (X.C0O7B) r5
            X.0O6t r0 = r5.LIZLLL
            r1.<init>(r0)
            return r1
        Laf:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel.wQ2(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        num.intValue();
        return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    public static List vQ2(HighlightSelectListViewModel highlightSelectListViewModel, String str, String str2, String str3, String str4, int i) {
        boolean z;
        long j;
        MusicReleaseInfo musicReleaseInfo;
        T sourceMusicId;
        String str5 = str4;
        String str6 = str;
        if ((i & 1) != 0) {
            str6 = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str5 = null;
        }
        highlightSelectListViewModel.getClass();
        ArrayList arrayList = new ArrayList();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = ((C631750OqD) highlightSelectListViewModel.getState()).LL;
        if (str6 != null) {
            MusicGroup musicGroupLIZIZ = C632050Oqh.LIZIZ(str6, highlightSelectListViewModel.LLILLL);
            if (musicGroupLIZIZ != null) {
                sourceMusicId = musicGroupLIZIZ.getSourceMusicId();
            } else {
                sourceMusicId = 0;
            }
            c259800zU.element = sourceMusicId;
        } else if (str2 != null) {
            c259800zU.element = null;
        } else if (str3 != null) {
            highlightSelectListViewModel.LLILLJJLI = null;
        } else if (str5 != null) {
            highlightSelectListViewModel.LLILLJJLI = str5;
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS28S0000000_9(11), highlightSelectListViewModel.LLILLL);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listLJLLLL) {
            Music sourceMusic = ((MusicGroup) obj).getSourceMusic();
            if (sourceMusic != null && (musicReleaseInfo = sourceMusic.getMusicReleaseInfo()) != null) {
                j = musicReleaseInfo.groupReleaseDate;
            } else {
                j = 0;
            }
            String strLIZLLL = C2215091Bml.LIZLLL(((long) LSPassThroughRecordSizeConfig.DEFAULT) * (j + ((long) 2592000)), null, Collections.singleton(EnumC2215081Bmk.Date), null, false, false, false, 1690);
            Object arrayList2 = linkedHashMap.get(strLIZLLL);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(strLIZLLL, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str7 = (String) entry.getKey();
            List<MusicGroup> list = (List) entry.getValue();
            arrayList.add(new C00XA(str7));
            for (MusicGroup musicGroup : list) {
                Boolean boolValueOf = Boolean.valueOf(C632050Oqh.LIZ(musicGroup, highlightSelectListViewModel.LLILLJJLI));
                T t = c259800zU.element;
                if (t != 0 && C632050Oqh.LIZ(musicGroup, (String) t)) {
                    z = true;
                } else {
                    z = false;
                }
                C632090Oql c632090OqlLJIIL = C632050Oqh.LJIIL(musicGroup, null, null, boolValueOf, Boolean.valueOf(z), null, null, null, 115);
                if (c632090OqlLJIIL != null) {
                    arrayList.add(c632090OqlLJIIL);
                }
                if (C632050Oqh.LIZ(musicGroup, highlightSelectListViewModel.LLILLJJLI)) {
                    arrayList.addAll(C632050Oqh.LJIIJ(musicGroup, null, null));
                }
            }
        }
        if (!Intrinsics.LJFF(c259800zU.element, ((C631750OqD) highlightSelectListViewModel.getState()).LL)) {
            highlightSelectListViewModel.setState(new AwS588S0100000_9(c259800zU, (C259800zU<C616870OHl>) 436));
        }
        if (!arrayList.isEmpty()) {
            ListProtector.add(arrayList, 0, new C003D(0));
        }
        return arrayList;
    }
}
