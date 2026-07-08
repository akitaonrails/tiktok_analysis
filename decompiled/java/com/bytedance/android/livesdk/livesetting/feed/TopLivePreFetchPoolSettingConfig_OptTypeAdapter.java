package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class TopLivePreFetchPoolSettingConfig_OptTypeAdapter extends TypeAdapter<TopLivePreFetchPoolSettingConfig> {
    public final Gson LIZ;

    public TopLivePreFetchPoolSettingConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TopLivePreFetchPoolSettingConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TopLivePreFetchPoolSettingConfig topLivePreFetchPoolSettingConfig = new TopLivePreFetchPoolSettingConfig(false, 1800000L, 0L, true, 0L, true, "tiktok_message_toplive_preload_rec", 0L, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1628346624:
                        if (strLJJJJ.equals("enable_check_room_state")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreFetchPoolSettingConfig.setEnableCheckRoomState(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1609594047:
                        if (strLJJJJ.equals("enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreFetchPoolSettingConfig.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1131474637:
                        if (strLJJJJ.equals("enable_prefetch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreFetchPoolSettingConfig.setEnablePrefetch(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1026714026:
                        if (strLJJJJ.equals("prefetch_req")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreFetchPoolSettingConfig.setReqFrom(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -492614476:
                        if (strLJJJJ.equals("waiting_api_time_android")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreFetchPoolSettingConfig.setWaitingTime(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -130914004:
                        if (strLJJJJ.equals("refresh_delay_time_on_exit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreFetchPoolSettingConfig.setRefreshDelayTime(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -103820098:
                        if (strLJJJJ.equals("refresh_on_cache_invalid")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreFetchPoolSettingConfig.setRefreshOnCacheInvalid(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 29080938:
                        if (strLJJJJ.equals("cache_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreFetchPoolSettingConfig.setCacheTime(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1210160072:
                        if (strLJJJJ.equals("request_delay_time_on_start")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                topLivePreFetchPoolSettingConfig.setRequestDelayTime(c09cu.LJJJ());
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
        return topLivePreFetchPoolSettingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TopLivePreFetchPoolSettingConfig topLivePreFetchPoolSettingConfig) throws IOException {
        TopLivePreFetchPoolSettingConfig topLivePreFetchPoolSettingConfig2 = topLivePreFetchPoolSettingConfig;
        if (topLivePreFetchPoolSettingConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(topLivePreFetchPoolSettingConfig2.getEnabled());
        c09dl.LJIILLIIL("cache_time");
        c09dl.LJJIZ(topLivePreFetchPoolSettingConfig2.getCacheTime());
        c09dl.LJIILLIIL("waiting_api_time_android");
        c09dl.LJJIZ(topLivePreFetchPoolSettingConfig2.getWaitingTime());
        c09dl.LJIILLIIL("refresh_on_cache_invalid");
        c09dl.LJJJJJL(topLivePreFetchPoolSettingConfig2.getRefreshOnCacheInvalid());
        c09dl.LJIILLIIL("refresh_delay_time_on_exit");
        c09dl.LJJIZ(topLivePreFetchPoolSettingConfig2.getRefreshDelayTime());
        c09dl.LJIILLIIL("enable_prefetch");
        c09dl.LJJJJJL(topLivePreFetchPoolSettingConfig2.getEnablePrefetch());
        c09dl.LJIILLIIL("prefetch_req");
        c09dl.LJJJJJ(topLivePreFetchPoolSettingConfig2.getReqFrom());
        c09dl.LJIILLIIL("request_delay_time_on_start");
        c09dl.LJJIZ(topLivePreFetchPoolSettingConfig2.getRequestDelayTime());
        c09dl.LJIILLIIL("enable_check_room_state");
        c09dl.LJJJJJL(topLivePreFetchPoolSettingConfig2.getEnableCheckRoomState());
        c09dl.LJII();
    }
}
