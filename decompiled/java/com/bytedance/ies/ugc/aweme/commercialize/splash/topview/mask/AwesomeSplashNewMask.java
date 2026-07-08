package com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask;

import X.C01GW;
import X.C0XI4;
import X.C1017070cZd;
import X.C1022820ciu;
import X.C1030680cva;
import X.C1031100cwG;
import X.C1077570e9D;
import X.C12ES;
import X.C1389890mGx;
import X.C14KQ;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C341940Daq;
import X.C444960Hcc;
import X.C452501pT;
import X.C497820Jfg;
import X.C740360T2k;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1028550cs9;
import X.InterfaceC987700boG;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS151S0100000_16;
import Y.ALAdapterS1S0000000_16;
import Y.ARunnableS116S0100000_16;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.google.gson.Gson;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AwesomeSplashNewMask extends RelativeLayout implements InterfaceC987700boG {
    public static final C01GW<Integer> LLJLIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(71));
    public int LL;
    public final Map<String, String> LLILLJJLI;
    public final Context LLILLL;
    public boolean LLILZ;
    public Aweme LLILZIL;
    public AwemeSplashInfo LLILZLL;
    public AwemeSplashInfo.SkipInfo LLIZ;
    public AwemeSplashInfo.LabelInfo LLIZLLLIL;
    public AwemeSplashInfo.ClickableAreaInfo LLJ;
    public int LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public ViewPropertyAnimator LLJILJILJ;
    public boolean LLJILLL;
    public ARunnableS116S0100000_16 LLJJ;
    public ObjectAnimator LLJJI;
    public long LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C1077570e9D LLJJJJLIIL;
    public float LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public final Map<String, Object> LLJL;

    public AwesomeSplashNewMask(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static /* synthetic */ void getStatus$annotations() {
    }

    @Override // X.InterfaceC987700boG
    public final void LIZ() {
        this.LLILZ = true;
        remove();
    }

    private final GestureDetector getMaskGestureDetector() {
        return (GestureDetector) this.LLJJJJ.getValue();
    }

    private final ImageView getPromptIv() {
        return (ImageView) this.LLJJIJIL.getValue();
    }

    private final RelativeLayout getPromptTotal() {
        return (RelativeLayout) this.LLJJIJI.getValue();
    }

    private final TextView getPromptTv() {
        return (TextView) this.LLJJIJIIJIL.getValue();
    }

    private final TopViewSkipButton getSkipButton() {
        return (TopViewSkipButton) this.LLJJJ.getValue();
    }

    private final TextView getSponsorSign() {
        return (TextView) this.LLJJJIL.getValue();
    }

    private final ImageView getTopPromptIv() {
        return (ImageView) this.LLJJJJJIL.getValue();
    }

    @Override // X.InterfaceC987700boG
    public final void remove() {
        if (this.LLJJ != null) {
            HandlerHook.viewRemoveCallbacks(getPromptTotal(), this.LLJJ);
            this.LLJJ = null;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.LLJILJILJ;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.LLJILJILJ = null;
        }
        ObjectAnimator objectAnimator = this.LLJJI;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.LLJJI.cancel();
            this.LLJJI = null;
        }
        int i = 0;
        View[] viewArr = {getPromptIv(), getPromptTv()};
        do {
            viewArr[i].clearAnimation();
            i++;
        } while (i < 2);
        TopViewSkipButton skipButton = getSkipButton();
        PthreadTimer pthreadTimer = skipButton.LLIZ;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        skipButton.LLIZ = null;
        skipButton.LLILZLL.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.bmd);
        if (viewFindViewById != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
            marginLayoutParams.topMargin += C497820Jfg.LIZJ(getContext());
            C786410Ut5.W5(viewFindViewById, marginLayoutParams);
        }
    }

    public static final void LJ(AwesomeSplashNewMask awesomeSplashNewMask) {
        AwemeRawAd awemeRawAd;
        C786410Ut5.T7(awesomeSplashNewMask.getPromptTv(), new View.OnClickListener() { // from class: X.0cmV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        Aweme aweme = awesomeSplashNewMask.LLILZIL;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("tips", "refer");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // X.InterfaceC987700boG
    public final void LIZIZ(int i) {
        LIZJ(i);
    }

    public final void LIZJ(int i) {
        String aid;
        AwemeRawAd awemeRawAd;
        String openUrl;
        Aweme aweme = this.LLILZIL;
        if (aweme != null && C1017070cZd.LLIZLLLIL(aweme)) {
            Aweme aweme2 = this.LLILZIL;
            if (aweme2 != null && C1017070cZd.LLJLLIL(aweme2)) {
                C1389890mGx c1389890mGx = new C1389890mGx(this);
                c1389890mGx.LJIIIZ(2131824738);
                c1389890mGx.LJIIJJI();
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("【click】clickAwesomeSplash() with:, aweme = [");
            Aweme aweme3 = this.LLILZIL;
            if (aweme3 != null) {
                aid = aweme3.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append(']');
            C2188811AlT.LIZIZ(sbLIZ);
            Aweme aweme4 = this.LLILZIL;
            if (aweme4 != null && (awemeRawAd = aweme4.getAwemeRawAd()) != null && (openUrl = awemeRawAd.getOpenUrl()) != null && openUrl.length() != 0 && TextUtils.equals(UriProtector.parse(awemeRawAd.getOpenUrl()).getHost(), "challenge")) {
                C0XI4 c0xi4 = new C0XI4(awemeRawAd.getOpenUrl());
                c0xi4.LJ("extra_challenge_from", "awesome_splash");
                awemeRawAd.setOpenUrl(c0xi4.LJFF());
            }
            this.LLJL.put("click_button", String.valueOf(i));
            this.LLJL.put("is_cold_start", Integer.valueOf(C1030680cva.LJ ? 1 : 0));
            this.LLJL.put("component_width", Integer.valueOf(getWidth()));
            this.LLJL.put("component_height", Integer.valueOf(getHeight()));
            ((HashMap) this.LLILLJJLI).put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), this.LLJL));
            InterfaceC1028550cs9 interfaceC1028550cs9LIZ = C1031100cwG.LIZ();
            if (interfaceC1028550cs9LIZ != null) {
                interfaceC1028550cs9LIZ.LJJIIZI(this.LLILLL, this.LLILZIL, this.LLILLJJLI);
            }
            ((LinkedHashMap) this.LLJL).clear();
        }
    }

    public final void LIZLLL(boolean z) {
        String enterAppText;
        AwemeSplashInfo awemeSplashInfo = this.LLILZLL;
        if (awemeSplashInfo != null && (enterAppText = awemeSplashInfo.getEnterAppText()) != null && enterAppText.length() != 0) {
            int i = this.LLJI;
            if (i != 6) {
                if (i != 7) {
                    return;
                }
                C12ES.LJIILL(0, getPromptTotal());
                C12ES.LJIILL(8, getPromptIv());
                LJFF(z, getPromptTv());
                getPromptTv().setText(this.LLILZLL.getEnterAppText());
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getPromptTv(), "translationY", 0.0f, -C12ES.LIZJ(8.0f, this.LLILLL), 0.0f);
                this.LLJJI = objectAnimatorOfFloat;
                if (z && objectAnimatorOfFloat != null) {
                    objectAnimatorOfFloat.setStartDelay(300L);
                }
                ObjectAnimator objectAnimator = this.LLJJI;
                if (objectAnimator != null) {
                    objectAnimator.setDuration(2000L);
                }
                ObjectAnimator objectAnimator2 = this.LLJJI;
                if (objectAnimator2 != null) {
                    objectAnimator2.addListener(new ALAdapterS1S0000000_16(3));
                }
                ObjectAnimator objectAnimator3 = this.LLJJI;
                if (objectAnimator3 != null) {
                    C786410Ut5.Pd(objectAnimator3);
                }
                LJ(this);
                return;
            }
            C12ES.LJIILL(0, getPromptTotal());
            getPromptTv().setText(this.LLILZLL.getEnterAppText());
            LJFF(z, getPromptTv(), getPromptIv());
            LJ(this);
            C786410Ut5.Q7(getPromptIv(), new View.OnClickListener() { // from class: X.0br3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 1) {
            this.LLJJL = 0.0f;
            this.LLJJLIIIJLLLLLLLZ = 0.0f;
            if (C444960Hcc.LIZJ(getContext())) {
                this.LLJL.put("click_x", String.valueOf(C14KQ.LJIIIIZZ(getContext()) - motionEvent.getRawX()));
            } else {
                this.LLJL.put("click_x", String.valueOf(motionEvent.getRawX()));
            }
            this.LLJL.put("click_y", String.valueOf(motionEvent.getRawY()));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC987700boG
    public void onEvent(C740360T2k c740360T2k) {
        AwemeSplashInfo.SkipInfo skipInfo;
        boolean z;
        int i;
        String text;
        String textColor;
        AwemeRawAd awemeRawAd;
        this.LL = c740360T2k.LIZ;
        Aweme aweme = c740360T2k.LIZIZ;
        this.LLILZIL = aweme;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            AwemeSplashInfo splashInfo = awemeRawAd.getSplashInfo();
            this.LLILZLL = splashInfo;
            if (splashInfo != null) {
                this.LLJI = splashInfo.getSwipeUpType();
                AwemeSplashInfo.SkipInfo skipInfo2 = splashInfo.getSkipInfo();
                if (skipInfo2 != null) {
                    this.LLIZ = skipInfo2;
                    this.LLJIJIL = skipInfo2.getButtonExtraStyle();
                }
                this.LLIZLLLIL = splashInfo.getLabelInfo();
                this.LLJ = splashInfo.getClickableArea();
            }
        }
        if (!this.LLJILJIL) {
            this.LLJILLL = false;
            AwemeSplashInfo.LabelInfo labelInfo = this.LLIZLLLIL;
            if (labelInfo != null && (text = labelInfo.getText()) != null && text.length() != 0 && (textColor = this.LLIZLLLIL.getTextColor()) != null && textColor.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            this.LLJILLL = z;
            if (!z) {
                C12ES.LJIILL(8, getSkipButton());
                C12ES.LJIILL(0, getSponsorSign());
                C12ES.LJIILL(0, getTopPromptIv());
                getSponsorSign().setText(this.LLIZLLLIL.getText());
                getSponsorSign().setTextColor(ColorProtector.parseColor(this.LLIZLLLIL.getTextColor()));
                C786410Ut5.T7(getSponsorSign(), new ACListenerS151S0100000_16(this, 72));
            } else {
                AwemeSplashInfo.SkipInfo skipInfo3 = this.LLIZ;
                if (skipInfo3 != null) {
                    getSkipButton().i0(skipInfo3);
                }
            }
            AwemeSplashInfo awemeSplashInfo = this.LLILZLL;
            if (awemeSplashInfo != null) {
                if (awemeSplashInfo.getSwipeUpDelay() == 0) {
                    LIZLLL(false);
                } else {
                    this.LLJJ = new ARunnableS116S0100000_16(this, 122);
                    HandlerHook.viewPostDelay(getPromptTotal(), this.LLJJ, awemeSplashInfo.getSwipeUpDelay());
                }
            }
            if (C444960Hcc.LIZJ(getContext()) && (!this.LLJILLL || ((i = this.LLJIJIL) != 2 && i != 3))) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getSkipButton().getLayoutParams();
                layoutParams.addRule(11, 0);
                layoutParams.addRule(9);
                TopViewSkipButton skipButton = getSkipButton();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(skipButton);
                skipButton.setLayoutParams(layoutParams);
                ImageView imageView = (ImageView) findViewById(R.id.bmb);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams2.addRule(9, 0);
                layoutParams2.addRule(11);
                layoutParams2.rightMargin = C341940Daq.LIZ(14.0d);
                C786410Ut5.c6(imageView, layoutParams2);
            }
            this.LLJILJIL = true;
        }
        int i2 = this.LL;
        if (i2 == 3) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("AwesomeSplash", "AwesomeSplashMask onEvent is FADING_OUT");
            ViewPropertyAnimator duration = animate().alpha(0.0f).setDuration(260L);
            this.LLJILJILJ = duration;
            if (duration != null) {
                duration.start();
            }
            InterfaceC1028550cs9 interfaceC1028550cs9LIZ = C1031100cwG.LIZ();
            if (interfaceC1028550cs9LIZ != null) {
                interfaceC1028550cs9LIZ.LJIIZILJ(getContext(), this.LLILZIL);
                return;
            }
            return;
        }
        if (i2 != 2 || (skipInfo = this.LLIZ) == null || !skipInfo.isCountdown_enable() || !this.LLJILLL) {
            return;
        }
        getSkipButton().h0((long) this.LLILZLL.getSplashShowTime());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L11
            int r1 = r6.getAction()
            if (r1 == 0) goto L58
            r2 = 1
            if (r1 == r2) goto L52
            r0 = 2
            if (r1 == r0) goto L16
            r0 = 3
            if (r1 == r0) goto L52
        L11:
            boolean r0 = super.onInterceptTouchEvent(r6)
            return r0
        L16:
            float r4 = r6.getX()
            float r0 = r5.LLJJL
            float r4 = r4 - r0
            float r3 = r6.getY()
            float r0 = r5.LLJJLIIIJLLLLLLLZ
            float r3 = r3 - r0
            float r1 = java.lang.Math.abs(r3)
            X.01GW<java.lang.Integer> r0 = com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask.LLJLIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L11
            float r1 = java.lang.Math.abs(r3)
            float r0 = java.lang.Math.abs(r4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L11
            return r2
        L52:
            r0 = 0
            r5.LLJJL = r0
            r5.LLJJLIIIJLLLLLLLZ = r0
            goto L11
        L58:
            float r0 = r6.getX()
            r5.LLJJL = r0
            float r0 = r6.getY()
            r5.LLJJLIIIJLLLLLLLZ = r0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        super.onTouchEvent(motionEvent);
        GestureDetector maskGestureDetector = getMaskGestureDetector();
        if (!this.LLILZ && (i = this.LL) != 1 && i != 4) {
            maskGestureDetector.onTouchEvent(motionEvent);
        }
        if (this.LL != 4) {
            return true;
        }
        return false;
    }

    public static final void LJFF(boolean z, View... viewArr) {
        if (z) {
            for (View view : viewArr) {
                C786410Ut5.T4(view, 0.0f);
                C12ES.LJIILL(0, view);
                view.animate().alpha(1.0f).setDuration(300L).setListener(null);
            }
            return;
        }
        for (View view2 : viewArr) {
            C12ES.LJIILL(0, view2);
        }
    }

    public AwesomeSplashNewMask(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = 4;
        this.LLILLJJLI = new HashMap();
        this.LLILLL = context;
        this.LLJILLL = true;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJJIJI = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 38));
        this.LLJJIJIIJIL = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 39));
        this.LLJJIJIL = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 37));
        this.LLJJJ = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 40));
        this.LLJJJIL = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 41));
        this.LLJJJJ = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 36));
        this.LLJJJJJIL = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 42));
        this.LLJJJJLIIL = new C1077570e9D(this, 1);
        this.LLJL = new LinkedHashMap();
    }
}
