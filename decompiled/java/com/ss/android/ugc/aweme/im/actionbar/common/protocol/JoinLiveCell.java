package com.ss.android.ugc.aweme.im.actionbar.common.protocol;

import X.C1331660kl2;
import X.C1331670kl3;
import X.C786410Ut5;
import X.C908810Zl1;
import X.C908850Zl5;
import X.InterfaceC1334290kpH;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell;
import com.zhiliaoapp.musically.R;
import java.util.Collections;

/* JADX INFO: loaded from: classes15.dex */
public final class JoinLiveCell extends ActionBarCell<C908810Zl1> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cnb;
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C908810Zl1 c908810Zl1) {
        super.onBindItemView(c908810Zl1);
        C908850Zl5 c908850Zl5 = c908810Zl1.LLILLL;
        TextView textView = (TextView) this.itemView.findViewById(R.id.a1z);
        if (textView != null) {
            textView.setText(c908850Zl5.LIZ);
            c908850Zl5.LIZIZ.invoke((TuxTextView) textView);
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(new ImageUrlModel("", Collections.singletonList(c908810Zl1.LLILZ)));
        c1331670kl3LJIIIIZZ.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.a1j));
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.itemView.findViewById(R.id.a1k), "alpha", 1.0f, 0.3f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(5);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }
}
