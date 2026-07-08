package com.ss.android.ugc.aweme.im.chatroom.common.titlebar;

import X.C019F;
import X.C1383370m6R;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1653306df;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C457780HxI;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C814420VxA;
import X.C899450ZQh;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.QuickChatViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS17S0001000_2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseQuickTitleBarAssem extends BaseIMTitleBarWithDefaultLeftAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C1559260qg8 LLJJIJI = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseQuickTitleBarAssem.class, "quickChatViewModel", "getQuickChatViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/quickinteraction/viewmodel/QuickChatViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BaseQuickTitleBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuickChatViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 481), AFwS248S0000000_14.get$arr$(122), null, true);
    }

    public abstract void op();

    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.BaseIMTitleBarWithDefaultLeftAssem
    public final C899450ZQh lp() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_up_right_and_arrow_down_left;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        return new C899450ZQh(c419910GdJ, C1383370m6R.LJIIJ(2131834298));
    }

    public final boolean sp() {
        SessionInfo sessionInfo;
        C457780HxI c457780HxI = (C457780HxI) this.LLJJIJI.getValue();
        return (c457780HxI == null || (sessionInfo = c457780HxI.LL) == null || !sessionInfo.getQuickChatCanExpandFullScreen()) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.BaseIMTitleBarWithDefaultLeftAssem
    public final C19719912Dl kp() {
        return sp() ? super.kp() : C13LE.LIZ(QuickChatTitleBarNotExpandLeftAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.BaseIMTitleBarWithDefaultLeftAssem
    public final void mp() {
        if (sp()) {
            AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
            AssemViewModel value = assemVMLazy.getValue();
            if (((C1653306df) value.getState()).LL) {
                value.setState(AFwS229S0000000_2.get$arr$(575));
            } else {
                value.setState(new AwS17S0001000_2(0, 8));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.BaseIMTitleBarWithDefaultLeftAssem, com.ss.android.ugc.aweme.im.chatroom.common.titlebar.api.BaseIMTitleBarAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ZPi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1653306df) obj).LL);
            }
        }, null, new AwS628S0100000_14(this, 57), 6);
    }
}
