package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C01GW;
import X.C13LE;
import X.C19719912Dl;
import X.C1ACA;
import X.C418440Gaw;
import X.C452501pT;
import X.C500260Jjc;
import X.C814420VxA;
import X.C999160c6k;
import X.C999170c6l;
import X.C999180c6m;
import X.C999190c6n;
import X.C999200c6o;
import X.C999210c6p;
import X.C999220c6q;
import X.C999230c6r;
import X.C999240c6s;
import X.C999250c6t;
import X.C999260c6u;
import X.C999370c75;
import X.EnumC494740Jai;
import X.EnumC999300c6y;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.LiveInfoContainerWidget;
import com.ss.android.ugc.aweme.feed.model.live.FypRecommendInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.R;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public final class LiveInfoContainerWidget extends LiveWatchPreviewWidget {
    public static final C999250c6t LLJJJ = new Object() { // from class: X.0c6t
    };
    public static final EnumC999300c6y LLJJJIL = EnumC999300c6y.EC_LIVE_INFO;
    public final C01GW LLJ = C452501pT.LIZIZ(new C999190c6n(this));
    public final C01GW LLJI = C452501pT.LIZIZ(new C999170c6l(this));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C999180c6m(this));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C999240c6s(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C999230c6r(this));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C999200c6o(this));
    public final C01GW LLJJ = C452501pT.LIZIZ(new C999210c6p(this));
    public final C01GW LLJJI = C452501pT.LIZIZ(new C999220c6q(this));
    public final C01GW LLJJIII;
    public String LLJJIJI;
    public ViewPropertyAnimator LLJJIJIIJIL;
    public boolean LLJJIJIL;

    public LiveInfoContainerWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJJIII = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new C999160c6k(c19719912DlLIZ), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dev;
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

    public final FeedLiveViewHolderVM N1() {
        return (FeedLiveViewHolderVM) this.LLJJIII.getValue();
    }

    public final LinearLayout O1() {
        return (LinearLayout) this.LLJ.getValue();
    }

    public final View P1() {
        return (View) this.LLJI.getValue();
    }

    public final void R1() {
        Set<EnumC999300c6y> set;
        if (this.LLJJIJIL) {
            return;
        }
        this.LLJJIJIL = true;
        C999370c75 c999370c75 = C999370c75.LIZ;
        EnumC999300c6y enumC999300c6y = LLJJJIL;
        C1ACA c1acaZ1 = z1();
        c999370c75.getClass();
        C999370c75.LIZLLL(enumC999300c6y, c1acaZ1);
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 == null || (set = c1acaZ12.LJLJL) == null) {
            return;
        }
        set.add(enumC999300c6y);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        this.LLJJIJIL = false;
    }

    public final void Q1(boolean z) {
        int iLIZIZ;
        if (z) {
            iLIZIZ = 0;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        C500260Jjc.LJLJL(iLIZIZ, O1());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<String> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        NextLiveData<Boolean> nextLiveData;
        super.onLoad(objArr);
        FeedLiveViewHolderVM feedLiveViewHolderVMN1 = N1();
        if (feedLiveViewHolderVMN1 != null && (nextLiveData = feedLiveViewHolderVMN1.LLJJL) != null) {
            nextLiveData.observe(this, new C999260c6u(this), true);
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMN12 = N1();
        if (feedLiveViewHolderVMN12 != null && (mutableLiveData2 = feedLiveViewHolderVMN12.LLJLLIL) != null) {
            mutableLiveData2.observe(this, new Observer() { // from class: X.0c6S
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    LiveRoomStruct liveRoomStruct;
                    FypRecommendInfo ecommerceFypRecommendInfo;
                    boolean z;
                    Integer num = (Integer) obj;
                    C1ACA c1acaZ1 = this.LL.z1();
                    if (c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null && (ecommerceFypRecommendInfo = liveRoomStruct.getEcommerceFypRecommendInfo()) != null && 2 == ecommerceFypRecommendInfo.getDisplayStyle()) {
                        if (num.intValue() > 0) {
                            ViewPropertyAnimator viewPropertyAnimator = this.LL.LLJJIJIIJIL;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                            }
                            LiveInfoContainerWidget liveInfoContainerWidget = this.LL;
                            liveInfoContainerWidget.LLJJIJIIJIL = null;
                            if (liveInfoContainerWidget.O1().getVisibility() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                C786410Ut5.W4(this.LL.O1(), 0.0f);
                                return;
                            } else {
                                if (this.LL.O1().getAlpha() == 0.0f) {
                                    return;
                                }
                                LiveInfoContainerWidget liveInfoContainerWidget2 = this.LL;
                                ViewPropertyAnimator duration = liveInfoContainerWidget2.O1().animate().alpha(0.0f).setDuration(200L);
                                duration.start();
                                liveInfoContainerWidget2.LLJJIJIIJIL = duration;
                                return;
                            }
                        }
                        ViewPropertyAnimator viewPropertyAnimator2 = this.LL.LLJJIJIIJIL;
                        if (viewPropertyAnimator2 != null) {
                            viewPropertyAnimator2.cancel();
                        }
                        this.LL.LLJJIJIIJIL = null;
                        if (-1 != num.intValue() && this.LL.O1().getVisibility() == 0) {
                            if (this.LL.O1().getAlpha() == 1.0f) {
                                return;
                            }
                            LiveInfoContainerWidget liveInfoContainerWidget3 = this.LL;
                            ViewPropertyAnimator duration2 = liveInfoContainerWidget3.O1().animate().alpha(1.0f).setDuration(200L);
                            duration2.start();
                            liveInfoContainerWidget3.LLJJIJIIJIL = duration2;
                            return;
                        }
                        C786410Ut5.W4(this.LL.O1(), 1.0f);
                    }
                }
            });
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMN13 = N1();
        if (feedLiveViewHolderVMN13 != null && (mutableLiveData = feedLiveViewHolderVMN13.LLLF) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.0c6a
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    String str = (String) obj;
                    LiveInfoContainerWidget liveInfoContainerWidget = this.LL;
                    liveInfoContainerWidget.LLJJIJI = str;
                    if (str != null) {
                        ((TextView) liveInfoContainerWidget.LLJILJIL.getValue()).setText(str);
                    }
                }
            });
        }
    }

    public final void M1(RemoteImageView remoteImageView, TuxTextView tuxTextView) {
        remoteImageView.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        remoteImageView.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        C500260Jjc.LJJLJLI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), remoteImageView);
        tuxTextView.setTuxFont(51);
        O1().setDividerDrawable(O1().getContext().getDrawable(R.drawable.cht));
    }
}
