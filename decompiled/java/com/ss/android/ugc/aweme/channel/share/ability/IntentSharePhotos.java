package com.ss.android.ugc.aweme.channel.share.ability;

import X.AbstractC1375550ltp;
import X.C0VSJ;
import X.C1374080lrS;
import X.C1375540lto;
import X.C2203008k8;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class IntentSharePhotos extends AbsIntentShare {
    public final ShareContentType LL = ShareContentType.PHOTOS;

    @Override // com.ss.android.ugc.aweme.channel.share.ability.AbsIntentShare
    public final ShareContentType LIZJ() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.ability.AbsIntentShare
    public final AbstractC1375550ltp LIZ(Context context, C1374080lrS c1374080lrS) {
        List<String> list = c1374080lrS.LIZIZ;
        if (list != null && !list.isEmpty()) {
            String str = "";
            if (list.size() == 1) {
                Uri uriLIZ = C2203008k8.LIZ(context, new C0VSJ((String) ListProtector.get(list, 0)));
                ListProtector.get(list, 0);
                C1375540lto c1375540lto = new C1375540lto(uriLIZ, AbsIntentShare.LIZLLL(c1374080lrS), AbsIntentShare.LJ(c1374080lrS), null, null, false, 232);
                String str2 = c1375540lto.LJ;
                if (str2 != null) {
                    str = str2;
                }
                c1375540lto.LIZIZ("content_url", str);
                c1375540lto.LIZIZ("media_type", "image/*");
                return c1375540lto;
            }
            Uri uriLIZ2 = C2203008k8.LIZ(context, new C0VSJ((String) ListProtector.get(list, 0)));
            ListProtector.get(list, 0);
            C1375540lto c1375540lto2 = new C1375540lto(uriLIZ2, AbsIntentShare.LIZLLL(c1374080lrS), AbsIntentShare.LJ(c1374080lrS), null, c1374080lrS.LIZIZ, true, 40);
            String str3 = c1375540lto2.LJ;
            if (str3 != null) {
                str = str3;
            }
            c1375540lto2.LIZIZ("content_url", str);
            c1375540lto2.LIZIZ("media_type", "image/*");
            return c1375540lto2;
        }
        return null;
    }
}
