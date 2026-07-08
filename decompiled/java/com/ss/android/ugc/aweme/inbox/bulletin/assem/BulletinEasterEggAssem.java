package com.ss.android.ugc.aweme.inbox.bulletin.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0OLV;
import X.C0OST;
import X.C0PEM;
import X.C0XQ7;
import X.C1220000hqw;
import X.C13LE;
import X.C1537720q7O;
import X.C1540620qC4;
import X.C1548820qPI;
import X.C1558520qew;
import X.C1559260qg8;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C337180DJs;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C620010OTn;
import X.C636780OyK;
import X.C636810OyN;
import X.C638910P4f;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC617480OJu;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.ab.BulletinBoardEasterEggSetting;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEasterEggAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinHybridAbility;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEasterEggAssem extends UIContentAssem implements BulletinEasterEggAbility, InterfaceC1554640qYg {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public final C01GW LLJI;
    public C1537720q7O LLJIJIL;
    public boolean LLJILJIL;
    public EnumC617480OJu LLJILJILJ;
    public String LLJILLL;
    public boolean LLJJ;
    public final C638910P4f LLJJI;
    public final C638910P4f LLJJIII;
    public final C638910P4f LLJJIJI;
    public final C638910P4f LLJJIJIIJIL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1182243573) {
            return null;
        }
        return this;
    }

    public BulletinEasterEggAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 280);
        this.LLJ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(178), new AwS553S0100000_9((AbstractC738140SxQ) this, 281), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(134));
        this.LLJILLL = CardStruct.IStatusCode.DEFAULT;
        this.LLJJI = new C638910P4f(this, 4);
        this.LLJJIII = new C638910P4f(this, 2);
        this.LLJJIJI = new C638910P4f(this, 1);
        this.LLJJIJIIJIL = new C638910P4f(this, 3);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        release();
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final void release() {
        ViewGroup viewGroup;
        BulletinHybridAbility bulletinHybridAbility = (BulletinHybridAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinHybridAbility.class, null);
        C1540620qC4 c1540620qC4YW1 = bulletinHybridAbility != null ? bulletinHybridAbility.YW1() : null;
        if (this.LLJILJIL) {
            C1548820qPI.LJIIIIZZ("onStart", this.LLJJI);
            C1548820qPI.LJIIIIZZ("onError", this.LLJJIJIIJIL);
            C1548820qPI.LJIIIIZZ("onClick", this.LLJJIJI);
            C1548820qPI.LJIIIIZZ("onClose", this.LLJJIII);
            this.LLJILJIL = false;
        }
        C1537720q7O c1537720q7O = this.LLJIJIL;
        if (c1537720q7O != null) {
            if (c1540620qC4YW1 != null) {
                c1540620qC4YW1.LJJII(c1537720q7O);
            }
            this.LLJIJIL = null;
        }
        this.LLJJ = false;
        C337180DJs.LIZ(LJJIJL());
        View viewLJJIJL = LJJIJL();
        if (!(viewLJJIJL instanceof C636810OyN) || (viewGroup = (ViewGroup) viewLJJIJL) == null) {
            return;
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, null);
        viewGroup.removeAllViews();
    }

    public final int Go(String str) {
        return ((Keva) this.LLJI.getValue()).getInt(Ho(str), 0);
    }

    public final String Ho(String str) {
        boolean z;
        String str2;
        C0XQ7.LJ();
        String curUserId = C0XQ7.LIZ.LJIIJ().getCurUserId();
        if (curUserId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            curUserId = CardStruct.IStatusCode.DEFAULT;
        }
        C0OLV c0olv = (C0OLV) this.LLIZLLLIL.getValue();
        if (c0olv != null && (str2 = c0olv.LL) != null) {
            str3 = str2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(str3);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C786410Ut5.j4("need_show_bb_easter_egg_%s", Arrays.copyOf(new Object[]{C2188811AlT.LIZIZ(sbLIZ)}, 1));
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEasterEggAbility
    public final void PP1(C0OST c0ost) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C636780OyK(this, c0ost, null), 2);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        super.onViewCreated(view);
        List<BulletinBoardEasterEggSetting.BulletinBoardEasterEggInfo> list = BulletinBoardEasterEggSetting.LIZ().easterEggInfo;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<BulletinBoardEasterEggSetting.BulletinBoardEasterEggInfo> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = it2.next().bulletinBoardId;
                C0OLV c0olv = (C0OLV) this.LLIZLLLIL.getValue();
                if (c0olv != null) {
                    str = c0olv.LL;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    C620010OTn c620010OTn = C620010OTn.LIZ;
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                    AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(176);
                    AFwS240S0000000_9 aFwS240S0000000_92 = AFwS240S0000000_9.get$arr$(177);
                    c620010OTn.getClass();
                    C620010OTn.LIZJ(lifecycleScope, "music_lynx_egg", "pages/home/template.js", aFwS240S0000000_9, aFwS240S0000000_92);
                    break;
                }
            }
        }
        C736680Sv4.LJIIIIZZ(this, this.LLJ.getValue(), new C2217381BqS() { // from class: X.0OMQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLIZLLLIL;
            }
        }, null, new AwS623S0100000_9(this, 42), 6);
    }
}
