package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem;

import X.AbstractC515480KJm;
import X.C019F;
import X.C0K06;
import X.C0K07;
import X.C0K0B;
import X.C0KBE;
import X.C0KBK;
import X.C0KG8;
import X.C0KG9;
import X.C0KHB;
import X.C0KHD;
import X.C0KHF;
import X.C0KHG;
import X.C0KHL;
import X.C0KJ0;
import X.C0KJA;
import X.C0KKB;
import X.C13LE;
import X.C13LQ;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C513170KAp;
import X.C513700KCq;
import X.C514670KGj;
import X.C514760KGs;
import X.C514820KGy;
import X.C515470KJl;
import X.C515490KJn;
import X.C515500KJo;
import X.C515510KJp;
import X.C515520KJq;
import X.C515530KJr;
import X.C515540KJs;
import X.C515550KJt;
import X.C515560KJu;
import X.C515570KJv;
import X.C515580KJw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC515600KJy;
import X.InterfaceC665370Q7z;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import com.bytedance.android.livesdk.livesetting.subscription.SubEuRegionSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class ScrollablePackageContentAssem extends UISlotAssem implements C0KKB {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJJI;
    public C513700KCq LLJJIII;
    public C0KJA LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final Map<Class<? extends InterfaceC515600KJy>, C0K06<? extends InterfaceC515600KJy, ? extends C0K07<? extends InterfaceC515600KJy>>> LLJJIJIL;
    public final List<AbstractC515480KJm> LLJJJ;
    public Boolean LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ScrollablePackageContentAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/foundation/packagepage/viewmodel/SubPackagePageAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gbv;
    }

    public ScrollablePackageContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubPackagePageAssemVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C0KHL(c19719912DlLIZ), new C0KJ0(), null, true);
        this.LLJJIJIIJIL = SubEuRegionSetting.INSTANCE.isEuRegion();
        this.LLJJIJIL = C2097608Jq.LJIIIIZZ(new Pair(C515500KJo.class, new C0K06<C515500KJo, C0KBE>() { // from class: X.0KBF
            @Override // X.C0K06
            public final int LJIIIZ() {
                return R.layout.gbh;
            }

            @Override // X.C0K06
            public final C0K07 LJIIIIZZ(View view) {
                return new C0KBE(view);
            }

            @Override // X.C0K06, X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C0KBE(C786410Ut5.Td(layoutInflater, R.layout.gbh, viewGroup, false));
            }

            @Override // X.C0K06
            public final C0K07 LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C0KBE(C786410Ut5.Td(layoutInflater, R.layout.gbh, viewGroup, false));
            }
        }), new Pair(C515570KJv.class, new C0K06<C515570KJv, C514670KGj>() { // from class: X.0KH4
            @Override // X.C0K06
            public final int LJIIIZ() {
                return R.layout.gbp;
            }

            @Override // X.C0K06
            public final C0K07 LJIIIIZZ(View view) {
                return new C514670KGj(view);
            }

            @Override // X.C0K06, X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C514670KGj(C786410Ut5.Td(layoutInflater, R.layout.gbp, viewGroup, false));
            }

            @Override // X.C0K06
            public final C0K07 LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C514670KGj(C786410Ut5.Td(layoutInflater, R.layout.gbp, viewGroup, false));
            }
        }), new Pair(C515520KJq.class, new C0K06<C515520KJq, C0KHF>() { // from class: X.0KHE
            @Override // X.C0K06
            public final int LJIIIZ() {
                return R.layout.gbn;
            }

            @Override // X.C0K06
            public final C0K07 LJIIIIZZ(View view) {
                return new C0KHF(view);
            }

            @Override // X.C0K06, X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C0KHF(C786410Ut5.Td(layoutInflater, R.layout.gbn, viewGroup, false));
            }

            @Override // X.C0K06
            public final C0K07 LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C0KHF(C786410Ut5.Td(layoutInflater, R.layout.gbn, viewGroup, false));
            }
        }), new Pair(C515530KJr.class, new C0K06<C515530KJr, C0KHG>() { // from class: X.0KHI
            @Override // X.C0K06
            public final int LJIIIZ() {
                return R.layout.gbs;
            }

            @Override // X.C0K06
            public final C0K07 LJIIIIZZ(View view) {
                return new C0KHG(view);
            }

            @Override // X.C0K06, X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C0KHG(C786410Ut5.Td(layoutInflater, R.layout.gbs, viewGroup, false));
            }

            @Override // X.C0K06
            public final C0K07 LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C0KHG(C786410Ut5.Td(layoutInflater, R.layout.gbs, viewGroup, false));
            }
        }), new Pair(C515560KJu.class, new C0K06<C515560KJu, C514760KGs>() { // from class: X.0KH3
            @Override // X.C0K06
            public final int LJIIIZ() {
                return R.layout.gbt;
            }

            @Override // X.C0K06
            public final C0K07 LJIIIIZZ(View view) {
                return new C514760KGs(view);
            }

            @Override // X.C0K06, X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C514760KGs(C786410Ut5.Td(layoutInflater, R.layout.gbt, viewGroup, false));
            }

            @Override // X.C0K06
            public final C0K07 LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C514760KGs(C786410Ut5.Td(layoutInflater, R.layout.gbt, viewGroup, false));
            }
        }), new Pair(C515550KJt.class, new C0K06<C515550KJt, C514820KGy>() { // from class: X.0KH2
            @Override // X.C0K06
            public final int LJIIIZ() {
                return R.layout.gbj;
            }

            @Override // X.C0K06
            public final C0K07 LJIIIIZZ(View view) {
                return new C514820KGy(view);
            }

            @Override // X.C0K06, X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C514820KGy(C786410Ut5.Td(layoutInflater, R.layout.gbj, viewGroup, false));
            }

            @Override // X.C0K06
            public final C0K07 LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C514820KGy(C786410Ut5.Td(layoutInflater, R.layout.gbj, viewGroup, false));
            }
        }), new Pair(C515490KJn.class, new C0K06<C515490KJn, C0KHB>() { // from class: X.0KHA
            @Override // X.C0K06
            public final int LJIIIZ() {
                return R.layout.gbr;
            }

            @Override // X.C0K06
            public final C0K07 LJIIIIZZ(View view) {
                return new C0KHB(view);
            }

            @Override // X.C0K06, X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C0KHB(C786410Ut5.Td(layoutInflater, R.layout.gbr, viewGroup, false));
            }

            @Override // X.C0K06
            public final C0K07 LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C0KHB(C786410Ut5.Td(layoutInflater, R.layout.gbr, viewGroup, false));
            }
        }), new Pair(C515510KJp.class, new C0K06<C515510KJp, C0KHD>() { // from class: X.0KHC
            @Override // X.C0K06
            public final int LJIIIZ() {
                return R.layout.gbi;
            }

            @Override // X.C0K06
            public final C0K07 LJIIIIZZ(View view) {
                return new C0KHD(view);
            }

            @Override // X.C0K06, X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C0KHD(C786410Ut5.Td(layoutInflater, R.layout.gbi, viewGroup, false));
            }

            @Override // X.C0K06
            public final C0K07 LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C0KHD(C786410Ut5.Td(layoutInflater, R.layout.gbi, viewGroup, false));
            }
        }), new Pair(C515580KJw.class, new C0K06<C515580KJw, C0K0B>() { // from class: X.0K0D
            @Override // X.C0K06
            public final int LJIIIZ() {
                return R.layout.gbq;
            }

            @Override // X.C0K06
            public final C0K07 LJIIIIZZ(View view) {
                return new C0K0B(view);
            }

            @Override // X.C0K06, X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C0K0B(C786410Ut5.Td(layoutInflater, R.layout.gbq, viewGroup, false));
            }

            @Override // X.C0K06
            public final C0K07 LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C0K0B(C786410Ut5.Td(layoutInflater, R.layout.gbq, viewGroup, false));
            }
        }), new Pair(C515470KJl.class, new C0K06<C515470KJl, C513170KAp>() { // from class: X.0KAq
            @Override // X.C0K06
            public final int LJIIIZ() {
                return R.layout.gbg;
            }

            @Override // X.C0K06
            public final C0K07 LJIIIIZZ(View view) {
                return new C513170KAp(view);
            }

            @Override // X.C0K06, X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C513170KAp(C786410Ut5.Td(layoutInflater, R.layout.gbg, viewGroup, false));
            }

            @Override // X.C0K06
            public final C0K07 LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C513170KAp(C786410Ut5.Td(layoutInflater, R.layout.gbg, viewGroup, false));
            }
        }), new Pair(C515540KJs.class, new C0K06<C515540KJs, C0KBK>() { // from class: X.0KBM
            @Override // X.C0K06
            public final int LJIIIZ() {
                return R.layout.gbo;
            }

            @Override // X.C0K06
            public final C0K07 LJIIIIZZ(View view) {
                return new C0KBK(view);
            }

            @Override // X.C0K06, X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C0KBK(C786410Ut5.Td(layoutInflater, R.layout.gbo, viewGroup, false));
            }

            @Override // X.C0K06
            public final C0K07 LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                LayoutInflater layoutInflaterLJI = C520010KaN.LJI(viewGroup.getContext());
                if (layoutInflaterLJI != null) {
                    layoutInflater = layoutInflaterLJI;
                }
                return new C0KBK(C786410Ut5.Td(layoutInflater, R.layout.gbo, viewGroup, false));
            }
        }));
        this.LLJJJ = C13LQ.LJIJI(new AbstractC515480KJm[]{new AbstractC515480KJm() { // from class: X.0KJo
            public final String LLILLJJLI = "item_package_migration_alert";

            @Override // X.InterfaceC515600KJy
            public final String LJJJ() {
                return this.LLILLJJLI;
            }
        }, new AbstractC515480KJm() { // from class: X.0KJn
            public final String LLILLJJLI = "item_package_refund_alert";

            @Override // X.InterfaceC515600KJy
            public final String LJJJ() {
                return this.LLILLJJLI;
            }
        }, new AbstractC515480KJm() { // from class: X.0KJl
            public final String LLILLJJLI = "item_package_anchor_profile";

            @Override // X.InterfaceC515600KJy
            public final String LJJJ() {
                return this.LLILLJJLI;
            }
        }, new AbstractC515480KJm() { // from class: X.0KJw
            public final String LLILLJJLI = "item_package_sub_plans_selection_tab";

            @Override // X.InterfaceC515600KJy
            public final String LJJJ() {
                return this.LLILLJJLI;
            }
        }, new AbstractC515480KJm() { // from class: X.0KJs
            public final String LLILLJJLI = "item_package_perk_info";

            @Override // X.InterfaceC515600KJy
            public final String LJJJ() {
                return this.LLILLJJLI;
            }
        }, new AbstractC515480KJm() { // from class: X.0KJv
            public final String LLILLJJLI = "item_package_sub_plans";

            @Override // X.InterfaceC515600KJy
            public final String LJJJ() {
                return this.LLILLJJLI;
            }
        }, new AbstractC515480KJm() { // from class: X.0KJq
            public final String LLILLJJLI = "item_package_offer_description";

            @Override // X.InterfaceC515600KJy
            public final String LJJJ() {
                return this.LLILLJJLI;
            }
        }, new AbstractC515480KJm() { // from class: X.0KJr
            public final String LLILLJJLI = "item_package_renew_describe1";

            @Override // X.InterfaceC515600KJy
            public final String LJJJ() {
                return this.LLILLJJLI;
            }
        }, new AbstractC515480KJm() { // from class: X.0KJu
            public final String LLILLJJLI = "item_package_renew_describe_eu_region_only";

            @Override // X.InterfaceC515600KJy
            public final String LJJJ() {
                return this.LLILLJJLI;
            }
        }, new AbstractC515480KJm() { // from class: X.0KJt
            public final String LLILLJJLI = "item_package_renew_describe2";

            @Override // X.InterfaceC515600KJy
            public final String LJJJ() {
                return this.LLILLJJLI;
            }
        }, new AbstractC515480KJm() { // from class: X.0KJp
            public final String LLILLJJLI = "item_package_refund_info";

            @Override // X.InterfaceC515600KJy
            public final String LJJJ() {
                return this.LLILLJJLI;
            }
        }});
    }

    public final C513700KCq hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C513700KCq.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C513700KCq) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final SubPackagePageAssemVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (SubPackagePageAssemVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C0KJA c0kja = (C0KJA) view.findViewById(R.id.pxo);
        this.LLJJIJI = c0kja;
        if (c0kja != null) {
            c0kja.setFlashListComponentId("list_view_package_page");
        }
        C0KJA c0kja2 = this.LLJJIJI;
        if (c0kja2 != null) {
            c0kja2.setBodyListOverScrollMode(2);
        }
        hp();
        C0KJA c0kja3 = this.LLJJIJI;
        if (c0kja3 != null) {
            hp();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            c0kja3.LIZLLL(C2097608Jq.LJIIL(this.LLJJIJIL, C2097608Jq.LJ()));
            ArrayList<InterfaceC515600KJy> arrayList = (ArrayList) this.LLJJJ;
            for (InterfaceC515600KJy interfaceC515600KJy : arrayList) {
                if (interfaceC515600KJy instanceof AbstractC515480KJm) {
                    ((AbstractC515480KJm) interfaceC515600KJy).LL = interfaceC665370Q7zLJIIL;
                }
            }
            C0KJA.LIZIZ(c0kja3, arrayList, null, new AwS586S0100000_7(new AwS586S0100000_7((C0KKB) this, 4), 3), 6);
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0KIC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KGF) obj).LLILLJJLI;
            }
        }, null, new C0KG8(this), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0KIH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KGF) obj).LLILZIL;
            }
        }, null, new C0KG9(this), 6);
    }
}
