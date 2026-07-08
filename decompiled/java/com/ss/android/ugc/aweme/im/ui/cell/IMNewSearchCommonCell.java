package com.ss.android.ugc.aweme.im.ui.cell;

import X.AbstractC1240270iNd;
import X.C04TK;
import X.C1220000hqw;
import X.C1240530iO3;
import X.C1240570iO7;
import X.C13LE;
import X.C13LP;
import X.C14KQ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19ME;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C946803n0;
import X.InterfaceC1240540iO4;
import X.InterfaceC1631630sYr;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import Y.ACListenerS122S0200000_19;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi;
import com.ss.android.ugc.aweme.im.viewmodel.IMSearchDetailVM;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchGenericAbility;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class IMNewSearchCommonCell extends InboxSearchPowerCell<C1240530iO3> {
    public C427660Gpo LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public IDMAvatarLoader LLJ;
    public int LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public final C736950SvV LLJILJILJ = new C736950SvV(C13LE.LIZ(IMSearchDetailVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS257S0000000_19.get$arr$(179), null, null, null);

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerCell
    public final void I5(String str) {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cke;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        View view = this.itemView;
        this.LLILLJJLI = (C427660Gpo) view.findViewById(R.id.biz);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.p0w);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.ewz);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.jky);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.jpd);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.kiz);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.kjc);
        IMAvatarLoaderApi.LIZ.getClass();
        IMAvatarLoaderApi iMAvatarLoaderApi = C04TK.LIZIZ;
        C427660Gpo c427660Gpo = this.LLILLJJLI;
        if (c427660Gpo == null) {
            c427660Gpo = null;
        }
        this.LLJ = iMAvatarLoaderApi.LIZJ(c427660Gpo, "inbox_search");
        this.LLJI = C14KQ.LJIIIIZZ(view.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(92));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        InterfaceC1240540iO4 interfaceC1240540iO4;
        super.onViewAttachedToWindow();
        C1240530iO3 c1240530iO3 = (C1240530iO3) getItem();
        if (c1240530iO3 == null || (interfaceC1240540iO4 = c1240530iO3.LL) == null) {
            return;
        }
        interfaceC1240540iO4.LJIIIIZZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerCell
    public final void L5(View view) {
        InterfaceC1240540iO4 interfaceC1240540iO4;
        InterfaceC1631630sYr<View, IMSearchDetailVM, AbstractC1240270iNd, InboxSearchGenericAbility, Unit> interfaceC1631630sYrLJI;
        if (view == null) {
            return;
        }
        Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
        InterfaceC494301wD interfaceC494301wDLIZ = null;
        if (fragmentLIZ != null) {
            interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), InboxSearchGenericAbility.class, null);
        }
        C1240530iO3 c1240530iO3 = (C1240530iO3) getItem();
        if (c1240530iO3 != null && (interfaceC1240540iO4 = c1240530iO3.LL) != null && (interfaceC1631630sYrLJI = interfaceC1240540iO4.LJI()) != 0) {
            interfaceC1631630sYrLJI.invoke(view, this.LLJILJILJ.getValue(), this.LL, interfaceC494301wDLIZ);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(X.C1240530iO3 r7) {
        /*
            r6 = this;
            com.bytedance.tux.input.TuxTextView r4 = r6.LLIZLLLIL
            if (r4 != 0) goto L5
            return
        L5:
            boolean r0 = X.C286800BLy.LIZ()
            r1 = 8
            if (r0 != 0) goto L11
            X.C786410Ut5.LLLLZLL(r4, r1)
            return
        L11:
            java.lang.String r5 = r7.LLJI
            int r0 = r5.length()
            r3 = 0
            if (r0 != 0) goto L1e
            X.C786410Ut5.LLLLZLL(r4, r1)
            return
        L1e:
            int r0 = r5.hashCode()
            java.lang.String r1 = "local"
            switch(r0) {
                case -1101068021: goto L7b;
                case -554436100: goto L66;
                case -348894130: goto L5d;
                case 103145323: goto L56;
                case 1102769482: goto L4d;
                default: goto L27;
            }
        L27:
            r0 = -7829368(0xffffffffff888888, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r5, r0)
        L33:
            java.lang.Object r1 = r2.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r2.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r4.setText(r1)
            r4.setBackgroundColor(r0)
            X.C786410Ut5.LLLLZLL(r4, r3)
            return
        L4d:
            java.lang.String r0 = "client_muf"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L84
            goto L27
        L56:
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L84
            goto L27
        L5d:
            java.lang.String r0 = "client_group_member"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L84
            goto L27
        L66:
            java.lang.String r1 = "relation"
            boolean r0 = r5.equals(r1)
            if (r0 == 0) goto L27
            r0 = 1296871248(0x4d4caf50, float:2.1462758E8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r1, r0)
            goto L33
        L7b:
            java.lang.String r0 = "client_group"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L84
            goto L27
        L84:
            java.lang.String r2 = r7.LLJIJIL
            int r0 = r2.length()
            if (r0 <= 0) goto L9c
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "local|"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
        L9c:
            r0 = -1725851917(0xffffffff992196f3, float:-8.353989E-24)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r1, r0)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.ui.cell.IMNewSearchCommonCell.P5(X.0iO3):void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: S5, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void onBindItemView(C1240530iO3 c1240530iO3) {
        super.onBindItemView(c1240530iO3);
        InterfaceC1240540iO4 interfaceC1240540iO4 = c1240530iO3.LL;
        Function1<IDMAvatarLoader, Unit> function1LJIIJJI = interfaceC1240540iO4.LJIIJJI();
        C427660Gpo c427660Gpo = null;
        if (function1LJIIJJI != null) {
            IDMAvatarLoader iDMAvatarLoader = this.LLJ;
            if (iDMAvatarLoader == null) {
                iDMAvatarLoader = null;
            }
            function1LJIIJJI.invoke(iDMAvatarLoader);
        }
        U5(interfaceC1240540iO4);
        T5(interfaceC1240540iO4);
        C427660Gpo c427660Gpo2 = this.LLILLJJLI;
        if (c427660Gpo2 != null) {
            c427660Gpo = c427660Gpo2;
        }
        C786410Ut5.T8(c427660Gpo, new ACListenerS122S0200000_19(this, interfaceC1240540iO4, 51));
        P5(c1240530iO3);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T5(X.InterfaceC1240540iO4 r10) {
        /*
            r9 = this;
            kotlin.jvm.functions.Function2 r2 = r10.LJII()
            com.bytedance.tux.input.TuxTextView r1 = r9.LLILZ
            r3 = 0
            if (r1 == 0) goto Lc0
            if (r2 == 0) goto Lc0
            int r0 = r9.LLJI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r7 = r2.invoke(r1, r0)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
        L17:
            com.bytedance.tux.input.TuxTextView r6 = r9.LLILZ
            if (r6 == 0) goto Lbd
            int r5 = r9.LLJI
            android.view.View r0 = r9.itemView
            android.content.Context r8 = r0.getContext()
            X.0iNQ r0 = r10.LIZIZ()
            int r2 = r0.LIZ
            com.bytedance.tux.input.TuxTextView r4 = r9.LLJILJIL
            if (r4 != 0) goto L42
            com.bytedance.tux.input.TuxTextView r4 = new com.bytedance.tux.input.TuxTextView
            r1 = 6
            r0 = 0
            r4.<init>(r8, r3, r1, r0)
            X.19ME r1 = new X.19ME
            r0 = -2
            r1.<init>(r0, r0)
            X.C786410Ut5.R6(r4, r1)
            r4.setTuxFont(r2)
            r9.LLJILJIL = r4
        L42:
            kotlin.jvm.internal.AwS420S0200000_19 r2 = new kotlin.jvm.internal.AwS420S0200000_19
            r0 = 93
            r2.<init>(r6, r7, r0)
            kotlin.jvm.internal.AwS563S0100000_19 r1 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 1521(0x5f1, float:2.131E-42)
            r1.<init>(r6, r0)
            int r6 = R5(r5, r4, r7, r2, r1)
        L54:
            boolean r0 = r10.LJFF()
            if (r0 == 0) goto Lb4
            kotlin.jvm.functions.Function0 r0 = r10.LJ()
            if (r0 == 0) goto Lb2
            java.lang.Object r5 = r0.invoke()
            java.lang.String r5 = (java.lang.String) r5
        L66:
            com.bytedance.tux.input.TuxTextView r0 = r9.LLIZ
            if (r0 != 0) goto L6b
            r0 = r3
        L6b:
            X.C337180DJs.LIZ(r0)
            android.view.View r0 = r9.itemView
            android.content.Context r1 = r0.getContext()
            X.0iNQ r0 = r10.LIZIZ()
            r0.getClass()
            com.bytedance.tux.input.TuxTextView r4 = r9.V5(r1)
            kotlin.jvm.internal.AwS168S1100000_19 r2 = new kotlin.jvm.internal.AwS168S1100000_19
            r0 = 1
            r2.<init>(r9, r5, r0)
            kotlin.jvm.internal.AwS563S0100000_19 r1 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 1522(0x5f2, float:2.133E-42)
            r1.<init>(r9, r0)
            int r6 = R5(r6, r4, r5, r2, r1)
        L90:
            kotlin.jvm.functions.Function2 r2 = r10.LJIIL()
            if (r2 == 0) goto La7
            com.bytedance.tux.input.TuxTextView r1 = r9.LLILZIL
            if (r1 != 0) goto L9b
            r1 = r3
        L9b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object r1 = r2.invoke(r1, r0)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 != 0) goto La9
        La7:
            java.lang.String r1 = ""
        La9:
            com.bytedance.tux.input.TuxTextView r0 = r9.LLILZIL
            if (r0 == 0) goto Lae
            r3 = r0
        Lae:
            r3.setText(r1)
            return
        Lb2:
            r5 = r3
            goto L66
        Lb4:
            com.bytedance.tux.input.TuxTextView r0 = r9.LLILZLL
            if (r0 != 0) goto Lb9
            r0 = r3
        Lb9:
            X.C337180DJs.LIZ(r0)
            goto L90
        Lbd:
            int r6 = r9.LLJI
            goto L54
        Lc0:
            r7 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.ui.cell.IMNewSearchCommonCell.T5(X.0iO4):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U5(X.InterfaceC1240540iO4 r11) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.ui.cell.IMNewSearchCommonCell.U5(X.0iO4):void");
    }

    public final TuxTextView V5(Context context) {
        TuxTextView tuxTextView = this.LLJIJIL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        C786410Ut5.R6(tuxTextView2, new C19ME(-2, -2));
        tuxTextView2.setTuxFont(61);
        this.LLJIJIL = tuxTextView2;
        return tuxTextView2;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1240570iO7 c1240570iO7;
        Function1<IDMAvatarLoader, Unit> function1LJIIJJI;
        C1240530iO3 c1240530iO3 = (C1240530iO3) interfaceC1891350zJl;
        super.onBindItemView(c1240530iO3);
        InterfaceC1240540iO4 interfaceC1240540iO4 = c1240530iO3.LL;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        C427660Gpo c427660Gpo = null;
        if (!(objLJJJLZIJ instanceof C1240570iO7) || (c1240570iO7 = (C1240570iO7) objLJJJLZIJ) == null) {
            c1240570iO7 = new C1240570iO7(true, true, true);
        }
        if (c1240570iO7.LIZ && (function1LJIIJJI = interfaceC1240540iO4.LJIIJJI()) != null) {
            IDMAvatarLoader iDMAvatarLoader = this.LLJ;
            if (iDMAvatarLoader == null) {
                iDMAvatarLoader = null;
            }
            function1LJIIJJI.invoke(iDMAvatarLoader);
        }
        if (c1240570iO7.LIZIZ) {
            U5(interfaceC1240540iO4);
        }
        if (c1240570iO7.LIZJ) {
            T5(interfaceC1240540iO4);
        }
        C427660Gpo c427660Gpo2 = this.LLILLJJLI;
        if (c427660Gpo2 != null) {
            c427660Gpo = c427660Gpo2;
        }
        C786410Ut5.T8(c427660Gpo, new ACListenerS122S0200000_19(this, interfaceC1240540iO4, 51));
        P5(c1240530iO3);
    }

    public static int R5(int i, TuxTextView tuxTextView, CharSequence charSequence, Function0 function0, Function0 function02) {
        if (charSequence != null && charSequence.length() != 0) {
            tuxTextView.setText(charSequence);
            tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(100000, 0), View.MeasureSpec.makeMeasureSpec(100000, 0));
            int measuredWidth = tuxTextView.getMeasuredWidth();
            function0.invoke();
            if (measuredWidth != 0) {
                return (i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))) - measuredWidth;
            }
            return i;
        }
        function02.invoke();
        return i;
    }
}
