package com.ss.android.ugc.aweme.inbox.bulletin.assem.poll;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C09M6;
import X.C0I7D;
import X.C0OOC;
import X.C0OPX;
import X.C0OU6;
import X.C0P4P;
import X.C0P4W;
import X.C1220000hqw;
import X.C13E8;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C620710OWf;
import X.C620750OWj;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import Y.ACListenerS113S0200000_9;
import Y.ACListenerS144S0100000_9;
import Y.ACListenerS76S0300000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.inbox.bulletin.setting.Configuration;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollCreateViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPollOption;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class PollCreateContentAssem extends UISlotAssem {
    public static final int LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public static final int LLJJJ;
    public static final int[] LLJJJIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C0OOC.class, "bulletin_board_poll_create_param"), checkSupervisorPrepared());
    public final C736950SvV LLJJIII;
    public final C13E8<View> LLJJIJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a7p;
    }

    static {
        C01GW c01gw = C620750OWj.LIZIZ;
        LLJJIJIIJIL = ((Configuration) c01gw.getValue()).titleCharacterMax;
        LLJJIJIL = ((Configuration) c01gw.getValue()).optionCountMin;
        LLJJJ = ((Configuration) c01gw.getValue()).optionTextCharacterMax;
        LLJJJIL = new int[]{1, 3, 5};
    }

    public final BulletinPollCreateViewModel kp() {
        return (BulletinPollCreateViewModel) this.LLJJIII.getValue();
    }

    public PollCreateContentAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 455);
        this.LLJJIII = new C736950SvV(C13LE.LIZ(BulletinPollCreateViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(260), new AwS553S0100000_9((AbstractC738140SxQ) this, 456), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJIJI = new C13E8<>();
    }

    public final String ip(int i) {
        Context context = getContext();
        if (context != null) {
            return C786410Ut5.j4(context.getResources().getQuantityString(2131755119, i), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int size;
        int i;
        C620710OWf c620710OWf;
        String str;
        List<String> list;
        String str2;
        super.onViewCreated(view);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem onViewCreated ");
        sbLIZ.append(kp());
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        final C0I7D c0i7d = (C0I7D) view.findViewById(R.id.d33);
        int i2 = LLJJIJIIJIL;
        c0i7d.setFilters(new C09M6[]{new C09M6(i2, C724240Sb0.LJI(this))});
        lp((TextView) view.findViewById(R.id.d32), 0, i2);
        c0i7d.setOnFocusChangeListener(new C0P4P(view, 1));
        c0i7d.addTextChangedListener(new C0P4W(view, this, 1));
        c0i7d.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.0OWi
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                if (z) {
                    c0i7d.requestFocus();
                    C340780DXo.LIZJ(c0i7d);
                    c0i7d.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                }
            }
        });
        C620710OWf c620710OWf2 = kp().LLILZIL;
        if (c620710OWf2 != null && (str2 = c620710OWf2.LIZ) != null && C0OU6.LIZ() && (true ^ a0.LJJJIL(str2))) {
            c0i7d.setText(str2);
        }
        if (C0OU6.LIZ()) {
            C620710OWf c620710OWf3 = kp().LLILZIL;
            if (c620710OWf3 != null && (list = c620710OWf3.LIZIZ) != null) {
                size = list.size();
            } else {
                size = LLJJIJIL;
            }
            int i3 = LLJJIJIL;
            if (size <= i3) {
                size = i3;
            }
        } else {
            size = LLJJIJIL;
        }
        for (int i4 = 0; i4 < size; i4++) {
            C620710OWf c620710OWf4 = kp().LLILZIL;
            if (c620710OWf4 != null && C0OU6.LIZ() && i4 < c620710OWf4.LIZIZ.size()) {
                str = (String) C13LP.LJJJLZIJ(i4, c620710OWf4.LIZIZ);
            } else {
                str = null;
            }
            hp(view, str);
        }
        C786410Ut5.R7((LinearLayout) view.findViewById(R.id.d2l), new ACListenerS113S0200000_9(this, view, 11));
        if (C0OU6.LIZ() && (c620710OWf = kp().LLILZIL) != null) {
            i = c620710OWf.LIZJ;
        } else {
            i = LLJJJIL[0];
        }
        String strIp = ip(i);
        kp().LLILZ = i;
        ((TextView) getContentView().findViewById(R.id.d2v)).setText(strIp);
        C786410Ut5.R7((LinearLayout) view.findViewById(R.id.d2w), new ACListenerS144S0100000_9(this, 44));
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0OWh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OVX) obj).LL;
            }
        }, null, new AwS623S0100000_9(view, 55), 6);
    }

    public final void hp(View view, String str) {
        String str2 = str;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.d2x);
        BulletinPollCreateViewModel bulletinPollCreateViewModelKp = kp();
        int i = bulletinPollCreateViewModelKp.LLILLJJLI;
        int i2 = i + 1;
        bulletinPollCreateViewModelKp.LLILLJJLI = i2;
        ((ArrayList) bulletinPollCreateViewModelKp.LLILLL).add(new BulletinPollOption(0L, "", 0L, Boolean.FALSE, null));
        if (bulletinPollCreateViewModelKp.LLILLJJLI >= BulletinPollCreateViewModel.LLILZLL) {
            bulletinPollCreateViewModelKp.setState(AFwS240S0000000_9.get$arr$(859));
        }
        View viewLJIILJJIL = this.LLJJIJI.LJIILJJIL();
        int i3 = 0;
        if (viewLJIILJJIL == null) {
            Context context = getContext();
            if (context != null) {
                viewLJIILJJIL = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.a7q, viewGroup, false);
                TextView textView = (TextView) viewLJIILJJIL.findViewById(R.id.pq0);
                int i4 = LLJJJ;
                textView.setFilters(new C09M6[]{new C09M6(i4, C724240Sb0.LJI(this))});
                lp((TextView) viewLJIILJJIL.findViewById(R.id.ppy), 0, i4);
                textView.setOnFocusChangeListener(new C0P4P(viewLJIILJJIL, 2));
                textView.addTextChangedListener(new C0P4W(viewLJIILJJIL, this, 2));
                C786410Ut5.a9((TuxIconView) viewLJIILJJIL.findViewById(R.id.pq1), new ACListenerS76S0300000_9(viewLJIILJJIL, viewGroup, this, 6));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        viewLJIILJJIL.setTag(R.id.d2y, Integer.valueOf(i));
        EditText editText = (EditText) viewLJIILJJIL.findViewById(R.id.pq0);
        if (str2 == null) {
            str2 = "";
        }
        if (!C0OU6.LIZ()) {
            editText.setText("");
        } else {
            editText.setText(str2);
            if (!a0.LJJJIL(str2)) {
                editText.setSelection(str2.length());
            }
        }
        TextView textView2 = (TextView) viewLJIILJJIL.findViewById(R.id.pq0);
        Context context2 = viewGroup.getContext();
        if (context2 != null) {
            textView2.setHint(C786410Ut5.j4(context2.getString(2131827963), Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
            int i5 = LLJJIJIL;
            if (i >= i5) {
                viewLJIILJJIL.findViewById(R.id.pq0).requestFocus();
            }
            TuxIconView tuxIconView = (TuxIconView) viewLJIILJJIL.findViewById(R.id.pq1);
            if (i < i5) {
                i3 = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i3);
            viewGroup.addView(viewLJIILJJIL);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void lp(TextView textView, int i, int i2) {
        Context context = getContext();
        if (context != null) {
            textView.setText(C786410Ut5.j4(context.getString(2131827964), Arrays.copyOf(new Object[]{String.valueOf(i), String.valueOf(i2)}, 2)));
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
