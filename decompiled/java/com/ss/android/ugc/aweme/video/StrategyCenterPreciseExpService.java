package com.ss.android.ugc.aweme.video;

import X.C0C64;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.player.sdk.api.IStrategyCenterPreciseExpService;
import com.ss.android.ugc.aweme.video.experiment.EnginePlayBackSpeedPreciseExp;
import com.ss.android.ugc.aweme.video.experiment.EnginePreloadWeakNetworkPreciseExp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class StrategyCenterPreciseExpService implements IStrategyCenterPreciseExpService {
    public final Gson gson = new e().LIZ();

    @Override // com.ss.android.ugc.aweme.player.sdk.api.IStrategyCenterPreciseExpService
    public /* bridge */ /* synthetic */ boolean getBooleanValue(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.IStrategyCenterPreciseExpService
    public /* bridge */ /* synthetic */ double getDoubleValue(String str) {
        return 0.0d;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.IStrategyCenterPreciseExpService
    public /* bridge */ /* synthetic */ float getFloatValue(String str) {
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.IStrategyCenterPreciseExpService
    public /* bridge */ /* synthetic */ long getLongValue(String str) {
        return 0L;
    }

    public final Gson getGson() {
        return this.gson;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.IStrategyCenterPreciseExpService
    public int getIntValue(String str) {
        if (Intrinsics.LJFF(str, "preloader_weak_network_precise_exp")) {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            EnginePreloadWeakNetworkPreciseExp.WeakNetworkConfig weakNetworkConfig = EnginePreloadWeakNetworkPreciseExp.LIZ;
            EnginePreloadWeakNetworkPreciseExp.WeakNetworkConfig weakNetworkConfig2 = (EnginePreloadWeakNetworkPreciseExp.WeakNetworkConfig) c0c64LJIILLIIL.LJJIIJ(true, "preloader_weak_network_precise_exp", 31744, EnginePreloadWeakNetworkPreciseExp.WeakNetworkConfig.class, weakNetworkConfig, 1);
            if (weakNetworkConfig2 != null) {
                weakNetworkConfig = weakNetworkConfig2;
            }
            return weakNetworkConfig.is_weak_preload();
        }
        if (Intrinsics.LJFF(str, "preloader_playback_speed_exp")) {
            C0C64 c0c64LJIILLIIL2 = C0C64.LJIILLIIL();
            EnginePlayBackSpeedPreciseExp.PlayBackConfig playBackConfig = EnginePlayBackSpeedPreciseExp.LIZ;
            EnginePlayBackSpeedPreciseExp.PlayBackConfig playBackConfig2 = (EnginePlayBackSpeedPreciseExp.PlayBackConfig) c0c64LJIILLIIL2.LJJIIJ(true, "preloader_playback_speed_exp", 31744, EnginePlayBackSpeedPreciseExp.PlayBackConfig.class, playBackConfig, 1);
            if (playBackConfig2 != null) {
                playBackConfig = playBackConfig2;
            }
            return playBackConfig.is_enable_play_back();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.IStrategyCenterPreciseExpService
    public String getStringValue(String str) {
        if (Intrinsics.LJFF(str, "preloader_weak_network_precise_exp")) {
            Gson gson = this.gson;
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            Object obj = EnginePreloadWeakNetworkPreciseExp.LIZ;
            Object objLJJIIJ = c0c64LJIILLIIL.LJJIIJ(true, "preloader_weak_network_precise_exp", 31744, EnginePreloadWeakNetworkPreciseExp.WeakNetworkConfig.class, obj, 1);
            if (objLJJIIJ != null) {
                obj = objLJJIIJ;
            }
            String json = GsonProtectorUtils.toJson(gson, obj);
            json.toString();
            return json;
        }
        if (Intrinsics.LJFF(str, "preloader_playback_speed_exp")) {
            Gson gson2 = this.gson;
            C0C64 c0c64LJIILLIIL2 = C0C64.LJIILLIIL();
            Object obj2 = EnginePlayBackSpeedPreciseExp.LIZ;
            Object objLJJIIJ2 = c0c64LJIILLIIL2.LJJIIJ(true, "preloader_playback_speed_exp", 31744, EnginePlayBackSpeedPreciseExp.PlayBackConfig.class, obj2, 1);
            if (objLJJIIJ2 != null) {
                obj2 = objLJJIIJ2;
            }
            String json2 = GsonProtectorUtils.toJson(gson2, obj2);
            json2.toString();
            return json2;
        }
        return "";
    }
}
