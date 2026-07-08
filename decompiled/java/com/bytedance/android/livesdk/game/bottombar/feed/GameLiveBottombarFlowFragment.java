package com.bytedance.android.livesdk.game.bottombar.feed;

import X.AbstractC21673619ry;
import X.C098200Yq;
import X.C0DXR;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C483880IyI;
import X.C483970IyR;
import X.C483980IyS;
import X.C497740JfY;
import X.C521590Kcv;
import X.C786410Ut5;
import X.InterfaceC475680Il4;
import X.InterfaceC483890IyJ;
import X.InterfaceC483930IyN;
import X.InterfaceC484040IyY;
import Y.ARunnableS107S0100000_7;
import Y.AsS34S0100000_7;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.game.bottombar.feed.GameLiveBottombarFlowFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class GameLiveBottombarFlowFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExJzE4JiHELIOSIxKTdiLyo2LGsLKCI2BCw6LA08PDEjJC0yOgMgJjgVOiQrJCo9PA==";
    public InterfaceC483930IyN LL;
    public RecyclerView LLILLJJLI;
    public boolean LLILLL;
    public C483880IyI LLILZ = new C483880IyI((String) null, (String) null, (Map) null, (InterfaceC483890IyJ) null, 31);
    public AsS34S0100000_7 LLILZIL;
    public C483970IyR LLILZLL;

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroyView: Fragment view being destroyed, avatarId=");
        sbLIZ.append(this.LLILZ.LIZLLL);
        C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ));
        AsS34S0100000_7 asS34S0100000_7 = this.LLILZIL;
        if (asS34S0100000_7 != null) {
            RecyclerView recyclerView = this.LLILLJJLI;
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener(asS34S0100000_7);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onDestroyView: Scroll listener removed, avatarId=");
            sbLIZ2.append(this.LLILZ.LIZLLL);
            C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C483970IyR c483970IyR = this.LLILZLL;
        if (c483970IyR != null) {
            C483980IyS c483980IyS = c483970IyR.LIZLLL;
            if (c483980IyS != null) {
                c483970IyR.LIZ.removeOnScrollListener(c483980IyS);
            }
            c483970IyR.LIZJ = null;
            C20441214yg.LIZIZ("VideoPlayerScrollTrigger", "removeScrollTriggerListener");
        }
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLILLL = false;
        InterfaceC483930IyN interfaceC483930IyN = this.LL;
        if (interfaceC483930IyN != null) {
            interfaceC483930IyN.onDestroy();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPause: Fragment paused, avatarId=");
        sbLIZ.append(this.LLILZ.LIZLLL);
        C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC483930IyN interfaceC483930IyN = this.LL;
        if (interfaceC483930IyN != null) {
            interfaceC483930IyN.LLILLL();
        }
        this.LLILLL = false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume: Fragment resumed, avatarId=");
        sbLIZ.append(this.LLILZ.LIZLLL);
        C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC483930IyN interfaceC483930IyN = this.LL;
        if (interfaceC483930IyN == null) {
            return;
        }
        if (!interfaceC483930IyN.LLIIJI()) {
            if (this.LLILLL) {
                OR(0);
                return;
            } else {
                interfaceC483930IyN.LLJJJ();
                return;
            }
        }
        InterfaceC483930IyN interfaceC483930IyN2 = this.LL;
        if (interfaceC483930IyN2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("refreshData: Refreshing video data avatarId:");
            sbLIZ2.append(this.LLILZ.LIZLLL);
            C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ2));
            Context context = getContext();
            if (context == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("refreshData: Context is null, cannot refresh data, avatarId=");
                sbLIZ3.append(this.LLILZ.LIZLLL);
                C20441214yg.LJIIL("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            C483880IyI c483880IyI = this.LLILZ;
            interfaceC483930IyN2.LJZI(context, c483880IyI.LIZJ, c483880IyI.LIZ, c483880IyI.LIZIZ, c483880IyI.LIZLLL, true, new InterfaceC475680Il4() { // from class: X.0IyP
                @Override // X.InterfaceC475680Il4
                public final void LIZ(int i) {
                    GameLiveBottombarFlowFragment gameLiveBottombarFlowFragment = this.LIZ;
                    gameLiveBottombarFlowFragment.NR(i, gameLiveBottombarFlowFragment.LLILZ.LIZLLL);
                }
            });
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("refreshData: Refresh  data load request sent, avatarId=");
            sbLIZ4.append(this.LLILZ.LIZLLL);
            C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public final void OR(int i) {
        InterfaceC483930IyN interfaceC483930IyN;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView == null || (interfaceC483930IyN = this.LL) == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) == null) {
            return;
        }
        this.LLILLL = false;
        interfaceC483930IyN.LJJIJIL(viewHolderFindViewHolderForAdapterPosition, i);
    }

    public final void NR(int i, long j) {
        RecyclerView recyclerView;
        if (this.mStatusViewValid && isVisible() && isResumed()) {
            if (i > 0 && (recyclerView = this.LLILLJJLI) != null) {
                HandlerHook.viewPostDelay(recyclerView, new ARunnableS107S0100000_7(this, 83), 500L);
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshData: Refresh avatarId[");
        sbLIZ.append(j);
        sbLIZ.append("] , size:");
        sbLIZ.append(i);
        sbLIZ.append(" isViewValid:");
        sbLIZ.append(this.mStatusViewValid);
        sbLIZ.append(" isVisible:");
        sbLIZ.append(isVisible());
        sbLIZ.append(", isResumed:");
        sbLIZ.append(isResumed());
        C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL = !isResumed();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC483930IyN interfaceC483930IyNLIZJ;
        super.onViewCreated(view, bundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated: Fragment view created, initializing components, avatarId=");
        sbLIZ.append(this.LLILZ.LIZLLL);
        C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI = (RecyclerView) view.findViewById(R.id.txo);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("initViews: RecyclerView initialized successfully, avatarId=");
        sbLIZ2.append(this.LLILZ.LIZLLL);
        C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ2));
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("setupVideoGrid: Setting up video grid with spanCount=");
            sbLIZ3.append(2);
            sbLIZ3.append(", isFullScreen=");
            sbLIZ3.append(false);
            sbLIZ3.append(", avatarId=");
            sbLIZ3.append(this.LLILZ.LIZLLL);
            C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ3));
            final int iLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
            final int iLIZIZ2 = (int) C497740JfY.LIZIZ(19.0f);
            recyclerView.addItemDecoration(new C0DXR(iLIZIZ, iLIZIZ2) { // from class: X.06X6
                public final int LL = 2;
                public final int LLILLJJLI;
                public final int LLILLL;

                {
                    this.LLILLJJLI = iLIZIZ;
                    this.LLILLL = iLIZIZ2;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    int itemCount;
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    AbstractC21673619ry adapter = recyclerView2.getAdapter();
                    int i5 = 0;
                    if (adapter != null) {
                        itemCount = adapter.getItemCount();
                    } else {
                        itemCount = 0;
                    }
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
                    if (childAdapterPosition == -1) {
                        return;
                    }
                    int i6 = this.LL;
                    int i7 = childAdapterPosition % i6;
                    int i8 = childAdapterPosition / i6;
                    if (itemCount == 0) {
                        i = 0;
                    } else {
                        i = (itemCount - 1) / i6;
                    }
                    if (i7 == 0) {
                        i2 = 0;
                    } else {
                        i2 = this.LLILLJJLI / 2;
                    }
                    rect.left = i2;
                    if (i7 == i6 - 1) {
                        i3 = 0;
                    } else {
                        i3 = this.LLILLJJLI / 2;
                    }
                    rect.right = i3;
                    if (i8 == 0) {
                        i4 = 0;
                    } else {
                        i4 = this.LLILLL / 2;
                    }
                    rect.top = i4;
                    if (i8 != i) {
                        i5 = this.LLILLL / 2;
                    }
                    rect.bottom = i5;
                }
            });
            InterfaceC483890IyJ interfaceC483890IyJ = this.LLILZ.LJ;
            AbstractC21673619ry<?> abstractC21673619ryLJLJJL = null;
            if (interfaceC483890IyJ != null) {
                interfaceC483930IyNLIZJ = interfaceC483890IyJ.LIZJ(getLifecycle());
            } else {
                interfaceC483930IyNLIZJ = null;
            }
            this.LL = interfaceC483930IyNLIZJ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("setupVideoGrid: Video adapter initialized, avatarId=");
            sbLIZ4.append(this.LLILZ.LIZLLL);
            C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ4));
            if (interfaceC483930IyNLIZJ != null) {
                abstractC21673619ryLJLJJL = interfaceC483930IyNLIZJ.LJLJJL();
            }
            recyclerView.setAdapter(abstractC21673619ryLJLJJL);
            AsS34S0100000_7 asS34S0100000_7 = new AsS34S0100000_7(this, 3);
            this.LLILZIL = asS34S0100000_7;
            recyclerView.addOnScrollListener(asS34S0100000_7);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("setupVideoGrid: Scroll listener added for pagination, avatarId=");
            sbLIZ5.append(this.LLILZ.LIZLLL);
            C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ5));
            C483970IyR c483970IyR = new C483970IyR(recyclerView);
            this.LLILZLL = c483970IyR;
            InterfaceC484040IyY interfaceC484040IyY = new InterfaceC484040IyY() { // from class: X.0IyO
                @Override // X.InterfaceC484040IyY
                public final void LIZ(int i) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("onIndexLineTriggered: index ： ");
                    sbLIZ6.append(i);
                    sbLIZ6.append(", avatarId=");
                    sbLIZ6.append(this.LIZ.LLILZ.LIZLLL);
                    C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ6));
                    if (!this.LIZ.isResumed()) {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("onIndexLineTriggered: enterWatchLivePage is true, avatarId=");
                        sbLIZ7.append(this.LIZ.LLILZ.LIZLLL);
                        C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ7));
                        return;
                    }
                    this.LIZ.OR(i);
                }
            };
            C20441214yg.LIZIZ("VideoPlayerScrollTrigger", "registerScrollTriggerListener");
            c483970IyR.LIZJ = interfaceC484040IyY;
            C483980IyS c483980IyS = c483970IyR.LIZLLL;
            if (c483980IyS != null) {
                recyclerView.addOnScrollListener(c483980IyS);
            }
            GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 2);
            gridLayoutManager.LLIZ = new C521590Kcv(interfaceC483930IyNLIZJ, 2);
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        InterfaceC483930IyN interfaceC483930IyN = this.LL;
        if (interfaceC483930IyN != null) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("loadInitialData: Loading initial video data with avatarId=");
            sbLIZ6.append(this.LLILZ.LIZLLL);
            C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ6));
            Context context = getContext();
            if (context != null) {
                Map<String, String> map = this.LLILZ.LIZJ;
                if (map != null) {
                    map.put("is_in_more_list", CardStruct.IStatusCode.DEFAULT);
                }
                Map<String, String> map2 = this.LLILZ.LIZJ;
                if (map2 != null) {
                    map2.put("request_timestamp", String.valueOf(System.currentTimeMillis()));
                }
                C483880IyI c483880IyI = this.LLILZ;
                interfaceC483930IyN.LJZI(context, c483880IyI.LIZJ, c483880IyI.LIZ, c483880IyI.LIZIZ, c483880IyI.LIZLLL, true, new InterfaceC475680Il4() { // from class: X.0IyM
                    @Override // X.InterfaceC475680Il4
                    public final void LIZ(int i) {
                        Map<String, String> map3 = this.LIZ.LLILZ.LIZJ;
                        if (map3 != null) {
                            map3.put("request_success_timestamp", String.valueOf(System.currentTimeMillis()));
                        }
                        GameLiveBottombarFlowFragment gameLiveBottombarFlowFragment = this.LIZ;
                        gameLiveBottombarFlowFragment.NR(i, gameLiveBottombarFlowFragment.LLILZ.LIZLLL);
                    }
                });
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("loadInitialData: Initial data load request sent, avatarId=");
                sbLIZ7.append(this.LLILZ.LIZLLL);
                C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ7));
            } else {
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("loadInitialData: Context is null, cannot load initial data, avatarId=");
                sbLIZ8.append(this.LLILZ.LIZLLL);
                C20441214yg.LJIIL("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ8));
            }
        }
        this.LLILLL = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreateView: Creating view for video fragment, avatarId=");
        sbLIZ.append(this.LLILZ.LIZLLL);
        C20441214yg.LIZIZ("GameLiveBottombarVideoFragment", C2188811AlT.LIZIZ(sbLIZ));
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gmn, viewGroup, false);
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
