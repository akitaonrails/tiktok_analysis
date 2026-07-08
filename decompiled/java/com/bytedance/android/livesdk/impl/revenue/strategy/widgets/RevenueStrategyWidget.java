package com.bytedance.android.livesdk.impl.revenue.strategy.widgets;

import X.C09R7;
import X.C0IJ7;
import X.C0IJT;
import X.C0IL2;
import X.C1124400fMk;
import X.C1134320fck;
import X.C1134860fdc;
import X.C1161920gLG;
import X.C13LE;
import X.C474500IjA;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.api.coin.incentive.ICoinIncentiveService;
import com.bytedance.android.livesdk.impl.revenue.strategy.bubble.TouchPointBubbleWidget;
import com.bytedance.android.livesdk.impl.revenue.strategy.guide.GuideTriggerWidget;
import com.bytedance.android.livesdk.impl.revenue.strategy.incentive.IncentiveTaskWidgetV2;
import com.bytedance.android.livesdk.impl.revenue.strategy.ugtask.UgTaskWidgetV2;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class RevenueStrategyWidget extends LiveRecyclableWidget {
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C1134320fck.LIZ.getClass();
        C1134320fck.LIZIZ.clear();
        C1134860fdc c1134860fdc = C1134860fdc.LIZ;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_incentive_live_enter");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        C1134320fck.LIZ.getClass();
        String str = C0IL2.LIZ.LIZ().mEnterRoomConfig.mLogData.originalUri;
        if (str != null && (uri = UriProtector.parse(str)) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge")) != null && Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "ad_live_ug_task_outer")) {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_revenue_strategy_client_live_square");
            c474500IjALIZ2.LJJII(str, "msg_data");
            c474500IjALIZ2.LJJII("ug_push_api", "msg_type");
            c474500IjALIZ2.LIZ();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C1134320fck.LIZ.getClass();
        C1134320fck.LIZIZ.add(new C1124400fMk());
        enableSubWidgetManager(null, null, LiveWidgetProvider.Companion.getInstance(), C0IJ7.LIZLLL(this.context));
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        recyclableWidgetManager.load(new TouchPointBubbleWidget());
        recyclableWidgetManager.load(new GuideTriggerWidget());
        this.subWidgetManager.load(recyclableWidgetManager.getRecyclableWidgetFromCacheOrNew(C09R7.LIZ(C13LE.LIZ(UgTaskWidgetV2.class)), null, new AwS561S0100000_17(AFwS205S0000000_17.get$arr$(162), 355)));
        this.subWidgetManager.load(new IncentiveTaskWidgetV2());
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isCoin()) {
            RecyclableWidgetManager recyclableWidgetManager2 = this.subWidgetManager;
            ((ICoinIncentiveService) C1161920gLG.LIZJ(ICoinIncentiveService.class)).dJ1();
            recyclableWidgetManager2.load((Widget) null);
        }
        C1134860fdc c1134860fdc = C1134860fdc.LIZ;
    }
}
