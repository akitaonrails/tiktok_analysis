package com.ss.android.ugc.aweme.titlebar.quicktitlebar;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19727912Gn;
import X.C19ME;
import X.C2217381BqS;
import X.C417390GYf;
import X.C418440Gaw;
import X.C426750GoL;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.QuickChatViewModel;
import com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class QuickTitleBarCenterGroupAssem extends GroupTitleBarCenterAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public final AssemVMLazy LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(QuickTitleBarCenterGroupAssem.class, "quickChatViewModel", "getQuickChatViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/quickinteraction/viewmodel/QuickChatViewModel;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public QuickTitleBarCenterGroupAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuickChatViewModel.class);
        this.LLJZIJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 1156), AFwS248S0000000_14.get$arr$(343), null, true);
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public final void Gp() {
        super.Gp();
        AssemVMLazy assemVMLazy = this.LLJZIJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ZPf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1653306df) obj).LL);
            }
        }, null, new AwS628S0100000_14(this, 38), 6);
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public final void op() {
        C19ME c19me;
        C786410Ut5.LJLLLLLL(8, (View) this.LLJJJJJIL.getValue());
        FrameLayout frameLayoutTp = tp();
        ViewGroup.LayoutParams layoutParams = frameLayoutTp.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
        marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
        C786410Ut5.W5(frameLayoutTp, marginLayoutParams);
        C417390GYf c417390GYfSp = sp();
        if (c417390GYfSp != null) {
            ViewGroup.LayoutParams layoutParams2 = c417390GYfSp.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            C786410Ut5.W5(c417390GYfSp, layoutParams3);
        }
        ViewGroup.LayoutParams layoutParams4 = tp().getLayoutParams();
        if (!(layoutParams4 instanceof C19ME) || (c19me = (C19ME) layoutParams4) == null) {
            return;
        }
        c19me.horizontalBias = 0.5f;
        C786410Ut5.a6(tp(), c19me);
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public final void Bp() {
        super.Bp();
        C19727912Gn c19727912Gn = this.LLJLL;
        if (c19727912Gn != null) {
            ViewGroup.LayoutParams layoutParams = c19727912Gn.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            C786410Ut5.W5(c19727912Gn, layoutParams2);
            C426750GoL.LJIIIZ(c19727912Gn, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d)))), false, 16);
            c19727912Gn.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))));
        }
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public final void init() {
        Ep();
        Bp();
        Gp();
    }
}
