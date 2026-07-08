package com.ss.android.ugc.profile.business.ur.socialavatar.datacenter;

import X.AbstractC848400XPy;
import X.AnonymousClass0956;
import X.C01GW;
import X.C054G;
import X.C093Y;
import X.C09A1;
import X.C0HI2;
import X.C0HZ2;
import X.C0HZ5;
import X.C0HZ8;
import X.C0PEM;
import X.C0XQ7;
import X.C11PQ;
import X.C1910890zpH;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C356901a3;
import X.C436520H9u;
import X.C452501pT;
import android.os.SystemClock;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarDynamicSettingResult;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarEntranceDynamicDataSource implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final SocialAvatarEntranceDynamicDataSource LL = new SocialAvatarEntranceDynamicDataSource();
    public static final long LLILLJJLI;
    public static final C01GW LLILLL;
    public static final AtomicBoolean LLILZ;
    public static final AtomicBoolean LLILZIL;
    public static final ConcurrentHashMap<Integer, Boolean> LLILZLL;
    public static AnonymousClass0956 LLIZ;
    public static final C054G LLIZLLLIL;
    public static long LLJ;
    public static long LLJI;
    public static final HashSet<Integer> LLJIJIL;
    public static final C0HZ5 LLJILJIL;
    public static final C01GW LLJILJILJ;
    public static final C01GW LLJILLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    static {
        long millis = TimeUnit.MINUTES.toMillis(10L);
        LLILLJJLI = millis;
        LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(372));
        LLILZ = new AtomicBoolean(false);
        LLILZIL = new AtomicBoolean(true);
        LLILZLL = new ConcurrentHashMap<>();
        LLIZLLLIL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
        LLJ = -1L;
        LLJI = millis;
        HashSet hashSetLIZJ = C093Y.LIZJ(Integer.valueOf(C0HZ2.STABLE_DM_FAVORITE_TAB_ACTION_SHEET.getValue()), Integer.valueOf(C0HZ2.STABLE_DM_INLINE_MESSAGE.getValue()), Integer.valueOf(C0HZ2.STABLE_DM_STICKER_DETAIL_PANEL.getValue()), Integer.valueOf(C0HZ2.STABLE_DM_STICKER_REACTION_BAR.getValue()), Integer.valueOf(C0HZ2.STABLE_EDIT_PROFILE_ACTION_SHEET.getValue()), Integer.valueOf(C0HZ2.STABLE_ENLARGE_AVATAR_OTHERS.getValue()), Integer.valueOf(C0HZ2.STABLE_ENLARGE_AVATAR_SELF.getValue()), Integer.valueOf(C0HZ2.STABLE_STORY_REACTION_TAB.getValue()), Integer.valueOf(C0HZ2.STABLE_OTHERS_PROFILE_FLOATING_NOTICE.getValue()));
        HashSet hashSetLIZJ2 = C093Y.LIZJ(Integer.valueOf(C0HZ2.PROMO_DM_CARD_MESSAGES.getValue()), Integer.valueOf(C0HZ2.PROMO_DM_FAVORITE_TAB_BANNER.getValue()), Integer.valueOf(C0HZ2.PROMO_EDIT_PROFILE_BANNER.getValue()), Integer.valueOf(C0HZ2.PROMO_ICON_FLIP.getValue()), Integer.valueOf(C0HZ2.PROMO_PROFILE_FLOATING_NOTICE.getValue()));
        HashSet hashSetLIZJ3 = C093Y.LIZJ(Integer.valueOf(C0HZ2.DM_AI_MOJI_COMPATIBILITY.getValue()));
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(hashSetLIZJ);
        hashSet.addAll(hashSetLIZJ2);
        hashSet.addAll(hashSetLIZJ3);
        LLJIJIL = hashSet;
        LLJILJIL = C0HZ5.LL;
        LLJILJILJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(370));
        LLJILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(371));
    }

    public final C1910890zpH LIZLLL() {
        return (C1910890zpH) LLILLL.getValue();
    }

    public static boolean LIZIZ(int i) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SocialAvatarDefaultEntranceStatusModel socialAvatarDefaultEntranceStatusModel = C0HZ8.LIZ;
        SocialAvatarDefaultEntranceStatusModel socialAvatarDefaultEntranceStatusModel2 = (SocialAvatarDefaultEntranceStatusModel) settingsManagerLIZLLL.LJIIIIZZ("social_avatar_default_entrance_status", SocialAvatarDefaultEntranceStatusModel.class, socialAvatarDefaultEntranceStatusModel);
        if (socialAvatarDefaultEntranceStatusModel2 != null) {
            socialAvatarDefaultEntranceStatusModel = socialAvatarDefaultEntranceStatusModel2;
        }
        if (i == C0HZ2.STABLE_DM_FAVORITE_TAB_ACTION_SHEET.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.dmFavTabActionSheet;
        }
        if (i == C0HZ2.STABLE_DM_INLINE_MESSAGE.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.dmInlineMsg;
        }
        if (i == C0HZ2.STABLE_DM_STICKER_DETAIL_PANEL.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.dmStickerDetail;
        }
        if (i == C0HZ2.STABLE_DM_STICKER_REACTION_BAR.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.dmReaction;
        }
        if (i == C0HZ2.STABLE_EDIT_PROFILE_ACTION_SHEET.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.editProfileActionSheet;
        }
        if (i == C0HZ2.STABLE_ENLARGE_AVATAR_OTHERS.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.enlargeAvatarOthers;
        }
        if (i == C0HZ2.STABLE_ENLARGE_AVATAR_SELF.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.enlargeAvatarSelf;
        }
        if (i == C0HZ2.STABLE_STORY_REACTION_TAB.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.storyReaction;
        }
        if (i == C0HZ2.STABLE_OTHERS_PROFILE_FLOATING_NOTICE.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.othersProfileFloatingNotice;
        }
        if (i == C0HZ2.PROMO_DM_CARD_MESSAGES.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.dmCardMessage;
        }
        if (i == C0HZ2.PROMO_DM_FAVORITE_TAB_BANNER.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.dmFavTabBanner;
        }
        if (i == C0HZ2.PROMO_EDIT_PROFILE_BANNER.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.editProfileBanner;
        }
        if (i == C0HZ2.PROMO_ICON_FLIP.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.iconFlip;
        }
        if (i == C0HZ2.PROMO_PROFILE_FLOATING_NOTICE.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.profileFloatingNotice;
        }
        if (i == C0HZ2.DM_AI_MOJI_COMPATIBILITY.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.aiMojiCompatibility;
        }
        if (i == C0HZ2.EDIT_PROFILE_TWO_HEADER_SHEET_REGENERATE.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.editProfileTwoHeaderSheetRegenerate;
        }
        if (i == C0HZ2.REVIEW_PAGE_REGENERATE.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.reviewPageRegenerate;
        }
        if (i == C0HZ2.GENERATE_FAILURE_IN_APP_PUSH_RETRY.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.failurePushRetry;
        }
        if (i == C0HZ2.GENERATE_FAILURE_EDIT_PROFILE_PROGRESS_BANNER.getValue()) {
            return socialAvatarDefaultEntranceStatusModel.editProfileFailureBanner;
        }
        return false;
    }

    public final boolean LIZJ(C0HZ2 c0hz2) {
        boolean zLIZIZ;
        if (LLILZIL.get()) {
            C1910890zpH c1910890zpHLIZLLL = LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getEntranceEnabled for scene ");
            sbLIZ.append(c0hz2);
            sbLIZ.append(", isFetchFirstTimeInAppLifeCycle is true, result is ");
            sbLIZ.append(LIZIZ(c0hz2.getValue()));
            c1910890zpHLIZLLL.LIZ("DynamicEntranceSetting", C2188811AlT.LIZIZ(sbLIZ));
            return LIZIZ(c0hz2.getValue());
        }
        C1910890zpH c1910890zpHLIZLLL2 = LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getEntranceEnabled for scene ");
        sbLIZ2.append(c0hz2);
        sbLIZ2.append(", isFetchFirstTimeInAppLifeCycle is false, result is ");
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = LLILZLL;
        Boolean bool = concurrentHashMap.get(Integer.valueOf(c0hz2.getValue()));
        if (bool != null) {
            zLIZIZ = bool.booleanValue();
        } else {
            zLIZIZ = LIZIZ(c0hz2.getValue());
        }
        sbLIZ2.append(zLIZIZ);
        c1910890zpHLIZLLL2.LIZ("DynamicEntranceSetting", C2188811AlT.LIZIZ(sbLIZ2));
        Boolean bool2 = concurrentHashMap.get(Integer.valueOf(c0hz2.getValue()));
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return LIZIZ(c0hz2.getValue());
    }

    public final void LJ(boolean z) {
        Integer numValueOf;
        C1910890zpH c1910890zpHLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarEntranceDynamicDataSource launchPollingJob, currentAwaitPollingJob is ");
        sbLIZ.append(LLIZ);
        sbLIZ.append(", with hashcode ");
        AnonymousClass0956 anonymousClass0956 = LLIZ;
        if (anonymousClass0956 != null) {
            numValueOf = Integer.valueOf(anonymousClass0956.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", isFirstTime is ");
        sbLIZ.append(z);
        c1910890zpHLIZLLL.LIZ("DynamicEntranceSetting", C2188811AlT.LIZIZ(sbLIZ));
        if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId() != null && !Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), CardStruct.IStatusCode.DEFAULT)) {
            AnonymousClass0956 anonymousClass09562 = LLIZ;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            LLIZ = null;
            LLIZ = C23250099c.LIZLLL(LLIZLLLIL, null, null, new C436520H9u(z, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(boolean r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarEntranceDynamicDataSource.LIZ(boolean, X.05Vn):java.lang.Object");
    }

    public final void LJFF(SocialAvatarDynamicSettingResult socialAvatarDynamicSettingResult, boolean z) {
        Map<String, Boolean> map;
        boolean zBooleanValue;
        if (socialAvatarDynamicSettingResult != null && (map = socialAvatarDynamicSettingResult.entranceSettings) != null) {
            Boolean bool = map.get(String.valueOf(C0HZ2.PROMO_ICON_FLIP.getValue()));
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (z) {
                LL.getClass();
                ((C11PQ) LLJILLL.getValue()).onNext(new C0HI2(true, zBooleanValue));
            }
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                String key = entry.getKey();
                boolean zBooleanValue2 = entry.getValue().booleanValue();
                try {
                    if (LLJIJIL.contains(Integer.valueOf(CastIntegerProtector.parseInt(key)))) {
                        LLILZLL.put(Integer.valueOf(CastIntegerProtector.parseInt(key)), Boolean.valueOf(zBooleanValue2));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1910890zpH c1910890zpHLIZLLL = LL.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("parse key ");
                    sbLIZ.append(key);
                    sbLIZ.append(" error for exception as ");
                    sbLIZ.append(e);
                    c1910890zpHLIZLLL.LIZ("DynamicEntranceSetting", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Integer> it2 = LLJIJIL.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                Integer numValueOf = Integer.valueOf(iIntValue);
                ConcurrentHashMap<Integer, Boolean> concurrentHashMap = LLILZLL;
                LL.getClass();
                concurrentHashMap.put(numValueOf, Boolean.valueOf(LIZIZ(iIntValue)));
            }
            C1910890zpH c1910890zpHLIZLLL2 = LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SocialAvatarEntranceDynamicDataSource getBackupFromLocal for time ");
            sbLIZ2.append(SystemClock.elapsedRealtime() - jElapsedRealtime);
            c1910890zpHLIZLLL2.LIZ("DynamicEntranceSetting", C2188811AlT.LIZIZ(sbLIZ2));
        }
        LLJ = SystemClock.elapsedRealtime();
        C1910890zpH c1910890zpHLIZLLL3 = LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("SocialAvatarEntranceDynamicDataSource updateFromServer, cache is ");
        sbLIZ3.append(LLILZLL);
        c1910890zpHLIZLLL3.LIZ("DynamicEntranceSetting", C2188811AlT.LIZIZ(sbLIZ3));
    }
}
