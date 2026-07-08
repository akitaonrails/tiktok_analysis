package com.ss.android.ugc.aweme.inbox.bulletin.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0OLV;
import X.C0OOH;
import X.C0OOY;
import X.C0OQH;
import X.C0OQK;
import X.C0OSF;
import X.C0OTZ;
import X.C0OUB;
import X.C0OWE;
import X.C0OWM;
import X.C0QSJ;
import X.C1220000hqw;
import X.C127G;
import X.C13BV;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C605910Npd;
import X.C620650OVz;
import X.C623320Occ;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.EnumC617880OLi;
import X.EnumC619890OTb;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC617820OLc;
import X.InterfaceC618620OOe;
import X.InterfaceC623330Ocd;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS384S0100000_9;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageListAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.utils.event.BulletinBoardListChangeEvent;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinHybridMessageCardCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPageListAssem extends UIListContentAssem<BulletinListViewModel> implements InterfaceC618620OOe, InterfaceC623330Ocd, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public View LLJ;
    public View LLJI;
    public float LLJIJIL;
    public float LLJILJILJ;
    public int LLJJI;
    public final Map<String, Integer> LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C736950SvV LLJJJ;
    public final C01GW LLJJJIL;
    public C0OTZ LLJJJJ;
    public C127G LLJJJJJIL;
    public InterfaceC665370Q7z LLJJJJLIIL;
    public C0QSJ LLJJL;
    public final EnumC619890OTb LLIZLLLIL = EnumC619890OTb.PAGE_LIST;
    public int LLJILJIL = -2;
    public int LLJILLL = -2;
    public final C1559260qg8 LLJJ = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinPageListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BulletinPageListAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BulletinPageListAssem.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC623330Ocd
    public final void D4(C620650OVz c620650OVz, EnumC617880OLi enumC617880OLi, InterfaceC617820OLc interfaceC617820OLc) {
    }

    @Override // X.InterfaceC618620OOe
    public final void LU0(BulletinBaseItem bulletinBaseItem, int i, String str, Map<String, String> map) {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class});
    }

    @Override // X.InterfaceC618620OOe
    public final void eA2(BulletinBaseItem bulletinBaseItem) {
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC618620OOe
    public final String sL0(boolean z, boolean z2) {
        return "";
    }

    public BulletinPageListAssem() {
        this.LLJJI = 50000;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = ((Map) C0OUB.LIZIZ.getValue()).entrySet().iterator();
        while (it2.hasNext()) {
            String strLIZ = C0OQK.LIZ((String) ((Map.Entry) it2.next()).getValue());
            if (strLIZ.length() > 0) {
                int i = this.LLJJI;
                this.LLJJI = i + 1;
                linkedHashMap.put(strLIZ, Integer.valueOf(i));
            }
        }
        this.LLJJIII = linkedHashMap;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 302), AFwS240S0000000_9.get$arr$(186), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 303), AFwS240S0000000_9.get$arr$(187), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(BulletinInputStateViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ3, 304), AFwS240S0000000_9.get$arr$(188), null, true);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 299));
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 301);
        this.LLJJJ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(189), new AwS553S0100000_9((AbstractC738140SxQ) this, 305), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJIJIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20603715jn Ho() {
        /*
            r3 = this;
            X.15jn r2 = new X.15jn
            r2.<init>()
            r0 = 3
            r2.LIZ = r0
            boolean r0 = X.C296740Bk8.LIZ()
            if (r0 == 0) goto L29
            X.0OS8 r0 = X.C0OS8.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinScrollOptConfiguration r0 = X.C0OS8.LJII()
            java.lang.Integer r0 = r0.enableAsyncDiff
            if (r0 == 0) goto L29
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L29
        L22:
            r2.LJ = r1
            java.lang.Class<com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell> r0 = com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell.class
            r2.LIZLLL = r0
            return r2
        L29:
            r1 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageListAssem.Ho():X.15jn");
    }

    public final C0QSJ Lo() {
        C0QSJ c0qsj = this.LLJJL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJJLIIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJJJLIIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{BulletinFragmentScope.class});
        this.LLJJL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final C605910Npd Oo() {
        return (C605910Npd) this.LLJJJIL.getValue();
    }

    public final BulletinProfileViewModel So() {
        return (BulletinProfileViewModel) this.LLJJJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Vo, reason: merged with bridge method [inline-methods] */
    public final BulletinListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (BulletinListViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC623330Ocd
    public final View dk() {
        return Go();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJJJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJJJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BulletinListViewModel.class, new AObjectS384S0100000_9(this, 7)}, defaultViewModelProviderFactory);
                    this.LLJJJJJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        ip().LLJILJILJ = new C0OOH() { // from class: X.0OQD
            @Override // X.C0OOH
            public final int LIZ(String str) {
                String strLIZ = C0OQK.LIZ(str);
                String strLIZ2 = C01CL.LIZ(str);
                if (strLIZ.length() <= 0) {
                    if (strLIZ2.length() > 0) {
                        strLIZ = strLIZ2;
                    } else {
                        return -1;
                    }
                }
                if (!this.LIZ.LLJJIII.containsKey(strLIZ)) {
                    BulletinPageListAssem bulletinPageListAssem = this.LIZ;
                    int i = bulletinPageListAssem.LLJJI;
                    bulletinPageListAssem.LLJJI = i + 1;
                    this.LIZ.LLJJIII.put(strLIZ, Integer.valueOf(i));
                    this.LIZ.Go().LJIJ(new C1723500ux2(i, BulletinHybridMessageCardCell.class));
                }
                Integer num = (Integer) ((LinkedHashMap) this.LIZ.LLJJIII).get(strLIZ);
                if (num != null) {
                    return num.intValue();
                }
                return -1;
            }
        };
        C0OOY.LIZ.getClass();
        C0OOY.LJII.add(this);
        BulletinBoardListChangeEvent bulletinBoardListChangeEventDQ2 = ip().DQ2();
        bulletinBoardListChangeEventDQ2.LJIIIIZZ();
        bulletinBoardListChangeEventDQ2.LJFF();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0OOY.LIZ.getClass();
        C0OOY.LIZJ = null;
        C0OOY.LJII.remove(this);
        ip().DQ2().LJIIIIZZ();
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.iA(this.LLIZLLLIL);
        }
        C605910Npd c605910NpdOo = Oo();
        if (c605910NpdOo != null) {
            c605910NpdOo.LIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (So().To()) {
            C0OOY c0ooy = C0OOY.LIZ;
            C0OOH c0ooh = ip().LLJILJILJ;
            c0ooy.getClass();
            C0OOY.LIZJ = c0ooh;
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        C605910Npd c605910NpdOo = Oo();
        if (c605910NpdOo != null) {
            c605910NpdOo.LJIIIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        C605910Npd c605910NpdOo = Oo();
        if (c605910NpdOo != null) {
            c605910NpdOo.LJIIJ();
        }
    }

    @Override // X.InterfaceC623330Ocd
    public final EnumC619890OTb pd() {
        return this.LLIZLLLIL;
    }

    public final List No(C0OSF c0osf) {
        View view = this.LLJ;
        if (view == null) {
            return C13BV.INSTANCE;
        }
        View view2 = this.LLJI;
        if (view2 == null) {
            return C13BV.INSTANCE;
        }
        if (C0OQH.LIZ[c0osf.ordinal()] == 1) {
            return C1697810uHb.LJIIJJI(new C0OWE(view, new C623320Occ(0.0f, 0, 8, null, null, null, null, 120)), new C0OWE(view2, new C623320Occ(1.0f, 0, 0, null, null, null, null, 120)));
        }
        return C1697810uHb.LJIIJJI(new C0OWE(view, new C623320Occ(this.LLJILJILJ, this.LLJILLL, 0, null, null, null, null, 120)), new C0OWE(view2, new C623320Occ(this.LLJIJIL, this.LLJILJIL, 0, null, null, null, null, 120)));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0180  */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0OTZ] */
    /* JADX WARN: Type inference failed for: r0v62, types: [T, X.13BV] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageListAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC618620OOe
    public final void ov0(long j) {
        ip().BQ2().LIZLLL = j;
    }

    @Override // X.InterfaceC623330Ocd
    public final List Gl(C0OSF c0osf, C0OWM c0owm) {
        return No(c0osf);
    }

    @Override // X.InterfaceC623330Ocd
    public final List eb(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC618620OOe
    public final void YV(BulletinItem bulletinItem, BulletinBaseItem bulletinBaseItem, Map<String, String> map) {
        C605910Npd c605910NpdOo = Oo();
        if (c605910NpdOo != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c605910NpdOo.LJIIJ.put("post_content_type", String.valueOf(bulletinItem.getType()));
            c605910NpdOo.LJII(1, -1, jCurrentTimeMillis);
        }
        C605910Npd c605910NpdOo2 = Oo();
        if (c605910NpdOo2 != null) {
            c605910NpdOo2.LJIIIZ();
        }
    }

    @Override // X.InterfaceC618620OOe
    public final void sp2(BulletinItem bulletinItem, BulletinBaseItem bulletinBaseItem, Map<String, String> map) {
        C605910Npd c605910NpdOo = Oo();
        if (c605910NpdOo != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c605910NpdOo.LJIIJ.put("post_content_type", String.valueOf(bulletinItem.getType()));
            c605910NpdOo.LJII(1, -1, jCurrentTimeMillis);
        }
        C605910Npd c605910NpdOo2 = Oo();
        if (c605910NpdOo2 != null) {
            c605910NpdOo2.LJIIIZ();
        }
    }
}
