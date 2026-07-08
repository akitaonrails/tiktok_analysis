package kotlin.jvm.internal;

import X.C07GL;
import X.C09AY;
import X.C0H1U;
import X.C0H42;
import X.C118300cf;
import X.C12ES;
import X.C23271099x;
import X.C259800zU;
import X.C436000H7u;
import X.C786410Ut5;
import X.C948503nH;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoCommentAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AwS6S0800000_6 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$0(AwS6S0800000_6 awS6S0800000_6, Object obj, Object obj2) {
        String text;
        SearchVideoCommentAssem searchVideoCommentAssem = (SearchVideoCommentAssem) obj;
        Comment comment = (Comment) obj2;
        ((C118300cf) awS6S0800000_6.l0).element = 1;
        if (comment != null && (text = comment.getText()) != null) {
            ISearchVideoHolderAbility iSearchVideoHolderAbility = (ISearchVideoHolderAbility) searchVideoCommentAssem.LLJJJJLIIL.getValue();
            if (iSearchVideoHolderAbility != null) {
                iSearchVideoHolderAbility.Ri1(new C436000H7u(120, 0.5f));
            }
            View view = (View) ((C259800zU) awS6S0800000_6.l1).element;
            if (view != null) {
                C12ES.LJIILL(0, view);
            }
            if (((Number) C07GL.LIZ.getValue()).intValue() == 1) {
                TextView textView = (TextView) ((C259800zU) awS6S0800000_6.l2).element;
                if (textView != null) {
                    textView.setText(text);
                }
                View view2 = (View) ((C259800zU) awS6S0800000_6.l3).element;
                if (view2 != null) {
                    C786410Ut5.T4(view2, 1.0f);
                }
                View view3 = (View) ((C259800zU) awS6S0800000_6.l4).element;
                if (view3 != null) {
                    C786410Ut5.T4(view3, 0.0f);
                }
                TuxTextView tuxTextView = (TuxTextView) ((C259800zU) awS6S0800000_6.l5).element;
                if (tuxTextView != null) {
                    C948503nH.LJ(searchVideoCommentAssem, C23271099x.INSTANCE, new C0H42(tuxTextView, (C259800zU) awS6S0800000_6.l6, text, (C259800zU) awS6S0800000_6.l7, searchVideoCommentAssem, comment, null));
                }
            }
        } else {
            ISearchVideoHolderAbility iSearchVideoHolderAbility2 = (ISearchVideoHolderAbility) searchVideoCommentAssem.LLJJJJLIIL.getValue();
            if (iSearchVideoHolderAbility2 != null) {
                iSearchVideoHolderAbility2.Ri1(null);
            }
            View view4 = (View) ((C259800zU) awS6S0800000_6.l1).element;
            if (view4 != null) {
                C0H1U.LIZIZ(view4);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS6S0800000_6 r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS6S0800000_6.invoke$1(kotlin.jvm.internal.AwS6S0800000_6, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS6S0800000_6(C118300cf c118300cf, C118300cf c118300cf2, C259800zU<View> c259800zU, C259800zU<TuxTextView> c259800zU2, C259800zU<View> c259800zU3, C259800zU<View> c259800zU4, C259800zU<TuxTextView> c259800zU5, C259800zU<View> c259800zU6, C259800zU<String> c259800zU7) {
        super(2);
        this.$t = c259800zU7;
        this.l0 = c118300cf;
        this.l1 = c118300cf2;
        this.l2 = c259800zU;
        this.l3 = c259800zU2;
        this.l4 = c259800zU3;
        this.l5 = c259800zU4;
        this.l6 = c259800zU5;
        this.l7 = c259800zU6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0800000_6(View view, View view2, View view3, ImageView imageView, ImageView imageView2, TuxTextView tuxTextView, TuxTextView tuxTextView2, TuxTextView tuxTextView3, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = view3;
        this.l3 = tuxTextView;
        this.l4 = tuxTextView2;
        this.l5 = tuxTextView3;
        this.l6 = imageView;
        this.l7 = imageView2;
    }
}
