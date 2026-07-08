package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel;

import X.C0PRC;
import X.C2005507tN;
import X.C448200Hhq;
import X.C645920PVe;
import X.C646370PWx;
import X.C659520Ptu;
import X.C680810Qn9;
import X.InterfaceC0148002o;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchVideoCommentVM extends AssemViewModel<C2005507tN> {
    public C659520Ptu LL;
    public ISearchContextAbility LLILLJJLI;
    public Comment LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2005507tN(null);
    }

    public final <T extends C680810Qn9<T>> void vQ2(C680810Qn9<T> c680810Qn9, View view) {
        String aid;
        Aweme aweme;
        ISearchContextAbility iSearchContextAbility = this.LLILLJJLI;
        if (iSearchContextAbility == null) {
            return;
        }
        C0PRC c0prc = (C0PRC) iSearchContextAbility.Ph1().LIZJ();
        C646370PWx c646370PWx = (C646370PWx) iSearchContextAbility.wO2().LIZJ();
        c680810Qn9.LJIJJ(c646370PWx.LLILLL);
        c680810Qn9.LJJIIZI(c0prc.LLILLL);
        c680810Qn9.LJJIJ(c0prc.LLIZLLLIL);
        c680810Qn9.LJJIIZ(Integer.valueOf(c646370PWx.LLILZLL));
        C659520Ptu c659520Ptu = this.LL;
        if (c659520Ptu != null && (aweme = c659520Ptu.LL) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C645920PVe.LIZIZ(c680810Qn9, view, aid, null);
    }

    public final void wQ2(View view, boolean z, String str) {
        final Aweme aweme;
        final Comment comment;
        String str2;
        C659520Ptu c659520Ptu = this.LL;
        if (c659520Ptu == null || (aweme = c659520Ptu.LL) == null || (comment = this.LLILLL) == null) {
            return;
        }
        C680810Qn9<C448200Hhq> c680810Qn9 = new C680810Qn9<C448200Hhq>(comment, aweme) { // from class: X.0Hhs
        };
        vQ2(c680810Qn9, view);
        c680810Qn9.LJIIZILJ("show_text", str);
        c680810Qn9.LJIIZILJ("show_text_length", String.valueOf(str.length()));
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c680810Qn9.LJIIZILJ("is_shorten", str2);
        c680810Qn9.LJIILJJIL();
    }
}
