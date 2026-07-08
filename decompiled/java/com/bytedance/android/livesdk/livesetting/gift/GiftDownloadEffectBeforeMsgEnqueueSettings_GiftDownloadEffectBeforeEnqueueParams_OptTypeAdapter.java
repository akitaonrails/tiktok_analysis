package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.GiftDownloadEffectBeforeMsgEnqueueSettings;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftDownloadEffectBeforeMsgEnqueueSettings_GiftDownloadEffectBeforeEnqueueParams_OptTypeAdapter extends TypeAdapter<GiftDownloadEffectBeforeMsgEnqueueSettings.GiftDownloadEffectBeforeEnqueueParams> {
    @Override // com.google.gson.TypeAdapter
    public final GiftDownloadEffectBeforeMsgEnqueueSettings.GiftDownloadEffectBeforeEnqueueParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GiftDownloadEffectBeforeMsgEnqueueSettings.GiftDownloadEffectBeforeEnqueueParams giftDownloadEffectBeforeEnqueueParams = new GiftDownloadEffectBeforeMsgEnqueueSettings.GiftDownloadEffectBeforeEnqueueParams(0, 5, 4000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1311292138) {
                    if (iHashCode != -1298848381) {
                        if (iHashCode == -1271194971 && strLJJJJ.equals("hot_room_special_queue_wait_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftDownloadEffectBeforeEnqueueParams.hotRoomSpecialQueueWaitSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            giftDownloadEffectBeforeEnqueueParams.isEnable = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("hot_room_download_loop_check_delay")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        giftDownloadEffectBeforeEnqueueParams.hotRoomDownloadLoopCheckDelay = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return giftDownloadEffectBeforeEnqueueParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftDownloadEffectBeforeMsgEnqueueSettings.GiftDownloadEffectBeforeEnqueueParams giftDownloadEffectBeforeEnqueueParams) throws IOException {
        GiftDownloadEffectBeforeMsgEnqueueSettings.GiftDownloadEffectBeforeEnqueueParams giftDownloadEffectBeforeEnqueueParams2 = giftDownloadEffectBeforeEnqueueParams;
        if (giftDownloadEffectBeforeEnqueueParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(giftDownloadEffectBeforeEnqueueParams2.isEnable));
        c09dl.LJIILLIIL("hot_room_special_queue_wait_size");
        c09dl.LJJJJ(Integer.valueOf(giftDownloadEffectBeforeEnqueueParams2.hotRoomSpecialQueueWaitSize));
        c09dl.LJIILLIIL("hot_room_download_loop_check_delay");
        c09dl.LJJIZ(giftDownloadEffectBeforeEnqueueParams2.hotRoomDownloadLoopCheckDelay);
        c09dl.LJII();
    }
}
