package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MultiGuestLinkmicInfo {

    @C09CT("host_display_info")
    public HostDisplayInfo hostDisplayInfo;

    @C09CT("request_user_status")
    public int requestUserStatus;

    @C09CT("linked_users")
    public List<ListUser> linkedUsers = new ArrayList();

    @C09CT("fan_ticket_icon_url")
    public String fanTicketIconUrl = "";

    public static final class HostDisplayInfo {

        @C09CT("host_type")
        public long hostType;

        @C09CT("host_icon_background_url")
        public String hostIconBackgroundUrl = "";

        @C09CT("host_icon_url")
        public String hostIconUrl = "";

        @C09CT("host_color")
        public String hostColor = "";

        @C09CT("icon_link_url")
        public String iconLinkUrl = "";
    }

    public static final class ListUser {

        @C09CT("blurred_avatar")
        public ImageModel blurredAvatar;

        @C09CT("fan_ticket")
        public long fanTicket;

        @C09CT("fan_ticket_icon_type")
        public int fanTicketIconType;

        @C09CT("linkmic_id_str")
        public String linkmicIdStr = "";

        @C09CT("modify_time")
        public long modifyTime;

        @C09CT("role_type")
        public int roleType;

        @C09CT("user")
        public User user;
    }
}
