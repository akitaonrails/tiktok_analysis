package com.ss.android.ugc.aweme.inbox.search.view.cell;

import X.C01GW;
import X.C1242210iQl;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1906770zid;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerCell;
import com.ss.android.ugc.aweme.notification.vh.MTTemplateNotificationHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class TemplateCellForSearch extends InboxSearchPowerCell<C1242210iQl> {
    public MTTemplateNotificationHolder LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1566));

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        MTTemplateNotificationHolder mTTemplateNotificationHolder = this.LLILLJJLI;
        if (mTTemplateNotificationHolder == null) {
            mTTemplateNotificationHolder = null;
        }
        mTTemplateNotificationHolder.onAttached();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        MTTemplateNotificationHolder mTTemplateNotificationHolder = this.LLILLJJLI;
        if (mTTemplateNotificationHolder == null) {
            mTTemplateNotificationHolder = null;
        }
        mTTemplateNotificationHolder.onDetached();
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerCell
    public final void L5(View view) {
        MTTemplateNotificationHolder mTTemplateNotificationHolder = this.LLILLJJLI;
        if (mTTemplateNotificationHolder == null) {
            mTTemplateNotificationHolder = null;
        }
        mTTemplateNotificationHolder.onClick(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: P5, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C1242210iQl r34) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.search.view.cell.TemplateCellForSearch.onBindItemView(X.0iQl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aaj, viewGroup, false);
        MTTemplateNotificationHolder mTTemplateNotificationHolder = new MTTemplateNotificationHolder(viewTd, null);
        mTTemplateNotificationHolder.imgInfo = EnumC1906770zid.SEARCH;
        this.LLILLJJLI = mTTemplateNotificationHolder;
        return viewTd;
    }
}
