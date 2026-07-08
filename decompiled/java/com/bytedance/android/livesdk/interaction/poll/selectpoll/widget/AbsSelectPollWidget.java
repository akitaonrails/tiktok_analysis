package com.bytedance.android.livesdk.interaction.poll.selectpoll.widget;

import X.C001A;
import X.C01GW;
import X.C0IJT;
import X.C1078480eAg;
import X.C1086830eO9;
import X.C1151690g4l;
import X.C13BV;
import X.C15438062q;
import X.C158B;
import X.C1697810uHb;
import X.C20441214yg;
import X.C2188811AlT;
import X.C292401Bi;
import X.C474500IjA;
import X.C497740JfY;
import X.C501470JlZ;
import X.C766270U4b;
import X.C786410Ut5;
import X.C963140bAe;
import X.CountDownTimerC1151440g4M;
import X.InterfaceC1097170eep;
import Y.AObserverS221S0100000_17;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.publicscreen.api.WarningInfoVisibilityEvent;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SelectPollShowChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollDurationSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollSetting;
import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdk.model.message.PollUpdateVotesContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class AbsSelectPollWidget extends AnimatableRecyclableWidget {
    public PollStartContent LLILLJJLI;
    public int LLILZ;
    public long LLILZIL;
    public PollUpdateVotesContent LLILZLL;
    public boolean LLIZ;
    public SelectPollViewModel LLJILJIL;
    public long LLJILJILJ;
    public Room LLJILLL;
    public final String LL = "poll_logger";
    public String LLILLL = "";
    public final C01GW LLIZLLLIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 219));
    public final C01GW LLJ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(66));
    public final C01GW LLJI = C292401Bi.LIZ(new AwS561S0100000_17(this, 220));
    public final C01GW LLJIJIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 221));

    public void F1(long j) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hun;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final int A1() {
        return ((Number) this.LLJI.getValue()).intValue();
    }

    public final LinearLayout B1() {
        return (LinearLayout) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(SelectPollShowChannel.class, 0);
        }
        cancelHideAnimation();
        animateHide();
        y1();
    }

    public final void x1() {
        PollUpdateVotesContent pollUpdateVotesContent = this.LLILZLL;
        if (pollUpdateVotesContent != null) {
            String strLIZIZ = "";
            long j = 0;
            int i = 0;
            for (PollOptionInfo pollOptionInfo : pollUpdateVotesContent.optionList) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                PollOptionInfo pollOptionInfo2 = pollOptionInfo;
                if (pollOptionInfo2 != null) {
                    if (i == 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append('{');
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    long j2 = pollOptionInfo2.votes;
                    if (j < j2) {
                        j = j2;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append('\'');
                    sbLIZ2.append(pollOptionInfo2.displayContent);
                    sbLIZ2.append(':');
                    sbLIZ2.append(pollOptionInfo2.votes);
                    sbLIZ2.append('\'');
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strLIZIZ2);
                    sbLIZ3.append(i < pollUpdateVotesContent.optionList.size() + (-1) ? "," : "}");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                }
                i = i2;
            }
        }
    }

    public final void y1() {
        Fragment fragment;
        SelectPollViewModel selectPollViewModel = this.LLJILJIL;
        if (selectPollViewModel != null) {
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null) {
                ((LiveData) selectPollViewModel.LLILZ.getValue()).removeObservers(fragment);
                ((LiveData) selectPollViewModel.LLILZIL.getValue()).removeObservers(fragment);
                selectPollViewModel.vQ2().removeObservers(fragment);
                ((LiveData) selectPollViewModel.LLIZLLLIL.getValue()).removeObservers(fragment);
            }
            C1086830eO9.LIZLLL = false;
            CountDownTimerC1151440g4M countDownTimerC1151440g4M = selectPollViewModel.LLJ;
            if (countDownTimerC1151440g4M != null) {
                countDownTimerC1151440g4M.cancel();
            }
        }
        this.LLILLJJLI = null;
        this.LLILLL = "";
        this.LLILZIL = 0L;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationEnd() {
        super.onHideAnimationEnd();
        z1(true);
        super.hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void show() {
        long millisecond;
        TextPaint paint;
        LinearLayout linearLayoutB1;
        cancelShowAnimation();
        animateShow();
        PollStartContent pollStartContent = this.LLILLJJLI;
        if (pollStartContent != null) {
            if (this.LLIZ) {
                millisecond = LivePollDurationSetting.INSTANCE.getMillisecond();
                try {
                    TextView textView = (TextView) this.LLIZLLLIL.getValue();
                    if (textView != null) {
                        long j = LSPassThroughRecordSizeConfig.DEFAULT;
                        textView.setText(C497740JfY.LJIIL(2131755587, (int) (millisecond / j), String.valueOf(millisecond / j)));
                    }
                    List<String> optionList = LivePollSetting.INSTANCE.getOptionList();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(optionList, 10));
                    for (String str : optionList) {
                        List<PollOptionInfo> list = pollStartContent.optionList;
                        PollOptionInfo pollOptionInfo = new PollOptionInfo();
                        pollOptionInfo.displayContent = str;
                        arrayList.add(Boolean.valueOf(list.add(pollOptionInfo)));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJ(this.LL, e.getMessage());
                    return;
                }
            } else {
                millisecond = pollStartContent.endTime - C158B.LIZ();
                this.LLJILJILJ = millisecond;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LL);
                sbLIZ.append("total_time");
                C20441214yg.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), String.valueOf(millisecond));
                SelectPollViewModel selectPollViewModel = this.LLJILJIL;
                if (selectPollViewModel != null) {
                    CountDownTimerC1151440g4M countDownTimerC1151440g4M = selectPollViewModel.LLJ;
                    if (countDownTimerC1151440g4M != null) {
                        countDownTimerC1151440g4M.cancel();
                    }
                    if (millisecond <= 0) {
                        ((LiveData) selectPollViewModel.LLIZLLLIL.getValue()).setValue(0L);
                    } else {
                        CountDownTimerC1151440g4M countDownTimerC1151440g4M2 = new CountDownTimerC1151440g4M(millisecond, selectPollViewModel, 1);
                        selectPollViewModel.LLJ = countDownTimerC1151440g4M2;
                        countDownTimerC1151440g4M2.start();
                    }
                }
                F1(millisecond);
            }
            D1(this.LLILZIL, pollStartContent.optionList);
            TextView textView2 = (TextView) this.LLIZLLLIL.getValue();
            if (textView2 != null && (paint = textView2.getPaint()) != null) {
                long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                try {
                    int iMeasureText = (int) paint.measureText(C497740JfY.LJIIL(2131755587, (int) (millisecond / j2), String.valueOf(millisecond / j2)));
                    if (iMeasureText > 0 && (linearLayoutB1 = B1()) != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayoutB1.getLayoutParams();
                        if (C497740JfY.LJJ()) {
                            marginLayoutParams.rightMargin = iMeasureText + A1();
                        } else {
                            marginLayoutParams.leftMargin = iMeasureText + A1();
                        }
                        C786410Ut5.d6(linearLayoutB1, marginLayoutParams);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(SelectPollShowChannel.class, Integer.valueOf(C497740JfY.LJIIIZ(R.dimen.ayc)));
        }
        super.show();
    }

    public final void C1(PollData pollData) {
        if (pollData.endTime <= C963140bAe.LIZIZ()) {
            hide();
            return;
        }
        this.LLILZIL = pollData.pollId;
        if (pollData.pollStatus != 1) {
            return;
        }
        PollStartContent pollStartContent = new PollStartContent();
        pollStartContent.endTime = pollData.endTime;
        pollStartContent.optionList = pollData.pollOptionList;
        this.LLILLJJLI = pollStartContent;
        show();
    }

    public final void E1(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_poll_click_failed");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(this.LLILZIL), "poll_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLJILJILJ), "time_remain");
        c474500IjALIZ.LJJII(str, "fail_reason");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_custom");
        c474500IjALIZ.LJ("click");
        c474500IjALIZ.LIZ();
    }

    public void G1(Throwable th) {
        ConstraintProperty constraintPropertyById;
        z1(true);
        LayeredElementContext layeredElementContext = getLayeredElementContext();
        if (layeredElementContext != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(getId())) != null) {
            constraintPropertyById.alpha(1.0f);
        }
        String str = "network_error";
        if (th instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
            switch (c501470JlZ.getErrorCode()) {
                case 4003095:
                    hide();
                    str = "timeout";
                    break;
                case 4003096:
                    break;
                default:
                    str = "other";
                    break;
            }
            E1(str);
            return;
        }
        if (Intrinsics.LJFF(th.getMessage(), "user dismiss")) {
            return;
        }
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131843819));
        E1("network_error");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H1(com.bytedance.android.livesdk.model.message.PollMessage r10) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget.H1(com.bytedance.android.livesdk.model.message.PollMessage):void");
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onUnload(RecycleSource recycleSource) {
        IMessageManager iMessageManager;
        y1();
        SelectPollViewModel selectPollViewModel = this.LLJILJIL;
        if (selectPollViewModel != null && (iMessageManager = selectPollViewModel.LLJI) != null) {
            iMessageManager.removeMessageListener(selectPollViewModel);
        }
        this.LLJILJIL = null;
    }

    public final void z1(boolean z) {
        int childCount = B1().getChildCount();
        for (int i = 0; i < childCount; i++) {
            B1().getChildAt(i).setEnabled(z);
        }
    }

    public void D1(long j, List list) {
        C786410Ut5.LJJJJJL(B1());
        if (this.LLILZLL == null) {
            PollUpdateVotesContent pollUpdateVotesContent = new PollUpdateVotesContent();
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            pollUpdateVotesContent.optionList = list;
            this.LLILZLL = pollUpdateVotesContent;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onLoad(RecycleSource recycleSource, Object[] objArr) {
        boolean zBooleanValue;
        SelectPollViewModel selectPollViewModel;
        Object obj;
        IMessage iMessage;
        SelectPollViewModel selectPollViewModel2;
        LiveData liveData;
        NextLiveData<Throwable> nextLiveDataVQ2;
        LiveData liveData2;
        IMessageManager iMessageManager;
        DataChannel dataChannel;
        Boolean bool;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLIZ = zBooleanValue;
        this.LLJILLL = (Room) this.dataChannel.gg0(RoomChannel.class);
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null) {
            selectPollViewModel = (SelectPollViewModel) ViewModelProviders.of(interfaceC1097170eep.getFragment(), new C1151690g4l(this, 0)).get(SelectPollViewModel.class);
        } else {
            selectPollViewModel = null;
        }
        this.LLJILJIL = selectPollViewModel;
        if (!this.LLIZ && (dataChannel = this.dataChannel) != null) {
            dataChannel.EQ2(this, WarningInfoVisibilityEvent.class, new AwS596S0100000_17(this, 183));
            dataChannel.EQ2(this, HighPrioritySlotVisibilityChannel.class, new AwS596S0100000_17(this, 184));
            dataChannel.EQ2(this, HighPriorityTooltipVisibilityChannel.class, new AwS596S0100000_17(this, 185));
        }
        SelectPollViewModel selectPollViewModel3 = this.LLJILJIL;
        if (selectPollViewModel3 != null && (iMessageManager = selectPollViewModel3.LLJI) != null) {
            iMessageManager.addMessageListener(C001A.LIVE_POLL_MESSAGE.getIntType(), selectPollViewModel3);
        }
        SelectPollViewModel selectPollViewModel4 = this.LLJILJIL;
        if (selectPollViewModel4 != null && (liveData2 = (LiveData) selectPollViewModel4.LLILZIL.getValue()) != null) {
            liveData2.observe(this, new AObserverS221S0100000_17(this, 13));
        }
        SelectPollViewModel selectPollViewModel5 = this.LLJILJIL;
        if (selectPollViewModel5 != null && (nextLiveDataVQ2 = selectPollViewModel5.vQ2()) != null) {
            nextLiveDataVQ2.observe(this, new AObserverS221S0100000_17(this, 14));
        }
        SelectPollViewModel selectPollViewModel6 = this.LLJILJIL;
        if (selectPollViewModel6 != null && (liveData = (LiveData) selectPollViewModel6.LLIZLLLIL.getValue()) != null) {
            liveData.observe(this, new AObserverS221S0100000_17(this, 15));
        }
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C1078480eAg) && (((obj = ((C1078480eAg) obj2).LIZ) == null || (obj instanceof IMessage)) && (iMessage = (IMessage) obj) != null && (selectPollViewModel2 = this.LLJILJIL) != null)) {
                    selectPollViewModel2.onMessage(iMessage);
                }
            }
        }
        this.dataChannel.BQ2(this, SubOnlyLiveAudienceStatusChannel.class, new AwS596S0100000_17(this, 186));
    }
}
