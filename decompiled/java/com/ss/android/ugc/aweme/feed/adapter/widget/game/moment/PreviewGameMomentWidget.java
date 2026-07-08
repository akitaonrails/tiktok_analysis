package com.ss.android.ugc.aweme.feed.adapter.widget.game.moment;

import X.C01GW;
import X.C0IJT;
import X.C1161920gLG;
import X.C13LE;
import X.C152W;
import X.C152Y;
import X.C19719912Dl;
import X.C1ABT;
import X.C1ACA;
import X.C2175331ABn;
import X.C2175421ABw;
import X.C2175451ABz;
import X.C2252261DDk;
import X.C474500IjA;
import X.C786410Ut5;
import X.CountDownTimerC2189461AmW;
import X.EnumC494740Jai;
import X.InterfaceC204546152a;
import X.ViewOnLayoutChangeListenerC2189541Ame;
import Y.ACListenerS166S0100000_32;
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
import com.ss.android.ugc.aweme.feed.adapter.widget.game.PreviewGameRewardsWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.guessing.PreviewGameGuessingWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.GameTagDetail;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class PreviewGameMomentWidget extends LiveWatchPreviewWidget implements C152Y {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public TextView LLJ;
    public ViewGroup LLJI;
    public C2252261DDk LLJIJIL;
    public TextView LLJILJIL;
    public TextView LLJILJILJ;
    public InterfaceC204546152a LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public CountDownTimer LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public CountDownTimer LLJJJ;
    public boolean LLJJJIL;
    public final Map<String, String> LLJJJJ;
    public Integer LLJJJJJIL;

    public PreviewGameMomentWidget() {
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewPlayerVM.class);
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(c19719912DlLIZ, 188);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        this.LLJJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS576S0100000_32, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS576S0100000_32(c19719912DlLIZ2, 189), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJJIJIL = true;
        this.LLJJJIL = true;
        this.LLJJJJ = new LinkedHashMap();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dgc;
    }

    @Override // X.C152Y
    public final LifecycleOwner getLifecycleOwner() {
        return this;
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
        IMessageManager iMessageManager;
        LivePreviewPlayerVM livePreviewPlayerVM;
        MutableLiveData<String> mutableLiveData;
        String str;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        GameTagDetail gameTagDetail;
        LiveRoomStruct liveRoomStruct3;
        GameTagDetail gameTagDetail2;
        LiveRoomStruct liveRoomStruct4;
        GameTagDetail gameTagDetail3;
        InterfaceC204546152a interfaceC204546152a = this.LLJILLL;
        if (interfaceC204546152a == null) {
            return;
        }
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            C1ABT.LJIILL(c1acaZ1);
        }
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 == null || (iMessageManager = c1acaZ12.LJJIIZ) == null || (livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLJJ.getValue()) == null || (mutableLiveData = livePreviewPlayerVM.LLIZLLLIL) == null) {
            return;
        }
        C1ACA c1acaZ13 = z1();
        boolean z = (c1acaZ13 == null || (liveRoomStruct4 = c1acaZ13.LIZJ) == null || (gameTagDetail3 = liveRoomStruct4.gameTagDetail) == null) ? false : gameTagDetail3.previewGameMomentEnable;
        C1ACA c1acaZ14 = z1();
        Integer numValueOf = (c1acaZ14 == null || (liveRoomStruct3 = c1acaZ14.LIZJ) == null || (gameTagDetail2 = liveRoomStruct3.gameTagDetail) == null) ? null : Integer.valueOf(gameTagDetail2.gameTagId);
        C1ACA c1acaZ15 = z1();
        String str2 = "";
        if (c1acaZ15 == null || (liveRoomStruct2 = c1acaZ15.LIZJ) == null || (gameTagDetail = liveRoomStruct2.gameTagDetail) == null || (str = gameTagDetail.displayName) == null) {
            str = "";
        }
        if (numValueOf != null && numValueOf.intValue() != -1) {
            str2 = str;
        }
        C1ACA c1acaZ16 = z1();
        interfaceC204546152a.LJII(z, iMessageManager, mutableLiveData, str2, (c1acaZ16 == null || (liveRoomStruct = c1acaZ16.LIZJ) == null) ? 0L : liveRoomStruct.id);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        C1ACA c1acaZ1;
        IMessageManager iMessageManager;
        LivePreviewPlayerVM livePreviewPlayerVM;
        MutableLiveData<String> mutableLiveData;
        LiveRoomStruct liveRoomStruct;
        GameTagDetail gameTagDetail;
        InterfaceC204546152a interfaceC204546152a = this.LLJILLL;
        if (interfaceC204546152a == null || (c1acaZ1 = z1()) == null || (iMessageManager = c1acaZ1.LJJIIZ) == null || (livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLJJ.getValue()) == null || (mutableLiveData = livePreviewPlayerVM.LLIZLLLIL) == null) {
            return;
        }
        C1ACA c1acaZ12 = z1();
        boolean z = (c1acaZ12 == null || (liveRoomStruct = c1acaZ12.LIZJ) == null || (gameTagDetail = liveRoomStruct.gameTagDetail) == null) ? false : gameTagDetail.previewGameMomentEnable;
        if (!this.LLJJJIL) {
            CountDownTimer countDownTimer = this.LLJJJ;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            if (isShowing()) {
                O1("show", true);
            } else {
                O1("show", false);
            }
        }
        hide();
        clearData();
        interfaceC204546152a.LJFF(z, iMessageManager, mutableLiveData);
    }

    @Override // X.C152Y
    public final String LLIIIZ() {
        CharSequence text;
        TextView textView = this.LLJ;
        if (textView == null || (text = textView.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    @Override // X.C152Y
    public final String LLLIILIL() {
        CharSequence text;
        TextView textView = this.LLJILJIL;
        if (textView == null || (text = textView.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    public final FeedLiveViewHolderVM M1() {
        return (FeedLiveViewHolderVM) this.LLJJI.getValue();
    }

    public final void N1() {
        if (!this.LLJJIJIL) {
            CountDownTimer countDownTimer = this.LLJJIJIIJIL;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.LLJJIJIL = true;
            if (isShowing()) {
                P1("show");
            }
        }
        this.LLJJIJIL = false;
        CountDownTimer countDownTimer2 = this.LLJJIJIIJIL;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        this.LLJJIJIIJIL = new CountDownTimerC2189461AmW(this, 1).start();
        this.LLJJJIL = false;
        this.LLJJJ = new CountDownTimerC2189461AmW(this, 2).start();
    }

    @Override // X.C152Y
    public final void clearData() {
        TextView textView = this.LLJ;
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = this.LLJILJIL;
        if (textView2 != null) {
            textView2.setText("");
        }
    }

    @Override // X.C152Y
    public final boolean LLLLZIL() {
        return isShowing();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        C1ACA c1acaZ1;
        IMessageManager iMessageManager;
        LivePreviewPlayerVM livePreviewPlayerVM;
        boolean z;
        LiveRoomStruct liveRoomStruct;
        GameTagDetail gameTagDetail;
        super.LJJIJIIJIL(i);
        InterfaceC204546152a interfaceC204546152a = this.LLJILLL;
        if (interfaceC204546152a != null && (c1acaZ1 = z1()) != null && (iMessageManager = c1acaZ1.LJJIIZ) != null && (livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLJJ.getValue()) != null && livePreviewPlayerVM.LLIZLLLIL != null) {
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 != null && (liveRoomStruct = c1acaZ12.LIZJ) != null && (gameTagDetail = liveRoomStruct.gameTagDetail) != null) {
                z = gameTagDetail.previewGameMomentEnable;
            } else {
                z = false;
            }
            interfaceC204546152a.LJ(z, iMessageManager);
            N1();
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
        InterfaceC204546152a interfaceC204546152a = this.LLJILLL;
        if (interfaceC204546152a == null) {
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
        if (c1acaZ13 == null || (liveRoomStruct2 = c1acaZ13.LIZJ) == null || (gameTagDetail2 = liveRoomStruct2.gameTagDetail) == null || (str2 = gameTagDetail2.gameTagName) == null) {
            str2 = "";
        }
        C1ACA c1acaZ14 = z1();
        if (c1acaZ14 != null && (liveRoomStruct = c1acaZ14.LIZJ) != null && (gameTagDetail = liveRoomStruct.gameTagDetail) != null) {
            i = gameTagDetail.gameTagId;
        } else {
            i = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_preview_page_info");
        c474500IjALIZ.LJJII(Long.valueOf(anchorId), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII("highlight_moment", "info_type");
        c474500IjALIZ.LJJII(interfaceC204546152a.LIZ(), "highlight_moment_type");
        c474500IjALIZ.LJJII(str2, "game_name");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "game_id");
        c474500IjALIZ.LJJII(interfaceC204546152a.LIZLLL(), "highlight_moment_detail");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.C152Y
    public final void k(boolean z) {
        MutableLiveData<Integer> mutableLiveData;
        FeedLiveViewHolderVM feedLiveViewHolderVMM1 = M1();
        if (feedLiveViewHolderVMM1 != null && (mutableLiveData = feedLiveViewHolderVMM1.LLLIILIL) != null) {
            mutableLiveData.setValue(0);
        }
        if (!this.LLJJIJIL) {
            CountDownTimer countDownTimer = this.LLJJIJIIJIL;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.LLJJIJIL = true;
            if (!z && isShowing()) {
                P1("show");
            }
        }
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        NextLiveData<Integer> nextLiveData;
        View view = getView();
        if (view == null) {
            return;
        }
        this.LLJ = (TextView) view.findViewById(R.id.znb);
        this.LLJI = (ViewGroup) view.findViewById(R.id.jt9);
        this.LLJIJIL = (C2252261DDk) view.findViewById(R.id.oif);
        this.LLJILJIL = (TextView) view.findViewById(R.id.zn4);
        this.LLJILJILJ = (TextView) view.findViewById(R.id.zn5);
        ViewGroup viewGroup = this.LLJI;
        if (viewGroup != null) {
            viewGroup.setOnTouchListener(new View.OnTouchListener() { // from class: X.18L1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        C786410Ut5.I7(new ACListenerS166S0100000_32(this, 21), view);
        C2252261DDk c2252261DDk = this.LLJIJIL;
        if (c2252261DDk != null) {
            C786410Ut5.U9(c2252261DDk, new ACListenerS166S0100000_32(this, 22));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMM1 = M1();
        if (feedLiveViewHolderVMM1 != null && (nextLiveData = feedLiveViewHolderVMM1.LLJJJJJIL) != null) {
            nextLiveData.observe(this, new AObserverS235S0100000_33(this, 19));
        }
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).hY();
        this.LLJILLL = new C152W(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        NextLiveData<Unit> nextLiveData;
        super.onLoad(objArr);
        FeedLiveViewHolderVM feedLiveViewHolderVMM1 = M1();
        if (feedLiveViewHolderVMM1 != null && (nextLiveData = feedLiveViewHolderVMM1.LLJJLIIIJLLLLLLLZ) != null) {
            nextLiveData.observe(this, new AObserverS235S0100000_33(this, 20));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMM12 = M1();
        if (feedLiveViewHolderVMM12 != null && (mutableLiveData2 = feedLiveViewHolderVMM12.LLJLL) != null) {
            mutableLiveData2.observe(this, new AObserverS235S0100000_33(this, 61));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMM13 = M1();
        if (feedLiveViewHolderVMM13 != null && (mutableLiveData = feedLiveViewHolderVMM13.LLJLLIL) != null) {
            mutableLiveData.observe(this, new AObserverS235S0100000_33(this, 62));
        }
    }

    @Override // X.C152Y
    public final void x(Integer num) {
        InterfaceC204546152a interfaceC204546152a;
        CharSequence text;
        long j;
        long anchorId;
        String str;
        LiveRoomStruct liveRoomStruct;
        GameTagDetail gameTagDetail;
        LiveRoomStruct liveRoomStruct2;
        GameTagDetail gameTagDetail2;
        String str2;
        LiveRoomStruct liveRoomStruct3;
        LiveRoomStruct liveRoomStruct4;
        MutableLiveData<Integer> mutableLiveData;
        LiveRoomStruct liveRoomStruct5;
        Integer num2 = num;
        if (!C2175331ABn.LIZ(z1())) {
            return;
        }
        if (num2 != null || (num2 = this.LLJJJJJIL) != null) {
            int iIntValue = num2.intValue();
            int i = 0;
            if (!this.LLJJIJI && !this.LLJJIII) {
                if (iIntValue != 1) {
                    if (iIntValue != 2) {
                        if (iIntValue != 3) {
                            return;
                        }
                    } else {
                        C2175421ABw c2175421ABw = PreviewGameRewardsWidget.LLJJJIL;
                        C1ACA c1acaZ1 = z1();
                        c2175421ABw.getClass();
                        if (C2175421ABw.LIZ(c1acaZ1)) {
                            LLLLLZIL("higher_priority_showing", "", "", "", "game_rewards");
                            return;
                        }
                        C2175451ABz c2175451ABz = PreviewGameGuessingWidget.LLJJIJIL;
                        C1ACA c1acaZ12 = z1();
                        c2175451ABz.getClass();
                        if (C2175451ABz.LIZ(c1acaZ12)) {
                            LLLLLZIL("higher_priority_showing", "", "", "", "guessing_game");
                            return;
                        }
                    }
                } else {
                    C2175421ABw c2175421ABw2 = PreviewGameRewardsWidget.LLJJJIL;
                    C1ACA c1acaZ13 = z1();
                    c2175421ABw2.getClass();
                    if (C2175421ABw.LIZ(c1acaZ13)) {
                        LLLLLZIL("higher_priority_showing", "", "", "", "game_rewards");
                        return;
                    }
                    C2175451ABz c2175451ABz2 = PreviewGameGuessingWidget.LLJJIJIL;
                    C1ACA c1acaZ14 = z1();
                    c2175451ABz2.getClass();
                    if (C2175451ABz.LIZ(c1acaZ14)) {
                        LLLLLZIL("higher_priority_showing", "", "", "", "guessing_game");
                        return;
                    }
                }
                View view = getView();
                if (view != null && (interfaceC204546152a = this.LLJILLL) != null && !this.LLJJIJI && !this.LLJJIII) {
                    TextView textView = this.LLJ;
                    CharSequence text2 = null;
                    if (textView != null) {
                        text = textView.getText();
                    } else {
                        text = null;
                    }
                    if (!TextUtils.isEmpty(text)) {
                        TextView textView2 = this.LLJ;
                        if (textView2 != null) {
                            text2 = textView2.getText();
                        }
                        if (!TextUtils.isEmpty(text2)) {
                            TextView textView3 = this.LLJILJILJ;
                            String str3 = "";
                            if (textView3 != null) {
                                textView3.setText("");
                            }
                            C2252261DDk c2252261DDk = this.LLJIJIL;
                            if (c2252261DDk != null) {
                                c2252261DDk.LIZIZ();
                            }
                            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2189541Ame(view, this, 0));
                            show();
                            C1ACA c1acaZ15 = z1();
                            long j2 = 0;
                            if (c1acaZ15 != null && (liveRoomStruct5 = c1acaZ15.LIZJ) != null) {
                                j = liveRoomStruct5.id;
                            } else {
                                j = 0;
                            }
                            interfaceC204546152a.LJI(j);
                            this.LLJJJJJIL = Integer.valueOf(iIntValue);
                            FeedLiveViewHolderVM feedLiveViewHolderVMM1 = M1();
                            if (feedLiveViewHolderVMM1 != null && (mutableLiveData = feedLiveViewHolderVMM1.LLLIILIL) != null) {
                                mutableLiveData.setValue(Integer.valueOf(iIntValue));
                            }
                            InterfaceC204546152a interfaceC204546152a2 = this.LLJILLL;
                            if (interfaceC204546152a2 != null) {
                                C1ACA c1acaZ16 = z1();
                                if (c1acaZ16 != null && (liveRoomStruct4 = c1acaZ16.LIZJ) != null) {
                                    anchorId = liveRoomStruct4.getAnchorId();
                                } else {
                                    anchorId = 0;
                                }
                                C1ACA c1acaZ17 = z1();
                                if (c1acaZ17 != null && (liveRoomStruct3 = c1acaZ17.LIZJ) != null) {
                                    j2 = liveRoomStruct3.id;
                                }
                                C1ACA c1acaZ18 = z1();
                                if (c1acaZ18 == null || (str = c1acaZ18.LIZLLL) == null) {
                                    str = "";
                                }
                                C1ACA c1acaZ19 = z1();
                                if (c1acaZ19 != null && (liveRoomStruct2 = c1acaZ19.LIZJ) != null && (gameTagDetail2 = liveRoomStruct2.gameTagDetail) != null && (str2 = gameTagDetail2.gameTagName) != null) {
                                    str3 = str2;
                                }
                                C1ACA c1acaZ110 = z1();
                                if (c1acaZ110 != null && (liveRoomStruct = c1acaZ110.LIZJ) != null && (gameTagDetail = liveRoomStruct.gameTagDetail) != null) {
                                    i = gameTagDetail.gameTagId;
                                }
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_highlight_moment_broadcast_show");
                                c474500IjALIZ.LJIJJLI(this.dataChannel);
                                c474500IjALIZ.LJJII(Long.valueOf(anchorId), "anchor_id");
                                c474500IjALIZ.LJJII(Long.valueOf(j2), "room_id");
                                c474500IjALIZ.LJJII(str, "enter_from_merge");
                                c474500IjALIZ.LJJII("audience", "user_type");
                                c474500IjALIZ.LJJII(interfaceC204546152a2.LIZ(), "highlight_moment_type");
                                c474500IjALIZ.LJJII("preview_page", "show_position");
                                c474500IjALIZ.LJJII(str3, "game_name");
                                c474500IjALIZ.LJJII(Integer.valueOf(i), "game_id");
                                c474500IjALIZ.LJJII(interfaceC204546152a2.LIZLLL(), "highlight_moment_detail");
                                c474500IjALIZ.LIZ();
                            }
                        }
                    }
                }
            }
        }
    }

    public final void O1(String str, boolean z) {
        long anchorId;
        String str2;
        int i;
        LiveRoomStruct liveRoomStruct;
        GameTagDetail gameTagDetail;
        LiveRoomStruct liveRoomStruct2;
        GameTagDetail gameTagDetail2;
        LiveRoomStruct liveRoomStruct3;
        LiveRoomStruct liveRoomStruct4;
        InterfaceC204546152a interfaceC204546152a = this.LLJILLL;
        if (interfaceC204546152a == null) {
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
        if (c1acaZ13 == null || (liveRoomStruct2 = c1acaZ13.LIZJ) == null || (gameTagDetail2 = liveRoomStruct2.gameTagDetail) == null || (str2 = gameTagDetail2.gameTagName) == null) {
            str2 = "";
        }
        C1ACA c1acaZ14 = z1();
        if (c1acaZ14 != null && (liveRoomStruct = c1acaZ14.LIZJ) != null && (gameTagDetail = liveRoomStruct.gameTagDetail) != null) {
            i = gameTagDetail.gameTagId;
        } else {
            i = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_preview_page_info_new");
        c474500IjALIZ.LJJII(Long.valueOf(anchorId), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII(str2, "game_name");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "game_id");
        c474500IjALIZ.LJJII(str, "action_type");
        if (Intrinsics.LJFF(str, "show")) {
            ((LinkedHashMap) this.LLJJJJ).clear();
            if (z) {
                this.LLJJJJ.put("is_highlight", "1");
                this.LLJJJJ.put("highlight_moment_type", interfaceC204546152a.LIZ());
                this.LLJJJJ.put("highlight_moment_detail", interfaceC204546152a.LIZLLL());
            } else {
                this.LLJJJJ.put("is_highlight", CardStruct.IStatusCode.DEFAULT);
            }
            c474500IjALIZ.LJJIIZI(this.LLJJJJ);
            c474500IjALIZ.LIZ();
            return;
        }
        c474500IjALIZ.LJJIIZI(this.LLJJJJ);
        c474500IjALIZ.LIZ();
    }

    @Override // X.C152Y
    public final void w1(CharSequence charSequence, CharSequence charSequence2) {
        TextView textView;
        TextView textView2 = this.LLJ;
        if (textView2 == null || (textView = this.LLJILJIL) == null) {
            return;
        }
        textView2.setText(charSequence);
        textView.setText(charSequence2);
    }

    @Override // X.C152Y
    public final void LLLLLZIL(String str, String str2, String str3, String str4, String str5) {
        long anchorId;
        String str6;
        int i;
        String str7;
        LiveRoomStruct liveRoomStruct;
        GameTagDetail gameTagDetail;
        LiveRoomStruct liveRoomStruct2;
        GameTagDetail gameTagDetail2;
        LiveRoomStruct liveRoomStruct3;
        LiveRoomStruct liveRoomStruct4;
        InterfaceC204546152a interfaceC204546152a = this.LLJILLL;
        if (interfaceC204546152a == null) {
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
        String str8 = "";
        if (c1acaZ13 == null || (liveRoomStruct2 = c1acaZ13.LIZJ) == null || (gameTagDetail2 = liveRoomStruct2.gameTagDetail) == null || (str6 = gameTagDetail2.gameTagName) == null) {
            str6 = "";
        }
        C1ACA c1acaZ14 = z1();
        if (c1acaZ14 != null && (liveRoomStruct = c1acaZ14.LIZJ) != null && (gameTagDetail = liveRoomStruct.gameTagDetail) != null) {
            i = gameTagDetail.gameTagId;
        } else {
            i = 0;
        }
        C1ACA c1acaZ15 = z1();
        if (c1acaZ15 != null && (str7 = c1acaZ15.LIZLLL) != null) {
            str8 = str7;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_preview_game_moment_abnormal");
        c474500IjALIZ.LJJII(Long.valueOf(anchorId), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII("highlight_moment", "info_type");
        c474500IjALIZ.LJJII(interfaceC204546152a.LIZ(), "highlight_moment_type");
        c474500IjALIZ.LJJII(str6, "game_name");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "game_id");
        c474500IjALIZ.LJJII(interfaceC204546152a.LIZLLL(), "highlight_moment_detail");
        c474500IjALIZ.LJJII(str8, "enter_from_merge");
        c474500IjALIZ.LJJII(str, "type");
        c474500IjALIZ.LJJII(str2, "text_detail");
        c474500IjALIZ.LJJII(str3, "time_detail");
        c474500IjALIZ.LJJII(str4, "time_sei");
        c474500IjALIZ.LJJII(str5, "higher_priority_detail");
        c474500IjALIZ.LIZ();
    }
}
