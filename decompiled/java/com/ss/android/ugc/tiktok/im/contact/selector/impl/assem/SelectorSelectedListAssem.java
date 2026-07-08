package com.ss.android.ugc.tiktok.im.contact.selector.impl.assem;

import X.C019F;
import X.C01GW;
import X.C0Q4Y;
import X.C1223620hwm;
import X.C1223990hxN;
import X.C1224280hxq;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C423520Gj8;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC1222430hur;
import X.EnumC1224390hy1;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ALAdapterS0S0400000_6;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorSelectedContactCell;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorSelectedListVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorSelectedListAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C01GW LLJJI = C1223620hwm.LIZLLL(this);
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectorSelectedListAssem.class, "selectorSelectedListVM", "getSelectorSelectedListVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorSelectedListVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SelectorSelectedListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SelectorSelectedListVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2628), AFwS257S0000000_19.get$arr$(522), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2627));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2626));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.aef;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ContactSelectorFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactSelectorFragmentScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1223990hxN c1223990hxNLJFF = ((C1224280hxq) this.LLJJI.getValue()).LJFF();
        if (c1223990hxNLJFF.LIZ.LJIIJ().LJJIZ().LIZJ() == EnumC1224390hy1.SINGLE && c1223990hxNLJFF.LIZ.LJIIJ().LJJIZ().LIZIZ() != 1) {
            RuntimeException runtimeException = new RuntimeException("Your selectMode is SINGLE, the maxCount selectedSize must be 1");
            c1223990hxNLJFF.LIZ.getTag();
            if (C1223620hwm.LJFF()) {
                throw runtimeException;
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJIJIIJIL.getValue();
        viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SelectorSelectedContactCell.class);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext());
        linearLayoutManager.setOrientation(0);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(linearLayoutManager);
        if (this.LLJJIJI.getValue() == EnumC1222430hur.TOP) {
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(new C423520Gj8() { // from class: X.0GgO
                @Override // X.C423520Gj8, X.AbstractC21674919sB
                public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
                    View view2;
                    if (viewHolder != null && (view2 = viewHolder.itemView) != null) {
                        C786410Ut5.Ob(view2, 0.0f);
                        C786410Ut5.pc(view2, 0.0f);
                        C786410Ut5.T4(view2, 0.0f);
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                        viewPropertyAnimatorAnimate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(C1619980sG4.LJIILIIL()).setListener(new ALAdapterS0S0400000_6(this, viewHolder, view2, viewPropertyAnimatorAnimate, 4)).start();
                        return true;
                    }
                    super.LJJI(viewHolder);
                    return true;
                }

                @Override // X.C423520Gj8, X.AbstractC21674919sB
                public final boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
                    View view2;
                    if (viewHolder != null && (view2 = viewHolder.itemView) != null) {
                        view2.animate().cancel();
                        LJIIIZ(viewHolder);
                        return false;
                    }
                    return false;
                }

                @Override // X.C423520Gj8, X.AbstractC21674919sB
                public final boolean LJJII(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
                    if (viewHolder != null && viewHolder.itemView != null) {
                        LJIIIZ(viewHolder);
                        return false;
                    }
                    return false;
                }
            });
        }
        viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
        C786410Ut5.LJLLLLLL(0, viewOnAttachStateChangeListenerC20604515jv);
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hxY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158920gGQ) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 101), 4);
        C736680Sv4.LJIIIIZZ(this, this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0hxZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158920gGQ) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS289S0000000_6.get$arr$(31), 4);
    }
}
