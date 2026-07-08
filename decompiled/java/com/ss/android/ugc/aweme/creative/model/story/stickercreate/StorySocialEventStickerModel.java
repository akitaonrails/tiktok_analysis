package com.ss.android.ugc.aweme.creative.model.story.stickercreate;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryAnniversaryStickerModel;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryCommonStickerModel;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerMobParam;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerModel;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryStreakModel;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes23.dex */
public final class StorySocialEventStickerModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<StorySocialEventStickerModel> CREATOR = new Parcelable.Creator<StorySocialEventStickerModel>() { // from class: X.0nYm
        @Override // android.os.Parcelable.Creator
        public final StorySocialEventStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            StoryStreakModel storyStreakModelCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i = parcel.readInt();
            StoryCommonStickerModel storyCommonStickerModelCreateFromParcel = StoryCommonStickerModel.CREATOR.createFromParcel(parcel);
            StoryAnniversaryStickerModel storyAnniversaryStickerModelCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                storyStreakModelCreateFromParcel = null;
            } else {
                storyStreakModelCreateFromParcel = StoryStreakModel.CREATOR.createFromParcel(parcel);
            }
            StoryStreakModel storyStreakModel = storyStreakModelCreateFromParcel;
            if (parcel.readInt() != 0) {
                storyAnniversaryStickerModelCreateFromParcel = StoryAnniversaryStickerModel.CREATOR.createFromParcel(parcel);
            }
            return new StorySocialEventStickerModel(z, i, storyCommonStickerModelCreateFromParcel, storyStreakModel, storyAnniversaryStickerModelCreateFromParcel, StorySocialEventStickerMobParam.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StorySocialEventStickerModel[] newArray(int i) {
            return new StorySocialEventStickerModel[i];
        }
    };

    @C09CT("celebration_type")
    public int celebrationType;

    @C09CT("common_sticker_data")
    public StoryCommonStickerModel commonStickerData;

    @C09CT("friend_anniversary_data")
    public StoryAnniversaryStickerModel friendAnniversaryModel;

    @C09CT("is_story_event_sticker_post")
    public boolean isStoryEventStickerPost;

    @C09CT("mob_data")
    public final StorySocialEventStickerMobParam mobData;

    @C09CT("group_chat_streak_data")
    public StoryStreakModel storyStreakModel;

    public StorySocialEventStickerModel() {
        this(false, 0, new StoryCommonStickerModel(720, 1280, null, "", new ArrayList(), new ArrayList(), false, null), null, null, new StorySocialEventStickerMobParam("", "", ""));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isStoryEventStickerPost ? 1 : 0);
        parcel.writeInt(this.celebrationType);
        this.commonStickerData.writeToParcel(parcel, i);
        StoryStreakModel storyStreakModel = this.storyStreakModel;
        if (storyStreakModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storyStreakModel.writeToParcel(parcel, i);
        }
        StoryAnniversaryStickerModel storyAnniversaryStickerModel = this.friendAnniversaryModel;
        if (storyAnniversaryStickerModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storyAnniversaryStickerModel.writeToParcel(parcel, i);
        }
        this.mobData.writeToParcel(parcel, i);
    }

    public final int getCelebrationType() {
        return this.celebrationType;
    }

    public final StoryCommonStickerModel getCommonStickerData() {
        return this.commonStickerData;
    }

    public final StoryAnniversaryStickerModel getFriendAnniversaryModel() {
        return this.friendAnniversaryModel;
    }

    public final StorySocialEventStickerMobParam getMobData() {
        return this.mobData;
    }

    public final StoryStreakModel getStoryStreakModel() {
        return this.storyStreakModel;
    }

    public final boolean isStoryEventStickerPost() {
        return this.isStoryEventStickerPost;
    }

    public final void setCelebrationType(int i) {
        this.celebrationType = i;
    }

    public final void setCommonStickerData(StoryCommonStickerModel storyCommonStickerModel) {
        this.commonStickerData = storyCommonStickerModel;
    }

    public final void setFriendAnniversaryModel(StoryAnniversaryStickerModel storyAnniversaryStickerModel) {
        this.friendAnniversaryModel = storyAnniversaryStickerModel;
    }

    public final void setStoryEventStickerPost(boolean z) {
        this.isStoryEventStickerPost = z;
    }

    public final void setStoryStreakModel(StoryStreakModel storyStreakModel) {
        this.storyStreakModel = storyStreakModel;
    }

    public StorySocialEventStickerModel(boolean z, int i, StoryCommonStickerModel storyCommonStickerModel, StoryStreakModel storyStreakModel, StoryAnniversaryStickerModel storyAnniversaryStickerModel, StorySocialEventStickerMobParam storySocialEventStickerMobParam) {
        this.isStoryEventStickerPost = z;
        this.celebrationType = i;
        this.commonStickerData = storyCommonStickerModel;
        this.storyStreakModel = storyStreakModel;
        this.friendAnniversaryModel = storyAnniversaryStickerModel;
        this.mobData = storySocialEventStickerMobParam;
    }
}
