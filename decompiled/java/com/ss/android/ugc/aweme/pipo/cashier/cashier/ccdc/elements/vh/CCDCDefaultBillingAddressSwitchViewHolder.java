package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1272704yT;
import X.C13LE;
import X.C1710770ucV;
import X.C1711590udp;
import X.C1722120uuo;
import X.C19719912Dl;
import X.C21411818qq;
import X.C21569319b9;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS128S0200000_26;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CCDCAddCardViewModel;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CCDCDefaultBillingAddressSwitchViewHolder extends PowerCell<C1272704yT> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CCDCDefaultBillingAddressSwitchViewHolder.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/pipo/cashier/cashier/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CCDCDefaultBillingAddressSwitchViewHolder() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 1017);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(403);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 1028), awS570S0100000_26, AFwS215S0000000_26.get$arr$(228), new AwS570S0100000_26((C03K6) this, 1003), new AwS570S0100000_26((C03K6) this, 1005), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1007), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 1009), null, new AwS570S0100000_26((C03K6) this, 1010));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 1004);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1006);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 1008);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 51));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 1011);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 1012);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 1013);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 1014);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 1015);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 1016), awS570S0100000_26, AFwS215S0000000_26.get$arr$(229), new AwS570S0100000_26((C03K6) this, 1018), new AwS570S0100000_26((C03K6) this, 1019), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1020), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 1021), null, new AwS570S0100000_26((C03K6) this, 1022));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 1023), awS570S0100000_26, AFwS215S0000000_26.get$arr$(230), new AwS570S0100000_26((C03K6) this, 1024), new AwS570S0100000_26((C03K6) this, 1025), new AwS570S0100000_26((C03K6) this, 1026), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 1027));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1711590udp c1711590udp;
        C1272704yT c1272704yT = (C1272704yT) interfaceC1891350zJl;
        super.onBindItemView(c1272704yT);
        View view = this.itemView;
        if ((view instanceof C1711590udp) && (c1711590udp = (C1711590udp) view) != null) {
            C1710770ucV.LIZ(view, new C21569319b9(C1722120uuo.LIZJ(12), C1722120uuo.LIZJ(16), C1722120uuo.LIZJ(16), 48, true, 232));
            TuxTextView tuxTextView = c1711590udp.LL;
            String str = c1272704yT.LL;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            tuxTextView.setText(str);
            TuxTextView tuxTextView2 = c1711590udp.LLILLJJLI;
            String str3 = c1272704yT.LLILLJJLI;
            if (str3 != null) {
                str2 = str3;
            }
            tuxTextView2.setText(str2);
            C786410Ut5.f9(c1711590udp.LLILLL, null);
            C21411818qq c21411818qq = c1711590udp.LLILLL;
            AssemVMLazy assemVMLazy = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
            c21411818qq.setChecked(((CCDCAddCardViewModel) assemVMLazy.getValue()).LLIZ);
            C786410Ut5.f9(c1711590udp.LLILLL, new ACListenerS128S0200000_26(this, c1711590udp, 7));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return new C1711590udp(viewGroup.getContext());
    }
}
