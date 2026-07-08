package com.ss.android.ugc.profile.business.ur.following.ui;

import X.AbstractC1252750ihl;
import X.AbstractC848400XPy;
import X.AnonymousClass0412;
import X.C004I;
import X.C01GW;
import X.C03H5;
import X.C0QTN;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XQ7;
import X.C0ZP4;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1249160iby;
import X.C1249170ibz;
import X.C1250380idw;
import X.C1253930ijf;
import X.C1254880ilC;
import X.C1265680j2c;
import X.C1265690j2d;
import X.C1265780j2m;
import X.C1308910kAL;
import X.C1388190mED;
import X.C13LE;
import X.C1634100scq;
import X.C1644460stY;
import X.C1697810uHb;
import X.C1765020w20;
import X.C1770850wBP;
import X.C1886700zCG;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EH;
import X.C2217381BqS;
import X.C299020Bno;
import X.C335910DEv;
import X.C452070Ho5;
import X.C452501pT;
import X.C666390QBx;
import X.C686870Qwv;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC335920DEw;
import X.InterfaceC0148002o;
import X.InterfaceC1075600e62;
import X.InterfaceC1171660gay;
import X.InterfaceC1264910j1N;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1740760vOs;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC530790Krl;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.RelationTabViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowRelationTabActivity extends BaseActivity implements InterfaceC1171660gay, InterfaceC1075600e62<AnonymousClass0412>, InterfaceC1740760vOs, InterfaceC530790Krl, InterfaceC724530SbT {
    public static final C1250380idw LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTdiHELIOSLyA/JCo7ICE0ZjAlZwk8JCkjPh02JCQ4ICA9HCQuCCwnITMlPTY=";
    public final AnonymousClass0412 LL = new AnonymousClass0412();
    public final lifecycleAwareLazy LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public final C01GW LLILZ;
    public C686870Qwv LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FollowRelationTabActivity.class, "followRelationTabAssemViewModel", "getFollowRelationTabAssemViewModel()Lcom/ss/android/ugc/profile/business/ur/following/ui/viewmodel/RelationTabViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = new C1250380idw();
    }

    public FollowRelationTabActivity() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FollowRelationTabViewModel.class);
        this.LLILLJJLI = new lifecycleAwareLazy(this, new AwS154S0400000_26(this, c19719912DlLIZ, AFwS303S0000000_19.get$arr$(27), c19719912DlLIZ, 15));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(RelationTabViewModel.class);
        this.LLILLL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), new AwS563S0100000_19(c19719912DlLIZ2, 2268), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2269), AFwS257S0000000_19.get$arr$(418));
        this.LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2267));
    }

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

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b7200";
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.following.ui.FollowRelationTabActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.following.ui.FollowRelationTabActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.following.ui.FollowRelationTabActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.following.ui.FollowRelationTabActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.following.ui.FollowRelationTabActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.InterfaceC530790Krl
    public final C0QTN getInflater() {
        C686870Qwv c686870Qwv = this.LLILZIL;
        if (c686870Qwv != null) {
            return c686870Qwv;
        }
        C686870Qwv c686870Qwv2 = new C686870Qwv(this);
        this.LLILZIL = c686870Qwv2;
        return c686870Qwv2;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        if (Intrinsics.LJFF(((InterfaceC1264910j1N) this.LLILZ.getValue()).iT1(), "push")) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C1388190mED.LIZ(this), "//main");
            smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
            smartRouteBuildRoute.addFlags(67108864);
            smartRouteBuildRoute.open();
            C1254880ilC.LIZ.getClass();
            C1254880ilC.LIZ(this, false, 7);
        }
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

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // X.InterfaceC1075600e62
    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory jl() {
        return this.LL;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Bundle extras;
        User curUser;
        String stringExtra2;
        String stringExtra3;
        boolean z;
        boolean zIsAccuratePrivateAccount;
        boolean zLIZ;
        String strValueOf;
        boolean z2;
        boolean z3 = true;
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.following.ui.FollowRelationTabActivity", "onCreate", true);
        activityConfiguration(AFwS257S0000000_19.get$arr$(417));
        super.onCreate(bundle);
        setContentView(R.layout.eax);
        String stringExtra4 = null;
        try {
            stringExtra = getIntent().getStringExtra("route_host_path");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (Intrinsics.LJFF(stringExtra, "profile/followerlist") && (curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser()) != null) {
            C666390QBx.LIZJ = curUser;
            Intent intent = getIntent();
            intent.putExtra("uid", curUser.getUid());
            intent.putExtra("sec_uid", curUser.getSecUid());
            intent.putExtra("follow_relation_type", "follower_relation");
            try {
                stringExtra2 = getIntent().getStringExtra("enter_from");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                stringExtra2 = null;
            }
            if (!Intrinsics.LJFF(stringExtra2, "push")) {
                stringExtra3 = "click_follow_back_notice";
            } else {
                try {
                    stringExtra3 = getIntent().getStringExtra("gd_label");
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    stringExtra3 = null;
                }
            }
            ((InterfaceC1264910j1N) this.LLILZ.getValue()).cn1(stringExtra2);
            C1253930ijf c1253930ijf = C1253930ijf.LIZ;
            String str = "";
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            String uid = curUser.getUid();
            if (uid != null) {
                str = uid;
            }
            if (!C1265690j2d.LIZJ.getValue().booleanValue() && !C1265680j2c.LIZIZ()) {
                if (curUser.getFollowerCount() < 1000) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = z2 & (!curUser.isAccuratePrivateAccount());
                if (curUser.getFriendCount() > 60) {
                    z3 = false;
                }
                zIsAccuratePrivateAccount = z3 & z4;
                String str2 = C1249160iby.LIZIZ;
                zLIZ = C1249170ibz.LIZ().LIZ();
            } else {
                if (curUser.getFollowerCount() < 1000) {
                    z = true;
                } else {
                    z = false;
                }
                zIsAccuratePrivateAccount = (true ^ curUser.isAccuratePrivateAccount()) & z;
                String str3 = C1249160iby.LIZIZ;
                zLIZ = C1249170ibz.LIZ().LIZ();
            }
            if ((zIsAccuratePrivateAccount & zLIZ) && curUser.getNewFollowerCount() > 0) {
                strValueOf = String.valueOf(curUser.getNewFollowerCount());
            } else {
                strValueOf = null;
            }
            c1253930ijf.getClass();
            C1253930ijf.LJIIJ(stringExtra2, stringExtra3, str, strValueOf);
        }
        Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI("follow_relation_tab");
        if (fragmentLJJJJZI == null) {
            fragmentLJJJJZI = new FollowRelationTabFragment();
        }
        try {
            extras = getIntent().getExtras();
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            extras = null;
        }
        fragmentLJJJJZI.setArguments(extras);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiv, fragmentLJJJJZI, "follow_relation_tab");
        c19ehLJIIJ.LJIIJ();
        getOnBackPressedDispatcher().LIZ(this, new C1265780j2m(this, 5));
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        try {
            stringExtra4 = getIntent().getStringExtra("source_btm_token");
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        btmSDK.registerBtmPageOnCreate(this, "a2270.b7200", stringExtra4);
        ActivityAgent.onTrace("com.ss.android.ugc.profile.business.ur.following.ui.FollowRelationTabActivity", "onCreate", false);
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

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws Throwable {
        int iIntValue = i;
        int[] iArr2 = iArr;
        String[] strArr2 = strArr;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11051, "com/ss/android/ugc/profile/business/ur/following/ui/FollowRelationTabActivity", "onRequestPermissionsResult", this, new Object[]{Integer.valueOf(iIntValue), strArr2, iArr2}, "void", new C0WZW(false, "(I[Ljava/lang/String;[I)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDmOIvzegUTreHXGGb6s+0fuLHVUIkKg/mUrSVtLBq65P/JphaP6I=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                iIntValue = ((Integer) obj).intValue();
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                strArr2 = (String[]) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iArr2 = (int[]) obj3;
            }
        }
        super.onRequestPermissionsResult(iIntValue, strArr2, iArr2);
        if (iIntValue == 1) {
            C1886700zCG.LIZ(this, iIntValue, iArr2);
        }
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
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
