package com.ss.android.ugc.aweme.friendstab.ui;

import X.AbstractC1255880imo;
import X.AbstractC1591090rVT;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C034I;
import X.C098200Yq;
import X.C09JN;
import X.C0AI1;
import X.C0N05;
import X.C0NMC;
import X.C0O0R;
import X.C0PN1;
import X.C0QSJ;
import X.C0R9P;
import X.C0S4U;
import X.C0SP9;
import X.C0SU6;
import X.C0SZ8;
import X.C0T0L;
import X.C0TJ8;
import X.C0TNP;
import X.C0VWW;
import X.C0XQ7;
import X.C1058560deY;
import X.C1072300e0i;
import X.C1073840e3C;
import X.C1074010e3T;
import X.C1150504el;
import X.C11NJ;
import X.C1209450hZv;
import X.C1255920ims;
import X.C1361830lXh;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1392890mLn;
import X.C1393100mM8;
import X.C1440005kM;
import X.C1492500owS;
import X.C1492520owU;
import X.C1492540owW;
import X.C14EU;
import X.C1514430pVp;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559540qga;
import X.C1564710qov;
import X.C1568310quj;
import X.C1576740r8K;
import X.C1578630rBN;
import X.C1583460rJA;
import X.C1583510rJF;
import X.C1587150rP7;
import X.C1587320rPO;
import X.C1587330rPP;
import X.C1587360rPS;
import X.C1587380rPU;
import X.C1587420rPY;
import X.C1587590rPp;
import X.C1587710rQ1;
import X.C1587740rQ4;
import X.C1587800rQA;
import X.C1587810rQB;
import X.C1588880rRu;
import X.C1589640rT8;
import X.C1591220rVg;
import X.C1591880rWk;
import X.C1595430rcT;
import X.C1618440sDa;
import X.C1620930sHb;
import X.C1668306g5;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20639086r;
import X.C20673215v0;
import X.C2174641A8w;
import X.C2187451AjH;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2214201BlK;
import X.C2277891EDz;
import X.C23250099c;
import X.C2344809Gs;
import X.C281310B0v;
import X.C289010BUl;
import X.C294470BgT;
import X.C295190Bhd;
import X.C305290Bxv;
import X.C343710Ddh;
import X.C418440Gaw;
import X.C437630HEb;
import X.C442570HXb;
import X.C452501pT;
import X.C486860J7k;
import X.C497820Jfg;
import X.C587460N2i;
import X.C614770O9j;
import X.C616540OGe;
import X.C673150Qan;
import X.C680080Qly;
import X.C687700QyG;
import X.C688120Qyw;
import X.C690440R6k;
import X.C714530S1b;
import X.C723850SaN;
import X.C737030Svd;
import X.C757610Tnj;
import X.C786410Ut5;
import X.C818480W8w;
import X.C888460YtI;
import X.C993610bxn;
import X.EnumC1392960mLu;
import X.EnumC1584370rKd;
import X.EnumC1588660rRY;
import X.EnumC1609900rzo;
import X.EnumC439790HMj;
import X.InterfaceC1055110dYz;
import X.InterfaceC1146704e9;
import X.InterfaceC1209460hZw;
import X.InterfaceC1392880mLm;
import X.InterfaceC1393170mMF;
import X.InterfaceC1447760nmI;
import X.InterfaceC1571580r00;
import X.InterfaceC1581920rGg;
import X.InterfaceC1581960rGk;
import X.InterfaceC1587410rPX;
import X.InterfaceC1587430rPZ;
import X.InterfaceC1587520rPi;
import X.InterfaceC1591870rWj;
import X.InterfaceC20660615sy;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC729460SjQ;
import X.InterfaceC988100bou;
import X.ViewTreeObserverOnPreDrawListenerC1620770sHL;
import Y.ALAdapterS12S0100000_16;
import Y.ARunnableS109S0100000_9;
import Y.AUListenerS15S0100001_24;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.FeedSkylightDrawerLogicAbility;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedInsertRelationManager;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner$fragmentLifeCycle$1;
import com.ss.android.ugc.aweme.friendstab.tab.TopFriendsFeedScrollProfileStrategy;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import com.ss.android.ugc.aweme.friendstab.utils.FriendsFeedScope;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.service.IFeedSkylightCommonService;
import com.ss.android.ugc.aweme.service.IFriendsTabDebugService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.story.homepage.StoryMainTrackService;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.RefreshPanelComponent;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarEffectPopupService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class SocialFriendsFeedFragment extends BaseFeedListFragment implements InterfaceC1055110dYz, InterfaceC988100bou, InterfaceC1591870rWj, InterfaceC1587520rPi, InterfaceC1587410rPX, InterfaceC20660615sy, C0T0L<Aweme>, IFeedSkylightHostAbility, InterfaceC1393170mMF, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiM+ICo9LDY4HELIOSKC19PSxiGiAwISQgDz06LSsoOgk2LSEKOy40JSAiPQ==";
    public C1587320rPO LLJI;
    public InterfaceC1209460hZw LLJIJIL;
    public FrameLayout LLJILJIL;
    public long LLJILJILJ;
    public long LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C1587590rPp LLJJIJIL;
    public long LLJJJJ;
    public boolean LLJJJJJIL;
    public C1587330rPP LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public ObjectAnimator LLJZIJLIL;
    public final C11NJ LLIZ = new C11NJ();
    public String LLIZLLLIL = "";
    public final FriendsFeedFragmentPanel LLJ = new FriendsFeedFragmentPanel();
    public String LLJILLL = "auto";
    public final int LLJJ = LivePreCreateNextRoomPlayer.ENABLE;
    public final C01GW LLJJJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(169));
    public long LLJJJIL = -1;
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(194));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 441));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 440));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 443));
    public final String LLL = "friends";

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final void Hf0() {
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final String MR() {
        return "a2270.b4108";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final void Mv1() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final boolean Qx1() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void SR() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final void Zs(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final void bg0(int i) {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{FriendsFeedScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FriendsFeedScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FriendsFeedScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC1393170mMF
    public final void l4() {
        this.LLJJL = true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC1591870rWj
    public final String wm() {
        return "SocialFriendsFeedFragment";
    }

    @Override // X.InterfaceC988100bou
    public final boolean Ci() {
        return this.LLJ.LLJJ();
    }

    @Override // X.InterfaceC1587410rPX
    public final boolean D1() {
        C1073840e3C c1073840e3C;
        C1074010e3T emptyPagePowerListFromXml;
        Integer numValueOf;
        FriendsFeedFragmentPanel friendsFeedFragmentPanel = this.LLJ;
        return (!friendsFeedFragmentPanel.c0 || (c1073840e3C = friendsFeedFragmentPanel.d0) == null || (emptyPagePowerListFromXml = c1073840e3C.getEmptyPagePowerListFromXml()) == null || (numValueOf = Integer.valueOf(emptyPagePowerListFromXml.computeVerticalScrollOffset())) == null || numValueOf.intValue() <= 0) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final Aweme G3() {
        return this.LLJ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final boolean KU() {
        return this.LLJ.LLJJIJI.getCurrentItem() == 0;
    }

    @Override // X.InterfaceC1587410rPX
    public final boolean LLLLLLL() {
        return (this.LLJ.LJLIL() instanceof C0N05) || this.LLJ.c0;
    }

    @Override // X.InterfaceC1587410rPX
    public final String Y() {
        return ((InterfaceC1587430rPZ) this.LLJL.getValue()).Y();
    }

    public final void ZR() {
        boolean z;
        Intent intent;
        boolean z2 = true;
        if (!this.LLJJIJIIJIL && !LLLLLLL()) {
            C614770O9j c614770O9j = C614770O9j.LIZIZ;
            if (c614770O9j.LJ().LJJII(this) || C1589640rT8.LIZIZ.O2()) {
                c614770O9j.LJ().LJJIIJZLJL(0, this, false);
            } else if (this.LLJ.LLJJIJI.getCurrentItem() == 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJILJILJ;
                SettingsManager.LIZLLL().getClass();
                z = jCurrentTimeMillis >= SettingsManager.LJFF("skylight_warm_start_refresh_interval", 30000L);
            }
        }
        C19EG activity = getActivity();
        InsertStory insertStoryLIZ = (activity == null || (intent = activity.getIntent()) == null) ? null : C1587800rQA.LIZ(intent);
        if (z) {
            if (insertStoryLIZ == null) {
                z2 = false;
            }
        } else if (insertStoryLIZ == null) {
            return;
        }
        this.LLJJIII = z2;
        C614770O9j.LIZIZ.LJ().LJIIJ(this, "auto", 0, insertStoryLIZ);
        this.LLJILJILJ = System.currentTimeMillis();
    }

    public final void aS() {
        LifecycleOwner lifecycleOwnerLIZIZ;
        LifecycleCoroutineScope lifecycleScope;
        C0TNP.LIZ.getClass();
        if (C0TNP.LIZ()) {
            if (IMainSAFLifecycleKt.getEnableFragmentSAFLifecycleRefactor()) {
                lifecycleOwnerLIZIZ = this;
            } else {
                Context context = getContext();
                if (context == null) {
                    return;
                } else {
                    lifecycleOwnerLIZIZ = C1388190mED.LIZIZ(context);
                }
            }
            if (lifecycleOwnerLIZIZ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZIZ)) == null) {
                return;
            }
            C23250099c.LIZLLL(lifecycleScope, null, null, new C757610Tnj(this, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cS() {
        /*
            r10 = this;
            long r3 = r10.LL
            r0 = -1
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r6 = 0
            if (r2 == 0) goto Lab
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r10.LL
            long r4 = r4 - r2
            long r2 = r10.LLJJJJ
            long r4 = r4 - r2
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L25
            r10.getContext()
            java.lang.String r8 = "stay_time"
            java.lang.String r9 = r10.LLILLJJLI
            X.C20684815ws.LJIIIZ(r4, r6, r8, r9)
            r10.PR(r4)
        L25:
            r10.LL = r0
            r10.LLJJJIL = r0
            r10.LLJJJJ = r6
        L2b:
            X.0rT8 r2 = X.C1589640rT8.LIZIZ
            boolean r0 = r2.shouldShowFriendsTab()
            r1 = 1
            if (r0 == 0) goto L48
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L48
            X.0rQ4 r0 = X.C1587740rQ4.LIZ
            r0.getClass()
            boolean r0 = X.C1587740rQ4.LJIJI
            if (r0 != 0) goto L48
            X.C1587740rQ4.LJJII = r1
            X.0rH4<V> r0 = X.CallableC1582160rH4.LL
            X.C15O7.LIZJ(r0)
        L48:
            boolean r0 = r2.F2()
            if (r0 == 0) goto L94
            X.0rcT r0 = X.C1595430rcT.LIZIZ
            com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService r0 = r0.LIZIZ()
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.getNoticeSnapshotBeforeEnterTab()
            if (r0 == 0) goto La6
            java.util.Iterator r3 = r0.iterator()
        L5e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter r0 = (com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter) r0
            java.lang.String r1 = r0.tag
            java.lang.String r0 = "FRIENDS_FEED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5e
        L75:
            com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter r2 = (com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter) r2
            if (r2 == 0) goto La6
            int r3 = r2.numberCount
            if (r3 <= 0) goto La2
            r1 = 1
        L7e:
            boolean r0 = r2.showGuideRedDot
            if (r1 != 0) goto L84
            if (r0 == 0) goto La7
        L84:
            r2 = 1
            if (r0 == 0) goto L9d
            java.lang.String r7 = "red_dot"
        L89:
            X.0mXn r0 = X.C1400330mXn.LIZ
            java.lang.String r8 = "homepage_friends"
            r6 = 0
            r0.getClass()
            X.C1400330mXn.LJ(r2, r3, r4, r6, r7, r8)
        L94:
            X.0mXn r0 = X.C1400330mXn.LIZ
            r0.getClass()
            X.C1400330mXn.LJIIIZ()
            return
        L9d:
            if (r1 == 0) goto La8
            java.lang.String r7 = "number_dot"
            goto L89
        La2:
            r1 = 0
            goto L7e
        La4:
            r2 = 0
            goto L75
        La6:
            r3 = 0
        La7:
            r2 = 0
        La8:
            java.lang.String r7 = ""
            goto L89
        Lab:
            r4 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment.cS():void");
    }

    public final C1587320rPO gS() {
        C1587320rPO c1587320rPO = this.LLJI;
        if (c1587320rPO != null) {
            return c1587320rPO;
        }
        return null;
    }

    @Override // X.InterfaceC1587410rPX
    public final boolean LJIIJJI() {
        return gS().LIZLLL.LJIIIIZZ();
    }

    @Override // X.InterfaceC1587520rPi
    public final void N8() {
        C1587810rQB c1587810rQB;
        Intent intent;
        Intent intent2;
        if ((C295190Bhd.LIZ() || ((Number) C0AI1.LIZ.getValue()).intValue() > 0) && System.currentTimeMillis() - this.LLJJI < this.LLJJ) {
            return;
        }
        this.LLJJI = System.currentTimeMillis();
        C19EG activity = getActivity();
        List<FriendsFeed> list = null;
        InsertStory insertStoryLIZ = (activity == null || (intent2 = activity.getIntent()) == null) ? null : C1587800rQA.LIZ(intent2);
        if (C587460N2i.LIZ(getActivity(), "FRIENDS_FEED")) {
            this.LLJILLL = "publish_landing";
            C19EG activity2 = getActivity();
            if (activity2 != null && (intent = activity2.getIntent()) != null) {
                intent.removeExtra("story_publish_landing_tab");
            }
        }
        if (LLLLLLL()) {
            if ((C1587360rPS.LJFF || C305290Bxv.LIZ() || C1595430rcT.LIZIZ.LIZ().LIZ()) && !this.LLJJIII) {
                C614770O9j.LIZIZ.LJ().LJIIJ(this, this.LLJILLL, 0, insertStoryLIZ);
                return;
            }
            return;
        }
        if (!this.LLJJIII) {
            C614770O9j.LIZIZ.LJ().LJIIJ(this, this.LLJILLL, 0, insertStoryLIZ);
        }
        this.LLJJLIIIJLLLLLLLZ = true;
        C1587710rQ1 c1587710rQ1DS = dS();
        if (c1587710rQ1DS != null && (c1587810rQB = (C1587810rQB) c1587710rQ1DS.LL) != null) {
            list = c1587810rQB.LLILLJJLI;
        }
        C0O0R c0o0r = C0O0R.LIZ;
        c0o0r.getClass();
        try {
            if (C0O0R.LJI) {
                C0O0R.LJI = false;
            } else {
                c0o0r.LIZJ(list);
                C189200o6.m2constructorimpl(Unit.LIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1587410rPX
    public final void Rd() {
        if (LLLLLLL()) {
            return;
        }
        FriendsFeedFragmentPanel friendsFeedFragmentPanel = this.LLJ;
        friendsFeedFragmentPanel.LLLLJI(friendsFeedFragmentPanel.LLLLLJLJLL(), null, "tab_friends", false);
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        if (getActivity() == null) {
            return false;
        }
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    public final C1587710rQ1 dS() {
        HomeFeedComponent homeFeedComponentVR = VR();
        C1255920ims<?> c1255920imsKB1 = homeFeedComponentVR != null ? homeFeedComponentVR.KB1() : null;
        if (c1255920imsKB1 instanceof C1587710rQ1) {
            return (C1587710rQ1) c1255920imsKB1;
        }
        return null;
    }

    public final boolean hS() {
        T t = gS().LIZLLL.LL;
        return t != 0 && ((C1587810rQB) t).LLJILLL;
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        Context context = getContext();
        if (context != null) {
            return new C688120Qyw(context, this, null);
        }
        return null;
    }

    public final void kS() {
        if (C281310B0v.LIZ()) {
            C614770O9j c614770O9j = C614770O9j.LIZIZ;
            c614770O9j.LJ().LJIILL(this, true, "publish_landing", 0, true, true, null);
            this.LLJJIJIIJIL = true;
            c614770O9j.LJ().LJIJI(0, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() throws IllegalAccessException {
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJ;
        List<ISocialTabProtocol> listB9;
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        this.LLIZ.dispose();
        C1618440sDa.LIZIZ.LJJIFFI().LJIIL("FriendsFeedFragment");
        ISocialTabProtocol iSocialTabProtocol = null;
        C1558520qew.LJIIJ(this, FriendsFeedScope.class, IFeedSkylightHostAbility.class, null);
        C1392890mLn c1392890mLn = C1392890mLn.LIZ;
        C1587330rPP c1587330rPP = this.LLJJJJLIIL;
        c1392890mLn.getClass();
        C1392890mLn.LJII(c1587330rPP);
        this.LLJJJJLIIL = null;
        if (C1591220rVg.LIZLLL()) {
            MainBusinessAbility mainBusinessAbility = (MainBusinessAbility) this.LLJLLL.getValue();
            if (mainBusinessAbility != null) {
                mainBusinessAbility.XA((C1583460rJA) this.LLJZ.getValue());
            }
            Context context = getContext();
            if (context != null && (iSocial2TabProtocolAbilityLJ = C1583510rJF.LJ(context)) != null && (listB9 = iSocial2TabProtocolAbilityLJ.b9()) != null) {
                Iterator<ISocialTabProtocol> it2 = listB9.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ISocialTabProtocol next = it2.next();
                    if (Intrinsics.LJFF(next.getTag(), "FRIENDS_FEED")) {
                        iSocialTabProtocol = next;
                        break;
                    }
                }
                ISocialTabProtocol iSocialTabProtocol2 = iSocialTabProtocol;
                if (iSocialTabProtocol2 != null) {
                    iSocialTabProtocol2.L();
                }
            }
        }
        ((InterfaceC1587430rPZ) this.LLJL.getValue()).onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ.onDestroyView();
        InterfaceC1209460hZw interfaceC1209460hZw = this.LLJIJIL;
        if (interfaceC1209460hZw != null) {
            ((C1492540owW) interfaceC1209460hZw).LIZ();
        }
        C0R9P.LIZJ(EnumC1609900rzo.TAB_FRIENDS);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (C1589640rT8.LIZIZ.l2() && this.LL != -1 && this.LLJJJIL == -1) {
            this.LLJJJIL = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() throws Throwable {
        Window window;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SocialFriendsFeedFragment.class.getName());
        }
        if (!C1589640rT8.LIZIZ.l2()) {
            this.LLJ.f373J = false;
            super.onResume();
            setUserVisibleHint(false);
            this.LLJ.setUserVisibleHint(false);
            return;
        }
        this.LLJ.f373J = true;
        super.onResume();
        this.LLJ.f373J = false;
        setUserVisibleHint(true);
        this.LLJ.setUserVisibleHint(true);
        if (getUserVisibleHint() && isResumed()) {
            C1514430pVp.LJFF(EnumC1584370rKd.FRIENDS_TAB);
            C1440005kM.LIZ(new C1568310quj(1, this.LLJ.LJIIIIZZ(), this.LLJ));
        }
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setBackgroundDrawableResource(R.color.b6);
        }
        aS();
        if (this.LLJJIJI) {
            ZR();
        }
        if (this.LLJJJIL != -1) {
            this.LLJJJJ += System.currentTimeMillis() - this.LLJJJIL;
            this.LLJJJIL = -1L;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<InterfaceC1581960rGk> registerComponents() {
        SparseArray<InterfaceC1581960rGk> sparseArrayRegisterComponents = super.registerComponents();
        sparseArrayRegisterComponents.append(C0SU6.LIZJ, this.LLJ);
        return sparseArrayRegisterComponents;
    }

    @Override // X.InterfaceC1587410rPX
    public final void xO() {
        gS().LIZIZ = true;
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return this.LLL;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final void B41(boolean z) {
        this.LLJJIII = false;
        this.LLJJIJI = true;
        if (!((C1587810rQB) gS().LIZLLL.LL).LLIZ) {
            C1587360rPS.LJI = null;
        }
        if (z) {
            int iLJJIJ = ((IFeedSkylightCommonService) this.LLJJJ.getValue()).LJJIJ(this);
            C0O0R.LIZ.getClass();
            try {
                if (C0O0R.LIZLLL == -1) {
                    C0O0R.LIZLLL(iLJJIJ);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void NR(boolean z) {
        C1440005kM.LIZ(new C1568310quj(2, this.LLJ.LJIIIIZZ(), this.LLJ));
        this.LLJ.h(z);
        NoNetDetectHelper.LJIIIZ.set(false);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean Oi(boolean z) {
        boolean z2;
        C19EG activity = null;
        if (C1589640rT8.LIZIZ.V1()) {
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity2);
                c1389890mGx.LJIIIZ(2131834940);
                c1389890mGx.LJIIJJI();
                AbstractC1591090rVT abstractC1591090rVTY01 = C1591880rWk.LIZIZ.LJIILL(activity2).y01();
                if (abstractC1591090rVTY01 != null) {
                    abstractC1591090rVTY01.LJJIJIL("HOME");
                }
            }
            InterfaceC665370Q7z interfaceC665370Q7zLJ = C1578630rBN.LJ(this);
            if (interfaceC665370Q7zLJ != null) {
                int i = RefreshPanelComponent.LLJJIII;
                IRefreshAbility iRefreshAbility = (IRefreshAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IRefreshAbility.class, null);
                if (iRefreshAbility != null) {
                    iRefreshAbility.setRefreshing(false);
                }
            }
            return true;
        }
        if (!super.Oi(z)) {
            return false;
        }
        C1587320rPO c1587320rPOGS = gS();
        C19EG activity3 = getActivity();
        if (activity3 != null && C486860J7k.LIZIZ(activity3).FQ2("page_feed") && C1559540qga.LIZIZ(activity3)) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = !z2;
        boolean z4 = this.LLJLIL;
        C1587710rQ1 c1587710rQ1 = c1587320rPOGS.LIZLLL;
        C1587810rQB c1587810rQB = (C1587810rQB) c1587710rQ1.LL;
        if (c1587810rQB != null) {
            c1587810rQB.LL = z;
        }
        c1587710rQ1.LLILZIL = z;
        c1587710rQ1.LLJ = z3;
        c1587320rPOGS.LIZJ = z4;
        C1587710rQ1 c1587710rQ12 = c1587320rPOGS.LIZLLL;
        boolean z5 = c1587320rPOGS.LIZIZ;
        boolean z6 = c1587320rPOGS.LIZJ;
        c1587710rQ12.getClass();
        C1587420rPY c1587420rPYLIZIZ = C1587360rPS.LIZIZ(z6);
        String strConsume = FeedInsertRelationManager.INSTANCE.consume(true);
        C1587380rPU c1587380rPU = new C1587380rPU(1, C0NMC.REFRESH.getType(), C0TJ8.LIZJ("feed").LJ());
        c1587380rPU.LIZIZ = c1587420rPYLIZIZ.LIZ;
        c1587380rPU.LIZJ = strConsume;
        c1587380rPU.LJ = c1587420rPYLIZIZ.LIZIZ;
        c1587380rPU.LJFF = z5;
        c1587380rPU.LJI = z6;
        c1587710rQ1.LIZJ(1, c1587380rPU.LIZ());
        EnumC1609900rzo enumC1609900rzo = EnumC1609900rzo.TAB_FRIENDS;
        Fragment fragment = c1587320rPOGS.LIZ;
        if (fragment != null) {
            activity = fragment.getActivity();
        }
        C0R9P.LIZLLL(enumC1609900rzo, activity);
        if (C1492500owS.LIZ()) {
            C1492520owU.LIZ();
        }
        if (!z) {
            C1595430rcT.LIZIZ.LIZIZ().visitSingleFeed("FRIENDS_FEED");
        }
        C1440005kM.LIZ(new C1072300e0i());
        if (z) {
            C0O0R.LIZ.getClass();
            C0O0R.LJI = true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1587410rPX
    public final int Ph(Aweme aweme) {
        T t = gS().LIZLLL.LL.mData;
        if (t != 0 && ((FriendsFeedResponse) t).friendFeedData != null) {
            try {
                List<FriendsFeed> list = ((FriendsFeedResponse) t).friendFeedData;
                if (list != null) {
                    for (FriendsFeed friendsFeed : list) {
                        Aweme aweme2 = friendsFeed.getAweme();
                        int source = friendsFeed.getSource();
                        if (aweme2 != null && TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                            return source;
                        }
                    }
                    return 0;
                }
                return 0;
            } catch (ConcurrentModificationException e) {
                TryCatchGuardChecker.doCheck(e);
                return 0;
            }
        }
        return 0;
    }

    @Override // X.InterfaceC1587410rPX
    public final void R1(boolean z) {
        FriendsFeedFragmentPanel friendsFeedFragmentPanel = this.LLJ;
        friendsFeedFragmentPanel.b0 = z;
        if (z) {
            friendsFeedFragmentPanel.LLLLLLLLLL();
        } else {
            friendsFeedFragmentPanel.tryResumePlay();
        }
    }

    public final void S1(boolean z) {
        T t;
        Window window;
        if (getUserVisibleHint() && isViewValid()) {
            NoNetDetectHelper.LJIIIZ.set(true);
            RR();
            C1440005kM.LIZ(new C1568310quj(1, this.LLJ.LJIIIIZZ(), this.LLJ));
            if (this.LLJJIJI) {
                ZR();
            }
            if (z) {
                this.LLJ.tryResumePlay();
                Aweme awemeLJIIIIZZ = this.LLJ.LJIIIIZZ();
                if (awemeLJIIIIZZ != null && C1589640rT8.LIZIZ.F2()) {
                    C714530S1b c714530S1b = new C714530S1b(awemeLJIIIIZZ);
                    c714530S1b.LIZIZ = true;
                    C1440005kM.LIZ(c714530S1b);
                }
            } else {
                T t2 = gS().LIZLLL.LL;
                if (t2 != 0 && ((AbstractC1255880imo) t2).isDataEmpty() && (t = gS().LIZLLL.LL) != 0 && ((AbstractC1255880imo) t).isDataEmpty()) {
                    Oi(false);
                }
                this.LLJ.g();
            }
            C0SZ8 c0sz8K4 = k4();
            if (c0sz8K4 != null) {
                c0sz8K4.LJLLILLLL();
            }
            Db(false);
            C19EG activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setBackgroundDrawableResource(R.color.b6);
            }
            ((CommentService) ServiceManager.get().getService(CommentService.class)).LJJJJJL(getContext(), this.LLJ.LJIIIIZZ(), this.LLJ.LLLLIIIILLL, new AwS568S0100000_24(this, 442));
        }
    }

    @Override // X.C0T0L
    public final void Tv(C0PN1<Aweme> c0pn1) {
        C1587710rQ1 c1587710rQ1DS = dS();
        if (c1587710rQ1DS != null) {
            List<Aweme> list = c0pn1.LIZ;
            int i = c0pn1.LIZIZ;
            T t = c1587710rQ1DS.LL;
            if (t != 0) {
                ((AbstractC1255880imo) t).insertItemList(list, i);
            }
        }
    }

    public final void WR(Bundle bundle) {
        String string;
        C19EG c19egLIZIZ;
        Intent intent;
        String string2 = null;
        if (bundle != null) {
            string = bundle.getString("push_label");
        } else {
            string = null;
        }
        String strValueOf = String.valueOf(string);
        this.LLIZLLLIL = strValueOf;
        if (TextUtils.isEmpty(strValueOf) || Intrinsics.LJFF("null", this.LLIZLLLIL)) {
            Context context = getContext();
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (intent = c19egLIZIZ.getIntent()) != null) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        string2 = extras.getString("push_label", "");
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            this.LLIZLLLIL = String.valueOf(string2);
        }
        Aweme awemeLJIIIIZZ = this.LLJ.LJIIIIZZ();
        if (awemeLJIIIIZZ != null) {
            AwemeExtKt.appendMobParam(awemeLJIIIIZZ, "push_label", this.LLIZLLLIL);
        }
    }

    public final void bS(Bundle bundle) {
        C19EG activity;
        Bundle bundleEQ2;
        String string = bundle.getString("fromStart", "");
        if ((string == null || string.length() == 0) && (activity = getActivity()) != null && (bundleEQ2 = C343710Ddh.LIZ(activity).EQ2()) != null) {
            C786410Ut5.LJJIIJZLJL(bundle, bundleEQ2);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockAccount(C888460YtI c888460YtI) {
        User user = c888460YtI.LIZ;
        if (user != null) {
            List<Aweme> listK = this.LLJ.K(user.getUid());
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : listK) {
                if (!AwemeBizExtKt.isRecBigCardFakeAweme(aweme)) {
                    arrayList.add(aweme);
                }
            }
            if (!arrayList.isEmpty()) {
                int iLJIJJ = gS().LIZLLL.LJIJJ(arrayList);
                List<String> listLJIJJLI = gS().LIZLLL.LJIJJLI();
                if (listLJIJJLI != null && iLJIJJ == listLJIJJLI.size() && gS().LIZLLL.LJIIIIZZ()) {
                    gS().LIZIZ();
                }
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C1588880rRu c1588880rRu) {
        if (!c1588880rRu.LIZIZ.contains(EnumC1588660rRY.FRIEND)) {
            return;
        }
        C1587380rPU c1587380rPU = new C1587380rPU(1, C0NMC.REFRESH.getType(), C0TJ8.LIZJ("feed").LJ());
        c1587380rPU.LJFF = true;
        gS().LIZLLL.LIZJ(1, c1587380rPU.LIZ());
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) throws Throwable {
        String string;
        bS(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("com.ss.android.ugc.aweme.intent.extra.TAB_HOX_AND_PROTOCOL_TAG");
        } else {
            string = null;
        }
        C1564710qov.LIZ(this, bundle, string, new AwS603S0100000_24(this, 76));
        String string2 = bundle.getString("fromStart", "");
        boolean z = bundle.getBoolean("slide", false);
        boolean z2 = bundle.getBoolean("click_top_tab", false);
        boolean z3 = bundle.getBoolean("manual", false);
        String string3 = bundle.getString("enterMethod", "");
        if (this.LL != -1 && this.LLJJJIL == -1) {
            this.LLJJJIL = System.currentTimeMillis();
        }
        if (z3) {
            NR(false);
            cS();
        } else if (!Intrinsics.LJFF(string2, "MainPage") && !z && !z2) {
            if (Intrinsics.LJFF(string2, "MainFragment")) {
                NR(false);
                cS();
            } else if (Intrinsics.LJFF(string2, "RootNode")) {
                C0SZ8 c0sz8K4 = k4();
                if (c0sz8K4 != null) {
                    c0sz8K4.LJLIIIL(1);
                }
                Aweme aweme = C680080Qly.LIZIZ(getActivity()).LLJILJILJ;
                if (aweme != null) {
                    C1361830lXh.LIZ.LIZ(aweme.getAid());
                }
            }
        } else {
            NR(true);
            if (!Intrinsics.LJFF(string2, "MainPage") || !Intrinsics.LJFF(string3, "publish_landing")) {
                cS();
            }
        }
        setUserVisibleHint(false);
        this.LLJ.setUserVisibleHint(false);
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
        if (iFeedDebugService != null) {
            iFeedDebugService.LJFF();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:132|81|82|(2:84|(5:131|86|(1:88)|100|(1:102)))(1:89)|134|90|(1:92)(1:99)|100|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d4, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e7  */
    @Override // X.InterfaceC1055110dYz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNodeShow(android.os.Bundle r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment.onNodeShow(android.os.Bundle):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onRemoveAwemesByUidEvent(C034I c034i) {
        Aweme aweme = c034i.LIZ;
        if (aweme != null) {
            FriendsFeedFragmentPanel friendsFeedFragmentPanel = this.LLJ;
            List<Aweme> listK = friendsFeedFragmentPanel.K(AwemeExtKt.getAuthorUid(aweme));
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listK) {
                Aweme aweme2 = (Aweme) obj;
                if (aweme2 == null || !AwemeBizExtKt.isRecBigCardFakeAweme(aweme2)) {
                    C294470BgT.LIZ.getClass();
                    if (!C294470BgT.LIZ() || !AwemeExtKt.isAdTraffic(aweme2)) {
                        arrayList.add(obj);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                int iLJIJJ = gS().LIZLLL.LJIJJ(arrayList);
                List<String> listLJIJJLI = gS().LIZLLL.LJIJJLI();
                if (listLJIJJLI != null && iLJIJJ == listLJIJJLI.size() && gS().LIZLLL.LJIIIIZZ()) {
                    gS().LIZIZ();
                }
                friendsFeedFragmentPanel.p(aweme.getAid());
            }
        }
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onSAEffectPosted(C437630HEb c437630HEb) {
        SocialAvatarEffectPopupService socialAvatarEffectPopupService = (SocialAvatarEffectPopupService) PluggableExtentionKt.pluggableSpi$default(SocialAvatarEffectPopupService.class, false, false, false, 14, null);
        if (socialAvatarEffectPopupService != null && socialAvatarEffectPopupService.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            PopupManager.LJIIZILJ(new C442570HXb(requireActivity(), EnumC439790HMj.FRIENDS), new C1668306g5("social_social_avatar_effect_avatar_generation_prompt_friends_tab"));
        }
        EventBus.LIZLLL().LJIL(c437630HEb);
    }

    @C14EU
    public final void onVideoPublishEvent(C737030Svd c737030Svd) {
        iS(this, c737030Svd);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void iS(com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment.iS(com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment, java.lang.Object):void");
    }

    @Override // X.InterfaceC1587410rPX
    public final void LLJJJIL(List<? extends Aweme> list, boolean z) {
        ((InterfaceC1587430rPZ) this.LLJL.getValue()).LJFF();
    }

    @Override // X.InterfaceC1393170mMF
    public final void gg(String str, Set<? extends EnumC1392960mLu> set) {
        this.LLJJL = false;
        List<Aweme> listK = this.LLJ.K(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listK) {
            if (C1393100mM8.LJ((Aweme) obj, str, set)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            int iLJIJJ = gS().LIZLLL.LJIJJ(arrayList);
            List<String> listLJIJJLI = gS().LIZLLL.LJIJJLI();
            if (listLJIJJLI != null && iLJIJJ == listLJIJJLI.size() && gS().LIZLLL.LJIIIIZZ()) {
                gS().LIZIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final void iu0(String str, boolean z) {
        mS(true, z);
        C1587150rP7.LIZIZ.LJJ();
    }

    public final void mS(boolean z, boolean z2) {
        int iLIZJ;
        float f;
        Float fValueOf;
        ObjectAnimator objectAnimator;
        C19EG activity = getActivity();
        if (activity != null) {
            iLIZJ = C497820Jfg.LIZJ(activity);
        } else {
            iLIZJ = 0;
        }
        float fLIZIZ = C418440Gaw.LIZIZ(181) + iLIZJ;
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
            f2 = fLIZIZ;
        } else {
            f = fLIZIZ;
        }
        ObjectAnimator objectAnimator2 = this.LLJZIJLIL;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LLJZIJLIL) != null) {
            objectAnimator.end();
        }
        FrameLayout frameLayout = this.LLJILJIL;
        if (frameLayout != null) {
            fValueOf = Float.valueOf(frameLayout.getTranslationY());
        } else {
            fValueOf = null;
        }
        if (Intrinsics.LIZLLL(fValueOf, f2)) {
            FeedSkylightDrawerLogicAbility feedSkylightDrawerLogicAbility = (FeedSkylightDrawerLogicAbility) this.LLJLLIL.getValue();
            if (feedSkylightDrawerLogicAbility != null) {
                feedSkylightDrawerLogicAbility.zO2(f2, fLIZIZ, null);
                return;
            }
            return;
        }
        if (z) {
            C614770O9j.LIZIZ.LJ().LJJIIJZLJL(0, this, true);
        }
        C993610bxn c993610bxn = new C993610bxn(f, f2, this);
        if (!z2) {
            FrameLayout frameLayout2 = this.LLJILJIL;
            if (frameLayout2 != null) {
                C786410Ut5.fd(frameLayout2, f2);
            }
            FeedSkylightDrawerLogicAbility feedSkylightDrawerLogicAbility2 = (FeedSkylightDrawerLogicAbility) this.LLJLLIL.getValue();
            if (feedSkylightDrawerLogicAbility2 != null) {
                feedSkylightDrawerLogicAbility2.zO2(fLIZIZ, fLIZIZ, null);
            }
            c993610bxn.invoke();
            return;
        }
        this.LLJZIJLIL = ObjectAnimator.ofFloat(this.LLJILJIL, "translationY", f, f2);
        ObjectAnimator objectAnimator3 = this.LLJZIJLIL;
        if (objectAnimator3 == null) {
            return;
        }
        objectAnimator3.setInterpolator(new DecelerateInterpolator());
        objectAnimator3.setDuration(300L);
        objectAnimator3.addUpdateListener(new AUListenerS15S0100001_24(this, fLIZIZ, 1));
        objectAnimator3.addListener(new ALAdapterS12S0100000_16(c993610bxn, 6));
        C786410Ut5.Pd(objectAnimator3);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final void oi0(String str, boolean z) {
        mS(false, z);
    }

    /* JADX WARN: Type inference failed for: r0v69, types: [X.0rPP] */
    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SocialFriendsFeedFragment socialFriendsFeedFragment;
        String stringExtra;
        MainBusinessAbility mainBusinessAbilityLIZIZ;
        Object c098200Yq;
        C19EG activity;
        C19EG activity2;
        C1587810rQB c1587810rQB;
        IFriendsTabDebugService iFriendsTabDebugService;
        this.LLJLL = true;
        this.LLJI = new C1587320rPO(this);
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        if (c1589640rT8.F2()) {
            StateOwner.LL.getClass();
            getLifecycle().addObserver(new StateOwner$fragmentLifeCycle$1(this));
        }
        super.onViewCreated(view, bundle);
        Db(false);
        this.LLJILJIL = (FrameLayout) view.findViewById(R.id.eli);
        IScreenComponentAbility iScreenComponentAbility = this.LLJ.LLJJJ;
        if (iScreenComponentAbility != null) {
            iScreenComponentAbility.CG();
        }
        C1558520qew.LJI(this, FriendsFeedScope.class, this, IFeedSkylightHostAbility.class, null, null);
        this.LLJILJILJ = System.currentTimeMillis();
        IAVPublishService iAVPublishServicePublishService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
        if (C1591220rVg.LIZLLL()) {
            socialFriendsFeedFragment = this;
        } else {
            socialFriendsFeedFragment = null;
        }
        iAVPublishServicePublishService.registerPublishProgressCallback(getActivity(), new InterfaceC1447760nmI() { // from class: X.0rPR
            @Override // X.InterfaceC1447760nmI
            public final void LIZ(Boolean bool, String str) {
            }

            @Override // X.InterfaceC1447760nmI
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1447760nmI
            public final void LIZJ() {
                if (((IFeedSkylightCommonService) this.LIZ.LLJJJ.getValue()).LJJIIJ(0, StateOwner.LL.LIZIZ())) {
                    ((IFeedSkylightCommonService) this.LIZ.LLJJJ.getValue()).LJJIFFI(this.LIZ);
                }
            }
        }, socialFriendsFeedFragment);
        if (!c1589640rT8.F2() && (iFriendsTabDebugService = (IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class)) != null) {
            getActivity();
            iFriendsTabDebugService.LJ();
        }
        if (this.LLILLL == 0) {
            this.LLILLL = 31;
            this.LLILLJJLI = "homepage_friends";
        }
        FriendsFeedFragmentPanel friendsFeedFragmentPanel = this.LLJ;
        C2189821An6 c2189821An6 = new C2189821An6();
        c2189821An6.setEventType(this.LLILLJJLI);
        c2189821An6.setPageType(this.LLILLL);
        try {
            stringExtra = friendsFeedFragmentPanel.activity.getIntent().getStringExtra("extra_live_from_inner_push");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        c2189821An6.setLiveExtraFromInnerPush(stringExtra);
        friendsFeedFragmentPanel.LLLL(c2189821An6);
        Activity activity3 = friendsFeedFragmentPanel.activity;
        if (activity3 != null) {
            C0SP9.LIZLLL(friendsFeedFragmentPanel.LLLLIIIILLL, activity3);
        }
        friendsFeedFragmentPanel.onViewCreated(view, bundle);
        friendsFeedFragmentPanel.Xl1(VR());
        friendsFeedFragmentPanel.f0 = this;
        friendsFeedFragmentPanel.LLLII = VR();
        friendsFeedFragmentPanel.LLLIIII = VR();
        friendsFeedFragmentPanel.g0 = this;
        friendsFeedFragmentPanel.setUserVisibleHint(true);
        if (C1591220rVg.LIZLLL()) {
            MainBusinessAbility mainBusinessAbility = (MainBusinessAbility) this.LLJLLL.getValue();
            if (mainBusinessAbility != null) {
                mainBusinessAbility.sC1((C1583460rJA) this.LLJZ.getValue());
            }
        } else {
            MainActivityScope mainActivityScopeLIZIZ = C0S4U.LIZIZ(this);
            if (mainActivityScopeLIZIZ != null && (mainBusinessAbilityLIZIZ = C1058560deY.LIZIZ(mainActivityScopeLIZIZ)) != null) {
                mainBusinessAbilityLIZIZ.sC1(new InterfaceC1571580r00() { // from class: X.0rJB
                    @Override // X.InterfaceC1571580r00
                    public final void onNewIntent(Intent intent) {
                        String stringExtra2;
                        C2189821An6 c2189821An62 = this.LIZ.LLJ.LLLLIIIILLL;
                        try {
                            stringExtra2 = intent.getStringExtra("extra_live_from_inner_push");
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            stringExtra2 = null;
                        }
                        c2189821An62.setLiveExtraFromInnerPush(stringExtra2);
                    }
                });
            }
        }
        C1587710rQ1 c1587710rQ1DS = dS();
        if (c1587710rQ1DS != null) {
            c1587710rQ1DS.LLILLJJLI = this.LLJ;
        }
        gS().LIZLLL.LLILZLL = this.LLJ;
        C1587710rQ1 c1587710rQ1DS2 = dS();
        if (c1587710rQ1DS2 != null) {
            c1587710rQ1DS2.LLIZ = this.LLJ;
        }
        gS().LIZLLL.LJIJI(new C1587810rQB());
        if (((Boolean) C289010BUl.LIZIZ.getValue()).booleanValue()) {
            this.LLJJIJIL = new C1587590rPp(gS());
        }
        try {
            C1587320rPO c1587320rPOGS = gS();
            C2174641A8w c2174641A8wLJII = C2277891EDz.LIZIZ.LJIILJJIL().LJII(requireActivity(), this.LLILLJJLI);
            C1587810rQB c1587810rQB2 = (C1587810rQB) c1587320rPOGS.LIZLLL.LL;
            if (c1587810rQB2 != null) {
                c1587810rQB2.LLJJIII = c2174641A8wLJII;
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TTRecUser FriendsFeedPresenter setRecUserBigCardController fail ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            ArrayList<Aweme> arrayList = C1587360rPS.LIZLLL;
            C1587320rPO c1587320rPOGS2 = gS();
            c1587320rPOGS2.getClass();
            if (!arrayList.isEmpty() && (c1587810rQB = (C1587810rQB) c1587320rPOGS2.LIZLLL.LL) != null) {
                c1587810rQB.LLJJIJI = arrayList;
            }
            C1587420rPY c1587420rPYLIZIZ = C1587360rPS.LIZIZ(this.LLJLIL);
            c1587420rPYLIZIZ.LIZJ = FeedInsertRelationManager.INSTANCE.consume(true);
            c1587420rPYLIZIZ.LJ = this.LLJLIL;
            gS().LIZLLL.LLJI = c1587420rPYLIZIZ.LIZLLL;
            gS().LIZLLL.LLJIJIL = c1587420rPYLIZIZ.LIZ;
            if (this.LLJLIL) {
                this.LLJLILLLLZIIL = true;
            }
            C1587320rPO c1587320rPOGS3 = gS();
            c1587320rPOGS3.getClass();
            C1587380rPU c1587380rPU = new C1587380rPU(1, C0NMC.REFRESH.getType(), C0TJ8.LIZJ("feed").LJ());
            c1587380rPU.LIZIZ = c1587420rPYLIZIZ.LIZ;
            c1587380rPU.LIZJ = c1587420rPYLIZIZ.LIZJ;
            c1587380rPU.LJ = c1587420rPYLIZIZ.LIZIZ;
            c1587380rPU.LJFF = c1587320rPOGS3.LIZIZ;
            c1587380rPU.LJI = c1587420rPYLIZIZ.LJ;
            c1587320rPOGS3.LIZLLL.LIZJ(1, c1587380rPU.LIZ());
            c1587320rPOGS3.LIZIZ = false;
            EnumC1609900rzo enumC1609900rzo = EnumC1609900rzo.TAB_FRIENDS;
            Fragment fragment = c1587320rPOGS3.LIZ;
            if (fragment != null) {
                activity2 = fragment.getActivity();
            } else {
                activity2 = null;
            }
            C0R9P.LIZLLL(enumC1609900rzo, activity2);
        } else {
            this.LLJ.Ng1();
        }
        if (this.LLJIJIL == null && C1492500owS.LIZ() && (activity = getActivity()) != null) {
            this.LLJIJIL = C1209450hZv.LIZIZ(activity);
        }
        NoNetDetectHelper.LJIIIZ.set(true);
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        if (c1576740r8KLIZ != null) {
            c1576740r8KLIZ.LJ(false);
        }
        EventBus.LIZLLL().LJIJJ(this);
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        if (c1618440sDa.LJJIFFI().isPublishing()) {
            kS();
        }
        c1618440sDa.LJJIFFI().LJII("FriendsFeedFragment", new InterfaceC729460SjQ() { // from class: X.0rPQ
            @Override // X.InterfaceC729460SjQ
            public final void LIZJ(float f) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LIZLLL(String str) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LJ(String str) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LJFF() {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LJI(C729450SjP c729450SjP, String str) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LIZ(String str, C0SPF c0spf) {
                this.LIZ.LLJJIJIIJIL = false;
                C614770O9j.LIZIZ.LJ().LJIJI(0, false);
                SocialFriendsFeedFragment.iS(this.LIZ, c0spf);
            }

            @Override // X.InterfaceC729460SjQ
            public final void LIZIZ(EnumC729410SjL enumC729410SjL, String str) {
                if (enumC729410SjL == EnumC729410SjL.RESTORE_SCHEDULE) {
                    return;
                }
                this.LIZ.kS();
            }
        });
        if (this.LLJJJJLIIL == null) {
            this.LLJJJJLIIL = new InterfaceC1392880mLm() { // from class: X.0rPP
                @Override // X.InterfaceC1392880mLm
                public final void LIZIZ(String str, EnumC1392960mLu enumC1392960mLu) {
                }

                @Override // X.InterfaceC1392880mLm
                public final void LIZ(String str, EnumC1392960mLu enumC1392960mLu) {
                    SocialFriendsFeedFragment socialFriendsFeedFragment2 = this.LIZ;
                    if (socialFriendsFeedFragment2.LLJJL && socialFriendsFeedFragment2.LLJ.getUserVisibleHint()) {
                        return;
                    }
                    SocialFriendsFeedFragment socialFriendsFeedFragment3 = this.LIZ;
                    List<Aweme> listK = socialFriendsFeedFragment3.LLJ.K(str);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : (ArrayList) listK) {
                        if (C1393100mM8.LIZLLL((Aweme) obj, str, enumC1392960mLu)) {
                            arrayList2.add(obj);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        int iLJIJJ = socialFriendsFeedFragment3.gS().LIZLLL.LJIJJ(arrayList2);
                        List<String> listLJIJJLI = socialFriendsFeedFragment3.gS().LIZLLL.LJIJJLI();
                        if (listLJIJJLI != null && iLJIJJ == listLJIJJLI.size() && socialFriendsFeedFragment3.gS().LIZLLL.LJIIIIZZ()) {
                            socialFriendsFeedFragment3.gS().LIZIZ();
                        }
                    }
                }
            };
        }
        C1392890mLn c1392890mLn = C1392890mLn.LIZ;
        C1587330rPP c1587330rPP = this.LLJJJJLIIL;
        c1392890mLn.getClass();
        C1392890mLn.LIZLLL(c1587330rPP);
        this.LLJ.LLJJI(new C1620930sHb(this, 8));
        if (C1589640rT8.LIZIZ.F2()) {
            final InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
            final TopFriendsFeedScrollProfileStrategy topFriendsFeedScrollProfileStrategy = new TopFriendsFeedScrollProfileStrategy(requireActivity());
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, InterceptHomeViewPagerProtocol.class, C1697810uHb.LJIILJJIL(topFriendsFeedScrollProfileStrategy));
            Lifecycle lifecycle = getLifecycle();
            if (lifecycle != null) {
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment$onViewCreated$$inlined$registerProtocol$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, InterceptHomeViewPagerProtocol.class, topFriendsFeedScrollProfileStrategy);
                        }
                    }
                });
            }
        }
        FriendsFeedFragmentPanel friendsFeedFragmentPanel2 = this.LLJ;
        friendsFeedFragmentPanel2.LLLIIIIL = this;
        VerticalViewPager verticalViewPager = friendsFeedFragmentPanel2.LLJJIJI;
        if (verticalViewPager != null && friendsFeedFragmentPanel2.activity != null) {
            verticalViewPager.LLZLLLL = false;
        }
        C723850SaN.LIZ(this, false, null, new AwS375S0200000_9(this, view, 37), 3);
        IRefreshAbility iRefreshAbilityE80 = E80();
        if (iRefreshAbilityE80 != null) {
            iRefreshAbilityE80.Ku0(new InterfaceC1581920rGg() { // from class: X.0rLO
                @Override // X.InterfaceC1581920rGg
                public final void LJFF() {
                    C1400330mXn.LIZ.getClass();
                    C1400330mXn.LJII("draw");
                    C0O0R.LIZ.getClass();
                    C0O0R.LJI = true;
                }
            });
        }
        this.LLIZ.LIZ(C2214201BlK.LIZLLL().LJL(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0lXE
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SocialFriendsFeedFragment@b34f.subscribeAppBackground$disposable$1");
                if (((Boolean) obj).booleanValue()) {
                    C1400330mXn.LIZ.getClass();
                    C1400330mXn.LJIIIZ();
                }
                C1C7U.LIZIZ("SocialFriendsFeedFragment@b34f.subscribeAppBackground$disposable$1");
            }
        }));
        ((InterfaceC1587430rPZ) this.LLJL.getValue()).Z(getActivity(), this.LLJ);
        StoryMainTrackService storyMainTrackServiceLJJIJIIJI = c1618440sDa.LJJIJIIJI();
        if (storyMainTrackServiceLJJIJIIJI != null) {
            storyMainTrackServiceLJJIJIIJI.LIZLLL(!r5.F2());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    @Override // X.InterfaceC1587410rPX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xK(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment.xK(java.lang.String, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZLLL;
        ViewTreeObserver viewTreeObserver;
        boolean z;
        C1587740rQ4.LIZ.getClass();
        if (!C1587740rQ4.LJIJI) {
            HashMap<String, String> map = C1587740rQ4.LIZIZ;
            String str = map.get("tab_position");
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (C1589640rT8.LIZIZ.F2()) {
                    C0VWW.LJI("latency_friends");
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    C1587740rQ4.LIZJ = jElapsedRealtime;
                    map.put("tab_position", "HomeTopTab");
                    map.put("start_time_from_open_app", String.valueOf(jElapsedRealtime - C1150504el.LIZ().LJJIII));
                }
                C1587740rQ4.LJJIFFI = "1";
            }
        }
        C818480W8w.LIZ("homepage_friends");
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null) {
            viewLIZLLL = C20673215v0.LIZLLL(R.layout.cah, activity, viewGroup, false);
        } else {
            viewLIZLLL = null;
        }
        if (!C1587740rQ4.LJIJI) {
            C1587740rQ4.LJII = SystemClock.elapsedRealtime() - jElapsedRealtime2;
            if (viewLIZLLL != null && (viewTreeObserver = viewLIZLLL.getViewTreeObserver()) != null) {
                ViewTreeObserverOnPreDrawListenerC1620770sHL viewTreeObserverOnPreDrawListenerC1620770sHL = new ViewTreeObserverOnPreDrawListenerC1620770sHL(viewLIZLLL, 0);
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1620770sHL);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1620770sHL, ViewTreeObserver.OnPreDrawListener.class);
            }
        }
        C20639086r.LIZLLL(new ARunnableS109S0100000_9(this, 78));
        if (!(viewLIZLLL instanceof View)) {
            viewLIZLLL = null;
        }
        if (viewLIZLLL != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZLLL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZLLL, this);
                viewLIZLLL.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZLLL;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZLLL;
    }
}
