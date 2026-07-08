package webcast.api.linkmic;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LeaveParams {

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("not_suggest_to_uid")
    public Long notSuggestToUid;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("transparent_extra")
    public String transparentExtra;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.channelId != null) {
            sb.append(", channel_id=");
            sb.append(this.channelId);
        }
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.notSuggestToUid != null) {
            sb.append(", not_suggest_to_uid=");
            sb.append(this.notSuggestToUid);
        }
        if (this.transparentExtra != null) {
            sb.append(", transparent_extra=");
            sb.append(this.transparentExtra);
        }
        sb.replace(0, 2, "LeaveParams{");
        sb.append('}');
        return sb.toString();
    }
}
