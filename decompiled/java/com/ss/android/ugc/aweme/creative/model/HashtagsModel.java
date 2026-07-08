package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.HashtagsModel;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class HashtagsModel implements Parcelable {
    public static final Parcelable.Creator<HashtagsModel> CREATOR = new Parcelable.Creator<HashtagsModel>() { // from class: X.0nXo
        @Override // android.os.Parcelable.Creator
        public final HashtagsModel createFromParcel(Parcel parcel) {
            return new HashtagsModel(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final HashtagsModel[] newArray(int i) {
            return new HashtagsModel[i];
        }
    };

    @C040H
    public final List<String> hashtagIds;

    @C040H
    public final List<String> hashtags;

    public HashtagsModel() {
        this((List) null, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.hashtags);
        parcel.writeStringList(this.hashtagIds);
    }

    public /* synthetic */ HashtagsModel(List list, int i) {
        this((List<String>) ((i & 1) != 0 ? null : list), (List<String>) null);
    }

    public HashtagsModel(List<String> list, List<String> list2) {
        this.hashtags = list;
        this.hashtagIds = list2;
    }
}
