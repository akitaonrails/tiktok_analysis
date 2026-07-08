package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.other.LiveLikeRequestOptSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveLikeRequestOptSetting_LiveLikeRequestOptConfig_OptTypeAdapter extends TypeAdapter<LiveLikeRequestOptSetting.LiveLikeRequestOptConfig> {
    public final Gson LIZ;

    public LiveLikeRequestOptSetting_LiveLikeRequestOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveLikeRequestOptSetting.LiveLikeRequestOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveLikeRequestOptSetting.LiveLikeRequestOptConfig liveLikeRequestOptConfig = new LiveLikeRequestOptSetting.LiveLikeRequestOptConfig(false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1308796373) {
                    if (iHashCode != -443475721) {
                        if (iHashCode == 150416737 && strLJJJJ.equals("live_like_multi_guest_request_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveLikeRequestOptConfig.multiGuestAnchorRequestOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("live_like_request_retry_opt")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveLikeRequestOptConfig.retryRequest = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("live_like_request_exit_room_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveLikeRequestOptConfig.exitRoomRequest = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveLikeRequestOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveLikeRequestOptSetting.LiveLikeRequestOptConfig liveLikeRequestOptConfig) throws IOException {
        LiveLikeRequestOptSetting.LiveLikeRequestOptConfig liveLikeRequestOptConfig2 = liveLikeRequestOptConfig;
        if (liveLikeRequestOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_like_request_retry_opt");
        c09dl.LJJJJJL(liveLikeRequestOptConfig2.retryRequest);
        c09dl.LJIILLIIL("live_like_request_exit_room_opt");
        c09dl.LJJJJJL(liveLikeRequestOptConfig2.exitRoomRequest);
        c09dl.LJIILLIIL("live_like_multi_guest_request_opt");
        c09dl.LJJJJJL(liveLikeRequestOptConfig2.multiGuestAnchorRequestOpt);
        c09dl.LJII();
    }
}
