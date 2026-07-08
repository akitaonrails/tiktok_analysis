package com.ss.android.ugc.aweme.specact;

import X.AbstractC1896090zRP;
import X.C01U6;
import X.C1619720sFe;
import X.C1893330zMx;
import X.InterfaceC214897198d;
import X.InterfaceC2217711Bqz;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.touchpoint.api.service.IIncentiveSparkService;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class IncentiveSparkServiceImpl implements IIncentiveSparkService {
    @Override // com.bytedance.touchpoint.api.service.IIncentiveSparkService
    public final void LIZJ() {
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveSparkService
    public final void LIZLLL() {
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveSparkService
    public final boolean LIZ() {
        InterfaceC214897198d interfaceC214897198d;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        ComponentCallbacks2 componentCallbacks2LJIILL = abstractC1896090zRP != null ? abstractC1896090zRP.LJIILL() : null;
        return (componentCallbacks2LJIILL instanceof InterfaceC214897198d) && (interfaceC214897198d = (InterfaceC214897198d) componentCallbacks2LJIILL) != null && interfaceC214897198d.getEnableSAF();
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveSparkService
    public final boolean LIZIZ(SparkContext sparkContext) {
        return Intrinsics.LJFF(sparkContext.get("isSAFRecreated"), "1");
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveSparkService
    public final FragmentManager LJ(Context context) {
        return (FragmentManager) C01U6.LJ(new AwS572S0100000_28(context, 564), null);
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveSparkService
    public final void LJFF(final SparkContext sparkContext, final C1893330zMx c1893330zMx) {
        sparkContext.LJJLIIIJL(new InterfaceC2217711Bqz() { // from class: X.0zNG
            @Override // X.InterfaceC2217711Bqz
            public final Context LIZJ(Context context) {
                return context;
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJ() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJII() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIIJJI() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIIL() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIILLIIL(boolean z) {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIJI() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIJJLI() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJ() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJIIZ(InterfaceC1546650qLn interfaceC1546650qLn, Configuration configuration) {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJIJIIJIL(InterfaceC1546650qLn interfaceC1546650qLn) {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJIJIL() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJJIL(InterfaceC1546650qLn interfaceC1546650qLn) {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJJJZ(InterfaceC1546650qLn interfaceC1546650qLn) {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJLIIIIJ() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJJLIIIJLJLI(InterfaceC1546650qLn interfaceC1546650qLn) {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void finish() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void onActivityResult(int i, int i2, Intent intent) {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJI() {
                C01U6.LIZIZ(new AwS429S0200000_28(sparkContext, c1893330zMx, 86));
            }

            @Override // X.InterfaceC2217711Bqz
            public final void LJIIZILJ() {
                C1893540zNI c1893540zNI = C1893540zNI.LIZ;
                SparkContext sparkContext2 = sparkContext;
                c1893540zNI.getClass();
                C1893540zNI.LIZ(sparkContext2, false);
            }
        });
    }
}
