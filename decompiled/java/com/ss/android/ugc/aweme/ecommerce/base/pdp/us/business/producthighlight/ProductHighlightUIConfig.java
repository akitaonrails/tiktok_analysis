package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight.ItemConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight.ModuleConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight.ProductHighlightUIConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ProductHighlightUIConfig implements Parcelable {

    @C09CT("item_config")
    public final ItemConfig itemConfig;

    @C09CT("module_config")
    public final ModuleConfig moduleConfig;
    public static final Parcelable.Creator<ProductHighlightUIConfig> CREATOR = new Parcelable.Creator<ProductHighlightUIConfig>() { // from class: X.0mhK
        @Override // android.os.Parcelable.Creator
        public final ProductHighlightUIConfig createFromParcel(Parcel parcel) {
            ModuleConfig moduleConfigCreateFromParcel;
            ItemConfig itemConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                moduleConfigCreateFromParcel = null;
            } else {
                moduleConfigCreateFromParcel = ModuleConfig.CREATOR.createFromParcel(parcel);
            }
            ModuleConfig moduleConfig = moduleConfigCreateFromParcel;
            if (parcel.readInt() != 0) {
                itemConfigCreateFromParcel = ItemConfig.CREATOR.createFromParcel(parcel);
            }
            return new ProductHighlightUIConfig(moduleConfig, itemConfigCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ProductHighlightUIConfig[] newArray(int i) {
            return new ProductHighlightUIConfig[i];
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
        if (!(obj instanceof ProductHighlightUIConfig)) {
            return false;
        }
        ProductHighlightUIConfig productHighlightUIConfig = (ProductHighlightUIConfig) obj;
        return Intrinsics.LJFF(this.moduleConfig, productHighlightUIConfig.moduleConfig) && Intrinsics.LJFF(this.itemConfig, productHighlightUIConfig.itemConfig);
    }

    public final int hashCode() {
        ModuleConfig moduleConfig = this.moduleConfig;
        int iHashCode = (moduleConfig == null ? 0 : moduleConfig.hashCode()) * 31;
        ItemConfig itemConfig = this.itemConfig;
        return iHashCode + (itemConfig != null ? itemConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductHighlightUIConfig(moduleConfig=");
        sbLIZ.append(this.moduleConfig);
        sbLIZ.append(", itemConfig=");
        sbLIZ.append(this.itemConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ModuleConfig moduleConfig = this.moduleConfig;
        if (moduleConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            moduleConfig.writeToParcel(parcel, i);
        }
        ItemConfig itemConfig = this.itemConfig;
        if (itemConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            itemConfig.writeToParcel(parcel, i);
        }
    }

    public ProductHighlightUIConfig(ModuleConfig moduleConfig, ItemConfig itemConfig) {
        this.moduleConfig = moduleConfig;
        this.itemConfig = itemConfig;
    }
}
