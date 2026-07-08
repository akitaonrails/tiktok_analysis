package com.ss.android.ugc.aweme.video.config;

import X.C1477160oXi;
import X.C1480730odT;
import X.C1480980ods;
import X.EnumC1479760obu;
import X.EnumC2281141EQm;
import X.InterfaceC1475250oUd;
import X.InterfaceC1476900oXI;
import X.InterfaceC1477840oYo;
import X.InterfaceC1477850oYp;
import X.InterfaceC1478020oZ6;
import X.InterfaceC1483040ohC;
import android.content.Context;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public interface ISimPlayerConfig {
    InterfaceC1477840oYo createAudioUrlProcessor();

    InterfaceC1478020oZ6 createSubUrlProcessor();

    InterfaceC1475250oUd createVideoUrlProcessor();

    boolean disableSleepResume(String str);

    void downloadFile(String str, String str2, String str3, String str4);

    boolean enableByteVc1FailCheckCountPolicy();

    boolean enableFileIoOpt(String str);

    boolean enableForceUseH264CheckPolicy();

    boolean enableForceUseH264Global();

    int getAverageSpeedInKBps();

    InterfaceC1477850oYp getBindCpuCore();

    C1477160oXi getDashProcessUrlData(String str, boolean z, long j);

    C1480730odT getISimPlayerPlaySessionConfig(boolean z);

    C1480980ods getPlayerConfig(EnumC1479760obu enumC1479760obu, boolean z, boolean z2);

    int getPlayerType();

    InterfaceC1483040ohC getPreRenderConfig();

    C1477160oXi getProcessUrlData(SimVideoUrlModel simVideoUrlModel, String str);

    EnumC2281141EQm getProperResolution(String str, InterfaceC1476900oXI interfaceC1476900oXI);

    int getTTPlayerPlan();

    String getThumbCacheDir(Context context);

    SimVideoUrlModel getVideoPlayAddr(SimVideo simVideo, EnumC1479760obu enumC1479760obu);

    boolean isCache(SimVideoUrlModel simVideoUrlModel);

    boolean isCacheAboveOrComplete(SimVideoUrlModel simVideoUrlModel, int i);

    boolean isForceHdrOff();

    boolean isHttpsVideoUrlModel(SimVideoUrlModel simVideoUrlModel);

    boolean isPlayerPreferchTtsAudio();

    boolean isPluginApplied();

    void onRecordFirstFrameTime(String str, long j, String str2, boolean z, int i);

    void onRecordFirstFrameTime(String str, long j, String str2, boolean z, boolean z2);

    void onRecordPrepareTime(String str, long j, String str2, boolean z, int i);

    void onRecordPrepareTime(String str, long j, String str2, boolean z, boolean z2);

    boolean perfEventEnabled();

    boolean perfEventEnabledInPlayRequest();

    void recordMiscLog(Context context, String str, JSONObject jSONObject);
}
