package com.ss.android.ugc.aweme.im.chatroom.common.titlebar;

import X.C1383370m6R;
import X.C1559260qg8;
import X.C19EG;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C457780HxI;
import X.C723590SZx;
import X.C724240Sb0;
import X.C814420VxA;
import X.C899450ZQh;
import X.EnumC20623015mu;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class ReportTitleBarAssem extends BaseIMTitleBarWithDefaultLeftAssem {
    public final C1559260qg8 LLJJIJI = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());

    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.BaseIMTitleBarWithDefaultLeftAssem
    public final C899450ZQh lp() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_x_mark_small;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        return new C899450ZQh(c419910GdJ, C1383370m6R.LJIIJ(2131828871));
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.BaseIMTitleBarWithDefaultLeftAssem, com.ss.android.ugc.aweme.im.chatroom.common.titlebar.api.BaseIMTitleBarAssem
    public final void hp() {
        super.hp();
        ip(EnumC20623015mu.SLOT_CENTER, new AwS610S0100000_31(this, 204));
        ip(EnumC20623015mu.SLOT_RIGHT, AFwS276S0000000_31.get$arr$(136));
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.BaseIMTitleBarWithDefaultLeftAssem
    public final void mp() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            c19egLIZ.onBackPressed();
        }
    }
}
