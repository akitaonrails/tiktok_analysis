package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.NLETemplateData;
import com.ss.android.ugc.aweme.creative.model.PhotoModeTemplateData;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;

/* JADX INFO: loaded from: classes9.dex */
public final class PhotoModeTemplateData implements Parcelable {
    public static final Parcelable.Creator<PhotoModeTemplateData> CREATOR = new Parcelable.Creator<PhotoModeTemplateData>() { // from class: X.0MQZ
        @Override // android.os.Parcelable.Creator
        public final PhotoModeTemplateData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Boolean boolValueOf;
            boolean z3;
            boolean z4;
            boolean z5;
            AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) parcel.readSerializable();
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            NLETemplateData nLETemplateDataCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf = Boolean.valueOf(z2);
            }
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
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                nLETemplateDataCreateFromParcel = NLETemplateData.CREATOR.createFromParcel(parcel);
            }
            NLETemplateData nLETemplateData = nLETemplateDataCreateFromParcel;
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new PhotoModeTemplateData(anchorCommonStruct, string, z, boolValueOf, z3, z4, string2, nLETemplateData, z5);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoModeTemplateData[] newArray(int i) {
            return new PhotoModeTemplateData[i];
        }
    };

    @C09CT("enable_publish_as_template")
    public boolean enablePublishAsTemplate;

    @C09CT("is_init")
    public boolean isInit;

    @C09CT("is_template_from_anchor")
    public boolean isTemplateFromAnchor;

    @C09CT("origin_template_data")
    public NLETemplateData originTemplateData;

    @C09CT("post_as_template_checked_by_user")
    public boolean postAsTemplateCheckedByUser;

    @C040H
    public Boolean showOriginTemplateAnchor;

    @C09CT("template_id")
    public String templateId;

    @C09CT("template_origin_anchor")
    public AnchorCommonStruct templateOriginAnchor;

    @C040H
    public String templateZipUrl;

    public PhotoModeTemplateData() {
        this(null, null, false, null, false, true, null, null, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.templateOriginAnchor);
        parcel.writeString(this.templateId);
        parcel.writeInt(this.isTemplateFromAnchor ? 1 : 0);
        Boolean bool = this.showOriginTemplateAnchor;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.enablePublishAsTemplate ? 1 : 0);
        parcel.writeInt(this.postAsTemplateCheckedByUser ? 1 : 0);
        parcel.writeString(this.templateZipUrl);
        NLETemplateData nLETemplateData = this.originTemplateData;
        if (nLETemplateData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nLETemplateData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isInit ? 1 : 0);
    }

    public PhotoModeTemplateData(AnchorCommonStruct anchorCommonStruct, String str, boolean z, Boolean bool, boolean z2, boolean z3, String str2, NLETemplateData nLETemplateData, boolean z4) {
        this.templateOriginAnchor = anchorCommonStruct;
        this.templateId = str;
        this.isTemplateFromAnchor = z;
        this.showOriginTemplateAnchor = bool;
        this.enablePublishAsTemplate = z2;
        this.postAsTemplateCheckedByUser = z3;
        this.templateZipUrl = str2;
        this.originTemplateData = nLETemplateData;
        this.isInit = z4;
    }
}
