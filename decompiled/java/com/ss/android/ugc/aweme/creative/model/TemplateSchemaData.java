package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.TemplateSchemaData;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateSchemaData implements Parcelable {
    public static final Parcelable.Creator<TemplateSchemaData> CREATOR = new Parcelable.Creator<TemplateSchemaData>() { // from class: X.0nWe
        @Override // android.os.Parcelable.Creator
        public final TemplateSchemaData createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new TemplateSchemaData(string, string2, string3, string4, z);
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateSchemaData[] newArray(int i) {
            return new TemplateSchemaData[i];
        }
    };

    @C040H
    public String isFromEoyBanner;

    @C040H
    public String landingSubTab;

    @C09CT("schema_tag")
    public String schemaTag;

    @C040H
    public String templateBackCamera;

    @C09CT("through_template_square_h5")
    public boolean throughTemplateSquareH5;

    public TemplateSchemaData() {
        this(null, null, null, null, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.landingSubTab);
        parcel.writeString(this.isFromEoyBanner);
        parcel.writeString(this.templateBackCamera);
        parcel.writeString(this.schemaTag);
        parcel.writeInt(this.throughTemplateSquareH5 ? 1 : 0);
    }

    public TemplateSchemaData(String str, String str2, String str3, String str4, boolean z) {
        this.landingSubTab = str;
        this.isFromEoyBanner = str2;
        this.templateBackCamera = str3;
        this.schemaTag = str4;
        this.throughTemplateSquareH5 = z;
    }
}
