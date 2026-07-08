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
public final class IntentShareLinkPlusPhoto extends AbsIntentShare {
    public final ShareContentType LL = ShareContentType.LINK_PLUS_PHOTO;

    @Override // com.ss.android.ugc.aweme.channel.share.ability.AbsIntentShare
    public final ShareContentType LIZJ() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.ability.AbsIntentShare
    public final AbstractC1375550ltp LIZ(Context context, C1374080lrS c1374080lrS) {
        List<String> list = c1374080lrS.LIZIZ;
        if (list != null && !list.isEmpty()) {
            Uri uriLIZ = C2203008k8.LIZ(context, new C0VSJ((String) ListProtector.get(list, 0)));
            ListProtector.get(list, 0);
            C1375540lto c1375540lto = new C1375540lto(uriLIZ, AbsIntentShare.LIZLLL(c1374080lrS), AbsIntentShare.LJ(c1374080lrS), c1374080lrS.LIZ, null, false, 200);
            String str = c1375540lto.LJ;
            if (str == null) {
                str = "";
            }
            c1375540lto.LIZIZ("content_url", str);
            c1375540lto.LIZIZ("media_type", "image/*");
            return c1375540lto;
        }
        return null;
    }
}
