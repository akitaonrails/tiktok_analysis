package com.ss.android.ugc.aweme.share.screenshot.strategy;

import X.C08ZO;
import X.C0N6J;
import X.C0VSJ;
import X.C1373990lrJ;
import X.C1374090lrT;
import X.C1374100lrU;
import X.C1374120lrW;
import X.C1374130lrX;
import X.C1374640lsM;
import X.C1375540lto;
import X.C13BV;
import X.C786410Ut5;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public abstract class ScreenshotPhotoShareStrategy<T extends SharePackage> extends ScreenshotShareStrategy<T> {
    public final C0N6J LL = C0N6J.PHOTO;

    @Override // com.ss.android.ugc.aweme.share.screenshot.strategy.ScreenshotShareStrategy
    public final C0N6J LJI() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.share.screenshot.strategy.ScreenshotShareStrategy
    public final boolean LJ(InterfaceC1369790lkX interfaceC1369790lkX, Context context, SharePackage sharePackage, C1374120lrW c1374120lrW) {
        C1374130lrX c1374130lrX;
        String str;
        String str2;
        List list;
        String strLJII = LJII(sharePackage);
        ShareContentType[] shareContentTypeArr = sharePackage.shareContentTypes;
        if (shareContentTypeArr == null) {
            shareContentTypeArr = new ShareContentType[]{ShareContentType.LINK};
        }
        int length = shareContentTypeArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                ShareContentType shareContentType = shareContentTypeArr[i];
                int i2 = C1374090lrT.LIZ[shareContentType.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        if (i2 != 5) {
                            list = C13BV.INSTANCE;
                        } else {
                            list = C1374640lsM.LJ;
                        }
                    } else {
                        list = C1374640lsM.LJFF;
                    }
                } else {
                    list = C1374640lsM.LJI;
                }
                if (!list.contains(interfaceC1369790lkX.key())) {
                    c1374130lrX = new C1374130lrX(shareContentType, LIZLLL(interfaceC1369790lkX, sharePackage.itemType, shareContentType.getNum()), LIZJ(interfaceC1369790lkX, sharePackage.itemType, shareContentType.getNum()), c1374120lrW);
                    break;
                }
                i++;
            } else {
                c1374130lrX = new C1374130lrX(ShareContentType.ILEGAL, false, false, c1374120lrW);
                break;
            }
        }
        int num = c1374130lrX.LIZ.getNum();
        boolean z = c1374130lrX.LIZIZ;
        boolean z2 = c1374130lrX.LIZJ;
        Function1<Boolean, Unit> function1LIZ = c1374130lrX.LIZLLL.LIZ();
        String str3 = "";
        if (!z2) {
            str = "";
        } else {
            str = sharePackage.description;
        }
        if (!z) {
            str2 = "";
        } else {
            str2 = sharePackage.title;
        }
        ShareContentType shareContentType2 = ShareContentType.PHOTO;
        if (num == shareContentType2.getNum()) {
            if (strLJII != null) {
                C1375540lto c1375540lto = new C1375540lto(C08ZO.LIZ(context, new C0VSJ(strLJII)), str, str2, null, null, false, 232);
                String str4 = c1375540lto.LJ;
                if (str4 == null) {
                    str4 = "";
                }
                c1375540lto.LIZIZ("content_url", str4);
                c1375540lto.LIZIZ("media_type", "image/png");
                interfaceC1369790lkX.LJJJIL(c1375540lto, context, null);
                Bundle bundle = sharePackage.extras;
                String str5 = C1373990lrJ.LIZ.get(shareContentType2);
                if (str5 != null) {
                    str3 = str5;
                }
                C786410Ut5.LJJJI("share_form", str3, bundle);
                function1LIZ.invoke(Boolean.TRUE);
            }
        } else {
            if (num != ShareContentType.LINK_PLUS_PHOTO.getNum()) {
                return false;
            }
            if (strLJII != null) {
                sharePackage.LJIJ(interfaceC1369790lkX, new C1374100lrU(context, strLJII, str, str2, interfaceC1369790lkX, sharePackage, function1LIZ));
            }
        }
        return true;
    }
}
