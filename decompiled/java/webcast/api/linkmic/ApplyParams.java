package webcast.api.linkmic;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ApplyParams {

    @C09CT("client_log_id")
    public String clientLogId = "";

    @C09CT("effective_seconds")
    public Long effectiveSeconds;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("source_type")
    public Long sourceType;

    @C09CT("to_room_id")
    public Long toRoomId;

    @C09CT("to_user_id")
    public Long toUserId;

    @C09CT("transparent_extra")
    public String transparentExtra;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.toRoomId != null) {
            sb.append(", to_room_id=");
            sb.append(this.toRoomId);
        }
        if (this.toUserId != null) {
            sb.append(", to_user_id=");
            sb.append(this.toUserId);
        }
        if (this.sourceType != null) {
            sb.append(", source_type=");
            sb.append(this.sourceType);
        }
        if (this.effectiveSeconds != null) {
            sb.append(", effective_seconds=");
            sb.append(this.effectiveSeconds);
        }
        if (this.transparentExtra != null) {
            sb.append(", transparent_extra=");
            sb.append(this.transparentExtra);
        }
        sb.replace(0, 2, "ApplyParams{");
        sb.append('}');
        return sb.toString();
    }
}
