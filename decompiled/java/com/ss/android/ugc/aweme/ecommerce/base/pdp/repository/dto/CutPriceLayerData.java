package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CutPriceLayerData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CutPriceSKUPanel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CutPriceLayerData implements Parcelable {

    @C09CT("cut_price_sku_panel")
    public final CutPriceSKUPanel cutPriceSkuPanel;
    public static final Parcelable.Creator<CutPriceLayerData> CREATOR = new Parcelable.Creator<CutPriceLayerData>() { // from class: X.03z0
        @Override // android.os.Parcelable.Creator
        public final CutPriceLayerData createFromParcel(Parcel parcel) {
            CutPriceSKUPanel cutPriceSKUPanelCreateFromParcel;
            if (parcel.readInt() == 0) {
                cutPriceSKUPanelCreateFromParcel = null;
            } else {
                cutPriceSKUPanelCreateFromParcel = CutPriceSKUPanel.CREATOR.createFromParcel(parcel);
            }
            return new CutPriceLayerData(cutPriceSKUPanelCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CutPriceLayerData[] newArray(int i) {
            return new CutPriceLayerData[i];
        }
    };
    public static final int $stable = 8;

    public CutPriceLayerData() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CutPriceLayerData) && Intrinsics.LJFF(this.cutPriceSkuPanel, ((CutPriceLayerData) obj).cutPriceSkuPanel);
    }

    public final int hashCode() {
        CutPriceSKUPanel cutPriceSKUPanel = this.cutPriceSkuPanel;
        if (cutPriceSKUPanel == null) {
            return 0;
        }
        return cutPriceSKUPanel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutPriceLayerData(cutPriceSkuPanel=");
        sbLIZ.append(this.cutPriceSkuPanel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CutPriceSKUPanel cutPriceSKUPanel = this.cutPriceSkuPanel;
        if (cutPriceSKUPanel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cutPriceSKUPanel.writeToParcel(parcel, i);
        }
    }

    public CutPriceLayerData(CutPriceSKUPanel cutPriceSKUPanel) {
        this.cutPriceSkuPanel = cutPriceSKUPanel;
    }
}
