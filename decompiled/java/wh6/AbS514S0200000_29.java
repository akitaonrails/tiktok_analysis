package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C1159300gH2;
import X.C1411150mpF;
import X.C19635911s5;
import X.C19752412Py;
import X.C19752512Pz;
import X.C19EG;
import android.view.View;
import com.ss.android.ugc.aweme.msg.qrcode.AbstractQrGroupCreationAssem;
import com.ss.android.ugc.aweme.msg.qrcode.QRGroupCreationMessageVM;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS395S0200000_29;

/* JADX INFO: loaded from: classes30.dex */
public class AbS514S0200000_29 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
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

    public static final void LIZ$0(AbS514S0200000_29 abS514S0200000_29, View view) {
        if (view != null) {
            QRGroupCreationMessageVM qRGroupCreationMessageVMOp = ((AbstractQrGroupCreationAssem) abS514S0200000_29.l0).op();
            C19EG c19eg = (C19EG) abS514S0200000_29.l1;
            qRGroupCreationMessageVMOp.getClass();
            QRGroupCreationMessageVM.AQ2(qRGroupCreationMessageVMOp, "click_group_chat_qr_code");
            if (qRGroupCreationMessageVMOp.yQ2() == null) {
                qRGroupCreationMessageVMOp.vQ2(c19eg, new C19752412Py(qRGroupCreationMessageVMOp));
                return;
            }
            int i = C1411150mpF.LIZ[((C1159300gH2) qRGroupCreationMessageVMOp.getState()).LL.LIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                qRGroupCreationMessageVMOp.vQ2(c19eg, new C19752512Pz(qRGroupCreationMessageVMOp));
                return;
            }
            qRGroupCreationMessageVMOp.wQ2(qRGroupCreationMessageVMOp.yQ2(), c19eg);
        }
    }

    public static final void LIZ$1(AbS514S0200000_29 abS514S0200000_29, View view) {
        ((Function1) abS514S0200000_29.l0).invoke(Boolean.valueOf(((C19635911s5) abS514S0200000_29.l1).LJIIIIZZ));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS514S0200000_29(AbstractQrGroupCreationAssem abstractQrGroupCreationAssem, C19EG c19eg, int i) {
        super(300L);
        this.$t = i;
        this.l0 = abstractQrGroupCreationAssem;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS514S0200000_29(AwS395S0200000_29 awS395S0200000_29, C19635911s5 c19635911s5, int i) {
        super(500L);
        this.$t = i;
        this.l0 = awS395S0200000_29;
        this.l1 = c19635911s5;
    }
}
