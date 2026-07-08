package com.ss.android.ugc.aweme.relation.mutual;

import X.C04TD;
import X.C1390920mIc;
import X.C19EG;
import X.C497820Jfg;
import X.C786410Ut5;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes20.dex */
public final class MutualRelationServiceImpl implements IMutualRelationService {
    public static IMutualRelationService LIZJ() {
        Object objLIZ = C04TD.LIZ(IMutualRelationService.class, false);
        if (objLIZ != null) {
            return (IMutualRelationService) objLIZ;
        }
        if (C04TD.A3 == null) {
            synchronized (IMutualRelationService.class) {
                if (C04TD.A3 == null) {
                    C04TD.A3 = new MutualRelationServiceImpl();
                }
            }
        }
        return C04TD.A3;
    }

    @Override // com.ss.android.ugc.aweme.relation.mutual.IMutualRelationService
    public final MutualRelationFragment LIZIZ() {
        MutualRelationFragment.LLJILLL.getClass();
        return new MutualRelationFragment();
    }

    @Override // com.ss.android.ugc.aweme.relation.mutual.IMutualRelationService
    public final void LIZ(C19EG c19eg, ArrayList<String> arrayList, ArrayList<String> arrayList2, int i, String str, DialogInterface.OnDismissListener onDismissListener) {
        MutualRelationSheetFragment.LLJIJIL.getClass();
        MutualRelationSheetFragment mutualRelationSheetFragment = new MutualRelationSheetFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJIL(bundle, "mutual_relation_user_list", arrayList);
        C786410Ut5.LJJJIL(bundle, "mutual_relation_sec_user_list", arrayList2);
        bundle.putInt("mutual_relation_total_user_num", i);
        C786410Ut5.LJJJI("mutual_relation_title_center_text", str, bundle);
        mutualRelationSheetFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = mutualRelationSheetFragment;
        c1390920mIc.LJIIIIZZ(1);
        int iLIZ = (int) (((double) C497820Jfg.LIZ(c19eg)) * 0.5d);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = iLIZ;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJLILLLLZIIL = true;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLLL = true;
        tuxSheet.LLILLL = true;
        tuxSheet.LLJLLIL = true;
        if (onDismissListener != null) {
            tuxSheet.LLILLJJLI = onDismissListener;
        }
        tuxSheet.show(c19eg.getSupportFragmentManager(), "MutualRelationSheetFragment");
    }
}
