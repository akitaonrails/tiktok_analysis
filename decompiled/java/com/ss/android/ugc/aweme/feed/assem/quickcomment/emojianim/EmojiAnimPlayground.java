package com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim;

import X.C19607011nQ;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class EmojiAnimPlayground extends View {
    public List<? extends C19607011nQ> LL;

    public EmojiAnimPlayground(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        AwS430S0200000_29 awS430S0200000_29 = new AwS430S0200000_29(this, canvas, 19);
        List<? extends C19607011nQ> list = this.LL;
        if (list == null) {
            list = null;
        }
        synchronized (list) {
            try {
                awS430S0200000_29.invoke();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void setEmojiItemList(List<? extends C19607011nQ> list) {
        this.LL = list;
    }

    public EmojiAnimPlayground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
