package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkMicNewAnchorPanelConfig_OptTypeAdapter extends TypeAdapter<LinkMicNewAnchorPanelConfig> {
    public final Gson LIZ;

    public LinkMicNewAnchorPanelConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LinkMicNewAnchorPanelConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicNewAnchorPanelConfig linkMicNewAnchorPanelConfig = new LinkMicNewAnchorPanelConfig(false, 20, 20, 3, 3, 3, 3, 3, 3, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicNewAnchorPanelConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1047045859:
                        if (strLJJJJ.equals("apply_list_fold_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicNewAnchorPanelConfig.applyListFoldThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -356954687:
                        if (strLJJJJ.equals("viewer_list_fold_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicNewAnchorPanelConfig.viewerListFoldThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -165376358:
                        if (strLJJJJ.equals("apply_list_expand_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicNewAnchorPanelConfig.applyListExpandCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 69052874:
                        if (strLJJJJ.equals("friend_list_expand_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicNewAnchorPanelConfig.friendListExpandCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 191351866:
                        if (strLJJJJ.equals("suggest_list_in_real_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicNewAnchorPanelConfig.suggestListInRealTime = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 197352510:
                        if (strLJJJJ.equals("viewer_list_expand_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicNewAnchorPanelConfig.viewerListExpandCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 409264832:
                        if (strLJJJJ.equals("live_event_reservation_list_expand_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicNewAnchorPanelConfig.liveEventReservationListExpandCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 901146701:
                        if (strLJJJJ.equals("friend_list_fold_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicNewAnchorPanelConfig.friendListFoldThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1427323843:
                        if (strLJJJJ.equals("live_event_reservation_list_fold_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicNewAnchorPanelConfig.liveEventReservationListFoldThreshold = c09cu.LJJIZ();
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
        return linkMicNewAnchorPanelConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicNewAnchorPanelConfig linkMicNewAnchorPanelConfig) throws IOException {
        LinkMicNewAnchorPanelConfig linkMicNewAnchorPanelConfig2 = linkMicNewAnchorPanelConfig;
        if (linkMicNewAnchorPanelConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(linkMicNewAnchorPanelConfig2.enable);
        c09dl.LJIILLIIL("apply_list_fold_threshold");
        c09dl.LJJJJ(Integer.valueOf(linkMicNewAnchorPanelConfig2.applyListFoldThreshold));
        c09dl.LJIILLIIL("apply_list_expand_count");
        c09dl.LJJJJ(Integer.valueOf(linkMicNewAnchorPanelConfig2.applyListExpandCount));
        c09dl.LJIILLIIL("viewer_list_fold_threshold");
        c09dl.LJJJJ(Integer.valueOf(linkMicNewAnchorPanelConfig2.viewerListFoldThreshold));
        c09dl.LJIILLIIL("viewer_list_expand_count");
        c09dl.LJJJJ(Integer.valueOf(linkMicNewAnchorPanelConfig2.viewerListExpandCount));
        c09dl.LJIILLIIL("live_event_reservation_list_fold_threshold");
        c09dl.LJJJJ(Integer.valueOf(linkMicNewAnchorPanelConfig2.liveEventReservationListFoldThreshold));
        c09dl.LJIILLIIL("live_event_reservation_list_expand_count");
        c09dl.LJJJJ(Integer.valueOf(linkMicNewAnchorPanelConfig2.liveEventReservationListExpandCount));
        c09dl.LJIILLIIL("friend_list_fold_threshold");
        c09dl.LJJJJ(Integer.valueOf(linkMicNewAnchorPanelConfig2.friendListFoldThreshold));
        c09dl.LJIILLIIL("friend_list_expand_count");
        c09dl.LJJJJ(Integer.valueOf(linkMicNewAnchorPanelConfig2.friendListExpandCount));
        c09dl.LJIILLIIL("suggest_list_in_real_time");
        c09dl.LJJJJJL(linkMicNewAnchorPanelConfig2.suggestListInRealTime);
        c09dl.LJII();
    }
}
