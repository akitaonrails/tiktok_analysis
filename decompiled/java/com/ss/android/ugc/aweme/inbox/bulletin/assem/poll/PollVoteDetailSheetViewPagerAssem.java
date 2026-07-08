package com.ss.android.ugc.aweme.inbox.bulletin.assem.poll;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0OJU;
import X.C0OKA;
import X.C0OZB;
import X.C0PEM;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C19U1;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C465950IOz;
import X.C618680OOk;
import X.C621400OYw;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPoll;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPollOption;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPollVoteDetailResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class PollVoteDetailSheetViewPagerAssem extends UIContentAssem implements InterfaceC737790Swr, InterfaceC1146704e9 {
    public C19U1 LLIZLLLIL;
    public ViewPager LLJ;
    public final C1559260qg8 LLJI = new C1559260qg8(new C723580SZw(this, C621400OYw.class, "BulletinPollVoteDetailCommonHierarchyData"), checkSupervisorPrepared());
    public final C736950SvV LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final List<View> LLJILLL;
    public final int LLJJ;
    public final int LLJJI;
    public int LLJJIII;

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

    public final C621400OYw Go() {
        return (C621400OYw) this.LLJI.getValue();
    }

    public final ViewPager Ho() {
        return (ViewPager) this.LLJILJILJ.getValue();
    }

    public PollVoteDetailSheetViewPagerAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 464);
        this.LLJIJIL = new C736950SvV(C13LE.LIZ(BulletinPollVoteDetailViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(263), new AwS553S0100000_9((AbstractC738140SxQ) this, 461), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 462));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 463));
        this.LLJILLL = new ArrayList();
        this.LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2;
        this.LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        BulletinPollVoteDetailViewModel bulletinPollVoteDetailViewModel = (BulletinPollVoteDetailViewModel) this.LLJIJIL.getValue();
        C23250099c.LIZLLL(bulletinPollVoteDetailViewModel.getAssemVMScope(), C0PEM.LIZJ, null, new C465950IOz(bulletinPollVoteDetailViewModel, null), 2);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        List<BulletinPollOption> list;
        C621400OYw c621400OYwGo;
        C618680OOk c618680OOk;
        C0OJU c0oju;
        super.onDestroy();
        BulletinPollVoteDetailResponse bulletinPollVoteDetailResponse = ((BulletinPollVoteDetailViewModel) this.LLJIJIL.getValue()).LLILLL;
        if (bulletinPollVoteDetailResponse == null || (list = bulletinPollVoteDetailResponse.options) == null || (c621400OYwGo = Go()) == null || (c618680OOk = c621400OYwGo.LLIZ) == null) {
            return;
        }
        BulletinPoll bulletinPoll = c618680OOk.LLILZLL;
        C618680OOk c618680OOkLLIIIL = C618680OOk.LLIIIL(c618680OOk, bulletinPoll.copy(bulletinPoll.title, bulletinPoll.duration, list, bulletinPoll.pollId, Long.valueOf(bulletinPollVoteDetailResponse.totalVoteCount), bulletinPoll.resultViewable, bulletinPoll.pollExpired), false, false, false, false, 0, 0, 0, null, 1048574);
        C621400OYw c621400OYwGo2 = Go();
        if (c621400OYwGo2 == null || (c0oju = c621400OYwGo2.LLILZLL) == null) {
            return;
        }
        c0oju.jZ1(c618680OOk, c618680OOkLLIIIL, C0OKA.UPDATE);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BulletinFragmentScope.class}).unbindAbility(this.LLJIJIL.getValue(), C0OZB.class);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIZ(this, (AssemViewModel) this.LLJIJIL.getValue(), new C2217381BqS() { // from class: X.0OZ2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OZ3) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0OYy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OZ3) obj).LLILLJJLI;
            }
        }, null, new AwS658S0100000_9(this, 22), 12);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BulletinFragmentScope.class}).bindAbility(this.LLJIJIL.getValue(), C0OZB.class);
    }
}
