package kotlin.jvm.internal;

import X.C09AY;
import X.C0WUT;
import X.C189200o6;
import X.C21532619Oq;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C2382909Vj;
import X.C835850Wqd;
import X.InterfaceC20236714Gf;
import X.InterfaceC835900Wqi;
import android.view.View;
import com.bytedance.android.livesdk.sheet.SheetDemoFragment;
import com.bytedance.android.livesdk.sheet.TextIconItem;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public class AwS627S0100000_13 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS627S0100000_13(C0WUT c0wut, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0wut;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS627S0100000_13(C2252611DEt c2252611DEt, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2252611DEt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS627S0100000_13(SheetDemoFragment sheetDemoFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = sheetDemoFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS627S0100000_13(CompletionBlock completionBlock, CompletionBlock<InterfaceC835900Wqi> completionBlock2) {
        super(2);
        this.$t = completionBlock2;
        this.l0 = completionBlock;
    }

    public static final Object invoke$0(AwS627S0100000_13 awS627S0100000_13, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        if (((InterfaceC20236714Gf) awS627S0100000_13.l0).isActive()) {
            if (zBooleanValue && u.LJIIZILJ(str, "lottie/tako_bk_logo_loading.json", false)) {
                InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS627S0100000_13.l0;
                C189200o6.m2constructorimpl(str);
                interfaceC20236714Gf.resumeWith(str);
            } else {
                InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) awS627S0100000_13.l0;
                C189200o6.m2constructorimpl(null);
                interfaceC20236714Gf2.resumeWith(null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS627S0100000_13 awS627S0100000_13, Object obj, Object obj2) {
        ((Number) obj).intValue();
        String str = (String) obj2;
        C835850Wqd.LIZ.getClass();
        ((ArrayList) C835850Wqd.LJII).add(str);
        C835850Wqd.LIZIZ();
        CompletionBlock completionBlock = (CompletionBlock) awS627S0100000_13.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("upload error ");
        sbLIZ.append(str);
        C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS627S0100000_13 awS627S0100000_13, Object obj, Object obj2) {
        ((SheetDemoFragment) awS627S0100000_13.l0).LLLZIL.add(obj);
        ((SheetDemoFragment) awS627S0100000_13.l0).gT();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS627S0100000_13 awS627S0100000_13, Object obj, Object obj2) {
        View view = (View) obj2;
        ((SheetDemoFragment) awS627S0100000_13.l0).LLLZIL.remove(obj);
        ((SheetDemoFragment) awS627S0100000_13.l0).gT();
        C21532619Oq c21532619OqFS = ((SheetDemoFragment) awS627S0100000_13.l0).FS();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c21532619OqFS, view);
        c21532619OqFS.removeView(view);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS627S0100000_13 awS627S0100000_13, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        C21532619Oq c21532619OqFS = ((SheetDemoFragment) awS627S0100000_13.l0).FS();
        SheetDemoFragment sheetDemoFragment = (SheetDemoFragment) awS627S0100000_13.l0;
        TextIconItem textIconItem = new TextIconItem();
        textIconItem.id = Integer.valueOf(iIntValue);
        textIconItem.iconName = (String) obj2;
        c21532619OqFS.addView(sheetDemoFragment.BS(textIconItem, new AwS627S0100000_13((SheetDemoFragment) awS627S0100000_13.l0, 2), new AwS627S0100000_13((SheetDemoFragment) awS627S0100000_13.l0, 3)));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS627S0100000_13 awS627S0100000_13, Object obj, Object obj2) {
        ((SheetDemoFragment) awS627S0100000_13.l0).LLLZIIL.add(obj);
        ((SheetDemoFragment) awS627S0100000_13.l0).hT();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS627S0100000_13 awS627S0100000_13, Object obj, Object obj2) {
        View view = (View) obj2;
        ((SheetDemoFragment) awS627S0100000_13.l0).LLLZIIL.remove(obj);
        ((SheetDemoFragment) awS627S0100000_13.l0).hT();
        C21532619Oq c21532619OqRS = ((SheetDemoFragment) awS627S0100000_13.l0).RS();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c21532619OqRS, view);
        c21532619OqRS.removeView(view);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS627S0100000_13 awS627S0100000_13, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        C21532619Oq c21532619OqRS = ((SheetDemoFragment) awS627S0100000_13.l0).RS();
        SheetDemoFragment sheetDemoFragment = (SheetDemoFragment) awS627S0100000_13.l0;
        TextIconItem textIconItem = new TextIconItem();
        textIconItem.id = Integer.valueOf(iIntValue);
        textIconItem.iconName = (String) obj2;
        c21532619OqRS.addView(sheetDemoFragment.BS(textIconItem, new AwS627S0100000_13((SheetDemoFragment) awS627S0100000_13.l0, 5), new AwS627S0100000_13((SheetDemoFragment) awS627S0100000_13.l0, 6)));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS627S0100000_13 awS627S0100000_13, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        AwS449S0200000_13 awS449S0200000_13 = ((C0WUT) awS627S0100000_13.l0).LJ;
        if (awS449S0200000_13 != null) {
            awS449S0200000_13.invoke(Boolean.valueOf(zBooleanValue), obj2);
        }
        return Unit.LIZ;
    }
}
