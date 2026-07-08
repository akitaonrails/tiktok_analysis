package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarState;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.hashtag.HashTagStickerModel;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS14S0000001_29 extends C09AY implements Function1 {
    public final int $t;
    public float f0;

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
    public AwS14S0000001_29(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AwS14S0000001_29 awS14S0000001_29, Object obj) {
        CutVideoBottomBarState cutVideoBottomBarState = (CutVideoBottomBarState) obj;
        return cutVideoBottomBarState.copy(Float.valueOf(awS14S0000001_29.f0), cutVideoBottomBarState.speedVisible, cutVideoBottomBarState.speedChecked, cutVideoBottomBarState.rotateVisible, cutVideoBottomBarState.deleteVisible, cutVideoBottomBarState.rotateEnable, cutVideoBottomBarState.speedEnable, cutVideoBottomBarState.deleteEnable);
    }

    public static final Object invoke$1(AwS14S0000001_29 awS14S0000001_29, Object obj) {
        EditAdjustClipsBottomViewState editAdjustClipsBottomViewState = (EditAdjustClipsBottomViewState) obj;
        return editAdjustClipsBottomViewState.copy(editAdjustClipsBottomViewState.currentEditIndex, editAdjustClipsBottomViewState.currentEditOriginIndex, editAdjustClipsBottomViewState.currentTabIndex, editAdjustClipsBottomViewState.stickPointStatus, editAdjustClipsBottomViewState.isMusicSyncMode, editAdjustClipsBottomViewState.scale, Float.valueOf(awS14S0000001_29.f0), editAdjustClipsBottomViewState.editState, editAdjustClipsBottomViewState.focusEditMode, editAdjustClipsBottomViewState.deleteVideoEvent, editAdjustClipsBottomViewState.updateVideoEvent, editAdjustClipsBottomViewState.restoreEditEvent, editAdjustClipsBottomViewState.addVideosEvent, editAdjustClipsBottomViewState.modeChangeEvent, editAdjustClipsBottomViewState.seekDoneEvent, editAdjustClipsBottomViewState.restoreMusicSyncEvent);
    }

    public static final Object invoke$2(AwS14S0000001_29 awS14S0000001_29, Object obj) {
        EditAdjustClipsBottomViewState editAdjustClipsBottomViewState = (EditAdjustClipsBottomViewState) obj;
        return editAdjustClipsBottomViewState.copy(editAdjustClipsBottomViewState.currentEditIndex, editAdjustClipsBottomViewState.currentEditOriginIndex, editAdjustClipsBottomViewState.currentTabIndex, editAdjustClipsBottomViewState.stickPointStatus, editAdjustClipsBottomViewState.isMusicSyncMode, Float.valueOf(awS14S0000001_29.f0), editAdjustClipsBottomViewState.selectTime, editAdjustClipsBottomViewState.editState, editAdjustClipsBottomViewState.focusEditMode, editAdjustClipsBottomViewState.deleteVideoEvent, editAdjustClipsBottomViewState.updateVideoEvent, editAdjustClipsBottomViewState.restoreEditEvent, editAdjustClipsBottomViewState.addVideosEvent, editAdjustClipsBottomViewState.modeChangeEvent, editAdjustClipsBottomViewState.seekDoneEvent, editAdjustClipsBottomViewState.restoreMusicSyncEvent);
    }

    public static final Object invoke$3(AwS14S0000001_29 awS14S0000001_29, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, awS14S0000001_29.f0, null, null, null, false, Integer.MAX_VALUE, 15, null);
    }

    public static final Object invoke$4(AwS14S0000001_29 awS14S0000001_29, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, awS14S0000001_29.f0, null, null, null, false, Integer.MAX_VALUE, 15, null);
    }

    public static final Object invoke$5(AwS14S0000001_29 awS14S0000001_29, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS14S0000001_29.f0, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, 2139095039, 15, null);
    }

    public static final Object invoke$6(AwS14S0000001_29 awS14S0000001_29, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, awS14S0000001_29.f0, null, null, null, false, Integer.MAX_VALUE, 15, null);
    }

    public static final Object invoke$7(AwS14S0000001_29 awS14S0000001_29, Object obj) {
        return BaseStickerModel.copy$default((BaseStickerModel) obj, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, awS14S0000001_29.f0, null, null, null, false, Integer.MAX_VALUE, 15, null);
    }

    public static final Object invoke$8(AwS14S0000001_29 awS14S0000001_29, Object obj) {
        CommentStickerModel commentStickerModel = (CommentStickerModel) obj;
        return commentStickerModel.copy(commentStickerModel.baseStickerModel, commentStickerModel.commentStickerModel, awS14S0000001_29.f0, commentStickerModel.visible, commentStickerModel.isCommentDeleted);
    }

    public static final Object invoke$9(AwS14S0000001_29 awS14S0000001_29, Object obj) {
        HashTagStickerModel hashTagStickerModel = (HashTagStickerModel) obj;
        return hashTagStickerModel.copy(BaseStickerModel.copy$default(hashTagStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, awS14S0000001_29.f0, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -4194305, 15, null), hashTagStickerModel.hashtagName, hashTagStickerModel.editable, hashTagStickerModel.visible, hashTagStickerModel.useCapsuleStyle);
    }
}
