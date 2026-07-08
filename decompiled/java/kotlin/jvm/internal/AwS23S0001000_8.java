package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAQ;
import X.C0LAW;
import X.C0MWU;
import X.C375830EoP;
import X.C525990Kk1;
import X.C526500Kkq;
import X.C529140Kp6;
import X.C530600KrS;
import X.C550090Lhn;
import X.C555130Lpv;
import X.C555520LqY;
import X.C559140LwO;
import X.C559320Lwg;
import X.C559530Lx1;
import X.C576280Miw;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class AwS23S0001000_8 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f974i0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S0001000_8(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f974i0 = i;
    }

    public static final Object invoke$0(AwS23S0001000_8 awS23S0001000_8, Object obj) {
        return C555130Lpv.LIZ((C555130Lpv) obj, null, null, null, 0, null, Integer.valueOf(awS23S0001000_8.f974i0), 255);
    }

    public static final Object invoke$1(AwS23S0001000_8 awS23S0001000_8, Object obj) {
        return C550090Lhn.LIZ((C550090Lhn) obj, awS23S0001000_8.f974i0, null, null, 14);
    }

    public static final Object invoke$10(AwS23S0001000_8 awS23S0001000_8, Object obj) {
        return C559320Lwg.LIZ((C559320Lwg) obj, null, null, null, new C375830EoP(Integer.valueOf(awS23S0001000_8.f974i0)), null, 47);
    }

    public static final Object invoke$11(AwS23S0001000_8 awS23S0001000_8, Object obj) {
        ((PromptPageMobParam) obj).draftSaveType = Integer.valueOf(awS23S0001000_8.f974i0);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS23S0001000_8 awS23S0001000_8, Object obj) {
        int i = awS23S0001000_8.f974i0;
        obj.getClass();
        return new C576280Miw(i);
    }

    public static final Object invoke$13(AwS23S0001000_8 awS23S0001000_8, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("album_type", "extend_panel");
        jSONObject.put("click_type", "click");
        jSONObject.put("position", awS23S0001000_8.f974i0 + 1);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS23S0001000_8 awS23S0001000_8, Object obj) {
        return C559530Lx1.LIZ((C559530Lx1) obj, awS23S0001000_8.f974i0, null, 254);
    }

    public static final Object invoke$15(AwS23S0001000_8 awS23S0001000_8, Object obj) {
        return C0LAQ.LIZ((C0LAQ) obj, null, new C0LAW(awS23S0001000_8.f974i0), null, 5);
    }

    public static final Object invoke$2(AwS23S0001000_8 awS23S0001000_8, Object obj) {
        return new C525990Kk1(awS23S0001000_8.f974i0, ((C525990Kk1) obj).LIZIZ);
    }

    public static final Object invoke$3(AwS23S0001000_8 awS23S0001000_8, Object obj) {
        return C526500Kkq.LIZ((C526500Kkq) obj, null, new C375830EoP(Integer.valueOf(awS23S0001000_8.f974i0)), null, null, 13);
    }

    public static final Object invoke$4(AwS23S0001000_8 awS23S0001000_8, Object obj) {
        return C559140LwO.LIZ((C559140LwO) obj, null, null, awS23S0001000_8.f974i0, null, null, 27);
    }

    public static final Object invoke$5(AwS23S0001000_8 awS23S0001000_8, Object obj) {
        String strLIZJ;
        C559140LwO c559140LwO = (C559140LwO) obj;
        int i = awS23S0001000_8.f974i0;
        if (i > 10) {
            strLIZJ = C555520LqY.LIZIZ(2131826930);
        } else {
            strLIZJ = C555520LqY.LIZJ(2131826929, Integer.valueOf(i));
        }
        return C559140LwO.LIZ(c559140LwO, null, null, 0, strLIZJ, null, 23);
    }

    public static final Object invoke$6(AwS23S0001000_8 awS23S0001000_8, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.mediaListState, chooseMediaState.selectMediaState, chooseMediaState.unSelectMediaState, chooseMediaState.updateSelectedMediaClipRange, chooseMediaState.previewMediaState, chooseMediaState.preMusicState, chooseMediaState.preChangeMusicState, chooseMediaState.lastPreMusicState, chooseMediaState.openingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState, chooseMediaState.hideShowChooseMediaPageState, chooseMediaState.albumAssetCount, chooseMediaState.allMediaList, chooseMediaState.photoMediaList, chooseMediaState.videoMediaList, chooseMediaState.glanceMediaList, chooseMediaState.livePhotoMediaList, chooseMediaState.aiContentMediaList, chooseMediaState.liveRecordingsMediaList, chooseMediaState.isChangeMusicDownloadSuccess, chooseMediaState.previewDockerState, chooseMediaState.previewDockerInitMediaList, chooseMediaState.previewSwapState, chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState, chooseMediaState.previewNextBtnMediaState, chooseMediaState.nextBtnWithDirectUseState, chooseMediaState.previewNextBtnClickState, chooseMediaState.previewNextBtnState, chooseMediaState.previewAutoCutBtnClickState, chooseMediaState.isClickUseEffectBtn, chooseMediaState.dockerHasShown, chooseMediaState.albumViewFullShow, chooseMediaState.recordPresetResourceState, chooseMediaState.albumToEditPageState, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.autoPickSelectedMedias, chooseMediaState.notifyRefreshLivePhotoState, chooseMediaState.goNextMediaState, chooseMediaState.recordPageExitState, chooseMediaState.previewAutoCutBtnState, chooseMediaState.previewEditProBtnState, new C529140Kp6(awS23S0001000_8.f974i0), chooseMediaState.showAiContentGuideView, chooseMediaState.showLiveRecordingsFloatingGuide, chooseMediaState.liveRecordingsCardShownInFirstScreen, chooseMediaState.onLoadAiContentMediaList, chooseMediaState.defaultSelectMediaList, chooseMediaState.onLoadLiveRecordingsMediaList, chooseMediaState.mobUnselectMediaFromCheckBox, chooseMediaState.notifyMobUnselectMediaFromX, chooseMediaState.mobReEnterUploadPage);
    }

    public static final Object invoke$7(AwS23S0001000_8 awS23S0001000_8, Object obj) {
        return C530600KrS.LIZ((C530600KrS) obj, null, null, null, new C375830EoP(Integer.valueOf(awS23S0001000_8.f974i0)), null, null, null, 247);
    }

    public static final Object invoke$8(AwS23S0001000_8 awS23S0001000_8, Object obj) {
        ((C0MWU) obj).LIZJ = awS23S0001000_8.f974i0;
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS23S0001000_8 awS23S0001000_8, Object obj) {
        return C559320Lwg.LIZ((C559320Lwg) obj, null, null, null, new C375830EoP(Integer.valueOf(awS23S0001000_8.f974i0)), null, 47);
    }
}
