package com.ss.android.ugc.aweme.notification;

import X.AbstractC1908980zmC;
import X.AbstractC21674919sB;
import X.C01GW;
import X.C036E;
import X.C0P6P;
import X.C0ZE7;
import X.C1076010e6h;
import X.C12ES;
import X.C1308910kAL;
import X.C1336205Ku;
import X.C1379050lzT;
import X.C14EU;
import X.C15O7;
import X.C1697810uHb;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C1908160zks;
import X.C1908200zkw;
import X.C1908260zl2;
import X.C1908300zl6;
import X.C1908950zm9;
import X.C1909010zmF;
import X.C1909020zmG;
import X.C1913380ztI;
import X.C19335310kh;
import X.C299020Bno;
import X.C335910DEv;
import X.C419910GdJ;
import X.C422410GhL;
import X.C452501pT;
import X.C786410Ut5;
import X.C844470XAv;
import X.C879340Yea;
import X.C897520ZIw;
import X.C960203pA;
import X.EnumC1908280zl4;
import X.EnumC1910440zoY;
import X.EnumC1910450zoZ;
import X.EnumC335920DEw;
import X.EnumC452301pR;
import X.EnumC896030ZDd;
import X.InterfaceC1212360hec;
import X.InterfaceC1363370laB;
import X.InterfaceC1909070zmL;
import Y.ACListenerS162S0100000_28;
import Y.AObserverS230S0100000_28;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;
import com.ss.android.ugc.aweme.notification.UserListActivity;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class UserListActivity extends BaseActivity implements C0P6P, InterfaceC1212360hec<DiggInfo>, InterfaceC1363370laB {
    public static final int LLLIIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZisjHELIOSPSY1ISYtPSY8JmsZOiohBCw/PQ4wPCw6IDsq";
    public TuxTextView LL;
    public RecyclerView LLILLJJLI;
    public C1749280vcc LLILLL;
    public TuxIconView LLILZ;
    public FrameLayout LLILZIL;
    public final C01GW LLILZLL;
    public C1908950zm9 LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public List<DiggInfo> LLLIIIL;

    @Override // X.InterfaceC1212360hec
    public final void Jm() {
    }

    public final void LLLLLZL() {
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (LLLLZI().getItemCount() == 0) {
                    C786410Ut5.LLLZLZ(LLLZZIL(), 0);
                    LLLZZIL().LJ();
                }
                LLLZIL().refresh();
                AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(253);
                C1908260zl2 c1908260zl2 = C1908300zl6.LIZ;
                if (c1908260zl2 != null) {
                    aFwS271S0000000_28.invoke(c1908260zl2);
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (LLLLZI().getItemCount() == 0) {
            C15O7.LJIIIIZZ(100L).LJ(new C19335310kh(this, 12), C15O7.LJIIIIZZ, null);
        }
        C1908300zl6.LIZ = null;
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void SY() {
    }

    @Override // X.InterfaceC1212360hec
    public final void bD1(Exception exc) {
    }

    @Override // X.InterfaceC1212360hec
    public final void mE(List<DiggInfo> list, boolean z) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.UserListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.UserListActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.UserListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void zK() {
        throw null;
    }

    static {
        C844470XAv.LIZ.getClass();
        LLLIIL = (int) C12ES.LIZJ(8.0f, C844470XAv.LIZ());
    }

    public final C1908160zks LLLLZI() {
        return (C1908160zks) this.LLILZLL.getValue();
    }

    public final String LLLLZIL() {
        String str = (String) this.LLJJJIL.getValue();
        return (str == null || str.length() == 0 || !C960203pA.LIZIZ(this)) ? (String) this.LLJJJ.getValue() : (String) this.LLJJJIL.getValue();
    }

    public final String LLLLZLL() {
        return (String) this.LLJILJILJ.getValue();
    }

    public final long LLLLZLLIL() {
        return ((Number) this.LLJJIJI.getValue()).longValue();
    }

    public final String LLLLZLLLI() {
        return (String) this.LLJILLL.getValue();
    }

    public final RecyclerView LLLZ() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.per);
            this.LLILLJJLI = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final InterfaceC1909070zmL LLLZIL() {
        return (InterfaceC1909070zmL) this.LLIZLLLIL.getValue();
    }

    public final int LLLZLZ() {
        return ((Number) this.LLJIJIL.getValue()).intValue();
    }

    public final C1749280vcc LLLZZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.w28);
            this.LLILLL = (C1749280vcc) callbackFindViewById;
        }
        return (C1749280vcc) callbackFindViewById;
    }

    public final C1908200zkw LLZLI() {
        EnumC896030ZDd enumC896030ZDd;
        Serializable serializableLJJIJIIJIL = this.LLJZ.getValue() != null ? (Serializable) this.LLJZ.getValue() : C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJJIJIIJIL(((Boolean) this.LLJJJJLIIL.getValue()).booleanValue(), (Integer) this.LLJZIJLIL.getValue(), LLLLZIL(), (String) this.LLJL.getValue(), LLLLZLL(), FallbackStatusComponent.UNKNOWN, 0L);
        int iIntValue = ((Number) this.LLJJ.getValue()).intValue();
        String strLLLLZLL = LLLLZLL();
        if (LLLZLZ() == 21) {
            enumC896030ZDd = EnumC896030ZDd.ACTIVITY_AGGREGATED_REPOST_LIST;
        } else {
            Integer num = (Integer) this.LLJJJJJIL.getValue();
            enumC896030ZDd = (num == null || num.intValue() != 1) ? EnumC896030ZDd.ACTIVITY_AGGREGATED_LIKE_LIST : EnumC896030ZDd.ACTIVITY_AGGREGATED_FAVOURITE_LIST;
        }
        return new C1908200zkw(serializableLJJIJIIJIL, iIntValue, strLLLLZLL, enumC896030ZDd);
    }

    @Override // X.InterfaceC1363370laB
    public final C0ZE7 getActivityStatusParams() {
        C0ZE7 c0ze7 = new C0ZE7(this);
        c0ze7.LIZIZ(EnumC1910440zoY.LIKE_NOTIFICATION_SUBPAGE);
        c0ze7.LIZLLL = "notification_page";
        c0ze7.LJIIIIZZ = Integer.valueOf(LLLZLZ());
        return c0ze7;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        C897520ZIw c897520ZIw;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.UserListActivity", "onStart", true);
        super.onStart();
        C1908950zm9 c1908950zm9 = this.LLIZ;
        if (c1908950zm9 != null && (c897520ZIw = c1908950zm9.LIZ) != null) {
            c897520ZIw.LJ();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.UserListActivity", "onStart", false);
    }

    public UserListActivity() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILZLL = C452501pT.LIZ(enumC452301pR, new AwS572S0100000_28(this, 306));
        this.LLIZLLLIL = C452501pT.LIZ(enumC452301pR, new AwS572S0100000_28(this, 307));
        this.LLJ = C452501pT.LIZ(enumC452301pR, new AwS572S0100000_28(this, 309));
        this.LLJI = C452501pT.LIZ(enumC452301pR, new AwS572S0100000_28(this, 305));
        this.LLJIJIL = C452501pT.LIZ(enumC452301pR, new AwS572S0100000_28(this, 308));
        this.LLJILJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(157), "nid", String.class);
        this.LLJILJILJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(150), "aweme_id", String.class);
        this.LLJILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(158), "ref_id", String.class);
        this.LLJJ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS271S0000000_28.get$arr$(153), "digg_type", Integer.class);
        this.LLJJI = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS271S0000000_28.get$arr$(136), "biz_type", Integer.class);
        this.LLJJIII = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS271S0000000_28.get$arr$(155), "is_new", Boolean.class);
        this.LLJJIJI = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS271S0000000_28.get$arr$(156), "last_read_time", Long.class);
        this.LLJJIJIIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(159), "second_title", String.class);
        this.LLJJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(151), "cover", UrlModel.class);
        this.LLJJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(152), "cover_url", String.class);
        this.LLJJJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(139), "dark_mode_cover_url", String.class);
        this.LLJJJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(126), "tab_name", String.class);
        this.LLJJJJJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(154), "is_favorite", Integer.class);
        this.LLJJJJLIIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS271S0000000_28.get$arr$(145), "is_story", Boolean.class);
        this.LLJJL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS271S0000000_28.get$arr$(147), "is_text_post", Boolean.class);
        this.LLJJLIIIJLLLLLLLZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(146), "sub_type", String.class);
        this.LLJL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(131), "author_id", String.class);
        this.LLJLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(143), "follow_status", Integer.class);
        this.LLJLILLLLZIIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(132), "title", String.class);
        this.LLJLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(129), "account_type", String.class);
        this.LLJLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(149), "topic", Long.class);
        this.LLJLLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(134), "pass_through", String.class);
        this.LLJZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(133), "aweme_info", Serializable.class);
        this.LLJZIJLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(135), "aweme_type", Integer.class);
        this.LLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(144), "sort_option_name", String.class);
        this.LLLF = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(128), "notification_tab_name", String.class);
        this.LLLFF = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(148), "inbox_log_extra", HashMap.class);
        this.LLLFFI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(138), "sec_user_ids", String.class);
        this.LLLFZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(137), "business_extra", String.class);
        this.LLLI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(140), "show_add_as_post_cid", String.class);
        this.LLLII = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(141), "effect_id", String.class);
        this.LLLIIII = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(142), "effect_name", String.class);
        this.LLLIIIIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS271S0000000_28.get$arr$(127), "mix_id", String.class);
    }

    @Override // X.InterfaceC1212360hec
    public final void LJ() {
        C786410Ut5.LLLZLZ(LLLZZIL(), 0);
        LLLZZIL().LJ();
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        LLLZIL().LJJIFFI();
    }

    @Override // X.InterfaceC1212360hec
    public final void Ng1() {
        if (LLLZLZ() == 17) {
            C786410Ut5.LLLZLZ(LLLZZIL(), 0);
            C1749280vcc c1749280vccLLLZZIL = LLLZZIL();
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LJI = getString(2131838188);
            c1749280vccLLLZZIL.setStatus(c1722300uv6);
            return;
        }
        if (LLLLZI().mShowFooter) {
            LLLLZI().setShowFooter(false);
            LLLLZI().notifyDataSetChanged();
            LLLLZI().showLoadMoreEmpty();
            LLLLZI().setShowFooter(false);
        }
        if (LLLLZI().getItemCount() == 0) {
            C786410Ut5.LLLZLZ(LLLZZIL(), 0);
            C1749280vcc c1749280vccLLLZZIL2 = LLLZZIL();
            C1722300uv6 c1722300uv62 = new C1722300uv6();
            c1722300uv62.LJI = getString(2131835723);
            c1722300uv62.LJIIIIZZ = getString(2131835722);
            c1749280vccLLLZZIL2.setStatus(c1722300uv62);
        }
        C1908300zl6.LIZ(0);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C897520ZIw c897520ZIw;
        super.onDestroy();
        LLLZIL().LIZ();
        EventBus.LIZLLL().LJJI(this);
        C1908950zm9 c1908950zm9 = this.LLIZ;
        if (c1908950zm9 == null || (c897520ZIw = c1908950zm9.LIZ) == null) {
            return;
        }
        c897520ZIw.destroy();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        C897520ZIw c897520ZIw;
        super.onStop();
        C1908950zm9 c1908950zm9 = this.LLIZ;
        if (c1908950zm9 != null && (c897520ZIw = c1908950zm9.LIZ) != null) {
            c897520ZIw.LJII();
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

    @Override // X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        LLLLZI().showLoadMoreLoading();
    }

    @Override // X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        if (LLLLZI().mShowFooter) {
            LLLLZI().setShowFooter(false);
            LLLLZI().notifyDataSetChanged();
        }
        if (LLLLZI().getItemCount() == 0) {
            C786410Ut5.LLLZLZ(LLLZZIL(), 0);
            C1913380ztI c1913380ztI = C1913380ztI.LLILLJJLI;
            if (c1913380ztI.isStandardUIEnable()) {
                c1913380ztI.setStatusView(LLLZZIL(), "inbox_like_list", new C1909010zmF(this), exc);
                c1913380ztI.triggerNetworkTips(this, "inbox_like_list", exc, LLLZZIL());
            } else {
                C1749280vcc c1749280vccLLLZZIL = LLLZZIL();
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C1893080zMY.LIZ(c1722300uv6, new C1909020zmG(this));
                c1749280vccLLLZZIL.setStatus(c1722300uv6);
            }
        }
        C1908300zl6.LIZ(0);
    }

    @Override // X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        LLLLZI().showPullUpLoadMore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.0IeR, X.0zm9] */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        boolean z;
        String strLLLLZLL;
        Integer num;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.UserListActivity", "onCreate", true);
        activityConfiguration(AFwS271S0000000_28.get$arr$(130));
        super.onCreate(bundle);
        C1908300zl6.LIZIZ(EnumC1908280zl4.DETAIL_TYPE_LIKE_LIST, ((Number) this.LLJJ.getValue()).intValue(), (String) this.LLJILJIL.getValue());
        setContentView(R.layout.a5k);
        Object value = this.LLJ.getValue();
        String str = null;
        if ((!Intrinsics.LJFF(value, -1)) && value != null) {
            if (value instanceof String) {
                str = (String) value;
            }
            if (str != null) {
                KeyEvent.Callback callbackFindViewById = this.LL;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.y3b);
                    this.LL = (TuxTextView) callbackFindViewById;
                }
                ((TextView) callbackFindViewById).setText(str);
            }
            if ((value instanceof Integer) && (num = (Integer) value) != null) {
                KeyEvent.Callback callbackFindViewById2 = this.LL;
                if (callbackFindViewById2 == null) {
                    callbackFindViewById2 = findViewById(R.id.y3b);
                    this.LL = (TuxTextView) callbackFindViewById2;
                }
                ((TextView) callbackFindViewById2).setText(num.intValue());
            }
        }
        ((AbstractC21674919sB) LLLZ().getItemAnimator()).LLIZ = false;
        LLLZ().setLayoutManager(new LinearLayoutManager(this));
        LLLZ().addItemDecoration(new C422410GhL(1, (int) C12ES.LIZJ(1.0f, this), 0));
        LLLZ().addOnScrollListener(new C1379050lzT(this));
        if (LLLZLZ() == 22) {
            i = R.raw.icon_chevron_left_offset_ltr;
        } else {
            i = R.raw.icon_arrow_left_ltr;
        }
        LLLZLZ();
        KeyEvent.Callback callbackFindViewById3 = this.LLILZ;
        if (callbackFindViewById3 == null) {
            callbackFindViewById3 = findViewById(R.id.bn2);
            this.LLILZ = (TuxIconView) callbackFindViewById3;
        }
        TuxIconView tuxIconView = (TuxIconView) callbackFindViewById3;
        C786410Ut5.a9(tuxIconView, new ACListenerS162S0100000_28(this, 210));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        tuxIconView.setTuxIcon(c419910GdJ);
        if (LLLZLZ() != 22 && (strLLLLZLL = LLLLZLL()) != null && strLLLLZLL.length() != 0) {
            LLLLZI().LLILZLL = (UrlModel) this.LLJJIJIL.getValue();
            LLLLZI().LLIZ = LLLLZIL();
            LLLLZI().LLIZLLLIL = (String) this.LLJJIJIIJIL.getValue();
            LLLLZI().LLJ = new AwS572S0100000_28(this, 1099);
        } else {
            LLLLZI().LLJI = false;
        }
        C1908160zks c1908160zksLLLLZI = LLLLZI();
        if (LLLZLZ() == 22) {
            z = false;
        } else {
            z = true;
        }
        c1908160zksLLLLZI.LLJIJIL = z;
        LLLLZI().setLoadMoreListener(this);
        LLLLZI().setShowFooter(true);
        LLLLZI().showLoadMoreEmpty();
        LLLZ().setAdapter(LLLLZI());
        C786410Ut5.LLLZLZ(LLLZZIL(), 0);
        LLLZZIL().LJ();
        final EnumC1910450zoZ enumC1910450zoZ = EnumC1910450zoZ.LIKE_NOTIFICATION_SUBPAGE;
        ?? r1 = new AbstractC1908980zmC(enumC1910450zoZ) { // from class: X.0zm9
            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                Collection<C595660NXw> collectionValues;
                List<DiggInfo> data = this.LIZIZ.LLLLZI().getData();
                if (data != null) {
                    C897520ZIw c897520ZIw = this.LIZ;
                    if (c897520ZIw != null) {
                        c897520ZIw.LJIIIIZZ(C0O26.LIZIZ(data, AFwS271S0000000_28.get$arr$(452)));
                    }
                    C897520ZIw c897520ZIw2 = this.LIZ;
                    if (c897520ZIw2 == null || (collectionValues = c897520ZIw2.LIZLLL().values()) == null) {
                        return;
                    }
                    UserListActivity userListActivity = this.LIZIZ;
                    Iterator<T> it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        userListActivity.LLLLZI().LLLI((C595660NXw) it2.next());
                    }
                }
            }

            {
                C897520ZIw c897520ZIw = this.LIZ;
                if (c897520ZIw != null) {
                    c897520ZIw.LIZIZ(true, new C0NYY() { // from class: X.0zmA
                        @Override // X.C0NYY
                        public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                            Collection<C595660NXw> collectionValues = map.values();
                            UserListActivity userListActivity = userListActivity;
                            Iterator<T> it2 = collectionValues.iterator();
                            while (it2.hasNext()) {
                                userListActivity.LLLLZI().LLLI((C595660NXw) it2.next());
                            }
                            return Unit.LIZ;
                        }
                    });
                }
            }
        };
        this.LLIZ = r1;
        LLLLZI().registerAdapterDataObserver(r1);
        LLLLLZL();
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(this, new AObserverS230S0100000_28(this, 33));
        EventBus.LIZLLL().LJIJJ(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, ImmersionBar.LJIILJJIL(this));
        tuxImmersionBar.LJIIIIZZ(R.attr.bx);
        tuxImmersionBar.LJ(R.attr.bx);
        tuxImmersionBar.LIZ(true);
        tuxImmersionBar.LIZLLL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.UserListActivity", "onCreate", false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C879340Yea c879340Yea) {
        LLLLZI().notifyDataSetChanged();
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

    @Override // X.InterfaceC1212360hec
    public final void LLJJJIL(List<DiggInfo> list, boolean z) {
        int i;
        ArrayList arrayList;
        this.LLLIIIL = list;
        LLLLZI().setShowFooter(true);
        int size = 0;
        if (!z) {
            LLLLZI().showLoadMoreEmpty();
            LLLLZI().setShowFooter(false);
        } else {
            LLLLZI().resetLoadMoreState();
        }
        if (LLLZIL().LIZLLL() == 0) {
            i = LLLIIL;
        } else {
            i = 0;
        }
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(R.id.ped);
            this.LLILZIL = (FrameLayout) viewFindViewById;
        }
        viewFindViewById.setPadding(0, i, 0, 0);
        LLLLZI().LLILLL = LLLZIL().LIZLLL();
        C1908160zks c1908160zksLLLLZI = LLLLZI();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (DiggInfo diggInfo : list) {
                if (diggInfo.user != null) {
                    arrayList2.add(diggInfo);
                }
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        c1908160zksLLLLZI.setData(arrayList);
        C786410Ut5.LLLZLZ(LLLZZIL(), 8);
        if (list != null) {
            size = list.size();
        }
        C1908300zl6.LIZ(size);
    }

    @Override // X.InterfaceC1212360hec
    public final void Pj(List<DiggInfo> list, boolean z) {
        ArrayList arrayList;
        if (list != null && !list.isEmpty() && z) {
            LLLLZI().resetLoadMoreState();
        } else {
            LLLLZI().showLoadMoreEmpty();
            LLLLZI().setShowFooter(false);
        }
        LLLLZI().LLILLL = LLLZIL().LIZLLL();
        C1908160zks c1908160zksLLLLZI = LLLLZI();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (DiggInfo diggInfo : list) {
                if (diggInfo.user != null) {
                    arrayList2.add(diggInfo);
                }
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        c1908160zksLLLLZI.addData(arrayList);
        this.LLLIIIL = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZ(int r9, com.ss.android.ugc.aweme.profile.model.User r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.UserListActivity.LLZ(int, com.ss.android.ugc.aweme.profile.model.User, java.lang.String):void");
    }
}
