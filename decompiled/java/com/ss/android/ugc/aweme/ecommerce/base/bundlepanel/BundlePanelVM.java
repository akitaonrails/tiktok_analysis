package com.ss.android.ugc.aweme.ecommerce.base.bundlepanel;

import X.AnonymousClass0431;
import X.C1018703yb;
import X.C1019303yh;
import X.C1019503yj;
import X.C11JF;
import X.C13LP;
import X.C1741890vQh;
import X.C1756010vnT;
import X.C212367188v;
import X.InterfaceC0148002o;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PriceDescDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPriceV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.model.AddToCartData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS1S3200000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class BundlePanelVM extends AssemViewModel<C1756010vnT> {
    public final C1019303yh LL;
    public BundlePanelFragment.EnterParams LLILLL;
    public AnonymousClass0431 LLILZ;
    public boolean LLIZ;
    public C11JF LLIZLLLIL;
    public AddToCartData LLJIJIL;
    public String LLILLJJLI = "";
    public BundlePanelFragment.RenderParams LLILZIL = new BundlePanelFragment.RenderParams("", null, "");
    public SkuDescriptor LLILZLL = new SkuDescriptor(null, "");
    public final C1019503yj LLJ = new C1019503yj();
    public String LLJI = "other";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1756010vnT(0);
    }

    public final String vQ2() {
        Map<String, Object> map;
        ProductBase productBase;
        PriceDescDetail priceDescDetail;
        ProductBase productBase2;
        List<ProductPriceV2> list;
        List<SkuItem> list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object virtualBundle = this.LLILZIL.getVirtualBundle();
        if (virtualBundle != null) {
            linkedHashMap.put("virtualBundle", virtualBundle);
        }
        linkedHashMap.put("sku_descriptor", this.LLILZLL.deepCopy());
        String productId = this.LLILZIL.getProductId();
        if (productId != null) {
            linkedHashMap.put("productId", productId);
        }
        ProductPackStruct productInfoPack = this.LLILZIL.getProductInfoPack();
        if (productInfoPack != null && (list2 = productInfoPack.skus) != null) {
            linkedHashMap.put("skus", list2);
        }
        ProductPackStruct productInfoPack2 = this.LLILZIL.getProductInfoPack();
        if (productInfoPack2 != null && (productBase2 = productInfoPack2.baseInfo) != null && (list = productBase2.priceInfoV2) != null) {
            linkedHashMap.put("priceV2", list);
        }
        ProductPackStruct productInfoPack3 = this.LLILZIL.getProductInfoPack();
        if (productInfoPack3 != null && (productBase = productInfoPack3.baseInfo) != null && (priceDescDetail = productBase.priceDescDetail) != null) {
            linkedHashMap.put("priceDetail", priceDescDetail);
        }
        BundlePanelFragment.EnterParams enterParams = this.LLILLL;
        if (enterParams != null && (map = enterParams.trackParams) != null) {
            linkedHashMap.put("track_params", map);
        }
        return C1741890vQh.LJIIIIZZ(linkedHashMap);
    }

    public BundlePanelVM(C1019303yh c1019303yh) {
        this.LL = c1019303yh;
    }

    public final SkuItem wQ2(String str) {
        List<SkuItem> list;
        ProductPackStruct productInfoPack = this.LLILZIL.getProductInfoPack();
        SkuItem skuItem = null;
        if (productInfoPack == null || (list = productInfoPack.skus) == null) {
            return null;
        }
        Iterator<SkuItem> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SkuItem next = it2.next();
            if (u.LJIJI(next.skuId, str, false)) {
                skuItem = next;
                break;
            }
        }
        SkuItem skuItem2 = skuItem;
        if (skuItem2 == null) {
            return (SkuItem) C13LP.LJJJJZI(list);
        }
        return skuItem2;
    }

    public final void xQ2(BundlePanelFragment.RenderParams renderParams) {
        Object obj;
        Map map;
        String str;
        String str2;
        ProductBase productBase;
        List<ProductPriceV2> list;
        ProductPriceV2 productPriceV2;
        SinglePriceItem singlePriceItem;
        ProductBase productBase2;
        List<ProductPriceV2> list2;
        ProductPriceV2 productPriceV22;
        SinglePriceItem singlePriceItem2;
        ProductBase productBase3;
        List<ProductPriceV2> list3;
        ProductPriceV2 productPriceV23;
        SinglePriceItem singlePriceItem3;
        Object obj2;
        String str3;
        Map<String, String> chainParam;
        Map<String, String> trackParam;
        Boolean bool;
        Map map2;
        this.LLILZIL = renderParams;
        String productId = renderParams.getProductId();
        if (productId == null) {
            productId = "";
        }
        this.LLILLJJLI = productId;
        setState(new AwS52S1000000_1(productId, 22));
        Object virtualBundle = renderParams.getVirtualBundle();
        String str4 = null;
        if ((virtualBundle instanceof Map) && (map2 = (Map) virtualBundle) != null) {
            obj = map2.get("panel");
        } else {
            obj = null;
        }
        if (obj instanceof Map) {
            map = (Map) obj;
        } else {
            map = null;
        }
        ProductPackStruct productInfoPack = renderParams.getProductInfoPack();
        if (productInfoPack != null) {
            C1019503yj c1019503yj = this.LLJ;
            if (map != null) {
                obj2 = map.get("da_info");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str3 = (String) obj2;
            } else {
                str3 = null;
            }
            LinkedHashMap<String, Object> linkedHashMap = c1019503yj.LIZ;
            ProductBase productBase4 = productInfoPack.baseInfo;
            if (productBase4 != null && (bool = productBase4.isBundleProduct) != null) {
                linkedHashMap.put("is_bundle", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str3);
            if (mapLJIIJ != null) {
                linkedHashMap.putAll(mapLJIIJ);
            }
            BCMStandardTrack bCMStandardTrack = productInfoPack.bcmStandardTrack;
            if (bCMStandardTrack != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
                this.LLJ.LIZ.putAll(trackParam);
            }
            BCMStandardTrack bCMStandardTrack2 = productInfoPack.bcmStandardTrack;
            if (bCMStandardTrack2 != null && (chainParam = bCMStandardTrack2.getChainParam()) != null) {
                C1019303yh c1019303yh = this.LL;
                c1019303yh.getClass();
                BtmSDK btmSDK = BtmSDK.INSTANCE;
                PageFinder pageFinderVia = PageFinder.via(c1019303yh.LIZ.LIZLLL);
                BcmParams.Companion.getClass();
                btmSDK.setBcmPageParams(pageFinderVia, C212367188v.LIZJ(chainParam), null);
                c1019303yh.LIZIZ = C212367188v.LIZJ(chainParam);
            }
        }
        setState(new AwS580S0100000_1(this, 68));
        C1019303yh c1019303yh2 = this.LL;
        c1019303yh2.getClass();
        Map<String, Object> mapLJ = c1019303yh2.LJ("a2270.b80913");
        C1019503yj c1019503yj2 = this.LLJ;
        ProductPackStruct productInfoPack2 = this.LLILZIL.getProductInfoPack();
        if (productInfoPack2 != null && (productBase3 = productInfoPack2.baseInfo) != null && (list3 = productBase3.priceInfoV2) != null && (productPriceV23 = (ProductPriceV2) ListProtector.get(list3, 0)) != null && (singlePriceItem3 = productPriceV23.minPrice) != null) {
            str = singlePriceItem3.salePriceFormat;
        } else {
            str = null;
        }
        ProductPackStruct productInfoPack3 = this.LLILZIL.getProductInfoPack();
        if (productInfoPack3 != null && (productBase2 = productInfoPack3.baseInfo) != null && (list2 = productBase2.priceInfoV2) != null && (productPriceV22 = (ProductPriceV2) ListProtector.get(list2, 0)) != null && (singlePriceItem2 = productPriceV22.minPrice) != null) {
            str2 = singlePriceItem2.originPriceFormat;
        } else {
            str2 = null;
        }
        ProductPackStruct productInfoPack4 = this.LLILZIL.getProductInfoPack();
        if (productInfoPack4 != null && (productBase = productInfoPack4.baseInfo) != null && (list = productBase.priceInfoV2) != null && (productPriceV2 = (ProductPriceV2) ListProtector.get(list, 0)) != null && (singlePriceItem = productPriceV2.minPrice) != null) {
            str4 = singlePriceItem.discountFormat;
        }
        c1019503yj2.getClass();
        C1018703yb.LIZLLL("tiktokec_enter_page", new AwS1S3200000_1(c1019503yj2, (C1019503yj) str, str2, str4, (String) mapLJ, (Map<String, ? extends Object>) 2));
    }
}
