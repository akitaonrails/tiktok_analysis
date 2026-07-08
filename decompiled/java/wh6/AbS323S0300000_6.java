package wh6;

import X.AbstractC455680Htu;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C0HHA;
import X.C0HZ2;
import X.C0I3L;
import X.C0I3R;
import X.C0I40;
import X.C0I5T;
import X.C1388190mED;
import X.C1558520qew;
import X.C18JY;
import X.C1908480zlO;
import X.C1954807lC;
import X.C19EG;
import X.C2187451AjH;
import X.C454640HsE;
import X.C455420HtU;
import X.C457780HxI;
import X.C869590Y9l;
import X.EnumC437540HDs;
import X.InterfaceC539120LCk;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.QuotedAreaReusedAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.QuotedAreaReusedAssem2;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.ReactionReusedSkeletonUIContent;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class AbS323S0300000_6 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS323S0300000_6 abS323S0300000_6, View view) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        if (view != null) {
            C454640HsE c454640HsE = IMStickerApi.LIZ;
            if (c454640HsE.LIZIZ().getImSocialAvatarService().isEnabled() && (c19egLIZIZ = C1388190mED.LIZIZ((Context) abS323S0300000_6.l0)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                c454640HsE.LIZIZ().getImSocialAvatarService().LJJJZ(((C457780HxI) ((ReactionReusedSkeletonUIContent) abS323S0300000_6.l1).LLJJJJJIL.getValue()).LL, ((ReactionReusedSkeletonUIContent) abS323S0300000_6.l1).LJJIJL(), (C455420HtU) abS323S0300000_6.l2, supportFragmentManager);
            }
        }
    }

    public static final void LIZ$1(AbS323S0300000_6 abS323S0300000_6, View view) {
        MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility;
        if (view != null && (messageListQuotedMessageClickAbility = (MessageListQuotedMessageClickAbility) C1558520qew.LIZ(C1558520qew.LJIIL((QuotedAreaReusedAssem) abS323S0300000_6.l0), MessageListQuotedMessageClickAbility.class, null)) != null) {
            ((AbstractC455680Htu) ((C0I40) abS323S0300000_6.l1)).LIZ((View) abS323S0300000_6.l2, messageListQuotedMessageClickAbility);
        }
    }

    public static final void LIZ$2(AbS323S0300000_6 abS323S0300000_6, View view) {
        if (view != null) {
            QuotedAreaReusedAssem2 quotedAreaReusedAssem2 = (QuotedAreaReusedAssem2) abS323S0300000_6.l0;
            String.valueOf((C0I5T) abS323S0300000_6.l1);
            quotedAreaReusedAssem2.getClass();
            C0I40 c0i40 = (C0I40) abS323S0300000_6.l2;
            if (c0i40 instanceof AbstractC455680Htu) {
                MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility = (MessageListQuotedMessageClickAbility) ((QuotedAreaReusedAssem2) abS323S0300000_6.l0).LLLII.getValue();
                if (messageListQuotedMessageClickAbility != null) {
                    ((AbstractC455680Htu) ((C0I40) abS323S0300000_6.l2)).LIZ(((QuotedAreaReusedAssem2) abS323S0300000_6.l0).LJJIJL(), messageListQuotedMessageClickAbility);
                    return;
                }
                return;
            }
            if (c0i40 instanceof C0I3R) {
                MessageListQuotedMessageClickAbility messageListQuotedMessageClickAbility2 = (MessageListQuotedMessageClickAbility) ((QuotedAreaReusedAssem2) abS323S0300000_6.l0).LLLII.getValue();
                if (messageListQuotedMessageClickAbility2 == null) {
                    return;
                }
                C0I3R c0i3r = (C0I3R) ((C0I40) abS323S0300000_6.l2);
                messageListQuotedMessageClickAbility2.mV1(c0i3r.LIZ, c0i3r.LIZIZ);
                return;
            }
            if (Intrinsics.LJFF(c0i40, C0I3L.LIZ)) {
            } else {
                throw new C1954807lC();
            }
        }
    }

    public static final void LIZ$3(AbS323S0300000_6 abS323S0300000_6, View view) {
        if (view != null) {
            int i = C2187451AjH.LIZ;
            ((ISocialAvatarService) ServiceManager.get().getService(ISocialAvatarService.class)).LJIILLIIL(new C0HHA((Context) abS323S0300000_6.l0, "click_pop_up_error", "click_pop_up_error", "//profile_edit", null, 4, false, false, C0HZ2.GENERATE_FAILURE_IN_APP_PUSH_RETRY, false, null, 3360), EnumC437540HDs.FAILED, null);
            InnerPushMessage innerPushMessage = (InnerPushMessage) abS323S0300000_6.l1;
            if (innerPushMessage != null) {
                C1908480zlO.LIZIZ.LJII(C18JY.CLICK, innerPushMessage, "click", 0);
            }
            ((InterfaceC539120LCk) abS323S0300000_6.l2).LIZIZ("user click retry", null, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS323S0300000_6(QuotedAreaReusedAssem quotedAreaReusedAssem, C0I40 c0i40, View view, int i) {
        super(600L);
        this.$t = i;
        this.l0 = quotedAreaReusedAssem;
        this.l1 = c0i40;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS323S0300000_6(Object obj, Object obj2, Object obj3, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS323S0300000_6(QuotedAreaReusedAssem2 quotedAreaReusedAssem2, C0I5T c0i5t, C0I40 c0i40, C869590Y9l c869590Y9l, int i) {
        super(300L);
        this.$t = i;
        this.l0 = quotedAreaReusedAssem2;
        this.l1 = c0i5t;
        this.l2 = c0i40;
    }
}
