package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.TemplateTextStickerModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateTextStickerModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<TemplateTextStickerModel> CREATOR = new Parcelable.Creator<TemplateTextStickerModel>() { // from class: X.0msl
        @Override // android.os.Parcelable.Creator
        public final TemplateTextStickerModel createFromParcel(Parcel parcel) {
            return new TemplateTextStickerModel(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateTextStickerModel[] newArray(int i) {
            return new TemplateTextStickerModel[i];
        }
    };

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final int id;

    @C09CT("textStr")
    public String textStr;

    public TemplateTextStickerModel() {
        this(0, "");
    }

    public final TemplateTextStickerModel copy(int i, String str) {
        return new TemplateTextStickerModel(i, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateTextStickerModel)) {
            return false;
        }
        TemplateTextStickerModel templateTextStickerModel = (TemplateTextStickerModel) obj;
        return this.id == templateTextStickerModel.id && Intrinsics.LJFF(this.textStr, templateTextStickerModel.textStr);
    }

    public int hashCode() {
        return (this.id * 31) + this.textStr.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateTextStickerModel(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", textStr=");
        sbLIZ.append(this.textStr);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.textStr);
    }

    public final int getId() {
        return this.id;
    }

    public final String getTextStr() {
        return this.textStr;
    }

    public final void setTextStr(String str) {
        this.textStr = str;
    }

    public TemplateTextStickerModel(int i, String str) {
        this.id = i;
        this.textStr = str;
    }
}
