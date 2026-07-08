package com.ss.android.ugc.aweme.internalshare.impl.ui.iminput;

import X.C019F;
import X.C01GW;
import X.C0H2Q;
import X.C13LE;
import X.C1629106Zl;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C419910GdJ;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC456120Huc;
import X.InterfaceC458730Hyp;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class InternalShareEmojiButtonAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InternalShareEmojiButtonAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InternalShareEmojiButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 449), AFwS236S0000000_6.get$arr$(211), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 446));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 445));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 447));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 448));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ctz;
    }

    public final void hp(InterfaceC456120Huc interfaceC456120Huc) {
        C419910GdJ c419910GdJ;
        if (getContext() == null) {
            return;
        }
        TuxIconView tuxIconView = (TuxIconView) this.LLJJIII.getValue();
        if (interfaceC456120Huc instanceof InterfaceC458730Hyp) {
            c419910GdJ = (C419910GdJ) this.LLJJIJIIJIL.getValue();
        } else {
            c419910GdJ = (C419910GdJ) this.LLJJIJI.getValue();
        }
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.I7((View.OnClickListener) this.LLJJIJIL.getValue(), getContentView());
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0H2Q(this, null), 3);
        hp(C1629106Zl.LL);
    }
}
