package com.ss.android.ugc.aweme.feed.widget;

import X.C086I;
import X.C1213510hgT;
import X.C12ES;
import X.C1388190mED;
import X.C1602160rnK;
import X.C20673215v0;
import X.C786410Ut5;
import X.EnumC1216750hlh;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public class LineProgressBar extends FrameLayout {
    public View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public ValueAnimator LLILZ;
    public ObjectAnimator LLILZIL;
    public ObjectAnimator LLILZLL;
    public C1213510hgT LLIZ;
    public EnumC1216750hlh LLIZLLLIL;

    public final void LIZLLL() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.LLILZLL = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(300L);
        this.LLILZLL.addListener(new AnimatorListenerAdapter() { // from class: X.0hgR
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ValueAnimator valueAnimator = this.LL.LLILZ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                LineProgressBar lineProgressBar = this.LL;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(lineProgressBar);
                lineProgressBar.setAlpha(1.0f);
                LineProgressBar lineProgressBar2 = this.LL;
                int visibility = lineProgressBar2.getVisibility();
                lineProgressBar2.setVisibility(4);
                C1602160rnK.LIZIZ(visibility, 4, lineProgressBar2);
            }
        });
        C786410Ut5.Pd(this.LLILZLL);
    }

    public final void LIZIZ() {
        ValueAnimator valueAnimator = this.LLILZ;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.LLILZ.cancel();
        }
        ObjectAnimator objectAnimator = this.LLILZIL;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.LLILZIL.cancel();
        }
        ObjectAnimator objectAnimator2 = this.LLILZLL;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            this.LLILZLL.cancel();
        }
    }

    public final void LIZJ() {
        if (getVisibility() != 0) {
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
        }
        if (this.LLILZ == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 200);
            this.LLILZ = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(600L);
            this.LLILZ.setRepeatCount(-1);
            this.LLILZ.addUpdateListener(this.LLIZ);
        }
        if (this.LLILZIL == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILLJJLI, "alpha", 0.0f, 1.0f);
            this.LLILZIL = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(300L);
            if (C086I.LIZIZ(this.LLILZIL.getListeners())) {
                this.LLILZIL.addListener(new AnimatorListenerAdapter() { // from class: X.0hgS
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        if (C086I.LIZIZ(this.LL.LLILZ.getListeners())) {
                            LineProgressBar lineProgressBar = this.LL;
                            lineProgressBar.LLILZ.addUpdateListener(lineProgressBar.LLIZ);
                        }
                        this.LL.LLILZ.start();
                    }
                });
            }
        }
        ObjectAnimator objectAnimator = this.LLILZLL;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.LLILZLL.cancel();
            if (C086I.LIZIZ(this.LLILZIL.getListeners())) {
                this.LLILZIL.addListener(new AnimatorListenerAdapter() { // from class: X.0hgS
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        if (C086I.LIZIZ(this.LL.LLILZ.getListeners())) {
                            LineProgressBar lineProgressBar = this.LL;
                            lineProgressBar.LLILZ.addUpdateListener(lineProgressBar.LLIZ);
                        }
                        this.LL.LLILZ.start();
                    }
                });
            }
            C786410Ut5.Pd(this.LLILZIL);
            return;
        }
        if (this.LLILZIL.isRunning() || this.LLILZ.isRunning()) {
            return;
        }
        if (C086I.LIZIZ(this.LLILZIL.getListeners())) {
            this.LLILZIL.addListener(new AnimatorListenerAdapter() { // from class: X.0hgS
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (C086I.LIZIZ(this.LL.LLILZ.getListeners())) {
                        LineProgressBar lineProgressBar = this.LL;
                        lineProgressBar.LLILZ.addUpdateListener(lineProgressBar.LLIZ);
                    }
                    this.LL.LLILZ.start();
                }
            });
        }
        C786410Ut5.Pd(this.LLILZIL);
    }

    public LineProgressBar(Context context) {
        super(context);
        this.LLIZLLLIL = EnumC1216750hlh.NORMAL;
        LIZ(context);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0hgT] */
    public final void LIZ(Context context) {
        if (context instanceof Activity) {
            this.LLILLL = C20673215v0.LIZLLL(R.layout.i_4, C1388190mED.LIZ(context), this, true);
        } else {
            this.LLILLL = C786410Ut5.Sd(R.layout.i_4, C786410Ut5.ne(context), this);
        }
        this.LL = this.LLILLL.findViewById(R.id.mps);
        this.LLILLJJLI = this.LLILLL.findViewById(R.id.mpd);
        C786410Ut5.T4(this.LL, 0.0f);
        C786410Ut5.T4(this.LLILLJJLI, 0.0f);
        C12ES.LJIIJ(getContext());
        C12ES.LIZJ(30.0f, getContext());
        this.LLIZ = new ValueAnimator.AnimatorUpdateListener() { // from class: X.0hgT
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LineProgressBar lineProgressBar = this.LL;
                if (lineProgressBar.LLIZLLLIL == EnumC1216750hlh.SCROLLING) {
                    C786410Ut5.T4(lineProgressBar.LL, 0.0f);
                    return;
                }
                float fIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (fIntValue > 0.0f && fIntValue <= 100.0f) {
                    float f = fIntValue / 100.0f;
                    C786410Ut5.T4(this.LL.LL, f);
                    C786410Ut5.Ob(this.LL.LL, f * 0.8f);
                } else {
                    if (fIntValue <= 100.0f || fIntValue > 200.0f) {
                        return;
                    }
                    float f2 = (fIntValue - 100.0f) / 100.0f;
                    C786410Ut5.T4(this.LL.LL, 1.0f - f2);
                    C786410Ut5.Ob(this.LL.LL, (f2 * 0.2f) + 0.8f);
                }
            }
        };
    }

    public void setAnimationStage(EnumC1216750hlh enumC1216750hlh) {
        this.LLIZLLLIL = enumC1216750hlh;
    }

    public LineProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZLLLIL = EnumC1216750hlh.NORMAL;
        LIZ(context);
    }
}
