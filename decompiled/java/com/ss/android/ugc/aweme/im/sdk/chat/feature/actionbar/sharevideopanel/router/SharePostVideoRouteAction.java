package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.router;

import X.AbstractC746830TRh;
import X.C1245500iW4;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1390920mIc;
import X.C13BV;
import X.C19EG;
import X.C2095008Iq;
import X.C369001c0;
import X.C497820Jfg;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class SharePostVideoRouteAction extends AbstractC746830TRh {
    @Override // X.AbstractC746830TRh
    public boolean doAction(Context context, String str, Bundle bundle) {
        C19EG c19egLIZIZ;
        List listLJJLIIIJ;
        if (str == null || context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "panel_type");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || (listLJJLIIIJ = a0.LJJLIIIJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, new char[]{','}, false, 0, 6)) == null) {
            listLJJLIIIJ = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJJLIIIJ.iterator();
        while (it2.hasNext()) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) it2.next());
            if (numLJIIJJI != null) {
                arrayList.add(numLJIIJJI);
            }
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "conversation_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
        }
        String str2 = ShareVideoPanelFragment._pnsPageId;
        if (C369001c0.LIZ()) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(2);
            c1390920mIc.LIZIZ((int) (((double) C497820Jfg.LIZ(c19egLIZIZ)) * 0.87d), (int) (((double) C497820Jfg.LIZ(c19egLIZIZ)) * 0.92d));
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJLL = true;
            c1390920mIc.LIZ.LLJJIJI = C1245500iW4.LIZ(arrayList, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, null, 0, bundle, 8);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c3, c19egLIZIZ);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJI = numLIZJ;
            tuxSheet2.show(c19egLIZIZ.getSupportFragmentManager(), "share_video_panel");
            return true;
        }
        float f = c19egLIZIZ.getResources().getDisplayMetrics().heightPixels;
        C1390920mIc c1390920mIc2 = new C1390920mIc(false, 0);
        c1390920mIc2.LJIIIIZZ(2);
        c1390920mIc2.LIZIZ((int) (0.75f * f), (int) (f * 0.9f));
        TuxSheet tuxSheet3 = c1390920mIc2.LIZ;
        tuxSheet3.LLJLILLLLZIIL = false;
        tuxSheet3.LLJLL = true;
        c1390920mIc2.LIZ.LLJJIJI = C1245500iW4.LIZ(arrayList, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, null, 0, bundle, 8);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.c3, c19egLIZIZ);
        TuxSheet tuxSheet4 = c1390920mIc2.LIZ;
        tuxSheet4.LLJI = numLIZJ2;
        tuxSheet4.show(c19egLIZIZ.getSupportFragmentManager(), "share_video_panel");
        return true;
    }
}
