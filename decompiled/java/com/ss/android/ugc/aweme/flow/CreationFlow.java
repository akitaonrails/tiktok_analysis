package com.ss.android.ugc.aweme.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.flow.CreationFlow;
import com.ss.android.ugc.aweme.flow.ExtraSession;
import com.ss.android.ugc.aweme.flow.PageSession;
import com.ss.android.ugc.aweme.flow.Stage;

/* JADX INFO: loaded from: classes23.dex */
public class CreationFlow<INIT_STAGE extends Stage<INIT_PAGE_SESSION>, INIT_PAGE_SESSION extends PageSession> implements Parcelable {
    public static final Parcelable.Creator<CreationFlow<?, ?>> CREATOR = new Parcelable.Creator<CreationFlow<?, ?>>() { // from class: X.0mgE
        @Override // android.os.Parcelable.Creator
        public final CreationFlow<?, ?> createFromParcel(Parcel parcel) {
            return new CreationFlow<>(parcel.readString(), ExtraSession.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CreationFlow<?, ?>[] newArray(int i) {
            return new CreationFlow[i];
        }
    };
    public final String creationFlowId;
    public final ExtraSession extraSession;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.creationFlowId);
        this.extraSession.writeToParcel(parcel, i);
    }

    public CreationFlow(String str, ExtraSession extraSession) {
        this.creationFlowId = str;
        this.extraSession = extraSession;
    }
}
