package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Container;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LynxCreatorModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LynxCreatorModule implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<LynxCreatorModule> CREATOR = new Parcelable.Creator<LynxCreatorModule>() { // from class: X.042l
        @Override // android.os.Parcelable.Creator
        public final LynxCreatorModule createFromParcel(Parcel parcel) {
            Container containerCreateFromParcel;
            Container containerCreateFromParcel2 = null;
            if (parcel.readInt() == 0) {
                containerCreateFromParcel = null;
            } else {
                containerCreateFromParcel = Container.CREATOR.createFromParcel(parcel);
            }
            Container container = containerCreateFromParcel;
            if (parcel.readInt() != 0) {
                containerCreateFromParcel2 = Container.CREATOR.createFromParcel(parcel);
            }
            return new LynxCreatorModule(container, containerCreateFromParcel2);
        }

        @Override // android.os.Parcelable.Creator
        public final LynxCreatorModule[] newArray(int i) {
            return new LynxCreatorModule[i];
        }
    };

    @C09CT("expanding_container")
    public final Container expandingContainer;

    @C09CT("folding_container")
    public final Container foldingContainer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LynxCreatorModule)) {
            return false;
        }
        LynxCreatorModule lynxCreatorModule = (LynxCreatorModule) obj;
        return Intrinsics.LJFF(this.foldingContainer, lynxCreatorModule.foldingContainer) && Intrinsics.LJFF(this.expandingContainer, lynxCreatorModule.expandingContainer);
    }

    public final int hashCode() {
        Container container = this.foldingContainer;
        int iHashCode = (container == null ? 0 : container.hashCode()) * 31;
        Container container2 = this.expandingContainer;
        return iHashCode + (container2 != null ? container2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxCreatorModule(foldingContainer=");
        sbLIZ.append(this.foldingContainer);
        sbLIZ.append(", expandingContainer=");
        sbLIZ.append(this.expandingContainer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Container container = this.foldingContainer;
        if (container == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            container.writeToParcel(parcel, i);
        }
        Container container2 = this.expandingContainer;
        if (container2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            container2.writeToParcel(parcel, i);
        }
    }

    public LynxCreatorModule(Container container, Container container2) {
        this.foldingContainer = container;
        this.expandingContainer = container2;
    }
}
