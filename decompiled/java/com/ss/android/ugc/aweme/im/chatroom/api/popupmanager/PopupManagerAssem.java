package com.ss.android.ugc.aweme.im.chatroom.api.popupmanager;

import X.C1558520qew;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;

/* JADX INFO: loaded from: classes3.dex */
public final class PopupManagerAssem extends UIContentAssem implements IMManagePopupAbility {
    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJI(this, ChatRoomScope.class, this, IMManagePopupAbility.class, this, null);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.popupmanager.IMManagePopupAbility
    public final ViewGroup LJIJI() {
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL instanceof ViewGroup) {
            return (ViewGroup) viewLJJIJL;
        }
        return null;
    }
}
