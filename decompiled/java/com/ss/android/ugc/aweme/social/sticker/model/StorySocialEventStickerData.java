package com.ss.android.ugc.aweme.social.sticker.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.SocialStickerMetaData;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventStickerData;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerMapData;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerResourceMetaData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class StorySocialEventStickerData implements Serializable, Parcelable {

    @C09CT("data")
    public SocialStickerMapData data;

    @C09CT("metadata")
    public SocialStickerMetaData metaData;

    @C09CT("resources")
    public List<SocialStickerResourceMetaData> resources;
    public static final Parcelable.Creator<StorySocialEventStickerData> CREATOR = new Parcelable.Creator<StorySocialEventStickerData>() { // from class: X.13wO
        @Override // android.os.Parcelable.Creator
        public final StorySocialEventStickerData createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readSerializable());
            }
            return new StorySocialEventStickerData(arrayList, (SocialStickerMapData) parcel.readSerializable(), (SocialStickerMetaData) parcel.readParcelable(StorySocialEventStickerData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StorySocialEventStickerData[] newArray(int i) {
            return new StorySocialEventStickerData[i];
        }
    };
    public static final int $stable = 8;

    public StorySocialEventStickerData() {
        this(new ArrayList(), new SocialStickerMapData(null, null, null, null), new SocialStickerMetaData(null, null, null, null, null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<SocialStickerResourceMetaData> list = this.resources;
        parcel.writeInt(list.size());
        Iterator<SocialStickerResourceMetaData> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeSerializable(it2.next());
        }
        parcel.writeSerializable(this.data);
        parcel.writeParcelable(this.metaData, i);
    }

    public final SocialStickerMapData getData() {
        return this.data;
    }

    public final SocialStickerMetaData getMetaData() {
        return this.metaData;
    }

    public final List<SocialStickerResourceMetaData> getResources() {
        return this.resources;
    }

    public final void setData(SocialStickerMapData socialStickerMapData) {
        this.data = socialStickerMapData;
    }

    public final void setMetaData(SocialStickerMetaData socialStickerMetaData) {
        this.metaData = socialStickerMetaData;
    }

    public final void setResources(List<SocialStickerResourceMetaData> list) {
        this.resources = list;
    }

    public StorySocialEventStickerData(List<SocialStickerResourceMetaData> list, SocialStickerMapData socialStickerMapData, SocialStickerMetaData socialStickerMetaData) {
        this.resources = list;
        this.data = socialStickerMapData;
        this.metaData = socialStickerMetaData;
    }
}
