package com.bytedance.android.livesdk.game.chatroom.drawer.category;

import X.C098200Yq;
import X.C0JDJ;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1161920gLG;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20441214yg;
import X.C20533215Wg;
import X.C2200821BBo;
import X.C465220IMe;
import X.C469770IbX;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC469490Ib5;
import X.InterfaceC469760IbW;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IAssemReportAbility;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IDrawerCategoryFragmentAbility;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IFragmentVisibleAbility;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes8.dex */
public final class GameDrawerCategoryFragment extends BaseFragment implements C0JDJ, IDrawerCategoryFragmentAbility, IFragmentVisibleAbility {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGEwICQ4OyA8JWHELIOSsoOy4kLTdiKi4nLSIjOzZ9DyQhLAshKTIpOwwyPCArJj0qDjctLiI2JjE=";
    public final Object LL;
    public final Object LLILLJJLI;
    public View LLILLL;
    public Fragment LLILZ;

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IFragmentVisibleAbility
    public final void OW1() throws Throwable {
        setUserVisibleHint(false);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment
    public final void onVisible() {
        IAssemReportAbility iAssemReportAbility = (IAssemReportAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IAssemReportAbility.class, null);
        if (iAssemReportAbility != null) {
            iAssemReportAbility.eE2();
        }
    }

    public final Fragment NR() {
        Object obj = this.LL;
        if (obj == null) {
            obj = Unit.LIZ;
        }
        if (!(obj instanceof InterfaceC469760IbW)) {
            return null;
        }
        Object obj2 = this.LLILLJJLI;
        if (!((obj2 == null ? Unit.LIZ : obj2) instanceof C469770IbX)) {
            return null;
        }
        if (obj2 == null) {
            obj2 = Unit.LIZ;
        }
        obj2.getClass();
        C469770IbX c469770IbX = new C469770IbX("game");
        Object obj3 = this.LL;
        if (obj3 == null) {
            obj3 = Unit.LIZ;
        }
        final InterfaceC469760IbW interfaceC469760IbW = (InterfaceC469760IbW) obj3;
        return ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).YU(new InterfaceC469760IbW() { // from class: X.0IbV
            @Override // X.InterfaceC469760IbW
            public final void LJ() {
            }

            @Override // X.InterfaceC469760IbW
            public final void LJIIL() {
                InterfaceC469760IbW interfaceC469760IbW2 = interfaceC469760IbW;
                if (interfaceC469760IbW2 != null) {
                    interfaceC469760IbW2.LJIIL();
                }
            }

            @Override // X.InterfaceC469760IbW
            public final void LJIILIIL() {
                InterfaceC469760IbW interfaceC469760IbW2 = interfaceC469760IbW;
                if (interfaceC469760IbW2 != null) {
                    interfaceC469760IbW2.LJIILIIL();
                }
            }

            @Override // X.InterfaceC469760IbW
            public final void LJIILJJIL() {
                InterfaceC469760IbW interfaceC469760IbW2 = interfaceC469760IbW;
                if (interfaceC469760IbW2 != null) {
                    interfaceC469760IbW2.LJIILJJIL();
                }
            }

            @Override // X.InterfaceC469760IbW
            public final EnumC469210Iad getContainerType() {
                InterfaceC469760IbW interfaceC469760IbW2 = interfaceC469760IbW;
                if (interfaceC469760IbW2 != null) {
                    return interfaceC469760IbW2.getContainerType();
                }
                return null;
            }

            @Override // X.InterfaceC469760IbW
            public final boolean isOpen() {
                InterfaceC469760IbW interfaceC469760IbW2 = interfaceC469760IbW;
                if (interfaceC469760IbW2 != null) {
                    return interfaceC469760IbW2.isOpen();
                }
                return false;
            }
        }, c469770IbX, EnumC469490Ib5.GAME_CATEGORY_BOTTOM);
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IDrawerCategoryFragmentAbility
    public final void Wq2() {
        try {
            if (this.LLILZ == null) {
                this.LLILZ = NR();
            }
            Fragment fragment = this.LLILZ;
            if (fragment != null) {
                C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.dig, fragment, null);
                c19ehLJIIJ.LJIIJ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("GameDrawerCategoryFragment", e);
        }
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IDrawerCategoryFragmentAbility
    public final void dG2() {
        InterfaceC469760IbW interfaceC469760IbW;
        Object obj = this.LL;
        if (obj == null) {
            obj = Unit.LIZ;
        }
        if (!(obj instanceof InterfaceC469760IbW) || (interfaceC469760IbW = (InterfaceC469760IbW) obj) == null) {
            return;
        }
        interfaceC469760IbW.LJIILIIL();
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IFragmentVisibleAbility
    public final boolean Fn() {
        return getUserVisibleHint();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IDrawerCategoryFragmentAbility.class, null);
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IFragmentVisibleAbility.class, null);
    }

    public GameDrawerCategoryFragment() {
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IDrawerCategoryFragmentAbility.class, null, null);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IFragmentVisibleAbility.class, null, null);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/bytedance/android/livesdk/game/chatroom/drawer/category/GameDrawerCategoryFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MzD/FV9f3YRV8zOtlwrLhSbzgV8ITDz4uG7uFyYd3wtmc0N7+mkgOoEVy23C6hFqmQYeU=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (this.LLILZ == null) {
            this.LLILZ = NR();
        }
        Fragment fragment = this.LLILZ;
        if (fragment != null) {
            fragment.setUserVisibleHint(z);
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(GameDrawerCategoryFragment.class);
        }
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IDrawerCategoryFragmentAbility
    public final void xB1(boolean z) {
        InterfaceC469760IbW interfaceC469760IbW;
        InterfaceC469760IbW interfaceC469760IbW2;
        if (z) {
            Object obj = this.LL;
            if (obj == null) {
                obj = Unit.LIZ;
            }
            if ((obj instanceof InterfaceC469760IbW) && (interfaceC469760IbW2 = (InterfaceC469760IbW) obj) != null) {
                interfaceC469760IbW2.LJ();
                return;
            }
            return;
        }
        Object obj2 = this.LL;
        if (obj2 == null) {
            obj2 = Unit.LIZ;
        }
        if (!(obj2 instanceof InterfaceC469760IbW) || (interfaceC469760IbW = (InterfaceC469760IbW) obj2) == null) {
            return;
        }
        interfaceC469760IbW.LJIIL();
    }

    public GameDrawerCategoryFragment(Object obj, Object obj2) {
        this();
        this.LL = obj;
        this.LLILLJJLI = obj2;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC469760IbW interfaceC469760IbW;
        super.onViewCreated(view, bundle);
        if (getUserVisibleHint()) {
            Object obj = this.LL;
            if (obj == null) {
                obj = Unit.LIZ;
            }
            if ((obj instanceof InterfaceC469760IbW) && (interfaceC469760IbW = (InterfaceC469760IbW) obj) != null) {
                interfaceC469760IbW.LJIIL();
            }
        }
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 62), 3);
        View viewFindViewById = view.findViewById(R.id.dio);
        this.LLILLL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gmf, viewGroup, false);
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
