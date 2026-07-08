package com.bytedance.sdui.render.tasm.behavior.ui;

import X.AbstractC1313500kHk;
import X.AbstractC1313520kHm;
import X.AbstractC1314220kIu;
import X.AbstractC1314890kJz;
import X.AbstractC1317090kNX;
import X.C1290750jh3;
import X.C1291290jhv;
import X.C1294230jmf;
import X.C1297860jsW;
import X.C1297940jse;
import X.C1298170jt1;
import X.C1298370jtL;
import X.C1312930kGp;
import X.C1312940kGq;
import X.C1313490kHj;
import X.C1313510kHl;
import X.C1313560kHq;
import X.C1313610kHv;
import X.C1313650kHz;
import X.C1313660kI0;
import X.C1313690kI3;
import X.C1313700kI4;
import X.C1313740kI8;
import X.C1314090kIh;
import X.C1314120kIk;
import X.C1314140kIm;
import X.C1314230kIv;
import X.C1314240kIw;
import X.C1314380kJA;
import X.C1314400kJC;
import X.C1314420kJE;
import X.C1314520kJO;
import X.C1314650kJb;
import X.C1317140kNc;
import X.EnumC1313600kHu;
import X.EnumC1314060kIe;
import X.EnumC1314070kIf;
import X.InterfaceC1291270jht;
import X.InterfaceC1291280jhu;
import X.InterfaceC1298200jt4;
import X.InterfaceC1314540kJQ;
import X.InterfaceC1314820kJs;
import X.InterfaceC1314970kK7;
import X.InterfaceC1317060kNU;
import X.InterfaceC1966907n9;
import Y.ARunnableS89S0200000_20;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdui.render.bridge.Callback;
import com.bytedance.sdui.render.bridge.ReadableArray;
import com.bytedance.sdui.render.bridge.ReadableMap;
import com.bytedance.sdui.render.bridge.ReadableMapKeySetIterator;
import com.bytedance.sdui.render.bridge.ReadableType;
import com.bytedance.sdui.render.tasm.behavior.ui.utils.BackgroundDrawable;
import com.bytedance.sdui.render.tasm.behavior.utils.PropsUpdater;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public abstract class SDUIBaseUI implements InterfaceC1298200jt4, InterfaceC1317060kNU {
    public static final int[] LLLLJ = {8, 0, 2, 1, 3, 4, 5};
    public static final float LLLLJI = (float) Math.sqrt(5.0d);
    public static final int LLLLL = 1;
    public static final int LLLLLIL = 2;
    public SDUIBaseUI LL;
    public SDUIBaseUI LLILLJJLI;
    public float LLILLL;
    public final AbstractC1317090kNX LLILZ;
    public final Object LLILZIL;
    public InterfaceC1298200jt4 LLILZLL;
    public AbstractC1313520kHm LLIZ;
    public C1313690kI3 LLJ;
    public Map<String, C1297940jse> LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public int LLJJ;
    public String LLJJI;
    public Rect LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public int LLJZ;
    public int LLJZIJLIL;
    public float LLL;
    public final Point LLLF;
    public final Point LLLFF;
    public List<C1313650kHz> LLLIIII;
    public C1314240kIw LLLIIIIL;
    public final C1314380kJA LLLJ;
    public Bitmap.Config LLLJIL;
    public final float LLLJL;
    public boolean LLLL;
    public boolean LLLLII;
    public EnumC1314060kIe LLLLIIIILLL;
    public volatile Set<InterfaceC1314820kJs> LLLLIIL;
    public volatile C1314090kIh LLLLIILL;
    public final Matrix LLLLIILLL;
    public WeakReference<int[]> LLLLIL;
    public boolean LLLLILI;
    public final List<SDUIBaseUI> LLIZLLLIL = new ArrayList();
    public final C1297860jsW LLJI = new C1297860jsW();
    public ReadableMap LLJILLL = new C1297860jsW();
    public int LLLFFI = 0;
    public boolean LLLFZ = false;
    public boolean LLLI = false;
    public boolean LLLII = false;
    public ReadableArray LLLIIIL = null;
    public boolean LLLIIL = false;
    public boolean LLLIILIL = true;
    public boolean LLLIL = false;
    public Sticky LLLILZ = null;
    public float LLLILZJ = 0.0f;
    public float LLLILZLLLI = 0.0f;
    public final String LLLIZZ = "";

    public class Sticky extends RectF {
    }

    @Override // X.InterfaceC1317060kNU
    public final void LIZ() {
    }

    public boolean LJFF() {
        return true;
    }

    public int LJII() {
        return 0;
    }

    public boolean LJIIJJI() {
        return false;
    }

    public int LJIJJLI() {
        return 1;
    }

    public C1313700kI4 LJIL() {
        return null;
    }

    public C1313610kHv LJJ() {
        return null;
    }

    public float LJJIJIIJI() {
        return 1.0f;
    }

    public float LJJIJIIJIL() {
        return 1.0f;
    }

    public C1313510kHl LJJIZ() {
        return null;
    }

    public float LJJJ() {
        return 0.0f;
    }

    public float LJJJI() {
        return 0.0f;
    }

    public boolean LJJJJ() {
        return true;
    }

    public int LJJJJIZL() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0kIh] */
    public final synchronized void LJJJJJL() {
        if (this.LLLLIILL != null) {
            return;
        }
        this.LLLLIILL = new InterfaceC1314820kJs() { // from class: X.0kIh
            @Override // X.InterfaceC1314820kJs
            public final void LIZ(int i) {
                InterfaceC1314820kJs[] interfaceC1314820kJsArr;
                synchronized (this.LIZ) {
                    try {
                        interfaceC1314820kJsArr = (InterfaceC1314820kJs[]) ((HashSet) this.LIZ.LLLLIIL).toArray(new InterfaceC1314820kJs[((HashSet) this.LIZ.LLLLIIL).size()]);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                for (InterfaceC1314820kJs interfaceC1314820kJs : interfaceC1314820kJsArr) {
                    interfaceC1314820kJs.LIZ(i);
                }
            }
        };
    }

    public void LJJJJL(ReadableMap readableMap) {
    }

    public void LJJJJLI() {
    }

    public void LJJJJZ() {
    }

    public boolean LJJJLIIL() {
        return false;
    }

    public boolean LJJJZ() {
        return false;
    }

    public void LJJLIIIJ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    public void LJJLIIIJILLIZJL(int i) {
    }

    public void LJJLIIIJLJLI() {
    }

    public void LJJLIL() {
    }

    public void LJJLJ(ReadableArray readableArray) {
    }

    public void LJLIIIL(Object obj) {
    }

    @Override // X.InterfaceC1317060kNU
    public final void offResponseChain() {
        this.LLLL = false;
    }

    public void onFocusChanged(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC1317060kNU
    public final void onResponseChain() {
        this.LLLL = true;
    }

    @InterfaceC1291270jht(defaultBoolean = false, name = "block-list-event")
    public void setBlockListEvent(boolean z) {
    }

    @InterfaceC1291270jht(defaultFloat = 1.0f, name = "position")
    public final void setCSSPosition(int i) {
    }

    @InterfaceC1291270jht(name = "caret-color")
    public void setCaretColor(String str) {
    }

    @InterfaceC1291270jht(name = "enable-exposure-ui-margin")
    public void setEnableExposureUIMargin(boolean z) {
    }

    @InterfaceC1291270jht(name = "enable-scroll-monitor")
    public void setEnableScrollMonitor(boolean z) {
    }

    @InterfaceC1291270jht(name = "exposure-id")
    public void setExposureID(InterfaceC1314540kJQ interfaceC1314540kJQ) {
    }

    @InterfaceC1291270jht(name = "exposure-ui-margin-bottom")
    public void setExposureUIMarginBottom(String str) {
    }

    @InterfaceC1291270jht(name = "exposure-ui-margin-left")
    public void setExposureUIMarginLeft(String str) {
    }

    @InterfaceC1291270jht(name = "exposure-ui-margin-right")
    public void setExposureUIMarginRight(String str) {
    }

    @InterfaceC1291270jht(name = "exposure-ui-margin-top")
    public void setExposureUIMarginTop(String str) {
    }

    @InterfaceC1291270jht(defaultInt = 3, name = "direction")
    public void setLynxDirection(int i) {
    }

    @InterfaceC1291270jht(name = "name")
    public void setName(String str) {
    }

    @InterfaceC1291270jht(name = "scroll-monitor-tag")
    public void setScrollMonitorTag(String str) {
    }

    @InterfaceC1291270jht(name = "lynx-test-tag")
    public void setTestID(String str) {
    }

    public boolean LIZJ() {
        EnumC1314060kIe enumC1314060kIe = this.LLLLIIIILLL;
        if (enumC1314060kIe == EnumC1314060kIe.Enable) {
            return true;
        }
        if (enumC1314060kIe == EnumC1314060kIe.Disable || parent() == null) {
            return false;
        }
        InterfaceC1317060kNU interfaceC1317060kNUParent = parent();
        if (interfaceC1317060kNUParent instanceof C1313660kI0) {
            return false;
        }
        return interfaceC1317060kNUParent.LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[Catch: Exception -> 0x008e, TryCatch #0 {Exception -> 0x008e, blocks: (B:4:0x000d, B:6:0x0016, B:8:0x0020, B:18:0x0047, B:19:0x004b, B:21:0x0051, B:22:0x0061, B:24:0x0067, B:25:0x008a, B:9:0x0026, B:11:0x002a, B:13:0x0032, B:14:0x0039), top: B:29:0x000d }] */
    @Override // X.InterfaceC1317060kNU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.util.List<com.bytedance.sdui.serializedData.common.operations.EventAction>> LIZLLL() {
        /*
            r10 = this;
            java.lang.String r4 = "builtin_events"
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            X.0jsW r3 = r10.LJJIIZI()
            if (r3 == 0) goto L92
            com.bytedance.sdui.render.bridge.ReadableType r1 = r3.getType(r4)     // Catch: java.lang.Exception -> L8e
            com.bytedance.sdui.render.bridge.ReadableType r0 = com.bytedance.sdui.render.bridge.ReadableType.String     // Catch: java.lang.Exception -> L8e
            r2 = 0
            if (r1 != r0) goto L26
            java.lang.String r1 = r3.getString(r4)     // Catch: java.lang.Exception -> L8e
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L8e
            if (r0 != 0) goto L43
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8e
            r9.<init>(r1)     // Catch: java.lang.Exception -> L8e
            goto L44
        L26:
            com.bytedance.sdui.render.bridge.ReadableType r0 = com.bytedance.sdui.render.bridge.ReadableType.Map     // Catch: java.lang.Exception -> L8e
            if (r1 != r0) goto L43
            com.bytedance.sdui.render.bridge.ReadableMap r1 = r3.getMap(r4)     // Catch: java.lang.Exception -> L8e
            boolean r0 = r1 instanceof X.C1297860jsW     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L39
            X.0jsW r1 = (X.C1297860jsW) r1     // Catch: java.lang.Exception -> L8e
            org.json.JSONObject r9 = r1.toJSONObject()     // Catch: java.lang.Exception -> L8e
            goto L44
        L39:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8e
            java.util.HashMap r0 = r1.toHashMap()     // Catch: java.lang.Exception -> L8e
            r9.<init>(r0)     // Catch: java.lang.Exception -> L8e
            goto L44
        L43:
            r9 = r2
        L44:
            if (r9 != 0) goto L47
            return r2
        L47:
            java.util.Iterator r7 = r9.keys()     // Catch: java.lang.Exception -> L8e
        L4b:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L92
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L8e
            r6.<init>()     // Catch: java.lang.Exception -> L8e
            java.lang.Object r5 = r7.next()     // Catch: java.lang.Exception -> L8e
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L8e
            org.json.JSONArray r4 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONArray(r9, r5)     // Catch: java.lang.Exception -> L8e
            r3 = 0
        L61:
            int r0 = r4.length()     // Catch: java.lang.Exception -> L8e
            if (r3 >= r0) goto L8a
            org.json.JSONObject r2 = r4.optJSONObject(r3)     // Catch: java.lang.Exception -> L8e
            com.bytedance.sdui.serializedData.common.operations.EventAction r1 = new com.bytedance.sdui.serializedData.common.operations.EventAction     // Catch: java.lang.Exception -> L8e
            r1.<init>()     // Catch: java.lang.Exception -> L8e
            java.lang.String r0 = "name"
            java.lang.String r0 = r2.optString(r0)     // Catch: java.lang.Exception -> L8e
            r1.LIZ = r0     // Catch: java.lang.Exception -> L8e
            java.lang.String r0 = "params"
            java.lang.String r0 = r2.optString(r0)     // Catch: java.lang.Exception -> L8e
            r1.LIZIZ = r0     // Catch: java.lang.Exception -> L8e
            java.lang.Long r0 = X.C1317210kNj.LIZJ     // Catch: java.lang.Exception -> L8e
            r1.LIZJ = r0     // Catch: java.lang.Exception -> L8e
            r6.add(r1)     // Catch: java.lang.Exception -> L8e
            int r3 = r3 + 1
            goto L61
        L8a:
            r8.put(r5, r6)     // Catch: java.lang.Exception -> L8e
            goto L4b
        L8e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L92:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI.LIZLLL():java.util.Map");
    }

    public void LJIIJ() {
        List<InterfaceC1314970kK7> list;
        if ((this instanceof InterfaceC1314970kK7) && (list = this.LLILZ.LLJI) != null) {
            ((ArrayList) list).remove(this);
        }
        C1298370jtL c1298370jtL = this.LLILZ.LLIZ.get();
        c1298370jtL.getClass();
        C1290750jh3.LJ(new ARunnableS89S0200000_20(c1298370jtL, this, 183));
    }

    public final Rect LJIILIIL() {
        int iLJJIIJ;
        C1313660kI0 c1313660kI0 = this.LLILZ.LLILZIL;
        ViewGroup viewGroup = c1313660kI0.LLLLZI;
        int iLJJIII = 0;
        if (viewGroup == null) {
            return new Rect(0, 0, LJJJJI(), LJIIZILJ());
        }
        if (this instanceof AbstractC1313520kHm) {
            View childAt = ((AbstractC1313520kHm) this).LLLLLILLIL;
            if (childAt instanceof C1313560kHq) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                if (viewGroup2.getChildCount() > 0) {
                    childAt = viewGroup2.getChildAt(0);
                }
            }
            Rect rect = new Rect();
            View rootView = childAt.getRootView();
            if (viewGroup.getRootView() != rootView && (rootView instanceof ViewGroup)) {
                viewGroup = (ViewGroup) rootView;
            }
            try {
                viewGroup.offsetDescendantRectToMyCoords(childAt, rect);
                rect.offset(childAt.getScrollX(), childAt.getScrollY());
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            int[] iArrLJJII = LJJII();
            int i = iArrLJJII[0];
            if (i != Integer.MIN_VALUE) {
                rect.offset(i, iArrLJJII[1]);
            }
            iLJJIIJ = rect.top;
            iLJJIII = rect.left;
        } else if (this instanceof C1314650kJb) {
            InterfaceC1298200jt4 interfaceC1298200jt4 = this.LLILZLL;
            if (interfaceC1298200jt4 == null || interfaceC1298200jt4 == c1313660kI0) {
                iLJJIII = this.LLJJIJI;
                iLJJIIJ = this.LLJJIJIIJIL;
            } else {
                SDUIBaseUI sDUIBaseUILJJIIJZLJL = this;
                iLJJIII = 0;
                iLJJIIJ = 0;
                while ((sDUIBaseUILJJIIJZLJL instanceof C1314650kJb) && sDUIBaseUILJJIIJZLJL != this.LLILZ.LLILZIL) {
                    iLJJIII += sDUIBaseUILJJIIJZLJL.LJJIII();
                    iLJJIIJ += sDUIBaseUILJJIIJZLJL.LJJIIJ();
                    sDUIBaseUILJJIIJZLJL = sDUIBaseUILJJIIJZLJL.LJJIIJZLJL();
                }
                if (sDUIBaseUILJJIIJZLJL != null) {
                    Rect rectLJIILIIL = sDUIBaseUILJJIIJZLJL.LJIILIIL();
                    iLJJIII += rectLJIILIIL.left;
                    iLJJIIJ += rectLJIILIIL.top;
                }
            }
        } else {
            iLJJIIJ = 0;
        }
        return new Rect(iLJJIII, iLJJIIJ, LJJJJI() + iLJJIII, LJIIZILJ() + iLJJIIJ);
    }

    public final int[] LJJII() {
        return this.LLLLIL.get() != null ? this.LLLLIL.get() : new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
    }

    public final SDUIBaseUI LJJIIJZLJL() {
        InterfaceC1298200jt4 interfaceC1298200jt4 = this.LLILZLL;
        return interfaceC1298200jt4 instanceof C1313490kHj ? (SDUIBaseUI) ((SDUIBaseUI) interfaceC1298200jt4).LLILZLL : (SDUIBaseUI) interfaceC1298200jt4;
    }

    public Matrix LJJIL() {
        return new Matrix();
    }

    public void LJJJLZIJ() {
        Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            ((SDUIBaseUI) it2.next()).LJJJLZIJ();
        }
    }

    public void LJJLI() {
        if (this.LLLLILI) {
            this.LLLLILI = false;
        }
        Point point = this.LLLFF;
        Point point2 = this.LLLF;
        point.x = point2.x;
        point.y = point2.y;
        this.LLLIIL = false;
    }

    public void LJJLIIIIJ() {
        BackgroundDrawable backgroundDrawable = this.LLJ.LIZIZ;
        if (backgroundDrawable != null) {
            Iterator it2 = ((ArrayList) backgroundDrawable.LJIJJLI.LL).iterator();
            while (it2.hasNext()) {
                ((AbstractC1314220kIu) it2.next()).LIZLLL();
            }
        }
    }

    public void LJJLIIIJJI() {
        BackgroundDrawable backgroundDrawable = this.LLJ.LIZIZ;
        if (backgroundDrawable != null) {
            Iterator it2 = ((ArrayList) backgroundDrawable.LJIJJLI.LL).iterator();
            while (it2.hasNext()) {
                ((AbstractC1314220kIu) it2.next()).LJ();
            }
        }
    }

    public void LJJLIIIJJIZ() {
        C1313690kI3 c1313690kI3 = this.LLJ;
        float f = this.LLJJL;
        float f2 = this.LLJJJJLIIL;
        float f3 = this.LLJJLIIIJLLLLLLLZ;
        float f4 = this.LLJJJJJIL;
        BackgroundDrawable backgroundDrawable = c1313690kI3.LIZIZ;
        if (backgroundDrawable != null) {
            backgroundDrawable.LJIIIZ(f, 1);
            backgroundDrawable.LJIIIZ(f2, 2);
            backgroundDrawable.LJIIIZ(f3, 3);
            backgroundDrawable.LJIIIZ(f4, 0);
        }
        LJJJJZ();
        LJJLIL();
    }

    public void LJJLIIIJL() {
        AbstractC1317090kNX abstractC1317090kNX = this.LLILZ;
        if (abstractC1317090kNX != null) {
            C1317140kNc c1317140kNc = abstractC1317090kNX.LLJIJIL;
        }
        LJJJJZ();
    }

    @Override // X.InterfaceC1317060kNU
    public final InterfaceC1317060kNU parent() {
        InterfaceC1298200jt4 interfaceC1298200jt4 = this.LLILZLL;
        if (interfaceC1298200jt4 instanceof InterfaceC1317060kNU) {
            return (InterfaceC1317060kNU) interfaceC1298200jt4;
        }
        return null;
    }

    public final Rect LJIILLIIL() {
        int i;
        int iLJJJJI = LJJJJI();
        int iLJIIZILJ = LJIIZILJ();
        DisplayMetrics displayMetrics = this.LLILZ.LLJ;
        int i2 = this.LLLFFI;
        int i3 = 0;
        if ((i2 & 1) != 0) {
            int i4 = displayMetrics.widthPixels;
            i = -i4;
            iLJJJJI += i4 * 2;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            int i5 = displayMetrics.heightPixels;
            i3 = -i5;
            iLJIIZILJ += i5 * 2;
        }
        return new Rect(i, i3, iLJJJJI + i, iLJIIZILJ + i3);
    }

    public final C1297860jsW LJJIIZ() {
        Rect rectLJIILIIL = LJIILIIL();
        float f = this.LLILZ.LLJ.density;
        C1297860jsW c1297860jsW = new C1297860jsW();
        c1297860jsW.putString(FollowStatusChangeMethod.PARAM_UID, LJIJ());
        c1297860jsW.putMap("dataset", new C1297860jsW());
        c1297860jsW.putDouble("left", rectLJIILIIL.left / f);
        c1297860jsW.putDouble("top", rectLJIILIIL.top / f);
        c1297860jsW.putDouble("right", rectLJIILIIL.right / f);
        c1297860jsW.putDouble("bottom", rectLJIILIIL.bottom / f);
        c1297860jsW.putDouble("width", rectLJIILIIL.width() / f);
        c1297860jsW.putDouble("height", rectLJIILIIL.height() / f);
        return c1297860jsW;
    }

    public final Rect LJJIJ() {
        float fLJJIII = LJJIII();
        float fLJJIIJ = LJJIIJ();
        return new Rect((int) fLJJIII, (int) fLJJIIJ, (int) (fLJJIII + LJJJJI()), (int) (fLJJIIJ + LJIIZILJ()));
    }

    @Override // X.InterfaceC1317060kNU
    public final Map<String, C1297940jse> LIZIZ() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1317060kNU
    public final boolean LJ() {
        return this.LLLLII;
    }

    public Rect LJIIL() {
        return this.LLJJIII;
    }

    public List<SDUIBaseUI> LJIILL() {
        return this.LLIZLLLIL;
    }

    public int LJIIZILJ() {
        return this.LLJJJJ;
    }

    public String LJIJ() {
        return this.LLJILJIL;
    }

    public int LJJI() {
        return this.LLJJIJI;
    }

    public int LJJIII() {
        return this.LLJJIJIL;
    }

    public int LJJIIJ() {
        return this.LLJJJ;
    }

    public C1297860jsW LJJIIZI() {
        return this.LLJI;
    }

    public String LJJIJIL() {
        return this.LLJJI;
    }

    public int LJJIJLIJ() {
        return this.LLJJIJIIJIL;
    }

    public float LJJJIL() {
        return this.LLILLL;
    }

    public int LJJJJI() {
        return this.LLJJJIL;
    }

    public boolean LJJJJZI() {
        return this.LLLLILI;
    }

    public boolean LJJJLL() {
        return this.LLLIILIL;
    }

    @Override // X.InterfaceC1317060kNU
    public final int getSign() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1317060kNU
    public final boolean ignoreFocus() {
        return this.LLLII;
    }

    @Override // X.InterfaceC1317060kNU
    public final boolean isFocusable() {
        return this.LLLI;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0kJA] */
    public SDUIBaseUI(AbstractC1317090kNX abstractC1317090kNX) {
        ?? r1 = new Drawable.Callback() { // from class: X.0kJA
            @Override // android.graphics.drawable.Drawable.Callback
            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void invalidateDrawable(Drawable drawable) {
                this.LL.LJJJJZ();
            }
        };
        this.LLLJ = r1;
        this.LLLJIL = null;
        this.LLLJL = 8.0f;
        this.LLLL = false;
        this.LLLLII = false;
        this.LLLLIIIILLL = EnumC1314060kIe.Undefined;
        this.LLLLIILLL = new Matrix();
        this.LLLLIL = new WeakReference<>(null);
        this.LLLLILI = true;
        this.LLILZ = abstractC1317090kNX;
        this.LLILZIL = null;
        C1313690kI3 c1313690kI3 = new C1313690kI3(abstractC1317090kNX);
        this.LLJ = c1313690kI3;
        c1313690kI3.LIZJ = r1;
        float fLIZ = C1312940kGq.LIZ(14.0f);
        this.LLL = fLIZ;
        this.LLJ.LIZLLL = fLIZ;
        this.LLLF = new Point();
        this.LLLFF = new Point();
        LJJJJLI();
    }

    public void LJI(C1291290jhv c1291290jhv) {
        LJJLIIIJL();
    }

    public SDUIBaseUI LJIILJJIL(int i) {
        return (SDUIBaseUI) ListProtector.get(this.LLIZLLLIL, i);
    }

    public int LJIJJ(SDUIBaseUI sDUIBaseUI) {
        return ((ArrayList) this.LLIZLLLIL).indexOf(sDUIBaseUI);
    }

    public final void LJJL(int i) {
        InterfaceC1314820kJs[] interfaceC1314820kJsArr;
        if (this.LLLLIIL == null) {
            return;
        }
        synchronized (this) {
            try {
                interfaceC1314820kJsArr = (InterfaceC1314820kJs[]) ((HashSet) this.LLLLIIL).toArray(new InterfaceC1314820kJs[((HashSet) this.LLLLIIL).size()]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (InterfaceC1314820kJs interfaceC1314820kJs : interfaceC1314820kJsArr) {
            interfaceC1314820kJs.LIZ(i);
        }
    }

    public final void LJJLIIIJLLLLLLLZ(InterfaceC1314820kJs interfaceC1314820kJs) {
        if (interfaceC1314820kJs == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LLLLIIL == null) {
                    this.LLLLIIL = new HashSet();
                }
                ((HashSet) this.LLLLIIL).add(interfaceC1314820kJs);
                if (((HashSet) this.LLLLIIL).size() != 1) {
                    return;
                }
                LJJJJJL();
                InterfaceC1298200jt4 interfaceC1298200jt4 = this.LLILZLL;
                if (interfaceC1298200jt4 instanceof SDUIBaseUI) {
                    ((SDUIBaseUI) interfaceC1298200jt4).LJJLIIIJLLLLLLLZ(this.LLLLIILL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void LJJLIIJ(SDUIBaseUI sDUIBaseUI) {
        ((ArrayList) this.LLIZLLLIL).remove(sDUIBaseUI);
        sDUIBaseUI.LJJZZI(null);
    }

    public void LJJLJLI(Rect rect) {
        this.LLJJIII = null;
    }

    public void LJJLL(Map<String, C1297940jse> map) {
        this.LLJIJIL = map;
    }

    public void LJJZ(int i) {
        this.LLJJIJI = i;
        this.LLJJIJIL = i;
        LJJLIIIJJIZ();
    }

    public final void LJJZZI(InterfaceC1298200jt4 interfaceC1298200jt4) {
        InterfaceC1314820kJs[] interfaceC1314820kJsArr;
        InterfaceC1314820kJs[] interfaceC1314820kJsArr2;
        if (this.LLLLIIL == null) {
            this.LLILZLL = interfaceC1298200jt4;
            return;
        }
        int i = 0;
        if (interfaceC1298200jt4 instanceof SDUIBaseUI) {
            synchronized (this) {
                try {
                    interfaceC1314820kJsArr2 = (InterfaceC1314820kJs[]) ((HashSet) this.LLLLIIL).toArray(new InterfaceC1314820kJs[((HashSet) this.LLLLIIL).size()]);
                } finally {
                }
            }
            int length = interfaceC1314820kJsArr2.length;
            while (i < length) {
                ((SDUIBaseUI) interfaceC1298200jt4).LJJLIIIJLLLLLLLZ(interfaceC1314820kJsArr2[i]);
                i++;
            }
        } else if (this.LLILZLL instanceof SDUIBaseUI) {
            synchronized (this) {
                try {
                    interfaceC1314820kJsArr = (InterfaceC1314820kJs[]) ((HashSet) this.LLLLIIL).toArray(new InterfaceC1314820kJs[((HashSet) this.LLLLIIL).size()]);
                } finally {
                }
            }
            int length2 = interfaceC1314820kJsArr.length;
            while (i < length2) {
                ((SDUIBaseUI) this.LLILZLL).LJLI(interfaceC1314820kJsArr[i]);
                i++;
            }
        }
        this.LLILZLL = interfaceC1298200jt4;
    }

    public void LJL(int i) {
        this.LLJJIJIIJIL = i;
        this.LLJJJ = i;
        LJJLIIIJJIZ();
    }

    public final void LJLI(InterfaceC1314820kJs interfaceC1314820kJs) {
        boolean zIsEmpty;
        if (interfaceC1314820kJs != null && this.LLLLIIL != null) {
            synchronized (this) {
                try {
                    ((HashSet) this.LLLLIIL).remove(interfaceC1314820kJs);
                    zIsEmpty = ((HashSet) this.LLLLIIL).isEmpty();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (zIsEmpty) {
                InterfaceC1298200jt4 interfaceC1298200jt4 = this.LLILZLL;
                if (interfaceC1298200jt4 instanceof SDUIBaseUI) {
                    ((SDUIBaseUI) interfaceC1298200jt4).LJLI(this.LLLLIILL);
                }
            }
        }
    }

    public void LJLILLLLZI(SDUIBaseUI sDUIBaseUI) {
        LJLIL(sDUIBaseUI.LJJI(), sDUIBaseUI.LJJIJLIJ(), sDUIBaseUI.LJJJJI(), sDUIBaseUI.LJIIZILJ(), sDUIBaseUI.LLJJJJJIL, sDUIBaseUI.LLJJL, sDUIBaseUI.LLJJJJLIIL, sDUIBaseUI.LLJJLIIIJLLLLLLLZ, sDUIBaseUI.LLJL, sDUIBaseUI.LLJLIL, sDUIBaseUI.LLJLILLLLZIIL, sDUIBaseUI.LLJLL, sDUIBaseUI.LLJLLL, sDUIBaseUI.LLJLLIL, sDUIBaseUI.LLJZ, sDUIBaseUI.LLJZIJLIL, sDUIBaseUI.LJIIL());
        this.LLJJIJIL = sDUIBaseUI.LJJIII();
        this.LLJJJ = sDUIBaseUI.LJJIIJ();
    }

    public void LJLJI(C1291290jhv c1291290jhv) {
        this.LLJI.merge(c1291290jhv.LIZ);
        PropsUpdater.LIZ(c1291290jhv, this);
    }

    public void LJLJJI(float[] fArr) {
        if (fArr.length < 4) {
            this.LLLILZ = null;
            return;
        }
        Sticky sticky = new Sticky();
        this.LLLILZ = sticky;
        ((RectF) sticky).left = fArr[0];
        ((RectF) sticky).top = fArr[1];
        ((RectF) sticky).right = fArr[2];
        ((RectF) sticky).bottom = fArr[3];
        LJJIIJZLJL();
    }

    @InterfaceC1966907n9
    public void scrollIntoView(ReadableMap readableMap) {
        HashMap map;
        if (readableMap == null || (map = (HashMap) readableMap.toHashMap().get("scrollIntoViewOptions")) == null) {
            return;
        }
        if (map.containsKey("behavior")) {
            map.get("behavior");
        }
        if (map.containsKey("block")) {
            map.get("block");
        }
        if (map.containsKey("inline")) {
            map.get("inline");
        }
    }

    @InterfaceC1291270jht(name = "background-clip")
    public void setBackgroundClip(ReadableArray readableArray) {
        BackgroundDrawable backgroundDrawableLIZIZ = this.LLJ.LIZIZ();
        C1313740kI8 c1313740kI8 = backgroundDrawableLIZIZ.LJIJJLI;
        ((ArrayList) c1313740kI8.LLILZ).clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                int i2 = readableArray.getInt(i);
                if (i2 >= 0 && i2 <= 2) {
                    ((ArrayList) c1313740kI8.LLILZ).add(Integer.valueOf(i2));
                } else {
                    ((ArrayList) c1313740kI8.LLILZ).add(1);
                }
            }
        }
        backgroundDrawableLIZIZ.invalidateSelf();
    }

    @InterfaceC1291270jht(defaultInt = 0, name = "background-color")
    public void setBackgroundColor(int i) {
        if (LJIL() != null) {
            LJIL().LIZ(Integer.valueOf(i), "BackgroundColor");
        }
        if (LJJIZ() != null && LJJIZ().LIZIZ(64)) {
            LJJIZ().LIZ(this, 64, Integer.valueOf(i));
        } else {
            this.LLJ.LIZJ(i);
            LJJJJZ();
        }
    }

    @InterfaceC1291270jht(name = "background-image")
    public void setBackgroundImage(ReadableArray readableArray) {
        BackgroundDrawable backgroundDrawableLIZIZ = this.LLJ.LIZIZ();
        C1313740kI8 c1313740kI8 = backgroundDrawableLIZIZ.LJIJJLI;
        ((ArrayList) c1313740kI8.LL).clear();
        if (readableArray != null) {
            Rect bounds = c1313740kI8.LLIZ.getBounds();
            int size = readableArray.size();
            int i = 0;
            while (i < size) {
                int i2 = readableArray.getInt(i);
                if (i2 == 1) {
                    i++;
                } else if (i2 == 2) {
                    i++;
                    List<AbstractC1314220kIu> list = c1313740kI8.LL;
                    final ReadableArray array = readableArray.getArray(i);
                    ((ArrayList) list).add(new AbstractC1314890kJz(array) { // from class: X.0kK1
                        public final double LJII;
                        public boolean LJIIIIZZ;

                        {
                            if (array == null || array.size() != 3) {
                                return;
                            }
                            this.LJII = array.getDouble(0);
                            LJII(array.getArray(1), array.getArray(2));
                        }

                        @Override // X.AbstractC1314220kIu
                        public final void LJI(boolean z) {
                            this.LJIIIIZZ = z;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
                        @Override // android.graphics.drawable.Drawable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void setBounds(android.graphics.Rect r18) {
                            /*
                                Method dump skipped, instruction units count: 557
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1314910kK1.setBounds(android.graphics.Rect):void");
                        }

                        public static void LJIIIZ(int[] iArr, float[] fArr, int i3, int[] iArr2) {
                            C1314930kK3 c1314930kK3 = new C1314930kK3();
                            c1314930kK3.LIZ(iArr[0]);
                            C1314930kK3 c1314930kK32 = new C1314930kK3();
                            int i4 = 1;
                            c1314930kK32.LIZ(iArr[1]);
                            float f = fArr[0];
                            float f2 = fArr[1] - f;
                            for (int i5 = 0; i5 < i3; i5++) {
                                float f3 = i5 / (i3 - 1.0f);
                                float f4 = fArr[i4];
                                if (f3 > f4) {
                                    c1314930kK3.LIZLLL = c1314930kK32.LIZLLL;
                                    c1314930kK3.LIZ = c1314930kK32.LIZ;
                                    c1314930kK3.LIZIZ = c1314930kK32.LIZIZ;
                                    c1314930kK3.LIZJ = c1314930kK32.LIZJ;
                                    i4++;
                                    c1314930kK32.LIZ(iArr[i4]);
                                    f2 = fArr[i4] - f4;
                                    f = f4;
                                }
                                float f5 = (f3 - f) / f2;
                                float f6 = 1.0f - f5;
                                iArr2[i5] = (((int) (((c1314930kK3.LIZLLL * f6) + (c1314930kK32.LIZLLL * f5)) * 255.0f)) << 24) | (((int) (((c1314930kK3.LIZ * f6) + (c1314930kK32.LIZ * f5)) * 255.0f)) << 16) | (((int) (((c1314930kK3.LIZIZ * f6) + (c1314930kK32.LIZIZ * f5)) * 255.0f)) << 8) | ((int) (((c1314930kK3.LIZJ * f6) + (c1314930kK32.LIZJ * f5)) * 255.0f));
                            }
                        }

                        public final void LJIIIIZZ(PointF pointF, PointF pointF2, int[] iArr, float[] fArr, float f) {
                            int i3;
                            int i4;
                            float[] fArr2 = fArr;
                            int length = (int) PointF.length(pointF2.x - pointF.x, pointF2.y - pointF.y);
                            if (length <= 0) {
                                this.LIZIZ = null;
                                return;
                            }
                            int[] iArr2 = new int[length];
                            if (fArr2 == null) {
                                fArr2 = new float[iArr.length];
                                if (iArr.length == 2) {
                                    fArr2[0] = 0.0f;
                                    fArr2[1] = 1.0f;
                                } else if (iArr.length > 2) {
                                    for (int i5 = 0; i5 < iArr.length; i5++) {
                                        fArr2[i5] = i5 / (iArr.length - 1);
                                    }
                                }
                            }
                            if (fArr2[0] != 0.0f) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            if (fArr2[fArr2.length - 1] != 1.0f) {
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            int length2 = fArr2.length + i3 + i4;
                            if (length2 != fArr2.length) {
                                int[] iArr3 = new int[length2];
                                float[] fArr3 = new float[length2];
                                if (i3 != 0) {
                                    iArr3[0] = iArr[0];
                                    fArr3[0] = 0.0f;
                                }
                                System.arraycopy(iArr, 0, iArr3, i3, iArr.length);
                                System.arraycopy(fArr2, 0, fArr3, i3, fArr2.length);
                                if (i4 != 0) {
                                    int i6 = length2 - 1;
                                    iArr3[i6] = iArr[iArr.length - 1];
                                    fArr3[i6] = 1.0f;
                                }
                                LJIIIZ(iArr3, fArr3, length, iArr2);
                            } else {
                                LJIIIZ(iArr, fArr2, length, iArr2);
                            }
                            this.LIZIZ = new BitmapShader(Bitmap.createBitmap(iArr2, length, 1, Bitmap.Config.ARGB_8888), Shader.TileMode.CLAMP, Shader.TileMode.REPEAT);
                            Matrix matrix = new Matrix();
                            matrix.postRotate(f + 270.0f);
                            matrix.postTranslate(pointF.x, pointF.y);
                            this.LIZIZ.setLocalMatrix(matrix);
                        }
                    });
                } else if (i2 == 3) {
                    i++;
                    List<AbstractC1314220kIu> list2 = c1313740kI8.LL;
                    final ReadableArray array2 = readableArray.getArray(i);
                    ((ArrayList) list2).add(new AbstractC1314890kJz(array2) { // from class: X.0kK0
                        public final int LJII;
                        public final int LJIIIIZZ;
                        public final int LJIIIZ;
                        public final float LJIIJ;
                        public final float LJIIJJI;
                        public final PointF LJIIL = new PointF(0.5f, 0.5f);

                        public static float LJIIIIZZ(float f, float f2, int i3) {
                            if (i3 == 11) {
                                return (f2 * f) / 100.0f;
                            }
                            switch (i3) {
                                case 32:
                                case 35:
                                    return 0.0f;
                                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                    return f2;
                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                    return f2 * 0.5f;
                                default:
                                    return f;
                            }
                        }

                        {
                            this.LJIIIIZZ = 36;
                            this.LJIIIZ = 36;
                            this.LJIIJ = 0.5f;
                            this.LJIIJJI = 0.5f;
                            if (array2 == null) {
                                return;
                            }
                            array2.size();
                            ReadableArray array3 = array2.getArray(0);
                            this.LJII = array3.getInt(1);
                            this.LJIIIIZZ = array3.getInt(2);
                            this.LJIIJ = (float) array3.getDouble(3);
                            this.LJIIIZ = array3.getInt(4);
                            this.LJIIJJI = (float) array3.getDouble(5);
                            LJII(array2.getArray(1), array2.getArray(2));
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setBounds(Rect rect) {
                            double dSqrt;
                            this.LIZJ = rect.width();
                            this.LIZLLL = rect.height();
                            this.LJIIL.x = LJIIIIZZ(this.LJIIJ, this.LIZJ, this.LJIIIIZZ);
                            this.LJIIL.y = LJIIIIZZ(this.LJIIJJI, this.LIZLLL, this.LJIIIZ);
                            PointF pointF = this.LJIIL;
                            float f = pointF.x;
                            float f2 = pointF.y;
                            int i3 = this.LJII;
                            if (i3 != 0) {
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        if (i3 != 3) {
                                            dSqrt = 0.0d;
                                        } else {
                                            dSqrt = Math.max(Math.min(Math.min(f, this.LIZJ - f), Math.min(f2, this.LIZLLL - f2)), 1.0d);
                                        }
                                    } else {
                                        float fMin = Math.min(f, this.LIZJ - f);
                                        float fMin2 = Math.min(f2, this.LIZLLL - f2);
                                        dSqrt = Math.sqrt((fMin * fMin) + (fMin2 * fMin2));
                                    }
                                } else {
                                    dSqrt = Math.max(Math.max(f, this.LIZJ - f), Math.max(f2, this.LIZLLL - f2));
                                }
                            } else {
                                float fMax = Math.max(f, this.LIZJ - f);
                                float fMax2 = Math.max(f2, this.LIZLLL - f2);
                                dSqrt = Math.sqrt((fMax * fMax) + (fMax2 * fMax2));
                            }
                            int[] iArr = this.LJFF;
                            if (iArr != null && iArr.length >= 2) {
                                float[] fArr = this.LJI;
                                if (fArr != null && fArr.length != iArr.length) {
                                    this.LIZIZ = null;
                                } else {
                                    try {
                                        this.LIZIZ = new RadialGradient(f, f2, (float) dSqrt, this.LJFF, this.LJI, Shader.TileMode.CLAMP);
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        this.LIZIZ = null;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("exception:\n");
                                        sbLIZ.append(e.toString());
                                        C2188811AlT.LIZIZ(sbLIZ);
                                    }
                                }
                            } else {
                                this.LIZIZ = null;
                            }
                            super.setBounds(rect);
                        }
                    });
                } else if (i2 == 0) {
                    i++;
                    ((ArrayList) c1313740kI8.LL).add(new AbstractC1314220kIu() { // from class: X.0kJS
                        @Override // X.AbstractC1314220kIu
                        public final int LIZ() {
                            return 0;
                        }

                        @Override // X.AbstractC1314220kIu
                        public final int LIZIZ() {
                            return 0;
                        }

                        @Override // X.AbstractC1314220kIu
                        public final boolean LIZJ() {
                            return false;
                        }

                        @Override // X.AbstractC1314220kIu
                        public final void LIZLLL() {
                        }

                        @Override // X.AbstractC1314220kIu
                        public final void LJ() {
                        }

                        @Override // X.AbstractC1314220kIu
                        public final void LJFF() {
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void draw(Canvas canvas) {
                        }
                    });
                }
                if (!bounds.isEmpty()) {
                    List<AbstractC1314220kIu> list3 = c1313740kI8.LL;
                    AbstractC1314220kIu abstractC1314220kIu = (AbstractC1314220kIu) ListProtector.get(list3, ((ArrayList) list3).size() - 1);
                    bounds.width();
                    bounds.height();
                    abstractC1314220kIu.LJFF();
                }
                i++;
            }
        }
        backgroundDrawableLIZIZ.invalidateSelf();
        LJJJJZ();
    }

    @InterfaceC1291270jht(name = "background-origin")
    public void setBackgroundOrigin(ReadableArray readableArray) {
        BackgroundDrawable backgroundDrawableLIZIZ = this.LLJ.LIZIZ();
        C1313740kI8 c1313740kI8 = backgroundDrawableLIZIZ.LJIJJLI;
        ((ArrayList) c1313740kI8.LLILLL).clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                int i2 = readableArray.getInt(i);
                if (i2 < 0 || i2 > 2) {
                    i2 = 1;
                }
                ((ArrayList) c1313740kI8.LLILLL).add(Integer.valueOf(i2));
            }
        }
        backgroundDrawableLIZIZ.invalidateSelf();
        LJJJJZ();
    }

    @InterfaceC1291270jht(name = "background-position")
    public void setBackgroundPosition(ReadableArray readableArray) {
        BackgroundDrawable backgroundDrawableLIZIZ = this.LLJ.LIZIZ();
        C1313740kI8 c1313740kI8 = backgroundDrawableLIZIZ.LJIJJLI;
        ((ArrayList) c1313740kI8.LLILLJJLI).clear();
        if (readableArray != null && readableArray.size() % 2 == 0) {
            for (int i = 0; i < readableArray.size(); i += 2) {
                int i2 = readableArray.getInt(i + 1);
                if (i2 == 2) {
                    ReadableArray array = readableArray.getArray(i);
                    double d = array.getDouble(0);
                    double d2 = array.getDouble(1);
                    ((ArrayList) c1313740kI8.LLILLJJLI).add(new C1314400kJC(d, d2, i2));
                } else {
                    ((ArrayList) c1313740kI8.LLILLJJLI).add(new C1314400kJC(readableArray.getDouble(i), i2));
                }
            }
        }
        backgroundDrawableLIZIZ.invalidateSelf();
        LJJJJZ();
    }

    @InterfaceC1291270jht(name = "background-repeat")
    public void setBackgroundRepeat(ReadableArray readableArray) {
        BackgroundDrawable backgroundDrawableLIZIZ = this.LLJ.LIZIZ();
        C1313740kI8 c1313740kI8 = backgroundDrawableLIZIZ.LJIJJLI;
        ((ArrayList) c1313740kI8.LLILZIL).clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                ((ArrayList) c1313740kI8.LLILZIL).add(EnumC1314070kIf.valueOf(readableArray.getInt(i)));
            }
        }
        backgroundDrawableLIZIZ.invalidateSelf();
        LJJJJZ();
    }

    @InterfaceC1291270jht(name = "background-size")
    public void setBackgroundSize(ReadableArray readableArray) {
        BackgroundDrawable backgroundDrawableLIZIZ = this.LLJ.LIZIZ();
        C1313740kI8 c1313740kI8 = backgroundDrawableLIZIZ.LJIJJLI;
        ((ArrayList) c1313740kI8.LLILZLL).clear();
        if (readableArray != null && readableArray.size() % 2 == 0) {
            int size = readableArray.size();
            for (int i = 0; i < size; i += 2) {
                ((ArrayList) c1313740kI8.LLILZLL).add(new C1314520kJO(readableArray.getDouble(i), readableArray.getInt(i + 1)));
            }
        }
        backgroundDrawableLIZIZ.invalidateSelf();
        LJJJJZ();
    }

    @InterfaceC1291270jht(defaultBoolean = false, name = "block-native-event")
    public void setBlockNativeEvent(boolean z) {
        this.LLLLII = z;
    }

    @InterfaceC1291270jht(name = "box-shadow")
    public void setBoxShadow(ReadableArray readableArray) {
        InterfaceC1298200jt4 interfaceC1298200jt4 = this.LLILZLL;
        if (interfaceC1298200jt4 instanceof C1313490kHj) {
            ((SDUIBaseUI) interfaceC1298200jt4).setBoxShadow(readableArray);
        }
    }

    @InterfaceC1291270jht(name = "clip-radius")
    public void setClipToRadius(InterfaceC1314540kJQ interfaceC1314540kJQ) {
        boolean z;
        if (interfaceC1314540kJQ == null) {
            return;
        }
        ReadableType type = interfaceC1314540kJQ.getType();
        if (type == ReadableType.Boolean) {
            this.LLLFZ = interfaceC1314540kJQ.asBoolean();
            return;
        }
        if (type != ReadableType.String) {
            return;
        }
        String strAsString = interfaceC1314540kJQ.asString();
        if (!strAsString.equalsIgnoreCase("true") && !strAsString.equalsIgnoreCase("yes")) {
            z = false;
        } else {
            z = true;
        }
        this.LLLFZ = z;
    }

    @InterfaceC1291270jht(name = "dataset")
    public void setDataset(ReadableMap readableMap) {
        this.LLJILLL = readableMap;
    }

    @InterfaceC1291270jht(name = "bitmap-gradient")
    public void setEnableBitmapGradient(boolean z) {
        BackgroundDrawable backgroundDrawableLIZIZ = this.LLJ.LIZIZ();
        backgroundDrawableLIZIZ.LJIJJLI.LLIZLLLIL = z;
        backgroundDrawableLIZIZ.invalidateSelf();
        LJJJJZ();
    }

    @InterfaceC1291270jht(name = "event-through")
    public void setEventThrough(InterfaceC1314540kJQ interfaceC1314540kJQ) {
        EnumC1314060kIe enumC1314060kIe;
        if (interfaceC1314540kJQ == null) {
            this.LLLLIIIILLL = EnumC1314060kIe.Undefined;
        }
        try {
            if (interfaceC1314540kJQ.asBoolean()) {
                enumC1314060kIe = EnumC1314060kIe.Enable;
            } else {
                enumC1314060kIe = EnumC1314060kIe.Disable;
            }
            this.LLLLIIIILLL = enumC1314060kIe;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            th.toString();
            this.LLLLIIIILLL = EnumC1314060kIe.Undefined;
        }
    }

    @InterfaceC1291270jht(name = "exposure-scene")
    public void setExposureScene(String str) {
        this.LLILZ.LJ(this);
    }

    @InterfaceC1291270jht(name = "exposure-screen-margin-bottom")
    public void setExposureScreenMarginBottom(String str) {
        this.LLILZ.LJ(this);
        C1312930kGp.LIZ(str);
    }

    @InterfaceC1291270jht(name = "exposure-screen-margin-left")
    public void setExposureScreenMarginLeft(String str) {
        this.LLILZ.LJ(this);
        C1312930kGp.LIZ(str);
    }

    @InterfaceC1291270jht(name = "exposure-screen-margin-right")
    public void setExposureScreenMarginRight(String str) {
        this.LLILZ.LJ(this);
        C1312930kGp.LIZ(str);
    }

    @InterfaceC1291270jht(name = "exposure-screen-margin-top")
    public void setExposureScreenMarginTop(String str) {
        this.LLILZ.LJ(this);
        C1312930kGp.LIZ(str);
    }

    @InterfaceC1291270jht(name = "focusable")
    public void setFocusable(Boolean bool) {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLLI = zBooleanValue;
    }

    @InterfaceC1291270jht(defaultFloat = 1.0E21f, name = "font-size")
    public void setFontSize(float f) {
        if (f != 1.0E21f) {
            this.LLL = f;
            this.LLJ.LIZLLL = f;
        }
    }

    @InterfaceC1291270jht(name = "idSelector")
    public void setIdSelector(String str) {
        this.LLJILJIL = str;
    }

    @InterfaceC1291270jht(name = "ignore-focus")
    public void setIgnoreFocus(Boolean bool) {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLLII = zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    @X.InterfaceC1291270jht(name = "image-config")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setImageConfig(java.lang.String r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto Lb1
            java.lang.String r0 = ""
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto Lb1
            java.lang.String r0 = "ALPHA_8"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L37
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            r3.LLLJIL = r0
        L17:
            X.0kI3 r0 = r3.LLJ
            if (r0 == 0) goto Lb0
            com.bytedance.sdui.render.tasm.behavior.ui.utils.BackgroundDrawable r2 = r0.LIZIZ()
            X.0kI8 r0 = r2.LJIJJLI
            if (r0 == 0) goto Lb0
            java.util.List<X.0kIu> r0 = r0.LL
            if (r0 == 0) goto Lad
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L2d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lad
            r1.next()
            goto L2d
        L37:
            java.lang.String r0 = "RGB_565"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L70
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 25
            if (r1 != r0) goto L6b
            java.lang.String r1 = android.os.Build.BRAND
            if (r1 == 0) goto L6b
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "meizu"
            int r1 = r1.indexOf(r0)
            r0 = -1
            if (r1 <= r0) goto L6b
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L6b
            java.lang.String r0 = "15"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L6b
            r3.LLLJIL = r2
            goto L17
        L6b:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            r3.LLLJIL = r0
            goto L17
        L70:
            java.lang.String r0 = "ARGB_8888"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L7d
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r3.LLLJIL = r0
            goto L17
        L7d:
            java.lang.String r0 = "RGBA_F16"
            boolean r0 = r4.equalsIgnoreCase(r0)
            r1 = 26
            if (r0 == 0) goto L93
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L90
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_F16
            r3.LLLJIL = r0
            goto L17
        L90:
            r3.LLLJIL = r2
            goto L17
        L93:
            java.lang.String r0 = "HARDWARE"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto La9
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto La5
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.HARDWARE
            r3.LLLJIL = r0
            goto L17
        La5:
            r3.LLLJIL = r2
            goto L17
        La9:
            r3.LLLJIL = r2
            goto L17
        Lad:
            r2.invalidateSelf()
        Lb0:
            return
        Lb1:
            r3.LLLJIL = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI.setImageConfig(java.lang.String):void");
    }

    @InterfaceC1291270jht(name = "intersection-observers")
    public void setIntersectionObservers(ReadableArray readableArray) {
        C1298370jtL c1298370jtL = this.LLILZ.LLIZ.get();
        c1298370jtL.getClass();
        C1290750jh3.LJ(new ARunnableS89S0200000_20(c1298370jtL, this, 183));
        if (readableArray != null && this.LLJIJIL.containsKey("intersection")) {
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map = readableArray.getMap(i);
                if (map != null) {
                    C1298170jt1 c1298170jt1 = new C1298170jt1(this.LLILZ.LLIZ.get(), map, this);
                    C1298370jtL c1298370jtL2 = this.LLILZ.LLIZ.get();
                    c1298370jtL2.getClass();
                    C1290750jh3.LJ(new ARunnableS89S0200000_20(c1298370jtL2, c1298170jt1, 182));
                }
            }
        }
    }

    @InterfaceC1291270jht(defaultBoolean = false, name = "native-interaction-enabled")
    public void setNativeInteractionEnabled(boolean z) {
        this.LLLIL = z;
    }

    @InterfaceC1291270jht(defaultInt = -16777216, name = "outline-color")
    public void setOutlineColor(int i) {
        InterfaceC1298200jt4 interfaceC1298200jt4 = this.LLILZLL;
        if (interfaceC1298200jt4 instanceof C1313490kHj) {
            ((SDUIBaseUI) interfaceC1298200jt4).setOutlineColor(i);
        }
    }

    @InterfaceC1291270jht(defaultInt = -1, name = "outline-style")
    public void setOutlineStyle(int i) {
        InterfaceC1298200jt4 interfaceC1298200jt4 = this.LLILZLL;
        if (interfaceC1298200jt4 instanceof C1313490kHj) {
            ((C1313490kHj) interfaceC1298200jt4).LJZ().LIZ = EnumC1313600kHu.parse(i);
        }
    }

    @InterfaceC1291270jht(defaultInt = 0, name = "outline-width")
    public void setOutlineWidth(float f) {
        InterfaceC1298200jt4 interfaceC1298200jt4 = this.LLILZLL;
        if (interfaceC1298200jt4 instanceof C1313490kHj) {
            ((SDUIBaseUI) interfaceC1298200jt4).setOutlineWidth(f);
        }
    }

    @InterfaceC1291270jht(name = "overflow")
    public void setOverflow(Integer num) {
        if (num == null) {
            LJIJJLI();
        } else {
            num.intValue();
        }
    }

    @InterfaceC1291270jht(name = "overflow-x")
    public void setOverflowX(Integer num) {
        if (num == null) {
            LJIJJLI();
        } else {
            num.intValue();
        }
    }

    @InterfaceC1291270jht(name = "overflow-y")
    public void setOverflowY(Integer num) {
        if (num == null) {
            LJIJJLI();
        } else {
            num.intValue();
        }
    }

    @InterfaceC1291270jht(name = "perspective")
    public void setPerspective(ReadableArray readableArray) {
        this.LLLIIIL = readableArray;
    }

    @InterfaceC1291270jht(name = "react-ref")
    public void setRefIdSelector(String str) {
        this.LLJILJILJ = str;
    }

    @InterfaceC1291270jht(name = "transform-origin")
    public void setTransformOrigin(ReadableArray readableArray) {
        C1314240kIw c1314240kIw;
        this.LLLIIL = true;
        C1314240kIw c1314240kIw2 = C1314240kIw.LJ;
        this.LLLIIIIL = c1314240kIw2;
        if (readableArray == null) {
            return;
        }
        if (readableArray.size() < 2) {
            c1314240kIw = null;
        } else {
            c1314240kIw = new C1314240kIw(readableArray);
        }
        this.LLLIIIIL = c1314240kIw;
        if (c1314240kIw == null) {
            this.LLLIIIIL = c1314240kIw2;
        }
    }

    @InterfaceC1291270jht(defaultBoolean = true, name = "user-interaction-enabled")
    public void setUserInteractionEnabled(boolean z) {
        this.LLLIILIL = z;
    }

    public final boolean LJIIIIZZ(float f, float f2) {
        if (this.LLILZ.LLJILJIL) {
            for (SDUIBaseUI sDUIBaseUI : (ArrayList) this.LLIZLLLIL) {
                float[] fArrLJJIJL = LJJIJL(f, f2, 0, 0, sDUIBaseUI.LJJIJ(), sDUIBaseUI.LJJIL());
                if (sDUIBaseUI.LJJJLL() && sDUIBaseUI.LJIIIZ(fArrLJJIJL[0], fArrLJJIJL[1])) {
                    return true;
                }
            }
            return false;
        }
        float f3 = 0;
        float fLJJIII = ((f + f3) - LJJIII()) - LJJJ();
        float fLJJIIJ = ((f2 + f3) - LJJIIJ()) - LJJJI();
        for (SDUIBaseUI sDUIBaseUI2 : (ArrayList) this.LLIZLLLIL) {
            if (sDUIBaseUI2.LJJJLL() && sDUIBaseUI2.LJIIIZ(fLJJIII, fLJJIIJ)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJIIIZ(float f, float f2) {
        float f3;
        if (this.LLLL) {
            f3 = this.LLLJL * this.LLILZ.getResources().getDisplayMetrics().density;
        } else {
            f3 = 0.0f;
        }
        if (this.LLILZ.LLJILJIL) {
            Rect rectLJJIJ = LJJIJ();
            float f4 = -f3;
            if (f >= f4 && f <= (rectLJJIJ.right - rectLJJIJ.left) + f3 && f2 >= f4 && f2 <= (rectLJJIJ.bottom - rectLJJIJ.top) + f3) {
                return true;
            }
            int i = this.LLLFFI;
            if (i == 0) {
                return false;
            }
            if (i == 1) {
                if (f2 < rectLJJIJ.top || f2 > rectLJJIJ.bottom) {
                    return false;
                }
            } else if (i == 2 && (f < rectLJJIJ.left || f > rectLJJIJ.right)) {
                return false;
            }
            return LJIIIIZZ(f, f2);
        }
        float fLJJJJI = LJJJJI() * LJJIJIIJI();
        float fLJIIZILJ = LJIIZILJ() * LJJIJIIJIL();
        float fLJJIII = ((LJJIII() + (LJJJJI() / 2.0f)) - (fLJJJJI / 2.0f)) + LJJJ();
        float fLJJIIJ = ((LJJIIJ() + (LJIIZILJ() / 2.0f)) - (fLJIIZILJ / 2.0f)) + LJJJI();
        int i2 = new Rect((int) fLJJIII, (int) fLJJIIJ, (int) (fLJJIII + fLJJJJI), (int) (fLJJIIJ + fLJIIZILJ)).left;
        if (i2 - f3 < f && r2.right + f3 > f && r2.top - f3 < f2 && r2.bottom + f3 > f2) {
            return true;
        }
        int i3 = this.LLLFFI;
        if (i3 == 0) {
            return false;
        }
        if (i3 == 1) {
            if (r2.top - f3 >= f2 || r2.bottom + f3 <= f2) {
                return false;
            }
        } else if (i3 == 2 && (i2 - f3 >= f || r2.right + f3 <= f)) {
            return false;
        }
        return LJIIIIZZ(f, f2);
    }

    public InterfaceC1317060kNU LJJJJJ(float f, float f2) {
        boolean zLJIIIZ;
        int size = ((ArrayList) this.LLIZLLLIL).size() - 1;
        SDUIBaseUI sDUIBaseUI = null;
        float f3 = f;
        float f4 = f2;
        while (true) {
            if (size >= 0) {
                SDUIBaseUI sDUIBaseUI2 = (SDUIBaseUI) ListProtector.get(this.LLIZLLLIL, size);
                if (sDUIBaseUI2 instanceof C1313490kHj) {
                    sDUIBaseUI2 = ((C1313490kHj) sDUIBaseUI2).LLLLZI;
                }
                if (sDUIBaseUI2.LJJJLL() && sDUIBaseUI2.LJJJJ()) {
                    float[] fArrLJJIJL = {f, f2};
                    if (this.LLILZ.LLJILJIL) {
                        fArrLJJIJL = LJJIJL(f, f2, 0, 0, sDUIBaseUI2.LJJIJ(), sDUIBaseUI2.LJJIL());
                        zLJIIIZ = sDUIBaseUI2.LJIIIZ(fArrLJJIJL[0], fArrLJJIJL[1]);
                    } else {
                        zLJIIIZ = sDUIBaseUI2.LJIIIZ(f, f2);
                    }
                    if (!zLJIIIZ) {
                        continue;
                    } else {
                        if (sDUIBaseUI2.LLLL) {
                            f3 = fArrLJJIJL[0];
                            f4 = fArrLJJIJL[1];
                            sDUIBaseUI = sDUIBaseUI2;
                            break;
                        }
                        if (sDUIBaseUI == null || sDUIBaseUI.LJJJJIZL() < sDUIBaseUI2.LJJJJIZL() || (sDUIBaseUI.LJJJJIZL() == sDUIBaseUI2.LJJJJIZL() && sDUIBaseUI.LJJJIL() < sDUIBaseUI2.LJJJIL())) {
                            f3 = fArrLJJIJL[0];
                            f4 = fArrLJJIJL[1];
                            sDUIBaseUI = sDUIBaseUI2;
                        }
                    }
                }
                size--;
            } else if (sDUIBaseUI == null) {
                return this;
            }
        }
        if (sDUIBaseUI.LJJJZ() && (sDUIBaseUI instanceof AbstractC1313500kHk)) {
            if (this.LLILZ.LLJILJIL) {
                AbstractC1313500kHk abstractC1313500kHk = (AbstractC1313500kHk) sDUIBaseUI;
                return abstractC1313500kHk.LJLLJ(f3, f4, abstractC1313500kHk);
            }
            AbstractC1313500kHk abstractC1313500kHk2 = (AbstractC1313500kHk) sDUIBaseUI;
            return abstractC1313500kHk2.LJLLJ(f - sDUIBaseUI.LJJIII(), f2 - sDUIBaseUI.LJJIIJ(), abstractC1313500kHk2);
        }
        if (this.LLILZ.LLJILJIL) {
            return sDUIBaseUI.LJJJJJ(f3, f4);
        }
        float f5 = 0;
        return sDUIBaseUI.LJJJJJ(((f + f5) - sDUIBaseUI.LJJIII()) - sDUIBaseUI.LJJJ(), ((f5 + f2) - sDUIBaseUI.LJJIIJ()) - sDUIBaseUI.LJJJI());
    }

    public void LJJJJLL(SDUIBaseUI sDUIBaseUI, int i) {
        ListProtector.add(this.LLIZLLLIL, i, sDUIBaseUI);
        sDUIBaseUI.LJJZZI(this);
    }

    public void LJJZZIII(int i, String str) {
        this.LLJJ = i;
        this.LLJJI = str;
    }

    @InterfaceC1966907n9
    public void boundingClientRect(ReadableMap readableMap, Callback callback) {
        callback.invoke(0, LJJIIZ());
    }

    @InterfaceC1966907n9
    public void requestUIInfo(ReadableMap readableMap, Callback callback) {
        ArrayList arrayList = new ArrayList();
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (readableMap.getBoolean(strNextKey, false)) {
                    arrayList.add(strNextKey);
                }
            }
        }
        C1297860jsW c1297860jsWLJJIIZ = LJJIIZ();
        C1297860jsW c1297860jsW = new C1297860jsW();
        if (arrayList.contains(FollowStatusChangeMethod.PARAM_UID)) {
            c1297860jsW.put(FollowStatusChangeMethod.PARAM_UID, LJIJ());
        }
        if (arrayList.contains("dataset")) {
            c1297860jsW.put("dataset", this.LLJILLL);
        }
        if (arrayList.contains("rect")) {
            c1297860jsW.put("left", c1297860jsWLJJIIZ.get("left"));
            c1297860jsW.put("top", c1297860jsWLJJIIZ.get("top"));
            c1297860jsW.put("right", c1297860jsWLJJIIZ.get("right"));
            c1297860jsW.put("bottom", c1297860jsWLJJIIZ.get("bottom"));
        }
        if (arrayList.contains("size")) {
            c1297860jsW.put("width", c1297860jsWLJJIIZ.get("width"));
            c1297860jsW.put("height", c1297860jsWLJJIIZ.get("height"));
        }
        if (arrayList.contains("scrollOffset")) {
            float f = 0 / this.LLILZ.LLJ.density;
            c1297860jsW.put("scrollLeft", Float.valueOf(f));
            c1297860jsW.put("scrollTop", Float.valueOf(f));
        }
        if (arrayList.contains("node")) {
            c1297860jsW.put("node", new C1297860jsW());
        }
        callback.invoke(0, c1297860jsW);
    }

    @InterfaceC1291280jhu(customType = "Color", names = {"border-left-color", "border-right-color", "border-top-color", "border-bottom-color"})
    public void setBorderColor(int i, Integer num) {
        float fIntValue;
        int i2 = LLLLJ[i + 1];
        float fIntValue2 = 1.0E21f;
        if (num == null) {
            fIntValue = 1.0E21f;
        } else {
            fIntValue = num.intValue() & 16777215;
            fIntValue2 = num.intValue() >>> 24;
        }
        BackgroundDrawable backgroundDrawableLIZIZ = this.LLJ.LIZIZ();
        if (backgroundDrawableLIZIZ.LIZJ == null) {
            backgroundDrawableLIZIZ.LIZJ = new C1314230kIv(0.0f);
        }
        if (!C1314140kIm.LIZ(backgroundDrawableLIZIZ.LIZJ.LIZ[i2], fIntValue)) {
            backgroundDrawableLIZIZ.LIZJ.LIZIZ(fIntValue, i2);
            backgroundDrawableLIZIZ.invalidateSelf();
        }
        if (backgroundDrawableLIZIZ.LIZLLL == null) {
            backgroundDrawableLIZIZ.LIZLLL = new C1314230kIv(255.0f);
        }
        if (!C1314140kIm.LIZ(backgroundDrawableLIZIZ.LIZLLL.LIZ[i2], fIntValue2)) {
            backgroundDrawableLIZIZ.LIZLLL.LIZIZ(fIntValue2, i2);
            backgroundDrawableLIZIZ.invalidateSelf();
        }
    }

    @InterfaceC1291280jhu(names = {"border-radius", "border-top-left-radius", "border-top-right-radius", "border-bottom-right-radius", "border-bottom-left-radius"})
    public void setBorderRadius(int i, ReadableArray readableArray) {
        int i2;
        int i3 = 0;
        if (readableArray != null && readableArray.size() > 0) {
            boolean z = true;
            if (i == 0) {
                if (readableArray.size() != 16) {
                    z = false;
                }
                C1314420kJE.LIZ(z);
                do {
                    i2 = i3 + 1;
                    this.LLJ.LIZLLL(i2, C1314120kIk.LIZ(i3 * 4, readableArray));
                    i3 = i2;
                } while (i2 < 4);
            } else {
                if (readableArray.size() != 4) {
                    z = false;
                }
                C1314420kJE.LIZ(z);
                this.LLJ.LIZLLL(i, C1314120kIk.LIZ(0, readableArray));
            }
            LJJLIIIJILLIZJL(i);
            return;
        }
        if (i != 0) {
            this.LLJ.LIZLLL(i, new C1314120kIk());
        } else {
            do {
                i3++;
                this.LLJ.LIZLLL(i3, new C1314120kIk());
            } while (i3 < 4);
        }
        LJJLIIIJILLIZJL(i);
    }

    @InterfaceC1291280jhu(defaultInt = -1, names = {"border-style", "border-left-style", "border-right-style", "border-top-style", "border-bottom-style"})
    public void setBorderStyle(int i, int i2) {
        C1313690kI3 c1313690kI3 = this.LLJ;
        int i3 = LLLLJ[i];
        BackgroundDrawable backgroundDrawableLIZIZ = c1313690kI3.LIZIZ();
        backgroundDrawableLIZIZ.getClass();
        if (i3 <= 8 && i3 >= 0) {
            if (backgroundDrawableLIZIZ.LJ == null) {
                backgroundDrawableLIZIZ.LJ = new EnumC1313600kHu[9];
            }
            try {
                EnumC1313600kHu enumC1313600kHu = EnumC1313600kHu.parse(i2);
                EnumC1313600kHu[] enumC1313600kHuArr = backgroundDrawableLIZIZ.LJ;
                if (enumC1313600kHuArr[i3] != enumC1313600kHu) {
                    enumC1313600kHuArr[i3] = enumC1313600kHu;
                    backgroundDrawableLIZIZ.invalidateSelf();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @InterfaceC1291280jhu(names = {"border-width", "border-left-width", "border-right-width", "border-top-width", "border-bottom-width"})
    public void setBorderWidth(int i, int i2) {
        C1313690kI3 c1313690kI3 = this.LLJ;
        int i3 = LLLLJ[i];
        float f = i2;
        BackgroundDrawable backgroundDrawableLIZIZ = c1313690kI3.LIZIZ();
        if (!C1314140kIm.LIZ(backgroundDrawableLIZIZ.LIZ.LIZ[i3], f)) {
            backgroundDrawableLIZIZ.LIZ.LIZIZ(f, i3);
            backgroundDrawableLIZIZ.LJIIZILJ = true;
            backgroundDrawableLIZIZ.LJIILJJIL();
            backgroundDrawableLIZIZ.invalidateSelf();
        }
    }

    public final float[] LJJIJL(float f, float f2, int i, int i2, Rect rect, Matrix matrix) {
        float[] fArr = {(f + i) - rect.left, (f2 + i2) - rect.top};
        this.LLLLIILLL.reset();
        Matrix matrix2 = this.LLLLIILLL;
        matrix.invert(matrix2);
        float[] fArr2 = {fArr[0], fArr[1]};
        matrix2.mapPoints(fArr2);
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        return fArr;
    }

    public void LJLIIL(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        LJLIL(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
        LJJLIIIJJIZ();
        Map<String, C1297940jse> map = this.LLJIJIL;
        if (map != null && map.containsKey("layoutchange")) {
            this.LLILZ.LLILLL.LIZJ(new C1294230jmf(this.LLJJ, "layoutchange", LJJIIZ()));
        }
    }

    public final void LJLIL(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        this.LLJJIJI = i;
        this.LLJJIJIIJIL = i2;
        this.LLJJJIL = i3;
        this.LLJJJJ = i4;
        this.LLJJJ = i2;
        this.LLJJIJIL = i;
        this.LLJJJJJIL = i5;
        this.LLJJJJLIIL = i7;
        this.LLJJLIIIJLLLLLLLZ = i8;
        this.LLJJL = i6;
        this.LLJL = i9;
        this.LLJLIL = i10;
        this.LLJLILLLLZIIL = i11;
        this.LLJLL = i12;
        this.LLJLLIL = i14;
        this.LLJZIJLIL = i16;
        this.LLJLLL = i13;
        this.LLJZ = i15;
        this.LLJJIII = rect;
    }
}
