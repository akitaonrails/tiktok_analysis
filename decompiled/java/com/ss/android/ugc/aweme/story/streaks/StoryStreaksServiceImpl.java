package com.ss.android.ugc.aweme.story.streaks;

import X.AnonymousClass1206;
import X.C01GW;
import X.C0B0L;
import X.C0CHQ;
import X.C0FNV;
import X.C0PEM;
import X.C126I;
import X.C126M;
import X.C126O;
import X.C126Q;
import X.C126U;
import X.C126V;
import X.C126X;
import X.C1388190mED;
import X.C1389880mGw;
import X.C1449410nox;
import X.C1601110rld;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C264100AWq;
import X.C298570Bn5;
import X.C417570GYx;
import X.C452501pT;
import X.C724640Sbe;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import Y.ARunnableS129S0100000_29;
import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.StoryGetStreaksInfoResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.experiment.streak.GroupChatStreakExpConfig;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class StoryStreaksServiceImpl implements IStoryStreaksService {
    public static final /* synthetic */ int LJ = 0;
    public DialogC1389620mGW LIZ;
    public long LIZIZ;
    public final C01GW LIZJ;
    public StoryStreakEnterEditParam LIZLLL;

    @Override // com.ss.android.ugc.aweme.story.streaks.IStoryStreaksService
    public final Map<String, Effect> LIZJ() {
        C126I.LIZ.getClass();
        return C126I.LIZLLL;
    }

    public StoryStreaksServiceImpl() {
        C1DFH c1dfh = C0PEM.LIZ;
        C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LIZJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 488));
    }

    @Override // com.ss.android.ugc.aweme.story.streaks.IStoryStreaksService
    public final Pair<Boolean, Boolean> LIZ() {
        if (C1601110rld.LIZ()) {
            return new Pair<>(Boolean.valueOf(((Number) C298570Bn5.LIZ.getValue()).intValue() > 0), Boolean.valueOf(((Boolean) C264100AWq.LIZ.getValue()).booleanValue()));
        }
        Boolean bool = Boolean.FALSE;
        return new Pair<>(bool, bool);
    }

    @Override // com.ss.android.ugc.aweme.story.streaks.IStoryStreaksService
    public final boolean LIZLLL() {
        return C1601110rld.LIZ() && ((GroupChatStreakExpConfig) C126U.LIZIZ.getValue()).getEnable();
    }

    @Override // com.ss.android.ugc.aweme.story.streaks.IStoryStreaksService
    public final StoryGetStreaksInfoResponse LJ(String str) {
        try {
            return StoryApi.LIZIZ.getStreaksInfo(CastLongProtector.parseLong(str)).execute().LIZIZ;
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public final void LJI(Context context) {
        DialogC1389620mGW dialogC1389620mGW = this.LIZ;
        if (dialogC1389620mGW != null && dialogC1389620mGW.isShowing()) {
            return;
        }
        DialogC1389620mGW dialogC1389620mGW2 = new DialogC1389620mGW(context);
        dialogC1389620mGW2.LJJLJ(R.string.txr);
        this.LIZ = dialogC1389620mGW2;
        C786410Ut5.J4(dialogC1389620mGW2);
        C786410Ut5.LJLIIL(C126X.LIZIZ().timeoutThresholdMs, C724640Sbe.LIZ(), new ARunnableS129S0100000_29(this, 94));
    }

    @Override // com.ss.android.ugc.aweme.story.streaks.IStoryStreaksService
    public final void LIZIZ(Context context, StoryStreakEnterEditParam storyStreakEnterEditParam) {
        int streakLevel;
        int i;
        if (storyStreakEnterEditParam.getStreakLevel() >= 300) {
            streakLevel = storyStreakEnterEditParam.getStreakLevel();
        } else {
            streakLevel = 200;
            if (storyStreakEnterEditParam.getStreakLevel() < 200) {
                streakLevel = 100;
                if (storyStreakEnterEditParam.getStreakLevel() < 100) {
                    streakLevel = 30;
                    if (storyStreakEnterEditParam.getStreakLevel() < 30) {
                        streakLevel = 10;
                        if (storyStreakEnterEditParam.getStreakLevel() < 10) {
                            streakLevel = 3;
                        }
                    }
                }
            }
        }
        storyStreakEnterEditParam.setStreakLevel(streakLevel);
        if (storyStreakEnterEditParam.getEnterByClickPostBtn()) {
            this.LIZLLL = storyStreakEnterEditParam;
            C126M.LJIILIIL = System.currentTimeMillis();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_method", storyStreakEnterEditParam.getEnterMethod());
            c2344009Gk.LJIIIIZZ("streak_level", String.valueOf(storyStreakEnterEditParam.getStreakLevel()));
            c2344009Gk.LJIIIIZZ("story_theme", "6");
            Map<String, String> map = c2344009Gk.LIZ;
            IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
            C126I.LIZ.getClass();
            iRecordMobService.LIZLLL(new C1449410nox(C126I.LJIILIIL, "streaks_to_story", storyStreakEnterEditParam.getEnterFrom(), null, null, null, null, null, 248), map);
            if (C126I.LJ) {
                C126I.LJI = true;
                LJI(context);
                return;
            }
            C126I.LJI = false;
            C126V c126v = C126I.LJIIIIZZ;
            if (C126I.LJIILIIL.length() > 0 && c126v != null) {
                C126M.LJIIL = 1;
                LJFF(context, c126v.LIZ, c126v.LIZIZ, C126I.LJIILIIL, storyStreakEnterEditParam);
                return;
            } else {
                LJI(context);
                i = 3;
            }
        } else {
            C126I.LIZ.getClass();
            if (C126I.LJIILIIL.length() == 0) {
                C126I.LJIILIIL = UUID.randomUUID().toString();
            }
            C126I.LJII = storyStreakEnterEditParam;
            i = 3;
            C23250099c.LIZLLL(C126I.LIZIZ, null, null, new AnonymousClass1206(null), 3);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C126Q(this, context, storyStreakEnterEditParam, null), i);
    }

    public final void LJFF(Context context, String str, String str2, String str3, StoryStreakEnterEditParam storyStreakEnterEditParam) {
        int iLIZ;
        String strLJIILL;
        C126I.LIZ.getClass();
        int i = C126I.LJIIIZ;
        Map<String, Effect> map = C126I.LIZLLL;
        int i2 = 2;
        if (map.size() >= 2) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            if (linkedHashMap.keySet().contains(C126X.LIZIZ().bottomTextInfoStickerResId) && linkedHashMap.keySet().contains(C126X.LIZIZ().fireAnimInfoStickerResId)) {
                i2 = 0;
            }
        }
        storyStreakEnterEditParam.setMufDaysCount(i);
        Pair pair = new Pair(C126I.LJIIJ, C126I.LJIIJJI);
        storyStreakEnterEditParam.setInfoDescFontPath((String) pair.getFirst());
        storyStreakEnterEditParam.setInfoNumberFontPath((String) pair.getSecond());
        storyStreakEnterEditParam.setNumUseEffectFont(C126I.LJIIL);
        if (C0B0L.LIZ()) {
            try {
                iLIZ = C417570GYx.LIZ(storyStreakEnterEditParam.getStreakLevel(), context);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                iLIZ = 0;
            }
            storyStreakEnterEditParam.setPosterBgColor(iLIZ);
        }
        if (i2 != 0) {
            DialogC1389620mGW dialogC1389620mGW = this.LIZ;
            if (dialogC1389620mGW != null) {
                C0FNV.LIZ(dialogC1389620mGW);
            }
            this.LIZ = null;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null) {
                C1389880mGw c1389880mGw = new C1389880mGw(c19egLIZIZ);
                c1389880mGw.LJIIIIZZ(2131848735);
                c1389880mGw.LJIIJ();
            }
            C126M.LIZIZ(storyStreakEnterEditParam, i2);
            return;
        }
        try {
            strLJIILL = C0CHQ.LIZ().getGson().LJIILL(storyStreakEnterEditParam);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLJIILL = "";
        }
        DialogC1389620mGW dialogC1389620mGW2 = this.LIZ;
        if (dialogC1389620mGW2 != null) {
            C0FNV.LIZ(dialogC1389620mGW2);
        }
        this.LIZ = null;
        C126I.LIZ.getClass();
        C126I.LJI = false;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C126O(C126I.LJIILIIL, storyStreakEnterEditParam, null), 3);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//openVideoEdit");
        smartRouteBuildRoute.withParam("shoot_way", "streaks_to_story");
        smartRouteBuildRoute.withParam("media_path", str);
        smartRouteBuildRoute.withParam("creation_id", str3);
        smartRouteBuildRoute.withParam("story_streak_data", strLJIILL);
        smartRouteBuildRoute.withParam("story_streak_gif_path", str2);
        smartRouteBuildRoute.open();
        C126I.LJIILIIL = "";
        C126I.LJIIJ = "";
        C126I.LJIIJJI = "";
        C126I.LJIIIIZZ = null;
        C126I.LJIIL = false;
    }
}
