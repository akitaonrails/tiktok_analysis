package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ApplyParams {

    @C09CT("anchor_id")
    public Long anchorId;

    @C09CT("guest_supported_layout")
    public Long guestSupportedLayout;

    @C09CT("guest_supported_vendor")
    public Long guestSupportedVendor;

    @C09CT("layout")
    public Long layout;

    @C09CT("link_duration")
    public Long linkDuration;

    @C09CT("link_type")
    public Long linkType;

    @C09CT("payed_money")
    public Long payedMoney;

    @C09CT("position")
    public Long position;

    @C09CT("required_mic_idx")
    public Long requiredMicIdx;

    @C09CT("room_id")
    public Long roomId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.linkType != null) {
            sb.append(", link_type=");
            sb.append(this.linkType);
        }
        if (this.guestSupportedVendor != null) {
            sb.append(", guest_supported_vendor=");
            sb.append(this.guestSupportedVendor);
        }
        if (this.guestSupportedLayout != null) {
            sb.append(", guest_supported_layout=");
            sb.append(this.guestSupportedLayout);
        }
        if (this.payedMoney != null) {
            sb.append(", payed_money=");
            sb.append(this.payedMoney);
        }
        if (this.linkDuration != null) {
            sb.append(", link_duration=");
            sb.append(this.linkDuration);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.layout != null) {
            sb.append(", layout=");
            sb.append(this.layout);
        }
        if (this.anchorId != null) {
            sb.append(", anchor_id=");
            sb.append(this.anchorId);
        }
        if (this.requiredMicIdx != null) {
            sb.append(", required_mic_idx=");
            sb.append(this.requiredMicIdx);
        }
        sb.replace(0, 2, "ApplyParams{");
        sb.append('}');
        return sb.toString();
    }
}
