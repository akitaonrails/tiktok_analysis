package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.grid.ui;

import X.C07E5;
import X.C0DXR;
import X.C15438062q;
import X.C1558520qew;
import X.C1559260qg8;
import X.C656100PoO;
import X.C656130PoR;
import X.C687700QyG;
import X.C723590SZx;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC656110PoP;
import X.InterfaceC656140PoS;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.grid.communication.SearchGridScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchNestedAutoplayCardHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS411S0200000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchGridAssem extends ReusedUISlotAssem<SearchGridAssem> implements InterfaceC656110PoP, InterfaceC737790Swr, InterfaceC1146704e9 {
    public final SearchGridAssem LLJJLIIIJLLLLLLLZ = this;
    public final C1559260qg8 LLJL = new C1559260qg8(new C723590SZx(this, C656130PoR.class, null), checkSupervisorPrepared());
    public final List<InterfaceC656140PoS> LLJLIL = new ArrayList();
    public ViewOnAttachStateChangeListenerC20604515jv LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eu3;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchGridScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchGridScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        ((ArrayList) this.LLJLIL).clear();
    }

    public final C656130PoR op() {
        return (C656130PoR) this.LLJL.getValue();
    }

    @Override // X.InterfaceC656110PoP
    public final void Ph(C656100PoO c656100PoO) {
        ((ArrayList) this.LLJLIL).add(c656100PoO);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchGridScope.class}).unbindAbility(this.LLJJLIIIJLLLLLLLZ, InterfaceC656110PoP.class);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.u8b);
        this.LLJLILLLLZIIL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558520qew.LJIIL(this));
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = op().LLIZ;
            viewOnAttachStateChangeListenerC20604515jv.LJIIIZ();
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new GridLayoutManager(view.getContext(), op().LLIZLLLIL));
            final int i = op().LLIZLLLIL;
            final int i2 = op().LLILLJJLI;
            final int i3 = op().LLILLJJLI;
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR(i, i2, i3) { // from class: X.0DXO
                public final int LL;
                public final int LLILLJJLI;
                public final int LLILLL;

                {
                    this.LL = i;
                    this.LLILLJJLI = i2;
                    this.LLILLL = i3;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                    int i4 = childAdapterPosition % this.LL;
                    if (!C444960Hcc.LIZIZ()) {
                        int i5 = this.LLILLJJLI;
                        int i6 = this.LL;
                        rect.left = (i4 * i5) / i6;
                        rect.right = i5 - (((i4 + 1) * i5) / i6);
                    } else {
                        int i7 = this.LLILLJJLI;
                        int i8 = this.LL;
                        rect.right = (i4 * i7) / i8;
                        rect.left = i7 - (((i4 + 1) * i7) / i8);
                    }
                    if (childAdapterPosition >= this.LL) {
                        rect.top = this.LLILLL;
                    }
                }
            });
            List<? extends Class<? extends PowerCell<?>>> list = op().LL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<? extends Class<? extends PowerCell<?>>> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (op().LLILZIL) {
                new SearchNestedAutoplayCardHelper(this, viewOnAttachStateChangeListenerC20604515jv, viewOnAttachStateChangeListenerC20604515jv, op().LLILZLL);
            }
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchGridScope.class}).bindAbility(this.LLJJLIIIJLLLLLLLZ, InterfaceC656110PoP.class);
    }

    @Override // X.InterfaceC656110PoP
    public final void setData(List<? extends InterfaceC1891350zJl> list) {
        new AwS411S0200000_10(this, (SearchGridAssem) list, (List<? extends InterfaceC1891350zJl>) 21).invoke();
    }

    @Override // X.InterfaceC656110PoP
    public final void LJLJJI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        Iterator it2 = ((ArrayList) this.LLJLIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC656140PoS) it2.next()).LIZ(interfaceC1891350zJl);
        }
    }

    @Override // X.InterfaceC656110PoP
    public final void LLD(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        Iterator it2 = ((ArrayList) this.LLJLIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC656140PoS) it2.next()).LIZLLL(interfaceC1891350zJl);
        }
    }

    @Override // X.InterfaceC656110PoP
    public final void T(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        Iterator it2 = ((ArrayList) this.LLJLIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC656140PoS) it2.next()).LIZIZ();
        }
    }

    @Override // X.InterfaceC656110PoP
    public final void h9(InterfaceC1891350zJl interfaceC1891350zJl, int i, View view) {
        Iterator it2 = ((ArrayList) this.LLJLIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC656140PoS) it2.next()).LIZJ(interfaceC1891350zJl, view);
        }
    }
}
