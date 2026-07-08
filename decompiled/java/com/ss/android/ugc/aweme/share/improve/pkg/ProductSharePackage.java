package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C0M7Y;
import X.C1370940lmO;
import X.C1372940lpc;
import X.C1374860lsi;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class ProductSharePackage extends LinkDefaultSharePackage {
    public static final C1372940lpc Companion = new Object() { // from class: X.0lpc
    };
    public static final int $stable = 8;
    public static final String SHARE_PREVIEW = "aweme://lynxview?channel=gec_content_ug_share&bundle=index%2Ftemplate.js&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2F8%2Fgecko%2Fresource%2Fgec_content_ug_share%2Findex%2Ftemplate.js&use_gecko_first=1&dynamic=1&hide_nav_bar=1&trans_status_bar=1&status_bar_color=00000000&use_bdx=1&use_spark=1&enable_prefetch=1&enable_code_cache=1&scene=1&page_link_info=";

    public ProductSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        C1374860lsi.LIZJ().LIZ(0, interfaceC1369790lkX.key(), "others_video_share_list");
        return false;
    }
}
