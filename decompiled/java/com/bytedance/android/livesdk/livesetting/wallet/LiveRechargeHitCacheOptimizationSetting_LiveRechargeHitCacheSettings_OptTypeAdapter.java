package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeHitCacheOptimizationSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRechargeHitCacheOptimizationSetting_LiveRechargeHitCacheSettings_OptTypeAdapter extends TypeAdapter<LiveRechargeHitCacheOptimizationSetting.LiveRechargeHitCacheSettings> {
    public final Gson LIZ;

    public LiveRechargeHitCacheOptimizationSetting_LiveRechargeHitCacheSettings_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRechargeHitCacheOptimizationSetting.LiveRechargeHitCacheSettings read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRechargeHitCacheOptimizationSetting.LiveRechargeHitCacheSettings liveRechargeHitCacheSettings = new LiveRechargeHitCacheOptimizationSetting.LiveRechargeHitCacheSettings();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1545477013) {
                    if (iHashCode != -1298848381) {
                        if (iHashCode == 1777193362 && strLJJJJ.equals("prefetch_diamond_effect_days")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRechargeHitCacheSettings.prefetchDiamondEffectDays = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveRechargeHitCacheSettings.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("threshold")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveRechargeHitCacheSettings.coinsThreshold = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveRechargeHitCacheSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRechargeHitCacheOptimizationSetting.LiveRechargeHitCacheSettings liveRechargeHitCacheSettings) throws IOException {
        LiveRechargeHitCacheOptimizationSetting.LiveRechargeHitCacheSettings liveRechargeHitCacheSettings2 = liveRechargeHitCacheSettings;
        if (liveRechargeHitCacheSettings2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveRechargeHitCacheSettings2.enable);
        c09dl.LJIILLIIL("threshold");
        c09dl.LJJJJ(Integer.valueOf(liveRechargeHitCacheSettings2.coinsThreshold));
        c09dl.LJIILLIIL("prefetch_diamond_effect_days");
        c09dl.LJJJJ(Integer.valueOf(liveRechargeHitCacheSettings2.prefetchDiamondEffectDays));
        c09dl.LJII();
    }
}
