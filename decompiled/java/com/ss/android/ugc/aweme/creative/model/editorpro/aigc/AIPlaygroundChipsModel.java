package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class AIPlaygroundChipsModel implements Parcelable {
    public static final Parcelable.Creator<AIPlaygroundChipsModel> CREATOR = new Parcelable.Creator<AIPlaygroundChipsModel>() { // from class: X.093y
        @Override // android.os.Parcelable.Creator
        public final AIPlaygroundChipsModel createFromParcel(Parcel parcel) {
            return new AIPlaygroundChipsModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIPlaygroundChipsModel[] newArray(int i) {
            return new AIPlaygroundChipsModel[i];
        }
    };

    @C09CT("content")
    public String content;

    @C09CT("coverPath")
    public String coverPath;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("panel")
    public String panel;

    @C09CT("title")
    public String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPlaygroundChipsModel)) {
            return false;
        }
        AIPlaygroundChipsModel aIPlaygroundChipsModel = (AIPlaygroundChipsModel) obj;
        return Intrinsics.LJFF(this.id, aIPlaygroundChipsModel.id) && Intrinsics.LJFF(this.title, aIPlaygroundChipsModel.title) && Intrinsics.LJFF(this.content, aIPlaygroundChipsModel.content) && Intrinsics.LJFF(this.panel, aIPlaygroundChipsModel.panel) && Intrinsics.LJFF(this.coverPath, aIPlaygroundChipsModel.coverPath);
    }

    public final int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + this.panel.hashCode()) * 31) + this.coverPath.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPlaygroundChipsModel(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", panel=");
        sbLIZ.append(this.panel);
        sbLIZ.append(", coverPath=");
        sbLIZ.append(this.coverPath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.panel);
        parcel.writeString(this.coverPath);
    }

    public AIPlaygroundChipsModel() {
        this("", "", "", "", "");
    }

    public AIPlaygroundChipsModel(String str, String str2, String str3, String str4, String str5) {
        this.id = str;
        this.title = str2;
        this.content = str3;
        this.panel = str4;
        this.coverPath = str5;
    }
}
