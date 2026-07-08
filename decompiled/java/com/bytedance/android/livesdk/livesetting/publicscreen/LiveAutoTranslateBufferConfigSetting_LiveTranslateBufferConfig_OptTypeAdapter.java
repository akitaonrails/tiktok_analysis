package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateBufferConfigSetting;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveAutoTranslateBufferConfigSetting_LiveTranslateBufferConfig_OptTypeAdapter extends TypeAdapter<LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig liveTranslateBufferConfig = new LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -2011470864) {
                    if (iHashCode != -1840714798) {
                        if (iHashCode == -11408869 && strLJJJJ.equals("live_message_auto_translate_request_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTranslateBufferConfig.messageAutoTranslateRequestTimeout = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("live_auto_translate_buffer_size")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveTranslateBufferConfig.autoTranslateBufferSize = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("live_auto_translate_buffer_timeout")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveTranslateBufferConfig.autoTranslateBufferTimeout = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveTranslateBufferConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig liveTranslateBufferConfig) throws IOException {
        LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig liveTranslateBufferConfig2 = liveTranslateBufferConfig;
        if (liveTranslateBufferConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_auto_translate_buffer_size");
        c09dl.LJJJJ(Integer.valueOf(liveTranslateBufferConfig2.autoTranslateBufferSize));
        c09dl.LJIILLIIL("live_auto_translate_buffer_timeout");
        c09dl.LJJIZ(liveTranslateBufferConfig2.autoTranslateBufferTimeout);
        c09dl.LJIILLIIL("live_message_auto_translate_request_timeout");
        c09dl.LJJIZ(liveTranslateBufferConfig2.messageAutoTranslateRequestTimeout);
        c09dl.LJII();
    }
}
