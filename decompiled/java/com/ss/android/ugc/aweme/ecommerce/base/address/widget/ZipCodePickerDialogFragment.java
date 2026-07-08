package com.ss.android.ugc.aweme.ecommerce.base.address.widget;

import X.AnonymousClass0317;
import X.AnonymousClass0378;
import X.C034S;
import X.C03AA;
import X.C049Z;
import X.C098200Yq;
import X.C10508049a;
import X.C1120604Zw;
import X.C1685300txQ;
import X.C1748720vbi;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C422610Ghf;
import X.C786410Ut5;
import X.InterfaceC1164530gPT;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS39S0100100_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ZipCodePickerDialogFragment extends ECBaseFragment implements InterfaceC1164530gPT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZy43HELIOSLDcpOjx9PywoLionZh8lOQw8LCAcICw4LTcIIC4/JyIKOy40JSAiPQ==";
    public TuxTextView LLILLL;
    public RecyclerView LLILZ;
    public TuxIconView LLILZIL;
    public TuxSheet LLILZLL;
    public long LLIZ;
    public String LLIZLLLIL = "close";
    public Integer LLJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "Select Postcode";
    }

    public final RecyclerView VR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.txt_res_0x7f0a6b42) : null;
            this.LLILZ = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLIZ != 0) {
            C1748720vbi.LIZIZ(this, new C10508049a(), new AwS39S0100100_1(SystemClock.elapsedRealtime() - this.LLIZ, this, 0));
            this.LLIZ = 0L;
        }
        this.LLILZLL = null;
        AnonymousClass0378.LIZ().LIZJ("ec_zipcode_selected_event", this);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        this.LLIZLLLIL = ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).isAppBackGround() ? "close" : requireActivity().isFinishing() ? "return" : "next";
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS580S0100000_1(this, 65));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass0378.LIZ().LIZLLL("ec_zipcode_selected_event", this);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        TuxSheet tuxSheet;
        if (Intrinsics.LJFF(str, "ec_zipcode_selected_event") && (tuxSheet = this.LLILZLL) != null) {
            tuxSheet.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> stringArrayList;
        Integer numValueOf;
        String string;
        super.onViewCreated(view, bundle);
        this.LLIZ = SystemClock.elapsedRealtime();
        Bundle arguments = getArguments();
        View viewFindViewById = null;
        if (arguments != null) {
            stringArrayList = arguments.getStringArrayList("zipcode");
        } else {
            stringArrayList = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("title")) != null) {
            View viewFindViewById2 = this.LLILLL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.tv_title);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILLL = (TuxTextView) viewFindViewById2;
            }
            ((TextView) viewFindViewById2).setText(string);
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            numValueOf = Integer.valueOf(arguments3.getInt("is_change_address_after_pay"));
        } else {
            numValueOf = null;
        }
        this.LLJ = numValueOf;
        if (stringArrayList != null) {
            VR().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            C03AA c03aa = new C03AA();
            VR().setAdapter(c03aa);
            VR().addItemDecoration(new C422610Ghf(getContext(), 1));
            c03aa.LL = stringArrayList;
            c03aa.notifyDataSetChanged();
        }
        View view3 = this.LLILZIL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById = view4.findViewById(R.id.jyb);
            }
            this.LLILZIL = (TuxIconView) viewFindViewById;
            view3 = viewFindViewById;
        }
        C786410Ut5.I7(new AjS60S0100000_1(this, 14), view3);
        C1748720vbi.LIZLLL(view, new C049Z(), new AwS580S0100000_1((ArrayList) stringArrayList, (ArrayList<String>) 66));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ajn, viewGroup, false);
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
