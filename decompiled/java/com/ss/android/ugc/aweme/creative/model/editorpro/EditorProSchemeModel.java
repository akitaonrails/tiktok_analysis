package com.ss.android.ugc.aweme.creative.model.editorpro;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPAnchorData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class EditorProSchemeModel implements Parcelable {
    public static final Parcelable.Creator<EditorProSchemeModel> CREATOR = new Parcelable.Creator<EditorProSchemeModel>() { // from class: X.0MJj
        @Override // android.os.Parcelable.Creator
        public final EditorProSchemeModel createFromParcel(Parcel parcel) {
            EPAnchorData ePAnchorDataCreateFromParcel;
            boolean z;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                ePAnchorDataCreateFromParcel = null;
            } else {
                ePAnchorDataCreateFromParcel = EPAnchorData.CREATOR.createFromParcel(parcel);
            }
            EPAnchorData ePAnchorData = ePAnchorDataCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new EditorProSchemeModel(string, ePAnchorData, z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditorProSchemeModel[] newArray(int i) {
            return new EditorProSchemeModel[i];
        }
    };

    @C09CT("anchor_data")
    public EPAnchorData anchorData;

    @C09CT("enter_from")
    public String enterFrom;

    @C09CT("is_deeplink")
    public boolean isDeepLink;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    public EditorProSchemeModel() {
        this(null, null, false, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditorProSchemeModel)) {
            return false;
        }
        EditorProSchemeModel editorProSchemeModel = (EditorProSchemeModel) obj;
        return Intrinsics.LJFF(this.scene, editorProSchemeModel.scene) && Intrinsics.LJFF(this.anchorData, editorProSchemeModel.anchorData) && this.isDeepLink == editorProSchemeModel.isDeepLink && Intrinsics.LJFF(this.enterFrom, editorProSchemeModel.enterFrom);
    }

    public final int hashCode() {
        String str = this.scene;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        EPAnchorData ePAnchorData = this.anchorData;
        int iHashCode2 = (((iHashCode + (ePAnchorData == null ? 0 : ePAnchorData.hashCode())) * 31) + C786410Ut5.Z2(this.isDeepLink)) * 31;
        String str2 = this.enterFrom;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProSchemeModel(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", anchorData=");
        sbLIZ.append(this.anchorData);
        sbLIZ.append(", isDeepLink=");
        sbLIZ.append(this.isDeepLink);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.scene);
        EPAnchorData ePAnchorData = this.anchorData;
        if (ePAnchorData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ePAnchorData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isDeepLink ? 1 : 0);
        parcel.writeString(this.enterFrom);
    }

    public EditorProSchemeModel(String str, EPAnchorData ePAnchorData, boolean z, String str2) {
        this.scene = str;
        this.anchorData = ePAnchorData;
        this.isDeepLink = z;
        this.enterFrom = str2;
    }
}
