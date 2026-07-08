package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.ui;

import X.C020M;
import X.C07E5;
import X.C0DXR;
import X.C13LE;
import X.C14KQ;
import X.C15438062q;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1606420ruC;
import X.C20635615ow;
import X.C2217381BqS;
import X.C426750GoL;
import X.C654550Plt;
import X.C657990PrR;
import X.C661490Px5;
import X.C687700QyG;
import X.C723590SZx;
import X.C723830SaL;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC21676519sR;
import X.InterfaceC2217461Bqa;
import X.InterfaceC652300PiG;
import X.InterfaceC654580Plw;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS37S0100000_10;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.communication.SearchHorizontalListScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchNestedAutoplayCardHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS93S0210000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchHorizontalListAssem extends ReusedUISlotAssem<SearchHorizontalListAssem> implements InterfaceC652300PiG, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final SearchHorizontalListAssem LLJJLIIIJLLLLLLLZ = this;
    public final C1559260qg8 LLJL = new C1559260qg8(new C723590SZx(this, C654550Plt.class, null), checkSupervisorPrepared());
    public final List<InterfaceC654580Plw> LLJLIL = new ArrayList();
    public ViewOnAttachStateChangeListenerC20604515jv LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchHorizontalListAssem.class, "ability", "getAbility()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/horizontallist/ability/SearchScrollToOpenAbility;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eu4;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchHorizontalListScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchHorizontalListScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC652300PiG
    public final void Z4() {
        ((ArrayList) this.LLJLIL).clear();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        ((ArrayList) this.LLJLIL).clear();
    }

    public final C654550Plt op() {
        return (C654550Plt) this.LLJL.getValue();
    }

    public SearchHorizontalListAssem() {
        new ArrayList();
    }

    @Override // X.InterfaceC652300PiG
    public final ViewOnAttachStateChangeListenerC20604515jv pm() {
        return this.LLJLILLLLZIIL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // X.InterfaceC652300PiG
    public final void Tl(InterfaceC654580Plw interfaceC654580Plw) {
        ((ArrayList) this.LLJLIL).add(interfaceC654580Plw);
    }

    @Override // X.InterfaceC652300PiG
    public final void V6(FixedRatioFrameLayout fixedRatioFrameLayout) {
        int height;
        Iterator it2 = ((ArrayList) this.LLJLIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC654580Plw) it2.next()).LJFF(fixedRatioFrameLayout);
        }
        Integer num = op().LLILZLL;
        if (num != null) {
            height = num.intValue();
        } else {
            height = op().LLILZIL.invoke().LIZ.getHeight();
        }
        C657990PrR.LIZJ(this.LLJLILLLLZIIL, new C020M(height, 6));
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchHorizontalListScope.class}).unbindAbility(this.LLJJLIIIJLLLLLLLZ, InterfaceC652300PiG.class);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        int height;
        this.LLJLILLLLZIIL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.u8e);
        view.findViewById(R.id.u8d);
        Context context = view.getContext();
        if (context != null && (viewOnAttachStateChangeListenerC20604515jv = this.LLJLILLLLZIIL) != null) {
            viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558520qew.LJIIL(this));
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
            viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = op().LLJJIJIL;
            Integer num = op().LLILZLL;
            if (num != null) {
                height = num.intValue();
            } else {
                height = op().LLILZIL.invoke().LIZ.getHeight();
            }
            C657990PrR.LIZJ(viewOnAttachStateChangeListenerC20604515jv, new C020M(height, 5));
            final int i = op().LLILLJJLI / 2;
            int i2 = op().LLILLL - i;
            C426750GoL.LJIIL(viewOnAttachStateChangeListenerC20604515jv, Integer.valueOf(i2), null, Integer.valueOf(i2), null, 26);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            boolean z = false;
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(context, 0, false));
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR() { // from class: X.0Gim
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int i3 = i;
                    rect.left = i3;
                    rect.right = i3;
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
            if (op().LLJI) {
                new SearchNestedAutoplayCardHelper(this, viewOnAttachStateChangeListenerC20604515jv, viewOnAttachStateChangeListenerC20604515jv, op().LLJILLL);
            }
            if (op().LLJILJILJ) {
                Context context2 = GlobalContext.getContext();
                if (context2 != null && C426750GoL.LIZLLL(context2)) {
                    z = true;
                }
                new C20635615ow(z, C14KQ.LJIIIIZZ(GlobalContext.getContext())).LIZIZ(this.LLJLILLLLZIIL);
            }
            viewOnAttachStateChangeListenerC20604515jv.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0Plv
                @Override // X.InterfaceC21676519sR
                public final void m3(View view2) {
                }

                @Override // X.InterfaceC21676519sR
                public final void g5(View view2) {
                    RecyclerView.ViewHolder childViewHolder = viewOnAttachStateChangeListenerC20604515jv.getChildViewHolder(view2);
                    PowerCell powerCell = null;
                    if (childViewHolder instanceof AssemPowerCell) {
                        powerCell = (PowerCell) childViewHolder;
                    }
                    childViewHolder.getBindingAdapterPosition();
                    if (powerCell != null && powerCell.getItem() != null) {
                        Iterator it3 = ((ArrayList) this.LLJLIL).iterator();
                        while (it3.hasNext()) {
                            ((InterfaceC654580Plw) it3.next()).LIZLLL();
                        }
                    }
                }
            });
            viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS37S0100000_10(this, 23));
        }
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 122));
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchHorizontalListScope.class}).bindAbility(this.LLJJLIIIJLLLLLLLZ, InterfaceC652300PiG.class);
    }

    @Override // X.InterfaceC652300PiG
    public final void LJLJJI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        Iterator<InterfaceC654580Plw> it2 = this.LLJLIL.iterator();
        while (it2.hasNext()) {
            it2.next().LJLJJI(i, interfaceC1891350zJl);
        }
    }

    @Override // X.InterfaceC652300PiG
    public final void LLD(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        Iterator<InterfaceC654580Plw> it2 = this.LLJLIL.iterator();
        while (it2.hasNext()) {
            it2.next().LLD(i, interfaceC1891350zJl);
        }
    }

    @Override // X.InterfaceC652300PiG
    public final void T(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        Iterator it2 = ((ArrayList) this.LLJLIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC654580Plw) it2.next()).LIZIZ();
        }
    }

    @Override // X.InterfaceC652300PiG
    public final void j4(List<? extends InterfaceC1891350zJl> list, boolean z) {
        new AwS93S0210000_10(this, (SearchHorizontalListAssem) list, (List<? extends InterfaceC1891350zJl>) z, false).invoke();
    }

    @Override // X.InterfaceC652300PiG
    public final void U8(InterfaceC1891350zJl interfaceC1891350zJl, int i, View view, C661490Px5 c661490Px5, C1606420ruC c1606420ruC) {
        Iterator it2 = ((ArrayList) this.LLJLIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC654580Plw) it2.next()).LJ(interfaceC1891350zJl, i, view, c661490Px5, c1606420ruC);
        }
    }
}
