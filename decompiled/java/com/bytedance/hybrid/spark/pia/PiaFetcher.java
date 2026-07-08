package com.bytedance.hybrid.spark.pia;

import X.AbstractC1528710psr;
import X.AbstractC1534540q2G;
import X.C1529830puf;
import X.C1530150pvB;
import X.C1530540pvo;
import X.C1532670pzF;
import X.C1533490q0Z;
import X.C1533790q13;
import X.C1537480q70;
import X.EnumC1535440q3i;
import X.InterfaceC1532650pzD;
import X.InterfaceC1533080pzu;
import X.InterfaceC1535470q3l;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import java.io.InputStream;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public final class PiaFetcher extends ResourceFetcher {
    public static final C1532670pzF Companion = new Object() { // from class: X.0pzF
    };

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void cancel() {
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchAsync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, Function1<? super C1533790q13, Unit> function1) {
    }

    public PiaFetcher(Forest forest) {
        super(forest);
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public AbstractC1534540q2G fetch(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13) {
        String str;
        final InterfaceC1533080pzu interfaceC1533080pzu;
        C1530150pvB c1530150pvB;
        C1530540pvo c1530540pvo;
        Object obj = c1533490q0Z.LJFF.get("rl_container_uuid");
        if ((obj instanceof String) && (str = (String) obj) != null) {
            C1537480q70.Companion.getClass();
            C1537480q70 c1537480q70LIZIZ = C1529830puf.LIZIZ(str);
            if (c1537480q70LIZIZ != null && (interfaceC1533080pzu = (InterfaceC1533080pzu) c1537480q70LIZIZ.LJFF(InterfaceC1533080pzu.class)) != null) {
                Object objLJFF = interfaceC1533080pzu.LJFF();
                if ((objLJFF instanceof C1530150pvB) && (c1530150pvB = (C1530150pvB) objLJFF) != null && (c1530540pvo = c1530150pvB.LIZJ) != null) {
                    c1530540pvo.LIZJ(c1533490q0Z.LJJJJIZL);
                }
                if (!interfaceC1533080pzu.LIZLLL(c1533490q0Z.LJJJJL)) {
                    return null;
                }
                return new AbstractC1534540q2G(interfaceC1533080pzu) { // from class: X.0pzA
                    public final InterfaceC1533080pzu LIZLLL;

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
                        return "PiaDataProvider";
                    }

                    @Override // X.InterfaceC1535220q3M
                    public final EnumC1528510psX LIZJ() {
                        return EnumC1528510psX.WAIT_FOR_RESULT;
                    }

                    {
                        this.LIZLLL = interfaceC1533080pzu;
                    }

                    @Override // X.AbstractC1534540q2G
                    public final void LJII(final C1533790q13 c1533790q132, Function1<? super AbstractC1534220q1k<?>, Unit> function1) {
                        boolean z;
                        InterfaceC1532650pzD interfaceC1532650pzDLJI = this.LIZLLL.LJI(new InterfaceC1535470q3l() { // from class: X.0pzB
                            @Override // X.InterfaceC1535470q3l
                            public final /* synthetic */ Map getRequestHeaders() {
                                return null;
                            }

                            @Override // X.InterfaceC1535470q3l
                            public final Uri getUrl() {
                                return c1533790q132.LIZ.LJJJJL;
                            }

                            @Override // X.InterfaceC1535470q3l
                            public final boolean isForMainFrame() {
                                WebResourceRequest webResourceRequest;
                                Object obj2 = c1533790q132.LIZ.LJJJJI;
                                if (!(obj2 instanceof WebResourceRequest) || (webResourceRequest = (WebResourceRequest) obj2) == null) {
                                    return false;
                                }
                                return webResourceRequest.isForMainFrame();
                            }
                        });
                        C1534420q24 c1534420q24 = null;
                        if (interfaceC1532650pzDLJI == null) {
                            function1.invoke(null);
                            return;
                        }
                        String str2 = interfaceC1532650pzDLJI.getHeaders().get("pia_forest_from");
                        if (str2 == null) {
                            str2 = "pia";
                        }
                        c1533790q132.LJ = str2;
                        if (interfaceC1532650pzDLJI.LIZJ() == EnumC1535440q3i.Offline) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c1533790q132.LJI = z;
                        c1533790q132.LJIILLIIL = interfaceC1532650pzDLJI.getHeaders();
                        c1533790q132.LJJIIZI = interfaceC1532650pzDLJI.LIZIZ();
                        c1533790q132.LJJI = interfaceC1532650pzDLJI.getMimeType();
                        InputStream data = interfaceC1532650pzDLJI.getData();
                        if (data != null) {
                            c1534420q24 = new C1534420q24(data);
                        }
                        function1.invoke(c1534420q24);
                    }
                };
            }
        }
        return null;
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchSync(final C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13) {
        String str;
        InterfaceC1533080pzu interfaceC1533080pzu;
        final InterfaceC1532650pzD interfaceC1532650pzDLJI;
        boolean z;
        C1530150pvB c1530150pvB;
        C1530540pvo c1530540pvo;
        Object obj = c1533490q0Z.LJFF.get("rl_container_uuid");
        if ((obj instanceof String) && (str = (String) obj) != null) {
            C1537480q70.Companion.getClass();
            C1537480q70 c1537480q70LIZIZ = C1529830puf.LIZIZ(str);
            if (c1537480q70LIZIZ != null && (interfaceC1533080pzu = (InterfaceC1533080pzu) c1537480q70LIZIZ.LJFF(InterfaceC1533080pzu.class)) != null) {
                Object objLJFF = interfaceC1533080pzu.LJFF();
                if ((objLJFF instanceof C1530150pvB) && (c1530150pvB = (C1530150pvB) objLJFF) != null && (c1530540pvo = c1530150pvB.LIZJ) != null) {
                    c1530540pvo.LIZJ(c1533490q0Z.LJJJJIZL);
                }
                if (!interfaceC1533080pzu.LIZLLL(c1533490q0Z.LJJJJL) || (interfaceC1532650pzDLJI = interfaceC1533080pzu.LJI(new InterfaceC1535470q3l() { // from class: X.0pzC
                    @Override // X.InterfaceC1535470q3l
                    public final /* synthetic */ Map getRequestHeaders() {
                        return null;
                    }

                    @Override // X.InterfaceC1535470q3l
                    public final Uri getUrl() {
                        return c1533490q0Z.LJJJJL;
                    }

                    @Override // X.InterfaceC1535470q3l
                    public final boolean isForMainFrame() {
                        WebResourceRequest webResourceRequest;
                        Object obj2 = c1533490q0Z.LJJJJI;
                        if (!(obj2 instanceof WebResourceRequest) || (webResourceRequest = (WebResourceRequest) obj2) == null) {
                            return false;
                        }
                        return webResourceRequest.isForMainFrame();
                    }
                })) == null) {
                    return;
                }
                String str2 = interfaceC1532650pzDLJI.getHeaders().get("pia_forest_from");
                if (str2 == null) {
                    str2 = "pia";
                }
                c1533790q13.LJ = str2;
                if (interfaceC1532650pzDLJI.LIZJ() == EnumC1535440q3i.Offline) {
                    z = true;
                } else {
                    z = false;
                }
                c1533790q13.LJI = z;
                c1533790q13.LJIILLIIL = interfaceC1532650pzDLJI.getHeaders();
                c1533790q13.LJJIIZI = interfaceC1532650pzDLJI.LIZIZ();
                c1533790q13.LJJI = interfaceC1532650pzDLJI.getMimeType();
                c1533790q13.LJIILJJIL(new AbstractC1528710psr() { // from class: X.0pzE
                    public volatile boolean LL;

                    @Override // X.AbstractC1533800q14
                    public final boolean LJI() {
                        return !this.LL;
                    }

                    @Override // X.AbstractC1533800q14
                    public final InputStream LJIILLIIL() {
                        if (this.LL) {
                            return null;
                        }
                        this.LL = true;
                        return interfaceC1532650pzDLJI.getData();
                    }
                });
                c1533790q13.LIZIZ = true;
            }
        }
    }
}
