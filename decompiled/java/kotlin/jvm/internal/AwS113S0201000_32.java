package kotlin.jvm.internal;

import X.C09AY;
import X.C189200o6;
import X.C18LA;
import X.C18MW;
import X.C18MY;
import X.C18MZ;
import X.C21271018Ma;
import X.C21271218Mc;
import X.C21271918Mj;
import X.C21272018Mk;
import X.C214848196g;
import X.C2252611DEt;
import X.InterfaceC20236714Gf;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelProductManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.model.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.VideoProductDaInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS113S0201000_32 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS113S0201000_32 awS113S0201000_32, Object obj) {
        UsPopupCardVO usPopupCardVO = (UsPopupCardVO) obj;
        if (!((InterfaceC20236714Gf) awS113S0201000_32.l0).isCancelled()) {
            AuctionData auctionData = usPopupCardVO.auctionData;
            if (auctionData != null && auctionData.auctionStatus == awS113S0201000_32.i2) {
                InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS113S0201000_32.l0;
                Boolean bool = Boolean.FALSE;
                C189200o6.m2constructorimpl(bool);
                interfaceC20236714Gf.resumeWith(bool);
            } else {
                ((UsBidViewModel) awS113S0201000_32.l1).vQ2(usPopupCardVO);
                ((UsBidViewModel) awS113S0201000_32.l1).AQ2(usPopupCardVO, true);
                InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) awS113S0201000_32.l0;
                Boolean bool2 = Boolean.TRUE;
                C189200o6.m2constructorimpl(bool2);
                interfaceC20236714Gf2.resumeWith(bool2);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS113S0201000_32 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS113S0201000_32.invoke$1(kotlin.jvm.internal.AwS113S0201000_32, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS113S0201000_32 awS113S0201000_32, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            AnchorPanelProductManager anchorPanelProductManagerLLLIIIIL = ((C18MZ) awS113S0201000_32.l0).LLLIIIIL();
            int i = awS113S0201000_32.i2;
            AnchorPanelProductManager.LJFF(anchorPanelProductManagerLLLIIIIL, i, ((C18MY) ((RecyclerView.ViewHolder) awS113S0201000_32.l1)).LL, (AnchorProductInfoModel) ListProtector.get(((C18MZ) awS113S0201000_32.l0).LLJI, i), ((C18MZ) awS113S0201000_32.l0).LLLFZ(awS113S0201000_32.i2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS113S0201000_32 awS113S0201000_32, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            AnchorPanelProductManager anchorPanelProductManagerLLLIIIIL = ((C18MZ) awS113S0201000_32.l0).LLLIIIIL();
            int i = awS113S0201000_32.i2;
            AnchorPanelProductManager.LJFF(anchorPanelProductManagerLLLIIIIL, i, ((C18MW) ((RecyclerView.ViewHolder) awS113S0201000_32.l1)).LL, (AnchorProductInfoModel) ListProtector.get(((C18MZ) awS113S0201000_32.l0).LLJI, i), ((C18MZ) awS113S0201000_32.l0).LLLFZ(awS113S0201000_32.i2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS113S0201000_32 awS113S0201000_32, Object obj) {
        String string;
        boolean z;
        Integer num;
        if (((Boolean) obj).booleanValue()) {
            AnchorPanelProductManager anchorPanelProductManagerLLLIIIIL = ((C18MZ) awS113S0201000_32.l0).LLLIIIIL();
            View view = ((C18MW) ((RecyclerView.ViewHolder) awS113S0201000_32.l1)).LL;
            int i = awS113S0201000_32.i2;
            AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) ListProtector.get(((C18MZ) awS113S0201000_32.l0).LLJI, i);
            C21271018Ma c21271018MaLLLFZ = ((C18MZ) awS113S0201000_32.l0).LLLFZ(awS113S0201000_32.i2);
            if (!anchorPanelProductManagerLLLIIIIL.LJIIJ.contains(Integer.valueOf(i))) {
                Long l = anchorProductInfoModel.extraData.productId;
                if (l == null || (string = l.toString()) == null) {
                    string = "";
                }
                anchorPanelProductManagerLLLIIIIL.LJIIJ.add(Integer.valueOf(i));
                String str = c21271018MaLLLFZ.LJIILL;
                if (str != null && !a0.LJJJIL(str)) {
                    String strLIZIZ = C18LA.LIZIZ(anchorPanelProductManagerLLLIIIIL.LIZJ.panelStyle, i, "c0417.d4352_iplaceholder_w5505");
                    C21271918Mj c21271918Mj = C21271918Mj.LIZ;
                    ProductListModel productListModel = anchorPanelProductManagerLLLIIIIL.LIZIZ;
                    int i2 = anchorPanelProductManagerLLLIIIIL.LIZJ.panelStyle;
                    String str2 = anchorPanelProductManagerLLLIIIIL.LJFF;
                    List listLIZIZ = AnchorPanelProductManager.LIZIZ(anchorProductInfoModel, c21271018MaLLLFZ);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
                    VideoProductDaInfo videoProductDaInfo = c21271018MaLLLFZ.LJIILLIIL;
                    anchorBizUtils.getClass();
                    Map mapLJJIZ = AnchorBizUtils.LJJIZ(videoProductDaInfo);
                    if (mapLJJIZ != null) {
                        linkedHashMap.putAll(mapLJJIZ);
                    }
                    linkedHashMap.putAll(C18LA.LIZJ(view, strLIZIZ));
                    C21271918Mj.LJIIIZ(c21271918Mj, productListModel, anchorProductInfoModel, i, "contact_seller", i2, str2, listLIZIZ, linkedHashMap);
                }
                String strLIZIZ2 = C18LA.LIZIZ(anchorPanelProductManagerLLLIIIIL.LIZJ.panelStyle, i, "c0417.d4352_iplaceholder_w4472");
                String str3 = c21271018MaLLLFZ.LJIILJJIL;
                if (str3 != null && !a0.LJJJIL(str3)) {
                    C21271918Mj c21271918Mj2 = C21271918Mj.LIZ;
                    ProductListModel productListModel2 = anchorPanelProductManagerLLLIIIIL.LIZIZ;
                    List listLIZIZ2 = AnchorPanelProductManager.LIZIZ(anchorProductInfoModel, c21271018MaLLLFZ);
                    Map mapLIZJ = C18LA.LIZJ(view, strLIZIZ2);
                    c21271918Mj2.getClass();
                    C21271918Mj.LJJIIJZLJL("tiktokec_shop_entrance_show", productListModel2, anchorProductInfoModel, str3, listLIZIZ2, mapLIZJ);
                }
                String strLIZIZ3 = C18LA.LIZIZ(anchorPanelProductManagerLLLIIIIL.LIZJ.panelStyle, i, "c7828.d9074_iplaceholder_w6919");
                C21271918Mj c21271918Mj3 = C21271918Mj.LIZ;
                ProductListModel productListModel3 = anchorPanelProductManagerLLLIIIIL.LIZIZ;
                Long l2 = anchorProductInfoModel.extraData.productId;
                if (l2 != null) {
                    l2.toString();
                }
                AddToCartButton addToCartButton = c21271018MaLLLFZ.LJIIJ;
                if (addToCartButton != null && (num = addToCartButton.status) != null && num.intValue() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i3 = anchorPanelProductManagerLLLIIIIL.LIZJ.panelStyle;
                String str4 = anchorPanelProductManagerLLLIIIIL.LJFF;
                List listLIZIZ3 = AnchorPanelProductManager.LIZIZ(anchorProductInfoModel, c21271018MaLLLFZ);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                AnchorBizUtils anchorBizUtils2 = AnchorBizUtils.LIZ;
                Map<String, C21271218Mc> map = anchorPanelProductManagerLLLIIIIL.LJIJI;
                anchorBizUtils2.getClass();
                linkedHashMap2.putAll(AnchorBizUtils.LJJIJ(string, map));
                linkedHashMap2.putAll(AnchorBizUtils.LJJJ(c21271018MaLLLFZ.LJIIIZ));
                Map mapLJJIZ2 = AnchorBizUtils.LJJIZ(c21271018MaLLLFZ.LJIILLIIL);
                if (mapLJJIZ2 != null) {
                    linkedHashMap2.putAll(mapLJJIZ2);
                }
                C21272018Mk.LIZ.getClass();
                C21272018Mk.LIZJ(string, linkedHashMap2);
                linkedHashMap2.putAll(C18LA.LIZJ(view, strLIZIZ3));
                c21271918Mj3.getClass();
                C21271918Mj.LIZJ(productListModel3, anchorProductInfoModel, i, z, i3, str4, listLIZIZ3, linkedHashMap2);
                String strLIZIZ4 = C18LA.LIZIZ(anchorPanelProductManagerLLLIIIIL.LIZJ.panelStyle, i, "c0417.d4352_iplaceholder_w1351");
                ProductListModel productListModel4 = anchorPanelProductManagerLLLIIIIL.LIZIZ;
                int i4 = anchorPanelProductManagerLLLIIIIL.LIZJ.panelStyle;
                String str5 = anchorPanelProductManagerLLLIIIIL.LJFF;
                List listLIZIZ4 = AnchorPanelProductManager.LIZIZ(anchorProductInfoModel, c21271018MaLLLFZ);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                C21272018Mk.LIZJ(string, linkedHashMap3);
                Map mapLJJIZ3 = AnchorBizUtils.LJJIZ(c21271018MaLLLFZ.LJIILLIIL);
                if (mapLJJIZ3 != null) {
                    linkedHashMap3.putAll(mapLJJIZ3);
                }
                linkedHashMap3.putAll(C18LA.LIZJ(view, strLIZIZ4));
                C21271918Mj.LJIIIZ(c21271918Mj3, productListModel4, anchorProductInfoModel, i, "buy_now", i4, str5, listLIZIZ4, linkedHashMap3);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS113S0201000_32 awS113S0201000_32, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C18MY c18my = (C18MY) awS113S0201000_32.l0;
            c18my.LLJI.LJ(awS113S0201000_32.i2, c18my.LLJILJIL, (AnchorProductInfoModel) awS113S0201000_32.l1);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS113S0201000_32(int r3, androidx.recyclerview.widget.RecyclerView.ViewHolder r4, X.C18MZ r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 2: goto L11;
                case 3: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.i2 = r3
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r5
            r1.i2 = r3
            r1.l1 = r4
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS113S0201000_32.<init>(int, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.18MZ, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0201000_32(C18MY c18my, int i, AnchorProductInfoModel anchorProductInfoModel, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c18my;
        this.i2 = i;
        this.l1 = anchorProductInfoModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0201000_32(C214848196g c214848196g, SingleImageData singleImageData, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c214848196g;
        this.l1 = singleImageData;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0201000_32(C2252611DEt c2252611DEt, int i, UsBidViewModel usBidViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c2252611DEt;
        this.i2 = i;
        this.l1 = usBidViewModel;
    }
}
