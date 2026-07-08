package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.AbstractC1376390lvB;
import X.C1377070lwH;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class SnapchatChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "snapchat";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC1369790lkX getChannel(C1377070lwH c1377070lwH) {
        if (c1377070lwH == null || c1377070lwH.LIZ == null) {
            return null;
        }
        return new AbstractC1376390lvB() { // from class: X.0lwG
            @Override // X.AbstractC1376390lvB
            public final String LJJIJL() {
                return "com.snapchat.android";
            }

            @Override // X.InterfaceC1369790lkX
            public final String key() {
                return "snapchat";
            }

            @Override // X.InterfaceC1369790lkX
            public final String label() {
                return "Snapchat";
            }

            @Override // X.AbstractC1376390lvB, X.AbstractC1376120luk, X.InterfaceC1369790lkX
            public final boolean LJIIZILJ(Context context) {
                return C516560KNq.LIZ(context, "com.snapchat.android");
            }

            @Override // X.InterfaceC1369790lkX
            public final Drawable LJJII(Context context, boolean z) {
                C1361400lX0 c1361400lX0LIZIZ;
                int i;
                int iIntValue;
                if (context != null && (c1361400lX0LIZIZ = C1369540lk8.LIZIZ(context)) != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    if (z) {
                        i = R.attr.ry;
                    } else {
                        i = R.attr.rx;
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
        };
    }
}
