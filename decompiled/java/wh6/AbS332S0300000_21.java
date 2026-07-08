package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C116L;
import X.C1388190mED;
import X.C729510SjV;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.effect.StoryUseThisEffectComponent;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.ss.android.ugc.aweme.tools.detail.IStickerReuseSvcService;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes22.dex */
public class AbS332S0300000_21 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$0(wh6.AbS332S0300000_21 r18, android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS332S0300000_21.LIZ$0(wh6.AbS332S0300000_21, android.view.View):void");
    }

    public static final void LIZ$1(AbS332S0300000_21 abS332S0300000_21, View view) {
        Aweme aweme;
        boolean zDownloadEffectOrMusicAfterEnterCamera;
        IConfigService iConfigServiceConfigService;
        IAVSettingsService iAVSettingsServiceAvsettingsConfig;
        if (view != null) {
            StoryUseThisEffectComponent storyUseThisEffectComponent = (StoryUseThisEffectComponent) abS332S0300000_21.l0;
            VideoItemParams videoItemParams = (VideoItemParams) abS332S0300000_21.l1;
            AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) abS332S0300000_21.l2;
            Activity activityLIZ = null;
            if (videoItemParams != null) {
                storyUseThisEffectComponent.getClass();
                aweme = videoItemParams.getAweme();
            } else {
                aweme = null;
            }
            Context context = storyUseThisEffectComponent.getContext();
            if (context != null) {
                activityLIZ = C1388190mED.LIZ(context);
            }
            if (aweme != null && activityLIZ != null) {
                storyUseThisEffectComponent.Ep("story_try_out_click", "shoot");
                IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                int videoLength = 0;
                if (iExternalService != null && (iConfigServiceConfigService = iExternalService.configService()) != null && (iAVSettingsServiceAvsettingsConfig = iConfigServiceConfigService.avsettingsConfig()) != null) {
                    zDownloadEffectOrMusicAfterEnterCamera = iAVSettingsServiceAvsettingsConfig.downloadEffectOrMusicAfterEnterCamera();
                } else {
                    zDownloadEffectOrMusicAfterEnterCamera = false;
                }
                IPropReuseService iPropReuseService = (IPropReuseService) PluggableExtentionKt.pluggableSpi$default(IPropReuseService.class, false, false, false, 14, null);
                if (iPropReuseService != null) {
                    List<String> listSingletonList = Collections.singletonList(anchorCommonStruct.getId());
                    String string = UUID.randomUUID().toString();
                    IStickerReuseSvcService iStickerReuseSvcService = (IStickerReuseSvcService) PluggableExtentionKt.pluggableSpi$default(IStickerReuseSvcService.class, false, false, false, 14, null);
                    if (iStickerReuseSvcService != null) {
                        iStickerReuseSvcService.LIZ();
                    }
                    Music music = aweme.getMusic();
                    Video video = aweme.getVideo();
                    if (video != null) {
                        videoLength = video.getVideoLength();
                    }
                    iPropReuseService.LJFF(activityLIZ, listSingletonList, new C116L(string, "prop_page", music, false, "prop_auto", "story", "story_immersive_anchor", null, "story", null, null, false, null, Integer.valueOf(videoLength), null, null, null, false, videoItemParams.mEventType, "story", null, null, null, null, null, C729510SjV.LJJIJIL(aweme), "story_immersive_anchor", Integer.valueOf(aweme.getAwemeType()), aweme, null, 0, -1008222936), zDownloadEffectOrMusicAfterEnterCamera);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS332S0300000_21(StoryUseThisEffectComponent storyUseThisEffectComponent, VideoItemParams videoItemParams, AnchorCommonStruct anchorCommonStruct, int i) {
        super(300L);
        this.$t = i;
        this.l0 = storyUseThisEffectComponent;
        this.l1 = videoItemParams;
        this.l2 = anchorCommonStruct;
    }
}
