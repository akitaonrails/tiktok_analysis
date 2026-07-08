package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1770850wBP;
import X.C1829640xiE;
import X.C1829650xiF;
import X.C1829660xiG;
import X.C1829670xiH;
import X.C1829680xiI;
import X.C1829690xiJ;
import X.C1829700xiK;
import X.C1829710xiL;
import X.C1829720xiM;
import X.C1829730xiN;
import X.C1829740xiO;
import X.C1829750xiP;
import X.C1829760xiQ;
import X.C1829770xiR;
import X.C1829780xiS;
import X.C1829790xiT;
import X.C1829800xiU;
import X.C1829810xiV;
import X.C1829820xiW;
import X.C1829830xiX;
import X.C1829840xiY;
import X.C1829850xiZ;
import X.C1829860xia;
import X.C1829870xib;
import X.C1829880xic;
import X.C1829890xid;
import X.C1829900xie;
import X.C1829910xif;
import X.C1829920xig;
import X.C1829930xih;
import X.C1829940xii;
import X.C1829950xij;
import X.C1829960xik;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2004307tB;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C497740JfY;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC0148002o;
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
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureSelectorCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class SceneryPictureSelectorCell extends PowerCell<C2004307tB> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C01GW LL = C452501pT.LIZIZ(new C1829900xie(this));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1829910xif(this));
    public final AssemVMLazy LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SceneryPictureSelectorCell.class, "sceneryPictureViewModel", "getSceneryPictureViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/scenery/layout/imageselector/picturechunk/SceneryPictureViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public SceneryPictureSelectorCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SceneryPictureViewModel.class);
        C1829670xiH c1829670xiH = new C1829670xiH(c19719912DlLIZ);
        C1829960xik c1829960xik = new C1829960xik();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C1829920xig(c19719912DlLIZ), c1829670xiH, new C1829840xiY(), new C1829760xiQ(this), new C1829680xiI(this), new C1829880xic(this), c1829960xik, new C1829650xiF(this), null, new C1829690xiJ(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1829740xiO c1829740xiO = new C1829740xiO(this);
            C1829870xib c1829870xib = new C1829870xib(this);
            C1829930xih c1829930xih = new C1829930xih(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1829830xiX((InterfaceC451590HnJ) obj, c1829740xiO));
            C1829780xiS c1829780xiS = new C1829780xiS(c01gwLIZIZ);
            C1829790xiT c1829790xiT = new C1829790xiT(c01gwLIZIZ);
            C1829800xiU c1829800xiU = new C1829800xiU(c01gwLIZIZ);
            C1829810xiV c1829810xiV = new C1829810xiV(c01gwLIZIZ);
            C1829820xiW c1829820xiW = new C1829820xiW(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c1829930xih, c1829670xiH, new C452080Ho6(), c1829780xiS, c1829790xiT, c1829870xib, c1829960xik, c1829800xiU, c1829810xiV, c1829820xiW);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C1829940xii(c19719912DlLIZ), c1829670xiH, new C1829850xiZ(), new C1829770xiR(this), new C1829730xiN(this), new C1829890xid(this), c1829960xik, new C1829640xiE(this), null, new C1829700xiK(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C1829950xij(c19719912DlLIZ), c1829670xiH, new C1829860xia(), new C1829750xiP(this), new C1829710xiL(this), new C1829720xiM(this), c1829960xik, null, null, new C1829660xiG(this));
        }
        this.LLILLL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.LLJJIJIL((LiveIconView) this.LL.getValue(), 0);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xR8
            {
                super(1000L);
            }

            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                Fragment fragmentLIZ;
                if (view != null && (fragmentLIZ = C946803n0.LIZ(this.LLILZ.itemView)) != null) {
                    AssemVMLazy assemVMLazy = this.LLILZ.LLILLL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SceneryPictureSelectorCell.LLILZ;
                    SceneryPictureViewModel sceneryPictureViewModel = (SceneryPictureViewModel) assemVMLazy.getValue();
                    IHostSubscription iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
                    C0L0G.Companion.getClass();
                    iHostSubscription.tG2(fragmentLIZ, 125, 126, 1, 0, C0L0G.DEFAULT, C2097908Jt.LIZJ(new Pair("show_entrance", "")), 100, 0);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_scenery_layout_editing_page");
                    c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                    c474500IjALIZ.LJJII(sceneryPictureViewModel.wQ2().LLILLL, "decoration_entrance");
                    c474500IjALIZ.LJJII("click", "action_type");
                    c474500IjALIZ.LJJII("picture", "click_position");
                    c474500IjALIZ.LJJII("upload", "clicked_scenery_type");
                    c474500IjALIZ.LIZ();
                }
            }
        }, this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        View view = (View) this.LLILLJJLI.getValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.exq, ((View) this.LLILLJJLI.getValue()).getContext()));
        gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(8.0f));
        view.setBackground(gradientDrawable);
        ((LiveIconView) this.LL.getValue()).setIcon(C20736316Cj.LIZLLL(R.attr.dvu, ((View) this.LL.getValue()).getContext()));
        ((LiveIconView) this.LL.getValue()).setIconTint(C20736316Cj.LIZIZ(R.attr.exp, ((View) this.LL.getValue()).getContext()));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gy0, viewGroup, false);
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
