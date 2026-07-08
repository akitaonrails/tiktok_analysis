package com.ss.android.ugc.aweme.im.sdk.chat;

import X.AbstractC899510ZQn;
import X.C0I4X;
import X.C0I6W;
import X.C0I6X;
import X.C13LE;
import X.C19719912Dl;
import X.C461000I5y;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IStoryV2AnimViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.IIMQuotedAreaService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.QuoteAreaContainerAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.QuotedAreaReusedAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.QuotedAreaAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.StoryReactionAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class IMQuotedAreaService implements IIMQuotedAreaService {
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.IIMQuotedAreaService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.IIMQuotedAreaService
    public final C19719912Dl LIZLLL() {
        return C13LE.LIZ(StoryReactionAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.IIMQuotedAreaService
    public final C19719912Dl LJ() {
        return C13LE.LIZ(QuotedAreaAssem.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0I6X] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.IIMQuotedAreaService
    public final C0I6X LIZIZ(final IStoryV2AnimViewModel iStoryV2AnimViewModel, final C0I4X c0i4x) {
        return new AbstractC899510ZQn<QuotedAreaReusedAssem, C461000I5y>(iStoryV2AnimViewModel, c0i4x) { // from class: X.0I6X
            public final IStoryV2AnimViewModel LIZJ;
            public final C0I4X LIZLLL;

            {
                super(new C899530ZQp(C13LE.LIZ(QuotedAreaReusedAssem.class), R.layout.clh), C1EEZ.LIZ);
                this.LIZJ = iStoryV2AnimViewModel;
                this.LIZLLL = c0i4x;
            }

            @Override // X.AbstractC899510ZQn
            public final C461020I6a<C461000I5y> LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i) {
                C460810I5f c460810I5f;
                C0I4X c0i4x2 = this.LIZLLL;
                if (c0i4x2 == null || (c460810I5f = c0i4x2.LIZIZ(c869590Y9l)) == null) {
                    c460810I5f = new C460810I5f(null, null, null, 63);
                }
                return new C461020I6a<>(new C461000I5y(c460810I5f, C0I6T.LIZ(c869590Y9l, c460810I5f.LLILZ instanceof C460380I3o, this.LIZJ.xQ2(c869590Y9l.getUuid()))), c460810I5f.LIZIZ());
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0I6W] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.IIMQuotedAreaService
    public final C0I6W LIZ(final IStoryV2AnimViewModel iStoryV2AnimViewModel, final C0I4X c0i4x, final InterfaceC665370Q7z interfaceC665370Q7z) {
        return new AbstractC899510ZQn<QuoteAreaContainerAssem, C461000I5y>(iStoryV2AnimViewModel, c0i4x, interfaceC665370Q7z) { // from class: X.0I6W
            public final IStoryV2AnimViewModel LIZJ;
            public final C0I4X LIZLLL;
            public final InterfaceC665370Q7z LJ;

            {
                super(new C899530ZQp(C13LE.LIZ(QuoteAreaContainerAssem.class), R.layout.clj), C1EEZ.LIZ);
                this.LIZJ = iStoryV2AnimViewModel;
                this.LIZLLL = c0i4x;
                this.LJ = interfaceC665370Q7z;
            }

            @Override // X.AbstractC899510ZQn
            public final C461020I6a<C461000I5y> LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i) {
                C460810I5f c460810I5f;
                C0I4X c0i4x2 = this.LIZLLL;
                if (c0i4x2 == null || (c460810I5f = c0i4x2.LIZIZ(c869590Y9l)) == null) {
                    c460810I5f = new C460810I5f(null, null, null, 63);
                }
                return new C461020I6a<>(new C461000I5y(C460810I5f.LIZ(c460810I5f, null, false, null, C0I5Z.LIZ(c869590Y9l), 31), C0I6T.LIZ(c869590Y9l, c460810I5f.LLILZ instanceof C460380I3o, this.LIZJ.xQ2(c869590Y9l.getUuid()))), c460810I5f.LIZIZ());
            }
        };
    }
}
