package com.ss.android.ugc.feed.platform.panel.live;

import X.C01GW;
import X.C0A5T;
import X.C0RD6;
import X.C0RY8;
import X.C1440005kM;
import X.C14EU;
import X.C1548820qPI;
import X.C1559700qgq;
import X.C1559890qh9;
import X.C1559940qhE;
import X.C1565560qqI;
import X.C1566140qrE;
import X.C1572340r1E;
import X.C1572360r1G;
import X.C1580830rEv;
import X.C1580840rEw;
import X.C1871910yoP;
import X.C2038007yc;
import X.C262100zr;
import X.C299750Boz;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.EnumC1430380nKG;
import X.EnumC452301pR;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1565950qqv;
import X.InterfaceC1572350r1F;
import X.InterfaceC1616070s9l;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class FypLiveCardComponent extends BasePanelComponent implements InterfaceC1141530foN {
    public final C01GW LL;
    public final List<String> LLILLJJLI;
    public final C630740Ooa LLILLL;
    public final C630740Ooa LLILZ;
    public final C630740Ooa LLILZIL;
    public final C630740Ooa LLILZLL;
    public final C630740Ooa LLIZ;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final IFeedPanelPlatformAbility fo() {
        return (IFeedPanelPlatformAbility) this.LL.getValue();
    }

    public FypLiveCardComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1545), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1559700qgq(false, this));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = C628500Oky.LIZ(new C1559940qhE(this));
        this.LLILZ = C628500Oky.LIZ(new C1559890qh9());
        this.LLILZIL = C628500Oky.LIZ(new C1572360r1G(this));
        this.LLILZLL = C628500Oky.LIZ(new C1565560qqI(this));
        this.LLIZ = C628500Oky.LIZ(new C1572340r1E(this));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        C1548820qPI.LIZLLL("live_event_update_result", this);
        C1548820qPI.LIZLLL("live_event_delete_result", this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        C1548820qPI.LJIIIIZZ("live_event_update_result", this);
        C1548820qPI.LJIIIIZZ("live_event_delete_result", this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new InterfaceC1616070s9l() { // from class: X.0r1D
                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onBeforePageChange() {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageScrolledEnd(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageSelected(int i, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageUnSelected(C0SZ8 c0sz8) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbilityFo;
                    String strXy2;
                    InterfaceC1572350r1F interfaceC1572350r1F;
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbilityFo2;
                    Aweme awemeLJIIIIZZ;
                    List<Aweme> awemeList;
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbilityFo3;
                    UrlModel avatarThumb;
                    if (((Boolean) this.LL.LLILZLL.getValue()).booleanValue() && (iFeedPanelPlatformAbilityFo2 = this.LL.fo()) != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbilityFo2.LJIIIIZZ()) != null && AwemeSaaSExtKt.isLive(awemeLJIIIIZZ)) {
                        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityFo4 = this.LL.fo();
                        if (iFeedPanelPlatformAbilityFo4 != null && (awemeList = iFeedPanelPlatformAbilityFo4.getAwemeList()) != null && (iFeedPanelPlatformAbilityFo3 = this.LL.fo()) != null) {
                            int iLJLJJL = iFeedPanelPlatformAbilityFo3.LJLJJL() + 1;
                            UrlModel cover = null;
                            if (awemeList.size() > iLJLJJL) {
                                Aweme aweme = (Aweme) ListProtector.get(awemeList, iLJLJJL);
                                if (aweme.getAwemeType() == 0) {
                                    ILiveOuterService iLiveOuterService = (ILiveOuterService) this.LL.LLILZ.getValue();
                                    if (iLiveOuterService != null) {
                                        User author = aweme.getAuthor();
                                        if (author != null) {
                                            avatarThumb = author.getAvatarThumb();
                                        } else {
                                            avatarThumb = null;
                                        }
                                        Video video = aweme.getVideo();
                                        if (video != null) {
                                            cover = video.getCover();
                                        }
                                        iLiveOuterService.Y3(avatarThumb, cover);
                                    }
                                } else {
                                    ILiveOuterService iLiveOuterService2 = (ILiveOuterService) this.LL.LLILZ.getValue();
                                    if (iLiveOuterService2 != null) {
                                        iLiveOuterService2.Y3(null, null);
                                    }
                                }
                            } else {
                                ILiveOuterService iLiveOuterService3 = (ILiveOuterService) this.LL.LLILZ.getValue();
                                if (iLiveOuterService3 != null) {
                                    iLiveOuterService3.Y3(null, null);
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    if (((Boolean) this.LL.LLIZ.getValue()).booleanValue() && (iFeedPanelPlatformAbilityFo = this.LL.fo()) != null && (strXy2 = iFeedPanelPlatformAbilityFo.xy2()) != null && (interfaceC1572350r1F = (InterfaceC1572350r1F) this.LL.LLILZIL.getValue()) != null) {
                        interfaceC1572350r1F.LIZIZ(strXy2);
                    }
                }
            });
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        InterfaceC1572350r1F interfaceC1572350r1F;
        super.onPause();
        if (!((Boolean) this.LLIZ.getValue()).booleanValue() || (interfaceC1572350r1F = (InterfaceC1572350r1F) this.LLILZIL.getValue()) == null) {
            return;
        }
        interfaceC1572350r1F.LIZ();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static AnchorCommonStruct m340do(Aweme aweme) {
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        AnchorCommonStruct anchorCommonStruct = null;
        if (anchors == null) {
            return null;
        }
        Iterator<AnchorCommonStruct> it2 = anchors.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AnchorCommonStruct next = it2.next();
            if (next.getType() == EnumC1430380nKG.LIVE_EVENT.getTYPE()) {
                anchorCommonStruct = next;
                break;
            }
        }
        return anchorCommonStruct;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        if (((Boolean) C0A5T.LIZ.getValue()).booleanValue()) {
            c0rd6.LIZIZ("event_on_render_first_frame", new AwS603S0100000_24(this, 402));
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        InterfaceC1107590evd interfaceC1107590evdLJ;
        List<Aweme> listBo;
        List<AnchorCommonStruct> anchors;
        InterfaceC1107590evd interfaceC1107590evdLJ2;
        String str = c262100zr.LIZ;
        if (Intrinsics.LJFF(str, "live_event_update_result")) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 == null || (interfaceC1107590evdLJ2 = C1871910yoP.LJ(interfaceC1107590evd2, "live_event")) == null) {
                return;
            }
            ho(C1871910yoP.LJFF(interfaceC1107590evdLJ2, FollowStatusChangeMethod.PARAM_UID, ""), C1871910yoP.LIZIZ(interfaceC1107590evdLJ2, "has_subscribed", false));
            return;
        }
        if (!Intrinsics.LJFF(str, "live_event_delete_result") || (interfaceC1107590evd = c262100zr.LIZIZ) == null || (interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd, "live_event")) == null) {
            return;
        }
        String strLJFF = C1871910yoP.LJFF(interfaceC1107590evdLJ, FollowStatusChangeMethod.PARAM_UID, "");
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityFo = fo();
        if (iFeedPanelPlatformAbilityFo != null && (listBo = bo(iFeedPanelPlatformAbilityFo, strLJFF)) != null) {
            for (Aweme aweme : listBo) {
                AnchorCommonStruct anchorCommonStructM340do = m340do(aweme);
                if (anchorCommonStructM340do != null && (anchors = aweme.getAnchors()) != null) {
                    anchors.remove(anchorCommonStructM340do);
                }
            }
        }
    }

    @C14EU
    public final void onLiveEventRegister(C1580830rEv c1580830rEv) {
        ho(c1580830rEv.LIZ, true);
    }

    @C14EU
    public final void onLiveEventUnregister(C1580840rEw c1580840rEw) {
        ho(c1580840rEw.LIZ, false);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        InterfaceC1572350r1F interfaceC1572350r1F;
        super.onPagePause(i);
        if (((Boolean) this.LLIZ.getValue()).booleanValue() && (interfaceC1572350r1F = (InterfaceC1572350r1F) this.LLILZIL.getValue()) != null) {
            interfaceC1572350r1F.LIZ();
        }
    }

    public static List bo(IFeedPanelPlatformAbility iFeedPanelPlatformAbility, String str) {
        List<Aweme> awemeList = iFeedPanelPlatformAbility.getAwemeList();
        ArrayList arrayList = null;
        if (awemeList != null) {
            arrayList = new ArrayList();
            for (Aweme aweme : awemeList) {
                List<AnchorCommonStruct> anchors = aweme.getAnchors();
                if (anchors != null && !anchors.isEmpty()) {
                    Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            AnchorCommonStruct next = it2.next();
                            if (next.getType() == EnumC1430380nKG.LIVE_EVENT.getTYPE() && Intrinsics.LJFF(next.getDataFromExtra("third_id", ""), str)) {
                                arrayList.add(aweme);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final void ho(String str, boolean z) {
        List<Aweme> listBo;
        n nVar;
        n nVar2;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityFo = fo();
        if (iFeedPanelPlatformAbilityFo != null && (listBo = bo(iFeedPanelPlatformAbilityFo, str)) != null) {
            for (Aweme aweme : listBo) {
                AnchorCommonStruct anchorCommonStructM340do = m340do(aweme);
                if (anchorCommonStructM340do != null) {
                    try {
                        new p();
                        nVar = p.LIZJ(anchorCommonStructM340do.getExtra()).LJIILIIL();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        nVar = new n();
                    }
                    try {
                        new p();
                        nVar2 = p.LIZJ(nVar.LJJIJIIJI("live_event_info").LJIL()).LJIILIIL();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        nVar2 = new n();
                    }
                    nVar2.LJJII(Boolean.valueOf(z), "has_subscribed");
                    nVar.LJJIIJ("live_event_info", nVar2.toString());
                    anchorCommonStructM340do.setExtra(nVar.toString());
                    C1440005kM.LIZ(new C2038007yc("fallback", Collections.singletonList("sync_state_action_timing"), C0RY8.LIZ(aweme.getAid())));
                }
            }
        }
    }
}
