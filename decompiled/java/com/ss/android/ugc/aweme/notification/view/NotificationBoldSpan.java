package com.ss.android.ugc.aweme.notification.view;

import X.C444890HcV;
import X.C844470XAv;
import X.C960203pA;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public class NotificationBoldSpan extends ForegroundColorSpan {
    /* JADX WARN: Illegal instructions before constructor call */
    public NotificationBoldSpan() {
        Context contextLIZ;
        if (ActivityStack.getTopActivity() != null) {
            contextLIZ = ActivityStack.getTopActivity();
        } else {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        super(C960203pA.LIZ(R.attr.a1h, contextLIZ));
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        textPaint.setTypeface(c444890HcV.getTypeface());
    }
}
