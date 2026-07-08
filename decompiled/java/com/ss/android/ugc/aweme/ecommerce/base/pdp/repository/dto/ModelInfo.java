package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelFigure;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ModelInfo implements Parcelable {

    @C09CT("avatar")
    public final Image avatar;

    @C09CT("color_value_id")
    public final String colorValueId;

    @C09CT("model_figures")
    public final List<ModelFigure> modelFigures;

    @C09CT("wears_size")
    public final String wearsSize;
    public static final Parcelable.Creator<ModelInfo> CREATOR = new Parcelable.Creator<ModelInfo>() { // from class: X.03vY
        @Override // android.os.Parcelable.Creator
        public final ModelInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Image image = (Image) parcel.readParcelable(ModelInfo.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ModelFigure.CREATOR.createFromParcel(parcel));
                }
            }
            return new ModelInfo(image, string, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ModelInfo[] newArray(int i) {
            return new ModelInfo[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelInfo)) {
            return false;
        }
        ModelInfo modelInfo = (ModelInfo) obj;
        return Intrinsics.LJFF(this.avatar, modelInfo.avatar) && Intrinsics.LJFF(this.wearsSize, modelInfo.wearsSize) && Intrinsics.LJFF(this.modelFigures, modelInfo.modelFigures) && Intrinsics.LJFF(this.colorValueId, modelInfo.colorValueId);
    }

    public final int hashCode() {
        Image image = this.avatar;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.wearsSize;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ModelFigure> list = this.modelFigures;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.colorValueId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ModelInfo(avatar=");
        sbLIZ.append(this.avatar);
        sbLIZ.append(", wearsSize=");
        sbLIZ.append(this.wearsSize);
        sbLIZ.append(", modelFigures=");
        sbLIZ.append(this.modelFigures);
        sbLIZ.append(", colorValueId=");
        sbLIZ.append(this.colorValueId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.avatar, i);
        parcel.writeString(this.wearsSize);
        List<ModelFigure> list = this.modelFigures;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ModelFigure> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.colorValueId);
    }

    public ModelInfo(Image image, String str, List<ModelFigure> list, String str2) {
        this.avatar = image;
        this.wearsSize = str;
        this.modelFigures = list;
        this.colorValueId = str2;
    }
}
