package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveWatchPreloadSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveWatchPreloadSettings_Item_OptTypeAdapter extends TypeAdapter<LiveWatchPreloadSettings.Item> {
    public final Gson LIZ;

    public LiveWatchPreloadSettings_Item_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveWatchPreloadSettings.Item read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveWatchPreloadSettings.Item item = new LiveWatchPreloadSettings.Item(false, false, false, false, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1945447304:
                        if (strLJJJJ.equals("xml_res")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                item.xmlResDisable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -777416277:
                        if (strLJJJJ.equals("res_get_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                item.resGetOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -366821515:
                        if (strLJJJJ.equals("message_manager")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                item.messageManagerDisable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -255680669:
                        if (strLJJJJ.equals("disable_unused_tea_log")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                item.disableUnusedTeaLog = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 777295233:
                        if (strLJJJJ.equals("call_ahead_prepare_next_step")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                item.callAheadPrepareNextStep = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1880047109:
                        if (strLJJJJ.equals("breakup_play_fragment_create")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                item.breakUpPlayFragmentCreate = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2146038026:
                        if (strLJJJJ.equals("gpu_info_disable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                item.gpuInfoDisable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return item;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveWatchPreloadSettings.Item item) throws IOException {
        LiveWatchPreloadSettings.Item item2 = item;
        if (item2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("xml_res");
        c09dl.LJJJJJL(item2.xmlResDisable);
        c09dl.LJIILLIIL("message_manager");
        c09dl.LJJJJJL(item2.messageManagerDisable);
        c09dl.LJIILLIIL("gpu_info_disable");
        c09dl.LJJJJJL(item2.gpuInfoDisable);
        c09dl.LJIILLIIL("res_get_opt");
        c09dl.LJJJJJL(item2.resGetOpt);
        c09dl.LJIILLIIL("breakup_play_fragment_create");
        c09dl.LJJJJJL(item2.breakUpPlayFragmentCreate);
        c09dl.LJIILLIIL("disable_unused_tea_log");
        c09dl.LJJJJJL(item2.disableUnusedTeaLog);
        c09dl.LJIILLIIL("call_ahead_prepare_next_step");
        c09dl.LJJJJJL(item2.callAheadPrepareNextStep);
        c09dl.LJII();
    }
}
