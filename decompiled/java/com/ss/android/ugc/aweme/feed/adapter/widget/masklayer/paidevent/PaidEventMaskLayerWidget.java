package com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.paidevent;

import X.C01GW;
import X.C0C64;
import X.C12ES;
import X.C13LE;
import X.C14LC;
import X.C1610740s1A;
import X.C1610770s1D;
import X.C197039127h;
import X.C19719912Dl;
import X.C1ACA;
import X.C309690CBz;
import X.C424620Gku;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC1610470s0j;
import X.EnumC494740Jai;
import Y.ACListenerS167S0100000_33;
import Y.AObserverS235S0100000_33;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes34.dex */
public final class PaidEventMaskLayerWidget extends LiveWatchPreviewWidget {
    public final String LLJ;
    public C1610740s1A LLJI;
    public C1610770s1D LLJIJIL;
    public C424620Gku LLJILJIL;
    public RemoteImageView LLJILJILJ;
    public C197039127h LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    public PaidEventMaskLayerWidget() {
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "iap_merchant_id_live_event", "80LRFZB70401", true);
        this.LLJ = strLJJ != null ? strLJJ : "80LRFZB70401";
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(c19719912DlLIZ, 195);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJJIII = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS576S0100000_32, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LivePreviewPlayerVM.class);
        this.LLJJIJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS576S0100000_32(c19719912DlLIZ2, 196), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dfc;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final void N1() {
        if (isInitialized()) {
            super.hide();
            C1ACA c1acaZ1 = z1();
            if (c1acaZ1 != null) {
                c1acaZ1.LJJIFFI = false;
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M1(boolean r12) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.paidevent.PaidEventMaskLayerWidget.M1(boolean):void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C500260Jjc.LJLJLJ(this.contentView, true);
        this.LLJILJIL = (C424620Gku) findViewById(R.id.q0o);
        this.LLJIJIL = (C1610770s1D) findViewById(R.id.q0q);
        this.LLJILJILJ = (RemoteImageView) findViewById(R.id.q0r);
        this.LLJJ = (TuxTextView) findViewById(R.id.f756muk);
        this.LLJILLL = (C197039127h) findViewById(R.id.hu6);
        this.LLJJI = (TuxTextView) findViewById(R.id.muj);
        EnumC1610470s0j enumC1610470s0j = EnumC1610470s0j.SKYLIGHT;
        C424620Gku c424620Gku = this.LLJILJIL;
        this.LLJI = new C1610740s1A(enumC1610470s0j, c424620Gku, c424620Gku, this.LLJIJIL);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        NextLiveData<Unit> nextLiveData;
        super.onLoad(objArr);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.1AAX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }, this.contentView);
        C424620Gku c424620Gku = this.LLJILJIL;
        if (c424620Gku != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c424620Gku.getLayoutParams();
            boolean z = C14LC.LJIIIZ;
            C309690CBz.LIZ.getClass();
            marginLayoutParams.setMargins(0, (int) (((double) C12ES.LJIIIIZZ(this.context)) * 0.3d), 0, 0);
            C786410Ut5.D9(c424620Gku, new ACListenerS167S0100000_33(this, 47));
        }
        C1610740s1A c1610740s1A = this.LLJI;
        if (c1610740s1A != null) {
            c1610740s1A.LJIIIZ();
        }
        C197039127h c197039127h = this.LLJILLL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS167S0100000_33(this, 48));
        }
        M1(true);
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJJIII.getValue();
        if (feedLiveViewHolderVM != null && (nextLiveData = feedLiveViewHolderVM.LLJJLIIIJLLLLLLLZ) != null) {
            nextLiveData.observe(this, new AObserverS235S0100000_33(this, 25));
        }
    }
}
