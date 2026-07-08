package com.ss.android.ugc.aweme.feed.assem.avatar;

import X.AbstractC1511510pR7;
import X.C01GW;
import X.C08JS;
import X.C0HHT;
import X.C0J5O;
import X.C0N33;
import X.C0SE1;
import X.C1019620cdk;
import X.C1143920fsE;
import X.C11JF;
import X.C13LE;
import X.C1511420pQy;
import X.C1602670ro9;
import X.C1602720roE;
import X.C1607480rvu;
import X.C1610670s13;
import X.C1610740s1A;
import X.C1610770s1D;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2174761A9i;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C328100Ctc;
import X.C452501pT;
import X.C486660J6q;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C823050WQl;
import X.InterfaceC1511740pRU;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS111S0100000_11;
import Y.AfS158S0200000_24;
import Y.AfS193S0100000_24;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.ab.LiveEntranceConfig;
import com.ss.android.ugc.aweme.experiment.LiveVideoHeadAnimDelaySettings;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarLiveAssem;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.ml.ab.SmartPrerenderExperiment;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedAvatarLiveAssem extends FeedBaseContentAssem<FeedAvatarLiveAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public ViewGroup LLJJJJ;
    public C1610670s13 LLJJJJJIL;
    public RelativeLayout LLJJJJLIIL;
    public C1610770s1D LLJJL;
    public C1610740s1A LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS264S0000000_24.get$arr$(114));
    public final C01GW LLJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS264S0000000_24.get$arr$(115));
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public boolean LLJLL;
    public int LLJLLIL;
    public C11JF LLJLLL;
    public View LLJZ;
    public boolean LLJZIJLIL;
    public SlimRoom LLL;
    public boolean LLLF;
    public EnterRoomConfig LLLFF;
    public final boolean LLLFFI;
    public final AwS603S0100000_24 LLLFZ;
    public final AfS193S0100000_24 LLLI;
    public final C01GW LLLII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedAvatarLiveAssem.class, "feedAvatarLiveVM", "getFeedAvatarLiveVM()Lcom/ss/android/ugc/aweme/feed/assem/avatar/FeedAvatarLiveVM;", 0);
        C13LE.LIZ.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FeedAvatarLiveAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedAvatarLiveVM.class);
        this.LLJLILLLLZIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1434), null, AFwS264S0000000_24.get$arr$(113));
        this.LLLFFI = C2174761A9i.LIZIZ();
        this.LLLFZ = new AwS603S0100000_24(this, 70);
        this.LLLI = new AfS193S0100000_24(this, 4);
        this.LLLII = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(139));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLLF = false;
    }

    public final boolean dp() {
        C2189821An6 c2189821An6;
        C724270Sb3 c724270Sb3 = this.LLJI;
        BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).baseFeedPageParams;
        return (baseFeedPageParams == null || (c2189821An6 = baseFeedPageParams.param) == null || c2189821An6.getCurrentProfileUserRoomId() <= 0) ? false : true;
    }

    public final void hp() {
        if (C1602670ro9.LIZ().fixStreamData) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            User userCp = cp((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null));
            C1602720roE c1602720roE = FeedAvatarAssemWrap.LLLFZ;
            C724270Sb3 c724270Sb32 = this.LLJI;
            Aweme aweme = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme();
            c1602720roE.getClass();
            boolean zLIZIZ = C1019620cdk.LIZIZ(3, aweme);
            C724270Sb3 c724270Sb33 = this.LLJI;
            boolean z = C1602720roE.LIZIZ(((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme(), userCp) || dp();
            this.LLL = null;
            lp(zLIZIZ, z);
        }
    }

    public static User cp(VideoItemParams videoItemParams) {
        String uid;
        long currentProfileUserRoomId;
        C2189821An6 c2189821An6;
        String str;
        C2189821An6 c2189821An62;
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        String uid2 = null;
        if (baseFeedPageParams != null && (c2189821An62 = baseFeedPageParams.param) != null) {
            uid = c2189821An62.getUid();
        } else {
            uid = null;
        }
        String str2 = "";
        if (uid == null) {
            uid = "";
        }
        if (C0SE1.LIZ()) {
            Aweme aweme = videoItemParams.getAweme();
            BaseFeedPageParams baseFeedPageParams2 = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams2 != null && (str = baseFeedPageParams2.eventType) != null) {
                str2 = str;
            }
            User userLIZ = C328100Ctc.LIZ(aweme, uid, str2);
            if (userLIZ != null) {
                uid2 = userLIZ.getUid();
            }
            if (Intrinsics.LJFF(uid2, AwemeExtKt.getAuthorUid(videoItemParams.getAweme()))) {
                return videoItemParams.getAweme().getAuthor();
            }
            if (userLIZ == null) {
                return userLIZ;
            }
            BaseFeedPageParams baseFeedPageParams3 = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams3 != null && (c2189821An6 = baseFeedPageParams3.param) != null) {
                currentProfileUserRoomId = c2189821An6.getCurrentProfileUserRoomId();
            } else {
                currentProfileUserRoomId = 0;
            }
            userLIZ.roomId = currentProfileUserRoomId;
            return userLIZ;
        }
        return videoItemParams.getAweme().getAuthor();
    }

    public static void ep(VideoItemParams videoItemParams) {
        Aweme aweme;
        String uid;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from_merge", videoItemParams.mEventType);
            c2344009Gk.LJIIIIZZ("enter_method", "video_head");
            c2344009Gk.LJIIIIZZ("action_type", "click");
            c2344009Gk.LJIIIIZZ("video_id", aweme.getAid());
            User author = aweme.getAuthor();
            Long lValueOf = null;
            if (author != null) {
                uid = author.getUid();
            } else {
                uid = null;
            }
            c2344009Gk.LJIIIIZZ("anchor_id", uid);
            User author2 = aweme.getAuthor();
            if (author2 != null) {
                lValueOf = Long.valueOf(author2.roomId);
            }
            c2344009Gk.LJ(lValueOf, "room_id");
            c2344009Gk.LJFF("request_id", aweme.getRequestId());
            C486660J6q.LJIIJ(c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ip(com.ss.android.ugc.aweme.profile.model.User r15) {
        /*
            Method dump skipped, instruction units count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarLiveAssem.ip(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public final void kp(VideoItemParams videoItemParams) {
        Aweme aweme;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            User author = aweme.getAuthor();
            if ((author != null && author.isLive()) || AwemeSaaSExtKt.isLive(aweme) || dp() || aweme.getStreamUrlModel() != null) {
                C1610740s1A c1610740s1A = this.LLJJLIIIJLLLLLLLZ;
                C1610670s13 c1610670s13 = null;
                if (c1610740s1A == null) {
                    c1610740s1A = null;
                }
                c1610740s1A.LIZ();
                this.LLJZIJLIL = true;
                C1610670s13 c1610670s132 = this.LLJJJJJIL;
                if (c1610670s132 != null) {
                    c1610670s13 = c1610670s132;
                }
                C1143920fsE c1143920fsE = c1610670s13.LLIZ;
                if (c1143920fsE != null) {
                    c1143920fsE.LJFF();
                }
            }
        }
    }

    public final void mp(final Function0<Unit> function0) {
        Object obj;
        int i = this.LLJLLIL;
        if (i == 3) {
            function0.invoke();
            return;
        }
        if (i != 2 && i != 1) {
            AbstractC1511510pR7 abstractC1511510pR7LIZIZ = C1511420pQy.LIZ().LIZIZ(SmartPrerenderExperiment.SCENE);
            C0N33 c0n33 = new C0N33();
            C724270Sb3 c724270Sb3 = this.LLJI;
            Boolean boolValueOf = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            c0n33.LJIIJ = ((VideoItemParams) obj).getAweme();
            c0n33.LIZJ = "enable_cache";
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("smartJudgeWhenActivateLiveAnim: smartService.enable() = ");
            if (abstractC1511510pR7LIZIZ != null) {
                boolValueOf = Boolean.valueOf(abstractC1511510pR7LIZIZ.enable());
            }
            sbLIZ.append(boolValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            if (abstractC1511510pR7LIZIZ != null && abstractC1511510pR7LIZIZ.enable()) {
                this.LLJLLIL = 1;
                abstractC1511510pR7LIZIZ.runAsync(c0n33, new InterfaceC1511740pRU() { // from class: X.0s0f
                    @Override // X.InterfaceC1511740pRU
                    public final void LIZ(C1512100pS4 c1512100pS4) {
                        Map<String, Float> map;
                        float fFloatValue;
                        Float f;
                        if (c1512100pS4 != null) {
                            map = c1512100pS4.LIZJ;
                        } else {
                            map = null;
                        }
                        float fThreshold = LiveVideoHeadAnimDelaySettings.INSTANCE.threshold();
                        if (map != null && (f = map.get("lt")) != null) {
                            fFloatValue = f.floatValue();
                        } else {
                            fFloatValue = 0.0f;
                        }
                        if (fFloatValue >= fThreshold) {
                            FeedAvatarLiveAssem feedAvatarLiveAssem = this.LIZ;
                            feedAvatarLiveAssem.LLJLLIL = 2;
                            C11JF c11jf = feedAvatarLiveAssem.LLJLLL;
                            if (c11jf != null) {
                                c11jf.dispose();
                            }
                            this.LIZ.LLJLLL = (C11JF) C11NZ.LJLJJLL(2L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS158S0200000_24(this.LIZ, function0, 1), new C09JN() { // from class: X.0s0g
                                @Override // X.C09JN
                                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                                    C1C7U.LIZ("FeedAvatarLiveAssem@f991.smartJudgeWhenActivateLiveAnim$1$onSmartResult$2");
                                    C1C7U.LIZIZ("FeedAvatarLiveAssem@f991.smartJudgeWhenActivateLiveAnim$1$onSmartResult$2");
                                }
                            });
                            return;
                        }
                        this.LIZ.LLJLLIL = 3;
                        C11NZ.LJJJJZ(1).LJL(C1701940uOG.LIZIZ()).LJJLL(new AfS158S0200000_24(this.LIZ, function0, 2), new C09JN() { // from class: X.0s0h
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                                C1C7U.LIZ("FeedAvatarLiveAssem@f991.smartJudgeWhenActivateLiveAnim$1$onSmartResult$4");
                                C1C7U.LIZIZ("FeedAvatarLiveAssem@f991.smartJudgeWhenActivateLiveAnim$1$onSmartResult$4");
                            }
                        });
                    }
                });
            } else {
                this.LLJLLIL = 3;
                function0.invoke();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0261  */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarLiveAssem.onViewCreated(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c6  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r23) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarLiveAssem.up(java.lang.Object):void");
    }

    public final void lp(boolean z, boolean z2) {
        Object obj;
        String str;
        ILiveOuterService iLiveOuterService;
        C0J5O c0j5oZ5;
        User author;
        if (!z && z2) {
            C823050WQl.LIZLLL().execute(new ARunnableS111S0100000_11(this, 202));
            if (((LiveEntranceConfig) C1607480rvu.LIZIZ.getValue()).enableVideoHead) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                Object obj2 = null;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                Aweme aweme = ((VideoItemParams) obj).getAweme();
                if (aweme != null && (author = aweme.getAuthor()) != null) {
                    str = author.roomData;
                } else {
                    str = null;
                }
                SlimRoom slimRoom = (SlimRoom) C08JS.LIZ(str, SlimRoom.class);
                if (slimRoom != null && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (c0j5oZ5 = iLiveOuterService.z5()) != null) {
                    Context context = getContext();
                    C724270Sb3 c724270Sb32 = this.LLJI;
                    if (c724270Sb32 != null) {
                        obj2 = c724270Sb32.LL;
                    }
                    c0j5oZ5.LJ(context, slimRoom, ((VideoItemParams) obj2).mEventType);
                }
            }
        }
    }
}
