package kotlin.jvm.internal;

import X.C03XW;
import X.C09AY;
import X.C1391190mJ3;
import X.C1714660uim;
import X.C343970De7;
import X.InterfaceC1725110uzd;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.pipo.errorsdk.fragment.ErrorCodeSdkBottomSheetFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class AwS36S2200000_26 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS36S2200000_26 awS36S2200000_26) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = awS36S2200000_26.s0;
        String str2 = awS36S2200000_26.s1;
        jSONObject.put("action_type", str);
        jSONObject.put("ui_type", str2);
        jSONObject.put("reason", "click_button");
        InterfaceC1725110uzd interfaceC1725110uzd = (InterfaceC1725110uzd) awS36S2200000_26.l2;
        if (interfaceC1725110uzd != null) {
            interfaceC1725110uzd.LIZ(C03XW.ON_CLOSE, jSONObject);
        }
        String str3 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((Fragment) awS36S2200000_26.l3, C343970De7.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS36S2200000_26 awS36S2200000_26) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("obj_id", awS36S2200000_26.s0);
        linkedHashMap.put("click_use_time", String.valueOf(System.currentTimeMillis() - ((C1714660uim) awS36S2200000_26.l2).LIZLLL));
        Map map = (Map) awS36S2200000_26.l3;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        ((C1714660uim) awS36S2200000_26.l2).LIZ(awS36S2200000_26.s1, linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS36S2200000_26 awS36S2200000_26) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("obj_id", awS36S2200000_26.s0);
        linkedHashMap.put("click_use_time", String.valueOf(System.currentTimeMillis() - ((C1714660uim) awS36S2200000_26.l2).LIZLLL));
        Map map = (Map) awS36S2200000_26.l3;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        ((C1714660uim) awS36S2200000_26.l2).LIZ(awS36S2200000_26.s1, linkedHashMap);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S2200000_26(String str, C1714660uim c1714660uim, Map map, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l2 = c1714660uim;
        this.l3 = map;
        this.s1 = "rd_pipo_veri_center_page_first_click";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S2200000_26(InterfaceC1725110uzd interfaceC1725110uzd, ErrorCodeSdkBottomSheetFragment errorCodeSdkBottomSheetFragment, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = interfaceC1725110uzd;
        this.l3 = errorCodeSdkBottomSheetFragment;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS36S2200000_26(String str, String str2, C1714660uim c1714660uim, Map<String, String> map, String str3) {
        super(0);
        this.$t = str3;
        this.s0 = str;
        this.l2 = str2;
        this.l3 = c1714660uim;
        this.s1 = map;
    }
}
