package com.ss.android.ugc.aweme.titlebar.quicktitlebar;

import X.C723850SaN;
import X.EnumC20623015mu;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.BaseQuickTitleBarAssem;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class QuickGroupTitleBarAssem extends BaseQuickTitleBarAssem {
    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.BaseQuickTitleBarAssem
    public final void op() {
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 334));
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.BaseIMTitleBarWithDefaultLeftAssem, com.ss.android.ugc.aweme.im.chatroom.common.titlebar.api.BaseIMTitleBarAssem
    public final void hp() {
        super.hp();
        ip(EnumC20623015mu.SLOT_CENTER, new AwS610S0100000_31(this, 251));
        ip(EnumC20623015mu.SLOT_RIGHT, AFwS276S0000000_31.get$arr$(233));
    }
}
