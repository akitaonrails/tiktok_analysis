package com.ss.android.ugc.aweme.music.highlight;

import X.C019F;
import X.C01GW;
import X.C1257170iot;
import X.C1264160j0A;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C19719912Dl;
import X.C19EG;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS62S0000000_9;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class HighlightSelectListAssem extends UIListContentAssem<HighlightSelectListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public C1749280vcc LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1169));
    public final AssemVMLazy LLJI;
    public C127G LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HighlightSelectListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/music/highlight/HighlightSelectListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HighlightSelectListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HighlightSelectListViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1172), AFwS240S0000000_9.get$arr$(492), null, true);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 2;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final HighlightSelectListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (HighlightSelectListViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{HighlightSelectListViewModel.class, new AObjectS62S0000000_9(this, 10)}, defaultViewModelProviderFactory);
                    this.LLJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLIZLLLIL = (C1749280vcc) view.findViewById(R.id.w28);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getContext());
        wrapLinearLayoutManager.setOrientation(1);
        Go().setLayoutManager(wrapLinearLayoutManager);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0Orn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C631750OqD c631750OqD = (C631750OqD) obj;
                c631750OqD.getClass();
                return C627260Oiy.LIZLLL(c631750OqD);
            }
        }, null, new AwS588S0100000_9(this, 298), new AwS553S0100000_9(this, 1170), new AwS588S0100000_9(this, 299), 2, null);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Oro
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C631750OqD) obj).LLILLJJLI);
            }
        }, null, new AwS623S0100000_9(this, 110), 6);
    }

    public final void No(boolean z, Exception exc) {
        C1749280vcc c1749280vcc = this.LLIZLLLIL;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
        }
        if (z) {
            C1749280vcc c1749280vcc2 = this.LLIZLLLIL;
            if (c1749280vcc2 != null) {
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C1893080zMY.LJ(c1722300uv6);
                c1749280vcc2.setStatus(c1722300uv6);
                return;
            }
            return;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1257170iot.LIZIZ(c19egLIZ, "", exc, this.LLIZLLLIL);
        }
        C1749280vcc c1749280vcc3 = this.LLIZLLLIL;
        if (c1749280vcc3 == null) {
            return;
        }
        C1264160j0A.LIZIZ(c1749280vcc3, "", exc, new AwS553S0100000_9(this, 1171));
    }
}
