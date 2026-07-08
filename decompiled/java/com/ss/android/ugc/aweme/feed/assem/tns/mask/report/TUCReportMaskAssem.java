package com.ss.android.ugc.aweme.feed.assem.tns.mask.report;

import X.C101P;
import X.C1020020ceO;
import X.C1020030ceP;
import X.C1022820ciu;
import X.C10IT;
import X.C2184171Adz;
import X.C716540S8u;
import X.C722420SVk;
import X.C724270Sb3;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.tuc.service.ITUCBizService;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TUCReportMaskAssem extends TUCBaseMaskAssem<TUCReportMaskAssem> {
    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem
    public final boolean Ap() {
        C10IT c10it = C10IT.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        c10it.getClass();
        return C10IT.LJIILJJIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem
    public final void Ep() {
        C716540S8u.LIZ.getClass();
        C716540S8u.LIZ("report_mask", "tryHide");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem
    public final void Fp() {
        ViewGroup viewGroup;
        C716540S8u.LIZ.getClass();
        C716540S8u.LIZ("report_mask", "tryShow");
        if (getContentView().getVisibility() == 0) {
            C716540S8u.LIZ("report_mask", "tryShowReturn");
            return;
        }
        View contentView = getContentView();
        if ((contentView instanceof ViewGroup) && (viewGroup = (ViewGroup) contentView) != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        Context context = getContentView().getContext();
        ITUCBizService iTUCBizService = (ITUCBizService) ServiceManager.get().getService(ITUCBizService.class);
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        C724270Sb3 c724270Sb32 = this.LLJI;
        C101P c101pLIZLLL = iTUCBizService.LIZLLL(context, aweme, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType, new AwS412S0200000_11(this, context, 20), new AwS555S0100000_11(this, 267), new AwS412S0200000_11(this, context, 21));
        C716540S8u.LIZ("report_mask", "callTUCShow");
        C722420SVk.LIZ(C722420SVk.LIZ, c101pLIZLLL, getContentView());
        C786410Ut5.LJLLLLLL(0, getContentView());
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem
    public final void up() {
        C716540S8u.LIZ.getClass();
        C716540S8u.LIZ("report_mask", "triggerShow");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C716540S8u.LIZ.getClass();
        C716540S8u.LIZ("report_mask", "onViewCreated");
    }

    public final void Gp(Context context, String str) {
        Object obj;
        Aweme aweme;
        C724270Sb3 c724270Sb3 = this.LLJI;
        AwemeRawAd awemeRawAd = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
            if (aweme != null && !aweme.isAd()) {
                return;
            }
        } else {
            aweme = null;
        }
        C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
        c1020020ceOLIZ.LIZ = "background_ad";
        c1020020ceOLIZ.LIZIZ = str;
        c1020020ceOLIZ.LJIIIZ("report_mask");
        c1020020ceOLIZ.LJ(aweme);
        c1020020ceOLIZ.LJIIJ(context);
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("background_ad", str, awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("report_mask", "refer");
        c1022820ciuLIZLLL.LJIIIIZZ();
    }
}
