package com.ss.android.ugc.profile.business.avatar.data;

import X.C09CT;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import com.ss.android.ugc.aweme.profile.model.UserNowPackStruct;
import com.ss.android.ugc.aweme.profile.story.ProfileStoryNote;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class AvatarNormalData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("activity_status")
    public Integer activityStatusSetting;

    @C09CT("user_all_story_metadata")
    public UserAllStoryMetadata allStoryMetadata;

    @C09CT("badge_info")
    public ProfileBadgeStruct profileBadgeStruct;

    @C09CT("room_data")
    public String roomData;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("share_info")
    public ShareInfo shareInfo;

    @C09CT("story_status")
    public Integer storyStatus;

    @C09CT("thought_bubble")
    public ThoughtInfo thoughtBubble;

    @C09CT("story_note_bubble")
    public ProfileStoryNote userLatestStoryNote;

    @C09CT("user_now_pack_info")
    public final UserNowPackStruct userNowPackStruct;

    public final Integer getActivityStatusSetting() {
        return this.activityStatusSetting;
    }

    public final UserAllStoryMetadata getAllStoryMetadata() {
        return this.allStoryMetadata;
    }

    public final ProfileBadgeStruct getProfileBadgeStruct() {
        return this.profileBadgeStruct;
    }

    public final String getRoomData() {
        return this.roomData;
    }

    public final Long getRoomId() {
        return this.roomId;
    }

    public final ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public final Integer getStoryStatus() {
        return this.storyStatus;
    }

    public final ThoughtInfo getThoughtBubble() {
        return this.thoughtBubble;
    }

    public final ProfileStoryNote getUserLatestStoryNote() {
        return this.userLatestStoryNote;
    }

    public final UserNowPackStruct getUserNowPackStruct() {
        return this.userNowPackStruct;
    }

    public final void setActivityStatusSetting(Integer num) {
        this.activityStatusSetting = num;
    }

    public final void setAllStoryMetadata(UserAllStoryMetadata userAllStoryMetadata) {
        this.allStoryMetadata = userAllStoryMetadata;
    }

    public final void setProfileBadgeStruct(ProfileBadgeStruct profileBadgeStruct) {
        this.profileBadgeStruct = profileBadgeStruct;
    }

    public final void setRoomData(String str) {
        this.roomData = str;
    }

    public final void setRoomId(Long l) {
        this.roomId = l;
    }

    public final void setShareInfo(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }

    public final void setStoryStatus(Integer num) {
        this.storyStatus = num;
    }

    public final void setThoughtBubble(ThoughtInfo thoughtInfo) {
        this.thoughtBubble = thoughtInfo;
    }

    public final void setUserLatestStoryNote(ProfileStoryNote profileStoryNote) {
        this.userLatestStoryNote = profileStoryNote;
    }
}
