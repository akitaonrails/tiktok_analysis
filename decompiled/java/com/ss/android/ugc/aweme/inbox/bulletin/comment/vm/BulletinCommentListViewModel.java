package com.ss.android.ugc.aweme.inbox.bulletin.comment.vm;

import X.AbstractC316870CbV;
import X.AbstractC329610Cw3;
import X.C09R9;
import X.C0OTL;
import X.C0OTS;
import X.C0OY5;
import X.C0OY7;
import X.C0OYC;
import X.C0OYG;
import X.C0OYN;
import X.C0OYR;
import X.C0OYT;
import X.C0OYU;
import X.C13DV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1697820uHc;
import X.C1954807lC;
import X.C20603715jn;
import X.C619000OPq;
import X.C623070OcD;
import X.EnumC620990OXh;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentListViewModel extends AssemViewModel<C0OYC> implements C0OTL {
    public static long LLJILJILJ;
    public static List<? extends InterfaceC1891350zJl> LLJILLL;
    public static AbstractC316870CbV<C0OYR> LLJJ;
    public final C0OYN LL;
    public long LLILLJJLI;
    public long LLILLL;
    public boolean LLILZ;
    public UrlModel LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public boolean LLJIJIL;
    public final C09R9 LLJILJIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0OYC(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0OYN] */
    public BulletinCommentListViewModel() {
        final C20603715jn c20603715jn = new C20603715jn();
        this.LL = new AbstractC329610Cw3<C0OYR>(c20603715jn) { // from class: X.0OYN
            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C0OYR>> interfaceC1364105Vn) {
                BulletinCommentListViewModel bulletinCommentListViewModel = this.LIZIZ;
                bulletinCommentListViewModel.getClass();
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bulletinCommentListViewModel), C0PEM.LIZJ, null, new C0OYK(bulletinCommentListViewModel, interfaceC1364105Vn, null), 2);
            }

            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onLoadMore(InterfaceC1364105Vn interfaceC1364105Vn, Object obj) {
                C0OYR c0oyr = (C0OYR) obj;
                if (c0oyr.LIZIZ) {
                    BulletinCommentListViewModel bulletinCommentListViewModel = this.LIZIZ;
                    bulletinCommentListViewModel.getClass();
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bulletinCommentListViewModel), C0PEM.LIZJ, null, new C0OYM(bulletinCommentListViewModel, c0oyr, interfaceC1364105Vn, null), 2);
                } else {
                    BulletinCommentListViewModel bulletinCommentListViewModel2 = this.LIZIZ;
                    bulletinCommentListViewModel2.getClass();
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bulletinCommentListViewModel2), C0PEM.LIZJ, null, new C0OYL(bulletinCommentListViewModel2, c0oyr, interfaceC1364105Vn, null), 2);
                }
            }
        };
        this.LLJ = "";
        this.LLJI = "";
        this.LLJILJIL = new C09R9(this, C13LE.LIZ(C623070OcD.class));
    }

    public static void yQ2(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C0OTS) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        int i = 1;
        while (it2.hasNext()) {
            ((C0OTS) it2.next()).LLJI = i;
            i++;
        }
    }

    @Override // X.C0OTL
    public final void M50(C0OTS c0ots) {
        setState(new AwS588S0100000_9(c0ots, 174));
    }

    public final List<InterfaceC1891350zJl> vQ2(List<? extends Comment> list) {
        Comment comment;
        int i;
        boolean z;
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        if (list != null) {
            HashSet hashSet = new HashSet();
            ArrayList<Comment> arrayList = new ArrayList();
            for (Comment comment2 : list) {
                if (hashSet.add(comment2.getCid())) {
                    arrayList.add(comment2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (Comment comment3 : arrayList) {
                c13dvLIZIZ.add(C619000OPq.LJFF(comment3, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, EnumC620990OXh.DEFAULT, true));
                List<Comment> replyComments = comment3.getReplyComments();
                if (replyComments != null && (comment = (Comment) C13LP.LJJJLL(replyComments)) != null) {
                    c13dvLIZIZ.add(C619000OPq.LJFF(comment, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, EnumC620990OXh.DEFAULT, true));
                } else {
                    comment = null;
                }
                if (comment3.getReplyCommentTotal() > 0) {
                    if (comment != null) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    C0OYU c0oyu = C0OYT.Companion;
                    int replyCommentTotal = (int) comment3.getReplyCommentTotal();
                    c0oyu.getClass();
                    if (replyCommentTotal > i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c13dvLIZIZ.add(new C0OYG(comment3.getCid(), i, i, (int) comment3.getReplyCommentTotal(), C0OYU.LIZ((int) comment3.getReplyCommentTotal(), i, i, z), 0, z));
                }
                arrayList2.add(Unit.LIZ);
            }
        }
        yQ2(c13dvLIZIZ);
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }

    public final void xQ2(C0OY7 c0oy7, Integer num) {
        switch (C0OY5.LIZIZ[c0oy7.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                setState(new AwS588S0100000_9(c0oy7, 169));
                return;
            case 6:
                setState(new AwS375S0200000_9(c0oy7, num, 46));
                return;
            case 7:
                setState(new AwS588S0100000_9(c0oy7, 170));
                return;
            case 8:
                if (getState().LLILLJJLI.LIZ() != null) {
                    setState(AFwS240S0000000_9.get$arr$(297));
                    return;
                }
                return;
            default:
                throw new C1954807lC();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0249, code lost:
    
        r0 = r1.indexOf(r6);
     */
    @Override // X.C0OTL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bs0(X.InterfaceC1891350zJl r18, X.InterfaceC1891350zJl r19, X.EnumC620940OXc r20) {
        /*
            Method dump skipped, instruction units count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel.bs0(X.0zJl, X.0zJl, X.0OXc):void");
    }

    public final void wQ2(boolean z, boolean z2, Integer num, boolean z3) {
        if (z) {
            if (this.LLILZ) {
                xQ2(C0OY7.COMMENT_EMPTY_CREATOR, null);
                return;
            } else if (!this.LLILZLL) {
                xQ2(C0OY7.COMMENT_CLOSE, null);
                return;
            } else {
                xQ2(C0OY7.COMMENT_EMPTY, null);
                return;
            }
        }
        if (!z2 && z3) {
            xQ2(C0OY7.FOLD, num);
        } else {
            xQ2(C0OY7.DEFAULT, null);
        }
    }
}
