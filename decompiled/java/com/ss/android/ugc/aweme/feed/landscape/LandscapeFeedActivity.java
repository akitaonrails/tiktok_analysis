package com.ss.android.ugc.aweme.feed.landscape;

import X.AbstractC2173821A5s;
import X.C01GW;
import X.C0N6Z;
import X.C0QSJ;
import X.C0SXF;
import X.C0SZF;
import X.C0WZX;
import X.C1336100ksC;
import X.C1383760m74;
import X.C1440005kM;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C2531709w3;
import X.C452501pT;
import X.C666390QBx;
import X.C673150Qan;
import X.C687700QyG;
import X.C692740RFg;
import X.C713290RyR;
import X.C726580Sem;
import X.C726680Sew;
import X.C726690Sex;
import X.C726710Sez;
import X.C726720Sf0;
import X.C786410Ut5;
import X.EnumC726810Sf9;
import X.InterfaceC1146704e9;
import X.InterfaceC1399350mWD;
import X.InterfaceC655270Pn3;
import X.InterfaceC687730QyJ;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.scope.LandscapeFeedScope;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class LandscapeFeedActivity extends BaseActivity implements InterfaceC655270Pn3, C0SZF, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMpLCt9JCHELIOSQiLTwwKTUpZwMyJiE/Ki4jLQMpLCsSKzElPyYnMQ==";
    public Aweme LL;
    public boolean LLILZIL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final ArrayList<InterfaceC1399350mWD> LLILLJJLI = new ArrayList<>();
    public String LLILLL = "";
    public String LLILZ = "";
    public String LLILZLL = "click_landscape_exit";
    public final C726710Sez LLJ = new InterfaceC1399350mWD() { // from class: X.0Sez
        @Override // X.InterfaceC1399350mWD
        public final /* synthetic */ boolean Fi() {
            return false;
        }

        @Override // X.InterfaceC1399350mWD
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            C1399710mWn.LIZIZ.LIZ(Integer.valueOf(i), keyEvent, this.LL);
            return false;
        }
    };
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS557S0100000_13(this, 119));

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{LandscapeFeedScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LandscapeFeedScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LandscapeFeedScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final void LLLLZI() {
        if (Build.VERSION.SDK_INT < 30) {
            getWindow().getDecorView().setSystemUiVisibility(4871);
            return;
        }
        WindowInsetsController insetsController = getWindow().getInsetsController();
        if (insetsController != null) {
            insetsController.hide(WindowInsets.Type.systemBars());
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        C1383760m74.LIZIZ.LJIJJLI(getLifecycle(), EnumC726810Sf9.PORTRAIT);
        super.finish();
        boolean z = C692740RFg.LIZ;
        if (C692740RFg.LIZ) {
            if (C2204961BRm.LLILZIL(getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA0DPYwXqNyF6EYRO74yJrR3HThplqVjqBYSA0Tx8Log==", null)).getRotation() == 3) {
                C786410Ut5.he(this, R.anim.d6, R.anim.d8);
            } else {
                C786410Ut5.he(this, R.anim.d5, R.anim.d7);
            }
        }
        Aweme aweme = this.LL;
        C1440005kM.LIZ(new C726580Sem(aweme != null ? aweme.getAid() : null, this.LLILZLL, this.LLIZ, this.LLIZLLLIL));
        this.LLILZLL = "click_landscape_exit";
        this.LLIZ = 0;
        this.LLIZLLLIL = 0;
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        boolean z = C692740RFg.LIZ;
        if (C692740RFg.LIZ) {
            C726690Sex.LIZIZ.LJIIJJI(null);
        }
        super.onEnterAnimationComplete();
        boolean z2 = C2531709w3.LIZ;
        if (C2531709w3.LIZ) {
            setRequestedOrientation(6);
        } else {
            setRequestedOrientation(C2204961BRm.LLILZIL(getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA0DPYwXqNyF6EYRO74yJrR3HThplqVjqBYSA0Tx8Log==", null)).getRotation() == 1 ? 0 : 8);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        IMidAdCellAbility iMidAdCellAbility;
        HashMap<String, String> mobParams;
        User author;
        Video video;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "onResume", true);
        this.LLILLL = C726680Sew.LIZJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", C726680Sew.LIZJ);
        c2344009Gk.LJIIIIZZ("enter_method", this.LLILZ);
        Aweme aweme = this.LL;
        c2344009Gk.LJIIIIZZ("group_id", aweme != null ? aweme.getAid() : null);
        Aweme aweme2 = this.LL;
        c2344009Gk.LJ((aweme2 == null || (video = aweme2.getVideo()) == null) ? null : Integer.valueOf(video.getDuration()), "item_duration");
        Aweme aweme3 = this.LL;
        c2344009Gk.LJIIIIZZ("author_id", (aweme3 == null || (author = aweme3.getAuthor()) == null) ? null : author.getUid());
        Aweme aweme4 = this.LL;
        c2344009Gk.LJIIIIZZ("is_collection_item", (aweme4 == null || !aweme4.isPaidContent) ? CardStruct.IStatusCode.DEFAULT : "1");
        Intent intent = getIntent();
        Aweme aweme5 = this.LL;
        if (C713290RyR.LIZ) {
            c2344009Gk.LJ(intent != null ? Integer.valueOf(intent.getIntExtra("xy_orientation", 0)) : null, "rotate_angle_xy");
            c2344009Gk.LJ(intent != null ? Integer.valueOf(intent.getIntExtra("z_orientation", 0)) : null, "rotate_angle_z");
            c2344009Gk.LJFF("landscape_enter_method", intent != null ? C0SXF.LIZ(intent, "landscape_enter_method") : null);
            c2344009Gk.LJFF("set_method", intent != null ? C0SXF.LIZ(intent, "set_method") : null);
            c2344009Gk.LJFF("default_app_rotate_status", intent != null ? C0SXF.LIZ(intent, "default_app_rotate_status") : null);
            c2344009Gk.LJFF("phone_rotate_status", intent != null ? C0SXF.LIZ(intent, "phone_rotate_status") : null);
            c2344009Gk.LJFF("app_rotate_status", intent != null ? C0SXF.LIZ(intent, "app_rotate_status") : null);
            if (aweme5 == null || (mobParams = aweme5.getMobParams()) == null || !mobParams.containsKey("is_landscape_screen")) {
                c2344009Gk.LIZJ(C0SXF.LJJIII(this, aweme5), "is_landscape_screen");
            } else {
                HashMap<String, String> mobParams2 = aweme5.getMobParams();
                c2344009Gk.LJFF("is_landscape_screen", mobParams2 != null ? mobParams2.get("is_landscape_screen") : null);
            }
        }
        C20684815ws.LJIILLIIL("enter_landscape_screen_page", c2344009Gk.LIZ);
        LLLLZI();
        this.LLILZ = "auto";
        super.onResume();
        registerActivityOnKeyDownListener(this.LLJ);
        WeakReference<IMidAdCellAbility> weakReference = C0N6Z.LJIIIIZZ;
        if (weakReference != null && (iMidAdCellAbility = weakReference.get()) != null) {
            iMidAdCellAbility.Se0(true);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "onStart", true);
        super.onStart();
        if (Build.VERSION.SDK_INT >= 29 && this.LLILZIL) {
            ((AudioManager) this.LLJI.getValue()).setAllowedCapturePolicy(2);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "onStart", false);
    }

    public void LLLLLZL() {
        C2204961BRm.LLILZIL(getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA0DPYwXqNyF6EYRO74yJrR3HThplqVjqBYSA0Tx8Log==", null)).getRotation();
        getIntent().getIntExtra("orientation", 0);
        C786410Ut5.he(this, R.anim.d1, R.anim.d3);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C726690Sex.LIZIZ.LIZLLL();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        unRegisterActivityOnKeyDownListener(this.LLJ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        IMidAdCellAbility iMidAdCellAbility;
        super.onStop();
        C726690Sex.LIZIZ.LJII(null);
        if (Build.VERSION.SDK_INT >= 29 && this.LLILZIL) {
            ((AudioManager) this.LLJI.getValue()).setAllowedCapturePolicy(1);
        }
        WeakReference<IMidAdCellAbility> weakReference = C0N6Z.LJIIIIZZ;
        if (weakReference == null || (iMidAdCellAbility = weakReference.get()) == null) {
            return;
        }
        iMidAdCellAbility.Se0(false);
    }

    @Override // X.C0SZF
    public final Aweme LJJZZI() {
        return this.LL;
    }

    @Override // X.C0SZF
    public final String getEnterFrom() {
        return this.LLILLL;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C726720Sf0.LIZ = true;
            } else if (actionMasked == 1 || actionMasked == 3) {
                C726720Sf0.LIZ = false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "onCreate", true);
        C726690Sex.LIZIZ.LJIIIIZZ(null);
        getOnBackPressedDispatcher().LIZ(this, new AbstractC2173821A5s() { // from class: X.0Sey
            @Override // X.AbstractC2173821A5s
            public final void LIZIZ() {
                C726690Sex.LIZIZ.LIZJ(C2097908Jt.LIZJ(new Pair("exit_method", "gesture")));
                this.LIZLLL.finish();
            }

            {
                super(true);
            }
        });
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("block_screen_recording", false);
        this.LLILZIL = booleanExtra;
        if (booleanExtra) {
            C1336100ksC.LJFF(this);
        }
        boolean z = C692740RFg.LIZ;
        if (C692740RFg.LIZ) {
            LLLLLZL();
        }
        setContentView(R.layout.j5);
        this.LL = C666390QBx.LIZ;
        try {
            stringExtra = getIntent().getStringExtra("enter_method");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "unknown";
        }
        this.LLILZ = stringExtra;
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b88424", (String) null);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z) {
            LLLLZI();
        }
    }

    @Override // X.InterfaceC655270Pn3
    public final void registerActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        if (!this.LLILLJJLI.contains(interfaceC1399350mWD)) {
            for (InterfaceC1399350mWD interfaceC1399350mWD2 : this.LLILLJJLI) {
                if (Intrinsics.LJFF(interfaceC1399350mWD2.getClass(), interfaceC1399350mWD.getClass())) {
                    ArrayList<InterfaceC1399350mWD> arrayList = this.LLILLJJLI;
                    ListProtector.add(arrayList, arrayList.indexOf(interfaceC1399350mWD2), interfaceC1399350mWD);
                    return;
                }
            }
            this.LLILLJJLI.add(interfaceC1399350mWD);
        }
    }

    @Override // X.InterfaceC655270Pn3
    public final void unRegisterActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        this.LLILLJJLI.remove(interfaceC1399350mWD);
    }

    @Override // X.C0SZF
    public final void LJLLLLLL(int i, int i2) {
        this.LLILZLL = "rotate_screen";
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ArrayList<InterfaceC1399350mWD> arrayList = this.LLILLJJLI;
        if (arrayList != null) {
            Iterator<InterfaceC1399350mWD> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().onKeyDown(i, keyEvent)) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
