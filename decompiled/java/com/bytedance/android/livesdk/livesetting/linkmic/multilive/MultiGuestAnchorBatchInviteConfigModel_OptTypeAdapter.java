package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestAnchorBatchInviteConfigModel_OptTypeAdapter extends TypeAdapter<MultiGuestAnchorBatchInviteConfigModel> {
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestAnchorBatchInviteConfigModel read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestAnchorBatchInviteConfigModel multiGuestAnchorBatchInviteConfigModel = new MultiGuestAnchorBatchInviteConfigModel(8000L, 30L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "batch_invite_sheet_auto_dismiss_ms")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    multiGuestAnchorBatchInviteConfigModel.batchInviteSheetAutoDismissMs = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "quick_connect_invite_bubble_delay_sec")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    multiGuestAnchorBatchInviteConfigModel.quickConnectInviteBubbleDelaySec = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return multiGuestAnchorBatchInviteConfigModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestAnchorBatchInviteConfigModel multiGuestAnchorBatchInviteConfigModel) throws IOException {
        MultiGuestAnchorBatchInviteConfigModel multiGuestAnchorBatchInviteConfigModel2 = multiGuestAnchorBatchInviteConfigModel;
        if (multiGuestAnchorBatchInviteConfigModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("batch_invite_sheet_auto_dismiss_ms");
        c09dl.LJJIZ(multiGuestAnchorBatchInviteConfigModel2.batchInviteSheetAutoDismissMs);
        c09dl.LJIILLIIL("quick_connect_invite_bubble_delay_sec");
        c09dl.LJJIZ(multiGuestAnchorBatchInviteConfigModel2.quickConnectInviteBubbleDelaySec);
        c09dl.LJII();
    }
}
