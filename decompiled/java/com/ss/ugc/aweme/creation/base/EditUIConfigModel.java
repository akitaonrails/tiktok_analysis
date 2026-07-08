package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.EditGuideConfigModel;
import com.ss.ugc.aweme.creation.base.EditUIConfigModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public class EditUIConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditUIConfigModel> CREATOR = new Parcelable.Creator<EditUIConfigModel>() { // from class: X.0wQY
        @Override // android.os.Parcelable.Creator
        public final EditUIConfigModel createFromParcel(Parcel parcel) {
            return new EditUIConfigModel((EditGuideConfigModel) parcel.readParcelable(EditUIConfigModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final EditUIConfigModel[] newArray(int i) {
            return new EditUIConfigModel[i];
        }
    };

    @C09CT("guide")
    public EditGuideConfigModel guide;

    public EditUIConfigModel() {
        this(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.guide, i);
    }

    public final EditGuideConfigModel getGuide() {
        return this.guide;
    }

    public EditUIConfigModel(EditGuideConfigModel editGuideConfigModel) {
        this.guide = editGuideConfigModel;
    }

    public final void setGuide(EditGuideConfigModel editGuideConfigModel) {
        this.guide = editGuideConfigModel;
    }
}
