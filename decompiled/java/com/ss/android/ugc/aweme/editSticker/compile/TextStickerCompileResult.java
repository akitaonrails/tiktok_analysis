package com.ss.android.ugc.aweme.editSticker.compile;

import X.C384910F7h;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;

/* JADX INFO: loaded from: classes6.dex */
public class TextStickerCompileResult extends C384910F7h {
    public TextStickerData textStickerData;

    public TextStickerCompileResult(TextStickerData textStickerData, C384910F7h c384910F7h) {
        super(c384910F7h);
        this.textStickerData = textStickerData;
    }

    public TextStickerCompileResult(String str, int i, int i2) {
        super(str, i, i2);
    }

    public TextStickerCompileResult(String str, int i, int i2, TextStickerData textStickerData) {
        super(str, i, i2);
        this.textStickerData = textStickerData;
    }
}
