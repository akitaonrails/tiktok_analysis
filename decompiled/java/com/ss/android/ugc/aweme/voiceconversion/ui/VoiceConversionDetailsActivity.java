package com.ss.android.ugc.aweme.voiceconversion.ui;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1394930mP5;
import X.C1619690sFb;
import X.C1697810uHb;
import X.C19EH;
import X.C20684815ws;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1399350mWD;
import X.InterfaceC1581830rGX;
import X.InterfaceC655270Pn3;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class VoiceConversionDetailsActivity extends BaseActivity implements InterfaceC655270Pn3, InterfaceC1581830rGX {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMjICw2KyoiPyohOyHELIOSwjJ2EmIWsaJiYwLQYjJzk2OjYlJiEXLTEtICMgCSY4IDk6PDw=";
    public long LL;
    public final ArrayList<InterfaceC1399350mWD> LLILLJJLI = new ArrayList<>();

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        return "vc_page";
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.voiceconversion.ui.VoiceConversionDetailsActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.voiceconversion.ui.VoiceConversionDetailsActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.voiceconversion.ui.VoiceConversionDetailsActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.voiceconversion.ui.VoiceConversionDetailsActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.voiceconversion.ui.VoiceConversionDetailsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        C1619690sFb.LIZ(this, null);
    }

    public final void init() throws Throwable {
        this.LL = System.currentTimeMillis();
        String strLLLLLZL = LLLLLZL(getIntent(), "anchor_id");
        Serializable serializableExtra = getIntent().getSerializableExtra("music_model");
        if (!(serializableExtra instanceof Music)) {
            serializableExtra = null;
        }
        String strLLLLLZL2 = LLLLLZL(getIntent(), "audio_tool_origin_from");
        C1394930mP5 c1394930mP5 = VoiceConversionDetailsFragment.LLJJJIL;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        c1394930mP5.getClass();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("anchor_id", strLLLLLZL, bundle);
        C786410Ut5.LJJIZ(bundle, "music_model", serializableExtra);
        C786410Ut5.LJJJI("audio_tool_origin_from", strLLLLLZL2, bundle);
        VoiceConversionDetailsFragment voiceConversionDetailsFragment = new VoiceConversionDetailsFragment();
        voiceConversionDetailsFragment.setUserVisibleHint(true);
        voiceConversionDetailsFragment.setArguments(bundle);
        C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.eqx, voiceConversionDetailsFragment, "voice_conversion_detail_fragment_tag");
        c19ehLJIIJ.LJIIIZ();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("anchor_type", LLLLLZL(getIntent(), "anchor_type"));
        c2344009Gk.LJFF("anchor_id", LLLLLZL(getIntent(), "anchor_id"));
        c2344009Gk.LJFF("anchor_name", LLLLLZL(getIntent(), "anchor_name"));
        c2344009Gk.LJFF("main_anchor_type", LLLLLZL(getIntent(), "main_anchor_type"));
        c2344009Gk.LJFF("main_anchor_id", LLLLLZL(getIntent(), "main_anchor_id"));
        c2344009Gk.LJFF("main_anchor_name", LLLLLZL(getIntent(), "main_anchor_name"));
        c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LL, "duration");
        c2344009Gk.LJFF("enter_from", LLLLLZL(getIntent(), "enter_from"));
        c2344009Gk.LJFF("author_id", LLLLLZL(getIntent(), "author_id"));
        c2344009Gk.LJFF("group_id", LLLLLZL(getIntent(), "group_id"));
        c2344009Gk.LJFF("audio_tool_origin_from", LLLLLZL(getIntent(), "audio_tool_origin_from"));
        C20684815ws.LJIILLIIL("multi_anchor_stay_time", c2344009Gk.LIZ);
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
    public final void onCreate(Bundle bundle) throws Throwable {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.voiceconversion.ui.VoiceConversionDetailsActivity", "onCreate", true);
        activityConfiguration(AFwS259S0000000_21.get$arr$(284));
        super.onCreate(bundle);
        setContentView(R.layout.d_r);
        findViewById(R.id.eqx).setFitsSystemWindows(false);
        init();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.voiceconversion.ui.VoiceConversionDetailsActivity", "onCreate", false);
    }

    @Override // X.InterfaceC655270Pn3
    public final void registerActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        ArrayList<InterfaceC1399350mWD> arrayList = this.LLILLJJLI;
        if (!arrayList.contains(interfaceC1399350mWD)) {
            arrayList.add(interfaceC1399350mWD);
        }
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

    @Override // X.InterfaceC655270Pn3
    public final void unRegisterActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        this.LLILLJJLI.remove(interfaceC1399350mWD);
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
        Iterator<InterfaceC1399350mWD> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            if (it2.next().onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        Activity activity;
        Intent intent2;
        super.onActivityResult(i, i2, intent);
        int iIntValue = -1;
        if (i2 == -1) {
            C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPynapzL3z3zGCm58q0Z2JrG2sJZIWuVMBfBGg1iFCrvVi1Qm4LABztUH/CK4uI+f94=", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = {-1, intent};
            C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/voiceconversion/ui/VoiceConversionDetailsActivity", "setResult", this, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(11071, "com/ss/android/ugc/aweme/voiceconversion/ui/VoiceConversionDetailsActivity", "setResult", null, objArr, this, c0wzw, false);
            } else {
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                if (objArr2 != null) {
                    Object obj = objArr2[0];
                    if (obj != null) {
                        activity = (Activity) obj;
                    } else {
                        activity = this;
                    }
                    Object obj2 = objArr2[1];
                    if (obj2 != null) {
                        iIntValue = ((Integer) obj2).intValue();
                    }
                    Object obj3 = c0wsuLIZIZ.LIZJ[2];
                    if (obj3 != null) {
                        intent2 = (Intent) obj3;
                    } else {
                        intent2 = intent;
                    }
                } else {
                    activity = this;
                    intent2 = intent;
                }
                activity.setResult(iIntValue, intent2);
                c0wst.LIZ(11071, "com/ss/android/ugc/aweme/voiceconversion/ui/VoiceConversionDetailsActivity", "setResult", null, objArr, activity, c0wzw, true);
            }
            finish();
            try {
                C1389600mGU.LIZIZ(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            overridePendingTransition(0, 0);
        }
    }
}
