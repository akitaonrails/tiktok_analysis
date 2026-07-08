package com.ss.android.ugc.aweme.feed.adapter.widget.repost;

import X.C01GW;
import X.C08A4;
import X.C09JN;
import X.C0IUA;
import X.C11JF;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1391850mK7;
import X.C13LP;
import X.C1847420yAu;
import X.C1847430yAv;
import X.C1847450yAx;
import X.C19EG;
import X.C1ACA;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2211631BhB;
import X.C259800zU;
import X.C452501pT;
import X.C470010Ibv;
import X.C480460Ism;
import X.C786410Ut5;
import X.DialogInterfaceOnDismissListenerC521770KdD;
import X.EnumC1847410yAt;
import Y.ARunnableS127S0100000_27;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePreviewCardMultiRepostTagSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePreviewCardRepostGuideEnableSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.strategy.StrategyApi;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.guide.RepostGuideShowRecordsModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RepostInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.StrategyData;
import webcast.api.room.StrategyTrigger;
import webcast.api.room.WebcastRoomRepostRepostersResponse;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveRepostVM extends LiveWidgetViewModel {
    public static final C1847450yAx LLJILJILJ = new Object() { // from class: X.0yAx
    };
    public static final HashMap<String, List<WebcastRoomRepostRepostersResponse.Reposter>> LLJILLL = new HashMap<>();
    public C11JF LLILZIL;
    public C11JF LLILZLL;
    public boolean LLIZ;
    public RepostGuideShowRecordsModel LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LL = C452501pT.LIZIZ(new C1847420yAu());
    public final MutableLiveData<EnumC1847410yAt> LLILLJJLI = new MutableLiveData<>(null);
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1847430yAv(this));
    public List<WebcastRoomRepostRepostersResponse.Reposter> LLILZ = new CopyOnWriteArrayList();
    public final BPEAHandler LLIZLLLIL = new BPEAHandler(Looper.getMainLooper());

    public static boolean AQ2() {
        return LivePreviewCardRepostGuideEnableSetting.INSTANCE.getValue() && C470010Ibv.LIZJ() != null;
    }

    public final void CQ2() {
        this.LLILLJJLI.setValue(null);
        if (this.LLJI) {
            this.LLIZLLLIL.removeMessages(1001);
            this.LLJI = false;
            C1ACA c1acaVQ2 = vQ2();
            if (c1acaVQ2 != null) {
                c1acaVQ2.LJLJLLL = "user_leave";
            }
        }
    }

    public final void EQ2() {
        List<StrategyTrigger> list;
        StrategyTrigger strategyTrigger;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        RepostInfo repostInfo;
        Boolean bool;
        ((CopyOnWriteArrayList) this.LLILZ).size();
        vQ2();
        C1ACA c1acaVQ2 = vQ2();
        boolean zBooleanValue = (c1acaVQ2 == null || (liveRoomStruct2 = c1acaVQ2.LIZJ) == null || (repostInfo = liveRoomStruct2.repostInfo) == null || (bool = repostInfo.passedRepostGuideCheck) == null) ? false : bool.booleanValue();
        boolean zLIZIZ = C08A4.LIZIZ(Long.valueOf(C0IUA.LIZLLL));
        C1ACA c1acaVQ22 = vQ2();
        boolean z = (c1acaVQ22 == null || (liveRoomStruct = c1acaVQ22.LIZJ) == null || C0IUA.LIZLLL != liveRoomStruct.id) ? false : true;
        if (!(LivePreviewCardMultiRepostTagSetting.INSTANCE.enable() && yQ2(false)) && AQ2()) {
            if (zBooleanValue) {
                this.LLILLJJLI.setValue(((CopyOnWriteArrayList) this.LLILZ).isEmpty() ? EnumC1847410yAt.TEXT : EnumC1847410yAt.ICON);
                return;
            }
            if (zLIZIZ) {
                if (z) {
                    C470010Ibv.LIZ(vQ2(), new AwS641S0100000_27(this, 17));
                    return;
                }
                C1ACA c1acaVQ23 = vQ2();
                if (c1acaVQ23 != null) {
                    c1acaVQ23.LJLJLLL = "return_from_other_room";
                    return;
                }
                return;
            }
            StrategyData strategyDataLIZJ = C470010Ibv.LIZJ();
            long j = (strategyDataLIZJ == null || (list = strategyDataLIZJ.trigger) == null || (strategyTrigger = (StrategyTrigger) C13LP.LJJJLL(list)) == null) ? 0L : strategyTrigger.delay;
            this.LLJI = true;
            BPEAHandler bPEAHandler = this.LLIZLLLIL;
            Message messageObtain = Message.obtain(bPEAHandler, new ARunnableS127S0100000_27(this, 17));
            messageObtain.what = 1001;
            C786410Ut5.LJLJLJ(bPEAHandler, messageObtain, j * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
    }

    public final C1ACA vQ2() {
        return (C1ACA) this.LLILLL.getValue();
    }

    public final Map<String, String> wQ2() {
        String str;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme;
        String requestId;
        LiveRoomStruct liveRoomStruct2;
        RepostInfo repostInfo;
        LiveRoomStruct liveRoomStruct3;
        User user;
        LiveRoomStruct liveRoomStruct4;
        LiveRoomStruct liveRoomStruct5;
        Pair[] pairArr = new Pair[11];
        pairArr[0] = new Pair("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        C1ACA c1acaVQ2 = vQ2();
        String str2 = "";
        if (c1acaVQ2 == null || (str = c1acaVQ2.LIZLLL) == null) {
            str = "";
        }
        pairArr[1] = new Pair("enter_from_merge", str);
        pairArr[2] = new Pair("enter_method", "live_cell");
        pairArr[3] = new Pair("action_type", "click");
        C1ACA c1acaVQ22 = vQ2();
        pairArr[4] = new Pair("room_id", String.valueOf((c1acaVQ22 == null || (liveRoomStruct5 = c1acaVQ22.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct5.id)));
        C1ACA c1acaVQ23 = vQ2();
        pairArr[5] = new Pair("anchor_id", String.valueOf((c1acaVQ23 == null || (liveRoomStruct4 = c1acaVQ23.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct4.ownerUserId)));
        C1ACA c1acaVQ24 = vQ2();
        pairArr[6] = new Pair("follow_status", String.valueOf((c1acaVQ24 == null || (liveRoomStruct3 = c1acaVQ24.LIZJ) == null || (user = liveRoomStruct3.owner) == null) ? null : Integer.valueOf(user.getFollowStatus())));
        C1ACA c1acaVQ25 = vQ2();
        pairArr[7] = new Pair("reposted_user_cnt", String.valueOf((c1acaVQ25 == null || (liveRoomStruct2 = c1acaVQ25.LIZJ) == null || (repostInfo = liveRoomStruct2.repostInfo) == null) ? null : Long.valueOf(repostInfo.repostersCnt)));
        C1ACA c1acaVQ26 = vQ2();
        if (c1acaVQ26 != null && (aweme = c1acaVQ26.LIZIZ) != null && (requestId = aweme.getRequestId()) != null) {
            str2 = requestId;
        }
        pairArr[8] = new Pair("request_id", str2);
        C1ACA c1acaVQ27 = vQ2();
        pairArr[9] = new Pair("is_reposted_expect", String.valueOf((c1acaVQ27 == null || (liveRoomStruct = c1acaVQ27.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct.isRepostedExpect)));
        pairArr[10] = new Pair("repost_pair_follow_status", String.valueOf(vQ2() != null ? GQ2() : null));
        return C2097608Jq.LJIIJ(pairArr);
    }

    public final MutableLiveData<List<WebcastRoomRepostRepostersResponse.Reposter>> xQ2() {
        return (MutableLiveData) this.LL.getValue();
    }

    public final String GQ2() {
        FollowInfo followInfo;
        boolean z;
        FollowInfo followInfo2;
        LiveRoomStruct liveRoomStruct;
        C1ACA c1acaVQ2 = vQ2();
        Boolean boolValueOf = (c1acaVQ2 == null || (liveRoomStruct = c1acaVQ2.LIZJ) == null) ? null : Boolean.valueOf(liveRoomStruct.reposted);
        List<WebcastRoomRepostRepostersResponse.Reposter> list = this.LLILZ;
        boolean z2 = true;
        if ((list instanceof Collection) && ((CopyOnWriteArrayList) list).isEmpty()) {
            z = false;
        } else {
            Iterator it2 = ((CopyOnWriteArrayList) list).iterator();
            while (it2.hasNext()) {
                com.bytedance.android.live.base.model.user.User user = ((WebcastRoomRepostRepostersResponse.Reposter) it2.next()).user;
                if (user != null && (followInfo = user.getFollowInfo()) != null && followInfo.getFollowStatus() == 1) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        List<WebcastRoomRepostRepostersResponse.Reposter> list2 = this.LLILZ;
        if ((list2 instanceof Collection) && ((CopyOnWriteArrayList) list2).isEmpty()) {
            z2 = false;
        } else {
            Iterator it3 = ((CopyOnWriteArrayList) list2).iterator();
            while (it3.hasNext()) {
                com.bytedance.android.live.base.model.user.User user2 = ((WebcastRoomRepostRepostersResponse.Reposter) it3.next()).user;
                if (user2 != null && (followInfo2 = user2.getFollowInfo()) != null && followInfo2.getFollowStatus() == 2) {
                    break;
                }
            }
            z2 = false;
        }
        StringBuilder sb = new StringBuilder();
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            sb.append("1");
        } else {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        if (z) {
            sb.append("1");
        } else {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        if (z2) {
            sb.append("1");
        } else {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    public final void FQ2(Context context) {
        String str = RepostPanelFragment._pnsPageId;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            RepostPanelFragment repostPanelFragment = new RepostPanelFragment();
            repostPanelFragment.LLIZ = this;
            C259800zU c259800zU = new C259800zU();
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(0);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, c19egLIZIZ);
            ?? r2 = c1390920mIc.LIZ;
            r2.LLJI = numLIZJ;
            r2.LLJJIJIIJIL = false;
            r2.LLJJIJI = repostPanelFragment;
            r2.LLJLILLLLZIIL = false;
            r2.LLILLJJLI = new DialogInterfaceOnDismissListenerC521770KdD(c259800zU, 3);
            c259800zU.element = r2;
            C2211631BhB.LJIIJ(r2);
            C1391850mK7.LIZIZ(c259800zU.element, "live_repost_panel");
            ((DialogFragment) c259800zU.element).show(c19egLIZIZ.getSupportFragmentManager(), "LiveRepostPanel");
        }
    }

    public final boolean yQ2(boolean z) {
        boolean z2;
        Boolean bool;
        LiveRoomStruct liveRoomStruct;
        RepostInfo repostInfo;
        LiveRoomStruct liveRoomStruct2;
        C1ACA c1acaVQ2 = vQ2();
        if (c1acaVQ2 != null && (liveRoomStruct2 = c1acaVQ2.LIZJ) != null) {
            z2 = liveRoomStruct2.reposted;
        } else {
            z2 = false;
        }
        C1ACA c1acaVQ22 = vQ2();
        if (c1acaVQ22 != null && (liveRoomStruct = c1acaVQ22.LIZJ) != null && (repostInfo = liveRoomStruct.repostInfo) != null) {
            bool = repostInfo.passedRepostGuideCheck;
        } else {
            bool = null;
        }
        if (!((CopyOnWriteArrayList) this.LLILZ).isEmpty()) {
            if (!z2) {
                this.LLILLJJLI.setValue(EnumC1847410yAt.ICON);
                return true;
            }
            this.LLILLJJLI.setValue(null);
            return true;
        }
        if (z) {
            if (bool != null) {
                if (bool.booleanValue()) {
                    this.LLILLJJLI.setValue(EnumC1847410yAt.TEXT);
                } else {
                    this.LLILLJJLI.setValue(null);
                    return false;
                }
            } else {
                C470010Ibv.LIZ(vQ2(), new AwS641S0100000_27(this, 16));
                return false;
            }
        }
        return false;
    }

    public final void BQ2(String str, String str2) {
        Map<String, String> mapWQ2 = wQ2();
        mapWQ2.put("action_type", str2);
        mapWQ2.put("action", str2);
        mapWQ2.put("button_type", str);
        C20684815ws.LJIILLIIL("livesdk_repost_trigger_button", mapWQ2);
        if (Intrinsics.LJFF(str2, "show")) {
            mapWQ2.put("panel_source", "preview_trigger_button");
            C20684815ws.LJIILLIIL("livesdk_repost_icon_show", mapWQ2);
        } else {
            if (!Intrinsics.LJFF(str2, "click")) {
                return;
            }
            mapWQ2.put("panel_source", "preview_trigger_button");
            C20684815ws.LJIILLIIL("livesdk_repost_icon_click", mapWQ2);
        }
    }

    public final void DQ2(Boolean bool, Boolean bool2) {
        Boolean boolValueOf;
        String str;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        C1ACA c1acaVQ2 = vQ2();
        if (c1acaVQ2 != null && (liveRoomStruct2 = c1acaVQ2.LIZJ) != null) {
            boolValueOf = Boolean.valueOf(liveRoomStruct2.reposted);
        } else {
            boolValueOf = null;
        }
        Boolean bool3 = Boolean.TRUE;
        if (Intrinsics.LJFF(boolValueOf, bool3)) {
            return;
        }
        if (Intrinsics.LJFF(bool, bool3)) {
            BQ2("mutil_user_repost", "show");
        } else if (Intrinsics.LJFF(bool2, bool3)) {
            BQ2("individual_repost", "show");
        }
        if (Intrinsics.LJFF(bool2, bool3)) {
            C1ACA c1acaVQ22 = vQ2();
            if (c1acaVQ22 != null) {
                c1acaVQ22.LJLJLLL = "success";
            }
            C1ACA c1acaVQ23 = vQ2();
            if (c1acaVQ23 != null && (liveRoomStruct = c1acaVQ23.LIZJ) != null) {
                RepostGuideShowRecordsModel repostGuideShowRecordsModel = new RepostGuideShowRecordsModel(liveRoomStruct.id, System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), 0L);
                List listLIZIZ = C470010Ibv.LIZIZ();
                ((ArrayList) listLIZIZ).add(repostGuideShowRecordsModel);
                C470010Ibv.LIZLLL(listLIZIZ);
                this.LLJ = repostGuideShowRecordsModel;
            }
            vQ2();
            C480460Ism.LIZ().getClass();
            StrategyApi strategyApi = (StrategyApi) C480460Ism.LIZLLL(StrategyApi.class);
            StrategyData strategyDataLIZJ = C470010Ibv.LIZJ();
            if (strategyDataLIZJ == null || (str = strategyDataLIZJ.strategyId) == null) {
                str = "";
            }
            this.LLILZLL = (C11JF) strategyApi.strategyReport(19, 1, str).LJJLL(new C09JN() { // from class: X.00QB
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("RepostGuideRecordHelper@d17a.reportTextRepostGuideShow$1");
                    C1C7U.LIZIZ("RepostGuideRecordHelper@d17a.reportTextRepostGuideShow$1");
                }
            }, new C09JN() { // from class: X.00QC
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("RepostGuideRecordHelper@d17a.reportTextRepostGuideShow$2");
                    C1C7U.LIZIZ("RepostGuideRecordHelper@d17a.reportTextRepostGuideShow$2");
                }
            });
        }
    }

    public final void zQ2(String str, boolean z) {
        LiveRoomStruct liveRoomStruct;
        RepostInfo repostInfo;
        LiveRoomStruct liveRoomStruct2;
        RepostInfo repostInfo2;
        if (z) {
            C1ACA c1acaVQ2 = vQ2();
            if (c1acaVQ2 != null && (liveRoomStruct2 = c1acaVQ2.LIZJ) != null && (repostInfo2 = liveRoomStruct2.repostInfo) != null) {
                repostInfo2.passedRepostGuideCheck = Boolean.TRUE;
            }
            this.LLILLJJLI.setValue(EnumC1847410yAt.TEXT);
            return;
        }
        C1ACA c1acaVQ22 = vQ2();
        if (c1acaVQ22 != null && (liveRoomStruct = c1acaVQ22.LIZJ) != null && (repostInfo = liveRoomStruct.repostInfo) != null) {
            repostInfo.passedRepostGuideCheck = Boolean.FALSE;
        }
        C1ACA c1acaVQ23 = vQ2();
        if (c1acaVQ23 != null) {
            c1acaVQ23.LJLJLLL = str;
        }
        this.LLILLJJLI.setValue(null);
    }

    public static void HQ2(LiveRepostVM liveRepostVM, String str, Boolean bool, int i) {
        boolean z;
        C1ACA c1acaVQ2;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        RepostInfo repostInfo;
        LiveRoomStruct liveRoomStruct3;
        long jCurrentTimeMillis;
        LiveRoomStruct liveRoomStruct4;
        String strGQ2 = null;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            bool = Boolean.FALSE;
        }
        C1ACA c1acaVQ22 = liveRepostVM.vQ2();
        if (c1acaVQ22 != null && (liveRoomStruct4 = c1acaVQ22.LIZJ) != null) {
            z = liveRoomStruct4.reposted;
        } else {
            z = false;
        }
        com.bytedance.android.live.base.model.user.User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        Iterator it2 = ((CopyOnWriteArrayList) liveRepostVM.LLILZ).iterator();
        int i2 = 0;
        Object objRemove = null;
        while (it2.hasNext()) {
            int i3 = i2 + 1;
            com.bytedance.android.live.base.model.user.User user = ((WebcastRoomRepostRepostersResponse.Reposter) it2.next()).user;
            if (user != null && user.getId() == userLJIJJLI.getId()) {
                objRemove = ListProtector.remove(liveRepostVM.LLILZ, i2);
            }
            i2 = i3;
        }
        if (z) {
            WebcastRoomRepostRepostersResponse.Reposter reposter = new WebcastRoomRepostRepostersResponse.Reposter();
            reposter.user = userLJIJJLI;
            reposter.type = 1;
            WebcastRoomRepostRepostersResponse.Reposter reposter2 = (WebcastRoomRepostRepostersResponse.Reposter) objRemove;
            if (reposter2 != null) {
                jCurrentTimeMillis = reposter2.repostTimestamp;
            } else {
                jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            }
            reposter.repostTimestamp = jCurrentTimeMillis;
            if (str == null && (reposter2 == null || (str = reposter2.repostNote) == null)) {
                str = "";
            }
            reposter.repostNote = str;
            ListProtector.add(liveRepostVM.LLILZ, 0, reposter);
        }
        C1ACA c1acaVQ23 = liveRepostVM.vQ2();
        if ((c1acaVQ23 == null || (liveRoomStruct3 = c1acaVQ23.LIZJ) == null || liveRoomStruct3.repostInfo == null) && (c1acaVQ2 = liveRepostVM.vQ2()) != null && (liveRoomStruct = c1acaVQ2.LIZJ) != null) {
            liveRoomStruct.repostInfo = new RepostInfo();
        }
        C1ACA c1acaVQ24 = liveRepostVM.vQ2();
        if (c1acaVQ24 != null && (liveRoomStruct2 = c1acaVQ24.LIZJ) != null && (repostInfo = liveRoomStruct2.repostInfo) != null) {
            repostInfo.repostersCnt = ((CopyOnWriteArrayList) liveRepostVM.LLILZ).size();
        }
        C1ACA c1acaVQ25 = liveRepostVM.vQ2();
        if (c1acaVQ25 != null) {
            if (liveRepostVM.vQ2() != null) {
                strGQ2 = liveRepostVM.GQ2();
            }
            c1acaVQ25.LJLL = strGQ2;
        }
        liveRepostVM.xQ2().setValue(liveRepostVM.LLILZ);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            if (liveRepostVM.LLJIJIL && !liveRepostVM.LLJILJIL) {
                liveRepostVM.EQ2();
            }
            liveRepostVM.LLJILJIL = true;
            return;
        }
        if (!LivePreviewCardMultiRepostTagSetting.INSTANCE.enable()) {
            return;
        }
        liveRepostVM.yQ2(true);
    }
}
