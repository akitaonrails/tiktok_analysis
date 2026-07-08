package com.ss.android.ugc.aweme.frequency;

import X.C01GW;
import X.C1261390ivh;
import X.C1262900iy8;
import X.C1388190mED;
import X.C1510700pPo;
import X.C1720106oR;
import X.C19EG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C724240Sb0;
import X.C786410Ut5;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.adaptive.TuxModal;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.experiment.LocalFollowPortraitMock;
import com.ss.android.ugc.aweme.relation.label.popup.MutualRelationPopupFragment;
import com.ss.android.ugc.aweme.social.service.ISocialPortraitService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SocialPortraitServiceImpl implements ISocialPortraitService {
    @Override // com.ss.android.ugc.aweme.social.service.ISocialPortraitService
    public final String getPortrait(String str) {
        C01GW c01gw = C1262900iy8.LIZIZ;
        if (((LocalFollowPortraitMock) c01gw.getValue()).isEnable != 0) {
            if (Intrinsics.LJFF(str, "follow_total_count_3days")) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mock_follow_total_count_3days: ");
                sbLIZ.append(((LocalFollowPortraitMock) c01gw.getValue()).followTotalCount3days);
                C1720106oR.LJI("RectUser_Fetch_Count_Exp", C2188811AlT.LIZIZ(sbLIZ));
                return String.valueOf(((LocalFollowPortraitMock) c01gw.getValue()).followTotalCount3days);
            }
            if (Intrinsics.LJFF(str, "follow_total_count_30days")) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("mock_follow_total_count_30days: ");
                sbLIZ2.append(((LocalFollowPortraitMock) c01gw.getValue()).followTotalCount30days);
                C1720106oR.LJI("RectUser_Fetch_Count_Exp", C2188811AlT.LIZIZ(sbLIZ2));
                return String.valueOf(((LocalFollowPortraitMock) c01gw.getValue()).followTotalCount30days);
            }
            return null;
        }
        return C1510700pPo.LIZ().LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.social.service.ISocialPortraitService
    public final void LIZ(Fragment fragment, MatchedFriendStruct matchedFriendStruct) {
        C19EG c19egLIZ;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        if (matchedFriendStruct != null && (c19egLIZ = C724240Sb0.LIZ(fragment)) != null && (c19egLIZIZ = C1388190mED.LIZIZ(c19egLIZ)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            C1261390ivh c1261390ivh = new C1261390ivh();
            MutualRelationPopupFragment.LLJIJIL.getClass();
            MutualRelationPopupFragment mutualRelationPopupFragment = new MutualRelationPopupFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "maf_struct", matchedFriendStruct);
            mutualRelationPopupFragment.setArguments(bundle);
            TuxModal tuxModal = c1261390ivh.LIZ;
            tuxModal.LLILZ = mutualRelationPopupFragment;
            tuxModal.LLILZIL = true;
            tuxModal.LLILLJJLI = false;
            tuxModal.show(supportFragmentManager, (String) null);
        }
    }
}
