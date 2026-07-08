package com.ss.android.ugc.aweme.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.flow.PageSession;
import com.ss.android.ugc.aweme.flow.Stage;

/* JADX INFO: loaded from: classes36.dex */
public class Stage<T extends PageSession> implements Parcelable {
    public static final Parcelable.Creator<Stage<?>> CREATOR = new Parcelable.Creator<Stage<?>>() { // from class: X.1DOE
        @Override // android.os.Parcelable.Creator
        public final Stage<?> createFromParcel(Parcel parcel) {
            return new Stage<>((PageSession) parcel.readParcelable(Stage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Stage<?>[] newArray(int i) {
            return new Stage[i];
        }
    };
    public final T session;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.session, i);
    }

    public Stage(T t) {
        this.session = t;
    }
}
