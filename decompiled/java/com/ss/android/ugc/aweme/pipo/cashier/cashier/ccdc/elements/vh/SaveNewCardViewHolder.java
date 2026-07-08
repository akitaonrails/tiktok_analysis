package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H8;
import X.C03IJ;
import X.C03K6;
import X.C0HZQ;
import X.C1157180gDc;
import X.C13LE;
import X.C1709610uad;
import X.C1709640uag;
import X.C1710770ucV;
import X.C1712770ufj;
import X.C1722120uuo;
import X.C19719912Dl;
import X.C21569319b9;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C337180DJs;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1709240ua2;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS128S0200000_26;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.RawTextAndIcon;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.SaveCardInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.SecurityInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SaveNewCardViewHolder extends PowerCell<C1157180gDc> implements C03H8 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public TuxTextView LL;
    public C0HZQ LLILLJJLI;
    public TuxIconView LLILLL;
    public final AssemVMLazy LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SaveNewCardViewHolder.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/pipo/cashier/cashier/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SaveNewCardViewHolder() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 1073);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(407);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 1084), awS570S0100000_26, AFwS215S0000000_26.get$arr$(237), new AwS570S0100000_26((C03K6) this, 1059), new AwS570S0100000_26((C03K6) this, 1061), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1063), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 1065), null, new AwS570S0100000_26((C03K6) this, 1066));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 1060);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1062);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 1064);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 53));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 1067);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 1068);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 1069);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 1070);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 1071);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 1072), awS570S0100000_26, AFwS215S0000000_26.get$arr$(235), new AwS570S0100000_26((C03K6) this, 1074), new AwS570S0100000_26((C03K6) this, 1075), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1076), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 1077), null, new AwS570S0100000_26((C03K6) this, 1078));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 1079), awS570S0100000_26, AFwS215S0000000_26.get$arr$(236), new AwS570S0100000_26((C03K6) this, 1080), new AwS570S0100000_26((C03K6) this, 1081), new AwS570S0100000_26((C03K6) this, 1082), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 1083));
        }
        this.LLILZ = assemVMLazy;
    }

    public final C0HZQ I5() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.dj9) : null;
            this.LLILLJJLI = (C0HZQ) viewFindViewById;
        }
        return (C0HZQ) viewFindViewById;
    }

    public final CCDCAddCardViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        return (CCDCAddCardViewModel) assemVMLazy.getValue();
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        return this.itemView;
    }

    public final void N5(boolean z) {
        I5().setChecked(z);
        L5().setState(new AwS32S0010000_18(z, 14));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        EnumC1709240ua2 enumC1709240ua2LIZIZ;
        C1709610uad c1709610uad;
        SecurityInfo securityInfo;
        SaveCardInfo saveCardInfo;
        C1157180gDc c1157180gDc = (C1157180gDc) interfaceC1891350zJl;
        super.onBindItemView(c1157180gDc);
        boolean zLJFF = false;
        C1710770ucV.LIZ(this.itemView, new C21569319b9(C1722120uuo.LIZJ(0), C1722120uuo.LIZJ(16), C1722120uuo.LIZJ(16), 48, true, 232));
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = this.itemView;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.z6l);
            } else {
                viewFindViewById = null;
            }
            this.LL = (TuxTextView) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        RawTextAndIcon rawTextAndIconLJJIIZI = c1157180gDc.LL.invoke().LJJIIZI();
        if (rawTextAndIconLJJIIZI == null || (securityInfo = rawTextAndIconLJJIIZI.securityInfo) == null || (saveCardInfo = securityInfo.saveCardInfo) == null || (str = saveCardInfo.saveCardTitle) == null) {
            str = "";
        }
        textView.setText(str);
        C1709640uag c1709640uag = L5().LLILLJJLI;
        if (c1709640uag != null) {
            enumC1709240ua2LIZIZ = c1709640uag.LIZIZ();
        } else {
            enumC1709240ua2LIZIZ = null;
        }
        if (enumC1709240ua2LIZIZ == EnumC1709240ua2.TOKO) {
            I5().setCheckBoxCheckedColor(C1712770ufj.LIZ(R.attr.dt, this.itemView.getContext()));
        }
        C0HZQ c0hzqI5 = I5();
        PaymentOption paymentOptionEQ2 = L5().EQ2();
        if (paymentOptionEQ2 != null && (c1709610uad = paymentOptionEQ2.LJII) != null) {
            zLJFF = Intrinsics.LJFF(c1709610uad.LIZ, Boolean.TRUE);
        }
        c0hzqI5.setChecked(zLJFF);
        C786410Ut5.b9(I5(), new ACListenerS128S0200000_26(this, c1157180gDc, 17));
        View viewFindViewById2 = this.LLILLL;
        if (viewFindViewById2 == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById2 = viewLJJIJL.findViewById(R.id.k3o);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLL = (TuxIconView) viewFindViewById2;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById2, new ACListenerS128S0200000_26(this, c1157180gDc, 18));
        View viewFindViewById3 = this.LLILLL;
        if (viewFindViewById3 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById3 = viewLJJIJL2.findViewById(R.id.k3o);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLL = (TuxIconView) viewFindViewById3;
        }
        C337180DJs.LIZ(viewFindViewById3);
        L5().AQ2().LIZJ("save", null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dvb, viewGroup, false);
    }
}
