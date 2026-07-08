package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C930940aKi;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: loaded from: classes.dex */
public final class LinkCoreModelKt {
    public static final boolean currentUserIsAnchor() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        User owner = room != null ? room.getOwner() : null;
        return owner != null && owner.getId() == UserService.getInstance().user().getCurrentUserId();
    }

    public static final boolean playerIsCurrentUserOrNull(Player player) {
        if (player != null && player.uid != UserService.getInstance().user().getCurrentUserId()) {
            return false;
        }
        return true;
    }
}
