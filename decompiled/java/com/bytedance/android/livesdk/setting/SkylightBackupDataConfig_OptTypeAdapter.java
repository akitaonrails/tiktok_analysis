package com.bytedance.android.livesdk.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class SkylightBackupDataConfig_OptTypeAdapter extends TypeAdapter<SkylightBackupDataConfig> {
    @Override // com.google.gson.TypeAdapter
    public final SkylightBackupDataConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SkylightBackupDataConfig skylightBackupDataConfig = new SkylightBackupDataConfig(2, 600000L, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -2079494054) {
                    if (iHashCode != -96179731) {
                        if (iHashCode == 408072700 && strLJJJJ.equals("max_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightBackupDataConfig.maxSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("expire_time")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            skylightBackupDataConfig.expireTime = c09cu.LJJJ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("filter_strategy")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        skylightBackupDataConfig.filterStrategy = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return skylightBackupDataConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SkylightBackupDataConfig skylightBackupDataConfig) throws IOException {
        SkylightBackupDataConfig skylightBackupDataConfig2 = skylightBackupDataConfig;
        if (skylightBackupDataConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("max_size");
        c09dl.LJJJJ(Integer.valueOf(skylightBackupDataConfig2.maxSize));
        c09dl.LJIILLIIL("expire_time");
        c09dl.LJJIZ(skylightBackupDataConfig2.expireTime);
        c09dl.LJIILLIIL("filter_strategy");
        c09dl.LJJJJ(Integer.valueOf(skylightBackupDataConfig2.filterStrategy));
        c09dl.LJII();
    }
}
