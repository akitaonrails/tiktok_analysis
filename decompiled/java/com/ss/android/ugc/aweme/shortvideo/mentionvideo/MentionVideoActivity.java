package com.ss.android.ugc.aweme.shortvideo.mentionvideo;

import X.ActivityC214874197g;
import X.C0CHQ;
import X.C0HTI;
import X.C0LAB;
import X.C0ZIO;
import X.C1192870h9B;
import X.C11VF;
import X.C1202330hOR;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1390130mHL;
import X.C1430420nKK;
import X.C1436840nUg;
import X.C1667580tUq;
import X.C1697810uHb;
import X.C19774712Yn;
import X.C19Y3;
import X.C19Y5;
import X.C20684815ws;
import X.C2077408Bw;
import X.C21594319fB;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.C341940Daq;
import X.C437930HFf;
import X.C580270MpN;
import X.C770750ULh;
import X.C786410Ut5;
import X.EnumC335920DEw;
import Y.ACListenerS163S0100000_29;
import Y.ACListenerS53S0201000_29;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class MentionVideoActivity extends ActivityC214874197g {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCHELIOSB9JSAiPSY8JjMlLSo8ZggpJzs6JysaICs2JwQvPSYlITE1";
    public VideoPublishEditModel LLILLJJLI;
    public C19Y3 LLILLL;
    public C21594319fB LLILZ;
    public C1390130mHL LLILZIL;
    public int LLJI;
    public String LL = "";
    public final ArrayList<String> LLILZLL = new ArrayList<>();
    public final ArrayList<Fragment> LLIZ = new ArrayList<>();
    public String LLIZLLLIL = "";
    public String LLJ = "";
    public String LLJIJIL = "";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC214874197g
    public final C1202330hOR LLLLLZL() {
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LIZJ;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity", "onStart", true);
        super.onStart();
        C0ZIO.LIZ.getClass();
        if (new C1436840nUg(C0CHQ.LIZ).LIZJ().getBoolean("mention_video_guide_panel", true)) {
            C770750ULh c770750ULh = new C770750ULh();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.x3;
            c770750ULh.LIZ = c0hti.LIZ(this);
            c770750ULh.LIZLLL = 2;
            c770750ULh.LJ = getString(2131830011);
            c770750ULh.LJ(new C1667580tUq(R.raw.icon_at, null, getString(2131830008), null, 8), new C1667580tUq(R.raw.icon_tilt_light_bulb, null, getString(2131830009), null, 8), new C1667580tUq(R.raw.icon_bell, null, getString(2131830010), null, 8));
            c770750ULh.LJIILLIIL = false;
            c770750ULh.LJI(getString(2131830007), new AwS608S0100000_29(this, 223));
            c770750ULh.LIZIZ().LIZ.show(getSupportFragmentManager(), "mention_video_educational_panel");
            new C1436840nUg(C0CHQ.LIZ).LIZJ().edit().putBoolean("mention_video_guide_panel", false).apply();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", "video_post_page");
            c0lab.LJ("creation_id", this.LLJIJIL);
            C20684815ws.LJIILLIIL("show_credits_video_popup", c0lab.LIZ);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        int i;
        int i2;
        super.finish();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C1389600mGU.LIZIZ(this)) {
            i = 0;
            i2 = 0;
        } else {
            i = R.anim.t;
            i2 = R.anim.a8;
        }
        overridePendingTransition(i, i2);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.ActivityC214874197g
    public final String getCreationId() {
        return this.LLJIJIL;
    }

    @Override // X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        View view;
        String str;
        Window window;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ja);
        getWindow().addFlags(128);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C1389600mGU.LIZIZ(this)) {
            i = 0;
            i2 = 0;
        } else {
            i = R.anim.an;
            i2 = R.anim.t;
        }
        overridePendingTransition(i, i2);
        String strLLLLZLL = LLLLZLL(getIntent(), "creation_id");
        String str2 = "";
        if (strLLLLZLL == null) {
            strLLLLZLL = "";
        }
        this.LLJIJIL = strLLLLZLL;
        this.LLILLJJLI = C1430420nKK.LIZIZ(getIntent());
        String strLLLLZLL2 = LLLLZLL(getIntent(), "enter_from");
        if (strLLLLZLL2 == null) {
            strLLLLZLL2 = "";
        }
        this.LL = strLLLLZLL2;
        if (!C2077408Bw.LIZIZ(this) && (window = getWindow()) != null) {
            window.setFlags(1024, 1024);
            window.getDecorView().setSystemUiVisibility(4102);
        }
        this.LLILZIL = (C1390130mHL) findViewById(R.id.nmj);
        ImageView imageView = (ImageView) findViewById(R.id.e1r);
        C21594319fB c21594319fB = null;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.Q7(imageView, new ACListenerS163S0100000_29(this, 80));
        this.LLILLL = (C19Y3) findViewById(R.id.video_list_tab);
        C21594319fB c21594319fB2 = (C21594319fB) findViewById(R.id.video_list_viewpager);
        this.LLILZ = c21594319fB2;
        if (c21594319fB2 == null) {
            c21594319fB2 = null;
        }
        c21594319fB2.setOffscreenPageLimit(3);
        String strLLLLZLL3 = LLLLZLL(getIntent(), "music_id");
        if (strLLLLZLL3 != null) {
            this.LLIZLLLIL = strLLLLZLL3;
            String strLLLLZLL4 = LLLLZLL(getIntent(), "music_title");
            if (strLLLLZLL4 == null) {
                strLLLLZLL4 = "";
            }
            String strLLLLZLL5 = LLLLZLL(getIntent(), "music_author");
            if (strLLLLZLL5 != null) {
                str2 = strLLLLZLL5;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLLLLZLL4);
            sbLIZ.append(" — ");
            sbLIZ.append(str2);
            this.LLJ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C11VF c11vf = C11VF.LIZIZ;
        c11vf.setCreationId(this.LLJIJIL);
        ArrayList<String> arrayList = this.LLILZLL;
        String str3 = this.LLIZLLLIL;
        if (str3 != null && str3.length() != 0 && (str = this.LLJ) != null && str.length() != 0) {
            arrayList.add(getString(2131830021));
            this.LLIZ.add(c11vf.LJIIJJI(this.LLIZLLLIL, this.LLJ));
        }
        arrayList.add(getString(2131830020));
        this.LLIZ.add(c11vf.LJIIIZ(6));
        arrayList.add(getString(2131830018));
        this.LLIZ.add(c11vf.LJIIIZ(9));
        arrayList.add(getString(2131830017));
        this.LLIZ.add(c11vf.LIZJ());
        C19Y3 c19y3 = this.LLILLL;
        if (c19y3 == null) {
            c19y3 = null;
        }
        c19y3.setTabMode(0);
        C19Y3 c19y32 = this.LLILLL;
        if (c19y32 == null) {
            c19y32 = null;
        }
        c19y32.setAutoFillWhenScrollable(true);
        C19Y3 c19y33 = this.LLILLL;
        if (c19y33 == null) {
            c19y33 = null;
        }
        c19y33.LJIILLIIL(C341940Daq.LIZ(16.0d), C341940Daq.LIZ(16.0d));
        C19Y3 c19y34 = this.LLILLL;
        if (c19y34 == null) {
            c19y34 = null;
        }
        c19y34.setCustomTabViewResId(R.layout.dmb);
        C21594319fB c21594319fB3 = this.LLILZ;
        if (c21594319fB3 == null) {
            c21594319fB3 = null;
        }
        c21594319fB3.setAdapter(new C437930HFf(getSupportFragmentManager(), this.LLIZ, this.LLILZLL));
        C19Y3 c19y35 = this.LLILLL;
        if (c19y35 == null) {
            c19y35 = null;
        }
        C21594319fB c21594319fB4 = this.LLILZ;
        if (c21594319fB4 == null) {
            c21594319fB4 = null;
        }
        c19y35.setupWithViewPager(c21594319fB4);
        int size = this.LLILZLL.size();
        for (int i3 = 0; i3 < size; i3++) {
            C19Y3 c19y36 = this.LLILLL;
            if (c19y36 == null) {
                c19y36 = null;
            }
            C19Y5 c19y5LJIIIZ = c19y36.LJIIIZ(i3);
            if (c19y5LJIIIZ != null && (view = c19y5LJIIIZ.LJFF) != null) {
                C786410Ut5.I7(new ACListenerS53S0201000_29(this, i3, c19y5LJIIIZ, 0), view);
            }
        }
        C21594319fB c21594319fB5 = this.LLILZ;
        if (c21594319fB5 != null) {
            c21594319fB = c21594319fB5;
        }
        c21594319fB.addOnPageChangeListener(new C19774712Yn(this, 5));
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("creation_id", this.LLJIJIL);
        C20684815ws.LJIILLIIL("show_credits_page", c0lab.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public static String LLLLZLL(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LLLLZLLIL(int i, String str, String str2) {
        String str3;
        String str4;
        switch (i) {
            case 8:
                str3 = "sound";
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                str3 = "liked";
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                str3 = "favorites";
                break;
            default:
                str3 = "posted";
                break;
        }
        if (Intrinsics.LJFF(str, "click_panel")) {
            str4 = "dot";
        } else if (Intrinsics.LJFF(str, "click_preview")) {
            str4 = "confirm";
        } else {
            str4 = "";
        }
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
        if (videoPublishEditModel != null) {
            C580270MpN.LIZJ(videoPublishEditModel, c0lab, this.LL);
            c0lab.LJ("tab_name", str3);
            c0lab.LJ("enter_method", str4);
            c0lab.LJ("to_item_id", str2);
            C20684815ws.LJIILLIIL("add_credit_video", c0lab.LIZ);
        }
    }
}
