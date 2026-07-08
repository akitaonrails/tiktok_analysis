package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C183F;
import X.C188I;
import X.C188K;
import X.C19252910Tv;
import X.C20441214yg;
import X.C2188811AlT;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget;
import com.ss.android.ugc.aweme.feed.model.live.FYPCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.live.FypRecommendInfo;
import com.ss.android.ugc.aweme.feed.model.live.GoLiveCardTargetRoomInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.OecLivePreviewRoomData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class EcLiveFeedCardWidgetV1 extends BaseEcLiveFeedCardWidget {
    public boolean LLJJI;
    public long LLJJIII;
    public final String LLJJIJI = "EcLiveFeedCardWidgetV1";

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget, com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget, com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget
    public final JSONObject N1() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_target_room", this.LLJJI);
        jSONObject.put("fc_endtime", this.LLJJIII);
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.188L] */
    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget
    public final void Q1() {
        C188K c188kBuild;
        C188K c188k = this.LLJILJIL;
        if (c188k == null || c188k.isDestroyed()) {
            C188I c188iLJJIJ = ((IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class)).LJJIJ();
            if (c188iLJJIJ != 0) {
                c188iLJJIJ.LIZLLL(new AwS611S0100000_32(this, 73));
                c188iLJJIJ.LIZ(new C183F() { // from class: X.188L
                    @Override // X.C183F
                    public final void LIZIZ() {
                    }

                    @Override // X.C183F
                    public final void LIZ() {
                        MutableLiveData<Integer> mutableLiveData;
                        String strLIZLLL;
                        FeedLiveViewHolderVM feedLiveViewHolderVMS1;
                        MutableLiveData<String> mutableLiveData2;
                        C188K c188k2 = this.LIZ.LLJILJIL;
                        if (c188k2 != null && (strLIZLLL = c188k2.LIZLLL()) != null && (feedLiveViewHolderVMS1 = this.LIZ.S1()) != null && (mutableLiveData2 = feedLiveViewHolderVMS1.LLLF) != null) {
                            mutableLiveData2.setValue(strLIZLLL);
                        }
                        FeedLiveViewHolderVM feedLiveViewHolderVMS12 = this.LIZ.S1();
                        if (feedLiveViewHolderVMS12 == null || (mutableLiveData = feedLiveViewHolderVMS12.LLJLLIL) == null) {
                            return;
                        }
                        mutableLiveData.setValue(2);
                    }

                    @Override // X.C183F
                    public final void onDismiss() {
                        Set<EnumC999300c6y> set;
                        MutableLiveData<Integer> mutableLiveData;
                        C20441214yg.LIZIZ(this.LIZ.LLJJIJI, "product card dismiss");
                        C786410Ut5.LJZ(8, this.LIZ.R1());
                        FeedLiveViewHolderVM feedLiveViewHolderVMS1 = this.LIZ.S1();
                        if (feedLiveViewHolderVMS1 != null && (mutableLiveData = feedLiveViewHolderVMS1.LLJLLIL) != null) {
                            mutableLiveData.setValue(0);
                        }
                        C1ACA c1acaZ1 = this.LIZ.z1();
                        if (c1acaZ1 == null || (set = c1acaZ1.LJLJL) == null) {
                            return;
                        }
                        EnumC999300c6y enumC999300c6y = BaseEcLiveFeedCardWidget.LLJJ;
                        set.remove(BaseEcLiveFeedCardWidget.LLJJ);
                    }

                    @Override // X.C183F
                    public final void onShow() {
                        MutableLiveData<Boolean> mutableLiveData;
                        Set<EnumC999300c6y> set;
                        MutableLiveData<Boolean> mutableLiveData2;
                        MutableLiveData<Boolean> mutableLiveData3;
                        C188K c188k2 = this.LIZ.LLJILJIL;
                        if (c188k2 == null || !c188k2.LJII()) {
                            FeedLiveViewHolderVM feedLiveViewHolderVMS1 = this.LIZ.S1();
                            if (feedLiveViewHolderVMS1 != null && (mutableLiveData = feedLiveViewHolderVMS1.LLL) != null) {
                                mutableLiveData.setValue(Boolean.FALSE);
                            }
                        } else {
                            FeedLiveViewHolderVM feedLiveViewHolderVMS12 = this.LIZ.S1();
                            if (feedLiveViewHolderVMS12 != null && (mutableLiveData3 = feedLiveViewHolderVMS12.LLL) != null) {
                                mutableLiveData3.setValue(Boolean.TRUE);
                            }
                        }
                        C786410Ut5.LJZ(0, this.LIZ.R1());
                        FeedLiveViewHolderVM feedLiveViewHolderVMS13 = this.LIZ.S1();
                        if (feedLiveViewHolderVMS13 != null && (mutableLiveData2 = feedLiveViewHolderVMS13.LLJZIJLIL) != null) {
                            mutableLiveData2.setValue(Boolean.TRUE);
                        }
                        C20441214yg.LIZIZ(this.LIZ.LLJJIJI, "product card show");
                        C999370c75 c999370c75 = C999370c75.LIZ;
                        EnumC999300c6y enumC999300c6y = BaseEcLiveFeedCardWidget.LLJJ;
                        C1ACA c1acaZ1 = this.LIZ.z1();
                        c999370c75.getClass();
                        C999370c75.LIZLLL(enumC999300c6y, c1acaZ1);
                        C1ACA c1acaZ12 = this.LIZ.z1();
                        if (c1acaZ12 == null || (set = c1acaZ12.LJLJL) == null) {
                            return;
                        }
                        set.add(enumC999300c6y);
                    }
                });
                c188iLJJIJ.LIZJ(R1());
                c188iLJJIJ.LIZIZ(1);
                c188kBuild = c188iLJJIJ.build();
            } else {
                c188kBuild = null;
            }
            this.LLJILJIL = c188kBuild;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget
    public final FrameLayout P1() {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mwu);
        C19252910Tv.LIZIZ.LIZLLL().LJFF().LIZIZ(frameLayout);
        return frameLayout;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget
    public final String T1() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget
    public final boolean O1(LiveRoomStruct liveRoomStruct) {
        Long lValueOf;
        long jLJJIJIIJI;
        FYPCommerceStruct fYPCommerceStruct;
        OecLivePreviewRoomData oecLivePreviewRoomDataObject;
        GoLiveCardTargetRoomInfo goLiveCardTargetRoomInfo;
        FypRecommendInfo ecommerceFypRecommendInfo;
        FypRecommendInfo ecommerceFypRecommendInfo2;
        if (liveRoomStruct != null && (ecommerceFypRecommendInfo2 = liveRoomStruct.getEcommerceFypRecommendInfo()) != null) {
            ecommerceFypRecommendInfo2.setDisplayStyle(1);
        }
        IEcommerceLiveService iEcommerceLiveService = (IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class);
        String str = this.LLJJIJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkShowParams: preview card can show? ");
        if (liveRoomStruct != null && (ecommerceFypRecommendInfo = liveRoomStruct.getEcommerceFypRecommendInfo()) != null) {
            lValueOf = Long.valueOf(ecommerceFypRecommendInfo.getDisplayProductId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(';');
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (liveRoomStruct != null && (fYPCommerceStruct = liveRoomStruct.fypCommerceStruct) != null && (oecLivePreviewRoomDataObject = fYPCommerceStruct.getOecLivePreviewRoomDataObject()) != null && (goLiveCardTargetRoomInfo = oecLivePreviewRoomDataObject.goLiveCardTargetRoomInfo) != null) {
            this.LLJJI = Intrinsics.LJFF(goLiveCardTargetRoomInfo.enableGoLiveCard, Boolean.TRUE);
        } else {
            this.LLJJI = false;
        }
        if (iEcommerceLiveService != null) {
            jLJJIJIIJI = iEcommerceLiveService.LJJIJIIJI();
        } else {
            jLJJIJIIJI = 0;
        }
        this.LLJJIII = jLJJIJIIJI;
        return true;
    }
}
