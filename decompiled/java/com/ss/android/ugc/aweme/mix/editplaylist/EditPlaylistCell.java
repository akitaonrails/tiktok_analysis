package com.ss.android.ugc.aweme.mix.editplaylist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0HZQ;
import X.C0M3E;
import X.C0ZP4;
import X.C1166810gT9;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1308910kAL;
import X.C1322090kVb;
import X.C1324840ka2;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1360500lVY;
import X.C1360520lVa;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19ME;
import X.C1EE2;
import X.C20642515q3;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
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
import Y.ARunnableS104S0100000_4;
import android.graphics.Paint;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class EditPlaylistCell extends PowerCell<C1166810gT9> implements InterfaceC724530SbT, InterfaceC1167900gUu {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LL;
    public C0M3E LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public View LLIZ;
    public final Paint LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditPlaylistCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mix/editplaylist/EditPlaylistViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public EditPlaylistCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditPlaylistViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 497);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(151);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 508), awS562S0100000_18, AFwS206S0000000_18.get$arr$(195), new AwS562S0100000_18((C03K6) this, 483), new AwS562S0100000_18((C03K6) this, 485), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 487), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 489), null, new AwS562S0100000_18((C03K6) this, 490));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 484);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 486);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 488);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 41));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 491);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 492);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 493);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 494);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 495);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 496), awS562S0100000_18, AFwS206S0000000_18.get$arr$(193), new AwS562S0100000_18((C03K6) this, 498), new AwS562S0100000_18((C03K6) this, 499), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 500), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 501), null, new AwS562S0100000_18((C03K6) this, 502));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 503), awS562S0100000_18, AFwS206S0000000_18.get$arr$(194), new AwS562S0100000_18((C03K6) this, 504), new AwS562S0100000_18((C03K6) this, 505), new AwS562S0100000_18((C03K6) this, 506), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 507));
        }
        this.LL = assemVMLazy;
        Paint paint = new Paint();
        paint.setShadowLayer(4.0f, 0.0f, 0.0f, -16777216);
        this.LLIZLLLIL = paint;
    }

    @Override // X.InterfaceC1167900gUu
    public final void LJIIJ() {
        View view = this.LLILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        this.itemView.setLayerType(0, null);
    }

    @Override // X.InterfaceC1167900gUu
    public final void LJIIZILJ() {
        View view = this.LLILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        this.itemView.setLayerType(2, this.LLIZLLLIL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = C1EE2.LIZIZ.LJIIJJI((ViewGroup) this.itemView.findViewById(R.id.f4y));
        this.LLILLL = this.itemView.findViewById(R.id.y_s);
        this.LLILZ = this.itemView.findViewById(R.id.ccv);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.ht6);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.ht_);
        this.LLIZ = this.itemView.findViewById(R.id.hv6);
    }

    public final void I5(C1166810gT9 c1166810gT9) {
        int i;
        TuxTextView tuxTextView;
        View view;
        int iIntValue;
        int i2;
        boolean z = c1166810gT9.LLIZ;
        View view2 = this.LLIZ;
        int i3 = 0;
        if (view2 != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view2);
        }
        if (z && (view = this.LLIZ) != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, this.itemView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            view.setBackgroundColor(iIntValue);
        }
        TuxTextView tuxTextView2 = this.LLILZLL;
        TuxTextView tuxTextView3 = this.LLILZIL;
        if (tuxTextView3 != null && tuxTextView3.getVisibility() == 0) {
            i = 4;
        } else {
            i = 0;
        }
        P5(i, tuxTextView2);
        View view3 = this.LLIZ;
        if (view3 != null && view3.getVisibility() == 0 && (tuxTextView = this.LLILZLL) != null && tuxTextView.getVisibility() == 0) {
            i3 = 4;
        }
        P5(i3, view3);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1166810gT9 c1166810gT9) {
        int iIntValue;
        int i;
        C0M3E c0m3e = this.LLILLJJLI;
        if (c0m3e != null) {
            c0m3e.LIZIZ(c1166810gT9.LLILZIL);
        }
        C1324840ka2.LJFF((RemoteImageView) this.itemView.findViewById(R.id.ht3), c1166810gT9.LLILLJJLI);
        C1331070kk5 c1331070kk5 = (C1331070kk5) ((C1322090kVb) this.itemView.findViewById(R.id.ht3)).getHierarchy();
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, this.itemView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c1331100kk8.LJFF = iIntValue;
        c1331070kk5.LJJIII(c1331100kk8);
        N5(c1166810gT9);
        String strLIZIZ = "";
        if (c1166810gT9.LLILZLL > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            int i2 = c1166810gT9.LLILZLL;
            if (i2 > 0) {
                int i3 = i2 / LSPassThroughRecordSizeConfig.DEFAULT;
                int i4 = i3 % 60;
                int i5 = i3 / 60;
                int i6 = i5 / 60;
                int i7 = i5 % 60;
                if (i6 == 0) {
                    strLIZIZ = C786410Ut5.k4(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i7), Integer.valueOf(i4)}, 2));
                } else {
                    strLIZIZ = C786410Ut5.k4(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i4)}, 3));
                }
            }
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(" · ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(c1166810gT9.LLILZ);
        if (numLJIIJJI != null) {
            int iIntValue2 = numLJIIJJI.intValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(C20642515q3.LJFF().getQuantityString(2131755488, iIntValue2, c1166810gT9.LLILZ));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            tuxTextView.setText(strLIZIZ);
        }
        TuxTextView tuxTextView2 = this.LLILZLL;
        if (tuxTextView2 != null) {
            if (strLIZIZ.length() > 0) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, i);
        }
        I5(c1166810gT9);
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        if (((EditPlaylistViewModel) assemVMLazy.getValue()).LLIZ) {
            C786410Ut5.LLLLLLZZ((TuxIconView) this.itemView.findViewById(R.id.g83), 8);
            C786410Ut5.LJZ(0, (FrameLayout) this.itemView.findViewById(R.id.ukl));
            HandlerHook.viewPost(this.itemView.findViewById(R.id.ukk), new ARunnableS104S0100000_4(this, 161));
            ((C0HZQ) this.itemView.findViewById(R.id.ukk)).setChecked(c1166810gT9.LLJ);
            C786410Ut5.I7(new AkS57S0200000_18(this, c1166810gT9, 41), this.itemView.findViewById(R.id.ukk));
            return;
        }
        C786410Ut5.LLLLLLZZ((TuxIconView) this.itemView.findViewById(R.id.g83), 0);
        C786410Ut5.LJZ(8, (FrameLayout) this.itemView.findViewById(R.id.ukl));
    }

    public final void N5(C1166810gT9 c1166810gT9) {
        boolean z;
        int iLJJJ;
        Integer num = c1166810gT9.LLJI;
        if (num == null || num.intValue() <= 0) {
            num = null;
        }
        String str = c1166810gT9.LLILLL;
        if (str != null && str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ht6), 0);
            if (num != null) {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(R.attr.a1p);
                String string = C20642515q3.LJFF().getString(2131839683, Integer.valueOf(num.intValue()));
                String string2 = this.itemView.getContext().getString(2131848665);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string);
                sbLIZ.append(string2);
                sbLIZ.append('|');
                sbLIZ.append(string2);
                sbLIZ.append(c1166810gT9.LLILLL);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C1360520lVa c1360520lVa = new C1360520lVa();
                c1360520lVa.LIZ.append((CharSequence) strLIZIZ);
                C1360500lVY c1360500lVY = c1360520lVa.LIZ;
                if (a0.LJJJ(strLIZIZ, "|", 0, false, 6) < 0) {
                    iLJJJ = 0;
                } else {
                    iLJJJ = a0.LJJJ(strLIZIZ, "|", 0, false, 6);
                }
                C786410Ut5.r2(c1360500lVY, new StyleSpan(1), 0, string.length() + 1, 33);
                C786410Ut5.r2(c1360500lVY, foregroundColorSpan, iLJJJ + 1, iLJJJ + 2, 33);
                ((TextView) this.itemView.findViewById(R.id.ht6)).setText(c1360500lVY);
                return;
            }
            TextView textView = (TextView) this.itemView.findViewById(R.id.ht6);
            C1360520lVa c1360520lVa2 = new C1360520lVa();
            String str2 = c1166810gT9.LLILLL;
            if (str2 == null) {
                str2 = "";
            }
            c1360520lVa2.LIZ.append((CharSequence) str2);
            textView.setText(c1360520lVa2.LIZ);
            return;
        }
        if (num != null) {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ht6), 0);
            String string3 = C20642515q3.LJFF().getString(2131839683, Integer.valueOf(num.intValue()));
            C1360520lVa c1360520lVa3 = new C1360520lVa();
            c1360520lVa3.LIZ.append((CharSequence) string3);
            C1360500lVY c1360500lVY2 = c1360520lVa3.LIZ;
            C786410Ut5.r2(c1360500lVY2, new StyleSpan(1), 0, string3.length() + 1, 33);
            Unit.LIZ.getClass();
            ((TextView) this.itemView.findViewById(R.id.ht6)).setText(c1360500lVY2);
            return;
        }
        C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ht6), 8);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dwy, viewGroup, false);
    }

    public final void P5(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.topMargin != (i2 = (int) (i * this.itemView.getContext().getResources().getDisplayMetrics().density))) {
            marginLayoutParams.topMargin = i2;
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        Integer num;
        C1166810gT9 c1166810gT9 = (C1166810gT9) interfaceC1891350zJl;
        if (list.isEmpty()) {
            onBindItemView(c1166810gT9);
            return;
        }
        Object obj = ListProtector.get(list, 0);
        if (!(obj instanceof Integer) || (num = (Integer) obj) == null) {
            return;
        }
        c1166810gT9.LLJI = Integer.valueOf(num.intValue());
        N5(c1166810gT9);
        I5(c1166810gT9);
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
