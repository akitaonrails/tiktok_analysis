package com.ss.android.ugc.aweme.feed.adapter.widget.ad;

import X.C01GW;
import X.C1016630cYv;
import X.C12ES;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C1ACA;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC494740Jai;
import X.InterfaceC1009200cMw;
import X.InterfaceC1016620cYu;
import Y.ALAdapterS12S0100000_16;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAnimationModel;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.LivePreviewBottomCardVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AdCapabilityAggregateLiveWidget extends AbsLivePreviewBottomCardWidget implements InterfaceC1009200cMw {
    public final C1016630cYv LLJIJIL = new Object() { // from class: X.0cYv
    };
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0cYv] */
    public AdCapabilityAggregateLiveWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJILJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 277), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 273));
        this.LLJILLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 275));
        this.LLJJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 274));
        this.LLJJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(180));
        InterfaceC1016620cYu interfaceC1016620cYuN1 = N1();
        if (interfaceC1016620cYuN1 != null) {
            interfaceC1016620cYuN1.mt(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void E1() {
        this.LL = true;
        InterfaceC1016620cYu interfaceC1016620cYuN1 = N1();
        if (interfaceC1016620cYuN1 != null) {
            interfaceC1016620cYuN1.LJJIIZ();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget, com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final InterfaceC1016620cYu N1() {
        return (InterfaceC1016620cYu) this.LLJJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        InterfaceC1016620cYu interfaceC1016620cYuN1 = N1();
        if (interfaceC1016620cYuN1 != null) {
            Context context = this.context;
            C1ACA c1acaZ1 = z1();
            Aweme aweme = c1acaZ1 != null ? c1acaZ1.LIZIZ : null;
            C1ACA c1acaZ12 = z1();
            interfaceC1016620cYuN1.LJJIJIL(context, aweme, c1acaZ12 != null ? c1acaZ12.LJ : null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        InterfaceC1016620cYu interfaceC1016620cYuN1 = N1();
        if (interfaceC1016620cYuN1 != null) {
            interfaceC1016620cYuN1.onUnbind();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void J1() {
        View viewFindViewById;
        View view = getView();
        View view2 = null;
        if (view == null || (viewFindViewById = view.findViewById(R.id.i3m)) == null) {
            View view3 = getView();
            if (view3 != null) {
                Object parent = view3.getParent();
                if (parent instanceof View) {
                    View view4 = (View) parent;
                    while (true) {
                        if (view4 != null) {
                            if (view4.getId() != R.id.i3m) {
                                Object parent2 = view4.getParent();
                                if (!(parent2 instanceof View)) {
                                    break;
                                } else {
                                    view4 = (View) parent2;
                                }
                            } else {
                                view2 = view4;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            viewFindViewById = view2;
        }
        InterfaceC1016620cYu interfaceC1016620cYuN1 = N1();
        if (interfaceC1016620cYuN1 != null) {
            interfaceC1016620cYuN1.nt(viewFindViewById);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        InterfaceC1016620cYu interfaceC1016620cYuN1 = N1();
        if (interfaceC1016620cYuN1 != null) {
            interfaceC1016620cYuN1.LJJIII();
        }
        ViewGroup viewGroup = (ViewGroup) this.LLJILLL.getValue();
        if (viewGroup == null) {
            return;
        }
        C786410Ut5.bd(0.0f, viewGroup);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C786410Ut5.T4(viewGroup.getChildAt(i), 1.0f);
        }
    }

    @Override // X.InterfaceC1009200cMw
    public final boolean LJJJIL() {
        NextLiveData<Boolean> nextLiveData;
        M1();
        LivePreviewBottomCardVM livePreviewBottomCardVMM1 = M1();
        if (livePreviewBottomCardVMM1 != null && (nextLiveData = livePreviewBottomCardVMM1.LLILLJJLI) != null && Intrinsics.LJFF(nextLiveData.getValue(), Boolean.TRUE)) {
            return false;
        }
        M1();
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        InterfaceC1016620cYu interfaceC1016620cYuN1 = N1();
        if (interfaceC1016620cYuN1 != null) {
            interfaceC1016620cYuN1.LJJIIJ();
        }
    }

    @Override // X.InterfaceC1009200cMw
    public final void H(Integer num) {
        int i;
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJILJIL.getValue();
        if (feedLiveViewHolderVM != null) {
            Context context = this.context;
            if (num != null && num.intValue() == 98) {
                i = 30;
            } else {
                i = -1;
            }
            feedLiveViewHolderVM.KQ2(false, context, "normal", false, false, false, i, null, false, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        InterfaceC1016620cYu interfaceC1016620cYuN1 = N1();
        if (interfaceC1016620cYuN1 != null) {
            interfaceC1016620cYuN1.lt();
        }
        InterfaceC1016620cYu interfaceC1016620cYuN12 = N1();
        if (interfaceC1016620cYuN12 != null) {
            interfaceC1016620cYuN12.LJJIJIIJIL(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        this.LL = false;
        InterfaceC1016620cYu interfaceC1016620cYuN1 = N1();
        if (interfaceC1016620cYuN1 != null) {
            interfaceC1016620cYuN1.LJJIIJZLJL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
    }

    @Override // X.InterfaceC1009200cMw
    public final void LLLLLL(AnoleComponentAnimationModel anoleComponentAnimationModel, Interpolator interpolator) {
        float fDoubleValue;
        C1016630cYv c1016630cYv = this.LLJIJIL;
        ViewGroup viewGroup = (ViewGroup) this.LLJILLL.getValue();
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(this, 276);
        c1016630cYv.getClass();
        if (viewGroup != null) {
            float fDoubleValue2 = 0.0f;
            viewGroup.animate().translationY(0.0f).setDuration(anoleComponentAnimationModel.duration).setStartDelay(anoleComponentAnimationModel.delay).setInterpolator(interpolator).setListener(new ALAdapterS12S0100000_16(awS560S0100000_16, 12)).start();
            Double initialOpacityValue = anoleComponentAnimationModel.getInitialOpacityValue();
            if (initialOpacityValue != null) {
                fDoubleValue2 = ((float) initialOpacityValue.doubleValue()) / 100.0f;
            }
            Double finalOpacityValue = anoleComponentAnimationModel.getFinalOpacityValue();
            if (finalOpacityValue != null) {
                fDoubleValue = ((float) finalOpacityValue.doubleValue()) / 100.0f;
            } else {
                fDoubleValue = 1.0f;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getId() != R.id.chm) {
                    C786410Ut5.T4(childAt, fDoubleValue2);
                    childAt.animate().alpha(fDoubleValue).setDuration(anoleComponentAnimationModel.duration).setStartDelay(anoleComponentAnimationModel.delay).setInterpolator(interpolator).start();
                } else {
                    C786410Ut5.T4(childAt, 1.0f);
                }
            }
        }
    }

    @Override // X.InterfaceC1009200cMw
    public final void F(AnoleComponentAnimationModel anoleComponentAnimationModel, Interpolator interpolator, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        float fDoubleValue;
        float fDoubleValue2;
        MutableLiveData<Boolean> mutableLiveData;
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJILJIL.getValue();
        if (feedLiveViewHolderVM != null && (mutableLiveData = feedLiveViewHolderVM.LLJZ) != null) {
            mutableLiveData.setValue(Boolean.TRUE);
        }
        C1016630cYv c1016630cYv = this.LLJIJIL;
        ViewGroup viewGroup = (ViewGroup) this.LLJILLL.getValue();
        View view2 = (View) this.LLJJ.getValue();
        View view3 = (View) this.LLJILJILJ.getValue();
        c1016630cYv.getClass();
        if (viewGroup != null && view2 != null && view3 != null && view != null) {
            int top = viewGroup.getTop() + view2.getBottom();
            int bottom = view3.getBottom() - view.getLayoutParams().height;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                i = marginLayoutParams.bottomMargin;
            } else {
                i = 0;
            }
            viewGroup.animate().translationY(((bottom - i) - top) - C12ES.LIZJ(32.0f, view.getContext())).setDuration(anoleComponentAnimationModel.duration).setStartDelay(anoleComponentAnimationModel.delay).setInterpolator(interpolator).start();
            Double initialOpacityValue = anoleComponentAnimationModel.getInitialOpacityValue();
            if (initialOpacityValue != null) {
                fDoubleValue = ((float) initialOpacityValue.doubleValue()) / 100.0f;
            } else {
                fDoubleValue = 1.0f;
            }
            Double finalOpacityValue = anoleComponentAnimationModel.getFinalOpacityValue();
            if (finalOpacityValue != null) {
                fDoubleValue2 = ((float) finalOpacityValue.doubleValue()) / 100.0f;
            } else {
                fDoubleValue2 = 0.0f;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getId() != R.id.chm) {
                    C786410Ut5.T4(childAt, fDoubleValue);
                    childAt.animate().alpha(fDoubleValue2).setDuration(anoleComponentAnimationModel.duration).setStartDelay(anoleComponentAnimationModel.delay).setInterpolator(interpolator).start();
                }
            }
        }
    }
}
