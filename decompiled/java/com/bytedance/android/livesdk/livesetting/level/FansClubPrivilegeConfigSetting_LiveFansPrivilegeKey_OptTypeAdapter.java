package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.level.FansClubPrivilegeConfigSetting;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubPrivilegeConfigSetting_LiveFansPrivilegeKey_OptTypeAdapter extends TypeAdapter<FansClubPrivilegeConfigSetting.LiveFansPrivilegeKey> {
    @Override // com.google.gson.TypeAdapter
    public final FansClubPrivilegeConfigSetting.LiveFansPrivilegeKey read(C09CU c09cu) {
        FansClubPrivilegeConfigSetting.LiveFansPrivilegeKey liveFansPrivilegeKey = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveFansPrivilegeKey = new FansClubPrivilegeConfigSetting.LiveFansPrivilegeKey("", "");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "pattern")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveFansPrivilegeKey.pattern = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "starling_key")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveFansPrivilegeKey.key = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveFansPrivilegeKey;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubPrivilegeConfigSetting.LiveFansPrivilegeKey liveFansPrivilegeKey) {
        FansClubPrivilegeConfigSetting.LiveFansPrivilegeKey liveFansPrivilegeKey2 = liveFansPrivilegeKey;
        if (liveFansPrivilegeKey2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("pattern");
        c09dl.LJJJJJ(liveFansPrivilegeKey2.pattern);
        c09dl.LJIILLIIL("starling_key");
        c09dl.LJJJJJ(liveFansPrivilegeKey2.key);
        c09dl.LJII();
    }
}
