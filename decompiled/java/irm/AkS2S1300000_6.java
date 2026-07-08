package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0H6M;
import X.C0H7H;
import X.C0HGK;
import X.C0HOC;
import X.C0HPQ;
import X.C0HPT;
import X.C434640H2o;
import X.C435840H7e;
import X.C438260HGm;
import X.C439970HNb;
import X.C439990HNd;
import X.InterfaceC440050HNj;
import X.InterfaceC440090HNn;
import android.view.View;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.elements.HomePageElementRowPowerCell;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class AkS2S1300000_6 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS2S1300000_6 akS2S1300000_6, View view) {
        Function0 function0 = (Function0) akS2S1300000_6.l1;
        if (function0 != null && !((Boolean) function0.invoke()).booleanValue()) {
            return;
        }
        C435840H7e.LIZ(((C434640H2o) akS2S1300000_6.l2).LIZIZ, false, akS2S1300000_6.s0, null, null, 24);
        C438260HGm c438260HGm = C438260HGm.LIZ;
        View view2 = (View) akS2S1300000_6.l3;
        C434640H2o c434640H2o = (C434640H2o) akS2S1300000_6.l2;
        c438260HGm.getClass();
        C438260HGm.LIZ(view2, c434640H2o, false, null);
    }

    public static final void LIZ$1(AkS2S1300000_6 akS2S1300000_6, View view) {
        InterfaceC440050HNj c439970HNb;
        C0HPQ c0hpqL5;
        C0HGK c0hgk;
        String str;
        C0HOC c0hoc = (C0HOC) akS2S1300000_6.l1;
        InterfaceC440090HNn interfaceC440090HNn = null;
        if (c0hoc != null) {
            interfaceC440090HNn = c0hoc.LIZ;
        }
        if ((interfaceC440090HNn instanceof C0HGK) && (c0hgk = (C0HGK) interfaceC440090HNn) != null && (str = c0hgk.LIZ) != null) {
            c439970HNb = new C439990HNd(((C0HPT) akS2S1300000_6.l2).LL, c0hoc.LIZIZ, str);
        } else {
            c439970HNb = new C439970HNb(((C0HPT) akS2S1300000_6.l2).LL, C0H7H.TEXT_PLACEHOLDER, akS2S1300000_6.s0);
        }
        C0H6M c0h6mLIZIZ = ((C0HPT) akS2S1300000_6.l2).LLILZ.LIZIZ(c439970HNb, -2);
        if (c0h6mLIZIZ != null && (c0hpqL5 = ((HomePageElementRowPowerCell) akS2S1300000_6.l3).L5()) != null) {
            c0hpqL5.vl(c0h6mLIZIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS2S1300000_6(Function0 function0, C434640H2o c434640H2o, String str, View view, int i) {
        super(1000L);
        this.$t = i;
        this.l1 = function0;
        this.l2 = c434640H2o;
        this.s0 = str;
        this.l3 = view;
    }

    public AkS2S1300000_6(C0HOC c0hoc, C0HPT c0hpt, String str, HomePageElementRowPowerCell homePageElementRowPowerCell, int i) {
        this.$t = i;
        this.l1 = c0hoc;
        this.l2 = c0hpt;
        this.s0 = str;
        this.l3 = homePageElementRowPowerCell;
    }
}
