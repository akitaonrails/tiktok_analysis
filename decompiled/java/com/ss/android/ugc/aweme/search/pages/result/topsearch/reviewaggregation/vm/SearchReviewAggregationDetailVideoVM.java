package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm;

import X.AbstractC316870CbV;
import X.AbstractC329610Cw3;
import X.C099G;
import X.C1227904rF;
import X.C13BV;
import X.C15438062q;
import X.C209900rR;
import X.C2189821An6;
import X.C2217401BqU;
import X.C316640Cb8;
import X.C317290CcB;
import X.C627660Ojc;
import X.C665760Q9m;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC636340Oxc;
import X.InterfaceC639620P6y;
import X.InterfaceC660330PvD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS124S1100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS8S1301000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchReviewAggregationDetailVideoVM extends BaseDetailShareVM<C665760Q9m, C209900rR, Integer> {
    public String LLILZIL;
    public int LLILZLL;
    public Map<String, ?> LLIZ;
    public C099G LLJ;
    public final List<InterfaceC639620P6y> LLIZLLLIL = new ArrayList();
    public final C1227904rF LLJI = C1227904rF.LIZ;

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean cannotLoadLatest() {
        return true;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 9;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C665760Q9m(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.C0PDP
    public final List<Aweme> getAwemeList() {
        String str = this.LLILZIL;
        List<Aweme> listCQ2 = str != null ? CQ2(str) : C13BV.INSTANCE;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listCQ2, 10));
        Iterator<Aweme> it2 = listCQ2.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getAid());
        }
        int i = this.LLILZLL;
        int size = listCQ2.size();
        if (i > size) {
            i = size;
        }
        return new ArrayList(listCQ2.subList(0, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final boolean LJIIJJI() {
        Integer num = ((C665760Q9m) getState()).LLILZIL.get(this.LLILZIL);
        int iIntValue = num != null ? num.intValue() : 1;
        int size = zQ2((InterfaceC636340Oxc) getState()).size();
        List<Map<?, ?>> list = ((C665760Q9m) getState()).LLILLJJLI.get(this.LLILZIL);
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        return (iIntValue == 0 && size == list.size()) ? false : true;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    public static List BQ2(List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C209900rR((Aweme) it2.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Aweme> CQ2(String str) {
        List<Aweme> list = ((C665760Q9m) getState()).LLILLL.get(str);
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        List<Map<?, ?>> list2 = ((C665760Q9m) getState()).LLILLJJLI.get(str);
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        if (list.size() < list2.size()) {
            List<Aweme> listFQ2 = FQ2(list2.subList(list.size(), list2.size()));
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(listFQ2);
            setState(new AwS124S1100000_10(str, (String) arrayList, (List<Aweme>) 11));
            return arrayList;
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object DQ2(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r10) {
        /*
            r9 = this;
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.Map<java.lang.String, ?> r1 = r9.LLIZ
            if (r1 == 0) goto L14
            java.lang.String r0 = "extraRequestParams"
            java.util.HashMap r0 = X.C651680PhG.LIZ(r0, r1)
            if (r0 == 0) goto L14
            r8.putAll(r0)
        L14:
            java.lang.String r0 = "keyword"
            java.lang.Object r3 = r8.remove(r0)
            boolean r0 = r3 instanceof java.lang.String
            r2 = 0
            if (r0 == 0) goto L7a
            java.lang.String r3 = (java.lang.String) r3
        L21:
            java.lang.String r0 = "type"
            java.lang.Object r4 = r8.remove(r0)
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L78
            java.lang.Integer r4 = (java.lang.Integer) r4
        L2d:
            java.lang.String r1 = "review_aggregation_unique_id"
            boolean r0 = r8.containsKey(r1)
            if (r0 == 0) goto L76
            java.lang.Object r7 = r8.remove(r1)
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L76
            java.lang.String r7 = (java.lang.String) r7
        L3f:
            java.lang.String r0 = "count"
            java.lang.Object r6 = r8.remove(r0)
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 == 0) goto L74
            java.lang.Integer r6 = (java.lang.Integer) r6
        L4b:
            X.002o r0 = r9.getState()
            X.0Oxc r0 = (X.InterfaceC636340Oxc) r0
            java.util.List r0 = r9.zQ2(r0)
            int r0 = r0.size()
            X.0Q9r r2 = new X.0Q9r
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            kotlin.jvm.internal.AwS624S0100000_10 r1 = new kotlin.jvm.internal.AwS624S0100000_10
            r0 = 79
            r1.<init>(r9, r0)
            r0 = 353(0x161, float:4.95E-43)
            kotlin.jvm.internal.AFwS241S0000000_10 r0 = kotlin.jvm.internal.AFwS241S0000000_10.get$arr$(r0)
            java.lang.Object r0 = r9.HQ2(r2, r1, r0, r10)
            return r0
        L74:
            r6 = r2
            goto L4b
        L76:
            r7 = r2
            goto L3f
        L78:
            r4 = r2
            goto L2d
        L7a:
            r3 = r2
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchReviewAggregationDetailVideoVM.DQ2(X.05Vn):java.lang.Object");
    }

    public final List<Aweme> FQ2(List<? extends Map<?, ?>> list) {
        try {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (Map<?, ?> map : list) {
                this.LLJI.getClass();
                String strLJI = C1227904rF.LJI(map);
                this.LLJI.getClass();
                arrayList.add(C1227904rF.LIZIZ(strLJI, Aweme.class));
            }
            return arrayList;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        Context context = fragment.getContext();
        if (context == null) {
            super.init(fragment);
            return true;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
        viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) new C2217401BqU(this) { // from class: X.0Q9s
            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
        super.init(fragment);
        return true;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C209900rR> c627660Ojc) {
        setState(new AwS589S0100000_10(c627660Ojc, (C627660Ojc<InterfaceC660330PvD>) 328));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchReviewAggregationDetailVideoVM.onRefresh(X.05Vn):java.lang.Object");
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
                if (Intrinsics.LJFF(((C209900rR) it2.next()).LL.getAid(), str)) {
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
        return ((C209900rR) interfaceC1891350zJl).LL;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Number) obj).intValue();
        return DQ2(interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0132 A[Catch: Exception -> 0x0144, TryCatch #1 {Exception -> 0x0144, blocks: (B:64:0x012e, B:66:0x0132, B:45:0x00d3, B:47:0x00d7, B:54:0x00e4, B:56:0x00e8, B:57:0x00eb, B:59:0x00fa, B:61:0x0111), top: B:75:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object HQ2(X.C665810Q9r r22, kotlin.jvm.functions.Function2<? super java.util.List<? extends java.util.Map<?, ?>>, ? super java.lang.Integer, kotlin.Unit> r23, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r24, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r25) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchReviewAggregationDetailVideoVM.HQ2(X.0Q9r, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Integer yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return Integer.valueOf(zQ2((InterfaceC636340Oxc) getState()).size());
    }

    public static void GQ2(SearchReviewAggregationDetailVideoVM searchReviewAggregationDetailVideoVM, String str, List list, C13BV c13bv, Integer num) {
        searchReviewAggregationDetailVideoVM.getClass();
        if (str.length() > 0) {
            searchReviewAggregationDetailVideoVM.setState(new AwS8S1301000_10(str, list, c13bv, num, 1, 0));
        }
    }

    public static AbstractC316870CbV EQ2(int i, int i2, List list, List list2, int i3, Function2 function2) {
        int i4;
        int i5 = 0;
        if (i3 == 0 && i + i2 >= list.size()) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        if (i >= 0) {
            i5 = i;
        }
        int i6 = i2 + i;
        int size = list.size();
        if (i6 > size) {
            i6 = size;
        }
        List listBQ2 = BQ2(list2.subList(i5, i6));
        function2.invoke(list.subList(i5, i6), Integer.valueOf(i4));
        if (i4 == 1) {
            return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, Integer.valueOf(i), listBQ2, 1);
        }
        AbstractC316870CbV.LIZ.getClass();
        return new C316640Cb8(listBQ2);
    }
}
