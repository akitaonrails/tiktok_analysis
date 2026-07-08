package kotlin.jvm.internal;

import X.C09AY;
import X.C1023640ckE;
import X.C1397660mTU;
import X.C1623706Xj;
import X.C1736830vIX;
import X.C1852920yJm;
import X.C20441214yg;
import X.C20684815ws;
import X.C2188811AlT;
import X.C326320Cqk;
import X.C335600DDq;
import X.C338080DNe;
import X.C627660Ojc;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS55S1000000_4 extends C09AY implements Function1 {
    public final int $t;
    public String s0;

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
    public AwS55S1000000_4(int i) {
        super(1);
        this.$t = i;
        this.s0 = "pid_str";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S1000000_4(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS55S1000000_4 awS55S1000000_4, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C335600DDq.LIZ.getClass();
        c1023640ckE.withParam(C335600DDq.LIZIZ, awS55S1000000_4.s0);
        c1023640ckE.withParam(C335600DDq.LIZJ, "close");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS55S1000000_4 awS55S1000000_4, Object obj) {
        return C1736830vIX.LIZ((C1736830vIX) obj, awS55S1000000_4.s0, null, null, null, null, null, null, null, null, 0L, null, null, null, null, 4194301);
    }

    public static final Object invoke$2(AwS55S1000000_4 awS55S1000000_4, Object obj) {
        SmartRouter.buildRoute((Context) obj, UriProtector.parse("aweme://webview/").buildUpon().appendQueryParameter("url", UriProtector.parse(awS55S1000000_4.s0).buildUpon().appendQueryParameter("bot_name", C1852920yJm.LIZ.botName).build().toString()).build().toString()).open();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS55S1000000_4 awS55S1000000_4, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createCustomHeaderView, title: ");
        sbLIZ.append(awS55S1000000_4.s0);
        C20441214yg.LIZIZ("PlayBookViewModel", C2188811AlT.LIZIZ(sbLIZ));
        View viewSd = C786410Ut5.Sd(R.layout.hgm, C786410Ut5.ne((Context) obj), null);
        ((TextView) viewSd.findViewById(R.id.jdx)).setText(awS55S1000000_4.s0);
        viewSd.setBackgroundResource(R.drawable.e3g);
        return viewSd;
    }

    public static final Object invoke$4(AwS55S1000000_4 awS55S1000000_4, Object obj) {
        return C1736830vIX.LIZ((C1736830vIX) obj, awS55S1000000_4.s0, null, null, null, null, null, null, null, null, 0L, null, null, null, null, 4194301);
    }

    public static final Object invoke$5(AwS55S1000000_4 awS55S1000000_4, Object obj) {
        ((C1397660mTU) obj).LIZJ = true;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", awS55S1000000_4.s0);
        linkedHashMap.put("action", "cancel");
        C20684815ws.LJIILLIIL("claim_store_popup_result", linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS55S1000000_4 awS55S1000000_4, Object obj) {
        return ((Map) obj).get(awS55S1000000_4.s0);
    }

    public static final Object invoke$7(AwS55S1000000_4 awS55S1000000_4, Object obj) {
        return new C326320Cqk(awS55S1000000_4.s0, C627660Ojc.LIZ(((C326320Cqk) obj).LLILLJJLI, new C1623706Xj(), null, null, null, 14));
    }

    public static final Object invoke$8(AwS55S1000000_4 awS55S1000000_4, Object obj) {
        return C338080DNe.LIZ((C338080DNe) obj, awS55S1000000_4.s0, null, null, null, null, null, null, null, null, 510);
    }

    public static final Object invoke$9(AwS55S1000000_4 awS55S1000000_4, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((Aweme) obj).getAid(), awS55S1000000_4.s0));
    }
}
