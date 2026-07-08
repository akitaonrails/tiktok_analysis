package com.ss.android.ugc.gamora.editor.ailive.newprompt;

import X.C0MDI;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.gamora.editor.ailive.newprompt.NewPromptPageModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class NewPromptPageModel implements Serializable, Parcelable {
    public final C0MDI enterFrom;
    public final String imagePath;
    public static final Parcelable.Creator<NewPromptPageModel> CREATOR = new Parcelable.Creator<NewPromptPageModel>() { // from class: X.0MDH
        @Override // android.os.Parcelable.Creator
        public final NewPromptPageModel createFromParcel(Parcel parcel) {
            C0MDI c0mdiValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                c0mdiValueOf = null;
            } else {
                c0mdiValueOf = C0MDI.valueOf(parcel.readString());
            }
            return new NewPromptPageModel(string, c0mdiValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final NewPromptPageModel[] newArray(int i) {
            return new NewPromptPageModel[i];
        }
    };
    public static final int $stable = 8;

    public NewPromptPageModel() {
        this(null, null);
    }

    public final NewPromptPageModel copy(String str, C0MDI c0mdi) {
        return new NewPromptPageModel(str, c0mdi);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewPromptPageModel)) {
            return false;
        }
        NewPromptPageModel newPromptPageModel = (NewPromptPageModel) obj;
        return Intrinsics.LJFF(this.imagePath, newPromptPageModel.imagePath) && this.enterFrom == newPromptPageModel.enterFrom;
    }

    public int hashCode() {
        String str = this.imagePath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C0MDI c0mdi = this.enterFrom;
        return iHashCode + (c0mdi != null ? c0mdi.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewPromptPageModel(imagePath=");
        sbLIZ.append(this.imagePath);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.imagePath);
        C0MDI c0mdi = this.enterFrom;
        if (c0mdi == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(c0mdi.name());
        }
    }

    public final C0MDI getEnterFrom() {
        return this.enterFrom;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public NewPromptPageModel(String str, C0MDI c0mdi) {
        this.imagePath = str;
        this.enterFrom = c0mdi;
    }
}
