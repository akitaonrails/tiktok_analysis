package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C18XX;
import X.C21516819Io;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.ss.android.ugc.profile.business.ur.camera.LiveCoverCameraFragment;

/* JADX INFO: loaded from: classes33.dex */
public class AbS711S0100000_32 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
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
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS711S0100000_32(LiveCoverCameraFragment liveCoverCameraFragment, int i) {
        super(200L);
        this.$t = i;
        this.l0 = liveCoverCameraFragment;
    }

    public static final void LIZ$0(AbS711S0100000_32 abS711S0100000_32, View view) {
        if (view != null) {
            C786410Ut5.LJLZ(8, ((C21516819Io) abS711S0100000_32.l0).LLLLLJIL());
            ((C21516819Io) abS711S0100000_32.l0).LLLLIL().LIZIZ.invoke();
            C786410Ut5.LJLZ(0, (ViewGroup) ((C21516819Io) abS711S0100000_32.l0).LLJLLIL.getValue());
            C786410Ut5.LJLLLLLL(0, (View) ((C21516819Io) abS711S0100000_32.l0).LLJLL.getValue());
            C786410Ut5.LL(0, ((C21516819Io) abS711S0100000_32.l0).LLLLLJLJLL());
        }
    }

    public static final void LIZ$1(AbS711S0100000_32 abS711S0100000_32, View view) {
        if (view != null) {
            ((C18XX) abS711S0100000_32.l0).LLJI.invoke();
        }
    }

    public static final void LIZ$2(AbS711S0100000_32 abS711S0100000_32, View view) {
        if (view != null) {
            ((C18XX) abS711S0100000_32.l0).LLJIJIL.invoke();
        }
    }

    public static final void LIZ$3(AbS711S0100000_32 abS711S0100000_32, View view) {
        View view2;
        if (view != null && (view2 = (View) ((LiveCoverCameraFragment) abS711S0100000_32.l0).LLJJJJJIL.getValue()) != null) {
            view2.startAnimation((Animation) ((LiveCoverCameraFragment) abS711S0100000_32.l0).LLJILLL.getValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS711S0100000_32(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }
}
