package kotlin.jvm.internal;

import X.C09AY;
import X.C0T89;
import X.C0T8B;
import X.C0U5U;
import X.C0UAO;
import X.C0UC4;
import X.C1127920fSQ;
import X.C12DM;
import X.C1602160rnK;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C748880TZe;
import X.C754480Tig;
import X.C767880UAg;
import X.C786410Ut5;
import X.InterfaceC767730U9r;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS45S0300000_12;
import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.effect.LiveEffectContainerDialog;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AwS17S0410000_12 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS17S0410000_12 awS17S0410000_12) {
        float width;
        if (((C0T89) awS17S0410000_12.l0).isAttachedToWindow()) {
            C754480Tig giftGalleryView = ((C0T89) awS17S0410000_12.l0).getGiftGalleryView();
            if (giftGalleryView != null) {
                giftGalleryView.e0((C1127920fSQ) awS17S0410000_12.l1, Boolean.valueOf(!awS17S0410000_12.z4));
            }
            C0T8B c0t8b = (C0T8B) awS17S0410000_12.l2;
            if (c0t8b != null) {
                ((C0T89) awS17S0410000_12.l0).LIZ((C0T8B) awS17S0410000_12.l3, c0t8b);
            }
            if (!awS17S0410000_12.z4) {
                C786410Ut5.LJLLLLLL(8, (View) ((C0T8B) awS17S0410000_12.l2));
                C0T89 c0t89 = (C0T89) awS17S0410000_12.l0;
                AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c0t89, 25);
                c0t89.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("animateShowBoxWithGuide# endAction : ");
                sbLIZ.append(awS556S0100000_12);
                C20441214yg.LIZIZ("BannerParentLayout", C2188811AlT.LIZIZ(sbLIZ));
                C754480Tig giftGalleryView2 = c0t89.getGiftGalleryView();
                if (giftGalleryView2 != null) {
                    int visibility = giftGalleryView2.getVisibility();
                    giftGalleryView2.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, giftGalleryView2);
                    if (C497740JfY.LJJ()) {
                        width = -giftGalleryView2.getWidth();
                    } else {
                        width = giftGalleryView2.getWidth();
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(giftGalleryView2);
                    giftGalleryView2.setTranslationX(width);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(giftGalleryView2);
                    giftGalleryView2.setAlpha(0.0f);
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = giftGalleryView2.animate();
                    viewPropertyAnimatorAnimate.translationX(0.0f).alpha(1.0f).setDuration(300L).withStartAction(new ARunnableS81S0200000_12(viewPropertyAnimatorAnimate, c0t89, 9)).withEndAction(new ARunnableS45S0300000_12(c0t89, viewPropertyAnimatorAnimate, awS556S0100000_12, 1)).setInterpolator(new C12DM()).start();
                }
            } else {
                ((C0T89) awS17S0410000_12.l0).LIZJ();
                C0T89.LIZIZ((C0T89) awS17S0410000_12.l0, true, 2);
                C0T89 c0t892 = (C0T89) awS17S0410000_12.l0;
                C0T8B c0t8b2 = (C0T8B) awS17S0410000_12.l2;
                c0t892.getClass();
                HandlerHook.viewPostDelay(c0t892, new ARunnableS81S0200000_12(c0t8b2, c0t892, 11), 30L);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS17S0410000_12 awS17S0410000_12) {
        if (C0U5U.LIZ == null) {
            C0UAO c0uao = new C0UAO((Context) awS17S0410000_12.l0, (DataChannel) awS17S0410000_12.l1);
            C0U5U.LIZ = c0uao;
            c0uao.LLJJI = (InterfaceC767730U9r) awS17S0410000_12.l2;
            Map<String, String> map = (Map) awS17S0410000_12.l3;
            C0UC4.LJJI = map;
            c0uao.LLJJL = map;
        }
        C0UAO c0uao2 = C0U5U.LIZ;
        if (c0uao2 != null) {
            c0uao2.LLJJI = (InterfaceC767730U9r) awS17S0410000_12.l2;
        }
        if (C0U5U.LIZIZ == null) {
            C0U5U.LIZIZ = new C767880UAg((Context) awS17S0410000_12.l0, (DataChannel) awS17S0410000_12.l1);
        }
        FragmentManager fragmentManager = (FragmentManager) ((DataChannel) awS17S0410000_12.l1).gg0(C748880TZe.class);
        if (fragmentManager != null) {
            Map<String, String> map2 = (Map) awS17S0410000_12.l3;
            boolean z = awS17S0410000_12.z4;
            C0UAO c0uao3 = C0U5U.LIZ;
            if (c0uao3 != null) {
                C0UC4.LJJI = map2;
                c0uao3.LLJJL = map2;
                c0uao3.LLJJJIL = z;
                LiveEffectContainerDialog liveEffectContainerDialog = new LiveEffectContainerDialog();
                C767880UAg c767880UAg = C0U5U.LIZIZ;
                liveEffectContainerDialog.LLILLJJLI = c0uao3;
                liveEffectContainerDialog.LLILLL = c767880UAg;
                liveEffectContainerDialog.show(fragmentManager, C0UAO.class.getSimpleName());
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S0410000_12(C0T89 c0t89, C1127920fSQ c1127920fSQ, C0T8B c0t8b, C0T8B c0t8b2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0t89;
        this.l1 = c1127920fSQ;
        this.z4 = true;
        this.l2 = c0t8b;
        this.l3 = c0t8b2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS17S0410000_12(Context context, Context context2, DataChannel dataChannel, InterfaceC767730U9r interfaceC767730U9r, Map<String, String> map, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = dataChannel;
        this.l3 = interfaceC767730U9r;
        this.z4 = map;
    }
}
