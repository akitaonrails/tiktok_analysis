package com.ss.android.ugc.aweme.base.service;

import X.AbstractC23140094w;
import X.AbstractC848400XPy;
import X.C08JS;
import X.C098200Yq;
import X.C0BKI;
import X.C0BNW;
import X.C0IVP;
import X.C0J9A;
import X.C0KZ1;
import X.C0T1R;
import X.C0XQ7;
import X.C1030680cva;
import X.C1157600gEI;
import X.C1160320gIg;
import X.C1169404ho;
import X.C11IR;
import X.C11NZ;
import X.C1203304nH;
import X.C1209404oG;
import X.C1220000hqw;
import X.C1227904rF;
import X.C1243240iSQ;
import X.C1303260k1E;
import X.C1303270k1F;
import X.C13BV;
import X.C13DV;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C1564460qoW;
import X.C1569180qw8;
import X.C1594370ral;
import X.C1595180rc4;
import X.C1595770rd1;
import X.C1596120rda;
import X.C1596130rdb;
import X.C1596360rdy;
import X.C1596430re5;
import X.C1596470re9;
import X.C1596490reB;
import X.C1596510reD;
import X.C1596530reF;
import X.C1596560reI;
import X.C1596670reT;
import X.C1596680reU;
import X.C1596710reX;
import X.C1596910rer;
import X.C1596920res;
import X.C1596930ret;
import X.C1596960rew;
import X.C1597160rfG;
import X.C1597330rfX;
import X.C1597340rfY;
import X.C1597440rfi;
import X.C1597470rfl;
import X.C1597620rg0;
import X.C1597740rgC;
import X.C1599090riN;
import X.C1600320rkM;
import X.C1605650rsx;
import X.C1618440sDa;
import X.C1622206Wu;
import X.C1697810uHb;
import X.C1697820uHc;
import X.C1720106oR;
import X.C189200o6;
import X.C19482711Kf;
import X.C19719912Dl;
import X.C19EG;
import X.C20673215v0;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23265099r;
import X.C2344809Gs;
import X.C287110BNd;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C512401z8;
import X.C596340NaC;
import X.C703302op;
import X.C724750Sbp;
import X.C728010Sh5;
import X.C728840SiQ;
import X.C729510SjV;
import X.C736820SvI;
import X.C736950SvV;
import X.C844470XAv;
import X.EnumC1154780g9k;
import X.EnumC1582650rHr;
import X.EnumC1596540reG;
import X.EnumC1597060rf6;
import X.EnumC1615506Uf;
import X.InterfaceC088400Uw;
import X.InterfaceC1364105Vn;
import X.InterfaceC1596570reJ;
import X.InterfaceC1596890rep;
import X.InterfaceC1597070rf7;
import X.InterfaceC1597360rfa;
import X.InterfaceC1597500rfo;
import X.InterfaceC1597700rg8;
import X.InterfaceC1891350zJl;
import X.InterfaceC20673515v3;
import X.InterfaceC714040Rze;
import X.InterfaceC718030SEn;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.crash.Npth;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.bean.MixRanSkylightLiveBizParams;
import com.ss.android.ugc.aweme.bean.MixRanSkylightStoryBizParams;
import com.ss.android.ugc.aweme.bean.MixRankSkylightBizParams;
import com.ss.android.ugc.aweme.bean.MixRankSkylightCommonBizParams;
import com.ss.android.ugc.aweme.bean.MixRankSkylightInsertParams;
import com.ss.android.ugc.aweme.bean.MixRankSkylightRequest;
import com.ss.android.ugc.aweme.bean.MixRankSkylightResponse;
import com.ss.android.ugc.aweme.bean.MixRankSkylightSceneRequest;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.StoryMuteResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.platform.SkylightBiz;
import com.ss.android.ugc.aweme.service.IFeedSkylightCommonService;
import com.ss.android.ugc.aweme.service.ISkylightMafService;
import com.ss.android.ugc.aweme.story.feed.StoryGuideCardInfo;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.component.StoryImmersiveUserFeedComponent;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import com.ss.android.ugc.aweme.story.model.ClientControlParams;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS107S1200000_24;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS62S0001000_24;
import kotlin.jvm.internal.AwS87S0210000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedSkylightCommonServiceImpl implements IFeedSkylightCommonService {
    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final C1596960rew LJFF() {
        return C1596960rew.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJIJJLI() {
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final C1596680reU LJJIJIL() {
        return C1596680reU.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final C1596670reT LJJIJLIJ() {
        return C1596670reT.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LIZJ(Context context) {
        Object c098200Yq;
        C1597740rgC.LIZ.getClass();
        List<FollowingInterestUser> list = C1597740rgC.LJIILL;
        C0J9A c0j9aV3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3();
        if (c0j9aV3.LJIIJJI()) {
            long jLJIJJ = c0j9aV3.LJIJJ();
            Object obj = null;
            FollowingInterestUser followingInterestUser = null;
            if (!C1597740rgC.LJIILL.isEmpty()) {
                if (jLJIJJ <= 0) {
                    followingInterestUser = (FollowingInterestUser) ListProtector.get(C1597740rgC.LJIILL, 0);
                } else {
                    Iterator<FollowingInterestUser> it2 = C1597740rgC.LJIILL.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        FollowingInterestUser next = it2.next();
                        if (jLJIJJ == next.getUser().roomId) {
                            followingInterestUser = next;
                            break;
                        }
                    }
                }
            } else {
                try {
                    c098200Yq = (FollowingInterestUser) C08JS.LIZIZ().LJII(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LJJIFFI(jLJIJJ), FollowingInterestUser.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                followingInterestUser = (FollowingInterestUser) obj;
            }
            C1597740rgC.LJIIJ(context, followingInterestUser, list, 0, null, "follow_widget", "homepage_follow", 0L);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJII(UIAssem uIAssem) {
        try {
            C1564460qoW.LIZ(uIAssem);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJ(e.getMessage());
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final C1597440rfi LJIIIIZZ(int i) {
        InterfaceC088400Uw interfaceC088400Uw;
        C1596490reB c1596490reB;
        InterfaceC1596890rep interfaceC1596890rep;
        InterfaceC1596890rep interfaceC1596890rep2;
        InterfaceC088400Uw interfaceC088400Uw2;
        InterfaceC088400Uw interfaceC088400Uw3;
        InterfaceC088400Uw interfaceC088400Uw4;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        EnumC1597060rf6 enumC1597060rf6 = EnumC1597060rf6.STORY;
                        List listSingletonList = Collections.singletonList(enumC1597060rf6);
                        C1169404ho c1169404ho = new C1169404ho(Collections.singletonList(new C1157600gEI("default", Collections.singletonList(enumC1597060rf6), null, 12)));
                        final List listSingletonList2 = Collections.singletonList(enumC1597060rf6);
                        c1596490reB = new C1596490reB(i, listSingletonList, c1169404ho, new InterfaceC088400Uw(listSingletonList2) { // from class: X.00Uv
                            public final List<EnumC1597060rf6> LIZ;

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return (obj instanceof C088300Uv) && Intrinsics.LJFF(this.LIZ, ((C088300Uv) obj).LIZ);
                            }

                            public final int hashCode() {
                                return this.LIZ.hashCode();
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("TypeBasedSortStrategy(typePriority=");
                                sbLIZ.append(this.LIZ);
                                sbLIZ.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                this.LIZ = listSingletonList2;
                            }

                            @Override // X.InterfaceC088400Uw
                            public final List LIZ(C1597350rfZ c1597350rfZ, List list, Map map) {
                                ArrayList arrayList = new ArrayList();
                                Iterator<EnumC1597060rf6> it2 = this.LIZ.iterator();
                                while (it2.hasNext()) {
                                    Object obj = (Collection) ((LinkedHashMap) map).get(it2.next());
                                    if (obj == null) {
                                        obj = C13BV.INSTANCE;
                                    }
                                    arrayList.addAll(obj);
                                }
                                for (Object obj2 : (ArrayList) list) {
                                    if (!this.LIZ.contains(obj2)) {
                                        Object obj3 = (Collection) ((LinkedHashMap) map).get(obj2);
                                        if (obj3 == null) {
                                            obj3 = C13BV.INSTANCE;
                                        }
                                        arrayList.addAll(obj3);
                                    }
                                }
                                return arrayList;
                            }
                        });
                    } else {
                        EnumC1597060rf6 enumC1597060rf62 = EnumC1597060rf6.STORY;
                        EnumC1597060rf6 enumC1597060rf63 = EnumC1597060rf6.LIVE;
                        EnumC1597060rf6 enumC1597060rf64 = EnumC1597060rf6.FRIENDS;
                        EnumC1597060rf6 enumC1597060rf65 = EnumC1597060rf6.ACTIVE_STATUS;
                        EnumC1597060rf6 enumC1597060rf66 = EnumC1597060rf6.HIGHLIGHT;
                        EnumC1597060rf6 enumC1597060rf67 = EnumC1597060rf6.ON_THIS_DAY;
                        EnumC1597060rf6 enumC1597060rf68 = EnumC1597060rf6.LIVE_EVENT;
                        EnumC1597060rf6 enumC1597060rf69 = EnumC1597060rf6.STORY_CELEBRATION;
                        EnumC1597060rf6 enumC1597060rf610 = EnumC1597060rf6.STORY_WIDGET;
                        EnumC1597060rf6 enumC1597060rf611 = EnumC1597060rf6.THOUGHT;
                        List listLJIIJJI = C1697810uHb.LJIIJJI(enumC1597060rf62, enumC1597060rf63, enumC1597060rf64, enumC1597060rf65, enumC1597060rf66, enumC1597060rf67, enumC1597060rf68, enumC1597060rf69, enumC1597060rf610, enumC1597060rf611);
                        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(enumC1597060rf67, 2000), new Pair(enumC1597060rf63, 3250), new Pair(enumC1597060rf62, 5000), new Pair(enumC1597060rf611, 5000), new Pair(enumC1597060rf66, 5500), new Pair(enumC1597060rf65, 6000), new Pair(enumC1597060rf64, 8000), new Pair(enumC1597060rf610, 10000), new Pair(enumC1597060rf69, 1700), new Pair(enumC1597060rf68, 100000));
                        List listLJLLLL = C13LP.LJLLLL(new C512401z8(33), mapLJIIIIZZ.entrySet());
                        final ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
                        Iterator it2 = listLJLLLL.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((Map.Entry) it2.next()).getKey());
                        }
                        if (C1209404oG.LIZ()) {
                            final Set setLJLIIL = C13LQ.LJLIIL(new EnumC1597060rf6[]{EnumC1597060rf6.LIVE, EnumC1597060rf6.STORY, EnumC1597060rf6.HIGHLIGHT, EnumC1597060rf6.THOUGHT});
                            interfaceC088400Uw4 = new InterfaceC088400Uw(arrayList, setLJLIIL) { // from class: X.00Ux
                                public final Set<EnumC1597060rf6> LIZ;
                                public final List<EnumC1597060rf6> LIZIZ;

                                public final boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (!(obj instanceof C088500Ux)) {
                                        return false;
                                    }
                                    C088500Ux c088500Ux = (C088500Ux) obj;
                                    return Intrinsics.LJFF(this.LIZ, c088500Ux.LIZ) && Intrinsics.LJFF(this.LIZIZ, c088500Ux.LIZIZ);
                                }

                                public final int hashCode() {
                                    return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
                                }

                                public final String toString() {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("KeepFetchOrderSortStrategy(mixRankBizes=");
                                    sbLIZ.append(this.LIZ);
                                    sbLIZ.append(", typePriority=");
                                    sbLIZ.append(this.LIZIZ);
                                    sbLIZ.append(')');
                                    return C2188811AlT.LIZIZ(sbLIZ);
                                }

                                {
                                    this.LIZ = setLJLIIL;
                                    this.LIZIZ = arrayList;
                                }

                                @Override // X.InterfaceC088400Uw
                                public final List LIZ(C1597350rfZ c1597350rfZ, List list, Map map) {
                                    Map mapLJ;
                                    int size;
                                    Map<String, Object> map2 = c1597350rfZ.LIZLLL.get(EnumC1597060rf6.STORY);
                                    Object obj = null;
                                    if (map2 != null) {
                                        obj = map2.get("mix_rank_scene_index_map");
                                    }
                                    if (!(obj instanceof Map) || (mapLJ = (Map) obj) == null) {
                                        mapLJ = C2097608Jq.LJ();
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<EnumC1597060rf6> it3 = this.LIZ.iterator();
                                    while (it3.hasNext()) {
                                        Object obj2 = (Collection) ((LinkedHashMap) map).get(it3.next());
                                        if (obj2 == null) {
                                            obj2 = C13BV.INSTANCE;
                                        }
                                        arrayList2.addAll(obj2);
                                    }
                                    List listLJLLLL2 = C13LP.LJLLLL(new C512301z7(c1597350rfZ, mapLJ, 3), arrayList2);
                                    Iterator<EnumC1597060rf6> it4 = this.LIZIZ.iterator();
                                    int i2 = 0;
                                    int i3 = 0;
                                    while (true) {
                                        if (it4.hasNext()) {
                                            if (this.LIZ.contains(it4.next())) {
                                                break;
                                            }
                                            i3++;
                                        } else {
                                            i3 = -1;
                                            break;
                                        }
                                    }
                                    Integer numValueOf = Integer.valueOf(i3);
                                    if (numValueOf.intValue() >= 0) {
                                        size = numValueOf.intValue();
                                    } else {
                                        size = this.LIZIZ.size();
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    for (EnumC1597060rf6 enumC1597060rf612 : this.LIZIZ) {
                                        int i4 = i2 + 1;
                                        if (i2 == size) {
                                            arrayList3.addAll(listLJLLLL2);
                                        }
                                        if (!this.LIZ.contains(enumC1597060rf612)) {
                                            Object obj3 = (Collection) ((LinkedHashMap) map).get(enumC1597060rf612);
                                            if (obj3 == null) {
                                                obj3 = C13BV.INSTANCE;
                                            }
                                            arrayList3.addAll(obj3);
                                        }
                                        i2 = i4;
                                    }
                                    if (size >= this.LIZIZ.size()) {
                                        arrayList3.addAll(listLJLLLL2);
                                    }
                                    for (Object obj4 : (ArrayList) list) {
                                        if (!this.LIZIZ.contains(obj4) && !this.LIZ.contains(obj4)) {
                                            Object obj5 = (Collection) ((LinkedHashMap) map).get(obj4);
                                            if (obj5 == null) {
                                                obj5 = C13BV.INSTANCE;
                                            }
                                            arrayList3.addAll(obj5);
                                        }
                                    }
                                    return arrayList3;
                                }
                            };
                        } else {
                            interfaceC088400Uw4 = new InterfaceC088400Uw(arrayList) { // from class: X.00Uv
                                public final List<EnumC1597060rf6> LIZ;

                                public final boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    return (obj instanceof C088300Uv) && Intrinsics.LJFF(this.LIZ, ((C088300Uv) obj).LIZ);
                                }

                                public final int hashCode() {
                                    return this.LIZ.hashCode();
                                }

                                public final String toString() {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("TypeBasedSortStrategy(typePriority=");
                                    sbLIZ.append(this.LIZ);
                                    sbLIZ.append(')');
                                    return C2188811AlT.LIZIZ(sbLIZ);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    this.LIZ = arrayList;
                                }

                                @Override // X.InterfaceC088400Uw
                                public final List LIZ(C1597350rfZ c1597350rfZ, List list, Map map) {
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<EnumC1597060rf6> it22 = this.LIZ.iterator();
                                    while (it22.hasNext()) {
                                        Object obj = (Collection) ((LinkedHashMap) map).get(it22.next());
                                        if (obj == null) {
                                            obj = C13BV.INSTANCE;
                                        }
                                        arrayList2.addAll(obj);
                                    }
                                    for (Object obj2 : (ArrayList) list) {
                                        if (!this.LIZ.contains(obj2)) {
                                            Object obj3 = (Collection) ((LinkedHashMap) map).get(obj2);
                                            if (obj3 == null) {
                                                obj3 = C13BV.INSTANCE;
                                            }
                                            arrayList2.addAll(obj3);
                                        }
                                    }
                                    return arrayList2;
                                }
                            };
                        }
                        c1596490reB = new C1596490reB(i, listLJIIJJI, new C1169404ho(Collections.singletonList(new C1157600gEI("inbox_default_stage", listLJIIJJI, null, 12))), interfaceC088400Uw4, mapLJIIIIZZ);
                    }
                } else {
                    EnumC1597060rf6 enumC1597060rf612 = EnumC1597060rf6.STORY;
                    EnumC1597060rf6 enumC1597060rf613 = EnumC1597060rf6.LIVE;
                    EnumC1597060rf6 enumC1597060rf614 = EnumC1597060rf6.LIVE_EVENT;
                    List listLJIIJJI2 = C1697810uHb.LJIIJJI(enumC1597060rf612, enumC1597060rf613, enumC1597060rf614);
                    final List listLJIIJJI3 = C1697810uHb.LJIIJJI(enumC1597060rf613, enumC1597060rf614, enumC1597060rf612);
                    int iLIZIZ = C1209404oG.LIZIZ();
                    if (iLIZIZ == 0 || (iLIZIZ != 1 && (iLIZIZ == 2 || iLIZIZ != 3))) {
                        interfaceC088400Uw3 = new InterfaceC088400Uw(listLJIIJJI3) { // from class: X.00Uv
                            public final List<EnumC1597060rf6> LIZ;

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return (obj instanceof C088300Uv) && Intrinsics.LJFF(this.LIZ, ((C088300Uv) obj).LIZ);
                            }

                            public final int hashCode() {
                                return this.LIZ.hashCode();
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("TypeBasedSortStrategy(typePriority=");
                                sbLIZ.append(this.LIZ);
                                sbLIZ.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                this.LIZ = listLJIIJJI3;
                            }

                            @Override // X.InterfaceC088400Uw
                            public final List LIZ(C1597350rfZ c1597350rfZ, List list, Map map) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<EnumC1597060rf6> it22 = this.LIZ.iterator();
                                while (it22.hasNext()) {
                                    Object obj = (Collection) ((LinkedHashMap) map).get(it22.next());
                                    if (obj == null) {
                                        obj = C13BV.INSTANCE;
                                    }
                                    arrayList2.addAll(obj);
                                }
                                for (Object obj2 : (ArrayList) list) {
                                    if (!this.LIZ.contains(obj2)) {
                                        Object obj3 = (Collection) ((LinkedHashMap) map).get(obj2);
                                        if (obj3 == null) {
                                            obj3 = C13BV.INSTANCE;
                                        }
                                        arrayList2.addAll(obj3);
                                    }
                                }
                                return arrayList2;
                            }
                        };
                    } else {
                        final Set setLJLIIL2 = C13LQ.LJLIIL(new EnumC1597060rf6[]{enumC1597060rf612, enumC1597060rf613});
                        interfaceC088400Uw3 = new InterfaceC088400Uw(listLJIIJJI3, setLJLIIL2) { // from class: X.00Ux
                            public final Set<EnumC1597060rf6> LIZ;
                            public final List<EnumC1597060rf6> LIZIZ;

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof C088500Ux)) {
                                    return false;
                                }
                                C088500Ux c088500Ux = (C088500Ux) obj;
                                return Intrinsics.LJFF(this.LIZ, c088500Ux.LIZ) && Intrinsics.LJFF(this.LIZIZ, c088500Ux.LIZIZ);
                            }

                            public final int hashCode() {
                                return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("KeepFetchOrderSortStrategy(mixRankBizes=");
                                sbLIZ.append(this.LIZ);
                                sbLIZ.append(", typePriority=");
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }

                            {
                                this.LIZ = setLJLIIL2;
                                this.LIZIZ = listLJIIJJI3;
                            }

                            @Override // X.InterfaceC088400Uw
                            public final List LIZ(C1597350rfZ c1597350rfZ, List list, Map map) {
                                Map mapLJ;
                                int size;
                                Map<String, Object> map2 = c1597350rfZ.LIZLLL.get(EnumC1597060rf6.STORY);
                                Object obj = null;
                                if (map2 != null) {
                                    obj = map2.get("mix_rank_scene_index_map");
                                }
                                if (!(obj instanceof Map) || (mapLJ = (Map) obj) == null) {
                                    mapLJ = C2097608Jq.LJ();
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<EnumC1597060rf6> it3 = this.LIZ.iterator();
                                while (it3.hasNext()) {
                                    Object obj2 = (Collection) ((LinkedHashMap) map).get(it3.next());
                                    if (obj2 == null) {
                                        obj2 = C13BV.INSTANCE;
                                    }
                                    arrayList2.addAll(obj2);
                                }
                                List listLJLLLL2 = C13LP.LJLLLL(new C512301z7(c1597350rfZ, mapLJ, 3), arrayList2);
                                Iterator<EnumC1597060rf6> it4 = this.LIZIZ.iterator();
                                int i2 = 0;
                                int i3 = 0;
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (this.LIZ.contains(it4.next())) {
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        i3 = -1;
                                        break;
                                    }
                                }
                                Integer numValueOf = Integer.valueOf(i3);
                                if (numValueOf.intValue() >= 0) {
                                    size = numValueOf.intValue();
                                } else {
                                    size = this.LIZIZ.size();
                                }
                                ArrayList arrayList3 = new ArrayList();
                                for (EnumC1597060rf6 enumC1597060rf6122 : this.LIZIZ) {
                                    int i4 = i2 + 1;
                                    if (i2 == size) {
                                        arrayList3.addAll(listLJLLLL2);
                                    }
                                    if (!this.LIZ.contains(enumC1597060rf6122)) {
                                        Object obj3 = (Collection) ((LinkedHashMap) map).get(enumC1597060rf6122);
                                        if (obj3 == null) {
                                            obj3 = C13BV.INSTANCE;
                                        }
                                        arrayList3.addAll(obj3);
                                    }
                                    i2 = i4;
                                }
                                if (size >= this.LIZIZ.size()) {
                                    arrayList3.addAll(listLJLLLL2);
                                }
                                for (Object obj4 : (ArrayList) list) {
                                    if (!this.LIZIZ.contains(obj4) && !this.LIZ.contains(obj4)) {
                                        Object obj5 = (Collection) ((LinkedHashMap) map).get(obj4);
                                        if (obj5 == null) {
                                            obj5 = C13BV.INSTANCE;
                                        }
                                        arrayList3.addAll(obj5);
                                    }
                                }
                                return arrayList3;
                            }
                        };
                    }
                    c1596490reB = new C1596490reB(i, listLJIIJJI2, new C1169404ho(Collections.singletonList(new C1157600gEI("main", listLJIIJJI2, EnumC1154780g9k.BATCH, 8))), interfaceC088400Uw3);
                }
            } else {
                EnumC1597060rf6 enumC1597060rf615 = EnumC1597060rf6.STORY;
                EnumC1597060rf6 enumC1597060rf616 = EnumC1597060rf6.LIVE;
                EnumC1597060rf6 enumC1597060rf617 = EnumC1597060rf6.LIVE_EVENT;
                List listLJIIJJI4 = C1697810uHb.LJIIJJI(enumC1597060rf615, enumC1597060rf616, enumC1597060rf617);
                final List listLJIIJJI5 = C1697810uHb.LJIIJJI(enumC1597060rf615, enumC1597060rf616, enumC1597060rf617);
                if (C1209404oG.LIZIZ() == 0) {
                    interfaceC088400Uw2 = new InterfaceC088400Uw(listLJIIJJI5) { // from class: X.00Uv
                        public final List<EnumC1597060rf6> LIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof C088300Uv) && Intrinsics.LJFF(this.LIZ, ((C088300Uv) obj).LIZ);
                        }

                        public final int hashCode() {
                            return this.LIZ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("TypeBasedSortStrategy(typePriority=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.LIZ = listLJIIJJI5;
                        }

                        @Override // X.InterfaceC088400Uw
                        public final List LIZ(C1597350rfZ c1597350rfZ, List list, Map map) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<EnumC1597060rf6> it22 = this.LIZ.iterator();
                            while (it22.hasNext()) {
                                Object obj = (Collection) ((LinkedHashMap) map).get(it22.next());
                                if (obj == null) {
                                    obj = C13BV.INSTANCE;
                                }
                                arrayList2.addAll(obj);
                            }
                            for (Object obj2 : (ArrayList) list) {
                                if (!this.LIZ.contains(obj2)) {
                                    Object obj3 = (Collection) ((LinkedHashMap) map).get(obj2);
                                    if (obj3 == null) {
                                        obj3 = C13BV.INSTANCE;
                                    }
                                    arrayList2.addAll(obj3);
                                }
                            }
                            return arrayList2;
                        }
                    };
                } else {
                    final Set setLJLIIL3 = C13LQ.LJLIIL(new EnumC1597060rf6[]{enumC1597060rf615, enumC1597060rf616});
                    interfaceC088400Uw2 = new InterfaceC088400Uw(listLJIIJJI5, setLJLIIL3) { // from class: X.00Ux
                        public final Set<EnumC1597060rf6> LIZ;
                        public final List<EnumC1597060rf6> LIZIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C088500Ux)) {
                                return false;
                            }
                            C088500Ux c088500Ux = (C088500Ux) obj;
                            return Intrinsics.LJFF(this.LIZ, c088500Ux.LIZ) && Intrinsics.LJFF(this.LIZIZ, c088500Ux.LIZIZ);
                        }

                        public final int hashCode() {
                            return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("KeepFetchOrderSortStrategy(mixRankBizes=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(", typePriority=");
                            sbLIZ.append(this.LIZIZ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            this.LIZ = setLJLIIL3;
                            this.LIZIZ = listLJIIJJI5;
                        }

                        @Override // X.InterfaceC088400Uw
                        public final List LIZ(C1597350rfZ c1597350rfZ, List list, Map map) {
                            Map mapLJ;
                            int size;
                            Map<String, Object> map2 = c1597350rfZ.LIZLLL.get(EnumC1597060rf6.STORY);
                            Object obj = null;
                            if (map2 != null) {
                                obj = map2.get("mix_rank_scene_index_map");
                            }
                            if (!(obj instanceof Map) || (mapLJ = (Map) obj) == null) {
                                mapLJ = C2097608Jq.LJ();
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<EnumC1597060rf6> it3 = this.LIZ.iterator();
                            while (it3.hasNext()) {
                                Object obj2 = (Collection) ((LinkedHashMap) map).get(it3.next());
                                if (obj2 == null) {
                                    obj2 = C13BV.INSTANCE;
                                }
                                arrayList2.addAll(obj2);
                            }
                            List listLJLLLL2 = C13LP.LJLLLL(new C512301z7(c1597350rfZ, mapLJ, 3), arrayList2);
                            Iterator<EnumC1597060rf6> it4 = this.LIZIZ.iterator();
                            int i2 = 0;
                            int i3 = 0;
                            while (true) {
                                if (it4.hasNext()) {
                                    if (this.LIZ.contains(it4.next())) {
                                        break;
                                    }
                                    i3++;
                                } else {
                                    i3 = -1;
                                    break;
                                }
                            }
                            Integer numValueOf = Integer.valueOf(i3);
                            if (numValueOf.intValue() >= 0) {
                                size = numValueOf.intValue();
                            } else {
                                size = this.LIZIZ.size();
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (EnumC1597060rf6 enumC1597060rf6122 : this.LIZIZ) {
                                int i4 = i2 + 1;
                                if (i2 == size) {
                                    arrayList3.addAll(listLJLLLL2);
                                }
                                if (!this.LIZ.contains(enumC1597060rf6122)) {
                                    Object obj3 = (Collection) ((LinkedHashMap) map).get(enumC1597060rf6122);
                                    if (obj3 == null) {
                                        obj3 = C13BV.INSTANCE;
                                    }
                                    arrayList3.addAll(obj3);
                                }
                                i2 = i4;
                            }
                            if (size >= this.LIZIZ.size()) {
                                arrayList3.addAll(listLJLLLL2);
                            }
                            for (Object obj4 : (ArrayList) list) {
                                if (!this.LIZIZ.contains(obj4) && !this.LIZ.contains(obj4)) {
                                    Object obj5 = (Collection) ((LinkedHashMap) map).get(obj4);
                                    if (obj5 == null) {
                                        obj5 = C13BV.INSTANCE;
                                    }
                                    arrayList3.addAll(obj5);
                                }
                            }
                            return arrayList3;
                        }
                    };
                }
                c1596490reB = new C1596490reB(i, listLJIIJJI4, new C1169404ho(Collections.singletonList(new C1157600gEI("main", listLJIIJJI4, EnumC1154780g9k.BATCH, 8))), interfaceC088400Uw2);
            }
        } else {
            EnumC1597060rf6 enumC1597060rf618 = EnumC1597060rf6.STORY;
            EnumC1597060rf6 enumC1597060rf619 = EnumC1597060rf6.LIVE;
            EnumC1597060rf6 enumC1597060rf620 = EnumC1597060rf6.LIVE_EVENT;
            List listLJIIJJI6 = C1697810uHb.LJIIJJI(enumC1597060rf618, enumC1597060rf619, enumC1597060rf620);
            final List listLJIIJJI7 = C1697810uHb.LJIIJJI(enumC1597060rf619, enumC1597060rf620, enumC1597060rf618);
            if (C1569180qw8.LIZ(i)) {
                final Set setLJLIIL4 = C13LQ.LJLIIL(new EnumC1597060rf6[]{enumC1597060rf618, enumC1597060rf619});
                interfaceC088400Uw = new InterfaceC088400Uw(listLJIIJJI7, setLJLIIL4) { // from class: X.00Ux
                    public final Set<EnumC1597060rf6> LIZ;
                    public final List<EnumC1597060rf6> LIZIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C088500Ux)) {
                            return false;
                        }
                        C088500Ux c088500Ux = (C088500Ux) obj;
                        return Intrinsics.LJFF(this.LIZ, c088500Ux.LIZ) && Intrinsics.LJFF(this.LIZIZ, c088500Ux.LIZIZ);
                    }

                    public final int hashCode() {
                        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("KeepFetchOrderSortStrategy(mixRankBizes=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(", typePriority=");
                        sbLIZ.append(this.LIZIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LIZ = setLJLIIL4;
                        this.LIZIZ = listLJIIJJI7;
                    }

                    @Override // X.InterfaceC088400Uw
                    public final List LIZ(C1597350rfZ c1597350rfZ, List list, Map map) {
                        Map mapLJ;
                        int size;
                        Map<String, Object> map2 = c1597350rfZ.LIZLLL.get(EnumC1597060rf6.STORY);
                        Object obj = null;
                        if (map2 != null) {
                            obj = map2.get("mix_rank_scene_index_map");
                        }
                        if (!(obj instanceof Map) || (mapLJ = (Map) obj) == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<EnumC1597060rf6> it3 = this.LIZ.iterator();
                        while (it3.hasNext()) {
                            Object obj2 = (Collection) ((LinkedHashMap) map).get(it3.next());
                            if (obj2 == null) {
                                obj2 = C13BV.INSTANCE;
                            }
                            arrayList2.addAll(obj2);
                        }
                        List listLJLLLL2 = C13LP.LJLLLL(new C512301z7(c1597350rfZ, mapLJ, 3), arrayList2);
                        Iterator<EnumC1597060rf6> it4 = this.LIZIZ.iterator();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            if (it4.hasNext()) {
                                if (this.LIZ.contains(it4.next())) {
                                    break;
                                }
                                i3++;
                            } else {
                                i3 = -1;
                                break;
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i3);
                        if (numValueOf.intValue() >= 0) {
                            size = numValueOf.intValue();
                        } else {
                            size = this.LIZIZ.size();
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (EnumC1597060rf6 enumC1597060rf6122 : this.LIZIZ) {
                            int i4 = i2 + 1;
                            if (i2 == size) {
                                arrayList3.addAll(listLJLLLL2);
                            }
                            if (!this.LIZ.contains(enumC1597060rf6122)) {
                                Object obj3 = (Collection) ((LinkedHashMap) map).get(enumC1597060rf6122);
                                if (obj3 == null) {
                                    obj3 = C13BV.INSTANCE;
                                }
                                arrayList3.addAll(obj3);
                            }
                            i2 = i4;
                        }
                        if (size >= this.LIZIZ.size()) {
                            arrayList3.addAll(listLJLLLL2);
                        }
                        for (Object obj4 : (ArrayList) list) {
                            if (!this.LIZIZ.contains(obj4) && !this.LIZ.contains(obj4)) {
                                Object obj5 = (Collection) ((LinkedHashMap) map).get(obj4);
                                if (obj5 == null) {
                                    obj5 = C13BV.INSTANCE;
                                }
                                arrayList3.addAll(obj5);
                            }
                        }
                        return arrayList3;
                    }
                };
            } else {
                interfaceC088400Uw = new InterfaceC088400Uw(listLJIIJJI7) { // from class: X.00Uv
                    public final List<EnumC1597060rf6> LIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C088300Uv) && Intrinsics.LJFF(this.LIZ, ((C088300Uv) obj).LIZ);
                    }

                    public final int hashCode() {
                        return this.LIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("TypeBasedSortStrategy(typePriority=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LIZ = listLJIIJJI7;
                    }

                    @Override // X.InterfaceC088400Uw
                    public final List LIZ(C1597350rfZ c1597350rfZ, List list, Map map) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<EnumC1597060rf6> it22 = this.LIZ.iterator();
                        while (it22.hasNext()) {
                            Object obj = (Collection) ((LinkedHashMap) map).get(it22.next());
                            if (obj == null) {
                                obj = C13BV.INSTANCE;
                            }
                            arrayList2.addAll(obj);
                        }
                        for (Object obj2 : (ArrayList) list) {
                            if (!this.LIZ.contains(obj2)) {
                                Object obj3 = (Collection) ((LinkedHashMap) map).get(obj2);
                                if (obj3 == null) {
                                    obj3 = C13BV.INSTANCE;
                                }
                                arrayList2.addAll(obj3);
                            }
                        }
                        return arrayList2;
                    }
                };
            }
            c1596490reB = new C1596490reB(i, listLJIIJJI6, new C1169404ho(Collections.singletonList(new C1157600gEI("main", listLJIIJJI6, EnumC1154780g9k.BATCH, 8))), interfaceC088400Uw);
        }
        C1596930ret c1596930ret = ((C1596910rer) C1596920res.LIZIZ.getValue()).LIZ;
        List<EnumC1597060rf6> list = c1596490reB.LIZIZ;
        c1596930ret.getClass();
        ArrayList<SkylightBiz> arrayList2 = new ArrayList();
        Iterator<EnumC1597060rf6> it3 = list.iterator();
        while (it3.hasNext()) {
            Object obj = ((Map) c1596930ret.LIZ.getValue()).get(it3.next());
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (SkylightBiz skylightBiz : arrayList2) {
            InterfaceC1596570reJ interfaceC1596570reJLIZIZ = skylightBiz.LIZIZ();
            linkedHashMap.put(skylightBiz.getBizType(), interfaceC1596570reJLIZIZ.LIZ(c1596490reB.LIZ));
            linkedHashMap2.put(skylightBiz.getBizType(), interfaceC1596570reJLIZIZ.LIZJ(c1596490reB.LIZ));
            linkedHashMap3.put(skylightBiz.getBizType(), interfaceC1596570reJLIZIZ.LIZIZ(c1596490reB.LIZ));
            linkedHashMap4.put(skylightBiz.getBizType(), new AwS603S0100000_24(skylightBiz, (SkylightBiz<InterfaceC1891350zJl>) 606));
        }
        C1160320gIg c1160320gIg = new C1160320gIg();
        C1597620rg0 c1597620rg0 = new C1597620rg0(c1596490reB.LIZJ, linkedHashMap);
        C1597340rfY c1597340rfY = new C1597340rfY(linkedHashMap2, c1596490reB.LIZLLL, c1160320gIg);
        C1597330rfX c1597330rfX = new C1597330rfX(c1160320gIg);
        for (Map.Entry entry : linkedHashMap3.entrySet()) {
            Object key = entry.getKey();
            for (C1597160rfG c1597160rfG : (List) entry.getValue()) {
                LinkedHashMap linkedHashMap5 = (LinkedHashMap) c1597330rfX.LIZIZ;
                Object linkedHashMap6 = linkedHashMap5.get(key);
                if (linkedHashMap6 == null) {
                    linkedHashMap6 = new LinkedHashMap();
                    linkedHashMap5.put(key, linkedHashMap6);
                }
                ((Map) linkedHashMap6).put(c1597160rfG.LIZ, c1597160rfG.LIZIZ);
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("register maintainer: bizType=");
                sbLIZ.append(key);
                sbLIZ.append(", intentClass=");
                sbLIZ.append(c1597160rfG.LIZ.LJI());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        for (InterfaceC1597700rg8 interfaceC1597700rg8 : linkedHashMap.values()) {
            if ((interfaceC1597700rg8 instanceof InterfaceC1597500rfo) && interfaceC1597700rg8 != null) {
                c13dvLIZIZ.add(interfaceC1597700rg8);
            }
        }
        for (InterfaceC1597360rfa interfaceC1597360rfa : linkedHashMap2.values()) {
            if ((interfaceC1597360rfa instanceof InterfaceC1597500rfo) && interfaceC1597360rfa != null) {
                c13dvLIZIZ.add(interfaceC1597360rfa);
            }
        }
        Iterator it4 = linkedHashMap3.values().iterator();
        while (it4.hasNext()) {
            Iterator it5 = ((List) it4.next()).iterator();
            while (it5.hasNext()) {
                Object obj2 = ((C1597160rfG) it5.next()).LIZIZ;
                if ((obj2 instanceof InterfaceC1597500rfo) && obj2 != null) {
                    c13dvLIZIZ.add(obj2);
                }
            }
        }
        C1597440rfi c1597440rfi = new C1597440rfi(c1597620rg0, c1597340rfY, c1597330rfX, linkedHashMap4, c1596490reB, C1697820uHc.LIZ(c13dvLIZIZ));
        for (InterfaceC1597700rg8 interfaceC1597700rg82 : linkedHashMap.values()) {
            if ((interfaceC1597700rg82 instanceof InterfaceC1596890rep) && (interfaceC1596890rep2 = (InterfaceC1596890rep) interfaceC1597700rg82) != null) {
                interfaceC1596890rep2.LIZIZ(c1597440rfi);
            }
        }
        Iterator it6 = linkedHashMap3.values().iterator();
        while (it6.hasNext()) {
            Iterator it7 = ((List) it6.next()).iterator();
            while (it7.hasNext()) {
                Object obj3 = ((C1597160rfG) it7.next()).LIZIZ;
                if ((obj3 instanceof InterfaceC1596890rep) && (interfaceC1596890rep = (InterfaceC1596890rep) obj3) != null) {
                    interfaceC1596890rep.LIZIZ(c1597440rfi);
                }
            }
        }
        return c1597440rfi;
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final InterfaceC1597070rf7 LJIIJJI(int i) {
        if (C1569180qw8.LIZ(i)) {
            return C1596960rew.LIZ;
        }
        return C1596710reX.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final boolean LJIIL(C19EG c19eg) {
        FeedSkylightContainerViewModel feedSkylightContainerViewModelLJI;
        if (c19eg == null || (feedSkylightContainerViewModelLJI = C1596560reI.LJI(0, c19eg)) == null) {
            return false;
        }
        return feedSkylightContainerViewModelLJI.wQ2();
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJIJJ(boolean z) {
        C1597740rgC.LIZ.getClass();
        C1597740rgC.LJI = z;
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJIL(String str) {
        C1597740rgC.LIZ.getClass();
        C1597740rgC.LJII = str;
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJJIFFI(SocialFriendsFeedFragment socialFriendsFeedFragment) {
        FeedSkylightContainerViewModel feedSkylightContainerViewModelLJFF = C1596560reI.LJFF(0, socialFriendsFeedFragment);
        if (feedSkylightContainerViewModelLJFF == null || !feedSkylightContainerViewModelLJFF.xQ2()) {
            return;
        }
        feedSkylightContainerViewModelLJFF.setState(AFwS264S0000000_24.get$arr$(651));
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final boolean LJJII(Fragment fragment) {
        FeedSkylightListViewModel feedSkylightListViewModelLJJIJL = LJJIJL(0, fragment);
        if (feedSkylightListViewModelLJJIJL != null) {
            return feedSkylightListViewModelLJJIJL.isDataEmpty();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJJIIZI(C19EG c19eg) {
        FeedSkylightContainerViewModel feedSkylightContainerViewModelLJI;
        if (c19eg != null && (feedSkylightContainerViewModelLJI = C1596560reI.LJI(0, c19eg)) != null) {
            feedSkylightContainerViewModelLJI.BQ2(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final int LJJIJ(Fragment fragment) {
        ?? arrayList;
        String strLJIIIZ;
        C1596360rdy c1596360rdy;
        Aweme aweme;
        Fragment fragment2 = fragment;
        try {
            AwS62S0001000_24 awS62S0001000_24 = new AwS62S0001000_24(1);
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightListViewModel.class);
            AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(5);
            C451460Hn6 c451460Hn6 = new C451460Hn6(fragment2, false);
            C451620HnM c451620HnM = new C451620HnM(fragment2, true);
            C338520DOw c338520DOw = new C338520DOw(fragment2);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment2);
            if (!(fragment2 instanceof HasDefaultViewModelProviderFactory)) {
                fragment2 = null;
            }
            List<InterfaceC1891350zJl> listListGetAll = ((FeedSkylightListViewModel) new C736950SvV(c19719912DlLIZ, awS62S0001000_24, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(fragment2), aFwS264S0000000_24, c451460Hn6, c451620HnM, c338520DOw).getValue()).listGetAll();
            if (listListGetAll != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listListGetAll, 10));
                for (InterfaceC1891350zJl interfaceC1891350zJl : listListGetAll) {
                    if ((interfaceC1891350zJl instanceof C1596360rdy) && (c1596360rdy = (C1596360rdy) interfaceC1891350zJl) != null && (aweme = c1596360rdy.LLILLJJLI) != null) {
                        strLJIIIZ = C729510SjV.LJIIIZ(aweme);
                    } else {
                        strLJIIIZ = null;
                    }
                    arrayList2.add(strLJIIIZ);
                }
                arrayList = new ArrayList();
                for (Object obj : arrayList2) {
                    if (!C729510SjV.LJIILJJIL((String) obj)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            if (arrayList.isEmpty()) {
                return 2;
            }
            if (arrayList.isEmpty()) {
                return 0;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (C1605650rsx.LIZIZ.LJIIZILJ(EnumC1615506Uf.STORY, (String) it2.next()) == 1) {
                    return 1;
                }
            }
            return 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return -1;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJJIJIIJI(C19EG c19eg) {
        C20673215v0.LJI(R.layout.c77, c19eg);
        C20673215v0.LJI(R.layout.c79, c19eg);
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LIZ(Context context, List<FollowingInterestUser> list) {
        long jLongValue;
        List<String> arrayList;
        int size;
        String nickname;
        String next;
        SlimRoom.LinkMic linkMic;
        List<User> list2;
        User user;
        SlimRoom.LinkMic linkMic2;
        List<User> list3;
        Long lLJIILIIL;
        C1597740rgC.LIZ.getClass();
        C1597740rgC.LJIILL = list;
        C0J9A c0j9aV3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3();
        ArrayList arrayList2 = new ArrayList();
        int size2 = list.size();
        if (size2 > 4) {
            size2 = 4;
        }
        Gson gsonLIZIZ = C08JS.LIZIZ();
        for (int i = 0; i < size2; i++) {
            FollowingInterestUser followingInterestUser = (FollowingInterestUser) ListProtector.get(list, i);
            long j = followingInterestUser.getUser().roomId;
            c0j9aV3.LJIL(i, j, GsonProtectorUtils.toJson(gsonLIZIZ, followingInterestUser));
            String uid = followingInterestUser.getUser().getUid();
            if (uid != null && (lLJIILIIL = C2095008Iq.LJIILIIL(uid)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            UrlModel avatarThumb = followingInterestUser.getUser().getAvatarThumb();
            if (avatarThumb == null || (arrayList = avatarThumb.getUrlList()) == null) {
                arrayList = new ArrayList<>();
            }
            SlimRoom slimRoomLJII = C1597740rgC.LJII(followingInterestUser);
            if (slimRoomLJII != null && (linkMic2 = slimRoomLJII.getLinkMic()) != null && (list3 = linkMic2.followedList) != null) {
                size = list3.size();
            } else {
                size = 0;
            }
            if (size >= 2) {
                if (slimRoomLJII == null || (linkMic = slimRoomLJII.getLinkMic()) == null || (list2 = linkMic.followedList) == null || (user = (User) ListProtector.get(list2, 0)) == null) {
                    nickname = "";
                } else {
                    C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
                    String username = user.getUsername();
                    String nickName = user.getNickName();
                    c1243240iSQ.getClass();
                    nickname = C1243240iSQ.LIZLLL(username, nickName);
                }
            } else {
                C1243240iSQ c1243240iSQ2 = C1243240iSQ.LIZ;
                com.ss.android.ugc.aweme.profile.model.User user2 = followingInterestUser.getUser();
                c1243240iSQ2.getClass();
                nickname = user2.getNickname();
                if (nickname == null) {
                    nickname = "";
                }
            }
            String str = followingInterestUser.getUser().signature;
            if (str == null) {
                str = "";
            }
            Iterator<String> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = "";
                    break;
                } else {
                    next = it2.next();
                    if (!TextUtils.isEmpty(next)) {
                        break;
                    }
                }
            }
            arrayList2.add(new C0KZ1(j, jLongValue, next, nickname, str));
        }
        c0j9aV3.LJJIIJ(size2, context, arrayList2);
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LIZLLL(Fragment fragment, C1594370ral c1594370ral) {
        FeedSkylightContainerViewModel feedSkylightContainerViewModelLJFF = C1596560reI.LJFF(1, fragment);
        if (feedSkylightContainerViewModelLJFF == null) {
            return;
        }
        ((ArrayList) feedSkylightContainerViewModelLJFF.LLJ).add(c1594370ral);
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJ(int i, List<? extends InterfaceC1891350zJl> list) {
        InterfaceC1891350zJl next;
        String str;
        C1596130rdb.LIZ.getClass();
        C1596120rda c1596120rdaLJFF = C1596130rdb.LJFF(i);
        if (c1596120rdaLJFF != null) {
            C1596510reD c1596510reD = new C1596510reD(c1596120rdaLJFF);
            Iterator<? extends InterfaceC1891350zJl> it2 = list.iterator();
            while (true) {
                next = null;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
                if ((next instanceof InterfaceC714040Rze) && C703302op.LIZ((String) c1596510reD.invoke(next))) {
                    break;
                }
            }
            if ((next instanceof InterfaceC714040Rze) && next != null && (str = (String) c1596510reD.invoke(next)) != null) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("saveFirstRequestIdFromCache, reqId: ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                c1596120rdaLJFF.LJIILLIIL = str;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJI(Fragment fragment, boolean z) {
        FeedSkylightContainerViewModel feedSkylightContainerViewModelLJFF = C1596560reI.LJFF(2, fragment);
        if (feedSkylightContainerViewModelLJFF != null) {
            feedSkylightContainerViewModelLJFF.setState(new AwS36S0010000_24(z, 25));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJIILIIL(SocialFriendsFeedFragment socialFriendsFeedFragment, boolean z) {
        FeedSkylightContainerViewModel feedSkylightContainerViewModelLJFF = C1596560reI.LJFF(0, socialFriendsFeedFragment);
        if (feedSkylightContainerViewModelLJFF != null) {
            feedSkylightContainerViewModelLJFF.LLILZLL = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final boolean LJIIZILJ(int i, String str) {
        try {
            StoryMuteResponse storyMuteResponse = C1596470re9.LIZ().LIZJ(str, i).execute().LIZIZ;
            if (storyMuteResponse != null && storyMuteResponse.getCode() == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJIJI(int i, boolean z) {
        C1596130rdb.LIZ.getClass();
        C1596120rda c1596120rda = (C1596120rda) C1596130rdb.LIZLLL().get(Integer.valueOf(i));
        if (c1596120rda != null) {
            c1596120rda.LJFF = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final C1595770rd1 LJJI(int i, C19EG c19eg) {
        C1595770rd1 c1595770rd1;
        FeedSkylightContainerViewModel feedSkylightContainerViewModelLJI = C1596560reI.LJI(i, c19eg);
        if (feedSkylightContainerViewModelLJI != null && (c1595770rd1 = feedSkylightContainerViewModelLJI.LLILZ) != null) {
            return new C1595770rd1(c1595770rd1.LIZ, c1595770rd1.LIZIZ);
        }
        return new C1595770rd1(false, "");
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final boolean LJJIII(int i, String str) {
        try {
            StoryMuteResponse storyMuteResponse = C1596470re9.LIZ().LIZLLL(str, i).execute().LIZIZ;
            if (storyMuteResponse != null && storyMuteResponse.getCode() == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final boolean LJJIIJ(int i, C19EG c19eg) {
        FeedSkylightContainerViewModel feedSkylightContainerViewModelLJI;
        if (c19eg != null && (feedSkylightContainerViewModelLJI = C1596560reI.LJI(i, c19eg)) != null) {
            return feedSkylightContainerViewModelLJI.xQ2();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final FeedSkylightListViewModel LJJIJL(int i, Fragment fragment) {
        try {
            AwS62S0001000_24 awS62S0001000_24 = new AwS62S0001000_24(i, 0);
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightListViewModel.class);
            AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(4);
            C451460Hn6 c451460Hn6 = new C451460Hn6(fragment, false);
            C451620HnM c451620HnM = new C451620HnM(fragment, true);
            C338520DOw c338520DOw = new C338520DOw(fragment);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
            if (!(fragment instanceof HasDefaultViewModelProviderFactory)) {
                fragment = null;
            }
            return (FeedSkylightListViewModel) new C736950SvV(c19719912DlLIZ, awS62S0001000_24, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(fragment), aFwS264S0000000_24, c451460Hn6, c451620HnM, c338520DOw).getValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final boolean LJJIL(int i, Fragment fragment) {
        FeedSkylightContainerViewModel feedSkylightContainerViewModelLJFF = C1596560reI.LJFF(i, fragment);
        if (feedSkylightContainerViewModelLJFF != null) {
            return feedSkylightContainerViewModelLJFF.vQ2();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJJIZ(Fragment fragment, C1594370ral c1594370ral) {
        FeedSkylightContainerViewModel feedSkylightContainerViewModelLJFF = C1596560reI.LJFF(1, fragment);
        if (feedSkylightContainerViewModelLJFF == null) {
            return;
        }
        ((ArrayList) feedSkylightContainerViewModelLJFF.LLJ).remove(c1594370ral);
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJIILLIIL(String str, Throwable th, Map<String, String> map) {
        C1597470rfl.LIZ(str, th, map);
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJJ(Fragment fragment, List list, C1600320rkM c1600320rkM) {
        try {
            AwS62S0001000_24 awS62S0001000_24 = new AwS62S0001000_24(2);
            boolean z = false;
            FeedSkylightListViewModel feedSkylightListViewModel = (FeedSkylightListViewModel) new C736950SvV(C13LE.LIZ(FeedSkylightListViewModel.class), awS62S0001000_24, new C452070Ho5(), C724750Sbp.LJII(fragment), C1220000hqw.LIZ(fragment), AFwS264S0000000_24.get$arr$(6), new C451460Hn6(fragment, false), new C451620HnM(fragment, true), new C338520DOw(fragment)).getValue();
            C1596130rdb c1596130rdb = C1596130rdb.LIZ;
            int iHQ2 = feedSkylightListViewModel.HQ2();
            c1596130rdb.getClass();
            if (!C1596130rdb.LJIIIIZZ(iHQ2) && !feedSkylightListViewModel.LLL) {
                feedSkylightListViewModel.LLJLLL.compareAndSet(false, true);
                if (C596340NaC.LIZIZ().pagedReadPageCount > 0) {
                    z = true;
                }
                feedSkylightListViewModel.DQ2(list, true);
                feedSkylightListViewModel.WQ2(new AwS87S0210000_2(feedSkylightListViewModel, (FeedSkylightListViewModel) list, (List<? extends InterfaceC1891350zJl>) z, true));
                c1600320rkM.invoke();
            } else {
                c1600320rkM.invoke();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJJIIJZLJL(int i, Fragment fragment, boolean z) {
        FeedSkylightContainerViewModel feedSkylightContainerViewModelLJFF = C1596560reI.LJFF(i, fragment);
        if (feedSkylightContainerViewModelLJFF != null) {
            feedSkylightContainerViewModelLJFF.BQ2(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJIIJ(Fragment fragment, String str, int i, InsertStory insertStory) {
        FeedSkylightContainerViewModel feedSkylightContainerViewModelLJFF;
        if ((!C0IVP.LIZ() || i == 1) && (feedSkylightContainerViewModelLJFF = C1596560reI.LJFF(i, fragment)) != null) {
            C1595180rc4 c1595180rc4 = new C1595180rc4(0);
            feedSkylightContainerViewModelLJFF.LL = str;
            feedSkylightContainerViewModelLJFF.setState(new AwS107S1200000_24(str, c1595180rc4, insertStory, 3));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJIILJJIL(Fragment fragment, String str, C1595180rc4 c1595180rc4, InsertStory insertStory) {
        FeedSkylightContainerViewModel feedSkylightContainerViewModelLJFF;
        if (!C0IVP.LIZ() && (feedSkylightContainerViewModelLJFF = C1596560reI.LJFF(2, fragment)) != null) {
            feedSkylightContainerViewModelLJFF.LL = str;
            feedSkylightContainerViewModelLJFF.setState(new AwS107S1200000_24(str, c1595180rc4, insertStory, 3));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJJIIZ(BaseDetailShareVM baseDetailShareVM, StoryImmersiveUserFeedComponent storyImmersiveUserFeedComponent, AwS590S0100000_11 awS590S0100000_11, Function0 function0, Function1 function1) {
        if ((baseDetailShareVM instanceof FeedSkylightListViewModel) && baseDetailShareVM != null) {
            baseDetailShareVM.asyncSubscribe(new C2217381BqS() { // from class: X.0r0s
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C1573030r2L c1573030r2L = (C1573030r2L) obj;
                    c1573030r2L.getClass();
                    return C627260Oiy.LIZJ(c1573030r2L);
                }
            }, storyImmersiveUserFeedComponent, C736820SvI.LIZLLL(), function1, function0, awS590S0100000_11);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final void LJIILL(Fragment fragment, boolean z, String str, int i, boolean z2, boolean z3, String str2) {
        IViewPagerComponentAbility iViewPagerComponentAbilityLIZLLL;
        Aweme awemeLJIIIIZZ;
        String awesomeSplashId;
        AwemeSplashInfo splashInfo;
        AwemeSplashInfo splashInfo2;
        Fragment fragment2 = fragment;
        FeedSkylightContainerViewModel feedSkylightContainerViewModelLJFF = C1596560reI.LJFF(i, fragment2);
        if (feedSkylightContainerViewModelLJFF == null) {
            return;
        }
        Boolean boolValueOf = null;
        boolean zLJIILIIL = false;
        if (z) {
            if (!feedSkylightContainerViewModelLJFF.wQ2()) {
                feedSkylightContainerViewModelLJFF.BQ2(true);
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("toggleSkylightListShowStatus: open skylight, enterMethod: ");
            sbLIZ.append(str);
            sbLIZ.append(", scene: ");
            sbLIZ.append(i);
            sbLIZ.append(", needAnimation: ");
            sbLIZ.append(z2);
            C1720106oR.LJI("FSCommonServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModelLJFF, true, str, z2, false, false, str2, 24);
            feedSkylightContainerViewModelLJFF.zQ2(false, true);
            if (z3) {
                try {
                    C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightListViewModel.class);
                    AwS62S0001000_24 awS62S0001000_24 = new AwS62S0001000_24(i, 7);
                    AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(611);
                    C451460Hn6 c451460Hn6 = new C451460Hn6(fragment2, false);
                    C451620HnM c451620HnM = new C451620HnM(fragment2, true);
                    C338520DOw c338520DOw = new C338520DOw(fragment2);
                    C452070Ho5 c452070Ho5 = new C452070Ho5();
                    C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment2);
                    if (!(fragment2 instanceof HasDefaultViewModelProviderFactory)) {
                        fragment2 = null;
                    }
                    FeedSkylightListViewModel feedSkylightListViewModel = (FeedSkylightListViewModel) new C736950SvV(c19719912DlLIZ, awS62S0001000_24, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(fragment2), aFwS264S0000000_24, c451460Hn6, c451620HnM, c338520DOw).getValue();
                    if (feedSkylightListViewModel != null) {
                        feedSkylightListViewModel.sA1(0, null, false, false);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    return;
                }
            }
            return;
        }
        if (feedSkylightContainerViewModelLJFF.xQ2()) {
            if (i == 1 && (iViewPagerComponentAbilityLIZLLL = C0T1R.LIZLLL(fragment2)) != null && (awemeLJIIIIZZ = iViewPagerComponentAbilityLIZLLL.LJIIIIZZ()) != null && (zLJIILIIL = C1030680cva.LJIILIIL(awemeLJIIIIZZ))) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("shouldIgnoreCleanMode ignores clean mode, aweme id: ");
                sbLIZ2.append(awemeLJIIIIZZ.getAid());
                sbLIZ2.append(", aweme is ad: ");
                sbLIZ2.append(awemeLJIIIIZZ.isAd());
                sbLIZ2.append(", aweme splash id: ");
                AwemeRawAd awemeRawAd = awemeLJIIIIZZ.getAwemeRawAd();
                if (awemeRawAd != null && (splashInfo2 = awemeRawAd.getSplashInfo()) != null) {
                    awesomeSplashId = splashInfo2.getAwesomeSplashId();
                } else {
                    awesomeSplashId = null;
                }
                sbLIZ2.append(awesomeSplashId);
                sbLIZ2.append(", aweme splash is shown: ");
                AwemeRawAd awemeRawAd2 = awemeLJIIIIZZ.getAwemeRawAd();
                if (awemeRawAd2 != null && (splashInfo = awemeRawAd2.getSplashInfo()) != null) {
                    boolValueOf = Boolean.valueOf(splashInfo.isShown());
                }
                sbLIZ2.append(boolValueOf);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                int i3 = C2187451AjH.LIZ;
                C1720106oR.LJI("FSCommonServiceImpl", strLIZIZ);
                Npth.reportBizException("FSCommonServiceImpl", new Throwable(strLIZIZ), strLIZIZ, (Map<String, String>) C2097608Jq.LJ(), true);
            }
            boolean z4 = !zLJIILIIL;
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("toggleSkylightListShowStatus: close skylight, enterMethod: ");
            sbLIZ3.append(str);
            sbLIZ3.append(", scene: ");
            sbLIZ3.append(i);
            sbLIZ3.append(", needAnimation: ");
            sbLIZ3.append(z2);
            sbLIZ3.append(", ignoreCleanMode: ");
            sbLIZ3.append(z4);
            C1720106oR.LJI("FSCommonServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
            FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModelLJFF, false, str, z2, false, z4, str2, 8);
            feedSkylightContainerViewModelLJFF.zQ2(true, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final C11NZ<MixRankSkylightResponse> LJIIIZ(long j, List<Integer> list, Long l, String str, InsertStory insertStory, int i, int i2, int i3, Map<String, String> map, Map<String, Long> map2) {
        Object c098200Yq;
        String str2;
        Object obj = null;
        try {
            c098200Yq = C23265099r.LIZ(new C1303270k1F(LIZIZ(j, list, l, str, insertStory, i, i2, i3, map, null, null, map2, 0), null));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            switch (C1596530reF.LIZ[C728840SiQ.LIZIZ(Long.valueOf(j)).ordinal()]) {
                case 1:
                    str2 = "homepage_hot";
                    break;
                case 2:
                    str2 = "homepage_follow";
                    break;
                case 3:
                    str2 = "homepage_friends";
                    break;
                case 4:
                    str2 = "notification_page";
                    break;
                case 5:
                    str2 = "fyp_card";
                    break;
                case 6:
                    str2 = "chat_list";
                    break;
                default:
                    str2 = "";
                    break;
            }
            C1597470rfl.LIZ(str2, thM5exceptionOrNullimpl, C2097608Jq.LJIIIIZZ(new Pair("pull_type", String.valueOf(i3)), new Pair("checkpoint", "FSCommonServiceImpl#fetchMixRankSkylightDataObservable"), new Pair("api_path", "skylight/feed")));
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        C11NZ<MixRankSkylightResponse> c11nz = (C11NZ) obj;
        if (c11nz == null) {
            return C11IR.LL;
        }
        return c11nz;
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final C19482711Kf LJIJ(long j, Long l, String str, EnumC1596540reG enumC1596540reG, int i, int i2, Boolean bool, int i3, int i4, Long l2, Long l3, String str2) {
        return C23265099r.LIZ(new C1303260k1E(this, j, l, str, enumC1596540reG, i, i2, bool, i3, i4, l2, l3, str2, null));
    }

    public static MixRankSkylightRequest LIZIZ(long j, List list, Long l, String str, InsertStory insertStory, int i, int i2, int i3, Map map, Integer num, Integer num2, Map map2, int i4) {
        StoryGuideCardInfo storyGuideCardInfoLIZIZ;
        MixRanSkylightStoryBizParams mixRanSkylightStoryBizParams;
        MixRanSkylightLiveBizParams mixRanSkylightLiveBizParams;
        long jLongValue;
        int iIntValue;
        int i5;
        Long lValueOf;
        Object c098200Yq;
        String str2;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        int friendCount;
        com.ss.android.ugc.aweme.profile.model.User curUser;
        int followingCount;
        com.ss.android.ugc.aweme.profile.model.User curUser2;
        ClientControlParams clientControlParams;
        Long lValueOf2;
        Long lValueOf3;
        boolean z;
        boolean z2;
        boolean z3;
        Boolean bool;
        boolean zLJFF = Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE);
        InterfaceC718030SEn interfaceC718030SEnLJJIJIIJIL = C1618440sDa.LIZIZ.LJJIJIIJIL();
        Map mapLIZJ = null;
        if (interfaceC718030SEnLJJIJIIJIL != null) {
            storyGuideCardInfoLIZIZ = interfaceC718030SEnLJJIJIIJIL.LIZIZ();
        } else {
            storyGuideCardInfoLIZIZ = null;
        }
        ArrayList arrayList = new ArrayList();
        if (insertStory != null || storyGuideCardInfoLIZIZ != null) {
            arrayList.add(new MixRankSkylightInsertParams(null, insertStory, null, storyGuideCardInfoLIZIZ));
        }
        MixRankSkylightCommonBizParams mixRankSkylightCommonBizParams = new MixRankSkylightCommonBizParams(zLJFF, i2, i3, 0);
        if (list.contains(1)) {
            if (num != null) {
                friendCount = num.intValue();
            } else {
                IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
                if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null) {
                    friendCount = curUser.getFriendCount();
                } else {
                    friendCount = 0;
                }
            }
            if (num2 != null) {
                followingCount = num2.intValue();
            } else {
                IAccountUserService iAccountUserServiceLJFF2 = C0XQ7.LJFF();
                if (iAccountUserServiceLJFF2 != null && (curUser2 = ((AbstractC848400XPy) iAccountUserServiceLJFF2).getCurUser()) != null) {
                    followingCount = curUser2.getFollowingCount();
                } else {
                    followingCount = 0;
                }
            }
            EnumC1596540reG enumC1596540reG = EnumC1596540reG.INBOX_TAB;
            if (j == enumC1596540reG.getValue()) {
                if (C1203304nH.LIZJ() != 1 && C1203304nH.LIZJ() != 4) {
                    z = false;
                } else {
                    z = true;
                }
                boolean zLIZ = C1599090riN.LIZ();
                if (z && zLIZ) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zLIZ2 = C1203304nH.LIZ();
                if (!z2 && !zLIZ2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    bool = Boolean.FALSE;
                } else {
                    bool = null;
                }
                Boolean boolValueOf = Boolean.valueOf(z3);
                C728010Sh5.LIZ.getClass();
                clientControlParams = new ClientControlParams(bool, boolValueOf, null, Boolean.valueOf(C728010Sh5.LIZIZ()));
            } else {
                boolean zLIZ3 = C1203304nH.LIZ();
                if (zLIZ3) {
                    clientControlParams = new ClientControlParams(Boolean.FALSE, Boolean.valueOf(zLIZ3), null, null);
                } else {
                    clientControlParams = null;
                }
            }
            int i6 = 0;
            ISkylightMafService iSkylightMafService = (ISkylightMafService) PluggableExtentionKt.pluggableSpi$default(ISkylightMafService.class, false, false, false, 14, null);
            if (iSkylightMafService != null && iSkylightMafService.LIZIZ(j)) {
                i6 = 1;
            }
            if (j == enumC1596540reG.getValue() && C1599090riN.LIZ()) {
                lValueOf2 = Long.valueOf(C1599090riN.LIZIZ().maxPackUserStoryCount);
            } else {
                lValueOf2 = null;
            }
            IStoryRevealService iStoryRevealService = (IStoryRevealService) PluggableExtentionKt.pluggableSpi$default(IStoryRevealService.class, false, false, false, 14, null);
            if (iStoryRevealService != null) {
                lValueOf3 = Long.valueOf(iStoryRevealService.LJIIIZ());
            } else {
                lValueOf3 = null;
            }
            mixRanSkylightStoryBizParams = new MixRanSkylightStoryBizParams(i, friendCount, followingCount, clientControlParams, null, lValueOf2, i6, i4, lValueOf3);
        } else {
            mixRanSkylightStoryBizParams = null;
        }
        if (list.contains(2)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
                C844470XAv.LIZ.getClass();
                Map<String, String> mapLLIFFJFJJ = interfaceC20673515v3K4.LLIFFJFJJ(C844470XAv.LIZ());
                if (mapLLIFFJFJJ != null) {
                    linkedHashMap.putAll(mapLLIFFJFJJ);
                }
            }
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            if (!linkedHashMap.containsKey("is_non_personalized")) {
                if (zLJFF) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_non_personalized", str2);
            }
            try {
                C1227904rF.LIZ.getClass();
                c098200Yq = C1227904rF.LJI(linkedHashMap);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            mixRanSkylightLiveBizParams = new MixRanSkylightLiveBizParams((String) c098200Yq);
        } else {
            mixRanSkylightLiveBizParams = null;
        }
        if (l != null) {
            jLongValue = l.longValue();
        } else if (i3 == EnumC1582650rHr.REFRESH.getType() && str == null) {
            if (j == EnumC1596540reG.FYP_TAB.getValue()) {
                iIntValue = ((Number) C287110BNd.LIZ.getValue()).intValue();
            } else {
                iIntValue = ((Number) C0BNW.LIZ.getValue()).intValue();
            }
            jLongValue = iIntValue;
        } else {
            jLongValue = ((Number) C0BKI.LIZ.getValue()).longValue();
        }
        if (map2 == null) {
            if (j == EnumC1596540reG.INBOX_TAB.getValue() && C1599090riN.LIZ() && (i5 = C1599090riN.LIZIZ().maxStoryTotalCount) > 0 && (lValueOf = Long.valueOf(i5)) != null) {
                mapLIZJ = C2097908Jt.LIZJ(new Pair("1", lValueOf));
            }
        } else {
            mapLIZJ = map2;
        }
        return new MixRankSkylightRequest(Collections.singletonList(new MixRankSkylightSceneRequest(j, jLongValue, list, arrayList, str, mapLIZJ)), new MixRankSkylightBizParams(mixRankSkylightCommonBizParams, mixRanSkylightStoryBizParams, mixRanSkylightLiveBizParams));
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final Object LJJIJIIJIL(long j, List list, Long l, String str, InsertStory insertStory, int i, int i2, int i3, Map map, Integer num, Integer num2, boolean z, Map map2, AbstractC23140094w abstractC23140094w) {
        int i4 = 0;
        if (str != null && str.length() != 0) {
            i4 = z ? 2 : 1;
        }
        return C1596430re5.LIZ.LJ(LIZIZ(j, list, l, str, insertStory, i, i2, i3, map, num, num2, map2, i4), null, abstractC23140094w);
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightCommonService
    public final Object LJJJ(long j, Long l, String str, EnumC1596540reG enumC1596540reG, int i, int i2, Boolean bool, int i3, int i4, String str2, Long l2, Long l3, String str3, InterfaceC1364105Vn<? super StoryGetFeedByPageResponse> interfaceC1364105Vn) {
        boolean zLJI = MethodIDManager.LJI(137269);
        Object objLJFF = C1596430re5.LIZ.LJFF(j, l, str, enumC1596540reG, i4, i, i2, bool, i3, str2, null, l2, l3, str3, interfaceC1364105Vn);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return objLJFF;
    }
}
