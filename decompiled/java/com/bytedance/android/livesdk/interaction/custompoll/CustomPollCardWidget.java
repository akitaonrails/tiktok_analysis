package com.bytedance.android.livesdk.interaction.custompoll;

import X.AbstractC518790KWf;
import X.C001A;
import X.C01C1;
import X.C01C3;
import X.C01GW;
import X.C0IUQ;
import X.C0KVU;
import X.C0KXJ;
import X.C1085320eLi;
import X.C1086960eOM;
import X.C1091340eVQ;
import X.C1161920gLG;
import X.C118300cf;
import X.C13BV;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C1871910yoP;
import X.C19EG;
import X.C262100zr;
import X.C2645010p;
import X.C452501pT;
import X.C482260Ivg;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C963140bAe;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1871920yoQ;
import Y.ARunnableS117S0100000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.poll.PollApi;
import com.bytedance.android.livesdk.dataChannel.CustomPollCardVisibility;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.interaction.custompoll.CustomPollCardWidget;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.PollEndContent;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS114S0400000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class CustomPollCardWidget extends LiveRecyclableWidget implements InterfaceC1141530foN {
    public boolean LLJIJIL;
    public C01C1 LLJILJIL;
    public long LLJILJILJ;
    public boolean LLJILLL;
    public final ValueAnimator LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 211));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 216));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 215));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 218));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 217));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 214));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 212));
    public final List<View> LLIZLLLIL = new ArrayList();
    public final BPEAHandler LLJ = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS117S0100000_17 LLJI = new ARunnableS117S0100000_17(this, 99);
    public String LLJJ = "timeout";
    public final C1085320eLi LLJJI = new AbstractC518790KWf() { // from class: X.0eLi
        @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
        public final void LIZLLL() {
            this.LIZ.z1().setText(C963140bAe.LJIIJ(0L));
            CustomPollCardWidget customPollCardWidget = this.LIZ;
            customPollCardWidget.LLJJ = "poll_timeout";
            customPollCardWidget.hide();
        }

        @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
        public final void LIZ(C01C1 c01c1) {
            long j;
            CustomPollCardWidget customPollCardWidget = this.LIZ;
            if (customPollCardWidget.dataChannel != null && !customPollCardWidget.LLJIJIL) {
                customPollCardWidget.LLJ.removeCallbacksAndMessages(null);
                if (C500260Jjc.LJIIZILJ(customPollCardWidget.dataChannel)) {
                    C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, customPollCardWidget.LLJ, customPollCardWidget.LLJI);
                } else {
                    C786410Ut5.LJLIIL(10000L, customPollCardWidget.LLJ, customPollCardWidget.LLJI);
                }
                C20337914i1<Long> c20337914i1 = C0JGR.A2;
                PollMessage pollMessage = c01c1.LJFF;
                if (pollMessage != null) {
                    j = pollMessage.pollId;
                } else {
                    j = 0;
                }
                c20337914i1.LJFF(Long.valueOf(j));
                customPollCardWidget.D1(c01c1);
                customPollCardWidget.show();
            }
        }

        @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
        public final void LIZIZ(C01C1 c01c1) {
            if (c01c1.LIZIZ > 0) {
                C500260Jjc.LLFFF(this.LIZ.z1());
                long j = c01c1.LIZIZ;
                long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                if (j / j2 >= 3600) {
                    this.LIZ.z1().setText(C963140bAe.LJIIIZ((int) (c01c1.LIZIZ / j2)));
                    return;
                } else {
                    this.LIZ.z1().setText(C963140bAe.LJIIJ(c01c1.LIZIZ / j2));
                    return;
                }
            }
            C500260Jjc.LJIILIIL(this.LIZ.z1());
        }

        @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
        public final void LJ(C01C1 c01c1) {
            String str;
            Long lValueOf;
            String str2;
            PollEndContent pollEndContent;
            User user;
            PollEndContent pollEndContent2;
            CustomPollCardWidget customPollCardWidget = this.LIZ;
            DataChannel dataChannel = customPollCardWidget.dataChannel;
            if (dataChannel != null) {
                EnumC1085350eLl enumC1085350eLl = c01c1.LJI;
                if (enumC1085350eLl == EnumC1085350eLl.CANCEL) {
                    PollMessage pollMessage = c01c1.LJFF;
                    if (pollMessage != null && (pollEndContent2 = pollMessage.endContent) != null && pollEndContent2.endType == 0) {
                        str2 = "poll_timeout";
                    } else {
                        Room room = (Room) dataChannel.gg0(RoomChannel.class);
                        Long lValueOf2 = null;
                        if (room != null) {
                            lValueOf = Long.valueOf(room.getOwnerUserId());
                        } else {
                            lValueOf = null;
                        }
                        PollMessage pollMessage2 = c01c1.LJFF;
                        if (pollMessage2 != null && (pollEndContent = pollMessage2.endContent) != null && (user = pollEndContent.operator) != null) {
                            lValueOf2 = Long.valueOf(user.getId());
                        }
                        if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                            str2 = "anchor_close";
                        } else {
                            str2 = "moderator_close";
                        }
                    }
                    customPollCardWidget.LLJJ = str2;
                } else {
                    if (enumC1085350eLl == EnumC1085350eLl.LIVE_END) {
                        str = "close_take";
                    } else if (enumC1085350eLl == EnumC1085350eLl.LEAVE_ROOM) {
                        str = "leave_room";
                    } else {
                        str = "others";
                    }
                    customPollCardWidget.LLJJ = str;
                }
                if (c01c1.LJI != EnumC1085350eLl.REPLACE) {
                    customPollCardWidget.hide();
                }
            }
        }
    };

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hy4;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final View A1() {
        return (View) this.LLILZIL.getValue();
    }

    public final void C1() {
        Context context;
        C19EG c19egLJ;
        Context context2 = this.context;
        if (context2 == null || C500260Jjc.LJ(context2) == null || (context = this.context) == null || (c19egLJ = C500260Jjc.LJ(context)) == null) {
            return;
        }
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Sc2("poll_card", c19egLJ, this.dataChannel, true, "");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        if (this.LLJIJIL) {
            C01C1 c01c1 = this.LLJILJIL;
            if (c01c1 != null) {
                C0IUQ.LIZ(new C2645010p(this.dataChannel, c01c1, SystemClock.uptimeMillis() - this.LLJILJILJ, this.LLJJ, "poll_card"));
            }
            this.LLJJ = "others";
            this.LLJILJIL = null;
            this.LLJIJIL = false;
            this.LLJILJILJ = 0L;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(CustomPollCardVisibility.class, Boolean.FALSE);
            }
            this.LLJ.removeCallbacks(this.LLJI);
            if (isViewValid()) {
                ((ValueAnimator) this.LLJJIJI.getValue()).setFloatValues(1.0f, 0.0f);
                ((ValueAnimator) this.LLJJIJI.getValue()).start();
                this.LLJJIII.setStartDelay(0L);
                this.LLJJIII.setFloatValues(1.0f, 0.0f);
                this.LLJJIII.setDuration(40L);
                this.LLJJIII.start();
                ((C1091340eVQ) this.LL.getValue()).LJ();
                DataChannel dataChannel2 = this.dataChannel;
                if (C500260Jjc.LJJIFFI(dataChannel2 != null ? Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel2)) : null)) {
                    HandlerHook.viewPostDelay((View) this.LLIZ.getValue(), new ARunnableS117S0100000_17(this, 100), 100L);
                }
                HandlerHook.viewPostDelay((View) this.LLIZ.getValue(), new ARunnableS117S0100000_17(this, 101), 180L);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        Room room;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            C1086960eOM c1086960eOM = C1086960eOM.LL;
            C1086960eOM.LJIJ(room.getId(), this.LLJJI);
        }
        this.LLJJ = "leave_room";
        hide();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zW(CustomPollCardVisibility.class, Boolean.FALSE);
        }
        this.LLJ.removeCallbacksAndMessages(null);
        C1548820qPI.LJIIIIZZ("try_mode_custom_poll_message_event", this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (this.LLJIJIL) {
            return;
        }
        super.show();
        this.LLJIJIL = true;
        if (C500260Jjc.LJIIZILJ(this.dataChannel) || B1(this.dataChannel)) {
            C500260Jjc.LJIILIIL(A1());
        } else {
            C500260Jjc.LLFFF(A1());
        }
        this.LLJILJILJ = SystemClock.uptimeMillis();
        C01C1 c01c1 = this.LLJILJIL;
        if (c01c1 != null) {
            C01C3.LIZIZ(this.dataChannel, c01c1, "poll_card");
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(CustomPollCardVisibility.class, Boolean.TRUE);
        }
        ((ValueAnimator) this.LLJJIJI.getValue()).setFloatValues(0.0f, 1.0f);
        ((ValueAnimator) this.LLJJIJI.getValue()).start();
        this.LLJJIII.setFloatValues(0.0f, 1.0f);
        this.LLJJIII.setStartDelay(100L);
        this.LLJJIII.setDuration(80L);
        this.LLJJIII.start();
        ((C1091340eVQ) this.LL.getValue()).LJFF();
    }

    public final void y1() {
        this.LLJJ = C500260Jjc.LJIIZILJ(this.dataChannel) ? "anchor_click" : B1(this.dataChannel) ? "moderator_close" : "audience_click";
        hide();
    }

    public final TextView z1() {
        return (TextView) this.LLILLL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0eLi] */
    public CustomPollCardWidget() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(this, 15));
        this.LLJJIII = valueAnimatorOfFloat;
        this.LLJJIJI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 213));
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean isShowing() {
        return this.LLJIJIL;
    }

    public static boolean B1(DataChannel dataChannel) {
        Boolean boolValueOf;
        UserAttr userAttr;
        User user;
        UserAttr userAttr2;
        if (dataChannel != null && (user = (User) dataChannel.gg0(RoomUserChannel.class)) != null && (userAttr2 = user.getUserAttr()) != null) {
            return userAttr2.isAdmin;
        }
        User userLIZIZ = C0KXJ.LIZIZ();
        if (userLIZIZ != null && (userAttr = userLIZIZ.getUserAttr()) != null) {
            boolValueOf = Boolean.valueOf(userAttr.isAdmin);
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    public final void D1(C01C1 c01c1) {
        boolean z;
        Long lValueOf;
        Long lValueOf2;
        PollStartContent pollStartContent;
        PollStartContent pollStartContent2;
        Room room;
        PollStartContent pollStartContent3;
        User user;
        if (!C500260Jjc.LJIIZILJ(this.dataChannel) && !B1(this.dataChannel)) {
            z = false;
        } else {
            z = true;
        }
        this.LLJILLL = z;
        this.LLJILJIL = c01c1;
        if (c01c1.LIZIZ >= 0) {
            C500260Jjc.LLFFF(z1());
            long j = c01c1.LIZIZ;
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            if (j / j2 >= 3600) {
                z1().setText(C963140bAe.LJIIIZ((int) (c01c1.LIZIZ / j2)));
            } else {
                z1().setText(C963140bAe.LJIIJ(c01c1.LIZIZ / j2));
            }
        } else {
            C500260Jjc.LJIILIIL(z1());
        }
        if (!this.LLJILLL) {
            C500260Jjc.LLFFF(A1());
        } else {
            C500260Jjc.LJIILIIL(A1());
        }
        PollMessage pollMessage = c01c1.LJFF;
        User user2 = null;
        if (pollMessage != null && (pollStartContent3 = pollMessage.startContent) != null && (user = pollStartContent3.operator) != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            lValueOf2 = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf2 = null;
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
            if (!C500260Jjc.LJIIZILJ(this.dataChannel) && !B1(this.dataChannel)) {
                ((TextView) this.LLILLJJLI.getValue()).setText(C497740JfY.LJIJI(2131841313));
            } else {
                TextView textView = (TextView) this.LLILLJJLI.getValue();
                Object[] objArr = new Object[1];
                PollMessage pollMessage2 = c01c1.LJFF;
                if (pollMessage2 != null && (pollStartContent2 = pollMessage2.startContent) != null) {
                    user2 = pollStartContent2.operator;
                }
                objArr[0] = C0KVU.LIZ(user2);
                textView.setText(C497740JfY.LJIJJ(2131841314, objArr));
            }
        } else {
            ((TextView) this.LLILLJJLI.getValue()).setText(C497740JfY.LJIJI(2131841310));
        }
        ((TextView) this.LLILZ.getValue()).setText("");
        PollMessage pollMessage3 = c01c1.LJFF;
        if (pollMessage3 != null && (pollStartContent = pollMessage3.startContent) != null) {
            ((TextView) this.LLILZ.getValue()).setText(pollStartContent.title);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        List<Object> list;
        try {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd == null) {
                return;
            }
            String strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "message_type", "");
            long j = CastLongProtector.parseLong(C1871910yoP.LJFF(interfaceC1107590evd, "poll_id", ""));
            if (Intrinsics.LJFF(strLJFF, CardStruct.IStatusCode.DEFAULT)) {
                String strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd, "title", "");
                InterfaceC1871920yoQ interfaceC1871920yoQLIZ = C1871910yoP.LIZ(interfaceC1107590evd, "option_list", null);
                if (interfaceC1871920yoQLIZ == null || (list = interfaceC1871920yoQLIZ.toList()) == null) {
                    list = C13BV.INSTANCE;
                }
                long j2 = CastLongProtector.parseLong(C1871910yoP.LJFF(interfaceC1107590evd, "start_time", String.valueOf(System.currentTimeMillis())));
                long j3 = CastLongProtector.parseLong(C1871910yoP.LJFF(interfaceC1107590evd, "end_time", String.valueOf(System.currentTimeMillis())));
                PollMessage pollMessage = new PollMessage();
                pollMessage.messageType = 0L;
                pollMessage.pollKind = 2;
                pollMessage.pollId = j;
                PollStartContent pollStartContent = new PollStartContent();
                pollStartContent.title = strLJFF2;
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        List<PollOptionInfo> list2 = pollStartContent.optionList;
                        PollOptionInfo pollOptionInfo = new PollOptionInfo();
                        pollOptionInfo.displayContent = String.valueOf(obj);
                        pollOptionInfo.optionIndex = i;
                        list2.add(pollOptionInfo);
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                pollStartContent.startTime = j2;
                pollStartContent.endTime = j3;
                pollMessage.startContent = pollStartContent;
                CommonMessageData commonMessageData = new CommonMessageData();
                pollMessage.baseMessage = commonMessageData;
                commonMessageData.createTime = System.currentTimeMillis();
                C482260Ivg.LIZIZ(C001A.LIVE_POLL_MESSAGE.getIntType(), pollMessage);
                return;
            }
            ((PollApi) C482260Ivg.LIZJ(PollApi.class)).LIZ(j);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        List<View> list = this.LLIZLLLIL;
        TextView textView = (TextView) this.LLILLJJLI.getValue();
        C786410Ut5.S4(0.0f, textView);
        ((ArrayList) list).add(textView);
        List<View> list2 = this.LLIZLLLIL;
        TextView textView2 = (TextView) this.LLILZ.getValue();
        C786410Ut5.S4(0.0f, textView2);
        ((ArrayList) list2).add(textView2);
        List<View> list3 = this.LLIZLLLIL;
        View viewFindViewById = findViewById(R.id.fci);
        C786410Ut5.T4(viewFindViewById, 0.0f);
        ((ArrayList) list3).add(viewFindViewById);
        List<View> list4 = this.LLIZLLLIL;
        TextView textViewZ1 = z1();
        C786410Ut5.S4(0.0f, textViewZ1);
        ((ArrayList) list4).add(textViewZ1);
        List<View> list5 = this.LLIZLLLIL;
        View viewA1 = A1();
        C786410Ut5.T4(viewA1, 0.0f);
        ((ArrayList) list5).add(viewA1);
        List<View> list6 = this.LLIZLLLIL;
        View view = (View) this.LLILZLL.getValue();
        C786410Ut5.T4(view, 0.0f);
        ((ArrayList) list6).add(view);
        C500260Jjc.LJLIIIL(500L, A1(), new AwS596S0100000_17(this, 180));
        View view2 = getView();
        if (view2 != null) {
            C500260Jjc.LJLIIIL(500L, view2, new AwS596S0100000_17(this, 181));
        }
        C500260Jjc.LJLIIIL(500L, (View) this.LLILZLL.getValue(), new AwS596S0100000_17(this, 182));
        C1548820qPI.LIZLLL("try_mode_custom_poll_message_event", this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            C1086960eOM c1086960eOM = C1086960eOM.LL;
            long id = room.getId();
            c1086960eOM.getClass();
            LongSparseArray<C01C1> longSparseArray = C1086960eOM.LLJJJIL;
            C01C1 c01c1 = longSparseArray.get(id);
            longSparseArray.remove(id);
            if (c01c1 != null) {
                C118300cf c118300cf = new C118300cf();
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.EQ2(this, RoomUserChannel.class, new AwS114S0400000_17(c118300cf, this, c01c1, room, 8));
                }
            }
            C1086960eOM.LJIILL(room.getId(), this.LLJJI);
        }
    }
}
