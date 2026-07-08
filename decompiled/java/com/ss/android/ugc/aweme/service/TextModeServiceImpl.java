package com.ss.android.ugc.aweme.service;

import X.C03H5;
import X.C0RF0;
import X.C10EU;
import X.C13IQ;
import X.C13LE;
import X.C299470BoX;
import X.C300940Bqu;
import X.C720360SNm;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.FeedTextViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tag.FeedTextModeTriggerForGenreTagContainer;
import com.ss.android.ugc.aweme.tag.FeedTextModeTriggerForVideoTagContainer;
import com.ss.android.ugc.aweme.tag.FeedTextModeVideoTagTrigger;

/* JADX INFO: loaded from: classes12.dex */
public final class TextModeServiceImpl implements ITextModeService {
    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final C13IQ<?> LIZ() {
        return C13LE.LIZ(FeedTextModeTriggerForVideoTagContainer.class);
    }

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LIZIZ() {
        return C13LE.LIZ(FeedTextModeVideoTagTrigger.class);
    }

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final C13IQ<?> LJ() {
        return C13LE.LIZ(FeedTextModeTriggerForGenreTagContainer.class);
    }

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final boolean LIZJ(Aweme aweme) {
        if (aweme != null) {
            User author = aweme.getAuthor();
            if ((author == null || ((!C300940Bqu.LIZ() && !C299470BoX.LIZ()) || C10EU.LJIILLIIL(author))) && C720360SNm.LJIIL(aweme) && !AwemeBizExtKt.getReplaceRecTagByRepost(aweme)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final Object LIZLLL(Object obj) {
        return new FeedTextViewHolder((C0RF0) obj);
    }
}
