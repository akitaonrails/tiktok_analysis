package com.ss.android.ugc.aweme.series.feed.profile.viewmodel;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C1155750gBJ;
import X.C13LP;
import X.C15438062q;
import X.C1567820qtw;
import X.C1572840r22;
import X.C1572990r2H;
import X.C1573870r3h;
import X.C1574470r4f;
import X.C2097608Jq;
import X.C279310Ax7;
import X.C452501pT;
import X.C627660Ojc;
import X.C916803iA;
import X.EnumC1573550r3B;
import X.EnumC1574490r4h;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1572780r1w;
import X.InterfaceC1891350zJl;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.api.IAccountUtilsService;
import com.ss.android.ugc.aweme.appdiff.SeriesProfileTabViewModelAppDiffService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesProfileTabViewModel extends AssemListViewModel<C1572990r2H, C1572840r22, Long> {
    public static final /* synthetic */ int LLILZLL = 0;
    public final MutableLiveData<C1567820qtw<Boolean>> LL = new MutableLiveData<>(new C1567820qtw(Boolean.FALSE));
    public final HashSet<Long> LLILLJJLI = new HashSet<>();
    public final HashSet<InterfaceC1572780r1w> LLILLL = new HashSet<>();
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(286));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(285));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1572990r2H(0);
    }

    public SeriesProfileTabViewModel() {
        new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1155750gBJ.class, (Class<Object>) "series_profile_hierarchy_data_key", (String) 13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean vQ2() {
        IAccountUtilsService iAccountUtilsServiceLIZ = C916803iA.LIZ();
        return Intrinsics.LJFF(iAccountUtilsServiceLIZ != null ? iAccountUtilsServiceLIZ.getCurUserId() : null, String.valueOf(((C1572990r2H) getState()).LL));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1572840r22> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 206));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent.LJIIJJI(MiniDramaPagePerformanceMonitor.LIZ(EnumC1573550r3B.PROFILE_TAB));
        return yQ2(0L, interfaceC1364105Vn);
    }

    public final void xQ2(List<C1572840r22> list) {
        int iIntValue = ((Number) C279310Ax7.LIZ.getValue()).intValue();
        if (iIntValue <= 0 || vQ2()) {
            return;
        }
        List listLL = C13LP.LL(list, iIntValue);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
        Iterator it2 = listLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((C1572840r22) it2.next()).LL));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) obj).longValue() > 0) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        Map<EnumC1574490r4h, Map<String, Aweme>> map = C1574470r4f.LIZ;
        C1574470r4f.LIZ(EnumC1574490r4h.OTHERS_HOMEPAGE, arrayList2, Integer.valueOf(CastIntegerProtector.parseInt("1")));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return yQ2(l.longValue(), interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor$PagePerformanceEvent] */
    /* JADX WARN: Type inference failed for: r35v0, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.series.feed.profile.viewmodel.SeriesProfileTabViewModel] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor$PagePerformanceEvent] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(long r36, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r38) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.profile.viewmodel.SeriesProfileTabViewModel.yQ2(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void wQ2(SeriesProfileTabViewModel seriesProfileTabViewModel, Long l, Long l2, String str, boolean z, boolean z2) {
        long jLongValue;
        String str2;
        seriesProfileTabViewModel.getClass();
        C1573870r3h c1573870r3h = C1573870r3h.LIZ;
        SeriesProfileTabViewModelAppDiffService seriesProfileTabViewModelAppDiffService = (SeriesProfileTabViewModelAppDiffService) seriesProfileTabViewModel.LLILZIL.getValue();
        seriesProfileTabViewModelAppDiffService.LIZ();
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long lValueOf = Long.valueOf(jLongValue);
        Pair[] pairArr = new Pair[3];
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("EXTRA_USER_SELECTED", str2);
        pairArr[1] = new Pair(FollowStatusChangeMethod.PARAM_UID, str);
        pairArr[2] = new Pair("should_resume_play", Boolean.valueOf(z2));
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c1573870r3h.getClass();
        C1573870r3h.LIZ("others_homepage", lValueOf, l2, null, mapLJIIIIZZ, false, "", false);
    }
}
