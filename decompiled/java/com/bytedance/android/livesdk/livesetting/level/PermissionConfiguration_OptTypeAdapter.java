package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PermissionConfiguration_OptTypeAdapter extends TypeAdapter<PermissionConfiguration> {
    @Override // com.google.gson.TypeAdapter
    public final PermissionConfiguration read(C09CU c09cu) {
        PermissionConfiguration permissionConfiguration = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            permissionConfiguration = new PermissionConfiguration("");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "permission_property_key")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        permissionConfiguration.permissionPropertyKey = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return permissionConfiguration;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PermissionConfiguration permissionConfiguration) {
        PermissionConfiguration permissionConfiguration2 = permissionConfiguration;
        if (permissionConfiguration2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("permission_property_key");
        c09dl.LJJJJJ(permissionConfiguration2.permissionPropertyKey);
        c09dl.LJII();
    }
}
