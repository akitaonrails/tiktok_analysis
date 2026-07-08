package kotlin.jvm.internal;

import X.C09AY;
import X.C0DQF;
import X.C1836170xsl;
import X.C1836330xt1;
import X.C1854150yLl;
import X.C1854470yMH;
import X.C1854760yMk;
import X.C1857170yQd;
import X.C1862330yYx;
import X.C19EG;
import X.C20235014Fo;
import X.C20441214yg;
import X.C2097608Jq;
import X.C597050NbL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C766270U4b;
import X.C786410Ut5;
import X.DialogC1390150mHN;
import android.view.View;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public class AwS158S1200000_27 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS158S1200000_27 awS158S1200000_27, Object obj, Object obj2) throws JSONException {
        C1854470yMH c1854470yMH = (C1854470yMH) obj;
        IMessageAbility iMessageAbilityOp = ((BottomInputAssem) awS158S1200000_27.l1).op();
        if (iMessageAbilityOp != null && iMessageAbilityOp.oj()) {
            C1854760yMk c1854760yMk = ((BottomInputAssem) awS158S1200000_27.l1).LLJJJ;
            if (c1854760yMk != null) {
                c1854760yMk.LIZ(awS158S1200000_27.s0);
            }
            C1862330yYx.LIZ.mobTikbotQuickInteractionClick(C2097608Jq.LJIIJ(new Pair("source", "11"), new Pair("rank", String.valueOf(c1854470yMH.LLILLJJLI)), new Pair("interaction_name", c1854470yMH.LL), new Pair("log_id", c1854470yMH.LLILLL), new Pair("sub_mode_type", ((C1854150yLl) awS158S1200000_27.l2).LLJJI), new Pair("mode", "ai_image")), ((BottomInputAssem) awS158S1200000_27.l1).getCommonParams(), null);
        } else {
            C19EG c19egLIZ = C724240Sb0.LIZ((BottomInputAssem) awS158S1200000_27.l1);
            if (c19egLIZ != null) {
                BottomInputAssem bottomInputAssem = (BottomInputAssem) awS158S1200000_27.l1;
                C0DQF.LIZ.LJIIL(c19egLIZ, bottomInputAssem.getContentView(), bottomInputAssem.getCommonParams(), bottomInputAssem.getBotInfo());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS158S1200000_27 awS158S1200000_27, Object obj, Object obj2) {
        Map<String, String> mapLJ;
        Object obj3;
        if (((View) awS158S1200000_27.l1).getVisibility() == 0) {
            TakoSendBaseAssem takoSendBaseAssem = (TakoSendBaseAssem) awS158S1200000_27.l2;
            String str = awS158S1200000_27.s0;
            ITakoContextAbility iTakoContextAbilityZp = takoSendBaseAssem.zp();
            if (iTakoContextAbilityZp == null || (mapLJ = iTakoContextAbilityZp.getCommonParams()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            C724270Sb3 c724270Sb3 = takoSendBaseAssem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            String str2 = ((C1857170yQd) obj3).LL.LLILLL.uuid;
            String str3 = takoSendBaseAssem.LLLIILIL;
            String str4 = mapLJ.get("screen_type");
            if (str4 == null) {
                str4 = "full_screen";
            }
            String str5 = mapLJ.get("tako_session_id");
            String str6 = mapLJ.get("tako_chat_id");
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", mapLJ.get("enter_from")), new Pair("enter_method", mapLJ.get("enter_method")), new Pair("message_id", str2), new Pair("process_id", mapLJ.get("process_id")), new Pair("msg_content", str3), new Pair("screen_type", str4), new Pair("button_type", str));
            if (str5 != null) {
                mapLJIIJ.put("tako_session_id", str5);
            }
            if (str6 != null) {
                mapLJIIJ.put("tako_chat_id", str6);
            }
            c20235014FoLIZ.LIZ("tikbot_collapse_button_show", mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS158S1200000_27 awS158S1200000_27, Object obj, Object obj2) {
        int errorCode;
        BaseException baseException = (BaseException) obj2;
        C20441214yg.LIZIZ("LiveReplayVideoClip", "download fail");
        C1836170xsl c1836170xsl = C1836170xsl.LIZ;
        if (baseException != null) {
            errorCode = baseException.getErrorCode();
        } else {
            errorCode = -1;
        }
        String str = awS158S1200000_27.s0;
        String str2 = ((C1836330xt1) awS158S1200000_27.l1).LIZ;
        c1836170xsl.getClass();
        C1836170xsl.LIZIZ(errorCode, "fail", "download_fail", str, str2);
        C766270U4b.LIZLLL(2131843970);
        C786410Ut5.LJIIJJI((DialogC1390150mHN) awS158S1200000_27.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS158S1200000_27(View view, View view2, TakoSendBaseAssem<C1857170yQd> takoSendBaseAssem, String str) {
        super(2);
        this.$t = str;
        this.l1 = view;
        this.l2 = view2;
        this.s0 = takoSendBaseAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS158S1200000_27(BottomInputAssem bottomInputAssem, String str, C1854150yLl c1854150yLl, int i) {
        super(2);
        this.$t = i;
        this.l1 = bottomInputAssem;
        this.s0 = str;
        this.l2 = c1854150yLl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS158S1200000_27(String str, C1836330xt1 c1836330xt1, DialogC1390150mHN dialogC1390150mHN, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1836330xt1;
        this.l2 = dialogC1390150mHN;
    }
}
