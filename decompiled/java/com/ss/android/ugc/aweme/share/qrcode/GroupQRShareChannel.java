package com.ss.android.ugc.aweme.share.qrcode;

import X.AbstractC1375550ltp;
import X.C0M7Y;
import X.C1388190mED;
import X.C19EG;
import X.C20642515q3;
import X.C419910GdJ;
import X.C900610ZUt;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.ss.android.ugc.aweme.share.GroupSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupQRShareChannel extends PureLogicChannel {
    public final SharePackage LL;

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return "im_group_invite_qr_code";
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        return C20642515q3.LJI(2131831876);
    }

    public GroupQRShareChannel(GroupSharePackage groupSharePackage) {
        this.LL = groupSharePackage;
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

    @Override // X.InterfaceC1369790lkX
    public final boolean LJJIIJ(AbstractC1375550ltp abstractC1375550ltp, Context context, C0M7Y c0m7y) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            C900610ZUt c900610ZUt = C900610ZUt.LIZJ;
            SharePackage sharePackage = this.LL;
            c900610ZUt.getClass();
            C900610ZUt.LJ(c19egLIZIZ, sharePackage);
            return true;
        }
        return false;
    }
}
