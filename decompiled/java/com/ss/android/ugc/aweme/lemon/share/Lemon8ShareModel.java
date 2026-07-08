package com.ss.android.ugc.aweme.lemon.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.lemon.share.Lemon8ShareModel;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;

/* JADX INFO: loaded from: classes22.dex */
public final class Lemon8ShareModel extends ShareModel {
    public final Aweme aweme;
    public final PostModeDetailParams postModeDetailParams;
    public static final Parcelable.Creator<Lemon8ShareModel> CREATOR = new Parcelable.Creator<Lemon8ShareModel>() { // from class: X.0lOb
        @Override // android.os.Parcelable.Creator
        public final Lemon8ShareModel createFromParcel(Parcel parcel) {
            return new Lemon8ShareModel((Aweme) parcel.readSerializable(), (PostModeDetailParams) parcel.readParcelable(Lemon8ShareModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Lemon8ShareModel[] newArray(int i) {
            return new Lemon8ShareModel[i];
        }
    };
    public static final int $stable = 8;

    public Lemon8ShareModel() {
        this(null, null);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.ShareModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.aweme);
        parcel.writeParcelable(this.postModeDetailParams, i);
    }

    public Lemon8ShareModel(Aweme aweme, PostModeDetailParams postModeDetailParams) {
        super(aweme);
        this.aweme = aweme;
        this.postModeDetailParams = postModeDetailParams;
    }
}
