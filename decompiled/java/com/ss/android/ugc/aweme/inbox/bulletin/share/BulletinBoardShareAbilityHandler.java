package com.ss.android.ugc.aweme.inbox.bulletin.share;

import X.InterfaceC1364105Vn;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371340ln2;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinBoardInviteSharePackage;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardShareAbilityHandler extends TTShareDefaultHandler<BulletinBoardInviteSharePackage> {
    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final InterfaceC1371340ln2 LJFF() {
        return new InterfaceC1371340ln2() { // from class: X.0OPS
            @Override // X.InterfaceC1371340ln2
            public final void LIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
                String string;
                if (!(baseSharePackage instanceof BulletinBoardInviteSharePackage) || baseSharePackage == null || (string = baseSharePackage.extras.getString("channel_id")) == null) {
                    return;
                }
                int i = baseSharePackage.extras.getInt("is_author");
                int i2 = baseSharePackage.extras.getInt("is_subscribed");
                C0OPQ c0opq = C0OPQ.LIZ;
                String strKey = interfaceC1369790lkX.key();
                String string2 = baseSharePackage.extras.getString("panel_source");
                if (string2 == null) {
                    string2 = "share_panel";
                }
                String string3 = baseSharePackage.extras.getString("enter_from");
                if (string3 == null) {
                    string3 = "bulletin_board_detail_page";
                }
                String string4 = baseSharePackage.extras.getString("enter_method");
                if (string4 == null) {
                    string4 = "share_button";
                }
                c0opq.getClass();
                C0OPQ.LJJIJL(string, i, i2, strKey, string2, string3, string4);
            }

            @Override // X.InterfaceC1371340ln2
            public final void LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
                String string;
                if (!(baseSharePackage instanceof BulletinBoardInviteSharePackage) || baseSharePackage == null || (string = baseSharePackage.extras.getString("channel_id")) == null) {
                    return;
                }
                int i = baseSharePackage.extras.getInt("is_author");
                int i2 = baseSharePackage.extras.getInt("is_subscribed");
                C0OPQ c0opq = C0OPQ.LIZ;
                String strKey = interfaceC1369790lkX.key();
                String string2 = baseSharePackage.extras.getString("panel_source");
                if (string2 == null) {
                    string2 = "share_panel";
                }
                String string3 = baseSharePackage.extras.getString("enter_from");
                if (string3 == null) {
                    string3 = "bulletin_board_detail_page";
                }
                String string4 = baseSharePackage.extras.getString("enter_method");
                if (string4 == null) {
                    string4 = "share_button";
                }
                c0opq.getClass();
                C0OPQ.LJJIJLIJ(string, strKey, string2, string3, i, i2, 1, string4);
            }

            @Override // X.InterfaceC1371340ln2
            public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, C1374170lrb c1374170lrb) {
                String string;
                if (!(baseSharePackage instanceof BulletinBoardInviteSharePackage) || baseSharePackage == null || (string = baseSharePackage.extras.getString("channel_id")) == null) {
                    return;
                }
                int i = baseSharePackage.extras.getInt("is_author");
                int i2 = baseSharePackage.extras.getInt("is_subscribed");
                C0OPQ c0opq = C0OPQ.LIZ;
                String strKey = interfaceC1369790lkX.key();
                String string2 = baseSharePackage.extras.getString("panel_source");
                if (string2 == null) {
                    string2 = "share_panel";
                }
                String string3 = baseSharePackage.extras.getString("enter_from");
                if (string3 == null) {
                    string3 = "bulletin_board_detail_page";
                }
                String string4 = baseSharePackage.extras.getString("enter_method");
                if (string4 == null) {
                    string4 = "share_button";
                }
                c0opq.getClass();
                C0OPQ.LJJIJLIJ(string, strKey, string2, string3, i, i2, 0, string4);
            }
        };
    }

    public BulletinBoardShareAbilityHandler(Context context) {
        super(context);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final ShareContentType[] LJIIIIZZ(BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX) {
        return new ShareContentType[]{ShareContentType.LINK};
    }

    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final Object LJIIIZ(InterfaceC1369790lkX interfaceC1369790lkX, BaseSharePackage baseSharePackage, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return super.LJIIIZ(interfaceC1369790lkX, baseSharePackage, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.share.handler.TTShareDefaultHandler, com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler
    public final Object LJIILIIL(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, View view, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return super.LJIILIIL(context, baseSharePackage, interfaceC1369790lkX, view, interfaceC1364105Vn);
    }
}
