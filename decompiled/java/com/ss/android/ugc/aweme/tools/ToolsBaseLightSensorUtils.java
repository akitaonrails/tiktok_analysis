package com.ss.android.ugc.aweme.tools;

import X.C0WZX;
import X.C1300690jx5;
import X.C19EG;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C838130WuJ;
import X.C844470XAv;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.property.BrightnessManager;
import com.ss.android.ugc.aweme.property.LifecycleContentObserver;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public final class ToolsBaseLightSensorUtils implements SensorEventListener {
    public static volatile float currentLightLevel;
    public static final ToolsBaseLightSensorUtils INSTANCE = new ToolsBaseLightSensorUtils();
    public static final CopyOnWriteArraySet<Function1<Float, Unit>> lightLevelListeners = new CopyOnWriteArraySet<>();
    public static final int $stable = 8;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public static final Cert monitorEnvironmentBrightness() {
        return CertProviderManagerKt.findCert("bpea-monitor_environment_brightness", 1476415491);
    }

    public final void registerSensorListener() throws Throwable {
        SensorManager sensorManager;
        C844470XAv.LIZ.getClass();
        Object objH2 = C786410Ut5.H2(C844470XAv.LIZ(), "sensor");
        Sensor sensorLJJL = null;
        if (objH2 instanceof SensorManager) {
            sensorManager = (SensorManager) objH2;
            if (sensorManager != null) {
                sensorLJJL = C2204961BRm.LJJL(sensorManager, 5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkgYaDItnBNuIg0j+OXL03ic5edex5IrV520=", null));
            }
        } else {
            sensorManager = null;
        }
        Cert certMonitorEnvironmentBrightness = monitorEnvironmentBrightness();
        if (sensorManager != null) {
            try {
                C1300690jx5.LIZJ(sensorManager, this, sensorLJJL, 3, certMonitorEnvironmentBrightness);
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void unregisterSensorListener() {
        SensorManager sensorManager;
        try {
            C844470XAv.LIZ.getClass();
            Object objH2 = C786410Ut5.H2(C844470XAv.LIZ(), "sensor");
            if ((objH2 instanceof SensorManager) && (sensorManager = (SensorManager) objH2) != null) {
                C1300690jx5.LJ(sensorManager, this, monitorEnvironmentBrightness());
            }
            C19EG c19eg = BrightnessManager.LIZJ;
            if (c19eg != null) {
                BrightnessManager.LJFF(c19eg);
            }
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final float getCurrentLightLevel() {
        return currentLightLevel;
    }

    private final void notifyLightLevelChanged(float f) {
        Iterator<Function1<Float, Unit>> it2 = lightLevelListeners.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Float.valueOf(f));
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor;
        C19EG c19eg;
        LifecycleOwner lifecycleOwner;
        if (sensorEvent != null && (sensor = sensorEvent.sensor) != null && C2204961BRm.LJJLIIIJLJLI(sensor, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkgYaDItnBNuIg0j+OXL03ic5edex5IrV520=", null)) == 5) {
            float f = sensorEvent.values[0];
            currentLightLevel = f;
            if (!BrightnessManager.LJFF && !BrightnessManager.LJI) {
                if (BrightnessManager.LIZIZ.enableLightSensor && (c19eg = BrightnessManager.LIZJ) != null) {
                    BrightnessManager.LJFF = true;
                    if (f > r1.darkLightThreshold) {
                        BrightnessManager.LIZIZ(BrightnessManager.LIZLLL, c19eg);
                    } else {
                        int iLJ = BrightnessManager.LJ(c19eg);
                        int i = BrightnessManager.LIZIZ.lightSensorThreshold;
                        if (iLJ > i) {
                            BrightnessManager.LIZIZ(BrightnessManager.LIZLLL, c19eg);
                        } else if (BrightnessManager.LIZJ() == 255.0f && BrightnessManager.LIZJ != null) {
                            float fLIZJ = ((i / 255.0f) * BrightnessManager.LIZJ()) / BrightnessManager.LIZJ();
                            C19EG c19eg2 = BrightnessManager.LIZJ;
                            if (c19eg2 != null && (lifecycleOwner = BrightnessManager.LIZLLL) != null) {
                                Window window = c19eg2.getWindow();
                                WindowManager.LayoutParams attributes = c19eg2.getWindow().getAttributes();
                                if (fLIZJ < 0.0f || fLIZJ >= 1.0f) {
                                    fLIZJ = -1.0f;
                                }
                                attributes.screenBrightness = fLIZJ;
                                window.setAttributes(attributes);
                                BrightnessManager.LJ = c19eg2.getWindow().getAttributes().screenBrightness;
                                c19eg2.getContentResolver().registerContentObserver(Settings.System.getUriFor("screen_brightness"), true, new LifecycleContentObserver(c19eg2, new BPEAHandler(), lifecycleOwner));
                            }
                        }
                    }
                }
            }
            notifyLightLevelChanged(f);
        }
    }

    public final void registerLightLevelListener(Function1<? super Float, Unit> function1) {
        lightLevelListeners.add(function1);
        if (currentLightLevel > 0.0f) {
            function1.invoke(Float.valueOf(currentLightLevel));
        }
    }

    public final void unregisterLightLevelListener(Function1<? super Float, Unit> function1) {
        lightLevelListeners.remove(function1);
    }
}
