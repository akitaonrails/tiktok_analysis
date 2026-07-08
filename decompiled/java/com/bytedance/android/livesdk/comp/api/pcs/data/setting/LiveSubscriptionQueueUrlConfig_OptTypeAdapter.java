package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveSubscriptionQueueUrlConfig_OptTypeAdapter extends TypeAdapter<LiveSubscriptionQueueUrlConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveSubscriptionQueueUrlConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSubscriptionQueueUrlConfig liveSubscriptionQueueUrlConfig = new LiveSubscriptionQueueUrlConfig("", "", "", "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1071044310:
                        if (strLJJJJ.equals("anchor_queue_start")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionQueueUrlConfig.setAnchorQueueStart(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -162105451:
                        if (strLJJJJ.equals("anchor_queue_preview_panel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionQueueUrlConfig.setAnchorQueuePreviewPanel(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 238229331:
                        if (strLJJJJ.equals("host_live_manage_queue")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionQueueUrlConfig.setHostLiveManageQueue(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1084075815:
                        if (strLJJJJ.equals("anchor_queue_global_management")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionQueueUrlConfig.setAnchorQueueGlobalManagement(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1931513519:
                        if (strLJJJJ.equals("anchor_queue_start_panel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionQueueUrlConfig.setAnchorQueueStartPanel(c09cu.LJJJZ());
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
        return liveSubscriptionQueueUrlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSubscriptionQueueUrlConfig liveSubscriptionQueueUrlConfig) {
        LiveSubscriptionQueueUrlConfig liveSubscriptionQueueUrlConfig2 = liveSubscriptionQueueUrlConfig;
        if (liveSubscriptionQueueUrlConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("anchor_queue_start");
        c09dl.LJJJJJ(liveSubscriptionQueueUrlConfig2.getAnchorQueueStart());
        c09dl.LJIILLIIL("anchor_queue_start_panel");
        c09dl.LJJJJJ(liveSubscriptionQueueUrlConfig2.getAnchorQueueStartPanel());
        c09dl.LJIILLIIL("anchor_queue_preview_panel");
        c09dl.LJJJJJ(liveSubscriptionQueueUrlConfig2.getAnchorQueuePreviewPanel());
        c09dl.LJIILLIIL("anchor_queue_global_management");
        c09dl.LJJJJJ(liveSubscriptionQueueUrlConfig2.getAnchorQueueGlobalManagement());
        c09dl.LJIILLIIL("host_live_manage_queue");
        c09dl.LJJJJJ(liveSubscriptionQueueUrlConfig2.getHostLiveManageQueue());
        c09dl.LJII();
    }
}
