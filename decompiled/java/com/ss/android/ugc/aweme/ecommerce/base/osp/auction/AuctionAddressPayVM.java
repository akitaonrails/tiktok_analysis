package com.ss.android.ugc.aweme.ecommerce.base.osp.auction;

import X.AnonymousClass0403;
import X.C03O0;
import X.C0PEM;
import X.C1026003zm;
import X.C1026103zn;
import X.C1026203zo;
import X.C1026603zs;
import X.C1026703zt;
import X.C123100dR;
import X.C19EG;
import X.C1DFH;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2107308Nj;
import X.C23271099x;
import X.C862003Yk;
import X.C919503ib;
import X.C948503nH;
import X.C960603pE;
import X.C993603uY;
import X.InterfaceC0148002o;
import X.InterfaceC1164530gPT;
import X.InterfaceC1748810vbr;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShippingAddress;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AuctionAddressPayVM extends AssemViewModel<AuctionAddressPayState> implements InterfaceC1164530gPT {
    public GetAuctionInfoRequest LL;
    public HashMap<String, Object> LLILLJJLI;
    public UserAuctionInfoData LLILLL;
    public C1026203zo LLILZ;
    public C1026103zn LLILZIL;
    public AddressPageStarter.AddressEvent LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILLL;
    public Map<String, String> LLJJIJIIJIL;
    public long LLJILJILJ = -1;
    public int LLJJ = -1;
    public int LLJJI = -1;
    public int LLJJIII = -1;
    public int LLJJIJI = -1;
    public String LLJJIJIL = "";

    public final void DQ2() {
        setState(new AwS580S0100000_1(this, 88));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new AuctionAddressPayState(0, null, null, null, 0, false, false, null, 255, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2() {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayVM.vQ2():void");
    }

    public final void AQ2(C19EG c19eg) {
        UserAuctionInfoData userAuctionInfoData;
        AuctionInfoSchema auctionInfoSchema;
        String str;
        if (c19eg != null && (userAuctionInfoData = this.LLILLL) != null && (auctionInfoSchema = userAuctionInfoData.schema) != null && (str = auctionInfoSchema.taxSchema) != null) {
            xQ2("add_shipping_info", false);
            SmartRouter.buildRoute(c19eg, str).open();
        }
    }

    public final void BQ2(GetAuctionInfoRequest getAuctionInfoRequest) {
        setState(new AwS16S0010000_1(true, 15));
        if (getAuctionInfoRequest != null) {
            this.LL = getAuctionInfoRequest;
        }
        if (this.LL != null) {
            C948503nH.LJI(this, C23271099x.INSTANCE, new C1026603zs(this, null));
        }
    }

    public final void CQ2(Function0<Unit> function0) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z = true;
        setState(new AwS16S0010000_1(true, 15));
        this.LLJILLL = false;
        if (!this.LLJIJIL) {
            str = this.LLIZ;
        } else {
            str = null;
        }
        GetAuctionInfoRequest getAuctionInfoRequest = this.LL;
        if (getAuctionInfoRequest != null) {
            str2 = getAuctionInfoRequest.roomId;
            str3 = getAuctionInfoRequest.productId;
            str4 = getAuctionInfoRequest.skuId;
            str5 = getAuctionInfoRequest.termVersion;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        if (!((Boolean) AnonymousClass0403.LIZ.getValue()).booleanValue()) {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        GetAuctionInfoRequest getAuctionInfoRequest2 = this.LL;
        if (getAuctionInfoRequest2 != null) {
            str6 = getAuctionInfoRequest2.auctionConfigId;
        } else {
            str6 = null;
        }
        C948503nH.LJI(this, C23271099x.INSTANCE, new C1026703zt(new ConfirmUserAuctionInfoRequest(str, str2, str3, str4, str5, boolValueOf, str6, null), this, function0, null));
    }

    public final void wQ2(AddressPageStarter.AddressEvent addressEvent) {
        this.LLILZLL = null;
        if (C123100dR.LIZ(addressEvent.addressId)) {
            this.LLIZ = addressEvent.addressId;
            this.LLJIJIL = false;
        }
        CQ2(null);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        AddressInfoItem addressInfoItem;
        ShippingAddress shippingAddress;
        Address address;
        String str3;
        int iHashCode = str.hashCode();
        if (iHashCode != -2019832472) {
            if (iHashCode != -191583482) {
                if (iHashCode == 1819520028 && str.equals("ec_address_change")) {
                    AddressPageStarter.AddressEvent addressEventLIZ = C862003Yk.LIZ(str2);
                    if (addressEventLIZ.type == 0) {
                        UserAuctionInfoData userAuctionInfoData = this.LLILLL;
                        if (userAuctionInfoData == null || (addressInfoItem = userAuctionInfoData.addressInfo) == null || (shippingAddress = addressInfoItem.shippingAddress) == null || (address = shippingAddress.shippingAddress) == null || (str3 = address.id) == null || str3.length() == 0 || C123100dR.LIZ(addressEventLIZ.pudoId)) {
                            wQ2(addressEventLIZ);
                            return;
                        }
                        return;
                    }
                    if (!Intrinsics.LJFF(addressEventLIZ.addressId, this.LLIZ)) {
                        return;
                    }
                    if (addressEventLIZ.type == 2) {
                        this.LLILZLL = new AddressPageStarter.AddressEvent("", addressEventLIZ.type, null, null, null, null);
                        return;
                    } else {
                        wQ2(addressEventLIZ);
                        return;
                    }
                }
                return;
            }
            if (!str.equals("payment_open_bind_card_result")) {
                return;
            }
            withState(AFwS228S0000000_1.get$arr$(59));
            CQ2(null);
            return;
        }
        if (!str.equals("ec_address_select")) {
            return;
        }
        AddressPageStarter.AddressEvent addressEventLIZ2 = C862003Yk.LIZ(str2);
        if (Intrinsics.LJFF(addressEventLIZ2.addressId, this.LLIZ)) {
            return;
        }
        wQ2(addressEventLIZ2);
    }

    public final void xQ2(String str, boolean z) {
        C03O0 c03o0 = C03O0.LIZ;
        HashMap map = new HashMap();
        map.put("page_name", "live_auction_info_needed");
        map.put("stay_time", Long.valueOf(System.currentTimeMillis() - this.LLJILJILJ));
        map.put("is_delivery_info_complete_when_leave", Integer.valueOf(this.LLJJ));
        map.put("is_pay_info_complete_when_leave", Integer.valueOf(this.LLJJI));
        map.put("quit_type", str);
        if (z) {
            map.put("is_delivery_info_complete_when_click", Integer.valueOf(this.LLJJIII));
            map.put("is_pay_info_complete_when_click", Integer.valueOf(this.LLJJIJI));
        }
        Map<String, String> map2 = this.LLJJIJIIJIL;
        if (map2 != null) {
            map.putAll(map2);
        }
        HashMap<String, Object> map3 = this.LLILLJJLI;
        if (map3 != null) {
            map.putAll(map3);
        }
        c03o0.getClass();
        C03O0.LJJIII("livesdk_tiktokec_stay_page", map);
    }

    public final void zQ2(Context context, InterfaceC1748810vbr interfaceC1748810vbr) {
        AuctionInfoSchema auctionInfoSchema;
        String str;
        Map<String, String> map;
        Map mapLJIIZILJ;
        if (context == null) {
            return;
        }
        ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJIIIZ("payment_method");
        xQ2("add_payment_info", false);
        HashMap map2 = new HashMap();
        C1026103zn c1026103zn = this.LLILZIL;
        if (c1026103zn != null && (map = c1026103zn.LLILZLL) != null && (mapLJIIZILJ = C2097608Jq.LJIIZILJ(map)) != null) {
            map2.putAll(mapLJIIZILJ);
        }
        map2.put("entrance", "bidding");
        String str2 = this.LLIZLLLIL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        map2.put("address_id", str2);
        map2.put("trackParams", C2097608Jq.LJIIIIZZ(new Pair("previous_page", "live_auction_info_needed"), new Pair("entrance_info", C2097908Jt.LIZJ(new Pair("source_previous_page", "live_auction_info_needed"))), new Pair("enter_from", "bidding_page"), new Pair("source_button", "bidding_button")));
        UserAuctionInfoData userAuctionInfoData = this.LLILLL;
        if (userAuctionInfoData != null && (auctionInfoSchema = userAuctionInfoData.schema) != null && (str = auctionInfoSchema.paymentMethodSchema) != null) {
            str3 = str;
        }
        SmartRoute smartRouteLIZIZ = C919503ib.LIZIZ(context, str3, map2, false);
        if (interfaceC1748810vbr != null) {
            C960603pE.LJIIIIZZ(smartRouteLIZIZ, interfaceC1748810vbr);
        }
        smartRouteLIZIZ.open();
    }

    public static void yQ2(AuctionAddressPayVM auctionAddressPayVM, Context context, String str) {
        String str2;
        GetAuctionInfoRequest getAuctionInfoRequest = auctionAddressPayVM.LL;
        if (getAuctionInfoRequest != null) {
            str2 = getAuctionInfoRequest.productId;
        } else {
            str2 = null;
        }
        if (str != null) {
            C993603uY.LIZJ(str, new AwS580S0100000_1(auctionAddressPayVM, 384));
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C948503nH.LJI(auctionAddressPayVM, C2107308Nj.LIZ, new C1026003zm(auctionAddressPayVM, context, str, null, str2, null));
    }
}
