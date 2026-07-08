package jg5;

import X.AbstractC20611515l3;
import X.C0CSH;
import X.C12WG;
import X.C1453870nw9;
import X.C1454870nxl;
import X.C1455250nyN;
import X.C1455260nyO;
import X.C1633850scR;
import X.C1645380sv2;
import X.C1659630tI1;
import X.C1659640tI2;
import X.C1659650tI3;
import X.C1686850tzv;
import X.C19GS;
import X.C1DRG;
import X.C523230KfZ;
import X.C523580Kg8;
import X.C526910KlV;
import X.C531210KsR;
import X.C536350L1t;
import X.C553830Lnp;
import X.C564140MAq;
import X.C574930Mgl;
import X.C786410Ut5;
import X.InterfaceC1408530ml1;
import X.InterfaceC551280Lji;
import X.InterfaceC551310Ljl;
import X.InterfaceC572290McV;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene;
import com.ss.android.ugc.aweme.aiuikit.api.pages.creation.AICreationScene;
import com.ss.android.ugc.aweme.aiuikit.api.pages.loading.AIGCLoadingScene;
import com.ss.android.ugc.aweme.comment.image.CommentImageEditRootScene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.portrait.generate.scene.AIPortraitGenerationRootScene;
import com.ss.android.ugc.aweme.portrait.model.OpenGenerationPageParams;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumBottomActionBarConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumEventTrackingConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumMediaConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionConfig;
import com.ss.android.ugc.aweme.shortvideo.album.internal.AlbumOpenApiSessionData;
import com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.BaseMaterialSelectScene;
import com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoLightRecordContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.social.creation.mediapicker.SocialCreationMediaPickerScene;
import com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerPageScene;
import com.ss.android.ugc.aweme.social.creation.record.SocialRecordScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.texttoimage.TextToImageEditScene;
import com.ss.android.ugc.aweme.texttoimage.choose.TextToImageChooseScene;
import com.ss.android.ugc.aweme.theater.creation.generation.scene.AITheaterGenerationRootScene;
import com.ss.android.ugc.aweme.theater.creation.scene.AITheaterCreationRootScene;
import com.ss.android.ugc.gamora.editor.ailive.newprompt.AILivePromptDependencyRootScene;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.CreationOnThisDayPreviewScene;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.CelebrationVideoTemplatePreviewScene;
import com.ss.android.ugc.tools.chat.room.scene.AiChatRoomRootScene;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import defpackage.g6;
import g3a.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public class AvS540S0100000_8 extends AbstractC20611515l3 {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC20611515l3
    public final Object LIZIZ(C1DRG c1drg) {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this, c1drg);
            case 1:
                return LIZIZ$1(this, c1drg);
            case 2:
                return LIZIZ$2(this, c1drg);
            case 3:
                return LIZIZ$3(this, c1drg);
            case 4:
                return LIZIZ$4(this, c1drg);
            case 5:
                return LIZIZ$5(this, c1drg);
            case 6:
                return LIZIZ$6(this, c1drg);
            case 7:
                return LIZIZ$7(this, c1drg);
            case 8:
                return LIZIZ$8(this, c1drg);
            case BdTuring.TYPE_ECAF /* 9 */:
                return LIZIZ$9(this, c1drg);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return LIZIZ$10(this, c1drg);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return LIZIZ$11(this, c1drg);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return LIZIZ$12(this, c1drg);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return LIZIZ$13(this, c1drg);
            case 14:
                return LIZIZ$14(this, c1drg);
            case 15:
                return LIZIZ$15(this, c1drg);
            case 16:
                return LIZIZ$16(this, c1drg);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return LIZIZ$17(this, c1drg);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return LIZIZ$18(this, c1drg);
            case 19:
                return LIZIZ$19(this, c1drg);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return LIZIZ$20(this, c1drg);
            case 21:
                return LIZIZ$21(this, c1drg);
            case 22:
                return LIZIZ$22(this, c1drg);
            case 23:
                return LIZIZ$23(this, c1drg);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return LIZIZ$24(this, c1drg);
            case 25:
                return LIZIZ$25(this, c1drg);
            case 26:
                return LIZIZ$26(this, c1drg);
            case 27:
                return LIZIZ$27(this, c1drg);
            case 28:
                return LIZIZ$28(this, c1drg);
            case 29:
                return LIZIZ$29(this, c1drg);
            case 30:
                return LIZIZ$30(this, c1drg);
            case 31:
                return LIZIZ$31(this, c1drg);
            case 32:
                return LIZIZ$32(this, c1drg);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return LIZIZ$33(this, c1drg);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return LIZIZ$34(this, c1drg);
            case 35:
                return LIZIZ$35(this, c1drg);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return LIZIZ$36(this, c1drg);
            case 37:
                return LIZIZ$37(this, c1drg);
            case 38:
                return LIZIZ$38(this, c1drg);
            case 39:
                return LIZIZ$39(this, c1drg);
            case 40:
                return LIZIZ$40(this, c1drg);
            case 41:
                return LIZIZ$41(this, c1drg);
            case 42:
                return LIZIZ$42(this, c1drg);
            case 43:
                return LIZIZ$43(this, c1drg);
            case 44:
                return LIZIZ$44(this, c1drg);
            case 45:
                return LIZIZ$45(this, c1drg);
            case 46:
                return LIZIZ$46(this, c1drg);
            case 47:
                return LIZIZ$47(this, c1drg);
            case 48:
                return LIZIZ$48(this, c1drg);
            case 49:
                return LIZIZ$49(this, c1drg);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return LIZIZ$50(this, c1drg);
            case 51:
                return LIZIZ$51(this, c1drg);
            case 52:
                return LIZIZ$52(this, c1drg);
            case 53:
                return LIZIZ$53(this, c1drg);
            case 54:
                return LIZIZ$54(this, c1drg);
            case 55:
                return LIZIZ$55(this, c1drg);
            case 56:
                return LIZIZ$56(this, c1drg);
            case 57:
                return LIZIZ$57(this, c1drg);
            case 58:
                return LIZIZ$58(this, c1drg);
            case 59:
                return LIZIZ$59(this, c1drg);
            case 60:
                return LIZIZ$60(this, c1drg);
            case 61:
                return LIZIZ$61(this, c1drg);
            case BaseNotice.CREATOR /* 62 */:
                return LIZIZ$62(this, c1drg);
            case 63:
                return LIZIZ$63(this, c1drg);
            case 64:
                return LIZIZ$64(this, c1drg);
            case 65:
                return LIZIZ$65(this, c1drg);
            case 66:
                return LIZIZ$66(this, c1drg);
            case 67:
                return LIZIZ$67(this, c1drg);
            case 68:
                return LIZIZ$68(this, c1drg);
            case 69:
                return LIZIZ$69(this, c1drg);
            case 70:
                return LIZIZ$70(this, c1drg);
            case 71:
                return LIZIZ$71(this, c1drg);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return LIZIZ$72(this, c1drg);
            case 73:
                return LIZIZ$73(this, c1drg);
            case 74:
                return LIZIZ$74(this, c1drg);
            case 75:
                return LIZIZ$75(this, c1drg);
            case 76:
                return LIZIZ$76(this, c1drg);
            case 77:
                return LIZIZ$77(this, c1drg);
            case 78:
                return LIZIZ$78(this, c1drg);
            case 79:
                return LIZIZ$79(this, c1drg);
            case 80:
                return LIZIZ$80(this, c1drg);
            case 81:
                return LIZIZ$81(this, c1drg);
            case 82:
                return LIZIZ$82(this, c1drg);
            case 83:
                return LIZIZ$83(this, c1drg);
            case 84:
                return LIZIZ$84(this, c1drg);
            case 85:
                return LIZIZ$85(this, c1drg);
            case 86:
                return LIZIZ$86(this, c1drg);
            case 87:
                return LIZIZ$87(this, c1drg);
            case 88:
                return LIZIZ$88(this, c1drg);
            case 89:
                return LIZIZ$89(this, c1drg);
            case 90:
                return LIZIZ$90(this, c1drg);
            case 91:
                return LIZIZ$91(this, c1drg);
            case 92:
                return LIZIZ$92(this, c1drg);
            case 93:
                return LIZIZ$93(this, c1drg);
            case 94:
                return LIZIZ$94(this, c1drg);
            case 95:
                return LIZIZ$95(this, c1drg);
            case 96:
                return LIZIZ$96(this, c1drg);
            case 97:
                return LIZIZ$97(this, c1drg);
            case 98:
                return LIZIZ$98(this, c1drg);
            case 99:
                return LIZIZ$99(this, c1drg);
            case 100:
                return LIZIZ$100(this, c1drg);
            case 101:
                return LIZIZ$101(this, c1drg);
            case 102:
                return LIZIZ$102(this, c1drg);
            case 103:
                return LIZIZ$103(this, c1drg);
            case 104:
                return LIZIZ$104(this, c1drg);
            case 105:
                return LIZIZ$105(this, c1drg);
            case 106:
                return LIZIZ$106(this, c1drg);
            case 107:
                return LIZIZ$107(this, c1drg);
            case 108:
                return LIZIZ$108(this, c1drg);
            case 109:
                return LIZIZ$109(this, c1drg);
            case 110:
                return LIZIZ$110(this, c1drg);
            case 111:
                return LIZIZ$111(this, c1drg);
            case 112:
                return LIZIZ$112(this, c1drg);
            case 113:
                return LIZIZ$113(this, c1drg);
            case 114:
                return LIZIZ$114(this, c1drg);
            case 115:
                return LIZIZ$115(this, c1drg);
            case 116:
                return LIZIZ$116(this, c1drg);
            case 117:
                return LIZIZ$117(this, c1drg);
            case 118:
                return LIZIZ$118(this, c1drg);
            case 119:
                return LIZIZ$119(this, c1drg);
            case 120:
                return LIZIZ$120(this, c1drg);
            case 121:
                return LIZIZ$121(this, c1drg);
            case 122:
                return LIZIZ$122(this, c1drg);
            case 123:
                return LIZIZ$123(this, c1drg);
            case 124:
                return LIZIZ$124(this, c1drg);
            case 125:
                return LIZIZ$125(this, c1drg);
            case 126:
                return LIZIZ$126(this, c1drg);
            case 127:
                return LIZIZ$127(this, c1drg);
            case 128:
                return LIZIZ$128(this, c1drg);
            case 129:
                return LIZIZ$129(this, c1drg);
            case 130:
                return LIZIZ$130(this, c1drg);
            case 131:
                return LIZIZ$131(this, c1drg);
            case 132:
                return LIZIZ$132(this, c1drg);
            case 133:
                return LIZIZ$133(this, c1drg);
            case 134:
                return LIZIZ$134(this, c1drg);
            case 135:
                return LIZIZ$135(this, c1drg);
            case 136:
                return LIZIZ$136(this, c1drg);
            case 137:
                return LIZIZ$137(this, c1drg);
            case 138:
                return LIZIZ$138(this, c1drg);
            case 139:
                return LIZIZ$139(this, c1drg);
            case 140:
                return LIZIZ$140(this, c1drg);
            case 141:
                return LIZIZ$141(this, c1drg);
            case 142:
                return LIZIZ$142(this, c1drg);
            case 143:
                return LIZIZ$143(this, c1drg);
            case 144:
                return LIZIZ$144(this, c1drg);
            case 145:
                return LIZIZ$145(this, c1drg);
            case 146:
                return LIZIZ$146(this, c1drg);
            case 147:
                return LIZIZ$147(this, c1drg);
            case 148:
                return LIZIZ$148(this, c1drg);
            case 149:
                return LIZIZ$149(this, c1drg);
            case 150:
                return LIZIZ$150(this, c1drg);
            case 151:
                return LIZIZ$151(this, c1drg);
            case 152:
                return LIZIZ$152(this, c1drg);
            case 153:
                return LIZIZ$153(this, c1drg);
            case 154:
                return LIZIZ$154(this, c1drg);
            case 155:
                return LIZIZ$155(this, c1drg);
            case 156:
                return LIZIZ$156(this, c1drg);
            case 157:
                return LIZIZ$157(this, c1drg);
            case 158:
                return LIZIZ$158(this, c1drg);
            case 159:
                return LIZIZ$159(this, c1drg);
            case 160:
                return LIZIZ$160(this, c1drg);
            case 161:
                return LIZIZ$161(this, c1drg);
            case 162:
                return LIZIZ$162(this, c1drg);
            case 163:
                return LIZIZ$163(this, c1drg);
            case 164:
                return LIZIZ$164(this, c1drg);
            case 165:
                return LIZIZ$165(this, c1drg);
            case 166:
                return LIZIZ$166(this, c1drg);
            case 167:
                return LIZIZ$167(this, c1drg);
            case 168:
                return LIZIZ$168(this, c1drg);
            case 169:
                return LIZIZ$169(this, c1drg);
            case 170:
                return LIZIZ$170(this, c1drg);
            case 171:
                return LIZIZ$171(this, c1drg);
            case 172:
                return LIZIZ$172(this, c1drg);
            case 173:
                return LIZIZ$173(this, c1drg);
            case 174:
                return LIZIZ$174(this, c1drg);
            case 175:
                return LIZIZ$175(this, c1drg);
            case 176:
                return LIZIZ$176(this, c1drg);
            case 177:
                return LIZIZ$177(this, c1drg);
            case 178:
                return LIZIZ$178(this, c1drg);
            case 179:
                return LIZIZ$179(this, c1drg);
            case 180:
                return LIZIZ$180(this, c1drg);
            case 181:
                return LIZIZ$181(this, c1drg);
            case 182:
                return LIZIZ$182(this, c1drg);
            case 183:
                return LIZIZ$183(this, c1drg);
            case 184:
                return LIZIZ$184(this, c1drg);
            case 185:
                return LIZIZ$185(this, c1drg);
            case 186:
                return LIZIZ$186(this, c1drg);
            case 187:
                return LIZIZ$187(this, c1drg);
            case 188:
                return LIZIZ$188(this, c1drg);
            default:
                return super.LIZIZ(c1drg);
        }
    }

    public AvS540S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object LIZIZ$0(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (C523230KfZ) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$1(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return C786410Ut5.L3(((AIGCBaseCameraScene) avS540S0100000_8.l0).requireActivity());
    }

    public static final Object LIZIZ$10(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((OnThisDayCardPreviewScene) avS540S0100000_8.l0).LLLIIIIL;
    }

    public static final Object LIZIZ$100(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (InterfaceC1408530ml1) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$101(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (C1453870nw9) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$102(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (VideoLightRecordContainerScene) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$103(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (C1453870nw9) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$104(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((VideoLightRecordContainerScene) avS540S0100000_8.l0).requireAppCompatActivity();
    }

    public static final Object LIZIZ$105(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (C564140MAq) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$106(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (a) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$107(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((VideoLightRecordContainerScene) avS540S0100000_8.l0).requireAppCompatActivity();
    }

    public static final Object LIZIZ$108(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((VideoLightRecordContainerScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$109(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((TextToImageEditScene) avS540S0100000_8.l0).LLJLL.getValue();
    }

    public static final Object LIZIZ$11(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (OnThisDayCardPreviewScene) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$110(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (TextToImageEditScene) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$111(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((TextToImageEditScene) avS540S0100000_8.l0).getEditModel();
    }

    public static final Object LIZIZ$112(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((TextToImageChooseScene) avS540S0100000_8.l0).LLLFF.getValue();
    }

    public static final Object LIZIZ$113(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((TextToImageChooseScene) avS540S0100000_8.l0).LLLIIII.getValue();
    }

    public static final Object LIZIZ$114(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (TextToImageChooseScene) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$115(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((TextToImageChooseScene) avS540S0100000_8.l0).getEditModel();
    }

    public static final Object LIZIZ$116(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((TextToImageChooseScene) avS540S0100000_8.l0).LLJJLIIIJLLLLLLLZ;
    }

    public static final Object LIZIZ$117(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((TextToImageChooseScene) avS540S0100000_8.l0).LLJL;
    }

    public static final Object LIZIZ$118(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        final TextToImageEditScene textToImageEditScene = (TextToImageEditScene) avS540S0100000_8.l0;
        return new InterfaceC572290McV() { // from class: X.0LIA
            @Override // X.InterfaceC572290McV
            public final void LIZIZ() {
                textToImageEditScene.LLJLIL = false;
            }

            @Override // X.InterfaceC572290McV
            public final boolean LIZ() {
                return textToImageEditScene.LLJLIL;
            }
        };
    }

    public static final Object LIZIZ$119(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        final TextToImageEditScene textToImageEditScene = (TextToImageEditScene) avS540S0100000_8.l0;
        return new C0CSH() { // from class: X.0LI9
            @Override // X.C0CSH
            public final Object LIZ(InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) throws Throwable {
                TextToImageEditScene textToImageEditScene2 = textToImageEditScene;
                C0LI6 c0li6 = new C0LI6(textToImageEditScene2, function1, null);
                textToImageEditScene2.getClass();
                C1DFH c1dfh = C0PEM.LIZ;
                Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C0LI7(textToImageEditScene2, c0li6, null));
                if (objLJI != C099R.LJFF()) {
                    objLJI = Unit.LIZ;
                }
                if (objLJI == C099R.LJFF()) {
                    return objLJI;
                }
                return Unit.LIZ;
            }
        };
    }

    public static final Object LIZIZ$12(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((OnThisDayCardPreviewScene) avS540S0100000_8.l0).requireAppCompatActivity();
    }

    public static final Object LIZIZ$120(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AITheaterGenerationRootScene) avS540S0100000_8.l0).LLLLZ();
    }

    public static final Object LIZIZ$121(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AITheaterGenerationRootScene) avS540S0100000_8.l0).getSceneContext();
    }

    public static final Object LIZIZ$122(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AITheaterCreationRootScene) avS540S0100000_8.l0).LLLLLLLLLL();
    }

    public static final Object LIZIZ$123(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AITheaterCreationRootScene) avS540S0100000_8.l0).LLL.getValue();
    }

    public static final Object LIZIZ$124(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AITheaterCreationRootScene) avS540S0100000_8.l0).LLLLLLL();
    }

    public static final Object LIZIZ$125(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AITheaterCreationRootScene) avS540S0100000_8.l0).getSceneContext();
    }

    public static final Object LIZIZ$126(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (C1455260nyO) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$127(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        VideoPublishEditModel videoPublishEditModel = ((C1455260nyO) avS540S0100000_8.l0).LLLFZ;
        if (videoPublishEditModel == null) {
            return null;
        }
        return videoPublishEditModel;
    }

    public static final Object LIZIZ$128(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((CreationOnThisDayPreviewScene) avS540S0100000_8.l0).LLLLIIL.getValue();
    }

    public static final Object LIZIZ$129(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((CreationOnThisDayPreviewScene) avS540S0100000_8.l0).LLLLIILL.getValue();
    }

    public static final Object LIZIZ$13(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((OnThisDayCardPreviewScene) avS540S0100000_8.l0).LLJJJJ;
    }

    public static final Object LIZIZ$130(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((CreationOnThisDayPreviewScene) avS540S0100000_8.l0).LLLLIILLL.getValue();
    }

    public static final Object LIZIZ$131(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return Integer.valueOf(((CelebrationVideoTemplatePreviewScene) avS540S0100000_8.l0).LLJJJJJIL);
    }

    public static final Object LIZIZ$132(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((CelebrationVideoTemplatePreviewScene) avS540S0100000_8.l0).LLJJJJLIIL;
    }

    public static final Object LIZIZ$133(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((CelebrationVideoTemplatePreviewScene) avS540S0100000_8.l0).LLJJJIL;
    }

    public static final Object LIZIZ$134(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((CelebrationVideoTemplatePreviewScene) avS540S0100000_8.l0).requireAppCompatActivity();
    }

    public static final Object LIZIZ$135(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (CelebrationVideoTemplatePreviewScene) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$136(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((CelebrationVideoTemplatePreviewScene) avS540S0100000_8.l0).LLJJJJ;
    }

    public static final Object LIZIZ$137(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((CelebrationVideoTemplatePreviewScene) avS540S0100000_8.l0).LLJL;
    }

    public static final Object LIZIZ$138(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((CelebrationVideoTemplatePreviewScene) avS540S0100000_8.l0).LLJLILLLLZIIL.getValue();
    }

    public static final Object LIZIZ$139(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((SocialCreationMediaPickerScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$14(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((OnThisDayCardPreviewScene) avS540S0100000_8.l0).LLLIIIL;
    }

    public static final Object LIZIZ$140(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (SocialCreationMediaPickerScene) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$141(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((C536350L1t) avS540S0100000_8.l0).LJFF.getValue();
    }

    public static final Object LIZIZ$142(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((SocialMediaPickerPageScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$143(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (SocialMediaPickerPageScene) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$144(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((C536350L1t) avS540S0100000_8.l0).LJFF.getValue();
    }

    public static final Object LIZIZ$145(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AILivePromptDependencyRootScene) avS540S0100000_8.l0).LLJLIL;
    }

    public static final Object LIZIZ$146(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AILivePromptDependencyRootScene) avS540S0100000_8.l0).LLJLILLLLZIIL;
    }

    public static final Object LIZIZ$147(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AILivePromptDependencyRootScene) avS540S0100000_8.l0).getSceneContext();
    }

    public static final Object LIZIZ$148(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (AILivePromptDependencyRootScene) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$149(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (Activity) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$15(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((OnThisDayCardPreviewScene) avS540S0100000_8.l0).LLLIIII;
    }

    public static final Object LIZIZ$150(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((CommentImageEditRootScene) avS540S0100000_8.l0).requireFragmentActivity();
    }

    public static final Object LIZIZ$151(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((CommentImageEditRootScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$152(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((CommentImageEditRootScene) avS540S0100000_8.l0).requireSceneContext();
    }

    public static final Object LIZIZ$153(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((CommentImageEditRootScene) avS540S0100000_8.l0).LLJLLIL;
    }

    public static final Object LIZIZ$154(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (CreativeModel) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$155(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (ImageEditRootScene) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$156(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        ImageAlbumData imageAlbumData = ((ImageEditRootScene) avS540S0100000_8.l0).LLJJL;
        if (imageAlbumData == null) {
            return null;
        }
        return imageAlbumData;
    }

    public static final Object LIZIZ$157(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        VideoPublishEditModel videoPublishEditModel = ((ImageEditRootScene) avS540S0100000_8.l0).LLJL;
        if (videoPublishEditModel == null) {
            return null;
        }
        return videoPublishEditModel;
    }

    public static final Object LIZIZ$158(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        C1454870nxl c1454870nxl = ((ImageEditRootScene) avS540S0100000_8.l0).LLJJLIIIJLLLLLLLZ;
        if (c1454870nxl == null) {
            return null;
        }
        return c1454870nxl;
    }

    public static final Object LIZIZ$159(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (C19GS) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$16(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((Function1) avS540S0100000_8.l0).invoke(c1drg);
    }

    public static final Object LIZIZ$160(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (C19GS) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$161(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (C19GS) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$162(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((C1455250nyN) avS540S0100000_8.l0).getEditModel();
    }

    public static final Object LIZIZ$163(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return C1633850scR.LIZ(((C1455250nyN) avS540S0100000_8.l0).requireActivity(), null);
    }

    public static final Object LIZIZ$164(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AIGCBaseScene) avS540S0100000_8.l0).requireFragmentActivity();
    }

    public static final Object LIZIZ$165(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AIGCBaseScene) avS540S0100000_8.l0).LLJJJJ.getValue();
    }

    public static final Object LIZIZ$166(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AICreationScene) avS540S0100000_8.l0).LLJL;
    }

    public static final Object LIZIZ$167(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AICreationScene) avS540S0100000_8.l0).LLJZ.getValue();
    }

    public static final Object LIZIZ$168(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AiChatRoomRootScene) avS540S0100000_8.l0).requireFragmentActivity();
    }

    public static final Object LIZIZ$169(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AIGCLoadingScene) avS540S0100000_8.l0).LLJL;
    }

    public static final Object LIZIZ$17(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((Function1) avS540S0100000_8.l0).invoke(c1drg);
    }

    public static final Object LIZIZ$170(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AIGCLoadingScene) avS540S0100000_8.l0).LLJLILLLLZIIL.getValue();
    }

    public static final Object LIZIZ$171(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (Activity) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$172(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((C526910KlV) avS540S0100000_8.l0).LLLJIL;
    }

    public static final Object LIZIZ$173(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((CreativeToolContainerScene) avS540S0100000_8.l0).LLJLLL.getValue();
    }

    public static final Object LIZIZ$174(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return new C531210KsR((FrameLayout) ((CreativeToolContainerScene) avS540S0100000_8.l0).requireViewById(R.id.tya));
    }

    public static final Object LIZIZ$175(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((SAAActivity) avS540S0100000_8.l0).LLJIJIL.getValue();
    }

    public static final Object LIZIZ$176(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return C1659650tI3.LIZ((FTCVideoRecordNewActivity) avS540S0100000_8.l0);
    }

    public static final Object LIZIZ$177(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((BaseMaterialSelectScene) avS540S0100000_8.l0).LLJLIL;
    }

    public static final Object LIZIZ$178(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((BaseMaterialSelectScene) avS540S0100000_8.l0).LLJLILLLLZIIL;
    }

    public static final Object LIZIZ$179(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return C12WG.LJ((C1686850tzv) avS540S0100000_8.l0);
    }

    public static final Object LIZIZ$18(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        InterfaceC551280Lji interfaceC551280Lji = ((C553830Lnp) avS540S0100000_8.l0).LLJJIJI;
        if (interfaceC551280Lji != null) {
            return interfaceC551280Lji;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object LIZIZ$180(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((C1686850tzv) avS540S0100000_8.l0).LLLLIL();
    }

    public static final Object LIZIZ$181(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((SocialRecordScene) avS540S0100000_8.l0).requireAppCompatActivity();
    }

    public static final Object LIZIZ$182(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((SocialRecordScene) avS540S0100000_8.l0).requireAppCompatActivity();
    }

    public static final Object LIZIZ$183(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((SocialRecordScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$184(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((SocialRecordScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$185(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((SocialRecordScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$186(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return C1659630tI1.LJIIIIZZ((SocialRecordScene) avS540S0100000_8.l0, null, null, 6);
    }

    public static final Object LIZIZ$187(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return C786410Ut5.L3(((SocialRecordScene) avS540S0100000_8.l0).requireActivity());
    }

    public static final Object LIZIZ$188(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (VideoPublishEditModel) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$19(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        InterfaceC551310Ljl interfaceC551310Ljl = ((C553830Lnp) avS540S0100000_8.l0).LLJJIJIIJIL;
        if (interfaceC551310Ljl != null) {
            return interfaceC551310Ljl;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object LIZIZ$2(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AIGCBaseCameraScene) avS540S0100000_8.l0).requireAppCompatActivity();
    }

    public static final Object LIZIZ$20(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AIPortraitGenerationRootScene) avS540S0100000_8.l0).getSceneContext();
    }

    public static final Object LIZIZ$21(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        OpenGenerationPageParams openGenerationPageParams = ((AIPortraitGenerationRootScene) avS540S0100000_8.l0).LLLF;
        if (openGenerationPageParams != null) {
            return openGenerationPageParams.creativeModel;
        }
        return null;
    }

    public static final Object LIZIZ$22(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        OpenGenerationPageParams openGenerationPageParams = ((AIPortraitGenerationRootScene) avS540S0100000_8.l0).LLLF;
        if (openGenerationPageParams != null) {
            return openGenerationPageParams.creativeInfo;
        }
        return null;
    }

    public static final Object LIZIZ$23(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((VideoEditContainerScene) avS540S0100000_8.l0).LLJZIJLIL.getCreationId();
    }

    public static final Object LIZIZ$24(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return new C574930Mgl(c1drg, (VideoPublishEditModel) avS540S0100000_8.l0);
    }

    public static final Object LIZIZ$25(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (C19GS) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$26(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (C19GS) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$27(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (C19GS) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$28(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((VideoEditContainerScene) avS540S0100000_8.l0).LLJZIJLIL;
    }

    public static final Object LIZIZ$29(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (AVMusic) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$3(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AIGCBaseCameraScene) avS540S0100000_8.l0).requireAppCompatActivity();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[PHI: r0
      0x007d: PHI (r0v17 java.lang.String) = (r0v16 java.lang.String), (r0v25 java.lang.String) binds: [B:13:0x004f, B:24:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ$30(jg5.AvS540S0100000_8 r6, X.C1DRG r7) {
        /*
            android.app.Application r1 = X.C0CHQ.LIZ
            r0 = 123(0x7b, float:1.72E-43)
            kotlin.jvm.internal.AFwS261S0000000_22 r0 = kotlin.jvm.internal.AFwS261S0000000_22.get$arr$(r0)
            X.0sex r2 = X.C1633850scR.LIZ(r1, r0)
            r0 = 3
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene r0 = (com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene) r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.LLL
            java.lang.String r5 = r0.shootWay
            java.lang.String r4 = ""
            if (r5 != 0) goto L1c
            r5 = r4
        L1c:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "source_category"
            r1.<init>(r0, r5)
            r0 = 0
            r3[r0] = r1
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene r0 = (com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene) r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.LLL
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.creative.model.music.MusicObject r0 = r0.music
            if (r0 == 0) goto L3c
            java.lang.String r5 = com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.getMusicId(r0)
            if (r5 != 0) goto L3d
        L3c:
            r5 = r4
        L3d:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "music_id"
            r1.<init>(r0, r5)
            r0 = 1
            r3[r0] = r1
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene r1 = (com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene) r1
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r1.LLL
            java.lang.String r0 = r0.presetEffectId
            if (r0 != 0) goto L7d
            java.util.List<java.lang.String> r0 = r1.LLLIIIIL
            if (r0 == 0) goto L6e
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            if (r0 == 0) goto L6e
            r4 = r0
        L5c:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "sticker_id"
            r1.<init>(r0, r4)
            r0 = 2
            r3[r0] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r3)
            r2.yg(r0)
            return r2
        L6e:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene r0 = (com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene) r0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.LLLIIIL
            if (r0 == 0) goto L5c
            java.lang.String r0 = r0.getEffectId()
            if (r0 != 0) goto L7d
            goto L5c
        L7d:
            r4 = r0
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: jg5.AvS540S0100000_8.LIZIZ$30(jg5.AvS540S0100000_8, X.1DRG):java.lang.Object");
    }

    public static final Object LIZIZ$31(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((ExteriorVideoRecordScene) avS540S0100000_8.l0).requireAppCompatActivity();
    }

    public static final Object LIZIZ$32(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((ExteriorVideoRecordScene) avS540S0100000_8.l0).requireAppCompatActivity();
    }

    public static final Object LIZIZ$33(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((ExteriorVideoRecordScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$34(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((ExteriorVideoRecordScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$35(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((ExteriorVideoRecordScene) avS540S0100000_8.l0).LLL;
    }

    public static final Object LIZIZ$36(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((ExteriorVideoRecordScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$37(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (ExteriorVideoRecordScene) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$38(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return C1659630tI1.LJIIIIZZ((ExteriorVideoRecordScene) avS540S0100000_8.l0, null, null, 6);
    }

    public static final Object LIZIZ$39(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return C1659640tI2.LIZLLL((ExteriorVideoRecordScene) avS540S0100000_8.l0);
    }

    public static final Object LIZIZ$4(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AIGCBaseCameraScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$40(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return C786410Ut5.L3(((ExteriorVideoRecordScene) avS540S0100000_8.l0).requireActivity());
    }

    public static final Object LIZIZ$41(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (MvChoosePhotoScene) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$42(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        final Context context = (Context) avS540S0100000_8.l0;
        return new a(context) { // from class: X.0Kg1
            public final Context LLIZLLLIL;

            @Override // X.AbstractRunnableC21377818lM
            public final void LJII() {
                C122T.LIZ();
                C122T.LIZIZ();
                C0FI2.LJIJJ().LJJIL(this.LLIZLLLIL, Boolean.valueOf(!C298130BmN.LIZ()));
                LJIIJ();
            }

            {
                this.LLIZLLLIL = context;
                LJ(AFwS239S0000000_8.get$arr$(13));
            }
        };
    }

    public static final Object LIZIZ$43(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((MvChoosePhotoScene) avS540S0100000_8.l0).getUploadPhotoPreprocessManager();
    }

    public static final Object LIZIZ$44(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((MvChoosePhotoScene) avS540S0100000_8.l0).getLivePhotoPreProcessManager();
    }

    public static final Object LIZIZ$45(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((MvChoosePhotoScene) avS540S0100000_8.l0).livePhotoSyncManager;
    }

    public static final Object LIZIZ$46(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((MvChoosePhotoScene) avS540S0100000_8.l0).chooseMediaViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ$47(jg5.AvS540S0100000_8 r9, X.C1DRG r10) {
        /*
            X.0Kgo r3 = new X.0Kgo
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = (com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene) r0
            int r4 = r0.getChooseScene$tools_camera_record_release()
            X.097o r5 = new X.097o
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = (com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene) r0
            r5.<init>(r0)
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = (com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene) r0
            java.lang.String r6 = r0.editorTabToolType
            X.0Kiv r7 = new X.0Kiv
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = (com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene) r0
            r7.<init>(r0)
            X.0Kiw r8 = new X.0Kiw
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = (com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene) r0
            r8.<init>(r0)
            X.0Kgt r2 = X.InterfaceC523990Kgn.LIZ
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = (com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene) r0
            java.lang.String r1 = r0.bottomActionBarType
            r2.getClass()
            X.0Kgj r9 = X.C523950Kgj.LIZIZ
            r9.getClass()
            java.lang.String r0 = X.C523950Kgj.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L61
            X.0Kgs r9 = X.C524040Kgs.LIZIZ
            r9.getClass()
            java.lang.String r0 = X.C524040Kgs.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L61
            if (r1 == 0) goto L65
            X.0Kgk r0 = X.C523960Kgk.LIZIZ
            r0.getClass()
            java.lang.String r0 = X.C523960Kgk.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L65
            X.0Kgw r9 = X.C524080Kgw.LIZIZ
        L61:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L65:
            X.0Kgk r9 = X.C523960Kgk.LIZIZ
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: jg5.AvS540S0100000_8.LIZIZ$47(jg5.AvS540S0100000_8, X.1DRG):java.lang.Object");
    }

    public static final Object LIZIZ$48(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((MvChoosePhotoScene) avS540S0100000_8.l0).getAiContentDataManager();
    }

    public static final Object LIZIZ$49(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (AlbumOpenApiSessionData) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$5(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AIGCBaseCameraScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$50(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (AlbumMediaConfig) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$51(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (AlbumSelectionConfig) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$52(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (AlbumBottomActionBarConfig) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$53(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (AlbumEventTrackingConfig) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$54(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (CreationAlbumPlatformService) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$55(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (ShortVideoContext) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$56(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((MvChoosePhotoScene) avS540S0100000_8.l0).getMediaModelFactory();
    }

    public static final Object LIZIZ$57(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((MvChoosePhotoScene) avS540S0100000_8.l0).getAiContentDataManager();
    }

    public static final Object LIZIZ$58(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) avS540S0100000_8.l0;
        return new g6(mvChoosePhotoScene.requireFragmentActivity(), mvChoosePhotoScene.anchorMvId, mvChoosePhotoScene.templateType);
    }

    public static final Object LIZIZ$59(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((MvChoosePhotoScene) avS540S0100000_8.l0).getMediaModelFactory();
    }

    public static final Object LIZIZ$6(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AIGCBaseCameraScene) avS540S0100000_8.l0).LLJJJ;
    }

    public static final Object LIZIZ$60(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        Bundle bundle = ((MvChoosePhotoScene) avS540S0100000_8.l0).mArguments;
        if (bundle == null) {
            return new Bundle();
        }
        return bundle;
    }

    public static final Object LIZIZ$61(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return new C523580Kg8("ChoosePreloadTemplateTask", new AwS587S0100000_8((MvChoosePhotoScene) avS540S0100000_8.l0, 195));
    }

    public static final Object LIZIZ$62(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((MvChoosePhotoScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$63(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((MvChoosePhotoScene) avS540S0100000_8.l0).requireFragmentActivity();
    }

    public static final Object LIZIZ$64(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((VideoLightRecordContainerScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$65(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((TikTokCameraBaseGroupScene) avS540S0100000_8.l0).requireAppCompatActivity();
    }

    public static final Object LIZIZ$66(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((ImagePublishPreviewScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$67(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (ShortVideoContext) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$68(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((ImagePublishPreviewScene) avS540S0100000_8.l0).LLJJL;
    }

    public static final Object LIZIZ$69(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((VideoLightRecordContainerScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$7(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((AIGCBaseCameraScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$70(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((TikTokCameraBaseGroupScene) avS540S0100000_8.l0).requireAppCompatActivity();
    }

    public static final Object LIZIZ$71(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((ImagePublishPreviewScene) avS540S0100000_8.l0).LLJJL.getImageAlbumData();
    }

    public static final Object LIZIZ$72(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return C1659630tI1.LJIIIIZZ((VideoLightRecordContainerScene) avS540S0100000_8.l0, null, null, 6);
    }

    public static final Object LIZIZ$73(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((ShortVideoContext) avS540S0100000_8.l0).creativeModel.recordEffectModel.gradeKey;
    }

    public static final Object LIZIZ$74(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((TikTokCameraBaseGroupScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$75(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return C1659640tI2.LIZLLL((VideoLightRecordContainerScene) avS540S0100000_8.l0);
    }

    public static final Object LIZIZ$76(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((TikTokCameraBaseGroupScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$77(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (InterfaceC1408530ml1) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$78(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (ShortVideoContext) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$79(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (InterfaceC1408530ml1) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$8(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return C786410Ut5.O3(((OnThisDayCardPreviewScene) avS540S0100000_8.l0).requireAppCompatActivity());
    }

    public static final Object LIZIZ$80(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((VideoPublishContainerScene) avS540S0100000_8.l0).requireContext();
    }

    public static final Object LIZIZ$81(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((TikTokCameraBaseGroupScene) avS540S0100000_8.l0).requireActivity();
    }

    public static final Object LIZIZ$82(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return C1659630tI1.LJIIIIZZ((TikTokCameraBaseGroupScene) avS540S0100000_8.l0, null, null, 6);
    }

    public static final Object LIZIZ$83(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((VideoPublishContainerScene) avS540S0100000_8.l0).requireFragmentActivity();
    }

    public static final Object LIZIZ$84(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return C1659640tI2.LIZLLL((TikTokCameraBaseGroupScene) avS540S0100000_8.l0);
    }

    public static final Object LIZIZ$85(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (InterfaceC1408530ml1) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$86(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (VideoPublishEditModel) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$87(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (InterfaceC1408530ml1) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$88(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (InterfaceC1408530ml1) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$89(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (InterfaceC1408530ml1) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$9(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((OnThisDayCardPreviewScene) avS540S0100000_8.l0).LLJJJIL;
    }

    public static final Object LIZIZ$90(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (InterfaceC1408530ml1) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$91(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (InterfaceC1408530ml1) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$92(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return C786410Ut5.L3(((TikTokCameraBaseGroupScene) avS540S0100000_8.l0).requireActivity());
    }

    public static final Object LIZIZ$93(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((ShortVideoContext) avS540S0100000_8.l0).getCreationId();
    }

    public static final Object LIZIZ$94(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (InterfaceC1408530ml1) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$95(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (Bundle) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$96(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (C1645380sv2) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$97(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return (InterfaceC1408530ml1) avS540S0100000_8.l0;
    }

    public static final Object LIZIZ$98(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return C786410Ut5.L3(((VideoLightRecordContainerScene) avS540S0100000_8.l0).requireActivity());
    }

    public static final Object LIZIZ$99(AvS540S0100000_8 avS540S0100000_8, C1DRG c1drg) {
        return ((ShortVideoContext) avS540S0100000_8.l0).getCreationId();
    }
}
