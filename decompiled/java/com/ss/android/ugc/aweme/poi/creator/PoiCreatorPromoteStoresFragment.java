package com.ss.android.ugc.aweme.poi.creator;

import X.C03H5;
import X.C098200Yq;
import X.C0QSJ;
import X.C0ZP4;
import X.C1192290h8F;
import X.C1197440hGY;
import X.C1198600hIQ;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1207450hWh;
import X.C1220000hqw;
import X.C1388190mED;
import X.C13LE;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C300190Bph;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1205470hTV;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1206390hUz;
import X.InterfaceC1207030hW1;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiCreatorPromoteStoresFragment extends BasePage implements InterfaceC724530SbT, InterfaceC1206390hUz, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEwOiAtPSHELIOSAhZhUjIAwhLSQ4Jj0DOiohJjs2GzEjOyogDjctLiI2JjE=";
    public final C736950SvV LLIZLLLIL;

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PromoteStoresScope.class});
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
        arrayList.add(PromoteStoresScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PromoteStoresScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
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

    public PoiCreatorPromoteStoresFragment() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(310);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(PoiCreatorVM.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(335), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    }

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() {
        Activity activityLIZ;
        Window window;
        View decorView;
        IBinder windowToken;
        InputMethodManager inputMethodManager;
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null || (window = activityLIZ.getWindow()) == null || (decorView = window.getDecorView()) == null || (windowToken = decorView.getWindowToken()) == null) {
            return;
        }
        Context context2 = getContext();
        Object objH2 = context2 != null ? C786410Ut5.H2(context2, "input_method") : null;
        if (!(objH2 instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) objH2) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C19EG c19egLIZIZ;
        super.onResume();
        C1197440hGY c1197440hGY = C1197440hGY.LIZIZ;
        if (c1197440hGY.LIZIZ()) {
            return;
        }
        c1197440hGY.LJI(true);
        TokenCert tokenCertWith = C1198600hIQ.LJII() ? TokenCert.Companion.with("bpea-poi_search_auto_for_precise") : TokenCert.Companion.with("bpea-poi_search_auto");
        if (C300190Bph.LIZ()) {
            ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
            if ((iLocationServiceForLS != null ? iLocationServiceForLS.LIZ(getContext(), tokenCertWith, null) : null) != EnumC1205470hTV.SUCCESS) {
                return;
            }
        }
        final AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(309);
        Context context = getContext();
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            return;
        }
        C1207450hWh c1207450hWh = C1207450hWh.LIZ;
        if (c1207450hWh.LJII(0, c19egLIZIZ)) {
            return;
        }
        c1207450hWh.LJIJJ("poi", "add_location", tokenCertWith, c19egLIZIZ, null, new InterfaceC1207030hW1() { // from class: X.0hEL
            @Override // X.InterfaceC1207030hW1
            public final void LIZIZ(int i, String str) {
            }

            @Override // X.InterfaceC1207030hW1
            public final void LIZJ(int i) {
            }

            @Override // X.InterfaceC1207030hW1
            public final void LIZ() {
                aFwS206S0000000_18.invoke();
            }
        }, null);
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(activity, ImmersionBar.LJIILJJIL(activity));
        tuxImmersionBar.LJIIIIZZ(R.attr.bx);
        tuxImmersionBar.LJ(R.attr.bx);
        tuxImmersionBar.LIZ(true);
        tuxImmersionBar.LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    @Override // X.InterfaceC1206390hUz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r8) {
        /*
            r7 = this;
            X.00zU r5 = new X.00zU
            r5.<init>()
            java.lang.String r0 = "0"
            r5.element = r0
            X.0SvV r0 = r7.LLIZLLLIL
            java.lang.Object r2 = r0.getValue()
            com.bytedance.assem.arch.viewModel.AssemViewModel r2 = (com.bytedance.assem.arch.viewModel.AssemViewModel) r2
            kotlin.jvm.internal.AwS597S0100000_18 r1 = new kotlin.jvm.internal.AwS597S0100000_18
            r0 = 912(0x390, float:1.278E-42)
            r1.<init>(r5, r0)
            X.C736680Sv4.LJIJJ(r2, r1)
            android.content.Context r1 = r7.getContext()
            r3 = 1
            if (r1 == 0) goto L9e
            X.0hMC r0 = X.C1200940hMC.LIZ
            r0.getClass()
            boolean r0 = X.C1200940hMC.LIZIZ(r1)
            if (r0 != r3) goto L9e
            r4 = 1
        L2e:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT> r0 = com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT.class
            java.lang.Object r1 = r1.getService(r0)
            com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT r1 = (com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT) r1
            boolean r2 = r1.LJJIJ()
            android.content.Context r0 = r7.getContext()
            if (r0 == 0) goto L9c
            boolean r0 = r1.LJ(r0)
            if (r0 != r3) goto L9c
        L4a:
            X.0SvV r0 = r7.LLIZLLLIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.poi.creator.PoiCreatorVM r0 = (com.ss.android.ugc.aweme.poi.creator.PoiCreatorVM) r0
            com.ss.android.ugc.aweme.poi.PoiMobParam r0 = r0.LLILLJJLI
            if (r0 == 0) goto L9a
            java.lang.String r6 = r0.creationId
        L58:
            X.0hJ6 r0 = X.C1199020hJ6.LIZ
            T r1 = r5.element
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.getClass()
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r0 = "is_has_available_stores"
            X.C1189060h32.LJJIFFI(r2, r0, r1)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "video_post_page"
            X.C1189060h32.LJJIFFI(r2, r1, r0)
            java.lang.String r0 = "enable_location"
            X.C1189060h32.LJIJJLI(r2, r0, r5)
            java.lang.String r0 = "inapp_is_precise"
            X.C1189060h32.LJIJJLI(r2, r0, r4)
            java.lang.String r0 = "system_is_precise"
            X.C1189060h32.LJIJJLI(r2, r0, r3)
            java.lang.String r0 = "creation_id"
            X.C1189060h32.LJJIFFI(r2, r0, r6)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "enter_promote_stores_tab"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L9a:
            r6 = 0
            goto L58
        L9c:
            r3 = 0
            goto L4a
        L9e:
            r4 = 0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.creator.PoiCreatorPromoteStoresFragment.onPageSelected(int):void");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 284), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1192290h8F.LIZ(this, "poi_influencer_promote_stores", null, false, null, null, 30);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dz8, viewGroup, false);
        C19GS c19gs = null;
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
