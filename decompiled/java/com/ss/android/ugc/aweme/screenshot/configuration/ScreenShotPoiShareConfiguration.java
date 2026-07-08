package com.ss.android.ugc.aweme.screenshot.configuration;

import X.AbstractC1372680lpC;
import X.C1367450lgl;
import X.C1371970lo3;
import X.C13LE;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371860lns;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.PoiSharePackage;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ScreenShotPoiShareConfiguration extends ScreenShotShareConfiguration<PoiSharePackage> {
    public static final C1371970lo3 LLILLJJLI = new C1371970lo3(C13LE.LIZ(PoiSharePackage.class));

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final AbstractC1372680lpC LIZLLL() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareChannelProtocol LIZJ(Context context, final BaseSharePackage baseSharePackage) {
        return new TTShareChannelProtocol(baseSharePackage) { // from class: com.ss.android.ugc.aweme.screenshot.configuration.ScreenShotPoiShareConfiguration$getShareChannelProtocol$1
            public final C1367450lgl LLILLL = new InterfaceC1371860lns() { // from class: X.0lgl
                @Override // X.InterfaceC1371860lns
                public final void LIZIZ(BaseSharePackage baseSharePackage2, List list) {
                }

                @Override // X.InterfaceC1371860lns
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1371860lns
                public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage2, Context context2) {
                    Map<String, String> mapLIZ;
                    Set<String> setKeySet;
                    Object obj;
                    Unit unit;
                    Set<String> setKeySet2;
                    if (!(baseSharePackage2 instanceof PoiSharePackage)) {
                        return;
                    }
                    C830490Whz c830490Whz = new C830490Whz();
                    try {
                        Bundle bundle = ((PoiSharePackage) baseSharePackage2).extras.getBundle("poi_common_params");
                        if (bundle != null && (setKeySet2 = bundle.keySet()) != null) {
                            for (String str : setKeySet2) {
                                String string = bundle.getString(str);
                                if (C123100dR.LIZ(string) && string != null) {
                                    c830490Whz.put(str, string);
                                }
                            }
                            unit = Unit.LIZ;
                        } else {
                            unit = null;
                        }
                        C189200o6.m2constructorimpl(unit);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    c830490Whz.put("enter_from", baseSharePackage2.extras.getString("enter_from"));
                    String string2 = baseSharePackage2.extras.getString("enter_method");
                    if (string2 == null) {
                        string2 = "";
                    }
                    c830490Whz.put("enter_method", string2);
                    c830490Whz.put("platform", interfaceC1369790lkX.key());
                    c830490Whz.put("poi_id", baseSharePackage2.extras.getString("poi_id", ""));
                    c830490Whz.put("poi_city", baseSharePackage2.extras.getString("poi_city", ""));
                    c830490Whz.put("poi_region_code", baseSharePackage2.extras.getString("poi_region_code", ""));
                    c830490Whz.put("poi_info_source", baseSharePackage2.extras.getString("poi_info_source", ""));
                    c830490Whz.put("enable_location", baseSharePackage2.extras.getString("enable_location", ""));
                    c830490Whz.put("previous_page", baseSharePackage2.extras.getString("previous_page", ""));
                    c830490Whz.put("poi_detail_enter_from", baseSharePackage2.extras.getString("poi_detail_enter_from", ""));
                    c830490Whz.put("poi_detail_enter_method", baseSharePackage2.extras.getString("poi_detail_enter_method", ""));
                    String string3 = baseSharePackage2.extras.getString("initial_poi_enter_from", "");
                    if (string3 != null && C123100dR.LIZ(string3)) {
                        c830490Whz.put("initial_poi_enter_from", string3);
                    }
                    String string4 = baseSharePackage2.extras.getString("initial_poi_from_group_id", "");
                    if (string4 != null && C123100dR.LIZ(string4)) {
                        c830490Whz.put("initial_poi_from_group_id", string4);
                    }
                    c830490Whz.put("initial_poi_enter_method", baseSharePackage2.extras.getString("initial_poi_enter_method", ""));
                    String string5 = baseSharePackage2.extras.getString("group_id", "");
                    if (string5 != null && C123100dR.LIZ(string5)) {
                        c830490Whz.put("group_id", string5);
                    }
                    String string6 = baseSharePackage2.extras.getString("from_group_id", "");
                    if (string6 != null && C123100dR.LIZ(string6)) {
                        c830490Whz.put("from_group_id", string6);
                    }
                    String string7 = baseSharePackage2.extras.getString("poi_session_id", "");
                    if (string7 != null && C123100dR.LIZ(string7)) {
                        c830490Whz.put("poi_session_id", string7);
                    }
                    String string8 = baseSharePackage2.extras.getString("current_page", "");
                    if (string8 != null && C123100dR.LIZ(string8)) {
                        c830490Whz.put("current_page", string8);
                    }
                    String string9 = baseSharePackage2.extras.getString("ttls_panel_source", "");
                    if (string9 != null && C123100dR.LIZ(string9)) {
                        c830490Whz.put("ttls_panel_source", string9);
                    }
                    BaseBundle baseBundle = (BaseBundle) baseSharePackage2.extras.getParcelable("poi_extras");
                    if (baseBundle != null && (setKeySet = baseBundle.keySet()) != null) {
                        for (String str2 : setKeySet) {
                            try {
                                obj = baseBundle.get(str2);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                obj = null;
                            } catch (OutOfMemoryError e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                obj = null;
                            }
                            c830490Whz.put(str2, String.valueOf(obj));
                        }
                    }
                    C186600ng.LIZ(baseSharePackage2.extras.getString("collect_info"), c830490Whz);
                    ILocationService iLocationService = (ILocationService) PluggableExtentionKt.pluggableSpi$default(ILocationService.class, false, false, false, 14, null);
                    if (iLocationService != null && (mapLIZ = iLocationService.LIZ()) != null) {
                        c830490Whz.putAll(mapLIZ);
                    }
                    C20684815ws.LJIILLIIL("share_poi", c830490Whz);
                }
            };

            @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
            public final List<InterfaceC1369790lkX> KB0() {
                List<InterfaceC1369790lkX> listKB0 = super.KB0();
                Iterator<InterfaceC1369790lkX> it2 = listKB0.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().key(), "copy")) {
                        return listKB0;
                    }
                }
                listKB0.add(new CopyLinkChannel(false));
                return listKB0;
            }

            @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
            public final /* bridge */ /* synthetic */ InterfaceC1371860lns LK0() {
                return this.LLILLL;
            }
        };
    }
}
