package com.ss.android.ugc.aweme.feed.assem.digg;

import X.C01GW;
import X.C082N;
import X.C0HIW;
import X.C0HIX;
import X.C0HUY;
import X.C0HV5;
import X.C0SUC;
import X.C12ES;
import X.C12MF;
import X.C1342130l1v;
import X.C1360460lVU;
import X.C13LE;
import X.C1558520qew;
import X.C1697580uHE;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1776900wLA;
import X.C19746312Np;
import X.C19746412Nq;
import X.C1EAU;
import X.C21647019ng;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2189731Amx;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C720670SOr;
import X.C735370Ssx;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC19746112Nn;
import Y.AUListenerS16S0100001_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.RecReasonEntry;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.upvote.ability.IViewPositionAbility;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishExtraData;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AFwS321S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class LongPressDiggAssem extends FeedBaseAssem<LongPressDiggAssem> {
    public IViewPositionAbility LLJLILLLLZIIL;
    public String LLJLL;
    public VideoItemParams LLJLLIL;
    public int LLLI;
    public int LLLII;
    public float LLLIIII;
    public int LLLIIIIL;
    public boolean LLLIIIL;
    public int LLLILZLLLI;
    public final C01GW LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS279S0000000_33.get$arr$(102));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2147));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2150));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2146));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2158));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2152));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2155));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2153));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2154));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2156));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2157));
    public final List<C21647019ng> LLLIIL = new ArrayList();
    public final List<ValueAnimator> LLLIILIL = new ArrayList();
    public final C01GW LLLIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(296));
    public final float LLLILZ = C418440Gaw.LIZIZ(50);
    public final int LLLILZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
    public final C01GW LLLIZZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(297));
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2151));
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2148));
    public final C01GW LLLJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2149));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b_c;
    }

    public final View Ap() {
        return (View) this.LLJZIJLIL.getValue();
    }

    public final View Bp() {
        return (View) this.LLLF.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ep() {
        String str;
        VideoItemParams videoItemParams = this.LLJLLIL;
        if (videoItemParams == null || (str = this.LLJLL) == null) {
            return;
        }
        String str2 = videoItemParams.mEventType;
        String strLIZLLL = C735370Ssx.LIZLLL(videoItemParams.getAweme());
        String strLJIIJ = C735370Ssx.LJIIJ(videoItemParams.getAweme());
        String strValueOf = String.valueOf(videoItemParams.getAweme().getAwemeType());
        boolean zLJJIIJ = C735370Ssx.LJJIIJ(videoItemParams.getAweme());
        RecReasonEntry recReasonTag = videoItemParams.getAweme().getRecReasonTag();
        RecReasonsStruct recReasonsStruct = videoItemParams.getAweme().getRecReasonsStruct();
        String homepageUid = C0SUC.LIZ(getContext()).getHomepageUid();
        if (homepageUid == null) {
            homepageUid = "";
        }
        String homepageUid2 = C0SUC.LIZ(getContext()).getHomepageUid();
        if (homepageUid2 == null) {
            homepageUid2 = "";
        }
        String requestId = videoItemParams.getAweme().getRequestId();
        C1360460lVU.LIZIZ.LJJJ(null, null, null, new UpvotePublishExtraData(videoItemParams.getAweme(), -1), new UpvotePublishMobParam(str2, "long_press_like", str, strLIZLLL, strLJIIJ, null, "long_press_like_panel", false, null == true ? 1 : 0, strValueOf, zLJJIIJ, recReasonTag, recReasonsStruct, null == true ? 1 : 0, null == true ? 1 : 0, 0.0d, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, homepageUid, homepageUid2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, requestId != null ? requestId : "", null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, -61984, 64975), 0, str, null, null, null, null, null, null, false);
    }

    public final void Fp() {
        clearAnimation();
        C21647019ng c21647019ng = new C21647019ng(getContentView().getContext(), getContentView(), new C19746312Np(EnumC19746112Nn.BEZIER, new C1776900wLA(new C1342130l1v(0.0f), new C1342130l1v(0.0f), new C1342130l1v(1.0f), new C1342130l1v(1.0f), 150L), Collections.singletonList(new C19746412Nq("alpha", new C0HUY(1.0f, 0.0f)))), false);
        c21647019ng.LIZJ("alpha", (C2189731Amx) this.LLLJIL.getValue());
        c21647019ng.LJI(true);
        ((ArrayList) this.LLLIIL).add(c21647019ng);
    }

    public final void clearAnimation() {
        Iterator<C21647019ng> it2 = this.LLLIIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        ((ArrayList) this.LLLIIL).clear();
        Iterator<ValueAnimator> it3 = this.LLLIILIL.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
        ((ArrayList) this.LLLIILIL).clear();
    }

    public final void tp() {
        char c;
        char c2;
        int[] iArr;
        C720670SOr c720670SOrLQ;
        Rect rectZz;
        if (zp()) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJLL);
            sbLIZ.append(" perform success when downgrade");
            C1720106oR.LJI("LongPressDiggAssem", C2188811AlT.LIZIZ(sbLIZ));
            Fp();
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LLJLL);
        sbLIZ2.append(" perform success when normal");
        C1720106oR.LJI("LongPressDiggAssem", C2188811AlT.LIZIZ(sbLIZ2));
        Context context = up().getContext();
        View viewUp = up();
        EnumC19746112Nn enumC19746112Nn = EnumC19746112Nn.BEZIER;
        C21647019ng c21647019ng = new C21647019ng(context, viewUp, new C19746312Np(enumC19746112Nn, new C1776900wLA(new C1342130l1v(0.66f), new C1342130l1v(0.0f), new C1342130l1v(0.34f), new C1342130l1v(1.0f), 250L), C1697810uHb.LJIIJJI(new C19746412Nq("scaleX", new C0HIW(1.0f, 1.2f)), new C19746412Nq("scaleY", new C0HIX(1.0f, 1.2f)))), false);
        c21647019ng.LJI(true);
        ((ArrayList) this.LLLIIL).add(c21647019ng);
        Context context2 = up().getContext();
        View viewUp2 = up();
        C1342130l1v c1342130l1v = new C1342130l1v(0.32f);
        C1342130l1v c1342130l1v2 = new C1342130l1v(0.94f);
        C1342130l1v c1342130l1v3 = new C1342130l1v(0.6f);
        C1342130l1v c1342130l1v4 = new C1342130l1v(1.0f);
        C01GW c01gw = C1EAU.LJIILIIL;
        C21647019ng c21647019ng2 = new C21647019ng(context2, viewUp2, new C19746312Np(enumC19746112Nn, new C1776900wLA(c1342130l1v, c1342130l1v2, c1342130l1v3, c1342130l1v4, ((Number) c01gw.getValue()).longValue()), C1697810uHb.LJIIJJI(new C19746412Nq("scaleX", new C0HIW(1.2f, 1.0f)), new C19746412Nq("scaleY", new C0HIX(1.2f, 1.0f)))), false);
        c21647019ng2.LIZLLL(250L);
        c21647019ng2.LJI(true);
        ((ArrayList) this.LLLIIL).add(c21647019ng2);
        long jLongValue = ((Number) c01gw.getValue()).longValue() + 250;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.38f, 0.89f, 0.62f, 1.0f));
        valueAnimatorOfFloat.setStartDelay(jLongValue);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS16S0100001_33(this.LLLI * 1.0f, this, 0));
        valueAnimatorOfFloat.start();
        ((ArrayList) this.LLLIILIL).add(valueAnimatorOfFloat);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.6f, 0.0f, 0.42f, 1.0f));
        valueAnimatorOfFloat2.setStartDelay(jLongValue);
        valueAnimatorOfFloat2.setDuration(300L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS16S0100001_33(this.LLLII * 1.0f, this, 1));
        valueAnimatorOfFloat2.start();
        ((ArrayList) this.LLLIILIL).add(valueAnimatorOfFloat2);
        C21647019ng c21647019ng3 = new C21647019ng(Bp().getContext(), Bp(), new C19746312Np(enumC19746112Nn, new C1776900wLA(new C1342130l1v(0.38f), new C1342130l1v(0.89f), new C1342130l1v(0.62f), new C1342130l1v(1.0f), 300L), C1697810uHb.LJIIJJI(new C19746412Nq("scaleX", new C0HIW(1.0f, 0.0f)), new C19746412Nq("scaleY", new C0HIX(1.0f, 0.0f)))), false);
        c21647019ng3.LIZLLL(jLongValue);
        c21647019ng3.LJI(true);
        ((ArrayList) this.LLLIIL).add(c21647019ng3);
        C21647019ng c21647019ng4 = new C21647019ng(Bp().getContext(), Bp(), new C19746312Np(enumC19746112Nn, new C1776900wLA(new C1342130l1v(0.0f), new C1342130l1v(0.0f), new C1342130l1v(1.0f), new C1342130l1v(1.0f), 150L), Collections.singletonList(new C19746412Nq("alpha", new C0HUY(1.0f, 0.0f)))), false);
        c21647019ng4.LIZLLL(jLongValue);
        c21647019ng4.LJI(true);
        ((ArrayList) this.LLLIIL).add(c21647019ng4);
        C21647019ng c21647019ng5 = new C21647019ng(((View) this.LLLFZ.getValue()).getContext(), (View) this.LLLFZ.getValue(), new C19746312Np(enumC19746112Nn, new C1776900wLA(new C1342130l1v(0.0f), new C1342130l1v(0.0f), new C1342130l1v(1.0f), new C1342130l1v(1.0f), 150L), Collections.singletonList(new C19746412Nq("alpha", new C0HUY(0.0f, 1.0f)))), false);
        c21647019ng5.LIZLLL(jLongValue);
        c21647019ng5.LJI(true);
        ((ArrayList) this.LLLIIL).add(c21647019ng5);
        Context context3 = getContext();
        int i3 = (context3 == null || !C426750GoL.LIZLLL(context3)) ? 1 : -1;
        long jLongValue2 = ((Number) c01gw.getValue()).longValue() + 250;
        float f = 2;
        float f2 = (this.LLLI - this.LLLIIII) / f;
        if (this.LLJLILLLLZIIL == null) {
            this.LLJLILLLLZIIL = (IViewPositionAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IViewPositionAbility.class, null);
        }
        IViewPositionAbility iViewPositionAbility = this.LLJLILLLLZIIL;
        if (iViewPositionAbility == null || (rectZz = iViewPositionAbility.Zz()) == null) {
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJLIL.getValue();
            if (interactAreaCommonAbility == null || (c720670SOrLQ = interactAreaCommonAbility.LQ("left_container")) == null) {
                C1720106oR.LJI("LongPressDiggAssem", "target position default");
                Context context4 = getContext();
                if (context4 == null || !C426750GoL.LIZLLL(context4)) {
                    c = 0;
                    c2 = 1;
                    iArr = new int[]{0, C12ES.LJIIIIZZ(getContext())};
                } else {
                    c = 0;
                    c2 = 1;
                    iArr = new int[]{-C12ES.LJIIJ(getContext()), C12ES.LJIIIIZZ(getContext())};
                }
            } else {
                C1720106oR.LJI("LongPressDiggAssem", "target position left container");
                float fLIZIZ = ((this.LLLII - this.LLLIIII) / f) + C418440Gaw.LIZIZ(36);
                Context context5 = getContext();
                if (context5 == null || !C426750GoL.LIZLLL(context5)) {
                    int[] iArr2 = c720670SOrLQ.LIZ;
                    iArr = new int[]{iArr2[0], iArr2[1] - ((int) fLIZIZ)};
                } else {
                    int iLJIIJ = C12ES.LJIIJ(getContext());
                    int[] iArr3 = c720670SOrLQ.LIZ;
                    iArr = new int[]{-((iLJIIJ - iArr3[0]) - c720670SOrLQ.LIZIZ), iArr3[1] - ((int) fLIZIZ)};
                }
                c2 = 1;
                c = 0;
            }
        } else {
            C1720106oR.LJI("LongPressDiggAssem", "target position already has white bar");
            Context context6 = getContext();
            if (context6 == null || !C426750GoL.LIZLLL(context6)) {
                c2 = 1;
                iArr = new int[]{rectZz.left, rectZz.top};
                c = 0;
            } else {
                c = 0;
                c2 = 1;
                iArr = new int[]{-(C12ES.LJIIJ(getContext()) - rectZz.right), rectZz.top};
            }
        }
        float f3 = iArr[c] - (i3 * f2);
        int i4 = iArr[c2];
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("target position ");
        sbLIZ3.append(iArr[c]);
        sbLIZ3.append(", ");
        sbLIZ3.append(iArr[c2]);
        sbLIZ3.append(", endX = ");
        sbLIZ3.append(f3);
        sbLIZ3.append(", endY = ");
        sbLIZ3.append(i4);
        C1720106oR.LJI("LongPressDiggAssem", C2188811AlT.LIZIZ(sbLIZ3));
        Context context7 = up().getContext();
        View viewUp3 = up();
        C01GW c01gw2 = C1EAU.LJIIJ;
        C1342130l1v c1342130l1v5 = new C1342130l1v(((Number) ListProtector.get((List) c01gw2.getValue(), 0)).floatValue());
        C1342130l1v c1342130l1v6 = new C1342130l1v(((Number) ListProtector.get((List) c01gw2.getValue(), 1)).floatValue());
        C1342130l1v c1342130l1v7 = new C1342130l1v(((Number) ListProtector.get((List) c01gw2.getValue(), 2)).floatValue());
        C1342130l1v c1342130l1v8 = new C1342130l1v(((Number) ListProtector.get((List) c01gw2.getValue(), 3)).floatValue());
        C01GW c01gw3 = C1EAU.LJIIIZ;
        C21647019ng c21647019ng6 = new C21647019ng(context7, viewUp3, new C19746312Np(enumC19746112Nn, new C1776900wLA(c1342130l1v5, c1342130l1v6, c1342130l1v7, c1342130l1v8, ((Number) c01gw3.getValue()).longValue()), Collections.singletonList(new C19746412Nq("translateX", new C082N(yp(), f3)))), false);
        c21647019ng6.LIZLLL(jLongValue2);
        c21647019ng6.LJI(true);
        ((ArrayList) this.LLLIIL).add(c21647019ng6);
        Context context8 = up().getContext();
        View viewUp4 = up();
        C01GW c01gw4 = C1EAU.LJIIJJI;
        C21647019ng c21647019ng7 = new C21647019ng(context8, viewUp4, new C19746312Np(enumC19746112Nn, new C1776900wLA(new C1342130l1v(((Number) ListProtector.get((List) c01gw4.getValue(), 0)).floatValue()), new C1342130l1v(((Number) ListProtector.get((List) c01gw4.getValue(), 1)).floatValue()), new C1342130l1v(((Number) ListProtector.get((List) c01gw4.getValue(), 2)).floatValue()), new C1342130l1v(((Number) ListProtector.get((List) c01gw4.getValue(), 3)).floatValue()), ((Number) c01gw3.getValue()).longValue()), Collections.singletonList(new C19746412Nq("translateY", new C0HV5(up().getY(), i4)))), false);
        c21647019ng7.LIZLLL(jLongValue2);
        c21647019ng7.LIZJ("translateY", (C2189731Amx) this.LLLJL.getValue());
        c21647019ng7.LJI(true);
        ((ArrayList) this.LLLIIL).add(c21647019ng7);
        C21647019ng c21647019ng8 = new C21647019ng(getContentView().getContext(), getContentView(), new C19746312Np(enumC19746112Nn, new C1776900wLA(new C1342130l1v(0.0f), new C1342130l1v(0.0f), new C1342130l1v(1.0f), new C1342130l1v(1.0f), 150L), Collections.singletonList(new C19746412Nq("alpha", new C0HUY(1.0f, 0.0f)))), false);
        c21647019ng8.LIZLLL(((Number) C1EAU.LJIIL.getValue()).longValue());
        c21647019ng8.LJI(true);
        ((ArrayList) this.LLLIIL).add(c21647019ng8);
    }

    public final View up() {
        return (View) this.LLJLLL.getValue();
    }

    public final boolean zp() {
        return ((Boolean) this.LLLIL.getValue()).booleanValue();
    }

    public final void reset() {
        clearAnimation();
        C786410Ut5.LJLLLLLL(4, getContentView());
        C786410Ut5.T4(getContentView(), 1.0f);
        ((View) this.LLJZ.getValue()).getLayoutParams().width = this.LLLI;
        ((View) this.LLJZ.getValue()).getLayoutParams().height = this.LLLII;
        Ap().getLayoutParams().width = this.LLLI;
        Ap().getLayoutParams().height = this.LLLII;
        Ap().requestLayout();
        C786410Ut5.T4(Bp(), 1.0f);
        C786410Ut5.Ob(Bp(), 1.0f);
        C786410Ut5.pc(Bp(), 1.0f);
        C786410Ut5.T4((View) this.LLLFZ.getValue(), 0.0f);
        this.LLLIIIIL = 0;
        this.LLLIIIL = false;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJLL);
        sbLIZ.append(" reset currentState = ");
        sbLIZ.append(this.LLLIIIIL);
        C1720106oR.LJI("LongPressDiggAssem", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final float yp() {
        Context context = getContext();
        return (context == null || !C426750GoL.LIZLLL(context)) ? up().getX() : ((C12ES.LJIIJ(getContext()) - up().getX()) - this.LLLI) * (-1);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object styleSpan;
        CharSequence text = ((AppCompatTextView) this.LLLFFI.getValue()).getText();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        if (Build.VERSION.SDK_INT >= 28) {
            Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 800, 0.0f, 1.0f, null, 0.0f, 0, null, 245);
            if (typefaceLIZIZ != null) {
                styleSpan = new TypefaceSpan(typefaceLIZIZ);
            } else {
                styleSpan = null;
            }
        } else {
            styleSpan = new StyleSpan(C12MF.BOLD_ITALIC.getVALUE());
        }
        C786410Ut5.q2(spannableStringBuilder, styleSpan, 0, text.length(), 33);
        ((TextView) this.LLLFFI.getValue()).setText(spannableStringBuilder);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        up().measure(0, View.MeasureSpec.makeMeasureSpec(iLIZIZ, 1073741824));
        ((View) this.LLLFFI.getValue()).getLayoutParams().width = ((View) this.LLLFFI.getValue()).getMeasuredWidth() + iLIZIZ2;
        this.LLLI = up().getMeasuredWidth() + iLIZIZ2;
        this.LLLII = up().getMeasuredHeight();
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(106));
        if (this.LLLI < iLIZIZ3) {
            this.LLLI = iLIZIZ3;
        }
        this.LLLIIII = this.LLLII * 0.3f;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("perform init view width = ");
        sbLIZ.append(this.LLLI);
        sbLIZ.append(", view height = ");
        sbLIZ.append(this.LLLII);
        sbLIZ.append(", zoom out size = ");
        sbLIZ.append(this.LLLIIII);
        C1720106oR.LJI("LongPressDiggAssem", C2188811AlT.LIZIZ(sbLIZ));
        up().getLayoutParams().width = this.LLLI;
        up().getLayoutParams().height = this.LLLII;
        Ap().getLayoutParams().width = this.LLLI;
        Ap().getLayoutParams().height = this.LLLII;
        this.LLLILZLLLI = this.LLLI + this.LLLILZJ;
        ((View) this.LLL.getValue()).getLayoutParams().width = this.LLLILZLLLI;
        ((View) this.LLL.getValue()).getLayoutParams().height = this.LLLII;
        ((View) this.LLLFZ.getValue()).getLayoutParams().width = this.LLLI;
        ((View) this.LLLFZ.getValue()).getLayoutParams().height = this.LLLII;
        ((View) this.LLL.getValue()).requestLayout();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.19nl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLLFF;
            }
        }, null, AFwS321S0000000_33.get$arr$(2), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        this.LLJLL = videoItemParams2.getAweme().getAid();
        this.LLJLLIL = videoItemParams2;
    }
}
