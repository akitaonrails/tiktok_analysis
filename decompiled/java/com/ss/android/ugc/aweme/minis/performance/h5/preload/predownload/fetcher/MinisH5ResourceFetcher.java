package com.ss.android.ugc.aweme.minis.performance.h5.preload.predownload.fetcher;

import X.AbstractC1528710psr;
import X.AbstractC1534540q2G;
import X.C08QA;
import X.C1528750psv;
import X.C1528760psw;
import X.C1528770psx;
import X.C1528780psy;
import X.C1533490q0Z;
import X.C1533790q13;
import X.C1534420q24;
import X.C2188811AlT;
import X.C259800zU;
import X.C297050Bkd;
import X.C592560NLy;
import android.os.ParcelFileDescriptor;
import android.webkit.WebResourceRequest;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS389S0200000_23;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public final class MinisH5ResourceFetcher extends ResourceFetcher {
    public static final C1528750psv Companion = new Object() { // from class: X.0psv
    };
    public static final int $stable = 8;

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void cancel() {
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchAsync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, Function1<? super C1533790q13, Unit> function1) {
    }

    public MinisH5ResourceFetcher(Forest forest) {
        super(forest);
    }

    private final AbstractC1534540q2G getDataProviderIfHasLocalResource(WebResourceRequest webResourceRequest) {
        boolean z;
        String strLIZ;
        if (((Number) C297050Bkd.LIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        String string = webResourceRequest.getUrl().toString();
        if (string.length() <= 0) {
            return null;
        }
        if (u.LJIIZILJ(string, ".com", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append(".index.html");
            string = C2188811AlT.LIZIZ(sbLIZ);
        }
        C1528770psx c1528770psx = C1528770psx.LIZ;
        c1528770psx.getClass();
        String strLIZIZ = C592560NLy.LIZIZ(string);
        if (strLIZIZ != null && (strLIZ = C592560NLy.LIZ(string)) != null) {
            File fileLJIL = C08QA.LJIL(C08QA.LJIL((File) C1528780psy.LIZ.getValue(), strLIZ), strLIZIZ);
            String strLJJLIL = a0.LJJLIL(string, "://", string);
            String strLJJLIL2 = a0.LJJLIL(strLJJLIL, "/", strLJJLIL);
            if (strLJJLIL2.length() > 0) {
                final File fileLJIL2 = C08QA.LJIL(fileLJIL, strLJJLIL2);
                if (C1528760psw.LIZIZ) {
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LIZ("minis_fp_package_record_switch", false) && !a0.LJJIIZI(strLJJLIL2, "?", false) && !u.LJJIIJZLJL(strLJJLIL2, "#", false)) {
                        ((ConcurrentLinkedQueue) C1528760psw.LIZJ.getValue()).add(new Pair(string, strLJJLIL2));
                    }
                }
                if (fileLJIL2.exists()) {
                    C1528770psx.LIZIZ(c1528770psx, strLIZ, strLIZIZ);
                    return new AbstractC1534540q2G(fileLJIL2) { // from class: X.0psR
                        public final File LIZLLL;

                        @Override // X.InterfaceC1535220q3M
                        public final boolean LIZ() {
                            return false;
                        }

                        @Override // X.InterfaceC1535220q3M
                        public final boolean LIZIZ() {
                            return true;
                        }

                        @Override // X.InterfaceC1535220q3M
                        public final String getName() {
                            return "MinisH5ResourceDataProvider";
                        }

                        @Override // X.InterfaceC1535220q3M
                        public final EnumC1528510psX LIZJ() {
                            return EnumC1528510psX.NO_REUSE;
                        }

                        {
                            this.LIZLLL = fileLJIL2;
                        }

                        @Override // X.AbstractC1534540q2G
                        public final void LJII(C1533790q13 c1533790q13, Function1<? super AbstractC1534220q1k<?>, Unit> function1) {
                            try {
                                function1.invoke(new C1534420q24(new ParcelFileDescriptor.AutoCloseInputStream(ParcelFileDescriptor.open(this.LIZLLL, 268435456))));
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("MinisH5ResourceDataProvider: hit local cache, ");
                                sbLIZ2.append(this.LIZLLL.getAbsolutePath());
                                C2188811AlT.LIZIZ(sbLIZ2);
                            } catch (FileNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                function1.invoke(null);
                            }
                        }
                    };
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("minis-MinisH5ResourceCacheManager extract asset path fail, ");
                sbLIZ2.append(string);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        return null;
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public AbstractC1534540q2G fetch(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13) {
        WebResourceRequest webResourceRequest;
        Object obj = c1533490q0Z.LJJJJI;
        if (!(obj instanceof WebResourceRequest) || (webResourceRequest = (WebResourceRequest) obj) == null) {
            return null;
        }
        return getDataProviderIfHasLocalResource(webResourceRequest);
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchSync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13) {
        final C259800zU c259800zU = new C259800zU();
        AbstractC1534540q2G abstractC1534540q2GFetch = fetch(c1533490q0Z, c1533790q13);
        if (abstractC1534540q2GFetch != null) {
            abstractC1534540q2GFetch.LJII(c1533790q13, new AwS389S0200000_23(c259800zU, (C259800zU<C1534420q24>) c1533790q13, (C1533790q13) 9));
        }
        c1533790q13.LJIILJJIL(new AbstractC1528710psr() { // from class: X.0psu
            public boolean LL;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1533800q14
            public final InputStream LJIILLIIL() {
                this.LL = true;
                C1534420q24 c1534420q24 = c259800zU.element;
                if (c1534420q24 != null) {
                    return (InputStream) c1534420q24.LIZLLL;
                }
                return null;
            }

            @Override // X.AbstractC1533800q14
            public final boolean LJI() {
                return !this.LL;
            }
        });
    }
}
