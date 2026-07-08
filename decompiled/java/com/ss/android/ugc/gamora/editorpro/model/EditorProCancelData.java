package com.ss.android.ugc.gamora.editorpro.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.gamora.editorpro.model.EditorProCancelData;

/* JADX INFO: loaded from: classes6.dex */
public final class EditorProCancelData extends EditorProResultData {
    public static final Parcelable.Creator<EditorProCancelData> CREATOR = new Parcelable.Creator<EditorProCancelData>() { // from class: X.0Eir
        @Override // android.os.Parcelable.Creator
        public final EditorProCancelData createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new EditorProCancelData();
        }

        @Override // android.os.Parcelable.Creator
        public final EditorProCancelData[] newArray(int i) {
            return new EditorProCancelData[i];
        }
    };
    public MultiEditVideoRecordData curMultiEditData;
    public boolean exitByBackPressed;
    public boolean isRetake;

    @Override // com.ss.android.ugc.gamora.editorpro.model.EditorProResultData, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.model.EditorProResultData, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
