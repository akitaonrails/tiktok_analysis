package kotlin.jvm.internal;

import X.C09AY;
import X.C0C64;
import X.C11DL;
import X.C12BX;
import X.C194350111w;
import X.C194396113q;
import X.C196864120o;
import X.C196868120s;
import X.C197039127h;
import X.C201955140j;
import X.C2487409ou;
import X.C415650GRn;
import X.InterfaceC1452170ntP;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC874803bO;
import android.graphics.Bitmap;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsMaxBidFragment;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AuctionBidResp;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public class AwS490S0200000_29 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS490S0200000_29(C194350111w c194350111w, C194350111w c194350111w2, List<List<Effect>> list) {
        super(3);
        this.$t = list;
        this.l0 = c194350111w;
        this.l1 = c194350111w2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS490S0200000_29(C11DL c11dl, C11DL<? extends RECEIVER> c11dl2, InterfaceC1631630sYr<? super RECEIVER, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        super(3);
        this.$t = interfaceC1631630sYr;
        this.l0 = c11dl;
        this.l1 = c11dl2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS490S0200000_29(C196868120s c196868120s, C196864120o c196864120o, int i) {
        super(3);
        this.$t = i;
        this.l0 = c196868120s;
        this.l1 = c196864120o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS490S0200000_29(C197039127h c197039127h, UsMaxBidFragment usMaxBidFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = c197039127h;
        this.l1 = usMaxBidFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS490S0200000_29(C12BX c12bx, C12BX c12bx2, Function0<Unit> function0) {
        super(3);
        this.$t = function0;
        this.l0 = c12bx;
        this.l1 = c12bx2;
    }

    public static final Object invoke$0(AwS490S0200000_29 awS490S0200000_29, Object obj, Object obj2, Object obj3) {
        ((C12BX) awS490S0200000_29.l0).LIZJ((C415650GRn) obj, (Bitmap) obj2);
        Function1<Integer, Unit> onFetchSwitchColorListener = ((C12BX) awS490S0200000_29.l0).getOnFetchSwitchColorListener();
        if (onFetchSwitchColorListener != null) {
            onFetchSwitchColorListener.invoke(obj3);
        }
        Function0 function0 = (Function0) awS490S0200000_29.l1;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS490S0200000_29 awS490S0200000_29, Object obj, Object obj2, Object obj3) {
        int iNg;
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "sticker_flicker_fix_switch", true, false)) {
            if (zBooleanValue) {
                C201955140j.LIZIZ("ltc_info_sticker", "real update");
                ((C196868120s) awS490S0200000_29.l0).LJJI((int) fFloatValue, (int) fFloatValue2);
            } else {
                C201955140j.LIZIZ("ltc_info_sticker", "update to video duration when drag");
                InterfaceC1452170ntP value = ((C196864120o) awS490S0200000_29.l1).LLLILZ().g().getValue();
                if (value != null) {
                    iNg = value.ng();
                } else {
                    iNg = 0;
                }
                ((C196868120s) awS490S0200000_29.l0).LJJI(0, iNg);
            }
        } else {
            ((C196868120s) awS490S0200000_29.l0).LJJI((int) fFloatValue, (int) fFloatValue2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS490S0200000_29 awS490S0200000_29, Object obj, Object obj2, Object obj3) {
        final boolean zBooleanValue = ((Boolean) obj).booleanValue();
        final AuctionBidResp auctionBidResp = (AuctionBidResp) obj2;
        final String str = (String) obj3;
        final C197039127h c197039127h = (C197039127h) awS490S0200000_29.l0;
        final UsMaxBidFragment usMaxBidFragment = (UsMaxBidFragment) awS490S0200000_29.l1;
        C2487409ou.LIZJ(new Runnable() { // from class: X.11yG
            public final void LIZ() {
                String str2;
                c197039127h.setLoading(false);
                AuctionBidResp auctionBidResp2 = auctionBidResp;
                if (auctionBidResp2 == null || !Intrinsics.LJFF(auctionBidResp2.needOtp, Boolean.TRUE)) {
                    AuctionBidResp auctionBidResp3 = auctionBidResp;
                    if (auctionBidResp3 == null || !Intrinsics.LJFF(auctionBidResp3.needShowAddressPaymentSchema, Boolean.TRUE)) {
                        AuctionBidResp auctionBidResp4 = auctionBidResp;
                        if (auctionBidResp4 == null || !Intrinsics.LJFF(auctionBidResp4.needShowAuctionAgreement, Boolean.TRUE)) {
                            if (!zBooleanValue) {
                                TuxTextView tuxTextView = usMaxBidFragment.LLJIJIL;
                                if (tuxTextView != null) {
                                    C03DZ.LIZ(tuxTextView);
                                }
                                if (C123100dR.LIZ(str)) {
                                    C1389880mGw c1389880mGw = new C1389880mGw(c197039127h);
                                    c1389880mGw.LJIIIZ(str);
                                    c1389880mGw.LJIIJ();
                                    return;
                                } else {
                                    C1389880mGw c1389880mGw2 = new C1389880mGw(c197039127h);
                                    c1389880mGw2.LJIIIIZZ(2131833103);
                                    c1389880mGw2.LJIIJ();
                                    return;
                                }
                            }
                            AuctionBidResp auctionBidResp5 = auctionBidResp;
                            if (auctionBidResp5 == null || (str2 = auctionBidResp5.priceValidationText) == null || !C123100dR.LIZ(str2)) {
                                TuxTextView tuxTextView2 = usMaxBidFragment.LLJIJIL;
                                if (tuxTextView2 != null) {
                                    C03DZ.LIZ(tuxTextView2);
                                }
                                usMaxBidFragment.MR(true);
                                return;
                            }
                            TuxTextView tuxTextView3 = usMaxBidFragment.LLJIJIL;
                            if (tuxTextView3 != null) {
                                C03DZ.LIZJ(tuxTextView3);
                            }
                            TuxTextView tuxTextView4 = usMaxBidFragment.LLJIJIL;
                            if (tuxTextView4 != null) {
                                AuctionBidResp auctionBidResp6 = auctionBidResp;
                                tuxTextView4.setText(auctionBidResp6 != null ? auctionBidResp6.priceValidationText : null);
                            }
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("UsMaxBidFragment@8d87.setData$2$1$1$1$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("UsMaxBidFragment@8d87.setData$2$1$1$1$1");
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS490S0200000_29 awS490S0200000_29, Object obj, Object obj2, Object obj3) {
        InterfaceC874803bO receiver = ((C11DL) awS490S0200000_29.l0).getReceiver();
        if (receiver != null) {
            ((InterfaceC1631630sYr) awS490S0200000_29.l1).invoke(receiver, obj, obj2, obj3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS490S0200000_29 awS490S0200000_29, Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        if (list != null) {
            C194350111w c194350111w = (C194350111w) awS490S0200000_29.l0;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C194396113q.LIZIZ((Effect) it2.next(), c194350111w.getContext().getString(2131826395), null, null);
            }
            ((List) awS490S0200000_29.l1).add(list);
        }
        ((C194350111w) awS490S0200000_29.l0).LLJILLL = true;
        return Unit.LIZ;
    }
}
