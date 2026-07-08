package com.ss.android.ugc.aweme.cell;

import X.C098200Yq;
import X.C127K;
import X.C127M;
import X.C1308910kAL;
import X.C189200o6;
import X.C20693515yH;
import X.C419910GdJ;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public class TuxCell<T extends C20693515yH, S extends C127M> extends BaseCell<T> {
    public S LL;

    public S N5(Context context) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public View I5(ViewGroup viewGroup) {
        Object c098200Yq;
        int i;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.abw, viewGroup, false);
        this.LL = (S) N5(viewGroup.getContext());
        S s = this.LL;
        if (s != null) {
            ((C127K) viewTd).setAccessory(s);
        }
        S s2 = this.LL;
        if (s2 != null) {
            s2.LJI(new AwS575S0100000_31((TuxCell) this, 330));
        }
        Context context = viewTd.getContext();
        try {
            c098200Yq = FragmentManager.LJJJJLL(viewGroup);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        if (c098200Yq instanceof TuxSheet) {
            i = R.attr.a1f;
        } else {
            i = R.attr.zq;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            viewTd.setBackgroundColor(numLIZJ.intValue());
        }
        return viewTd;
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: P5 */
    public void onBindItemView(T t) {
        super.onBindItemView(t);
        C127K c127k = (C127K) this.itemView.findViewById(R.id.dle);
        c127k.setVariant(t.LJ());
        c127k.setTitle(t.LJJIFFI());
        CharSequence subTitle = t.getSubTitle();
        if (subTitle == null) {
            subTitle = t.LJIL();
        }
        c127k.setSubtitle(subTitle);
        Integer numLJJ = t.LJJ();
        if (numLJJ != null) {
            c127k.setSubTitleMaxLines(numLJJ.intValue());
        }
        C419910GdJ c419910GdJLJIIZILJ = t.LJIIZILJ();
        if (c419910GdJLJIIZILJ != null) {
            c127k.setIcon(c419910GdJLJIIZILJ);
        }
        c127k.setCellEnabled(t.LJIILIIL());
        c127k.setWithSeparator(t.LJIIIIZZ());
        c127k.setLoading(t.LJIJJLI());
        c127k.LJ(t.LIZIZ(), t.LIZLLL());
    }
}
