package com.ss.android.ugc.aweme.ecommerce.showcase.mix.view;

import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0QSJ;
import X.C0ZP4;
import X.C1161850gL9;
import X.C1163360gNa;
import X.C1166160gS6;
import X.C1166230gSD;
import X.C1166240gSE;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1537720q7O;
import X.C1685300txQ;
import X.C1739050vM7;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C21146717pB;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C893803eS;
import X.EnumC1161690gKt;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.mix.base.MixDataCenterScope;
import com.ss.android.ugc.aweme.ecommerce.mix.base.MixEventCenterScope;
import com.ss.android.ugc.aweme.ecommerce.mix.model.TabBarItemData;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.viewmodel.StoreMixViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public class StoreLynxTabFragment extends ECBaseFragment implements InterfaceC724530SbT, InterfaceC1146704e9 {
    public static final C1166160gS6 LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgICHELIOSo7Ki4gLWshIDd9PiwpPmEAPCo+LAMqJj0YKC0VOiQrJCo9PA==";
    public C1537720q7O LLILLL;
    public n LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public FrameLayout LLIZLLLIL;
    public volatile IRavenDataAbility LLJIJIL;
    public volatile IRavenEventAbility LLJILJIL;
    public InterfaceC665370Q7z LLJILJILJ;
    public C0QSJ LLJILLL;
    public C0QSJ LLJJ;
    public String LLIZ = "";
    public final C01GW LLJ = C452501pT.LIZIZ(new C1166230gSD(this));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 206));

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0gS6] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoreLynxTabFragment.class, "ravenDataAbility", "getRavenDataAbility()Lcom/bytedance/sdk/xbridge/protocol/impl/communication/abilities/IRavenDataAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(StoreLynxTabFragment.class, "ravenEventAbility", "getRavenEventAbility()Lcom/bytedance/sdk/xbridge/protocol/impl/communication/abilities/IRavenEventAbility;", 0)};
        LLJJI = new Object() { // from class: X.0gS6
        };
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MixEventCenterScope.class, MixDataCenterScope.class});
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
        arrayList.add(MixEventCenterScope.class);
        arrayList.add(MixDataCenterScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final TabBarItemData VR() {
        return (TabBarItemData) this.LLJ.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        return "unkonw";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String WR() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.ecommerce.showcase.settings.ECMixStorePageSchemaComponentData[] r0 = X.C1166610gSp.LIZ
            java.lang.Long r5 = r6.bS()
            com.ss.android.ugc.aweme.ecommerce.showcase.settings.ECMixStorePageSchemaComponentData[] r4 = X.C1166610gSp.LIZ()
            int r3 = r4.length
            r2 = 0
        Lc:
            if (r2 >= r3) goto L1c
            r1 = r4[r2]
            java.lang.Long r0 = r1.type
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L1f
            java.lang.String r0 = r1.name
            if (r0 != 0) goto L1e
        L1c:
            java.lang.String r0 = "unkonw"
        L1e:
            return r0
        L1f:
            int r2 = r2 + 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreLynxTabFragment.WR():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x003a, PHI: r1
      0x0029: PHI (r1v4 X.0QSJ) = (r1v3 X.0QSJ), (r1v9 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0036, B:17:0x0038, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility ZR() {
        /*
            r4 = this;
            com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility r1 = r4.LLJILJIL
            if (r1 != 0) goto L3e
            monitor-enter(r4)
            com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility r1 = r4.LLJILJIL     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L3d
            X.0QSJ r1 = r4.LLJJ     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJILJILJ     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L3a
            r4.LLJILJILJ = r3     // Catch: java.lang.Throwable -> L3a
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.mix.base.MixEventCenterScope> r1 = com.ss.android.ugc.aweme.ecommerce.mix.base.MixEventCenterScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3a
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3a
            r4.LLJJ = r1     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            r1 = 0
            goto L36
        L29:
            java.lang.Class<com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility> r0 = com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility.class
            java.lang.Object r1 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3a
            com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility r1 = (com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility) r1     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility> r0 = com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility.class
            X.C687700QyG.LJ(r1, r0)     // Catch: java.lang.Throwable -> L3a
        L36:
            r4.LLJILJIL = r1     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            return r1
        L3a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L3d:
            monitor-exit(r4)
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreLynxTabFragment.ZR():com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility");
    }

    public final C1166240gSE aS() {
        return (C1166240gSE) this.LLJI.getValue();
    }

    public final void cS() {
        n nVar;
        Boolean bool;
        Set<Map.Entry<String, k>> setEntrySet;
        if (!this.LLILZLL || (nVar = this.LLILZ) == null || this.LLILLL == null) {
            return;
        }
        k kVarLJJIIZ = nVar.LJJIIZ("timingInfo");
        if (kVarLJJIIZ != null) {
            kVarLJJIIZ.LJIILIIL().LJJIII(Long.valueOf(System.currentTimeMillis()), "update_res_to_lynx");
        }
        TabBarItemData tabBarItemDataVR = VR();
        if (tabBarItemDataVR != null) {
            n nVar2 = new n();
            C1166240gSE c1166240gSEAS = aS();
            nVar2.LJJIIJ("page_id", c1166240gSEAS != null ? c1166240gSEAS.LIZ : null);
            String str = tabBarItemDataVR.tabName;
            if (str == null) {
                str = "";
            }
            nVar2.LJJIIJ("list_name", str);
            nVar2.LJJIIJ("list_num", String.valueOf(tabBarItemDataVR.index));
            nVar2.LJJIIJ("list_set", this.LLIZ);
            Long l = tabBarItemDataVR.tabType;
            nVar2.LJJIII(Long.valueOf(l != null ? l.longValue() : -1L), "list_index_type");
            nVar.LJJIFFI("activeTabInfo", nVar2);
        }
        C1166240gSE c1166240gSEAS2 = aS();
        C1161850gL9.LIZ(c1166240gSEAS2 != null ? c1166240gSEAS2.LIZ : null, EnumC1161690gKt.FIRST_TAB_UPDATE_DATA, null, null);
        C1537720q7O c1537720q7O = this.LLILLL;
        if (c1537720q7O != null) {
            c1537720q7O.updateData(String.valueOf(this.LLILZ), (String) null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(WR());
        sbLIZ.append("_update");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Pair[] pairArr = new Pair[2];
        n nVar3 = this.LLILZ;
        pairArr[0] = new Pair("is_init", Integer.valueOf((nVar3 == null || (setEntrySet = nVar3.entrySet()) == null) ? 0 : setEntrySet.size()));
        TabBarItemData tabBarItemDataVR2 = VR();
        pairArr[1] = new Pair("is_default_tab", (tabBarItemDataVR2 == null || (bool = tabBarItemDataVR2.isMain) == null) ? CardStruct.IStatusCode.DEFAULT : C893803eS.LIZ(bool.booleanValue()));
        C1161850gL9.LIZJ(strLIZIZ, C2097608Jq.LJIIJ(pairArr));
        this.LLILZ = null;
    }

    public final Long bS() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return Long.valueOf(arguments.getLong("tab_id"));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C1537720q7O c1537720q7O = this.LLILLL;
        if (c1537720q7O != null) {
            c1537720q7O.LLD(true);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C1537720q7O c1537720q7O;
        super.onPause();
        if (requireActivity() instanceof StoreMixActivity) {
            if (requireActivity().isFinishing() || (c1537720q7O = this.LLILLL) == null) {
                return;
            }
            c1537720q7O.onHide();
            return;
        }
        C1537720q7O c1537720q7O2 = this.LLILLL;
        if (c1537720q7O2 != null) {
            c1537720q7O2.onHide();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c A[Catch: all -> 0x011d, PHI: r1
      0x010c: PHI (r1v28 X.0QSJ) = (r1v27 X.0QSJ), (r1v33 X.0QSJ) binds: [B:54:0x00f0, B:59:0x0108] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:51:0x00ea, B:53:0x00ee, B:55:0x00f2, B:57:0x00f6, B:58:0x00fc, B:62:0x0119, B:63:0x011b, B:61:0x010c), top: B:121:0x00ea }] */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreLynxTabFragment.onResume():void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        if (C1163360gNa.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onViewCreated: ");
            sbLIZ.append(bS());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("is_main", false)) {
            C1166240gSE c1166240gSEAS = aS();
            if (c1166240gSEAS != null) {
                str = c1166240gSEAS.LIZ;
            } else {
                str = null;
            }
            C1161850gL9.LIZ(str, EnumC1161690gKt.FIRST_TAB_CREATE_START, null, null);
        }
        StoreMixFragment storeMixFragment = (StoreMixFragment) requireParentFragment();
        if (storeMixFragment != null) {
            StoreMixViewModel storeMixViewModelZS = storeMixFragment.zS();
            storeMixViewModelZS.wQ2(3, new AwS384S0200000_18(this, storeMixViewModelZS, 33));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        if (C1739050vM7.LIZIZ) {
            viewTd = C21146717pB.LIZIZ(requireContext(), R.layout.bsg, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.bsg, viewGroup, false);
        }
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
