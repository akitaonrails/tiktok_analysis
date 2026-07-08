package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveCardOverdrawOptConfigData_OptTypeAdapter extends TypeAdapter<LiveCardOverdrawOptConfigData> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveCardOverdrawOptConfigData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCardOverdrawOptConfigData liveCardOverdrawOptConfigData = new LiveCardOverdrawOptConfigData(0, 0, 0, 3400L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1994634857:
                        if (strLJJJJ.equals("webcast_version_for_multi_host")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCardOverdrawOptConfigData.webcastVersionForMultiHost = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -273790981:
                        if (strLJJJJ.equals("enable_overdraw_opt_for_multi_host")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCardOverdrawOptConfigData.enableOverdrawOptForMultiHost = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 101656037:
                        if (strLJJJJ.equals("enable_overdraw_opt_for_multi_guest")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCardOverdrawOptConfigData.enableOverdrawOptForMultiGuest = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1256549714:
                        if (strLJJJJ.equals("enable_overdraw_opt_for_voice_chat")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCardOverdrawOptConfigData.enableOverdrawOptForVoiceChat = c09cu.LJJIZ();
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
        return liveCardOverdrawOptConfigData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCardOverdrawOptConfigData liveCardOverdrawOptConfigData) throws IOException {
        LiveCardOverdrawOptConfigData liveCardOverdrawOptConfigData2 = liveCardOverdrawOptConfigData;
        if (liveCardOverdrawOptConfigData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_overdraw_opt_for_multi_guest");
        c09dl.LJJJJ(Integer.valueOf(liveCardOverdrawOptConfigData2.enableOverdrawOptForMultiGuest));
        c09dl.LJIILLIIL("enable_overdraw_opt_for_multi_host");
        c09dl.LJJJJ(Integer.valueOf(liveCardOverdrawOptConfigData2.enableOverdrawOptForMultiHost));
        c09dl.LJIILLIIL("enable_overdraw_opt_for_voice_chat");
        c09dl.LJJJJ(Integer.valueOf(liveCardOverdrawOptConfigData2.enableOverdrawOptForVoiceChat));
        c09dl.LJIILLIIL("webcast_version_for_multi_host");
        c09dl.LJJIZ(liveCardOverdrawOptConfigData2.webcastVersionForMultiHost);
        c09dl.LJII();
    }
}
