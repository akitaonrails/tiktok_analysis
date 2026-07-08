package com.ss.android.ugc.aweme.im.chatroom.common.titlebar;

import X.C724240Sb0;
import X.C895630ZBp;
import X.C899450ZQh;
import X.EnumC20623015mu;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi;
import kotlin.jvm.internal.AFwS276S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class SingleTitleBarAssem extends BaseIMTitleBarWithDefaultLeftAssem {
    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.BaseIMTitleBarWithDefaultLeftAssem
    public final C899450ZQh lp() {
        return new C899450ZQh(0);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.BaseIMTitleBarWithDefaultLeftAssem, com.ss.android.ugc.aweme.im.chatroom.common.titlebar.api.BaseIMTitleBarAssem
    public final void hp() {
        super.hp();
        ip(EnumC20623015mu.SLOT_CENTER, AFwS276S0000000_31.get$arr$(137));
        ip(EnumC20623015mu.SLOT_RIGHT, AFwS276S0000000_31.get$arr$(138));
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.BaseIMTitleBarWithDefaultLeftAssem
    public final void mp() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            IMFoundationBridgeApi.LIZ.getClass();
            IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
            if (iMFoundationBridgeApiLIZ != null) {
                iMFoundationBridgeApiLIZ.LIZJ(fragmentLJI);
            }
        }
    }
}
