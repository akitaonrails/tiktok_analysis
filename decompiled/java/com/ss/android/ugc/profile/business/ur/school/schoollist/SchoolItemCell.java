package com.ss.android.ugc.profile.business.ur.school.schoollist;

import X.C01GW;
import X.C1217250hmV;
import X.C1266090j3H;
import X.C13LE;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C860700Xpc;
import X.C948503nH;
import X.InterfaceC1217240hmU;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolItemCell extends PowerCell<C1217250hmV> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public TuxTextView LLILLJJLI;
    public final C1266090j3H LL = new C1266090j3H(this, 7);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2435));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(515));
    public final SpannableStringBuilder LLILZIL = new SpannableStringBuilder();
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2436));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SchoolItemCell.class, "control", "getControl()Lcom/ss/android/ugc/profile/business/ur/school/schoollist/SchoolItemControl;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final InterfaceC1217240hmU I5() {
        return (InterfaceC1217240hmU) this.LL.getValue(this, LLIZ[0]);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1217250hmV c1217250hmV = (C1217250hmV) interfaceC1891350zJl;
        super.onBindItemView(c1217250hmV);
        this.LLILZIL.clear();
        this.LLILZIL.append((CharSequence) c1217250hmV.LL.LIZ);
        Pair<Integer, Integer> pair = c1217250hmV.LLILLJJLI;
        if (pair != null) {
            C786410Ut5.q2(this.LLILZIL, this.LLILLL.getValue(), pair.getFirst().intValue(), pair.getSecond().intValue(), 17);
            C786410Ut5.q2(this.LLILZIL, this.LLILZ.getValue(), pair.getFirst().intValue(), pair.getSecond().intValue(), 17);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(this.LLILZIL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView.setTuxFont(41);
        tuxTextView.setTextDirection(5);
        tuxTextView.setTextAlignment(5);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 16);
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        frameLayout.addView(tuxTextView, layoutParams);
        this.LLILLJJLI = tuxTextView;
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(55))));
        C786410Ut5.O7(frameLayout, (View.OnClickListener) this.LLILZLL.getValue());
        C427690Gpr.LJ(frameLayout, 0.0f);
        C948503nH.LJII(frameLayout, new C860700Xpc(this, null));
        return frameLayout;
    }
}
