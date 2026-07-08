package com.ss.android.ugc.aweme.feed.assem.tns.mask.general;

import X.C101K;
import X.C10IT;
import X.C1386360mBG;
import X.C716540S8u;
import X.C722420SVk;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.tuc.service.ITUCBizService;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TUCGeneralMaskAssem extends TUCBaseMaskAssem<TUCGeneralMaskAssem> {
    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem
    public final boolean Ap() {
        C10IT c10it = C10IT.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        c10it.getClass();
        return C10IT.LJIIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem
    public final void Ep() {
        C716540S8u.LIZ.getClass();
        C716540S8u.LIZ("general_mask", "tryHide");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem
    public final void Fp() {
        C716540S8u.LIZ.getClass();
        C716540S8u.LIZ("general_mask", "tryShow");
        if (getContentView().getVisibility() == 0) {
            C716540S8u.LIZ("general_mask", "tryShowReturn");
            return;
        }
        Context context = getContentView().getContext();
        ITUCBizService iTUCBizService = (ITUCBizService) ServiceManager.get().getService(ITUCBizService.class);
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C724270Sb3 c724270Sb32 = this.LLJI;
        C101K c101kLJII = iTUCBizService.LJII(context, aweme, fragmentLJI, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType, new AwS555S0100000_11(this, 264), new AwS555S0100000_11(this, 265), new AwS555S0100000_11(this, 266));
        C716540S8u.LIZ("general_mask", "callTUCShow");
        C722420SVk c722420SVk = C722420SVk.LIZ;
        View contentView = getContentView();
        c722420SVk.getClass();
        C722420SVk.LIZIZ(c101kLJII, contentView, null);
        C786410Ut5.LJLLLLLL(0, getContentView());
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem
    public final void up() {
        C716540S8u.LIZ.getClass();
        C716540S8u.LIZ("general_mask", "triggerShow");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem
    public final void tp() {
        FypAutoScrollService fypAutoScrollServiceLIZJ = C1386360mBG.LIZJ();
        if (fypAutoScrollServiceLIZJ != null) {
            fypAutoScrollServiceLIZJ.LJ(Ap());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C716540S8u.LIZ.getClass();
        C716540S8u.LIZ("general_mask", "onViewCreated");
    }
}
