package kotlin.jvm.internal;

import X.C03DZ;
import X.C03FA;
import X.C03IT;
import X.C046T;
import X.C09AY;
import X.C0C64;
import X.C0H1U;
import X.C0H9H;
import X.C10515049h;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1537480q70;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1602160rnK;
import X.C1697580uHE;
import X.C1744100vUG;
import X.C1744700vVE;
import X.C1748720vbi;
import X.C1766720w4k;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C919503ib;
import X.EnumC1338240kve;
import X.InterfaceC1334290kpH;
import X.InterfaceC1631620sYq;
import Y.ARunnableS70S0200000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuHeaderReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSkuPromotionAndScreenEfficiencyConfig;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public class AFwS326S0000000_1 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(23);
    public final int $t;

    public static AFwS326S0000000_1 get$arr$(int i) {
        AFwS326S0000000_1 aFwS326S0000000_1 = (AFwS326S0000000_1) arr$.get(i);
        if (aFwS326S0000000_1 != null) {
            return aFwS326S0000000_1;
        }
        arr$.compareAndSet(i, null, new AFwS326S0000000_1(i));
        return (AFwS326S0000000_1) arr$.get(i);
    }

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
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case 16:
                return invoke$16(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2, obj3);
            case 19:
                return invoke$19(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2, obj3);
            case 21:
                return invoke$21(this, obj, obj2, obj3);
            case 22:
                return invoke$22(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS326S0000000_1(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        try {
            if (c1537480q70 instanceof SparkContext) {
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                SparkContext sparkContext = (SparkContext) c1537480q70;
                sparkContext.usePreload = true;
                c1537900q7g.getClass();
                return new C1541950qED(context, sparkContext).LIZ(false);
            }
            C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
            SparkContext sparkContext2 = new SparkContext();
            sparkContext2.LJJLIIJ(str);
            sparkContext2.usePreload = true;
            c1537900q7g2.getClass();
            return new C1541950qED(context, sparkContext2).LIZ(false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadViewFactory: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            return null;
        }
    }

    public static final Object invoke$1(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final Object invoke$10(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$11(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        C03IT thumbFirstImageUrlModel;
        View view = (View) obj;
        ((Number) obj3).intValue();
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        Image icon = ((Icon) obj2).getIcon();
        if (icon != null) {
            thumbFirstImageUrlModel = icon.toThumbFirstImageUrlModel();
        } else {
            thumbFirstImageUrlModel = null;
        }
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(thumbFirstImageUrlModel);
        c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_XY;
        c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.bv, view.getContext()));
        c1331670kl3LIZLLL.LJJI = C1326790kdB.LIZIZ;
        c1331670kl3LIZLLL.LJJ((InterfaceC1334290kpH) view.findViewById(R.id.uit));
        C786410Ut5.h3(c1331670kl3LIZLLL);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final Object invoke$14(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final Object invoke$15(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final Object invoke$16(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final Object invoke$17(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        return null;
    }

    public static final Object invoke$18(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.bizCert = new ThirdPartyBizCert(402681857);
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.bizCert = new ThirdPartyBizCert(402681857);
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final Object invoke$19(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        return Unit.LIZ;
    }

    public static final Object invoke$20(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final Object invoke$21(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        String str = (String) obj2;
        if (str != null) {
            C919503ib.LIZIZ(view.getContext(), str, new LinkedHashMap(), false).open();
            C03FA.LIZLLL("shipping_policy", null, null, null, null, null, null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        boolean z;
        SkuHeaderReusedAssem skuHeaderReusedAssem = (SkuHeaderReusedAssem) obj;
        List list = (List) obj2;
        Boolean bool = (Boolean) obj3;
        if (list != null && !list.isEmpty()) {
            RecyclerView recyclerView = skuHeaderReusedAssem.LLLIL;
            if (recyclerView == null || recyclerView.getVisibility() != 0) {
                C03DZ.LIZJ(skuHeaderReusedAssem.LLLIL);
                View view = skuHeaderReusedAssem.LLLILZ;
                if (view != null) {
                    if (EcomSkuPromotionAndScreenEfficiencyConfig.LIZ()) {
                        skuHeaderReusedAssem.up();
                        C0H1U.LJIIJ(C046T.LJIILIIL(), view);
                        skuHeaderReusedAssem.up();
                        C0H1U.LJII(C046T.LJIIL(), view);
                    } else {
                        C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), view);
                    }
                    C1744700vVE.LJIILJJIL(view, new AwS227S0000000_1(7));
                }
                TuxTextView tuxTextView = skuHeaderReusedAssem.LLJLL;
                if (tuxTextView != null) {
                    C1744700vVE.LJIILIIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), tuxTextView);
                }
                TuxTextView tuxTextView2 = skuHeaderReusedAssem.LLLFFI;
                if (tuxTextView2 != null) {
                    C1744700vVE.LJIILIIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), tuxTextView2);
                }
                TuxTextView tuxTextView3 = skuHeaderReusedAssem.LLJLLIL;
                if (tuxTextView3 != null) {
                    C1744700vVE.LJIILIIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), tuxTextView3);
                }
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ecom_pdp_new_price_style", true) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    TuxTextView tuxTextView4 = skuHeaderReusedAssem.LLLFFI;
                    if (tuxTextView4 != null) {
                        C1744700vVE.LJIILIIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), tuxTextView4);
                        C1744700vVE.LJIILJJIL(tuxTextView4, AFwS228S0000000_1.get$arr$(759));
                    }
                    TuxTextView tuxTextView5 = skuHeaderReusedAssem.LLJLILLLLZIIL;
                    if (tuxTextView5 != null) {
                        C1744700vVE.LJIILIIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), tuxTextView5);
                        C1744700vVE.LJIILJJIL(tuxTextView5, new AwS227S0000000_1(2));
                    }
                    TuxTextView tuxTextView6 = skuHeaderReusedAssem.LLJLL;
                    if (tuxTextView6 != null) {
                        C1744700vVE.LJIILIIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), tuxTextView6);
                        C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), tuxTextView6);
                        C1744700vVE.LJIILJJIL(tuxTextView6, new AwS227S0000000_1(3));
                    }
                    TuxTextView tuxTextView7 = skuHeaderReusedAssem.LLJLLIL;
                    if (tuxTextView7 != null) {
                        C1744700vVE.LJIILIIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), tuxTextView7);
                        C1744700vVE.LJIILJJIL(tuxTextView7, new AwS227S0000000_1(4));
                    }
                    TuxTextView tuxTextView8 = skuHeaderReusedAssem.LLJLILLLLZIIL;
                    if (tuxTextView8 != null) {
                        tuxTextView8.setTuxFont(12);
                    }
                    TuxTextView tuxTextView9 = skuHeaderReusedAssem.LLJLL;
                    if (tuxTextView9 != null) {
                        tuxTextView9.setTuxFont(71);
                    }
                    TuxTextView tuxTextView10 = skuHeaderReusedAssem.LLLFFI;
                    if (tuxTextView10 != null) {
                        tuxTextView10.setTuxFont(12);
                    }
                    TuxTextView tuxTextView11 = skuHeaderReusedAssem.LLLFFI;
                    if (tuxTextView11 != null) {
                        tuxTextView11.setTextColorRes(R.attr.a1q);
                    }
                    TuxTextView tuxTextView12 = skuHeaderReusedAssem.LLLFFI;
                    if (tuxTextView12 != null) {
                        tuxTextView12.setTypeface(C1697580uHE.LIZIZ(0.0f, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 0.0f, 0.0f, null, 0.0f, 0, null, 253));
                    }
                } else if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ecom_pdp_new_price_style", true) > 0) {
                    TuxTextView tuxTextView13 = skuHeaderReusedAssem.LLJLL;
                    if (tuxTextView13 != null) {
                        C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), tuxTextView13);
                        C1744700vVE.LJIILJJIL(tuxTextView13, new AwS227S0000000_1(5));
                    }
                    TuxTextView tuxTextView14 = skuHeaderReusedAssem.LLLFFI;
                    if (tuxTextView14 != null) {
                        C1744700vVE.LJIILJJIL(tuxTextView14, new AwS227S0000000_1(6));
                    }
                    TuxTextView tuxTextView15 = skuHeaderReusedAssem.LLJLILLLLZIIL;
                    if (tuxTextView15 != null) {
                        tuxTextView15.setTuxFont(12);
                    }
                    TuxTextView tuxTextView16 = skuHeaderReusedAssem.LLJLL;
                    if (tuxTextView16 != null) {
                        tuxTextView16.setTuxFont(71);
                    }
                    TuxTextView tuxTextView17 = skuHeaderReusedAssem.LLLFFI;
                    if (tuxTextView17 != null) {
                        tuxTextView17.setTuxFont(71);
                    }
                }
                C03DZ.LIZJ(skuHeaderReusedAssem.LLLILZ);
            }
            RecyclerView recyclerView2 = skuHeaderReusedAssem.LLLIL;
            if (recyclerView2 != null && recyclerView2.getVisibility() == 0) {
                C1744100vUG c1744100vUG = skuHeaderReusedAssem.LLLIZZ;
                if (c1744100vUG == null) {
                    c1744100vUG = null;
                }
                c1744100vUG.LLLII(list, new ARunnableS70S0200000_1(bool, skuHeaderReusedAssem, 7));
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$5(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        C1766720w4k c1766720w4k;
        SkuHeaderReusedAssem skuHeaderReusedAssem = (SkuHeaderReusedAssem) obj;
        final String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        if (str != null && !a0.LJJJIL(str) && ((C046T) skuHeaderReusedAssem.up()).LJIIIZ()) {
            C1766720w4k c1766720w4k2 = skuHeaderReusedAssem.LLJLIL;
            if (c1766720w4k2 != null) {
                int visibility = c1766720w4k2.getVisibility();
                c1766720w4k2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c1766720w4k2);
            }
            C1766720w4k c1766720w4k3 = skuHeaderReusedAssem.LLJLIL;
            if (c1766720w4k3 != null) {
                c1766720w4k3.setNeedExpandDesc(true);
            }
            final C1766720w4k c1766720w4k4 = skuHeaderReusedAssem.LLJLIL;
            if (c1766720w4k4 != null) {
                final AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(298);
                final int i = 2;
                c1766720w4k4.LLJLLL = 2;
                c1766720w4k4.setText(str);
                C786410Ut5.x3(c1766720w4k4.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.046X
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        if (c1766720w4k4.getWidth() > 0) {
                            C786410Ut5.C3(c1766720w4k4.getViewTreeObserver(), this);
                            c1766720w4k4.LJJJZ(i, str);
                            aFwS185S0000000_1.invoke();
                        }
                    }
                });
            }
            if (zBooleanValue && (c1766720w4k = skuHeaderReusedAssem.LLJLIL) != null) {
                C0H9H.LJI(0, c1766720w4k);
            }
            C1748720vbi.LIZIZ(skuHeaderReusedAssem.tp(), new C10515049h(), AFwS228S0000000_1.get$arr$(351));
        } else {
            C1766720w4k c1766720w4k5 = skuHeaderReusedAssem.LLJLIL;
            if (c1766720w4k5 != null) {
                int visibility2 = c1766720w4k5.getVisibility();
                c1766720w4k5.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c1766720w4k5);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final Object invoke$8(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (!(c1537480q70 instanceof SparkContext)) {
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
            C1541950qED.LIZJ.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1541950qED.LIZJ.getClass();
        return new C1541950qED(context, (SparkContext) c1537480q70).LIZ(false);
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AFwS326S0000000_1 aFwS326S0000000_1, Object obj, Object obj2, Object obj3) {
        C03IT thumbFirstImageUrlModel;
        View view = (View) obj;
        ((Number) obj3).intValue();
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        Image icon = ((Icon) obj2).getIcon();
        if (icon != null) {
            thumbFirstImageUrlModel = icon.toThumbFirstImageUrlModel();
        } else {
            thumbFirstImageUrlModel = null;
        }
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(thumbFirstImageUrlModel);
        c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_XY;
        c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.bv, view.getContext()));
        c1331670kl3LIZLLL.LJJI = C1326790kdB.LIZIZ;
        c1331670kl3LIZLLL.LJJ((InterfaceC1334290kpH) view.findViewById(R.id.uit));
        C786410Ut5.h3(c1331670kl3LIZLLL);
        return Unit.LIZ;
    }
}
