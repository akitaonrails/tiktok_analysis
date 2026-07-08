package com.ss.android.ugc.aweme.tako.otherpage.waiting;

import X.C00XG;
import X.C01GW;
import X.C054G;
import X.C06RK;
import X.C0I7D;
import X.C0PEM;
import X.C1308910kAL;
import X.C13LE;
import X.C15438062q;
import X.C1697810uHb;
import X.C1857690yRT;
import X.C1860520yW2;
import X.C1862330yYx;
import X.C197039127h;
import X.C19719912Dl;
import X.C1DFH;
import X.C1DFK;
import X.C20235014Fo;
import X.C20600815jK;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23118094a;
import X.C23250099c;
import X.C299020Bno;
import X.C335910DEv;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C521840KdK;
import X.C597050NbL;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC335920DEw;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnGlobalLayoutListenerC1864770yct;
import Y.ACListenerS161S0100000_27;
import Y.ATListenerS459S0100000_27;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoWaitingListActivity extends BaseActivity {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLD0jHELIOSKSIpZzgyITElJyh9HCQnJhgyITElJygfITY4CCwnITMlPTY=";
    public SmartImageView LL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILLJJLI;
    public TuxIconView LLILLL;
    public C197039127h LLILZ;
    public C0I7D LLILZIL;
    public View LLILZLL;
    public TuxIconView LLIZ;
    public C197039127h LLIZLLLIL;
    public FrameLayout LLJ;
    public FrameLayout LLJI;
    public final AssemVMLazy LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C1DFK LLJILLL;
    public final C054G LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoWaitingListActivity.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tako/otherpage/waiting/TakoWaitingVM;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.waiting.TakoWaitingListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.waiting.TakoWaitingListActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.waiting.TakoWaitingListActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.waiting.TakoWaitingListActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.waiting.TakoWaitingListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C0I7D LLLLLZL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kp9);
            this.LLILZIL = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    public TakoWaitingListActivity() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoWaitingVM.class);
        this.LLJIJIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS568S0100000_24(c19719912DlLIZ, 1364), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1365), AFwS269S0000000_27.get$arr$(299));
        this.LLJILJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS264S0000000_24.get$arr$(452), "enter_from", String.class);
        this.LLJILJILJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS264S0000000_24.get$arr$(453), "search_id", String.class);
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        this.LLJILLL = c1dfkLIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(c1dfkLIZ));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.LLJILLL.LIZIZ(null);
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

    public final void initFinishedView(View view) {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hz9);
            this.LLIZ = (TuxIconView) callbackFindViewById;
        }
        C786410Ut5.a9((TuxIconView) callbackFindViewById, new ACListenerS161S0100000_27(this, 98));
        KeyEvent.Callback callbackFindViewById2 = this.LLIZLLLIL;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.hz_);
            this.LLIZLLLIL = (C197039127h) callbackFindViewById2;
        }
        C786410Ut5.U8((C197039127h) callbackFindViewById2, new ACListenerS161S0100000_27(this, 99));
        C23250099c.LIZLLL(this.LLJJ, null, null, new C06RK(this, null), 3);
        if (view != null) {
            view.setOnTouchListener(new ATListenerS459S0100000_27(this, 6));
        }
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(R.id.eux);
            this.LLJ = (FrameLayout) viewFindViewById;
        }
        viewFindViewById.setOnTouchListener(new ATListenerS459S0100000_27(this, 7));
        View viewFindViewById2 = this.LLJI;
        if (viewFindViewById2 == null) {
            viewFindViewById2 = findViewById(R.id.cac);
            this.LLJI = (FrameLayout) viewFindViewById2;
        }
        viewFindViewById2.setOnTouchListener(new ATListenerS459S0100000_27(this, 8));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.waiting.TakoWaitingListActivity", "onCreate", true);
        super.onCreate(bundle);
        activityConfiguration(AFwS269S0000000_27.get$arr$(298));
        C1860520yW2.LIZ.getClass();
        if (C1860520yW2.LJIIL().getBoolean("tako_waiting_list_finished", false)) {
            setContentView(R.layout.fjo);
            initFinishedView(null);
        } else {
            setContentView(R.layout.fjm);
            KeyEvent.Callback callbackFindViewById = this.LL;
            if (callbackFindViewById == null) {
                callbackFindViewById = findViewById(R.id.xcx);
                this.LL = (SmartImageView) callbackFindViewById;
            }
            ImageView imageView = (ImageView) callbackFindViewById;
            if (imageView != null) {
                C1857690yRT.LJII(imageView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), false);
            }
            KeyEvent.Callback callbackFindViewById2 = this.LLILLJJLI;
            if (callbackFindViewById2 == null) {
                callbackFindViewById2 = findViewById(R.id.dqc);
                this.LLILLJJLI = (ViewOnAttachStateChangeListenerC20604515jv) callbackFindViewById2;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) callbackFindViewById2;
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(CheckItemCell.class);
            C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
            AssemVMLazy assemVMLazy = this.LLJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
            List<String> list = ((TakoWaitingVM) assemVMLazy.getValue()).LLILLJJLI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C00XG(it2.next()));
            }
            state.LIZLLL(arrayList, null);
            KeyEvent.Callback callbackFindViewById3 = this.LLILLL;
            if (callbackFindViewById3 == null) {
                callbackFindViewById3 = findViewById(R.id.bn1);
                this.LLILLL = (TuxIconView) callbackFindViewById3;
            }
            C786410Ut5.a9((TuxIconView) callbackFindViewById3, new ACListenerS161S0100000_27(this, 4));
            AssemVMLazy assemVMLazy2 = this.LLJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJI;
            TakoWaitingVM takoWaitingVM = (TakoWaitingVM) assemVMLazy2.getValue();
            AssemViewModel.selectSubscribe$default(takoWaitingVM, new C2217381BqS() { // from class: X.0198
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C231600uw) obj).LL;
                }
            }, null, null, null, new AwS393S0200000_27(new AwS606S0100000_27(this, 12), takoWaitingVM, 4), 14, null);
            KeyEvent.Callback callbackFindViewById4 = this.LLILZ;
            if (callbackFindViewById4 == null) {
                callbackFindViewById4 = findViewById(R.id.d6g);
                this.LLILZ = (C197039127h) callbackFindViewById4;
            }
            C786410Ut5.U8((C197039127h) callbackFindViewById4, new ACListenerS161S0100000_27(this, 5));
            C786410Ut5.x3(LLLLLZL().getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1864770yct(this, 0));
            LLLLLZL().addTextChangedListener(new C521840KdK(this, 0));
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            Object value = this.LLJILJIL.getValue();
            Object value2 = this.LLJILJILJ.getValue();
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            c20235014FoLIZ.LIZ("tikbot_beta_card_click", C2097608Jq.LJIIIIZZ(new Pair("enter_from", value), new Pair("search_id", value2)));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.waiting.TakoWaitingListActivity", "onCreate", false);
    }

    public final void setFinishedLayoutFromXml(View view) {
        this.LLILZLL = view;
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
