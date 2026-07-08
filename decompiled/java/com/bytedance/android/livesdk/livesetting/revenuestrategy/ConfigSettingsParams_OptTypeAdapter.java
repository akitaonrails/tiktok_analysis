package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class ConfigSettingsParams_OptTypeAdapter extends TypeAdapter<ConfigSettingsParams> {
    public final Gson LIZ;

    public ConfigSettingsParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ConfigSettingsParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ConfigSettingsParams configSettingsParams = new ConfigSettingsParams(3600L, 3, 5, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2146711571:
                        if (strLJJJJ.equals("refresh_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configSettingsParams.refreshDelayTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1119967263:
                        if (strLJJJJ.equals("enable_force_request_when_daily_gift_expired")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configSettingsParams.enableForceReq = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -436485067:
                        if (strLJJJJ.equals("task_info_request_fail_retry_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configSettingsParams.requestRetryTimes = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 782888003:
                        if (strLJJJJ.equals("seconds_to_start_request_next_day_task")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configSettingsParams.timeCanRequestNextDay = c09cu.LJJJ();
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
        return configSettingsParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ConfigSettingsParams configSettingsParams) throws IOException {
        ConfigSettingsParams configSettingsParams2 = configSettingsParams;
        if (configSettingsParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("seconds_to_start_request_next_day_task");
        c09dl.LJJIZ(configSettingsParams2.timeCanRequestNextDay);
        c09dl.LJIILLIIL("task_info_request_fail_retry_times");
        c09dl.LJJJJ(Integer.valueOf(configSettingsParams2.requestRetryTimes));
        c09dl.LJIILLIIL("refresh_delay_time");
        c09dl.LJJJJ(Integer.valueOf(configSettingsParams2.refreshDelayTime));
        c09dl.LJIILLIIL("enable_force_request_when_daily_gift_expired");
        c09dl.LJJJJJL(configSettingsParams2.enableForceReq);
        c09dl.LJII();
    }
}
