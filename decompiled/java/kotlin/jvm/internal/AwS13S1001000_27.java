package kotlin.jvm.internal;

import X.C09AY;
import X.C1861040yWs;
import X.C1875307Wd;
import X.C1875407We;
import X.C291001Au;
import X.InterfaceC1554220qY0;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.api.wallet.tiktok.GetABSStatusResponse;

/* JADX INFO: loaded from: classes28.dex */
public class AwS13S1001000_27 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS13S1001000_27 awS13S1001000_27, Object obj) {
        return C1861040yWs.LIZ((C1861040yWs) obj, null, false, false, null, null, false, false, null, null, false, 0L, false, null, null, null, null, null, null, false, null, false, null, 0L, null, null, null, null, new C291001Au(new C1875407We(awS13S1001000_27.s0, awS13S1001000_27.i1)), 536870911);
    }

    public static final Object invoke$1(AwS13S1001000_27 awS13S1001000_27, Object obj) {
        return C1861040yWs.LIZ((C1861040yWs) obj, null, false, false, null, null, false, false, null, null, false, 0L, false, null, null, null, null, null, null, false, null, false, null, 0L, null, null, null, new C291001Au(new C1875307Wd(awS13S1001000_27.s0, awS13S1001000_27.i1)), null, 805306367);
    }

    public static final Object invoke$2(AwS13S1001000_27 awS13S1001000_27, Object obj) {
        final String str = awS13S1001000_27.s0;
        final int i = awS13S1001000_27.i1;
        ((SparkContext) obj).LJJLIIIJJIZ(new InterfaceC1554220qY0(str, i) { // from class: X.0wre
            public final /* synthetic */ String LIZ;

            @Override // X.InterfaceC1554220qY0
            public final void LIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJII() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILIIL(SparkPopup sparkPopup, View view) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILJJIL(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILL(SparkPopup sparkPopup, int i2) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJIJI(SparkPopup sparkPopup) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJIJJ(SparkPopup sparkPopup) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIJJLI(SparkPopup sparkPopup, float f) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIL(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJI(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIFFI(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJII() {
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIJ(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIZI() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void onViewAttachedToWindow() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void onViewDetachedFromWindow() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIZILJ(SparkPopup sparkPopup) {
                HashMap<String, InterfaceC1796910wrR> map;
                InterfaceC1796910wrR interfaceC1796910wrR;
                GetABSStatusResponse.ABSData aBSData = C1797220wrw.LL;
                String str2 = this.LIZ;
                C1796960wrW c1796960wrW = new C1796960wrW(EnumC1796980wrY.CANCEL, null, C1797220wrw.LIZ(str2));
                if (str2 != null && (interfaceC1796910wrR = (map = C1797220wrw.LLILLL).get(str2)) != null) {
                    interfaceC1796910wrR.LJII(c1796960wrW);
                    C1797220wrw.LLILLJJLI.remove(str2);
                    map.remove(str2);
                }
            }
        });
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS13S1001000_27 r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct r4 = (com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct) r4
            java.lang.String r1 = r3.s0
            r2 = 1
            if (r1 == 0) goto L20
            if (r4 == 0) goto L1e
            java.lang.String r0 = r4.subtype
        Lb:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto L29
            if (r4 == 0) goto L29
            int r1 = r4.type
            int r0 = r3.i1
            if (r1 != r0) goto L29
        L19:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L1e:
            r0 = 0
            goto Lb
        L20:
            if (r4 == 0) goto L29
            int r1 = r4.type
            int r0 = r3.i1
            if (r1 != r0) goto L29
            goto L19
        L29:
            r2 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS13S1001000_27.invoke$3(kotlin.jvm.internal.AwS13S1001000_27, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S1001000_27(String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
