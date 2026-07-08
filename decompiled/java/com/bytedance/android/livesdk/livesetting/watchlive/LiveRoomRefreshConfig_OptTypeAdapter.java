package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRoomRefreshConfig_OptTypeAdapter extends TypeAdapter<LiveRoomRefreshConfig> {
    public final Gson LIZ;

    public LiveRoomRefreshConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveRoomRefreshConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRoomRefreshConfig liveRoomRefreshConfig = new LiveRoomRefreshConfig(40, 20, false, 1, true, false, true, false, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1532887371:
                        if (strLJJJJ.equals("start_index")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRoomRefreshConfig.startIndex = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRoomRefreshConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -631653888:
                        if (strLJJJJ.equals("enable_nr")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRoomRefreshConfig.enableNR = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -571685428:
                        if (strLJJJJ.equals("enable_reg_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRoomRefreshConfig.enableRegisterOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 214958412:
                        if (strLJJJJ.equals("check_distance")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRoomRefreshConfig.distance = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 564495556:
                        if (strLJJJJ.equals("enable_poll_check")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRoomRefreshConfig.enablePoll = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1034312690:
                        if (strLJJJJ.equals("enable_enhance")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRoomRefreshConfig.enableEnhance = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1750959689:
                        if (strLJJJJ.equals("enable_mark_del_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRoomRefreshConfig.enableNoStreamMark = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1942471790:
                        if (strLJJJJ.equals("end_index")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRoomRefreshConfig.endIndex = c09cu.LJJIZ();
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
        return liveRoomRefreshConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRoomRefreshConfig liveRoomRefreshConfig) throws IOException {
        LiveRoomRefreshConfig liveRoomRefreshConfig2 = liveRoomRefreshConfig;
        if (liveRoomRefreshConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("start_index");
        c09dl.LJJJJ(Integer.valueOf(liveRoomRefreshConfig2.startIndex));
        c09dl.LJIILLIIL("end_index");
        c09dl.LJJJJ(Integer.valueOf(liveRoomRefreshConfig2.endIndex));
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveRoomRefreshConfig2.enable);
        c09dl.LJIILLIIL("check_distance");
        c09dl.LJJJJ(Integer.valueOf(liveRoomRefreshConfig2.distance));
        c09dl.LJIILLIIL("enable_poll_check");
        c09dl.LJJJJJL(liveRoomRefreshConfig2.enablePoll);
        c09dl.LJIILLIIL("enable_nr");
        c09dl.LJJJJJL(liveRoomRefreshConfig2.enableNR);
        c09dl.LJIILLIIL("enable_mark_del_opt");
        c09dl.LJJJJJL(liveRoomRefreshConfig2.enableNoStreamMark);
        c09dl.LJIILLIIL("enable_reg_opt");
        c09dl.LJJJJJL(liveRoomRefreshConfig2.enableRegisterOpt);
        c09dl.LJIILLIIL("enable_enhance");
        c09dl.LJJJJJL(liveRoomRefreshConfig2.enableEnhance);
        c09dl.LJII();
    }
}
