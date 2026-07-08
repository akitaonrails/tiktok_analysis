package com.ss.android.ugc.aweme.partnership.profile;

import X.C098200Yq;
import X.C1161920gLG;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC1257980iqC;
import X.InterfaceC1581200rFW;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveGameProfileFragment extends ProfileListFragment implements InterfaceC1257980iqC {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUtOzs9LTc/ISHELIOSYjZjU+Jik6JCBiBSYlLQItJCoDOioqICM2DjctLiI2JjE=";
    public View LLILZLL;
    public FrameLayout LLIZ;
    public InterfaceC1581200rFW LLIZLLLIL;

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Bp() {
    }

    @Override // X.InterfaceC1206550hVF
    public final void Ii(boolean z) {
    }

    @Override // X.InterfaceC1206550hVF
    public final boolean LJLLL() {
        return true;
    }

    @Override // X.InterfaceC1257980iqC
    public final void PB(String str) {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.InterfaceC1257980iqC
    public final void q3(boolean z) {
    }

    @Override // X.InterfaceC1257980iqC
    public final void za(MiniUser miniUser) {
    }

    @Override // X.InterfaceC1257980iqC
    public final void LJFF() {
        InterfaceC1581200rFW interfaceC1581200rFW = this.LLIZLLLIL;
        if (interfaceC1581200rFW != null) {
            interfaceC1581200rFW.d();
        }
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        View view = this.LLILZLL;
        return view == null ? new View(getContext()) : view;
    }

    public LiveGameProfileFragment() {
        Live.initDesignManager();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void cS(boolean z) {
        View view = this.LLILZLL;
        if (view != null) {
            view.scrollTo(0, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void uS(boolean z) {
        super.uS(z);
        InterfaceC1581200rFW interfaceC1581200rFW = this.LLIZLLLIL;
        if (interfaceC1581200rFW != null) {
            interfaceC1581200rFW.f(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        boolean z;
        String str;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            j = arguments.getLong("CreatorUid");
        } else {
            j = 0;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("isMine");
        } else {
            z = false;
        }
        Context context = getContext();
        if (context != null) {
            this.LLIZLLLIL = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).jn2(j, context);
        }
        FrameLayout frameLayout = this.LLIZ;
        if (frameLayout != null) {
            InterfaceC1581200rFW interfaceC1581200rFW = this.LLIZLLLIL;
            if (interfaceC1581200rFW != null) {
                interfaceC1581200rFW.g("org_acc", "to_acc_type");
            }
            InterfaceC1581200rFW interfaceC1581200rFW2 = this.LLIZLLLIL;
            if (interfaceC1581200rFW2 != null) {
                interfaceC1581200rFW2.g(String.valueOf(j), "to_user_id");
            }
            InterfaceC1581200rFW interfaceC1581200rFW3 = this.LLIZLLLIL;
            if (interfaceC1581200rFW3 != null) {
                if (z) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                interfaceC1581200rFW3.g(str, "enter_from");
            }
            InterfaceC1581200rFW interfaceC1581200rFW4 = this.LLIZLLLIL;
            if (interfaceC1581200rFW4 != null) {
                interfaceC1581200rFW4.e(this);
            }
            InterfaceC1581200rFW interfaceC1581200rFW5 = this.LLIZLLLIL;
            if (interfaceC1581200rFW5 != null) {
                interfaceC1581200rFW5.h(frameLayout);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ddf, viewGroup, false);
        this.LLILZLL = viewTd;
        this.LLIZ = (FrameLayout) viewTd.findViewById(R.id.deb);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
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
