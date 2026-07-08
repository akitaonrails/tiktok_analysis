package com.ss.android.ugc.aweme.im.sharepanel.api.share;

import X.AbstractC1375550ltp;
import X.C1324840ka2;
import X.C1370940lmO;
import X.C1371430lnB;
import X.InterfaceC1369790lkX;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* JADX INFO: loaded from: classes22.dex */
public final class ImWebSharePackage extends SharePackage {
    public String imagePath;
    public boolean needImTips;

    public ImWebSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
        this.needImTips = true;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final AbstractC1375550ltp LJIILLIIL(InterfaceC1369790lkX interfaceC1369790lkX) {
        C1371430lnB c1371430lnB = new C1371430lnB(this.url, this.title, this.description);
        String strLJIILL = C1324840ka2.LJIILL(this.imagePath);
        if (!TextUtils.isEmpty(strLJIILL)) {
            c1371430lnB.LIZIZ("thumb_path", strLJIILL);
        }
        return c1371430lnB;
    }
}
