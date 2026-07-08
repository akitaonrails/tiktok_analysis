package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.Button;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.HintViewInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class HintViewInfo implements Parcelable {

    @C09CT("button_list")
    public final List<Button> buttonList;

    @C09CT("hint_message")
    public final ECRichText hintMessage;

    @C09CT("icon")
    public final Icon icon;
    public static final Parcelable.Creator<HintViewInfo> CREATOR = new Parcelable.Creator<HintViewInfo>() { // from class: X.03rW
        @Override // android.os.Parcelable.Creator
        public final HintViewInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Icon icon = (Icon) parcel.readParcelable(HintViewInfo.class.getClassLoader());
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(HintViewInfo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Button.CREATOR.createFromParcel(parcel));
                }
            }
            return new HintViewInfo(icon, eCRichText, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final HintViewInfo[] newArray(int i) {
            return new HintViewInfo[i];
        }
    };
    public static final int $stable = 8;

    public HintViewInfo() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HintViewInfo)) {
            return false;
        }
        HintViewInfo hintViewInfo = (HintViewInfo) obj;
        return Intrinsics.LJFF(this.icon, hintViewInfo.icon) && Intrinsics.LJFF(this.hintMessage, hintViewInfo.hintMessage) && Intrinsics.LJFF(this.buttonList, hintViewInfo.buttonList);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        ECRichText eCRichText = this.hintMessage;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        List<Button> list = this.buttonList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HintViewInfo(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", hintMessage=");
        sbLIZ.append(this.hintMessage);
        sbLIZ.append(", buttonList=");
        sbLIZ.append(this.buttonList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.icon, i);
        parcel.writeParcelable(this.hintMessage, i);
        List<Button> list = this.buttonList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Button> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public HintViewInfo(Icon icon, ECRichText eCRichText, List<Button> list) {
        this.icon = icon;
        this.hintMessage = eCRichText;
        this.buttonList = list;
    }
}
