package com.ss.android.ugc.aweme.ecommerce.schema;

import X.AbstractC1547260qMm;
import X.C1697810uHb;
import X.EnumC1005690cHH;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.ectracker.EcTrackerNativeRouteInterceptor;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEcSchemaService;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.interceptor.SmartCheckSchemaInterceptor;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class EcSchemaService implements IEcSchemaService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcSchemaService
    public final List<ISparkRouterInterceptor> LIZ() {
        return C1697810uHb.LJIIJJI(new EcSchemaVerifyInterceptor(), new SmartCheckSchemaInterceptor(EnumC1005690cHH.SCHEMA.getValue()), new AbstractC1547260qMm() { // from class: X.0qOp
            @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
            public final boolean matchInterceptRules(String str) {
                return true;
            }

            public static void LIZ(final SparkContext sparkContext) {
                sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0qOq
                    @Override // X.InterfaceC2217701Bqy
                    public final Context LIZJ(Context context) {
                        return context;
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJIILLIIL(boolean z) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJIL(Activity activity, Context context) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIII(SparkActivity sparkActivity, boolean z) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIIJZLJL(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIJIIJI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJ(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJJ(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJLL(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJZI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIIJJI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                        return false;
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLJLI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLL(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void onActivityResult(int i, int i2, Intent intent) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void onRestoreInstanceState(Bundle bundle) {
                    }

                    @Override // X.InterfaceC1163130gND
                    public final void release() {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void finish() {
                        SparkActivity sparkActivity;
                        SparkFragment sparkFragment;
                        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ();
                        if (!(interfaceC1059280dfiLJJIJLIJ instanceof SparkActivity) || (sparkActivity = (SparkActivity) interfaceC1059280dfiLJJIJLIJ) == null || (sparkFragment = sparkActivity.LLJILJIL) == null) {
                            return;
                        }
                        sparkFragment.finish();
                        sparkFragment.WR(true);
                    }
                });
                if (!C2190461Ao8.LIZIZ()) {
                    sparkContext.LJJLIIIJL(new InterfaceC2217711Bqz() { // from class: X.0qOr
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
                        public final void LJI() {
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
                        public final void LJIIZILJ() {
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
                        public final void onActivityResult(int i, int i2, Intent intent) {
                        }

                        @Override // X.InterfaceC2217711Bqz
                        public final void onRestoreInstanceState(Bundle bundle) {
                        }

                        @Override // X.InterfaceC1163130gND
                        public final void release() {
                        }

                        @Override // X.InterfaceC2217711Bqz
                        public final void finish() {
                            InterfaceC1546650qLn interfaceC1546650qLn;
                            SparkFragment sparkFragment;
                            InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ();
                            if (!(interfaceC1059280dfiLJJIJLIJ instanceof InterfaceC1546650qLn) || (interfaceC1546650qLn = (InterfaceC1546650qLn) interfaceC1059280dfiLJJIJLIJ) == null || (sparkFragment = interfaceC1546650qLn.getSparkFragment()) == null) {
                                return;
                            }
                            sparkFragment.finish();
                            sparkFragment.WR(true);
                        }
                    });
                }
                sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0qOs
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
                    public final void LJIILL(SparkPopup sparkPopup, int i) {
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
                    public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext2) {
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
                        SparkPopup sparkPopup2;
                        SparkFragment sparkFragment;
                        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ();
                        if ((interfaceC1059280dfiLJJIJLIJ instanceof SparkPopup) && (sparkPopup2 = (SparkPopup) interfaceC1059280dfiLJJIJLIJ) != null && (sparkFragment = sparkPopup2.LLJILLL) != null) {
                            sparkFragment.finish();
                            sparkFragment.WR(true);
                        }
                    }
                });
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0071 A[Catch: all -> 0x00cf, TryCatch #1 {all -> 0x00cf, blocks: (B:3:0x0002, B:6:0x000c, B:8:0x0010, B:10:0x001a, B:12:0x0028, B:14:0x002e, B:16:0x0036, B:31:0x00cb, B:17:0x0071, B:19:0x0075, B:21:0x007f, B:23:0x008d, B:25:0x0093, B:27:0x009b, B:29:0x00be, B:30:0x00c9), top: B:72:0x0002 }] */
            @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void handleSparkContext(com.bytedance.hybrid.spark.SparkContext r14, final java.lang.String r15) {
                /*
                    Method dump skipped, instruction units count: 430
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1548530qOp.handleSparkContext(com.bytedance.hybrid.spark.SparkContext, java.lang.String):void");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcSchemaService
    public final List<IInterceptor> LIZIZ() {
        return C1697810uHb.LJIIJJI(new EcSchemaVerifyInterceptor(), new SmartCheckSchemaInterceptor(EnumC1005690cHH.SCHEMA.getValue()), EcTrackerNativeRouteInterceptor.LL);
    }
}
