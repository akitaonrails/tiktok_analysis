package com.ss.android.ugc.aweme.ecommerce.image.experiment;

import X.C08CX;
import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EcomImageDowngradeFirstScreenData {

    @C09CT("aggressive_downsample_config_client")
    public final Map<String, Integer> aggressiveDownsampleConfigByClient;

    @C09CT("aggressive_downsample_config_fe")
    public final Map<String, Integer> aggressiveDownsampleConfigByFE;

    @C09CT("disable_network_scenes_client")
    public final Set<String> disableNetworkScenesByClient;

    @C09CT("disable_network_scenes_fe")
    public final Set<String> disableNetworkScenesByFE;

    @C09CT("enable")
    public final int enable;

    @C09CT("enable_aggressive_downsample")
    public final int enableAggressiveDownsample;

    @C09CT("enable_disable_network")
    public final int enableDisableNetwork;

    public EcomImageDowngradeFirstScreenData() {
        this(0, 0, null, null, 0, null, null, 127, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcomImageDowngradeFirstScreenData)) {
            return false;
        }
        EcomImageDowngradeFirstScreenData ecomImageDowngradeFirstScreenData = (EcomImageDowngradeFirstScreenData) obj;
        return this.enable == ecomImageDowngradeFirstScreenData.enable && this.enableDisableNetwork == ecomImageDowngradeFirstScreenData.enableDisableNetwork && Intrinsics.LJFF(this.disableNetworkScenesByFE, ecomImageDowngradeFirstScreenData.disableNetworkScenesByFE) && Intrinsics.LJFF(this.disableNetworkScenesByClient, ecomImageDowngradeFirstScreenData.disableNetworkScenesByClient) && this.enableAggressiveDownsample == ecomImageDowngradeFirstScreenData.enableAggressiveDownsample && Intrinsics.LJFF(this.aggressiveDownsampleConfigByFE, ecomImageDowngradeFirstScreenData.aggressiveDownsampleConfigByFE) && Intrinsics.LJFF(this.aggressiveDownsampleConfigByClient, ecomImageDowngradeFirstScreenData.aggressiveDownsampleConfigByClient);
    }

    public int hashCode() {
        return (((((((((((this.enable * 31) + this.enableDisableNetwork) * 31) + this.disableNetworkScenesByFE.hashCode()) * 31) + this.disableNetworkScenesByClient.hashCode()) * 31) + this.enableAggressiveDownsample) * 31) + this.aggressiveDownsampleConfigByFE.hashCode()) * 31) + this.aggressiveDownsampleConfigByClient.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcomImageDowngradeFirstScreenData(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", enableDisableNetwork=");
        sbLIZ.append(this.enableDisableNetwork);
        sbLIZ.append(", disableNetworkScenesByFE=");
        sbLIZ.append(this.disableNetworkScenesByFE);
        sbLIZ.append(", disableNetworkScenesByClient=");
        sbLIZ.append(this.disableNetworkScenesByClient);
        sbLIZ.append(", enableAggressiveDownsample=");
        sbLIZ.append(this.enableAggressiveDownsample);
        sbLIZ.append(", aggressiveDownsampleConfigByFE=");
        sbLIZ.append(this.aggressiveDownsampleConfigByFE);
        sbLIZ.append(", aggressiveDownsampleConfigByClient=");
        sbLIZ.append(this.aggressiveDownsampleConfigByClient);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcomImageDowngradeFirstScreenData(int i, int i2, Set<String> set, Set<String> set2, int i3, Map<String, Integer> map, Map<String, Integer> map2) {
        this.enable = i;
        this.enableDisableNetwork = i2;
        this.disableNetworkScenesByFE = set;
        this.disableNetworkScenesByClient = set2;
        this.enableAggressiveDownsample = i3;
        this.aggressiveDownsampleConfigByFE = map;
        this.aggressiveDownsampleConfigByClient = map2;
    }

    public EcomImageDowngradeFirstScreenData(int i, int i2, Set set, Set set2, int i3, Map map, Map map2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? C08CX.INSTANCE : set, (i4 & 8) != 0 ? C08CX.INSTANCE : set2, (i4 & 16) == 0 ? i3 : 0, (i4 & 32) != 0 ? C2097608Jq.LJ() : map, (i4 & 64) != 0 ? C2097608Jq.LJ() : map2);
    }
}
