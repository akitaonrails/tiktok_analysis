package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftRealTimeTimeoutParams_OptTypeAdapter extends TypeAdapter<LiveGiftRealTimeTimeoutParams> {
    public final Gson LIZ;

    public LiveGiftRealTimeTimeoutParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveGiftRealTimeTimeoutParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGiftRealTimeTimeoutParams liveGiftRealTimeTimeoutParams = new LiveGiftRealTimeTimeoutParams(false, 30L, 1000L, 3L, 60L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1183925133:
                        if (strLJJJJ.equals("real_time_reason_block_days")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftRealTimeTimeoutParams.reasonBlockDays = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -26039991:
                        if (strLJJJJ.equals("real_time_update_timeout_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftRealTimeTimeoutParams.realTimeUpdateTimeout = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 268913921:
                        if (strLJJJJ.equals("real_time_reason_max_show_counts")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftRealTimeTimeoutParams.reasonMaxShowCounts = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 564732960:
                        if (strLJJJJ.equals("real_time_request_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftRealTimeTimeoutParams.realTimeRequestEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1999996658:
                        if (strLJJJJ.equals("block_realtime_updates_after_sending_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftRealTimeTimeoutParams.blockAfterSendSec = c09cu.LJJJ();
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
        return liveGiftRealTimeTimeoutParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftRealTimeTimeoutParams liveGiftRealTimeTimeoutParams) throws IOException {
        LiveGiftRealTimeTimeoutParams liveGiftRealTimeTimeoutParams2 = liveGiftRealTimeTimeoutParams;
        if (liveGiftRealTimeTimeoutParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("real_time_request_enabled");
        c09dl.LJJJJJL(liveGiftRealTimeTimeoutParams2.realTimeRequestEnabled);
        c09dl.LJIILLIIL("real_time_reason_max_show_counts");
        c09dl.LJJIZ(liveGiftRealTimeTimeoutParams2.reasonMaxShowCounts);
        c09dl.LJIILLIIL("real_time_update_timeout_ms");
        c09dl.LJJIZ(liveGiftRealTimeTimeoutParams2.realTimeUpdateTimeout);
        c09dl.LJIILLIIL("real_time_reason_block_days");
        c09dl.LJJIZ(liveGiftRealTimeTimeoutParams2.reasonBlockDays);
        c09dl.LJIILLIIL("block_realtime_updates_after_sending_sec");
        c09dl.LJJIZ(liveGiftRealTimeTimeoutParams2.blockAfterSendSec);
        c09dl.LJII();
    }
}
