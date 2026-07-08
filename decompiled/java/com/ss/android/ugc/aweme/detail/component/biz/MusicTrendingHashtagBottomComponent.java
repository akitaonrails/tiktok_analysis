package com.ss.android.ugc.aweme.detail.component.biz;

import X.C01GW;
import X.C1212100heC;
import X.C1449410nox;
import X.C1449430noz;
import X.C15L7;
import X.C1843500y4a;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C298270Bmb;
import X.C418440Gaw;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.MusicTrendingHashtagInfo;
import com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.MusicRecordService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicTrendingHashtagBottomComponent extends ShootButtonBottomComponent {
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 539));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 537));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 538));

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    /* JADX INFO: renamed from: do */
    public final int mo176do() {
        return 2131837717;
    }

    public final MusicTrendingHashtagInfo mo() {
        return (MusicTrendingHashtagInfo) this.LLIZLLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final void bo(View view) {
        Aweme awemeLJIIIIZZ;
        boolean zDownloadEffectOrMusicAfterEnterCamera;
        boolean zIsRecording;
        String strLJJJJZ;
        String hashTagId;
        String hashTagId2;
        String hashtagName;
        String hashtagName2;
        IConfigService iConfigServiceConfigService;
        IShortVideoConfig iShortVideoConfigShortVideoConfig;
        IConfigService iConfigServiceConfigService2;
        IAVSettingsService iAVSettingsServiceAvsettingsConfig;
        IMSAdaptionService iMSAdaptionService;
        int videoLength = 0;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        boolean z = true;
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(C724240Sb0.LIZ(this), "trending_hashtag_card", true)) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null && (iMSAdaptionService = (IMSAdaptionService) PluggableExtentionKt.pluggableSpi$default(IMSAdaptionService.class, false, false, false, 14, null)) != null && iMSAdaptionService.LIZLLL(c19egLIZ)) {
                C786410Ut5.re(Toast.makeText(c19egLIZ, c19egLIZ.getString(2131832497), 0));
                return;
            }
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLILZLL.getValue();
            if (iFeedPanelPlatformAbility != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ()) != null) {
                String string = UUID.randomUUID().toString();
                IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                if (iExternalService != null && (iConfigServiceConfigService2 = iExternalService.configService()) != null && (iAVSettingsServiceAvsettingsConfig = iConfigServiceConfigService2.avsettingsConfig()) != null) {
                    zDownloadEffectOrMusicAfterEnterCamera = iAVSettingsServiceAvsettingsConfig.downloadEffectOrMusicAfterEnterCamera();
                } else {
                    zDownloadEffectOrMusicAfterEnterCamera = false;
                }
                IExternalService iExternalService2 = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                if (iExternalService2 != null && (iConfigServiceConfigService = iExternalService2.configService()) != null && (iShortVideoConfigShortVideoConfig = iConfigServiceConfigService.shortVideoConfig()) != null) {
                    zIsRecording = iShortVideoConfigShortVideoConfig.isRecording();
                } else {
                    zIsRecording = false;
                }
                Music music = (Music) this.LLIZ.getValue();
                if (music != null && music.available()) {
                    Music music2 = (Music) this.LLIZ.getValue();
                    if (!zDownloadEffectOrMusicAfterEnterCamera || (zIsRecording && c19egLIZ != null)) {
                        z = false;
                    }
                    if (music2 != null) {
                        if (awemeLJIIIIZZ.getMusicBeginTime() < awemeLJIIIIZZ.getMusicEndTime() && awemeLJIIIIZZ.getMusicBeginTime() >= 0) {
                            music2.setMusicBeginTime(awemeLJIIIIZZ.getMusicBeginTime());
                            music2.setMusicEndTime(awemeLJIIIIZZ.getMusicEndTime());
                        }
                        MusicRecordService musicRecordService = new MusicRecordService();
                        music2.setMusicSelectedFrom("single_song");
                        Fragment fragmentLJI = C724240Sb0.LJI(this);
                        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                        MusicModel musicModelConvertToMusicModel = music2.convertToMusicModel();
                        C15L7 c15l7 = new C15L7() { // from class: X.0mUs
                            @Override // X.C15L7
                            public final void LIZ() {
                            }

                            @Override // X.C15L7
                            public final void LIZJ() {
                            }

                            @Override // X.C15L7
                            public final void LIZLLL() {
                            }

                            @Override // X.C15L7
                            public final boolean LJ() {
                                return false;
                            }

                            @Override // X.C15L7
                            public final /* synthetic */ void LJFF(MusicModel musicModel, Effect effect) {
                            }

                            @Override // X.C15L7
                            public final void LJI() {
                            }
                        };
                        Video video = awemeLJIIIIZZ.getVideo();
                        if (video != null) {
                            videoLength = video.getVideoLength();
                        }
                        Boolean bool = Boolean.FALSE;
                        Boolean bool2 = Boolean.TRUE;
                        boolean zLIZ = C298270Bmb.LIZ();
                        String strLIZIZ = C1212100heC.LIZIZ(awemeLJIIIIZZ);
                        MusicTrendingHashtagInfo musicTrendingHashtagInfoMo = mo();
                        if (musicTrendingHashtagInfoMo != null && (hashtagName2 = musicTrendingHashtagInfoMo.getHashtagName()) != null) {
                            strLJJJJZ = a0.LJJJJZ("#", hashtagName2);
                        } else {
                            strLJJJJZ = null;
                        }
                        MusicTrendingHashtagInfo musicTrendingHashtagInfoMo2 = mo();
                        if (musicTrendingHashtagInfoMo2 != null) {
                            hashTagId = musicTrendingHashtagInfoMo2.getHashTagId();
                        } else {
                            hashTagId = null;
                        }
                        musicRecordService.startRecord(fragmentLJI, c19egLIZ2, musicModelConvertToMusicModel, null, "", "", c15l7, videoLength, z, null, 0, "trending_hashtag_card", "single_song", string, bool, "music_detail", bool2, bool, null, null, null, false, bool2, null, zLIZ, strLIZIZ, strLJJJJZ, hashTagId);
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        MusicTrendingHashtagInfo musicTrendingHashtagInfoMo3 = mo();
                        String str = "";
                        if (musicTrendingHashtagInfoMo3 == null || (hashTagId2 = musicTrendingHashtagInfoMo3.getHashTagId()) == null) {
                            hashTagId2 = "";
                        }
                        c2344009Gk.LJIIIIZZ("hashtag_id", hashTagId2);
                        MusicTrendingHashtagInfo musicTrendingHashtagInfoMo4 = mo();
                        if (musicTrendingHashtagInfoMo4 == null || (hashtagName = musicTrendingHashtagInfoMo4.getHashtagName()) == null) {
                            hashtagName = "";
                        }
                        c2344009Gk.LJIIIIZZ("hashtag_name", hashtagName);
                        IRecordMobService iRecordMobService = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, false, false, false, 14, null);
                        if (iRecordMobService != null) {
                            String groupId = awemeLJIIIIZZ.getGroupId();
                            if (groupId != null) {
                                str = groupId;
                            }
                            iRecordMobService.LIZLLL(new C1449410nox(string, "trending_hashtag_card", "music_detail", str, null, new C1449430noz(String.valueOf(music2.getId()), "single_song"), null, null, 208), c2344009Gk.LIZ);
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final void fo(View view) {
        if (view != null) {
            view.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(104)));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final View ko(ViewGroup viewGroup) {
        String hashtagName;
        int i;
        int iLongValue;
        long jLongValue;
        String hashTagId;
        String hashtagName2;
        Long hashtagViews;
        Long hashtagViews2;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bkt, viewGroup, false);
        TextView textView = (TextView) viewTd.findViewById(R.id.jh9);
        MusicTrendingHashtagInfo musicTrendingHashtagInfoMo = mo();
        String str = "";
        if (musicTrendingHashtagInfoMo == null || (hashtagName = musicTrendingHashtagInfoMo.getHashtagName()) == null) {
            hashtagName = "";
        }
        textView.setText(hashtagName);
        TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.yk6);
        MusicTrendingHashtagInfo musicTrendingHashtagInfoMo2 = mo();
        if (musicTrendingHashtagInfoMo2 != null && Intrinsics.LJFF(musicTrendingHashtagInfoMo2.isHotTrendingHashtag(), Boolean.TRUE)) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
        TextView textView2 = (TextView) viewTd.findViewById(R.id.view_count);
        Resources resources = viewGroup.getResources();
        MusicTrendingHashtagInfo musicTrendingHashtagInfoMo3 = mo();
        if (musicTrendingHashtagInfoMo3 != null && (hashtagViews2 = musicTrendingHashtagInfoMo3.getHashtagViews()) != null) {
            iLongValue = (int) hashtagViews2.longValue();
        } else {
            iLongValue = 0;
        }
        Object[] objArr = new Object[1];
        MusicTrendingHashtagInfo musicTrendingHashtagInfoMo4 = mo();
        if (musicTrendingHashtagInfoMo4 != null && (hashtagViews = musicTrendingHashtagInfoMo4.getHashtagViews()) != null) {
            jLongValue = hashtagViews.longValue();
        } else {
            jLongValue = 0;
        }
        objArr[0] = C1843500y4a.LIZIZ(jLongValue);
        textView2.setText(resources.getQuantityString(2131755424, iLongValue, objArr));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("shoot_way", "trending_hashtag_card");
        c2344009Gk.LJIIIIZZ("enter_from", "trending_hashtag_video_page");
        MusicTrendingHashtagInfo musicTrendingHashtagInfoMo5 = mo();
        if (musicTrendingHashtagInfoMo5 == null || (hashTagId = musicTrendingHashtagInfoMo5.getHashTagId()) == null) {
            hashTagId = "";
        }
        c2344009Gk.LJIIIIZZ("hashtag_id", hashTagId);
        MusicTrendingHashtagInfo musicTrendingHashtagInfoMo6 = mo();
        if (musicTrendingHashtagInfoMo6 != null && (hashtagName2 = musicTrendingHashtagInfoMo6.getHashtagName()) != null) {
            str = hashtagName2;
        }
        c2344009Gk.LJIIIIZZ("hashtag_name", str);
        C20684815ws.LJIILLIIL("shoot_show", c2344009Gk.LIZ);
        return viewTd;
    }
}
