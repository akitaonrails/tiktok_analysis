package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C1749350vcj;
import X.C1749440vcs;
import X.InterfaceC1749380vcm;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public class AjS6S0201000_26 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC420730Ged
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

    public static final void LIZ$0(AjS6S0201000_26 ajS6S0201000_26, View view) {
        if (view != null) {
            ((InterfaceC1749380vcm) ajS6S0201000_26.l0).LIZIZ(ajS6S0201000_26.i2, ((C1749350vcj) ajS6S0201000_26.l1).LLIZ);
        }
    }

    public static final void LIZ$1(AjS6S0201000_26 ajS6S0201000_26, View view) {
        AwS640S0100000_26 awS640S0100000_26;
        if (view != null && (awS640S0100000_26 = ((C1749440vcs) ajS6S0201000_26.l0).LLILLL) != null) {
            awS640S0100000_26.invoke(Integer.valueOf(ajS6S0201000_26.i2), (CpfElem) ajS6S0201000_26.l1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS6S0201000_26(Object obj, Object obj2, int i, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
