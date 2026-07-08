package com.ss.android.ugc.aweme.feed.adapter.widget.aisummary;

import X.C001A;
import X.C01GW;
import X.C01TT;
import X.C0IJT;
import X.C0IK5;
import X.C0TL6;
import X.C105800ae;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C19719912Dl;
import X.C1A5L;
import X.C1ACA;
import X.C2188811AlT;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C474500IjA;
import X.C486790J7d;
import X.C487710JAr;
import X.C500260Jjc;
import X.C5182020e;
import X.C741370T6h;
import X.C745180TKy;
import X.C786410Ut5;
import X.EnumC494740Jai;
import X.RunnableC514801zW;
import Y.ACListenerS147S0100000_12;
import Y.AObserverS216S0100000_12;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.model.message.AILiveSummaryMessage;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveAiSummary;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import webcast.data.AILiveSummary;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveAiSummaryWidget extends LiveWatchPreviewWidget {
    public static final /* synthetic */ int LLJJ = 0;
    public final C01GW LLJ;
    public boolean LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public long LLJILJILJ;
    public final C105800ae LLJILLL;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.00ae] */
    public LiveAiSummaryWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new C5182020e((C13IQ) c19719912DlLIZ, 112), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
        this.LLJILLL = new OnIMMessageListener() { // from class: X.00ae
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "LiveAiSummaryWidget";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                AILiveSummaryMessage aILiveSummaryMessage;
                if (!(iMessage instanceof AILiveSummaryMessage)) {
                    return;
                }
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onMessage: ");
                    Gson gson = new Gson();
                    AILiveSummary aILiveSummary = null;
                    if ((iMessage instanceof AILiveSummaryMessage) && (aILiveSummaryMessage = (AILiveSummaryMessage) iMessage) != null) {
                        aILiveSummary = aILiveSummaryMessage.aiLiveSummary;
                    }
                    sbLIZ.append(gson.LJIILL(aILiveSummary));
                    C20441214yg.LJIIIZ("LiveAiSummaryWidget", C2188811AlT.LIZIZ(sbLIZ));
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                this.LL.M1(((AILiveSummaryMessage) iMessage).aiLiveSummary);
            }
        };
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        C1ACA c1acaZ1;
        IMessageManager iMessageManager;
        LiveRoomStruct liveRoomStruct;
        LiveAiSummary liveAiSummary;
        if (!C745180TKy.LIZ(z1())) {
            hide();
            return;
        }
        if (this.LLJILJILJ == 0) {
            show();
        } else if (C0TL6.LIZ().style == 1) {
            show();
            View view = getView();
            if (view != null) {
                C786410Ut5.LJLLLLLL(4, view);
            }
        } else {
            hide();
        }
        TuxTextView tuxTextView = this.LLJILJIL;
        if (tuxTextView != null) {
            C1ACA c1acaZ12 = z1();
            tuxTextView.setText((c1acaZ12 == null || (liveRoomStruct = c1acaZ12.LIZJ) == null || (liveAiSummary = liveRoomStruct.getLiveAiSummary()) == null) ? null : liveAiSummary.roomLlmTitle);
        }
        EventBus.LIZLLL().LJIJJ(this);
        if (C0TL6.LIZ().noUpdate > 0 || (c1acaZ1 = z1()) == null || (iMessageManager = c1acaZ1.LJJIIZ) == null) {
            return;
        }
        iMessageManager.addMessageListener(C001A.A_I_LIVE_SUMMARY_MESSAGE.getIntType(), (OnIMMessageListener) this.LLJILLL);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        C1ACA c1acaZ1;
        IMessageManager iMessageManager;
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        if (C0TL6.LIZ().noUpdate <= 0 && (c1acaZ1 = z1()) != null && (iMessageManager = c1acaZ1.LJJIIZ) != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this.LLJILLL);
        }
        this.LLJILJILJ = C0TL6.LIZ().showDelayTime;
        this.LLJI = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        this.LLJI = false;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return C0TL6.LIZ().noNeedMarquee > 0 ? R.layout.dbn : R.layout.dbm;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            c1acaZ1.LJJZZIII = 1;
        }
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 != null) {
            c1acaZ12.LJJLJLI = null;
        }
        if (this.LL) {
            N1(z1());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        if (!C745180TKy.LIZ(z1())) {
            return;
        }
        if (C0TL6.LIZ().noUpdate <= 0) {
            C01TT.LIZIZ(this.LLJILJILJ, new C5182020e(this, 111));
        }
        View view = getView();
        if (view == null || view.getVisibility() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadShowAiSummaryWidget_");
            sbLIZ.append(hashCode());
            C0IK5.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            RunnableC514801zW runnableC514801zW = new RunnableC514801zW(this, 47);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadShowAiSummaryWidget_");
            sbLIZ2.append(hashCode());
            C486790J7d.LIZLLL(runnableC514801zW, C2188811AlT.LIZIZ(sbLIZ2), this.LLJILJILJ);
        }
        N1(z1());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        this.LL = false;
        this.LLJI = false;
    }

    public final void M1(AILiveSummary aILiveSummary) {
        String str;
        C1ACA c1acaZ1;
        LiveRoomStruct liveRoomStruct;
        LiveAiSummary liveAiSummary;
        if (aILiveSummary != null) {
            str = aILiveSummary.roomLlmTitle;
            if (str != null && C500260Jjc.LJJIIZ(str)) {
                show();
                TuxTextView tuxTextView = this.LLJILJIL;
                if (tuxTextView != null) {
                    tuxTextView.setText(str);
                }
            }
            c1acaZ1 = z1();
            if (c1acaZ1 == null && (liveRoomStruct = c1acaZ1.LIZJ) != null && (liveAiSummary = liveRoomStruct.getLiveAiSummary()) != null) {
                if (str == null) {
                    str = "";
                }
                liveAiSummary.roomLlmTitle = str;
                return;
            }
            return;
        }
        str = null;
        hide();
        c1acaZ1 = z1();
        if (c1acaZ1 == null) {
        }
    }

    public final void N1(C1ACA c1aca) {
        LiveRoomStruct liveRoomStruct;
        String str;
        View view = getView();
        if (view == null || view.getVisibility() != 0 || !isShowing() || this.LLJI) {
            return;
        }
        this.LLJI = true;
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ai_summary_show");
            c474500IjALIZ.LJJII(Long.valueOf(liveRoomStruct.getAnchorId()), "anchor_id");
            c474500IjALIZ.LJJII(Long.valueOf(liveRoomStruct.id), "room_id");
            c474500IjALIZ.LJJII(Long.valueOf(liveRoomStruct.ownerUserId), "user_id");
            c474500IjALIZ.LJJII(c1aca.LIZLLL, "enter_from_merge");
            c474500IjALIZ.LJJII("live_cell", "enter_method");
            c474500IjALIZ.LJJII("click", "action_type");
            C487710JAr.LIZ.getClass();
            c474500IjALIZ.LJJII(String.valueOf(C487710JAr.LIZ(liveRoomStruct)), "follow_status");
            LiveAiSummary liveAiSummary = liveRoomStruct.getLiveAiSummary();
            if (liveAiSummary == null || (str = liveAiSummary.roomLlmTitle) == null) {
                str = "";
            }
            c474500IjALIZ.LJJII(str, "ai_summary_content");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        long j;
        TuxTextView tuxTextView;
        NextLiveData<Unit> nextLiveData;
        TuxTextView tuxTextView2;
        super.onLoad(objArr);
        if (C0TL6.LIZ().optWidgetLoadTime == 2) {
            j = 0;
        } else {
            j = C0TL6.LIZ().showDelayTime;
        }
        this.LLJILJILJ = j;
        View view = getView();
        TuxTextView tuxTextView3 = null;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.tv_title);
        } else {
            tuxTextView = null;
        }
        this.LLJIJIL = tuxTextView;
        View view2 = getView();
        if (view2 != null) {
            tuxTextView3 = (TuxTextView) view2.findViewById(R.id.tv_summary);
        }
        this.LLJILJIL = tuxTextView3;
        if (C0TL6.LIZ().noNeedMarquee > 0 && (tuxTextView2 = this.LLJILJIL) != null) {
            tuxTextView2.setSelected(true);
        }
        C2271391DvN.LIZ(this.LLJIJIL, (C1A5L) C2271381DvM.LJLIIIL.getValue());
        TuxTextView tuxTextView4 = this.LLJIJIL;
        if (tuxTextView4 != null) {
            C786410Ut5.h9(tuxTextView4, new ACListenerS147S0100000_12(this, 328));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJ.getValue();
        if (feedLiveViewHolderVM != null && (nextLiveData = feedLiveViewHolderVM.LLJJLIIIJLLLLLLLZ) != null) {
            nextLiveData.observe(this, new AObserverS216S0100000_12(this, 37));
        }
    }

    @C14EU
    public final void onReceiveMessageFromRoom(C741370T6h c741370T6h) {
        String str;
        LiveRoomStruct liveRoomStruct;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null) {
            str = liveRoomStruct.idStr;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, c741370T6h.LIZIZ)) {
            M1(c741370T6h.LIZ);
        }
    }
}
