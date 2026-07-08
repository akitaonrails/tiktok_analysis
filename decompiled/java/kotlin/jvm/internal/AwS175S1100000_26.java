package kotlin.jvm.internal;

import X.C09AY;
import X.C1054104Ah;
import X.C1120604Zw;
import X.C1121904a9;
import X.C123100dR;
import X.C13LE;
import X.C1708030uY5;
import X.C1709570uaZ;
import X.C1709630uaf;
import X.C1710110ubR;
import X.C1713750uhJ;
import X.C1717190umr;
import X.C1741890vQh;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2371409Qy;
import X.C259800zU;
import X.InterfaceC1716260ulM;
import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AdExtra;
import com.ss.android.ugc.aweme.pipo.base.PipoEventService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class AwS175S1100000_26 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS175S1100000_26 awS175S1100000_26) {
        String strLJIIIIZZ;
        Type type;
        Object objFromJson;
        HashMap map = (HashMap) awS175S1100000_26.l1;
        String str = awS175S1100000_26.s0;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJII(AdExtra.class));
            } else {
                type = new TypeToken<AdExtra>() { // from class: X.0vAS
                }.getType();
            }
            objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!(objFromJson instanceof AdExtra) || objFromJson == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(objFromJson)) == null) {
            strLJIIIIZZ = "{}";
        }
        map.put("ad_extra", strLJIIIIZZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS175S1100000_26 awS175S1100000_26) {
        ((C1709630uaf) awS175S1100000_26.l1).LIZLLL("find_my_security_code", "got_it", awS175S1100000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS175S1100000_26 awS175S1100000_26) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type:");
        sbLIZ.append(awS175S1100000_26.s0);
        sbLIZ.append(" item_order:");
        sbLIZ.append(((Map) awS175S1100000_26.l1).get("item_order"));
        sbLIZ.append(" card_name:");
        sbLIZ.append(((Map) awS175S1100000_26.l1).get("card_name"));
        sbLIZ.append(" is_use_cache:");
        sbLIZ.append(((Map) awS175S1100000_26.l1).get("is_use_cache"));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$11(AwS175S1100000_26 awS175S1100000_26) {
        ((InterfaceC1716260ulM) awS175S1100000_26.l1).LIZJ(null, awS175S1100000_26.s0, null);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS175S1100000_26 awS175S1100000_26) {
        if (((C1713750uhJ) awS175S1100000_26.l1).LIZLLL > 0) {
            C1708030uY5.LIZ.LIZ(((C1713750uhJ) awS175S1100000_26.l1).LJFF).LIZJ(awS175S1100000_26.s0, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS175S1100000_26 awS175S1100000_26) {
        ((C1709630uaf) awS175S1100000_26.l1).LIZLLL("find_my_security_code", "got_it", awS175S1100000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS175S1100000_26 awS175S1100000_26) {
        String str = awS175S1100000_26.s0;
        if (C123100dR.LIZ(str) && str != null) {
            SmartRouter.buildRoute((Context) awS175S1100000_26.l1, str).open();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS175S1100000_26 awS175S1100000_26) {
        String str = awS175S1100000_26.s0;
        if (a0.LJJJIL(str)) {
            str = "switch_source";
        }
        C1710110ubR.LJIIIIZZ(str, "selected_hybrid_missing_in_new_source", "selected_hybrid_po", C1710110ubR.LIZJ(((C1709570uaZ) awS175S1100000_26.l1).LJJII), "null", C1709570uaZ.LJIL((C1709570uaZ) awS175S1100000_26.l1));
        ((C1709570uaZ) awS175S1100000_26.l1).LJJII = null;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS175S1100000_26 awS175S1100000_26) {
        String str = awS175S1100000_26.s0;
        if (a0.LJJJIL(str)) {
            str = "switch_source";
        }
        C1710110ubR.LJIIIIZZ(str, "selected_other_missing_in_new_source", "selected_other_po", C1710110ubR.LIZJ(((C1709570uaZ) awS175S1100000_26.l1).LJJIII), "null", C1709570uaZ.LJIL((C1709570uaZ) awS175S1100000_26.l1));
        ((C1709570uaZ) awS175S1100000_26.l1).LJJIII = null;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS175S1100000_26 awS175S1100000_26) {
        C1054104Ah c1054104Ah = ((SeaPdpHeadNavBarWidget) awS175S1100000_26.l1).LJIL().LLJLIL;
        if (c1054104Ah != null) {
            C1054104Ah.LJIIL(c1054104Ah, awS175S1100000_26.s0, null, null, null, 30);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS175S1100000_26 r4) {
        /*
            java.lang.String r0 = r4.s0
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.String r2 = "redirect_url"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r3, r2)
            if (r0 == 0) goto L2e
            int r0 = r0.length()
            if (r0 == 0) goto L2e
            java.lang.Object r1 = r4.l1
            X.00zU r1 = (X.C259800zU) r1
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r3, r2)
            if (r0 == 0) goto L2a
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L2c
        L2a:
            java.lang.String r0 = ""
        L2c:
            r1.element = r0
        L2e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS175S1100000_26.invoke$7(kotlin.jvm.internal.AwS175S1100000_26):java.lang.Object");
    }

    public static final Object invoke$8(AwS175S1100000_26 awS175S1100000_26) {
        ((Function1) awS175S1100000_26.l1).invoke(awS175S1100000_26.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS175S1100000_26 awS175S1100000_26) {
        PipoEventService.LIZJ().LIZ(awS175S1100000_26.s0, new JSONObject(C2097608Jq.LJIIZILJ((Map) awS175S1100000_26.l1)), null, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS175S1100000_26(C1709570uaZ c1709570uaZ, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1709570uaZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS175S1100000_26(C1709630uaf c1709630uaf, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1709630uaf;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS175S1100000_26(C1713750uhJ c1713750uhJ, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1713750uhJ;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS175S1100000_26(C1717190umr c1717190umr, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1717190umr;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS175S1100000_26(SeaPdpHeadNavBarWidget seaPdpHeadNavBarWidget, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = seaPdpHeadNavBarWidget;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS175S1100000_26(String str, String str2, C259800zU<String> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS175S1100000_26(String str, Context context, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS175S1100000_26(String str, HashMap map, int i) {
        super(0);
        this.$t = i;
        this.l1 = map;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS175S1100000_26(String str, String str2, Map<String, ? extends Object> map) {
        super(0);
        this.$t = map;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS175S1100000_26(String str, AwS588S0100000_9 awS588S0100000_9, int i) {
        super(0);
        this.$t = i;
        this.l1 = awS588S0100000_9;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS175S1100000_26(Map map, Map<String, String> map2, String str) {
        super(0);
        this.$t = str;
        this.l1 = map;
        this.s0 = map2;
    }
}
