package kotlin.jvm.internal;

import X.C04CS;
import X.C04FN;
import X.C09AY;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C1156570gCd;
import X.C1716020uky;
import X.C1716050ul1;
import X.C19EG;
import X.EnumC1066604Fc;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PdpSkuPropSelectionViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropValue;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS16S1210000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS16S1210000_26 awS16S1210000_26, Object obj) {
        C1716050ul1.LIZLLL((C1716050ul1) awS16S1210000_26.l1, awS16S1210000_26.s0, "go_to_settings");
        if (!awS16S1210000_26.z3) {
            C1716020uky.LIZJ((C19EG) awS16S1210000_26.l2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS16S1210000_26 awS16S1210000_26, Object obj) {
        boolean z;
        String str;
        C04CS c04cs;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("select_type", awS16S1210000_26.s0);
        linkedHashMap.put("sale_prop_status", Boolean.valueOf(awS16S1210000_26.z3));
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        linkedHashMap.put("is_complete_sku", Boolean.valueOf(z));
        C04FN c04fn = ((C1156570gCd) ((PdpSkuPropSelectionViewModel) awS16S1210000_26.l1).getState()).LL;
        if (c04fn != null) {
            PropValue propValue = (PropValue) awS16S1210000_26.l2;
            PdpSkuPropSelectionViewModel pdpSkuPropSelectionViewModel = (PdpSkuPropSelectionViewModel) awS16S1210000_26.l1;
            Map<String, String> map = propValue.eventTrackingTriggerKeys;
            if (map != null && (str = map.get(EnumC1066604Fc.BUTTON_CLICK.getValue())) != null && (c04cs = pdpSkuPropSelectionViewModel.LLILZ) != null) {
                c04cs.LJI(c04fn, str, linkedHashMap);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS16S1210000_26 awS16S1210000_26, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        boolean z = awS16S1210000_26.z3;
        Response response = (Response) awS16S1210000_26.l1;
        String str2 = awS16S1210000_26.s0;
        Map<String, ? extends Object> map = (Map) awS16S1210000_26.l2;
        if (z) {
            str = "save";
        } else {
            str = "unsave";
        }
        laneParams.plusAssign("save_type", str);
        Object objValueOf = null;
        if (response != null) {
            objValueOf = Integer.valueOf(response.code);
        }
        int i = 1;
        if ((response != null && response.isCodeOK()) || objValueOf == null) {
            objValueOf = "";
        }
        laneParams.plusAssign("error_code", objValueOf);
        if (response == null || !response.isCodeOK()) {
            i = 0;
        }
        laneParams.plusAssign("is_success", Integer.valueOf(i));
        laneParams.plusAssign("prompt_type", str2);
        laneParams.withParamsGroup(map);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS16S1210000_26 awS16S1210000_26, Object obj) {
        C1054104Ah c1054104Ah = (C1054104Ah) awS16S1210000_26.l1;
        boolean z = awS16S1210000_26.z3;
        String str = awS16S1210000_26.s0;
        SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) awS16S1210000_26.l2;
        c1054104Ah.getClass();
        C1054104Ah.LJJJIL((LaneParams) obj, z, str, seaPdpViewModel);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS16S1210000_26 awS16S1210000_26, Object obj) {
        C1054104Ah c1054104Ah = (C1054104Ah) awS16S1210000_26.l1;
        boolean z = awS16S1210000_26.z3;
        String str = awS16S1210000_26.s0;
        SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) awS16S1210000_26.l2;
        c1054104Ah.getClass();
        C1054104Ah.LJJJIL((LaneParams) obj, z, str, seaPdpViewModel);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS16S1210000_26 awS16S1210000_26, Object obj) {
        C1054004Ag c1054004Ag = (C1054004Ag) awS16S1210000_26.l1;
        boolean z = awS16S1210000_26.z3;
        String str = awS16S1210000_26.s0;
        PdpViewModel pdpViewModel = (PdpViewModel) awS16S1210000_26.l2;
        c1054004Ag.getClass();
        C1054004Ag.LJJJ((LaneParams) obj, z, str, pdpViewModel);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS16S1210000_26 awS16S1210000_26, Object obj) {
        C1054004Ag c1054004Ag = (C1054004Ag) awS16S1210000_26.l1;
        boolean z = awS16S1210000_26.z3;
        String str = awS16S1210000_26.s0;
        PdpViewModel pdpViewModel = (PdpViewModel) awS16S1210000_26.l2;
        c1054004Ag.getClass();
        C1054004Ag.LJJJ((LaneParams) obj, z, str, pdpViewModel);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S1210000_26(C1054004Ag c1054004Ag, boolean z, PdpViewModel pdpViewModel, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1054004Ag;
        this.z3 = z;
        this.s0 = null;
        this.l2 = pdpViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S1210000_26(C1054104Ah c1054104Ah, boolean z, SeaPdpViewModel seaPdpViewModel, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1054104Ah;
        this.z3 = z;
        this.s0 = null;
        this.l2 = seaPdpViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S1210000_26(C1716050ul1 c1716050ul1, String str, boolean z, C19EG c19eg, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1716050ul1;
        this.s0 = str;
        this.z3 = z;
        this.l2 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S1210000_26(String str, boolean z, PdpSkuPropSelectionViewModel pdpSkuPropSelectionViewModel, PropValue propValue, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z3 = z;
        this.l1 = pdpSkuPropSelectionViewModel;
        this.l2 = propValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS16S1210000_26(boolean z, boolean z2, Response<n> response, String str, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.z3 = z;
        this.l1 = z2;
        this.s0 = response;
        this.l2 = str;
    }
}
