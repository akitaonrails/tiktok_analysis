package com.ss.android.ugc.nearby.roaming;

import X.C09CT;
import X.C13LP;
import X.C2095008Iq;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class RoamingLocationInfo {

    @C09CT("is_manual_select")
    public final boolean isManual;

    @C09CT("manual_region")
    public final String manualRegion;

    @C09CT("manual_region_name")
    public final String manualRegionName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoamingLocationInfo)) {
            return false;
        }
        RoamingLocationInfo roamingLocationInfo = (RoamingLocationInfo) obj;
        return Intrinsics.LJFF(this.manualRegion, roamingLocationInfo.manualRegion) && Intrinsics.LJFF(this.manualRegionName, roamingLocationInfo.manualRegionName) && this.isManual == roamingLocationInfo.isManual;
    }

    public final String getCityCode() {
        try {
            String str = this.manualRegion;
            if (str != null) {
                return (String) a0.LJJLIIIJILLIZJL(str, new String[]{"_"}, 0, 6).get(1);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final String getL0Code() {
        try {
            String str = this.manualRegion;
            if (str != null) {
                return (String) a0.LJJLIIIJILLIZJL(str, new String[]{"_"}, 0, 6).get(0);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final String getLevel() {
        try {
            String str = this.manualRegion;
            if (str != null) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"_"}, 0, 6);
                if (!(listLJJLIIIJILLIZJL.size() == 3)) {
                    listLJJLIIIJILLIZJL = null;
                }
                if (listLJJLIIIJILLIZJL != null) {
                    return (String) C13LP.LJJJLZIJ(2, listLJJLIIIJILLIZJL);
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RoamingLocationInfo(manualRegion=");
        sbLIZ.append(this.manualRegion);
        sbLIZ.append(", manualRegionName=");
        sbLIZ.append(this.manualRegionName);
        sbLIZ.append(", isManual=");
        sbLIZ.append(this.isManual);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final LocationRegion toLocationRegionIfManual() {
        Long lLJIILIIL;
        if (!this.isManual) {
            return null;
        }
        String cityCode = getCityCode();
        long jLongValue = (cityCode == null || (lLJIILIIL = C2095008Iq.LJIILIIL(cityCode)) == null) ? 0L : lLJIILIIL.longValue();
        String l0Code = getL0Code();
        String level = getLevel();
        return new LocationRegion(jLongValue, null, null, level != null ? C2095008Iq.LJIIJJI(level) : null, null, null, null, null, l0Code, null);
    }

    public final boolean isManual() {
        return this.isManual;
    }

    public RoamingLocationInfo(String str, String str2, boolean z) {
        this.manualRegion = str;
        this.manualRegionName = str2;
        this.isManual = z;
    }
}
