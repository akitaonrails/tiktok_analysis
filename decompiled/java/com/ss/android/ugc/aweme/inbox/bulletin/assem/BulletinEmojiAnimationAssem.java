package com.ss.android.ugc.aweme.inbox.bulletin.assem;

import X.C01GW;
import X.C0DTR;
import X.C0ORQ;
import X.C12ES;
import X.C1558520qew;
import X.C1619980sG4;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAnimationAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiAnimationAssem extends UIContentAssem implements BulletinEmojiAnimationAbility, InterfaceC1554640qYg {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 288));
    public int LLJ;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1158351792) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAnimationAbility
    public final boolean YS1() {
        return this.LLJ == 0;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAnimationAbility
    public final boolean m01() {
        return this.LLJ == 0;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final void Go(int i) {
        this.LLJ = i;
        if (i > 0) {
            View view = (View) this.LLIZLLLIL.getValue();
            if (view != null) {
                C12ES.LJIILL(0, view);
                return;
            }
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.LLIZLLLIL.getValue();
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        View view2 = (View) this.LLIZLLLIL.getValue();
        if (view2 == null) {
            return;
        }
        C0DTR.LIZIZ(view2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ho(android.view.View r9, android.view.View r10) {
        /*
            r8 = this;
            X.01GW r0 = r8.LLIZLLLIL
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            if (r1 != 0) goto Lb
            return
        Lb:
            r0 = 2131365998(0x7f0a106e, float:1.8351877E38)
            android.view.View r5 = r10.findViewById(r0)
            if (r5 == 0) goto L65
            int r0 = r5.getWidth()
            r2 = 19
            if (r0 <= 0) goto L7a
            int r0 = r5.getWidth()
        L20:
            float r3 = (float) r0
        L21:
            int r0 = r5.getHeight()
            if (r0 <= 0) goto L66
            int r0 = r5.getHeight()
        L2b:
            float r4 = (float) r0
        L2c:
            r7 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r7
            r5.setPivotX(r3)
            float r4 = r4 / r7
            r5.setPivotY(r4)
            r0 = 2
            int[] r6 = new int[r0]
            r9.getLocationInWindow(r6)
            int[] r5 = new int[r0]
            r1.getLocationInWindow(r5)
            r0 = 0
            r1 = r6[r0]
            r0 = r5[r0]
            int r1 = r1 - r0
            float r2 = (float) r1
            int r0 = r9.getWidth()
            float r0 = (float) r0
            float r0 = r0 / r7
            float r2 = r2 + r0
            r0 = 1
            r1 = r6[r0]
            r0 = r5[r0]
            int r1 = r1 - r0
            float r1 = (float) r1
            int r0 = r9.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r7
            float r1 = r1 + r0
            float r2 = r2 - r3
            X.C786410Ut5.Jc(r10, r2)
            float r1 = r1 - r4
            X.C786410Ut5.ed(r10, r1)
        L65:
            return
        L66:
            int r0 = r5.getMeasuredHeight()
            if (r0 <= 0) goto L71
            int r0 = r5.getMeasuredHeight()
            goto L2b
        L71:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            float r4 = X.C418440Gaw.LIZIZ(r0)
            goto L2c
        L7a:
            int r0 = r5.getMeasuredWidth()
            if (r0 <= 0) goto L85
            int r0 = r5.getMeasuredWidth()
            goto L20
        L85:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            float r3 = X.C418440Gaw.LIZIZ(r0)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEmojiAnimationAssem.Ho(android.view.View, android.view.View):void");
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.0Ocj, android.view.ViewTreeObserver$OnDrawListener] */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAnimationAbility
    public final void DE2(String str, final TuxTextView tuxTextView, final View view, final AnimatorListenerAdapter animatorListenerAdapter) {
        FrameLayout.LayoutParams layoutParams;
        final ViewGroup viewGroup = (ViewGroup) this.LLIZLLLIL.getValue();
        if ((viewGroup instanceof ViewGroup) && viewGroup != null) {
            Go(this.LLJ + 1);
            final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a7c, viewGroup, false);
            viewGroup.addView(viewTd);
            viewTd.setLayoutDirection(0);
            ViewGroup.LayoutParams layoutParams2 = viewTd.getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.gravity = 51;
            }
            Ho(tuxTextView, viewTd);
            TextView textView = (TextView) viewTd.findViewById(R.id.cyb);
            if (textView != null) {
                textView.setText(str);
            }
            final ?? r8 = new ViewTreeObserver.OnDrawListener() { // from class: X.0Ocj
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    this.LL.Ho(tuxTextView, viewTd);
                }
            };
            C786410Ut5.w3(view.getViewTreeObserver(), r8);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(50L);
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJI());
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(textView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.8f, 2.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.8f, 2.0f));
            objectAnimatorOfPropertyValuesHolder.setDuration(300L);
            objectAnimatorOfPropertyValuesHolder.setInterpolator(C1619980sG4.LIZLLL());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, "translationY", 0.0f, C418440Gaw.LIZIZ(-80));
            objectAnimatorOfFloat2.setInterpolator(new C0ORQ(1.871f));
            objectAnimatorOfFloat2.setDuration(477L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
            animatorSet.play(objectAnimatorOfPropertyValuesHolder).after(objectAnimatorOfFloat).after(100L);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView, "translationY", C418440Gaw.LIZIZ(-80), 0.0f);
            objectAnimatorOfFloat3.setInterpolator(new C0ORQ(1.871f));
            objectAnimatorOfFloat3.setDuration(477L);
            ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(textView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 2.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 2.0f, 1.0f));
            objectAnimatorOfPropertyValuesHolder2.setDuration(300L);
            objectAnimatorOfPropertyValuesHolder2.setInterpolator(C1619980sG4.LIZLLL());
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfPropertyValuesHolder2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(animatorSet, animatorSet2);
            animatorSet3.addListener(new AnimatorListenerAdapter() { // from class: X.0Oci
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    AnimatorListenerAdapter animatorListenerAdapter2 = animatorListenerAdapter;
                    if (animatorListenerAdapter2 != null) {
                        animatorListenerAdapter2.onAnimationEnd(animator);
                    }
                    C786410Ut5.B3(view.getViewTreeObserver(), r8);
                    C786410Ut5.T4(tuxTextView, 1.0f);
                    C786410Ut5.LJJJLZIJ(viewTd, viewGroup);
                    this.Go(r1.LLJ - 1);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    AnimatorListenerAdapter animatorListenerAdapter2 = animatorListenerAdapter;
                    if (animatorListenerAdapter2 != null) {
                        animatorListenerAdapter2.onAnimationStart(animator);
                    }
                    C786410Ut5.T4(tuxTextView, 0.0f);
                }
            });
            animatorSet3.start();
        }
    }
}
