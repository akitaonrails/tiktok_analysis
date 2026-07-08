package com.ss.android.ugc.aweme.creative.model.trending;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.trending.TrendingUploadModel;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;

/* JADX INFO: loaded from: classes23.dex */
public final class TrendingUploadModel implements Parcelable {
    public static final Parcelable.Creator<TrendingUploadModel> CREATOR = new Parcelable.Creator<TrendingUploadModel>() { // from class: X.0msY
        @Override // android.os.Parcelable.Creator
        public final TrendingUploadModel createFromParcel(Parcel parcel) {
            return new TrendingUploadModel(parcel.readString(), parcel.readString(), parcel.readInt(), (VideoTrendingTopic) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final TrendingUploadModel[] newArray(int i) {
            return new TrendingUploadModel[i];
        }
    };

    @C09CT("post_trends_id")
    public String postTrendsId;

    @C09CT("post_trends_type")
    public String postTrendsType;

    @C040H
    public VideoTrendingTopic trendingTopic;

    @C040H
    public int trendingTopicStatus;

    public TrendingUploadModel() {
        this("", "", 0, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.postTrendsId);
        parcel.writeString(this.postTrendsType);
        parcel.writeInt(this.trendingTopicStatus);
        parcel.writeSerializable(this.trendingTopic);
    }

    public final void LIZ(String str) {
        this.postTrendsId = str;
    }

    public final void LIZIZ(String str) {
        this.postTrendsType = str;
    }

    public TrendingUploadModel(String str, String str2, int i, VideoTrendingTopic videoTrendingTopic) {
        this.postTrendsId = str;
        this.postTrendsType = str2;
        this.trendingTopicStatus = i;
        this.trendingTopic = videoTrendingTopic;
    }
}
