package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorTabAlbumAICreate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class EditorTabAlbumAICreate implements Parcelable {
    public static final Parcelable.Creator<EditorTabAlbumAICreate> CREATOR = new Parcelable.Creator<EditorTabAlbumAICreate>() { // from class: X.0Eop
        @Override // android.os.Parcelable.Creator
        public final EditorTabAlbumAICreate createFromParcel(Parcel parcel) {
            return new EditorTabAlbumAICreate(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditorTabAlbumAICreate[] newArray(int i) {
            return new EditorTabAlbumAICreate[i];
        }
    };

    @C040H
    public String deeplinkEpAIScene;

    @C040H
    public String deeplinkEpAISceneEnterSource;

    @C09CT("from_editor_tab_ai_create")
    public String fromEditorTabAICreate;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditorTabAlbumAICreate)) {
            return false;
        }
        EditorTabAlbumAICreate editorTabAlbumAICreate = (EditorTabAlbumAICreate) obj;
        return Intrinsics.LJFF(this.fromEditorTabAICreate, editorTabAlbumAICreate.fromEditorTabAICreate) && Intrinsics.LJFF(this.deeplinkEpAIScene, editorTabAlbumAICreate.deeplinkEpAIScene) && Intrinsics.LJFF(this.deeplinkEpAISceneEnterSource, editorTabAlbumAICreate.deeplinkEpAISceneEnterSource);
    }

    public final int hashCode() {
        return (((this.fromEditorTabAICreate.hashCode() * 31) + this.deeplinkEpAIScene.hashCode()) * 31) + this.deeplinkEpAISceneEnterSource.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorTabAlbumAICreate(fromEditorTabAICreate=");
        sbLIZ.append(this.fromEditorTabAICreate);
        sbLIZ.append(", deeplinkEpAIScene=");
        sbLIZ.append(this.deeplinkEpAIScene);
        sbLIZ.append(", deeplinkEpAISceneEnterSource=");
        sbLIZ.append(this.deeplinkEpAISceneEnterSource);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fromEditorTabAICreate);
        parcel.writeString(this.deeplinkEpAIScene);
        parcel.writeString(this.deeplinkEpAISceneEnterSource);
    }

    public EditorTabAlbumAICreate() {
        this("", "", "");
    }

    public EditorTabAlbumAICreate(String str, String str2, String str3) {
        this.fromEditorTabAICreate = str;
        this.deeplinkEpAIScene = str2;
        this.deeplinkEpAISceneEnterSource = str3;
    }
}
