package webcast.api.envelope;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.envelope.model.EnvelopeEnigmaInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PortalListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class PortalInfo {

        @C09CT("ddl_second")
        public int ddlSecond;

        @C09CT("envelope_diamonds")
        public int envelopeDiamonds;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public String id;

        @C09CT("portal_diamonds")
        public int portalDiamonds;

        @C09CT("send_at_second")
        public int sendAtSecond;

        @C09CT("sender_avatar")
        public ImageModel senderAvatar;

        @C09CT("sender_display_id")
        public String senderDisplayId;

        @C09CT("sender_enigma_info")
        public EnvelopeEnigmaInfo senderEnigmaInfo;

        @C09CT("sender_id")
        public String senderId;

        @C09CT("touch_count")
        public int touchCount;

        @C09CT("trans_count")
        public int transCount;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.id != null) {
                sb.append(", id=");
                sb.append(this.id);
            }
            sb.append(", send_at_second=");
            sb.append(this.sendAtSecond);
            sb.append(", ddl_second=");
            sb.append(this.ddlSecond);
            sb.append(", envelope_diamonds=");
            sb.append(this.envelopeDiamonds);
            sb.append(", portal_diamonds=");
            sb.append(this.portalDiamonds);
            if (this.senderDisplayId != null) {
                sb.append(", sender_display_id=");
                sb.append(this.senderDisplayId);
            }
            if (this.senderId != null) {
                sb.append(", sender_id=");
                sb.append(this.senderId);
            }
            if (this.senderAvatar != null) {
                sb.append(", sender_avatar=");
                sb.append(this.senderAvatar);
            }
            sb.append(", trans_count=");
            sb.append(this.transCount);
            if (this.senderEnigmaInfo != null) {
                sb.append(", sender_enigma_info=");
                sb.append(this.senderEnigmaInfo);
            }
            sb.replace(0, 2, "PortalInfo{");
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class ResponseData {

        @C09CT("portal")
        public List<PortalInfo> portal;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (!this.portal.isEmpty()) {
                sb.append(", portal=");
                sb.append(this.portal);
            }
            sb.replace(0, 2, "ResponseData{");
            sb.append('}');
            return sb.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "PortalListResponse{");
        sb.append('}');
        return sb.toString();
    }
}
