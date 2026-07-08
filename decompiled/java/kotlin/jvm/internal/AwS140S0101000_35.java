package kotlin.jvm.internal;

import X.C09AY;
import X.C1644450stX;
import X.C1662100tM0;
import X.C1DW6;
import X.C1DYK;
import X.C1DYM;
import X.C1DYP;
import X.C1DYQ;
import X.C2254871DNl;
import X.C2254881DNm;
import X.C2254891DNn;
import X.C2272931Dxr;
import X.C869590Y9l;
import X.InterfaceC2238351CjB;
import android.animation.LayoutTransition;
import android.view.SurfaceView;
import android.view.View;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarState;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes36.dex */
public class AwS140S0101000_35 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS140S0101000_35 awS140S0101000_35, Object obj) throws Exception {
        InterfaceC2238351CjB interfaceC2238351CjB = (InterfaceC2238351CjB) obj;
        int i = awS140S0101000_35.i1;
        SurfaceView surfaceView = (SurfaceView) awS140S0101000_35.l0;
        if (surfaceView != null) {
            return new C2254891DNn(surfaceView);
        }
        if (i == 0) {
            return new C2254881DNm(interfaceC2238351CjB);
        }
        if (i == 1) {
            return new C2254871DNl(interfaceC2238351CjB);
        }
        throw new Exception("viewType no exist.");
    }

    public static final Object invoke$1(AwS140S0101000_35 awS140S0101000_35, Object obj) {
        EditToolbarState editToolbarState = (EditToolbarState) obj;
        return editToolbarState.copy(editToolbarState.ui, editToolbarState.backVisible, editToolbarState.backTipVisible, editToolbarState.backTipText, editToolbarState.hideMoreEvent, editToolbarState.chooseMusicText, editToolbarState.chooseMusicIcon, editToolbarState.topMargin, editToolbarState.bottomHeight, editToolbarState.refresh, editToolbarState.iconAnimation, editToolbarState.iconLottieAnimation, editToolbarState.autoEnhanceStatus, editToolbarState.marginValue, editToolbarState.chooseMusicIconRes, editToolbarState.aiLiveState, editToolbarState.actionWithItemPositionEvent, editToolbarState.aiCaptionOn, editToolbarState.soundSyncOn, editToolbarState.livePhotoPreviewMode, new C1644450stX<>(new Pair(Integer.valueOf(awS140S0101000_35.i1), (LayoutTransition) awS140S0101000_35.l0)), editToolbarState.showPromote, editToolbarState.hidePromote, editToolbarState.iconRes, editToolbarState.iconColor);
    }

    public static final Object invoke$2(AwS140S0101000_35 awS140S0101000_35, Object obj) {
        EditToolbarState editToolbarState = (EditToolbarState) obj;
        return editToolbarState.copy(editToolbarState.ui, editToolbarState.backVisible, editToolbarState.backTipVisible, editToolbarState.backTipText, editToolbarState.hideMoreEvent, editToolbarState.chooseMusicText, editToolbarState.chooseMusicIcon, editToolbarState.topMargin, editToolbarState.bottomHeight, editToolbarState.refresh, editToolbarState.iconAnimation, editToolbarState.iconLottieAnimation, editToolbarState.autoEnhanceStatus, editToolbarState.marginValue, editToolbarState.chooseMusicIconRes, editToolbarState.aiLiveState, new C1644450stX<>(new Pair(Integer.valueOf(awS140S0101000_35.i1), (Function2) awS140S0101000_35.l0)), editToolbarState.aiCaptionOn, editToolbarState.soundSyncOn, editToolbarState.livePhotoPreviewMode, editToolbarState.makeItemVisibleOnCollapsed, editToolbarState.showPromote, editToolbarState.hidePromote, editToolbarState.iconRes, editToolbarState.iconColor);
    }

    public static final Object invoke$3(AwS140S0101000_35 awS140S0101000_35, Object obj) {
        EditToolbarState editToolbarState = (EditToolbarState) obj;
        return editToolbarState.copy(editToolbarState.ui, editToolbarState.backVisible, editToolbarState.backTipVisible, editToolbarState.backTipText, editToolbarState.hideMoreEvent, editToolbarState.chooseMusicText, editToolbarState.chooseMusicIcon, editToolbarState.topMargin, editToolbarState.bottomHeight, editToolbarState.refresh, new C1644450stX<>(new Pair(Integer.valueOf(awS140S0101000_35.i1), (Function1) awS140S0101000_35.l0)), editToolbarState.iconLottieAnimation, editToolbarState.autoEnhanceStatus, editToolbarState.marginValue, editToolbarState.chooseMusicIconRes, editToolbarState.aiLiveState, editToolbarState.actionWithItemPositionEvent, editToolbarState.aiCaptionOn, editToolbarState.soundSyncOn, editToolbarState.livePhotoPreviewMode, editToolbarState.makeItemVisibleOnCollapsed, editToolbarState.showPromote, editToolbarState.hidePromote, editToolbarState.iconRes, editToolbarState.iconColor);
    }

    public static final Object invoke$4(AwS140S0101000_35 awS140S0101000_35, Object obj) {
        EditToolbarState editToolbarState = (EditToolbarState) obj;
        return editToolbarState.copy(editToolbarState.ui, editToolbarState.backVisible, editToolbarState.backTipVisible, editToolbarState.backTipText, editToolbarState.hideMoreEvent, editToolbarState.chooseMusicText, editToolbarState.chooseMusicIcon, editToolbarState.topMargin, editToolbarState.bottomHeight, editToolbarState.refresh, editToolbarState.iconAnimation, editToolbarState.iconLottieAnimation, editToolbarState.autoEnhanceStatus, editToolbarState.marginValue, editToolbarState.chooseMusicIconRes, editToolbarState.aiLiveState, editToolbarState.actionWithItemPositionEvent, editToolbarState.aiCaptionOn, editToolbarState.soundSyncOn, editToolbarState.livePhotoPreviewMode, editToolbarState.makeItemVisibleOnCollapsed, new C1644450stX<>(new Pair(Integer.valueOf(awS140S0101000_35.i1), (C1662100tM0) awS140S0101000_35.l0)), editToolbarState.hidePromote, editToolbarState.iconRes, editToolbarState.iconColor);
    }

    public static final Object invoke$5(AwS140S0101000_35 awS140S0101000_35, Object obj) {
        boolean z;
        float fFloatValue = ((Number) obj).floatValue();
        C2272931Dxr c2272931Dxr = (C2272931Dxr) awS140S0101000_35.l0;
        if (Math.abs(fFloatValue) > awS140S0101000_35.i1) {
            z = true;
        } else {
            z = false;
        }
        c2272931Dxr.LLJIJIL = z;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS140S0101000_35 awS140S0101000_35, Object obj) {
        ((C1DW6) obj).Jk((C869590Y9l) awS140S0101000_35.l0, awS140S0101000_35.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS140S0101000_35 awS140S0101000_35, Object obj) {
        ((C1DYP) obj).setProgress(awS140S0101000_35.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS140S0101000_35 awS140S0101000_35, Object obj) {
        ((C1DYQ) obj).setVisibility(awS140S0101000_35.i1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S0101000_35(int i, C1662100tM0 c1662100tM0, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1662100tM0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S0101000_35(int i, LayoutTransition layoutTransition, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = layoutTransition;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS140S0101000_35(int i, int i2, Function1<? super View, Unit> function1) {
        super(1);
        this.$t = function1;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS140S0101000_35(int i, int i2, Function2<? super Integer, ? super Integer, Unit> function2) {
        super(1);
        this.$t = function2;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S0101000_35(C869590Y9l c869590Y9l, int i, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c869590Y9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S0101000_35(C1DYK c1dyk, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1dyk;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S0101000_35(C1DYM c1dym, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1dym;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S0101000_35(C2272931Dxr c2272931Dxr, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c2272931Dxr;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S0101000_35(SurfaceView surfaceView, int i, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = surfaceView;
    }
}
