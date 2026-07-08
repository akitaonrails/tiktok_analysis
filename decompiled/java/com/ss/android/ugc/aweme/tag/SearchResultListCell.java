package com.ss.android.ugc.aweme.tag;

import X.C01GW;
import X.C1243240iSQ;
import X.C20509315Nb;
import X.C452501pT;
import X.EnumC1778700wO4;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class SearchResultListCell extends BaseFriendsListCell<C20509315Nb> {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(280));
    public final EnumC1778700wO4 LLJ = EnumC1778700wO4.SEARCH;

    @Override // com.ss.android.ugc.aweme.tag.BaseFriendsListCell
    public final EnumC1778700wO4 I5() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.tag.BaseFriendsListCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: T5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C20509315Nb c20509315Nb) {
        super.onBindItemView(c20509315Nb);
        IIMService iIMService = (IIMService) this.LLIZLLLIL.getValue();
        if (iIMService != null) {
            TextView textView = (TextView) this.itemView.findViewById(R.id.p0w);
            N5();
            iIMService.setHighlightText(textView, VideoTagFriendsListViewModel.wQ2(c20509315Nb.LL), c20509315Nb.LLILLL);
        }
        IIMService iIMService2 = (IIMService) this.LLIZLLLIL.getValue();
        if (iIMService2 != null) {
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.fs0);
            N5();
            IMUser iMUser = c20509315Nb.LL;
            C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
            String nickName = iMUser.getNickName();
            String uniqueId = iMUser.getUniqueId();
            c1243240iSQ.getClass();
            User user = new User();
            user.setNickname(nickName);
            user.setUniqueId(uniqueId);
            String uniqueId2 = user.getUniqueId();
            if (uniqueId2 == null) {
                uniqueId2 = "";
            }
            iIMService2.setHighlightText(textView2, uniqueId2, c20509315Nb.LLILLL);
        }
    }
}
