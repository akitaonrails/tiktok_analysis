package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C01GW;
import X.C0AFT;
import X.C0IGH;
import X.C0IGI;
import X.C0OHO;
import X.C0SUL;
import X.C11NJ;
import X.C13LE;
import X.C19719912Dl;
import X.C452501pT;
import X.C760150Trp;
import X.C784440Upu;
import X.EnumC494740Jai;
import Y.AObserverS216S0100000_12;
import Y.AfS176S0100000_7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.LiveRepostVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.PreviewSurveyViewModel;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LongPressWidget extends LiveWatchPreviewWidget {
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 436));
    public boolean LLJI;
    public boolean LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C11NJ LLJJIJI;
    public final C760150Trp LLJJIJIIJIL;
    public float LLJJIJIL;
    public float LLJJJ;

    public LongPressWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PreviewSurveyViewModel.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 437);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJILJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS556S0100000_12, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJILJILJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ2, 438), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(LivePreviewGuideEnterVM.class);
        this.LLJILLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ3, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ3, 439), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(LiveRepostVM.class);
        this.LLJJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ4, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ4, 440), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(LivePreviewPlayerVM.class);
        this.LLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ5, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ5, 441), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(LivePreviewHighlightsPlayerVM.class);
        this.LLJJIII = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ6, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ6, 442), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJJIJI = new C11NJ();
        this.LLJJIJIIJIL = new C760150Trp(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        this.LLJJIJI.LJ();
    }

    public final C0SUL M1() {
        return (C0SUL) this.LLJ.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LLJJIJI.dispose();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void J1() {
        this.LLJJIJI.LIZ(C784440Upu.LIZ().LIZJ(this, C0IGH.class).LIZJ(new AfS176S0100000_7(this, 167)));
        this.LLJJIJI.LIZ(C784440Upu.LIZ().LIZJ(this, C0IGI.class).LIZJ(new AfS176S0100000_7(this, 168)));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        NextLiveData<Boolean> nextLiveData;
        int iIntValue;
        super.onLoad(objArr);
        C01GW c01gw = C0AFT.LIZ;
        if (((Number) c01gw.getValue()).intValue() > 0) {
            C0SUL c0sulM1 = M1();
            if (((Number) c01gw.getValue()).intValue() > 0) {
                iIntValue = ((Number) c01gw.getValue()).intValue();
            } else {
                iIntValue = 500;
            }
            c0sulM1.setTimeInterval(iIntValue);
        }
        if (C0OHO.LIZ().enable) {
            C0SUL c0sulM12 = M1();
            int i = C0OHO.LIZ().liveLongPressTime;
            int iIntValue2 = ((Number) C0OHO.LIZLLL.getValue()).intValue();
            if (i > 0) {
                c0sulM12.LLILZLL = i;
            }
            if (iIntValue2 > 0) {
                c0sulM12.LLILZIL = iIntValue2;
            } else {
                c0sulM12.getClass();
            }
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJILJILJ.getValue();
        if (feedLiveViewHolderVM != null && (nextLiveData = feedLiveViewHolderVM.LLJJL) != null) {
            nextLiveData.observe(this, new AObserverS216S0100000_12(this, 36));
        }
    }
}
