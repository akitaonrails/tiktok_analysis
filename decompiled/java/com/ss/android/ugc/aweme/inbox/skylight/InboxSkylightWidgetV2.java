package com.ss.android.ugc.aweme.inbox.skylight;

import X.AbstractC1598130rgp;
import X.AbstractC1903430zdF;
import X.AnonymousClass0060;
import X.AnonymousClass0064;
import X.AnonymousClass0956;
import X.C01GW;
import X.C036E;
import X.C08JS;
import X.C098200Yq;
import X.C0BV5;
import X.C0IHI;
import X.C0II3;
import X.C0IR0;
import X.C0IS1;
import X.C0IS3;
import X.C0JAU;
import X.C0OKV;
import X.C0PEM;
import X.C0ZP4;
import X.C1058550deX;
import X.C10EU;
import X.C11JF;
import X.C11NJ;
import X.C1206204nk;
import X.C1209404oG;
import X.C1256440ini;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1439490nYx;
import X.C1439905kL;
import X.C14EU;
import X.C1558520qew;
import X.C1591220rVg;
import X.C1596630reP;
import X.C1596740rea;
import X.C1596970rex;
import X.C1597910rgT;
import X.C1598160rgs;
import X.C1598180rgu;
import X.C1598200rgw;
import X.C1598660rhg;
import X.C1598710rhl;
import X.C1598720rhm;
import X.C1598730rhn;
import X.C1599000riE;
import X.C1599090riN;
import X.C1599110riP;
import X.C1599410rit;
import X.C1599560rj8;
import X.C1618440sDa;
import X.C1619080sEc;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1889340zGW;
import X.C1889360zGY;
import X.C189200o6;
import X.C1900840zZ4;
import X.C1903400zdC;
import X.C19EG;
import X.C20600815jK;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2252408s6;
import X.C23250099c;
import X.C2344009Gk;
import X.C285800BIc;
import X.C295190Bhd;
import X.C298520Bn0;
import X.C328160Cti;
import X.C328170Ctj;
import X.C452501pT;
import X.C479920Iru;
import X.C582130MsN;
import X.C588470N6f;
import X.C596340NaC;
import X.C610870Nxd;
import X.C614770O9j;
import X.C712140Rwa;
import X.C724240Sb0;
import X.C729510SjV;
import X.C888460YtI;
import X.EnumC1582650rHr;
import X.EnumC1596540reG;
import X.EnumC1598770rhr;
import X.EnumC1599580rjA;
import X.InterfaceC1479620obg;
import X.InterfaceC1554640qYg;
import X.InterfaceC1595080rbu;
import X.InterfaceC1598970riB;
import X.InterfaceC1891350zJl;
import X.InterfaceC468940IaC;
import X.InterfaceC494301wD;
import X.InterfaceC676420Qg4;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveConsumingFunOpt;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.depend.model.live.TaxonomyTagInfo;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bean.MixRankSkylightItem;
import com.ss.android.ugc.aweme.bean.MixRankSkylightPageControl;
import com.ss.android.ugc.aweme.bean.MixRankSkylightResponse;
import com.ss.android.ugc.aweme.bean.MixRankSkylightSceneResponse;
import com.ss.android.ugc.aweme.experiment.SkylightLocalRerankExpData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.highlights.HighlightSkylightUser;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxFragmentAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxSkylightWidgetAbility;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxSkylightWidgetV2 extends InboxWidget implements InboxAbilityCenter$IInboxSkylightWidgetAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ int LLJZIJLIL = 0;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public volatile boolean LLJILLL;
    public InsertStory LLJJI;
    public String LLJJIII;
    public StoryGetFeedByPageResponse LLJJIJI;
    public SkylightDataResponse LLJJIJIIJIL;
    public MixRankSkylightResponse LLJJIJIL;
    public volatile boolean LLJJJ;
    public C11JF LLJJJIL;
    public AnonymousClass0956 LLJJJJ;
    public final String LLJL;
    public final C0IS1<C0IR0> LLJLIL;
    public final AwS603S0100000_24 LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public SkylightListViewModel LLJLLIL;
    public final C01GW LLJLLL;
    public boolean LLJZ;
    public final C11NJ LLIZLLLIL = new C11NJ();
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(209));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(210));
    public volatile InboxHorizontalTopListCombinePod LLJJJJLIIL = new InboxHorizontalTopListCombinePod(C13BV.INSTANCE, null, null, 0, false, null, null, null, null, null, true, null, 0, false, 0, 0, null, false, null, null, 1047550, null);
    public final AwS568S0100000_24 LLJJL = new AwS568S0100000_24(this, 678);
    public final AwS568S0100000_24 LLJJLIIIJLLLLLLLZ = new AwS568S0100000_24(this, 677);

    static {
        new Object() { // from class: X.0riZ
        };
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxSkylightWidgetAbility
    public final void ZN2() {
        this.LLJILLL = true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -268731487) {
            return null;
        }
        return this;
    }

    public InboxSkylightWidgetV2() {
        C0IS1<C0IR0> c0is1LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSkyLightSceneName");
        sbLIZ.append(hashCode());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJL = strLIZIZ;
        if (C285800BIc.LIZ()) {
            InterfaceC468940IaC interfaceC468940IaCLIZ = C582130MsN.LIZ().LIZ();
            C0IS3 c0is3 = new C0IS3();
            c0is3.LIZ = strLIZIZ;
            c0is3.LIZIZ = "inbox";
            c0is3.LIZJ = "LIVE_DATA_MODE";
            c0is1LIZIZ = interfaceC468940IaCLIZ.LIZIZ(c0is3);
            c0is1LIZIZ.LIZJ();
        } else {
            c0is1LIZIZ = null;
        }
        this.LLJLIL = c0is1LIZIZ;
        this.LLJLILLLLZIIL = new AwS603S0100000_24(this, 118);
        this.LLJLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(211));
        this.LLJLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(208));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        List<InterfaceC1891350zJl> listSingletonList;
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod = this.LLJJJJLIIL;
        return (inboxHorizontalTopListCombinePod == null || (listSingletonList = Collections.singletonList(inboxHorizontalTopListCombinePod)) == null) ? C13BV.INSTANCE : listSingletonList;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        return Collections.singletonList(C13LE.LIZ(InboxHorizontalTopListCombinePod.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> Lo() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod r0 = r8.LLJJJJLIIL
            if (r0 == 0) goto La
            java.util.List r3 = r0.extractLiveUserIds()
            if (r3 != 0) goto Lc
        La:
            X.13BV r3 = X.C13BV.INSTANCE
        Lc:
            com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod r0 = r8.LLJJJJLIIL
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L30
            java.util.List r1 = r0.extractStories()
            if (r1 == 0) goto L30
            java.lang.Object r0 = X.C13LP.LJJJLL(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L56
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
        L24:
            boolean r0 = X.C729510SjV.LJIILJJIL(r0)
            if (r0 == 0) goto L32
            java.util.List r1 = X.C13LP.LJJJJIZL(r1, r6)
            if (r1 != 0) goto L32
        L30:
            X.13BV r1 = X.C13BV.INSTANCE
        L32:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r1.iterator()
        L3b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L3b
            r5.add(r1)
            goto L3b
        L56:
            r0 = r7
            goto L24
        L58:
            boolean r0 = r5.isEmpty()
            r3 = 0
            if (r0 != 0) goto L86
            java.util.Iterator r4 = r5.iterator()
            r3 = 0
        L64:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r4.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            X.0rsx r2 = X.C1605650rsx.LIZIZ
            X.06Uf r1 = X.EnumC1615506Uf.STORY
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
            int r0 = r2.LJIIZILJ(r1, r0)
            if (r0 != r6) goto L64
            int r3 = r3 + 1
            if (r3 >= 0) goto L64
            X.C1697810uHb.LJIJ()
            throw r7
        L86:
            int r0 = r5.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.skylight.InboxSkylightWidgetV2.Lo():kotlin.Pair");
    }

    public final void No() {
        List<User> listExtractLiveUsers;
        int i;
        int i2;
        List<HighlightSkylightUser> highlightUsers;
        int size;
        Long highlightTotalCount;
        long jLongValue;
        List<MixRankSkylightItem> skylightItems;
        List<MixRankSkylightSceneResponse> sceneResponses;
        MixRankSkylightSceneResponse next;
        MixRankSkylightPageControl mixRankSkylightPageControl;
        Map<String, Long> map;
        Long l;
        List<Aweme> listExtractStories;
        List<Aweme> listExtractStories2;
        Aweme aweme;
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod = this.LLJJJJLIIL;
        if (inboxHorizontalTopListCombinePod == null || (listExtractLiveUsers = inboxHorizontalTopListCombinePod.extractLiveUsers()) == null) {
            listExtractLiveUsers = C13BV.INSTANCE;
        }
        int size2 = listExtractLiveUsers.size();
        String authorUid = null;
        if (listExtractLiveUsers.isEmpty()) {
            i = 0;
        } else {
            Iterator<User> it2 = listExtractLiveUsers.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (C10EU.LJIIL(it2.next()) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        if (listExtractLiveUsers.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<User> it3 = listExtractLiveUsers.iterator();
            i2 = 0;
            while (it3.hasNext()) {
                if ((!C10EU.LJIIL(it3.next())) && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        Pair<Integer, Integer> pairLo = Lo();
        InterfaceC1595080rbu interfaceC1595080rbuLIZJ = C614770O9j.LIZIZ.LIZJ();
        int iIntValue = pairLo.getSecond().intValue();
        int iIntValue2 = pairLo.getFirst().intValue();
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod2 = this.LLJJJJLIIL;
        int i3 = 3;
        if (inboxHorizontalTopListCombinePod2 == null) {
            size = 0;
        } else if (C1209404oG.LIZ()) {
            if (C1599090riN.LIZ()) {
                MixRankSkylightResponse mixRankSkylightData = inboxHorizontalTopListCombinePod2.getMixRankSkylightData();
                if (mixRankSkylightData != null && (sceneResponses = mixRankSkylightData.getSceneResponses()) != null) {
                    Iterator<MixRankSkylightSceneResponse> it4 = sceneResponses.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it4.next();
                            if (next.scene == EnumC1596540reG.INBOX_TAB.getValue()) {
                                break;
                            }
                        }
                    }
                    MixRankSkylightSceneResponse mixRankSkylightSceneResponse = next;
                    if (mixRankSkylightSceneResponse != null && (mixRankSkylightPageControl = mixRankSkylightSceneResponse.pageControl) != null && (map = mixRankSkylightPageControl.totalCountByBiz) != null && (l = map.get("3")) != null) {
                        jLongValue = l.longValue();
                        size = (int) jLongValue;
                    }
                }
            } else {
                MixRankSkylightResponse mixRankSkylightData2 = inboxHorizontalTopListCombinePod2.getMixRankSkylightData();
                if (mixRankSkylightData2 != null && (skylightItems = mixRankSkylightData2.getSkylightItems()) != null && !skylightItems.isEmpty()) {
                    Iterator<MixRankSkylightItem> it5 = skylightItems.iterator();
                    size = 0;
                    while (it5.hasNext()) {
                        Integer num = it5.next().bizGroup;
                        if (num != null && num.intValue() == 3 && (size = size + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
            }
            size = 0;
        } else {
            if (C1599090riN.LIZ()) {
                StoryGetFeedByPageResponse storyGetFeedByPageResponse = inboxHorizontalTopListCombinePod2.getStoryGetFeedByPageResponse();
                if (storyGetFeedByPageResponse != null && (highlightTotalCount = storyGetFeedByPageResponse.getHighlightTotalCount()) != null) {
                    jLongValue = highlightTotalCount.longValue();
                    size = (int) jLongValue;
                }
            } else {
                StoryGetFeedByPageResponse storyGetFeedByPageResponse2 = inboxHorizontalTopListCombinePod2.getStoryGetFeedByPageResponse();
                if (storyGetFeedByPageResponse2 != null && (highlightUsers = storyGetFeedByPageResponse2.getHighlightUsers()) != null) {
                    size = highlightUsers.size();
                }
            }
            size = 0;
        }
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod3 = this.LLJJJJLIIL;
        if (inboxHorizontalTopListCombinePod3 != null && (listExtractStories2 = inboxHorizontalTopListCombinePod3.extractStories()) != null && (aweme = (Aweme) C13LP.LJJJLL(listExtractStories2)) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        interfaceC1595080rbuLIZJ.LJFF(size2, i, i2, iIntValue, iIntValue2, size, C729510SjV.LJIILJJIL(authorUid));
        C1597910rgT.LIZJ().LIZLLL(size2 > 0 ? 3 : 2, false, true);
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod4 = this.LLJJJJLIIL;
        if (inboxHorizontalTopListCombinePod4 == null || (listExtractStories = inboxHorizontalTopListCombinePod4.extractStories()) == null) {
            i3 = 2;
        } else {
            Iterator<Aweme> it6 = listExtractStories.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Aweme next2 = it6.next();
                if (!C729510SjV.LJIILJJIL(AwemeExtKt.getAuthorUid(next2))) {
                    if (next2 == null) {
                        break;
                    }
                }
            }
            i3 = 2;
        }
        C1597910rgT.LIZJ().LIZLLL(i3, false, false);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxSkylightWidgetAbility
    public final void Qo0() {
        C11JF c11jf = this.LLJJJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJJIL = null;
        AnonymousClass0956 anonymousClass0956 = this.LLJJJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJJJ = null;
    }

    public final void Zo() {
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod;
        List<Aweme> listExtractStories;
        Aweme next;
        List<Aweme> stories;
        if (!C328170Ctj.LIZ.enabled || (inboxHorizontalTopListCombinePod = this.LLJJJJLIIL) == null || (listExtractStories = inboxHorizontalTopListCombinePod.extractStories()) == null) {
            return;
        }
        Iterator<Aweme> it2 = listExtractStories.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (C729510SjV.LJIILJJIL(AwemeExtKt.getAuthorUid(next))) {
                    break;
                }
            }
        }
        Aweme aweme = next;
        if (aweme != null) {
            C328160Cti c328160Cti = C328160Cti.LIZ;
            UserStory userStory = aweme.getUserStory();
            if (userStory == null || (stories = userStory.getStories()) == null) {
                return;
            }
            c328160Cti.getClass();
            C328160Cti.LIZ(stories);
        }
    }

    public final void xs() {
        InterfaceC1891350zJl interfaceC1891350zJl;
        C20600815jK<InterfaceC1891350zJl> state;
        InboxLiveNotice inboxLiveNoticeLIZIZ;
        C20600815jK<InterfaceC1891350zJl> state2;
        List<InterfaceC1891350zJl> listLJII;
        InterfaceC1891350zJl next;
        C1598660rhg.LIZ.getClass();
        InterfaceC1598970riB interfaceC1598970riBLJFF = C1598660rhg.LJFF();
        if (interfaceC1598970riBLJFF != null) {
            interfaceC1598970riBLJFF.n3(EnumC1598770rhr.PAGE_CHANGE);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = C1598660rhg.LJII(this).LLJJIJI;
        Object obj = null;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (state2 = viewOnAttachStateChangeListenerC20604515jv.getState()) == null || (listLJII = state2.LJII()) == null) {
            interfaceC1891350zJl = null;
        } else {
            Iterator<InterfaceC1891350zJl> it2 = listLJII.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next instanceof AbstractC1598130rgp) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            interfaceC1891350zJl = next;
        }
        AbstractC1598130rgp abstractC1598130rgp = interfaceC1891350zJl instanceof AbstractC1598130rgp ? (AbstractC1598130rgp) interfaceC1891350zJl : null;
        if (abstractC1598130rgp != null && (inboxLiveNoticeLIZIZ = abstractC1598130rgp.LIZIZ()) != null && C1598200rgw.LIZ(inboxLiveNoticeLIZIZ, C1597910rgT.LIZJ().LIZJ)) {
            C1597910rgT.LIZJ().LIZLLL(0, true, true);
        }
        C1598660rhg.LIZ.getClass();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = C1598660rhg.LJII(this).LLJJIJI;
        if (viewOnAttachStateChangeListenerC20604515jv2 == null || (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) == null) {
            return;
        }
        List<InterfaceC1891350zJl> listLJII2 = state.LJII();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (ArrayList) listLJII2) {
            if (obj2 instanceof StoryInboxItem) {
                arrayList.add(obj2);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (!C729510SjV.LJIILJJIL(AwemeExtKt.getAuthorUid(((StoryInboxItem) next2).getStoryCollection()))) {
                obj = next2;
                break;
            }
        }
        StoryInboxItem storyInboxItem = (StoryInboxItem) obj;
        if (storyInboxItem == null || !storyInboxItem.isCacheData(C1597910rgT.LIZJ().LIZJ)) {
            return;
        }
        C1597910rgT.LIZJ().LIZLLL(0, true, false);
    }

    public final void ep() {
        if (C1599410rit.LIZ()) {
            if (C596340NaC.LIZJ()) {
                C596340NaC.LIZLLL("InboxSkylightWidgetV2#updateStoryDiskCache", true);
                C1598660rhg.LIZ.getClass();
                SkylightListViewModel skylightListViewModelLJII = C1598660rhg.LJII(this);
                List<ITEM> listListGetAll = skylightListViewModelLJII.listGetAll();
                if (listListGetAll == 0 || listListGetAll.isEmpty()) {
                    return;
                }
                C23250099c.LIZLLL(skylightListViewModelLJII.getAssemVMScope(), C0PEM.LIZJ, null, new C610870Nxd(listListGetAll, null), 2);
                return;
            }
            C596340NaC.LIZLLL("InboxSkylightWidgetV2#updateStoryDiskCache", false);
            C1598660rhg.LIZ.getClass();
            List<ITEM> listListGetAll2 = C1598660rhg.LJII(this).listGetAll();
            if (listListGetAll2 != 0) {
                for (ITEM item : listListGetAll2) {
                    if (item instanceof StoryInboxItem) {
                        ((StoryInboxItem) item).setReRankSequence(0);
                    }
                }
                if (!C1209404oG.LIZ()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listListGetAll2) {
                        if (obj instanceof StoryInboxItem) {
                            arrayList.add(obj);
                        }
                    }
                    C614770O9j.LIZIZ.LIZ().LJIIIIZZ(arrayList);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listListGetAll2) {
                    if ((obj2 instanceof StoryInboxItem) || (obj2 instanceof C1598180rgu)) {
                        arrayList2.add(obj2);
                    }
                }
                C614770O9j.LIZIZ.LIZ().LJIIIIZZ(arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0195  */
    /* JADX WARN: Type inference failed for: r2v32, types: [X.0rhx] */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lo() {
        /*
            Method dump skipped, instruction units count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.skylight.InboxSkylightWidgetV2.lo():void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        boolean zLJI = MethodIDManager.LJI(202383);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxSkylightWidgetV2", "onCreate");
        super.onCreate();
        System.currentTimeMillis();
        EventBus.LIZLLL().LJIJJ(this);
        C0JAU.LIZ().LJFF();
        C0JAU.LIZ().LJII(0L);
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LIZIZ("message");
        System.currentTimeMillis();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onDestroy() throws IllegalAccessException {
        super.onDestroy();
        C1558520qew.LJIIJ(this, InboxFragmentScope.class, InboxAbilityCenter$IInboxSkylightWidgetAbility.class, null);
        InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxFragmentAbility.class, null);
        if (inboxAbilityCenter$IInboxFragmentAbility != null) {
            inboxAbilityCenter$IInboxFragmentAbility.ZE1(this.LLJJL, this.LLJJLIIIJLLLLLLLZ);
        }
        EventBus.LIZLLL().LJJI(this);
        C11JF c11jf = this.LLJJJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJIJIIJIL = null;
        this.LLIZLLLIL.dispose();
        C1598660rhg.LIZ.getClass();
        C1598660rhg.LIZIZ = null;
        C1598660rhg.LJFF = false;
        C1598660rhg.LJI = false;
        C1598660rhg.LJII = null;
        C1598660rhg.LJ.LIZJ(-1);
        C0IS1<C0IR0> c0is1 = this.LLJLIL;
        if (c0is1 != null) {
            c0is1.LIZ();
        }
        if (C1591220rVg.LIZLLL()) {
            C1598160rgs c1598160rgs = C1598160rgs.LIZ;
            List list = (List) this.LLJLLL.getValue();
            c1598160rgs.getClass();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((C0ZP4) it2.next()).dispose();
            }
            SkylightListViewModel skylightListViewModel = this.LLJLLIL;
            if (skylightListViewModel != null) {
                skylightListViewModel.LLJILJIL = null;
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLJIJIL = false;
        this.LLJILJILJ = 0L;
        C1598660rhg c1598660rhg = C1598660rhg.LIZ;
        c1598660rhg.getClass();
        InterfaceC1598970riB interfaceC1598970riBLJFF = C1598660rhg.LJFF();
        if (interfaceC1598970riBLJFF != null) {
            interfaceC1598970riBLJFF.o4(EnumC1598770rhr.PAGE_CHANGE);
        }
        if (!LiveConsumingFunOpt.enableInboxCacheOpt() || !this.LLJZ) {
            ep();
        }
        c1598660rhg.getClass();
        C1598660rhg.LJ.LIZJ(7);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        String stringExtra;
        C19EG activity;
        Intent intent;
        Intent intent2;
        super.onResume();
        this.LLJZ = false;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxSkylightWidgetV2", "onResume");
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (intent2 = c19egLIZ.getIntent()) == null) {
            stringExtra = "";
        } else {
            try {
                stringExtra = intent2.getStringExtra("to_inbox_key");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
        }
        if (Intrinsics.LJFF(stringExtra, "to_inbox_value")) {
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            dp(c19egLIZ2 != null ? c19egLIZ2.getIntent() : null, "to_inbox_value", true);
            C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
            if (c19egLIZ3 != null && (intent = c19egLIZ3.getIntent()) != null) {
                intent.removeExtra("to_inbox_key");
            }
        }
        this.LLJIJIL = true;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (activity = fragmentLJI.getActivity()) != null && C1058550deX.LIZIZ(activity, "NOTIFICATION")) {
            C1598660rhg.LIZ.getClass();
            C1598660rhg.LJ.LIZJ(6);
            xs();
        }
        IStoryRevealService iStoryRevealServiceLJJJJ = C1618440sDa.LIZIZ.LJJJJ();
        boolean z = iStoryRevealServiceLJJJJ != null && iStoryRevealServiceLJJJJ.LJIILJJIL();
        if (this.LLJ || this.LLJI || z || this.LLJILLL || C1903400zdC.LIZ(this.LLJILJIL)) {
            vo(EnumC1599580rjA.WIDGET_INTERNAL);
        }
        this.LLJ = false;
        this.LLJI = false;
        this.LLJILLL = false;
    }

    public static long bp(boolean z) {
        int iLIZ;
        if (C1599090riN.LIZ()) {
            if (z) {
                iLIZ = C1599090riN.LIZIZ().firstRefreshPageCount;
            } else {
                iLIZ = C1599090riN.LIZIZ().refreshPageCount;
            }
        } else {
            iLIZ = C0BV5.LIZ();
        }
        return iLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxSkylightWidgetAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Bv(X.EnumC1599580rjA r9) {
        /*
            r8 = this;
            X.0rjA r0 = X.EnumC1599580rjA.INBOX_NEW_HIGH_VALUE_LIVE
            r6 = 1
            if (r9 != r0) goto L87
            X.0rhg r0 = X.C1598660rhg.LIZ
            r0.getClass()
            X.0riB r0 = X.C1598660rhg.LJFF()
            r3 = 0
            if (r0 == 0) goto L34
            X.0rkZ r2 = r0.LLZZJLIL()
            if (r2 == 0) goto L35
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r2.getLayoutManager()
        L1b:
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L22
            r3 = r1
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
        L22:
            r7 = 0
            if (r3 == 0) goto L2b
            int r0 = r3.findFirstVisibleItemPosition()
            if (r0 > 0) goto L33
        L2b:
            if (r2 == 0) goto L37
            int r0 = r2.getScrollState()
            if (r0 != r6) goto L37
        L33:
            return r7
        L34:
            r2 = r3
        L35:
            r1 = r3
            goto L1b
        L37:
            long r1 = r8.LLJILJILJ
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r3 = "InboxSkylightWidgetV2"
            if (r0 > 0) goto L59
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ont refresh --- "
            r2.append(r0)
            long r0 = r8.LLJILJILJ
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            X.C1720106oR.LJI(r3, r0)
            return r7
        L59:
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r1
            X.01GW r0 = X.C1559360qgI.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ab.SkylightLiveRefreshConfig r0 = (com.ss.android.ugc.aweme.ab.SkylightLiveRefreshConfig) r0
            int r0 = r0.refreshInterval
            int r0 = r0 * 1000
            long r1 = (long) r0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L87
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ont refresh ---not outOfRefreshInterval "
            r2.append(r0)
            long r0 = r8.LLJILJILJ
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            X.C1720106oR.LJI(r3, r0)
            return r7
        L87:
            r8.vo(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.skylight.InboxSkylightWidgetV2.Bv(X.0rjA):boolean");
    }

    public final void So(Throwable th) {
        String simpleName;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSkylightWidgetV2.onError: ");
        String message = null;
        if (th != null) {
            simpleName = th.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        sbLIZ.append(simpleName);
        sbLIZ.append(": ");
        if (th != null) {
            message = th.getMessage();
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJJJJLIIL == null) {
            Co(C1889340zGW.LIZ);
        } else {
            Co(C1889360zGY.LIZ);
        }
    }

    public final long ap(boolean z) {
        if (C295190Bhd.LIZJ() && this.LLJJI == null) {
            return 1L;
        }
        if (C295190Bhd.LIZJ() && this.LLJJI != null) {
            return 2L;
        }
        return bp(z);
    }

    public final boolean cp(EnumC1599580rjA enumC1599580rjA) {
        SkylightLocalRerankExpData skylightLocalRerankExpData = C1599000riE.LIZ;
        if (!skylightLocalRerankExpData.enableReorder) {
            return false;
        }
        C1598660rhg.LIZ.getClass();
        SkylightListViewModel skylightListViewModelLJII = C1598660rhg.LJII(this);
        if (skylightListViewModelLJII.LLJJIJIL <= 0 || this.LLJJI != null || System.currentTimeMillis() - skylightListViewModelLJII.LLJJIJIL >= skylightLocalRerankExpData.skylightRerankGapInS * ((long) LSPassThroughRecordSizeConfig.DEFAULT) || enumC1599580rjA == EnumC1599580rjA.PULL_TO_REFRESH || enumC1599580rjA == EnumC1599580rjA.SWITCH_TAB || enumC1599580rjA == EnumC1599580rjA.INBOX_NEW_HIGH_VALUE_LIVE) {
            return false;
        }
        return true;
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        vo(EnumC1599580rjA.WIDGET_INTERNAL);
    }

    @C14EU
    public final void onEvent(C0IHI c0ihi) {
        if (c0ihi.LIZIZ == C0II3.BLOCKED_BY_ANCHOR) {
            vo(EnumC1599580rjA.WIDGET_INTERNAL);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void onNewIntent(Intent intent) {
        Jo(intent, false);
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onNoticeCountChangedEvent(C1619080sEc c1619080sEc) {
        InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility;
        if (c1619080sEc.LIZJ != 2) {
            return;
        }
        int i = c1619080sEc.LIZLLL;
        if (i == 301) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("InboxSkylightWidgetV2", "refactor notice count init finish");
            return;
        }
        if (i != 201) {
            return;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRedPointUpdate isResume=");
        sbLIZ.append(this.LLJIJIL);
        C1720106oR.LJI("InboxSkylightWidgetV2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJIJIL && (inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IInboxFragmentAbility.class, null)) != null && inboxAbilityCenter$IInboxFragmentAbility.zE1(C724240Sb0.LJI(this))) {
            C1720106oR.LJI("InboxSkylightWidgetV2", "onRedPointUpdate need refresh");
            vo(EnumC1599580rjA.WIDGET_INTERNAL);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onNoticeDeleted(C1900840zZ4 c1900840zZ4) {
        this.LLJ = true;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onNoticeUpdate(C0OKV c0okv) {
        this.LLJI = true;
    }

    @C14EU
    public final void onStoryPublishStart(C1439490nYx c1439490nYx) {
        Context context;
        if (Intrinsics.LJFF(c1439490nYx.LIZ, "inbox_top_cell") && (context = getContext()) != null) {
            C1598660rhg c1598660rhg = C1598660rhg.LIZ;
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            c1598660rhg.getClass();
            C1598660rhg.LJ(context, fragmentLJI).LLZZJLIL().scrollToPosition(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void vo(EnumC1599580rjA enumC1599580rjA) {
        boolean z;
        boolean z2;
        boolean z3;
        EnumC1582650rHr enumC1582650rHr;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSkylightWidgetV2.onRefresh: ENTER from=");
        sbLIZ.append(enumC1599580rjA);
        sbLIZ.append(" isRefresh=");
        sbLIZ.append(this.LLJJJ);
        sbLIZ.append(" insertStory=");
        if (this.LLJJI != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onRefresh --- ");
        sbLIZ2.append(enumC1599580rjA);
        C1720106oR.LJI("InboxSkylightWidgetV2", C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LLJJI != null && enumC1599580rjA == EnumC1599580rjA.WIDGET_INTERNAL) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.LLJJJ && z2) {
            return;
        }
        if (this.LLJJJ) {
            C1720106oR.LJI("InboxSkylightWidgetV2", "onRefresh -- ignore refreshing request because of insertStory");
        }
        if (this.LLJJI != null && this.LLJJJ) {
            C1720106oR.LJI("InboxSkylightWidgetV2", "onRefresh -- dispose refreshing request because of insertStory");
            C11JF c11jf = this.LLJJJIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onRefresh actual--- ");
        sbLIZ3.append(enumC1599580rjA);
        C1720106oR.LJI("InboxSkylightWidgetV2", C2188811AlT.LIZIZ(sbLIZ3));
        C1598660rhg.LIZ.getClass();
        C1599560rj8 c1599560rj8 = C1598660rhg.LJ;
        if (c1599560rj8.LIZ(0)) {
            C1598730rhn c1598730rhn = C1598660rhg.LIZLLL;
            if (c1598730rhn.LIZIZ) {
                long jCurrentTimeMillis = System.currentTimeMillis() - c1598730rhn.LIZ;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("state", "init");
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                C20684815ws.LJIILLIIL("inbox_skylight_lifecycle", c2344009Gk.LIZ);
                c1598730rhn.LIZIZ = false;
            }
        }
        C1598730rhn c1598730rhn2 = C1598660rhg.LIZLLL;
        c1598730rhn2.getClass();
        c1598730rhn2.LIZLLL = System.currentTimeMillis();
        c1599560rj8.LIZJ(2);
        C0JAU.LIZ().LJIIIIZZ(0L);
        if (ActivityStack.getTopActivity() != null) {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                C1598660rhg.LIZ.getClass();
                C1598730rhn.LIZJ(C1598660rhg.LIZLLL, 11);
                C1598660rhg.LJ.LIZIZ(2);
                return;
            }
        }
        if (this.LLJILJIL == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        this.LLJILJIL = jCurrentTimeMillis2;
        this.LLJILJILJ = jCurrentTimeMillis2;
        if (z3) {
            enumC1582650rHr = EnumC1582650rHr.REFRESH;
        } else if (enumC1599580rjA == EnumC1599580rjA.PULL_TO_REFRESH) {
            enumC1582650rHr = EnumC1582650rHr.MANUAL_REFRESH;
        } else if (enumC1599580rjA == EnumC1599580rjA.INBOX_NEW_HIGH_VALUE_LIVE) {
            enumC1582650rHr = EnumC1582650rHr.LIVE_HIGH_VALUE_FOLLOW_RELATIONSHIP;
        } else if (Intrinsics.LJFF(this.LLJJIII, "to_inbox_value") && this.LLJJI != null) {
            enumC1582650rHr = EnumC1582650rHr.IN_APP_PUSH;
        } else {
            enumC1582650rHr = EnumC1582650rHr.AUTO_REFRESH;
        }
        ((LinkedHashMap) C712140Rwa.LIZ).clear();
        if (Intrinsics.LJFF(enumC1599580rjA.getDetail(), "init")) {
            Oo(enumC1582650rHr.getType(), enumC1599580rjA, true);
        } else {
            Oo(enumC1582650rHr.getType(), enumC1599580rjA, false);
        }
        StoryFriendAnniversaryService storyFriendAnniversaryService = (StoryFriendAnniversaryService) PluggableExtentionKt.pluggableSpi$default(StoryFriendAnniversaryService.class, false, false, false, 14, null);
        if (storyFriendAnniversaryService != null) {
            storyFriendAnniversaryService.LIZJ();
        }
    }

    @C14EU
    public final void onEvent(C479920Iru c479920Iru) {
        this.LLJZ = true;
    }

    public final List Ho(int i, boolean z) {
        AnonymousClass0060 c1596740rea;
        long jAp;
        int i2;
        boolean zLIZ = C1209404oG.LIZ();
        if (zLIZ) {
            boolean zCanShowStoryCell = C1618440sDa.LIZIZ.LJJIIZI().canShowStoryCell();
            C1599110riP.LIZ().LIZIZ();
            boolean zLIZ2 = C1599090riN.LIZ();
            boolean zLIZJ = C295190Bhd.LIZJ();
            if (zLIZJ && zLIZ2) {
                jAp = bp(z);
            } else {
                jAp = ap(z);
            }
            ArrayList arrayList = new ArrayList();
            if (zCanShowStoryCell) {
                arrayList.add(1);
                if (C298520Bn0.LIZ()) {
                    arrayList.add(3);
                }
            }
            arrayList.add(2);
            if (C1439905kL.LIZ()) {
                arrayList.add(4);
            }
            if (zLIZ2) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (zLIZJ && zLIZ2) {
                linkedHashMap.put("1", Long.valueOf(ap(z)));
            }
            if (zCanShowStoryCell && C298520Bn0.LIZ()) {
                linkedHashMap.put("3", Long.valueOf(((Number) C1596630reP.LIZ.getValue()).intValue()));
            }
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = null;
            }
            c1596740rea = new C1596970rex(Long.valueOf(jAp), this.LLJJI, C1256440ini.LIZ() ? 1 : 0, Integer.valueOf(i), arrayList, Integer.valueOf(i2), C1599110riP.LIZ().LJIIJ(), linkedHashMap, false, null, null, 1792);
        } else {
            c1596740rea = new C1596740rea(Long.valueOf(ap(z)), this.LLJJI, C1256440ini.LIZ() ? 1 : 0, Integer.valueOf(i), null, null, null, 0, 0, 496);
        }
        return C1697810uHb.LJIIJJI(c1596740rea, new AnonymousClass0064(z, zLIZ));
    }

    public final void Jo(Intent intent, boolean z) {
        String stringExtra;
        int intExtra = -1;
        if (intent != null) {
            intExtra = intent.getIntExtra("intent_story_widget_action", -1);
            try {
                stringExtra = intent.getStringExtra("enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
        } else {
            stringExtra = "";
        }
        if (intExtra == 1) {
            dp(intent, stringExtra, !z);
        }
    }

    public final void Vo(List list, boolean z) {
        InterfaceC676420Qg4 interfaceC676420Qg4;
        Object c098200Yq;
        C0JAU.LIZ().LJIIIZ();
        if (z) {
            C0JAU.LIZ().LIZIZ();
        }
        if (C285800BIc.LIZ() && list != null && C285800BIc.LIZ()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    c098200Yq = (SlimRoom) C08JS.LIZ((String) it2.next(), SlimRoom.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                final SlimRoom slimRoom = (SlimRoom) c098200Yq;
                if (slimRoom != null) {
                    arrayList.add(new InterfaceC1479620obg() { // from class: X.0SUZ
                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ void LIZ() {
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ InterfaceC691690RBf LIZIZ() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ String LIZJ() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ C1479570obb LIZLLL() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ HashMap LJ() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ SimVideoUrlModel LJFF() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ void LJI() {
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ List LJII() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ C1698870uJJ LJIIIZ() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ void LJIIJ() {
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ List LJIIJJI() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ void getAspectRatio() {
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ long getDuration() {
                            return 0L;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ String getFormat() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ String getMeta() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ String getRatio() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ C1479530obX getRequest() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ void getVideoHeight() {
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ void getVideoWidth() {
                        }

                        @Override // X.InterfaceC1479620obg
                        public final InterfaceC1483230ohV LJIIIIZZ() {
                            final SlimRoom slimRoom2 = slimRoom;
                            return new InterfaceC1483230ohV() { // from class: X.00qv
                                @Override // X.InterfaceC1483230ohV
                                public final String LIZ() {
                                    JSONObject jSONObject = new JSONObject();
                                    SlimRoom slimRoom3 = slimRoom2;
                                    try {
                                        jSONObject.putOpt("live_json_string_data", slimRoom3.getMultiStreamData());
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("live_room_mode", slimRoom3.liveRoomMode);
                                        TaxonomyTagInfo taxonomyTagInfo = slimRoom3.taxonomyTagInfo;
                                        if (taxonomyTagInfo != null) {
                                            jSONObject2.put("level1_tag", taxonomyTagInfo.level1Tag);
                                            jSONObject2.put("level2_tag", taxonomyTagInfo.level2Tag);
                                        }
                                        C189200o6.m2constructorimpl(jSONObject.put("extra", jSONObject2));
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                                    }
                                    return C786410Ut5.J3(jSONObject);
                                }
                            };
                        }

                        @Override // X.InterfaceC1479620obg
                        public final String getKey() {
                            return String.valueOf(slimRoom.getId());
                        }
                    });
                }
            }
            C13LP.LJJLIIIJ(arrayList, "; ", null, null, 0, null, AFwS263S0000000_23.get$arr$(45), 30);
            C0IS1<C0IR0> c0is1 = this.LLJLIL;
            if (c0is1 != null) {
                c0is1.LIZJ();
            }
            C0IS1<C0IR0> c0is12 = this.LLJLIL;
            if (c0is12 != null && (interfaceC676420Qg4 = (InterfaceC676420Qg4) c0is12.LIZLLL()) != null) {
                interfaceC676420Qg4.LJIIIIZZ(this.LLJL, arrayList);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final RecyclerView.ViewHolder uo(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        C1598660rhg c1598660rhg = C1598660rhg.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        Context context = viewGroup.getContext();
        c1598660rhg.getClass();
        return (RecyclerView.ViewHolder) C1598660rhg.LJ(context, fragmentLJI);
    }

    public final void Oo(int i, EnumC1599580rjA enumC1599580rjA, boolean z) {
        boolean zLJI = MethodIDManager.LJI(202250);
        boolean zLJI2 = MethodIDManager.LJI(202161);
        if (C1206204nk.LIZ()) {
            C1598660rhg.LIZ.getClass();
            C2252408s6.LJIIIZ(new C1598720rhm(this, C1598660rhg.LJII(this), z, i));
            C588470N6f.LIZ.getClass();
            C588470N6f.LIZ();
            if (zLJI2) {
                MethodIDManager.LJ();
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C1598660rhg.LIZ.getClass();
        C2252408s6.LJIIIZ(new C1598710rhl(z, i, enumC1599580rjA, this, C1598660rhg.LJII(this)));
        C588470N6f.LIZ.getClass();
        C588470N6f.LIZ();
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dp(android.content.Intent r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            java.lang.String r5 = ""
            if (r7 == 0) goto L11
            java.lang.String r0 = "uid"
            java.lang.String r1 = r7.getStringExtra(r0)     // Catch: java.lang.Exception -> Ld
            if (r1 != 0) goto L14
            goto L11
        Ld:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L11:
            r1 = r5
            if (r7 == 0) goto L22
        L14:
            java.lang.String r0 = "id"
            java.lang.String r0 = r7.getStringExtra(r0)     // Catch: java.lang.Exception -> L1e
            if (r0 == 0) goto L22
            r5 = r0
            goto L22
        L1e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L22:
            com.ss.android.ugc.aweme.story.inbox.InsertStory r4 = new com.ss.android.ugc.aweme.story.inbox.InsertStory     // Catch: java.lang.Exception -> L3b
            long r2 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r1)     // Catch: java.lang.Exception -> L3b
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r5)     // Catch: java.lang.Exception -> L3b
            r4.<init>(r2, r0)     // Catch: java.lang.Exception -> L3b
            r6.LLJJI = r4     // Catch: java.lang.Exception -> L3b
            r6.LLJJIII = r8     // Catch: java.lang.Exception -> L3b
            if (r9 == 0) goto L46
            X.0rjA r0 = X.EnumC1599580rjA.WIDGET_INTERNAL     // Catch: java.lang.Exception -> L3b
            r6.vo(r0)     // Catch: java.lang.Exception -> L3b
            return
        L3b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = r0.getMessage()
            X.C2344809Gs.LJ(r0)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.skylight.InboxSkylightWidgetV2.dp(android.content.Intent, java.lang.String, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void so(RecyclerView.ViewHolder viewHolder, InterfaceC1891350zJl interfaceC1891350zJl, int i) {
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod;
        AbstractC1903430zdF abstractC1903430zdF;
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod2 = this.LLJJJJLIIL;
        if ((inboxHorizontalTopListCombinePod2 == null || !inboxHorizontalTopListCombinePod2.getOriginalState()) && (inboxHorizontalTopListCombinePod = this.LLJJJJLIIL) != null && (viewHolder instanceof AbstractC1903430zdF) && (abstractC1903430zdF = (AbstractC1903430zdF) viewHolder) != null) {
            abstractC1903430zdF.I5(i, inboxHorizontalTopListCombinePod);
        }
    }
}
