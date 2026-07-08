package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C786410Ut5;
import Y.ACListenerS155S0100000_21;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commentv2.actionbar.CommentPageActionBarAssem;
import com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class AwS100S0210000_21 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS100S0210000_21 awS100S0210000_21) {
        ViewGroup viewGroup;
        TuxIconView tuxIconView = ((CommentPageActionBarAssem) awS100S0210000_21.l0).LLJJJJ;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(R.raw.icon_3_lines_center_aligned);
        }
        TuxIconView tuxIconView2 = ((CommentPageActionBarAssem) awS100S0210000_21.l0).LLJJJJ;
        if (tuxIconView2 != null) {
            tuxIconView2.setTintColorRes(R.attr.a1h);
        }
        if (awS100S0210000_21.z2) {
            ((CommentPageActionBarAssem) awS100S0210000_21.l0).LLLIZZ = SystemClock.uptimeMillis();
            CommentPageActionBarAssem commentPageActionBarAssem = (CommentPageActionBarAssem) awS100S0210000_21.l0;
            ICommentPageAbility iCommentPageAbility = (ICommentPageAbility) awS100S0210000_21.l1;
            TuxTextView tuxTextView = commentPageActionBarAssem.LLJJJ;
            if (tuxTextView != null) {
                View rootView = tuxTextView.getRootView();
                if ((rootView instanceof FrameLayout) && (viewGroup = (ViewGroup) rootView) != null) {
                    commentPageActionBarAssem.yp();
                    if (tuxTextView.getWidth() > 0 && tuxTextView.getHeight() > 0) {
                        int[] iArr = new int[2];
                        tuxTextView.getLocationInWindow(iArr);
                        View view = new View(commentPageActionBarAssem.getContext());
                        view.setClickable(true);
                        view.setImportantForAccessibility(2);
                        C786410Ut5.I7(new ACListenerS155S0100000_21(commentPageActionBarAssem, 198), view);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tuxTextView.getWidth(), tuxTextView.getHeight());
                        layoutParams.leftMargin = iArr[0];
                        layoutParams.topMargin = iArr[1];
                        viewGroup.addView(view, layoutParams);
                        commentPageActionBarAssem.LLLILZLLLI = view;
                        commentPageActionBarAssem.LLLJ = iCommentPageAbility;
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS100S0210000_21 awS100S0210000_21) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Prefetcher-group: not hit cache ");
        sbLIZ.append(((List) awS100S0210000_21.l0).size());
        sbLIZ.append(", miss = ");
        sbLIZ.append(((List) awS100S0210000_21.l1).size());
        sbLIZ.append(", forceFetch = ");
        sbLIZ.append(awS100S0210000_21.z2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS100S0210000_21 awS100S0210000_21) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Prefetcher-user: not hit cache ");
        sbLIZ.append(((List) awS100S0210000_21.l0).size());
        sbLIZ.append(", miss = ");
        sbLIZ.append(((List) awS100S0210000_21.l1).size());
        sbLIZ.append(", forceFetch = ");
        sbLIZ.append(awS100S0210000_21.z2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0210000_21(CommentPageActionBarAssem commentPageActionBarAssem, boolean z, ICommentPageAbility iCommentPageAbility, int i) {
        super(0);
        this.$t = i;
        this.l0 = commentPageActionBarAssem;
        this.z2 = z;
        this.l1 = iCommentPageAbility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS100S0210000_21(List list, List<String> list2, List<String> list3, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = list;
        this.l1 = list2;
        this.z2 = list3;
    }
}
