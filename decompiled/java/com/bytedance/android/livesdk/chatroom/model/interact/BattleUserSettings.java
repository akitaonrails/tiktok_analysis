package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class BattleUserSettings {

    @C09CT("accept_not_follower_invite")
    public Boolean acceptNotFollowerInvite;

    @C09CT("allow_gift_to_other_anchors")
    public Boolean allowGiftToOtherAnchors;

    @C09CT("is_turn_on")
    public Boolean isTurnOn;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.isTurnOn != null) {
            sb.append(", is_turn_on=");
            sb.append(this.isTurnOn);
        }
        if (this.acceptNotFollowerInvite != null) {
            sb.append(", accept_not_follower_invite=");
            sb.append(this.acceptNotFollowerInvite);
        }
        if (this.allowGiftToOtherAnchors != null) {
            sb.append(", allow_gift_to_other_anchors=");
            sb.append(this.allowGiftToOtherAnchors);
        }
        sb.replace(0, 2, "BattleUserSettings{");
        sb.append('}');
        return sb.toString();
    }
}
