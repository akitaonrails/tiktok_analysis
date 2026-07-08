package com.ss.android.ugc.aweme.comment.commentlist.util;

import X.C444890HcV;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentHelperKt$getTranslatedDisplayText$2 extends ForegroundColorSpan {
    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(81);
        textPaint.setTypeface(c444890HcV.getTypeface());
        textPaint.setUnderlineText(false);
    }
}
