package kotlin.jvm.internal;

import X.C05YF;
import X.C09AY;
import X.C0CNO;
import X.C0MVS;
import X.C12BX;
import X.C12BY;
import X.C12I9;
import X.C1417970n0F;
import X.C1439160nYQ;
import X.C1444870nhd;
import X.C15O7;
import X.C19724012Fa;
import X.C1DRG;
import X.C2492609pk;
import X.C385670FAf;
import X.C415650GRn;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC1418120n0U;
import X.InterfaceC1635410sex;
import X.InterfaceC1644770su3;
import X.InterfaceC1650930t3z;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfo;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ln3.a;

/* JADX INFO: loaded from: classes23.dex */
public class AwS37S0600000_22 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS37S0600000_22 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS37S0600000_22.invoke$0(kotlin.jvm.internal.AwS37S0600000_22, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS37S0600000_22 awS37S0600000_22, Object obj) {
        String id;
        Integer numValueOf;
        ComposerBeautyBuriedInfo composerBeautyBuriedInfo;
        MBeautyStateInfo mBeautyStateInfo;
        C12I9 c12i9Je;
        C12I9 c12i9Je2;
        C385670FAf<FilterBean> c385670FAfI70;
        FilterBean filterBeanLIZJ;
        String strS80 = ((InterfaceC1650930t3z) ((C05YF) obj)).S80();
        InterfaceC1644770su3 interfaceC1644770su3 = (InterfaceC1644770su3) ((C1DRG) awS37S0600000_22.l0).LJIIL(null, InterfaceC1644770su3.class);
        if (interfaceC1644770su3 != null && (c385670FAfI70 = interfaceC1644770su3.i70()) != null && (filterBeanLIZJ = c385670FAfI70.LIZJ()) != null) {
            id = filterBeanLIZJ.getId();
        } else {
            id = null;
        }
        a aVar = (a) ((C1DRG) awS37S0600000_22.l0).LJIIL(null, a.class);
        if (aVar != null) {
            numValueOf = Integer.valueOf(aVar.Ty0());
        } else {
            numValueOf = null;
        }
        C1444870nhd.LIZ.getClass();
        if (aVar == null || (c12i9Je2 = aVar.je()) == null || (composerBeautyBuriedInfo = c12i9Je2.Ne()) == null) {
            composerBeautyBuriedInfo = new ComposerBeautyBuriedInfo(0, 0, 0, null, 15, null);
        }
        if (aVar == null || (c12i9Je = aVar.je()) == null || (mBeautyStateInfo = c12i9Je.Ke()) == null) {
            mBeautyStateInfo = new MBeautyStateInfo(0, 0);
        }
        C0CNO.LIZ(C15O7.LJI, new AwS0S1700000_22((Activity) awS37S0600000_22.l2, (C1DRG) awS37S0600000_22.l4, composerBeautyBuriedInfo, mBeautyStateInfo, (EditEffectAnchorManager) awS37S0600000_22.l3, (ShortVideoContext) awS37S0600000_22.l1, (Boolean) awS37S0600000_22.l5, numValueOf, strS80, id, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS37S0600000_22 awS37S0600000_22, Object obj) throws Throwable {
        if (((Boolean) obj).booleanValue()) {
            ((ArrayList) awS37S0600000_22.l0).add((C2492609pk) awS37S0600000_22.l1);
            ((AtomicInteger) awS37S0600000_22.l2).incrementAndGet();
            ((C1439160nYQ) awS37S0600000_22.l3).LIZIZ((CreativeInfo) awS37S0600000_22.l4, (List) awS37S0600000_22.l5, (AtomicInteger) awS37S0600000_22.l2, (ArrayList) awS37S0600000_22.l0);
        } else {
            C1439160nYQ c1439160nYQ = (C1439160nYQ) awS37S0600000_22.l3;
            CreativeInfo creativeInfo = (CreativeInfo) awS37S0600000_22.l4;
            ArrayList arrayList = (ArrayList) awS37S0600000_22.l0;
            c1439160nYQ.getClass();
            if (!arrayList.isEmpty()) {
                C0MVS.LIZ(C0MVS.LIZIZ(creativeInfo));
            }
            c1439160nYQ.LIZIZ.LIZ(arrayList);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS37S0600000_22 awS37S0600000_22, Object obj) {
        Bitmap bitmapLIZ;
        Bitmap bitmap = (Bitmap) obj;
        C12BX c12bx = (C12BX) awS37S0600000_22.l2;
        View view = (View) awS37S0600000_22.l3;
        Function1 function1 = (Function1) awS37S0600000_22.l4;
        ImageView imageView = (ImageView) awS37S0600000_22.l5;
        C415650GRn c415650GRn = (C415650GRn) awS37S0600000_22.l0;
        Bitmap bitmap2 = (Bitmap) awS37S0600000_22.l1;
        if (bitmap != null) {
            bitmapLIZ = C12BY.LIZ(bitmap);
        } else {
            bitmapLIZ = null;
        }
        if (bitmapLIZ != null) {
            imageView.setImageBitmap(bitmapLIZ);
        }
        c12bx.LIZJ(c415650GRn, bitmap2);
        function1.invoke(Bitmap.createBitmap(C19724012Fa.LIZ(view, Bitmap.Config.ARGB_8888), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(116.5f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(263.5f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(160.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(160.0f)))));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS37S0600000_22 awS37S0600000_22, Object obj) {
        Bitmap bitmapLIZ;
        Bitmap bitmap = (Bitmap) obj;
        C12BX c12bx = (C12BX) awS37S0600000_22.l2;
        View view = (View) awS37S0600000_22.l3;
        Function1 function1 = (Function1) awS37S0600000_22.l4;
        ImageView imageView = (ImageView) awS37S0600000_22.l5;
        C415650GRn c415650GRn = (C415650GRn) awS37S0600000_22.l0;
        Bitmap bitmap2 = (Bitmap) awS37S0600000_22.l1;
        if (bitmap != null) {
            bitmapLIZ = C12BY.LIZ(bitmap);
        } else {
            bitmapLIZ = null;
        }
        if (bitmapLIZ != null) {
            imageView.setImageBitmap(bitmapLIZ);
        }
        c12bx.LIZJ(c415650GRn, bitmap2);
        function1.invoke(Bitmap.createBitmap(C19724012Fa.LIZ(view, Bitmap.Config.ARGB_8888), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(45.5f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(75.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(302.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(537.0f)))));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS37S0600000_22(C415650GRn c415650GRn, C415650GRn c415650GRn2, Bitmap bitmap, C12BX c12bx, View view, Function1<? super Bitmap, Unit> function1, ImageView imageView) {
        super(1);
        this.$t = imageView;
        this.l0 = c415650GRn;
        this.l1 = c415650GRn2;
        this.l2 = bitmap;
        this.l3 = c12bx;
        this.l4 = view;
        this.l5 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0600000_22(C1DRG c1drg, ShortVideoContext shortVideoContext, Activity activity, EditEffectAnchorManager editEffectAnchorManager, C1DRG c1drg2, Boolean bool, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1drg;
        this.l1 = shortVideoContext;
        this.l2 = activity;
        this.l3 = editEffectAnchorManager;
        this.l4 = c1drg2;
        this.l5 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS37S0600000_22(ArrayList arrayList, ArrayList<C2492609pk> arrayList2, C2492609pk c2492609pk, AtomicInteger atomicInteger, C1439160nYQ c1439160nYQ, CreativeInfo creativeInfo, List<C2492609pk> list) {
        super(1);
        this.$t = list;
        this.l0 = arrayList;
        this.l1 = arrayList2;
        this.l2 = c2492609pk;
        this.l3 = atomicInteger;
        this.l4 = c1439160nYQ;
        this.l5 = creativeInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS37S0600000_22(List list, List<MetaExt> list2, CreativeInfo creativeInfo, InterfaceC1635410sex interfaceC1635410sex, InterfaceC1418120n0U interfaceC1418120n0U, C1417970n0F c1417970n0F, LifecycleOwner lifecycleOwner) {
        super(1);
        this.$t = lifecycleOwner;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = creativeInfo;
        this.l3 = interfaceC1635410sex;
        this.l4 = interfaceC1418120n0U;
        this.l5 = c1417970n0F;
    }
}
