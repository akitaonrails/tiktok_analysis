package com.bytedance.sdui.components.list;

import X.AbstractC1313500kHk;
import X.AbstractC1313520kHm;
import X.AbstractC1317090kNX;
import X.C1291290jhv;
import X.C1294240jmg;
import X.C1297910jsb;
import X.C1297940jse;
import X.C1314690kJf;
import X.C1315530kL1;
import X.C1317070kNV;
import X.C1317100kNY;
import X.C1317340kNw;
import X.C1317360kNy;
import X.C1317410kO3;
import X.C1317810kOh;
import X.C1339150kx7;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1291270jht;
import X.InterfaceC1314540kJQ;
import X.InterfaceC1317060kNU;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sdui.components.list.ListLayoutManager;
import com.bytedance.sdui.render.bridge.ReadableType;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.sdui.render.tasm.utils.DisplayMetricsHolder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import t76.d;
import t76.e;
import t76.f;
import t76.j;

/* JADX INFO: loaded from: classes21.dex */
public class a extends AbstractC1313500kHk<RecyclerView> {
    public static final /* synthetic */ int LLLZLZ = 0;
    public j LLLLZI;
    public t76.a LLLLZIL;
    public f LLLLZLL;
    public e LLLLZLLIL;
    public final boolean LLLLZLLLI;
    public boolean LLLZ;
    public String LLLZI;
    public boolean LLLZIIL;
    public int LLLZIL;
    public boolean LLLZL;
    public boolean LLLZLL;

    /* JADX INFO: renamed from: com.bytedance.sdui.components.list.a$a, reason: collision with other inner class name */
    public class C0008a extends RecyclerView {
        public final WeakReference<AbstractC1317090kNX> LL;
        public final WeakReference<AbstractC1313520kHm> LLILLJJLI;
        public final boolean LLILLL;

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
        public final void requestLayout() {
            j jVar = a.this.LLLLZI;
            if (jVar != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("rl:");
                sbLIZ.append(isLayoutRequested() ? "t" : "f");
                jVar.LLIZ.add(C2188811AlT.LIZIZ(sbLIZ));
            }
            a aVar = a.this;
            aVar.getClass();
            JSONObject jSONObject = new JSONObject();
            if (!isInLayout()) {
                boolean z = false;
                for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                    boolean zIsLayoutRequested = parent.isLayoutRequested();
                    try {
                        jSONObject.put(parent.getClass().getName(), zIsLayoutRequested);
                        if (zIsLayoutRequested) {
                            z = true;
                        } else if (z) {
                            if (C1317810kOh.LJIILJJIL) {
                                parent.requestLayout();
                                try {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("after:");
                                    sbLIZ2.append(parent.getClass().getName());
                                    jSONObject.put(C2188811AlT.LIZIZ(sbLIZ2), parent.isLayoutRequested());
                                } catch (JSONException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    throw new RuntimeException(e);
                                }
                            }
                            aVar.LLILZ.LLJJJ.LIZIZ("layout_failed", jSONObject);
                        } else {
                            continue;
                        }
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        throw new RuntimeException(e2);
                    }
                }
            }
            super.requestLayout();
        }

        public final void LIZJ(boolean z) {
            C1317070kNV c1317070kNV;
            HashSet<Integer> hashSet;
            WeakReference<AbstractC1317090kNX> weakReference = this.LL;
            if (weakReference != null && this.LLILLJJLI != null) {
                AbstractC1317090kNX abstractC1317090kNX = weakReference.get();
                AbstractC1313520kHm abstractC1313520kHm = this.LLILLJJLI.get();
                if (z && abstractC1317090kNX != null && abstractC1313520kHm != null && (c1317070kNV = abstractC1317090kNX.LLILZ) != null && (hashSet = c1317070kNV.LJIIJJI) != null) {
                    hashSet.add(Integer.valueOf(abstractC1313520kHm.LLJJ));
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            a aVar = a.this;
            if (!aVar.LLLZLL) {
                aVar.LLLZLL = aVar.LJZ();
            }
            if (this.LLILLL) {
                return super.onTouchEvent(motionEvent);
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            j jVar = a.this.LLLLZI;
            if (jVar != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("m");
                sbLIZ.append(a.this.LLLLLILLIL.isLayoutRequested());
                jVar.LLIZ.add(C2188811AlT.LIZIZ(sbLIZ));
            }
            a aVar = a.this;
            if (!aVar.LLLZLL) {
                aVar.LLLZLL = aVar.LJZ();
            }
        }

        @Override // android.view.View
        public final void onVisibilityChanged(View view, int i) {
            super.onVisibilityChanged(view, i);
            a aVar = a.this;
            if (!aVar.LLLZLL) {
                aVar.LLLZLL = aVar.LJZ();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public final void scrollBy(int i, int i2) {
            super.scrollBy(i, i2);
        }

        public C0008a(AbstractC1317090kNX abstractC1317090kNX, AbstractC1313520kHm abstractC1313520kHm) {
            super(abstractC1317090kNX);
            this.LLILLL = true;
            if (abstractC1317090kNX != null) {
                this.LL = new WeakReference<>(abstractC1317090kNX);
                this.LLILLJJLI = new WeakReference<>(abstractC1313520kHm);
            }
            getRecycledViewPool().setMaxRecycledViews(0, 10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
            boolean zDispatchNestedPreScroll = super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
            LIZJ(zDispatchNestedPreScroll);
            return zDispatchNestedPreScroll;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, X.InterfaceC20097013kG
        public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
            boolean zDispatchNestedPreScroll = super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
            LIZJ(zDispatchNestedPreScroll);
            return zDispatchNestedPreScroll;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            j jVar = a.this.LLLLZI;
            if (jVar != null) {
                jVar.LLIZ.add("l");
            }
            a aVar = a.this;
            if (!aVar.LLLZLL) {
                aVar.LLLZLL = aVar.LJZ();
            }
        }
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIJLJLI() {
    }

    @Override // X.AbstractC1313500kHk, X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJIIJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_on_screen", this.LLLZLL);
            jSONObject.put("child_cnt", ((ArrayList) this.LLIZLLLIL).size());
            jSONObject.put("width", this.LLJJJIL);
            jSONObject.put("height", this.LLJJJJ);
            jSONObject.put("visible", this.LLLLLJLJLL);
            JSONObject jSONObject2 = new JSONObject();
            for (ViewParent parent = (ViewParent) this.LLLLLILLIL; parent != null; parent = parent.getParent()) {
                try {
                    jSONObject2.put(parent.getClass().getName(), parent.isLayoutRequested());
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException(e);
                }
            }
            jSONObject.put("layout_info", C786410Ut5.J3(jSONObject2));
            jSONObject.put("view_visible", ((RecyclerView) this.LLLLLILLIL).getVisibility());
            jSONObject.put("render_info", this.LLLLZI.LLLFZ());
            jSONObject.put("layout_manager", ((RecyclerView) this.LLLLLILLIL).getLayoutManager());
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C1317100kNY c1317100kNY = this.LLILZ.LLJJJJ;
        boolean z = this.LLLZLL;
        c1317100kNY.LJIIIIZZ = jSONObject;
        c1317100kNY.LIZIZ.put("is_on_screen", String.valueOf(z));
        this.LLLLZIL.LIZ.getClass();
        super.LJIIJ();
    }

    public final boolean LJZ() {
        Rect rect = new Rect();
        DisplayMetrics displayMetricsLIZ = DisplayMetricsHolder.LIZ(this.LLILZ);
        rect.set(0, 0, displayMetricsLIZ.widthPixels, displayMetricsLIZ.heightPixels);
        int[] iArr = new int[2];
        Rect rect2 = new Rect();
        rect2.set(0, 0, this.LLLLLILLIL.getWidth(), this.LLLLLILLIL.getHeight());
        this.LLLLLILLIL.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2.intersect(rect) && this.LLLLLILLIL.isShown();
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIJJIZ() {
        super.LJJLIIIJJIZ();
        int i = this.LLJJL + this.LLJLLIL;
        int i2 = this.LLJJLIIIJLLLLLLLZ + this.LLJZIJLIL;
        this.LLLLLILLIL.setPadding(this.LLJJJJJIL + this.LLJLLL, i, this.LLJJJJLIIL + this.LLJZ, i2);
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIJL() {
        super.LJJLIIIJL();
        if ((this.LLLLZLLIL.LLILLL & 16) != 0) {
            this.LLLZL = true;
        }
    }

    @Override // X.AbstractC1313500kHk, X.AbstractC1313520kHm
    public final void LJLJLJ() {
        super.LJLJLJ();
        if (this.LLLLLILLIL.isLayoutRequested()) {
            LJLLLL();
            ViewGroup viewGroup = (ViewGroup) this.LLLLLILLIL;
            int i = this.LLJJIJI;
            int i2 = this.LLJJIJIIJIL;
            viewGroup.layout(i, i2, this.LLJJJIL + i, this.LLJJJJ + i2);
            this.LLLLZIL.LIZ.getClass();
            this.LLLLLILLIL.setClipBounds(this.LLLFFI == 3 ? null : LJIILLIIL());
        }
    }

    public final void LJZI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutCompleted ");
        sbLIZ.append(this.LLLLZI.getItemCount());
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C1317360kNy.LIZ;
        if (!this.LLLZL || ((ViewGroup) this.LLLLLILLIL).getChildCount() <= 0) {
            return;
        }
        C1297910jsb c1297910jsb = new C1297910jsb();
        c1297910jsb.pushInt(this.LLLLZI.getItemCount());
        e eVar = this.LLLLZLLIL;
        if ((eVar.LLILLL & 16) != 0) {
            C1294240jmg c1294240jmg = new C1294240jmg(eVar.LLILZLL.LLJJ, "layoutcomplete");
            c1294240jmg.LIZJ(Long.valueOf(new Date().getTime()), "timestamp");
            c1294240jmg.LIZJ(c1297910jsb, "cells");
            eVar.LL.LIZJ(c1294240jmg);
        }
        C1317100kNY c1317100kNY = this.LLILZ.LLJJJJ;
        int childCount = ((ViewGroup) this.LLLLLILLIL).getChildCount();
        int itemCount = this.LLLLZI.getItemCount();
        c1317100kNY.LIZIZ.put("view_cnt", String.valueOf(childCount));
        c1317100kNY.LIZIZ.put("adapter_cnt", String.valueOf(itemCount));
        if (!c1317100kNY.LJFF) {
            c1317100kNY.LJFF = true;
            c1317100kNY.LIZIZ(-1, -1, "first_screen");
        }
        this.LLLZL = false;
    }

    public a(AbstractC1317090kNX abstractC1317090kNX) {
        super(abstractC1317090kNX);
        this.LLLLZLLLI = true;
        this.LLLZ = true;
        this.LLLZI = "single";
        this.LLLZIIL = true;
        this.LLLZIL = 1;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJI(C1291290jhv c1291290jhv) {
        RecyclerView.LayoutManager layoutManager;
        LJJLIIIJL();
        if (c1291290jhv.LJII("list-type")) {
            setListType(c1291290jhv.LJI("list-type"));
        }
        if (this.LLLZ) {
            j jVar = this.LLLLZI;
            jVar.LLJI.clear();
            for (int i = 0; i < jVar.LLIZLLLIL.LLLZIL; i++) {
                jVar.LLJI.add(new HashMap<>());
            }
            new WeakReference(this);
            if (TextUtils.equals(this.LLLZI, "single")) {
                ListLayoutManager.ListLinearLayoutManager listLinearLayoutManager = new ListLayoutManager.ListLinearLayoutManager(this.LLILZ, this);
                listLinearLayoutManager.setOrientation(this.LLLZIIL ? 1 : 0);
                layoutManager = listLinearLayoutManager;
            } else if (TextUtils.equals(this.LLLZI, "flow")) {
                ListLayoutManager.ListGridLayoutManager listGridLayoutManager = new ListLayoutManager.ListGridLayoutManager(this.LLILZ, this.LLLZIL, this);
                listGridLayoutManager.setOrientation(this.LLLZIIL ? 1 : 0);
                layoutManager = listGridLayoutManager;
            } else if (TextUtils.equals(this.LLLZI, "waterfall")) {
                ListLayoutManager.b bVar = new ListLayoutManager.b(this.LLLZIL, this);
                bVar.setOrientation(this.LLLZIIL ? 1 : 0);
                layoutManager = bVar;
            } else {
                layoutManager = null;
            }
            ((RecyclerView) this.LLLLLILLIL).setLayoutManager(layoutManager);
        }
        this.LLLZ = false;
        if (((RecyclerView) this.LLLLLILLIL).getLayoutManager() instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) ((RecyclerView) this.LLLLLILLIL).getLayoutManager();
            gridLayoutManager.LJIJI(new C1339150kx7(this, gridLayoutManager, 0));
        }
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLL(Map<String, C1297940jse> map) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        this.LLJIJIL = map;
        e eVar = this.LLLLZLLIL;
        eVar.LLILLL = 0;
        if (map != null) {
            if (map.containsKey("scroll")) {
                i = eVar.LLILLL | 1;
            } else {
                i = eVar.LLILLL;
            }
            eVar.LLILLL = i;
            if (map.containsKey("scrolltoupper")) {
                i2 = eVar.LLILLL | 2;
            } else {
                i2 = eVar.LLILLL;
            }
            eVar.LLILLL = i2;
            if (map.containsKey("scrolltolower")) {
                i3 = eVar.LLILLL | 4;
            } else {
                i3 = eVar.LLILLL;
            }
            eVar.LLILLL = i3;
            if (map.containsKey("scrollstatechange")) {
                i4 = eVar.LLILLL | 8;
            } else {
                i4 = eVar.LLILLL;
            }
            eVar.LLILLL = i4;
            if (map.containsKey("layoutcomplete")) {
                i5 = eVar.LLILLL | 16;
            } else {
                i5 = eVar.LLILLL;
            }
            eVar.LLILLL = i5;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0kNl] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC1313520kHm
    public final View LJLJJL(Context context) {
        AbstractC1317090kNX abstractC1317090kNX = (AbstractC1317090kNX) context;
        C0008a c0008a = new C0008a(abstractC1317090kNX, this);
        C1317340kNw c1317340kNw = C1315530kL1.LJ().LJIIIZ;
        if (c1317340kNw != null) {
            c1317340kNw.LIZ(c0008a);
        }
        c0008a.setClipToPadding(false);
        c0008a.setItemAnimator(null);
        t76.a aVar = new t76.a(this.LLILZ.LLILLL);
        this.LLLLZIL = aVar;
        j jVar = new j(this, aVar, new d() { // from class: X.0kNl
            @Override // t76.d
            public final void LIZ(C1317410kO3 c1317410kO3) {
            }

            @Override // t76.d
            public final void LIZIZ(C1317410kO3 c1317410kO3) {
                C1317100kNY c1317100kNY = this.LIZ.LLILZ.LLJJJJ;
                c1317410kO3.getAdapterPosition();
                if (!c1317100kNY.LJIIIZ) {
                    c1317100kNY.LJIIIZ = true;
                    c1317100kNY.LIZIZ(-1, -1, "receive_first_item_new");
                }
            }
        });
        this.LLLLZI = jVar;
        c0008a.setAdapter(jVar);
        this.LLLLZLL = new f(abstractC1317090kNX, c0008a);
        this.LLLLZLLIL = new e(this.LLILZ.LLILLL, c0008a, this);
        return c0008a;
    }

    @Override // X.AbstractC1313500kHk
    public final void LJLLL(AbstractC1313520kHm abstractC1313520kHm) {
        int i;
        j jVar = this.LLLLZI;
        int size = 0;
        if (jVar.LLILLJJLI != null) {
            i = 1;
        } else {
            i = 0;
        }
        LinkedList<String> linkedList = jVar.LLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert ");
        sbLIZ.append(abstractC1313520kHm);
        linkedList.add(C2188811AlT.LIZIZ(sbLIZ));
        if (abstractC1313520kHm.LJJIIZI().getInt("list-comp-type", -1) == 1) {
            jVar.LLILLJJLI = abstractC1313520kHm;
        } else if (abstractC1313520kHm.LJJIIZI().getInt("list-comp-type", -1) == 2) {
            jVar.LLILLL = abstractC1313520kHm;
            size = i + ((ArrayList) jVar.LL).size();
        } else {
            ((ArrayList) jVar.LL).add(abstractC1313520kHm);
            size = (i + ((ArrayList) jVar.LL).size()) - 1;
        }
        jVar.notifyItemInserted(size);
        this.LLILZ.LLJJJJ.LJIILJJIL++;
    }

    @Override // X.AbstractC1313500kHk
    public final void LJLZ(SDUIBaseUI sDUIBaseUI) {
        boolean z;
        super.LJLZ(sDUIBaseUI);
        j jVar = this.LLLLZI;
        LinkedList<String> linkedList = jVar.LLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove ");
        sbLIZ.append(sDUIBaseUI);
        linkedList.add(C2188811AlT.LIZIZ(sbLIZ));
        int iIndexOf = 0;
        if (sDUIBaseUI.LJJIIZI().getInt("list-comp-type", -1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jVar.LLILLJJLI = null;
        } else if (sDUIBaseUI.LJJIIZI().getInt("list-comp-type", -1) == 2) {
            jVar.LLILLL = null;
            iIndexOf = ((ArrayList) jVar.LL).size();
        } else {
            iIndexOf = ((ArrayList) jVar.LL).indexOf(sDUIBaseUI);
            ((ArrayList) jVar.LL).remove(sDUIBaseUI);
        }
        jVar.notifyItemInserted(iIndexOf);
        this.LLILZ.LLJJJJ.LJIILL++;
    }

    @InterfaceC1291270jht(name = "column-count")
    public void setColumnCount(int i) {
        this.LLLZIL = i;
    }

    @InterfaceC1291270jht(name = "list-type")
    public void setListType(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "single";
        }
        if (!TextUtils.equals(str, this.LLLZI)) {
            this.LLLZ = true;
            this.LLLZI = str;
        }
    }

    @InterfaceC1291270jht(defaultInt = BaseNotice.RECOMMEND_LIVE, name = "lower-threshold")
    public void setLowerThreshold(InterfaceC1314540kJQ interfaceC1314540kJQ) {
        int iAsInt;
        e eVar = this.LLLLZLLIL;
        eVar.getClass();
        ReadableType type = interfaceC1314540kJQ.getType();
        if (type == ReadableType.String) {
            try {
                iAsInt = CastIntegerProtector.parseInt(interfaceC1314540kJQ.asString());
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                iAsInt = 50;
            }
        } else if (type == ReadableType.Int || type == ReadableType.Number || type == ReadableType.Long) {
            iAsInt = interfaceC1314540kJQ.asInt();
        } else {
            iAsInt = 50;
        }
        eVar.LLILZIL = iAsInt;
    }

    @InterfaceC1291270jht(defaultBoolean = true, name = "vertical-orientation")
    public void setVerticalOrientation(boolean z) {
        this.LLLZIIL = z;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final InterfaceC1317060kNU LJJJJJ(float f, float f2) {
        C1317410kO3 c1317410kO3;
        C1314690kJf c1314690kJf;
        if (this.LLLLZI == null) {
            return this;
        }
        for (int childCount = ((ViewGroup) this.LLLLLILLIL).getChildCount() - 1; childCount >= 0; childCount--) {
            RecyclerView.ViewHolder childViewHolder = ((RecyclerView) this.LLLLLILLIL).getChildViewHolder(((ViewGroup) this.LLLLLILLIL).getChildAt(childCount));
            if ((childViewHolder instanceof C1317410kO3) && (c1317410kO3 = (C1317410kO3) childViewHolder) != null && (c1314690kJf = c1317410kO3.LL.LLILLJJLI) != null && c1314690kJf.LJIIIZ(f - r3.getLeft(), f2 - r3.getTop())) {
                return c1314690kJf.LJJJJJ(f - r3.getLeft(), f2 - r3.getTop());
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @X.InterfaceC1966907n9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void scrollToPosition(com.bytedance.sdui.render.bridge.ReadableMap r13, com.bytedance.sdui.render.bridge.Callback r14) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdui.components.list.a.scrollToPosition(com.bytedance.sdui.render.bridge.ReadableMap, com.bytedance.sdui.render.bridge.Callback):void");
    }
}
