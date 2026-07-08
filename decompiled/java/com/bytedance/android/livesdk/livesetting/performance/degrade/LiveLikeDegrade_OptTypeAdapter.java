package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveLikeDegrade_OptTypeAdapter extends TypeAdapter<LiveLikeDegrade> {
    public final Gson LIZ;

    public LiveLikeDegrade_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveLikeDegrade read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveLikeDegrade liveLikeDegrade = new LiveLikeDegrade();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1265848843:
                        if (strLJJJJ.equals("enable_lottie_anim")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveLikeDegrade.enableLottieAnim = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1113284370:
                        if (strLJJJJ.equals("enable_self_like")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveLikeDegrade.enableSelflike = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -191171065:
                        if (strLJJJJ.equals("enable_easter_eggs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveLikeDegrade.enableEasterEggs = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 555189154:
                        if (strLJJJJ.equals("enable_other_like")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveLikeDegrade.enableOtherlike = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1789132923:
                        if (strLJJJJ.equals("enable_avatar_anim")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveLikeDegrade.enableAvatarAnim = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveLikeDegrade;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveLikeDegrade liveLikeDegrade) throws IOException {
        LiveLikeDegrade liveLikeDegrade2 = liveLikeDegrade;
        if (liveLikeDegrade2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_self_like");
        c09dl.LJJJJJL(liveLikeDegrade2.enableSelflike);
        c09dl.LJIILLIIL("enable_other_like");
        c09dl.LJJJJJL(liveLikeDegrade2.enableOtherlike);
        c09dl.LJIILLIIL("enable_lottie_anim");
        c09dl.LJJJJJL(liveLikeDegrade2.enableLottieAnim);
        c09dl.LJIILLIIL("enable_avatar_anim");
        c09dl.LJJJJJL(liveLikeDegrade2.enableAvatarAnim);
        c09dl.LJIILLIIL("enable_easter_eggs");
        c09dl.LJJJJJL(liveLikeDegrade2.enableEasterEggs);
        c09dl.LJII();
    }
}
