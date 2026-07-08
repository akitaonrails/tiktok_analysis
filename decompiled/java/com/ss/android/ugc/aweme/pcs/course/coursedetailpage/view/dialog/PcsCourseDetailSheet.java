package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.dialog;

import X.C0JSB;
import X.C19EH;
import X.C490570JLr;
import X.C497740JfY;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.PcsCourseDetailFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseDetailSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUvOmEwJzA+Oip9Kyo5Ozw2LCHELIOSA4KCY/OCQrLGElISA7Zys6KSkjLmEDKzYPJjohOyAILDsyISkfISo2PA==";
    public C0JSB LLJLLL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(1, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.dimBehindType = 1;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0JSB c0jsb = this.LLJLLL;
        if (c0jsb != null) {
            C490570JLr c490570JLr = PcsCourseDetailFragment.LLILZ;
            String str = c0jsb.LIZ;
            String str2 = c0jsb.LIZIZ;
            long j = c0jsb.LIZJ;
            long j2 = c0jsb.LIZLLL;
            String str3 = c0jsb.LJ;
            Long lValueOf = Long.valueOf(c0jsb.LJFF);
            boolean z = c0jsb.LJI;
            c490570JLr.getClass();
            PcsCourseDetailFragment pcsCourseDetailFragmentLIZ = C490570JLr.LIZ(str, str2, j, j2, str3, lValueOf, false, z, false);
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.f3z, pcsCourseDetailFragmentLIZ, null);
            c19ehLJIIJ.LJIIL();
        }
        rS(true);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.dcb, viewGroup, false);
    }
}
