package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C1DZW;
import X.C1DZX;
import X.C2262551Dh7;
import X.InterfaceC2262561Dh8;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.sea.view.SeaOspBottomWidget;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: loaded from: classes36.dex */
public class AkS100S0100000_35 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public AkS100S0100000_35(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AkS100S0100000_35 akS100S0100000_35, View view) {
        C1DZX.LJ((C1DZW) akS100S0100000_35.l0);
    }

    public static final void LIZ$1(AkS100S0100000_35 akS100S0100000_35, View view) {
        ((SeaOspBottomWidget) akS100S0100000_35.l0).ip().setState(AFwS228S0000000_1.get$arr$(461));
    }

    public static final void LIZ$2(AkS100S0100000_35 akS100S0100000_35, View view) {
        ((SeaOspBottomWidget) akS100S0100000_35.l0).ip().setState(AFwS228S0000000_1.get$arr$(461));
    }

    public static final void LIZ$3(AkS100S0100000_35 akS100S0100000_35, View view) {
        InterfaceC2262561Dh8 actionsListener = ((C2262551Dh7) akS100S0100000_35.l0).getActionsListener();
        if (actionsListener != null) {
            actionsListener.LIZ();
        }
    }

    public static final void LIZ$4(AkS100S0100000_35 akS100S0100000_35, View view) {
        InterfaceC2262561Dh8 actionsListener = ((C2262551Dh7) akS100S0100000_35.l0).getActionsListener();
        if (actionsListener != null) {
            actionsListener.LIZIZ();
        }
    }

    public static final void LIZ$5(AkS100S0100000_35 akS100S0100000_35, View view) {
        InterfaceC2262561Dh8 actionsListener = ((C2262551Dh7) akS100S0100000_35.l0).getActionsListener();
        if (actionsListener != null) {
            actionsListener.LIZLLL();
        }
    }

    public static final void LIZ$6(AkS100S0100000_35 akS100S0100000_35, View view) {
        InterfaceC2262561Dh8 actionsListener = ((C2262551Dh7) akS100S0100000_35.l0).getActionsListener();
        if (actionsListener != null) {
            actionsListener.LJI();
        }
    }
}
