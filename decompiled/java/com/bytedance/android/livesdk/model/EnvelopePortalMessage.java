package com.bytedance.android.livesdk.model;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.envelope.model.EnvelopeEnigmaInfo;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class EnvelopePortalMessage extends AbstractC1136060ffY {
    public boolean LL = true;

    @C09CT("portal_display")
    public int portalDisplay;

    @C09CT("portal_info")
    public PortalInfo portalInfo;

    @C09CT("portal_trans_target")
    public PortalTransTarget portalTransTarget;

    @C09CT("portal_view")
    public int portalView;

    public static final class PortalInfo {

        @C09CT("ddl_second")
        public int ddlSecond;

        @C09CT("envelope_diamonds")
        public int envelopeDiamonds;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public String id;

        @C09CT("idc")
        public String idc;

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
            if (this.idc != null) {
                sb.append(", idc=");
                sb.append(this.idc);
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

    public static final class PortalTransTarget {

        @C09CT("anchor_avatar")
        public ImageModel anchorAvatar;

        @C09CT("anchor_display_id")
        public String anchorDisplayId;

        @C09CT("anchor_id")
        public String anchorId;

        @C09CT("envelope_diamonds")
        public int envelopeDiamonds;

        @C09CT("room_id")
        public String roomId;

        @C09CT("send_room_cover")
        public ImageModel sendRoomCover;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.roomId != null) {
                sb.append(", room_id=");
                sb.append(this.roomId);
            }
            if (this.sendRoomCover != null) {
                sb.append(", send_room_cover=");
                sb.append(this.sendRoomCover);
            }
            if (this.anchorDisplayId != null) {
                sb.append(", anchor_display_id=");
                sb.append(this.anchorDisplayId);
            }
            if (this.anchorId != null) {
                sb.append(", anchor_id=");
                sb.append(this.anchorId);
            }
            if (this.anchorAvatar != null) {
                sb.append(", anchor_avatar=");
                sb.append(this.anchorAvatar);
            }
            sb.append(", envelope_diamonds=");
            sb.append(this.envelopeDiamonds);
            sb.replace(0, 2, "PortalTransTarget{");
            sb.append('}');
            return sb.toString();
        }
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.portalInfo != null) {
            sb.append(", portal_info=");
            sb.append(this.portalInfo);
        }
        if (this.portalTransTarget != null) {
            sb.append(", portal_trans_target=");
            sb.append(this.portalTransTarget);
        }
        sb.append(", portal_view=");
        sb.append(this.portalView);
        sb.append(", portal_display=");
        sb.append(this.portalDisplay);
        sb.replace(0, 2, "EnvelopePortalMessage{");
        sb.append('}');
        return sb.toString();
    }

    public EnvelopePortalMessage() {
        this.type = C001A.ENVELOPE_PORTAL_MESSAGE;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        return this.LL;
    }
}
