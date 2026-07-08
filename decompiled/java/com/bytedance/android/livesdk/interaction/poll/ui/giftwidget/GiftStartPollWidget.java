package com.bytedance.android.livesdk.interaction.poll.ui.giftwidget;

import X.C0IPN;
import X.C1086850eOB;
import X.C1143680frq;
import X.C1151470g4P;
import X.C1161920gLG;
import X.C1324570kZb;
import X.C1324720kZq;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftStartPollWidget extends LiveRecyclableWidget {
    public C1086850eOB LL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hrz;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        String str;
        String str2;
        Integer numValueOf;
        Integer numValueOf2;
        ImageModel imageModel;
        Gift gift;
        Gift gift2;
        Gift gift3;
        Gift gift4;
        Gift gift5;
        Gift gift6;
        this.LL = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPollGifts();
        View viewFindViewById = this.contentView.findViewById(R.id.izf);
        viewFindViewById.setOutlineProvider(new C1151470g4P(0));
        viewFindViewById.setClipToOutline(true);
        View viewFindViewById2 = this.contentView.findViewById(R.id.izg);
        View viewFindViewById3 = this.contentView.findViewById(R.id.izh);
        C1143680frq.LIZLLL(viewFindViewById, C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_bg_gift_poll_widget.png");
        C1143680frq.LIZLLL(viewFindViewById2, C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_icon_gift_poll_coin.png");
        C1143680frq.LIZLLL(viewFindViewById3, C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_icon_gift_poll_coin.png");
        if (this.LL != null) {
            C1324720kZq c1324720kZq = (C1324720kZq) this.contentView.findViewById(R.id.rfv);
            C1324720kZq c1324720kZq2 = (C1324720kZq) this.contentView.findViewById(R.id.rg5);
            TextView textView = (TextView) this.contentView.findViewById(R.id.rfu);
            C1086850eOB c1086850eOB = this.LL;
            ImageModel imageModel2 = null;
            if (c1086850eOB != null && (gift6 = c1086850eOB.LIZ) != null) {
                str = gift6.name;
            } else {
                str = null;
            }
            textView.setText(str);
            TextView textView2 = (TextView) this.contentView.findViewById(R.id.rg4);
            C1086850eOB c1086850eOB2 = this.LL;
            if (c1086850eOB2 != null && (gift5 = c1086850eOB2.LIZIZ) != null) {
                str2 = gift5.name;
            } else {
                str2 = null;
            }
            textView2.setText(str2);
            TextView textView3 = (TextView) this.contentView.findViewById(R.id.mkj);
            C1086850eOB c1086850eOB3 = this.LL;
            if (c1086850eOB3 != null && (gift4 = c1086850eOB3.LIZ) != null) {
                numValueOf = Integer.valueOf(gift4.diamondCount);
            } else {
                numValueOf = null;
            }
            textView3.setText(String.valueOf(numValueOf));
            TextView textView4 = (TextView) this.contentView.findViewById(R.id.tly);
            C1086850eOB c1086850eOB4 = this.LL;
            if (c1086850eOB4 != null && (gift3 = c1086850eOB4.LIZIZ) != null) {
                numValueOf2 = Integer.valueOf(gift3.diamondCount);
            } else {
                numValueOf2 = null;
            }
            textView4.setText(String.valueOf(numValueOf2));
            C1086850eOB c1086850eOB5 = this.LL;
            if (c1086850eOB5 != null && (gift2 = c1086850eOB5.LIZ) != null) {
                imageModel = gift2.icon;
            } else {
                imageModel = null;
            }
            C1324570kZb.LIZIZ(imageModel, c1324720kZq);
            C1086850eOB c1086850eOB6 = this.LL;
            if (c1086850eOB6 != null && (gift = c1086850eOB6.LIZIZ) != null) {
                imageModel2 = gift.icon;
            }
            C1324570kZb.LIZIZ(imageModel2, c1324720kZq2);
        }
    }
}
