package com.ss.android.ugc.aweme.mix.mixdetail.viewholder;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0M3E;
import X.C0ZP4;
import X.C1166800gT8;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1324840ka2;
import X.C1360500lVY;
import X.C1360520lVa;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C1EE2;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C446980Hfs;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1167900gUu;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class MixFeedManageCell extends PowerCell<C1166800gT8> implements InterfaceC724530SbT, InterfaceC1167900gUu {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public C0M3E LLILLL;
    public boolean LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixFeedManageCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mix/mixdetail/viewmodel/MixVideosManageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = C1EE2.LIZIZ.LJIIJJI((ViewGroup) this.itemView.findViewById(R.id.f4y));
        C736680Sv4.LJIIIZ(this, L5(), new C2217381BqS() { // from class: X.0gOF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163820gOK) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0gOL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163820gOK) obj).LLILZLL;
            }
        }, null, new AwS667S0100000_18(this, 9), 12);
    }

    public MixFeedManageCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixVideosManageViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 660);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(188);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 645), awS562S0100000_18, AFwS206S0000000_18.get$arr$(211), new AwS562S0100000_18((C03K6) this, 646), new AwS562S0100000_18((C03K6) this, 648), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 650), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 652), null, new AwS562S0100000_18((C03K6) this, 653));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 647);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 649);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 651);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 48));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 654);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 655);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 656);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 657);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 658);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 659), awS562S0100000_18, AFwS206S0000000_18.get$arr$(212), new AwS562S0100000_18((C03K6) this, 661), new AwS562S0100000_18((C03K6) this, 662), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 663), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 664), null, new AwS562S0100000_18((C03K6) this, 665));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 666), awS562S0100000_18, AFwS206S0000000_18.get$arr$(213), new AwS562S0100000_18((C03K6) this, 667), new AwS562S0100000_18((C03K6) this, 668), new AwS562S0100000_18((C03K6) this, 643), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 644));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 642));
    }

    public final MixVideosManageViewModel L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        return (MixVideosManageViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1167900gUu
    public final void LJIIJ() {
        this.itemView.setBackgroundColor(0);
    }

    @Override // X.InterfaceC1167900gUu
    public final void LJIIZILJ() {
        View view = this.itemView;
        view.setBackgroundColor(view.getResources().getColor(R.color.an));
    }

    public final String I5(int i) {
        return C20642515q3.LJFF().getString(2131839683, Integer.valueOf(i));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1166800gT8 c1166800gT8) {
        boolean z;
        int iLJJJ;
        C0M3E c0m3e = this.LLILLL;
        if (c0m3e == null) {
            c0m3e = null;
        }
        c0m3e.LJ(c1166800gT8.LL);
        C1324840ka2.LJFF((RemoteImageView) this.itemView.findViewById(R.id.f5b), c1166800gT8.LLILZ);
        Integer num = c1166800gT8.LLIZ;
        String str = c1166800gT8.LLILZIL;
        if (str != null && str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String strK4 = "";
        if (z) {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ohl), 0);
            if (num != null) {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C446980Hfs.LIZ(this.itemView.getContext(), R.color.f571dc));
                String strI5 = I5(num.intValue());
                String string = this.itemView.getContext().getString(2131848665);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strI5);
                sbLIZ.append(string);
                sbLIZ.append('|');
                sbLIZ.append(string);
                sbLIZ.append(c1166800gT8.LLILZIL);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C1360520lVa c1360520lVa = new C1360520lVa();
                c1360520lVa.LIZ.append((CharSequence) strLIZIZ);
                C1360500lVY c1360500lVY = c1360520lVa.LIZ;
                if (a0.LJJJ(strLIZIZ, "|", 0, false, 6) < 0) {
                    iLJJJ = 0;
                } else {
                    iLJJJ = a0.LJJJ(strLIZIZ, "|", 0, false, 6);
                }
                C786410Ut5.r2(c1360500lVY, new StyleSpan(1), 0, strI5.length() + 1, 33);
                C786410Ut5.r2(c1360500lVY, foregroundColorSpan, iLJJJ + 1, iLJJJ + 2, 33);
                ((TextView) this.itemView.findViewById(R.id.ohl)).setText(c1360500lVY);
            } else {
                TextView textView = (TextView) this.itemView.findViewById(R.id.ohl);
                C1360520lVa c1360520lVa2 = new C1360520lVa();
                String str2 = c1166800gT8.LLILZIL;
                if (str2 == null) {
                    str2 = "";
                }
                c1360520lVa2.LIZ.append((CharSequence) str2);
                textView.setText(c1360520lVa2.LIZ);
            }
        } else if (num != null) {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ohl), 0);
            String strI52 = I5(num.intValue());
            C1360520lVa c1360520lVa3 = new C1360520lVa();
            c1360520lVa3.LIZ.append((CharSequence) strI52);
            C1360500lVY c1360500lVY2 = c1360520lVa3.LIZ;
            C786410Ut5.r2(c1360500lVY2, new StyleSpan(1), 0, strI52.length() + 1, 33);
            Unit.LIZ.getClass();
            ((TextView) this.itemView.findViewById(R.id.ohl)).setText(c1360500lVY2);
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ohl), 8);
        }
        ((TextView) this.itemView.findViewById(R.id.ohq)).setText(C20642515q3.LJFF().getQuantityString(2131755488, (int) c1166800gT8.LL.getStatistics().getPlayCount(), c1166800gT8.LLILZLL));
        if (c1166800gT8.LL.getVideo().getDuration() > 0) {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ohm), 0);
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.ohm);
            int duration = c1166800gT8.LL.getVideo().getDuration();
            if (duration > 0) {
                int i = duration / LSPassThroughRecordSizeConfig.DEFAULT;
                int i2 = i % 60;
                int i3 = i / 60;
                int i4 = i3 / 60;
                int i5 = i3 % 60;
                if (i4 == 0) {
                    strK4 = C786410Ut5.k4(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)}, 2));
                } else {
                    strK4 = C786410Ut5.k4(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)}, 3));
                }
            }
            textView2.setText(strK4);
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ohm), 8);
        }
        C736680Sv4.LJIJJ(L5(), new AwS597S0100000_18(this, 174));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.doa, false, 4, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        boolean z;
        int iLJJJ;
        C1166800gT8 c1166800gT8 = (C1166800gT8) interfaceC1891350zJl;
        super.onBindItemView(c1166800gT8, list);
        if (!list.isEmpty() && (ListProtector.get(list, 0) instanceof Integer)) {
            String string = this.itemView.getContext().getString(2131848665);
            Integer num = (Integer) ListProtector.get(list, 0);
            c1166800gT8.LLIZ = num;
            int iIntValue = num.intValue();
            String str = c1166800gT8.LLILZIL;
            if (str != null && str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ohl), 0);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C446980Hfs.LIZ(this.itemView.getContext(), R.color.f571dc));
                String strI5 = I5(iIntValue);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strI5);
                sbLIZ.append(string);
                sbLIZ.append('|');
                sbLIZ.append(string);
                sbLIZ.append(c1166800gT8.LLILZIL);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C1360520lVa c1360520lVa = new C1360520lVa();
                c1360520lVa.LIZ.append((CharSequence) strLIZIZ);
                C1360500lVY c1360500lVY = c1360520lVa.LIZ;
                if (a0.LJJJ(strLIZIZ, "|", 0, false, 6) < 0) {
                    iLJJJ = 0;
                } else {
                    iLJJJ = a0.LJJJ(strLIZIZ, "|", 0, false, 6);
                }
                C786410Ut5.r2(c1360500lVY, new StyleSpan(1), 0, strI5.length() + 1, 33);
                C786410Ut5.r2(c1360500lVY, foregroundColorSpan, iLJJJ + 1, iLJJJ + 2, 33);
                ((TextView) this.itemView.findViewById(R.id.ohl)).setText(c1360500lVY);
                return;
            }
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ohl), 0);
            String strI52 = I5(iIntValue);
            C1360520lVa c1360520lVa2 = new C1360520lVa();
            c1360520lVa2.LIZ.append((CharSequence) strI52);
            C1360500lVY c1360500lVY2 = c1360520lVa2.LIZ;
            C786410Ut5.r2(c1360500lVY2, new StyleSpan(1), 0, strI52.length() + 1, 33);
            Unit.LIZ.getClass();
            ((TextView) this.itemView.findViewById(R.id.ohl)).setText(c1360500lVY2);
            return;
        }
        onBindItemView(c1166800gT8);
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
