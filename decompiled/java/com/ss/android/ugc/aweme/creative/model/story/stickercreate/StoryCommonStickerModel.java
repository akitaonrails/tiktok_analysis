package com.ss.android.ugc.aweme.creative.model.story.stickercreate;

import X.C09CT;
import X.C0MY0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.SocialStickerMetaData;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryCommonStickerModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class StoryCommonStickerModel implements Serializable, Parcelable {
    public static final Parcelable.Creator<StoryCommonStickerModel> CREATOR = new Parcelable.Creator<StoryCommonStickerModel>() { // from class: X.0nbt
        @Override // android.os.Parcelable.Creator
        public final StoryCommonStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            SocialStickerMetaData socialStickerMetaData = (SocialStickerMetaData) parcel.readParcelable(StoryCommonStickerModel.class.getClassLoader());
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new StoryCommonStickerModel(i, i2, socialStickerMetaData, string, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoryCommonStickerModel[] newArray(int i) {
            return new StoryCommonStickerModel[i];
        }
    };

    @C09CT("height")
    public int height;

    @C09CT("is_sticker_added")
    public boolean isStickerAdded;

    @C09CT("material_path_ids")
    public List<String> materialPathIds;

    @C09CT("material_paths")
    @C0MY0
    public List<String> materialPaths;

    @C09CT("sticker_metadata")
    public SocialStickerMetaData metadata;

    @C09CT("sticker_json_data")
    public String stickerJsonData;

    @C09CT("sticker_uuid")
    public String stickerUUID;

    @C09CT("width")
    public int width;

    public StoryCommonStickerModel() {
        this(720, 1280, null, "", new ArrayList(), new ArrayList(), false, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeParcelable(this.metadata, i);
        parcel.writeString(this.stickerJsonData);
        parcel.writeStringList(this.materialPaths);
        parcel.writeStringList(this.materialPathIds);
        parcel.writeInt(this.isStickerAdded ? 1 : 0);
        parcel.writeString(this.stickerUUID);
    }

    public final int getHeight() {
        return this.height;
    }

    public final List<String> getMaterialPathIds() {
        return this.materialPathIds;
    }

    public final List<String> getMaterialPaths() {
        return this.materialPaths;
    }

    public final SocialStickerMetaData getMetadata() {
        return this.metadata;
    }

    public final String getStickerJsonData() {
        return this.stickerJsonData;
    }

    public final String getStickerUUID() {
        return this.stickerUUID;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isStickerAdded() {
        return this.isStickerAdded;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setMaterialPathIds(List<String> list) {
        this.materialPathIds = list;
    }

    public final void setMaterialPaths(List<String> list) {
        this.materialPaths = list;
    }

    public final void setMetadata(SocialStickerMetaData socialStickerMetaData) {
        this.metadata = socialStickerMetaData;
    }

    public final void setStickerAdded(boolean z) {
        this.isStickerAdded = z;
    }

    public final void setStickerJsonData(String str) {
        this.stickerJsonData = str;
    }

    public final void setStickerUUID(String str) {
        this.stickerUUID = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public StoryCommonStickerModel(int i, int i2, SocialStickerMetaData socialStickerMetaData, String str, List<String> list, List<String> list2, boolean z, String str2) {
        this.width = i;
        this.height = i2;
        this.metadata = socialStickerMetaData;
        this.stickerJsonData = str;
        this.materialPaths = list;
        this.materialPathIds = list2;
        this.isStickerAdded = z;
        this.stickerUUID = str2;
    }
}
