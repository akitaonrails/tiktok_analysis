package com.ss.android.ugc.aweme.friendstab.tab;

import X.C01GW;
import X.C0C0K;
import X.C1022620cia;
import X.C1388190mED;
import X.C1440005kM;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1564680qos;
import X.C1571280qzW;
import X.C1571750r0H;
import X.C1576740r8K;
import X.C1578630rBN;
import X.C1583240rIo;
import X.C1583280rIs;
import X.C1583300rIu;
import X.C1583510rJF;
import X.C1585070rLl;
import X.C1587150rP7;
import X.C1589640rT8;
import X.C1591220rVg;
import X.C1595430rcT;
import X.C19EG;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2252408s6;
import X.C418440Gaw;
import X.C446900Hfk;
import X.C452501pT;
import X.C614770O9j;
import X.C690440R6k;
import X.C814420VxA;
import X.EnumC1583290rIt;
import X.EnumC1583310rIv;
import X.EnumC1584360rKc;
import X.EnumC308700C8e;
import X.InterfaceC1570900qyu;
import X.InterfaceC1571780r0K;
import X.InterfaceC1587410rPX;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ad.feed.adexperience.IFeedAdRefreshEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse;
import com.ss.android.ugc.aweme.friendstab.model.ToolBarIconModel;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.tab.FriendsFeedProtocol;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedFragmentPanel;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import com.ss.android.ugc.aweme.service.IFriendsTabDebugService;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS162S0101000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsFeedProtocol implements ISocialTabProtocol {
    public InterfaceC1570900qyu LLILLJJLI;
    public ToolBarIconModel LLILZ;
    public final ToolBarIconModel LLILZIL;
    public Context LLILZLL;
    public final String LLIZ;
    public final Class<SocialFriendsFeedFragment> LLIZLLLIL;
    public final C01GW LL = C452501pT.LIZIZ(new C1571280qzW());
    public final C1571750r0H LLILLL = new InterfaceC1571780r0K() { // from class: X.0r0H
        @Override // X.InterfaceC1571780r0K
        public final void LIZ(List<? extends InterfaceC1571760r0I> list) {
            ((InterfaceC1571760r0I) ListProtector.get(list, 0)).LLLLLJIL(true);
            ((InterfaceC1571760r0I) ListProtector.get(list, 0)).setIconModel(this.LIZ.LLILZIL);
        }

        @Override // X.InterfaceC1571780r0K
        public final void LIZIZ(List<? extends InterfaceC1571760r0I> list) {
            InterfaceC1570900qyu interfaceC1570900qyuNewStoryToolBarViewGenerator;
            View viewF2;
            Lifecycle lifecycle;
            final FriendsFeedProtocol friendsFeedProtocol = this.LIZ;
            if (friendsFeedProtocol.LLILZ == null) {
                Context context = friendsFeedProtocol.LLILZLL;
                ToolBarIconModel toolBarIconModel = null;
                if (context != null && C1595430rcT.LIZIZ.LIZ().LIZ() && (interfaceC1570900qyuNewStoryToolBarViewGenerator = C1618440sDa.LIZIZ.LJJJZ().newStoryToolBarViewGenerator()) != null) {
                    friendsFeedProtocol.LLILLJJLI = interfaceC1570900qyuNewStoryToolBarViewGenerator;
                    LifecycleOwner lifecycleOwnerLIZJ = StateOwner.LL.LIZJ();
                    if (lifecycleOwnerLIZJ != null && (lifecycle = lifecycleOwnerLIZJ.getLifecycle()) != null) {
                        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.friendstab.tab.FriendsFeedProtocol$initStoryEntranceIconModel$1
                            @Override // androidx.lifecycle.LifecycleEventObserver
                            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                                InterfaceC1570900qyu interfaceC1570900qyu;
                                if (event == Lifecycle.Event.ON_DESTROY && (interfaceC1570900qyu = friendsFeedProtocol.LLILLJJLI) != null) {
                                    interfaceC1570900qyu.onDestroyView();
                                }
                            }
                        });
                    }
                    InterfaceC1570900qyu interfaceC1570900qyu = friendsFeedProtocol.LLILLJJLI;
                    if (interfaceC1570900qyu != null && (viewF2 = interfaceC1570900qyu.f2(context)) != null) {
                        toolBarIconModel = new ToolBarIconModel(false, 0, 0, EnumC1583310rIv.DEFAULT, false, null, viewF2, null, null, true, null);
                    }
                }
                friendsFeedProtocol.LLILZ = toolBarIconModel;
            }
            ToolBarIconModel toolBarIconModel2 = this.LIZ.LLILZ;
            if (toolBarIconModel2 != null) {
                ((InterfaceC1571760r0I) ListProtector.get(list, 0)).setIconModel(toolBarIconModel2);
                ((InterfaceC1571760r0I) ListProtector.get(list, 0)).LLLLLJIL(true);
            }
        }
    };

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void Gu1() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void aw0() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final String getMob() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void onTouchEvent(MotionEvent motionEvent) {
    }

    public static FriendsFeedFragmentPanel LIZ() {
        FeedFragment feedFragment;
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ == null || (feedFragment = (FeedFragment) Hox.LLJILJIL.LIZ(c19egLIZIZ).Ki("FRIENDS_FEED")) == null || !(feedFragment instanceof SocialFriendsFeedFragment)) {
            return null;
        }
        return ((SocialFriendsFeedFragment) feedFragment).LLJ;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void B3() {
        C1583300rIu.LIZ.getClass();
        if (C1583300rIu.LIZIZ()) {
            return;
        }
        C1595430rcT.LIZIZ.LIZIZ().visitSingleFeed("FRIENDS_FEED");
    }

    public final boolean LIZJ() {
        return ((Boolean) this.LL.getValue()).booleanValue();
    }

    public final FeedFragment LIZLLL() {
        C19EG c19egLIZIZ;
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        Context context = this.LLILZLL;
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Fragment fragmentKi = c446900Hfk.LIZ(c19egLIZIZ).Ki("FRIENDS_FEED");
        if (fragmentKi instanceof FeedFragment) {
            return (FeedFragment) fragmentKi;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final boolean enable() {
        C1595430rcT c1595430rcT = C1595430rcT.LIZIZ;
        if (!c1595430rcT.LIZJ().shouldShowFriendsTabForEarlyInit() || !Intrinsics.LJFF(c1595430rcT.LIZJ().getSocial2TabTabName(), this.LLIZ)) {
            return false;
        }
        C1585070rLl c1585070rLl = C1585070rLl.LIZ;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.FRIENDS;
        EnumC308700C8e enumC308700C8e = EnumC308700C8e.FRIENDS_PROTOCOL_ENABLE;
        c1585070rLl.getClass();
        return !C1585070rLl.LJFF(enumC1584360rKc, enumC308700C8e);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0r0H] */
    public FriendsFeedProtocol() {
        new ToolBarIconModel(false, R.raw.icon_person_plus, R.attr.ee, EnumC1583310rIv.DEFAULT, false, null, null, C20642515q3.LJI(2131845474), LIZJ() ? Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) : null, true, AFwS213S0000000_24.get$arr$(167));
        this.LLILZIL = new ToolBarIconModel(false, LIZJ() ? R.drawable.bv5 : R.raw.icon_magnifying_glass_offset, R.attr.ee, EnumC1583310rIv.SEARCH, false, null, null, C20642515q3.LJI(R.string.spp), LIZJ() ? Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) : Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))), !LIZJ(), new C1583240rIo());
        this.LLIZ = "FRIENDS_FEED";
        this.LLIZLLLIL = SocialFriendsFeedFragment.class;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void L() {
        if (C1591220rVg.LIZLLL()) {
            InterfaceC1570900qyu interfaceC1570900qyu = this.LLILLJJLI;
            if (interfaceC1570900qyu != null) {
                interfaceC1570900qyu.onDestroyView();
            }
            this.LLILLJJLI = null;
            this.LLILZ = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final boolean isLoading() {
        IFeedFetchDataAbility iFeedFetchDataAbility;
        FeedFragment feedFragmentLIZLLL = LIZLLL();
        if (feedFragmentLIZLLL == null || (iFeedFetchDataAbility = (IFeedFetchDataAbility) C1558520qew.LIZ(C1558360qeg.LJFF(feedFragmentLIZLLL, null), IFeedFetchDataAbility.class, null)) == null) {
            return false;
        }
        return iFeedFetchDataAbility.isLoading();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final Class<SocialFriendsFeedFragment> LLJIJIL() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final InterfaceC1571780r0K fK() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final String getTag() {
        return this.LLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void EP2(EnumC1583290rIt enumC1583290rIt) {
        IFeedAdRefreshEventLogger iFeedAdRefreshEventLogger;
        InterfaceC1587410rPX interfaceC1587410rPX;
        InterfaceC1587410rPX interfaceC1587410rPX2;
        C1576740r8K c1576740r8KLIZ;
        FeedFragment feedFragmentLIZLLL = LIZLLL();
        if (feedFragmentLIZLLL != 0) {
            C19EG activity = feedFragmentLIZLLL.getActivity();
            if (activity != null && !C614770O9j.LIZIZ.LJ().LJJIIJ(0, activity) && (c1576740r8KLIZ = C690440R6k.LIZ()) != null) {
                c1576740r8KLIZ.LJ(false);
            }
            boolean zLJIIL = C614770O9j.LIZIZ.LJ().LJIIL(feedFragmentLIZLLL.getActivity());
            String str = "click_top_icon";
            Aweme awemeLJIIIIZZ = null;
            if (zLJIIL) {
                int i = C1583280rIs.LIZ[enumC1583290rIt.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        feedFragmentLIZLLL.Oi(true);
                    } else if ((feedFragmentLIZLLL instanceof InterfaceC1587410rPX) && (interfaceC1587410rPX2 = (InterfaceC1587410rPX) feedFragmentLIZLLL) != null) {
                        interfaceC1587410rPX2.xK("click_top_icon", true);
                    }
                } else if ((feedFragmentLIZLLL instanceof InterfaceC1587410rPX) && (interfaceC1587410rPX = (InterfaceC1587410rPX) feedFragmentLIZLLL) != null) {
                    interfaceC1587410rPX.xK("click_bottom_icon", true);
                }
            } else {
                feedFragmentLIZLLL.Oi(true);
            }
            C1440005kM.LIZ(new C1564680qos(3));
            C1595430rcT.LIZIZ.LIZIZ().visitSingleFeed("FRIENDS_FEED");
            if (!C1589640rT8.LIZIZ.F2() && !zLJIIL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[refresh] enterMethod=");
                sbLIZ.append(enumC1583290rIt);
                sbLIZ.append(", skyLightVisible=");
                sbLIZ.append(zLJIIL);
                sbLIZ.append(", isBottomTab=");
                sbLIZ.append(!r7.F2());
                C1022620cia.LIZ("FriendsFeedProtocol", C2188811AlT.LIZIZ(sbLIZ));
                int i2 = C1583280rIs.LIZ[enumC1583290rIt.ordinal()];
                if (i2 == 1) {
                    str = "click_bottom_icon";
                } else if (i2 != 2) {
                    str = null;
                }
                FriendsFeedFragmentPanel friendsFeedFragmentPanelLIZ = LIZ();
                if (friendsFeedFragmentPanelLIZ != null) {
                    awemeLJIIIIZZ = friendsFeedFragmentPanelLIZ.LJIIIIZZ();
                }
                if (str != null && awemeLJIIIIZZ != null && AwemeExtKt.isAdTraffic(awemeLJIIIIZZ) && (iFeedAdRefreshEventLogger = (IFeedAdRefreshEventLogger) PluggableExtentionKt.pluggableSpi$default(IFeedAdRefreshEventLogger.class, false, false, false, 14, null)) != null) {
                    iFeedAdRefreshEventLogger.LIZ(awemeLJIIIIZZ.getAwemeRawAd(), str);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void OM1(String str) {
        if (str.length() == 0 && C0C0K.LIZ()) {
            return;
        }
        C1583300rIu.LIZ.getClass();
        if (!C1583300rIu.LIZIZ()) {
            C1595430rcT.LIZIZ.LIZIZ().visitSingleFeed("FRIENDS_FEED");
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final Bundle V9(Context context) {
        Bundle bundle = new Bundle();
        C1578630rBN.LJIIIIZZ(bundle, "Friends");
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void d21(SocialFeedRedDotResponse socialFeedRedDotResponse) {
        C19EG c19egLIZIZ;
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI;
        if ((socialFeedRedDotResponse instanceof NewContentResponse.FriendsFeedRedDotResponse) && socialFeedRedDotResponse != null) {
            IFriendsTabDebugService iFriendsTabDebugService = (IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class);
            if (iFriendsTabDebugService != null) {
                socialFeedRedDotResponse.getRedDotCount();
                iFriendsTabDebugService.LJFF();
                socialFeedRedDotResponse.getRedDotList();
                iFriendsTabDebugService.LIZJ();
            }
            C1583300rIu.LIZ.getClass();
            if (C1583300rIu.LIZIZ() && (c19egLIZIZ = StateOwner.LL.LIZIZ()) != null && (iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(c19egLIZIZ, null))) != null && !iSocial2TabProtocolAbilityLJI.tF0()) {
                ZA1(((NewContentResponse.FriendsFeedRedDotResponse) socialFeedRedDotResponse).getNewContentCountForDisplay(), false);
            }
            C1595430rcT.LIZIZ.LIZIZ().dealWithFriendsAvatar(socialFeedRedDotResponse);
            if (C1583300rIu.LIZJ()) {
                C1587150rP7 c1587150rP7 = C1587150rP7.LIZIZ;
                c1587150rP7.LJIIIZ(((NewContentResponse.FriendsFeedRedDotResponse) socialFeedRedDotResponse).getNewContentCountForDisplay());
                FriendsFeedFragmentPanel friendsFeedFragmentPanelLIZ = LIZ();
                if (friendsFeedFragmentPanelLIZ != null) {
                    c1587150rP7.LJJIFFI(friendsFeedFragmentPanelLIZ.LJIIIIZZ(), friendsFeedFragmentPanelLIZ.LJLLJ(), friendsFeedFragmentPanelLIZ.getFragment());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void init(Context context) {
        this.LLILZLL = context;
        C1589640rT8.LIZIZ.Z2();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final String mc(Context context) {
        return context.getString(2131834970);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void ZA1(int i, boolean z) {
        C2252408s6.LJII(new AwS162S0101000_24(i, this, 2));
    }
}
