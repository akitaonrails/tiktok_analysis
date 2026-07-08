package com.ss.android.ugc.aweme.feed.adapter.widget.game;

import X.C01GW;
import X.C0IJT;
import X.C1124870fNV;
import X.C13LE;
import X.C19719912Dl;
import X.C1A5L;
import X.C1ABT;
import X.C1ACA;
import X.C20642515q3;
import X.C2175421ABw;
import X.C2252261DDk;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C474500IjA;
import X.C786410Ut5;
import X.EnumC494740Jai;
import X.ViewOnLayoutChangeListenerC2189541Ame;
import Y.ACListenerS167S0100000_33;
import Y.AObserverS235S0100000_33;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipRewardsFypTagSetting;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.PreviewGameRewardsWidget;
import com.ss.android.ugc.aweme.feed.model.live.GameTagDetail;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class PreviewGameRewardsWidget extends LiveWatchPreviewWidget {
    public static final C2175421ABw LLJJJIL = new C2175421ABw();
    public final C01GW LLJ;
    public TextView LLJI;
    public ViewGroup LLJIJIL;
    public C2252261DDk LLJILJIL;
    public TextView LLJILJILJ;
    public TextView LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public CountDownTimer LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;

    public PreviewGameRewardsWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new AwS556S0100000_12(c19719912DlLIZ, 471), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dgd;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        this.LLJJIJI = false;
        super.hide();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final FeedLiveViewHolderVM M1() {
        return (FeedLiveViewHolderVM) this.LLJ.getValue();
    }

    public final void O1() {
        if (!this.LLJJIJIL) {
            CountDownTimer countDownTimer = this.LLJJIJIIJIL;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.LLJJIJIL = true;
            if (!C1ABT.LJIIIIZZ(z1())) {
                return;
            } else {
                P1("show");
            }
        }
        this.LLJJIJIL = false;
        CountDownTimer countDownTimer2 = this.LLJJIJIIJIL;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        this.LLJJIJIIJIL = new CountDownTimer() { // from class: X.1AC3
            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                PreviewGameRewardsWidget previewGameRewardsWidget = this.LIZ;
                previewGameRewardsWidget.LLJJIJIL = true;
                if (C1ABT.LJIIIIZZ(previewGameRewardsWidget.z1())) {
                    this.LIZ.P1("show");
                }
            }

            {
                super(2000L, 1000L);
            }
        }.start();
    }

    public final void onHide() {
        if (!this.LLJJIJIL) {
            CountDownTimer countDownTimer = this.LLJJIJIIJIL;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.LLJJIJIL = true;
        }
        hide();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        if (C1ABT.LJIIIIZZ(z1())) {
            C1124870fNV.LIZJ().getClass();
            String strLIZIZ = C1124870fNV.LIZIZ("ttlive_gameLiveFyf_rewardsLabel");
            TextView textView = this.LLJI;
            if (textView != null) {
                if (strLIZIZ == null || strLIZIZ.length() == 0) {
                    C2175421ABw c2175421ABw = LLJJJIL;
                    C1ACA c1acaZ1 = z1();
                    c2175421ABw.getClass();
                    strLIZIZ = C2175421ABw.LIZIZ(c1acaZ1);
                }
                textView.setText(strLIZIZ);
            }
            C1124870fNV.LIZJ().getClass();
            String strLIZIZ2 = C1124870fNV.LIZIZ("ttlive_gameLiveFyf_rewards2");
            TextView textView2 = this.LLJILJILJ;
            if (textView2 != null) {
                if (strLIZIZ2 == null || strLIZIZ2.length() == 0) {
                    strLIZIZ2 = C20642515q3.LJI(2131852522);
                }
                textView2.setText(strLIZIZ2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        if (!this.LLJJIJIL) {
            CountDownTimer countDownTimer = this.LLJJIJIIJIL;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.LLJJIJIL = true;
            P1("show");
        }
        hide();
        this.LLJJJ = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (C1ABT.LJIIIIZZ(z1())) {
            this.LLJJIJI = true;
            if (GameLivePartnershipRewardsFypTagSetting.INSTANCE.isEnable()) {
                super.show();
            }
        }
    }

    public static void N1(PreviewGameRewardsWidget previewGameRewardsWidget) {
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        C2175421ABw c2175421ABw = LLJJJIL;
        C1ACA c1acaZ1 = previewGameRewardsWidget.z1();
        c2175421ABw.getClass();
        if (C2175421ABw.LIZ(c1acaZ1)) {
            FeedLiveViewHolderVM feedLiveViewHolderVMM1 = previewGameRewardsWidget.M1();
            if ((feedLiveViewHolderVMM1 != null && (mutableLiveData = feedLiveViewHolderVMM1.LLLIILIL) != null && (value = mutableLiveData.getValue()) != null && value.intValue() == 3) || previewGameRewardsWidget.LLJJI || previewGameRewardsWidget.LLJJ || previewGameRewardsWidget.LLJJIII) {
                return;
            }
            View view = previewGameRewardsWidget.getView();
            if (view != null) {
                TextView textView = previewGameRewardsWidget.LLJILLL;
                if (textView != null) {
                    textView.setText("");
                }
                view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2189541Ame(view, previewGameRewardsWidget, 1));
            }
            previewGameRewardsWidget.show();
            previewGameRewardsWidget.O1();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        N1(this);
    }

    public final void P1(String str) {
        long anchorId;
        String str2;
        Object objValueOf;
        String str3;
        LiveRoomStruct liveRoomStruct;
        GameTagDetail gameTagDetail;
        LiveRoomStruct liveRoomStruct2;
        GameTagDetail gameTagDetail2;
        LiveRoomStruct liveRoomStruct3;
        LiveRoomStruct liveRoomStruct4;
        GameLivePartnershipRewardsFypTagSetting gameLivePartnershipRewardsFypTagSetting = GameLivePartnershipRewardsFypTagSetting.INSTANCE;
        if (!gameLivePartnershipRewardsFypTagSetting.isInvolve() || !this.LLJJIJI) {
            return;
        }
        if (Intrinsics.LJFF("show", str)) {
            if (this.LLJJJ) {
                return;
            } else {
                this.LLJJJ = true;
            }
        }
        boolean zIsEnable = gameLivePartnershipRewardsFypTagSetting.isEnable();
        C1ACA c1acaZ1 = z1();
        long j = 0;
        if (c1acaZ1 != null && (liveRoomStruct4 = c1acaZ1.LIZJ) != null) {
            anchorId = liveRoomStruct4.getAnchorId();
        } else {
            anchorId = 0;
        }
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 != null && (liveRoomStruct3 = c1acaZ12.LIZJ) != null) {
            j = liveRoomStruct3.id;
        }
        C1ACA c1acaZ13 = z1();
        String strLJ = "";
        if (c1acaZ13 == null || (liveRoomStruct2 = c1acaZ13.LIZJ) == null || (gameTagDetail2 = liveRoomStruct2.gameTagDetail) == null || (str2 = gameTagDetail2.gameTagName) == null) {
            str2 = "";
        }
        C1ACA c1acaZ14 = z1();
        if (c1acaZ14 == null || (liveRoomStruct = c1acaZ14.LIZJ) == null || (gameTagDetail = liveRoomStruct.gameTagDetail) == null) {
            objValueOf = "";
        } else {
            objValueOf = Integer.valueOf(gameTagDetail.gameTagId);
        }
        C1ACA c1acaZ15 = z1();
        if (c1acaZ15 != null) {
            strLJ = C1ABT.LJ(c1acaZ15);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_preview_page_info");
        c474500IjALIZ.LJJII(Long.valueOf(anchorId), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        if (zIsEnable) {
            str3 = "game_rewards";
        } else {
            str3 = "game_rewards_null";
        }
        c474500IjALIZ.LJJII(str3, "info_type");
        c474500IjALIZ.LJJII(str2, "game_name");
        c474500IjALIZ.LJJII(objValueOf, "game_id");
        c474500IjALIZ.LJJII(strLJ, "drops_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        NextLiveData<Integer> nextLiveData;
        View view = getView();
        if (view == null) {
            return;
        }
        this.LLJI = (TextView) view.findViewById(R.id.znb);
        this.LLJIJIL = (ViewGroup) view.findViewById(R.id.jt_);
        this.LLJILJIL = (C2252261DDk) view.findViewById(R.id.oig);
        this.LLJILJILJ = (TextView) view.findViewById(R.id.zne);
        this.LLJILLL = (TextView) view.findViewById(R.id.znf);
        ViewGroup viewGroup = this.LLJIJIL;
        if (viewGroup != null) {
            viewGroup.setOnTouchListener(new View.OnTouchListener() { // from class: X.1AC5
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        C786410Ut5.I7(new ACListenerS167S0100000_33(this, 43), view);
        C2271391DvN.LIZ(this.LLJILJIL, (C1A5L) C2271381DvM.LLZILL.getValue());
        C2252261DDk c2252261DDk = this.LLJILJIL;
        if (c2252261DDk != null) {
            C786410Ut5.U9(c2252261DDk, new ACListenerS167S0100000_33(this, 44));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMM1 = M1();
        if (feedLiveViewHolderVMM1 != null && (nextLiveData = feedLiveViewHolderVMM1.LLJJJJJIL) != null) {
            nextLiveData.observe(this, new AObserverS235S0100000_33(this, 15));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        NextLiveData<Unit> nextLiveData;
        super.onLoad(objArr);
        FeedLiveViewHolderVM feedLiveViewHolderVMM1 = M1();
        if (feedLiveViewHolderVMM1 != null && (nextLiveData = feedLiveViewHolderVMM1.LLJJLIIIJLLLLLLLZ) != null) {
            nextLiveData.observe(this, new AObserverS235S0100000_33(this, 16));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMM12 = M1();
        if (feedLiveViewHolderVMM12 != null && (mutableLiveData3 = feedLiveViewHolderVMM12.LLJLL) != null) {
            mutableLiveData3.observe(this, new AObserverS235S0100000_33(this, 54));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMM13 = M1();
        if (feedLiveViewHolderVMM13 != null && (mutableLiveData2 = feedLiveViewHolderVMM13.LLJLLIL) != null) {
            mutableLiveData2.observe(this, new AObserverS235S0100000_33(this, 55));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMM14 = M1();
        if (feedLiveViewHolderVMM14 != null && (mutableLiveData = feedLiveViewHolderVMM14.LLLIILIL) != null) {
            mutableLiveData.observe(this, new AObserverS235S0100000_33(this, 56));
        }
    }
}
