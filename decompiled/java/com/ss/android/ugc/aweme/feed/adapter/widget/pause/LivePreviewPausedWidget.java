package com.ss.android.ugc.aweme.feed.adapter.widget.pause;

import X.C01GW;
import X.C0HAS;
import X.C0IPN;
import X.C1143680frq;
import X.C13LE;
import X.C14KQ;
import X.C19719912Dl;
import X.C1AAV;
import X.C1ACA;
import X.C2093608Ic;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import X.EnumC494740Jai;
import Y.ARunnableS7S0202000_21;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.live.model.FilterInfoData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class LivePreviewPausedWidget extends LiveWatchPreviewWidget {
    public final View LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2124));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2125));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2122));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2123));
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    public final void N1() {
        MutableLiveData<C1AAV> mutableLiveData;
        C1AAV value;
        NextLiveData<Boolean> nextLiveData;
        NextLiveData<Boolean> nextLiveData2;
        LiveRoomStruct liveRoomStruct;
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJJ.getValue();
        if (feedLiveViewHolderVM == null || (mutableLiveData = feedLiveViewHolderVM.LLJL) == null || (value = mutableLiveData.getValue()) == null) {
            return;
        }
        int i = value.LIZIZ;
        UrlModel avatarLarger = null;
        if (i == 1) {
            C786410Ut5.l(M1(), 0);
            C786410Ut5.LJLLLLLL(0, (View) this.LLJILJILJ.getValue());
            C786410Ut5.LJLZ(0, (ViewGroup) this.LLJIJIL.getValue());
            M1().setImageDrawable(null);
            RemoteImageView remoteImageViewM1 = M1();
            WeakReference<BitmapDrawable> weakReference = C0HAS.LIZ;
            Context context = this.context;
            LayerDrawable layerDrawable = C0HAS.LIZJ.get();
            if (layerDrawable == null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
                gradientDrawable.setColors(new int[]{C497740JfY.LIZLLL(R.attr.esj, context), C497740JfY.LIZLLL(R.attr.esk, context), C497740JfY.LIZLLL(R.attr.esl, context)});
                gradientDrawable.setGradientType(0);
                gradientDrawable.setGradientCenter(0.5f, 0.5f);
                layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, C0HAS.LIZIZ(context)});
                C0HAS.LIZJ = new WeakReference<>(layerDrawable);
            }
            remoteImageViewM1.setBackground(layerDrawable);
            LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) this.LLJILLL.getValue();
            if (livePreviewGuideEnterVM != null) {
                livePreviewGuideEnterVM.LLJJ = true;
                livePreviewGuideEnterVM.DQ2();
            }
            FeedLiveViewHolderVM feedLiveViewHolderVM2 = (FeedLiveViewHolderVM) this.LLJJ.getValue();
            if (feedLiveViewHolderVM2 == null || (nextLiveData = feedLiveViewHolderVM2.LLJLILLLLZIIL) == null) {
                return;
            }
            nextLiveData.setValue(Boolean.FALSE);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                FilterInfoData filterInfoData = value.LIZ;
                if (C2093608Ic.LIZJ(filterInfoData != null ? filterInfoData.reason : null, "pause")) {
                    C786410Ut5.LJLLLLLL(8, (View) this.LLJILJILJ.getValue());
                    C786410Ut5.LJLZ(8, (ViewGroup) this.LLJIJIL.getValue());
                    return;
                }
                if (C2093608Ic.LIZJ(filterInfoData != null ? filterInfoData.reason : null, "nostream")) {
                    hide();
                    return;
                }
                hide();
                C786410Ut5.l(M1(), 8);
                C786410Ut5.LJLLLLLL(8, (View) this.LLJILJILJ.getValue());
                return;
            }
            return;
        }
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 == null || !c1acaZ1.LJIILIIL) {
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 != null && (liveRoomStruct = c1acaZ12.LIZJ) != null) {
                C786410Ut5.l(M1(), 0);
                UrlModel urlModel = liveRoomStruct.roomCover;
                if (urlModel == null) {
                    User user = liveRoomStruct.owner;
                    if (user != null) {
                        avatarLarger = user.getAvatarLarger();
                    }
                } else {
                    avatarLarger = urlModel;
                }
                HandlerHook.viewPost(M1(), new ARunnableS7S0202000_21(C14KQ.LJIIIIZZ(this.context), C14KQ.LJ(this.context), this, avatarLarger, 4));
            }
            C1143680frq.LIZLLL((View) this.LLJI.getValue(), C0IPN.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_pause_live_anim.webp");
            LivePreviewGuideEnterVM livePreviewGuideEnterVM2 = (LivePreviewGuideEnterVM) this.LLJILLL.getValue();
            if (livePreviewGuideEnterVM2 != null) {
                livePreviewGuideEnterVM2.LLJJ = true;
                livePreviewGuideEnterVM2.DQ2();
            }
            FeedLiveViewHolderVM feedLiveViewHolderVM3 = (FeedLiveViewHolderVM) this.LLJJ.getValue();
            if (feedLiveViewHolderVM3 != null && (nextLiveData2 = feedLiveViewHolderVM3.LLJLILLLLZIIL) != null) {
                nextLiveData2.setValue(Boolean.FALSE);
            }
            C786410Ut5.LJLZ(0, (ViewGroup) this.LLJIJIL.getValue());
            show();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dew;
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

    public final RemoteImageView M1() {
        return (RemoteImageView) this.LLJILJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        hide();
        C786410Ut5.l(M1(), 8);
        C786410Ut5.LJLLLLLL(8, (View) this.LLJILJILJ.getValue());
    }

    public LivePreviewPausedWidget(View view) {
        this.LLJ = view;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewGuideEnterVM.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2126);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJILLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS577S0100000_33, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS577S0100000_33(c19719912DlLIZ2, 2127), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        N1();
    }
}
