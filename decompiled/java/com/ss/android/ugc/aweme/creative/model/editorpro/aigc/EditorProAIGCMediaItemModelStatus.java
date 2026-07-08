package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class EditorProAIGCMediaItemModelStatus implements Parcelable {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ EditorProAIGCMediaItemModelStatus[] $VALUES;
    public static final EditorProAIGCMediaItemModelStatus CANCEL;
    public static final EditorProAIGCMediaItemModelStatus COMPLETE;
    public static final Parcelable.Creator<EditorProAIGCMediaItemModelStatus> CREATOR;
    public static final EditorProAIGCMediaItemModelStatus ERROR;
    public static final EditorProAIGCMediaItemModelStatus LOADING;
    public static final EditorProAIGCMediaItemModelStatus NONE;

    @C09CT("type")
    public final int type;

    public static InterfaceC2044707zh<EditorProAIGCMediaItemModelStatus> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }

    static {
        EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus = new EditorProAIGCMediaItemModelStatus("NONE", 0, -1);
        NONE = editorProAIGCMediaItemModelStatus;
        EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus2 = new EditorProAIGCMediaItemModelStatus("LOADING", 1, 0);
        LOADING = editorProAIGCMediaItemModelStatus2;
        EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus3 = new EditorProAIGCMediaItemModelStatus("COMPLETE", 2, 1);
        COMPLETE = editorProAIGCMediaItemModelStatus3;
        EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus4 = new EditorProAIGCMediaItemModelStatus("ERROR", 3, 2);
        ERROR = editorProAIGCMediaItemModelStatus4;
        EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus5 = new EditorProAIGCMediaItemModelStatus("CANCEL", 4, 3);
        CANCEL = editorProAIGCMediaItemModelStatus5;
        EditorProAIGCMediaItemModelStatus[] editorProAIGCMediaItemModelStatusArr = {editorProAIGCMediaItemModelStatus, editorProAIGCMediaItemModelStatus2, editorProAIGCMediaItemModelStatus3, editorProAIGCMediaItemModelStatus4, editorProAIGCMediaItemModelStatus5};
        $VALUES = editorProAIGCMediaItemModelStatusArr;
        $ENTRIES = new C2254308sP(editorProAIGCMediaItemModelStatusArr);
        CREATOR = new Parcelable.Creator<EditorProAIGCMediaItemModelStatus>() { // from class: X.0Eqc
            @Override // android.os.Parcelable.Creator
            public final EditorProAIGCMediaItemModelStatus createFromParcel(Parcel parcel) {
                return EditorProAIGCMediaItemModelStatus.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EditorProAIGCMediaItemModelStatus[] newArray(int i) {
                return new EditorProAIGCMediaItemModelStatus[i];
            }
        };
    }

    public static EditorProAIGCMediaItemModelStatus[] values() {
        return (EditorProAIGCMediaItemModelStatus[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    public static EditorProAIGCMediaItemModelStatus valueOf(String str) {
        return (EditorProAIGCMediaItemModelStatus) C08FF.LIZ(EditorProAIGCMediaItemModelStatus.class, str);
    }

    public EditorProAIGCMediaItemModelStatus(String str, int i, int i2) {
        this.type = i2;
    }
}
