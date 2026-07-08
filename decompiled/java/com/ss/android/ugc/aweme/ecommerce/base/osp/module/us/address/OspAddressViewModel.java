package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address;

import X.C03O0;
import X.C0PEM;
import X.C1323720kYE;
import X.C1741890vQh;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C818903Hv;
import X.C825703Kl;
import X.C919503ib;
import X.C948503nH;
import X.C993603uY;
import X.InterfaceC0148002o;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShippingAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class OspAddressViewModel extends AssemViewModel<C818903Hv> {
    public String LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C818903Hv(0);
    }

    public static void vQ2(Context context, String str, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        ShippingAddress shippingAddress;
        Address address;
        if (str == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
        if (billInfoData != null && (shippingAddress = billInfoData.shippingAddress) != null && (address = shippingAddress.shippingAddress) != null) {
            linkedHashMap.put("shipping_address", C1741890vQh.LJIIIIZZ(address));
        }
        linkedHashMap.put("trackParams", orderSubmitAssemViewModel.kR2(C2097608Jq.LJ()));
        C919503ib.LIZIZ(context, str, linkedHashMap, false).open();
    }

    public static void yQ2(Context context, String str, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        Address address;
        Address address2;
        Address address3;
        if (str == null) {
            return;
        }
        HashMap map = new HashMap();
        BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
        if (billInfoData != null) {
            ShippingAddress shippingAddress = billInfoData.shippingAddress;
            if (shippingAddress != null && (address3 = shippingAddress.shippingAddress) != null) {
                map.put("shipping_address", C1741890vQh.LJIIIIZZ(address3));
            }
            ShippingAddress shippingAddress2 = billInfoData.pudoShippingAddress;
            if (shippingAddress2 != null && (address2 = shippingAddress2.shippingAddress) != null) {
                map.put("pudo_shipping_address", C1741890vQh.LJIIIIZZ(address2));
            }
            ShippingAddress shippingAddress3 = billInfoData.pudoShippingAddress;
            if (shippingAddress3 != null && (address = shippingAddress3.shippingAddress) != null) {
                map.put("pudo_shipping_address", C1741890vQh.LJIIIIZZ(address));
            }
            String str2 = billInfoData.createOrderInfoFromBill;
            if (str2 != null) {
                map.put("create_order_info_from_bill", str2);
            }
            map.put("track_params", orderSubmitAssemViewModel.kR2(C2097608Jq.LJ()));
        }
        C1323720kYE.LIZ(context).LJIIIIZZ(C1741890vQh.LJIIIIZZ(map), "ecom_pudo_address_data");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (a0.LJJIIZI(str, "/address/edit", false)) {
            linkedHashMap.put("trackParams", orderSubmitAssemViewModel.kR2(C2097608Jq.LJ()));
        }
        C919503ib.LIZIZ(context, str, linkedHashMap, false).open();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7 A[PHI: r7
      0x00e7: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String) binds: [B:55:0x00e4, B:37:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void wQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel r39, android.view.View r40, java.lang.Boolean r41, java.lang.String r42, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r43, java.lang.String r44, java.lang.Integer r45, java.lang.Boolean r46, int r47) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel.wQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel, android.view.View, java.lang.Boolean, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel, java.lang.String, java.lang.Integer, java.lang.Boolean, int):void");
    }

    public static void xQ2(OspAddressViewModel ospAddressViewModel, Context context, String str, String str2, String str3, OrderSubmitAssemViewModel orderSubmitAssemViewModel, Float f, Boolean bool, int i) {
        Float f2 = f;
        String str4 = str3;
        String str5 = str2;
        Boolean bool2 = null;
        if ((i & 4) != 0) {
            str5 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            f2 = null;
        }
        if ((i & 64) == 0) {
            bool2 = bool;
        }
        ospAddressViewModel.getClass();
        orderSubmitAssemViewModel.LLJZ = "next";
        String productId = orderSubmitAssemViewModel.getProductId();
        if (str != null) {
            C993603uY.LIZJ(str, new AwS580S0100000_1(orderSubmitAssemViewModel, 22));
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C948503nH.LJI(ospAddressViewModel, C2107308Nj.LIZ, new C825703Kl(orderSubmitAssemViewModel, str5, str4, context, str, productId, f2, bool2, null));
        C03O0.LJJJJZI(C03O0.LIZ, "edit_address", Boolean.valueOf(orderSubmitAssemViewModel.LLLIILIL), 4);
        orderSubmitAssemViewModel.yS2();
        orderSubmitAssemViewModel.LLLIIII = true;
    }
}
