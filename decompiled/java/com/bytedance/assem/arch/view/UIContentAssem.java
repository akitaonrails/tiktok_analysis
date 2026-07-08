package com.bytedance.assem.arch.view;

import X.C2188811AlT;
import X.C520680KbS;
import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;

/* JADX INFO: loaded from: classes12.dex */
public abstract class UIContentAssem extends UIAssem {
    public int LLIZ;

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void xo() {
        View view;
        if (so()) {
            oo(LJJIJL());
            return;
        }
        if (this.LLIZ == 0 || (view = getSupervisor().LLJJIII) == null) {
            return;
        }
        View viewLIZ = C520680KbS.LIZ(this.LLIZ, view);
        if (viewLIZ != null) {
            Ao(viewLIZ);
            oo(viewLIZ);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("can not find view for ");
        sbLIZ.append(this);
        sbLIZ.append(", id ");
        sbLIZ.append(this.LLIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public final int Co() {
        return this.LLIZ;
    }

    public final int Eo() {
        return this.LLIZ;
    }

    public final void Fo(int i) {
        this.LLIZ = i;
    }
}
