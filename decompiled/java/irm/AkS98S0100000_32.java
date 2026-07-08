package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C1445410niV;
import X.C18XI;
import X.C197039127h;
import X.C21296918Vz;
import X.C21303918Yr;
import X.C21304318Yv;
import X.C21306718Zt;
import X.C21348618ge;
import X.C21349618go;
import X.C214848196g;
import X.C551400Lju;
import X.C551410Ljv;
import X.C551430Ljx;
import X.C551440Ljy;
import X.EnumC240900wR;
import X.EnumC551370Ljr;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AkS98S0100000_32 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
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
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS98S0100000_32(C21348618ge c21348618ge, int i) {
        super(500L);
        this.$t = i;
        switch (i) {
            case 6:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
                this.l0 = c21348618ge;
                break;
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            default:
                this.l0 = c21348618ge;
                break;
        }
    }

    public static final void LIZ$0(AkS98S0100000_32 akS98S0100000_32, View view) {
        ((C21306718Zt) akS98S0100000_32.l0).LLJI.LIZLLL.invoke();
    }

    public static final void LIZ$1(AkS98S0100000_32 akS98S0100000_32, View view) {
        ((C21306718Zt) akS98S0100000_32.l0).LLJI.LIZJ.invoke();
    }

    public static final void LIZ$10(AkS98S0100000_32 akS98S0100000_32, View view) {
        ((C21349618go) akS98S0100000_32.l0).LLLLIL().LIZ.invoke(new C551400Lju(EnumC551370Ljr.UPLOAD));
    }

    public static final void LIZ$11(AkS98S0100000_32 akS98S0100000_32, View view) {
        ((C21348618ge) akS98S0100000_32.l0).LLLLIL().LIZ.invoke(new C551400Lju(EnumC551370Ljr.DELETE));
    }

    public static final void LIZ$12(AkS98S0100000_32 akS98S0100000_32, View view) {
        ((C21348618ge) akS98S0100000_32.l0).LLLLIL().LIZ.invoke(new C551400Lju(EnumC551370Ljr.UPLOAD));
    }

    public static final void LIZ$13(AkS98S0100000_32 akS98S0100000_32, View view) {
        if (!((C21348618ge) akS98S0100000_32.l0).LLLLILI().LIZ.LJII) {
            ((C21348618ge) akS98S0100000_32.l0).LLLLIL().LIZ.invoke(new C551430Ljx());
        }
    }

    public static final void LIZ$14(AkS98S0100000_32 akS98S0100000_32, View view) {
        if (!((C21348618ge) akS98S0100000_32.l0).LLLLILI().LIZ.LJII) {
            ((C21348618ge) akS98S0100000_32.l0).LLLLIL().LIZ.invoke(new C551440Ljy(EnumC240900wR.CLICK));
        }
    }

    public static final void LIZ$15(AkS98S0100000_32 akS98S0100000_32, View view) {
        ((C21296918Vz) akS98S0100000_32.l0).LLLLIL().LIZJ.invoke(Boolean.valueOf(((C21296918Vz) akS98S0100000_32.l0).LLJZ));
    }

    public static final void LIZ$16(AkS98S0100000_32 akS98S0100000_32, View view) {
        C1445410niV c1445410niV = ((EditPostedVideoPublishActivity) akS98S0100000_32.l0).LLIZLLLIL;
        if (c1445410niV != null) {
            c1445410niV.LLLLLLJ(false);
        }
    }

    public static final void LIZ$17(AkS98S0100000_32 akS98S0100000_32, View view) {
        C1445410niV c1445410niV = ((EditPostedVideoPublishActivity) akS98S0100000_32.l0).LLIZLLLIL;
        if (c1445410niV != null) {
            C214848196g c214848196g = c1445410niV.LLLILZ;
            if (c214848196g == null) {
                c214848196g = null;
            }
            c214848196g.LJIILIIL();
        }
    }

    public static final void LIZ$18(AkS98S0100000_32 akS98S0100000_32, View view) {
        ((C21303918Yr) akS98S0100000_32.l0).LLLLIL().LIZ.invoke();
    }

    public static final void LIZ$19(AkS98S0100000_32 akS98S0100000_32, View view) {
        ((C21303918Yr) akS98S0100000_32.l0).LLLLIL().LIZIZ.invoke();
    }

    public static final void LIZ$2(AkS98S0100000_32 akS98S0100000_32, View view) {
        Context context;
        Function1<Context, Unit> function1 = ((C18XI) akS98S0100000_32.l0).LLLLIL().LIZIZ;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        function1.invoke(context);
    }

    public static final void LIZ$20(AkS98S0100000_32 akS98S0100000_32, View view) {
        ((C21304318Yv) akS98S0100000_32.l0).LLLLIL().LIZ.invoke();
    }

    public static final void LIZ$21(AkS98S0100000_32 akS98S0100000_32, View view) {
        ((C21304318Yv) akS98S0100000_32.l0).LLLLIL().LIZIZ.invoke();
    }

    public static final void LIZ$3(AkS98S0100000_32 akS98S0100000_32, View view) {
        Context context;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(((C18XI) akS98S0100000_32.l0).getSceneContext(), "AiChatPreviewFeatureScene_click_post_btn", true)) {
            Function1<Context, Unit> function1 = ((C18XI) akS98S0100000_32.l0).LLLLIL().LIZJ;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            function1.invoke(context);
        }
    }

    public static final void LIZ$4(AkS98S0100000_32 akS98S0100000_32, View view) {
        ((C21349618go) akS98S0100000_32.l0).LLLLIL().LIZ.invoke(new C551430Ljx());
    }

    public static final void LIZ$5(AkS98S0100000_32 akS98S0100000_32, View view) {
        ((C21349618go) akS98S0100000_32.l0).LLLLIL().LIZ.invoke(new C551410Ljv(((C21349618go) akS98S0100000_32.l0).LLLLILI().LIZ.LIZIZ));
    }

    public static final void LIZ$6(AkS98S0100000_32 akS98S0100000_32, View view) {
        C197039127h c197039127hLLLLLL = ((C21348618ge) akS98S0100000_32.l0).LLLLLL();
        if (c197039127hLLLLLL != null && !c197039127hLLLLLL.isEnabled()) {
            return;
        }
        ((C21348618ge) akS98S0100000_32.l0).LLLLIL().LIZ.invoke(new C551410Ljv(((C21348618ge) akS98S0100000_32.l0).LLLLILI().LIZ.LIZIZ));
    }

    public static final void LIZ$7(AkS98S0100000_32 akS98S0100000_32, View view) {
        ((C21349618go) akS98S0100000_32.l0).LLLLIL().LIZ.invoke(new C551400Lju(EnumC551370Ljr.UPLOAD));
    }

    public static final void LIZ$8(AkS98S0100000_32 akS98S0100000_32, View view) {
        ((C21349618go) akS98S0100000_32.l0).LLLLIL().LIZ.invoke(new C551400Lju(EnumC551370Ljr.DELETE));
    }

    public static final void LIZ$9(AkS98S0100000_32 akS98S0100000_32, View view) {
        if (!((C21348618ge) akS98S0100000_32.l0).LLLLILI().LIZ.LJII) {
            ((C21348618ge) akS98S0100000_32.l0).LLLLIL().LIZ.invoke(new C551400Lju(EnumC551370Ljr.UPLOAD));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS98S0100000_32(C18XI c18xi, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = c18xi;
    }

    public AkS98S0100000_32(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
