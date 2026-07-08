package kotlin.jvm.internal;

import X.C09AY;
import X.C418440Gaw;
import X.C426750GoL;
import X.C448500HiK;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotRecallVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.AIGroupShotCardTemplate;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class AwS15S0410000_6 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

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

    public static final Object invoke$0(AwS15S0410000_6 awS15S0410000_6) {
        if (awS15S0410000_6.z4) {
            ((AIGroupShotRecallVM) ((C736950SvV) awS15S0410000_6.l3).getValue()).vQ2((C869590Y9l) awS15S0410000_6.l0, (AIGroupShotCardTemplate) awS15S0410000_6.l1, ((SessionInfo) awS15S0410000_6.l2).getChatType());
        } else {
            ((AIGroupShotRecallVM) ((C736950SvV) awS15S0410000_6.l3).getValue()).wQ2((C869590Y9l) awS15S0410000_6.l0, (AIGroupShotCardTemplate) awS15S0410000_6.l1, ((SessionInfo) awS15S0410000_6.l2).getChatType());
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS15S0410000_6 awS15S0410000_6) {
        C786410Ut5.LJLLLLLL(8, (ImageView) awS15S0410000_6.l0);
        TuxTextView tuxTextView = (TuxTextView) awS15S0410000_6.l1;
        boolean z = awS15S0410000_6.z4;
        Context context = (Context) awS15S0410000_6.l2;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) awS15S0410000_6.l3;
        if (z ^ C426750GoL.LIZLLL(context)) {
            tuxTextView.setCompoundDrawablesWithIntrinsicBounds(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
            C426750GoL.LJIIJJI(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), false);
        } else {
            tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, bitmapDrawable, (Drawable) null);
            C426750GoL.LJIIJJI(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), false);
        }
        tuxTextView.setTuxFont(102);
        tuxTextView.setBackgroundResource(R.drawable.aqb);
        tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        tuxTextView.setTextSize(16.0f);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0410000_6(ImageView imageView, TuxTextView tuxTextView, boolean z, Context context, BitmapDrawable bitmapDrawable, int i) {
        super(0);
        this.$t = i;
        this.l0 = imageView;
        this.l1 = tuxTextView;
        this.z4 = z;
        this.l2 = context;
        this.l3 = bitmapDrawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS15S0410000_6(boolean z, boolean z2, C869590Y9l c869590Y9l, AIGroupShotCardTemplate aIGroupShotCardTemplate, SessionInfo sessionInfo, C736950SvV<C448500HiK, AIGroupShotRecallVM> c736950SvV) {
        super(0);
        this.$t = c736950SvV;
        this.z4 = z;
        this.l0 = z2;
        this.l1 = c869590Y9l;
        this.l2 = aIGroupShotCardTemplate;
        this.l3 = sessionInfo;
    }
}
