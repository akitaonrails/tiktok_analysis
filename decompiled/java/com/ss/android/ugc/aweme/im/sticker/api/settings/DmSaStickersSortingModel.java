package com.ss.android.ugc.aweme.im.sticker.api.settings;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class DmSaStickersSortingModel {

    @C09CT("reaction_expression_list")
    public final List<String> reactionExpressionList;

    @C09CT("sticker_expression_list")
    public final List<String> stickerExpressionList;

    public DmSaStickersSortingModel() {
        this(C1697810uHb.LJIIJJI("blowingkiss", "fingerheart", "thumbsup", "handwave", "wave", "giggling", "beingcute", "amused", "lol", "ily", "inlove", "celebration", "goodmorning", "sleepy", "jk", "bashful", "angry", "shocked", "shock", "goodnight", "aww", "terrified", "sad", "bored", "hi", "idk", "wink", "neutral", "confused", "excited", "amazed", "brb", "sup", "newyear", "christmasgift", "merrychristmas"), C1697810uHb.LJIIJJI("amused", "lol", "thumbsup", "fingerheart", "blowingkiss", "sad", "shocked", "shock", "angry", "goodmorning", "bored", "celebration", "beingcute", "ily", "confused", "giggling", "excited", "inlove", "amazed", "terrified", "sleepy", "aww", "bashful", "idk", "wink", "goodnight", "jk", "handwave", "wave", "neutral", "sup", "brb", "hi", "newyear", "christmasgift", "merrychristmas"));
    }

    public DmSaStickersSortingModel(List<String> list, List<String> list2) {
        this.stickerExpressionList = list;
        this.reactionExpressionList = list2;
    }
}
