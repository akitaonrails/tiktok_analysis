package com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel;

import X.C01GW;
import X.C09JN;
import X.C0AWS;
import X.C0RJN;
import X.C0S12;
import X.C10EU;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C1389300mG0;
import X.C13LE;
import X.C1578630rBN;
import X.C1600750rl3;
import X.C1601110rld;
import X.C1618440sDa;
import X.C1701940uOG;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2189821An6;
import X.C442540HWy;
import X.C630650OoR;
import X.C726970SfP;
import X.C727100Sfc;
import X.C727150Sfh;
import X.C727160Sfi;
import X.C727170Sfj;
import X.C727870Sgr;
import X.C728370Shf;
import X.C729220Sj2;
import X.EnumC630660OoS;
import X.InterfaceC19483011Ki;
import X.InterfaceC2217241BqE;
import X.InterfaceC726980SfQ;
import Y.AfS4S2100100_9;
import Y.AkS474S0100000_11;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.ss.android.ugc.aweme.feed.model.story.highlights.HighlightSkylightUser;
import com.ss.android.ugc.aweme.feed.model.story.highlights.SkylightHighlightAwemeInfo;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserFilterStoryInfo;
import com.ss.android.ugc.aweme.service.ISocPubStatusRepoService;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver;
import com.ss.android.ugc.aweme.story.highlights.inbox.SkylightHighlightsAwemeResponse;
import com.ss.android.ugc.aweme.story.model.ClientControlParams;
import com.ss.android.ugc.aweme.story.preload.v2.IStoryPreloaderV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS33S2200000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public class StoryFeedViewModel extends DataCenter implements InterfaceC726980SfQ {
    public static final /* synthetic */ int LLJJIJIL = 0;
    public final LifecycleOwner LLIZ;
    public final C2189821An6 LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final C11NJ LLJIJIL;
    public final Map<String, Aweme> LLJILJIL;
    public final Map<String, List<C630650OoR>> LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final Set<String> LLJJI;
    public final C727100Sfc LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;

    public boolean GQ2() {
        return !(this instanceof StoryArchiveV2FeedViewModel);
    }

    public boolean HQ2() {
        return !(this instanceof StoryArchiveV2FeedViewModel);
    }

    public void ZQ2(UserStoryResponse userStoryResponse) {
    }

    public final boolean QQ2() {
        return TextUtils.equals("story_archive", this.LLJ) || TextUtils.equals(this.LLIZLLLIL.getFrom(), "STORY_ENTRANCE_ARCHIVE");
    }

    public final boolean RQ2() {
        return TextUtils.equals("personal_homepage", this.LLJ) && Intrinsics.LJFF(this.LLIZLLLIL.getFrom(), "STORY_ENTRANCE_MINE");
    }

    public final boolean SQ2() {
        return TextUtils.equals("personal_homepage", this.LLJ) && Intrinsics.LJFF("from_profile_self", this.LLIZLLLIL.getFrom());
    }

    public final boolean TQ2() {
        return TextUtils.equals("homepage_follow", this.LLJ) && !TextUtils.equals("STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST_NEW", this.LLIZLLLIL.getFrom());
    }

    public final boolean UQ2() {
        return TextUtils.equals("homepage_friends", this.LLJ) && !C1600750rl3.LJ(this.LLIZLLLIL.getFrom());
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLIZ.getLifecycle();
    }

    public final List<Aweme> IQ2() {
        return (SQ2() || TQ2() || UQ2()) ? C729220Sj2.LL.LJIILL() : C729220Sj2.LL.LJIIIZ();
    }

    public final boolean VQ2() {
        return TQ2() || UQ2();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.DataCenter, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLJIJIL.LJ();
        C729220Sj2.LL.LJIIL(this.LLJI);
    }

    public static String MQ2(Aweme aweme) {
        boolean zLJI = MethodIDManager.LJI(202236);
        User author = aweme.getAuthor();
        String str = "";
        if (author != null) {
            String uid = author.getUid();
            if (uid != null) {
                str = uid;
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return str;
        }
        UserStory userStory = aweme.getUserStory();
        if (userStory == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return "";
        }
        if (userStory.getStories().size() > 0) {
            String authorUid = AwemeExtKt.getAuthorUid((Aweme) ListProtector.get(userStory.getStories(), 0));
            if (authorUid != null) {
                str = authorUid;
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return str;
        }
        String aid = aweme.getAid();
        if (aid != null) {
            str = aid;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return str;
    }

    public static boolean WQ2(String str) {
        String uid;
        User userLIZ = C10EU.LIZ();
        if (userLIZ != null) {
            uid = userLIZ.getUid();
        } else {
            uid = null;
        }
        return TextUtils.equals(str, uid);
    }

    public String LQ2(Aweme aweme) {
        if (a0.LJJIIZI(aweme.getAid(), "highlight", false)) {
            return aweme.getAid();
        }
        return MQ2(aweme);
    }

    public final boolean XQ2(String str) {
        if (WQ2(str) && IQ2().size() > 0 && ((Boolean) this.LLJJ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    public final void aR2(UserStory userStory) {
        Fragment fragment;
        Context context;
        IStoryPreloaderV2 iStoryPreloaderV2LJJLI;
        if (((Boolean) C0AWS.LIZ.getValue()).booleanValue()) {
            List<Aweme> stories = userStory.getStories();
            if ((!stories.isEmpty()) && (iStoryPreloaderV2LJJLI = C1618440sDa.LIZIZ.LJJLI()) != null) {
                iStoryPreloaderV2LJJLI.LIZ(stories, null, AFwS232S0000000_4.get$arr$(2));
                return;
            }
            return;
        }
        LifecycleOwner lifecycleOwner = this.LLIZ;
        if (!(lifecycleOwner instanceof Fragment) || (fragment = (Fragment) lifecycleOwner) == null || (context = fragment.getContext()) == null) {
            return;
        }
        for (Aweme aweme : userStory.getStories()) {
            C442540HWy.LIZ.getClass();
            C442540HWy.LIZIZ(context, aweme);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StoryFeedViewModel(androidx.lifecycle.LifecycleOwner r5, X.C2189821An6 r6) {
        /*
            r4 = this;
            r4.<init>()
            r4.LLIZ = r5
            r4.LLIZLLLIL = r6
            java.lang.String r3 = r6.getEventType()
            r4.LLJ = r3
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            java.lang.String r0 = ":story_feed_view_model"
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            r4.LLJI = r2
            X.11NJ r0 = new X.11NJ
            r0.<init>()
            r4.LLJIJIL = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r4.LLJILJIL = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r4.LLJILJILJ = r0
            r0 = 312(0x138, float:4.37E-43)
            kotlin.jvm.internal.AFwS195S0000000_9 r0 = kotlin.jvm.internal.AFwS195S0000000_9.get$arr$(r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r0)
            r4.LLJILLL = r0
            kotlin.jvm.internal.AwS555S0100000_11 r1 = new kotlin.jvm.internal.AwS555S0100000_11
            r0 = 607(0x25f, float:8.5E-43)
            r1.<init>(r4, r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r1)
            r4.LLJJ = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r4.LLJJI = r0
            r4.LLILLL = r5
            boolean r0 = r4.RQ2()
            if (r0 != 0) goto L94
            java.lang.String[] r1 = X.C0RMB.LJFF
            java.lang.String r0 = r6.getFrom()
            int r0 = X.C13LQ.LJJIJIIJI(r0, r1)
            if (r0 >= 0) goto L94
            boolean r0 = r4.VQ2()
            if (r0 != 0) goto L94
            java.lang.String r1 = r6.getEventType()
            java.lang.String r0 = "story_views_list_panel"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L80
            boolean r0 = r4.QQ2()
            if (r0 == 0) goto L94
        L80:
            java.lang.String r0 = "comment_to_story"
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto La6
            java.lang.String r1 = r6.getFrom()
            java.lang.String r0 = "STORY_ENTRANCE_COMMON"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto La6
        L94:
            X.0Sj2 r1 = X.C729220Sj2.LL
            X.0RSa r0 = new X.0RSa
            r0.<init>()
            r1.LJII(r2, r0)
        L9e:
            X.0Sfc r0 = new X.0Sfc
            r0.<init>()
            r4.LLJJIII = r0
            return
        La6:
            java.lang.String r0 = r6.getTargetCreationId()
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L9e
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel.<init>(androidx.lifecycle.LifecycleOwner, X.1An6):void");
    }

    public static final boolean KQ2(Aweme aweme, UserStory userStory) {
        Story story = aweme.getStory();
        if ((story == null || !story.isPublishing()) && !AwemeBizExtKt.isLocalUnpublishedAweme(aweme) && aweme.getCreateTime() * ((long) LSPassThroughRecordSizeConfig.DEFAULT) <= userStory.getLastStoryCreatedAt()) {
            return false;
        }
        return true;
    }

    public final Aweme EQ2(String str, String str2) {
        User author;
        Aweme aweme = new Aweme();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(UUID.randomUUID());
        aweme.setAid(C2188811AlT.LIZIZ(sbLIZ));
        aweme.setAwemeType(40);
        AwemeBizExtKt.setStoryFakeAweme(aweme, true);
        AwemeBizExtKt.setFakeAid(aweme, UUID.randomUUID().toString());
        Story story = new Story(0L, false, 0L, null, 0L, false, false, false, false, false);
        story.setFaked(true);
        aweme.setStory(story);
        Aweme aweme2 = (Aweme) ((LinkedHashMap) this.LLJILJIL).get(str);
        if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
            aweme.setAuthor(author);
        }
        aweme.setIsTikTokStory(true);
        return aweme;
    }

    public final List<C630650OoR> PQ2(String str, String str2) {
        UserStory userStory;
        Aweme aweme = (Aweme) ((LinkedHashMap) this.LLJILJIL).get(str);
        if (aweme != null && (userStory = aweme.getUserStory()) != null) {
            int totalCount = (int) userStory.getTotalCount();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < totalCount; i3++) {
                long j = i3;
                String str3 = "";
                if (j >= userStory.getCurrentPosition() && j < ((long) userStory.getStories().size()) + userStory.getCurrentPosition()) {
                    String aid = ((Aweme) ListProtector.get(userStory.getStories(), i)).getAid();
                    if (aid != null) {
                        str3 = aid;
                    }
                    arrayList.add(new C630650OoR(str3, EnumC630660OoS.LOADED));
                    i++;
                } else if (XQ2(str2) && i3 >= totalCount - IQ2().size()) {
                    String aid2 = ((Aweme) ListProtector.get(IQ2(), i2)).getAid();
                    if (aid2 != null) {
                        str3 = aid2;
                    }
                    arrayList.add(new C630650OoR(str3, EnumC630660OoS.PUBLISH));
                    i2++;
                } else {
                    arrayList.add(new C630650OoR("", EnumC630660OoS.UNLOADING));
                }
            }
            this.LLJILJILJ.put(str, arrayList);
            return arrayList;
        }
        return new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int FQ2(com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel.FQ2(com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel, java.lang.String, java.lang.String):int");
    }

    public final boolean DQ2(long j, String str, boolean z) {
        UserStory userStory;
        long maxCursor;
        Aweme aweme = (Aweme) ((LinkedHashMap) this.LLJILJIL).get(str);
        if (aweme != null && (userStory = aweme.getUserStory()) != null) {
            if (z) {
                maxCursor = userStory.getMinCursor();
            } else {
                maxCursor = userStory.getMaxCursor();
            }
            Long lValueOf = Long.valueOf(maxCursor);
            if (lValueOf != null && lValueOf.longValue() == j) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int JQ2(java.lang.String r18, java.lang.String r19, java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r20) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel.JQ2(java.lang.String, java.lang.String, java.util.List):int");
    }

    public final List<Aweme> NQ2(String str, String str2, boolean z) {
        UserStory userStory;
        List<Aweme> arrayList;
        Aweme aweme = (Aweme) ((LinkedHashMap) this.LLJILJIL).get(str);
        if (aweme != null && (userStory = aweme.getUserStory()) != null) {
            if (XQ2(str2)) {
                C729220Sj2.LL.LJIILJJIL(userStory);
                arrayList = IQ2();
            } else {
                arrayList = new ArrayList<>();
            }
            if (!userStory.getHasMoreAfter() && !userStory.getHasMoreBefore()) {
                userStory.setOriginTotalCount(userStory.getStories().size());
                userStory.setTotalCount(userStory.getOriginTotalCount() + ((long) arrayList.size()));
            }
            if (userStory.getTotalCount() <= userStory.getStories().size()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(userStory.getStories());
                arrayList2.addAll(arrayList);
                if (z && (!arrayList2.isEmpty())) {
                    arrayList2.add(C0S12.LIZ(str2));
                }
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(userStory.getStories());
            if (userStory.getCurrentPosition() + ((long) userStory.getStories().size()) < userStory.getTotalCount() - ((long) arrayList.size())) {
                long totalCount = ((userStory.getTotalCount() - ((long) arrayList.size())) - userStory.getCurrentPosition()) - ((long) userStory.getStories().size());
                do {
                    totalCount--;
                    arrayList3.add(EQ2(str, str2));
                } while (totalCount > 0);
            }
            arrayList3.addAll(arrayList);
            if (userStory.getCurrentPosition() > 0) {
                long currentPosition = userStory.getCurrentPosition();
                do {
                    currentPosition--;
                    ListProtector.add(arrayList3, 0, EQ2(str, str2));
                } while (currentPosition > 0);
            }
            if (z && (!arrayList3.isEmpty())) {
                arrayList3.add(C0S12.LIZ(str2));
            }
            return arrayList3;
        }
        return null;
    }

    public final void cR2(Aweme aweme, final String str, final String str2) {
        Class cls;
        UserStory userStory = aweme.getUserStory();
        if (userStory == null) {
            return;
        }
        this.LLJILJIL.put(str, aweme);
        if (XQ2(str2)) {
            OQ2(str, str2, userStory, true);
            C727870Sgr.LIZIZ(new AwS590S0100000_11(userStory, 180));
        }
        PQ2(str, str2);
        if (HQ2() && C1601110rld.LIZ() && WQ2(str2) && !this.LLJJIJI && !Intrinsics.LJFF(this.LLIZLLLIL.getFrom(), "STORY_ENTRANCE_DEFAULT") && !QQ2() && !Intrinsics.LJFF(this.LLIZLLLIL.getFrom(), "STORY_ENTRANCE_CELEBRATION")) {
            InterfaceC2217241BqE[] interfaceC2217241BqEArr = new InterfaceC2217241BqE[0];
            final C727150Sfh c727150Sfh = C727150Sfh.LIZLLL;
            if (C727170Sfj.class == C727170Sfj.class) {
                cls = C727170Sfj.class;
            } else {
                cls = C727160Sfi.class;
            }
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(cls);
            StoryReceiver storyReceiver = new StoryReceiver(str2, this, c727150Sfh);
            if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C727170Sfj.class))) {
                c727150Sfh.LJ(this, storyReceiver);
            }
            storyReceiver.LLILZ = c727150Sfh.LIZLLL().LJJIL(new InterfaceC19483011Ki() { // from class: X.0Sfk
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    C727230Sfp c727230Sfp = (C727230Sfp) obj;
                    if (Intrinsics.LJFF(c727150Sfh.LIZJ(c727230Sfp.LIZIZ, c727230Sfp.LIZJ), str2) && (!c727230Sfp.LIZ.isEmpty())) {
                        return true;
                    }
                    return false;
                }
            }).LJJJJZI(new AkS474S0100000_11(interfaceC2217241BqEArr, 0)).LJJII(c727150Sfh.LIZJ).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0SfT
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C09JN
                public final void accept(Object obj) {
                    UserStory userStory2;
                    C1C7U.LIZ("StoryFeedViewModel@f54f.trySubscribeMineChange$$inlined$subscribeUserStoryChanged$3");
                    C727230Sfp c727230Sfp = (C727230Sfp) obj;
                    List<InterfaceC2217241BqE<SUBSCRIBE_DATA, ?>> list = c727230Sfp.LIZ;
                    Aweme awemeM199clone = ((Aweme) c727230Sfp.LIZJ).m199clone();
                    Aweme aweme2 = (Aweme) ((LinkedHashMap) this.LL.LLJILJIL).get(str);
                    if (aweme2 != null && (userStory2 = awemeM199clone.getUserStory()) != null && !Intrinsics.LJFF(aweme2.getUserStory(), userStory2)) {
                        aweme2.setUserStory(userStory2);
                        InterfaceC2217241BqE[] interfaceC2217241BqEArr2 = {new C2217371BqR() { // from class: X.0Sfb
                            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                            public final Object get(Object obj2) {
                                return ((UserStory) obj2).getStories();
                            }

                            @Override // X.C2217371BqR, X.AbstractC2217331BqN
                            public final void set(Object obj2, Object obj3) {
                                ((UserStory) obj2).setStories((List) obj3);
                            }
                        }, new C2217371BqR() { // from class: X.0SfS
                            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                            public final Object get(Object obj2) {
                                return Long.valueOf(((UserStory) obj2).getCurrentPosition());
                            }

                            @Override // X.C2217371BqR, X.AbstractC2217331BqN
                            public final void set(Object obj2, Object obj3) {
                                ((UserStory) obj2).setCurrentPosition(((Number) obj3).longValue());
                            }
                        }, new C2217371BqR() { // from class: X.0SfU
                            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                            public final Object get(Object obj2) {
                                return Long.valueOf(((UserStory) obj2).getTotalCount());
                            }

                            @Override // X.C2217371BqR, X.AbstractC2217331BqN
                            public final void set(Object obj2, Object obj3) {
                                ((UserStory) obj2).setTotalCount(((Number) obj3).longValue());
                            }
                        }, new C2217371BqR() { // from class: X.0SfV
                            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                            public final Object get(Object obj2) {
                                return Long.valueOf(((UserStory) obj2).getOriginTotalCount());
                            }

                            @Override // X.C2217371BqR, X.AbstractC2217331BqN
                            public final void set(Object obj2, Object obj3) {
                                ((UserStory) obj2).setOriginTotalCount(((Number) obj3).longValue());
                            }
                        }, new C2217371BqR() { // from class: X.0SfY
                            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                            public final Object get(Object obj2) {
                                return Boolean.valueOf(((UserStory) obj2).getHasMoreAfter());
                            }

                            @Override // X.C2217371BqR, X.AbstractC2217331BqN
                            public final void set(Object obj2, Object obj3) {
                                ((UserStory) obj2).setHasMoreAfter(((Boolean) obj3).booleanValue());
                            }
                        }, new C2217371BqR() { // from class: X.0SfZ
                            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                            public final Object get(Object obj2) {
                                return Boolean.valueOf(((UserStory) obj2).getHasMoreBefore());
                            }

                            @Override // X.C2217371BqR, X.AbstractC2217331BqN
                            public final void set(Object obj2, Object obj3) {
                                ((UserStory) obj2).setHasMoreBefore(((Boolean) obj3).booleanValue());
                            }
                        }, new C2217371BqR() { // from class: X.0SfW
                            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                            public final Object get(Object obj2) {
                                return Long.valueOf(((UserStory) obj2).getMinCursor());
                            }

                            @Override // X.C2217371BqR, X.AbstractC2217331BqN
                            public final void set(Object obj2, Object obj3) {
                                ((UserStory) obj2).setMinCursor(((Number) obj3).longValue());
                            }
                        }, new C2217371BqR() { // from class: X.0SfX
                            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                            public final Object get(Object obj2) {
                                return Long.valueOf(((UserStory) obj2).getMaxCursor());
                            }

                            @Override // X.C2217371BqR, X.AbstractC2217331BqN
                            public final void set(Object obj2, Object obj3) {
                                ((UserStory) obj2).setMaxCursor(((Number) obj3).longValue());
                            }
                        }};
                        AwS33S2200000_11 awS33S2200000_11 = new AwS33S2200000_11(this.LL, str2, userStory2, str, 1);
                        Iterator it2 = list.iterator();
                        loop0: while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            int i = 0;
                            while (!Intrinsics.LJFF(next, interfaceC2217241BqEArr2[i])) {
                                i++;
                                if (i < 8) {
                                }
                            }
                            awS33S2200000_11.invoke();
                            break loop0;
                        }
                        C727080Sfa c727080Sfa = new C2217371BqR() { // from class: X.0Sfa
                            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                            public final Object get(Object obj2) {
                                return ((UserStory) obj2).getCurrentInfo();
                            }

                            @Override // X.C2217371BqR, X.AbstractC2217331BqN
                            public final void set(Object obj2, Object obj3) {
                                ((UserStory) obj2).setCurrentInfo((UserStoryCurrentInfo) obj3);
                            }
                        };
                        AwS412S0200000_11 awS412S0200000_11 = new AwS412S0200000_11(this.LL, userStory2, 1);
                        if (list.contains(c727080Sfa)) {
                            awS412S0200000_11.invoke();
                        }
                    }
                    C1C7U.LIZIZ("StoryFeedViewModel@f54f.trySubscribeMineChange$$inlined$subscribeUserStoryChanged$3");
                }
            }, new C09JN() { // from class: X.00P6
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("StoryFeedViewModel@f54f.trySubscribeMineChange$$inlined$subscribeUserStoryChanged$4");
                    C1C7U.LIZIZ("StoryFeedViewModel@f54f.trySubscribeMineChange$$inlined$subscribeUserStoryChanged$4");
                }
            });
            this.LLJJIJI = true;
        }
    }

    public final void fR2(String str, String str2, boolean z) {
        UserStory userStory;
        long currentPosition;
        long currentPosition2;
        Aweme aweme = (Aweme) ((LinkedHashMap) this.LLJILJIL).get(str);
        if (aweme != null && (userStory = aweme.getUserStory()) != null) {
            List<C630650OoR> listPQ2 = (List) ((LinkedHashMap) this.LLJILJILJ).get(str);
            if (listPQ2 == null) {
                listPQ2 = PQ2(str, str2);
            }
            if (z) {
                if (userStory.getCurrentPosition() < 5) {
                    currentPosition2 = 0;
                } else {
                    currentPosition2 = (userStory.getCurrentPosition() + 1) - ((long) 5);
                }
                int currentPosition3 = (int) userStory.getCurrentPosition();
                for (int i = (int) currentPosition2; i < currentPosition3; i++) {
                    if (i < listPQ2.size()) {
                        ListProtector.set(listPQ2, i, new C630650OoR("", EnumC630660OoS.LOADING));
                    }
                }
                return;
            }
            long j = 5;
            if (userStory.getCurrentPosition() + ((long) userStory.getStories().size()) + j >= userStory.getTotalCount()) {
                currentPosition = userStory.getTotalCount();
            } else {
                currentPosition = userStory.getCurrentPosition() + ((long) userStory.getStories().size()) + j;
            }
            int i2 = (int) currentPosition;
            for (int size = userStory.getStories().size() + ((int) userStory.getCurrentPosition()); size < i2; size++) {
                if (size < listPQ2.size() && ((C630650OoR) ListProtector.get(listPQ2, size)).LIZIZ == EnumC630660OoS.UNLOADING) {
                    ((C630650OoR) ListProtector.get(listPQ2, size)).LIZIZ = EnumC630660OoS.LOADING;
                }
            }
        }
    }

    public final void OQ2(String str, String str2, UserStory userStory, boolean z) {
        if (XQ2(str2)) {
            userStory.setTotalCount((userStory.getOriginTotalCount() + ((long) IQ2().size())) - ((long) C729220Sj2.LL.LJIILJJIL(userStory)));
            if (z) {
                PQ2(str, str2);
            }
        }
    }

    public void dR2(int i, String str, Integer num, String str2) {
        UserStory userStory;
        int iIntValue;
        int iIntValue2;
        Aweme aweme = (Aweme) ((LinkedHashMap) this.LLJILJIL).get(str);
        if (aweme != null && (userStory = aweme.getUserStory()) != null) {
            List<C630650OoR> listPQ2 = (List) ((LinkedHashMap) this.LLJILJILJ).get(str);
            if (listPQ2 == null) {
                listPQ2 = PQ2(str, str2);
            }
            if (userStory.getCurrentPosition() + ((long) userStory.getStories().size()) < userStory.getTotalCount()) {
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 1;
                }
                if (iIntValue2 + i >= userStory.getCurrentPosition() + ((long) userStory.getStories().size()) && userStory.getHasMoreAfter() && ((int) userStory.getCurrentPosition()) + userStory.getStories().size() < listPQ2.size() && ((C630650OoR) ListProtector.get(listPQ2, ((int) userStory.getCurrentPosition()) + userStory.getStories().size())).LIZIZ == EnumC630660OoS.UNLOADING) {
                    Set<String> set = this.LLJJI;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(userStory.getMaxCursor());
                    if (!set.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                        YQ2(str, str2, userStory.getMaxCursor(), false, userStory);
                    }
                }
            }
            if (userStory.getCurrentPosition() != 0) {
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1;
                }
                if (i - iIntValue <= userStory.getCurrentPosition() && userStory.getHasMoreBefore() && ((int) userStory.getCurrentPosition()) - 1 < listPQ2.size() && ((C630650OoR) ListProtector.get(listPQ2, ((int) userStory.getCurrentPosition()) - 1)).LIZIZ == EnumC630660OoS.UNLOADING) {
                    Set<String> set2 = this.LLJJI;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(userStory.getMinCursor());
                    if (!set2.contains(C2188811AlT.LIZIZ(sbLIZ2))) {
                        YQ2(str, str2, userStory.getMinCursor(), true, userStory);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0210 A[PHI: r14
      0x0210: PHI (r14v1 com.ss.android.ugc.aweme.friends.model.MutualStruct) = 
      (r14v0 com.ss.android.ugc.aweme.friends.model.MutualStruct)
      (r14v7 com.ss.android.ugc.aweme.friends.model.MutualStruct)
      (r14v7 com.ss.android.ugc.aweme.friends.model.MutualStruct)
     binds: [B:88:0x020c, B:46:0x00cf, B:48:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0215 A[PHI: r14 r15
      0x0215: PHI (r14v2 com.ss.android.ugc.aweme.friends.model.MutualStruct) = 
      (r14v1 com.ss.android.ugc.aweme.friends.model.MutualStruct)
      (r14v6 com.ss.android.ugc.aweme.friends.model.MutualStruct)
      (r14v6 com.ss.android.ugc.aweme.friends.model.MutualStruct)
     binds: [B:91:0x0211, B:51:0x00e1, B:53:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r15v1 com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel) = 
      (r15v0 com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel)
      (r15v5 com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel)
      (r15v5 com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel)
     binds: [B:91:0x0211, B:51:0x00e1, B:53:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CQ2(java.lang.String r18, java.lang.String r19, boolean r20, com.ss.android.ugc.aweme.feed.model.story.UserStory r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel.CQ2(java.lang.String, java.lang.String, boolean, com.ss.android.ugc.aweme.feed.model.story.UserStory, java.lang.String):void");
    }

    public void YQ2(final String str, final String str2, final long j, final boolean z, UserStory userStory) {
        UserStory userStory2;
        final List<Aweme> stories;
        UserStory userStory3;
        HighlightSkylightUser highlightSkylightUser;
        final List<SkylightHighlightAwemeInfo> list;
        int minCursor;
        String string;
        int currentPosition;
        String string2;
        if (a0.LJJIIZI(str, "highlight", false)) {
            final Aweme aweme = (Aweme) ((LinkedHashMap) this.LLJILJIL).get(str);
            if (aweme != null && (userStory2 = aweme.getUserStory()) != null && (stories = userStory2.getStories()) != null && (userStory3 = aweme.getUserStory()) != null && (highlightSkylightUser = userStory3.getHighlightSkylightUser()) != null && (list = highlightSkylightUser.userHighlights) != null && !stories.isEmpty() && !list.isEmpty()) {
                C726970SfP.LIZ.getClass();
                UserStory userStory4 = aweme.getUserStory();
                if (userStory4 != null) {
                    minCursor = (int) userStory4.getMinCursor();
                } else {
                    minCursor = 0;
                }
                UserStory userStory5 = aweme.getUserStory();
                int maxCursor = userStory5 != null ? (int) userStory5.getMaxCursor() : list.size() - 1;
                ArrayList arrayList = new ArrayList();
                UserStory userStory6 = null;
                if (z) {
                    if (minCursor > 0) {
                        int i = 0;
                        do {
                            Long l = ((SkylightHighlightAwemeInfo) ListProtector.get(list, i)).awemeId;
                            if (l != null && (string2 = l.toString()) != null) {
                                arrayList.add(string2);
                            }
                            i++;
                        } while (i < minCursor);
                    }
                } else if (maxCursor < list.size() - 1) {
                    int size = list.size();
                    for (int i2 = maxCursor + 1; i2 < size; i2++) {
                        Long l2 = ((SkylightHighlightAwemeInfo) ListProtector.get(list, i2)).awemeId;
                        if (l2 != null && (string = l2.toString()) != null) {
                            arrayList.add(string);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    Aweme aweme2 = (Aweme) ((LinkedHashMap) this.LLJILJIL).get(str);
                    if (aweme2 != null) {
                        userStory6 = aweme2.getUserStory();
                    }
                    List<C630650OoR> listPQ2 = (List) ((LinkedHashMap) this.LLJILJILJ).get(str);
                    if (listPQ2 == null) {
                        listPQ2 = PQ2(str, str2);
                    }
                    C726970SfP.LIZ.getClass();
                    if (userStory6 != null) {
                        currentPosition = (int) userStory6.getCurrentPosition();
                    } else {
                        currentPosition = 0;
                    }
                    if (!z) {
                        int size2 = listPQ2.size();
                        while (currentPosition < size2) {
                            if (((C630650OoR) ListProtector.get(listPQ2, currentPosition)).LIZIZ == EnumC630660OoS.UNLOADING) {
                                ListProtector.set(listPQ2, currentPosition, new C630650OoR("", EnumC630660OoS.LOADING));
                            }
                            currentPosition++;
                        }
                    } else {
                        for (int i3 = 0; i3 < currentPosition; i3++) {
                            if (i3 < listPQ2.size() && ((C630650OoR) ListProtector.get(listPQ2, i3)).LIZIZ == EnumC630660OoS.UNLOADING) {
                                ListProtector.set(listPQ2, i3, new C630650OoR("", EnumC630660OoS.LOADING));
                            }
                        }
                    }
                    Set<String> set = this.LLJJI;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(j);
                    set.add(C2188811AlT.LIZIZ(sbLIZ));
                    C728370Shf.LIZ.getClass();
                    this.LLJIJIL.LIZ(StoryApi.LIZIZ.getSkylightHighlightsList(arrayList).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0SfO
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            int minCursor2;
                            int currentPosition2;
                            int size3;
                            long totalCount;
                            ArrayList arrayList2;
                            boolean zLJFF;
                            boolean hasMoreBefore;
                            UserStory userStory7;
                            boolean hasMoreAfter;
                            long j2;
                            long size4;
                            UserStory userStory8;
                            List<Long> list2;
                            List<Long> list3;
                            int size5;
                            SkylightHighlightAwemeInfo next;
                            String str3;
                            String str4;
                            boolean zBooleanValue;
                            Video video;
                            UrlModel cover;
                            List<String> urlList;
                            StoryHighlightInfo storyHighlightInfo;
                            StoryHighlightCollection storyHighlightCollection;
                            String string3;
                            C1C7U.LIZ("StoryFeedViewModel@f54f.loadHighlightsFeed$1");
                            SkylightHighlightsAwemeResponse skylightHighlightsAwemeResponse = (SkylightHighlightsAwemeResponse) obj;
                            Set<String> set2 = this.LL.LLJJI;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(str);
                            sbLIZ2.append(j);
                            set2.remove(C2188811AlT.LIZIZ(sbLIZ2));
                            if (this.LL.DQ2(j, str, z)) {
                                C726970SfP c726970SfP = C726970SfP.LIZ;
                                String str5 = str2;
                                Aweme aweme3 = aweme;
                                List<Aweme> list4 = stories;
                                List<SkylightHighlightAwemeInfo> list5 = list;
                                boolean z2 = z;
                                c726970SfP.getClass();
                                UserStory userStory9 = aweme3.getUserStory();
                                if (userStory9 != null) {
                                    minCursor2 = (int) userStory9.getMinCursor();
                                } else {
                                    minCursor2 = 0;
                                }
                                UserStory userStory10 = aweme3.getUserStory();
                                int maxCursor2 = userStory10 != null ? (int) userStory10.getMaxCursor() : list5.size() - 1;
                                List<Aweme> awemes = skylightHighlightsAwemeResponse.getAwemes();
                                if (awemes != null) {
                                    for (Aweme aweme4 : awemes) {
                                        Iterator<SkylightHighlightAwemeInfo> it2 = list5.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                next = it2.next();
                                                String aid = aweme4.getAid();
                                                Long l3 = next.awemeId;
                                                if (l3 != null) {
                                                    string3 = l3.toString();
                                                } else {
                                                    string3 = null;
                                                }
                                                if (Intrinsics.LJFF(aid, string3)) {
                                                    break;
                                                }
                                            } else {
                                                next = null;
                                                break;
                                            }
                                        }
                                        SkylightHighlightAwemeInfo skylightHighlightAwemeInfo = next;
                                        if (skylightHighlightAwemeInfo != null && (storyHighlightInfo = skylightHighlightAwemeInfo.storyHighlightInfo) != null && (storyHighlightCollection = storyHighlightInfo.containerCollectionInfo) != null) {
                                            str3 = storyHighlightCollection.collectionId;
                                        } else {
                                            str3 = null;
                                        }
                                        if (aweme4 != null && (video = aweme4.getVideo()) != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null) {
                                            str4 = (String) C13LP.LJJJLL(urlList);
                                        } else {
                                            str4 = null;
                                        }
                                        C712140Rwa.LIZ(str3, str4);
                                        if (skylightHighlightAwemeInfo != null) {
                                            Story story = aweme4.getStory();
                                            if (story != null) {
                                                Boolean boolIsViewed = skylightHighlightAwemeInfo.isViewed();
                                                if (boolIsViewed != null) {
                                                    zBooleanValue = boolIsViewed.booleanValue();
                                                } else {
                                                    zBooleanValue = false;
                                                }
                                                story.setViewed(zBooleanValue);
                                            }
                                            aweme4.storyHighlightInfo = skylightHighlightAwemeInfo.storyHighlightInfo;
                                        }
                                        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                                        if (iAwemeService != null) {
                                            iAwemeService.LLILLL(aweme4);
                                        }
                                    }
                                }
                                if (z2) {
                                    size3 = 0;
                                } else {
                                    UserStory userStory11 = aweme3.getUserStory();
                                    if (userStory11 != null) {
                                        currentPosition2 = (int) userStory11.getCurrentPosition();
                                    } else {
                                        currentPosition2 = 0;
                                    }
                                    size3 = currentPosition2 + list4.size();
                                }
                                UserStory userStory12 = aweme3.getUserStory();
                                if (userStory12 != null) {
                                    totalCount = userStory12.getTotalCount();
                                } else {
                                    totalCount = 0;
                                }
                                UserFilterStoryInfo userFilterStoryInfo = skylightHighlightsAwemeResponse.getUserFilterStoryInfo();
                                if (userFilterStoryInfo != null && (list3 = userFilterStoryInfo.filterStoryIds) != null && (size5 = list3.size()) > 0) {
                                    long j3 = size5;
                                    if (totalCount > j3) {
                                        totalCount -= j3;
                                    }
                                }
                                UserFilterStoryInfo userFilterStoryInfo2 = skylightHighlightsAwemeResponse.getUserFilterStoryInfo();
                                if (userFilterStoryInfo2 != null && (list2 = userFilterStoryInfo2.filterStoryIds) != null) {
                                    Iterator<Long> it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        long jLongValue = it3.next().longValue();
                                        C726970SfP.LIZ.getClass();
                                        ISocPubStatusRepoService iSocPubStatusRepoService = (ISocPubStatusRepoService) C726970SfP.LIZIZ.getValue();
                                        if (iSocPubStatusRepoService != null) {
                                            iSocPubStatusRepoService.LJII(str5, String.valueOf(jLongValue), null);
                                        }
                                    }
                                }
                                List<Aweme> awemes2 = skylightHighlightsAwemeResponse.getAwemes();
                                if (awemes2 != null) {
                                    arrayList2 = new ArrayList(awemes2);
                                } else {
                                    arrayList2 = new ArrayList();
                                }
                                ISocPubStatusRepoService iSocPubStatusRepoService2 = (ISocPubStatusRepoService) C726970SfP.LIZIZ.getValue();
                                if (iSocPubStatusRepoService2 != null) {
                                    zLJFF = Intrinsics.LJFF(iSocPubStatusRepoService2.LJIILL(str5), Boolean.TRUE);
                                } else {
                                    zLJFF = false;
                                }
                                long j4 = size3;
                                if (!z2 && (userStory8 = aweme3.getUserStory()) != null) {
                                    hasMoreBefore = userStory8.getHasMoreBefore();
                                } else {
                                    hasMoreBefore = false;
                                    if (z2 && (userStory7 = aweme3.getUserStory()) != null) {
                                        hasMoreAfter = userStory7.getHasMoreAfter();
                                    }
                                    j2 = 0;
                                    size4 = maxCursor2;
                                    UserStory userStory13 = new UserStory(arrayList2, totalCount, j4, zLJFF, j2, size4, hasMoreAfter, hasMoreBefore, 0L, false, null, null, false, null, 0L, new UserStoryCurrentInfo(null, null, 0), false, false, new UserStoryCurrentInfo(-1, null, 0), (int) j4, false, 0L, null, false);
                                    this.LL.CQ2(str, str2, z, userStory13, skylightHighlightsAwemeResponse.extra.logid);
                                    this.LL.aR2(userStory13);
                                }
                                hasMoreAfter = false;
                                if (z2) {
                                    j2 = 0;
                                    size4 = maxCursor2;
                                } else {
                                    j2 = minCursor2;
                                    size4 = list5.size() - 1;
                                }
                                UserStory userStory132 = new UserStory(arrayList2, totalCount, j4, zLJFF, j2, size4, hasMoreAfter, hasMoreBefore, 0L, false, null, null, false, null, 0L, new UserStoryCurrentInfo(null, null, 0), false, false, new UserStoryCurrentInfo(-1, null, 0), (int) j4, false, 0L, null, false);
                                this.LL.CQ2(str, str2, z, userStory132, skylightHighlightsAwemeResponse.extra.logid);
                                this.LL.aR2(userStory132);
                            }
                            C1C7U.LIZIZ("StoryFeedViewModel@f54f.loadHighlightsFeed$1");
                        }
                    }, new AfS4S2100100_9(this, str, j, str2, 0)));
                    return;
                }
                return;
            }
            return;
        }
        Set<String> set2 = this.LLJJI;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(j);
        set2.add(C2188811AlT.LIZIZ(sbLIZ2));
        fR2(str, str2, z);
        this.LLJIJIL.LIZ(bR2(str, str2, j, z, userStory, this.LLIZLLLIL).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0SfN
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("StoryFeedViewModel@f54f.load$1");
                UserStoryResponse userStoryResponse = (UserStoryResponse) obj;
                Set<String> set3 = this.LL.LLJJI;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append(j);
                set3.remove(C2188811AlT.LIZIZ(sbLIZ3));
                if (this.LL.DQ2(j, str, z)) {
                    this.LL.CQ2(str, str2, z, userStoryResponse.getUserStory(), userStoryResponse.extra.logid);
                    this.LL.aR2(userStoryResponse.getUserStory());
                    this.LL.ZQ2(userStoryResponse);
                }
                C1C7U.LIZIZ("StoryFeedViewModel@f54f.load$1");
            }
        }, new AfS4S2100100_9(this, str, j, str2, 1)));
    }

    public C11NZ<UserStoryResponse> bR2(String str, String str2, long j, boolean z, UserStory userStory, C2189821An6 c2189821An6) {
        Fragment fragment;
        int i;
        C0RJN c0rjnLIZIZ;
        LifecycleOwner lifecycleOwner = this.LLIZ;
        if (lifecycleOwner instanceof Fragment) {
            fragment = (Fragment) lifecycleOwner;
        } else {
            fragment = null;
        }
        if (!C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(fragment) && !Intrinsics.LJFF(this.LLIZLLLIL.getEventType(), "story_views_list_panel")) {
            if (fragment != null && (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment)) != null && C1389300mG0.LJIIIZ(c0rjnLIZIZ)) {
                i = 3;
            } else {
                i = 0;
            }
        } else {
            i = 2;
        }
        C728370Shf.LIZ.getClass();
        return StoryApi.LIZIZ.getUserStory(str2, j, z, 5, i, new ClientControlParams(Boolean.FALSE, null, null, null).toJsonString()).LJJIJIIJIL(new C09JN() { // from class: X.00P8
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("StoryApiHelper@d003.getUserStory$1");
                C1C7U.LIZIZ("StoryApiHelper@d003.getUserStory$1");
            }
        });
    }
}
