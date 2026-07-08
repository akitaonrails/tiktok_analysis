package com.ss.android.ugc.aweme.video.simkit;

import X.C01GW;
import X.C07RR;
import X.C0C64;
import X.C1475000oUE;
import X.C1478180oZM;
import X.C1478900oaW;
import X.C1478980oae;
import X.EnumC1478870oaT;
import X.InterfaceC1479030oaj;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.setting.model.MLModel;

/* JADX INFO: loaded from: classes24.dex */
public class SpeedConfigImpl extends C1478900oaW {
    public final EnumC1478870oaT algorithmType;
    public final int calculatorType;
    public final InterfaceC1479030oaj intelligentAlgoConfig = new InterfaceC1479030oaj() { // from class: X.0oad
        {
            C1478990oaf.LIZ();
        }
    };

    @Override // X.C1478900oaW, com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public String getSpeedCalculateConfig() {
        C01GW c01gw = C07RR.LIZ;
        return (String) C07RR.LIZ.getValue();
    }

    public SpeedConfigImpl() {
        MLModel mLModel = C1478980oae.LIZIZ.LIZ;
        this.algorithmType = (mLModel == null || TextUtils.isEmpty(mLModel.packageUrl)) ? EnumC1478870oaT.DEFAULT : EnumC1478870oaT.INTELLIGENT;
        int i = 1;
        int i2 = C0C64.LJIILLIIL().LJIJ(31744, 0, "speed_monitor_sink", true) != 1 ? 1 : 2;
        if (C1478180oZM.LIZ(i2) != null || i2 == 1) {
            i = i2;
        } else if (C1475000oUE.LIZIZ().isDebug()) {
            throw new RuntimeException("no runtime cloud type speed predict module");
        }
        this.calculatorType = i;
    }

    @Override // X.C1478900oaW, com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public int getSpeedQueueSize() {
        return C0C64.LJIILLIIL().LJIJ(31744, 10, "video_speed_queue_size", true);
    }

    @Override // X.C1478900oaW, com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public int getCalculatorType() {
        return this.calculatorType;
    }

    @Override // X.C1478900oaW, com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public InterfaceC1479030oaj getIntelligentAlgoConfig() {
        return this.intelligentAlgoConfig;
    }

    @Override // X.C1478900oaW, com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public EnumC1478870oaT getSpeedAlgorithmType() {
        return this.algorithmType;
    }
}
