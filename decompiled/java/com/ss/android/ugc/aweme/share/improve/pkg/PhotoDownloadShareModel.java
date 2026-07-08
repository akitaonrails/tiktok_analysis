package com.ss.android.ugc.aweme.share.improve.pkg;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.share.improve.pkg.PhotoDownloadShareModel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class PhotoDownloadShareModel extends ShareModel {
    public final Aweme aweme;
    public final String enterFrom;
    public final Set<String> successLocalPathList;
    public static final Parcelable.Creator<PhotoDownloadShareModel> CREATOR = new Parcelable.Creator<PhotoDownloadShareModel>() { // from class: X.0lOf
        @Override // android.os.Parcelable.Creator
        public final PhotoDownloadShareModel createFromParcel(Parcel parcel) {
            Aweme aweme = (Aweme) parcel.readSerializable();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(parcel.readString());
            }
            return new PhotoDownloadShareModel(aweme, parcel.readString(), linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoDownloadShareModel[] newArray(int i) {
            return new PhotoDownloadShareModel[i];
        }
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.share.base.model.ShareModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.aweme);
        Set<String> set = this.successLocalPathList;
        parcel.writeInt(set.size());
        Iterator<String> it2 = set.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next());
        }
        parcel.writeString(this.enterFrom);
    }

    public PhotoDownloadShareModel(Aweme aweme, String str, Set set) {
        super(aweme);
        this.aweme = aweme;
        this.successLocalPathList = set;
        this.enterFrom = str;
    }
}
