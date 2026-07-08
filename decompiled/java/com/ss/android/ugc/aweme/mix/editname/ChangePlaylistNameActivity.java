package com.ss.android.ugc.aweme.mix.editname;

import X.AbstractActivityC446870Hfh;
import X.C0TYL;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class ChangePlaylistNameActivity extends AbstractActivityC446870Hfh {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglMWE2LCw4HELIOSJy4+LWsPIS49LyAcJS4qJCw/PQEyJSANKjs6Piw4MA==";
    public long LLILLL;
    public int LLILZ;
    public UrlModel LLILZLL;
    public String LL = "";
    public String LLILLJJLI = "";
    public String LLILZIL = "";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.AbstractActivityC446870Hfh
    public final Fragment LLLLLZL() {
        String stringExtra;
        String stringExtra2;
        Intent intent = getIntent();
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("user_last_name");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            String str = "";
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.LL = stringExtra;
            try {
                stringExtra2 = intent.getStringExtra("mix_id");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.LLILLJJLI = stringExtra2;
            this.LLILZ = intent.getIntExtra("mix_label", 0);
            this.LLILLL = intent.getLongExtra("moderated_rename_timestamp", 0L);
            try {
                String stringExtra3 = intent.getStringExtra("enter_from");
                if (stringExtra3 != null) {
                    str = stringExtra3;
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            this.LLILZIL = str;
            Serializable serializableExtra = intent.getSerializableExtra("key_playlist_cover");
            this.LLILZLL = serializableExtra instanceof UrlModel ? (UrlModel) serializableExtra : null;
        }
        C0TYL c0tyl = EditPlayListNameFragment.LLILZIL;
        String str2 = this.LL;
        String str3 = this.LLILLJJLI;
        int i = this.LLILZ;
        Long lValueOf = Long.valueOf(this.LLILLL);
        String str4 = this.LLILZIL;
        UrlModel urlModel = this.LLILZLL;
        c0tyl.getClass();
        return C0TYL.LIZ(2, str2, str3, i, null, lValueOf, str4, urlModel, null, null);
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

    @Override // X.AbstractActivityC446870Hfh, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onCreate", false);
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
