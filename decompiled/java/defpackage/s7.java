package defpackage;

import X.AbstractC21673619ry;
import X.C1744320vUc;
import X.C1AF0;
import X.C20612085q;
import X.C2081408Dk;
import X.C2344809Gs;
import X.C786410Ut5;
import X.C946803n0;
import X.InterfaceC1743730vTf;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class s7 extends AbstractC21673619ry<p0> {
    public List<C1744320vUc<District>> LL;
    public String LLILLJJLI;
    public InterfaceC1743730vTf LLILLL;

    public static final class a {
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return 1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<C1744320vUc<District>> list = this.LL;
        if (list != null) {
            return ((ArrayList) list).size();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1744320vUc c1744320vUc;
        p0 p0Var = (p0) viewHolder;
        List<C1744320vUc<District>> list = this.LL;
        if (list != null) {
            c1744320vUc = (C1744320vUc) ListProtector.get(list, i);
        } else {
            c1744320vUc = null;
        }
        getItemCount();
        p0Var.I5(c1744320vUc, this.LLILLJJLI);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        t7 t7Var = new t7(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ai0, viewGroup, false));
        t7Var.LL = this.LLILLL;
        try {
            View view = t7Var.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        t7Var.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (t7Var.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(t7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) t7Var.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(t7Var.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = t7.class.getName();
        return t7Var;
    }
}
