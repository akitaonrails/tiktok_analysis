package kotlin.jvm.internal;

import X.C09AY;
import X.C123100dR;
import X.C127A;
import X.C1350340lFA;
import X.C1350570lFX;
import X.C1388190mED;
import X.C1393110mM9;
import X.C1393190mMH;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1589640rT8;
import X.EnumC1392960mLu;
import X.EnumC1393020mM0;
import X.InterfaceC1631620sYq;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarAction;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public class AwS94S0500000_21 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS94S0500000_21 awS94S0500000_21, Object obj, Object obj2, Object obj3) {
        String str;
        View view = (View) obj;
        if (((Number) obj2).intValue() == 1) {
            CommentTopBarAction commentTopBarAction = ((CommentTopBarComponent) awS94S0500000_21.l0).action;
            if (commentTopBarAction != null) {
                str = commentTopBarAction.schema;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                SmartRouter.buildRoute((Context) awS94S0500000_21.l1, str).open();
                ICommentPageContainer iCommentPageContainer = (ICommentPageContainer) C1558520qew.LIZ(C1558360qeg.LJ(view, null), ICommentPageContainer.class, null);
                if (iCommentPageContainer != null) {
                    iCommentPageContainer.Kb1("click_ug_drama_anchor");
                }
            }
            C1350570lFX c1350570lFX = (C1350570lFX) awS94S0500000_21.l2;
            Aweme aweme = (Aweme) awS94S0500000_21.l3;
            String strEnterFrom = CommentContextSourceKt.enterFrom((CommentContextSource) awS94S0500000_21.l4);
            c1350570lFX.getClass();
            C1350340lFA.LIZIZ(c1350570lFX, aweme, strEnterFrom);
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$1(AwS94S0500000_21 awS94S0500000_21, Object obj, Object obj2, Object obj3) {
        C127A c127a = (C127A) obj;
        EnumC1392960mLu enumC1392960mLu = (EnumC1392960mLu) obj2;
        if (((Boolean) obj3).booleanValue()) {
            Activity activityLIZ = C1388190mED.LIZ((Context) awS94S0500000_21.l0);
            Fragment fragment = (Fragment) awS94S0500000_21.l1;
            User user = (User) awS94S0500000_21.l2;
            EnumC1393020mM0 enumC1393020mM0 = (EnumC1393020mM0) awS94S0500000_21.l3;
            C1393110mM9 c1393110mM9 = (C1393110mM9) awS94S0500000_21.l4;
            C1589640rT8.LIZIZ.M2(activityLIZ, c127a.LIZIZ.LIZIZ, fragment, new C1393190mMH(c1393110mM9.LJ, c1393110mM9.LIZIZ, c1393110mM9.LIZJ, c1393110mM9.LIZLLL, c1393110mM9.LJIIIIZZ, 96), enumC1393020mM0, enumC1392960mLu, user, new AwS230S0300000_21(user, enumC1392960mLu, c127a, 37));
        } else {
            Activity activityLIZ2 = C1388190mED.LIZ((Context) awS94S0500000_21.l0);
            Fragment fragment2 = (Fragment) awS94S0500000_21.l1;
            User user2 = (User) awS94S0500000_21.l2;
            C1589640rT8.LIZIZ.K2(user2, fragment2, activityLIZ2, (EnumC1393020mM0) awS94S0500000_21.l3, enumC1392960mLu, c127a.LIZIZ.LIZIZ, new AwS230S0300000_21(user2, enumC1392960mLu, c127a, 38));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0500000_21(Context context, Fragment fragment, User user, EnumC1393020mM0 enumC1393020mM0, C1393110mM9 c1393110mM9, int i) {
        super(3);
        this.$t = i;
        this.l0 = context;
        this.l1 = fragment;
        this.l2 = user;
        this.l3 = enumC1393020mM0;
        this.l4 = c1393110mM9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0500000_21(CommentTopBarComponent commentTopBarComponent, Context context, C1350570lFX c1350570lFX, Aweme aweme, CommentContextSource commentContextSource, int i) {
        super(3);
        this.$t = i;
        this.l0 = commentTopBarComponent;
        this.l1 = context;
        this.l2 = c1350570lFX;
        this.l3 = aweme;
        this.l4 = commentContextSource;
    }
}
