package com.bytedance.android.livesdk.function;

import X.AbstractC1098520eh0;
import X.AbstractC21616419ik;
import X.C0TZM;
import X.C1077790e9Z;
import X.C1078480eAg;
import X.C1083690eJ5;
import X.C1087530ePH;
import X.C1088780eRI;
import X.C1091250eVH;
import X.C1102070emj;
import X.C1161920gLG;
import X.C11NJ;
import X.C12ES;
import X.C16F5;
import X.C20337914i1;
import X.C20441214yg;
import X.C21581419d6;
import X.C21616519il;
import X.C464680IKc;
import X.C473410IhP;
import X.C497740JfY;
import X.C784440Upu;
import X.C786410Ut5;
import X.C930940aKi;
import X.EnumC1087640ePS;
import X.EnumC1101430elh;
import X.InterfaceC1106030et7;
import X.InterfaceC1427630nFp;
import X.InterfaceC1631630sYr;
import X.InterfaceC482090IvP;
import Y.ALAdapterS13S0100000_17;
import Y.AObjectS360S0100000_17;
import Y.ARunnableS117S0100000_17;
import Y.AfS132S0000000_7;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.HideTitleLayoutEvent;
import com.bytedance.android.livesdk.dataChannel.HourlyRankRewardVisibilityChangedChannel;
import com.bytedance.android.livesdk.dataChannel.LowDevicePerfScalableChannel;
import com.bytedance.android.livesdk.dataChannel.RoomNotifyEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.livesetting.LiveNotifyFontWeightOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutRenderingScopeOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveGiftAnnouncementFrequencySetting;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class LiveRoomNotifyWidget extends LiveRecyclableWidget {
    public static final /* synthetic */ int LLJZIJLIL = 0;
    public ImageView LL;
    public TextView LLILLJJLI;
    public LiveIconView LLILLL;
    public ImageView LLILZ;
    public View LLILZIL;
    public C1091250eVH LLILZLL;
    public int LLIZLLLIL;
    public C21616519il LLJ;
    public AnimatorSet LLJI;
    public ObjectAnimator LLJIJIL;
    public RoomNotifyMessage LLJILLL;
    public final LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig LLJJ;
    public final boolean LLJJI;
    public final boolean LLJJIII;
    public final int LLJJIJI;
    public final float LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final int LLJJJ;
    public boolean LLJJJIL;
    public float LLJJJJ;
    public final ARunnableS117S0100000_17 LLJJJJJIL;
    public int LLJJJJLIIL;
    public final ARunnableS117S0100000_17 LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public final C1083690eJ5 LLJLILLLLZIIL;
    public C1087530ePH LLJLL;
    public final ARunnableS117S0100000_17 LLJLLIL;
    public final Map<String, Queue<Long>> LLJLLL;
    public long LLJZ;
    public final boolean LLIZ = LiveLayoutRenderingScopeOptimizationSetting.INSTANCE.getValue().announcementOpt;
    public final C11NJ LLJILJIL = new C11NJ();
    public boolean LLJILJILJ = false;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        C497740JfY.LIZ(12.0f);
        C497740JfY.LIZ(14.0f);
    }

    public final void D1() {
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannel = this.dataChannel;
        c1102070emj.getClass();
        if (C1102070emj.LJIIIIZZ(dataChannel, 5, 0, 0)) {
            C1087530ePH c1087530ePH = this.LLJLL;
            if (c1087530ePH != null) {
                DataChannel dataChannel2 = this.dataChannel;
                String str = c1087530ePH.LIZ;
                c1102070emj.getClass();
                C1102070emj.LJIIL(dataChannel2, 1, str);
            }
            C473410IhP.LJ(this.LLJLLIL);
            this.LLJLL = null;
        }
    }

    public final void F1() {
        if (this.dataChannel == null || !ScalableDowngradeSetting.disableGiftNotifyAnim()) {
            this.LLJILJILJ = false;
            return;
        }
        C1077790e9Z c1077790e9Z = (C1077790e9Z) this.dataChannel.gg0(LowDevicePerfScalableChannel.class);
        if (c1077790e9Z != null) {
            this.LLJILJILJ = c1077790e9Z.LIZIZ.ordinal() <= EnumC1087640ePS.LEVEL_SERIOUS.ordinal();
        } else {
            this.LLJILJILJ = false;
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return this.LLIZ ? R.layout.h91 : R.layout.h90;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        if (this.dataChannel != null) {
            C20441214yg.LIZIZ("MainFrame#anim", "room-1-post event: false");
            this.dataChannel.zW(HourlyRankRewardVisibilityChangedChannel.class, Boolean.FALSE);
        }
        C786410Ut5.T4(this.LLILZIL, 1.0f);
        hide();
        x1();
        this.LLJ = null;
        this.LLJI = null;
        this.LLJILJIL.LJ();
        this.LLJILLL = null;
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannel = this.dataChannel;
        c1102070emj.getClass();
        if (C1102070emj.LJIIIIZZ(dataChannel, 5, 0, 0)) {
            this.LLJLL = null;
            C473410IhP.LJ(this.LLJLLIL);
        }
        this.LLJJLIIIJLLLLLLLZ = -1.0f;
        this.LLJL = false;
        if (LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getAdvacedMessageDowngrade()) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.ADVANCED_MESSAGE_LEGACY_DOWNGRADE);
        }
    }

    public final void x1() {
        C21616519il c21616519il = this.LLJ;
        if (c21616519il != null) {
            c21616519il.LIZLLL();
        }
        ObjectAnimator objectAnimator = this.LLJIJIL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        AnimatorSet animatorSet = this.LLJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.0eJ5] */
    public LiveRoomNotifyWidget() {
        LiveGiftAnnouncementFrequencySetting.AnnouncementFrequencyConfig value = LiveGiftAnnouncementFrequencySetting.INSTANCE.getValue();
        this.LLJJ = value;
        this.LLJJI = value.closeToggleEnabled;
        this.LLJJIII = value.frequencyControlEnabled;
        this.LLJJIJI = value.disableMinCount;
        this.LLJJIJIIJIL = value.disableRatio;
        this.LLJJIJIL = value.frequencyCount;
        this.LLJJJ = value.frequencyDuration;
        C20337914i1<Float> c20337914i1 = InterfaceC1106030et7.p7;
        this.LLJJJIL = c20337914i1.LIZIZ().floatValue() > value.disableRatio;
        this.LLJJJJ = c20337914i1.LIZIZ().floatValue();
        this.LLJJJJJIL = new ARunnableS117S0100000_17(this, 76);
        this.LLJJJJLIIL = 0;
        this.LLJJL = new ARunnableS117S0100000_17(this, 77);
        this.LLJJLIIIJLLLLLLLZ = -1.0f;
        this.LLJL = false;
        this.LLJLIL = false;
        this.LLJLILLLLZIIL = new InterfaceC1631630sYr() { // from class: X.0eJ5
            @Override // X.InterfaceC1631630sYr
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj4;
                int i = LiveRoomNotifyWidget.LLJZIJLIL;
                boolean z = true;
                if ((num.intValue() != 1 && num.intValue() != 3) || num2.intValue() != 2) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
        this.LLJLL = null;
        this.LLJLLIL = new ARunnableS117S0100000_17(this, 78);
        this.LLJLLL = new HashMap();
        this.LLJZ = System.currentTimeMillis();
    }

    public final void y1() {
        Long l;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLJZ < 300000) {
            return;
        }
        try {
            for (Map.Entry entry : ((HashMap) this.LLJLLL).entrySet()) {
                Queue queue = (Queue) entry.getValue();
                if (queue == null) {
                    ((HashMap) this.LLJLLL).remove(entry.getKey());
                } else {
                    while (!queue.isEmpty() && (l = (Long) queue.peek()) != null && jCurrentTimeMillis - l.longValue() > ((long) this.LLJJJ) * 60000) {
                        queue.poll();
                    }
                    if (queue.isEmpty()) {
                        ((HashMap) this.LLJLLL).remove(entry.getKey());
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLJZ = jCurrentTimeMillis;
    }

    public static Boolean B1(RoomNotifyMessage roomNotifyMessage) {
        boolean z;
        if (roomNotifyMessage == null) {
            return Boolean.FALSE;
        }
        try {
            List<TextPiece> list = roomNotifyMessage.baseMessage.displayText.pieces;
            if (list.size() < 3) {
                return Boolean.FALSE;
            }
            Long lValueOf = Long.valueOf(roomNotifyMessage.from_user_id);
            Long lValueOf2 = Long.valueOf(list.get(2).userValue.user.getId());
            Long lValueOf3 = Long.valueOf(UserService.getInstance().user().getCurrentUserId());
            Long lValueOf4 = Long.valueOf(roomNotifyMessage.baseMessage.roomId);
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            Long lValueOf5 = 0L;
            if (room != null) {
                lValueOf5 = Long.valueOf(room.getId());
            }
            if (!lValueOf3.equals(lValueOf) && !lValueOf3.equals(lValueOf2) && !lValueOf5.equals(lValueOf4)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ePH, X.0en6] */
    public final void A1(final RoomNotifyMessage roomNotifyMessage) {
        List listLJJIIJZLJL;
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannel = this.dataChannel;
        c1102070emj.getClass();
        if (C1102070emj.LJIIIIZZ(dataChannel, 5, 0, 0)) {
            final long j = 0L;
            final AObjectS360S0100000_17 aObjectS360S0100000_17 = new AObjectS360S0100000_17(this, 2);
            ?? r3 = new AbstractC1098520eh0(roomNotifyMessage, j, aObjectS360S0100000_17) { // from class: X.0ePH
                public final RoomNotifyMessage LIZIZ;
                public final Long LIZJ;
                public final Function1<RoomNotifyMessage, Void> LIZLLL;

                @Override // X.InterfaceC1102300en6
                public final int LJIILJJIL() {
                    return 5;
                }

                @Override // X.InterfaceC1102300en6
                public final void Yc() {
                }

                @Override // X.InterfaceC1102300en6
                public final void Zc(int i) {
                }

                @Override // X.InterfaceC1102300en6
                public final int getBiz() {
                    return 0;
                }

                @Override // X.InterfaceC1102300en6
                public final int getScene() {
                    return 0;
                }

                @Override // X.InterfaceC1102300en6
                public final boolean LJIILIIL() {
                    String str;
                    RoomNotifyMessage roomNotifyMessage2 = this.LIZIZ;
                    if (roomNotifyMessage2 == null || (str = roomNotifyMessage2.schema) == null) {
                        return false;
                    }
                    return !str.isEmpty();
                }

                @Override // X.InterfaceC1102300en6
                public final long ad() {
                    return this.LIZJ.longValue();
                }

                @Override // X.InterfaceC1102300en6
                public final void bd() {
                    this.LIZLLL.invoke(this.LIZIZ);
                }

                @Override // X.InterfaceC1102300en6
                public final EnumC1100250ejn Xc() {
                    return EnumC1100250ejn.PRIVILEGE;
                }

                {
                    this.LIZIZ = roomNotifyMessage;
                    this.LIZJ = j;
                    this.LIZLLL = aObjectS360S0100000_17;
                }
            };
            this.LLJLL = r3;
            DataChannel dataChannel2 = this.dataChannel;
            c1102070emj.getClass();
            c1102070emj.getClass();
            C1102070emj.LJJ(dataChannel2, r3, false, null);
            if (C1102070emj.LJIIIZ(this.dataChannel, this.LLJLILLLLZIIL) && (listLJJIIJZLJL = C1102070emj.LJJIIJZLJL(this.dataChannel, this.LLJLILLLLZIIL, null)) != null) {
                Iterator it2 = listLJJIIJZLJL.iterator();
                while (it2.hasNext()) {
                    if (((C1088780eRI) it2.next()).LIZ.equals(this.LLJLL.LIZ)) {
                        C473410IhP.LIZLLL(2000L, this.LLJLLIL);
                        return;
                    }
                }
                return;
            }
            return;
        }
        z1(roomNotifyMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C1(final android.net.Uri r23) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.LiveRoomNotifyWidget.C1(android.net.Uri):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E1(com.bytedance.android.livesdk.model.message.RoomNotifyMessage r21) {
        /*
            Method dump skipped, instruction units count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.LiveRoomNotifyWidget.E1(com.bytedance.android.livesdk.model.message.RoomNotifyMessage):void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object... objArr) {
        Boolean boolValueOf;
        this.LL = (ImageView) findViewById(R.id.bnu);
        this.LLILLJJLI = (TextView) findViewById(R.id.pfd);
        this.LLILLL = (LiveIconView) findViewById(R.id.b97);
        this.LLILZIL = findViewById(R.id.pfp);
        this.LLILZLL = (C1091250eVH) findViewById(R.id.i5z);
        Context context = this.context;
        try {
            boolean z = true;
            if (!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).XM(context) != 1) {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            boolValueOf = Boolean.FALSE;
        }
        if (boolValueOf.booleanValue()) {
            try {
                ViewGroup.LayoutParams layoutParams = this.LLILZIL.getLayoutParams();
                layoutParams.width = (int) C497740JfY.LIZIZ(280.0f);
                C786410Ut5.W5(this.LLILZIL, layoutParams);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object... objArr) {
        C1091250eVH c1091250eVH;
        ((Boolean) this.dataChannel.gg0(C0TZM.class)).booleanValue();
        this.LLIZLLLIL = C12ES.LJIIJ(this.context);
        C20441214yg.LIZIZ("AnnouncementFrequencyConfig", this.LLJJ.toString());
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && Boolean.TRUE.equals(dataChannel.gg0(UserIsAnchorChannel.class))) {
            this.dataChannel.BQ2(this, HideTitleLayoutEvent.class, new AObjectS360S0100000_17(this, 0));
        }
        if (LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getAdvacedMessageDowngrade()) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.ADVANCED_MESSAGE_LEGACY_DOWNGRADE, new InterfaceC482090IvP() { // from class: X.0eMw
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC482090IvP
                public final void LIZ(C0IS4 c0is4) {
                    boolean z;
                    LiveRoomNotifyWidget liveRoomNotifyWidget = this.LIZ;
                    if (((Integer) c0is4.LIZ).intValue() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    liveRoomNotifyWidget.LLJLIL = z;
                }
            });
        }
        this.dataChannel.BQ2(this, RoomNotifyEvent.class, new AObjectS360S0100000_17(this, 1));
        if (this.LLJ == null || this.LLJI == null) {
            F1();
            if (this.LLJILJILJ) {
                C21616519il c21616519il = new C21616519il(this.LLILZIL, AbstractC21616419ik.LJIIL);
                this.LLJ = c21616519il;
                c21616519il.LJI(12.0f);
                this.LLJ.LJII(12.0f);
            } else if (C497740JfY.LJJ()) {
                C21616519il c21616519il2 = new C21616519il(this.LLILZIL, AbstractC21616419ik.LJIIL);
                this.LLJ = c21616519il2;
                c21616519il2.LJI(0.0f);
                C21616519il c21616519il3 = this.LLJ;
                C21581419d6 c21581419d6 = new C21581419d6();
                c21581419d6.LIZ(0.81f);
                c21581419d6.LIZIZ(80.0f);
                c21581419d6.LJIIIIZZ = -12.0f;
                c21616519il3.LJJ = c21581419d6;
            } else {
                C21616519il c21616519il4 = new C21616519il(this.LLILZIL, AbstractC21616419ik.LJIIL);
                this.LLJ = c21616519il4;
                c21616519il4.LJI(0.0f);
                C21616519il c21616519il5 = this.LLJ;
                C21581419d6 c21581419d62 = new C21581419d6();
                c21581419d62.LIZ(0.81f);
                c21581419d62.LIZIZ(80.0f);
                c21581419d62.LJIIIIZZ = 12.0f;
                c21616519il5.LJJ = c21581419d62;
            }
            this.LLJ.LIZIZ(new InterfaceC1427630nFp() { // from class: X.0ePC
                @Override // X.InterfaceC1427630nFp
                public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f, float f2) {
                    LiveRoomNotifyWidget liveRoomNotifyWidget = this.LIZ;
                    int i = LiveRoomNotifyWidget.LLJZIJLIL;
                    if (liveRoomNotifyWidget.isViewValid()) {
                        HandlerHook.viewRemoveCallbacks(liveRoomNotifyWidget.LLILZIL, liveRoomNotifyWidget.LLJJL);
                        HandlerHook.viewRemoveCallbacks(liveRoomNotifyWidget.LLILZIL, liveRoomNotifyWidget.LLJJJJJIL);
                        if (liveRoomNotifyWidget.LLILLJJLI.getLayout() != null) {
                            int lineWidth = ((int) liveRoomNotifyWidget.LLILLJJLI.getLayout().getLineWidth(0)) - ((liveRoomNotifyWidget.LLILLJJLI.getWidth() - liveRoomNotifyWidget.LLILLJJLI.getPaddingLeft()) - liveRoomNotifyWidget.LLILLJJLI.getPaddingRight());
                            liveRoomNotifyWidget.LLJJJJLIIL = lineWidth;
                            if (lineWidth > 0) {
                                HandlerHook.viewPostDelay(liveRoomNotifyWidget.LLILZIL, liveRoomNotifyWidget.LLJJL, 1000L);
                                return;
                            }
                        } else {
                            liveRoomNotifyWidget.LLJJJJLIIL = 0;
                        }
                        HandlerHook.viewPostDelay(liveRoomNotifyWidget.LLILZIL, liveRoomNotifyWidget.LLJJJJJIL, 2000L);
                    }
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            this.LLJI = animatorSet;
            animatorSet.addListener(new ALAdapterS13S0100000_17(this, 1));
        }
        this.LLJILJIL.LIZ(C784440Upu.LIZ().LJ(C464680IKc.class).LJJLJLI(new AfS132S0000000_7(2)));
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof C1078480eAg) {
                    Object obj2 = ((C1078480eAg) obj).LIZ;
                    if (obj2 instanceof RoomNotifyMessage) {
                        E1((RoomNotifyMessage) obj2);
                    }
                }
            }
        }
        if (this.LLIZ && (c1091250eVH = this.LLILZLL) != null) {
            c1091250eVH.setEnableFixedSize(true);
        }
        if (LiveNotifyFontWeightOptSetting.INSTANCE.isSeniorMessageFontWeightOpt()) {
            TextView textView = this.LLILLJJLI;
            if (textView instanceof C16F5) {
                ((C16F5) textView).setFontWeight(500);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04f3  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.widget.TextView] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0108 -> B:207:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z1(com.bytedance.android.livesdk.model.message.RoomNotifyMessage r19) {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.LiveRoomNotifyWidget.z1(com.bytedance.android.livesdk.model.message.RoomNotifyMessage):void");
    }
}
