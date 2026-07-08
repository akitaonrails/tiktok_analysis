package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class InviteFriendFreCtrlConfig_OptTypeAdapter extends TypeAdapter<InviteFriendFreCtrlConfig> {
    public final Gson LIZ;

    public InviteFriendFreCtrlConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final InviteFriendFreCtrlConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        InviteFriendFreCtrlConfig inviteFriendFreCtrlConfig = new InviteFriendFreCtrlConfig(new RoomWindow(3600L, 100L), 180L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "room_window")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    inviteFriendFreCtrlConfig.roomWindow = (RoomWindow) this.LIZ.LJIIJ(RoomWindow.class).read(c09cu);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "friend_window")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    inviteFriendFreCtrlConfig.singleUserTimeWindow = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return inviteFriendFreCtrlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, InviteFriendFreCtrlConfig inviteFriendFreCtrlConfig) throws IOException {
        InviteFriendFreCtrlConfig inviteFriendFreCtrlConfig2 = inviteFriendFreCtrlConfig;
        if (inviteFriendFreCtrlConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("room_window");
        this.LIZ.LJIIJ(RoomWindow.class).write(c09dl, inviteFriendFreCtrlConfig2.roomWindow);
        c09dl.LJIILLIIL("friend_window");
        c09dl.LJJIZ(inviteFriendFreCtrlConfig2.singleUserTimeWindow);
        c09dl.LJII();
    }
}
