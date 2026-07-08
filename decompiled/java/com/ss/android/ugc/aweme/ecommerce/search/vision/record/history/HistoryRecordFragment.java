package com.ss.android.ugc.aweme.ecommerce.search.vision.record.history;

import X.AbstractC21673619ry;
import X.AbstractC712240Rwk;
import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C15438062q;
import X.C1685300txQ;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1A3P;
import X.C1A3Q;
import X.C1A3S;
import X.C20632315oP;
import X.C2187451AjH;
import X.C616540OGe;
import X.C786410Ut5;
import X.InterfaceC1846110y8n;
import Y.AObjectS250S0100000_33;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.vm.HistoryRecordPageVM;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class HistoryRecordFragment extends AmeBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgLSQ+Kid9PiHELIOSw/ICA9ZjcpKiAhLGskIDwnJzc1Zwc6OzEjOzYBLSYjOysVOiQrJCo9PA==";
    public C1846060y8i LL;
    public C20632315oP LLILLJJLI;
    public TuxNavBar LLILLL;
    public HistoryRecordPageVM LLILZ;
    public final C1251150ifB LLILZIL;
    public final AObjectS250S0100000_33 LLILZLL;
    public final AObjectS250S0100000_33 LLIZ;

    public final TuxNavBar MR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jpt) : null;
            this.LLILLL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final C20632315oP NR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jpu) : null;
            this.LLILLJJLI = (C20632315oP) viewFindViewById;
        }
        return (C20632315oP) viewFindViewById;
    }

    public final C1846060y8i OR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jq3) : null;
            this.LL = (C1846060y8i) viewFindViewById;
        }
        return (C1846060y8i) viewFindViewById;
    }

    public HistoryRecordFragment() {
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_trash_bin;
        c1251150ifB.LIZLLL = false;
        c1251150ifB.LIZIZ = "delete";
        this.LLILZIL = c1251150ifB;
        this.LLILZLL = new AObjectS250S0100000_33(this, 1);
        this.LLIZ = new AObjectS250S0100000_33(this, 0);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Context context;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(HistoryRecordFragment.class.getName());
        }
        super.onResume();
        HistoryRecordPageVM historyRecordPageVM = this.LLILZ;
        if (historyRecordPageVM == null) {
            historyRecordPageVM = null;
        }
        if (!historyRecordPageVM.LLILZIL || (context = getContext()) == null) {
            return;
        }
        HistoryRecordPageVM historyRecordPageVM2 = this.LLILZ;
        if (historyRecordPageVM2 == null) {
            historyRecordPageVM2 = null;
        }
        for (C1A3S c1a3s : (ArrayList) historyRecordPageVM2.LL) {
            C1A3P c1a3p = c1a3s.LJIIIZ;
            historyRecordPageVM2.zQ2(context, c1a3s, new C1A3P(0, c1a3p.LIZ + c1a3p.LIZIZ, 4, 0), false, null);
        }
        historyRecordPageVM2.LLILZIL = false;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b1578", (String) null);
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        PhotoSearchEnterParams photoSearchEnterParams;
        long jCurrentTimeMillis;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        HistoryRecordPageVM historyRecordPageVM = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("photo_search_enter_param");
        } else {
            serializable = null;
        }
        if (serializable instanceof PhotoSearchEnterParams) {
            photoSearchEnterParams = (PhotoSearchEnterParams) serializable;
        } else {
            photoSearchEnterParams = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            jCurrentTimeMillis = arguments2.getLong("intent_value_time_open_history_page");
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        HistoryRecordPageVM historyRecordPageVM2 = (HistoryRecordPageVM) ViewModelProviders.of(this).get(HistoryRecordPageVM.class);
        this.LLILZ = historyRecordPageVM2;
        if (historyRecordPageVM2 == null) {
            historyRecordPageVM2 = null;
        }
        Context context = getContext();
        if (context == null) {
            historyRecordPageVM2.getClass();
        } else {
            historyRecordPageVM2.LLILZ = photoSearchEnterParams;
            historyRecordPageVM2.LLILZLL = jCurrentTimeMillis;
            historyRecordPageVM2.xQ2(context);
        }
        HistoryRecordPageVM historyRecordPageVM3 = this.LLILZ;
        if (historyRecordPageVM3 == null) {
            historyRecordPageVM3 = null;
        }
        List<C1A3S> list = historyRecordPageVM3.LL;
        ArrayList<String> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(((C1A3S) it2.next()).LIZIZ);
        }
        for (String str : arrayList) {
            C1845940y8W c1845940y8WLJIIIZ = OR().LJIIIZ();
            c1845940y8WLJIIIZ.LIZIZ(str);
            C1846060y8i c1846060y8iOR = OR();
            c1846060y8iOR.LIZIZ(c1845940y8WLJIIIZ, c1846060y8iOR.LLILZLL.size(), c1846060y8iOR.LLILZLL.isEmpty());
        }
        this.LLILZIL.LIZJ(new AwS577S0100000_33(this, 4151));
        TuxNavBar tuxNavBarMR = MR();
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS577S0100000_33(this, 4150));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getResources().getString(2131832845);
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZIZ(this.LLILZIL);
        tuxNavBarMR.setNavActions(c0om1);
        OR().LIZ(new InterfaceC1846110y8n() { // from class: X.1A3N
            @Override // X.InterfaceC1846110y8n
            public final void LIZ(C1845940y8W c1845940y8W) {
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZJ(C1845940y8W c1845940y8W) {
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZIZ(C1845940y8W c1845940y8W) {
                HistoryRecordPageVM historyRecordPageVM4 = this.LIZ.LLILZ;
                if (historyRecordPageVM4 == null) {
                    historyRecordPageVM4 = null;
                }
                int i = c1845940y8W.LIZLLL;
                historyRecordPageVM4.LLILLL = historyRecordPageVM4.LLILLJJLI.LIZJ();
                historyRecordPageVM4.LLILLJJLI.LJII(Integer.valueOf(i));
            }
        });
        NR().LIZIZ(new AbstractC712240Rwk() { // from class: X.1A3O
            @Override // X.AbstractC712240Rwk
            public final void onPageSelected(int i) {
                HistoryRecordPageVM historyRecordPageVM4 = this.LL.LLILZ;
                if (historyRecordPageVM4 == null) {
                    historyRecordPageVM4 = null;
                }
                historyRecordPageVM4.LLILLL = historyRecordPageVM4.LLILLJJLI.LIZJ();
                historyRecordPageVM4.LLILLJJLI.LJII(Integer.valueOf(i));
            }
        });
        C20632315oP c20632315oPNR = NR();
        final HistoryRecordPageVM historyRecordPageVM4 = this.LLILZ;
        if (historyRecordPageVM4 == null) {
            historyRecordPageVM4 = null;
        }
        c20632315oPNR.setAdapter(new AbstractC21673619ry<C1A3Q>(historyRecordPageVM4) { // from class: X.19iY
            public final HistoryRecordPageVM LL;

            @Override // X.AbstractC21673619ry
            public final int getItemViewType(int i) {
                return i;
            }

            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return ((ArrayList) this.LL.LL).size();
            }

            {
                this.LL = historyRecordPageVM4;
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                C679750QlR c679750QlR;
                C1A3Q c1a3q = (C1A3Q) viewHolder;
                C1A3S c1a3sWQ2 = this.LL.wQ2(i);
                if (c1a3sWQ2 != null) {
                    c1a3q.LLILLJJLI = c1a3sWQ2;
                    AbstractC21673619ry adapter = c1a3q.LLILZ.getAdapter();
                    if ((adapter instanceof C679750QlR) && (c679750QlR = (C679750QlR) adapter) != null) {
                        c679750QlR.LLLFZ(c1a3sWQ2.LJIILIIL);
                    }
                }
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                Object objLIZ;
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.brm, viewGroup, false);
                HistoryRecordPageVM historyRecordPageVM5 = this.LL;
                Context context2 = viewTd.getContext();
                int size = ((ArrayList) historyRecordPageVM5.LL).size();
                C01GW c01gw = C21615319iZ.LIZIZ;
                if (size != ((String[]) c01gw.getValue()).length) {
                    historyRecordPageVM5.xQ2(context2);
                }
                List<C1A3S> list2 = historyRecordPageVM5.LL;
                if (i >= 0 && i < ((ArrayList) list2).size()) {
                    objLIZ = ListProtector.get(list2, i);
                } else {
                    objLIZ = C09HL.LIZ(context2, ((String[]) c01gw.getValue())[i % ((String[]) c01gw.getValue()).length]);
                }
                C1A3Q c1a3q = new C1A3Q(viewTd, (C1A3S) objLIZ, this.LL);
                try {
                    View view2 = c1a3q.itemView;
                    if (view2 != null) {
                        view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c1a3q.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c1a3q.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C1A3Q.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c1a3q.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c1a3q.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C1A3Q.class.getName();
                return c1a3q;
            }
        });
        HistoryRecordPageVM historyRecordPageVM5 = this.LLILZ;
        if (historyRecordPageVM5 == null) {
            historyRecordPageVM5 = null;
        }
        historyRecordPageVM5.LLILLJJLI.LIZ(this, this.LLILZLL);
        HistoryRecordPageVM historyRecordPageVM6 = this.LLILZ;
        if (historyRecordPageVM6 != null) {
            historyRecordPageVM = historyRecordPageVM6;
        }
        historyRecordPageVM.LLILLJJLI.LIZ(this, new AObjectS250S0100000_33(this, 13));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.brn, viewGroup, false);
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
