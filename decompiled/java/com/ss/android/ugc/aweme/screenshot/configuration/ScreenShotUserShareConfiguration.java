package com.ss.android.ugc.aweme.screenshot.configuration;

import X.AbstractC1372680lpC;
import X.C1366590lfN;
import X.C1366600lfO;
import X.C1371970lo3;
import X.C13LE;
import X.InterfaceC1366490lfD;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371860lns;
import android.content.Context;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol;
import com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public final class ScreenShotUserShareConfiguration extends ScreenShotShareConfiguration<UserSharePackage> {
    public static final C1371970lo3 LLILLJJLI = new C1371970lo3(C13LE.LIZ(UserSharePackage.class));

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final AbstractC1372680lpC LIZLLL() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SharePanelLogicProtocol LJ(final BaseSharePackage baseSharePackage) {
        return new TTSharePanelLogicProtocol(baseSharePackage) { // from class: com.ss.android.ugc.aweme.screenshot.configuration.ScreenShotUserShareConfiguration$getSharePanelLogicProtocol$1
            public final C1366600lfO LLILLJJLI = new InterfaceC1366490lfD() { // from class: X.0lfO
                @Override // X.InterfaceC1361850lXj
                public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage2, Context context) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LIZIZ(Context context, BaseSharePackage baseSharePackage2, InterfaceC1370310llN interfaceC1370310llN) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LIZLLL(Context context, BaseSharePackage baseSharePackage2) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LJ(Context context, BaseSharePackage baseSharePackage2) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LJFF(Context context, BaseSharePackage baseSharePackage2, List list) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LJI(Context context, BaseSharePackage baseSharePackage2) {
                    ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LIZ();
                }

                @Override // X.InterfaceC1366490lfD
                public final void LIZJ(View view, C1371590lnR c1371590lnR, C1370190llB c1370190llB) {
                    ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LIZ();
                    if (!C1366580lfM.LIZIZ()) {
                        C1366610lfP.LL.getClass();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("external_display_count_no_action_");
                        sbLIZ.append(C1366610lfP.LLILLL);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        C01GW c01gw = C1366610lfP.LLILLJJLI;
                        int i = ((Keva) c01gw.getValue()).getInt(strLIZIZ, 0);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("external_update_time_");
                        sbLIZ2.append(C1366610lfP.LLILLL);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        ((Keva) c01gw.getValue()).storeInt(strLIZIZ, i + 1);
                        ((Keva) c01gw.getValue()).storeLong(strLIZIZ2, System.currentTimeMillis());
                    }
                }

                @Override // X.InterfaceC1361850lXj
                public final Object LJII(Context context, BaseSharePackage baseSharePackage2, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Unit unit = Unit.LIZ;
                    C099R.LJFF();
                    return unit;
                }
            };

            @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
            public final boolean Cj1() {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
            public final InterfaceC1366490lfD T72() {
                return this.LLILLJJLI;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareChannelProtocol LIZJ(Context context, final BaseSharePackage baseSharePackage) {
        return new TTShareChannelProtocol(baseSharePackage) { // from class: com.ss.android.ugc.aweme.screenshot.configuration.ScreenShotUserShareConfiguration$getShareChannelProtocol$1
            public final C1366590lfN LLILLL = new InterfaceC1371860lns() { // from class: X.0lfN
                @Override // X.InterfaceC1371860lns
                public final void LIZIZ(BaseSharePackage baseSharePackage2, List list) {
                }

                @Override // X.InterfaceC1371860lns
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1371860lns
                public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage2, Context context2) {
                    UserSharePackage userSharePackage;
                    User user;
                    User user2 = null;
                    if (baseSharePackage2 instanceof UserSharePackage) {
                        userSharePackage = (UserSharePackage) baseSharePackage2;
                        if (userSharePackage != null && (user = userSharePackage.user) != null) {
                            user2 = user;
                        }
                    } else {
                        userSharePackage = null;
                    }
                    C1366570lfL.LL.LIZLLL();
                    C1366610lfP.LL.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("external_display_count_no_action_");
                    sbLIZ.append(C1366610lfP.LLILLL);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("external_update_time_");
                    sbLIZ2.append(C1366610lfP.LLILLL);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    C01GW c01gw = C1366610lfP.LLILLJJLI;
                    ((Keva) c01gw.getValue()).storeInt(strLIZIZ, 0);
                    ((Keva) c01gw.getValue()).storeLong(strLIZIZ2, System.currentTimeMillis());
                    if (z && userSharePackage != null && user2 != null) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("platform", interfaceC1369790lkX.key());
                        String string = baseSharePackage2.extras.getString("related_gid");
                        String str = "";
                        if (string == null) {
                            string = "";
                        }
                        c2344009Gk.LJIIIIZZ("from_gid", string);
                        String string2 = userSharePackage.extras.getString("enter_method");
                        if (string2 == null) {
                            string2 = "";
                        }
                        c2344009Gk.LJIIIIZZ("enter_method", string2);
                        String string3 = userSharePackage.extras.getString("enter_from");
                        if (string3 != null) {
                            str = string3;
                        }
                        c2344009Gk.LJIIIIZZ("enter_from", str);
                        c2344009Gk.LJIIIIZZ("author_id", user2.getUid());
                        String string4 = baseSharePackage2.extras.getString("share_form");
                        if (string4 == null) {
                            string4 = "url_form";
                        }
                        c2344009Gk.LJIIIIZZ("share_form", string4);
                        c2344009Gk.LJIIIIZZ("panel_source", "screenshot_popup");
                        C20684815ws.LJIILLIIL("share_person", c2344009Gk.LIZ);
                    }
                }
            };

            @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
            public final List<InterfaceC1369790lkX> KB0() {
                return super.KB0();
            }

            @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
            public final /* bridge */ /* synthetic */ InterfaceC1371860lns LK0() {
                return this.LLILLL;
            }
        };
    }
}
