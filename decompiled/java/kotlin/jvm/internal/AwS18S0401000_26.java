package kotlin.jvm.internal;

import X.C09AY;
import X.C0TNK;
import X.C1753650vjf;
import X.C1753660vjg;
import X.C1761290vvz;
import X.C1761440vwE;
import X.C1761470vwH;
import X.C259800zU;
import com.bytedance.pipo.stellar.base.fragment.StellarFragment;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.NavbarActionDO;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemResult;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundlePrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleSku;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS18S0401000_26 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS18S0401000_26 r14, java.lang.Object r15) {
        /*
            r5 = r15
            X.14Kw r5 = (X.C20248814Kw) r5
            kotlin.jvm.internal.AwS427S0200000_26 r3 = new kotlin.jvm.internal.AwS427S0200000_26
            java.lang.Object r2 = r14.l0
            com.bytedance.pipo.stellar.base.model.ImageDO r2 = (com.bytedance.pipo.stellar.base.model.ImageDO) r2
            java.lang.Object r1 = r14.l1
            com.bytedance.pipo.stellar.base.fragment.StellarFragment r1 = (com.bytedance.pipo.stellar.base.fragment.StellarFragment) r1
            r0 = 86
            r3.<init>(r2, r1, r0)
            r5.LIZ = r3
            java.lang.Object r0 = r14.l0
            com.bytedance.pipo.stellar.base.model.ImageDO r0 = (com.bytedance.pipo.stellar.base.model.ImageDO) r0
            java.lang.Integer r0 = r0.getRepeatReportInSinglePage()
            r7 = 1
            if (r0 == 0) goto L8d
            int r0 = r0.intValue()
            if (r0 != r7) goto L8d
            r0 = 1
        L26:
            java.lang.String r3 = "pipo_stellar_event_track_report_setting"
            if (r0 != 0) goto L8b
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.bytedance.pipo.stellar.base.ab.PipoStellarEventTrackReportSettingModel> r0 = com.bytedance.pipo.stellar.base.ab.PipoStellarEventTrackReportSettingModel.class
            com.bytedance.pipo.stellar.base.ab.PipoStellarEventTrackReportSettingModel r1 = X.C1720640usQ.LIZ
            java.lang.Object r0 = r2.LJIIIIZZ(r3, r0, r1)
            com.bytedance.pipo.stellar.base.ab.PipoStellarEventTrackReportSettingModel r0 = (com.bytedance.pipo.stellar.base.ab.PipoStellarEventTrackReportSettingModel) r0
            if (r0 == 0) goto L3b
            r1 = r0
        L3b:
            boolean r0 = r1.repeatedInsidePage
            if (r0 != 0) goto L8b
            r6 = 0
        L40:
            java.lang.Object r0 = r14.l0
            com.bytedance.pipo.stellar.base.model.ImageDO r0 = (com.bytedance.pipo.stellar.base.model.ImageDO) r0
            java.lang.Integer r0 = r0.getRepeatReportInSinglePage()
            if (r0 == 0) goto L74
            int r0 = r0.intValue()
            if (r0 != r7) goto L74
        L50:
            r8 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r9 = 0
            r13 = 120(0x78, float:1.68E-43)
            r11 = r10
            r12 = r10
            X.C20248814Kw.LIZJ(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.0us2 r4 = new X.0us2
            java.lang.Object r3 = r14.l2
            java.util.List r3 = (java.util.List) r3
            int r2 = r14.i4
            java.lang.Object r1 = r14.l1
            com.bytedance.pipo.stellar.base.fragment.StellarFragment r1 = (com.bytedance.pipo.stellar.base.fragment.StellarFragment) r1
            java.lang.Object r0 = r14.l3
            java.util.Map r0 = (java.util.Map) r0
            r4.<init>(r3, r2, r1, r0)
            r5.LIZIZ(r4)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L74:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.bytedance.pipo.stellar.base.ab.PipoStellarEventTrackReportSettingModel> r0 = com.bytedance.pipo.stellar.base.ab.PipoStellarEventTrackReportSettingModel.class
            com.bytedance.pipo.stellar.base.ab.PipoStellarEventTrackReportSettingModel r1 = X.C1720640usQ.LIZ
            java.lang.Object r0 = r2.LJIIIIZZ(r3, r0, r1)
            com.bytedance.pipo.stellar.base.ab.PipoStellarEventTrackReportSettingModel r0 = (com.bytedance.pipo.stellar.base.ab.PipoStellarEventTrackReportSettingModel) r0
            if (r0 == 0) goto L85
            r1 = r0
        L85:
            boolean r0 = r1.repeatedWhenBack
            if (r0 != 0) goto L50
            r7 = 0
            goto L50
        L8b:
            r6 = 1
            goto L40
        L8d:
            r0 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS18S0401000_26.invoke$0(kotlin.jvm.internal.AwS18S0401000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS18S0401000_26 awS18S0401000_26, Object obj) {
        String strValueOf;
        String str;
        String str2;
        LaneParams laneParams = (LaneParams) obj;
        ((C1753660vjg) awS18S0401000_26.l0).LIZIZ(laneParams, (BundleInfo) awS18S0401000_26.l1);
        C1753660vjg c1753660vjg = (C1753660vjg) awS18S0401000_26.l0;
        BundleInfo bundleInfo = (BundleInfo) awS18S0401000_26.l1;
        c1753660vjg.getClass();
        C1753660vjg.LIZ(laneParams, bundleInfo);
        laneParams.plusAssign("cart_form", "add_to_cart");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        List<BundleProduct> list = ((BundleInfo) awS18S0401000_26.l1).productList;
        if (list != null) {
            for (BundleProduct bundleProduct : list) {
                sb.append(bundleProduct.productId);
                sb.append(",");
                BundleSku bundleSku = bundleProduct.selectedSku;
                String str3 = null;
                if (bundleSku != null) {
                    str = bundleSku.skuId;
                } else {
                    str = null;
                }
                sb2.append(str);
                sb2.append(",");
                BundlePrice bundlePrice = bundleProduct.productPrice;
                if (bundlePrice != null) {
                    str2 = bundlePrice.originalPrice;
                } else {
                    str2 = null;
                }
                sb3.append(str2);
                sb3.append(",");
                BundlePrice bundlePrice2 = bundleProduct.productPrice;
                if (bundlePrice2 != null) {
                    str3 = bundlePrice2.realPrice;
                }
                sb4.append(str3);
                sb4.append(",");
                sb5.append(bundleProduct.productSource);
                sb5.append(",");
            }
        }
        laneParams.plusAssign("product_id", sb);
        laneParams.plusAssign("sku_id", sb2);
        laneParams.plusAssign("product_source", sb5);
        laneParams.plusAssign("is_single_sku", "1");
        laneParams.plusAssign("source_page_type", "bundle_deal");
        laneParams.plusAssign("original_price", sb3);
        laneParams.plusAssign("sale_price", sb4);
        laneParams.plusAssign("add_sku_num", 1);
        laneParams.plusAssign("sku_num_before", ((AddItemResult) awS18S0401000_26.l2).preSkuCount);
        laneParams.plusAssign("sku_num_after", ((AddItemResult) awS18S0401000_26.l2).postSkuCount);
        laneParams.plusAssign("cart_item_id", ((AddItemResult) awS18S0401000_26.l2).cartItemId);
        int i = awS18S0401000_26.i4;
        if (i != 0) {
            strValueOf = String.valueOf(i);
        } else {
            strValueOf = "";
        }
        laneParams.plusAssign("fail_reason", strValueOf);
        Integer num = ((AddItemResult) awS18S0401000_26.l2).result;
        int value = C0TNK.NORMAL_ADD_SUCCESS.getValue();
        if (num != null && num.intValue() == value) {
            laneParams.plusAssign("bundle_add_fail_reason", "promotion_expired");
        }
        laneParams.withParamsGroup((Map) awS18S0401000_26.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS18S0401000_26 awS18S0401000_26, Object obj) {
        Object obj2;
        Map<String, Object> map;
        LaneParams laneParams = (LaneParams) obj;
        ((C1753660vjg) awS18S0401000_26.l0).LIZIZ(laneParams, (BundleInfo) awS18S0401000_26.l1);
        C1753660vjg c1753660vjg = (C1753660vjg) awS18S0401000_26.l0;
        BundleInfo bundleInfo = (BundleInfo) awS18S0401000_26.l1;
        c1753660vjg.getClass();
        C1753660vjg.LIZ(laneParams, bundleInfo);
        ((C1753660vjg) awS18S0401000_26.l0).LIZJ(laneParams, (BundleProduct) awS18S0401000_26.l2, awS18S0401000_26.i4);
        laneParams.plusAssign("parent_product_id", ((C1753660vjg) awS18S0401000_26.l0).LIZ.getProductId());
        laneParams.plusAssign("source_page_type", "bundle_deal");
        laneParams.plusAssign("entrance_form", "horizontal_goods_card");
        IPdpStarter.PdpEnterParam pdpEnterParam = ((C1753660vjg) awS18S0401000_26.l0).LIZ.LLJI;
        if (pdpEnterParam == null || (map = pdpEnterParam.trackParams) == null || (obj2 = map.get("source_page_type")) == null) {
            obj2 = "";
        }
        laneParams.plusAssign("first_source_page", obj2);
        laneParams.plusAssign("item_order", Integer.valueOf(awS18S0401000_26.i4 + 1));
        laneParams.withParamsGroup((Map) awS18S0401000_26.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS18S0401000_26 awS18S0401000_26, Object obj) {
        Object obj2;
        Map<String, Object> map;
        LaneParams laneParams = (LaneParams) obj;
        ((C1753660vjg) awS18S0401000_26.l0).LIZIZ(laneParams, (BundleInfo) awS18S0401000_26.l1);
        C1753660vjg c1753660vjg = (C1753660vjg) awS18S0401000_26.l0;
        BundleInfo bundleInfo = (BundleInfo) awS18S0401000_26.l1;
        c1753660vjg.getClass();
        C1753660vjg.LIZ(laneParams, bundleInfo);
        ((C1753660vjg) awS18S0401000_26.l0).LIZJ(laneParams, (BundleProduct) awS18S0401000_26.l2, awS18S0401000_26.i4);
        laneParams.plusAssign("parent_product_id", ((C1753660vjg) awS18S0401000_26.l0).LIZ.getProductId());
        laneParams.plusAssign("entrance_form", "horizontal_goods_card");
        laneParams.plusAssign("source_page_type", "bundle_deal");
        IPdpStarter.PdpEnterParam pdpEnterParam = ((C1753660vjg) awS18S0401000_26.l0).LIZ.LLJI;
        if (pdpEnterParam == null || (map = pdpEnterParam.trackParams) == null || (obj2 = map.get("source_page_type")) == null) {
            obj2 = "";
        }
        laneParams.plusAssign("first_source_page", obj2);
        laneParams.plusAssign("item_order", Integer.valueOf(awS18S0401000_26.i4 + 1));
        laneParams.withParamsGroup((Map) awS18S0401000_26.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS18S0401000_26 awS18S0401000_26, Object obj) {
        ((Boolean) obj).booleanValue();
        C1761470vwH.LIZJ((C1761470vwH) awS18S0401000_26.l0, (CharSequence) ((C259800zU) awS18S0401000_26.l1).element, awS18S0401000_26.i4, 4, ((C1761440vwE) awS18S0401000_26.l2).LLJIJIL, 16);
        GalleryViewerViewModel galleryViewerViewModel = ((C1761440vwE) awS18S0401000_26.l2).LLILLJJLI;
        if (galleryViewerViewModel != null) {
            galleryViewerViewModel.yQ2((C1761470vwH) awS18S0401000_26.l0, false, ((C1761290vvz) awS18S0401000_26.l3).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS18S0401000_26 awS18S0401000_26, Object obj) {
        String strValueOf;
        String str;
        String str2;
        LaneParams laneParams = (LaneParams) obj;
        ((C1753650vjf) awS18S0401000_26.l0).LIZIZ(laneParams, (BundleInfo) awS18S0401000_26.l1);
        C1753650vjf c1753650vjf = (C1753650vjf) awS18S0401000_26.l0;
        BundleInfo bundleInfo = (BundleInfo) awS18S0401000_26.l1;
        c1753650vjf.getClass();
        C1753650vjf.LIZ(laneParams, bundleInfo);
        laneParams.plusAssign("cart_form", "add_to_cart");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        List<BundleProduct> list = ((BundleInfo) awS18S0401000_26.l1).productList;
        if (list != null) {
            for (BundleProduct bundleProduct : list) {
                sb.append(bundleProduct.productId);
                sb.append(",");
                BundleSku bundleSku = bundleProduct.selectedSku;
                String str3 = null;
                if (bundleSku != null) {
                    str = bundleSku.skuId;
                } else {
                    str = null;
                }
                sb2.append(str);
                sb2.append(",");
                BundlePrice bundlePrice = bundleProduct.productPrice;
                if (bundlePrice != null) {
                    str2 = bundlePrice.originalPrice;
                } else {
                    str2 = null;
                }
                sb3.append(str2);
                sb3.append(",");
                BundlePrice bundlePrice2 = bundleProduct.productPrice;
                if (bundlePrice2 != null) {
                    str3 = bundlePrice2.realPrice;
                }
                sb4.append(str3);
                sb4.append(",");
                sb5.append(bundleProduct.productSource);
                sb5.append(",");
            }
        }
        laneParams.plusAssign("product_id", sb);
        laneParams.plusAssign("sku_id", sb2);
        laneParams.plusAssign("product_source", sb5);
        laneParams.plusAssign("is_single_sku", "1");
        laneParams.plusAssign("source_page_type", "bundle_deal");
        laneParams.plusAssign("original_price", sb3);
        laneParams.plusAssign("sale_price", sb4);
        laneParams.plusAssign("add_sku_num", 1);
        laneParams.plusAssign("sku_num_before", ((AddItemResult) awS18S0401000_26.l2).preSkuCount);
        laneParams.plusAssign("sku_num_after", ((AddItemResult) awS18S0401000_26.l2).postSkuCount);
        laneParams.plusAssign("cart_item_id", ((AddItemResult) awS18S0401000_26.l2).cartItemId);
        int i = awS18S0401000_26.i4;
        if (i != 0) {
            strValueOf = String.valueOf(i);
        } else {
            strValueOf = "";
        }
        laneParams.plusAssign("fail_reason", strValueOf);
        Integer num = ((AddItemResult) awS18S0401000_26.l2).result;
        int value = C0TNK.NORMAL_ADD_SUCCESS.getValue();
        if (num != null && num.intValue() == value) {
            laneParams.plusAssign("bundle_add_fail_reason", "promotion_expired");
        }
        laneParams.withParamsGroup((Map) awS18S0401000_26.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS18S0401000_26 awS18S0401000_26, Object obj) {
        Object obj2;
        Map<String, Object> map;
        LaneParams laneParams = (LaneParams) obj;
        ((C1753650vjf) awS18S0401000_26.l0).LIZIZ(laneParams, (BundleInfo) awS18S0401000_26.l1);
        C1753650vjf c1753650vjf = (C1753650vjf) awS18S0401000_26.l0;
        BundleInfo bundleInfo = (BundleInfo) awS18S0401000_26.l1;
        c1753650vjf.getClass();
        C1753650vjf.LIZ(laneParams, bundleInfo);
        ((C1753650vjf) awS18S0401000_26.l0).LIZJ(laneParams, (BundleProduct) awS18S0401000_26.l2, awS18S0401000_26.i4);
        laneParams.plusAssign("parent_product_id", ((C1753650vjf) awS18S0401000_26.l0).LIZ.getProductId());
        laneParams.plusAssign("source_page_type", "bundle_deal");
        laneParams.plusAssign("entrance_form", "horizontal_goods_card");
        IPdpStarter.PdpEnterParam pdpEnterParam = ((C1753650vjf) awS18S0401000_26.l0).LIZ.LLIZ;
        if (pdpEnterParam == null || (map = pdpEnterParam.trackParams) == null || (obj2 = map.get("source_page_type")) == null) {
            obj2 = "";
        }
        laneParams.plusAssign("first_source_page", obj2);
        laneParams.plusAssign("item_order", Integer.valueOf(awS18S0401000_26.i4 + 1));
        laneParams.withParamsGroup((Map) awS18S0401000_26.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS18S0401000_26 awS18S0401000_26, Object obj) {
        Object obj2;
        Map<String, Object> map;
        LaneParams laneParams = (LaneParams) obj;
        ((C1753650vjf) awS18S0401000_26.l0).LIZIZ(laneParams, (BundleInfo) awS18S0401000_26.l1);
        C1753650vjf c1753650vjf = (C1753650vjf) awS18S0401000_26.l0;
        BundleInfo bundleInfo = (BundleInfo) awS18S0401000_26.l1;
        c1753650vjf.getClass();
        C1753650vjf.LIZ(laneParams, bundleInfo);
        ((C1753650vjf) awS18S0401000_26.l0).LIZJ(laneParams, (BundleProduct) awS18S0401000_26.l2, awS18S0401000_26.i4);
        laneParams.plusAssign("parent_product_id", ((C1753650vjf) awS18S0401000_26.l0).LIZ.getProductId());
        laneParams.plusAssign("entrance_form", "horizontal_goods_card");
        laneParams.plusAssign("source_page_type", "bundle_deal");
        IPdpStarter.PdpEnterParam pdpEnterParam = ((C1753650vjf) awS18S0401000_26.l0).LIZ.LLIZ;
        if (pdpEnterParam == null || (map = pdpEnterParam.trackParams) == null || (obj2 = map.get("source_page_type")) == null) {
            obj2 = "";
        }
        laneParams.plusAssign("first_source_page", obj2);
        laneParams.plusAssign("item_order", Integer.valueOf(awS18S0401000_26.i4 + 1));
        laneParams.withParamsGroup((Map) awS18S0401000_26.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S0401000_26(C1753650vjf c1753650vjf, C1753650vjf c1753650vjf2, BundleInfo bundleInfo, AddItemResult addItemResult, int i, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = c1753650vjf;
        this.l1 = c1753650vjf2;
        this.l2 = bundleInfo;
        this.i4 = addItemResult;
        this.l3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S0401000_26(C1753650vjf c1753650vjf, C1753650vjf c1753650vjf2, BundleInfo bundleInfo, BundleProduct bundleProduct, int i, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = c1753650vjf;
        this.l1 = c1753650vjf2;
        this.l2 = bundleInfo;
        this.i4 = bundleProduct;
        this.l3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S0401000_26(C1753660vjg c1753660vjg, C1753660vjg c1753660vjg2, BundleInfo bundleInfo, AddItemResult addItemResult, int i, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = c1753660vjg;
        this.l1 = c1753660vjg2;
        this.l2 = bundleInfo;
        this.i4 = addItemResult;
        this.l3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S0401000_26(C1753660vjg c1753660vjg, C1753660vjg c1753660vjg2, BundleInfo bundleInfo, BundleProduct bundleProduct, int i, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = c1753660vjg;
        this.l1 = c1753660vjg2;
        this.l2 = bundleInfo;
        this.i4 = bundleProduct;
        this.l3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S0401000_26(C1761470vwH c1761470vwH, C1761470vwH c1761470vwH2, C259800zU<String> c259800zU, int i, C1761440vwE c1761440vwE, C1761290vvz c1761290vvz) {
        super(1);
        this.$t = c1761290vvz;
        this.l0 = c1761470vwH;
        this.l1 = c1761470vwH2;
        this.i4 = c259800zU;
        this.l2 = i;
        this.l3 = c1761440vwE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S0401000_26(ImageDO imageDO, ImageDO imageDO2, StellarFragment stellarFragment, List<NavbarActionDO> list, int i, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l0 = imageDO;
        this.l1 = imageDO2;
        this.l2 = stellarFragment;
        this.i4 = list;
        this.l3 = i;
    }
}
