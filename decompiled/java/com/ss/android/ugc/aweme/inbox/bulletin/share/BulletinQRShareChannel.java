package com.ss.android.ugc.aweme.inbox.bulletin.share;

import X.AbstractC1375550ltp;
import X.C0M7Y;
import X.C1372790lpN;
import X.C1388190mED;
import X.C19EG;
import X.C20642515q3;
import X.C419910GdJ;
import X.C621180OYa;
import X.C786410Ut5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class BulletinQRShareChannel extends PureLogicChannel {
    public final SharePackage LL;

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return "bulletin_board_share_qr_code";
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        return C20642515q3.LJI(2131845727);
    }

    public BulletinQRShareChannel(BulletinBoardInviteSharePackage bulletinBoardInviteSharePackage) {
        this.LL = bulletinBoardInviteSharePackage;
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
        Serializable serializable;
        BulletinBoardInfo bulletinBoardInfo;
        String str;
        long jLongValue;
        Long l;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            SharePackage sharePackage = this.LL;
            String string = sharePackage.extras.getString("enter_from");
            String string2 = sharePackage.extras.getString("enter_method");
            ShareModel shareModel = sharePackage.shareModel;
            UrlModel urlModel = null;
            if (shareModel != null) {
                serializable = shareModel.customModel;
            } else {
                serializable = null;
            }
            if (serializable instanceof BulletinBoardInfo) {
                bulletinBoardInfo = (BulletinBoardInfo) serializable;
            } else {
                bulletinBoardInfo = null;
            }
            Bundle bundle = new Bundle();
            if (bulletinBoardInfo != null) {
                str = bulletinBoardInfo.name;
            } else {
                str = null;
            }
            C786410Ut5.LJJJI("bulletin_title", str, bundle);
            if (bulletinBoardInfo != null && (l = bulletinBoardInfo.subscriberCount) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            bundle.putLong("bulletin_members", jLongValue);
            if (bulletinBoardInfo != null) {
                urlModel = bulletinBoardInfo.avatarUrl;
            }
            C786410Ut5.LJJIZ(bundle, "bulletin_avatar", urlModel);
            C786410Ut5.LJJJI("enter_from", string, bundle);
            C786410Ut5.LJJIIJZLJL(bundle, sharePackage.extras);
            C621180OYa.LIZ.LJIIJ(c19egLIZIZ, sharePackage.itemType, new C1372790lpN(50, sharePackage.url, bundle), string, string2);
            return true;
        }
        return false;
    }
}
