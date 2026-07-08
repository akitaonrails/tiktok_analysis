package webcast.api.room;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.ProfileCardLabel;
import java.util.ArrayList;
import java.util.List;
import webcast.data.GroupChatInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class GetRoomProfileCardResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class Bio {

        @C09CT("description")
        public String description = "";

        @C09CT("description_translation")
        public String descriptionTranslation = "";
    }

    public static final class ResponseData {

        @C09CT("avatar_frame_explanation")
        public AvatarFrameExplanation avatarFrameExplanation;

        @C09CT("bio")
        public Bio bio;

        @C09CT("bulletin_data")
        public BulletinData bulletinData;

        @C09CT("component_layout_config")
        public ComponentLayoutConfig componentLayoutConfig;

        @C09CT("fest_honors")
        public FestHonors festHonors;

        @C09CT("gift_gallery_entrance")
        public GiftGalleryEntrance giftGalleryEntrance;

        @C09CT("group_chat_info")
        public GroupChatInfo groupChatInfo;

        @C09CT("labels")
        public List<ProfileCardLabel> labels = new ArrayList();

        @C09CT("preload_room_data")
        public PreloadRoomData preloadRoomData;

        @C09CT("privilege_entrance")
        public PrivilegeEntrance privilegeEntrance;

        @C09CT("user")
        public User user;

        @C09CT("verification_info")
        public SMBVerification verificationInfo;
    }
}
