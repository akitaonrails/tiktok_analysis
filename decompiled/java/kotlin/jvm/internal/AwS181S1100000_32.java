package kotlin.jvm.internal;

import X.AbstractC21274918Nn;
import X.AbstractC21673619ry;
import X.C049Q;
import X.C06MM;
import X.C09AY;
import X.C1153300g7M;
import X.C1449600npG;
import X.C1660670tJh;
import X.C1697810uHb;
import X.C18MZ;
import X.C18VE;
import X.C19EG;
import X.C202008142k;
import X.C20684815ws;
import X.C21154517qR;
import X.C212369188x;
import X.C21272518Mp;
import X.C21285518Rp;
import X.C2188811AlT;
import X.C869590Y9l;
import X.EnumC212372189a;
import X.InterfaceC1752840viM;
import X.InterfaceC21363618j4;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class AwS181S1100000_32 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS181S1100000_32 awS181S1100000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("external popup onLoadFailed[");
        sbLIZ.append(((C21154517qR) awS181S1100000_32.l1).LLIZ);
        sbLIZ.append("]: (msg: ");
        sbLIZ.append(awS181S1100000_32.s0);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS181S1100000_32 awS181S1100000_32) {
        return C1697810uHb.LJIIJJI(new C1153300g7M(awS181S1100000_32.s0), new C18VE((C869590Y9l) awS181S1100000_32.l1, EnumC212372189a.HIDE_USER_CONTENT));
    }

    public static final Object invoke$10(AwS181S1100000_32 awS181S1100000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChainRecordCallback btm=");
        sbLIZ.append(awS181S1100000_32.s0);
        sbLIZ.append(" snapshot=");
        sbLIZ.append((C212369188x) awS181S1100000_32.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS181S1100000_32 awS181S1100000_32) {
        C20684815ws.LJIJ(awS181S1100000_32.s0, (JSONObject) awS181S1100000_32.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS181S1100000_32 awS181S1100000_32) {
        int iIntValue;
        IECommerceVideoService iECommerceVideoService;
        Integer num;
        final ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = (ECommerceAnchorPanelFragment) awS181S1100000_32.l1;
        InterfaceC1752840viM interfaceC1752840viM = new InterfaceC1752840viM() { // from class: X.18OE
            @Override // X.InterfaceC1752840viM
            public final ViewGroup LJJIJL() {
                return eCommerceAnchorPanelFragment.LLJJJJJIL;
            }

            @Override // X.InterfaceC1752840viM
            public final View nb() {
                TuxIconView tuxIconView = eCommerceAnchorPanelFragment.LLJLLL;
                if (tuxIconView == null) {
                    return null;
                }
                return tuxIconView;
            }
        };
        try {
            CartRefreshEvent cartRefreshEventLIZ = C049Q.LIZ(awS181S1100000_32.s0);
            RecyclerView recyclerView = ((ECommerceAnchorPanelFragment) awS181S1100000_32.l1).LLJJJIL;
            AbstractC21673619ry adapter = null;
            if (recyclerView != null) {
                adapter = recyclerView.getAdapter();
            }
            if ((adapter instanceof C18MZ) && adapter != null && (num = cartRefreshEventLIZ.count) != null) {
                num.intValue();
            }
            ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment2 = (ECommerceAnchorPanelFragment) awS181S1100000_32.l1;
            Integer num2 = cartRefreshEventLIZ.count;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            eCommerceAnchorPanelFragment2.wS(iIntValue, ((ECommerceAnchorPanelFragment) awS181S1100000_32.l1).isResumed());
            C21272518Mp c21272518Mp = C21272518Mp.LIZ;
            Integer num3 = cartRefreshEventLIZ.count;
            c21272518Mp.getClass();
            C21272518Mp.LIZIZ(num3);
            ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment3 = (ECommerceAnchorPanelFragment) awS181S1100000_32.l1;
            RecyclerView recyclerView2 = eCommerceAnchorPanelFragment3.LLJJJIL;
            if (recyclerView2 != null && (iECommerceVideoService = eCommerceAnchorPanelFragment3.LLJLILLLLZIIL) != null) {
                C06MM.LIZ(eCommerceAnchorPanelFragment3.getContext());
                iECommerceVideoService.LIZJ(recyclerView2, interfaceC1752840viM, cartRefreshEventLIZ.toast);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS181S1100000_32 awS181S1100000_32) {
        AbstractC21274918Nn abstractC21274918Nn = (AbstractC21274918Nn) awS181S1100000_32.l1;
        if (abstractC21274918Nn != null) {
            abstractC21274918Nn.setPreTitle(awS181S1100000_32.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS181S1100000_32 awS181S1100000_32) {
        AbstractC21274918Nn abstractC21274918Nn = (AbstractC21274918Nn) awS181S1100000_32.l1;
        if (abstractC21274918Nn != null) {
            abstractC21274918Nn.setPreTitle(awS181S1100000_32.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS181S1100000_32 awS181S1100000_32) {
        ((C21285518Rp) awS181S1100000_32.l1).setRating(awS181S1100000_32.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS181S1100000_32 awS181S1100000_32) {
        Boolean boolValueOf;
        DiyPropVideoStickerHandler diyPropVideoStickerHandler = (DiyPropVideoStickerHandler) awS181S1100000_32.l1;
        InterfaceC21363618j4 interfaceC21363618j4 = diyPropVideoStickerHandler.LLJI;
        String str = diyPropVideoStickerHandler.LLILZ;
        String str2 = awS181S1100000_32.s0;
        DiyPropUploadVideoAutoCutConfigure diyPropUploadVideoAutoCutConfigureInvoke = diyPropVideoStickerHandler.LLJJI.invoke(diyPropVideoStickerHandler.LLJJJJ);
        Effect effect = ((DiyPropVideoStickerHandler) awS181S1100000_32.l1).LLJJJJ;
        if (effect != null) {
            boolValueOf = Boolean.valueOf(C1449600npG.LJIIIIZZ(effect));
        } else {
            boolValueOf = null;
        }
        Intent intentLIZIZ = interfaceC21363618j4.LIZIZ(str, str2, diyPropUploadVideoAutoCutConfigureInvoke, null, null, boolValueOf, null);
        C19EG c19eg = ((DiyPropVideoStickerHandler) awS181S1100000_32.l1).LLILLJJLI;
        C1660670tJh.LIZ().LIZ(((DiyPropVideoStickerHandler) awS181S1100000_32.l1).LLILLJJLI, intentLIZIZ);
        C202008142k.LIZ(c19eg, intentLIZIZ, new AwS681S0100000_32((DiyPropVideoStickerHandler) awS181S1100000_32.l1, 25));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS181S1100000_32 awS181S1100000_32) {
        return C1697810uHb.LJIIJJI(new C1153300g7M(awS181S1100000_32.s0), new C18VE((C869590Y9l) awS181S1100000_32.l1, EnumC212372189a.DELETE));
    }

    public static final Object invoke$9(AwS181S1100000_32 awS181S1100000_32) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChainRecordCallback btm=");
        sbLIZ.append(awS181S1100000_32.s0);
        sbLIZ.append(" content=");
        sbLIZ.append((C212369188x) awS181S1100000_32.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS181S1100000_32(C869590Y9l c869590Y9l, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c869590Y9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS181S1100000_32(C21154517qR c21154517qR, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c21154517qR;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS181S1100000_32(AbstractC21274918Nn abstractC21274918Nn, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC21274918Nn;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS181S1100000_32(C21285518Rp c21285518Rp, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c21285518Rp;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS181S1100000_32(DiyPropVideoStickerHandler diyPropVideoStickerHandler, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = diyPropVideoStickerHandler;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS181S1100000_32(String str, C212369188x c212369188x, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c212369188x;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS181S1100000_32(String str, ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = eCommerceAnchorPanelFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS181S1100000_32(String str, JSONObject jSONObject, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = jSONObject;
    }
}
