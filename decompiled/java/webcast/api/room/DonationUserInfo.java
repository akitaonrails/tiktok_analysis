package webcast.api.room;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DonationUserInfo {

    @C09CT("end_time")
    public long endTime;

    @C09CT("rooms")
    public List<DonationRoomInfo> rooms = new ArrayList();

    @C09CT("start_time")
    public long startTime;

    @C09CT("user")
    public User user;
}
