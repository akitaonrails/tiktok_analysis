package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.customizedperks;

import X.C0IJT;
import X.C0KVU;
import X.C1108790exZ;
import X.C1124870fNV;
import X.C13LP;
import X.C19748512Ol;
import X.C474500IjA;
import X.C500260Jjc;
import X.C782110Um9;
import X.C786410Ut5;
import X.EnumC1108700exQ;
import X.InterfaceC743640TFa;
import android.net.Uri;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget;
import com.bytedance.android.livesdk.dataChannel.CustomizedPerksCardVisibilityChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;

/* JADX INFO: loaded from: classes18.dex */
public class CustomizedPerksCardWidget extends SubscriptionExplainCardWidget {
    public final int LLJJIJI = 1;

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget
    public final void D1() {
        final C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_customized_perk_pin_confirm_click");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJIIZI(this.LLILZIL);
        C782110Um9 c782110Um9 = new C782110Um9(this.context);
        c782110Um9.LJIIZILJ(2131843775);
        c782110Um9.LJII(2131843774);
        c782110Um9.LJIILIIL(2131843773, new InterfaceC743640TFa() { // from class: X.0exF
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) throws JSONException {
                if (((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Ly1()) {
                    ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).bC1(new C1108800exa(this.LIZ));
                } else {
                    this.LIZ.C1(true);
                }
                liveDialog.dismiss();
                C474500IjA c474500IjA = c474500IjALIZ;
                c474500IjA.LJJII(this.LIZ.LLILZLL.name().toLowerCase(Locale.ROOT), "original_card_type");
                c474500IjA.LJJII("confirm", "click_type");
                c474500IjA.LIZ();
            }
        });
        c782110Um9.LJIIJ(2131843772, new InterfaceC743640TFa() { // from class: X.0exS
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) throws JSONException {
                this.LIZ.C1(false);
                liveDialog.dismiss();
                C474500IjA c474500IjA = c474500IjALIZ;
                c474500IjA.LJJII("cancel", "click_type");
                c474500IjA.LIZ();
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget
    public int z1() {
        return this.LLJJIJI;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget
    public final void A1(EnumC1108700exQ enumC1108700exQ) {
        String str;
        this.LLILZ = SystemClock.elapsedRealtime();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_customized_perk_pin_duration");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJIIZI(this.LLILZIL);
        c474500IjALIZ.LJJII(Long.valueOf((this.LLILZ - this.LLILLL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "anchor_pin_duration");
        c474500IjALIZ.LJJII(enumC1108700exQ.name().toLowerCase(Locale.ROOT), "finished_type");
        if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            str = "anchor";
        } else {
            str = "moderator";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LIZ();
    }

    public void LLLLZI(C1108790exZ c1108790exZ) {
        if (B1(c1108790exZ.LIZ, c1108790exZ.LIZJ, c1108790exZ.LIZLLL)) {
            this.dataChannel.zW(CustomizedPerksCardVisibilityChannel.class, Boolean.TRUE);
        }
    }

    public final Uri.Builder F1(SubPinCard subPinCard, boolean z) {
        Integer numValueOf;
        String strLIZIZ;
        String strLIZIZ2;
        User owner;
        String str;
        String str2;
        User owner2;
        SubscribeInfo subscribeInfo;
        User owner3;
        SubscribeInfo subscribeInfo2;
        List urls;
        User owner4;
        ImageModel avatarThumb;
        List urls2;
        Integer numValueOf2;
        String str3;
        String str4;
        SubPinCard.Text text = subPinCard.title;
        String str5 = null;
        if (text != null) {
            numValueOf = Integer.valueOf(text.type);
        } else {
            numValueOf = null;
        }
        String str6 = "";
        if (numValueOf == null) {
            strLIZIZ = "";
        } else {
            if (numValueOf.intValue() == 1) {
                SubPinCard.Text text2 = subPinCard.title;
                if (text2 != null) {
                    strLIZIZ = text2.content;
                }
                strLIZIZ = "";
            } else {
                if (numValueOf.intValue() == 2) {
                    C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
                    SubPinCard.Text text3 = subPinCard.title;
                    if (text3 != null) {
                        str4 = text3.content;
                    } else {
                        str4 = null;
                    }
                    c1124870fNVLIZJ.getClass();
                    strLIZIZ = C1124870fNV.LIZIZ(str4);
                }
                strLIZIZ = "";
            }
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
        }
        SubPinCard.Text text4 = subPinCard.desc;
        if (text4 == null || (numValueOf2 = Integer.valueOf(text4.type)) == null) {
            strLIZIZ2 = "";
            str6 = strLIZIZ2;
        } else {
            if (numValueOf2.intValue() == 1) {
                SubPinCard.Text text5 = subPinCard.desc;
                if (text5 != null) {
                    strLIZIZ2 = text5.content;
                }
            } else {
                if (numValueOf2.intValue() == 2) {
                    C1124870fNV c1124870fNVLIZJ2 = C1124870fNV.LIZJ();
                    SubPinCard.Text text6 = subPinCard.desc;
                    if (text6 != null) {
                        str3 = text6.content;
                    } else {
                        str3 = null;
                    }
                    c1124870fNVLIZJ2.getClass();
                    strLIZIZ2 = C1124870fNV.LIZIZ(str3);
                }
                strLIZIZ2 = "";
                str6 = strLIZIZ2;
            }
            if (strLIZIZ2 != null) {
                str6 = strLIZIZ2;
            }
        }
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(LiveSubscribeLynxUrl.INSTANCE.getValue().getPinCard()).buildUpon().appendQueryParameter("title", strLIZIZ).appendQueryParameter("content", str6);
        Room room = this.LL;
        if (room != null) {
            owner = room.getOwner();
        } else {
            owner = null;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("anchor_name", C0KVU.LIZ(owner));
        Room room2 = this.LL;
        if (room2 != null && (owner4 = room2.getOwner()) != null && (avatarThumb = owner4.getAvatarThumb()) != null && (urls2 = avatarThumb.getUrls()) != null) {
            str = (String) C13LP.LJJJLL(urls2);
        } else {
            str = null;
        }
        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("anchor_icon_url", str);
        ImageModel imageModel = subPinCard.image;
        if (imageModel != null && (urls = imageModel.getUrls()) != null) {
            str5 = (String) C13LP.LJJJLL(urls);
        }
        Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("benefit_icon_url", str5);
        Room room3 = this.LL;
        if (room3 != null && (owner3 = room3.getOwner()) != null && (subscribeInfo2 = owner3.getSubscribeInfo()) != null && subscribeInfo2.isSubscribed()) {
            str2 = "subscribed_not_expired";
        } else {
            Room room4 = this.LL;
            if (room4 != null && (owner2 = room4.getOwner()) != null && (subscribeInfo = owner2.getSubscribeInfo()) != null && subscribeInfo.isInGracePeriod()) {
                str2 = "subscribed_expired_grace_period";
            } else {
                str2 = "not_subscribed";
            }
        }
        return builderAppendQueryParameter4.appendQueryParameter("subscription_state", str2).appendQueryParameter("logParams", GsonProtectorUtils.toJson(C19748512Ol.LIZJ, this.LLILZIL)).appendQueryParameter("is_current_moderator_pin", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0));
    }

    public void I(EnumC1108700exQ enumC1108700exQ, Long l) {
        if (E1(enumC1108700exQ, l)) {
            this.dataChannel.zW(CustomizedPerksCardVisibilityChannel.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget
    public String x1(SubPinCard subPinCard, boolean z) {
        return F1(subPinCard, z).build().toString();
    }
}
