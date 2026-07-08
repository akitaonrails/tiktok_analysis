package com.ss.android.ugc.nearby.roaming;

import X.C09CT;
import X.C1440005kM;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1294060jmO
public final class NearbyLocationRegion implements IEvent {

    @C09CT("is_current_region")
    public final boolean isCurrentRegionAutoSelected;

    @C09CT("region")
    public final LocationRegion region;

    public final NearbyLocationRegion copy(LocationRegion locationRegion, boolean z) {
        return new NearbyLocationRegion(locationRegion, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyLocationRegion)) {
            return false;
        }
        NearbyLocationRegion nearbyLocationRegion = (NearbyLocationRegion) obj;
        return Intrinsics.LJFF(this.region, nearbyLocationRegion.region) && this.isCurrentRegionAutoSelected == nearbyLocationRegion.isCurrentRegionAutoSelected;
    }

    public int hashCode() {
        return (this.region.hashCode() * 31) + C786410Ut5.Z2(this.isCurrentRegionAutoSelected);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyLocationRegion(region=");
        sbLIZ.append(this.region);
        sbLIZ.append(", isCurrentRegionAutoSelected=");
        sbLIZ.append(this.isCurrentRegionAutoSelected);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final LocationRegion getRegion() {
        return this.region;
    }

    public final boolean isCurrentRegionAutoSelected() {
        return this.isCurrentRegionAutoSelected;
    }

    public NearbyLocationRegion(LocationRegion locationRegion, boolean z) {
        this.region = locationRegion;
        this.isCurrentRegionAutoSelected = z;
    }
}
