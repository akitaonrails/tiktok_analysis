package com.ss.android.ugc.aweme.creative.model.magic;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.TaskInfoInCreativeModel;
import com.ss.android.ugc.aweme.creative.model.magic.MagicCombineEffectModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class MagicCombineEffectModel implements Parcelable {
    public static final Parcelable.Creator<MagicCombineEffectModel> CREATOR = new Parcelable.Creator<MagicCombineEffectModel>() { // from class: X.0Eon
        @Override // android.os.Parcelable.Creator
        public final MagicCombineEffectModel createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(MagicCombineEffectModel.class.getClassLoader()));
            }
            return new MagicCombineEffectModel(arrayList, TaskInfoInCreativeModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MagicCombineEffectModel[] newArray(int i) {
            return new MagicCombineEffectModel[i];
        }
    };

    @C09CT("magic_combine_effect_models")
    public List<CombineEffectPointModel> magicCombineEffectModelList;

    @C09CT("task_info_in_creative_model")
    public final TaskInfoInCreativeModel taskInfoInCreativeModel;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagicCombineEffectModel)) {
            return false;
        }
        MagicCombineEffectModel magicCombineEffectModel = (MagicCombineEffectModel) obj;
        return Intrinsics.LJFF(this.magicCombineEffectModelList, magicCombineEffectModel.magicCombineEffectModelList) && Intrinsics.LJFF(this.taskInfoInCreativeModel, magicCombineEffectModel.taskInfoInCreativeModel);
    }

    public final int hashCode() {
        return (this.magicCombineEffectModelList.hashCode() * 31) + this.taskInfoInCreativeModel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MagicCombineEffectModel(magicCombineEffectModelList=");
        sbLIZ.append(this.magicCombineEffectModelList);
        sbLIZ.append(", taskInfoInCreativeModel=");
        sbLIZ.append(this.taskInfoInCreativeModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<CombineEffectPointModel> list = this.magicCombineEffectModelList;
        parcel.writeInt(list.size());
        Iterator<CombineEffectPointModel> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        this.taskInfoInCreativeModel.writeToParcel(parcel, i);
    }

    public MagicCombineEffectModel() {
        this(new ArrayList(), new TaskInfoInCreativeModel(false, true, 0));
    }

    public MagicCombineEffectModel(List<CombineEffectPointModel> list, TaskInfoInCreativeModel taskInfoInCreativeModel) {
        this.magicCombineEffectModelList = list;
        this.taskInfoInCreativeModel = taskInfoInCreativeModel;
    }
}
