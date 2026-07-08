package kotlin.jvm.internal;

import X.C09AY;
import X.C19680811zK;
import android.media.MediaPlayer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeState;
import com.ss.android.ugc.aweme.tools.sticker.core.poll.PollStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesStickerModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS79S1000000_29 extends C09AY implements Function1 {
    public final int $t;
    public String s0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS79S1000000_29(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS79S1000000_29 awS79S1000000_29, Object obj) {
        FTCEditVolumeState fTCEditVolumeState = (FTCEditVolumeState) obj;
        return fTCEditVolumeState.copy(awS79S1000000_29.s0, fTCEditVolumeState.voiceTitle, fTCEditVolumeState.musicVolume, fTCEditVolumeState.ui);
    }

    public static final Object invoke$1(AwS79S1000000_29 awS79S1000000_29, Object obj) {
        FTCEditVolumeState fTCEditVolumeState = (FTCEditVolumeState) obj;
        return fTCEditVolumeState.copy(fTCEditVolumeState.musicTitle, awS79S1000000_29.s0, fTCEditVolumeState.musicVolume, fTCEditVolumeState.ui);
    }

    public static final Object invoke$2(AwS79S1000000_29 awS79S1000000_29, Object obj) {
        return C19680811zK.LIZ((C19680811zK) obj, awS79S1000000_29.s0, null, null, null, null, null, null, null, null, null, null, 2046);
    }

    public static final Object invoke$3(AwS79S1000000_29 awS79S1000000_29, Object obj) {
        return C19680811zK.LIZ((C19680811zK) obj, null, awS79S1000000_29.s0, null, null, null, null, null, null, null, null, null, 2045);
    }

    public static final Object invoke$4(AwS79S1000000_29 awS79S1000000_29, Object obj) {
        C19680811zK c19680811zK = (C19680811zK) obj;
        String str = awS79S1000000_29.s0;
        if (str == null) {
            str = "";
        }
        return C19680811zK.LIZ(c19680811zK, str, null, null, null, null, null, null, null, null, null, null, 2046);
    }

    public static final Object invoke$5(AwS79S1000000_29 awS79S1000000_29, Object obj) {
        SecretRepliesStickerModel secretRepliesStickerModel = (SecretRepliesStickerModel) obj;
        return secretRepliesStickerModel.copy(secretRepliesStickerModel.baseStickerModel, secretRepliesStickerModel.visible, awS79S1000000_29.s0, secretRepliesStickerModel.editable);
    }

    public static final Object invoke$6(AwS79S1000000_29 awS79S1000000_29, Object obj) {
        ProfileNaviCreatorState profileNaviCreatorState = (ProfileNaviCreatorState) obj;
        String str = awS79S1000000_29.s0;
        boolean z = profileNaviCreatorState.isDoneCreatingProfileImage;
        boolean z2 = profileNaviCreatorState.isBackPressed;
        boolean z3 = profileNaviCreatorState.isContinueEditing;
        boolean z4 = profileNaviCreatorState.shouldShowSetProfileView;
        profileNaviCreatorState.getClass();
        return profileNaviCreatorState.copy(str, z, z2, z3, z4, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS79S1000000_29 awS79S1000000_29, Object obj) {
        boolean z;
        try {
            ((MediaPlayer) obj).setDataSource(awS79S1000000_29.s0);
            z = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$8(AwS79S1000000_29 awS79S1000000_29, Object obj) {
        PollStickerModel pollStickerModel = (PollStickerModel) obj;
        return pollStickerModel.copy(pollStickerModel.baseStickerModel, pollStickerModel.visible, pollStickerModel.editable, pollStickerModel.clickable, pollStickerModel.question, awS79S1000000_29.s0, pollStickerModel.option2, pollStickerModel.pollStickerId);
    }

    public static final Object invoke$9(AwS79S1000000_29 awS79S1000000_29, Object obj) {
        PollStickerModel pollStickerModel = (PollStickerModel) obj;
        return pollStickerModel.copy(pollStickerModel.baseStickerModel, pollStickerModel.visible, pollStickerModel.editable, pollStickerModel.clickable, pollStickerModel.question, pollStickerModel.option1, awS79S1000000_29.s0, pollStickerModel.pollStickerId);
    }
}
