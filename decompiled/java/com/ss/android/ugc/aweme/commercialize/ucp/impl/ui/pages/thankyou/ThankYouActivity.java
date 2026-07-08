package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.thankyou;

import X.C01GW;
import X.C051K;
import X.C098200Yq;
import X.C0D4Q;
import X.C0D4R;
import X.C0D8O;
import X.C0DBY;
import X.C0DCK;
import X.C0DDG;
import X.C0DE0;
import X.C0DET;
import X.C0DG6;
import X.C0FG3;
import X.C1281204zq;
import X.C1308910kAL;
import X.C13EL;
import X.C13EM;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C14K9;
import X.C1524305xx;
import X.C1616006Uk;
import X.C189200o6;
import X.C20512315Of;
import X.C21578619ce;
import X.C2188811AlT;
import X.C23250099c;
import X.C332720D2o;
import X.C333150D4f;
import X.C335000DBi;
import X.C335480DDe;
import X.C335490DDf;
import X.C335530DDj;
import X.C335560DDm;
import X.C335670DDx;
import X.C335680DDy;
import X.C346240Dhm;
import X.C346530DiF;
import X.C452501pT;
import X.C516501zn;
import X.C786410Ut5;
import X.EnumC12947054v;
import X.EnumC335450DDb;
import X.EnumC335460DDc;
import X.InterfaceC333090D3z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS139S0100000_4;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutLineItemContext;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.waterfall.WaterfallRecommendationViewModel;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2Activity;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS55S1000000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class ThankYouActivity extends C0DET implements InterfaceC333090D3z {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiPCwjHELIOSZiwhOSN9PSxiOS40LTZiPScyJi41Jjp9HC0tJyQKJzANKjs6Piw4MA==";
    public C335560DDm LLILZLL;
    public C335000DBi LLIZ;
    public boolean LLIZLLLIL;
    public C1281204zq LLJI;
    public C0DG6 LLJJIJIIJIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 119));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 118));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C333150D4f(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 121));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 126));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 122));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 120));
    public final ViewModelLazy LLJJIII = new ViewModelLazy(C13LE.LIZ(WaterfallRecommendationViewModel.class), new AwS548S0100000_4((ComponentActivity) this, 123), new AwS548S0100000_4(this, 127), new AwS405S0200000_4((Function0) null, this, 19));
    public final ViewModelLazy LLJJIJI = new ViewModelLazy(C13LE.LIZ(ThankYouViewModel.class), new AwS548S0100000_4((ComponentActivity) this, 125), AFwS190S0000000_4.get$arr$(972), new AwS405S0200000_4((Function0) null, this, 20));

    @Override // X.C0DET
    public final boolean LLLLZLLLI() {
        return true;
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.thankyou.ThankYouActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.thankyou.ThankYouActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.thankyou.ThankYouActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C0DET
    public final int LLLLZIL() {
        return EnumC335450DDb.THANK_YOU.getValue();
    }

    public final CheckoutIntent LLLZ() {
        return (CheckoutIntent) this.LLJIJIL.getValue();
    }

    public final void LLLZZIL() {
        Object c098200Yq;
        LLLZIL("navigate_after_close_enter", "attempt close navigation");
        if (this.LLIZLLLIL) {
            LLLZIL("navigate_after_close_skip", "already navigated away");
            return;
        }
        this.LLIZLLLIL = true;
        PdpFragment.LLJJL.setValue(Long.valueOf(SystemClock.elapsedRealtime()));
        LLLZIL("notify_pdp_close", "request active PDP container to close itself");
        List<WeakReference<Activity>> list = C0DE0.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            Object obj = ((Reference) it2.next()).get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((Activity) obj2).isFinishing()) {
                arrayList2.add(obj2);
            }
        }
        ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            if (OrdersV2Activity.class.isInstance(listIterator.previous())) {
                int iNextIndex = listIterator.nextIndex();
                if (iNextIndex >= 0) {
                    Object it3 = new C13EL(arrayList2.subList(iNextIndex + 1, arrayList2.size())).iterator();
                    while (true) {
                        C13EM c13em = (C13EM) it3;
                        if (!c13em.hasNext()) {
                            LLLZIL("navigate_after_close_target", "return existing OrdersV2Activity");
                            return;
                        }
                        ((Activity) c13em.next()).finish();
                    }
                }
            }
        }
        LLLZIL("navigate_after_close_fallback", "OrdersV2Activity not found, fallback to main feed");
        try {
            LLLZIL("navigate_feed_start", "open SmartRouter aweme://main with HOME tab");
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "aweme://main");
            smartRouteBuildRoute.addFlags(335544320);
            smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            smartRouteBuildRoute.withParam("tab", 1);
            smartRouteBuildRoute.open();
            LLLZIL("navigate_feed_success", "SmartRouter aweme://main opened");
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("navigate to main failed: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            LLLZIL("navigate_feed_failure", C2188811AlT.LIZIZ(sbLIZ));
            Iterator it4 = ((ArrayList) C0DE0.LIZ).iterator();
            while (it4.hasNext()) {
                Activity activity = (Activity) ((Reference) it4.next()).get();
                if (activity != null && !activity.isFinishing()) {
                    activity.finish();
                }
            }
            ((ArrayList) C0DE0.LIZ).clear();
            LLLZIL("navigate_feed_finish_all", "finishAllUcpActivities invoked");
        }
    }

    @Override // X.InterfaceC333090D3z
    public final CommonAdData ee() {
        C0DBY c0dby = C335000DBi.LIZJ;
        CheckoutIntent checkoutIntentLLLZ = LLLZ();
        Map<String, String> map = checkoutIntentLLLZ != null ? checkoutIntentLLLZ.passThrough : null;
        c0dby.getClass();
        return C0DBY.LIZLLL(map);
    }

    @Override // android.app.Activity
    public final void finish() {
        LLLZIL("finish_called", "activity finish invoked");
        if (!this.LLIZLLLIL) {
            LLLLZLLIL(1);
            LLLZIL("finish_predictive_back_fallback", "finish invoked before navigation, fallback as close button");
            LLLZLZ();
            LLLZZIL();
        }
        super.finish();
    }

    @Override // X.C0DET, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C1524305xx c1524305xx = C1524305xx.LIZ;
        C1281204zq c1281204zq = this.LLJI;
        c1524305xx.getClass();
        C1524305xx.LJ(c1281204zq, this);
        this.LLJI = null;
        super.onDestroy();
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        Map<String, String> map;
        C335000DBi c335000DBi;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.thankyou.ThankYouActivity", "onResume", true);
        super.onResume();
        CheckoutIntent checkoutIntentLLLZ = LLLZ();
        if (checkoutIntentLLLZ != null && (map = checkoutIntentLLLZ.passThrough) != null && (c335000DBi = this.LLIZ) != null) {
            c335000DBi.logAd(C335490DDf.LIZ, ee(), new AwS583S0100000_4(map, (Map<String, String>) 348));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.thankyou.ThankYouActivity", "onResume", false);
    }

    public final void LLLZLZ() {
        String strLLZ = LLZ(LLLZ());
        if (strLLZ == null) {
            strLLZ = "";
        }
        C335000DBi c335000DBi = this.LLIZ;
        if (c335000DBi != null) {
            c335000DBi.logAd(C335480DDe.LIZ, ee(), new AwS55S1000000_4(strLLZ, 0));
        }
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
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

    @Override // X.InterfaceC333090D3z
    public final C335000DBi g4() {
        return this.LLIZ;
    }

    public static String LLZ(CheckoutIntent checkoutIntent) {
        Map<String, String> map;
        String str;
        if (checkoutIntent != null && (map = checkoutIntent.passThrough) != null && (str = map.get("order_id")) != null && (!a0.LJJJIL(str))) {
            return str;
        }
        return null;
    }

    @Override // X.C0DET
    public final int LLLLZLL(boolean z) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, this);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return C0DDG.LIZ(this, z);
    }

    @Override // X.C0DET, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iIntValue;
        Map<String, String> map;
        CheckoutLineItemContext checkoutLineItemContext;
        ConstraintLayout constraintLayout;
        String str;
        List<CheckoutLineItemContext> list;
        String str2;
        Integer numValueOf;
        Map<String, String> map2;
        Map<String, String> map3;
        Map<String, String> map4;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.thankyou.ThankYouActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra("extra_ucp_playback_session_id");
                if (stringExtra != null && (!a0.LJJJIL(stringExtra))) {
                    C1524305xx c1524305xx = C1524305xx.LIZ;
                    String str3 = (String) this.LLJ.getValue();
                    EnumC12947054v enumC12947054v = EnumC12947054v.CHILD_ACTIVITY;
                    c1524305xx.getClass();
                    this.LLJI = C1524305xx.LIZ(stringExtra, str3, enumC12947054v, this);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        View viewTd = C786410Ut5.Td(getLayoutInflater(), R.layout.i3q, null, false);
        int i = R.id.cls;
        ImageView imageView = (ImageView) C1616006Uk.LIZ(R.id.cls, viewTd);
        if (imageView != null) {
            i = R.id.m6s;
            View viewLIZ = C1616006Uk.LIZ(R.id.m6s, viewTd);
            if (viewLIZ != null) {
                int i2 = R.id.cm4;
                if (C1616006Uk.LIZ(R.id.cm4, viewLIZ) != null) {
                    i2 = R.id.cmj;
                    TextView textView = (TextView) C1616006Uk.LIZ(R.id.cmj, viewLIZ);
                    if (textView != null) {
                        i2 = R.id.fem;
                        CardView cardView = (CardView) C1616006Uk.LIZ(R.id.fem, viewLIZ);
                        if (cardView != null) {
                            i2 = R.id.n9r;
                            if (C1616006Uk.LIZ(R.id.n9r, viewLIZ) != null) {
                                i2 = R.id.n_a;
                                if (C1616006Uk.LIZ(R.id.n_a, viewLIZ) != null) {
                                    i2 = R.id.z27;
                                    TextView textView2 = (TextView) C1616006Uk.LIZ(R.id.z27, viewLIZ);
                                    if (textView2 != null) {
                                        i2 = R.id.z28;
                                        TextView textView3 = (TextView) C1616006Uk.LIZ(R.id.z28, viewLIZ);
                                        if (textView3 != null) {
                                            i2 = R.id.z6x;
                                            if (C1616006Uk.LIZ(R.id.z6x, viewLIZ) != null) {
                                                C335670DDx c335670DDx = new C335670DDx((LinearLayout) viewLIZ, textView, cardView, textView2, textView3);
                                                View viewLIZ2 = C1616006Uk.LIZ(R.id.m70, viewTd);
                                                if (viewLIZ2 != null) {
                                                    int i3 = R.id.lvb;
                                                    TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.lvb, viewLIZ2);
                                                    if (tuxIconView != null) {
                                                        i3 = R.id.ndn;
                                                        if (C1616006Uk.LIZ(R.id.ndn, viewLIZ2) != null) {
                                                            i3 = R.id.tv_subtitle;
                                                            TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.tv_subtitle, viewLIZ2);
                                                            if (tuxTextView != null) {
                                                                i3 = R.id.z7f;
                                                                if (C1616006Uk.LIZ(R.id.z7f, viewLIZ2) != null) {
                                                                    C335680DDy c335680DDy = new C335680DDy((FrameLayout) viewLIZ2, tuxIconView, tuxTextView);
                                                                    i = R.id.m7y;
                                                                    FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.m7y, viewTd);
                                                                    if (frameLayout != null) {
                                                                        i = R.id.m7z;
                                                                        View viewLIZ3 = C1616006Uk.LIZ(R.id.m7z, viewTd);
                                                                        if (viewLIZ3 != null) {
                                                                            C335530DDj c335530DDjLIZ = C335530DDj.LIZ(viewLIZ3);
                                                                            i = R.id.u2m;
                                                                            C21578619ce c21578619ce = (C21578619ce) C1616006Uk.LIZ(R.id.u2m, viewTd);
                                                                            if (c21578619ce != null) {
                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewTd;
                                                                                C335560DDm c335560DDm = new C335560DDm(constraintLayout2, imageView, c335670DDx, c335680DDy, frameLayout, c335530DDjLIZ, c21578619ce);
                                                                                this.LLILZLL = c335560DDm;
                                                                                constraintLayout2.setLayoutDirection(3);
                                                                                constraintLayout2.setTextDirection(5);
                                                                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, this);
                                                                                if (numLIZJ != null) {
                                                                                    iIntValue = numLIZJ.intValue();
                                                                                } else {
                                                                                    iIntValue = 0;
                                                                                }
                                                                                constraintLayout2.setBackgroundColor(iIntValue);
                                                                                setContentView(constraintLayout2);
                                                                                C0FG3.LIZ(tuxIconView, new int[]{ColorProtector.parseColor("#14002AD4"), ColorProtector.parseColor("#0A002AD4"), ColorProtector.parseColor("#33009CC3")});
                                                                                CheckoutIntent checkoutIntentLLLZ = LLLZ();
                                                                                if (checkoutIntentLLLZ != null) {
                                                                                    C051K.LJFF(checkoutIntentLLLZ, true, true, 4);
                                                                                }
                                                                                CheckoutIntent checkoutIntentLLLZ2 = LLLZ();
                                                                                if (checkoutIntentLLLZ2 != null && (map4 = checkoutIntentLLLZ2.passThrough) != null) {
                                                                                    this.LLIZ = new C335000DBi(map4, new Object[0]);
                                                                                }
                                                                                C0D8O.LIZ(EnumC335460DDc.THANK_YOU, LLZ(LLLZ()), 4);
                                                                                C14K9.LJIJJ(constraintLayout2, new C346530DiF(c335560DDm, 1));
                                                                                getOnBackPressedDispatcher().LIZ(this, new C346240Dhm(this, 0));
                                                                                C786410Ut5.Q7(imageView, new ACListenerS139S0100000_4(this, 28));
                                                                                C786410Ut5.T7(textView, new ACListenerS139S0100000_4(this, 29));
                                                                                C335560DDm c335560DDm2 = this.LLILZLL;
                                                                                if (c335560DDm2 != null) {
                                                                                    CheckoutStoredUserAddress checkoutStoredUserAddress = (CheckoutStoredUserAddress) this.LLJILJILJ.getValue();
                                                                                    if (checkoutStoredUserAddress != null) {
                                                                                        c335560DDm2.LLILLJJLI.LLILLL.setText(C13LP.LJJLIIIJ(C13LQ.LJIJI(new String[]{checkoutStoredUserAddress.getFullName(), checkoutStoredUserAddress.streetAddress}), ", ", null, null, 0, null, null, 62));
                                                                                        c335560DDm2.LLILLJJLI.LLILZ.setText(C13LP.LJJLIIIJ(C13LQ.LJIJI(new String[]{checkoutStoredUserAddress.city, checkoutStoredUserAddress.state, checkoutStoredUserAddress.zipCode}), ", ", null, null, 0, null, null, 62));
                                                                                        C786410Ut5.LLILLL(c335560DDm2.LLILLJJLI.LLILLJJLI, 0);
                                                                                    } else {
                                                                                        C786410Ut5.LLILLL(c335560DDm2.LLILLJJLI.LLILLJJLI, 8);
                                                                                    }
                                                                                }
                                                                                C335560DDm c335560DDm3 = this.LLILZLL;
                                                                                if (c335560DDm3 != null) {
                                                                                    CheckoutIntent checkoutIntentLLLZ3 = LLLZ();
                                                                                    if (checkoutIntentLLLZ3 != null) {
                                                                                        map3 = checkoutIntentLLLZ3.passThrough;
                                                                                    } else {
                                                                                        map3 = null;
                                                                                    }
                                                                                    String strLIZ = C332720D2o.LIZ(map3);
                                                                                    if (strLIZ != null && (true ^ a0.LJJJIL(strLIZ))) {
                                                                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                                        sbLIZ.append(getString(2131857624));
                                                                                        sbLIZ.append(' ');
                                                                                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                                                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                                                        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, this);
                                                                                        if (numLIZJ2 != null) {
                                                                                            int iIntValue2 = numLIZJ2.intValue();
                                                                                            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1o, this);
                                                                                            if (numLIZJ3 != null) {
                                                                                                int iIntValue3 = numLIZJ3.intValue();
                                                                                                spannableStringBuilder.append((CharSequence) strLIZIZ);
                                                                                                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue2), 0, strLIZIZ.length(), 33);
                                                                                                int length = spannableStringBuilder.length();
                                                                                                spannableStringBuilder.append((CharSequence) strLIZ);
                                                                                                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue3), length, spannableStringBuilder.length(), 33);
                                                                                                c335560DDm3.LLILLL.LLILLJJLI.setText(spannableStringBuilder);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                C335560DDm c335560DDm4 = this.LLILZLL;
                                                                                if (c335560DDm4 != null) {
                                                                                    CheckoutIntent checkoutIntentLLLZ4 = LLLZ();
                                                                                    if (checkoutIntentLLLZ4 != null && (map2 = checkoutIntentLLLZ4.passThrough) != null) {
                                                                                        str2 = map2.get("channel_name");
                                                                                    } else {
                                                                                        str2 = null;
                                                                                    }
                                                                                    C20512315Of c20512315Of = c335560DDm4.LLILZIL.LLILLL;
                                                                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                                                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20512315Of);
                                                                                    c20512315Of.setLayoutParams(layoutParams);
                                                                                    c335560DDm4.LLILZIL.LL.setLayoutDirection(3);
                                                                                    c335560DDm4.LLILZIL.LLILLL.setLayoutDirection(3);
                                                                                    C335530DDj c335530DDj = c335560DDm4.LLILZIL;
                                                                                    LinearLayout linearLayout = c335530DDj.LL;
                                                                                    C20512315Of c20512315Of2 = c335530DDj.LLILLL;
                                                                                    TuxTextView tuxTextView2 = c335530DDj.LLILZ;
                                                                                    this.LLJJIJIIJIL = new C0DG6(linearLayout, c20512315Of2, tuxTextView2, c335530DDj.LLILLJJLI, new AwS583S0100000_4(this, str2, 349));
                                                                                    String string = getString(2131857585);
                                                                                    if (tuxTextView2 != null) {
                                                                                        tuxTextView2.setText(string);
                                                                                    }
                                                                                    C0DG6 c0dg6 = this.LLJJIJIIJIL;
                                                                                    if (c0dg6 != null) {
                                                                                        c0dg6.LJI();
                                                                                    }
                                                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                                    sbLIZ2.append("TY.setupWaterfall: root=");
                                                                                    sbLIZ2.append(System.identityHashCode(c335560DDm4.LLILZIL.LL));
                                                                                    sbLIZ2.append(" rv=");
                                                                                    sbLIZ2.append(System.identityHashCode(c335560DDm4.LLILZIL.LLILLL));
                                                                                    sbLIZ2.append(" scroll=");
                                                                                    sbLIZ2.append(System.identityHashCode(c335560DDm4.LLILZLL));
                                                                                    sbLIZ2.append(" rootH=");
                                                                                    sbLIZ2.append(c335560DDm4.LLILZIL.LL.getHeight());
                                                                                    sbLIZ2.append(" rvLpH=");
                                                                                    ViewGroup.LayoutParams layoutParams2 = c335560DDm4.LLILZIL.LLILLL.getLayoutParams();
                                                                                    if (layoutParams2 != null) {
                                                                                        numValueOf = Integer.valueOf(layoutParams2.height);
                                                                                    } else {
                                                                                        numValueOf = null;
                                                                                    }
                                                                                    sbLIZ2.append(numValueOf);
                                                                                    C2188811AlT.LIZIZ(sbLIZ2);
                                                                                }
                                                                                String str4 = null;
                                                                                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0D4Q(this, null), 3);
                                                                                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0D4R(this, null), 3);
                                                                                CheckoutIntent checkoutIntentLLLZ5 = LLLZ();
                                                                                if (checkoutIntentLLLZ5 != null) {
                                                                                    map = checkoutIntentLLLZ5.passThrough;
                                                                                } else {
                                                                                    map = null;
                                                                                }
                                                                                CheckoutIntent checkoutIntentLLLZ6 = LLLZ();
                                                                                if (checkoutIntentLLLZ6 != null && (list = checkoutIntentLLLZ6.items) != null) {
                                                                                    checkoutLineItemContext = (CheckoutLineItemContext) C13LP.LJJJLL(list);
                                                                                } else {
                                                                                    checkoutLineItemContext = null;
                                                                                }
                                                                                C0DCK c0dck = C0DCK.LIZ;
                                                                                C335560DDm c335560DDm5 = this.LLILZLL;
                                                                                if (c335560DDm5 != null) {
                                                                                    constraintLayout = c335560DDm5.LL;
                                                                                } else {
                                                                                    constraintLayout = null;
                                                                                }
                                                                                String str5 = (String) this.LLJJ.getValue();
                                                                                String str6 = (String) this.LLJILLL.getValue();
                                                                                if (checkoutLineItemContext != null) {
                                                                                    str = checkoutLineItemContext.productId;
                                                                                    str4 = checkoutLineItemContext.variantId;
                                                                                } else {
                                                                                    str = null;
                                                                                }
                                                                                C0DCK.LIZ(c0dck, this, this, constraintLayout, map, null, str5, str6, str, new C516501zn(str4, 1));
                                                                                ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.thankyou.ThankYouActivity", "onCreate", false);
                                                                                return;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ2.getResources().getResourceName(i3)));
                                                }
                                                i = R.id.m70;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ.getResources().getResourceName(i2)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }

    public final void LLLZIL(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[thankyou][exit] stage=");
        sbLIZ.append(str);
        sbLIZ.append(", detail=");
        sbLIZ.append(str2);
        sbLIZ.append(", hasNavigatedAway=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isPhysicalBackPressed=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", exitMethod=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", orderId=");
        String strLLZ = LLZ(LLLZ());
        if (strLLZ == null) {
            strLLZ = "";
        }
        sbLIZ.append(strLLZ);
        sbLIZ.append(", shopId=");
        sbLIZ.append((String) this.LLJJ.getValue());
        sbLIZ.append(", productId=");
        sbLIZ.append((String) this.LLJJI.getValue());
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
