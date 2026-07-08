package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class SkylightColdStartConfig_OptTypeAdapter extends TypeAdapter<SkylightColdStartConfig> {
    public final Gson LIZ;

    public SkylightColdStartConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final SkylightColdStartConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SkylightColdStartConfig skylightColdStartConfig = new SkylightColdStartConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1158099726:
                        if (strLJJJJ.equals("enable_local_cache")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightColdStartConfig.enableLocalCache = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -949588693:
                        if (strLJJJJ.equals("enable_update_both_way")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightColdStartConfig.enableUpdateBothWay = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -566426081:
                        if (strLJJJJ.equals("extra_polling_fetch_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightColdStartConfig.extraPollingFetchCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -152850009:
                        if (strLJJJJ.equals("inbox_cold_prefetch_expire_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightColdStartConfig.inboxColdPrefetchExpireTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 307718717:
                        if (strLJJJJ.equals("enable_inbox_cold_prefetch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightColdStartConfig.enableInboxColdPrefetch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 355608796:
                        if (strLJJJJ.equals("local_cache_expire_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightColdStartConfig.localCacheExpireTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 436624146:
                        if (strLJJJJ.equals("follow_cold_prefetch_expire_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightColdStartConfig.followColdPrefetchExpireTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 446305368:
                        if (strLJJJJ.equals("interval_global_fetch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightColdStartConfig.intervalGlobalFetchSecond = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 531107700:
                        if (strLJJJJ.equals("global_fetch_strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightColdStartConfig.globalFetchStrategy = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1406565956:
                        if (strLJJJJ.equals("global_fetch_start_advance")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightColdStartConfig.globalFetchStartAdvance = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1503821810:
                        if (strLJJJJ.equals("local_cache_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightColdStartConfig.localCacheSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1564827168:
                        if (strLJJJJ.equals("enable_follow_cold_prefetch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightColdStartConfig.enableFollowColdPrefetch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1854159818:
                        if (strLJJJJ.equals("global_fetch_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightColdStartConfig.globalFetchDelayTime = c09cu.LJJIZ();
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
        return skylightColdStartConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SkylightColdStartConfig skylightColdStartConfig) throws IOException {
        SkylightColdStartConfig skylightColdStartConfig2 = skylightColdStartConfig;
        if (skylightColdStartConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_follow_cold_prefetch");
        c09dl.LJJJJJL(skylightColdStartConfig2.enableFollowColdPrefetch);
        c09dl.LJIILLIIL("follow_cold_prefetch_expire_time");
        c09dl.LJJIZ(skylightColdStartConfig2.followColdPrefetchExpireTime);
        c09dl.LJIILLIIL("enable_inbox_cold_prefetch");
        c09dl.LJJJJJL(skylightColdStartConfig2.enableInboxColdPrefetch);
        c09dl.LJIILLIIL("inbox_cold_prefetch_expire_time");
        c09dl.LJJIZ(skylightColdStartConfig2.inboxColdPrefetchExpireTime);
        c09dl.LJIILLIIL("global_fetch_strategy");
        c09dl.LJJJJ(Integer.valueOf(skylightColdStartConfig2.globalFetchStrategy));
        c09dl.LJIILLIIL("interval_global_fetch");
        c09dl.LJJIZ(skylightColdStartConfig2.intervalGlobalFetchSecond);
        c09dl.LJIILLIIL("global_fetch_start_advance");
        c09dl.LJJJJJL(skylightColdStartConfig2.globalFetchStartAdvance);
        c09dl.LJIILLIIL("global_fetch_delay_time");
        c09dl.LJJJJ(Integer.valueOf(skylightColdStartConfig2.globalFetchDelayTime));
        c09dl.LJIILLIIL("extra_polling_fetch_count");
        c09dl.LJJJJ(Integer.valueOf(skylightColdStartConfig2.extraPollingFetchCount));
        c09dl.LJIILLIIL("enable_local_cache");
        c09dl.LJJJJJL(skylightColdStartConfig2.enableLocalCache);
        c09dl.LJIILLIIL("local_cache_expire_time");
        c09dl.LJJIZ(skylightColdStartConfig2.localCacheExpireTime);
        c09dl.LJIILLIIL("local_cache_size");
        c09dl.LJJJJ(Integer.valueOf(skylightColdStartConfig2.localCacheSize));
        c09dl.LJIILLIIL("enable_update_both_way");
        c09dl.LJJJJJL(skylightColdStartConfig2.enableUpdateBothWay);
        c09dl.LJII();
    }
}
