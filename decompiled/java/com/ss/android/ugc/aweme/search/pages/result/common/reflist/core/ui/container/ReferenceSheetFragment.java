package com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.container;

import X.AbstractC1250290idn;
import X.AbstractC21673619ry;
import X.AbstractC329610Cw3;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20600815jK;
import X.C20600915jL;
import X.C2217381BqS;
import X.C301460Brk;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C434570H2h;
import X.C434640H2o;
import X.C437900HFc;
import X.C437910HFd;
import X.C444200HbO;
import X.C452501pT;
import X.C653450Pk7;
import X.C665180Q7g;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC434580H2i;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ies.powerlist.ListState$_liveData$1;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.IReferenceListAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.container.ReferenceSheetFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.sheet.ReferenceAwemeItemCell;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.sheet.ReferenceProductItemCell;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.sheet.ReferenceWebLinkItemCell;
import com.zhiliaoapp.musically.R;
import irm.AkS52S0200000_6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class ReferenceSheetFragment extends Fragment implements InterfaceC344240DeY, IReferenceListAbility {
    public static final C437900HFc LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiKiA+JSoiHELIOSZz02LiklOjt9Kyo+LGEmIWsvJiEnKSwiLD19GiAqLD02JiYpGic2LTEKOy40JSAiPQ==";
    public C434640H2o LL;
    public List<? extends InterfaceC1891350zJl> LLILLJJLI;
    public View LLILLL;
    public Function2<? super Integer, ? super InterfaceC434580H2i, Unit> LLILZ;
    public Function2<? super Integer, ? super InterfaceC434580H2i, Unit> LLILZIL;
    public WeakReference<View> LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 565));
    public Function0<Unit> LLIZLLLIL;
    public AbstractC329610Cw3<?> LLJ;
    public Function1<? super Function0<? extends ViewOnAttachStateChangeListenerC20604515jv>, Unit> LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ReferenceSheetFragment.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = new C437900HFc();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        Resources resources;
        String string;
        int iLIZJ;
        Resources resources2;
        String string2;
        C434640H2o c434640H2o = this.LL;
        String str = "";
        if (!C301460Brk.LIZJ(c434640H2o != null ? Integer.valueOf(c434640H2o.LIZLLL) : null)) {
            C0OM1 c0om1 = new C0OM1();
            c0om1.LIZLLL = true;
            C1250250idj c1250250idj = new C1250250idj();
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null && (string = resources.getString(2131847093)) != null) {
                str = string;
            }
            c1250250idj.LIZJ = str;
            c0om1.LIZJ = c1250250idj;
            return c0om1;
        }
        C434640H2o c434640H2o2 = this.LL;
        if ((c434640H2o2 != null && c434640H2o2.LIZJ != null) || (c434640H2o2 != null && c434640H2o2.LJ)) {
            return null;
        }
        C0OM1 c0om12 = new C0OM1();
        c0om12.LIZLLL = true;
        C1250250idj c1250250idj2 = new C1250250idj();
        Context context2 = getContext();
        if (context2 != null && (resources2 = context2.getResources()) != null && (string2 = resources2.getString(2131848656)) != null) {
            str = string2;
        }
        c1250250idj2.LIZJ = str;
        c0om12.LIZJ = c1250250idj2;
        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
        C1251150ifB c1251150ifB = new C1251150ifB();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_x_mark_small;
        Context context3 = getContext();
        if (context3 == null || (iLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context3)) == null) {
            iLIZJ = 0;
        }
        c419910GdJ.LIZLLL = iLIZJ;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c1251150ifB.LIZIZ(c419910GdJ);
        c1251150ifB.LIZJ(new AwS550S0100000_6(this, 564));
        abstractC1250290idnArr[0] = c1251150ifB;
        c0om12.LIZIZ(abstractC1250290idnArr);
        return c0om12;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1558520qew.LJIIJJI((InterfaceC665370Q7z) this.LLIZ.getValue(), IReferenceListAbility.class, null);
        super.onDestroyView();
        Function0<Unit> function0 = this.LLIZLLLIL;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.IReferenceListAbility
    public final C434640H2o getReferenceRenderData() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.IReferenceListAbility
    public final void WT(int i) {
        List<InterfaceC434580H2i> list;
        Function2<? super Integer, ? super InterfaceC434580H2i, Unit> function2;
        C434640H2o c434640H2o = this.LL;
        if (c434640H2o != null) {
            list = c434640H2o.LIZ;
        } else {
            list = null;
        }
        Object objLIZ = C444200HbO.LIZ(i, list);
        if (objLIZ != null && (function2 = this.LLILZIL) != null) {
            function2.invoke(Integer.valueOf(i), objLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.IReferenceListAbility
    public final void lE0(int i) {
        List<InterfaceC434580H2i> list;
        ArrayList arrayList;
        List<InterfaceC434580H2i> list2;
        C434640H2o c434640H2o = this.LL;
        if (c434640H2o != null) {
            list = c434640H2o.LIZ;
        } else {
            list = null;
        }
        InterfaceC434580H2i interfaceC434580H2i = (InterfaceC434580H2i) C444200HbO.LIZ(i, list);
        if (interfaceC434580H2i != null) {
            C434640H2o c434640H2o2 = this.LL;
            if (c434640H2o2 != null && (list2 = c434640H2o2.LIZ) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC434580H2i interfaceC434580H2i2 : list2) {
                    if (interfaceC434580H2i2 instanceof C434570H2h) {
                        arrayList2.add(interfaceC434580H2i2);
                    }
                }
                arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C434570H2h) it2.next()).LL);
                }
            } else {
                arrayList = null;
            }
            C665180Q7g c665180Q7g = C665180Q7g.LIZ;
            Context context = getContext();
            C434640H2o c434640H2o3 = this.LL;
            c665180Q7g.getClass();
            C665180Q7g.LIZ(interfaceC434580H2i, context, c434640H2o3, arrayList, null);
            Function2<? super Integer, ? super InterfaceC434580H2i, Unit> function2 = this.LLILZ;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(i), interfaceC434580H2i);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C20600815jK<InterfaceC1891350zJl> state;
        ListState$_liveData$1 listState$_liveData$1;
        super.onViewCreated(view, bundle);
        Integer numValueOf = null;
        C1558520qew.LJII((InterfaceC665370Q7z) this.LLIZ.getValue(), this, IReferenceListAbility.class, null, null);
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.t1p);
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558360qeg.LJ(viewOnAttachStateChangeListenerC20604515jv, null));
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(ReferenceAwemeItemCell.class, ReferenceWebLinkItemCell.class, ReferenceProductItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext()));
            C434640H2o c434640H2o = this.LL;
            if (c434640H2o != null) {
                AbstractC21673619ry adapter = viewOnAttachStateChangeListenerC20604515jv.getAdapter();
                if (adapter != null) {
                    new C653450Pk7(adapter).LIZJ(c434640H2o.LIZ, AFwS236S0000000_6.get$arr$(463));
                }
                viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(c434640H2o.LIZ, null);
                final C434640H2o c434640H2o2 = c434640H2o.LIZJ;
                if (c434640H2o2 != null) {
                    C434640H2o c434640H2o3 = this.LL;
                    if (c434640H2o3 != null) {
                        numValueOf = Integer.valueOf(c434640H2o3.LIZLLL);
                    }
                    if (C301460Brk.LIZJ(numValueOf) && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null && (listState$_liveData$1 = state.LIZIZ) != null) {
                        listState$_liveData$1.observe(this, new Observer<C20600915jL<?>>() { // from class: X.0HFm
                            @Override // androidx.lifecycle.Observer
                            public final void onChanged(C20600915jL<?> c20600915jL) {
                                ListState$_liveData$1 listState$_liveData$12;
                                if (!c20600915jL.LIZ.isEmpty()) {
                                    ReferenceSheetFragment referenceSheetFragment = this.LL;
                                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = viewOnAttachStateChangeListenerC20604515jv;
                                    C434640H2o c434640H2o4 = c434640H2o2;
                                    referenceSheetFragment.getClass();
                                    View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewOnAttachStateChangeListenerC20604515jv2.getContext()), R.layout.eza, viewOnAttachStateChangeListenerC20604515jv2, false);
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) viewTd.findViewById(R.id.title);
                                    C786410Ut5.I7(new AkS52S0200000_6(c434640H2o4, referenceSheetFragment, 10), appCompatTextView);
                                    C419910GdJ c419910GdJ = new C419910GdJ();
                                    c419910GdJ.LIZ = R.raw.icon_chevron_right_ltr;
                                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                                    appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, c419910GdJ.LIZ(viewTd.getContext()), (Drawable) null);
                                    appCompatTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                                    C427690Gpr.LJI(appCompatTextView, null);
                                    viewOnAttachStateChangeListenerC20604515jv2.LIZLLL(viewTd);
                                    C20600815jK<InterfaceC1891350zJl> state2 = viewOnAttachStateChangeListenerC20604515jv.getState();
                                    if (state2 != null && (listState$_liveData$12 = state2.LIZIZ) != null) {
                                        listState$_liveData$12.removeObserver(this);
                                    }
                                }
                            }
                        });
                    }
                }
            }
            AbstractC329610Cw3<?> abstractC329610Cw3 = this.LLJ;
            if (abstractC329610Cw3 != null) {
                viewOnAttachStateChangeListenerC20604515jv.LJIIL(abstractC329610Cw3);
            }
            Function1<? super Function0<? extends ViewOnAttachStateChangeListenerC20604515jv>, Unit> function1 = this.LLJI;
            if (function1 != null) {
                function1.invoke(new C437910HFd(viewOnAttachStateChangeListenerC20604515jv));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        C19GS c19gs = null;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(context), R.layout.f31, viewGroup, false);
        this.LLILLL = viewTd;
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
