package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.viewholder;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C13LE;
import X.C1841350y17;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C847703Sx;
import X.C903203fy;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.BankInstallmentViewModel;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class BankViewHolder extends PowerCell<C847703Sx> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BankViewHolder.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/cci/BankInstallmentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BankViewHolder() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BankInstallmentViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1843);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(88);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1854), awS577S0100000_33, AFwS224S0000000_33.get$arr$(247), new AwS577S0100000_33((C03K6) this, 1829), new AwS577S0100000_33((C03K6) this, 1831), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1833), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1835), null, new AwS577S0100000_33((C03K6) this, 1836));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1830);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1832);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1834);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 68));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1837);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1838);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1839);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1840);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1841);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1842), awS577S0100000_33, AFwS224S0000000_33.get$arr$(245), new AwS577S0100000_33((C03K6) this, 1844), new AwS577S0100000_33((C03K6) this, 1845), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1846), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1847), null, new AwS577S0100000_33((C03K6) this, 1848));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1849), awS577S0100000_33, AFwS224S0000000_33.get$arr$(246), new AwS577S0100000_33((C03K6) this, 1850), new AwS577S0100000_33((C03K6) this, 1851), new AwS577S0100000_33((C03K6) this, 1852), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1853));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C903203fy c903203fy;
        int i;
        C847703Sx c847703Sx = (C847703Sx) interfaceC1891350zJl;
        super.onBindItemView(c847703Sx);
        View view = this.itemView;
        if ((view instanceof C903203fy) && (c903203fy = (C903203fy) view) != null) {
            C1841350y17 radioFromXml = c903203fy.getRadioFromXml();
            if (!c847703Sx.LLILZ) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, radioFromXml);
            c903203fy.setBankInfo(c847703Sx.LL);
            AssemVMLazy assemVMLazy = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
            c903203fy.setStyle(((BankInstallmentViewModel) assemVMLazy.getValue()).LL);
            c903203fy.setChecked(c847703Sx.LLILLL);
            c903203fy.setOnCheckedListener(new AwS367S0200000_1(this, c847703Sx, 282));
            c903203fy.setOnPromotionClickListener(new AwS367S0200000_1(c903203fy, this, 283));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return new C903203fy(viewGroup.getContext(), null, 0);
    }
}
