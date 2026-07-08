package com.ss.android.ugc.aweme.im.chatroom.common.titlebar;

import X.C13LE;
import X.C1559260qg8;
import X.C19719912Dl;
import X.C457780HxI;
import X.C723580SZw;
import X.C723850SaN;
import X.C786410Ut5;
import X.C899450ZQh;
import X.EnumC20623015mu;
import Y.ACListenerS165S0100000_31;
import android.view.View;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.api.BaseIMTitleBarAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public abstract class BaseIMTitleBarWithDefaultLeftAssem extends BaseIMTitleBarAssem {
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());

    public C19719912Dl kp() {
        return C13LE.LIZ(TitleBarLeftAssem.class);
    }

    public abstract C899450ZQh lp();

    public abstract void mp();

    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.api.BaseIMTitleBarAssem
    public void hp() {
        EnterChatParams enterChatParams;
        C723850SaN.LIZLLL(this, new AwS610S0100000_31(this, 202));
        C457780HxI c457780HxI = (C457780HxI) this.LLJJIII.getValue();
        if (c457780HxI == null || (enterChatParams = c457780HxI.LLILLL) == null || !enterChatParams.getTabletOptimizationEnabled()) {
            ip(EnumC20623015mu.SLOT_LEFT, new AwS610S0100000_31(this, 203));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.api.BaseIMTitleBarAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 72), view.findViewById(R.id.mjp));
    }
}
