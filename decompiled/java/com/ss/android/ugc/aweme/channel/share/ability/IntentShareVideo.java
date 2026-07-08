package com.ss.android.ugc.aweme.channel.share.ability;

import X.AbstractC1375550ltp;
import X.C0VSJ;
import X.C1374080lrS;
import X.C1374270lrl;
import X.C2203008k8;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class IntentShareVideo extends AbsIntentShare {
    public final ShareContentType LL = ShareContentType.VIDEO;

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
            C1374270lrl c1374270lrl = new C1374270lrl(uriLIZ, AbsIntentShare.LIZLLL(c1374080lrS), AbsIntentShare.LJ(c1374080lrS), null, 40);
            String str = c1374270lrl.LJ;
            if (str == null) {
                str = "";
            }
            c1374270lrl.LIZIZ("content_url", str);
            c1374270lrl.LIZIZ("media_type", "video/*");
            return c1374270lrl;
        }
        return null;
    }
}
