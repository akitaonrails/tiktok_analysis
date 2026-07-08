package com.ss.android.ugc.aweme.story.reveal;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C01KV;
import X.C098200Yq;
import X.C0AV0;
import X.C0XQ7;
import X.C11JF;
import X.C13BV;
import X.C1618440sDa;
import X.C1689500u4C;
import X.C1697810uHb;
import X.C189200o6;
import X.C1906580ziK;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C717450SCh;
import X.C717460SCi;
import X.C727150Sfh;
import X.C727950Sgz;
import X.C728000Sh4;
import X.C728010Sh5;
import X.C728260ShU;
import X.C735840Sti;
import X.EnumC1231540i9Y;
import X.EnumC717440SCg;
import X.InterfaceC586170Myt;
import X.InterfaceC729460SjQ;
import Y.AfS171S0100000_2;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.IUpdateSettingService;
import com.ss.android.ugc.aweme.story.reveal.StoryRevealServiceImpl;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryRevealServiceImpl implements IStoryRevealService {
    public static final Map<String, Boolean> LJIIL = Collections.synchronizedMap(new LinkedHashMap());
    public boolean LJ;
    public String LJFF;
    public volatile boolean LJI;
    public C11JF LJII;
    public boolean LJIIIZ;
    public final C1689500u4C LIZ = new C1689500u4C();
    public final C728000Sh4 LIZIZ = new C728000Sh4();
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(678));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(679));
    public final Set<String> LJIIIIZZ = Collections.synchronizedSet(new LinkedHashSet());
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(204));
    public String LJIIJJI = C0XQ7.LJFF().getCurUserId();

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final synchronized EnumC717440SCg LIZIZ() {
        if (this.LJIIIZ) {
            return EnumC717440SCg.AUTO_FIRST_POST;
        }
        return LJJII();
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final synchronized void LJII() {
        if (C0AV0.LIZ()) {
            String strLJJI = LJJI("last_notification_engaged_time_");
            if (strLJJI.length() == 0) {
                return;
            }
            LJIJ().storeLong(strLJJI, System.currentTimeMillis());
        }
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final synchronized void LJIIIIZZ() {
        if (C0AV0.LIZ()) {
            String strLJJI = LJJI("first_reveal_notification_shown_time_");
            if (strLJJI.length() == 0 || LJIJ().contains(strLJJI)) {
                return;
            }
            LJIJ().storeLong(strLJJI, System.currentTimeMillis());
        }
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final synchronized long LJIIIZ() {
        return this.LIZIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final void LJIIJJI() {
        C727950Sgz.LIZIZ = true;
        C23250099c.LIZLLL(C727950Sgz.LIZLLL, null, null, new C01KV(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final synchronized boolean LJIILIIL() {
        return this.LIZIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final void LJIILL() {
        this.LJI = false;
        this.LJIIIIZZ.clear();
    }

    public final synchronized void LJIL() {
        if (C0AV0.LIZ()) {
            String strLJJI = LJJI("last_reveal_publish_time_");
            if (strLJJI.length() > 0) {
                LJIJ().storeLong(strLJJI, System.currentTimeMillis());
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_published_story_reveal_");
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        sbLIZ.append(curUserId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(strLIZIZ, "has_published_story_reveal_")) {
            return;
        }
        if (!((Keva) this.LIZJ.getValue()).getBoolean(strLIZIZ, false)) {
            ((Keva) this.LIZJ.getValue()).storeBoolean(strLIZIZ, true);
            this.LJIIIZ = true;
        }
        this.LIZIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final void LJFF() {
        boolean z = C727950Sgz.LIZ;
        C728010Sh5.LIZ.getClass();
        if (C728010Sh5.LIZIZ() && !C727950Sgz.LIZ) {
            C727950Sgz.LIZ = true;
            C1906580ziK.LIZJ().LIZ().LJLLLLLL(C727950Sgz.LIZJ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSkylightRefreshed, localUnlockState=");
        sbLIZ.append(LJIJI());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final boolean LJI() {
        boolean z = this.LJ;
        if (z) {
            this.LJ = false;
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final void LJIIJ() {
        String strLIZIZ;
        C728000Sh4 c728000Sh4 = this.LIZIZ;
        synchronized (c728000Sh4) {
            try {
                strLIZIZ = C728000Sh4.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (Intrinsics.LJFF(strLIZIZ, "display_promo_cell_timestamps_")) {
                return;
            }
            c728000Sh4.LIZJ().storeString(strLIZIZ, String.valueOf(System.currentTimeMillis()));
        }
    }

    public final Keva LJIJ() {
        return (Keva) this.LIZLLL.getValue();
    }

    public final void LJJ() {
        C11JF c11jf = this.LJII;
        if (c11jf == null || c11jf.isDisposed()) {
            this.LJII = (C11JF) C727150Sfh.LIZLLL.LIZLLL().LJJLL(new AfS171S0100000_2(this, 20), new AfS171S0100000_2(this, 21));
        }
    }

    public StoryRevealServiceImpl() {
        LJJ();
        C1618440sDa.LIZIZ.LJJIFFI().LJII("story_reveal_publish_observer", new InterfaceC729460SjQ() { // from class: X.0Sgy
            @Override // X.InterfaceC729460SjQ
            public final void LIZJ(float f) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LIZLLL(String str) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LJI(C729450SjP c729450SjP, String str) {
            }

            @Override // X.InterfaceC729460SjQ
            public final void LJFF() {
                Object c098200Yq;
                try {
                    this.LIZ.LJJIFFI("publish_total_finish");
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("observePublishEvents onTotalFinish failed: ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }

            @Override // X.InterfaceC729460SjQ
            public final void LJ(String str) {
                Object c098200Yq;
                try {
                    this.LIZ.LJJIFFI("publish_delete");
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("observePublishEvents onDelete failed: ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }

            @Override // X.InterfaceC729460SjQ
            public final void LIZ(String str, C0SPF c0spf) {
                Object c098200Yq;
                StoryRevealServiceImpl storyRevealServiceImpl = this.LIZ;
                try {
                    if (Intrinsics.LJFF(c0spf.LIZ.creationId, storyRevealServiceImpl.LJFF)) {
                        storyRevealServiceImpl.LJFF = null;
                        if (c0spf.LIZIZ.LIZIZ != EnumC696090RSd.SUCCESS) {
                            storyRevealServiceImpl.LJ = false;
                        }
                    }
                    storyRevealServiceImpl.LJJIFFI("publish_finish");
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("observePublishEvents onFinish failed: ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }

            @Override // X.InterfaceC729460SjQ
            public final void LIZIZ(EnumC729410SjL enumC729410SjL, String str) {
                Object c098200Yq;
                C729450SjP c729450SjP;
                Aweme aweme;
                StoryRevealServiceImpl storyRevealServiceImpl = this.LIZ;
                try {
                    if (str == null) {
                        storyRevealServiceImpl.getClass();
                    } else {
                        C0SPF c0spfLJIIJ = ((InterfaceC1593650rZb) storyRevealServiceImpl.LJIIJ.getValue()).LJIIJ(str);
                        if (c0spfLJIIJ != null && (c729450SjP = c0spfLJIIJ.LIZIZ) != null && (aweme = c729450SjP.LJ) != null && aweme.getAwemeType() == 46) {
                            storyRevealServiceImpl.LJIL();
                        }
                    }
                    storyRevealServiceImpl.LJJIFFI("publish_start");
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("observePublishEvents onStart failed: ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        });
        LJJIFFI("init");
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0Sh1
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                String uid;
                if (!z) {
                    return;
                }
                if (user != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                if (!Intrinsics.LJFF(this.LL.LJIIJJI, uid)) {
                    StoryRevealServiceImpl storyRevealServiceImpl = this.LL;
                    storyRevealServiceImpl.LJIIIIZZ.clear();
                    storyRevealServiceImpl.LJIIIZ = false;
                    storyRevealServiceImpl.LJ = false;
                    storyRevealServiceImpl.LJI = false;
                    storyRevealServiceImpl.LJFF = null;
                    storyRevealServiceImpl.LJJIFFI("account_switch");
                }
                this.LL.LJIIJJI = uid;
            }
        });
    }

    public static boolean LJIJI() {
        String strLJIJJ = LJIJJ();
        if (strLJIJJ.length() == 0) {
            return false;
        }
        return Intrinsics.LJFF(LJIIL.get(strLJIJJ), Boolean.TRUE);
    }

    public static String LJIJJ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_active_reveal_story_");
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final boolean LJ() {
        return LJIJI();
    }

    public final EnumC717440SCg LJJII() {
        boolean z;
        long j;
        boolean z2;
        if (!C0AV0.LIZ()) {
            return null;
        }
        String strLJJI = LJJI("phase_out_popup_ever_shown_");
        boolean z3 = true;
        if (strLJJI.length() > 0 && LJIJ().getBoolean(strLJJI, false)) {
            return null;
        }
        String strLJJI2 = LJJI("first_reveal_notification_shown_time_");
        if (strLJJI2.length() == 0 || !LJIJ().contains(strLJJI2)) {
            return null;
        }
        long j2 = 0;
        long j3 = LJIJ().getLong(strLJJI2, 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strLJJI3 = LJJI("last_notification_engaged_time_");
        if (strLJJI3.length() <= 0 || !LJIJ().contains(strLJJI3)) {
            z = false;
            j = 0;
        } else {
            z = true;
            j = LJIJ().getLong(strLJJI3, 0L);
        }
        String strLJJI4 = LJJI("last_reveal_publish_time_");
        if (strLJJI4.length() <= 0 || !LJIJ().contains(strLJJI4)) {
            z2 = false;
        } else {
            z2 = true;
            j2 = LJIJ().getLong(strLJJI4, 0L);
        }
        if (z) {
            boolean z4 = jCurrentTimeMillis - j >= 604800000;
            if (!z || (z2 ? jCurrentTimeMillis - j2 < 1296000000 : jCurrentTimeMillis - j < 1296000000)) {
                z3 = false;
            }
            if (!z4 && !z3) {
                return null;
            }
        } else if (jCurrentTimeMillis - j3 < 604800000) {
            return null;
        }
        return EnumC717440SCg.AUTO_PHASE_OUT;
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final boolean LJIILJJIL() {
        return this.LJI;
    }

    public static String LJJI(String str) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final boolean LIZLLL(int i) {
        if (i <= 0) {
            return false;
        }
        Set<String> set = this.LJIIIIZZ;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it2 = set.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                if (u.LJJIIJZLJL((String) it2.next(), "unlocked_", false) && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
            if (i2 >= i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJLI(java.lang.String r9) {
        /*
            r8 = this;
            X.01GW r0 = r8.LJIIJ
            java.lang.Object r0 = r0.getValue()
            X.0Sh2 r0 = (X.InterfaceC727980Sh2) r0
            java.util.List r1 = r0.LJIIIZ()
            boolean r0 = r1 instanceof java.util.Collection
            r7 = 0
            if (r0 == 0) goto L18
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L18
        L17:
            return r7
        L18:
            java.util.Iterator r6 = r1.iterator()
        L1c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r5 = r6.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.getAuthor()
            r4 = 0
            if (r0 == 0) goto L8c
            java.lang.String r0 = r0.getUid()
        L33:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r9)
            if (r0 != 0) goto L8a
            java.lang.String r0 = r5.getAid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r9)
            if (r0 != 0) goto L8a
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.getAuthor()
            if (r0 == 0) goto L88
            java.lang.String r0 = r0.getUid()
        L4d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r9)
            if (r0 != 0) goto L8a
            r3 = 0
        L54:
            int r1 = r5.getAwemeType()
            r0 = 46
            if (r1 != r0) goto L86
            r2 = 1
        L5d:
            java.lang.String r1 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getScheduleId(r5)
            if (r1 == 0) goto L73
            X.01GW r0 = r8.LJIIJ
            java.lang.Object r0 = r0.getValue()
            X.0Sh2 r0 = (X.InterfaceC727980Sh2) r0
            X.0SjP r0 = r0.LIZLLL(r1)
            if (r0 == 0) goto L73
            X.0RSd r4 = r0.LIZIZ
        L73:
            X.0RSd r0 = X.EnumC696090RSd.FAILED
            if (r4 == r0) goto L84
            X.0RSd r0 = X.EnumC696090RSd.CANCEL
            if (r4 == r0) goto L84
            r0 = 0
        L7c:
            if (r3 == 0) goto L1c
            if (r2 == 0) goto L1c
            if (r0 != 0) goto L1c
            r7 = 1
            return r7
        L84:
            r0 = 1
            goto L7c
        L86:
            r2 = 0
            goto L5d
        L88:
            r0 = r4
            goto L4d
        L8a:
            r3 = 1
            goto L54
        L8c:
            r0 = r4
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.reveal.StoryRevealServiceImpl.LJIJJLI(java.lang.String):boolean");
    }

    public final void LJJIFFI(String str) {
        Object c098200Yq;
        List<Aweme> stories;
        boolean z;
        boolean z2;
        UserStory userStory;
        try {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (curUserId == null) {
                return;
            }
            Aweme awemeLJIIIIZZ = C1618440sDa.LIZIZ.LJJLIIIJLJLI().LJIIIIZZ();
            if (awemeLJIIIIZZ == null || (userStory = awemeLJIIIIZZ.getUserStory()) == null || (stories = userStory.getStories()) == null) {
                stories = C13BV.INSTANCE;
            }
            if (!(stories instanceof Collection) || !stories.isEmpty()) {
                Iterator<Aweme> it2 = stories.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getAwemeType() == 46) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            boolean zLJIJJLI = LJIJJLI(curUserId);
            if (!z && !zLJIJJLI) {
                z2 = false;
            } else {
                z2 = true;
            }
            String strLJIJJ = LJIJJ();
            if (strLJIJJ.length() != 0) {
                LJIIL.put(strLJIJJ, Boolean.valueOf(z2));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recomputeHasActiveRevealStory(");
            sbLIZ.append(str);
            sbLIZ.append("), self=");
            sbLIZ.append(z);
            sbLIZ.append(", publish=");
            sbLIZ.append(zLJIJJLI);
            C2188811AlT.LIZIZ(sbLIZ);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("recomputeHasActiveRevealStory(");
            sbLIZ2.append(str);
            sbLIZ2.append(") failed: ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final synchronized void LIZJ(String str, EnumC1231540i9Y enumC1231540i9Y) {
        this.LIZIZ.LJIIIZ();
        C735840Sti c735840Sti = C735840Sti.LIZ;
        String mobValue = enumC1231540i9Y.getMobValue();
        c735840Sti.getClass();
        C20684815ws.LJIILLIIL("ttsocial_story_reveal_banner_show", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("enter_method", mobValue)));
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final void LJIIL(String str, boolean z) {
        String str2;
        Set<String> set = this.LJIIIIZZ;
        if (z) {
            str2 = "unlocked_";
        } else {
            str2 = "locked_";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(str);
        set.add(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final void LJIILLIIL(String str, boolean z) {
        this.LJFF = str;
        if (z) {
            this.LJ = true;
            this.LJI = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStoryRevealPublish, isFromUnlock=");
        sbLIZ.append(z);
        sbLIZ.append(", unlockPendingServerRefresh=");
        sbLIZ.append(this.LJI);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSocialProof(int r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.story.model.TiktokV1StoryGetSocialProofResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C727960Sh0
            if (r0 == 0) goto L20
            r4 = r7
            X.0Sh0 r4 = (X.C727960Sh0) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3c
        L20:
            X.0Sh0 r4 = new X.0Sh0
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.story.api.StoryApi r0 = com.ss.android.ugc.aweme.story.api.StoryApi.LIZIZ     // Catch: java.lang.Exception -> L42
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L42
            java.lang.Object r3 = r0.getSocialProof(r6, r4)     // Catch: java.lang.Exception -> L42
            if (r3 != r2) goto L3f
            return r2
        L3c:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L42
        L3f:
            com.ss.android.ugc.aweme.story.model.TiktokV1StoryGetSocialProofResponse r3 = (com.ss.android.ugc.aweme.story.model.TiktokV1StoryGetSocialProofResponse) r3     // Catch: java.lang.Exception -> L42
            return r3
        L42:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.reveal.StoryRevealServiceImpl.getSocialProof(int, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final synchronized void LJIIZILJ(String str, String str2, boolean z) {
        if (str.length() == 0) {
            return;
        }
        C1618440sDa.LIZIZ.LJJIIJ().LIZIZ(Boolean.valueOf(z), str, str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportRevealStoryViewed: ");
        sbLIZ.append(str);
        sbLIZ.append(", unlocked=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealService
    public final boolean LIZ(C19EG c19eg, String str, EnumC717440SCg enumC717440SCg, Function0<Unit> function0) {
        IUpdateSettingService iUpdateSettingService;
        ISettingService iSettingService;
        boolean z;
        if (enumC717440SCg == EnumC717440SCg.AUTO_PHASE_OUT && !C0AV0.LIZ()) {
            if (function0 != null) {
                function0.invoke();
            }
            return false;
        }
        IPushSettingService iPushSettingService = (IPushSettingService) PluggableExtentionKt.pluggableSpi$default(IPushSettingService.class, false, false, false, 14, null);
        if (iPushSettingService == null || (iUpdateSettingService = (IUpdateSettingService) PluggableExtentionKt.pluggableSpi$default(IUpdateSettingService.class, false, false, false, 14, null)) == null || (iSettingService = (ISettingService) PluggableExtentionKt.pluggableSpi$default(ISettingService.class, false, false, false, 14, null)) == null) {
            return false;
        }
        int i = C717450SCh.LIZ[enumC717440SCg.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            z = false;
        } else {
            z = true;
        }
        C1689500u4C c1689500u4C = this.LIZ;
        String mobValue = enumC717440SCg.getMobValue();
        C717460SCi c717460SCi = new C717460SCi(str, enumC717440SCg, z, this);
        synchronized (c1689500u4C) {
            try {
                if (c1689500u4C.LIZ != null) {
                    return false;
                }
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19eg), null, null, new C728260ShU(c1689500u4C, c19eg, iPushSettingService, iUpdateSettingService, iSettingService, str, mobValue, function0, c717460SCi, null), 3);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
