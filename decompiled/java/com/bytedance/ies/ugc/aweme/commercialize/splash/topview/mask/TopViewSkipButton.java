package com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask;

import X.C01GW;
import X.C1057810ddL;
import X.C1077210e8d;
import X.C19MB;
import X.C444960Hcc;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC588460N6e;
import Y.ARunnableS2S0102000_6;
import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ad.splash.utils.WeakHandler;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.Arrays;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class TopViewSkipButton extends ConstraintLayout implements InterfaceC588460N6e {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public String LLILZ;
    public int LLILZIL;
    public final WeakHandler LLILZLL;
    public PthreadTimer LLIZ;
    public AwemeSplashInfo.SkipInfo LLIZLLLIL;

    public TopViewSkipButton(Context context) {
        this(context, null, 6, 0);
    }

    public TopViewSkipButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final TextView getButtonUi() {
        return (TextView) this.LL.getValue();
    }

    private final View getButtonUnClick() {
        return (View) this.LLILLL.getValue();
    }

    public final void e0() {
        AwemeSplashInfo.SkipInfo skipInfo = this.LLIZLLLIL;
        if (skipInfo == null || !skipInfo.isCountdown_enable() || this.LLILZIL == 0) {
            return;
        }
        if (C444960Hcc.LIZJ(getContext())) {
            TextView buttonUi = getButtonUi();
            Object[] objArr = new Object[3];
            String str = this.LLILZ;
            objArr[0] = str != null ? str : null;
            objArr[1] = Integer.valueOf(this.LLILZIL);
            objArr[2] = skipInfo.getCountdownUnit();
            buttonUi.setText(C786410Ut5.j4("%s %s%s", Arrays.copyOf(objArr, 3)));
            return;
        }
        TextView buttonUi2 = getButtonUi();
        Object[] objArr2 = new Object[3];
        objArr2[0] = Integer.valueOf(this.LLILZIL);
        objArr2[1] = skipInfo.getCountdownUnit();
        String str2 = this.LLILZ;
        objArr2[2] = str2 != null ? str2 : null;
        buttonUi2.setText(C786410Ut5.j4("%s%s %s", Arrays.copyOf(objArr2, 3)));
    }

    public final View getButtonHot() {
        return (View) this.LLILLJJLI.getValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LLILZ = getContext().getString(2131848712);
    }

    private final void setCountDownTime(int i) {
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if (i < i2) {
                this.LLILZIL = i;
                return;
            }
            return;
        }
        this.LLILZIL = i;
    }

    public final void h0(long j) {
        setCountDownTime((int) (j / 1000));
        if (this.LLIZ == null) {
            e0();
            PthreadTimer pthreadTimer = new PthreadTimer("TopViewSkipButton");
            this.LLIZ = pthreadTimer;
            pthreadTimer.scheduleAtFixedRate(new C1077210e8d(this, 0), (j % 1000) + 1000, 1000L);
        }
    }

    @Override // X.InterfaceC588460N6e
    public final void handleMsg(Message message) {
        if (message != null && message.what == 1) {
            setCountDownTime(this.LLILZIL - 1);
            e0();
            if (this.LLILZIL == 0) {
                PthreadTimer pthreadTimer = this.LLIZ;
                if (pthreadTimer != null) {
                    pthreadTimer.cancel();
                }
                this.LLIZ = null;
            }
        }
    }

    public final void i0(AwemeSplashInfo.SkipInfo skipInfo) {
        this.LLIZLLLIL = skipInfo;
        String text = skipInfo.getText();
        if (text != null && text.length() != 0) {
            this.LLILZ = skipInfo.getText();
        }
        TextView buttonUi = getButtonUi();
        String str = this.LLILZ;
        if (str == null) {
            str = null;
        }
        buttonUi.setText(str);
        int buttonExtraStyle = skipInfo.getButtonExtraStyle();
        if (buttonExtraStyle == 1 || buttonExtraStyle == 3) {
            C786410Ut5.LJLLLLLL(0, getButtonUnClick());
            HandlerHook.viewPost(getButtonHot(), new ARunnableS2S0102000_6(this, (int) C1057810ddL.LIZIZ(skipInfo.getHeightExtraSize(), getContext()), (int) C1057810ddL.LIZIZ(skipInfo.getWidthExtraSize(), getContext()), 2));
        }
        if (C444960Hcc.LIZJ(getContext()) && buttonExtraStyle != 2 && buttonExtraStyle != 3) {
            C19MB c19mb = new C19MB();
            c19mb.LJII(this);
            c19mb.LJI(getButtonUi().getId(), 2);
            c19mb.LJIIIZ(getButtonUi().getId(), 1, 0, 1, 10);
            if (getButtonUnClick().getVisibility() == 0) {
                c19mb.LJI(getButtonUnClick().getId(), 2);
                c19mb.LJI(getButtonUnClick().getId(), 1);
                c19mb.LJIIIIZZ(getButtonUnClick().getId(), 2, getButtonUi().getId(), 2);
                c19mb.LJIIIIZZ(getButtonUnClick().getId(), 1, 0, 1);
            }
            c19mb.LIZIZ(this);
        }
    }

    public TopViewSkipButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LL = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 44));
        this.LLILLJJLI = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 43));
        this.LLILLL = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 45));
        this.LLILZLL = new WeakHandler(this);
    }

    public /* synthetic */ TopViewSkipButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
