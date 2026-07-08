package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.EnumC1439580nZ6;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.StoryLivePhotoMode;
import com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.creative.model.StoryUploadPageEntranceType;
import com.ss.android.ugc.aweme.edit.RevealStoryCreationModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class StoryShootModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<StoryShootModel> CREATOR = new Parcelable.Creator<StoryShootModel>() { // from class: X.0nXt
        @Override // android.os.Parcelable.Creator
        public final StoryShootModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Integer numValueOf;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            StoryUploadPageEntranceType storyUploadPageEntranceTypeCreateFromParcel;
            boolean z7;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            RevealStoryCreationModel revealStoryCreationModelCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i = parcel.readInt();
            float f = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            StoryNoteInfoModel storyNoteInfoModel = (StoryNoteInfoModel) parcel.readSerializable();
            StoryLivePhotoMode storyLivePhotoModeCreateFromParcel = StoryLivePhotoMode.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() == 0) {
                storyUploadPageEntranceTypeCreateFromParcel = null;
            } else {
                storyUploadPageEntranceTypeCreateFromParcel = StoryUploadPageEntranceType.CREATOR.createFromParcel(parcel);
            }
            StoryUploadPageEntranceType storyUploadPageEntranceType = storyUploadPageEntranceTypeCreateFromParcel;
            String string7 = parcel.readString();
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                revealStoryCreationModelCreateFromParcel = RevealStoryCreationModel.CREATOR.createFromParcel(parcel);
            }
            RevealStoryCreationModel revealStoryCreationModel = revealStoryCreationModelCreateFromParcel;
            String string8 = parcel.readString();
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            return new StoryShootModel(string, string2, string3, z, z2, numValueOf, z3, i, f, z4, string4, z5, string5, string6, storyNoteInfoModel, storyLivePhotoModeCreateFromParcel, z6, storyUploadPageEntranceType, string7, i2, revealStoryCreationModel, string8, z7);
        }

        @Override // android.os.Parcelable.Creator
        public final StoryShootModel[] newArray(int i) {
            return new StoryShootModel[i];
        }
    };

    @C040H
    public String audienceFooterClickWay;

    @C040H
    public boolean enableSwipeUpExitGesture;

    @C040H
    public String exitMethod;

    @C09CT("from_group_id")
    public String fromGroupId;

    @C040H
    public boolean fromPermissionRequestingActivity;

    @C09CT("is_batch_sub")
    public Integer isBatchSub;

    @C040H
    public boolean isClickAudienceFooter;

    @C040H
    public boolean isShootFromSocialAlbum;

    @C09CT("is_social_camera_entrance")
    public boolean isSocialCameraEntrance;

    @C09CT("is_story_entrance")
    public boolean isStoryEntrance;

    @C040H
    public boolean landToOriginPageAfterPublish;

    @C09CT("pipeline_enter_from")
    public String pipelineEnterFrom;

    @C09CT("private_account_allow_reshare_story_type")
    public int privateAccountAllowReshareStoryType;

    @C040H
    public String publishLandTab;

    @C09CT("reveal_camera_mode")
    public String revealCameraMode;

    @C09CT("reveal_story_infos")
    public RevealStoryCreationModel revealStoryInfos;

    @C040H
    public float roundedMaskInitialTranslationY;

    @C040H
    public int sharedElementTransitionMode;

    @C09CT("shoot_enter_position")
    public String shootEnterPosition;

    @C040H
    public String storyArchiveTabName;

    @C040H
    public StoryLivePhotoMode storyLivePhotoMode;

    @C040H
    public StoryNoteInfoModel storyNoteInfoModel;

    @C040H
    public StoryUploadPageEntranceType uploadPageEntranceType;

    public StoryShootModel() {
        this(null, null, null, false, false, null, false, 0, 0.0f, false, null, false, null, "", null, StoryLivePhotoMode.NONE, false, null, null, EnumC1439580nZ6.UNKNOWN.getValue(), null, null, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pipelineEnterFrom);
        parcel.writeString(this.shootEnterPosition);
        parcel.writeString(this.fromGroupId);
        parcel.writeInt(this.isStoryEntrance ? 1 : 0);
        parcel.writeInt(this.isSocialCameraEntrance ? 1 : 0);
        Integer num = this.isBatchSub;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.enableSwipeUpExitGesture ? 1 : 0);
        parcel.writeInt(this.sharedElementTransitionMode);
        parcel.writeFloat(this.roundedMaskInitialTranslationY);
        parcel.writeInt(this.fromPermissionRequestingActivity ? 1 : 0);
        parcel.writeString(this.exitMethod);
        parcel.writeInt(this.isClickAudienceFooter ? 1 : 0);
        parcel.writeString(this.audienceFooterClickWay);
        parcel.writeString(this.publishLandTab);
        parcel.writeSerializable(this.storyNoteInfoModel);
        this.storyLivePhotoMode.writeToParcel(parcel, i);
        parcel.writeInt(this.isShootFromSocialAlbum ? 1 : 0);
        StoryUploadPageEntranceType storyUploadPageEntranceType = this.uploadPageEntranceType;
        if (storyUploadPageEntranceType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storyUploadPageEntranceType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.storyArchiveTabName);
        parcel.writeInt(this.privateAccountAllowReshareStoryType);
        RevealStoryCreationModel revealStoryCreationModel = this.revealStoryInfos;
        if (revealStoryCreationModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            revealStoryCreationModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.revealCameraMode);
        parcel.writeInt(this.landToOriginPageAfterPublish ? 1 : 0);
    }

    public final boolean shouldUseSharedElementTransition() {
        return (this.sharedElementTransitionMode == 0 || this.fromPermissionRequestingActivity) ? false : true;
    }

    public final String getAudienceFooterClickWay() {
        return this.audienceFooterClickWay;
    }

    public final boolean getEnableSwipeUpExitGesture() {
        return this.enableSwipeUpExitGesture;
    }

    public final String getExitMethod() {
        return this.exitMethod;
    }

    public final String getFromGroupId() {
        return this.fromGroupId;
    }

    public final boolean getFromPermissionRequestingActivity() {
        return this.fromPermissionRequestingActivity;
    }

    public final boolean getLandToOriginPageAfterPublish() {
        return this.landToOriginPageAfterPublish;
    }

    public final String getPipelineEnterFrom() {
        return this.pipelineEnterFrom;
    }

    public final int getPrivateAccountAllowReshareStoryType() {
        return this.privateAccountAllowReshareStoryType;
    }

    public final String getPublishLandTab() {
        return this.publishLandTab;
    }

    public final String getRevealCameraMode() {
        return this.revealCameraMode;
    }

    public final RevealStoryCreationModel getRevealStoryInfos() {
        return this.revealStoryInfos;
    }

    public final float getRoundedMaskInitialTranslationY() {
        return this.roundedMaskInitialTranslationY;
    }

    public final int getSharedElementTransitionMode() {
        return this.sharedElementTransitionMode;
    }

    public final String getShootEnterPosition() {
        return this.shootEnterPosition;
    }

    public final String getStoryArchiveTabName() {
        return this.storyArchiveTabName;
    }

    public final StoryLivePhotoMode getStoryLivePhotoMode() {
        return this.storyLivePhotoMode;
    }

    public final StoryNoteInfoModel getStoryNoteInfoModel() {
        return this.storyNoteInfoModel;
    }

    public final StoryUploadPageEntranceType getUploadPageEntranceType() {
        return this.uploadPageEntranceType;
    }

    public final Integer isBatchSub() {
        return this.isBatchSub;
    }

    public final boolean isClickAudienceFooter() {
        return this.isClickAudienceFooter;
    }

    public final boolean isShootFromSocialAlbum() {
        return this.isShootFromSocialAlbum;
    }

    public final boolean isSocialCameraEntrance() {
        return this.isSocialCameraEntrance;
    }

    public final boolean isStoryEntrance() {
        return this.isStoryEntrance;
    }

    public final void setAudienceFooterClickWay(String str) {
        this.audienceFooterClickWay = str;
    }

    public final void setBatchSub(Integer num) {
        this.isBatchSub = num;
    }

    public final void setClickAudienceFooter(boolean z) {
        this.isClickAudienceFooter = z;
    }

    public final void setEnableSwipeUpExitGesture(boolean z) {
        this.enableSwipeUpExitGesture = z;
    }

    public final void setExitMethod(String str) {
        this.exitMethod = str;
    }

    public final void setFromGroupId(String str) {
        this.fromGroupId = str;
    }

    public final void setFromPermissionRequestingActivity(boolean z) {
        this.fromPermissionRequestingActivity = z;
    }

    public final void setLandToOriginPageAfterPublish(boolean z) {
        this.landToOriginPageAfterPublish = z;
    }

    public final void setPipelineEnterFrom(String str) {
        this.pipelineEnterFrom = str;
    }

    public final void setPrivateAccountAllowReshareStoryType(int i) {
        this.privateAccountAllowReshareStoryType = i;
    }

    public final void setPublishLandTab(String str) {
        this.publishLandTab = str;
    }

    public final void setRevealCameraMode(String str) {
        this.revealCameraMode = str;
    }

    public final void setRevealStoryInfos(RevealStoryCreationModel revealStoryCreationModel) {
        this.revealStoryInfos = revealStoryCreationModel;
    }

    public final void setRoundedMaskInitialTranslationY(float f) {
        this.roundedMaskInitialTranslationY = f;
    }

    public final void setSharedElementTransitionMode(int i) {
        this.sharedElementTransitionMode = i;
    }

    public final void setShootEnterPosition(String str) {
        this.shootEnterPosition = str;
    }

    public final void setShootFromSocialAlbum(boolean z) {
        this.isShootFromSocialAlbum = z;
    }

    public final void setSocialCameraEntrance(boolean z) {
        this.isSocialCameraEntrance = z;
    }

    public final void setStoryArchiveTabName(String str) {
        this.storyArchiveTabName = str;
    }

    public final void setStoryEntrance(boolean z) {
        this.isStoryEntrance = z;
    }

    public final void setStoryLivePhotoMode(StoryLivePhotoMode storyLivePhotoMode) {
        this.storyLivePhotoMode = storyLivePhotoMode;
    }

    public final void setStoryNoteInfoModel(StoryNoteInfoModel storyNoteInfoModel) {
        this.storyNoteInfoModel = storyNoteInfoModel;
    }

    public final void setUploadPageEntranceType(StoryUploadPageEntranceType storyUploadPageEntranceType) {
        this.uploadPageEntranceType = storyUploadPageEntranceType;
    }

    public StoryShootModel(String str, String str2, String str3, boolean z, boolean z2, Integer num, boolean z3, int i, float f, boolean z4, String str4, boolean z5, String str5, String str6, StoryNoteInfoModel storyNoteInfoModel, StoryLivePhotoMode storyLivePhotoMode, boolean z6, StoryUploadPageEntranceType storyUploadPageEntranceType, String str7, int i2, RevealStoryCreationModel revealStoryCreationModel, String str8, boolean z7) {
        this.pipelineEnterFrom = str;
        this.shootEnterPosition = str2;
        this.fromGroupId = str3;
        this.isStoryEntrance = z;
        this.isSocialCameraEntrance = z2;
        this.isBatchSub = num;
        this.enableSwipeUpExitGesture = z3;
        this.sharedElementTransitionMode = i;
        this.roundedMaskInitialTranslationY = f;
        this.fromPermissionRequestingActivity = z4;
        this.exitMethod = str4;
        this.isClickAudienceFooter = z5;
        this.audienceFooterClickWay = str5;
        this.publishLandTab = str6;
        this.storyNoteInfoModel = storyNoteInfoModel;
        this.storyLivePhotoMode = storyLivePhotoMode;
        this.isShootFromSocialAlbum = z6;
        this.uploadPageEntranceType = storyUploadPageEntranceType;
        this.storyArchiveTabName = str7;
        this.privateAccountAllowReshareStoryType = i2;
        this.revealStoryInfos = revealStoryCreationModel;
        this.revealCameraMode = str8;
        this.landToOriginPageAfterPublish = z7;
    }
}
