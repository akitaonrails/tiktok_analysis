package kotlin.jvm.internal;

import X.C09AY;
import X.C1342360l2I;
import X.C1350920lG6;
import X.C20600815jK;
import X.InterfaceC1342370l2J;
import X.InterfaceC1891350zJl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS1S1700000_21 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S1700000_21 awS1S1700000_21, Object obj) {
        C1342360l2I c1342360l2I = C1342360l2I.LIZ;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) awS1S1700000_21.l1;
        Comment comment = (Comment) awS1S1700000_21.l2;
        InterfaceC1342370l2J interfaceC1342370l2J = (InterfaceC1342370l2J) awS1S1700000_21.l3;
        Aweme aweme = (Aweme) awS1S1700000_21.l4;
        Function1 function1 = (Function1) awS1S1700000_21.l5;
        C20600815jK c20600815jK = (C20600815jK) awS1S1700000_21.l6;
        Fragment fragment = (Fragment) awS1S1700000_21.l7;
        String str = awS1S1700000_21.s0;
        c1342360l2I.getClass();
        C1342360l2I.LIZ(lifecycleOwner, comment, interfaceC1342370l2J, true, aweme, function1, c20600815jK, fragment, str);
        C1350920lG6.LJJJI(((InterfaceC1342370l2J) awS1S1700000_21.l3).getComment(), "comment_restr_pin_opt_pin_anyway_click");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S1700000_21 awS1S1700000_21, Object obj) {
        String aid;
        C1342360l2I c1342360l2I = C1342360l2I.LIZ;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) awS1S1700000_21.l1;
        Comment comment = (Comment) awS1S1700000_21.l2;
        InterfaceC1342370l2J interfaceC1342370l2J = (InterfaceC1342370l2J) awS1S1700000_21.l3;
        Aweme aweme = (Aweme) awS1S1700000_21.l4;
        Function1 function1 = (Function1) awS1S1700000_21.l5;
        C20600815jK c20600815jK = (C20600815jK) awS1S1700000_21.l6;
        Fragment fragment = (Fragment) awS1S1700000_21.l7;
        String str = awS1S1700000_21.s0;
        c1342360l2I.getClass();
        C1342360l2I.LIZ(lifecycleOwner, comment, interfaceC1342370l2J, false, aweme, function1, c20600815jK, fragment, str);
        String str2 = awS1S1700000_21.s0;
        Aweme aweme2 = (Aweme) awS1S1700000_21.l4;
        String authorUid = null;
        if (aweme2 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme2);
        }
        String str3 = "";
        if (authorUid == null) {
            authorUid = "";
        }
        Aweme aweme3 = (Aweme) awS1S1700000_21.l4;
        if (aweme3 != null && (aid = aweme3.getAid()) != null) {
            str3 = aid;
        }
        C1350920lG6.LJII(str2, "replace", authorUid, str3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S1700000_21(LifecycleOwner lifecycleOwner, LifecycleOwner lifecycleOwner2, Comment comment, InterfaceC1342370l2J interfaceC1342370l2J, Aweme aweme, Function1<? super Comment, Unit> function1, C20600815jK<InterfaceC1891350zJl> c20600815jK, Fragment fragment, String str) {
        super(1);
        this.$t = str;
        this.l1 = lifecycleOwner;
        this.l2 = lifecycleOwner2;
        this.l3 = comment;
        this.l4 = interfaceC1342370l2J;
        this.l5 = aweme;
        this.l6 = function1;
        this.l7 = c20600815jK;
        this.s0 = fragment;
    }
}
