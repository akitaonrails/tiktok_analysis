package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.AnonymousClass0341;
import X.C00XN;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03DZ;
import X.C03H8;
import X.C03IJ;
import X.C03K6;
import X.C0H1U;
import X.C123100dR;
import X.C13LE;
import X.C14EU;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes34.dex */
public final class CCDCBindCardTipsViewHolder extends PowerCell<C00XN> implements C03H8 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CCDCBindCardTipsViewHolder.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        throw null;
    }

    public CCDCBindCardTipsViewHolder() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1869);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(89);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1880), awS577S0100000_33, AFwS224S0000000_33.get$arr$(250), new AwS577S0100000_33((C03K6) this, 1855), new AwS577S0100000_33((C03K6) this, 1857), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1859), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1861), null, new AwS577S0100000_33((C03K6) this, 1862));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1856);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1858);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1860);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 69));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1863);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1864);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1865);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1866);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1867);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1868), awS577S0100000_33, AFwS224S0000000_33.get$arr$(248), new AwS577S0100000_33((C03K6) this, 1870), new AwS577S0100000_33((C03K6) this, 1871), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1872), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1873), null, new AwS577S0100000_33((C03K6) this, 1874));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1875), awS577S0100000_33, AFwS224S0000000_33.get$arr$(249), new AwS577S0100000_33((C03K6) this, 1876), new AwS577S0100000_33((C03K6) this, 1877), new AwS577S0100000_33((C03K6) this, 1878), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1879));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C00XN c00xn = (C00XN) interfaceC1891350zJl;
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        if (((CCDCAddCardViewModel) assemVMLazy.getValue()).CQ2() && C123100dR.LIZ(c00xn.LL)) {
            C03DZ.LIZJ(this.itemView.findViewById(R.id.z2k));
        } else {
            C0H1U.LIZIZ(this.itemView.findViewById(R.id.z2k));
        }
        ((TextView) this.itemView.findViewById(R.id.z2k)).setText(c00xn.LL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C0H1U.LIZJ(R.layout.and, viewGroup, false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onNeedSaveStatusChange(AnonymousClass0341 anonymousClass0341) {
        if (anonymousClass0341.LIZ) {
            C03DZ.LIZJ(this.itemView.findViewById(R.id.z2k));
        } else {
            C0H1U.LIZIZ(this.itemView.findViewById(R.id.z2k));
        }
    }
}
