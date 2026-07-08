package com.ss.android.ugc.aweme.ecommerce.ui;

import X.C00J7;
import X.C1066210dqt;
import X.C1254504vX;
import X.C1315710kLJ;
import X.C1315960kLi;
import X.C1322090kVb;
import X.C1322270kVt;
import X.C1323300kXY;
import X.C1326840kdG;
import X.C1326860kdI;
import X.C2552109zL;
import X.C770702zh;
import X.EnumC1323290kXX;
import X.EnumC1323330kXb;
import X.EnumC1331380kka;
import X.InterfaceC1312540kGC;
import X.InterfaceC1316360kMM;
import X.InterfaceC1316370kMN;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.ui.image.UIImage;
import com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeConfigModel;
import com.ss.android.ugc.aweme.ecommerce.ui.EcomUIImage;
import j27.s;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class EcomUIImage extends UIImage<C1315710kLJ> {
    public static final Field LLJILLL;
    public static final Field LLJJ;
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final EnumC1331380kka LLILZ;
    public HashMap<String, Object> LLILZIL;
    public String LLILZLL;
    public HashMap<String, Object> LLIZ;
    public String LLIZLLLIL;
    public boolean LLJ;
    public String LLJI;
    public C1326860kdI LLJIJIL;
    public final HashMap<String, Long> LLJILJIL;
    public final C1323300kXY LLJILJILJ;

    static {
        Field declaredField;
        Field field = null;
        try {
            declaredField = C1315710kLJ.class.getDeclaredField("mLoaderCallback");
            declaredField.setAccessible(true);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            declaredField = null;
        }
        LLJILLL = declaredField;
        try {
            Field declaredField2 = C1315710kLJ.class.getDeclaredField("mCurImageRequest");
            declaredField2.setAccessible(true);
            field = declaredField2;
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw e2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        LLJJ = field;
    }

    public final void LJJIIZI() {
        C1323300kXY c1323300kXY = this.LLJILJILJ;
        c1323300kXY.getClass();
        c1323300kXY.LIZ = EnumC1323290kXX.LOADING;
        this.LLJILJIL.put(this.LLJI, Long.valueOf(System.currentTimeMillis()));
    }

    public final void LJJIJ() {
        String str = this.LLIZLLLIL;
        if (str == null || !this.LLJ) {
            return;
        }
        LJJIJIIJI(str);
        C1326860kdI c1326860kdILIZ = C1326840kdG.LIZ(str, false);
        String str2 = c1326860kdILIZ.LIZ;
        this.LLJI = str2;
        this.LLJIJIL = c1326860kdILIZ;
        if (!Intrinsics.LJFF(str2, str)) {
            LJJIJIIJI(this.LLJI);
        }
        super.setSource(this.LLJI);
        C1323300kXY c1323300kXY = this.LLJILJILJ;
        c1323300kXY.getClass();
        c1323300kXY.LIZ = EnumC1323290kXX.INIT;
        c1323300kXY.LIZLLL = EnumC1323330kXb.INIT;
        c1323300kXY.LIZIZ = 0;
        c1323300kXY.LIZJ = 0;
        LJJIIZI();
        this.LLJ = false;
    }

    @Override // com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        if (!this.LLILLL) {
            LJJIJ();
        } else if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        } else {
            LJJIJ();
        }
        super.onPropsUpdated();
    }

    public final void LJJIJIIJI(String str) {
        if (str == null) {
            return;
        }
        String str2 = this.LL;
        if (str2 != null) {
            C1066210dqt.LIZLLL(str, "lynx", new Pair("page_name", str2));
        }
        String str3 = this.LLILLJJLI;
        if (str3 != null) {
            C1066210dqt.LIZLLL(str, "lynx", new Pair("template_path", str3));
        }
        C1066210dqt.LIZJ(str, "lynx", this.LLIZ);
        C1066210dqt.LIZJ(str, "lynx", this.LLILZIL);
    }

    @Override // com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.LynxUI
    public final C1315710kLJ createView(Context context) throws IllegalAccessException {
        Object obj;
        final C1315710kLJ c1315710kLJCreateView = super.createView(context);
        Field field = LLJILLL;
        final C1315960kLi c1315960kLi = null;
        if (field != null) {
            obj = field.get(c1315710kLJCreateView);
        } else {
            obj = null;
        }
        if (obj instanceof C1315960kLi) {
            c1315960kLi = (C1315960kLi) obj;
        }
        c1315710kLJCreateView.setImageLoaderCallback(new C1315960kLi() { // from class: X.0kXV
            @Override // X.C1315960kLi
            public final boolean LIZ() {
                C1315960kLi c1315960kLi2 = c1315960kLi;
                if (c1315960kLi2 != null) {
                    return c1315960kLi2.LIZ();
                }
                return false;
            }

            @Override // X.C1315960kLi
            public final void LJFF() {
                EcomUIImage ecomUIImage = this.LIZ;
                if (ecomUIImage.LLJILJIL.containsKey(ecomUIImage.LLJI)) {
                    this.LIZ.LJJIIZI();
                }
            }

            @Override // X.C1315960kLi
            public final void LIZIZ(int i, int i2) {
                C1315960kLi c1315960kLi2 = c1315960kLi;
                if (c1315960kLi2 != null) {
                    c1315960kLi2.LIZIZ(i, i2);
                }
            }

            @Override // X.C1315960kLi
            public final void LJ(int i, int i2) throws IllegalAccessException {
                Object obj2;
                C1325710kbR c1325710kbR;
                EcomImageAdaptSizeConfigModel ecomImageAdaptSizeConfigModel;
                C1323300kXY c1323300kXY = this.LIZ.LLJILJILJ;
                c1323300kXY.getClass();
                c1323300kXY.LIZ = EnumC1323290kXX.SUCCESS;
                C1315960kLi c1315960kLi2 = c1315960kLi;
                if (c1315960kLi2 != null) {
                    c1315960kLi2.LJ(i, i2);
                }
                EcomUIImage ecomUIImage = this.LIZ;
                String str = ecomUIImage.LLJI;
                if (str == null) {
                    return;
                }
                try {
                    Long lRemove = ecomUIImage.LLJILJIL.remove(str);
                    if (lRemove != null) {
                        EcomUIImage ecomUIImage2 = this.LIZ;
                        C1315710kLJ c1315710kLJ = c1315710kLJCreateView;
                        long jLongValue = lRemove.longValue();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ecomUIImage2.getClass();
                        Field field2 = EcomUIImage.LLJJ;
                        if (field2 != null) {
                            obj2 = field2.get(c1315710kLJ);
                        } else {
                            obj2 = null;
                        }
                        if (obj2 instanceof C1325710kbR) {
                            c1325710kbR = (C1325710kbR) obj2;
                        } else {
                            c1325710kbR = null;
                        }
                        long j = jCurrentTimeMillis - jLongValue;
                        int iLIZIZ = ecomUIImage2.LLJILJILJ.LIZIZ();
                        HashMap<String, Object> map = ecomUIImage2.LLILZIL;
                        C1326860kdI c1326860kdI = ecomUIImage2.LLJIJIL;
                        boolean z = false;
                        if (c1326860kdI != null && (ecomImageAdaptSizeConfigModel = c1326860kdI.LIZJ) != null && C20158413uA.LIZ(ecomImageAdaptSizeConfigModel, null, false) != null) {
                            z = true;
                        }
                        C1326230kcH.LJFF(false, true, c1325710kbR, j, iLIZIZ, map, null, null, null, Boolean.valueOf(z));
                    }
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }

            @Override // X.C1315960kLi
            public final void LIZJ(int i, int i2, String str) throws IllegalAccessException {
                Object obj2;
                C1325710kbR c1325710kbR;
                EcomImageAdaptSizeConfigModel ecomImageAdaptSizeConfigModel;
                C1323300kXY c1323300kXY = this.LIZ.LLJILJILJ;
                c1323300kXY.getClass();
                c1323300kXY.LIZ = EnumC1323290kXX.FAIL;
                EcomUIImage ecomUIImage = this.LIZ;
                boolean z = true;
                if (ecomUIImage.LLJILJILJ.LIZ()) {
                    ecomUIImage.LJJIIZI();
                    ((C1315710kLJ) ecomUIImage.mView).markDirty();
                    ecomUIImage.renderIfNeeded();
                    return;
                }
                C1315960kLi c1315960kLi2 = c1315960kLi;
                if (c1315960kLi2 != null) {
                    c1315960kLi2.LIZJ(i, i2, str);
                }
                EcomUIImage ecomUIImage2 = this.LIZ;
                String str2 = ecomUIImage2.LLJI;
                if (str2 == null) {
                    return;
                }
                try {
                    Long lRemove = ecomUIImage2.LLJILJIL.remove(str2);
                    if (lRemove != null) {
                        EcomUIImage ecomUIImage3 = this.LIZ;
                        C1315710kLJ c1315710kLJ = c1315710kLJCreateView;
                        long jLongValue = lRemove.longValue();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ecomUIImage3.getClass();
                        Field field2 = EcomUIImage.LLJJ;
                        if (field2 != null) {
                            obj2 = field2.get(c1315710kLJ);
                        } else {
                            obj2 = null;
                        }
                        if (obj2 instanceof C1325710kbR) {
                            c1325710kbR = (C1325710kbR) obj2;
                        } else {
                            c1325710kbR = null;
                        }
                        long j = jCurrentTimeMillis - jLongValue;
                        int iLIZIZ = ecomUIImage3.LLJILJILJ.LIZIZ();
                        HashMap<String, Object> map = ecomUIImage3.LLILZIL;
                        Integer numValueOf = Integer.valueOf(i);
                        Integer numValueOf2 = Integer.valueOf(i2);
                        C1326860kdI c1326860kdI = ecomUIImage3.LLJIJIL;
                        if (c1326860kdI == null || (ecomImageAdaptSizeConfigModel = c1326860kdI.LIZJ) == null || C20158413uA.LIZ(ecomImageAdaptSizeConfigModel, null, false) == null) {
                            z = false;
                        }
                        C1326230kcH.LJFF(false, false, c1325710kbR, j, iLIZIZ, map, str, numValueOf, numValueOf2, Boolean.valueOf(z));
                    }
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        });
        Set<String> set = C1254504vX.LIZ;
        String str = this.LL;
        if (str != null) {
            Set<String> set2 = C1254504vX.LIZ;
            if (!set2.isEmpty() && set2.contains(str)) {
                setSimpleCacheKey(true);
            }
        }
        if (this.LLILZ != null) {
            c1315710kLJCreateView.setImageRequestBuilderHook(new InterfaceC1316370kMN() { // from class: X.0kXU
                @Override // X.InterfaceC1316370kMN
                public final C1325700kbQ LIZ(C1325700kbQ c1325700kbQ) {
                    c1325700kbQ.LJIIL = this.LIZ.LLILZ;
                    return c1325700kbQ;
                }
            });
        }
        return c1315710kLJCreateView;
    }

    @InterfaceC1312540kGC(name = "func-params")
    public final void setFuncParams(ReadableMap readableMap) {
        HashMap<String, Object> mapAsHashMap;
        if (readableMap != null) {
            mapAsHashMap = readableMap.asHashMap();
        } else {
            mapAsHashMap = null;
        }
        this.LLIZ = mapAsHashMap;
    }

    @Override // com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.image.AbsUIImage
    public final void setSource(String str) {
        InterfaceC1316360kMM hierarchy;
        if (C770702zh.LIZIZ(str) && !Intrinsics.LJFF(this.LLIZLLLIL, str)) {
            this.LLIZLLLIL = str;
            if (C2552109zL.LIZ) {
                C1322090kVb c1322090kVb = (C1322090kVb) this.mView;
                if (c1322090kVb != null) {
                    hierarchy = c1322090kVb.getHierarchy();
                } else {
                    hierarchy = null;
                }
                C1322270kVt.LIZIZ(str, hierarchy);
            }
            this.LLJ = true;
        }
    }

    @InterfaceC1312540kGC(name = "track-params")
    public final void setTrackParams(ReadableMap readableMap) {
        HashMap<String, Object> mapAsHashMap;
        Object obj;
        String string = null;
        if (readableMap != null) {
            mapAsHashMap = readableMap.asHashMap();
        } else {
            mapAsHashMap = null;
        }
        this.LLILZIL = mapAsHashMap;
        if (mapAsHashMap != null && (obj = mapAsHashMap.get("data_from")) != null) {
            string = obj.toString();
        }
        String str = this.LLILZLL;
        this.LLILZLL = string;
        String str2 = this.LLJI;
        if (str2 != null) {
            C1066210dqt.LIZJ(str2, "lynx", mapAsHashMap);
        }
        if (C00J7.LIZ.enable == 1 && Intrinsics.LJFF(str, "prefetch_cache") && string != null && !Intrinsics.LJFF(string, "prefetch_cache")) {
            LJJIIZI();
            ((C1315710kLJ) this.mView).markDirty();
        }
    }

    @Override // com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }

    public EcomUIImage(s sVar, String str, String str2, boolean z, EnumC1331380kka enumC1331380kka) {
        super(sVar);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = enumC1331380kka;
        this.LLJILJIL = new HashMap<>();
        this.LLJILJILJ = new C1323300kXY();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        if (this.LLILLL && (getWidth() <= 0 || getHeight() <= 0)) {
            LJJIJ();
            super.onPropsUpdated();
        }
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
