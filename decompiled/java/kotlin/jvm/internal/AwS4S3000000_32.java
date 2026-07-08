package kotlin.jvm.internal;

import X.C09AY;
import X.C18LI;
import X.C957403oi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS4S3000000_32 extends C09AY implements Function1 {
    public final int $t;
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S3000000_32(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = "video_add_link";
        this.s1 = str;
        this.s2 = "video_edit_page";
    }

    public static final Object invoke$0(AwS4S3000000_32 awS4S3000000_32, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str = awS4S3000000_32.s0;
        if (str == null) {
            str = "";
        }
        c957403oi.LIZLLL("enter_from", str);
        c957403oi.LIZLLL("page_name", "video");
        c957403oi.LIZLLL("previous_page", "video");
        c957403oi.LIZLLL("check_result", awS4S3000000_32.s1);
        C18LI c18li = C18LI.LIZ;
        String str2 = awS4S3000000_32.s2;
        c18li.getClass();
        c957403oi.LJ(C18LI.LIZLLL(str2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S3000000_32 awS4S3000000_32, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi.LIZJ("page_name", awS4S3000000_32.s0);
        c957403oi.LIZJ("toast_name", awS4S3000000_32.s1);
        c957403oi.LIZJ("previous_page", awS4S3000000_32.s2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S3000000_32(String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
