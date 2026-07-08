package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class CommentComboTrayConfig_OptTypeAdapter extends TypeAdapter<CommentComboTrayConfig> {
    @Override // com.google.gson.TypeAdapter
    public final CommentComboTrayConfig read(C09CU c09cu) {
        CommentComboTrayConfig commentComboTrayConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            commentComboTrayConfig = new CommentComboTrayConfig(2000L);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "comment_tray_dismiss_duration")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        commentComboTrayConfig.commentComboTrayDuration = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return commentComboTrayConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CommentComboTrayConfig commentComboTrayConfig) throws IOException {
        CommentComboTrayConfig commentComboTrayConfig2 = commentComboTrayConfig;
        if (commentComboTrayConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("comment_tray_dismiss_duration");
        c09dl.LJJIZ(commentComboTrayConfig2.commentComboTrayDuration);
        c09dl.LJII();
    }
}
