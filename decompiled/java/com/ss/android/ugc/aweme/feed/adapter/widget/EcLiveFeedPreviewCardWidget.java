package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C01GW;
import X.C1022820ciu;
import X.C13LE;
import X.C19719912Dl;
import X.C1ACA;
import X.C2184171Adz;
import X.C339190DRl;
import X.C452501pT;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C998720c62;
import X.C998800c6A;
import X.C999270c6v;
import X.C999370c75;
import X.EnumC494740Jai;
import X.EnumC999300c6y;
import X.InterfaceC999030c6X;
import Y.ACListenerS119S0200000_16;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.FYPCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.OecLivePreviewRoomData;
import com.ss.android.ugc.aweme.feed.model.live.PreviewPromotionInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public final class EcLiveFeedPreviewCardWidget extends LiveWatchPreviewWidget {
    public static final C999270c6v LLJIJIL = new C999270c6v();
    public static final EnumC999300c6y LLJILJIL = EnumC999300c6y.EC_PREVIEW_CARD_INFO;
    public static final String LLJILJILJ = "EcLiveFeedPreviewCardWidget";
    public final C01GW LLJ;
    public final C01GW LLJI;

    public EcLiveFeedPreviewCardWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new C998720c62(c19719912DlLIZ), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
        this.LLJI = C452501pT.LIZIZ(new C998800c6A(this));
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

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        LiveRoomStruct liveRoomStruct;
        InterfaceC999030c6X interfaceC999030c6XLJJIII;
        Set<EnumC999300c6y> set;
        C999270c6v c999270c6v = LLJIJIL;
        C1ACA c1acaZ1 = z1();
        c999270c6v.getClass();
        if (!C999270c6v.LIZ(c1acaZ1)) {
            C339190DRl.LIZIZ((View) this.LLJI.getValue());
            return;
        }
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 == null || (liveRoomStruct = c1acaZ12.LIZJ) == null) {
            return;
        }
        C786410Ut5.LJJJJIZL((FrameLayout) this.LLJI.getValue());
        IEcommerceLiveService iEcommerceLiveService = (IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class);
        if (iEcommerceLiveService == null || (interfaceC999030c6XLJJIII = iEcommerceLiveService.LJJIII()) == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.LLJI.getValue();
        new LinkedHashMap();
        interfaceC999030c6XLJJIII.LIZ(frameLayout, liveRoomStruct);
        C786410Ut5.O7((FrameLayout) this.LLJI.getValue(), new ACListenerS119S0200000_16(this, liveRoomStruct, 15));
        C999370c75 c999370c75 = C999370c75.LIZ;
        EnumC999300c6y enumC999300c6y = LLJILJIL;
        C1ACA c1acaZ13 = z1();
        c999370c75.getClass();
        C999370c75.LIZLLL(enumC999300c6y, c1acaZ13);
        C1ACA c1acaZ14 = z1();
        if (c1acaZ14 == null || (set = c1acaZ14.LJLJL) == null) {
            return;
        }
        set.add(enumC999300c6y);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        LiveRoomStruct liveRoomStruct;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        OecLivePreviewRoomData oecLivePreviewRoomDataObject;
        PreviewPromotionInfo previewPromotionInfo;
        Integer num;
        Aweme aweme2;
        super.LJJIJIIJIL(i);
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null && C500260Jjc.LJJJJIZL((View) this.LLJI.getValue())) {
            C1ACA c1acaZ12 = z1();
            int iIntValue = 0;
            if (c1acaZ12 != null && (aweme = c1acaZ12.LIZIZ) != null && aweme.isAd()) {
                C1ACA c1acaZ13 = z1();
                if (c1acaZ13 != null && (aweme2 = c1acaZ13.LIZIZ) != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", awemeRawAd);
                c1022820ciuLIZLLL.LIZJ("live_preview_card", "refer");
                FYPCommerceStruct fYPCommerceStruct = liveRoomStruct.fypCommerceStruct;
                if (fYPCommerceStruct != null && (oecLivePreviewRoomDataObject = fYPCommerceStruct.getOecLivePreviewRoomDataObject()) != null && (previewPromotionInfo = oecLivePreviewRoomDataObject.previewPromotionInfo) != null && (num = previewPromotionInfo.benefit) != null) {
                    iIntValue = num.intValue();
                }
                c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(iIntValue), "live_card_benefit");
                c1022820ciuLIZLLL.LJII();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
    }
}
