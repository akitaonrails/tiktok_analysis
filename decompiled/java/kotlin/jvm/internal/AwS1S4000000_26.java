package kotlin.jvm.internal;

import X.C09AY;
import X.C957403oi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS1S4000000_26 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public String s1;
    public String s2 = "voucher_lucky_draw";
    public String s3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S4000000_26 awS1S4000000_26, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str = awS1S4000000_26.s0;
        if (str == null) {
            str = "";
        }
        c957403oi.LIZLLL("enter_from", str);
        c957403oi.LIZLLL("source_page_type", "video");
        String str2 = awS1S4000000_26.s1;
        if (str2 == null) {
            str2 = "video_multi_anchor";
        }
        c957403oi.LIZLLL("entrance_form", str2);
        c957403oi.LIZLLL("page_name", "video");
        c957403oi.LIZLLL("previous_page", "video");
        c957403oi.LIZLLL("module_name", awS1S4000000_26.s2);
        c957403oi.LIZLLL("module_type", awS1S4000000_26.s3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S4000000_26 awS1S4000000_26, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str = awS1S4000000_26.s0;
        if (str == null) {
            str = "";
        }
        c957403oi.LIZLLL("enter_from", str);
        c957403oi.LIZLLL("source_page_type", "video");
        String str2 = awS1S4000000_26.s1;
        if (str2 == null) {
            str2 = "video_multi_anchor";
        }
        c957403oi.LIZLLL("entrance_form", str2);
        c957403oi.LIZLLL("page_name", "video");
        c957403oi.LIZLLL("previous_page", "video");
        c957403oi.LIZLLL("module_name", awS1S4000000_26.s2);
        c957403oi.LIZLLL("module_type", awS1S4000000_26.s3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S4000000_26(String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s3 = str3;
    }
}
