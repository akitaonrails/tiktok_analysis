package kotlin.jvm.internal;

import X.C09AY;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C1745480vWU;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS11S2300000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS11S2300000_26 awS11S2300000_26, Object obj) {
        String str;
        String str2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup((HashMap) awS11S2300000_26.l2);
        laneParams.withParamsGroup(((C1054104Ah) awS11S2300000_26.l3).LJIIIZ());
        laneParams.plusAssign("from_user_id", awS11S2300000_26.s0);
        laneParams.plusAssign("platform", awS11S2300000_26.s1);
        laneParams.plusAssign("chat_type", "outside");
        laneParams.plusAssign("EVENT_ORIGIN_FEATURE", "TEMAI");
        C1054104Ah c1054104Ah = (C1054104Ah) awS11S2300000_26.l3;
        int iTg2 = ((SeaPdpViewModel) awS11S2300000_26.l4).Tg2();
        c1054104Ah.getClass();
        if (iTg2 != 1) {
            if (iTg2 != 2) {
                str = "product_detail";
            } else {
                str = "shop_review";
            }
        } else {
            str = "product_review";
        }
        laneParams.plusAssign("page_name", str);
        if (Intrinsics.LJFF(String.valueOf(((HashMap) awS11S2300000_26.l2).get("author_id")), awS11S2300000_26.s0)) {
            str2 = "author";
        } else {
            str2 = "user";
        }
        laneParams.plusAssign("user_type", str2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS11S2300000_26 awS11S2300000_26, Object obj) {
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", ((C1745480vWU) awS11S2300000_26.l2).LIZ.getPageName());
        HashMap map = (HashMap) awS11S2300000_26.l3;
        Object obj3 = null;
        if (map != null) {
            obj2 = map.get("previous_page");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("previous_page", obj2);
        HashMap map2 = (HashMap) awS11S2300000_26.l3;
        if (map2 != null) {
            obj3 = map2.get("entrance_info");
        }
        laneParams.plusAssign("entrance_info", obj3);
        laneParams.plusAssign("module_name", awS11S2300000_26.s0);
        laneParams.plusAssign("fill_type", ((C1745480vWU) awS11S2300000_26.l2).LIZ.LLLLL.type());
        String str = awS11S2300000_26.s1;
        if (str != null) {
            laneParams.plusAssign("click_area", str);
        }
        Map<String, ? extends Object> map3 = (Map) awS11S2300000_26.l4;
        if (map3 != null) {
            laneParams.withNotCheckParams(map3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS11S2300000_26 awS11S2300000_26, Object obj) {
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", "shipping_address");
        String str = awS11S2300000_26.s0;
        if (str == null) {
            str = "allow_tt_access_location";
        }
        laneParams.plusAssign("popup_name", str);
        HashMap map = (HashMap) awS11S2300000_26.l2;
        if (map != null) {
            obj2 = map.get("previous_page");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("previous_page", obj2);
        String str2 = awS11S2300000_26.s1;
        if (str2 != null) {
            laneParams.withNotCheckParam("module_name", str2);
        }
        laneParams.withNotCheckParam("fill_type", ((C1745480vWU) awS11S2300000_26.l3).LIZ.LLLLL.type());
        Map<String, ? extends Object> map2 = (Map) awS11S2300000_26.l4;
        if (map2 != null) {
            laneParams.withNotCheckParams(map2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS11S2300000_26 awS11S2300000_26, Object obj) {
        String str;
        String str2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup((HashMap) awS11S2300000_26.l2);
        laneParams.withParamsGroup(((C1054004Ag) awS11S2300000_26.l3).LJIIIZ());
        laneParams.plusAssign("from_user_id", awS11S2300000_26.s0);
        laneParams.plusAssign("platform", awS11S2300000_26.s1);
        laneParams.plusAssign("chat_type", "outside");
        laneParams.plusAssign("EVENT_ORIGIN_FEATURE", "TEMAI");
        C1054004Ag c1054004Ag = (C1054004Ag) awS11S2300000_26.l3;
        int iTg2 = ((PdpViewModel) awS11S2300000_26.l4).Tg2();
        c1054004Ag.getClass();
        if (iTg2 != 1) {
            if (iTg2 != 2) {
                str = "product_detail";
            } else {
                str = "shop_review";
            }
        } else {
            str = "product_review";
        }
        laneParams.plusAssign("page_name", str);
        if (Intrinsics.LJFF(String.valueOf(((HashMap) awS11S2300000_26.l2).get("author_id")), awS11S2300000_26.s0)) {
            str2 = "author";
        } else {
            str2 = "user";
        }
        laneParams.plusAssign("user_type", str2);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS11S2300000_26(X.C1745480vWU r3, java.lang.String r4, java.lang.String r5, java.util.HashMap r6, java.util.Map r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            int r8 = 1 - r8
            if (r8 == 0) goto L16
            r1 = r2
            r1.s0 = r4
            r1.l2 = r6
            r1.s1 = r5
            r1.l3 = r3
            r1.l4 = r7
            r0 = 1
        L12:
            r1.<init>(r0)
            return
        L16:
            r1 = r2
            r1.l2 = r3
            r1.l3 = r6
            r1.s0 = r4
            r1.s1 = r5
            r1.l4 = r7
            r0 = 1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS11S2300000_26.<init>(X.0vWU, java.lang.String, java.lang.String, java.util.HashMap, java.util.Map, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS11S2300000_26(HashMap map, HashMap<String, Object> map2, C1054004Ag c1054004Ag, String str, String str2, PdpViewModel pdpViewModel) {
        super(1);
        this.$t = pdpViewModel;
        this.l2 = map;
        this.l3 = map2;
        this.s0 = c1054004Ag;
        this.s1 = str;
        this.l4 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS11S2300000_26(HashMap map, HashMap<String, Object> map2, C1054104Ah c1054104Ah, String str, String str2, SeaPdpViewModel seaPdpViewModel) {
        super(1);
        this.$t = seaPdpViewModel;
        this.l2 = map;
        this.l3 = map2;
        this.s0 = c1054104Ah;
        this.s1 = str;
        this.l4 = str2;
    }
}
