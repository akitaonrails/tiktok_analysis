package kotlin.jvm.internal;

import X.C09AY;
import X.C1644450stX;
import X.C1780100wQK;
import X.C1DKV;
import android.view.SurfaceHolder;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarState;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VESize;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS20S0002000_35 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f969i0;
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
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS20S0002000_35 awS20S0002000_35, Object obj) {
        ((C1780100wQK) obj).LJIIJ(awS20S0002000_35.f969i0, awS20S0002000_35.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS20S0002000_35 awS20S0002000_35, Object obj) {
        EditToolbarState editToolbarState = (EditToolbarState) obj;
        return editToolbarState.copy(editToolbarState.ui, editToolbarState.backVisible, editToolbarState.backTipVisible, editToolbarState.backTipText, editToolbarState.hideMoreEvent, editToolbarState.chooseMusicText, editToolbarState.chooseMusicIcon, editToolbarState.topMargin, editToolbarState.bottomHeight, editToolbarState.refresh, editToolbarState.iconAnimation, editToolbarState.iconLottieAnimation, editToolbarState.autoEnhanceStatus, editToolbarState.marginValue, editToolbarState.chooseMusicIconRes, editToolbarState.aiLiveState, editToolbarState.actionWithItemPositionEvent, editToolbarState.aiCaptionOn, editToolbarState.soundSyncOn, editToolbarState.livePhotoPreviewMode, editToolbarState.makeItemVisibleOnCollapsed, editToolbarState.showPromote, editToolbarState.hidePromote, editToolbarState.iconRes, new C1644450stX<>(new Pair(Integer.valueOf(awS20S0002000_35.f969i0), Integer.valueOf(awS20S0002000_35.i1))));
    }

    public static final Object invoke$2(AwS20S0002000_35 awS20S0002000_35, Object obj) {
        EditToolbarState editToolbarState = (EditToolbarState) obj;
        return editToolbarState.copy(editToolbarState.ui, editToolbarState.backVisible, editToolbarState.backTipVisible, editToolbarState.backTipText, editToolbarState.hideMoreEvent, editToolbarState.chooseMusicText, editToolbarState.chooseMusicIcon, editToolbarState.topMargin, editToolbarState.bottomHeight, editToolbarState.refresh, editToolbarState.iconAnimation, editToolbarState.iconLottieAnimation, editToolbarState.autoEnhanceStatus, editToolbarState.marginValue, editToolbarState.chooseMusicIconRes, editToolbarState.aiLiveState, editToolbarState.actionWithItemPositionEvent, editToolbarState.aiCaptionOn, editToolbarState.soundSyncOn, editToolbarState.livePhotoPreviewMode, editToolbarState.makeItemVisibleOnCollapsed, editToolbarState.showPromote, editToolbarState.hidePromote, new C1644450stX<>(new Pair(Integer.valueOf(awS20S0002000_35.f969i0), Integer.valueOf(awS20S0002000_35.i1))), editToolbarState.iconColor);
    }

    public static final Object invoke$3(AwS20S0002000_35 awS20S0002000_35, Object obj) {
        final C1DKV c1dkv = (C1DKV) obj;
        final int i = awS20S0002000_35.f969i0;
        final int i2 = awS20S0002000_35.i1;
        return new C1DKV() { // from class: X.1DKW
            @Override // X.C1DKV
            public final boolean LIZ() {
                return c1dkv.LIZ();
            }

            @Override // X.C1DKV
            public final boolean LIZIZ() {
                return c1dkv.LIZIZ();
            }

            @Override // X.C1DKV
            public final boolean LIZJ() {
                return c1dkv.LIZJ();
            }

            @Override // X.C1DKV
            public final boolean LIZLLL() {
                return c1dkv.LIZLLL();
            }

            @Override // X.C1DKV
            public final boolean LJ() {
                return c1dkv.LJ();
            }

            @Override // X.C1DKV
            public final Function0<List<C2185991Agv>> LJFF() {
                return c1dkv.LJFF();
            }

            @Override // X.C1DKV
            public final boolean LJI() {
                return c1dkv.LJI();
            }

            @Override // X.C1DKV
            public final boolean LJII() {
                return c1dkv.LJII();
            }

            @Override // X.C1DKV
            public final int LJIIIIZZ() {
                return c1dkv.LJIIIIZZ();
            }

            @Override // X.C1DKV
            public final Function0<Boolean> LJIIIZ() {
                return c1dkv.LJIIIZ();
            }

            @Override // X.C1DKV
            public final C1DMJ LJIIJ() {
                return c1dkv.LJIIJ();
            }

            @Override // X.C1DKV
            public final boolean LJIIJJI() {
                return c1dkv.LJIIJJI();
            }

            @Override // X.C1DKV
            public final boolean LJIIL() {
                return c1dkv.LJIIL();
            }

            @Override // X.C1DKV
            public final boolean LJIILIIL() {
                return c1dkv.LJIILIIL();
            }

            @Override // X.C1DKV
            public final boolean LJIILJJIL() {
                return c1dkv.LJIILJJIL();
            }

            @Override // X.C1DKV
            public final boolean LJIILL() {
                return c1dkv.LJIILL();
            }

            @Override // X.C1DKV
            public final C1DKZ LJIILLIIL() {
                return c1dkv.LJIILLIIL();
            }

            @Override // X.C1DKV
            public final int LJIJ() {
                return c1dkv.LJIJ();
            }

            @Override // X.C1DKV
            public final boolean LJIJI() {
                return c1dkv.LJIJI();
            }

            @Override // X.C1DKV
            public final boolean LJIJJ() {
                return c1dkv.LJIJJ();
            }

            @Override // X.C1DKV
            public final boolean LJIJJLI() {
                return c1dkv.LJIJJLI();
            }

            @Override // X.C1DKV
            public final boolean LJIL() {
                return c1dkv.LJIL();
            }

            @Override // X.C1DKV
            public final boolean LJJ() {
                return c1dkv.LJJ();
            }

            @Override // X.C1DKV
            public final long LJJI() {
                return c1dkv.LJJI();
            }

            @Override // X.C1DKV
            public final boolean LJJIFFI() {
                return true;
            }

            @Override // X.C1DKV
            public final boolean LJJII() {
                return c1dkv.LJJII();
            }

            @Override // X.C1DKV
            public final InterfaceC2253801DJi LJJIII() {
                return c1dkv.LJJIII();
            }

            @Override // X.C1DKV
            public final Function0<Boolean> LJJIIJ() {
                return c1dkv.LJJIIJ();
            }

            @Override // X.C1DKV
            public final Pair<Integer, Integer> LJJIIJZLJL() {
                return c1dkv.LJJIIJZLJL();
            }

            @Override // X.C1DKV
            public final Function0<Boolean> LJJIIZ() {
                return c1dkv.LJJIIZ();
            }

            @Override // X.C1DKV
            public final boolean LJJIIZI() {
                return c1dkv.LJJIIZI();
            }

            @Override // X.C1DKV
            public final int getRotation() {
                return c1dkv.getRotation();
            }

            @Override // X.C1DKV
            public final SurfaceHolder getSurfaceHolder() {
                return c1dkv.getSurfaceHolder();
            }

            @Override // X.C1DKV
            public final InterfaceC2253521DIg LJIIZILJ() {
                final int i3 = i;
                final int i4 = i2;
                return new C1661490tL1() { // from class: X.1DKY
                    @Override // X.C1661490tL1, X.InterfaceC2253521DIg
                    public final int[] LJIIIIZZ() {
                        return new int[]{i3, i4};
                    }

                    @Override // X.C1661490tL1, X.InterfaceC2253521DIg
                    public final C1D3N LIZ() {
                        return C1D3N.AS_CAMERA_LENS_BACK;
                    }

                    @Override // X.C1661490tL1, X.InterfaceC2253521DIg
                    public final VEDisplaySettings LJIILIIL(VESize vESize) {
                        VEDisplaySettings.Builder builder = new VEDisplaySettings.Builder();
                        builder.setFitMode(EnumC1778840wOI.SCALE_MODE_FIT_FULL);
                        builder.setRenderSize(vESize);
                        return builder.build();
                    }
                };
            }
        };
    }

    public static final Object invoke$4(AwS20S0002000_35 awS20S0002000_35, Object obj) {
        ((C1780100wQK) obj).LJIIJ(awS20S0002000_35.f969i0, awS20S0002000_35.i1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S0002000_35(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f969i0 = i;
        this.i1 = i2;
    }
}
