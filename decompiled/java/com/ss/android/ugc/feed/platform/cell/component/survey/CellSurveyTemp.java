package com.ss.android.ugc.feed.platform.cell.component.survey;

import X.C01GW;
import X.C035D;
import X.C0J0X;
import X.C0R5O;
import X.C0R5P;
import X.C0R5R;
import X.C0R5T;
import X.C0R5U;
import X.C0RH0;
import X.C0SUL;
import X.C1047660dMy;
import X.C1386360mBG;
import X.C19660111vz;
import X.C19660411w2;
import X.C19660511w3;
import X.C1ER1;
import X.C20285314Yx;
import X.C20286514Zj;
import X.C20286814Zm;
import X.C287350BOb;
import X.C452501pT;
import X.C692060RCq;
import X.C704220Rjo;
import X.InterfaceC689860R4e;
import X.InterfaceC690490R6p;
import X.InterfaceC987400bnm;
import Y.AObjectS386S0100000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.survey.ability.ISurveyInteractAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class CellSurveyTemp implements CellSurveyComponentAbility {
    public final VideoViewCell LL;
    public final View LLILLJJLI;
    public final Function0<InterfaceC689860R4e> LLILLL;
    public Aweme LLILZIL;
    public BaseFeedPageParams LLILZLL;
    public final View LLJ;
    public final View LLJI;
    public final View LLJIJIL;
    public final SmartImageView LLJILJIL;
    public final C0RH0 LLJILJILJ;
    public final C0SUL LLJILLL;
    public final C704220Rjo LLJJ;
    public final ImageView LLJJI;
    public final View LLJJIII;
    public final View LLJJIJI;
    public final FrameLayout LLJJIJIIJIL;
    public final View LLJJIJIL;
    public final View LLJJJ;
    public final ViewStub LLJJJJJIL;
    public final ViewStub LLJJL;
    public final ViewStub LLJJLIIIJLLLLLLLZ;
    public final ViewStub LLJL;
    public final ViewStub LLJLIL;
    public final C0J0X LLJLILLLLZIIL;
    public C20286814Zm LLJLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C0R5R(this));
    public final C01GW LLIZ = C452501pT.LIZIZ(new C0R5O(this));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C0R5P(this));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new C0R5U());
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new C0R5T());
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(10));

    public final C19660111vz LIZ() {
        return (C19660111vz) this.LLJJJJLIIL.getValue();
    }

    public final Context LIZIZ() {
        return (Context) this.LLILZ.getValue();
    }

    public final CellSurveyComponentAbility LIZLLL() {
        return (CellSurveyComponentAbility) this.LLIZLLLIL.getValue();
    }

    public final InterfaceC690490R6p LJFF() {
        InterfaceC987400bnm interfaceC987400bnmLJJLL;
        if (C1ER1.LIZIZ.LJIIIIZZ(LIZIZ())) {
            return (InterfaceC690490R6p) this.LLJJJJ.getValue();
        }
        if (!C1047660dMy.LIZIZ.Z2(this.LLILZIL)) {
            return ((C20285314Yx) this.LLJJJIL.getValue()).LIZ(this.LLILZIL);
        }
        InterfaceC689860R4e interfaceC689860R4eInvoke = this.LLILLL.invoke();
        if (interfaceC689860R4eInvoke == null || (interfaceC987400bnmLJJLL = interfaceC689860R4eInvoke.LJJLL()) == null) {
            return null;
        }
        return interfaceC987400bnmLJJLL.HG0();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final boolean Gg1() {
        if (C287350BOb.LIZ()) {
            CellSurveyComponentAbility cellSurveyComponentAbilityLIZLLL = LIZLLL();
            if (cellSurveyComponentAbilityLIZLLL != null) {
                return cellSurveyComponentAbilityLIZLLL.Gg1();
            }
            return false;
        }
        C20286814Zm c20286814Zm = this.LLJLL;
        if (c20286814Zm != null) {
            return c20286814Zm.LJIJJ;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void Uc() {
        if (C287350BOb.LIZ()) {
            CellSurveyComponentAbility cellSurveyComponentAbilityLIZLLL = LIZLLL();
            if (cellSurveyComponentAbilityLIZLLL != null) {
                cellSurveyComponentAbilityLIZLLL.Uc();
                return;
            }
            return;
        }
        C692060RCq.LIZIZ(this.LLILZIL);
        LJI(false);
        ISurveyInteractAbility iSurveyInteractAbility = (ISurveyInteractAbility) this.LLIZ.getValue();
        if (iSurveyInteractAbility != null) {
            iSurveyInteractAbility.Qn1();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void de0() {
        if (C287350BOb.LIZ()) {
            CellSurveyComponentAbility cellSurveyComponentAbilityLIZLLL = LIZLLL();
            if (cellSurveyComponentAbilityLIZLLL != null) {
                cellSurveyComponentAbilityLIZLLL.de0();
                return;
            }
            return;
        }
        C0RH0 c0rh0 = this.LLJILJILJ;
        if (c0rh0 != null) {
            c0rh0.LLILZ = this.LLJLL;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void ev() {
        if (C287350BOb.LIZ()) {
            CellSurveyComponentAbility cellSurveyComponentAbilityLIZLLL = LIZLLL();
            if (cellSurveyComponentAbilityLIZLLL != null) {
                cellSurveyComponentAbilityLIZLLL.ev();
                return;
            }
            return;
        }
        if (C20286514Zj.LJFF(this.LLILZIL) || !C1386360mBG.LJII(false)) {
            return;
        }
        InterfaceC690490R6p interfaceC690490R6pLJFF = LJFF();
        if (interfaceC690490R6pLJFF != null) {
            interfaceC690490R6pLJFF.LJIIJ(this.LLJJLIIIJLLLLLLLZ, LIZIZ(), this.LLILZIL, this.LLJ, this.LLJI, this.LLJJJ, this.LLJJIJIL, true, null);
        }
        InterfaceC690490R6p interfaceC690490R6pLJFF2 = LJFF();
        if (interfaceC690490R6pLJFF2 != null) {
            interfaceC690490R6pLJFF2.LJIILIIL();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void qi() {
        InterfaceC690490R6p interfaceC690490R6pLJFF;
        if (C287350BOb.LIZ()) {
            CellSurveyComponentAbility cellSurveyComponentAbilityLIZLLL = LIZLLL();
            if (cellSurveyComponentAbilityLIZLLL != null) {
                cellSurveyComponentAbilityLIZLLL.qi();
                return;
            }
            return;
        }
        if ((C20286514Zj.LJFF(this.LLILZIL) || Gg1()) && (interfaceC690490R6pLJFF = LJFF()) != null) {
            interfaceC690490R6pLJFF.LJI();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final boolean ti2() {
        if (C287350BOb.LIZ()) {
            CellSurveyComponentAbility cellSurveyComponentAbilityLIZLLL = LIZLLL();
            if (cellSurveyComponentAbilityLIZLLL != null) {
                return cellSurveyComponentAbilityLIZLLL.ti2();
            }
            return false;
        }
        InterfaceC690490R6p interfaceC690490R6pLJFF = LJFF();
        if (interfaceC690490R6pLJFF != null) {
            return interfaceC690490R6pLJFF.isShowing();
        }
        return false;
    }

    public final void LJI(boolean z) {
        InterfaceC690490R6p interfaceC690490R6pLJFF;
        ViewStub viewStub;
        C20286814Zm c20286814Zm = this.LLJLL;
        if (c20286814Zm != null) {
            c20286814Zm.LJIJJ(z);
            if (z && (interfaceC690490R6pLJFF = LJFF()) != null) {
                if (C1047660dMy.LIZIZ.Z2(this.LLILZIL)) {
                    viewStub = this.LLJJL;
                } else {
                    viewStub = this.LLJLIL;
                }
                interfaceC690490R6pLJFF.LJIIJ(viewStub, LIZIZ(), this.LLILZIL, this.LLJ, this.LLJI, this.LLJJJ, this.LLJJIJIL, false, this.LLJLL);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void Rl(C035D c035d) {
        ViewStub viewStub;
        if (C287350BOb.LIZ()) {
            CellSurveyComponentAbility cellSurveyComponentAbilityLIZLLL = LIZLLL();
            if (cellSurveyComponentAbilityLIZLLL != null) {
                cellSurveyComponentAbilityLIZLLL.Rl(c035d);
                return;
            }
            return;
        }
        Aweme aweme = this.LLILZIL;
        if (c035d == null || c035d.LIZ == null || aweme == null || !Intrinsics.LJFF(c035d.LIZ.getAid(), aweme.getAid())) {
            return;
        }
        if (c035d.LIZIZ >= 90.0f) {
            if (!LIZ().LJIILL() || LIZ().isShowing()) {
                return;
            }
            LIZ().LJIIJ(this.LLJJJJJIL, LIZIZ(), this.LLILZIL, this.LLJ, this.LLJI, this.LLJJJ, this.LLJJIJIL, false, null);
            return;
        }
        if (!C19660511w3.LJIIIIZZ(LIZIZ(), this.LLILZIL)) {
            return;
        }
        if (LIZ().LL == null) {
            C19660411w2 c19660411w2 = C19660411w2.LIZ;
            String str = C19660511w3.LIZIZ;
            Boolean bool = C19660511w3.LJFF;
            c19660411w2.getClass();
            C19660411w2.LIZIZ(bool, str);
        }
        if (LIZ().LJIILL() || (viewStub = this.LLJJJJJIL) == null) {
            return;
        }
        LIZ().LJIILJJIL(viewStub, LIZIZ(), this.LLILZIL, this.LLJ);
    }

    public CellSurveyTemp(VideoViewCell videoViewCell, View view, AObjectS386S0100000_11 aObjectS386S0100000_11) {
        this.LL = videoViewCell;
        this.LLILLJJLI = view;
        this.LLILLL = aObjectS386S0100000_11;
        this.LLJ = view.findViewById(R.id.widget_container);
        this.LLJI = view.findViewById(R.id.bm5);
        if (videoViewCell.go1() && videoViewCell.Hk() != null) {
            this.LLJIJIL = videoViewCell.Hk();
        } else {
            this.LLJIJIL = view.findViewById(R.id.player_view);
        }
        this.LLJILJIL = (SmartImageView) view.findViewById(R.id.cover);
        this.LLJILJILJ = (C0RH0) view.findViewById(R.id.oqx);
        this.LLJILLL = (C0SUL) view.findViewById(R.id.long_press_layout);
        this.LLJJ = (C704220Rjo) view.findViewById(R.id.j4r);
        this.LLJJI = (ImageView) view.findViewById(R.id.qmw);
        this.LLJJIII = view.findViewById(R.id.tjh);
        this.LLJJIJI = view.findViewById(R.id.hp7);
        this.LLJJIJIIJIL = (FrameLayout) view.findViewById(R.id.qk5);
        this.LLJJIJIL = view.findViewById(R.id.kvf);
        this.LLJJJ = view.findViewById(R.id.vlf);
        this.LLJJL = (ViewStub) view.findViewById(R.id.efd);
        this.LLJJJJJIL = (ViewStub) view.findViewById(R.id.z7);
        this.LLJJLIIIJLLLLLLLZ = (ViewStub) view.findViewById(R.id.j5m);
        this.LLJL = (ViewStub) view.findViewById(R.id.ihz);
        this.LLJLIL = (ViewStub) view.findViewById(R.id.bor);
        this.LLJLILLLLZIIL = (C0J0X) view.findViewById(R.id.boq);
    }
}
