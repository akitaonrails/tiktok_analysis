package com.bytedance.android.livesdk.chatroom.bl.enterroomboost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.chatroom.bl.enterroomboost.LiveEnterRoomUpdateSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveEnterRoomUpdateSetting_LiveEnterRoomUpdateConfig_OptTypeAdapter extends TypeAdapter<LiveEnterRoomUpdateSetting.LiveEnterRoomUpdateConfig> {
    public final Gson LIZ;

    public LiveEnterRoomUpdateSetting_LiveEnterRoomUpdateConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveEnterRoomUpdateSetting.LiveEnterRoomUpdateConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveEnterRoomUpdateSetting.LiveEnterRoomUpdateConfig liveEnterRoomUpdateConfig = new LiveEnterRoomUpdateSetting.LiveEnterRoomUpdateConfig(false, false, false, 0, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1168585206:
                        if (strLJJJJ.equals("enable_enter_room_update")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEnterRoomUpdateConfig.setEnableEnterRoomUpdate(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1026619622:
                        if (strLJJJJ.equals("cache_update_method")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEnterRoomUpdateConfig.setCacheUpdateMethod(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 21083753:
                        if (strLJJJJ.equals("sync_fetch_cache_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEnterRoomUpdateConfig.setSyncFetchCacheEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 302486934:
                        if (strLJJJJ.equals("enable_for_preview")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEnterRoomUpdateConfig.setEnableForPreview(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1411794153:
                        if (strLJJJJ.equals("enable_for_inner_flow")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEnterRoomUpdateConfig.setEnableForInnerFlow(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
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
        return liveEnterRoomUpdateConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveEnterRoomUpdateSetting.LiveEnterRoomUpdateConfig liveEnterRoomUpdateConfig) throws IOException {
        LiveEnterRoomUpdateSetting.LiveEnterRoomUpdateConfig liveEnterRoomUpdateConfig2 = liveEnterRoomUpdateConfig;
        if (liveEnterRoomUpdateConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_enter_room_update");
        c09dl.LJJJJJL(liveEnterRoomUpdateConfig2.getEnableEnterRoomUpdate());
        c09dl.LJIILLIIL("enable_for_preview");
        c09dl.LJJJJJL(liveEnterRoomUpdateConfig2.getEnableForPreview());
        c09dl.LJIILLIIL("enable_for_inner_flow");
        c09dl.LJJJJJL(liveEnterRoomUpdateConfig2.getEnableForInnerFlow());
        c09dl.LJIILLIIL("cache_update_method");
        c09dl.LJJJJ(Integer.valueOf(liveEnterRoomUpdateConfig2.getCacheUpdateMethod()));
        c09dl.LJIILLIIL("sync_fetch_cache_enable");
        c09dl.LJJJJJL(liveEnterRoomUpdateConfig2.getSyncFetchCacheEnable());
        c09dl.LJII();
    }
}
