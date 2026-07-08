package com.ss.android.ugc.aweme.tako.startup.onboarding.ui;

import X.C019F;
import X.C1235650iGB;
import X.C1360520lVa;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C427690Gpr;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS154S0100000_19;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.startup.onboarding.vm.TakoOnboardingViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class TakoOnBoardingQueryAssem extends ReusedUISlotAssem<TakoOnBoardingQueryAssem> implements InterfaceC712990Rxx<C1235650iGB> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoOnBoardingQueryAssem.class, "onboardingVM", "getOnboardingVM()Lcom/ss/android/ugc/aweme/tako/startup/onboarding/vm/TakoOnboardingViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoOnBoardingQueryAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoOnboardingViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1863), AFwS257S0000000_19.get$arr$(325), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fqm;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C427690Gpr.LJI(view, null);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.tv_query);
        C786410Ut5.I7(new ACListenerS154S0100000_19(this, 135), view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1235650iGB c1235650iGB) {
        TuxTextView tuxTextView;
        C1235650iGB c1235650iGB2 = c1235650iGB;
        if (c1235650iGB2.LL != null && (tuxTextView = this.LLJJLIIIJLLLLLLLZ) != null) {
            C1360520lVa c1360520lVa = new C1360520lVa();
            c1360520lVa.LIZLLL(c1235650iGB2.LL);
            tuxTextView.setText(c1360520lVa.LIZ);
        }
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        ((TakoOnboardingViewModel) assemVMLazy.getValue()).yQ2(new AwS563S0100000_19(c1235650iGB2, 2927));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1235650iGB c1235650iGB) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1235650iGB c1235650iGB) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
