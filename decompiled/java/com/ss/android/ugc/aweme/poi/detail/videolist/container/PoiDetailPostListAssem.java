package com.ss.android.ugc.aweme.poi.detail.videolist.container;

import X.AbstractC329610Cw3;
import X.AnonymousClass0161;
import X.C01GW;
import X.C0DXI;
import X.C0IDM;
import X.C1174830gg5;
import X.C1178990gmn;
import X.C1180060goW;
import X.C1180090goZ;
import X.C1188040h1O;
import X.C1188300h1o;
import X.C1194160hBG;
import X.C1194750hCD;
import X.C1194760hCE;
import X.C1208640hYc;
import X.C1278904zT;
import X.C1308910kAL;
import X.C13LP;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1723500ux2;
import X.C19252910Tv;
import X.C20600815jK;
import X.C20603715jn;
import X.C2217401BqU;
import X.C2255108sX;
import X.C259800zU;
import X.C418440Gaw;
import X.C425600GmU;
import X.C452501pT;
import X.C487280J9a;
import X.C497820Jfg;
import X.C724240Sb0;
import X.C814420VxA;
import X.EnumC1411005fg;
import X.InterfaceC1173990gej;
import X.InterfaceC1181010gq3;
import X.InterfaceC1194150hBF;
import X.InterfaceC1554640qYg;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1891350zJl;
import X.InterfaceC21676019sM;
import X.InterfaceC487330J9f;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnAttachStateChangeListenerC786060UsW;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailLoadingFooterCellV2;
import com.ss.android.ugc.aweme.poi.detail.videolist.IPoiVideoListAbility;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel;
import com.ss.android.ugc.aweme.poi.detail.videolist.WrapStaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.poi.detail.videolist.container.PoiDetailPostListAssem;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiDetailPostStatusCell;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiMergedListItemBannerCell;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiMergedListItemReviewCell;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiPostWaterFallItemCell;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiVideoListItemCell;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiVideoListItemCellFor2columns;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiVideoListItemVideoCell;
import com.ss.android.ugc.aweme.slash.data.EventModel;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailPostListAssem extends UIContentAssem implements IPoiVideoListAbility, InterfaceC1554640qYg {
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public String LLJ;
    public C1188040h1O LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1221));
    public float LLJILJIL;
    public C1194750hCD LLJILJILJ;
    public C1194760hCE LLJILLL;

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

    public final PoiVideoListSharedViewModel Ho() {
        return (PoiVideoListSharedViewModel) this.LLJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.videolist.IPoiVideoListAbility
    public final int bW() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            return viewOnAttachStateChangeListenerC20604515jv.getHeaderCount();
        }
        return 0;
    }

    public final int Go() {
        PoiVideoListSharedViewModel poiVideoListSharedViewModelHo = Ho();
        return C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ((poiVideoListSharedViewModelHo == null || !poiVideoListSharedViewModelHo.FQ2()) ? 3 : 2, 0);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        List<String> list;
        List<String> list2;
        PoiListApi.PoiDetailResponse poiDetailResponse;
        List<PoiActivityApi.PoiBannerInfo> bannerListInfo;
        String str;
        List<String> list3;
        super.onDestroy();
        PoiVideoListSharedViewModel poiVideoListSharedViewModelHo = Ho();
        if (poiVideoListSharedViewModelHo != null && (poiDetailResponse = poiVideoListSharedViewModelHo.LLJJI) != null && (bannerListInfo = poiDetailResponse.getBannerListInfo()) != null) {
            Iterator<PoiActivityApi.PoiBannerInfo> it2 = bannerListInfo.iterator();
            while (it2.hasNext()) {
                PoiActivityApi.PoiBannerInfo next = it2.next();
                PoiVideoListSharedViewModel poiVideoListSharedViewModelHo2 = Ho();
                if (poiVideoListSharedViewModelHo2 != null && (list3 = poiVideoListSharedViewModelHo2.LLJJ) != null) {
                    if (C13LP.LJJJJ(next != null ? next.activityId : null, list3)) {
                    }
                }
                if (next == null || (str = next.activityId) == null) {
                    str = "";
                }
                C1194160hBG.LJII(str, "poi_detail");
            }
        }
        PoiVideoListSharedViewModel poiVideoListSharedViewModelHo3 = Ho();
        if (poiVideoListSharedViewModelHo3 == null || (list = poiVideoListSharedViewModelHo3.LLJILLL) == null) {
            return;
        }
        for (String str2 : (ArrayList) list) {
            PoiVideoListSharedViewModel poiVideoListSharedViewModelHo4 = Ho();
            if (poiVideoListSharedViewModelHo4 == null || (list2 = poiVideoListSharedViewModelHo4.LLJJ) == null || !((ArrayList) list2).contains(str2)) {
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
        PoiVideoListSharedViewModel poiVideoListSharedViewModelHo = Ho();
        return poiVideoListSharedViewModelHo != null && poiVideoListSharedViewModelHo.GQ2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, X.0IDM, android.view.View$OnAttachStateChangeListener] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void Jo(String str) {
        final PoiListApi.PoiDetailResponse poiDetailResponse;
        int headerCount;
        List<PoiActivityApi.PoiBannerInfo> bannerListInfo;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        String str2;
        String collectInfo;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        Context context = getContext();
        if (context == null || !Intrinsics.LJFF(this.LLJ, str)) {
            return;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        List<PoiActivityApi.PoiBannerInfo> bannerListInfo2 = null;
        if (fragmentLJI != null && (interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJI)) != null) {
            poiDetailResponse = (PoiListApi.PoiDetailResponse) interfaceC1181010gq3LIZ.ta2(new C1180090goZ("poi_head_info"));
        } else {
            poiDetailResponse = null;
        }
        if (!(poiDetailResponse instanceof PoiListApi.PoiDetailResponse)) {
            poiDetailResponse = null;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            headerCount = viewOnAttachStateChangeListenerC20604515jv2.getHeaderCount();
        } else {
            headerCount = 0;
        }
        if (poiDetailResponse != null) {
            bannerListInfo = poiDetailResponse.getBannerListInfo();
        } else {
            bannerListInfo = null;
        }
        if ((!((ArrayList) C1194160hBG.LJ("poi_detail", bannerListInfo)).isEmpty()) && this.LLJILJILJ == null && this.LLJILLL == null) {
            this.LLJILLL = new C1194760hCE(context);
            final C1194760hCE c1194760hCE = this.LLJILLL;
            if (c1194760hCE == 0) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) (((C497820Jfg.LIZIZ(c1194760hCE.getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) * 2)) / 5.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1194760hCE);
            c1194760hCE.setLayoutParams(layoutParams);
            final C259800zU c259800zU = new C259800zU();
            PoiVideoListSharedViewModel poiVideoListSharedViewModelHo = Ho();
            if (poiVideoListSharedViewModelHo != null && poiVideoListSharedViewModelHo.IQ2()) {
                ?? c0idm = new C0IDM(5);
                c259800zU.element = c0idm;
                c1194760hCE.addOnAttachStateChangeListener(c0idm);
            }
            C1194750hCD c1194750hCD = new C1194750hCD(c1194760hCE, new InterfaceC1194150hBF() { // from class: X.0h1D
                @Override // X.InterfaceC1194150hBF
                public final void LIZ(String str3) {
                    List<String> list;
                    PoiVideoListSharedViewModel poiVideoListSharedViewModelHo2 = this.LIZ.Ho();
                    if (poiVideoListSharedViewModelHo2 != null && (list = poiVideoListSharedViewModelHo2.LLJJ) != null) {
                        ((ArrayList) list).add(str3);
                    }
                }

                @Override // X.InterfaceC1194150hBF
                public final void LIZIZ(String str3) {
                    List<PoiActivityApi.PoiBannerInfo> bannerListInfo3;
                    String str4;
                    ArrayList arrayList = new ArrayList();
                    PoiListApi.PoiDetailResponse poiDetailResponse2 = poiDetailResponse;
                    if (poiDetailResponse2 != null && (bannerListInfo3 = poiDetailResponse2.getBannerListInfo()) != null) {
                        for (PoiActivityApi.PoiBannerInfo poiBannerInfo : bannerListInfo3) {
                            if (poiBannerInfo != null) {
                                str4 = poiBannerInfo.activityId;
                            } else {
                                str4 = null;
                            }
                            if (!Intrinsics.LJFF(str4, str3)) {
                                arrayList.add(poiBannerInfo);
                            }
                        }
                    }
                    if (arrayList.size() != 0 && !((ArrayList) C1194160hBG.LJ("poi_detail", arrayList)).isEmpty()) {
                        C1194750hCD c1194750hCD2 = this.LIZ.LLJILJILJ;
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
                    PoiDetailPostListAssem poiDetailPostListAssem = this.LIZ;
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = poiDetailPostListAssem.LLIZLLLIL;
                    if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                        viewOnAttachStateChangeListenerC20604515jv3.LJJ(poiDetailPostListAssem.LLJILLL);
                    }
                    C1194750hCD c1194750hCD3 = this.LIZ.LLJILJILJ;
                    if (c1194750hCD3 == null) {
                        return;
                    }
                    c1194750hCD3.LIZIZ(false);
                }

                @Override // X.InterfaceC1194150hBF
                public final void LIZJ(String str3) {
                    List<String> list;
                    PoiVideoListSharedViewModel poiVideoListSharedViewModelHo2 = this.LIZ.Ho();
                    if (poiVideoListSharedViewModelHo2 != null && (list = poiVideoListSharedViewModelHo2.LLJILLL) != null) {
                        ((ArrayList) list).add(str3);
                    }
                }
            }, true, true);
            PoiVideoListSharedViewModel poiVideoListSharedViewModelHo2 = Ho();
            if (poiVideoListSharedViewModelHo2 != null) {
                str2 = poiVideoListSharedViewModelHo2.LLJIJIL;
            } else {
                str2 = null;
            }
            c1194750hCD.LLJI = str2;
            if (poiDetailResponse != null) {
                collectInfo = poiDetailResponse.getCollectInfo();
            } else {
                collectInfo = null;
            }
            c1194750hCD.LLJIJIL = collectInfo;
            if (poiDetailResponse != null) {
                bannerListInfo2 = poiDetailResponse.getBannerListInfo();
            }
            c1194750hCD.LIZ(C1194160hBG.LJ("poi_detail", bannerListInfo2));
            this.LLJILJILJ = c1194750hCD;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                viewOnAttachStateChangeListenerC20604515jv3.LJ(headerCount, this.LLJILLL);
                return;
            }
            return;
        }
        C1194760hCE c1194760hCE2 = this.LLJILLL;
        if (c1194760hCE2 != null && this.LLJILJILJ != null && (viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL) != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJ(headerCount, c1194760hCE2);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        PoiVideoListSharedViewModel poiVideoListSharedViewModelHo;
        int iHashCode;
        PoiVideoListSharedViewModel poiVideoListSharedViewModelHo2;
        PoiVideoListSharedViewModel poiVideoListSharedViewModelHo3;
        Context context;
        Integer numLIZJ;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.r7k);
        this.LLIZLLLIL = viewOnAttachStateChangeListenerC20604515jv;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = null;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZJ = true;
            c20603715jn.LIZLLL = PoiDetailLoadingFooterCellV2.class;
            viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
            PoiVideoListSharedViewModel poiVideoListSharedViewModelHo4 = Ho();
            if (poiVideoListSharedViewModelHo4 != null && poiVideoListSharedViewModelHo4.FQ2() && (poiVideoListSharedViewModelHo3 = Ho()) != null && (!poiVideoListSharedViewModelHo3.IQ2()) && (context = getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
                int iIntValue = numLIZJ.intValue();
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLIZLLLIL;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                    viewOnAttachStateChangeListenerC20604515jv2.setBackgroundColor(iIntValue);
                }
            }
            ((PerfMonitorService) ServiceManager.get().getService(PerfMonitorService.class)).LJ(viewOnAttachStateChangeListenerC20604515jv, "poi_detail");
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                viewOnAttachStateChangeListenerC20604515jv3.LJIJ(new C1723500ux2(50001, PoiVideoListItemVideoCell.class));
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
                viewOnAttachStateChangeListenerC20604515jv4.LJIJ(new C1723500ux2(50002, PoiVideoListItemCellFor2columns.class));
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
                viewOnAttachStateChangeListenerC20604515jv5.LJIJ(new C1723500ux2(50003, PoiVideoListItemCell.class));
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv6 != null) {
                viewOnAttachStateChangeListenerC20604515jv6.LJIJ(new C1723500ux2(50004, PoiPostWaterFallItemCell.class));
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv7 = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv7 != null) {
                viewOnAttachStateChangeListenerC20604515jv7.LJIILJJIL(PoiMergedListItemReviewCell.class);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv8 = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv8 != null) {
                viewOnAttachStateChangeListenerC20604515jv8.LJIILJJIL(PoiMergedListItemBannerCell.class);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv9 = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv9 != null) {
                viewOnAttachStateChangeListenerC20604515jv9.LJIILJJIL(PoiDetailPostStatusCell.class);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv10 = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv10 != null) {
                viewOnAttachStateChangeListenerC20604515jv10.LJIILJJIL(CreatePostCellFor2Columns.class);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv11 = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv11 != null) {
                viewOnAttachStateChangeListenerC20604515jv11.LJIILJJIL(CreatePostCellFor3Columns.class);
            }
            PoiVideoListSharedViewModel poiVideoListSharedViewModelHo5 = Ho();
            if ((poiVideoListSharedViewModelHo5 != null && poiVideoListSharedViewModelHo5.IQ2()) || ((poiVideoListSharedViewModelHo = Ho()) != null && poiVideoListSharedViewModelHo.GQ2())) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv12 = this.LLIZLLLIL;
                if (viewOnAttachStateChangeListenerC20604515jv12 != null) {
                    viewOnAttachStateChangeListenerC20604515jv12.setLayoutManager(new WrapStaggeredGridLayoutManager(Go()));
                }
            } else {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv13 = this.LLIZLLLIL;
                if (viewOnAttachStateChangeListenerC20604515jv13 != 0) {
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), Go());
                    gridLayoutManager.LLIZ = new C1208640hYc(this, gridLayoutManager, 7);
                    viewOnAttachStateChangeListenerC20604515jv13.setLayoutManager(gridLayoutManager);
                }
            }
            PoiVideoListSharedViewModel poiVideoListSharedViewModelHo6 = Ho();
            if (poiVideoListSharedViewModelHo6 != null && poiVideoListSharedViewModelHo6.FQ2()) {
                PoiVideoListSharedViewModel poiVideoListSharedViewModelHo7 = Ho();
                if ((poiVideoListSharedViewModelHo7 != null && poiVideoListSharedViewModelHo7.IQ2()) || ((poiVideoListSharedViewModelHo2 = Ho()) != null && poiVideoListSharedViewModelHo2.HQ2())) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv14 = this.LLIZLLLIL;
                    if (viewOnAttachStateChangeListenerC20604515jv14 != null) {
                        C1188300h1o.LIZ(viewOnAttachStateChangeListenerC20604515jv14);
                    }
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv15 = this.LLIZLLLIL;
                    if (viewOnAttachStateChangeListenerC20604515jv15 != null) {
                        getContext();
                        viewOnAttachStateChangeListenerC20604515jv15.addItemDecoration(new C425600GmU());
                    }
                } else {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv16 = this.LLIZLLLIL;
                    if (viewOnAttachStateChangeListenerC20604515jv16 != null) {
                        C1188300h1o.LIZ(viewOnAttachStateChangeListenerC20604515jv16);
                    }
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv17 = this.LLIZLLLIL;
                    if (viewOnAttachStateChangeListenerC20604515jv17 != null) {
                        getContext();
                        viewOnAttachStateChangeListenerC20604515jv17.addItemDecoration(new C0DXI());
                    }
                }
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv18 = this.LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20604515jv18 != null) {
                viewOnAttachStateChangeListenerC20604515jv18.addOnItemTouchListener(new InterfaceC21676019sM() { // from class: X.0gyH
                    @Override // X.InterfaceC21676019sM
                    public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
                    }

                    @Override // X.InterfaceC21676019sM
                    public final void LJIIZILJ(boolean z) {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
                    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
                    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x010f A[PHI: r12
                      0x010f: PHI (r12v1 java.lang.String) = (r12v0 java.lang.String), (r12v9 java.lang.String) binds: [B:53:0x010b, B:35:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x0114 A[PHI: r11 r12
                      0x0114: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v7 java.lang.String) binds: [B:56:0x0110, B:38:0x007b] A[DONT_GENERATE, DONT_INLINE]
                      0x0114: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v8 java.lang.String) binds: [B:56:0x0110, B:38:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:61:0x0119 A[PHI: r10 r11 r12
                      0x0119: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v5 java.lang.String) binds: [B:59:0x0115, B:41:0x0083] A[DONT_GENERATE, DONT_INLINE]
                      0x0119: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v6 java.lang.String) binds: [B:59:0x0115, B:41:0x0083] A[DONT_GENERATE, DONT_INLINE]
                      0x0119: PHI (r12v3 java.lang.String) = (r12v2 java.lang.String), (r12v7 java.lang.String) binds: [B:59:0x0115, B:41:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:64:0x011e A[PHI: r9 r10 r11 r12
                      0x011e: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:62:0x011a, B:44:0x008b] A[DONT_GENERATE, DONT_INLINE]
                      0x011e: PHI (r10v2 java.lang.String) = (r10v1 java.lang.String), (r10v4 java.lang.String) binds: [B:62:0x011a, B:44:0x008b] A[DONT_GENERATE, DONT_INLINE]
                      0x011e: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v5 java.lang.String) binds: [B:62:0x011a, B:44:0x008b] A[DONT_GENERATE, DONT_INLINE]
                      0x011e: PHI (r12v4 java.lang.String) = (r12v3 java.lang.String), (r12v6 java.lang.String) binds: [B:62:0x011a, B:44:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC21676019sM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean LJJIFFI(androidx.recyclerview.widget.RecyclerView r17, android.view.MotionEvent r18) {
                        /*
                            Method dump skipped, instruction units count: 310
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1186110gyH.LJJIFFI(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
                    }
                });
            }
            Context context2 = getContext();
            if (context2 != null) {
                iHashCode = context2.hashCode();
            } else {
                iHashCode = 0;
            }
            C487280J9a.LIZ(iHashCode, new InterfaceC487330J9f() { // from class: X.0h1W
                @Override // X.InterfaceC487330J9f
                public final void onConfigurationChanged(Activity activity, Configuration configuration) {
                    RecyclerView.LayoutManager layoutManager;
                    StaggeredGridLayoutManager staggeredGridLayoutManager;
                    GridLayoutManager gridLayoutManager2;
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv19 = this.LL.LLIZLLLIL;
                    RecyclerView.LayoutManager layoutManager2 = null;
                    if (viewOnAttachStateChangeListenerC20604515jv19 != null) {
                        layoutManager = viewOnAttachStateChangeListenerC20604515jv19.getLayoutManager();
                    } else {
                        layoutManager = null;
                    }
                    int iGo = 1;
                    if (layoutManager instanceof GridLayoutManager) {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv20 = this.LL.LLIZLLLIL;
                        if (viewOnAttachStateChangeListenerC20604515jv20 != null) {
                            layoutManager2 = viewOnAttachStateChangeListenerC20604515jv20.getLayoutManager();
                        }
                        if ((layoutManager2 instanceof GridLayoutManager) && (gridLayoutManager2 = (GridLayoutManager) layoutManager2) != null) {
                            if (this.LL.Go() > 0) {
                                iGo = this.LL.Go();
                            }
                            gridLayoutManager2.LJIJ(iGo);
                            return;
                        }
                        return;
                    }
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv21 = this.LL.LLIZLLLIL;
                    if (viewOnAttachStateChangeListenerC20604515jv21 != null) {
                        layoutManager2 = viewOnAttachStateChangeListenerC20604515jv21.getLayoutManager();
                    }
                    if (!(layoutManager2 instanceof StaggeredGridLayoutManager) || (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager2) == null) {
                        return;
                    }
                    if (this.LL.Go() > 0) {
                        iGo = this.LL.Go();
                    }
                    staggeredGridLayoutManager.LJJJ(iGo);
                }
            });
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            IPoiDetailPostDataChangeAbility iPoiDetailPostDataChangeAbility = new IPoiDetailPostDataChangeAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.videolist.container.PoiDetailPostListAssem$loadAbility$1
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostDataChangeAbility
                public final void V02(PoiListApi.PoiMergedListResponse poiMergedListResponse) {
                    String currentPostTabCode;
                    String currentPostTabCode2;
                    PoiListApi.PoiDetailResponse poiDetailResponse;
                    List<PoiListApi.PostTag> postTagList;
                    InterfaceC665370Q7z interfaceC665370Q7zLJFF2;
                    PageFinder pageFinderVia;
                    ViewGroup viewGroup;
                    LinearLayout linearLayout;
                    LinearLayout linearLayout2;
                    InterfaceC1181010gq3 interfaceC1181010gq3LIZ2;
                    PoiVideoListSharedViewModel poiVideoListSharedViewModelHo8;
                    InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
                    AnonymousClass0161 anonymousClass0161;
                    String str;
                    PoiDetailPostListAssem poiDetailPostListAssem;
                    PoiVideoListSharedViewModel poiVideoListSharedViewModelHo9;
                    Map<String, EventModel> mapHm;
                    InterfaceC1181010gq3 interfaceC1181010gq3LIZ3;
                    PoiDetailPostListAssem poiDetailPostListAssem2 = this.LL;
                    if (poiMergedListResponse != null) {
                        currentPostTabCode = poiMergedListResponse.getCurrentPostTabCode();
                    } else {
                        currentPostTabCode = null;
                    }
                    poiDetailPostListAssem2.LLJ = currentPostTabCode;
                    PoiDetailPostListAssem poiDetailPostListAssem3 = this.LL;
                    if (poiMergedListResponse != null) {
                        currentPostTabCode2 = poiMergedListResponse.getCurrentPostTabCode();
                    } else {
                        currentPostTabCode2 = null;
                    }
                    poiDetailPostListAssem3.Jo(currentPostTabCode2);
                    Fragment fragmentLJI2 = C724240Sb0.LJI(this.LL);
                    if (fragmentLJI2 != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(fragmentLJI2, null), "source_default_key", AnonymousClass0161.class, null)) != null && (anonymousClass0161 = (AnonymousClass0161) interfaceC1555100qZQLIZIZ.getSource()) != null && (str = anonymousClass0161.LL) != null && (poiVideoListSharedViewModelHo9 = (poiDetailPostListAssem = this.LL).Ho()) != null) {
                        Fragment fragmentLJI3 = C724240Sb0.LJI(poiDetailPostListAssem);
                        if (fragmentLJI3 != null && (interfaceC1181010gq3LIZ3 = C1174830gg5.LIZ(fragmentLJI3)) != null) {
                            mapHm = interfaceC1181010gq3LIZ3.Hm(str);
                        } else {
                            mapHm = null;
                        }
                        poiVideoListSharedViewModelHo9.LLJJIII = mapHm;
                    }
                    PoiVideoListSharedViewModel poiVideoListSharedViewModelHo10 = this.LL.Ho();
                    if (poiVideoListSharedViewModelHo10 != null) {
                        poiVideoListSharedViewModelHo10.LLJI = poiMergedListResponse;
                    }
                    PoiDetailPostListAssem poiDetailPostListAssem4 = this.LL;
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv19 = poiDetailPostListAssem4.LLIZLLLIL;
                    if (viewOnAttachStateChangeListenerC20604515jv19 != null && (poiVideoListSharedViewModelHo8 = poiDetailPostListAssem4.Ho()) != null) {
                        poiVideoListSharedViewModelHo8.setListState(viewOnAttachStateChangeListenerC20604515jv19.getState());
                        viewOnAttachStateChangeListenerC20604515jv19.LJIIL((AbstractC329610Cw3) new C2217401BqU(poiVideoListSharedViewModelHo8) { // from class: X.0h1Z
                            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
                            public final Object get() {
                                return ((AssemListViewModel) this.receiver).getConfig();
                            }
                        }.get());
                    }
                    Context context3 = this.LL.getContext();
                    if (context3 == null) {
                        return;
                    }
                    Fragment fragmentLJI4 = C724240Sb0.LJI(this.LL);
                    if (fragmentLJI4 != null && (interfaceC1181010gq3LIZ2 = C1174830gg5.LIZ(fragmentLJI4)) != null) {
                        poiDetailResponse = (PoiListApi.PoiDetailResponse) interfaceC1181010gq3LIZ2.ta2(new C1180090goZ("poi_head_info"));
                    } else {
                        poiDetailResponse = null;
                    }
                    if (poiDetailResponse != null && poiDetailResponse.isNonRegionalPOI() && poiMergedListResponse != null && (postTagList = poiMergedListResponse.getPostTagList()) != null && !postTagList.isEmpty()) {
                        PoiDetailPostListAssem poiDetailPostListAssem5 = this.LL;
                        if (poiDetailPostListAssem5.LLJI == null) {
                            C1188040h1O c1188040h1O = new C1188040h1O(context3);
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1188040h1O);
                            c1188040h1O.setLayoutParams(layoutParams);
                            poiDetailPostListAssem5.LLJI = c1188040h1O;
                            PoiDetailPostListAssem poiDetailPostListAssem6 = this.LL;
                            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv20 = poiDetailPostListAssem6.LLIZLLLIL;
                            if (viewOnAttachStateChangeListenerC20604515jv20 != null) {
                                viewOnAttachStateChangeListenerC20604515jv20.LJ(0, poiDetailPostListAssem6.LLJI);
                            }
                            PoiDetailPostListAssem poiDetailPostListAssem7 = this.LL;
                            final C1188040h1O c1188040h1O2 = poiDetailPostListAssem7.LLJI;
                            if (c1188040h1O2 != null) {
                                Fragment fragmentLJI5 = C724240Sb0.LJI(poiDetailPostListAssem7);
                                if (fragmentLJI5 != null) {
                                    interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLJI5, null);
                                } else {
                                    interfaceC665370Q7zLJFF2 = null;
                                }
                                Fragment fragmentLJI6 = C724240Sb0.LJI(this.LL);
                                if (fragmentLJI6 != null) {
                                    pageFinderVia = PageFinder.via(fragmentLJI6);
                                } else {
                                    pageFinderVia = null;
                                }
                                View viewInflate = FrameLayout.inflate(c1188040h1O2.getContext(), R.layout.e0h, c1188040h1O2);
                                if (viewInflate instanceof ViewGroup) {
                                    viewGroup = (ViewGroup) viewInflate;
                                } else {
                                    viewGroup = null;
                                }
                                c1188040h1O2.LLILLL = viewGroup;
                                c1188040h1O2.LLILZ = interfaceC665370Q7zLJFF2;
                                c1188040h1O2.LLILZIL = pageFinderVia;
                                if (viewGroup != null) {
                                    linearLayout = (LinearLayout) viewGroup.findViewById(R.id.r17);
                                } else {
                                    linearLayout = null;
                                }
                                c1188040h1O2.LL = linearLayout;
                                ViewGroup viewGroup2 = c1188040h1O2.LLILLL;
                                if (viewGroup2 != null) {
                                    linearLayout2 = (LinearLayout) viewGroup2.findViewById(R.id.r15);
                                } else {
                                    linearLayout2 = null;
                                }
                                c1188040h1O2.LLILLJJLI = linearLayout2;
                                if (interfaceC665370Q7zLJFF2 != null) {
                                    IPoiDetailPostTagClickAbility iPoiDetailPostTagClickAbility = new IPoiDetailPostTagClickAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.videolist.container.PoiDetailPostTagLayout$showTagLayout$1
                                        @Override // com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostTagClickAbility
                                        public final void LJLIIL() {
                                            LinearLayout linearLayout3 = c1188040h1O2.LL;
                                            if (linearLayout3 != null) {
                                                C1188040h1O.LIZ(linearLayout3, true);
                                            }
                                            LinearLayout linearLayout4 = c1188040h1O2.LLILLJJLI;
                                            if (linearLayout4 != null) {
                                                C1188040h1O.LIZ(linearLayout4, true);
                                            }
                                        }

                                        @Override // com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostTagClickAbility
                                        public final void LLILZIL() {
                                            LinearLayout linearLayout3 = c1188040h1O2.LL;
                                            if (linearLayout3 != null) {
                                                C1188040h1O.LIZ(linearLayout3, false);
                                            }
                                            LinearLayout linearLayout4 = c1188040h1O2.LLILLJJLI;
                                            if (linearLayout4 != null) {
                                                C1188040h1O.LIZ(linearLayout4, false);
                                            }
                                        }
                                    };
                                    InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF2, IPoiDetailPostTagClickAbility.class, null);
                                    if (interfaceC494301wDLIZ == null) {
                                        C1558520qew.LJII(interfaceC665370Q7zLJFF2, iPoiDetailPostTagClickAbility, IPoiDetailPostTagClickAbility.class, null, null);
                                    } else {
                                        try {
                                            InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                                            if (invocationHandler instanceof C2255108sX) {
                                                ((C2255108sX) invocationHandler).LL.add(iPoiDetailPostTagClickAbility);
                                            } else {
                                                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                                            }
                                        } catch (IllegalArgumentException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            C2255108sX c2255108sX = new C2255108sX();
                                            c2255108sX.LL.add(iPoiDetailPostTagClickAbility);
                                            c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                                            Object objNewProxyInstance = Proxy.newProxyInstance(IPoiDetailPostTagClickAbility.class.getClassLoader(), new Class[]{IPoiDetailPostTagClickAbility.class}, c2255108sX);
                                            if (objNewProxyInstance != null) {
                                                C1558520qew.LJII(interfaceC665370Q7zLJFF2, (InterfaceC494301wD) objNewProxyInstance, IPoiDetailPostTagClickAbility.class, null, null);
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostTagClickAbility");
                                            }
                                        }
                                    }
                                }
                                ViewGroup viewGroup3 = c1188040h1O2.LLILLL;
                                if (viewGroup3 != null) {
                                    C1180060goW.LJIILL(viewGroup3, new AwS384S0200000_18(c1188040h1O2, poiMergedListResponse, 263));
                                }
                                ViewGroup viewGroup4 = c1188040h1O2.LLILLL;
                                if (viewGroup4 != null) {
                                    AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(991);
                                    if (viewGroup4.isAttachedToWindow()) {
                                        aFwS256S0000000_18.invoke(viewGroup4);
                                        return;
                                    } else {
                                        viewGroup4.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC786060UsW(viewGroup4, aFwS256S0000000_18, 0));
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    PoiDetailPostListAssem poiDetailPostListAssem8 = this.LL;
                    C1188040h1O c1188040h1O3 = poiDetailPostListAssem8.LLJI;
                    if (c1188040h1O3 == null) {
                        return;
                    }
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv21 = poiDetailPostListAssem8.LLIZLLLIL;
                    if (viewOnAttachStateChangeListenerC20604515jv21 != null) {
                        viewOnAttachStateChangeListenerC20604515jv21.LJJ(c1188040h1O3);
                    }
                    poiDetailPostListAssem8.LLJI = null;
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IPoiDetailPostDataChangeAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, iPoiDetailPostDataChangeAbility, IPoiDetailPostDataChangeAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(iPoiDetailPostDataChangeAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(iPoiDetailPostDataChangeAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(IPoiDetailPostDataChangeAbility.class.getClassLoader(), new Class[]{IPoiDetailPostDataChangeAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IPoiDetailPostDataChangeAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostDataChangeAbility");
                    }
                }
            }
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLJI2, null);
            IPoiDetailPostMultiTabAbility iPoiDetailPostMultiTabAbility = new IPoiDetailPostMultiTabAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.videolist.container.PoiDetailPostListAssem$loadAbility$2
                @Override // com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostMultiTabAbility
                public final void Wa2(PoiListApi.PostTab postTab) {
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostMultiTabAbility
                public final void Yq0(PoiListApi.PostTab postTab) {
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0119  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x011b  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x0127 A[PHI: r10 r11 r12
                  0x0127: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:77:0x0124, B:59:0x00b5] A[DONT_GENERATE, DONT_INLINE]
                  0x0127: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v4 java.lang.String) binds: [B:77:0x0124, B:59:0x00b5] A[DONT_GENERATE, DONT_INLINE]
                  0x0127: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v4 java.lang.String) binds: [B:77:0x0124, B:59:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostMultiTabAbility
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void jL2(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PostTab r14) {
                    /*
                        Method dump skipped, instruction units count: 300
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.videolist.container.PoiDetailPostListAssem$loadAbility$2.jL2(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PostTab):void");
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLJFF2, IPoiDetailPostMultiTabAbility.class, null);
            if (interfaceC494301wDLIZ2 == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF2, iPoiDetailPostMultiTabAbility, IPoiDetailPostMultiTabAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(interfaceC494301wDLIZ2);
                    if (invocationHandler2 instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler2).LL.add(iPoiDetailPostMultiTabAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2255108sX c2255108sX2 = new C2255108sX();
                    c2255108sX2.LL.add(iPoiDetailPostMultiTabAbility);
                    c2255108sX2.LL.add((T) interfaceC494301wDLIZ2);
                    Object objNewProxyInstance2 = Proxy.newProxyInstance(IPoiDetailPostMultiTabAbility.class.getClassLoader(), new Class[]{IPoiDetailPostMultiTabAbility.class}, c2255108sX2);
                    if (objNewProxyInstance2 != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF2, (InterfaceC494301wD) objNewProxyInstance2, IPoiDetailPostMultiTabAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostMultiTabAbility");
                    }
                }
            }
        }
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF3 = C1558360qeg.LJFF(fragmentLJI3, null);
            IPoiDetailPostTagAbility iPoiDetailPostTagAbility = new IPoiDetailPostTagAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.videolist.container.PoiDetailPostListAssem$loadAbility$3
                @Override // com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostTagAbility
                public final void lk0(PoiListApi.PostTag postTag) {
                    PoiListApi.PostTag postTag2;
                    C20600815jK<InterfaceC1891350zJl> state;
                    PoiVideoListSharedViewModel poiVideoListSharedViewModelHo8 = this.LL.Ho();
                    if (poiVideoListSharedViewModelHo8 != null) {
                        postTag2 = poiVideoListSharedViewModelHo8.LLIZLLLIL;
                    } else {
                        postTag2 = null;
                    }
                    if (Intrinsics.LJFF(postTag, postTag2)) {
                        return;
                    }
                    PoiVideoListSharedViewModel poiVideoListSharedViewModelHo9 = this.LL.Ho();
                    if (poiVideoListSharedViewModelHo9 != null) {
                        poiVideoListSharedViewModelHo9.LLIZLLLIL = postTag;
                    }
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv19 = this.LL.LLIZLLLIL;
                    if (viewOnAttachStateChangeListenerC20604515jv19 != null && (state = viewOnAttachStateChangeListenerC20604515jv19.getState()) != null) {
                        state.LJIILL(Collections.singletonList(new C1278904zT(EnumC1411005fg.LOADING)), null);
                    }
                    PoiVideoListSharedViewModel poiVideoListSharedViewModelHo10 = this.LL.Ho();
                    if (poiVideoListSharedViewModelHo10 != null) {
                        poiVideoListSharedViewModelHo10.manualListRefresh();
                    }
                    PoiDetailPostListAssem poiDetailPostListAssem = this.LL;
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv20 = poiDetailPostListAssem.LLIZLLLIL;
                    if (viewOnAttachStateChangeListenerC20604515jv20 != null) {
                        viewOnAttachStateChangeListenerC20604515jv20.LJJ(poiDetailPostListAssem.LLJILLL);
                    }
                    if (postTag == null) {
                        this.LL.Jo(null);
                    }
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ3 = C1558520qew.LIZ(interfaceC665370Q7zLJFF3, IPoiDetailPostTagAbility.class, null);
            if (interfaceC494301wDLIZ3 == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF3, iPoiDetailPostTagAbility, IPoiDetailPostTagAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler3 = Proxy.getInvocationHandler(interfaceC494301wDLIZ3);
                    if (invocationHandler3 instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler3).LL.add(iPoiDetailPostTagAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C2255108sX c2255108sX3 = new C2255108sX();
                    c2255108sX3.LL.add(iPoiDetailPostTagAbility);
                    c2255108sX3.LL.add((T) interfaceC494301wDLIZ3);
                    Object objNewProxyInstance3 = Proxy.newProxyInstance(IPoiDetailPostTagAbility.class.getClassLoader(), new Class[]{IPoiDetailPostTagAbility.class}, c2255108sX3);
                    if (objNewProxyInstance3 != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF3, (InterfaceC494301wD) objNewProxyInstance3, IPoiDetailPostTagAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostTagAbility");
                    }
                }
            }
        }
        Fragment fragmentLJI4 = C724240Sb0.LJI(this);
        if (fragmentLJI4 != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF4 = C1558360qeg.LJFF(fragmentLJI4, null);
            IPoiDetailPostAbility iPoiDetailPostAbility = new IPoiDetailPostAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.videolist.container.PoiDetailPostListAssem$loadAbility$4
                @Override // com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostAbility
                public final PoiVideoListSharedViewModel LLLLLLZ() {
                    return this.LL.Ho();
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostAbility
                public final String S2() {
                    InterfaceC1173990gej<?> interfaceC1173990gejLIZ = C1178990gmn.LIZ(this.LL);
                    if (interfaceC1173990gejLIZ != null) {
                        return interfaceC1173990gejLIZ.S2();
                    }
                    return null;
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ4 = C1558520qew.LIZ(interfaceC665370Q7zLJFF4, IPoiDetailPostAbility.class, null);
            if (interfaceC494301wDLIZ4 == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF4, iPoiDetailPostAbility, IPoiDetailPostAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler4 = Proxy.getInvocationHandler(interfaceC494301wDLIZ4);
                    if (invocationHandler4 instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler4).LL.add(iPoiDetailPostAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    C2255108sX c2255108sX4 = new C2255108sX();
                    c2255108sX4.LL.add(iPoiDetailPostAbility);
                    c2255108sX4.LL.add((T) interfaceC494301wDLIZ4);
                    Object objNewProxyInstance4 = Proxy.newProxyInstance(IPoiDetailPostAbility.class.getClassLoader(), new Class[]{IPoiDetailPostAbility.class}, c2255108sX4);
                    if (objNewProxyInstance4 != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF4, (InterfaceC494301wD) objNewProxyInstance4, IPoiDetailPostAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostAbility");
                    }
                }
            }
        }
        PoiVideoListSharedViewModel poiVideoListSharedViewModelHo8 = Ho();
        if (poiVideoListSharedViewModelHo8 != null) {
            Fragment fragmentLJI5 = C724240Sb0.LJI(this);
            if (fragmentLJI5 != null) {
                interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJI5);
            }
            poiVideoListSharedViewModelHo8.LLJJIJI = interfaceC1181010gq3LIZ;
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.videolist.IPoiVideoListAbility
    public final void re2(String str) {
        List<String> list;
        PoiVideoListSharedViewModel poiVideoListSharedViewModelHo = Ho();
        if (poiVideoListSharedViewModelHo != null && (list = poiVideoListSharedViewModelHo.LLJILLL) != null) {
            ((ArrayList) list).add(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.videolist.IPoiVideoListAbility
    public final void sd1(String str) {
        List<String> list;
        PoiVideoListSharedViewModel poiVideoListSharedViewModelHo = Ho();
        if (poiVideoListSharedViewModelHo != null && (list = poiVideoListSharedViewModelHo.LLJJ) != null) {
            ((ArrayList) list).add(str);
        }
    }
}
