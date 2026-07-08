package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C01GW;
import X.C0IJT;
import X.C0T0G;
import X.C13LE;
import X.C14EU;
import X.C188K;
import X.C188P;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C1ACA;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C474500IjA;
import X.C786410Ut5;
import X.C999400c78;
import X.EnumC494740Jai;
import X.EnumC999300c6y;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.FypRecommendInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public abstract class BaseEcLiveFeedCardWidget extends AbsLivePreviewBottomCardWidget {
    public static final EnumC999300c6y LLJJ = EnumC999300c6y.EC_LIVE_FEED_CARD;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C188P(this));
    public C188K LLJILJIL;
    public final C01GW LLJILJILJ;
    public boolean LLJILLL;

    public BaseEcLiveFeedCardWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJILJILJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new C999400c78(c19719912DlLIZ), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void E1() {
        this.LL = true;
        C1ACA c1acaZ1 = z1();
        if (O1(c1acaZ1 != null ? c1acaZ1.LIZJ : null) && this.LLJILLL) {
            U1(true);
        }
    }

    public JSONObject N1() {
        return null;
    }

    public abstract boolean O1(LiveRoomStruct liveRoomStruct);

    public abstract FrameLayout P1();

    public abstract void Q1();

    public abstract String T1();

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget, com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final FrameLayout R1() {
        return (FrameLayout) this.LLJIJIL.getValue();
    }

    public final FeedLiveViewHolderVM S1() {
        return (FeedLiveViewHolderVM) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C188K c188k = this.LLJILJIL;
        if (c188k != null) {
            c188k.destroy();
        }
        this.LLJILJIL = null;
        this.LLJILLL = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        FeedLiveViewHolderVM feedLiveViewHolderVMS1;
        MutableLiveData<String> mutableLiveData;
        C1ACA c1acaZ1 = z1();
        if (!O1(c1acaZ1 != null ? c1acaZ1.LIZJ : null) || (feedLiveViewHolderVMS1 = S1()) == null || (mutableLiveData = feedLiveViewHolderVMS1.LLLF) == null) {
            return;
        }
        mutableLiveData.setValue(null);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        FeedLiveViewHolderVM feedLiveViewHolderVMS1;
        MutableLiveData<String> mutableLiveData;
        C1ACA c1acaZ1 = z1();
        if (!O1(c1acaZ1 != null ? c1acaZ1.LIZJ : null) || (feedLiveViewHolderVMS1 = S1()) == null || (mutableLiveData = feedLiveViewHolderVMS1.LLLF) == null) {
            return;
        }
        mutableLiveData.setValue(null);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        MutableLiveData<Integer> mutableLiveData;
        C1ACA c1acaZ1 = z1();
        if (O1(c1acaZ1 != null ? c1acaZ1.LIZJ : null)) {
            C786410Ut5.LJZ(8, R1());
            C188K c188k = this.LLJILJIL;
            if (c188k != null) {
                FeedLiveViewHolderVM feedLiveViewHolderVMS1 = S1();
                if (feedLiveViewHolderVMS1 != null && (mutableLiveData = feedLiveViewHolderVMS1.LLJLLIL) != null) {
                    mutableLiveData.setValue(-1);
                }
                c188k.destroy();
            }
            this.LLJILJIL = null;
            this.LLJILLL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        LiveRoomStruct liveRoomStruct;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            liveRoomStruct = c1acaZ1.LIZJ;
        } else {
            liveRoomStruct = null;
        }
        if (O1(liveRoomStruct)) {
            U1(false);
        }
    }

    public final void U1(boolean z) {
        C1ACA c1acaZ1;
        Aweme aweme;
        C1ACA c1acaZ12;
        LiveRoomStruct liveRoomStruct;
        Object objValueOf;
        int displayStyle;
        C1ACA c1acaZ13;
        String str;
        Pair<Boolean, List<String>> pairLJJIL = ((IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class)).LJJIL();
        if (pairLJJIL.getFirst().booleanValue() && ((c1acaZ13 = z1()) == null || (str = c1acaZ13.LIZLLL) == null || !pairLJJIL.getSecond().contains(str))) {
            return;
        }
        C1ACA c1acaZ14 = z1();
        boolean z2 = true;
        if (c1acaZ14 != null && c1acaZ14.LJFF && (c1acaZ1 = z1()) != null && (aweme = c1acaZ1.LIZIZ) != null && (c1acaZ12 = z1()) != null && (liveRoomStruct = c1acaZ12.LIZJ) != null) {
            String strT1 = T1();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("liveHolderSelected, isAd = ");
            sbLIZ.append(aweme.isAd());
            sbLIZ.append(" , hasCommerceGoods = ");
            sbLIZ.append(liveRoomStruct.hasCommerceGoods);
            sbLIZ.append(" , commercePermission = ");
            sbLIZ.append(liveRoomStruct.commercePermission);
            C20441214yg.LIZIZ(strT1, C2188811AlT.LIZIZ(sbLIZ));
            boolean zIsAd = aweme.isAd();
            C474500IjA c474500IjALIZJ = C0IJT.LIZJ("tiktokec_rd_ec_live_room_filter");
            c474500IjALIZJ.LJJII(liveRoomStruct.idStr, "room_id");
            c474500IjALIZJ.LJJII(Integer.valueOf(zIsAd ? 1 : 0), "is_ad");
            FypRecommendInfo ecommerceFypRecommendInfo = liveRoomStruct.getEcommerceFypRecommendInfo();
            if (ecommerceFypRecommendInfo != null) {
                objValueOf = Long.valueOf(ecommerceFypRecommendInfo.getDisplayProductId());
            } else {
                objValueOf = "";
            }
            c474500IjALIZJ.LJJII(objValueOf, "display_product_id");
            c474500IjALIZJ.LJJII(Integer.valueOf(liveRoomStruct.hasCommerceGoods ? 1 : 0), "has_commerce_goods");
            c474500IjALIZJ.LJJII(Integer.valueOf(liveRoomStruct.commercePermission), "commerce_permission");
            FypRecommendInfo ecommerceFypRecommendInfo2 = liveRoomStruct.getEcommerceFypRecommendInfo();
            if (ecommerceFypRecommendInfo2 != null) {
                displayStyle = ecommerceFypRecommendInfo2.getDisplayStyle();
            } else {
                displayStyle = -1;
            }
            c474500IjALIZJ.LJJII(Integer.valueOf(displayStyle), "display_style");
            if (!aweme.isAd() && liveRoomStruct.hasCommerceGoods && liveRoomStruct.commercePermission > 0) {
                Q1();
                String strT12 = T1();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("liveHolderSelected, ecLiveProductCard create success =  ");
                if (this.LLJILJIL == null) {
                    z2 = false;
                }
                sbLIZ2.append(z2);
                C20441214yg.LJIIIZ(strT12, C2188811AlT.LIZIZ(sbLIZ2));
                C188K c188k = this.LLJILJIL;
                if (c188k != null) {
                    C786410Ut5.LJZ(0, R1());
                    V1(c188k, z);
                    return;
                }
                return;
            }
        }
        C20441214yg.LIZIZ(T1(), "liveHolderSelected, isEcLiveRoom = false");
    }

    @C14EU
    public final void onEvent(C0T0G c0t0g) {
        C20441214yg.LJIIIZ(T1(), "LiveEnterRoomEvent");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        NextLiveData<Integer> nextLiveData;
        super.onLoad(objArr);
        FeedLiveViewHolderVM feedLiveViewHolderVMS1 = S1();
        if (feedLiveViewHolderVMS1 != null && (nextLiveData = feedLiveViewHolderVMS1.LLJJJJJIL) != null) {
            nextLiveData.observe(this, new Observer() { // from class: X.188O
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    BaseEcLiveFeedCardWidget baseEcLiveFeedCardWidget = this.LL;
                    baseEcLiveFeedCardWidget.LLJILLL = true;
                    C188K c188k = baseEcLiveFeedCardWidget.LLJILJIL;
                    if (c188k != null) {
                        c188k.LJFF();
                    }
                    String strT1 = this.LL.T1();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("openLive ");
                    sbLIZ.append(this.LL.LLJILLL);
                    C20441214yg.LIZIZ(strT1, C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        }
    }

    public void V1(C188K c188k, boolean z) {
        LiveRoomStruct liveRoomStruct;
        String requestId;
        String str;
        long delayShowTime;
        boolean zOptBoolean;
        Aweme aweme;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null) {
            Context context = this.context;
            boolean zLIZ = C19252910Tv.LIZIZ.LIZLLL().LJFF().LIZ();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1ACA c1acaZ12 = z1();
            String str2 = null;
            if (c1acaZ12 != null && (aweme = c1acaZ12.LIZIZ) != null) {
                requestId = aweme.getRequestId();
            } else {
                requestId = null;
            }
            linkedHashMap.put("request_id", requestId);
            FypRecommendInfo ecommerceFypRecommendInfo = liveRoomStruct.getEcommerceFypRecommendInfo();
            if (ecommerceFypRecommendInfo != null) {
                str = ecommerceFypRecommendInfo.origin;
            } else {
                str = null;
            }
            FypRecommendInfo ecommerceFypRecommendInfo2 = liveRoomStruct.getEcommerceFypRecommendInfo();
            long jOptLong = 0;
            if (ecommerceFypRecommendInfo2 != null) {
                delayShowTime = ecommerceFypRecommendInfo2.getDelayShowTime();
            } else {
                delayShowTime = 0;
            }
            JSONObject jSONObjectN1 = N1();
            if (jSONObjectN1 != null) {
                zOptBoolean = jSONObjectN1.optBoolean("is_target_room");
            } else {
                zOptBoolean = false;
            }
            JSONObject jSONObjectN12 = N1();
            if (jSONObjectN12 != null) {
                jOptLong = jSONObjectN12.optLong("fc_endtime");
            }
            Long lValueOf = Long.valueOf(jOptLong);
            C1ACA c1acaZ13 = z1();
            if (c1acaZ13 != null) {
                str2 = c1acaZ13.LIZLLL;
            }
            c188k.LIZIZ(liveRoomStruct, context, zLIZ, linkedHashMap, str, delayShowTime, z, zOptBoolean, lValueOf, str2);
        }
    }
}
