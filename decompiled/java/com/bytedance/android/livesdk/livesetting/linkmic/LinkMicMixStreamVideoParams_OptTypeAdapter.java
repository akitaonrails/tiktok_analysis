package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LinkMicMixStreamVideoParams_OptTypeAdapter extends TypeAdapter<LinkMicMixStreamVideoParams> {
    @Override // com.google.gson.TypeAdapter
    public final LinkMicMixStreamVideoParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicMixStreamVideoParams linkMicMixStreamVideoParams = new LinkMicMixStreamVideoParams("", -1, -1);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 101609) {
                    if (iHashCode != 102536) {
                        if (iHashCode == 94834710 && strLJJJJ.equals("codec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicMixStreamVideoParams.codec = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("gop")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            linkMicMixStreamVideoParams.gop = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("fps")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        linkMicMixStreamVideoParams.fps = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return linkMicMixStreamVideoParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicMixStreamVideoParams linkMicMixStreamVideoParams) {
        LinkMicMixStreamVideoParams linkMicMixStreamVideoParams2 = linkMicMixStreamVideoParams;
        if (linkMicMixStreamVideoParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("codec");
        c09dl.LJJJJJ(linkMicMixStreamVideoParams2.codec);
        c09dl.LJIILLIIL("fps");
        c09dl.LJJJJ(Integer.valueOf(linkMicMixStreamVideoParams2.fps));
        c09dl.LJIILLIIL("gop");
        c09dl.LJJJJ(Integer.valueOf(linkMicMixStreamVideoParams2.gop));
        c09dl.LJII();
    }
}
