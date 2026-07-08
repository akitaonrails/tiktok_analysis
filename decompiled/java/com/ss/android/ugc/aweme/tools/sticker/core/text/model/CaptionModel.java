package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public final class CaptionModel implements Parcelable {

    @C09CT("is_editorpro_caption")
    public boolean isEditorProCaption;
    public static final Parcelable.Creator<CaptionModel> CREATOR = new Parcelable.Creator<CaptionModel>() { // from class: X.0F7c
        @Override // android.os.Parcelable.Creator
        public final CaptionModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new CaptionModel(z);
        }

        @Override // android.os.Parcelable.Creator
        public final CaptionModel[] newArray(int i) {
            return new CaptionModel[i];
        }
    };
    public static final int $stable = 8;

    public CaptionModel() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CaptionModel) && this.isEditorProCaption == ((CaptionModel) obj).isEditorProCaption;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.isEditorProCaption);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionModel(isEditorProCaption=");
        sbLIZ.append(this.isEditorProCaption);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEditorProCaption ? 1 : 0);
    }

    public CaptionModel(boolean z) {
        this.isEditorProCaption = z;
    }

    public /* synthetic */ CaptionModel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
