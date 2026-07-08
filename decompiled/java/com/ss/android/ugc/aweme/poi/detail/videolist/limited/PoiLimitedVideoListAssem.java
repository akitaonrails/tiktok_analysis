package com.ss.android.ugc.aweme.poi.detail.videolist.limited;

import X.AbstractC738140SxQ;
import X.C1173300gdc;
import X.C1174830gg5;
import X.C1174850gg7;
import X.C1185600gxS;
import X.C1186720gzG;
import X.C1187600h0g;
import X.C1220000hqw;
import X.C13LE;
import X.C13LP;
import X.C1723500ux2;
import X.C19252910Tv;
import X.C19M4;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C339190DRl;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C425600GmU;
import X.C427690Gpr;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1181010gq3;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.videolist.WrapStaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.poi.detail.videolist.model.PoiDetailVideoListModel;
import com.ss.android.ugc.aweme.poi.experiment.PoiDetailYmalV2Exp;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiLimitedVideoListAssem extends PoiDetailBaseAssem<PoiListApi.PoiMergedListResponse> {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJL;
    public View LLJL;
    public C19M4 LLJLIL;
    public List<C1187600h0g> LLJLILLLLZIIL;
    public final int LLJLLIL;
    public final C736950SvV LLJJLIIIJLLLLLLLZ = new C736950SvV(C13LE.LIZ(PoiLimitedVideoListVM.class), new AwS562S0100000_18(this, 2712), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(433), new AwS562S0100000_18((AbstractC738140SxQ) this, 1226), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final int LLJLL = 4;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e41;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return true;
    }

    public final int Ep() {
        C20600815jK<InterfaceC1891350zJl> state;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJL;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (state = viewOnAttachStateChangeListenerC20604515jv.getState()) == null) {
            return -1;
        }
        return state.LJIIIIZZ();
    }

    public final PoiLimitedVideoListVM Fp() {
        return (PoiLimitedVideoListVM) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final int Gp() {
        PoiListApi.PoiMergedListResponse poiMergedListResponse;
        Integer hasMoreAweme;
        List<C1187600h0g> list = this.LLJLILLLLZIIL;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        return (size < 2 || (poiMergedListResponse = (PoiListApi.PoiMergedListResponse) C1174850gg7.LIZJ(this)) == null || (hasMoreAweme = poiMergedListResponse.getHasMoreAweme()) == null || hasMoreAweme.intValue() != 1 || size % 2 == 0) ? size : size - 1;
    }

    public PoiLimitedVideoListAssem() {
        Integer num;
        PoiDetailYmalV2Exp.Config config = (PoiDetailYmalV2Exp.Config) PoiDetailYmalV2Exp.LIZ.getValue();
        this.LLJLLIL = ((config == null || (num = config.postMaxCount) == null) ? 12 : num.intValue()) - 1;
    }

    public final void Ip() {
        PoiListApi.PoiMergedListResponse poiMergedListResponse;
        Integer hasMoreAweme;
        if (Ep() >= Gp() && ((poiMergedListResponse = (PoiListApi.PoiMergedListResponse) C1174850gg7.LIZJ(this)) == null || (hasMoreAweme = poiMergedListResponse.getHasMoreAweme()) == null || hasMoreAweme.intValue() != 1)) {
            View view = this.LLJL;
            if (view != null) {
                C339190DRl.LIZIZ(view);
                return;
            }
            return;
        }
        if (Ep() < this.LLJLLIL && Ep() < Gp()) {
            View view2 = this.LLJL;
            if (view2 != null) {
                C339190DRl.LIZLLL(view2);
            }
            C19M4 c19m4 = this.LLJLIL;
            if (c19m4 != null) {
                Context context = getContext();
                c19m4.setText(context != null ? context.getString(2131844776) : null);
            }
            View view3 = this.LLJL;
            if (view3 != null) {
                C786410Ut5.I7(new AbS699S0100000_18(this, 21, 42), view3);
            }
            C19M4 c19m42 = this.LLJLIL;
            if (c19m42 != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_chevron_down_thin;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
                c19m42.setEndIcon(c419910GdJ);
                return;
            }
            return;
        }
        View view4 = this.LLJL;
        if (view4 != null) {
            C339190DRl.LIZLLL(view4);
        }
        C19M4 c19m43 = this.LLJLIL;
        if (c19m43 != null) {
            Context context2 = getContext();
            c19m43.setText(context2 != null ? context2.getString(2131844775) : null);
        }
        View view5 = this.LLJL;
        if (view5 != null) {
            C786410Ut5.I7(new AbS699S0100000_18(this, 20, 42), view5);
        }
        C19M4 c19m44 = this.LLJLIL;
        if (c19m44 != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_chevron_right_thin_ltr;
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ2.LJ = Integer.valueOf(R.attr.a1j);
            c19m44.setEndIcon(c419910GdJ2);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173990gej
    public final void fm1() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        super.fm1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onComponentExposure powerList?.height: ");
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJL;
        sbLIZ.append(viewOnAttachStateChangeListenerC20604515jv2 != null ? Integer.valueOf(viewOnAttachStateChangeListenerC20604515jv2.getHeight()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJL;
        if ((viewOnAttachStateChangeListenerC20604515jv3 == null || viewOnAttachStateChangeListenerC20604515jv3.getHeight() <= 0) && (viewOnAttachStateChangeListenerC20604515jv = this.LLJJL) != null) {
            viewOnAttachStateChangeListenerC20604515jv.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        String str;
        String typeLevel;
        C1185600gxS c1185600gxS;
        PoiListApi.PoiMergedListResponse poiMergedListResponse = (PoiListApi.PoiMergedListResponse) baseComponentData;
        super.CG1(poiMergedListResponse);
        PoiLimitedVideoListVM poiLimitedVideoListVMFp = Fp();
        poiLimitedVideoListVMFp.getClass();
        PoiDetailVideoListModel poiDetailVideoListModelLIZ = C1186720gzG.LIZ(poiMergedListResponse, poiLimitedVideoListVMFp.LLJJ, false, false);
        PoiLimitedVideoListVM poiLimitedVideoListVMFp2 = Fp();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJI);
        } else {
            interfaceC1181010gq3LIZ = null;
        }
        poiLimitedVideoListVMFp2.LLJILJILJ = interfaceC1181010gq3LIZ;
        PoiLimitedVideoListVM poiLimitedVideoListVMFp3 = Fp();
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
        if (c1173300gdcLJ != null && (c1185600gxS = (C1185600gxS) c1173300gdcLJ.LIZ) != null) {
            str = c1185600gxS.LIZ;
        } else {
            str = null;
        }
        poiLimitedVideoListVMFp3.LLJ = str;
        Fp().LLILZLL = poiMergedListResponse;
        Fp().LLIZ = poiDetailVideoListModelLIZ;
        Fp().LLJIJIL = C1174850gg7.LIZLLL(this);
        PoiLimitedVideoListVM poiLimitedVideoListVMFp4 = Fp();
        PoiListApi.PoiDetailResponse poiDetailResponseLp = lp();
        if (poiDetailResponseLp != null) {
            typeLevel = poiDetailResponseLp.getTypeLevel();
        } else {
            typeLevel = null;
        }
        poiLimitedVideoListVMFp4.LLJILJIL = typeLevel;
        AssemSingleListViewModel.manualListLoadMore$default(Fp(), null, 1, null);
        List<C1187600h0g> listBQ2 = Fp().BQ2(poiDetailVideoListModelLIZ);
        this.LLJLILLLLZIIL = listBQ2;
        if (listBQ2 != null) {
            Jp(listBQ2);
        }
        Ip();
    }

    public final void Jp(List<? extends InterfaceC1891350zJl> list) {
        C20600815jK<InterfaceC1891350zJl> state;
        PoiListApi.PoiMergedListResponse poiMergedListResponse;
        Integer hasMoreAweme;
        C20600815jK<InterfaceC1891350zJl> state2;
        if (Ep() < this.LLJLLIL && Ep() < Gp()) {
            if (Ep() <= 0) {
                int i = this.LLJLL;
                int iGp = Gp();
                if (i > iGp) {
                    i = iGp;
                }
                List listLL = C13LP.LL(list, i);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setupVideoList set items:");
                sbLIZ.append(listLL.size());
                C2188811AlT.LIZIZ(sbLIZ);
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJL;
                if (viewOnAttachStateChangeListenerC20604515jv != null && (state2 = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                    state2.LJIILL(listLL, null);
                }
            } else {
                int iEp = Ep();
                int iEp2 = Ep() + this.LLJLL;
                int iGp2 = Gp();
                if (iEp2 > iGp2) {
                    iEp2 = iGp2;
                }
                if (iEp2 >= 2 && (poiMergedListResponse = (PoiListApi.PoiMergedListResponse) C1174850gg7.LIZJ(this)) != null && (hasMoreAweme = poiMergedListResponse.getHasMoreAweme()) != null && hasMoreAweme.intValue() == 1 && iEp2 % 2 != 0) {
                    iEp2--;
                }
                List<? extends InterfaceC1891350zJl> listSubList = list.subList(iEp, iEp2);
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJL;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                    state.LIZLLL(listSubList, null);
                }
            }
            Ip();
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C2211631BhB.LJ(view, new AwS384S0200000_18(view, this, 268));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        this.LLJJL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.LJIJ(new C1723500ux2(50002, PoiLimitedVideoListCell.class));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            getContext();
            viewOnAttachStateChangeListenerC20604515jv3.addItemDecoration(new C425600GmU());
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJJL;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            viewOnAttachStateChangeListenerC20604515jv4.setLayoutManager(new WrapStaggeredGridLayoutManager(C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ(2, 0)));
        }
        AssemViewModel.asyncSubscribe$default(Fp(), new C2217381BqS() { // from class: X.0h0Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1187520h0Y c1187520h0Y = (C1187520h0Y) obj;
                c1187520h0Y.getClass();
                return C627260Oiy.LIZLLL(c1187520h0Y);
            }
        }, this, null, null, null, AFwS256S0000000_18.get$arr$(1006), 28, null);
        View viewFindViewById = view.findViewById(R.id.uj5);
        this.LLJL = viewFindViewById;
        if (viewFindViewById != null) {
            C427690Gpr.LJIIIIZZ(viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.uj6);
        Context context = getContext();
        if (context != null && C960203pA.LIZIZ(context)) {
            if (viewFindViewById2 != null) {
                viewFindViewById2.setBackgroundResource(R.drawable.d8i);
            }
        } else if (viewFindViewById2 != null) {
            viewFindViewById2.setBackgroundResource(R.drawable.d8j);
        }
        this.LLJLIL = (C19M4) view.findViewById(R.id.ujb);
    }
}
