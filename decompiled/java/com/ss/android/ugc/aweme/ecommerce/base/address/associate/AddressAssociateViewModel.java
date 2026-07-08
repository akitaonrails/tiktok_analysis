package com.ss.android.ugc.aweme.ecommerce.base.address.associate;

import X.C004I;
import X.C034S;
import X.C036E;
import X.C1019103yf;
import X.C1120604Zw;
import X.C1746480vY6;
import X.C1746780vYa;
import X.C1746840vYg;
import X.C1747440vZe;
import X.C19EH;
import X.C1AQS;
import X.C1C7U;
import X.C23271099x;
import X.C259800zU;
import X.C948503nH;
import X.EnumC1014603xw;
import X.InterfaceC1747220vZI;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailFragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressAssociateViewModel extends JediViewModel<AddressAssociateState> {
    public AddressPageStarter.AddressAssociateEnterParams LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public Address LLJ;
    public String LLJI;
    public long LLJIJIL;
    public HashMap<String, Object> LLJILJIL;
    public String LLJILLL;
    public final AddressAssociateViewModel$handler$1 LLJJI;
    public final int LLILZIL = 1;
    public final C1746780vYa LLJILJILJ = new C1746780vYa();
    public final Set<String> LLJJ = new LinkedHashSet();

    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address] */
    public final void iR2() {
        IECommerceHostService iECommerceHostService;
        this.LLJJ.clear();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = this.LLJ;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        ((IApplicationDependencyService) iECommerceHostService).getApplication();
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (c259800zU.element == 0) {
                    setState(AFwS268S0000000_26.get$arr$(141));
                    return;
                } else {
                    C948503nH.LJFF(this, C23271099x.INSTANCE, new C1746480vY6(this, c259800zU, null));
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        setState(AFwS268S0000000_26.get$arr$(140));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new AddressAssociateState(null, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateViewModel$handler$1] */
    public AddressAssociateViewModel() {
        final Looper mainLooper = Looper.getMainLooper();
        this.LLJJI = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateViewModel$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("AddressAssociateViewModel@9920.handler$1");
                message.getCallback().run();
                C1C7U.LIZIZ("AddressAssociateViewModel@9920.handler$1");
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void hR2(AddressAssociateFragment addressAssociateFragment, CandInputData candInputData, String str) {
        Address address;
        String str2;
        Integer num;
        int i;
        Integer num2;
        String str3;
        String str4;
        Integer num3;
        int iIntValue;
        List<String> list;
        Integer num4;
        C19EH c19ehLJIIJ;
        Integer num5;
        if (candInputData == null || (address = candInputData.address) == null) {
            address = this.LLJ;
        }
        AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams = this.LLILZLL;
        Object obj = null;
        if (addressAssociateEnterParams != null) {
            str2 = addressAssociateEnterParams.enterFrom;
        } else {
            str2 = null;
        }
        int i2 = 2;
        if (Intrinsics.LJFF(str2, "shipping_address")) {
            AddressMapDetailFragment addressMapDetailFragment = new AddressMapDetailFragment();
            if (Intrinsics.LJFF(str, "search")) {
                i2 = 3;
            } else if (!Intrinsics.LJFF(str, "candidate")) {
                i2 = 0;
            }
            AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams2 = this.LLILZLL;
            if (addressAssociateEnterParams2 != null) {
                str3 = addressAssociateEnterParams2.trackParams;
            } else {
                str3 = null;
            }
            if (candInputData != null) {
                str4 = candInputData.autocompleteAddressId;
                num3 = candInputData.placeType;
            } else {
                str4 = null;
                num3 = null;
            }
            String str5 = this.LLIZLLLIL;
            if (addressAssociateEnterParams2 != null && (num5 = addressAssociateEnterParams2.isFullPage) != null) {
                iIntValue = num5.intValue();
            } else {
                iIntValue = 1;
            }
            AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams3 = this.LLILZLL;
            if (addressAssociateEnterParams3 != null) {
                obj = addressAssociateEnterParams3.containerId;
                list = addressAssociateEnterParams3.needUpdateDistricts;
            } else {
                list = null;
            }
            addressMapDetailFragment.LLILZIL = new AddressPageStarter.AddressMapDetailEnterParams(Integer.valueOf(i2), (Integer) 1, address, str3, "suggested_address_list", "suggested_address_list", str4, num3, address, str5, (Integer) obj, Integer.valueOf(iIntValue), (List) list, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
            addressMapDetailFragment.LLJLL = addressAssociateFragment.LLJJIJI;
            try {
                AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams4 = this.LLILZLL;
                if (addressAssociateEnterParams4 != null && (num4 = addressAssociateEnterParams4.containerId) != null) {
                    int iIntValue2 = num4.intValue();
                    FragmentManager fragmentManagerWR = addressAssociateFragment.WR();
                    if (fragmentManagerWR != null && (c19ehLJIIJ = fragmentManagerWR.LJIIJ()) != null) {
                        c19ehLJIIJ.LIZJ(iIntValue2, addressMapDetailFragment, "address_map_detail_fragment");
                        c19ehLJIIJ.LJII("address_map_detail_fragment");
                        c19ehLJIIJ.LJIIJ();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1019103yf.LIZ(EnumC1014603xw.ERR20007, th, null);
            }
        } else {
            String str6 = null;
            if (Intrinsics.LJFF(str2, "trajectory_map_for_address")) {
                C1746840vYg c1746840vYgLIZ = C1747440vZe.LIZ();
                if (candInputData != null) {
                    obj = candInputData.autocompleteAddressId;
                    num = candInputData.placeType;
                } else {
                    num = null;
                }
                String str7 = this.LLIZLLLIL;
                if (Intrinsics.LJFF(str, "search")) {
                    i = 3;
                } else if (Intrinsics.LJFF(str, "candidate")) {
                    i = 2;
                } else {
                    i = 0;
                }
                AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams5 = this.LLILZLL;
                if (addressAssociateEnterParams5 != null) {
                    num2 = addressAssociateEnterParams5.sourcePage;
                } else {
                    num2 = null;
                }
                if (candInputData != null) {
                    str6 = candInputData.daInfo;
                }
                Iterator it2 = ((ArrayList) c1746840vYgLIZ.LIZ).iterator();
                while (it2.hasNext()) {
                    address = address;
                    ((InterfaceC1747220vZI) it2.next()).LIZJ(address, obj, num, str7, i, num2, str6);
                }
            }
        }
        withState(new AwS605S0100000_26(this, 142));
    }
}
