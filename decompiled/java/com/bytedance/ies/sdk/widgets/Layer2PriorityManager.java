package com.bytedance.ies.sdk.widgets;

import X.C09JN;
import X.C0GY9;
import X.C0J1R;
import X.C118300cf;
import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.C1C7U;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class Layer2PriorityManager {
    public boolean animationEnable;
    public boolean firstScreenDone;
    public final Fragment fragment;
    public Data donationSticker = new Data(null, false);
    public Data rankEntrance = new Data(null, false);
    public Data hashTag = new Data(null, false);

    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    public final Data getDonationSticker() {
        return this.donationSticker;
    }

    public final boolean getFirstScreenDone() {
        return this.firstScreenDone;
    }

    public final Data getHashTag() {
        return this.hashTag;
    }

    public final Data getRankEntrance() {
        return this.rankEntrance;
    }

    public static final class Data {
        public boolean show;
        public ILayer2PriorityWidget widget;

        public final void setShow(boolean z) {
            this.show = z;
        }

        public final void setWidget(ILayer2PriorityWidget iLayer2PriorityWidget) {
            this.widget = iLayer2PriorityWidget;
        }

        public Data(ILayer2PriorityWidget iLayer2PriorityWidget, boolean z) {
            this.widget = iLayer2PriorityWidget;
            this.show = z;
        }
    }

    public Layer2PriorityManager(Fragment fragment) {
        this.fragment = fragment;
    }

    private final void show(Data data) {
        if (this.firstScreenDone) {
            ILayer2PriorityWidget iLayer2PriorityWidget = data.widget;
            if ((iLayer2PriorityWidget instanceof LiveRecyclableWidget) && !isShowing(iLayer2PriorityWidget)) {
                ((com.bytedance.android.widget.Widget) data.widget).show();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void traverse2(ILayer2PriorityWidget iLayer2PriorityWidget) {
        Data data = this.donationSticker;
        if (data.show) {
            show(data);
            hide(this.rankEntrance, iLayer2PriorityWidget);
            hide(this.hashTag, iLayer2PriorityWidget);
            return;
        }
        Data data2 = this.rankEntrance;
        if (data2.show) {
            if (this.animationEnable && isShowing(this.hashTag.widget) && !isShowing(this.rankEntrance.widget)) {
                change(this.hashTag.widget, this.rankEntrance.widget);
                return;
            }
            hide(this.donationSticker, iLayer2PriorityWidget);
            show(this.rankEntrance);
            hide(this.hashTag, iLayer2PriorityWidget);
            return;
        }
        if (this.hashTag.show) {
            if (this.animationEnable && isShowing(data2.widget) && !isShowing(this.hashTag.widget)) {
                change(this.rankEntrance.widget, this.hashTag.widget);
                return;
            }
            hide(this.donationSticker, iLayer2PriorityWidget);
            hide(this.rankEntrance, iLayer2PriorityWidget);
            show(this.hashTag);
            return;
        }
        if (!(iLayer2PriorityWidget instanceof LiveRecyclableWidget)) {
            return;
        }
        ((com.bytedance.android.widget.Widget) iLayer2PriorityWidget).hide();
    }

    public final boolean hideWidget(ILayer2PriorityWidget iLayer2PriorityWidget) {
        traverse1(iLayer2PriorityWidget, false);
        traverse2(iLayer2PriorityWidget);
        return !isShowing(iLayer2PriorityWidget);
    }

    public final boolean isShowing(ILayer2PriorityWidget iLayer2PriorityWidget) {
        View viewRootView;
        if (iLayer2PriorityWidget == null || (viewRootView = iLayer2PriorityWidget.rootView()) == null || viewRootView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void preMeasure(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void setAnimationEnable(boolean z) {
        this.animationEnable = z;
    }

    public final void setDonationSticker(Data data) {
        this.donationSticker = data;
    }

    public final void setFirstScreenDone(boolean z) {
        this.firstScreenDone = z;
        if (z) {
            traverse2(null);
        }
        if (this.fragment.isAdded()) {
            C11NZ.LJLJJLL(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJIILIIL(C0J1R.LIZIZ(this.fragment)).LJJLJLI(new C09JN() { // from class: com.bytedance.ies.sdk.widgets.Layer2PriorityManager$firstScreenDone$1
                @Override // X.C09JN
                public /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("Layer2PriorityManager@4c91.firstScreenDone$1");
                    accept((Long) obj);
                    C1C7U.LIZIZ("Layer2PriorityManager@4c91.firstScreenDone$1");
                }

                public final void accept(Long l) {
                    this.this$0.setAnimationEnable(true);
                }
            });
        }
    }

    public final void setHashTag(Data data) {
        this.hashTag = data;
    }

    public final void setRankEntrance(Data data) {
        this.rankEntrance = data;
    }

    public final boolean showWidget(ILayer2PriorityWidget iLayer2PriorityWidget) {
        traverse1(iLayer2PriorityWidget, true);
        traverse2(null);
        return isShowing(iLayer2PriorityWidget);
    }

    private final void change(final ILayer2PriorityWidget iLayer2PriorityWidget, final ILayer2PriorityWidget iLayer2PriorityWidget2) {
        final int width;
        View viewRootView;
        if (iLayer2PriorityWidget != null && (viewRootView = iLayer2PriorityWidget.rootView()) != null) {
            width = viewRootView.getWidth();
        } else {
            width = 0;
        }
        final C118300cf c118300cf = new C118300cf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.42f, 0.0f, 0.58f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.ies.sdk.widgets.Layer2PriorityManager.change.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view;
                ILayer2PriorityWidget iLayer2PriorityWidget3 = iLayer2PriorityWidget;
                if ((iLayer2PriorityWidget3 instanceof LiveRecyclableWidget) && this.isShowing(iLayer2PriorityWidget3) && (view = ((com.bytedance.android.widget.Widget) iLayer2PriorityWidget).getView()) != null) {
                    C786410Ut5.T4(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        });
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.ies.sdk.widgets.Layer2PriorityManager.change.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ILayer2PriorityWidget iLayer2PriorityWidget3 = iLayer2PriorityWidget;
                if ((iLayer2PriorityWidget3 instanceof LiveRecyclableWidget) && this.isShowing(iLayer2PriorityWidget3)) {
                    View view = ((com.bytedance.android.widget.Widget) iLayer2PriorityWidget).getView();
                    if (view != null) {
                        C786410Ut5.T4(view, 1.0f);
                    }
                    ((com.bytedance.android.widget.Widget) iLayer2PriorityWidget).hide();
                }
            }
        });
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setStartDelay(200L);
        valueAnimatorOfFloat2.setDuration(400L);
        valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.42f, 0.0f, 0.58f, 1.0f));
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.ies.sdk.widgets.Layer2PriorityManager.change.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view;
                ILayer2PriorityWidget iLayer2PriorityWidget3 = iLayer2PriorityWidget2;
                if ((iLayer2PriorityWidget3 instanceof LiveRecyclableWidget) && this.isShowing(iLayer2PriorityWidget3) && (view = ((com.bytedance.android.widget.Widget) iLayer2PriorityWidget2).getView()) != null) {
                    Layer2PriorityManager layer2PriorityManager = this;
                    int i = width;
                    C118300cf c118300cf2 = c118300cf;
                    C786410Ut5.T4(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                    layer2PriorityManager.setWidth(view, (int) (i + (((Float) valueAnimator.getAnimatedValue()).floatValue() * (c118300cf2.element - i))));
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.ies.sdk.widgets.Layer2PriorityManager.change.4
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                View view;
                ILayer2PriorityWidget iLayer2PriorityWidget3 = iLayer2PriorityWidget2;
                if ((iLayer2PriorityWidget3 instanceof LiveRecyclableWidget) && this.isShowing(iLayer2PriorityWidget3) && (view = ((com.bytedance.android.widget.Widget) iLayer2PriorityWidget2).getView()) != null) {
                    Layer2PriorityManager layer2PriorityManager = this;
                    C786410Ut5.T4(view, 1.0f);
                    layer2PriorityManager.setWidth(view, -2);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ILayer2PriorityWidget iLayer2PriorityWidget3 = iLayer2PriorityWidget2;
                if ((iLayer2PriorityWidget3 instanceof LiveRecyclableWidget) && !this.isShowing(iLayer2PriorityWidget3)) {
                    View view = ((com.bytedance.android.widget.Widget) iLayer2PriorityWidget2).getView();
                    if (view != null) {
                        C786410Ut5.T4(view, 0.0f);
                    }
                    ((com.bytedance.android.widget.Widget) iLayer2PriorityWidget2).show();
                    View view2 = ((com.bytedance.android.widget.Widget) iLayer2PriorityWidget2).getView();
                    if (view2 != null) {
                        Layer2PriorityManager layer2PriorityManager = this;
                        C118300cf c118300cf2 = c118300cf;
                        int i = width;
                        layer2PriorityManager.preMeasure(view2);
                        c118300cf2.element = view2.getMeasuredWidth();
                        layer2PriorityManager.setWidth(view2, i);
                    }
                }
            }
        });
        valueAnimatorOfFloat2.start();
    }

    private final void hide(Data data, ILayer2PriorityWidget iLayer2PriorityWidget) {
        ILayer2PriorityWidget iLayer2PriorityWidget2 = data.widget;
        Object obj = iLayer2PriorityWidget;
        if (iLayer2PriorityWidget2 != null) {
            obj = iLayer2PriorityWidget2;
        }
        if (obj instanceof LiveRecyclableWidget) {
            ((com.bytedance.android.widget.Widget) obj).hide();
        }
    }

    private final void traverse1(ILayer2PriorityWidget iLayer2PriorityWidget, boolean z) {
        if (Intrinsics.LJFF(iLayer2PriorityWidget, this.donationSticker.widget)) {
            this.donationSticker.setShow(z);
        } else if (Intrinsics.LJFF(iLayer2PriorityWidget, this.rankEntrance.widget)) {
            this.rankEntrance.setShow(z);
        } else {
            if (!Intrinsics.LJFF(iLayer2PriorityWidget, this.hashTag.widget)) {
                return;
            }
            this.hashTag.setShow(z);
        }
    }

    public final void setWidth(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        C786410Ut5.W5(view, layoutParams);
    }
}
