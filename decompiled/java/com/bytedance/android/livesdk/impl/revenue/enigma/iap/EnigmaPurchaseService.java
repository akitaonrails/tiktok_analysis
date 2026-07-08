package com.bytedance.android.livesdk.impl.revenue.enigma.iap;

import X.AbstractC19484711Kz;
import X.AbstractC19486711Lt;
import X.C01GW;
import X.C09JN;
import X.C0UO0;
import X.C11IU;
import X.C11NJ;
import X.C11NZ;
import X.C11QI;
import X.C15438062q;
import X.C1617170sBX;
import X.C1864840yd0;
import X.C19475111Hh;
import X.C1B0X;
import X.C2097608Jq;
import X.C2197981B0q;
import X.C319150CfB;
import X.C452501pT;
import X.C470590Icr;
import X.C516201zk;
import X.C517301zv;
import X.C766270U4b;
import X.EnumC20513215Oo;
import X.InterfaceC1487280oo2;
import X.InterfaceC300801Eo;
import X.InterfaceC781210Ukh;
import Y.AfS120S0300000_34;
import Y.AfS165S0200000_31;
import Y.AkS108S1100000_31;
import Y.AkS109S1100000_34;
import Y.AkS332S0200000_34;
import Y.AkS47S1000000_31;
import Y.AkS493S0100000_34;
import android.content.Context;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaPurchaseService;
import com.bytedance.android.livesdk.api.revenue.enigma.iap.EnigmaIapApi;
import com.bytedance.android.livesdk.impl.revenue.enigma.iap.EnigmaPurchaseService;
import com.bytedance.android.livesdk.livesetting.privilege.LiveEnigmaIapSyncMaxDurationSetting;
import com.bytedance.android.livesdk.livesetting.privilege.LiveEnigmaMerchantIdSetting;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import tikcast.api.privilege.enigma.EnigmaProductsRequest;
import tikcast.api.privilege.enigma.EnigmaProductsResponse;

/* JADX INFO: loaded from: classes35.dex */
public class EnigmaPurchaseService implements IEnigmaPurchaseService {
    public final long LL = 500;
    public final int LLILLJJLI = (int) (((long) (LiveEnigmaIapSyncMaxDurationSetting.INSTANCE.getValue() * LSPassThroughRecordSizeConfig.DEFAULT)) / 500);
    public final int LLILLL = 4024078;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(18));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(17));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(19));
    public final C11NJ LLIZ = new C11NJ();

    public final IapService LIZIZ() {
        return (IapService) this.LLILZ.getValue();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaPurchaseService
    public final String LM() {
        return LIZIZ().getBillingCountryCode();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaPurchaseService
    public final void UN2(AFwS221S0000000_31 aFwS221S0000000_31, AwS610S0100000_31 awS610S0100000_31) {
        String value = LiveEnigmaMerchantIdSetting.INSTANCE.getValue();
        String billingCountryCode = LIZIZ().getBillingCountryCode();
        if (a0.LJJJIL(billingCountryCode)) {
            aFwS221S0000000_31.invoke();
            Exception exc = new Exception("storeCountry is blank");
            new C2197981B0q(exc.getMessage(), exc);
            C766270U4b.LIZLLL(2131852185);
            return;
        }
        EnigmaProductsRequest enigmaProductsRequest = new EnigmaProductsRequest();
        enigmaProductsRequest.iapChannel = "gp";
        enigmaProductsRequest.appStoreRegion = billingCountryCode;
        C11NZ<C470590Icr<EnigmaProductsResponse.Data>> productDetails = ((EnigmaIapApi) this.LLILZIL.getValue()).getProductDetails(enigmaProductsRequest.iapChannel, enigmaProductsRequest.appStoreRegion);
        productDetails.getClass();
        this.LLIZ.LIZ(new C19475111Hh(productDetails).LJIL(new InterfaceC1487280oo2() { // from class: X.15P1
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                EnigmaProductsResponse.Data data = (EnigmaProductsResponse.Data) ((BaseResponse) obj).data;
                if (!data.enigmaProductDetails.isEmpty()) {
                    return data;
                }
                throw new C2197981B0q("Missing product details", null);
            }
        }).LJJI(new AkS47S1000000_31(billingCountryCode, 1)).LJIIZILJ(new AkS108S1100000_31(this, value, 0)).LJIL(new InterfaceC1487280oo2() { // from class: X.00DN
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                int i;
                List list = (List) obj;
                EnigmaProductsResponse.Data data = new EnigmaProductsResponse.Data();
                C00DO c00do = (C00DO) C13LP.LJJJLL(list);
                if (c00do != null) {
                    i = c00do.LIZJ;
                } else {
                    i = 0;
                }
                data.remainingSubscriptionDays = i;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    data.enigmaProductDetails.add(((C00DO) it2.next()).LIZ);
                }
                return data;
            }
        }).LJFF(new C0UO0()).LJJIIZ(new C516201zk(awS610S0100000_31, 143), new AfS165S0200000_31(this, value, billingCountryCode, aFwS221S0000000_31, 5)));
    }

    public final AbstractC19484711Kz LIZ(String str, String str2, List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return AbstractC19484711Kz.LJIJJLI(C2097608Jq.LJ());
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((EnigmaProductsResponse.Data.EnigmaIAPProductDetails) it2.next()).mpSkuId);
        }
        return AbstractC19484711Kz.LJII(new C1864840yd0(this, new C1617170sBX(str, arrayList2, str2), 1)).LJIIZILJ(new AkS109S1100000_34(this, str2, 0));
    }

    @Override // com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaPurchaseService
    public final void Xj0(Context context, long j, String str, String str2, EnigmaProductsResponse.Data.EnigmaIAPProductDetails enigmaIAPProductDetails, String str3, EnumC20513215Oo enumC20513215Oo, C319150CfB c319150CfB) {
        String str4 = str;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        if (str2 != null) {
            str5 = str2;
        }
        final String value = LiveEnigmaMerchantIdSetting.INSTANCE.getValue();
        final C1B0X c1b0x = new C1B0X(context, j, str4, str5, enigmaIAPProductDetails, str3, value, LIZIZ().getBillingCountryCode(), enumC20513215Oo);
        C11QI c11qi = new C11QI(AbstractC19484711Kz.LJII(new C1864840yd0(this, c1b0x, 0)));
        final String str6 = enigmaIAPProductDetails.mpSkuId;
        AbstractC19486711Lt abstractC19486711LtLJIJ = new C11IU(AbstractC19484711Kz.LJII(new C1864840yd0(this, new C1617170sBX(value, (List<String>) Collections.singletonList(enigmaIAPProductDetails.mpSkuId), str3), 1)).LJIIZILJ(new AkS493S0100000_34(c1b0x, 0)).LJIL(new C517301zv(c1b0x, 6)), c11qi.LIZLLL(AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0wsT
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<Map<String, C517630KRt>> interfaceC2329309At) {
                IapService iapServiceLIZIZ = this.LL.LIZIZ();
                EnigmaPurchaseService enigmaPurchaseService = this.LL;
                String str7 = value;
                String str8 = str6;
                enigmaPurchaseService.getClass();
                final C11KT c11kt = (C11KT) interfaceC2329309At;
                iapServiceLIZIZ.LIZJ(new InterfaceC518100KTo() { // from class: X.0wsU
                    @Override // X.InterfaceC518100KTo
                    public final void LIZ(Map<String, C517630KRt> map) {
                        if (!c11kt.isDisposed()) {
                            c11kt.onSuccess(map);
                        }
                    }
                }, new C1789940wgC(((InterfaceC500940Jki) enigmaPurchaseService.LLILZLL.getValue()).getCurrentUserId(), str7, Collections.singletonList(str8), null, 0L, 56));
            }
        }).LJIJ(new InterfaceC1487280oo2() { // from class: X.1B0h
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                String str7;
                T next;
                EnumC1792020wjY enumC1792020wjY;
                C0KM0 c0km0;
                Map map = (Map) obj;
                Iterator<T> it2 = map.values().iterator();
                while (true) {
                    str7 = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((C517630KRt) next).LIZ != C0KM0.PRE_CHECK_SUCCESS) {
                            break;
                        }
                    } else {
                        next = (T) null;
                        break;
                    }
                }
                C517630KRt c517630KRt = next;
                if (c517630KRt == null) {
                    return C11QJ.LL;
                }
                C0KQW c0kqw = c517630KRt.LIZIZ;
                if (c0kqw == null || (enumC1792020wjY = c0kqw.LIZ) == null) {
                    enumC1792020wjY = EnumC1792020wjY.UNDEFINED;
                }
                int value2 = enumC1792020wjY.getValue();
                if (c0kqw != null) {
                    str7 = c0kqw.LIZIZ;
                }
                C517630KRt c517630KRt2 = (C517630KRt) C13LP.LJJJLIIL(map.values());
                if (c517630KRt2 == null || (c0km0 = c517630KRt2.LIZ) == null) {
                    c0km0 = C0KM0.PRE_CHECK_UNKNOWN;
                }
                return AbstractC19486711Lt.LJIIJ(new C2197931B0l(value2, str7, c0km0));
            }
        }))).LJIIZILJ(new AkS493S0100000_34(this, 1)).LJIILL(new C09JN() { // from class: X.00MT
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("EnigmaPurchaseService@d2d.startPurchase$purchaseFlow$2");
                C1C7U.LIZIZ("EnigmaPurchaseService@d2d.startPurchase$purchaseFlow$2");
            }
        }).LJIIZILJ(new AkS332S0200000_34(this, c319150CfB, 2)).LJIJ(new AkS332S0200000_34(this, c319150CfB, 3));
        new C0UO0();
        this.LLIZ.LIZ(((AbstractC19486711Lt) C0UO0.LIZLLL(abstractC19486711LtLJIJ)).LJIJI(new AfS120S0300000_34(this, c1b0x, c319150CfB, 0), new InterfaceC781210Ukh() { // from class: X.1B0d
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                EnigmaPurchaseService enigmaPurchaseService = this.LIZ;
                Intrinsics.LJFF(c1b0x.LJFF, "subs");
                enigmaPurchaseService.getClass();
            }
        }));
    }
}
