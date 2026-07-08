package com.bytedance.android.livesdk.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveMessageTimeoutConfig_OptTypeAdapter extends TypeAdapter<LiveMessageTimeoutConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveMessageTimeoutConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMessageTimeoutConfig liveMessageTimeoutConfig = new LiveMessageTimeoutConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -843836544) {
                    if (iHashCode != 611861429) {
                        if (iHashCode == 1858670505 && strLJJJJ.equals("ws_connect_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageTimeoutConfig.wsConnectTimeout = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("http_fetch_request_timeout")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveMessageTimeoutConfig.httpFetchRequestTimeout = c09cu.LJJJ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("http_fetch_monitor_timeout")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMessageTimeoutConfig.httpFetchMonitorTimeout = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveMessageTimeoutConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMessageTimeoutConfig liveMessageTimeoutConfig) throws IOException {
        LiveMessageTimeoutConfig liveMessageTimeoutConfig2 = liveMessageTimeoutConfig;
        if (liveMessageTimeoutConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("http_fetch_monitor_timeout");
        c09dl.LJJIZ(liveMessageTimeoutConfig2.httpFetchMonitorTimeout);
        c09dl.LJIILLIIL("http_fetch_request_timeout");
        c09dl.LJJIZ(liveMessageTimeoutConfig2.httpFetchRequestTimeout);
        c09dl.LJIILLIIL("ws_connect_timeout");
        c09dl.LJJIZ(liveMessageTimeoutConfig2.wsConnectTimeout);
        c09dl.LJII();
    }
}
