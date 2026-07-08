package com.ss.android.ugc.aweme.legoImp.task.btm;

import X.C01GW;
import X.C0BHF;
import X.C0BHG;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1206720hVW;
import X.C1697810uHb;
import X.C1865530ye7;
import X.C18A9;
import X.C18B2;
import X.C18BV;
import X.C18DK;
import X.C18IH;
import X.C18IP;
import X.C18IS;
import X.C18J9;
import X.C21242718Bd;
import X.C21262818Iw;
import X.C21262918Ix;
import X.C285640BHm;
import X.C452501pT;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC21257118Gr;
import X.InterfaceC21259418Ho;
import X.InterfaceC2217461Bqa;
import X.InterfaceC799590VYf;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.config.BtmEventConfigModel;
import com.bytedance.android.btm.api.util.LazyNullable;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.legoImp.task.btm.BCMForestLoader;
import com.ss.android.ugc.aweme.legoImp.task.btm.BtmSDKNetworkInterceptor;
import com.ss.android.ugc.aweme.legoImp.task.btm.InitBtmSDKTask;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AwS662S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class InitBtmSDKTask implements C0CCZ, InterfaceC799590VYf {
    public static volatile boolean LLILLJJLI;
    public static volatile boolean LLILLL;
    public static final InitBtmSDKTask LL = new InitBtmSDKTask();
    public static final C01GW LLILZ = C452501pT.LIZIZ(new C0BHG());
    public static final C01GW LLILZIL = C452501pT.LIZIZ(new C21262818Iw());
    public static final C01GW LLILZLL = C452501pT.LIZIZ(new C21262918Ix());
    public static final C01GW LLIZ = C452501pT.LIZIZ(new C0BHF());

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitBtmSDKTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static boolean LIZ() {
        return ((Boolean) LLILZIL.getValue()).booleanValue();
    }

    public static boolean LJ() {
        return ((Boolean) LLILZLL.getValue()).booleanValue();
    }

    public static int LJFF() {
        return ((Number) LLILZ.getValue()).intValue();
    }

    public final void LJIIIIZZ() {
        synchronized (InitBtmSDKTask.class) {
            try {
                if (!LLILLJJLI) {
                    LL.getClass();
                    LJIIIZ(LJFF() > 0);
                    LLILLJJLI = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return LJ() ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.18IT] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.18J2] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.15WZ] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.15WY] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.15Wb] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.18J3] */
    public static void LJIIIZ(boolean z) {
        if (!z) {
            return;
        }
        if (LIZ()) {
            BtmSDK.INSTANCE.initByProvider(new C1865530ye7() { // from class: X.18IR
                @Override // X.InterfaceC21260718Ib
                public final String[] LJIIIIZZ() {
                    C844470XAv.LIZ.getClass();
                    return new String[]{String.valueOf(C844470XAv.LJIIJ)};
                }

                @Override // X.InterfaceC21260718Ib
                public final void LJIILLIIL() {
                }

                @Override // X.InterfaceC21260718Ib
                public final void LJIJI() {
                }

                @Override // X.InterfaceC21260718Ib
                public final void LJIJJLI() {
                }

                @Override // X.InterfaceC21260718Ib
                public final String getDeviceId() {
                    String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
                    return strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null ? "" : strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId;
                }

                @Override // X.InterfaceC21260718Ib
                public final CopyOnWriteArraySet<C1206720hVW> LIZ() {
                    Class<? extends Fragment> clsLJJLJLI;
                    CopyOnWriteArraySet<C1206720hVW> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                    copyOnWriteArraySet.add(new C1206720hVW(null, "com.bytedance.hybrid.spark.page.SparkActivity", 1));
                    copyOnWriteArraySet.add(new C1206720hVW(SparkPopup.class, null, 2));
                    copyOnWriteArraySet.add(new C1206720hVW(null, "com.ss.android.ugc.aweme.ecommercelive.audience.common.preload.ShopBagListSparkFragment", 1));
                    ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                    if (iSparkHostApi != null && (clsLJJLJLI = iSparkHostApi.LJJLJLI()) != null) {
                        copyOnWriteArraySet.add(new C1206720hVW(clsLJJLJLI, null, 2));
                    }
                    return copyOnWriteArraySet;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [X.15Wa] */
                @Override // X.InterfaceC21260718Ib
                public final C20532615Wa LIZIZ() {
                    return new InterfaceC21259418Ho() { // from class: X.15Wa
                        @Override // X.InterfaceC21259418Ho
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC21259418Ho
                        public final String LIZIZ() {
                            return C15WX.LIZLLL.LIZ();
                        }
                    };
                }

                @Override // X.InterfaceC21260718Ib
                public final boolean LIZJ() {
                    C844470XAv.LIZ.getClass();
                    return Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
                }

                @Override // X.InterfaceC21260718Ib
                public final AwS662S0100000_13 LJFF() {
                    return new AwS662S0100000_13(this, 2);
                }

                @Override // X.InterfaceC21260718Ib
                public final List<String> LJI() {
                    return C1697810uHb.LJIIJJI("//ec/", "//live", "//aweme/detail", "//search", "//chat", "caravel%2Fcampaign", "ug%2Fads%2Flanding");
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [X.18J5] */
                @Override // X.InterfaceC21260718Ib
                public final C18J5 LJII() {
                    return new C18IH() { // from class: X.18J5
                        @Override // X.C18HY
                        public final void d(String str, String str2) {
                            C2344809Gs.LIZLLL(3, str, str2);
                        }

                        @Override // X.C18HY
                        public final void e(String str, String str2) {
                            C2344809Gs.LIZLLL(6, str, str2);
                        }

                        @Override // X.C18HY
                        public final void i(String str, String str2) {
                            C2344809Gs.LIZLLL(4, str, str2);
                        }
                    };
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [X.14jK] */
                @Override // X.InterfaceC21260718Ib
                public final C20346014jK LJIIIZ() {
                    return new InterfaceC21257118Gr() { // from class: X.14jK
                        @Override // X.InterfaceC21257118Gr
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC21257118Gr
                        public final ExecutorService LIZ() {
                            return C823050WQl.LIZLLL();
                        }

                        @Override // X.InterfaceC21257118Gr
                        public final ScheduledExecutorService LIZIZ() {
                            return C823050WQl.LJ();
                        }

                        @Override // X.InterfaceC21257118Gr
                        public final ExecutorService LIZLLL() {
                            return C823050WQl.LIZJ();
                        }
                    };
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [X.18HN] */
                @Override // X.InterfaceC21260718Ib
                public final C18HN LJIIJJI() {
                    return new InterfaceC21244918Bz() { // from class: X.18HN
                        @Override // X.InterfaceC21244918Bz
                        public final BtmEventConfigModel LIZ() {
                            BtmEventConfigModel btmEventConfigModel = C18C1.LIZ;
                            C0C59 c0c59LJ = C0C59.LJ();
                            BtmEventConfigModel btmEventConfigModel2 = C18C1.LIZ;
                            BtmEventConfigModel btmEventConfigModel3 = (BtmEventConfigModel) c0c59LJ.LJIILIIL(BtmEventConfigModel.class, btmEventConfigModel2, "bd_btm_event_config", false);
                            return btmEventConfigModel3 != null ? btmEventConfigModel3 : btmEventConfigModel2;
                        }
                    };
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [X.18IU] */
                @Override // X.InterfaceC21260718Ib
                public final C18IU LJIIL() {
                    return new C18DK() { // from class: X.18IU
                        @Override // X.C18DK
                        public void onEventV1(C786530UtH c786530UtH) {
                        }

                        @Override // X.C18DK
                        public void onEventV3(C1523880pl4 c1523880pl4) {
                            String str = c1523880pl4.LIZ;
                            if (str == null) {
                                return;
                            }
                            if (Intrinsics.LJFF(str, "btm_page_show")) {
                                c1523880pl4.LIZ = "btm_page_show_bd";
                            }
                            C1523880pl4 c1523880pl42 = new C1523880pl4(c1523880pl4.LIZ, c1523880pl4.LIZIZ);
                            BtmSDK.INSTANCE.addBtmEventParam(c1523880pl42);
                            AppLogNewUtils.onEventV3(c1523880pl42.LIZ, c1523880pl42.LIZIZ);
                        }
                    };
                }

                @Override // X.InterfaceC21260718Ib
                public final int LJIILIIL() {
                    InitBtmSDKTask.LL.getClass();
                    if (InitBtmSDKTask.LJ()) {
                        return 2;
                    }
                    return InitBtmSDKTask.LIZ() ? 1 : 0;
                }

                @Override // X.InterfaceC21260718Ib
                public final CopyOnWriteArraySet<String> LJIILL() {
                    CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                    copyOnWriteArraySet.add("com.ss.android.ugc.aweme.splash.SplashActivity");
                    copyOnWriteArraySet.add("com.ss.android.ugc.aweme.main.MainActivity");
                    return copyOnWriteArraySet;
                }

                @Override // X.InterfaceC21260718Ib
                public final Application LJIJJ() {
                    C844470XAv.LIZ.getClass();
                    return (Application) C844470XAv.LIZ();
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [X.18J4] */
                @Override // X.InterfaceC21260718Ib
                public final C18J4 LJJII() {
                    return new C18A9() { // from class: X.18J4
                        @Override // X.C18A9
                        public final void LIZ(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
                            if (jSONObject != null) {
                                C844470XAv.LIZ.getClass();
                                jSONObject.putOpt("update_version_code", Long.valueOf(C844470XAv.LIZLLL()));
                            }
                            C793770VBv.LJII("btmsdk_monitor", jSONObject, null, jSONObject2);
                        }
                    };
                }

                @Override // X.InterfaceC21260718Ib
                public final int getAppId() {
                    C844470XAv.LIZ.getClass();
                    return C844470XAv.LJIIJ;
                }

                @Override // X.InterfaceC21260718Ib
                public final String getUpdateVersionCode() {
                    C844470XAv.LIZ.getClass();
                    return String.valueOf(C844470XAv.LIZLLL());
                }

                @Override // X.InterfaceC21260718Ib
                public final String getVersionName() {
                    C844470XAv.LIZ.getClass();
                    return C844470XAv.LJFF();
                }
            });
        } else {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            C18IS c18is = new C18IS();
            C844470XAv.LIZ.getClass();
            c18is.LIZ = (Application) C844470XAv.LIZ();
            c18is.LJIIIZ = new String[]{String.valueOf(C844470XAv.LJIIJ)};
            c18is.LJIILL = C844470XAv.LJIIJ;
            c18is.LJIIJ = "a2270";
            String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
            if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null) {
                strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = "";
            }
            c18is.LJIIL = strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId;
            c18is.LIZIZ = Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
            c18is.LJIILIIL = C844470XAv.LJFF();
            c18is.LJIILJJIL = String.valueOf(C844470XAv.LIZLLL());
            c18is.LJIIJJI = true;
            c18is.LIZJ = new C18DK() { // from class: X.18IT
                @Override // X.C18DK
                public void onEventV1(C786530UtH c786530UtH) {
                }

                @Override // X.C18DK
                public void onEventV3(C1523880pl4 c1523880pl4) {
                    String str = c1523880pl4.LIZ;
                    if (str == null) {
                        return;
                    }
                    if (Intrinsics.LJFF(str, "btm_page_show")) {
                        c1523880pl4.LIZ = "btm_page_show_bd";
                    }
                    C1523880pl4 c1523880pl42 = new C1523880pl4(c1523880pl4.LIZ, c1523880pl4.LIZIZ);
                    BtmSDK.INSTANCE.addBtmEventParam(c1523880pl42);
                    AppLogNewUtils.onEventV3(c1523880pl42.LIZ, c1523880pl42.LIZIZ);
                }
            };
            c18is.LJFF = new C18IH() { // from class: X.18J2
                @Override // X.C18HY
                public final void d(String str, String str2) {
                    C2344809Gs.LIZLLL(3, str, str2);
                }

                @Override // X.C18HY
                public final void e(String str, String str2) {
                    C2344809Gs.LIZLLL(6, str, str2);
                }

                @Override // X.C18HY
                public final void i(String str, String str2) {
                    C2344809Gs.LIZLLL(4, str, str2);
                }
            };
            c18is.LJIIIIZZ = new AwS662S0100000_13(c18is, 0);
            c18is.LJ = new InterfaceC21259418Ho() { // from class: X.15WZ
                @Override // X.InterfaceC21259418Ho
                public final void LIZJ() {
                }

                @Override // X.InterfaceC21259418Ho
                public final String LIZIZ() {
                    return C15WX.LIZLLL.LIZ();
                }
            };
            c18is.LIZLLL = new InterfaceC21259418Ho() { // from class: X.15WY
                @Override // X.InterfaceC21259418Ho
                public final void LIZJ() {
                }

                @Override // X.InterfaceC21259418Ho
                public final String LIZIZ() {
                    Object c098200Yq;
                    try {
                        JSONObject jSONObject = new JSONObject("{\"feature\":{\"btm_page_show\":{\"switch\":0}}}");
                        JSONObject jSONObject2 = new JSONObject(C15WW.LIZLLL.LIZ());
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            jSONObject.put(next, jSONObject2.get(next));
                        }
                        c098200Yq = C786410Ut5.J3(jSONObject);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    return (String) (C189200o6.m7isFailureimpl(c098200Yq) ? "{\"feature\":{\"btm_page_show\":{\"switch\":0}}}" : c098200Yq);
                }
            };
            c18is.LJII = new InterfaceC21257118Gr() { // from class: X.15Wb
                @Override // X.InterfaceC21257118Gr
                public final void LIZJ() {
                }

                @Override // X.InterfaceC21257118Gr
                public final ExecutorService LIZ() {
                    return C823050WQl.LIZLLL();
                }

                @Override // X.InterfaceC21257118Gr
                public final ScheduledExecutorService LIZIZ() {
                    return C823050WQl.LJ();
                }

                @Override // X.InterfaceC21257118Gr
                public final ExecutorService LIZLLL() {
                    return C823050WQl.LIZJ();
                }
            };
            c18is.LJI = new C18A9() { // from class: X.18J3
                @Override // X.C18A9
                public final void LIZ(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
                    if (jSONObject != null) {
                        C844470XAv.LIZ.getClass();
                        jSONObject.putOpt("update_version_code", Long.valueOf(C844470XAv.LIZLLL()));
                    }
                    C793770VBv.LJII("btmsdk_monitor", jSONObject, null, jSONObject2);
                }
            };
            c18is.LJIILLIIL = "b99133";
            c18is.LJIJ = C1697810uHb.LJIIJJI("//ec/", "//live", "//aweme/detail", "//search", "//chat", "caravel%2Fcampaign", "ug%2Fads%2Flanding");
            btmSDK.init(c18is);
            C18IP depend = btmSDK.getDepend();
            depend.LJIIIIZZ(new C1206720hVW(SparkActivity.class, null, 2));
            depend.LJIIIIZZ(new C1206720hVW(SparkPopup.class, null, 2));
            C18IP depend2 = btmSDK.getDepend();
            String[] strArr = {"com.ss.android.ugc.aweme.splash.SplashActivity", "com.ss.android.ugc.aweme.main.MainActivity"};
            depend2.getClass();
            int i = 0;
            do {
                String str = strArr[i];
                if (str != null && str.length() != 0) {
                    ((CopyOnWriteArraySet) C18IP.LJJIII.getValue(depend2, C18IP.LIZIZ[22])).add(str);
                }
                i++;
            } while (i < 2);
        }
        if (((Boolean) LLIZ.getValue()).booleanValue() && ((Number) C285640BHm.LIZ.getValue()).intValue() != 1) {
            C786410Ut5.LJLIIL(3000L, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0p7w
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("InitBtmSDKTask@8f62.initCore$3");
                    try {
                        C1515120pWw.LIZIZ(new BtmSDKNetworkInterceptor());
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("InitBtmSDKTask@8f62.initCore$3");
                }
            });
        }
        if (LIZ()) {
            C18J9 c18j9 = new C18J9() { // from class: X.18JA
                @Override // X.C18B6
                public final BCMForestLoader LIZIZ() {
                    return new BCMForestLoader("bcm_config", new JSONObject().put("bcm_in_chain", C1697810uHb.LJIIJJI("search_id", "traffic_diversion_info", "bcm_nova_delivery_id", "bcm_feed_tab", "bcm_nova_page_id", "bcm_multiverse_id", "impr_id", "search_source", "business_domain", "live_request_id", "room_id", "product_id", "bcm_nova_page_delivery_id", "search_result_pid", "search_result_card_type", "search_result_id", "pontos_id", "pontos_attr", "traffic_from", "shop_id", "shop_traffic_from", "list_item_id", "ec_is_video_page", "osp_addon_scene", "bcm_crm_id", "crm_type", "crm_algo_param", "crm_scenario", "pangle_clickid", "overflow_search_id", "mall_out_source", "gd_label", "shoptab_traffic_id", "bcm_modu_id", "hot_start_link_interval", "entrance_form", "request_id", "aweme_type", "group_id", "doc_id", "ai_trace_id", "session_id", "message_id", "active_status", "activity_type", "channel_id", "sub_channel_id", "active_scenario", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "brand_id", "ecom_dynamic_photo_mode_type", "current_photo_index", "image_group_id", "page_style")));
                }

                @Override // X.C18B6
                public final BCMForestLoader LIZJ() {
                    return new BCMForestLoader("bcm_check", null);
                }
            };
            C18BV.LIZ();
            C18B2.LIZ.getClass();
            C18B2.LJFF = c18j9;
            C18BV.LIZ.init();
        } else {
            C18BV.LIZ();
            C18B2 c18b2 = C18B2.LIZ;
            c18b2.getClass();
            LazyNullable lazyNullable = C18B2.LIZJ;
            InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = C18B2.LIZIZ;
            lazyNullable.setValue(c18b2, interfaceC2217461BqaArr[0], null);
            C18B2.LIZLLL.setValue(c18b2, interfaceC2217461BqaArr[1], null);
            C18B2.LJ.setValue(c18b2, interfaceC2217461BqaArr[2], null);
            C18BV.LIZ.init();
            C21242718Bd c21242718Bd = new C21242718Bd();
            c21242718Bd.LIZ = true;
            C18BV.LIZ.configBusiness("ecom_entrance", c21242718Bd);
        }
        if (LJ()) {
            BtmSDK.INSTANCE.preloadWhenInit();
        }
        LLILLL = true;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!LLILLJJLI) {
            LJIIIIZZ();
        }
    }
}
