package com.ss.android.ugc.aweme.live.livehostimpl.livereply.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.share.LiveReplayShareData;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.share.LiveReplayShareModel;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveReplayShareModel extends ShareModel {
    public final LiveReplayShareData shareData;
    public static final Parcelable.Creator<LiveReplayShareModel> CREATOR = new Parcelable.Creator<LiveReplayShareModel>() { // from class: X.0lxH
        @Override // android.os.Parcelable.Creator
        public final LiveReplayShareModel createFromParcel(Parcel parcel) {
            return new LiveReplayShareModel((LiveReplayShareData) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final LiveReplayShareModel[] newArray(int i) {
            return new LiveReplayShareModel[i];
        }
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.share.base.model.ShareModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.shareData);
    }

    public LiveReplayShareModel(LiveReplayShareData liveReplayShareData) {
        super(liveReplayShareData);
        this.shareData = liveReplayShareData;
    }
}
