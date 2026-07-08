package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C019F;
import X.C01GW;
import X.C036E;
import X.C09R3;
import X.C0AIE;
import X.C0B5X;
import X.C0N0Y;
import X.C0N14;
import X.C0S7E;
import X.C1012040cRW;
import X.C109100bB;
import X.C1246900iYK;
import X.C1246920iYM;
import X.C1357130lQ7;
import X.C1389890mGx;
import X.C13LE;
import X.C1483410ohn;
import X.C14EU;
import X.C1558520qew;
import X.C1588110rQf;
import X.C1588330rR1;
import X.C1603960rqE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1888107aR;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C296380BjY;
import X.C452501pT;
import X.C692960RGc;
import X.C711950RwH;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C729510SjV;
import X.C735890Stn;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1357880lRK;
import X.InterfaceC1361270lWn;
import X.InterfaceC1554640qYg;
import X.InterfaceC1588310rQz;
import X.InterfaceC1588320rR0;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.ARunnableS24S0210000_24;
import android.app.ActivityOptions;
import android.app.SharedElementCallback;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.friendstab.playback.IFriendsV3PlaybackOwnership;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3DetailBridgeAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PageViewModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.AwS97S0110000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3DetailBridgeAssem extends BasePanelUIComponent implements FriendsV3DetailBridgeAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public String LLJIJIL;
    public int LLJILJIL = -1;
    public InterfaceC1588320rR0 LLJILJILJ;
    public boolean LLJILLL;
    public View LLJJ;
    public ARunnableS24S0210000_24 LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3DetailBridgeAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3PageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FriendsV3DetailBridgeAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3FeedListViewModel;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public FriendsV3DetailBridgeAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3PageViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 500), AFwS264S0000000_24.get$arr$(148), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FriendsV3FeedListViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 501), AFwS264S0000000_24.get$arr$(149), null, true);
        this.LLJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 497));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 498));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 502));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 499));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3DetailBridgeAbility
    public final void Du() {
        this.LLJILLL = false;
        ARunnableS24S0210000_24 aRunnableS24S0210000_24 = this.LLJJI;
        if (aRunnableS24S0210000_24 != null) {
            aRunnableS24S0210000_24.run();
        }
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1362108084) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3DetailBridgeAbility
    public final void Qa() {
        FriendsV3PlayerAbility friendsV3PlayerAbility;
        C1483410ohn c1483410ohnXc;
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        assemVMLazy.getValue().setStateImmediate(new AwS97S0110000_9(false, (C0N14) null, 10));
        C1012040cRW.LIZIZ().LIZ = null;
        FriendsV3PlayerAbility friendsV3PlayerAbility2 = (FriendsV3PlayerAbility) this.LLJJJIL.getValue();
        if (friendsV3PlayerAbility2 != null) {
            friendsV3PlayerAbility2.pe2();
        }
        if (((Boolean) C0B5X.LIZ.getValue()).booleanValue() && (friendsV3PlayerAbility = (FriendsV3PlayerAbility) this.LLJJJIL.getValue()) != null && (c1483410ohnXc = friendsV3PlayerAbility.xc()) != null) {
            c1483410ohnXc.LJJLI(false);
        }
        this.LLJJ = null;
        this.LLJJI = null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        C1012040cRW.LIZIZ().LIZ = null;
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3DetailBridgeAbility
    public final View Lr() {
        return this.LLJJ;
    }

    public final InterfaceC1588320rR0 Go(String str) {
        LinearLayoutManager linearLayoutManager;
        InterfaceC1588310rQz interfaceC1588310rQz;
        String aid;
        RecyclerView recyclerView = (RecyclerView) this.LLJJJ.getValue();
        if (recyclerView == null) {
            return null;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return null;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition >= 0 && iFindLastVisibleItemPosition >= 0 && iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
            while (true) {
                Object objFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                if ((objFindViewHolderForAdapterPosition instanceof InterfaceC1588310rQz) && (interfaceC1588310rQz = (InterfaceC1588310rQz) objFindViewHolderForAdapterPosition) != null) {
                    Aweme aweme = interfaceC1588310rQz.getAweme();
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid, str)) {
                        return interfaceC1588310rQz.Z0();
                    }
                }
                if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                    break;
                }
                iFindFirstVisibleItemPosition++;
            }
        }
        return null;
    }

    @C14EU
    public final void onDetailPhotoPositionChanged(C692960RGc c692960RGc) {
        if (c692960RGc == null) {
            return;
        }
        this.LLJIJIL = c692960RGc.LIZ;
        this.LLJILJIL = c692960RGc.LIZIZ;
        if (C296380BjY.LIZ()) {
            InterfaceC1588320rR0 interfaceC1588320rR0Go = Go(c692960RGc.LIZ);
            if (interfaceC1588320rR0Go != null) {
                interfaceC1588320rR0Go.LLJ(c692960RGc.LIZIZ);
                return;
            }
            return;
        }
        InterfaceC1588320rR0 interfaceC1588320rR0 = this.LLJILJILJ;
        if (interfaceC1588320rR0 == null) {
            return;
        }
        interfaceC1588320rR0.LLJ(c692960RGc.LIZIZ);
    }

    @C14EU
    public final void onInnerAwemeChanged(C1246900iYK c1246900iYK) {
        if (c1246900iYK == null) {
            return;
        }
        this.LLJJIJI = c1246900iYK.LIZ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0rGy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0O2L) obj).LLILLJJLI;
            }
        }, null, new AwS638S0100000_24(this, 32), 6);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3DetailBridgeAbility
    public final void wz1(InterfaceC1361270lWn interfaceC1361270lWn, C0N0Y c0n0y, View view, View view2, boolean z, Integer num, InterfaceC1588320rR0 interfaceC1588320rR0, final InterfaceC1588310rQz interfaceC1588310rQz) {
        C0N14 c0n14;
        String str;
        String authorUid;
        String authorUid2;
        Integer numValueOf;
        String requestId;
        String aid;
        Integer numValueOf2;
        String str2;
        String strLJII;
        Integer num2;
        Integer num3;
        Long l;
        Bundle bundle;
        Window window;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        int iIntValue = 0;
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (this.LLJILLL) {
                    return;
                }
                this.LLJILLL = true;
                C1012040cRW c1012040cRWLIZIZ = C1012040cRW.LIZIZ();
                if (num != null) {
                    c1012040cRWLIZIZ.LJIIL = num.intValue();
                }
                if (c0n0y != null) {
                    c1012040cRWLIZIZ.LIZ = c0n0y;
                    c1012040cRWLIZIZ.LIZIZ = interfaceC1361270lWn.getAweme().getAid();
                }
                this.LLJILJILJ = interfaceC1588320rR0;
                String strLIZ = C1588110rQf.LIZ(interfaceC1361270lWn);
                this.LLJJIII = strLIZ;
                Integer numValueOf3 = null;
                if (strLIZ == null || strLIZ.length() <= 0) {
                    strLIZ = null;
                }
                C1246920iYM.LIZ = strLIZ;
                C1246920iYM.LIZIZ = C1246920iYM.LIZ;
                if ((interfaceC1361270lWn instanceof InterfaceC1357880lRK) && !C296380BjY.LIZ()) {
                    final Aweme aweme = interfaceC1361270lWn.getAweme();
                    c0n14 = new C0N14(aweme, interfaceC1588310rQz) { // from class: X.0N12
                        public final Aweme LIZLLL;
                        public final InterfaceC1588310rQz LJ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C0N12)) {
                                return false;
                            }
                            C0N12 c0n12 = (C0N12) obj;
                            return Intrinsics.LJFF(this.LIZLLL, c0n12.LIZLLL) && Intrinsics.LJFF(this.LJ, c0n12.LJ);
                        }

                        public final int hashCode() {
                            int iHashCode = this.LIZLLL.hashCode() * 31;
                            InterfaceC1588310rQz interfaceC1588310rQz2 = this.LJ;
                            return iHashCode + (interfaceC1588310rQz2 == null ? 0 : interfaceC1588310rQz2.hashCode());
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Repost(repostAweme=");
                            sbLIZ.append(this.LIZLLL);
                            sbLIZ.append(", repostVH=");
                            sbLIZ.append(this.LJ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            super(aweme, true, interfaceC1588310rQz);
                            this.LIZLLL = aweme;
                            this.LJ = interfaceC1588310rQz;
                        }
                    };
                } else {
                    final Aweme aweme2 = interfaceC1361270lWn.getAweme();
                    c0n14 = new C0N14(aweme2, interfaceC1588310rQz) { // from class: X.0N11
                        public final Aweme LIZLLL;
                        public final InterfaceC1588310rQz LJ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C0N11)) {
                                return false;
                            }
                            C0N11 c0n11 = (C0N11) obj;
                            return Intrinsics.LJFF(this.LIZLLL, c0n11.LIZLLL) && Intrinsics.LJFF(this.LJ, c0n11.LJ);
                        }

                        public final int hashCode() {
                            int iHashCode = this.LIZLLL.hashCode() * 31;
                            InterfaceC1588310rQz interfaceC1588310rQz2 = this.LJ;
                            return iHashCode + (interfaceC1588310rQz2 == null ? 0 : interfaceC1588310rQz2.hashCode());
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Post(postAweme=");
                            sbLIZ.append(this.LIZLLL);
                            sbLIZ.append(", postVH=");
                            sbLIZ.append(this.LJ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            super(aweme2, true, interfaceC1588310rQz);
                            this.LIZLLL = aweme2;
                            this.LJ = interfaceC1588310rQz;
                        }
                    };
                }
                AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
                assemVMLazy.getValue().setStateImmediate(new AwS97S0110000_9(true, c0n14, 10));
                Aweme aweme3 = interfaceC1361270lWn.getAweme();
                ((HashMap) C711950RwH.LIZ.getValue()).put(aweme3.getAid(), aweme3);
                if (C296380BjY.LIZ()) {
                    C1603960rqE.LIZJ = this.LLJJIJIL.getValue();
                    IFriendsV3PlaybackOwnership iFriendsV3PlaybackOwnership = (IFriendsV3PlaybackOwnership) C1558520qew.LIZ(C1558520qew.LJIIL(this), IFriendsV3PlaybackOwnership.class, null);
                    if (iFriendsV3PlaybackOwnership != null) {
                        iFriendsV3PlaybackOwnership.rw0();
                    }
                }
                this.LLJJI = new ARunnableS24S0210000_24(this, z, view2, 0);
                this.LLJJ = view;
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "//aweme/detail");
                boolean z2 = interfaceC1361270lWn instanceof InterfaceC1357880lRK;
                if (z2 && !C296380BjY.LIZ()) {
                    str = "friends_v3_repost_detail";
                } else if (((Boolean) C0AIE.LIZ.getValue()).booleanValue()) {
                    str = "friends_v3_post_simple_detail";
                } else {
                    str = "friends_v3_post_normal_detail";
                }
                Bundle bundle2 = new Bundle();
                C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, interfaceC1361270lWn.getAweme().getAid(), bundle2);
                C786410Ut5.LJJJI("refer", "homepage_friends", bundle2);
                C786410Ut5.LJJJI("video_from", "from_friends_v3_feed", bundle2);
                C786410Ut5.LJJJI("enter_method", "click", bundle2);
                C786410Ut5.LJJJI("extra_previous_page", "homepage_friends", bundle2);
                C786410Ut5.LJJJI("friends_v3_detail_type", str, bundle2);
                bundle2.putInt("page_type", 31);
                smartRouteBuildRoute.withParam(bundle2);
                C1357130lQ7.LJFF(smartRouteBuildRoute, C724240Sb0.LJI(this));
                if (C729510SjV.LJJIJIL(interfaceC1361270lWn.getAweme())) {
                    HashMap mapLJI = C2097608Jq.LJI(new Pair("enter_position", "feed"));
                    if (interfaceC1361270lWn.getAweme().getAid() != null) {
                        mapLJI.put("story_target_aid", interfaceC1361270lWn.getAweme().getAid());
                    }
                    smartRouteBuildRoute.withParam("feed_param_extra", mapLJI);
                }
                String aid2 = interfaceC1361270lWn.getAweme().getAid();
                if (view2 != null) {
                    if (C1888107aR.LIZ()) {
                        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                        if (c19egLIZ2 != null && (window = c19egLIZ2.getWindow()) != null) {
                            window.setSharedElementsUseOverlay(false);
                        }
                        C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
                        if (c19egLIZ3 != null) {
                            c19egLIZ3.setExitSharedElementCallback((SharedElementCallback) this.LLJJJJJIL.getValue());
                        }
                        view2.setTransitionName(C1888107aR.LIZIZ(num, aid2));
                        bundle = ActivityOptions.makeSceneTransitionAnimation(C724240Sb0.LIZ(this), view2, view2.getTransitionName()).toBundle();
                    } else {
                        bundle = ActivityOptions.makeScaleUpAnimation(view2, view2.getWidth() / 2, view2.getHeight() / 2, 0, 0).toBundle();
                    }
                    if (bundle != null) {
                        smartRouteBuildRoute.withBundleAnimation(bundle);
                        smartRouteBuildRoute.withParam("activity_has_activity_options", true);
                    }
                }
                smartRouteBuildRoute.open();
                Aweme aweme4 = interfaceC1361270lWn.getAweme();
                boolean zLJJIJIL = C729510SjV.LJJIJIL(aweme4);
                if (aweme4 != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme4);
                } else {
                    authorUid = null;
                }
                C735890Stn c735890StnLIZJ = C1588330rR1.LIZJ(authorUid);
                if (!zLJJIJIL) {
                    c735890StnLIZJ = null;
                }
                C109100bB c109100bB = C109100bB.LIZ;
                Pair[] pairArr = new Pair[13];
                pairArr[0] = new Pair("enter_from", "homepage_friends");
                if (aweme4 != null) {
                    authorUid2 = AwemeExtKt.getAuthorUid(aweme4);
                } else {
                    authorUid2 = null;
                }
                pairArr[1] = new Pair("author_id", authorUid2);
                if (aweme4 != null) {
                    numValueOf = Integer.valueOf(aweme4.getAwemeType());
                } else {
                    numValueOf = null;
                }
                pairArr[2] = new Pair("aweme_type", numValueOf);
                if (aweme4 != null) {
                    requestId = aweme4.getRequestId();
                } else {
                    requestId = null;
                }
                pairArr[3] = new Pair("request_id", requestId);
                if (aweme4 != null) {
                    aid = aweme4.getAid();
                } else {
                    aid = null;
                }
                pairArr[4] = new Pair("group_id", aid);
                if (aweme4 != null) {
                    numValueOf2 = Integer.valueOf(C0S7E.LIZ(aweme4));
                } else {
                    numValueOf2 = null;
                }
                pairArr[5] = new Pair("pic_cnt", numValueOf2);
                if (num != null) {
                    iIntValue = num.intValue() + 1;
                }
                pairArr[6] = new Pair("pic_location", Integer.valueOf(iIntValue));
                pairArr[7] = new Pair("is_recommend", Boolean.valueOf(z2));
                if (zLJJIJIL) {
                    str2 = "story";
                } else {
                    str2 = "post";
                }
                pairArr[8] = new Pair("story_type", str2);
                if (zLJJIJIL && aweme4 != null) {
                    strLJII = C729510SjV.LJII(aweme4);
                } else {
                    strLJII = null;
                }
                pairArr[9] = new Pair("story_collection_id", strLJII);
                if (c735890StnLIZJ != null) {
                    num2 = c735890StnLIZJ.LIZ;
                } else {
                    num2 = null;
                }
                pairArr[10] = new Pair("story_start_num", num2);
                if (c735890StnLIZJ != null) {
                    num3 = c735890StnLIZJ.LIZIZ;
                } else {
                    num3 = null;
                }
                pairArr[11] = new Pair("story_current_num", num3);
                if (c735890StnLIZJ != null && (l = c735890StnLIZJ.LIZJ) != null) {
                    numValueOf3 = Integer.valueOf((int) l.longValue());
                }
                pairArr[12] = new Pair("item_cnt", numValueOf3);
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                c109100bB.getClass();
                C109100bB.LIZ("ttsocial_friend_tab_detail_page_enter", mapLJIIIIZZ);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
        c1389890mGx.LJIIIZ(2131837962);
        c1389890mGx.LJIIJJI();
    }
}
