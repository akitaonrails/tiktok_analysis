package kotlin.jvm.internal;

import X.C09AY;
import X.C0DF2;
import X.C0DF6;
import X.C0DZT;
import X.C0LU9;
import X.C0LUA;
import X.C0LUB;
import X.C0LUC;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C1397620mTQ;
import X.C13LP;
import X.C15438062q;
import X.C20684815ws;
import X.C2266641Dni;
import X.C2266661Dnk;
import X.C2344009Gk;
import X.C322320CkI;
import X.C322450CkV;
import X.C322460CkW;
import X.C341410DZz;
import android.content.Context;
import com.ss.android.ugc.aweme.ad.ecp.model.ShopifyEcpCheckout;
import com.ss.android.ugc.aweme.ad.ucp.IUcpService;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailViewModel;
import com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtPanelFragment;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public class AwS89S1200000_4 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS89S1200000_4 awS89S1200000_4, Object obj) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("prop_id", ((NewFaceStickerBean) awS89S1200000_4.l1).id);
        c2344009Gk.LJIIIIZZ("scene_id", "1001");
        c2344009Gk.LJIIIIZZ("enter_from", awS89S1200000_4.s0);
        C20684815ws.LJIILLIIL("confirm_toast", c2344009Gk.LIZ);
        C341410DZz.LIZIZ((Context) awS89S1200000_4.l2, (NewFaceStickerBean) awS89S1200000_4.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS89S1200000_4 awS89S1200000_4, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131830590, new AwS89S1200000_4((Context) awS89S1200000_4.l2, (NewFaceStickerBean) awS89S1200000_4.l1, awS89S1200000_4.s0, 0));
        c1397620mTQ.LJII(R.string.f1_, null);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS89S1200000_4 awS89S1200000_4, Object obj) {
        boolean zBooleanValue;
        int iIntValue = ((Number) obj).intValue();
        C0DZT c0dzt = (C0DZT) awS89S1200000_4.l1;
        if (c0dzt != null) {
            SocialThoughtPanelFragment socialThoughtPanelFragment = (SocialThoughtPanelFragment) awS89S1200000_4.l2;
            String str = socialThoughtPanelFragment.LLIZLLLIL;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = socialThoughtPanelFragment.LLJ;
            if (str3 != null) {
                str2 = str3;
            }
            Boolean bool = socialThoughtPanelFragment.LLJI;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c0dzt.LIZIZ(iIntValue, str, str2, awS89S1200000_4.s0, "creation_panel_title", zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS89S1200000_4 awS89S1200000_4, Object obj) {
        boolean zBooleanValue;
        int iIntValue = ((Number) obj).intValue();
        C0DZT c0dzt = (C0DZT) awS89S1200000_4.l1;
        if (c0dzt != null) {
            SocialThoughtPanelFragment socialThoughtPanelFragment = (SocialThoughtPanelFragment) awS89S1200000_4.l2;
            String str = socialThoughtPanelFragment.LLIZLLLIL;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = socialThoughtPanelFragment.LLJ;
            if (str3 != null) {
                str2 = str3;
            }
            Boolean bool = socialThoughtPanelFragment.LLJI;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c0dzt.LIZ(iIntValue, str, str2, awS89S1200000_4.s0, "creation_panel_title", zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS89S1200000_4 awS89S1200000_4, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2266641Dni.LIZ.getClass();
        C1002190cBd c1002190cBd = C2266641Dni.LJII;
        C0DF2 c0df2 = C0DF2.LIZ;
        ShopifyEcpCheckout shopifyEcpCheckout = (ShopifyEcpCheckout) awS89S1200000_4.l1;
        c0df2.getClass();
        c1023640ckE.withParam(c1002190cBd, C0DF2.LIZ(shopifyEcpCheckout));
        c1023640ckE.withParam(C2266641Dni.LJ, awS89S1200000_4.s0);
        c1023640ckE.withParam(C2266641Dni.LJJIJ, C0DF2.LJI((C0DF6) awS89S1200000_4.l2));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS89S1200000_4 awS89S1200000_4, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2266661Dnk.LIZ.getClass();
        C1002190cBd c1002190cBd = C2266661Dnk.LJII;
        C0DF2 c0df2 = C0DF2.LIZ;
        ShopifyEcpCheckout shopifyEcpCheckout = (ShopifyEcpCheckout) awS89S1200000_4.l1;
        c0df2.getClass();
        c1023640ckE.withParam(c1002190cBd, C0DF2.LIZ(shopifyEcpCheckout));
        C1002190cBd c1002190cBd2 = C2266661Dnk.LJ;
        String str = awS89S1200000_4.s0;
        if (a0.LJJJIL(str)) {
            str = "user_cancel";
        }
        c1023640ckE.withParam(c1002190cBd2, str);
        c1023640ckE.withParam(C2266661Dnk.LJJIJ, C0DF2.LJI((C0DF6) awS89S1200000_4.l2));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS89S1200000_4 awS89S1200000_4, Object obj) {
        C322320CkI c322320CkI = (C322320CkI) obj;
        List<Object> list = c322320CkI.LLILLL.LIZ;
        String str = awS89S1200000_4.s0;
        EffectDraftDetailViewModel effectDraftDetailViewModel = (EffectDraftDetailViewModel) awS89S1200000_4.l1;
        C0LU9 c0lu9 = (C0LU9) awS89S1200000_4.l2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Object objLIZIZ : list) {
            if (objLIZIZ instanceof C322460CkW) {
                C322460CkW c322460CkW = (C322460CkW) objLIZIZ;
                if (Intrinsics.LJFF(c322460CkW.LIZ.getAigcInfo().getWorkflowTaskId(), str)) {
                    effectDraftDetailViewModel.getClass();
                    if (c0lu9 instanceof C0LUB) {
                        objLIZIZ = C322460CkW.LIZIZ(c322460CkW, null, 1, ((C0LUB) c0lu9).LIZIZ, "", 32319);
                    } else if (c0lu9 instanceof C0LUC) {
                        String str2 = (String) C13LP.LJJJLL(((C0LUC) c0lu9).LIZ.LIZ);
                        if (str2 == null) {
                            str2 = "";
                        }
                        objLIZIZ = C322460CkW.LIZIZ(c322460CkW, null, 2, 100.0f, str2, 32319);
                    } else {
                        objLIZIZ = c0lu9 instanceof C0LUA ? C322460CkW.LIZIZ(c322460CkW, null, 3, 0.0f, "", 32319) : C322460CkW.LIZIZ(c322460CkW, null, 0, 0.0f, "", 32319);
                    }
                }
            }
            arrayList.add(objLIZIZ);
        }
        c322320CkI.LLILLL.getClass();
        return C322320CkI.LIZ(c322320CkI, null, null, new C322450CkV(arrayList), null, null, 27);
    }

    public static final Object invoke$7(AwS89S1200000_4 awS89S1200000_4, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((IUcpService) awS89S1200000_4.l1).LJIIJ((AwemeRawAd) awS89S1200000_4.l2);
        }
        CommerceVideoDelegateKt.checkedEnableUcpAwemes.remove(awS89S1200000_4.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S1200000_4(C0DF6 c0df6, ShopifyEcpCheckout shopifyEcpCheckout, int i) {
        super(1);
        this.$t = i;
        this.l1 = shopifyEcpCheckout;
        this.s0 = "";
        this.l2 = c0df6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S1200000_4(C0DF6 c0df6, ShopifyEcpCheckout shopifyEcpCheckout, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = shopifyEcpCheckout;
        this.s0 = str;
        this.l2 = c0df6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S1200000_4(C0DZT c0dzt, SocialThoughtPanelFragment socialThoughtPanelFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c0dzt;
        this.l2 = socialThoughtPanelFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S1200000_4(Context context, NewFaceStickerBean newFaceStickerBean, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = newFaceStickerBean;
        this.s0 = str;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S1200000_4(IUcpService iUcpService, AwemeRawAd awemeRawAd, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = iUcpService;
        this.l2 = awemeRawAd;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S1200000_4(String str, EffectDraftDetailViewModel effectDraftDetailViewModel, C0LU9 c0lu9, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = effectDraftDetailViewModel;
        this.l2 = c0lu9;
    }
}
