package com.ss.android.ugc.aweme.account.login.twostep;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C0XQ5;
import X.C0XZJ;
import X.C1157130gDX;
import X.C1218240ho6;
import X.C1218710hor;
import X.C1559260qg8;
import X.C15O7;
import X.C316640Cb8;
import X.C317290CcB;
import X.C452501pT;
import X.C627260Oiy;
import X.C627660Ojc;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC2385309Wh;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.RecentDevicesFragmentViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.RecommendDevice;
import com.ss.android.ugc.aweme.account.login.twostep.RecommendDeviceResponse;
import com.ss.android.ugc.aweme.services.TwoStepVerificationService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.text.u;

/* JADX INFO: loaded from: classes20.dex */
public final class RecentDevicesFragmentViewModel extends AssemListViewModel<C1218240ho6, C1157130gDX, Integer> {
    public List<RecommendDevice> LL = new ArrayList();
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1218710hor.class, (Class<Object>) "recent_devices_hierarchy_data_key", (String) 13), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 97));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 98));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 96));
    public final TwoStepVerificationService LLILZLL = (TwoStepVerificationService) C0XQ5.LIZIZ.LJFF();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1218240ho6(0);
    }

    public final Collection<C1157130gDX> xQ2() {
        ArrayList arrayList = new ArrayList();
        Iterator<RecommendDevice> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1157130gDX(it2.next()));
        }
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1157130gDX> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 60));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(0, interfaceC1364105Vn);
    }

    public final void vQ2(final boolean z) {
        if (!z) {
            setStateImmediate(AFwS257S0000000_19.get$arr$(793));
        }
        TwoStepAuthApi.LIZIZ().getRecommendDeviceList(TwoStepAuthApi.LJ("/passport/safe/recommend_device/list/")).LJ(new InterfaceC2385309Wh() { // from class: X.0iCo
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7<RecommendDeviceResponse> c15o7) {
                int iIntValue;
                Integer num;
                RecommendDeviceResponse.Data data;
                C1C7U.LIZ("RecentDevicesFragmentViewModel@b789.fetchRecentDeviceStatus$1");
                if (!C09UZ.LIZLLL(c15o7)) {
                    if (!z) {
                        RecentDevicesFragmentViewModel recentDevicesFragmentViewModel = this;
                        recentDevicesFragmentViewModel.getClass();
                        recentDevicesFragmentViewModel.setState(new AwS598S0100000_19(recentDevicesFragmentViewModel, 895));
                    } else {
                        RecentDevicesFragmentViewModel recentDevicesFragmentViewModel2 = this;
                        recentDevicesFragmentViewModel2.setState(new AwS598S0100000_19(RecentDevicesFragmentViewModel.wQ2(recentDevicesFragmentViewModel2, null, null, 7), 892));
                    }
                    C1C7U.LIZIZ("RecentDevicesFragmentViewModel@b789.fetchRecentDeviceStatus$1");
                    return null;
                }
                RecommendDeviceResponse recommendDeviceResponseLJIIL = c15o7.LJIIL();
                if (u.LJIJI("success", recommendDeviceResponseLJIIL.message, true) && (data = recommendDeviceResponseLJIIL.data) != null) {
                    List<RecommendDevice> list = data.deviceInfo;
                    if (list != null) {
                        this.LL = list;
                    }
                    if (!z) {
                        RecentDevicesFragmentViewModel recentDevicesFragmentViewModel3 = this;
                        recentDevicesFragmentViewModel3.getClass();
                        recentDevicesFragmentViewModel3.withState(new AwS385S0200000_19(recentDevicesFragmentViewModel3, recommendDeviceResponseLJIIL, 154));
                    } else {
                        RecentDevicesFragmentViewModel recentDevicesFragmentViewModel4 = this;
                        recentDevicesFragmentViewModel4.getClass();
                        recentDevicesFragmentViewModel4.withState(new AwS385S0200000_19(recentDevicesFragmentViewModel4, recommendDeviceResponseLJIIL, 153));
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("RecentDevicesFragmentViewModel@b789.fetchRecentDeviceStatus$1");
                    return unit;
                }
                RecommendDeviceResponse.Data data2 = recommendDeviceResponseLJIIL.data;
                if (data2 != null && (num = data2.errorCode) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -2;
                }
                if (!z) {
                    RecentDevicesFragmentViewModel recentDevicesFragmentViewModel5 = this;
                    recentDevicesFragmentViewModel5.getClass();
                    recentDevicesFragmentViewModel5.setState(new AwS598S0100000_19(recentDevicesFragmentViewModel5, 895));
                } else {
                    RecentDevicesFragmentViewModel recentDevicesFragmentViewModel6 = this;
                    recentDevicesFragmentViewModel6.setState(new AwS598S0100000_19(RecentDevicesFragmentViewModel.wQ2(recentDevicesFragmentViewModel6, Integer.valueOf(iIntValue), null, 6), 892));
                }
                C1C7U.LIZIZ("RecentDevicesFragmentViewModel@b789.fetchRecentDeviceStatus$1");
                return null;
            }
        }, C15O7.LJI, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object onLoadMore(int i, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        C1218240ho6 c1218240ho6 = (C1218240ho6) getState();
        c1218240ho6.getClass();
        List listLIZ = C627260Oiy.LIZ(c1218240ho6);
        if (listLIZ == null) {
            listLIZ = new ArrayList();
        }
        c317290CcB.getClass();
        return new C316640Cb8(listLIZ);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(num.intValue(), interfaceC1364105Vn);
    }

    public static C0XZJ wQ2(RecentDevicesFragmentViewModel recentDevicesFragmentViewModel, Integer num, String str, int i) {
        int iIntValue;
        String str2 = str;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        recentDevicesFragmentViewModel.getClass();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -2;
        }
        if (str2 == null) {
            str2 = "";
        }
        return new C0XZJ(iIntValue, str2, EnumC852660Xce.NONE, EnumC852910Xd3.NONE, null, "");
    }
}
