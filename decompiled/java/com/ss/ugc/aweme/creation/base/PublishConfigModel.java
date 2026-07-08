package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.PublishConfigModel;
import com.ss.ugc.aweme.creation.base.PublishUIConfigModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class PublishConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<PublishConfigModel> CREATOR = new Parcelable.Creator<PublishConfigModel>() { // from class: X.0MTa
        @Override // android.os.Parcelable.Creator
        public final PublishConfigModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            boolean z;
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            return new PublishConfigModel(boolValueOf, (PublishUIConfigModel) parcel.readParcelable(PublishConfigModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PublishConfigModel[] newArray(int i) {
            return new PublishConfigModel[i];
        }
    };

    @C09CT("hide")
    public Boolean hide;

    @C09CT("ui_config")
    public PublishUIConfigModel uiConfig;

    public PublishConfigModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        Boolean bool = this.hide;
        if (bool != null) {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        } else {
            BooleanValue = 0;
        }
        parcel.writeInt(BooleanValue);
        parcel.writeParcelable(this.uiConfig, i);
    }

    public final Boolean getHide() {
        return this.hide;
    }

    public final PublishUIConfigModel getUiConfig() {
        return this.uiConfig;
    }

    public final void setHide(Boolean bool) {
        this.hide = bool;
    }

    public final void setUiConfig(PublishUIConfigModel publishUIConfigModel) {
        this.uiConfig = publishUIConfigModel;
    }

    public PublishConfigModel(Boolean bool, PublishUIConfigModel publishUIConfigModel) {
        this.hide = bool;
        this.uiConfig = publishUIConfigModel;
    }
}
