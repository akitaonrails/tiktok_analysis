package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveMessageStickyConfig_OptTypeAdapter extends TypeAdapter<LiveMessageStickyConfig> {
    public final Gson LIZ;

    public LiveMessageStickyConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMessageStickyConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMessageStickyConfig liveMessageStickyConfig = new LiveMessageStickyConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageStickyConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -927204036:
                        if (strLJJJJ.equals("method_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageStickyConfig.setMethodList(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 74104641:
                        if (strLJJJJ.equals("sticky_till_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageStickyConfig.setStickyTillTime(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 610532072:
                        if (strLJJJJ.equals("capacity_per_method")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageStickyConfig.setCapacityPerMethod(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2115107807:
                        if (strLJJJJ.equals("sticky_time_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageStickyConfig.setStickyTimeLimit(c09cu.LJJIZ());
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
        return liveMessageStickyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMessageStickyConfig liveMessageStickyConfig) throws IOException {
        LiveMessageStickyConfig liveMessageStickyConfig2 = liveMessageStickyConfig;
        if (liveMessageStickyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveMessageStickyConfig2.getEnable());
        c09dl.LJIILLIIL("method_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveMessageStickyConfig2.getMethodList(), String.class);
        c09dl.LJIILLIIL("capacity_per_method");
        c09dl.LJJJJ(Integer.valueOf(liveMessageStickyConfig2.getCapacityPerMethod()));
        c09dl.LJIILLIIL("sticky_time_limit");
        c09dl.LJJJJ(Integer.valueOf(liveMessageStickyConfig2.getStickyTimeLimit()));
        c09dl.LJIILLIIL("sticky_till_time");
        c09dl.LJJJJ(Integer.valueOf(liveMessageStickyConfig2.getStickyTillTime()));
        c09dl.LJII();
    }
}
