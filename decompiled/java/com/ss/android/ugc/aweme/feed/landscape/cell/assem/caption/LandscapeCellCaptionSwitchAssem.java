package com.ss.android.ugc.aweme.feed.landscape.cell.assem.caption;

import X.AnonymousClass0956;
import X.C01GW;
import X.C05RH;
import X.C09IC;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1389890mGx;
import X.C14EU;
import X.C160R;
import X.C1613506Tl;
import X.C1629806Zs;
import X.C1673206gs;
import X.C19252910Tv;
import X.C20703515zt;
import X.C2277711EDh;
import X.C414301jJ;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C622680Oba;
import X.C695370RPj;
import X.C724270Sb3;
import X.C746760TRa;
import X.C786410Ut5;
import X.C814420VxA;
import X.C861640Xr8;
import Y.ACListenerS146S0100000_11;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeCellCaptionSwitchAssem extends FeedBaseContentAssem<LandscapeCellCaptionSwitchAssem> {
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 397));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 398));
    public TuxIconView LLJJJJLIIL;
    public AnonymousClass0956 LLJJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C622680Oba.LIZLLL(this);
    }

    public final C419910GdJ cp(Aweme aweme) {
        Integer numLIZJ = null;
        if (!C20703515zt.LJJI(aweme)) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_closed_captions;
            Context context = getContext();
            if (context != null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.ei, context);
            }
            c419910GdJ.LIZLLL = numLIZJ;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            return c419910GdJ;
        }
        C20703515zt.LIZ.getClass();
        if (!C20703515zt.LJIL(aweme)) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_closed_captions;
            Context context2 = getContext();
            if (context2 != null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context2);
            }
            c419910GdJ2.LIZLLL = numLIZJ;
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            return c419910GdJ2;
        }
        C419910GdJ c419910GdJ3 = new C419910GdJ();
        c419910GdJ3.LIZ = R.raw.icon_closed_captions_fill;
        Context context3 = getContext();
        if (context3 != null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context3);
        }
        c419910GdJ3.LIZLLL = numLIZJ;
        c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        return c419910GdJ3;
    }

    public final void dp(int i) {
        Activity activityLIZ;
        Context context = getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIJJI();
        }
    }

    @C14EU
    public final void onCaptionToggleEvent(C160R c160r) {
        TuxIconView tuxIconView = this.LLJJJJLIIL;
        Object obj = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        tuxIconView.setTuxIcon(cp(((VideoItemParams) obj).getAweme()));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.y3x);
        this.LLJJJJLIIL = tuxIconView;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.a9(tuxIconView, new ACListenerS146S0100000_11(this, 18));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Object obj;
        VideoItemParams videoItemParams2 = videoItemParams;
        AnonymousClass0956 anonymousClass0956 = this.LLJJL;
        TuxIconView tuxIconView = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        if (aweme != null && C20703515zt.LJJI(aweme)) {
            this.LLJJL = C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C1673206gs(this, null), new C1629806Zs(new C05RH(new C414301jJ(C746760TRa.LIZ().LJJIII(), C746760TRa.LIZ().LJIJI(), new C1613506Tl(this, null))))));
        }
        TuxIconView tuxIconView2 = this.LLJJJJLIIL;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        tuxIconView2.setTuxIcon(cp(videoItemParams2.getAweme()));
        C695370RPj c695370RPj = C695370RPj.LIZ;
        Aweme aweme2 = videoItemParams2.getAweme();
        c695370RPj.getClass();
        if (C695370RPj.LIZ(aweme2).LIZJ() && !C19252910Tv.LIZIZ.LIZLLL().LJIIIZ() && C2277711EDh.LIZIZ.LJIIJJI()) {
            TuxIconView tuxIconView3 = this.LLJJJJLIIL;
            if (tuxIconView3 != null) {
                tuxIconView = tuxIconView3;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
    }
}
