package com.ss.android.ugc.aweme.im.longpress;

import X.C270120AiI;
import X.C418440Gaw;
import X.C814420VxA;
import Y.AAListenerS260S0200000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes6.dex */
public final class LongPressBubbleAnimUtilImpl implements LongPressBubbleAnimUtil {
    @Override // com.ss.android.ugc.aweme.im.longpress.LongPressBubbleAnimUtil
    public final void LIZ(View view) {
        if (view == null) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
        int height = view.getHeight();
        int width = view.getWidth();
        if (height != 0 && width != 0 && height * width != 0) {
            if (((Boolean) C270120AiI.LIZ.getValue()).booleanValue()) {
                view.setPivotX(view.getMeasuredWidth() / 2.0f);
                view.setPivotY(view.getMeasuredHeight() / 2.0f);
            }
            int i = height - iLIZIZ;
            if (i < 0) {
                i = 0;
            }
            int i2 = width - iLIZIZ;
            if (i2 < 0) {
                i2 = 0;
            }
            float f = (width - i2) / width;
            float f2 = 1;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, Math.max(f2 - f, 0.9f));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, Math.max(f2 - ((height - i) / height), 0.9f));
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f);
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat2.setDuration(100L);
            objectAnimatorOfFloat3.setDuration(150L);
            objectAnimatorOfFloat4.setDuration(150L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.addListener(new AAListenerS260S0200000_5(objectAnimatorOfFloat3, objectAnimatorOfFloat4, 1));
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
            animatorSet.start();
        }
    }
}
