package kotlin.jvm.internal;

import X.AbstractC2276531E8t;
import X.C09AY;
import X.C0Z4E;
import X.C1741890vQh;
import X.C1ELM;
import X.C1ELN;
import X.C1ELO;
import X.C2188811AlT;
import X.C2249401D2k;
import X.C2249411D2l;
import X.C2249421D2m;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicBarStyleConfig;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicColorConfig;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallBgColorDTO;
import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS149S1200000_35 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS149S1200000_35 awS149S1200000_35) {
        int size;
        String strLJIIIIZZ;
        String strLJIIIIZZ2;
        ECMixMallBgColorDTO eCMixMallBgColorDTO;
        ECMixMallBgColorDTO eCMixMallBgColorDTO2;
        ECMixMallBgColorDTO eCMixMallBgColorDTO3;
        StringBuilder sb = new StringBuilder("recordDynamicStyleState, source=");
        sb.append(awS149S1200000_35.s0);
        sb.append(", defaultColorSize=");
        sb.append(((C2249421D2m) awS149S1200000_35.l1).LJIJI().LIZJ.size());
        sb.append(", dynamicColorSize=");
        List<DynamicColorConfig> list = ((C2249421D2m) awS149S1200000_35.l1).LJIJI().LJ;
        int size2 = -1;
        if (list != null) {
            size = list.size();
        } else {
            size = -1;
        }
        sb.append(size);
        sb.append(", effectiveColorSize=");
        C2249401D2k c2249401D2kLJIJI = ((C2249421D2m) awS149S1200000_35.l1).LJIJI();
        List<DynamicColorConfig> list2 = c2249401D2kLJIJI.LJ;
        if (list2 == null) {
            list2 = c2249401D2kLJIJI.LIZJ;
        }
        sb.append(list2.size());
        sb.append(", defaultBarSize=");
        sb.append(((C2249421D2m) awS149S1200000_35.l1).LJIJI().LIZLLL.size());
        sb.append(", dynamicBarSize=");
        List<DynamicBarStyleConfig> list3 = ((C2249421D2m) awS149S1200000_35.l1).LJIJI().LJFF;
        if (list3 != null) {
            size2 = list3.size();
        }
        sb.append(size2);
        sb.append(", effectiveBarSize=");
        C2249401D2k c2249401D2kLJIJI2 = ((C2249421D2m) awS149S1200000_35.l1).LJIJI();
        List<DynamicBarStyleConfig> list4 = c2249401D2kLJIJI2.LJFF;
        if (list4 == null) {
            list4 = c2249401D2kLJIJI2.LIZLLL;
        }
        sb.append(list4.size());
        sb.append(", isSticky=");
        sb.append(((C2249411D2l) awS149S1200000_35.l2).LIZ);
        sb.append(", pageColor=");
        DynamicColorConfig dynamicColorConfig = ((C2249411D2l) awS149S1200000_35.l2).LIZIZ.LIZ;
        String strLJIIIIZZ3 = null;
        if (dynamicColorConfig != null && (eCMixMallBgColorDTO3 = dynamicColorConfig.color) != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(eCMixMallBgColorDTO3);
        } else {
            strLJIIIIZZ = null;
        }
        sb.append(strLJIIIIZZ);
        sb.append(", headerColor=");
        DynamicColorConfig dynamicColorConfig2 = ((C2249411D2l) awS149S1200000_35.l2).LIZIZ.LIZIZ;
        if (dynamicColorConfig2 != null && (eCMixMallBgColorDTO2 = dynamicColorConfig2.color) != null) {
            strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(eCMixMallBgColorDTO2);
        } else {
            strLJIIIIZZ2 = null;
        }
        sb.append(strLJIIIIZZ2);
        sb.append(", bodyColor=");
        DynamicColorConfig dynamicColorConfig3 = ((C2249411D2l) awS149S1200000_35.l2).LIZIZ.LIZJ;
        if (dynamicColorConfig3 != null && (eCMixMallBgColorDTO = dynamicColorConfig3.color) != null) {
            strLJIIIIZZ3 = C1741890vQh.LJIIIIZZ(eCMixMallBgColorDTO);
        }
        sb.append(strLJIIIIZZ3);
        sb.append(", searchBarDynamicStyle=");
        sb.append(((C2249411D2l) awS149S1200000_35.l2).LJFF);
        sb.append(", searchBarDynamicColor=");
        sb.append(((C2249411D2l) awS149S1200000_35.l2).LJI);
        return sb.toString();
    }

    public static final Object invoke$1(AwS149S1200000_35 awS149S1200000_35) {
        C0Z4E c0z4e = C0Z4E.LIZ;
        Context context = (Context) awS149S1200000_35.l1;
        c0z4e.getClass();
        C0Z4E.LJII(0, context);
        C1ELM.LIZJ(awS149S1200000_35.s0, "confirm");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS149S1200000_35 awS149S1200000_35) {
        C0Z4E c0z4e = C0Z4E.LIZ;
        Context context = (Context) awS149S1200000_35.l1;
        c0z4e.getClass();
        C0Z4E.LJIIIIZZ(context, 0, false);
        C0Z4E.LJII(0, (Context) awS149S1200000_35.l1);
        C1ELN.LIZJ(awS149S1200000_35.s0, "confirm");
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS149S1200000_35 awS149S1200000_35) {
        C0Z4E c0z4e = C0Z4E.LIZ;
        Context context = (Context) awS149S1200000_35.l1;
        c0z4e.getClass();
        C0Z4E.LJIIIIZZ(context, 0, true);
        C1ELO.LIZJ(awS149S1200000_35.s0, "confirm");
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0WPq] */
    public static final Object invoke$4(AwS149S1200000_35 awS149S1200000_35) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkHitStrategyRealtime ---> ");
        sbLIZ.append(awS149S1200000_35.s0);
        sbLIZ.append(", ruleId: ");
        sbLIZ.append(((AbstractC2276531E8t) awS149S1200000_35.l1).LIZIZ().getRuleId());
        sbLIZ.append(" <=== finish, res: ");
        sbLIZ.append((RuleHitState) awS149S1200000_35.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S1200000_35(Context context, C1ELM c1elm, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.l2 = c1elm;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S1200000_35(Context context, C1ELN c1eln, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.l2 = c1eln;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S1200000_35(Context context, C1ELO c1elo, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.l2 = c1elo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S1200000_35(String str, C2249421D2m c2249421D2m, C2249411D2l c2249411D2l, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c2249421D2m;
        this.l2 = c2249411D2l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS149S1200000_35(String str, String str2, AbstractC2276531E8t<RULE> abstractC2276531E8t, RuleHitState ruleHitState) {
        super(0);
        this.$t = ruleHitState;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = abstractC2276531E8t;
    }
}
