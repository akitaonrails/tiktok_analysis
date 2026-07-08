package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteConfig;
import com.bytedance.android.livesdk.chatroom.api.NoteDetail;
import com.bytedance.android.livesdk.chatroom.api.SpotlightInfo;
import com.bytedance.android.livesdk.chatroom.api.SubCreatorChatRoomsInfo;
import com.bytedance.android.pgcsdk.subscribe.model.CreatorInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubInfoPopup;
import com.bytedance.android.pgcsdk.subscribe.model.PGCTipsInfo;
import com.bytedance.android.pgcsdk.subscribe.model.SubOnlyPlaylistsBriefInfo;
import com.bytedance.android.pgcsdk.subscribe.model.SubOnlyPostsBriefInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCGetSubPrivilegeDetailV2Response {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("creator_info")
        public CreatorInfo creatorInfo;

        @C09CT("emote_config")
        public EmoteConfig emoteConfig;

        @C09CT("pgc_tips_info")
        public PGCTipsInfo pgcTipsInfo;

        @C09CT("space_info")
        public PrivilegeSubSpaceInfo spaceInfo;

        @C09CT("spotlight_info")
        public SpotlightInfo spotlightInfo;

        @C09CT("sub_creator_chat_rooms_info")
        public SubCreatorChatRoomsInfo subCreatorChatRoomsInfo;

        @C09CT("sub_note_info")
        public SubNoteInfo subNoteInfo;

        @C09CT("sub_only_playlists_brief_info")
        public SubOnlyPlaylistsBriefInfo subOnlyPlaylistsBriefInfo;

        @C09CT("sub_only_posts_brief_info")
        public SubOnlyPostsBriefInfo subOnlyPostsBriefInfo;

        @C09CT("subscription_info")
        public PrivilegeSubscriptionInfo subscriptionInfo;

        @C09CT("perks")
        public List<PerkItem> perks = new ArrayList();

        @C09CT("package_privilege_list")
        public List<PGCSubPackagePrivilege> packagePrivilegeList = new ArrayList();

        @C09CT("template_list")
        public List<PGCTemplateInfo> templateList = new ArrayList();

        @C09CT("popup")
        public List<PGCSubInfoPopup> popup = new ArrayList();

        public static final class SubNoteInfo {

            @C09CT("note_detail")
            public NoteDetail noteDetail;

            @C09CT("show_note_detail")
            public boolean showNoteDetail;
        }
    }
}
