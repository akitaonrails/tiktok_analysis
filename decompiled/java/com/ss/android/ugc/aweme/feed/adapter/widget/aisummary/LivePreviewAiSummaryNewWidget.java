package com.ss.android.ugc.aweme.feed.adapter.widget.aisummary;

import X.C01GW;
import X.C0BE8;
import X.C0CAU;
import X.C0TL0;
import X.C13LE;
import X.C19719912Dl;
import X.C1ACA;
import X.C20441214yg;
import X.C2188811AlT;
import X.C292780Bdk;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452501pT;
import X.C473410IhP;
import X.C745010TKh;
import X.C745020TKi;
import X.C745100TKq;
import X.C745110TKr;
import X.C745190TKz;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC494740Jai;
import X.EnumC745120TKs;
import X.EnumC765980U2y;
import Y.ALAdapterS9S0100000_12;
import Y.AObserverS216S0100000_12;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS45S0300000_12;
import Y.AUListenerS1S0100002_12;
import Y.AUListenerS220S0200000_12;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.LivePreviewBottomCardVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class LivePreviewAiSummaryNewWidget extends AbsLivePreviewBottomCardWidget {
    public static final int LLLF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLLFF;
    public static final float LLLFFI;
    public final ViewGroup LLJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(188));
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public TuxTextView LLJJ;
    public C0TL0 LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public Animator LLJJJIL;
    public Animator LLJJJJ;
    public View LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public ValueAnimator LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public ARunnableS112S0100000_12 LLJLL;
    public ARunnableS45S0300000_12 LLJLLIL;
    public TuxIconView LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        this.LLL = false;
        C0TL0 c0tl0 = this.LLJJI;
        if (c0tl0 != null) {
            for (Pair<TuxTextView, C745190TKz> pair : c0tl0.getAiSummaryContentViewList()) {
                C339190DRl.LIZIZ(pair.getFirst());
                TuxTextView first = pair.getFirst();
                float textSize = first.getTextSize();
                float f = c0tl0.LLILZ;
                if (textSize == f) {
                    first = null;
                }
                TuxTextView tuxTextView = first;
                if (tuxTextView != null) {
                    tuxTextView.setTextSize(f);
                }
            }
        }
        ValueAnimator valueAnimator = this.LLJJL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJJL = null;
        Q1();
        this.LLJJLIIIJLLLLLLLZ = false;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dbo;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget, com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        LLLFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
        LLLFFI = C418440Gaw.LIZIZ(12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0161  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1() {
        /*
            Method dump skipped, instruction units count: 1483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.aisummary.LivePreviewAiSummaryNewWidget.B1():void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        if (this.LLJZ) {
            T1();
        }
    }

    public final void N1() {
        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LLJLL;
        if (aRunnableS112S0100000_12 != null) {
            C0CAU.LIZ.removeCallbacks(aRunnableS112S0100000_12);
        }
        this.LLJLL = null;
        C473410IhP.LIZ().removeCallbacks((Runnable) this.LLJLILLLLZIIL.getValue());
        ARunnableS45S0300000_12 aRunnableS45S0300000_12 = this.LLJLLIL;
        if (aRunnableS45S0300000_12 != null) {
            C473410IhP.LIZ().removeCallbacks(aRunnableS45S0300000_12);
        }
        this.LLJLLIL = null;
        C0TL0 c0tl0 = this.LLJJI;
        if (c0tl0 != null) {
            c0tl0.LIZ();
        }
        ValueAnimator valueAnimator = this.LLJJL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJJL = null;
    }

    public final ViewGroup O1() {
        return (ViewGroup) this.LLJJIJIIJIL.getValue();
    }

    public final List<String> P1() {
        return (List) this.LLJILJIL.getValue();
    }

    public final void Q1() {
        View view = this.LLJJJJJIL;
        if (view != null) {
            C786410Ut5.T4(view, 0.0f);
        }
        TuxTextView tuxTextView = this.LLJJJJLIIL;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, 0.0f);
        }
    }

    public final boolean R1() {
        C1ACA c1acaZ1;
        boolean z = C292780Bdk.LIZ;
        return C292780Bdk.LIZ && (c1acaZ1 = z1()) != null && c1acaZ1.LJIILIIL;
    }

    public final void T1() {
        NextLiveData<Boolean> nextLiveData;
        NextLiveData<Boolean> nextLiveData2;
        if (this.LLL) {
            if (!this.LLJLIL) {
                C1ACA c1acaZ1 = z1();
                if ((c1acaZ1 != null && c1acaZ1.LJJZZIII == 1) || C745110TKr.LIZ(z1()) != null) {
                    return;
                }
                C1ACA c1acaZ12 = z1();
                if (c1acaZ12 != null && c1acaZ12.LJIILIIL && !R1()) {
                    C1ACA c1acaZ13 = z1();
                    if (c1acaZ13 != null) {
                        c1acaZ13.LJJLJLI = EnumC745120TKs.OTHER_CARD_SHOW;
                        return;
                    }
                    return;
                }
                LivePreviewBottomCardVM livePreviewBottomCardVMM1 = M1();
                if (livePreviewBottomCardVMM1 != null && (nextLiveData2 = livePreviewBottomCardVMM1.LLILLJJLI) != null && Intrinsics.LJFF(nextLiveData2.getValue(), Boolean.TRUE)) {
                    return;
                }
                LivePreviewBottomCardVM livePreviewBottomCardVMM12 = M1();
                if ((livePreviewBottomCardVMM12 != null && (nextLiveData = livePreviewBottomCardVMM12.LLILLL) != null && Intrinsics.LJFF(nextLiveData.getValue(), Boolean.TRUE)) || this.LLJLL != null) {
                    return;
                }
            }
            this.LLJLIL = false;
            N1();
            this.LLJLL = new ARunnableS112S0100000_12(this, 176);
            long jLongValue = R1() ? C0BE8.LIZ : ((Number) this.LLJJIJI.getValue()).longValue();
            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LLJLL;
            if (aRunnableS112S0100000_12 != null) {
                C786410Ut5.LJLIIL(jLongValue, C0CAU.LIZ, aRunnableS112S0100000_12);
            }
        }
    }

    public final void V1() {
        TuxTextView tuxTextView;
        View view = this.LLJJJJJIL;
        if (view == null || (tuxTextView = this.LLJJJJLIIL) == null) {
            return;
        }
        ValueAnimator valueAnimator = this.LLJJL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS220S0200000_12(view, tuxTextView, 1));
        valueAnimatorOfFloat.start();
        this.LLJJL = valueAnimatorOfFloat;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        Animator animator = this.LLJJJJ;
        if (animator != null) {
            animator.cancel();
        }
        this.LLJJJJ = null;
        N1();
        Animator animator2 = this.LLJJJIL;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LLJJJIL = null;
        Q1();
        C0TL0 c0tl0 = this.LLJJI;
        if (c0tl0 != null) {
            c0tl0.LIZIZ();
        }
        ValueAnimator valueAnimator = this.LLJJL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJJL = null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        U1(false);
        if (!this.LLJZIJLIL && this.LLJL) {
            C745100TKq.LJ().storeLong(C745100TKq.LIZIZ(), 0L);
            List listLIZLLL = C745100TKq.LIZLLL();
            if (listLIZLLL != null) {
                ArrayList arrayList = (ArrayList) listLIZLLL;
                arrayList.clear();
                C745100TKq.LJ().storeStringArray(C745100TKq.LIZJ(), (String[]) arrayList.toArray(new String[0]));
            }
        }
        this.LLJZIJLIL = false;
        this.LLJZ = false;
        this.LLJL = false;
        this.LLJLIL = false;
    }

    public final boolean S1() {
        return C745010TKh.LIZ() && C745020TKi.LIZ(z1(), null, 6);
    }

    public LivePreviewAiSummaryNewWidget(ViewGroup viewGroup) {
        this.LLJIJIL = viewGroup;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 449);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJILJILJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS556S0100000_12, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LivePreviewHighlightsPlayerVM.class);
        this.LLJILLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ2, 450), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJJIII = C452501pT.LIZIZ(new AwS556S0100000_12(this, 445));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 446));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 444));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 451));
        this.LLJJJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 448));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 447));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        this.LLJZ = true;
        T1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        NextLiveData<Boolean> nextLiveData;
        LivePreviewBottomCardVM livePreviewBottomCardVMM1 = M1();
        if (livePreviewBottomCardVMM1 != null && (nextLiveData = livePreviewBottomCardVMM1.LLILLJJLI) != null && Intrinsics.LJFF(nextLiveData.getValue(), Boolean.TRUE)) {
            this.LLJLIL = true;
        }
        U1(false);
    }

    public final void U1(boolean z) {
        NextLiveData<Boolean> nextLiveData;
        int height;
        float fLIZIZ;
        long j;
        NextLiveData<Boolean> nextLiveData2;
        NextLiveData<Boolean> nextLiveData3;
        N1();
        LivePreviewBottomCardVM livePreviewBottomCardVMM1 = M1();
        if (livePreviewBottomCardVMM1 != null && (nextLiveData = livePreviewBottomCardVMM1.LLILLJJLI) != null && Intrinsics.LJFF(nextLiveData.getValue(), Boolean.TRUE)) {
            Animator animator = this.LLJJJJ;
            if (animator != null && animator.isRunning()) {
                return;
            }
            float translationY = O1().getTranslationY();
            ((View) this.LLJJJ.getValue()).setBackground(null);
            C339190DRl.LIZLLL((View) this.LLJJJ.getValue());
            View view = getView();
            if (view != null) {
                height = view.getHeight();
            } else {
                height = 0;
            }
            if (S1()) {
                fLIZIZ = 0.0f;
            } else {
                fLIZIZ = height + C418440Gaw.LIZIZ(12);
            }
            N1();
            Animator animator2 = this.LLJJJIL;
            if (animator2 != null) {
                animator2.cancel();
            }
            this.LLJJJIL = null;
            if (!z) {
                Animator animator3 = this.LLJJJJ;
                if (animator3 != null) {
                    animator3.cancel();
                }
                this.LLJJJJ = null;
                View view2 = getView();
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                C0TL0 c0tl0 = this.LLJJI;
                if (c0tl0 != null) {
                    c0tl0.LIZIZ();
                }
                int childCount = O1().getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = O1().getChildAt(i);
                    if (childAt.getId() != R.id.chm) {
                        C786410Ut5.T4(childAt, 1.0f);
                    }
                }
                C786410Ut5.bd(0.0f, O1());
                Q1();
                LivePreviewBottomCardVM livePreviewBottomCardVMM12 = M1();
                if (livePreviewBottomCardVMM12 != null && (nextLiveData3 = livePreviewBottomCardVMM12.LLILLJJLI) != null) {
                    nextLiveData3.setValue(Boolean.FALSE);
                    return;
                }
                return;
            }
            Animator animator4 = this.LLJJJJ;
            if (animator4 != null && animator4.isRunning()) {
                return;
            }
            C0TL0 c0tl02 = this.LLJJI;
            if (c0tl02 != null) {
                c0tl02.LIZ();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            if (S1()) {
                j = 300;
            } else {
                j = 200;
            }
            valueAnimatorOfFloat.setDuration(j);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS1S0100002_12(this, translationY, fLIZIZ, 0));
            valueAnimatorOfFloat.addListener(new ALAdapterS9S0100000_12(this, 14));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("translation bottomTips to hide guide translationY:");
            sbLIZ.append(translationY);
            C20441214yg.LJIIIZ("ttlive_preview_ai_summary", C2188811AlT.LIZIZ(sbLIZ));
            valueAnimatorOfFloat.start();
            this.LLJJJJ = valueAnimatorOfFloat;
            LivePreviewBottomCardVM livePreviewBottomCardVMM13 = M1();
            if (livePreviewBottomCardVMM13 == null || (nextLiveData2 = livePreviewBottomCardVMM13.LLILLJJLI) == null) {
                return;
            }
            nextLiveData2.setValue(Boolean.FALSE);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<EnumC765980U2y> mutableLiveData;
        NextLiveData<Integer> nextLiveData;
        super.onLoad(objArr);
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJILJILJ.getValue();
        if (feedLiveViewHolderVM != null && (nextLiveData = feedLiveViewHolderVM.LLJJJJJIL) != null) {
            nextLiveData.observe(this, new AObserverS216S0100000_12(this, 38));
        }
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVM = (LivePreviewHighlightsPlayerVM) this.LLJILLL.getValue();
        if (livePreviewHighlightsPlayerVM != null && (mutableLiveData = livePreviewHighlightsPlayerVM.LLILLL) != null) {
            mutableLiveData.observe(this, new AObserverS216S0100000_12(this, 39));
        }
    }
}
