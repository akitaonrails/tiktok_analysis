package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.creative.model.forward.OnThisDayPostData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class OnThisDayData implements Parcelable, Serializable {
    public static final Parcelable.Creator<OnThisDayData> CREATOR = new Parcelable.Creator<OnThisDayData>() { // from class: X.0L3X
        @Override // android.os.Parcelable.Creator
        public final OnThisDayData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            ArrayList arrayList;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            Boolean boolValueOf;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string = parcel.readString();
            long j = parcel.readLong();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(Integer.valueOf(parcel.readInt()));
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i5 = parcel.readInt();
            String string2 = parcel.readString();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i9 = parcel.readInt();
                arrayList = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList.add(OnThisDayPostData.CREATOR.createFromParcel(parcel));
                }
            }
            int i11 = parcel.readInt();
            long j2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int i12 = parcel.readInt();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolValueOf = Boolean.valueOf(z7);
            }
            return new OnThisDayData(z, i, i2, string, j, arrayList2, z2, i5, string2, i6, i7, i8, arrayList, i11, j2, z3, z4, z5, i12, arrayListCreateStringArrayList, z6, boolValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnThisDayData[] newArray(int i) {
            return new OnThisDayData[i];
        }
    };

    @C09CT("celebration_type")
    public int celebrationType;

    @C040H
    public long clickNextButtonTime;

    @C09CT("create_time")
    public long createTime;

    @C040H
    public transient int curselectMediaPos;

    @C09CT("disable_auto_select_music_in_editing")
    public Boolean disableAutoSelectMusicInEditing;

    @C09CT("enter_method")
    public String enterMethod;

    @C09CT("enter_type")
    public String enterType;

    @C09CT("forwardType")
    public int forwardType;

    @C09CT("is_from_on_this_forward")
    public boolean isFromOnThisDay;

    @C040H
    public transient boolean isInOnThisDayPreviewPage;

    @C09CT("is_publish_normal")
    public boolean isPublishNormalFromOnThisDayPage;

    @C09CT("is_publish_story")
    public boolean isPublishStoryFromOnThisDayPage;

    @C09CT("left_way")
    public String leftWay;

    @C09CT("loaded_sticker_page")
    public List<Integer> loadedIndexList;

    @C09CT("loaded_sticker")
    public boolean loadedSticker;

    @C09CT("local_cnt")
    public int localCnt;

    @C09CT("local_media_mime_type")
    public ArrayList<String> localMediaMimeType;

    @C040H
    public boolean moveMusicToTop;

    @C040H
    public transient String musicSelectedFromV2;

    @C09CT("need_adjust_stickers")
    public boolean needAdjustStickers;

    @C09CT("past_memory_key")
    public String pastMemoryKey;

    @C09CT("post_cnt")
    public int postCnt;

    @C09CT("post_data_list")
    public ArrayList<OnThisDayPostData> postDataList;

    @C040H
    public transient boolean shouldSkipMusicEnd;

    @C09CT("story_cnt")
    public int storyCnt;

    @C09CT("text_style")
    public int textStyle;

    @C09CT("version")
    public int version;

    @C09CT("viewedVideo")
    public int viewedVideo;

    public OnThisDayData() {
        this(false, 0, 0, "", 0L, new ArrayList(), false, 0, "", 0, 0, 0, null, 0, 0L, true, false, false, 0, null, false, Boolean.FALSE, null, null);
    }

    public final OnThisDayData copy(boolean z, int i, int i2, String str, long j, List<Integer> list, boolean z2, int i3, String str2, int i4, int i5, int i6, ArrayList<OnThisDayPostData> arrayList, int i7, long j2, boolean z3, boolean z4, boolean z5, int i8, ArrayList<String> arrayList2, boolean z6, Boolean bool, String str3, String str4) {
        return new OnThisDayData(z, i, i2, str, j, list, z2, i3, str2, i4, i5, i6, arrayList, i7, j2, z3, z4, z5, i8, arrayList2, z6, bool, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnThisDayData)) {
            return false;
        }
        OnThisDayData onThisDayData = (OnThisDayData) obj;
        return this.isFromOnThisDay == onThisDayData.isFromOnThisDay && this.viewedVideo == onThisDayData.viewedVideo && this.forwardType == onThisDayData.forwardType && Intrinsics.LJFF(this.pastMemoryKey, onThisDayData.pastMemoryKey) && this.createTime == onThisDayData.createTime && Intrinsics.LJFF(this.loadedIndexList, onThisDayData.loadedIndexList) && this.loadedSticker == onThisDayData.loadedSticker && this.version == onThisDayData.version && Intrinsics.LJFF(this.leftWay, onThisDayData.leftWay) && this.postCnt == onThisDayData.postCnt && this.storyCnt == onThisDayData.storyCnt && this.textStyle == onThisDayData.textStyle && Intrinsics.LJFF(this.postDataList, onThisDayData.postDataList) && this.celebrationType == onThisDayData.celebrationType && this.clickNextButtonTime == onThisDayData.clickNextButtonTime && this.needAdjustStickers == onThisDayData.needAdjustStickers && this.isPublishNormalFromOnThisDayPage == onThisDayData.isPublishNormalFromOnThisDayPage && this.isPublishStoryFromOnThisDayPage == onThisDayData.isPublishStoryFromOnThisDayPage && this.localCnt == onThisDayData.localCnt && Intrinsics.LJFF(this.localMediaMimeType, onThisDayData.localMediaMimeType) && this.moveMusicToTop == onThisDayData.moveMusicToTop && Intrinsics.LJFF(this.disableAutoSelectMusicInEditing, onThisDayData.disableAutoSelectMusicInEditing) && Intrinsics.LJFF(this.enterMethod, onThisDayData.enterMethod) && Intrinsics.LJFF(this.enterType, onThisDayData.enterType);
    }

    public int hashCode() {
        int iZ2 = ((((((((((((((((((((((C786410Ut5.Z2(this.isFromOnThisDay) * 31) + this.viewedVideo) * 31) + this.forwardType) * 31) + this.pastMemoryKey.hashCode()) * 31) + C786410Ut5.Y2(this.createTime)) * 31) + this.loadedIndexList.hashCode()) * 31) + C786410Ut5.Z2(this.loadedSticker)) * 31) + this.version) * 31) + this.leftWay.hashCode()) * 31) + this.postCnt) * 31) + this.storyCnt) * 31) + this.textStyle) * 31;
        ArrayList<OnThisDayPostData> arrayList = this.postDataList;
        int iHashCode = (((((((((((((iZ2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + this.celebrationType) * 31) + C786410Ut5.Y2(this.clickNextButtonTime)) * 31) + C786410Ut5.Z2(this.needAdjustStickers)) * 31) + C786410Ut5.Z2(this.isPublishNormalFromOnThisDayPage)) * 31) + C786410Ut5.Z2(this.isPublishStoryFromOnThisDayPage)) * 31) + this.localCnt) * 31;
        ArrayList<String> arrayList2 = this.localMediaMimeType;
        int iHashCode2 = (((iHashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31) + C786410Ut5.Z2(this.moveMusicToTop)) * 31;
        Boolean bool = this.disableAutoSelectMusicInEditing;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.enterMethod;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.enterType;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "OnThisDayData(isFromOnThisDay=" + this.isFromOnThisDay + ", viewedVideo=" + this.viewedVideo + ", forwardType=" + this.forwardType + ", pastMemoryKey=" + this.pastMemoryKey + ", createTime=" + this.createTime + ", loadedIndexList=" + this.loadedIndexList + ", loadedSticker=" + this.loadedSticker + ", version=" + this.version + ", leftWay=" + this.leftWay + ", postCnt=" + this.postCnt + ", storyCnt=" + this.storyCnt + ", textStyle=" + this.textStyle + ", postDataList=" + this.postDataList + ", celebrationType=" + this.celebrationType + ", clickNextButtonTime=" + this.clickNextButtonTime + ", needAdjustStickers=" + this.needAdjustStickers + ", isPublishNormalFromOnThisDayPage=" + this.isPublishNormalFromOnThisDayPage + ", isPublishStoryFromOnThisDayPage=" + this.isPublishStoryFromOnThisDayPage + ", localCnt=" + this.localCnt + ", localMediaMimeType=" + this.localMediaMimeType + ", moveMusicToTop=" + this.moveMusicToTop + ", disableAutoSelectMusicInEditing=" + this.disableAutoSelectMusicInEditing + ", enterMethod=" + this.enterMethod + ", enterType=" + this.enterType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isFromOnThisDay ? 1 : 0);
        parcel.writeInt(this.viewedVideo);
        parcel.writeInt(this.forwardType);
        parcel.writeString(this.pastMemoryKey);
        parcel.writeLong(this.createTime);
        List<Integer> list = this.loadedIndexList;
        parcel.writeInt(list.size());
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
        parcel.writeInt(this.loadedSticker ? 1 : 0);
        parcel.writeInt(this.version);
        parcel.writeString(this.leftWay);
        parcel.writeInt(this.postCnt);
        parcel.writeInt(this.storyCnt);
        parcel.writeInt(this.textStyle);
        ArrayList<OnThisDayPostData> arrayList = this.postDataList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<OnThisDayPostData> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.celebrationType);
        parcel.writeLong(this.clickNextButtonTime);
        parcel.writeInt(this.needAdjustStickers ? 1 : 0);
        parcel.writeInt(this.isPublishNormalFromOnThisDayPage ? 1 : 0);
        parcel.writeInt(this.isPublishStoryFromOnThisDayPage ? 1 : 0);
        parcel.writeInt(this.localCnt);
        parcel.writeStringList(this.localMediaMimeType);
        parcel.writeInt(this.moveMusicToTop ? 1 : 0);
        Boolean bool = this.disableAutoSelectMusicInEditing;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.enterType);
    }

    public final int getCelebrationType() {
        return this.celebrationType;
    }

    public final long getClickNextButtonTime() {
        return this.clickNextButtonTime;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getCurselectMediaPos() {
        return this.curselectMediaPos;
    }

    public final Boolean getDisableAutoSelectMusicInEditing() {
        return this.disableAutoSelectMusicInEditing;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getEnterType() {
        return this.enterType;
    }

    public final int getForwardType() {
        return this.forwardType;
    }

    public final String getLeftWay() {
        return this.leftWay;
    }

    public final List<Integer> getLoadedIndexList() {
        return this.loadedIndexList;
    }

    public final boolean getLoadedSticker() {
        return this.loadedSticker;
    }

    public final int getLocalCnt() {
        return this.localCnt;
    }

    public final ArrayList<String> getLocalMediaMimeType() {
        return this.localMediaMimeType;
    }

    public final boolean getMoveMusicToTop() {
        return this.moveMusicToTop;
    }

    public final String getMusicSelectedFromV2() {
        return this.musicSelectedFromV2;
    }

    public final boolean getNeedAdjustStickers() {
        return this.needAdjustStickers;
    }

    public final String getPastMemoryKey() {
        return this.pastMemoryKey;
    }

    public final int getPostCnt() {
        return this.postCnt;
    }

    public final ArrayList<OnThisDayPostData> getPostDataList() {
        return this.postDataList;
    }

    public final boolean getShouldSkipMusicEnd() {
        return this.shouldSkipMusicEnd;
    }

    public final int getStoryCnt() {
        return this.storyCnt;
    }

    public final int getTextStyle() {
        return this.textStyle;
    }

    public final int getVersion() {
        return this.version;
    }

    public final int getViewedVideo() {
        return this.viewedVideo;
    }

    public final boolean isFromOnThisDay() {
        return this.isFromOnThisDay;
    }

    public final boolean isInOnThisDayPreviewPage() {
        return this.isInOnThisDayPreviewPage;
    }

    public final boolean isPublishNormalFromOnThisDayPage() {
        return this.isPublishNormalFromOnThisDayPage;
    }

    public final boolean isPublishStoryFromOnThisDayPage() {
        return this.isPublishStoryFromOnThisDayPage;
    }

    public final void setCelebrationType(int i) {
        this.celebrationType = i;
    }

    public final void setClickNextButtonTime(long j) {
        this.clickNextButtonTime = j;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setCurselectMediaPos(int i) {
        this.curselectMediaPos = i;
    }

    public final void setDisableAutoSelectMusicInEditing(Boolean bool) {
        this.disableAutoSelectMusicInEditing = bool;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setEnterType(String str) {
        this.enterType = str;
    }

    public final void setForwardType(int i) {
        this.forwardType = i;
    }

    public final void setFromOnThisDay(boolean z) {
        this.isFromOnThisDay = z;
    }

    public final void setInOnThisDayPreviewPage(boolean z) {
        this.isInOnThisDayPreviewPage = z;
    }

    public final void setLeftWay(String str) {
        this.leftWay = str;
    }

    public final void setLoadedIndexList(List<Integer> list) {
        this.loadedIndexList = list;
    }

    public final void setLoadedSticker(boolean z) {
        this.loadedSticker = z;
    }

    public final void setLocalCnt(int i) {
        this.localCnt = i;
    }

    public final void setLocalMediaMimeType(ArrayList<String> arrayList) {
        this.localMediaMimeType = arrayList;
    }

    public final void setMoveMusicToTop(boolean z) {
        this.moveMusicToTop = z;
    }

    public final void setMusicSelectedFromV2(String str) {
        this.musicSelectedFromV2 = str;
    }

    public final void setNeedAdjustStickers(boolean z) {
        this.needAdjustStickers = z;
    }

    public final void setPastMemoryKey(String str) {
        this.pastMemoryKey = str;
    }

    public final void setPostCnt(int i) {
        this.postCnt = i;
    }

    public final void setPostDataList(ArrayList<OnThisDayPostData> arrayList) {
        this.postDataList = arrayList;
    }

    public final void setPublishNormalFromOnThisDayPage(boolean z) {
        this.isPublishNormalFromOnThisDayPage = z;
    }

    public final void setPublishStoryFromOnThisDayPage(boolean z) {
        this.isPublishStoryFromOnThisDayPage = z;
    }

    public final void setShouldSkipMusicEnd(boolean z) {
        this.shouldSkipMusicEnd = z;
    }

    public final void setStoryCnt(int i) {
        this.storyCnt = i;
    }

    public final void setTextStyle(int i) {
        this.textStyle = i;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setViewedVideo(int i) {
        this.viewedVideo = i;
    }

    public OnThisDayData(boolean z, int i, int i2, String str, long j, List<Integer> list, boolean z2, int i3, String str2, int i4, int i5, int i6, ArrayList<OnThisDayPostData> arrayList, int i7, long j2, boolean z3, boolean z4, boolean z5, int i8, ArrayList<String> arrayList2, boolean z6, Boolean bool, String str3, String str4) {
        this.isFromOnThisDay = z;
        this.viewedVideo = i;
        this.forwardType = i2;
        this.pastMemoryKey = str;
        this.createTime = j;
        this.loadedIndexList = list;
        this.loadedSticker = z2;
        this.version = i3;
        this.leftWay = str2;
        this.postCnt = i4;
        this.storyCnt = i5;
        this.textStyle = i6;
        this.postDataList = arrayList;
        this.celebrationType = i7;
        this.clickNextButtonTime = j2;
        this.needAdjustStickers = z3;
        this.isPublishNormalFromOnThisDayPage = z4;
        this.isPublishStoryFromOnThisDayPage = z5;
        this.localCnt = i8;
        this.localMediaMimeType = arrayList2;
        this.moveMusicToTop = z6;
        this.disableAutoSelectMusicInEditing = bool;
        this.enterMethod = str3;
        this.enterType = str4;
        this.musicSelectedFromV2 = "";
    }
}
