package com.ss.android.ugc.aweme.services;

import X.C01GW;
import X.C09X9;
import X.C0C64;
import X.C0CHQ;
import X.C0CIU;
import X.C1403010mc7;
import X.C1428720nHa;
import X.C1436290nTn;
import X.C1436570nUF;
import X.C1442350ndZ;
import X.C1446440nkA;
import X.C15O7;
import X.C1954807lC;
import X.C1C7U;
import X.C1D75;
import X.C1D7G;
import X.C20186013yc;
import X.C2208671BcP;
import X.C2208681BcQ;
import X.C2208701BcS;
import X.C2208711BcT;
import X.C289290BVn;
import X.C292370Bd5;
import X.C297360Bl8;
import X.C306090BzD;
import X.C530010KqV;
import X.C578000Mli;
import X.C580150MpB;
import X.C988940bqG;
import X.C989130bqZ;
import X.EnumC2208691BcR;
import android.text.TextUtils;
import com.bef.effectsdk.EffectSDKBuildConfig;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.services.AVSettingsServiceImpl;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEVersionUtil;
import dtj.s5;
import java.util.Map;
import java.util.concurrent.Callable;
import lth.o;

/* JADX INFO: loaded from: classes35.dex */
public class AVSettingsServiceImpl implements IAVSettingsService {
    public static AVSettingsServiceImpl sInstance = new AVSettingsServiceImpl();
    public volatile boolean isUpdateABTestModelExecuted;

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean downloadEffectOrMusicAfterEnterCamera() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableLightningPrivacySetting() {
        return C1428720nHa.LIZ(null);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean needLoginBeforeRecord() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public long progressBarThreshold() {
        return 30000L;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean shareVideo2GifEditable() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean showDuetWithReact() {
        return false;
    }

    private void asyncMonitorAwemeSetting() {
        C15O7.LIZJ(new Callable() { // from class: X.1Bax
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AVSettingsServiceImpl.lambda$asyncMonitorAwemeSetting$0();
            }
        });
    }

    private boolean isInTikTokRegion() {
        return C1403010mc7.LIZ.getRegionService() != null && C20186013yc.LIZIZ().booleanValue();
    }

    public static Void lambda$asyncMonitorAwemeSetting$0() {
        C1C7U.LIZ("AVSettingsServiceImpl@1dbf.asyncMonitorAwemeSetting$1L");
        try {
            C1442350ndZ.LIZIZ(C580150MpB.LIZ(), "filter", "");
            SettingsManager.LIZLLL().getClass();
            C1442350ndZ.LIZIZ(SettingsManager.LJ("use_hardcode", 0), "hard_code_shot", "");
            SettingsManager.LIZLLL().getClass();
            C1442350ndZ.LIZIZ(SettingsManager.LJ("use_synthetic_hardcode", 0), "hard_code_release", "");
            C0CHQ.LIZ().getPublishService().LIZIZ();
            C1442350ndZ.LIZIZ(C1436570nUF.LIZ() ? 1 : 0, "hard_code_water_marker", "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("AVSettingsServiceImpl@1dbf.asyncMonitorAwemeSetting$1L");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableReleaseVideoPlayerOpt() {
        s5.LIZ.getClass();
        return ((Number) s5.LIZIZ.getValue()).intValue() == 1;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableSaveOwnVideoWithoutWatermask() {
        int i = C292370Bd5.LIZ;
        return i == 1 || (i == 2 && !C1436290nTn.LIZ.getBoolean("has_water_mark", false));
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableTaskDegradationOpti() {
        return ((Boolean) C1D75.LIZ(C1D7G.class)).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableModelFileOnlyEnv() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "model_file_test_env", true, true);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableReeditPostedDraftAfterDelete() {
        return C297360Bl8.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableSaveDraftAfterPosting() {
        return C09X9.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableSaveUploadVideo() {
        return AVSettingsWrapper.enableSaveUploadVideo();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableSharePanelTuxDialogRefactor() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_share_panel_tuxdialog_refactor", true) == 1;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableShowCutsameAnchor() {
        return C989130bqZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableShowMvAnchor() {
        return C988940bqG.LIZ() ? ((Boolean) C306090BzD.LIZ.getValue()).booleanValue() : C0C64.LJIILLIIL().LJIIIZ(31744, "enable_anchor_mv", true, true);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public String getEffectVersion() {
        return EffectSDKBuildConfig.getAarVersion();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean getMvThemeRecordMode() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "mv_theme_mode_switch", true, true);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public String getStickerArtistIconUrl() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJI("sticker_artist_icon_url", "");
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public String getVESDKVersion() {
        return VEVersionUtil.getVESDKVersion();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isDebugConfigOpen() {
        C0CHQ.LIZ().isDebugConfigOpen();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isDuetAutoApplyEffectEnabled() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "auto_apply_effect_in_duet", true) == 1;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isLongVideoPermitted() {
        return C1446440nkA.LIZ() && C578000Mli.LIZ() > 15000;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public long longVideoThresholdWithTolerance() {
        return C530010KqV.LIZ() + 1000;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean optPermission() {
        return C0CIU.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean showMvThemeRecordMode() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "mv_theme_mode_switch", true, true);
    }

    public static AVSettingsServiceImpl getInstance() {
        return sInstance;
    }

    public boolean hasUpdateABTestModelExecuted() {
        return this.isUpdateABTestModelExecuted;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public void updateABTestModel(n nVar) {
        n nVarLJJIJ;
        Object objValueOf;
        q qVarLJJIJIIJI;
        this.isUpdateABTestModelExecuted = true;
        C01GW c01gw = C289290BVn.LIZ;
        if ((!C289290BVn.LIZIZ && ((Number) C289290BVn.LIZ.getValue()).intValue() == 1) || (nVarLJJIJ = nVar.LJJIJ("data")) == null) {
            return;
        }
        C2208671BcP c2208671BcP = o.LJJIFFI;
        C2208681BcQ c2208681BcQ = c2208671BcP.LIZIZ;
        synchronized (c2208681BcQ) {
            c2208681BcQ.LIZIZ.clear();
            c2208681BcQ.LIZ.edit().clear().apply();
        }
        for (Map.Entry<String, VEConfigCenter.ValuePkt> entry : VEConfigCenter.getInstance().getConfigs().entrySet()) {
            if (entry.getValue() != null && !TextUtils.isEmpty(entry.getKey()) && nVarLJJIJ.LJJIJIIJIL(entry.getKey())) {
                String key = entry.getKey();
                C2208711BcT c2208711BcT = new C2208711BcT(key, entry.getValue());
                EnumC2208691BcR enumC2208691BcRType = c2208711BcT.type();
                if (enumC2208691BcRType != null) {
                    int i = C2208701BcS.LIZ[enumC2208691BcRType.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5) {
                                        try {
                                            qVarLJJIJIIJI = nVarLJJIJ.LJJIJIIJI(key);
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                        if (qVarLJJIJIIJI != null) {
                                            objValueOf = qVarLJJIJIIJI.LJIL();
                                        } else {
                                            objValueOf = "";
                                        }
                                    }
                                } else {
                                    float fFloatValue = ((Float) c2208711BcT.LIZ()).floatValue();
                                    try {
                                        q qVarLJJIJIIJI2 = nVarLJJIJ.LJJIJIIJI(key);
                                        if (qVarLJJIJIIJI2 != null) {
                                            fFloatValue = qVarLJJIJIIJI2.LJIIJ();
                                        }
                                    } catch (Exception e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                    }
                                    objValueOf = Float.valueOf(fFloatValue);
                                }
                            } else {
                                long jLongValue = ((Long) c2208711BcT.LIZ()).longValue();
                                try {
                                    q qVarLJJIJIIJI3 = nVarLJJIJ.LJJIJIIJI(key);
                                    if (qVarLJJIJIIJI3 != null) {
                                        jLongValue = qVarLJJIJIIJI3.LJIIZILJ();
                                    }
                                } catch (Exception e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                }
                                objValueOf = Long.valueOf(jLongValue);
                            }
                        } else {
                            int iIntValue = ((Integer) c2208711BcT.LIZ()).intValue();
                            try {
                                q qVarLJJIJIIJI4 = nVarLJJIJ.LJJIJIIJI(key);
                                if (qVarLJJIJIIJI4 != null) {
                                    iIntValue = qVarLJJIJIIJI4.LL instanceof Boolean ? qVarLJJIJIIJI4.LJ() ? 1 : 0 : qVarLJJIJIIJI4.LJIIJJI();
                                }
                            } catch (Exception e4) {
                                TryCatchGuardChecker.doCheck(e4);
                            }
                            objValueOf = Integer.valueOf(iIntValue);
                        }
                    } else {
                        boolean zBooleanValue = ((Boolean) c2208711BcT.LIZ()).booleanValue();
                        try {
                            q qVarLJJIJIIJI5 = nVarLJJIJ.LJJIJIIJI(key);
                            if (qVarLJJIJIIJI5 != null) {
                                zBooleanValue = qVarLJJIJIIJI5.LL instanceof Number ? qVarLJJIJIIJI5.LJIJ().intValue() == 1 : qVarLJJIJIIJI5.LJ();
                            }
                        } catch (Exception e5) {
                            TryCatchGuardChecker.doCheck(e5);
                        }
                        objValueOf = Boolean.valueOf(zBooleanValue);
                    }
                    C2208681BcQ c2208681BcQ2 = c2208671BcP.LIZIZ;
                    EnumC2208691BcR enumC2208691BcRType2 = c2208711BcT.type();
                    if (enumC2208691BcRType2 != null) {
                        int i2 = C2208701BcS.LIZ[enumC2208691BcRType2.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 == 5) {
                                            c2208681BcQ2.LJIIIIZZ(c2208711BcT, (String) objValueOf);
                                        }
                                    } else {
                                        c2208681BcQ2.LJFF(c2208711BcT, ((Float) objValueOf).floatValue());
                                    }
                                } else {
                                    c2208681BcQ2.LJII(c2208711BcT, ((Long) objValueOf).longValue());
                                }
                            } else {
                                c2208681BcQ2.LJI(c2208711BcT, ((Integer) objValueOf).intValue());
                            }
                        } else {
                            c2208681BcQ2.LJ(c2208711BcT, ((Boolean) objValueOf).booleanValue());
                        }
                    }
                    throw new C1954807lC();
                }
                throw new C1954807lC();
            }
        }
        C1442350ndZ c1442350ndZ = C1442350ndZ.LIZ;
        C1442350ndZ.LIZJ = true;
        c1442350ndZ.LIZ();
    }

    public void updateServerSettings(IESSettingsProxy iESSettingsProxy) {
        if (C1446440nkA.LIZ()) {
            C1446440nkA.LIZ();
        }
        C1442350ndZ c1442350ndZ = C1442350ndZ.LIZ;
        C1442350ndZ.LIZIZ = true;
        c1442350ndZ.LIZ();
        asyncMonitorAwemeSetting();
    }
}
