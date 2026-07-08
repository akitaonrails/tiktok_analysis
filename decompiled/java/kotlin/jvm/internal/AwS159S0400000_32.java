package kotlin.jvm.internal;

import X.AbstractC212300186g;
import X.C09AY;
import X.C1018703yb;
import X.C118300cf;
import X.C16G0;
import X.C16GX;
import X.C1720106oR;
import X.C1739800vNK;
import X.C1741890vQh;
import X.C189L;
import X.C18LA;
import X.C18UJ;
import X.C18UP;
import X.C18YN;
import X.C18YT;
import X.C18Z4;
import X.C193W;
import X.C212294186a;
import X.C212295186b;
import X.C212332187m;
import X.C21240218Ae;
import X.C21271918Mj;
import X.C21335818ea;
import X.C21466518zf;
import X.C2188811AlT;
import X.C259800zU;
import X.C418440Gaw;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.BoringLayout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.bcm.impl.model.BcmCheckGeckoData;
import com.bytedance.android.bcm.impl.model.BcmCheckParam;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.scene.group.GroupRecord;
import com.bytedance.scene.navigation.Record;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.ecommerce.anchor.baseview.ECommerceAnchorAppbarLayout$Behavior;
import com.ss.android.ugc.aweme.ecommerce.model.PanelBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS159S0400000_32 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    /* JADX WARN: Type inference failed for: r3v2, types: [T, kotlin.jvm.internal.AwS276S0300000_32] */
    public static final Object invoke$0(AwS159S0400000_32 awS159S0400000_32) {
        C21466518zf c21466518zf = (C21466518zf) awS159S0400000_32.l0;
        c21466518zf.LJIILLIIL = c21466518zf.LJFF.controlDelayedTransition((ViewGroup) awS159S0400000_32.l1, awS159S0400000_32.l2);
        C21466518zf c21466518zf2 = (C21466518zf) awS159S0400000_32.l0;
        if (c21466518zf2.LJIILLIIL == null) {
            c21466518zf2.LJIIZILJ = true;
        } else {
            ((C259800zU) awS159S0400000_32.l3).element = new AwS276S0300000_32((ViewGroup) awS159S0400000_32.l1, c21466518zf2, awS159S0400000_32.l2, 1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS159S0400000_32 awS159S0400000_32) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parse rule success, raw data size: ");
        List<BcmCheckParam> list = ((BcmCheckGeckoData) awS159S0400000_32.l0).data.paramsList;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", rule size: ");
        sbLIZ.append(((C21240218Ae) awS159S0400000_32.l1).LIZIZ.size());
        sbLIZ.append(", accepted rules: ");
        sbLIZ.append(((C118300cf) awS159S0400000_32.l2).element);
        sbLIZ.append(", rejected rules: ");
        sbLIZ.append(((C118300cf) awS159S0400000_32.l3).element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AwS159S0400000_32 awS159S0400000_32) {
        ((C18YT) awS159S0400000_32.l0).LIZIZ((Enum) awS159S0400000_32.l1);
        C786410Ut5.LJLLLLLL(4, (C18YN) awS159S0400000_32.l2);
        C786410Ut5.LJJJJIZL(((C18YN) awS159S0400000_32.l2).getClonedViewContainer());
        C786410Ut5.LJLLLLLL(8, ((C18YN) awS159S0400000_32.l2).getClonedViewContainer());
        C786410Ut5.LJLLLLLL(8, ((C18YN) awS159S0400000_32.l2).getFullOverlay());
        C18YN c18yn = (C18YN) awS159S0400000_32.l2;
        c18yn.LLJJ = false;
        c18yn.LLJILJILJ = null;
        Function0 function0 = (Function0) awS159S0400000_32.l3;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS159S0400000_32 awS159S0400000_32) {
        ((ArrayList) awS159S0400000_32.l0).remove((GroupRecord) awS159S0400000_32.l1);
        ArrayList arrayList = (ArrayList) awS159S0400000_32.l2;
        if (arrayList != null) {
            arrayList.remove((Bundle) awS159S0400000_32.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS159S0400000_32 awS159S0400000_32) {
        ((ArrayList) awS159S0400000_32.l0).remove((Record) awS159S0400000_32.l1);
        ArrayList arrayList = (ArrayList) awS159S0400000_32.l2;
        if (arrayList != null) {
            arrayList.remove((Bundle) awS159S0400000_32.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS159S0400000_32 awS159S0400000_32) {
        Function0<Boolean> function0 = ((C18Z4) ((C16GX) awS159S0400000_32.l0)).LLJJIJIIJIL;
        boolean zOnTouchEvent = true;
        if (function0 == null || !function0.invoke().booleanValue()) {
            zOnTouchEvent = super/*com.google.android.material.appbar.HeaderBehavior*/.onTouchEvent((C16G0) awS159S0400000_32.l2, (C16GX) awS159S0400000_32.l0, (MotionEvent) awS159S0400000_32.l3);
        }
        return Boolean.valueOf(zOnTouchEvent);
    }

    public static final Object invoke$5(AwS159S0400000_32 awS159S0400000_32) {
        PanelBannerInfo panelBannerInfo;
        String str;
        String string;
        HashMap<String, Object> mapLJIIJ;
        Object obj;
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        ProductListModel productListModel = (ProductListModel) awS159S0400000_32.l0;
        PanelBannerInfo panelBannerInfo2 = (PanelBannerInfo) awS159S0400000_32.l1;
        String str2 = null;
        Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c92278.d5371", PageFinder.via((View) awS159S0400000_32.l2), null, 4, null);
        c21271918Mj.getClass();
        C1018703yb.LIZLLL("tiktokec_banner_click", new AwS241S0300000_32(productListModel, (ProductListModel) panelBannerInfo2, (PanelBannerInfo) mapCreateReportParams$default, (Map<String, ? extends Object>) 10));
        Context context = (Context) awS159S0400000_32.l3;
        if (context != null && (panelBannerInfo = (PanelBannerInfo) awS159S0400000_32.l1) != null && (str = panelBannerInfo.schema) != null) {
            C189L c189l = (C189L) awS159S0400000_32.l2;
            ProductListModel productListModel2 = (ProductListModel) awS159S0400000_32.l0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str3 = panelBannerInfo.daInfo;
            String str4 = null;
            if (str3 == null || (mapLJIIJ = C1741890vQh.LJIIJ(str3)) == null || (obj = mapLJIIJ.get("bcm_nova_delivery_id")) == null || (string = obj.toString()) == null) {
                string = "";
            }
            linkedHashMap.put("bcm_nova_delivery_id", string);
            String strLJFF = C18LA.LJFF(c189l, str, "c92278.d5371", linkedHashMap);
            C1739800vNK c1739800vNK = C1739800vNK.LIZ;
            if (productListModel2 != null) {
                str2 = productListModel2.eventType;
                str4 = productListModel2.aid;
            }
            c1739800vNK.getClass();
            C1739800vNK.LIZIZ(context, strLJFF, str2, str4);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, android.view.View] */
    public static final Object invoke$6(AwS159S0400000_32 awS159S0400000_32) {
        ((C259800zU) awS159S0400000_32.l0).element = ((C193W) awS159S0400000_32.l1).LIZLLL.onCreateOptionView((Context) awS159S0400000_32.l2, (ViewGroup) awS159S0400000_32.l3, null);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS159S0400000_32 awS159S0400000_32) {
        Function0 function0 = (Function0) awS159S0400000_32.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C18UP c18up = C18UP.LIZ;
        C18UJ c18uj = (C18UJ) awS159S0400000_32.l1;
        AIChatGenNode aIChatGenNode = (AIChatGenNode) awS159S0400000_32.l2;
        c18up.getClass();
        C18UP.LJIILIIL(aIChatGenNode, c18uj, "stay");
        ((Function0) awS159S0400000_32.l3).invoke();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS159S0400000_32 awS159S0400000_32) {
        String priceNumText;
        C212332187m c212332187m;
        C212332187m c212332187m2;
        C212295186b<ViewGroup> priceLayoutViewControllerFront = ((AbstractC212300186g) awS159S0400000_32.l0).getPriceLayoutViewControllerFront();
        if (priceLayoutViewControllerFront != null) {
            priceLayoutViewControllerFront.LJIIJJI((C212294186a) awS159S0400000_32.l1);
        }
        C212332187m c212332187m3 = (C212332187m) awS159S0400000_32.l2;
        if (c212332187m3 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c212332187m3);
            c212332187m3.setAlpha(1.0f);
        }
        C212332187m c212332187m4 = (C212332187m) awS159S0400000_32.l2;
        if (c212332187m4 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c212332187m4);
            c212332187m4.setY(0.0f);
        }
        C212332187m c212332187m5 = (C212332187m) awS159S0400000_32.l3;
        if (c212332187m5 != null) {
            float fLIZIZ = C418440Gaw.LIZIZ(30);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c212332187m5);
            c212332187m5.setY(fLIZIZ);
        }
        C212332187m c212332187m6 = (C212332187m) awS159S0400000_32.l3;
        if (c212332187m6 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c212332187m6);
            c212332187m6.setAlpha(0.0f);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ispopup: ");
        sbLIZ.append(((AbstractC212300186g) awS159S0400000_32.l0).LLJI);
        sbLIZ.append(" anim end behind price: ");
        C212295186b<ViewGroup> priceLayoutViewControllerBehind = ((AbstractC212300186g) awS159S0400000_32.l0).getPriceLayoutViewControllerBehind();
        String priceNumText2 = null;
        if (priceLayoutViewControllerBehind != null && (c212332187m2 = priceLayoutViewControllerBehind.LJII) != null) {
            priceNumText = c212332187m2.getPriceNumText();
        } else {
            priceNumText = null;
        }
        sbLIZ.append(priceNumText);
        sbLIZ.append(", front price: ");
        C212295186b<ViewGroup> priceLayoutViewControllerFront2 = ((AbstractC212300186g) awS159S0400000_32.l0).getPriceLayoutViewControllerFront();
        if (priceLayoutViewControllerFront2 != null && (c212332187m = priceLayoutViewControllerFront2.LJII) != null) {
            priceNumText2 = c212332187m.getPriceNumText();
        }
        sbLIZ.append(priceNumText2);
        sbLIZ.append(", behind y : ");
        sbLIZ.append(((C212332187m) awS159S0400000_32.l3).getY());
        sbLIZ.append(", front y: ");
        sbLIZ.append(((C212332187m) awS159S0400000_32.l2).getY());
        C1720106oR.LJI("usbidprice", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS159S0400000_32 awS159S0400000_32) {
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" MynaTextLayoutBuilder#build() An exception occurs,wantWidth:");
        sbLIZ.append(((C21335818ea) awS159S0400000_32.l0).LIZJ);
        sbLIZ.append(",lastWidthMeasureSpec:");
        sbLIZ.append(((C21335818ea) awS159S0400000_32.l0).LJIILIIL);
        sbLIZ.append(",measureWidthCache:");
        sbLIZ.append(((C21335818ea) awS159S0400000_32.l0).LJIIJJI);
        sbLIZ.append(",text:");
        sbLIZ.append((Object) ((C21335818ea) awS159S0400000_32.l0).LIZ);
        sbLIZ.append(",alignment");
        sbLIZ.append(((C21335818ea) awS159S0400000_32.l0).LJII);
        sbLIZ.append(",ellipsize:");
        sbLIZ.append(((C21335818ea) awS159S0400000_32.l0).LIZLLL);
        sbLIZ.append(",metrics:");
        sbLIZ.append((BoringLayout.Metrics) awS159S0400000_32.l1);
        sbLIZ.append(",fontSize:");
        sbLIZ.append(((C21335818ea) awS159S0400000_32.l0).LIZIZ.getTextSize());
        sbLIZ.append(",isBold:");
        Typeface typeface = (Typeface) awS159S0400000_32.l2;
        Boolean boolValueOf2 = null;
        if (typeface != null) {
            boolValueOf = Boolean.valueOf(typeface.isBold());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(",isItalic:");
        Typeface typeface2 = (Typeface) awS159S0400000_32.l2;
        if (typeface2 != null) {
            boolValueOf2 = Boolean.valueOf(typeface2.isItalic());
        }
        sbLIZ.append(boolValueOf2);
        sbLIZ.append(",fontWeight:");
        sbLIZ.append((Integer) awS159S0400000_32.l3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS159S0400000_32(C259800zU c259800zU, C259800zU<View> c259800zU2, C193W c193w, Context context, ViewGroup viewGroup) {
        super(0);
        this.$t = viewGroup;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c193w;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S0400000_32(AbstractC212300186g abstractC212300186g, C212294186a c212294186a, C212332187m c212332187m, C212332187m c212332187m2, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC212300186g;
        this.l1 = c212294186a;
        this.l2 = c212332187m;
        this.l3 = c212332187m2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS159S0400000_32(C18YT c18yt, C18YT<Object> c18yt2, Object obj, C18YN c18yn, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c18yt;
        this.l1 = c18yt2;
        this.l2 = obj;
        this.l3 = c18yn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S0400000_32(C21335818ea c21335818ea, BoringLayout.Metrics metrics, Typeface typeface, Integer num, int i) {
        super(0);
        this.$t = i;
        this.l0 = c21335818ea;
        this.l1 = metrics;
        this.l2 = typeface;
        this.l3 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS159S0400000_32(C21466518zf c21466518zf, C21466518zf c21466518zf2, ViewGroup viewGroup, Object obj, C259800zU<Function0<Unit>> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = c21466518zf;
        this.l1 = c21466518zf2;
        this.l2 = viewGroup;
        this.l3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S0400000_32(Context context, C189L c189l, PanelBannerInfo panelBannerInfo, ProductListModel productListModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = productListModel;
        this.l1 = panelBannerInfo;
        this.l2 = c189l;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S0400000_32(MotionEvent motionEvent, C16G0 c16g0, C16GX c16gx, ECommerceAnchorAppbarLayout$Behavior eCommerceAnchorAppbarLayout$Behavior, int i) {
        super(0);
        this.$t = i;
        this.l0 = c16gx;
        this.l1 = eCommerceAnchorAppbarLayout$Behavior;
        this.l2 = c16g0;
        this.l3 = motionEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS159S0400000_32(BcmCheckGeckoData bcmCheckGeckoData, C21240218Ae c21240218Ae, C118300cf c118300cf, C118300cf c118300cf2, int i) {
        super(0);
        this.$t = i;
        this.l0 = bcmCheckGeckoData;
        this.l1 = c21240218Ae;
        this.l2 = c118300cf;
        this.l3 = c118300cf2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS159S0400000_32(ArrayList arrayList, ArrayList<GroupRecord> arrayList2, GroupRecord groupRecord, ArrayList<Bundle> arrayList3, Bundle bundle) {
        super(0);
        this.$t = bundle;
        this.l0 = arrayList;
        this.l1 = arrayList2;
        this.l2 = groupRecord;
        this.l3 = arrayList3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS159S0400000_32(ArrayList arrayList, ArrayList<Record> arrayList2, Record record, ArrayList<Bundle> arrayList3, Bundle bundle) {
        super(0);
        this.$t = bundle;
        this.l0 = arrayList;
        this.l1 = arrayList2;
        this.l2 = record;
        this.l3 = arrayList3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS159S0400000_32(Function0 function0, Function0<Unit> function02, C18UJ c18uj, AIChatGenNode aIChatGenNode, Function0<Unit> function03) {
        super(0);
        this.$t = function03;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = c18uj;
        this.l3 = aIChatGenNode;
    }
}
