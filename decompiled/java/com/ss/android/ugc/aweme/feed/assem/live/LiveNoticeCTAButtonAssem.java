package com.ss.android.ugc.aweme.feed.assem.live;

import X.C01GW;
import X.C09R3;
import X.C0HHT;
import X.C0LAB;
import X.C0PEM;
import X.C0QSJ;
import X.C11JF;
import X.C11NZ;
import X.C1389890mGx;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1DFH;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C706320RnC;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C948503nH;
import X.InterfaceC1146704e9;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC665370Q7z;
import Y.AAListenerS322S0100000_11;
import Y.AUListenerS261S0100000_11;
import Y.AfS172S0100000_3;
import Y.AfS180S0100000_11;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import webcast.api.room.NextLiveNoticeRegisterResponse;

/* JADX INFO: loaded from: classes12.dex */
public final class LiveNoticeCTAButtonAssem extends BaseCellSlotComponent<LiveNoticeCTAButtonAssem> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 232));
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS243S0000000_11.get$arr$(76));
    public final C01GW LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(77));
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final C01GW LLL;
    public C11JF LLLF;
    public ValueAnimator LLLFF;
    public int LLLFFI;
    public String LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public volatile boolean LLLIIII;
    public volatile ITriggerAssemHost LLLIIIIL;
    public InterfaceC665370Q7z LLLIIIL;
    public C0QSJ LLLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveNoticeCTAButtonAssem.class, "triggerHostAbility", "getTriggerHostAbility()Lcom/ss/android/ugc/aweme/feed/assem/live/ITriggerAssemHost;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(LiveNoticeCTAButtonAssem.class, "diggVM", "getDiggVM()Lcom/ss/android/ugc/aweme/feed/assem/digg/VideoDiggVM;", 0);
        c09r3.getClass();
        LLLIILIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public LiveNoticeCTAButtonAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoDiggVM.class);
        this.LLJZIJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 233), null, AFwS243S0000000_11.get$arr$(75));
        this.LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(78));
        this.LLLFFI = -1;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b_b;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{LiveNoticeCTABCope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LiveNoticeCTABCope.class);
        return arrayList;
    }

    public final void Bp() {
        C11JF c11jf = this.LLLF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLLF = null;
        ValueAnimator valueAnimator = this.LLLFF;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLLFF = null;
        this.LLLFFI = -1;
        this.LLLFZ = null;
        this.LLLI = false;
        this.LLLIIII = false;
        this.LLLII = false;
    }

    public final Map<String, String> Ep() {
        User author;
        C0LAB c0lab = new C0LAB();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        c0lab.LJ("anchor_id", (aweme == null || (author = aweme.getAuthor()) == null) ? null : author.getUid());
        c0lab.LIZ(this.LLLFFI, "follow_status");
        c0lab.LJ("show_page", "fyp_video");
        C724270Sb3 c724270Sb32 = this.LLJI;
        Aweme aweme2 = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme();
        c0lab.LJ("video_id", aweme2 != null ? aweme2.getAid() : null);
        c0lab.LJ("show_page", "fyp_video");
        c0lab.LJ("button_type", "notify_sfv_relation");
        c0lab.LJ("show_reason", this.LLLFZ);
        return c0lab.LIZ;
    }

    public final LiveCTAButtonAbility Fp() {
        return (LiveCTAButtonAbility) this.LLJLLIL.getValue();
    }

    public final void Jp() {
        ValueAnimator valueAnimator = this.LLLFF;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLLFF = null;
        View viewFindViewById = LJJIJL().findViewById(R.id.mw1);
        if (viewFindViewById != null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(viewFindViewById.getHeight(), 0);
            this.LLLFF = valueAnimatorOfInt;
            if (valueAnimatorOfInt != null) {
                valueAnimatorOfInt.setDuration(300L);
            }
            ValueAnimator valueAnimator2 = this.LLLFF;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(new AUListenerS261S0100000_11(this, 3));
            }
            ValueAnimator valueAnimator3 = this.LLLFF;
            if (valueAnimator3 != null) {
                valueAnimator3.addListener(new AAListenerS322S0100000_11(this, 10));
            }
            ValueAnimator valueAnimator4 = this.LLLFF;
            if (valueAnimator4 != null) {
                valueAnimator4.start();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void onDestroyView() {
        Bp();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        Bp();
    }

    public final void Gp(String str) {
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        String aid;
        long j;
        User author;
        String uid;
        Object obj13;
        if (this.LLLFZ == null) {
            this.LLLFZ = str;
        }
        LiveCTAButtonAbility liveCTAButtonAbilityFp = Fp();
        Object obj14 = null;
        if (liveCTAButtonAbilityFp != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj13 = c724270Sb3.LL;
            } else {
                obj13 = null;
            }
            if (!liveCTAButtonAbilityFp.CH(((VideoItemParams) obj13).getAweme())) {
                return;
            }
        }
        LiveCTAButtonAbility liveCTAButtonAbilityFp2 = Fp();
        if ((liveCTAButtonAbilityFp2 != null && !liveCTAButtonAbilityFp2.IO1()) || this.LLLIIII) {
            return;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj = c724270Sb32.LL;
        } else {
            obj = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoItemParams != null && videoItemParams.getAweme() != null) {
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj2 = c724270Sb33.LL;
            } else {
                obj2 = null;
            }
            Aweme aweme = ((VideoItemParams) obj2).getAweme();
            if ((aweme == null || !AwemeBizExtKt.getHasDisplayLiveNoticeButton(aweme)) && (i = this.LLLFFI) != 1 && i != 2) {
                C724270Sb3 c724270Sb34 = this.LLJI;
                if (c724270Sb34 != null) {
                    obj3 = c724270Sb34.LL;
                } else {
                    obj3 = null;
                }
                if (AwemeExtKt.getFollowStatus(((VideoItemParams) obj3).getAweme()) != 1) {
                    C724270Sb3 c724270Sb35 = this.LLJI;
                    if (c724270Sb35 != null) {
                        obj4 = c724270Sb35.LL;
                    } else {
                        obj4 = null;
                    }
                    if (AwemeExtKt.getFollowStatus(((VideoItemParams) obj4).getAweme()) != 2) {
                        C724270Sb3 c724270Sb36 = this.LLJI;
                        if (c724270Sb36 != null) {
                            obj5 = c724270Sb36.LL;
                        } else {
                            obj5 = null;
                        }
                        if (!AwemeSaaSExtKt.isLive(((VideoItemParams) obj5).getAweme())) {
                            C724270Sb3 c724270Sb37 = this.LLJI;
                            if (c724270Sb37 != null) {
                                obj6 = c724270Sb37.LL;
                            } else {
                                obj6 = null;
                            }
                            User author2 = ((VideoItemParams) obj6).getAweme().getAuthor();
                            if (author2 != null && author2.isLive()) {
                                return;
                            }
                            C724270Sb3 c724270Sb38 = this.LLJI;
                            if (c724270Sb38 != null) {
                                obj7 = c724270Sb38.LL;
                            } else {
                                obj7 = null;
                            }
                            if (((VideoItemParams) obj7).getAweme().isAd()) {
                                return;
                            }
                            C724270Sb3 c724270Sb39 = this.LLJI;
                            if (c724270Sb39 != null) {
                                obj8 = c724270Sb39.LL;
                            } else {
                                obj8 = null;
                            }
                            Aweme aweme2 = ((VideoItemParams) obj8).getAweme();
                            if (aweme2 != null && AwemeBizExtKt.getHasDisplayLiveNoticeButton(aweme2)) {
                                return;
                            }
                            IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
                            C724270Sb3 c724270Sb310 = this.LLJI;
                            if (c724270Sb310 != null) {
                                obj9 = c724270Sb310.LL;
                            } else {
                                obj9 = null;
                            }
                            if (iECommerceAnchorService.LJJJJZ(((VideoItemParams) obj9).getAweme())) {
                                return;
                            }
                            C724270Sb3 c724270Sb311 = this.LLJI;
                            if (c724270Sb311 != null) {
                                obj10 = c724270Sb311.LL;
                            } else {
                                obj10 = null;
                            }
                            List<AnchorCommonStruct> anchors = ((VideoItemParams) obj10).getAweme().getAnchors();
                            if (anchors != null) {
                                Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                                while (it2.hasNext()) {
                                    if (it2.next().getType() == 41) {
                                        return;
                                    }
                                }
                            }
                            C724270Sb3 c724270Sb312 = this.LLJI;
                            if (c724270Sb312 != null) {
                                obj11 = c724270Sb312.LL;
                            } else {
                                obj11 = null;
                            }
                            List<InteractStickerStruct> interactStickerStructs = ((VideoItemParams) obj11).getAweme().getInteractStickerStructs();
                            if (interactStickerStructs != null) {
                                Iterator<InteractStickerStruct> it3 = interactStickerStructs.iterator();
                                while (it3.hasNext()) {
                                    if (it3.next().getType() == 25) {
                                        return;
                                    }
                                }
                            }
                            LiveCTAButtonAbility liveCTAButtonAbilityFp3 = Fp();
                            if (liveCTAButtonAbilityFp3 != null && liveCTAButtonAbilityFp3.Rj0()) {
                                LiveCTAButtonAbility liveCTAButtonAbilityFp4 = Fp();
                                if (liveCTAButtonAbilityFp4 != null && liveCTAButtonAbilityFp4.GF1() >= 4) {
                                    return;
                                }
                                Set<String> set = LiveNoticeCTAButtonTrigger.LLLFZ;
                                C724270Sb3 c724270Sb313 = this.LLJI;
                                if (c724270Sb313 != null) {
                                    obj12 = c724270Sb313.LL;
                                } else {
                                    obj12 = null;
                                }
                                Aweme aweme3 = ((VideoItemParams) obj12).getAweme();
                                if (aweme3 != null) {
                                    aid = aweme3.getAid();
                                } else {
                                    aid = null;
                                }
                                if (C13LP.LJJJJ(aid, set)) {
                                    return;
                                }
                                C724270Sb3 c724270Sb314 = this.LLJI;
                                if (c724270Sb314 != null) {
                                    obj14 = c724270Sb314.LL;
                                }
                                Aweme aweme4 = ((VideoItemParams) obj14).getAweme();
                                if (aweme4 != null && (author = aweme4.getAuthor()) != null && (uid = author.getUid()) != null) {
                                    j = CastLongProtector.parseLong(uid);
                                } else {
                                    j = -1;
                                }
                                Ip(true, j, new AwS590S0100000_11(this, 93));
                            }
                        }
                    }
                }
            }
        }
    }

    public final void Qp(int i) {
        View contentView = getContentView();
        if (contentView != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(contentView);
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        LiveCTAButtonAbility liveCTAButtonAbilityFp = Fp();
        if (liveCTAButtonAbilityFp == null || liveCTAButtonAbilityFp.GF1() < 4) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0NlA
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLILZ;
                }
            }, null, AFwS294S0000000_11.get$arr$(311), 6);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(this, LLLIILIL[1]), new C2217381BqS() { // from class: X.0RnA
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C730490Sl5) obj).LLILZLL;
                }
            }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(312), 4);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Ntv
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1ELP) obj).LLJILJILJ;
                }
            }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(313), 4);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0RGy
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJJI;
                }
            }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(314), 4);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C948503nH.LJ(this, C2107308Nj.LIZ, new C706320RnC(this, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r5 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r5
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            if (r0 == 0) goto L14
            int r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getFollowStatus(r0)
        Lc:
            r4.LLLFFI = r0
            com.ss.android.ugc.aweme.feed.assem.live.ITriggerAssemHost r2 = r4.LLLIIIIL
            if (r2 != 0) goto L4d
            monitor-enter(r4)
            goto L16
        L14:
            r0 = -1
            goto Lc
        L16:
            com.ss.android.ugc.aweme.feed.assem.live.ITriggerAssemHost r2 = r4.LLLIIIIL     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L46
            X.0QSJ r1 = r4.LLLIIL     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L3a
            X.0Q7z r3 = r4.LLLIIIL     // Catch: java.lang.Throwable -> L48
            if (r3 != 0) goto L28
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L48
            r4.LLLIIIL = r3     // Catch: java.lang.Throwable -> L48
        L28:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L48
            java.lang.Class<com.ss.android.ugc.aweme.feed.assem.live.LiveNoticeCTABCope> r1 = com.ss.android.ugc.aweme.feed.assem.live.LiveNoticeCTABCope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L48
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L48
            r4.LLLIIL = r1     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L3a
            r2 = 0
            goto L42
        L3a:
            java.lang.Class<com.ss.android.ugc.aweme.feed.assem.live.ITriggerAssemHost> r0 = com.ss.android.ugc.aweme.feed.assem.live.ITriggerAssemHost.class
            java.lang.Object r2 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L48
            com.ss.android.ugc.aweme.feed.assem.live.ITriggerAssemHost r2 = (com.ss.android.ugc.aweme.feed.assem.live.ITriggerAssemHost) r2     // Catch: java.lang.Throwable -> L48
        L42:
            r4.LLLIIIIL = r2     // Catch: java.lang.Throwable -> L48
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L48
            goto L4b
        L46:
            monitor-exit(r4)
            goto L4d
        L48:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L4b:
            if (r2 == 0) goto L57
        L4d:
            kotlin.jvm.internal.AwS590S0100000_11 r1 = new kotlin.jvm.internal.AwS590S0100000_11
            r0 = 614(0x266, float:8.6E-43)
            r1.<init>(r4, r0)
            r2.LLLILZ(r1)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.live.LiveNoticeCTAButtonAssem.up(java.lang.Object):void");
    }

    public final void Ip(boolean z, long j, Function1 function1) {
        InterfaceC420801kM interfaceC420801kMLJJLL;
        this.LLLIIII = true;
        C11JF c11jf = this.LLLF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11NZ<NextLiveNoticeRegisterResponse> c11nzRegisterNextLiveNotice = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().registerNextLiveNotice(z, j, false);
        if (c11nzRegisterNextLiveNotice != null) {
            interfaceC420801kMLJJLL = c11nzRegisterNextLiveNotice.LJJLL(new AfS172S0100000_3(function1, 115), new AfS180S0100000_11(this, 19));
        } else {
            interfaceC420801kMLJJLL = null;
        }
        this.LLLF = (C11JF) interfaceC420801kMLJJLL;
    }
}
