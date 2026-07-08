package com.ss.android.ugc.gamora.editor.recommendhashtag;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class RecommendHashtag implements Parcelable, Serializable {

    @C09CT("cha_name")
    public final String challengeName;

    @C09CT("cid")
    public final String cid;

    @C09CT("log_id")
    public String logId;

    @C09CT("query_id")
    public final String queryId;

    @C09CT("view_count")
    public final long viewCount;
    public static final Parcelable.Creator<RecommendHashtag> CREATOR = new Parcelable.Creator<RecommendHashtag>() { // from class: X.0XkK
        @Override // android.os.Parcelable.Creator
        public final RecommendHashtag createFromParcel(Parcel parcel) {
            return new RecommendHashtag(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendHashtag[] newArray(int i) {
            return new RecommendHashtag[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.challengeName);
        parcel.writeLong(this.viewCount);
        parcel.writeString(this.cid);
        parcel.writeString(this.queryId);
        parcel.writeString(this.logId);
    }

    public RecommendHashtag() {
        this("", -1L, "", "", "");
    }

    public final String getChallengeName() {
        return this.challengeName;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public final long getViewCount() {
        return this.viewCount;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public RecommendHashtag(String str, long j, String str2, String str3, String str4) {
        this.challengeName = str;
        this.viewCount = j;
        this.cid = str2;
        this.queryId = str3;
        this.logId = str4;
    }
}
