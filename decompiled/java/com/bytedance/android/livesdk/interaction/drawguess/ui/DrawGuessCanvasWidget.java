package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C0IJT;
import X.C0IPN;
import X.C0JFD;
import X.C0JFN;
import X.C0JGR;
import X.C0UA1;
import X.C1078480eAg;
import X.C1143920fsE;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C16F5;
import X.C20337914i1;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C769040UEs;
import X.C776250Uch;
import X.C786410Ut5;
import X.CountDownTimerC521500Kcm;
import Y.ALAdapterS4S0100000_7;
import Y.AUListenerS257S0100000_7;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCancelWhenNotStartEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessExitGameEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessFreelyStartChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessCurrentWordChannel;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessGameLoadedEvent;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.model.message.DrawGuessEndMessage;
import com.bytedance.android.livesdk.model.message.DrawGuessExitMessage;
import com.bytedance.android.livesdk.model.message.DrawGuessStartMessage;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawGuessCanvasWidget extends LiveRecyclableWidget implements OnMessageListener {
    public C16F5 LL;
    public C16F5 LLILLJJLI;
    public C1324720kZq LLILLL;
    public IMessageManager LLILZ;
    public CountDownTimerC521500Kcm LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public C1143920fsE LLJ;
    public DrawGuessWord LLJI;
    public boolean LLJIJIL;
    public long LLJILJIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gd4;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void C1() {
        CountDownTimerC521500Kcm countDownTimerC521500Kcm;
        if (this.LLILZIL == null) {
            this.LLILZIL = new CountDownTimerC521500Kcm(this, 0);
        }
        if (this.LLIZ && (countDownTimerC521500Kcm = this.LLILZIL) != null) {
            countDownTimerC521500Kcm.cancel();
        }
        z1();
        C16F5 c16f5 = this.LLILLJJLI;
        if (c16f5 == null) {
            c16f5 = null;
        }
        c16f5.setText(CardStruct.IStatusCode.DEFAULT);
        D1();
        View[] viewArr = new View[2];
        C16F5 c16f52 = this.LLILLJJLI;
        if (c16f52 == null) {
            c16f52 = null;
        }
        viewArr[0] = c16f52;
        C16F5 c16f53 = this.LL;
        viewArr[1] = c16f53 != null ? c16f53 : null;
        x1(viewArr);
        B1(false);
        CountDownTimerC521500Kcm countDownTimerC521500Kcm2 = this.LLILZIL;
        if (countDownTimerC521500Kcm2 != null) {
            countDownTimerC521500Kcm2.start();
        }
        this.LLIZ = true;
        this.LLIZLLLIL = false;
    }

    public final void D1() {
        String str;
        DrawGuessWord drawGuessWord;
        if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            C16F5 c16f5 = this.LL;
            if (c16f5 == null) {
                c16f5 = null;
            }
            C500260Jjc.LLFFF(c16f5);
            C16F5 c16f52 = this.LLILLJJLI;
            if (c16f52 == null) {
                c16f52 = null;
            }
            C500260Jjc.LLFFF(c16f52);
            C1324720kZq c1324720kZq = this.LLILLL;
            if (c1324720kZq == null) {
                c1324720kZq = null;
            }
            C500260Jjc.LLFFF(c1324720kZq);
            C16F5 c16f53 = this.LLILLJJLI;
            if (c16f53 == null) {
                c16f53 = null;
            }
            c16f53.setText("3");
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel == null || (drawGuessWord = (DrawGuessWord) dataChannel.gg0(DrawGuessCurrentWordChannel.class)) == null || (str = drawGuessWord.word) == null) {
                str = "";
            }
            C16F5 c16f54 = this.LL;
            (c16f54 != null ? c16f54 : null).setText(C497740JfY.LJIJJ(2131841430, str));
            return;
        }
        int i = this.LLILZLL;
        if (i == 2) {
            CountDownTimerC521500Kcm countDownTimerC521500Kcm = this.LLILZIL;
            if (countDownTimerC521500Kcm != null) {
                countDownTimerC521500Kcm.cancel();
            }
            C16F5 c16f55 = this.LL;
            if (c16f55 == null) {
                c16f55 = null;
            }
            c16f55.setText(C497740JfY.LJIJI(2131841429));
            C16F5 c16f56 = this.LLILLJJLI;
            if (c16f56 == null) {
                c16f56 = null;
            }
            C500260Jjc.LJIILIIL(c16f56);
            View[] viewArr = new View[1];
            C16F5 c16f57 = this.LL;
            viewArr[0] = c16f57 != null ? c16f57 : null;
            x1(viewArr);
            return;
        }
        if (this.LLIZ) {
            C16F5 c16f58 = this.LL;
            if (c16f58 == null) {
                c16f58 = null;
            }
            C500260Jjc.LLFFF(c16f58);
            C16F5 c16f59 = this.LL;
            (c16f59 != null ? c16f59 : null).setText(2131841424);
            return;
        }
        if (i != 1) {
            C16F5 c16f510 = this.LL;
            C500260Jjc.LJIILIIL(c16f510 != null ? c16f510 : null);
            return;
        }
        C16F5 c16f511 = this.LL;
        if (c16f511 == null) {
            c16f511 = null;
        }
        c16f511.setText(C497740JfY.LJIJI(2131841406));
        View[] viewArr2 = new View[1];
        C16F5 c16f512 = this.LL;
        viewArr2[0] = c16f512 != null ? c16f512 : null;
        x1(viewArr2);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        CountDownTimerC521500Kcm countDownTimerC521500Kcm = this.LLILZIL;
        if (countDownTimerC521500Kcm != null) {
            countDownTimerC521500Kcm.cancel();
        }
        this.LLILZIL = null;
        IMessageManager iMessageManager = this.LLILZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = 0;
        this.LLIZ = false;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = false;
    }

    public final void z1() {
        if (C500260Jjc.LJIJI(this.dataChannel)) {
            return;
        }
        C0JFD liveGameEffectHelper = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
        DataChannel dataChannel = this.dataChannel;
        liveGameEffectHelper.getClass();
        LiveEffect liveEffectLIZIZ = C769040UEs.LIZIZ(dataChannel);
        if (liveEffectLIZIZ != null) {
            C0UA1.LIZ().kr(liveEffectLIZIZ, "livegame");
            this.dataChannel.FQ2(DrawGuessGameLoadedEvent.class);
        }
    }

    public final void A1(DrawGuessStartMessage drawGuessStartMessage) {
        if (!C500260Jjc.LJIIZILJ(this.dataChannel)) {
            PictionaryInfo pictionaryInfo = drawGuessStartMessage.data;
            if (pictionaryInfo.pictionaryType != 2) {
                this.LLJILJIL = pictionaryInfo.id;
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.zW(DrawGuessIsCountingDownRoundStart.class, Boolean.TRUE);
                }
                this.LLILZLL = 0;
                C1();
                D1();
            }
        }
    }

    public final void B1(boolean z) {
        float f;
        Long l;
        if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            C20337914i1<Boolean> c20337914i1 = C0JGR.y2;
            if (c20337914i1.LIZIZ().booleanValue()) {
                c20337914i1.LJFF(Boolean.FALSE);
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null && (l = (Long) dataChannel.gg0(DrawGuessSessionIdChannel.class)) != null) {
                    long jLongValue = l.longValue();
                    Long l2 = (Long) this.dataChannel.gg0(DrawGuessRoundIdChannel.class);
                    if (l2 != null) {
                        long jLongValue2 = l2.longValue();
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_gesture_show");
                        c474500IjALIZ.LJIJJLI(this.dataChannel);
                        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "pictionary_session_id");
                        c474500IjALIZ.LJJII(Long.valueOf(jLongValue2), "pictionary_id");
                        c474500IjALIZ.LIZ();
                    }
                }
                C1324720kZq c1324720kZq = this.LLILLL;
                C1324720kZq c1324720kZq2 = null;
                if (c1324720kZq == null) {
                    c1324720kZq = null;
                }
                if (z) {
                    f = 280.0f;
                } else {
                    f = 8.0f;
                }
                C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(f), c1324720kZq);
                C1324720kZq c1324720kZq3 = this.LLILLL;
                if (c1324720kZq3 == null) {
                    c1324720kZq3 = null;
                }
                C786410Ut5.h5(c1324720kZq3, 0.0f);
                C1324720kZq c1324720kZq4 = this.LLILLL;
                if (c1324720kZq4 == null) {
                    c1324720kZq4 = null;
                }
                C500260Jjc.LLFFF(c1324720kZq4);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setStartDelay(1000L);
                valueAnimatorOfFloat.setDuration(120L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS257S0100000_7(this, 5));
                valueAnimatorOfFloat.addListener(new ALAdapterS4S0100000_7(this, 8));
                valueAnimatorOfFloat.start();
                View[] viewArr = new View[1];
                C1324720kZq c1324720kZq5 = this.LLILLL;
                if (c1324720kZq5 != null) {
                    c1324720kZq2 = c1324720kZq5;
                }
                viewArr[0] = c1324720kZq2;
                y1(3000L, viewArr);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LL = (C16F5) findViewById(R.id.sug);
        this.LLILLJJLI = (C16F5) findViewById(R.id.f14);
        this.LLILLL = (C1324720kZq) findViewById(R.id.g_g);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager;
        Object obj;
        AbstractC1136060ffY abstractC1136060ffY;
        hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.DRAW_GUESS_START_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.DRAW_GUESS_EXIT_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.DRAW_GUESS_END_MESSAGE.getIntType(), this);
        } else {
            iMessageManager = null;
        }
        this.LLILZ = iMessageManager;
        if (C500260Jjc.LJIIZILJ(this.dataChannel) && C0JGR.y2.LIZIZ().booleanValue()) {
            C1324720kZq c1324720kZq = this.LLILLL;
            if (c1324720kZq == null) {
                c1324720kZq = null;
            }
            C500260Jjc.LJIILIIL(c1324720kZq);
            C1143920fsE c1143920fsE = new C1143920fsE();
            c1143920fsE.LIZJ = "ttlive_draw_guess_guide.webp";
            c1143920fsE.LJFF = false;
            c1143920fsE.LIZIZ = C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1");
            C1324720kZq c1324720kZq2 = this.LLILLL;
            if (c1324720kZq2 == null) {
                c1324720kZq2 = null;
            }
            c1143920fsE.LIZ = c1324720kZq2;
            this.LLJ = c1143920fsE;
            c1143920fsE.LIZLLL();
        }
        if (C500260Jjc.LJIJI(this.dataChannel)) {
            this.dataChannel.BQ2(this, DrawGuessExitGameEvent.class, new AwS586S0100000_7(this, 114));
        } else {
            DataChannel dataChannel2 = this.dataChannel;
            dataChannel2.BQ2(this, DrawGuessIsCountingDownRoundStart.class, new AwS586S0100000_7(this, 115));
            dataChannel2.BQ2(this, DrawGuessFreelyStartChannel.class, new AwS586S0100000_7(this, 116));
            dataChannel2.BQ2(this, DrawGuessCancelWhenNotStartEvent.class, new AwS586S0100000_7(this, 117));
            dataChannel2.BQ2(this, DrawGuessExitGameEvent.class, new AwS586S0100000_7(this, 118));
        }
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C1078480eAg) && ((obj = ((C1078480eAg) obj2).LIZ) == null || (obj instanceof IMessage))) {
                    if ((obj instanceof AbstractC1136060ffY) && (abstractC1136060ffY = (AbstractC1136060ffY) obj) != null) {
                        A1((DrawGuessStartMessage) abstractC1136060ffY);
                        attachAndShow();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        AbstractC1136060ffY abstractC1136060ffY;
        if ((iMessage instanceof AbstractC1136060ffY) && (abstractC1136060ffY = (AbstractC1136060ffY) iMessage) != null) {
            if (abstractC1136060ffY instanceof DrawGuessStartMessage) {
                A1((DrawGuessStartMessage) abstractC1136060ffY);
                return;
            }
            if (abstractC1136060ffY instanceof DrawGuessExitMessage) {
                this.LLILZLL = 0;
                CountDownTimerC521500Kcm countDownTimerC521500Kcm = this.LLILZIL;
                if (countDownTimerC521500Kcm != null) {
                    countDownTimerC521500Kcm.cancel();
                }
                hide();
                return;
            }
            if (!(abstractC1136060ffY instanceof DrawGuessEndMessage)) {
                return;
            }
            long j = this.LLJILJIL;
            if (j != 0 && ((DrawGuessEndMessage) abstractC1136060ffY).roundId != j) {
                return;
            }
            if (((DrawGuessEndMessage) abstractC1136060ffY).endType == 4) {
                if (!C500260Jjc.LJIJI(this.dataChannel)) {
                    return;
                }
                this.LLILZLL = 2;
                D1();
                return;
            }
            C0JFN c0jfn = C0JFN.LIZ;
            DataChannel dataChannel = this.dataChannel;
            c0jfn.getClass();
            Long lLJIJJ = C0JFN.LJIJJ(dataChannel);
            if (lLJIJJ != null && lLJIJJ.longValue() == 0) {
                this.LLILZLL = 0;
                CountDownTimerC521500Kcm countDownTimerC521500Kcm2 = this.LLILZIL;
                if (countDownTimerC521500Kcm2 != null) {
                    countDownTimerC521500Kcm2.cancel();
                }
                hide();
                return;
            }
            this.LLILZLL = 1;
            D1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x1(android.view.View... r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.getView()
            boolean r0 = X.C500260Jjc.LJJJJIZL(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJIFFI(r0)
            if (r0 != 0) goto L28
            android.view.View r0 = r3.getView()
            if (r0 == 0) goto L50
            float r0 = r0.getAlpha()
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L20:
            r0 = 1065353216(0x3f800000, float:1.0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LIZLLL(r1, r0)
            if (r0 != 0) goto L2b
        L28:
            r3.show()
        L2b:
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0052: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r0 = 120(0x78, double:5.93E-322)
            r2.setDuration(r0)
            Y.AUListenerS257S0100000_7 r1 = new Y.AUListenerS257S0100000_7
            r0 = 3
            r1.<init>(r4, r0)
            r2.addUpdateListener(r1)
            Y.ALAdapterS4S0100000_7 r1 = new Y.ALAdapterS4S0100000_7
            r0 = 7
            r1.<init>(r4, r0)
            r2.addListener(r1)
            r2.start()
            return
        L50:
            r1 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessCanvasWidget.x1(android.view.View[]):void");
    }

    public static void y1(long j, View... viewArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setDuration(120L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS257S0100000_7(viewArr, 4));
        valueAnimatorOfFloat.start();
    }
}
