package com.ss.android.ugc.aweme.screenshot.configuration;

import X.AbstractC1372680lpC;
import X.C1371970lo3;
import X.C1373240lq6;
import X.C13LE;
import X.C498750JhB;
import X.InterfaceC1364520lc2;
import X.InterfaceC1366490lfD;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371860lns;
import Y.ARunnableS107S0100000_7;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol;
import com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol;
import com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ScreenShotLiveShareConfiguration extends ScreenShotShareConfiguration<LiveSharePackage> {
    public static final C1371970lo3 LLILLJJLI = new C1371970lo3(C13LE.LIZ(LiveSharePackage.class));

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final AbstractC1372680lpC LIZLLL() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.screenshot.configuration.ScreenShotShareConfiguration, com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final CustomSharePanelBarProtocol LIZ(BaseSharePackage baseSharePackage) {
        return new TTCustomSharePanelBarProtocol() { // from class: com.ss.android.ugc.aweme.screenshot.configuration.ScreenShotLiveShareConfiguration$getCustomSharePanelBar$1
            @Override // com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol, com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
            public final boolean PK1() {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol, com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
            public final InterfaceC1364520lc2 Ca2() {
                return new InterfaceC1364520lc2() { // from class: X.0JEr
                    @Override // X.InterfaceC1364520lc2
                    public final void LIZLLL(HashMap<String, String> map) {
                    }

                    @Override // X.InterfaceC1364520lc2
                    public final void LJ(HashMap<String, String> map) {
                    }

                    @Override // X.InterfaceC1364520lc2
                    public final void LJFF(Dialog dialog) {
                    }

                    @Override // X.InterfaceC1364520lc2
                    public final void LJI(Dialog dialog) {
                    }

                    @Override // X.InterfaceC1364520lc2
                    public final void LJII(BaseSharePackage baseSharePackage2) {
                    }

                    @Override // X.InterfaceC1364520lc2
                    public final void LJIIIIZZ(BaseSharePackage baseSharePackage2) {
                    }

                    @Override // X.InterfaceC1364520lc2
                    public final void LJIIIZ() {
                    }

                    @Override // X.InterfaceC1364520lc2
                    public final void LJIIJ() {
                    }

                    @Override // X.InterfaceC1364520lc2
                    public final void LJIIJJI(BaseSharePackage baseSharePackage2, String str) {
                    }

                    @Override // X.InterfaceC1364520lc2
                    public final void LJIIL(BaseSharePackage baseSharePackage2) {
                    }

                    @Override // X.InterfaceC1364520lc2
                    public final void LJIILIIL(BaseSharePackage baseSharePackage2) {
                    }

                    @Override // X.InterfaceC1364520lc2
                    public final void LIZIZ(HashMap<String, String> map) {
                        ExecutorService executorServiceLIZLLL = C823050WQl.LIZLLL();
                        if (executorServiceLIZLLL != null) {
                            executorServiceLIZLLL.submit(new ARunnableS107S0100000_7(map, 147));
                        }
                    }
                };
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SharePanelLogicProtocol LJ(final BaseSharePackage baseSharePackage) {
        return new TTSharePanelLogicProtocol(baseSharePackage) { // from class: com.ss.android.ugc.aweme.screenshot.configuration.ScreenShotLiveShareConfiguration$getSharePanelLogicProtocol$1
            public final C1373240lq6 LLILLJJLI = new InterfaceC1366490lfD() { // from class: X.0lq6
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
        return new TTShareChannelProtocol(this) { // from class: com.ss.android.ugc.aweme.screenshot.configuration.ScreenShotLiveShareConfiguration$getShareChannelProtocol$1
            public final C498750JhB LLILLL;

            @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
            public final List<InterfaceC1369790lkX> KB0() {
                List<InterfaceC1369790lkX> listKB0 = super.KB0();
                BaseSharePackage baseSharePackage2 = this.LLILZ;
                String string = baseSharePackage2.extras.getString("enter_from");
                if (string == null) {
                    string = "";
                }
                ShareDependService.LIZ.getClass();
                ImChannel imChannelLJJJIL = ShareDependServiceImpl.LJJJJI().LJJJIL((SharePackage) baseSharePackage2, string);
                if (imChannelLJJJIL != null) {
                    listKB0.add(imChannelLJJJIL);
                }
                return listKB0;
            }

            @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
            public final /* bridge */ /* synthetic */ InterfaceC1371860lns LK0() {
                return this.LLILLL;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0JhB] */
            {
                super(this.LLILZ);
                this.LLILLL = new InterfaceC1371860lns() { // from class: X.0JhB
                    @Override // X.InterfaceC1371860lns
                    public final void LIZIZ(BaseSharePackage baseSharePackage2, List list) {
                    }

                    @Override // X.InterfaceC1371860lns
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC1371860lns
                    public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage2, Context context2) {
                        int iLJII;
                        String str;
                        String str2;
                        InterfaceC20673515v3 interfaceC20673515v3K4;
                        InterfaceC488740JEq interfaceC488740JEqLJJJJLL;
                        InterfaceC20673515v3 interfaceC20673515v3K42;
                        if (!(baseSharePackage2 instanceof LiveSharePackage)) {
                            baseSharePackage2 = null;
                        }
                        if (z && baseSharePackage2 != null) {
                            this.getClass();
                            if (!TextUtils.equals(interfaceC1369790lkX.key(), "chat_merge")) {
                                ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                                if (iLiveOuterService != null && (interfaceC20673515v3K42 = iLiveOuterService.k4()) != null) {
                                    iLJII = interfaceC20673515v3K42.LJII();
                                } else {
                                    iLJII = 0;
                                }
                                HashMap map = new HashMap();
                                map.put("share_platform", interfaceC1369790lkX.key());
                                map.put("to_user_id", "out_app_share");
                                map.put("rank_index", "-1");
                                map.put("share_relation_type", "out_app_share");
                                map.put("share_follow_status", "");
                                if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "chat_merge")) {
                                    str = "shot_in_app";
                                } else {
                                    str = "shot_auto_guide";
                                }
                                map.put("panel_source", str);
                                if (iLJII > 0) {
                                    str2 = "1";
                                } else {
                                    str2 = CardStruct.IStatusCode.DEFAULT;
                                }
                                map.put("is_guest_connection", str2);
                                ILiveOuterService iLiveOuterService2 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                                if (iLiveOuterService2 != null && (interfaceC20673515v3K4 = iLiveOuterService2.k4()) != null && (interfaceC488740JEqLJJJJLL = interfaceC20673515v3K4.LJJJJLL("livesdk_share_v2")) != null) {
                                    interfaceC488740JEqLJJJJLL.LIZIZ(map);
                                    C474500IjA c474500IjALIZJ = interfaceC488740JEqLJJJJLL.LIZJ();
                                    if (c474500IjALIZJ != null) {
                                        c474500IjALIZJ.LIZ();
                                    }
                                }
                            }
                        }
                    }
                };
            }
        };
    }
}
