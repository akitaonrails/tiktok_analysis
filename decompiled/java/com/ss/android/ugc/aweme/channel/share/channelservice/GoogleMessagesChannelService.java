package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.AbstractC1376390lvB;
import X.C1377070lwH;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class GoogleMessagesChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "google_messages";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC1369790lkX getChannel(C1377070lwH c1377070lwH) {
        return new AbstractC1376390lvB() { // from class: X.0luh
            @Override // X.AbstractC1376390lvB
            public final String LJJIJL() {
                return "com.google.android.apps.messaging";
            }

            @Override // X.InterfaceC1369790lkX
            public final String key() {
                return "google_messages";
            }

            @Override // X.InterfaceC1369790lkX
            public final String label() {
                return "Google Messages";
            }

            @Override // X.InterfaceC1369790lkX
            public final Drawable LJJII(Context context, boolean z) {
                C1361400lX0 c1361400lX0LIZIZ;
                int i;
                int iIntValue;
                if (context != null && (c1361400lX0LIZIZ = C1369540lk8.LIZIZ(context)) != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    if (z) {
                        i = R.attr.rw;
                    } else {
                        i = R.attr.px;
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
            public final boolean LJIIL(C1371420lnA c1371420lnA, Context context, C0M7Y c0m7y) {
                String strLIZ = AbstractC1376120luk.LIZ(c1371420lnA);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", strLIZ);
                intent.setPackage("com.google.android.apps.messaging");
                return LJ(context, intent);
            }

            @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
            public final boolean LJIJ(C1374270lrl c1374270lrl, Context context, C0M7Y c0m7y) {
                String strLIZ = C1374110lrV.LIZ(c1374270lrl);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("video/*");
                intent.putExtra("android.intent.extra.STREAM", c1374270lrl.LIZIZ);
                if (strLIZ != null && strLIZ.length() != 0) {
                    intent.putExtra("android.intent.extra.TEXT", strLIZ);
                }
                intent.setPackage("com.google.android.apps.messaging");
                return LJ(context, intent);
            }

            @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
            public final boolean LJJJIL(C1375540lto c1375540lto, Context context, C0M7Y c0m7y) {
                String strLIZ = C1374110lrV.LIZ(c1375540lto);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("image/*");
                intent.putExtra("android.intent.extra.STREAM", c1375540lto.LIZIZ);
                if (strLIZ != null && strLIZ.length() != 0) {
                    intent.putExtra("android.intent.extra.TEXT", strLIZ);
                }
                intent.setPackage("com.google.android.apps.messaging");
                return LJ(context, intent);
            }
        };
    }
}
