package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenFirstMessagesReleaseSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePublicScreenFirstMessagesReleaseSetting_Config_OptTypeAdapter extends TypeAdapter<LivePublicScreenFirstMessagesReleaseSetting.Config> {
    public final Gson LIZ;

    public LivePublicScreenFirstMessagesReleaseSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePublicScreenFirstMessagesReleaseSetting.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePublicScreenFirstMessagesReleaseSetting.Config config = new LivePublicScreenFirstMessagesReleaseSetting.Config();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -931418090:
                        if (strLJJJJ.equals("per_loop_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.perLoopCount = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -779184137:
                        if (strLJJJJ.equals("max_hot_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.maxHotLevel = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 84853766:
                        if (strLJJJJ.equals("msg_recv_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.messageReceiveTimeout = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 287489325:
                        if (strLJJJJ.equals("per_loop_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.perLoopDuration = C473040Igo.LIZ(this.LIZ, c09cu, Long.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 466387790:
                        if (strLJJJJ.equals("hide_fold_area")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.hideFoldArea = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1349547969:
                        if (strLJJJJ.equals("sequence")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.sequence = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1766818693:
                        if (strLJJJJ.equals("self_enter_bottom")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.selfEnterBottom = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePublicScreenFirstMessagesReleaseSetting.Config config) throws IOException {
        LivePublicScreenFirstMessagesReleaseSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(config2.enable);
        c09dl.LJIILLIIL("sequence");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.sequence, String.class);
        c09dl.LJIILLIIL("per_loop_count");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.perLoopCount, Integer.TYPE);
        c09dl.LJIILLIIL("per_loop_duration");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.perLoopDuration, Long.TYPE);
        c09dl.LJIILLIIL("self_enter_bottom");
        c09dl.LJJJJJL(config2.selfEnterBottom);
        c09dl.LJIILLIIL("hide_fold_area");
        c09dl.LJJJJJL(config2.hideFoldArea);
        c09dl.LJIILLIIL("msg_recv_timeout");
        c09dl.LJJIZ(config2.messageReceiveTimeout);
        c09dl.LJIILLIIL("max_hot_level");
        c09dl.LJJJJ(Integer.valueOf(config2.maxHotLevel));
        c09dl.LJII();
    }
}
