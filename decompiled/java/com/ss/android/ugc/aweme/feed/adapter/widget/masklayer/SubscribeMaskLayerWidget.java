package com.ss.android.ugc.aweme.feed.adapter.widget.masklayer;

import X.C01GW;
import X.C12ES;
import X.C13LE;
import X.C1610740s1A;
import X.C1610770s1D;
import X.C16F5;
import X.C197039127h;
import X.C19719912Dl;
import X.C1ACA;
import X.C20684815ws;
import X.C2344009Gk;
import X.C424620Gku;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC1610470s0j;
import X.EnumC494740Jai;
import Y.ACListenerS142S0100000_7;
import Y.AObserverS211S0100000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscribeMaskLayerWidget extends LiveWatchPreviewWidget {
    public C1610740s1A LLJ;
    public C1610770s1D LLJI;
    public C424620Gku LLJIJIL;
    public RemoteImageView LLJILJIL;
    public C197039127h LLJILJILJ;
    public C16F5 LLJILLL;
    public C16F5 LLJJ;
    public boolean LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    public SubscribeMaskLayerWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 159);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJJIII = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS551S0100000_7, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LivePreviewPlayerVM.class);
        this.LLJJIJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS551S0100000_7(c19719912DlLIZ2, 160), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dhy;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void M1() {
        Aweme aweme;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        User user;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1ACA c1acaZ1 = z1();
        String requestId = null;
        c2344009Gk.LJIIIIZZ("enter_from_merge", c1acaZ1 != null ? c1acaZ1.LIZLLL : null);
        c2344009Gk.LJIIIIZZ("action_type", "click");
        C1ACA c1acaZ12 = z1();
        c2344009Gk.LJIIIIZZ("anchor_id", (c1acaZ12 == null || (liveRoomStruct2 = c1acaZ12.LIZJ) == null || (user = liveRoomStruct2.owner) == null) ? null : user.getUid());
        C1ACA c1acaZ13 = z1();
        c2344009Gk.LJ((c1acaZ13 == null || (liveRoomStruct = c1acaZ13.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct.id), "room_id");
        C1ACA c1acaZ14 = z1();
        if (c1acaZ14 != null && (aweme = c1acaZ14.LIZIZ) != null) {
            requestId = aweme.getRequestId();
        }
        c2344009Gk.LJIIIIZZ("request_id", requestId);
        c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
        c2344009Gk.LJIIIIZZ("show_entrance", "sub_only_preview_layer");
        C20684815ws.LJIILLIIL("livesdk_subscribe_icon_show", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void E1() {
        LivePreviewPlayerVM livePreviewPlayerVM;
        if (!isShowing() || (livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLJJIJI.getValue()) == null) {
            return;
        }
        livePreviewPlayerVM.wQ2(null, true);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        if (isInitialized()) {
            hide();
            C1ACA c1acaZ1 = z1();
            if (c1acaZ1 != null) {
                c1acaZ1.LJJI = false;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        if (isInitialized()) {
            hide();
            C1ACA c1acaZ1 = z1();
            if (c1acaZ1 != null) {
                c1acaZ1.LJJI = false;
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C500260Jjc.LJLJLJ(this.contentView, true);
        this.LLJIJIL = (C424620Gku) findViewById(R.id.wia);
        this.LLJI = (C1610770s1D) findViewById(R.id.wib);
        this.LLJILJIL = (RemoteImageView) findViewById(R.id.wie);
        this.LLJILLL = (C16F5) findViewById(R.id.mun);
        this.LLJILJILJ = (C197039127h) findViewById(R.id.hu6);
        this.LLJJ = (C16F5) findViewById(R.id.mum);
        findViewById(R.id.p8q);
        EnumC1610470s0j enumC1610470s0j = EnumC1610470s0j.SKYLIGHT;
        C424620Gku c424620Gku = this.LLJIJIL;
        this.LLJ = new C1610740s1A(enumC1610470s0j, c424620Gku, c424620Gku, this.LLJI);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        NextLiveData<Unit> nextLiveData;
        super.onLoad(objArr);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0KAv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }, this.contentView);
        C424620Gku c424620Gku = this.LLJIJIL;
        if (c424620Gku != null) {
            ((ViewGroup.MarginLayoutParams) c424620Gku.getLayoutParams()).setMargins(0, ((int) (((double) C12ES.LJIIIIZZ(this.context)) * 0.3d)) - C12ES.LJIIJJI(this.context), 0, 0);
        }
        C1610740s1A c1610740s1A = this.LLJ;
        if (c1610740s1A != null) {
            c1610740s1A.LJIIIZ();
        }
        C197039127h c197039127h = this.LLJILJILJ;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS142S0100000_7(this, 132));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJJIII.getValue();
        if (feedLiveViewHolderVM != null && (nextLiveData = feedLiveViewHolderVM.LLJJLIIIJLLLLLLLZ) != null) {
            nextLiveData.observe(this, new AObserverS211S0100000_7(this, 16));
        }
    }
}
