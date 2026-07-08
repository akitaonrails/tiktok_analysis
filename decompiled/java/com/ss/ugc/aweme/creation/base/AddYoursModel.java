package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.AddYoursModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class AddYoursModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<AddYoursModel> CREATOR = new Parcelable.Creator<AddYoursModel>() { // from class: X.0MhN
        @Override // android.os.Parcelable.Creator
        public final AddYoursModel createFromParcel(Parcel parcel) {
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
            return new AddYoursModel(boolValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddYoursModel[] newArray(int i) {
            return new AddYoursModel[i];
        }
    };

    @C09CT("ay_enter_edit")
    public Boolean ayEnterEdit;

    @C09CT("ay_enter_method")
    public String ayEnterMethod;

    @C09CT("ay_text")
    public String ayText;

    @C09CT("ay_topic_id")
    public String ayTopicId;

    public AddYoursModel() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        Boolean bool = this.ayEnterEdit;
        if (bool != null) {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        } else {
            BooleanValue = 0;
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.ayText);
        parcel.writeString(this.ayTopicId);
        parcel.writeString(this.ayEnterMethod);
    }

    public final Boolean getAyEnterEdit() {
        return this.ayEnterEdit;
    }

    public final String getAyEnterMethod() {
        return this.ayEnterMethod;
    }

    public final String getAyText() {
        return this.ayText;
    }

    public final String getAyTopicId() {
        return this.ayTopicId;
    }

    public final void setAyEnterEdit(Boolean bool) {
        this.ayEnterEdit = bool;
    }

    public final void setAyEnterMethod(String str) {
        this.ayEnterMethod = str;
    }

    public final void setAyText(String str) {
        this.ayText = str;
    }

    public final void setAyTopicId(String str) {
        this.ayTopicId = str;
    }

    public AddYoursModel(Boolean bool, String str, String str2, String str3) {
        this.ayEnterEdit = bool;
        this.ayText = str;
        this.ayTopicId = str2;
        this.ayEnterMethod = str3;
    }
}
