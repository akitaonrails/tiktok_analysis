package kotlin.jvm.internal;

import X.C09AY;
import X.C0HH2;
import X.C1324840ka2;
import X.C1397580mTM;
import X.C1397630mTR;
import X.C1893790zNh;
import X.C1894320zOY;
import X.C1899920zXa;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1320380kSq;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupBottomSheetUI;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupFullscreenUI;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.BottomSurveyAssem;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS46S2100000_28 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS46S2100000_28 awS46S2100000_28, Object obj) {
        ImageView imageView = (ImageView) obj;
        imageView.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        C426750GoL.LJIIIZ(imageView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(iLIZIZ), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, false, 24);
        C1324840ka2.LIZJ(imageView, UriProtector.parse(((UniversalPopupBottomSheetUI) awS46S2100000_28.l2).NR(awS46S2100000_28.s0, awS46S2100000_28.s1)).toString(), InterfaceC1320380kSq.LIZJ);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS46S2100000_28 awS46S2100000_28, Object obj) {
        ImageView imageView = (ImageView) obj;
        C1324840ka2.LIZJ(imageView, ((UniversalPopupFullscreenUI) awS46S2100000_28.l2).NR(awS46S2100000_28.s0, awS46S2100000_28.s1), InterfaceC1320380kSq.LIZJ);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(358));
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(147));
        C786410Ut5.c6(imageView, layoutParams);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS46S2100000_28 awS46S2100000_28, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        DynamicDialog dynamicDialog = (DynamicDialog) awS46S2100000_28.l2;
        c1894320zOY.getClass();
        C1894320zOY.LJIIL(dynamicDialog, zBooleanValue);
        if (zBooleanValue) {
            C1893790zNh c1893790zNh = C1893790zNh.LIZ;
            String str = awS46S2100000_28.s0;
            c1893790zNh.getClass();
            if (C1893790zNh.LIZIZ(str)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                c1893790zNh.getClass();
                C1893790zNh.LJIIJ("inc_activity_deep_link_end", null, linkedHashMap);
            }
            C1899920zXa c1899920zXa = C1899920zXa.LIZ;
            String str2 = awS46S2100000_28.s1;
            c1899920zXa.getClass();
            C1899920zXa.LIZIZ(str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS46S2100000_28 awS46S2100000_28, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        DynamicDialog dynamicDialog = (DynamicDialog) awS46S2100000_28.l2;
        c1894320zOY.getClass();
        C1894320zOY.LJIIL(dynamicDialog, zBooleanValue);
        if (zBooleanValue) {
            C1893790zNh c1893790zNh = C1893790zNh.LIZ;
            String str = awS46S2100000_28.s0;
            c1893790zNh.getClass();
            if (C1893790zNh.LIZIZ(str)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                c1893790zNh.getClass();
                C1893790zNh.LJIIJ("inc_activity_deep_link_end", null, linkedHashMap);
            }
            C1899920zXa c1899920zXa = C1899920zXa.LIZ;
            String str2 = awS46S2100000_28.s1;
            c1899920zXa.getClass();
            C1899920zXa.LIZIZ(str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS46S2100000_28 awS46S2100000_28, Object obj) {
        C0HH2 c0hh2 = (C0HH2) obj;
        c0hh2.LIZIZ(awS46S2100000_28.s0, new AwS607S0100000_28((BottomSurveyAssem) awS46S2100000_28.l2, 330), new AwS607S0100000_28((BottomSurveyAssem) awS46S2100000_28.l2, 331));
        c0hh2.LIZJ(awS46S2100000_28.s1, new AwS607S0100000_28((BottomSurveyAssem) awS46S2100000_28.l2, 332), new AwS607S0100000_28((BottomSurveyAssem) awS46S2100000_28.l2, 333));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS46S2100000_28 awS46S2100000_28, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        c1397630mTR.LIZJ(0, awS46S2100000_28.s0, AFwS271S0000000_28.get$arr$(436));
        c1397630mTR.LIZJ(1, awS46S2100000_28.s1, new AwS607S0100000_28((C1397580mTM) awS46S2100000_28.l2, 384));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S2100000_28(DynamicDialog dynamicDialog, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = dynamicDialog;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S2100000_28(UniversalPopupBottomSheetUI universalPopupBottomSheetUI, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = universalPopupBottomSheetUI;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S2100000_28(UniversalPopupFullscreenUI universalPopupFullscreenUI, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = universalPopupFullscreenUI;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S2100000_28(String str, String str2, C1397580mTM c1397580mTM, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = c1397580mTM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S2100000_28(String str, String str2, BottomSurveyAssem bottomSurveyAssem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = bottomSurveyAssem;
    }
}
