package com.ss.android.ugc.aweme.tako.aivideo.detail.repo;

import X.AbstractC316870CbV;
import X.AbstractC329610Cw3;
import X.C01GW;
import X.C0KBN;
import X.C13LP;
import X.C13LQ;
import X.C1954807lC;
import X.C20603715jn;
import X.C209300rL;
import X.C2189821An6;
import X.C2217401BqU;
import X.C326490Cr1;
import X.C326500Cr2;
import X.C452501pT;
import X.C627660Ojc;
import X.EnumC323450Cm7;
import X.InterfaceC0148002o;
import X.InterfaceC1209780haS;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC326650CrH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoAIVideoFeedViewModel extends BaseDetailShareVM<C326490Cr1, C209300rL, Integer> implements InterfaceC326650CrH {
    public static final Set<Integer> LLJI = C13LQ.LJLIIL(new Integer[]{0, 55});
    public int LLILZIL;
    public volatile boolean LLIZ;
    public boolean LLIZLLLIL;
    public volatile boolean LLILZLL = true;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2034));

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean cannotLoadLatest() {
        return true;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 73;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326490Cr1(0);
    }

    public static List DQ2(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (LLJI.contains(Integer.valueOf(((C209300rL) obj).LL.getAwemeType()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C326530Cr5
            if (r0 == 0) goto L21
            r3 = r8
            X.0Cr5 r3 = (X.C326530Cr5) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r6 = r3.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L2f
            if (r0 != r5) goto L27
            goto L3b
        L21:
            X.0Cr5 r3 = new X.0Cr5
            r3.<init>(r7, r8)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r6)
            r3.LLILLL = r5     // Catch: java.lang.Exception -> Lae
            java.lang.Object r6 = r7.EQ2(r4, r3)     // Catch: java.lang.Exception -> Lae
            if (r6 != r1) goto L3e
            return r1
        L3b:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> Lae
        L3e:
            com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse r6 = (com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse) r6     // Catch: java.lang.Exception -> Lae
            if (r6 != 0) goto L56
            r7.LLILZLL = r4     // Catch: java.lang.Exception -> Lae
            X.0CcB r2 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> Lae
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Exception -> Lae
            java.lang.String r0 = "loadMoreVideoList failed"
            r1.<init>(r0)     // Catch: java.lang.Exception -> Lae
            r2.getClass()     // Catch: java.lang.Exception -> Lae
            X.0Cb9 r0 = new X.0Cb9     // Catch: java.lang.Exception -> Lae
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lae
            return r0
        L56:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r6.awemeList     // Catch: java.lang.Exception -> Lae
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lae
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)     // Catch: java.lang.Exception -> Lae
            r3.<init>(r0)     // Catch: java.lang.Exception -> Lae
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> Lae
        L67:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Lae
            if (r0 == 0) goto L7c
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> Lae
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1     // Catch: java.lang.Exception -> Lae
            X.00rL r0 = new X.00rL     // Catch: java.lang.Exception -> Lae
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lae
            r3.add(r0)     // Catch: java.lang.Exception -> Lae
            goto L67
        L7c:
            java.util.List r3 = DQ2(r3)     // Catch: java.lang.Exception -> Lae
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r6.awemeList     // Catch: java.lang.Exception -> Lae
            int r1 = r0.size()     // Catch: java.lang.Exception -> Lae
            r7.LLILZIL = r1     // Catch: java.lang.Exception -> Lae
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> Lae
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> Lae
            r0 = r0 ^ 1
            if (r0 != 0) goto L94
            r5 = 0
        L94:
            r7.LLILZLL = r5     // Catch: java.lang.Exception -> Lae
            if (r0 == 0) goto L99
            goto L9b
        L99:
            r2 = 0
            goto L9f
        L9b:
            java.lang.Integer r2 = X.C2286608xc.LJ(r1)     // Catch: java.lang.Exception -> Lae
        L9f:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> Lae
            java.lang.Integer r1 = X.C2286608xc.LJ(r1)     // Catch: java.lang.Exception -> Lae
            r0.getClass()     // Catch: java.lang.Exception -> Lae
            X.0Cm0 r0 = new X.0Cm0     // Catch: java.lang.Exception -> Lae
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Exception -> Lae
            return r0
        Lae:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            r7.LLILZLL = r4
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoFeedViewModel.CQ2(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        Context context;
        super.bindView(interfaceC1209780haS);
        Fragment fragment = this.LLILLL;
        if (((fragment != null && (context = fragment.getContext()) != null) || (context = interfaceC1209780haS.getFragment().getContext()) != null) && !this.LLIZLLLIL) {
            this.LLIZLLLIL = true;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZJ = false;
            c20603715jn.LJIIJ = true;
            c20603715jn.LIZ = 3;
            viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
            setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
            viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) new C2217401BqU(this) { // from class: X.0Cr3
                @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
                public final Object get() {
                    return ((AssemListViewModel) this.receiver).getConfig();
                }
            }.get());
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C209300rL> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 133));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        this.LLILZLL = true;
        return BQ2(0, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((C209300rL) it2.next()).LL.getAid(), str)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        return ((C209300rL) interfaceC1891350zJl).LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(int r8, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r9) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoFeedViewModel.BQ2(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029 A[PHI: r4
      0x0029: PHI (r4v6 com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse) = 
      (r4v4 com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse)
      (r4v8 com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse)
     binds: [B:27:0x005a, B:13:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object EQ2(boolean r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C326540Cr6
            if (r0 == 0) goto L73
            r5 = r8
            X.0Cr6 r5 = (X.C326540Cr6) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L73
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L45
            if (r0 == r1) goto L55
            if (r0 != r2) goto L7a
            X.C155000ia.LIZIZ(r4)
        L25:
            com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse r4 = (com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse) r4
            if (r4 == 0) goto L79
        L29:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r4.awemeList
            java.util.Iterator r1 = r0.iterator()
        L2f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.util.List r0 = r0.getBanners()
            if (r0 == 0) goto L2f
            r0.clear()
            goto L2f
        L45:
            X.C155000ia.LIZIZ(r4)
            if (r7 == 0) goto L5c
            X.0CrF r0 = X.C326630CrF.LIZ
            r5.LLILLL = r1
            java.lang.Object r4 = r0.LIZIZ(r5)
            if (r4 != r3) goto L58
            return r3
        L55:
            X.C155000ia.LIZIZ(r4)
        L58:
            com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse r4 = (com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse) r4
            if (r4 != 0) goto L29
        L5c:
            X.01GW r0 = r6.LLJ
            java.lang.Object r0 = r0.getValue()
            X.0SvR r0 = (X.InterfaceC736910SvR) r0
            X.00hg r0 = r0.getOperator()
            X.0Cr7 r0 = (X.InterfaceC326550Cr7) r0
            r5.LLILLL = r2
            java.lang.Object r4 = r0.z(r5)
            if (r4 != r3) goto L25
            return r3
        L73:
            X.0Cr6 r5 = new X.0Cr6
            r5.<init>(r6, r8)
            goto L12
        L79:
            return r4
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoFeedViewModel.EQ2(boolean, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC326650CrH
    public final boolean j9(int i, Aweme aweme) {
        String aid;
        if (!this.LLILZLL || aweme == null || (aid = aweme.getAid()) == null || i <= 0) {
            return false;
        }
        ArrayList arrayList = (ArrayList) getAwemeList();
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(((Aweme) it2.next()).getAid(), aid)) {
                if (i2 >= 0 && i2 >= i - 3) {
                    return true;
                }
            } else {
                i2++;
            }
        }
        return false;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadLatest(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Number) obj).intValue();
        this.LLILZLL = true;
        return CQ2(interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return BQ2(((Number) obj).intValue(), interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final List<C209300rL> onLoadPageAddData(EnumC323450Cm7 enumC323450Cm7, List<C209300rL> list, List<C209300rL> list2) {
        int i = C326500Cr2.LIZ[enumC323450Cm7.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    HashSet hashSet = new HashSet();
                    Iterator<C209300rL> it2 = list.iterator();
                    while (it2.hasNext()) {
                        hashSet.add(it2.next().LL.getAid());
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C209300rL c209300rL : list2) {
                        if (!hashSet.contains(c209300rL.LL.getAid())) {
                            arrayList.add(c209300rL);
                        }
                    }
                    return C13LP.LJLIL(list, arrayList);
                }
                throw new C1954807lC();
            }
            HashSet hashSet2 = new HashSet();
            Iterator<C209300rL> it3 = list.iterator();
            while (it3.hasNext()) {
                hashSet2.add(it3.next().LL.getAid());
            }
            ArrayList arrayList2 = new ArrayList();
            for (C209300rL c209300rL2 : list2) {
                if (!hashSet2.contains(c209300rL2.LL.getAid())) {
                    arrayList2.add(c209300rL2);
                }
            }
            return C13LP.LJLIL(arrayList2, list);
        }
        return list2;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Integer yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        int i3;
        if (i != 1 && i == 4) {
            i3 = this.LLILZIL;
        } else {
            i3 = 0;
        }
        return Integer.valueOf(i3);
    }
}
