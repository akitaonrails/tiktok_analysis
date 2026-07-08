package com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C05YD;
import X.C0HGK;
import X.C0HNZ;
import X.C0HOM;
import X.C0HQX;
import X.C0HQZ;
import X.C0HSG;
import X.C0IDJ;
import X.C12ES;
import X.C1372405Ys;
import X.C13LP;
import X.C13LZ;
import X.C15438062q;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C1710306mr;
import X.C1906580ziK;
import X.C1954807lC;
import X.C197039127h;
import X.C1BNE;
import X.C20600815jK;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C23250099c;
import X.C418440Gaw;
import X.C420500GeG;
import X.C426750GoL;
import X.C435590H6f;
import X.C435610H6h;
import X.C435650H6l;
import X.C435750H6v;
import X.C438690HId;
import X.C439980HNc;
import X.C440070HNl;
import X.C440100HNo;
import X.C440440HOw;
import X.C440480HPa;
import X.C440500HPc;
import X.C440660HPs;
import X.C440750HQb;
import X.C440800HQg;
import X.C440810HQh;
import X.C440820HQi;
import X.C440830HQj;
import X.C441470HSv;
import X.C441660HTo;
import X.C452501pT;
import X.C531650Kt9;
import X.C622840Obq;
import X.C723580SZw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC441640HTm;
import X.EnumC441650HTn;
import X.InterfaceC1733780vDc;
import X.InterfaceC1891350zJl;
import X.InterfaceC440090HNn;
import X.InterfaceC440740HQa;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import X.ViewTreeObserverOnGlobalLayoutListenerC462880IDe;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS17S0101000_6;
import Y.ARunnableS39S0300000_6;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerImage;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.cells.LoadingV2Cell;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.cells.ResultV2Cell;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioResultsPageV2Assem extends MixStudioResultsBaseAssem {
    public ViewOnAttachStateChangeListenerC20631115oD LLLJ;
    public C0HNZ LLLJIL;
    public C440750HQb LLLJL;
    public TuxTextView LLLL;
    public TuxTextView LLLLII;
    public C420500GeG LLLLIIIILLL;
    public boolean LLLLIIL;
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(301));
    public final C01GW LLLIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(296));
    public final C01GW LLLIILIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(299));
    public final C01GW LLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(303));
    public final C01GW LLLILZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(302));
    public final C01GW LLLILZJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(297));
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(298));
    public boolean LLLIZZ = true;
    public final C1559260qg8 LLLLIILL = new C1559260qg8(new C723580SZw(this, C440500HPc.class, null), checkSupervisorPrepared());

    public final C440500HPc Ip() {
        return (C440500HPc) this.LLLLIILL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem, com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem, com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        String param;
        MixStudioLauncher.GenerationConfiguration generationConfiguration;
        MixStudioLauncher.PushInfo pushInfo;
        MixStudioLauncher.PushInfo pushInfo2;
        MixStudioLauncher.PushInfo pushInfo3;
        EnumC441640HTm enumC441640HTm;
        EnumC441650HTn enumC441650HTnLIZIZ;
        Context context = getSupervisor().LLJIJIL;
        if (context == null) {
            super.xo();
            return;
        }
        C0HNZ c0hnz = new C0HNZ(context);
        int i = 0;
        C786410Ut5.LJLLLLLL(C440480HPa.LIZJ() ^ true ? 0 : 8, c0hnz);
        this.LLLJIL = c0hnz;
        FrameLayout frameLayoutZp = zp(context);
        C0HNZ c0hnz2 = this.LLLJIL;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayoutZp.addView(c0hnz2, layoutParams);
        AttributeSet attributeSet = null;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = new ViewOnAttachStateChangeListenerC20631115oD(context, null, 0);
        viewOnAttachStateChangeListenerC20631115oD.setOrientation(0);
        int iLIZ = C814420VxA.LIZ(((Number) this.LLLILZLLLI.getValue()).doubleValue() * ((double) C12ES.LJIIJ(context)));
        int iIntValue = ((Number) this.LLLILZJ.getValue()).intValue();
        if (iLIZ > iIntValue) {
            iLIZ = iIntValue;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, iLIZ);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = ((Number) this.LLLIIIL.getValue()).intValue();
        layoutParams2.bottomMargin = ((Number) this.LLLIIIIL.getValue()).intValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnAttachStateChangeListenerC20631115oD);
        viewOnAttachStateChangeListenerC20631115oD.setLayoutParams(layoutParams2);
        InterfaceC1733780vDc viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator();
        C622840Obq c622840Obq = new C622840Obq();
        c622840Obq.LIZ = 2;
        viewItemOperator.LIZLLL(c622840Obq);
        C0HQZ c0hqz = new C0HQZ();
        ((ArrayList) c0hqz.LIZ).add(new InterfaceC440740HQa() { // from class: X.0HGy
            @Override // X.InterfaceC440740HQa
            public final void LIZ(View view, float f) {
                if (f >= -1.0f && f <= 1.0f) {
                    float fAbs = ((1 - Math.abs(f)) * 0.2f) + 0.8f;
                    if (view.getHeight() > 0) {
                        view.setPivotX(view.getWidth() / 2.0f);
                        view.setPivotY(view.getHeight());
                    }
                    C786410Ut5.pc(view, fAbs);
                    C786410Ut5.Ob(view, fAbs);
                    C786410Ut5.Jc(view, (-f) * view.getWidth() * 0.4f);
                    return;
                }
                C786410Ut5.Ob(view, 1.0f);
                C786410Ut5.pc(view, 1.0f);
                C786410Ut5.Jc(view, 0.0f);
            }
        });
        viewOnAttachStateChangeListenerC20631115oD.setPageTransformer(c0hqz);
        viewOnAttachStateChangeListenerC20631115oD.registerOnPageChangeCallback(new C0IDJ(this, 1));
        this.LLLJ = viewOnAttachStateChangeListenerC20631115oD;
        InterfaceC1733780vDc viewItemOperator2 = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator();
        if (viewItemOperator2 != null) {
            viewItemOperator2.LIZJ(ResultV2Cell.class, LoadingV2Cell.class);
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C440500HPc c440500HPcIp = Ip();
        if (c440500HPcIp == null || (enumC441640HTm = c440500HPcIp.LLIZLLLIL) == null || (enumC441650HTnLIZIZ = C441660HTo.LIZIZ(enumC441640HTm)) == null || (param = enumC441650HTnLIZIZ.getParam()) == null) {
            param = EnumC441650HTn.SOCIAL_AVATAR_STICKER_PANEL.getParam();
        }
        C440500HPc c440500HPcIp2 = Ip();
        String str = (c440500HPcIp2 == null || (pushInfo3 = c440500HPcIp2.LLILZLL) == null) ? null : pushInfo3.storyId;
        C440500HPc c440500HPcIp3 = Ip();
        String str2 = (c440500HPcIp3 == null || (pushInfo2 = c440500HPcIp3.LLILZLL) == null) ? null : pushInfo2.groupChatId;
        C440500HPc c440500HPcIp4 = Ip();
        String str3 = (c440500HPcIp4 == null || (pushInfo = c440500HPcIp4.LLILZLL) == null) ? null : pushInfo.targetUserId;
        C440500HPc c440500HPcIp5 = Ip();
        C440750HQb c440750HQb = new C440750HQb(lifecycleScope, context, new C441470HSv(param, str, str3, str2, null, null, (c440500HPcIp5 == null || (generationConfiguration = c440500HPcIp5.LLJILJIL) == null || !generationConfiguration.isRemix) ? false : true));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(((Number) this.LLLIL.getValue()).intValue(), ((Number) this.LLLILZ.getValue()).intValue());
        layoutParams3.bottomMargin = ((Number) this.LLLIIL.getValue()).intValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c440750HQb);
        c440750HQb.setLayoutParams(layoutParams3);
        this.LLLJL = c440750HQb;
        if (C440480HPa.LIZJ() && Build.VERSION.SDK_INT >= 35) {
            C426750GoL.LJIIL(yp(), null, null, null, Integer.valueOf(C1710306mr.LIZ(context)), 23);
        }
        yp().addView(frameLayoutZp, C435650H6l.LIZ(-1, ((Number) this.LLLIILIL.getValue()).intValue(), 0, 0, 0, 252));
        yp().addView(this.LLLJ);
        yp().addView(this.LLLJL);
        if (C440480HPa.LIZJ()) {
            int i2 = 6;
            TuxTextView tuxTextView = new TuxTextView(context, attributeSet, i2, i);
            tuxTextView.setTextColorRes(R.attr.a1k);
            tuxTextView.setTypeface(Typeface.SANS_SERIF, 2);
            tuxTextView.LJJJJI(15.0f);
            C786410Ut5.LJLLLLLL(8, tuxTextView);
            tuxTextView.setMaxLines(2);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setGravity(17);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38)));
            layoutParams4.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)));
            layoutParams4.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)));
            layoutParams4.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            C786410Ut5.R6(tuxTextView, layoutParams4);
            this.LLLL = tuxTextView;
            TuxTextView tuxTextView2 = new TuxTextView(context, attributeSet, i2, i);
            C786410Ut5.LJLLLLLL(8, tuxTextView2);
            tuxTextView2.setGravity(17);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)));
            layoutParams5.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            C786410Ut5.R6(tuxTextView2, layoutParams5);
            tuxTextView2.LJJJJI(32.0f);
            this.LLLLII = tuxTextView2;
            C420500GeG c420500GeG = new C420500GeG(context);
            C786410Ut5.LJLLLLLL(8, c420500GeG);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
            layoutParams6.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c420500GeG);
            c420500GeG.setLayoutParams(layoutParams6);
            this.LLLLIIIILLL = c420500GeG;
            yp().addView(this.LLLL);
            yp().addView(this.LLLLII);
            yp().addView(this.LLLLIIIILLL);
        }
        yp().addView(Fp(context));
        super.xo();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem
    public final void Gp() {
        MixStudioStatusRepository mixStudioStatusRepositoryUp;
        C05YD<List<C440830HQj>> c05ydLJFF;
        List<C440830HQj> value;
        Fragment fragmentLIZLLL;
        LifecycleCoroutineScope lifecycleScope;
        MixStudioStatusRepository mixStudioStatusRepositoryUp2 = up();
        if (mixStudioStatusRepositoryUp2 == null || !mixStudioStatusRepositoryUp2.LIZJ() || (mixStudioStatusRepositoryUp = up()) == null || (c05ydLJFF = mixStudioStatusRepositoryUp.LJFF()) == null || (value = c05ydLJFF.getValue()) == null) {
            return;
        }
        if (!value.isEmpty()) {
            Iterator<C440830HQj> it2 = value.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZJ instanceof C440800HQg) {
                    return;
                }
            }
        }
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF == null || (fragmentLIZLLL = abstractC1387200mCcLJFF.LIZLLL()) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentLIZLLL)) == null) {
            return;
        }
        C23250099c.LIZLLL(lifecycleScope, null, null, new C438690HId(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem, com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final void LLFF() {
        C440750HQb c440750HQb;
        C439980HNc c439980HNc;
        C05YD<InterfaceC440090HNn> c05ydLIZ;
        InterfaceC440090HNn value;
        String str;
        MixStudioStatusRepository mixStudioStatusRepositoryUp;
        String taskId;
        ViewTreeObserver viewTreeObserver;
        C1372405Ys c1372405Ys;
        List list;
        C440440HOw c440440HOw;
        super.LLFF();
        C0HNZ c0hnz = this.LLLJIL;
        if (c0hnz != null && (c439980HNc = this.LLJJI) != null) {
            if (!C440480HPa.LIZJ()) {
                c0hnz.setId(tp().xQ2());
            }
            MixStudioStatusRepository mixStudioStatusRepositoryUp2 = up();
            if (mixStudioStatusRepositoryUp2 != null && (c05ydLIZ = mixStudioStatusRepositoryUp2.LIZ()) != null && (value = c05ydLIZ.getValue()) != null) {
                String str2 = null;
                if (!C440480HPa.LIZJ()) {
                    c0hnz.setElement(Collections.singletonList(c439980HNc.LIZ(value, new C435590H6f(false))));
                } else if (value instanceof C0HGK) {
                    String strJ4 = C786410Ut5.j4("\"%s\"", Arrays.copyOf(new Object[]{((C0HGK) value).LIZ}, 1));
                    TuxTextView tuxTextView = this.LLLL;
                    if (tuxTextView != null) {
                        tuxTextView.setText(strJ4);
                    }
                    TuxTextView tuxTextView2 = this.LLLL;
                    if (tuxTextView2 != null && (viewTreeObserver = tuxTextView2.getViewTreeObserver()) != null) {
                        ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe = new ViewTreeObserverOnGlobalLayoutListenerC462880IDe(this, value, 3);
                        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC462880IDe);
                        C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC462880IDe, ViewTreeObserver.OnGlobalLayoutListener.class);
                    }
                    TuxTextView tuxTextView3 = this.LLLL;
                    if (tuxTextView3 != null) {
                        C786410Ut5.LJLLLLLL(0, tuxTextView3);
                    }
                    TuxTextView tuxTextView4 = this.LLLLII;
                    if (tuxTextView4 != null) {
                        C786410Ut5.LJLLLLLL(8, tuxTextView4);
                    }
                    C420500GeG c420500GeG = this.LLLLIIIILLL;
                    if (c420500GeG != null) {
                        C786410Ut5.LJLLLLLL(8, c420500GeG);
                    }
                } else if (value instanceof C435610H6h) {
                    TuxTextView tuxTextView5 = this.LLLLII;
                    if (tuxTextView5 != null) {
                        tuxTextView5.setText(((C435610H6h) value).LIZ.text);
                    }
                    TuxTextView tuxTextView6 = this.LLLL;
                    if (tuxTextView6 != null) {
                        C786410Ut5.LJLLLLLL(8, tuxTextView6);
                    }
                    TuxTextView tuxTextView7 = this.LLLLII;
                    if (tuxTextView7 != null) {
                        C786410Ut5.LJLLLLLL(0, tuxTextView7);
                    }
                    C420500GeG c420500GeG2 = this.LLLLIIIILLL;
                    if (c420500GeG2 != null) {
                        C786410Ut5.LJLLLLLL(8, c420500GeG2);
                    }
                } else if (value instanceof C440070HNl) {
                    C440070HNl c440070HNl = (C440070HNl) value;
                    String str3 = c440070HNl.LIZIZ;
                    if ((str3 == null || str3.length() == 0) && (((str = c440070HNl.LIZLLL) == null || str.length() == 0) && (mixStudioStatusRepositoryUp = up()) != null && (taskId = mixStudioStatusRepositoryUp.getTaskId()) != null)) {
                        C0HSG.LIZ.getClass();
                        Keva kevaLIZIZ = C0HSG.LIZIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("image_element_local_path:");
                        sbLIZ.append(taskId);
                        String string = kevaLIZIZ.getString(C2188811AlT.LIZIZ(sbLIZ), null);
                        if (string != null) {
                            c440070HNl = new C440070HNl(null, string, null, null, 13);
                        }
                    }
                    C420500GeG c420500GeG3 = this.LLLLIIIILLL;
                    if (c420500GeG3 != null) {
                        c420500GeG3.setElementDisplayStrategy(c439980HNc.LIZ(c440070HNl, new C435590H6f(true)));
                    }
                    TuxTextView tuxTextView8 = this.LLLL;
                    if (tuxTextView8 != null) {
                        C786410Ut5.LJLLLLLL(8, tuxTextView8);
                    }
                    TuxTextView tuxTextView9 = this.LLLLII;
                    if (tuxTextView9 != null) {
                        C786410Ut5.LJLLLLLL(8, tuxTextView9);
                    }
                    C420500GeG c420500GeG4 = this.LLLLIIIILLL;
                    if (c420500GeG4 != null) {
                        C786410Ut5.LJLLLLLL(0, c420500GeG4);
                    }
                } else if (!(value instanceof C440100HNo)) {
                    if (value instanceof C435750H6v) {
                        C420500GeG c420500GeG5 = this.LLLLIIIILLL;
                        if (c420500GeG5 != null) {
                            c420500GeG5.setElementDisplayStrategy(c439980HNc.LIZ(value, new C435590H6f(true)));
                        }
                        C420500GeG c420500GeG6 = this.LLLLIIIILLL;
                        if (c420500GeG6 != null) {
                            C786410Ut5.LJLLLLLL(0, c420500GeG6);
                        }
                        TuxTextView tuxTextView10 = this.LLLLII;
                        if (tuxTextView10 != null) {
                            C786410Ut5.LJLLLLLL(8, tuxTextView10);
                        }
                        TuxTextView tuxTextView11 = this.LLLL;
                        if (tuxTextView11 != null) {
                            C786410Ut5.LJLLLLLL(8, tuxTextView11);
                        }
                    } else {
                        if (!(value instanceof C440660HPs)) {
                            throw new C1954807lC();
                        }
                        C420500GeG c420500GeG7 = this.LLLLIIIILLL;
                        if (c420500GeG7 != null) {
                            c420500GeG7.setElementDisplayStrategy(c439980HNc.LIZ(value, new C435590H6f(true)));
                        }
                        C420500GeG c420500GeG8 = this.LLLLIIIILLL;
                        if (c420500GeG8 != null) {
                            C786410Ut5.LJLLLLLL(0, c420500GeG8);
                        }
                        TuxTextView tuxTextView12 = this.LLLLII;
                        if (tuxTextView12 != null) {
                            C786410Ut5.LJLLLLLL(8, tuxTextView12);
                        }
                        TuxTextView tuxTextView13 = this.LLLL;
                        if (tuxTextView13 != null) {
                            C786410Ut5.LJLLLLLL(8, tuxTextView13);
                        }
                    }
                }
                C0HOM<? extends Object> value2 = tp().xQ2().getState().getValue();
                if ((value2 instanceof C1372405Ys) && (c1372405Ys = (C1372405Ys) value2) != null && (list = (List) c1372405Ys.LIZIZ) != null && (c440440HOw = (C440440HOw) C13LP.LJJJLL(list)) != null) {
                    str2 = c440440HOw.LIZIZ;
                }
                C440750HQb c440750HQb2 = this.LLLJL;
                if (c440750HQb2 != null) {
                    c440750HQb2.LLJIJIL = str2;
                    c440750HQb2.LLJILJIL = value;
                }
            }
        }
        C0HSG.LIZ.getClass();
        if (!(!C0HSG.LIZIZ().getBoolean("alive_tooltip_shown", false)) || (c440750HQb = this.LLLJL) == null) {
            return;
        }
        HandlerHook.viewPost(c440750HQb, new ARunnableS106S0100000_6(this, 114));
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem, com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final void onPagePause() {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        super.onPagePause();
        if (!this.LLJJJIL && (viewOnAttachStateChangeListenerC20631115oD = this.LLLJ) != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
            state.LJFF(null);
        }
        this.LLLIZZ = true;
    }

    public final void Jp(boolean z) {
        C197039127h c197039127h;
        int i;
        int i2 = 4;
        if (C440480HPa.LIZJ()) {
            LinearLayout linearLayoutLp = lp();
            if (!z) {
                i = 4;
            } else {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, linearLayoutLp);
        } else {
            int childCount = lp().getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = lp().getChildAt(i3);
                if ((childAt instanceof C197039127h) && (c197039127h = (C197039127h) childAt) != null) {
                    c197039127h.setEnabled(z);
                }
            }
        }
        C440750HQb c440750HQb = this.LLLJL;
        if (c440750HQb != null) {
            if (!(!z)) {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, c440750HQb);
        }
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem
    public final void Ap(int i, List list) {
        C440820HQi c440820HQi;
        EnumC441640HTm enumC441640HTm;
        super.Ap(i, list);
        if (i >= list.size()) {
            Jp(false);
        } else {
            Jp(true);
        }
        C440830HQj c440830HQj = (C440830HQj) C13LP.LJJJLZIJ(i, list);
        C440500HPc c440500HPcIp = Ip();
        if (c440500HPcIp != null && (enumC441640HTm = c440500HPcIp.LLIZLLLIL) != null) {
            c440820HQi = new C440820HQi(enumC441640HTm, i, new C440810HQh(this));
        } else {
            c440820HQi = null;
        }
        C440750HQb c440750HQb = this.LLLJL;
        if (c440750HQb != null) {
            HandlerHook.viewPost(c440750HQb, new ARunnableS39S0300000_6(this, c440830HQj, c440820HQi, 24));
        }
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem
    public final void Bp(List<C440830HQj> list, boolean z) {
        int currentItem;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        C05YD<List<C440830HQj>> c05ydLJFF;
        List<C440830HQj> value;
        InterfaceC1733780vDc viewItemOperator2;
        C20600815jK<InterfaceC1891350zJl> state2;
        InterfaceC1733780vDc viewItemOperator3;
        C20600815jK<InterfaceC1891350zJl> state3;
        InterfaceC1733780vDc viewItemOperator4;
        C20600815jK<InterfaceC1891350zJl> state4;
        InterfaceC1733780vDc viewItemOperator5;
        C20600815jK<InterfaceC1891350zJl> state5;
        Long l;
        String str;
        List<String> list2;
        InterfaceC1733780vDc viewItemOperator6;
        List<InterfaceC1891350zJl> listLIZ;
        Long l2;
        Long lValueOf;
        C0HQX c0hqx;
        InterfaceC1733780vDc viewItemOperator7;
        List<InterfaceC1891350zJl> listLIZ2;
        C0HQX c0hqx2;
        C440830HQj next;
        StickerImage stickerImageCurrentImage;
        List<String> list3;
        String str2;
        synchronized (this) {
            try {
                if (!list.isEmpty()) {
                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLLJ;
                    if (viewOnAttachStateChangeListenerC20631115oD2 != null) {
                        currentItem = viewOnAttachStateChangeListenerC20631115oD2.getCurrentItem();
                    } else {
                        currentItem = 0;
                    }
                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = this.LLLJ;
                    Boolean boolValueOf = null;
                    if (viewOnAttachStateChangeListenerC20631115oD3 != null && (viewItemOperator7 = viewOnAttachStateChangeListenerC20631115oD3.getViewItemOperator()) != null && (listLIZ2 = viewItemOperator7.LIZ()) != null) {
                        int i = 0;
                        for (InterfaceC1891350zJl interfaceC1891350zJl : listLIZ2) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
                                if ((interfaceC1891350zJl2 instanceof C0HQX) && (c0hqx2 = (C0HQX) interfaceC1891350zJl2) != null) {
                                    Iterator<C440830HQj> it2 = list.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            StickerBase stickerBase = next.LIZ.stickerBase;
                                            if (stickerBase != null) {
                                                Long l3 = stickerBase.id;
                                                long j = c0hqx2.LLILLJJLI;
                                                if (l3 != null && l3.longValue() == j) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    C440830HQj c440830HQj = next;
                                    if (c440830HQj != null && (stickerImageCurrentImage = c440830HQj.LIZ.currentImage()) != null && (list3 = stickerImageCurrentImage.urlList) != null && (str2 = (String) C13LP.LJJJLZIJ(0, list3)) != null) {
                                        c0hqx2.LLILLL.setValue(str2);
                                    }
                                }
                                i = i2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD4 = this.LLLJ;
                    if (viewOnAttachStateChangeListenerC20631115oD4 != null && (viewItemOperator4 = viewOnAttachStateChangeListenerC20631115oD4.getViewItemOperator()) != null && (state4 = viewItemOperator4.getState()) != null) {
                        int iMax = Math.max(state4.LJIIIIZZ() - 1, 0);
                        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD5 = this.LLLJ;
                        if (viewOnAttachStateChangeListenerC20631115oD5 != null && (viewItemOperator5 = viewOnAttachStateChangeListenerC20631115oD5.getViewItemOperator()) != null && (state5 = viewItemOperator5.getState()) != null) {
                            IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(iMax, list.size());
                            ArrayList arrayList = new ArrayList();
                            C531650Kt9 it3 = intRangeLJIILJJIL.iterator();
                            while (it3.LLILLL) {
                                Object next2 = it3.next();
                                int iIntValue = ((Number) next2).intValue();
                                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD6 = this.LLLJ;
                                if (viewOnAttachStateChangeListenerC20631115oD6 != null && (viewItemOperator6 = viewOnAttachStateChangeListenerC20631115oD6.getViewItemOperator()) != null && (listLIZ = viewItemOperator6.LIZ()) != null) {
                                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
                                    for (InterfaceC1891350zJl interfaceC1891350zJl3 : listLIZ) {
                                        if ((interfaceC1891350zJl3 instanceof C0HQX) && (c0hqx = (C0HQX) interfaceC1891350zJl3) != null) {
                                            lValueOf = Long.valueOf(c0hqx.LLILLJJLI);
                                        } else {
                                            lValueOf = null;
                                        }
                                        arrayList2.add(lValueOf);
                                    }
                                    StickerBase stickerBase2 = list.get(iIntValue).LIZ.stickerBase;
                                    if (stickerBase2 != null) {
                                        l2 = stickerBase2.id;
                                    } else {
                                        l2 = null;
                                    }
                                    if (!arrayList2.contains(l2)) {
                                        arrayList.add(next2);
                                    }
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                int iIntValue2 = ((Number) it4.next()).intValue();
                                StickerItem stickerItem = list.get(iIntValue2).LIZ;
                                StickerBase stickerBase3 = stickerItem.stickerBase;
                                if (stickerBase3 != null) {
                                    l = stickerBase3.id;
                                } else {
                                    l = null;
                                }
                                StickerImage stickerImageCurrentImage2 = stickerItem.currentImage();
                                if (stickerImageCurrentImage2 != null && (list2 = stickerImageCurrentImage2.urlList) != null) {
                                    str = (String) C13LP.LJJJLZIJ(0, list2);
                                } else {
                                    str = null;
                                }
                                if (l != null && str != null) {
                                    arrayList3.add(new C0HQX(iIntValue2, l.longValue(), C1BNE.LIZ(str), list.get(iIntValue2).LIZIZ));
                                }
                            }
                            C20600815jK.LJ(state5, iMax, arrayList3);
                        }
                    }
                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD7 = this.LLLJ;
                    if (viewOnAttachStateChangeListenerC20631115oD7 != null && (viewItemOperator3 = viewOnAttachStateChangeListenerC20631115oD7.getViewItemOperator()) != null && (state3 = viewItemOperator3.getState()) != null) {
                        boolValueOf = Boolean.valueOf(((ArrayList) state3.LJII()).contains(sp()));
                    }
                    if (!tp().getState().LLILZ && !z && Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD8 = this.LLLJ;
                        if (viewOnAttachStateChangeListenerC20631115oD8 != null && (viewItemOperator2 = viewOnAttachStateChangeListenerC20631115oD8.getViewItemOperator()) != null && (state2 = viewItemOperator2.getState()) != null) {
                            C20600815jK.LJIIL(state2, sp());
                        }
                    } else if ((tp().getState().LLILZ || z) && Intrinsics.LJFF(boolValueOf, Boolean.FALSE) && (viewOnAttachStateChangeListenerC20631115oD = this.LLLJ) != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
                        C20600815jK.LIZJ(state, sp());
                    }
                    if (this.LLLIZZ) {
                        MixStudioStatusRepository mixStudioStatusRepositoryUp = up();
                        if (mixStudioStatusRepositoryUp != null && (c05ydLJFF = mixStudioStatusRepositoryUp.LJFF()) != null && (value = c05ydLJFF.getValue()) != null) {
                            Iterator<C440830HQj> it5 = value.iterator();
                            int i3 = 0;
                            while (true) {
                                if (it5.hasNext()) {
                                    if (it5.next().LIZJ instanceof C440800HQg) {
                                        break;
                                    } else {
                                        i3++;
                                    }
                                } else {
                                    i3 = -1;
                                    break;
                                }
                            }
                            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD9 = this.LLLJ;
                            if (viewOnAttachStateChangeListenerC20631115oD9 != null) {
                                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD9, new ARunnableS17S0101000_6(i3, this, 18));
                            }
                        }
                        this.LLLIZZ = false;
                    } else {
                        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD10 = this.LLLJ;
                        if (viewOnAttachStateChangeListenerC20631115oD10 != null) {
                            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD10, new ARunnableS17S0101000_6(currentItem, this, 6));
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
