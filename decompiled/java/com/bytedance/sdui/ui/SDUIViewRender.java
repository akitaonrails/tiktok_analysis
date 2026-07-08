package com.bytedance.sdui.ui;

import X.AbstractC1317090kNX;
import X.AbstractC1317190kNh;
import X.C1291190jhl;
import X.C1298370jtL;
import X.C1298420jtQ;
import X.C1312690kGR;
import X.C1313470kHh;
import X.C1313480kHi;
import X.C1313660kI0;
import X.C1315070kKH;
import X.C1315530kL1;
import X.C1317070kNV;
import X.C1317080kNW;
import X.C1317100kNY;
import X.C1317110kNZ;
import X.C1317130kNb;
import X.C1317140kNc;
import X.C1317150kNd;
import X.C1317160kNe;
import X.C1317210kNj;
import X.C1317760kOc;
import X.C1861307Qt;
import X.C19719512Dh;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1300270jwP;
import X.InterfaceC1298410jtP;
import X.InterfaceC1317060kNU;
import X.InterfaceC1317370kNz;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdui.event.SDUIEventManager;
import com.bytedance.sdui.render.tasm.base.TraceEvent;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.sdui.render.tasm.utils.DisplayMetricsHolder;
import com.bytedance.sdui.serializedData.common.UpdateDataEvent;
import com.bytedance.sdui.serializedData.common.event.ClientEvent;
import com.bytedance.sdui.serializedData.common.event.UpdateViewPortEvent;
import com.bytedance.sdui.serializedData.common.operations.EventAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS298S0300000_20;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class SDUIViewRender {
    public C1312690kGR LIZ;
    public C1313470kHh LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public C1317150kNd LJ;
    public final C1317130kNb LJFF;
    public C1317070kNV LJI;
    public C1317160kNe LJII;
    public C1298370jtL LJIIIIZZ;
    public C1317080kNW LJIIIZ;
    public C1313480kHi LJIIJ;
    public long LJIIJJI;
    public boolean LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public List<InterfaceC1317370kNz> LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;

    public static class a extends AbstractC1317190kNh {
        public long LIZ;

        @Override // X.AbstractC1317190kNh
        public final void LIZIZ() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onDataUpdated time:");
            sbLIZ.append(System.currentTimeMillis() - this.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // X.AbstractC1317190kNh
        public final void LIZLLL() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFirstScreen time: ");
            sbLIZ.append(System.currentTimeMillis() - this.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // X.AbstractC1317190kNh
        public final void LJ() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLoadSuccess time: ");
            sbLIZ.append(System.currentTimeMillis() - this.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // X.AbstractC1317190kNh
        public final void LJI() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPageUpdate time:");
            sbLIZ.append(System.currentTimeMillis() - this.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // X.AbstractC1317190kNh
        public final void LJFF(String str) {
            this.LIZ = System.currentTimeMillis();
        }
    }

    public final boolean LIZ() {
        InterfaceC1317060kNU interfaceC1317060kNUParent = this.LJI.LIZJ;
        if (interfaceC1317060kNUParent != null) {
            while (interfaceC1317060kNUParent.parent() != interfaceC1317060kNUParent) {
                if (!interfaceC1317060kNUParent.LJ()) {
                    interfaceC1317060kNUParent = interfaceC1317060kNUParent.parent();
                    if (interfaceC1317060kNUParent == null) {
                        break;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LIZIZ() {
        C1313470kHh c1313470kHh = this.LIZIZ;
        C1313480kHi c1313480kHi = new C1313480kHi(c1313470kHh);
        this.LJIIJ = c1313480kHi;
        this.LIZ = new C1312690kGR(c1313480kHi);
        c1313470kHh.getClass();
        this.LJ.LLILLL = new C1298420jtQ(this.LIZ);
        C1317150kNd c1317150kNd = this.LJ;
        C1317210kNj c1317210kNj = new C1317210kNj(c1317150kNd);
        c1317210kNj.LIZ = this.LJII.LIZIZ;
        c1317150kNd.LLJILLL = c1317210kNj;
        this.LJIIIIZZ = new C1298370jtL(this.LJ);
        C1317150kNd c1317150kNd2 = this.LJ;
        C1298370jtL c1298370jtL = this.LJIIIIZZ;
        c1317150kNd2.getClass();
        c1317150kNd2.LLIZ = new WeakReference<>(c1298370jtL);
        C1298420jtQ c1298420jtQ = this.LJ.LLILLL;
        C1298370jtL c1298370jtL2 = this.LJIIIIZZ;
        if (!c1298420jtQ.LIZIZ.contains(c1298370jtL2)) {
            c1298420jtQ.LIZIZ.add(c1298370jtL2);
        }
        C1312690kGR c1312690kGR = this.LIZ;
        C1317150kNd c1317150kNd3 = this.LJ;
        c1312690kGR.getClass();
        new WeakReference(c1317150kNd3);
        C1317110kNZ c1317110kNZ = new C1317110kNZ(this.LJ, this.LJIIJ);
        String str = this.LJII.LJIIIZ;
        HashMap<String, C1315070kKH> map = C1861307Qt.LIZ;
        C1315070kKH c1315070kKH = map.get(str);
        if (c1315070kKH != null) {
            C19719512Dh.LIZJ(map).remove(str);
            C1317150kNd c1317150kNd4 = this.LJ;
            c1317150kNd4.LLJJ = c1315070kKH;
            c1315070kKH.LIZ = c1317150kNd4;
            throw null;
        }
        C1317760kOc c1317760kOc = new C1317760kOc(this.LJ, c1317110kNZ);
        final C1317150kNd c1317150kNd5 = this.LJ;
        c1317150kNd5.LLJJ = c1317760kOc;
        C1298420jtQ c1298420jtQ2 = c1317150kNd5.LLILLL;
        InterfaceC1298410jtP interfaceC1298410jtP = new InterfaceC1298410jtP(c1317150kNd5) { // from class: X.0kNT
            public final AbstractC1317090kNX LIZ;
            public final Map<String, Class<? extends InterfaceC1317290kNr>> LIZIZ;

            {
                this.LIZ = c1317150kNd5;
                HashMap map2 = new HashMap();
                this.LIZIZ = map2;
                map2.put("sdui.update_props", C1298560jte.class);
                map2.put("sdui.debounce", C1317220kNk.class);
                map2.put("musicItemClick", C1316980kNM.class);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
            
                r5.LIZ.LLJJJ.LIZJ(r6, r7);
             */
            @Override // X.InterfaceC1298410jtP
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.EnumC1298380jtM r6, X.C1298400jtO r7) {
                /*
                    r5 = this;
                    if (r7 != 0) goto L3
                    return
                L3:
                    X.0kNX r1 = r5.LIZ     // Catch: java.lang.Exception -> L70
                    int r0 = r7.LIZ     // Catch: java.lang.Exception -> L70
                    com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI r3 = r1.LIZ(r0)     // Catch: java.lang.Exception -> L70
                    if (r3 == 0) goto L41
                    java.lang.String r2 = r7.LIZIZ     // Catch: java.lang.Exception -> L70
                    r1 = r3
                L10:
                    java.util.Map r0 = r1.LIZIZ()     // Catch: java.lang.Exception -> L70
                    if (r0 == 0) goto L2f
                    java.util.Map r0 = r1.LIZIZ()     // Catch: java.lang.Exception -> L70
                    boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Exception -> L70
                    if (r0 == 0) goto L2f
                L20:
                    X.0kNX r0 = r5.LIZ     // Catch: java.lang.Exception -> L70
                    com.bytedance.sdui.event.SDUIEventManager r0 = r0.LLJJJ     // Catch: java.lang.Exception -> L70
                    r0.LIZJ(r6, r7)     // Catch: java.lang.Exception -> L70
                L27:
                    X.0kNX r1 = r5.LIZ     // Catch: java.lang.Exception -> L70
                    java.lang.String r0 = r7.LIZIZ     // Catch: java.lang.Exception -> L70
                    r5.LIZIZ(r1, r0, r3)     // Catch: java.lang.Exception -> L70
                    goto L40
                L2f:
                    X.0kNU r1 = r1.parent()     // Catch: java.lang.Exception -> L70
                    if (r1 != 0) goto L10
                    java.lang.String r1 = r7.LIZIZ     // Catch: java.lang.Exception -> L70
                    java.lang.String r0 = "touchstart"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L70
                    if (r0 == 0) goto L27
                    goto L20
                L40:
                    return
                L41:
                    java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> L70
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L70
                    java.lang.String r0 = "handle event "
                    r1.append(r0)     // Catch: java.lang.Exception -> L70
                    java.lang.String r0 = r7.LIZIZ     // Catch: java.lang.Exception -> L70
                    r1.append(r0)     // Catch: java.lang.Exception -> L70
                    java.lang.String r0 = ", type: "
                    r1.append(r0)     // Catch: java.lang.Exception -> L70
                    r1.append(r6)     // Catch: java.lang.Exception -> L70
                    java.lang.String r0 = " failed, sign "
                    r1.append(r0)     // Catch: java.lang.Exception -> L70
                    int r0 = r7.LIZ     // Catch: java.lang.Exception -> L70
                    r1.append(r0)     // Catch: java.lang.Exception -> L70
                    java.lang.String r0 = " is null"
                    r1.append(r0)     // Catch: java.lang.Exception -> L70
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L70
                    r2.<init>(r0)     // Catch: java.lang.Exception -> L70
                    throw r2     // Catch: java.lang.Exception -> L70
                L70:
                    r4 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
                    X.0kNX r0 = r5.LIZ
                    X.0kNb r3 = r0.LLIZLLLIL
                    X.0jhl r2 = new X.0jhl
                    r1 = 107(0x6b, float:1.5E-43)
                    java.lang.String r0 = android.util.Log.getStackTraceString(r4)
                    r2.<init>(r1, r0)
                    r3.LJII(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1317050kNT.LIZ(X.0jtM, X.0jtO):void");
            }

            public final void LIZIZ(AbstractC1317090kNX abstractC1317090kNX, String str2, SDUIBaseUI sDUIBaseUI) {
                int size;
                for (InterfaceC1317060kNU interfaceC1317060kNUParent = sDUIBaseUI; interfaceC1317060kNUParent != null; interfaceC1317060kNUParent = interfaceC1317060kNUParent.parent()) {
                    if (interfaceC1317060kNUParent.LIZLLL() != null && interfaceC1317060kNUParent.LIZLLL().containsKey(str2)) {
                        List<EventAction> list = interfaceC1317060kNUParent.LIZLLL().get(str2);
                        if (list != null && list.size() - 1 >= 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                EventAction eventAction = (EventAction) ListProtector.get(list, i);
                                try {
                                    if (!LIZJ(abstractC1317090kNX, interfaceC1317060kNUParent.getSign(), eventAction.LIZ, eventAction.LIZIZ)) {
                                        abstractC1317090kNX.LLJILLL.LIZ(C1317210kNj.LIZJ, eventAction.LIZ, eventAction.LIZIZ);
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    abstractC1317090kNX.LLIZLLLIL.LJII(new C1291190jhl(101, e.getMessage()));
                                }
                                if (i2 <= size) {
                                    i = i2;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        if (!interfaceC1317060kNUParent.LJFF()) {
                            return;
                        }
                    }
                }
            }

            public final boolean LIZJ(AbstractC1317090kNX abstractC1317090kNX, int i, String str2, String str3) {
                InterfaceC1317290kNr interfaceC1317290kNr;
                Map<String, Class<? extends InterfaceC1317290kNr>> map2 = this.LIZIZ;
                if (map2 != null) {
                    if (((HashMap) map2).containsKey(str2) && (interfaceC1317290kNr = (InterfaceC1317290kNr) ((Class) ((HashMap) this.LIZIZ).get(str2)).newInstance()) != null) {
                        interfaceC1317290kNr.LIZIZ(abstractC1317090kNX);
                        interfaceC1317290kNr.LIZ(i, str3);
                        return true;
                    }
                    return false;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            }
        };
        if (c1298420jtQ2.LIZIZ.contains(interfaceC1298410jtP)) {
            return;
        }
        c1298420jtQ2.LIZIZ.add(interfaceC1298410jtP);
    }

    public final void LIZLLL() {
        C1313660kI0 c1313660kI0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynxview onDetachedFromWindow ");
        sbLIZ.append(toString());
        C2188811AlT.LIZIZ(sbLIZ);
        TraceEvent.LIZ("onDetachedFromWindow");
        C1313470kHh c1313470kHh = this.LIZIZ;
        if (c1313470kHh != null && (c1313660kI0 = c1313470kHh.LIZIZ) != null) {
            c1313660kI0.LJJLIIIJJI();
        }
        Iterator it2 = ((ArrayList) this.LJIILL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1317370kNz) it2.next()).LIZIZ();
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        C1312690kGR c1312690kGR = this.LIZ;
        if (c1312690kGR != null) {
            c1312690kGR.LIZ = true;
            this.LIZ = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0239 A[LOOP:5: B:101:0x0235->B:103:0x0239, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e2 A[EDGE_INSN: B:79:0x01e2->B:81:0x01e5 BREAK  A[LOOP:7: B:72:0x01c9->B:78:0x01df]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0204 A[LOOP:3: B:90:0x0202->B:91:0x0204, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdui.ui.SDUIViewRender.LIZJ(android.view.MotionEvent):boolean");
    }

    public final void LJFF(int i, int i2) {
        if (this.LIZ == null) {
            return;
        }
        if (this.LIZJ == i && this.LIZLLL == i2 && !this.LJIILLIIL) {
            return;
        }
        if (this.LJIILLIIL) {
            this.LJIILLIIL = false;
        }
        int iFromMeasureSpec = EnumC1300270jwP.fromMeasureSpec(i);
        int size = View.MeasureSpec.getSize(i);
        int iFromMeasureSpec2 = EnumC1300270jwP.fromMeasureSpec(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        SDUIEventManager sDUIEventManager = this.LJ.LLJJJ;
        sDUIEventManager.getClass();
        ClientEvent clientEvent = new ClientEvent();
        UpdateViewPortEvent updateViewPortEvent = new UpdateViewPortEvent();
        updateViewPortEvent.LIZ = size;
        updateViewPortEvent.LIZIZ = iFromMeasureSpec;
        updateViewPortEvent.LIZJ = size2;
        updateViewPortEvent.LIZLLL = iFromMeasureSpec2;
        clientEvent.LJI = updateViewPortEvent;
        sDUIEventManager.LIZ(clientEvent, true);
        this.LIZJ = i;
        this.LIZLLL = i2;
    }

    public void updateData(Map<String, Object> map, String str) {
        SDUIEventManager sDUIEventManager = this.LJ.LLJJJ;
        JSONObject jSONObject = new JSONObject(map);
        sDUIEventManager.getClass();
        ClientEvent clientEvent = new ClientEvent();
        UpdateDataEvent updateDataEvent = new UpdateDataEvent();
        updateDataEvent.LIZ = C786410Ut5.J3(jSONObject);
        updateDataEvent.LIZIZ = str;
        clientEvent.LJIIIIZZ = updateDataEvent;
        sDUIEventManager.LIZ(clientEvent, true);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0kNX, X.0kNd] */
    public SDUIViewRender(final Context context, final C1317080kNW c1317080kNW, C1317160kNe c1317160kNe) {
        DisplayMetrics displayMetricsLIZJ;
        int i;
        C1317130kNb c1317130kNb = new C1317130kNb();
        this.LJFF = c1317130kNb;
        this.LJIIJJI = -1L;
        this.LJIIL = false;
        this.LJIILLIIL = true;
        this.LJIIZILJ = false;
        this.LJIILIIL = System.currentTimeMillis();
        this.LJIIIZ = c1317080kNW;
        this.LJII = c1317160kNe;
        c1317160kNe.getClass();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        DisplayMetricsHolder.LIZIZ();
        synchronized (DisplayMetricsHolder.class) {
            try {
                if (DisplayMetricsHolder.LIZ == null) {
                    DisplayMetricsHolder.LIZ = new DisplayMetrics();
                }
                DisplayMetricsHolder.LIZ.setTo(displayMetrics);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        context.getResources().getConfiguration();
        DisplayMetricsHolder.LIZIZ();
        DisplayMetricsHolder.LIZLLL(DisplayMetricsHolder.LIZ(context));
        final DisplayMetrics displayMetricsLIZIZ = DisplayMetricsHolder.LIZIZ();
        int i2 = c1317160kNe.LJII;
        if (i2 != -1 && (i = c1317160kNe.LJIIIIZZ) != -1) {
            displayMetricsLIZIZ.widthPixels = i2;
            displayMetricsLIZIZ.heightPixels = i;
            DisplayMetricsHolder.LJ(i2, i);
        }
        ?? r0 = new AbstractC1317090kNX(context, displayMetricsLIZIZ) { // from class: X.0kNd
            @Override // android.content.ContextWrapper
            public final void attachBaseContext(Context context2) {
                if (NxRewordManager.LJIILIIL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("attachBaseContextWrapper: ");
                    sbLIZ.append(Log.getStackTraceString(new Throwable(context2.toString())));
                    C2188811AlT.LIZIZ(sbLIZ);
                    context2 = new C817700W5w(context2, false);
                }
                super.attachBaseContext(context2);
            }

            @Override // X.AbstractC1317090kNX, X.InterfaceC1297970jsh
            public final void handleException(Exception exc) {
                this.LLJJJJJIL.LJ(105, null, exc, null);
            }

            @Override // X.AbstractC1317090kNX
            public final void LIZJ(Exception exc, int i3, JSONObject jSONObject) {
                this.LLJJJJJIL.LJ(i3, null, exc, jSONObject);
            }
        };
        this.LJ = r0;
        r0.LLIZLLLIL = c1317130kNb;
        this.LIZIZ = new C1313470kHh(this.LJ, this.LJII.LIZ, this.LJIIIZ);
        C1317150kNd c1317150kNd = this.LJ;
        C1313470kHh c1313470kHh = this.LIZIZ;
        c1317150kNd.getClass();
        c1317150kNd.LLILZLL = new WeakReference<>(c1313470kHh);
        C1317140kNc c1317140kNc = c1317150kNd.LLJIJIL;
        C1313660kI0 c1313660kI0 = c1313470kHh.LIZIZ;
        c1317140kNc.getClass();
        c1317140kNc.LIZIZ = new WeakReference<>(c1313660kI0);
        if ((c1313660kI0 != null && (displayMetricsLIZJ = DisplayMetricsHolder.LIZ(c1313660kI0.LLILZ)) != null && (displayMetricsLIZJ.widthPixels != 0 || displayMetricsLIZJ.heightPixels != 0)) || (displayMetricsLIZJ = DisplayMetricsHolder.LIZJ()) != null) {
            new Rect(0, 0, displayMetricsLIZJ.widthPixels, displayMetricsLIZJ.heightPixels);
        }
        C1317070kNV c1317070kNV = new C1317070kNV(this.LIZIZ);
        this.LJI = c1317070kNV;
        C1317150kNd c1317150kNd2 = this.LJ;
        c1317150kNd2.LLILZ = c1317070kNV;
        C1317100kNY c1317100kNY = c1317150kNd2.LLJJJJ;
        c1317100kNY.getClass();
        c1317100kNY.LIZIZ(-1, -1, "create_page");
        C1317150kNd c1317150kNd3 = this.LJ;
        C1317160kNe c1317160kNe2 = this.LJII;
        c1317150kNd3.LLJJI = c1317160kNe2.LIZLLL;
        c1317150kNd3.LLJJIJIL = c1317160kNe2.LJ;
        c1317150kNd3.LLJJIJIIJIL = c1317160kNe2.LIZJ;
        LJFF(c1317160kNe.LJFF, c1317160kNe.LJI);
        a aVar = new a();
        if (!c1317130kNb.LIZ.contains(aVar)) {
            c1317130kNb.LIZ.add(aVar);
        }
        AbstractC1317190kNh abstractC1317190kNh = new AbstractC1317190kNh(c1317080kNW) { // from class: X.0kON
            public final C1317080kNW LIZ;

            /* JADX WARN: Type inference failed for: r4v0, types: [X.0pgs] */
            @Override // X.AbstractC1317190kNh
            public final void LIZJ() {
                Object c098200Yq;
                C1317080kNW c1317080kNW2 = this.LIZ;
                ?? r4 = new InterfaceC1317630kOP() { // from class: X.0pgs
                    @Override // X.InterfaceC1317630kOP
                    public final void LIZ(C1317650kOR c1317650kOR) {
                        boolean z;
                        C1520200pf8 c1520200pf8 = C1520200pf8.LIZ;
                        C1520360pfO c1520360pfO = new C1520360pfO("sdui_white_screen_result");
                        C1317610kON c1317610kON = this.LIZ;
                        JSONObject jSONObject = new JSONObject();
                        c1317610kON.getClass();
                        double d = c1317650kOR.LIZJ.LIZIZ;
                        if ((d >= 0.8d && r9.LIZ < 0.05d) || (d >= 0.5d && r9.LIZ < 0.01d)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        jSONObject.put("ret", z);
                        jSONObject.put("detectElapse", c1317650kOR.LIZ);
                        jSONObject.put("checkElapse", c1317650kOR.LIZIZ);
                        jSONObject.put("effectiveAreaRatio", Float.valueOf(c1317650kOR.LIZJ.LIZ));
                        jSONObject.put("maxBlankAreaRatio", Float.valueOf(c1317650kOR.LIZJ.LIZIZ));
                        jSONObject.put("blankBitmapWidth", c1317650kOR.LIZJ.LIZLLL);
                        jSONObject.put("blankBitmapHeight", c1317650kOR.LIZJ.LJ);
                        jSONObject.put("validViewCount", c1317650kOR.LIZJ.LJFF);
                        c1520360pfO.LIZLLL = jSONObject;
                        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                        C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                        c1520200pf8.getClass();
                        C1520200pf8.LIZ(c1520350pfNLIZ);
                    }
                };
                if (c1317080kNW2 == null) {
                    r4.LIZ(new C1317650kOR());
                    return;
                }
                C1317790kOf c1317790kOf = new C1317790kOf(c1317080kNW2.getWidth(), c1317080kNW2.getHeight());
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1313860kIK c1313860kIK = C1313860kIK.LIZ;
                c1313860kIK.getClass();
                try {
                    Rect rectLIZJ = C1313860kIK.LIZJ(c1317080kNW2);
                    C1313860kIK.LIZIZ(c1317080kNW2, rectLIZJ, new HashSet(), new AwS298S0300000_20(rectLIZJ, c1313860kIK, c1317790kOf, 1));
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    c1317790kOf.LIZ(0, 0, c1317080kNW2.getWidth(), c1317080kNW2.getHeight(), 1);
                    C1520960pgM.LIZIZ(thM5exceptionOrNullimpl);
                }
                final C1317620kOO c1317620kOO = new C1317620kOO(c1317790kOf, r4, System.currentTimeMillis() - jCurrentTimeMillis);
                C824310WVh.LIZ(new Runnable() { // from class: X.0UwT
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            c1317620kOO.invoke();
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            if (!C2179971ATj.LIZ(th3)) {
                                throw th3;
                            }
                        }
                    }
                });
            }

            {
                this.LIZ = c1317080kNW;
            }
        };
        if (!c1317130kNb.LIZ.contains(abstractC1317190kNh)) {
            c1317130kNb.LIZ.add(abstractC1317190kNh);
        }
        this.LJIILJJIL = System.currentTimeMillis();
        this.LJIILL = new ArrayList();
        LIZIZ();
        this.LIZIZ.LJI.LIZJ(this.LJIILIIL, "setup_create_lynx_start", null);
        this.LIZIZ.LJI.LIZJ(this.LJIILJJIL, "setup_create_lynx_end", null);
    }

    public final void LJ(int i, String str, Throwable th, JSONObject jSONObject) {
        String str2 = "error";
        if (TextUtils.isEmpty(str)) {
            if (th != null) {
                str = Log.getStackTraceString(th);
                if (str.length() > 900) {
                    str = str.substring(0, 900);
                }
                str2 = "throwable";
            } else {
                str = "Unknown error";
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(str2, str);
            C1315530kL1.LJ().getClass();
            jSONObject2.put("sdk", "0.0.1-rc.48");
            if (jSONObject != null) {
                jSONObject2.put("user_define_info", jSONObject);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        this.LJFF.LJII(new C1291190jhl(i, jSONObject2));
        toString();
        C786410Ut5.J3(jSONObject2);
    }
}
