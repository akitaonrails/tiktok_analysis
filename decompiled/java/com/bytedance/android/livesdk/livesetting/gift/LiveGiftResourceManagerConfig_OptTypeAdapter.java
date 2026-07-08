package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftResourceManagerConfig_OptTypeAdapter extends TypeAdapter<LiveGiftResourceManagerConfig> {
    public final Gson LIZ;

    public LiveGiftResourceManagerConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveGiftResourceManagerConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGiftResourceManagerConfig liveGiftResourceManagerConfig = new LiveGiftResourceManagerConfig(0, 259200, true, 51200L, 102400L, 51200L, 102400L, true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1913256876:
                        if (strLJJJJ.equals("enable_delete_unused_resources")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftResourceManagerConfig.enableDeleteUnusedResource = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1900775544:
                        if (strLJJJJ.equals("thread_crash_fix")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftResourceManagerConfig.threadCrashFix = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1694492860:
                        if (strLJJJJ.equals("resource_disk_control_line_tier2_batch_asset")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftResourceManagerConfig.diskYellowLineForBatchAsset = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1401089853:
                        if (strLJJJJ.equals("resource_disk_control_line_tier1_batch_asset")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftResourceManagerConfig.diskRedLineForBatchAsset = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1382073737:
                        if (strLJJJJ.equals("resource_disk_limitation_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftResourceManagerConfig.resourceDiskLimitationEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -327574278:
                        if (strLJJJJ.equals("resource_preload_strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftResourceManagerConfig.resourcePreloadStrategy = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 864660311:
                        if (strLJJJJ.equals("resource_disk_control_line_tier1")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftResourceManagerConfig.diskRedLine = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 864660312:
                        if (strLJJJJ.equals("resource_disk_control_line_tier2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftResourceManagerConfig.diskYellowLine = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1950421635:
                        if (strLJJJJ.equals("resource_expire_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftResourceManagerConfig.resourceExpireDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2127397551:
                        if (strLJJJJ.equals("enable_delete_all_resources")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftResourceManagerConfig.enableDeleteAllResource = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveGiftResourceManagerConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftResourceManagerConfig liveGiftResourceManagerConfig) throws IOException {
        LiveGiftResourceManagerConfig liveGiftResourceManagerConfig2 = liveGiftResourceManagerConfig;
        if (liveGiftResourceManagerConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("resource_preload_strategy");
        c09dl.LJJJJ(Integer.valueOf(liveGiftResourceManagerConfig2.resourcePreloadStrategy));
        c09dl.LJIILLIIL("resource_expire_duration");
        c09dl.LJJJJ(Integer.valueOf(liveGiftResourceManagerConfig2.resourceExpireDuration));
        c09dl.LJIILLIIL("resource_disk_limitation_enable");
        c09dl.LJJJJJL(liveGiftResourceManagerConfig2.resourceDiskLimitationEnable);
        c09dl.LJIILLIIL("resource_disk_control_line_tier1");
        c09dl.LJJIZ(liveGiftResourceManagerConfig2.diskRedLine);
        c09dl.LJIILLIIL("resource_disk_control_line_tier2");
        c09dl.LJJIZ(liveGiftResourceManagerConfig2.diskYellowLine);
        c09dl.LJIILLIIL("resource_disk_control_line_tier1_batch_asset");
        c09dl.LJJIZ(liveGiftResourceManagerConfig2.diskRedLineForBatchAsset);
        c09dl.LJIILLIIL("resource_disk_control_line_tier2_batch_asset");
        c09dl.LJJIZ(liveGiftResourceManagerConfig2.diskYellowLineForBatchAsset);
        c09dl.LJIILLIIL("enable_delete_unused_resources");
        c09dl.LJJJJJL(liveGiftResourceManagerConfig2.enableDeleteUnusedResource);
        c09dl.LJIILLIIL("enable_delete_all_resources");
        c09dl.LJJJJJL(liveGiftResourceManagerConfig2.enableDeleteAllResource);
        c09dl.LJIILLIIL("thread_crash_fix");
        c09dl.LJJJJJL(liveGiftResourceManagerConfig2.threadCrashFix);
        c09dl.LJII();
    }
}
