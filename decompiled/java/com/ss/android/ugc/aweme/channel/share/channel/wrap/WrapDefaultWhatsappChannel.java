package com.ss.android.ugc.aweme.channel.share.channel.wrap;

import X.AbstractC1376120luk;
import X.C0M7Y;
import X.C0WZX;
import X.C1371420lnA;
import X.C1374270lrl;
import X.C1375540lto;
import X.C1701330uNH;
import X.C2188811AlT;
import X.C2204961BRm;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.channel.share.model.IWrapChannel;

/* JADX INFO: loaded from: classes22.dex */
public final class WrapDefaultWhatsappChannel extends IWrapChannel {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final String LJJJJJL() {
        return "wrap_whatsapp";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final String LJJJJZ() {
        return "com.whatsapp";
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
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYpHA2T4LJAA5E2g/h1PMFD2+hc9jCi0VfET5lF4e+JLypg/A+p7Jiq3e3TLOG7OLGC75", null));
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
        return LJ(context, intent2);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJJLL(C1375540lto c1375540lto, Activity activity, C0M7Y c0m7y) {
        return LJJJIL(c1375540lto, activity, c0m7y);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJLIIIJ(C1371420lnA c1371420lnA, Activity activity, C0M7Y c0m7y) {
        return super.LJIIL(c1371420lnA, activity, c0m7y);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IWrapChannel
    public final boolean LJJLIIIJLJLI(C1374270lrl c1374270lrl, Activity activity, C0M7Y c0m7y) {
        return LJIJ(c1374270lrl, activity, c0m7y);
    }
}
