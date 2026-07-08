package com.ss.android.ugc.aweme.titlebar.quicktitlebar;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19ME;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C899360ZPy;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.QuickChatViewModel;
import com.ss.android.ugc.aweme.titlebar.GroupWithStoryTitleBarCenterAssem;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class QuickTitleBarCenterGroupWithStoryAssem extends GroupWithStoryTitleBarCenterAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public final AssemVMLazy LLLFZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(QuickTitleBarCenterGroupWithStoryAssem.class, "quickChatViewModel", "getQuickChatViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/quickinteraction/viewmodel/QuickChatViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public QuickTitleBarCenterGroupWithStoryAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuickChatViewModel.class);
        this.LLLFZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 1157), AFwS248S0000000_14.get$arr$(344), null, true);
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public final void Gp() {
        super.Gp();
        AssemVMLazy assemVMLazy = this.LLLFZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ZPg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1653306df) obj).LL);
            }
        }, null, new AwS628S0100000_14(this, 39), 6);
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
        C01GW c01gw = C899360ZPy.LIZ;
        marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        C786410Ut5.W5(frameLayoutTp, marginLayoutParams);
        ViewGroup.LayoutParams layoutParams2 = tp().getLayoutParams();
        if (!(layoutParams2 instanceof C19ME) || (c19me = (C19ME) layoutParams2) == null) {
            return;
        }
        c19me.horizontalBias = 0.5f;
        C786410Ut5.a6(tp(), c19me);
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupWithStoryTitleBarCenterAssem, com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public final void init() {
        Ep();
        dq();
        Bp();
        Gp();
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupWithStoryTitleBarCenterAssem
    public final void Xp() {
        C01GW c01gw = C899360ZPy.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.titlebar.GroupWithStoryTitleBarCenterAssem, com.ss.android.ugc.aweme.titlebar.GroupTitleBarCenterAssem
    public final void ip() {
        C01GW c01gw = C899360ZPy.LIZ;
    }
}
