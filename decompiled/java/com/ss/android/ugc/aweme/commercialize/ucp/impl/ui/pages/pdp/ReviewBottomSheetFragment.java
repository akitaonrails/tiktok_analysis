package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp;

import X.C01GW;
import X.C098200Yq;
import X.C0DH8;
import X.C13LE;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C23250099c;
import X.C331440Cz0;
import X.C331480Cz4;
import X.C331490Cz5;
import X.C336720DHy;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC452301pR;
import Y.AsS31S0100000_4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class ReviewBottomSheetFragment extends BaseBottomSheetFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiPCwjZiHELIOSwhOSN9PSxiOS40LTZiOSsjZhcpPyY2PwcjPTs8JRYkLConDjctLiI2JjE=";
    public final ViewModelLazy LLILLJJLI;
    public final C0DH8 LLILLL;

    public ReviewBottomSheetFragment() {
        AFwS190S0000000_4 aFwS190S0000000_4 = AFwS190S0000000_4.get$arr$(967);
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS548S0100000_4(new AwS548S0100000_4((Fragment) this, 104), (Function0<Unit>) 105));
        this.LLILLJJLI = C336720DHy.LIZ(this, C13LE.LIZ(ReviewListViewModel.class), new AwS548S0100000_4(c01gwLIZ, 106), new AwS405S0200000_4((Function0) null, c01gwLIZ, 15), aFwS190S0000000_4);
        this.LLILLL = new C0DH8();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("arg_channel_name")) != null) {
            ReviewListViewModel reviewListViewModel = (ReviewListViewModel) this.LLILLJJLI.getValue();
            reviewListViewModel.LLILZLL = string;
            if ((reviewListViewModel.LLILLJJLI.getValue() instanceof C331480Cz4) || (reviewListViewModel.LLILLJJLI.getValue() instanceof C331490Cz5)) {
                reviewListViewModel.LLILZ = CardStruct.IStatusCode.DEFAULT;
                ((ArrayList) reviewListViewModel.LLILZIL).clear();
                reviewListViewModel.vQ2();
            }
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tug);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(this.LLILLL);
        recyclerView.addOnScrollListener(new AsS31S0100000_4(this, 7));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C331440Cz0(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i5d, viewGroup, false);
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
