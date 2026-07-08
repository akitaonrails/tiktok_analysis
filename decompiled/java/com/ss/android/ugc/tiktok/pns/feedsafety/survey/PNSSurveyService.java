package com.ss.android.ugc.tiktok.pns.feedsafety.survey;

import X.C01GW;
import X.C10KF;
import X.C11NZ;
import X.C11O8;
import X.C11S5;
import X.C1210880hcE;
import X.C13BV;
import X.C13LP;
import X.C14EU;
import X.C14ZG;
import X.C14ZW;
import X.C15438062q;
import X.C1701940uOG;
import X.C19476611Hw;
import X.C19719612Di;
import X.C20684815ws;
import X.C2097908Jt;
import X.C452501pT;
import X.C484220Iyq;
import X.C622680Oba;
import X.C632140Oqq;
import Y.AfS0S1000100_9;
import Y.AfS188S0100000_19;
import Y.AfS197S0100000_28;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.services.video.IPNSVideoTrackerService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.service.ISurveyDebuggerService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSSurveyService implements com.ss.android.ugc.tiktok.pns.feedsafety.api.survey.PNSSurveyService {
    public boolean LIZJ;
    public boolean LIZLLL;
    public int LJIIIIZZ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public long LJIILIIL;
    public IPNSVideoTrackerService LJIILJJIL;
    public volatile boolean LJIIZILJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(754));
    public long LIZIZ = -1;
    public final Set<String> LJ = Collections.newSetFromMap(new ConcurrentHashMap());
    public volatile String LJFF = "";
    public final CopyOnWriteArrayList<String> LJI = new CopyOnWriteArrayList<>();
    public final List<Integer> LJII = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList<String> LJIIIZ = new CopyOnWriteArrayList<>();
    public final AtomicBoolean LJIIJ = new AtomicBoolean(false);
    public final C01GW LJIILL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(430));
    public final AtomicBoolean LJIILLIIL = new AtomicBoolean(false);

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.survey.PNSSurveyService
    public final boolean LIZIZ() {
        C11NZ<KeyMomentsResponse> keyMomentsTopics;
        C11O8 c11o8LJJJLZIJ;
        List<String> listLIZIZ;
        if (!this.LJIIZILJ || this.LJFF.length() == 0 || this.LJIIIIZZ == 0) {
            return false;
        }
        if (this.LJIIJJI && (!((CopyOnWriteArrayList) this.LJII).isEmpty())) {
            return true;
        }
        IPNSVideoTrackerService iPNSVideoTrackerService = this.LJIILJJIL;
        if (iPNSVideoTrackerService != null && iPNSVideoTrackerService.LIZJ(this.LJIIIIZZ)) {
            if (!this.LIZLLL) {
                this.LIZLLL = true;
                this.LJIIIZ.clear();
                CopyOnWriteArrayList<String> copyOnWriteArrayList = this.LJIIIZ;
                IPNSVideoTrackerService iPNSVideoTrackerService2 = this.LJIILJJIL;
                if (iPNSVideoTrackerService2 == null || (listLIZIZ = iPNSVideoTrackerService2.LIZIZ(this.LJIIIIZZ)) == null) {
                    listLIZIZ = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(listLIZIZ, copyOnWriteArrayList);
                if (!this.LJIIL) {
                    LJIIIIZZ("Trigger condition met: skips");
                    this.LJIIL = true;
                }
            }
        } else if (!this.LJIIJ.get()) {
            this.LJIIL = false;
            this.LIZLLL = false;
        }
        if (!this.LIZLLL && !this.LIZJ) {
            return false;
        }
        if (!((CopyOnWriteArrayList) this.LJII).isEmpty()) {
            return true;
        }
        this.LJIIJJI = true;
        if (!this.LJIIJ.get() && System.currentTimeMillis() - this.LJIILIIL >= Mp4ScreenVideoLoadTimeout.CONTROL && this.LJIIJ.compareAndSet(false, true)) {
            this.LJIILIIL = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            if (this.LIZLLL) {
                arrayList.addAll(C13LP.LLIIII(this.LJIIIZ));
                C20684815ws.LJIILLIIL("key_moment_skip_videos", C2097908Jt.LIZJ(new Pair("item_ids", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62))));
            } else if (this.LIZJ) {
                arrayList.addAll(C13LP.LLIIII(this.LJI));
                C20684815ws.LJIILLIIL("key_moment_report_or_not_interested_twice", C2097908Jt.LIZJ(new Pair("item_ids", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62))));
            }
            LJIIIIZZ("Topics requested");
            KeyMomentsApi.LIZ.getClass();
            KeyMomentsApi keyMomentsApi = C10KF.LIZIZ;
            if (keyMomentsApi != null && (keyMomentsTopics = keyMomentsApi.getKeyMomentsTopics(new KeyMomentsRequest(arrayList))) != null && (c11o8LJJJLZIJ = C632140Oqq.LIZLLL(keyMomentsTopics, "/tiktok/v1/topic-preferences/key_moment_filter", null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ())) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C19476611Hw c19476611HwLJL = c11o8LJJJLZIJ.LJJIJIIJIL(new AfS0S1000100_9("/tiktok/v1/topic-preferences/key_moment_filter", jCurrentTimeMillis, 2)).LJJIJIIJI(new AfS0S1000100_9("/tiktok/v1/topic-preferences/key_moment_filter", jCurrentTimeMillis, 3)).LJL(C11S5.LIZ());
                if (c19476611HwLJL != null) {
                    c19476611HwLJL.LJJLL(new AfS197S0100000_28(this, 82), new AfS188S0100000_19(this, 74));
                }
            }
            this.LJIIJ.set(false);
            return false;
        }
        return false;
    }

    public final Keva LJFF() {
        return (Keva) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.survey.PNSSurveyService
    public final void init() {
        List<String> list;
        if (this.LJIILLIIL.compareAndSet(false, true)) {
            SettingsManager.LIZLLL().getClass();
            this.LJIIIIZZ = SettingsManager.LJ("key_moments_skip_count", 0);
            this.LJIILJJIL = (IPNSVideoTrackerService) PluggableExtentionKt.pluggableSpi$default(IPNSVideoTrackerService.class, false, false, false, 14, null);
            C14ZW.LIZ.getClass();
            List<C14ZG> listLLIIII = C13LP.LLIIII(C14ZW.LIZIZ.values());
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
            for (C14ZG c14zg : listLLIIII) {
                if (Intrinsics.LJFF(c14zg.LJI.contentScope, "pns") || ((list = c14zg.LJI.contentScopes) != null && list.contains("pns"))) {
                    this.LJ.add(c14zg.LIZ);
                    C20684815ws.LJIILLIIL("key_moment_survey_inserted", C2097908Jt.LIZJ(new Pair("survey_key", c14zg.LIZ)));
                }
                arrayList.add(Unit.LIZ);
            }
            Iterator<String> it2 = this.LJ.iterator();
            this.LJFF = it2.hasNext() ? it2.next() : "";
            if (!this.LJ.isEmpty()) {
                LJIIIIZZ("Survey inserted into repo");
            } else {
                LJIIIIZZ("No key moment surveys");
            }
            long j = LJFF().getLong("last_report_or_dislike_key", -1L);
            String string = LJFF().getString("last_report_or_dislike_aid_key", "");
            if ((System.currentTimeMillis() - this.LIZIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) >= 86400 || string.length() == 0) {
                LJII();
            } else {
                this.LIZIZ = j;
                this.LJI.add(string);
            }
            C622680Oba.LIZJ(this);
            this.LJIIZILJ = true;
        }
    }

    public final void LJII() {
        LJFF().erase("last_report_or_dislike_key");
        LJFF().erase("last_report_or_dislike_aid_key");
        this.LJI.clear();
        this.LIZJ = false;
        this.LIZIZ = -1L;
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.survey.PNSSurveyService
    public final List<Integer> LIZJ() {
        return this.LJII;
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.survey.PNSSurveyService
    public final String LJ() {
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.survey.PNSSurveyService
    public final void LIZ(String str) {
        String next;
        this.LJIIJJI = false;
        this.LIZLLL = false;
        this.LIZJ = false;
        this.LJ.remove(str);
        if (Intrinsics.LJFF(this.LJFF, str)) {
            Iterator<String> it2 = this.LJ.iterator();
            if (it2.hasNext()) {
                next = it2.next();
            } else {
                next = "";
            }
            this.LJFF = next;
        }
        try {
            C20684815ws.LJIILLIIL("key_moment_survey_shown", C2097908Jt.LIZJ(new Pair("key", str)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((CopyOnWriteArrayList) this.LJII).clear();
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.survey.PNSSurveyService
    public final boolean LIZLLL(String str) {
        return this.LJ.contains(str);
    }

    public final void LJI(String str) {
        if (str.length() == 0) {
            return;
        }
        long j = this.LIZIZ;
        if (j != -1 && (System.currentTimeMillis() - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) >= 86400) {
            LJII();
        }
        this.LJI.add(str);
        if (this.LIZIZ == -1) {
            this.LIZIZ = System.currentTimeMillis();
            LJFF().storeLong("last_report_or_dislike_key", this.LIZIZ);
            LJFF().storeString("last_report_or_dislike_aid_key", str);
        } else {
            this.LIZJ = true;
            LJIIIIZZ("Trigger condition met: dislike/report");
        }
    }

    public final void LJIIIIZZ(String str) {
        ISurveyDebuggerService iSurveyDebuggerService = (ISurveyDebuggerService) this.LJIILL.getValue();
        if (iSurveyDebuggerService != null) {
            iSurveyDebuggerService.LIZ();
        }
    }

    @C14EU
    public final void onDislikeEvent(C1210880hcE c1210880hcE) {
        String aid;
        if (!c1210880hcE.LIZJ.equals("FUNCTION_FROM_NOT_INTERESTED") || !c1210880hcE.LIZIZ.equals("homepage_hot")) {
            return;
        }
        Aweme aweme = c1210880hcE.LIZ;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        LJI(aid);
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        try {
            String string = JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName");
            String str = "";
            if (string == null) {
                string = "";
            }
            if (!Intrinsics.LJFF(string, "videoReportSuccess")) {
                return;
            }
            String string2 = JSONObjectProtectorUtils.getString(new JSONObject(JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "data")), "object_id");
            if (string2 != null) {
                str = string2;
            }
            LJI(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
