package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class RivalsParams {

    @C09CT("entrance")
    public int entrance;

    @C09CT("is_official_channel")
    public boolean isOfficialChannel;

    @C09CT("need_async_update")
    public boolean needAsyncUpdate;

    @C09CT("panel_style_version")
    public long panelStyleVersion;

    @C09CT("rivals_type")
    public Long rivalsType;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("section")
    public int section;

    @C09CT("skip_impression")
    public boolean skipImpression;

    @C09CT("top_living_suggest_uid")
    public long topLivingSuggestUid;

    @C09CT("top_viewer_suggested_uid")
    public long topViewerSuggestedUid;

    @C09CT("inviting_user_ids")
    public String invitingUserIds = "";

    @C09CT("offlive_invitation_uids")
    public String offliveInvitationUids = "";

    @C09CT("client_log_id")
    public String clientLogId = "";

    @C09CT("simulator_dimensions")
    public String simulatorDimensions = "";

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.rivalsType != null) {
            sb.append(", rivals_type=");
            sb.append(this.rivalsType);
        }
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        sb.replace(0, 2, "RivalsParams{");
        sb.append('}');
        return sb.toString();
    }
}
