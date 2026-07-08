package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C1709070uZl;
import X.C1709570uaZ;
import X.C1710110ubR;
import X.C1722010uud;
import X.C2097608Jq;
import X.C724240Sb0;
import X.EnumC1709200uZy;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierAssem;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS62S1300000_26;

/* JADX INFO: loaded from: classes27.dex */
public class AbS167S1200000_26 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final void LIZ$0(AbS167S1200000_26 abS167S1200000_26, View view) {
        if (view != null) {
            ((TuxTextView) abS167S1200000_26.l1).setSelected(!r1.isSelected());
            ((C1722010uud) abS167S1200000_26.l2).LLILZ.invoke(abS167S1200000_26.s0, Boolean.valueOf(((TuxTextView) abS167S1200000_26.l1).isSelected()));
        }
    }

    public static final void LIZ$1(AbS167S1200000_26 abS167S1200000_26, View view) {
        Boolean boolValueOf;
        CashierKey cashierKey;
        EnumC1709200uZy enumC1709200uZy;
        C1709570uaZ c1709570uaZ;
        C1709070uZl c1709070uZl;
        PipoCashierBaseFragment pipoCashierBaseFragment;
        if (view != null) {
            Fragment fragmentLJI = C724240Sb0.LJI((CashierAssem) abS167S1200000_26.l1);
            Integer numValueOf = null;
            if ((fragmentLJI instanceof PipoCashierBaseFragment) && (pipoCashierBaseFragment = (PipoCashierBaseFragment) fragmentLJI) != null) {
                boolValueOf = Boolean.valueOf(pipoCashierBaseFragment.bS());
            } else {
                boolValueOf = null;
            }
            C1710110ubR c1710110ubR = C1710110ubR.LIZ;
            CashierEnterParams cashierEnterParams = (CashierEnterParams) abS167S1200000_26.l2;
            if (cashierEnterParams != null) {
                cashierKey = cashierEnterParams.LIZ;
            } else {
                cashierKey = null;
            }
            Pair[] pairArr = new Pair[4];
            if (cashierEnterParams != null && (c1709070uZl = cashierEnterParams.LIZIZ) != null) {
                enumC1709200uZy = c1709070uZl.LIZIZ;
            } else {
                enumC1709200uZy = null;
            }
            pairArr[0] = new Pair("buttonType", enumC1709200uZy);
            pairArr[1] = new Pair("pageName", abS167S1200000_26.s0);
            pairArr[2] = new Pair("isFullScreen", boolValueOf);
            CashierEnterParams cashierEnterParams2 = (CashierEnterParams) abS167S1200000_26.l2;
            if (cashierEnterParams2 != null && (c1709570uaZ = cashierEnterParams2.paymentData) != null) {
                numValueOf = Integer.valueOf(((ArrayList) c1709570uaZ.LJJIJIIJIL()).size());
            }
            pairArr[3] = new Pair("selectedCount", numValueOf);
            c1710110ubR.LIZIZ("bottom_button", cashierKey, C2097608Jq.LJIIIIZZ(pairArr));
            CashierAssem cashierAssem = (CashierAssem) abS167S1200000_26.l1;
            cashierAssem.withState(cashierAssem.Jo(), new AwS62S1300000_26((CashierAssem) abS167S1200000_26.l1, (CashierEnterParams) abS167S1200000_26.l2, abS167S1200000_26.s0, boolValueOf, 5));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS167S1200000_26(TuxTextView tuxTextView, String str, C1722010uud c1722010uud, int i) {
        super(300L);
        this.$t = i;
        this.l1 = tuxTextView;
        this.s0 = str;
        this.l2 = c1722010uud;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS167S1200000_26(CashierAssem cashierAssem, CashierEnterParams cashierEnterParams, String str, int i) {
        super(700L);
        this.$t = i;
        this.l1 = cashierAssem;
        this.l2 = cashierEnterParams;
        this.s0 = str;
    }
}
