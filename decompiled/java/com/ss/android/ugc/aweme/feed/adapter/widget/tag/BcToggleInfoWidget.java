package com.ss.android.ugc.aweme.feed.adapter.widget.tag;

import X.C01GW;
import X.C1324840ka2;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C19719912Dl;
import X.C1ACA;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C452501pT;
import X.C488730JEp;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC494740Jai;
import Y.AObserverS220S0100000_16;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class BcToggleInfoWidget extends LiveWatchPreviewWidget {
    public static final /* synthetic */ int LLJJ = 0;
    public ViewStub LLJ;
    public ViewStub LLJIJIL;
    public final C01GW LLJILJILJ;
    public ViewPropertyAnimator LLJILLL;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 282));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 283));

    public BcToggleInfoWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJILJILJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 284), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
    }

    public final void S1() {
        LiveRoomStruct liveRoomStruct;
        FeedRoomTagList feedRoomTagList;
        List<FeedRoomTag> list;
        FeedRoomTag feedRoomTag;
        LiveRoomStruct liveRoomStruct2;
        FeedRoomTagList feedRoomTagList2;
        List<FeedRoomTag> list2;
        FeedRoomTag feedRoomTag2;
        Q1(true);
        if (this.LLJ != null) {
            C786410Ut5.LJLLLLLL(8, O1());
        }
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (liveRoomStruct2 = c1acaZ1.LIZJ) != null && (feedRoomTagList2 = liveRoomStruct2.feedRoomTagList) != null && (list2 = feedRoomTagList2.bcToggleTags) != null && (feedRoomTag2 = (FeedRoomTag) C13LP.LJJJLL(list2)) != null && !TextUtils.isEmpty(feedRoomTag2.content)) {
            RemoteImageView remoteImageView = (RemoteImageView) O1().findViewById(R.id.kd7);
            TuxTextView tuxTextView = (TuxTextView) O1().findViewById(R.id.zus);
            M1(O1(), tuxTextView, remoteImageView);
            tuxTextView.setText(feedRoomTag2.content);
            UrlModel urlModel = feedRoomTag2.icon;
            if (urlModel != null) {
                C1324840ka2.LJFF(remoteImageView, urlModel);
                C786410Ut5.l(remoteImageView, 0);
            }
            N1(O1(), tuxTextView);
            if (this.LLJ != null) {
                C786410Ut5.LJLLLLLL(0, O1());
            } else {
                C786410Ut5.LJLLLLLL(0, O1());
            }
            Q1(false);
        }
        if (this.LLJIJIL != null) {
            C786410Ut5.LJLLLLLL(8, P1());
        }
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 == null || (liveRoomStruct = c1acaZ12.LIZJ) == null || (feedRoomTagList = liveRoomStruct.feedRoomTagList) == null || (list = feedRoomTagList.boostToggleTags) == null || (feedRoomTag = (FeedRoomTag) C13LP.LJJJLL(list)) == null || TextUtils.isEmpty(feedRoomTag.content)) {
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) P1().findViewById(R.id.zut);
        tuxTextView2.setText(feedRoomTag.content);
        if (R1()) {
            tuxTextView2.setTuxFont(42);
            P1().setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            P1().setBackgroundResource(R.drawable.ch_);
            M1(P1(), tuxTextView2, null);
            boolean zN1 = N1(P1(), tuxTextView2);
            if (C444960Hcc.LIZIZ()) {
                C500260Jjc.LJLJJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(zN1 ? 4 : 6)), P1());
            } else {
                C500260Jjc.LJLI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(zN1 ? 4 : 6)), P1());
            }
        } else {
            tuxTextView2.setTuxFont(92);
            P1().setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))));
            P1().setBackgroundResource(R.drawable.cha);
            C500260Jjc.LJLJJL(0, P1());
        }
        if (this.LLJIJIL != null) {
            C786410Ut5.LJLLLLLL(0, P1());
        } else {
            C786410Ut5.LJLLLLLL(0, P1());
        }
        Q1(false);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.det;
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

    public final View O1() {
        return (View) this.LLJI.getValue();
    }

    public final View P1() {
        return (View) this.LLJILJIL.getValue();
    }

    public final boolean R1() {
        return this.LLJ == null ? findViewById(R.id.mq8).getVisibility() == 0 : O1().getVisibility() == 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        if (this.LLJIJIL != null ? P1().getVisibility() == 0 : findViewById(R.id.mq8).getVisibility() == 0) {
            C488730JEp c488730JEp = C488730JEp.LIZ;
            C1ACA c1acaZ1 = z1();
            c488730JEp.getClass();
            C488730JEp.LIZJ(c1acaZ1);
        }
        if (R1()) {
            C488730JEp c488730JEp2 = C488730JEp.LIZ;
            C1ACA c1acaZ12 = z1();
            c488730JEp2.getClass();
            C488730JEp.LIZIZ(c1acaZ12);
        }
    }

    public final void Q1(boolean z) {
        int iLIZIZ;
        if (z) {
            iLIZIZ = 0;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        C500260Jjc.LJLJL(iLIZIZ, findViewById(R.id.mqj));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Integer> mutableLiveData;
        super.onLoad(objArr);
        S1();
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJILJILJ.getValue();
        if (feedLiveViewHolderVM != null && (mutableLiveData = feedLiveViewHolderVM.LLJLLIL) != null) {
            mutableLiveData.observe(this, new AObserverS220S0100000_16(this, 7));
        }
    }

    public final boolean N1(View view, TuxTextView tuxTextView) {
        LiveRoomStruct liveRoomStruct;
        C1ACA c1acaZ1 = z1();
        boolean z = true;
        if (c1acaZ1 == null || (liveRoomStruct = c1acaZ1.LIZJ) == null || !liveRoomStruct.hasCommerceGoods) {
            return false;
        }
        if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIJLIJ()) {
            tuxTextView.setTuxFont(92);
            view.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))));
            view.setBackgroundResource(R.drawable.au3);
        } else {
            z = false;
        }
        if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJLIIIJLLLLLLLZ()) {
            view.setBackgroundResource(R.drawable.au2);
        }
        return z;
    }

    public static void M1(View view, TuxTextView tuxTextView, RemoteImageView remoteImageView) {
        view.setBackgroundResource(R.drawable.chb);
        tuxTextView.setTuxFont(82);
        tuxTextView.setHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        if (remoteImageView != null) {
            remoteImageView.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            remoteImageView.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
    }
}
