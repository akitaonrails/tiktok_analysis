package com.ss.android.ugc.aweme.account.login.twostep;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C0XQ5;
import X.C0XZJ;
import X.C1157130gDX;
import X.C1218200ho2;
import X.C1218230ho5;
import X.C1218700hoq;
import X.C1233960iDS;
import X.C1266160j3O;
import X.C1559260qg8;
import X.C15O7;
import X.C20684815ws;
import X.C2344009Gk;
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
import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import com.ss.android.ugc.aweme.account.login.twostep.Device;
import com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesFragmentViewModel;
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
public final class TrustedDevicesFragmentViewModel extends AssemListViewModel<C1218230ho5, C1218200ho2, Integer> {
    public List<Device> LL = new ArrayList();
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1218700hoq.class, (Class<Object>) "trusted_devices_hierarchy_data_key", (String) 13), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 143));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 144));
    public final TwoStepVerificationService LLILZIL = (TwoStepVerificationService) C0XQ5.LIZIZ.LJFF();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1218230ho5(0);
    }

    public final Collection<C1218200ho2> yQ2() {
        ArrayList arrayList = new ArrayList();
        Iterator<Device> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1218200ho2(it2.next()));
        }
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1218200ho2> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 68));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(0, interfaceC1364105Vn);
    }

    public final void vQ2(Long l) {
        setStateImmediate(AFwS257S0000000_19.get$arr$(790));
        TwoStepAuthApi.LIZIZ().removeAuthDevice(String.valueOf(l)).LJ(new C1266160j3O(this, 4), C15O7.LJIIIIZZ, null);
    }

    public final void wQ2(final boolean z) {
        AuthDeviceResponse.Data data;
        List<Device> list;
        setStateImmediate(AFwS257S0000000_19.get$arr$(791));
        AuthDeviceResponse previousAuthDeviceListStatus = this.LLILZIL.getPreviousAuthDeviceListStatus();
        if (previousAuthDeviceListStatus != null && (data = previousAuthDeviceListStatus.data) != null && (list = data.auth_device) != null) {
            this.LL = list;
            this.LLILZIL.setAuthDeviceListStatus(previousAuthDeviceListStatus);
            withState(new AwS385S0200000_19(this, previousAuthDeviceListStatus, 152));
            if (z) {
                C1233960iDS c1233960iDS = C1233960iDS.LIZ;
                String str = (String) this.LLILLL.getValue();
                int size = this.LL.size();
                c1233960iDS.getClass();
                C2344009Gk c2344009GkLIZ = C1233960iDS.LIZ();
                c2344009GkLIZ.LJIIIIZZ("enter_from", str);
                c2344009GkLIZ.LIZJ(size, "trusted_device_cnt");
                C20684815ws.LJIILLIIL("trusted_devices_page_show", c2344009GkLIZ.LIZ);
                return;
            }
            return;
        }
        TwoStepAuthApi.LIZIZ().LIZ().LJ(new InterfaceC2385309Wh() { // from class: X.0iCp
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7<AuthDeviceResponse> c15o7) {
                AuthDeviceResponse.Data data2;
                C1C7U.LIZ("TrustedDevicesFragmentViewModel@7377.fetchTrustDeviceStatus$1");
                if (!C09UZ.LIZLLL(c15o7)) {
                    TrustedDevicesFragmentViewModel trustedDevicesFragmentViewModel = this.LIZ;
                    trustedDevicesFragmentViewModel.getClass();
                    trustedDevicesFragmentViewModel.setState(new AwS598S0100000_19(trustedDevicesFragmentViewModel, 891));
                    C1C7U.LIZIZ("TrustedDevicesFragmentViewModel@7377.fetchTrustDeviceStatus$1");
                    return null;
                }
                AuthDeviceResponse authDeviceResponseLJIIL = c15o7.LJIIL();
                if (u.LJIJI("success", authDeviceResponseLJIIL.message, true) && (data2 = authDeviceResponseLJIIL.data) != null) {
                    List<Device> list2 = data2.auth_device;
                    if (list2 != null) {
                        this.LIZ.LL = list2;
                    }
                    if (z) {
                        C1233960iDS c1233960iDS2 = C1233960iDS.LIZ;
                        String str2 = (String) this.LIZ.LLILLL.getValue();
                        int size2 = this.LIZ.LL.size();
                        c1233960iDS2.getClass();
                        C2344009Gk c2344009GkLIZ2 = C1233960iDS.LIZ();
                        c2344009GkLIZ2.LJIIIIZZ("enter_from", str2);
                        c2344009GkLIZ2.LIZJ(size2, "trusted_device_cnt");
                        C20684815ws.LJIILLIIL("trusted_devices_page_show", c2344009GkLIZ2.LIZ);
                    }
                    TrustedDevicesFragmentViewModel trustedDevicesFragmentViewModel2 = this.LIZ;
                    trustedDevicesFragmentViewModel2.LLILZIL.setAuthDeviceListStatus(authDeviceResponseLJIIL);
                    trustedDevicesFragmentViewModel2.withState(new AwS385S0200000_19(trustedDevicesFragmentViewModel2, authDeviceResponseLJIIL, 152));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TrustedDevicesFragmentViewModel@7377.fetchTrustDeviceStatus$1");
                    return unit;
                }
                TrustedDevicesFragmentViewModel trustedDevicesFragmentViewModel3 = this.LIZ;
                trustedDevicesFragmentViewModel3.getClass();
                trustedDevicesFragmentViewModel3.setState(new AwS598S0100000_19(trustedDevicesFragmentViewModel3, 891));
                C1C7U.LIZIZ("TrustedDevicesFragmentViewModel@7377.fetchTrustDeviceStatus$1");
                return null;
            }
        }, C15O7.LJI, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object onLoadMore(int i, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        C1218230ho5 c1218230ho5 = (C1218230ho5) getState();
        c1218230ho5.getClass();
        List listLIZ = C627260Oiy.LIZ(c1218230ho5);
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

    public static C0XZJ xQ2(TrustedDevicesFragmentViewModel trustedDevicesFragmentViewModel, Integer num, String str, int i) {
        int iIntValue;
        String str2 = str;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        trustedDevicesFragmentViewModel.getClass();
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
