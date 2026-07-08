package com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address;

import X.AnonymousClass0408;
import X.C004I;
import X.C034S;
import X.C036E;
import X.C03FA;
import X.C09JN;
import X.C1120604Zw;
import X.C11S5;
import X.C123100dR;
import X.C13BV;
import X.C13LP;
import X.C1701940uOG;
import X.C1741890vQh;
import X.C1744340vUe;
import X.C1747870vaL;
import X.C1AQS;
import X.C238400w2;
import X.C817603Hi;
import X.C955103oL;
import X.C973303rH;
import X.C980703sT;
import X.InterfaceC1744330vUd;
import X.InterfaceC1748810vbr;
import X.InterfaceC746802vq;
import Y.AfS0S0100100_1;
import Y.AfS0S0200100_1;
import Y.AfS39S1100000_1;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressSku;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.GetShippingAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.event.ZipcodeLocateAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryRequest;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictRequest;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS16S0001000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS3S1310000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS89S0110000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class AddressSelectViewModel extends JediViewModel<AddressSelectState> {
    public DeliveryPanelStarter.EnterParam LLILZIL;
    public int LLILZLL;
    public DeliveryData LLIZ;
    public String LLIZLLLIL;
    public DeliveryPanelStarter.EnterParamForProductDetailPage LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public Integer LLJILJILJ;
    public DeliveryRequest LLJILJIL = new DeliveryRequest(null, null, null, null, null, null, null);
    public List<? extends Object> LLJILLL = C13BV.INSTANCE;
    public long LLJJ = -1;
    public int LLJJI = 1;
    public final C817603Hi LLJJIII = new C817603Hi();

    public void hR2(ReachableAddress reachableAddress) {
    }

    public final ChangeLocationData lR2() {
        C973303rH.LL.getClass();
        ChangeLocationData changeLocationData = C973303rH.LLILZLL;
        if (changeLocationData != null) {
            return changeLocationData;
        }
        DeliveryData deliveryData = this.LLIZ;
        if (deliveryData != null) {
            return deliveryData.changeLocationData;
        }
        return null;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new AddressSelectState(null, 0, null, null, false, 0, null, null, null, null, 1023, null);
    }

    public final void SB1(int i) {
        setState(new AwS16S0001000_1(i, 2));
    }

    public void jR2(List<? extends Object> list) {
        this.LLJILLL = list;
        this.LLJIJIL = 0;
        setStateImmediate(new AwS580S0100000_1(list, (List<InterfaceC746802vq>) 72));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [long] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final void kR2(Function1<? super AddressListData, Unit> function1) {
        IECommerceHostService iECommerceHostService;
        ?? ElapsedRealtime;
        ?? r3;
        String str;
        List listSingletonList;
        Integer num;
        boolean z;
        String name;
        Integer num2 = null;
        int iIntValue = 0;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            ElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(ElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        ((IApplicationDependencyService) iECommerceHostService).getApplication();
        try {
            ElapsedRealtime = this;
            r3 = ElapsedRealtime;
            if (C036E.LIZ.LIZIZ()) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ElapsedRealtime.SB1(0);
                int iLJIIJJI = AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(null), "shipping_info", null, null, 12);
                DeliveryPanelStarter.EnterParam enterParam = ElapsedRealtime.LLILZIL;
                if (enterParam != null) {
                    str = enterParam.productId;
                } else {
                    str = null;
                }
                if (C123100dR.LIZ(str) && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                    listSingletonList = Collections.singletonList(new AddressSku(str, null, null));
                } else {
                    listSingletonList = null;
                }
                C980703sT c980703sT = AddressApi.LIZ;
                DeliveryPanelStarter.EnterParam enterParam2 = ElapsedRealtime.LLILZIL;
                if (enterParam2 != null) {
                    num2 = enterParam2.scene;
                }
                if (enterParam2 != null && (num = enterParam2.entranceScene) != null) {
                    iIntValue = num.intValue();
                }
                GetShippingAddressRequest getShippingAddressRequest = new GetShippingAddressRequest(null, null, null, null, listSingletonList, num2, null, Integer.valueOf(iIntValue), Integer.valueOf(iLJIIJJI), C1747870vaL.LIZ);
                c980703sT.getClass();
                ElapsedRealtime.disposeOnClear(C980703sT.LIZJ(getShippingAddressRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS0S0200100_1(ElapsedRealtime, jElapsedRealtime, function1, 0), new AfS0S0100100_1(ElapsedRealtime, jElapsedRealtime, 0)));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            r3 = ElapsedRealtime;
        }
        r3.mR2(0L, "", false);
        r3.SB1(2);
    }

    public final void pR2(String str) {
        List listSingletonList;
        Region region;
        String str2;
        if (str != null && str.length() != 0) {
            ChangeLocationData changeLocationDataLR2 = lR2();
            if (changeLocationDataLR2 == null || (region = changeLocationDataLR2.region) == null || (str2 = region.geoNameId) == null || (listSingletonList = Collections.singletonList(str2)) == null) {
                listSingletonList = C13BV.INSTANCE;
            }
            SearchDistrictRequest searchDistrictRequest = new SearchDistrictRequest(2, listSingletonList, str, 0, null, C1747870vaL.LIZ);
            InterfaceC1744330vUd.LIZ.getClass();
            disposeOnClear(C1744340vUe.LIZ(searchDistrictRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS39S1100000_1(this, str, 0), new C09JN() { // from class: X.03qm
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("AddressSelectViewModel@235c.searchLocationByZipcode$2");
                    C1019103yf.LIZ(EnumC1014603xw.ERR69, (Throwable) obj, null);
                    C1C7U.LIZIZ("AddressSelectViewModel@235c.searchLocationByZipcode$2");
                }
            }));
        }
    }

    public final void qR2(ReachableAddress reachableAddress) {
        setStateImmediate(new AwS580S0100000_1(reachableAddress, 73));
        if (this.LLJI) {
            if (reachableAddress != null) {
                hR2(reachableAddress);
                return;
            }
            return;
        }
        this.LLJI = true;
    }

    public static void nR2(String str, boolean z) {
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_zipcode_locate_address", C1741890vQh.LJIIIIZZ(new ZipcodeLocateAddress(0, str, null, null, null, Boolean.valueOf(z))));
    }

    public static void rR2(AddressSelectViewModel addressSelectViewModel, List list) {
        addressSelectViewModel.getClass();
        if (!list.isEmpty()) {
            addressSelectViewModel.setState(new AwS210S0300000_1((Integer) null, (Integer) addressSelectViewModel, (AddressSelectViewModel) list, (List<Region>) 116));
        }
    }

    public static void sR2(AddressSelectViewModel addressSelectViewModel, Integer num) {
        addressSelectViewModel.getClass();
        addressSelectViewModel.setState(new AwS89S0110000_1(true, num, 31));
    }

    public final void oR2(String str, List list) {
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_zipcode_locate_address", C1741890vQh.LJIIIIZZ(new ZipcodeLocateAddress(1, null, lR2(), list, str, null)));
    }

    public final void mR2(long j, String str, boolean z) {
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = SystemClock.elapsedRealtime() - j;
        C238400w2 c238400w22 = new C238400w2();
        c238400w22.element = SystemClock.elapsedRealtime() - this.LLJJ;
        if (!z) {
            c238400w22.element = 0L;
            c238400w2.element = 0L;
        }
        setState(new AwS3S1310000_1(z, str, c238400w2, c238400w22, this, 2));
    }

    public static void iR2(AddressSelectViewModel addressSelectViewModel, Context context, InterfaceC1748810vbr interfaceC1748810vbr, Address address, int i) {
        String str;
        List listSingletonList;
        Address address2;
        Integer num;
        List<ReachableAddress> list;
        ReachableAddress reachableAddress;
        Region region;
        Address address3 = address;
        String strLIZJ = null;
        if ((i & 4) != 0) {
            str = null;
        } else {
            str = "c7295.d4806";
        }
        if ((i & 8) != 0) {
            address3 = null;
        }
        addressSelectViewModel.getClass();
        HashMap map = new HashMap(C03FA.LIZIZ);
        map.put("previous_page", "logistics");
        AddressPageStarter addressPageStarter = AddressPageStarter.LIZ;
        ChangeLocationData changeLocationDataLR2 = addressSelectViewModel.lR2();
        if (changeLocationDataLR2 != null && (region = changeLocationDataLR2.region) != null) {
            listSingletonList = Collections.singletonList(region);
        } else {
            listSingletonList = null;
        }
        String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map);
        DeliveryData deliveryData = addressSelectViewModel.LLIZ;
        if (deliveryData != null && (list = deliveryData.addresses) != null && (reachableAddress = (ReachableAddress) C13LP.LJJJLZIJ(0, list)) != null) {
            address2 = reachableAddress.address;
        } else {
            address2 = null;
        }
        DeliveryPanelStarter.EnterParam enterParam = addressSelectViewModel.LLILZIL;
        if (enterParam != null) {
            num = enterParam.freeShipping;
        } else {
            num = null;
        }
        if (str != null) {
            strLIZJ = addressSelectViewModel.LLJJIII.LIZJ(str, null);
        }
        AddressPageStarter.LIZ(addressPageStarter, context, interfaceC1748810vbr, address3, listSingletonList, true, strLJIIIIZZ, null, null, null, false, 0, null, null, null, num, address2, null, null, 0, false, strLIZJ, null, null, false, null, null, null, null, null, null, 1072185280);
    }
}
