package com.ss.android.ugc.aweme.shortvideo.mentionvideo;

import X.ActivityC214874197g;
import X.C1192870h9B;
import X.C1202330hOR;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1428470nHB;
import X.C1430420nKK;
import X.C14K9;
import X.C1697810uHb;
import X.C1846060y8i;
import X.C19774712Yn;
import X.C19775312Yt;
import X.C21594319fB;
import X.C297750Bll;
import X.C299020Bno;
import X.C335910DEv;
import X.C437930HFf;
import X.C737450SwJ;
import X.C786410Ut5;
import X.EnumC335920DEw;
import Y.ACListenerS163S0100000_29;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import joo.f;

/* JADX INFO: loaded from: classes30.dex */
public final class MentionUserVideoActivity extends ActivityC214874197g {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCB9JSHELIOSAiPSY8JjMlLSo8ZggpJzs6JysZOiohHiwoLCASKzElPyYnMQ==";
    public C1846060y8i LL;
    public C21594319fB LLILLJJLI;
    public VideoPublishEditModel LLIZLLLIL;
    public final ArrayList<String> LLILLL = new ArrayList<>();
    public final ArrayList<Fragment> LLILZ = new ArrayList<>();
    public String LLILZIL = "";
    public String LLILZLL = "";
    public String LLIZ = "";
    public String LLJ = "";
    public String LLJI = "";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionUserVideoActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionUserVideoActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionUserVideoActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionUserVideoActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionUserVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC214874197g
    public final C1202330hOR LLLLLZL() {
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LIZJ;
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
        return this.LLJI;
    }

    @Override // X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionUserVideoActivity", "onCreate", true);
        super.onCreate(bundle);
        f fVar = f.LIZ;
        Intent intent = getIntent();
        fVar.getClass();
        f.LIZJ(this, intent, bundle);
        setContentView(R.layout.jb);
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
        this.LLIZLLLIL = C1430420nKK.LIZIZ(getIntent());
        String strLLLLZLL = LLLLZLL(getIntent(), "enter_from");
        String str = "";
        if (strLLLLZLL == null) {
            strLLLLZLL = "";
        }
        this.LLJ = strLLLLZLL;
        String strLLLLZLL2 = LLLLZLL(getIntent(), "creation_id");
        if (strLLLLZLL2 != null) {
            str = strLLLLZLL2;
        }
        this.LLJI = str;
        this.LLILZIL = LLLLZLL(getIntent(), "music_id");
        this.LLILZLL = LLLLZLL(getIntent(), "music_title");
        this.LLIZ = LLLLZLL(getIntent(), "music_author");
        ImageView imageView = (ImageView) findViewById(R.id.e1r);
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.Q7(imageView, new ACListenerS163S0100000_29(this, 79));
        this.LL = (C1846060y8i) findViewById(R.id.video_list_tab);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, this);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            C1846060y8i c1846060y8i = this.LL;
            if (c1846060y8i == null) {
                c1846060y8i = null;
            }
            c1846060y8i.setBackgroundColor(iIntValue);
        }
        C21594319fB c21594319fB = (C21594319fB) findViewById(R.id.video_list_viewpager);
        this.LLILLJJLI = c21594319fB;
        if (c21594319fB == null) {
            c21594319fB = null;
        }
        c21594319fB.setOffscreenPageLimit(3);
        if (C297750Bll.LIZ()) {
            ((TextView) findViewById(R.id.nx3)).setText(getString(2131844976));
        }
        ArrayList<String> arrayList = this.LLILLL;
        if (C297750Bll.LIZ()) {
            i3 = 2131848268;
        } else {
            i3 = 2131848267;
        }
        arrayList.add(getString(i3));
        this.LLILZ.add(C737450SwJ.LIZIZ.LJII().LIZIZ());
        arrayList.add(getString(2131849611));
        ArrayList<Fragment> arrayList2 = this.LLILZ;
        String str2 = MentionVideoFragment._pnsPageId;
        String str3 = this.LLJI;
        String str4 = this.LLILZIL;
        String str5 = this.LLILZLL;
        String str6 = this.LLIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLIZLLLIL;
        if (videoPublishEditModel == null) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionUserVideoActivity", "onCreate", false);
            return;
        }
        String str7 = this.LLJ;
        MentionVideoFragment mentionVideoFragment = new MentionVideoFragment();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("creation_id", str3, bundle2);
        C786410Ut5.LJJJI("music_id", str4, bundle2);
        C786410Ut5.LJJJI("music_title", str5, bundle2);
        C786410Ut5.LJJJI("music_author", str6, bundle2);
        C786410Ut5.LJJJI("enter_from", str7, bundle2);
        bundle2.putBoolean("need_title_bar", false);
        C1428470nHB.LLIL(bundle2, videoPublishEditModel);
        mentionVideoFragment.setArguments(bundle2);
        arrayList2.add(mentionVideoFragment);
        C21594319fB c21594319fB2 = this.LLILLJJLI;
        if (c21594319fB2 == null) {
            c21594319fB2 = null;
        }
        c21594319fB2.setAdapter(new C437930HFf(getSupportFragmentManager(), this.LLILZ, this.LLILLL));
        C1846060y8i c1846060y8i2 = this.LL;
        if (c1846060y8i2 == null) {
            c1846060y8i2 = null;
        }
        C21594319fB c21594319fB3 = this.LLILLJJLI;
        if (c21594319fB3 == null) {
            c21594319fB3 = null;
        }
        C1846060y8i.LJIJI(c1846060y8i2, c21594319fB3);
        C21594319fB c21594319fB4 = this.LLILLJJLI;
        if (c21594319fB4 == null) {
            c21594319fB4 = null;
        }
        c21594319fB4.addOnPageChangeListener(new C19774712Yn(this, 4));
        if (Build.VERSION.SDK_INT >= 35) {
            View viewFindViewById = findViewById(R.id.trr);
            C14K9.LJIJJ(viewFindViewById, new C19775312Yt(viewFindViewById, 0));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionUserVideoActivity", "onCreate", false);
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
}
