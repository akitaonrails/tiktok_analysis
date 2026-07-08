package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert;

import X.C01GW;
import X.C09YA;
import X.C0PEM;
import X.C1158950gGT;
import X.C1559260qg8;
import X.C1813940xIu;
import X.C1814140xJE;
import X.C1814150xJF;
import X.C1814160xJG;
import X.C1814210xJL;
import X.C1814370xJb;
import X.C1816260xMe;
import X.C23250099c;
import X.C291301Ax;
import X.C452501pT;
import X.C488201vE;
import X.C723600SZy;
import X.InterfaceC0148002o;
import X.InterfaceC1816300xMi;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveBoardUpsertViewModel extends AssemViewModel<C1158950gGT> implements InterfaceC1816300xMi {
    public final C09YA LL = new C09YA(this, new C1814210xJL());
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C291301Ax.class, "save_data"), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1816260xMe());

    @Override // X.InterfaceC1816300xMi
    public final void Zm2() {
        setState(new C1814160xJG());
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158950gGT(0);
    }

    @Override // X.InterfaceC1816300xMi
    public final void qD1(boolean z) {
        setState(new C1814140xJE(z));
    }

    public static void vQ2(LiveBoardUpsertViewModel liveBoardUpsertViewModel, Context context, Board board, Bitmap bitmap) {
        liveBoardUpsertViewModel.getClass();
        if (bitmap == null) {
            Iterator<BoardItem> it2 = board.boardItemList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BoardItem next = it2.next();
                if (next.boardItemType != 6) {
                    if (next != null) {
                        liveBoardUpsertViewModel.setState(new C1814150xJF());
                        return;
                    }
                }
            }
        }
        Iterator<BoardItem> it3 = board.boardItemList.iterator();
        while (it3.hasNext()) {
            C488201vE.LJI(it3.next());
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveBoardUpsertViewModel), C0PEM.LIZJ, null, new C1813940xIu(liveBoardUpsertViewModel, new C1814370xJb(board, bitmap, 0), true, board, context, bitmap, null), 2);
    }
}
