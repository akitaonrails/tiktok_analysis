package com.ss.android.ugc.feed.platform.cell.template;

import X.C03H5;
import X.C1030680cva;
import X.C1387620mDI;
import X.C13IQ;
import X.C13LE;
import X.C1AV2;
import X.C1AVH;
import X.C20684815ws;
import X.C2180521AVm;
import X.C2344009Gk;
import X.C724270Sb3;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.VideoViewCellRootView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CCTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class CCTemplateAreaComponent extends BaseCellTriggerComponent<CCTemplateAreaComponent> {
    public VideoViewCellRootView LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(CCTemplateAreaAssem.class);
    }

    public final VideoViewCellRootView yp() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.view_rootview) : null;
            this.LLJJLIIIJLLLLLLLZ = (VideoViewCellRootView) viewFindViewById;
        }
        return (VideoViewCellRootView) viewFindViewById;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        tp(videoItemParams);
        if (C1030680cva.LJIIJJI(videoItemParams.getAweme())) {
            return;
        }
        C1387620mDI c1387620mDI = C1387620mDI.LIZ;
        Aweme aweme = videoItemParams.getAweme();
        c1387620mDI.getClass();
        if (C1387620mDI.LJI(aweme)) {
            VideoViewCellRootView videoViewCellRootViewYp = yp();
            if (videoViewCellRootViewYp != null && (viewFindViewById4 = videoViewCellRootViewYp.findViewById(R.id.widget_container)) != null) {
                C2180521AVm.LIZLLL(viewFindViewById4, 8, (C1AV2) C1AVH.LJJIJIIJI.getValue());
            }
            VideoViewCellRootView videoViewCellRootViewYp2 = yp();
            if (videoViewCellRootViewYp2 != null && (viewFindViewById3 = videoViewCellRootViewYp2.findViewById(R.id.dkc)) != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById3);
                return;
            }
            return;
        }
        VideoViewCellRootView videoViewCellRootViewYp3 = yp();
        if (videoViewCellRootViewYp3 != null && (viewFindViewById2 = videoViewCellRootViewYp3.findViewById(R.id.widget_container)) != null) {
            C2180521AVm.LIZLLL(viewFindViewById2, 0, (C1AV2) C1AVH.LJJIJIIJI.getValue());
        }
        VideoViewCellRootView videoViewCellRootViewYp4 = yp();
        if (videoViewCellRootViewYp4 == null || (viewFindViewById = videoViewCellRootViewYp4.findViewById(R.id.dkc)) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        C1387620mDI c1387620mDI = C1387620mDI.LIZ;
        Aweme aweme = videoItemParams.getAweme();
        c1387620mDI.getClass();
        if (C1387620mDI.LJI(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Object obj;
        Object obj2;
        Aweme aweme2;
        Object obj3;
        String fromGroupId;
        Object obj4;
        String previousPage;
        Object obj5;
        String template_id;
        Integer numValueOf;
        String match_type;
        CCTemplateInfo ccTemplateInfo;
        String template_music_id;
        Music music;
        String idStr;
        CCTemplateInfo ccTemplateInfo2;
        CCTemplateInfo ccTemplateInfo3;
        CCTemplateInfo ccTemplateInfo4;
        Object obj6;
        C1387620mDI c1387620mDI = C1387620mDI.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme3 = ((VideoItemParams) obj).getAweme();
        c1387620mDI.getClass();
        if (!C1387620mDI.LJI(aweme3)) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj6 = c724270Sb32.LL;
            } else {
                obj6 = null;
            }
            if (!C1387620mDI.LJFF(((VideoItemParams) obj6).getAweme())) {
                return;
            }
        }
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj2 = c724270Sb33.LL;
        } else {
            obj2 = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) obj2;
        if (videoItemParams != null && (aweme2 = videoItemParams.getAweme()) != null && aweme2.getCcTemplateInfo() != null) {
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj3 = c724270Sb34.LL;
            } else {
                obj3 = null;
            }
            BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) obj3).baseFeedPageParams;
            String str = "";
            if (baseFeedPageParams == null || (fromGroupId = baseFeedPageParams.getFromGroupId()) == null) {
                fromGroupId = "";
            }
            C724270Sb3 c724270Sb35 = this.LLJI;
            if (c724270Sb35 != null) {
                obj4 = c724270Sb35.LL;
            } else {
                obj4 = null;
            }
            BaseFeedPageParams baseFeedPageParams2 = ((VideoItemParams) obj4).baseFeedPageParams;
            if (baseFeedPageParams2 == null || (previousPage = baseFeedPageParams2.getPreviousPage()) == null) {
                previousPage = "";
            }
            C724270Sb3 c724270Sb36 = this.LLJI;
            if (c724270Sb36 != null) {
                obj5 = c724270Sb36.LL;
            } else {
                obj5 = null;
            }
            Aweme aweme4 = ((VideoItemParams) obj5).getAweme();
            Context context = getContext();
            if (context != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("group_id", fromGroupId);
                if (aweme4 == null || (ccTemplateInfo4 = aweme4.getCcTemplateInfo()) == null || (template_id = ccTemplateInfo4.getTemplate_id()) == null) {
                    template_id = "";
                }
                c2344009Gk.LJIIIIZZ("template_id", template_id);
                c2344009Gk.LIZJ(C1387620mDI.LIZIZ(context), "is_install_lv");
                c2344009Gk.LJIIIIZZ("enter_from", previousPage);
                if (aweme4 != null && (ccTemplateInfo3 = aweme4.getCcTemplateInfo()) != null) {
                    numValueOf = Integer.valueOf(ccTemplateInfo3.getTemplateOrder());
                } else {
                    numValueOf = null;
                }
                c2344009Gk.LJ(numValueOf, "order");
                if (aweme4 == null || (ccTemplateInfo2 = aweme4.getCcTemplateInfo()) == null || (match_type = ccTemplateInfo2.getMatch_type()) == null) {
                    match_type = "";
                }
                c2344009Gk.LJIIIIZZ("match_type", match_type);
                if (C1387620mDI.LJFF(aweme4)) {
                    if (aweme4 != null && (music = aweme4.getMusic()) != null && (idStr = music.getIdStr()) != null) {
                        str = idStr;
                    }
                    c2344009Gk.LJFF("music_id", str);
                    if (aweme4 != null) {
                        aid = aweme4.getAid();
                    }
                    c2344009Gk.LJFF("match_item_id", aid);
                } else {
                    if (aweme4 != null && (ccTemplateInfo = aweme4.getCcTemplateInfo()) != null && (template_music_id = ccTemplateInfo.getTemplate_music_id()) != null) {
                        str = template_music_id;
                    }
                    c2344009Gk.LJFF("music_id", str);
                }
                C20684815ws.LJIILLIIL("cc_music_template_detail_page_show", c2344009Gk.LIZ);
            }
        }
    }
}
