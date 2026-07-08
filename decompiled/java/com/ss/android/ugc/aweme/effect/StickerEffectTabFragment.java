package com.ss.android.ugc.aweme.effect;

import X.C112U;
import X.C112Y;
import X.C1659630tI1;
import X.C19471411Fw;
import X.C21341918fZ;
import X.C424200GkE;
import X.C425240Glu;
import X.C786410Ut5;
import Y.AObserverS231S0100000_29;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class StickerEffectTabFragment extends EditEffectTabFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAqLyHELIOSowPGsfPSYwIyA+DCk1LSY4HS4xDjctLiI2JjE=";
    public C19471411Fw LLJJ;
    public C424200GkE LLJJI;
    public EditEffectVideoModel LLJJIII;
    public C112U LLJJIJI;

    @Override // X.InterfaceC19557211fO
    public final void XC() {
    }

    @Override // X.InterfaceC19347710mh
    public final void zf(Effect effect, int i) {
    }

    public final C19471411Fw UR() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.z4_) : null;
            this.LLJJ = (C19471411Fw) viewFindViewById;
        }
        return (C19471411Fw) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLJJ = null;
        this.LLJJI = null;
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // X.InterfaceC19347710mh
    public final void Iz(Effect effect) {
        int iIndexOf;
        if (effect != null && (iIndexOf = NR().indexOf(effect)) >= 0) {
            C112U c112u = this.LLJJIJI;
            if (c112u == null) {
                c112u = null;
            }
            c112u.LLLFZ(iIndexOf, 32);
        }
    }

    @Override // X.InterfaceC19347710mh
    public final void Vs(Effect effect) {
        int iIndexOf = NR().indexOf(effect);
        if (iIndexOf >= 0) {
            C112U c112u = this.LLJJIJI;
            if (c112u == null) {
                c112u = null;
            }
            c112u.LLLFZ(iIndexOf, 16);
        }
    }

    @Override // X.InterfaceC19347710mh
    public final void g(Effect effect) {
        int iIndexOf = NR().indexOf(effect);
        if (iIndexOf >= 0) {
            C112U c112u = this.LLJJIJI;
            if (c112u == null) {
                c112u = null;
            }
            c112u.LLLFZ(iIndexOf, 8);
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C112U c112u = this.LLJJIJI;
        EditEffectVideoModel editEffectVideoModel = null;
        if (c112u == null) {
            c112u = null;
        }
        if ((!((ArrayList) c112u.LLILLJJLI).isEmpty()) && (!this.LLJILLL.isEmpty())) {
            C112U c112u2 = this.LLJJIJI;
            if (c112u2 == null) {
                c112u2 = null;
            }
            c112u2.LLLII((EffectPointModel) ListProtector.get(this.LLJILLL, 0));
        }
        if (getActivity() != null) {
            EditEffectVideoModel editEffectVideoModel2 = (EditEffectVideoModel) C1659630tI1.LJII(getView(), null, 6).get(EditEffectVideoModel.class);
            this.LLJJIII = editEffectVideoModel2;
            if (editEffectVideoModel2 == null) {
                editEffectVideoModel2 = null;
            }
            editEffectVideoModel2.vQ2().LIZLLL().observe(this, new AObserverS231S0100000_29(this, 45));
            EditEffectVideoModel editEffectVideoModel3 = this.LLJJIII;
            if (editEffectVideoModel3 != null) {
                editEffectVideoModel = editEffectVideoModel3;
            }
            ((LiveData) editEffectVideoModel.LLJIJIL.getValue()).observe(this, new AObserverS231S0100000_29(this, 46));
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment
    public final void PR(C21341918fZ c21341918fZ, List<? extends EffectModel> list) {
        C112U c112u = this.LLJJIJI;
        C112U c112u2 = null;
        if (c112u == null) {
            c112u = null;
        }
        c21341918fZ.LIZJ(c112u);
        this.LLIZ = list;
        C112U c112u3 = this.LLJJIJI;
        if (c112u3 == null) {
            c112u3 = null;
        }
        c112u3.LLLI(list);
        C112U c112u4 = this.LLJJIJI;
        if (c112u4 == null) {
            c112u4 = null;
        }
        if ((!((ArrayList) c112u4.LLILLJJLI).isEmpty()) && (!this.LLJILLL.isEmpty())) {
            C112U c112u5 = this.LLJJIJI;
            if (c112u5 != null) {
                c112u2 = c112u5;
            }
            c112u2.LLLII((EffectPointModel) ListProtector.get(this.LLJILLL, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.EditEffectTabFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        UR().setText(getString(2131826972));
        OR();
        C112U c112u = new C112U(this.LLJI);
        this.LLJJIJI = c112u;
        c112u.LLLI(this.LLIZ);
        C112U c112u2 = this.LLJJIJI;
        View viewFindViewById = null;
        if (c112u2 == null) {
            c112u2 = null;
        }
        c112u2.LLILZ = new C112Y(this);
        C425240Glu c425240GluOR = OR();
        C112U c112u3 = this.LLJJIJI;
        if (c112u3 == null) {
            c112u3 = null;
        }
        c425240GluOR.setAdapter(c112u3);
        View view2 = this.LLJJI;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.z3b);
            }
            this.LLJJI = (C424200GkE) viewFindViewById;
            view2 = viewFindViewById;
        }
        C786410Ut5.d1((C424200GkE) view2, 8);
        MR();
    }
}
