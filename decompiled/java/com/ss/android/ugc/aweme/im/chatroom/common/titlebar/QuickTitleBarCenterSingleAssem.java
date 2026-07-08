package com.ss.android.ugc.aweme.im.chatroom.common.titlebar;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19ME;
import X.C2217381BqS;
import X.C419060Gbw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.QuickChatViewModel;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class QuickTitleBarCenterSingleAssem extends SingleTitleBarCenterAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJ;
    public final AssemVMLazy LLLIZZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(QuickTitleBarCenterSingleAssem.class, "quickChatViewModel", "getQuickChatViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/quickinteraction/viewmodel/QuickChatViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public QuickTitleBarCenterSingleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuickChatViewModel.class);
        this.LLLIZZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 482), AFwS248S0000000_14.get$arr$(123), null, true);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem
    public final void zp() {
        super.zp();
        AssemVMLazy assemVMLazy = this.LLLIZZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ZQa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1653306df) obj).LL);
            }
        }, null, new AwS628S0100000_14(this, 14), 6);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem
    public final void Gp() {
        C19ME c19me;
        ConstraintLayout constraintLayout = this.LLJJL;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = -2;
            C786410Ut5.W5(constraintLayout, marginLayoutParams);
        }
        C419060Gbw c419060Gbw = this.LLJJJJLIIL;
        if (c419060Gbw != null) {
            ViewGroup.LayoutParams layoutParams2 = c419060Gbw.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.width = -2;
            C786410Ut5.W5(c419060Gbw, marginLayoutParams2);
        }
        AvatarComponentView avatarComponentView = this.LLJLLL;
        if (avatarComponentView != null) {
            ViewGroup.LayoutParams layoutParams3 = avatarComponentView.getLayoutParams();
            if ((layoutParams3 instanceof C19ME) && (c19me = (C19ME) layoutParams3) != null) {
                c19me.horizontalBias = 0.5f;
                C786410Ut5.e7(avatarComponentView, c19me);
            }
        }
        Ap();
        tp();
        zp();
    }
}
