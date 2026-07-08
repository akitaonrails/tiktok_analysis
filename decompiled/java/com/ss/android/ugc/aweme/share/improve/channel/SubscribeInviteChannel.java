package com.ss.android.ugc.aweme.share.improve.channel;

import X.AbstractC1375550ltp;
import X.C0M7Y;
import X.C0U3R;
import X.C1370940lmO;
import X.C1375500ltk;
import X.C1599690rjL;
import X.C20642515q3;
import X.C419910GdJ;
import X.C786410Ut5;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSubscribeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class SubscribeInviteChannel extends PureLogicChannel {
    public final SharePackage LL;

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return "subscribe_invite";
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        return C20642515q3.LJI(R.string.tbc);
    }

    public SubscribeInviteChannel(LiveSubscribeSharePackage liveSubscribeSharePackage) {
        this.LL = liveSubscribeSharePackage;
    }

    @Override // X.InterfaceC1369790lkX
    public final Drawable LJJII(Context context, boolean z) {
        if (context != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_direct_message_circle;
            return c419910GdJ.LIZ(context);
        }
        return null;
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJJIIJ(AbstractC1375550ltp abstractC1375550ltp, Context context, C0M7Y c0m7y) {
        Activity activityLJII = C1375500ltk.LJII(context);
        if (activityLJII == null || TextUtils.isEmpty(this.LL.extras.getString("uid", ""))) {
            return false;
        }
        String string = this.LL.extras.getString("uid", "");
        IMUser iMUser = new IMUser();
        iMUser.setUid(string);
        try {
            String string2 = this.LL.extras.getString("subscribe_third_party_desc", "");
            String string3 = this.LL.extras.getString("url_for_im_share", "");
            C1370940lmO c1370940lmO = new C1370940lmO();
            c1370940lmO.LIZ = "subscribe_invite";
            SharePackage sharePackage = this.LL;
            c1370940lmO.LIZLLL = sharePackage.title;
            c1370940lmO.LJ = string2;
            c1370940lmO.LIZIZ = sharePackage.identifier;
            c1370940lmO.LJFF = string3;
            SharePackage sharePackage2 = new SharePackage(c1370940lmO);
            C786410Ut5.LJJIIJZLJL(sharePackage2.extras, this.LL.extras);
            IMSharePanelApi.LIZ.getClass();
            C1599690rjL.LIZ().getShareService().LJJIJIL(activityLJII, iMUser, sharePackage2, new C0U3R() { // from class: X.0lkA
                @Override // X.C0U3R
                public final /* bridge */ /* synthetic */ void run(Object obj) {
                }
            });
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        }
    }
}
