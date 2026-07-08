package com.bytedance.android.livesdk.chatroom.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePublicScreenMsgPriorityConfig_OptTypeAdapter extends TypeAdapter<LivePublicScreenMsgPriorityConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LivePublicScreenMsgPriorityConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePublicScreenMsgPriorityConfig livePublicScreenMsgPriorityConfig = new LivePublicScreenMsgPriorityConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "priority_for_anchor")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    livePublicScreenMsgPriorityConfig.priorityForAnchor = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "priority_for_audience")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    livePublicScreenMsgPriorityConfig.priorityForAudience = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return livePublicScreenMsgPriorityConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePublicScreenMsgPriorityConfig livePublicScreenMsgPriorityConfig) throws IOException {
        LivePublicScreenMsgPriorityConfig livePublicScreenMsgPriorityConfig2 = livePublicScreenMsgPriorityConfig;
        if (livePublicScreenMsgPriorityConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("priority_for_anchor");
        c09dl.LJJIZ(livePublicScreenMsgPriorityConfig2.priorityForAnchor);
        c09dl.LJIILLIIL("priority_for_audience");
        c09dl.LJJIZ(livePublicScreenMsgPriorityConfig2.priorityForAudience);
        c09dl.LJII();
    }
}
