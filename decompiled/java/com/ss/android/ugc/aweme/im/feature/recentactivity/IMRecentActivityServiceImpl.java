package com.ss.android.ugc.aweme.im.feature.recentactivity;

import X.C1647606ck;
import X.C1648406cs;
import X.C1648606cu;
import X.InterfaceC1647906cn;
import X.InterfaceC1648006co;
import X.InterfaceC332260D0u;
import X.InterfaceC893360Z2w;
import android.util.ArrayMap;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.experiment.IMRecentActivityConfig;
import com.ss.android.ugc.aweme.im.feature.recentactivity.IMRecentActivityServiceImpl;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature;
import com.ss.android.ugc.aweme.setting.serverpush.model.InAppPushSetting;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IMRecentActivityServiceImpl implements IMRecentActivityService {
    public static final /* synthetic */ int LJI = 0;
    public final Map<String, C1648406cs> LIZIZ = new LinkedHashMap();
    public final Map<String, InterfaceC332260D0u<Set<String>>> LIZJ = new LinkedHashMap();
    public final Set<String> LIZLLL = new LinkedHashSet();
    public final C1648606cu LJ = C1648606cu.LIZ;
    public final C1647606ck LJFF = new InterfaceC1648006co() { // from class: X.06ck
        public Function0<Unit> LIZ;

        @Override // X.InterfaceC1648006co
        public final void LIZ() {
            this.LIZ = null;
        }

        @Override // X.InterfaceC1648006co
        public final void LIZJ() {
        }

        @Override // X.InterfaceC1648006co
        public final void LIZLLL(SessionInfo sessionInfo) {
            Function0<Unit> function0 = this.LIZ;
            if (function0 != null) {
                function0.invoke();
            }
            this.LIZ = null;
            FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpiForReal(FakeMsgOperatorService.class);
            if (fakeMsgOperatorService != null) {
                String conversationId = sessionInfo.getConversationId();
                String uuid = sessionInfo.getUuid();
                C1684506ih c1684506ih = new C1684506ih();
                c1684506ih.LIZJ = "fake-msg-recent-activity";
                c1684506ih.LIZLLL(31);
                fakeMsgOperatorService.LIZ(conversationId, c1684506ih, uuid, null);
            }
        }

        @Override // X.InterfaceC1648006co
        public final void LIZIZ(SessionInfo sessionInfo, AwS546S0100000_2 awS546S0100000_2) {
            this.LIZ = awS546S0100000_2;
            FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpiForReal(FakeMsgOperatorService.class);
            if (fakeMsgOperatorService != null) {
                String conversationId = sessionInfo.getConversationId();
                String uuid = sessionInfo.getUuid();
                C1684506ih c1684506ih = new C1684506ih();
                c1684506ih.LIZJ = "fake-msg-recent-activity";
                c1684506ih.LIZLLL(31);
                fakeMsgOperatorService.LIZIZ(conversationId, c1684506ih, uuid, null, null);
            }
        }
    };

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService
    public final InterfaceC1648006co LIZIZ() {
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService
    public final InterfaceC893360Z2w LIZJ() {
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService
    public final InterfaceC1647906cn LIZ(final String str) {
        return new InterfaceC1647906cn(str, this) { // from class: X.06cr
            public final C0Z55 LIZ;
            public final /* synthetic */ String LIZIZ;
            public final /* synthetic */ IMRecentActivityServiceImpl LIZJ;

            public final String LJIIIIZZ() {
                InAppPushSetting inAppPushSettingLJIILIIL;
                String str2 = this.LIZIZ;
                PushFeature pushFeatureLIZ = PushFeature.LIZ.LIZ();
                if (pushFeatureLIZ == null || (inAppPushSettingLJIILIIL = pushFeatureLIZ.LJIILIIL()) == null || inAppPushSettingLJIILIIL.inAppFriendsPostPush == 1) {
                    return str2;
                }
                return null;
            }

            @Override // X.InterfaceC1647906cn
            public final void dismiss() {
                Map<String, C1648406cs> map = this.LIZJ.LIZIZ;
                C19719512Dh.LIZJ(map).remove(LJIIIIZZ());
            }

            @Override // X.InterfaceC1647906cn
            public final C05YD<Set<String>> LJFF() {
                Object value;
                String strLJIIIIZZ = LJIIIIZZ();
                if (strLJIIIIZZ == null) {
                    return C1BNE.LIZ(C08CX.INSTANCE);
                }
                C05YD<Set<String>> c05yd = (C05YD) ((LinkedHashMap) this.LIZJ.LIZJ).get(strLJIIIIZZ);
                if (c05yd != null) {
                    return c05yd;
                }
                C1648406cs c1648406cs = (C1648406cs) ((LinkedHashMap) this.LIZJ.LIZIZ).get(strLJIIIIZZ);
                if (c1648406cs == null || (value = c1648406cs.LIZIZ.getValue()) == null) {
                    value = C08CX.INSTANCE;
                }
                C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(value);
                this.LIZJ.LIZJ.put(strLJIIIIZZ, c2252321DDqLIZ);
                return c2252321DDqLIZ;
            }

            @Override // X.InterfaceC1647906cn
            public final InterfaceC893280Z2o LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1647906cn
            public final void LIZIZ(String str2) {
                C1648406cs c1648406cs;
                String strLJIIIIZZ = LJIIIIZZ();
                if (strLJIIIIZZ != null && (c1648406cs = (C1648406cs) ((LinkedHashMap) this.LIZJ.LIZIZ).get(strLJIIIIZZ)) != null) {
                    ((Set) c1648406cs.LIZIZ.getValue()).remove(str2);
                    long jLJII = C0YNP.LJII(str2);
                    if (jLJII != -1) {
                        c1648406cs.LIZ.remove(String.valueOf(jLJII));
                    }
                }
            }

            @Override // X.InterfaceC1647906cn
            public final C069H LIZJ(SessionInfo sessionInfo) {
                if (LJ(sessionInfo.getConversationId()) == null) {
                    return C069H.NONE;
                }
                if (Intrinsics.LJFF(sessionInfo.getEnterFromForMob(), "notification_page")) {
                    return C069H.P0;
                }
                return C069H.P1;
            }

            @Override // X.InterfaceC1647906cn
            public final C1722406oo LIZLLL(String str2) {
                C1648406cs c1648406cs;
                String strLJIIIIZZ = LJIIIIZZ();
                if (strLJIIIIZZ != null && (c1648406cs = (C1648406cs) ((LinkedHashMap) this.LIZJ.LIZIZ).get(strLJIIIIZZ)) != null) {
                    return c1648406cs.LIZ(str2);
                }
                return null;
            }

            @Override // X.InterfaceC1647906cn
            public final C1722406oo LJ(String str2) {
                C1648406cs c1648406cs;
                C0Y8T c0y8tLJ;
                String strLJIIIIZZ = LJIIIIZZ();
                if (strLJIIIIZZ != null && (c1648406cs = (C1648406cs) ((LinkedHashMap) this.LIZJ.LIZIZ).get(strLJIIIIZZ)) != null && ((Set) c1648406cs.LIZIZ.getValue()).contains(str2) && (c0y8tLJ = C0YNP.LIZIZ(str2).LJ()) != null && c0y8tLJ.getUnreadCount() == 0) {
                    return c1648406cs.LIZ(str2);
                }
                return null;
            }

            @Override // X.InterfaceC1647906cn
            public final void LJI(List<C1722406oo> list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("New activities count = ");
                sbLIZ.append(((ArrayList) list).size());
                sbLIZ.append(" for userId = ");
                sbLIZ.append(this.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                if (this.LIZIZ == null) {
                    return;
                }
                C1648406cs c1648406cs = new C1648406cs(list);
                this.LIZJ.LIZIZ.put(this.LIZIZ, c1648406cs);
                InterfaceC332260D0u<Set<String>> interfaceC332260D0uRemove = this.LIZJ.LIZJ.remove(this.LIZIZ);
                if (interfaceC332260D0uRemove != null) {
                    Set<String> set = (Set) c1648406cs.LIZIZ.getValue();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Notify observers inbox conversation update size ");
                    sbLIZ2.append(set.size());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    interfaceC332260D0uRemove.setValue(set);
                }
            }

            @Override // X.InterfaceC1647906cn
            public final void LJII(String str2) {
                C1722406oo c1722406ooLIZLLL;
                EnumC461080I6g enumC461080I6g;
                if (this.LIZJ.LIZLLL.add(str2) && (c1722406ooLIZLLL = LIZLLL(str2)) != null && (enumC461080I6g = c1722406ooLIZLLL.activityType) != null) {
                    this.LIZJ.LJ.getClass();
                    ArrayMap<String, String> arrayMapLIZ = C1648506ct.LIZ(new Pair("activity_type", C1648606cu.LJI(enumC461080I6g)));
                    C0I0B.LJFF.LIZIZ();
                    C20684815ws.LJIILLIIL("show_activity_hint", arrayMapLIZ);
                }
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0Z55] */
            {
                this.LIZIZ = str;
                this.LIZJ = this;
                this.LIZ = new InterfaceC893280Z2o(str) { // from class: X.0Z55
                    public final Keva LIZ;
                    public final C01GW LIZIZ;
                    public boolean LIZJ;

                    @Override // X.InterfaceC893280Z2o
                    public final void LIZIZ() {
                        this.LIZJ = false;
                        if (this.LIZ.getLong("next_time_display_timestamp", 0L) > System.currentTimeMillis()) {
                            return;
                        }
                        this.LIZ.storeInt("display_count", this.LIZ.getInt("display_count", 0) + 1);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("displayCount is now ");
                        sbLIZ.append(this.LIZ.getInt("display_count", 0));
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (this.LIZ.getInt("display_count", 0) < LJ().xDismissWithoutInteractionCount) {
                            this.LIZ.storeLong("next_time_display_timestamp", System.currentTimeMillis() + TimeUnit.DAYS.toMillis(LJ().zMinimumDaysBetweenTwoDisplay));
                            return;
                        }
                        this.LIZ.storeInt("display_count", 0);
                        this.LIZ.storeInt("dismiss_cycle", this.LIZ.getInt("dismiss_cycle", 0) + 1);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("New dismiss count ");
                        sbLIZ2.append(this.LIZ.getInt("dismiss_cycle", 0));
                        C2188811AlT.LIZIZ(sbLIZ2);
                        if (this.LIZ.getInt("dismiss_cycle", 0) >= LJ().kTotalDismissCycleCount) {
                            this.LIZ.storeLong("next_time_display_timestamp", Long.MAX_VALUE);
                        } else {
                            this.LIZ.storeLong("next_time_display_timestamp", System.currentTimeMillis() + TimeUnit.DAYS.toMillis(LJ().yCooldownDaysAfterOneCycle));
                        }
                    }

                    @Override // X.InterfaceC893280Z2o
                    public final void LIZJ() {
                        this.LIZ.storeInt("display_count", 0);
                        this.LIZ.storeInt("dismiss_cycle", 0);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        TimeUnit timeUnit = TimeUnit.DAYS;
                        this.LIZ.storeLong("next_time_display_timestamp", jCurrentTimeMillis + timeUnit.toMillis(LJ().zMinimumDaysBetweenTwoDisplay));
                        this.LIZ.storeLong("next_time_fetch_api_timestamp", System.currentTimeMillis() + timeUnit.toMillis(LJ().zMinimumDaysBetweenTwoDisplay));
                    }

                    public final IMRecentActivityConfig LJ() {
                        return (IMRecentActivityConfig) this.LIZIZ.getValue();
                    }

                    @Override // X.InterfaceC893280Z2o
                    public final boolean canShowBanner() {
                        PushFeature pushFeatureLIZ = PushFeature.LIZ.LIZ();
                        InAppPushSetting inAppPushSettingLJIILIIL = pushFeatureLIZ != null ? pushFeatureLIZ.LJIILIIL() : null;
                        return (inAppPushSettingLJIILIIL == null || inAppPushSettingLJIILIIL.inAppFriendsPostPush == 1) && ((IMRecentActivityConfig) C0Z57.LIZIZ.getValue()).enabled == 1 && System.currentTimeMillis() > this.LIZ.getLong("next_time_display_timestamp", 0L) && this.LIZJ;
                    }

                    @Override // X.InterfaceC893280Z2o
                    public final void LIZ() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Api returned, will not call the api again until ");
                        sbLIZ.append(LJ().fetchIntervalHours);
                        sbLIZ.append(" hours");
                        C2188811AlT.LIZIZ(sbLIZ);
                        this.LIZ.storeLong("next_time_fetch_api_timestamp", System.currentTimeMillis() + TimeUnit.HOURS.toMillis(LJ().fetchIntervalHours));
                    }

                    @Override // X.InterfaceC893280Z2o
                    public final boolean LIZLLL() {
                        boolean z = canShowBanner() && System.currentTimeMillis() > this.LIZ.getLong("next_time_fetch_api_timestamp", 0L);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("can Fetch the api ");
                        sbLIZ.append(z);
                        C2188811AlT.LIZIZ(sbLIZ);
                        return z;
                    }

                    {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("recent_activity_keva_{");
                        sbLIZ.append(str);
                        sbLIZ.append('}');
                        this.LIZ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
                        this.LIZIZ = C452501pT.LIZIZ(new C0Z56());
                        this.LIZJ = true;
                    }
                };
            }
        };
    }
}
