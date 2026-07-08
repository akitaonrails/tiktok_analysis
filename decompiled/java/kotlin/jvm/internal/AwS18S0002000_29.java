package kotlin.jvm.internal;

import X.C09AY;
import X.C0FPW;
import X.C1644450stX;
import X.C21665619qg;
import com.bytedance.ies.cutsame.util.Size;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS18S0002000_29 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f963i0;
    public int i1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS18S0002000_29 awS18S0002000_29, Object obj) {
        EditAdjustClipsBottomViewState editAdjustClipsBottomViewState = (EditAdjustClipsBottomViewState) obj;
        return editAdjustClipsBottomViewState.copy(awS18S0002000_29.f963i0, awS18S0002000_29.i1, editAdjustClipsBottomViewState.currentTabIndex, editAdjustClipsBottomViewState.stickPointStatus, editAdjustClipsBottomViewState.isMusicSyncMode, editAdjustClipsBottomViewState.scale, editAdjustClipsBottomViewState.selectTime, editAdjustClipsBottomViewState.editState, editAdjustClipsBottomViewState.focusEditMode, editAdjustClipsBottomViewState.deleteVideoEvent, editAdjustClipsBottomViewState.updateVideoEvent, editAdjustClipsBottomViewState.restoreEditEvent, editAdjustClipsBottomViewState.addVideosEvent, editAdjustClipsBottomViewState.modeChangeEvent, editAdjustClipsBottomViewState.seekDoneEvent, editAdjustClipsBottomViewState.restoreMusicSyncEvent);
    }

    public static final Object invoke$1(AwS18S0002000_29 awS18S0002000_29, Object obj) {
        return C21665619qg.LIZ((C21665619qg) obj, null, null, new Size(awS18S0002000_29.f963i0, awS18S0002000_29.i1), null, null, null, 503);
    }

    public static final Object invoke$2(AwS18S0002000_29 awS18S0002000_29, Object obj) {
        ((C0FPW) obj).LJIILLIIL(awS18S0002000_29.f963i0, awS18S0002000_29.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS18S0002000_29 awS18S0002000_29, Object obj) {
        CutVideoPreviewState cutVideoPreviewState = (CutVideoPreviewState) obj;
        return cutVideoPreviewState.copy(cutVideoPreviewState.restartProgress, cutVideoPreviewState.surfaceEnable, new C1644450stX<>(new Pair(Integer.valueOf(awS18S0002000_29.f963i0), Integer.valueOf(awS18S0002000_29.i1))), cutVideoPreviewState.updateBottomMarginEvent, cutVideoPreviewState.updateVEDisplayEvent, cutVideoPreviewState.updateTopMarginEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S0002000_29(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f963i0 = i;
        this.i1 = i2;
    }
}
