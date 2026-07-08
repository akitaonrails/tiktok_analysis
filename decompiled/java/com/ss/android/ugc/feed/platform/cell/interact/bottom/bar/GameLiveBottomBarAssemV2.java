package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C01GW;
import X.C0J5O;
import X.C1A56;
import X.C1A57;
import X.C1A58;
import X.C1A5A;
import X.C20267014Rw;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.C589080N8o;
import X.C786410Ut5;
import Y.ACListenerS97S0300000_33;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerUIProps;
import com.ss.android.ugc.aweme.feed.model.live.RelatedLiveTagStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS417S0200000_16;

/* JADX INFO: loaded from: classes34.dex */
public final class GameLiveBottomBarAssemV2 extends InteractBottomBannerAssem<GameLiveBottomBarAssemV2> {
    public C1A58 LLLFFI;
    public final C01GW LLLFZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(507));

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final String Jp() {
        return "bottom_banner_game_live";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final FeedBottomBannerConfig Up(FeedBottomBannerConfig.Builder builder) {
        builder.setIconWithLocalRes(R.raw.icon_live_tv_fill);
        builder.setUpdateTitleSync(false);
        builder.setInteractionWithArrow(AFwS243S0000000_11.get$arr$(211));
        return builder.build();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final boolean dq(VideoItemParams videoItemParams) {
        int i = GameLiveBottomBarAssemTriggerV2.LLJLL;
        return C1A56.LJ(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final void fq(VideoItemParams videoItemParams) {
        RelatedLiveTagStruct relatedLiveTag;
        super.fq(videoItemParams);
        RelatedLiveTagStruct relatedLiveTag2 = videoItemParams.getAweme().getRelatedLiveTag();
        String str = null;
        if (relatedLiveTag2 != null) {
            String str2 = relatedLiveTag2.content;
            String str3 = relatedLiveTag2.relatedTag;
            String str4 = relatedLiveTag2.tagName;
            if (str3 != null && str3.length() != 0 && str2 != null && str2.length() != 0 && str4 != null && str4.length() != 0) {
                try {
                    iq(Collections.singletonList(new FeedBottomBannerUIProps.Title(str2)));
                    Ip(new ACListenerS97S0300000_33(videoItemParams, this, relatedLiveTag2, 1));
                    C1A57.LIZ.getClass();
                    if (!C1A57.LIZJ()) {
                        Aweme aweme = videoItemParams.getAweme();
                        if (aweme != null && (relatedLiveTag = aweme.getRelatedLiveTag()) != null) {
                            str = relatedLiveTag.relatedTag;
                        }
                        C1A57.LIZ(str, videoItemParams.getAweme().getAid());
                        return;
                    }
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C589080N8o.LIZLLL(C20267014Rw.LIZ, "GameLiveBottomBarAssemTest", new AwS417S0200000_16(e, this, 38));
                    return;
                }
            }
        }
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }

    public static void kq(String str, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("page_type", str);
        HashMap map2 = (HashMap) map;
        String str2 = (String) map2.get("related_from_video_id");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJFF("related_from_video_id", str2);
        String str4 = (String) map2.get("bottombar_content_type");
        if (str4 != null) {
            str3 = str4;
        }
        c2344009Gk.LJFF("bottom_bar_type", str3);
        C20684815ws.LJIILLIIL("livesdk_bottombar_jump_double_column_page", c2344009Gk.LIZ);
    }

    public final void jq(C1A5A c1a5a, Map<String, String> map, String str, Context context) {
        ILiveOuterService iLiveOuterService;
        C0J5O c0j5oZ5;
        List<Long> list;
        int i;
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager != null && (iLiveOuterService = (ILiveOuterService) serviceManager.getService(ILiveOuterService.class)) != null && (c0j5oZ5 = iLiveOuterService.z5()) != null) {
            if (c1a5a != null) {
                list = c1a5a.LIZ;
            } else {
                list = null;
            }
            if (c1a5a != null) {
                i = c1a5a.LIZIZ + 1;
            } else {
                i = 0;
            }
            c0j5oZ5.LIZ(context, map, str, list, i, this.LLLFFI);
        }
    }
}
