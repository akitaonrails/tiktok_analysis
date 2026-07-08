package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C343970De7;
import X.C946803n0;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;

/* JADX INFO: loaded from: classes5.dex */
public class AjS11S0000000_4 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;

    @Override // X.AbstractViewOnClickListenerC420730Ged
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
    public AjS11S0000000_4(int i) {
        super(700L);
        this.$t = i;
    }

    public static final void LIZ$0(AjS11S0000000_4 ajS11S0000000_4, View view) {
        Fragment fragmentLIZ;
        if (view != null && (fragmentLIZ = C946803n0.LIZ(view)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZ);
            c1389890mGx.LJIIIZ(2131847258);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void LIZ$1(AjS11S0000000_4 ajS11S0000000_4, View view) {
        Fragment fragmentLIZ;
        if (view != null && (fragmentLIZ = C946803n0.LIZ(view)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZ);
            c1389890mGx.LJIIIZ(2131836732);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void LIZ$2(AjS11S0000000_4 ajS11S0000000_4, View view) {
        Fragment fragmentLIZ;
        if (view != null && (fragmentLIZ = C946803n0.LIZ(view)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZ);
            c1389890mGx.LJIIIZ(2131836732);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void LIZ$3(AjS11S0000000_4 ajS11S0000000_4, View view) {
        if (view != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJ(view, C343970De7.LIZ);
        }
    }
}
