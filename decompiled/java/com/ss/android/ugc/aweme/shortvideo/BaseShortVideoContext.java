package com.ss.android.ugc.aweme.shortvideo;

import X.C579100MnU;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public abstract class BaseShortVideoContext implements Parcelable {
    public int allowDownloadSetting;
    public ArrayList<String> arTextList;
    public String autoCaptionLang;
    public AVETParameter avetParameter;
    public int brandedContentType;
    public List<AVChallenge> challenges;
    public String city;
    public int commentSetting;
    public String commerceData;
    public CutSameEditData cutSameEditData;
    public DraftEditTransferModel draftEditTransferModel;
    public String fromPropId;
    public List<String> geofencingSetting;
    public String globalData;
    public List<String> hashTagTextList;
    public Boolean isCommentDeleted;
    public boolean isDefaultProp;
    public int isPrivate;
    public int mDraftToEditFrom;
    public boolean mIsFromDraft;
    public String mShootFrom;
    public String mShootWay;
    public String mSyncPlatforms;
    public int mVideoLength;
    public String mainBusinessData;
    public List<String> mentionTextList;
    public ArrayList<String> messageBubbleTexts;
    public String playlist_id;
    public String playlist_item_count;
    public String playlist_name;
    public int reactDuetSetting;
    public String socialData;
    public StickerInfo stickerInfo;
    public int stitchSetting;
    public String techData;
    public String ugData;
    public long userClickPublishTime;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String getCreationId();

    public AVETParameter getAvetParameter() {
        if (this.avetParameter == null) {
            this.avetParameter = new AVETParameter();
        }
        return this.avetParameter;
    }

    public String getDraftPrimaryKey() {
        DraftEditTransferModel draftEditTransferModel = this.draftEditTransferModel;
        if (draftEditTransferModel != null) {
            return draftEditTransferModel.getPrimaryKey();
        }
        return null;
    }

    public String getMobileEffectStatus() {
        StickerInfo stickerInfo = this.stickerInfo;
        if (stickerInfo == null) {
            return "";
        }
        String mobileEffectStatus = stickerInfo.getMobileEffectStatus();
        return !TextUtils.isEmpty(mobileEffectStatus) ? mobileEffectStatus : "";
    }

    public String getPropGradeKey() {
        StickerInfo stickerInfo = this.stickerInfo;
        return stickerInfo == null ? "" : stickerInfo.getGradeKey();
    }

    public String getPropSource() {
        StickerInfo stickerInfo = this.stickerInfo;
        return stickerInfo == null ? "" : C579100MnU.LIZ(stickerInfo.getPropSource(), true);
    }

    public boolean useMusicBeatSticker() {
        StickerInfo stickerInfo = this.stickerInfo;
        return stickerInfo != null && stickerInfo.isMusicBeatSticker();
    }

    public BaseShortVideoContext() {
        this.isCommentDeleted = Boolean.FALSE;
        this.mDraftToEditFrom = -1;
        this.brandedContentType = -1;
    }

    public String getMainBusinessData() {
        return this.mainBusinessData;
    }

    public String getShootFrom() {
        return this.mShootFrom;
    }

    public int getVideoLength() {
        return this.mVideoLength;
    }

    public BaseShortVideoContext(Parcel parcel) {
        boolean z;
        this.isCommentDeleted = Boolean.FALSE;
        this.mDraftToEditFrom = -1;
        this.brandedContentType = -1;
        ArrayList arrayList = new ArrayList();
        this.challenges = arrayList;
        parcel.readList(arrayList, AVChallenge.class.getClassLoader());
        this.fromPropId = parcel.readString();
        this.city = parcel.readString();
        this.isPrivate = parcel.readInt();
        this.mVideoLength = parcel.readInt();
        this.mSyncPlatforms = parcel.readString();
        this.mShootWay = parcel.readString();
        this.mShootFrom = parcel.readString();
        this.stickerInfo = (StickerInfo) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mIsFromDraft = z;
        this.isDefaultProp = parcel.readByte() != 0;
        this.brandedContentType = parcel.readInt();
        this.commentSetting = parcel.readInt();
        this.reactDuetSetting = parcel.readInt();
        this.autoCaptionLang = parcel.readString();
        this.geofencingSetting = parcel.createStringArrayList();
        setMainBusinessData(parcel.readString());
        this.socialData = parcel.readString();
        this.commerceData = parcel.readString();
        this.ugData = parcel.readString();
        this.techData = parcel.readString();
        this.globalData = parcel.readString();
        this.avetParameter = (AVETParameter) parcel.readSerializable();
        this.arTextList = parcel.createStringArrayList();
        this.messageBubbleTexts = parcel.createStringArrayList();
        this.draftEditTransferModel = (DraftEditTransferModel) parcel.readParcelable(DraftEditTransferModel.class.getClassLoader());
        this.userClickPublishTime = parcel.readLong();
        this.allowDownloadSetting = parcel.readInt();
        this.cutSameEditData = (CutSameEditData) parcel.readParcelable(CutSameEditData.class.getClassLoader());
        this.stitchSetting = parcel.readInt();
        this.mDraftToEditFrom = parcel.readInt();
        this.playlist_id = parcel.readString();
        this.playlist_item_count = parcel.readString();
        this.playlist_name = parcel.readString();
        this.mentionTextList = parcel.createStringArrayList();
        this.hashTagTextList = parcel.createStringArrayList();
    }

    public void setAvetParameter(AVETParameter aVETParameter) {
        this.avetParameter = aVETParameter;
    }

    public void setMainBusinessData(String str) {
        this.mainBusinessData = str;
    }

    public void setShootFrom(String str) {
        this.mShootFrom = str;
    }

    public void setVideoLength(int i) {
        this.mVideoLength = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.challenges);
        parcel.writeString(this.fromPropId);
        parcel.writeString(this.city);
        parcel.writeInt(this.isPrivate);
        parcel.writeInt(this.mVideoLength);
        parcel.writeString(this.mSyncPlatforms);
        parcel.writeString(this.mShootWay);
        parcel.writeString(this.mShootFrom);
        parcel.writeSerializable(this.stickerInfo);
        parcel.writeByte(this.mIsFromDraft ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDefaultProp ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.brandedContentType);
        parcel.writeInt(this.commentSetting);
        parcel.writeInt(this.reactDuetSetting);
        parcel.writeString(this.autoCaptionLang);
        parcel.writeStringList(this.geofencingSetting);
        parcel.writeString(getMainBusinessData());
        parcel.writeString(this.socialData);
        parcel.writeString(this.commerceData);
        parcel.writeString(this.ugData);
        parcel.writeString(this.techData);
        parcel.writeString(this.globalData);
        parcel.writeSerializable(this.avetParameter);
        parcel.writeStringList(this.arTextList);
        parcel.writeStringList(this.messageBubbleTexts);
        parcel.writeParcelable(this.draftEditTransferModel, i);
        parcel.writeLong(this.userClickPublishTime);
        parcel.writeInt(this.allowDownloadSetting);
        parcel.writeParcelable(this.cutSameEditData, i);
        parcel.writeInt(this.stitchSetting);
        parcel.writeInt(this.mDraftToEditFrom);
        parcel.writeString(this.playlist_id);
        parcel.writeString(this.playlist_name);
        parcel.writeString(this.playlist_item_count);
        parcel.writeStringList(this.mentionTextList);
        parcel.writeStringList(this.hashTagTextList);
    }
}
