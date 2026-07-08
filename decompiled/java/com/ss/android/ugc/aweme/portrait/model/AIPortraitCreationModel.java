package com.ss.android.ugc.aweme.portrait.model;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitCreationModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitResultItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitCreationModel implements Parcelable {
    public static final Parcelable.Creator<AIPortraitCreationModel> CREATOR = new Parcelable.Creator<AIPortraitCreationModel>() { // from class: X.0Lee
        @Override // android.os.Parcelable.Creator
        public final AIPortraitCreationModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AIPortraitResultItem.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            return new AIPortraitCreationModel(arrayList, z, z2, z3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final AIPortraitCreationModel[] newArray(int i) {
            return new AIPortraitCreationModel[i];
        }
    };

    @C040H
    public boolean forceSaveDraft;

    @C040H
    public boolean forceStartSaaWithSingleTop;

    @C040H
    public boolean noBackToDraftBox;

    @C09CT("result")
    public List<AIPortraitResultItem> result;

    @C09CT("show_cameo_in_draft")
    public boolean showCameoInDraft;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitCreationModel)) {
            return false;
        }
        AIPortraitCreationModel aIPortraitCreationModel = (AIPortraitCreationModel) obj;
        return Intrinsics.LJFF(this.result, aIPortraitCreationModel.result) && this.forceSaveDraft == aIPortraitCreationModel.forceSaveDraft && this.noBackToDraftBox == aIPortraitCreationModel.noBackToDraftBox && this.forceStartSaaWithSingleTop == aIPortraitCreationModel.forceStartSaaWithSingleTop && this.showCameoInDraft == aIPortraitCreationModel.showCameoInDraft;
    }

    public final int hashCode() {
        return (((((((this.result.hashCode() * 31) + C786410Ut5.Z2(this.forceSaveDraft)) * 31) + C786410Ut5.Z2(this.noBackToDraftBox)) * 31) + C786410Ut5.Z2(this.forceStartSaaWithSingleTop)) * 31) + C786410Ut5.Z2(this.showCameoInDraft);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitCreationModel(result=");
        sbLIZ.append(this.result);
        sbLIZ.append(", forceSaveDraft=");
        sbLIZ.append(this.forceSaveDraft);
        sbLIZ.append(", noBackToDraftBox=");
        sbLIZ.append(this.noBackToDraftBox);
        sbLIZ.append(", forceStartSaaWithSingleTop=");
        sbLIZ.append(this.forceStartSaaWithSingleTop);
        sbLIZ.append(", showCameoInDraft=");
        sbLIZ.append(this.showCameoInDraft);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AIPortraitResultItem> list = this.result;
        parcel.writeInt(list.size());
        Iterator<AIPortraitResultItem> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.forceSaveDraft ? 1 : 0);
        parcel.writeInt(this.noBackToDraftBox ? 1 : 0);
        parcel.writeInt(this.forceStartSaaWithSingleTop ? 1 : 0);
        parcel.writeInt(this.showCameoInDraft ? 1 : 0);
    }

    public AIPortraitCreationModel() {
        this(new ArrayList(), false, false, false, false);
    }

    public AIPortraitCreationModel(List<AIPortraitResultItem> list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.result = list;
        this.forceSaveDraft = z;
        this.noBackToDraftBox = z2;
        this.forceStartSaaWithSingleTop = z3;
        this.showCameoInDraft = z4;
    }
}
