package t76;

import X.AbstractC1313520kHm;
import X.AbstractC21673619ry;
import X.C1317230kNl;
import X.C1317360kNy;
import X.C1317410kO3;
import X.C1AF0;
import X.C20612085q;
import X.C2081408Dk;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C786410Ut5;
import X.C946803n0;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS120S0100000_20;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class j extends AbstractC21673619ry<C1317410kO3> {
    public final List<AbstractC1313520kHm> LL = new ArrayList();
    public AbstractC1313520kHm LLILLJJLI = null;
    public AbstractC1313520kHm LLILLL = null;
    public final List<C1317410kO3> LLILZ = new ArrayList();
    public final d LLILZIL;
    public final a LLILZLL;
    public final LinkedList<String> LLIZ;
    public final com.bytedance.sdui.components.list.a LLIZLLLIL;
    public final ARunnableS120S0100000_20 LLJ;
    public final ArrayList<HashMap<Integer, Integer>> LLJI;

    public final JSONObject LLLFZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("holder_size", ((ArrayList) this.LLILZ).size());
            jSONObject.put("list_size", ((ArrayList) this.LL).size());
            jSONObject.put("action_list", this.LLIZ);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        int size = ((ArrayList) this.LL).size();
        if (this.LLILLJJLI != null) {
            size++;
        }
        if (this.LLILLL != null) {
            size++;
        }
        LinkedList<String> linkedList = this.LLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("c:");
        sbLIZ.append(size);
        linkedList.add(C2188811AlT.LIZIZ(sbLIZ));
        return size;
    }

    public final boolean LLLI(int i) {
        AbstractC1313520kHm abstractC1313520kHm = this.LLILLJJLI;
        if (abstractC1313520kHm != null && i == 0) {
            return true;
        }
        if (this.LLILLL != null) {
            if (abstractC1313520kHm == null && ((ArrayList) this.LL).size() == i) {
                return true;
            }
            if (this.LLILLJJLI != null && ((ArrayList) this.LL).size() == i - 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C1317410kO3 c1317410kO3 = (C1317410kO3) viewHolder;
        super.onViewAttachedToWindow(c1317410kO3);
        this.LLILZIL.LIZIZ(c1317410kO3);
        this.LLILZLL.LIZIZ(c1317410kO3);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C1317410kO3 c1317410kO3 = (C1317410kO3) viewHolder;
        super.onViewDetachedFromWindow(c1317410kO3);
        this.LLILZIL.LIZ(c1317410kO3);
        this.LLILZLL.LIZ(c1317410kO3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r5, int r6) {
        /*
            r4 = this;
            X.0kO3 r5 = (X.C1317410kO3) r5
            t76.g$b r0 = r5.LL
            if (r0 == 0) goto Lb
            int r0 = r0.LLILLL
            if (r0 != r6) goto Lb
        La:
            return
        Lb:
            java.util.LinkedList<java.lang.String> r2 = r4.LLIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "bind"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.add(r0)
            t76.g$b r2 = r5.LL
            r0 = 1
            r2.LL = r0
            X.0kJf r0 = r2.LLILLJJLI
            r1 = 0
            if (r0 == 0) goto L34
            com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker.recordViewRemovedPoint(r2, r1)
            r2.removeAllViews()
            t76.g$b r0 = r5.LL
            r0.LLILLJJLI = r1
        L34:
            X.0kHm r0 = r4.LLILLJJLI
            if (r0 == 0) goto L3c
            if (r6 == 0) goto L56
            int r6 = r6 + (-1)
        L3c:
            X.0kHm r0 = r4.LLILLL
            if (r0 == 0) goto L4e
            java.util.List<X.0kHm> r0 = r4.LL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r6 != r0) goto L4e
            X.0kHm r0 = r4.LLILLL
            if (r0 != 0) goto L56
        L4e:
            java.util.List<X.0kHm> r0 = r4.LL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            X.0kHm r0 = (X.AbstractC1313520kHm) r0
        L56:
            T extends android.view.View r1 = r0.LLLLLILLIL
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L6b
            T extends android.view.View r1 = r0.LLLLLILLIL
            android.view.ViewParent r2 = r1.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            T extends android.view.View r1 = r0.LLLLLILLIL
            X.C786410Ut5.LJJJLZIJ(r1, r2)
        L6b:
            boolean r1 = r0 instanceof X.C1314690kJf
            if (r1 == 0) goto L9e
            X.0kJf r0 = (X.C1314690kJf) r0
            t76.g$b r1 = r5.LL
            r1.LLILLJJLI = r0
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r2 = -2
            r1 = -1
            r3.<init>(r1, r2)
            t76.g$b r1 = r5.LL
            T extends android.view.View r0 = r0.LLLLLILLIL
            r1.addView(r0, r3)
            t76.g$b r1 = r5.LL
            int r0 = r5.getAdapterPosition()
            r1.LLILLL = r0
            android.view.View r0 = r5.itemView
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof X.C21681819tI
            if (r0 == 0) goto La
            X.19tI r1 = (X.C21681819tI) r1
            boolean r0 = r4.LLLI(r6)
            r1.LLILLJJLI = r0
            return
        L9e:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "List Item Must Be UIGroup!!!"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t76.j.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Adapter onCreateViewHolder ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        int i2 = C1317360kNy.LIZ;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        g$b g_b = new g$b(viewGroup.getContext());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(g_b);
        g_b.setLayoutParams(layoutParams);
        C1317410kO3 c1317410kO3 = new C1317410kO3(g_b);
        ((ArrayList) this.LLILZ).add(c1317410kO3);
        LinkedList<String> linkedList = this.LLIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("create");
        sbLIZ2.append(i);
        linkedList.add(C2188811AlT.LIZIZ(sbLIZ2));
        try {
            View view = c1317410kO3.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1317410kO3.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1317410kO3.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1317410kO3.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1317410kO3.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1317410kO3.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1317410kO3.class.getName();
        return c1317410kO3;
    }

    public j(com.bytedance.sdui.components.list.a aVar, a aVar2, C1317230kNl c1317230kNl) {
        LinkedList<String> linkedList = new LinkedList<>();
        this.LLIZ = linkedList;
        this.LLJ = new ARunnableS120S0100000_20(this, 336);
        this.LLJI = new ArrayList<>();
        new HashMap();
        new HashMap();
        this.LLIZLLLIL = aVar;
        this.LLILZIL = c1317230kNl;
        this.LLILZLL = aVar2;
        aVar.LLILZ.LLJJJJ.LJIILIIL++;
        linkedList.add("<init>");
    }
}
