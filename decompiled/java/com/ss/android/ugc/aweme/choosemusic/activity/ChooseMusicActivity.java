package com.ss.android.ugc.aweme.choosemusic.activity;

import X.C0WZX;
import X.C11BY;
import X.C1308910kAL;
import X.C1457560o26;
import X.C15IK;
import X.C1697810uHb;
import X.C1911760zqg;
import X.C2204961BRm;
import X.C299020Bno;
import X.C335910DEv;
import X.C665290Q7r;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC744180THc;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* JADX INFO: loaded from: classes32.dex */
public class ChooseMusicActivity extends BaseActivity implements InterfaceC744180THc {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkJiAgLSg5HELIOSOiYwZiQvPSYlITE1Zww7Jyo/LAImOywvCCwnITMlPTY=";
    public TuxTextView LL;
    public RelativeLayout LLILLJJLI;
    public TextView LLILLL;
    public RelativeLayout LLILZ;
    public TextView LLILZIL;
    public ViewPagerBottomSheetBehavior LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final IAVPerformance LLJI = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance();
    public C1911760zqg LLJIJIL;

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (C665290Q7r.LIZ(this, null)) {
            return;
        }
        LLLLZLL();
        super.onBackPressed();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onResume", true);
        super.onResume();
        if (this.LLIZ == 2) {
            C15IK.LJIJI("video_shoot_page");
        } else {
            C15IK.LJIJI("video_edit_page");
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        boolean zLJI = MethodIDManager.LJI(71649);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onStart", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("music_homepage");
        return analysis;
    }

    public final void LLLLZI() {
        this.LLILLL = (TextView) findViewById(R.id.tv_right_title);
        this.LLILZIL = (TextView) findViewById(R.id.epw);
        C786410Ut5.LLIL(this.LLILLL, 8);
        C786410Ut5.LLIL(this.LLILZIL, 8);
    }

    public final boolean LLLLZIL() {
        if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ() && !this.LLIZLLLIL) {
            C1911760zqg c1911760zqg = this.LLJIJIL;
            if (c1911760zqg.LJIIJJI.getVisibility() == 8 && c1911760zqg.LJIIL.getVisibility() == 8) {
                return true;
            }
        }
        return false;
    }

    public final void LLLLZLL() {
        if (((ChooseMusicWithSceneViewModel) ViewModelProviders.of(this).get(ChooseMusicWithSceneViewModel.class)).LLILLJJLI) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().setCurMusic(null, 0);
            Intent intent = new Intent();
            intent.putExtra("is_cancel_current_choose_music", true);
            C2204961BRm.LLLZLZ(this, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f32VZgoubI+dRaALZy6/SqYb8Ov4YbuIao7GXzeo=", null));
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        KeyboardUtils.LIZIZ(this.LL);
        C786410Ut5.fe(this, 0, R.anim.ao);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        MusicModel musicModel;
        Mission mission = ((ChooseMusicWithSceneViewModel) ViewModelProviders.of(this).get(ChooseMusicWithSceneViewModel.class)).LLILZ;
        String musicId = mission != null ? mission.getMusicId() : null;
        BaseChooseMusicFragment baseChooseMusicFragment = (BaseChooseMusicFragment) getSupportFragmentManager().LJJJJZ(R.id.iiv);
        String strValueOf = (baseChooseMusicFragment == null || (musicModel = baseChooseMusicFragment.LLJJIII) == null) ? null : String.valueOf(musicModel.getId());
        if (!TextUtils.isEmpty(musicId) && !TextUtils.equals(strValueOf, musicId)) {
            new C11BY().LJIILLIIL(((ChooseMusicWithSceneViewModel) ViewModelProviders.of(this).get(ChooseMusicWithSceneViewModel.class)).LLILZ, 1);
            ((ChooseMusicWithSceneViewModel) ViewModelProviders.of(this).get(ChooseMusicWithSceneViewModel.class)).LLILZ = null;
        }
        super.onDestroy();
        this.LLJI.leave(this, "music_select");
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        this.LLJI.end(OpenMusicPanelPerformanceMonitor.INSTANCE, "animation_finished");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.LLJI.pause(this, "music_select", LLLLLZL(getIntent(), "creation_id"), LLLLLZL(getIntent(), "shoot_way"));
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x028e  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r47) {
        /*
            Method dump skipped, instruction units count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity.onCreate(android.os.Bundle):void");
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

    public static String LLLLLZL(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        if (i == 24 || i == 25) {
            C1457560o26.LIZIZ(this.LLIZ, i, "music_choose_page");
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            C2204961BRm.LLLZLZ(this, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f32VZgoubI+dRaALZy6/SqYb8Ov4YbuIao7GXzeo=", null));
            finish();
        }
        Iterator<Fragment> it2 = getSupportFragmentManager().LJJLIIIJL().iterator();
        while (it2.hasNext()) {
            it2.next().onActivityResult(i, i2, intent);
        }
    }
}
