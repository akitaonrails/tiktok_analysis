package webcast.api.envelope;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PortalListRequest {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("room_id")
    public long roomId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", room_id=");
        sb.append(this.roomId);
        sb.append(", anchorId=");
        sb.append(this.anchorId);
        sb.replace(0, 2, "PortalListRequest{");
        sb.append('}');
        return sb.toString();
    }
}
