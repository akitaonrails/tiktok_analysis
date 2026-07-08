package com.ss.android.ugc.aweme.lemon.comment.powercell;

import X.AbstractC1387200mCc;
import X.AnonymousClass0508;
import X.C0BTW;
import X.C10EU;
import X.C1360520lVa;
import X.C1372580lp2;
import X.C1843500y4a;
import X.C1906580ziK;
import X.C19374310qz;
import X.C443130HZf;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1891350zJl;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class Lemon8CommentCountCell extends PowerCell<AnonymousClass0508> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        long commentCount;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        CharSequence string;
        Activity activityLIZIZ;
        String strLIZIZ;
        AwemeStatistics statistics;
        AnonymousClass0508 anonymousClass0508 = (AnonymousClass0508) interfaceC1891350zJl;
        super.onBindItemView(anonymousClass0508);
        TextView textView = (TextView) this.itemView.findViewById(R.id.ea6);
        C443130HZf c443130HZf = new Object() { // from class: X.0HZf
        };
        Aweme aweme = anonymousClass0508.LL;
        c443130HZf.getClass();
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            commentCount = statistics.getCommentCount();
        } else {
            commentCount = 0;
        }
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (commentCount != 0 && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            C1360520lVa c1360520lVa = new C1360520lVa();
            Resources resources = activityLIZIZ.getResources();
            int i = (int) commentCount;
            Object[] objArr = new Object[1];
            if (C0BTW.LIZ()) {
                if (commentCount < 0) {
                    strLIZIZ = CardStruct.IStatusCode.DEFAULT;
                } else if (aweme != null && !C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme))) {
                    strLIZIZ = String.valueOf(C19374310qz.LIZ(Long.valueOf(commentCount), null, null, 0, 30));
                } else {
                    strLIZIZ = C1372580lp2.LIZ(commentCount);
                }
            } else {
                strLIZIZ = C1843500y4a.LIZIZ(commentCount);
            }
            objArr[0] = strLIZIZ;
            c1360520lVa.LIZ.append((CharSequence) resources.getQuantityString(2131755167, i, objArr));
            string = c1360520lVa.LIZ;
        } else {
            string = contextLIZ.getString(2131825067);
        }
        textView.setText(string);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.da6, viewGroup, false);
    }
}
