package com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.liveevent;

import X.AbstractC1388700mF2;
import X.AbstractC21673619ry;
import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C11JF;
import X.C11S5;
import X.C1336205Ku;
import X.C1379050lzT;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21673919s1;
import X.C313300CPw;
import X.C452501pT;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.common.perfmonitor.firstdraw.FirstFramePerfMon;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.viewmodel.MultiGuestLiveEventViewModel;
import com.ss.android.ugc.aweme.sharer.model.MultiGuestLiveEventRegisteredUser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveEventRegisteredGuestFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw7KTcpOS49LSliICIjJGs/IS4hHELIOSLWs5IGE/ITMpLDk2JjFiBSYlLQA6LCEnGiArIDwnLTcpLQgmLTY4Dz0yLygpJzs=";
    public long LLILLJJLI;
    public List<MultiGuestLiveEventRegisteredUser> LLILLL;
    public RecyclerView LLILZ;
    public ViewGroup LLILZIL;
    public String LL = "";
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 605));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 606));

    public LiveEventRegisteredGuestFragment() {
        FirstFramePerfMon.LIZ.LIZIZ("live_event_registered_guest_page");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        MultiGuestLiveEventViewModel multiGuestLiveEventViewModel;
        super.onResume();
        if (this.LLILLJJLI <= 0 || (multiGuestLiveEventViewModel = (MultiGuestLiveEventViewModel) this.LLIZ.getValue()) == null) {
            return;
        }
        String str = this.LL;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C313300CPw.LIZ.getClass();
        multiGuestLiveEventViewModel.LL = (C11JF) C313300CPw.LIZIZ.LIZ(str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.00rI
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiGuestLiveEventViewModel@9fae.removeRedDots$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse.status_code == 0 && baseResponse.error_code == 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("remove red dots failed,msg:");
                    sbLIZ.append(baseResponse.message);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                C1C7U.LIZIZ("MultiGuestLiveEventViewModel@9fae.removeRedDots$1");
            }
        }, new C09JN() { // from class: X.00OB
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MultiGuestLiveEventViewModel@9fae.removeRedDots$2");
                C1C7U.LIZIZ("MultiGuestLiveEventViewModel@9fae.removeRedDots$2");
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cow, viewGroup, false);
        this.LLILZ = (RecyclerView) viewTd.findViewById(R.id.eqp);
        this.LLILZIL = (ViewGroup) viewTd.findViewById(R.id.eqq);
        RecyclerView recyclerView = this.LLILZ;
        C19GS c19gs = null;
        if (recyclerView != null) {
            FirstFramePerfMon.LIZ.LIZ(recyclerView, "live_event_registered_guest_page", null);
        }
        if (C1336205Ku.LIZJ().LIZJ()) {
            ViewGroup viewGroup2 = this.LLILZIL;
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(8, viewGroup2);
            }
        } else {
            RecyclerView recyclerView2 = this.LLILZ;
            if (recyclerView2 != null) {
                recyclerView2.setHasFixedSize(true);
                final Context context = recyclerView2.getContext();
                recyclerView2.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.liveevent.LiveEventRegisteredGuestFragment$setupContactListRecyclerView$1$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                        super.onLayoutCompleted(c21673919s1);
                    }
                });
                recyclerView2.setAdapter((AbstractC21673619ry) this.LLILZLL.getValue());
                final Context context2 = recyclerView2.getContext();
                recyclerView2.addOnScrollListener(new C1379050lzT(context2) { // from class: X.0ljI
                    @Override // X.C1379050lzT, X.AbstractC1585810rMx
                    public final void LJJIIJ(RecyclerView recyclerView3, int i) {
                        View currentFocus;
                        Window window;
                        super.LJJIIJ(recyclerView3, i);
                        if (i == 1) {
                            C19EG activity = this.LLILLJJLI.getActivity();
                            if (activity != null && (window = activity.getWindow()) != null) {
                                currentFocus = window.getCurrentFocus();
                            } else {
                                currentFocus = null;
                            }
                            KeyboardUtils.LIZIZ(currentFocus);
                        }
                    }
                });
            }
            List<MultiGuestLiveEventRegisteredUser> list = this.LLILLL;
            if (list == null || list.isEmpty()) {
                z = true;
            }
            if (!z) {
                ((AbstractC1388700mF2) this.LLILZLL.getValue()).LLLIIIIL(list);
            }
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
