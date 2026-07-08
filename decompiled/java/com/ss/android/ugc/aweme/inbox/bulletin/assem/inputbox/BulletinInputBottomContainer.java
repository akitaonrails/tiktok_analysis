package com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox;

import X.C019F;
import X.C0DTR;
import X.C0OPX;
import X.C0OSF;
import X.C0OWM;
import X.C12ES;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C619990OTl;
import X.C620650OVz;
import X.C723850SaN;
import X.C724750Sbp;
import X.EnumC617880OLi;
import X.EnumC619890OTb;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC617820OLc;
import X.InterfaceC623330Ocd;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinBottomContainerThemeAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinFullScreenGamePlayAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinInputBottomContainer extends UISlotAssem implements InterfaceC623330Ocd, BulletinBottomContainerThemeAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final EnumC619890OTb LLJJI = EnumC619890OTb.CONTAINER_BOTTOM;
    public final AssemVMLazy LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinInputBottomContainer.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BulletinInputBottomContainer() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinInputStateViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 613), AFwS240S0000000_9.get$arr$(236), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a67;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 147485883) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinBottomContainerThemeAbility
    public final void zZ1() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        if (((C619990OTl) assemVMLazy.getValue().getState()).LL == C0OSF.FULL_SCREEN) {
            hp();
        } else {
            LJJIJL().setBackgroundColor(0);
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final View dk() {
        return LJJIJL();
    }

    public final void hp() {
        Integer numLIZJ;
        BulletinFullScreenGamePlayAbility bulletinFullScreenGamePlayAbility = (BulletinFullScreenGamePlayAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinFullScreenGamePlayAbility.class, null);
        if (bulletinFullScreenGamePlayAbility != null && bulletinFullScreenGamePlayAbility.bI()) {
            LJJIJL().setBackgroundColor(0);
            return;
        }
        Context context = getContext();
        if (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.zo, context)) == null) {
            return;
        }
        LJJIJL().setBackgroundColor(numLIZJ.intValue());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.iA(this.LLJJI);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC623330Ocd
    public final EnumC619890OTb pd() {
        return this.LLJJI;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.HK2(this);
        }
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 242));
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        C0OSF c0osf = ((C619990OTl) assemVMLazy.getValue().getState()).LL;
        C0OWM c0owm = ((C619990OTl) this.LLJJIII.getValue().getState()).LLILLJJLI;
        if (c0osf == C0OSF.FULL_SCREEN) {
            C12ES.LJIILL(0, LJJIJL());
        } else if (c0owm == C0OWM.HIDE) {
            C0DTR.LIZIZ(LJJIJL());
        } else {
            C12ES.LJIILL(0, LJJIJL());
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final List Gl(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC623330Ocd
    public final List eb(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC623330Ocd
    public final void D4(C620650OVz c620650OVz, EnumC617880OLi enumC617880OLi, InterfaceC617820OLc interfaceC617820OLc) {
        Integer numValueOf;
        EnumC617880OLi enumC617880OLi2 = EnumC617880OLi.PREPARE;
        if (enumC617880OLi == enumC617880OLi2) {
            if (c620650OVz.LIZ()) {
                hp();
            } else if (c620650OVz.LIZJ()) {
                LJJIJL().setBackgroundColor(0);
            }
        }
        if (c620650OVz.LJ != c620650OVz.LJFF) {
            return;
        }
        if (c620650OVz.LIZIZ == C0OWM.HIDE && c620650OVz.LIZLLL != C0OSF.FULL_SCREEN && enumC617880OLi == enumC617880OLi2) {
            C0DTR.LIZIZ(LJJIJL());
            return;
        }
        if ((!c620650OVz.LJ() && !c620650OVz.LIZ()) || enumC617880OLi != EnumC617880OLi.COMPLETE) {
            return;
        }
        C12ES.LJIILL(0, LJJIJL());
        if (!c620650OVz.LIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ColorDiag] BottomContainer.COMPLETE: viewAlpha=");
        sbLIZ.append(LJJIJL().getAlpha());
        sbLIZ.append(", bgDrawableAlpha=");
        Drawable background = LJJIJL().getBackground();
        if (background != null) {
            numValueOf = Integer.valueOf(background.getAlpha());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", visibility=");
        sbLIZ.append(LJJIJL().getVisibility());
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
    }
}
