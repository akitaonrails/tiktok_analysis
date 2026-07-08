package com.ss.android.ugc.aweme.ecommerce.base.bundlepanel;

import X.C019F;
import X.C01GW;
import X.C1170040gYM;
import X.C13LE;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class BundlePanelLoadingAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public C1749280vcc LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final BPEAHandler LLJIJIL;
    public final ARunnableS126S0100000_26 LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BundlePanelLoadingAssem.class, "bundlePanelVM", "getBundlePanelVM()Lcom/ss/android/ugc/aweme/ecommerce/base/bundlepanel/BundlePanelVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BundlePanelLoadingAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BundlePanelVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 161), AFwS268S0000000_26.get$arr$(170), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 185));
        this.LLJIJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJILJIL = new ARunnableS126S0100000_26(this, 23);
    }

    public final C1749280vcc Go() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.nlo) : null;
            this.LLIZLLLIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Context context = LJJIJL().getContext();
        if (context != null) {
            C1170040gYM c1170040gYM = new C1170040gYM(context);
            Go().LIZIZ(c1170040gYM.LIZ);
            Go().LIZ(c1170040gYM);
        }
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0w4J
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1756010vnT) obj).LLILLL;
            }
        }, (Fragment) this.LLJI.getValue(), null, new AwS605S0100000_26(this, 185), new AwS570S0100000_26(this, 186), new AwS605S0100000_26(this, 186), 4, null);
        C736680Sv4.LJIIIIZZ(this, this.LLJ.getValue(), new C2217381BqS() { // from class: X.0w4K
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1756010vnT) obj).LLILZ;
            }
        }, null, new AwS640S0100000_26(this, 14), 6);
    }
}
