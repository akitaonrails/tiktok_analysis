package kotlin.jvm.internal;

import X.C09AY;
import X.C0TU5;
import X.C1320700kTM;
import X.C1324750kZt;
import X.C1624410sND;
import X.C1636130sg7;
import X.C1637440siE;
import X.C1638170sjP;
import X.C1662850tND;
import X.C1685510txl;
import X.C1685530txn;
import X.C1687730u1L;
import X.C1910890zpH;
import X.EnumC1910860zpE;
import X.InterfaceC1325670kbN;
import X.InterfaceC1330440kj4;
import android.content.Context;
import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.UserMatchedAssem;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.trill.feedback.api.FaqSubCategoryItem;
import com.ss.android.ugc.trill.feedback.compose.CSPComposeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS88S1300000_25 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS88S1300000_25 awS88S1300000_25) {
        ((CSPComposeViewModel) awS88S1300000_25.l1).wQ2((FaqSubCategoryItem) awS88S1300000_25.l2, (Context) awS88S1300000_25.l3);
        C0TU5 c0tu5 = C0TU5.LIZ;
        String str = ((FaqSubCategoryItem) awS88S1300000_25.l2).faqId;
        if (str == null) {
            str = "null";
        }
        C0TU5.LIZLLL(c0tu5, str, null, "faq_item", "faq_topic_list", awS88S1300000_25.s0, "click", 2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS88S1300000_25 awS88S1300000_25) {
        C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZ("UserMatchedAssem", "say hi callback");
        C1685530txn c1685530txn = C1685530txn.LIZ;
        String str = (String) ((UserMatchedAssem) awS88S1300000_25.l1).LLJIJIL.getValue();
        String str2 = awS88S1300000_25.s0;
        String str3 = ((C1685510txl) awS88S1300000_25.l2).LIZIZ;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - ((C1687730u1L) awS88S1300000_25.l3).LJ);
        c1685530txn.getClass();
        C1685530txn.LIZJ(lValueOf, str, str2, "say_hi", str3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS88S1300000_25 awS88S1300000_25) {
        C1685530txn c1685530txn = C1685530txn.LIZ;
        String str = (String) ((UserMatchedAssem) awS88S1300000_25.l1).LLJIJIL.getValue();
        String str2 = awS88S1300000_25.s0;
        String str3 = ((C1685510txl) awS88S1300000_25.l2).LIZIZ;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - ((C1687730u1L) awS88S1300000_25.l3).LJ);
        c1685530txn.getClass();
        C1685530txn.LIZJ(lValueOf, str, str2, "follow", str3);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS88S1300000_25 awS88S1300000_25) {
        C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZ("UserMatchedAssem", "message callback");
        C1685530txn c1685530txn = C1685530txn.LIZ;
        String str = (String) ((UserMatchedAssem) awS88S1300000_25.l1).LLJIJIL.getValue();
        String str2 = awS88S1300000_25.s0;
        String str3 = ((C1685510txl) awS88S1300000_25.l2).LIZIZ;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - ((C1687730u1L) awS88S1300000_25.l3).LJ);
        c1685530txn.getClass();
        C1685530txn.LIZJ(lValueOf, str, str2, "message", str3);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS88S1300000_25 awS88S1300000_25) {
        ((C1624410sND) awS88S1300000_25.l1).LJIIL((EffectListResponse) awS88S1300000_25.l2, awS88S1300000_25.s0, (Effect) awS88S1300000_25.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS88S1300000_25 awS88S1300000_25) {
        C1637440siE.LIZIZ((C1662850tND) awS88S1300000_25.l1, awS88S1300000_25.s0, (InterfaceC1325670kbN) awS88S1300000_25.l2, (C1320700kTM) awS88S1300000_25.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS88S1300000_25 awS88S1300000_25) {
        C1324750kZt.LJIILJJIL(((C1638170sjP) awS88S1300000_25.l1).LL.getImageView(), (List) awS88S1300000_25.l2, -1, -1, null, null, new C1636130sg7((Effect) awS88S1300000_25.l3), awS88S1300000_25.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S1300000_25(C1624410sND c1624410sND, EffectListResponse effectListResponse, String str, Effect effect, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1624410sND;
        this.l2 = effectListResponse;
        this.s0 = str;
        this.l3 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS88S1300000_25(C1638170sjP c1638170sjP, C1638170sjP c1638170sjP2, List<String> list, Effect effect, String str) {
        super(0);
        this.$t = str;
        this.l1 = c1638170sjP;
        this.l2 = c1638170sjP2;
        this.l3 = list;
        this.s0 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS88S1300000_25(C1662850tND c1662850tND, C1662850tND c1662850tND2, String str, InterfaceC1325670kbN interfaceC1325670kbN, C1320700kTM<InterfaceC1330440kj4> c1320700kTM) {
        super(0);
        this.$t = c1320700kTM;
        this.l1 = c1662850tND;
        this.s0 = c1662850tND2;
        this.l2 = str;
        this.l3 = interfaceC1325670kbN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S1300000_25(Context context, FaqSubCategoryItem faqSubCategoryItem, CSPComposeViewModel cSPComposeViewModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = cSPComposeViewModel;
        this.l2 = faqSubCategoryItem;
        this.l3 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS88S1300000_25(UserMatchedAssem userMatchedAssem, C1687730u1L c1687730u1L, C1685510txl c1685510txl, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = userMatchedAssem;
        this.s0 = str;
        this.l2 = c1685510txl;
        this.l3 = c1687730u1L;
    }
}
