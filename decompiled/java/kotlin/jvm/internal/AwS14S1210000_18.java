package kotlin.jvm.internal;

import X.C062P;
import X.C080U;
import X.C09AY;
import X.C0NBH;
import X.C1165940gRk;
import X.C1175020ggO;
import X.C1176580giu;
import X.C1178200glW;
import X.C1178490glz;
import X.C1184530gvj;
import X.C1185410gx9;
import X.C1188530h2B;
import X.C1189060h32;
import X.C1190280h50;
import X.C11O8;
import X.C1205490hTX;
import X.C125300dn;
import X.C1499850p8J;
import X.C1623706Xj;
import X.EnumC1156330gCF;
import X.EnumC1175520ghC;
import X.EnumC1182690gsl;
import X.EnumC1182750gsr;
import X.EnumC1205570hTf;
import X.InterfaceC1177110gjl;
import X.InterfaceC1177250gjz;
import X.InterfaceC665370Q7z;
import Y.AfS187S0100000_18;
import Y.AfS6S1210000_18;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.LsResBystander;
import com.ss.android.ugc.aweme.net.LocationNetRequestInfoCommonInterceptor;
import com.ss.android.ugc.aweme.net.LsPreloadCheckerBystander;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizHomePageMapAssem;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizResponse;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsLandingViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS14S1210000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS14S1210000_18 awS14S1210000_18, Object obj) {
        C062P c062p = (C062P) obj;
        c062p.LIZ = new C1184530gvj(awS14S1210000_18.s0, C1189060h32.LJIIZILJ(((PoiListApi.PoiDetailResponse) awS14S1210000_18.l1).isCollected()), 3, ((PoiListApi.PoiDetailResponse) awS14S1210000_18.l1).getName(), ((PoiListApi.PoiDetailResponse) awS14S1210000_18.l1).getAddress(), false, (C1188530h2B) awS14S1210000_18.l2, (C1185410gx9) null, ((PoiListApi.PoiDetailResponse) awS14S1210000_18.l1).getDataFromAnchor(), awS14S1210000_18.z3, 416);
        c062p.LIZIZ = "PoiCollectHierarchyData";
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS14S1210000_18 awS14S1210000_18, Object obj) {
        boolean z;
        String str;
        PoiQuizResponse poiQuizResponse;
        C1178200glW c1178200glW;
        C1176580giu c1176580giu;
        double d;
        C1178490glz c1178490glz;
        C1165940gRk c1165940gRkLJJIJIIJIL;
        Iterable data;
        Object next;
        String str2;
        try {
            PoiQuizHomePageMapAssem poiQuizHomePageMapAssem = (PoiQuizHomePageMapAssem) awS14S1210000_18.l1;
            EnumC1182690gsl enumC1182690gsl = poiQuizHomePageMapAssem.LLJJI;
            EnumC1182690gsl enumC1182690gsl2 = EnumC1182690gsl.HOME_PAGE;
            if (enumC1182690gsl != enumC1182690gsl2 && poiQuizHomePageMapAssem.LLJJIII != EnumC1182750gsr.LIST_LOADING) {
                if (enumC1182690gsl == EnumC1182690gsl.ANSWER_QUESTION && !awS14S1210000_18.z3) {
                    InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl = poiQuizHomePageMapAssem.LLJILJILJ;
                    if (interfaceC1177110gjl != null && (data = interfaceC1177110gjl.getData()) != null) {
                        C1175020ggO c1175020ggO = (C1175020ggO) awS14S1210000_18.l2;
                        Iterator it2 = data.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                String str3 = ((C1178200glW) next).LIZ;
                                if (c1175020ggO != null) {
                                    str2 = c1175020ggO.LIZ;
                                } else {
                                    str2 = null;
                                }
                                if (Intrinsics.LJFF(str3, str2)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        c1178200glW = (C1178200glW) next;
                    } else {
                        c1178200glW = null;
                    }
                    InterfaceC1177250gjz interfaceC1177250gjz = ((PoiQuizHomePageMapAssem) awS14S1210000_18.l1).LLJIJIL;
                    if (interfaceC1177250gjz != null && (c1165940gRkLJJIJIIJIL = interfaceC1177250gjz.LJJIJIIJIL()) != null) {
                        c1176580giu = c1165940gRkLJJIJIIJIL.bounds;
                    } else {
                        c1176580giu = null;
                    }
                    PoiQuizHomePageMapAssem poiQuizHomePageMapAssem2 = (PoiQuizHomePageMapAssem) awS14S1210000_18.l1;
                    double d2 = 0.0d;
                    if (c1178200glW != null && (c1178490glz = c1178200glW.LJIIIIZZ) != null) {
                        d = c1178490glz.latitude;
                    } else {
                        d = 0.0d;
                        if (c1178200glW != null) {
                        }
                        PoiQuizHomePageMapAssem.Go(poiQuizHomePageMapAssem2, c1176580giu, new C1178490glz(d, d2), true, 8);
                    }
                    C1178490glz c1178490glz2 = c1178200glW.LJIIIIZZ;
                    if (c1178490glz2 != null) {
                        d2 = c1178490glz2.longitude;
                    }
                    PoiQuizHomePageMapAssem.Go(poiQuizHomePageMapAssem2, c1176580giu, new C1178490glz(d, d2), true, 8);
                } else {
                    poiQuizHomePageMapAssem.So(awS14S1210000_18.s0, (C1175020ggO) awS14S1210000_18.l2);
                }
            } else {
                if (enumC1182690gsl == enumC1182690gsl2 && poiQuizHomePageMapAssem.LLJJIII == EnumC1182750gsr.LIST_COMPLETE && (poiQuizResponse = poiQuizHomePageMapAssem.No().LLIZLLLIL) != null && poiQuizResponse.isPoiListSuccess()) {
                    z = true;
                } else {
                    z = false;
                }
                PoiQuizHomePageMapAssem poiQuizHomePageMapAssem3 = (PoiQuizHomePageMapAssem) awS14S1210000_18.l1;
                C1175020ggO c1175020ggO2 = (C1175020ggO) awS14S1210000_18.l2;
                if (c1175020ggO2 != null) {
                    str = c1175020ggO2.LIZ;
                } else {
                    str = null;
                }
                poiQuizHomePageMapAssem3.bp(str, false, true);
                if (z) {
                    ((PoiQuizHomePageMapAssem) awS14S1210000_18.l1).ap((C1175020ggO) awS14S1210000_18.l2);
                } else {
                    ((PoiQuizHomePageMapAssem) awS14S1210000_18.l1).Vo((C1175020ggO) awS14S1210000_18.l2);
                }
                ((PoiQuizHomePageMapAssem) awS14S1210000_18.l1).Ho();
            }
            ((PoiQuizHomePageMapAssem) awS14S1210000_18.l1).LLJI.LIZ(AFwS256S0000000_18.get$arr$(891));
            PoiQuizHomePageMapAssem poiQuizHomePageMapAssem4 = (PoiQuizHomePageMapAssem) awS14S1210000_18.l1;
            poiQuizHomePageMapAssem4.LLJJI = EnumC1182690gsl.POI_PICK;
            poiQuizHomePageMapAssem4.LLJJIII = EnumC1182750gsr.LIST_COMPLETE;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            EnumC1205570hTf enumC1205570hTf = EnumC1205570hTf.POI_QUIZ_MAP_ERROR;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(enumC1205570hTf, "show_poi_pick_style", null, e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS14S1210000_18 awS14S1210000_18, Object obj) {
        ArrayList arrayList;
        C1190280h50 c1190280h50 = (C1190280h50) obj;
        if (awS14S1210000_18.z3 || !(c1190280h50.LLILZ instanceof C1623706Xj)) {
            ((PoiReviewsLandingViewModel) awS14S1210000_18.l1).setState(AFwS256S0000000_18.get$arr$(913));
            if (!awS14S1210000_18.z3 && C125300dn.LIZ(((PoiReviewsLandingViewModel) awS14S1210000_18.l1).LLILLL)) {
                arrayList = new ArrayList();
                arrayList.add(new C080U("check_preload", "true"));
                arrayList.add(new C080U("check_preload_cache", "true"));
            } else {
                arrayList = null;
            }
            C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ);
            c1499850p8JCreateBuilder.LIZ(new LocationNetRequestInfoCommonInterceptor());
            c1499850p8JCreateBuilder.LIZIZ(LsResBystander.LIZ);
            c1499850p8JCreateBuilder.LIZIZ(LsPreloadCheckerBystander.LIZ);
            c1499850p8JCreateBuilder.LJIIIZ = 0;
            PoiReviewsApi poiReviewsApi = (PoiReviewsApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(PoiReviewsApi.class);
            String str = awS14S1210000_18.s0;
            if (str == null) {
                str = "";
            }
            int value = EnumC1175520ghC.POI_REVIEW_LANDING_2TAB.getValue();
            PoiReviewsLandingViewModel poiReviewsLandingViewModel = (PoiReviewsLandingViewModel) awS14S1210000_18.l1;
            List<String> list = poiReviewsLandingViewModel.LLJIJIL;
            List<String> list2 = poiReviewsLandingViewModel.LLJJIJIIJIL;
            int value2 = EnumC1156330gCF.POI_REVIEW_SORT_TYPE_DEFAULT.getValue();
            PoiReviewsLandingViewModel poiReviewsLandingViewModel2 = (PoiReviewsLandingViewModel) awS14S1210000_18.l1;
            C11O8 c11o8LIZ = C0NBH.LIZ(poiReviewsApi.getPoiReviewsList("/tiktok/poi/review/get/v1", str, value, 20, 0L, list, list2, value2, null, poiReviewsLandingViewModel2.LLILLJJLI, Boolean.TRUE, poiReviewsLandingViewModel2.LLILLL, arrayList, null));
            boolean z = awS14S1210000_18.z3;
            PoiReviewsLandingViewModel poiReviewsLandingViewModel3 = (PoiReviewsLandingViewModel) awS14S1210000_18.l1;
            c11o8LIZ.LJJLL(new AfS6S1210000_18(z, poiReviewsLandingViewModel3, (InterfaceC665370Q7z) awS14S1210000_18.l2, awS14S1210000_18.s0, 0), new AfS187S0100000_18(poiReviewsLandingViewModel3, 69));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S1210000_18(PoiQuizHomePageMapAssem poiQuizHomePageMapAssem, C1175020ggO c1175020ggO, boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = poiQuizHomePageMapAssem;
        this.l2 = c1175020ggO;
        this.z3 = z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S1210000_18(String str, PoiListApi.PoiDetailResponse poiDetailResponse, C1188530h2B c1188530h2B, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = poiDetailResponse;
        this.l2 = c1188530h2B;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S1210000_18(boolean z, PoiReviewsLandingViewModel poiReviewsLandingViewModel, String str, InterfaceC665370Q7z interfaceC665370Q7z, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.l1 = poiReviewsLandingViewModel;
        this.s0 = str;
        this.l2 = interfaceC665370Q7z;
    }
}
