package j27;

import X.AbstractC1299950jvt;
import X.AbstractC1299960jvu;
import X.AbstractC1301120jxm;
import X.AbstractC1301590jyX;
import X.C1285920jZG;
import X.C1289620jfE;
import X.C1298340jtI;
import X.C1298720jtu;
import X.C1299220jui;
import X.C1301130jxn;
import X.C1301160jxq;
import X.C1309670kBZ;
import X.C1309700kBc;
import X.C1309720kBe;
import X.C1309770kBj;
import X.C1309780kBk;
import X.C1310290kCZ;
import X.C1310360kCg;
import X.C1310660kDA;
import X.C1311380kEK;
import X.C1311720kEs;
import X.C1311770kEx;
import X.C1311860kF6;
import X.C1320440kSw;
import X.C2188811AlT;
import X.EnumC1299430jv3;
import X.InterfaceC1294040jmM;
import X.InterfaceC1298330jtH;
import X.InterfaceC1299990jvx;
import X.InterfaceC1309730kBf;
import X.InterfaceC1311800kF0;
import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.jsbridge.h;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.LynxUIRenderer;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.LynxLayoutProxy;
import com.lynx.tasm.performance.PerformanceController;
import com.lynx.tasm.service.ILynxTextService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public abstract class s extends o implements InterfaceC1298330jtH {
    public static ILynxTextService LLLILZ = null;
    public static boolean LLLILZJ = true;
    public InterfaceC1294040jmM LLILLL;
    public InterfaceC1294040jmM LLILZ;
    public JavaOnlyMap LLILZIL;
    public final Map<String, ReadableMap> LLILZLL;
    public C1298720jtu LLIZ;
    public C1311380kEK LLIZLLLIL;
    public C1311860kF6 LLJ;
    public WeakReference<JSProxy> LLJI;
    public WeakReference<PerformanceController> LLJIJIL;
    public WeakReference<LynxLayoutProxy> LLJILJIL;
    public UIBody LLJILJILJ;
    public Map<String, C1301160jxq> LLJILLL;
    public WeakReference<C1311720kEs> LLJJ;
    public WeakReference<C1298340jtI> LLJJI;
    public String LLJJIII;
    public C1309780kBk LLJJIJI;
    public WeakReference<C1310660kDA> LLJJIJIIJIL;
    public WeakReference<C1311770kEx> LLJJIJIL;
    public final DisplayMetrics LLJJJ;
    public C1299220jui LLJJJIL;
    public AbstractC1301120jxm LLJJJJ;
    public List<InterfaceC1311800kF0> LLJJJJJIL;
    public C1309670kBZ LLJJJJLIIL;
    public InterfaceC1299990jvx LLJJL;
    public EnumC1299430jv3 LLJJLIIIJLLLLLLLZ;
    public Map<String, Object> LLJL;
    public boolean LLJLIL;
    public int LLJLILLLLZIIL;
    public boolean LLJLL;
    public Map<String, String> LLJLLIL;
    public Object LLJLLL;
    public boolean LLJZ;
    public C1320440kSw LLJZIJLIL;
    public AbstractC1299960jvu LLL;
    public AbstractC1301590jyX LLLF;
    public AbstractC1299950jvt LLLFF;
    public final Map<String, h> LLLFFI;
    public Float LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public C1310290kCZ LLLIIII;
    public int LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public String LLLIL;

    public void LJIILLIIL(LynxError lynxError) {
    }

    public abstract void handleException(Exception exc);

    public final void LIZIZ() {
        C1310660kDA c1310660kDALJIILL;
        InterfaceC1309730kBf lynxUIRendererInternal;
        if (this.LLIZLLLIL == null && (c1310660kDALJIILL = LJIILL()) != null && (lynxUIRendererInternal = c1310660kDALJIILL.getLynxUIRendererInternal()) != null && (lynxUIRendererInternal instanceof LynxUIRenderer)) {
            ((LynxUIRenderer) lynxUIRendererInternal).LIZ();
        }
    }

    public final boolean LJI() {
        C1310290kCZ c1310290kCZ = this.LLLIIII;
        if (c1310290kCZ != null) {
            return c1310290kCZ.LIZJ;
        }
        return false;
    }

    public final boolean LJII() {
        C1310290kCZ c1310290kCZ = this.LLLIIII;
        if (c1310290kCZ != null) {
            return c1310290kCZ.LJJIFFI;
        }
        return true;
    }

    public final h LJIIIIZZ() {
        return (h) ((HashMap) this.LLLFFI).get("LynxKryptonModule");
    }

    public final C1320440kSw LJIIIZ() {
        if (this.LLJZIJLIL == null) {
            this.LLJZIJLIL = new C1320440kSw(this);
        }
        return this.LLJZIJLIL;
    }

    public final C1298340jtI LJIIJJI() {
        WeakReference<C1298340jtI> weakReference = this.LLJJI;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final C1310360kCg LJIIL() {
        UIBody uIBody = this.LLJILJILJ;
        if (uIBody != null) {
            return uIBody.LLILZIL;
        }
        return null;
    }

    public final C1311720kEs LJIILIIL() {
        return this.LLJJ.get();
    }

    public final C1310660kDA LJIILL() {
        WeakReference<C1310660kDA> weakReference = this.LLJJIJIIJIL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void LJIIZILJ() {
        this.LLJJJJLIIL = new C1309670kBZ();
        C1311720kEs c1311720kEs = this.LLJJ.get();
        if (c1311720kEs != null) {
            C1309670kBZ c1309670kBZ = this.LLJJJJLIIL;
            UIBody uIBody = c1311720kEs.LIZIZ;
            c1309670kBZ.getClass();
            c1309670kBZ.LIZ = new WeakReference<>(uIBody);
        }
        WeakReference weakReference = new WeakReference(this);
        C1309670kBZ c1309670kBZ2 = this.LLJJJJLIIL;
        c1309670kBZ2.LJJII = new C1309700kBc(weakReference);
        c1309670kBZ2.LJIIJJI(this);
    }

    public boolean LJIJ() {
        C1310290kCZ c1310290kCZ = this.LLLIIII;
        if (c1310290kCZ != null) {
            return c1310290kCZ.LJ;
        }
        return false;
    }

    public final boolean LJIJI() {
        return (this.LLLIIIIL & 1) > 0;
    }

    public final boolean LJIJJ() {
        return (this.LLLIIIIL & 8) > 0;
    }

    public final boolean LJIJJLI() {
        return (this.LLLIIIIL & 12) > 0;
    }

    public final void LJJ() {
        C1311380kEK c1311380kEK = this.LLIZLLLIL;
        if (c1311380kEK != null) {
            c1311380kEK.LJIJ = true;
            if (c1311380kEK.LJII.isEmpty()) {
                return;
            }
            c1311380kEK.LJ(8);
        }
    }

    public final void LJJII() {
        WeakReference<C1298340jtI> weakReference;
        C1298340jtI c1298340jtI;
        synchronized (this.LLILZLL) {
            try {
                ((HashMap) this.LLILZLL).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1311380kEK c1311380kEK = this.LLIZLLLIL;
        if (c1311380kEK != null) {
            c1311380kEK.LIZJ = null;
            c1311380kEK.LJIIIIZZ = null;
            c1311380kEK.LJIIIZ.clear();
        }
        C1309670kBZ c1309670kBZ = this.LLJJJJLIIL;
        if (c1309670kBZ != null) {
            C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(c1309670kBZ, 61));
        }
        C1310290kCZ c1310290kCZ = this.LLLIIII;
        if (c1310290kCZ == null || !c1310290kCZ.LJJIJ || (weakReference = this.LLJJI) == null || (c1298340jtI = weakReference.get()) == null) {
            return;
        }
        C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(c1298340jtI, 211));
    }

    public final boolean LIZLLL() {
        return !LJIJI();
    }

    public final LynxView LJIILJJIL() {
        C1310660kDA c1310660kDALJIILL = LJIILL();
        if (c1310660kDALJIILL instanceof LynxView) {
            return (LynxView) c1310660kDALJIILL;
        }
        if (c1310660kDALJIILL instanceof C1309770kBj) {
            return ((C1309770kBj) c1310660kDALJIILL).getRootView();
        }
        return null;
    }

    public final LynxBaseUI LJ(int i) {
        C1311720kEs c1311720kEs = this.LLJJ.get();
        if (c1311720kEs != null) {
            return c1311720kEs.LJIIZILJ(i);
        }
        return null;
    }

    public final ShadowNode LJFF(int i) {
        C1311770kEx c1311770kEx = this.LLJJIJIL.get();
        if (c1311770kEx != null) {
            return c1311770kEx.LJI.LIZ(i);
        }
        return null;
    }

    public final C1301160jxq LJIIJ(String str) {
        for (String str2 : str.split(",")) {
            String strLIZLLL = C1301130jxn.LIZLLL(str2);
            if (!TextUtils.isEmpty(strLIZLLL)) {
                synchronized (C1301130jxn.class) {
                    try {
                        if (this.LLJILLL == null) {
                            this.LLJILLL = new HashMap();
                        }
                        C1301160jxq c1301160jxq = this.LLJILLL.get(strLIZLLL);
                        if (c1301160jxq == null) {
                            C1301160jxq c1301160jxqLIZIZ = C1301130jxn.LIZIZ(this, strLIZLLL);
                            if (c1301160jxqLIZIZ != null) {
                                this.LLJILLL.put(strLIZLLL, c1301160jxqLIZIZ);
                                return c1301160jxqLIZIZ;
                            }
                        } else {
                            return c1301160jxq;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    public final void LJIL(boolean z) {
        this.LLLIIIL = z;
        if (!z && LJIILL() != null) {
            LJIILL().clearNodeIndexImageMap();
            LJIILL().markNeedRemoveExistingViews();
            LJIILL().removeExistingViews();
        }
    }

    public final void LJJIIJ(C1310660kDA c1310660kDA) {
        boolean z;
        if (c1310660kDA != null) {
            z = true;
        } else {
            z = false;
        }
        this.LL = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynxContext setUIBodyView");
        sbLIZ.append(c1310660kDA);
        sbLIZ.append(this);
        LynxLog.i("LynxUIRenderer", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIJIIJIL = new WeakReference<>(c1310660kDA);
    }

    public s(Context context, DisplayMetrics displayMetrics) {
        super(context);
        this.LLILZLL = new HashMap();
        this.LLIZLLLIL = null;
        this.LLJIJIL = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJLIIIJLLLLLLLZ = EnumC1299430jv3.UNSET;
        this.LLJLILLLLZIIL = -1;
        this.LLJZ = false;
        this.LLLFFI = new HashMap();
        this.LLLIIIIL = 0;
        this.LLLIIIL = false;
        this.LLLIIL = false;
        this.LLLIILIL = false;
        this.LLLIL = "50px";
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        this.LLJJJ = displayMetrics2;
        displayMetrics2.setTo(displayMetrics);
        if (LLLILZ == null) {
            LLLILZ = (ILynxTextService) C1285920jZG.LIZJ().LIZ(ILynxTextService.class);
        }
    }

    public final void LJJI(String str, LynxBaseUI lynxBaseUI) {
        if (str == null) {
            if (lynxBaseUI.getEvents() != null && (lynxBaseUI.getEvents().containsKey("uiappear") || lynxBaseUI.getEvents().containsKey("uidisappear"))) {
                if (this.LLJJJJLIIL == null) {
                    LJIIZILJ();
                }
                this.LLJJJJLIIL.LJIILJJIL(String.valueOf(lynxBaseUI.getSign()), lynxBaseUI);
            }
            if (lynxBaseUI.mExposureID == null) {
                return;
            }
        }
        if (this.LLJJJJLIIL == null) {
            LJIIZILJ();
        }
        this.LLJJJJLIIL.LJIILJJIL(str, lynxBaseUI);
    }

    public final void LJJIII(String str, JavaOnlyArray javaOnlyArray) {
        JSProxy jSProxy;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxContext sendGlobalEvent ");
        sbLIZ.append(str);
        sbLIZ.append(" with this: ");
        sbLIZ.append(toString());
        LynxLog.i("LynxContext", C2188811AlT.LIZIZ(sbLIZ));
        WeakReference<JSProxy> weakReference = this.LLJI;
        if (weakReference != null && (jSProxy = weakReference.get()) != null) {
            C1309720kBe c1309720kBe = new C1309720kBe("GlobalEventEmitter", jSProxy);
            JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
            javaOnlyArray2.pushString(str);
            javaOnlyArray2.pushArray(javaOnlyArray);
            c1309720kBe.LIZIZ.LIZIZ(c1309720kBe.LIZ, "emit", javaOnlyArray2);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LynxContext sendGlobalEvent failed since eventEmitter is null with this: ");
        sbLIZ2.append(toString());
        LynxLog.e("LynxContext", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJJIFFI(String str, String str2, LynxError lynxError) {
        if (this.LLJJIJI != null) {
            String str3 = this.LLJJIII;
            lynxError.LJI = null;
            lynxError.LJIIIIZZ = str3;
            lynxError.LIZ("src", str);
            lynxError.LIZ("type", str2);
            this.LLJJIJI.LJFF(lynxError);
        }
    }

    public final void LIZJ(LynxBaseUI lynxBaseUI, String str, JavaOnlyMap javaOnlyMap, JavaOnlyMap javaOnlyMap2) {
        if (str == null) {
            if (lynxBaseUI.getEvents() != null && (lynxBaseUI.getEvents().containsKey("uiappear") || lynxBaseUI.getEvents().containsKey("uidisappear"))) {
                if (this.LLJJJJLIIL == null) {
                    LJIIZILJ();
                }
                JavaOnlyMap javaOnlyMap3 = new JavaOnlyMap();
                javaOnlyMap3.put("sendCustom", Boolean.TRUE);
                this.LLJJJJLIIL.LJIIL(lynxBaseUI, String.valueOf(lynxBaseUI.getSign()), null, javaOnlyMap3);
            }
            if (lynxBaseUI.mExposureID == null) {
                return;
            }
        }
        if (this.LLJJJJLIIL == null) {
            LJIIZILJ();
        }
        this.LLJJJJLIIL.LJIIL(lynxBaseUI, str, javaOnlyMap, javaOnlyMap2);
    }
}
