package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicEmptyWaterMarkImageUrlSetting;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class LinkMicEmptyWaterMarkImageUrlSetting_EmptyWaterUrlInfo_OptTypeAdapter extends TypeAdapter<LinkMicEmptyWaterMarkImageUrlSetting.EmptyWaterUrlInfo> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LinkMicEmptyWaterMarkImageUrlSetting.EmptyWaterUrlInfo read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicEmptyWaterMarkImageUrlSetting.EmptyWaterUrlInfo emptyWaterUrlInfo = new LinkMicEmptyWaterMarkImageUrlSetting.EmptyWaterUrlInfo("", "", "", "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -614226963:
                        if (strLJJJJ.equals("audio_chat_image_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                emptyWaterUrlInfo.audioChatImageUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -115272466:
                        if (strLJJJJ.equals("empty_mic_image_gradient_black_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                emptyWaterUrlInfo.emptyMicImageGradientBlackUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 247657773:
                        if (strLJJJJ.equals("audio_chat_image_black_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                emptyWaterUrlInfo.audioChatImageBlackUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 319312737:
                        if (strLJJJJ.equals("empty_mic_image_black_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                emptyWaterUrlInfo.emptyMicImageBlackUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1573435681:
                        if (strLJJJJ.equals("empty_mic_image_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                emptyWaterUrlInfo.emptyMicImageUrl = c09cu.LJJJZ();
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
        return emptyWaterUrlInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicEmptyWaterMarkImageUrlSetting.EmptyWaterUrlInfo emptyWaterUrlInfo) {
        LinkMicEmptyWaterMarkImageUrlSetting.EmptyWaterUrlInfo emptyWaterUrlInfo2 = emptyWaterUrlInfo;
        if (emptyWaterUrlInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("empty_mic_image_url");
        c09dl.LJJJJJ(emptyWaterUrlInfo2.emptyMicImageUrl);
        c09dl.LJIILLIIL("audio_chat_image_url");
        c09dl.LJJJJJ(emptyWaterUrlInfo2.audioChatImageUrl);
        c09dl.LJIILLIIL("empty_mic_image_black_url");
        c09dl.LJJJJJ(emptyWaterUrlInfo2.emptyMicImageBlackUrl);
        c09dl.LJIILLIIL("audio_chat_image_black_url");
        c09dl.LJJJJJ(emptyWaterUrlInfo2.audioChatImageBlackUrl);
        c09dl.LJIILLIIL("empty_mic_image_gradient_black_url");
        c09dl.LJJJJJ(emptyWaterUrlInfo2.emptyMicImageGradientBlackUrl);
        c09dl.LJII();
    }
}
