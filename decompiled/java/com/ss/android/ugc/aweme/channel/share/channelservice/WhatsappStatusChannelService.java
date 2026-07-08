package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.AbstractC1376390lvB;
import X.C1377070lwH;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class WhatsappStatusChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "whatsapp_status";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC1369790lkX getChannel(C1377070lwH c1377070lwH) {
        return new AbstractC1376390lvB() { // from class: X.0lvC
            @Override // X.AbstractC1376390lvB
            public final String LJJIJL() {
                return "com.whatsapp";
            }

            @Override // X.InterfaceC1369790lkX
            public final String key() {
                return "whatsapp_status";
            }

            @Override // X.InterfaceC1369790lkX
            public final String label() {
                if (!C1370370llT.LJ.LJFF()) {
                    return "Status";
                }
                int iLJIIJ = C1370370llT.LJ.LJIIJ();
                return iLJIIJ != 1 ? iLJIIJ == 2 ? "Whatsapp Status" : "Status" : "WA Status";
            }

            @Override // X.AbstractC1376390lvB
            public final Intent LJFF(Context context, C1371420lnA c1371420lnA) {
                Intent intentLJFF = super.LJFF(context, c1371420lnA);
                if (C1370370llT.LJ.LIZLLL()) {
                    intentLJFF.putExtra("jid", "status@broadcast");
                }
                return intentLJFF;
            }

            @Override // X.AbstractC1376390lvB
            public final Intent LJJ(Context context, C1375540lto c1375540lto) {
                Intent intentLJJ = super.LJJ(context, c1375540lto);
                if (C1370370llT.LJ.LIZIZ()) {
                    intentLJJ.putExtra("jid", "status@broadcast");
                }
                return intentLJJ;
            }

            @Override // X.InterfaceC1369790lkX
            public final Drawable LJJII(Context context, boolean z) {
                int iIntValue = 0;
                int i = R.attr.sg;
                if (context != null) {
                    if (C1370370llT.LJ.LJFF()) {
                        C1361400lX0 c1361400lX0LIZIZ = C1369540lk8.LIZIZ(context);
                        if (c1361400lX0LIZIZ != null) {
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            if (!z) {
                                i = R.attr.sf;
                            }
                            Integer numLIZ = C1369540lk8.LIZ(i, c1361400lX0LIZIZ);
                            if (numLIZ != null) {
                                iIntValue = numLIZ.intValue();
                            }
                            c419910GdJ.LIZ = iIntValue;
                            return c419910GdJ.LIZ(c1361400lX0LIZIZ);
                        }
                        return null;
                    }
                    C1361400lX0 c1361400lX0LIZIZ2 = C1369540lk8.LIZIZ(context);
                    if (c1361400lX0LIZIZ2 != null) {
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        if (!z) {
                            i = R.attr.sh;
                        }
                        Integer numLIZ2 = C1369540lk8.LIZ(i, c1361400lX0LIZIZ2);
                        if (numLIZ2 != null) {
                            iIntValue = numLIZ2.intValue();
                        }
                        c419910GdJ2.LIZ = iIntValue;
                        return c419910GdJ2.LIZ(c1361400lX0LIZIZ2);
                    }
                    return null;
                }
                return null;
            }

            @Override // X.AbstractC1376390lvB
            public final Intent LJJIIZ(Context context, C1374270lrl c1374270lrl) {
                Intent intentLJJIIZ = super.LJJIIZ(context, c1374270lrl);
                if (C1370370llT.LJ.LIZIZ()) {
                    intentLJJIIZ.putExtra("jid", "status@broadcast");
                }
                return intentLJJIIZ;
            }

            @Override // X.AbstractC1376390lvB, X.InterfaceC1369790lkX
            public final boolean LJIIL(C1371420lnA c1371420lnA, Context context, C0M7Y c0m7y) {
                String strLIZ = c1371420lnA.LIZ("whatsapp_target_phone_number", "");
                if (!TextUtils.isEmpty(strLIZ)) {
                    if (!LJIILLIIL(context, c1371420lnA)) {
                        return false;
                    }
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setPackage("com.whatsapp");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("https://wa.me/");
                    sbLIZ.append(strLIZ);
                    sbLIZ.append("?text=");
                    sbLIZ.append(AbstractC1376120luk.LIZ(c1371420lnA));
                    intent.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, context);
                    C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYpHA2T4LJAA5E2g/h1PMFD2+hc9DwERleVTOoZKUQptHG9YGmezsX30=", null));
                    return true;
                }
                if (c1371420lnA.LIZ("image", "").length() == 0) {
                    return super.LJIIL(c1371420lnA, context, c0m7y);
                }
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("image/*");
                intent2.setPackage("com.whatsapp");
                intent2.putExtra("android.intent.extra.STREAM", UriProtector.parse(c1371420lnA.LIZ("image", "")));
                intent2.putExtra("android.intent.extra.TEXT", AbstractC1376120luk.LIZ(c1371420lnA));
                intent2.addFlags(268435456);
                intent2.addFlags(64);
                if (C1370370llT.LJ.LIZIZ()) {
                    intent2.putExtra("jid", "status@broadcast");
                }
                return LJ(context, intent2);
            }
        };
    }
}
