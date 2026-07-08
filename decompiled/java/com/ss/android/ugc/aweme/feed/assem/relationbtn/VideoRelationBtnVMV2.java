package com.ss.android.ugc.aweme.feed.assem.relationbtn;

import X.C2174851A9r;
import X.C584770Mwd;
import X.C729510SjV;
import X.EnumC2174841A9q;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS399S0200000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class VideoRelationBtnVMV2 extends FeedBaseViewModel<C2174851A9r> {
    public Integer LL;
    public boolean LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2174851A9r(0);
    }

    public final boolean vQ2(Integer num) {
        Aweme aweme;
        VideoItemParams item = getItem();
        User author = null;
        if (item != null && (aweme = item.getAweme()) != null) {
            author = aweme.getAuthor();
        }
        if (num == null || author == null || author.getFollowStatus() != 0) {
            return false;
        }
        return true;
    }

    public final void wQ2(Aweme aweme, EnumC2174841A9q enumC2174841A9q) {
        String aid;
        String aid2;
        if (enumC2174841A9q == EnumC2174841A9q.FOLLOW_SINGLE) {
            if (aweme != null) {
                if (C729510SjV.LJJ(aweme)) {
                    aid2 = AwemeExtKt.getAuthorUid(aweme);
                } else {
                    aid2 = aweme.getAid();
                }
                if (aid2 != null) {
                    C584770Mwd.LIZ.put(aid2, Boolean.TRUE);
                }
            }
        } else if (aweme != null) {
            if (C729510SjV.LJJ(aweme)) {
                aid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                aid = aweme.getAid();
            }
            if (aid != null) {
                C584770Mwd.LIZ.put(aid, Boolean.FALSE);
            }
        }
        setState(new AwS399S0200000_33(aweme, enumC2174841A9q, 10));
    }
}
