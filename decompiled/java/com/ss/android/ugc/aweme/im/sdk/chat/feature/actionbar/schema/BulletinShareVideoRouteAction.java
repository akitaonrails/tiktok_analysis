package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.schema;

import X.AbstractC746830TRh;
import X.C1245500iW4;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1697810uHb;
import X.C19EG;
import X.EnumC1646906cd;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelFragment;

/* JADX INFO: loaded from: classes15.dex */
public final class BulletinShareVideoRouteAction extends AbstractC746830TRh {
    @Override // X.AbstractC746830TRh
    public boolean doAction(Context context, String str, Bundle bundle) {
        C19EG c19egLIZIZ;
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            return false;
        }
        String str2 = ShareVideoPanelFragment._pnsPageId;
        int i = c19egLIZIZ.getResources().getDisplayMetrics().heightPixels;
        bundle.putBoolean("force_old_ui_style", true);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = C1245500iW4.LIZ(C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1646906cd.YOURS.getType()), Integer.valueOf(EnumC1646906cd.FAVORITE.getType())), null, null, 1, bundle, 6);
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJJL = (int) (i * 0.9f);
        tuxSheet.show(c19egLIZIZ.getSupportFragmentManager(), "share_video_panel");
        return true;
    }
}
