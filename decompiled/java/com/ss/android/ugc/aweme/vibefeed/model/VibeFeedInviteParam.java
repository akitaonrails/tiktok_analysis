package com.ss.android.ugc.aweme.vibefeed.model;

import X.C1575360r66;
import X.C2188811AlT;
import X.EnumC1575230r5t;
import X.EnumC1575330r63;
import X.EnumC912680ZrG;
import X.InterfaceC111300bX;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class VibeFeedInviteParam implements InterfaceC111300bX {
    public static final C1575360r66 Companion = new Object() { // from class: X.0r66
    };
    public final String conversationId;
    public final String entranceType;
    public final String feedId;
    public final EnumC912680ZrG mutualFeedScene;
    public final EnumC1575330r63 panelType;
    public final EnumC1575230r5t state;
    public final String toUserId;

    public final VibeFeedInviteParam copy(String str, String str2, String str3, EnumC1575330r63 enumC1575330r63, EnumC1575230r5t enumC1575230r5t, String str4, EnumC912680ZrG enumC912680ZrG) {
        return new VibeFeedInviteParam(str, str2, str3, enumC1575330r63, enumC1575230r5t, str4, enumC912680ZrG);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VibeFeedInviteParam)) {
            return false;
        }
        VibeFeedInviteParam vibeFeedInviteParam = (VibeFeedInviteParam) obj;
        return Intrinsics.LJFF(this.conversationId, vibeFeedInviteParam.conversationId) && Intrinsics.LJFF(this.toUserId, vibeFeedInviteParam.toUserId) && Intrinsics.LJFF(this.entranceType, vibeFeedInviteParam.entranceType) && this.panelType == vibeFeedInviteParam.panelType && this.state == vibeFeedInviteParam.state && Intrinsics.LJFF(this.feedId, vibeFeedInviteParam.feedId) && this.mutualFeedScene == vibeFeedInviteParam.mutualFeedScene;
    }

    public int hashCode() {
        return (((((((((((this.conversationId.hashCode() * 31) + this.toUserId.hashCode()) * 31) + this.entranceType.hashCode()) * 31) + this.panelType.hashCode()) * 31) + this.state.hashCode()) * 31) + this.feedId.hashCode()) * 31) + this.mutualFeedScene.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeFeedInviteParam(conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", toUserId=");
        sbLIZ.append(this.toUserId);
        sbLIZ.append(", entranceType=");
        sbLIZ.append(this.entranceType);
        sbLIZ.append(", panelType=");
        sbLIZ.append(this.panelType);
        sbLIZ.append(", state=");
        sbLIZ.append(this.state);
        sbLIZ.append(", feedId=");
        sbLIZ.append(this.feedId);
        sbLIZ.append(", mutualFeedScene=");
        sbLIZ.append(this.mutualFeedScene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VibeFeedInviteParam() {
        this("", "", "", EnumC1575330r63.INVITE, EnumC1575230r5t.UNKNOWN, "", EnumC912680ZrG.MUTUAL_FEED_SCENE_PRIVATE);
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getEntranceType() {
        return this.entranceType;
    }

    public final String getFeedId() {
        return this.feedId;
    }

    public final EnumC912680ZrG getMutualFeedScene() {
        return this.mutualFeedScene;
    }

    public final EnumC1575330r63 getPanelType() {
        return this.panelType;
    }

    public final EnumC1575230r5t getState() {
        return this.state;
    }

    public final String getToUserId() {
        return this.toUserId;
    }

    public VibeFeedInviteParam(String str, String str2, String str3, EnumC1575330r63 enumC1575330r63, EnumC1575230r5t enumC1575230r5t, String str4, EnumC912680ZrG enumC912680ZrG) {
        this.conversationId = str;
        this.toUserId = str2;
        this.entranceType = str3;
        this.panelType = enumC1575330r63;
        this.state = enumC1575230r5t;
        this.feedId = str4;
        this.mutualFeedScene = enumC912680ZrG;
    }
}
