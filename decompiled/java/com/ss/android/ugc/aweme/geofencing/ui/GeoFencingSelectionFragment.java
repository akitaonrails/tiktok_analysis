package com.ss.android.ugc.aweme.geofencing.ui;

import X.AbstractC19484711Kz;
import X.AnonymousClass0105;
import X.C010E;
import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0I7D;
import X.C10HS;
import X.C10HZ;
import X.C11NJ;
import X.C11S5;
import X.C1203130hPj;
import X.C1308910kAL;
import X.C13BV;
import X.C13LQ;
import X.C1582500rHc;
import X.C1582580rHk;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C1749280vcc;
import X.C189200o6;
import X.C19216110Fr;
import X.C19EG;
import X.C19GS;
import X.C20509915Nh;
import X.C452501pT;
import X.C470510Icj;
import X.C473080Igs;
import X.C521840KdK;
import X.C786410Ut5;
import X.EnumC1166860gTE;
import X.InterfaceC1203170hPn;
import X.InterfaceC1487280oo2;
import Y.ACListenerS162S0100000_28;
import Y.ACListenerS89S1100000_28;
import Y.AfS176S0100000_7;
import Y.AfS53S1100000_28;
import Y.AkS471S0100000_7;
import Y.AsS54S0100000_28;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.geofencing.api.GeoFencingHistoryApi;
import com.ss.android.ugc.aweme.geofencing.data.HistoryEntry;
import com.ss.android.ugc.aweme.geofencing.data.HistoryListResponse;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class GeoFencingSelectionFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiIpJik2JiYlHELIOSJyh9PSxiDio8DiAiKiY9LxYpJSowPCwjJwkhKSIhLCEn";
    public RecyclerView LL;
    public C0I7D LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public LinearLayout LLILZLL;
    public C1203130hPj LLIZ;
    public C470510Icj LLIZLLLIL;
    public List<TranslatedRegion> LLJIJIL;
    public C10HS LLJILJIL;
    public C1749280vcc LLJILJILJ;
    public View LLJILLL;
    public boolean LLJJ;
    public C20509915Nh LLJJI;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(190));
    public final C11NJ LLJI = new C11NJ();
    public List<HistoryEntry> LLJJIII = C13BV.INSTANCE;
    public int LLJJIJI = -1;

    public final void LJ() {
        View view = this.LLJILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C786410Ut5.LLIZLLLIL(PR(), 8);
        LinearLayout linearLayoutOR = OR();
        if (linearLayoutOR != null) {
            C786410Ut5.LJZL(8, linearLayoutOR);
        }
        C1749280vcc c1749280vcc = this.LLJILJILJ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
        }
        C1749280vcc c1749280vcc2 = this.LLJILJILJ;
        if (c1749280vcc2 != null) {
            c1749280vcc2.LJ();
        }
    }

    public final void MR() {
        C19216110Fr c19216110Fr = C19216110Fr.LIZ;
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 73);
        AwS607S0100000_28 awS607S0100000_282 = new AwS607S0100000_28(this, 74);
        c19216110Fr.getClass();
        if (C19216110Fr.LIZIZ.isEmpty()) {
            C19216110Fr.LIZIZ(awS607S0100000_28, awS607S0100000_282);
        } else {
            awS607S0100000_28.invoke(C473080Igs.LIZ(C19216110Fr.LIZIZ));
        }
    }

    public final C1203130hPj NR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iu_) : null;
            this.LLIZ = (C1203130hPj) viewFindViewById;
        }
        return (C1203130hPj) viewFindViewById;
    }

    public final LinearLayout OR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iua) : null;
            this.LLILZLL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final RecyclerView PR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iuf) : null;
            this.LL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final TuxTextView RR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iuh) : null;
            this.LLILLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView SR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iui) : null;
            this.LLILZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C0I7D UR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iuk) : null;
            this.LLILLJJLI = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((C11NJ) this.LLJ.getValue()).dispose();
        this.LLJI.LJ();
        this.LLJJIII = C13BV.INSTANCE;
        C10HZ.LIZ.getClass();
        C10HZ.LIZJ = false;
        C20509915Nh c20509915Nh = this.LLJJI;
        if (c20509915Nh != null) {
            c20509915Nh.LIZIZ();
        }
        this.LLJJI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object serializable;
        List<TranslatedRegion> listLJJLL;
        final String string;
        AbstractC19484711Kz abstractC19484711KzLJIILL;
        Object[] objArr;
        super.onViewCreated(view, bundle);
        this.LLJILJILJ = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLJILLL = view.findViewById(R.id.iuj);
        LJ();
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("extra.region.list");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof TranslatedRegion[]) || (objArr = (Object[]) serializable) == null || (listLJJLL = C13LQ.LJJLL(objArr)) == null) {
            listLJJLL = C13BV.INSTANCE;
        }
        this.LLJIJIL = listLJJLL;
        Iterator<TranslatedRegion> it2 = listLJJLL.iterator();
        while (it2.hasNext()) {
            it2.next().setSelected(true);
        }
        Bundle arguments2 = getArguments();
        int i = -1;
        if (arguments2 != null) {
            i = arguments2.getInt("active_history_index", -1);
        }
        this.LLJJIJI = i;
        this.LLIZLLLIL = new C470510Icj(C13BV.INSTANCE, listLJJLL);
        RecyclerView recyclerViewPR = PR();
        C470510Icj c470510Icj = this.LLIZLLLIL;
        if (c470510Icj == null) {
            c470510Icj = null;
        }
        recyclerViewPR.setAdapter(c470510Icj);
        recyclerViewPR.setLayoutManager(new LinearLayoutManager(recyclerViewPR.getContext()));
        recyclerViewPR.addOnScrollListener(new AsS54S0100000_28(this, 4));
        C11NJ c11nj = (C11NJ) this.LLJ.getValue();
        C470510Icj c470510Icj2 = this.LLIZLLLIL;
        if (c470510Icj2 == null) {
            c470510Icj2 = null;
        }
        c11nj.LIZ(c470510Icj2.LLILLL.LJJJJZI(new AkS471S0100000_7(c470510Icj2, 9)).LJJLJLI(new AfS176S0100000_7(this, 260)));
        UR().addTextChangedListener(new C521840KdK(this, 6));
        C786410Ut5.h9(SR(), new ACListenerS162S0100000_28(this, 120));
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.iu8);
            } else {
                viewFindViewById = null;
            }
            this.LLILZIL = (TuxTextView) viewFindViewById;
        }
        C786410Ut5.h9((TuxTextView) viewFindViewById, new ACListenerS162S0100000_28(this, 121));
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string = arguments3.getString("enter_from")) == null) {
            string = "video_post_page";
        }
        C786410Ut5.h9(RR(), new ACListenerS89S1100000_28(this, string, 1));
        C10HZ.LIZ.getClass();
        C10HZ.LIZJ = false;
        C1203130hPj c1203130hPjNR = NR();
        if (c1203130hPjNR != null) {
            Context contextRequireContext = requireContext();
            c1203130hPjNR.setSelectionStyle(new C1582500rHc(C1308910kAL.LIZJ(R.attr.zq, contextRequireContext), C1308910kAL.LIZJ(R.attr.a00, contextRequireContext), null, C1308910kAL.LIZJ(R.attr.a1j, contextRequireContext)));
            c1203130hPjNR.setVariant(EnumC1166860gTE.CAPSULE);
            c1203130hPjNR.setWidthRule(new C1582580rHk(0, 0, 6));
            c1203130hPjNR.setHorizontalMargin(16);
            c1203130hPjNR.getRecyclerView().setNestedScrollingEnabled(false);
            c1203130hPjNR.setOnSelectedChangeListener(new InterfaceC1203170hPn() { // from class: X.10Ha
                @Override // X.InterfaceC1203170hPn
                public final void LIZ(int i2, boolean z, AbstractC1203190hPp abstractC1203190hPp) throws JSONException {
                    Set setLLIIJI;
                    Set setLLIIJI2;
                    C1203130hPj c1203130hPjNR2;
                    HistoryEntry historyEntry;
                    List<String> list;
                    GeoFencingSelectionFragment geoFencingSelectionFragment = this.LIZ;
                    String str = string;
                    geoFencingSelectionFragment.getClass();
                    if (abstractC1203190hPp == C1203210hPr.LIZ) {
                        int i3 = geoFencingSelectionFragment.LLJJIJI;
                        if (i3 >= 0 && i3 < geoFencingSelectionFragment.LLJJIII.size()) {
                            setLLIIJI = C13LP.LLIIJI(((HistoryEntry) ListProtector.get(geoFencingSelectionFragment.LLJJIII, i3)).regionCodes);
                        } else {
                            setLLIIJI = C08CX.INSTANCE;
                        }
                        if (!z || (historyEntry = (HistoryEntry) C13LP.LJJJLZIJ(i2, geoFencingSelectionFragment.LLJJIII)) == null || (list = historyEntry.regionCodes) == null || (setLLIIJI2 = C13LP.LLIIJI(list)) == null) {
                            setLLIIJI2 = C08CX.INSTANCE;
                        }
                        Set setLJII = C15442062u.LJII(setLLIIJI, setLLIIJI2);
                        Set setLJII2 = C15442062u.LJII(setLLIIJI2, setLLIIJI);
                        if (!setLJII.isEmpty()) {
                            C470510Icj c470510Icj3 = geoFencingSelectionFragment.LLIZLLLIL;
                            if (c470510Icj3 == null) {
                                c470510Icj3 = null;
                            }
                            c470510Icj3.getClass();
                            if (!setLJII.isEmpty()) {
                                Set setLLIIJI3 = C13LP.LLIIJI(setLJII);
                                boolean z2 = false;
                                for (TranslatedRegion translatedRegion : c470510Icj3.LL) {
                                    if (setLLIIJI3.contains(translatedRegion.code) && translatedRegion.selected) {
                                        translatedRegion.setSelected(false);
                                        z2 = true;
                                    }
                                }
                                if (z2) {
                                    c470510Icj3.LLILLL.onNext(Boolean.FALSE);
                                    c470510Icj3.notifyDataSetChanged();
                                }
                            }
                        }
                        if (!setLJII2.isEmpty()) {
                            C470510Icj c470510Icj4 = geoFencingSelectionFragment.LLIZLLLIL;
                            if (c470510Icj4 == null) {
                                c470510Icj4 = null;
                            }
                            c470510Icj4.getClass();
                            if (!setLJII2.isEmpty()) {
                                Set setLLIIJI4 = C13LP.LLIIJI(setLJII2);
                                boolean z3 = false;
                                for (TranslatedRegion translatedRegion2 : c470510Icj4.LL) {
                                    if (setLLIIJI4.contains(translatedRegion2.code) && !translatedRegion2.selected) {
                                        translatedRegion2.setSelected(true);
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    c470510Icj4.LLILLL.onNext(Boolean.TRUE);
                                    c470510Icj4.notifyDataSetChanged();
                                }
                            }
                        }
                        if (!setLLIIJI2.isEmpty()) {
                            C470510Icj c470510Icj5 = geoFencingSelectionFragment.LLIZLLLIL;
                            if (c470510Icj5 == null) {
                                c470510Icj5 = null;
                            }
                            c470510Icj5.LLLIIIIL(C13LP.LLIIII(setLLIIJI2));
                        } else {
                            C470510Icj c470510Icj6 = geoFencingSelectionFragment.LLIZLLLIL;
                            if (c470510Icj6 == null) {
                                c470510Icj6 = null;
                            }
                            c470510Icj6.LLLIIIIL(null);
                        }
                        int i4 = -1;
                        if (z) {
                            if (i3 != -1 && i3 != i2 && (c1203130hPjNR2 = geoFencingSelectionFragment.NR()) != null) {
                                c1203130hPjNR2.LIZ(i3, false, C1203200hPq.LIZ);
                            }
                            i4 = i2;
                        }
                        geoFencingSelectionFragment.LLJJIJI = i4;
                        C10HZ c10hz = C10HZ.LIZ;
                        if (!z) {
                            i2 = i3;
                        }
                        c10hz.getClass();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("enter_from", str);
                        jSONObject.put("click_position", i2);
                        jSONObject.put("click_status", z ? 1 : 0);
                        C20684815ws.LJIJ("geofencing_history_click", jSONObject);
                    }
                }
            });
            LinearLayout linearLayoutOR = OR();
            if (linearLayoutOR != null) {
                C786410Ut5.LJZL(8, linearLayoutOR);
            }
            C11NJ c11nj2 = this.LLJI;
            List<HistoryEntry> list = AnonymousClass0105.LIZIZ;
            if (list != null) {
                abstractC19484711KzLJIILL = AbstractC19484711Kz.LJIJJLI(list);
            } else {
                GeoFencingHistoryApi.LIZ.getClass();
                abstractC19484711KzLJIILL = C010E.LIZIZ.getValue().listHistory().LJJIJIIJI(C11S5.LIZ()).LJIL(new InterfaceC1487280oo2() { // from class: X.00DK
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        HistoryListResponse historyListResponse = (HistoryListResponse) obj;
                        if (historyListResponse.statusCode == 0) {
                            List<HistoryEntry> list2 = historyListResponse.history;
                            if (list2 == null) {
                                return C13BV.INSTANCE;
                            }
                            return list2;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("geofencing/history/list/ failed: code=");
                        sbLIZ.append(historyListResponse.statusCode);
                        sbLIZ.append(", msg=");
                        sbLIZ.append(historyListResponse.statusMsg);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }).LJIILL(new C09JN() { // from class: X.0107
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("GeoFencingHistoryDataSource@c205.list$3");
                        AnonymousClass0105.LIZIZ = (List) obj;
                        C1C7U.LIZIZ("GeoFencingHistoryDataSource@c205.list$3");
                    }
                });
            }
            c11nj2.LIZ(abstractC19484711KzLJIILL.LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS53S1100000_28(this, string, 9), new C09JN() { // from class: X.0108
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GeoFencingSelectionFragment@c4a.setupHistoryBlock$3");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("history/list/ failed: ");
                    sbLIZ.append(((Throwable) obj).getMessage());
                    C201955140j.LJFF("GeoFencingSelectionFragment", C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("GeoFencingSelectionFragment@c4a.setupHistoryBlock$3");
                }
            }));
        }
        MR();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.j2, viewGroup, false);
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
