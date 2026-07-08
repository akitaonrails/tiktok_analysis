package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C1735020vFc;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.EcCommentAnchorPanelActivity;
import kotlin.jvm.internal.AwS147S1200000_32;

/* JADX INFO: loaded from: classes33.dex */
public class AjS4S1200000_32 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final void LIZ$0(AjS4S1200000_32 ajS4S1200000_32, View view) {
        if (view != null) {
            C1735020vFc.LIZ(C1735020vFc.LIZ, ((View) ajS4S1200000_32.l1).getContext(), new AwS147S1200000_32(view, (ECommerceAnchorPanelFragment) ajS4S1200000_32.l2, ajS4S1200000_32.s0, 3));
        }
    }

    public static final void LIZ$1(AjS4S1200000_32 ajS4S1200000_32, View view) {
        if (view != null) {
            C1735020vFc.LIZ(C1735020vFc.LIZ, ((View) ajS4S1200000_32.l1).getContext(), new AwS147S1200000_32(view, (EcCommentAnchorPanelActivity) ajS4S1200000_32.l2, ajS4S1200000_32.s0, 4));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS4S1200000_32(Object obj, Object obj2, String str, int i) {
        super(700L);
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
