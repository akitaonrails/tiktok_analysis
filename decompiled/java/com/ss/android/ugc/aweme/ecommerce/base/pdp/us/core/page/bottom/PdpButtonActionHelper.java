package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.bottom;

import X.AnonymousClass0378;
import X.AnonymousClass0481;
import X.AnonymousClass0498;
import X.C041G;
import X.C043I;
import X.C043P;
import X.C04AJ;
import X.C1023203zK;
import X.C1054004Ag;
import X.C1389880mGw;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C23271099x;
import X.C770702zh;
import X.C786410Ut5;
import X.C893803eS;
import X.C919503ib;
import X.C948503nH;
import X.C960603pE;
import X.InterfaceC1748810vbr;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomArea;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButtonAreaExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseLimit;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS86S1200000_1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpButtonActionHelper implements GenericLifecycleObserver {
    public final PdpViewModel LL;
    public final Set<String> LLILLJJLI = new LinkedHashSet();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public PdpButtonActionHelper(PdpViewModel pdpViewModel) {
        this.LL = pdpViewModel;
    }

    public final void LIZ(View view, PdpButton pdpButton) throws JSONException {
        boolean z;
        PurchaseLimit purchaseLimit;
        Object obj;
        SkuPrice skuPrice;
        int i;
        ProductBase productBase;
        PdpViewModel pdpViewModel;
        ProductPackStruct productPackStruct;
        SkuItem skuItemLIZLLL;
        Integer num;
        PdpBottomArea pdpBottomArea;
        PdpButtonAreaExtraInfo pdpButtonAreaExtraInfo;
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ;
        PurchaseLimit purchaseLimit2;
        Object obj2;
        SkuPrice skuPrice2;
        String strLIZ;
        PurchaseLimit purchaseLimit3;
        Context context = view.getContext();
        if (this.LL.LLLFF) {
            C1389880mGw c1389880mGw = new C1389880mGw(view);
            c1389880mGw.LJIIIZ(context.getString(2131832572));
            c1389880mGw.LJIIJ();
            return;
        }
        Integer num2 = pdpButton.buttonStatus;
        int value = C043P.DISABLE.getValue();
        if (num2 != null && num2.intValue() == value) {
            z = true;
        } else {
            z = false;
        }
        String str = "unable_to_cart";
        if (this.LL.YR2()) {
            this.LL.getClass();
            if (z) {
                String str2 = pdpButton.clickHint;
                if (C770702zh.LIZIZ(str2) && str2 != null) {
                    C1389880mGw c1389880mGw2 = new C1389880mGw(view);
                    c1389880mGw2.LJIIIZ(str2);
                    c1389880mGw2.LJIIJ();
                }
                PdpViewModel pdpViewModel2 = this.LL;
                ProductPackStruct productPackStruct2 = pdpViewModel2.LLJILLL;
                if (productPackStruct2 != null && (purchaseLimit3 = productPackStruct2.purchaseLimit) != null) {
                    strLIZ = purchaseLimit3.LIZ(pdpViewModel2.getSkuId());
                } else {
                    strLIZ = null;
                }
                if (C770702zh.LIZIZ(strLIZ)) {
                    C1748720vbi.LIZLLL(view, new AnonymousClass0481(), new AwS580S0100000_1(this, 924));
                }
            } else {
                Integer num3 = pdpButton.buttonAction;
                int value2 = C043I.SUBSCRIPTION_ADD_TO_CART.getValue();
                if (num3 != null && num3.intValue() == value2) {
                    i = 15;
                } else {
                    i = 2;
                }
                ProductPackStruct productPackStruct3 = this.LL.LLJILLL;
                if (productPackStruct3 != null && (productBase = productPackStruct3.baseInfo) != null && Intrinsics.LJFF(productBase.isBundleProduct, Boolean.TRUE) && ((productPackStruct = (pdpViewModel = this.LL).LLJILLL) == null || (skuItemLIZLLL = C041G.LIZLLL(productPackStruct, pdpViewModel.getSkuId())) == null || (num = skuItemLIZLLL.stockNum) == null || num.intValue() == 0)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("click_from", Integer.valueOf(i));
                    linkedHashMap.putAll(this.LL.QR2().LIZJ(i));
                    SmartRoute smartRouteLIZIZ = C919503ib.LIZIZ(view.getContext(), "aweme://ec/bundle_selection", linkedHashMap, false);
                    InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view);
                    if (interfaceC1748810vbrLIZ != null) {
                        C960603pE.LJIIIIZZ(smartRouteLIZIZ, interfaceC1748810vbrLIZ);
                    }
                    smartRouteLIZIZ.open();
                    return;
                }
                PdpViewModel.jR2(this.LL, view, view, i, null, 56);
                C948503nH.LJFF(this.LL, C23271099x.INSTANCE, new C04AJ(this, null));
            }
            int iTg2 = this.LL.Tg2();
            if (iTg2 != 1 && iTg2 != 2) {
                C1054004Ag c1054004Ag = this.LL.LLJLILLLLZIIL;
                if (c1054004Ag != null) {
                    HashMap map = new HashMap();
                    map.put("is_clickable", C893803eS.LIZ(view.isEnabled()));
                    if (!z) {
                        str = "able_to_cart";
                    }
                    map.put("button_type", str);
                    C1023203zK c1023203zK = PurchaseLimit.Companion;
                    PdpViewModel pdpViewModel3 = this.LL;
                    ProductPackStruct productPackStruct4 = pdpViewModel3.LLJILLL;
                    if (productPackStruct4 != null) {
                        purchaseLimit2 = productPackStruct4.purchaseLimit;
                    } else {
                        purchaseLimit2 = null;
                    }
                    String skuId = pdpViewModel3.getSkuId();
                    c1023203zK.getClass();
                    map.put("is_new_user_discount_limit1", C1023203zK.LIZ(purchaseLimit2, skuId));
                    SkuItem skuItemER2 = this.LL.ER2();
                    if (skuItemER2 == null || (skuPrice2 = skuItemER2.price) == null || (obj2 = skuPrice2.discount) == null) {
                        obj2 = 0;
                    }
                    map.put("discount_percentage", obj2);
                    HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(pdpButton.daInfo);
                    if (mapLJIIJ != null) {
                        map.putAll(mapLJIIJ);
                    }
                    C1054004Ag.LJIILIIL(c1054004Ag, "add_to_cart", map, null, this.LL.LLILZIL.LJ("c3256.d6034"), 12);
                }
                C1054004Ag c1054004Ag2 = this.LL.LLJLILLLLZIIL;
                if (c1054004Ag2 != null) {
                    C1054004Ag.LJIL(c1054004Ag2, "add_to_cart", null, null, null, null, 30);
                }
                ProductPackStruct productPackStruct5 = this.LL.LLJILLL;
                if (productPackStruct5 != null && (pdpBottomArea = productPackStruct5.bottomArea) != null && (pdpButtonAreaExtraInfo = pdpBottomArea.pdpButtonAreaExtraInfo) != null && pdpButtonAreaExtraInfo.LIZ()) {
                    Map<String, Object> mapLJ = this.LL.LLILZIL.LJ("c3256.d6034");
                    C1054004Ag c1054004Ag3 = this.LL.LLJLILLLLZIIL;
                    if (c1054004Ag3 != null && (interfaceC1748810vbrLJJIJLIJ = c1054004Ag3.LJJIJLIJ()) != null) {
                        C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new AnonymousClass0498(), new AwS86S1200000_1(c1054004Ag3, mapLJ, 40));
                        return;
                    }
                    return;
                }
                return;
            }
            Integer num4 = pdpButton.buttonStatus;
            int value3 = C043P.ENABLE.getValue();
            if (num4 != null && num4.intValue() == value3) {
                str = "able_to_cart";
            }
            IEventCenter iEventCenterLIZ = AnonymousClass0378.LIZ();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("button_type", str);
            iEventCenterLIZ.LIZ("ec_add_cart_click", C786410Ut5.J3(jSONObject));
            return;
        }
        C1054004Ag c1054004Ag4 = this.LL.LLJLILLLLZIIL;
        if (c1054004Ag4 == null) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("is_clickable", C893803eS.LIZ(view.isEnabled()));
        if (!z) {
            str = "able_to_cart";
        }
        map2.put("button_type", str);
        C1023203zK c1023203zK2 = PurchaseLimit.Companion;
        PdpViewModel pdpViewModel4 = this.LL;
        ProductPackStruct productPackStruct6 = pdpViewModel4.LLJILLL;
        if (productPackStruct6 != null) {
            purchaseLimit = productPackStruct6.purchaseLimit;
        } else {
            purchaseLimit = null;
        }
        String skuId2 = pdpViewModel4.getSkuId();
        c1023203zK2.getClass();
        map2.put("is_new_user_discount_limit1", C1023203zK.LIZ(purchaseLimit, skuId2));
        SkuItem skuItemER22 = this.LL.ER2();
        if (skuItemER22 == null || (skuPrice = skuItemER22.price) == null || (obj = skuPrice.discount) == null) {
            obj = 0;
        }
        map2.put("discount_percentage", obj);
        HashMap<String, Object> mapLJIIJ2 = C1741890vQh.LJIIJ(pdpButton.daInfo);
        if (mapLJIIJ2 != null) {
            map2.putAll(mapLJIIJ2);
        }
        C1054004Ag.LJIILIIL(c1054004Ag4, "add_to_cart", map2, null, this.LL.LLILZIL.LJ("c3256.d6034"), 12);
    }
}
