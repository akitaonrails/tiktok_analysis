package com.ss.android.ugc.aweme.effect;

import X.AbstractC21342018fa;
import X.C01GW;
import X.C098200Yq;
import X.C0CHQ;
import X.C0F4X;
import X.C13BV;
import X.C1627000sRO;
import X.C1629670sVh;
import X.C1659630tI1;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19412710xB;
import X.C19412810xC;
import X.C19EG;
import X.C19GS;
import X.C20510015Ni;
import X.C21341918fZ;
import X.C21342318fd;
import X.C2281251EQx;
import X.C23113093v;
import X.C425240Glu;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC19347710mh;
import X.InterfaceC19557211fO;
import Y.AObserverS231S0100000_29;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.download.EffectDownloadController;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public abstract class EditEffectTabFragment extends Fragment implements InterfaceC19557211fO, InterfaceC19347710mh {
    public C425240Glu LL;
    public LinearLayout LLILLJJLI;
    public String LLILLL;
    public List<? extends Effect> LLILZ;
    public LinearLayoutManager LLILZIL;
    public C19412810xC LLILZLL;
    public boolean LLJ;
    public EffectDownloadController LLJI;
    public Function0<Unit> LLJIJIL;
    public EditEffectVideoModel LLJILJILJ;
    public List<? extends EffectModel> LLIZ = C13BV.INSTANCE;
    public boolean LLIZLLLIL = true;
    public final C01GW LLJILJIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS573S0100000_29(this, 105));
    public final ArrayList<EffectPointModel> LLJILLL = new ArrayList<>();

    public final void MR() {
        t4(true);
        if (this.LLIZ.isEmpty()) {
            this.LLILZ = C23113093v.LIZIZ("edit_effect", NR(), new AwS608S0100000_29(this, 88));
        }
        if (this.LLIZ.isEmpty()) {
            if (NR().isEmpty()) {
                C2281251EQx.LIZ.LJII("effect", "", "", false);
            } else {
                C2281251EQx.LIZ.LJII("effect", "", "", true);
            }
        }
        int i = 0;
        for (Effect effect : NR()) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            Effect effect2 = effect;
            String str = this.LLILLL;
            if (str == null) {
                str = null;
            }
            EffectModel effectModelLIZ = C0F4X.LIZ(i, effect2, str, "edit_page_panel");
            if (this.LLJ || !effectModelLIZ.isGoToCapCutEffect) {
                final List<? extends EffectModel> list = this.LLIZ;
                final ArrayList arrayList = new ArrayList(list);
                arrayList.add(effectModelLIZ);
                PR(C21342318fd.LIZ(new AbstractC21342018fa(list, arrayList) { // from class: X.0EFd
                    public final List<EffectModel> LIZ;
                    public final List<EffectModel> LIZIZ;

                    @Override // X.AbstractC21342018fa
                    public final int LIZLLL() {
                        return this.LIZIZ.size();
                    }

                    @Override // X.AbstractC21342018fa
                    public final int LJ() {
                        return this.LIZ.size();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LIZ = list;
                        this.LIZIZ = arrayList;
                    }

                    @Override // X.AbstractC21342018fa
                    public final boolean LIZ(int i3, int i4) {
                        return Intrinsics.LJFF(ListProtector.get(this.LIZ, i3), ListProtector.get(this.LIZIZ, i4));
                    }

                    @Override // X.AbstractC21342018fa
                    public final boolean LIZIZ(int i3, int i4) {
                        return Intrinsics.LJFF(((EffectModel) ListProtector.get(this.LIZ, i3)).name, ((EffectModel) ListProtector.get(this.LIZIZ, i4)).name);
                    }
                }, true), arrayList);
                C425240Glu c425240GluOR = OR();
                if (c425240GluOR != null && c425240GluOR.getVisibility() == 8) {
                    t4(false);
                }
            }
            i = i2;
        }
    }

    public abstract void PR(C21341918fZ c21341918fZ, List<? extends EffectModel> list);

    public void clearFromXmlViewCache() {
        this.LL = null;
        this.LLILLJJLI = null;
    }

    public final List<Effect> NR() {
        List list = this.LLILZ;
        if (list != null) {
            return list;
        }
        return null;
    }

    public final C425240Glu OR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t11) : null;
            this.LL = (C425240Glu) viewFindViewById;
        }
        return (C425240Glu) viewFindViewById;
    }

    @Override // X.InterfaceC19557211fO
    public final void w4() {
        EditEffectVideoModel editEffectVideoModel = this.LLJILJILJ;
        if (editEffectVideoModel == null) {
            editEffectVideoModel = null;
        }
        this.LLJILLL.clear();
        ArrayList<EffectPointModel> arrayList = this.LLJILLL;
        ArrayList<EffectPointModel> arrayListDt = editEffectVideoModel.vQ2().dt();
        ArrayList arrayList2 = new ArrayList();
        for (EffectPointModel effectPointModel : arrayListDt) {
            EffectPointModel effectPointModel2 = effectPointModel;
            String category = effectPointModel2.getCategory();
            String str = this.LLILLL;
            if (str == null) {
                str = null;
            }
            if (!Intrinsics.LJFF(category, str)) {
                List<Effect> listNR = NR();
                if (!(listNR instanceof Collection) || !listNR.isEmpty()) {
                    Iterator<Effect> it2 = listNR.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().getEffectId(), effectPointModel2.getKey())) {
                        }
                    }
                }
            }
            arrayList2.add(effectPointModel);
        }
        arrayList.addAll(arrayList2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EffectDownloadController effectDownloadController = this.LLJI;
        if (effectDownloadController != null) {
            effectDownloadController.LJFF.remove(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // X.InterfaceC19557211fO
    public final List<EffectPointModel> LLILIL() {
        return this.LLJILLL;
    }

    public final void RR(Function0<Unit> function0) {
        if (!C20510015Ni.LIZ.LJIIIIZZ()) {
            this.LLJIJIL = function0;
            ((C1629670sVh) this.LLJILJIL.getValue()).LIZ();
            C1627000sRO.LIZIZ(getContext(), true);
            return;
        }
        function0.invoke();
    }

    public final void SR(int i) {
        EffectDownloadController effectDownloadController;
        C0CHQ.LIZ().getApplicationService().getClass();
        if (C0CHQ.LIZ().LJJJ().LIZIZ() < 0) {
            return;
        }
        int size = NR().size();
        for (int i2 = i + 1; i2 < size; i2++) {
            if (this.LLJI == null || !EffectDownloadController.LJ((Effect) ListProtector.get(NR(), i2))) {
                if (i2 != -1 && (effectDownloadController = this.LLJI) != null) {
                    effectDownloadController.LIZIZ((Effect) ListProtector.get(NR(), i2), false);
                    return;
                }
                return;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            w4();
            EditEffectVideoModel editEffectVideoModel = this.LLJILJILJ;
            if (editEffectVideoModel == null) {
                editEffectVideoModel = null;
            }
            editEffectVideoModel.zQ2().observe(this, new AObserverS231S0100000_29(this, 42));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLILZ = arguments.getParcelableArrayList("effect_list");
            this.LLILLL = arguments.getString("effect_category");
            this.LLIZLLLIL = arguments.getBoolean("motio_toast", true);
            this.LLJ = arguments.getBoolean("show_goto_capcut_effect", false);
        }
        this.LLJILLL.clear();
        EffectDownloadController effectDownloadController = this.LLJI;
        if (effectDownloadController != null) {
            effectDownloadController.LJFF.add(this);
        }
    }

    public final void t4(boolean z) {
        View viewFindViewById = null;
        C19412810xC c19412810xC = null;
        if (z) {
            View viewFindViewById2 = this.LLILLJJLI;
            if (viewFindViewById2 == null) {
                View view = getView();
                if (view != null) {
                    viewFindViewById2 = view.findViewById(R.id.f762nla);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILLJJLI = (LinearLayout) viewFindViewById2;
            }
            C786410Ut5.LJZL(0, (LinearLayout) viewFindViewById2);
            C786410Ut5.f1(OR(), 8);
            C19412810xC c19412810xC2 = this.LLILZLL;
            if (c19412810xC2 != null) {
                c19412810xC = c19412810xC2;
            }
            c19412810xC.LIZLLL();
            return;
        }
        C19412810xC c19412810xC3 = this.LLILZLL;
        if (c19412810xC3 == null) {
            c19412810xC3 = null;
        }
        c19412810xC3.LIZJ();
        View view2 = this.LLILLJJLI;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.f762nla);
            }
            this.LLILLJJLI = (LinearLayout) viewFindViewById;
            view2 = viewFindViewById;
        }
        C786410Ut5.LJZL(8, (LinearLayout) view2);
        C786410Ut5.f1(OR(), 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = null;
        EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) C1659630tI1.LJII(view, null, 6).get(EditEffectVideoModel.class);
        this.LLJILJILJ = editEffectVideoModel;
        if (editEffectVideoModel == null) {
            editEffectVideoModel = null;
        }
        if (editEffectVideoModel.LLIZ == null && getActivity() != null) {
            EditEffectVideoModel editEffectVideoModel2 = this.LLJILJILJ;
            if (editEffectVideoModel2 == null) {
                editEffectVideoModel2 = null;
            }
            editEffectVideoModel2.LLIZ = C0CHQ.LIZ().LJJJ().LIZ();
        }
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(view.getContext());
        linearLayoutManager2.setOrientation(0);
        this.LLILZIL = linearLayoutManager2;
        C425240Glu c425240GluOR = OR();
        LinearLayoutManager linearLayoutManager3 = this.LLILZIL;
        if (linearLayoutManager3 != null) {
            linearLayoutManager = linearLayoutManager3;
        }
        c425240GluOR.setLayoutManager(linearLayoutManager);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c8l, viewGroup, false);
        C19412810xC c19412810xC = (C19412810xC) viewTd.findViewById(R.id.nne);
        this.LLILZLL = c19412810xC;
        C19GS c19gs = null;
        if (c19412810xC == null) {
            c19412810xC = null;
        }
        C19412710xB c19412710xBLIZ = C19412710xB.LIZ(getContext());
        c19412710xBLIZ.LJ = 1;
        c19412810xC.setBuilder(c19412710xBLIZ);
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
