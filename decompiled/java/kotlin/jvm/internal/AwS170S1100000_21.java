package kotlin.jvm.internal;

import X.C09AY;
import X.C1344030l4z;
import X.C1347980lBM;
import X.C1350920lG6;
import X.C1354600lM2;
import X.C1369870lkf;
import X.C1371850lnr;
import X.C1390380mHk;
import X.C1394720mOk;
import X.C1396190mR7;
import X.C1396210mR9;
import X.C1396230mRB;
import X.C1397480mTC;
import X.C1403010mc7;
import X.C1447090nlD;
import X.C19EG;
import X.C2188811AlT;
import X.C786410Ut5;
import X.DialogC1396120mR0;
import X.DialogInterfaceOnDismissListenerC1402040maY;
import android.app.Activity;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardIconGroupAssem;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class AwS170S1100000_21 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS170S1100000_21 awS170S1100000_21) {
        Aweme aweme;
        String strEnterFrom;
        ((Keva) C1347980lBM.LIZ.getValue()).storeBoolean(C1347980lBM.LIZ(awS170S1100000_21.s0), true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlusPanelBubble shown; marked Keva for user=");
        sbLIZ.append(awS170S1100000_21.s0);
        C1344030l4z.LIZJ("KeyboardIconGroupAssem", C2188811AlT.LIZIZ(sbLIZ));
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceBp = ((KeyboardIconGroupAssem) awS170S1100000_21.l1).bp();
        String strEnterMethod = null;
        if (commentContextSourceBp != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceBp);
        } else {
            aweme = null;
        }
        CommentContextSource commentContextSourceBp2 = ((KeyboardIconGroupAssem) awS170S1100000_21.l1).bp();
        if (commentContextSourceBp2 != null) {
            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceBp2);
        } else {
            strEnterFrom = null;
        }
        CommentContextSource commentContextSourceBp3 = ((KeyboardIconGroupAssem) awS170S1100000_21.l1).bp();
        if (commentContextSourceBp3 != null) {
            strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSourceBp3);
        }
        c1350920lG6.getClass();
        C1350920lG6.LJJJJJL("plus_icon", strEnterFrom, strEnterMethod, aweme);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS170S1100000_21 awS170S1100000_21) {
        ((C1394720mOk) awS170S1100000_21.l1).setSubTitle(awS170S1100000_21.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS170S1100000_21 awS170S1100000_21) {
        ((C1394720mOk) awS170S1100000_21.l1).setTitle(awS170S1100000_21.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS170S1100000_21 awS170S1100000_21) {
        C1396210mR9 c1396210mR9 = (C1396210mR9) awS170S1100000_21.l1;
        Activity activity = (Activity) c1396210mR9.LLILZ.getValue(c1396210mR9, C1396210mR9.LLILZLL[0]);
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(awS170S1100000_21.s0);
        C1390380mHk.LIZ(activity, 3065, creativeToastBuilder);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS170S1100000_21 awS170S1100000_21) {
        C1447090nlD c1447090nlDLIZ = C1403010mc7.LIZ.LIZ();
        C1396190mR7 c1396190mR7 = (C1396190mR7) awS170S1100000_21.l1;
        C19EG c19eg = (C19EG) c1396190mR7.LLILZ.getValue(c1396190mR7, C1396190mR7.LLIZ[0]);
        AwS135S1100000_21 awS135S1100000_21 = new AwS135S1100000_21((C1396190mR7) awS170S1100000_21.l1, awS170S1100000_21.s0, 5);
        c1447090nlDLIZ.getClass();
        DialogC1396120mR0 dialogC1396120mR0 = new DialogC1396120mR0(c19eg, awS135S1100000_21);
        dialogC1396120mR0.setOnDismissListener(new DialogInterfaceOnDismissListenerC1402040maY((C1396190mR7) awS170S1100000_21.l1, 2));
        C786410Ut5.B4(dialogC1396120mR0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS170S1100000_21 awS170S1100000_21) {
        C19EG c19egLIZLLL = ((C1396230mRB) awS170S1100000_21.l1).LIZLLL();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(awS170S1100000_21.s0);
        C1390380mHk.LIZ(c19egLIZLLL, 0, creativeToastBuilder);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS170S1100000_21 awS170S1100000_21) {
        ((C1397480mTC) awS170S1100000_21.l1).LIZLLL(awS170S1100000_21.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS170S1100000_21 awS170S1100000_21) {
        String strLJFF;
        ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
        if (iTextToImageService != null && (strLJFF = iTextToImageService.LJFF(awS170S1100000_21.s0)) != null) {
            Comment comment = (Comment) awS170S1100000_21.l1;
            C1354600lM2.LIZ.getClass();
            C1354600lM2.LIZIZ.put(strLJFF, comment);
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$8(AwS170S1100000_21 awS170S1100000_21) {
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        String str = awS170S1100000_21.s0;
        String string = ((C1371850lnr) awS170S1100000_21.l1).LIZLLL.getString("group_id");
        if (string == null) {
            string = "";
        }
        C1369870lkf.LJIIL(str, "", string, "show");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S1100000_21(C1394720mOk c1394720mOk, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1394720mOk;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S1100000_21(C1396190mR7 c1396190mR7, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1396190mR7;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S1100000_21(C1396210mR9 c1396210mR9, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1396210mR9;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S1100000_21(C1396230mRB c1396230mRB, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1396230mRB;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S1100000_21(C1397480mTC c1397480mTC, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1397480mTC;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S1100000_21(Comment comment, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = comment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S1100000_21(String str, C1371850lnr c1371850lnr, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1371850lnr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S1100000_21(String str, KeyboardIconGroupAssem keyboardIconGroupAssem, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = keyboardIconGroupAssem;
    }
}
