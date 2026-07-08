package com.ss.android.ugc.aweme.share.improve.channel;

import X.AbstractC1375550ltp;
import X.C20642515q3;
import X.C419910GdJ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class QrCodeChannel extends PureLogicChannel {
    public final Aweme LL;
    public final SharePackage LLILLJJLI;

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final boolean LJJLI() {
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return "qr_code";
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        return C20642515q3.LJI(2131858082);
    }

    public QrCodeChannel(Aweme aweme, SharePackage sharePackage) {
        this.LL = aweme;
        this.LLILLJJLI = sharePackage;
    }

    @Override // X.InterfaceC1369790lkX
    public final Drawable LJJII(Context context, boolean z) {
        int i;
        if (context != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (z) {
                i = R.raw.icon_color_qr_code_square;
            } else {
                i = R.raw.icon_color_qr_code_circle;
            }
            c419910GdJ.LIZ = i;
            return c419910GdJ.LIZ(context);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    @Override // X.InterfaceC1369790lkX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIIJ(X.AbstractC1375550ltp r14, android.content.Context r15, X.C0M7Y r16) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.channel.QrCodeChannel.LJJIIJ(X.0ltp, android.content.Context, X.0M7Y):boolean");
    }
}
