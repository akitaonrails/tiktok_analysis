package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.TemplateTextStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PhotoTemplateInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<PhotoTemplateInfo> CREATOR = new Parcelable.Creator<PhotoTemplateInfo>() { // from class: X.0msk
        @Override // android.os.Parcelable.Creator
        public final PhotoTemplateInfo createFromParcel(Parcel parcel) {
            PhotoTemplateAsset photoTemplateAssetCreateFromParcel;
            SrcImageInfo srcImageInfoCreateFromParcel;
            Float fValueOf;
            boolean z;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                photoTemplateAssetCreateFromParcel = null;
            } else {
                photoTemplateAssetCreateFromParcel = PhotoTemplateAsset.CREATOR.createFromParcel(parcel);
            }
            PhotoTemplateAsset photoTemplateAsset = photoTemplateAssetCreateFromParcel;
            CategoryInfo categoryInfo = (CategoryInfo) parcel.readParcelable(PhotoTemplateInfo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                srcImageInfoCreateFromParcel = null;
            } else {
                srcImageInfoCreateFromParcel = SrcImageInfo.CREATOR.createFromParcel(parcel);
            }
            SrcImageInfo srcImageInfo = srcImageInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(TemplateTextStickerModel.CREATOR.createFromParcel(parcel));
                }
            }
            return new PhotoTemplateInfo(photoTemplateAsset, categoryInfo, srcImageInfo, fValueOf, z, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoTemplateInfo[] newArray(int i) {
            return new PhotoTemplateInfo[i];
        }
    };

    @C09CT("canvas_ratio")
    public Float canvasRatio;

    @C09CT("is_generated_image")
    public boolean isGeneratedImage;

    @C09CT("original_image")
    public final SrcImageInfo originalImage;

    @C09CT("photo_template_asset")
    public final PhotoTemplateAsset photoTemplateAsset;

    @C09CT("photo_template_tab")
    public final CategoryInfo photoTemplateTab;

    @C09CT("template_filter_id")
    public String templateFilterId;

    @C09CT("template_text_stickers")
    public List<TemplateTextStickerModel> templateTextStickers;

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoTemplateInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public final PhotoTemplateInfo copy(PhotoTemplateAsset photoTemplateAsset, CategoryInfo categoryInfo, SrcImageInfo srcImageInfo, Float f, boolean z, List<TemplateTextStickerModel> list, String str) {
        return new PhotoTemplateInfo(photoTemplateAsset, categoryInfo, srcImageInfo, f, z, list, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoTemplateInfo)) {
            return false;
        }
        PhotoTemplateInfo photoTemplateInfo = (PhotoTemplateInfo) obj;
        return Intrinsics.LJFF(this.photoTemplateAsset, photoTemplateInfo.photoTemplateAsset) && Intrinsics.LJFF(this.photoTemplateTab, photoTemplateInfo.photoTemplateTab) && Intrinsics.LJFF(this.originalImage, photoTemplateInfo.originalImage) && Intrinsics.LJFF(this.canvasRatio, photoTemplateInfo.canvasRatio) && this.isGeneratedImage == photoTemplateInfo.isGeneratedImage && Intrinsics.LJFF(this.templateTextStickers, photoTemplateInfo.templateTextStickers) && Intrinsics.LJFF(this.templateFilterId, photoTemplateInfo.templateFilterId);
    }

    public int hashCode() {
        PhotoTemplateAsset photoTemplateAsset = this.photoTemplateAsset;
        int iHashCode = (photoTemplateAsset == null ? 0 : photoTemplateAsset.hashCode()) * 31;
        CategoryInfo categoryInfo = this.photoTemplateTab;
        int iHashCode2 = (iHashCode + (categoryInfo == null ? 0 : categoryInfo.hashCode())) * 31;
        SrcImageInfo srcImageInfo = this.originalImage;
        int iHashCode3 = (iHashCode2 + (srcImageInfo == null ? 0 : srcImageInfo.hashCode())) * 31;
        Float f = this.canvasRatio;
        int iHashCode4 = (((iHashCode3 + (f == null ? 0 : f.hashCode())) * 31) + C786410Ut5.Z2(this.isGeneratedImage)) * 31;
        List<TemplateTextStickerModel> list = this.templateTextStickers;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.templateFilterId;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoTemplateInfo(photoTemplateAsset=");
        sbLIZ.append(this.photoTemplateAsset);
        sbLIZ.append(", photoTemplateTab=");
        sbLIZ.append(this.photoTemplateTab);
        sbLIZ.append(", originalImage=");
        sbLIZ.append(this.originalImage);
        sbLIZ.append(", canvasRatio=");
        sbLIZ.append(this.canvasRatio);
        sbLIZ.append(", isGeneratedImage=");
        sbLIZ.append(this.isGeneratedImage);
        sbLIZ.append(", templateTextStickers=");
        sbLIZ.append(this.templateTextStickers);
        sbLIZ.append(", templateFilterId=");
        sbLIZ.append(this.templateFilterId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PhotoTemplateAsset photoTemplateAsset = this.photoTemplateAsset;
        if (photoTemplateAsset == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photoTemplateAsset.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.photoTemplateTab, i);
        SrcImageInfo srcImageInfo = this.originalImage;
        if (srcImageInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            srcImageInfo.writeToParcel(parcel, i);
        }
        Float f = this.canvasRatio;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeInt(this.isGeneratedImage ? 1 : 0);
        List<TemplateTextStickerModel> list = this.templateTextStickers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<TemplateTextStickerModel> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.templateFilterId);
    }

    public final Float getCanvasRatio() {
        return this.canvasRatio;
    }

    public final SrcImageInfo getOriginalImage() {
        return this.originalImage;
    }

    public final PhotoTemplateAsset getPhotoTemplateAsset() {
        return this.photoTemplateAsset;
    }

    public final CategoryInfo getPhotoTemplateTab() {
        return this.photoTemplateTab;
    }

    public final String getTemplateFilterId() {
        return this.templateFilterId;
    }

    public final List<TemplateTextStickerModel> getTemplateTextStickers() {
        return this.templateTextStickers;
    }

    public final boolean isGeneratedImage() {
        return this.isGeneratedImage;
    }

    public final void setCanvasRatio(Float f) {
        this.canvasRatio = f;
    }

    public final void setGeneratedImage(boolean z) {
        this.isGeneratedImage = z;
    }

    public final void setTemplateFilterId(String str) {
        this.templateFilterId = str;
    }

    public final void setTemplateTextStickers(List<TemplateTextStickerModel> list) {
        this.templateTextStickers = list;
    }

    public PhotoTemplateInfo(PhotoTemplateAsset photoTemplateAsset, CategoryInfo categoryInfo, SrcImageInfo srcImageInfo, Float f, boolean z, List<TemplateTextStickerModel> list, String str) {
        this.photoTemplateAsset = photoTemplateAsset;
        this.photoTemplateTab = categoryInfo;
        this.originalImage = srcImageInfo;
        this.canvasRatio = f;
        this.isGeneratedImage = z;
        this.templateTextStickers = list;
        this.templateFilterId = str;
    }

    public /* synthetic */ PhotoTemplateInfo(PhotoTemplateAsset photoTemplateAsset, CategoryInfo categoryInfo, SrcImageInfo srcImageInfo, Float f, boolean z, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : photoTemplateAsset, (i & 2) != 0 ? null : categoryInfo, (i & 4) != 0 ? null : srcImageInfo, (i & 8) != 0 ? null : f, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : list, (i & 64) == 0 ? str : null);
    }
}
