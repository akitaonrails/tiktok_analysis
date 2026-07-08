package com.lynx.tasm.behavior.render;

import X.C1289430jev;
import X.C1289620jfE;
import X.C1299120juY;
import X.C1310660kDA;
import X.C1311420kEO;
import X.C1311670kEn;
import X.C1311720kEs;
import X.C1311730kEt;
import X.C1311970kFH;
import X.C1311980kFI;
import X.C1313230kHJ;
import X.C1313440kHe;
import X.C1314310kJ3;
import X.C1315680kLG;
import X.C1316700kMu;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1311940kFE;
import X.InterfaceC1311950kFF;
import X.InterfaceC1312730kGV;
import X.InterfaceC1313090kH5;
import Y.ARunnableS31S0101000_20;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.renderscript.Matrix4f;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.mapbuffer.ReadableCompactArrayBuffer;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.TextLayout;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.PropBundle;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.list.container.UIListContainer;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import j27.s;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class PlatformRendererContext implements InterfaceC1311950kFF {
    public final WeakReference<C1310660kDA> LIZ;
    public final s LIZJ;
    public final C1289430jev LIZLLL;
    public long LJ;
    public TextLayout LJFF;
    public C1316700kMu LJIIIIZZ;
    public final HashMap<Integer, InterfaceC1311940kFE> LIZIZ = new HashMap<>();
    public boolean LJI = false;
    public final ConcurrentHashMap<Integer, Object> LJII = new ConcurrentHashMap<>();

    public float[] getRootViewLocationOnScreen() {
        C1310660kDA c1310660kDA;
        float[] fArr = {0.0f, 0.0f};
        WeakReference<C1310660kDA> weakReference = this.LIZ;
        if (weakReference != null && (c1310660kDA = weakReference.get()) != null) {
            c1310660kDA.getLocationOnScreen(new int[2]);
            fArr[0] = r2[0];
            fArr[1] = r2[1];
        }
        return fArr;
    }

    public float[] getScreenSize() {
        float[] fArr = {0.0f, 0.0f};
        s sVar = this.LIZJ;
        if (sVar != null) {
            DisplayMetrics displayMetricsLIZ = DisplayMetricsHolder.LIZ(sVar);
            fArr[0] = displayMetricsLIZ.widthPixels;
            fArr[1] = displayMetricsLIZ.heightPixels;
        }
        return fArr;
    }

    public native long nativeCreateEmbeddedViewContext(PlatformRendererContext platformRendererContext);

    public native void nativeDestroy(long j);

    public native void nativeGetDisplayListData(long j, int i, int[] iArr, int[] iArr2, float[] fArr);

    public native int[] nativeGetDisplayListLengths(long j, int i);

    private void finishTasmOperation(long j) {
        C1311720kEs c1311720kEsLJIILIIL;
        s sVar = this.LIZJ;
        if (sVar != null && (c1311720kEsLJIILIIL = sVar.LJIILIIL()) != null) {
            c1311720kEsLJIILIIL.LJJII();
        }
    }

    @Override // X.InterfaceC1311950kFF
    public final float[] LIZJ(int i) {
        C1316700kMu c1316700kMu = this.LJIIIIZZ;
        if (c1316700kMu != null) {
            return c1316700kMu.LIZ(i);
        }
        return new float[0];
    }

    public final C1315680kLG LIZLLL(int i) {
        C1310660kDA c1310660kDA = this.LIZ.get();
        if (c1310660kDA != null) {
            return c1310660kDA.peekImageAccordingToNodeIndex(i);
        }
        return null;
    }

    public void destroyImage(int i) {
        C1310660kDA c1310660kDA = this.LIZ.get();
        if (c1310660kDA != null) {
            c1310660kDA.obtainImageAccordingToNodeIndex(i);
        }
    }

    public void destroyPlatformRenderer(int i) {
        boolean z;
        C1311720kEs c1311720kEsLJIILIIL = this.LIZJ.LJIILIIL();
        if (c1311720kEsLJIILIIL != null && c1311720kEsLJIILIIL.LJIIZILJ(i) != null) {
            LynxBaseUI lynxBaseUILJIIZILJ = c1311720kEsLJIILIIL.LJIIZILJ(i);
            z = !(lynxBaseUILJIIZILJ.mParent instanceof LynxBaseUI);
            c1311720kEsLJIILIIL.LJII(-1, lynxBaseUILJIIZILJ.getSign());
        } else {
            z = false;
        }
        InterfaceC1311940kFE interfaceC1311940kFE = this.LIZIZ.get(Integer.valueOf(i));
        if (interfaceC1311940kFE != null) {
            if (z) {
                try {
                    View view = (View) interfaceC1311940kFE.getView().getParent();
                    if (view instanceof ViewGroup) {
                        C786410Ut5.LJJJLZIJ(interfaceC1311940kFE.getView(), (ViewGroup) view);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZIZ.remove(Integer.valueOf(i));
                    throw th;
                }
            }
            C1311970kFH renderer = interfaceC1311940kFE.getRenderer();
            if (renderer != null) {
                renderer.LIZLLL();
            }
        }
        this.LIZIZ.remove(Integer.valueOf(i));
    }

    public void destroyTextBundle(int i) {
        C1289620jfE.LIZJ(new ARunnableS31S0101000_20(i, this, 1));
    }

    public int getTagInfo(String str) {
        try {
            ShadowNode shadowNodeLJ = this.LIZLLL.LIZIZ(str).LJ();
            if (shadowNodeLJ != null) {
                if (shadowNodeLJ.LJIILL()) {
                    return 6;
                }
                return 4;
            }
            return 1;
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public void invalidatePlatformRenderer(int i) {
        InterfaceC1311940kFE interfaceC1311940kFE = this.LIZIZ.get(Integer.valueOf(i));
        if (interfaceC1311940kFE != null) {
            interfaceC1311940kFE.getView().invalidate();
        }
    }

    public void removePlatformRendererFromParent(int i) {
        C1311720kEs c1311720kEsLJIILIIL = this.LIZJ.LJIILIIL();
        if (c1311720kEsLJIILIIL != null && c1311720kEsLJIILIIL.LJIIZILJ(i) != null) {
            LynxBaseUI lynxBaseUILJIIZILJ = c1311720kEsLJIILIIL.LJIIZILJ(i);
            InterfaceC1313090kH5 interfaceC1313090kH5 = lynxBaseUILJIIZILJ.mParent;
            if (interfaceC1313090kH5 instanceof LynxBaseUI) {
                LynxBaseUI lynxBaseUI = (LynxBaseUI) interfaceC1313090kH5;
                if (lynxBaseUI == null) {
                    return;
                }
                c1311720kEsLJIILIIL.LJJIIJ(lynxBaseUI.getSign(), lynxBaseUILJIIZILJ.getSign());
                return;
            }
        }
        InterfaceC1311940kFE interfaceC1311940kFE = this.LIZIZ.get(Integer.valueOf(i));
        if (interfaceC1311940kFE != null) {
            View view = (View) interfaceC1311940kFE.getView().getParent();
            if (view instanceof ViewGroup) {
                C786410Ut5.LJJJLZIJ(interfaceC1311940kFE.getView(), (ViewGroup) view);
            }
        }
    }

    @Override // X.InterfaceC1311950kFF
    public final void LIZIZ(int i, ReadableCompactArrayBuffer readableCompactArrayBuffer) {
        if (this.LJIIIIZZ != null) {
            this.LJIIIIZZ.LIZJ(i, readableCompactArrayBuffer);
        }
    }

    public final float LJ(int i, boolean z) {
        Matrix animationMatrix;
        double dHypot;
        InterfaceC1311940kFE interfaceC1311940kFE = this.LIZIZ.get(Integer.valueOf(i));
        if (interfaceC1311940kFE != null && interfaceC1311940kFE.getView() != null) {
            View view = interfaceC1311940kFE.getView();
            if (Build.VERSION.SDK_INT >= 29 && (animationMatrix = view.getAnimationMatrix()) != null && !animationMatrix.isIdentity()) {
                animationMatrix.getValues(new float[9]);
                if (z) {
                    dHypot = Math.hypot(r1[0], r1[3]);
                } else {
                    dHypot = Math.hypot(r1[1], r1[4]);
                }
                return (float) dHypot;
            }
            if (z) {
                return view.getScaleX();
            }
            return view.getScaleY();
        }
        return 1.0f;
    }

    public void createPlatformRenderer(int i, int i2) {
        switch (i2) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C1311980kFI c1311980kFI = new C1311980kFI(this.LIZJ);
                C1311970kFH c1311970kFH = new C1311970kFH(this, i);
                c1311970kFH.LJI = c1311980kFI;
                c1311980kFI.setRenderer(c1311970kFH);
                this.LIZIZ.put(Integer.valueOf(i), c1311980kFI);
                c1311980kFI.invalidate();
                break;
            case 2:
                C1311720kEs c1311720kEsLJIILIIL = this.LIZJ.LJIILIIL();
                if (c1311720kEsLJIILIIL != null) {
                    c1311720kEsLJIILIIL.LIZ = i;
                    UIBody uIBody = this.LIZJ.LLJILJILJ;
                    HashMap<Integer, LynxBaseUI> map = c1311720kEsLJIILIIL.LJI;
                    if (map != null) {
                        map.put(Integer.valueOf(i), uIBody);
                    }
                }
                C1310660kDA c1310660kDA = this.LIZ.get();
                if (c1310660kDA != null) {
                    c1310660kDA.setWillNotDraw(false);
                    c1310660kDA.invalidate();
                    C1311970kFH c1311970kFHCreateRenderer = c1310660kDA.createRenderer(this, i);
                    c1311970kFHCreateRenderer.LJII = this.LIZJ.LLJILJILJ;
                    c1311970kFHCreateRenderer.LJI = c1310660kDA;
                    c1310660kDA.setRenderer(c1311970kFHCreateRenderer);
                    this.LIZIZ.put(Integer.valueOf(i), c1310660kDA);
                }
                break;
        }
    }

    public void insertListItemPaintingNode(int i, int i2) {
        C1311720kEs c1311720kEsLJIILIIL;
        s sVar = this.LIZJ;
        if (sVar != null && (c1311720kEsLJIILIIL = sVar.LJIILIIL()) != null) {
            LynxBaseUI lynxBaseUILJIIZILJ = c1311720kEsLJIILIIL.LJIIZILJ(i);
            LynxBaseUI lynxBaseUILJIIZILJ2 = c1311720kEsLJIILIIL.LJIIZILJ(i2);
            if ((lynxBaseUILJIIZILJ instanceof UIListContainer) && (lynxBaseUILJIIZILJ2 instanceof UIComponent)) {
                ((UIListContainer) lynxBaseUILJIIZILJ).LJJIJL(lynxBaseUILJIIZILJ2);
            }
        }
    }

    public void removeListItemPaintingNode(int i, int i2) {
        C1311720kEs c1311720kEsLJIILIIL;
        s sVar = this.LIZJ;
        if (sVar != null && (c1311720kEsLJIILIIL = sVar.LJIILIIL()) != null) {
            LynxBaseUI lynxBaseUILJIIZILJ = c1311720kEsLJIILIIL.LJIIZILJ(i);
            LynxBaseUI lynxBaseUILJIIZILJ2 = c1311720kEsLJIILIIL.LJIIZILJ(i2);
            if ((lynxBaseUILJIIZILJ instanceof UIListContainer) && (lynxBaseUILJIIZILJ2 instanceof UIComponent)) {
                ((UIGroup) lynxBaseUILJIIZILJ).removeView(lynxBaseUILJIIZILJ2);
            }
        }
    }

    public void updatePlatformExtraData(int i, Object obj) {
        InterfaceC1311940kFE interfaceC1311940kFE = this.LIZIZ.get(Integer.valueOf(i));
        if (interfaceC1311940kFE == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("host renderer not found for sign: ");
            sbLIZ.append(i);
            LynxLog.d("PlatformRendererContext", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        interfaceC1311940kFE.getRenderer();
    }

    public void updatePlatformRendererAttributes(int i, PropBundle propBundle) {
        C1311720kEs c1311720kEsLJIILIIL;
        ReadableMap props;
        ReadableArray eventHandlers;
        ReadableArray gestures;
        InterfaceC1311940kFE interfaceC1311940kFE = this.LIZIZ.get(Integer.valueOf(i));
        if (interfaceC1311940kFE == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("host renderer not found for sign: ");
            sbLIZ.append(i);
            LynxLog.d("PlatformRendererContext", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        s sVar = this.LIZJ;
        C1311730kEt c1311730kEt = null;
        if (sVar != null && (c1311720kEsLJIILIIL = sVar.LJIILIIL()) != null && c1311720kEsLJIILIIL.LJIIZILJ(i) != null) {
            if (propBundle != null) {
                props = propBundle.getProps();
                eventHandlers = propBundle.getEventHandlers();
            } else {
                props = null;
                eventHandlers = null;
            }
            Map<String, C1299120juY> mapLIZ = C1299120juY.LIZ(eventHandlers);
            if (propBundle != null) {
                gestures = propBundle.getGestures();
            } else {
                gestures = null;
            }
            Map<Integer, C1311420kEO> mapLIZ2 = C1311420kEO.LIZ(gestures);
            if (props != null) {
                c1311730kEt = new C1311730kEt(props);
            }
            c1311720kEsLJIILIIL.LJJIJL(i, false, c1311730kEt, mapLIZ, mapLIZ2);
        }
        C1311970kFH renderer = interfaceC1311940kFE.getRenderer();
        if (renderer != null) {
            renderer.LJI(propBundle);
        }
    }

    public void updateTextBundle(int i, long j) {
        this.LIZJ.getClass();
        InterfaceC1312730kGV interfaceC1312730kGVCreatePage = s.LLLILZ.createPage(j);
        if (interfaceC1312730kGVCreatePage != null) {
            this.LJII.put(Integer.valueOf(i), interfaceC1312730kGVCreatePage);
        }
    }

    public PlatformRendererContext(C1289430jev c1289430jev, s sVar, C1310660kDA c1310660kDA) {
        this.LJ = 0L;
        this.LJIIIIZZ = null;
        if (c1310660kDA != null) {
            this.LIZ = new WeakReference<>(c1310660kDA);
        }
        this.LIZJ = sVar;
        this.LIZLLL = c1289430jev;
        this.LJ = nativeCreateEmbeddedViewContext(this);
        if (sVar != null && sVar.LJIJJLI()) {
            this.LJIIIIZZ = new C1316700kMu(sVar);
            this.LJFF = new TextLayout(this);
        }
    }

    public void createPlatformExtendedRenderer(int i, String str, PropBundle propBundle) {
        ReadableMap props;
        ReadableArray eventHandlers;
        InterfaceC1311940kFE interfaceC1311940kFELIZLLL;
        C1289430jev c1289430jev = this.LIZLLL;
        if (c1289430jev != null) {
            C1311670kEn c1311670kEnLIZIZ = c1289430jev.LIZIZ(str);
            if (c1311670kEnLIZIZ.LJ && (interfaceC1311940kFELIZLLL = c1311670kEnLIZIZ.LIZLLL(this.LIZJ)) != null) {
                C1311970kFH c1311970kFHCreateRenderer = interfaceC1311940kFELIZLLL.createRenderer(this, i);
                c1311970kFHCreateRenderer.LJI = interfaceC1311940kFELIZLLL;
                interfaceC1311940kFELIZLLL.setRenderer(c1311970kFHCreateRenderer);
                this.LIZIZ.put(Integer.valueOf(i), interfaceC1311940kFELIZLLL);
                interfaceC1311940kFELIZLLL.getView().invalidate();
                c1311970kFHCreateRenderer.LJI(propBundle);
                return;
            }
        }
        C1311720kEs c1311720kEsLJIILIIL = this.LIZJ.LJIILIIL();
        if (c1311720kEsLJIILIIL != null) {
            ReadableArray gestures = null;
            if (propBundle != null) {
                props = propBundle.getProps();
                eventHandlers = propBundle.getEventHandlers();
                gestures = propBundle.getGestures();
            } else {
                props = null;
                eventHandlers = null;
            }
            c1311720kEsLJIILIIL.LJFF(i, str, props, null, eventHandlers, false, i, gestures);
            LynxUI<ViewGroup> lynxUI = (LynxUI) c1311720kEsLJIILIIL.LJIIZILJ(i);
            if (lynxUI != null) {
                T t = lynxUI.mView;
                if (t instanceof InterfaceC1311940kFE) {
                    InterfaceC1311940kFE interfaceC1311940kFE = (InterfaceC1311940kFE) t;
                    C1311970kFH c1311970kFHCreateRenderer2 = interfaceC1311940kFE.createRenderer(this, i);
                    c1311970kFHCreateRenderer2.LJII = lynxUI;
                    c1311970kFHCreateRenderer2.LJI = interfaceC1311940kFE;
                    interfaceC1311940kFE.setRenderer(c1311970kFHCreateRenderer2);
                    this.LIZIZ.put(Integer.valueOf(i), interfaceC1311940kFE);
                    interfaceC1311940kFE.getView().setWillNotDraw(false);
                    if (interfaceC1311940kFE.getView() instanceof ViewGroup) {
                        ((ViewGroup) interfaceC1311940kFE.getView()).setClipChildren(false);
                    }
                    interfaceC1311940kFE.getView().invalidate();
                    c1311970kFHCreateRenderer2.LJI(propBundle);
                    return;
                }
            }
            if (c1311720kEsLJIILIIL.LJIIZILJ(i) != null) {
                c1311720kEsLJIILIIL.LJII(-1, i);
            }
        }
        C1311980kFI c1311980kFI = new C1311980kFI(this.LIZJ);
        C1311970kFH c1311970kFH = new C1311970kFH(this, i);
        c1311970kFH.LJI = c1311980kFI;
        c1311980kFI.setRenderer(c1311970kFH);
        this.LIZIZ.put(Integer.valueOf(i), c1311980kFI);
        c1311980kFI.invalidate();
    }

    public void finishLayoutOperation(int i, long j, boolean z) {
        C1311720kEs c1311720kEsLJIILIIL;
        s sVar = this.LIZJ;
        if (sVar != null && (c1311720kEsLJIILIIL = sVar.LJIILIIL()) != null) {
            c1311720kEsLJIILIIL.LJJI(i, j);
        }
    }

    public void insertPlatformRenderer(int i, int i2, int i3) {
        C1311720kEs c1311720kEsLJIILIIL = this.LIZJ.LJIILIIL();
        if (c1311720kEsLJIILIIL != null && c1311720kEsLJIILIIL.LJIIZILJ(i) != null && c1311720kEsLJIILIIL.LJIIZILJ(i2) != null) {
            c1311720kEsLJIILIIL.LJIJI(i, i2, i3);
            return;
        }
        InterfaceC1311940kFE interfaceC1311940kFE = this.LIZIZ.get(Integer.valueOf(i));
        InterfaceC1311940kFE interfaceC1311940kFE2 = this.LIZIZ.get(Integer.valueOf(i2));
        if (interfaceC1311940kFE == null || interfaceC1311940kFE2 == null || !(interfaceC1311940kFE.getView() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) interfaceC1311940kFE.getView();
        View view = interfaceC1311940kFE2.getView();
        int childCount = viewGroup.getChildCount();
        if (i3 != -1 && i3 < childCount) {
            viewGroup.addView(view, i3);
        } else {
            viewGroup.addView(view);
        }
    }

    public void updatePlatformRendererSubtreeProperties(int i, ByteBuffer byteBuffer, int i2) {
        InterfaceC1311940kFE interfaceC1311940kFE;
        InterfaceC1311940kFE interfaceC1311940kFE2 = this.LIZIZ.get(Integer.valueOf(i));
        if (interfaceC1311940kFE2 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("host renderer not found for sign: ");
            sbLIZ.append(i);
            LynxLog.d("PlatformRendererContext", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C1311970kFH renderer = interfaceC1311940kFE2.getRenderer();
        if (renderer != null) {
            byteBuffer.order(ByteOrder.nativeOrder());
            if (i2 > 0 && (interfaceC1311940kFE = renderer.LJI) != null && interfaceC1311940kFE.getView() != null) {
                int i3 = 0;
                do {
                    byteBuffer.position(i3 * 68);
                    int i4 = byteBuffer.getInt();
                    if (i4 == 0) {
                        float[] fArr = new float[16];
                        int i5 = 0;
                        do {
                            fArr[i5] = byteBuffer.getFloat();
                            i5++;
                        } while (i5 < 16);
                        View view = renderer.LJI.getView();
                        if (Build.VERSION.SDK_INT >= 29) {
                            Matrix matrix = new Matrix();
                            matrix.setValues(new float[]{fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]});
                            view.setAnimationMatrix(matrix);
                        } else {
                            C1313230kHJ c1313230kHJ = renderer.LJIIIIZZ;
                            if (c1313230kHJ == null) {
                                renderer.LJIIIIZZ = new C1313230kHJ();
                            } else {
                                c1313230kHJ.LIZJ.clear();
                            }
                            Matrix4f matrix4f = new Matrix4f(fArr);
                            C1313230kHJ c1313230kHJ2 = renderer.LJIIIIZZ;
                            C1314310kJ3 c1314310kJ3 = new C1314310kJ3();
                            c1314310kJ3.LIZ();
                            C1313440kHe.LIZ(C1313230kHJ.LIZIZ(matrix4f.getArray()), c1314310kJ3);
                            c1313230kHJ2.LJIILIIL(c1314310kJ3);
                            C786410Ut5.Jc(view, renderer.LJIIIIZZ.LJIIIZ());
                            C786410Ut5.ed(view, renderer.LJIIIIZZ.LJIIJ());
                            view.setTranslationZ(renderer.LJIIIIZZ.LJIIJJI());
                            C786410Ut5.Ab(view, renderer.LJIIIIZZ.LIZJ());
                            C786410Ut5.Hb(view, renderer.LJIIIIZZ.LIZLLL());
                            C786410Ut5.Ib(view, renderer.LJIIIIZZ.LJ());
                            C786410Ut5.Ob(view, renderer.LJIIIIZZ.LJFF());
                            C786410Ut5.pc(view, renderer.LJIIIIZZ.LJI());
                        }
                    } else if (i4 == 1) {
                        C786410Ut5.T4(renderer.LJI.getView(), byteBuffer.getFloat());
                    }
                    i3++;
                } while (i3 < i2);
            }
        }
    }

    public void createImage(int i, String str, int i2, int i3, int i4) {
        C1315680kLG c1315680kLG = new C1315680kLG(this.LIZJ);
        c1315680kLG.LLLJL = i;
        c1315680kLG.LLLJIL = i4;
        c1315680kLG.LJIJJ(str);
        c1315680kLG.LJIIJ(i2, i3, 0, 0, 0, 0);
        C1310660kDA c1310660kDA = this.LIZ.get();
        if (c1310660kDA != null) {
            c1310660kDA.registerImageAccordingToNodeIndex(i, c1315680kLG);
        }
        c1315680kLG.LJIIJJI();
    }

    @Override // X.InterfaceC1311950kFF
    public final float[] LIZ(int i, float f, int i2, float f2, int i3, float[] fArr) {
        if (this.LJIIIIZZ != null) {
            return this.LJIIIIZZ.LJ(i, f, i2, f2, i3, fArr);
        }
        return new float[]{0.0f, 0.0f};
    }

    public void updateContentOffsetForListContainer(int i, float f, float f2, float f3, boolean z, boolean z2) {
        C1311720kEs c1311720kEsLJIILIIL;
        s sVar = this.LIZJ;
        if (sVar != null && (c1311720kEsLJIILIIL = sVar.LJIILIIL()) != null) {
            LynxBaseUI lynxBaseUILJIIZILJ = c1311720kEsLJIILIIL.LJIIZILJ(i);
            if (lynxBaseUILJIIZILJ instanceof UIListContainer) {
                ((UIListContainer) lynxBaseUILJIIZILJ).LJJJIL(f, f2, f3);
            }
        }
    }

    public void updatePlatformRendererFrame(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7) {
        InterfaceC1311940kFE interfaceC1311940kFE = this.LIZIZ.get(Integer.valueOf(i));
        if (interfaceC1311940kFE == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("host renderer not found for sign: ");
            sbLIZ.append(i);
            LynxLog.d("PlatformRendererContext", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C1311970kFH renderer = interfaceC1311940kFE.getRenderer();
        renderer.LIZ.set(i2 + i6, i3 + i7, i2 + i4 + i6, i3 + i5 + i7);
        renderer.LIZIZ.set(i6, i7);
        if (z) {
            renderer.LJI.getView().setClipBounds(new Rect(0, 0, renderer.LIZ.width(), renderer.LIZ.height()));
        } else {
            View view = renderer.LJI.getView();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            view.setClipBounds(null);
        }
        C1311720kEs c1311720kEsLJIILIIL = this.LIZJ.LJIILIIL();
        if (c1311720kEsLJIILIIL != null && c1311720kEsLJIILIIL.LJIIZILJ(i) != null) {
            LynxBaseUI lynxBaseUILJIIZILJ = c1311720kEsLJIILIIL.LJIIZILJ(i);
            c1311720kEsLJIILIIL.LJJIJIL(i, i2, i3, i4, i5, lynxBaseUILJIIZILJ.mPaddingLeft, lynxBaseUILJIIZILJ.mPaddingTop, lynxBaseUILJIIZILJ.mPaddingRight, lynxBaseUILJIIZILJ.mPaddingBottom, lynxBaseUILJIIZILJ.mMarginLeft, lynxBaseUILJIIZILJ.mMarginTop, lynxBaseUILJIIZILJ.mMarginRight, lynxBaseUILJIIZILJ.mMarginBottom, lynxBaseUILJIIZILJ.mBorderLeftWidth, lynxBaseUILJIIZILJ.mBorderTopWidth, lynxBaseUILJIIZILJ.mBorderRightWidth, lynxBaseUILJIIZILJ.mBorderBottomWidth, null, null, 0.0f, i);
        }
        interfaceC1311940kFE.getView().requestLayout();
        interfaceC1311940kFE.getRenderer().LIZJ(3);
    }
}
