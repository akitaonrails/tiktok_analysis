package kotlin.jvm.internal;

import X.C042Y;
import X.C062P;
import X.C09AY;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C1741890vQh;
import X.C888203dY;
import Y.ARunnableS1S2200000_1;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.SeaOneStepOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS30S2100000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS30S2100000_1 awS30S2100000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", awS30S2100000_1.s0);
        laneParams.plusAssign("button_name", awS30S2100000_1.s1);
        laneParams.plusAssign("button_type", awS30S2100000_1.s0);
        C042Y c042y = (C042Y) awS30S2100000_1.l2;
        if (c042y != null && c042y.LLJI) {
            str = "select";
        } else {
            str = "cancel";
        }
        laneParams.plusAssign("select_type", str);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS30S2100000_1 awS30S2100000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", awS30S2100000_1.s0);
        laneParams.plusAssign("button_name", awS30S2100000_1.s1);
        laneParams.plusAssign("button_type", awS30S2100000_1.s0);
        C042Y c042y = (C042Y) awS30S2100000_1.l2;
        if (c042y != null && c042y.LLJI) {
            str = "select";
        } else {
            str = "cancel";
        }
        laneParams.plusAssign("select_type", str);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS30S2100000_1 awS30S2100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS30S2100000_1.l2).LIZIZ);
        laneParams.plusAssign("visible_module", awS30S2100000_1.s0);
        laneParams.plusAssign("action_type", awS30S2100000_1.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS30S2100000_1 awS30S2100000_1, Object obj) {
        Context context = ((CombinedSkuOrderSubmitFragment) awS30S2100000_1.l2).getContext();
        if (context != null) {
            CombinedSkuOrderSubmitFragment combinedSkuOrderSubmitFragment = (CombinedSkuOrderSubmitFragment) awS30S2100000_1.l2;
            String str = awS30S2100000_1.s0;
            String str2 = awS30S2100000_1.s1;
            View view = combinedSkuOrderSubmitFragment.getView();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS1S2200000_1(context, str, str2, combinedSkuOrderSubmitFragment, 4));
            }
            combinedSkuOrderSubmitFragment.VR().XQ2();
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$12(AwS30S2100000_1 awS30S2100000_1, Object obj) {
        Context context = ((SeaOneStepOrderSubmitFragment) awS30S2100000_1.l2).getContext();
        if (context != null) {
            SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment = (SeaOneStepOrderSubmitFragment) awS30S2100000_1.l2;
            String str = awS30S2100000_1.s0;
            String str2 = awS30S2100000_1.s1;
            View view = seaOneStepOrderSubmitFragment.getView();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS1S2200000_1(context, str, str2, seaOneStepOrderSubmitFragment, 2));
            }
            seaOneStepOrderSubmitFragment.bS().XQ2();
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$13(AwS30S2100000_1 awS30S2100000_1, Object obj) {
        Context context = ((MiniOspFragment) awS30S2100000_1.l2).getContext();
        if (context == null) {
            return null;
        }
        MiniOspFragment miniOspFragment = (MiniOspFragment) awS30S2100000_1.l2;
        String str = awS30S2100000_1.s0;
        String str2 = awS30S2100000_1.s1;
        View view = miniOspFragment.getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS1S2200000_1(context, str, str2, miniOspFragment, 3));
        }
        MiniOspViewModel miniOspViewModelWR = miniOspFragment.WR();
        MiniOspViewModel.kR2(miniOspViewModelWR, null, false, "reset for clearing", 6);
        miniOspViewModelWR.setState(new AwS580S0100000_1(miniOspViewModelWR, 409));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS30S2100000_1 awS30S2100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.putAll((LinkedHashMap) awS30S2100000_1.l2);
        laneParams.plusAssign("module_name", "size_guide_popup_layer");
        String str = awS30S2100000_1.s0;
        if (str == null) {
            str = "";
        }
        laneParams.plusAssign("sku_id", str);
        String str2 = awS30S2100000_1.s1;
        if (str2 != null && !a0.LJJJIL(str2)) {
            laneParams.withNotCheckParam("shop_id", str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS30S2100000_1 awS30S2100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.putAll((LinkedHashMap) awS30S2100000_1.l2);
        laneParams.plusAssign("module_name", "size_guide_popup_layer");
        String str = awS30S2100000_1.s0;
        if (str == null) {
            str = "";
        }
        laneParams.plusAssign("sku_id", str);
        String str2 = awS30S2100000_1.s1;
        if (str2 != null && !a0.LJJJIL(str2)) {
            laneParams.withNotCheckParam("shop_id", str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS30S2100000_1 awS30S2100000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS30S2100000_1.l2).LIZIZ);
        laneParams.plusAssign("photo_id", awS30S2100000_1.s0);
        laneParams.plusAssign("photo_type", awS30S2100000_1.s1);
        ProductPackStruct productPackStruct = ((C1054104Ah) awS30S2100000_1.l2).LJIIL;
        if (productPackStruct != null && productPackStruct.LJII()) {
            str = "skc";
        } else {
            str = "sku";
        }
        laneParams.plusAssign("sub_module_name", str);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS30S2100000_1 awS30S2100000_1, Object obj) {
        CCDCAddCardHalfFragment cCDCAddCardHalfFragment = (CCDCAddCardHalfFragment) awS30S2100000_1.l2;
        ((C062P) obj).LIZ = new C888203dY(cCDCAddCardHalfFragment.LLJJIJIIJIL, cCDCAddCardHalfFragment.LLJJIJIL, cCDCAddCardHalfFragment.LLJJJJ, cCDCAddCardHalfFragment.LLJJJ, awS30S2100000_1.s0, null, awS30S2100000_1.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS30S2100000_1 awS30S2100000_1, Object obj) {
        Assembler assembler = (Assembler) obj;
        CCDCAddCardHalfFragment cCDCAddCardHalfFragment = (CCDCAddCardHalfFragment) awS30S2100000_1.l2;
        assembler.DQ2(cCDCAddCardHalfFragment, new AwS30S2100000_1(cCDCAddCardHalfFragment, awS30S2100000_1.s0, awS30S2100000_1.s1, 5));
        assembler.QQ2((CCDCAddCardHalfFragment) awS30S2100000_1.l2, AFwS229S0000000_2.get$arr$(722));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS30S2100000_1 awS30S2100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.put("page_name", awS30S2100000_1.s0);
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(awS30S2100000_1.s1);
        if (mapLJIIJ != null) {
            laneParams.withNotCheckParams(mapLJIIJ);
        }
        Map<String, ? extends Object> map = (Map) awS30S2100000_1.l2;
        if (map != null) {
            laneParams.withNotCheckParams(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS30S2100000_1 awS30S2100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.put("page_name", awS30S2100000_1.s0);
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(awS30S2100000_1.s1);
        if (mapLJIIJ != null) {
            laneParams.withNotCheckParams(mapLJIIJ);
        }
        Map<String, ? extends Object> map = (Map) awS30S2100000_1.l2;
        if (map != null) {
            laneParams.withNotCheckParams(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS30S2100000_1 awS30S2100000_1, Object obj) {
        HashMap<String, Object> mapLJIIJ;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS30S2100000_1.l2).LIZIZ);
        laneParams.put("actionsheet_name", "algo_voucher");
        laneParams.put("module_type", awS30S2100000_1.s0);
        String str = awS30S2100000_1.s1;
        if (str != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            Object obj2 = mapLJIIJ.get("module_type");
            if (obj2 != null) {
                laneParams.plusAssign("module_type", obj2);
            }
            Object obj3 = mapLJIIJ.get("actionsheet_name");
            if (obj3 != null) {
                laneParams.plusAssign("actionsheet_name", obj3);
            }
            laneParams.withNotCheckParams(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S2100000_1(String str, Map map, int i) {
        super(1);
        this.$t = i;
        this.s0 = "order_submit";
        this.s1 = str;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S2100000_1(C1054004Ag c1054004Ag, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1054004Ag;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S2100000_1(C1054104Ah c1054104Ah, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1054104Ah;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S2100000_1(CombinedSkuOrderSubmitFragment combinedSkuOrderSubmitFragment, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = combinedSkuOrderSubmitFragment;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S2100000_1(MiniOspFragment miniOspFragment, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = miniOspFragment;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S2100000_1(SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = seaOneStepOrderSubmitFragment;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S2100000_1(CCDCAddCardHalfFragment cCDCAddCardHalfFragment, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = cCDCAddCardHalfFragment;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S2100000_1(String str, String str2, C042Y c042y, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = c042y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS30S2100000_1(String str, String str2, String str3, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS30S2100000_1(LinkedHashMap linkedHashMap, LinkedHashMap<String, Object> linkedHashMap2, String str, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = linkedHashMap;
        this.s0 = linkedHashMap2;
        this.s1 = str;
    }
}
