package com.ss.android.ugc.aweme.upvote.event;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishExtraData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvotePublishExtraData implements Parcelable {
    public static final Parcelable.Creator<UpvotePublishExtraData> CREATOR = new Parcelable.Creator<UpvotePublishExtraData>() { // from class: X.0lTr
        @Override // android.os.Parcelable.Creator
        public final UpvotePublishExtraData createFromParcel(Parcel parcel) {
            return new UpvotePublishExtraData((Aweme) parcel.readSerializable(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final UpvotePublishExtraData[] newArray(int i) {
            return new UpvotePublishExtraData[i];
        }
    };
    public final Aweme aweme;
    public final int pageType;

    public UpvotePublishExtraData() {
        this(null, 3, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpvotePublishExtraData)) {
            return false;
        }
        UpvotePublishExtraData upvotePublishExtraData = (UpvotePublishExtraData) obj;
        return Intrinsics.LJFF(this.aweme, upvotePublishExtraData.aweme) && this.pageType == upvotePublishExtraData.pageType;
    }

    public final int hashCode() {
        Aweme aweme = this.aweme;
        return ((aweme == null ? 0 : aweme.hashCode()) * 31) + this.pageType;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpvotePublishExtraData(aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(", pageType=");
        sbLIZ.append(this.pageType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.aweme);
        parcel.writeInt(this.pageType);
    }

    public UpvotePublishExtraData(Aweme aweme, int i) {
        this.aweme = aweme;
        this.pageType = i;
    }

    public /* synthetic */ UpvotePublishExtraData(Aweme aweme, int i, int i2) {
        this((i & 1) != 0 ? null : aweme, 0);
    }
}
