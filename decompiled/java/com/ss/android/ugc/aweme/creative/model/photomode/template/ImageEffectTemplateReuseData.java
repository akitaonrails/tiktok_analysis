package com.ss.android.ugc.aweme.creative.model.photomode.template;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.creative.model.photomode.template.ImageEffectTemplateReuseData;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageEffectTemplateReuseData implements Parcelable {
    public static final Parcelable.Creator<ImageEffectTemplateReuseData> CREATOR = new Parcelable.Creator<ImageEffectTemplateReuseData>() { // from class: X.0mr5
        @Override // android.os.Parcelable.Creator
        public final ImageEffectTemplateReuseData createFromParcel(Parcel parcel) {
            boolean z;
            PhotoTemplateAsset photoTemplateAssetCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                photoTemplateAssetCreateFromParcel = null;
            } else {
                photoTemplateAssetCreateFromParcel = PhotoTemplateAsset.CREATOR.createFromParcel(parcel);
            }
            return new ImageEffectTemplateReuseData(string, z, photoTemplateAssetCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageEffectTemplateReuseData[] newArray(int i) {
            return new ImageEffectTemplateReuseData[i];
        }
    };

    @C09CT("is_template_from_anchor")
    public boolean isTemplateFromAnchor;

    @C09CT("template_asset")
    public PhotoTemplateAsset templateAsset;

    @C09CT("template_id")
    public String templateId;

    public ImageEffectTemplateReuseData() {
        this(null, false, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateId);
        parcel.writeInt(this.isTemplateFromAnchor ? 1 : 0);
        PhotoTemplateAsset photoTemplateAsset = this.templateAsset;
        if (photoTemplateAsset == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photoTemplateAsset.writeToParcel(parcel, i);
        }
    }

    public ImageEffectTemplateReuseData(String str, boolean z, PhotoTemplateAsset photoTemplateAsset) {
        this.templateId = str;
        this.isTemplateFromAnchor = z;
        this.templateAsset = photoTemplateAsset;
    }
}
