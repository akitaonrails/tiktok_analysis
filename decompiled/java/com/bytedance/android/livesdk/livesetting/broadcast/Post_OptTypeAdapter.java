package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class Post_OptTypeAdapter extends TypeAdapter<Post> {
    @Override // com.google.gson.TypeAdapter
    public final Post read(C09CU c09cu) {
        Post post = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            post = new Post(0, 0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "max_count")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        post.setMaxCount(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "interval")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        post.setInterval(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return post;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Post post) {
        Post post2 = post;
        if (post2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("max_count");
        c09dl.LJJJJ(Integer.valueOf(post2.getMaxCount()));
        c09dl.LJIILLIIL("interval");
        c09dl.LJJJJ(Integer.valueOf(post2.getInterval()));
        c09dl.LJII();
    }
}
