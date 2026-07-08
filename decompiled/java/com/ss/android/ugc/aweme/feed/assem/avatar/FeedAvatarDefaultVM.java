package com.ss.android.ugc.aweme.feed.assem.avatar;

import X.C1017070cZd;
import X.C1019620cdk;
import X.C10EU;
import X.C291001Au;
import X.C637980P0q;
import X.C995680c18;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedAvatarDefaultVM extends FeedBaseViewModel<C995680c18> {
    public final void UB1() {
        setState(new AwS603S0100000_24(this, 68));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C995680c18(0);
    }

    public final int vQ2() {
        Aweme aweme;
        VideoItemParams item;
        Aweme aweme2;
        AwemeCommerceStruct commerceVideoAuthInfo;
        VideoItemParams item2 = getItem();
        if (item2 == null || (aweme = item2.getAweme()) == null || !aweme.isCanPlay() || AwemeExtKt.isDelete(aweme)) {
            return 8;
        }
        FeedAvatarAssemWrap.LLLFZ.getClass();
        if (C1019620cdk.LIZIZ(3, aweme) || C1017070cZd.LLLLIIIILLL(aweme)) {
            return 8;
        }
        if (C10EU.LJIIJJI(aweme) || C10EU.LJIILLIIL(aweme.getAuthor()) || (C1017070cZd.LLFII(aweme) && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.isPersonalPageForbidden())) {
            return 4;
        }
        VideoItemParams item3 = getItem();
        if (C637980P0q.LIZ(item3 != null ? item3.getAweme() : null) && ((item = getItem()) == null || (aweme2 = item.getAweme()) == null || aweme2.getAuthor() == null)) {
            return 0;
        }
        return (aweme.getAuthor() == null || aweme.getAuthor().isAdFake()) ? 4 : 0;
    }

    public final String wQ2() {
        Aweme aweme;
        User author;
        ProfileBadgeStruct profileBadge;
        VideoItemParams item = getItem();
        if (item == null || (aweme = item.getAweme()) == null || (author = aweme.getAuthor()) == null || (profileBadge = author.getProfileBadge()) == null || !profileBadge.getShouldShow() || profileBadge.getUrl().length() <= 0) {
            return null;
        }
        return profileBadge.getUrl();
    }

    public final void xQ2(C291001Au<Integer> c291001Au) {
        setState(new AwS603S0100000_24(c291001Au, (C291001Au<Integer>) 69));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        return C995680c18.LIZ((C995680c18) interfaceC0148002o, new C291001Au(Integer.valueOf(vQ2())), wQ2(), null, 4);
    }
}
