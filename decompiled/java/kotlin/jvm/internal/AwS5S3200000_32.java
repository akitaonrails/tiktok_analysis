package kotlin.jvm.internal;

import X.C09AY;
import X.C1018703yb;
import X.C1739800vNK;
import X.C1741890vQh;
import X.C18LT;
import X.C21268418La;
import X.C21271918Mj;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.model.TermsApply;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS5S3200000_32 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;

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

    public static final Object invoke$0(AwS5S3200000_32 awS5S3200000_32, Object obj) {
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        String str = awS5S3200000_32.s0;
        PanelVoucherInfo panelVoucherInfo = (PanelVoucherInfo) awS5S3200000_32.l3;
        String str2 = awS5S3200000_32.s1;
        String str3 = awS5S3200000_32.s2;
        Map map = (Map) awS5S3200000_32.l4;
        c21271918Mj.getClass();
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(panelVoucherInfo.daInfo);
        C1739800vNK.LIZ.getClass();
        C1018703yb.LIZLLL("tiktokec_coupon_show", new C18LT(str2, str3, C1739800vNK.LIZ(panelVoucherInfo), panelVoucherInfo, mapLJIIJ, str, map));
        if (Intrinsics.LJFF(((C21268418La) obj).getVoucherState(), "use")) {
            C21271918Mj.LJIJ("tiktokec_button_show", (PanelVoucherInfo) awS5S3200000_32.l3, awS5S3200000_32.s1, awS5S3200000_32.s2, (Map) awS5S3200000_32.l4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S3200000_32 awS5S3200000_32, Object obj) {
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        String str = awS5S3200000_32.s0;
        PanelVoucherInfo panelVoucherInfo = (PanelVoucherInfo) awS5S3200000_32.l3;
        String str2 = awS5S3200000_32.s1;
        String str3 = awS5S3200000_32.s2;
        Map map = (Map) awS5S3200000_32.l4;
        c21271918Mj.getClass();
        C21271918Mj.LJIILLIIL(str, panelVoucherInfo, str2, str3, "video_multi_anchor_top", null, (String) obj, map);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS5S3200000_32 awS5S3200000_32, Object obj) {
        TermsApply termsApply;
        String str;
        PanelVoucherInfo panelVoucherInfo = (PanelVoucherInfo) obj;
        if (panelVoucherInfo != null && (termsApply = panelVoucherInfo.termsApply) != null && (str = termsApply.halfTermsApplyLink) != null) {
            Context context = (Context) awS5S3200000_32.l4;
            String str2 = awS5S3200000_32.s1;
            String str3 = awS5S3200000_32.s0;
            C1739800vNK.LIZ.getClass();
            C1739800vNK.LIZIZ(context, str, str2, str3);
        }
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        String str4 = awS5S3200000_32.s0;
        String str5 = awS5S3200000_32.s1;
        String str6 = awS5S3200000_32.s2;
        Map map = (Map) awS5S3200000_32.l3;
        c21271918Mj.getClass();
        C21271918Mj.LJIILL(str4, panelVoucherInfo, "T&C", str5, str6, map);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S3200000_32(Context context, String str, String str2, Map map, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l3 = map;
        this.l4 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS5S3200000_32(String str, String str2, PanelVoucherInfo panelVoucherInfo, String str3, String str4, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.s0 = str;
        this.l3 = str2;
        this.s1 = panelVoucherInfo;
        this.s2 = str3;
        this.l4 = str4;
    }
}
