package com.ss.android.ugc.aweme.friendstab.service;

import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.C03H5;
import X.C04TD;
import X.C08JS;
import X.C098200Yq;
import X.C09JN;
import X.C0AIQ;
import X.C0C64;
import X.C0NMA;
import X.C0NMB;
import X.C0PEM;
import X.C0RF0;
import X.C0SE9;
import X.C0SZ8;
import X.C0SZL;
import X.C0TRR;
import X.C0WHU;
import X.C0XQ7;
import X.C1073840e3C;
import X.C11NZ;
import X.C11S5;
import X.C128Y;
import X.C1323205Fu;
import X.C1323405Fw;
import X.C1388190mED;
import X.C1392890mLn;
import X.C1393010mLz;
import X.C1393110mM9;
import X.C1393140mMC;
import X.C1393160mME;
import X.C1393190mMH;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1402170mal;
import X.C1402330mb1;
import X.C1516430pZ3;
import X.C1558360qeg;
import X.C1582120rH0;
import X.C1583440rJ8;
import X.C1583510rJF;
import X.C1585030rLh;
import X.C1585070rLl;
import X.C1586580rOC;
import X.C1587200rPC;
import X.C1587360rPS;
import X.C1587370rPT;
import X.C1587390rPV;
import X.C1587420rPY;
import X.C1587490rPf;
import X.C1587500rPg;
import X.C1587540rPk;
import X.C1587620rPs;
import X.C1587740rQ4;
import X.C1589640rT8;
import X.C1595430rcT;
import X.C15WT;
import X.C1601240rlq;
import X.C1604710rrR;
import X.C1701940uOG;
import X.C189200o6;
import X.C1906580ziK;
import X.C19EG;
import X.C1DFH;
import X.C20673215v0;
import X.C2107308Nj;
import X.C21146717pB;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2344809Gs;
import X.C296430Bjd;
import X.C310660CFs;
import X.C343710Ddh;
import X.C343780Ddo;
import X.C728840SiQ;
import X.C729510SjV;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC1392960mLu;
import X.EnumC1393020mM0;
import X.EnumC1584360rKc;
import X.EnumC1586890rOh;
import X.EnumC1587000rOs;
import X.EnumC308700C8e;
import X.InterfaceC1392880mLm;
import X.InterfaceC1587410rPX;
import X.InterfaceC1587510rPh;
import X.InterfaceC1593630rZZ;
import X.InterfaceC691450RAh;
import Y.AfS100S0300000_2;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.hox.Hox;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedInsertRelationManager;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedListApi;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.friendstab.educate.BackToFYPGuideAssem;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabLocalCacheConfig;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import com.ss.android.ugc.aweme.friendstab.guidecard.ui.FriendsFYPGuideCardViewHolder;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.router.FriendsFeedRouterInterceptor;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import com.ss.android.ugc.aweme.homepage.IFriendTabExpApi;
import com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.INearbyFeedService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS94S0500000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsFeedServiceImpl implements IFriendsFeedService, IFriendTabExpApi {
    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> Y1() {
        return C13LE.LIZ(BackToFYPGuideAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean u2() {
        boolean z = (C1586580rOC.LIZIZ(false) || FriendsTabTopExperiment.LIZIZ()) && (!C1583440rJ8.LIZ() || F2());
        int followerCount = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser().getFollowerCount();
        IAVPublishService iAVPublishServicePublishService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
        PublishModel publishModel = iAVPublishServicePublishService.getPublishModel(iAVPublishServicePublishService.getCurrentPublishTaskId());
        StateOwner.LL.getClass();
        return StateOwner.LLJJIII && C1595430rcT.LIZIZ.LIZJ().shouldShowFriendsTab() && z && followerCount <= 5000 && !C729510SjV.LJJJJJL(publishModel);
    }

    public static IFriendTabExpApi LJ() {
        Object objLIZ = C04TD.LIZ(IFriendTabExpApi.class, false);
        if (objLIZ != null) {
            return (IFriendTabExpApi) objLIZ;
        }
        if (C04TD.J0 == null) {
            synchronized (IFriendTabExpApi.class) {
                if (C04TD.J0 == null) {
                    C04TD.J0 = new FriendsFeedServiceImpl();
                }
            }
        }
        return C04TD.J0;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean A2() {
        FriendsFeedResponse friendsFeedResponse;
        List<FriendsFeed> list;
        C0NMA.LIZ.getClass();
        C1587740rQ4.LIZ.getClass();
        if (C1587740rQ4.LJIIZILJ) {
            return true;
        }
        C0NMB c0nmbLIZ = C0NMA.LIZ();
        if (((c0nmbLIZ == null || (friendsFeedResponse = c0nmbLIZ.LIZIZ) == null || (list = friendsFeedResponse.friendFeedData) == null) ? 0 : list.size()) >= ((FriendsTabLocalCacheConfig) C310660CFs.LIZIZ.getValue()).cachedFeedSize) {
            if (System.currentTimeMillis() - (c0nmbLIZ != null ? c0nmbLIZ.LIZJ : 0L) <= ((FriendsTabLocalCacheConfig) r2.getValue()).validTimeMillis) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void E1() {
        C1587390rPV.LIZ.getClass();
        C1587390rPV.LIZIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final int J2() {
        C1392890mLn.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tt_mute_their_posts_");
        sbLIZ.append(C0XQ7.LJFF().getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).getInt("key_unmute_times", 0);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean LLLLLLL() {
        InterfaceC1587410rPX interfaceC1587410rPX;
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ == null) {
            return false;
        }
        C128Y c128yKi = Hox.LLJILJIL.LIZ(c19egLIZIZ).Ki("FRIENDS_FEED");
        if (!(c128yKi instanceof InterfaceC1587410rPX) || (interfaceC1587410rPX = (InterfaceC1587410rPX) c128yKi) == null) {
            return false;
        }
        return interfaceC1587410rPX.LLLLLLL();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final int N2() {
        C1392890mLn.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tt_mute_their_posts_");
        sbLIZ.append(C0XQ7.LJFF().getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).getInt("key_mute_times", 0);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean O2() {
        C1587370rPT.LIZ.getClass();
        return C1587370rPT.LIZLLL > 0 && !C1587370rPT.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void S1() {
        if (C1587390rPV.LJFF) {
            return;
        }
        C1587390rPV.LJFF = true;
        InterfaceC1587510rPh interfaceC1587510rPh = C1587390rPV.LIZJ;
        if (interfaceC1587510rPh != null) {
            interfaceC1587510rPh.LIZ();
        }
        C1604710rrR c1604710rrR = C1587390rPV.LIZIZ;
        c1604710rrR.LIZLLL().erase("key_timestamp_records");
        c1604710rrR.LJII();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final int S2() {
        Set<String> set = C1582120rH0.LIZ;
        int size = set != null ? set.size() : 0;
        Set<String> set2 = C1582120rH0.LIZ;
        if (set2 != null) {
            set2.clear();
        }
        return size;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean T1() {
        C1587390rPV.LIZ.getClass();
        return C1587390rPV.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void T2() {
        C1587200rPC.LIZ.getClass();
        C1587200rPC.LJFF = "find_friends_page";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final String U1() {
        String str = C1587490rPf.LIZ;
        return str == null ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final long U2() {
        C1516430pZ3.LL.getClass();
        return C1516430pZ3.LLILLL.getLong("client_read_gids_report_time", 0L);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean V1() {
        return ((Boolean) C1601240rlq.LIZIZ.getValue()).booleanValue() && C1589640rT8.LIZIZ.F2() && !C0XQ7.LJFF().isLogin();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final String V2() {
        C1516430pZ3 c1516430pZ3 = C1516430pZ3.LL;
        return C1516430pZ3.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final String X1() {
        String str = C1587360rPS.LJ;
        C1587360rPS.LJ = "";
        return str;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void X2() {
        StateOwner.LL.getClass();
        StateOwner.LLJJJ = true;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void Z2() {
        StateOwner.LL.getClass();
        StateOwner.LLJJIII = true;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final Aweme a3() {
        List<FriendsFeed> list;
        FriendsFeed friendsFeed;
        C1587540rPk.LL.getClass();
        FriendsFeedResponse friendsFeedResponse = (!Intrinsics.LJFF("bottom", EnumC1587000rOs.FYP_GUIDE_CARD.getScene()) || C1587540rPk.LLIZLLLIL) ? C1587540rPk.LLILZLL : C1587540rPk.LLIZ;
        if (friendsFeedResponse == null || (list = friendsFeedResponse.friendFeedData) == null || (friendsFeed = (FriendsFeed) C13LP.LJJJLL(list)) == null) {
            return null;
        }
        return friendsFeed.getAweme();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void e2() {
        C1587500rPg.LIZ.getClass();
        C1587540rPk.LL.getClass();
        boolean z = !C1587540rPk.LIZIZ(false);
        ArrayList<String> arrayList = C1587360rPS.LIZ;
        boolean z2 = (arrayList.isEmpty() ^ true) && !C1587540rPk.LIZ(C08JS.LIZLLL(arrayList), false);
        if (z || z2) {
            C799570VYd.LJFF(false).submit(new Runnable() { // from class: X.0rPW
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FriendsTabAdvanceRequestHelper@143f.execute$1");
                    try {
                        C1587500rPg.LIZ.getClass();
                        C1587500rPg.LIZJ = (FriendsFeedResponse) ((ListenableFuture) C1587500rPg.LJ.getValue()).get();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } finally {
                        try {
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                    }
                    C1C7U.LIZIZ("FriendsTabAdvanceRequestHelper@143f.execute$1");
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void e3() {
        C1587490rPf.LIZ = "";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void h3() {
        FriendsTabTopExperiment.LIZLLL = FriendsTabTopExperiment.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final List<String> j2() {
        return C13LP.LLIIII(C1587360rPS.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean l2() {
        C19EG c19egLIZIZ;
        boolean zQ8;
        List<ISocialTabProtocol> arrayList;
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        if (!C1595430rcT.LIZIZ.LIZJ().shouldShowFriendsTab() || (c19egLIZIZ = StateOwner.LL.LIZIZ()) == null) {
            return false;
        }
        String strCQ2 = C343710Ddh.LIZ(c19egLIZIZ).CQ2();
        C128Y c128yKi = Hox.LLJILJIL.LIZ(c19egLIZIZ).Ki("HOME");
        if (!(c128yKi instanceof InterfaceC1593630rZZ) || (interfaceC1593630rZZ = (InterfaceC1593630rZZ) c128yKi) == null) {
            zQ8 = false;
        } else {
            try {
                zQ8 = interfaceC1593630rZZ.q8();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zQ8 = false;
            }
        }
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZLLL = C1583510rJF.LIZLLL(C1558360qeg.LJI(c19egLIZIZ, null));
        boolean zUw = iFriendsTabLayoutAbilityLIZLLL != null ? iFriendsTabLayoutAbilityLIZLLL.uw("FRIENDS_FEED") : false;
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(c19egLIZIZ, null));
        if (iSocial2TabProtocolAbilityLJI == null || (arrayList = iSocial2TabProtocolAbilityLJI.b9()) == null) {
            arrayList = new ArrayList<>();
        }
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        if (c1589640rT8.F2() && (!arrayList.isEmpty())) {
            return zQ8;
        }
        if (c1589640rT8.F2()) {
            if (!Intrinsics.LJFF(strCQ2, "HOME") || !zQ8) {
                return false;
            }
        } else if (!Intrinsics.LJFF(strCQ2, "FRIENDS_TAB") || !zUw) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean l3() {
        return !C1587360rPS.LIZ.isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void n3() {
        InterfaceC1587410rPX interfaceC1587410rPX;
        try {
            C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
            if (c19egLIZIZ == null) {
                return;
            }
            C128Y c128yKi = Hox.LLJILJIL.LIZ(c19egLIZIZ).Ki("FRIENDS_FEED");
            if (!(c128yKi instanceof InterfaceC1587410rPX) || (interfaceC1587410rPX = (InterfaceC1587410rPX) c128yKi) == null) {
                return;
            }
            interfaceC1587410rPX.Rd();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void q2() {
        StateOwner.LL.getClass();
        StateOwner.LLJJIJIIJIL = true;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final IInterceptor r2() {
        return new FriendsFeedRouterInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean shouldShowFriendsTab() {
        return C1595430rcT.LIZIZ.LIZJ().shouldShowFriendsTab();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final C0TRR v2() {
        return new C0TRR() { // from class: X.0rw9
            @Override // X.C0TRR
            public final int LIZIZ() {
                return 0;
            }

            public static final CardInsertResultInfo LIZLLL(List list) {
                if (list != null && !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        CardInsertResultInfo cardInsertResultInfo = (CardInsertResultInfo) it2.next();
                        if (cardInsertResultInfo != null && cardInsertResultInfo.cardType == 57) {
                            return cardInsertResultInfo;
                        }
                    }
                    return null;
                }
                return null;
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
            @Override // X.C0TRR
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List<com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest> LIZJ(X.C0TRR r14, com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData r15, java.util.List<com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo> r16) {
                /*
                    Method dump skipped, instruction units count: 310
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1607630rw9.LIZJ(X.0TRR, com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData, java.util.List):java.util.List");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean w2() {
        C1587540rPk.LL.getClass();
        return C1587540rPk.LIZIZ(false);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean C2() {
        return E2() && ((Number) C0AIQ.LIZ.getValue()).intValue() >= 2;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean D1() {
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        InterfaceC1587410rPX interfaceC1587410rPX;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) == null) {
            return false;
        }
        C128Y c128yKi = Hox.LLJILJIL.LIZ(c19egLIZIZ).Ki("FRIENDS_FEED");
        if (!(c128yKi instanceof InterfaceC1587410rPX) || (interfaceC1587410rPX = (InterfaceC1587410rPX) c128yKi) == null) {
            return false;
        }
        return interfaceC1587410rPX.D1();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean E2() {
        return W2() && ((Number) C0AIQ.LIZ.getValue()).intValue() >= 1;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean F2() {
        if (!C343780Ddo.LIZIZ()) {
            return FriendsTabTopExperiment.LIZ() >= 0;
        }
        C1585070rLl c1585070rLl = C1585070rLl.LIZ;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.FRIENDS;
        c1585070rLl.getClass();
        return C1585070rLl.LJFF(enumC1584360rKc, null);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean LIZ() {
        ((INearbyFeedService) ServiceManager.get().getService(INearbyFeedService.class)).LJIILL();
        if (C15WT.LIZIZ.LIZ()) {
            return false;
        }
        return u2();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IFriendTabExpApi
    public final boolean LIZJ() {
        return C343780Ddo.LIZIZ() ? C1585070rLl.LIZLLL(C1585070rLl.LIZ, EnumC1584360rKc.FRIENDS) : C1586580rOC.LIZIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IFriendTabExpApi
    public final int LIZLLL() {
        if (!C343780Ddo.LIZIZ()) {
            return (C1585030rLh.LIZ(true) ? FriendsTabTopExperiment.LIZIZ : (FriendsTabTopExperiment.FriendsTabTopConfig) FriendsTabTopExperiment.LIZJ.getValue()).indexOnTop;
        }
        C1585070rLl c1585070rLl = C1585070rLl.LIZ;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.FRIENDS;
        c1585070rLl.getClass();
        return !C1585070rLl.LJFF(enumC1584360rKc, null) ? -1 : 1;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean W2() {
        boolean z = false;
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "tt_friends_has_number_dot", true) == 1 && (C1586580rOC.LIZIZ(false) || FriendsTabTopExperiment.LIZIZ())) {
            z = true;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean h2() {
        return C1587360rPS.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final C1587420rPY m2() {
        return C1587360rPS.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void m3() {
        C0XQ7.LJFF().LJJIFFI(C1516430pZ3.LL);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void G2() {
        C1587360rPS.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final C0WHU LIZIZ() {
        return C1587390rPV.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void d2() {
        C1595430rcT c1595430rcT = C1595430rcT.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean s2() {
        return C1587360rPS.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void D2(InterfaceC1392880mLm interfaceC1392880mLm) {
        C1392890mLn.LIZ.getClass();
        C1392890mLn.LIZLLL(interfaceC1392880mLm);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void H2(InterfaceC1392880mLm interfaceC1392880mLm) {
        C1392890mLn.LIZ.getClass();
        C1392890mLn.LJII(interfaceC1392880mLm);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void I2(String str) {
        C1587200rPC.LIZ.getClass();
        C1587200rPC.LIZIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void P2(Context context) {
        C1585070rLl c1585070rLl = C1585070rLl.LIZ;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.FRIENDS;
        EnumC308700C8e enumC308700C8e = EnumC308700C8e.FRIENDS_PRELOAD_TOP_VIEW;
        c1585070rLl.getClass();
        if (C1585070rLl.LJFF(enumC1584360rKc, enumC308700C8e)) {
            C20673215v0.LJI(R.layout.cai, context);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0RS8] */
    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final Object Q2(InterfaceC691450RAh interfaceC691450RAh) {
        if (!(interfaceC691450RAh instanceof C0RF0)) {
            return null;
        }
        return new FriendsFYPGuideCardViewHolder((C0RF0) interfaceC691450RAh, new C0SZL<FriendsFYPGuideCardViewHolder, VideoItemParams>() { // from class: X.0RS8
            @Override // X.C0SZL
            public final String LIZLLL(VideoItemParams videoItemParams) {
                String aid = videoItemParams.getAweme().getAid();
                if (aid == null) {
                    return "";
                }
                return aid;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void R1(boolean z) {
        InterfaceC1587410rPX interfaceC1587410rPX;
        try {
            C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
            if (c19egLIZIZ == null) {
                return;
            }
            C128Y c128yKi = Hox.LLJILJIL.LIZ(c19egLIZIZ).Ki("FRIENDS_FEED");
            Unit unit = null;
            if ((c128yKi instanceof InterfaceC1587410rPX) && (interfaceC1587410rPX = (InterfaceC1587410rPX) c128yKi) != null) {
                interfaceC1587410rPX.R1(z);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void R2(boolean z) {
        C1587360rPS.LIZIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void Y2(Context context) {
        C21146717pB.LIZJ(context, R.layout.ca9);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void Z1(long j) {
        C1516430pZ3.LL.getClass();
        C1516430pZ3.LLILLL.storeLong("client_read_gids_report_time", j);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void a2(int i) {
        C1587200rPC.LIZ.getClass();
        C1587200rPC.LJ = i;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final View c2(Context context) {
        boolean z = true;
        if (C296430Bjd.LIZ() != 1) {
            z = false;
        }
        if (z) {
            return C786410Ut5.Sd(R.layout.caf, C786410Ut5.ne(context), null);
        }
        return C786410Ut5.Sd(R.layout.cae, C786410Ut5.ne(context), null);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void c3(int i) {
        C1587200rPC.LIZ.getClass();
        C1587200rPC.LIZJ = i;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void f3(boolean z) {
        C1587370rPT.LIZ.getClass();
        if (z) {
            C1587370rPT.LIZLLL++;
            C1587370rPT.LIZJ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void g3(int i) {
        C1587200rPC.LIZ.getClass();
        C1587200rPC.LIZLLL = i;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void i2(C19EG c19eg) {
        C20673215v0.LJI(R.layout.cah, c19eg);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void j3(boolean z) {
        C1587360rPS.LJFF = z;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void k3(C19EG c19eg) {
        C20673215v0.LJI(Integer.valueOf(R.layout.cad).intValue(), c19eg);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void n2(String str) {
        C1516430pZ3.LL.getClass();
        C1516430pZ3.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void p2(boolean z) {
        C1587360rPS.LIZJ = z;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean t2(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment instanceof SocialFriendsFeedFragment;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final View x2(Context context) {
        return new C1073840e3C(context);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void z2(List<String> list) {
        ArrayList<String> arrayList = C1587360rPS.LJII;
        arrayList.clear();
        arrayList.addAll(list);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final String L2(Aweme aweme, Activity activity) {
        InterfaceC1587410rPX interfaceC1587410rPX;
        try {
            C128Y c128yKi = Hox.LLJILJIL.LIZ((C19EG) activity).Ki("FRIENDS_FEED");
            Integer numValueOf = null;
            if ((c128yKi instanceof InterfaceC1587410rPX) && (interfaceC1587410rPX = (InterfaceC1587410rPX) c128yKi) != null) {
                numValueOf = Integer.valueOf(interfaceC1587410rPX.Ph(aweme));
            }
            int dataLevel = EnumC1586890rOh.SORT.getDataLevel();
            if (numValueOf != null && numValueOf.intValue() == dataLevel) {
                return "new";
            }
            int dataLevel2 = EnumC1586890rOh.HISTORY_UNVIEWED.getDataLevel();
            if (numValueOf != null && numValueOf.intValue() == dataLevel2) {
                return "historical_unread";
            }
            int dataLevel3 = EnumC1586890rOh.HISTORY_VIEWED.getDataLevel();
            if (numValueOf == null) {
                return "";
            }
            if (numValueOf.intValue() != dataLevel3) {
                return "";
            }
            return "historical_read";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getFeedSourceType error ");
                sbLIZ.append(thM5exceptionOrNullimpl);
                C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void W1(String str, String str2) {
        C1587200rPC c1587200rPC = C1587200rPC.LIZ;
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_method", str, bundle);
        C786410Ut5.LJJJI("last_from_tab_tag", str2, bundle);
        c1587200rPC.getClass();
        C1587200rPC.LIZ(c19egLIZIZ, bundle);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final Boolean b2(String str, EnumC1392960mLu enumC1392960mLu) {
        Map map;
        Map map2;
        C1392890mLn.LIZ.getClass();
        if (str.length() != 0 && (map = (Map) ((Map) C1392890mLn.LIZJ.getValue()).get(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) != null && (map2 = (Map) map.get(str)) != null) {
            return (Boolean) map2.get(enumC1392960mLu);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final Object d3(final View view, final Fragment fragment) {
        return new C0SZ8(view, fragment) { // from class: X.0N05
            public final Fragment LL;
            public final View LLILLJJLI;
            public C0N06 LLILLL;

            @Override // X.C0SZ8
            public final /* synthetic */ void A(boolean z, C1AV2 c1av2) {
            }

            @Override // X.C0SZ8
            public final void Ar(Aweme aweme) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void B0(boolean z) {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ BaseFeedPlayerView E() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void F0(String str) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ ImageView F2() {
                return null;
            }

            @Override // X.C0SZ8
            public final void G() {
            }

            @Override // X.C0SZ8
            public final void K1(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void K8(View.OnTouchListener onTouchListener) {
            }

            @Override // X.C0SZ8
            public final InterfaceC689860R4e K9() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void L0(int i, Aweme aweme) {
            }

            @Override // X.C0SZ8
            public final void LJI(Aweme aweme) {
            }

            @Override // X.C0SZ8, X.C0SZA
            public final Aweme LJIIIIZZ() {
                return null;
            }

            @Override // X.C0SZ8
            public final void LJIIJ() {
            }

            @Override // X.C0SZ8
            public final void LJIIZILJ(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJIJJ() {
                throw null;
            }

            @Override // X.C0SZ8, X.C0SZA
            public final InterfaceC739930T0t LJIJJLI() {
                return null;
            }

            @Override // X.C0SZ8
            public final void LJJIFFI(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJJIIJ() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ C0SZ8 LJJIJIL(String str) {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJJIL(C0R6M c0r6m) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJJIZ(C0RHA c0rha) {
            }

            @Override // X.C0SZ8
            public final void LJJJJ(int i, Aweme aweme) {
            }

            @Override // X.C0SZ8
            public final void LJJJJJ(long j) {
            }

            @Override // X.C0SZ8
            public final void LJJJLIIL(int i, long j) {
            }

            @Override // X.C0SZ8
            public final void LJJJLZIJ(C1365850leB c1365850leB) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LJJLIIIJ() {
                return true;
            }

            @Override // X.C0SZ8
            public final void LJLIIIL(int i) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJLJLLL(int i, int i2, int i3, String str, String str2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJLLILLLL() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LJZI(boolean z, boolean z2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLFF() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLFII(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLFZ(Object obj) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLIIII(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLIIIJ(C0SYH c0syh) {
            }

            @Override // X.C0SZ8
            public final void LLIIL(String str) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLIILZL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLIIZ() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLILII(boolean z) {
            }

            @Override // X.C0SZ8
            public final void LLILLL(C1365860leC c1365860leC) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLIZLLLIL() {
            }

            @Override // X.C0SZ8
            public final void LLJI(C697110RWb c697110RWb) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJ(int i, boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJIJIIJIL(String str) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJIJIL() {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJJIL() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJJJ(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJJJJJIL(boolean z, boolean z2) {
            }

            @Override // X.C0SZ8
            public final void LLJL(boolean z, boolean z2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJLIL(Long l) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJLILLLLZIIL(int i, String str, String str2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLJLL() {
            }

            @Override // X.C0SZ8
            public final void LLJLLIL(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ C0SZ8 LLJLLL() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLF() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLFFI(int i, String str, String str2) {
            }

            @Override // X.C0SZ8
            public final void LLLI(int i) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLIIII() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLILZLLLI() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ View LLLJIL() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLLLIIIILLL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLLIIL() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLLIILL(int i, String str) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLLJ(int i, String str) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ C584270Mvp LLLLLJIL() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLLLLLIL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLLLLJ(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLLLZL() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ View LLLLZLLIL() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLLZ() {
                return true;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLLZIL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLLZLZ(Map map) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLLZZIL() {
                return true;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLZ() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLZLI() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void LLZLLLL(int i) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ View LLZZ(String str) {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean LLZZZIL() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void M(C0REZ c0rez) {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void M0(C690190R5l c690190R5l) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean Nv() {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ View Qg(String str, boolean z) {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void Rl(C035D c035d) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void Y0(int i, int i2, long j, long j2, long j3, long j4, long j5) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void Z(int i, boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ C583360MuM Z0() {
                return null;
            }

            @Override // X.C0SZ8
            public final void e1() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void ev() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void g1(int i) {
            }

            @Override // X.C0SZ8
            public final Aweme getAweme() {
                return null;
            }

            @Override // X.C0SZ8
            public final int getAwemeType() {
                return 325;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void h0(Aweme aweme) {
            }

            @Override // X.C0SZ8
            public final Aweme hm() {
                return null;
            }

            @Override // X.C0SZ8
            public final void i0() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void k1(String str, boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean l() {
                return true;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean l1() {
                return false;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void o(boolean z) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ boolean o1() {
                return false;
            }

            @Override // X.C0SZ8
            public final void onDestroyView() {
            }

            @Override // X.C0SZ8
            public final void onPageSelected(int i) {
            }

            @Override // X.C0SZ8
            public final void onPause() {
            }

            @Override // X.C0SZ8
            public final void onResume() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void onScrollEnd() {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void p(int i) {
            }

            @Override // X.C0SZ8
            public final void q(String str, String str2) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ View.OnTouchListener q5() {
                return null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void q7(float f, int i, int i2, int i3) {
                throw null;
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void qi() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void s0() {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void u1() {
            }

            @Override // X.C0SZ8
            public final void unBind() {
            }

            @Override // X.C0SZ8
            public final void uq(C1365870leD c1365870leD) {
            }

            @Override // X.C0SZ8
            public final /* synthetic */ void v(long j, long j2, long j3, long j4, int i, long j5, int i2) {
            }

            @Override // X.C0SZ8
            public final InterfaceC583650Mup x3() {
                return null;
            }

            @Override // X.C0SZ8
            public final C0SKK LJLLLL() {
                return C0SKK.INITIALIZED;
            }

            @Override // X.C0SZ8
            public final void LJJIJIIJIL(int i) {
                C0N06 c0n06 = this.LLILLL;
                if (c0n06 != null) {
                    c0n06.onBind();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0SZ8
            public final void LLZZJLIL(View view2) {
                C0N06 c0n06 = (C0N06) view2;
                this.LLILLL = c0n06;
                c0n06.LJ(this.LL, C0N07.LAST_ITEM);
            }

            @Override // X.C0SZ8
            public final void h(boolean z) {
                C0N06 c0n06 = this.LLILLL;
                if (c0n06 != null) {
                    c0n06.LIZ();
                }
            }

            {
                this.LL = fragment;
                this.LLILLJJLI = view;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void g2(FriendsTabTopExperiment.FriendsTabTopConfig friendsTabTopConfig, Integer num) {
        int iLJIIZILJ;
        if (friendsTabTopConfig == null) {
            try {
                C0C64.LJIILLIIL().getClass();
                friendsTabTopConfig = (FriendsTabTopExperiment.FriendsTabTopConfig) C0C64.LJJIFFI(true, "tt_friends_top_tab_experiment", 31744, FriendsTabTopExperiment.FriendsTabTopConfig.class, 2);
                if (friendsTabTopConfig == null) {
                    friendsTabTopConfig = FriendsTabTopExperiment.LIZIZ;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                friendsTabTopConfig = FriendsTabTopExperiment.LIZIZ;
            }
        }
        if (num != null) {
            iLJIIZILJ = num.intValue();
        } else {
            iLJIIZILJ = C0C64.LJIILLIIL().LJIIZILJ(31744, -1, 2, "tt_friends_experiment", true);
        }
        if (friendsTabTopConfig.indexOnTop <= 0 && iLJIIZILJ > 0) {
            friendsTabTopConfig = new FriendsTabTopExperiment.FriendsTabTopConfig(0);
        }
        FriendsTabTopExperiment.LIZLLL = friendsTabTopConfig;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void k2(List<String> list, boolean z) {
        if (z) {
            C1587360rPS.LIZ.clear();
        }
        C1587360rPS.LIZ.addAll(0, list);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void o2(String str, ArrayList arrayList) {
        FeedInsertRelationManager.INSTANCE.put((ArrayList<String>) arrayList, str);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void y2(String str, String str2) {
        if (str.length() != 0 && str2.length() != 0) {
            try {
                C1587360rPS.LJ = C728840SiQ.LIZ(new InsertStory(CastLongProtector.parseLong(str), CastLongProtector.parseLong(str2)));
                C189200o6.m2constructorimpl(Unit.LIZ);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C1587360rPS.LJ = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String B2(X.C19EG r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r4 = "Following"
            java.lang.String r3 = "For You"
            java.lang.String[] r0 = new java.lang.String[]{r4, r3}
            java.util.List r0 = X.C1697810uHb.LJIIJJI(r0)
            boolean r0 = X.C13LP.LJJJJ(r7, r0)
            r2 = 0
            if (r0 != 0) goto L16
            if (r8 != 0) goto L16
            return r2
        L16:
            if (r6 != 0) goto L19
            return r2
        L19:
            if (r7 != 0) goto L54
            if (r8 != 0) goto L21
            r7 = r8
        L1e:
            if (r7 != 0) goto L54
            return r2
        L21:
            int r1 = r8.hashCode()
            r0 = -1271119582(0xffffffffb43c4122, float:-1.753256E-7)
            if (r1 == r0) goto L4a
            r0 = -667094460(0xffffffffd83cf244, float:-8.3099484E14)
            if (r1 == r0) goto L3f
            r0 = 1691937916(0x64d8ec7c, float:3.2012298E22)
            if (r1 != r0) goto L52
            java.lang.String r0 = "homepage_hot"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L52
            r4 = r3
        L3d:
            r7 = r4
            goto L1e
        L3f:
            java.lang.String r0 = "homepage_friends"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L52
            java.lang.String r4 = "FRIENDS_FEED"
            goto L3d
        L4a:
            java.lang.String r0 = "homepage_follow"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L3d
        L52:
            r4 = r2
            goto L3d
        L54:
            X.0Hfk r0 = com.bytedance.hox.Hox.LLJILJIL     // Catch: java.lang.Throwable -> L84
            com.bytedance.hox.Hox r0 = r0.LIZ(r6)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L82
            androidx.fragment.app.Fragment r0 = r0.Ki(r7)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L82
            com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility r0 = X.C0T1R.LIZJ(r0)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L82
            com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility r0 = r0.Mb()     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L82
            X.0SZ8 r0 = r0.LJLIL()     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L82
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJIIIIZZ()     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L82
            java.lang.String r1 = r0.getAid()     // Catch: java.lang.Throwable -> L84
        L7e:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L84
            goto L90
        L82:
            r1 = r2
            goto L7e
        L84:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L90:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L97
            r2 = r1
        L97:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.service.FriendsFeedServiceImpl.B2(X.19EG, java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void f2(EnumC1392960mLu enumC1392960mLu, String str, boolean z) {
        C1392890mLn.LIZ.getClass();
        C1392890mLn.LJ(enumC1392960mLu, str, z);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void i3(String str, String str2, String str3) {
        boolean zLJI = MethodIDManager.LJI(202233);
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "tt_friends_feed_preload_reverse", true) == 1) {
            if (Intrinsics.LJFF(str, EnumC1587000rOs.POST_PAGE.getScene())) {
                ((ILauncherTaskApi) ServiceManager.get().getService(ILauncherTaskApi.class)).initPowerPreload();
            }
            FriendsFeedListApi.FriendsFeedApi friendsFeedApi = FriendsFeedListApi.LIZ;
            C1587620rPs.LJ(str, str2, str3);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void o3(String str, String str2, String str3) {
        FriendsFeedListApi.FriendsFeedApi friendsFeedApi = FriendsFeedListApi.LIZ;
        C1587620rPs.LJFF(str);
        C1587620rPs.LJ(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void onAwemeRead(int i, Aweme aweme, String str) {
        boolean zLJI = MethodIDManager.LJI(71698);
        C1595430rcT.LIZIZ.LIZIZ().onAwemeReadAvoidPerf(i, aweme, str);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void onFriendsV3StoryDetailRead(int i, Aweme aweme, String str) {
        C1595430rcT.LIZIZ.LIZIZ().onFriendsV3StoryDetailRead(i, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void b3(Context context, Fragment fragment, User user, EnumC1393020mM0 enumC1393020mM0, C1393160mME c1393160mME, C1393110mM9 c1393110mM9) {
        if (user != null) {
            AwS94S0500000_21 awS94S0500000_21 = new AwS94S0500000_21(context, fragment, user, enumC1393020mM0, c1393110mM9, 1);
            String nickname = user.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            C1393140mMC.LIZJ(context, fragment, user, enumC1393020mM0, new C1393160mME(C0SE9.LIZ(user, nickname), user.isMuted(), user.isMutedStory(), user.isMutedNonStoryPost(), user.isMutedLives(), awS94S0500000_21), c1393110mM9);
            return;
        }
        if (c1393160mME == null) {
            return;
        }
        C1393140mMC.LIZJ(context, fragment, null, enumC1393020mM0, c1393160mME, c1393110mM9);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void K2(final User user, final Fragment fragment, final Activity activity, EnumC1393020mM0 enumC1393020mM0, final EnumC1392960mLu enumC1392960mLu, final View view, final Function1<? super Boolean, Unit> function1) {
        C1392890mLn.LIZ.getClass();
        if (user.getUid() == null) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        C1392890mLn.LJ(enumC1392960mLu, user.getUid(), true);
        C11NZ.LJIJJLI(new C1402330mb1(user, enumC1393020mM0, enumC1392960mLu, 1)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new C09JN() { // from class: X.0mLl
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1389890mGx c1389890mGx;
                InterfaceC1392880mLm interfaceC1392880mLm;
                C1C7U.LIZ("MuteTheirPostsManager@e4c1.unmutePosts$d$2");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null && baseResponse.status_code == 0) {
                    C1392890mLn c1392890mLn = C1392890mLn.LIZ;
                    String uid = user.getUid();
                    EnumC1392960mLu enumC1392960mLu2 = enumC1392960mLu;
                    c1392890mLn.getClass();
                    C1392890mLn.LJ(enumC1392960mLu2, uid, false);
                    CopyOnWriteArrayList<SoftReference> copyOnWriteArrayListLIZ = C1392890mLn.LIZ();
                    User user2 = user;
                    EnumC1392960mLu enumC1392960mLu3 = enumC1392960mLu;
                    for (SoftReference softReference : copyOnWriteArrayListLIZ) {
                        if (softReference != null && (interfaceC1392880mLm = (InterfaceC1392880mLm) softReference.get()) != null) {
                            String uid2 = user2.getUid();
                            if (uid2 == null) {
                                uid2 = "";
                            }
                            interfaceC1392880mLm.LIZIZ(uid2, enumC1392960mLu3);
                        }
                    }
                    function1.invoke(Boolean.TRUE);
                    C1610870s1N.LIZ.getClass();
                    if (C1610870s1N.LIZIZ()) {
                        C1392890mLn c1392890mLn2 = C1392890mLn.LIZ;
                        Fragment fragment2 = fragment;
                        Activity activity2 = activity;
                        User user3 = user;
                        EnumC1392960mLu enumC1392960mLu4 = enumC1392960mLu;
                        View view2 = view;
                        c1392890mLn2.getClass();
                        C1392890mLn.LJI(fragment2, activity2, user3, enumC1392960mLu4, false, view2);
                    } else {
                        C1392890mLn c1392890mLn3 = C1392890mLn.LIZ;
                        Fragment fragment3 = fragment;
                        Activity activity3 = activity;
                        View view3 = view;
                        c1392890mLn3.getClass();
                        if (view3 != null) {
                            c1389890mGx = new C1389890mGx(view3);
                        } else if (activity3 != null) {
                            c1389890mGx = new C1389890mGx(activity3);
                        } else if (fragment3 != null) {
                            c1389890mGx = new C1389890mGx(fragment3);
                        }
                        c1389890mGx.LJIIIZ(2131837845);
                        c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                        c1389890mGx.LJII(R.attr.ee);
                        c1389890mGx.LJIIJJI();
                    }
                } else {
                    function1.invoke(Boolean.FALSE);
                    C1392890mLn c1392890mLn4 = C1392890mLn.LIZ;
                    Fragment fragment4 = fragment;
                    Activity activity4 = activity;
                    c1392890mLn4.getClass();
                    C1392890mLn.LJFF(activity4, fragment4);
                }
                C1C7U.LIZIZ("MuteTheirPostsManager@e4c1.unmutePosts$d$2");
            }
        }, new AfS100S0300000_2(function1, fragment, activity, 0), new C1402170mal(function1, fragment, activity, 1));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1323405Fw(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void M2(Activity activity, View view, Fragment fragment, C1393190mMH c1393190mMH, EnumC1393020mM0 enumC1393020mM0, EnumC1392960mLu enumC1392960mLu, User user, Function1 function1) {
        C1392890mLn.LIZ.getClass();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1393010mLz(enumC1393020mM0, user, fragment, activity, c1393190mMH, enumC1392960mLu, view, function1, null), 3);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1323205Fu(null), 3);
    }
}
