package com.ss.android.ugc.aweme.feed.adapter.widget.hotcomment;

import X.C01GW;
import X.C0IJT;
import X.C1115360f8A;
import X.C1115380f8C;
import X.C123100dR;
import X.C13LE;
import X.C13LP;
import X.C19719912Dl;
import X.C1A5L;
import X.C1AC4;
import X.C1ACA;
import X.C2174971AAd;
import X.C2252261DDk;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C292401Bi;
import X.C339190DRl;
import X.C474500IjA;
import X.C497740JfY;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC494740Jai;
import Y.AObserverS235S0100000_33;
import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.PreviewCommentInfo;
import com.ss.android.ugc.aweme.feed.model.live.PreviewCommentItem;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS626S0100000_12;
import wh6.AbS712S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class PreviewHotCommentWidget extends LiveWatchPreviewWidget {
    public static final C1AC4 LLJJLIIIJLLLLLLLZ = new C1AC4();
    public final C01GW LLJ;
    public final C01GW LLJI;
    public PreviewCommentItem LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public final BPEAHandler LLJJIII;
    public final AObserverS235S0100000_33 LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;

    public PreviewHotCommentWidget() {
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewPlayerVM.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 473);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        this.LLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS556S0100000_12, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ2, 474), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJILLL = true;
        this.LLJJIII = new BPEAHandler(Looper.getMainLooper());
        this.LLJJIJI = new AObserverS235S0100000_33(this, 24);
        this.LLJJIJIIJIL = C292401Bi.LIZ(new AwS577S0100000_33(this, 2121));
        this.LLJJIJIL = C292401Bi.LIZ(new AwS577S0100000_33(this, 2118));
        this.LLJJJ = C292401Bi.LIZ(new AwS577S0100000_33(this, 2119));
        this.LLJJJIL = C292401Bi.LIZ(new AwS577S0100000_33(this, 2115));
        this.LLJJJJ = C292401Bi.LIZ(new AwS577S0100000_33(this, 2116));
        this.LLJJJJJIL = C292401Bi.LIZ(new AwS577S0100000_33(this, 2117));
        this.LLJJJJLIIL = C292401Bi.LIZ(new AwS577S0100000_33(this, 2120));
        this.LLJJL = C292401Bi.LIZ(new AwS577S0100000_33(this, 2114));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        this.LLJIJIL = null;
        hide();
    }

    public final void O1() {
        FeedLiveViewHolderVM feedLiveViewHolderVMP1;
        int i = 0;
        M1(false);
        PreviewCommentItem previewCommentItem = this.LLJIJIL;
        if (previewCommentItem == null || (feedLiveViewHolderVMP1 = P1()) == null) {
            return;
        }
        Context context = this.context;
        int i2 = previewCommentItem.itemType;
        if (i2 == 0) {
            i = 20;
        } else if (i2 == 1) {
            i = 19;
        }
        feedLiveViewHolderVMP1.KQ2(false, context, "normal", false, false, false, i, null, false, 0);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dgf;
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
        String str;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        PreviewCommentInfo previewCommentInfo;
        LiveRoomStruct liveRoomStruct3;
        PreviewCommentInfo previewCommentInfo2;
        List<PreviewCommentItem> list;
        C1AC4 c1ac4 = LLJJLIIIJLLLLLLLZ;
        C1ACA c1acaZ1 = z1();
        c1ac4.getClass();
        if (C1AC4.LIZ(c1acaZ1)) {
            z1();
            z1();
            C1ACA c1acaZ12 = z1();
            String str2 = null;
            PreviewCommentItem previewCommentItem = (c1acaZ12 == null || (liveRoomStruct3 = c1acaZ12.LIZJ) == null || (previewCommentInfo2 = liveRoomStruct3.previewCommentInfo) == null || (list = previewCommentInfo2.commentList) == null) ? null : (PreviewCommentItem) C13LP.LJJJLL(list);
            C1ACA c1acaZ13 = z1();
            if (c1acaZ13 != null && (liveRoomStruct2 = c1acaZ13.LIZJ) != null && (previewCommentInfo = liveRoomStruct2.previewCommentInfo) != null) {
                str2 = previewCommentInfo.title;
            }
            if (C123100dR.LIZ(str2) && str2 != null) {
                ((TextView) this.LLJJIJIIJIL.getValue()).setText(str2);
            }
            C1115360f8A c1115360f8A = C1115380f8C.LIZ;
            if (previewCommentItem == null || (str = previewCommentItem.content) == null) {
                str = "";
            }
            C1115380f8C.LIZLLL(new SpannableStringBuilder(str), this.context.getResources(), this, new AwS626S0100000_12(this, 26));
            ((TextView) this.LLJJJJJIL.getValue()).setText("");
            this.LLJIJIL = previewCommentItem;
            C1ACA c1acaZ14 = z1();
            if (c1acaZ14 != null && (liveRoomStruct = c1acaZ14.LIZJ) != null) {
                liveRoomStruct.commentItem = this.LLJIJIL;
            }
            PreviewCommentItem previewCommentItem2 = this.LLJIJIL;
            if (previewCommentItem2 != null) {
                int i = previewCommentItem2.itemType;
                if (i == 0 || i == 1) {
                    C339190DRl.LIZLLL((View) this.LLJJIJIIJIL.getValue());
                    C339190DRl.LIZLLL((View) this.LLJJIJIL.getValue());
                    C339190DRl.LIZLLL((View) this.LLJJJ.getValue());
                    View view = (View) this.LLJJJIL.getValue();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C497740JfY.LIZIZ(4)));
                    C786410Ut5.W5(view, marginLayoutParams);
                    return;
                }
                C339190DRl.LIZIZ((View) this.LLJJIJIIJIL.getValue());
                C339190DRl.LIZIZ((View) this.LLJJIJIL.getValue());
                C339190DRl.LIZIZ((View) this.LLJJJ.getValue());
                View view2 = (View) this.LLJJJIL.getValue();
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginStart(0);
                C786410Ut5.W5(view2, marginLayoutParams2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        if (this.LLJILLL) {
            this.LLJILLL = false;
        }
    }

    public final boolean N1() {
        PreviewCommentItem previewCommentItem;
        String str;
        View view;
        View viewFindViewById;
        if (this.LLJILJIL == 0 && (previewCommentItem = this.LLJIJIL) != null && (str = previewCommentItem.content) != null && C123100dR.LIZ(str)) {
            if (!C2174971AAd.LIZJ()) {
                return true;
            }
            View view2 = this.contentView;
            Object parent = view2 != null ? view2.getParent() : null;
            if (!(parent instanceof ViewGroup) || (view = (View) parent) == null || (viewFindViewById = view.findViewById(R.id.s8i)) == null || viewFindViewById.getVisibility() != 0) {
                return true;
            }
        }
        return false;
    }

    public final FeedLiveViewHolderVM P1() {
        return (FeedLiveViewHolderVM) this.LLJI.getValue();
    }

    public final C2252261DDk Q1() {
        return (C2252261DDk) this.LLJJJJLIIL.getValue();
    }

    public final void T1() {
        ((TextView) this.LLJJJJJIL.getValue()).setText("");
        Q1().scrollTo(0, 0);
        ((View) this.LLJJJIL.getValue()).scrollTo(0, 0);
        HandlerHook.viewPost(Q1(), new ARunnableS133S0100000_33(this, 49));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        this.LLJILJILJ = false;
        this.LLJJ = false;
        this.LLJJI = false;
        this.LLJJIII.removeCallbacksAndMessages(null);
        Q1().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        this.LLJILJILJ = true;
        if (isShowing()) {
            if (!this.LLJJI) {
                M1(true);
            }
            if (!this.LLJJ && this.LLJJI) {
                T1();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        this.LL = false;
        this.LLJILLL = true;
        this.LLJJIII.removeCallbacksAndMessages(null);
        Q1().LIZIZ();
    }

    public final void M1(boolean z) {
        Long lValueOf;
        Long lValueOf2;
        String str;
        long j;
        String str2;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        LiveRoomStruct liveRoomStruct4;
        PreviewCommentItem previewCommentItem = this.LLJIJIL;
        if (previewCommentItem != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cmt_interact_msg_preview_info");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            C1ACA c1acaZ1 = z1();
            String str3 = null;
            if (c1acaZ1 != null && (liveRoomStruct4 = c1acaZ1.LIZJ) != null) {
                lValueOf = Long.valueOf(liveRoomStruct4.ownerUserId);
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJI(lValueOf);
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 != null && (liveRoomStruct3 = c1acaZ12.LIZJ) != null) {
                lValueOf2 = Long.valueOf(liveRoomStruct3.id);
            } else {
                lValueOf2 = null;
            }
            c474500IjALIZ.LJJIJIIJI(lValueOf2);
            C1ACA c1acaZ13 = z1();
            if (c1acaZ13 != null && (liveRoomStruct2 = c1acaZ13.LIZJ) != null) {
                c474500IjALIZ.LJJ(RoomStruct.getStreamType(liveRoomStruct2).logStreamingType);
            }
            c474500IjALIZ.LJJII(Long.valueOf(previewCommentItem.id), "comment_id");
            if (z) {
                str = "show";
            } else {
                str = "click";
            }
            c474500IjALIZ.LJJII(str, "action_type");
            C1ACA c1acaZ14 = z1();
            if (c1acaZ14 != null && (liveRoomStruct = c1acaZ14.LIZJ) != null) {
                j = liveRoomStruct.watchDayCntLayer;
            } else {
                j = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j), "user_activity");
            if (C2174971AAd.LIZIZ()) {
                str2 = "second_row";
            } else {
                str2 = "third_row";
            }
            c474500IjALIZ.LJJII(str2, "msg_position");
            PreviewCommentItem previewCommentItem2 = this.LLJIJIL;
            if (previewCommentItem2 != null) {
                str3 = previewCommentItem2.contentType;
            }
            c474500IjALIZ.LJJII(str3, "msg_type");
            c474500IjALIZ.LIZ();
        }
    }

    public final void R1(int i) {
        this.LLJILJIL = (~i) & this.LLJILJIL;
        if (N1()) {
            show();
        }
    }

    public final void S1(int i) {
        this.LLJILJIL = i | this.LLJILJIL;
        if (isShowing()) {
            hide();
            this.LLJJIII.removeCallbacksAndMessages(null);
            Q1().LIZIZ();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new AbS712S0100000_33(this, 3), view);
        }
        C2271391DvN.LIZ((View) this.LLJJL.getValue(), (C1A5L) C2271381DvM.LJLLI.getValue());
        View view2 = (View) this.LLJJL.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new AbS712S0100000_33(this, 4), view2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Unit> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4;
        MutableLiveData<Integer> mutableLiveData5;
        MutableLiveData<Integer> mutableLiveData6;
        MutableLiveData<Boolean> mutableLiveData7;
        super.onLoad(objArr);
        C1AC4 c1ac4 = LLJJLIIIJLLLLLLLZ;
        C1ACA c1acaZ1 = z1();
        c1ac4.getClass();
        if (C1AC4.LIZ(c1acaZ1)) {
            this.LLJILJIL = 0;
            if (C2174971AAd.LIZJ()) {
                FeedLiveViewHolderVM feedLiveViewHolderVMP1 = P1();
                if (feedLiveViewHolderVMP1 != null && (mutableLiveData7 = feedLiveViewHolderVMP1.LLJLL) != null) {
                    mutableLiveData7.observe(this, new AObserverS235S0100000_33(this, 70));
                }
                FeedLiveViewHolderVM feedLiveViewHolderVMP12 = P1();
                if (feedLiveViewHolderVMP12 != null && (mutableLiveData6 = feedLiveViewHolderVMP12.LLJLLIL) != null) {
                    mutableLiveData6.observe(this, new AObserverS235S0100000_33(this, 71));
                }
                FeedLiveViewHolderVM feedLiveViewHolderVMP13 = P1();
                if (feedLiveViewHolderVMP13 != null && (mutableLiveData5 = feedLiveViewHolderVMP13.LLLIILIL) != null) {
                    mutableLiveData5.observe(this, new AObserverS235S0100000_33(this, 72));
                }
                FeedLiveViewHolderVM feedLiveViewHolderVMP14 = P1();
                if (feedLiveViewHolderVMP14 != null && (mutableLiveData4 = feedLiveViewHolderVMP14.LLLIIL) != null) {
                    mutableLiveData4.observe(this, new AObserverS235S0100000_33(this, 73));
                }
                FeedLiveViewHolderVM feedLiveViewHolderVMP15 = P1();
                if (feedLiveViewHolderVMP15 != null && (mutableLiveData3 = feedLiveViewHolderVMP15.LLLIL) != null) {
                    mutableLiveData3.observe(this, new AObserverS235S0100000_33(this, 74));
                }
                FeedLiveViewHolderVM feedLiveViewHolderVMP16 = P1();
                if (feedLiveViewHolderVMP16 != null && (mutableLiveData2 = feedLiveViewHolderVMP16.LLJLLL) != null) {
                    mutableLiveData2.observe(this, new AObserverS235S0100000_33(this, 75));
                }
            }
            LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLJ.getValue();
            if (livePreviewPlayerVM != null && (mutableLiveData = livePreviewPlayerVM.LLILZIL) != null) {
                mutableLiveData.observe(this, this.LLJJIJI);
            }
            if (C2174971AAd.LIZ() == 1) {
                View view = this.contentView;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.height = 0;
                    marginLayoutParams.topMargin = 0;
                    C786410Ut5.W5(view, marginLayoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            return;
        }
        this.LLJILJIL = 1;
    }
}
