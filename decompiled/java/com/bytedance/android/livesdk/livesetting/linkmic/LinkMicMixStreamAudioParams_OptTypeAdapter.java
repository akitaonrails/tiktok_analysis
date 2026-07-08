package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LinkMicMixStreamAudioParams_OptTypeAdapter extends TypeAdapter<LinkMicMixStreamAudioParams> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LinkMicMixStreamAudioParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicMixStreamAudioParams linkMicMixStreamAudioParams = new LinkMicMixStreamAudioParams(-1, -1, -1, "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -103223411:
                        if (strLJJJJ.equals("bitRate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicMixStreamAudioParams.bitRate = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 143085994:
                        if (strLJJJJ.equals("sampleRate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicMixStreamAudioParams.sampleRate = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 983394278:
                        if (strLJJJJ.equals("aacProfile")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicMixStreamAudioParams.aacProfile = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1432626128:
                        if (strLJJJJ.equals("channels")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicMixStreamAudioParams.channels = c09cu.LJJIZ();
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
        return linkMicMixStreamAudioParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicMixStreamAudioParams linkMicMixStreamAudioParams) {
        LinkMicMixStreamAudioParams linkMicMixStreamAudioParams2 = linkMicMixStreamAudioParams;
        if (linkMicMixStreamAudioParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("bitRate");
        c09dl.LJJJJ(Integer.valueOf(linkMicMixStreamAudioParams2.bitRate));
        c09dl.LJIILLIIL("sampleRate");
        c09dl.LJJJJ(Integer.valueOf(linkMicMixStreamAudioParams2.sampleRate));
        c09dl.LJIILLIIL("channels");
        c09dl.LJJJJ(Integer.valueOf(linkMicMixStreamAudioParams2.channels));
        c09dl.LJIILLIIL("aacProfile");
        c09dl.LJJJJJ(linkMicMixStreamAudioParams2.aacProfile);
        c09dl.LJII();
    }
}
