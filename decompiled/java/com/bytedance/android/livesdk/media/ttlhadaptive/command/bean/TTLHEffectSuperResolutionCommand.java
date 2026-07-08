package com.bytedance.android.livesdk.media.ttlhadaptive.command.bean;

import X.AbstractC1268060j6S;
import X.C09CT;
import X.C1268220j6i;
import X.C2188811AlT;
import X.EnumC1268100j6W;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public final class TTLHEffectSuperResolutionCommand extends AbstractC1268060j6S implements Serializable {
    public static final C1268220j6i Companion = new Object() { // from class: X.0j6i
    };

    @C09CT("enable")
    public boolean enable;

    @C09CT("scale")
    public float scale;

    @C09CT("strategies")
    public String strategies;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHEffectSuperResolutionCommand(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", scale=");
        sbLIZ.append(this.scale);
        sbLIZ.append(", strategies=");
        sbLIZ.append(this.strategies);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1268060j6S
    public EnumC1268100j6W getCommandType() {
        return EnumC1268100j6W.GPU_TURBO;
    }

    public final String getStrategies() {
        return this.strategies;
    }

    public final void setStrategies(String str) {
        this.strategies = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHEffectSuperResolutionCommand fromHaspMap(java.util.HashMap<java.lang.String, java.lang.Object> r3, java.util.HashMap<java.lang.String, java.lang.Object> r4) {
        /*
            X.0j6i r0 = com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHEffectSuperResolutionCommand.Companion
            r0.getClass()
            com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHEffectSuperResolutionCommand r2 = new com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHEffectSuperResolutionCommand
            r2.<init>()
            r2.parseReportMap(r3, r4)
            java.lang.String r0 = "enable"
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L4e
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L4e
            int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            r0 = 1
            if (r1 != r0) goto L4e
        L22:
            r2.enable = r0
            java.lang.String r0 = "effect_downsampling_scale"
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L4c
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L4c
            float r0 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0)
        L36:
            r2.scale = r0
            java.lang.String r0 = "strategies"
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L48
        L46:
            java.lang.String r0 = "{}"
        L48:
            r2.setStrategies(r0)
            return r2
        L4c:
            r0 = 0
            goto L36
        L4e:
            r0 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHEffectSuperResolutionCommand.fromHaspMap(java.util.HashMap, java.util.HashMap):com.bytedance.android.livesdk.media.ttlhadaptive.command.bean.TTLHEffectSuperResolutionCommand");
    }
}
