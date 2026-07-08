package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsOptionButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsOptionModule;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SnsOptionModule implements Parcelable {

    @C09CT("button_list")
    public List<SnsOptionButton> buttonList;

    @C09CT("title")
    public ECRichText title;
    public static final Parcelable.Creator<SnsOptionModule> CREATOR = new Parcelable.Creator<SnsOptionModule>() { // from class: X.02i2
        @Override // android.os.Parcelable.Creator
        public final SnsOptionModule createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(SnsOptionModule.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SnsOptionButton.CREATOR.createFromParcel(parcel));
                }
            }
            return new SnsOptionModule(eCRichText, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SnsOptionModule[] newArray(int i) {
            return new SnsOptionModule[i];
        }
    };
    public static final int $stable = 8;

    public SnsOptionModule() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnsOptionModule)) {
            return false;
        }
        SnsOptionModule snsOptionModule = (SnsOptionModule) obj;
        return Intrinsics.LJFF(this.title, snsOptionModule.title) && Intrinsics.LJFF(this.buttonList, snsOptionModule.buttonList);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.title;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        List<SnsOptionButton> list = this.buttonList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SnsOptionModule(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", buttonList=");
        sbLIZ.append(this.buttonList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.title, i);
        List<SnsOptionButton> list = this.buttonList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<SnsOptionButton> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public SnsOptionModule(ECRichText eCRichText, List<SnsOptionButton> list) {
        this.title = eCRichText;
        this.buttonList = list;
    }
}
