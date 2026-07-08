package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkMicApplyHangupConfig_OptTypeAdapter extends TypeAdapter<LinkMicApplyHangupConfig> {
    public final Gson LIZ;

    public LinkMicApplyHangupConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LinkMicApplyHangupConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicApplyHangupConfig linkMicApplyHangupConfig = new LinkMicApplyHangupConfig(false, 5, 20, 7);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1997654777:
                        if (strLJJJJ.equals("overdue_time_second")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicApplyHangupConfig.overdueTimeSecond = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1693133238:
                        if (strLJJJJ.equals("share_icon_priority")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicApplyHangupConfig.shareIconPriority = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicApplyHangupConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 605780643:
                        if (strLJJJJ.equals("max_apply_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicApplyHangupConfig.maxApplyCount = c09cu.LJJIZ();
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
        return linkMicApplyHangupConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicApplyHangupConfig linkMicApplyHangupConfig) throws IOException {
        LinkMicApplyHangupConfig linkMicApplyHangupConfig2 = linkMicApplyHangupConfig;
        if (linkMicApplyHangupConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(linkMicApplyHangupConfig2.enable);
        c09dl.LJIILLIIL("max_apply_count");
        c09dl.LJJJJ(Integer.valueOf(linkMicApplyHangupConfig2.maxApplyCount));
        c09dl.LJIILLIIL("overdue_time_second");
        c09dl.LJJJJ(Integer.valueOf(linkMicApplyHangupConfig2.overdueTimeSecond));
        c09dl.LJIILLIIL("share_icon_priority");
        c09dl.LJJJJ(Integer.valueOf(linkMicApplyHangupConfig2.shareIconPriority));
        c09dl.LJII();
    }
}
