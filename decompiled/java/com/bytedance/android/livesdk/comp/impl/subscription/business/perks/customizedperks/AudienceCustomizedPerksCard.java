package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.customizedperks;

import X.C0IF2;
import X.C1091340eVQ;
import X.C1108350ewr;
import X.C1108790exZ;
import X.C1108820exc;
import X.C1108840exe;
import X.C1548820qPI;
import X.C1871910yoP;
import X.C262100zr;
import X.C784440Upu;
import X.EnumC1108060ewO;
import X.EnumC1108700exQ;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC463410IFf;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.dataChannel.CustomizedPerksCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AudienceCustomizedPerksCard extends CustomizedPerksCardWidget implements InterfaceC1141530foN {
    public final int LLJJIJIIJIL = 1;

    public abstract void I1();

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.customizedperks.CustomizedPerksCardWidget, com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void G1() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C1108840exe.class, null);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        C1548820qPI.LJIIIIZZ("subscription_pin_card_click_subscribe", this);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.customizedperks.CustomizedPerksCardWidget, com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget
    public final int z1() {
        return this.LLJJIJIIJIL;
    }

    public final void H1(C1108820exc c1108820exc) {
        C1108790exZ c1108790exZ = c1108820exc.LIZ;
        if (c1108790exZ != null) {
            if (c1108820exc.LIZIZ > 0) {
                c1108790exZ.LIZ.timeToLive = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + (c1108790exZ.LIZ.timeToLive - c1108820exc.LIZIZ);
            }
            G1();
            LLLLZI(c1108790exZ);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.customizedperks.CustomizedPerksCardWidget, X.InterfaceC1108360ews
    public final void LLLLZI(C1108790exZ c1108790exZ) {
        EnumC1108060ewO enumC1108060ewO;
        if (!this.LLJ && ((enumC1108060ewO = this.LLILZLL) == EnumC1108060ewO.LOCK_SCREEN || enumC1108060ewO == EnumC1108060ewO.KEY_BOARD)) {
            J1(c1108790exZ, System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        } else if (B1(c1108790exZ.LIZ, c1108790exZ.LIZJ, c1108790exZ.LIZLLL)) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(CustomizedPerksCardVisibilityChannel.class, Boolean.TRUE);
            }
            J1(c1108790exZ, 0L);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        final String string;
        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
        if (interfaceC1107590evd2 != null && C1871910yoP.LIZLLL(interfaceC1107590evd2, "pinCardType", 1) == 1 && Intrinsics.LJFF(c262100zr.LIZ, "subscription_pin_card_click_subscribe") && (interfaceC1107590evd = c262100zr.LIZIZ) != null && (string = interfaceC1107590evd.getString("scheme")) != null) {
            I1();
            C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
            C0IF2 c0if2 = new C0IF2("audience_subscribe_pin_card_click");
            c0if2.LIZJ = new InterfaceC463410IFf() { // from class: X.0exY
                @Override // X.InterfaceC463410IFf
                public final void LIZ(final C19EG c19eg) {
                    final String str = string;
                    C473410IhP.LIZJ(new Runnable() { // from class: X.00wM
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("AudienceCustomizedPerksCard@f7b1.onReceiveJsEvent$1$1$1");
                            try {
                                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(c19eg, str);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("AudienceCustomizedPerksCard@f7b1.onReceiveJsEvent$1$1$1");
                        }
                    }, 1000L);
                }
            };
            c784440UpuLIZ.LIZIZ(c0if2);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean zBooleanValue;
        C1108820exc c1108820exc;
        Boolean bool;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        C1091340eVQ c1091340eVQ = this.LLIZ;
        if (c1091340eVQ != null) {
            c1091340eVQ.setEnableScaleAnimationV2(true);
        }
        I1();
        C1091340eVQ c1091340eVQ2 = this.LLIZ;
        if (c1091340eVQ2 != null && (layoutParams2 = c1091340eVQ2.getLayoutParams()) != null) {
            layoutParams2.height = -1;
        }
        C1091340eVQ c1091340eVQ3 = this.LLIZ;
        if (c1091340eVQ3 != null && (layoutParams = c1091340eVQ3.getLayoutParams()) != null) {
            layoutParams.width = -1;
        }
        DataChannel dataChannel = this.dataChannel;
        Room room = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        }
        this.LL = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILLJJLI = zBooleanValue;
        C1108350ewr.LLILLJJLI.LJFF(this.LLJJIJIIJIL, this);
        Room room2 = this.LL;
        if (room2 != null && room2.subPinCard != null) {
            G1();
            C1108350ewr.LIZ(this.LL);
        } else {
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null && (c1108820exc = (C1108820exc) dataChannel3.gg0(C1108840exe.class)) != null) {
                Room room3 = this.LL;
                if (room3 != null && room3.getId() == c1108820exc.LIZJ && c1108820exc.LIZ != null) {
                    I1();
                    H1(c1108820exc);
                } else {
                    G1();
                }
            }
        }
        C1548820qPI.LIZLLL("subscription_pin_card_click_subscribe", this);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget
    public final boolean y1(long j) {
        if (j - ((long) 2000) <= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.customizedperks.CustomizedPerksCardWidget, X.InterfaceC1108360ews
    public final void I(EnumC1108700exQ enumC1108700exQ, Long l) {
        if (E1(enumC1108700exQ, l)) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(CustomizedPerksCardVisibilityChannel.class, Boolean.FALSE);
            }
            if (enumC1108700exQ != EnumC1108700exQ.HIDE) {
                G1();
            }
        }
    }

    public final void J1(C1108790exZ c1108790exZ, long j) {
        long id;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            Room room = this.LL;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            I1();
            dataChannel.SX0(C1108840exe.class, new C1108820exc(c1108790exZ, j, id));
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.customizedperks.CustomizedPerksCardWidget, com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget
    public final String x1(SubPinCard subPinCard, boolean z) {
        String str;
        this.LLILZIL.put("perk_id", String.valueOf(subPinCard.id));
        this.LLILZIL.put("template_id", String.valueOf(subPinCard.templateId));
        Map<String, String> map = this.LLILZIL;
        if (subPinCard.templateId != 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_template", str);
        Uri.Builder builderF1 = F1(subPinCard, z);
        I1();
        return builderF1.appendQueryParameter("is_landscape", "1").build().toString();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget, X.InterfaceC1108360ews
    public final void LJJZZIII(boolean z, boolean z2, EnumC1108060ewO enumC1108060ewO) {
        C1108820exc c1108820exc;
        EnumC1108700exQ enumC1108700exQ;
        C1108820exc c1108820exc2;
        this.LLJ = z;
        this.LLJI = z2;
        this.LLILZLL = enumC1108060ewO;
        if (!z) {
            if (enumC1108060ewO == EnumC1108060ewO.KEY_BOARD) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null && (c1108820exc2 = (C1108820exc) dataChannel.gg0(C1108840exe.class)) != null) {
                    c1108820exc2.LIZIZ = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                }
                enumC1108700exQ = EnumC1108700exQ.HIDE;
            } else {
                G1();
                enumC1108700exQ = EnumC1108700exQ.REPLACED;
            }
            I(enumC1108700exQ, Long.valueOf(this.LLJILJIL));
            return;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (c1108820exc = (C1108820exc) dataChannel2.gg0(C1108840exe.class)) == null || c1108820exc.LIZIZ <= 0) {
            return;
        }
        H1(c1108820exc);
    }
}
