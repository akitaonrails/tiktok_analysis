package com.bytedance.android.livesdk.comp.impl.linkcore.tracker;

import X.C1304630k3R;
import X.C1304660k3U;
import X.C2188811AlT;
import X.C939210aY3;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAssertSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRustMonitorConfigSetting;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class JniTrackerNativeApi {
    public static final JniTrackerNativeApi INSTANCE = new JniTrackerNativeApi();

    public static final native void nativeDeleteNode(String str, String str2, String str3, Map<String, String> map);

    public static final native void nativeEndLifecycle(String str, String str2);

    public static final native String nativeInterceptTrackEvent(String str, String str2, String str3, String str4, Map<String, String> map);

    public static final native void nativeSaveNode(String str, String str2, String str3, Map<String, String> map);

    public static final native void nativeSetupTracker(String str);

    public static final native void nativeStartLifecycle(String str, String str2);

    public static final native void nativeTrackEvent(String str, String str2, String str3, String str4, Map<String, String> map);

    static {
        try {
            INVOKESTATIC_com_bytedance_android_livesdk_comp_impl_linkcore_tracker_JniTrackerNativeApi_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("link_mic_sdk");
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("call tracker native error: ");
            sbLIZ.append(e.getMessage());
            C939210aY3.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), "CallException");
            if (C1304630k3R.LIZIZ && LinkMicAssertSetting.INSTANCE.enable()) {
                throw new AssertionError(e);
            }
            if (LinkMicRustMonitorConfigSetting.INSTANCE.canReport()) {
                C1304660k3U.LIZ.LIZIZ(520, "call tracker error", e, null);
            }
        }
    }

    public static void INVOKESTATIC_com_bytedance_android_livesdk_comp_impl_linkcore_tracker_JniTrackerNativeApi_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }
}
