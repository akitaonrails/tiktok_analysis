package com.ss.android.ugc.aweme.tako.startup.onboarding.ui;

import X.C019F;
import X.C03H5;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C443460HaC;
import X.C443500HaG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS141S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.tako.startup.onboarding.vm.TakoOnboardingViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class TakoOnBoardingGridAssem extends ReusedUISlotAssem<C03H5> implements InterfaceC712990Rxx<C443460HaC> {
    public static final C443500HaG LLJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public static final long LLJLL;
    public static final int LLJLLIL;
    public static final int LLJLLL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public SmartImageView LLJL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0HaG] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoOnBoardingGridAssem.class, "onboardingVM", "getOnboardingVM()Lcom/ss/android/ugc/aweme/tako/startup/onboarding/vm/TakoOnboardingViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLIL = new Object() { // from class: X.0HaG
        };
        LLJLL = 80L;
        LLJLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        LLJLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    public TakoOnBoardingGridAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoOnboardingViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 756), AFwS236S0000000_6.get$arr$(358), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fqj;
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
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.liq);
        long j = (((long) (((smartImageView.getContext().getResources().getDisplayMetrics().widthPixels - LLJLLIL) - (LLJLLL * 2)) / 2)) * 168) / 173;
        ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) j;
            C786410Ut5.W5(smartImageView, layoutParams);
            this.LLJL = smartImageView;
            C786410Ut5.I7(new ACListenerS141S0100000_6(this, 80), view);
            AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Ha7
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1863140yaG) obj).LLILZIL);
                }
            }, C736820SvI.LIZIZ(false), new AwS620S0100000_6(this, 87), 4);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C443460HaC r9) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnBoardingGridAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C443460HaC c443460HaC) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C443460HaC c443460HaC) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
