package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.viewholder;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C03ZD;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C873103b7;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.BankInstallmentViewModel;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class InstallmentInfosViewHolder extends PowerCell<C873103b7> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public boolean LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InstallmentInfosViewHolder.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/cci/BankInstallmentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InstallmentInfosViewHolder() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BankInstallmentViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1066);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(201);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1076), awS545S0100000_1, AFwS207S0000000_19.get$arr$(209), new AwS545S0100000_1((C03K6) this, 1058), new AwS545S0100000_1((C03K6) this, 1060), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1062), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1313), null, new AwS545S0100000_1((C03K6) this, 1064));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 1059);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1061);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 1063);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 78));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1314);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1315);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1316);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1317);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1318);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1065), awS545S0100000_1, AFwS207S0000000_19.get$arr$(207), new AwS545S0100000_1((C03K6) this, 1067), new AwS545S0100000_1((C03K6) this, 1068), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1069), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1319), null, new AwS545S0100000_1((C03K6) this, 1070));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1071), awS545S0100000_1, AFwS207S0000000_19.get$arr$(208), new AwS545S0100000_1((C03K6) this, 1072), new AwS545S0100000_1((C03K6) this, 1073), new AwS545S0100000_1((C03K6) this, 1074), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 1075));
        }
        this.LL = assemVMLazy;
    }

    public final BankInstallmentViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (BankInstallmentViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r21) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.viewholder.InstallmentInfosViewHolder.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return new C03ZD(viewGroup.getContext());
    }
}
