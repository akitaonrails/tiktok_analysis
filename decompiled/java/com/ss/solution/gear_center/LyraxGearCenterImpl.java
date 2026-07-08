package com.ss.solution.gear_center;

import X.C2188811AlT;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.bytertc.engine.loader.LyraxPluginConfig;
import com.ss.lyrax.utils.LyraxNativeCleaner;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public final class LyraxGearCenterImpl implements LyraxGearCenter {
    public static final Companion Companion = new Companion();
    public final long handle;

    public static final class Companion {
    }

    private final native long nativeCreate(LyraxGearCenterConfig lyraxGearCenterConfig);

    private final native void nativeDispose(long j);

    private final native long nativeGetDestroyGearCenter();

    private final native LyraxGearStrategyResult nativeGetGearStrategyResult(long j, LyraxGearStrategyOption lyraxGearStrategyOption);

    private final native JSONObject nativeGetMonitorMetrics(long j);

    private final native JSONObject nativeGetTakeMetrics(long j);

    private final native List<LyraxGearModel> nativeGetValidGearList(long j);

    private final native void nativeSetCustomFeatures(long j, Map<String, ? extends Object> map);

    private final native void nativeSetListener(long j, LyraxGearCenterListener lyraxGearCenterListener);

    private final native void nativeSetManualLevel(long j, int i, LyraxManualLevelSource lyraxManualLevelSource);

    private final native void nativeSetPerfData(long j, LyraxGearPerfData lyraxGearPerfData);

    private final native void nativeSetScheduleData(long j, LyraxGearScheduleData lyraxGearScheduleData, boolean z);

    private final native void nativeStartProbe(long j, LyraxStartProbeOption lyraxStartProbeOption);

    private final native void nativeStopProbe(long j, LyraxStopProbeOption lyraxStopProbeOption);

    static {
        String soLibraryName = LyraxPluginConfig.getSoLibraryName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[LYRAX_SO_LOAD] LyraxGearCenterImpl.init: libName=");
        sbLIZ.append(soLibraryName);
        sbLIZ.append(", pluginState=");
        sbLIZ.append(LyraxPluginConfig.getPluginState());
        LyraxPluginConfig.safeLogW("LyraxGearCenter", C2188811AlT.LIZIZ(sbLIZ));
        try {
            INVOKESTATIC_com_ss_solution_gear_center_LyraxGearCenterImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(soLibraryName);
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[LYRAX_SO_LOAD] LyraxGearCenterImpl.init: loadLibrary(");
            sbLIZ2.append(soLibraryName);
            sbLIZ2.append(") failed");
            LyraxPluginConfig.safeLogE("LyraxGearCenter", C2188811AlT.LIZIZ(sbLIZ2), e);
        }
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenter
    public void dispose() {
        nativeDispose(this.handle);
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenter
    public JSONObject getMonitorMetrics() {
        return nativeGetMonitorMetrics(this.handle);
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenter
    public JSONObject getTraceMetrics() {
        return nativeGetTakeMetrics(this.handle);
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenter
    public List<LyraxGearModel> getValidGearList() {
        return nativeGetValidGearList(this.handle);
    }

    public LyraxGearCenterImpl(LyraxGearCenterConfig lyraxGearCenterConfig) {
        long jNativeCreate = nativeCreate(lyraxGearCenterConfig);
        this.handle = jNativeCreate;
        if (jNativeCreate != 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                LyraxNativeCleaner.register(this, jNativeCreate, nativeGetDestroyGearCenter());
                return;
            }
            return;
        }
        throw new IllegalStateException("handler is nullptr");
    }

    public static void INVOKESTATIC_com_ss_solution_gear_center_LyraxGearCenterImpl_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenter
    public LyraxGearStrategyResult getGearStrategyResult(LyraxGearStrategyOption lyraxGearStrategyOption) {
        return nativeGetGearStrategyResult(this.handle, lyraxGearStrategyOption);
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenter
    public void setCustomFeatures(Map<String, ? extends Object> map) {
        nativeSetCustomFeatures(this.handle, map);
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenter
    public void setListener(LyraxGearCenterListener lyraxGearCenterListener) {
        nativeSetListener(this.handle, lyraxGearCenterListener);
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenter
    public void setPerfData(LyraxGearPerfData lyraxGearPerfData) {
        nativeSetPerfData(this.handle, lyraxGearPerfData);
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenter
    public void startProbe(LyraxStartProbeOption lyraxStartProbeOption) {
        nativeStartProbe(this.handle, lyraxStartProbeOption);
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenter
    public void stopProbe(LyraxStopProbeOption lyraxStopProbeOption) {
        nativeStopProbe(this.handle, lyraxStopProbeOption);
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenter
    public void setManualLevel(int i, LyraxManualLevelSource lyraxManualLevelSource) {
        nativeSetManualLevel(this.handle, i, lyraxManualLevelSource);
    }

    @Override // com.ss.solution.gear_center.LyraxGearCenter
    public void setScheduleData(LyraxGearScheduleData lyraxGearScheduleData, boolean z) {
        nativeSetScheduleData(this.handle, lyraxGearScheduleData, z);
    }
}
