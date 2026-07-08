package com.ss.android.ugc.aweme.im.chatroom.input.container;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C457610Hx1;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.assem.IMInputAssem;
import com.ss.android.ugc.aweme.im.chatroom.api.ability.IMInputViewUIAbility;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseChatInputAssem extends IMInputAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final AssemVMLazy LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseChatInputAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BaseChatInputAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 147), AFwS236S0000000_6.get$arr$(92), null, true);
        this.LLJLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 146));
        this.LLJLLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 145));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IMInputViewUIAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        if (LJJIJL().getHeight() != -2) {
            View viewLJJIJL = LJJIJL();
            ViewGroup.LayoutParams layoutParams = viewLJJIJL.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                C786410Ut5.W5(viewLJJIJL, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            if (C1558520qew.LIZ(interfaceC665370Q7zLJFF, IMInputViewUIAbility.class, null) == null) {
                View viewLJJIJL2 = LJJIJL();
                AssemVMLazy assemVMLazy = this.LLJJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = IMInputAssem.LLJLIL;
                C1558520qew.LJII(interfaceC665370Q7zLJFF, new ChatroomInputViewAbility(viewLJJIJL2, (InputPanelSizeViewModel) assemVMLazy.getValue()), IMInputViewUIAbility.class, null, null);
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C457610Hx1(this, null), 3);
    }
}
