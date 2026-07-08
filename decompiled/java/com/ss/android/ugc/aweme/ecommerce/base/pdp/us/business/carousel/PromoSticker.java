package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PromoSticker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PromoStickerUiConfig;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PromoSticker implements Parcelable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("labels")
    public final List<ECRichText> labels;

    @C09CT("ui_config")
    public final PromoStickerUiConfig uiConfig;
    public static final Parcelable.Creator<PromoSticker> CREATOR = new Parcelable.Creator<PromoSticker>() { // from class: X.0vxH
        @Override // android.os.Parcelable.Creator
        public final PromoSticker createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            PromoStickerUiConfig promoStickerUiConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(PromoSticker.class.getClassLoader()));
                }
            }
            if (parcel.readInt() != 0) {
                promoStickerUiConfigCreateFromParcel = PromoStickerUiConfig.CREATOR.createFromParcel(parcel);
            }
            return new PromoSticker(arrayList, promoStickerUiConfigCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromoSticker[] newArray(int i) {
            return new PromoSticker[i];
        }
    };
    public static final int $stable = 8;

    public PromoSticker() {
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
        if (!(obj instanceof PromoSticker)) {
            return false;
        }
        PromoSticker promoSticker = (PromoSticker) obj;
        return Intrinsics.LJFF(this.labels, promoSticker.labels) && Intrinsics.LJFF(this.uiConfig, promoSticker.uiConfig) && Intrinsics.LJFF(this.daInfo, promoSticker.daInfo);
    }

    public final int hashCode() {
        List<ECRichText> list = this.labels;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        PromoStickerUiConfig promoStickerUiConfig = this.uiConfig;
        int iHashCode2 = (iHashCode + (promoStickerUiConfig == null ? 0 : promoStickerUiConfig.hashCode())) * 31;
        String str = this.daInfo;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromoSticker(labels=");
        sbLIZ.append(this.labels);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.uiConfig);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ECRichText> list = this.labels;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ECRichText> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        PromoStickerUiConfig promoStickerUiConfig = this.uiConfig;
        if (promoStickerUiConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(promoStickerUiConfig.backgroundColor);
        }
        parcel.writeString(this.daInfo);
    }

    public PromoSticker(List<ECRichText> list, PromoStickerUiConfig promoStickerUiConfig, String str) {
        this.labels = list;
        this.uiConfig = promoStickerUiConfig;
        this.daInfo = str;
    }
}
