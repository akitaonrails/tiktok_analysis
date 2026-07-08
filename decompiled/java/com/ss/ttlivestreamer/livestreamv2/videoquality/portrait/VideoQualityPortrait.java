package com.ss.ttlivestreamer.livestreamv2.videoquality.portrait;

import X.C09CT;
import X.C0NDD;
import X.C2215471BnN;
import X.EnumC2215461BnM;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes35.dex */
public class VideoQualityPortrait {
    public Float LIZ;

    @C09CT("rule_data_type")
    public EnumC2215461BnM dataType = EnumC2215461BnM.DEFAULT;

    @C09CT("rule_name")
    public String name;

    @C09CT("portraits_source")
    public C0NDD source;

    public final void LIZ(String str) {
        try {
            int i = C2215471BnN.LIZ[this.dataType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LIZ = Float.valueOf(CastFloatProtector.parseFloat(str));
                    return;
                }
                return;
            }
            CastIntegerProtector.parseInt(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
