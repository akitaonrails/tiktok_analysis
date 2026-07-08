package com.ss.android.ugc.aweme.music.search;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.C446760HfW;
import X.C786410Ut5;
import X.EnumC335920DEw;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchMusicActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5OiHELIOSYwZjYpKD0wIGsfLC4hKy0BPDw6KwQvPSYlITE1";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() throws Throwable {
        Activity activity;
        KeyboardUtils.LIZIZ(findViewById(R.id.hdh));
        Serializable serializableExtra = getIntent().getSerializableExtra("pinned_music_list");
        Intent intent = new Intent();
        intent.putExtra("pinned_music_list", serializableExtra);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOe9cJbNkiG5yF2dQ0aLHM2EEkNJ6pHqflVYwQtIXD2q", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {-1, intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/music/search/SearchMusicActivity", "setResult", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/music/search/SearchMusicActivity", "setResult", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                activity = obj != null ? (Activity) obj : this;
                Object obj2 = objArr2[1];
                iIntValue = obj2 != null ? ((Integer) obj2).intValue() : -1;
                Object obj3 = c0wsuLIZIZ.LIZJ[2];
                if (obj3 != null) {
                    intent = (Intent) obj3;
                }
            } else {
                activity = this;
            }
            activity.setResult(iIntValue, intent);
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/music/search/SearchMusicActivity", "setResult", null, objArr, activity, c0wzw, true);
        }
        super.finish();
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onCreate", true);
        activityConfiguration(AFwS236S0000000_6.get$arr$(236));
        super.onCreate(bundle);
        setContentView(R.layout.eb1);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        C446760HfW c446760HfW = SearchMusicFragment.LLIZ;
        Intent intent = getIntent();
        c446760HfW.getClass();
        SearchMusicFragment searchMusicFragment = new SearchMusicFragment();
        Bundle bundle2 = new Bundle();
        try {
            stringExtra = intent.getStringExtra("user_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        C786410Ut5.LJJJI("user_id", stringExtra, bundle2);
        try {
            stringExtra2 = intent.getStringExtra("sec_user_id");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            stringExtra2 = null;
        }
        C786410Ut5.LJJJI("sec_user_id", stringExtra2, bundle2);
        C786410Ut5.LJJIZ(bundle2, "pinned_music_list", intent.getSerializableExtra("pinned_music_list"));
        searchMusicFragment.setArguments(bundle2);
        c19ehLJIIJ.LJIJ(R.id.i_1, searchMusicFragment, null);
        c19ehLJIIJ.LJIIIZ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onCreate", false);
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
}
