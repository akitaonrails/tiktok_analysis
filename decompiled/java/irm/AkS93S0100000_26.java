package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C1737510vJd;
import X.C1757630vq5;
import X.C1764360w0w;
import X.C1766620w4a;
import X.C786410Ut5;
import X.EnumC1308950kAP;
import X.InterfaceC1737580vJk;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.richtextcontainer.SeaPdpRichTextContainerBffVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AkS93S0100000_26 extends AbstractViewOnClickListenerC1173120gdK {
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
            default:
                super.LIZ(view);
                break;
        }
    }

    public AkS93S0100000_26(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AkS93S0100000_26 akS93S0100000_26, View view) {
        ((SeaPdpRichTextContainerBffVH) akS93S0100000_26.l0).LIZIZ();
    }

    public static final void LIZ$1(AkS93S0100000_26 akS93S0100000_26, View view) {
        ((AbsCardVH) akS93S0100000_26.l0).LIZIZ();
    }

    public static final void LIZ$10(AkS93S0100000_26 akS93S0100000_26, View view) {
        C1737510vJd c1737510vJd = (C1737510vJd) akS93S0100000_26.l0;
        InterfaceC1737580vJk interfaceC1737580vJk = c1737510vJd.LLILLJJLI;
        if (interfaceC1737580vJk != null) {
            c1737510vJd.getBindingAdapterPosition();
            interfaceC1737580vJk.LIZ(((C1737510vJd) akS93S0100000_26.l0).LLILLL);
        }
    }

    public static final void LIZ$11(AkS93S0100000_26 akS93S0100000_26, View view) {
        C1737510vJd c1737510vJd = (C1737510vJd) akS93S0100000_26.l0;
        InterfaceC1737580vJk interfaceC1737580vJk = c1737510vJd.LLILLJJLI;
        if (interfaceC1737580vJk != null) {
            c1737510vJd.getBindingAdapterPosition();
            interfaceC1737580vJk.LIZ(((C1737510vJd) akS93S0100000_26.l0).LLILLL);
        }
    }

    public static final void LIZ$12(AkS93S0100000_26 akS93S0100000_26, View view) {
        C1737510vJd c1737510vJd = (C1737510vJd) akS93S0100000_26.l0;
        InterfaceC1737580vJk interfaceC1737580vJk = c1737510vJd.LLILLJJLI;
        if (interfaceC1737580vJk != null) {
            c1737510vJd.getBindingAdapterPosition();
            interfaceC1737580vJk.LIZ(((C1737510vJd) akS93S0100000_26.l0).LLILLL);
        }
    }

    public static final void LIZ$13(AkS93S0100000_26 akS93S0100000_26, View view) {
        C1737510vJd c1737510vJd = (C1737510vJd) akS93S0100000_26.l0;
        InterfaceC1737580vJk interfaceC1737580vJk = c1737510vJd.LLILLJJLI;
        if (interfaceC1737580vJk != null) {
            c1737510vJd.getBindingAdapterPosition();
            interfaceC1737580vJk.LIZ(((C1737510vJd) akS93S0100000_26.l0).LLILLL);
        }
    }

    public static final void LIZ$2(AkS93S0100000_26 akS93S0100000_26, View view) {
        if (((C1757630vq5) akS93S0100000_26.l0).getMediaController().isMuted()) {
            TuxIconView tuxIconView = ((C1757630vq5) akS93S0100000_26.l0).LLJJLIIIJLLLLLLLZ;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_speaker_2_fill_ltr);
            }
            ((C1757630vq5) akS93S0100000_26.l0).setMuted(false);
            return;
        }
        TuxIconView tuxIconView2 = ((C1757630vq5) akS93S0100000_26.l0).LLJJLIIIJLLLLLLLZ;
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(R.raw.icon_speaker_x_mark_fill_ltr);
        }
        ((C1757630vq5) akS93S0100000_26.l0).setMuted(true);
    }

    public static final void LIZ$3(AkS93S0100000_26 akS93S0100000_26, View view) {
        C1766620w4a c1766620w4a = ((C1764360w0w) akS93S0100000_26.l0).LLILZIL;
        if (c1766620w4a != null && c1766620w4a.LJIJ()) {
            return;
        }
        C1764360w0w c1764360w0w = (C1764360w0w) akS93S0100000_26.l0;
        if (c1764360w0w.LLJILLL) {
            c1764360w0w.LLJILLL = false;
            TuxIconView tuxIconView = c1764360w0w.LLJI;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
        }
        LinearLayout linearLayout = ((C1764360w0w) akS93S0100000_26.l0).LLJ;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        ((C1764360w0w) akS93S0100000_26.l0).LJ(Boolean.TRUE);
    }

    public static final void LIZ$4(AkS93S0100000_26 akS93S0100000_26, View view) {
        C1764360w0w c1764360w0w = (C1764360w0w) akS93S0100000_26.l0;
        C1766620w4a c1766620w4a = c1764360w0w.LLILZIL;
        if (c1766620w4a != null && c1766620w4a.LLILZ) {
            TuxIconView tuxIconView = c1764360w0w.LLJIJIL;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_speaker_2_fill_ltr);
            }
            ((C1764360w0w) akS93S0100000_26.l0).setMuted(false);
        } else {
            TuxIconView tuxIconView2 = c1764360w0w.LLJIJIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_speaker_x_mark_fill_ltr);
            }
            ((C1764360w0w) akS93S0100000_26.l0).setMuted(true);
        }
        ((C1764360w0w) akS93S0100000_26.l0).LIZJ("speaker");
    }

    public static final void LIZ$5(AkS93S0100000_26 akS93S0100000_26, View view) {
        C1766620w4a c1766620w4a = ((C1764360w0w) akS93S0100000_26.l0).LLILZIL;
        if (c1766620w4a != null && c1766620w4a.LJIJ()) {
            ((C1764360w0w) akS93S0100000_26.l0).setManuallyPause(true);
            C1766620w4a c1766620w4a2 = ((C1764360w0w) akS93S0100000_26.l0).LLILZIL;
            if (c1766620w4a2 != null) {
                c1766620w4a2.LJIL(EnumC1308950kAP.ACTIVE);
            }
        } else {
            ((C1764360w0w) akS93S0100000_26.l0).LJ(null);
        }
        ((C1764360w0w) akS93S0100000_26.l0).LIZJ("pause");
    }

    public static final void LIZ$6(AkS93S0100000_26 akS93S0100000_26, View view) {
        ((Function0) akS93S0100000_26.l0).invoke();
    }

    public static final void LIZ$7(AkS93S0100000_26 akS93S0100000_26, View view) {
        ((Function0) akS93S0100000_26.l0).invoke();
    }

    public static final void LIZ$8(AkS93S0100000_26 akS93S0100000_26, View view) {
        ((Function0) akS93S0100000_26.l0).invoke();
    }

    public static final void LIZ$9(AkS93S0100000_26 akS93S0100000_26, View view) {
        C1737510vJd c1737510vJd = (C1737510vJd) akS93S0100000_26.l0;
        InterfaceC1737580vJk interfaceC1737580vJk = c1737510vJd.LLILLJJLI;
        if (interfaceC1737580vJk != null) {
            c1737510vJd.getBindingAdapterPosition();
            interfaceC1737580vJk.LIZ(((C1737510vJd) akS93S0100000_26.l0).LLILLL);
        }
    }
}
