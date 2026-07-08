package com.ss.android.ugc.aweme.live;

import X.AbstractActivityC484150Iyj;
import X.C01GW;
import X.C04QR;
import X.C0IGR;
import X.C0IJT;
import X.C0UVS;
import X.C128Y;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C2095008Iq;
import X.C299020Bno;
import X.C335910DEv;
import X.C474500IjA;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.EnumC785640Urq;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.broadcast.GamePhoneAsCameraEnableSetting;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public final class GameBroadcastAsCameraActivity extends AbstractActivityC484150Iyj {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9HELIOSDyQhLA0hJyQoKi4gPAQ/Ci4+LTctCCwnITMlPTY=";
    public final C01GW LL = RouteArgExtension.INSTANCE.navArg(this);

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.GameBroadcastAsCameraActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.GameBroadcastAsCameraActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.GameBroadcastAsCameraActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.GameBroadcastAsCameraActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.GameBroadcastAsCameraActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C128Y c128yLJJJJZ = getSupportFragmentManager().LJJJJZ(R.id.iiv);
        if (!(c128yLJJJJZ instanceof C0IGR) || ((C0IGR) c128yLJJJJZ).onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        String stringExtra2;
        String stringExtra3;
        long jLongValue;
        Long lLJIILIIL;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.GameBroadcastAsCameraActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.dav);
        if (!GamePhoneAsCameraEnableSetting.INSTANCE.enable()) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.GameBroadcastAsCameraActivity", "onCreate", false);
            return;
        }
        if (!LiveAppBundleUtils.isPluginAvailable(EnumC785640Urq.CAST, "other")) {
            LiveAppBundleUtils.ensurePluginAvailable(EnumC785640Urq.CAST, new C0UVS() { // from class: X.0UQR
                @Override // X.C0UVS
                public final void LIZ(int i, String str, boolean z) {
                }

                @Override // X.C0UVS
                public final void onFailed() {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("ttlive_casting_aab_plugin_install");
                    c474500IjALIZ.LJJII("fail", "result");
                    c474500IjALIZ.LIZ();
                }

                @Override // X.C0UVS
                public final void onSuccess() {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("ttlive_casting_aab_plugin_install");
                    c474500IjALIZ.LJJII("success", "result");
                    c474500IjALIZ.LIZ();
                }
            }, true);
            C766270U4b.LIZLLL(2131843792);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_phone_as_camera_plugin_loaded_status");
            c474500IjALIZ.LJJII(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c474500IjALIZ.LIZ();
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.GameBroadcastAsCameraActivity", "onCreate", false);
            return;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_phone_as_camera_plugin_loaded_status");
        c474500IjALIZ2.LJJII(1, "result_type");
        c474500IjALIZ2.LIZ();
        if (!C04QR.LIZ(this, false)) {
            C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_phone_as_camera_plugin_loaded_status");
            c474500IjALIZ3.LJJII("push_sdk", "type");
            c474500IjALIZ3.LIZ();
            C766270U4b.LIZLLL(C786410Ut5.n3(getResources(), "offloadedFeatures_settingUpToast_LIVE", "string", getPackageName()));
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.GameBroadcastAsCameraActivity", "onCreate", false);
            return;
        }
        Window window = getWindow();
        if (window != null) {
            window.addFlags(128);
        }
        HashMap map = new HashMap();
        LiveGameDualDeviceActivityArgs liveGameDualDeviceActivityArgs = (LiveGameDualDeviceActivityArgs) this.LL.getValue();
        if (liveGameDualDeviceActivityArgs != null) {
            map.put("source_ip", liveGameDualDeviceActivityArgs.getSourceIp());
            map.put("source_port", Integer.valueOf(liveGameDualDeviceActivityArgs.getSourcePort()));
            map.put("room_id", liveGameDualDeviceActivityArgs.getRoomId());
            if (liveGameDualDeviceActivityArgs.getVideoWidth() > 0) {
                map.put("video_w", Integer.valueOf(liveGameDualDeviceActivityArgs.getVideoWidth()));
            }
            if (liveGameDualDeviceActivityArgs.getVideoHeight() > 0) {
                map.put("video_h", Integer.valueOf(liveGameDualDeviceActivityArgs.getVideoHeight()));
            }
            map.put("ver", Integer.valueOf(liveGameDualDeviceActivityArgs.getVersion()));
            map.put("pcVersion", Integer.valueOf(liveGameDualDeviceActivityArgs.getPcVersion()));
            map.put("bit_rate_scale", liveGameDualDeviceActivityArgs.getBitRateScale());
            map.put("fps", liveGameDualDeviceActivityArgs.getFps());
            map.put("anchor_id", liveGameDualDeviceActivityArgs.getAnchorId());
            map.put("sink_platform", liveGameDualDeviceActivityArgs.getSinkPlatform());
            map.put("settings", liveGameDualDeviceActivityArgs.getSettings());
            map.put("audio_source", Integer.valueOf(liveGameDualDeviceActivityArgs.getAudioSource()));
            map.put("mic_scale", Integer.valueOf(liveGameDualDeviceActivityArgs.getMicScale()));
            map.put("server_mode", Integer.valueOf(liveGameDualDeviceActivityArgs.getServerMode()));
            map.put("landscape", Integer.valueOf(liveGameDualDeviceActivityArgs.getLandscape()));
            map.put("uuid", liveGameDualDeviceActivityArgs.getUuid());
            map.put("enter_from", liveGameDualDeviceActivityArgs.getEnterFrom());
            String timestamp = liveGameDualDeviceActivityArgs.getTimestamp();
            if (timestamp != null && (lLJIILIIL = C2095008Iq.LJIILIIL(timestamp)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            map.put("timestamp", Long.valueOf(jLongValue));
        }
        try {
            stringExtra = getIntent().getStringExtra("phone_as_camera_link_type_key");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        map.put("phone_as_camera_link_type_key", stringExtra);
        try {
            stringExtra3 = getIntent().getStringExtra("video_w");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (stringExtra3 == null) {
            numLJIIJJI = null;
        } else {
            numLJIIJJI = C2095008Iq.LJIIJJI(stringExtra3);
        }
        try {
            stringExtra2 = getIntent().getStringExtra("video_h");
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        if (stringExtra2 == null) {
            numLJIIJJI2 = null;
        } else {
            numLJIIJJI2 = C2095008Iq.LJIIJJI(stringExtra2);
        }
        if (numLJIIJJI != null && numLJIIJJI.intValue() > 0 && numLJIIJJI2 != null && numLJIIJJI2.intValue() > 0) {
            map.put("video_w", numLJIIJJI);
            map.put("video_h", numLJIIJJI2);
        }
        Fragment fragmentWt = Live.getService().wt(map);
        if (fragmentWt != null) {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.iiv, fragmentWt, null);
            c19ehLJIIJ.LJIIJ();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.GameBroadcastAsCameraActivity", "onCreate", false);
            return;
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.GameBroadcastAsCameraActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
