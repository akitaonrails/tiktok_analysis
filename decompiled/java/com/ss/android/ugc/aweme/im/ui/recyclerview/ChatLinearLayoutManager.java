package com.ss.android.ugc.aweme.im.ui.recyclerview;

import X.C21673919s1;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.recyclerview.SafeChatLinearLayoutManager;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public abstract class ChatLinearLayoutManager extends SafeChatLinearLayoutManager {
    public final Set<Function1<C21673919s1, Unit>> LLILLJJLI;

    public abstract int LJIIL();

    public abstract int LJIILIIL();

    public abstract long LJIILJJIL();

    public abstract List<RecyclerView.ViewHolder> LJIILL(RecyclerView recyclerView);

    public abstract void LJIILLIIL(RecyclerView recyclerView);

    public abstract void LJIIZILJ(int i);

    public abstract void LJIJ(int i);

    public abstract void LJIJI(boolean z);

    public ChatLinearLayoutManager(Context context) {
        super(context);
        this.LLILLJJLI = new LinkedHashSet();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(C21673919s1 c21673919s1) {
        super.onLayoutCompleted(c21673919s1);
        Iterator<Function1<C21673919s1, Unit>> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(c21673919s1);
        }
    }
}
