package com.bytedance.pipo.stellar.base.fragment;

import X.AnonymousClass0956;
import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C09IR;
import X.C0HA1;
import X.C0HG8;
import X.C0HG9;
import X.C0HGA;
import X.C0HGB;
import X.C0HGC;
import X.C0HGD;
import X.C0HGE;
import X.C0HGF;
import X.C0OM1;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1251150ifB;
import X.C1360720lVu;
import X.C1361400lX0;
import X.C1385040m98;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1713220ugS;
import X.C1716280ulO;
import X.C1721300utU;
import X.C1766560w4U;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C2252331DDr;
import X.C23250099c;
import X.C338490DOt;
import X.C418440Gaw;
import X.C426750GoL;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C497270Jen;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1719800ur4;
import X.InterfaceC21503819Do;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS75S0200000_6;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import com.bytedance.pipo.stellar.base.model.Image;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.resourceloader.StellarStyle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class StellarFragment extends BaseFragment implements InterfaceC724530SbT, StellarFragmentViewAbility, InterfaceC21503819Do, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs8ID88ZjY4LCM/KTdiKyHELIOS4gLWsqOy40JSAiPWEAPCAgJS4hDjctLiI2JjE=";
    public AnonymousClass0956 LLJ;
    public Function0<? extends View> LLJIJIL;
    public Function0<? extends View> LLJILJIL;
    public Function1<? super View, AnimatorSet> LLJILJILJ;
    public Function1<? super View, AnimatorSet> LLJILLL;
    public Function0<Pair<String, String>> LLJJ;
    public final AssemVMLazy LLJJIII;
    public final C2252331DDr LLJJIJI;
    public TuxNavBar LLJJIJIIJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJIL;
    public boolean LLJJJ;
    public InterfaceC1719800ur4 LLJJJIL;
    public Function0<String> LLJJJJ;
    public String LLJJJJJIL;
    public final String LLIZ = "PRIMARY_LOADING_TAG";
    public final String LLIZLLLIL = "SECONDARY_LOADING_TAG";
    public long LLJI = 3000;
    public final Stack<WeakReference<TuxSheet>> LLJJI = new Stack<>();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StellarFragment.class, "vm", "getVm()Lcom/bytedance/pipo/stellar/base/fragment/StellarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{StellarFragmentScope.class, StellarFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
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

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(StellarFragmentScope.class);
        arrayList.add(StellarFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(StellarFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -122660064) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
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

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public StellarFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StellarViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 48);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(33);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 49), aFwS268S0000000_26, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS563S0100000_19((Fragment) this, 50), aFwS268S0000000_26, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 51), aFwS268S0000000_26, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIII = assemVMLazy;
        this.LLJJIJI = C09IR.LIZIZ(Integer.MAX_VALUE, 0, null, 6);
    }

    public final StellarViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (StellarViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.pipo.stellar.base.fragment.StellarFragmentViewAbility
    public final void mL2() {
        Object c098200Yq;
        View view = getView();
        if (view != null) {
            try {
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.w30);
                if (frameLayout != null) {
                    C786410Ut5.LJJJJIZL(frameLayout);
                }
                UR(view);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1713220ugS(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C1716280ulO c1716280ulO = SR().LLILLJJLI;
        c1716280ulO.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - c1716280ulO.LJII;
        String str = c1716280ulO.LJ;
        if (str == null) {
            str = "close";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("event_type", "leave");
        linkedHashMap.put("is_load_data", c1716280ulO.LJFF);
        linkedHashMap.put("duration", String.valueOf(jCurrentTimeMillis));
        linkedHashMap.put("quit_type", str);
        c1716280ulO.LIZJ("pipo_page_stay", C2097608Jq.LJIIL(c1716280ulO.LJI, linkedHashMap));
        c1716280ulO.LJ = null;
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        C20277814Wa.LIZIZ(this);
        SR().LLILLJJLI.LJ = "return";
    }

    @Override // com.bytedance.pipo.stellar.base.fragment.StellarFragmentViewAbility
    public final ViewOnAttachStateChangeListenerC20604515jv getPowerList() {
        return this.LLJJIJIL;
    }

    public final void UR(View view) {
        View viewInvoke;
        Object c098200Yq;
        Function0<? extends View> function0 = this.LLJILJIL;
        if (function0 != null && (viewInvoke = function0.invoke()) != null) {
            try {
                ViewParent parent = viewInvoke.getParent();
                if (parent instanceof ViewGroup) {
                    C786410Ut5.LJJJLZIJ(viewInvoke, (ViewGroup) parent);
                }
                viewInvoke.setTag(this.LLIZ);
                ((FrameLayout) view.findViewById(R.id.w30)).addView(viewInvoke);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        if (this.LLJIJIL == null) {
            return;
        }
        this.LLJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0HA1(this, view, null), 3);
    }

    public final void VR(Boolean bool) {
        boolean zBooleanValue;
        Boolean boolValueOf;
        View viewFindViewById;
        Context context;
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIL();
        tuxImmersionBarLIZLLL.LIZ(false);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context2 = getContext();
            if (context2 != null && (boolValueOf = Boolean.valueOf(C960203pA.LIZIZ(context2))) != null) {
                zBooleanValue = boolValueOf.booleanValue();
            } else {
                zBooleanValue = false;
            }
        }
        tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(!zBooleanValue);
        tuxImmersionBarLIZLLL.LIZLLL();
        if ((bool != null || ((context = getContext()) != null && (bool = Boolean.valueOf(C960203pA.LIZIZ(context))) != null)) && bool.booleanValue()) {
            C19EG activity = getActivity();
            if (activity != null) {
                C1360720lVu.LIZ(activity);
            }
        } else {
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                C1360720lVu.LIZIZ(activity2);
            }
        }
        View view = getView();
        if (view != null && (viewFindViewById = view.findViewById(R.id.p2h)) != null) {
            C426750GoL.LJIIL(viewFindViewById, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C497270Jen.LIZ(44))))), null, null, 29);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C786410Ut5.LJJJI("verify_id", SR().LLJJIII, bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.pipo.stellar.base.fragment.StellarFragmentViewAbility
    public final void vU0(StellarStyle stellarStyle) {
        Context c1361400lX0;
        BackgroundDO backgroundDO;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.LLJJJ) {
            return;
        }
        Boolean boolXQ2 = SR().xQ2();
        if (boolXQ2 == null) {
            c1361400lX0 = getContext();
        } else {
            Context context = getContext();
            boolean zBooleanValue = boolXQ2.booleanValue();
            if (context == null) {
                c1361400lX0 = null;
            } else {
                c1361400lX0 = new C1361400lX0(context, C1385040m98.LIZJ(zBooleanValue));
            }
        }
        if (stellarStyle != null) {
            backgroundDO = stellarStyle.background;
        } else {
            backgroundDO = null;
        }
        View view = getView();
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null && backgroundDO != null) {
            View view2 = new View(getContext());
            C786410Ut5.W5(view2, new ViewGroup.MarginLayoutParams(-1, -1));
            C1721300utU.LIZ.getClass();
            C1721300utU.LIZ(view2, backgroundDO, null);
            viewGroup.addView(view2, 0);
        }
        VR(boolXQ2);
        if (c1361400lX0 == null) {
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(c1361400lX0, null);
        C786410Ut5.E6(viewOnAttachStateChangeListenerC20604515jv, new ViewGroup.MarginLayoutParams(-1, -1));
        viewOnAttachStateChangeListenerC20604515jv.setClipChildren(false);
        viewOnAttachStateChangeListenerC20604515jv.setClipToPadding(false);
        View view3 = getView();
        if (view3 != null && (viewGroup2 = (ViewGroup) view3.findViewById(R.id.w34)) != null) {
            viewGroup2.addView(viewOnAttachStateChangeListenerC20604515jv);
        }
        this.LLJJIJIL = viewOnAttachStateChangeListenerC20604515jv;
        this.LLJJJ = true;
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WR(java.util.List r15, boolean r16) {
        /*
            r14 = this;
            r6 = 0
            r9 = r14
            if (r16 == 0) goto L8e
            com.bytedance.tux.navigation.TuxNavBar r1 = r9.LLJJIJIIJIL
            if (r1 == 0) goto L97
            r0 = 2131382566(0x7f0a5126, float:1.8385481E38)
        Lb:
            android.view.View r4 = r1.findViewById(r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == 0) goto L97
            int r3 = r4.getChildCount()
            r11 = 0
        L18:
            if (r11 >= r3) goto L97
            android.view.View r2 = r4.getChildAt(r11)
            r10 = r15
            if (r10 == 0) goto L8c
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r10, r11)
            com.bytedance.pipo.stellar.base.model.NavbarActionDO r0 = (com.bytedance.pipo.stellar.base.model.NavbarActionDO) r0
            if (r0 == 0) goto L2d
            com.bytedance.pipo.stellar.base.model.ImageDO r8 = r0.icon
            if (r8 != 0) goto L3f
        L2d:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r10, r11)
            com.bytedance.pipo.stellar.base.model.NavbarActionDO r0 = (com.bytedance.pipo.stellar.base.model.NavbarActionDO) r0
            if (r0 == 0) goto L8c
            java.util.List<com.bytedance.pipo.stellar.base.model.ImageDO> r0 = r0.replaceIcons
            if (r0 == 0) goto L8c
            java.lang.Object r8 = X.C13LP.LJJJLL(r0)
            com.bytedance.pipo.stellar.base.model.ImageDO r8 = (com.bytedance.pipo.stellar.base.model.ImageDO) r8
        L3f:
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            if (r8 == 0) goto L70
            java.util.Map r0 = r8.getTrackingParams()
            if (r0 == 0) goto L70
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L54:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = r0.toString()
            r12.put(r1, r0)
            goto L54
        L70:
            java.lang.String r1 = "event_type"
            java.lang.String r0 = "show"
            r12.put(r1, r0)
            if (r8 == 0) goto L89
            boolean r1 = X.C1720520usE.LIZIZ(r8)
            r0 = 1
            if (r1 != r0) goto L89
            kotlin.jvm.internal.AwS18S0401000_26 r7 = new kotlin.jvm.internal.AwS18S0401000_26
            r13 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.C2211631BhB.LJ(r2, r7)
        L89:
            int r11 = r11 + 1
            goto L18
        L8c:
            r8 = r6
            goto L3f
        L8e:
            com.bytedance.tux.navigation.TuxNavBar r1 = r9.LLJJIJIIJIL
            if (r1 == 0) goto L97
            r0 = 2131382555(0x7f0a511b, float:1.8385459E38)
            goto Lb
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.stellar.base.fragment.StellarFragment.WR(java.util.List, boolean):void");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strInvoke;
        ViewGroup viewGroup;
        Pair<String, String> pairInvoke;
        String string;
        super.onViewCreated(view, bundle);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, StellarFragmentViewAbility.class, null, null);
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 50), 3);
        InterfaceC1719800ur4 interfaceC1719800ur4 = this.LLJJJIL;
        if (interfaceC1719800ur4 != null) {
            if (bundle != null && (string = bundle.getString("verify_id")) != null) {
                SR().LLJJIII = string;
            }
            String str = this.LLJJJJJIL;
            if (str != null) {
                SR().LLJJIII = str;
            }
            SR().LLILZIL = interfaceC1719800ur4;
        }
        StellarViewModel stellarViewModelSR = SR();
        Function0<String> function0 = this.LLJJJJ;
        if (function0 != null) {
            strInvoke = function0.invoke();
        } else {
            strInvoke = null;
        }
        stellarViewModelSR.LLJJIJI = strInvoke;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0HG8(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0HGD(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0HGF(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0HGC(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0HGA(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0HGB(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0HG9(this, null), 3);
        TuxNavBar tuxNavBar = new TuxNavBar(requireContext(), null, 6);
        C786410Ut5.S6(tuxNavBar, new ViewGroup.LayoutParams(-1, -2));
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1518));
        c0om1.LJ(c1251150ifB);
        Function0<Pair<String, String>> function02 = this.LLJJ;
        if (function02 != null && (pairInvoke = function02.invoke()) != null) {
            String first = pairInvoke.getFirst();
            String second = pairInvoke.getSecond();
            ViewGroup viewGroup2 = (ViewGroup) tuxNavBar.findViewById(R.id.p1k);
            if (viewGroup2 != null) {
                AppCompatImageView appCompatImageView = new AppCompatImageView(viewGroup2.getContext());
                C1721300utU c1721300utU = C1721300utU.LIZ;
                ImageDO imageDO = new ImageDO(2, "123", "23", null, null, null, new Image(null, first), new Image(null, second), null, null, null, null);
                c1721300utU.getClass();
                C1721300utU.LJIJI(appCompatImageView, imageDO, null);
                C786410Ut5.LJJJJI(viewGroup2);
                viewGroup2.addView(appCompatImageView);
            }
        }
        tuxNavBar.setNavActions(c0om1);
        tuxNavBar.setNavBackground(0);
        View view2 = getView();
        if (view2 != null && (viewGroup = (ViewGroup) view2.findViewById(R.id.p2h)) != null) {
            viewGroup.addView(tuxNavBar);
            C426750GoL.LJIIL(viewGroup, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C497270Jen.LIZ(44))))), null, null, 29);
        }
        this.LLJJIJIIJIL = tuxNavBar;
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0uru
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1720190urh) obj).LLILZ;
            }
        }, null, new AwS640S0100000_26(this, 146), 6);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0HGE(this, null), 3);
        HandlerHook.viewPost(view, new ARunnableS75S0200000_6(view, this, 21));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        C19GS c19gs = null;
        if (bundle != null) {
            string = bundle.getString("verify_id");
        } else {
            string = null;
        }
        this.LLJJJJJIL = string;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c9p, viewGroup, false);
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
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
