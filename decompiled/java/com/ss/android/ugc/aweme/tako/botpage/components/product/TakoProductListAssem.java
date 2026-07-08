package com.ss.android.ugc.aweme.tako.botpage.components.product;

import X.C01GW;
import X.C05PU;
import X.C0DXR;
import X.C0Q4Y;
import X.C123100dR;
import X.C1271304yF;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1847380yAq;
import X.C1857750yRZ;
import X.C1857910yRp;
import X.C1864530ycV;
import X.C1864550ycX;
import X.C1913307eV;
import X.C20600815jK;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1857900yRo;
import X.InterfaceC1891350zJl;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProductInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProductItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoProductListAssem extends ReusedUISlotAssem<TakoProductListAssem> implements InterfaceC712990Rxx<InterfaceC1857900yRo>, ITakoHighLightAnimProtocol {
    public View LLJJLIIIJLLLLLLLZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJL;
    public InterfaceC1857900yRo LLJLIL;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1272));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 799));
    public C0DXR LLJLLIL;

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final int Lm0() {
        return 100;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.flf;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final boolean isClosed() {
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final C05PU dz(int i) {
        Integer numValueOf;
        int iIntValue;
        LinearLayoutManager linearLayoutManager;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJL;
        View viewFindViewByPosition = null;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return null;
        }
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            numValueOf = Integer.valueOf(linearLayoutManager.findFirstCompletelyVisibleItemPosition());
        } else {
            numValueOf = null;
        }
        RecyclerView.LayoutManager layoutManager2 = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
        if (layoutManager2 != null) {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            viewFindViewByPosition = layoutManager2.findViewByPosition(iIntValue);
        }
        return new C1847380yAq(viewOnAttachStateChangeListenerC20604515jv, i, viewFindViewByPosition, numValueOf, new Pair(Integer.valueOf(C1857750yRZ.LJ() / 2), Integer.valueOf(C1857750yRZ.LJ() / 2)));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById = view.findViewById(R.id.rzz);
        C1913307eV.LIZIZ(viewFindViewById);
        this.LLJJLIIIJLLLLLLLZ = viewFindViewById;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.ryq);
        this.LLJL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 0, false));
            viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoProductItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoProductMoreItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558520qew.LJIIL(this));
            viewOnAttachStateChangeListenerC20604515jv.setOverScrollMode(2);
            C1864530ycV c1864530ycV = new C1864530ycV(this, 9);
            this.LLJLLIL = c1864530ycV;
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(c1864530ycV);
        }
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ITakoHighLightAnimProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC1857900yRo interfaceC1857900yRo) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        int i;
        C20600815jK<InterfaceC1891350zJl> state;
        String strLJJL;
        List<TakoProductItem> list;
        InterfaceC1857900yRo interfaceC1857900yRo2 = interfaceC1857900yRo;
        this.LLJLIL = interfaceC1857900yRo2;
        ArrayList arrayList = new ArrayList();
        TakoProductInfo productInfo = interfaceC1857900yRo2.getProductInfo();
        int i2 = 0;
        if (productInfo != null && (list = productInfo.items) != null) {
            int i3 = 0;
            for (TakoProductItem takoProductItem : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    arrayList.add(new C1857910yRp(i3, interfaceC1857900yRo2.LJJLJ(), takoProductItem));
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        TakoProductInfo productInfo2 = interfaceC1857900yRo2.getProductInfo();
        if (productInfo2 != null && productInfo2.hasMore && (strLJJL = interfaceC1857900yRo2.LJJL()) != null && C123100dR.LIZ(strLJJL)) {
            arrayList.add(new C1271304yF(strLJJL));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
            state.LJIILL(arrayList, null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            if (!arrayList.isEmpty()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewOnAttachStateChangeListenerC20604515jv3);
        }
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            if (interfaceC1857900yRo2.LLJL() || !(!arrayList.isEmpty())) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        }
        Integer numLJLZ = interfaceC1857900yRo2.LJLZ();
        if (interfaceC1857900yRo2.LJLZ() != null) {
            C0DXR c0dxr = this.LLJLLIL;
            if (c0dxr != null && (viewOnAttachStateChangeListenerC20604515jv = this.LLJL) != null) {
                viewOnAttachStateChangeListenerC20604515jv.removeItemDecoration(c0dxr);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJL;
            if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
                C1864550ycX c1864550ycX = new C1864550ycX(numLJLZ, this, 1);
                this.LLJLLIL = c1864550ycX;
                viewOnAttachStateChangeListenerC20604515jv4.addItemDecoration(c1864550ycX);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1857900yRo interfaceC1857900yRo) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1857900yRo interfaceC1857900yRo) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final boolean wv1(Message message, int i) {
        TakoMixFeed takoMixFeedLJIIIZ;
        if (message != null && (takoMixFeedLJIIIZ = message.LJIIIZ()) != null && takoMixFeedLJIIIZ.cardType == 11) {
            return true;
        }
        return false;
    }
}
