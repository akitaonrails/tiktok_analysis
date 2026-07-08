package com.ss.android.ugc.aweme.property;

import X.AbstractC1655680tBe;
import X.C01GW;
import X.C0C64;
import X.C1409905fV;
import X.C1457310o1h;
import X.C14LO;
import X.C14LP;
import X.C1655670tBd;
import X.C1954807lC;
import X.C19EG;
import X.C280100AyO;
import X.C452501pT;
import X.C786410Ut5;
import X.C844470XAv;
import X.C855790Xhh;
import Y.ARunnableS83S0000000_3;
import android.content.Context;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import ayh.c0;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.ToolsBaseLightSensorUtils;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class BrightnessManager {
    public static C19EG LIZJ;
    public static LifecycleOwner LIZLLL;
    public static boolean LJFF;
    public static boolean LJI;
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(84));
    public static NewBrightnessEnhanceConfig LIZIZ = new NewBrightnessEnhanceConfig();
    public static float LJ = -1.0f;
    public static final Set<LifecycleOwner> LJII = new LinkedHashSet();

    public static float LIZJ() {
        return ((Number) LIZ.getValue()).floatValue();
    }

    public static float LIZLLL() {
        float f = LJ;
        if (f != -1.0f) {
            return f * LIZJ();
        }
        C844470XAv.LIZ.getClass();
        return LJ(C844470XAv.LIZ());
    }

    public static final class LifecycleAwareCleanupObserver implements LifecycleEventObserver {
        public final LifecycleOwner LL;

        public LifecycleAwareCleanupObserver(LifecycleOwner lifecycleOwner) {
            this.LL = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                BrightnessManager.LJII.remove(this.LL);
                this.LL.getLifecycle().removeObserver(this);
                ToolsBaseLightSensorUtils.INSTANCE.unregisterSensorListener();
                BrightnessManager.LJI = true;
                BrightnessManager.LIZJ = null;
                BrightnessManager.LIZLLL = null;
            }
        }
    }

    public static int LJ(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    public static void LJFF(C19EG c19eg) {
        Window window = c19eg.getWindow();
        WindowManager.LayoutParams attributes = c19eg.getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        window.setAttributes(attributes);
        LJFF = false;
        LJ = -1.0f;
        LIZJ = null;
        LIZLLL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[PHI: r2
      0x0066: PHI (r2v4 X.14La) = (r2v3 X.14La), (r2v5 X.14La), (r2v6 X.14La) binds: [B:11:0x0042, B:13:0x0053, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(androidx.lifecycle.LifecycleOwner r9, X.C19EG r10) {
        /*
            float r0 = LIZJ()
            r8 = 1132396544(0x437f0000, float:255.0)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r4 = 1
            if (r0 != 0) goto Lbe
            int r2 = LJ(r10)
            float r3 = (float) r2
            float r0 = X.C14LN.LIZIZ()
            float r7 = r3 / r0
            X.14LQ r6 = X.C14LQ.LIZIZ
            r6.getClass()
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L67
            r0 = 1063379426(0x3f61e1e2, float:0.88235295)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L67
            java.util.ArrayList<java.lang.Integer> r1 = X.C14LQ.LIZJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L67
            X.14LS r2 = X.C14LS.LIZIZ
            r2.getClass()
            X.0F28 r1 = X.C14LS.LIZJ
            java.lang.Float r0 = java.lang.Float.valueOf(r7)
            boolean r0 = r1.LIZJ(r0)
            if (r0 != 0) goto L66
            X.14LT r2 = X.C14LT.LIZIZ
            r2.getClass()
            X.0F28 r1 = X.C14LT.LIZJ
            java.lang.Float r0 = java.lang.Float.valueOf(r7)
            boolean r0 = r1.LIZJ(r0)
            if (r0 != 0) goto L66
            X.14LR r2 = X.C14LR.LIZIZ
            r2.getClass()
            X.0F28 r1 = X.C14LR.LIZJ
            java.lang.Float r0 = java.lang.Float.valueOf(r7)
            boolean r0 = r1.LIZJ(r0)
            if (r0 == 0) goto L67
        L66:
            r6 = r2
        L67:
            int r0 = r6.LIZ()
            if (r0 != 0) goto L6e
            return
        L6e:
            float r1 = (float) r0
            float r1 = r1 / r8
            float r0 = LIZJ()
            float r1 = r1 * r0
            float r3 = r3 + r1
            float r0 = LIZJ()
            float r3 = r3 / r0
            if (r9 == 0) goto Lbd
            android.view.Window r2 = r10.getWindow()
            android.view.Window r0 = r10.getWindow()
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L93
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L95
        L93:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L95:
            r1.screenBrightness = r3
            r2.setAttributes(r1)
            android.view.Window r0 = r10.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            float r0 = r0.screenBrightness
            com.ss.android.ugc.aweme.property.BrightnessManager.LJ = r0
            android.content.ContentResolver r3 = r10.getContentResolver()
            java.lang.String r0 = "screen_brightness"
            android.net.Uri r2 = android.provider.Settings.System.getUriFor(r0)
            com.ss.android.ugc.aweme.property.LifecycleContentObserver r1 = new com.ss.android.ugc.aweme.property.LifecycleContentObserver
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
            r0.<init>()
            r1.<init>(r10, r0, r9)
            r3.registerContentObserver(r2, r4, r1)
        Lbd:
            return
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.property.BrightnessManager.LIZIZ(androidx.lifecycle.LifecycleOwner, X.19EG):void");
    }

    public static void LIZ(C19EG c19eg, LifecycleOwner lifecycleOwner, AbstractC1655680tBe abstractC1655680tBe) {
        if (!((Boolean) C280100AyO.LIZ.getValue()).booleanValue() || LIZJ() == -1.0f) {
            return;
        }
        NewBrightnessEnhanceConfig newBrightnessEnhanceConfig = new NewBrightnessEnhanceConfig();
        if (Intrinsics.LJFF(abstractC1655680tBe, C1655670tBd.LIZ)) {
            c0.LIZ.getClass();
            newBrightnessEnhanceConfig.enable = c0.LIZLLL;
            newBrightnessEnhanceConfig.darkness = c0.LJ;
            newBrightnessEnhanceConfig.bright = c0.LJI;
            newBrightnessEnhanceConfig.normal = c0.LJFF;
            newBrightnessEnhanceConfig.special = c0.LJII;
            newBrightnessEnhanceConfig.enableLightSensor = c0.LJIIIIZZ;
            newBrightnessEnhanceConfig.darkLightThreshold = c0.LJIIIZ;
            newBrightnessEnhanceConfig.lightSensorThreshold = c0.LJIIJ;
        } else if (Intrinsics.LJFF(abstractC1655680tBe, C1457310o1h.LIZ)) {
            newBrightnessEnhanceConfig.enable = C14LP.LIZJ;
            newBrightnessEnhanceConfig.darkness = C14LP.LIZLLL;
            newBrightnessEnhanceConfig.bright = C14LP.LJFF;
            newBrightnessEnhanceConfig.normal = C14LP.LJ;
            newBrightnessEnhanceConfig.special = C14LP.LJI;
            newBrightnessEnhanceConfig.enableLightSensor = C14LP.LJII;
            newBrightnessEnhanceConfig.darkLightThreshold = C14LP.LJIIIIZZ;
            newBrightnessEnhanceConfig.lightSensorThreshold = C14LP.LJIIIZ;
        } else if (Intrinsics.LJFF(abstractC1655680tBe, C855790Xhh.LIZ)) {
            newBrightnessEnhanceConfig.enable = C14LO.LIZJ;
            newBrightnessEnhanceConfig.darkness = C14LO.LIZLLL;
            newBrightnessEnhanceConfig.bright = C14LO.LJFF;
            newBrightnessEnhanceConfig.normal = C14LO.LJ;
            newBrightnessEnhanceConfig.special = C14LO.LJI;
            newBrightnessEnhanceConfig.enableLightSensor = C14LO.LJII;
            newBrightnessEnhanceConfig.darkLightThreshold = C14LO.LJIIIIZZ;
            newBrightnessEnhanceConfig.lightSensorThreshold = C14LO.LJIIIZ;
        } else {
            throw new C1954807lC();
        }
        LIZIZ = newBrightnessEnhanceConfig;
        LJI = false;
        ToolsBaseLightSensorUtils toolsBaseLightSensorUtils = ToolsBaseLightSensorUtils.INSTANCE;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "start_shoot_downgrade_opt_exp", true) > 0) {
            if (!C1409905fV.LJFF) {
                C1409905fV.LJFF = true;
                C786410Ut5.h4().execute(new ARunnableS83S0000000_3(1));
            } else {
                toolsBaseLightSensorUtils.registerSensorListener();
                C1409905fV.LJFF = false;
            }
        } else {
            toolsBaseLightSensorUtils.registerSensorListener();
        }
        NewBrightnessEnhanceConfig newBrightnessEnhanceConfig2 = LIZIZ;
        if (newBrightnessEnhanceConfig2.enable) {
            if (newBrightnessEnhanceConfig2.enableLightSensor) {
                if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                    return;
                }
                LIZJ = c19eg;
                LIZLLL = lifecycleOwner;
                if (LJII.add(lifecycleOwner)) {
                    lifecycleOwner.getLifecycle().addObserver(new LifecycleAwareCleanupObserver(lifecycleOwner));
                    return;
                }
                return;
            }
            LIZIZ(lifecycleOwner, c19eg);
            return;
        }
        LJFF(c19eg);
    }
}
