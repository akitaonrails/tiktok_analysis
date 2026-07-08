package com.ss.android.ugc.aweme.notification.aggregate.view;

import X.AbstractViewOnClickListenerC1840840y0I;
import X.C0OBG;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1720106oR;
import X.C1840830y0H;
import X.C1907940zkW;
import X.C2187451AjH;
import X.C2211631BhB;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.notification.aggregate.data.BulletinAggregateNotice;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class BulletinInviteNoticeCell extends PowerCell<BulletinAggregateNotice> implements View.OnClickListener {
    public final C1840830y0H LL = new C1840830y0H(this);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a9p;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211631BhB.LJ(this.itemView, new AwS606S0100000_27(this, 168));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        BulletinAggregateNotice bulletinAggregateNotice = (BulletinAggregateNotice) interfaceC1891350zJl;
        super.onBindItemView(bulletinAggregateNotice);
        ((AbstractViewOnClickListenerC1840840y0I) this.itemView.findViewById(R.id.peb)).h0(bulletinAggregateNotice, this.LL);
        ((AbstractViewOnClickListenerC1840840y0I) this.itemView.findViewById(R.id.peh)).h0(bulletinAggregateNotice, this.LL);
        ((AbstractViewOnClickListenerC1840840y0I) this.itemView.findViewById(R.id.pf0)).h0(bulletinAggregateNotice, this.LL);
        C786410Ut5.I7(this, this.itemView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Context contextLIZ;
        String str2;
        String str3;
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        BulletinAggregateNotice item = getItem();
        if (item != null) {
            str = item.schemeUrl;
        } else {
            str = null;
        }
        if (str != null) {
            C1840830y0H c1840830y0H = this.LL;
            if (c1840830y0H != null) {
                c1840830y0H.LJJLIIIJLLLLLLLZ(str);
            }
            if (str.length() == 0) {
                C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
                c1389890mGx.LJIIIZ(2131832569);
                c1389890mGx.LJIIJJI();
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("SimpleNoticeCommonView", "schema url is null");
                return;
            }
            Uri uri = UriProtector.parse(str);
            Context context = getContext();
            if (context == null || (contextLIZ = C1388190mED.LIZ(context)) == null) {
                C844470XAv.LIZ.getClass();
                contextLIZ = C844470XAv.LIZ();
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(contextLIZ, str);
            String str4 = "activity_message_page";
            if (this.LL != null) {
                str2 = "activity_message_page";
            } else {
                str2 = null;
            }
            smartRouteBuildRoute.withParam("enter_from", str2);
            if (this.LL != null) {
                str3 = "activity_message_page";
            } else {
                str3 = null;
            }
            smartRouteBuildRoute.withParam("refer", str3);
            if (this.LL == null) {
                str4 = null;
            }
            smartRouteBuildRoute.withParam("previous_page", str4);
            String strLIZIZ = C1907940zkW.LIZIZ(uri, "enter_method");
            if (strLIZIZ == null) {
                C1840830y0H c1840830y0H2 = this.LL;
                strLIZIZ = "click";
            }
            smartRouteBuildRoute.withParam("enter_method", strLIZIZ);
            smartRouteBuildRoute.open();
            return;
        }
        C1389890mGx c1389890mGx2 = new C1389890mGx(this.itemView);
        c1389890mGx2.LJIIIZ(2131832569);
        c1389890mGx2.LJIIJJI();
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("SimpleNoticeCommonView", "schema url is null");
    }
}
