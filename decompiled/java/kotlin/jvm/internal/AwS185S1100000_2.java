package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C0YNP;
import X.C1398350mUb;
import X.C1684506ih;
import X.C1698006ks;
import X.C189200o6;
import X.C201955140j;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C23250099c;
import X.C291001Au;
import X.C866530Xz1;
import X.InterfaceC20236714Gf;
import android.app.Activity;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseSwitchActionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class AwS185S1100000_2 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS185S1100000_2(SessionInfo sessionInfo, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = sessionInfo;
        this.s0 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS185S1100000_2 awS185S1100000_2, Object obj, Object obj2) {
        if (((Boolean) ((C291001Au) obj2).LIZ).booleanValue()) {
            C1684506ih c1684506ih = new C1684506ih();
            c1684506ih.LIZLLL(6);
            c1684506ih.LIZ((SessionInfo) awS185S1100000_2.l1);
            c1684506ih.LIZJ = awS185S1100000_2.s0;
            FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpiForReal(FakeMsgOperatorService.class);
            if (fakeMsgOperatorService != null) {
                fakeMsgOperatorService.LIZ(((SessionInfo) awS185S1100000_2.l1).getConversationId(), c1684506ih, ((SessionInfo) awS185S1100000_2.l1).getUuid(), null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS185S1100000_2 awS185S1100000_2, Object obj, Object obj2) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UgcPreloadTemplateServiceImpl preload: getTemplate fail templateId=");
        sbLIZ.append(awS185S1100000_2.s0);
        sbLIZ.append(" errorMeg=");
        sbLIZ.append((String) obj);
        C201955140j.LJII(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        Function0 function0 = (Function0) awS185S1100000_2.l1;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS185S1100000_2 awS185S1100000_2, Object obj, Object obj2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchDetailNode fetch detail fail: id=");
        sbLIZ.append(awS185S1100000_2.s0);
        sbLIZ.append(", msg=");
        sbLIZ.append((String) obj);
        sbLIZ.append(", logId=");
        sbLIZ.append((String) obj2);
        IllegalStateException illegalStateException = new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        String message = illegalStateException.getMessage();
        if (message == null) {
            message = "fetch detail fail";
        }
        C201955140j.LJII(c1398350mUb, message);
        if (((InterfaceC20236714Gf) awS185S1100000_2.l1).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS185S1100000_2.l1;
            C098200Yq c098200Yq = new C098200Yq(illegalStateException);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC20236714Gf.resumeWith(c098200Yq);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS185S1100000_2 awS185S1100000_2, Object obj, Object obj2) {
        BaseSwitchActionViewModel baseSwitchActionViewModel = (BaseSwitchActionViewModel) obj;
        boolean z = !baseSwitchActionViewModel.wQ2();
        String str = awS185S1100000_2.s0;
        Function1 function1 = (Function1) awS185S1100000_2.l1;
        C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(str);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseSwitchActionViewModel), C2107308Nj.LIZ, null, new C1698006ks(z, baseSwitchActionViewModel, c866530Xz1LIZIZ, function1, c866530Xz1LIZIZ.LJ(), (Activity) obj2, null), 2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS185S1100000_2(String str, C2252611DEt c2252611DEt, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = c2252611DEt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS185S1100000_2(String str, String str2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS185S1100000_2(String str, String str2, Function1<? super Boolean, Unit> function1) {
        super(2);
        this.$t = function1;
        this.s0 = str;
        this.l1 = str2;
    }
}
