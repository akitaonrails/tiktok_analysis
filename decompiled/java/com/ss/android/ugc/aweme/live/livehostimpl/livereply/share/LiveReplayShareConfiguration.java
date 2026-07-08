package com.ss.android.ugc.aweme.live.livehostimpl.livereply.share;

import X.AbstractC1372680lpC;
import X.C1376640lva;
import X.C13LE;
import X.InterfaceC1364520lc2;
import X.InterfaceC1366490lfD;
import X.InterfaceC1369790lkX;
import X.InterfaceC1370310llN;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.share.LiveReplayShareData;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.share.LiveReplayShareModel;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol;
import com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol;
import com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig;
import com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveReplayShareConfiguration extends TTShareDefaultConfig<LiveReplaySharePackage> {
    public static final C1376640lva LLILLJJLI = new C1376640lva("live_replay", C13LE.LIZ(LiveReplaySharePackage.class));

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final AbstractC1372680lpC LIZLLL() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final CustomSharePanelBarProtocol LIZ(BaseSharePackage baseSharePackage) {
        return new TTCustomSharePanelBarProtocol() { // from class: com.ss.android.ugc.aweme.live.livehostimpl.livereply.share.LiveReplayShareConfiguration$getCustomSharePanelBar$1
            @Override // com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol, com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
            public final boolean PK1() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol, com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
            public final InterfaceC1364520lc2 Ca2() {
                return new InterfaceC1364520lc2() { // from class: X.0lxG
                    @Override // X.InterfaceC1364520lc2
                    public final void LIZIZ(HashMap<String, String> map) {
                    }

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
                        LiveReplayShareModel liveReplayShareModel;
                        LiveReplayShareData liveReplayShareData;
                        C766270U4b.LIZLLL(2131841053);
                        ShareModel shareModel = baseSharePackage2.shareModel;
                        if ((shareModel instanceof LiveReplayShareModel) && (liveReplayShareModel = (LiveReplayShareModel) shareModel) != null && (liveReplayShareData = liveReplayShareModel.shareData) != null) {
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_replay_video_page_share_success");
                            c474500IjALIZ.LJJII(liveReplayShareData.anchorId, "anchor_id");
                            c474500IjALIZ.LJJII(liveReplayShareData.roomId, "room_id");
                            c474500IjALIZ.LJJII(liveReplayShareData.enterFromPage, "enter_from_page");
                            c474500IjALIZ.LJJII(liveReplayShareData.enterFrom, "enter_from");
                            c474500IjALIZ.LJJII(liveReplayShareData.eventPage, "event_page");
                            c474500IjALIZ.LJJII(liveReplayShareData.shareContent, "share_content");
                            c474500IjALIZ.LJJII(liveReplayShareData.subTab, "sub_tab");
                            c474500IjALIZ.LJJIJL();
                        }
                    }
                };
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SharePanelLogicProtocol LJ(final BaseSharePackage baseSharePackage) {
        return new TTSharePanelLogicProtocol() { // from class: com.ss.android.ugc.aweme.live.livehostimpl.livereply.share.LiveReplayShareConfiguration$getSharePanelLogicProtocol$1
            @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
            public final InterfaceC1366490lfD T72() {
                final BaseSharePackage baseSharePackage2 = this.LLILLJJLI;
                return new InterfaceC1366490lfD() { // from class: X.0lxF
                    @Override // X.InterfaceC1361850lXj
                    public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage3, Context context) {
                    }

                    @Override // X.InterfaceC1366490lfD
                    public final void LIZIZ(Context context, BaseSharePackage baseSharePackage3, InterfaceC1370310llN interfaceC1370310llN) {
                    }

                    @Override // X.InterfaceC1366490lfD
                    public final void LIZLLL(Context context, BaseSharePackage baseSharePackage3) {
                    }

                    @Override // X.InterfaceC1366490lfD
                    public final void LJ(Context context, BaseSharePackage baseSharePackage3) {
                    }

                    @Override // X.InterfaceC1366490lfD
                    public final void LJFF(Context context, BaseSharePackage baseSharePackage3, List list) {
                    }

                    @Override // X.InterfaceC1366490lfD
                    public final void LJI(Context context, BaseSharePackage baseSharePackage3) {
                    }

                    @Override // X.InterfaceC1366490lfD
                    public final void LIZJ(View view, C1371590lnR c1371590lnR, C1370190llB c1370190llB) {
                        LiveReplayShareModel liveReplayShareModel;
                        LiveReplayShareData liveReplayShareData;
                        ShareModel shareModel = baseSharePackage2.shareModel;
                        if ((shareModel instanceof LiveReplayShareModel) && (liveReplayShareModel = (LiveReplayShareModel) shareModel) != null && (liveReplayShareData = liveReplayShareModel.shareData) != null) {
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_replay_video_page_share_click");
                            c474500IjALIZ.LJJII(liveReplayShareData.anchorId, "anchor_id");
                            c474500IjALIZ.LJJII(liveReplayShareData.roomId, "room_id");
                            c474500IjALIZ.LJJII(liveReplayShareData.enterFromPage, "enter_from_page");
                            c474500IjALIZ.LJJII(liveReplayShareData.enterFrom, "enter_from");
                            c474500IjALIZ.LJJII(liveReplayShareData.eventPage, "event_page");
                            c474500IjALIZ.LJJII(liveReplayShareData.subTab, "sub_tab");
                            c474500IjALIZ.LJJIJL();
                        }
                    }

                    @Override // X.InterfaceC1361850lXj
                    public final Object LJII(Context context, BaseSharePackage baseSharePackage3, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
                        Unit unit = Unit.LIZ;
                        C099R.LJFF();
                        return unit;
                    }
                };
            }

            {
                super(this.LLILLJJLI);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SheetActionProtocol LJI(final BaseSharePackage baseSharePackage) {
        return new TTSheetActionProtocol(baseSharePackage) { // from class: com.ss.android.ugc.aweme.live.livehostimpl.livereply.share.LiveReplayShareConfiguration$getSheetActionProtocol$1
            @Override // com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol, com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
            public final List<InterfaceC1370310llN> uO1(BaseSharePackage baseSharePackage2) {
                return new ArrayList();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareChannelProtocol LIZJ(Context context, final BaseSharePackage baseSharePackage) {
        return new TTShareChannelProtocol(baseSharePackage) { // from class: com.ss.android.ugc.aweme.live.livehostimpl.livereply.share.LiveReplayShareConfiguration$getShareChannelProtocol$1
            public final List<InterfaceC1369790lkX> LLILLL = new ArrayList();

            @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
            public final List<InterfaceC1369790lkX> KB0() {
                return this.LLILLL;
            }
        };
    }
}
