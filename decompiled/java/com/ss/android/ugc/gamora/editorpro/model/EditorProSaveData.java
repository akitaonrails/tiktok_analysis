package com.ss.android.ugc.gamora.editorpro.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.model.EditorProSaveData;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class EditorProSaveData extends EditorProResultData {
    public static final Parcelable.Creator<EditorProSaveData> CREATOR = new Parcelable.Creator<EditorProSaveData>() { // from class: X.0Eiq
        @Override // android.os.Parcelable.Creator
        public final EditorProSaveData createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new EditorProSaveData();
        }

        @Override // android.os.Parcelable.Creator
        public final EditorProSaveData[] newArray(int i) {
            return new EditorProSaveData[i];
        }
    };
    public VideoPublishEditModel editModel;
    public boolean hasChangedAudio;
    public boolean hasUseEdit;
    public ArrayList<Pair<String, String>> inlineCaptionCaches;
    public boolean isAdvanceEdit;
    public boolean isSlideOut;

    @Override // com.ss.android.ugc.gamora.editorpro.model.EditorProResultData, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.model.EditorProResultData, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
