package com.ss.android.ugc.aweme.simkit.model.bitrateselect;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1477480oYE;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class GearConfig implements InterfaceC1477480oYE {

    @C09CT("bitrate_range")
    public List<Double> bitrateRange;

    @C09CT("default_bitrate")
    public double defaultBitrate;

    @C09CT("default_gear_name")
    public String defaultGearName;

    @C09CT("gear_group")
    public Set<String> gearGroup;

    @Override // X.InterfaceC1477480oYE
    public final Pair<Double, Double> LIZLLL() {
        List<Double> list = this.bitrateRange;
        if (list == null || list.size() != 2) {
            return null;
        }
        return new Pair<>(ListProtector.get(this.bitrateRange, 0), ListProtector.get(this.bitrateRange, 1));
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GearConfig{defaultGearName='");
        sbLIZ.append(this.defaultGearName);
        sbLIZ.append('\'');
        sbLIZ.append(", gearGroup=");
        sbLIZ.append(this.gearGroup);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1477480oYE
    public final Set<String> LIZ() {
        return this.gearGroup;
    }

    @Override // X.InterfaceC1477480oYE
    public final String LIZIZ() {
        return this.defaultGearName;
    }

    @Override // X.InterfaceC1477480oYE
    public final double LIZJ() {
        return this.defaultBitrate;
    }
}
