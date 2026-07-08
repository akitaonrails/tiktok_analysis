package com.ss.android.ugc.aweme.video.simplayer.tt;

import X.C01GW;
import X.C1475000oUE;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC582280Msc;
import android.content.Intent;
import android.content.IntentFilter;
import com.ss.android.ugc.aweme.video.simplayer.tt.PlayerStrategyCenterChannel;
import com.ss.ttm.strategycenter.TTPlayerStrategyCenter;
import com.ttkmedia.datacenter.api.DataCenter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public final class PlayerStrategyCenterChannel implements InterfaceC582280Msc {
    public static final C01GW<PlayerStrategyCenterChannel> LIZJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new Function0() { // from class: X.0kAn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new PlayerStrategyCenterChannel();
        }
    });
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public double LIZ = 0.2d;
    public long LIZIZ;

    @Override // X.InterfaceC582280Msc
    public final void init() {
        if (LIZLLL || LJ) {
            return;
        }
        LJ = true;
        TTPlayerStrategyCenter tTPlayerStrategyCenterLIZ = TTPlayerStrategyCenter.LIZ();
        long featureHandle = DataCenter.getInstance().getFeatureHandle();
        tTPlayerStrategyCenterLIZ.getClass();
        TTPlayerStrategyCenter.LJ(featureHandle);
        TTPlayerStrategyCenter.LIZ().getClass();
        TTPlayerStrategyCenter.LIZIZ();
        LIZLLL = true;
        LJ = false;
    }

    @Override // X.InterfaceC582280Msc
    public final void LIZIZ() throws Exception {
        if (System.currentTimeMillis() - this.LIZIZ >= 300000) {
            Intent intentLJIJI = C786410Ut5.LJIJI(C1475000oUE.LIZ, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentLJIJI != null) {
                Double dValueOf = Double.valueOf(((double) intentLJIJI.getIntExtra("level", -1)) / ((double) intentLJIJI.getIntExtra("scale", -1)));
                if (dValueOf != null) {
                    this.LIZ = dValueOf.doubleValue();
                }
            }
            this.LIZIZ = System.currentTimeMillis();
            if (this.LIZ < 0.2d) {
                TTPlayerStrategyCenter.LIZ().getClass();
                TTPlayerStrategyCenter.LIZJ(2);
            } else {
                TTPlayerStrategyCenter.LIZ().getClass();
                TTPlayerStrategyCenter.LIZJ(3);
            }
        }
    }

    @Override // X.InterfaceC582280Msc
    public final void LIZ(boolean z) {
        if (z) {
            TTPlayerStrategyCenter.LIZ().getClass();
            TTPlayerStrategyCenter.LIZJ(0);
        } else {
            TTPlayerStrategyCenter.LIZ().getClass();
            TTPlayerStrategyCenter.LIZJ(1);
        }
    }
}
