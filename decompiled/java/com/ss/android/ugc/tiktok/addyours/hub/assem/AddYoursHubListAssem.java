package com.ss.android.ugc.tiktok.addyours.hub.assem;

import X.AbstractC21673719rz;
import X.C01GW;
import X.C0NKE;
import X.C0OD0;
import X.C0OEI;
import X.C13LE;
import X.C14EU;
import X.C1637806bA;
import X.C1720106oR;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452501pT;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737030Svd;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS109S0100000_9;
import android.os.Looper;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility;
import com.ss.android.ugc.tiktok.addyours.hub.cell.AddYoursHubItemCell;
import com.ss.android.ugc.tiktok.addyours.hub.viewmodel.AddYoursHubListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS123S1100000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursHubListAssem extends ReusedUISlotAssem<AddYoursHubListAssem> implements InterfaceC712990Rxx<C0OEI> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public C1749280vcc LLJJLIIIJLLLLLLLZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final BPEAHandler LLJLLIL;
    public final C01GW LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddYoursHubListAssem.class, "hubListViewModel", "getHubListViewModel()Lcom/ss/android/ugc/tiktok/addyours/hub/viewmodel/AddYoursHubListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AddYoursHubListAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddYoursHubListViewModel.class);
        this.LLJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1638), null, AFwS240S0000000_9.get$arr$(693));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1635));
        this.LLJLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1636));
        this.LLJLLIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJLLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1637));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.m7;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final AddYoursHubListViewModel op() {
        return (AddYoursHubListViewModel) this.LLJLIL.getValue(this, LLJZ[0]);
    }

    public final ViewOnAttachStateChangeListenerC20604515jv sp() {
        View viewFindViewById = this.LLJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.rn0) : null;
            this.LLJL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final C1749280vcc tp() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.w28) : null;
            this.LLJJLIIIJLLLLLLLZ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final void LJJJJL() {
        C339190DRl.LIZIZ(tp());
        this.LLJLLIL.removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        LJJJJL();
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU
    public final void onTopicChanged(C0NKE c0nke) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update topic event: ");
        sbLIZ.append(c0nke.LIZ.getTopicId());
        C1720106oR.LJI("AddYoursHubListAssem", C2188811AlT.LIZIZ(sbLIZ));
        AddYoursHubListViewModel addYoursHubListViewModelOp = op();
        AddYoursTopic addYoursTopic = c0nke.LIZ;
        addYoursHubListViewModelOp.getClass();
        addYoursHubListViewModelOp.withState(new AwS375S0200000_9(addYoursHubListViewModelOp, addYoursTopic, 157));
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        String str;
        if (c737030Svd.LIZ == 2) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("delete aweme event, param: ");
            sbLIZ.append(c737030Svd.LIZIZ);
            C1720106oR.LJI("AddYoursHubListAssem", C2188811AlT.LIZIZ(sbLIZ));
            Object obj = c737030Svd.LIZIZ;
            if ((obj instanceof String) && (str = (String) obj) != null) {
                AddYoursHubListViewModel addYoursHubListViewModelOp = op();
                addYoursHubListViewModelOp.getClass();
                addYoursHubListViewModelOp.withState(new AwS123S1100000_9(str, addYoursHubListViewModelOp, 14));
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        C1749280vcc c1749280vccTp = tp();
        c1749280vccTp.setTopMargin(C418440Gaw.LIZIZ(146));
        c1749280vccTp.setButtonTopMargin(C418440Gaw.LIZIZ(20));
        C786410Ut5.LJLIIL(300L, this.LLJLLIL, new ARunnableS104S0100000_4((Object) new ARunnableS109S0100000_9(this, 167), 88));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvSp = sp();
        AbstractC21673719rz itemAnimator = viewOnAttachStateChangeListenerC20604515jvSp.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.LJIJJLI(0L);
        }
        viewOnAttachStateChangeListenerC20604515jvSp.LJIILJJIL(AddYoursHubItemCell.class);
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 3;
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add_yours_hub_list_");
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        sbLIZ.append(((C0OEI) obj).LL);
        c20603715jn.LJIIIZ = C2188811AlT.LIZIZ(sbLIZ);
        viewOnAttachStateChangeListenerC20604515jvSp.setListConfig(c20603715jn);
        viewOnAttachStateChangeListenerC20604515jvSp.LJIIL(op().getConfig());
        op().setListState(viewOnAttachStateChangeListenerC20604515jvSp.getState());
        AssemViewModel.asyncSubscribe$default(op(), new C2217381BqS() { // from class: X.0OAv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                C615470OCb c615470OCb = (C615470OCb) obj2;
                c615470OCb.getClass();
                return C627260Oiy.LIZLLL(c615470OCb);
            }
        }, null, new AwS588S0100000_9(this, 545), null, new AwS588S0100000_9(this, 547), 10, null);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0OCh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C615470OCb) obj2).LL;
            }
        }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(56), 4);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0OCe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C615470OCb) obj2).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(57), 4);
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0OEI c0oei) {
        String str;
        Integer numValueOf;
        C0OD0 c0od0D30;
        C0OEI c0oei2 = c0oei;
        if (c0oei2.LL != -1) {
            AddYoursHubListViewModel addYoursHubListViewModelOp = op();
            AddYoursHubAbility addYoursHubAbility = (AddYoursHubAbility) this.LLJLILLLLZIIL.getValue();
            Integer numValueOf2 = null;
            if (addYoursHubAbility != null && (c0od0D30 = addYoursHubAbility.D30()) != null) {
                str = c0od0D30.LIZ;
            } else {
                str = null;
            }
            addYoursHubListViewModelOp.LL = str;
            op().LLILLJJLI = c0oei2.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hubSubType, subType = ");
            sbLIZ.append(c0oei2.LL);
            sbLIZ.append(", addYoursHubAbility = ");
            Object value = this.LLJLILLLLZIIL.getValue();
            if (value != null) {
                numValueOf = Integer.valueOf(value.hashCode());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", addYoursTabAbility = ");
            Object value2 = this.LLJLL.getValue();
            if (value2 != null) {
                numValueOf2 = Integer.valueOf(value2.hashCode());
            }
            sbLIZ.append(numValueOf2);
            sbLIZ.append(", assem = ");
            sbLIZ.append(hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
            op().manualListRefresh();
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0OEI c0oei) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0OEI c0oei) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
