package kotlin.jvm.internal;

import X.C05YD;
import X.C09AY;
import X.C0HFD;
import X.C0HFS;
import X.C0HNI;
import X.C0HOM;
import X.C0HRK;
import X.C0IA3;
import X.C1255650imR;
import X.C197039127h;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C440440HOw;
import X.C443120HZe;
import X.C448260Hhw;
import X.C454220HrY;
import X.C461930I9n;
import X.EnumC429240GsM;
import android.content.Context;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.search.detail.comment.viewmodel.SearchDetailCommentVM;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS114S0101000_6 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0101000_6(C1255650imR c1255650imR, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1255650imR;
        this.i1 = 0;
    }

    public static final Object invoke$0(AwS114S0101000_6 awS114S0101000_6, Object obj) {
        return C0HNI.LIZ((C0HNI) obj, null, null, null, new C0HFD((C0HFS) ListProtector.get(((SocialAvatarEditViewModel) awS114S0101000_6.l0).wQ2(), awS114S0101000_6.i1)), null, false, null, 0, false, false, false, null, null, null, 16375);
    }

    public static final Object invoke$1(AwS114S0101000_6 awS114S0101000_6, Object obj) {
        C448260Hhw c448260Hhw = (C448260Hhw) obj;
        Comment comment = ((SearchDetailCommentVM) awS114S0101000_6.l0).getState().LL;
        if (comment != null) {
            comment.setDiggCount(awS114S0101000_6.i1);
        }
        return C448260Hhw.LIZ(c448260Hhw, null, awS114S0101000_6.i1, null, 0L, 13);
    }

    public static final Object invoke$2(AwS114S0101000_6 awS114S0101000_6, Object obj) {
        int i = awS114S0101000_6.i1;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_verified_badge;
        c419910GdJ.LIZIZ = i;
        c419910GdJ.LIZJ = i;
        ((ImageView) obj).setImageDrawable(c419910GdJ.LIZ((Context) awS114S0101000_6.l0));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS114S0101000_6 awS114S0101000_6, Object obj) {
        ((C1255650imR) awS114S0101000_6.l0).LIZIZ(awS114S0101000_6.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS114S0101000_6 awS114S0101000_6, Object obj) {
        return C0HRK.LIZ((C0HRK) obj, (Set) awS114S0101000_6.l0, null, awS114S0101000_6.i1, 10);
    }

    public static final Object invoke$5(AwS114S0101000_6 awS114S0101000_6, Object obj) {
        return C461930I9n.LIZ((C461930I9n) obj, (C0IA3) awS114S0101000_6.l0, null, EnumC429240GsM.PUBLISHING, null, null, 0, null, 0, awS114S0101000_6.i1, null, 762);
    }

    public static final Object invoke$6(AwS114S0101000_6 awS114S0101000_6, Object obj) {
        int i = awS114S0101000_6.i1;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c384050F3z.LIZIZ = Integer.valueOf(i);
        ((C197039127h) obj).setBackground(c384050F3z.LIZ(((C197039127h) awS114S0101000_6.l0).getContext()));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS114S0101000_6 awS114S0101000_6, Object obj) {
        int i = awS114S0101000_6.i1;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c384050F3z.LIZIZ = Integer.valueOf(i);
        ((C197039127h) obj).setBackground(c384050F3z.LIZ(((C454220HrY) awS114S0101000_6.l0).LLILZ.getContext()));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0101000_6(C454220HrY c454220HrY, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c454220HrY;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0101000_6(C0IA3 c0ia3, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c0ia3;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0101000_6(C197039127h c197039127h, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c197039127h;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0101000_6(Context context, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = context;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0101000_6(SearchDetailCommentVM searchDetailCommentVM, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = searchDetailCommentVM;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0101000_6(SocialAvatarEditViewModel socialAvatarEditViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = socialAvatarEditViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS114S0101000_6(Set set, Set<C443120HZe<Integer, String, C05YD<C0HOM<? extends C440440HOw>>>> set2, int i) {
        super(1);
        this.$t = i;
        this.l0 = set;
        this.i1 = set2;
    }
}
