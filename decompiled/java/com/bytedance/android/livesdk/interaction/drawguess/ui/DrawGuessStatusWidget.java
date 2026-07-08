package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.AbstractC1136060ffY;
import X.AbstractC19994813Le;
import X.C08D5;
import X.C0IK5;
import X.C0JFN;
import X.C0JFQ;
import X.C1119920fFW;
import X.C1161920gLG;
import X.C13LZ;
import X.C158B;
import X.C16F5;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C2188811AlT;
import X.C354710DvR;
import X.C497740JfY;
import X.C500260Jjc;
import X.C749060TZw;
import X.C769040UEs;
import X.C786410Ut5;
import X.CountDownTimerC521500Kcm;
import Y.ALAdapterS2S0300000_7;
import Y.ALAdapterS4S0100000_7;
import Y.ARunnableS76S0200000_7;
import Y.AUListenerS217S0200000_7;
import Y.AUListenerS257S0100000_7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundEndEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.android.livesdk.dataChannel.DrawGuessStatusVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessCurrentWordChannel;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveDrawGuessRequestSummaryDelaySetting;
import com.bytedance.android.livesdk.model.message.DrawGuessEndMessage;
import com.bytedance.android.livesdk.model.message.DrawGuessExitMessage;
import com.bytedance.android.livesdk.model.message.DrawGuessStartMessage;
import com.bytedance.android.livesdk.model.message.DrawGuessUpdateMessage;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawGuessStatusWidget extends LiveRecyclableWidget implements OnMessageListener {
    public View LL;
    public View LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public IMessageManager LLIZ;
    public CountDownTimerC521500Kcm LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI = true;
    public long LLJJIII;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gd5;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final String C1() {
        String str;
        if (!C500260Jjc.LJIIZILJ(this.dataChannel)) {
            return this.LLJ;
        }
        DrawGuessWord drawGuessWord = (DrawGuessWord) this.dataChannel.gg0(DrawGuessCurrentWordChannel.class);
        return (drawGuessWord == null || (str = drawGuessWord.word) == null) ? "" : str;
    }

    public final void J1() {
        boolean z = this.LLJI;
        if (z) {
            this.LLJI = false;
            C0JFN c0jfn = C0JFN.LIZ;
            DataChannel dataChannel = this.dataChannel;
            c0jfn.getClass();
            if (C0JFN.LJIIIIZZ(dataChannel)) {
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.SX0(C749060TZw.class, 9);
                }
            } else {
                DataChannel dataChannel3 = this.dataChannel;
                if (dataChannel3 != null) {
                    dataChannel3.SX0(C749060TZw.class, 1);
                }
            }
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null) {
                dataChannel4.FQ2(DrawGuessRoundEndEvent.class);
            }
            C0JFN.LJJ(this.dataChannel);
            CountDownTimerC521500Kcm countDownTimerC521500Kcm = this.LLIZLLLIL;
            if (countDownTimerC521500Kcm != null) {
                countDownTimerC521500Kcm.cancel();
            }
        }
        if (C1() != null) {
            if (!C500260Jjc.LJIIZILJ(this.dataChannel) || z) {
                M1(this);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        CountDownTimerC521500Kcm countDownTimerC521500Kcm = this.LLIZLLLIL;
        if (countDownTimerC521500Kcm != null) {
            countDownTimerC521500Kcm.cancel();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(DrawGuessStatusVisibilityChannel.class, Boolean.FALSE);
        }
        View view = getView();
        if (view != null) {
            if (view.getAlpha() == 0.0f) {
                super.hide();
                return;
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            viewPropertyAnimatorAnimate.alpha(0.0f);
            viewPropertyAnimatorAnimate.setDuration(120L);
            viewPropertyAnimatorAnimate.setListener(new ALAdapterS4S0100000_7(this, 9));
            viewPropertyAnimatorAnimate.start();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        CountDownTimerC521500Kcm countDownTimerC521500Kcm = this.LLIZLLLIL;
        if (countDownTimerC521500Kcm != null) {
            countDownTimerC521500Kcm.cancel();
        }
        this.LLIZLLLIL = null;
        IMessageManager iMessageManager = this.LLIZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.dataChannel.zQ2(this);
        C0JFN c0jfn = C0JFN.LIZ;
        DataChannel dataChannel = this.dataChannel;
        c0jfn.getClass();
        if (C0JFN.LJFF(dataChannel)) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
            C769040UEs.LIZLLL(this.dataChannel);
        }
        View view = getView();
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
        C16F5 c16f5 = this.LLILZLL;
        if (c16f5 == null) {
            c16f5 = null;
        }
        C500260Jjc.LJIILIIL(c16f5);
        C16F5 c16f52 = this.LLILZ;
        if (c16f52 == null) {
            c16f52 = null;
        }
        C500260Jjc.LJIILIIL(c16f52);
        this.LLJ = null;
        this.LLJI = false;
        this.LLJIJIL = 0;
        this.LLJILJIL = false;
        this.LLJILJILJ = false;
        this.LLJILLL = false;
        this.LLJJ = false;
        this.LLJJI = true;
        C16F5 c16f53 = this.LLILLL;
        if (c16f53 == null) {
            c16f53 = null;
        }
        c16f53.setText("");
        C16F5 c16f54 = this.LLILZ;
        if (c16f54 == null) {
            c16f54 = null;
        }
        c16f54.setText("");
        C16F5 c16f55 = this.LLILZLL;
        if (c16f55 == null) {
            c16f55 = null;
        }
        c16f55.setText("");
        C16F5 c16f56 = this.LLILZIL;
        (c16f56 != null ? c16f56 : null).setText("");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        Animation animation;
        if (this.LLJJI) {
            View view = getView();
            if (view == null || (animation = view.getAnimation()) == null || !animation.hasStarted()) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.zW(DrawGuessStatusVisibilityChannel.class, Boolean.TRUE);
                }
                View view2 = getView();
                if (view2 != null) {
                    if (view2.getAlpha() == 1.0f) {
                        super.show();
                        return;
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                    viewPropertyAnimatorAnimate.alpha(1.0f);
                    viewPropertyAnimatorAnimate.setDuration(120L);
                    viewPropertyAnimatorAnimate.setListener(new ALAdapterS4S0100000_7(this, 10));
                    viewPropertyAnimatorAnimate.start();
                }
            }
        }
    }

    public final void H1() {
        hide();
        this.LLJILLL = false;
        this.LLJJ = false;
        this.LLJI = false;
        CountDownTimerC521500Kcm countDownTimerC521500Kcm = this.LLIZLLLIL;
        if (countDownTimerC521500Kcm != null) {
            countDownTimerC521500Kcm.cancel();
        }
        this.LLJIJIL = 0;
        this.LLJ = null;
        this.LLJILJIL = false;
        C16F5 c16f5 = this.LLILZLL;
        if (c16f5 == null) {
            c16f5 = null;
        }
        C500260Jjc.LJIILIIL(c16f5);
        C16F5 c16f52 = this.LLILZLL;
        if (c16f52 == null) {
            c16f52 = null;
        }
        c16f52.setBackground(C497740JfY.LJIIJ(R.drawable.edx));
        View view = this.LL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.T4(view, 1.0f);
        View view2 = this.LL;
        if (view2 == null) {
            view2 = null;
        }
        C500260Jjc.LLFFF(view2);
        C16F5 c16f53 = this.LLILZ;
        if (c16f53 == null) {
            c16f53 = null;
        }
        C786410Ut5.k5(c16f53, 1.0f);
        C16F5 c16f54 = this.LLILZ;
        if (c16f54 == null) {
            c16f54 = null;
        }
        C500260Jjc.LLFFF(c16f54);
        View view3 = this.LLILLJJLI;
        C500260Jjc.LJIILIIL(view3 != null ? view3 : null);
    }

    public static CharSequence E1(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append(charSequence);
        C1119920fFW.LJIIIIZZ(spannableStringBuilderAppend, 0, spannableStringBuilderAppend.length(), 33, 500);
        return spannableStringBuilderAppend;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void M1(com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget r10) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget.M1(com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget):void");
    }

    public final String B1(int i) {
        int i2 = i % 3600;
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        if (i3 < 10) {
            sbLIZ2.append('0');
        } else {
            sbLIZ2.append("");
        }
        sbLIZ2.append(i3);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(':');
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        if (i4 < 10) {
            sbLIZ3.append('0');
        } else {
            sbLIZ3.append("");
        }
        sbLIZ3.append(i4);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ3));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final CharSequence D1(int i) {
        String strLJIJJ;
        String strLIZIZ;
        StringBuilder sbLIZ;
        String strC1 = C1();
        if (strC1 == null) {
            strLJIJJ = C497740JfY.LJIJI(i);
        } else {
            strLJIJJ = C497740JfY.LJIJJ(i, strC1);
        }
        C0JFN c0jfn = C0JFN.LIZ;
        int i2 = this.LLJIJIL;
        c0jfn.getClass();
        String strLIZLLL = C0JFN.LIZLLL(i2);
        if (this.LLJILJILJ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZLLL);
            sbLIZ2.append("x ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(" x");
            sbLIZ3.append(strLIZLLL);
            sbLIZ3.append(' ');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (this.LLJILJILJ) {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(strLJIJJ);
        } else {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJIJJ);
            sbLIZ.append(strLIZIZ);
        }
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJILJIL) {
            if (this.LLJILJILJ) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(C497740JfY.LJIJI(2131841387));
                sbLIZ4.append(strLIZIZ2);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
            } else {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(strLIZIZ2);
                sbLIZ5.append(C497740JfY.LJIJI(2131841387));
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
            }
        }
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) strLIZIZ2);
        C1119920fFW.LJIIIIZZ(spannableStringBuilderAppend, 0, spannableStringBuilderAppend.length(), 33, 500);
        if (strC1 != null && a0.LJJJ(strLJIJJ, strC1, 0, false, 6) != -1) {
            int iLJJJ = a0.LJJJ(strLJIJJ, strC1, 0, false, 6);
            int length = strC1.length() + iLJJJ;
            C786410Ut5.q2(spannableStringBuilderAppend, new ForegroundColorSpan(C497740JfY.LJFF(R.color.ac4)), iLJJJ, length, 33);
            C1119920fFW.LJIIIIZZ(spannableStringBuilderAppend, iLJJJ, length, 33, OppoPermissionPopupMaskDelayExp.DEFAULT);
        }
        int iLJJJ2 = a0.LJJJ(spannableStringBuilderAppend, strLIZIZ, 0, false, 6);
        int length2 = strLIZIZ.length() + iLJJJ2;
        C786410Ut5.q2(spannableStringBuilderAppend, new ForegroundColorSpan(C497740JfY.LJFF(R.color.ac4)), iLJJJ2, length2, 33);
        C786410Ut5.q2(spannableStringBuilderAppend, new StyleSpan(2), iLJJJ2, length2, 33);
        C1119920fFW.LJIIIIZZ(spannableStringBuilderAppend, iLJJJ2, length2, 33, OppoPermissionPopupMaskDelayExp.DEFAULT);
        return spannableStringBuilderAppend;
    }

    public final CharSequence F1(int i) {
        String strC1 = C1();
        if (strC1 == null) {
            return null;
        }
        String strLJIJJ = C497740JfY.LJIJJ(i, strC1);
        int iLJJJ = a0.LJJJ(strLJIJJ, strC1, 0, false, 6);
        if (iLJJJ == -1) {
            return strLJIJJ;
        }
        int length = strC1.length() + iLJJJ;
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) strLJIJJ);
        C786410Ut5.q2(spannableStringBuilderAppend, new ForegroundColorSpan(C497740JfY.LJFF(R.color.ac4)), iLJJJ, length, 33);
        C1119920fFW.LJIIIIZZ(spannableStringBuilderAppend, 0, strLJIJJ.length(), 33, 500);
        C1119920fFW.LJIIIIZZ(spannableStringBuilderAppend, iLJJJ, length, 33, OppoPermissionPopupMaskDelayExp.DEFAULT);
        return spannableStringBuilderAppend;
    }

    public final void G1(DrawGuessStartMessage drawGuessStartMessage) {
        if (C500260Jjc.LJIJI(this.dataChannel)) {
            PictionaryInfo pictionaryInfo = drawGuessStartMessage.data;
            this.LLJJIII = pictionaryInfo.id;
            if (pictionaryInfo.pictionaryType == 2) {
                C0JFN c0jfn = C0JFN.LIZ;
                DataChannel dataChannel = this.dataChannel;
                c0jfn.getClass();
                C0JFN.LJIILIIL(dataChannel, false);
                return;
            }
            H1();
            I1(drawGuessStartMessage.data.endTime - (C158B.LIZ() / 1000));
            C0JFN c0jfn2 = C0JFN.LIZ;
            DataChannel dataChannel2 = this.dataChannel;
            PictionaryInfo pictionaryInfo2 = drawGuessStartMessage.data;
            boolean z = this.LLJJ;
            c0jfn2.getClass();
            C0JFN.LJIJ(pictionaryInfo2.id, pictionaryInfo2.sessionId, new DrawGuessWord(0L, pictionaryInfo2.word), dataChannel2, z);
        }
    }

    public final void I1(long j) {
        View view;
        if (j < 0) {
            return;
        }
        long j2 = j * 1000;
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 == null) {
            c16f5 = null;
        }
        c16f5.setText(E1(B1((int) (j2 / 1000))));
        if (getView() != null && getView().getAlpha() > 0.0f && C500260Jjc.LJJJJIZL(getView()) && (view = getView()) != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            viewPropertyAnimatorAnimate.alpha(0.0f);
            viewPropertyAnimatorAnimate.setDuration(120L);
            viewPropertyAnimatorAnimate.start();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(120L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS257S0100000_7(this, 40));
        valueAnimatorOfFloat.addListener(new ALAdapterS4S0100000_7(this, 32));
        valueAnimatorOfFloat.start();
        if (this.LLJI) {
            CountDownTimerC521500Kcm countDownTimerC521500Kcm = this.LLIZLLLIL;
            if (countDownTimerC521500Kcm != null) {
                countDownTimerC521500Kcm.cancel();
            }
            this.LLIZLLLIL = null;
        }
        this.LLIZLLLIL = new CountDownTimerC521500Kcm(j2, this, 6);
    }

    public final void L1(IMessage iMessage) {
        PictionaryFullInfo pictionaryFullInfo;
        if (!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            return;
        }
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (room == null || (pictionaryFullInfo = room.getPictionaryFullInfo()) == null) {
            pictionaryFullInfo = new PictionaryFullInfo(new PictionaryInfo(), new PictionaryStatistics(0L, 0L, null), false);
        }
        if (iMessage instanceof DrawGuessStartMessage) {
            pictionaryFullInfo.pictionaryInfo = ((DrawGuessStartMessage) iMessage).data;
        } else if (iMessage instanceof DrawGuessUpdateMessage) {
            pictionaryFullInfo.pictionaryStatistics.guessCorrectUv = ((DrawGuessUpdateMessage) iMessage).correctCount;
        } else if ((iMessage instanceof DrawGuessExitMessage) || (iMessage instanceof DrawGuessEndMessage)) {
            pictionaryFullInfo = null;
        }
        Room room2 = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (room2 != null) {
            room2.setPictionaryFullInfo(pictionaryFullInfo);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LL = findViewById(R.id.gcp);
        this.LLILLJJLI = findViewById(R.id.jga);
        this.LLILLL = (C16F5) findViewById(R.id.t5b);
        this.LLILZ = (C16F5) findViewById(R.id.o9a);
        this.LLILZIL = (C16F5) findViewById(R.id.jgb);
        this.LLILZLL = (C16F5) findViewById(R.id.irw);
        this.LLJILJILJ = C497740JfY.LJJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(java.lang.Object[] r22) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget.onLoad(java.lang.Object[]):void");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        AbstractC1136060ffY abstractC1136060ffY;
        Long l = null;
        if ((iMessage instanceof AbstractC1136060ffY) && (abstractC1136060ffY = (AbstractC1136060ffY) iMessage) != null) {
            if (abstractC1136060ffY instanceof DrawGuessStartMessage) {
                L1(iMessage);
                G1((DrawGuessStartMessage) abstractC1136060ffY);
                return;
            }
            if (abstractC1136060ffY instanceof DrawGuessUpdateMessage) {
                L1(iMessage);
                DrawGuessUpdateMessage drawGuessUpdateMessage = (DrawGuessUpdateMessage) abstractC1136060ffY;
                long j = drawGuessUpdateMessage.roundId;
                if (j == 0) {
                    return;
                }
                C0JFN c0jfn = C0JFN.LIZ;
                DataChannel dataChannel = this.dataChannel;
                c0jfn.getClass();
                Long lLJIJJ = C0JFN.LJIJJ(dataChannel);
                if (lLJIJJ == null || j != lLJIJJ.longValue()) {
                    return;
                }
                long j2 = drawGuessUpdateMessage.correctCount;
                this.LLJIJIL = (int) j2;
                C0JFN.LJJIII(j2, this.dataChannel);
                M1(this);
                return;
            }
            if (abstractC1136060ffY instanceof DrawGuessExitMessage) {
                L1(iMessage);
                if (C0JFQ.LIZIZ(this.dataChannel)) {
                    C0JFN c0jfn2 = C0JFN.LIZ;
                    DataChannel dataChannel2 = this.dataChannel;
                    c0jfn2.getClass();
                    C0JFN.LJIIL(dataChannel2);
                    return;
                }
                hide();
                J1();
                if (((DrawGuessExitMessage) abstractC1136060ffY).showStats) {
                    DataChannel dataChannel3 = this.dataChannel;
                    if (dataChannel3 != null) {
                        l = (Long) dataChannel3.gg0(DrawGuessSessionIdChannel.class);
                    }
                    C08D5.LIZIZ(C0IK5.LIZ(), new ARunnableS76S0200000_7(this, l, 20), this.dataChannel, C13LZ.LJIIJJI(AbstractC19994813Le.Default, new C354710DvR(0L, LiveDrawGuessRequestSummaryDelaySetting.INSTANCE.getDelayTime())));
                }
                C0JFN c0jfn3 = C0JFN.LIZ;
                DataChannel dataChannel4 = this.dataChannel;
                c0jfn3.getClass();
                C0JFN.LJIILJJIL(dataChannel4, "", false);
                return;
            }
            if (!(abstractC1136060ffY instanceof DrawGuessEndMessage)) {
                return;
            }
            L1(iMessage);
            long j3 = this.LLJJIII;
            if (j3 != 0 && ((DrawGuessEndMessage) abstractC1136060ffY).roundId != j3) {
                return;
            }
            DrawGuessEndMessage drawGuessEndMessage = (DrawGuessEndMessage) abstractC1136060ffY;
            if (drawGuessEndMessage.endType == 4) {
                H1();
                DataChannel dataChannel5 = this.dataChannel;
                if (dataChannel5 == null) {
                    return;
                }
                dataChannel5.FQ2(DrawGuessRoundEndEvent.class);
                return;
            }
            long j4 = drawGuessEndMessage.roundId;
            C0JFN c0jfn4 = C0JFN.LIZ;
            DataChannel dataChannel6 = this.dataChannel;
            c0jfn4.getClass();
            Long lLJIJJ2 = C0JFN.LJIJJ(dataChannel6);
            if (lLJIJJ2 == null || j4 != lLJIJJ2.longValue()) {
                return;
            }
            this.LLJ = drawGuessEndMessage.word;
            J1();
            C0JFN.LJIIZILJ(this.dataChannel);
        }
    }

    public final void z1(C16F5 c16f5) {
        int i;
        if (!C0JFQ.LIZ(this.dataChannel)) {
            return;
        }
        Context context = c16f5.getContext();
        if (C497740JfY.LJJ()) {
            i = R.attr.d33;
        } else {
            i = R.attr.d3e;
        }
        C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(i, context);
        if (c20743516FdLIZLLL != null) {
            c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.0f), (int) C497740JfY.LIZIZ(16.0f));
            c20743516FdLIZLLL.setTint(C497740JfY.LJFF(R.color.aas));
        } else {
            c20743516FdLIZLLL = null;
        }
        c16f5.setCompoundDrawablesRelative(null, null, c20743516FdLIZLLL, null);
    }

    public final void A1(View view, View view2, boolean z) {
        if (!z) {
            C500260Jjc.LLFFF(view);
            C500260Jjc.LJIILIIL(view2);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(120L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS217S0200000_7(view, view2, 3));
        valueAnimatorOfFloat.addListener(new ALAdapterS2S0300000_7(view, this, view2, 2));
        valueAnimatorOfFloat.start();
    }
}
