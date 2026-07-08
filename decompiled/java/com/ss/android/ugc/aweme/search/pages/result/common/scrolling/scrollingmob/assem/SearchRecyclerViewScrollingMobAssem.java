package com.ss.android.ugc.aweme.search.pages.result.common.scrolling.scrollingmob.assem;

import X.AbstractC1585810rMx;
import X.C1559260qg8;
import X.C642180PGu;
import X.C642210PGx;
import X.C723590SZx;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchRecyclerViewScrollingMobAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C642210PGx.class, null), checkSupervisorPrepared());
    public C642180PGu LLJ;
    public RecyclerView LLJI;

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        RecyclerView recyclerView;
        super.onDestroy();
        C642180PGu c642180PGu = this.LLJ;
        if (c642180PGu != null && (recyclerView = this.LLJI) != null) {
            recyclerView.removeOnScrollListener(c642180PGu);
        }
        this.LLJ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0PGu, X.0rMx] */
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
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        RecyclerView recyclerView;
        super.onViewCreated(view);
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL instanceof RecyclerView) {
            recyclerView = (RecyclerView) viewLJJIJL;
        } else {
            recyclerView = null;
        }
        this.LLJI = recyclerView;
        final String str = ((C642210PGx) this.LLIZLLLIL.getValue()).LL;
        ?? r1 = new AbstractC1585810rMx(str) { // from class: X.0PGu
            public final String LL;
            public boolean LLILLJJLI;
            public long LLILLL;
            public int LLILZ;
            public HashMap<String, String> LLILZIL;

            {
                this.LL = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
            @Override // X.AbstractC1585810rMx
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJJIIJ(androidx.recyclerview.widget.RecyclerView r11, int r12) {
                /*
                    Method dump skipped, instruction units count: 349
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C642180PGu.LJJIIJ(androidx.recyclerview.widget.RecyclerView, int):void");
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView2, int i, int i2) {
                if (i2 != 0 && this.LLILLJJLI) {
                    this.LLILZ += i2;
                }
            }
        };
        this.LLJ = r1;
        RecyclerView recyclerView2 = this.LLJI;
        if (recyclerView2 != 0) {
            recyclerView2.addOnScrollListener(r1);
        }
    }
}
