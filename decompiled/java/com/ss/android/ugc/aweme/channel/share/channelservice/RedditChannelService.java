package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.AbstractC1376390lvB;
import X.C1377070lwH;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class RedditChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "reddit";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC1369790lkX getChannel(C1377070lwH c1377070lwH) {
        return new AbstractC1376390lvB() { // from class: X.0lun
            @Override // X.AbstractC1376390lvB
            public final String LJJIJL() {
                return "com.reddit.frontpage";
            }

            @Override // X.InterfaceC1369790lkX
            public final String key() {
                return "reddit";
            }

            @Override // X.InterfaceC1369790lkX
            public final String label() {
                return "Reddit";
            }

            @Override // X.InterfaceC1369790lkX
            public final Drawable LJJII(Context context, boolean z) {
                C1361400lX0 c1361400lX0LIZIZ;
                int i;
                int iIntValue;
                if (context != null && (c1361400lX0LIZIZ = C1369540lk8.LIZIZ(context)) != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    if (z) {
                        i = R.attr.rl;
                    } else {
                        i = R.attr.rk;
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
                String strLIZIZ;
                C1371430lnB c1371430lnB;
                String str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://www.reddit.com/submit?url=");
                if ((c1371420lnA instanceof C1371430lnB) && (str = (c1371430lnB = (C1371430lnB) c1371420lnA).LJ) != null && AnonymousClass0652.LIZ(str)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c1371430lnB.LJ);
                    sbLIZ2.append(' ');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    strLIZIZ = "";
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(c1371420lnA.LIZIZ);
                sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ3));
                sbLIZ.append("&title=");
                sbLIZ.append(c1371420lnA.LIZJ);
                Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
                if (Build.VERSION.SDK_INT >= 33) {
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.addCategory("android.intent.category.BROWSABLE");
                }
                return LJ(context, intent);
            }

            @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
            public final boolean LJJJIL(C1375540lto c1375540lto, Context context, C0M7Y c0m7y) {
                Intent intent = new Intent("android.intent.action.SEND");
                String strLIZ = C1374110lrV.LIZ(c1375540lto);
                intent.addFlags(1);
                intent.addFlags(2);
                intent.setType("image/*");
                intent.setPackage("com.reddit.frontpage");
                intent.putExtra("android.intent.extra.STREAM", c1375540lto.LIZIZ);
                intent.putExtra("android.intent.extra.TEXT", strLIZ);
                intent.putExtra("android.intent.extra.SUBJECT", c1375540lto.LIZLLL);
                return LJ(context, intent);
            }
        };
    }
}
