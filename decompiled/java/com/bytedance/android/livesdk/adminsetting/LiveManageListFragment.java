package com.bytedance.android.livesdk.adminsetting;

import X.C036E;
import X.C098200Yq;
import X.C0IJT;
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
import X.C500260Jjc;
import X.C520010KaN;
import X.C749750Tb3;
import X.C749790Tb7;
import X.C749800Tb8;
import X.C749860TbE;
import X.C749870TbF;
import X.C749950TbN;
import X.C749960TbO;
import X.C749970TbP;
import X.C766270U4b;
import X.C786410Ut5;
import X.InterfaceC749940TbM;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveManageListFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhHELIOSICEgLTE4ICE0ZgklPyoeKSstLiofITY4Dz0yLygpJzs=";
    public LinearLayout LL;
    public RecyclerView LLILLJJLI;
    public C16F5 LLILLL;
    public C749790Tb7 LLILZ;
    public C16F5 LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public String LLIZLLLIL;
    public int LLJ;
    public String LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public long LLJILJILJ;
    public C749870TbF LLJILLL;
    public final C749860TbE LLJJ = new C749860TbE(this);
    public final C749950TbN LLJJI = new C749950TbN(this);

    public final void OR() {
        if (TextUtils.equals("activity_kick_out", this.LLJI)) {
            ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).BR1(this.LLJJ, this.LLJILJILJ, this.LLJIJIL);
        } else {
            ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).BP(this.LLJJ, this.LLJILJILJ, this.LLJIJIL);
        }
    }

    public final RecyclerView PR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tqo) : null;
            this.LLILLJJLI = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final C16F5 RR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tqp) : null;
            this.LLILZIL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final C749790Tb7 SR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tqq) : null;
            this.LLILZ = (C749790Tb7) viewFindViewById;
        }
        return (C749790Tb7) viewFindViewById;
    }

    public final void NR() {
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                OR();
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C766270U4b.LJFF(2131843092, getContext());
        SR().LIZJ();
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

    public final void onEvent(C749960TbO c749960TbO) {
        if (this.mStatusViewValid && c749960TbO != null && !c749960TbO.LIZ) {
            C749870TbF c749870TbF = this.LLJILLL;
            if (c749870TbF != null) {
                c749870TbF.LLLFZ(c749960TbO.LIZIZ);
            }
            C749870TbF c749870TbF2 = this.LLJILLL;
            if (c749870TbF2 != null && c749870TbF2.getItemCount() == 0) {
                SR().LIZIZ();
                C16F5 c16f5RR = RR();
                if (c16f5RR != null) {
                    C500260Jjc.LJIILIIL(c16f5RR);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    public final void onEvent(C749970TbP c749970TbP) {
        if (this.mStatusViewValid && c749970TbP != null) {
            C749870TbF c749870TbF = this.LLJILLL;
            if (c749870TbF != null) {
                c749870TbF.LLLFZ(c749970TbP.LIZ);
            }
            C749870TbF c749870TbF2 = this.LLJILLL;
            if (c749870TbF2 != null && c749870TbF2.getItemCount() == 0) {
                SR().LIZIZ();
                C16F5 c16f5RR = RR();
                if (c16f5RR != null) {
                    C500260Jjc.LJIILIIL(c16f5RR);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [X.0TbH] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        DataChannel dataChannelLJ;
        Room room;
        User owner;
        super.onViewCreated(view, bundle);
        if (getContext() != null && (dataChannelLJ = C475510Ikn.LJ(this)) != null && (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null) {
            long id = owner.getId();
            long id2 = room.getId();
            View viewFindViewById = this.LL;
            View viewFindViewById2 = null;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.tqs);
                } else {
                    viewFindViewById = null;
                }
                this.LL = (LinearLayout) viewFindViewById;
            }
            C786410Ut5.R7((LinearLayout) viewFindViewById, new ACListenerS147S0100000_12(this, 2));
            C786410Ut5.LLIZLLLIL(PR(), 0);
            PR().setLayoutManager(new SSLinearLayoutManager(getContext(), 1));
            this.LLIZ = 2131842829;
            int i = this.LLJ;
            String str = "anchor";
            if (2 == i) {
                this.LLJI = "activity_banned_talk";
                this.LLILZLL = 2131842828;
                this.LLIZLLLIL = getString(2131842826);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_mute_list_show");
                c474500IjALIZ.LJIL();
                if (!C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJIIZILJ(C475510Ikn.LJ(this))))) {
                    str = "user";
                }
                c474500IjALIZ.LJJII(str, "user_type");
                c474500IjALIZ.LIZ();
            } else if (3 == i) {
                this.LLJI = "activity_kick_out";
                this.LLILZLL = 2131842827;
                this.LLIZLLLIL = getString(2131842820);
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_blocked_list_show");
                c474500IjALIZ2.LJIL();
                c474500IjALIZ2.LIZ();
                C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_anchor_blacklist_show");
                c474500IjALIZ3.LJIL();
                if (!C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJIIZILJ(C475510Ikn.LJ(this))))) {
                    str = "user";
                }
                c474500IjALIZ3.LJJII(str, "user_type");
                c474500IjALIZ3.LIZ();
            }
            this.LLJILLL = new C749870TbF(getContext(), this.LLJI, id2, id, C475510Ikn.LJ(this));
            PR().setAdapter(this.LLJILLL);
            C749870TbF c749870TbF = this.LLJILLL;
            if (c749870TbF != null) {
                c749870TbF.LLIZLLLIL = new InterfaceC749940TbM() { // from class: X.0TbH
                    @Override // X.InterfaceC749940TbM
                    public final void LIZ(C749960TbO c749960TbO) {
                        this.LIZ.onEvent(c749960TbO);
                    }

                    @Override // X.InterfaceC749940TbM
                    public final void LIZIZ(C749970TbP c749970TbP) {
                        this.LIZ.onEvent(c749970TbP);
                    }
                };
                c749870TbF.LLILLL = this.LLJJI;
            }
            this.LLJIJIL = 0;
            this.LLJILJILJ = id2;
            NR();
            Context contextLJJIJIIJI = C520010KaN.LJJIJIIJI(this, false);
            if (contextLJJIJIIJI != null || (contextLJJIJIIJI = getActivity()) != null) {
                C786410Ut5.LLL(SR(), 0);
                View viewSd = C786410Ut5.Sd(R.layout.fyf, C786410Ut5.ne(contextLJJIJIIJI), null);
                C786410Ut5.I7(new ACListenerS147S0100000_12(this, 1), viewSd);
                C749750Tb3 c749750Tb3 = new C749750Tb3(contextLJJIJIIJI);
                c749750Tb3.LIZIZ(C20736316Cj.LJ(R.attr.dy0, contextLJJIJIIJI));
                c749750Tb3.LIZJ(getString(this.LLIZ));
                c749750Tb3.LIZLLL(getString(this.LLILZLL));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c749750Tb3);
                c749750Tb3.setLayoutParams(layoutParams);
                C749790Tb7 c749790Tb7SR = SR();
                C749800Tb8 c749800Tb8LIZ = C749800Tb8.LIZ(contextLJJIJIIJI);
                c749800Tb8LIZ.LIZJ = c749750Tb3;
                c749800Tb8LIZ.LIZLLL = viewSd;
                c749800Tb8LIZ.LIZIZ = new C16FZ(contextLJJIJIIJI, null);
                c749790Tb7SR.setBuilder(c749800Tb8LIZ);
            }
            View view3 = this.LLILLL;
            if (view3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById2 = view4.findViewById(R.id.tqr);
                }
                this.LLILLL = (C16F5) viewFindViewById2;
                view3 = viewFindViewById2;
            }
            ((TextView) view3).setText(this.LLIZLLLIL);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gaf, viewGroup, false);
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
