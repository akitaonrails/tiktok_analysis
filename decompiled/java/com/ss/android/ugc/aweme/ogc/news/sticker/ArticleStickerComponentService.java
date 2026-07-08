package com.ss.android.ugc.aweme.ogc.news.sticker;

import X.AbstractC19589811ke;
import X.C0N2J;
import X.C19614211oa;
import X.C19640311sn;
import X.C19774612Ym;
import X.InterfaceC19603111mn;
import com.ss.android.ugc.aweme.ogc.news.INewsService;
import com.ss.android.ugc.aweme.tools.sticker.core.article.IArticleStickerComponentService;

/* JADX INFO: loaded from: classes30.dex */
public final class ArticleStickerComponentService implements IArticleStickerComponentService {
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.article.IArticleStickerComponentService
    public final Class<? extends AbstractC19589811ke<?>> LIZ() {
        C19640311sn c19640311snLIZJ;
        InterfaceC19603111mn consumer;
        IArticleStickerService.Companion.getClass();
        INewsService.LIZ.getClass();
        INewsService value = C0N2J.LIZIZ.getValue();
        if (value == null || (c19640311snLIZJ = value.LIZJ()) == null || (consumer = c19640311snLIZJ.getConsumer()) == null || !consumer.LIZJ()) {
            return null;
        }
        return C19614211oa.class;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.article.IArticleStickerComponentService
    public final C19774612Ym LIZIZ() {
        return new C19774612Ym(0);
    }
}
