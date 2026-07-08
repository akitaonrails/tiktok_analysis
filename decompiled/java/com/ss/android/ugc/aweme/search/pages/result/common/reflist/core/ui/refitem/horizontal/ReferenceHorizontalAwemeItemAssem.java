package com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.horizontal;

import X.C1331660kl2;
import X.C1331670kl3;
import X.C434570H2h;
import X.C438710HIf;
import X.C723830SaL;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class ReferenceHorizontalAwemeItemAssem extends BaseReferenceHorizontalItemAssem<C434570H2h> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public SmartImageView LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ezd;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.horizontal.BaseReferenceHorizontalItemAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.tv_title);
        this.LLJL = (SmartImageView) view.findViewById(R.id.ld7);
        C723830SaL.LIZ(this, null, new AwS585S0100000_6(this, 153));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        Video video;
        UrlModel cover;
        C434570H2h c434570H2h = (C434570H2h) obj;
        op(c434570H2h);
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            tuxTextView.setText(c434570H2h.LL.getDesc());
        }
        Aweme aweme = c434570H2h.LL;
        if (aweme != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
            c1331670kl3LJIIIIZZ.LJJ(this.LLJL);
            c1331670kl3LJIIIIZZ.LJIIJJI();
        }
    }
}
