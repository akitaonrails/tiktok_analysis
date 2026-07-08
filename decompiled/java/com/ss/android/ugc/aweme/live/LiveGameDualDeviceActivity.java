package com.ss.android.ugc.aweme.live;

import X.AbstractActivityC484150Iyj;
import X.C01GW;
import X.C04QR;
import X.C0IGR;
import X.C0IJT;
import X.C128Y;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.C474500IjA;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC335920DEw;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameDualDeviceSourceSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveGameDualDeviceActivity extends AbstractActivityC484150Iyj {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyHELIOSp9BCw6LAgyJSAIPC4/DCA6ICw2CSY4IDk6PDw=";
    public final C01GW LL = RouteArgExtension.INSTANCE.navArg(this);

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "onWindowFocusChanged", true);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.dav);
        String roomId = null;
        if (!LiveGameDualDeviceSourceSetting.INSTANCE.enable()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_plugin_not_loaded");
            c474500IjALIZ.LJJII("activity", "from");
            LiveGameDualDeviceActivityArgs liveGameDualDeviceActivityArgs = (LiveGameDualDeviceActivityArgs) this.LL.getValue();
            if (liveGameDualDeviceActivityArgs != null) {
                roomId = liveGameDualDeviceActivityArgs.getRoomId();
            }
            c474500IjALIZ.LJJII(roomId, "room_id");
            c474500IjALIZ.LIZ();
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "onCreate", false);
            return;
        }
        if (!C04QR.LIZ(this, false)) {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_dual_device_plugin_not_loaded");
            c474500IjALIZ2.LJJII("activity", "from");
            LiveGameDualDeviceActivityArgs liveGameDualDeviceActivityArgs2 = (LiveGameDualDeviceActivityArgs) this.LL.getValue();
            if (liveGameDualDeviceActivityArgs2 != null) {
                roomId = liveGameDualDeviceActivityArgs2.getRoomId();
            }
            c474500IjALIZ2.LJJII(roomId, "room_id");
            c474500IjALIZ2.LJJII("push_sdk", "type");
            c474500IjALIZ2.LIZ();
            C766270U4b.LIZLLL(C786410Ut5.n3(getResources(), "offloadedFeatures_settingUpToast_LIVE", "string", getPackageName()));
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "onCreate", false);
            return;
        }
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(this, "dual_device_source", true)) {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(128);
            }
            LiveGameDualDeviceActivityArgs liveGameDualDeviceActivityArgs3 = (LiveGameDualDeviceActivityArgs) this.LL.getValue();
            if (liveGameDualDeviceActivityArgs3 != null) {
                HashMap map = new HashMap();
                map.put("source_ip", liveGameDualDeviceActivityArgs3.getSourceIp());
                map.put("source_port", Integer.valueOf(liveGameDualDeviceActivityArgs3.getSourcePort()));
                map.put("room_id", liveGameDualDeviceActivityArgs3.getRoomId());
                if (liveGameDualDeviceActivityArgs3.getVideoWidth() > 0) {
                    map.put("video_w", Integer.valueOf(liveGameDualDeviceActivityArgs3.getVideoWidth()));
                }
                if (liveGameDualDeviceActivityArgs3.getVideoHeight() > 0) {
                    map.put("video_h", Integer.valueOf(liveGameDualDeviceActivityArgs3.getVideoHeight()));
                }
                map.put("ver", Integer.valueOf(liveGameDualDeviceActivityArgs3.getVersion()));
                map.put("bit_rate_scale", liveGameDualDeviceActivityArgs3.getBitRateScale());
                map.put("fps", liveGameDualDeviceActivityArgs3.getFps());
                map.put("anchor_id", liveGameDualDeviceActivityArgs3.getAnchorId());
                map.put("sink_platform", liveGameDualDeviceActivityArgs3.getSinkPlatform());
                map.put("settings", liveGameDualDeviceActivityArgs3.getSettings());
                String didSink = liveGameDualDeviceActivityArgs3.getDidSink();
                if (didSink != null) {
                    map.put("did_sink", didSink);
                }
                map.put("is_rtc", Integer.valueOf(liveGameDualDeviceActivityArgs3.isRtc()));
                String connectType = liveGameDualDeviceActivityArgs3.getConnectType();
                if (connectType == null) {
                    connectType = "qrcode";
                }
                map.put("connect_type", connectType);
                if (getSupportFragmentManager().LJJJJZI("LiveGameDualDeviceActivity") == null) {
                    Fragment fragmentLJJIII = Live.getService().LJJIII(map);
                    if (fragmentLJJIII != null) {
                        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                        c19ehLJIIJ.LJIJ(R.id.iiv, fragmentLJJIII, "LiveGameDualDeviceActivity");
                        c19ehLJIIJ.LJIIJ();
                    } else {
                        finish();
                        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "onCreate", false);
                        return;
                    }
                }
            }
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "onCreate", false);
            return;
        }
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_dual_device_plugin_not_loaded");
        c474500IjALIZ3.LJJII("activity", "from");
        LiveGameDualDeviceActivityArgs liveGameDualDeviceActivityArgs4 = (LiveGameDualDeviceActivityArgs) this.LL.getValue();
        if (liveGameDualDeviceActivityArgs4 != null) {
            roomId = liveGameDualDeviceActivityArgs4.getRoomId();
        }
        c474500IjALIZ3.LJJII(roomId, "room_id");
        c474500IjALIZ3.LJJII("ve_sdk", "type");
        c474500IjALIZ3.LIZ();
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "onCreate", false);
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
