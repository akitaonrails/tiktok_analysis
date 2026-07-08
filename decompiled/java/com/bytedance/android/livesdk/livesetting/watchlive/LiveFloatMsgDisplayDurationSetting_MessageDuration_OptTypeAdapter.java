package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFloatMsgDisplayDurationSetting;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveFloatMsgDisplayDurationSetting_MessageDuration_OptTypeAdapter extends TypeAdapter<LiveFloatMsgDisplayDurationSetting.MessageDuration> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveFloatMsgDisplayDurationSetting.MessageDuration read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveFloatMsgDisplayDurationSetting.MessageDuration messageDuration = new LiveFloatMsgDisplayDurationSetting.MessageDuration(Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 2000L, 2000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1471355405:
                        if (strLJJJJ.equals("bottom_message")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                messageDuration.bottomMessageDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -826598237:
                        if (strLJJJJ.equals("room_message")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                messageDuration.roomMessageDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -511800095:
                        if (strLJJJJ.equals("pre_show_message")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                messageDuration.preShowMessage = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -85171680:
                        if (strLJJJJ.equals("chat_message")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                messageDuration.chatMessageDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1307358333:
                        if (strLJJJJ.equals("pre_show_end_message")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                messageDuration.preShowEndMessage = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1905189172:
                        if (strLJJJJ.equals("intro_message")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                messageDuration.introMessage = c09cu.LJJJ();
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
        return messageDuration;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveFloatMsgDisplayDurationSetting.MessageDuration messageDuration) throws IOException {
        LiveFloatMsgDisplayDurationSetting.MessageDuration messageDuration2 = messageDuration;
        if (messageDuration2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("chat_message");
        c09dl.LJJIZ(messageDuration2.chatMessageDuration);
        c09dl.LJIILLIIL("bottom_message");
        c09dl.LJJIZ(messageDuration2.bottomMessageDuration);
        c09dl.LJIILLIIL("room_message");
        c09dl.LJJIZ(messageDuration2.roomMessageDuration);
        c09dl.LJIILLIIL("intro_message");
        c09dl.LJJIZ(messageDuration2.introMessage);
        c09dl.LJIILLIIL("pre_show_message");
        c09dl.LJJIZ(messageDuration2.preShowMessage);
        c09dl.LJIILLIIL("pre_show_end_message");
        c09dl.LJJIZ(messageDuration2.preShowEndMessage);
        c09dl.LJII();
    }
}
