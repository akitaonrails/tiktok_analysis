package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
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
import X.C1271904yL;
import X.C13LE;
import X.C1734050vE3;
import X.C1734060vE4;
import X.C1734070vE5;
import X.C1734080vE6;
import X.C1734090vE7;
import X.C1734100vE8;
import X.C1734110vE9;
import X.C1734120vEA;
import X.C1734130vEB;
import X.C1734140vEC;
import X.C1734150vED;
import X.C1734160vEE;
import X.C1734170vEF;
import X.C1734180vEG;
import X.C1734190vEH;
import X.C1734200vEI;
import X.C1734210vEJ;
import X.C1734220vEK;
import X.C1734230vEL;
import X.C1734240vEM;
import X.C1734250vEN;
import X.C1734260vEO;
import X.C1734270vEP;
import X.C1734280vEQ;
import X.C1734290vER;
import X.C1734300vES;
import X.C1734310vET;
import X.C1734350vEX;
import X.C1734360vEY;
import X.C1734370vEZ;
import X.C1734420vEe;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C337270DKb;
import X.C452080Ho6;
import X.C452501pT;
import X.C520010KaN;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC21676519sR;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormUxOptSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.PcsFormFieldsListCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.PcsCountryInputCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.PcsPhoneInputCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.PcsSingleSelectCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.fields.PcsTextInputCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.vm.PcsFormVm;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PcsFormFieldsListCell extends PowerCell<C1271904yL> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsFormFieldsListCell.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/form/vm/PcsFormVm;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public PcsFormFieldsListCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsFormVm.class);
        C1734070vE5 c1734070vE5 = new C1734070vE5(c19719912DlLIZ);
        C1734420vEe c1734420vEe = new C1734420vEe();
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new C1734370vEZ(c19719912DlLIZ), c1734070vE5, new C1734270vEP(), new C1734170vEF(this), new C1734090vE7(this), new C1734290vER(this), c1734420vEe, new C1734060vE4(this), null, new C1734100vE8(this));
        } else if (obj instanceof InterfaceC451590HnJ) {
            C1734150vED c1734150vED = new C1734150vED(this);
            C1734280vEQ c1734280vEQ = new C1734280vEQ(this);
            C1734310vET c1734310vET = new C1734310vET(c19719912DlLIZ);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1734240vEM((InterfaceC451590HnJ) obj, c1734150vED));
            C1734190vEH c1734190vEH = new C1734190vEH(c01gwLIZIZ);
            C1734200vEI c1734200vEI = new C1734200vEI(c01gwLIZIZ);
            C1734210vEJ c1734210vEJ = new C1734210vEJ(c01gwLIZIZ);
            C1734220vEK c1734220vEK = new C1734220vEK(c01gwLIZIZ);
            C1734230vEL c1734230vEL = new C1734230vEL(c01gwLIZIZ);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(c1734310vET, c1734070vE5, new C452080Ho6(), c1734190vEH, c1734200vEI, c1734280vEQ, c1734420vEe, c1734210vEJ, c1734220vEK, c1734230vEL);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new C1734350vEX(c19719912DlLIZ), c1734070vE5, new C1734250vEN(), new C1734180vEG(this), new C1734140vEC(this), new C1734300vES(this), c1734420vEe, new C1734050vE3(this), null, new C1734110vE9(this));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new C1734360vEY(c19719912DlLIZ), c1734070vE5, new C1734260vEO(), new C1734160vEE(this), new C1734120vEA(this), new C1734130vEB(this), c1734420vEe, null, null, new C1734080vE6(this));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        C1271904yL c1271904yL = (C1271904yL) interfaceC1891350zJl;
        super.onBindItemView(c1271904yL);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILLJJLI;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
            state.LJIILL(c1271904yL.LL, null);
        }
        if (LivePcsFormUxOptSetting.INSTANCE.isUxOptEnabled() && (viewOnAttachStateChangeListenerC20604515jv = this.LLILLJJLI) != null) {
            viewOnAttachStateChangeListenerC20604515jv.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0vEU
                @Override // X.InterfaceC21676519sR
                public final void m3(View view) {
                }

                @Override // X.InterfaceC21676519sR
                public final void g5(View view) {
                    final PcsFormFieldsListCell pcsFormFieldsListCell = this.LL;
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = pcsFormFieldsListCell.LLILLJJLI;
                    if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv3, new Runnable() { // from class: X.0vEV
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("PcsFormFieldsListCell@7810.onBindItemView$1$onChildViewAttachedToWindow$1");
                                try {
                                    AssemVMLazy assemVMLazy = pcsFormFieldsListCell.LL;
                                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsFormFieldsListCell.LLILLL;
                                    PcsFormVm pcsFormVm = (PcsFormVm) assemVMLazy.getValue();
                                    if (LivePcsFormUxOptSetting.INSTANCE.isUxOptEnabled() && (pcsFormVm.getState().LLILLL instanceof C1246050iWx)) {
                                        pcsFormVm.setState(new C1734340vEW());
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("PcsFormFieldsListCell@7810.onBindItemView$1$onChildViewAttachedToWindow$1");
                            }
                        });
                    }
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LL.LLILLJJLI;
                    if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
                        viewOnAttachStateChangeListenerC20604515jv4.removeOnChildAttachStateChangeListener(this);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        IHostCreativeTool iHostCreativeTool;
        AbstractC21674919sB abstractC21674919sB;
        View viewInflateItemView$default = PowerCell.inflateItemView$default(this, viewGroup, R.layout.hfx, false, 4, null);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewInflateItemView$default.findViewById(R.id.q6l);
        this.LLILLJJLI = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (iHostCreativeTool = C520010KaN.LIZ) != null && iHostCreativeTool.UC0()) {
            LifecycleOwner parent = getParent();
            if (parent != null) {
                viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(parent);
            }
            if (LivePcsFormUxOptSetting.INSTANCE.isUxOptEnabled()) {
                viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            } else {
                AbstractC21673719rz itemAnimator = viewOnAttachStateChangeListenerC20604515jv.getItemAnimator();
                if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
                    abstractC21674919sB.LLIZ = false;
                }
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILLJJLI;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(PcsTextInputCell.class, PcsSingleSelectCell.class, PcsPhoneInputCell.class, PcsCountryInputCell.class);
        }
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0vEd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1734460vEi) obj).LLILZLL;
            }
        }, null, new C337270DKb(this), 6);
        return viewInflateItemView$default;
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
