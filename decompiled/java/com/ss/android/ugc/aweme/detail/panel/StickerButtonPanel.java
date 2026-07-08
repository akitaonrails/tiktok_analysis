package com.ss.android.ugc.aweme.detail.panel;

import X.C1394200mNu;
import X.C1402280maw;
import X.C1697810uHb;
import X.C19WF;
import X.C20684815ws;
import X.C2344009Gk;
import X.C786410Ut5;
import X.InterfaceC1397970mTz;
import Y.ARunnableS11S1200000_6;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class StickerButtonPanel extends ShootFeedPanel {
    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void I0(View view) {
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int L0() {
        return 2131857979;
    }

    public final void S0() {
        Object obj = this.LLLLLLLLLL;
        if (obj instanceof InterfaceC1397970mTz) {
            ((InterfaceC1397970mTz) obj).K51(o(), new AwS600S0100000_21(this, 113));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View M0(RelativeLayout relativeLayout) {
        return C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.bli, relativeLayout, false);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void c0(List<Aweme> list) {
        d0(list, false);
        S0();
    }

    public final void P0(Context context, NewFaceStickerBean newFaceStickerBean) {
        String aid;
        String str = newFaceStickerBean.effectId;
        if (str != null) {
            String previousPage = getPreviousPage();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", previousPage);
            c2344009Gk.LJIIIIZZ("prop_id", newFaceStickerBean.effectId);
            c2344009Gk.LJIIIIZZ("author_id", newFaceStickerBean.ownerId);
            Aweme awemeO = o();
            Music music = null;
            if (awemeO != null) {
                aid = awemeO.getAid();
            } else {
                aid = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            c2344009Gk.LJIIIIZZ("enter_method", "profile_tab_bottom");
            Intrinsics.LJFF(getPreviousPage(), "from_music");
            C20684815ws.LJIILLIIL("enter_prop_detail", c2344009Gk.LIZ);
            SmartRoute smartRouteLIZ = C1394200mNu.LIZ.LIZ(context, str, previousPage);
            smartRouteLIZ.withParam("extra_sticker_from", "from_sticker_master_profile");
            smartRouteLIZ.withParam("extra_music_from", "from_sticker_master_profile");
            smartRouteLIZ.withParam("extra_related_item", newFaceStickerBean.relatedAweme);
            smartRouteLIZ.withParam("extra_owner_id", newFaceStickerBean.ownerId);
            smartRouteLIZ.withParam("extra_open_from_profile_page", true);
            smartRouteLIZ.withParam("extra_url_icon", newFaceStickerBean.iconUrl);
            smartRouteLIZ.withParam("featured_video_source", newFaceStickerBean.featureVideoSource);
            smartRouteLIZ.withParam("extra_stickers", C1697810uHb.LJ(str));
            Aweme awemeO2 = o();
            if (awemeO2 != null) {
                music = awemeO2.getMusic();
            }
            smartRouteLIZ.withParam("music_model", music);
            smartRouteLIZ.withParam("prop_page_enter_method", "profile_tab_bottom");
            smartRouteLIZ.open();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        S0();
        this.LLJJIJI.LIZJ(new C1402280maw(this, 0));
    }

    public static void O0(View view, TextView textView, String str) {
        C19WF c19wfLIZIZ = q0.LIZIZ(view);
        c19wfLIZIZ.LIZ(0.0f);
        c19wfLIZIZ.LIZJ(100L);
        ARunnableS11S1200000_6 aRunnableS11S1200000_6 = new ARunnableS11S1200000_6(view, textView, str, 0);
        View view2 = c19wfLIZIZ.LIZ.get();
        if (view2 != null) {
            view2.animate().withEndAction(aRunnableS11S1200000_6);
        }
        c19wfLIZIZ.LJFF();
    }
}
