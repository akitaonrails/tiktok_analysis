package com.ss.android.ugc.aweme.detail.panel;

import X.C0R06;
import X.C116L;
import X.C1266190j3R;
import X.C1324750kZt;
import X.C1360520lVa;
import X.C1389890mGx;
import X.C13LP;
import X.C1697810uHb;
import X.C20684815ws;
import X.C21459218yU;
import X.C2344009Gk;
import X.C786410Ut5;
import X.InterfaceC19576611iW;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.panel.EffectDiscoverPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class EffectDiscoverPanel extends ShootFeedPanel {
    public RemoteImageView G0;
    public C21459218yU H0;

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int L0() {
        return 2131857979;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel, com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void Cu1() {
        super.Cu1();
        VerticalViewPager verticalViewPager = this.LLJJIJI;
        if (verticalViewPager != null) {
            verticalViewPager.LIZJ(new C1266190j3R(this, 3));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel, com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w
    public final void initPanel() {
        super.initPanel();
        Aweme awemeO = o();
        if (awemeO != null) {
            O0(awemeO);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void I0(View view) {
        NewFaceStickerBean stickerEntranceInfo;
        int currentItem;
        String str;
        Music music;
        NewFaceStickerBean stickerEntranceInfo2;
        int videoLength;
        int videoLength2 = 0;
        if (this.LLLLIIIILLL.isFromEffectDiscoverTab()) {
            if (this.activity != null && ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(this.activity)) {
                Activity activity = this.activity;
                C786410Ut5.re(Toast.makeText(activity, activity.getString(2131832497), 0));
                return;
            }
            Aweme awemeLJIIIIZZ = LJIIIIZZ();
            if (awemeLJIIIIZZ == null || (stickerEntranceInfo2 = awemeLJIIIIZZ.getStickerEntranceInfo()) == null) {
                return;
            }
            IPropReuseService iPropReuseService = (IPropReuseService) ServiceManager.get().getService(IPropReuseService.class);
            Music music2 = awemeLJIIIIZZ.getMusic();
            String aid = awemeLJIIIIZZ.getAid();
            if (awemeLJIIIIZZ.getVideo() != null) {
                videoLength = awemeLJIIIIZZ.getVideo().getVideoLength();
            } else {
                videoLength = 0;
            }
            iPropReuseService.LJ(this.activity, C1697810uHb.LJ(stickerEntranceInfo2), music2, getPreviousPage(), stickerEntranceInfo2.ownerId, aid, Integer.valueOf(awemeLJIIIIZZ.getAwemeType()), videoLength, ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera(), "prop_page_discover", awemeLJIIIIZZ, null, null, "", false, false, "", "", null);
            return;
        }
        if (!this.LLLLIIIILLL.isFromEffectDiscoverPanel()) {
            return;
        }
        final Aweme awemeLJIIIIZZ2 = LJIIIIZZ();
        if (awemeLJIIIIZZ2 != null && (stickerEntranceInfo = awemeLJIIIIZZ2.getStickerEntranceInfo()) != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("enter_from", "video_shoot_page");
            c2344009Gk.LJFF("group_id", awemeLJIIIIZZ2.getAid());
            VerticalViewPager verticalViewPager = this.LLJJIJI;
            if (verticalViewPager != null) {
                currentItem = verticalViewPager.getCurrentItem() + 1;
            } else {
                currentItem = 0;
            }
            c2344009Gk.LIZJ(currentItem, "impr_position");
            NewFaceStickerBean stickerEntranceInfo3 = awemeLJIIIIZZ2.getStickerEntranceInfo();
            if (stickerEntranceInfo3 == null || (str = stickerEntranceInfo3.id) == null) {
                str = "";
            }
            c2344009Gk.LJFF("prop_id", str);
            Bundle arguments = getArguments();
            if (arguments != null) {
                c2344009Gk.LJFF("creation_id", arguments.getString("creation_id", ""));
                c2344009Gk.LJFF("shoot_way", arguments.getString("shoot_way", ""));
                c2344009Gk.LJFF("shoot_tab_name", arguments.getString("shoot_tab_name", ""));
            }
            C20684815ws.LJIILLIIL("prop_discover_prop_click", c2344009Gk.LIZ);
            boolean zDownloadEffectOrMusicAfterEnterCamera = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
            IPropReuseService iPropReuseService2 = (IPropReuseService) ServiceManager.get().getService(IPropReuseService.class);
            Activity activity2 = this.activity;
            List<String> listSingletonList = Collections.singletonList(stickerEntranceInfo.id);
            Music music3 = awemeLJIIIIZZ2.getMusic();
            if (music3 != null && music3.isPgc()) {
                music = awemeLJIIIIZZ2.getMusic();
            } else {
                music = null;
            }
            Video video = awemeLJIIIIZZ2.getVideo();
            if (video != null) {
                videoLength2 = video.getVideoLength();
            }
            iPropReuseService2.LJFF(activity2, listSingletonList, new C116L(null, "video_shoot_page", music, true, null, "video_shoot_page", null, null, "prop_panel_discover", null, null, false, null, Integer.valueOf(videoLength2), null, new InterfaceC19576611iW() { // from class: X.0mTv
                @Override // X.InterfaceC19576611iW
                public final void LIZ(int i, Effect effect) throws Throwable {
                    int currentItem2;
                    if (effect != null) {
                        Aweme aweme = awemeLJIIIIZZ2;
                        EffectDiscoverPanel effectDiscoverPanel = this;
                        Intent intent = new Intent();
                        intent.putExtra("aweme_music", aweme.getMusic());
                        intent.putExtra("request_code_select_effect_result", (Parcelable) effect);
                        VerticalViewPager verticalViewPager2 = effectDiscoverPanel.LLJJIJI;
                        if (verticalViewPager2 != null) {
                            currentItem2 = verticalViewPager2.getCurrentItem() + 1;
                        } else {
                            currentItem2 = 0;
                        }
                        intent.putExtra("impr_position", currentItem2);
                        Activity activity3 = effectDiscoverPanel.activity;
                        if (activity3 != null && !activity3.isFinishing()) {
                            Activity activity4 = effectDiscoverPanel.activity;
                            if (activity4 != null) {
                                C2204961BRm.LJIIL(-1, activity4, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6td57H0Hx2mTZlVHtH+3XR90hlosZJcsDEafX+5Ppm", null));
                            }
                            Activity activity5 = effectDiscoverPanel.activity;
                            if (activity5 != null) {
                                activity5.finish();
                            }
                        }
                    }
                }
            }, null, false, null, null, null, null, null, null, null, false, null, null, awemeLJIIIIZZ2, null, 0, -536953423), zDownloadEffectOrMusicAfterEnterCamera);
            return;
        }
        String string = this.activity.getString(2131834217);
        C1389890mGx c1389890mGx = new C1389890mGx(this.activity);
        c1389890mGx.LJIIJ(string);
        c1389890mGx.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View M0(RelativeLayout relativeLayout) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.bll, relativeLayout, false);
        this.G0 = (RemoteImageView) viewTd.findViewById(R.id.w62);
        this.H0 = (C21459218yU) viewTd.findViewById(R.id.hu1);
        RemoteImageView remoteImageView = this.G0;
        RemoteImageView remoteImageView2 = null;
        if (remoteImageView == null) {
            remoteImageView = null;
        }
        C0R06.LIZ(remoteImageView, R.dimen.b6);
        RemoteImageView remoteImageView3 = this.G0;
        if (remoteImageView3 != null) {
            remoteImageView2 = remoteImageView3;
        }
        C0R06.LIZIZ(remoteImageView2, 36);
        return viewTd;
    }

    public final void O0(Aweme aweme) {
        String str;
        UrlModel urlModel;
        List<String> urlList;
        String str2;
        NewFaceStickerBean stickerEntranceInfo = aweme.getStickerEntranceInfo();
        C21459218yU c21459218yU = null;
        if (stickerEntranceInfo != null && (urlModel = stickerEntranceInfo.iconUrl) != null && (urlList = urlModel.getUrlList()) != null && (str2 = (String) C13LP.LJJJLL(urlList)) != null) {
            RemoteImageView remoteImageView = this.G0;
            if (remoteImageView == null) {
                remoteImageView = null;
            }
            C1324750kZt.LJIIIZ(remoteImageView, str2, -1, -1);
        }
        NewFaceStickerBean stickerEntranceInfo2 = aweme.getStickerEntranceInfo();
        if (stickerEntranceInfo2 != null && (str = stickerEntranceInfo2.name) != null) {
            C21459218yU c21459218yU2 = this.H0;
            if (c21459218yU2 == null) {
                c21459218yU2 = null;
            }
            c21459218yU2.setTuxFont(42);
            C21459218yU c21459218yU3 = this.H0;
            if (c21459218yU3 != null) {
                c21459218yU = c21459218yU3;
            }
            C1360520lVa c1360520lVa = new C1360520lVa();
            c1360520lVa.LIZ.append((CharSequence) str);
            N0(c21459218yU, c1360520lVa.LIZ.toString());
        }
    }
}
