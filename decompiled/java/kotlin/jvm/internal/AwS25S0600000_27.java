package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0DHG;
import X.C0FNV;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1578630rBN;
import X.C1863240yaQ;
import X.C19404410vq;
import X.C19719212De;
import X.C259800zU;
import X.C632670Orh;
import X.C985403tE;
import X.DialogC1389620mGW;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.skydoves.balloon.Balloon;
import com.ss.android.ugc.aweme.tako.botpage.components.source.TakoReferenceAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSourceItem;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public class AwS25S0600000_27 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS25S0600000_27 awS25S0600000_27) {
        Balloon balloon = (Balloon) ((C259800zU) awS25S0600000_27.l0).element;
        if (balloon != null) {
            balloon.dismiss();
        }
        String str = ((ConversationInfo) awS25S0600000_27.l1).subConversationId;
        if (str != null && a0.LJJIIZI(str, "his_conv", false)) {
            C1389890mGx c1389890mGx = new C1389890mGx((View) awS25S0600000_27.l3);
            c1389890mGx.LJIIIZ(2131822473);
            c1389890mGx.LJIIJJI();
        } else if (C0DHG.LIZ() && C1388190mED.LIZ((Context) awS25S0600000_27.l2) != null) {
            C632670Orh.LIZIZ((Context) awS25S0600000_27.l2, new C19719212De(162936373, new AwS187S0400000_33((C259800zU) awS25S0600000_27.l0, (C259800zU<Balloon>) awS25S0600000_27.l4, (C1863240yaQ) awS25S0600000_27.l5, (C19404410vq) awS25S0600000_27.l1, (ConversationInfo) 2), true));
        } else {
            C1397580mTM c1397580mTM = new C1397580mTM((Context) awS25S0600000_27.l2);
            c1397580mTM.LIZ(2131822471);
            C985403tE.LIZ(c1397580mTM, new AwS122S0400000_27((C259800zU) awS25S0600000_27.l0, (C259800zU<Balloon>) awS25S0600000_27.l4, (C1863240yaQ) awS25S0600000_27.l5, (C19404410vq) awS25S0600000_27.l1, (ConversationInfo) 7));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS25S0600000_27 awS25S0600000_27) {
        Function0 function0;
        Dialog dialog = (Dialog) ((C259800zU) awS25S0600000_27.l0).element;
        if (dialog != null) {
            C0FNV.LIZ(dialog);
        }
        if (!C1578630rBN.LJIIIZ((TakoReferenceAssem) awS25S0600000_27.l1)) {
            ((TakoReferenceAssem) awS25S0600000_27.l1).sp((BatchDetailList) awS25S0600000_27.l2, (List) awS25S0600000_27.l3);
            if (!((C013C) awS25S0600000_27.l4).element && (function0 = (Function0) awS25S0600000_27.l5) != null) {
                function0.invoke();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS25S0600000_27(C259800zU c259800zU, C259800zU<DialogC1389620mGW> c259800zU2, TakoReferenceAssem takoReferenceAssem, BatchDetailList batchDetailList, List<TakoSourceItem> list, C013C c013c, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = takoReferenceAssem;
        this.l3 = batchDetailList;
        this.l4 = list;
        this.l5 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS25S0600000_27(C259800zU c259800zU, C259800zU<Balloon> c259800zU2, ConversationInfo conversationInfo, Context context, View view, C1863240yaQ c1863240yaQ, C19404410vq c19404410vq) {
        super(0);
        this.$t = c19404410vq;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = conversationInfo;
        this.l3 = context;
        this.l4 = view;
        this.l5 = c1863240yaQ;
    }
}
