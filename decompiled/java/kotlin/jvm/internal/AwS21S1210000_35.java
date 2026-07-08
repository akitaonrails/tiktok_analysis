package kotlin.jvm.internal;

import X.AbstractC888820Yts;
import X.C09AY;
import X.C0Z4E;
import X.C1720106oR;
import X.C1741890vQh;
import X.C1ELK;
import X.C1ELL;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2249401D2k;
import X.C2249411D2l;
import X.C2249421D2m;
import X.C2344009Gk;
import X.C824390WVp;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicBarStyleConfig;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicColorConfig;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallBgColorDTO;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS21S1210000_35 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    public static final Object invoke$0(AwS21S1210000_35 awS21S1210000_35) {
        int size;
        String strLJIIIIZZ;
        String strLJIIIIZZ2;
        ECMixMallBgColorDTO eCMixMallBgColorDTO;
        ECMixMallBgColorDTO eCMixMallBgColorDTO2;
        ECMixMallBgColorDTO eCMixMallBgColorDTO3;
        StringBuilder sb = new StringBuilder("renderDynamicStyle invoked, source=");
        sb.append(awS21S1210000_35.s0);
        sb.append(", anim=");
        sb.append(awS21S1210000_35.z3);
        sb.append(", defaultColorSize=");
        sb.append(((C2249421D2m) awS21S1210000_35.l1).LJIJI().LIZJ.size());
        sb.append(", dynamicColorSize=");
        List<DynamicColorConfig> list = ((C2249421D2m) awS21S1210000_35.l1).LJIJI().LJ;
        int size2 = -1;
        if (list != null) {
            size = list.size();
        } else {
            size = -1;
        }
        sb.append(size);
        sb.append(", effectiveColorSize=");
        C2249401D2k c2249401D2kLJIJI = ((C2249421D2m) awS21S1210000_35.l1).LJIJI();
        List<DynamicColorConfig> list2 = c2249401D2kLJIJI.LJ;
        if (list2 == null) {
            list2 = c2249401D2kLJIJI.LIZJ;
        }
        sb.append(list2.size());
        sb.append(", defaultBarSize=");
        sb.append(((C2249421D2m) awS21S1210000_35.l1).LJIJI().LIZLLL.size());
        sb.append(", dynamicBarSize=");
        List<DynamicBarStyleConfig> list3 = ((C2249421D2m) awS21S1210000_35.l1).LJIJI().LJFF;
        if (list3 != null) {
            size2 = list3.size();
        }
        sb.append(size2);
        sb.append(", effectiveBarSize=");
        C2249401D2k c2249401D2kLJIJI2 = ((C2249421D2m) awS21S1210000_35.l1).LJIJI();
        List<DynamicBarStyleConfig> list4 = c2249401D2kLJIJI2.LJFF;
        if (list4 == null) {
            list4 = c2249401D2kLJIJI2.LIZLLL;
        }
        sb.append(list4.size());
        sb.append(", isSticky=");
        sb.append(((C2249411D2l) awS21S1210000_35.l2).LIZ);
        sb.append(", pageColor=");
        DynamicColorConfig dynamicColorConfig = ((C2249411D2l) awS21S1210000_35.l2).LIZIZ.LIZ;
        String strLJIIIIZZ3 = null;
        if (dynamicColorConfig != null && (eCMixMallBgColorDTO3 = dynamicColorConfig.color) != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(eCMixMallBgColorDTO3);
        } else {
            strLJIIIIZZ = null;
        }
        sb.append(strLJIIIIZZ);
        sb.append(", headerColor=");
        DynamicColorConfig dynamicColorConfig2 = ((C2249411D2l) awS21S1210000_35.l2).LIZIZ.LIZIZ;
        if (dynamicColorConfig2 != null && (eCMixMallBgColorDTO2 = dynamicColorConfig2.color) != null) {
            strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(eCMixMallBgColorDTO2);
        } else {
            strLJIIIIZZ2 = null;
        }
        sb.append(strLJIIIIZZ2);
        sb.append(", bodyColor=");
        DynamicColorConfig dynamicColorConfig3 = ((C2249411D2l) awS21S1210000_35.l2).LIZIZ.LIZJ;
        if (dynamicColorConfig3 != null && (eCMixMallBgColorDTO = dynamicColorConfig3.color) != null) {
            strLJIIIIZZ3 = C1741890vQh.LJIIIIZZ(eCMixMallBgColorDTO);
        }
        sb.append(strLJIIIIZZ3);
        sb.append(", searchBarDynamicStyle=");
        sb.append(((C2249411D2l) awS21S1210000_35.l2).LJFF);
        sb.append(", searchBarDynamicColor=");
        sb.append(((C2249411D2l) awS21S1210000_35.l2).LJI);
        return sb.toString();
    }

    public static final Object invoke$1(AwS21S1210000_35 awS21S1210000_35) {
        C0Z4E c0z4e = C0Z4E.LIZ;
        Context context = (Context) awS21S1210000_35.l1;
        c0z4e.getClass();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("MessageRequestPromptHelper", "openSystemSetting");
        C824390WVp.LJ(context);
        C1ELK.LIZJ(awS21S1210000_35.s0, "confirm", awS21S1210000_35.z3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS21S1210000_35 awS21S1210000_35) {
        C0Z4E c0z4e = C0Z4E.LIZ;
        Context context = (Context) awS21S1210000_35.l1;
        c0z4e.getClass();
        if (C824390WVp.LIZJ(context)) {
            if (C0Z4E.LIZIZ()) {
                Context context2 = (Context) awS21S1210000_35.l1;
                c0z4e.getClass();
                C0Z4E.LJIIIIZZ(context2, 0, false);
            }
            C0Z4E.LJII(0, (Context) awS21S1210000_35.l1);
        }
        C1ELK c1elk = (C1ELK) awS21S1210000_35.l2;
        Context context3 = (Context) awS21S1210000_35.l1;
        String str = awS21S1210000_35.s0;
        boolean z = awS21S1210000_35.z3;
        c1elk.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        AbstractC888820Yts.LIZ(c2344009Gk, str);
        c2344009Gk.LJIIIIZZ("copy_type", "notification");
        c2344009Gk.LIZJ(0, "system_status");
        c2344009Gk.LIZJ(z ? 1 : 0, "outer_status");
        c2344009Gk.LIZJ(1, "inner_status");
        c2344009Gk.LIZJ(C824390WVp.LIZJ(context3) ? 1 : 0, "is_turn_on_system");
        C20684815ws.LJIILLIIL("ttsocial_message_request_push_guide_system_back", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS21S1210000_35 awS21S1210000_35) {
        C0Z4E c0z4e = C0Z4E.LIZ;
        Context context = (Context) awS21S1210000_35.l1;
        c0z4e.getClass();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("MessageRequestPromptHelper", "openSystemSetting");
        C824390WVp.LJ(context);
        C1ELL.LIZJ(awS21S1210000_35.s0, "confirm", awS21S1210000_35.z3);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS21S1210000_35 awS21S1210000_35) {
        C0Z4E c0z4e = C0Z4E.LIZ;
        Context context = (Context) awS21S1210000_35.l1;
        c0z4e.getClass();
        if (C824390WVp.LIZJ(context)) {
            Context context2 = (Context) awS21S1210000_35.l1;
            c0z4e.getClass();
            C0Z4E.LJIIIIZZ(context2, 0, true);
        }
        C1ELL c1ell = (C1ELL) awS21S1210000_35.l2;
        Context context3 = (Context) awS21S1210000_35.l1;
        String str = awS21S1210000_35.s0;
        boolean z = awS21S1210000_35.z3;
        c1ell.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        AbstractC888820Yts.LIZ(c2344009Gk, str);
        c2344009Gk.LJIIIIZZ("copy_type", "push");
        c2344009Gk.LIZJ(0, "system_status");
        c2344009Gk.LIZJ(z ? 1 : 0, "outer_status");
        c2344009Gk.LIZJ(1, "inner_status");
        c2344009Gk.LIZJ(C824390WVp.LIZJ(context3) ? 1 : 0, "is_turn_on_system");
        C20684815ws.LJIILLIIL("ttsocial_message_request_push_guide_system_back", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S1210000_35(Context context, C1ELK c1elk, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.l2 = c1elk;
        this.s0 = str;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S1210000_35(Context context, C1ELL c1ell, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.l2 = c1ell;
        this.s0 = str;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S1210000_35(String str, boolean z, C2249421D2m c2249421D2m, C2249411D2l c2249411D2l, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.z3 = z;
        this.l1 = c2249421D2m;
        this.l2 = c2249411D2l;
    }
}
