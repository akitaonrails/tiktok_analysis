package com.ss.android.ugc.aweme.share.business.config;

import X.C1372420lom;
import X.InterfaceC1366490lfD;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.improve.pkg.PhotoDownloadShareModel;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public final class AwemePhotoDownloadSharePanelProtocol extends TTSharePanelLogicProtocol {
    public final C1372420lom LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
    public final InterfaceC1366490lfD T72() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lom] */
    public AwemePhotoDownloadSharePanelProtocol(final BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
        this.LLILLJJLI = new InterfaceC1366490lfD() { // from class: X.0lom
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
                PhotoDownloadShareModel photoDownloadShareModel;
                Aweme aweme;
                ShareModel shareModel = baseSharePackage2.shareModel;
                if ((shareModel instanceof PhotoDownloadShareModel) && (photoDownloadShareModel = (PhotoDownloadShareModel) shareModel) != null && (aweme = photoDownloadShareModel.aweme) != null && C710930Rud.LJII(aweme)) {
                    C1440005kM.LIZ(new C453940Hr6(false, false, 6));
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
            @Override // X.InterfaceC1366490lfD
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(android.view.View r9, X.C1371590lnR r10, X.C1370190llB r11) {
                /*
                    r8 = this;
                    X.0lol r0 = X.C1372410lol.LIZ
                    r0.getClass()
                    com.bytedance.keva.Keva r0 = X.C1372410lol.LIZIZ()
                    java.lang.String r1 = X.C1372410lol.LJ
                    r7 = 0
                    int r0 = r0.getInt(r1, r7)
                    r6 = 1
                    int r4 = r0 + 1
                    com.bytedance.keva.Keva r0 = X.C1372410lol.LIZIZ()
                    r0.storeInt(r1, r4)
                    X.01GW r0 = X.C1372410lol.LIZJ
                    java.lang.Object r0 = r0.getValue()
                    com.ss.android.ugc.aweme.share.RulesConfig r0 = (com.ss.android.ugc.aweme.share.RulesConfig) r0
                    r3 = -1
                    if (r0 == 0) goto L2e
                    com.ss.android.ugc.aweme.share.NoClickConfig r0 = r0.noClickConfig
                    if (r0 == 0) goto L2e
                    int r0 = r0.noClickCount
                    if (r0 < 0) goto L2e
                    r3 = r0
                L2e:
                    long r0 = java.lang.System.currentTimeMillis()
                    int r2 = X.C1387310mCn.LIZ(r0)
                    if (r4 != r3) goto L41
                    com.bytedance.keva.Keva r1 = X.C1372410lol.LIZIZ()
                    java.lang.String r0 = X.C1372410lol.LJFF
                    r1.storeInt(r0, r2)
                L41:
                    com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r0 = r1
                    com.ss.android.ugc.aweme.share.base.model.ShareModel r5 = r0.shareModel
                    boolean r0 = r5 instanceof com.ss.android.ugc.aweme.share.improve.pkg.PhotoDownloadShareModel
                    r4 = 0
                    if (r0 == 0) goto L94
                    com.ss.android.ugc.aweme.share.improve.pkg.PhotoDownloadShareModel r5 = (com.ss.android.ugc.aweme.share.improve.pkg.PhotoDownloadShareModel) r5
                    if (r5 == 0) goto L95
                    com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.aweme
                    if (r3 == 0) goto L61
                    boolean r0 = X.C710930Rud.LJII(r3)
                    if (r0 != r6) goto L61
                    X.0Hr6 r1 = new X.0Hr6
                    r0 = 6
                    r1.<init>(r6, r7, r0)
                    X.C1440005kM.LIZ(r1)
                L61:
                    X.09Gk r2 = new X.09Gk
                    r2.<init>()
                    if (r3 == 0) goto L6c
                    java.lang.String r4 = r3.getAid()
                L6c:
                    java.lang.String r0 = "group_id"
                    r2.LJIIIIZZ(r0, r4)
                    java.lang.String r1 = X.C735370Ssx.LIZLLL(r3)
                    java.lang.String r0 = "author_id"
                    r2.LJIIIIZZ(r0, r1)
                    if (r5 == 0) goto L80
                    java.lang.String r1 = r5.enterFrom
                    if (r1 != 0) goto L82
                L80:
                    java.lang.String r1 = ""
                L82:
                    java.lang.String r0 = "enter_from"
                    r2.LJIIIIZZ(r0, r1)
                    java.lang.String r0 = "is_photo_download"
                    r2.LIZJ(r6, r0)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
                    java.lang.String r0 = "downloaded_share_window_show"
                    X.C20684815ws.LJIILLIIL(r0, r1)
                    return
                L94:
                    r5 = r4
                L95:
                    r3 = r4
                    goto L61
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1372420lom.LIZJ(android.view.View, X.0lnR, X.0llB):void");
            }

            @Override // X.InterfaceC1361850lXj
            public final Object LJII(Context context, BaseSharePackage baseSharePackage2, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
                Unit unit = Unit.LIZ;
                C099R.LJFF();
                return unit;
            }
        };
    }
}
