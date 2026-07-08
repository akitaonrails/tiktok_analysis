package kotlin.jvm.internal;

import X.C09AY;
import X.C0H75;
import X.C0H76;
import X.C118300cf;
import X.C13LZ;
import X.C1619980sG4;
import X.C2188811AlT;
import X.C371330Eh9;
import X.C418440Gaw;
import X.C426750GoL;
import X.C450980HmK;
import X.C451760Hna;
import X.C455190Ht7;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817403Hg;
import X.InterfaceC455210Ht9;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ALAdapterS3S0200000_6;
import Y.ARunnableS75S0200000_6;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.poll.PollCreateFragment;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.impl.ui.StickerGridAdapter;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class AwS133S0201000_6 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
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
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS133S0201000_6 awS133S0201000_6) {
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        int width;
        int iLIZIZ;
        LinearLayoutManager linearLayoutManager2;
        RecyclerView.LayoutManager layoutManager = ((C451760Hna) awS133S0201000_6.l0).getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        } else {
            iFindFirstVisibleItemPosition = 0;
        }
        RecyclerView.LayoutManager layoutManager2 = ((C451760Hna) awS133S0201000_6.l0).getLayoutManager();
        if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager2) != null) {
            iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
        } else {
            iFindLastVisibleItemPosition = 0;
        }
        int[] iArr = new int[2];
        View viewFindViewById = ((C451760Hna) awS133S0201000_6.l0).getChildAt(C13LZ.LJ(((C451760Hna) awS133S0201000_6.l0).getLastPos(), iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition) - iFindFirstVisibleItemPosition).findViewById(R.id.l8u);
        viewFindViewById.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        ((C371330Eh9) awS133S0201000_6.l1).getLocationInWindow(iArr2);
        int i = iArr2[0] - iArr[0];
        C371330Eh9 c371330Eh9 = (C371330Eh9) awS133S0201000_6.l1;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c371330Eh9);
        c371330Eh9.setTranslationX(-i);
        ((C371330Eh9) awS133S0201000_6.l1).animate().setInterpolator(C1619980sG4.LIZLLL()).translationX(0.0f).setDuration(250L).setListener(new ALAdapterS3S0200000_6(viewFindViewById, (C371330Eh9) awS133S0201000_6.l1, 0)).start();
        int[] iArr3 = new int[2];
        int i2 = awS133S0201000_6.i2;
        if (i2 >= iFindFirstVisibleItemPosition) {
            View childAt = ((C451760Hna) awS133S0201000_6.l0).getChildAt(i2 - iFindFirstVisibleItemPosition);
            childAt.getLocationInWindow(iArr3);
            if (C426750GoL.LJ((C451760Hna) awS133S0201000_6.l0)) {
                width = iArr3[0] + childAt.getWidth();
            } else {
                width = iArr3[0];
            }
            if (C426750GoL.LJ((C451760Hna) awS133S0201000_6.l0)) {
                iLIZIZ = ((C451760Hna) awS133S0201000_6.l0).getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }
            ((C451760Hna) awS133S0201000_6.l0).smoothScrollBy(width - iLIZIZ, 0, C1619980sG4.LIZLLL(), 250);
        } else {
            ((C451760Hna) awS133S0201000_6.l0).scrollToPosition(i2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS133S0201000_6 awS133S0201000_6) {
        ViewGroup.LayoutParams layoutParams;
        PollCreateFragment pollCreateFragment = (PollCreateFragment) awS133S0201000_6.l0;
        View view = (View) awS133S0201000_6.l1;
        int i = awS133S0201000_6.i2;
        pollCreateFragment.getClass();
        if (i > 0 && (layoutParams = view.getLayoutParams()) != null && layoutParams.height != i) {
            layoutParams.height = i;
            C786410Ut5.W5(view, layoutParams);
        }
        ((PollCreateFragment) awS133S0201000_6.l0).dS();
        ((PollCreateFragment) awS133S0201000_6.l0).nS();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS133S0201000_6 awS133S0201000_6) {
        InterfaceC455210Ht9 interfaceC455210Ht9 = ((C455190Ht7) awS133S0201000_6.l0).LLILZ;
        if (interfaceC455210Ht9 != null) {
            interfaceC455210Ht9.LIZIZ(awS133S0201000_6.i2, (StickerItem) awS133S0201000_6.l1);
        }
        ((C455190Ht7) awS133S0201000_6.l0).performClick();
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7 A[PHI: r3
      0x00d7: PHI (r3v8 java.lang.String) = (r3v6 java.lang.String), (r3v9 java.lang.String) binds: [B:42:0x00d5, B:36:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS133S0201000_6 r22) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS133S0201000_6.invoke$3(kotlin.jvm.internal.AwS133S0201000_6):java.lang.Object");
    }

    public static final Object invoke$4(AwS133S0201000_6 awS133S0201000_6) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trimOriginContentWithChevron-> trimmed index: ");
        sbLIZ.append(((C118300cf) awS133S0201000_6.l0).element);
        sbLIZ.append(", maxTextWidth: ");
        sbLIZ.append(awS133S0201000_6.i2);
        sbLIZ.append(", trimmedTextWidth: ");
        sbLIZ.append(((C817403Hg) awS133S0201000_6.l1).element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS133S0201000_6 awS133S0201000_6) {
        int width;
        int width2;
        if (((View) awS133S0201000_6.l0).getMeasuredWidth() > 0) {
            width = ((View) awS133S0201000_6.l0).getMeasuredWidth();
        } else {
            width = ((View) awS133S0201000_6.l0).getWidth();
        }
        if (((TextView) awS133S0201000_6.l1).getMeasuredWidth() > 0) {
            width2 = ((TextView) awS133S0201000_6.l1).getMeasuredWidth();
        } else {
            width2 = ((TextView) awS133S0201000_6.l1).getWidth();
        }
        if (width > 0 && width2 > 0) {
            int i = width - width2;
            if (i < 0) {
                i = 0;
            }
            int i2 = awS133S0201000_6.i2 - i;
            if (i2 >= 0 && i2 > 0 && ((TextView) awS133S0201000_6.l1).getMaxWidth() != i2) {
                ((TextView) awS133S0201000_6.l1).setMaxWidth(i2);
                ((View) awS133S0201000_6.l0).requestLayout();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* bridge */ /* synthetic */ Object invoke$6(AwS133S0201000_6 awS133S0201000_6) {
        ((C0H75) awS133S0201000_6.l0).LLILLJJLI.put((D) awS133S0201000_6.l1, Integer.valueOf(awS133S0201000_6.i2));
        C786410Ut5.LJJZZIII((Handler) ((C0H75) awS133S0201000_6.l0).LLILLL.getValue(), new ARunnableS75S0200000_6((C0H75) awS133S0201000_6.l0, awS133S0201000_6.l1, 120));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0201000_6(int i, C817403Hg c817403Hg, C118300cf c118300cf, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c118300cf;
        this.i2 = i;
        this.l1 = c817403Hg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0201000_6(int i, View view, TuxTextView tuxTextView, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = view;
        this.l1 = tuxTextView;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS133S0201000_6(C0H75 c0h75, C0H75<Object, C0H76> c0h752, Object obj, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0h75;
        this.l1 = c0h752;
        this.i2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0201000_6(C451760Hna c451760Hna, C371330Eh9 c371330Eh9, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c451760Hna;
        this.l1 = c371330Eh9;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0201000_6(C455190Ht7 c455190Ht7, StickerItem stickerItem, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c455190Ht7;
        this.l1 = stickerItem;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0201000_6(PollCreateFragment pollCreateFragment, View view, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = pollCreateFragment;
        this.l1 = view;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS133S0201000_6(StickerGridAdapter stickerGridAdapter, int i, C450980HmK c450980HmK, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = stickerGridAdapter;
        this.i2 = i;
        this.l1 = c450980HmK;
    }
}
