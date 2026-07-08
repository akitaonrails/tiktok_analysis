package com.ss.android.ugc.aweme.group;

import android.content.Intent;
import com.ss.android.ugc.aweme.GroupChatProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupChatProtocolImpl implements GroupChatProtocol {
    public final GroupChatVM LL;

    public GroupChatProtocolImpl(GroupChatVM groupChatVM) {
        this.LL = groupChatVM;
    }

    @Override // com.ss.android.ugc.aweme.GroupChatProtocol
    public final void onActivityResult(int i, int i2, Intent intent) {
        GroupChatVM groupChatVM = this.LL;
        groupChatVM.getClass();
        if (i == 16 && i2 == 2097) {
            groupChatVM.setState(AFwS229S0000000_2.get$arr$(807));
        }
    }
}
