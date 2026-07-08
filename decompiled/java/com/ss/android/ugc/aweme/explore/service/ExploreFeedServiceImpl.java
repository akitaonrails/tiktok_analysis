package com.ss.android.ugc.aweme.explore.service;

import X.AbstractC1386130mAt;
import X.AbstractC1387200mCc;
import X.AbstractC1549150qPp;
import X.AbstractC1585770rMt;
import X.AbstractC738140SxQ;
import X.C03H5;
import X.C04WX;
import X.C07CG;
import X.C07MS;
import X.C098200Yq;
import X.C09C2;
import X.C09E8;
import X.C0AHB;
import X.C0CCZ;
import X.C1085640eME;
import X.C1158470gFh;
import X.C123100dR;
import X.C1386470mBR;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1568380quq;
import X.C1583440rJ8;
import X.C1593510rZN;
import X.C15S3;
import X.C15T0;
import X.C15T8;
import X.C15TA;
import X.C15TL;
import X.C15TM;
import X.C15TW;
import X.C15TX;
import X.C15U5;
import X.C15UA;
import X.C15UU;
import X.C15W2;
import X.C1841760y1m;
import X.C1846010y8d;
import X.C1877590yxZ;
import X.C189200o6;
import X.C1906580ziK;
import X.C19EG;
import X.C20525415Tg;
import X.C2082308Dt;
import X.C2171208f0;
import X.C2171308f1;
import X.C2171408f2;
import X.C23250099c;
import X.C2344009Gk;
import X.C2493709pv;
import X.C276720Asw;
import X.C292320Bd0;
import X.C294800Bh0;
import X.C418440Gaw;
import X.C735360Ssw;
import X.C786410Ut5;
import X.C799570VYd;
import X.C814420VxA;
import X.EnumC20526215To;
import X.InterfaceC1210900hcG;
import X.InterfaceC1603450rpP;
import X.InterfaceC1711206n0;
import X.RunnableC329370Cvf;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.v;
import com.ss.android.ugc.aweme.explore.ExploreLynxParams;
import com.ss.android.ugc.aweme.explore.assem.ExploreAssem;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedAssem;
import com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource;
import com.ss.android.ugc.aweme.explore.entrance.ExploreBottomTabProtocol;
import com.ss.android.ugc.aweme.explore.entrance.ExploreXTabProtocol;
import com.ss.android.ugc.aweme.explore.et.ExploreStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.explore.experiment.ExplorePreConnectConfig;
import com.ss.android.ugc.aweme.explore.experiment.ExploreTopic0VVOptConfig;
import com.ss.android.ugc.aweme.explore.lynx.ExploreLynxBizData;
import com.ss.android.ugc.aweme.explore.lynx.ExploreLynxExploreItem;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTrackerMonitor;
import com.ss.android.ugc.aweme.explore.monitor.ff.ExploreColdBootMonitor;
import com.ss.android.ugc.aweme.explore.monitor.lcp.ExploreLCPTracker;
import com.ss.android.ugc.aweme.explore.performance.ExploreFeedPreloadTask;
import com.ss.android.ugc.aweme.explore.performance.json.ExplorePostItemAdapterFactory;
import com.ss.android.ugc.aweme.explore.performance.json.ExploreResponseInterceptorFactory;
import com.ss.android.ugc.aweme.explore.ui.container.BaseExploreFeedFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IEnterFromService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreFeedServiceImpl implements IExploreFeedService {
    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final C13IQ<? extends AbstractC738140SxQ> LJIILLIIL() {
        return C13LE.LIZ(ExploreAssem.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r8.equals("main_page") != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJJIJ() {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.service.ExploreFeedServiceImpl.LJJIJ():java.util.Map");
    }

    public static void LJJIJIIJI() {
        ITextToImageService iTextToImageService;
        C15W2 c15w2 = C15S3.LIZ;
        if (c15w2 == null) {
            c15w2 = new C15W2("exploreOnLayoutChildren", 2000L);
            C15S3.LIZ = c15w2;
        }
        c15w2.LIZ();
        if (C292320Bd0.LIZ == 2) {
            C15UU.LIZ.getClass();
            if (BaseExploreFeedFragment.LLJJIJIL) {
                C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.08cE
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ExploreUtils@efa6.exploreLayoutPreload$1");
                        try {
                            C2153908cD c2153908cD = C2153908cD.LIZ;
                            Activity activityLIZ = C2421209eE.LIZ();
                            if (activityLIZ != null) {
                                C20673215v0.LJI(R.layout.c59, activityLIZ);
                                C20673215v0.LJI(R.layout.c5l, activityLIZ);
                                int i = 0;
                                do {
                                    C20673215v0.LJI(R.layout.c5_, activityLIZ);
                                    i++;
                                } while (i < 6);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ExploreUtils@efa6.exploreLayoutPreload$1");
                    }
                });
            }
        }
        C2493709pv.LIZ.getClass();
        C2493709pv.LIZIZ();
        if (((Number) C04WX.LIZ.getValue()).intValue() == 2) {
            C15T0.LIZ(RunnableC329370Cvf.LL);
        }
        if (((Boolean) C276720Asw.LIZ.getValue()).booleanValue()) {
            C15TX c15tx = C15TX.LLILZLL;
            if (!c15tx.LL) {
                c15tx.LL = true;
                C23250099c.LIZLLL(c15tx.LLILLL, null, null, new C1568380quq(c15tx, null), 3);
            }
        }
        if (C07MS.LIZ()) {
            ExploreCustomTopicDataSource.Companion.getClass();
            ExploreCustomTopicDataSource exploreCustomTopicDataSource = C1841760y1m.LIZ;
            exploreCustomTopicDataSource.initialize();
            exploreCustomTopicDataSource.fetchUserCustomTopics();
        }
        C2171408f2.LIZ.getClass();
        if (((ExplorePreConnectConfig) C09E8.LIZIZ.getValue()).enable) {
            C23250099c.LIZLLL(C2171408f2.LIZIZ, null, null, new C2171308f1(null), 3);
        }
        if (C15TM.LIZIZ().preConnectUseLastDomain) {
            List<String> list = C2171408f2.LJ;
            if (!list.isEmpty()) {
                C23250099c.LIZLLL(C2171408f2.LIZIZ, null, null, new C2171208f0(list, null), 3);
            }
        }
        C07CG.LIZ.getClass();
        if (!C07CG.LIZ() || (iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null)) == null) {
            return;
        }
        iTextToImageService.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final boolean LIZ() {
        C1593510rZN.LL.getClass();
        return C1593510rZN.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final ReusedAssem<? extends C03H5> LIZJ() {
        return new ExploreFeedAssem();
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final Bitmap LJII() {
        Bitmap bitmap = C15U5.LIZ;
        C15U5.LIZ = null;
        return bitmap;
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final v LJIIJJI() {
        if (((Boolean) C0AHB.LIZ.getValue()).booleanValue()) {
            return new ExploreResponseInterceptorFactory();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final int LJIIL() {
        C07CG.LIZ.getClass();
        if (C07CG.LIZ()) {
            C1085640eME c1085640eME = C1846010y8d.LLJL;
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        if (C07MS.LIZ()) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final v LJJ() {
        return new ExplorePostItemAdapterFactory();
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final AbstractC1585770rMt LJJI() {
        return new AbstractC1585770rMt() { // from class: X.0qZJ
            @Override // X.AbstractC1585770rMt
            public final BottomTabProtocol LIZ() {
                return new ExploreBottomTabProtocol();
            }

            @Override // X.AbstractC1585770rMt
            public final TopTabProtocol LIZLLL() {
                return new ExploreXTabProtocol();
            }

            @Override // X.AbstractC1585770rMt
            public final EnumC1584360rKc LIZIZ() {
                return EnumC1584360rKc.EXPLORE;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LJJII() {
        C15TA.LJIIJJI(C15TA.LIZ, "restore_back_to_detail", "homepage_hot", null, 12);
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJJIII() {
        return Collections.singletonList(C1877590yxZ.class);
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final C0CCZ LJJIIJZLJL() {
        return new ExploreFeedPreloadTask();
    }

    public static BaseExploreFeedFragment LJJIIZI() {
        C19EG activity;
        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
            if (abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) {
                Fragment fragmentLIZLLL = abstractC1387200mCc.LIZLLL();
                if (fragmentLIZLLL == null || (activity = fragmentLIZLLL.getActivity()) == null) {
                    return null;
                }
                return (BaseExploreFeedFragment) Hox.LLJILJIL.LIZ(activity).Ki("homepage_explore");
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LIZIZ(Context context) {
        LJJIJIIJI();
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LIZLLL(ExploreLynxParams exploreLynxParams) {
        Long l;
        C15TW c15tw = C15TW.LIZ;
        C15TW.LJII = true;
        if (((ExploreTopic0VVOptConfig) C1158470gFh.LIZIZ.getValue()).isEnable()) {
            LJJIJIIJI();
            if (C294800Bh0.LIZ() && exploreLynxParams != null && (l = exploreLynxParams.lynxJumpInterestId) != null) {
                long jLongValue = l.longValue();
                String str = exploreLynxParams.lynxJumpInterestName;
                if (str != null) {
                    List list = exploreLynxParams.lynxJumpAwemeIds;
                    if (list == null) {
                        list = C13BV.INSTANCE;
                    }
                    boolean z = exploreLynxParams.lynxIsPinTopic;
                    Set setLLIIJI = C13LP.LLIIJI(list);
                    if (z) {
                        C15T8 c15t8 = C15T8.LL;
                        Long lValueOf = Long.valueOf(jLongValue);
                        c15t8.getClass();
                        if (C15T8.LJIILJJIL(lValueOf)) {
                            return;
                        }
                    } else {
                        C15T8.LL.getClass();
                        if (C15T8.LJIIJJI()) {
                            return;
                        }
                    }
                    if (C15TW.LIZLLL.containsKey(Long.valueOf(jLongValue)) && Intrinsics.LJFF(C15TW.LJ.get(Long.valueOf(jLongValue)), setLLIIJI)) {
                        return;
                    }
                    C15TW.LJFF.remove(Long.valueOf(jLongValue));
                    C15TW.LIZIZ(list, jLongValue, z, str);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LJIIIIZZ(String str) {
        Long l;
        ?? arrayList;
        Object c098200Yq;
        C15TW c15tw = C15TW.LIZ;
        try {
            ExploreLynxBizData exploreLynxBizData = (ExploreLynxBizData) C09C2.LIZ().LJII(str, ExploreLynxBizData.class);
            if (exploreLynxBizData != null) {
                if (exploreLynxBizData.interestId != null && exploreLynxBizData != null && (l = exploreLynxBizData.interestId) != null) {
                    long jLongValue = l.longValue();
                    C15TW c15tw2 = C15TW.LIZ;
                    String str2 = exploreLynxBizData.interestName;
                    boolean zBooleanValue = true;
                    if (str2 == null || !(!a0.LJJJIL(str2))) {
                        str2 = "";
                    }
                    List<ExploreLynxExploreItem> list = exploreLynxBizData.exploreItems;
                    if (list != null) {
                        arrayList = new ArrayList();
                        Iterator<ExploreLynxExploreItem> it2 = list.iterator();
                        while (it2.hasNext()) {
                            String str3 = it2.next().awemeId;
                            if (str3 != null && (!a0.LJJJIL(str3))) {
                                arrayList.add(str3);
                            }
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    if (!exploreLynxBizData.isPinTopic) {
                        String str4 = exploreLynxBizData.jumpUrl;
                        zBooleanValue = false;
                        if (str4 != null) {
                            try {
                                c098200Yq = Boolean.valueOf(UriProtector.parse(str4).getBooleanQueryParameter("is_pin_topic", false));
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                c098200Yq = Boolean.FALSE;
                            }
                            zBooleanValue = ((Boolean) c098200Yq).booleanValue();
                        }
                    }
                    C15TW.LIZIZ(arrayList, jLongValue, zBooleanValue, str2);
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final boolean LJIILL(PublishModel publishModel) {
        IEnterFromService iEnterFromServiceEnterFromService;
        String shootEnterFromOnEditModel = null;
        if (publishModel != null) {
            String shootEnterFromOnEditModel2 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).enterFromService().getShootEnterFromOnEditModel(publishModel);
            if (C1583440rJ8.LIZ != 0 && !publishModel.isStoryPublish) {
                if (!Intrinsics.LJFF(shootEnterFromOnEditModel2, "homepage_explore")) {
                    C07CG.LIZ.getClass();
                    if (C07CG.LIZ()) {
                        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                        if (iExternalService != null && (iEnterFromServiceEnterFromService = iExternalService.enterFromService()) != null) {
                            shootEnterFromOnEditModel = iEnterFromServiceEnterFromService.getShootEnterFromOnEditModel(publishModel);
                        }
                        if (Intrinsics.LJFF(shootEnterFromOnEditModel, "homepage_explore")) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LJIJ(String str) {
        C15TA.LJIIJJI(C15TA.LIZ, "publish_landing", "video_post_page", str, 4);
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final String LJIJI(SearchFragment searchFragment) {
        if (searchFragment instanceof BaseExploreFeedFragment) {
            return null;
        }
        C15TA.LIZ.getClass();
        return C15TA.LJIILLIIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> Ln(java.lang.String r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.explore.ui.container.BaseExploreFeedFragment r2 = LJJIIZI()
            r3 = 0
            if (r2 == 0) goto L79
            X.0Q7z r1 = X.C1558360qeg.LJFF(r2, r3)
            java.lang.Class<com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility> r0 = com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility.class
            X.01wD r5 = X.C1558520qew.LIZ(r1, r0, r3)
            com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility r5 = (com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility) r5
            if (r5 == 0) goto L79
            java.lang.String r4 = r5.zR1()
            if (r4 == 0) goto L36
            int r1 = r4.hashCode()
            r0 = -1716847790(0xffffffff99aafb52, float:-1.7679095E-23)
            if (r1 == r0) goto L61
            r0 = -891528875(0xffffffffcadc5955, float:-7220394.5)
            if (r1 == r0) goto L4f
            r0 = -251149995(0xfffffffff107c155, float:-6.722272E29)
            if (r1 != r0) goto L36
            java.lang.String r0 = "main_page"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L58
        L36:
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L3c:
            X.0Q7z r2 = X.C1558360qeg.LJFF(r2, r3)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Class<com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility> r0 = com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r2, r0, r1)
            com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility r0 = (com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility) r0
            if (r0 != 0) goto L74
            return r3
        L4f:
            java.lang.String r0 = "subtab"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L58
            goto L36
        L58:
            com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse r0 = r5.yB1()
            if (r0 == 0) goto L72
            java.lang.Long r0 = r0.topicId
            goto L3c
        L61:
            java.lang.String r0 = "topic_popup_page"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse r0 = r5.SC0()
            if (r0 == 0) goto L72
            java.lang.Long r0 = r0.topicId
            goto L3c
        L72:
            r0 = r3
            goto L3c
        L74:
            java.util.Map r0 = r0.Ln(r7)
            return r0
        L79:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.service.ExploreFeedServiceImpl.Ln(java.lang.String):java.util.Map");
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LJIIJ(String str, String str2) {
        ExploreColdBootMonitor.INSTANCE.start(str, str2);
        LJJIJIIJI();
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LJIIZILJ(C1386470mBR c1386470mBR, String str) {
        if (!Intrinsics.LJFF(str, "homepage_explore")) {
            return;
        }
        c1386470mBR.LIZLLL(0, "is_explore_innerfeed");
        c1386470mBR.LJ("enter_explore_session_id", C15UA.LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LJ(Long l, String str, String str2) {
        int i = 0;
        EnumC20526215To enumC20526215To = null;
        if (l == null || l.longValue() == 0) {
            l = null;
        }
        ExploreLCPTracker exploreLCPTracker = ExploreLCPTracker.INSTANCE;
        EnumC20526215To.Companion.getClass();
        if (str != null && (true ^ a0.LJJJIL(str))) {
            EnumC20526215To[] enumC20526215ToArrValues = EnumC20526215To.values();
            int length = enumC20526215ToArrValues.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                EnumC20526215To enumC20526215To2 = enumC20526215ToArrValues[i];
                if (Intrinsics.LJFF(enumC20526215To2.getValue(), str)) {
                    enumC20526215To = enumC20526215To2;
                    break;
                }
                i++;
            }
        }
        exploreLCPTracker.setPendingContext(enumC20526215To, l, str2);
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LJI(long j, String str, boolean z) {
        C15TW c15tw = C15TW.LIZ;
        C15TW.LIZIZ(C13BV.INSTANCE, j, z, str);
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LJIIIZ(String str, String str2, Map<String, String> map) {
        String str3;
        C15TA.LIZ.getClass();
        C15TA.LJIILJJIL = str;
        C15TA.LJIILL = str2;
        C15TA.LJJIIJZLJL = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - C15TA.LJ;
        boolean z = C15TA.LJJJI;
        boolean zLIZ = C15TL.LIZ();
        boolean zLIZIZ = C1583440rJ8.LIZIZ();
        HashMap map2 = (HashMap) map;
        String str4 = (String) map2.get("explore_tab_type");
        if (str4 == null) {
            str4 = "homepage_explore";
        }
        if (!C15TA.LJJJI || (str3 = C15TA.LJJIJLIJ) == null) {
            str3 = "";
        }
        map2.putAll(new C20525415Tg(str2, str, z, zLIZ, jElapsedRealtime, zLIZIZ, "", str4, str3, C15TA.LJJIJ, C15TA.LJJIJIIJI, 26112).LIZ());
        Explore0VVTrackerMonitor.INSTANCE.start(str2);
        C15TA.LJJJI = false;
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LJIL(C2344009Gk c2344009Gk, String str, String str2) {
        if (Intrinsics.LJFF(str, "homepage_explore")) {
            if (str2 == null) {
                str2 = "";
            }
            c2344009Gk.LJIIIIZZ("is_first_refresh", C15UA.LIZIZ(str2));
            c2344009Gk.LJFF("explore_session_id", C15UA.LIZJ());
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LJJIIZ(C735360Ssw c735360Ssw, String str, String str2) {
        if (Intrinsics.LJFF(str, "homepage_explore")) {
            if (str2 == null) {
                str2 = "";
            }
            c735360Ssw.LJFF("is_first_refresh", C15UA.LIZIZ(str2), InterfaceC1210900hcG.LIZ);
            c735360Ssw.LJ("explore_session_id", C15UA.LIZJ());
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LJFF(C2344009Gk c2344009Gk, String str, String str2, String str3) {
        int i;
        Map mapLJJIJ;
        if (Intrinsics.LJFF(str, "homepage_explore")) {
            if (C123100dR.LIZ(str2) && !Intrinsics.LJFF(str2, str3)) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "is_explore_innerfeed");
            if (str2 == null) {
                str2 = "";
            }
            c2344009Gk.LJFF("explore_innerfeed_entrance_group_id", str2);
            if (C07MS.LIZ() && (mapLJJIJ = LJJIJ()) != null) {
                for (Map.Entry entry : ((LinkedHashMap) mapLJJIJ).entrySet()) {
                    c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LJIILJJIL(Uri.Builder builder, String str, String str2, String str3) {
        String str4;
        Map mapLJJIJ;
        if (!Intrinsics.LJFF(str, "homepage_explore")) {
            return;
        }
        if (C123100dR.LIZ(str2) && !Intrinsics.LJFF(str2, str3)) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter = builder.appendQueryParameter("is_explore_innerfeed", str4);
        if (str2 == null) {
            str2 = "";
        }
        builderAppendQueryParameter.appendQueryParameter("explore_innerfeed_entrance_group_id", str2);
        if (C07MS.LIZ() && (mapLJJIJ = LJJIJ()) != null) {
            for (Map.Entry entry : ((LinkedHashMap) mapLJJIJ).entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final String LJIJJ(C2344009Gk c2344009Gk, String str, String str2, String str3) {
        Map<String, String> map;
        String str4;
        if (!Intrinsics.LJFF(str, "homepage_explore")) {
            return null;
        }
        if (c2344009Gk != null && (map = c2344009Gk.LIZ) != null && (str4 = (String) ((HashMap) map).get("explore_innerfeed_entrance_group_id")) != null) {
            return str4;
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LJIJJLI(AbstractC1386130mAt<?> abstractC1386130mAt, String str, String str2, String str3) {
        int i;
        Map mapLJJIJ;
        if (Intrinsics.LJFF(str, "homepage_explore")) {
            if (C123100dR.LIZ(str2) && !Intrinsics.LJFF(str2, str3)) {
                i = 1;
            } else {
                i = 0;
            }
            abstractC1386130mAt.LIZLLL(i, "is_explore_innerfeed");
            if (str2 == null) {
                str2 = "";
            }
            abstractC1386130mAt.LJ("explore_innerfeed_entrance_group_id", str2);
            if (C07MS.LIZ() && (mapLJJIJ = LJJIJ()) != null) {
                for (Map.Entry entry : ((LinkedHashMap) mapLJJIJ).entrySet()) {
                    abstractC1386130mAt.LJ((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final InterfaceC1603450rpP LJJIFFI(Fragment fragment, String str, String str2, AwS568S0100000_24 awS568S0100000_24) {
        return new ExploreStayTimeFragmentComponent(fragment, str, str2, awS568S0100000_24);
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LJIILIIL(C2344009Gk c2344009Gk, String str, Long l, String str2, String str3) {
        if (!Intrinsics.LJFF(str, "homepage_explore")) {
            return;
        }
        c2344009Gk.LJ(l, "explore_topic_id");
        C15TA c15ta = C15TA.LIZ;
        String strValueOf = String.valueOf(l);
        c15ta.getClass();
        c2344009Gk.LJFF("explore_topic", C15TA.LIZIZ(strValueOf, str2));
        c2344009Gk.LJFF("from_explore_page", str3);
    }

    @Override // com.ss.android.ugc.aweme.explore.service.IExploreFeedService
    public final void LJJIIJ(AbstractC1386130mAt<?> abstractC1386130mAt, String str, Long l, String str2, String str3) {
        if (!Intrinsics.LJFF(str, "homepage_explore")) {
            return;
        }
        String strValueOf = String.valueOf(l);
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        abstractC1386130mAt.LJFF("explore_topic_id", strValueOf, c2082308Dt);
        C15TA c15ta = C15TA.LIZ;
        String strValueOf2 = String.valueOf(l);
        c15ta.getClass();
        abstractC1386130mAt.LJFF("explore_topic", C15TA.LIZIZ(strValueOf2, str2), c2082308Dt);
        abstractC1386130mAt.LJ("from_explore_page", str3);
    }
}
