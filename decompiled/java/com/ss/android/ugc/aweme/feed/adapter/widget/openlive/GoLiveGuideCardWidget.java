package com.ss.android.ugc.aweme.feed.adapter.widget.openlive;

import X.C01GW;
import X.C0J07;
import X.C0J09;
import X.C1161920gLG;
import X.C13LE;
import X.C197039127h;
import X.C19719912Dl;
import X.C1A5L;
import X.C1ACA;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C418440Gaw;
import X.C452501pT;
import X.C483250IxH;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC494740Jai;
import Y.ACListenerS142S0100000_7;
import Y.ALAdapterS4S0100000_7;
import Y.ARunnableS107S0100000_7;
import Y.AUListenerS0S0100002_7;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.host.IHostStrategy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.LivePreviewBottomCardVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.PreviewSurveyViewModel;
import com.ss.android.ugc.aweme.feed.exp.LivePreviewExtraCardDetail;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.PreviewGoLiveAnchorPoint;

/* JADX INFO: loaded from: classes8.dex */
public final class GoLiveGuideCardWidget extends AbsLivePreviewBottomCardWidget {
    public final ViewGroup LLJIJIL;
    public PreviewGoLiveAnchorPoint LLJILJIL;
    public final String LLJILJILJ = "GoLiveGuideCardWidget";
    public TuxIconView LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public C197039127h LLJJIII;
    public Animator LLJJIJI;
    public Animator LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public final C01GW LLJJJ;
    public long LLJJJIL;
    public ARunnableS107S0100000_7 LLJJJJ;
    public final C01GW LLJJJJJIL;
    public String LLJJJJLIIL;
    public final C01GW LLJJL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.ddg;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget, com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        C2271391DvN.LIZ(this.LLJILLL, (C1A5L) C2271381DvM.LLIIZ.getValue());
        TuxIconView tuxIconView = this.LLJILLL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS142S0100000_7(this, 133));
        }
        ViewGroup viewGroup = this.LLJJIJIL;
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, new ACListenerS142S0100000_7(this, 134));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        ((IHostStrategy) C1161920gLG.LIZJ(IHostStrategy.class)).Gg0();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        N1();
    }

    public final void N1() {
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 == null || !c1acaZ1.LJJJLZIJ) {
            return;
        }
        ARunnableS107S0100000_7 aRunnableS107S0100000_7 = this.LLJJJJ;
        if (aRunnableS107S0100000_7 != null) {
            ((Handler) this.LLJJL.getValue()).removeCallbacks(aRunnableS107S0100000_7);
        }
        this.LLJJJJ = null;
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 != null) {
            c1acaZ12.LJJJLZIJ = false;
        }
        Animator animator = this.LLJJIJI;
        if (animator != null) {
            animator.cancel();
        }
        this.LLJJIJI = null;
        Animator animator2 = this.LLJJIJIIJIL;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LLJJIJIIJIL = null;
        int childCount = this.LLJIJIL.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.LLJIJIL.getChildAt(i);
            if (childAt.getId() != R.id.chm) {
                C786410Ut5.T4(childAt, 1.0f);
            }
        }
        C786410Ut5.bd(0.0f, this.LLJIJIL);
        ViewGroup viewGroup = this.LLJJIJIL;
        if (viewGroup != null) {
            C786410Ut5.bd(0.0f, viewGroup);
        }
        hide();
        C20441214yg.LJIIIZ(this.LLJILJILJ, "translation bottomTips to hide guide translationY:0");
    }

    public final void P1() {
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 == null || !c1acaZ1.LJJJLZIJ) {
            return;
        }
        Animator animator = this.LLJJIJIIJIL;
        if (animator == null || !animator.isRunning()) {
            float translationY = this.LLJIJIL.getTranslationY();
            float height = (this.LLJJIJIL != null ? r0.getHeight() : 0) + C418440Gaw.LIZIZ(12);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS0S0100002_7(this, translationY, height, 0));
            valueAnimatorOfFloat.addListener(new ALAdapterS4S0100000_7(this, 13));
            String str = this.LLJILJILJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("translation bottomTips to hide guide translationY:");
            sbLIZ.append(translationY);
            C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            valueAnimatorOfFloat.start();
            this.LLJJIJIIJIL = valueAnimatorOfFloat;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        N1();
    }

    public final void O1(PreviewGoLiveAnchorPoint previewGoLiveAnchorPoint) {
        C1ACA c1acaZ1;
        LiveRoomStruct liveRoomStruct;
        C483250IxH c483250IxH;
        NextLiveData<Boolean> nextLiveData;
        M1();
        LivePreviewBottomCardVM livePreviewBottomCardVMM1 = M1();
        if (livePreviewBottomCardVMM1 == null || (nextLiveData = livePreviewBottomCardVMM1.LLILLJJLI) == null || !Intrinsics.LJFF(nextLiveData.getValue(), Boolean.TRUE)) {
            M1();
            PreviewSurveyViewModel previewSurveyViewModel = (PreviewSurveyViewModel) this.LLJJJJJIL.getValue();
            if (previewSurveyViewModel != null && (c483250IxH = previewSurveyViewModel.LLJLIL) != null && c483250IxH.LIZLLL) {
                return;
            }
            PreviewSurveyViewModel previewSurveyViewModel2 = (PreviewSurveyViewModel) this.LLJJJJJIL.getValue();
            if ((previewSurveyViewModel2 != null && previewSurveyViewModel2.LLJLIL.LIZIZ) || (c1acaZ1 = z1()) == null || (liveRoomStruct = c1acaZ1.LIZJ) == null || previewGoLiveAnchorPoint.LIZ != liveRoomStruct.id) {
                return;
            }
            this.LLJILJIL = previewGoLiveAnchorPoint;
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 != null && c1acaZ12.LJJJLZIJ) {
                return;
            }
            C1ACA c1acaZ13 = z1();
            if (c1acaZ13 != null) {
                c1acaZ13.LJJJLZIJ = true;
            }
            LivePreviewBottomCardVM livePreviewBottomCardVMM12 = M1();
            if (livePreviewBottomCardVMM12 != null) {
                livePreviewBottomCardVMM12.LLILZ = true;
            }
            ViewGroup viewGroup = this.LLJJIJIL;
            if (viewGroup != null) {
                C786410Ut5.R4(0.0f, viewGroup);
            }
            TuxTextView tuxTextView = this.LLJJ;
            if (tuxTextView != null) {
                tuxTextView.setText(this.LLJILJIL.title);
            }
            TuxTextView tuxTextView2 = this.LLJJI;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(this.LLJILJIL.content);
            }
            ViewGroup viewGroup2 = this.LLJJIJIL;
            if (viewGroup2 != null) {
                C500260Jjc.LLFFF(viewGroup2);
            }
            ViewGroup viewGroup3 = this.LLJJIJIL;
            if (viewGroup3 != null) {
                C786410Ut5.bd(0.0f, viewGroup3);
            }
            show();
            ViewGroup viewGroup4 = this.LLJJIJIL;
            if (viewGroup4 == null) {
                return;
            }
            HandlerHook.viewPost(viewGroup4, new ARunnableS107S0100000_7(this, 280));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C197039127h c197039127h;
        ViewGroup viewGroup;
        NextLiveData<Boolean> nextLiveData;
        this.LLJILLL = (TuxIconView) findViewById(R.id.j30);
        this.LLJJ = (TuxTextView) findViewById(R.id.j33);
        this.LLJJI = (TuxTextView) findViewById(R.id.j32);
        this.LLJJIII = (C197039127h) findViewById(R.id.j2z);
        this.LLJJIJIL = (ViewGroup) findViewById(R.id.j31);
        PreviewSurveyViewModel previewSurveyViewModel = (PreviewSurveyViewModel) this.LLJJJJJIL.getValue();
        if (previewSurveyViewModel != null && (nextLiveData = previewSurveyViewModel.LLJZIJLIL) != null) {
            nextLiveData.observe(this, new AwS586S0100000_7(this, 204), false);
        }
        C0J09 c0j09 = C0J09.GO_LIVE_CARD;
        if (C0J07.LIZLLL(c0j09) && (viewGroup = this.LLJJIJIL) != null) {
            viewGroup.setBackground(C0J07.LIZIZ(c0j09, this.context, C418440Gaw.LIZIZ(12), R.attr.zh));
        }
        LivePreviewExtraCardDetail livePreviewExtraCardDetailLIZ = C0J07.LIZ(c0j09);
        if (livePreviewExtraCardDetailLIZ != null && livePreviewExtraCardDetailLIZ.optButtonCorner && (c197039127h = this.LLJJIII) != null) {
            c197039127h.LJJJJL(AFwS237S0000000_7.get$arr$(65));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        O1(this.LLJILJIL);
    }

    public GoLiveGuideCardWidget(ViewGroup viewGroup, PreviewGoLiveAnchorPoint previewGoLiveAnchorPoint) {
        this.LLJIJIL = viewGroup;
        this.LLJILJIL = previewGoLiveAnchorPoint;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GoLiveGuideVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 161);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJJJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS551S0100000_7, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        this.LLJJJIL = -1L;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PreviewSurveyViewModel.class);
        this.LLJJJJJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS551S0100000_7(c19719912DlLIZ2, 162), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJJL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(118));
    }
}
