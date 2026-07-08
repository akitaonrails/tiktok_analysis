package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C08HM;
import X.C0M7Y;
import X.C0VSJ;
import X.C1370940lmO;
import X.C1375540lto;
import X.C1376470lvJ;
import X.C2188811AlT;
import X.C2203008k8;
import X.C2427709fH;
import X.C540280LGw;
import X.C621180OYa;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class Base64ImageSharePackage extends SharePackage {
    public static final C1376470lvJ Companion = new C1376470lvJ();
    public String imageData;
    public int shareMode;
    public String type;

    public Base64ImageSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
        this.shareMode = 2;
        this.imageData = "";
        this.type = "";
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        C621180OYa.LIZIZ.LJJLI(0, interfaceC1369790lkX.key(), "others_video_share_list");
        C1376470lvJ c1376470lvJ = Companion;
        int i = this.shareMode;
        String str = this.type;
        String str2 = this.imageData;
        c1376470lvJ.getClass();
        if (C1376470lvJ.LIZIZ(i, str, str2)) {
            Bitmap bitmapLIZ = C540280LGw.LIZ(this.imageData);
            String strLJIILLIIL = C2427709fH.LJIILLIIL(context);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            String str3 = "";
            sbLIZ2.append("");
            sbLIZ2.append(System.currentTimeMillis());
            sbLIZ.append(C08HM.LIZJ(C2188811AlT.LIZIZ(sbLIZ2)));
            sbLIZ.append(".png");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (BitmapUtils.saveBitmapToSD(bitmapLIZ, strLJIILLIIL, strLIZIZ)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLJIILLIIL);
                sbLIZ3.append(strLIZIZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                if (strLIZIZ2 != null) {
                    C1375540lto c1375540lto = new C1375540lto(C2203008k8.LIZ(context, new C0VSJ(strLIZIZ2)), null, null, null, null, false, 252);
                    String str4 = c1375540lto.LJ;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    c1375540lto.LIZIZ("content_url", str3);
                    c1375540lto.LIZIZ("media_type", "image/png");
                    interfaceC1369790lkX.LJJJIL(c1375540lto, context, null);
                }
            }
            function1.invoke(Boolean.TRUE);
            return true;
        }
        return true;
    }
}
