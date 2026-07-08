package com.ss.android.ugc.aweme.model.effect;

import X.C1398000mU2;
import X.C1398030mU5;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class FailedReviewPageInitData implements Parcelable {
    public final List<Content> contentList;
    public final String effectId;
    public final int effectSource;
    public final UrlModel iconUrlModel;
    public final String name;
    public final String submittedTime;
    public static final C1398000mU2 Companion = new Object() { // from class: X.0mU2
    };
    public static final Parcelable.Creator<FailedReviewPageInitData> CREATOR = new Parcelable.Creator<FailedReviewPageInitData>() { // from class: X.0mU3
        @Override // android.os.Parcelable.Creator
        public final FailedReviewPageInitData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i = parcel.readInt();
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(FailedReviewPageInitData.Content.CREATOR.createFromParcel(parcel));
            }
            return new FailedReviewPageInitData(string, i, urlModel, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FailedReviewPageInitData[] newArray(int i) {
            return new FailedReviewPageInitData[i];
        }
    };

    public static final class Content implements Parcelable {
        public final String content;
        public final String followUp;
        public final String followUpLink;
        public static final C1398030mU5 Companion = new C1398030mU5();
        public static final Parcelable.Creator<Content> CREATOR = new Parcelable.Creator<Content>() { // from class: X.0mU4
            @Override // android.os.Parcelable.Creator
            public final FailedReviewPageInitData.Content createFromParcel(Parcel parcel) {
                return new FailedReviewPageInitData.Content(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FailedReviewPageInitData.Content[] newArray(int i) {
                return new FailedReviewPageInitData.Content[i];
            }
        };

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.LJFF(this.content, content.content) && Intrinsics.LJFF(this.followUp, content.followUp) && Intrinsics.LJFF(this.followUpLink, content.followUpLink);
        }

        public final int hashCode() {
            return (((this.content.hashCode() * 31) + this.followUp.hashCode()) * 31) + this.followUpLink.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Content(content=");
            sbLIZ.append(this.content);
            sbLIZ.append(", followUp=");
            sbLIZ.append(this.followUp);
            sbLIZ.append(", followUpLink=");
            sbLIZ.append(this.followUpLink);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.content);
            parcel.writeString(this.followUp);
            parcel.writeString(this.followUpLink);
        }

        public Content() {
            this("", "", "");
        }

        public Content(String str, String str2, String str3) {
            this.content = str;
            this.followUp = str2;
            this.followUpLink = str3;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FailedReviewPageInitData)) {
            return false;
        }
        FailedReviewPageInitData failedReviewPageInitData = (FailedReviewPageInitData) obj;
        return Intrinsics.LJFF(this.effectId, failedReviewPageInitData.effectId) && this.effectSource == failedReviewPageInitData.effectSource && Intrinsics.LJFF(this.iconUrlModel, failedReviewPageInitData.iconUrlModel) && Intrinsics.LJFF(this.name, failedReviewPageInitData.name) && Intrinsics.LJFF(this.submittedTime, failedReviewPageInitData.submittedTime) && Intrinsics.LJFF(this.contentList, failedReviewPageInitData.contentList);
    }

    public final int hashCode() {
        return (((((((((this.effectId.hashCode() * 31) + this.effectSource) * 31) + this.iconUrlModel.hashCode()) * 31) + this.name.hashCode()) * 31) + this.submittedTime.hashCode()) * 31) + this.contentList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FailedReviewPageInitData(effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(", effectSource=");
        sbLIZ.append(this.effectSource);
        sbLIZ.append(", iconUrlModel=");
        sbLIZ.append(this.iconUrlModel);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", submittedTime=");
        sbLIZ.append(this.submittedTime);
        sbLIZ.append(", contentList=");
        sbLIZ.append(this.contentList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectId);
        parcel.writeInt(this.effectSource);
        parcel.writeSerializable(this.iconUrlModel);
        parcel.writeString(this.name);
        parcel.writeString(this.submittedTime);
        List<Content> list = this.contentList;
        parcel.writeInt(list.size());
        Iterator<Content> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public FailedReviewPageInitData(String str, int i, UrlModel urlModel, String str2, String str3, List<Content> list) {
        this.effectId = str;
        this.effectSource = i;
        this.iconUrlModel = urlModel;
        this.name = str2;
        this.submittedTime = str3;
        this.contentList = list;
    }
}
