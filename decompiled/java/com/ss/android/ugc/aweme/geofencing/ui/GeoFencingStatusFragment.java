package com.ss.android.ugc.aweme.geofencing.ui;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.AnonymousClass0105;
import X.C098200Yq;
import X.C0IPK;
import X.C0OM1;
import X.C10HS;
import X.C11NJ;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13BV;
import X.C13LQ;
import X.C1685300txQ;
import X.C189200o6;
import X.C19216110Fr;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.C960203pA;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionFragment;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class GeoFencingStatusFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiIpJik2JiHELIOSYlJyh9PSxiDio8DiAiKiY9LxY4KDsmOwM+KCg+LSs4";
    public TuxNavBar LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public RecyclerView LLILZ;
    public C0IPK LLILZIL;
    public C10HS LLILZLL;
    public C0OM1 LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ = -1;

    public final TuxTextView MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iu7) : null;
            this.LLILLJJLI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C10HS c10hs;
        if (!this.LLIZLLLIL && (c10hs = this.LLILZLL) != null) {
            C0IPK c0ipk = this.LLILZIL;
            if (c0ipk == null) {
                c0ipk = null;
            }
            c10hs.LIZ(this.LLJ, c0ipk.LLLFZ());
        }
        super.onDestroy();
        C19216110Fr.LIZ.getClass();
        ((C11NJ) C19216110Fr.LIZJ.getValue()).LJ();
        AnonymousClass0105.LIZIZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object serializable;
        List listLJJLL;
        boolean z;
        final String string;
        Object[] objArr;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("extra.region.list");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof TranslatedRegion[]) || (objArr = (Object[]) serializable) == null || (listLJJLL = C13LQ.LJJLL(objArr)) == null) {
            listLJJLL = C13BV.INSTANCE;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("extra.read_only");
        } else {
            z = false;
        }
        C0OM1 c0om1 = new C0OM1();
        this.LLIZ = c0om1;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS572S0100000_28(this, 222));
        c0om1.LIZIZ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131844967);
        c0om1.LIZJ = c1250250idj;
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.p15);
            } else {
                viewFindViewById = null;
            }
            this.LL = (TuxNavBar) viewFindViewById;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById;
        C0OM1 c0om12 = this.LLIZ;
        if (c0om12 == null) {
            c0om12 = null;
        }
        tuxNavBar.setNavActions(c0om12);
        View viewFindViewById2 = this.LL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.p15);
            } else {
                viewFindViewById2 = null;
            }
            this.LL = (TuxNavBar) viewFindViewById2;
        }
        ((TuxNavBar) viewFindViewById2).LJIIZILJ(true);
        if (z) {
            MR().setTextColor(C960203pA.LIZ(R.attr.a1h, requireActivity()));
            MR().setText(2131849929);
            View viewFindViewById3 = this.LLILLL;
            if (viewFindViewById3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById3 = view4.findViewById(R.id.iu9);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILLL = (TuxTextView) viewFindViewById3;
            }
            ((TextView) viewFindViewById3).setText(2131849922);
        } else {
            Bundle arguments3 = getArguments();
            if (arguments3 == null || (string = arguments3.getString("enter_from")) == null) {
                string = "video_post_page";
            }
            C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.10HR
                /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Serializable, java.lang.Object[]] */
                @Override // X.AbstractViewOnClickListenerC1173120gdK
                public final void LIZ(View view5) {
                    C10HZ c10hz = C10HZ.LIZ;
                    String str = string;
                    c10hz.getClass();
                    C20684815ws.LJIILLIIL("add_geofencing", C2097908Jt.LIZJ(new Pair("enter_from", str)));
                    C0IPK c0ipk = this.LLILZIL;
                    if (c0ipk == null) {
                        c0ipk = null;
                    }
                    List<TranslatedRegion> listLLLFZ = c0ipk.LLLFZ();
                    String str2 = string;
                    int i = this.LLJ;
                    Bundle bundle2 = new Bundle();
                    C786410Ut5.LJJIZ(bundle2, "extra.region.list", listLLLFZ.toArray(new TranslatedRegion[0]));
                    C786410Ut5.LJJJI("enter_from", str2, bundle2);
                    bundle2.putInt("active_history_index", i);
                    GeoFencingSelectionFragment geoFencingSelectionFragment = new GeoFencingSelectionFragment();
                    geoFencingSelectionFragment.setArguments(bundle2);
                    final GeoFencingStatusFragment geoFencingStatusFragment = this;
                    geoFencingSelectionFragment.LLJILJIL = new C10HS() { // from class: X.10HQ
                        @Override // X.C10HS
                        public final void LIZ(int i2, List list) {
                            C0IPK c0ipk2 = geoFencingStatusFragment.LLILZIL;
                            if (c0ipk2 == null) {
                                c0ipk2 = null;
                            }
                            c0ipk2.getClass();
                            c0ipk2.LLILLL = new ArrayList(list);
                            c0ipk2.notifyDataSetChanged();
                            geoFencingStatusFragment.LLJ = i2;
                        }
                    };
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJJIJI = geoFencingSelectionFragment;
                    tuxSheet.LLJLILLLLZIIL = false;
                    c1390920mIc.LJIIIIZZ(1);
                    int iLJIIIIZZ = (int) (((double) C12ES.LJIIIIZZ(this.requireActivity())) * 0.9d);
                    TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                    tuxSheet2.LLJJL = iLJIIIIZZ;
                    tuxSheet2.LLILLL = true;
                    tuxSheet2.LLJLLIL = true;
                    tuxSheet2.show(this.requireActivity().getSupportFragmentManager(), "GeoFencingSelectionFragment");
                }
            }, MR());
        }
        this.LLILZIL = new C0IPK(requireActivity(), listLJJLL, z);
        View viewFindViewById4 = this.LLILZ;
        if (viewFindViewById4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById4 = view5.findViewById(R.id.ium);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILZ = (RecyclerView) viewFindViewById4;
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        C0IPK c0ipk = this.LLILZIL;
        if (c0ipk == null) {
            c0ipk = null;
        }
        recyclerView.setAdapter(c0ipk);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        C19216110Fr.LIZ.getClass();
        C19216110Fr.LIZIZ(null, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c8p, viewGroup, false);
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
