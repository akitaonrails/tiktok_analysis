package com.ss.android.ugc.tiktok.im.contact.selector.impl.cell;

import X.C01GW;
import X.C03H5;
import X.C0I0B;
import X.C0QSJ;
import X.C0ZP4;
import X.C1196320hEk;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1224280hxq;
import X.C1224760hyc;
import X.C1224770hyd;
import X.C123100dR;
import X.C13LE;
import X.C1584506Ih;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719612Di;
import X.C19ME;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C687700QyG;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C894660Z7w;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1224210hxj;
import X.InterfaceC1224260hxo;
import X.InterfaceC1224750hyb;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS700S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorListHeaderCell extends PowerCell<C1224760hyc> implements InterfaceC724530SbT, InterfaceC713360RyY, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(580));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2652));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2650));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2648));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2646));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2651));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2649));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2647));
    public volatile InterfaceC1224750hyb LLJ;
    public InterfaceC665370Q7z LLJI;
    public C0QSJ LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectorListHeaderCell.class, "selectorContainerAbility", "getSelectorContainerAbility()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/ability/ISelectorContainerAbility;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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
        return R.layout.aee;
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

    public final InterfaceC1224260hxo R5() {
        Object obj;
        List<InterfaceC1224210hxj> listLIZ = ((C1224280hxq) this.LLILLL.getValue()).LIZLLL().LIZ();
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC1224210hxj> it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().LIZJ(), arrayList);
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            InterfaceC1224260hxo interfaceC1224260hxo = (InterfaceC1224260hxo) next;
            Context context = getContext();
            if (context == null) {
                C0I0B.LJFF.LIZJ();
                context = C894660Z7w.LIZ();
            }
            String str = interfaceC1224260hxo.LJIJJ(context).LIZ;
            C1224760hyc item = getItem();
            if (Intrinsics.LJFF(str, item != null ? item.LL : null)) {
                obj = next;
                break;
            }
        }
        return (InterfaceC1224260hxo) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1224750hyb S5() {
        /*
            r4 = this;
            X.0hyb r0 = r4.LLJ
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0hyb r0 = r4.LLJ     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJIJIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJI     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJI = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope> r1 = com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJIJIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0hyb> r0 = X.InterfaceC1224750hyb.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0hyb r0 = (X.InterfaceC1224750hyb) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJ = r0     // Catch: java.lang.Throwable -> L35
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorListHeaderCell.S5():X.0hyb");
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C427690Gpr.LJ(this.itemView, 0.0f);
        C786410Ut5.I7(new AbS700S0100000_19(this, 6), this.itemView);
    }

    public final void I5(C1224760hyc c1224760hyc) {
        Drawable drawable = c1224760hyc.LLILZIL;
        if (drawable != null) {
            ((TuxIconView) this.LLILZIL.getValue()).setImageDrawable(drawable);
            C786410Ut5.LJLLLLLL(0, (View) this.LLILZIL.getValue());
        } else {
            C786410Ut5.LJLLLLLL(8, (View) this.LLILZIL.getValue());
        }
    }

    public final void L5(C1224760hyc c1224760hyc) {
        int i;
        TextView textView = (TextView) this.LLIZLLLIL.getValue();
        String str = c1224760hyc.LLILZ;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        View view = (View) this.LLIZLLLIL.getValue();
        if (C123100dR.LIZ(c1224760hyc.LLILZ)) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public final void N5(C1224760hyc c1224760hyc) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        Drawable drawable = c1224760hyc.LLILLJJLI;
        if (drawable != null) {
            ((TuxIconView) this.LLILZ.getValue()).setImageDrawable(drawable);
            if (c1224760hyc.LLIZ) {
                View view = this.itemView;
                view.setPadding(view.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), this.itemView.getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            }
            ViewGroup.LayoutParams layoutParams = ((View) this.LLILZLL.getValue()).getLayoutParams();
            if ((layoutParams instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                C786410Ut5.d6((LinearLayout) this.LLILZLL.getValue(), marginLayoutParams2);
            }
            ((TuxTextView) this.LLIZ.getValue()).setTuxFont(42);
            C1584506Ih.LIZIZ((View) this.LLILZ.getValue());
            return;
        }
        if (c1224760hyc.LLIZ) {
            View view2 = this.itemView;
            view2.setPadding(view2.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), this.itemView.getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        }
        ViewGroup.LayoutParams layoutParams2 = ((View) this.LLILZLL.getValue()).getLayoutParams();
        if ((layoutParams2 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            C786410Ut5.d6((LinearLayout) this.LLILZLL.getValue(), marginLayoutParams);
        }
        C1584506Ih.LIZ((View) this.LLILZ.getValue());
        ((TuxTextView) this.LLIZ.getValue()).setTuxFont(41);
    }

    public final void P5(C1224760hyc c1224760hyc) {
        if (!c1224760hyc.LLIZ) {
            C786410Ut5.W5(this.itemView, new RecyclerView.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))));
        } else {
            C786410Ut5.W5(this.itemView, new RecyclerView.LayoutParams(-1, -2));
        }
        N5(c1224760hyc);
        TextView textView = (TextView) this.LLIZ.getValue();
        String str = c1224760hyc.LLILLL;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        L5(c1224760hyc);
        I5(c1224760hyc);
        if (!c1224760hyc.LLILZLL) {
            C786410Ut5.T4(this.itemView, 0.34f);
        } else {
            C786410Ut5.T4(this.itemView, 1.0f);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        InterfaceC1224260hxo interfaceC1224260hxoR5;
        C1224760hyc c1224760hyc = (C1224760hyc) interfaceC1891350zJl;
        if (c1224760hyc.LLIZ && (interfaceC1224260hxoR5 = R5()) != null) {
            interfaceC1224260hxoR5.onShow();
        }
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C1224770hyd) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((C1224770hyd) it2.next()).LIZ) {
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((C1224770hyd) it3.next()).LIZIZ) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            } else {
                z2 = false;
            }
            if (!arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    if (((C1224770hyd) it4.next()).LIZJ) {
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
            } else {
                z3 = false;
            }
            if (!arrayList.isEmpty()) {
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    if (((C1224770hyd) it5.next()).LIZLLL) {
                        z4 = true;
                        break;
                    }
                }
                z4 = false;
            } else {
                z4 = false;
            }
            if (!arrayList.isEmpty()) {
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    if (((C1224770hyd) it6.next()).LJ) {
                        z5 = true;
                        break;
                    }
                }
                z5 = false;
            } else {
                z5 = false;
            }
            if (!arrayList.isEmpty()) {
                Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    if (((C1224770hyd) it7.next()).LJFF) {
                        z6 = true;
                        break;
                    }
                }
                z6 = false;
            } else {
                z6 = false;
            }
            C1224770hyd c1224770hyd = new C1224770hyd(z, z2, z3, z4, z5, z6);
            if (c1224770hyd.LIZ && !c1224770hyd.LJFF) {
                TextView textView = (TextView) this.LLIZ.getValue();
                String str = c1224760hyc.LLILLL;
                if (str == null) {
                    str = "";
                }
                textView.setText(str);
            }
            if (c1224770hyd.LIZIZ && !c1224770hyd.LJFF) {
                L5(c1224760hyc);
            }
            if (c1224770hyd.LIZJ && !c1224770hyd.LJFF) {
                N5(c1224760hyc);
            }
            if (c1224770hyd.LIZLLL && !c1224770hyd.LJFF) {
                I5(c1224760hyc);
            }
            if (c1224770hyd.LJ && !c1224770hyd.LJFF) {
                if (!c1224760hyc.LLILZLL) {
                    C786410Ut5.T4(this.itemView, 0.34f);
                } else {
                    C786410Ut5.T4(this.itemView, 1.0f);
                }
            }
            if (c1224770hyd.LJFF) {
                P5(c1224760hyc);
                return;
            }
            return;
        }
        P5(c1224760hyc);
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
