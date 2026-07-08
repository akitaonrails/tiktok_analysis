package com.ss.android.ugc.aweme.feed.adapter.widget.ad;

import X.C01GW;
import X.C452501pT;
import X.InterfaceC999040c6Y;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdAboveSponsorSlotLiveWidget extends BaseAdSlotLiveWidget {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(179));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.der;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.ad.BaseAdSlotLiveWidget, com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget, com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.ad.BaseAdSlotLiveWidget
    public final InterfaceC999040c6Y N1() {
        return (InterfaceC999040c6Y) this.LLJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.ad.BaseAdSlotLiveWidget
    public final ViewGroup O1() {
        return (ViewGroup) findViewById(R.id.a6z);
    }
}
