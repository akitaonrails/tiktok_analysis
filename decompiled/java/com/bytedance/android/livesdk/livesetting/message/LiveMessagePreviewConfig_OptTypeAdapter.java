package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveMessagePreviewConfig_OptTypeAdapter extends TypeAdapter<LiveMessagePreviewConfig> {
    public final Gson LIZ;

    public LiveMessagePreviewConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessagePreviewConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMessagePreviewConfig liveMessagePreviewConfig = new LiveMessagePreviewConfig(true, false, 10000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -2085426228) {
                    if (iHashCode != -1777082650) {
                        if (iHashCode == -702572213 && strLJJJJ.equals("enable_message")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessagePreviewConfig.setEnableMessage(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("stop_disconnect_ws_delay")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveMessagePreviewConfig.setStopDisconnectWsDelay(c09cu.LJJJ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("start_message_instant")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMessagePreviewConfig.setStartMessageInstant(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveMessagePreviewConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMessagePreviewConfig liveMessagePreviewConfig) throws IOException {
        LiveMessagePreviewConfig liveMessagePreviewConfig2 = liveMessagePreviewConfig;
        if (liveMessagePreviewConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_message");
        c09dl.LJJJJJL(liveMessagePreviewConfig2.getEnableMessage());
        c09dl.LJIILLIIL("start_message_instant");
        c09dl.LJJJJJL(liveMessagePreviewConfig2.getStartMessageInstant());
        c09dl.LJIILLIIL("stop_disconnect_ws_delay");
        c09dl.LJJIZ(liveMessagePreviewConfig2.getStopDisconnectWsDelay());
        c09dl.LJII();
    }
}
