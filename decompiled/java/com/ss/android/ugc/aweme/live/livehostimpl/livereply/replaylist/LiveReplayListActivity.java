package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist;

import X.AbstractActivityC484150Iyj;
import X.C011Z;
import X.C09R3;
import X.C0HTI;
import X.C0JT6;
import X.C0P6P;
import X.C1308910kAL;
import X.C1385040m98;
import X.C1391600mJi;
import X.C13LE;
import X.C14EU;
import X.C1618190sDB;
import X.C1697810uHb;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1833490xoR;
import X.C1833570xoZ;
import X.C1833580xoa;
import X.C1833770xot;
import X.C1833990xpF;
import X.C1834020xpI;
import X.C1834040xpK;
import X.C1834050xpL;
import X.C1834080xpO;
import X.C1834120xpS;
import X.C1834130xpT;
import X.C1834240xpe;
import X.C19719912Dl;
import X.C1EOY;
import X.C20600815jK;
import X.C2217381BqS;
import X.C23250099c;
import X.C299020Bno;
import X.C335910DEv;
import X.C450720Hlu;
import X.C452070Ho5;
import X.C465520INi;
import X.C473410IhP;
import X.C481090Itn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C580530Mpn;
import X.C724750Sbp;
import X.C759870TrN;
import X.C781710UlV;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1235690iGF;
import X.EnumC335920DEw;
import X.InterfaceC1833600xoc;
import X.InterfaceC1834090xpP;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListBBViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplayListActivity extends AbstractActivityC484150Iyj implements InterfaceC1834090xpP {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiHELIOSklPyohLTUgMGEhLTUgKDY/ITY4ZwM6PiAeLD8/KTwAIDwnCSY4IDk6PDw=";
    public C1749280vcc LL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILLJJLI;
    public TuxNavBar LLILLL;
    public C481090Itn LLILZ;
    public final AssemVMLazy LLILZIL;
    public final AssemVMLazy LLILZLL;
    public C781710UlV LLIZ;
    public Integer LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final AwS571S0100000_27 LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveReplayListActivity.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylist/data/LiveReplayListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(LiveReplayListActivity.class, "vmBB", "getVmBB()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylist/data/LiveReplayListBBViewModel;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractActivityC484150Iyj, X.InterfaceC20573715ex
    public final boolean K6() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.LiveReplayListActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.LiveReplayListActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.LiveReplayListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0xpG] */
    @Override // X.InterfaceC1834090xpP
    public final C1834020xpI LJIIZILJ() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        if (this.LLJILLL || (viewOnAttachStateChangeListenerC20604515jv = this.LLILLJJLI) == null) {
            return null;
        }
        return new C1834020xpI(viewOnAttachStateChangeListenerC20604515jv, new C0P6P() { // from class: X.0xpG
            @Override // X.C0P6P
            public final void LJJIFFI() {
                this.LL.LLLLZLL().manualListRetry(EnumC323450Cm7.Next);
            }
        });
    }

    @Override // X.AbstractActivityC484150Iyj
    public final int LLLLLZL() {
        return C011Z.LIZ.LJIILJJIL(this);
    }

    public final LiveReplayListViewModel LLLLZLL() {
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (LiveReplayListViewModel) assemVMLazy.getValue();
    }

    public final LiveReplayListBBViewModel LLLLZLLIL() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (LiveReplayListBBViewModel) assemVMLazy.getValue();
    }

    public final void LLLZIL() {
        C500260Jjc.LJIILIIL(this.LLILLJJLI);
        C500260Jjc.LLFFF(this.LL);
        C1749280vcc c1749280vcc = this.LL;
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.n4;
            Drawable drawableLIZ = c0hti.LIZ(c1749280vcc.getContext());
            c1722300uv6.LIZJ = 2;
            c1722300uv6.LIZ = drawableLIZ;
            c1722300uv6.LJFF = 2131851071;
            c1722300uv6.LJII = 2131851070;
            c1749280vcc.setStatus(c1722300uv6);
        }
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        TuxNavBar tuxNavBar;
        View viewLJII;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.LiveReplayListActivity", "onResume", true);
        super.onResume();
        if (this.LLJJIJIL) {
            C1EOY c1eoy = C1EOY.LIZ;
            c1eoy.LJJI();
            C1EOY.LJIILJJIL = "replay_list_page_period";
            c1eoy.LJIILLIIL();
        }
        C465520INi.LIZ.o41("live_replay");
        C1833990xpF.LIZLLL("live_replay");
        if (!this.LLJILLL) {
            C781710UlV c781710UlV = this.LLIZ;
            if (c781710UlV != null) {
                c781710UlV.LIZJ(false);
            }
            if (this.LLJJIII) {
                C0JT6<Boolean> c0jt6 = InterfaceC1833600xoc.ra;
                if (C500260Jjc.LJJIJIIJIL(c0jt6.LIZ()) && (tuxNavBar = this.LLILLL) != null && (viewLJII = tuxNavBar.LJII("setting")) != null) {
                    C450720Hlu c450720Hlu = new C450720Hlu(this);
                    c450720Hlu.LLILZ = C497740JfY.LJIJI(2131855303);
                    C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                    c1391600mJi.LJIJJ = true;
                    c1391600mJi.LIZIZ = viewLJII;
                    c450720Hlu.LLILLJJLI.LJFF = -C1618190sDB.LIZ(8);
                    c450720Hlu.LLILLJJLI.LJIIIIZZ = C1618190sDB.LIZ(6);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1d, C1385040m98.LIZ(this, true ^ C960203pA.LIZIZ(this)));
                    c450720Hlu.LJII(numLIZJ != null ? numLIZJ.intValue() : 0);
                    c450720Hlu.LLILLJJLI.LIZLLL = EnumC1235690iGF.BOTTOM;
                    c450720Hlu.LIZIZ().show();
                    c0jt6.LIZJ(Boolean.TRUE);
                    this.LLJJIII = false;
                }
            }
            C1833770xot c1833770xot = LLLLZLL().LLILLJJLI;
            if (c1833770xot == null || !Intrinsics.LJFF(C1834040xpK.LIZ, c1833770xot.LL.id)) {
                LiveReplayListViewModel liveReplayListViewModelLLLLZLL = LLLLZLL();
                C1833770xot c1833770xot2 = liveReplayListViewModelLLLLZLL.LLILLJJLI;
                if (c1833770xot2 != null) {
                    liveReplayListViewModelLLLLZLL.xQ2(-1, c1833770xot2.LL.id);
                    liveReplayListViewModelLLLLZLL.LLILLJJLI = null;
                }
            } else {
                LLLLZLL().listRemoveItem(c1833770xot);
            }
        } else {
            if (C1834120xpS.LIZ || C1834120xpS.LIZIZ || C1834120xpS.LIZJ) {
                LiveReplayListBBViewModel liveReplayListBBViewModelLLLLZLLIL = LLLLZLLIL();
                C23250099c.LIZIZ(liveReplayListBBViewModelLLLLZLLIL.getAssemVMScope(), null, null, new C1834050xpL(liveReplayListBBViewModelLLLLZLLIL, null), 3);
                C1834120xpS.LIZ();
                break loop0;
            }
            C20600815jK<ITEM> c20600815jK = LLLLZLLIL().state;
            if (c20600815jK != 0) {
                Iterator it2 = ((ArrayList) c20600815jK.LJII()).iterator();
                loop0: while (it2.hasNext()) {
                    Iterator<C1834130xpT> it3 = ((C1834080xpO) ((InterfaceC1891350zJl) it2.next())).LLILLJJLI.iterator();
                    while (it3.hasNext()) {
                        if (it3.next().LLILZIL == 1) {
                            LiveReplayListBBViewModel liveReplayListBBViewModelLLLLZLLIL2 = LLLLZLLIL();
                            C23250099c.LIZIZ(liveReplayListBBViewModelLLLLZLLIL2.getAssemVMScope(), null, null, new C1834050xpL(liveReplayListBBViewModelLLLLZLLIL2, null), 3);
                            C1834120xpS.LIZ();
                            break loop0;
                        }
                    }
                }
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.LiveReplayListActivity", "onResume", false);
    }

    public LiveReplayListActivity() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveReplayListViewModel.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 506);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(89);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLILZIL = new AssemVMLazy(function0LJIIJ, awS556S0100000_12, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 446), aFwS269S0000000_27);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LiveReplayListBBViewModel.class);
        this.LLILZLL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), new AwS556S0100000_12(c19719912DlLIZ2, 507), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 447), AFwS269S0000000_27.get$arr$(90));
        this.LLJILJILJ = "";
        this.LLJJJ = new AwS571S0100000_27(this, 445);
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C465520INi.LIZ.qu1();
        C1833990xpF.LIZIZ(this.LLJILJILJ, "live_replay");
        EventBus.LIZLLL().LJJI(this);
        C580530Mpn.LIZ = null;
        C580530Mpn.LIZIZ = null;
        C580530Mpn.LIZJ = null;
        C1833570xoZ.LIZ.getClass();
        C1833570xoZ.LIZLLL.clear();
        C1833580xoa.LJI();
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        C1833990xpF.LIZJ("live_replay");
        C473410IhP.LJ(new ARunnableS112S0100000_12(this, 203));
        if (!this.LLJJIJIL) {
            C1EOY.LIZ.LJJIII();
        }
        this.LLJJIJIL = true;
        C1EOY.LIZ.LJII();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        C781710UlV c781710UlV = this.LLIZ;
        if (c781710UlV != null) {
            c781710UlV.LIZIZ();
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

    /* JADX WARN: Removed duplicated region for block: B:132:0x059a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r38) {
        /*
            Method dump skipped, instruction units count: 1445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.LiveReplayListActivity.onCreate(android.os.Bundle):void");
    }

    @C14EU
    public final void onEvent(C1833490xoR c1833490xoR) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        c1833490xoR.getClass();
        View view = this.LLJJIJI;
        if (view != null && (viewOnAttachStateChangeListenerC20604515jv = this.LLILLJJLI) != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJJ(view);
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

    @C14EU
    public final void onEvent(C759870TrN c759870TrN) {
        boolean z = this.LLJJI;
        c759870TrN.getClass();
        if (!z) {
            this.LLJJIII = true;
        }
    }

    public static String LLLLZI(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LLLLZLLLI(String str, boolean z) {
        C0JT6<Boolean> c0jt6 = InterfaceC1833600xoc.ma;
        if (C500260Jjc.LJJIJIIJIL(c0jt6.LIZ())) {
            c0jt6.LIZJ(Boolean.TRUE);
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "//webcast_replay_setting");
        C1833570xoZ.LIZ.getClass();
        smartRouteBuildRoute.withParam("enter_from_page", C1833570xoZ.LIZIZ);
        smartRouteBuildRoute.withParam("enter_from", C1833570xoZ.LIZJ);
        smartRouteBuildRoute.withParam("is_from_guide_dialog", z);
        smartRouteBuildRoute.withParam("enter_method", str);
        Integer num = this.LLIZLLLIL;
        if (num != null) {
            smartRouteBuildRoute.withParam("style", String.valueOf(num.intValue()));
        }
        smartRouteBuildRoute.open();
        C1833570xoZ.LIZ("settings", "", "");
        TuxNavBar tuxNavBar = this.LLILLL;
        if (tuxNavBar != null) {
            tuxNavBar.LJIIIZ("setting");
        }
    }

    public static SpannableStringBuilder LLLLZIL(final Context context, int i, String str, int i2, String str2) {
        String strLJIJI = C497740JfY.LJIJI(i2);
        String strLJIJJ = C497740JfY.LJIJJ(i, strLJIJI);
        final String string = C1834240xpe.LIZIZ(str, str2).appendQueryParameter("enter_from", "live_replay").build().toString();
        int iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJIJJ);
        C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0TMY
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                User user;
                IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                Context context2 = context;
                Uri.Builder builderBuildUpon = UriProtector.parse(string).buildUpon();
                C1833570xoZ.LIZ.getClass();
                Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("enter_from_page", C1833570xoZ.LIZIZ);
                InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
                String string2 = null;
                if ((currentUser instanceof User) && (user = (User) currentUser) != null) {
                    string2 = Long.valueOf(user.getId()).toString();
                }
                iActionHandlerService.handle(context2, builderAppendQueryParameter.appendQueryParameter("anchorId", string2).build().toString());
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, iLJJJ, strLJIJI.length() + iLJJJ, 33);
        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, strLJIJI.length() + iLJJJ, 33);
        return spannableStringBuilder;
    }
}
