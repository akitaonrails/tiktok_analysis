package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0BYX;
import X.C0QSJ;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C301320BrW;
import X.C452501pT;
import X.C673150Qan;
import X.C681610QoR;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC615300OBk;
import X.InterfaceC665370Q7z;
import X.InterfaceC682000Qp4;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.viewmodel.ChooseSearchMusicStateViewModel;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.communication.SearchMusicMiddlePageScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class DynamicSearchMusicMiddlePageFragment extends BaseFragment implements InterfaceC682000Qp4, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2svISA8OyAhPDw6K2shICHELIOSs3JCA8KCg2ZiYjOyp9PSxiDTY9KSglKhw2KTcvIQImOywvBCY3LCkpGS40LQM+KCg+LSs4";
    public final DynamicSearchMusicMiddlePageFragment LLIZ = this;
    public final C681610QoR LLIZLLLIL = new C681610QoR(LifecycleOwnerKt.getLifecycleScope(this), C0BYX.LIZ());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 373));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(256));
    public InterfaceC615300OBk LLJIJIL;
    public InterfaceC682000Qp4 LLJILJIL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC615300OBk.class) {
            this.LLJIJIL = (InterfaceC615300OBk) obj;
        } else if (cls == InterfaceC682000Qp4.class) {
            this.LLJILJIL = (InterfaceC682000Qp4) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchMusicMiddlePageScope.class, SearchMusicMiddlePageScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC615300OBk.class) {
            return this.LLJIJIL;
        }
        if (cls == InterfaceC682000Qp4.class) {
            return this.LLJILJIL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchMusicMiddlePageScope.class);
        arrayList.add(SearchMusicMiddlePageScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchMusicMiddlePageScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC615300OBk.class) {
            this.LLJIJIL = null;
        } else if (cls == InterfaceC682000Qp4.class) {
            this.LLJILJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ChooseSearchMusicStateViewModel chooseSearchMusicStateViewModel = (ChooseSearchMusicStateViewModel) this.LLJ.getValue();
        chooseSearchMusicStateViewModel.getClass();
        chooseSearchMusicStateViewModel.setState(new AwS589S0100000_10(chooseSearchMusicStateViewModel, 597));
    }

    @Override // X.InterfaceC682000Qp4
    public final C681610QoR By() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchMusicMiddlePageScope.class}).unbindAbility(this.LLIZ, InterfaceC682000Qp4.class);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        if (C301320BrW.LIZ()) {
            C687700QyG.LJI(this);
        }
        super.onCreate(bundle);
        C681610QoR c681610QoR = this.LLIZLLLIL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c681610QoR.LJIILL) {
            c681610QoR.LJIIJJI = jCurrentTimeMillis;
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchMusicMiddlePageScope.class}).bindAbility(this.LLIZ, InterfaceC682000Qp4.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            super.onViewCreated(r6, r7)
            boolean r0 = X.C681430Qo9.LIZ()
            r4 = 0
            if (r0 == 0) goto L98
            X.01GW r0 = r5.LLJI
            java.lang.Object r0 = r0.getValue()
            X.0Qp2 r0 = (X.InterfaceC681980Qp2) r0
            if (r0 == 0) goto L96
            X.0QoF r1 = r0.getLastSearchSoundPage()
        L18:
            X.0QoF r0 = X.EnumC681490QoF.DISCOVER_PAGE
            if (r1 == r0) goto L2e
            X.01GW r0 = r5.LLJI
            java.lang.Object r0 = r0.getValue()
            X.0Qp2 r0 = (X.InterfaceC681980Qp2) r0
            if (r0 == 0) goto L94
            X.0QoF r1 = r0.getLastSearchSoundPage()
        L2a:
            X.0QoF r0 = X.EnumC681490QoF.SEARCH_RES_PAGE
            if (r1 != r0) goto L98
        L2e:
            java.lang.String r1 = "return"
        L30:
            X.01GW r0 = r5.LLJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.search.pages.choosemusic.core.viewmodel.ChooseSearchMusicStateViewModel r0 = (com.ss.android.ugc.aweme.search.pages.choosemusic.core.viewmodel.ChooseSearchMusicStateViewModel) r0
            r0.LL = r1
            X.0QNN r3 = new X.0QNN
            r3.<init>()
            java.lang.String r0 = "change_music_page"
            r3.LJIJJ(r0)
            java.lang.String r0 = "enter_method"
            r3.LJIIZILJ(r0, r1)
            java.lang.String r1 = X.C15IK.LIZ
            X.08Dt r2 = X.InterfaceC1210900hcG.LIZ
            java.lang.String r0 = "search_entrance"
            r3.LJFF(r0, r1, r2)
            java.lang.String r1 = X.C15IK.LJ
            java.lang.String r0 = "creation_id"
            r3.LJFF(r0, r1, r2)
            java.lang.String r1 = X.C15IK.LJIIJJI
            java.lang.String r0 = "shoot_way"
            r3.LJFF(r0, r1, r2)
            r3.LJIILJJIL()
            r0 = 2131389820(0x7f0a6d7c, float:1.8400194E38)
            android.view.View r3 = r6.findViewById(r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            kotlin.jvm.internal.AwS368S0200000_2 r2 = new kotlin.jvm.internal.AwS368S0200000_2
            r0 = 54
            r2.<init>(r5, r3, r0)
            r1 = 3
            r0 = 0
            X.C723850SaN.LIZ(r5, r0, r4, r2, r1)
            boolean r0 = r3 instanceof X.C681660QoW
            if (r0 == 0) goto L84
            X.0QoW r3 = (X.C681660QoW) r3
            if (r3 == 0) goto L84
            r0 = 1
            r3.setDismissKeyboardWhenTouch(r0)
        L84:
            X.01GW r0 = r5.LLJI
            java.lang.Object r1 = r0.getValue()
            X.0Qp2 r1 = (X.InterfaceC681980Qp2) r1
            if (r1 == 0) goto L93
            X.0QoF r0 = X.EnumC681490QoF.SEARCH_SUG_PAGE
            r1.setLastSearchSoundPage(r0)
        L93:
            return
        L94:
            r1 = r4
            goto L2a
        L96:
            r1 = r4
            goto L18
        L98:
            java.lang.String r1 = "enter"
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui.DynamicSearchMusicMiddlePageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ex_, viewGroup, false);
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
