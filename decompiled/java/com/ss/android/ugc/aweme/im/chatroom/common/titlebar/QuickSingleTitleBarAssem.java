package com.ss.android.ugc.aweme.im.chatroom.common.titlebar;

import X.C723850SaN;
import X.EnumC20623015mu;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes32.dex */
public final class QuickSingleTitleBarAssem extends BaseQuickTitleBarAssem {
    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.BaseQuickTitleBarAssem
    public final void op() {
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 212));
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.common.titlebar.BaseIMTitleBarWithDefaultLeftAssem, com.ss.android.ugc.aweme.im.chatroom.common.titlebar.api.BaseIMTitleBarAssem
    public final void hp() {
        super.hp();
        ip(EnumC20623015mu.SLOT_CENTER, AFwS276S0000000_31.get$arr$(134));
        ip(EnumC20623015mu.SLOT_RIGHT, AFwS276S0000000_31.get$arr$(135));
    }
}
