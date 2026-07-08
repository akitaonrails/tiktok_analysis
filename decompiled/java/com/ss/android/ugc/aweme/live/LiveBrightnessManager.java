package com.ss.android.ugc.aweme.live;

import X.C1300690jx5;
import X.C14CD;
import X.C1697810uHb;
import X.C19EG;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ttlive.settings.LiveBrightnessConfig;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class LiveBrightnessManager extends ContentObserver implements SensorEventListener {
    public final Fragment LL;
    public final Window LLILLJJLI;
    public SensorManager LLILLL;
    public Sensor LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final float LLJI;
    public final List<Integer> LLJIJIL;
    public final LiveBrightnessConfig LLJILJIL;
    public final Cert LLJILJILJ;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void release() {
        Window window;
        WindowManager.LayoutParams attributes;
        ContentResolver contentResolver;
        this.LLILZLL = false;
        if (this.LLIZ) {
            this.LLIZ = false;
            try {
                SensorManager sensorManager = this.LLILLL;
                if (sensorManager != null) {
                    C1300690jx5.LJ(sensorManager, this, this.LLJILJILJ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LLILLL = null;
        this.LLILZ = null;
        if (this.LLIZLLLIL) {
            this.LLIZLLLIL = false;
            try {
                C19EG activity = this.LL.getActivity();
                if (activity != null && (contentResolver = activity.getContentResolver()) != null) {
                    contentResolver.unregisterContentObserver(this);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        if (this.LLILZIL != -1.0f && (window = this.LLILLJJLI) != null && (attributes = window.getAttributes()) != null) {
            attributes.screenBrightness = -1.0f;
        }
        this.LLILZIL = -1.0f;
    }

    public final void LIZ() {
        ContentResolver contentResolver;
        if (this.LLILLJJLI == null) {
            return;
        }
        this.LLILZLL = true;
        this.LLJ = true;
        this.LLIZLLLIL = true;
        C19EG activity = this.LL.getActivity();
        if (activity != null && (contentResolver = activity.getContentResolver()) != null) {
            contentResolver.registerContentObserver(Settings.System.getUriFor("screen_brightness"), true, this);
        }
        this.LL.getLifecycle().addObserver(new LiveBrightnessManager$init$1(this));
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        release();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSensorChanged(android.hardware.SensorEvent r9) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.LiveBrightnessManager.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public LiveBrightnessManager(Fragment fragment, Window window, BPEAHandler bPEAHandler) {
        super(bPEAHandler);
        this.LL = fragment;
        this.LLILLJJLI = window;
        this.LLILZIL = -1.0f;
        this.LLJI = 255.0f;
        this.LLJIJIL = C1697810uHb.LJIIJJI(128, 144, 159, 185, 205);
        this.LLJILJIL = (LiveBrightnessConfig) C14CD.LIZIZ.getValue();
        this.LLJILJILJ = CertProviderManagerKt.findCert("bpea-go_live_check_env_light", 1476415511);
    }
}
