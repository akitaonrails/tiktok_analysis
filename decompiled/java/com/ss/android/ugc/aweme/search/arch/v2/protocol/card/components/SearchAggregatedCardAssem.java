package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C01GW;
import X.C03H5;
import X.C0DXR;
import X.C0Q4Y;
import X.C1196320hEk;
import X.C13BV;
import X.C1558520qew;
import X.C1591860rWi;
import X.C1913107eT;
import X.C1DWH;
import X.C20600815jK;
import X.C418440Gaw;
import X.C452501pT;
import X.C653210Pjj;
import X.C814420VxA;
import X.C844470XAv;
import X.InterfaceC1587906Jp;
import X.InterfaceC1891350zJl;
import X.InterfaceC652500Pia;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchAggregatedCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchNestedAutoplayCardHelper;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchAggregatedCardAssem<T extends InterfaceC652500Pia> extends ReusedUISlotAssem<SearchAggregatedCardAssem<T>> implements InterfaceC712990Rxx<T> {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10((SearchAggregatedCardAssem) this, 203));

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    public abstract int up();

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public View getDetectView() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return null;
        }
        return viewOnAttachStateChangeListenerC20604515jv;
    }

    public C1DWH op() {
        return new C653210Pjj();
    }

    public C0DXR sp() {
        Integer numValueOf = Integer.valueOf(C1913107eT.LJ());
        final int iIntValue = numValueOf.intValue() > 0 ? numValueOf.intValue() : 10;
        return new C0DXR() { // from class: X.0Gir
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (recyclerView.getLayoutDirection() == 1) {
                    if (childAdapterPosition != 0) {
                        rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                    }
                } else {
                    if (childAdapterPosition == 0) {
                        return;
                    }
                    rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                }
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        Class<? extends SearchAggregatedSubCardAssem<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> clsKf0;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(up());
        this.LLJJLIIIJLLLLLLLZ = viewOnAttachStateChangeListenerC20604515jv;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = null;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        C1196320hEk.LIZIZ(viewOnAttachStateChangeListenerC20604515jv, C1558520qew.LJIIL(this));
        viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
        Context context = getContext();
        if (context == null) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(context, 0, false));
        Class<? extends PowerCell<?>>[] clsArr = new Class[1];
        ISearchAggregatedCardProtocol iSearchAggregatedCardProtocol = (ISearchAggregatedCardProtocol) this.LLJL.getValue();
        if (iSearchAggregatedCardProtocol != null) {
            clsKf0 = iSearchAggregatedCardProtocol.Kf0();
        } else {
            clsKf0 = null;
        }
        clsArr[0] = clsKf0;
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(clsArr);
        Integer numValueOf = Integer.valueOf(C1913107eT.LJFF());
        if (numValueOf.intValue() > 0) {
            int iIntValue = numValueOf.intValue();
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJLIIIJLLLLLLLZ;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                viewOnAttachStateChangeListenerC20604515jv2 = viewOnAttachStateChangeListenerC20604515jv3;
            }
            C1591860rWi.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue))), viewOnAttachStateChangeListenerC20604515jv2);
        }
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(sp());
        new SearchNestedAutoplayCardHelper(this, viewOnAttachStateChangeListenerC20604515jv, getDetectView(), op());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: tp */
    public void up(T t) {
        List<InterfaceC1891350zJl> listCJ1;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
        if (state != null) {
            ISearchAggregatedCardProtocol iSearchAggregatedCardProtocol = (ISearchAggregatedCardProtocol) this.LLJL.getValue();
            if (iSearchAggregatedCardProtocol == null || (listCJ1 = iSearchAggregatedCardProtocol.cJ1(t)) == null) {
                listCJ1 = C13BV.INSTANCE;
            }
            state.LJIILL(listCJ1, null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(Object obj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
