package com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget;

import X.C001A;
import X.C1078480eAg;
import X.C1086690eNv;
import X.C1086830eO9;
import X.C13BV;
import X.C158B;
import X.C16F5;
import X.C21567019am;
import X.C482260Ivg;
import X.C497740JfY;
import X.C776250Uch;
import X.C780320UjG;
import X.C786410Ut5;
import X.C963140bAe;
import X.CountDownTimerC1086840eOA;
import X.EnumC1086920eOI;
import X.EnumC1087550ePJ;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS1S0100200_17;
import android.content.Context;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SelectPollVoteEvent;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget;
import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.PollInfo;
import com.bytedance.android.livesdk.model.UserVoteInfo;
import com.bytedance.android.livesdk.model.message.PollEndContent;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdk.model.message.PollUpdateVotesContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class LiveAbsPollEffectWidget extends LiveRecyclableWidget implements OnMessageListener {
    public final int LL;
    public C21567019am LLILLJJLI;
    public C16F5 LLILLL;
    public IMessageManager LLILZ;
    public CountDownTimerC1086840eOA LLILZIL;
    public PollStartContent LLILZLL;
    public List<PollOptionInfo> LLIZ;
    public PollMessage LLIZLLLIL;
    public boolean LLJ;
    public Room LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public long LLJILLL;
    public long LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public final long LLJJIJI;
    public final long LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public long LLJJJ;
    public boolean LLJJJIL;
    public int LLJJJJ;
    public long LLJJJJJIL;

    public LiveAbsPollEffectWidget() {
        this(0);
    }

    public void G1(int i) {
    }

    public void O1() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C21567019am A1() {
        C21567019am c21567019am = this.LLILLJJLI;
        if (c21567019am != null) {
            return c21567019am;
        }
        return null;
    }

    public final void C1() {
        List<PollOptionInfo> list;
        UserVoteInfo userVoteInfo;
        Integer numValueOf;
        UserVoteInfo userVoteInfo2;
        PollData pollData;
        PollData pollData2;
        PollData pollData3;
        PollData pollData4;
        PollData pollData5;
        PollData pollData6;
        PollData pollData7;
        Room room = this.LLJI;
        if (room != null) {
            this.LLIZLLLIL = new PollMessage();
            PollInfo pollInfo = room.advancedPollInfo;
            long j = 0;
            if (((pollInfo == null || (pollData7 = pollInfo.pollData) == null) ? 0L : pollData7.endTime) <= C963140bAe.LIZIZ()) {
                hide();
                return;
            }
            PollMessage pollMessage = this.LLIZLLLIL;
            if (pollMessage != null) {
                pollMessage.messageType = 2L;
            }
            PollInfo pollInfo2 = room.advancedPollInfo;
            C1086830eO9.LIZIZ = (pollInfo2 == null || (pollData6 = pollInfo2.pollData) == null) ? 0L : pollData6.pollId;
            if (pollMessage != null) {
                pollMessage.pollId = (pollInfo2 == null || (pollData5 = pollInfo2.pollData) == null) ? 0L : pollData5.pollId;
            }
            int i = 0;
            if (pollMessage != null) {
                pollMessage.pollKind = (pollInfo2 == null || (pollData4 = pollInfo2.pollData) == null) ? 0 : Integer.valueOf(pollData4.pollKind);
            }
            PollStartContent pollStartContent = new PollStartContent();
            PollInfo pollInfo3 = room.advancedPollInfo;
            pollStartContent.startTime = (pollInfo3 == null || (pollData3 = pollInfo3.pollData) == null) ? 0L : pollData3.startTime;
            if (pollInfo3 != null && (pollData2 = pollInfo3.pollData) != null) {
                j = pollData2.endTime;
            }
            pollStartContent.endTime = j;
            PollMessage pollMessage2 = this.LLIZLLLIL;
            if (pollMessage2 != null) {
                pollMessage2.startContent = pollStartContent;
            }
            this.LLILZLL = pollStartContent;
            PollUpdateVotesContent pollUpdateVotesContent = new PollUpdateVotesContent();
            PollInfo pollInfo4 = room.advancedPollInfo;
            if (pollInfo4 == null || (pollData = pollInfo4.pollData) == null || (list = pollData.pollOptionList) == null) {
                list = C13BV.INSTANCE;
            }
            pollUpdateVotesContent.optionList = list;
            PollMessage pollMessage3 = this.LLIZLLLIL;
            if (pollMessage3 != null) {
                pollMessage3.updateContent = pollUpdateVotesContent;
            }
            boolean z = (pollInfo4 == null || (userVoteInfo2 = pollInfo4.userVoteInfo) == null) ? false : userVoteInfo2.hasVoted;
            this.LLJJI = 0;
            if (z) {
                if (pollInfo4 != null && (userVoteInfo = pollInfo4.userVoteInfo) != null && (numValueOf = Integer.valueOf(userVoteInfo.voteOptionIndex)) != null) {
                    if (numValueOf.intValue() == 0) {
                        i = 1;
                    } else if (numValueOf.intValue() == 1) {
                        i = 2;
                    }
                }
                this.LLJJI = i;
            }
        }
    }

    public final void E1() {
        CountDownTimerC1086840eOA countDownTimerC1086840eOA = this.LLILZIL;
        if (countDownTimerC1086840eOA != null) {
            countDownTimerC1086840eOA.cancel();
        }
        this.LLJJIJIL = false;
        this.LLJILLL = -1L;
        this.LLJJ = -1L;
        this.LLJJJ = -1L;
        this.LLJIJIL = false;
        this.LLJILJIL = false;
        this.LLJILJILJ = false;
        this.LLJJJJ = 2;
        this.LLJJIII = 0;
        this.LLJJI = 0;
    }

    public final void L1() {
        PollStartContent pollStartContent;
        PollEndContent pollEndContent;
        PollMessage pollMessage = this.LLIZLLLIL;
        if (pollMessage != null) {
            if (pollMessage.messageType == 1) {
                y1();
                PollMessage pollMessage2 = this.LLIZLLLIL;
                if (pollMessage2 != null && (pollEndContent = pollMessage2.endContent) != null && pollEndContent.endType != 0) {
                    CountDownTimerC1086840eOA countDownTimerC1086840eOA = this.LLILZIL;
                    if (countDownTimerC1086840eOA != null) {
                        countDownTimerC1086840eOA.cancel();
                    }
                    this.LLJJIJIL = false;
                }
                C16F5 c16f5 = this.LLILLL;
                if (c16f5 == null) {
                    c16f5 = null;
                }
                C786410Ut5.LLJJJJ(c16f5, 4);
                if (isShowing()) {
                    z1(this.LLJJIJIIJIL, false);
                }
                N1();
                PollMessage pollMessage3 = this.LLIZLLLIL;
                if (pollMessage3 == null || C1086690eNv.LIZ != pollMessage3.pollId) {
                    O1();
                    return;
                }
                return;
            }
            if (pollMessage != null) {
                if (pollMessage.messageType == 0) {
                    x1();
                    PollMessage pollMessage4 = this.LLIZLLLIL;
                    if (pollMessage4 != null && (pollStartContent = pollMessage4.startContent) != null) {
                        j = pollStartContent.endTime;
                    }
                    if (j > C158B.LIZ()) {
                        z1((j - C158B.LIZ()) + this.LLJJIJIIJIL, true);
                        return;
                    }
                    return;
                }
                if (pollMessage.messageType == 2) {
                    PollStartContent pollStartContent2 = pollMessage.startContent;
                    j = pollStartContent2 != null ? pollStartContent2.endTime : 0L;
                    if (j > C158B.LIZ()) {
                        z1((j - C158B.LIZ()) + this.LLJJIJIIJIL, true);
                    }
                    if (this.LLJJJIL) {
                        x1();
                        this.LLJJJIL = false;
                    }
                }
            }
        }
    }

    public void M1() {
        PollOptionInfo pollOptionInfo;
        PollOptionInfo pollOptionInfo2;
        PollOptionInfo pollOptionInfo3;
        PollOptionInfo pollOptionInfo4;
        List<PollOptionInfo> list = this.LLIZ;
        if (list == null || list.size() <= 1) {
            return;
        }
        List<PollOptionInfo> list2 = this.LLIZ;
        String str = null;
        String str2 = (list2 == null || (pollOptionInfo4 = (PollOptionInfo) ListProtector.get(list2, 0)) == null) ? null : pollOptionInfo4.displayContent;
        List<PollOptionInfo> list3 = this.LLIZ;
        if (list3 != null && (pollOptionInfo3 = (PollOptionInfo) ListProtector.get(list3, 1)) != null) {
            str = pollOptionInfo3.displayContent;
        }
        C21567019am c21567019amA1 = A1();
        if (str2 == null) {
            str2 = "1";
        }
        if (str == null) {
            str = "2";
        }
        c21567019amA1.LJ(str2, str);
        List<PollOptionInfo> list4 = this.LLIZ;
        long j = 0;
        long j2 = (list4 == null || (pollOptionInfo2 = (PollOptionInfo) ListProtector.get(list4, 0)) == null) ? 0L : pollOptionInfo2.votes;
        List<PollOptionInfo> list5 = this.LLIZ;
        if (list5 != null && (pollOptionInfo = (PollOptionInfo) ListProtector.get(list5, 1)) != null) {
            j = pollOptionInfo.votes;
        }
        H1(j2, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x018e A[PHI: r2
      0x018e: PHI (r2v22 long) = (r2v21 long), (r2v24 long) binds: [B:104:0x018b, B:95:0x0174] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e4 A[PHI: r2
      0x01e4: PHI (r2v32 long) = (r2v31 long), (r2v34 long) binds: [B:132:0x01e1, B:121:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f2 A[PHI: r2
      0x01f2: PHI (r2v29 long) = (r2v28 long), (r2v37 long) binds: [B:137:0x01ee, B:34:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0321 A[PHI: r2
      0x0321: PHI (r2v6 long) = (r2v5 long), (r2v8 long) binds: [B:208:0x031e, B:197:0x02fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x032f A[PHI: r2
      0x032f: PHI (r2v3 long) = (r2v2 long), (r2v12 long) binds: [B:213:0x032b, B:145:0x0208] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N1() {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget.N1():void");
    }

    public void P1() {
        I1(32.0f);
        C21567019am c21567019amA1 = A1();
        if (c21567019amA1 != null) {
            c21567019amA1.setDrawRadius(true);
        }
        F1(0.6f, 0.6f);
        C21567019am c21567019amA12 = A1();
        c21567019amA12.LLLILZJ = 1;
        c21567019amA12.LLLILZLLLI = 2;
        c21567019amA12.postInvalidate();
        int i = this.LLJJIII;
        if (i == 1) {
            int iLJFF = C497740JfY.LJFF(R.color.a9j);
            int iLJFF2 = C497740JfY.LJFF(R.color.a9g);
            C21567019am c21567019amA13 = A1();
            c21567019amA13.LLJJL = iLJFF;
            c21567019amA13.LLJJLIIIJLLLLLLLZ = iLJFF;
            c21567019amA13.LLJL = iLJFF2;
            c21567019amA13.LLJLIL = iLJFF2;
            c21567019amA13.LLJLILLLLZIIL = true;
            c21567019amA13.postInvalidate();
            return;
        }
        if (i != 2) {
            int iLJFF3 = C497740JfY.LJFF(R.color.a9g);
            int iLJFF4 = C497740JfY.LJFF(R.color.a9g);
            C21567019am c21567019amA14 = A1();
            c21567019amA14.LLJJL = iLJFF3;
            c21567019amA14.LLJJLIIIJLLLLLLLZ = iLJFF3;
            c21567019amA14.LLJL = iLJFF4;
            c21567019amA14.LLJLIL = iLJFF4;
            c21567019amA14.LLJLILLLLZIIL = true;
            c21567019amA14.postInvalidate();
            return;
        }
        int iLJFF5 = C497740JfY.LJFF(R.color.a9g);
        int iLJFF6 = C497740JfY.LJFF(R.color.a9i);
        C21567019am c21567019amA15 = A1();
        c21567019amA15.LLJJL = iLJFF5;
        c21567019amA15.LLJJLIIIJLLLLLLLZ = iLJFF5;
        c21567019amA15.LLJL = iLJFF6;
        c21567019amA15.LLJLIL = iLJFF6;
        c21567019amA15.LLJLILLLLZIIL = true;
        c21567019amA15.postInvalidate();
    }

    public void initData() {
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        this.LLJI = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
        DataChannel dataChannel2 = this.dataChannel;
        this.LLJ = (dataChannel2 == null || (bool = (Boolean) dataChannel2.gg0(UserIsAnchorChannel.class)) == null) ? false : bool.booleanValue();
        this.LLJJJIL = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void show() {
        if (C1086830eO9.LIZIZ != this.LLJJJJJIL) {
            super.show();
        }
    }

    public void x1() {
        switch (this.LL) {
            case 257:
                I1(28.0f);
                C21567019am c21567019amA1 = A1();
                if (c21567019amA1 != null) {
                    c21567019amA1.setDrawRadius(false);
                }
                G1(R.drawable.f8j);
                C21567019am c21567019amA12 = A1();
                c21567019amA12.LLLILZJ = 0;
                c21567019amA12.LLLILZLLLI = 0;
                c21567019amA12.postInvalidate();
                int iLJFF = C497740JfY.LJFF(R.color.a9f);
                int iLJFF2 = C497740JfY.LJFF(R.color.a9j);
                int iLJFF3 = C497740JfY.LJFF(R.color.a9i);
                int iLJFF4 = C497740JfY.LJFF(R.color.a9e);
                C21567019am c21567019amA13 = A1();
                c21567019amA13.LLJJL = iLJFF;
                c21567019amA13.LLJJLIIIJLLLLLLLZ = iLJFF2;
                c21567019amA13.LLJL = iLJFF3;
                c21567019amA13.LLJLIL = iLJFF4;
                c21567019amA13.LLJLILLLLZIIL = true;
                c21567019amA13.postInvalidate();
                int i = this.LLJJI;
                if (i == 1) {
                    F1(1.0f, 0.4f);
                } else if (i == 2) {
                    F1(0.4f, 1.0f);
                } else {
                    F1(0.6f, 0.6f);
                }
                break;
            case 258:
                I1(32.0f);
                C21567019am c21567019amA14 = A1();
                if (c21567019amA14 != null) {
                    c21567019amA14.setDrawRadius(true);
                }
                F1(0.6f, 0.6f);
                G1(R.drawable.f8j);
                C21567019am c21567019amA15 = A1();
                c21567019amA15.LLLILZJ = 1;
                c21567019amA15.LLLILZLLLI = 2;
                c21567019amA15.postInvalidate();
                int iLJFF5 = C497740JfY.LJFF(R.color.a9j);
                int iLJFF6 = C497740JfY.LJFF(R.color.a9i);
                C21567019am c21567019amA16 = A1();
                c21567019amA16.LLJJL = iLJFF5;
                c21567019amA16.LLJJLIIIJLLLLLLLZ = iLJFF5;
                c21567019amA16.LLJL = iLJFF6;
                c21567019amA16.LLJLIL = iLJFF6;
                c21567019amA16.LLJLILLLLZIIL = true;
                c21567019amA16.postInvalidate();
                break;
            case 259:
                P1();
                break;
        }
        M1();
    }

    public void y1() {
        int i;
        PollOptionInfo pollOptionInfo;
        PollOptionInfo pollOptionInfo2;
        PollOptionInfo pollOptionInfo3;
        PollOptionInfo pollOptionInfo4;
        List<PollOptionInfo> list = this.LLIZ;
        if (list != null && list.size() > 1) {
            List<PollOptionInfo> list2 = this.LLIZ;
            long j = 0;
            long j2 = (list2 == null || (pollOptionInfo4 = (PollOptionInfo) ListProtector.get(list2, 0)) == null) ? 0L : pollOptionInfo4.votes;
            List<PollOptionInfo> list3 = this.LLIZ;
            if (j2 > ((list3 == null || (pollOptionInfo3 = (PollOptionInfo) ListProtector.get(list3, 1)) == null) ? 0L : pollOptionInfo3.votes)) {
                i = 1;
            } else {
                List<PollOptionInfo> list4 = this.LLIZ;
                long j3 = (list4 == null || (pollOptionInfo2 = (PollOptionInfo) ListProtector.get(list4, 0)) == null) ? 0L : pollOptionInfo2.votes;
                List<PollOptionInfo> list5 = this.LLIZ;
                if (list5 != null && (pollOptionInfo = (PollOptionInfo) ListProtector.get(list5, 1)) != null) {
                    j = pollOptionInfo.votes;
                }
                i = j3 < j ? 2 : 0;
            }
            this.LLJJIII = i;
        }
        switch (this.LL) {
            case 257:
                I1(28.0f);
                C21567019am c21567019amA1 = A1();
                if (c21567019amA1 != null) {
                    c21567019amA1.setDrawRadius(false);
                }
                G1(R.drawable.f8j);
                C21567019am c21567019amA12 = A1();
                c21567019amA12.LLLILZJ = 0;
                c21567019amA12.LLLILZLLLI = 0;
                c21567019amA12.postInvalidate();
                A1().setScaleSize(this.LLJJIII);
                int i2 = this.LLJJIII;
                if (i2 == 1) {
                    int iLJFF = C497740JfY.LJFF(R.color.a9f);
                    int iLJFF2 = C497740JfY.LJFF(R.color.a9j);
                    int iLJFF3 = C497740JfY.LJFF(R.color.a9h);
                    int iLJFF4 = C497740JfY.LJFF(R.color.a9d);
                    C21567019am c21567019amA13 = A1();
                    c21567019amA13.LLJJL = iLJFF;
                    c21567019amA13.LLJJLIIIJLLLLLLLZ = iLJFF2;
                    c21567019amA13.LLJL = iLJFF3;
                    c21567019amA13.LLJLIL = iLJFF4;
                    c21567019amA13.LLJLILLLLZIIL = true;
                    c21567019amA13.postInvalidate();
                    F1(1.0f, 0.4f);
                } else if (i2 == 2) {
                    int iLJFF5 = C497740JfY.LJFF(R.color.a9d);
                    int iLJFF6 = C497740JfY.LJFF(R.color.a9h);
                    int iLJFF7 = C497740JfY.LJFF(R.color.a9i);
                    int iLJFF8 = C497740JfY.LJFF(R.color.a9e);
                    C21567019am c21567019amA14 = A1();
                    c21567019amA14.LLJJL = iLJFF5;
                    c21567019amA14.LLJJLIIIJLLLLLLLZ = iLJFF6;
                    c21567019amA14.LLJL = iLJFF7;
                    c21567019amA14.LLJLIL = iLJFF8;
                    c21567019amA14.LLJLILLLLZIIL = true;
                    c21567019amA14.postInvalidate();
                    F1(0.4f, 1.0f);
                } else {
                    int iLJFF9 = C497740JfY.LJFF(R.color.a9f);
                    int iLJFF10 = C497740JfY.LJFF(R.color.a9j);
                    int iLJFF11 = C497740JfY.LJFF(R.color.a9i);
                    int iLJFF12 = C497740JfY.LJFF(R.color.a9e);
                    C21567019am c21567019amA15 = A1();
                    c21567019amA15.LLJJL = iLJFF9;
                    c21567019amA15.LLJJLIIIJLLLLLLLZ = iLJFF10;
                    c21567019amA15.LLJL = iLJFF11;
                    c21567019amA15.LLJLIL = iLJFF12;
                    c21567019amA15.LLJLILLLLZIIL = true;
                    c21567019amA15.postInvalidate();
                    F1(1.0f, 1.0f);
                }
                break;
            case 258:
                A1().setScaleSize(this.LLJJIII);
                P1();
                break;
            case 259:
                P1();
                break;
        }
        M1();
    }

    public void init() {
        this.LLILLL = (C16F5) findViewById(R.id.tv_poll_downtime);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onUnload() {
        C482260Ivg.LJ(this);
        A1().clearAnimation();
        E1();
        this.LLIZ = null;
        this.LLJJJIL = true;
        this.LLJJJJJIL = -1L;
    }

    public LiveAbsPollEffectWidget(int i) {
        this.LL = i;
        this.LLJILLL = -1L;
        this.LLJJ = -1L;
        this.LLJJIJI = 3000L;
        this.LLJJIJIIJIL = Mp4ScreenVideoLoadTimeout.CONTROL;
        this.LLJJJ = -1L;
        this.LLJJJIL = true;
        this.LLJJJJ = 2;
        this.LLJJJJJIL = -1L;
    }

    public final void B1(EnumC1086920eOI enumC1086920eOI) {
        HashMap map;
        PollData pollData;
        PollInfo pollInfo;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (map = (HashMap) dataChannel.gg0(C780320UjG.class)) != null && (pollData = (PollData) map.get(Integer.valueOf(enumC1086920eOI.ordinal()))) != null) {
            Room room = this.LLJI;
            if (room != null) {
                room.advancedPollInfo = new PollInfo();
            }
            Room room2 = this.LLJI;
            if (room2 != null && (pollInfo = room2.advancedPollInfo) != null) {
                pollInfo.pollData = pollData;
            }
            long j = pollData.pollId;
            C1086830eO9.LIZIZ = j;
            PollMessage pollMessage = this.LLIZLLLIL;
            if (pollMessage != null) {
                pollMessage.pollId = j;
                pollMessage.pollKind = Integer.valueOf(pollData.pollKind);
            }
            PollStartContent pollStartContent = new PollStartContent();
            pollStartContent.startTime = pollData.startTime;
            pollStartContent.endTime = pollData.endTime;
            PollMessage pollMessage2 = this.LLIZLLLIL;
            if (pollMessage2 != null) {
                pollMessage2.startContent = pollStartContent;
            }
            this.LLILZLL = pollStartContent;
            PollUpdateVotesContent pollUpdateVotesContent = new PollUpdateVotesContent();
            pollUpdateVotesContent.optionList = pollData.pollOptionList;
            PollMessage pollMessage3 = this.LLIZLLLIL;
            if (pollMessage3 != null) {
                pollMessage3.updateContent = pollUpdateVotesContent;
            }
            EnumC1087550ePJ.INSTANCE.pollMessage = pollMessage3;
        }
    }

    public final void D1(EnumC1086920eOI enumC1086920eOI) {
        List<PollOptionInfo> list;
        long j;
        int i;
        HashMap map;
        PollMessage pollMessage = new PollMessage();
        this.LLIZLLLIL = pollMessage;
        pollMessage.messageType = 1L;
        DataChannel dataChannel = this.dataChannel;
        PollData pollData = null;
        if (dataChannel != null && (map = (HashMap) dataChannel.gg0(C780320UjG.class)) != null) {
            pollData = (PollData) map.get(Integer.valueOf(enumC1086920eOI.ordinal()));
        }
        PollMessage pollMessage2 = this.LLIZLLLIL;
        if (pollMessage2 != null) {
            if (pollData != null) {
                j = pollData.pollId;
            } else {
                j = 0;
            }
            pollMessage2.pollId = j;
            if (pollData != null) {
                i = pollData.pollKind;
            } else {
                i = 0;
            }
            pollMessage2.pollKind = Integer.valueOf(i);
        }
        PollEndContent pollEndContent = new PollEndContent();
        if (pollData == null || (list = pollData.pollOptionList) == null) {
            list = C13BV.INSTANCE;
        }
        pollEndContent.optionList = list;
        PollMessage pollMessage3 = this.LLIZLLLIL;
        if (pollMessage3 != null) {
            pollMessage3.endContent = pollEndContent;
        }
    }

    public void I1(float f) {
        ViewGroup.LayoutParams layoutParams = A1().getLayoutParams();
        layoutParams.height = (int) C497740JfY.LIZIZ(f);
        if (this.LL == 257) {
            layoutParams.width = (int) C497740JfY.LIZIZ(214.0f);
        } else {
            layoutParams.width = -1;
        }
        C21567019am c21567019amA1 = A1();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21567019amA1);
        c21567019amA1.setLayoutParams(layoutParams);
    }

    public void J1(PollMessage pollMessage) {
        int i;
        PollEndContent pollEndContent;
        PollEndContent pollEndContent2;
        PollUpdateVotesContent pollUpdateVotesContent;
        List<PollOptionInfo> list;
        PollStartContent pollStartContent;
        PollMessage pollMessage2 = this.LLIZLLLIL;
        List<PollOptionInfo> list2 = null;
        PollStartContent pollStartContent2 = null;
        list = null;
        List<PollOptionInfo> list3 = null;
        list2 = null;
        if (pollMessage2 != null) {
            Long lValueOf = Long.valueOf(pollMessage2.messageType);
            long j = 0;
            if (lValueOf != null) {
                if (lValueOf.longValue() == 0) {
                    C1086830eO9.LIZJ = false;
                    PollMessage pollMessage3 = this.LLIZLLLIL;
                    if (pollMessage3 != null && (pollStartContent = pollMessage3.startContent) != null) {
                        list = pollStartContent.optionList;
                    } else {
                        list = null;
                    }
                    this.LLIZ = list;
                    if (pollMessage3 != null) {
                        pollStartContent2 = pollMessage3.startContent;
                    }
                    this.LLILZLL = pollStartContent2;
                    E1();
                } else if (lValueOf.longValue() == 2) {
                    C1086830eO9.LIZJ = true;
                    PollMessage pollMessage4 = this.LLIZLLLIL;
                    if (pollMessage4 != null && (pollUpdateVotesContent = pollMessage4.updateContent) != null) {
                        list3 = pollUpdateVotesContent.optionList;
                    }
                    this.LLIZ = list3;
                    if (pollMessage4 != null) {
                        pollMessage4.startContent = this.LLILZLL;
                    }
                } else if (lValueOf.longValue() == 1) {
                    C1086830eO9.LIZJ = false;
                    PollMessage pollMessage5 = this.LLIZLLLIL;
                    if (pollMessage5 != null && (pollEndContent2 = pollMessage5.endContent) != null) {
                        list2 = pollEndContent2.optionList;
                    }
                    this.LLIZ = list2;
                    if (pollMessage5 != null) {
                        pollMessage5.startContent = this.LLILZLL;
                        CommonMessageData commonMessageData = pollMessage5.baseMessage;
                        if (commonMessageData != null) {
                            j = commonMessageData.createTime;
                        }
                    }
                    this.LLJJJ = j;
                    if (pollMessage5 != null && (pollEndContent = pollMessage5.endContent) != null) {
                        i = pollEndContent.endType;
                    } else {
                        i = 2;
                    }
                    this.LLJJJJ = i;
                }
            }
        }
        EnumC1087550ePJ enumC1087550ePJ = EnumC1087550ePJ.INSTANCE;
        PollMessage pollMessage6 = enumC1087550ePJ.pollMessage;
        if (pollMessage6 != null && pollMessage6.startContent == null) {
            pollMessage6.startContent = this.LLILZLL;
            enumC1087550ePJ.pollMessage = pollMessage6;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        init();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        Object obj;
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        this.LLILZ = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.LIVE_POLL_MESSAGE.getIntType(), this);
        }
        C482260Ivg.LIZ(C001A.LIVE_POLL_MESSAGE.getIntType(), this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, SelectPollVoteEvent.class, new AwS596S0100000_17(this, 399));
        }
        initData();
        hide();
        if (this.LL == 257) {
            HandlerHook.viewPostDelay(A1(), new ARunnableS117S0100000_17(this, 201), this.LLJJIJI);
        } else {
            J1(null);
        }
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C1078480eAg) && ((obj = ((C1078480eAg) obj2).LIZ) == null || (obj instanceof IMessage))) {
                    onMessage((IMessage) obj);
                }
            }
        }
        DataChannel dataChannel2 = this.dataChannel;
        dataChannel2.BQ2(this, SubOnlyLiveAudienceStatusChannel.class, new AwS596S0100000_17(this, 190));
        dataChannel2.EQ2(this, HighPrioritySlotVisibilityChannel.class, new AwS596S0100000_17(this, 191));
        dataChannel2.EQ2(this, HighPriorityTooltipVisibilityChannel.class, new AwS596S0100000_17(this, 192));
        this.LLJJJJJIL = -1L;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Integer num;
        long j;
        DataChannel dataChannel;
        if (iMessage instanceof PollMessage) {
            PollMessage pollMessage = (PollMessage) iMessage;
            Integer num2 = pollMessage.pollKind;
            if ((num2 != null && num2.intValue() == 1) || ((num = pollMessage.pollKind) != null && num.intValue() == 0)) {
                long j2 = pollMessage.baseMessage.createTime / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                Room room = this.LLJI;
                if (room != null) {
                    j = room.nowTime;
                } else {
                    j = 0;
                }
                if (j2 < j) {
                    return;
                }
                C1086830eO9.LIZIZ = pollMessage.pollId;
                DataChannel dataChannel2 = this.dataChannel;
                if ((dataChannel2 != null && Intrinsics.LJFF(dataChannel2.gg0(HighPrioritySlotVisibilityChannel.class), Boolean.TRUE)) || ((dataChannel = this.dataChannel) != null && Intrinsics.LJFF(dataChannel.gg0(HighPriorityTooltipVisibilityChannel.class), Boolean.TRUE))) {
                    this.LLJJJJJIL = C1086830eO9.LIZIZ;
                }
                this.LLIZLLLIL = pollMessage;
                J1(pollMessage);
            }
        }
    }

    public final void F1(float f, float f2) {
        C21567019am c21567019amA1 = A1();
        c21567019amA1.LLLIIL = f;
        c21567019amA1.LLLIILIL = f2;
        c21567019amA1.LLJLILLLLZIIL = true;
        c21567019amA1.postInvalidate();
    }

    public void H1(long j, long j2) {
        if (j > this.LLJILLL || j2 > this.LLJJ) {
            this.LLJILLL = j;
            this.LLJJ = j2;
            A1().LJFF(j, j2);
            HandlerHook.viewPost(A1(), new ARunnableS1S0100200_17(j, j2, this, 3));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0eOA, android.os.CountDownTimer] */
    public final void z1(final long j, final boolean z) {
        if (!this.LLJJIJIL && j > 0) {
            ?? r0 = new CountDownTimer(j) { // from class: X.0eOA
                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    LiveAbsPollEffectWidget liveAbsPollEffectWidget = this;
                    if (liveAbsPollEffectWidget.LL == 257) {
                        liveAbsPollEffectWidget.hide();
                    }
                    liveAbsPollEffectWidget.E1();
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j2) {
                    String quantityString;
                    Resources resources;
                    boolean z2;
                    long j3;
                    long j4;
                    PollOptionInfo pollOptionInfo;
                    PollOptionInfo pollOptionInfo2;
                    long j5 = j2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    boolean z3 = z;
                    if (z3) {
                        j5 -= (long) 5;
                    }
                    LiveAbsPollEffectWidget liveAbsPollEffectWidget = this;
                    if (!z3) {
                        liveAbsPollEffectWidget.getClass();
                    } else {
                        C16F5 c16f5 = null;
                        if (liveAbsPollEffectWidget.LL == 257) {
                            if (1 <= j5 && j5 < 11) {
                                Context context = liveAbsPollEffectWidget.context;
                                if (context != null && (resources = context.getResources()) != null) {
                                    int i = (int) j5;
                                    quantityString = resources.getQuantityString(2131755586, i, Integer.valueOf(i));
                                } else {
                                    quantityString = null;
                                }
                                if (!TextUtils.isEmpty(quantityString)) {
                                    C16F5 c16f52 = liveAbsPollEffectWidget.LLILLL;
                                    if (c16f52 == null) {
                                        c16f52 = null;
                                    }
                                    c16f52.setText(quantityString);
                                    C16F5 c16f53 = liveAbsPollEffectWidget.LLILLL;
                                    if (c16f53 != null) {
                                        c16f5 = c16f53;
                                    }
                                    C786410Ut5.LLJJJJ(c16f5, 0);
                                }
                            } else {
                                C16F5 c16f54 = liveAbsPollEffectWidget.LLILLL;
                                if (c16f54 != null) {
                                    c16f5 = c16f54;
                                }
                                C786410Ut5.LLJJJJ(c16f5, 4);
                            }
                        } else {
                            C16F5 c16f55 = liveAbsPollEffectWidget.LLILLL;
                            if (c16f55 != null) {
                                c16f5 = c16f55;
                            }
                            C786410Ut5.LLJJJJ(c16f5, 8);
                        }
                    }
                    LiveAbsPollEffectWidget liveAbsPollEffectWidget2 = this;
                    PollMessage pollMessage = liveAbsPollEffectWidget2.LLIZLLLIL;
                    if (pollMessage != null && pollMessage.messageType == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        List<PollOptionInfo> list = liveAbsPollEffectWidget2.LLIZ;
                        if (list != null && list.size() == 2) {
                            List<PollOptionInfo> list2 = liveAbsPollEffectWidget2.LLIZ;
                            if (list2 != null && (pollOptionInfo2 = (PollOptionInfo) ListProtector.get(list2, 0)) != null) {
                                j3 = pollOptionInfo2.votes;
                            } else {
                                j3 = 0;
                            }
                            List<PollOptionInfo> list3 = liveAbsPollEffectWidget2.LLIZ;
                            if (list3 != null && (pollOptionInfo = (PollOptionInfo) ListProtector.get(list3, 1)) != null) {
                                j4 = pollOptionInfo.votes;
                            } else {
                                j4 = 0;
                            }
                        } else {
                            j3 = 0;
                            j4 = 0;
                        }
                        if (j3 > liveAbsPollEffectWidget2.LLJILLL || j4 > liveAbsPollEffectWidget2.LLJJ) {
                            this.x1();
                            this.M1();
                        }
                    }
                    if (j5 < 0) {
                        LiveAbsPollEffectWidget liveAbsPollEffectWidget3 = this;
                        liveAbsPollEffectWidget3.LLJJJJ = 0;
                        liveAbsPollEffectWidget3.N1();
                    }
                }
            };
            this.LLILZIL = r0;
            r0.start();
            this.LLJJIJIL = true;
            CountDownTimerC1086840eOA countDownTimerC1086840eOA = this.LLILZIL;
            if (countDownTimerC1086840eOA != null) {
                countDownTimerC1086840eOA.start();
            }
        }
    }
}
