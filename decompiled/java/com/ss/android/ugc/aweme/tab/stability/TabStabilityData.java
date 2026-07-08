package com.ss.android.ugc.aweme.tab.stability;

import X.C09CT;
import X.C1227904rF;
import X.C123100dR;
import X.C13BV;
import X.C13LP;
import X.C2096608Jg;
import X.C2097608Jq;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class TabStabilityData {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("ab_exp_info")
    public final n abExpInfo;

    @C09CT("ab_exp_vid_info")
    public final n abExpVidInfo;

    @C09CT("ab_user_id")
    public final String abUserId;

    @C09CT("client_backup_move_reason")
    public final String clientBackupMoveReason;

    @C09CT("client_bottom_tab_list")
    public final List<String> clientBottomTabList;

    @C09CT("client_decision_fcp_config_error_domain")
    public final String clientDecisionFcpConfigErrorDomain;

    @C09CT("client_decision_filter_rules")
    public final Map<String, Map<String, Boolean>> clientDecisionFilterRules;

    @C09CT("client_left_icon_list")
    public final List<String> clientLeftIconList;

    @C09CT("client_right_icon_list")
    public final List<String> clientRightIconList;

    @C09CT("client_top_tab_list")
    public final List<String> clientTopTabList;

    @C09CT("ab_common_log_id")
    public final String commonLogId;

    @C09CT("is_new_user")
    public final boolean isNewUser;

    @C09CT("is_tab_nuj")
    public final boolean isTabNUJ;

    @C09CT("real_user_id")
    public final String realUserId;

    @C09CT("server_decision_filter_rules")
    public final Map<String, Map<String, Boolean>> serverDecisionFilterRules;

    @C09CT("server_decision_personalize")
    public final n serverPersonalize;

    @C09CT("ab_tab_fcp_config_v2")
    public final TabConfig tabFcpConfig;

    @C09CT("ab_conditions")
    public final n tabReqInfo;

    @C09CT("update_method")
    public String updateSource;

    @C09CT("update_timestamp")
    public final long updateTimestamp;

    public TabStabilityData() {
        this(null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 1048575, null);
    }

    public final boolean LIZIZ(TabStabilityData tabStabilityData) {
        TabConfig tabConfig;
        TabConfig tabConfig2;
        if (tabStabilityData == null || (tabConfig = this.tabFcpConfig) == null || (tabConfig2 = tabStabilityData.tabFcpConfig) == null || !Intrinsics.LJFF(tabConfig.topTab, tabConfig2.topTab) || !Intrinsics.LJFF(this.tabFcpConfig.bottomTab, tabStabilityData.tabFcpConfig.bottomTab) || !Intrinsics.LJFF(this.tabFcpConfig.leftEntrance, tabStabilityData.tabFcpConfig.leftEntrance) || !Intrinsics.LJFF(this.tabFcpConfig.rightEntrance, tabStabilityData.tabFcpConfig.rightEntrance) || !Intrinsics.LJFF(this.tabFcpConfig.backupConfig, tabStabilityData.tabFcpConfig.backupConfig)) {
            return true;
        }
        return false;
    }

    public final JSONObject LIZJ(boolean z) throws JSONException {
        String str;
        if (z) {
            str = "pre_";
        } else {
            str = "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str.concat("is_new_user"), this.isNewUser ? 1 : 0);
        jSONObject.put(str.concat("is_tab_nuj"), this.isTabNUJ ? 1 : 0);
        if (!C2096608Jg.LIZ(this.abExpInfo)) {
            String strConcat = str.concat("ab_exp_info");
            C1227904rF c1227904rF = C1227904rF.LIZ;
            n nVar = this.abExpInfo;
            c1227904rF.getClass();
            jSONObject.put(strConcat, C1227904rF.LJI(nVar));
        }
        if (!C2096608Jg.LIZ(this.abExpVidInfo)) {
            String strConcat2 = str.concat("ab_exp_vid_info");
            C1227904rF c1227904rF2 = C1227904rF.LIZ;
            n nVar2 = this.abExpVidInfo;
            c1227904rF2.getClass();
            jSONObject.put(strConcat2, C1227904rF.LJI(nVar2));
        }
        if (!C2096608Jg.LIZ(this.abExpVidInfo)) {
            String strConcat3 = str.concat("ab_conditions");
            C1227904rF c1227904rF3 = C1227904rF.LIZ;
            n nVar3 = this.tabReqInfo;
            c1227904rF3.getClass();
            jSONObject.put(strConcat3, C1227904rF.LJI(nVar3));
        }
        if (!this.serverDecisionFilterRules.isEmpty()) {
            String strConcat4 = str.concat("server_decision_filter_rules");
            C1227904rF c1227904rF4 = C1227904rF.LIZ;
            Map<String, Map<String, Boolean>> map = this.serverDecisionFilterRules;
            c1227904rF4.getClass();
            jSONObject.put(strConcat4, C1227904rF.LJI(map));
        }
        if (!C2096608Jg.LIZ(this.serverPersonalize)) {
            String strConcat5 = str.concat("server_decision_personalize_change");
            C1227904rF c1227904rF5 = C1227904rF.LIZ;
            n nVar4 = this.serverPersonalize;
            c1227904rF5.getClass();
            jSONObject.put(strConcat5, C1227904rF.LJI(nVar4));
        }
        jSONObject.put(str.concat("ab_user_id"), this.abUserId);
        jSONObject.put(str.concat("real_uid"), this.realUserId);
        jSONObject.put(str.concat("ab_common_log_id"), this.commonLogId);
        if (C123100dR.LIZ(this.clientDecisionFcpConfigErrorDomain)) {
            jSONObject.put(str.concat("client_decision_fcp_config_error_domain"), this.clientDecisionFcpConfigErrorDomain);
        }
        if (!this.clientDecisionFilterRules.isEmpty()) {
            String strConcat6 = str.concat("client_decision_filter_rules");
            C1227904rF c1227904rF6 = C1227904rF.LIZ;
            Map<String, Map<String, Boolean>> map2 = this.clientDecisionFilterRules;
            c1227904rF6.getClass();
            jSONObject.put(strConcat6, C1227904rF.LJI(map2));
        }
        if (C123100dR.LIZ(this.clientBackupMoveReason)) {
            jSONObject.put(str.concat("move_reason"), this.clientBackupMoveReason);
        }
        if (C123100dR.LIZ(this.updateSource)) {
            jSONObject.put(str.concat("update_method"), this.updateSource);
        }
        return jSONObject;
    }

    public static Map LIZ(Map map, Map map2) {
        HashMap map3 = new HashMap();
        for (Object obj : C13LP.LLIIJLIL(map.keySet(), map2.keySet())) {
            Map map4 = (Map) map.get(obj);
            if (map4 != null) {
                int size = map4.size();
                Map map5 = (Map) map2.get(obj);
                if (map5 != null && (size != map5.size() || !Intrinsics.LJFF(map4, map5))) {
                    HashMap map6 = new HashMap();
                    for (Object obj2 : C13LP.LLIIJLIL(map4.keySet(), map5.keySet())) {
                        Object obj3 = map4.get(obj2);
                        Object obj4 = map5.get(obj2);
                        if (!Intrinsics.LJFF(obj3, obj4)) {
                            map6.put(obj2, new Pair(obj3, obj4));
                        }
                    }
                    if (!map6.isEmpty()) {
                        map3.put(obj, map6);
                    }
                }
            }
        }
        return map3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabStabilityData(TabConfig tabConfig, boolean z, boolean z2, n nVar, n nVar2, n nVar3, Map<String, ? extends Map<String, Boolean>> map, n nVar4, String str, String str2, String str3, String str4, Map<String, ? extends Map<String, Boolean>> map2, String str5, List<String> list, List<String> list2, List<String> list3, List<String> list4, String str6, long j) {
        this.tabFcpConfig = tabConfig;
        this.isNewUser = z;
        this.isTabNUJ = z2;
        this.abExpInfo = nVar;
        this.abExpVidInfo = nVar2;
        this.tabReqInfo = nVar3;
        this.serverDecisionFilterRules = map;
        this.serverPersonalize = nVar4;
        this.abUserId = str;
        this.realUserId = str2;
        this.commonLogId = str3;
        this.clientDecisionFcpConfigErrorDomain = str4;
        this.clientDecisionFilterRules = map2;
        this.clientBackupMoveReason = str5;
        this.clientTopTabList = list;
        this.clientBottomTabList = list2;
        this.clientLeftIconList = list3;
        this.clientRightIconList = list4;
        this.updateSource = str6;
        this.updateTimestamp = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabStabilityData(TabConfig tabConfig, boolean z, boolean z2, n nVar, n nVar2, n nVar3, Map map, n nVar4, String str, String str2, String str3, String str4, Map map2, String str5, List list, List list2, List list3, List list4, String str6, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j2 = j;
        String str7 = str6;
        List list5 = list4;
        List list6 = list3;
        List list7 = list2;
        List list8 = list;
        String str8 = str5;
        String str9 = str3;
        String str10 = str;
        n nVar5 = nVar4;
        Map map3 = map;
        n nVar6 = nVar2;
        n nVar7 = nVar;
        Map map4 = map2;
        boolean z3 = z;
        n nVar8 = nVar3;
        String str11 = str4;
        this((i & 1) != 0 ? null : tabConfig, (i & 2) != 0 ? false : z3, (i & 4) == 0 ? z2 : false, (i & 8) != 0 ? null : nVar7, (i & 16) != 0 ? null : nVar6, (i & 32) != 0 ? null : nVar8, (i & 64) != 0 ? C2097608Jq.LJ() : map3, (i & 128) != 0 ? null : nVar5, (i & 256) != 0 ? CardStruct.IStatusCode.DEFAULT : str10, (i & 512) == 0 ? str2 : CardStruct.IStatusCode.DEFAULT, (i & 1024) != 0 ? "" : str9, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str11, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C2097608Jq.LJ() : map4, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? C13BV.INSTANCE : list8, (32768 & i) != 0 ? C13BV.INSTANCE : list7, (65536 & i) != 0 ? C13BV.INSTANCE : list6, (131072 & i) != 0 ? C13BV.INSTANCE : list5, (262144 & i) != 0 ? null : str7, (i & 524288) != 0 ? 0L : j2);
    }
}
