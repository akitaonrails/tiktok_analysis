package com.bytedance.android.livesdk.moderator.removeself;

import X.C098200Yq;
import X.C0DM6;
import X.C0IJT;
import X.C0KVU;
import X.C1161920gLG;
import X.C1685300txQ;
import X.C16F5;
import X.C16FZ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20736316Cj;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C520010KaN;
import X.C749750Tb3;
import X.C749790Tb7;
import X.C749800Tb8;
import X.C749810Tb9;
import X.C782110Um9;
import X.C786410Ut5;
import X.InterfaceC750010TbT;
import X.InterfaceC750130Tbf;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnClickListenerC512201z6;
import Y.ACListenerS147S0100000_12;
import Y.AcS353S0200000_12;
import Y.AcS495S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.dataChannel.LiveModeratorQuitEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModeratorListFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import tikcast.api.anchor.AdminHostListResponse;
import tikcast.api.anchor.DelHostRelationResponse;
import tikcast.api.anchor.HostInfo;

/* JADX INFO: loaded from: classes13.dex */
public final class ModeratorHostIModeratorListFragment extends BaseFragment implements InterfaceC750010TbT {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9JSooLD0yPCo+Zz02JSHELIOSo6LDw2JCNiBCA3LTctPSAhACo/PQYeJyEpOy4nJzcAIDwnDjctLiI2JjE=";
    public FrameLayout LL;
    public FrameLayout LLILLJJLI;
    public RecyclerView LLILLL;
    public C16F5 LLILZ;
    public C749790Tb7 LLILZIL;
    public C0DM6 LLILZLL;
    public final C749810Tb9 LLIZ = new InterfaceC750130Tbf() { // from class: X.0Tb9
        @Override // X.InterfaceC750130Tbf
        public final void LIZ(AdminHostListResponse adminHostListResponse, Exception exc) {
            List<HostInfo> list;
            List<HostInfo> list2;
            ModeratorHostIModeratorListFragment moderatorHostIModeratorListFragment = this.LIZ;
            int size = 0;
            if (moderatorHostIModeratorListFragment.mStatusViewValid) {
                C0DM6 c0dm6 = null;
                List<HostInfo> list3 = null;
                if (exc == null && adminHostListResponse != null) {
                    AdminHostListResponse.Data data = adminHostListResponse.data;
                    if (data != null) {
                        list = data.hostList;
                    } else {
                        list = null;
                    }
                    if (!C086I.LIZIZ(list)) {
                        AdminHostListResponse.Data data2 = adminHostListResponse.data;
                        if (data2 != null && (list2 = data2.hostList) != null) {
                            size = list2.size();
                        }
                        this.LIZ.NR().LIZ();
                        C0DM6 c0dm62 = this.LIZ.LLILZLL;
                        if (c0dm62 == null) {
                            c0dm62 = null;
                        }
                        AdminHostListResponse.Data data3 = adminHostListResponse.data;
                        if (data3 != null) {
                            list3 = data3.hostList;
                        }
                        c0dm62.getClass();
                        if (list3 != null && !list3.isEmpty()) {
                            ((ArrayList) c0dm62.LLILLJJLI).clear();
                            ((ArrayList) c0dm62.LLILLJJLI).addAll(list3);
                            c0dm62.notifyDataSetChanged();
                        }
                    } else {
                        this.LIZ.NR().LIZIZ();
                    }
                } else {
                    C0DM6 c0dm63 = moderatorHostIModeratorListFragment.LLILZLL;
                    if (c0dm63 != null) {
                        c0dm6 = c0dm63;
                    }
                    if (c0dm6.getItemCount() == 0) {
                        this.LIZ.NR().LIZJ();
                    }
                    C501540Jlg.LIZJ(this.LIZ.getContext(), exc);
                }
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_host_moderate_panel_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Integer.valueOf(size), "host_cnt");
            c474500IjALIZ.LIZ();
        }

        @Override // X.InterfaceC750130Tbf
        public final void LIZIZ(long j, DelHostRelationResponse delHostRelationResponse, Exception exc) {
            Room room;
            User owner;
            DataChannel dataChannelLJ;
            ModeratorHostIModeratorListFragment moderatorHostIModeratorListFragment = this.LIZ;
            if (moderatorHostIModeratorListFragment.mStatusViewValid) {
                if (exc == null && delHostRelationResponse != null) {
                    DataChannel dataChannelLJ2 = C475510Ikn.LJ(moderatorHostIModeratorListFragment);
                    if (dataChannelLJ2 != null && (room = (Room) dataChannelLJ2.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && owner.getId() == j && (dataChannelLJ = C475510Ikn.LJ(this.LIZ)) != null) {
                        dataChannelLJ.FQ2(LiveModeratorQuitEvent.class);
                    }
                    C0DM6 c0dm6 = this.LIZ.LLILZLL;
                    C0DM6 c0dm62 = null;
                    if (c0dm6 == null) {
                        c0dm6 = null;
                    }
                    int i = -1;
                    int i2 = 0;
                    HostInfo hostInfo = null;
                    for (Object obj : (ArrayList) c0dm6.LLILLJJLI) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            HostInfo hostInfo2 = (HostInfo) obj;
                            User user = hostInfo2.userInfo;
                            if (user != null && user.getId() == j) {
                                i = i2;
                                hostInfo = hostInfo2;
                            }
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    if (hostInfo != null) {
                        ((ArrayList) c0dm6.LLILLJJLI).remove(hostInfo);
                        if (i >= 0) {
                            c0dm6.notifyItemRemoved(i);
                        }
                    }
                    C0DM6 c0dm63 = this.LIZ.LLILZLL;
                    if (c0dm63 != null) {
                        c0dm62 = c0dm63;
                    }
                    if (c0dm62.getItemCount() == 0) {
                        this.LIZ.NR().LIZIZ();
                        return;
                    }
                    return;
                }
                C501540Jlg.LIZJ(moderatorHostIModeratorListFragment.getContext(), exc);
            }
        }
    };

    public final C749790Tb7 NR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tqq) : null;
            this.LLILZIL = (C749790Tb7) viewFindViewById;
        }
        return (C749790Tb7) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    public final void OR(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_option_out_toast");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJJII(str, "operation_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC750010TbT
    public final void Vo(User user) {
        C782110Um9 c782110Um9 = new C782110Um9(getContext());
        c782110Um9.LIZJ = C497740JfY.LJIJJ(2131843892, C0KVU.LIZ(user));
        c782110Um9.LJIIIZ(C497740JfY.LJIJJ(2131843890, C0KVU.LIZ(user)));
        c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131843891), new AcS353S0200000_12(this, user, 2));
        c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131843889), new AcS495S0100000_12(this, 25));
        c782110Um9.LJIILL = false;
        c782110Um9.LJIILLIIL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
        OR("show");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.tqs);
            } else {
                viewFindViewById = null;
            }
            this.LL = (FrameLayout) viewFindViewById;
        }
        C786410Ut5.O7((FrameLayout) viewFindViewById, new ACListenerS147S0100000_12(this, 228));
        View viewFindViewById3 = this.LLILLJJLI;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.cq9);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLJJLI = (FrameLayout) viewFindViewById3;
        }
        C500260Jjc.LLFFF(viewFindViewById3);
        View viewFindViewById4 = this.LLILLJJLI;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.cq9);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILLJJLI = (FrameLayout) viewFindViewById4;
        }
        C786410Ut5.O7((FrameLayout) viewFindViewById4, new ViewOnClickListenerC512201z6(this, 37));
        this.LLILZLL = new C0DM6(C475510Ikn.LJ(this), this);
        View viewFindViewById5 = this.LLILLL;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.tqo);
            } else {
                viewFindViewById5 = null;
            }
            this.LLILLL = (RecyclerView) viewFindViewById5;
        }
        ((RecyclerView) viewFindViewById5).setLayoutManager(new SSLinearLayoutManager(getContext(), 1));
        View viewFindViewById6 = this.LLILLL;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById6 = view6.findViewById(R.id.tqo);
            } else {
                viewFindViewById6 = null;
            }
            this.LLILLL = (RecyclerView) viewFindViewById6;
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
        C0DM6 c0dm6 = this.LLILZLL;
        if (c0dm6 == null) {
            c0dm6 = null;
        }
        recyclerView.setAdapter(c0dm6);
        Context contextLJJIJIIJI = C520010KaN.LJJIJIIJI(this, false);
        if (contextLJJIJIIJI != null || (contextLJJIJIIJI = getActivity()) != null) {
            C786410Ut5.LLL(NR(), 0);
            View viewSd = C786410Ut5.Sd(R.layout.fyf, C786410Ut5.ne(contextLJJIJIIJI), null);
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 461), viewSd);
            C749750Tb3 c749750Tb3 = new C749750Tb3(contextLJJIJIIJI);
            c749750Tb3.LIZIZ(C20736316Cj.LJ(R.attr.dy0, contextLJJIJIIJI));
            c749750Tb3.LIZJ("");
            c749750Tb3.LIZLLL(getString(2131843894));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c749750Tb3);
            c749750Tb3.setLayoutParams(layoutParams);
            C749790Tb7 c749790Tb7NR = NR();
            C749800Tb8 c749800Tb8LIZ = C749800Tb8.LIZ(contextLJJIJIIJI);
            c749800Tb8LIZ.LIZJ = c749750Tb3;
            c749800Tb8LIZ.LIZLLL = viewSd;
            c749800Tb8LIZ.LIZIZ = new C16FZ(contextLJJIJIIJI, null);
            c749790Tb7NR.setBuilder(c749800Tb8LIZ);
        }
        NR().LIZLLL();
        ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).KW0(this.LLIZ);
        View view7 = this.LLILZ;
        if (view7 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById2 = view8.findViewById(R.id.tqr);
            }
            this.LLILZ = (C16F5) viewFindViewById2;
            view7 = viewFindViewById2;
        }
        ((TextView) view7).setText(2131843896);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g7j, viewGroup, false);
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
