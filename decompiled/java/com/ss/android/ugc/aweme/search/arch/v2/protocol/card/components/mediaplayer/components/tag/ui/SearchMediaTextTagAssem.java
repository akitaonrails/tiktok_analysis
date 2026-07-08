package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.tag.ui;

import X.C21565319aV;
import X.C337180DJs;
import X.C418440Gaw;
import X.C426750GoL;
import X.C652840Pj8;
import X.C814420VxA;
import X.InterfaceC655790Pnt;
import X.InterfaceC657240PqE;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaTextTagAssem extends BaseSearchMediaOptionalAssem {
    public TuxTextView LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eud;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        op(view);
        C426750GoL.LJIIIZ(view, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 24);
        C21565319aV.LIZIZ(getContentView(), Float.valueOf(C418440Gaw.LIZIZ(4)), null, null, null, null, 30);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    public final void op(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.u95);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(InterfaceC657240PqE interfaceC657240PqE) {
        up(interfaceC657240PqE);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    /* JADX INFO: renamed from: tp */
    public final void up(InterfaceC657240PqE interfaceC657240PqE) {
        C652840Pj8 c652840Pj8;
        String title;
        VideoTag videoTag;
        super.up(interfaceC657240PqE);
        InterfaceC655790Pnt tag = interfaceC657240PqE.getTag();
        if ((tag instanceof C652840Pj8) && (c652840Pj8 = (C652840Pj8) tag) != null) {
            if (c652840Pj8.LIZ) {
                Video video = interfaceC657240PqE.getAweme().getVideo();
                if (video != null && (videoTag = video.getVideoTag()) != null) {
                    title = videoTag.getTitle();
                }
                C337180DJs.LIZ(getContentView());
            }
            title = c652840Pj8.LIZIZ;
            if (title != null) {
                TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
                if (tuxTextView != null) {
                    tuxTextView.setText(title);
                    return;
                }
                return;
            }
            C337180DJs.LIZ(getContentView());
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    public final boolean up(InterfaceC657240PqE interfaceC657240PqE) {
        return interfaceC657240PqE.getTag() instanceof C652840Pj8;
    }
}
