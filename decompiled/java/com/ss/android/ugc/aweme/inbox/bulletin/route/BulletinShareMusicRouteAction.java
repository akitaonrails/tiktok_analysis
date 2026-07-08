package com.ss.android.ugc.aweme.inbox.bulletin.route;

import X.C11VU;
import X.C1388190mED;
import X.C1390920mIc;
import X.C19EG;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinShareMusicFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class BulletinShareMusicRouteAction implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        C19EG c19egLIZIZ;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            BulletinShareMusicFragment.LLJIJIL.getClass();
            int iLIZLLL = C11VU.LIZLLL(c19egLIZIZ);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            BulletinShareMusicFragment bulletinShareMusicFragment = new BulletinShareMusicFragment();
            if (bundle != null) {
                bulletinShareMusicFragment.setArguments(bundle);
            }
            c1390920mIc.LIZ.LLJJIJI = bulletinShareMusicFragment;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJL = (int) (iLIZLLL * 0.9f);
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJLL = true;
            c1390920mIc.LJI(48);
            c1390920mIc.LIZ.show(c19egLIZIZ.getSupportFragmentManager(), "bulletin_share_music_panel");
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
