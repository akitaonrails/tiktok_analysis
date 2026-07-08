package com.bytedance.android.livesdk.livesetting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.LiveEffectNotifyDelaySetting;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveEffectNotifyDelaySetting_EffectNotifyDelayInfo_OptTypeAdapter extends TypeAdapter<LiveEffectNotifyDelaySetting.EffectNotifyDelayInfo> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveEffectNotifyDelaySetting.EffectNotifyDelayInfo read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveEffectNotifyDelaySetting.EffectNotifyDelayInfo effectNotifyDelayInfo = new LiveEffectNotifyDelaySetting.EffectNotifyDelayInfo(5000, 15000, 5000, 15000);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1943736905:
                        if (strLJJJJ.equals("banner_audience")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                effectNotifyDelayInfo.bannerAudience = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1769774629:
                        if (strLJJJJ.equals("mid_touch_audience")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                effectNotifyDelayInfo.midTouchAudience = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 733561932:
                        if (strLJJJJ.equals("mid_touch_anchor")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                effectNotifyDelayInfo.midTouchAnchor = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 952375080:
                        if (strLJJJJ.equals("banner_anchor")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                effectNotifyDelayInfo.bannerAnchor = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return effectNotifyDelayInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveEffectNotifyDelaySetting.EffectNotifyDelayInfo effectNotifyDelayInfo) {
        LiveEffectNotifyDelaySetting.EffectNotifyDelayInfo effectNotifyDelayInfo2 = effectNotifyDelayInfo;
        if (effectNotifyDelayInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("banner_audience");
        c09dl.LJJJJ(Integer.valueOf(effectNotifyDelayInfo2.bannerAudience));
        c09dl.LJIILLIIL("banner_anchor");
        c09dl.LJJJJ(Integer.valueOf(effectNotifyDelayInfo2.bannerAnchor));
        c09dl.LJIILLIIL("mid_touch_audience");
        c09dl.LJJJJ(Integer.valueOf(effectNotifyDelayInfo2.midTouchAudience));
        c09dl.LJIILLIIL("mid_touch_anchor");
        c09dl.LJJJJ(Integer.valueOf(effectNotifyDelayInfo2.midTouchAnchor));
        c09dl.LJII();
    }
}
