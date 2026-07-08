package com.ss.android.ugc.aweme.internalshare.impl.ui.iminput;

import X.C019F;
import X.C01GW;
import X.C0H2O;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class InternalShareSendButtonAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InternalShareSendButtonAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InternalShareSendButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 452), AFwS236S0000000_6.get$arr$(212), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 451));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cu0;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iLIZJ;
        super.onViewCreated(view);
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.LLJJIII.getValue();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_paperplane_fill;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a0p);
        Context context = getContext();
        if (context == null || (iLIZJ = C1308910kAL.LIZJ(R.attr.a0p, context)) == null) {
            iLIZJ = 0;
        }
        c419910GdJ.LIZLLL = iLIZJ;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(view.getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1r);
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        appCompatImageView.setBackgroundDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(view.getContext())));
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 47), getContentView());
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0H2O(this, null), 3);
    }
}
