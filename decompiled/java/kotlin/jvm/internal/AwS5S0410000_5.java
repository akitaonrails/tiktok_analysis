package kotlin.jvm.internal;

import X.C09AY;
import X.C0FWP;
import X.C1402930mbz;
import X.C361680EFy;
import X.C363500EMy;
import X.C376610Epf;
import X.C378940EtQ;
import X.C378970EtT;
import X.EnumC378720Et4;
import X.InterfaceC1452170ntP;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.VEEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public class AwS5S0410000_5 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS5S0410000_5 awS5S0410000_5, Object obj) {
        InterfaceC1452170ntP value;
        if (((Boolean) obj).booleanValue() && (value = ((C0FWP) awS5S0410000_5.l0).LIZLLL.g().getValue()) != null) {
            TextStickerModel textStickerModel = (TextStickerModel) awS5S0410000_5.l1;
            boolean z = awS5S0410000_5.z4;
            TextStickerData textStickerData = (TextStickerData) awS5S0410000_5.l3;
            TTSModel ttsModel = textStickerModel.getTtsModel();
            if (ttsModel != null) {
                ttsModel.hasReadTextAudio = true;
                ttsModel.audioText = textStickerData.getAudioText();
                ttsModel.nleUuid = textStickerData.getNleUuid();
                ttsModel.audioTrackIndex = textStickerData.getAudioTrackIndex();
                ttsModel.audioTrackFilePath = textStickerData.getAudioTrackFilePath();
                ttsModel.audioTrackDuration = textStickerData.getAudioTrackDuration();
                ttsModel.speakerID = textStickerData.getSpeakerID();
                ttsModel.speakerName = textStickerData.getSpeakerName();
                ttsModel.voiceAnchorName = textStickerData.getVoiceAnchorName();
                ttsModel.voiceEffectId = textStickerData.getVoiceEffectId();
                ttsModel.audioPathList = textStickerData.getAudioPathList();
                ttsModel.ttsAnchorReleaseDate = textStickerData.getTtsAnchorReleaseDate();
                ttsModel.ttsHashTagIds = textStickerData.getTtsHashTagIds();
            }
            if (z) {
                value.nf((int) (textStickerModel.getBaseStickerModel().getStartTime() * LSPassThroughRecordSizeConfig.DEFAULT), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                value.play();
            }
        }
        ((C0FWP) awS5S0410000_5.l0).LJIILL((TextStickerModel) awS5S0410000_5.l1);
        Function1 function1 = (Function1) awS5S0410000_5.l2;
        if (function1 != null) {
            function1.invoke((TextStickerModel) awS5S0410000_5.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS5S0410000_5 r38, java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS5S0410000_5.invoke$1(kotlin.jvm.internal.AwS5S0410000_5, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS5S0410000_5 awS5S0410000_5, Object obj) {
        VideoPublishEditModel videoPublishEditModel;
        int iIntValue = ((Number) obj).intValue();
        C363500EMy c363500EMy = C363500EMy.LIZ;
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) awS5S0410000_5.l0;
        c363500EMy.getClass();
        if (!C363500EMy.LJIIIZ(videoPublishEditModel2) && (videoPublishEditModel = (VideoPublishEditModel) awS5S0410000_5.l0) != null && !videoPublishEditModel.creativeModel.draftInfoModel.isDraft && !videoPublishEditModel.isFromCrash()) {
            C376610Epf c376610Epf = (C376610Epf) awS5S0410000_5.l1;
            if (!c376610Epf.LJIIJ) {
                c376610Epf.LJIIJ = true;
                c376610Epf.LIZJ.LJIILLIIL("shoot_page_edit_tab", "editor_tab_exit_auto_save", (Function2) awS5S0410000_5.l2, awS5S0410000_5.z4);
            }
        } else {
            ((C376610Epf) awS5S0410000_5.l1).LJFF((Function0) awS5S0410000_5.l3, (Function2) awS5S0410000_5.l2);
            C361680EFy.LJJLIIIIJ((VideoPublishEditModel) awS5S0410000_5.l0, "save_draft");
            C1402930mbz.LJI((VideoPublishEditModel) awS5S0410000_5.l0, "editor_pro", C1402930mbz.LIZJ(iIntValue));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS5S0410000_5(C0FWP c0fwp, C0FWP c0fwp2, TextStickerModel textStickerModel, Function1<? super TextStickerModel, Unit> function1, boolean z, TextStickerData textStickerData) {
        super(1);
        this.$t = textStickerData;
        this.l0 = c0fwp;
        this.l1 = c0fwp2;
        this.l2 = textStickerModel;
        this.z4 = function1;
        this.l3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS5S0410000_5(VideoPublishEditModel videoPublishEditModel, VideoPublishEditModel videoPublishEditModel2, C376610Epf c376610Epf, Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = videoPublishEditModel;
        this.l1 = videoPublishEditModel2;
        this.l2 = c376610Epf;
        this.z4 = function2;
        this.l3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0410000_5(boolean z, EnumC378720Et4 enumC378720Et4, EnumC378720Et4 enumC378720Et42, C378970EtT c378970EtT, C378940EtQ c378940EtQ, int i) {
        super(1);
        this.$t = i;
        this.z4 = z;
        this.l0 = enumC378720Et4;
        this.l1 = enumC378720Et42;
        this.l2 = c378970EtT;
        this.l3 = c378940EtQ;
    }
}
