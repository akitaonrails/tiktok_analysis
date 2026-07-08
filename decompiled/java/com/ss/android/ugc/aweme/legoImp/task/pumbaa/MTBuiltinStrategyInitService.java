package com.ss.android.ugc.aweme.legoImp.task.pumbaa;

import X.C825480WZu;
import com.bytedance.helios.network.pipeline.recognize.NetworkDomainRecognize;
import com.bytedance.helios.network.strategy.DataTransferConfigModel;
import com.bytedance.helios.network.strategy.NetworkPbaEncodeABConfig;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pns.engine.builtin.BuiltinNativeStrategyConfig;
import com.bytedance.pns.engine.builtin.BuiltinStrategyInitService;
import com.bytedance.pns.engine.builtin.StrategyProtocol;
import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public final class MTBuiltinStrategyInitService implements BuiltinStrategyInitService {
    @Override // com.bytedance.pns.engine.builtin.BuiltinStrategyInitService
    public final void init() {
        C825480WZu.LIZIZ(new StrategyProtocol() { // from class: X.0WZp
            @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
            public final C825550Wa1 config() {
                return new C825550Wa1(C08CX.INSTANCE, "third_party_issue", "1");
            }

            @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
            public final boolean LIZIZ() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LIZ("third_party_issue_config", false);
            }

            @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
            public final C825530WZz LIZ(InterfaceC825580Wa4 interfaceC825580Wa4) {
                Object objLIZ;
                Map mapLJ;
                C0WR6 c0wr6Query = interfaceC825580Wa4.contextInfo().query("header");
                if (c0wr6Query != null) {
                    objLIZ = c0wr6Query.LIZ();
                } else {
                    objLIZ = null;
                }
                if (!(objLIZ instanceof Map) || (mapLJ = (Map) objLIZ) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                if (!mapLJ.containsKey("x-metasec-bypass-api-log")) {
                    return null;
                }
                C13BV c13bv = C13BV.INSTANCE;
                return new C825530WZz(c13bv, false, C1697810uHb.LJIIJJI("ttnet_cpp", "new_fact_report_okWithUrl", "ttnet_java", "ttnet_java_stash", "merge_ttnet_java", "merge_ttnet_global_request", "merge_ttnet_java_response", "new_fact_report_okWithUrl_offline", "merge_ttnet_java_offline", "merge_ttnet_global_request_offline", "merge_ttnet_java_response_offline"), c13bv);
            }
        });
        C825480WZu.LIZIZ(new StrategyProtocol() { // from class: X.0WZs
            @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
            public final C825550Wa1 config() {
                return new C825550Wa1(Collections.singleton(new C825470WZt("kids_mode_drop_request", "fuse", C2097608Jq.LJIIIIZZ(new Pair("errorCode", 410), new Pair("msg", "Only domain names on the allow-list can be requested.")))), "kids_mode_drop_request", "1.0");
            }

            @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
            public final boolean LIZIZ() {
                return C10EU.LJIIIIZZ();
            }

            @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
            public final C825530WZz LIZ(InterfaceC825580Wa4 interfaceC825580Wa4) {
                Object objLIZ;
                Object objLIZ2;
                Object objLIZ3;
                if (C10EU.LJIIIIZZ()) {
                    C0WR6 c0wr6Query = interfaceC825580Wa4.contextInfo().query("domain_after_tnc");
                    if (c0wr6Query == null || (objLIZ = c0wr6Query.LIZ()) == null || !(objLIZ instanceof String)) {
                        objLIZ = null;
                    }
                    String lowerCase = (String) objLIZ;
                    if (lowerCase == null) {
                        C0WR6 c0wr6Query2 = interfaceC825580Wa4.contextInfo().query("domain");
                        if (c0wr6Query2 == null || (objLIZ3 = c0wr6Query2.LIZ()) == null || !(objLIZ3 instanceof String)) {
                            objLIZ3 = null;
                        }
                        String str = (String) objLIZ3;
                        if (str != null) {
                            lowerCase = str.toLowerCase(Locale.ROOT);
                        } else {
                            lowerCase = null;
                        }
                    }
                    C0WR6 c0wr6Query3 = interfaceC825580Wa4.contextInfo().query("path");
                    if (c0wr6Query3 != null) {
                        objLIZ2 = c0wr6Query3.LIZ();
                    } else {
                        objLIZ2 = null;
                    }
                    Set<String> set = C0XDX.LIZ;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator<T> it2 = set.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            String str2 = (String) it2.next();
                            if (lowerCase != null && u.LJIIZILJ(lowerCase, str2, false)) {
                                if (!C13LP.LJJJJ(objLIZ2, C0XDX.LIZIZ)) {
                                    try {
                                        JSONObject jSONObject = new JSONObject();
                                        if (lowerCase == null) {
                                            lowerCase = "unknown";
                                        }
                                        jSONObject.put("blocked_domain", lowerCase);
                                        if (objLIZ2 == null) {
                                            objLIZ2 = "unknown";
                                        }
                                        jSONObject.put("blocked_path", objLIZ2);
                                        jSONObject.put("block_source", "network");
                                        AppLogNewUtils.onEventV3("blocked_by_pns", jSONObject);
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "kids_kshield_network_hard_block", true, false)) {
                                        List listSingletonList = Collections.singletonList("kids_mode_drop_request");
                                        C13BV c13bv = C13BV.INSTANCE;
                                        return new C825530WZz(listSingletonList, true, c13bv, c13bv);
                                    }
                                }
                            }
                        }
                    }
                }
                return null;
            }
        });
        C825480WZu.LIZIZ(new StrategyProtocol() { // from class: X.0WZr
            @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
            public final boolean LIZIZ() {
                return true;
            }

            @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
            public final C825550Wa1 config() {
                return new C825550Wa1(C08CX.INSTANCE, "kids_mode_end", "1.0");
            }

            @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
            public final C825530WZz LIZ(InterfaceC825580Wa4 interfaceC825580Wa4) {
                if (C10EU.LJIIIIZZ()) {
                    C13BV c13bv = C13BV.INSTANCE;
                    return new C825530WZz(c13bv, true, c13bv, c13bv);
                }
                return null;
            }
        });
        C825480WZu.LIZIZ(new StrategyProtocol() { // from class: X.0WZq
            @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
            public final boolean LIZIZ() {
                return ((NetworkPbaEncodeABConfig.PbaEncodeConfig) NetworkPbaEncodeABConfig.LIZIZ.getValue()).enableNewPbaEncode;
            }

            @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
            public final C825550Wa1 config() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x-tt-pba-encode", "$x_tt_pba_encode");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("update", jSONObject);
                return new C825550Wa1(Collections.singleton(new C825470WZt("network_pba_encode_modify", "modify", C2097908Jt.LIZJ(new Pair("header", jSONObject2)))), "network_pba_encode_strategy", "1");
            }

            @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
            public final C825530WZz LIZ(InterfaceC825580Wa4 interfaceC825580Wa4) {
                Object objLIZ;
                Map map;
                Object objLIZ2;
                String str;
                Object next;
                Object value;
                boolean zLJFF;
                String string;
                String string2;
                String str2;
                Object objLIZ3 = null;
                if (!((NetworkPbaEncodeABConfig.PbaEncodeConfig) NetworkPbaEncodeABConfig.LIZIZ.getValue()).enableNewPbaEncode) {
                    C0WRU.LIZ(interfaceC825580Wa4, "builtin", "network_pba_encode_strategy:disabled_return_null");
                    return null;
                }
                C0WR6 c0wr6Query = interfaceC825580Wa4.contextInfo().query("header");
                if (c0wr6Query != null) {
                    objLIZ = c0wr6Query.LIZ();
                } else {
                    objLIZ = null;
                }
                if (objLIZ instanceof Map) {
                    map = (Map) objLIZ;
                } else {
                    map = null;
                }
                if (map != null) {
                    Iterator it2 = map.entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            Object key = ((Map.Entry) next).getKey();
                            if ((key instanceof String) && (str2 = (String) key) != null && u.LJIJI(str2, "x-metasec-bypass-ttnet-features", true)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry != null && (value = entry.getValue()) != null) {
                        if (value instanceof String) {
                            zLJFF = Intrinsics.LJFF(a0.LJLIIIL((String) value).toString(), "1");
                        } else if (value instanceof List) {
                            Object objLJJJLL = C13LP.LJJJLL((List) value);
                            if (objLJJJLL != null && (string2 = objLJJJLL.toString()) != null) {
                                string = a0.LJLIIIL(string2).toString();
                            } else {
                                string = null;
                            }
                            zLJFF = Intrinsics.LJFF(string, "1");
                        } else {
                            zLJFF = Intrinsics.LJFF(a0.LJLIIIL(value.toString()).toString(), "1");
                        }
                        if (zLJFF) {
                            C0WRU.LIZ(interfaceC825580Wa4, "builtin", "network_pba_encode_strategy:bypass_header_enabled_return_null");
                            return null;
                        }
                    }
                }
                C0WR6 c0wr6Query2 = interfaceC825580Wa4.contextInfo().query("domain_type");
                if (c0wr6Query2 != null) {
                    objLIZ2 = c0wr6Query2.LIZ();
                } else {
                    objLIZ2 = null;
                }
                if ((objLIZ2 instanceof String) && objLIZ2 != null) {
                    if (Intrinsics.LJFF(objLIZ2, "bd_1st")) {
                        C0WRU.LIZ(interfaceC825580Wa4, "builtin", "network_pba_encode_strategy:bd_1st_return_actions");
                        if (interfaceC825580Wa4 instanceof PrivacyEvent) {
                            ((PrivacyEvent) interfaceC825580Wa4).addCallSiteInfo("x_tt_pba_encode", new C0WQ8(EnumC823400WRu.String, "1"));
                            List listSingletonList = Collections.singletonList("network_pba_encode_modify");
                            C13BV c13bv = C13BV.INSTANCE;
                            return new C825530WZz(listSingletonList, false, c13bv, c13bv);
                        }
                        C0WRU.LIZ(interfaceC825580Wa4, "builtin", "network_pba_encode_strategy:bd_1st_not_privacy_event_return_null");
                        return null;
                    }
                    if (!Intrinsics.LJFF(objLIZ2, "tt_1st")) {
                        C0WRU.LIZ(interfaceC825580Wa4, "builtin", "network_pba_encode_strategy:not_tt_1st_return_null");
                        return null;
                    }
                    C0WR6 c0wr6Query3 = interfaceC825580Wa4.contextInfo().query("x_tt_pba_encode");
                    if (c0wr6Query3 != null) {
                        objLIZ3 = c0wr6Query3.LIZ();
                    }
                    if (!(objLIZ3 instanceof String) || (str = (String) objLIZ3) == null || str.length() == 0) {
                        C0WRU.LIZ(interfaceC825580Wa4, "builtin", "network_pba_encode_strategy:encode_empty_return_actions");
                        if (interfaceC825580Wa4 instanceof PrivacyEvent) {
                            ((PrivacyEvent) interfaceC825580Wa4).addCallSiteInfo("x_tt_pba_encode", new C0WQ8(EnumC823400WRu.String, "2"));
                            List listSingletonList2 = Collections.singletonList("network_pba_encode_modify");
                            C13BV c13bv2 = C13BV.INSTANCE;
                            return new C825530WZz(listSingletonList2, false, c13bv2, c13bv2);
                        }
                    }
                    C0WRU.LIZ(interfaceC825580Wa4, "builtin", "network_pba_encode_strategy:tt_1st_has_encode_return_actions");
                    List listSingletonList3 = Collections.singletonList("network_pba_encode_modify");
                    C13BV c13bv3 = C13BV.INSTANCE;
                    return new C825530WZz(listSingletonList3, false, c13bv3, c13bv3);
                }
                C0WRU.LIZ(interfaceC825580Wa4, "builtin", "network_pba_encode_strategy:domain_type_null_return_null");
                return null;
            }
        });
        C825480WZu.LIZIZ(new StrategyProtocol() { // from class: X.0Wa5
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(370));

            @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
            public final C825550Wa1 config() throws JSONException {
                Pair[] pairArr = {new Pair("errorCode", 410), new Pair("msg", "Blocked by data_transfer")};
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", "create_group");
                jSONArray.put(jSONObject);
                return new C825550Wa1(C13LQ.LJLIIL(new C825470WZt[]{new C825470WZt("data_transfer_block", "fuse", C2097608Jq.LJIIIIZZ(pairArr)), new C825470WZt("data_transfer_alert", "alert", C2097608Jq.LJIIIIZZ(new Pair("title", "Data Transfer Control"), new Pair("message", "This domain is not allowed to use in this app.\ndomain: %{domain}\nevent_source: %{event_source}\nevent_type: %{event_type}\nIf not your traffic, plz ignore.\nClick button [Create a group] if you have any question"), new Pair("topic_id", 1), new Pair("topic_name", "dtr"), new Pair("extra_options", jSONArray))), new C825470WZt("data_transfer_report", "report", C2097608Jq.LJIIIIZZ(new Pair("fields", C1697810uHb.LJIIJJI("sample_rate", "blocked", "domain", "path", "event_source", "event_type", "dfid", "hybrid_origin_url", "hybrid_channel", "call_site")), new Pair("report_category", "control"), new Pair("strategy_id", "data_transfer")))}), "data_transfer", "1");
            }

            @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
            public final boolean LIZIZ() {
                return ((DataTransferConfigModel) this.LIZ.getValue()).enable;
            }

            @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
            public final C825530WZz LIZ(InterfaceC825580Wa4 interfaceC825580Wa4) {
                Object objLIZ;
                String string;
                boolean z;
                Object objLIZ2;
                Object objLIZ3;
                Object objLJJLIIIJ;
                PrivacyEvent privacyEvent;
                PrivacyEvent privacyEvent2;
                List listLJIIJJI;
                Object objLIZ4;
                String str;
                PrivacyEvent privacyEvent3;
                PrivacyEvent privacyEvent4;
                String str2;
                C0WR6 c0wr6Query = interfaceC825580Wa4.contextInfo().query("domain");
                if (c0wr6Query != null) {
                    objLIZ = c0wr6Query.LIZ();
                } else {
                    objLIZ = null;
                }
                if ((objLIZ instanceof String) && (str2 = (String) objLIZ) != null) {
                    string = a0.LJLIIIL(str2).toString();
                } else {
                    string = null;
                }
                if (string != null && string.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C0WRU.LIZ(interfaceC825580Wa4, "builtin", "data_transfer:domain_empty_return_null");
                    return null;
                }
                C0WR6 c0wr6Query2 = interfaceC825580Wa4.contextInfo().query("exempted_id_list");
                if (c0wr6Query2 != null) {
                    objLIZ2 = c0wr6Query2.LIZ();
                } else {
                    objLIZ2 = null;
                }
                if (objLIZ2 != null && !Intrinsics.LJFF(objLIZ2, "pns-null")) {
                    C0WRU.LIZ(interfaceC825580Wa4, "builtin", "data_transfer:exempted_return_null");
                    return null;
                }
                C0WR6 c0wr6Query3 = interfaceC825580Wa4.contextInfo().query("event_source");
                if (c0wr6Query3 != null) {
                    objLIZ3 = c0wr6Query3.LIZ();
                } else {
                    objLIZ3 = null;
                }
                if (Intrinsics.LJFF(objLIZ3, "hybrid")) {
                    boolean z2 = interfaceC825580Wa4 instanceof PrivacyEvent;
                    if (z2 && (privacyEvent4 = (PrivacyEvent) interfaceC825580Wa4) != null) {
                        privacyEvent4.addCallSiteInfo("exempted_id_list", new C0WQ8(EnumC823400WRu.String, Collections.singletonList("1048576").toString()));
                    }
                    C0WR6 c0wr6Query4 = interfaceC825580Wa4.contextInfo().query("hybrid_origin_url_domain");
                    if (c0wr6Query4 != null) {
                        objLIZ4 = c0wr6Query4.LIZ();
                    } else {
                        objLIZ4 = null;
                    }
                    if ((objLIZ4 instanceof String) && (str = (String) objLIZ4) != null) {
                        if (!Intrinsics.LJFF(NetworkDomainRecognize.domainIdentityRecognize(str), "tt_1st")) {
                            C0WRU.LIZ(interfaceC825580Wa4, "builtin", "data_transfer:hybrid_not_tt1st_return_null");
                            return null;
                        }
                        if (u.LJIIZILJ(str, "tiktok-minis.us", false)) {
                            C0WRU.LIZ(interfaceC825580Wa4, "builtin", "data_transfer:tiktok_minis_exempt_return_null");
                            return null;
                        }
                        if (z2 && (privacyEvent3 = (PrivacyEvent) interfaceC825580Wa4) != null) {
                            privacyEvent3.addCallSiteInfo("exempted_id_list", new C0WQ8(EnumC823400WRu.String, "pns-null"));
                        }
                    } else {
                        C0WRU.LIZ(interfaceC825580Wa4, "builtin", "data_transfer:hybrid_refer_domain_null_return_null");
                        return null;
                    }
                }
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{e3.d}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLJJLIIIJILLIZJL) {
                    if (!a0.LJJJIL((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                if (size != 0) {
                    if (size != 1) {
                        objLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LLD(2, arrayList), e3.d, null, null, 0, null, null, 62);
                    } else {
                        objLJJLIIIJ = ListProtector.get(arrayList, 0);
                    }
                    if (objLJJLIIIJ != null) {
                        if (((DataTransferConfigModel) this.LIZ.getValue()).blockList.contains(objLJJLIIIJ)) {
                            C0WRU.LIZ(interfaceC825580Wa4, "builtin", "data_transfer:block_hit_return_actions");
                            if ((interfaceC825580Wa4 instanceof PrivacyEvent) && (privacyEvent2 = (PrivacyEvent) interfaceC825580Wa4) != null) {
                                privacyEvent2.addCallSiteInfo("blocked", new C0WQ8(EnumC823400WRu.Bool, Boolean.TRUE));
                                EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
                                privacyEvent2.addCallSiteInfo("domain", new C0WQ8(enumC823400WRu, string));
                                if (C0WRY.LIZ(((DataTransferConfigModel) this.LIZ.getValue()).reportSampleRate)) {
                                    privacyEvent2.addCallSiteInfo("sample_rate", new C0WQ8(enumC823400WRu, String.valueOf(((DataTransferConfigModel) this.LIZ.getValue()).reportSampleRate)));
                                    listLJIIJJI = C1697810uHb.LJIIJJI("data_transfer_block", "data_transfer_report", "data_transfer_alert");
                                } else {
                                    listLJIIJJI = C1697810uHb.LJIIJJI("data_transfer_block", "data_transfer_alert");
                                }
                                C13BV c13bv = C13BV.INSTANCE;
                                return new C825530WZz(listLJIIJJI, true, c13bv, c13bv);
                            }
                        }
                        String strDomainIdentityRecognize = NetworkDomainRecognize.domainIdentityRecognize(string);
                        if (strDomainIdentityRecognize != null && !Intrinsics.LJFF(strDomainIdentityRecognize, "bd_3rd")) {
                            C0WRU.LIZ(interfaceC825580Wa4, "builtin", "data_transfer:no_match_return_null");
                            return null;
                        }
                        C0WRU.LIZ(interfaceC825580Wa4, "builtin", "data_transfer:third_party_exempt_return_null");
                        if ((interfaceC825580Wa4 instanceof PrivacyEvent) && (privacyEvent = (PrivacyEvent) interfaceC825580Wa4) != null) {
                            privacyEvent.addCallSiteInfo("exempted_id_list", new C0WQ8(EnumC823400WRu.String, Collections.singletonList("1048576").toString()));
                        }
                        return null;
                    }
                }
                C0WRU.LIZ(interfaceC825580Wa4, "builtin", "data_transfer:top_level_domain_null_return_null");
                return null;
            }
        });
        C825480WZu.LIZ(new BuiltinNativeStrategyConfig() { // from class: X.0WZv
            @Override // com.bytedance.pns.engine.builtin.BuiltinNativeStrategyConfig
            public final C825570Wa3 config() {
                List listLJIIJJI = C1697810uHb.LJIIJJI(new C825560Wa2("ttnet_java_request", C1697810uHb.LJIIJJI("kids_mode_drop_request", "kids_mode_end", "third_party_issue", "data_transfer", "network_pba_encode_strategy")), new C825560Wa2("ttnet_cpp_request", C1697810uHb.LJIIJJI("kids_mode_drop_request", "kids_mode_end", "third_party_issue", "network_pba_encode_strategy")), new C825560Wa2("other_network", C1697810uHb.LJIIJJI("kids_mode_drop_request", "kids_mode_end", "third_party_issue")));
                List listSingletonList = Collections.singletonList("4097(pre)");
                EnumC825520WZy enumC825520WZy = EnumC825520WZy.BEFORE_REMOTE;
                return new C825570Wa3(listLJIIJJI, C1697810uHb.LJIIJJI(new C825540Wa0(listSingletonList, "ttnet_java_request", enumC825520WZy), new C825540Wa0(Collections.singletonList("10821(cpp)"), "ttnet_cpp_request", enumC825520WZy), new C825540Wa0(C1697810uHb.LJIIJJI("4388", "4387", "4097", "10821", "4425", "4427"), "other_network", enumC825520WZy)));
            }
        });
    }
}
