package com.ss.android.ttve.nativePort;

import X.C21690319uf;
import X.C786410Ut5;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.util.Pair;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.runtime.VERuntime;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes34.dex */
public class TESystemUtils {
    public static int getOutputAudioDeviceType() {
        new C21690319uf();
        return C21690319uf.LIZ().ordinal();
    }

    public static Pair<Integer, Integer> getSuggestedOutputProperty() {
        Context context = VERuntime.getInstance().getContext();
        if (context == null) {
            return null;
        }
        AudioManager audioManager = (AudioManager) C786410Ut5.H2(context, "audio");
        String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        String property2 = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        try {
            return new Pair<>(Integer.valueOf(CastIntegerProtector.parseInt(property)), Integer.valueOf(CastIntegerProtector.parseInt(property2)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean hasLowLatencyFeature() {
        PackageManager packageManager;
        Context context = VERuntime.getInstance().getContext();
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        try {
            return packageManager.hasSystemFeature("android.hardware.audio.low_latency");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static int getAudioTrackBufferSize(int i) {
        return AudioTrack.getMinBufferSize(i, 12, 2);
    }

    public static int getOutputLatency(int i) {
        try {
            Class<?> cls = Class.forName("android.media.AudioSystem");
            Method declaredMethod = cls.getDeclaredMethod("getOutputLatency", Integer.TYPE);
            if (declaredMethod == null) {
                return 0;
            }
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(cls, Integer.valueOf(i))).intValue();
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return 0;
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            return 0;
        }
    }
}
