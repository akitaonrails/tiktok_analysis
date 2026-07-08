package defpackage;

import X.C1360650lVn;
import X.C15438062q;
import X.C1587150rP7;
import X.C298720BnK;
import X.C626620Ohw;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.repostfeed.model.RepostNewContentUser;
import defpackage.RepostFeedEntranceVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class c8 implements View.OnClickListener {
    public final /* synthetic */ C1360650lVn LL;
    public final /* synthetic */ C626620Ohw LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ a8 LLILZ;
    public final /* synthetic */ Aweme LLILZIL;

    public c8(a8 a8Var, Aweme aweme, C1360650lVn c1360650lVn, C626620Ohw c626620Ohw, String str) {
        this.LL = c1360650lVn;
        this.LLILLJJLI = c626620Ohw;
        this.LLILLL = str;
        this.LLILZ = a8Var;
        this.LLILZIL = aweme;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        ArrayList arrayList;
        List<RepostNewContentUser> list;
        if (C298720BnK.LIZIZ()) {
            C1587150rP7 c1587150rP7 = C1587150rP7.LIZIZ;
            C1360650lVn c1360650lVn = this.LL;
            if (c1360650lVn != null && (list = c1360650lVn.LIZIZ) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<RepostNewContentUser> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().itemId);
                }
            } else {
                arrayList = null;
            }
            c1587150rP7.LJIJI(arrayList);
        }
        C1587150rP7.LIZIZ.LJIIJJI(this.LLILLJJLI.getContext(), this.LLILLL, null);
        if (this.LLILZ == a8.LIST) {
            str = "list";
        } else {
            str = "button";
        }
        RepostFeedEntranceVM.a.LIZIZ("click", this.LL, str, this.LLILLL, this.LLILZIL);
    }
}
