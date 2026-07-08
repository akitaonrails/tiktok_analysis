package com.ss.android.ugc.aweme.feed.adapter.widget.ad;

import X.C1ACA;
import X.InterfaceC999040c6Y;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseAdSlotLiveWidget extends AbsLivePreviewBottomCardWidget {
    public abstract InterfaceC999040c6Y N1();

    public abstract ViewGroup O1();

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget, com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        InterfaceC999040c6Y interfaceC999040c6YN1 = N1();
        if (interfaceC999040c6YN1 != null) {
            Context context = this.context;
            C1ACA c1acaZ1 = z1();
            Aweme aweme = c1acaZ1 != null ? c1acaZ1.LIZIZ : null;
            C1ACA c1acaZ12 = z1();
            interfaceC999040c6YN1.LJJIJIL(context, aweme, c1acaZ12 != null ? c1acaZ12.LJ : null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        InterfaceC999040c6Y interfaceC999040c6YN1 = N1();
        if (interfaceC999040c6YN1 != null) {
            interfaceC999040c6YN1.onUnbind();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void J1() {
        InterfaceC999040c6Y interfaceC999040c6YN1 = N1();
        if (interfaceC999040c6YN1 != null) {
            interfaceC999040c6YN1.LIZ(O1());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        Aweme aweme;
        super.L1();
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 == null || (aweme = c1acaZ1.LIZIZ) == null || !AwemeExtKt.isAdTraffic(aweme)) {
            return;
        }
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIIL(hashCode());
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        InterfaceC999040c6Y interfaceC999040c6YN1 = N1();
        if (interfaceC999040c6YN1 != null) {
            interfaceC999040c6YN1.LJJIIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        Aweme aweme;
        super.LJJIJIIJIL(i);
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (aweme = c1acaZ1.LIZIZ) != null && AwemeExtKt.isAdTraffic(aweme)) {
            ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIIZ(hashCode(), aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
    }
}
