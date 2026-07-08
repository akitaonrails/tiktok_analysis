package com.bytedance.android.livesdk.chatroom.helper;

import X.C01GW;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C497740JfY;
import X.C823050WQl;
import android.provider.Settings;
import android.view.OrientationEventListener;
import com.bytedance.android.livesdk.OrientationSensorEvent;
import com.bytedance.android.livesdk.chatroom.helper.AudienceOrientationManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnableOrientationSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class AudienceOrientationManager {
    public static final AudienceOrientationManager LIZ = new AudienceOrientationManager();
    public static final AtomicInteger LIZIZ = new AtomicInteger(C497740JfY.LIZ);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(27));

    static {
        C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.0ITt
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AudienceOrientationManager@9332.<init>$1");
                try {
                    AudienceOrientationManager.LIZ.getClass();
                    C01GW c01gw = AudienceOrientationManager.LIZJ;
                    if (((OrientationEventListener) c01gw.getValue()).canDetectOrientation()) {
                        ((OrientationEventListener) c01gw.getValue()).enable();
                    } else {
                        ((OrientationEventListener) c01gw.getValue()).disable();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AudienceOrientationManager@9332.<init>$1");
            }
        });
    }

    public static final void start() {
        LIZ.LIZ(LIZIZ.get());
    }

    public final void LIZ(int i) {
        if (LiveEnableOrientationSetting.isEnable()) {
            int i2 = 0;
            if (Settings.System.getInt(C497740JfY.LJII().getContentResolver(), "accelerometer_rotation", 0) == 1) {
                if (i != 1) {
                    i2 = 1;
                }
                if (LIZIZ.compareAndSet(i2, i)) {
                    DataChannelGlobal.LLILZ.FQ2(OrientationSensorEvent.class, Integer.valueOf(i));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(">>>>>>>>>>【");
                    sbLIZ.append(this);
                    sbLIZ.append("】  call on orientation changed: ");
                    sbLIZ.append(i);
                    C20441214yg.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
    }
}
