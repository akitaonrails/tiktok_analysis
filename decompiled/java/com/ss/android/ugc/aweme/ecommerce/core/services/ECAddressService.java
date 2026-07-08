package com.ss.android.ugc.aweme.ecommerce.core.services;

import X.C01GW;
import X.C098200Yq;
import X.C0PEM;
import X.C13LP;
import X.C189200o6;
import X.C23250099c;
import X.C452501pT;
import X.C817503Hh;
import X.C934803l4;
import X.C953403o4;
import X.C979703sJ;
import X.C980103sN;
import X.C993603uY;
import X.InterfaceC1164530gPT;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECAddressService;
import com.ss.android.ugc.aweme.ecommerce.service.AddressChangeResult;
import com.ss.android.ugc.aweme.ecommerce.service.AddressSelectResult;
import com.ss.android.ugc.aweme.ecommerce.service.HostAddressSnapshot;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressSelectCallback;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes2.dex */
public final class ECAddressService implements IECommerceAddressService {
    public IECommerceAddressSelectCallback LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(134));
    public final C979703sJ LIZJ = new InterfaceC1164530gPT() { // from class: X.03sJ
        @Override // X.InterfaceC1164530gPT
        public final void onEvent(String str, String str2) {
            HostAddressSnapshot hostAddressSnapshotLJIIIIZZ;
            IECommerceAddressSelectCallback iECommerceAddressSelectCallback = this.LL.LIZ;
            if (iECommerceAddressSelectCallback == null) {
                return;
            }
            String str3 = null;
            if (Intrinsics.LJFF(str, "ec_address_select")) {
                this.LL.getClass();
                ReachableAddress reachableAddress = C862003Yk.LIZ(str2).address;
                if (reachableAddress != null && (hostAddressSnapshotLJIIIIZZ = ECAddressService.LJIIIIZZ(reachableAddress, true)) != null) {
                    iECommerceAddressSelectCallback.onSelected(new AddressSelectResult(hostAddressSnapshotLJIIIIZZ));
                    this.LL.LJFF();
                    return;
                }
                return;
            }
            if (!Intrinsics.LJFF(str, "ec_address_change")) {
                return;
            }
            this.LL.getClass();
            AddressPageStarter.AddressEvent addressEventLIZ = C862003Yk.LIZ(str2);
            int i = addressEventLIZ.type;
            String str4 = addressEventLIZ.addressId;
            if (!a0.LJJJIL(str4)) {
                str3 = str4;
            }
            iECommerceAddressSelectCallback.onAddressChanged(new AddressChangeResult(i, str3));
        }
    };

    public final void LJFF() {
        this.LIZ = null;
        IEventCenter iEventCenterLJII = LJII();
        if (iEventCenterLJII != null) {
            iEventCenterLJII.LIZJ("ec_address_select", this.LIZJ);
        }
        IEventCenter iEventCenterLJII2 = LJII();
        if (iEventCenterLJII2 != null) {
            iEventCenterLJII2.LIZJ("ec_address_change", this.LIZJ);
        }
    }

    public final IEventCenter LJII() {
        return (IEventCenter) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressService
    public final void LJ() {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ecom_enable_has_address_req", false)) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C934803l4(null), 2);
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C953403o4(null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C979803sK
            if (r0 == 0) goto L3b
            r4 = r6
            X.03sK r4 = (X.C979803sK) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L2f
            if (r1 != r0) goto L41
            X.C155000ia.LIZIZ(r3)
        L22:
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2f:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r3 = r5.LJI(r4)
            if (r3 != r2) goto L22
            return r2
        L3b:
            X.03sK r4 = new X.03sK
            r4.<init>(r5, r6)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.services.ECAddressService.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.service.HostAddressSnapshot> r9) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.services.ECAddressService.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C979903sL
            if (r0 == 0) goto L7f
            r5 = r8
            X.03sL r5 = (X.C979903sL) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7f
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L85
            X.C155000ia.LIZIZ(r2)
        L23:
            X.0X52 r2 = (X.C0X52) r2
            T r0 = r2.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            T r0 = r0.data
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData) r0
            if (r0 == 0) goto L33
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress> r0 = r0.addressList
            if (r0 != 0) goto L35
        L33:
            X.13BV r0 = X.C13BV.INSTANCE
        L35:
            return r0
        L36:
            X.C155000ia.LIZIZ(r2)
            r5.LLILLL = r1
            X.1DEt r3 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r5)
            r3.<init>(r1, r0)
            r3.LJIJJ()
            X.00zU r2 = new X.00zU
            r2.<init>()
            kotlin.jvm.internal.AwS580S0100000_1 r1 = new kotlin.jvm.internal.AwS580S0100000_1
            r0 = 346(0x15a, float:4.85E-43)
            r1.<init>(r2, r0)
            r3.LJJII(r1)
            X.03sT r0 = com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi.LIZ
            r0.getClass()
            X.11NZ r1 = X.C980703sT.LIZJ(r4)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.03sI r0 = new X.03sI
            r0.<init>()
            r1.LIZIZ(r0)
            java.lang.Object r2 = r3.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r2 != r0) goto L7c
            X.C099Q.LIZJ(r5)
        L7c:
            if (r2 != r6) goto L23
            return r6
        L7f:
            X.03sL r5 = new X.03sL
            r5.<init>(r7, r8)
            goto L12
        L85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.services.ECAddressService.LJI(X.05Vn):java.lang.Object");
    }

    public static HostAddressSnapshot LJIIIIZZ(ReachableAddress reachableAddress, boolean z) {
        Pair pair;
        Region region;
        Region region2;
        List<Region> list;
        Region region3;
        String string;
        String string2;
        String strLJJIFFI;
        Address address = reachableAddress.address;
        if (address == null) {
            return null;
        }
        boolean z2 = !Intrinsics.LJFF(reachableAddress.reachable, Boolean.FALSE);
        String strLJI = address.LJI("plain_phone");
        String str = "";
        if (strLJI == null) {
            strLJI = "";
        }
        if (a0.LJJJIL(strLJI) && (strLJI = address.LJI("phone")) == null) {
            strLJI = "";
        }
        String string3 = a0.LJLIIIL(strLJI).toString();
        if (u.LJJIIJZLJL(string3, e3.h, false) && a0.LJJIIZI(string3, ")", false)) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string3, new String[]{")"}, 2, 2);
            String str2 = (String) C13LP.LJJJLL(listLJJLIIIJILLIZJL);
            if (str2 == null || (strLJJIFFI = u.LJJIFFI(str2, e3.h, "", false)) == null || (string = a0.LJLIIIL(strLJJIFFI).toString()) == null) {
                string = "";
            }
            String str3 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
            if (str3 == null || (string2 = a0.LJLIIIL(str3).toString()) == null) {
                string2 = "";
            }
            pair = new Pair(string, string2);
        } else if (u.LJJIIJZLJL(string3, "+", false)) {
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(string3, new String[]{" "}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL2) {
                if (!a0.LJJJIL((String) obj)) {
                    arrayList.add(obj);
                }
            }
            Object objLJJJLL = C13LP.LJJJLL(arrayList);
            if (objLJJJLL == null) {
                objLJJJLL = "";
            }
            pair = new Pair(objLJJJLL, C13LP.LJJLIIIJ(C13LP.LJJJJIZL(arrayList, 1), " ", null, null, 0, null, null, 62));
        } else {
            pair = new Pair("", string3);
        }
        String str4 = (String) pair.getFirst();
        String str5 = (String) pair.getSecond();
        String str6 = address.id;
        if ((str6 == null || !(true ^ a0.LJJJIL(str6))) && (str6 = address.addressId) == null) {
            str6 = "";
        }
        String strLJI2 = address.LJI("first_name");
        if (strLJI2 == null) {
            strLJI2 = "";
        }
        String strLJI3 = address.LJI("last_name");
        if (strLJI3 == null) {
            strLJI3 = "";
        }
        String strLJI4 = address.LJI("address");
        if (strLJI4 == null) {
            strLJI4 = "";
        }
        String strLJI5 = address.LJI("address_detail");
        if (strLJI5 == null) {
            strLJI5 = "";
        }
        String strLJI6 = address.LJI("geo_l3");
        if (strLJI6 == null) {
            strLJI6 = "";
        }
        if (a0.LJJJIL(strLJI6) && ((list = address.districts) == null || (region3 = (Region) C13LP.LJJLIIIJL(list)) == null || (strLJI6 = region3.name) == null)) {
            strLJI6 = "";
        }
        String strLJI7 = address.LJI("geo_l1");
        if (strLJI7 == null) {
            strLJI7 = "";
        }
        if (a0.LJJJIL(strLJI7) && ((region2 = address.region) == null || (strLJI7 = region2.name) == null)) {
            strLJI7 = "";
        }
        String strLJI8 = address.LJI("zipcode");
        if (strLJI8 == null) {
            strLJI8 = "";
        }
        String strLJI9 = address.LJI("phone_region_code");
        if (strLJI9 == null) {
            strLJI9 = "";
        }
        if (a0.LJJJIL(strLJI9) && ((region = address.region) == null || (strLJI9 = region.code) == null)) {
            strLJI9 = "";
        }
        String strLJI10 = address.LJI("email");
        if (strLJI10 != null) {
            str = strLJI10;
        }
        return new HostAddressSnapshot(str6, strLJI2, strLJI3, strLJI4, strLJI5, strLJI6, strLJI7, strLJI8, strLJI9, str4, str5, str, address.LJII(), address.LJI("delivery_instruction"), z2, z);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressService
    public final boolean LIZLLL(Context context, C980103sN c980103sN) {
        boolean z;
        Object c098200Yq;
        this.LIZ = c980103sN;
        IEventCenter iEventCenterLJII = LJII();
        if (iEventCenterLJII != null) {
            iEventCenterLJII.LIZJ("ec_address_select", this.LIZJ);
        }
        IEventCenter iEventCenterLJII2 = LJII();
        if (iEventCenterLJII2 != null) {
            iEventCenterLJII2.LIZJ("ec_address_change", this.LIZJ);
        }
        IEventCenter iEventCenterLJII3 = LJII();
        boolean z2 = true;
        if (iEventCenterLJII3 != null) {
            iEventCenterLJII3.LIZLLL("ec_address_select", this.LIZJ);
            z = true;
        } else {
            z = false;
        }
        IEventCenter iEventCenterLJII4 = LJII();
        if (iEventCenterLJII4 != null) {
            iEventCenterLJII4.LIZLLL("ec_address_change", this.LIZJ);
        } else {
            z2 = false;
        }
        if (z && z2) {
            try {
                AddressPageStarter.LIZ(AddressPageStarter.LIZ, context, null, null, null, false, "{\"previous_page\":\"ucp_checkout\",\"enter_from\":\"ucp_impl\"}", null, null, null, false, 0, null, null, null, null, null, null, null, null, true, null, null, 6, false, null, 13, null, null, null, null, 1027080152);
                c098200Yq = Boolean.TRUE;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                LJFF();
                c098200Yq = Boolean.FALSE;
            }
            return ((Boolean) c098200Yq).booleanValue();
        }
        LJFF();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressService
    public final boolean LIZJ(Context context, String str, C980103sN c980103sN) {
        boolean z;
        boolean z2;
        Object c098200Yq;
        this.LIZ = c980103sN;
        IEventCenter iEventCenterLJII = LJII();
        if (iEventCenterLJII != null) {
            iEventCenterLJII.LIZJ("ec_address_select", this.LIZJ);
        }
        IEventCenter iEventCenterLJII2 = LJII();
        if (iEventCenterLJII2 != null) {
            iEventCenterLJII2.LIZJ("ec_address_change", this.LIZJ);
        }
        IEventCenter iEventCenterLJII3 = LJII();
        if (iEventCenterLJII3 != null) {
            iEventCenterLJII3.LIZLLL("ec_address_select", this.LIZJ);
            z = true;
        } else {
            z = false;
        }
        IEventCenter iEventCenterLJII4 = LJII();
        if (iEventCenterLJII4 != null) {
            iEventCenterLJII4.LIZLLL("ec_address_change", this.LIZJ);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            String strLJ = null;
            if (str != null) {
                try {
                    if (!a0.LJJJIL(str)) {
                        strLJ = C993603uY.LJ(new AwS52S1000000_1(str, 21));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            }
            AddressPageStarter.LIZJ(AddressPageStarter.LIZ, context, strLJ, "{\"previous_page\":\"ucp_checkout\",\"enter_from\":\"ucp_impl\"}", null, null, null, true, null, null, 13, null, null, null, false, null, 128752);
            c098200Yq = Boolean.TRUE;
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                LJFF();
                c098200Yq = Boolean.FALSE;
            }
            return ((Boolean) c098200Yq).booleanValue();
        }
        LJFF();
        return false;
    }
}
