package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.assem;

import X.AbstractC21673619ry;
import X.AbstractC339560DSw;
import X.AbstractC514430KFl;
import X.C019F;
import X.C01GW;
import X.C0DVN;
import X.C0K7G;
import X.C0KC4;
import X.C0KDY;
import X.C0KEQ;
import X.C0KER;
import X.C0KEV;
import X.C0KEX;
import X.C0KEZ;
import X.C13LE;
import X.C13LQ;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C339550DSv;
import X.C452501pT;
import X.C513100KAi;
import X.C513110KAj;
import X.C513140KAm;
import X.C513860KDg;
import X.C514060KEa;
import X.C514440KFm;
import X.C514450KFn;
import X.C514460KFo;
import X.C514470KFp;
import X.C514480KFq;
import X.C514500KFs;
import X.C514510KFt;
import X.C514520KFu;
import X.C514530KFv;
import X.C514540KFw;
import X.C514550KFx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC339570DSx;
import X.InterfaceC665370Q7z;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class ScrollablePackageContentAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public C0KC4 LLJJIII;
    public RecyclerView LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final Map<Class<? extends InterfaceC339570DSx>, C0DVN<? extends InterfaceC339570DSx, ? extends AbstractC339560DSw<? extends InterfaceC339570DSx>>> LLJJJ;
    public final List<AbstractC514430KFl> LLJJJIL;
    public Boolean LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ScrollablePackageContentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/foundation/packagepage/viewmodel/SubPackagePageAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ff_;
    }

    public ScrollablePackageContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubPackagePageAssemVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 438), AFwS237S0000000_7.get$arr$(200), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 437));
        this.LLJJIJIL = C0K7G.LJIIIZ();
        this.LLJJJ = C2097608Jq.LJIIIIZZ(new Pair(C514450KFn.class, new C0DVN<C514450KFn, C0KEQ>() { // from class: X.0KES
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.ff1;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view) {
                return new C0KEQ(view);
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLIZLLL = C0K51.LIZLLL(viewGroup.getContext());
                if (layoutInflaterLIZLLL != null) {
                    layoutInflater = layoutInflaterLIZLLL;
                }
                return new C0KEQ(C786410Ut5.Td(layoutInflater, R.layout.ff1, viewGroup, false));
            }
        }), new Pair(C514520KFu.class, new C0DVN<C514520KFu, C513860KDg>() { // from class: X.0KEA
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.ff4;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view) {
                return new C513860KDg(view);
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLIZLLL = C0K51.LIZLLL(viewGroup.getContext());
                if (layoutInflaterLIZLLL != null) {
                    layoutInflater = layoutInflaterLIZLLL;
                }
                return new C513860KDg(C786410Ut5.Td(layoutInflater, R.layout.ff4, viewGroup, false));
            }
        }), new Pair(C514470KFp.class, new C0DVN<C514470KFp, C0KEZ>() { // from class: X.0KEY
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.ff2;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view) {
                return new C0KEZ(view);
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLIZLLL = C0K51.LIZLLL(viewGroup.getContext());
                if (layoutInflaterLIZLLL != null) {
                    layoutInflater = layoutInflaterLIZLLL;
                }
                return new C0KEZ(C786410Ut5.Td(layoutInflater, R.layout.ff2, viewGroup, false));
            }
        }), new Pair(C514480KFq.class, new C0DVN<C514480KFq, C0KER>() { // from class: X.0KET
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.ff7;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view) {
                return new C0KER(view);
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLIZLLL = C0K51.LIZLLL(viewGroup.getContext());
                if (layoutInflaterLIZLLL != null) {
                    layoutInflater = layoutInflaterLIZLLL;
                }
                return new C0KER(C786410Ut5.Td(layoutInflater, R.layout.ff7, viewGroup, false));
            }
        }), new Pair(C514510KFt.class, new C0DVN<C514510KFt, C514060KEa>() { // from class: X.0KEd
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.ff8;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view) {
                return new C514060KEa(view);
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLIZLLL = C0K51.LIZLLL(viewGroup.getContext());
                if (layoutInflaterLIZLLL != null) {
                    layoutInflater = layoutInflaterLIZLLL;
                }
                return new C514060KEa(C786410Ut5.Td(layoutInflater, R.layout.ff8, viewGroup, false));
            }
        }), new Pair(C514500KFs.class, new C0DVN<C514500KFs, C0KDY>() { // from class: X.0KE9
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.fey;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view) {
                return new C0KDY(view);
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLIZLLL = C0K51.LIZLLL(viewGroup.getContext());
                if (layoutInflaterLIZLLL != null) {
                    layoutInflater = layoutInflaterLIZLLL;
                }
                return new C0KDY(C786410Ut5.Td(layoutInflater, R.layout.fey, viewGroup, false));
            }
        }), new Pair(C514440KFm.class, new C0DVN<C514440KFm, C0KEV>() { // from class: X.0KEU
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.ff6;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view) {
                return new C0KEV(view);
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLIZLLL = C0K51.LIZLLL(viewGroup.getContext());
                if (layoutInflaterLIZLLL != null) {
                    layoutInflater = layoutInflaterLIZLLL;
                }
                return new C0KEV(C786410Ut5.Td(layoutInflater, R.layout.ff6, viewGroup, false));
            }
        }), new Pair(C514460KFo.class, new C0DVN<C514460KFo, C0KEX>() { // from class: X.0KEW
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.fex;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view) {
                return new C0KEX(view);
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLIZLLL = C0K51.LIZLLL(viewGroup.getContext());
                if (layoutInflaterLIZLLL != null) {
                    layoutInflater = layoutInflaterLIZLLL;
                }
                return new C0KEX(C786410Ut5.Td(layoutInflater, R.layout.fex, viewGroup, false));
            }
        }), new Pair(C514550KFx.class, new C0DVN<C514550KFx, C513100KAi>() { // from class: X.0KAk
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.ff5;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view) {
                return new C513100KAi(view);
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLIZLLL = C0K51.LIZLLL(viewGroup.getContext());
                if (layoutInflaterLIZLLL != null) {
                    layoutInflater = layoutInflaterLIZLLL;
                }
                return new C513100KAi(C786410Ut5.Td(layoutInflater, R.layout.ff5, viewGroup, false));
            }
        }), new Pair(C514530KFv.class, new C0DVN<C514530KFv, C513140KAm>() { // from class: X.0KAn
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.few;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view) {
                return new C513140KAm(view);
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLIZLLL = C0K51.LIZLLL(viewGroup.getContext());
                if (layoutInflaterLIZLLL != null) {
                    layoutInflater = layoutInflaterLIZLLL;
                }
                return new C513140KAm(C786410Ut5.Td(layoutInflater, R.layout.few, viewGroup, false));
            }
        }), new Pair(C514540KFw.class, new C0DVN<C514540KFw, C513110KAj>() { // from class: X.0KAl
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.ff3;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view) {
                return new C513110KAj(view);
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLIZLLL = C0K51.LIZLLL(viewGroup.getContext());
                if (layoutInflaterLIZLLL != null) {
                    layoutInflater = layoutInflaterLIZLLL;
                }
                return new C513110KAj(C786410Ut5.Td(layoutInflater, R.layout.ff3, viewGroup, false));
            }
        }));
        this.LLJJJIL = C13LQ.LJIJI(new AbstractC514430KFl[]{new AbstractC514430KFl() { // from class: X.0KFn
            public final String LIZIZ = "item_package_migration_alert";

            @Override // X.InterfaceC339570DSx
            public final String LJJJ() {
                return this.LIZIZ;
            }
        }, new AbstractC514430KFl() { // from class: X.0KFm
            public final String LIZIZ = "item_package_refund_alert";

            @Override // X.InterfaceC339570DSx
            public final String LJJJ() {
                return this.LIZIZ;
            }
        }, new AbstractC514430KFl() { // from class: X.0KFv
            public final String LIZIZ = "item_package_anchor_profile";

            @Override // X.InterfaceC339570DSx
            public final String LJJJ() {
                return this.LIZIZ;
            }
        }, new AbstractC514430KFl() { // from class: X.0KFx
            public final String LIZIZ = "item_package_sub_plans_selection_tab";

            @Override // X.InterfaceC339570DSx
            public final String LJJJ() {
                return this.LIZIZ;
            }
        }, new AbstractC514430KFl() { // from class: X.0KFw
            public final String LIZIZ = "item_package_perk_info";

            @Override // X.InterfaceC339570DSx
            public final String LJJJ() {
                return this.LIZIZ;
            }
        }, new AbstractC514430KFl() { // from class: X.0KFu
            public final String LIZIZ = "item_package_sub_plans";

            @Override // X.InterfaceC339570DSx
            public final String LJJJ() {
                return this.LIZIZ;
            }
        }, new AbstractC514430KFl() { // from class: X.0KFp
            public final String LIZIZ = "item_package_offer_description";

            @Override // X.InterfaceC339570DSx
            public final String LJJJ() {
                return this.LIZIZ;
            }
        }, new AbstractC514430KFl() { // from class: X.0KFq
            public final String LIZIZ = "item_package_renew_describe1";

            @Override // X.InterfaceC339570DSx
            public final String LJJJ() {
                return this.LIZIZ;
            }
        }, new AbstractC514430KFl() { // from class: X.0KFt
            public final String LIZIZ = "item_package_renew_describe_eu_region_only";

            @Override // X.InterfaceC339570DSx
            public final String LJJJ() {
                return this.LIZIZ;
            }
        }, new AbstractC514430KFl() { // from class: X.0KFs
            public final String LIZIZ = "item_package_renew_describe2";

            @Override // X.InterfaceC339570DSx
            public final String LJJJ() {
                return this.LIZIZ;
            }
        }, new AbstractC514430KFl() { // from class: X.0KFo
            public final String LIZIZ = "item_package_refund_info";

            @Override // X.InterfaceC339570DSx
            public final String LJJJ() {
                return this.LIZIZ;
            }
        }});
    }

    public final C0KC4 hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0KC4.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C0KC4) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final SubPackagePageAssemVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (SubPackagePageAssemVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.pxo);
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((AbstractC21673619ry) this.LLJJIJIIJIL.getValue());
        recyclerView.setItemAnimator(null);
        this.LLJJIJI = recyclerView;
        hp();
        Map mapLJ = C2097608Jq.LJ();
        C339550DSv c339550DSv = (C339550DSv) this.LLJJIJIIJIL.getValue();
        c339550DSv.LL = C2097608Jq.LJIIL(this.LLJJJ, mapLJ);
        c339550DSv.LLLFZ();
        c339550DSv.notifyDataSetChanged();
        List<AbstractC514430KFl> list = this.LLJJJIL;
        Object value = this.LLJJIJIIJIL.getValue();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        value.getClass();
        ArrayList<InterfaceC339570DSx> arrayList = (ArrayList) list;
        for (InterfaceC339570DSx interfaceC339570DSx : arrayList) {
            if (interfaceC339570DSx instanceof AbstractC514430KFl) {
                ((AbstractC514430KFl) interfaceC339570DSx).LIZ = interfaceC665370Q7zLJIIL;
            }
        }
        ((C339550DSv) this.LLJJIJIIJIL.getValue()).LLLI(arrayList, new AwS586S0100000_7(this, 425));
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0KF1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C513800KDa) obj).LLILLJJLI;
            }
        }, null, new AwS621S0100000_7(this, 91), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0KF6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C513800KDa) obj).LLILZIL;
            }
        }, null, new AwS621S0100000_7(this, 92), 6);
    }
}
