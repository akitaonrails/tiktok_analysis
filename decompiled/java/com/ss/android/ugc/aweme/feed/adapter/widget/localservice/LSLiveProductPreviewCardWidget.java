package com.ss.android.ugc.aweme.feed.adapter.widget.localservice;

import X.C01GW;
import X.C13LE;
import X.C1887800zE2;
import X.C188U;
import X.C19719912Dl;
import X.C1ACA;
import X.C20684815ws;
import X.C452501pT;
import X.EnumC494740Jai;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.live.ILSLiveFeedService;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS646S0100000_32;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class LSLiveProductPreviewCardWidget extends AbsLivePreviewBottomCardWidget {
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 193));
    public final C01GW LLJILJIL;
    public C188U LLJILJILJ;

    public LSLiveProductPreviewCardWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJILJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new AwS576S0100000_32(c19719912DlLIZ, 194), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget, com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final FeedLiveViewHolderVM N1() {
        return (FeedLiveViewHolderVM) this.LLJILJIL.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        MutableLiveData<Integer> mutableLiveData;
        C188U c188u = this.LLJILJILJ;
        if (c188u != null) {
            c188u.onDestroy();
        }
        this.LLJILJILJ = null;
        FeedLiveViewHolderVM feedLiveViewHolderVMN1 = N1();
        if (feedLiveViewHolderVMN1 == null || (mutableLiveData = feedLiveViewHolderVMN1.LLJLLL) == null) {
            return;
        }
        mutableLiveData.setValue(-1);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        MutableLiveData<Integer> mutableLiveData;
        super.L1();
        C188U c188u = this.LLJILJILJ;
        if (c188u != null) {
            c188u.LIZIZ();
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMN1 = N1();
        if (feedLiveViewHolderVMN1 == null || (mutableLiveData = feedLiveViewHolderVMN1.LLJLLL) == null) {
            return;
        }
        mutableLiveData.setValue(-1);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) throws JSONException {
        C1ACA c1acaZ1;
        LiveRoomStruct liveRoomStruct;
        String str;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        String string;
        LiveRoomStruct liveRoomStruct4;
        String str2;
        LiveRoomStruct liveRoomStruct5;
        String string2;
        LiveRoomStruct liveRoomStruct6;
        LiveRoomStruct liveRoomStruct7;
        C1ACA c1acaZ12 = z1();
        if ((c1acaZ12 != null && (liveRoomStruct7 = c1acaZ12.LIZJ) != null && liveRoomStruct7.hasTtlsLivePermission) || ((c1acaZ1 = z1()) != null && (liveRoomStruct = c1acaZ1.LIZJ) != null && liveRoomStruct.existedTtlsGoods)) {
            String str3 = null;
            ILSLiveFeedService iLSLiveFeedService = (ILSLiveFeedService) PluggableExtentionKt.pluggableSpi$default(ILSLiveFeedService.class, false, false, false, 14, null);
            String str4 = "";
            if (iLSLiveFeedService == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("step", "StepPluggableSpiFailed");
                C1ACA c1acaZ13 = z1();
                if (c1acaZ13 == null || (liveRoomStruct6 = c1acaZ13.LIZJ) == null || (str2 = liveRoomStruct6.idStr) == null) {
                    str2 = "";
                }
                jSONObject.put("room_id", str2);
                C1ACA c1acaZ14 = z1();
                if (c1acaZ14 != null && (liveRoomStruct5 = c1acaZ14.LIZJ) != null && (string2 = Long.valueOf(liveRoomStruct5.getAnchorId()).toString()) != null) {
                    str4 = string2;
                }
                jSONObject.put("anchor_id", str4);
                C20684815ws.LJIJ("ttls_rd_live_preview_pin_card_step_event", jSONObject);
                return;
            }
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            FeedLiveViewHolderVM feedLiveViewHolderVMN1 = N1();
            Aweme aweme = null;
            if (feedLiveViewHolderVMN1 != null) {
                str3 = feedLiveViewHolderVMN1.LLLIIIL;
            }
            PageFinder pageFinderVia = PageFinder.via(str3);
            BcmParams bcmParams = new BcmParams();
            C1ACA c1acaZ15 = z1();
            if (c1acaZ15 == null || (liveRoomStruct4 = c1acaZ15.LIZJ) == null || (str = liveRoomStruct4.idStr) == null) {
                str = "";
            }
            bcmParams.put("ttls_room_id", str);
            C1ACA c1acaZ16 = z1();
            if (c1acaZ16 != null && (liveRoomStruct3 = c1acaZ16.LIZJ) != null && (string = Long.valueOf(liveRoomStruct3.getAnchorId()).toString()) != null) {
                str4 = string;
            }
            bcmParams.put("ttls_live_author_id", str4);
            btmSDK.setBcmPageParams(pageFinderVia, bcmParams, Boolean.FALSE);
            if (this.LLJILJILJ == null) {
                C1887800zE2 c1887800zE2LIZ = iLSLiveFeedService.LIZ();
                c1887800zE2LIZ.LIZ = (FrameLayout) this.LLJIJIL.getValue();
                c1887800zE2LIZ.LIZIZ = new AwS646S0100000_32(this, 12);
                c1887800zE2LIZ.LIZJ = new AwS576S0100000_32(this, 190);
                c1887800zE2LIZ.LIZLLL = new AwS576S0100000_32(this, 191);
                c1887800zE2LIZ.LJ = new AwS576S0100000_32(this, 192);
                this.LLJILJILJ = c1887800zE2LIZ.LIZ();
            }
            C188U c188u = this.LLJILJILJ;
            if (c188u != null) {
                C1ACA c1acaZ17 = z1();
                if (c1acaZ17 != null) {
                    liveRoomStruct2 = c1acaZ17.LIZJ;
                } else {
                    liveRoomStruct2 = null;
                }
                C1ACA c1acaZ18 = z1();
                if (c1acaZ18 != null) {
                    aweme = c1acaZ18.LIZIZ;
                }
                c188u.LIZ(aweme, liveRoomStruct2);
            }
        }
    }
}
