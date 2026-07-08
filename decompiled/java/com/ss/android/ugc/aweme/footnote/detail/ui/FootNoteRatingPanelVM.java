package com.ss.android.ugc.aweme.footnote.detail.ui;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1556690qbz;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC993840byA;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FootNoteInfo;
import com.ss.android.ugc.aweme.feed.model.MainPendingFootNoteInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class FootNoteRatingPanelVM extends FeedBaseViewModel<C1556690qbz> {
    public static String LLILLJJLI = "";
    public boolean LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1556690qbz(0);
    }

    public static int vQ2(Aweme aweme) {
        String str;
        FootNoteInfo footNoteInfo;
        MainPendingFootNoteInfo mainPendingFootNoteInfo;
        Integer num;
        FootNoteInfo footNoteInfo2;
        MainPendingFootNoteInfo mainPendingFootNoteInfo2;
        if (aweme != null && (footNoteInfo2 = aweme.getFootNoteInfo()) != null && (mainPendingFootNoteInfo2 = footNoteInfo2.mainPendingFootNote) != null) {
            str = mainPendingFootNoteInfo2.footNoteAuthorId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), str)) {
            return EnumC993840byA.MY_FOOTNOTE.ordinal();
        }
        if (aweme != null && (footNoteInfo = aweme.getFootNoteInfo()) != null && (mainPendingFootNoteInfo = footNoteInfo.mainPendingFootNote) != null && (num = mainPendingFootNoteInfo.rateResult) != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void wQ2(String str) {
        String str2;
        String aid;
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        FootNoteInfo footNoteInfo;
        MainPendingFootNoteInfo mainPendingFootNoteInfo;
        C2344009Gk c2344009Gk = new C2344009Gk();
        VideoItemParams item = getItem();
        String authorUid = null;
        if (item != null && (aweme3 = item.getAweme()) != null && (footNoteInfo = aweme3.getFootNoteInfo()) != null && (mainPendingFootNoteInfo = footNoteInfo.mainPendingFootNote) != null) {
            str2 = mainPendingFootNoteInfo.noteID;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("note_id", str2);
        VideoItemParams item2 = getItem();
        if (item2 != null && (aweme2 = item2.getAweme()) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("related_video_id", aid);
        VideoItemParams item3 = getItem();
        if (item3 != null && (aweme = item3.getAweme()) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        c2344009Gk.LJIIIIZZ("video_creator_id", authorUid);
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("enter_method", LLILLJJLI);
        C20684815ws.LJIILLIIL("action_footnote_in_feed", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        C1556690qbz c1556690qbzLIZ;
        C1556690qbz c1556690qbz = (C1556690qbz) interfaceC0148002o;
        if (this.LL) {
            c1556690qbzLIZ = new C1556690qbz(null, vQ2(videoItemParams.getAweme()), !c1556690qbz.LLILLL);
        } else {
            c1556690qbzLIZ = C1556690qbz.LIZ(c1556690qbz, null, vQ2(videoItemParams.getAweme()), 4);
        }
        this.LL = false;
        return c1556690qbzLIZ;
    }
}
