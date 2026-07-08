package com.ss.android.ugc.aweme.editSticker.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.CoverPreviewInfo;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.UploadCustomizeCoverInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes23.dex */
public final class CoverPublishModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CoverPublishModel> CREATOR = new Parcelable.Creator<CoverPublishModel>() { // from class: X.0nNi
        @Override // android.os.Parcelable.Creator
        public final CoverPublishModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            EffectTextModel effectTextModel = (EffectTextModel) parcel.readParcelable(CoverPublishModel.class.getClassLoader());
            float f = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(Float.valueOf(parcel.readFloat()));
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new CoverPublishModel(effectTextModel, f, z, i, arrayList, string, z2, UploadCustomizeCoverInfo.CREATOR.createFromParcel(parcel), (CopyOnWriteArrayList) parcel.readSerializable(), CoverPreviewInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CoverPublishModel[] newArray(int i) {
            return new CoverPublishModel[i];
        }
    };

    @C09CT("select_cover_from_local_path")
    public String coverFromLocalPath;

    @C09CT("cover_info")
    public UploadCustomizeCoverInfo coverInfo;

    @C09CT("cover_preview_info")
    public CoverPreviewInfo coverPreviewInfo;

    @C09CT("effect_text_model")
    public final EffectTextModel effectTextModel;

    @C09CT("image_current_index")
    public int imageCurrentIndex;

    @C09CT("is_cover_from_url")
    public boolean isCoverFromUrl;

    @C09CT("need_expand_compiled_size")
    public boolean needExpandCompiledSize;

    @C09CT("cover_new_path_list")
    public CopyOnWriteArrayList<CoverNewItem> newCoverList;

    @C09CT("preview_matrix")
    public List<Float> previewMatrix;

    @C09CT("video_cover_view_x")
    public float videoCoverViewX;

    public CoverPublishModel() {
        this(new EffectTextModel(false, null, null, null, null), -1.0f, false, 0, new ArrayList(), "", false, new UploadCustomizeCoverInfo(0, "", 0, 0, 0.0d, 0), new CopyOnWriteArrayList(), new CoverPreviewInfo(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0, 0));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.effectTextModel, i);
        parcel.writeFloat(this.videoCoverViewX);
        parcel.writeInt(this.needExpandCompiledSize ? 1 : 0);
        parcel.writeInt(this.imageCurrentIndex);
        List<Float> list = this.previewMatrix;
        parcel.writeInt(list.size());
        Iterator<Float> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeFloat(it2.next().floatValue());
        }
        parcel.writeString(this.coverFromLocalPath);
        parcel.writeInt(this.isCoverFromUrl ? 1 : 0);
        this.coverInfo.writeToParcel(parcel, i);
        parcel.writeSerializable(this.newCoverList);
        this.coverPreviewInfo.writeToParcel(parcel, i);
    }

    public final String getCoverFromLocalPath() {
        return this.coverFromLocalPath;
    }

    public final UploadCustomizeCoverInfo getCoverInfo() {
        return this.coverInfo;
    }

    public final CoverPreviewInfo getCoverPreviewInfo() {
        return this.coverPreviewInfo;
    }

    public final EffectTextModel getEffectTextModel() {
        return this.effectTextModel;
    }

    public final int getImageCurrentIndex() {
        return this.imageCurrentIndex;
    }

    public final boolean getNeedExpandCompiledSize() {
        return this.needExpandCompiledSize;
    }

    public final CopyOnWriteArrayList<CoverNewItem> getNewCoverList() {
        return this.newCoverList;
    }

    public final List<Float> getPreviewMatrix() {
        return this.previewMatrix;
    }

    public final float getVideoCoverViewX() {
        return this.videoCoverViewX;
    }

    public final boolean isCoverFromUrl() {
        return this.isCoverFromUrl;
    }

    public final void setCoverFromLocalPath(String str) {
        this.coverFromLocalPath = str;
    }

    public final void setCoverFromUrl(boolean z) {
        this.isCoverFromUrl = z;
    }

    public final void setCoverInfo(UploadCustomizeCoverInfo uploadCustomizeCoverInfo) {
        this.coverInfo = uploadCustomizeCoverInfo;
    }

    public final void setCoverPreviewInfo(CoverPreviewInfo coverPreviewInfo) {
        this.coverPreviewInfo = coverPreviewInfo;
    }

    public final void setImageCurrentIndex(int i) {
        this.imageCurrentIndex = i;
    }

    public final void setNeedExpandCompiledSize(boolean z) {
        this.needExpandCompiledSize = z;
    }

    public final void setNewCoverList(CopyOnWriteArrayList<CoverNewItem> copyOnWriteArrayList) {
        this.newCoverList = copyOnWriteArrayList;
    }

    public final void setPreviewMatrix(List<Float> list) {
        this.previewMatrix = list;
    }

    public final void setVideoCoverViewX(float f) {
        this.videoCoverViewX = f;
    }

    public CoverPublishModel(EffectTextModel effectTextModel, float f, boolean z, int i, List<Float> list, String str, boolean z2, UploadCustomizeCoverInfo uploadCustomizeCoverInfo, CopyOnWriteArrayList<CoverNewItem> copyOnWriteArrayList, CoverPreviewInfo coverPreviewInfo) {
        this.effectTextModel = effectTextModel;
        this.videoCoverViewX = f;
        this.needExpandCompiledSize = z;
        this.imageCurrentIndex = i;
        this.previewMatrix = list;
        this.coverFromLocalPath = str;
        this.isCoverFromUrl = z2;
        this.coverInfo = uploadCustomizeCoverInfo;
        this.newCoverList = copyOnWriteArrayList;
        this.coverPreviewInfo = coverPreviewInfo;
    }
}
