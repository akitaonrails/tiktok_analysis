package com.ss.android.ugc.aweme.feed.adapter.widget.guide;

import X.C01GW;
import X.C098J;
import X.C09JN;
import X.C0C64;
import X.C0JF0;
import X.C1019100ccu;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C1287300jbU;
import X.C1386360mBG;
import X.C13LP;
import X.C1701940uOG;
import X.C1AAP;
import X.C1AAR;
import X.C1ACA;
import X.C20339214iE;
import X.C20339314iF;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C452501pT;
import X.C487710JAr;
import X.C500260Jjc;
import X.InterfaceC420801kM;
import X.InterfaceC781210Ukh;
import Y.AfS202S0100000_33;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveFollowingPagePreviewGuideExp;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ab.PreviewGuideData;
import com.ss.android.ugc.aweme.experiment.LiveFunderPreviewExp;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MaskLayer;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.FrequencyControlData;

/* JADX INFO: loaded from: classes34.dex */
public final class LivePreviewGuideEnterVM extends LiveWidgetViewModel {
    public final C01GW LL = C452501pT.LIZIZ(new C1AAP(this));
    public final MutableLiveData<Boolean> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZIL = new MutableLiveData<>();
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C20339214iE());
    public int LLIZ;
    public int LLIZLLLIL;
    public C11JF LLJ;
    public InterfaceC420801kM LLJI;
    public C11JF LLJIJIL;
    public InterfaceC420801kM LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;

    static {
        new Object() { // from class: X.1AAT
        };
    }

    public final void DQ2() {
        C11JF c11jf = this.LLJ;
        if (c11jf != null && !c11jf.isDisposed()) {
            c11jf.dispose();
            this.LLJ = null;
            this.LLJILJILJ = false;
        }
        InterfaceC420801kM interfaceC420801kM = this.LLJI;
        if (interfaceC420801kM == null || !(!interfaceC420801kM.isDisposed())) {
            return;
        }
        interfaceC420801kM.dispose();
    }

    public final void EQ2() {
        C11JF c11jf = this.LLJIJIL;
        if (c11jf != null && (!c11jf.isDisposed())) {
            c11jf.dispose();
            CQ2("exit");
        }
        this.LLJIJIL = null;
        InterfaceC420801kM interfaceC420801kM = this.LLJILJIL;
        if (interfaceC420801kM != null && (!interfaceC420801kM.isDisposed())) {
            interfaceC420801kM.dispose();
        }
        this.LLJILJIL = null;
    }

    public final void FQ2() {
        final long j;
        long value;
        long j2;
        if (this.LLJILJILJ || this.LLJILLL) {
            return;
        }
        this.LLJILJILJ = true;
        EQ2();
        C1ACA c1acaWQ2 = wQ2();
        if (c1acaWQ2 == null || !TextUtils.equals(c1acaWQ2.LIZLLL, "homepage_live") || C0C64.LJIILLIIL().LJIIIZ(31744, "live_preview_page_enable_auto_entering_guide", true, false)) {
            C1ACA c1acaWQ22 = wQ2();
            if (c1acaWQ22 != null && TextUtils.equals(c1acaWQ22.LIZLLL, "homepage_hot")) {
                C1AAR.LIZ.getClass();
                if (((PreviewGuideData) C1AAR.LIZJ.getValue()).style <= 0) {
                    return;
                }
            }
            C1ACA c1acaWQ23 = wQ2();
            if (c1acaWQ23 == null || !TextUtils.equals(c1acaWQ23.LIZLLL, "homepage_follow") || LiveFollowingPagePreviewGuideExp.INSTANCE.getValue() > 0) {
                C1ACA c1acaWQ24 = wQ2();
                if (c1acaWQ24 == null || !TextUtils.equals(c1acaWQ24.LIZLLL, "homepage_live")) {
                    C1ACA c1acaWQ25 = wQ2();
                    if (c1acaWQ25 == null || !TextUtils.equals(c1acaWQ25.LIZLLL, "homepage_follow")) {
                        C1AAR.LIZ.getClass();
                        j = ((PreviewGuideData) C1AAR.LIZJ.getValue()).guideShowTime;
                        this.LLJ = (C11JF) C11NZ.LJLJJLL(j, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.1AAO
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                int i;
                                C1C7U.LIZ("LivePreviewGuideEnterVM@a57e.startCountDownGuideTime$1");
                                this.LL.zQ2(j, "join_live_show");
                                final LivePreviewGuideEnterVM livePreviewGuideEnterVM = this.LL;
                                C1ACA c1acaWQ26 = livePreviewGuideEnterVM.wQ2();
                                if (c1acaWQ26 != null) {
                                    int userType = 0;
                                    if (livePreviewGuideEnterVM.vQ2(false)) {
                                        livePreviewGuideEnterVM.AQ2("ad");
                                    } else {
                                        if (C1ABT.LJIIJJI(livePreviewGuideEnterVM.wQ2())) {
                                            userType = LiveFunderPreviewExp.INSTANCE.getUserType();
                                        }
                                        final LiveRoomStruct liveRoomStruct = c1acaWQ26.LIZJ;
                                        if (liveRoomStruct != null) {
                                            InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
                                            if (TextUtils.equals(c1acaWQ26.LIZLLL, "homepage_live")) {
                                                i = 3;
                                            } else if (TextUtils.equals(c1acaWQ26.LIZLLL, "homepage_follow")) {
                                                i = 6;
                                            } else {
                                                i = 1;
                                            }
                                            livePreviewGuideEnterVM.LLJI = interfaceC20673515v3K4.LLII(i, liveRoomStruct.id, userType, new C08MM() { // from class: X.1AAN
                                                @Override // X.C08MM
                                                public final void LIZ() {
                                                }

                                                @Override // X.C08MM
                                                public final void onFailed() {
                                                }

                                                @Override // X.C08MM
                                                public final void LIZIZ(FrequencyControlData frequencyControlData) {
                                                    if (!livePreviewGuideEnterVM.vQ2(false)) {
                                                        String str = "negativeFeedbackTimes >= 6";
                                                        if (frequencyControlData.result) {
                                                            C1ACA c1acaWQ27 = livePreviewGuideEnterVM.wQ2();
                                                            if (c1acaWQ27 != null && TextUtils.equals(c1acaWQ27.LIZLLL, "homepage_live")) {
                                                                livePreviewGuideEnterVM.LLILZ.setValue(Boolean.TRUE);
                                                            } else {
                                                                C1ACA c1acaWQ28 = livePreviewGuideEnterVM.wQ2();
                                                                if (c1acaWQ28 != null && TextUtils.equals(c1acaWQ28.LIZLLL, "homepage_follow") && frequencyControlData.negativeFeedbackTimes >= 6) {
                                                                    ((Keva) livePreviewGuideEnterVM.LLILZLL.getValue()).storeInt(LivePreviewGuideEnterVM.xQ2(), 1);
                                                                    if (!TextUtils.isEmpty(frequencyControlData.avoidReason)) {
                                                                        str = frequencyControlData.avoidReason;
                                                                    }
                                                                    livePreviewGuideEnterVM.AQ2(str);
                                                                } else {
                                                                    MutableLiveData<Boolean> mutableLiveData = livePreviewGuideEnterVM.LLILLL;
                                                                    Boolean bool = Boolean.TRUE;
                                                                    mutableLiveData.setValue(bool);
                                                                    livePreviewGuideEnterVM.LLILLJJLI.setValue(bool);
                                                                }
                                                            }
                                                            C098J<Long, Long> c098j = C1287300jbU.LIZ;
                                                            long j3 = liveRoomStruct.id;
                                                            C1287300jbU.LIZ.put(Long.valueOf(j3), Long.valueOf(j3));
                                                            livePreviewGuideEnterVM.LLJILLL = true;
                                                            return;
                                                        }
                                                        C1ACA c1acaWQ29 = livePreviewGuideEnterVM.wQ2();
                                                        if (c1acaWQ29 != null && TextUtils.equals(c1acaWQ29.LIZLLL, "homepage_follow") && frequencyControlData.negativeFeedbackTimes >= 6) {
                                                            ((Keva) livePreviewGuideEnterVM.LLILZLL.getValue()).storeInt(LivePreviewGuideEnterVM.xQ2(), 1);
                                                            if (!TextUtils.isEmpty(frequencyControlData.avoidReason)) {
                                                                str = frequencyControlData.avoidReason;
                                                            }
                                                            livePreviewGuideEnterVM.AQ2(str);
                                                            return;
                                                        }
                                                        if (TextUtils.isEmpty(frequencyControlData.avoidReason)) {
                                                            return;
                                                        }
                                                        livePreviewGuideEnterVM.AQ2(frequencyControlData.avoidReason);
                                                        return;
                                                    }
                                                    livePreviewGuideEnterVM.AQ2("ad");
                                                }
                                            });
                                        }
                                    }
                                }
                                C11JF c11jf = this.LL.LLJ;
                                if (c11jf != null) {
                                    c11jf.dispose();
                                }
                                this.LL.LLJ = null;
                                C1C7U.LIZIZ("LivePreviewGuideEnterVM@a57e.startCountDownGuideTime$1");
                            }
                        }, C20339314iF.LL);
                    }
                    value = LiveFollowingPagePreviewGuideExp.INSTANCE.getValue();
                    j2 = 1000;
                } else {
                    value = C0C64.LJIILLIIL().LJIJJLI(31744, 10L, "live_preview_page_auto_entering_request_delay", true);
                    j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                }
                j = value * j2;
                this.LLJ = (C11JF) C11NZ.LJLJJLL(j, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.1AAO
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        int i;
                        C1C7U.LIZ("LivePreviewGuideEnterVM@a57e.startCountDownGuideTime$1");
                        this.LL.zQ2(j, "join_live_show");
                        final LivePreviewGuideEnterVM livePreviewGuideEnterVM = this.LL;
                        C1ACA c1acaWQ26 = livePreviewGuideEnterVM.wQ2();
                        if (c1acaWQ26 != null) {
                            int userType = 0;
                            if (livePreviewGuideEnterVM.vQ2(false)) {
                                livePreviewGuideEnterVM.AQ2("ad");
                            } else {
                                if (C1ABT.LJIIJJI(livePreviewGuideEnterVM.wQ2())) {
                                    userType = LiveFunderPreviewExp.INSTANCE.getUserType();
                                }
                                final LiveRoomStruct liveRoomStruct = c1acaWQ26.LIZJ;
                                if (liveRoomStruct != null) {
                                    InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
                                    if (TextUtils.equals(c1acaWQ26.LIZLLL, "homepage_live")) {
                                        i = 3;
                                    } else if (TextUtils.equals(c1acaWQ26.LIZLLL, "homepage_follow")) {
                                        i = 6;
                                    } else {
                                        i = 1;
                                    }
                                    livePreviewGuideEnterVM.LLJI = interfaceC20673515v3K4.LLII(i, liveRoomStruct.id, userType, new C08MM() { // from class: X.1AAN
                                        @Override // X.C08MM
                                        public final void LIZ() {
                                        }

                                        @Override // X.C08MM
                                        public final void onFailed() {
                                        }

                                        @Override // X.C08MM
                                        public final void LIZIZ(FrequencyControlData frequencyControlData) {
                                            if (!livePreviewGuideEnterVM.vQ2(false)) {
                                                String str = "negativeFeedbackTimes >= 6";
                                                if (frequencyControlData.result) {
                                                    C1ACA c1acaWQ27 = livePreviewGuideEnterVM.wQ2();
                                                    if (c1acaWQ27 != null && TextUtils.equals(c1acaWQ27.LIZLLL, "homepage_live")) {
                                                        livePreviewGuideEnterVM.LLILZ.setValue(Boolean.TRUE);
                                                    } else {
                                                        C1ACA c1acaWQ28 = livePreviewGuideEnterVM.wQ2();
                                                        if (c1acaWQ28 != null && TextUtils.equals(c1acaWQ28.LIZLLL, "homepage_follow") && frequencyControlData.negativeFeedbackTimes >= 6) {
                                                            ((Keva) livePreviewGuideEnterVM.LLILZLL.getValue()).storeInt(LivePreviewGuideEnterVM.xQ2(), 1);
                                                            if (!TextUtils.isEmpty(frequencyControlData.avoidReason)) {
                                                                str = frequencyControlData.avoidReason;
                                                            }
                                                            livePreviewGuideEnterVM.AQ2(str);
                                                        } else {
                                                            MutableLiveData<Boolean> mutableLiveData = livePreviewGuideEnterVM.LLILLL;
                                                            Boolean bool = Boolean.TRUE;
                                                            mutableLiveData.setValue(bool);
                                                            livePreviewGuideEnterVM.LLILLJJLI.setValue(bool);
                                                        }
                                                    }
                                                    C098J<Long, Long> c098j = C1287300jbU.LIZ;
                                                    long j3 = liveRoomStruct.id;
                                                    C1287300jbU.LIZ.put(Long.valueOf(j3), Long.valueOf(j3));
                                                    livePreviewGuideEnterVM.LLJILLL = true;
                                                    return;
                                                }
                                                C1ACA c1acaWQ29 = livePreviewGuideEnterVM.wQ2();
                                                if (c1acaWQ29 != null && TextUtils.equals(c1acaWQ29.LIZLLL, "homepage_follow") && frequencyControlData.negativeFeedbackTimes >= 6) {
                                                    ((Keva) livePreviewGuideEnterVM.LLILZLL.getValue()).storeInt(LivePreviewGuideEnterVM.xQ2(), 1);
                                                    if (!TextUtils.isEmpty(frequencyControlData.avoidReason)) {
                                                        str = frequencyControlData.avoidReason;
                                                    }
                                                    livePreviewGuideEnterVM.AQ2(str);
                                                    return;
                                                }
                                                if (TextUtils.isEmpty(frequencyControlData.avoidReason)) {
                                                    return;
                                                }
                                                livePreviewGuideEnterVM.AQ2(frequencyControlData.avoidReason);
                                                return;
                                            }
                                            livePreviewGuideEnterVM.AQ2("ad");
                                        }
                                    });
                                }
                            }
                        }
                        C11JF c11jf = this.LL.LLJ;
                        if (c11jf != null) {
                            c11jf.dispose();
                        }
                        this.LL.LLJ = null;
                        C1C7U.LIZIZ("LivePreviewGuideEnterVM@a57e.startCountDownGuideTime$1");
                    }
                }, C20339314iF.LL);
            }
        }
    }

    public final void GQ2() {
        if (this.LLJIJIL != null) {
            return;
        }
        this.LLJIJIL = (C11JF) C11NZ.LJLJJLL(3000L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new AfS202S0100000_33(this, 11), new C09JN() { // from class: X.14iD
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LivePreviewGuideEnterVM@a57e.startEnterRoomFeedbackTimer$2");
                C1C7U.LIZIZ("LivePreviewGuideEnterVM@a57e.startEnterRoomFeedbackTimer$2");
            }
        }, new InterfaceC781210Ukh() { // from class: X.1AAQ
            @Override // X.InterfaceC781210Ukh
            public final void run() {
            }
        });
    }

    public final void vz2() {
        C11JF c11jf = this.LLJ;
        if (c11jf != null && (!c11jf.isDisposed())) {
            c11jf.dispose();
        }
        this.LLJ = null;
        InterfaceC420801kM interfaceC420801kM = this.LLJI;
        if (interfaceC420801kM != null && (!interfaceC420801kM.isDisposed())) {
            interfaceC420801kM.dispose();
        }
        this.LLJI = null;
        C11JF c11jf2 = this.LLJIJIL;
        if (c11jf2 != null && (!c11jf2.isDisposed())) {
            c11jf2.dispose();
        }
        this.LLJIJIL = null;
        InterfaceC420801kM interfaceC420801kM2 = this.LLJILJIL;
        if (interfaceC420801kM2 != null && (!interfaceC420801kM2.isDisposed())) {
            interfaceC420801kM2.dispose();
        }
        this.LLJILJIL = null;
        this.LLJILJILJ = false;
        this.LLJILLL = false;
        this.LLJJ = false;
        this.LLJJI = false;
    }

    public final C1ACA wQ2() {
        return (C1ACA) this.LL.getValue();
    }

    public static String xQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
        sbLIZ.append("following_preview_permanently_offline_guide");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void yQ2() {
        C1ACA c1acaWQ2;
        String str;
        FeedRoomTagList feedRoomTagList;
        List<FeedRoomTag> list;
        FeedRoomTag feedRoomTag;
        User user;
        C1ACA c1acaWQ22 = wQ2();
        if (C500260Jjc.LJJIJIIJIL(c1acaWQ22 != null ? Boolean.valueOf(TextUtils.equals(c1acaWQ22.LIZLLL, "homepage_live")) : null) || (c1acaWQ2 = wQ2()) == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from_merge", c1acaWQ2.LIZLLL);
        c2344009Gk.LJIIIIZZ("action_type", "click");
        LiveRoomStruct liveRoomStruct = c1acaWQ2.LIZJ;
        c2344009Gk.LJIIIIZZ("anchor_id", (liveRoomStruct == null || (user = liveRoomStruct.owner) == null) ? null : user.getUid());
        LiveRoomStruct liveRoomStruct2 = c1acaWQ2.LIZJ;
        c2344009Gk.LJ(liveRoomStruct2 != null ? Long.valueOf(liveRoomStruct2.id) : null, "room_id");
        c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
        C487710JAr c487710JAr = C487710JAr.LIZ;
        LiveRoomStruct liveRoomStruct3 = c1acaWQ2.LIZJ;
        c487710JAr.getClass();
        c2344009Gk.LIZJ(C487710JAr.LIZ(liveRoomStruct3), "follow_status");
        c2344009Gk.LIZJ(c1acaWQ2.LJIIIIZZ, "room_position");
        LiveRoomStruct liveRoomStruct4 = c1acaWQ2.LIZJ;
        if (liveRoomStruct4 == null || (feedRoomTagList = liveRoomStruct4.feedRoomTagList) == null || (list = feedRoomTagList.subTags) == null || (feedRoomTag = (FeedRoomTag) C13LP.LJJJLL(list)) == null || (str = feedRoomTag.content) == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("label", str);
        C20684815ws.LJIILLIIL("livesdk_auto_guidance_page_show", c2344009Gk.LIZ);
    }

    public final void AQ2(String str) {
        Boolean boolValueOf;
        String uid;
        User user;
        String uid2;
        String str2;
        FeedRoomTagList feedRoomTagList;
        List<FeedRoomTag> list;
        FeedRoomTag feedRoomTag;
        User user2;
        C1ACA c1acaWQ2 = wQ2();
        if (c1acaWQ2 != null) {
            C1ACA c1acaWQ22 = wQ2();
            Long lValueOf = null;
            if (c1acaWQ22 != null) {
                boolValueOf = Boolean.valueOf(TextUtils.equals(c1acaWQ22.LIZLLL, "homepage_live"));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from_merge", c1acaWQ2.LIZLLL);
                c2344009Gk.LJIIIIZZ("action_type", "click");
                LiveRoomStruct liveRoomStruct = c1acaWQ2.LIZJ;
                if (liveRoomStruct != null && (user2 = liveRoomStruct.owner) != null) {
                    uid2 = user2.getUid();
                } else {
                    uid2 = null;
                }
                c2344009Gk.LJIIIIZZ("anchor_id", uid2);
                LiveRoomStruct liveRoomStruct2 = c1acaWQ2.LIZJ;
                if (liveRoomStruct2 != null) {
                    lValueOf = Long.valueOf(liveRoomStruct2.id);
                }
                c2344009Gk.LJ(lValueOf, "room_id");
                c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
                C487710JAr c487710JAr = C487710JAr.LIZ;
                LiveRoomStruct liveRoomStruct3 = c1acaWQ2.LIZJ;
                c487710JAr.getClass();
                c2344009Gk.LIZJ(C487710JAr.LIZ(liveRoomStruct3), "follow_status");
                c2344009Gk.LIZJ(c1acaWQ2.LJIIIIZZ, "room_position");
                LiveRoomStruct liveRoomStruct4 = c1acaWQ2.LIZJ;
                if (liveRoomStruct4 == null || (feedRoomTagList = liveRoomStruct4.feedRoomTagList) == null || (list = feedRoomTagList.subTags) == null || (feedRoomTag = (FeedRoomTag) C13LP.LJJJLL(list)) == null || (str2 = feedRoomTag.content) == null) {
                    str2 = "";
                }
                c2344009Gk.LJIIIIZZ("label", str2);
                c2344009Gk.LJIIIIZZ("avoid_reason", str);
                C20684815ws.LJIILLIIL("livesdk_auto_guidance_page_avoid", c2344009Gk.LIZ);
                return;
            }
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from_merge", c1acaWQ2.LIZLLL);
            c2344009Gk2.LJIIIIZZ("action_type", "click");
            c2344009Gk2.LJIIIIZZ("enter_method", "live_cell");
            LiveRoomStruct liveRoomStruct5 = c1acaWQ2.LIZJ;
            if (liveRoomStruct5 != null && (user = liveRoomStruct5.owner) != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            c2344009Gk2.LJIIIIZZ("anchor_id", uid);
            LiveRoomStruct liveRoomStruct6 = c1acaWQ2.LIZJ;
            if (liveRoomStruct6 != null) {
                lValueOf = Long.valueOf(liveRoomStruct6.id);
            }
            c2344009Gk2.LJ(lValueOf, "room_id");
            C487710JAr c487710JAr2 = C487710JAr.LIZ;
            LiveRoomStruct liveRoomStruct7 = c1acaWQ2.LIZJ;
            c487710JAr2.getClass();
            c2344009Gk2.LIZJ(C487710JAr.LIZ(liveRoomStruct7), "follow_status");
            c2344009Gk2.LJIIIIZZ("avoid_reason", str);
            C20684815ws.LJIILLIIL("livesdk_fyp_guidence_page_avoid", c2344009Gk2.LIZ);
        }
    }

    public final void BQ2(String str) {
        String uid;
        Long lValueOf;
        String requestId;
        String uid2;
        Long lValueOf2;
        String str2;
        long j;
        LiveRoomStruct liveRoomStruct;
        User user;
        User user2;
        C1ACA c1acaWQ2 = wQ2();
        if (c1acaWQ2 != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from_merge", c1acaWQ2.LIZLLL);
            c2344009Gk.LJIIIIZZ("action_type", "click");
            LiveRoomStruct liveRoomStruct2 = c1acaWQ2.LIZJ;
            String requestId2 = null;
            if (liveRoomStruct2 != null && (user2 = liveRoomStruct2.owner) != null) {
                uid = user2.getUid();
            } else {
                uid = null;
            }
            c2344009Gk.LJIIIIZZ("anchor_id", uid);
            LiveRoomStruct liveRoomStruct3 = c1acaWQ2.LIZJ;
            if (liveRoomStruct3 != null) {
                lValueOf = Long.valueOf(liveRoomStruct3.id);
            } else {
                lValueOf = null;
            }
            c2344009Gk.LJ(lValueOf, "room_id");
            Aweme aweme = c1acaWQ2.LIZIZ;
            if (aweme != null) {
                requestId = aweme.getRequestId();
            } else {
                requestId = null;
            }
            c2344009Gk.LJIIIIZZ("request_id", requestId);
            c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
            C487710JAr c487710JAr = C487710JAr.LIZ;
            LiveRoomStruct liveRoomStruct4 = c1acaWQ2.LIZJ;
            c487710JAr.getClass();
            c2344009Gk.LIZJ(C487710JAr.LIZ(liveRoomStruct4), "follow_status");
            c2344009Gk.LJIIIIZZ("click_position", str);
            C20684815ws.LJIILLIIL("livesdk_fyp_guidence_page_click", c2344009Gk.LIZ);
            if (Intrinsics.LJFF(str, "enter") || Intrinsics.LJFF(str, "back")) {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("enter_from_merge", c1acaWQ2.LIZLLL);
                c2344009Gk2.LJIIIIZZ("action_type", "click");
                LiveRoomStruct liveRoomStruct5 = c1acaWQ2.LIZJ;
                if (liveRoomStruct5 != null && (user = liveRoomStruct5.owner) != null) {
                    uid2 = user.getUid();
                } else {
                    uid2 = null;
                }
                c2344009Gk2.LJIIIIZZ("anchor_id", uid2);
                LiveRoomStruct liveRoomStruct6 = c1acaWQ2.LIZJ;
                if (liveRoomStruct6 != null) {
                    lValueOf2 = Long.valueOf(liveRoomStruct6.id);
                } else {
                    lValueOf2 = null;
                }
                c2344009Gk2.LJ(lValueOf2, "room_id");
                Aweme aweme2 = c1acaWQ2.LIZIZ;
                if (aweme2 != null) {
                    requestId2 = aweme2.getRequestId();
                }
                c2344009Gk2.LJIIIIZZ("request_id", requestId2);
                c2344009Gk2.LJIIIIZZ("enter_method", "live_cell");
                if (Intrinsics.LJFF(str, "enter")) {
                    str2 = "watch_now";
                } else {
                    str2 = "not_now";
                }
                c2344009Gk2.LJIIIIZZ("click_type", str2);
                c2344009Gk2.LJIIIIZZ("action_type", "click");
                C1ACA c1acaWQ22 = wQ2();
                if (c1acaWQ22 != null && (liveRoomStruct = c1acaWQ22.LIZJ) != null) {
                    j = liveRoomStruct.maxPreviewTime;
                } else {
                    j = 0;
                }
                c2344009Gk2.LIZLLL(j / 1000, "maximum_preview_duration");
                C20684815ws.LJIILLIIL("livesdk_sub_only_live_enter_room_boot_click", c2344009Gk2.LIZ);
            }
        }
    }

    public final void CQ2(String str) {
        Boolean boolValueOf;
        String uid;
        User user;
        String uid2;
        String str2;
        FeedRoomTagList feedRoomTagList;
        List<FeedRoomTag> list;
        FeedRoomTag feedRoomTag;
        User user2;
        C1ACA c1acaWQ2 = wQ2();
        if (c1acaWQ2 != null) {
            C1ACA c1acaWQ22 = wQ2();
            Long lValueOf = null;
            if (c1acaWQ22 != null) {
                boolValueOf = Boolean.valueOf(TextUtils.equals(c1acaWQ22.LIZLLL, "homepage_live"));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from_merge", c1acaWQ2.LIZLLL);
                c2344009Gk.LJIIIIZZ("action_type", "click");
                LiveRoomStruct liveRoomStruct = c1acaWQ2.LIZJ;
                if (liveRoomStruct != null && (user2 = liveRoomStruct.owner) != null) {
                    uid2 = user2.getUid();
                } else {
                    uid2 = null;
                }
                c2344009Gk.LJIIIIZZ("anchor_id", uid2);
                LiveRoomStruct liveRoomStruct2 = c1acaWQ2.LIZJ;
                if (liveRoomStruct2 != null) {
                    lValueOf = Long.valueOf(liveRoomStruct2.id);
                }
                c2344009Gk.LJ(lValueOf, "room_id");
                c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
                C487710JAr c487710JAr = C487710JAr.LIZ;
                LiveRoomStruct liveRoomStruct3 = c1acaWQ2.LIZJ;
                c487710JAr.getClass();
                c2344009Gk.LIZJ(C487710JAr.LIZ(liveRoomStruct3), "follow_status");
                c2344009Gk.LIZJ(c1acaWQ2.LJIIIIZZ, "room_position");
                LiveRoomStruct liveRoomStruct4 = c1acaWQ2.LIZJ;
                if (liveRoomStruct4 == null || (feedRoomTagList = liveRoomStruct4.feedRoomTagList) == null || (list = feedRoomTagList.subTags) == null || (feedRoomTag = (FeedRoomTag) C13LP.LJJJLL(list)) == null || (str2 = feedRoomTag.content) == null) {
                    str2 = "";
                }
                c2344009Gk.LJIIIIZZ("label", str2);
                c2344009Gk.LJIIIIZZ("type", str);
                C20684815ws.LJIILLIIL("livesdk_auto_guidance_negative_feedback", c2344009Gk.LIZ);
                return;
            }
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from_merge", c1acaWQ2.LIZLLL);
            c2344009Gk2.LJIIIIZZ("action_type", "click");
            c2344009Gk2.LJIIIIZZ("enter_method", "live_cell");
            LiveRoomStruct liveRoomStruct5 = c1acaWQ2.LIZJ;
            if (liveRoomStruct5 != null && (user = liveRoomStruct5.owner) != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            c2344009Gk2.LJIIIIZZ("anchor_id", uid);
            LiveRoomStruct liveRoomStruct6 = c1acaWQ2.LIZJ;
            if (liveRoomStruct6 != null) {
                lValueOf = Long.valueOf(liveRoomStruct6.id);
            }
            c2344009Gk2.LJ(lValueOf, "room_id");
            c2344009Gk2.LJIIIIZZ("type", str);
            C20684815ws.LJIILLIIL("livesdk_fyp_guidence_negative_feedback", c2344009Gk2.LIZ);
        }
    }

    public final boolean vQ2(boolean z) {
        boolean z2;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        LiveRoomStruct liveRoomStruct4;
        Aweme aweme;
        C1ACA c1acaWQ2 = wQ2();
        if (c1acaWQ2 != null && TextUtils.equals(c1acaWQ2.LIZLLL, "homepage_hot")) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j = 0;
        MaskLayer maskLayer = null;
        Aweme aweme2 = null;
        maskLayer = null;
        if (z2) {
            C1ACA c1acaWQ22 = wQ2();
            if (c1acaWQ22 != null && (aweme = c1acaWQ22.LIZIZ) != null && aweme.isAd()) {
                return true;
            }
            C1ACA c1acaWQ23 = wQ2();
            if (c1acaWQ23 != null) {
                aweme2 = c1acaWQ23.LIZIZ;
            }
            if (C1019100ccu.LJI(aweme2)) {
                return true;
            }
            C1ACA c1acaWQ24 = wQ2();
            if (c1acaWQ24 != null && (liveRoomStruct4 = c1acaWQ24.LIZJ) != null && liveRoomStruct4.hasCommerceGoods) {
                return true;
            }
        } else {
            C1ACA c1acaWQ25 = wQ2();
            if (c1acaWQ25 != null && TextUtils.equals(c1acaWQ25.LIZLLL, "homepage_live")) {
                C1ACA c1acaWQ26 = wQ2();
                if (c1acaWQ26 != null && (liveRoomStruct = c1acaWQ26.LIZJ) != null) {
                    maskLayer = liveRoomStruct.maskLayer;
                }
                if (C0JF0.LIZ(maskLayer, false)) {
                    return true;
                }
                FypAutoScrollService fypAutoScrollServiceLIZJ = C1386360mBG.LIZJ();
                if (fypAutoScrollServiceLIZJ != null && fypAutoScrollServiceLIZJ.LIZIZ()) {
                    return true;
                }
            } else {
                C1ACA c1acaWQ27 = wQ2();
                if (c1acaWQ27 == null || !TextUtils.equals(c1acaWQ27.LIZLLL, "homepage_follow") || LiveFollowingPagePreviewGuideExp.INSTANCE.getValue() <= 0 || ((Keva) this.LLILZLL.getValue()).getInt(xQ2(), -1) > 0) {
                    return true;
                }
            }
        }
        C1ACA c1acaWQ28 = wQ2();
        if (c1acaWQ28 != null && c1acaWQ28.LJJJLZIJ) {
            return true;
        }
        C1ACA c1acaWQ29 = wQ2();
        if (c1acaWQ29 != null && (liveRoomStruct3 = c1acaWQ29.LIZJ) != null && liveRoomStruct3.liveSubOnly == 1 && liveRoomStruct3.maxPreviewTime > 60000) {
            return true;
        }
        C1ACA c1acaWQ210 = wQ2();
        if (c1acaWQ210 != null && c1acaWQ210.LJJI) {
            return true;
        }
        C1ACA c1acaWQ211 = wQ2();
        if (c1acaWQ211 != null && c1acaWQ211.LJJIFFI) {
            return true;
        }
        C1ACA c1acaWQ212 = wQ2();
        if (c1acaWQ212 != null && c1acaWQ212.LJJII) {
            return true;
        }
        C1ACA c1acaWQ213 = wQ2();
        if ((c1acaWQ213 != null && !c1acaWQ213.LJFF) || this.LLJJ || this.LLJJI) {
            return true;
        }
        if (!z) {
            C098J<Long, Long> c098j = C1287300jbU.LIZ;
            C1ACA c1acaWQ214 = wQ2();
            if (c1acaWQ214 != null && (liveRoomStruct2 = c1acaWQ214.LIZJ) != null) {
                j = liveRoomStruct2.id;
            }
            if (C1287300jbU.LIZ.get(Long.valueOf(j)) != null) {
                return true;
            }
        }
        return false;
    }

    public final void zQ2(long j, String str) {
        Boolean boolValueOf;
        String uid;
        String str2;
        FeedRoomTagList feedRoomTagList;
        List<FeedRoomTag> list;
        FeedRoomTag feedRoomTag;
        User user;
        C1ACA c1acaWQ2 = wQ2();
        String str3 = null;
        Long lValueOf = null;
        if (c1acaWQ2 != null) {
            boolValueOf = Boolean.valueOf(TextUtils.equals(c1acaWQ2.LIZLLL, "homepage_live"));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C1ACA c1acaWQ22 = wQ2();
            if (c1acaWQ22 != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from_merge", c1acaWQ22.LIZLLL);
                c2344009Gk.LJIIIIZZ("action_type", "click");
                LiveRoomStruct liveRoomStruct = c1acaWQ22.LIZJ;
                if (liveRoomStruct != null && (user = liveRoomStruct.owner) != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                c2344009Gk.LJIIIIZZ("anchor_id", uid);
                LiveRoomStruct liveRoomStruct2 = c1acaWQ22.LIZJ;
                if (liveRoomStruct2 != null) {
                    lValueOf = Long.valueOf(liveRoomStruct2.id);
                }
                c2344009Gk.LJ(lValueOf, "room_id");
                c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
                C487710JAr c487710JAr = C487710JAr.LIZ;
                LiveRoomStruct liveRoomStruct3 = c1acaWQ22.LIZJ;
                c487710JAr.getClass();
                c2344009Gk.LIZJ(C487710JAr.LIZ(liveRoomStruct3), "follow_status");
                c2344009Gk.LIZJ(c1acaWQ22.LJIIIIZZ, "room_position");
                LiveRoomStruct liveRoomStruct4 = c1acaWQ22.LIZJ;
                if (liveRoomStruct4 == null || (feedRoomTagList = liveRoomStruct4.feedRoomTagList) == null || (list = feedRoomTagList.subTags) == null || (feedRoomTag = (FeedRoomTag) C13LP.LJJJLL(list)) == null || (str2 = feedRoomTag.content) == null) {
                    str2 = "";
                }
                c2344009Gk.LJIIIIZZ("label", str2);
                c2344009Gk.LJIIIIZZ("process", str);
                c2344009Gk.LIZLLL(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT), "duration");
                C20684815ws.LJIILLIIL("livesdk_auto_guidance_notify_time", c2344009Gk.LIZ);
                return;
            }
            return;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        C1ACA c1acaWQ23 = wQ2();
        if (c1acaWQ23 != null) {
            str3 = c1acaWQ23.LIZLLL;
        }
        c2344009Gk2.LJIIIIZZ("enter_from_merge", str3);
        c2344009Gk2.LJIIIIZZ("action_type", "click");
        c2344009Gk2.LJIIIIZZ("enter_method", "live_cell");
        c2344009Gk2.LIZLLL(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT), "duration");
        C20684815ws.LJIILLIIL("livesdk_live_show_notify_time_v2", c2344009Gk2.LIZ);
    }
}
