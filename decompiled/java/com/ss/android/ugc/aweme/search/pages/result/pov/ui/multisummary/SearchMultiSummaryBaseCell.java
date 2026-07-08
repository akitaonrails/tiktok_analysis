package com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary;

import X.C03H8;
import X.C0Q4Y;
import X.C0QSJ;
import X.C1196320hEk;
import X.C1558520qew;
import X.C18142078q;
import X.C20600815jK;
import X.C418440Gaw;
import X.C640750PBh;
import X.C650630PfZ;
import X.C673150Qan;
import X.C687700QyG;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC658500PsG;
import X.InterfaceC665370Q7z;
import X.InterfaceC684740QtU;
import X.InterfaceC684820Qtc;
import X.InterfaceC687730QyJ;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.NestedAutoPlayCardAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.SearchUltimateInflateBaseCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchMultiSummaryBaseCell<ITEM extends InterfaceC684740QtU> extends SearchUltimateInflateBaseCell<ITEM> implements C0QSJ, InterfaceC1146704e9 {
    public ViewOnAttachStateChangeListenerC20604515jv LLIZ;
    public final SearchMultiSummaryBaseCell$autoPlayAbility$1 LLIZLLLIL = new SearchServiceCenter$AutoPlayAbility(this) { // from class: com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchMultiSummaryBaseCell$autoPlayAbility$1
        public final /* synthetic */ SearchMultiSummaryBaseCell<ITEM> LL;

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
            SearchMultiSummaryBaseCell<ITEM> searchMultiSummaryBaseCell = this.LL;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = searchMultiSummaryBaseCell.LLIZ;
            return viewOnAttachStateChangeListenerC20604515jv == null ? searchMultiSummaryBaseCell.itemView : viewOnAttachStateChangeListenerC20604515jv;
        }

        {
            this.LL = this;
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
            LinearLayoutManager linearLayoutManager;
            function0.invoke();
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LL.LLIZ;
            RecyclerView.LayoutManager layoutManager = null;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            }
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                linearLayoutManager.scrollToPositionWithOffset(c640750PBh.LIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                return;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LL.LLIZ;
            if (viewOnAttachStateChangeListenerC20604515jv2 == null) {
                return;
            }
            viewOnAttachStateChangeListenerC20604515jv2.scrollToPosition(c640750PBh.LIZ);
        }
    };
    public InterfaceC658500PsG LLJ;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC658500PsG.class) {
            this.LLJ = (InterfaceC658500PsG) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchPlayerScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC658500PsG.class) {
            return this.LLJ;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchPlayerScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchPlayerScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC658500PsG.class) {
            this.LLJ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        InterfaceC684820Qtc interfaceC684820Qtc;
        super.onItemViewCreated();
        C03H8 c03h8NG1 = NG1();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvR8 = (!(c03h8NG1 instanceof InterfaceC684820Qtc) || (interfaceC684820Qtc = (InterfaceC684820Qtc) c03h8NG1) == null) ? null : interfaceC684820Qtc.r8(LJJIJL());
        this.LLIZ = viewOnAttachStateChangeListenerC20604515jvR8;
        if (viewOnAttachStateChangeListenerC20604515jvR8 != null) {
            viewOnAttachStateChangeListenerC20604515jvR8.setNestedScrollingEnabled(false);
            viewOnAttachStateChangeListenerC20604515jvR8.setItemAnimator(null);
            C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jvR8.getState();
            if (state != null) {
                state.LIZLLL = C0Q4Y.LATEST;
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        NestedAutoPlayCardAbility nestedAutoPlayCardAbility;
        super.unBind();
        if (C18142078q.LIZ() || (interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this)) == null || (nestedAutoPlayCardAbility = (NestedAutoPlayCardAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, NestedAutoPlayCardAbility.class, null)) == null) {
            return;
        }
        nestedAutoPlayCardAbility.Sn2(this.LLIZLLLIL);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        NestedAutoPlayCardAbility nestedAutoPlayCardAbility;
        super.onBindItemView(interfaceC1891350zJl);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZ;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this)) != null) {
            viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, interfaceC665370Q7zLIZ);
            if (!C18142078q.LIZ() && (nestedAutoPlayCardAbility = (NestedAutoPlayCardAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, NestedAutoPlayCardAbility.class, null)) != null) {
                nestedAutoPlayCardAbility.ms0(this.LLIZLLLIL);
            }
        }
    }
}
