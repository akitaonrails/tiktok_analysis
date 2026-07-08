package com.ss.android.ugc.aweme.explore.assem;

import X.C01GW;
import X.C13LP;
import X.C19719612Di;
import X.C20524315Sv;
import X.C20525915Tl;
import X.C20527215Ty;
import X.C20529215Us;
import X.C20750716Hx;
import X.C21681819tI;
import X.C2211751BhN;
import X.C2493709pv;
import X.C452501pT;
import X.C724240Sb0;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.ability.FirstScreenCheckingAbility;
import com.ss.android.ugc.aweme.explore.data.ExploreCardInsertResultStruct;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicStruct;
import com.ss.android.ugc.aweme.explore.ui.cell.NoScrollLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS81S1000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreRecommendTopicCell extends PowerCell<C20525915Tl> {
    public C20529215Us LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 566));

    public final String I5() {
        C21681819tI c21681819tI;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        return ((!(layoutParams instanceof C21681819tI) || (c21681819tI = (C21681819tI) layoutParams) == null) ? getLayoutPosition() : c21681819tI.LIZ()) % 2 == 0 ? "left" : "right";
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        Fragment fragmentLJI;
        super.onItemViewCreated();
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.t0q);
        recyclerView.setLayoutManager(new NoScrollLinearLayoutManager(this.itemView.getContext()));
        LifecycleOwner parent = getParent();
        C20529215Us c20529215Us = new C20529215Us((parent == null || (fragmentLJI = C724240Sb0.LJI(parent)) == null) ? null : fragmentLJI.getChildFragmentManager());
        this.LL = c20529215Us;
        c20529215Us.setHasStableIds(true);
        recyclerView.setAdapter(this.LL);
        C2211751BhN.LIZ(this.itemView, new C20750716Hx(this, 4));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C20529215Us c20529215Us = this.LL;
        if (c20529215Us != null) {
            FirstScreenCheckingAbility firstScreenCheckingAbility = (FirstScreenCheckingAbility) this.LLILLJJLI.getValue();
            boolean z = false;
            if (firstScreenCheckingAbility != null && firstScreenCheckingAbility.xC0(getLayoutPosition())) {
                z = true;
            }
            c20529215Us.LLILZ = z;
            c20529215Us.LLILZLL = getBindingAdapterPosition();
            c20529215Us.LLILZIL = I5();
        }
        C20524315Sv c20524315Sv = C20524315Sv.LL;
        C20525915Tl item = getItem();
        String str = item != null ? item.LLILLJJLI : null;
        c20524315Sv.getClass();
        if (str != null) {
            ReentrantLock reentrantLock = C20524315Sv.LLILLJJLI;
            reentrantLock.lock();
            try {
                List<ExploreCardInsertResultStruct> list = C20524315Sv.LLILZ;
                if (list != null) {
                    C19719612Di.LJJIIJ(list, new AwS81S1000000_31(str, 13), true);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C20525915Tl c20525915Tl = (C20525915Tl) interfaceC1891350zJl;
        super.onBindItemView(c20525915Tl);
        C20529215Us c20529215Us = this.LL;
        if (c20529215Us != null) {
            List<ExploreCustomTopicStruct> list = c20525915Tl.LLILZ;
            ((ArrayList) c20529215Us.LLILLL).clear();
            ((ArrayList) c20529215Us.LLILLL).addAll(list);
            c20529215Us.notifyDataSetChanged();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C2493709pv c2493709pv = C2493709pv.LIZ;
        Context context = viewGroup.getContext();
        c2493709pv.getClass();
        return C2493709pv.LIZ(context, R.layout.c5l, viewGroup);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C20529215Us c20529215Us;
        super.onBindItemView(interfaceC1891350zJl, list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C20527215Ty) {
                arrayList.add(obj);
            }
        }
        C20527215Ty c20527215Ty = (C20527215Ty) C13LP.LJJJLL(arrayList);
        if (c20527215Ty != null && (c20529215Us = this.LL) != null) {
            List<ExploreCustomTopicStruct> list2 = c20527215Ty.LIZ;
            ((ArrayList) c20529215Us.LLILLL).clear();
            ((ArrayList) c20529215Us.LLILLL).addAll(list2);
            c20529215Us.notifyDataSetChanged();
        }
    }
}
