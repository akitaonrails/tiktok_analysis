package com.ss.android.ugc.aweme.friendstab.service;

import X.AbstractC1386130mAt;
import X.AbstractC1387200mCc;
import X.AbstractC1588230rQr;
import X.AbstractC806620Vka;
import X.C01GW;
import X.C036R;
import X.C08I7;
import X.C0AI2;
import X.C0BLE;
import X.C0CAU;
import X.C0N2U;
import X.C0NCM;
import X.C0OB8;
import X.C0SDD;
import X.C0SUC;
import X.C0VSJ;
import X.C0W17;
import X.C1206104nj;
import X.C1206304nl;
import X.C1206404nm;
import X.C1206704np;
import X.C1261804wi;
import X.C1277904zJ;
import X.C1360330lVH;
import X.C1361200lWg;
import X.C1383120m62;
import X.C1388190mED;
import X.C1389300mG0;
import X.C1393200mMI;
import X.C13LE;
import X.C1558040qeA;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1582260rHE;
import X.C1583510rJF;
import X.C1586980rOq;
import X.C1589640rT8;
import X.C1595430rcT;
import X.C1599640rjG;
import X.C1906580ziK;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2344009Gk;
import X.C2487409ou;
import X.C278440Avi;
import X.C278570Avv;
import X.C296320BjS;
import X.C296340BjU;
import X.C319860CgK;
import X.C343710Ddh;
import X.C584760Mwc;
import X.C614770O9j;
import X.C630980Ooy;
import X.C705700RmC;
import X.C721230SQv;
import X.C729980SkG;
import X.C735370Ssx;
import X.C806480VkM;
import X.C806570VkV;
import X.C806580VkW;
import X.C806610VkZ;
import X.EnumC1392960mLu;
import X.EnumC1586970rOp;
import X.EnumC1587000rOs;
import X.InterfaceC1357880lRK;
import X.InterfaceC1603190roz;
import Y.ARunnableS42S0101000_31;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.bytedance.hox.Hox;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.FriendsV3PageRouterInterceptor;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3NavHideOnScrollConfig;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3PerformanceOptConfigV2;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.playback.IFriendsV3PlaybackOwnership;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.friendstab.text.FriendsV3TextFragment;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragmentV3;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3DetailBridgeAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3EmptyPageAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3PageMobAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3PageStateAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility;
import com.ss.android.ugc.aweme.friendstab.ui.tab.protocol.FriendsTabV3Protocol;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS64S1000000_13;
import kotlin.jvm.internal.AwS74S1000000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsTabV3ServiceImpl implements IFriendsTabV3Service {
    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final IInterceptor Gu() {
        return new FriendsV3PageRouterInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void Qu() {
        FriendsV3FeedRepository.LIZ.getClass();
        C0W17.LIZJ("repo", "clearCurrentUserCache");
        FriendsV3FeedRepository.LIZIZ().LIZ(FriendsV3FeedRepository.LIZLLL());
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void Tu() {
        FriendsV3FeedRepository.LIZ.getClass();
        C0W17.LIZJ("repo", "clearAllCache");
        C806570VkV c806570VkVLIZIZ = FriendsV3FeedRepository.LIZIZ();
        ((C08I7) c806570VkVLIZIZ.LIZ.getValue()).LIZ();
        c806570VkVLIZIZ.LIZIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final BottomTabProtocol Xu() {
        return new FriendsTabV3Protocol();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final boolean hv() {
        return ((Boolean) C0AI2.LIZ.getValue()).booleanValue() && Ru();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void Du() {
        FriendsV3DetailBridgeAbility friendsV3DetailBridgeAbility;
        Fragment fragmentVu = Vu();
        if (fragmentVu == null || (friendsV3DetailBridgeAbility = (FriendsV3DetailBridgeAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), FriendsV3DetailBridgeAbility.class, null)) == null) {
            return;
        }
        friendsV3DetailBridgeAbility.Du();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final C19EG Hu() {
        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
            if (abstractC1387200mCc.LIZ instanceof InterfaceC1603190roz) {
                Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
                if (activityLIZIZ != null) {
                    return C1388190mED.LIZIZ(activityLIZIZ);
                }
                return null;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final DefaultLifecycleObserver Ju() {
        IFriendsV3PageStateAbility iFriendsV3PageStateAbility;
        Fragment fragmentVu = Vu();
        if (fragmentVu == null || (iFriendsV3PageStateAbility = (IFriendsV3PageStateAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), IFriendsV3PageStateAbility.class, null)) == null) {
            return null;
        }
        return iFriendsV3PageStateAbility.iV0();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final View Lr() {
        FriendsV3DetailBridgeAbility friendsV3DetailBridgeAbility;
        Fragment fragmentVu = Vu();
        if (fragmentVu == null || (friendsV3DetailBridgeAbility = (FriendsV3DetailBridgeAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), FriendsV3DetailBridgeAbility.class, null)) == null) {
            return null;
        }
        return friendsV3DetailBridgeAbility.Lr();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void On() {
        FriendsV3FeedListAbility friendsV3FeedListAbility;
        Fragment fragmentVu = Vu();
        if (fragmentVu == null || (friendsV3FeedListAbility = (FriendsV3FeedListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), FriendsV3FeedListAbility.class, null)) == null) {
            return;
        }
        friendsV3FeedListAbility.On();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final DefaultLifecycleObserver Or() {
        IFriendsV3PageMobAbility iFriendsV3PageMobAbility;
        Fragment fragmentVu = Vu();
        if (fragmentVu == null || (iFriendsV3PageMobAbility = (IFriendsV3PageMobAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), IFriendsV3PageMobAbility.class, null)) == null) {
            return null;
        }
        return iFriendsV3PageMobAbility.Or();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void Qa() {
        FriendsV3DetailBridgeAbility friendsV3DetailBridgeAbility;
        Fragment fragmentVu = Vu();
        if (fragmentVu == null || (friendsV3DetailBridgeAbility = (FriendsV3DetailBridgeAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), FriendsV3DetailBridgeAbility.class, null)) == null) {
            return;
        }
        friendsV3DetailBridgeAbility.Qa();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final boolean Ru() {
        C19EG c19egHu = Hu();
        return c19egHu != null && C319860CgK.LIZ() && Intrinsics.LJFF(C343710Ddh.LIZ(c19egHu).CQ2(), "FRIENDS_TAB");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void Uu() {
        IFriendsV3RefreshAbility iFriendsV3RefreshAbility;
        Fragment fragmentVu = Vu();
        if (fragmentVu == null || (iFriendsV3RefreshAbility = (IFriendsV3RefreshAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), IFriendsV3RefreshAbility.class, null)) == null) {
            return;
        }
        iFriendsV3RefreshAbility.lv1(9, false, null, null, 0);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final Fragment Vu() {
        C19EG c19egHu;
        if (C319860CgK.LIZ() && (c19egHu = Hu()) != null) {
            return Hox.LLJILJIL.LIZ(c19egHu).Ki("FRIENDS_TAB");
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Wu() {
        /*
            r7 = this;
            X.19EG r0 = r7.Hu()
            r4 = 0
            if (r0 == 0) goto L33
            X.0Q7z r0 = X.C1558360qeg.LJI(r0, r4)
            com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility r3 = X.C1583510rJF.LJIIJJI(r0)
            if (r3 == 0) goto L34
            X.0rPD r0 = r3.pm0()
            if (r0 == 0) goto L34
            com.ss.android.ugc.aweme.friendstab.model.UserNewContent r2 = r0.LIZIZ
        L19:
            X.0rcT r0 = X.C1595430rcT.LIZIZ
            com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService r0 = r0.LIZIZ()
            X.0rOW r1 = r0.redDotLogic()
            java.lang.String r0 = "FRIENDS_TAB"
            int r0 = r1.LJIJI(r0)
            if (r0 <= 0) goto L31
            r0 = 1
        L2c:
            if (r2 != 0) goto L36
            if (r0 != 0) goto L36
            return
        L31:
            r0 = 0
            goto L2c
        L33:
            r3 = r4
        L34:
            r2 = r4
            goto L19
        L36:
            androidx.fragment.app.Fragment r0 = r7.Vu()
            if (r0 == 0) goto L58
            X.0Q7z r1 = X.C1558360qeg.LJFF(r0, r4)
            java.lang.Class<com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility> r0 = com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility.class
            X.01wD r1 = X.C1558520qew.LIZ(r1, r0, r4)
            com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility r1 = (com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility) r1
            if (r1 == 0) goto L58
            if (r2 == 0) goto L50
            com.ss.android.ugc.aweme.story.inbox.InsertStory r4 = X.C1386160mAw.LJII(r2)
        L50:
            r5 = 0
            r3 = 0
            r2 = 4
            r6 = r3
            r1.lv1(r2, r3, r4, r5, r6)
        L57:
            return
        L58:
            if (r3 == 0) goto L57
            r3.w20()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.service.FriendsTabV3ServiceImpl.Wu():void");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final boolean cv() {
        Fragment fragmentVu;
        FriendsV3EmptyPageAbility friendsV3EmptyPageAbility;
        return C319860CgK.LIZ() && (fragmentVu = Vu()) != null && (friendsV3EmptyPageAbility = (FriendsV3EmptyPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), FriendsV3EmptyPageAbility.class, null)) != null && friendsV3EmptyPageAbility.cR1();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final int Eu(C0OB8 c0ob8) {
        if (c0ob8 instanceof InterfaceC1357880lRK) {
            return 2;
        }
        if (c0ob8 instanceof C1361200lWg) {
            if (C1389300mG0.LJIJ(((VideoItemParams) c0ob8).fragment)) {
                return Integer.MAX_VALUE;
            }
            return ((Number) C036R.LIZ.getValue()).intValue();
        }
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void Fu(EnumC1586970rOp enumC1586970rOp) {
        EnumC1587000rOs enumC1587000rOs;
        C19EG c19egHu;
        AbstractC1588230rQr abstractC1588230rQr;
        AbstractC1588230rQr abstractC1588230rQr2;
        int iIntValue;
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runFriendsInitTasks, source=");
        sbLIZ.append(enumC1586970rOp);
        C0W17.LIZJ("init", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC1586970rOp == EnumC1586970rOp.COLD_START) {
            C1589640rT8.LIZIZ.d2();
            C19EG c19egHu2 = C1599640rjG.LIZIZ.Hu();
            if (c19egHu2 != null) {
                C01GW c01gw = C1261804wi.LIZIZ;
                if (((FriendsV3PerformanceOptConfigV2) c01gw.getValue()).enableNativeAsyncInflateFragment) {
                    if (((FriendsV3NavHideOnScrollConfig) C1558040qeA.LIZIZ.getValue()).enable) {
                        i = R.layout.cbs;
                    } else {
                        i = R.layout.cbr;
                    }
                    C0CAU.LIZIZ(new ARunnableS42S0101000_31(i, c19egHu2, 13));
                    C0CAU.LIZIZ(new ARunnableS42S0101000_31(R.layout.cbn, c19egHu2, 13));
                }
                if (((FriendsV3PerformanceOptConfigV2) c01gw.getValue()).enablePreloadLayoutXml) {
                    C614770O9j.LIZIZ.LJ().LJJIJIIJI(c19egHu2);
                    ArrayList arrayList = new ArrayList();
                    if (((Boolean) C0BLE.LIZ.getValue()).booleanValue()) {
                        arrayList.addAll(new AbstractC1588230rQr() { // from class: X.0rQu
                            @Override // X.AbstractC1588230rQr
                            public final void LIZJ() {
                                LIZIZ().add(Integer.valueOf(R.layout.cba));
                            }
                        }.LIZ());
                    }
                    arrayList.addAll(new AbstractC1588230rQr() { // from class: X.1ESt
                        @Override // X.AbstractC1588230rQr
                        public final void LIZJ() {
                            LIZIZ().add(Integer.valueOf(R.layout.cb_));
                            C21696719vh.LJFF(LIZIZ());
                            boolean zLIZ = C1206404nm.LIZ();
                            Integer numValueOf = Integer.valueOf(R.layout.cc0);
                            if (zLIZ) {
                                LIZIZ().add(numValueOf);
                                LIZIZ().add(Integer.valueOf(R.layout.b9t));
                                C21696719vh.LIZJ(LIZIZ());
                                LIZIZ().add(Integer.valueOf(R.layout.cam));
                            } else {
                                C21696719vh.LIZ(LIZIZ());
                                LIZIZ().add(numValueOf);
                            }
                            LIZIZ().add(Integer.valueOf(R.layout.b_6));
                            C21696719vh.LIZIZ(LIZIZ());
                        }
                    }.LIZ());
                    arrayList.addAll(new AbstractC1588230rQr() { // from class: X.1ESu
                        @Override // X.AbstractC1588230rQr
                        public final void LIZJ() {
                            LIZIZ().add(Integer.valueOf(R.layout.cb_));
                            C21696719vh.LJFF(LIZIZ());
                            C21696719vh.LJ(LIZIZ());
                            boolean zLIZ = C1206404nm.LIZ();
                            Integer numValueOf = Integer.valueOf(R.layout.cb5);
                            if (zLIZ) {
                                LIZIZ().add(numValueOf);
                                LIZIZ().add(Integer.valueOf(R.layout.b9t));
                                C21696719vh.LIZJ(LIZIZ());
                                LIZIZ().add(Integer.valueOf(R.layout.cam));
                            } else {
                                C21696719vh.LIZ(LIZIZ());
                                LIZIZ().add(numValueOf);
                            }
                            LIZIZ().add(Integer.valueOf(R.layout.cb8));
                            C21696719vh.LIZIZ(LIZIZ());
                        }
                    }.LIZ());
                    arrayList.addAll(new AbstractC1588230rQr() { // from class: X.1ESr
                        @Override // X.AbstractC1588230rQr
                        public final void LIZJ() {
                            LIZIZ().add(Integer.valueOf(R.layout.cb_));
                            C21696719vh.LJFF(LIZIZ());
                            if (C1206404nm.LIZ()) {
                                return;
                            }
                            C21696719vh.LIZ(LIZIZ());
                        }
                    }.LIZ());
                    if (C1206304nl.LIZ()) {
                        abstractC1588230rQr = new AbstractC1588230rQr() { // from class: X.1ESy
                            @Override // X.AbstractC1588230rQr
                            public final void LIZJ() {
                                LIZIZ().add(Integer.valueOf(R.layout.cb_));
                                C21696719vh.LJFF(LIZIZ());
                                if (!C1206404nm.LIZ()) {
                                    C21696719vh.LIZ(LIZIZ());
                                }
                                LIZIZ().add(Integer.valueOf(R.layout.cbe));
                                LIZIZ().add(Integer.valueOf(R.layout.cbj));
                                LIZIZ().add(Integer.valueOf(R.layout.b9t));
                                List<Integer> listLIZIZ = LIZIZ();
                                if (C1206404nm.LIZ()) {
                                    C21696719vh.LIZLLL(listLIZIZ);
                                }
                                LIZIZ().add(Integer.valueOf(R.layout.b_6));
                                C21696719vh.LIZIZ(LIZIZ());
                            }
                        };
                    } else if (C1206404nm.LIZ()) {
                        abstractC1588230rQr = new AbstractC1588230rQr() { // from class: X.1ESx
                            @Override // X.AbstractC1588230rQr
                            public final void LIZJ() {
                                LIZIZ().add(Integer.valueOf(R.layout.cb_));
                                C21696719vh.LJFF(LIZIZ());
                                if (!C1206404nm.LIZ()) {
                                    C21696719vh.LIZ(LIZIZ());
                                }
                                LIZIZ().add(Integer.valueOf(R.layout.cc0));
                                C21696719vh.LIZLLL(LIZIZ());
                                LIZIZ().add(Integer.valueOf(R.layout.b_6));
                                C21696719vh.LIZIZ(LIZIZ());
                            }
                        };
                    } else {
                        abstractC1588230rQr = new AbstractC1588230rQr() { // from class: X.0rQp
                            @Override // X.AbstractC1588230rQr
                            public final void LIZJ() {
                            }
                        };
                    }
                    arrayList.addAll(abstractC1588230rQr.LIZ());
                    if (C1206304nl.LIZ()) {
                        abstractC1588230rQr2 = new AbstractC1588230rQr() { // from class: X.1ESw
                            @Override // X.AbstractC1588230rQr
                            public final void LIZJ() {
                                LIZIZ().add(Integer.valueOf(R.layout.cb_));
                                C21696719vh.LJFF(LIZIZ());
                                C21696719vh.LJ(LIZIZ());
                                if (!C1206404nm.LIZ()) {
                                    C21696719vh.LIZ(LIZIZ());
                                }
                                LIZIZ().add(Integer.valueOf(R.layout.cbe));
                                LIZIZ().add(Integer.valueOf(R.layout.cbi));
                                LIZIZ().add(Integer.valueOf(R.layout.b9t));
                                List<Integer> listLIZIZ = LIZIZ();
                                if (C1206404nm.LIZ()) {
                                    C21696719vh.LIZLLL(listLIZIZ);
                                }
                                C21696719vh.LIZIZ(LIZIZ());
                            }
                        };
                    } else if (C1206404nm.LIZ()) {
                        abstractC1588230rQr2 = new AbstractC1588230rQr() { // from class: X.1ESv
                            @Override // X.AbstractC1588230rQr
                            public final void LIZJ() {
                                LIZIZ().add(Integer.valueOf(R.layout.cb_));
                                C21696719vh.LJFF(LIZIZ());
                                C21696719vh.LJ(LIZIZ());
                                if (!C1206404nm.LIZ()) {
                                    C21696719vh.LIZ(LIZIZ());
                                }
                                LIZIZ().add(Integer.valueOf(R.layout.cb5));
                                C21696719vh.LIZLLL(LIZIZ());
                                LIZIZ().add(Integer.valueOf(R.layout.cb8));
                                C21696719vh.LIZIZ(LIZIZ());
                            }
                        };
                    } else {
                        abstractC1588230rQr2 = new AbstractC1588230rQr() { // from class: X.0rQp
                            @Override // X.AbstractC1588230rQr
                            public final void LIZJ() {
                            }
                        };
                    }
                    arrayList.addAll(abstractC1588230rQr2.LIZ());
                    if (((Boolean) C278570Avv.LIZ.getValue()).booleanValue()) {
                        arrayList.addAll(new AbstractC1588230rQr() { // from class: X.0rQq
                            @Override // X.AbstractC1588230rQr
                            public final void LIZJ() {
                                LIZIZ().add(Integer.valueOf(R.layout.cbg));
                            }
                        }.LIZ());
                    }
                    arrayList.addAll(new AbstractC1588230rQr() { // from class: X.1ESs
                        @Override // X.AbstractC1588230rQr
                        public final void LIZJ() {
                            LIZIZ().add(Integer.valueOf(R.layout.cb_));
                            C21696719vh.LJFF(LIZIZ());
                            boolean zLIZ = C1206404nm.LIZ();
                            Integer numValueOf = Integer.valueOf(R.layout.cb0);
                            if (zLIZ) {
                                LIZIZ().add(numValueOf);
                            } else {
                                C21696719vh.LIZ(LIZIZ());
                                LIZIZ().add(numValueOf);
                            }
                        }
                    }.LIZ());
                    arrayList.addAll(new AbstractC1588230rQr() { // from class: X.0rQt
                        @Override // X.AbstractC1588230rQr
                        public final void LIZJ() {
                            LIZIZ().add(Integer.valueOf(R.layout.cb2));
                        }
                    }.LIZ());
                    arrayList.addAll(new AbstractC1588230rQr() { // from class: X.0rQs
                        @Override // X.AbstractC1588230rQr
                        public final void LIZJ() {
                            LIZIZ().add(Integer.valueOf(R.layout.cbt));
                        }
                    }.LIZ());
                    HashMap map = new HashMap(arrayList.size());
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    for (Object obj : arrayList) {
                        Integer num = (Integer) map.get(obj);
                        if (num != null) {
                            iIntValue = num.intValue();
                            if (iIntValue < 2) {
                            }
                        } else {
                            iIntValue = 0;
                        }
                        map.put(obj, Integer.valueOf(iIntValue + 1));
                        arrayList2.add(obj);
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        C705700RmC.LIZJ(((Number) it2.next()).intValue(), c19egHu2);
                    }
                    C1589640rT8.LIZIZ.k3(c19egHu2);
                }
            }
            C1595430rcT c1595430rcT = C1595430rcT.LIZIZ;
            if (c1595430rcT.LIZIZ().redDotLogic().LJIIZILJ() && c1595430rcT.LIZIZ().enableTabAvatar() && (c19egHu = C1599640rjG.LIZIZ.Hu()) != null && (((Number) C278440Avi.LIZ.getValue()).intValue() != 1 || C1583510rJF.LJIIJJI(C1558360qeg.LJI(c19egHu, null)) == null)) {
                c1595430rcT.LIZIZ().loadAvatarAbility("FRIENDS_TAB", c19egHu);
            }
        } else if (enumC1586970rOp == EnumC1586970rOp.LOGIN_SUCCESS || enumC1586970rOp == EnumC1586970rOp.SWITCH_ACCOUNT) {
            C2487409ou.LIZJ(new Runnable() { // from class: X.0rIw
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI;
                    C1C7U.LIZ("FriendsV3InitExtKt@80f1.runFriendsInitTasks$2");
                    try {
                        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
                        if (c19egLIZIZ != null && (iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(c19egLIZIZ, null))) != null) {
                            iSocial2TabProtocolAbilityLJI.rO0();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FriendsV3InitExtKt@80f1.runFriendsInitTasks$2");
                }
            });
            C1599640rjG.LIZIZ.Tu();
        }
        if (enumC1586970rOp == EnumC1586970rOp.LOGIN_SUCCESS || enumC1586970rOp == EnumC1586970rOp.SWITCH_ACCOUNT || enumC1586970rOp == EnumC1586970rOp.COLD_START) {
            FriendsV3FeedRepository.LIZ.getClass();
            FriendsV3FeedRepository.LJI();
            if (C1206104nj.LIZ()) {
                C614770O9j.LIZIZ.LIZ().LJII();
            }
            if (C319860CgK.LIZ() && !C1595430rcT.LIZIZ.LIZIZ().redDotLogic().LJIJJLI() && !C1599640rjG.LIZIZ.Ru()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("runFriendsInitTasks, preloadIfNoRedDotRequest, source=");
                sbLIZ2.append(enumC1586970rOp);
                C0W17.LIZJ("init", C2188811AlT.LIZIZ(sbLIZ2));
                C1599640rjG c1599640rjG = C1599640rjG.LIZIZ;
                switch (C1586980rOq.LIZ[enumC1586970rOp.ordinal()]) {
                    case 1:
                        enumC1587000rOs = EnumC1587000rOs.COLD_START;
                        break;
                    case 2:
                    case 3:
                        enumC1587000rOs = EnumC1587000rOs.HOMEPAGE_RECREATE;
                        break;
                    case 4:
                        enumC1587000rOs = EnumC1587000rOs.NON_PERSONALIZED_FEED_CHANGE;
                        break;
                    case 5:
                    case 6:
                        enumC1587000rOs = EnumC1587000rOs.NUMBER_DOT_CHANGE;
                        break;
                    default:
                        enumC1587000rOs = EnumC1587000rOs.NULL;
                        break;
                }
                c1599640rjG.dv(null, enumC1587000rOs, null);
            }
        }
        C1595430rcT c1595430rcT2 = C1595430rcT.LIZIZ;
        if (c1595430rcT2.LIZIZ().redDotLogic().LJIJJLI()) {
            C01GW c01gw2 = C296320BjS.LIZ;
            if (((Number) c01gw2.getValue()).intValue() < 2 || enumC1586970rOp != EnumC1586970rOp.COLD_START) {
                C0W17.LIZJ("init", "runFriendsInitTasks, preload reddot if dotRequest enabled");
                c1595430rcT2.LIZIZ().request(enumC1586970rOp);
            }
            if (((Number) c01gw2.getValue()).intValue() >= 1 && enumC1586970rOp == EnumC1586970rOp.COLD_START) {
                return;
            }
            if (C296340BjU.LIZ() && enumC1586970rOp == EnumC1586970rOp.COLD_START) {
                return;
            }
            C0CAU.LIZIZ(new Runnable() { // from class: X.0CUl
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FriendsV3InitExtKt@80f1.runFriendsInitTasks$3");
                    try {
                        C1595430rcT.LIZIZ.LIZIZ().polling();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FriendsV3InitExtKt@80f1.runFriendsInitTasks$3");
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final String Iu(Fragment fragment) {
        return C1389300mG0.LIZIZ(fragment);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void Kn(String str) {
        FriendsV3FeedListAbility friendsV3FeedListAbility;
        if (str == null) {
            return;
        }
        Fragment fragmentVu = Vu();
        if (fragmentVu != null && (friendsV3FeedListAbility = (FriendsV3FeedListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), FriendsV3FeedListAbility.class, null)) != null) {
            friendsV3FeedListAbility.Kn(str);
        }
        FriendsV3FeedRepository.LIZ.getClass();
        FriendsV3FeedRepository.LJIIIZ.add(new AwS64S1000000_13(str, 3));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void Mu(int i) {
        C01GW c01gw = C806480VkM.LIZ;
        Object obj = null;
        if (C1206704np.LIZ()) {
            Object obj2 = C806480VkM.LIZ().get(C13LE.LIZ(C806610VkZ.class));
            if (!(obj2 instanceof C806610VkZ)) {
                obj2 = null;
            }
            C806610VkZ c806610VkZ = (C806610VkZ) obj2;
            if (c806610VkZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("hitCache = ");
                sbLIZ.append(i);
                C2188811AlT.LIZIZ(sbLIZ);
                c806610VkZ.LIZJ = i;
            }
        }
        if (C1206704np.LIZ()) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(C806610VkZ.class);
            Object obj3 = C806480VkM.LIZ().get(c19719912DlLIZ);
            if (obj3 instanceof C806610VkZ) {
                obj = obj3;
            }
            AbstractC806620Vka abstractC806620Vka = (AbstractC806620Vka) obj;
            if (abstractC806620Vka != null) {
                abstractC806620Vka.LIZJ();
                C806480VkM.LIZ().remove(c19719912DlLIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final boolean Nu(String str) {
        boolean z;
        FriendsV3FeedRepository.LIZ.getClass();
        C806570VkV c806570VkVLIZIZ = FriendsV3FeedRepository.LIZIZ();
        c806570VkVLIZIZ.getClass();
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0W17.LIZJ("cache", "checkCacheValid, invalid uid");
        } else {
            C1582260rHE c1582260rHE = (C1582260rHE) ((C08I7) c806570VkVLIZIZ.LIZ.getValue()).LIZIZ(str);
            if (c1582260rHE == null) {
                C0W17.LIZJ("cache", "checkCacheValid, no cache");
            } else {
                if (c1582260rHE.LIZ() != C0N2U.OUT_OF_DATE) {
                    return true;
                }
                C0W17.LIZJ("cache", "checkCacheValid, out of date");
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final boolean Pu(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        if (!(fragment instanceof SocialFriendsFeedFragmentV3) && !(fragment instanceof FriendsV3TextFragment)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void Su(C0NCM c0ncm) {
        IFriendsV3PlaybackOwnership iFriendsV3PlaybackOwnership;
        Fragment fragmentVu = Vu();
        if (fragmentVu != null && (iFriendsV3PlaybackOwnership = (IFriendsV3PlaybackOwnership) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), IFriendsV3PlaybackOwnership.class, null)) != null) {
            iFriendsV3PlaybackOwnership.Dk0(c0ncm);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void Yu(String str) {
        FriendsV3FeedListAbility friendsV3FeedListAbility;
        if (str == null) {
            return;
        }
        Fragment fragmentVu = Vu();
        if (fragmentVu != null && (friendsV3FeedListAbility = (FriendsV3FeedListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), FriendsV3FeedListAbility.class, null)) != null) {
            friendsV3FeedListAbility.Py0(str);
        }
        FriendsV3FeedRepository.LIZ.getClass();
        FriendsV3FeedRepository.LJIIIZ.add(new AwS64S1000000_13(str, 4));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final File Zu(String str) {
        String anywhereChannelPath;
        new Object() { // from class: X.0rQw
        }.getClass();
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        if (iMainService != null && (anywhereChannelPath = iMainService.getAnywhereChannelPath("tiktok_social_friends_interaction_res")) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(anywhereChannelPath);
            sbLIZ.append(File.separator);
            sbLIZ.append(str);
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj.exists()) {
                return c0vsj;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final boolean av(C0OB8 c0ob8) {
        C0SDD c0sdd;
        if ((c0ob8 instanceof C0SDD) && (c0sdd = (C0SDD) c0ob8) != null && c0sdd.LJZI()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final boolean fv(C0OB8 c0ob8) {
        return c0ob8 instanceof C0SDD;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void gv(AwS555S0100000_11 awS555S0100000_11) {
        FriendsV3FeedListAbility friendsV3FeedListAbility;
        Fragment fragmentVu = Vu();
        if (fragmentVu != null && (friendsV3FeedListAbility = (FriendsV3FeedListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), FriendsV3FeedListAbility.class, null)) != null) {
            friendsV3FeedListAbility.yi0(awS555S0100000_11);
        } else {
            awS555S0100000_11.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be A[PHI: r1
      0x00be: PHI (r1v6 int) = (r1v5 int), (r1v10 int) binds: [B:42:0x00bb, B:36:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Ku(android.content.Context r7, X.C0OB8 r8) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.service.FriendsTabV3ServiceImpl.Ku(android.content.Context, X.0OB8):int");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final boolean Lu(Fragment fragment, Aweme aweme) {
        Fragment fragmentVu;
        FriendsV3PlayerAbility friendsV3PlayerAbility;
        if (aweme == null || !C1389300mG0.LJIIJ(fragment) || (fragmentVu = Vu()) == null || (friendsV3PlayerAbility = (FriendsV3PlayerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), FriendsV3PlayerAbility.class, null)) == null) {
            return false;
        }
        return friendsV3PlayerAbility.Vo0(aweme);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void Ou(Object obj, C1360330lVH c1360330lVH) {
        boolean z = true;
        if (c1360330lVH.LIZ.length() == 0) {
            return;
        }
        if (obj instanceof AbstractC1386130mAt) {
            AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) obj;
            abstractC1386130mAt.LIZIZ(c1360330lVH.LIZIZ());
            String str = abstractC1386130mAt.LIZ;
            if (str == null) {
                return;
            }
            switch (str.hashCode()) {
                case -1642623552:
                    if (!str.equals("post_comment")) {
                        return;
                    }
                    if (!Intrinsics.LJFF(c1360330lVH.LIZJ, "click_exposed_comment") && !Intrinsics.LJFF(c1360330lVH.LIZJ, "click_friends_quick_panel")) {
                        z = false;
                    }
                    abstractC1386130mAt.LJ("is_exposed_comment", C721230SQv.LIZ(Boolean.valueOf(z)));
                    if (!Intrinsics.LJFF(c1360330lVH.LIZ, "friends_v3_text_post_history")) {
                        return;
                    }
                    abstractC1386130mAt.LJ("enter_position", "text_publish_history_panel");
                    return;
                case -17674694:
                    if (!str.equals("video_play_finish") || !c1360330lVH.LIZ()) {
                        return;
                    }
                    abstractC1386130mAt.LJ("is_mute", CardStruct.IStatusCode.DEFAULT);
                    return;
                case 3321751:
                    if (!str.equals("like")) {
                        return;
                    }
                    break;
                case 1190532130:
                    if (!str.equals("like_cancel")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            if (Intrinsics.LJFF(c1360330lVH.LIZ, "friends_v3_repost_feeds_detail")) {
                abstractC1386130mAt.LJ("enter_method", "friends_collapse_reposts");
            }
            if (!Intrinsics.LJFF(c1360330lVH.LIZ, "friends_v3_text_post_history")) {
                return;
            }
            abstractC1386130mAt.LJ("enter_position", "text_publish_history_panel");
            return;
        }
        if (obj instanceof C2344009Gk) {
            C2344009Gk c2344009Gk = (C2344009Gk) obj;
            c2344009Gk.LJII(c1360330lVH.LIZIZ());
            String str2 = c1360330lVH.LIZIZ;
            if (str2 == null) {
                return;
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != -1347527995) {
                if (iHashCode != -492042573) {
                    if (iHashCode != 583135403 || !str2.equals("post_reply_comment")) {
                        return;
                    }
                } else {
                    if (!str2.equals("video_auto_replay") || !Intrinsics.LJFF(c1360330lVH.LIZ, "friends_v3_repost_feeds_detail")) {
                        return;
                    }
                    c2344009Gk.LJFF("enter_method", "friends_collapse_reposts");
                    return;
                }
            } else if (!str2.equals("view_comment")) {
                return;
            }
            if (!Intrinsics.LJFF(c1360330lVH.LIZJ, "click_exposed_comment") && !Intrinsics.LJFF(c1360330lVH.LIZJ, "click_friends_quick_panel")) {
                z = false;
            }
            c2344009Gk.LJFF("is_exposed_comment", C721230SQv.LIZ(Boolean.valueOf(z)));
            return;
        }
        if (!(obj instanceof JSONObject)) {
            return;
        }
        C1277904zJ.LIZ((JSONObject) obj, c1360330lVH);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void Wa(String str, String str2) {
        FriendsV3FeedListAbility friendsV3FeedListAbility;
        if (str == null) {
            return;
        }
        Fragment fragmentVu = Vu();
        if (fragmentVu != null && (friendsV3FeedListAbility = (FriendsV3FeedListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), FriendsV3FeedListAbility.class, null)) != null) {
            friendsV3FeedListAbility.Wa(str, str2);
        }
        FriendsV3FeedRepository.LIZ.getClass();
        FriendsV3FeedRepository.LJIIIZ.add(new C806580VkW(str, str2));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void ev(String str, EnumC1392960mLu enumC1392960mLu) {
        FriendsV3FeedListAbility friendsV3FeedListAbility;
        FriendsV3FeedListAbility friendsV3FeedListAbility2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeItemsByMuteType, muteType=");
        sbLIZ.append(enumC1392960mLu);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str == null) {
            return;
        }
        int i = C1393200mMI.LIZ[enumC1392960mLu.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    Fragment fragmentVu = Vu();
                    if (fragmentVu != null && (friendsV3FeedListAbility2 = (FriendsV3FeedListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), FriendsV3FeedListAbility.class, null)) != null) {
                        friendsV3FeedListAbility2.Nx2(str);
                    }
                    FriendsV3FeedRepository.LIZ.getClass();
                    FriendsV3FeedRepository.LJIIIZ.add(new AwS74S1000000_24(str, 21));
                    return;
                }
                throw new C1954807lC();
            }
            Fragment fragmentVu2 = Vu();
            if (fragmentVu2 != null && (friendsV3FeedListAbility = (FriendsV3FeedListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu2, null), FriendsV3FeedListAbility.class, null)) != null) {
                friendsV3FeedListAbility.k32(str);
            }
            FriendsV3FeedRepository.LIZ.getClass();
            FriendsV3FeedRepository.LJIIIZ.add(new AwS74S1000000_24(str, 20));
            return;
        }
        Kn(str);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void runDeferredRedDotTask(EnumC1586970rOp enumC1586970rOp, boolean z) {
        C1595430rcT c1595430rcT = C1595430rcT.LIZIZ;
        if (c1595430rcT.LIZIZ().redDotLogic().LJIJJLI()) {
            if (z) {
                C0W17.LIZJ("init", "runDeferredRedDotTasks, request reddot");
                c1595430rcT.LIZIZ().request(enumC1586970rOp);
            }
            if (!C296340BjU.LIZ() || enumC1586970rOp != EnumC1586970rOp.COLD_START) {
                C0CAU.LIZIZ(new Runnable() { // from class: X.0CUk
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FriendsV3InitExtKt@80f1.runDeferredRedDotTasks$1");
                        try {
                            C1595430rcT.LIZIZ.LIZIZ().polling();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FriendsV3InitExtKt@80f1.runDeferredRedDotTasks$1");
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    public final void bv(Context context, Aweme aweme, String str) {
        boolean z;
        boolean z2;
        new Object() { // from class: X.0rQv
        }.getClass();
        Music music = aweme.getMusic();
        if (music != null) {
            String mid = music.getMid();
            if (mid == null && (mid = music.getIdStr()) == null) {
                mid = "";
            }
            if (mid.length() != 0) {
                C2189821An6 c2189821An6LIZ = C0SUC.LIZ(context);
                if (aweme.getBottomBarModel() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (music.getMatchedPGCSoundInfo() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String strLIZ = C584760Mwc.LIZ(c2189821An6LIZ.getPreviousPage(), c2189821An6LIZ.getFromGroupId());
                if (strLIZ == null || strLIZ.length() <= 0) {
                    strLIZ = aweme.getAid();
                }
                String searchResultId = c2189821An6LIZ.getSearchResultId();
                if (searchResultId == null || searchResultId.length() <= 0) {
                    searchResultId = C735370Ssx.LIZJ(aweme);
                }
                C1383120m62 c1383120m62 = new C1383120m62();
                c1383120m62.LJIJI(aweme);
                c1383120m62.LJJIJL(context);
                c1383120m62.LIZLLL = str;
                c1383120m62.LJJZ = z;
                c1383120m62.LJJLIIIJILLIZJL = "click_name";
                C729980SkG.LJII(aweme);
                c1383120m62.LJJLIIIJL = aweme.getAid();
                c1383120m62.LJJLIIIJLLLLLLLZ = mid;
                c1383120m62.LJJLJLI = c2189821An6LIZ.getPreviousPage();
                c1383120m62.LJJLL = c2189821An6LIZ.getPreviousPagePosition();
                c1383120m62.LJLIL = z2;
                c1383120m62.LJJII = searchResultId;
                c1383120m62.LJJIJLIJ = c2189821An6LIZ.getSearchId();
                c1383120m62.LJLILLLLZI = c2189821An6LIZ.getCategoryName();
                c1383120m62.LJLJJI = false;
                c1383120m62.LJJLIIIIJ = strLIZ;
                c1383120m62.LJLJL = c2189821An6LIZ.getSearchEnterPosition();
                c1383120m62.LJLJLJ = C630980Ooy.LIZLLL(music);
                c1383120m62.LJJJJLI(aweme.getTtsVoiceIDs(), aweme.getTtsVoiceRefIDs());
                C1599640rjG.LIZIZ.Ou(c1383120m62, new C1360330lVH("friends_v3_feeds", null, null, null, 14));
                c1383120m62.LJIILJJIL();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dv(com.ss.android.ugc.aweme.friendstab.model.FriendsUserNewContent r13, X.EnumC1587000rOs r14, X.EnumC1586970rOp r15) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.service.FriendsTabV3ServiceImpl.dv(com.ss.android.ugc.aweme.friendstab.model.FriendsUserNewContent, X.0rOs, X.0rOp):void");
    }
}
