package com.ss.android.ugc.aweme.unifiedauth.push;

import X.C06C2;
import X.C08F4;
import X.C08JS;
import X.C0O1V;
import X.C0PEM;
import X.C10DA;
import X.C10DB;
import X.C10DS;
import X.C128Y;
import X.C15438062q;
import X.C1589640rT8;
import X.C1697810uHb;
import X.C1890430zIH;
import X.C1917270zzZ;
import X.C1917280zza;
import X.C19207910Cn;
import X.C19208310Cr;
import X.C19208410Cs;
import X.C19328310jZ;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C211000rc;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C786410Ut5;
import X.C824390WVp;
import X.C827070WcT;
import X.C844470XAv;
import X.InterfaceC1593630rZZ;
import android.content.Context;
import android.os.Looper;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.unifiedauth.manager.PushUserGuidePopupManager;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthDisableEDMExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthDisablePushExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthDisableSMSExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthHybridDisablePushExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthOptimizeExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupFiltersConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PushInnerPermissionChecklist;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IPushSystemPermissionApi;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class UniAuthGuidePopupServiceImpl implements IUniAuthGuidePopupApi {
    @Override // com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi
    public final boolean LIZ() {
        PushUserGuidePopupManager pushUserGuidePopupManager = PushUserGuidePopupManager.LIZ;
        UnifiedAuthPopupConfig unifiedAuthPopupConfig = new UnifiedAuthPopupConfig("", "", 1, false, "", "", "", 0L, Boolean.FALSE, 0L, "", "", "", null, null, null, 0, null);
        PopupInstanceConfig popupInstanceConfig = new PopupInstanceConfig(null, 0, null, 0, null, null, null, null, null, 511, null);
        popupInstanceConfig.popupFiltersConfig.setPushSysPermissionStatusCheck(-1);
        unifiedAuthPopupConfig.setPopupInstances(C1697810uHb.LJIILJJIL(popupInstanceConfig));
        pushUserGuidePopupManager.getClass();
        return PushUserGuidePopupManager.LJIIJJI(unifiedAuthPopupConfig);
    }

    public static void LJII(C1917270zzZ c1917270zzZ) {
        if (c1917270zzZ == null) {
            return;
        }
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLIZ = C1917280zza.LIZ(c1917270zzZ, contextLIZ) + 1;
        C1917280zza.LIZIZ(c1917270zzZ, contextLIZ, jCurrentTimeMillis);
        C1917280zza.LIZJ(c1917270zzZ, contextLIZ, jLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordOneClickSysPopupShown(lastShowTs=");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", showUpTimes=");
        sbLIZ.append(jLIZ);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[OPPO]");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    @Override // com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig r17) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.unifiedauth.push.UniAuthGuidePopupServiceImpl.LIZIZ(com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig):void");
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi
    public final UnifiedAuthPopupConfig LIZJ(String str) {
        UnifiedAuthPopupConfig unifiedAuthPopupConfig;
        ArrayList arrayList;
        UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = (UnifiedAuthPopupConfig) ((Map) C19208310Cr.LIZJ.getValue()).get(str);
        if (unifiedAuthPopupConfig2 == null) {
            unifiedAuthPopupConfig2 = new UnifiedAuthPopupConfig("", "", 1, false, "", "", "", 0L, Boolean.FALSE, 0L, "", "", "", null, null, null, 0, null);
        }
        System.currentTimeMillis();
        if (ChannelsAuthOptimizeExp.INSTANCE.getOptDeepCopy()) {
            String str2 = unifiedAuthPopupConfig2.sceneId;
            String str3 = unifiedAuthPopupConfig2.subSceneId;
            int i = unifiedAuthPopupConfig2.sceneStatus;
            boolean z = unifiedAuthPopupConfig2.useServer;
            String str4 = unifiedAuthPopupConfig2.enterFrom;
            String str5 = unifiedAuthPopupConfig2.enterMethod;
            String str6 = unifiedAuthPopupConfig2.trigger;
            long j = unifiedAuthPopupConfig2.currentFreqCtrl;
            String str7 = unifiedAuthPopupConfig2.filterReason;
            String str8 = unifiedAuthPopupConfig2.popupTriggerId;
            String str9 = unifiedAuthPopupConfig2.avatar;
            String str10 = unifiedAuthPopupConfig2.sysPage;
            int i2 = unifiedAuthPopupConfig2.currentIndex;
            List<PopupInstanceConfig> list = unifiedAuthPopupConfig2.popupInstances;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<PopupInstanceConfig> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C19207910Cn.LIZ(it2.next()));
                }
            } else {
                arrayList = null;
            }
            unifiedAuthPopupConfig = new UnifiedAuthPopupConfig(str2, str3, i, z, str4, str5, str6, 0L, Boolean.FALSE, j, str7, str8, "", str9, null, str10, i2, arrayList);
        } else {
            unifiedAuthPopupConfig = (UnifiedAuthPopupConfig) C08JS.LIZ(C08JS.LIZLLL(unifiedAuthPopupConfig2), UnifiedAuthPopupConfig.class);
        }
        System.identityHashCode(unifiedAuthPopupConfig2);
        System.identityHashCode(unifiedAuthPopupConfig);
        System.currentTimeMillis();
        C211000rc.LIZ("UnifiedAuthPopupConfig");
        return unifiedAuthPopupConfig;
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi
    public final String LJ(C19EG c19eg) {
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        C128Y c128yKi = Hox.LLJILJIL.LIZ(c19eg).Ki("HOME");
        if (c128yKi instanceof InterfaceC1593630rZZ) {
            interfaceC1593630rZZ = (InterfaceC1593630rZZ) c128yKi;
        } else {
            interfaceC1593630rZZ = null;
        }
        String str = "other";
        if (interfaceC1593630rZZ != null) {
            int iYv = interfaceC1593630rZZ.yv();
            if (C1589640rT8.LIZIZ.l2()) {
                C211000rc.LIZ("TabName");
            } else {
                if (iYv != 0) {
                    if (iYv != 1) {
                        if (iYv != 31) {
                            C211000rc.LIZ("TabName");
                        }
                    } else {
                        str = "homepage_follow";
                    }
                } else {
                    str = "homepage_hot";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getCurrentTabName(");
                sbLIZ.append(str);
                sbLIZ.append(", ");
                sbLIZ.append(iYv);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                C211000rc.LIZ("TabName");
                return str;
            }
            str = "homepage_friends";
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getCurrentTabName(");
            sbLIZ2.append(str);
            sbLIZ2.append(", ");
            sbLIZ2.append(iYv);
            sbLIZ2.append(')');
            C2188811AlT.LIZIZ(sbLIZ2);
            C211000rc.LIZ("TabName");
            return str;
        }
        C211000rc.LIZIZ("TabName", "getCurrentTabName() FAILED");
        return "other";
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi
    public final Class LIZLLL(Context context, C10DS c10ds, UnifiedAuthPopupConfig unifiedAuthPopupConfig) {
        LIZIZ(unifiedAuthPopupConfig);
        if (unifiedAuthPopupConfig.sceneStatus == 0) {
            C211000rc.LIZ("UniAuthGuidePopupServiceImpl");
            return null;
        }
        unifiedAuthPopupConfig.setCurrentIndex(0);
        return LJIIIIZZ(context, c10ds, unifiedAuthPopupConfig);
    }

    public final Class LJFF(final Context context, final C10DS c10ds, final UnifiedAuthPopupConfig unifiedAuthPopupConfig) {
        String str;
        PopupFiltersConfig popupFiltersConfig;
        PushInnerPermissionChecklist pushInnerPermissionChecklist;
        List<String> list;
        PushUserGuidePopupManager pushUserGuidePopupManager = PushUserGuidePopupManager.LIZ;
        C10DS c10ds2 = new C10DS() { // from class: X.10D9
            @Override // X.C10DS
            public final void LIZ(String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tryShowCustomizedAuthGuidePopup#onNotShow(");
                sbLIZ.append(str2);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                C211000rc.LIZ("UniAuthGuidePopupServiceImpl");
                this.LJI(context, c10ds, unifiedAuthPopupConfig);
            }

            @Override // X.C10DS
            public final void onShow(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tryShowCustomizedAuthGuidePopup#onShow(");
                sbLIZ.append(i);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                C211000rc.LIZ("UniAuthGuidePopupServiceImpl");
                C10DS c10ds3 = c10ds;
                if (c10ds3 != null) {
                    c10ds3.onShow(i);
                }
            }

            @Override // X.C10DS
            public final void LIZIZ(int i, AbstractC343940De4 abstractC343940De4) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tryShowCustomizedAuthGuidePopup#onDismissAfterShown(");
                sbLIZ.append(i);
                sbLIZ.append(", ");
                sbLIZ.append(abstractC343940De4);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                C211000rc.LIZ("UniAuthGuidePopupServiceImpl");
                C10DS c10ds3 = c10ds;
                if (c10ds3 != null) {
                    c10ds3.LIZIZ(i, abstractC343940De4);
                }
            }
        };
        pushUserGuidePopupManager.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryShowCustomizedPushPopup(");
        sbLIZ.append(unifiedAuthPopupConfig.trigger);
        sbLIZ.append(", ");
        sbLIZ.append(unifiedAuthPopupConfig.enterFrom);
        sbLIZ.append(", ");
        sbLIZ.append(unifiedAuthPopupConfig.enterMethod);
        sbLIZ.append(", ");
        sbLIZ.append(unifiedAuthPopupConfig.avatar);
        sbLIZ.append(", [");
        sbLIZ.append(unifiedAuthPopupConfig.currentIndex);
        sbLIZ.append(", ");
        UnifiedAuthPopupConfig.Companion.getClass();
        PopupInstanceConfig popupInstanceConfigLIZ = C0O1V.LIZ(unifiedAuthPopupConfig);
        if (popupInstanceConfigLIZ != null) {
            str = popupInstanceConfigLIZ.panelType;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append("])");
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push]");
        unifiedAuthPopupConfig.setTriggerTS(System.currentTimeMillis());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(unifiedAuthPopupConfig.triggerTS);
        C827070WcT.LIZ.getClass();
        sbLIZ2.append(C827070WcT.LIZJ());
        unifiedAuthPopupConfig.setIntelligentTriggerId(C08F4.LIZ(C2188811AlT.LIZIZ(sbLIZ2)));
        if (!ChannelsAuthDisablePushExp.INSTANCE.disabled() && !ChannelsAuthHybridDisablePushExp.INSTANCE.disabled()) {
            if (((IPushSystemPermissionApi) ServiceManager.get().getService(IPushSystemPermissionApi.class)).LIZ()) {
                C211000rc.LIZ("[Push]");
                unifiedAuthPopupConfig.setCurrentFreqCtrl(TimeUnit.DAYS.toMinutes(1L));
                unifiedAuthPopupConfig.setFilterReason("during_system_popup_interval");
                PushUserGuidePopupManager.LIZJ(context, unifiedAuthPopupConfig, false);
                c10ds2.LIZ("during_system_popup_interval");
                return null;
            }
            if (!PushUserGuidePopupManager.LJIIJJI(unifiedAuthPopupConfig)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("not show opt-in prompt: ");
                sbLIZ3.append(unifiedAuthPopupConfig.filterReason);
                sbLIZ3.append('!');
                C2188811AlT.LIZIZ(sbLIZ3);
                C211000rc.LIZ("[Push]");
                PushUserGuidePopupManager.LIZJ(context, unifiedAuthPopupConfig, false);
                c10ds2.LIZ(unifiedAuthPopupConfig.filterReason);
                return null;
            }
            if (Intrinsics.LJFF(unifiedAuthPopupConfig.trigger, "inbox") && !C1890430zIH.LIZ()) {
                C211000rc.LIZ("[Push]");
                unifiedAuthPopupConfig.setCurrentFreqCtrl(TimeUnit.DAYS.toMinutes(1L) * 1);
                unifiedAuthPopupConfig.setFilterReason("frequency_control");
                PushUserGuidePopupManager.LIZJ(context, unifiedAuthPopupConfig, false);
                c10ds2.LIZ("frequency_control");
                return null;
            }
            PopupInstanceConfig popupInstanceConfigLIZ2 = C0O1V.LIZ(unifiedAuthPopupConfig);
            if (popupInstanceConfigLIZ2 != null && (popupFiltersConfig = popupInstanceConfigLIZ2.popupFiltersConfig) != null && (pushInnerPermissionChecklist = popupFiltersConfig.pushInnerPermissionChecklist) != null && (list = pushInnerPermissionChecklist.anyNeedCloseSwitches) != null && (!list.isEmpty())) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Show UG opt-in prompt of Toggle(NotificationEnabled)! ");
                sbLIZ4.append(C786410Ut5.u3());
                sbLIZ4.append(" is main? ");
                sbLIZ4.append(Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()));
                C2188811AlT.LIZIZ(sbLIZ4);
                C211000rc.LIZ("[Push]");
                if (C19328310jZ.LIZIZ.LJ() != null) {
                    return PushUserGuidePopupManager.LIZ(list, context, unifiedAuthPopupConfig, c10ds2);
                }
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C06C2(list, context, unifiedAuthPopupConfig, c10ds2, null), 3);
                C211000rc.LIZ("[Push]");
                return null;
            }
            C211000rc.LIZ("[Push]");
            return PushUserGuidePopupManager.LJIIL(context, c10ds2, unifiedAuthPopupConfig);
        }
        unifiedAuthPopupConfig.setFilterReason("all_user_guide_disabled");
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("not show opt-in prompt: ");
        sbLIZ5.append(unifiedAuthPopupConfig.filterReason);
        sbLIZ5.append('!');
        C2188811AlT.LIZIZ(sbLIZ5);
        C211000rc.LIZ("[Push]");
        PushUserGuidePopupManager.LIZJ(context, unifiedAuthPopupConfig, false);
        c10ds2.LIZ(unifiedAuthPopupConfig.filterReason);
        return null;
    }

    public final void LJI(Context context, C10DS c10ds, UnifiedAuthPopupConfig unifiedAuthPopupConfig) {
        int size;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("go2NextInstance(");
        sbLIZ.append(unifiedAuthPopupConfig.currentIndex);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("UniAuthGuidePopupServiceImpl");
        int i = unifiedAuthPopupConfig.currentIndex;
        List<PopupInstanceConfig> list = unifiedAuthPopupConfig.popupInstances;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (i < size - 1) {
            unifiedAuthPopupConfig.setCurrentIndex(unifiedAuthPopupConfig.currentIndex + 1);
            LJIIIIZZ(context, c10ds, unifiedAuthPopupConfig);
        } else {
            if (c10ds == null) {
                return;
            }
            c10ds.LIZ("go_through_all_popups");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.Class] */
    public final Class LJIIIIZZ(Context context, C10DS c10ds, UnifiedAuthPopupConfig unifiedAuthPopupConfig) {
        int i;
        List<PopupInstanceConfig> list;
        String str;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryShowCustomizedInstance(");
        sbLIZ.append(unifiedAuthPopupConfig.trigger);
        sbLIZ.append(", ");
        sbLIZ.append(unifiedAuthPopupConfig.enterFrom);
        sbLIZ.append(", ");
        sbLIZ.append(unifiedAuthPopupConfig.enterMethod);
        sbLIZ.append(", ");
        sbLIZ.append(unifiedAuthPopupConfig.avatar);
        sbLIZ.append(", [");
        sbLIZ.append(unifiedAuthPopupConfig.currentIndex);
        sbLIZ.append("])");
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("UniAuthGuidePopupServiceImpl");
        C259800zU c259800zU = new C259800zU();
        List<PopupInstanceConfig> list2 = unifiedAuthPopupConfig.popupInstances;
        if (list2 != null && !list2.isEmpty() && (i = unifiedAuthPopupConfig.currentIndex) >= 0 && (list = unifiedAuthPopupConfig.popupInstances) != null && i < list.size()) {
            UnifiedAuthPopupConfig.Companion.getClass();
            PopupInstanceConfig popupInstanceConfigLIZ = C0O1V.LIZ(unifiedAuthPopupConfig);
            if (popupInstanceConfigLIZ != null) {
                String str3 = popupInstanceConfigLIZ.panelType;
                T tLJI = 0;
                tLIZLLL = 0;
                T tLIZLLL = 0;
                tLJI = 0;
                if (Intrinsics.LJFF(str3, "edm_guide_default")) {
                    C211000rc.LIZ("[EDM]");
                    PushUserGuidePopupManager pushUserGuidePopupManager = PushUserGuidePopupManager.LIZ;
                    C10DA c10da = new C10DA(c10ds, this, unifiedAuthPopupConfig, context);
                    pushUserGuidePopupManager.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("tryShowEdmPopup(");
                    sbLIZ2.append(unifiedAuthPopupConfig.trigger);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(unifiedAuthPopupConfig.enterFrom);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(unifiedAuthPopupConfig.enterMethod);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(unifiedAuthPopupConfig.avatar);
                    sbLIZ2.append(", [");
                    sbLIZ2.append(unifiedAuthPopupConfig.currentIndex);
                    sbLIZ2.append(", ");
                    PopupInstanceConfig popupInstanceConfigLIZ2 = C0O1V.LIZ(unifiedAuthPopupConfig);
                    if (popupInstanceConfigLIZ2 != null) {
                        str2 = popupInstanceConfigLIZ2.panelType;
                    } else {
                        str2 = null;
                    }
                    sbLIZ2.append(str2);
                    sbLIZ2.append("])");
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C211000rc.LIZ("[EDM]");
                    if (ChannelsAuthDisableEDMExp.INSTANCE.disabled()) {
                        unifiedAuthPopupConfig.setFilterReason("all_user_guide_disabled");
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("not show EDM opt-in prompt: ");
                        sbLIZ3.append(unifiedAuthPopupConfig.filterReason);
                        sbLIZ3.append('!');
                        C2188811AlT.LIZIZ(sbLIZ3);
                        C211000rc.LIZ("[EDM]");
                        c10da.LIZ(unifiedAuthPopupConfig.filterReason);
                    } else if (!PushUserGuidePopupManager.LJIIJJI(unifiedAuthPopupConfig)) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("not show EDM opt-in prompt: ");
                        sbLIZ4.append(unifiedAuthPopupConfig.filterReason);
                        sbLIZ4.append('!');
                        C2188811AlT.LIZIZ(sbLIZ4);
                        C211000rc.LIZ("[EDM]");
                        c10da.LIZ(unifiedAuthPopupConfig.filterReason);
                    } else {
                        C211000rc.LIZ("[EDM]");
                        tLIZLLL = PushUserGuidePopupManager.LIZLLL(pushUserGuidePopupManager, context, unifiedAuthPopupConfig, c10da, 8);
                    }
                    c259800zU.element = tLIZLLL;
                } else if (Intrinsics.LJFF(str3, "sms_guide_default")) {
                    C211000rc.LIZ("[SMS]");
                    PushUserGuidePopupManager pushUserGuidePopupManager2 = PushUserGuidePopupManager.LIZ;
                    C10DB c10db = new C10DB(c10ds, this, unifiedAuthPopupConfig, context);
                    pushUserGuidePopupManager2.getClass();
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("tryShowSmsPopup(");
                    sbLIZ5.append(unifiedAuthPopupConfig.trigger);
                    sbLIZ5.append(", ");
                    sbLIZ5.append(unifiedAuthPopupConfig.enterFrom);
                    sbLIZ5.append(", ");
                    sbLIZ5.append(unifiedAuthPopupConfig.enterMethod);
                    sbLIZ5.append(", ");
                    sbLIZ5.append(unifiedAuthPopupConfig.avatar);
                    sbLIZ5.append(", [");
                    sbLIZ5.append(unifiedAuthPopupConfig.currentIndex);
                    sbLIZ5.append(", ");
                    PopupInstanceConfig popupInstanceConfigLIZ3 = C0O1V.LIZ(unifiedAuthPopupConfig);
                    if (popupInstanceConfigLIZ3 != null) {
                        str = popupInstanceConfigLIZ3.panelType;
                    } else {
                        str = null;
                    }
                    sbLIZ5.append(str);
                    sbLIZ5.append("])");
                    C2188811AlT.LIZIZ(sbLIZ5);
                    C211000rc.LIZ("[SMS]");
                    if (ChannelsAuthDisableSMSExp.INSTANCE.disabled()) {
                        unifiedAuthPopupConfig.setFilterReason("all_user_guide_disabled");
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("not show SMS opt-in prompt: ");
                        sbLIZ6.append(unifiedAuthPopupConfig.filterReason);
                        sbLIZ6.append('!');
                        C2188811AlT.LIZIZ(sbLIZ6);
                        C211000rc.LIZ("[SMS]");
                        c10db.LIZ(unifiedAuthPopupConfig.filterReason);
                    } else if (!PushUserGuidePopupManager.LJIIJJI(unifiedAuthPopupConfig)) {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("not show SMS opt-in prompt: ");
                        sbLIZ7.append(unifiedAuthPopupConfig.filterReason);
                        sbLIZ7.append('!');
                        C2188811AlT.LIZIZ(sbLIZ7);
                        C211000rc.LIZ("[SMS]");
                        c10db.LIZ(unifiedAuthPopupConfig.filterReason);
                    } else {
                        C211000rc.LIZ("[SMS]");
                        tLJI = PushUserGuidePopupManager.LJI(pushUserGuidePopupManager2, context, unifiedAuthPopupConfig, c10db, 8);
                    }
                    c259800zU.element = tLJI;
                } else {
                    int i2 = popupInstanceConfigLIZ.popupCombinationType;
                    if (i2 == 1 || ((i2 == 0 || i2 == 3) && C824390WVp.LIZJ(context))) {
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("System.onNotShow(");
                        sbLIZ8.append(unifiedAuthPopupConfig.sysPage);
                        sbLIZ8.append(')');
                        C2188811AlT.LIZIZ(sbLIZ8);
                        C211000rc.LIZ("[Push-Sys]");
                        c259800zU.element = LJFF(context, c10ds, unifiedAuthPopupConfig);
                    } else {
                        ((IPushSystemPermissionApi) ServiceManager.get().getService(IPushSystemPermissionApi.class)).LJ(unifiedAuthPopupConfig.sysPage, new C19208410Cs(unifiedAuthPopupConfig, c10ds, popupInstanceConfigLIZ, this, context, c259800zU));
                    }
                }
            }
            return (Class) c259800zU.element;
        }
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("tryShowCustomizedInstance(");
        sbLIZ9.append(unifiedAuthPopupConfig.currentIndex);
        sbLIZ9.append(") - index out of boundaries!");
        C2188811AlT.LIZIZ(sbLIZ9);
        C211000rc.LIZ("UniAuthGuidePopupServiceImpl");
        if (c10ds != null) {
            c10ds.LIZ("index_out_of_boundaries");
        }
        return (Class) c259800zU.element;
    }
}
