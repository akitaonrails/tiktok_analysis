package com.bytedance.android.livesdk.model.message.common;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class TextPiece {

    @C09CT("format")
    public TextFormat format;

    @C09CT("gift_value")
    public TextPieceGift giftValue;

    @C09CT("heart_value")
    public TextPieceHeart heartValue;

    @C09CT("image_value")
    public TextPieceImage imageValue;

    @C09CT("pattern_ref_value")
    public TextPiecePatternRef patternRefValue;

    @C09CT("string_value")
    public String stringValue = "";

    @C09CT("type")
    public int type;

    @C09CT("user_value")
    public TextPieceUser userValue;
}
