package com.ss.android.ugc.aweme.tako.startup.onboarding.ui;

import X.C019F;
import X.C03H5;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427690Gpr;
import X.C430620Gua;
import X.C443380Ha4;
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
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.tako.startup.onboarding.vm.TakoOnboardingViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class TakoOnboardingHorizontalAssem extends ReusedUISlotAssem<C03H5> implements InterfaceC712990Rxx<C443380Ha4> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public static final int LLJLLIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public C430620Gua LLJL;
    public SmartImageView LLJLIL;
    public SmartImageView LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoOnboardingHorizontalAssem.class, "onboardingVM", "getOnboardingVM()Lcom/ss/android/ugc/aweme/tako/startup/onboarding/vm/TakoOnboardingViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    public TakoOnboardingHorizontalAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoOnboardingViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 757), AFwS236S0000000_6.get$arr$(359), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fqk;
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
        C430620Gua c430620Gua = (C430620Gua) view.findViewById(R.id.zhz);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_right_fill_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(c430620Gua.getContext());
        tuxIconDrawableLIZ.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        float fLIZIZ = C418440Gaw.LIZIZ(3);
        c430620Gua.LLJJJJ = tuxIconDrawableLIZ;
        c430620Gua.LLJJJJJIL = fLIZIZ;
        c430620Gua.LJJJJL();
        this.LLJL = c430620Gua;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.lus);
        C786410Ut5.u5(smartImageView, 0.3f);
        this.LLJLILLLLZIIL = smartImageView;
        SmartImageView smartImageView2 = (SmartImageView) view.findViewById(R.id.liq);
        int i = (smartImageView2.getContext().getResources().getDisplayMetrics().widthPixels - (LLJLLIL * 2)) / 3;
        long j = (((long) i) * 115) / 118;
        ViewGroup.LayoutParams layoutParams = smartImageView2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = (int) j;
            C786410Ut5.W5(smartImageView2, layoutParams);
            this.LLJLIL = smartImageView2;
            C786410Ut5.I7(new ACListenerS141S0100000_6(this, 81), view);
            AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Ha6
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1863140yaG) obj).LLILZIL);
                }
            }, C736820SvI.LIZIZ(false), new AwS620S0100000_6(this, 88), 4);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C443380Ha4 r23) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingHorizontalAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C443380Ha4 c443380Ha4) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C443380Ha4 c443380Ha4) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
