package com.ss.android.ugc.aweme.series.payment.serviceimpl;

import X.C04TD;
import X.C1390920mIc;
import X.C1611550s2T;
import X.C1612490s3z;
import X.C2344009Gk;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.series.payment.fragment.SeriesRefundPolicyFragment;
import com.ss.android.ugc.aweme.service.ISeriesRefundService;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;

/* JADX INFO: loaded from: classes22.dex */
public final class SeriesRefundServiceImpl implements ISeriesRefundService {
    public static ISeriesRefundService LIZIZ() {
        Object objLIZ = C04TD.LIZ(ISeriesRefundService.class, false);
        if (objLIZ != null) {
            return (ISeriesRefundService) objLIZ;
        }
        if (C04TD.U3 == null) {
            synchronized (ISeriesRefundService.class) {
                if (C04TD.U3 == null) {
                    C04TD.U3 = new SeriesRefundServiceImpl();
                }
            }
        }
        return C04TD.U3;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesRefundService
    public final TuxSheet LIZ(FragmentManager fragmentManager, DialogInterface.OnDismissListener onDismissListener, String str) {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = new SeriesRefundPolicyFragment();
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIIJIL = true;
        if (onDismissListener != null) {
            tuxSheet.LLILLJJLI = onDismissListener;
        }
        tuxSheet.show(fragmentManager, "refund_policy_sheet");
        C1612490s3z.LJI.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("show_refund_policy_bottom_panel", c2344009Gk.LIZ);
        }
        return tuxSheet;
    }
}
