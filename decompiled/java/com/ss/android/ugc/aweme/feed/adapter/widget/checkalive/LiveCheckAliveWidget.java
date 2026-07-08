package com.ss.android.ugc.aweme.feed.adapter.widget.checkalive;

import X.C01GW;
import X.C0J75;
import X.C0J77;
import X.C0J7C;
import X.C1079030eBZ;
import X.C13LE;
import X.C19719912Dl;
import X.C1ACA;
import X.C452501pT;
import X.EnumC494740Jai;
import Y.AObserverS211S0100000_7;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveCheckAliveWidget extends LiveWatchPreviewWidget {
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    public LiveCheckAliveWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new AwS551S0100000_7(c19719912DlLIZ, 145), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
        this.LLJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 146));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(115));
        this.LLJILJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(116));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final boolean M1() {
        C1ACA c1acaZ1;
        return C1079030eBZ.LIZ() && (c1acaZ1 = z1()) != null && TextUtils.equals(c1acaZ1.LIZLLL, "homepage_hot");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        Aweme aweme;
        super.LJJIJIIJIL(i);
        if (M1()) {
            C1ACA c1acaZ1 = z1();
            if (c1acaZ1 != null) {
                aweme = c1acaZ1.LIZIZ;
            } else {
                aweme = null;
            }
            C0J7C.LIZ(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        NextLiveData<C0J77> nextLiveData;
        NextLiveData<C0J75> nextLiveData2;
        super.onLoad(objArr);
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJ.getValue();
        if (feedLiveViewHolderVM != null && (nextLiveData2 = feedLiveViewHolderVM.LLLILZ) != null) {
            nextLiveData2.observe(this, new AObserverS211S0100000_7(this, 12));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM2 = (FeedLiveViewHolderVM) this.LLJ.getValue();
        if (feedLiveViewHolderVM2 != null && (nextLiveData = feedLiveViewHolderVM2.LLLILZJ) != null) {
            nextLiveData.observe(this, new AObserverS211S0100000_7(this, 13));
        }
    }
}
