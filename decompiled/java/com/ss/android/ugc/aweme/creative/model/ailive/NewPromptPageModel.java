package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C040H;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ailive.NewPromptPageModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class NewPromptPageModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<NewPromptPageModel> CREATOR = new Parcelable.Creator<NewPromptPageModel>() { // from class: X.0MBx
        @Override // android.os.Parcelable.Creator
        public final NewPromptPageModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new NewPromptPageModel(z);
        }

        @Override // android.os.Parcelable.Creator
        public final NewPromptPageModel[] newArray(int i) {
            return new NewPromptPageModel[i];
        }
    };

    @C040H
    public boolean autoApplyAiAlive;

    public NewPromptPageModel() {
        this(false);
    }

    public final NewPromptPageModel copy(boolean z) {
        return new NewPromptPageModel(z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewPromptPageModel) && this.autoApplyAiAlive == ((NewPromptPageModel) obj).autoApplyAiAlive;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.autoApplyAiAlive);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewPromptPageModel(autoApplyAiAlive=");
        sbLIZ.append(this.autoApplyAiAlive);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.autoApplyAiAlive ? 1 : 0);
    }

    public final boolean getAutoApplyAiAlive() {
        return this.autoApplyAiAlive;
    }

    public NewPromptPageModel(boolean z) {
        this.autoApplyAiAlive = z;
    }

    public final void setAutoApplyAiAlive(boolean z) {
        this.autoApplyAiAlive = z;
    }
}
