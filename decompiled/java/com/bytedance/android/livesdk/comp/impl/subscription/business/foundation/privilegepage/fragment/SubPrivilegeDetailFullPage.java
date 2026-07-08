package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment;

import X.C01DW;
import X.C098200Yq;
import X.C0IJR;
import X.C0JTI;
import X.C0K8A;
import X.C0K9Q;
import X.C0KVU;
import X.C0WZX;
import X.C12ES;
import X.C1324720kZq;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C1766560w4U;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C439101nJ;
import X.C470590Icr;
import X.C508360Jwg;
import X.C508400Jwk;
import X.C509160Jxy;
import X.C509170Jxz;
import X.C509560Jyc;
import X.C509570Jyd;
import X.C509580Jye;
import X.C509590Jyf;
import X.C509620Jyi;
import X.C509630Jyj;
import X.C510070JzR;
import X.C786410Ut5;
import X.C930940aKi;
import X.EnumC507490JvH;
import X.InterfaceC510100JzU;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.comp.impl.subscription.CloseFullScreenPrivilegePage;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.repository.PrivilegeRepository;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.gson.n;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPrivilegeDetailFullPage extends BaseFragment implements InterfaceC510100JzU, C0JTI {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2HELIOSsqJjo9LCQ4ICA9ZjU+IDk6JCArLD8yLyBiLz0yLygpJzt9GzAuGT06PiwgLCg2DCA4KCY/DjAgJR8yLyA=";
    public C16F5 LL;
    public ConstraintLayout LLILLJJLI;
    public ConstraintLayout LLILLL;
    public LiveIconView LLILZ;
    public C16F5 LLILZIL;
    public C16FS LLILZLL;
    public FrameLayout LLIZ;
    public LiveIconView LLIZLLLIL;
    public C16F5 LLJ;
    public ConstraintLayout LLJI;
    public C1324720kZq LLJIJIL;
    public C1324720kZq LLJILJIL;
    public ConstraintLayout LLJILJILJ;
    public C1324720kZq LLJILLL;
    public C1324720kZq LLJJ;
    public C1324720kZq LLJJI;
    public SubscriptionPrivilegeDetailFragment LLJJIJIL;
    public DataChannel LLJJJ;
    public C0K8A LLJJJIL;
    public GetSubPrivilegeDetailResponse.Data LLJJJJ;
    public C508400Jwk LLJJJJLIIL;
    public boolean LLJJL;
    public String LLJJIII = "";
    public String LLJJIJI = "";
    public String LLJJIJIIJIL = "";
    public String LLJJJJJIL = "";

    @Override // X.InterfaceC510100JzU
    public final void QP(C470590Icr<n> c470590Icr) {
    }

    @Override // X.InterfaceC510100JzU
    public final void hj(C509160Jxy c509160Jxy) {
    }

    public final C16F5 NR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wgl) : null;
            this.LL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final LiveIconView OR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wk0) : null;
            this.LLIZLLLIL = (LiveIconView) viewFindViewById;
        }
        return (LiveIconView) viewFindViewById;
    }

    public final void PR() throws Throwable {
        if (Intrinsics.LJFF(this.LLJJIII, "others_homepage") && this.LLJJL) {
            Intent intent = new Intent();
            intent.putExtra("subscribe_success", "1");
            C19EG activity = getActivity();
            if (activity != null) {
                C2204961BRm.LLJJIJIL(-1, intent, activity, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGhmvW7hEalGQG/8idGyBgzwf0iqbhasEQxV+j89E1j1MzcFEX5qK1l8BpgBn3LKI5N3FXJEKoWy/Fl/9/S9a9qlZrSz/4dMl11LoLFM0G+6BCo=", null));
            }
        }
    }

    @Override // X.C0JTI
    public final boolean onBackPressed() throws Throwable {
        PR();
        return false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJJJ = C0IJR.LIZ(ViewModelProviders.of(this), this);
        if (this.LLJJJJLIIL == null) {
            this.LLJJJJLIIL = new C508400Jwk(null, null, 0L, 0L, null, false, null, null, null, 4095);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        long j;
        String strLIZLLL;
        User user;
        Room room;
        super.onViewCreated(view, bundle);
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(true);
        tuxImmersionBarLIZLLL.LJIIIZ(C20736316Cj.LIZIZ(R.attr.c63, getContext()));
        tuxImmersionBarLIZLLL.LIZLLL();
        PrivilegeRepository privilegeRepositoryLIZ = C510070JzR.LIZ(this.LLJJIJIIJIL, this);
        String str = this.LLJJIJIIJIL;
        C508400Jwk c508400Jwk = this.LLJJJJLIIL;
        View viewFindViewById = null;
        if (c508400Jwk == null || !c508400Jwk.LJIIJ || (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) == null || (string = Long.valueOf(room.getId()).toString()) == null) {
            string = "";
        }
        C508400Jwk c508400Jwk2 = this.LLJJJJLIIL;
        if (c508400Jwk2 != null) {
            j = c508400Jwk2.LIZJ;
        } else {
            j = 0;
        }
        C509620Jyi c509620Jyi = new C509620Jyi(j, str, string, true);
        if (privilegeRepositoryLIZ.LLILZ.get(c509620Jyi) == null) {
            privilegeRepositoryLIZ.LLILZ.put(c509620Jyi, C1697810uHb.LJIILJJIL(this));
        } else {
            List<InterfaceC510100JzU> list = privilegeRepositoryLIZ.LLILZ.get(c509620Jyi);
            if (list != null) {
                list.add(this);
            }
        }
        C508400Jwk c508400Jwk3 = this.LLJJJJLIIL;
        if (c508400Jwk3 != null) {
            c508400Jwk3.LJIIIZ = true;
        }
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragmentLIZ = C508360Jwg.LIZ(this.LLJJJ, this.LLJJIII, this.LLJJIJI, new LinkedHashMap(), null, null, EnumC507490JvH.FULL_PAGE, this.LLJJIJIIJIL, this.LLJJJJJIL, null, 0L, null, this.LLJJJJLIIL, null, null, 113664);
        this.LLJJIJIL = subscriptionPrivilegeDetailFragmentLIZ;
        subscriptionPrivilegeDetailFragmentLIZ.f(new C509570Jyd(this));
        subscriptionPrivilegeDetailFragmentLIZ.a2(new C509580Jye(this));
        subscriptionPrivilegeDetailFragmentLIZ.n(new C509560Jyc(this));
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = this.LLJJIJIL;
        if (subscriptionPrivilegeDetailFragment != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.rvw, subscriptionPrivilegeDetailFragment, null);
            c19ehLJIIJ.LJIIL();
        }
        View viewFindViewById2 = this.LLIZ;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.bmy);
            } else {
                viewFindViewById2 = null;
            }
            this.LLIZ = (FrameLayout) viewFindViewById2;
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new View.OnClickListener() { // from class: X.0Jyh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) throws Throwable {
                    this.LL.PR();
                    C520010KaN.LIZLLL(this.LL);
                }
            });
        }
        ISubscriptionStatusService.LJIIIZ.getClass();
        C0K9Q.LIZ().cp1(this, this).LIZIZ(this, new C509630Jyj(this));
        DataChannelGlobal.LLILZ.BQ2(this, this, CloseFullScreenPrivilegePage.class, new C509590Jyf(this));
        GetSubPrivilegeDetailResponse.Data data = this.LLJJJJ;
        if (data == null || (user = data.anchorDetail) == null || (strLIZLLL = C0KVU.LIZ(user)) == null) {
            strLIZLLL = C0KVU.LIZLLL(UserService.getInstance().user().LJIJJLI());
        }
        View view3 = this.LLJ;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById = view4.findViewById(R.id.mrn);
            }
            this.LLJ = (C16F5) viewFindViewById;
            view3 = viewFindViewById;
        }
        TextView textView = (TextView) view3;
        if (textView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('@');
            sbLIZ.append(strLIZLLL);
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        LiveIconView liveIconViewOR = OR();
        if (liveIconViewOR != null) {
            C786410Ut5.g8(liveIconViewOR, new C01DW() { // from class: X.0K7u
                /* JADX WARN: Removed duplicated region for block: B:102:0x01b5  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x0264  */
                /* JADX WARN: Removed duplicated region for block: B:91:0x0177  */
                /* JADX WARN: Type inference failed for: r20v0, types: [X.0K86] */
                /* JADX WARN: Type inference failed for: r3v4, types: [X.0K87] */
                /* JADX WARN: Type inference failed for: r6v0, types: [X.0K7v, X.0K8C] */
                @Override // X.C01DW
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(android.view.View r31) {
                    /*
                        Method dump skipped, instruction units count: 653
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C512440K7u.LIZ(android.view.View):void");
                }
            });
        }
        LiveIconView liveIconViewOR2 = OR();
        if (liveIconViewOR2 != null) {
            C439101nJ.LJI(liveIconViewOR2);
        }
    }

    @Override // X.InterfaceC510100JzU
    public final void yO(C509170Jxz c509170Jxz, boolean z) {
        LiveIconView liveIconViewOR;
        this.LLJJJJ = c509170Jxz.LIZ;
        if (this.LLJJJIL == null && (liveIconViewOR = OR()) != null) {
            C12ES.LJIILL(0, liveIconViewOR);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gl_, viewGroup, false);
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
