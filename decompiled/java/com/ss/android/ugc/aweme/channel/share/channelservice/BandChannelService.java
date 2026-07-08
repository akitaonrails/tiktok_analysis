package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.AbstractC1376390lvB;
import X.C1377070lwH;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;
import com.zhiliaoapp.musically.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes22.dex */
public final class BandChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "band";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC1369790lkX getChannel(C1377070lwH c1377070lwH) {
        return new AbstractC1376390lvB() { // from class: X.0lvE
            @Override // X.AbstractC1376390lvB
            public final String LJJIJL() {
                return "com.nhn.android.band";
            }

            @Override // X.InterfaceC1369790lkX
            public final String key() {
                return "band";
            }

            @Override // X.InterfaceC1369790lkX
            public final String label() {
                return "Band";
            }

            @Override // X.InterfaceC1369790lkX
            public final Drawable LJJII(Context context, boolean z) {
                C1361400lX0 c1361400lX0LIZIZ;
                int i;
                int iIntValue;
                if (context != null && (c1361400lX0LIZIZ = C1369540lk8.LIZIZ(context)) != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    if (z) {
                        i = R.attr.pb;
                    } else {
                        i = R.attr.pa;
                    }
                    Integer numLIZ = C1369540lk8.LIZ(i, c1361400lX0LIZIZ);
                    if (numLIZ != null) {
                        iIntValue = numLIZ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    c419910GdJ.LIZ = iIntValue;
                    return c419910GdJ.LIZ(c1361400lX0LIZIZ);
                }
                return null;
            }

            @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
            public final boolean LJIIL(C1371420lnA c1371420lnA, Context context, C0M7Y c0m7y) throws UnsupportedEncodingException {
                String strEncode = URLEncoder.encode(String.valueOf(AbstractC1376120luk.LIZ(c1371420lnA)), "UTF-8");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("bandapp://create/post?text=");
                sbLIZ.append(strEncode);
                return LJ(context, new Intent("android.intent.action.VIEW", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ))));
            }
        };
    }
}
