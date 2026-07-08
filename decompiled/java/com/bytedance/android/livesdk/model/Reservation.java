package com.bytedance.android.livesdk.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Reservation {

    @C09CT("anchor_id")
    public Long anchorId;

    @C09CT("appointment_id")
    public Long appointmentId;

    @C09CT("btn_color")
    public String btnColor;

    @C09CT("btn_rect")
    public List<Long> btnRect;

    @C09CT("end_time")
    public Long endTime;

    @C09CT("is_reserved")
    public Boolean isReserved;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("start_time")
    public Long startTime;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.appointmentId != null) {
            sb.append(", appointment_id=");
            sb.append(this.appointmentId);
        }
        if (this.anchorId != null) {
            sb.append(", anchor_id=");
            sb.append(this.anchorId);
        }
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.startTime != null) {
            sb.append(", start_time=");
            sb.append(this.startTime);
        }
        if (this.endTime != null) {
            sb.append(", end_time=");
            sb.append(this.endTime);
        }
        List<Long> list = this.btnRect;
        if (list != null && !list.isEmpty()) {
            sb.append(", btn_rect=");
            sb.append(this.btnRect);
        }
        if (this.btnColor != null) {
            sb.append(", btn_color=");
            sb.append(this.btnColor);
        }
        if (this.isReserved != null) {
            sb.append(", is_reserved=");
            sb.append(this.isReserved);
        }
        sb.replace(0, 2, "Reservation{");
        sb.append('}');
        return sb.toString();
    }
}
