package com.ss.android.ugc.aweme.im.quickchat.ui.assem;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0I0B;
import X.C0IBF;
import X.C0PEM;
import X.C0S2R;
import X.C0S2U;
import X.C0ZH1;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2172671A1h;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C441201ne;
import X.C452501pT;
import X.C456260Huq;
import X.C456970Hvz;
import X.C457020Hw4;
import X.C457030Hw5;
import X.C457040Hw6;
import X.C457810HxL;
import X.C463000IDq;
import X.C723580SZw;
import X.C724750Sbp;
import X.EnumC2172611A1b;
import X.EnumC456980Hw0;
import X.EnumC457820HxM;
import X.EnumC913000Zrm;
import X.EnumC913010Zrn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC457250HwR;
import Y.AObjectS381S0100000_6;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.assem.IMInputAssem;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class IMQuickMessageInputAssem extends IMInputAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public final C01GW<InterfaceC457250HwR> LLJLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 162));
    public final AssemVMLazy LLJLLIL;
    public final C1559260qg8 LLJLLL;
    public final C01GW<C456970Hvz> LLJZ;
    public final AssemVMLazy LLJZIJLIL;
    public final AssemVMLazy LLL;
    public C127G LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMQuickMessageInputAssem.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/InputFieldVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(IMQuickMessageInputAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(IMQuickMessageInputAssem.class, "imQuickMessageInputVM", "getImQuickMessageInputVM()Lcom/ss/android/ugc/aweme/im/quickchat/ui/assem/IMQuickMessageInputVM;", 0);
        c09r3.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public IMQuickMessageInputAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputFieldVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 163), AFwS236S0000000_6.get$arr$(97), null, true);
        this.LLJLLL = new C1559260qg8(new C723580SZw(this, C456260Huq.class, null), checkSupervisorPrepared());
        this.LLJZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 161));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJZIJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 164), AFwS236S0000000_6.get$arr$(98), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(IMQuickMessageInputVM.class);
        this.LLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ3, 165), AFwS236S0000000_6.get$arr$(99), null, true);
    }

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem
    public final void hp() {
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_INPUT_FIELD, new AwS585S0100000_6(this, 79));
        IMQuickMessageInputVM iMQuickMessageInputVMMp = mp();
        if (iMQuickMessageInputVMMp.Jw2().getValue() == C0IBF.FEATURE_STATUS_SHOW) {
            C456970Hvz c456970Hvz = (C456970Hvz) iMQuickMessageInputVMMp.LLILZ.getValue();
            if ((c456970Hvz != null ? c456970Hvz.LLILZIL : null) != EnumC456980Hw0.FORCE_HIDE) {
                C457810HxL.LIZ(this, EnumC457820HxM.SLOT_LEFT_AREA, new AwS585S0100000_6(this, 80));
            }
        }
        if (mp().vQ2().LJIJ()) {
            C457810HxL.LIZ(this, EnumC457820HxM.SLOT_TOP_AREA, new AwS585S0100000_6(this, 81));
        }
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_INPUT_RIGHT_AREA, new AwS585S0100000_6(this, 82));
        if (mp().vQ2().LJIJ()) {
            C441201ne.LIZ(this, new C463000IDq(mp().vQ2().LJIILLIIL(), 23), "VoiceFieldAssem", new AwS585S0100000_6(this, 83));
        }
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_PANEL, AFwS236S0000000_6.get$arr$(96));
    }

    public final IMQuickMessageInputVM mp() {
        AssemVMLazy assemVMLazy = this.LLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFF;
        return (IMQuickMessageInputVM) assemVMLazy.getValue();
    }

    public final InputFieldVM op() {
        AssemVMLazy assemVMLazy = this.LLJLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFF;
        return (InputFieldVM) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLF;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLF;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IMQuickMessageInputVM.class, new AObjectS381S0100000_6(this, 2)}, defaultViewModelProviderFactory);
                    this.LLLF = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem
    public final void kp() {
        View viewLJJIJL = LJJIJL();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zm);
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(12));
        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(12));
        viewLJJIJL.setBackground(c384050F3z.LIZ(LJJIJL().getContext()));
        C457040Hw6.LIZLLL((View) this.LLJJJ.getValue());
        C457040Hw6.LIZIZ(ip());
        C457040Hw6.LIZ((View) this.LLJJIJIL.getValue());
        C457040Hw6.LIZJ((View) this.LLJJIJI.getValue());
    }

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C457020Hw4(this, null), 3);
        C456970Hvz value = this.LLJZ.getValue();
        if (value != null) {
            EnumC2172611A1b enumC2172611A1b = value.LLJ;
            EnumC913000Zrm enumC913000Zrm = value.LLJI;
            C0ZH1 c0zh1 = value.LLJIJIL;
            C0S2U c0s2u = value.LLJILJIL;
            EnumC913010Zrn enumC913010Zrn = value.LLJILJILJ;
            C0S2R c0s2r = value.LLJILLL;
            String str = value.LLJJ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C2172671A1h(C0I0B.LJFF.LIZIZ(), enumC2172611A1b, enumC913000Zrm, c0zh1, c0s2u, enumC913010Zrn, c0s2r, str, null), 3);
        }
        InterfaceC457250HwR value2 = this.LLJLL.getValue();
        if (value2 != null && value2.LJ()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C457030Hw5(this, null), 3);
        }
    }
}
