package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteConfig;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.Badge;
import com.bytedance.android.livesdk.chatroom.api.BenefitView;
import com.bytedance.android.livesdk.chatroom.api.CommunityDetail;
import com.bytedance.android.livesdk.chatroom.api.NoteDetail;
import com.bytedance.android.livesdk.chatroom.api.SpotlightInfo;
import com.bytedance.android.livesdk.chatroom.api.SubCustomizedBenefit;
import com.bytedance.android.livesdk.chatroom.api.SubLevel;
import com.bytedance.android.livesdk.model.Gift;
import emotes.model.EmoteListResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class GetSubH5SharePageResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_detail")
        public User anchorDetail;

        @C09CT("badge")
        public Badge badge;

        @C09CT("community_detail")
        public CommunityDetail communityDetail;

        @C09CT("emote_config")
        public EmoteConfig emoteConfig;

        @C09CT("emote_detail")
        public EmoteListResult emoteDetail;

        @C09CT("show_customized_benefit")
        public boolean showCustomizedBenefit;

        @C09CT("spotlight_info")
        public SpotlightInfo spotlightInfo;

        @C09CT("sub_note_info")
        public SubNoteInfo subNoteInfo;

        @C09CT("sub_scenario")
        public int subScenario;

        @C09CT("subscribe_permission")
        public SubscribePermission subscribePermission;

        @C09CT("subscriber_count")
        public int subscriberCount;

        @C09CT("gift_detail")
        public List<Gift> giftDetail = new ArrayList();

        @C09CT("all_levels")
        public List<SubLevel> allLevels = new ArrayList();

        @C09CT("customized_benefits")
        public List<SubCustomizedBenefit> customizedBenefits = new ArrayList();

        @C09CT("benefits")
        public List<BenefitView> benefits = new ArrayList();

        public static final class SubNoteInfo {

            @C09CT("note_detail")
            public NoteDetail noteDetail;

            @C09CT("show_note_detail")
            public boolean showNoteDetail;
        }

        public static final class SubscribePermission {

            @C09CT("can_subscribe")
            public boolean canSubscribe;

            @C09CT("forbidden_toast")
            public String forbiddenToast = "";
        }
    }
}
