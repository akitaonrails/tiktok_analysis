package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.AbstractC1376120luk;
import X.C1377070lwH;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class EmailChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "email";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC1369790lkX getChannel(C1377070lwH c1377070lwH) {
        return new AbstractC1376120luk() { // from class: X.0lui
            @Override // X.InterfaceC1369790lkX
            public final String key() {
                return "email";
            }

            @Override // X.InterfaceC1369790lkX
            public final String label() {
                return "Email";
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("message/rfc822");
                if (C2204961BRm.LJJJJZ(context.getPackageManager(), intent, 0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYpHA2T4LJAA5E2g/h1PMFD2+hc9R50leIrAiDX+EwhM=", null)).size() == 0) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1369790lkX
            public final Drawable LJJII(Context context, boolean z) {
                C1361400lX0 c1361400lX0LIZIZ;
                int i;
                int iIntValue;
                if (context != null && (c1361400lX0LIZIZ = C1369540lk8.LIZIZ(context)) != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    if (z) {
                        i = R.attr.pq;
                    } else {
                        i = R.attr.pp;
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

            @Override // X.InterfaceC1369790lkX
            public final boolean LJIIL(C1371420lnA c1371420lnA, Context context, C0M7Y c0m7y) {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", c1371420lnA.LIZIZ);
                intent.putExtra("android.intent.extra.SUBJECT", c1371420lnA.LIZJ);
                intent.setType("message/rfc882");
                Intent.createChooser(intent, "");
                return LJ(context, intent);
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJIJ(C1374270lrl c1374270lrl, Context context, C0M7Y c0m7y) {
                Intent intent = new Intent("android.intent.action.SEND");
                String strLIZ = C1374110lrV.LIZ(c1374270lrl);
                if (strLIZ != null && strLIZ.length() != 0) {
                    intent.putExtra("android.intent.extra.TEXT", strLIZ);
                }
                intent.putExtra("android.intent.extra.SUBJECT", c1374270lrl.LIZLLL);
                intent.putExtra("android.intent.extra.STREAM", c1374270lrl.LIZIZ);
                intent.setType("message/rfc882");
                Intent.createChooser(intent, "");
                return LJ(context, intent);
            }

            @Override // X.AbstractC1376120luk, X.InterfaceC1369790lkX
            public final boolean LJJIFFI(C1371430lnB c1371430lnB, Context context, C0M7Y c0m7y) {
                String strLIZIZ;
                Intent intent = new Intent("android.intent.action.SEND");
                String str = c1371430lnB.LJ;
                if (str != null && str.length() != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1371430lnB.LJ);
                    sbLIZ.append(' ');
                    sbLIZ.append(c1371430lnB.LIZLLL);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = c1371430lnB.LIZLLL;
                }
                intent.putExtra("android.intent.extra.TEXT", strLIZIZ);
                intent.putExtra("android.intent.extra.SUBJECT", c1371430lnB.LIZJ);
                intent.setType("message/rfc882");
                Intent.createChooser(intent, "");
                return LJ(context, intent);
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJJJIL(C1375540lto c1375540lto, Context context, C0M7Y c0m7y) {
                Intent intent = new Intent("android.intent.action.SEND");
                String strLIZ = C1374110lrV.LIZ(c1375540lto);
                if (strLIZ != null && strLIZ.length() != 0) {
                    intent.putExtra("android.intent.extra.TEXT", strLIZ);
                }
                intent.putExtra("android.intent.extra.SUBJECT", c1375540lto.LIZLLL);
                intent.putExtra("android.intent.extra.STREAM", c1375540lto.LIZIZ);
                intent.setType("message/rfc882");
                Intent.createChooser(intent, "");
                return LJ(context, intent);
            }
        };
    }
}
