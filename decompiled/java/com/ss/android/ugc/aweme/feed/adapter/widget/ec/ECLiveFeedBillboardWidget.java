package com.ss.android.ugc.aweme.feed.adapter.widget.ec;

import X.C01GW;
import X.C0T3R;
import X.C1388190mED;
import X.C14EU;
import X.C1595720rcw;
import X.C1ACA;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C497740JfY;
import X.C497820Jfg;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1595830rd7;
import X.InterfaceC1611000s1a;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ec.ECLiveFeedBillboardWidget;
import com.ss.android.ugc.aweme.feed.model.live.FYPCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class ECLiveFeedBillboardWidget extends LiveWatchPreviewWidget {
    public boolean LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 376));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(136));
    public final C1595720rcw LLJILJIL = new InterfaceC1595830rd7() { // from class: X.0rcw
        @Override // X.InterfaceC1595830rd7
        public final void LIZ(boolean z) {
            if (z) {
                C500260Jjc.LJIILIIL(this.LIZ.M1());
                return;
            }
            ECLiveFeedBillboardWidget eCLiveFeedBillboardWidget = this.LIZ;
            if (!eCLiveFeedBillboardWidget.LLJ) {
                return;
            }
            C500260Jjc.LLFFF(eCLiveFeedBillboardWidget.M1());
        }
    };
    public InterfaceC1611000s1a LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        InterfaceC1611000s1a interfaceC1611000s1a = this.LLJILJILJ;
        if (interfaceC1611000s1a != null) {
            interfaceC1611000s1a.destroy();
        }
        this.LLJILJILJ = null;
    }

    public final FrameLayout M1() {
        return (FrameLayout) this.LLJI.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        InterfaceC1611000s1a interfaceC1611000s1a = this.LLJILJILJ;
        if (interfaceC1611000s1a != null) {
            interfaceC1611000s1a.destroy();
        }
        this.LLJILJILJ = null;
        this.LLJ = false;
        EventBus.LIZLLL().LJJI(this);
        StoryToolBarIconAbility storyToolBarIconAbility = (StoryToolBarIconAbility) this.LLJIJIL.getValue();
        if (storyToolBarIconAbility != null) {
            storyToolBarIconAbility.D51(this.LLJILJIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        boolean zBooleanValue;
        InterfaceC1611000s1a interfaceC1611000s1aLJJIJLIJ;
        LiveRoomStruct liveRoomStruct;
        FYPCommerceStruct fYPCommerceStruct;
        String oecLivePreviewRoomData;
        InterfaceC1611000s1a interfaceC1611000s1a;
        LiveRoomStruct liveRoomStruct2;
        FYPCommerceStruct fYPCommerceStruct2;
        String oecLivePreviewRoomData2;
        IEcommerceLiveService iEcommerceLiveService;
        Boolean boolValueOf;
        C1ACA c1acaZ1 = z1();
        LiveRoomStruct liveRoomStruct3 = null;
        if (c1acaZ1 != null && (liveRoomStruct2 = c1acaZ1.LIZJ) != null && (fYPCommerceStruct2 = liveRoomStruct2.fypCommerceStruct) != null && (oecLivePreviewRoomData2 = fYPCommerceStruct2.getOecLivePreviewRoomData()) != null && (iEcommerceLiveService = (IEcommerceLiveService) PluggableExtentionKt.pluggableSpi$default(IEcommerceLiveService.class, false, false, false, 14, null)) != null && (boolValueOf = Boolean.valueOf(iEcommerceLiveService.LJJIJIIJIL(oecLivePreviewRoomData2))) != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLJ = zBooleanValue;
        if (zBooleanValue) {
            IEcommerceLiveService iEcommerceLiveService2 = (IEcommerceLiveService) PluggableExtentionKt.pluggableSpi$default(IEcommerceLiveService.class, false, false, false, 14, null);
            if (iEcommerceLiveService2 != null) {
                interfaceC1611000s1aLJJIJLIJ = iEcommerceLiveService2.LJJIJLIJ();
            } else {
                interfaceC1611000s1aLJJIJLIJ = null;
            }
            this.LLJILJILJ = interfaceC1611000s1aLJJIJLIJ;
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 != null && (liveRoomStruct = c1acaZ12.LIZJ) != null && (fYPCommerceStruct = liveRoomStruct.fypCommerceStruct) != null && (oecLivePreviewRoomData = fYPCommerceStruct.getOecLivePreviewRoomData()) != null && (interfaceC1611000s1a = this.LLJILJILJ) != null) {
                Context context = this.context;
                FrameLayout frameLayoutM1 = M1();
                C1ACA c1acaZ13 = z1();
                if (c1acaZ13 != null) {
                    liveRoomStruct3 = c1acaZ13.LIZJ;
                }
                interfaceC1611000s1a.LIZ(context, frameLayoutM1, oecLivePreviewRoomData, liveRoomStruct3);
                return;
            }
            return;
        }
        C500260Jjc.LJIILIIL(M1());
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        int iLIZJ;
        int iLIZIZ;
        ViewGroup.LayoutParams layoutParams;
        View viewFindViewById;
        View viewFindViewById2;
        Activity activityLIZ = C1388190mED.LIZ(this.context);
        if (activityLIZ != null && (viewFindViewById2 = activityLIZ.findViewById(R.id.ydi)) != null) {
            iLIZJ = viewFindViewById2.getMeasuredHeight();
        } else {
            iLIZJ = C497820Jfg.LIZJ(this.context);
        }
        Activity activityLIZ2 = C1388190mED.LIZ(this.context);
        if (activityLIZ2 != null && (viewFindViewById = activityLIZ2.findViewById(R.id.tpm)) != null) {
            iLIZIZ = viewFindViewById.getMeasuredHeight();
        } else {
            iLIZIZ = (int) C497740JfY.LIZIZ(58);
        }
        int iLIZJ2 = ((C497820Jfg.LIZJ(this.context) + iLIZIZ) - iLIZJ) + ((int) C497740JfY.LIZIZ(42));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryDoAdaptation: topSpace=");
        sbLIZ.append(iLIZJ);
        sbLIZ.append(", tabHeight=");
        sbLIZ.append(iLIZIZ);
        sbLIZ.append(", statusBarHeight=");
        sbLIZ.append(C497820Jfg.LIZJ(this.context));
        sbLIZ.append(", topMargin=");
        sbLIZ.append(iLIZJ2);
        sbLIZ.append(", ");
        C20441214yg.LIZIZ("LiveSurveyWidgetV2", C2188811AlT.LIZIZ(sbLIZ));
        FrameLayout frameLayoutM1 = M1();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (frameLayoutM1 != null) {
            layoutParams = frameLayoutM1.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = iLIZJ2;
        }
        FrameLayout frameLayoutM12 = M1();
        if (frameLayoutM12 != null) {
            C786410Ut5.a6(frameLayoutM12, marginLayoutParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        EventBus.LIZLLL().LJIJJ(this);
        StoryToolBarIconAbility storyToolBarIconAbility = (StoryToolBarIconAbility) this.LLJIJIL.getValue();
        if (storyToolBarIconAbility != null) {
            storyToolBarIconAbility.Ws1(this.LLJILJIL);
        }
    }

    @C14EU
    public final void onSkyLightShownEventEvent(C0T3R c0t3r) {
        if (c0t3r.LIZ) {
            C500260Jjc.LJIILIIL(M1());
        } else {
            if (!this.LLJ) {
                return;
            }
            C500260Jjc.LLFFF(M1());
        }
    }
}
