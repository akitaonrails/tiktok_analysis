package com.ss.android.ugc.aweme.tako.botpage.components.userlist;

import X.C01GW;
import X.C07I4;
import X.C0DXR;
import X.C0Q4Y;
import X.C0QSJ;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1857280yQo;
import X.C1864530ycV;
import X.C1864550ycX;
import X.C1864560ycY;
import X.C20600815jK;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C689470R2r;
import X.C689480R2s;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC1857890yRn;
import X.InterfaceC1891350zJl;
import X.InterfaceC687730QyJ;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoSubCardScrollProtocol;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoMixCardComponentScope;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoUserListAssem extends ReusedUISlotAssem<TakoUserListAssem> implements InterfaceC712990Rxx<InterfaceC1857890yRn>, ITakoSubCardScrollProtocol, C0QSJ, InterfaceC1146704e9 {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJLIIIJLLLLLLLZ;
    public InterfaceC1857890yRn LLJL;
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1276));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 809));
    public C0DXR LLJLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fm4;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoMixCardComponentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoMixCardComponentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoMixCardComponentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoSubCardScrollProtocol
    public final void at0(int i) {
        RecyclerView.LayoutManager layoutManager;
        int iFindFirstVisibleItemPosition;
        int iFindFirstCompletelyVisibleItemPosition;
        RecyclerView.LayoutManager layoutManager2;
        int i2;
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2;
        RecyclerView.LayoutManager layoutManager3;
        int iFindFirstVisibleItemPosition2;
        int iFindFirstCompletelyVisibleItemPosition2;
        RecyclerView.LayoutManager layoutManager4;
        int i3;
        LinearLayoutManager linearLayoutManager3;
        LinearLayoutManager linearLayoutManager4;
        RecyclerView.LayoutManager layoutManager5 = null;
        if (C1857280yQo.LIZ((TakoCardAbility) this.LLJLILLLLZIIL.getValue())) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJLIIIJLLLLLLLZ;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                layoutManager3 = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            } else {
                layoutManager3 = null;
            }
            if ((layoutManager3 instanceof LinearLayoutManager) && (linearLayoutManager4 = (LinearLayoutManager) layoutManager3) != null) {
                iFindFirstVisibleItemPosition2 = linearLayoutManager4.findFirstVisibleItemPosition();
            } else {
                iFindFirstVisibleItemPosition2 = i;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJLIIIJLLLLLLLZ;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                layoutManager5 = viewOnAttachStateChangeListenerC20604515jv2.getLayoutManager();
            }
            if ((layoutManager5 instanceof LinearLayoutManager) && (linearLayoutManager3 = (LinearLayoutManager) layoutManager5) != null) {
                iFindFirstCompletelyVisibleItemPosition2 = linearLayoutManager3.findFirstCompletelyVisibleItemPosition();
            } else {
                iFindFirstCompletelyVisibleItemPosition2 = i;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJLIIIJLLLLLLLZ;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null && (layoutManager4 = viewOnAttachStateChangeListenerC20604515jv3.getLayoutManager()) != null) {
                C1864560ycY c1864560ycY = new C1864560ycY(getContext(), 0);
                if (iFindFirstVisibleItemPosition2 == i) {
                    i3 = iFindFirstVisibleItemPosition2 + 1;
                } else {
                    i3 = iFindFirstCompletelyVisibleItemPosition2 + 1;
                }
                c1864560ycY.LIZ = i3;
                layoutManager4.startSmoothScroll(c1864560ycY);
                return;
            }
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            layoutManager = viewOnAttachStateChangeListenerC20604515jv4.getLayoutManager();
        } else {
            layoutManager = null;
        }
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager) != null) {
            iFindFirstVisibleItemPosition = linearLayoutManager2.findFirstVisibleItemPosition();
        } else {
            iFindFirstVisibleItemPosition = i;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
            layoutManager5 = viewOnAttachStateChangeListenerC20604515jv5.getLayoutManager();
        }
        if ((layoutManager5 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager5) != null) {
            iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        } else {
            iFindFirstCompletelyVisibleItemPosition = i;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv6 == null || (layoutManager2 = viewOnAttachStateChangeListenerC20604515jv6.getLayoutManager()) == null) {
            return;
        }
        C1864560ycY c1864560ycY2 = new C1864560ycY(getContext(), 1);
        if (iFindFirstVisibleItemPosition == i) {
            i2 = iFindFirstVisibleItemPosition + 1;
        } else {
            i2 = iFindFirstCompletelyVisibleItemPosition + 1;
        }
        c1864560ycY2.LIZ = i2;
        layoutManager2.startSmoothScroll(c1864560ycY2);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.user_list);
        this.LLJJLIIIJLLLLLLLZ = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 0, false));
            viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
            if (C07I4.LIZ()) {
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(NimbleUserItemCell.class);
            } else {
                viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoUserItemCell.class);
            }
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoUserFootCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558520qew.LJIIL(this));
            viewOnAttachStateChangeListenerC20604515jv.setOverScrollMode(2);
            C1864530ycV c1864530ycV = new C1864530ycV(this, 2);
            this.LLJLL = c1864530ycV;
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(c1864530ycV);
        }
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ITakoSubCardScrollProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC1857890yRn interfaceC1857890yRn) {
        C20600815jK<InterfaceC1891350zJl> state;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        InterfaceC1891350zJl c689480R2s;
        InterfaceC1857890yRn interfaceC1857890yRn2 = interfaceC1857890yRn;
        ArrayList arrayList = new ArrayList();
        this.LLJL = interfaceC1857890yRn2;
        List<TakoUserItem> listLJJJJI = interfaceC1857890yRn2.LJJJJI();
        int i = 0;
        if (listLJJJJI != null) {
            int i2 = 0;
            for (TakoUserItem takoUserItem : listLJJJJI) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    TakoUserItem takoUserItem2 = takoUserItem;
                    if (C07I4.LIZ()) {
                        c689480R2s = new C689470R2r(takoUserItem2, Integer.valueOf(i2), interfaceC1857890yRn2.LJ());
                    } else {
                        c689480R2s = new C689480R2s(takoUserItem2, Integer.valueOf(i2), interfaceC1857890yRn2.LJ());
                    }
                    arrayList.add(c689480R2s);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        Integer numLJJJ = interfaceC1857890yRn2.LJJJ();
        if (numLJJJ != null) {
            C0DXR c0dxr = this.LLJLL;
            if (c0dxr != null && (viewOnAttachStateChangeListenerC20604515jv = this.LLJJLIIIJLLLLLLLZ) != null) {
                viewOnAttachStateChangeListenerC20604515jv.removeItemDecoration(c0dxr);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJLIIIJLLLLLLLZ;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                C1864550ycX c1864550ycX = new C1864550ycX(numLJJJ, this, 0);
                this.LLJLL = c1864550ycX;
                viewOnAttachStateChangeListenerC20604515jv2.addItemDecoration(c1864550ycX);
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null && (state = viewOnAttachStateChangeListenerC20604515jv3.getState()) != null) {
            state.LJIILL(arrayList, null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            if (!(!arrayList.isEmpty())) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewOnAttachStateChangeListenerC20604515jv4);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1857890yRn interfaceC1857890yRn) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1857890yRn interfaceC1857890yRn) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
