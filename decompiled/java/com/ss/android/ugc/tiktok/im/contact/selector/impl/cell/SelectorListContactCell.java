package com.ss.android.ugc.tiktok.im.contact.selector.impl.cell;

import X.C01GW;
import X.C020N;
import X.C03H5;
import X.C0HZQ;
import X.C0I1R;
import X.C0NYY;
import X.C0QSJ;
import X.C0ZK1;
import X.C0ZKF;
import X.C0ZP4;
import X.C1196320hEk;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1223620hwm;
import X.C1224280hxq;
import X.C1224400hy2;
import X.C1224840hyk;
import X.C1383370m6R;
import X.C13LE;
import X.C1584506Ih;
import X.C1770850wBP;
import X.C1841350y17;
import X.C19474211Gy;
import X.C2020707vp;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C687700QyG;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1224830hyj;
import X.EnumC992630bwD;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1224750hyb;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC897330ZId;
import X.ViewOnLongClickListenerC1265920j30;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorListContactCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;
import wh6.AbS700S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public class SelectorListContactCell extends PowerCell<C1224840hyk> implements InterfaceC724530SbT, InterfaceC713360RyY, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public String LLJILJILJ;
    public Lifecycle LLJILLL;
    public volatile InterfaceC1224750hyb LLJJI;
    public InterfaceC665370Q7z LLJJIII;
    public C0QSJ LLJJIJI;
    public final C01GW LL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(579));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2645));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2641));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2637));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2635));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2636));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2643));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2640));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2642));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2638));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2644));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2639));
    public final LifecycleEventObserver LLJJ = new LifecycleEventObserver() { // from class: com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorListContactCell$tabResumeObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            int i = C2020707vp.LIZ[event.ordinal()];
            if (i != 1) {
                if (i == 2 && this.LL.LLJILLL == lifecycleOwner.getLifecycle()) {
                    this.LL.LLJILLL = null;
                    return;
                }
                return;
            }
            C1224840hyk item = this.LL.getItem();
            if (item == null) {
                return;
            }
            this.LL.W5(item);
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectorListContactCell.class, "selectorContainerAbility", "getSelectorContainerAbility()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/ability/ISelectorContainerAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ContactSelectorFragmentScope.class});
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.aea;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactSelectorFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    public final C0HZQ R5() {
        return (C0HZQ) this.LLJI.getValue();
    }

    public final TuxTextView S5() {
        return (TuxTextView) this.LLIZLLLIL.getValue();
    }

    public final C1224280hxq T5() {
        return (C1224280hxq) this.LLILLL.getValue();
    }

    public final C1841350y17 U5() {
        return (C1841350y17) this.LLJIJIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1224750hyb V5() {
        /*
            r4 = this;
            X.0hyb r0 = r4.LLJJI
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0hyb r0 = r4.LLJJI     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJIJI     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJIII     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIII = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope> r1 = com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIJI = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0hyb> r0 = X.InterfaceC1224750hyb.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0hyb r0 = (X.InterfaceC1224750hyb) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJI = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorListContactCell.V5():X.0hyb");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        InterfaceC1224750hyb interfaceC1224750hybV5;
        InterfaceC897330ZId interfaceC897330ZIdIN2;
        C786410Ut5.I7(new AbS700S0100000_19(this, 5), this.itemView);
        if (T5().LJ().LJJIZ().LIZLLL() && (interfaceC1224750hybV5 = V5()) != null && (interfaceC897330ZIdIN2 = interfaceC1224750hybV5.IN2()) != null) {
            interfaceC897330ZIdIN2.LIZIZ(true, new C0NYY() { // from class: X.0hyg
                @Override // X.C0NYY
                public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                    C1224840hyk item = this.LL.getItem();
                    if (item != null) {
                        SelectorListContactCell selectorListContactCell = this.LL;
                        if (map.containsKey(item.LLILZ)) {
                            selectorListContactCell.X5(item, C896480ZEw.LIZJ(map.get(item.LLILZ)));
                        }
                    }
                    return Unit.LIZ;
                }
            });
        }
        if (C1223620hwm.LJFF()) {
            this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1265920j30(this, 2));
        }
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C1224840hyk item = getItem();
        if (item != null) {
            W5(item);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        ((IDMAvatarLoader) this.LLILZ.getValue()).LIZ();
        Lifecycle lifecycle = this.LLJILLL;
        if (lifecycle != null) {
            lifecycle.removeObserver(this.LLJJ);
        }
        this.LLJILLL = null;
        this.LLJILJILJ = null;
    }

    public final void I5(C1224840hyk c1224840hyk) {
        String str = c1224840hyk.LLILLL;
        if (Intrinsics.LJFF(str, "group")) {
            ((IDMAvatarLoader) this.LLILZ.getValue()).LIZLLL(c1224840hyk.LLILZ, null, c1224840hyk.LLILZIL, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
        } else {
            if (!Intrinsics.LJFF(str, "private")) {
                return;
            }
            ((IDMAvatarLoader) this.LLILZ.getValue()).LIZIZ(c1224840hyk.LLILZ, c1224840hyk.LLILZIL, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
        }
    }

    public final void L5(C1224840hyk c1224840hyk) {
        boolean z;
        String str = c1224840hyk.LLIZ;
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextViewS5 = S5();
            C0I1R.LIZ(tuxTextViewS5, c1224840hyk.LLIZ, c1224840hyk.LLJIJIL, C960203pA.LIZ(R.attr.a04, tuxTextViewS5.getContext()));
        }
        TuxTextView tuxTextView = (TuxTextView) this.LLIZ.getValue();
        C0I1R.LIZ(tuxTextView, c1224840hyk.LLILZLL, c1224840hyk.LLJIJIL, C960203pA.LIZ(R.attr.a04, tuxTextView.getContext()));
    }

    public final void N5(C1224840hyk c1224840hyk) {
        String strLJIIJ;
        if (!c1224840hyk.LLJ) {
            C1584506Ih.LIZ(U5());
            C1584506Ih.LIZ(R5());
        } else {
            int i = C1224400hy2.LIZ[T5().LJ().LJJIZ().LIZJ().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    C1584506Ih.LIZ(R5());
                    C1584506Ih.LIZ(U5());
                } else {
                    C1584506Ih.LIZ(R5());
                    C1584506Ih.LIZIZ(U5());
                    U5().setClickable(false);
                    ((View) this.LLIZ.getValue()).setLabelFor(R5().getId());
                }
            } else {
                C1584506Ih.LIZ(U5());
                C1584506Ih.LIZIZ(R5());
                R5().setClickable(false);
                ((View) this.LLIZ.getValue()).setLabelFor(U5().getId());
            }
        }
        U5().setChecked(c1224840hyk.LLJILJIL);
        R5().setChecked(c1224840hyk.LLJILJIL);
        View view = this.itemView;
        if (c1224840hyk.LLJILJIL) {
            strLJIIJ = C1383370m6R.LJIIJ(2131824462);
        } else {
            strLJIIJ = C1383370m6R.LJIIJ(2131824457);
        }
        q0.LJJIFFI(view, strLJIIJ);
    }

    public final void P5(C1224840hyk c1224840hyk) {
        boolean z;
        if (c1224840hyk.LLILLJJLI == EnumC1224830hyj.HIGHER) {
            z = true;
        } else {
            z = false;
        }
        C1383370m6R.LIZ(this.itemView, new C020N(z, 5));
        if (c1224840hyk.LLILLJJLI == EnumC1224830hyj.NORMAL_WITH_GRAY_DESC) {
            S5().setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            TuxTextView tuxTextViewS5 = S5();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bs);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            tuxTextViewS5.setBackground(c384050F3z.LIZ(S5().getContext()));
            return;
        }
        S5().setPadding(0, 0, 0, 0);
        S5().setBackground(null);
    }

    public final void W5(C1224840hyk c1224840hyk) {
        InterfaceC1224750hyb interfaceC1224750hybV5;
        Lifecycle lifecycleDd2;
        if (!Intrinsics.LJFF(this.LLJILJILJ, c1224840hyk.LLILZ) && this.itemView.isAttachedToWindow()) {
            if (c1224840hyk.LL.LIZ != EnumC992630bwD.TYPE_SEARCH_PAGE && ((interfaceC1224750hybV5 = V5()) == null || (lifecycleDd2 = interfaceC1224750hybV5.dd2(c1224840hyk.LL.LIZIZ)) == null || !lifecycleDd2.getCurrentState().isAtLeast(Lifecycle.State.RESUMED))) {
                return;
            }
            this.LLJILJILJ = c1224840hyk.LLILZ;
            T5().LJ().LJIIIIZZ(c1224840hyk);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X5(X.C1224840hyk r5, boolean r6) {
        /*
            r4 = this;
            if (r6 == 0) goto Lb3
            X.01GW r0 = r4.LLILZIL
            java.lang.Object r1 = r0.getValue()
            X.12Gn r1 = (X.C19727912Gn) r1
            r0 = 1
            r1.setActive(r0)
            X.01GW r0 = r4.LLILZIL
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.C1584506Ih.LIZIZ(r0)
            X.0hyl r0 = r5.LL
            X.0bwD r1 = r0.LIZ
            X.0bwD r0 = X.EnumC992630bwD.TYPE_SEARCH_PAGE
            r2 = 0
            if (r1 != r0) goto L49
            X.0hyb r0 = r4.V5()
            if (r0 == 0) goto L97
            java.util.List r0 = r0.ie2()
            if (r0 == 0) goto L97
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L37:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C1224840hyk
            if (r0 == 0) goto L37
            r3.add(r1)
            goto L37
        L49:
            X.0hyb r1 = r4.V5()
            if (r1 == 0) goto L97
            X.0hyl r0 = r5.LL
            java.lang.String r0 = r0.LIZIZ
            java.util.List r0 = r1.dy0(r0)
            if (r0 == 0) goto L97
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L62:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C1224840hyk
            if (r0 == 0) goto L62
            r3.add(r1)
            goto L62
        L74:
            java.util.Iterator r3 = r3.iterator()
            r2 = 0
        L79:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r3.next()
            X.0hyk r0 = (X.C1224840hyk) r0
            java.lang.String r1 = r0.LLILZ
            java.lang.String r0 = r5.LLILZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L93
            int r2 = r2 + 1
            goto L79
        L92:
            r2 = -1
        L93:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L97:
            X.0ZE7 r1 = new X.0ZE7
            androidx.lifecycle.LifecycleOwner r0 = r4.getCurrentLifecycleOwner()
            r1.<init>(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.LJII = r0
            X.0zoY r0 = X.EnumC1910440zoY.CONTACT_SELECTOR
            r1.LIZIZ(r0)
            r1.LJI = r2
            java.lang.String r0 = r5.LLILZ
            r1.LIZJ = r0
            X.C897490ZIt.LIZLLL(r1)
            return
        Lb3:
            X.01GW r0 = r4.LLILZIL
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.C1584506Ih.LIZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorListContactCell.X5(X.0hyk, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ef  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r18, java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorListContactCell.onBindItemView(X.0zJl, java.util.List):void");
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
