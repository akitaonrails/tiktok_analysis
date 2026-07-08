package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.AnonymousClass0956;
import X.C1262040iwk;
import com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class TitleAreaCell extends BasePowerCell<C1262040iwk> {
    public AnonymousClass0956 LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.elx;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        AnonymousClass0956 anonymousClass0956 = this.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILLL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x038e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0280  */
    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r22) {
        /*
            Method dump skipped, instruction units count: 1135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.impl.cell.TitleAreaCell.onBindItemView(X.0zJl):void");
    }
}
