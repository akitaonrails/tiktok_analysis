package com.ss.android.ugc.aweme.inbox.bulletin.comment.assem;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C0I7D;
import X.C0OTL;
import X.C0OTQ;
import X.C0P4X;
import X.C0XQ7;
import X.C1220000hqw;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1336205Ku;
import X.C13LE;
import X.C1559260qg8;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C451610HnL;
import X.C452070Ho5;
import X.C458810Hyx;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC456120Huc;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS623S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentKeyboardInputAssem extends UIContentAssem implements InterfaceC737790Swr {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C0OTQ.class, "BulletinCommentKeyboardHierarchyData"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public final C736950SvV LLJI;
    public C0I7D LLJIJIL;

    public final BulletinCommentActionViewModel Go() {
        return (BulletinCommentActionViewModel) this.LLJI.getValue();
    }

    public BulletinCommentKeyboardInputAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinCommentListViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(285);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9((AbstractC738140SxQ) this, 497);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJ = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_9, awS553S0100000_9, c451610HnL, c723700Sa8);
        this.LLJI = new C736950SvV(C13LE.LIZ(BulletinCommentActionViewModel.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(286), new AwS553S0100000_9((AbstractC738140SxQ) this, 498), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BulletinFragmentScope.class}).unbindAbility(this.LLJ.getValue(), C0OTL.class);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0OXe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OWY) obj).LLIZ;
            }
        }, null, new AwS623S0100000_9(this, 214), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0OWW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OWY) obj).LLILLJJLI;
            }
        }, null, new AwS623S0100000_9(this, 215), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0OWZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OWY) obj).LLILZ;
            }
        }, null, new AwS623S0100000_9(this, 216), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0OWX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OWY) obj).LLILLL;
            }
        }, null, new AwS616S0100000_2(this, 134), 6);
        View viewFindViewById = LJJIJL().findViewById(R.id.czr);
        TextView textView = (TextView) viewFindViewById;
        textView.setText(Go().getState().LLILZLL);
        textView.addTextChangedListener(new C0P4X(this, 6));
        this.LLJIJIL = (C0I7D) viewFindViewById;
        SmartImageView smartImageView = (SmartImageView) LJJIJL().findViewById(R.id.czp);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getAvatarUrl());
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
        c1331670kl3LJIIIZ.LJJIIZI(c419910GdJ.LIZ(LJJIJL().getContext()));
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_color_default_avatar;
        c1331670kl3LJIIIZ.LJIL(c419910GdJ2.LIZ(LJJIJL().getContext()));
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        c1331670kl3LJIIIZ.LJJIJLIJ = true;
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        C1336205Ku.LIZ(false).getAssembleEmojiPanelService().LIZIZ(this, new RequestKeyboardAbility() { // from class: com.ss.android.ugc.aweme.inbox.bulletin.comment.assem.BulletinCommentKeyboardInputAssem$initView$3$1
            @Override // com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility
            public final void Fr() {
                BulletinCommentActionViewModel bulletinCommentActionViewModelGo = this.LL.Go();
                bulletinCommentActionViewModelGo.getClass();
                bulletinCommentActionViewModelGo.setState(new AwS21S0010000_6(true, 23));
            }
        }, R.id.czs);
        C197039127h c197039127h = (C197039127h) LJJIJL().findViewById(R.id.czu);
        if (c197039127h != null) {
            if (Go().getState().LLILZLL.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            c197039127h.setEnabled(z);
            C786410Ut5.I7(new AbS691S0100000_9(this, 59, 42), c197039127h);
        }
        C0OTQ c0otq = (C0OTQ) this.LLIZLLLIL.getValue();
        if (c0otq != null && c0otq.LL) {
            BulletinCommentActionViewModel bulletinCommentActionViewModelGo = Go();
            C458810Hyx c458810Hyx = C458810Hyx.LL;
            bulletinCommentActionViewModelGo.getClass();
            bulletinCommentActionViewModelGo.setState(new AwS588S0100000_9((InterfaceC456120Huc) c458810Hyx, 652));
            return;
        }
        BulletinCommentActionViewModel bulletinCommentActionViewModelGo2 = Go();
        bulletinCommentActionViewModelGo2.getClass();
        bulletinCommentActionViewModelGo2.setState(new AwS21S0010000_6(true, 23));
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BulletinFragmentScope.class}).bindAbility(this.LLJ.getValue(), C0OTL.class);
    }
}
