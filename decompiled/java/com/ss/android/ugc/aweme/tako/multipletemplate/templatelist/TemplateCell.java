package com.ss.android.ugc.aweme.tako.multipletemplate.templatelist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C07EJ;
import X.C07EK;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C12KQ;
import X.C12P5;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C1385040m98;
import X.C13LE;
import X.C1770850wBP;
import X.C1840760y0A;
import X.C1845250y7P;
import X.C1845270y7R;
import X.C1853460yKe;
import X.C1864450ycN;
import X.C19474211Gy;
import X.C19659111vp;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C337180DJs;
import X.C384050F3z;
import X.C418440Gaw;
import X.C423410Gix;
import X.C424560Gko;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC197015126j;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1783650wW3;
import X.InterfaceC1855990yOj;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import irm.AkS64S0200000_27;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class TemplateCell extends PowerCell<C1853460yKe> implements InterfaceC724530SbT, InterfaceC1855990yOj {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final float LLJIJIL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 852));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 848));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 865));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 867));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 850));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 855));
    public final AssemVMLazy LLIZ;
    public C1845250y7P LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TemplateCell.class, "templateListViewModel", "getTemplateListViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/templatelist/TemplateListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = C418440Gaw.LIZIZ(16);
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

    @Override // X.InterfaceC1855990yOj
    public final RecyclerView.ViewHolder k4() {
        return this;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = (View) this.LLILLJJLI.getValue();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        Drawable drawableLIZ = c384050F3z.LIZ(this.itemView.getContext());
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LJ = Integer.valueOf(R.attr.ox);
        c19659111vp.LIZJ = C418440Gaw.LIZIZ(6);
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(24);
        c19659111vp.LIZ = C418440Gaw.LIZIZ(8);
        view.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(this.itemView.getContext())));
        if (C07EK.LIZ()) {
            this.LLIZLLLIL = (C1845250y7P) this.itemView.findViewById(R.id.be8);
            if (C07EJ.LIZ()) {
                return;
            }
            C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.0y0B
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1853320yKQ) obj).LLJIJIL);
                }
            }, null, new AwS641S0100000_27(this, 166), 6);
        }
    }

    public TemplateCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TemplateListViewModel.class);
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(c19719912DlLIZ, 872);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(267);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 853), awS571S0100000_27, AFwS216S0000000_27.get$arr$(189), new AwS571S0100000_27((C03K6) this, 856), new AwS571S0100000_27((C03K6) this, 858), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 860), aFwS269S0000000_27, new AwS571S0100000_27((C03K6) this, 862), null, new AwS571S0100000_27((C03K6) this, 863));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS571S0100000_27 awS571S0100000_272 = new AwS571S0100000_27((C03K6) this, 857);
            AwS571S0100000_27 awS571S0100000_273 = new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 859);
            AwS571S0100000_27 awS571S0100000_274 = new AwS571S0100000_27(c19719912DlLIZ, 861);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS428S0200000_27((InterfaceC451590HnJ) obj, awS571S0100000_272, 36));
            AwS571S0100000_27 awS571S0100000_275 = new AwS571S0100000_27(c01gwLIZIZ, 864);
            AwS571S0100000_27 awS571S0100000_276 = new AwS571S0100000_27(c01gwLIZIZ, 866);
            AwS571S0100000_27 awS571S0100000_277 = new AwS571S0100000_27(c01gwLIZIZ, 868);
            AwS571S0100000_27 awS571S0100000_278 = new AwS571S0100000_27(c01gwLIZIZ, 869);
            AwS571S0100000_27 awS571S0100000_279 = new AwS571S0100000_27(c01gwLIZIZ, 870);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS571S0100000_274, awS571S0100000_27, new C452080Ho6(), awS571S0100000_275, awS571S0100000_276, awS571S0100000_273, aFwS269S0000000_27, awS571S0100000_277, awS571S0100000_278, awS571S0100000_279);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 871), awS571S0100000_27, AFwS216S0000000_27.get$arr$(190), new AwS571S0100000_27((C03K6) this, 873), new AwS571S0100000_27((C03K6) this, 874), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 875), aFwS269S0000000_27, new AwS571S0100000_27((C03K6) this, 876), null, new AwS571S0100000_27((C03K6) this, 877));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 878), awS571S0100000_27, AFwS216S0000000_27.get$arr$(191), new AwS571S0100000_27((C03K6) this, 879), new AwS571S0100000_27((C03K6) this, 847), new AwS571S0100000_27((C03K6) this, 849), aFwS269S0000000_27, null, null, new AwS571S0100000_27((C03K6) this, 851));
        }
        this.LLIZ = assemVMLazy;
        this.LLJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 854));
    }

    public final C424560Gko I5() {
        return (C424560Gko) this.LL.getValue();
    }

    public final TemplateListViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (TemplateListViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1855990yOj
    public final InterfaceC1783650wW3 af() {
        C1853460yKe item = getItem();
        if (item != null && this.LLIZLLLIL != null && item.isGenerateVideo() && C1840760y0A.LIZ(item)) {
            return (InterfaceC1783650wW3) this.LLJ.getValue();
        }
        return null;
    }

    @Override // X.InterfaceC1855990yOj
    public final int gl() {
        return getBindingAdapterPosition();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C1845250y7P c1845250y7P = this.LLIZLLLIL;
        if (c1845250y7P != null) {
            c1845250y7P.LJI();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onPause() {
        L5().vQ2(2);
    }

    @Override // X.InterfaceC1855990yOj
    public final View L4() {
        return this.itemView;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        float fLIZIZ;
        float fLIZIZ2;
        C1845250y7P c1845250y7P;
        int iIntValue;
        FrameLayout.LayoutParams layoutParams;
        C1853460yKe c1853460yKe = (C1853460yKe) interfaceC1891350zJl;
        if (c1853460yKe.getUseNewUIOfUnify()) {
            ((View) this.LLILZLL.getValue()).setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, 0);
            C426750GoL.LJIIL((View) this.LLILLJJLI.getValue(), 0, 0, 0, 0, 16);
            View view = (View) this.LLILLJJLI.getValue();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zm);
            c384050F3z.LIZJ = Float.valueOf(LLJIJIL);
            view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
            TuxIconView tuxIconView = (TuxIconView) this.LLILLL.getValue();
            tuxIconView.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            tuxIconView.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0o, C1385040m98.LIZ(tuxIconView.getContext(), false));
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            tuxIconView.setTintColor(iIntValue);
            View view2 = (View) this.LLILZ.getValue();
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.gravity = 8388661;
                layoutParams.setMarginStart(0);
                layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                layoutParams.bottomMargin = 0;
            }
            view2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            C12P5 c12p5 = new C12P5();
            c12p5.LIZJ = -16777216;
            c12p5.LJ = Float.valueOf(0.2f);
            c12p5.LJFF = Float.valueOf(0.0f);
            c12p5.LJII = EnumC197015126j.LINEAR;
            c12p5.LJI = C12KQ.RADIAL;
            view2.setBackground(c12p5.LIZ(this.itemView.getContext()));
            view2.requestLayout();
        }
        C424560Gko c424560GkoI5 = I5();
        ViewGroup.LayoutParams layoutParams3 = c424560GkoI5.getLayoutParams();
        layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1853460yKe.getSize().getWidth())));
        layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1853460yKe.getSize().getHeight())));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424560GkoI5);
        c424560GkoI5.setLayoutParams(layoutParams3);
        C786410Ut5.I7(new AkS64S0200000_27(this, c1853460yKe, 22), c424560GkoI5);
        int i = 8;
        if (this.LLIZLLLIL != null && c1853460yKe.isGenerateVideo() && C1840760y0A.LIZ(c1853460yKe)) {
            C1845270y7R videoData = c1853460yKe.getVideoData();
            if (videoData != null) {
                C1845250y7P c1845250y7P2 = this.LLIZLLLIL;
                if (c1845250y7P2 != null) {
                    c1845250y7P2.setData(videoData);
                }
                if (!C07EJ.LIZ() && (c1845250y7P = this.LLIZLLLIL) != null) {
                    c1845250y7P.LJII();
                }
            }
            C1845250y7P c1845250y7P3 = this.LLIZLLLIL;
            if (c1845250y7P3 != null) {
                C786410Ut5.LJLLLLLL(0, c1845250y7P3);
            }
            C1845250y7P c1845250y7P4 = this.LLIZLLLIL;
            if (c1845250y7P4 != null) {
                if (c1853460yKe.getUseNewUIOfUnify()) {
                    fLIZIZ2 = LLJIJIL;
                } else {
                    fLIZIZ2 = C418440Gaw.LIZIZ(4);
                }
                c1845250y7P4.setOutlineProvider(new C423410Gix(Float.valueOf(fLIZIZ2)));
            }
            C1845250y7P c1845250y7P5 = this.LLIZLLLIL;
            if (c1845250y7P5 != null) {
                c1845250y7P5.setClipToOutline(true);
            }
            C786410Ut5.LJLLLLLL(8, I5());
            C337180DJs.LIZ((View) this.LLILLL.getValue());
            C337180DJs.LIZ((View) this.LLILZ.getValue());
        } else {
            C1845250y7P c1845250y7P6 = this.LLIZLLLIL;
            if (c1845250y7P6 != null) {
                C786410Ut5.LJLLLLLL(8, c1845250y7P6);
            }
            C786410Ut5.LJLLLLLL(0, I5());
            C786410Ut5.LJLLLLLL(0, (View) this.LLILLJJLI.getValue());
            String imageUri = c1853460yKe.getImageUri();
            if (imageUri != null && !a0.LJJJIL(imageUri)) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(c1853460yKe.getImageUri());
                c1331670kl3LJIIIZ.LIZLLL = c1853460yKe.isGenerateVideo();
                c1331670kl3LJIIIZ.LJJ(I5());
                c1331670kl3LJIIIZ.LIZLLL("tako_template_cell");
                c1331670kl3LJIIIZ.LJJJIL = new C1338340kvo(I5(), "tako_template_cover", c1853460yKe.getImageUri(), C2097608Jq.LJ());
                C786410Ut5.h3(c1331670kl3LJIIIZ);
                C424560Gko c424560GkoI52 = I5();
                if (c1853460yKe.getUseNewUIOfUnify()) {
                    fLIZIZ = LLJIJIL;
                } else {
                    fLIZIZ = C418440Gaw.LIZIZ(4);
                }
                c424560GkoI52.setOutlineProvider(new C423410Gix(Float.valueOf(fLIZIZ)));
                I5().setClipToOutline(true);
            }
            View view3 = (View) this.LLILZ.getValue();
            if (c1853460yKe.isGenerateVideo()) {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, view3);
        }
        String coverContainerDecoration = c1853460yKe.getCoverContainerDecoration();
        if (coverContainerDecoration != null && !a0.LJJJIL(coverContainerDecoration)) {
            C337180DJs.LIZJ((View) this.LLILZIL.getValue());
            C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(c1853460yKe.getCoverContainerDecoration());
            c1331670kl3LJIIIZ2.LJJ((SmartImageView) this.LLILZIL.getValue());
            c1331670kl3LJIIIZ2.LJJJIL = new C1338340kvo((View) this.LLILZIL.getValue(), "tako_template_cover_decoration", c1853460yKe.getCoverContainerDecoration(), C2097608Jq.LJ());
            c1331670kl3LJIIIZ2.LJIIJ(new C1864450ycN(this, c1853460yKe, 2));
            return;
        }
        C337180DJs.LIZ((View) this.LLILZIL.getValue());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fra, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        L5().vQ2(1);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        super.onBindItemView(interfaceC1891350zJl, list);
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
