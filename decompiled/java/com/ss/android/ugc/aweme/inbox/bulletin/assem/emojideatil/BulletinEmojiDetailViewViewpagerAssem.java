package com.ss.android.ugc.aweme.inbox.bulletin.assem.emojideatil;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C036E;
import X.C0CTJ;
import X.C0OPQ;
import X.C0OZL;
import X.C0P4A;
import X.C0PEM;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C1846060y8i;
import X.C20684815ws;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C844470XAv;
import X.InterfaceC1146704e9;
import X.InterfaceC622800Obm;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinEmojiDetailFragmentData;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinEmojiTab;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiDetailViewViewpagerAssem extends UIContentAssem implements InterfaceC737790Swr, InterfaceC1146704e9 {
    public ViewOnAttachStateChangeListenerC20631115oD LLIZLLLIL;
    public C1846060y8i LLJ;
    public final C1559260qg8 LLJI = new C1559260qg8(new C723580SZw(this, C0OZL.class, "BulletinEmojiDetailSheetHierarchyData"), checkSupervisorPrepared());
    public final C736950SvV LLJIJIL;
    public final C01GW LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public List<BulletinEmojiDetailFragmentData> LLJJI;

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BulletinFragmentScope.class}).unbindAbility(Jo(), InterfaceC622800Obm.class);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BulletinFragmentScope.class}).bindAbility(Jo(), InterfaceC622800Obm.class);
    }

    public final C1846060y8i Go() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d0r) : null;
            this.LLJ = (C1846060y8i) viewFindViewById;
        }
        return (C1846060y8i) viewFindViewById;
    }

    public final ViewOnAttachStateChangeListenerC20631115oD Ho() {
        return (ViewOnAttachStateChangeListenerC20631115oD) this.LLJILJIL.getValue();
    }

    public final BulletinEmojiDetailViewModel Jo() {
        return (BulletinEmojiDetailViewModel) this.LLJIJIL.getValue();
    }

    public BulletinEmojiDetailViewViewpagerAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 372);
        this.LLJIJIL = new C736950SvV(C13LE.LIZ(BulletinEmojiDetailViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(218), new AwS553S0100000_9((AbstractC738140SxQ) this, 370), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 371));
        this.LLJILJILJ = true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        BulletinEmojiDetailViewModel bulletinEmojiDetailViewModelJo = Jo();
        bulletinEmojiDetailViewModelJo.getClass();
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                bulletinEmojiDetailViewModelJo.LLILZ.put("All", new ArrayList());
                C23250099c.LIZLLL(bulletinEmojiDetailViewModelJo.getAssemVMScope(), C0PEM.LIZJ, null, new C0CTJ(bulletinEmojiDetailViewModelJo, null), 2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void Lo(String str) {
        int i;
        C0OZL c0ozl = (C0OZL) this.LLJI.getValue();
        if (c0ozl != null) {
            C0OPQ c0opq = C0OPQ.LIZ;
            String strValueOf = String.valueOf(c0ozl.LL);
            String strValueOf2 = String.valueOf(c0ozl.LLILLJJLI);
            BulletinEmojiTab bulletinEmojiTab = Jo().LLILZIL;
            if (bulletinEmojiTab != null) {
                i = (int) bulletinEmojiTab.count;
            } else {
                i = 0;
            }
            c0opq.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
            c2344009Gk.LJIIIIZZ("channel_id", strValueOf);
            c2344009Gk.LJIIIIZZ("message_id", strValueOf2);
            c2344009Gk.LJIIIIZZ("enter_method", str);
            c2344009Gk.LIZJ(i, "emoji_cnt");
            C20684815ws.LJIILLIIL("enter_interaction_details_all_tab", c2344009Gk.LIZ);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIZ(this, Jo(), new C2217381BqS() { // from class: X.0Obh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C622710Obd) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0Obe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C622710Obd) obj).LLILLL;
            }
        }, null, new AwS658S0100000_9(this, 18), 12);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0Obf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C622710Obd) obj).LLILZ;
            }
        }, null, AFwS292S0000000_9.get$arr$(42), 6);
        Ho().registerOnPageChangeCallback(new C0P4A(this, 1));
    }
}
