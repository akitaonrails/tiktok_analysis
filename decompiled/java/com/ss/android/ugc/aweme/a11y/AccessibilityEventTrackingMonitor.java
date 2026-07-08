package com.ss.android.ugc.aweme.a11y;

import X.C01GW;
import X.C099R;
import X.C0PEM;
import X.C10ZL;
import X.C1305820k5M;
import X.C1305830k5N;
import X.C1305840k5O;
import X.C1305850k5P;
import X.C1305860k5Q;
import X.C1305890k5T;
import X.C1954807lC;
import X.C20684815ws;
import X.C2211631BhB;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C356901a3;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1305880k5S;
import X.InterfaceC1364105Vn;
import X.InterfaceC383701eN;
import android.app.UiModeManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes21.dex */
public final class AccessibilityEventTrackingMonitor {
    public static AccessibilityManager accessibilityManager;
    public static CaptioningManager captioningManager;
    public static UiModeManager uiModeManager;
    public static final AccessibilityEventTrackingMonitor INSTANCE = new AccessibilityEventTrackingMonitor();
    public static final C01GW startTimeMapping$delegate = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(31));
    public static final C01GW mutex$delegate = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(79));
    public static final C01GW touchExplorationStateChangeListener$delegate = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(32));

    private final AccessibilityManager.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
        return (AccessibilityManager.TouchExplorationStateChangeListener) touchExplorationStateChangeListener$delegate.getValue();
    }

    public final InterfaceC383701eN getMutex() {
        return (InterfaceC383701eN) mutex$delegate.getValue();
    }

    public final ConcurrentHashMap<EnumC1305880k5S, Long> getStartTimeMapping() {
        return (ConcurrentHashMap) startTimeMapping$delegate.getValue();
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.a11y.AccessibilityEventTrackingMonitor$init$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        public final /* synthetic */ Context LL;

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        public AnonymousClass1(Context context) {
            this.LL = context;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1305850k5P(this.LL, null), 3);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1305860k5Q(this.LL, null), 3);
        }
    }

    public final void init(Context context) {
        AccessibilityManager accessibilityManager2;
        CaptioningManager captioningManager2;
        Object objH2;
        Object objH22 = C786410Ut5.H2(context, "accessibility");
        UiModeManager uiModeManager2 = null;
        if (objH22 instanceof AccessibilityManager) {
            accessibilityManager2 = (AccessibilityManager) objH22;
        } else {
            accessibilityManager2 = null;
        }
        accessibilityManager = accessibilityManager2;
        try {
            objH2 = C786410Ut5.H2(context, "captioning");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (objH2 instanceof CaptioningManager) {
            captioningManager2 = (CaptioningManager) objH2;
        } else {
            captioningManager2 = null;
        }
        captioningManager = captioningManager2;
        Object objH23 = C786410Ut5.H2(context, "uimode");
        if (objH23 instanceof UiModeManager) {
            uiModeManager2 = (UiModeManager) objH23;
        }
        uiModeManager = uiModeManager2;
        AccessibilityManager accessibilityManager3 = accessibilityManager;
        if (accessibilityManager3 != null) {
            accessibilityManager3.addTouchExplorationStateChangeListener(getTouchExplorationStateChangeListener());
        }
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(new AnonymousClass1(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Boolean, java.lang.Integer> getSettingStatus(X.EnumC1305880k5S r9, android.content.Context r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.a11y.AccessibilityEventTrackingMonitor.getSettingStatus(X.0k5S, android.content.Context):kotlin.Pair");
    }

    public final Object trackTouchExplorationStateChange(boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1305820k5M(z, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    private final String getEventName(EnumC1305880k5S enumC1305880k5S, boolean z, String str) {
        if (z) {
            switch (C1305890k5T.LIZ[enumC1305880k5S.ordinal()]) {
                case 1:
                    return "start_voice_over";
                case 2:
                    return "start_dark_mode";
                case 3:
                    return "start_reduce_motion";
                case 4:
                    return "start_large_text";
                case 5:
                    return "start_increase_contrast";
                case 6:
                    return "start_bold_text";
                case 7:
                    return "start_color_inversion";
                case 8:
                    return "start_show_captions";
                case BdTuring.TYPE_ECAF /* 9 */:
                    return "start_dynamic_font";
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    return "start_voice_control";
                case BdTuring.TYPE_EMAIL /* 11 */:
                    return "start_touch_exploration";
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    return "start_disable_window_blurs";
                default:
                    throw new C1954807lC();
            }
        }
        switch (C1305890k5T.LIZ[enumC1305880k5S.ordinal()]) {
            case 1:
                return "voice_over_duration";
            case 2:
                return "dark_mode_duration";
            case 3:
                if (Intrinsics.LJFF(str, "app_start")) {
                    return "start_video_autoplay_off";
                }
                return "reduce_motion_duration";
            case 4:
                return "large_text_duration";
            case 5:
                return "increase_contrast_duration";
            case 6:
                return "bold_text_duration";
            case 7:
                return "color_inversion_duration";
            case 8:
                return "show_captions_duration";
            case BdTuring.TYPE_ECAF /* 9 */:
                return null;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "voice_control_duration";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "touch_exploration_duration";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "disable_window_blurs_duration";
            default:
                throw new C1954807lC();
        }
    }

    public final Object track(Context context, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1305830k5N(context, z, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public final void logAccessibilityEvent(EnumC1305880k5S enumC1305880k5S, boolean z, String str, long j, Object obj) {
        Long lValueOf;
        Long l;
        String eventName = getEventName(enumC1305880k5S, z, str);
        if (eventName == null) {
            return;
        }
        String strLJJIFFI = null;
        if (!z && (l = getStartTimeMapping().get(enumC1305880k5S)) != null) {
            lValueOf = Long.valueOf((j - l.longValue()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        } else {
            lValueOf = null;
        }
        C1305840k5O.LIZ.getClass();
        String strLJII = C2211631BhB.LJII();
        if (TextUtils.equals(C10ZL.LIZ(strLJII), strLJII)) {
            if (strLJII != null) {
                strLJJIFFI = u.LJJIFFI(strLJII, "cd", "", false);
            }
        } else {
            strLJJIFFI = strLJII;
        }
        String strLIZ = C10ZL.LIZ(strLJJIFFI);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", strLIZ);
        c2344009Gk.LJIIIIZZ("enter_method", str);
        if (lValueOf != null) {
            c2344009Gk.LIZLLL(lValueOf.longValue(), "duration");
        }
        if (obj != null) {
            c2344009Gk.LJ(obj, "font_size");
        }
        C20684815ws.LJIILLIIL(eventName, c2344009Gk.LIZ);
    }
}
