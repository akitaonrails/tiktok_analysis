package com.ss.android.ugc.aweme.search.pages.result.pov;

import X.C01GW;
import X.C098200Yq;
import X.C0R44;
import X.C0R47;
import X.C1558520qew;
import X.C189200o6;
import X.C452501pT;
import X.C640750PBh;
import X.C650630PfZ;
import X.InterfaceC652740Piy;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.NestedAutoPlayCardAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchNestedLocatorAbilityImp implements NestedAutoPlayCardAbility {
    public final LifecycleOwner LL;
    public final RecyclerView LLILLJJLI;
    public final View LLILLL;
    public final Function1<Integer, Unit> LLILZ;
    public final C01GW LLILZIL;

    public SearchNestedLocatorAbilityImp() {
        throw null;
    }

    public final void LIZIZ() {
        try {
            C1558520qew.LJI(this.LL, SearchPlayerScope.class, new SearchServiceCenter$AutoPlayAbility() { // from class: com.ss.android.ugc.aweme.search.pages.result.pov.SearchNestedLocatorAbilityImp$initAbility$1
                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void J0() {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void LJJLIIIJLLLLLLLZ() {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void LLZZZZ() {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void Mu(C650630PfZ c650630PfZ) {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final boolean N1() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final View Vt() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final boolean isPlaying() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void kC0(int i) {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final boolean mm() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void wp(C650630PfZ c650630PfZ) {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final View getDetectView() {
                    return this.LL.LLILLL;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
                    SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
                    Function1<Integer, Unit> function1 = this.LL.LLILZ;
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(c640750PBh.LIZ));
                    }
                    SearchNestedLocatorAbilityImp searchNestedLocatorAbilityImp = this.LL;
                    RecyclerView recyclerView = searchNestedLocatorAbilityImp.LLILLJJLI;
                    if (recyclerView.isLaidOut() && !recyclerView.isLayoutRequested()) {
                        for (Object obj : searchNestedLocatorAbilityImp.LIZ().keySet()) {
                            if (((InterfaceC652740Piy) obj).getPosition() == c640750PBh.LIZ) {
                                if (obj != null && (searchServiceCenter$AutoPlayAbility = searchNestedLocatorAbilityImp.LIZ().get(obj)) != null) {
                                    C640750PBh c640750PBh2 = c640750PBh.LIZIZ;
                                    if (c640750PBh2 != null) {
                                        searchServiceCenter$AutoPlayAbility.Ot0(c640750PBh2, function0);
                                        return;
                                    } else {
                                        function0.invoke();
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        return;
                    }
                    recyclerView.addOnLayoutChangeListener(new C0R44(searchNestedLocatorAbilityImp, c640750PBh, function0, 3));
                }
            }, SearchServiceCenter$AutoPlayAbility.class, null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        try {
            C1558520qew.LJI(this.LL, SearchPlayerScope.class, this, NestedAutoPlayCardAbility.class, null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public final HashMap<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> LIZ() {
        return (HashMap) this.LLILZIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.NestedAutoPlayCardAbility
    public final void Sn2(SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility) {
        Iterator<Map.Entry<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility>> it2 = LIZ().entrySet().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().getValue(), searchServiceCenter$AutoPlayAbility)) {
                it2.remove();
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.NestedAutoPlayCardAbility
    public final void ms0(SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility) {
        LIZLLL(searchServiceCenter$AutoPlayAbility.getDetectView(), new AwS376S0200000_10(searchServiceCenter$AutoPlayAbility, this, 48));
    }

    public final void LIZLLL(View view, Function1<? super RecyclerView.ViewHolder, Unit> function1) {
        while (view != null) {
            if (!view.isAttachedToWindow()) {
                if (view.isAttachedToWindow()) {
                    LIZLLL(view, function1);
                    return;
                } else {
                    view.addOnAttachStateChangeListener(new C0R47(view, this, function1, 0));
                    return;
                }
            }
            if (Intrinsics.LJFF(view.getParent(), this.LLILLJJLI)) {
                function1.invoke(this.LLILLJJLI.getChildViewHolder(view));
                return;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return;
            } else {
                view = (View) parent;
            }
        }
    }

    public SearchNestedLocatorAbilityImp(ReusedUIAssem reusedUIAssem, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2) {
        this.LL = reusedUIAssem;
        this.LLILLJJLI = viewOnAttachStateChangeListenerC20604515jv;
        this.LLILLL = viewOnAttachStateChangeListenerC20604515jv2;
        this.LLILZ = null;
        this.LLILZIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(429));
    }
}
