package com.bytedance.android.livesdk.chatroom.model.backroom;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class BackRoomListSettingConfig_OptTypeAdapter extends TypeAdapter<BackRoomListSettingConfig> {
    public final Gson LIZ;

    public BackRoomListSettingConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final BackRoomListSettingConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BackRoomListSettingConfig backRoomListSettingConfig = new BackRoomListSettingConfig(null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1731964363) {
                    if (iHashCode != 1249374180) {
                        if (iHashCode == 1286305040 && strLJJJJ.equals("block_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                backRoomListSettingConfig.blockList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("multi_list")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            backRoomListSettingConfig.multiList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("single_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        backRoomListSettingConfig.singleList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return backRoomListSettingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BackRoomListSettingConfig backRoomListSettingConfig) {
        BackRoomListSettingConfig backRoomListSettingConfig2 = backRoomListSettingConfig;
        if (backRoomListSettingConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("block_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, backRoomListSettingConfig2.blockList, String.class);
        c09dl.LJIILLIIL("multi_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, backRoomListSettingConfig2.multiList, String.class);
        c09dl.LJIILLIIL("single_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, backRoomListSettingConfig2.singleList, String.class);
        c09dl.LJII();
    }
}
