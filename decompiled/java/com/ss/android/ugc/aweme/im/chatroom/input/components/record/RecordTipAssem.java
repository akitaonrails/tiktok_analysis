package com.ss.android.ugc.aweme.im.chatroom.input.components.record;

import X.C1619980sG4;
import X.C23250099c;
import X.C418440Gaw;
import X.C442000HUw;
import X.C458250Hy3;
import X.C458540HyW;
import X.C458550HyX;
import X.C459000HzG;
import X.C786410Ut5;
import X.C814420VxA;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AAListenerS317S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class RecordTipAssem extends UiStateViewAssem<C458250Hy3, C442000HUw, TextSwitcher> {
    @Override // com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem
    public final View LLLILZJ() {
        Context context = getContext();
        if (context == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        final TextSwitcher textSwitcher = new TextSwitcher(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textSwitcher);
        textSwitcher.setLayoutParams(layoutParams);
        textSwitcher.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        C786410Ut5.LJLLLLLL(((C458250Hy3) C459000HzG.LIZIZ(this).getValue()).LIZ ? 0 : 8, textSwitcher);
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: X.06o8
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                Context context2 = textSwitcher.getContext();
                if (context2 == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams2.gravity = 17;
                C786410Ut5.R6(tuxTextView, layoutParams2);
                tuxTextView.setTuxFont(71);
                tuxTextView.setTextColorRes(R.attr.a1k);
                tuxTextView.setGravity(17);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                tuxTextView.setMaxLines(2);
                return tuxTextView;
            }
        });
        textSwitcher.setClipChildren(false);
        textSwitcher.setClipToPadding(false);
        try {
            textSwitcher.setInAnimation(AnimationUtils.loadAnimation(textSwitcher.getContext(), R.anim.jg));
            textSwitcher.setOutAnimation(AnimationUtils.loadAnimation(textSwitcher.getContext(), R.anim.jh));
            return textSwitcher;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return textSwitcher;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem
    public final void hp(View view) {
        TextSwitcher textSwitcher = (TextSwitcher) view;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C458540HyW(this, textSwitcher, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C458550HyX(this, textSwitcher, null), 3);
    }

    public static ValueAnimator ip(boolean z, TextSwitcher textSwitcher) {
        if (z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(textSwitcher.getHeight(), C418440Gaw.LIZIZ(48));
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJFF());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(textSwitcher, 29));
            valueAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(textSwitcher, 11));
            valueAnimatorOfFloat.start();
            return valueAnimatorOfFloat;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(textSwitcher.getHeight(), 0.0f);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.setInterpolator(C1619980sG4.LJFF());
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS256S0100000_6(textSwitcher, 30));
        valueAnimatorOfFloat2.addListener(new AAListenerS317S0100000_6(textSwitcher, 12));
        valueAnimatorOfFloat2.start();
        return valueAnimatorOfFloat2;
    }
}
