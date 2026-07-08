package com.ss.android.ugc.aweme.feed.adapter.widget.game.guessing;

import X.C01GW;
import X.C0IJT;
import X.C1161920gLG;
import X.C13LE;
import X.C1843500y4a;
import X.C19719912Dl;
import X.C1AC0;
import X.C1ACA;
import X.C20642515q3;
import X.C21627319kV;
import X.C2175451ABz;
import X.C2252261DDk;
import X.C474500IjA;
import X.C786410Ut5;
import X.EnumC494740Jai;
import X.ViewOnLayoutChangeListenerC2189541Ame;
import Y.ACListenerS167S0100000_33;
import Y.AObserverS235S0100000_33;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.guessing.PreviewGameGuessingWidget;
import com.ss.android.ugc.aweme.feed.model.live.GameTagDetail;
import com.ss.android.ugc.aweme.feed.model.live.GuessRound;
import com.ss.android.ugc.aweme.feed.model.live.GuessRoundStats;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes34.dex */
public final class PreviewGameGuessingWidget extends LiveWatchPreviewWidget {
    public static final C2175451ABz LLJJIJIL = new C2175451ABz();
    public static final C1AC0 LLJJJ = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).Tk1();
    public final C01GW LLJ;
    public TextView LLJI;
    public ViewGroup LLJIJIL;
    public C2252261DDk LLJILJIL;
    public TextView LLJILJILJ;
    public TextView LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public CountDownTimer LLJJIJI;
    public boolean LLJJIJIIJIL;

    public PreviewGameGuessingWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new AwS556S0100000_12(c19719912DlLIZ, 472), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
        this.LLJJIJIIJIL = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dga;
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
        TextView textView = this.LLJI;
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = this.LLJILJILJ;
        if (textView2 != null) {
            textView2.setText("");
        }
        hide();
        C1AC0 c1ac0 = LLJJJ;
        if (c1ac0 == null) {
            return;
        }
        C2175451ABz c2175451ABz = LLJJIJIL;
        C1ACA c1acaZ1 = z1();
        c2175451ABz.getClass();
        GuessRound guessRoundLIZLLL = C2175451ABz.LIZLLL(c1acaZ1, c1ac0);
        if (guessRoundLIZLLL == null) {
            return;
        }
        if (c1ac0.LIZJ()) {
            String strLIZIZ = C2175451ABz.LIZIZ(z1());
            if (TextUtils.isEmpty(strLIZIZ)) {
                TextView textView3 = this.LLJI;
                if (textView3 != null) {
                    textView3.setText(C20642515q3.LJI(2131852519));
                }
            } else {
                TextView textView4 = this.LLJI;
                if (textView4 != null) {
                    textView4.setText(strLIZIZ);
                }
            }
        } else {
            TextView textView5 = this.LLJI;
            if (textView5 != null) {
                textView5.setText(C20642515q3.LJI(2131852519));
            }
        }
        if (c1ac0.LIZ()) {
            TextView textView6 = this.LLJILJILJ;
            if (textView6 != null) {
                textView6.setText(C2175451ABz.LIZJ(guessRoundLIZLLL));
            }
        } else if (c1ac0.LIZLLL()) {
            GuessRoundStats guessRoundStats = guessRoundLIZLLL.guessRoundStats;
            long j = (guessRoundStats != null ? guessRoundStats.pointsSplitNum : 0L) / ((long) 100);
            String strLJ = j != 0 ? C20642515q3.LJ(2131755848, (int) j, C21627319kV.LIZJ().LJFF(C1843500y4a.LIZIZ(j))) : C20642515q3.LJI(2131852520);
            TextView textView7 = this.LLJILJILJ;
            if (textView7 != null) {
                textView7.setText(strLJ);
            }
        } else {
            TextView textView8 = this.LLJILJILJ;
            if (textView8 != null) {
                textView8.setText(C20642515q3.LJI(2131852518));
            }
        }
        N1(false);
    }

    public final FeedLiveViewHolderVM M1() {
        return (FeedLiveViewHolderVM) this.LLJ.getValue();
    }

    public final void O1() {
        if (!this.LLJJIJIIJIL) {
            CountDownTimer countDownTimer = this.LLJJIJI;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.LLJJIJIIJIL = true;
            if (isShowing()) {
                P1("show");
            }
        }
        this.LLJJIJIIJIL = false;
        CountDownTimer countDownTimer2 = this.LLJJIJI;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        this.LLJJIJI = new CountDownTimer() { // from class: X.1AC1
            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                PreviewGameGuessingWidget previewGameGuessingWidget = this.LIZ;
                previewGameGuessingWidget.LLJJIJIIJIL = true;
                if (previewGameGuessingWidget.isShowing()) {
                    this.LIZ.P1("show");
                }
            }

            {
                super(2000L, 1000L);
            }
        }.start();
    }

    public final void onHide() {
        if (!this.LLJJIJIIJIL) {
            CountDownTimer countDownTimer = this.LLJJIJI;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.LLJJIJIIJIL = true;
        }
        hide();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        N1(true);
        O1();
    }

    public final void N1(boolean z) {
        CharSequence text;
        View view;
        C2175451ABz c2175451ABz = LLJJIJIL;
        C1ACA c1acaZ1 = z1();
        c2175451ABz.getClass();
        if (C2175451ABz.LIZ(c1acaZ1) && !this.LLJJI && !this.LLJJ && !this.LLJJIII) {
            TextView textView = this.LLJI;
            CharSequence text2 = null;
            if (textView != null) {
                text = textView.getText();
            } else {
                text = null;
            }
            if (!TextUtils.isEmpty(text)) {
                TextView textView2 = this.LLJILJILJ;
                if (textView2 != null) {
                    text2 = textView2.getText();
                }
                if (!TextUtils.isEmpty(text2)) {
                    C2252261DDk c2252261DDk = this.LLJILJIL;
                    if (c2252261DDk != null) {
                        c2252261DDk.LIZIZ();
                    }
                    if (z && (view = getView()) != null) {
                        TextView textView3 = this.LLJILLL;
                        if (textView3 != null) {
                            textView3.setText("");
                        }
                        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2189541Ame(view, this, 2));
                    }
                    show();
                }
            }
        }
    }

    public final void P1(String str) {
        long anchorId;
        String str2;
        int i;
        LiveRoomStruct liveRoomStruct;
        GameTagDetail gameTagDetail;
        LiveRoomStruct liveRoomStruct2;
        GameTagDetail gameTagDetail2;
        LiveRoomStruct liveRoomStruct3;
        LiveRoomStruct liveRoomStruct4;
        C1AC0 c1ac0 = LLJJJ;
        if (c1ac0 == null) {
            return;
        }
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
        String str3 = "";
        if (c1acaZ13 == null || (liveRoomStruct2 = c1acaZ13.LIZJ) == null || (gameTagDetail2 = liveRoomStruct2.gameTagDetail) == null || (str2 = gameTagDetail2.gameTagName) == null) {
            str2 = "";
        }
        C1ACA c1acaZ14 = z1();
        if (c1acaZ14 != null && (liveRoomStruct = c1acaZ14.LIZJ) != null && (gameTagDetail = liveRoomStruct.gameTagDetail) != null) {
            i = gameTagDetail.gameTagId;
        } else {
            i = 0;
        }
        if (c1ac0.LIZJ()) {
            str3 = "game_name";
        } else if (c1ac0.LIZ()) {
            str3 = "game_title";
        } else if (c1ac0.LIZLLL()) {
            str3 = "game_score";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_preview_page_info");
        c474500IjALIZ.LJJII(Long.valueOf(anchorId), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII("guessing_game", "info_type");
        c474500IjALIZ.LJJII(str2, "game_name");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "game_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str3, "guessing_game_info");
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
        this.LLJIJIL = (ViewGroup) view.findViewById(R.id.jt8);
        this.LLJILJIL = (C2252261DDk) view.findViewById(R.id.oie);
        this.LLJILJILJ = (TextView) view.findViewById(R.id.zn7);
        this.LLJILLL = (TextView) view.findViewById(R.id.zn8);
        ViewGroup viewGroup = this.LLJIJIL;
        if (viewGroup != null) {
            viewGroup.setOnTouchListener(new View.OnTouchListener() { // from class: X.1AC2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        C786410Ut5.I7(new ACListenerS167S0100000_33(this, 45), view);
        C2252261DDk c2252261DDk = this.LLJILJIL;
        if (c2252261DDk != null) {
            C786410Ut5.U9(c2252261DDk, new ACListenerS167S0100000_33(this, 46));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMM1 = M1();
        if (feedLiveViewHolderVMM1 != null && (nextLiveData = feedLiveViewHolderVMM1.LLJJJJJIL) != null) {
            nextLiveData.observe(this, new AObserverS235S0100000_33(this, 17));
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
            nextLiveData.observe(this, new AObserverS235S0100000_33(this, 18));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMM12 = M1();
        if (feedLiveViewHolderVMM12 != null && (mutableLiveData3 = feedLiveViewHolderVMM12.LLJLL) != null) {
            mutableLiveData3.observe(this, new AObserverS235S0100000_33(this, 58));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMM13 = M1();
        if (feedLiveViewHolderVMM13 != null && (mutableLiveData2 = feedLiveViewHolderVMM13.LLJLLIL) != null) {
            mutableLiveData2.observe(this, new AObserverS235S0100000_33(this, 59));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMM14 = M1();
        if (feedLiveViewHolderVMM14 != null && (mutableLiveData = feedLiveViewHolderVMM14.LLLIILIL) != null) {
            mutableLiveData.observe(this, new AObserverS235S0100000_33(this, 60));
        }
    }
}
