package com.ss.android.ugc.gamora.editorpro.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.gamora.editorpro.model.EditorProResultData;

/* JADX INFO: loaded from: classes6.dex */
public class EditorProResultData implements Parcelable {
    public static final Parcelable.Creator<EditorProResultData> CREATOR = new Parcelable.Creator<EditorProResultData>() { // from class: X.0EjL
        @Override // android.os.Parcelable.Creator
        public final EditorProResultData createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new EditorProResultData();
        }

        @Override // android.os.Parcelable.Creator
        public final EditorProResultData[] newArray(int i) {
            return new EditorProResultData[i];
        }
    };
    public boolean effectMultiTrackMode;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
