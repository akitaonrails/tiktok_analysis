package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LinkMicAudioSelectionPriorityConfig_OptTypeAdapter extends TypeAdapter<LinkMicAudioSelectionPriorityConfig> {
    public final Gson LIZ;

    public LinkMicAudioSelectionPriorityConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicAudioSelectionPriorityConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicAudioSelectionPriorityConfig linkMicAudioSelectionPriorityConfig = new LinkMicAudioSelectionPriorityConfig(false, 2, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 1005670462) {
                    if (iHashCode != 1120121612) {
                        if (iHashCode == 1146571567 && strLJJJJ.equals("linkmic_downlink_select_priority_guest")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicAudioSelectionPriorityConfig.guestPriority = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("linkmic_downlink_select_priority_enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            linkMicAudioSelectionPriorityConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("linkmic_downlink_select_priority_anchor")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        linkMicAudioSelectionPriorityConfig.anchorPriority = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return linkMicAudioSelectionPriorityConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicAudioSelectionPriorityConfig linkMicAudioSelectionPriorityConfig) throws IOException {
        LinkMicAudioSelectionPriorityConfig linkMicAudioSelectionPriorityConfig2 = linkMicAudioSelectionPriorityConfig;
        if (linkMicAudioSelectionPriorityConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("linkmic_downlink_select_priority_enable");
        c09dl.LJJJJJL(linkMicAudioSelectionPriorityConfig2.enable);
        c09dl.LJIILLIIL("linkmic_downlink_select_priority_anchor");
        c09dl.LJJJJ(Integer.valueOf(linkMicAudioSelectionPriorityConfig2.anchorPriority));
        c09dl.LJIILLIIL("linkmic_downlink_select_priority_guest");
        c09dl.LJJJJ(Integer.valueOf(linkMicAudioSelectionPriorityConfig2.guestPriority));
        c09dl.LJII();
    }
}
