package com.ss.android.ugc.aweme.video.simplayer;

import X.C08TN;
import X.C0C64;
import X.C0VSJ;
import X.C1474810oTv;
import X.C1475000oUE;
import X.C1475150oUT;
import X.C1477160oXi;
import X.C1478160oZK;
import X.C1479050oal;
import X.C1479130oat;
import X.C1480970odr;
import X.C1480980ods;
import X.C1481060oe0;
import X.C1483410ohn;
import X.C1493400oxu;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2241008qG;
import X.C2354709Kn;
import X.C2427009fA;
import X.C582130MsN;
import X.C586580MzY;
import X.C786410Ut5;
import X.C794240VDq;
import X.EnumC1479760obu;
import X.EnumC2281141EQm;
import X.EnumC2427909fJ;
import X.InterfaceC1475250oUd;
import X.InterfaceC1476900oXI;
import X.InterfaceC1477840oYo;
import X.InterfaceC1477850oYp;
import X.InterfaceC1478020oZ6;
import X.InterfaceC1481100oe4;
import X.InterfaceC1483040ohC;
import X.InterfaceC585510Mxp;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class PlayerConfigImpl implements ISimPlayerConfig {
    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ InterfaceC1477840oYo createAudioUrlProcessor() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ InterfaceC1478020oZ6 createSubUrlProcessor() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ InterfaceC1475250oUd createVideoUrlProcessor() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ boolean disableSleepResume(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public void downloadFile(String str, String str2, String str3, String str4) {
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ boolean enableByteVc1FailCheckCountPolicy() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ boolean enableFileIoOpt(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ boolean enableForceUseH264CheckPolicy() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ boolean enableForceUseH264Global() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public InterfaceC1477850oYp getBindCpuCore() {
        return InterfaceC1477850oYp.LIZ;
    }

    public /* bridge */ /* synthetic */ int getBitrateQuality() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ C1477160oXi getDashProcessUrlData(String str, boolean z, long j) {
        return null;
    }

    public /* bridge */ /* synthetic */ InterfaceC585510Mxp getGlobalPlayListener() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ int getPlayerType() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ C1477160oXi getProcessUrlData(SimVideoUrlModel simVideoUrlModel, String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ int getTTPlayerPlan() {
        return 0;
    }

    public /* bridge */ /* synthetic */ boolean ignoreExoReleaseState() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ boolean isCacheAboveOrComplete(SimVideoUrlModel simVideoUrlModel, int i) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isPluginApplied() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean isUseLastNetworkSpeed() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ void onRecordFirstFrameTime(String str, long j, String str2, boolean z, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ void onRecordPrepareTime(String str, long j, String str2, boolean z, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ boolean perfEventEnabled() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ boolean perfEventEnabledInPlayRequest() {
        return false;
    }

    public /* bridge */ /* synthetic */ InterfaceC1481100oe4 surfaceOptimizer() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public InterfaceC1483040ohC getPreRenderConfig() {
        return new C1479050oal(this);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public int getAverageSpeedInKBps() {
        return C1479130oat.LJII();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isForceHdrOff() {
        if (!C1474810oTv.LJJJJZI()) {
            return false;
        }
        if (C1481060oe0.LJIIIZ == null) {
            C1481060oe0.LJIIIZ = Boolean.valueOf(Keva.getRepo("keva_a11y_settings_unit").getBoolean("keva_is_hdr_off", false));
        }
        return C1481060oe0.LJIIIZ.booleanValue();
    }

    public boolean isPlayerPreferchCaption() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_prefetch_cla_caption", true) == 1;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isPlayerPreferchTtsAudio() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "player_preferch_tts_audio", true) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0209  */
    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C1480730odT getISimPlayerPlaySessionConfig(boolean r10) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl.getISimPlayerPlaySessionConfig(boolean):X.0odT");
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public String getThumbCacheDir(Context context) {
        File fileW2;
        if (C2354709Kn.LJIIZILJ()) {
            fileW2 = C2354709Kn.LJIIIZ(context);
            if (C2427009fA.LJIIL()) {
                fileW2 = C2427009fA.LJII(context, EnumC2427909fJ.PREFER_EXTERNAL);
            }
        } else {
            fileW2 = C786410Ut5.w2(context);
            if (C2427009fA.LJIIL()) {
                fileW2 = C2427009fA.LJII(context, EnumC2427909fJ.PREFER_PRIVATE);
            }
        }
        C0VSJ c0vsj = new C0VSJ(fileW2, "cache/thumbs");
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        return c0vsj.getAbsolutePath();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isCache(SimVideoUrlModel simVideoUrlModel) {
        return C1478160oZK.LIZ().isCache(simVideoUrlModel);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isHttpsVideoUrlModel(SimVideoUrlModel simVideoUrlModel) {
        List<String> urlList;
        if (simVideoUrlModel != null && (urlList = simVideoUrlModel.getUrlList()) != null && urlList.size() > 0) {
            Iterator<String> it2 = urlList.iterator();
            while (it2.hasNext()) {
                if (!isCookieSharedUrl(C1475000oUE.LIZ, it2.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public EnumC2281141EQm getProperResolution(String str, InterfaceC1476900oXI interfaceC1476900oXI) {
        return C582130MsN.LIZ().LJ().LIZIZ().getProperResolution(str, interfaceC1476900oXI);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public SimVideoUrlModel getVideoPlayAddr(SimVideo simVideo, EnumC1479760obu enumC1479760obu) {
        if (simVideo != null) {
            if (shouldPlayInBytevc1(simVideo, enumC1479760obu)) {
                return simVideo.getPlayAddrBytevc1();
            }
            return simVideo.getPlayAddrH264();
        }
        return null;
    }

    public boolean isCookieSharedUrl(Context context, String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("https://")) {
            try {
                if (C1493400oxu.LJIIJ(context).LJ(URI.create(str).getHost()) == null) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public boolean shouldPlayInBytevc1(SimVideo simVideo, EnumC1479760obu enumC1479760obu) {
        if (C1475150oUT.LIZIZ(simVideo.getPlayAddrBytevc1()) && C1475150oUT.LIZ(enumC1479760obu)) {
            return true;
        }
        return false;
    }

    private JSONObject getPrepareOrFirstFrameExtraJSON(long j, boolean z, int i) {
        C2241008qG c2241008qG = new C2241008qG();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append("");
        c2241008qG.LIZ.put("duration", C2188811AlT.LIZIZ(sbLIZ));
        c2241008qG.LIZ(Boolean.valueOf(z), "is_cache");
        boolean z2 = true;
        if (1 != i) {
            z2 = false;
        }
        c2241008qG.LIZ(Boolean.valueOf(z2), "bytevc1");
        c2241008qG.LIZJ(Long.valueOf(C1483410ohn.LJLJJI().getDuration()), "video_duration");
        C586580MzY.LIZ(c2241008qG);
        return c2241008qG.LJ();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public C1480980ods getPlayerConfig(EnumC1479760obu enumC1479760obu, boolean z, boolean z2) throws Throwable {
        C08TN.LIZ().LJ("playerconfigimpl_getplayerconfig", true);
        C1480980ods c1480980odsLJI = C1480970odr.LJI(enumC1479760obu, z, z2);
        C08TN.LIZ().LJI("playerconfigimpl_getplayerconfig");
        return c1480980odsLJI;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public void recordMiscLog(Context context, String str, JSONObject jSONObject) {
        AppLog.recordMiscLog(context, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public void onRecordFirstFrameTime(String str, long j, String str2, boolean z, int i) {
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName(str2);
        mobClickObtain.setLabelName("perf_monitor");
        mobClickObtain.setExtValueLong(j);
        C20684815ws.onEvent(mobClickObtain);
        C794240VDq.LIZJ(str, getPrepareOrFirstFrameExtraJSON(j, z, i));
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public void onRecordPrepareTime(String str, long j, String str2, boolean z, int i) {
        C794240VDq.LIZJ(str, getPrepareOrFirstFrameExtraJSON(j, z, i));
    }
}
