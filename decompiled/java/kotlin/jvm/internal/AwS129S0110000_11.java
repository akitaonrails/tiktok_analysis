package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.C09AY;
import X.C0RF0;
import X.C0ROM;
import X.C0RPA;
import X.C0STE;
import X.C11NJ;
import X.C1558520qew;
import X.C1578630rBN;
import X.C19602911ml;
import X.C19EG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C631370Opb;
import X.C690870R8b;
import X.C692980RGe;
import X.C705930RmZ;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC1565950qqv;
import X.InterfaceC719640SKs;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoInteractStickerComponent;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS129S0110000_11 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS129S0110000_11 awS129S0110000_11) {
        ((SmartImagePhotoViewHolderV2) awS129S0110000_11.l0).LJJJI(awS129S0110000_11.z1);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS129S0110000_11 awS129S0110000_11) {
        if (awS129S0110000_11.z1 && C1578630rBN.LJIIIZ((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS129S0110000_11.l0))) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) ((InterfaceC1565950qqv) awS129S0110000_11.l0)), IFeedPanelPlatformAbility.class, null);
    }

    public static final Object invoke$2(AwS129S0110000_11 awS129S0110000_11) {
        if (awS129S0110000_11.z1) {
            PostModePageViewModel postModePageViewModel = (PostModePageViewModel) awS129S0110000_11.l0;
            if (postModePageViewModel.LLLLIL == null) {
                postModePageViewModel.LLLLIL = Long.valueOf(System.currentTimeMillis());
            }
        } else {
            PostModePageViewModel postModePageViewModel2 = (PostModePageViewModel) awS129S0110000_11.l0;
            Long l = postModePageViewModel2.LLLLIL;
            if (l != null) {
                postModePageViewModel2.LLLLILI += System.currentTimeMillis() - l.longValue();
            }
            postModePageViewModel2.LLLLIL = null;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS129S0110000_11 awS129S0110000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("【STORY】  initComponent, key = ");
        sbLIZ.append(((C0ROM) awS129S0110000_11.l0).LJI());
        sbLIZ.append(", active = ");
        sbLIZ.append(awS129S0110000_11.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS129S0110000_11 awS129S0110000_11) {
        try {
            InterfaceC719640SKs interfaceC719640SKsLJIIJJI = C724750Sbp.LJIIJJI((AbstractC738140SxQ) awS129S0110000_11.l0);
            C19EG activity = interfaceC719640SKsLJIIJJI.getActivity();
            if (activity != null) {
                return C0RPA.LIZ(activity).zQ2(interfaceC719640SKsLJIIJJI);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (awS129S0110000_11.z1) {
                return null;
            }
            throw th;
        }
    }

    public static final Object invoke$5(AwS129S0110000_11 awS129S0110000_11) {
        try {
            InterfaceC719640SKs interfaceC719640SKsLJIIJJI = C724750Sbp.LJIIJJI((AbstractC738140SxQ) awS129S0110000_11.l0);
            C19EG activity = interfaceC719640SKsLJIIJJI.getActivity();
            if (activity != null) {
                return Assembler.BQ2(C0RPA.LIZ(activity), interfaceC719640SKsLJIIJJI);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (awS129S0110000_11.z1) {
                return null;
            }
            throw th;
        }
    }

    public static final Object invoke$6(AwS129S0110000_11 awS129S0110000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("【STORY】  ");
        sbLIZ.append(((AbstractC738140SxQ) awS129S0110000_11.l0).getClass().getSimpleName());
        sbLIZ.append(", setActive = ");
        sbLIZ.append(awS129S0110000_11.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS129S0110000_11 r11) {
        /*
            boolean r0 = r11.z1
            r2 = 0
            if (r0 == 0) goto L9a
            java.lang.Object r6 = r11.l0
            X.0STE r6 = (X.C0STE) r6
            X.0SLe r1 = r6.LLJL
            X.0SLe r0 = X.EnumC719760SLe.ZOOM_FIX
            r3 = 1
            if (r1 != r0) goto L9a
            android.view.ViewGroup r0 = r6.LLILLJJLI
            int r4 = r0.getWidth()
            if (r4 <= 0) goto L9a
            android.view.View r0 = r6.LL
            android.graphics.RectF r0 = r6.LJIILLIIL(r0)
            if (r0 == 0) goto L9a
            float r1 = r0.width()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L9a
            float r5 = (float) r4
            float r5 = r5 / r1
            android.view.View r0 = r6.LL
            float r4 = r0.getScaleX()
            r0 = 981668463(0x3a83126f, float:0.001)
            float r0 = r5 - r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9a
            android.view.View r0 = r6.LL
            float r7 = r0.getTranslationX()
            android.view.View r0 = r6.LL
            float r9 = r0.getTranslationY()
            android.view.View r1 = r6.LL
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            float r8 = r6.LIZLLL(r1, r7, r3, r0)
            android.view.View r1 = r6.LL
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            float r10 = r6.LIZLLL(r1, r9, r2, r0)
            android.animation.ValueAnimator r0 = r6.LLLILZ
            if (r0 == 0) goto L61
            r0.cancel()
        L61:
            android.animation.ValueAnimator r0 = r6.LLLIL
            if (r0 == 0) goto L68
            r0.cancel()
        L68:
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x00a2: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r0 = 1073741824(0x40000000, float:2.0)
            r1.<init>(r0)
            r2.setInterpolator(r1)
            Y.AUListenerS0S0100006_11 r3 = new Y.AUListenerS0S0100006_11
            r11 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.addUpdateListener(r3)
            X.0STA r0 = new X.0STA
            r0.<init>()
            r2.addListener(r0)
            r2.start()
            r6.LLLIL = r2
        L97:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9a:
            java.lang.Object r0 = r11.l0
            X.0STE r0 = (X.C0STE) r0
            r0.LIZIZ()
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS129S0110000_11.invoke$7(kotlin.jvm.internal.AwS129S0110000_11):java.lang.Object");
    }

    public static final Object invoke$8(AwS129S0110000_11 awS129S0110000_11) {
        C11NJ compositeDisposable;
        if (C724240Sb0.LIZ((PhotoInteractStickerComponent) awS129S0110000_11.l0) == null) {
            return C2097608Jq.LJ();
        }
        C19602911ml c19602911ml = C19602911ml.LIZ;
        Aweme aweme = ((VideoItemParams) C631370Opb.LIZ((PhotoInteractStickerComponent) awS129S0110000_11.l0)).getAweme();
        C19EG c19egLIZ = C724240Sb0.LIZ((PhotoInteractStickerComponent) awS129S0110000_11.l0);
        if (c19egLIZ != null) {
            boolean z = awS129S0110000_11.z1;
            C692980RGe c692980RGe = ((PhotoInteractStickerComponent) awS129S0110000_11.l0).LLJJL;
            Fragment fragment = null;
            if (c692980RGe != null) {
                compositeDisposable = c692980RGe.getCompositeDisposable();
            } else {
                compositeDisposable = null;
            }
            Context context = ((PhotoInteractStickerComponent) awS129S0110000_11.l0).getContext();
            PhotoInteractStickerComponent photoInteractStickerComponent = (PhotoInteractStickerComponent) awS129S0110000_11.l0;
            C705930RmZ c705930RmZ = photoInteractStickerComponent.LLJJLIIIJLLLLLLLZ;
            C692980RGe c692980RGe2 = photoInteractStickerComponent.LLJJL;
            C0RF0 c0rf0 = photoInteractStickerComponent.jm().LIZLLL;
            if (c0rf0 != null) {
                fragment = c0rf0.LIZJ;
            }
            c19602911ml.getClass();
            return C19602911ml.LJ(aweme, c19egLIZ, z, compositeDisposable, context, c705930RmZ, c692980RGe2, fragment, null, null, false);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS129S0110000_11(C0ROM c0rom, C0ROM<VideoItemParams, C690870R8b> c0rom2, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = c0rom;
        this.z1 = c0rom2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0110000_11(AbstractC738140SxQ abstractC738140SxQ, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC738140SxQ;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0110000_11(PhotoInteractStickerComponent photoInteractStickerComponent, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = photoInteractStickerComponent;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0110000_11(SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = smartImagePhotoViewHolderV2;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0110000_11(boolean z, C0STE c0ste, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c0ste;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0110000_11(boolean z, InterfaceC1565950qqv interfaceC1565950qqv, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = interfaceC1565950qqv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS129S0110000_11(boolean z, PostModePageViewModel postModePageViewModel, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = postModePageViewModel;
    }
}
