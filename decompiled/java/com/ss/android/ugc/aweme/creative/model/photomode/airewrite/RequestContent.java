package com.ss.android.ugc.aweme.creative.model.photomode.airewrite;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.RequestContent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class RequestContent implements Parcelable {
    public static final Parcelable.Creator<RequestContent> CREATOR = new Parcelable.Creator<RequestContent>() { // from class: X.0mh4
        @Override // android.os.Parcelable.Creator
        public final RequestContent createFromParcel(Parcel parcel) {
            return new RequestContent(parcel.createStringArrayList(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RequestContent[] newArray(int i) {
            return new RequestContent[i];
        }
    };

    @C040H
    public final CharSequence descWithSpan;

    @C040H
    public final String experimentParams;

    @C040H
    public final List<String> imagePathList;

    @C040H
    public final String texts;

    @C040H
    public final String title;

    public RequestContent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestContent)) {
            return false;
        }
        RequestContent requestContent = (RequestContent) obj;
        return Intrinsics.LJFF(this.imagePathList, requestContent.imagePathList) && Intrinsics.LJFF(this.descWithSpan, requestContent.descWithSpan) && Intrinsics.LJFF(this.texts, requestContent.texts) && Intrinsics.LJFF(this.title, requestContent.title) && Intrinsics.LJFF(this.experimentParams, requestContent.experimentParams);
    }

    public final int hashCode() {
        List<String> list = this.imagePathList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        CharSequence charSequence = this.descWithSpan;
        return ((((((iHashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + this.texts.hashCode()) * 31) + this.title.hashCode()) * 31) + this.experimentParams.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RequestContent(imagePathList=");
        sbLIZ.append(this.imagePathList);
        sbLIZ.append(", descWithSpan=");
        sbLIZ.append((Object) this.descWithSpan);
        sbLIZ.append(", texts=");
        sbLIZ.append(this.texts);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", experimentParams=");
        sbLIZ.append(this.experimentParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.imagePathList);
        TextUtils.writeToParcel(this.descWithSpan, parcel, i);
        parcel.writeString(this.texts);
        parcel.writeString(this.title);
        parcel.writeString(this.experimentParams);
    }

    public /* synthetic */ RequestContent(int i) {
        this(null, null, "", "", "");
    }

    public RequestContent(List<String> list, CharSequence charSequence, String str, String str2, String str3) {
        this.imagePathList = list;
        this.descWithSpan = charSequence;
        this.texts = str;
        this.title = str2;
        this.experimentParams = str3;
    }
}
