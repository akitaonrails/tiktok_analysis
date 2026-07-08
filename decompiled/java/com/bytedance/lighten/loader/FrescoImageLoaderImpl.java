package com.bytedance.lighten.loader;

import X.AbstractC1291220jho;
import X.AbstractC1327750kej;
import X.C03IT;
import X.C0QD7;
import X.C0STX;
import X.C0STY;
import X.C0V7X;
import X.C0WQX;
import X.C1260120ite;
import X.C1318160kPG;
import X.C1319910kS5;
import X.C1320160kSU;
import X.C1320750kTR;
import X.C1320770kTT;
import X.C1320930kTj;
import X.C1322090kVb;
import X.C1322200kVm;
import X.C1323010kX5;
import X.C1323050kX9;
import X.C1324630kZh;
import X.C1324670kZl;
import X.C1324860ka4;
import X.C1325540kbA;
import X.C1325700kbQ;
import X.C1325710kbR;
import X.C1328130kfL;
import X.C1328950kgf;
import X.C1329360khK;
import X.C1330570kjH;
import X.C1330590kjJ;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1331510kkn;
import X.C1331520kko;
import X.C1331530kkp;
import X.C1331570kkt;
import X.C1331580kku;
import X.C1331660kl2;
import X.C1331710kl7;
import X.C1331730kl9;
import X.C1331830klJ;
import X.C1331880klO;
import X.C1331920klS;
import X.C1331990klZ;
import X.C1332060klg;
import X.C1334400kpS;
import X.C1C7U;
import X.C2123408To;
import X.C2123508Tp;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C427870Gq9;
import X.C823050WQl;
import X.EnumC1203020hPY;
import X.EnumC1320950kTl;
import X.EnumC1321320kUM;
import X.EnumC1325560kbC;
import X.EnumC1330650kjP;
import X.EnumC1331380kka;
import X.EnumC1334360kpO;
import X.EnumC714850S2h;
import X.InterfaceC1320200kSY;
import X.InterfaceC1320380kSq;
import X.InterfaceC1320850kTb;
import X.InterfaceC1325460kb2;
import X.InterfaceC1330030kiP;
import X.InterfaceC1331190kkH;
import X.InterfaceC1331500kkm;
import X.InterfaceC1331800klG;
import X.InterfaceC1331910klR;
import X.InterfaceC1334290kpH;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS6S0001000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.KeyEvent;
import android.widget.ImageView;
import com.bytedance.lighten.core.config.SRConfig;
import com.bytedance.lighten.loader.FrescoImageLoaderImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes21.dex */
public class FrescoImageLoaderImpl implements InterfaceC1330030kiP {
    public static boolean sIsRemoveLog;
    public static volatile boolean sLayerDrawableFixEnabled;
    public InterfaceC1325460kb2 mCache;
    public ExecutorService mIOExecutor;

    public static /* synthetic */ C1325710kbR LIZIZ(C1325710kbR c1325710kbR, InterfaceC1320200kSY interfaceC1320200kSY) {
        lambda$loadBitmap$0(c1325710kbR, interfaceC1320200kSY);
        return c1325710kbR;
    }

    public static /* synthetic */ C1325710kbR lambda$loadBitmap$0(C1325710kbR c1325710kbR, InterfaceC1320200kSY interfaceC1320200kSY) {
        return c1325710kbR;
    }

    public FrescoImageLoaderImpl(InterfaceC1325460kb2 interfaceC1325460kb2) {
        this.mCache = interfaceC1325460kb2;
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.FIXED);
        c2123408ToLIZ.LIZIZ = "fresco-loader-io";
        c2123408ToLIZ.LIZJ = 2;
        this.mIOExecutor = C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public static void buildCircleOptions(C1331510kkn c1331510kkn) {
        C1331100kk8 c1331100kk8;
        C1322090kVb c1322090kVb;
        C1331730kl9 c1331730kl9 = c1331510kkn.LJJI;
        if (c1331730kl9 == null) {
            if (c1331510kkn.LJJLIIIJILLIZJL && (c1322090kVb = (C1322090kVb) c1331510kkn.LJJIJ) != null && c1322090kVb.getHierarchy() != null && ((C1331070kk5) c1322090kVb.getHierarchy()).LIZJ != null) {
                ((C1331070kk5) c1322090kVb.getHierarchy()).LJJIII(null);
                return;
            }
            return;
        }
        C1322090kVb c1322090kVb2 = (C1322090kVb) c1331510kkn.LJJIJ;
        if (c1322090kVb2 == null) {
            return;
        }
        if (((C1331070kk5) c1322090kVb2.getHierarchy()).LIZJ != null) {
            c1331100kk8 = ((C1331070kk5) c1322090kVb2.getHierarchy()).LIZJ;
        } else {
            c1331100kk8 = new C1331100kk8();
        }
        ((C1331070kk5) c1322090kVb2.getHierarchy()).LJJIII(circleConvertRoundParams(c1331100kk8, c1331730kl9));
    }

    public static C1329360khK buildImageDecodeOptions(C1331510kkn c1331510kkn) {
        C1331990klZ c1331990klZ;
        List<InterfaceC1331800klG> list;
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        Bitmap.Config config = c1331510kkn.LJIL;
        if (config != null && !c1331510kkn.LJJLI) {
            imageDecodeOptionsBuilder.setBitmapConfig(config);
        }
        imageDecodeOptionsBuilder.LJ = false;
        int i = c1331510kkn.LJI;
        if (i >= 0) {
            imageDecodeOptionsBuilder.LIZIZ(i);
        }
        if (c1331510kkn.LJJLIIIJL) {
            imageDecodeOptionsBuilder.LJFF = true;
        }
        if (c1331510kkn.LJ != -1) {
            HashMap map = new HashMap();
            map.put("frame_scheduler_id", Integer.valueOf(c1331510kkn.LJ));
            InterfaceC1331190kkH interfaceC1331190kkH = c1331510kkn.LJJJIL;
            if (interfaceC1331190kkH != null) {
                map.put("frame_scheduler_listener", interfaceC1331190kkH);
            }
            imageDecodeOptionsBuilder.LJIIJ = map;
        }
        SRConfig sRConfig = (SRConfig) C1331660kl2.LIZLLL().LIZIZ.LJJIJ.LIZ();
        if (sRConfig != null && sRConfig.useJniSr && (c1331990klZ = c1331510kkn.LJJII) != null && (list = c1331990klZ.LIZ) != null) {
            Iterator<InterfaceC1331800klG> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1331800klG next = it2.next();
                if (next instanceof C1331570kkt) {
                    C1331570kkt c1331570kkt = (C1331570kkt) next;
                    imageDecodeOptionsBuilder.LJIILL = true;
                    imageDecodeOptionsBuilder.LJIILLIIL = new C1328950kgf(c1331570kkt.LIZJ, c1331570kkt.LIZIZ, sRConfig.bitmapWidth, sRConfig.bitmapHeight);
                    break;
                }
            }
        }
        return new C1329360khK(imageDecodeOptionsBuilder);
    }

    public static C1325710kbR[] buildImageRequests(C1331510kkn c1331510kkn) {
        int i = C2187451AjH.LIZ;
        C1330590kjJ.LJII(c1331510kkn.hashCode(), "FrescoImageLoaderImpl", "buildImageRequests");
        List<String> imageUrlModelUrls = getImageUrlModelUrls(c1331510kkn);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = imageUrlModelUrls.iterator();
        while (it2.hasNext()) {
            C1325700kbQ c1325700kbQMakeImageRequestBuilder = makeImageRequestBuilder(c1331510kkn, UriProtector.parse(it2.next()));
            c1325700kbQMakeImageRequestBuilder.LJIIZILJ = C1331830klJ.LJIIL(c1331510kkn.LJJJJ);
            if (c1331510kkn.LJJJJIZL) {
                HashMap map = new HashMap();
                map.put("__NO_COOKIE", "1");
                c1325700kbQMakeImageRequestBuilder.LJFF(map);
            }
            if (c1331510kkn.LJJJJJ) {
                c1325700kbQMakeImageRequestBuilder.LJIILJJIL = false;
            }
            if (c1331510kkn.LJJJJJL) {
                c1325700kbQMakeImageRequestBuilder.LJIILLIIL = false;
            }
            if (c1331510kkn.LJJLIIIIJ) {
                c1325700kbQMakeImageRequestBuilder.LJJII = true;
            }
            C1325710kbR c1325710kbRLIZ = c1325700kbQMakeImageRequestBuilder.LIZ();
            if (!sIsRemoveLog) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("build ImageRequest:");
                sbLIZ.append(c1325710kbRLIZ);
                C1330590kjJ.LJIIIIZZ(c1331510kkn.hashCode(), "FrescoImageLoaderImpl", "buildImageRequests", C2188811AlT.LIZIZ(sbLIZ));
            }
            arrayList.add(c1325710kbRLIZ);
        }
        if (arrayList.size() == 0) {
            return new C1325710kbR[0];
        }
        return (C1325710kbR[]) arrayList.toArray(new C1325710kbR[arrayList.size()]);
    }

    public static EnumC1331380kka buildPriority(C1331510kkn c1331510kkn) {
        EnumC1334360kpO enumC1334360kpO = c1331510kkn.LJJIII;
        if (enumC1334360kpO == EnumC1334360kpO.LOW) {
            return EnumC1331380kka.LOW;
        }
        if (enumC1334360kpO == EnumC1334360kpO.HIGH) {
            return EnumC1331380kka.HIGH;
        }
        if (enumC1334360kpO == EnumC1334360kpO.IMMEDIATE) {
            return EnumC1331380kka.IMMEDIATE;
        }
        return EnumC1331380kka.MEDIUM;
    }

    public static C1324630kZh buildResizeOptions(C1331510kkn c1331510kkn) {
        int i = c1331510kkn.LJIIJJI;
        if (i > 0) {
            return new C1324630kZh(c1331510kkn.LJIIIZ, c1331510kkn.LJIIJ, i);
        }
        return new C1324630kZh(c1331510kkn.LJIIIZ, c1331510kkn.LJIIJ);
    }

    public static Drawable getDrawableCopySafeForLayer(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable.getConstantState() != null) {
            return drawable.getConstantState().newDrawable();
        }
        return drawable;
    }

    public static List<String> getImageUrlModelUrls(C1331510kkn c1331510kkn) {
        C03IT c03it = c1331510kkn.LJJJI;
        if (c03it != null && !c03it.LIZ()) {
            return c1331510kkn.LJJJI.LIZ;
        }
        return Collections.emptyList();
    }

    public static /* synthetic */ void lambda$makeImageRequestBuilder$1(C1331510kkn c1331510kkn) {
        C1C7U.LIZ("FrescoImageLoaderImpl@7681.makeImageRequestBuilder$1L");
        buildCircleOptions(c1331510kkn);
        setBackgroundImage(c1331510kkn);
        setPlaceholderAndScaleType(c1331510kkn);
        C1C7U.LIZIZ("FrescoImageLoaderImpl@7681.makeImageRequestBuilder$1L");
    }

    public static void setBackgroundImage(C1331510kkn c1331510kkn) {
        C1322090kVb c1322090kVb;
        if (c1331510kkn.LJJIJLIJ || (c1322090kVb = (C1322090kVb) c1331510kkn.LJJIJ) == null) {
            return;
        }
        Drawable drawable = c1331510kkn.LJIJJLI;
        if (drawable == null) {
            ((C1331070kk5) c1322090kVb.getHierarchy()).LJIJ(null, 0);
        } else {
            ((C1331070kk5) c1322090kVb.getHierarchy()).LJIJ(new C1319910kS5(drawable, InterfaceC1320380kSq.LJI), 0);
        }
    }

    public static void setIsRemoveLog(boolean z) {
        sIsRemoveLog = z;
    }

    public static void setLayerDrawableFixEnabled(boolean z) {
        sLayerDrawableFixEnabled = z;
    }

    public static void setPlaceholderAndScaleType(C1331510kkn c1331510kkn) {
        Drawable drawableCopySafeForLayer;
        Drawable drawableCopySafeForLayer2;
        Drawable drawableCopySafeForLayer3;
        C1322090kVb c1322090kVb = (C1322090kVb) c1331510kkn.LJJIJ;
        if (c1322090kVb == null) {
            return;
        }
        if (c1331510kkn.LJIILL > 0) {
            if (c1331510kkn.LJIIZILJ != null) {
                ((C1331070kk5) c1322090kVb.getHierarchy()).LJJI(c1331510kkn.LJIILL, C1323010kX5.LIZ(c1331510kkn.LJIIZILJ));
            } else {
                ((C1331070kk5) c1322090kVb.getHierarchy()).LJJ(c1331510kkn.LJIILL);
            }
        } else if (c1331510kkn.LJIILLIIL != null) {
            if (sLayerDrawableFixEnabled) {
                drawableCopySafeForLayer = getDrawableCopySafeForLayer(c1331510kkn.LJIILLIIL);
            } else {
                drawableCopySafeForLayer = c1331510kkn.LJIILLIIL;
            }
            if (c1331510kkn.LJIIZILJ != null) {
                ((C1331070kk5) c1322090kVb.getHierarchy()).LJJIFFI(drawableCopySafeForLayer, C1323010kX5.LIZ(c1331510kkn.LJIIZILJ));
            } else {
                ((C1331070kk5) c1322090kVb.getHierarchy()).LJIJ(drawableCopySafeForLayer, 1);
            }
        }
        if (c1331510kkn.LJIJ > 0) {
            if (c1331510kkn.LJIJI != null) {
                ((C1331070kk5) c1322090kVb.getHierarchy()).LJIJJ(c1331510kkn.LJIJ, C1323010kX5.LIZ(c1331510kkn.LJIJI));
            } else {
                C1331070kk5 c1331070kk5 = (C1331070kk5) c1322090kVb.getHierarchy();
                c1331070kk5.LJIJ(c1331070kk5.LIZIZ.getDrawable(c1331510kkn.LJIJ), 5);
            }
        } else if (c1331510kkn.LJIJJ != null) {
            if (sLayerDrawableFixEnabled) {
                drawableCopySafeForLayer2 = getDrawableCopySafeForLayer(c1331510kkn.LJIJJ);
            } else {
                drawableCopySafeForLayer2 = c1331510kkn.LJIJJ;
            }
            if (c1331510kkn.LJIJI != null) {
                ((C1331070kk5) c1322090kVb.getHierarchy()).LJIJJLI(drawableCopySafeForLayer2, C1323010kX5.LIZ(c1331510kkn.LJIJI));
            } else {
                ((C1331070kk5) c1322090kVb.getHierarchy()).LJIJ(drawableCopySafeForLayer2, 5);
            }
        }
        if (c1331510kkn.LJJ != null) {
            ((C1331070kk5) c1322090kVb.getHierarchy()).LJIIZILJ(C1323010kX5.LIZ(c1331510kkn.LJJ));
        }
        if (c1331510kkn.LJJJ != null) {
            if (sLayerDrawableFixEnabled) {
                drawableCopySafeForLayer3 = getDrawableCopySafeForLayer(c1331510kkn.LJJJ);
            } else {
                drawableCopySafeForLayer3 = c1331510kkn.LJJJ;
            }
            ((C1331070kk5) c1322090kVb.getHierarchy()).LJIJ(drawableCopySafeForLayer3, 4);
        }
        if (c1331510kkn.LJIILJJIL >= 0) {
            ((C1331070kk5) c1322090kVb.getHierarchy()).LJIJI(c1331510kkn.LJIILJJIL);
        }
    }

    @Override // X.InterfaceC1330030kiP
    public void display(final C1331510kkn c1331510kkn) {
        Object obj;
        final C1320770kTT c1320770kTT;
        final C1325710kbR[] c1325710kbRArrBuildImageRequests;
        int i = C2187451AjH.LIZ;
        C1330590kjJ.LJII(c1331510kkn.hashCode(), "FrescoImageLoaderImpl", "display");
        InterfaceC1334290kpH interfaceC1334290kpH = c1331510kkn.LJJIJ;
        if (interfaceC1334290kpH instanceof C427870Gq9) {
            ((SmartImageView) interfaceC1334290kpH).LIZ(c1331510kkn);
            return;
        }
        if (interfaceC1334290kpH instanceof SmartImageView) {
            ((SmartImageView) interfaceC1334290kpH).LIZ(c1331510kkn);
            return;
        }
        final ImageView imageView = c1331510kkn.LJJIJIIJI;
        if (imageView != null) {
            C1330590kjJ.LJII(c1331510kkn.hashCode(), "FrescoBareImageLoader", "into");
            Object tag = imageView.getTag();
            final InterfaceC1320850kTb interfaceC1320850kTb = null;
            if (!(tag instanceof C1324860ka4) || (obj = ((HashMap) tag).get("DraweeHolder")) == null) {
                obj = null;
            }
            if (obj instanceof C1320770kTT) {
                c1320770kTT = (C1320770kTT) obj;
            } else {
                c1320770kTT = null;
            }
            C03IT c03it = c1331510kkn.LJJJI;
            if (c03it != null && !c03it.LIZ()) {
                c1325710kbRArrBuildImageRequests = buildImageRequests(c1331510kkn);
                if (c1325710kbRArrBuildImageRequests == null) {
                    return;
                }
            } else {
                Uri uri = c1331510kkn.LIZ;
                if (uri == null) {
                    return;
                } else {
                    c1325710kbRArrBuildImageRequests = new C1325710kbR[]{buildImageRequest(c1331510kkn, uri)};
                }
            }
            if (c1325710kbRArrBuildImageRequests.length == 0) {
                return;
            }
            if (c1320770kTT != null) {
                interfaceC1320850kTb = c1320770kTT.LLILZIL;
            }
            final C1331530kkp c1331530kkp = new C1331530kkp();
            c1331530kkp.LJIIJJI(c1331510kkn);
            C0STY.LIZ.execute(new Runnable() { // from class: X.0kkq
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FrescoBareImageLoader@3632.setController$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FrescoBareImageLoader@3632.setController$1");
                }

                public final void LIZ() {
                    C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                    c1320810kTXLIZJ.LJIIJJI = c1331510kkn.LIZLLL;
                    c1320810kTXLIZJ.LJIIIIZZ = c1331530kkp;
                    c1320810kTXLIZJ.LJIILJJIL = interfaceC1320850kTb;
                    c1320810kTXLIZJ.LJFF(c1325710kbRArrBuildImageRequests, true);
                    c1320810kTXLIZJ.LJIIL = false;
                    c1331510kkn.getClass();
                    c1320810kTXLIZJ.LJIIJ = c1331510kkn.LJJJ != null;
                    AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
                    c1331530kkp.LJIIIIZZ = abstractC1320710kTNLIZ;
                    abstractC1320710kTNLIZ.LJ(new C1330570kjH(c1331510kkn));
                    C1320770kTT c1320770kTT2 = c1320770kTT;
                    if (c1320770kTT2 != null) {
                        c1320770kTT2.LJI();
                        c1320770kTT.LJIIIZ(C1331590kkv.LIZ(imageView, c1331510kkn));
                        c1320770kTT.LJIIIIZZ(abstractC1320710kTNLIZ);
                        c1320770kTT.LJFF();
                        imageView.setImageDrawable(c1320770kTT.LIZLLL());
                        return;
                    }
                    imageView.getContext();
                    C1320770kTT c1320770kTT3 = new C1320770kTT(null);
                    int i2 = C2187451AjH.LIZ;
                    C1330590kjJ.LJIIIIZZ(c1331510kkn.hashCode(), "FrescoBareImageLoader", "into", "draweeHolder create");
                    ViewOnAttachStateChangeListenerC1331740klA viewOnAttachStateChangeListenerC1331740klA = new ViewOnAttachStateChangeListenerC1331740klA(c1320770kTT3);
                    c1320770kTT3.LJIIIZ(C1331590kkv.LIZ(imageView, c1331510kkn));
                    c1320770kTT3.LJIIIIZZ(abstractC1320710kTNLIZ);
                    KeyEvent.Callback callback = imageView;
                    if (callback instanceof InterfaceC1332020klc) {
                        ((InterfaceC1332020klc) callback).LIZ();
                    }
                    if (imageView.isAttachedToWindow()) {
                        viewOnAttachStateChangeListenerC1331740klA.onViewAttachedToWindow(imageView);
                    }
                    imageView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1331740klA);
                    imageView.setOnTouchListener(viewOnAttachStateChangeListenerC1331740klA);
                    ImageView imageView2 = imageView;
                    if (imageView2 != null) {
                        Object tag2 = imageView2.getTag();
                        if (tag2 instanceof C1324860ka4) {
                            ((HashMap) tag2).put("DraweeHolder", c1320770kTT3);
                        } else {
                            imageView2.setTag(new C1324860ka4(c1320770kTT3));
                        }
                    }
                    imageView.setImageDrawable(c1320770kTT3.LIZLLL());
                }
            });
            return;
        }
        C1330590kjJ.LIZLLL(c1331510kkn.hashCode(), "FrescoImageLoaderImpl", "display", "needs SmartImageView or ImageView to display, use with(view)");
        if (C1334400kpS.LIZ()) {
        } else {
            throw new IllegalArgumentException("FrescoImageLoaderImplneeds SmartImageView or ImageView to display, use with(view)");
        }
    }

    @Override // X.InterfaceC1330030kiP
    public void download(C1331510kkn c1331510kkn) {
        Uri uri;
        int i = C2187451AjH.LIZ;
        C1330590kjJ.LJII(c1331510kkn.hashCode(), "FrescoImageLoaderImpl", "download");
        List<String> imageUrlModelUrls = getImageUrlModelUrls(c1331510kkn);
        if (imageUrlModelUrls.isEmpty()) {
            uri = c1331510kkn.LIZ;
        } else {
            uri = UriProtector.parse((String) ListProtector.get(imageUrlModelUrls, 0));
        }
        this.mCache.LJIIL(uri, new C1331580kku(this, c1331510kkn, uri));
    }

    public Executor getCallbackExecutor(C1331510kkn c1331510kkn) {
        C0STX c0stx = C0STY.LIZ;
        Executor executor = c1331510kkn.LJJIIJZLJL;
        if (executor != null) {
            return executor;
        }
        return c0stx;
    }

    @Override // X.InterfaceC1330030kiP
    public void loadBitmap(C1331510kkn c1331510kkn) {
        int i = C2187451AjH.LIZ;
        C1330590kjJ.LJII(c1331510kkn.hashCode(), "FrescoImageLoaderImpl", "loadBitmap");
        C03IT c03it = c1331510kkn.LJJJI;
        if (c03it != null && !c03it.LIZ()) {
            final C1325710kbR[] c1325710kbRArrBuildImageRequests = buildImageRequests(c1331510kkn);
            if (c1325710kbRArrBuildImageRequests.length == 0) {
                C1330590kjJ.LIZLLL(c1331510kkn.hashCode(), "FrescoImageLoaderImpl", "loadBitmap", "loadBitmap, url is empty");
                return;
            }
            final ArrayList arrayList = new ArrayList();
            for (C1325710kbR c1325710kbR : c1325710kbRArrBuildImageRequests) {
                if (c1325710kbR != null) {
                    C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                    EnumC1320950kTl enumC1320950kTl = EnumC1320950kTl.FULL_FETCH;
                    c1325540kbALIZ.getClass();
                    arrayList.add(new C1320160kSU(c1325540kbALIZ, c1325710kbR, enumC1320950kTl));
                }
            }
            if (arrayList.isEmpty()) {
                int i2 = C2187451AjH.LIZ;
                C1330590kjJ.LIZLLL(c1331510kkn.hashCode(), "FrescoImageLoaderImpl", "loadBitmap", " suppliers is empty");
                return;
            } else {
                createBaseBitmapDataSubscriber(new C1320930kTj(new C1320750kTR(arrayList)), c1331510kkn, new InterfaceC1331500kkm() { // from class: X.0kkl
                    @Override // X.InterfaceC1331500kkm
                    public final C1325710kbR LIZ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                        if (!(interfaceC1320200kSY instanceof C1320930kTj)) {
                            return null;
                        }
                        int iIndexOf = arrayList.indexOf(((C1320930kTj) interfaceC1320200kSY).LJIILL());
                        if (iIndexOf < 0) {
                            return null;
                        }
                        return c1325710kbRArrBuildImageRequests[iIndexOf];
                    }
                });
                return;
            }
        }
        final C1325710kbR c1325710kbRBuildImageRequest = buildImageRequest(c1331510kkn, c1331510kkn.LIZ);
        createBaseBitmapDataSubscriber(C1328130kfL.LJIILIIL().LJIIL().LJI(c1325710kbRBuildImageRequest, c1331510kkn.LJJIIJ), c1331510kkn, new InterfaceC1331500kkm() { // from class: X.0klT
            @Override // X.InterfaceC1331500kkm
            public final C1325710kbR LIZ(InterfaceC1320200kSY interfaceC1320200kSY) {
                C1325710kbR c1325710kbR2 = c1325710kbRBuildImageRequest;
                FrescoImageLoaderImpl.lambda$loadBitmap$0(c1325710kbR2, interfaceC1320200kSY);
                return c1325710kbR2;
            }
        });
    }

    @Override // X.InterfaceC1330030kiP
    public void trimDisk(int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("level=");
        sbLIZ.append(i);
        C1330590kjJ.LJIIIZ("FrescoImageLoaderImpl", "trimDisk", C2188811AlT.LIZIZ(sbLIZ));
        this.mIOExecutor.submit(new ARunnableS6S0001000_20(i, 0));
    }

    @Override // X.InterfaceC1330030kiP
    public void trimMemory(int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" level=");
        sbLIZ.append(i);
        C1330590kjJ.LJIIIZ("FrescoImageLoaderImpl", "trimMemory", C2188811AlT.LIZIZ(sbLIZ));
        if (i != 5) {
            if (i != 10) {
                if (i == 40) {
                    C0V7X.LIZ.LIZIZ(EnumC1330650kjP.OnSystemLowMemoryWhileAppInBackground);
                    return;
                }
                return;
            } else {
                C0V7X.LIZ.LIZIZ(EnumC1330650kjP.OnCloseToDalvikHeapLimit);
                C0QD7.LIZ.LIZIZ();
                return;
            }
        }
        C0V7X.LIZ.LIZIZ(EnumC1330650kjP.OnSystemLowMemoryWhileAppInForeground);
        C0QD7.LIZ.LIZIZ();
    }

    public static void buildBlurOptions(C1325700kbQ c1325700kbQ, C1331510kkn c1331510kkn) {
        C1332060klg c1332060klg = c1331510kkn.LJJIFFI;
        if (c1332060klg != null) {
            final int i = c1332060klg.LIZ;
            final Context contextLIZ = c1331510kkn.LIZ();
            final int i2 = c1332060klg.LIZIZ;
            c1325700kbQ.LJIILIIL = new AbstractC1291220jho(i, i2, contextLIZ) { // from class: X.0kRo
                public final int LIZ;
                public final Context LIZIZ;
                public final int LIZJ;
                public C592490NLr LIZLLL;

                @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
                public final InterfaceC1324680kZm getPostprocessorCacheKey() {
                    if (this.LIZLLL == null) {
                        this.LIZLLL = new C592490NLr(C786410Ut5.k4(null, "IntrinsicBlur;%d", new Object[]{Integer.valueOf(this.LIZJ)}));
                    }
                    return this.LIZLLL;
                }

                @Override // X.AbstractC1291220jho
                public final void process(Bitmap bitmap) {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    int i3 = this.LIZ;
                    int i4 = this.LIZJ;
                    bitmap.getClass();
                    C1322350kW1.LIZIZ(bitmap.isMutable());
                    if (bitmap.getHeight() <= 2048.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1322350kW1.LIZIZ(z);
                    if (bitmap.getWidth() <= 2048.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C1322350kW1.LIZIZ(z2);
                    if (i4 > 0 && i4 <= 25) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C1322350kW1.LIZIZ(z3);
                    if (i3 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    C1322350kW1.LIZIZ(z4);
                    try {
                        C09BD.LIZ(i3, i4, bitmap);
                    } catch (OutOfMemoryError e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1328570kg3.LJFF("IterativeBoxBlurFilter", C786410Ut5.k4(null, "OOM: %d iterations on %dx%d with %d radius", new Object[]{Integer.valueOf(i3), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(i4)}));
                        throw e;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
                /* JADX WARN: Type inference failed for: r0v3 */
                /* JADX WARN: Type inference failed for: r0v6 */
                @Override // X.AbstractC1291220jho
                public final void process(Bitmap bitmap, Bitmap bitmap2) throws Throwable {
                    RenderScript renderScript;
                    Context context = this.LIZIZ;
                    int i3 = this.LIZJ;
                    bitmap.getClass();
                    bitmap2.getClass();
                    context.getClass();
                    if (i3 > 0 && i3 <= 25) {
                        renderScript = 1;
                    } else {
                        renderScript = 0;
                    }
                    C1322350kW1.LIZIZ(renderScript);
                    try {
                        try {
                            RenderScript renderScriptCreate = RenderScript.create(context);
                            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap2);
                            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmap);
                            scriptIntrinsicBlurCreate.setRadius(i3);
                            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                            allocationCreateFromBitmap2.copyTo(bitmap);
                            if (renderScriptCreate != null) {
                                renderScriptCreate.destroy();
                            }
                        } catch (Throwable th) {
                            th = th;
                            renderScript = 0;
                            TryCatchGuardChecker.doCheck(th);
                            if (renderScript != 0) {
                                renderScript.destroy();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }

                @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
                public final C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) {
                    Bitmap bitmapCopy;
                    if (!bitmap.getConfig().equals(Bitmap.Config.ARGB_8888)) {
                        bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                    } else {
                        bitmapCopy = bitmap;
                    }
                    C1323050kX9<Bitmap> c1323050kX9LJFF = abstractC1301670jyf.LJFF(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                    try {
                        process(c1323050kX9LJFF.get(), bitmapCopy);
                        C1323050kX9<Bitmap> c1323050kX9LJFF2 = C1323050kX9.LJFF(c1323050kX9LJFF);
                        C1323050kX9.LJII(c1323050kX9LJFF);
                        return c1323050kX9LJFF2;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1323050kX9.LJII(c1323050kX9LJFF);
                        throw th;
                    }
                }

                {
                    boolean z;
                    if (i > 0 && i <= 25) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1322350kW1.LIZIZ(z);
                    C1322350kW1.LIZIZ(i2 > 0);
                    contextLIZ.getClass();
                    this.LIZ = i2;
                    this.LIZJ = i;
                    this.LIZIZ = contextLIZ;
                }
            };
        }
    }

    public static void buildCropOptions(C1325700kbQ c1325700kbQ, C1331510kkn c1331510kkn) {
        c1331510kkn.getClass();
    }

    public static C1325710kbR buildImageRequest(C1331510kkn c1331510kkn, Uri uri) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uri:");
        sbLIZ.append(uri);
        C1330590kjJ.LJIIIIZZ(c1331510kkn.hashCode(), "FrescoImageLoaderImpl", "buildImageRequest", C2188811AlT.LIZIZ(sbLIZ));
        C1325700kbQ c1325700kbQMakeImageRequestBuilder = makeImageRequestBuilder(c1331510kkn, uri);
        c1325700kbQMakeImageRequestBuilder.LJIIZILJ = C1331830klJ.LJIIL(c1331510kkn.LJJJJ);
        if (c1331510kkn.LJJJJIZL) {
            HashMap map = new HashMap();
            map.put("__NO_COOKIE", "1");
            c1325700kbQMakeImageRequestBuilder.LJFF(map);
        }
        if (c1331510kkn.LJJJJJ) {
            c1325700kbQMakeImageRequestBuilder.LJIILJJIL = false;
        }
        if (c1331510kkn.LJJJJJL) {
            c1325700kbQMakeImageRequestBuilder.LJIILLIIL = false;
        }
        if (c1331510kkn.LJJLIIIIJ) {
            c1325700kbQMakeImageRequestBuilder.LJJII = true;
        }
        if (c1331510kkn.LJJLIIIJ) {
            c1325700kbQMakeImageRequestBuilder.LJJIJIIJI = true;
        }
        return c1325700kbQMakeImageRequestBuilder.LIZ();
    }

    public static void buildPostProcessor(C1325700kbQ c1325700kbQ, C1331510kkn c1331510kkn) {
        List<InterfaceC1331800klG> list;
        C1331990klZ c1331990klZ = c1331510kkn.LJJII;
        if (c1331990klZ != null && (list = c1331990klZ.LIZ) != null && !list.isEmpty()) {
            final InterfaceC1331800klG interfaceC1331800klG = (InterfaceC1331800klG) ListProtector.get(c1331510kkn.LJJII.LIZ, 0);
            c1325700kbQ.LJIILIIL = new AbstractC1291220jho(interfaceC1331800klG) { // from class: X.0kkz
                public final InterfaceC1331800klG LIZ;
                public C1331760klC LIZIZ;

                @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
                public final String getName() {
                    return this.LIZ.getKey();
                }

                @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
                public final InterfaceC1324680kZm getPostprocessorCacheKey() {
                    return new C592490NLr(this.LIZ.getKey());
                }

                {
                    this.LIZ = interfaceC1331800klG;
                }

                @Override // X.AbstractC1291220jho
                public final C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf, Map<String, String> map) throws Throwable {
                    C1331870klN c1331870klN;
                    if (this.LIZIZ == null) {
                        this.LIZIZ = new C1331760klC(abstractC1301670jyf);
                    }
                    try {
                        c1331870klN = (C1331870klN) this.LIZ.LIZ(bitmap, this.LIZIZ, map);
                        try {
                            C1323050kX9<Bitmap> c1323050kX9LJFF = C1323050kX9.LJFF(c1331870klN.LIZ);
                            C1323050kX9.LJII(c1331870klN.LIZ);
                            return c1323050kX9LJFF;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            if (c1331870klN != null) {
                                C1323050kX9.LJII(c1331870klN.LIZ);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c1331870klN = null;
                    }
                }
            };
        }
    }

    public static C1331100kk8 circleConvertRoundParams(C1331100kk8 c1331100kk8, C1331730kl9 c1331730kl9) {
        EnumC1321320kUM enumC1321320kUM;
        if (c1331730kl9 == null) {
            return c1331100kk8;
        }
        if (c1331100kk8 == null) {
            c1331100kk8 = new C1331100kk8();
        }
        C1331920klS c1331920klS = c1331730kl9.LJI;
        if (c1331920klS != null) {
            c1331100kk8.LJI(c1331920klS.LIZ, c1331920klS.LIZIZ, c1331920klS.LIZJ, c1331920klS.LIZLLL);
        } else {
            float f = c1331730kl9.LJ;
            if (f > 0.0f) {
                c1331100kk8.LJII(f);
            }
        }
        c1331100kk8.LIZIZ = c1331730kl9.LIZLLL;
        c1331100kk8.LJFF(c1331730kl9.LIZ);
        c1331100kk8.LJFF = c1331730kl9.LIZIZ;
        c1331100kk8.LJIIIIZZ(c1331730kl9.LIZJ);
        c1331100kk8.LJIIIZ(c1331730kl9.LJFF);
        if (c1331730kl9.LJII == EnumC1203020hPY.OVERLAY_COLOR) {
            enumC1321320kUM = EnumC1321320kUM.OVERLAY_COLOR;
        } else {
            enumC1321320kUM = EnumC1321320kUM.BITMAP_ONLY;
        }
        c1331100kk8.LIZ = enumC1321320kUM;
        return c1331100kk8;
    }

    public static C1325700kbQ makeImageRequestBuilder(C1331510kkn c1331510kkn, Uri uri) {
        int i;
        int i2;
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uri:");
        sbLIZ.append(uri);
        C1330590kjJ.LJIIIIZZ(c1331510kkn.hashCode(), "FrescoImageLoaderImpl", "makeImageRequestBuilder", C2188811AlT.LIZIZ(sbLIZ));
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
        c1325700kbQLIZLLL.LJII = c1331510kkn.LJII;
        c1325700kbQLIZLLL.LJII(c1331510kkn.LJIIIIZZ);
        c1325700kbQLIZLLL.LJJIFFI = false;
        if (c1331510kkn.LJFF) {
            c1325700kbQLIZLLL.LJ = C1324670kZl.LIZJ;
        } else {
            c1325700kbQLIZLLL.LJ = C1324670kZl.LIZLLL;
        }
        EnumC714850S2h enumC714850S2h = c1331510kkn.LJJIIZ;
        if (enumC714850S2h == EnumC714850S2h.SMALL) {
            c1325700kbQLIZLLL.LJI = EnumC1325560kbC.SMALL;
        } else if (enumC714850S2h == EnumC714850S2h.CUSTOM) {
            c1325700kbQLIZLLL.LJI = EnumC1325560kbC.CUSTOM;
            String str = c1331510kkn.LJJIIZI;
            str.getClass();
            c1325700kbQLIZLLL.LJIJI = str;
        }
        c1325700kbQLIZLLL.LJJIIJZLJL = false;
        buildCropOptions(c1325700kbQLIZLLL, c1331510kkn);
        buildPostProcessor(c1325700kbQLIZLLL, c1331510kkn);
        buildBlurOptions(c1325700kbQLIZLLL, c1331510kkn);
        EnumC1331380kka enumC1331380kkaBuildPriority = buildPriority(c1331510kkn);
        c1325700kbQLIZLLL.LJFF = buildImageDecodeOptions(c1331510kkn);
        c1325700kbQLIZLLL.LJIIL = enumC1331380kkaBuildPriority;
        if (c1331510kkn.LJFF) {
            c1325700kbQLIZLLL.LJ = C1324670kZl.LIZJ;
        } else {
            c1325700kbQLIZLLL.LJ = C1324670kZl.LIZLLL;
        }
        if (c1331510kkn.LJIIIZ > 0 && c1331510kkn.LJIIJ > 0) {
            c1325700kbQLIZLLL.LIZJ = buildResizeOptions(c1331510kkn);
        }
        if (c1331510kkn.LJJLIIIJJI > 0 && (i2 = c1331510kkn.LJJLIIIJJIZ) > 0) {
            c1325700kbQLIZLLL.LJIIIIZZ(i2);
            c1325700kbQLIZLLL.LJIIIZ(c1331510kkn.LJJLIIIJJI);
        }
        int i4 = c1331510kkn.LJJJJL;
        if (i4 >= 0 && (i = c1331510kkn.LJJJJLL) >= 0) {
            c1325700kbQLIZLLL.LIZLLL = new C1318160kPG(c1331510kkn.LJJJLL, c1331510kkn.LJJJLIIL, i4, i, c1331510kkn.LJJJJZ, c1331510kkn.LJJJJZI);
        }
        c1325700kbQLIZLLL.LJJIJIIJIL = c1331510kkn.LJJLIIIJLJLI;
        c1325700kbQLIZLLL.LJJIJIL = c1331510kkn.LJJLIIIJLLLLLLLZ;
        c1325700kbQLIZLLL.LJJIJL = c1331510kkn.LJJLIIJ;
        c1325700kbQLIZLLL.LJIILL = c1331510kkn.LJJIZ;
        C1260120ite.LIZIZ(new ARunnableS120S0100000_20(c1331510kkn, 149));
        return c1325700kbQLIZLLL;
    }

    private void createBaseBitmapDataSubscriber(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY, C1331510kkn c1331510kkn, InterfaceC1331500kkm interfaceC1331500kkm) {
        int i = C2187451AjH.LIZ;
        C1330590kjJ.LJII(c1331510kkn.hashCode(), "FrescoImageLoaderImpl", "createBaseBitmapDataSubscriber");
        InterfaceC1331910klR interfaceC1331910klR = c1331510kkn.LJJIJL;
        C1330570kjH c1330570kjH = new C1330570kjH(c1331510kkn);
        c1330570kjH.LJFF(c1331510kkn.LJJIIJ, null);
        interfaceC1320200kSY.LIZJ(new C1331520kko(this, c1331510kkn, c1330570kjH, interfaceC1331500kkm, interfaceC1320200kSY, interfaceC1331910klR), this.mIOExecutor);
        C1331710kl7.LIZ.execute(new ARunnableS89S0200000_20(new C1331880klO(interfaceC1320200kSY), c1331510kkn, 231));
    }
}
