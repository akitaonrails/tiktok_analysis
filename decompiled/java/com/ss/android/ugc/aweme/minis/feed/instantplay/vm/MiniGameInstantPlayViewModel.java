package com.ss.android.ugc.aweme.minis.feed.instantplay.vm;

import X.C1006240cIA;
import X.C1006330cIJ;
import X.C1210880hcE;
import X.C13LP;
import X.C1440005kM;
import X.EnumC1006610cIl;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.minis.feed.instantplay.model.FeedSubcardInfo;
import com.ss.android.ugc.aweme.minis.feed.instantplay.model.GameCardMaterial;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class MiniGameInstantPlayViewModel extends AssemViewModel<C1006240cIA> {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public boolean LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1006240cIA(0);
    }

    public final void vQ2(Aweme aweme, EnumC1006610cIl enumC1006610cIl) {
        FeedSubcardInfo feedSubcardInfo;
        String str;
        List<FeedSubcardInfo> list;
        VideoItemParams videoItemParams;
        Map<String, String> map = null;
        if (aweme == null && ((videoItemParams = getState().LLILLL) == null || (aweme = videoItemParams.getAweme()) == null)) {
            return;
        }
        this.LL = true;
        if (enumC1006610cIl != null) {
            GameCardMaterial gameCardMaterial = getState().LL;
            if (gameCardMaterial != null && (list = gameCardMaterial.feedSubcardInfoList) != null) {
                feedSubcardInfo = (FeedSubcardInfo) C13LP.LJJJLL(list);
            } else {
                feedSubcardInfo = null;
            }
            C1006330cIJ c1006330cIJ = C1006330cIJ.LIZ;
            if (feedSubcardInfo != null) {
                str = feedSubcardInfo.clientKey;
                map = feedSubcardInfo.extraParams;
            } else {
                str = null;
            }
            c1006330cIJ.getClass();
            C1006330cIJ.LIZLLL(str, map, enumC1006610cIl, false);
        }
        C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_NOT_INTERESTED", "diff_type_minis_instant_play_card_not_interested", aweme));
    }
}
