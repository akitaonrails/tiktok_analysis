package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0SVC;
import X.C1018703yb;
import X.C1107580evc;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1592306Lh;
import X.C1619720sFe;
import X.C1741890vQh;
import X.C1892170zL5;
import X.C1896300zRk;
import X.C1897290zTL;
import X.C1897950zUP;
import X.C1911150zph;
import X.C19322110iZ;
import X.C197039127h;
import X.C20484615Do;
import X.C20484715Dp;
import X.C2325271G0f;
import X.C464790IKn;
import X.C786410Ut5;
import X.InterfaceC1090170eTX;
import X.InterfaceC2281081EQg;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.EcProductAddButtonViewModel;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model.FypCtaButton;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS41S1400000_28 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS41S1400000_28 awS41S1400000_28) {
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI((Uri) awS41S1400000_28.l1);
        c1331670kl3LJI.LIZJ = (Activity) awS41S1400000_28.l2;
        c1331670kl3LJI.LIZLLL(awS41S1400000_28.s0);
        c1331670kl3LJI.LJIL = (Bitmap.Config) awS41S1400000_28.l3;
        c1331670kl3LJI.LJJII(new C2325271G0f((InterfaceC2281081EQg) awS41S1400000_28.l4, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS41S1400000_28 awS41S1400000_28) {
        long j;
        String strLIZ = C1107580evc.LIZ(UriProtector.parse(awS41S1400000_28.s0));
        if (strLIZ == null) {
            strLIZ = ((C1911150zph) awS41S1400000_28.l1).LL.containerId;
        }
        if (((C013C) awS41S1400000_28.l2).element) {
            FragmentManager fragmentManager = (FragmentManager) awS41S1400000_28.l3;
            if (fragmentManager != null) {
                C1911150zph c1911150zph = (C1911150zph) awS41S1400000_28.l1;
                final SparkContext sparkContext = (SparkContext) awS41S1400000_28.l4;
                C19322110iZ.LJFF(fragmentManager, c1911150zph, strLIZ, new InterfaceC1090170eTX() { // from class: X.0zpi
                    @Override // X.InterfaceC1090170eTX
                    public final void LIZ(long j2) {
                        sparkContext.LJJLIIIJ(String.valueOf(j2), "sheet_stack_token");
                    }
                }, 0);
            }
        } else {
            SparkContext sparkContext2 = (SparkContext) awS41S1400000_28.l4;
            C20484715Dp c20484715Dp = C464790IKn.LIZ;
            if (((ArrayList) c20484715Dp.LIZIZ).isEmpty()) {
                j = 0;
            } else {
                j = ((C20484615Do) ListProtector.get(c20484715Dp.LIZIZ, ((ArrayList) r1).size() - 1)).LJIIIZ;
            }
            sparkContext2.LJJLIIIJ(String.valueOf(j), "sheet_stack_token");
            C1911150zph c1911150zph2 = (C1911150zph) awS41S1400000_28.l1;
            if (c1911150zph2 != null && !((ArrayList) c20484715Dp.LIZIZ).isEmpty()) {
                ((C20484615Do) ListProtector.get(c20484715Dp.LIZIZ, ((ArrayList) r1).size() - 1)).LJIIJ(c1911150zph2, strLIZ);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS41S1400000_28 awS41S1400000_28) {
        String str;
        C1592306Lh.LIZ(C1592306Lh.LIZ, (C197039127h) awS41S1400000_28.l1, new AwS112S1000000_28(awS41S1400000_28.s0, 15));
        EcProductAddButtonViewModel ecProductAddButtonViewModel = (EcProductAddButtonViewModel) awS41S1400000_28.l2;
        FypCtaButton fypCtaButton = (FypCtaButton) awS41S1400000_28.l3;
        ecProductAddButtonViewModel.getClass();
        if (fypCtaButton != null) {
            str = fypCtaButton.daInfo;
        } else {
            str = null;
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
        if (mapLJIIJ != null) {
            ecProductAddButtonViewModel.LLJ.putAll(mapLJIIJ);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = C1892170zL5.LIZ;
        Map<String, Object> map = ((EcProductAddButtonViewModel) awS41S1400000_28.l2).LLJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.putAll(C1892170zL5.LIZ);
        C1018703yb.LIZIZ("affiliate_button_click", linkedHashMap);
        ((Function1) awS41S1400000_28.l4).invoke((FypCtaButton) awS41S1400000_28.l3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS41S1400000_28 awS41S1400000_28) {
        int iLIZJ;
        Boolean bool = (Boolean) awS41S1400000_28.l1;
        if (bool != null && ((ImageView) awS41S1400000_28.l2) != null && ((Context) awS41S1400000_28.l3) != null) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                ImageView imageView = ((C1897290zTL) awS41S1400000_28.l4).LJIIIIZZ;
                if (imageView != null) {
                    C786410Ut5.LJZI(0, imageView);
                }
                C1896300zRk c1896300zRk = (C1896300zRk) C1619720sFe.LIZ.LIZ(8);
                if (c1896300zRk != null) {
                    iLIZJ = c1896300zRk.LIZJ();
                } else {
                    iLIZJ = R.raw.icon_color_coin_small;
                }
                ImageView imageView2 = ((C1897290zTL) awS41S1400000_28.l4).LJIIIIZZ;
                if (imageView2 != null) {
                    TuxIconDrawable tuxIconDrawable = new TuxIconDrawable((Context) awS41S1400000_28.l3, iLIZJ);
                    tuxIconDrawable.LJFF(C0SVC.LIZIZ(C0SVC.LIZ, awS41S1400000_28.s0));
                    imageView2.setImageDrawable(tuxIconDrawable);
                }
            } else {
                ImageView imageView3 = ((C1897290zTL) awS41S1400000_28.l4).LJIIIIZZ;
                if (imageView3 != null) {
                    C786410Ut5.LJZI(8, imageView3);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S1400000_28(Uri uri, Activity activity, Bitmap.Config config, C1897950zUP c1897950zUP, int i) {
        super(0);
        this.$t = i;
        this.l1 = uri;
        this.l2 = activity;
        this.s0 = "referral_popup";
        this.l3 = config;
        this.l4 = c1897950zUP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S1400000_28(Boolean bool, ImageView imageView, Context context, C1897290zTL c1897290zTL, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = bool;
        this.l2 = imageView;
        this.l3 = context;
        this.l4 = c1897290zTL;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S1400000_28(String str, C1911150zph c1911150zph, C013C c013c, FragmentManager fragmentManager, SparkContext sparkContext, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1911150zph;
        this.l2 = c013c;
        this.l3 = fragmentManager;
        this.l4 = sparkContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS41S1400000_28(C197039127h c197039127h, C197039127h c197039127h2, EcProductAddButtonViewModel ecProductAddButtonViewModel, FypCtaButton fypCtaButton, FypCtaButton fypCtaButton2, Function1<? super FypCtaButton, Unit> function1, String str) {
        super(0);
        this.$t = str;
        this.l1 = c197039127h;
        this.l2 = c197039127h2;
        this.l3 = ecProductAddButtonViewModel;
        this.l4 = fypCtaButton2;
        this.s0 = function1;
    }
}
