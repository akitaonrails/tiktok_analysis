package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.scene.Scene;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionStickerSetMessage;

/* JADX INFO: loaded from: classes15.dex */
public final class LightInteractionStickerSetMessageTypeAdapter extends TypeAdapter<LightInteractionStickerSetMessage> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LightInteractionStickerSetMessage read(C09CU c09cu) {
        c09cu.LIZIZ();
        String strLJJJZ = null;
        String strLJJJZ2 = null;
        String strLJJJZ3 = null;
        Integer numValueOf = null;
        String strLJJJZ4 = null;
        String strLJJJZ5 = null;
        String strLJJJZ6 = null;
        String strLJJJZ7 = null;
        String strLJJJZ8 = null;
        String strLJJJZ9 = null;
        String strLJJJZ10 = null;
        Integer numValueOf2 = null;
        Integer numValueOf3 = null;
        String strLJJJZ11 = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2030994180:
                        if (strLJJJJ.equals("sticker_type")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                numValueOf = Integer.valueOf(c09cu.LJJIZ());
                            }
                        }
                        break;
                    case -1920010860:
                        if (strLJJJJ.equals("creator_nick_name")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ9 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -1917237414:
                        if (strLJJJJ.equals("sticker_set_id")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ2 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -1221029593:
                        if (strLJJJJ.equals("height")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                numValueOf3 = Integer.valueOf(c09cu.LJJIZ());
                            }
                        }
                        break;
                    case -1195408547:
                        if (strLJJJJ.equals("sticker_id")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -897584040:
                        if (strLJJJJ.equals("origin_video_id")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ3 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -109978594:
                        if (strLJJJJ.equals("static_url")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ7 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 92525830:
                        if (strLJJJJ.equals("a_src")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ11 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 109254796:
                        if (strLJJJJ.equals(Scene.SCENE_SERVICE)) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ8 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 113126854:
                        if (strLJJJJ.equals("width")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                numValueOf2 = Integer.valueOf(c09cu.LJJIZ());
                            }
                        }
                        break;
                    case 1180444924:
                        if (strLJJJJ.equals("creator_user_id")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ4 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 1597052778:
                        if (strLJJJJ.equals("sticker_uri")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ6 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 1597052781:
                        if (strLJJJJ.equals("sticker_url")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ5 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 1763197091:
                        if (strLJJJJ.equals("creator_avatar_thumb")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ10 = c09cu.LJJJZ();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return new LightInteractionStickerSetMessage(strLJJJZ, strLJJJZ2, strLJJJZ3, numValueOf, strLJJJZ4, strLJJJZ5, strLJJJZ6, strLJJJZ7, strLJJJZ8, strLJJJZ9, strLJJJZ10, numValueOf2, numValueOf3, strLJJJZ11);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LightInteractionStickerSetMessage lightInteractionStickerSetMessage) {
        LightInteractionStickerSetMessage lightInteractionStickerSetMessage2 = lightInteractionStickerSetMessage;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("sticker_id");
        c09dl.LJJJJJ(lightInteractionStickerSetMessage2.stickerId);
        c09dl.LJIILLIIL("sticker_set_id");
        c09dl.LJJJJJ(lightInteractionStickerSetMessage2.stickerSetId);
        c09dl.LJIILLIIL("origin_video_id");
        c09dl.LJJJJJ(lightInteractionStickerSetMessage2.originVideoId);
        c09dl.LJIILLIIL("sticker_type");
        c09dl.LJJJJ(lightInteractionStickerSetMessage2.stickerType);
        c09dl.LJIILLIIL("creator_user_id");
        c09dl.LJJJJJ(lightInteractionStickerSetMessage2.creatorUserId);
        c09dl.LJIILLIIL("sticker_url");
        c09dl.LJJJJJ(lightInteractionStickerSetMessage2.stickerUrl);
        c09dl.LJIILLIIL("sticker_uri");
        c09dl.LJJJJJ(lightInteractionStickerSetMessage2.stickerUri);
        c09dl.LJIILLIIL("static_url");
        c09dl.LJJJJJ(lightInteractionStickerSetMessage2.staticUrl);
        c09dl.LJIILLIIL(Scene.SCENE_SERVICE);
        c09dl.LJJJJJ(lightInteractionStickerSetMessage2.scene);
        c09dl.LJIILLIIL("creator_nick_name");
        c09dl.LJJJJJ(lightInteractionStickerSetMessage2.creatorNickName);
        c09dl.LJIILLIIL("creator_avatar_thumb");
        c09dl.LJJJJJ(lightInteractionStickerSetMessage2.creatorAvatarThumb);
        c09dl.LJIILLIIL("width");
        c09dl.LJJJJ(lightInteractionStickerSetMessage2.width);
        c09dl.LJIILLIIL("height");
        c09dl.LJJJJ(lightInteractionStickerSetMessage2.height);
        c09dl.LJIILLIIL("a_src");
        c09dl.LJJJJJ(lightInteractionStickerSetMessage2.aSrc);
        c09dl.LJII();
    }
}
