package kotlin.jvm.internal;

import X.C09AY;
import X.C13LP;
import X.C1609910rzp;
import X.C1697810uHb;
import X.C197039127h;
import X.C20353514kX;
import X.C20441214yg;
import X.C20615415lg;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1631620sYq;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.effect.playentity.StickerEffectEntity;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AwS49S2100000_31 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
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

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS49S2100000_31 awS49S2100000_31, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        c197039127h.setText(awS49S2100000_31.s0);
        c197039127h.setButtonSize(3);
        if (C13LP.LJJJJ(awS49S2100000_31.s1, NetworkStandardUIServiceImpl.Companion.getNewStylePanelList())) {
            ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
            } else {
                layoutParams = null;
            }
            C786410Ut5.J6(c197039127h, layoutParams);
        }
        List<String> list = C1609910rzp.LIZ;
        if (C13LP.LJJJJ(awS49S2100000_31.s1, C1609910rzp.LJ)) {
            c197039127h.setButtonVariant(1);
        }
        final Runnable runnable = (Runnable) awS49S2100000_31.l2;
        C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$largePanelStatusView$5$2$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS49S2100000_31 awS49S2100000_31, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAvatarBitmap, fileName: ");
        sbLIZ.append(awS49S2100000_31.s0);
        sbLIZ.append(", channelName: ");
        sbLIZ.append(awS49S2100000_31.s1);
        C20441214yg.LJIIIZ("ILottieGenius", C2188811AlT.LIZIZ(sbLIZ));
        ((Function1) awS49S2100000_31.l2).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS49S2100000_31 awS49S2100000_31, Object obj) {
        ((C20615415lg) awS49S2100000_31.l2).LIZJ.invoke(awS49S2100000_31.s0, awS49S2100000_31.s1, obj);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS49S2100000_31 awS49S2100000_31, Object obj) {
        ((StickerEffectEntity) awS49S2100000_31.l2).LJJLIIIJ(C1697810uHb.LJIIJJI(awS49S2100000_31.s0, awS49S2100000_31.s1), new C20353514kX((StickerEffectEntity) awS49S2100000_31.l2, awS49S2100000_31.s0, awS49S2100000_31.s1, (InterfaceC1631620sYq) obj));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S2100000_31(C20615415lg c20615415lg, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c20615415lg;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S2100000_31(StickerEffectEntity stickerEffectEntity, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = stickerEffectEntity;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S2100000_31(String str, String str2, Runnable runnable, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S2100000_31(String str, String str2, AwS126S0400000_31 awS126S0400000_31, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = awS126S0400000_31;
    }
}
