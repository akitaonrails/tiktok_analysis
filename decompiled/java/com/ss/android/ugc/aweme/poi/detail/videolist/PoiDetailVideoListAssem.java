package com.ss.android.ugc.aweme.poi.detail.videolist;

import X.AbstractC329610Cw3;
import X.C019F;
import X.C01GW;
import X.C0DXI;
import X.C0IDM;
import X.C1174850gg7;
import X.C1180920gpu;
import X.C1181550gqv;
import X.C1184440gva;
import X.C1185120gwg;
import X.C1194160hBG;
import X.C1194750hCD;
import X.C1194760hCE;
import X.C1207004ns;
import X.C1208640hYc;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1637806bA;
import X.C1723500ux2;
import X.C1749280vcc;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C20642515q3;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C259800zU;
import X.C418440Gaw;
import X.C425600GmU;
import X.C452501pT;
import X.C497820Jfg;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1181010gq3;
import X.InterfaceC1181670gr7;
import X.InterfaceC1194150hBF;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC487330J9f;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import com.ss.android.ugc.aweme.poi.detail.container.IPoiDetailVisibilityAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailContainerViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.IPoiPostsAutoPlayAbility;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiMergedListItemBannerCell;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiMergedListItemReviewCell;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiVideoListItemCell;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiVideoListItemCellFor2columns;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiVideoListItemVideoCell;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailVideoListAssem extends PoiDetailBaseAssem<PoiListApi.PoiMergedListResponse> implements ContainerEventDispatcher$IPoiDetailVisibilityAbility, InterfaceC487330J9f, IPoiDetailVisibilityAbility, IPoiVideoListAbility, IPoiPostsAutoPlayAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public ViewGroup LLJLIL;
    public C0IDM LLJLILLLLZIIL;
    public C1194750hCD LLJLL;
    public float LLJLLL;
    public C425600GmU LLJZ;
    public C0DXI LLJZIJLIL;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1213));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1214));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 555));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1215));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailVideoListAssem.class, "poiDetailContainerVm", "getPoiDetailContainerVm()Lcom/ss/android/ugc/aweme/poi/detail/container/newarchi/data/PoiDetailContainerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailVideoListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailContainerViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 556), AFwS256S0000000_18.get$arr$(432), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e3p;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1604203620) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return false;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv Ep() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJL.getValue();
    }

    public final C1749280vcc Gp() {
        return (C1749280vcc) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final PoiVideoListSharedViewModel Ip() {
        return (PoiVideoListSharedViewModel) this.LLJLLIL.getValue();
    }

    public final void Up() {
        C786410Ut5.LJLZ(0, (ViewGroup) this.LLJL.getValue());
    }

    public final int Fp() {
        return C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ(Ip().FQ2() ? 2 : 3, 0);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.IPoiPostsAutoPlayAbility
    public final ViewOnAttachStateChangeListenerC20604515jv Hx1() {
        return Ep();
    }

    public final void Qp() {
        C1181550gqv c1181550gqvEr2;
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = BK2();
        if (interfaceC1181010gq3BK2 == null || (c1181550gqvEr2 = interfaceC1181010gq3BK2.Er2()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((LinkedHashMap) c1181550gqvEr2.LIZ).entrySet().iterator();
        while (it2.hasNext()) {
            Object value = ((Map.Entry) it2.next()).getValue();
            if (value instanceof C1185120gwg) {
                arrayList.add(value);
            }
        }
        C1185120gwg c1185120gwg = (C1185120gwg) ((InterfaceC1181670gr7) C13LP.LJJJLL(arrayList));
        if (c1185120gwg != null) {
            C1185120gwg.LIZIZ(c1185120gwg, Ip().LLJ, null, 6);
        }
    }

    public final void Tp() {
        Ip();
        Ep().LJIJ(new C1723500ux2(50001, PoiVideoListItemVideoCell.class));
        Ep().LJIJ(new C1723500ux2(50002, PoiVideoListItemCellFor2columns.class));
        Ep().LJIJ(new C1723500ux2(50003, PoiVideoListItemCell.class));
        Ep().LJIILJJIL(PoiMergedListItemReviewCell.class);
        Ep().LJIILJJIL(PoiMergedListItemBannerCell.class);
        if (Ip().FQ2()) {
            if (Ip().HQ2()) {
                getContext();
                C425600GmU c425600GmU = new C425600GmU();
                C425600GmU c425600GmU2 = this.LLJZ;
                if (c425600GmU2 != null) {
                    Ep().removeItemDecoration(c425600GmU2);
                }
                C0DXI c0dxi = this.LLJZIJLIL;
                if (c0dxi != null) {
                    Ep().removeItemDecoration(c0dxi);
                }
                Ep().addItemDecoration(c425600GmU);
                this.LLJZ = c425600GmU;
            } else {
                getContext();
                C0DXI c0dxi2 = new C0DXI();
                C425600GmU c425600GmU3 = this.LLJZ;
                if (c425600GmU3 != null) {
                    Ep().removeItemDecoration(c425600GmU3);
                }
                C0DXI c0dxi3 = this.LLJZIJLIL;
                if (c0dxi3 != null) {
                    Ep().removeItemDecoration(c0dxi3);
                }
                Ep().addItemDecoration(c0dxi2);
                this.LLJZIJLIL = c0dxi2;
            }
        }
        if (Ip().GQ2()) {
            Ep().setLayoutManager(new WrapStaggeredGridLayoutManager(Fp()));
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvEp = Ep();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(Ep().getContext(), Fp());
        gridLayoutManager.LLIZ = new C1208640hYc(this, gridLayoutManager, 6);
        viewOnAttachStateChangeListenerC20604515jvEp.setLayoutManager(gridLayoutManager);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.videolist.IPoiVideoListAbility
    public final int bW() {
        return Ep().getHeaderCount();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        List<PoiActivityApi.PoiBannerInfo> bannerListInfo;
        String str;
        super.onDestroy();
        PoiListApi.PoiDetailResponse poiDetailResponse = Ip().LLJJI;
        if (poiDetailResponse != null && (bannerListInfo = poiDetailResponse.getBannerListInfo()) != null) {
            Iterator<PoiActivityApi.PoiBannerInfo> it2 = bannerListInfo.iterator();
            while (it2.hasNext()) {
                PoiActivityApi.PoiBannerInfo next = it2.next();
                if (!C13LP.LJJJJ(next != null ? next.activityId : null, Ip().LLJJ)) {
                    if (next == null || (str = next.activityId) == null) {
                        str = "";
                    }
                    C1194160hBG.LJII(str, "poi_detail");
                }
            }
        }
        for (String str2 : (ArrayList) Ip().LLJILLL) {
            if (!((ArrayList) Ip().LLJJ).contains(str2)) {
                C1194160hBG.LJII(str2, "poi_detail");
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.videolist.IPoiVideoListAbility
    public final boolean vS1() {
        return Ip().GQ2();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        PoiListApi.PoiMergedListResponse poiMergedListResponse = (PoiListApi.PoiMergedListResponse) baseComponentData;
        super.CG1(poiMergedListResponse);
        Up();
        Jp(poiMergedListResponse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [T, X.0IDM, android.view.View$OnAttachStateChangeListener] */
    public final void Jp(PoiListApi.PoiMergedListResponse poiMergedListResponse) {
        boolean z;
        ViewGroup viewGroup;
        Context context;
        Integer numLIZJ;
        Context context2;
        Integer numLIZJ2;
        View viewFindViewById;
        Context context3;
        Integer numLIZJ3;
        TuxTextView tuxTextView;
        String strLJI;
        View viewFindViewById2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        final PoiListApi.PoiDetailResponse poiDetailResponseLp = lp();
        PoiListApi.PoiMergedListResponse poiMergedListResponse2 = (PoiListApi.PoiMergedListResponse) C1174850gg7.LIZJ(this);
        if (poiMergedListResponse2 != null && poiMergedListResponse2.hasMergedList$poi_release()) {
            z = true;
        } else {
            z = false;
        }
        Ip().LLJJI = poiDetailResponseLp;
        ViewGroup viewGroup2 = this.LLJLIL;
        if (viewGroup2 != null) {
            C0IDM c0idm = this.LLJLILLLLZIIL;
            if (c0idm != null) {
                viewGroup2.removeOnAttachStateChangeListener(c0idm);
            }
            Ep().LJJ(viewGroup2);
        }
        if (z) {
            if (poiDetailResponseLp != null && (!((ArrayList) C1194160hBG.LJ("poi_detail", poiDetailResponseLp.getBannerListInfo())).isEmpty()) && this.LLJLL == null) {
                final C1194760hCE c1194760hCE = new C1194760hCE(((View) this.LLJL.getValue()).getContext());
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) (((C497820Jfg.LIZIZ(getContentView().getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) * 2)) / 5.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1194760hCE);
                c1194760hCE.setLayoutParams(layoutParams);
                final C259800zU c259800zU = new C259800zU();
                if (Ip().GQ2()) {
                    ?? c0idm2 = new C0IDM(4);
                    c259800zU.element = c0idm2;
                    c1194760hCE.addOnAttachStateChangeListener(c0idm2);
                }
                C1194750hCD c1194750hCD = new C1194750hCD(c1194760hCE, new InterfaceC1194150hBF() { // from class: X.0h1E
                    @Override // X.InterfaceC1194150hBF
                    public final void LIZ(String str) {
                        ((ArrayList) this.LIZ.Ip().LLJJ).add(str);
                    }

                    @Override // X.InterfaceC1194150hBF
                    public final void LIZIZ(String str) {
                        String str2;
                        ArrayList arrayList = new ArrayList();
                        List<PoiActivityApi.PoiBannerInfo> bannerListInfo = poiDetailResponseLp.getBannerListInfo();
                        if (bannerListInfo != null) {
                            for (PoiActivityApi.PoiBannerInfo poiBannerInfo : bannerListInfo) {
                                if (poiBannerInfo != null) {
                                    str2 = poiBannerInfo.activityId;
                                } else {
                                    str2 = null;
                                }
                                if (!Intrinsics.LJFF(str2, str)) {
                                    arrayList.add(poiBannerInfo);
                                }
                            }
                        }
                        if (arrayList.size() != 0 && !((ArrayList) C1194160hBG.LJ("poi_detail", arrayList)).isEmpty()) {
                            C1194750hCD c1194750hCD2 = this.LIZ.LLJLL;
                            if (c1194750hCD2 != null) {
                                c1194750hCD2.LIZ(C1194160hBG.LJ("poi_detail", arrayList));
                                return;
                            }
                            return;
                        }
                        View.OnAttachStateChangeListener onAttachStateChangeListener = c259800zU.element;
                        if (onAttachStateChangeListener != null) {
                            c1194760hCE.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                        }
                        this.LIZ.Ep().LJJ(c1194760hCE);
                        C1194750hCD c1194750hCD3 = this.LIZ.LLJLL;
                        if (c1194750hCD3 == null) {
                            return;
                        }
                        c1194750hCD3.LIZIZ(false);
                    }

                    @Override // X.InterfaceC1194150hBF
                    public final void LIZJ(String str) {
                        ((ArrayList) this.LIZ.Ip().LLJILLL).add(str);
                    }
                }, true, true);
                c1194750hCD.LLJI = Ip().LLJIJIL;
                c1194750hCD.LLJIJIL = poiDetailResponseLp.getCollectInfo();
                c1194750hCD.LIZ(C1194160hBG.LJ("poi_detail", poiDetailResponseLp.getBannerListInfo()));
                this.LLJLL = c1194750hCD;
                Ep().LJ(0, c1194760hCE);
            }
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(Ep().getContext()), R.layout.e0j, Ep(), false);
            if (viewTd instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewTd;
            } else {
                viewGroup = null;
            }
            this.LLJLIL = viewGroup;
            if (Ip().FQ2()) {
                ViewGroup viewGroup3 = this.LLJLIL;
                if (viewGroup3 != null && (viewFindViewById2 = viewGroup3.findViewById(R.id.tv_video_list_title)) != null) {
                    Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    Integer numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    Integer numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    Integer numValueOf4 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        if (numValueOf != null) {
                            marginLayoutParams.setMarginStart(numValueOf.intValue());
                        }
                        if (numValueOf2 != null) {
                            marginLayoutParams.topMargin = numValueOf2.intValue();
                        }
                        if (numValueOf3 != null) {
                            marginLayoutParams.setMarginEnd(numValueOf3.intValue());
                        }
                        if (numValueOf4 != null) {
                            marginLayoutParams.bottomMargin = numValueOf4.intValue();
                        }
                    }
                }
                if (Ip().HQ2()) {
                    C0IDM c0idm3 = new C0IDM(4);
                    this.LLJLILLLLZIIL = c0idm3;
                    ViewGroup viewGroup4 = this.LLJLIL;
                    if (viewGroup4 != null) {
                        viewGroup4.addOnAttachStateChangeListener(c0idm3);
                    }
                }
            }
            Ep().LJ(0, this.LLJLIL);
            ViewGroup viewGroup5 = this.LLJLIL;
            if (viewGroup5 != null && (tuxTextView = (TuxTextView) viewGroup5.findViewById(R.id.tv_video_list_title)) != null) {
                C786410Ut5.B5(tuxTextView, 0.0f);
                if (C1207004ns.LIZ() && !Ip().HQ2()) {
                    C1184440gva c1184440gva = C1207004ns.LIZIZ;
                    tuxTextView.setTuxFont(23);
                    tuxTextView.setTextSize(c1184440gva.LJI);
                    tuxTextView.setMinTextSize(c1184440gva.LJII);
                    tuxTextView.setMaxLines(1);
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
                if (Ip().FQ2()) {
                    if (Ip().HQ2()) {
                        strLJI = C20642515q3.LJI(2131844737);
                    } else {
                        strLJI = C20642515q3.LJI(2131844770);
                    }
                } else {
                    strLJI = C20642515q3.LJI(2131858572);
                }
                tuxTextView.setText(strLJI);
                tuxTextView.animate().alpha(1.0f).setDuration(300L).start();
            }
            if (Ip().FQ2()) {
                ViewGroup viewGroup6 = this.LLJLIL;
                if (viewGroup6 != null && (context3 = viewGroup6.getContext()) != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.zp, context3)) != null) {
                    Ep().setBackgroundColor(numLIZJ3.intValue());
                }
                ViewGroup viewGroup7 = this.LLJLIL;
                if (viewGroup7 != null && (context = viewGroup7.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
                    int iIntValue = numLIZJ.intValue();
                    ViewGroup viewGroup8 = this.LLJLIL;
                    if (viewGroup8 != null && (context2 = viewGroup8.getContext()) != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.zp, context2)) != null) {
                        int iIntValue2 = numLIZJ2.intValue();
                        ViewGroup viewGroup9 = this.LLJLIL;
                        if (viewGroup9 != null && (viewFindViewById = viewGroup9.findViewById(R.id.video_list_title_layout)) != null) {
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                            gradientDrawable.setColors(new int[]{iIntValue, iIntValue2});
                            viewFindViewById.setBackground(gradientDrawable);
                        }
                    }
                }
            }
        }
        Ip().LLJJIII = C1174850gg7.LIZLLL(this);
        if (Ip().LLJILJIL) {
            Tp();
            Ip().LLJILJIL = false;
        }
        Ip().LLJI = poiMergedListResponse;
        Ip().setListState(Ep().getState());
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvEp = Ep();
        final PoiVideoListSharedViewModel poiVideoListSharedViewModelIp = Ip();
        viewOnAttachStateChangeListenerC20604515jvEp.LJIIL((AbstractC329610Cw3) new C2217401BqU(poiVideoListSharedViewModelIp) { // from class: X.0h1Y
            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void Jr2(C1180920gpu c1180920gpu) {
        PoiListApi.PoiMergedListResponse poiMergedListResponse;
        BaseComponentData baseComponentData = c1180920gpu.LIZLLL;
        if (baseComponentData instanceof PoiListApi.PoiMergedListResponse) {
            poiMergedListResponse = (PoiListApi.PoiMergedListResponse) baseComponentData;
        } else {
            poiMergedListResponse = null;
        }
        Jp(poiMergedListResponse);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.videolist.PoiDetailVideoListAssem for r16v6 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.videolist.PoiDetailVideoListAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.videolist.IPoiVideoListAbility
    public final void re2(String str) {
        ((ArrayList) Ip().LLJILLL).add(str);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.videolist.IPoiVideoListAbility
    public final void sd1(String str) {
        ((ArrayList) Ip().LLJJ).add(str);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        GridLayoutManager gridLayoutManager;
        int iFp = 1;
        if (Ep().getLayoutManager() instanceof GridLayoutManager) {
            RecyclerView.LayoutManager layoutManager = Ep().getLayoutManager();
            if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
                if (Fp() > 0) {
                    iFp = Fp();
                }
                gridLayoutManager.LJIJ(iFp);
                return;
            }
            return;
        }
        RecyclerView.LayoutManager layoutManager2 = Ep().getLayoutManager();
        if (!(layoutManager2 instanceof StaggeredGridLayoutManager) || (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager2) == null) {
            return;
        }
        if (Fp() > 0) {
            iFp = Fp();
        }
        staggeredGridLayoutManager.LJJJ(iFp);
    }
}
