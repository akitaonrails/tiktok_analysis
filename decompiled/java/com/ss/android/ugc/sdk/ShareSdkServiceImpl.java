package com.ss.android.ugc.sdk;

import X.C1370370llT;
import X.InterfaceC1366500lfE;
import X.InterfaceC1367490lgp;
import X.InterfaceC1368120lhq;
import X.InterfaceC1369830lkb;
import X.InterfaceC1370080ll0;
import X.InterfaceC1370110ll3;
import X.InterfaceC1370360llS;
import X.InterfaceC1370540llk;
import X.InterfaceC1370610llr;
import X.InterfaceC1370850lmF;
import X.InterfaceC1371680lna;
import X.InterfaceC1374590lsH;
import Y.AComparatorS501S0100000_2;
import Y.ARunnableS72S0200000_3;
import Y.ARunnableS78S0200000_9;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.internalshare.api.service.IExternalCreateGroupService;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.share.ShareSdkService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.settings.EnhanceSharePanelUIConfig;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareSdkServiceImpl implements ShareSdkService {
    @Override // com.ss.android.ugc.aweme.share.ShareSdkService
    public final void LIZ() {
        InterfaceC1370110ll3 interfaceC1370110ll3 = new InterfaceC1370110ll3() { // from class: X.0llZ
            @Override // X.InterfaceC1370110ll3
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1370110ll3
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1370110ll3
            public final boolean LJI() {
                C844470XAv.LIZ.getClass();
                return Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
            }

            @Override // X.InterfaceC1370110ll3
            public final Context getApplicationContext() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LIZ();
            }

            @Override // X.InterfaceC1370110ll3
            public final boolean LJII() {
                return ((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).getNetworkStateForSharePanel() instanceof InterfaceC908440ZkQ;
            }

            @Override // X.InterfaceC1370110ll3
            public final C19500811Re LJIIIZ() {
                return C2214201BlK.LIZIZ();
            }

            @Override // X.InterfaceC1370110ll3
            public final Activity getCurrentActivity() {
                return C2214201BlK.LJFF();
            }

            @Override // X.InterfaceC1370110ll3
            public final void LJIIL() {
                String[] strArr = C1379150lzd.LIZ;
            }

            @Override // X.InterfaceC1370110ll3
            public final void isDebug() {
            }

            @Override // X.InterfaceC1370110ll3
            public final boolean LIZ(Activity activity) {
                return C726220SeC.LIZIZ.LIZ(activity);
            }

            @Override // X.InterfaceC1370110ll3
            public final boolean LIZJ(BaseSharePackage baseSharePackage) {
                String str;
                C01GW c01gw = C1367480lgo.LIZ;
                String str2 = null;
                if (baseSharePackage != null) {
                    str = baseSharePackage.itemType;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, "live") && Intrinsics.LJFF(baseSharePackage.extras.getString("enter_from"), "feed_live_long_press")) {
                    return true;
                }
                ArrayList arrayList = (ArrayList) C1367480lgo.LIZ.getValue();
                if (baseSharePackage != null) {
                    str2 = baseSharePackage.itemType;
                }
                return C13LP.LJJJJ(str2, arrayList);
            }

            @Override // X.InterfaceC1370110ll3
            public final boolean LIZLLL(BaseSharePackage baseSharePackage) {
                return C1367480lgo.LIZIZ(baseSharePackage);
            }

            @Override // X.InterfaceC1370110ll3
            public final int LJ(C1361400lX0 c1361400lX0) {
                if (C960203pA.LIZIZ(c1361400lX0)) {
                    return R.style.y0;
                }
                return R.style.xm;
            }

            @Override // X.InterfaceC1370110ll3
            public final boolean LJFF(BaseSharePackage baseSharePackage) {
                String str;
                if (baseSharePackage != null) {
                    str = baseSharePackage.itemType;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(str, "aweme") || (baseSharePackage != null && baseSharePackage.LJIILJJIL())) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1370110ll3
            public final boolean LJIIJ(Context context) {
                CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(context, "download", false)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1370110ll3
            public final void LJIIJJI(Activity activity) {
                INetworkStandardUIService iNetworkStandardUIService = (INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class);
                iNetworkStandardUIService.showNetworkToast(activity, iNetworkStandardUIService.getNetworkStateForSharePanel(), "");
            }

            @Override // X.InterfaceC1370110ll3
            public final void LJIILIIL(Context context) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS72S0200000_3(context, this, 44));
            }

            @Override // X.InterfaceC1370110ll3
            public final boolean LJIILJJIL(String str) {
                if (!Intrinsics.LJFF(str, "aweme") && !Intrinsics.LJFF(str, "aweme_photo") && !Intrinsics.LJFF(str, "now_post") && !Intrinsics.LJFF(str, "now_video") && !Intrinsics.LJFF(str, "now_post_memory")) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1370110ll3
            public final String LJIILL(BaseSharePackage baseSharePackage) {
                String str;
                int num;
                Map<String, EnumC1373410lqN> map = C1373400lqM.LIZ;
                Map<String, EnumC1373410lqN> map2 = C1373400lqM.LIZ;
                if (baseSharePackage == null || (str = baseSharePackage.itemType) == null) {
                    str = "";
                }
                EnumC1373410lqN enumC1373410lqN = map2.get(str);
                if (enumC1373410lqN != null) {
                    num = enumC1373410lqN.getNum();
                } else {
                    num = EnumC1373410lqN.SHARE_DEFAULT.getNum();
                }
                return String.valueOf(num);
            }
        };
        InterfaceC1370080ll0 interfaceC1370080ll0 = new InterfaceC1370080ll0() { // from class: X.0lkz
            @Override // X.InterfaceC1370080ll0
            public final void LIZ(Object obj) {
                C707370Rot.LIZ.LIZIZ("key_need_hide_pop_window").postValue(obj);
            }

            @Override // X.InterfaceC1370080ll0
            public final void LIZJ(Object obj) {
                if (obj instanceof InterfaceC487330J9f) {
                    C487280J9a.LIZJ((InterfaceC487330J9f) obj);
                }
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0J9f, X.0lky] */
            @Override // X.InterfaceC1370080ll0
            public final C1370060lky LIZIZ(int i, final C1370010lkt c1370010lkt) {
                ?? r0 = new InterfaceC487330J9f() { // from class: X.0lky
                    @Override // X.InterfaceC487330J9f
                    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
                        c1370010lkt.invoke();
                    }
                };
                C487280J9a.LIZ(i, r0);
                return r0;
            }
        };
        InterfaceC1371680lna interfaceC1371680lna = new InterfaceC1371680lna() { // from class: X.0llX
            @Override // X.InterfaceC1371680lna
            public final void d() {
                int i = C2187451AjH.LIZ;
            }

            @Override // X.InterfaceC1371680lna
            public final void e(String str, String str2) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZ(str, str2);
            }

            @Override // X.InterfaceC1371680lna
            public final void i(String str, String str2) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI(str, str2);
            }
        };
        InterfaceC1367490lgp interfaceC1367490lgp = new InterfaceC1367490lgp() { // from class: X.08Dn
            @Override // X.InterfaceC1367490lgp
            public final void LIZ(String str, Map map) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        c2344009Gk.LJFF(str2, (String) value);
                    } else if (value instanceof Long) {
                        c2344009Gk.LIZLLL(((Number) value).longValue(), str2);
                    } else if (value instanceof Integer) {
                        c2344009Gk.LIZJ(((Number) value).intValue(), str2);
                    } else if (value instanceof Double) {
                        c2344009Gk.LIZ(((Number) value).doubleValue(), str2);
                    } else if (value instanceof Float) {
                        c2344009Gk.LIZIZ(((Number) value).floatValue(), str2);
                    } else {
                        c2344009Gk.LJ(value, str2);
                    }
                }
                C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
            }
        };
        InterfaceC1368120lhq interfaceC1368120lhq = new InterfaceC1368120lhq() { // from class: X.0lmA
            @Override // X.InterfaceC1368120lhq
            public final void LIZLLL() {
                IInternalShareApi.LIZ.getClass();
                C1370970lmR.LIZ().LIZJ().LJIJJ(System.currentTimeMillis());
            }

            @Override // X.InterfaceC1368120lhq
            public final void LIZJ() {
                ((PerfMonitorService) ServiceManager.get().getService(PerfMonitorService.class)).stopFpsMonitor("share_panel");
            }

            @Override // X.InterfaceC1368120lhq
            public final void LJ() {
                ((PerfMonitorService) ServiceManager.get().getService(PerfMonitorService.class)).LIZLLL("share_panel");
            }

            @Override // X.InterfaceC1368120lhq
            public final void LIZ(Function0 function0, Function0 function02) {
                ((PerfMonitorService) ServiceManager.get().getService(PerfMonitorService.class)).LIZ(function0, function02);
            }

            @Override // X.InterfaceC1368120lhq
            public final void LIZIZ(String str, RecyclerView recyclerView, Function0 function0, Function0 function02) {
                ((PerfMonitorService) ServiceManager.get().getService(PerfMonitorService.class)).LIZJ(str, EnumC1618420sDY.RECYCLER_VIEW, recyclerView, function0, function02);
            }
        };
        InterfaceC1370540llk interfaceC1370540llk = new InterfaceC1370540llk() { // from class: X.0lne
            @Override // X.InterfaceC1370540llk
            public final int LJII() {
                return C19252910Tv.LIZIZ.LIZLLL().LJIILLIIL().LJ();
            }

            @Override // X.InterfaceC1370540llk
            public final boolean LIZ(boolean z) {
                return C19252910Tv.LIZIZ.LIZLLL().LJIJI().LIZ(z);
            }

            @Override // X.InterfaceC1370540llk
            public final int LIZIZ(boolean z) {
                return C19252910Tv.LIZIZ.LIZLLL().LJIILLIIL().LIZIZ(z);
            }

            @Override // X.InterfaceC1370540llk
            public final int LIZJ(boolean z) {
                return C19252910Tv.LIZIZ.LIZLLL().LJIILLIIL().LIZJ(z);
            }

            @Override // X.InterfaceC1370540llk
            public final void LJ(String str) {
                C19252910Tv.LIZIZ.LIZLLL().LIZIZ().LIZIZ("BaseListFragmentPanel", "SkeletonSharePanelFragment", str);
            }

            @Override // X.InterfaceC1370540llk
            public final boolean LJFF(int i) {
                if (i == 4 && C19252910Tv.LIZIZ.LIZLLL().LJIILLIIL().LJI(null)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1370540llk
            public final boolean LJIIIZ(int i) {
                if (i == 3 && C19252910Tv.LIZIZ.LIZLLL().LJIILLIIL().LJIIIZ(null)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1370540llk
            public final int LJIIJJI(C19EG c19eg) {
                C19252910Tv.LIZIZ.LIZLLL().LJIIIIZZ();
                return C0T45.LIZIZ(c19eg);
            }

            @Override // X.InterfaceC1370540llk
            public final boolean LJIIIIZZ(int i, boolean z) {
                if (i == 2) {
                    C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                    if (c19252910Tv.LIZLLL().LJIILLIIL().LJII() && c19252910Tv.LIZLLL().LJIJI().LIZ(z)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC1370540llk
            public final boolean LJIIJ(int i, boolean z) {
                if (!LJIIL(i, z) && !LJIIIIZZ(i, z) && !LJIIIZ(i) && !LJFF(i)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1370540llk
            public final boolean LJIIL(int i, boolean z) {
                if (i == 1) {
                    C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                    if (c19252910Tv.LIZLLL().LJIILLIIL().LJIIIIZZ() && c19252910Tv.LIZLLL().LJIJI().LIZ(z)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC1370540llk
            public final void LIZLLL(int i, View view, View view2, boolean z) {
                C19252910Tv.LIZIZ.LIZLLL().LJIILLIIL().LIZLLL(i, view, view2, z);
            }

            @Override // X.InterfaceC1370540llk
            public final void LJI(Context context, Fragment fragment, int i, TuxSheet tuxSheet, View view, int i2, boolean z, Integer num) {
                C19252910Tv.LIZIZ.LIZLLL().LJIILLIIL().LIZ(context, i, tuxSheet, view, i2, z);
            }
        };
        InterfaceC1374590lsH interfaceC1374590lsH = new InterfaceC1374590lsH() { // from class: X.0lsP
            public final C01GW LIZ = C452501pT.LIZIZ(new C1374680lsQ());

            @Override // X.InterfaceC1374590lsH
            public final void LIZ() {
            }

            @Override // X.InterfaceC1374590lsH
            public final boolean LIZIZ() {
                return ((Boolean) C267840Aec.LIZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1374590lsH
            public final boolean LIZLLL() {
                return ((Boolean) C267830Aeb.LIZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1374590lsH
            public final boolean LJFF() {
                return ((Boolean) C267850Aed.LIZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1374590lsH
            public final String LJII() {
                String strLJI;
                try {
                    SettingsManager.LIZLLL().getClass();
                    strLJI = SettingsManager.LJI("share_twitter_target_type", "com.twitter.composer.ComposerActivity");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                return strLJI != null ? strLJI : "com.twitter.composer.ComposerActivity";
            }

            @Override // X.InterfaceC1374590lsH
            public final int LJIIJ() {
                return ((Number) C267860Aee.LIZ.getValue()).intValue();
            }

            @Override // X.InterfaceC1374590lsH
            public final Map<String, Drawable> LJIIIIZZ() {
                return C1374750lsX.LIZIZ;
            }

            @Override // X.InterfaceC1374590lsH
            public final List<ShareChannelInfo> LJIIIZ() {
                return C1374750lsX.LIZ;
            }

            @Override // X.InterfaceC1374590lsH
            public final int LIZJ(String str) {
                C1375890luN.LIZ.getClass();
                return C1375890luN.LIZJ(str);
            }

            @Override // X.InterfaceC1374590lsH
            public final void LJ(Intent intent, String str) {
                int iIntValue;
                Integer num = (Integer) ((Map) this.LIZ.getValue()).get(str);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    List<ShareChannelInfo> list = C1374750lsX.LIZ;
                    if (list != null && !list.isEmpty()) {
                        Iterator<ShareChannelInfo> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next().channelKey, str)) {
                                iIntValue = 1207963395;
                                break;
                            }
                        }
                        iIntValue = -1;
                    } else {
                        iIntValue = -1;
                    }
                }
                C2429209fW.LIZ().appendDataFlowId(intent, iIntValue);
            }

            @Override // X.InterfaceC1374590lsH
            public final boolean LJI(List list, List list2) {
                boolean z;
                int i = 0;
                if (!C349180DmW.LIZJ) {
                    return false;
                }
                ArrayList arrayList = new ArrayList();
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LJ("enable_teens_repost_btn", 0) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !((Boolean) C1382810m5X.LJFF.getValue()).booleanValue()) {
                    arrayList.add("repost");
                }
                if (((Boolean) C1382810m5X.LJ.getValue()).booleanValue()) {
                    arrayList.add("repost");
                }
                arrayList.add("ai_remix");
                arrayList.add("live_repost");
                arrayList.add("live_repost_note");
                arrayList.add("download");
                arrayList.add("general_qr_code");
                C1234470iEH.LIZ.getClass();
                if (C1234470iEH.LIZ()) {
                    Keva repo = Keva.getRepo("is_support_invite_friends");
                    if (repo.getBoolean("is_support_invite_friends_channel", true)) {
                        repo.storeBoolean("is_support_invite_friends_channel", false);
                        arrayList.add("invitation");
                    }
                }
                if (((Number) C289300BVo.LIZ.getValue()).intValue() == 3) {
                    arrayList.add("personal_qr_code");
                }
                arrayList.add("beta_feedback");
                arrayList.addAll((Collection) C349180DmW.LJ.getValue());
                ArrayList arrayList2 = new ArrayList(C349180DmW.LIZ);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(list2);
                arrayList3.addAll((Collection) C349180DmW.LJFF.getValue());
                if (((Boolean) C1382810m5X.LJFF.getValue()).booleanValue()) {
                    arrayList3.add("repost");
                }
                arrayList3.add("more");
                C19719612Di.LJJIIJ(arrayList2, new C5183020f(C13LP.LJLIL(arrayList3, arrayList), (List<Function1<Function1<? super Boolean, Unit>, Unit>>) 159), true);
                List listLJJJJI = C13LP.LJJJJI(C13LP.LJLIL(arrayList3, C13LP.LJLIL(arrayList2, arrayList)));
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listLJJJJI, 10));
                for (Object obj : listLJJJJI) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        arrayList4.add(new Pair(obj, Integer.valueOf(i)));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList4);
                if (list.size() > 1) {
                    C08XD.LJJ(list, new AComparatorS501S0100000_2(mapLJIILLIIL, 2));
                }
                return true;
            }
        };
        InterfaceC1370360llS interfaceC1370360llS = new InterfaceC1370360llS() { // from class: X.0lqi
            @Override // X.InterfaceC1370360llS
            public final void LIZ() {
            }

            @Override // X.InterfaceC1370360llS
            public final boolean LJ() {
                EnhanceSharePanelUIConfig enhanceSharePanelUIConfigLIZIZ;
                if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && (enhanceSharePanelUIConfigLIZIZ = C1371040lmY.LIZIZ()) != null) {
                    return Intrinsics.LJFF(enhanceSharePanelUIConfigLIZIZ.preposeCreateGroup, Boolean.TRUE);
                }
                return false;
            }

            @Override // X.InterfaceC1370360llS
            public final void LJFF(String str) {
                Integer numValueOf;
                if (C1369870lkf.LJIL) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("enter_from", C1369870lkf.LJ);
                    linkedHashMap.put("panel_source", C1369870lkf.LJII);
                    linkedHashMap.put("item_type", C1369870lkf.LJIIIIZZ);
                    linkedHashMap.put("item_id", C1369870lkf.LJIIIZ);
                    linkedHashMap.put("unique_id", C1369870lkf.LJIILJJIL);
                    linkedHashMap.put("action_id", C1369870lkf.LJIIZILJ);
                    Boolean bool = C1369870lkf.LJIJJ;
                    if (bool != null) {
                        numValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                    } else {
                        numValueOf = null;
                    }
                    linkedHashMap.put("enabled", numValueOf);
                    linkedHashMap.put("scenario_status", Integer.valueOf(C1369870lkf.LJIJJLI));
                    linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
                    InterfaceC1367490lgp interfaceC1367490lgp2 = C1370370llT.LIZIZ;
                    if (interfaceC1367490lgp2 != null) {
                        interfaceC1367490lgp2.LIZ("action_clicked_block", linkedHashMap);
                    }
                }
            }

            @Override // X.InterfaceC1370360llS
            public final int LIZLLL(InterfaceC1370310llN interfaceC1370310llN, EnumC992970bwl enumC992970bwl) {
                C1373780lqy c1373780lqy;
                C419910GdJ c419910GdJ;
                C1374250lrj c1374250lrj;
                C1374250lrj c1374250lrj2;
                C1374250lrj c1374250lrj3;
                if (enumC992970bwl == EnumC992970bwl.ENHANCE_SHARE_ICON) {
                    Map<String, Integer> map = C1379180lzg.LIZ;
                    String strKey = interfaceC1370310llN.key();
                    int iHashCode = strKey.hashCode();
                    if (iHashCode != -934521548) {
                        if (iHashCode != -50093235) {
                            if (iHashCode == 1050790300 && strKey.equals("favorite")) {
                                if (interfaceC1370310llN instanceof C734790Ss1) {
                                    if (AwemeExtKt.isCollected(((C734790Ss1) interfaceC1370310llN).LLILLJJLI)) {
                                        return R.raw.icon_bookmark_fill;
                                    }
                                    return R.raw.icon_bookmark;
                                }
                                return interfaceC1370310llN.LJIIIIZZ();
                            }
                        } else if (strKey.equals("captions")) {
                            if (interfaceC1370310llN instanceof C1381070m2j) {
                                C1381070m2j c1381070m2j = (C1381070m2j) interfaceC1370310llN;
                                if (c1381070m2j.LIZIZ()) {
                                    return R.raw.icon_closed_captions;
                                }
                                if (c1381070m2j.LJ()) {
                                    return R.raw.icon_closed_captions_slash;
                                }
                                return R.raw.icon_text_latin_thin;
                            }
                            return interfaceC1370310llN.LJIIIIZZ();
                        }
                    } else if (strKey.equals("report")) {
                        if (interfaceC1370310llN instanceof C736320SuU) {
                            if (C736340SuW.LIZJ()) {
                                return R.raw.icon_exclamation_mark_triangle;
                            }
                            if (C736340SuW.LIZ() == 3) {
                                return R.raw.icon_exclamation_mark_bubble;
                            }
                            return R.raw.icon_flag;
                        }
                        return R.raw.icon_flag;
                    }
                    Integer num = C1379180lzg.LIZ.get(interfaceC1370310llN.key());
                    if (num != null) {
                        return num.intValue();
                    }
                    return interfaceC1370310llN.LJIIIIZZ();
                }
                if (enumC992970bwl == EnumC992970bwl.NORMAL_ICON) {
                    return interfaceC1370310llN.LJIIIIZZ();
                }
                if (enumC992970bwl == EnumC992970bwl.NORMAL_FILL_ICON) {
                    return interfaceC1370310llN.LJII();
                }
                if (enumC992970bwl == EnumC992970bwl.LONE_PRESS) {
                    if (interfaceC1370310llN instanceof C1376770lvn) {
                        C1376770lvn c1376770lvn = (C1376770lvn) interfaceC1370310llN;
                        C1376720lvi c1376720lvi = c1376770lvn.LL;
                        if (c1376720lvi != null && (c1374250lrj3 = c1376720lvi.LIZ) != null) {
                            return c1374250lrj3.LIZ;
                        }
                        return c1376770lvn.LJIIIIZZ();
                    }
                    if (interfaceC1370310llN instanceof C1376860lvw) {
                        return ((C1376860lvw) interfaceC1370310llN).LL.LIZ.LIZ;
                    }
                    if (interfaceC1370310llN instanceof C1374910lsn) {
                        return R.raw.icon_live_wallpaper;
                    }
                    if (interfaceC1370310llN instanceof C1376800lvq) {
                        C1376800lvq c1376800lvq = (C1376800lvq) interfaceC1370310llN;
                        C1373880lr8 c1373880lr8 = c1376800lvq.LL;
                        if (c1373880lr8 != null && (c1374250lrj2 = c1373880lr8.LIZ) != null) {
                            return c1374250lrj2.LIZ;
                        }
                        return c1376800lvq.LJIIIIZZ();
                    }
                    if (interfaceC1370310llN instanceof C1376780lvo) {
                        C1376780lvo c1376780lvo = (C1376780lvo) interfaceC1370310llN;
                        C1373910lrB c1373910lrB = c1376780lvo.LL;
                        if (c1373910lrB != null && (c1374250lrj = c1373910lrB.LIZ) != null) {
                            return c1374250lrj.LIZ;
                        }
                        return c1376780lvo.LJIIIIZZ();
                    }
                    if (interfaceC1370310llN instanceof C1376790lvp) {
                        C1376790lvp c1376790lvp = (C1376790lvp) interfaceC1370310llN;
                        C1373790lqz c1373790lqz = c1376790lvp.LL;
                        if (c1373790lqz != null && (c1373780lqy = c1373790lqz.LIZ) != null && (c419910GdJ = c1373780lqy.LIZ) != null) {
                            return c419910GdJ.LIZ;
                        }
                        return c1376790lvp.LJIIIIZZ();
                    }
                    if (interfaceC1370310llN instanceof C1380070m17) {
                        return R.raw.icon_question_mark_circle_ltr;
                    }
                    return interfaceC1370310llN.LJIIIIZZ();
                }
                return interfaceC1370310llN.LJIIIIZZ();
            }

            @Override // X.InterfaceC1370360llS
            public final boolean LIZIZ(final View view, InterfaceC1370310llN interfaceC1370310llN, final BaseSharePackage baseSharePackage, final AwS633S0100000_19 awS633S0100000_19) {
                AwemeACLShare awemeACLShareInfo;
                C19EG c19eg;
                FragmentManager supportFragmentManager;
                List<Fragment> listLJJLIIIJL;
                Fragment fragment;
                boolean z;
                Activity activityLIZ = null;
                if (baseSharePackage instanceof AwemeSharePackage) {
                    awemeACLShareInfo = ((AwemeSharePackage) baseSharePackage).LJJIFFI().getAwemeACLShareInfo();
                } else {
                    awemeACLShareInfo = null;
                }
                if (awemeACLShareInfo == null) {
                    return true;
                }
                ACLCommonShare aCLCommonShareLIZIZ = C1373290lqB.LIZIZ(interfaceC1370310llN.key(), baseSharePackage.extras.getString("panel_source", "share_panel"), awemeACLShareInfo);
                if (aCLCommonShareLIZIZ == null) {
                    return true;
                }
                String popupMsg = aCLCommonShareLIZIZ.getPopupMsg();
                if (popupMsg == null) {
                    popupMsg = "";
                }
                int code = aCLCommonShareLIZIZ.getCode();
                if (!C1373290lqB.LIZ.contains(interfaceC1370310llN.key())) {
                    String strKey = interfaceC1370310llN.key();
                    if (!Intrinsics.LJFF(strKey, "save") && !Intrinsics.LJFF(strKey, "save_photo")) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (popupMsg.length() != 0) {
                        C1377040lwE c1377040lwE = C1377040lwE.LIZ;
                        Context context = view.getContext();
                        Integer numValueOf = Integer.valueOf(code);
                        InterfaceC1377050lwF interfaceC1377050lwF = new InterfaceC1377050lwF() { // from class: X.0hgN
                            @Override // X.InterfaceC1377050lwF
                            public final void LIZ() {
                            }

                            @Override // X.InterfaceC1377050lwF
                            public final void LIZIZ() {
                                awS633S0100000_19.invoke(view, baseSharePackage);
                            }
                        };
                        c1377040lwE.getClass();
                        C1377040lwE.LIZ(context, popupMsg, numValueOf, interfaceC1377050lwF, z);
                        return false;
                    }
                }
                String toastMsg = aCLCommonShareLIZIZ.getToastMsg();
                if (toastMsg != null && toastMsg.length() > 0) {
                    int code2 = aCLCommonShareLIZIZ.getCode();
                    if (code2 != 1) {
                        if (code2 == 2) {
                            C1373550lqb c1373550lqb = C1373550lqb.LIZ;
                            Context context2 = view.getContext();
                            String strKey2 = interfaceC1370310llN.key();
                            AFwS209S0000000_21 aFwS209S0000000_21 = AFwS209S0000000_21.get$arr$(551);
                            c1373550lqb.getClass();
                            C1373550lqb.LIZ(baseSharePackage, context2, view, strKey2, toastMsg, aFwS209S0000000_21);
                        }
                    } else {
                        boolean zLIZ = C299060Bns.LIZ();
                        Context context3 = view.getContext();
                        if (context3 != null) {
                            activityLIZ = C1388190mED.LIZ(context3);
                        }
                        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null && (fragment = (Fragment) C13LP.LJJLIIIJL(listLJJLIIIJL)) != null) {
                            if (zLIZ) {
                                C1389880mGw c1389880mGw = new C1389880mGw(fragment);
                                c1389880mGw.LJIIIZ(toastMsg);
                                c1389880mGw.LJIIJ();
                            } else {
                                C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                                c1389890mGx.LJIIJ(toastMsg);
                                c1389890mGx.LJIIJJI();
                            }
                        }
                    }
                }
                if (aCLCommonShareLIZIZ.getCode() == 0) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1370360llS
            public final void LIZJ(final TuxIconView tuxIconView, BaseSharePackage baseSharePackage, boolean z, final InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                final SharePackage sharePackage;
                if ((baseSharePackage instanceof SharePackage) && (sharePackage = (SharePackage) baseSharePackage) != null) {
                    IInternalShareApi.LIZ.getClass();
                    final C1229130i5f c1229130i5fLJIIZILJ = C1370970lmR.LIZ().LIZIZ().LJIIZILJ(sharePackage);
                    if (c1229130i5fLJIIZILJ == null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                        return;
                    }
                    C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0lkj
                        @Override // X.AbstractViewOnClickListenerC1637610siV
                        public final void LIZ(View view) {
                            if (view != null) {
                                c1229130i5fLJIIZILJ.LJIILIIL(tuxIconView.getContext(), sharePackage);
                                interfaceC1362720lZ8.F8(new C572630Md3());
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(300L);
                        }
                    }, tuxIconView);
                    c1229130i5fLJIIZILJ.LJJJI(tuxIconView.getContext(), sharePackage);
                    if (!z) {
                        return;
                    }
                    C01GW c01gw = C1372280loY.LIZ;
                    if (((Keva) c01gw.getValue()).getBoolean("key_create_group_tips_count", false)) {
                        return;
                    }
                    ((Keva) c01gw.getValue()).storeBoolean("key_create_group_tips_count", true);
                    HandlerHook.viewPost(tuxIconView, new ARunnableS78S0200000_9(tuxIconView, baseSharePackage, 104));
                }
            }
        };
        InterfaceC1366500lfE interfaceC1366500lfE = new InterfaceC1366500lfE() { // from class: X.0lhM
            @Override // X.InterfaceC1366500lfE
            public final void LJIIL() {
            }

            @Override // X.InterfaceC1366500lfE
            public final void LIZ() {
                IInternalShareApi.LIZ.getClass();
                C1370970lmR.LIZ().LIZJ().LIZ();
            }

            @Override // X.InterfaceC1366500lfE
            public final void LIZIZ() {
                IInternalShareApi.LIZ.getClass();
                C1370970lmR.LIZ().LIZJ().LIZIZ();
            }

            @Override // X.InterfaceC1366500lfE
            public final void LIZLLL() {
                IInternalShareApi.LIZ.getClass();
                C1370970lmR.LIZ().LIZJ().LIZLLL();
            }

            @Override // X.InterfaceC1366500lfE
            public final void LJFF() {
                IInternalShareApi.LIZ.getClass();
                C1370970lmR.LIZ().LIZJ().LJFF();
            }

            @Override // X.InterfaceC1366500lfE
            public final void LJI() {
                IInternalShareApi.LIZ.getClass();
                C1370970lmR.LIZ().LIZJ().LJI();
            }

            @Override // X.InterfaceC1366500lfE
            public final void LJII() {
                IInternalShareApi.LIZ.getClass();
                C1370970lmR.LIZ().LIZJ().LJII();
            }

            @Override // X.InterfaceC1366500lfE
            public final int LJIIIIZZ() {
                return C0BV2.LIZ();
            }

            @Override // X.InterfaceC1366500lfE
            public final boolean LJIIIZ(BaseSharePackage baseSharePackage) {
                Bundle bundle;
                if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null) {
                    return bundle.getBoolean("is_from_new_lpp");
                }
                return false;
            }

            @Override // X.InterfaceC1366500lfE
            public final boolean LJIIJ(BaseSharePackage baseSharePackage) {
                return ((IExternalCreateGroupService) C1229250i5r.LIZ.getValue()).LIZJ(baseSharePackage);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
            @Override // X.InterfaceC1366500lfE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LJIIJJI(com.ss.android.ugc.aweme.sharer.model.SharePackage r5) {
                /*
                    r4 = this;
                    X.01GW r0 = X.C1367840lhO.LIZIZ
                    java.lang.Object r0 = r0.getValue()
                    com.ss.android.ugc.aweme.internalshare.api.experiment.ShareTextPanelOpt r0 = (com.ss.android.ugc.aweme.internalshare.api.experiment.ShareTextPanelOpt) r0
                    boolean r0 = r0.hideCover
                    r3 = 0
                    if (r0 == 0) goto L28
                    if (r5 == 0) goto L47
                    android.os.Bundle r1 = r5.extras
                    if (r1 == 0) goto L47
                    java.lang.String r0 = "key_force_cover_style"
                    boolean r0 = r1.getBoolean(r0)
                L19:
                    r2 = 0
                    if (r0 != 0) goto L2b
                    if (r5 == 0) goto L29
                    java.lang.String r1 = r5.itemType
                L20:
                    java.lang.String r0 = "comment"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 == 0) goto L2b
                L28:
                    return r3
                L29:
                    r1 = r2
                    goto L20
                L2b:
                    if (r5 == 0) goto L45
                    java.lang.String r1 = r5.itemType
                L2f:
                    java.lang.String r0 = "aigc_avatar"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 != 0) goto L28
                    if (r5 == 0) goto L3b
                    java.lang.String r2 = r5.itemType
                L3b:
                    java.lang.String r0 = "social_avatar"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
                    if (r0 != 0) goto L28
                    r3 = 1
                    return r3
                L45:
                    r1 = r2
                    goto L2f
                L47:
                    r0 = 0
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1367820lhM.LJIIJJI(com.ss.android.ugc.aweme.sharer.model.SharePackage):boolean");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Iterable, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r9v0, types: [T, java.util.ArrayList, java.util.Collection] */
            @Override // X.InterfaceC1366500lfE
            public final ArrayList<InterfaceC1370450llb> LJIILIIL(C1371590lnR c1371590lnR) {
                InterfaceC1370310llN next;
                int i;
                String strLIZ;
                AwemeSharePackage awemeSharePackage;
                Aweme awemeLJJIFFI;
                List<InterfaceC1369790lkX> list = c1371590lnR.LIZ;
                List<InterfaceC1370310llN> list2 = c1371590lnR.LJFF;
                ArrayList<InterfaceC1370450llb> arrayList = new ArrayList<>();
                if (!list2.isEmpty() && !c1371590lnR.LJJIIZI) {
                    if (!C1367830lhN.LIZ(c1371590lnR)) {
                        arrayList.addAll(list2);
                        return arrayList;
                    }
                    Iterator<InterfaceC1370310llN> it2 = list2.iterator();
                    do {
                        next = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        next = it2.next();
                    } while (!Intrinsics.LJFF(next.key(), "promote"));
                    BaseSharePackage baseSharePackage = c1371590lnR.LJIJJ;
                    if ((baseSharePackage instanceof AwemeSharePackage) && (awemeSharePackage = (AwemeSharePackage) baseSharePackage) != null && (awemeLJJIFFI = awemeSharePackage.LJJIFFI()) != null) {
                        Intrinsics.LJFF(AwemeExtKt.getAuthorUid(awemeLJJIFFI), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<InterfaceC1370310llN> it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        InterfaceC1370310llN next2 = it3.next();
                        if (a0.LJJIIZI(next2.key(), "report", false)) {
                            if (next2 != null) {
                                if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                                    strLIZ = C0X2A.LIZJ;
                                } else {
                                    strLIZ = C2222691Bz1.LIZ();
                                }
                                if (C13LQ.LJIILLIIL(strLIZ.toUpperCase(Locale.ROOT), (Object[]) C1400260mXg.LIZIZ.getValue())) {
                                    arrayList.add(next2);
                                    arrayList.addAll(arrayList2);
                                } else {
                                    arrayList.addAll(arrayList2);
                                    arrayList.add(next2);
                                }
                                i = 1;
                            }
                        }
                    }
                    arrayList.addAll(arrayList2);
                    i = 0;
                    C259800zU c259800zU = new C259800zU();
                    ?? arrayList3 = new ArrayList();
                    for (InterfaceC1370310llN interfaceC1370310llN : list2) {
                        if (!a0.LJJIIZI(interfaceC1370310llN.key(), "report", false)) {
                            arrayList3.add(interfaceC1370310llN);
                        }
                    }
                    c259800zU.element = arrayList3;
                    if (next != null) {
                        int i2 = 1 - i;
                        ?? arrayList4 = new ArrayList();
                        for (Object obj : arrayList3) {
                            if (!Intrinsics.LJFF(((InterfaceC1370310llN) obj).key(), "promote")) {
                                arrayList4.add(obj);
                            }
                        }
                        c259800zU.element = arrayList4;
                        arrayList.addAll(C13LP.LL(arrayList4, i2));
                        arrayList.add(next);
                        arrayList.addAll(C13LP.LJJJJIZL((Iterable) c259800zU.element, i2));
                        return arrayList;
                    }
                    arrayList.addAll(arrayList3);
                    return arrayList;
                }
                arrayList.addAll(list);
                return arrayList;
            }
        };
        new Object() { // from class: X.0lla
        };
        InterfaceC1370610llr interfaceC1370610llr = new InterfaceC1370610llr() { // from class: X.0lcN
            @Override // X.InterfaceC1370610llr
            public final boolean LIZLLL() {
                return ((Boolean) C2277621ECy.LJ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1370610llr
            public final void LIZJ(C19EG c19eg) {
                IInternalShareApi.LIZ.getClass();
                C1370970lmR.LIZ().LIZIZ().LIZJ(c19eg);
            }

            @Override // X.InterfaceC1370610llr
            public final boolean LJ(C1371590lnR c1371590lnR) {
                return C1364440lbu.LIZ(c1371590lnR);
            }

            @Override // X.InterfaceC1370610llr
            public final View LIZ(Context context, int i, ViewGroup viewGroup) {
                IInternalShareApi.LIZ.getClass();
                return C1370970lmR.LIZ().LIZIZ().LIZ(context, i, viewGroup);
            }
        };
        InterfaceC1369830lkb interfaceC1369830lkb = new InterfaceC1369830lkb() { // from class: X.0lkk
            public final C1369930lkl LIZ = new C1369930lkl();
            public final C1369940lkm LIZIZ = new C1369940lkm();
            public final C1369900lki LIZJ = new C1369900lki();

            @Override // X.InterfaceC1369830lkb
            public final C1369940lkm LIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1369830lkb
            public final C1369930lkl LIZIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1369830lkb
            public final C1369900lki LIZJ() {
                return this.LIZJ;
            }
        };
        C1370370llT.LIZ = interfaceC1370110ll3;
        C1370370llT.LIZIZ = interfaceC1367490lgp;
        C1370370llT.LIZJ = interfaceC1371680lna;
        C1370370llT.LIZLLL = interfaceC1370080ll0;
        C1370370llT.LJI = interfaceC1368120lhq;
        C1370370llT.LJII = interfaceC1370540llk;
        C1370370llT.LJFF = interfaceC1370360llS;
        C1370370llT.LJIIIIZZ = interfaceC1366500lfE;
        C1370370llT.LJIIIZ = interfaceC1370610llr;
        C1370370llT.LJ = interfaceC1374590lsH;
        C1370370llT.LJIIJ = interfaceC1369830lkb;
        C1370370llT.LJIIJJI = new InterfaceC1370850lmF() { // from class: X.0llY
            @Override // X.InterfaceC1370850lmF
            public final boolean LIZ(int i, Object obj) {
                if (!(obj instanceof BottomSheetBehavior) || i != ((BottomSheetBehavior) obj).getExpandedOffset()) {
                    return false;
                }
                return true;
            }
        };
    }
}
