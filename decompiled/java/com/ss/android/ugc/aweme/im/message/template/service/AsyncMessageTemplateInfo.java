package com.ss.android.ugc.aweme.im.message.template.service;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.AsyncMessageTemplateInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AsyncMessageTemplateInfo implements Parcelable {
    public static final Parcelable.Creator<AsyncMessageTemplateInfo> CREATOR = new Parcelable.Creator<AsyncMessageTemplateInfo>() { // from class: X.0ldC
        @Override // android.os.Parcelable.Creator
        public final AsyncMessageTemplateInfo createFromParcel(Parcel parcel) {
            return new AsyncMessageTemplateInfo((BaseTemplate) parcel.readParcelable(AsyncMessageTemplateInfo.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AsyncMessageTemplateInfo[] newArray(int i) {
            return new AsyncMessageTemplateInfo[i];
        }
    };
    public final String asyncScene;
    public final BaseTemplate asyncTemplate;

    public AsyncMessageTemplateInfo() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncMessageTemplateInfo)) {
            return false;
        }
        AsyncMessageTemplateInfo asyncMessageTemplateInfo = (AsyncMessageTemplateInfo) obj;
        return Intrinsics.LJFF(this.asyncTemplate, asyncMessageTemplateInfo.asyncTemplate) && Intrinsics.LJFF(this.asyncScene, asyncMessageTemplateInfo.asyncScene);
    }

    public final int hashCode() {
        BaseTemplate baseTemplate = this.asyncTemplate;
        int iHashCode = (baseTemplate == null ? 0 : baseTemplate.hashCode()) * 31;
        String str = this.asyncScene;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AsyncMessageTemplateInfo(asyncTemplate=");
        sbLIZ.append(this.asyncTemplate);
        sbLIZ.append(", asyncScene=");
        sbLIZ.append(this.asyncScene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.asyncTemplate, i);
        parcel.writeString(this.asyncScene);
    }

    public AsyncMessageTemplateInfo(BaseTemplate baseTemplate, String str) {
        this.asyncTemplate = baseTemplate;
        this.asyncScene = str;
    }
}
