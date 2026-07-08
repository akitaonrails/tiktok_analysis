package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class RoomWindow_OptTypeAdapter extends TypeAdapter<RoomWindow> {
    @Override // com.google.gson.TypeAdapter
    public final RoomWindow read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RoomWindow roomWindow = new RoomWindow(3600L, 100L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "times")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    roomWindow.allUsersTimeWindow = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "count")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    roomWindow.totalMaxTimes = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return roomWindow;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RoomWindow roomWindow) throws IOException {
        RoomWindow roomWindow2 = roomWindow;
        if (roomWindow2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("times");
        c09dl.LJJIZ(roomWindow2.allUsersTimeWindow);
        c09dl.LJIILLIIL("count");
        c09dl.LJJIZ(roomWindow2.totalMaxTimes);
        c09dl.LJII();
    }
}
