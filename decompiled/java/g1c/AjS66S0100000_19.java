package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C0HZQ;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel;
import com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AjS66S0100000_19 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;

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
    public AjS66S0100000_19(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AjS66S0100000_19 ajS66S0100000_19, View view) {
        C0HZQ c0hzq;
        if (view != null && (c0hzq = (C0HZQ) ajS66S0100000_19.l0) != null) {
            c0hzq.setChecked(!c0hzq.isChecked());
        }
    }

    public static final void LIZ$1(AjS66S0100000_19 ajS66S0100000_19, View view) {
        if (view != null) {
            ((ProfileAvatarAssem) ajS66S0100000_19.l0).Ep();
        }
    }

    public static final void LIZ$2(AjS66S0100000_19 ajS66S0100000_19, View view) {
        if (view != null) {
            ((Function0) ajS66S0100000_19.l0).invoke();
        }
    }

    public static final void LIZ$3(AjS66S0100000_19 ajS66S0100000_19, View view) {
        if (view != null) {
            AddressMapDetailViewModel.jR2(((AddressMapDetailFragment) ajS66S0100000_19.l0).ZR(), null, false, null, 7);
        }
    }
}
