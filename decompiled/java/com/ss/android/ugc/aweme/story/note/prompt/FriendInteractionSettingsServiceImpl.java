package com.ss.android.ugc.aweme.story.note.prompt;

import X.AbstractC19994813Le;
import X.C01GW;
import X.C05N6;
import X.C098200Yq;
import X.C0PEM;
import X.C1256460ink;
import X.C1256500ino;
import X.C13LP;
import X.C189200o6;
import X.C2286608xc;
import X.C2296808zG;
import X.C23250099c;
import X.C287170BNj;
import X.C287180BNk;
import X.C452501pT;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.experiment.thought.StoryThoughtHolidayConfigSettings;
import com.ss.android.ugc.aweme.story.note.prompt.FriendInteractionSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class FriendInteractionSettingsServiceImpl implements IFriendInteractionSettingsService {
    public static final /* synthetic */ int LJ = 0;
    public final C01GW LIZ;
    public final C01GW LIZIZ;
    public boolean LIZJ;
    public FriendInteractionSettings LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJI() {
        /*
            java.lang.Class<com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi> r0 = com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi r1 = (com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi) r1
            if (r1 == 0) goto L34
            android.app.Application r0 = X.C1BWL.LIZ()
            java.lang.String r1 = r1.LJIILJJIL(r0)
            if (r1 == 0) goto L35
            int r0 = r1.length()
            if (r0 == 0) goto L35
            r0 = 0
        L21:
            java.lang.String r3 = "friend_interaction_settings_"
            if (r0 != 0) goto L37
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            return r0
        L34:
            r1 = 0
        L35:
            r0 = 1
            goto L21
        L37:
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            java.lang.String r0 = X.C786410Ut5.t2(r2)
            r1.append(r0)
            r0 = 95
            r1.append(r0)
            android.util.LruCache<java.lang.Integer, java.lang.String> r0 = X.C0SRQ.LIZ
            java.lang.String r0 = X.C837920Wty.LIZIZ(r2)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.prompt.FriendInteractionSettingsServiceImpl.LJI():java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.story.note.prompt.IFriendInteractionSettingsService
    public final FriendInteractionSettingsPreloadLegoTask LIZIZ() {
        return new FriendInteractionSettingsPreloadLegoTask();
    }

    @Override // com.ss.android.ugc.aweme.story.note.prompt.IFriendInteractionSettingsService
    public final StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig LIZJ() {
        List<StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig> holidayThoughtConfigs;
        StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig storyThoughtHolidayConfig;
        if (!((Boolean) C287170BNj.LIZIZ.getValue()).booleanValue()) {
            StoryThoughtHolidayConfigSettings.LIZ.getClass();
            return (StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig) StoryThoughtHolidayConfigSettings.LIZIZ.getValue();
        }
        FriendInteractionSettings friendInteractionSettingsLJFF = LJFF();
        if (friendInteractionSettingsLJFF != null && (holidayThoughtConfigs = friendInteractionSettingsLJFF.getHolidayThoughtConfigs()) != null && (storyThoughtHolidayConfig = (StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig) C13LP.LJJJLL(holidayThoughtConfigs)) != null && C287180BNk.LIZ()) {
            long j = storyThoughtHolidayConfig.startTimeInMillisecond;
            long j2 = storyThoughtHolidayConfig.endTimeInMillisecond;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j <= jCurrentTimeMillis && jCurrentTimeMillis <= j2) {
                return storyThoughtHolidayConfig;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.note.prompt.IFriendInteractionSettingsService
    public final void LIZLLL() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1256500ino(this, null), 3);
    }

    public final FriendInteractionSettings LJFF() {
        if (this.LIZJ) {
            FriendInteractionSettings friendInteractionSettings = null;
            String string = ((Keva) this.LIZIZ.getValue()).getString(LJI(), null);
            if (string != null) {
                try {
                    friendInteractionSettings = (FriendInteractionSettings) C05N6.LIZ().getGson().LJII(string, FriendInteractionSettings.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            this.LIZLLL = friendInteractionSettings;
            this.LIZJ = false;
        }
        return this.LIZLLL;
    }

    public FriendInteractionSettingsServiceImpl() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(325));
        this.LIZ = c01gwLIZIZ;
        this.LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(677));
        ((Keva) c01gwLIZIZ.getValue()).erase("skylight_guidance_texts");
        this.LIZJ = true;
    }

    @Override // com.ss.android.ugc.aweme.story.note.prompt.IFriendInteractionSettingsService
    public final String LIZ() {
        FriendInteractionSettings.DynamicSkylightGuidance dynamicSkylightGuidance;
        List<String> list;
        FriendInteractionSettings friendInteractionSettingsLJFF = LJFF();
        if (friendInteractionSettingsLJFF == null || (dynamicSkylightGuidance = friendInteractionSettingsLJFF.getDynamicSkylightGuidance()) == null || (list = dynamicSkylightGuidance.skylightGuidanceTexts) == null) {
            return null;
        }
        return (String) C13LP.LJLJJL(list, AbstractC19994813Le.Default);
    }

    @Override // com.ss.android.ugc.aweme.story.note.prompt.IFriendInteractionSettingsService
    public final boolean LJ() {
        FriendInteractionSettings.DynamicSkylightGuidance dynamicSkylightGuidance;
        List<String> list;
        Integer numValueOf;
        FriendInteractionSettings friendInteractionSettingsLJFF = LJFF();
        return (friendInteractionSettingsLJFF == null || (dynamicSkylightGuidance = friendInteractionSettingsLJFF.getDynamicSkylightGuidance()) == null || (list = dynamicSkylightGuidance.skylightGuidanceTexts) == null || (numValueOf = Integer.valueOf(list.size())) == null || AbstractC19994813Le.Default.nextInt(numValueOf.intValue() + 1) != numValueOf.intValue()) ? false : true;
    }

    public static final FriendInteractionSettings LJII(FriendInteractionSettingsServiceImpl friendInteractionSettingsServiceImpl) {
        Object c098200Yq;
        ArrayList arrayList = new ArrayList();
        if (((Boolean) C1256460ink.LIZ.getValue()).booleanValue()) {
            arrayList.add(C2286608xc.LJ(1));
        }
        if (((Boolean) C287170BNj.LIZIZ.getValue()).booleanValue()) {
            arrayList.add(C2286608xc.LJ(2));
        }
        friendInteractionSettingsServiceImpl.getClass();
        String json = GsonProtectorUtils.toJson(C05N6.LIZ().getGson(), arrayList);
        int i = 0;
        while (true) {
            try {
                c098200Yq = FriendInteractionSettingsApi.LIZIZ.getFriendInteractionSettings(json).LJ();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m8isSuccessimpl(c098200Yq)) {
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null && (i = i + 1) >= 3) {
                    c098200Yq = null;
                    break;
                }
            } else {
                break;
            }
        }
        return (FriendInteractionSettings) c098200Yq;
    }
}
