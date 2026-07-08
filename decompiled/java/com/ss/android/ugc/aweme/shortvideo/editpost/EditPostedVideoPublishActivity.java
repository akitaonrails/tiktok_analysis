package com.ss.android.ugc.aweme.shortvideo.editpost;

import X.AbstractC214814194y;
import X.ActivityC214874197g;
import X.C01GW;
import X.C08RR;
import X.C0CHQ;
import X.C0TVI;
import X.C0WIY;
import X.C1192870h9B;
import X.C1202330hOR;
import X.C1308910kAL;
import X.C1416310mxZ;
import X.C1428470nHB;
import X.C1429320nIY;
import X.C1445410niV;
import X.C14K9;
import X.C1697810uHb;
import X.C197039127h;
import X.C197R;
import X.C19AK;
import X.C19AL;
import X.C19C8;
import X.C19EH;
import X.C201955140j;
import X.C214936199q;
import X.C2188811AlT;
import X.C2350509Ix;
import X.C293940Bfc;
import X.C299020Bno;
import X.C335910DEv;
import X.C418440Gaw;
import X.C568750MSj;
import X.C786410Ut5;
import X.C814420VxA;
import X.C857760Xks;
import X.EnumC335920DEw;
import X.InterfaceC19394510uF;
import X.InterfaceC214877197j;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import Y.ACListenerS149S0100000_14;
import Y.AObserverS234S0100000_32;
import Y.ARunnableS132S0100000_32;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.adaptation.PublishPreviewScene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandTextViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS98S0100000_32;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import joo.f;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes33.dex */
public final class EditPostedVideoPublishActivity extends ActivityC214874197g implements InterfaceC524950KiL {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCB9LSHELIOSElPT88OzFiDCs6PBUjOjs2LBMlLSo8GDAuJSYgIAQvPSYlITE1";
    public TextView LL;
    public TextView LLILLJJLI;
    public C197039127h LLILLL;
    public TextView LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public NavigationScene LLIZ;
    public C1445410niV LLIZLLLIL;
    public SceneWrapperFragment LLJ;
    public FrameLayout LLJI;
    public PublishPreviewScene LLJIJIL;
    public C19C8 LLJILJILJ;
    public VideoPublishEditModel LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public final C197R LLJILJIL = C197R.LL;
    public final List<InterfaceC484050IyZ> LLJJIII = new ArrayList();
    public final List<InterfaceC362610EJn> LLJJIJI = new ArrayList();
    public final C01GW LLJJIJIIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS278S0000000_32.get$arr$(94), "source_btm_token", Void.class);

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onResume", true);
        super.onResume();
        C19C8 c19c8 = this.LLJILJILJ;
        if (c19c8 != null) {
            c19c8.LIZLLL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onStart", true);
        super.onStart();
        C19C8 c19c8 = this.LLJILJILJ;
        if (c19c8 != null) {
            c19c8.LJFF();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC214874197g
    public final C1202330hOR LLLLLZL() {
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LIZJ;
    }

    public final void LLLLZLLIL() {
        CreativeModel creativeModel;
        VideoPublishEditModel videoPublishEditModel = this.LLJILLL;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && C1428470nHB.LJJZZI(videoPublishEditModel)) {
            if (C1429320nIY.LJFF(this.LLJILLL, null)) {
                creativeModel.imageEditModel.isEditPostEnterImage = true;
            }
            C1445410niV c1445410niV = this.LLIZLLLIL;
            if (c1445410niV != null) {
                VideoPublishEditModel videoPublishEditModel2 = c1445410niV.LLJLLL;
                if (videoPublishEditModel2 != null) {
                    videoPublishEditModel2.creativeModel = creativeModel;
                }
                View view = c1445410niV.LLJIJIL;
                HandlerHook.viewPost(view != null ? view : null, new ARunnableS132S0100000_32(c1445410niV, 92));
                c1445410niV.LLLLLJLJLL();
            }
        }
        this.LLJJI = false;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        List<C0WIY<Class<?>, IAVPublishExtension<?>>> list;
        super.onBackPressed();
        C1445410niV c1445410niV = this.LLIZLLLIL;
        if (c1445410niV == null || (list = c1445410niV.LLLIILIL) == null) {
            return;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            IAVPublishExtension iAVPublishExtension = (IAVPublishExtension) ((C0WIY) it2.next()).LIZIZ;
            if (iAVPublishExtension != null) {
                VideoPublishEditModel videoPublishEditModel = c1445410niV.LLJLLL;
                if (videoPublishEditModel == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                iAVPublishExtension.onBackPressed(C1416310mxZ.LJJLIIIJL(videoPublishEditModel));
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C19C8 c19c8 = this.LLJILJILJ;
        if (c19c8 != null) {
            c19c8.LJII();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        C19C8 c19c8 = this.LLJILJILJ;
        if (c19c8 != null) {
            c19c8.LIZJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        C19C8 c19c8 = this.LLJILJILJ;
        if (c19c8 != null) {
            c19c8.LJI();
        }
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
    }

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
        ListProtector.add(this.LLJJIJI, 0, interfaceC362610EJn);
    }

    public final void LLLLZLLLI(boolean z) {
        View view = null;
        if (z) {
            TextView textView = this.LL;
            if (textView == null) {
                textView = null;
            }
            C786410Ut5.LLIL(textView, 8);
            TextView textView2 = this.LLILLJJLI;
            if (textView2 == null) {
                textView2 = null;
            }
            C786410Ut5.LLIL(textView2, 0);
            C197039127h c197039127h = this.LLILLL;
            if (c197039127h == null) {
                c197039127h = null;
            }
            C786410Ut5.LLLLLLJ(c197039127h, 8);
            View view2 = this.LLILZIL;
            if (view2 != null) {
                view = view2;
            }
            C786410Ut5.LJLLLLLL(8, view);
            return;
        }
        TextView textView3 = this.LL;
        if (textView3 == null) {
            textView3 = null;
        }
        C786410Ut5.LLIL(textView3, 0);
        TextView textView4 = this.LLILLJJLI;
        if (textView4 == null) {
            textView4 = null;
        }
        C786410Ut5.LLIL(textView4, 8);
        C197039127h c197039127h2 = this.LLILLL;
        if (c197039127h2 == null) {
            c197039127h2 = null;
        }
        C786410Ut5.LLLLLLJ(c197039127h2, 8);
        View view3 = this.LLILZIL;
        if (view3 != null) {
            view = view3;
        }
        C786410Ut5.LJLLLLLL(0, view);
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLJJIII).add(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLJJIII).remove(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        ((ArrayList) this.LLJJIJI).remove(interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        ((ArrayList) this.LLJJIJI).add(interfaceC362610EJn);
    }

    @Override // X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        String message;
        VideoPublishEditModel videoPublishEditModel;
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onCreate", true);
        try {
            super.onCreate(bundle);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (bundle != null && (e instanceof RuntimeException) && (message = e.getMessage()) != null && a0.LJJIIZI(message, "Unmarshalling unknown type code", false)) {
                try {
                    C08RR.LIZ(bundle);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("tryFixViewStateRestoreCrash failed, reason: ");
                    sbLIZ.append(Log.getStackTraceString(e2));
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
                try {
                    Reflect.on(getSupportFragmentManager()).call("dispatchCreate");
                    C201955140j.LIZIZ("EditPostedVideoPublishActivity", "view state restore crash fixed");
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("tryRedispatchActivityCreate failed, reason: ");
                    sbLIZ2.append(Log.getStackTraceString(e3));
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onCreate", false);
                    throw e;
                }
            }
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onCreate", false);
            throw e;
        }
        setContentView(R.layout.iv);
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(findViewById(R.id.trr), new C0TVI() { // from class: X.0DKu
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), c20246014Ju.LIZ(2).LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        getWindow().addFlags(128);
        this.LLJI = (FrameLayout) findViewById(R.id.y9j);
        TextView textView = (TextView) findViewById(R.id.gr3);
        this.LL = textView;
        SceneWrapperFragment sceneWrapperFragment = null;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.T7(textView, new ACListenerS149S0100000_14(this, 72));
        TextView textView2 = (TextView) findViewById(R.id.gr4);
        this.LLILLJJLI = textView2;
        if (textView2 == null) {
            textView2 = null;
        }
        C786410Ut5.T7(textView2, new ACListenerS149S0100000_14(this, 73));
        C197039127h c197039127h = (C197039127h) findViewById(R.id.ycy);
        C786410Ut5.I7(new AkS98S0100000_32(this, 16), c197039127h);
        this.LLILLL = c197039127h;
        TextView textView3 = (TextView) findViewById(R.id.gr2);
        C786410Ut5.I7(new AkS98S0100000_32(this, 17), textView3);
        this.LLILZ = textView3;
        this.LLILZIL = findViewById(R.id.gr5);
        this.LLILZLL = findViewById(R.id.y08);
        ((ExpandTextViewModel) ViewModelProviders.of(this).get(ExpandTextViewModel.class)).LLIZ.observe(this, new AObserverS234S0100000_32(this, 39));
        this.LLJ = new SceneWrapperFragment();
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        SceneWrapperFragment sceneWrapperFragment2 = this.LLJ;
        if (sceneWrapperFragment2 == null) {
            sceneWrapperFragment2 = null;
        }
        c19ehLJIIJ.LIZIZ(R.id.iiv, sceneWrapperFragment2);
        c19ehLJIIJ.LJIIJJI();
        Intent intent = getIntent();
        Serializable serializableExtra = intent.getSerializableExtra("args");
        if (serializableExtra instanceof VideoPublishEditModel) {
            videoPublishEditModel = (VideoPublishEditModel) serializableExtra;
        } else {
            videoPublishEditModel = null;
        }
        this.LLJILLL = videoPublishEditModel;
        this.LLJJ = intent.getBooleanExtra("enter_from_inbox", false);
        this.LLJJI = intent.getBooleanExtra("force_refresh", false);
        VideoPublishEditModel videoPublishEditModel2 = this.LLJILLL;
        if (videoPublishEditModel2 == null) {
            C0CHQ.LIZ().getPublishService().LJJ();
            C857760Xks.LIZ("edit post page model is null");
            super.finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onCreate", false);
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("creative_model");
        if (parcelableExtra != null) {
            videoPublishEditModel2.creativeModel = (CreativeModel) parcelableExtra;
            VideoPublishEditModel videoPublishEditModel3 = this.LLJILLL;
            if (videoPublishEditModel3 != null) {
                videoPublishEditModel3.refreshOldFieldIfNeeded();
                VideoPublishEditModel videoPublishEditModel4 = this.LLJILLL;
                if (videoPublishEditModel4 != null) {
                    C1428470nHB.LJJZZI(videoPublishEditModel4);
                    View view = this.LLILZLL;
                    if (view == null) {
                        view = null;
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                    View view2 = this.LLILZLL;
                    if (view2 == null) {
                        view2 = null;
                    }
                    C786410Ut5.W5(view2, layoutParams);
                    C786410Ut5.LJLLLLLL(8, findViewById(R.id.shb));
                    C214936199q c214936199q = new C214936199q((Bundle) null, C1445410niV.class);
                    c214936199q.LIZJ = false;
                    c214936199q.LIZLLL = false;
                    c214936199q.LJ = 0;
                    c214936199q.LJIIZILJ = C293940Bfc.LIZ();
                    Bundle bundle2 = new Bundle();
                    C1428470nHB.LLIL(bundle2, this.LLJILLL);
                    bundle2.putInt("music_rec_type", getIntent().getIntExtra("music_rec_type", -1));
                    bundle2.putInt("extra_stick_point_type", getIntent().getIntExtra("extra_stick_point_type", 0));
                    bundle2.putBoolean("edit_publish_session_end_together", getIntent().getBooleanExtra("edit_publish_session_end_together", false));
                    if (getIntent().getBooleanExtra("review_video_fast_publish", false)) {
                        bundle2.putBoolean("review_video_fast_publish", true);
                    }
                    try {
                        stringExtra = getIntent().getStringExtra("wording");
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        stringExtra = null;
                    }
                    C786410Ut5.LJJJI("wording", stringExtra, bundle2);
                    C1445410niV c1445410niV = new C1445410niV(this.LLJJ);
                    this.LLIZLLLIL = c1445410niV;
                    SceneWrapperFragment sceneWrapperFragment3 = this.LLJ;
                    if (sceneWrapperFragment3 != null) {
                        sceneWrapperFragment = sceneWrapperFragment3;
                    }
                    sceneWrapperFragment.LL = c1445410niV;
                    NavigationScene navigationScene = (NavigationScene) C2350509Ix.LIZ(c214936199q.LIZ(), NavigationScene.class);
                    this.LLIZ = navigationScene;
                    C1445410niV c1445410niV2 = this.LLIZLLLIL;
                    if (c1445410niV2 != null) {
                        c1445410niV2.mArguments = bundle2;
                    }
                    navigationScene.LLJIJIL = new InterfaceC214877197j() { // from class: X.197B
                        @Override // X.InterfaceC214877197j
                        public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle3) {
                            return this.LIZ.LLIZLLLIL;
                        }
                    };
                    C19C8 c19c8 = new C19C8(new C19AK(R.id.u0v, new InterfaceC19394510uF(this) { // from class: X.10uD
                        public final Activity LIZ;

                        {
                            this.LIZ = this;
                        }

                        @Override // X.InterfaceC19394510uF
                        public final <T extends View> T LIZ(int i) {
                            T t = (T) this.LIZ.findViewById(i);
                            if (t != null) {
                                return t;
                            }
                            try {
                                String resourceName = this.LIZ.getResources().getResourceName(i);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(' ');
                                sbLIZ3.append(resourceName);
                                sbLIZ3.append(" view not found");
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
                            } catch (Resources.NotFoundException e5) {
                                TryCatchGuardChecker.doCheck(e5);
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append(' ');
                                sbLIZ4.append(i);
                                sbLIZ4.append(" view not found");
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
                            }
                        }
                    }, navigationScene, this.LLJILJIL, true));
                    this.LLJILJILJ = c19c8;
                    c19c8.LIZIZ(this, bundle);
                    TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, ImmersionBar.LJIILJJIL(this));
                    tuxImmersionBar.LJIIIIZZ(R.attr.bx);
                    tuxImmersionBar.LJ(R.attr.bx);
                    tuxImmersionBar.LIZ(true);
                    tuxImmersionBar.LIZLLL();
                    if (this.LLJJI) {
                        LLLLZLLIL();
                    }
                    BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b84793", (String) ((Void) this.LLJJIJIIJIL.getValue()));
                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onCreate", false);
                    return;
                }
                "Required value was null.".toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required value was null.");
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onCreate", false);
                throw illegalArgumentException;
            }
            "Required value was null.".toString();
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Required value was null.");
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onCreate", false);
            throw illegalArgumentException2;
        }
        "Required value was null.".toString();
        IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Required value was null.");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onCreate", false);
        throw illegalArgumentException3;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        VideoPublishEditModel videoPublishEditModel;
        super.onNewIntent(intent);
        if (!C568750MSj.LIZIZ(this.LLJILLL)) {
            return;
        }
        f.LIZ.getClass();
        f.LIZLLL(intent);
        boolean booleanExtra = intent.getBooleanExtra("force_refresh", false);
        this.LLJJI = booleanExtra;
        if (booleanExtra) {
            Serializable serializableExtra = intent.getSerializableExtra("args");
            if (serializableExtra instanceof VideoPublishEditModel) {
                videoPublishEditModel = (VideoPublishEditModel) serializableExtra;
            } else {
                videoPublishEditModel = null;
            }
            boolean booleanExtra2 = intent.getBooleanExtra("save_result", false);
            if (videoPublishEditModel != null) {
                this.LLJILLL = videoPublishEditModel;
                CreativeModel creativeModel = (CreativeModel) intent.getParcelableExtra("creative_model");
                if (creativeModel != null) {
                    videoPublishEditModel.creativeModel = creativeModel;
                }
                getIntent().putExtra("args", (Serializable) videoPublishEditModel);
            }
            if (!booleanExtra2) {
                C0CHQ.LIZ().getPublishService().LJJ();
                C857760Xks.LIZ("edit post page model newIntent is null");
            } else {
                this.LLJJ = intent.getBooleanExtra("enter_from_inbox", false);
                VideoPublishEditModel videoPublishEditModel2 = this.LLJILLL;
                if (videoPublishEditModel2 != null) {
                    videoPublishEditModel2.refreshOldFieldIfNeeded();
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            LLLLZLLIL();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C19C8 c19c8 = this.LLJILJILJ;
        if (c19c8 != null) {
            c19c8.LJ(bundle);
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

    public final void LLLLZLL(Scene scene, C19AL c19al) {
        NavigationScene navigationScene = this.LLIZ;
        if (navigationScene != null) {
            navigationScene.LLLLLLLLLL(scene, c19al);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator it2 = ((ArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC362610EJn) it2.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        if (i == 4) {
            System.currentTimeMillis();
            NavigationScene navigationScene = this.LLIZ;
            if (navigationScene != null && navigationScene.LLLLLJIL(null)) {
                return true;
            }
            super.finish();
            C201955140j.LIZIZ("EditPostedVideoPublishActivity", "system back event");
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        AbstractC214814194y abstractC214814194y;
        Iterator it2 = ((ArrayList) this.LLJJIII).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC484050IyZ) it2.next()).onActivityResult(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
        SceneWrapperFragment sceneWrapperFragment = this.LLJ;
        Scene sceneLLLLIIIILLL = null;
        if (sceneWrapperFragment == null) {
            sceneWrapperFragment = null;
        }
        if (sceneWrapperFragment.isAdded()) {
            SceneWrapperFragment sceneWrapperFragment2 = this.LLJ;
            if (sceneWrapperFragment2 == null) {
                sceneWrapperFragment2 = null;
            }
            sceneWrapperFragment2.onActivityResult(i, i2, intent);
        }
        NavigationScene navigationScene = this.LLIZ;
        if (navigationScene != null) {
            sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL();
        }
        if ((sceneLLLLIIIILLL instanceof AbstractC214814194y) && (abstractC214814194y = (AbstractC214814194y) sceneLLLLIIIILLL) != null) {
            abstractC214814194y.onActivityResult(i, i2, intent);
        }
    }
}
