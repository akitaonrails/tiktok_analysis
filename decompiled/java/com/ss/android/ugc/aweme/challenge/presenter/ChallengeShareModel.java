package com.ss.android.ugc.aweme.challenge.presenter;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.challenge.presenter.ChallengeShareModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class ChallengeShareModel extends ShareModel {
    public static final Parcelable.Creator<ChallengeShareModel> CREATOR = new Parcelable.Creator<ChallengeShareModel>() { // from class: X.0lwA
        @Override // android.os.Parcelable.Creator
        public final ChallengeShareModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            Challenge challenge = (Challenge) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new ChallengeShareModel(challenge, arrayList, z, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChallengeShareModel[] newArray(int i) {
            return new ChallengeShareModel[i];
        }
    };
    public final List<Aweme> awemeList;
    public final Challenge challenge;
    public final boolean isHashtag;
    public final String originId;
    public final String processId;
    public final String requestId;

    @Override // com.ss.android.ugc.aweme.share.base.model.ShareModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.challenge);
        List<Aweme> list = this.awemeList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
        }
        parcel.writeInt(this.isHashtag ? 1 : 0);
        parcel.writeString(this.requestId);
        parcel.writeString(this.processId);
        parcel.writeString(this.originId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeShareModel(Challenge challenge, List<? extends Aweme> list, boolean z, String str, String str2, String str3) {
        super(challenge);
        this.challenge = challenge;
        this.awemeList = list;
        this.isHashtag = z;
        this.requestId = str;
        this.processId = str2;
        this.originId = str3;
    }
}
