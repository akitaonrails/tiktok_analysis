package com.ss.android.ugc.aweme.service;

import X.AnonymousClass0956;
import X.C0HTT;
import X.C0MO5;
import X.C0MO7;
import X.C0PEM;
import X.C1219980hqu;
import X.C1257340ipA;
import X.C1257350ipB;
import X.C1308910kAL;
import X.C1390920mIc;
import X.C13LE;
import X.C1618440sDa;
import X.C19719912Dl;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C535330Kz5;
import X.C729510SjV;
import X.C737030Svd;
import X.C786410Ut5;
import X.InterfaceC497601wk;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.SocialPublishLandingAssem;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.ui.CancelUploadOrReeditSheetContentFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class SocPublishServiceImpl implements ISocPublishService {
    @Override // com.ss.android.ugc.aweme.service.ISocPublishService
    public final C19719912Dl LIZJ() {
        return C13LE.LIZ(SocialPublishLandingAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPublishService
    public final TuxSheet LIZIZ(Aweme aweme, Context context, C0HTT<C737030Svd> c0htt, Bundle bundle) {
        String str;
        IAVPublishService iAVPublishServicePublishService;
        String str2;
        CancelUploadOrReeditSheetContentFragment cancelUploadOrReeditSheetContentFragment;
        C1219980hqu.LIZ.getClass();
        String string = bundle.getString("enter_from");
        String string2 = bundle.getString("enter_position");
        if (C729510SjV.LJJIJIL(aweme)) {
            str = "story";
        } else {
            str = "post";
        }
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        String strLJIILIIL = c1618440sDa.LJIILIIL(aweme);
        String strLJIIIIZZ = c1618440sDa.LJIIIIZZ(aweme);
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null) {
            iAVPublishServicePublishService = iExternalService.publishService();
        } else {
            iAVPublishServicePublishService = null;
        }
        C259800zU c259800zU = new C259800zU();
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C535330Kz5(strLJIIIIZZ, null, c259800zU), 3);
        CancelUploadOrReeditSheetContentFragment cancelUploadOrReeditSheetContentFragment2 = new CancelUploadOrReeditSheetContentFragment();
        if (!C729510SjV.LJJIIZI(aweme)) {
            str2 = string2;
            cancelUploadOrReeditSheetContentFragment = cancelUploadOrReeditSheetContentFragment2;
            cancelUploadOrReeditSheetContentFragment2.LLILZ = new C1257350ipB(string, str, string2, strLJIILIIL, strLJIIIIZZ, aweme, iAVPublishServicePublishService, cancelUploadOrReeditSheetContentFragment2, c259800zU, c0htt, anonymousClass0956LIZLLL, context);
        } else {
            str2 = string2;
            cancelUploadOrReeditSheetContentFragment = cancelUploadOrReeditSheetContentFragment2;
            View view = cancelUploadOrReeditSheetContentFragment2.LL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        }
        cancelUploadOrReeditSheetContentFragment.LLILZIL = new C1257340ipA(string, str, str2, strLJIILIIL, iAVPublishServicePublishService, cancelUploadOrReeditSheetContentFragment, c0htt, aweme);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = cancelUploadOrReeditSheetContentFragment;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJI = numLIZJ;
        tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0ipD
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C1440005kM.LIZ(new C453940Hr6(false, false, 6));
            }
        };
        return tuxSheet;
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPublishService
    public final void LIZ(Context context, String str, CreativeInfo creativeInfo, String str2, int i, String str3) {
        C0MO7.LIZ.getClass();
        C23250099c.LIZLLL((InterfaceC497601wk) C0MO7.LIZIZ.getValue(), null, null, new C0MO5(str, context, creativeInfo, i, str2, str3, null), 3);
    }
}
