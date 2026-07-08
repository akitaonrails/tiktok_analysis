package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.VideoDetailResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoDetailResponse implements Parcelable {
    public static final Parcelable.Creator<VideoDetailResponse> CREATOR = new Parcelable.Creator<VideoDetailResponse>() { // from class: X.0KjB
        @Override // android.os.Parcelable.Creator
        public final VideoDetailResponse createFromParcel(Parcel parcel) {
            return new VideoDetailResponse(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoDetailResponse[] newArray(int i) {
            return new VideoDetailResponse[i];
        }
    };

    @C09CT("videos")
    public final List<String> videos;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoDetailResponse) && Intrinsics.LJFF(this.videos, ((VideoDetailResponse) obj).videos);
    }

    public final int hashCode() {
        List<String> list = this.videos;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoDetailResponse(videos=");
        sbLIZ.append(this.videos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.videos);
    }

    public VideoDetailResponse(List<String> list) {
        this.videos = list;
    }
}
