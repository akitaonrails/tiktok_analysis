package com.ss.android.ugc.aweme.story.feed.guideuploadcard;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0HBZ;
import X.C0ROF;
import X.C0ROG;
import X.C0XQ7;
import X.C23250099c;
import X.C452501pT;
import X.C471801sa;
import X.C472001sc;
import X.C472101sd;
import X.EnumC452301pR;
import X.InterfaceC497601wk;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IStoryDebugService;
import com.ss.android.ugc.aweme.story.experiment.StoryGuideUploadCardConfigModel;
import com.ss.android.ugc.aweme.story.inbox.StoryInsertCard;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideUploadCardManager implements GenericLifecycleObserver {
    public static final StoryGuideUploadCardManager LL = new StoryGuideUploadCardManager();
    public static final Map<String, Boolean> LLILLJJLI = new LinkedHashMap();
    public static final Map<String, StoryInsertCard> LLILLL = new LinkedHashMap();
    public static final Map<String, Boolean> LLILZ = new LinkedHashMap();
    public static final Map<String, Boolean> LLILZIL = new LinkedHashMap();
    public static final C01GW LLILZLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(160));
    public static final C01GW LLIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS192S0000000_6.get$arr$(332));
    public static long LLIZLLLIL;
    public static String LLJ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onBackground();
        }
    }

    public static boolean LIZ() {
        Boolean bool = (Boolean) ((LinkedHashMap) LLILLJJLI).get(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        if ((bool != null && bool.booleanValue()) || LIZLLL()) {
            return false;
        }
        C0ROF.LIZ.getClass();
        Keva keva = C0ROF.LIZIZ;
        return !keva.getBoolean(C0ROF.LIZ("shutdown_forever"), false) && keva.getLong(C0ROF.LIZ("offline_until_timestamp"), 0L) <= System.currentTimeMillis();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onBackground() {
        if (!Intrinsics.LJFF(((LinkedHashMap) LLILZ).get(LIZJ()), Boolean.TRUE) || System.currentTimeMillis() - LLIZLLLIL >= ((StoryGuideUploadCardConfigModel) C0ROG.LIZIZ.getValue()).fastScrollThresholdInMs) {
            return;
        }
        C0ROF.LIZ.getClass();
        C0ROF.LIZIZ();
    }

    public static String LIZJ() {
        return ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    }

    public static boolean LIZLLL() {
        IStoryDebugService iStoryDebugService = (IStoryDebugService) ServiceManager.get().getService(IStoryDebugService.class);
        if (iStoryDebugService != null && iStoryDebugService.LIZJ()) {
            return false;
        }
        C0ROF c0rof = C0ROF.LIZ;
        Keva keva = C0ROF.LIZIZ;
        c0rof.getClass();
        return System.currentTimeMillis() - keva.getLong(C0ROF.LIZ("visit_guide_upload_card_timestamp"), 0L) < 86400000;
    }

    public static void LIZIZ(StoryInsertCard storyInsertCard) {
        LLILLJJLI.put(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), Boolean.TRUE);
        LLILLL.put(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), storyInsertCard);
        C0HBZ c0hbz = (C0HBZ) LLIZ.getValue();
        c0hbz.getClass();
        int iCardStyle = storyInsertCard.cardStyle();
        if (iCardStyle != 1) {
            if (iCardStyle != 2) {
                if (iCardStyle != 3) {
                    if (iCardStyle == 4) {
                        c0hbz.LIZLLL = 0;
                        C23250099c.LIZLLL((InterfaceC497601wk) c0hbz.LIZ.getValue(), null, null, new C472101sd(c0hbz, storyInsertCard, null), 3);
                        return;
                    }
                    return;
                }
                c0hbz.LIZLLL = 0;
                C23250099c.LIZLLL((InterfaceC497601wk) c0hbz.LIZ.getValue(), null, null, new C471801sa(c0hbz, null), 3);
                return;
            }
            c0hbz.LIZLLL = 0;
            C23250099c.LIZLLL((InterfaceC497601wk) c0hbz.LIZ.getValue(), null, null, new C472001sc(c0hbz, storyInsertCard, null), 3);
            return;
        }
        c0hbz.LIZLLL = 2;
    }
}
