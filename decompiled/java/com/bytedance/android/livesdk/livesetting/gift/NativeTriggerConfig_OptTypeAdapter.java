package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class NativeTriggerConfig_OptTypeAdapter extends TypeAdapter<NativeTriggerConfig> {
    public final Gson LIZ;

    public NativeTriggerConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final NativeTriggerConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        NativeTriggerConfig nativeTriggerConfig = new NativeTriggerConfig(null, null, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "trigger_type_disable_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    nativeTriggerConfig.triggerTypeDisableList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "enable_pitaya_filter_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    nativeTriggerConfig.enablePitayaFilterList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return nativeTriggerConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, NativeTriggerConfig nativeTriggerConfig) {
        NativeTriggerConfig nativeTriggerConfig2 = nativeTriggerConfig;
        if (nativeTriggerConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("trigger_type_disable_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, nativeTriggerConfig2.triggerTypeDisableList, String.class);
        c09dl.LJIILLIIL("enable_pitaya_filter_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, nativeTriggerConfig2.enablePitayaFilterList, String.class);
        c09dl.LJII();
    }
}
