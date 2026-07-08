package com.ss.android.ugc.aweme.ecommerce.base.bundlepanel;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundleSkuDescriptorEvent;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.SkuDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleSkuDescriptorEvent implements Parcelable {

    @C09CT("is_sku_available")
    public final boolean isSkuAvailable;

    @C09CT("sku_descriptor")
    public final SkuDescriptor skuDescriptor;
    public static final Parcelable.Creator<BundleSkuDescriptorEvent> CREATOR = new Parcelable.Creator<BundleSkuDescriptorEvent>() { // from class: X.03yo
        @Override // android.os.Parcelable.Creator
        public final BundleSkuDescriptorEvent createFromParcel(Parcel parcel) {
            SkuDescriptor skuDescriptorCreateFromParcel;
            boolean z;
            if (parcel.readInt() == 0) {
                skuDescriptorCreateFromParcel = null;
            } else {
                skuDescriptorCreateFromParcel = SkuDescriptor.CREATOR.createFromParcel(parcel);
            }
            SkuDescriptor skuDescriptor = skuDescriptorCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new BundleSkuDescriptorEvent(skuDescriptor, z);
        }

        @Override // android.os.Parcelable.Creator
        public final BundleSkuDescriptorEvent[] newArray(int i) {
            return new BundleSkuDescriptorEvent[i];
        }
    };
    public static final int $stable = 8;

    public BundleSkuDescriptorEvent() {
        this(null, false);
    }

    public final BundleSkuDescriptorEvent copy(SkuDescriptor skuDescriptor, boolean z) {
        return new BundleSkuDescriptorEvent(skuDescriptor, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleSkuDescriptorEvent)) {
            return false;
        }
        BundleSkuDescriptorEvent bundleSkuDescriptorEvent = (BundleSkuDescriptorEvent) obj;
        return Intrinsics.LJFF(this.skuDescriptor, bundleSkuDescriptorEvent.skuDescriptor) && this.isSkuAvailable == bundleSkuDescriptorEvent.isSkuAvailable;
    }

    public int hashCode() {
        SkuDescriptor skuDescriptor = this.skuDescriptor;
        return ((skuDescriptor == null ? 0 : skuDescriptor.hashCode()) * 31) + C786410Ut5.Z2(this.isSkuAvailable);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BundleSkuDescriptorEvent(skuDescriptor=");
        sbLIZ.append(this.skuDescriptor);
        sbLIZ.append(", isSkuAvailable=");
        sbLIZ.append(this.isSkuAvailable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SkuDescriptor skuDescriptor = this.skuDescriptor;
        if (skuDescriptor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            skuDescriptor.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isSkuAvailable ? 1 : 0);
    }

    public final SkuDescriptor getSkuDescriptor() {
        return this.skuDescriptor;
    }

    public final boolean isSkuAvailable() {
        return this.isSkuAvailable;
    }

    public BundleSkuDescriptorEvent(SkuDescriptor skuDescriptor, boolean z) {
        this.skuDescriptor = skuDescriptor;
        this.isSkuAvailable = z;
    }
}
