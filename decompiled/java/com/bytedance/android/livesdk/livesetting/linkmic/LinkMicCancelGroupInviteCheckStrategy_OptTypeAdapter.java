package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LinkMicCancelGroupInviteCheckStrategy_OptTypeAdapter extends TypeAdapter<LinkMicCancelGroupInviteCheckStrategy> {
    public final Gson LIZ;

    public LinkMicCancelGroupInviteCheckStrategy_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicCancelGroupInviteCheckStrategy read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicCancelGroupInviteCheckStrategy linkMicCancelGroupInviteCheckStrategy = new LinkMicCancelGroupInviteCheckStrategy();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable_group_channel_id_check")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    linkMicCancelGroupInviteCheckStrategy.enableGroupChannelIdCheck = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "enable_target_user_state_check")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    linkMicCancelGroupInviteCheckStrategy.enableTargetUserStateCheck = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return linkMicCancelGroupInviteCheckStrategy;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicCancelGroupInviteCheckStrategy linkMicCancelGroupInviteCheckStrategy) throws IOException {
        LinkMicCancelGroupInviteCheckStrategy linkMicCancelGroupInviteCheckStrategy2 = linkMicCancelGroupInviteCheckStrategy;
        if (linkMicCancelGroupInviteCheckStrategy2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_group_channel_id_check");
        c09dl.LJJJJJL(linkMicCancelGroupInviteCheckStrategy2.enableGroupChannelIdCheck);
        c09dl.LJIILLIIL("enable_target_user_state_check");
        c09dl.LJJJJJL(linkMicCancelGroupInviteCheckStrategy2.enableTargetUserStateCheck);
        c09dl.LJII();
    }
}
