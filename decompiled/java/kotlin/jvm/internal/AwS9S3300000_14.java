package kotlin.jvm.internal;

import X.AbstractC912050ZqF;
import X.C09AY;
import X.C0Y8T;
import X.C0YS1;
import X.C0ZG6;
import X.C0ZGE;
import X.C0ZGG;
import X.C0ZGJ;
import X.C20478080m;
import X.C2188811AlT;
import X.C911490ZpL;
import X.C912000ZqA;
import X.C912040ZqE;
import X.EnumC900350ZTt;
import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.service.impl.IMChatService;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class AwS9S3300000_14 extends C09AY implements Function0 {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;

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

    public static final Object invoke$0(AwS9S3300000_14 awS9S3300000_14) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS9S3300000_14.s0);
        sbLIZ.append(" AI Group Shot fail");
        C0YS1.LIZJ("AIGroupShotSender", C2188811AlT.LIZIZ(sbLIZ));
        C911490ZpL c911490ZpL = C911490ZpL.LIZ;
        AbstractC912050ZqF abstractC912050ZqF = (AbstractC912050ZqF) awS9S3300000_14.l3;
        boolean zIsGroupChat = ((C0Y8T) awS9S3300000_14.l4).isGroupChat();
        String str = awS9S3300000_14.s2;
        String strLIZJ = ((AbstractC912050ZqF) awS9S3300000_14.l3).LIZJ();
        c911490ZpL.getClass();
        C911490ZpL.LIZIZ(abstractC912050ZqF, awS9S3300000_14.s1, abstractC912050ZqF instanceof C912040ZqE, zIsGroupChat, str, strLIZJ);
        C20478080m.LIZ(new C912000ZqA(awS9S3300000_14.s2, (AbstractC912050ZqF) awS9S3300000_14.l3, (EnumC900350ZTt) awS9S3300000_14.l5, null));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S3300000_14 awS9S3300000_14) {
        String nickname;
        String authorUid = AwemeExtKt.getAuthorUid((Aweme) awS9S3300000_14.l3);
        User author = ((Aweme) awS9S3300000_14.l3).getAuthor();
        if (author == null || (nickname = author.getNickname()) == null) {
            nickname = "";
        }
        final String str = awS9S3300000_14.s2;
        C0ZGG c0zgg = new C0ZGG() { // from class: X.0ZG5
            @Override // X.C0ZGG
            public final String LIZ(C0ZGS c0zgs) {
                return str;
            }
        };
        final Aweme aweme = (Aweme) awS9S3300000_14.l3;
        C0ZGE c0zge = new C0ZGE() { // from class: X.0ZFn
            @Override // X.C0ZGE
            public final QuoteMode LIZ(C0ZGS c0zgs) {
                long jLongValue;
                Aweme aweme2 = aweme;
                Long lLJIILIIL = C2095008Iq.LJIILIIL(AwemeExtKt.getAuthorUid(aweme2));
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = -1;
                }
                return C896600ZFi.LIZ(aweme2, jLongValue, null);
            }
        };
        final String str2 = awS9S3300000_14.s1;
        final QuickDMEventParam quickDMEventParam = (QuickDMEventParam) awS9S3300000_14.l5;
        return new C0ZGJ((Activity) awS9S3300000_14.l4, awS9S3300000_14.s0, authorUid, nickname, 0, str2, c0zgg, c0zge, new C0ZG6() { // from class: X.0ZG4
            @Override // X.C0ZG6
            public final Map<String, String> LIZ(C0ZGS c0zgs) {
                return IMChatService.LJJIJIL(str2, aweme, quickDMEventParam, c0zgs);
            }
        }, null, false, 1536);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S3300000_14(Aweme aweme, Activity activity, String str, String str2, String str3, QuickDMEventParam quickDMEventParam, int i) {
        super(0);
        this.$t = i;
        this.l3 = aweme;
        this.l4 = activity;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l5 = quickDMEventParam;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S3300000_14(String str, AbstractC912050ZqF abstractC912050ZqF, String str2, C0Y8T c0y8t, String str3, EnumC900350ZTt enumC900350ZTt, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l3 = abstractC912050ZqF;
        this.s1 = str2;
        this.l4 = c0y8t;
        this.s2 = str3;
        this.l5 = enumC900350ZTt;
    }
}
