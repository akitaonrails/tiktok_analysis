package kotlin.jvm.internal;

import X.C049K;
import X.C049L;
import X.C049X;
import X.C04G1;
import X.C09AY;
import X.C1010603xI;
import X.C1748720vbi;
import X.C1752450vhj;
import X.C1752460vhk;
import X.C1752480vhm;
import X.C1752970viZ;
import X.C1765430w2f;
import X.C23250099c;
import X.C817503Hh;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductTile;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.track.SeaGodaV1TrackHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.CommonParamsContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend.ProductRecommendFeedCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS0S0411000_26 extends C09AY implements Function1 {
    public final int $t;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S0411000_26 awS0S0411000_26, Object obj) {
        String str;
        Object obj2;
        String str2;
        ProductBase productBase;
        String str3;
        ProductBase productBase2;
        Map<String, ? extends Object> mapLIZ;
        LaneParams laneParams = (LaneParams) obj;
        CommonParamsContext commonParamsContext = (CommonParamsContext) ((SeaGodaV1TrackHelper) awS0S0411000_26.l0).LLILZLL.getValue();
        if (commonParamsContext != null && (mapLIZ = C1765430w2f.LIZ(commonParamsContext.LL)) != null) {
            laneParams.withParamsGroup(mapLIZ);
        }
        ProductPackStruct productPackStruct = ((SeaGodaV1TrackHelper) awS0S0411000_26.l0).LLILLL.LLJIJIL;
        Integer numValueOf = null;
        if (productPackStruct != null && (productBase2 = productPackStruct.baseInfo) != null) {
            str = productBase2.headerImageDaInfo;
        } else {
            str = null;
        }
        C1010603xI.LIZJ(laneParams, str);
        Integer num = (Integer) awS0S0411000_26.l1;
        ISeaListHelper iSeaListHelperLIZ = ((SeaGodaV1TrackHelper) awS0S0411000_26.l0).LIZ();
        if (iSeaListHelperLIZ != null) {
            numValueOf = Integer.valueOf(iSeaListHelperLIZ.vh2());
        }
        boolean zLJFF = Intrinsics.LJFF(num, numValueOf);
        String str4 = "1";
        if (zLJFF) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("is_first_show", obj2);
        laneParams.plusAssign("position_rank", Integer.valueOf(awS0S0411000_26.i5));
        laneParams.plusAssign("page_name", "product_detail");
        laneParams.plusAssign("module_name", "head_pic");
        if (awS0S0411000_26.z4) {
            str2 = "full_screen";
        } else {
            str2 = "half_screen";
        }
        laneParams.plusAssign("page_show_type", str2);
        if (!Intrinsics.LJFF(((C04G1) awS0S0411000_26.l2).LJIJJLI.LIZ, "video_style")) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.put("is_video", str4);
        ProductPackStruct productPackStruct2 = ((SeaGodaV1TrackHelper) awS0S0411000_26.l0).LLILLL.LLJIJIL;
        if (productPackStruct2 != null && (productBase = productPackStruct2.baseInfo) != null && (str3 = productBase.categoryId) != null) {
            laneParams.plusAssign("first_category_id", str3);
        }
        Map map = (Map) awS0S0411000_26.l3;
        if (map != null) {
            laneParams.putAll(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0411000_26 awS0S0411000_26, Object obj) {
        String str;
        Object obj2;
        String str2;
        int iIntValue;
        ProductBase productBase;
        String str3;
        ProductBase productBase2;
        LaneParams laneParams = (LaneParams) obj;
        ProductPackStruct productPackStruct = ((SeaGodaV1TrackHelper) awS0S0411000_26.l0).LLILLL.LLJIJIL;
        Integer numValueOf = null;
        if (productPackStruct != null && (productBase2 = productPackStruct.baseInfo) != null) {
            str = productBase2.headerImageDaInfo;
        } else {
            str = null;
        }
        C1010603xI.LIZJ(laneParams, str);
        Integer num = (Integer) awS0S0411000_26.l1;
        ISeaListHelper iSeaListHelperLIZ = ((SeaGodaV1TrackHelper) awS0S0411000_26.l0).LIZ();
        if (iSeaListHelperLIZ != null) {
            numValueOf = Integer.valueOf(iSeaListHelperLIZ.vh2());
        }
        boolean zLJFF = Intrinsics.LJFF(num, numValueOf);
        String str4 = "1";
        if (zLJFF) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("is_first_show", obj2);
        laneParams.plusAssign("position_rank", Integer.valueOf(awS0S0411000_26.i5));
        laneParams.plusAssign("page_name", "product_detail");
        laneParams.plusAssign("module_name", "head_pic");
        if (awS0S0411000_26.z4) {
            str2 = "full_screen";
        } else {
            str2 = "half_screen";
        }
        laneParams.plusAssign("page_show_type", str2);
        if (!Intrinsics.LJFF(((C04G1) awS0S0411000_26.l2).LJIJJLI.LIZ, "video_style")) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.put("is_video", str4);
        ProductPackStruct productPackStruct2 = ((SeaGodaV1TrackHelper) awS0S0411000_26.l0).LLILLL.LLJIJIL;
        if (productPackStruct2 != null && (productBase = productPackStruct2.baseInfo) != null && (str3 = productBase.categoryId) != null) {
            laneParams.plusAssign("first_category_id", str3);
        }
        Map map = (Map) awS0S0411000_26.l3;
        if (map != null) {
            laneParams.putAll(map);
        }
        SeaGodaV1TrackHelper seaGodaV1TrackHelper = (SeaGodaV1TrackHelper) awS0S0411000_26.l0;
        Integer num2 = (Integer) awS0S0411000_26.l1;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        laneParams.putAll(seaGodaV1TrackHelper.LIZIZ(iIntValue));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S0411000_26 awS0S0411000_26, Object obj) {
        C1752480vhm c1752480vhmPR2;
        String str;
        PdpViewModel pdpViewModelN5 = ((ProductRecommendFeedCell) awS0S0411000_26.l0).N5();
        if (pdpViewModelN5 != null && (c1752480vhmPR2 = pdpViewModelN5.PR2()) != null) {
            String str2 = ((C1752970viZ) awS0S0411000_26.l1).LL;
            LinkedHashMap linkedHashMap = (LinkedHashMap) c1752480vhmPR2.LJ;
            Object c1752460vhk = linkedHashMap.get(str2);
            if (c1752460vhk == null) {
                c1752460vhk = new C1752460vhk(str2);
                linkedHashMap.put(str2, c1752460vhk);
            }
            C1752460vhk c1752460vhk2 = (C1752460vhk) c1752460vhk;
            ProductTile productTile = (ProductTile) awS0S0411000_26.l2;
            if (productTile != null && (str = productTile.id) != null && !c1752460vhk2.LIZIZ.contains(str)) {
                c1752460vhk2.LIZJ.add(str);
                if (c1752460vhk2.LIZLLL == null || (!r0.isActive())) {
                    c1752460vhk2.LIZLLL = C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1752450vhj(c1752460vhk2, null), 3);
                }
            }
        }
        C1748720vbi.LIZLLL(((ProductRecommendFeedCell) awS0S0411000_26.l0).itemView, new C049K(), new AwS121S0400000_26((ProductTile) awS0S0411000_26.l2, (C1752970viZ) awS0S0411000_26.l1, (ProductRecommendFeedCell) awS0S0411000_26.l0, (Map) awS0S0411000_26.l3, 30));
        C1748720vbi.LIZLLL(((ProductRecommendFeedCell) awS0S0411000_26.l0).itemView, new C049L(), new AwS121S0400000_26((ProductTile) awS0S0411000_26.l2, (C1752970viZ) awS0S0411000_26.l1, (ProductRecommendFeedCell) awS0S0411000_26.l0, (Map) awS0S0411000_26.l3, 31));
        if (awS0S0411000_26.z4) {
            C1748720vbi.LIZLLL(((ProductRecommendFeedCell) awS0S0411000_26.l0).itemView, new C049X(), new AwS50S0301000_26((C1752970viZ) awS0S0411000_26.l1, (ProductTile) awS0S0411000_26.l2, (ProductRecommendFeedCell) awS0S0411000_26.l0, awS0S0411000_26.i5, 4));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0411000_26(SeaGodaV1TrackHelper seaGodaV1TrackHelper, SeaGodaV1TrackHelper seaGodaV1TrackHelper2, Integer num, int i, boolean z, C04G1 c04g1, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = seaGodaV1TrackHelper;
        this.l1 = seaGodaV1TrackHelper2;
        this.i5 = num;
        this.z4 = i;
        this.l2 = z;
        this.l3 = c04g1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0411000_26(ProductRecommendFeedCell productRecommendFeedCell, ProductRecommendFeedCell productRecommendFeedCell2, C1752970viZ c1752970viZ, ProductTile productTile, boolean z, Map<String, ? extends Object> map, int i) {
        super(1);
        this.$t = i;
        this.l0 = productRecommendFeedCell;
        this.l1 = productRecommendFeedCell2;
        this.l2 = c1752970viZ;
        this.z4 = productTile;
        this.l3 = z;
        this.i5 = map;
    }
}
