package com.bytedance.android.livesdk.interaction.poll.ui.giftwidget;

import X.C1086790eO5;
import X.C1086830eO9;
import X.C1086850eOB;
import X.C1086880eOE;
import X.C1161920gLG;
import X.C16F5;
import X.C16FS;
import X.C1954807lC;
import X.C497740JfY;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC1086890eOF;
import X.EnumC1086920eOI;
import X.InterfaceC1086910eOH;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveGiftPollEffectWidget;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftPollWidget extends AbsPollWidget {
    public final InterfaceC1086910eOH LL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hry;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final void B1() {
        C1086790eO5.LIZ(this.dataChannel, EnumC1086920eOI.GIFT);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final void D1() {
        C16FS c16fs = (C16FS) this.contentView.findViewById(R.id.a24);
        c16fs.LJ();
        if (C1086830eO9.LIZLLL()) {
            C1086790eO5.LIZJ(EnumC1086920eOI.GIFT, 0);
            C1086790eO5.LJIIJ("is_ongoing");
            C766270U4b.LIZLLL(2131841952);
        } else {
            EnumC1086920eOI enumC1086920eOI = EnumC1086920eOI.GIFT;
            C1086790eO5.LIZJ(enumC1086920eOI, 1);
            InterfaceC1086910eOH interfaceC1086910eOH = this.LL;
            if (interfaceC1086910eOH != null) {
                interfaceC1086910eOH.X3(enumC1086920eOI);
            }
        }
        c16fs.LJIIL();
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final boolean x1() {
        boolean zX1 = super.x1();
        if (zX1) {
            C1086790eO5.LJII(this.dataChannel, EnumC1086920eOI.GIFT);
        }
        return zX1;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final void z1() {
        super.z1();
        this.subWidgetManager.load(R.id.rfi, new LiveGiftPollEffectWidget(259));
        C1086790eO5.LJIIIZ(this.dataChannel, EnumC1086920eOI.GIFT);
    }

    public GiftPollWidget(InterfaceC1086910eOH interfaceC1086910eOH) {
        this.LL = interfaceC1086910eOH;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final void C1(String str) {
        C1086790eO5.LJI(this.dataChannel, str, EnumC1086920eOI.GIFT);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        EnumC1086890eOF enumC1086890eOF;
        String str;
        Gift gift;
        String str2;
        Gift gift2;
        super.onLoad(objArr);
        if (C1086830eO9.LIZJ()) {
            enumC1086890eOF = EnumC1086890eOF.POLLING;
        } else if (C1086830eO9.LIZ(this.dataChannel, EnumC1086920eOI.GIFT) == null) {
            enumC1086890eOF = EnumC1086890eOF.FIRST;
        } else {
            enumC1086890eOF = EnumC1086890eOF.NOT_POLLING;
        }
        int i = C1086880eOE.LIZ[enumC1086890eOF.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    z1();
                    return;
                }
                throw new C1954807lC();
            }
            super.A1();
            this.subWidgetManager.load(R.id.rfi, new LiveGiftPollEffectWidget(258));
            C1086790eO5.LJIIIZ(this.dataChannel, EnumC1086920eOI.GIFT);
            return;
        }
        super.y1();
        C1086850eOB pollGifts = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getPollGifts();
        C16F5 c16f5 = (C16F5) this.contentView.findViewById(R.id.fo7);
        C786410Ut5.LLJJJJ(c16f5, 0);
        c16f5.setMaxLines(3);
        c16f5.setEllipsize(TextUtils.TruncateAt.END);
        Object[] objArr2 = new Object[2];
        String str3 = "";
        if (pollGifts == null || (gift2 = pollGifts.LIZ) == null || (str = gift2.name) == null) {
            str = "";
        }
        objArr2[0] = str;
        if (pollGifts != null && (gift = pollGifts.LIZIZ) != null && (str2 = gift.name) != null) {
            str3 = str2;
        }
        objArr2[1] = str3;
        c16f5.setText(C497740JfY.LJIJJ(2131843818, objArr2));
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager == null) {
            return;
        }
        recyclableWidgetManager.load(R.id.ulf, GiftStartPollWidget.class, false);
    }
}
