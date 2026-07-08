package com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn;

import X.C019F;
import X.C01GW;
import X.C06YV;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public class InputEmojiButtonUIAssem extends IMUISlotViewAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public TuxIconView LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InputEmojiButtonUIAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InputEmojiButtonUIAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 353), AFwS229S0000000_2.get$arr$(251), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 351));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 352));
    }

    @Override // com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem
    public View LLLILZJ() {
        Context context = getContext();
        if (context == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C786410Ut5.M6(tuxIconView, new ViewGroup.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        tuxIconView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        tuxIconView.setTuxIcon((C419910GdJ) this.LLJJIJI.getValue());
        tuxIconView.setContentDescription(tuxIconView.getContext().getString(2131835715));
        return tuxIconView;
    }

    public C419910GdJ hp() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_emoji;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        return c419910GdJ;
    }

    public C419910GdJ kp() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_keyboard_circle;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        return c419910GdJ;
    }

    public void ip() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C06YV(this, null), 3);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        TuxIconView tuxIconView;
        super.onViewCreated(view);
        if (view instanceof TuxIconView) {
            tuxIconView = (TuxIconView) view;
        } else {
            tuxIconView = null;
        }
        this.LLJJIII = tuxIconView;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(this, 33));
        }
        ip();
    }
}
