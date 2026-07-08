package com.ss.android.ugc.aweme.ecommerce.mall.mixhome;

import X.AbstractC1591090rVT;
import X.AbstractC738140SxQ;
import X.C019F;
import X.C127G;
import X.C13LE;
import X.C1591880rWk;
import X.C1606660rua;
import X.C1608210rx5;
import X.C1637806bA;
import X.C1767800w6U;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C2341109Fh;
import X.C300440Bq6;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC1055110dYz;
import X.InterfaceC2217461Bqa;
import Y.AObjectS398S0100000_24;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MixMallThemeAssem extends AbstractC738140SxQ implements InterfaceC1055110dYz {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C1608210rx5 LL = new C1608210rx5(this, C13LE.LJII(ShopMallMixFragment.class));
    public final AssemVMLazy LLILLJJLI;
    public C127G LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixMallThemeAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/mall/mixhome/ShopMallMixViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MixMallThemeAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShopMallMixViewModel.class);
        this.LLILLJJLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 341), AFwS264S0000000_24.get$arr$(91), null, true);
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLILLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLILLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ShopMallMixViewModel.class, new AObjectS398S0100000_24(this, 2)}, defaultViewModelProviderFactory);
                    this.LLILLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        Hox.LLJILJIL.LIZ(c19egLIZ).wQ2(C1767800w6U.LJ() ? "Shop" : "SHOP_MALL", this);
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0qzk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1571460qzo) obj).LLILZIL;
            }
        }, null, null, null, new AwS390S0200000_24(this, c19egLIZ, 4), 14, null);
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        C19EG c19egLIZ;
        AbstractC1591090rVT abstractC1591090rVTY01;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("mixhome ShopTab TabRefresh MallThemeAssem onNodeHide");
        boolean zLJ = C1767800w6U.LJ();
        if (C300440Bq6.LIZ() && zLJ && (c19egLIZ = C724240Sb0.LIZ(this)) != null && (abstractC1591090rVTY01 = C1591880rWk.LIZIZ.LJIILL(c19egLIZ).y01()) != null) {
            abstractC1591090rVTY01.LJIILIIL(true);
        }
        if (!Intrinsics.LJFF(bundle.getString("fromStart"), "MainFragment")) {
            return;
        }
        if (Intrinsics.LJFF(bundle.getString("toPage"), "Nearby")) {
            C1606660rua.LIZIZ.LJ();
        }
        Intrinsics.LJFF(bundle.getString("toPage"), "Activity");
        Intrinsics.LJFF(bundle.getString("toPage"), "homepage_explore");
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("mixhome ShopTab TabRefresh MallThemeAssem onNodeShow");
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        ((ShopMallMixViewModel) assemVMLazy.getValue()).LLILLL.LJII = System.currentTimeMillis();
    }
}
