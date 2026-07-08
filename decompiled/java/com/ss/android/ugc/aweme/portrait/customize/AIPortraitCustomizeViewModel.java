package com.ss.android.ugc.aweme.portrait.customize;

import X.AnonymousClass0951;
import X.C08CX;
import X.C09IC;
import X.C13LP;
import X.C13LZ;
import X.C1673070tdh;
import X.C1673080tdi;
import X.C1680680tpy;
import X.C1686860tzw;
import X.C1686950u05;
import X.C1686970u07;
import X.C1687150u0P;
import X.C1692280u8g;
import X.C1BNE;
import X.C2252321DDq;
import X.C2275181E3o;
import X.C2275191E3p;
import X.C548880Lfq;
import X.EnumC1419230n2H;
import X.EnumC550430LiL;
import X.EnumC550780Liu;
import X.InterfaceC1665500tRU;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.portrait.customize.model.PortraitRecommendedItem;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitConsumptionModel;
import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.portrait.model.RefImageType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS0S2501000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class AIPortraitCustomizeViewModel extends ViewModel {
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public EnumC550780Liu LLILZLL;
    public boolean LLIZ;
    public AIGCEntranceInfo LLIZLLLIL;
    public AIPortraitConsumptionModel LLJ;
    public PortraitStyleItem LLJI;
    public boolean LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public final C2252321DDq LLJILLL;
    public final AnonymousClass0951 LLJJ;
    public final C2252321DDq LLJJI;
    public final AnonymousClass0951 LLJJIII;
    public String LLJJIJI;
    public boolean LLJJIJIIJIL;
    public long LLJJIJIL;
    public final Set<Integer> LLJJJ;
    public Set<Integer> LLJJJIL;
    public final C1686950u05 LL = new C1686950u05();
    public boolean LLILZIL = true;

    public AIPortraitCustomizeViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C1673070tdh.LIZ);
        this.LLJILLL = c2252321DDqLIZ;
        this.LLJJ = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(0L);
        this.LLJJI = c2252321DDqLIZ2;
        this.LLJJIII = C09IC.LIZIZ(c2252321DDqLIZ2);
        this.LLJJIJI = "";
        this.LLJJJ = new LinkedHashSet();
        this.LLJJJIL = C08CX.INSTANCE;
    }

    public final C1673080tdi zQ2() {
        Object value = this.LLJILLL.getValue();
        if (value instanceof C1673080tdi) {
            return (C1673080tdi) value;
        }
        return null;
    }

    public final boolean BQ2() {
        String str;
        C1673080tdi c1673080tdiZQ2 = zQ2();
        if (c1673080tdiZQ2 == null) {
            return false;
        }
        InterfaceC1665500tRU<PortraitRecommendedItem> interfaceC1665500tRU = c1673080tdiZQ2.LIZ.LIZ;
        if (!(interfaceC1665500tRU instanceof Collection) || !interfaceC1665500tRU.isEmpty()) {
            for (PortraitRecommendedItem portraitRecommendedItem : interfaceC1665500tRU) {
                if (Intrinsics.LJFF(portraitRecommendedItem.isUploadEntry, Boolean.TRUE) && (str = portraitRecommendedItem.coverUrl) != null && str.length() != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String FQ2(List list) {
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                PortraitRecommendedItem portraitRecommendedItem = (PortraitRecommendedItem) next;
                Boolean bool = portraitRecommendedItem.selected;
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.LJFF(bool, bool2) && !Intrinsics.LJFF(portraitRecommendedItem.isUploadEntry, bool2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PortraitRecommendedItem portraitRecommendedItem2 = (PortraitRecommendedItem) next;
        if (portraitRecommendedItem2 == null) {
            return null;
        }
        return portraitRecommendedItem2.styleId;
    }

    public final void CQ2(Set<Integer> set) {
        C1686860tzw c1686860tzw;
        InterfaceC1665500tRU<PortraitRecommendedItem> interfaceC1665500tRU;
        this.LLJJJIL = set;
        C1673080tdi c1673080tdiZQ2 = zQ2();
        if (c1673080tdiZQ2 != null && (c1686860tzw = c1673080tdiZQ2.LIZ) != null && (interfaceC1665500tRU = c1686860tzw.LIZ) != null) {
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                PortraitRecommendedItem portraitRecommendedItem = (PortraitRecommendedItem) C13LP.LJJJLZIJ(iIntValue, interfaceC1665500tRU);
                if (portraitRecommendedItem != null && !Intrinsics.LJFF(portraitRecommendedItem.isUploadEntry, Boolean.TRUE) && this.LLJJJ.add(Integer.valueOf(iIntValue))) {
                    EQ2(portraitRecommendedItem, iIntValue, false);
                }
            }
        }
    }

    public final String yQ2(List<PortraitRecommendedItem> list) {
        Object next;
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                PortraitRecommendedItem portraitRecommendedItem = (PortraitRecommendedItem) next;
                Boolean bool = portraitRecommendedItem.selected;
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.LJFF(bool, bool2) && !Intrinsics.LJFF(portraitRecommendedItem.isUploadEntry, bool2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PortraitRecommendedItem portraitRecommendedItem2 = (PortraitRecommendedItem) next;
        if (portraitRecommendedItem2 == null) {
            return this.LLJJIJI;
        }
        String str = portraitRecommendedItem2.currentPromptText;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static long wQ2(long j, String str) {
        int length = str.length();
        int i = C1692280u8g.LIZJ;
        int i2 = (int) (j >> 32);
        int iLJ = C13LZ.LJ(i2, 0, length);
        int iLJ2 = C13LZ.LJ(C1692280u8g.LIZLLL(j), 0, length);
        if (iLJ == i2 && iLJ2 == C1692280u8g.LIZLLL(j)) {
            return j;
        }
        return C1680680tpy.LIZ(iLJ, iLJ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean xQ2(java.util.List r4, X.C1686970u07 r5) {
        /*
            boolean r0 = r4.isEmpty()
            r3 = 1
            if (r0 != 0) goto L22
            java.util.Iterator r2 = r4.iterator()
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.portrait.customize.model.PortraitRecommendedItem r0 = (com.ss.android.ugc.aweme.portrait.customize.model.PortraitRecommendedItem) r0
            java.lang.Boolean r1 = r0.selected
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lb
        L21:
            return r3
        L22:
            X.0u8a r0 = r5.LIZ
            java.lang.String r0 = r0.LLILLJJLI
            int r0 = r0.length()
            if (r0 > 0) goto L21
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.portrait.customize.AIPortraitCustomizeViewModel.xQ2(java.util.List, X.0u07):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1686890tzz
            if (r0 == 0) goto L3d
            r4 = r8
            X.0tzz r4 = (X.C1686890tzz) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r5 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L2a
            if (r1 != r0) goto L84
            java.lang.Object r7 = r4.LL
            X.C155000ia.LIZIZ(r5)
        L24:
            com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse r5 = (com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse) r5
            if (r5 != 0) goto L43
            r0 = 0
            return r0
        L2a:
            X.C155000ia.LIZIZ(r5)
            X.0u05 r2 = r6.LL
            r4.LL = r7
            r4.LLILZ = r0
            r1 = 20
            r0 = 0
            java.lang.Object r5 = r2.LIZ(r0, r1, r4)
            if (r5 != r3) goto L24
            return r3
        L3d:
            X.0tzz r4 = new X.0tzz
            r4.<init>(r6, r8)
            goto L12
        L43:
            if (r7 == 0) goto L83
            com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem r4 = r6.LLJI
            if (r4 == 0) goto L83
            java.util.List<com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem> r0 = r5.styles
            if (r0 != 0) goto L4f
            X.13BV r0 = X.C13BV.INSTANCE
        L4f:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L58:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem r0 = (com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem) r0
            java.lang.String r0 = r0.styleId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 != 0) goto L58
            r3.add(r1)
            goto L58
        L71:
            java.util.List r0 = java.util.Collections.singletonList(r4)
            java.util.List r3 = X.C13LP.LJLIL(r3, r0)
            java.lang.Integer r2 = r5.cursor
            java.lang.Boolean r1 = r5.hasMore
            com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse r0 = new com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse
            r0.<init>(r3, r2, r1)
            return r0
        L83:
            return r5
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.portrait.customize.AIPortraitCustomizeViewModel.AQ2(java.lang.String, X.05Vn):java.lang.Object");
    }

    public final C1686970u07 DQ2(C1686970u07 c1686970u07, List<PortraitRecommendedItem> list, String str) {
        if (Intrinsics.LJFF(str, FQ2(list))) {
            return c1686970u07;
        }
        String strYQ2 = yQ2(list);
        int length = strYQ2.length();
        return new C1686970u07(strYQ2, C1680680tpy.LIZ(length, length), 4);
    }

    public final void EQ2(PortraitRecommendedItem portraitRecommendedItem, int i, boolean z) {
        String str;
        String str2 = portraitRecommendedItem.styleId;
        PortraitStyleItem portraitStyleItem = this.LLJI;
        Integer numValueOf = null;
        if (portraitStyleItem != null) {
            str = portraitStyleItem.styleId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str2, str)) {
            return;
        }
        String str3 = portraitRecommendedItem.actualPrompt;
        if (str3 != null) {
            numValueOf = Integer.valueOf(str3.length());
        }
        if (z) {
            C1687150u0P c1687150u0P = C1687150u0P.LIZ;
            AIGCEntranceInfo aIGCEntranceInfo = this.LLIZLLLIL;
            String str4 = this.LLILZ;
            String str5 = portraitRecommendedItem.styleId;
            EnumC1419230n2H enumC1419230n2H = portraitRecommendedItem.styleType;
            RefImageType refImageType = RefImageType.PRESET;
            EnumC550430LiL enumC550430LiL = EnumC550430LiL.PRESET;
            EnumC550780Liu enumC550780Liu = this.LLILZLL;
            c1687150u0P.getClass();
            C548880Lfq c548880Lfq = C548880Lfq.LIZ;
            C2275181E3o c2275181E3o = C2275181E3o.LJII;
            AwS0S2501000_8 awS0S2501000_8 = new AwS0S2501000_8(str4, str5, enumC1419230n2H, i, refImageType, enumC550430LiL, numValueOf, enumC550780Liu, 2);
            c548880Lfq.getClass();
            C548880Lfq.LIZLLL(c2275181E3o, aIGCEntranceInfo, awS0S2501000_8);
            return;
        }
        C1687150u0P c1687150u0P2 = C1687150u0P.LIZ;
        AIGCEntranceInfo aIGCEntranceInfo2 = this.LLIZLLLIL;
        String str6 = this.LLILZ;
        String str7 = portraitRecommendedItem.styleId;
        EnumC1419230n2H enumC1419230n2H2 = portraitRecommendedItem.styleType;
        RefImageType refImageType2 = RefImageType.PRESET;
        EnumC550430LiL enumC550430LiL2 = EnumC550430LiL.PRESET;
        EnumC550780Liu enumC550780Liu2 = this.LLILZLL;
        c1687150u0P2.getClass();
        C548880Lfq c548880Lfq2 = C548880Lfq.LIZ;
        C2275191E3p c2275191E3p = C2275191E3p.LJII;
        AwS0S2501000_8 awS0S2501000_82 = new AwS0S2501000_8(str6, str7, enumC1419230n2H2, i, refImageType2, enumC550430LiL2, numValueOf, enumC550780Liu2, 3);
        c548880Lfq2.getClass();
        C548880Lfq.LIZLLL(c2275191E3p, aIGCEntranceInfo2, awS0S2501000_82);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc A[PHI: r2 r5
      0x00bc: PHI (r2v1 com.ss.android.ugc.aweme.portrait.customize.model.PortraitRecommendedItem) = 
      (r2v0 com.ss.android.ugc.aweme.portrait.customize.model.PortraitRecommendedItem)
      (r2v4 com.ss.android.ugc.aweme.portrait.customize.model.PortraitRecommendedItem)
     binds: [B:51:0x00b9, B:24:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r5v2 X.0tzw) = (r5v1 X.0tzw), (r5v6 X.0tzw) binds: [B:51:0x00b9, B:24:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1687160u0Q vQ2(com.ss.android.ugc.aweme.portrait.customize.AIPortraitCustomizeViewModel r20, java.lang.String r21, java.lang.String r22, java.lang.Integer r23, int r24) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.portrait.customize.AIPortraitCustomizeViewModel.vQ2(com.ss.android.ugc.aweme.portrait.customize.AIPortraitCustomizeViewModel, java.lang.String, java.lang.String, java.lang.Integer, int):X.0u0Q");
    }
}
