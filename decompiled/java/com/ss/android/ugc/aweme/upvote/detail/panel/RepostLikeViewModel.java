package com.ss.android.ugc.aweme.upvote.detail.panel;

import X.C11NJ;
import X.C1357950lRR;
import X.C1358220lRs;
import X.C1358240lRu;
import X.C1358380lS8;
import X.C2001007se;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostLikeViewModel extends ViewModel {
    public boolean LL;
    public final MutableLiveData<C2001007se> LLILLJJLI = new MutableLiveData<>();
    public final C11NJ LLILLL = new C11NJ();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    public final void vQ2(boolean z, C1358220lRs c1358220lRs, String str) {
        String str2;
        C1358240lRu c1358240lRu = c1358220lRs.LLILLL;
        c1358240lRu.LIZJ = z;
        if (z) {
            c1358240lRu.LIZLLL++;
        } else {
            c1358240lRu.LIZLLL--;
        }
        if (c1358240lRu.LIZLLL < 0) {
            c1358240lRu.LIZLLL = 0;
        }
        this.LLILLJJLI.setValue(new C2001007se(c1358220lRs.LL, z, c1358240lRu.LIZLLL));
        C1358380lS8 c1358380lS8 = C1358380lS8.LIZ;
        UpvoteStruct upvoteStruct = c1358220lRs.LLILLJJLI;
        String str3 = null;
        if (upvoteStruct != null) {
            str2 = upvoteStruct.upvoteId;
        } else {
            str2 = null;
        }
        if (c1358220lRs instanceof C1357950lRR) {
            str3 = c1358220lRs.LL;
        }
        C1358240lRu c1358240lRu2 = c1358220lRs.LLILLL;
        int i = c1358240lRu2.LIZLLL;
        boolean z2 = c1358240lRu2.LIZJ;
        c1358380lS8.getClass();
        C1358380lS8.LJII(i, str, str2, str3, z2);
    }
}
