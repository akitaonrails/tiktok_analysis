package kotlin.jvm.internal;

import X.C00H3;
import X.C042Y;
import X.C04CV;
import X.C04EU;
import X.C04FG;
import X.C09AY;
import X.C1010603xI;
import X.C10472047q;
import X.C10473047r;
import X.C10515049h;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C118300cf;
import X.C1397630mTR;
import X.C13LP;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C888603dc;
import X.C888703dd;
import X.C890103dr;
import X.C890803dy;
import X.C908703gr;
import X.C936903lP;
import X.C957403oi;
import X.EnumC1011903xV;
import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrandInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.goda.SeaGodaManagerV2;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageCard;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPurchaseMethodReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.counter.SeaSkuCounterCell;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS17S2200000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS17S2200000_1 awS17S2200000_1, Object obj) {
        C936903lP c936903lP = (C936903lP) obj;
        C908703gr c908703gr = ((SeaSkuCounterCell) awS17S2200000_1.l2).N5().LLJILJILJ;
        if (c908703gr != null) {
            C10515049h c10515049h = new C10515049h();
            EnumC1011903xV enumC1011903xV = EnumC1011903xV.LOG_WHEN_SHOW;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sku_counter_notice_banner_show_");
            sbLIZ.append(c936903lP.LLILLJJLI);
            sbLIZ.append('_');
            sbLIZ.append(awS17S2200000_1.s0);
            c908703gr.LIZLLL("tiktokec_module_show", c10515049h, new AwS150S1100000_1((SeaSkuCounterCell) awS17S2200000_1.l2, awS17S2200000_1.s1, 0), enumC1011903xV, (LinearLayout) awS17S2200000_1.l3, C2188811AlT.LIZIZ(sbLIZ));
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$1(AwS17S2200000_1 awS17S2200000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str = awS17S2200000_1.s0;
        if (str != null) {
            c957403oi.LIZLLL("redirect_url", str);
        }
        String str2 = awS17S2200000_1.s1;
        if (str2 != null) {
            c957403oi.LIZLLL("host", str2);
        }
        Boolean bool = (Boolean) awS17S2200000_1.l2;
        if (bool != null) {
            bool.booleanValue();
            c957403oi.LIZLLL("is_blank", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        Long l = (Long) awS17S2200000_1.l3;
        if (l != null) {
            c957403oi.LIZLLL("cost_time", Long.valueOf(l.longValue()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS17S2200000_1 awS17S2200000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = ((C1054004Ag) awS17S2200000_1.l2).LIZIZ;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(concurrentHashMap);
        Object obj2 = awS17S2200000_1.l3;
        if (obj2 != null) {
            c957403oi.LIZJ("user_type", obj2);
        }
        String str = awS17S2200000_1.s0;
        if (str != null) {
            c957403oi.LIZJ("trigger_type", str);
        }
        String str2 = awS17S2200000_1.s1;
        if (str2 != null) {
            c957403oi.LIZJ("sale_price", str2);
        }
        C10472047q.LIZ(((C1054004Ag) awS17S2200000_1.l2).LIZIZ, false, c957403oi, false, null);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS17S2200000_1 awS17S2200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS17S2200000_1.l2).LIZIZ);
        laneParams.plusAssign("glide_type", awS17S2200000_1.s0);
        String str = awS17S2200000_1.s1;
        if (str != null) {
            laneParams.plusAssign("glide_direction", str);
        }
        laneParams.withParamsGroup((Map) awS17S2200000_1.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS17S2200000_1 awS17S2200000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS17S2200000_1.l2).LIZIZ);
        laneParams.plusAssign("button_for", awS17S2200000_1.s0);
        Boolean bool = (Boolean) awS17S2200000_1.l3;
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str = "yes";
            } else {
                str = "no";
            }
            laneParams.put("is_add_new_shipping", str);
        }
        String str2 = awS17S2200000_1.s1;
        if (str2 != null) {
            laneParams.put("sub_page_name", str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS17S2200000_1 awS17S2200000_1, Object obj) {
        ProductDetailReview productDetailReview;
        BrandInfo brandInfo;
        int i;
        int iIntValue;
        ProductDetailReview productDetailReview2;
        List<ReviewAspectPercentageCard> list;
        List<ReviewAspectPercentageItem> list2;
        ProductDetailReview productDetailReview3;
        Integer num;
        ProductDetailReview productDetailReview4;
        Object obj2;
        ProductDetailReview productDetailReview5;
        ProductDetailReview productDetailReview6;
        int iIntValue2;
        ShopReviewEntry shopReviewEntry;
        Integer num2;
        int i2;
        int i3;
        ProductDetailReview productDetailReview7;
        List<ReviewItemStruct> list3;
        int size;
        List<ReviewMedia> list4;
        ReviewMedia reviewMedia;
        Integer num3;
        List<ReviewMedia> list5;
        ReviewMedia reviewMedia2;
        Integer num4;
        List<ReviewMedia> list6;
        int iIntValue3;
        ProductDetailReview productDetailReview8;
        Integer num5;
        ProductDetailReview productDetailReview9;
        Float f;
        String str;
        C957403oi c957403oi = (C957403oi) obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = ((C1054004Ag) awS17S2200000_1.l2).LIZIZ;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(concurrentHashMap);
        ((HashMap) c957403oi.LIZ).putAll((Map) awS17S2200000_1.l3);
        ProductPackStruct productPackStruct = ((C1054004Ag) awS17S2200000_1.l2).LJIIZILJ;
        String strLIZIZ = null;
        if (productPackStruct != null) {
            productDetailReview = productPackStruct.review;
        } else {
            productDetailReview = null;
        }
        C1054004Ag.LJII(c957403oi, productDetailReview);
        c957403oi.LIZJ("module_name", awS17S2200000_1.s0);
        if (Intrinsics.LJFF(awS17S2200000_1.s0, "head_pic")) {
            ProductPackStruct productPackStruct2 = ((C1054004Ag) awS17S2200000_1.l2).LJIIZILJ;
            if (productPackStruct2 != null && productPackStruct2.LJII()) {
                str = "skc";
            } else {
                str = "sku";
            }
            c957403oi.LIZJ("sub_module_name", str);
        }
        if (Intrinsics.LJFF(awS17S2200000_1.s0, "rate")) {
            ProductPackStruct productPackStruct3 = ((C1054004Ag) awS17S2200000_1.l2).LJIIZILJ;
            if (productPackStruct3 != null && (productDetailReview9 = productPackStruct3.review) != null && (f = productDetailReview9.rating) != null) {
                c957403oi.LIZJ("rate", f);
            }
            ProductPackStruct productPackStruct4 = ((C1054004Ag) awS17S2200000_1.l2).LJIIZILJ;
            if (productPackStruct4 != null && (productDetailReview8 = productPackStruct4.review) != null && (num5 = productDetailReview8.reviewCount) != null) {
                iIntValue3 = num5.intValue();
            } else {
                iIntValue3 = 0;
            }
            c957403oi.LIZJ("review_cnt", Integer.valueOf(iIntValue3));
        }
        if (Intrinsics.LJFF(awS17S2200000_1.s0, "review_entrance")) {
            ProductPackStruct productPackStruct5 = ((C1054004Ag) awS17S2200000_1.l2).LJIIZILJ;
            if (productPackStruct5 != null && (productDetailReview7 = productPackStruct5.review) != null && (list3 = productDetailReview7.reviewItems) != null) {
                i2 = 0;
                i3 = 0;
                for (ReviewItemStruct reviewItemStruct : list3) {
                    ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
                    if (mainReview != null && (list6 = mainReview.media) != null) {
                        size = list6.size();
                    } else {
                        size = 0;
                    }
                    int iMin = Math.min(size, 4);
                    for (int i4 = 0; i4 < iMin; i4++) {
                        ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.review;
                        if (mainReview2 != null && (list5 = mainReview2.media) != null && (reviewMedia2 = (ReviewMedia) ListProtector.get(list5, i4)) != null && (num4 = reviewMedia2.mediaType) != null && num4.intValue() == 2) {
                            i3++;
                        } else {
                            ReviewItemStruct.MainReview mainReview3 = reviewItemStruct.review;
                            if (mainReview3 != null && (list4 = mainReview3.media) != null && (reviewMedia = (ReviewMedia) ListProtector.get(list4, i4)) != null && (num3 = reviewMedia.mediaType) != null && num3.intValue() == 1) {
                                i2++;
                            }
                        }
                    }
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
            c957403oi.LIZJ("photo_cnt", Integer.valueOf(i2));
            c957403oi.LIZJ("video_cnt", Integer.valueOf(i3));
        }
        if (Intrinsics.LJFF(awS17S2200000_1.s0, "shop_review_entrance")) {
            ProductPackStruct productPackStruct6 = ((C1054004Ag) awS17S2200000_1.l2).LJIIZILJ;
            if (productPackStruct6 != null && (shopReviewEntry = productPackStruct6.shopReview) != null && (num2 = shopReviewEntry.reviewCount) != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            c957403oi.LIZJ("shop_review_cnt", Integer.valueOf(iIntValue2));
        }
        if (Intrinsics.LJFF(awS17S2200000_1.s0, "size_fitness")) {
            ProductPackStruct productPackStruct7 = ((C1054004Ag) awS17S2200000_1.l2).LJIIZILJ;
            if (productPackStruct7 != null && (productDetailReview6 = productPackStruct7.review) != null && productDetailReview6.rating != null) {
                i = 1;
            } else {
                i = 0;
            }
            c957403oi.LIZJ("has_rate", Integer.valueOf(i));
            ProductPackStruct productPackStruct8 = ((C1054004Ag) awS17S2200000_1.l2).LJIIZILJ;
            if (productPackStruct8 != null && (productDetailReview4 = productPackStruct8.review) != null && productDetailReview4.rating != null) {
                if (productPackStruct8 == null || (productDetailReview5 = productPackStruct8.review) == null || (obj2 = productDetailReview5.rating) == null) {
                    obj2 = 0;
                }
                c957403oi.LIZJ("rate", obj2);
            }
            ProductPackStruct productPackStruct9 = ((C1054004Ag) awS17S2200000_1.l2).LJIIZILJ;
            if (productPackStruct9 != null && (productDetailReview3 = productPackStruct9.review) != null && (num = productDetailReview3.reviewCount) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c957403oi.LIZJ("review_cnt", Integer.valueOf(iIntValue));
            StringBuilder sb = new StringBuilder();
            ProductPackStruct productPackStruct10 = ((C1054004Ag) awS17S2200000_1.l2).LJIIZILJ;
            if (productPackStruct10 != null && (productDetailReview2 = productPackStruct10.review) != null && (list = productDetailReview2.reviewAspectPercentageCards) != null && (list2 = ((ReviewAspectPercentageCard) C13LP.LJJJJZI(list)).reviewAspectScoreItems) != null) {
                int i5 = 0;
                for (ReviewAspectPercentageItem reviewAspectPercentageItem : list2) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        ReviewAspectPercentageItem reviewAspectPercentageItem2 = reviewAspectPercentageItem;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(reviewAspectPercentageItem2.option);
                        sbLIZ.append(':');
                        sbLIZ.append(reviewAspectPercentageItem2.percentage);
                        sb.append(C2188811AlT.LIZIZ(sbLIZ));
                        List<ReviewAspectPercentageItem> list7 = ((ReviewAspectPercentageCard) C13LP.LJJJJZI(list)).reviewAspectScoreItems;
                        if (list7 == null || i5 != list7.size() - 1) {
                            sb.append(";");
                        }
                        i5 = i6;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            c957403oi.LIZJ("fitness_info", sb.toString());
        }
        ProductPackStruct productPackStruct11 = ((C1054004Ag) awS17S2200000_1.l2).LJIIZILJ;
        if (productPackStruct11 != null && (brandInfo = productPackStruct11.brandInfo) != null) {
            strLIZIZ = C10472047q.LIZIZ(brandInfo);
        }
        c957403oi.LIZJ("seller_logo_type", strLIZIZ);
        String str2 = awS17S2200000_1.s1;
        if (str2 != null && !a0.LJJJIL(str2)) {
            c957403oi.LIZJ("click_area", str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS17S2200000_1 awS17S2200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("EVENT_ORIGIN_FEATURE", "TEMAI");
        laneParams.plusAssign("page_name", "order_submit");
        laneParams.plusAssign("toast_name", awS17S2200000_1.l2);
        laneParams.plusAssign("error_code", awS17S2200000_1.s0);
        HashMap map = (HashMap) awS17S2200000_1.l3;
        if (map != null) {
            laneParams.putAll(map);
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(awS17S2200000_1.s1);
        if (mapLJIIJ != null) {
            for (Map.Entry<String, Object> entry : mapLJIIJ.entrySet()) {
                laneParams.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS17S2200000_1 awS17S2200000_1, Object obj) {
        HashMap map = (HashMap) obj;
        map.put("prepage_price", awS17S2200000_1.s0);
        map.put("pdp_price", awS17S2200000_1.s1);
        map.put("trackParams", (Map) awS17S2200000_1.l2);
        map.put("is_diff", Integer.valueOf(((C118300cf) awS17S2200000_1.l3).element));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS17S2200000_1 awS17S2200000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", awS17S2200000_1.s0);
        laneParams.plusAssign("button_name", awS17S2200000_1.s1);
        laneParams.plusAssign("button_type", awS17S2200000_1.s0);
        laneParams.plusAssign("sub_page_name", ((SkuPurchaseMethodReusedAssem) awS17S2200000_1.l2).getViewModel().LN());
        C042Y c042y = (C042Y) awS17S2200000_1.l3;
        if (c042y != null && c042y.LLJI) {
            str = "select";
        } else {
            str = "cancel";
        }
        laneParams.plusAssign("select_type", str);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS17S2200000_1 awS17S2200000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = ((C1054104Ah) awS17S2200000_1.l2).LIZIZ;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(concurrentHashMap);
        Object obj2 = awS17S2200000_1.l3;
        if (obj2 != null) {
            c957403oi.LIZJ("user_type", obj2);
        }
        String str = awS17S2200000_1.s0;
        if (str != null) {
            c957403oi.LIZJ("trigger_type", str);
        }
        String str2 = awS17S2200000_1.s1;
        if (str2 != null) {
            c957403oi.LIZJ("sale_price", str2);
        }
        C10473047r.LIZIZ(((C1054104Ah) awS17S2200000_1.l2).LIZIZ, false, c957403oi, false, null);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS17S2200000_1 awS17S2200000_1, Object obj) {
        String str;
        C04FG c04fg;
        C04CV c04cv;
        C04EU c04eu;
        C957403oi c957403oi = (C957403oi) obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = ((C1054104Ah) awS17S2200000_1.l2).LIZIZ;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(concurrentHashMap);
        SeaGodaManagerV2 seaGodaManagerV2 = (SeaGodaManagerV2) awS17S2200000_1.l3;
        if (seaGodaManagerV2 != null && (c04fg = seaGodaManagerV2.LLILZIL) != null && (c04cv = c04fg.LJFF) != null && (c04eu = c04cv.LIZJ) != null) {
            str = c04eu.LIZ;
        } else {
            str = null;
        }
        c957403oi.LIZJ("log_id", str);
        c957403oi.LIZJ(Scene.SCENE_SERVICE, awS17S2200000_1.s0);
        c957403oi.LIZJ("sku_id", awS17S2200000_1.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS17S2200000_1 awS17S2200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        String str = awS17S2200000_1.s0;
        if (str != null) {
            laneParams.plusAssign("promotion_id", str);
        }
        Integer num = (Integer) awS17S2200000_1.l2;
        if (num != null) {
            laneParams.plusAssign("promotion_logo_type", Integer.valueOf(num.intValue()));
        }
        Map map = (Map) awS17S2200000_1.l3;
        if (map != null) {
            laneParams.putAll(C00H3.LIZ(map));
        }
        C1010603xI.LIZJ(laneParams, awS17S2200000_1.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public static final Object invoke$7(AwS17S2200000_1 awS17S2200000_1, Object obj) {
        ?? BooleanValue;
        C890803dy c890803dy = (C890803dy) obj;
        Boolean bool = c890803dy.LLJIJIL;
        if (bool != null) {
            BooleanValue = bool.booleanValue();
        } else {
            BooleanValue = 0;
        }
        C890103dr.LJFF(C890103dr.LIZ, awS17S2200000_1.s0, C2097608Jq.LJIIIIZZ(new Pair("is_card_save", Integer.valueOf(c890803dy.LLILZIL ? 1 : 0)), new Pair("payment_info_finish", awS17S2200000_1.s1), new Pair("is_use_shipping_address", Integer.valueOf((int) BooleanValue)), new Pair("button_type", "add_card")), Boolean.valueOf(((CCDCAddCardViewModel) awS17S2200000_1.l2).KQ2().LJI), ((CCDCAddCardViewModel) awS17S2200000_1.l2).KQ2().LJII.toString(), ((CCDCAddCardViewModel) awS17S2200000_1.l2).KQ2().LJIIIIZZ, (Map) awS17S2200000_1.l3, null, 64);
        C888603dc.LIZ.getClass();
        C888603dc.LIZIZ = System.currentTimeMillis();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS17S2200000_1 awS17S2200000_1, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        c1397630mTR.LJFF = true;
        String str = awS17S2200000_1.s0;
        if (str != null) {
            c1397630mTR.LIZJ(0, str, new AwS367S0200000_1((CCDCAddCardHalfFragment) awS17S2200000_1.l2, (Context) awS17S2200000_1.l3, 241));
        }
        String str2 = awS17S2200000_1.s1;
        if (str2 != null) {
            c1397630mTR.LIZJ(1, str2, new C888703dd((CCDCAddCardHalfFragment) awS17S2200000_1.l2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS17S2200000_1 awS17S2200000_1, Object obj) {
        HashMap map = (HashMap) obj;
        map.put("prepage_price", awS17S2200000_1.s0);
        map.put("pdp_price", awS17S2200000_1.s1);
        map.put("trackParams", (Map) awS17S2200000_1.l2);
        map.put("is_diff", Integer.valueOf(((C118300cf) awS17S2200000_1.l3).element));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS17S2200000_1(X.C1054004Ag r3, X.C1054004Ag r4, java.lang.String r5, java.lang.String r6, java.util.Map<java.lang.String, ? extends java.lang.Object> r7) {
        /*
            r2 = this;
            r2.$t = r7
            int r7 = 11 - r7
            if (r7 == 0) goto L14
            r1 = r2
            r1.l2 = r3
            r1.l3 = r6
            r1.s0 = r4
            r1.s1 = r5
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l2 = r3
            r1.s0 = r4
            r1.s1 = r5
            r1.l3 = r6
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS17S2200000_1.<init>(X.04Ag, java.lang.String, java.lang.String, java.util.Map, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S2200000_1(C1054004Ag c1054004Ag, Object obj, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1054004Ag;
        this.l3 = obj;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S2200000_1(C1054004Ag c1054004Ag, String str, Boolean bool, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1054004Ag;
        this.s0 = str;
        this.l3 = bool;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S2200000_1(C1054104Ah c1054104Ah, SeaGodaManagerV2 seaGodaManagerV2, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1054104Ah;
        this.l3 = seaGodaManagerV2;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S2200000_1(C1054104Ah c1054104Ah, Object obj, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1054104Ah;
        this.l3 = obj;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S2200000_1(SeaSkuCounterCell seaSkuCounterCell, String str, LinearLayout linearLayout, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = seaSkuCounterCell;
        this.s0 = str;
        this.l3 = linearLayout;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S2200000_1(Boolean bool, String str, String str2, Long l, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = bool;
        this.l3 = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS17S2200000_1(Object obj, Object obj2, String str, HashMap<String, Object> map, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = obj;
        this.s0 = obj2;
        this.l3 = str;
        this.s1 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS17S2200000_1(String str, String str2, Integer num, Map<String, ? extends Object> map, String str3) {
        super(1);
        this.$t = str3;
        this.s0 = str;
        this.l2 = str2;
        this.l3 = num;
        this.s1 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S2200000_1(String str, String str2, CCDCAddCardHalfFragment cCDCAddCardHalfFragment, Context context, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = cCDCAddCardHalfFragment;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS17S2200000_1(String str, String str2, String str3, CCDCAddCardViewModel cCDCAddCardViewModel, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
        this.l3 = cCDCAddCardViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S2200000_1(String str, String str2, SkuPurchaseMethodReusedAssem skuPurchaseMethodReusedAssem, C042Y c042y, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = skuPurchaseMethodReusedAssem;
        this.l3 = c042y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS17S2200000_1(String str, String str2, String str3, Map<String, ? extends Object> map, C118300cf c118300cf) {
        super(1);
        this.$t = c118300cf;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
        this.l3 = map;
    }
}
