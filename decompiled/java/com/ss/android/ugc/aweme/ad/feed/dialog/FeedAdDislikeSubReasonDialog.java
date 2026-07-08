package com.ss.android.ugc.aweme.ad.feed.dialog;

import X.C01GW;
import X.C098200Yq;
import X.C0DR4;
import X.C1064930dop;
import X.C1064970dot;
import X.C11NJ;
import X.C1389890mGx;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C452501pT;
import X.C737330Sw7;
import X.C786410Ut5;
import X.InterfaceC1064920doo;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeReasonModel;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedAdDislikeSubReasonDialog extends GlobalHookDialogFragment implements View.OnClickListener {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQoZyk2LSFiLSHELIOSYyJCorZwk2LSENLQs6OyklIioAPSceLC4gJysIIC4/JyI=";
    public RecyclerView LL;
    public TuxIconView LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 58));
    public boolean LLILZ = true;
    public final C11NJ LLILZIL = new C11NJ();

    public final C1064970dot MR() {
        return (C1064970dot) this.LLILLL.getValue();
    }

    public final RecyclerView NR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tva) : null;
            this.LL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1064920doo callback;
        if (view != null && view.getId() == R.id.lc0) {
            this.LLILZ = false;
            dismiss();
            C1064970dot c1064970dotMR = MR();
            if (c1064970dotMR != null && (callback = c1064970dotMR.getCallback()) != null) {
                callback.onDismiss();
            }
            C19EG activity = getActivity();
            if (activity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(2131830711);
                c1389890mGx.LJIIJJI();
            }
            C20684815ws.onEventV3("cancel_subcategory");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.i7);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        InterfaceC1064920doo callback;
        super.onDismiss(dialogInterface);
        if (this.LLILZ) {
            C1064970dot c1064970dotMR = MR();
            if (c1064970dotMR != null && (callback = c1064970dotMR.getCallback()) != null) {
                callback.onDismiss();
            }
            C20684815ws.onEventV3("cancel_subcategory");
            C19EG activity = getActivity();
            if (activity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(2131830711);
                c1389890mGx.LJIIJJI();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<AdDislikeReasonModel> list;
        C0DR4 c0dr4;
        AdDislikeInfo dislikeInfo;
        Window window;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
        C1064970dot c1064970dotMR = MR();
        View viewFindViewById = null;
        if (c1064970dotMR != null && (dislikeInfo = c1064970dotMR.getDislikeInfo()) != null) {
            list = dislikeInfo.categoryList;
        } else {
            list = null;
        }
        NR().setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView recyclerViewNR = NR();
        if (list != null) {
            c0dr4 = new C0DR4(list, new C1064930dop(this));
        } else {
            c0dr4 = null;
        }
        recyclerViewNR.setAdapter(c0dr4);
        NR().setOverScrollMode(2);
        if (C737330Sw7.LIZIZ) {
            ((TextView) view.findViewById(R.id.tv_title)).setText(2131828428);
        } else {
            ((TextView) view.findViewById(R.id.tv_title)).setText(2131830708);
        }
        View view2 = this.LLILLJJLI;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.lc0);
            }
            this.LLILLJJLI = (TuxIconView) viewFindViewById;
            view2 = viewFindViewById;
        }
        C786410Ut5.a9((TuxIconView) view2, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bmd, viewGroup, false);
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
