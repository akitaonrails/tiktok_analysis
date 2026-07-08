package com.ss.android.ugc.aweme.ecommerce.base.messagecenter;

import X.AbstractActivityC1743740vTg;
import X.C03H5;
import X.C0C64;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1701470uNV;
import X.C1738900vLs;
import X.C1738910vLt;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1751140vfc;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19EH;
import X.C2518109tr;
import X.C299020Bno;
import X.C335910DEv;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1740480vOQ;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class MessageCenterActivity extends AbstractActivityC1743740vTg implements InterfaceC724530SbT, InterfaceC1740480vOQ {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTHELIOSYpZyI2OzYtLiowLSs4LD19BSA/Oi40LQYpJzs2OgQvPSYlITE1";

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.AbstractActivityC1743740vTg, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "shop_message";
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        boolean zLJI = MethodIDManager.LJI(202334);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterActivity", "onStart", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    @Override // X.AbstractActivityC1743740vTg, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_rd", new AwS605S0100000_26(C1738900vLs.LIZ(getIntent()), 187));
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws JSONException {
        Fragment msgPageFragment;
        String stringExtra;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        Bundle extras;
        String string9;
        Bundle extras2;
        String string10;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.anz);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ec_inbox_close_creator_page", true, false)) {
            msgPageFragment = new MessageCenterFragment();
        } else {
            msgPageFragment = new MsgPageFragment();
        }
        Bundle bundle2 = new Bundle();
        C1738910vLt c1738910vLtLIZ = C1738900vLs.LIZ(getIntent());
        Map<String, String> mapLIZ = c1738910vLtLIZ.LIZ();
        for (String str : mapLIZ.keySet()) {
            C786410Ut5.LJJJI(str, mapLIZ.get(str), bundle2);
        }
        try {
            stringExtra = getIntent().getStringExtra("source_btm_token");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        C786410Ut5.LJJJI("source_btm_token", stringExtra, bundle2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", c1738910vLtLIZ.LLILLJJLI);
        jSONObject.put("start_click_time", c1738910vLtLIZ.LLILZ);
        C786410Ut5.LJJJI("trackParams", C786410Ut5.J3(jSONObject), bundle2);
        Intent intent = getIntent();
        String str2 = c1738910vLtLIZ.LLILLJJLI;
        Bundle bundleLIZ = C1701470uNV.LIZ(intent);
        if (bundleLIZ == null || (string = bundleLIZ.getString("show_tablist")) == null) {
            string = "1";
        }
        boolean zLJFF = Intrinsics.LJFF(string, "1");
        Bundle bundleLIZ2 = C1701470uNV.LIZ(intent);
        if (bundleLIZ2 != null) {
            string2 = bundleLIZ2.getString("title");
        } else {
            string2 = null;
        }
        Bundle bundleLIZ3 = C1701470uNV.LIZ(intent);
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (bundleLIZ3 == null || (string3 = bundleLIZ3.getString("show_order_center")) == null) {
            string3 = CardStruct.IStatusCode.DEFAULT;
        }
        boolean zLJFF2 = Intrinsics.LJFF(string3, "1");
        Bundle bundleLIZ4 = C1701470uNV.LIZ(intent);
        if (bundleLIZ4 == null || (string4 = bundleLIZ4.getString("show_notice")) == null) {
            string4 = "1";
        }
        boolean zLJFF3 = Intrinsics.LJFF(string4, "1");
        Bundle bundleLIZ5 = C1701470uNV.LIZ(intent);
        if (bundleLIZ5 == null || (string5 = bundleLIZ5.getString("show_description")) == null) {
            string5 = CardStruct.IStatusCode.DEFAULT;
        }
        boolean zLJFF4 = Intrinsics.LJFF(string5, "1");
        Bundle bundleLIZ6 = C1701470uNV.LIZ(intent);
        if (bundleLIZ6 == null || (string6 = bundleLIZ6.getString("show_move_reminder")) == null) {
            string6 = CardStruct.IStatusCode.DEFAULT;
        }
        boolean zLJFF5 = Intrinsics.LJFF(string6, "1");
        Bundle bundleLIZ7 = C1701470uNV.LIZ(intent);
        if (bundleLIZ7 == null || (string7 = bundleLIZ7.getString("show_seller_message")) == null) {
            boolean z = C2518109tr.LIZ;
            if (!Intrinsics.LJFF(str2, "mall_notification") || !C2518109tr.LIZ) {
                str3 = "1";
            }
            string7 = str3;
        }
        boolean zLJFF6 = Intrinsics.LJFF(string7, "1");
        Bundle bundleLIZ8 = C1701470uNV.LIZ(intent);
        if (bundleLIZ8 != null) {
            string8 = bundleLIZ8.getString("show_recommend");
        } else {
            string8 = null;
        }
        C1751140vfc c1751140vfc = new C1751140vfc(768, string2, zLJFF, zLJFF2, zLJFF3, zLJFF4, zLJFF5, zLJFF6, Intrinsics.LJFF(string8, "1"), false);
        bundle2.putBoolean("show_tablist", zLJFF);
        C786410Ut5.LJJJI("title", c1751140vfc.LLILLJJLI, bundle2);
        bundle2.putBoolean("show_order_center", zLJFF2);
        bundle2.putBoolean("show_notice", zLJFF3);
        bundle2.putBoolean("show_description", zLJFF4);
        bundle2.putBoolean("show_move_reminder", zLJFF5);
        bundle2.putBoolean("show_seller_message", zLJFF6);
        bundle2.putBoolean("show_recommend", c1751140vfc.LLIZLLLIL);
        try {
            extras = getIntent().getExtras();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            extras = null;
        }
        if (extras != null) {
            string9 = extras.getString("traffic_source");
        } else {
            string9 = null;
        }
        C786410Ut5.LJJJI("traffic_source", string9, bundle2);
        try {
            extras2 = getIntent().getExtras();
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            extras2 = null;
        }
        if (extras2 != null) {
            string10 = extras2.getString("traffic_source_list");
        } else {
            string10 = null;
        }
        C786410Ut5.LJJJI("traffic_source_list", string10, bundle2);
        msgPageFragment.setArguments(bundle2);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiv, msgPageFragment, "message_center_fragment");
        c19ehLJIIJ.LJIIJ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterActivity", "onCreate", false);
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
