package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tikcast.linkmic.common.GroupPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class CohostPlatformMessage extends AbstractC1136060ffY {

    @C09CT("action_type")
    public int actionType;

    @C09CT("invite_info")
    public CohostInviteInfo inviteInfo;

    @C09CT("source_type")
    public long sourceType;

    @C09CT("withdraw_info")
    public CohostWithdrawInfo withdrawInfo;

    public static final class CohostInviteInfo {

        @C09CT("anchor_list")
        public List<GroupPlayer> anchorList = new ArrayList();

        @C09CT("invitee_infos")
        public Map<Long, InviteeInfo> inviteeInfos = new LinkedHashMap();

        @C09CT("pop_up_url")
        public String popUpUrl = "";
    }

    public static final class CohostWithdrawInfo {

        @C09CT("anchor_list")
        public List<GroupPlayer> anchorList = new ArrayList();
    }

    public static final class InviteeInfo {

        @C09CT("display_avatar")
        public ImageModel displayAvatar;

        @C09CT("display_name")
        public String displayName = "";

        @C09CT("display_tag")
        public int displayTag;

        @C09CT("user_id")
        public long userId;

        @C09CT("viewer_count")
        public long viewerCount;
    }

    public CohostPlatformMessage() {
        this.type = C001A.COHOST_PLATFORM_MESSAGE;
    }
}
