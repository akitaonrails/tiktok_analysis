package com.ss.android.ugc.nearby.container.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1204490hRv;
import X.InterfaceC1891350zJl;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyPlaceHolderModel implements InterfaceC1204490hRv {

    @C09CT("place_holder")
    public final int placeHolder;

    public NearbyPlaceHolderModel() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NearbyPlaceHolderModel) && this.placeHolder == ((NearbyPlaceHolderModel) obj).placeHolder;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.placeHolder;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyPlaceHolderModel(placeHolder=");
        sbLIZ.append(this.placeHolder);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NearbyPlaceHolderModel(int i) {
        this.placeHolder = i;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        NearbyPlaceHolderModel nearbyPlaceHolderModel;
        if (interfaceC1891350zJl instanceof NearbyPlaceHolderModel) {
            nearbyPlaceHolderModel = (NearbyPlaceHolderModel) interfaceC1891350zJl;
        } else {
            nearbyPlaceHolderModel = null;
        }
        if (nearbyPlaceHolderModel == null || nearbyPlaceHolderModel.placeHolder != this.placeHolder) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof NearbyPlaceHolderModel;
    }
}
