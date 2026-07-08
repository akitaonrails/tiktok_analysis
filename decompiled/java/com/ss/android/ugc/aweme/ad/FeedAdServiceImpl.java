package com.ss.android.ugc.aweme.ad;

import X.AbstractC1023470cjx;
import X.AbstractC581530MrP;
import X.C01GW;
import X.C098200Yq;
import X.C0RAE;
import X.C0RQG;
import X.C0SW3;
import X.C0T2F;
import X.C0T2G;
import X.C0T2H;
import X.C1000020c88;
import X.C1000080c8E;
import X.C1000130c8J;
import X.C1000380c8i;
import X.C1000840c9S;
import X.C1008080cL8;
import X.C1008700cM8;
import X.C1008720cMA;
import X.C1010170cOV;
import X.C1014230cV3;
import X.C1017070cZd;
import X.C1017080cZe;
import X.C1019830ce5;
import X.C1020420cf2;
import X.C1020750cfZ;
import X.C1022820ciu;
import X.C1023960ckk;
import X.C1247510iZJ;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390850mIV;
import X.C13LP;
import X.C1697810uHb;
import X.C189200o6;
import X.C2184171Adz;
import X.C2540909xX;
import X.C452501pT;
import X.C581540MrQ;
import X.C708090Rq3;
import X.C735630StN;
import X.C735660StQ;
import X.C987460bns;
import X.C988640bpm;
import X.C988840bq6;
import X.C988850bq7;
import X.C989150bqb;
import X.C997380c3s;
import X.C997450c3z;
import X.C997780c4W;
import X.C997820c4a;
import X.C998340c5Q;
import X.C998450c5b;
import X.C999460c7E;
import X.C999500c7I;
import X.C999700c7c;
import X.C999710c7d;
import X.C999720c7e;
import X.C999880c7u;
import X.C999920c7y;
import X.C999950c81;
import X.DialogInterfaceOnDismissListenerC1000200c8Q;
import X.InterfaceC1000280c8Y;
import X.InterfaceC665370Q7z;
import X.InterfaceC988500bpY;
import X.InterfaceC988630bpl;
import X.InterfaceC990700bt6;
import X.ViewOnClickListenerC998120c54;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.ad.feed.IClickBackTimeService;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS8S2300000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedAdServiceImpl implements IFeedAdService {
    public String LIZIZ;
    public String LIZJ;
    public C0RQG LJ;
    public Bundle LJFF;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(73));
    public String LIZLLL = "normal";

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final List<C0T2H> LIZLLL() {
        return C1697810uHb.LJIIJJI(new C997450c3z(), new C997780c4W(), new C997820c4a(), new C998450c5b());
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJJI() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final List<InterfaceC990700bt6> LJJIIJ() {
        return C1697810uHb.LJIIJJI(C999710c7d.LIZ, C999720c7e.LIZ, C999880c7u.LIZ, C999920c7y.LIZ, C999950c81.LIZ, C999700c7c.LIZ, C989150bqb.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C1020420cf2 LJIILIIL() {
        return new C1020420cf2();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C997450c3z LJIILLIIL() {
        return new C997450c3z();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final InterfaceC988630bpl LJIIZILJ() {
        return (InterfaceC988630bpl) C1010170cOV.LIZIZ(InterfaceC988630bpl.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0MrQ] */
    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C581540MrQ LJIJ() {
        return new AbstractC581530MrP() { // from class: X.0MrQ
            public long LIZJ = -1;
            public volatile boolean LIZLLL;

            @Override // X.AbstractC581530MrP
            public final void LIZJ() {
                this.LIZJ = -1L;
                this.LIZLLL = false;
            }

            @Override // X.AbstractC581530MrP
            public final long LIZ() {
                return this.LIZJ;
            }

            @Override // X.AbstractC581530MrP
            public final boolean LIZIZ(Aweme aweme) {
                if (C581720Mri.LIZ(aweme) && this.LIZJ >= 0 && this.LIZLLL) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC581530MrP
            public final void LJ(boolean z) {
                this.LIZLLL = z;
            }

            @Override // X.AbstractC581530MrP
            public final void LIZLLL(Aweme aweme, boolean z) {
                String aid;
                String aid2;
                long currentPosition;
                if (!C581720Mri.LIZ(aweme)) {
                    return;
                }
                String sourceId = null;
                if (aweme != null && (aid = aweme.getAid()) != null && aid.length() != 0) {
                    if (aweme != null) {
                        aid2 = aweme.getAid();
                    } else {
                        aid2 = null;
                    }
                    VideoUrlModel videoUrlModelLJJIII = C1483410ohn.LJLJJI().LJJIII();
                    if (videoUrlModelLJJIII != null) {
                        sourceId = videoUrlModelLJJIII.getSourceId();
                    }
                    if (!Intrinsics.LJFF(aid2, sourceId)) {
                        return;
                    }
                    if (z) {
                        currentPosition = 0;
                    } else {
                        currentPosition = C1483410ohn.LJLJJI().getCurrentPosition();
                    }
                    this.LIZJ = currentPosition;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("savePausePosition, mPausePositon:");
                    sbLIZ.append(this.LIZJ);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }

            @Override // X.AbstractC581530MrP
            public final boolean LJFF(int i, Aweme aweme) {
                boolean z;
                if (!C581720Mri.LIZ(aweme)) {
                    return false;
                }
                C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
                if (aweme == null || c0n0yLJLJJI.LJJIII() == null || i > 0) {
                    return false;
                }
                boolean z2 = !TextUtils.equals(aweme.getAid(), c0n0yLJLJJI.LJJIII().getSourceId());
                if ((AbstractC581530MrP.LIZ || AbstractC581530MrP.LIZIZ) && TextUtils.equals(aweme.getAid(), c0n0yLJLJJI.LJJIII().getSourceId())) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2 && !z) {
                    return false;
                }
                return true;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C997820c4a LJJJJ() {
        return new C997820c4a();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C997780c4W LJJJJIZL() {
        return new C997780c4W();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C999710c7d LJFF() {
        return C999710c7d.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C999920c7y LJI() {
        return C999920c7y.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final Bundle LJIILJJIL() {
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C999880c7u LJIJJ() {
        return C999880c7u.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C1000380c8i LJIJJLI() {
        return C1000380c8i.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C999700c7c LJJ() {
        return C999700c7c.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C999720c7e LJJIJIIJIL() {
        return C999720c7e.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C0RQG LJJIJL() {
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJJIJLIJ() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C999950c81 LJJIZ() {
        return C999950c81.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final String LJJJJJ() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final String getEnterFrom() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final String getProductId() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final boolean LIZ(Context context) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(context instanceof DetailActivity);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C1000020c88 LIZIZ(ViewStub viewStub) {
        return new C1000020c88(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final boolean LJ(Aweme aweme) {
        if (!C1017080cZe.LIZIZ(aweme) && !C1017080cZe.LIZ(aweme) && !C1017080cZe.LIZJ(aweme)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0c9S] */
    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C1000840c9S LJII(C987460bns c987460bns) {
        ?? r0 = new InterfaceC988630bpl(c987460bns) { // from class: X.0c9S
            public final InterfaceC1000850c9T LL;

            @Override // X.InterfaceC988630bpl
            public final void hide() {
                AbstractC1000970c9f abstractC1000970c9f;
                AwemeRawAd awemeRawAd;
                AwemeRawAd awemeRawAd2;
                InterfaceC987330bnf interfaceC987330bnfLJIILIIL = this.LL.LJIILIIL();
                if (!(interfaceC987330bnfLJIILIIL instanceof AbstractC1000970c9f) || (abstractC1000970c9f = (AbstractC1000970c9f) interfaceC987330bnfLJIILIIL) == null) {
                    return;
                }
                Aweme aweme = this.LL.getAweme();
                if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
                    awemeRawAd2.setAnimationType(3);
                }
                abstractC1000970c9f.LIZ();
                abstractC1000970c9f.LJIJ();
                Aweme aweme2 = this.LL.getAweme();
                if (aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null) {
                    return;
                }
                awemeRawAd.setAnimationType(-1);
            }

            @Override // X.InterfaceC988630bpl
            public final void lg1() {
                View view;
                Object objLJIILIIL = this.LL.LJIILIIL();
                if (!(objLJIILIIL instanceof AbstractC1000970c9f) || (view = (View) objLJIILIIL) == null) {
                    return;
                }
                view.setBackground(null);
            }

            @Override // X.InterfaceC988630bpl
            public final void show() {
                AwemeRawAd awemeRawAd;
                AbstractC1000970c9f abstractC1000970c9f;
                AwemeRawAd awemeRawAd2;
                AwemeRawAd awemeRawAd3;
                Aweme aweme = this.LL.getAweme();
                if (aweme != null && (awemeRawAd3 = aweme.getAwemeRawAd()) != null) {
                    awemeRawAd3.setShowButtonSeconds(0);
                    awemeRawAd3.setShowButtonColorSeconds(0);
                }
                InterfaceC987330bnf interfaceC987330bnfLJIILIIL = this.LL.LJIILIIL();
                if ((interfaceC987330bnfLJIILIIL instanceof AbstractC1000970c9f) && (abstractC1000970c9f = (AbstractC1000970c9f) interfaceC987330bnfLJIILIIL) != null) {
                    Aweme aweme2 = this.LL.getAweme();
                    if (aweme2 != null && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null) {
                        awemeRawAd2.setAnimationType(3);
                    }
                    abstractC1000970c9f.LJIILJJIL(this.LL.getAweme(), this.LL.LIZLLL());
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(C299670Bor.LIZ() ? 5 : 2)));
                    gradientDrawable.setColor(C1022030chd.LJI(this.LL.getContext(), this.LL.getAweme()));
                    abstractC1000970c9f.setBackground(gradientDrawable);
                    abstractC1000970c9f.LJJIIZ(0L);
                }
                Aweme aweme3 = this.LL.getAweme();
                if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null) {
                    return;
                }
                awemeRawAd.setAnimationType(-1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.InterfaceC1037910d7F
            public final void initialize() {
                for (Class cls : C1010170cOV.LIZ(this)) {
                    C1010210cOZ<InterfaceC1010530cP5<? extends Object>> c1010210cOZ = C1010170cOV.LIZIZ;
                    c1010210cOZ.LIZJ.put((Class<? extends KEY>) cls, (STORE_TYPE) c1010210cOZ.LIZ.invoke((KEY) this));
                }
            }

            @Override // X.InterfaceC1010530cP5
            public final /* bridge */ /* synthetic */ InterfaceC1000850c9T Mh() {
                return this.LL;
            }

            {
                this.LL = c987460bns;
            }

            @Override // X.InterfaceC988630bpl
            public final void setText(String str) {
                View view;
                TextView textView;
                Object objLJIILIIL = this.LL.LJIILIIL();
                if ((objLJIILIIL instanceof AbstractC1000970c9f) && (view = (View) objLJIILIIL) != null && (textView = (TextView) view.findViewById(R.id.nn6)) != null) {
                    textView.setText(str);
                }
            }

            @Override // X.InterfaceC988630bpl
            public final void QB(int i, int i2, int i3, int i4) {
                AbstractC1000970c9f abstractC1000970c9f;
                int i5;
                int defaultColor;
                ColorStateList color;
                if (i3 == i4 && i3 == 0) {
                    return;
                }
                InterfaceC987330bnf interfaceC987330bnfLJIILIIL = this.LL.LJIILIIL();
                if ((interfaceC987330bnfLJIILIIL instanceof AbstractC1000970c9f) && (abstractC1000970c9f = (AbstractC1000970c9f) interfaceC987330bnfLJIILIIL) != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    if (C299670Bor.LIZ()) {
                        i5 = 5;
                    } else {
                        i5 = 2;
                    }
                    gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(i5)));
                    Drawable background = abstractC1000970c9f.getBackground();
                    if ((background instanceof GradientDrawable) && Build.VERSION.SDK_INT >= 24 && (color = ((GradientDrawable) background).getColor()) != null) {
                        defaultColor = color.getDefaultColor();
                    } else {
                        defaultColor = i2;
                    }
                    if (defaultColor == abstractC1000970c9f.getBackGroundColor()) {
                        HandlerHook.viewRemoveCallbacks(abstractC1000970c9f, abstractC1000970c9f.LLJJI);
                        TextView textView = (TextView) abstractC1000970c9f.findViewById(R.id.nn6);
                        if (textView != null) {
                            textView.setTextColor(C960203pA.LIZ(R.attr.ee, abstractC1000970c9f.getContext()));
                        }
                    }
                    gradientDrawable.setColor(i2);
                    C421750GgH.LIZJ(abstractC1000970c9f, gradientDrawable, defaultColor, i, 300L, null);
                }
            }
        };
        r0.initialize();
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0cMA] */
    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C1008720cMA LJIIIZ(ViewStub viewStub) {
        return new C1008700cM8(viewStub) { // from class: X.0cMA
            @Override // X.C1008700cM8, X.InterfaceC987720boI
            public final void LIZ() {
                super.LIZ();
            }

            @Override // X.C1008700cM8
            public final void LJ() {
                super.LJ();
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void longPressEggStatusEvent(C1008750cMD c1008750cMD) {
                if (!this.LLILZLL) {
                } else {
                    throw null;
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJIIJJI(String str) {
        this.LIZLLL = str;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJIIL(int i) {
        C988850bq7.LIZJ(i);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C0T2G LJIJI(C0T2F c0t2f) {
        return new C0T2G(c0t2f);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final boolean LJJII(Integer num) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(69);
        arrayList.add(72);
        arrayList.add(82);
        return C13LP.LJJJJ(num, arrayList);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C1020750cfZ LJJIII(ViewGroup viewGroup) {
        return new C1020750cfZ(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C998340c5Q LJJIIJZLJL(C735660StQ c735660StQ) {
        C998340c5Q c998340c5Q = new C998340c5Q(c735660StQ);
        c998340c5Q.initialize();
        return c998340c5Q;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C997380c3s LJJIJIL(ViewStub viewStub) {
        return new C997380c3s(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJJJ(Bundle bundle) {
        this.LJFF = bundle;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJJJI(C708090Rq3 c708090Rq3) {
        this.LJ = c708090Rq3;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C1000130c8J LJJJIL(ViewStub viewStub) {
        return new C1000130c8J(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final ViewOnClickListenerC998120c54 LJJJJI(C735630StN c735630StN) {
        ViewOnClickListenerC998120c54 viewOnClickListenerC998120c54 = new ViewOnClickListenerC998120c54(c735630StN);
        viewOnClickListenerC998120c54.initialize();
        return viewOnClickListenerC998120c54;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void setEnterFrom(String str) {
        this.LIZIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void setProductId(String str) {
        this.LIZJ = str;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C999460c7E LIZJ(ViewStub viewStub, FrameLayout frameLayout) {
        return new C999460c7E(viewStub, frameLayout);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C1008080cL8 LJIIJ(Context context, Aweme aweme) {
        InterfaceC1000280c8Y interfaceC1000280c8Y;
        C1020420cf2 c1020420cf2LJIILIIL = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIILIIL();
        String strLIZ = C1014230cV3.LIZ("scene_anole_format");
        Bundle bundle = new Bundle();
        InterfaceC988500bpY interfaceC988500bpYQ = ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).Q(17);
        if ((interfaceC988500bpYQ instanceof InterfaceC1000280c8Y) && (interfaceC1000280c8Y = (InterfaceC1000280c8Y) interfaceC988500bpYQ) != null) {
            interfaceC1000280c8Y.LJIJJ(context, bundle, aweme);
        }
        bundle.putBoolean("not_open_by_profile_page", true);
        return new C1008080cL8(bundle, strLIZ, c1020420cf2LJIILIIL, (AwS595S0100000_16) null, 24);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C1000080c8E LJIILL(ViewStub viewStub, String str) {
        return new C1000080c8E(viewStub, str);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJJIIZ(int i, Aweme aweme) {
        C988640bpm c988640bpm = new C988640bpm();
        new AwS595S0100000_16(aweme, 182).invoke(c988640bpm.LIZ);
        T t = c988640bpm.LIZ;
        C988850bq7.LIZ.put(Integer.valueOf(i), (C1019830ce5) t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r0.booleanValue() != false) goto L30;
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0c8O] */
    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1000880c9W LJJIJ(android.content.Context r6, com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            r5 = this;
            boolean r0 = X.C1017070cZd.LJLIIL(r7)
            r3 = 0
            if (r0 == 0) goto L6e
            boolean r0 = X.C1009740cNo.LJIIL(r7)
            if (r0 != 0) goto L6e
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r7)
            if (r0 == 0) goto L71
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r7.getAwemeRawAd()
            if (r0 == 0) goto L71
            com.ss.android.ugc.aweme.commercialize.model.AnoleModel r0 = r0.getAnoleModel()
            if (r0 == 0) goto L71
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel> r1 = r0.components
            if (r1 == 0) goto L71
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L6f
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L31:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getValue()
            com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r2 = (com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel) r2
            java.lang.String r1 = r2.scene
            java.lang.String r0 = "carousel"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L31
            java.lang.String r1 = r2.type
            java.lang.String r0 = "carousel_product_label"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L61
            java.lang.String r1 = r2.type
            java.lang.String r0 = "carousel_product_label_ugen"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L31
        L61:
            r0 = 1
        L62:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L71
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L71
        L6e:
            return r3
        L6f:
            r0 = 0
            goto L62
        L71:
            X.0c9W r3 = new X.0c9W
            X.0c8O r0 = new X.0c8O
            r0.<init>(r6, r7)
            r3.<init>(r0)
            r3.initialize()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.FeedAdServiceImpl.LJJIJ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):X.0c9W");
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJIIIIZZ(String str, AwemeRawAd awemeRawAd, Map map) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", str, awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("ec_ug_vsa_card", "refer");
        c1022820ciuLIZLLL.LIZ(map);
        c1022820ciuLIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C0SW3 LJJIFFI(View view, C0RAE c0rae, String str) {
        return new C0SW3(view, c0rae, str);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C1008080cL8 LJJIIZI(Context context, Aweme aweme, String str) {
        InterfaceC1000280c8Y interfaceC1000280c8Y;
        String strLIZ = str;
        if (TextUtils.isEmpty(strLIZ)) {
            strLIZ = C1014230cV3.LIZ("scene_anole_format");
        }
        C1020420cf2 c1020420cf2 = new C1020420cf2();
        Bundle bundle = new Bundle();
        InterfaceC988500bpY interfaceC988500bpYQ = ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).Q(17);
        if ((interfaceC988500bpYQ instanceof InterfaceC1000280c8Y) && (interfaceC1000280c8Y = (InterfaceC1000280c8Y) interfaceC988500bpYQ) != null) {
            interfaceC1000280c8Y.LJIJJ(context, bundle, aweme);
        }
        return new C1008080cL8(bundle, strLIZ, c1020420cf2, (AwS595S0100000_16) null, 24);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C999500c7I LJJIJIIJI(View view, InterfaceC665370Q7z interfaceC665370Q7z, VideoPlayTaskManager videoPlayTaskManager) {
        return new C999500c7I(view, interfaceC665370Q7z, videoPlayTaskManager);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJJIL(Aweme aweme, C1023960ckk c1023960ckk, String str) {
        AwemeRawAd awemeRawAd;
        final Object[] objArr = {new Pair(this.LIZIZ, str)};
        AbstractC1023470cjx abstractC1023470cjx = new AbstractC1023470cjx(objArr) { // from class: X.0c9K
            public final C1023630ckD<?>[] LIZ;

            @Override // X.AbstractC1023380cjo, X.C1023640ckE
            public final C1023630ckD<?>[] getInternalLogics() {
                return this.LIZ;
            }

            {
                super(Arrays.copyOf(objArr, objArr.length));
                C1000780c9M.LIZ.getClass();
                this.LIZ = new C1023630ckD[]{new C1023630ckD<>(C1000780c9M.LIZLLL, AFwS252S0000000_16.get$arr$(748)), new C1023630ckD<>(C1000780c9M.LJ, AFwS252S0000000_16.get$arr$(749)), new C1023630ckD<>(C1000780c9M.LIZIZ, AFwS252S0000000_16.get$arr$(750)), new C1023630ckD<>(C1000780c9M.LIZJ, AFwS252S0000000_16.get$arr$(751))};
            }
        };
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        abstractC1023470cjx.logAd(c1023960ckk, awemeRawAd, new AwS595S0100000_16(aweme, 240));
        this.LIZIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final TuxActionSheet LJIL(Context context, final Aweme aweme, final String str, String str2) {
        boolean z;
        Activity activityLIZ;
        AwemeRawAd awemeRawAd;
        String phoneNumber = str2;
        if (aweme != null && C1017070cZd.LJJZZI(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        if (phoneNumber == null && (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (phoneNumber = awemeRawAd.getPhoneNumber()) == null)) {
            return null;
        }
        Integer num = C988840bq6.LIZ.get(phoneNumber);
        if (num != null && num.intValue() >= C2540909xX.LIZ()) {
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131828230);
                c1389890mGx.LJIIJJI();
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str, "othershow", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL.LIZJ("tooltip", "refer");
                c1022820ciuLIZLLL.LJII();
            }
            return null;
        }
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131839773);
        c1247510iZJ.LJFF = phoneNumber;
        c1247510iZJ.LIZ(new AwS8S2300000_16(context, aweme, num, phoneNumber, str, 1));
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJI(Collections.singletonList(c1247510iZJ));
        c1390850mIV.LIZLLL(R.string.f1_);
        DialogInterfaceOnDismissListenerC1000200c8Q dialogInterfaceOnDismissListenerC1000200c8Q = new DialogInterface.OnDismissListener() { // from class: X.0c8Q
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C1440005kM.LIZ(new C1000210c8R(true));
            }
        };
        TuxActionSheet tuxActionSheet = c1390850mIV.LIZ;
        tuxActionSheet.LLILLJJLI = dialogInterfaceOnDismissListenerC1000200c8Q;
        tuxActionSheet.LL = new DialogInterface.OnCancelListener() { // from class: X.0c8P
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL(str, "otherclick", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL2.LIZJ("banner_cancel", "refer");
                c1022820ciuLIZLLL2.LJII();
                IClickBackTimeService iClickBackTimeService = (IClickBackTimeService) PluggableExtentionKt.pluggableSpi$default(IClickBackTimeService.class, false, false, false, 14, null);
                if (iClickBackTimeService != null) {
                    iClickBackTimeService.LIZ(aweme);
                }
            }
        };
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        Bundle arguments = tuxActionSheetLIZJ.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean("is_phone_call_action_sheet", true);
        tuxActionSheetLIZJ.setArguments(arguments);
        return tuxActionSheetLIZJ;
    }
}
