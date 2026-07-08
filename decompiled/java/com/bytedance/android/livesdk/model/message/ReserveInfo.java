package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ReserveInfo {

    @C09CT("accept_appointment_cnts")
    public long acceptAppointmentCnts;

    @C09CT("display_user_list")
    public List<ReserveUser> displayUserList = new ArrayList();

    @C09CT("is_reservation_sender")
    public boolean isReservationSender;

    @C09CT("reservation_anchor_cnts")
    public long reservationAnchorCnts;

    @C09CT("reservation_id")
    public long reservationId;

    public static final class ReserveUser {

        @C09CT("room_id")
        public long roomId;

        @C09CT("user")
        public User user;
    }
}
