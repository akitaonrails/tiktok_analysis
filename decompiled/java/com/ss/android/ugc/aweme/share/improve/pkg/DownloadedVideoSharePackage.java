package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C08YU;
import X.C0M7Y;
import X.C1370940lmO;
import X.C1373530lqZ;
import X.C1374870lsj;
import X.C621180OYa;
import X.C786410Ut5;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class DownloadedVideoSharePackage extends SharePackage {
    public Aweme aweme;
    public String path;
    public static final C1373530lqZ Companion = new Object() { // from class: X.0lqZ
    };
    public static final int $stable = 8;

    public DownloadedVideoSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(X.InterfaceC1369790lkX r15, kotlin.jvm.functions.Function2<? super X.AbstractC1375550ltp, ? super java.lang.Boolean, kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage.LJIJ(X.0lkX, kotlin.jvm.functions.Function2):void");
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIIIZ(Context context, InterfaceC1369790lkX interfaceC1369790lkX, View view, Function0<Unit> function0) {
        String strKey;
        String strKey2;
        Bundle bundle = new Bundle();
        if (interfaceC1369790lkX == null || (strKey = interfaceC1369790lkX.key()) == null) {
            strKey = "send_to";
        }
        C786410Ut5.LJJJI("enter_from", strKey, bundle);
        if (interfaceC1369790lkX != null) {
            strKey2 = interfaceC1369790lkX.key();
        } else {
            strKey2 = null;
        }
        C786410Ut5.LJJJI("channel_key", strKey2, bundle);
        IShareWarningInfoService iShareWarningInfoServiceLJJIFFI = ComplianceServiceProvider.LJJIFFI();
        if (iShareWarningInfoServiceLJJIFFI != null && iShareWarningInfoServiceLJJIFFI.LIZJ(context, this.aweme, bundle, function0)) {
            return;
        }
        super.LJIIIZ(context, interfaceC1369790lkX, view, function0);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        ShareExtService shareExtService = C621180OYa.LIZIZ;
        String strKey = interfaceC1369790lkX.key();
        C08YU c08yu = C08YU.LIZ;
        Aweme aweme = this.aweme;
        String str = "others_video_share_list";
        if (aweme != null) {
            C1374870lsj.LIZ.getClass();
            if (C1374870lsj.LIZJ(aweme)) {
                str = "self_video_share_list";
            }
        }
        shareExtService.LJJLI(0, strKey, str);
        return false;
    }
}
