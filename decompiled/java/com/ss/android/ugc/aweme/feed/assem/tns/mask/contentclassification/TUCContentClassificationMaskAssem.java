package com.ss.android.ugc.aweme.feed.assem.tns.mask.contentclassification;

import X.C0FNT;
import X.C101N;
import X.C1219200hpe;
import X.C716540S8u;
import X.C722420SVk;
import X.C724270Sb3;
import X.C786410Ut5;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.tuc.service.ITUCBizService;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class TUCContentClassificationMaskAssem extends TUCBaseMaskAssem<TUCContentClassificationMaskAssem> {
    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem
    public final boolean Ap() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        VideoMaskInfo contentClassificationMaskInfo = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getContentClassificationMaskInfo();
        if (contentClassificationMaskInfo != null) {
            return Intrinsics.LJFF(contentClassificationMaskInfo.showMask, Boolean.TRUE);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem
    public final void Ep() {
        C716540S8u.LIZ.getClass();
        C716540S8u.LIZ("general_mask", "tryHide");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem
    public final void Fp() {
        ViewGroup viewGroup;
        if (getContentView().getVisibility() == 0) {
            C716540S8u.LIZ.getClass();
            C716540S8u.LIZ("general_mask", "tryShowReturn");
            return;
        }
        View contentView = getContentView();
        if ((contentView instanceof ViewGroup) && (viewGroup = (ViewGroup) contentView) != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        Activity activityLIZ = C0FNT.LIZ(getContentView().getContext());
        if (activityLIZ == null) {
            C716540S8u.LIZ.getClass();
            C716540S8u.LIZ("general_mask", "tryShowReturn");
            return;
        }
        ITUCBizService iTUCBizService = (ITUCBizService) ServiceManager.get().getService(ITUCBizService.class);
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        C724270Sb3 c724270Sb32 = this.LLJI;
        String str = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType;
        C724270Sb3 c724270Sb33 = this.LLJI;
        int i = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).mPageType;
        C724270Sb3 c724270Sb34 = this.LLJI;
        C101N c101nLJIIIIZZ = iTUCBizService.LJIIIIZZ(activityLIZ, aweme, new C1219200hpe(str, i, ((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).mAwemeFromPage), new AwS590S0100000_11(this, 110));
        C716540S8u.LIZ.getClass();
        C716540S8u.LIZ("general_mask", "callTUCShow");
        C722420SVk.LIZ(C722420SVk.LIZ, c101nLJIIIIZZ, getContentView());
        C786410Ut5.LJLLLLLL(0, getContentView());
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C716540S8u.LIZ.getClass();
        C716540S8u.LIZ("general_mask", "onViewCreated");
    }
}
