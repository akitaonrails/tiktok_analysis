package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveCoHostLayoutIdConfig_OptTypeAdapter extends TypeAdapter<LiveCoHostLayoutIdConfig> {
    public final Gson LIZ;

    public LiveCoHostLayoutIdConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveCoHostLayoutIdConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCoHostLayoutIdConfig liveCoHostLayoutIdConfig = new LiveCoHostLayoutIdConfig("2001", "200101", "2002", "200201", "2010", "2011", "2101", "2102", "2103", "2104", "2200", new LiveCoHostScreenShareLayoutIdConfig(null, null, 3, null));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1083827998:
                        if (strLJJJJ.equals("auto_rematch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCoHostLayoutIdConfig.autoRematch = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1077937554:
                        if (strLJJJJ.equals("other_anchor_zoomed_v2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCoHostLayoutIdConfig.otherAnchorZoomed_v2 = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1039745817:
                        if (strLJJJJ.equals("normal")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCoHostLayoutIdConfig.normal = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -261640472:
                        if (strLJJJJ.equals("normal_crop")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCoHostLayoutIdConfig.normalCrop = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 286763442:
                        if (strLJJJJ.equals("self_anchor_zoomed_v2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCoHostLayoutIdConfig.selfAnchorZoomed_v2 = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 450469309:
                        if (strLJJJJ.equals("normal_expand_crop")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCoHostLayoutIdConfig.normalExpandCrop = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 522345353:
                        if (strLJJJJ.equals("cohost_with_guests")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCoHostLayoutIdConfig.cohostWithGuest = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 707534997:
                        if (strLJJJJ.equals("screen_share_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCoHostLayoutIdConfig.screenShareConfig = (LiveCoHostScreenShareLayoutIdConfig) this.LIZ.LJIIJ(LiveCoHostScreenShareLayoutIdConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1538257293:
                        if (strLJJJJ.equals("other_anchor_zoomed")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCoHostLayoutIdConfig.otherAnchorZoomed = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1735483543:
                        if (strLJJJJ.equals("auto_rematch_expand")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCoHostLayoutIdConfig.autoRematchExpand = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1827940553:
                        if (strLJJJJ.equals("self_anchor_zoomed")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCoHostLayoutIdConfig.selfAnchorZoomed = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2029395186:
                        if (strLJJJJ.equals("normal_expand")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCoHostLayoutIdConfig.normalExpand = c09cu.LJJJZ();
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
        return liveCoHostLayoutIdConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCoHostLayoutIdConfig liveCoHostLayoutIdConfig) {
        LiveCoHostLayoutIdConfig liveCoHostLayoutIdConfig2 = liveCoHostLayoutIdConfig;
        if (liveCoHostLayoutIdConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("normal");
        c09dl.LJJJJJ(liveCoHostLayoutIdConfig2.normal);
        c09dl.LJIILLIIL("normal_crop");
        c09dl.LJJJJJ(liveCoHostLayoutIdConfig2.normalCrop);
        c09dl.LJIILLIIL("normal_expand");
        c09dl.LJJJJJ(liveCoHostLayoutIdConfig2.normalExpand);
        c09dl.LJIILLIIL("normal_expand_crop");
        c09dl.LJJJJJ(liveCoHostLayoutIdConfig2.normalExpandCrop);
        c09dl.LJIILLIIL("auto_rematch");
        c09dl.LJJJJJ(liveCoHostLayoutIdConfig2.autoRematch);
        c09dl.LJIILLIIL("auto_rematch_expand");
        c09dl.LJJJJJ(liveCoHostLayoutIdConfig2.autoRematchExpand);
        c09dl.LJIILLIIL("other_anchor_zoomed");
        c09dl.LJJJJJ(liveCoHostLayoutIdConfig2.otherAnchorZoomed);
        c09dl.LJIILLIIL("self_anchor_zoomed");
        c09dl.LJJJJJ(liveCoHostLayoutIdConfig2.selfAnchorZoomed);
        c09dl.LJIILLIIL("other_anchor_zoomed_v2");
        c09dl.LJJJJJ(liveCoHostLayoutIdConfig2.otherAnchorZoomed_v2);
        c09dl.LJIILLIIL("self_anchor_zoomed_v2");
        c09dl.LJJJJJ(liveCoHostLayoutIdConfig2.selfAnchorZoomed_v2);
        c09dl.LJIILLIIL("cohost_with_guests");
        c09dl.LJJJJJ(liveCoHostLayoutIdConfig2.cohostWithGuest);
        c09dl.LJIILLIIL("screen_share_config");
        this.LIZ.LJIIJ(LiveCoHostScreenShareLayoutIdConfig.class).write(c09dl, liveCoHostLayoutIdConfig2.screenShareConfig);
        c09dl.LJII();
    }
}
