package com.ss.android.ugc.aweme.social.sticker.model;

import X.C09CT;
import X.C20171513wH;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.SocialStickerMetaData;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryCommonStickerModel;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerMobParam;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerModel;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventPrepareData;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventStickerData;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerMapData;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes31.dex */
public final class StorySocialEventPrepareData implements Serializable, Parcelable {
    public WeakReference<Context> context;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("story_event_sticker_data")
    public final StorySocialEventStickerModel enterEditParam;

    @C09CT("story_event_sticker_data_string")
    public String enterEditParamString;
    public String extra;
    public boolean needWindowToast;
    public C20171513wH performanceMetaData;

    @C09CT("sticker_data")
    public StorySocialEventStickerData stickerData;
    public String toUserId;
    public static final Parcelable.Creator<StorySocialEventPrepareData> CREATOR = new Parcelable.Creator<StorySocialEventPrepareData>() { // from class: X.13wQ
        @Override // android.os.Parcelable.Creator
        public final StorySocialEventPrepareData createFromParcel(Parcel parcel) {
            return new StorySocialEventPrepareData(StorySocialEventStickerData.CREATOR.createFromParcel(parcel), parcel.readString(), (StorySocialEventStickerModel) parcel.readParcelable(StorySocialEventPrepareData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StorySocialEventPrepareData[] newArray(int i) {
            return new StorySocialEventPrepareData[i];
        }
    };
    public static final int $stable = 8;

    public StorySocialEventPrepareData() {
        this(new StorySocialEventStickerData(new ArrayList(), new SocialStickerMapData(null, null, null, null), new SocialStickerMetaData(null, null, null, null, null)), UUID.randomUUID().toString(), new StorySocialEventStickerModel(true, 0, new StoryCommonStickerModel(720, 1280, null, "", new ArrayList(), new ArrayList(), false, null), null, null, new StorySocialEventStickerMobParam("", "", "")), "");
    }

    public static /* synthetic */ void getContext$annotations() {
    }

    public static /* synthetic */ void getExtra$annotations() {
    }

    public static /* synthetic */ void getNeedWindowToast$annotations() {
    }

    public static /* synthetic */ void getPerformanceMetaData$annotations() {
    }

    public static /* synthetic */ void getToUserId$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.stickerData.writeToParcel(parcel, i);
        parcel.writeString(this.creationId);
        parcel.writeParcelable(this.enterEditParam, i);
        parcel.writeString(this.enterEditParamString);
    }

    public final WeakReference<Context> getContext() {
        return this.context;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final StorySocialEventStickerModel getEnterEditParam() {
        return this.enterEditParam;
    }

    public final String getEnterEditParamString() {
        return this.enterEditParamString;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final boolean getNeedWindowToast() {
        return this.needWindowToast;
    }

    public final C20171513wH getPerformanceMetaData() {
        return this.performanceMetaData;
    }

    public final StorySocialEventStickerData getStickerData() {
        return this.stickerData;
    }

    public final String getToUserId() {
        return this.toUserId;
    }

    public final void setContext(WeakReference<Context> weakReference) {
        this.context = weakReference;
    }

    public final void setEnterEditParamString(String str) {
        this.enterEditParamString = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setNeedWindowToast(boolean z) {
        this.needWindowToast = z;
    }

    public final void setPerformanceMetaData(C20171513wH c20171513wH) {
        this.performanceMetaData = c20171513wH;
    }

    public final void setStickerData(StorySocialEventStickerData storySocialEventStickerData) {
        this.stickerData = storySocialEventStickerData;
    }

    public final void setToUserId(String str) {
        this.toUserId = str;
    }

    public StorySocialEventPrepareData(StorySocialEventStickerData storySocialEventStickerData, String str, StorySocialEventStickerModel storySocialEventStickerModel, String str2) {
        this.stickerData = storySocialEventStickerData;
        this.creationId = str;
        this.enterEditParam = storySocialEventStickerModel;
        this.enterEditParamString = str2;
    }
}
