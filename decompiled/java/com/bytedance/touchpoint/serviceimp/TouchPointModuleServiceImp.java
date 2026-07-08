package com.bytedance.touchpoint.serviceimp;

import X.C01GW;
import X.C01U6;
import X.C07UF;
import X.C0PEM;
import X.C1619730sFf;
import X.C1619820sFo;
import X.C1849790yEj;
import X.C1878820yzY;
import X.C1878830yzZ;
import X.C1894320zOY;
import X.C1894700zPA;
import X.C1895170zPv;
import X.C1895190zPx;
import X.C1895230zQ1;
import X.C1895370zQF;
import X.C1895550zQX;
import X.C1895570zQZ;
import X.C1899930zXb;
import X.C2178808gE;
import X.C2296808zG;
import X.C23250099c;
import X.C274770Apn;
import X.C341801Ui;
import X.C397501gb;
import X.InterfaceC1893620zNQ;
import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.net.Uri;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.touchpoint.api.model.BottomTabBubble;
import com.bytedance.touchpoint.api.model.FeedIncentiveToast;
import com.bytedance.touchpoint.api.model.InAppPush;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.touchpoint.api.model.TouchPointsResponse;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS177S1100000_28;
import kotlin.jvm.internal.AwS272S0300000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS63S0010000_26;
import kotlin.jvm.internal.AwS97S1000000_12;

/* JADX INFO: loaded from: classes29.dex */
public final class TouchPointModuleServiceImp implements ITouchPointModuleService {
    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LIZJ() {
        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(64));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final boolean LJ() {
        return ((Number) C274770Apn.LIZ.getValue()).intValue() > 0;
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJFF() {
        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(63));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJI() {
        C01U6.LIZIZ(new C1849790yEj());
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJIIIIZZ() {
        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(65));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJIIIZ() {
        try {
            C1895550zQX.LL.getClass();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJIIJ() {
        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(66));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJIILJJIL() {
        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(67));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJIILLIIL() {
        try {
            C1895550zQX.LL.getClass();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJIJI() {
        C01U6.LIZIZ(new C1895170zPv());
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final boolean LJJIFFI() {
        C1619820sFo.LIZ.getClass();
        return C1619820sFo.LIZIZ;
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJJII() {
        C01U6.LIZIZ(new C1895190zPx());
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJII(FeedIncentiveToast feedIncentiveToast) {
        C01U6.LIZIZ(new AwS572S0100000_28(feedIncentiveToast, 40));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJIIJJI(TouchPoint touchPoint) {
        C01U6.LIZIZ(new AwS572S0100000_28(touchPoint, 36));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJIIL(TouchPoint touchPoint) {
        C01U6.LIZIZ(new AwS572S0100000_28(touchPoint, 37));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJIILL(String str) {
        C01U6.LIZIZ(new AwS97S1000000_12(str, 2));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJIJ(String str) {
        C01U6.LIZIZ(new C1895230zQ1(str));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJIL(ReferralFeedBanner referralFeedBanner) {
        C01U6.LIZIZ(new AwS556S0100000_12(referralFeedBanner, 364));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJJ(Integer num) {
        C1895370zQF.LIZIZ(C1895370zQF.LIZ, num);
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJJI(InAppPush inAppPush) {
        C01U6.LIZIZ(new AwS572S0100000_28(inAppPush, 39));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJJIIJZLJL(boolean z) {
        C01U6.LIZIZ(new AwS63S0010000_26(z, 0));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJJIIZ(BottomTabBubble bottomTabBubble) {
        C01U6.LIZIZ(new AwS572S0100000_28(bottomTabBubble, 38));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final boolean LJJIJ(Uri uri) {
        C1878820yzY.LIZ.getClass();
        return C1878820yzY.LIZJ(uri);
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void reportDiversion(HashMap<String, Object> map) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C341801Ui(map, null), 3);
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJIILIIL(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        C01U6.LIZIZ(new AwS429S0200000_28(arrayList, arrayList2, (ArrayList<String>) 7));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJJIII(String str, C1878830yzZ c1878830yzZ) {
        C01U6.LIZIZ(new AwS177S1100000_28(str, c1878830yzZ, 17));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJJIIJ(Integer num, C07UF c07uf) {
        C1895370zQF.LIZ.getClass();
        boolean zLJI = MethodIDManager.LJI(197518);
        C01U6.LIZIZ(new AwS272S0300000_28(num, (TouchPointsResponse) null, c07uf, 6));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJIIZILJ(Context context, Uri uri, boolean z) {
        C397501gb.LIZ.getClass();
        final ARunnableS128S0100000_28 aRunnableS128S0100000_28 = new ARunnableS128S0100000_28(uri, 122);
        if (z) {
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            C1894700zPA c1894700zPALIZ = C2178808gE.LIZ();
            InterfaceC1893620zNQ interfaceC1893620zNQ = new InterfaceC1893620zNQ() { // from class: X.0zO2
                @Override // X.InterfaceC1893620zNQ
                public final void LIZ() {
                    aRunnableS128S0100000_28.run();
                    C01GW<C1894700zPA> c01gw2 = C1894700zPA.LJIJ;
                    C2178808gE.LIZ().LJIIZILJ.remove(this);
                }
            };
            if (!c1894700zPALIZ.LJIIZILJ.contains(interfaceC1893620zNQ)) {
                c1894700zPALIZ.LJIIZILJ.add(interfaceC1893620zNQ);
                return;
            }
            return;
        }
        aRunnableS128S0100000_28.run();
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJJIJIIJI(Context context, Uri uri, boolean z) {
        C1878820yzY.LIZ(context, uri, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0zQ0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005d -> B:23:0x0060). Please report as a decompilation issue!!! */
    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r14, int r15, java.lang.String r16, final X.InterfaceC1893920zNu r17) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.serviceimp.TouchPointModuleServiceImp.LIZLLL(java.lang.String, int, java.lang.String, X.0zNu):void");
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJIJJ(String str, String str2, String str3, boolean z, Map map, AwS595S0100000_16 awS595S0100000_16) {
        C01U6.LIZIZ(new C1899930zXb(str, str2, str3, z, map, awS595S0100000_16));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJIJJLI(int i, int i2, String str, boolean z, boolean z2, boolean z3) {
        C01U6.LIZIZ(new C1895570zQZ(i, i2, str, z, z2, z3));
    }

    @Override // com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService
    public final void LJJIIZI(int i, int i2, int i3, int i4, long j, String str) {
        C1894320zOY.LIZ.getClass();
        C01U6.LIZJ(new C1619730sFf(i, i2, i3, i4, j, str));
    }
}
