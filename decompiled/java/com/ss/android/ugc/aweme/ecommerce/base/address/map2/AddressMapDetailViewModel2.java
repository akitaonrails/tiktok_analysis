package com.ss.android.ugc.aweme.ecommerce.base.address.map2;

import X.C1019103yf;
import X.C1177960gl8;
import X.C1556630qbt;
import X.C1746690vYR;
import X.C19EH;
import X.C817603Hi;
import X.EnumC1014603xw;
import X.InterfaceC0148002o;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressMapDetailViewModel2 extends AssemViewModel<C1556630qbt> {
    public AddressPageStarter.AddressMapDetailEnterParams LL;
    public Address LLILLJJLI;
    public InputItemData LLILLL;
    public long LLILZ;
    public String LLILZIL;
    public HashMap<String, Object> LLILZLL;
    public boolean LLIZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1556630qbt(0);
    }

    public final void vQ2() {
        C1746690vYR c1746690vYR = C1746690vYR.LIZ;
        String str = this.LLILZIL;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - this.LLILZ);
        c1746690vYR.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("quit_type", str);
        if (lValueOf != null) {
            linkedHashMap.put("stay_time", Long.valueOf(lValueOf.longValue()));
        }
        C1746690vYR.LIZJ("tiktokec_stay_page", linkedHashMap);
    }

    public AddressMapDetailViewModel2() {
        new C817603Hi();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.ss.android.ugc.aweme.ecommerce.base.address.dto.LocationUseBar, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function0<kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final void wQ2(AddressMapDetailFragment2 addressMapDetailFragment2) {
        Integer num;
        Address addressLIZIZ;
        ?? r8;
        ?? r12;
        ?? r14;
        ?? r2;
        C19EH c19ehLJIIJ;
        C1177960gl8 c1177960gl8;
        AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams = this.LL;
        if (addressMapDetailEnterParams != null && (num = addressMapDetailEnterParams.containerId) != null) {
            int iIntValue = num.intValue();
            ?? r13 = 0;
            r13 = 0;
            if (addressMapDetailFragment2 != null && (c1177960gl8 = addressMapDetailFragment2.LLIZLLLIL) != null) {
                Address address = this.LLILLJJLI;
                if (address != null) {
                    r13 = 0;
                    addressLIZIZ = Address.LIZIZ(address, null, null, null, null, null, String.valueOf(c1177960gl8.lon), String.valueOf(c1177960gl8.lat), 2559);
                } else {
                    addressLIZIZ = null;
                }
            } else {
                addressLIZIZ = this.LLILLJJLI;
            }
            AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams2 = this.LL;
            if (addressMapDetailEnterParams2 != null) {
                r8 = addressMapDetailEnterParams2.trackParams;
            } else {
                r8 = r13;
            }
            String str = "trajectory_map_for_address";
            String str2 = "trajectory_map_for_address";
            Integer numValueOf = Integer.valueOf(iIntValue);
            AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams3 = this.LL;
            if (addressMapDetailEnterParams3 != null) {
                r12 = addressMapDetailEnterParams3.isFullPage;
            } else {
                r12 = r13;
            }
            if (addressMapDetailEnterParams3 != null) {
                r14 = addressMapDetailEnterParams3.needUpdateDistricts;
            } else {
                r14 = r13;
            }
            AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams = new AddressPageStarter.AddressAssociateEnterParams(addressLIZIZ, r8, str, str2, numValueOf, r12, r13, r14, 1, r13, 576);
            AddressAssociateFragment addressAssociateFragment = new AddressAssociateFragment();
            addressAssociateFragment.LLJJIJIIJIL = addressAssociateEnterParams;
            if (addressMapDetailFragment2 != null) {
                r2 = addressMapDetailFragment2.LLJJJIL;
            } else {
                r2 = r13;
            }
            addressAssociateFragment.LLJJIJI = r2;
            if (addressMapDetailFragment2 != null) {
                try {
                    FragmentManager fragmentManagerVR = addressMapDetailFragment2.VR();
                    if (fragmentManagerVR != null && (c19ehLJIIJ = fragmentManagerVR.LJIIJ()) != null) {
                        c19ehLJIIJ.LIZJ(iIntValue, addressAssociateFragment, "address_associate_fragment");
                        c19ehLJIIJ.LJII("address_associate_fragment");
                        c19ehLJIIJ.LJIIJ();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1019103yf.LIZ(EnumC1014603xw.ERR20008, e, r13);
                }
            }
            withState(new AwS605S0100000_26(this, 184));
        }
    }
}
