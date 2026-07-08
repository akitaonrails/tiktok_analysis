package com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C054G;
import X.C06SD;
import X.C098200Yq;
import X.C0DX8;
import X.C0I0B;
import X.C0OM1;
import X.C0PEM;
import X.C11JF;
import X.C11NZ;
import X.C1239300iM4;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13BV;
import X.C1400340mXo;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C452501pT;
import X.C456160Hug;
import X.C786410Ut5;
import X.C860370Xp5;
import X.C860390Xp7;
import X.C869590Y9l;
import X.C879250YeR;
import X.C914170Ztf;
import X.InterfaceC344240DeY;
import X.InterfaceC455400HtS;
import X.InterfaceC879300YeW;
import X.InterfaceC904740ZeS;
import Y.AObserverS206S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageReactionAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheet;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheetViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes15.dex */
public final class IMReactionListSheet extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw3I2svIS4nZiMpKDsmOiHELIOSBiOyoyKzElJiF9OiAtKjs6JysgIDwnZgwBGyoyKzElJiEfITY4Gic2LTE=";
    public C869590Y9l LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 614));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 613));
    public final C054G LLJI = C2296808zG.LIZ(C0PEM.LIZJ.plus(new C914170Ztf(CoroutineExceptionHandler.LJJLIL, 3)).plus(C2296908zH.LIZ()));
    public final C456160Hug LLJIJIL = new C456160Hug(C13BV.INSTANCE, 48.0d, new InterfaceC455400HtS() { // from class: X.0YuW
        @Override // X.InterfaceC455400HtS
        public final void LIZ(InterfaceC879330YeZ interfaceC879330YeZ) {
        }
    });
    public C11NZ<InterfaceC904740ZeS> LLJILJIL;
    public Function0<? extends C869590Y9l> LLJILJILJ;
    public C11JF LLJILLL;
    public InterfaceC879300YeW LLJJ;

    public final IMReactionListSheetViewModel SR() {
        return (IMReactionListSheetViewModel) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = requireContext().getString(2131831623);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS558S0100000_14(this, 612));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        C11JF c11jf = this.LLJILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJILLL = null;
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().removeObserver(SR());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C11JF c11jf = this.LLJILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11NZ<InterfaceC904740ZeS> c11nz = this.LLJILJIL;
        if (c11nz != null) {
            this.LLJILLL = C1239300iM4.LJ(c11nz, C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new C06SD(this));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLIZ = (C869590Y9l) requireArguments().getSerializable("message");
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C860370Xp5(this, null), 3);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SR().LLILZIL.observe(getViewLifecycleOwner(), new AObserverS206S0100000_2(this, 15));
        getLifecycle().addObserver(SR());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.stm);
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        recyclerView.setAdapter((AbstractC21673619ry) this.LLJ.getValue());
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.h0f);
        recyclerView2.setAdapter(this.LLJIJIL);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView2.getContext());
        linearLayoutManager.setOrientation(0);
        recyclerView2.setLayoutManager(linearLayoutManager);
        recyclerView2.addItemDecoration(new C0DX8(16, 14));
        C456160Hug c456160Hug = this.LLJIJIL;
        c456160Hug.LLILLL = new InterfaceC455400HtS() { // from class: X.0YeU
            @Override // X.InterfaceC455400HtS
            public final void LIZ(InterfaceC879330YeZ interfaceC879330YeZ) {
                InterfaceC879330YeZ interfaceC879330YeZ2;
                EnumC879260YeS enumC879260YeS;
                List<C459160HzW> listSingletonList;
                C459160HzW c459160HzW;
                IMReactionListSheetViewModel iMReactionListSheetViewModelSR = this.LIZ.SR();
                iMReactionListSheetViewModelSR.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (iMReactionListSheetViewModelSR.LLIZLLLIL + 600 < jCurrentTimeMillis) {
                    iMReactionListSheetViewModelSR.LLIZLLLIL = jCurrentTimeMillis;
                    IMReactionListSheet iMReactionListSheet = this.LIZ;
                    synchronized (iMReactionListSheet) {
                        try {
                            C869590Y9l c869590Y9l = iMReactionListSheet.LLIZ;
                            Object obj = null;
                            if (c869590Y9l == null) {
                                c869590Y9l = null;
                            }
                            C0I0B c0i0b = C0I0B.LJFF;
                            String curUserId = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
                            if (curUserId == null) {
                                curUserId = "";
                            }
                            if (C13LP.LJJJJ(interfaceC879330YeZ, C879250YeR.LIZJ(c869590Y9l, curUserId))) {
                                interfaceC879330YeZ2 = C879290YeV.LIZ;
                            } else {
                                interfaceC879330YeZ2 = interfaceC879330YeZ;
                            }
                            String curUserId2 = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
                            if (curUserId2 == null) {
                                curUserId2 = "";
                            }
                            if (!(interfaceC879330YeZ instanceof C459160HzW) || (c459160HzW = (C459160HzW) interfaceC879330YeZ) == null) {
                                enumC879260YeS = null;
                            } else {
                                enumC879260YeS = c459160HzW.LIZIZ;
                            }
                            if (Intrinsics.LJFF(interfaceC879330YeZ2, C879290YeV.LIZ)) {
                                IIMMessageReactionAnalytics iIMMessageReactionAnalytics = (IIMMessageReactionAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMessageReactionAnalytics.class);
                                if (iIMMessageReactionAnalytics != null) {
                                    C869590Y9l c869590Y9l2 = iMReactionListSheet.LLIZ;
                                    if (c869590Y9l2 == null) {
                                        c869590Y9l2 = null;
                                    }
                                    iIMMessageReactionAnalytics.LIZLLL(c869590Y9l2, EnumC879370Yed.REMOVE, enumC879260YeS, C0I0B.LJFF.LIZIZ());
                                }
                                IMReactionListSheetViewModel iMReactionListSheetViewModelSR2 = iMReactionListSheet.SR();
                                C869590Y9l c869590Y9l3 = iMReactionListSheet.LLIZ;
                                if (c869590Y9l3 == null) {
                                    c869590Y9l3 = null;
                                }
                                Iterator it2 = ((ArrayList) IMReactionListSheetViewModel.vQ2(iMReactionListSheetViewModelSR2, c869590Y9l3)).iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Object next = it2.next();
                                    C860410Xp9 c860410Xp9 = (C860410Xp9) next;
                                    if (c860410Xp9.LLILZ.isSelf()) {
                                        InterfaceC879330YeZ interfaceC879330YeZ3 = c860410Xp9.LL;
                                        if ((interfaceC879330YeZ3 instanceof C459160HzW) && ((C459160HzW) interfaceC879330YeZ3).LIZIZ == EnumC879260YeS.HUMAN) {
                                            obj = next;
                                            break;
                                        }
                                    }
                                }
                                C860410Xp9 c860410Xp92 = (C860410Xp9) obj;
                                if (c860410Xp92 != null) {
                                    iMReactionListSheet.SR().wQ2(c860410Xp92);
                                }
                                C456160Hug c456160Hug2 = iMReactionListSheet.LLJIJIL;
                                c456160Hug2.LL = C13BV.INSTANCE;
                                c456160Hug2.LLLIIIIL(false);
                            } else {
                                IIMMessageReactionAnalytics iIMMessageReactionAnalytics2 = (IIMMessageReactionAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMessageReactionAnalytics.class);
                                if (iIMMessageReactionAnalytics2 != null) {
                                    C869590Y9l c869590Y9l4 = iMReactionListSheet.LLIZ;
                                    if (c869590Y9l4 == null) {
                                        c869590Y9l4 = null;
                                    }
                                    iIMMessageReactionAnalytics2.LIZLLL(c869590Y9l4, EnumC879370Yed.CHANGE, enumC879260YeS, C0I0B.LJFF.LIZIZ());
                                }
                                InterfaceC879300YeW interfaceC879300YeW = iMReactionListSheet.LLJJ;
                                if (interfaceC879300YeW != null) {
                                    C869590Y9l c869590Y9l5 = iMReactionListSheet.LLIZ;
                                    if (c869590Y9l5 == null) {
                                        c869590Y9l5 = null;
                                    }
                                    interfaceC879300YeW.LIZ(c869590Y9l5, interfaceC879330YeZ);
                                }
                                IMReactionListSheetViewModel iMReactionListSheetViewModelSR3 = iMReactionListSheet.SR();
                                C869590Y9l c869590Y9l6 = iMReactionListSheet.LLIZ;
                                if (c869590Y9l6 == null) {
                                    c869590Y9l6 = null;
                                }
                                iMReactionListSheetViewModelSR3.getClass();
                                C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c869590Y9l6.getConversationId());
                                if (c0y8tLIZ != null) {
                                    C892180YzI.LIZ("reaction_panel", c869590Y9l6, curUserId2, c0y8tLIZ, interfaceC879330YeZ2, null, null);
                                }
                                if (interfaceC879330YeZ instanceof C459160HzW) {
                                    obj = (C459160HzW) interfaceC879330YeZ;
                                }
                                C456160Hug c456160Hug3 = iMReactionListSheet.LLJIJIL;
                                if (obj == null) {
                                    listSingletonList = C13BV.INSTANCE;
                                } else {
                                    listSingletonList = Collections.singletonList(obj);
                                }
                                c456160Hug3.LL = listSingletonList;
                                c456160Hug3.LLLIIIIL(false);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        };
        C869590Y9l c869590Y9l = this.LLIZ;
        if (c869590Y9l == null) {
            c869590Y9l = null;
        }
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        c456160Hug.LL = C879250YeR.LIZJ(c869590Y9l, curUserId);
        c456160Hug.LLLIIIIL(false);
        C23250099c.LIZLLL(this.LLJI, null, null, new C860390Xp7(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cp8, viewGroup, false);
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
}
