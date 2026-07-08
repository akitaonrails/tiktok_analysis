package com.ss.android.ugc.aweme.creative.model.photomode;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.photomode.RecommendDescRequestContent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class RecommendDescRequestContent implements Parcelable {
    public static final Parcelable.Creator<RecommendDescRequestContent> CREATOR = new Parcelable.Creator<RecommendDescRequestContent>() { // from class: X.0mh5
        @Override // android.os.Parcelable.Creator
        public final RecommendDescRequestContent createFromParcel(Parcel parcel) {
            return new RecommendDescRequestContent(parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendDescRequestContent[] newArray(int i) {
            return new RecommendDescRequestContent[i];
        }
    };
    public final String description;
    public final List<String> imagePathList;
    public final String texts;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendDescRequestContent)) {
            return false;
        }
        RecommendDescRequestContent recommendDescRequestContent = (RecommendDescRequestContent) obj;
        return Intrinsics.LJFF(this.imagePathList, recommendDescRequestContent.imagePathList) && Intrinsics.LJFF(this.description, recommendDescRequestContent.description) && Intrinsics.LJFF(this.texts, recommendDescRequestContent.texts);
    }

    public final int hashCode() {
        List<String> list = this.imagePathList;
        return ((((list == null ? 0 : list.hashCode()) * 31) + this.description.hashCode()) * 31) + this.texts.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendDescRequestContent(imagePathList=");
        sbLIZ.append(this.imagePathList);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", texts=");
        sbLIZ.append(this.texts);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.imagePathList);
        parcel.writeString(this.description);
        parcel.writeString(this.texts);
    }

    public RecommendDescRequestContent(List<String> list, String str, String str2) {
        this.imagePathList = list;
        this.description = str;
        this.texts = str2;
    }
}
