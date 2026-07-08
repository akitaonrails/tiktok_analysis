package kotlin.jvm.internal;

import X.C062P;
import X.C09AY;
import X.C1397620mTQ;
import X.C1574790r5B;
import X.C1853010yJv;
import X.C259800zU;
import X.EnumC912680ZrG;
import com.ss.android.ugc.aweme.tako.multipletemplate.TakoTemplateActivity;
import com.ss.android.ugc.aweme.vibefeed.feed.topbar.assem.VibeFeedMenuAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS10S2300000_24 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS10S2300000_24 awS10S2300000_24, Object obj) {
        C062P c062p = (C062P) obj;
        String str = (String) ((TakoTemplateActivity) awS10S2300000_24.l2).LLJILJILJ.getValue();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = (String) ((TakoTemplateActivity) awS10S2300000_24.l2).LLJJ.getValue();
        if (str3 == null) {
            str3 = "";
        }
        String str4 = (String) ((TakoTemplateActivity) awS10S2300000_24.l2).LLJILJIL.getValue();
        if (str4 == null) {
            str4 = "";
        }
        String str5 = (String) ((C259800zU) awS10S2300000_24.l3).element;
        String str6 = awS10S2300000_24.s0;
        String str7 = (String) ((C259800zU) awS10S2300000_24.l4).element;
        String str8 = (String) ((TakoTemplateActivity) awS10S2300000_24.l2).LLJILLL.getValue();
        if (str8 != null) {
            str2 = str8;
        }
        c062p.LIZ = new C1853010yJv(str, str3, str4, str5, str6, str7, str2, awS10S2300000_24.s1, ((TakoTemplateActivity) awS10S2300000_24.l2).LLLFZ(), "1", "1");
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS10S2300000_24 awS10S2300000_24, Object obj) {
        C062P c062p = (C062P) obj;
        String str = (String) ((TakoTemplateActivity) awS10S2300000_24.l2).LLJILJILJ.getValue();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = (String) ((TakoTemplateActivity) awS10S2300000_24.l2).LLJJ.getValue();
        if (str3 == null) {
            str3 = "";
        }
        String str4 = (String) ((TakoTemplateActivity) awS10S2300000_24.l2).LLJILJIL.getValue();
        if (str4 == null) {
            str4 = "";
        }
        String str5 = (String) ((C259800zU) awS10S2300000_24.l3).element;
        String str6 = awS10S2300000_24.s0;
        String str7 = (String) ((C259800zU) awS10S2300000_24.l4).element;
        String str8 = (String) ((TakoTemplateActivity) awS10S2300000_24.l2).LLJILLL.getValue();
        if (str8 != null) {
            str2 = str8;
        }
        c062p.LIZ = new C1853010yJv(str, str3, str4, str5, str6, str7, str2, awS10S2300000_24.s1, ((TakoTemplateActivity) awS10S2300000_24.l2).LLLFZ(), "1", "1");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS10S2300000_24 awS10S2300000_24, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((C1574790r5B) awS10S2300000_24.l2).LIZJ, new AwS27S2200000_24((VibeFeedMenuAssem) awS10S2300000_24.l3, awS10S2300000_24.s0, awS10S2300000_24.s1, (EnumC912680ZrG) awS10S2300000_24.l4, 1));
        c1397620mTQ.LIZJ(1, ((C1574790r5B) awS10S2300000_24.l2).LIZLLL, new AwS44S2100000_24(awS10S2300000_24.s0, awS10S2300000_24.s1, (EnumC912680ZrG) awS10S2300000_24.l4, 2));
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S2300000_24(C1574790r5B c1574790r5B, VibeFeedMenuAssem vibeFeedMenuAssem, String str, String str2, EnumC912680ZrG enumC912680ZrG, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1574790r5B;
        this.l3 = vibeFeedMenuAssem;
        this.s0 = str;
        this.s1 = str2;
        this.l4 = enumC912680ZrG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS10S2300000_24(TakoTemplateActivity takoTemplateActivity, TakoTemplateActivity takoTemplateActivity2, C259800zU<String> c259800zU, String str, C259800zU<String> c259800zU2, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = takoTemplateActivity;
        this.l3 = takoTemplateActivity2;
        this.s0 = c259800zU;
        this.l4 = str;
        this.s1 = c259800zU2;
    }
}
