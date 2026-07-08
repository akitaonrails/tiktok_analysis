package kotlin.jvm.internal;

import X.C09AY;
import X.C13LP;
import X.C1796560wqs;
import X.C1797010wrb;
import X.C1807550x8b;
import X.C1854760yMk;
import X.C1856720yPu;
import X.InterfaceC1631620sYq;
import X.InterfaceC1796910wrR;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.android.live.wallet.model.DiamondBuyResult;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.list.TakoAnswerImageListItemAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.multipletemplate.bottomselected.BottomSelectedMediaAssem;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.PreviewMediaState;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes28.dex */
public class AwS489S0200000_27 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS489S0200000_27(C1856720yPu c1856720yPu, TakoAnswerImageListItemAssem takoAnswerImageListItemAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1856720yPu;
        this.l1 = takoAnswerImageListItemAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS489S0200000_27(Diamond diamond, C1807550x8b c1807550x8b, int i) {
        super(3);
        this.$t = i;
        this.l0 = diamond;
        this.l1 = c1807550x8b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS489S0200000_27(BottomInputAssem bottomInputAssem, C1854760yMk c1854760yMk, int i) {
        super(3);
        this.$t = i;
        this.l0 = bottomInputAssem;
        this.l1 = c1854760yMk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS489S0200000_27(BottomSelectedMediaAssem bottomSelectedMediaAssem, View view, int i) {
        super(3);
        this.$t = i;
        this.l0 = bottomSelectedMediaAssem;
        this.l1 = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS489S0200000_27 r34, java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS489S0200000_27.invoke$0(kotlin.jvm.internal.AwS489S0200000_27, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS489S0200000_27 awS489S0200000_27, Object obj, Object obj2, Object obj3) {
        BottomSelectedMediaAssem bottomSelectedMediaAssem = (BottomSelectedMediaAssem) awS489S0200000_27.l0;
        View view = (View) awS489S0200000_27.l1;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BottomSelectedMediaAssem.LLJLL;
        bottomSelectedMediaAssem.op((PreviewMediaState) obj3, (List) obj2, false, view);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS489S0200000_27 awS489S0200000_27, Object obj, Object obj2, Object obj3) {
        DiamondBuyResult diamondBuyResult = (DiamondBuyResult) obj;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        if (zBooleanValue) {
            C1797010wrb c1797010wrb = new C1797010wrb(2, null, new C1796560wqs(1, ((Diamond) awS489S0200000_27.l0).iapId, diamondBuyResult.orderId, String.valueOf(UserService.getInstance().user().getCurrentUserId()), false, 16), null, null, null, 506);
            InterfaceC1796910wrR interfaceC1796910wrR = (InterfaceC1796910wrR) awS489S0200000_27.l1;
            if (interfaceC1796910wrR != null) {
                interfaceC1796910wrR.LJIIIIZZ(2, c1797010wrb);
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$3(AwS489S0200000_27 awS489S0200000_27, Object obj, Object obj2, Object obj3) {
        List<String> list;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        BaseImage baseImage = ((C1856720yPu) awS489S0200000_27.l0).LLILLL;
        if (baseImage != null && (list = baseImage.urlList) != null && C13LP.LJJJJ(obj2, list)) {
            ((TakoAnswerImageListItemAssem) awS489S0200000_27.l1).Fp(zBooleanValue);
        }
        return Unit.LIZ;
    }
}
