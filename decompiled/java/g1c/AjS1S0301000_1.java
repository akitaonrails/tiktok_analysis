package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C04DL;
import X.C04DO;
import X.C04DP;
import X.C04DT;
import X.C719102rN;
import X.C719202rO;
import X.C752702wn;
import X.C7928037u;
import X.C815203Gk;
import X.EnumC805503Cr;
import X.InterfaceC1685420txc;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;

/* JADX INFO: loaded from: classes2.dex */
public class AjS1S0301000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void LIZ$0(AjS1S0301000_1 ajS1S0301000_1, View view) {
        if (view != null) {
            ((InterfaceC1685420txc) ajS1S0301000_1.l0).invoke(Boolean.FALSE, (C752702wn) ajS1S0301000_1.l1, (C719102rN) ajS1S0301000_1.l2, EnumC805503Cr.OTHER, Integer.valueOf(ajS1S0301000_1.i3));
        }
    }

    public static final void LIZ$1(AjS1S0301000_1 ajS1S0301000_1, View view) {
        if (view != null) {
            ((InterfaceC1685420txc) ajS1S0301000_1.l0).invoke(Boolean.FALSE, (C752702wn) ajS1S0301000_1.l1, (C719102rN) ajS1S0301000_1.l2, EnumC805503Cr.OTHER, Integer.valueOf(ajS1S0301000_1.i3));
        }
    }

    public static final void LIZ$2(AjS1S0301000_1 ajS1S0301000_1, View view) {
        if (view != null) {
            ((InterfaceC1685420txc) ajS1S0301000_1.l0).invoke(Boolean.FALSE, (C752702wn) ajS1S0301000_1.l1, (C719102rN) ajS1S0301000_1.l2, EnumC805503Cr.OTHER, Integer.valueOf(ajS1S0301000_1.i3));
        }
    }

    public static final void LIZ$3(AjS1S0301000_1 ajS1S0301000_1, View view) {
        if (view != null) {
            ((InterfaceC1685420txc) ajS1S0301000_1.l0).invoke(Boolean.FALSE, (C752702wn) ajS1S0301000_1.l1, (C719102rN) ajS1S0301000_1.l2, EnumC805503Cr.OTHER, Integer.valueOf(ajS1S0301000_1.i3));
        }
    }

    public static final void LIZ$4(AjS1S0301000_1 ajS1S0301000_1, View view) {
        if (view != null) {
            ((InterfaceC1685420txc) ajS1S0301000_1.l0).invoke(Boolean.FALSE, (C752702wn) ajS1S0301000_1.l1, (C719102rN) ajS1S0301000_1.l2, EnumC805503Cr.OTHER, Integer.valueOf(ajS1S0301000_1.i3));
        }
    }

    public static final void LIZ$5(AjS1S0301000_1 ajS1S0301000_1, View view) {
        C04DP c04dp;
        C04DT c04dt;
        boolean z;
        if (view != null && (c04dt = (c04dp = (C04DP) ajS1S0301000_1.l0).LLILLJJLI) != null) {
            View view2 = ((C04DO) ajS1S0301000_1.l1).itemView;
            int i = ajS1S0301000_1.i3;
            C04DL c04dl = (C04DL) ajS1S0301000_1.l2;
            if (i == c04dp.LLILLL) {
                z = true;
            } else {
                z = false;
            }
            c04dt.LIZ(view2, i, c04dl, z);
        }
    }

    public static final void LIZ$6(AjS1S0301000_1 ajS1S0301000_1, View view) {
        if (view != null) {
            C7928037u c7928037u = C7928037u.LIZ;
            TuxIconView tuxIconView = (TuxIconView) ajS1S0301000_1.l0;
            C719202rO c719202rO = (C719202rO) ajS1S0301000_1.l1;
            int i = ajS1S0301000_1.i3;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = ((C815203Gk) ajS1S0301000_1.l2).LLILLJJLI;
            c7928037u.getClass();
            C7928037u.LIZIZ(tuxIconView, c719202rO, i, orderSubmitAssemViewModel, "item_details");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS1S0301000_1(Object obj, Object obj2, int i, Object obj3, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i3 = i;
        this.l2 = obj3;
    }
}
