package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ImageVideoSharedModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ImageVideoSharedModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageVideoSharedModel> CREATOR = new Parcelable.Creator<ImageVideoSharedModel>() { // from class: X.0Mlq
        @Override // android.os.Parcelable.Creator
        public final ImageVideoSharedModel createFromParcel(Parcel parcel) {
            return new ImageVideoSharedModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageVideoSharedModel[] newArray(int i) {
            return new ImageVideoSharedModel[i];
        }
    };

    @C09CT("ai_chat_node_id")
    public final String aiChatGenNodeId;

    public ImageVideoSharedModel() {
        this(null);
    }

    public final ImageVideoSharedModel copy(String str) {
        return new ImageVideoSharedModel(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageVideoSharedModel) && Intrinsics.LJFF(this.aiChatGenNodeId, ((ImageVideoSharedModel) obj).aiChatGenNodeId);
    }

    public int hashCode() {
        String str = this.aiChatGenNodeId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageVideoSharedModel(aiChatGenNodeId=");
        sbLIZ.append(this.aiChatGenNodeId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.aiChatGenNodeId);
    }

    public final String getAiChatGenNodeId() {
        return this.aiChatGenNodeId;
    }

    public ImageVideoSharedModel(String str) {
        this.aiChatGenNodeId = str;
    }
}
