package com.ss.android.ugc.aweme.im.creative.edit.impl.ui;

import X.AbstractC1445310niL;
import X.AbstractC1445340niO;
import X.AbstractC2173821A5s;
import X.AbstractC992270bvd;
import X.C01BX;
import X.C01GW;
import X.C098200Yq;
import X.C0QSJ;
import X.C1404410meN;
import X.C1445070nhx;
import X.C1685300txQ;
import X.C1807680x8o;
import X.C1821370xUt;
import X.C189200o6;
import X.C1954807lC;
import X.C19EG;
import X.C19GS;
import X.C2174131A6x;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC1404400meM;
import X.InterfaceC1146704e9;
import X.InterfaceC1346105Op;
import X.InterfaceC1445220niC;
import X.InterfaceC1807860x96;
import X.InterfaceC1807870x97;
import X.InterfaceC1821400xUw;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes28.dex */
public final class IMEditFragment extends BaseFragment implements InterfaceC1807860x96, InterfaceC1821400xUw, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZywhLSQ4HELIOSIDk2ZiAoIDt9ISg8JWEmIWsFBAo3ITEKOy40JSAiPQ==";
    public C1807680x8o LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 287));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 283));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 285));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 286));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 284));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 288));
    public C2174131A6x LLJILLL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == C2174131A6x.class) {
            this.LLJILLL = (C2174131A6x) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{IMEditPageScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == C2174131A6x.class) {
            return this.LLJILLL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(IMEditPageScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(IMEditPageScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == C2174131A6x.class) {
            this.LLJILLL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC1821400xUw
    public final boolean Mq() {
        return ((AbstractC1445340niO) this.LLJILJIL.getValue()).LJII();
    }

    public final C1807680x8o SR() {
        C1807680x8o c1807680x8o = this.LLIZ;
        if (c1807680x8o != null) {
            return c1807680x8o;
        }
        throw new IllegalArgumentException("unexpected null commonDeps");
    }

    @Override // X.InterfaceC1807860x96
    public final void E5(EnumC1404400meM enumC1404400meM) {
        if (C1404410meN.LIZ[enumC1404400meM.ordinal()] == 1) {
            C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 111), 3);
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{IMEditPageScope.class}).unbindAbility(this.LLIZLLLIL.getValue(), C2174131A6x.class);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.LLIZ = C1821370xUt.LIZ(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C687700QyG.LJI(this);
        super.onCreate(bundle);
        InterfaceC1445220niC interfaceC1445220niC = (InterfaceC1445220niC) this.LLJI.getValue();
        Long lLIZ = SR().LIZIZ().LIZ(new AbstractC992270bvd() { // from class: X.0bve
            {
                EnumC992250bvb enumC992250bvb = EnumC992250bvb.TRANSIT_TO_EDIT_PAGE;
            }
        });
        IMCreativeEditModel iMCreativeEditModel = SR().LIZLLL;
        boolean z = false;
        if (iMCreativeEditModel != null && iMCreativeEditModel.LIZ()) {
            z = true;
        }
        interfaceC1445220niC.onEvent(new C1445070nhx(lLIZ, !z));
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{IMEditPageScope.class}).bindAbility(this.LLIZLLLIL.getValue(), C2174131A6x.class);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onViewCreated(view, bundle);
        ((AbstractC1445310niL) this.LLJILJIL.getValue()).LIZLLL = getParentFragmentManager();
        C19EG activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZ(getViewLifecycleOwner(), (AbstractC2173821A5s) this.LLJILJIL.getValue());
        }
        ((InterfaceC1807870x97) this.LLJIJIL.getValue()).LIZ(this);
        IMCreativeEditModel iMCreativeEditModel = SR().LIZLLL;
        if (iMCreativeEditModel != null && iMCreativeEditModel.LIZ()) {
            ((InterfaceC1346105Op) this.LLJILJILJ.getValue()).LJIILIIL(C01BX.TYPE_9V16_NO_CORNER);
            ((InterfaceC1346105Op) this.LLJILJILJ.getValue()).LJ();
        }
        C723850SaN.LIZ(this, false, null, new AwS368S0200000_2(view, this, 40), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cgw, viewGroup, false);
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
