package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C337180DJs;
import X.C418440Gaw;
import X.C424040Gjy;
import X.C431790GwT;
import X.C786410Ut5;
import X.C814420VxA;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interaction.repost.FriendsV3RepostCommentBtnAssem;
import com.ss.android.ugc.aweme.minidrama.tab.v2.skylight.DramaSkylightHistoryCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class AwS146S0101000_6 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS146S0101000_6 awS146S0101000_6) {
        int iLIZIZ;
        if (((Boolean) ((FriendsV3RepostCommentBtnAssem) awS146S0101000_6.l0).LLJZ.getValue()).booleanValue()) {
            FriendsV3RepostCommentBtnAssem friendsV3RepostCommentBtnAssem = (FriendsV3RepostCommentBtnAssem) awS146S0101000_6.l0;
            String strValueOf = String.valueOf(awS146S0101000_6.i1);
            friendsV3RepostCommentBtnAssem.getClass();
            if (strValueOf != null) {
                if (Intrinsics.LJFF(strValueOf, CardStruct.IStatusCode.DEFAULT)) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                } else if (strValueOf.length() <= 2) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
                } else {
                    iLIZIZ = -2;
                }
                View contentView = friendsV3RepostCommentBtnAssem.getContentView();
                ViewGroup.LayoutParams layoutParams = friendsV3RepostCommentBtnAssem.getContentView().getLayoutParams();
                layoutParams.width = iLIZIZ;
                C786410Ut5.W5(contentView, layoutParams);
                if (Intrinsics.LJFF(strValueOf, CardStruct.IStatusCode.DEFAULT)) {
                    C337180DJs.LIZ((View) friendsV3RepostCommentBtnAssem.LLJLLL.getValue());
                } else {
                    ((TextView) friendsV3RepostCommentBtnAssem.LLJLLL.getValue()).setText(strValueOf);
                    C337180DJs.LIZJ((View) friendsV3RepostCommentBtnAssem.LLJLLL.getValue());
                }
            }
        } else {
            ((TextView) ((FriendsV3RepostCommentBtnAssem) awS146S0101000_6.l0).LLJLLL.getValue()).setText(String.valueOf(awS146S0101000_6.i1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS146S0101000_6 awS146S0101000_6) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayout-> valid rect [");
        sbLIZ.append(awS146S0101000_6.i1);
        sbLIZ.append(", ");
        sbLIZ.append((((C431790GwT) awS146S0101000_6.l0).getMeasuredHeight() - ((C431790GwT) awS146S0101000_6.l0).getCompoundPaddingTop()) - ((C431790GwT) awS146S0101000_6.l0).getCompoundPaddingBottom());
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS146S0101000_6 awS146S0101000_6) {
        View view = ((DramaSkylightHistoryCell) awS146S0101000_6.l0).itemView;
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i = awS146S0101000_6.i1;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        gradientDrawable.setColor(i);
        view.setBackground(gradientDrawable);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS146S0101000_6 awS146S0101000_6) {
        if (((C424040Gjy) awS146S0101000_6.l0).getParent() != null) {
            ((C424040Gjy) awS146S0101000_6.l0).LJIIJ(awS146S0101000_6.i1, true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S0101000_6(int i, C431790GwT c431790GwT, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c431790GwT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S0101000_6(C424040Gjy c424040Gjy, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c424040Gjy;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S0101000_6(FriendsV3RepostCommentBtnAssem friendsV3RepostCommentBtnAssem, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = friendsV3RepostCommentBtnAssem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S0101000_6(DramaSkylightHistoryCell dramaSkylightHistoryCell, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = dramaSkylightHistoryCell;
        this.i1 = i;
    }
}
