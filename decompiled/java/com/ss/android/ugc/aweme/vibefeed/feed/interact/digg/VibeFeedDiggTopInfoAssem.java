package com.ss.android.ugc.aweme.vibefeed.feed.interact.digg;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C069P;
import X.C08QP;
import X.C09RB;
import X.C0FG7;
import X.C0OM1;
import X.C0XQ7;
import X.C11JF;
import X.C1220000hqw;
import X.C1246110iX3;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13BV;
import X.C13DV;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1575440r6E;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C1697820uHc;
import X.C1701940uOG;
import X.C1939607ik;
import X.C19719912Dl;
import X.C1BGS;
import X.C2177241AIw;
import X.C2177251AIx;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C5185020h;
import X.C628930Olf;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C908580Zke;
import X.EnumC912680ZrG;
import Y.AfS193S0100000_24;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class VibeFeedDiggTopInfoAssem extends UISlotAssem {
    public View LLJJI;
    public TuxIconView LLJJIII;
    public C0FG7 LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxNavBar LLJJIJIL;
    public C11JF LLJJJ;
    public final C1559260qg8 LLJJJIL = new C1559260qg8(new C723580SZw(this, C628930Olf.class, "VibeFeedDiggDetailHierarchyData"), checkSupervisorPrepared());
    public final C736950SvV LLJJJJ;
    public final C736950SvV LLJJJJJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.i87;
    }

    public VibeFeedDiggTopInfoAssem() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(404);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VibeFeedDiggDetailListVM.class);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(527);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24((AbstractC738140SxQ) this, 1499);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJJJ = new C736950SvV(c19719912DlLIZ, aFwS213S0000000_24, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS264S0000000_24, awS568S0100000_24, c451610HnL, c723700Sa8);
        AFwS213S0000000_24 aFwS213S0000000_242 = AFwS213S0000000_24.get$arr$(403);
        this.LLJJJJJIL = new C736950SvV(C13LE.LIZ(VibeFeedEntranceViewModel.class), aFwS213S0000000_242, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(528), new AwS568S0100000_24((AbstractC738140SxQ) this, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    public final void hp(List<? extends UrlModel> list) {
        C11JF c11jf;
        TuxIconView tuxIconView = this.LLJJIII;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
        C0FG7 c0fg7 = this.LLJJIJI;
        if (c0fg7 != null) {
            int visibility = c0fg7.getVisibility();
            c0fg7.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c0fg7);
        }
        C2177241AIw c2177241AIw = new C2177241AIw(getContentView().getContext(), new C1246110iX3(list, 3), new C2177251AIx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), null, 0, 0, 0.8f, 0.0f, 0, 0, null, null, true, false, false, null, 122748));
        C11JF c11jf2 = this.LLJJJ;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LLJJJ) != null) {
            c11jf.dispose();
        }
        this.LLJJJ = (C11JF) c2177241AIw.LIZLLL().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS193S0100000_24(this, 23));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        String str;
        String uid;
        List<? extends UrlModel> listLJIIJJI;
        UrlModel avatarThumb;
        EnumC912680ZrG enumC912680ZrG;
        super.onViewCreated(view);
        this.LLJJI = view.findViewById(R.id.fu2);
        this.LLJJIII = (TuxIconView) view.findViewById(R.id.fu3);
        this.LLJJIJI = (C0FG7) view.findViewById(R.id.onv);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.mnp);
        this.LLJJIJIL = (TuxNavBar) view.findViewById(R.id.mnq);
        TuxNavBar tuxNavBar = this.LLJJIJIL;
        if (tuxNavBar != null) {
            tuxNavBar.setNavBackground(0);
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZJ(new AwS556S0100000_12(tuxNavBar, 22));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = tuxNavBar.getContext().getString(2131848002);
            c0om1.LIZJ = c1250250idj;
            tuxNavBar.setNavActions(c0om1);
        }
        C736680Sv4.LJIIIIZZ(this, this.LLJJJJ.getValue(), new C2217381BqS() { // from class: X.0Ols
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C628860OlY) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new C5185020h(this, 0), 4);
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        C628930Olf c628930Olf = (C628930Olf) this.LLJJJIL.getValue();
        if (c628930Olf != null && (enumC912680ZrG = c628930Olf.LLIZLLLIL) != null && enumC912680ZrG.isGroup()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Iterable iterable = ((C908580Zke) this.LLJJJJJIL.getValue().getState()).LLILLL;
            if (iterable == null) {
                iterable = C13BV.INSTANCE;
            }
            List listLJJII = C09RB.LJJII(C09RB.LJIJI(new C08QP(new C1939607ik(C13LP.LLIIII(iterable)), AFwS264S0000000_24.get$arr$(7)), new AwS603S0100000_24(curUser, 6)));
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            if (curUser != null && (avatarThumb = curUser.getAvatarThumb()) != null) {
                c13dvLIZIZ.add(avatarThumb);
            }
            c13dvLIZIZ.addAll(listLJJII);
            List<? extends UrlModel> listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
            if (listLIZ.size() <= 2) {
                hp(listLIZ);
                return;
            }
            TuxIconView tuxIconView = this.LLJJIII;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            C0FG7 c0fg7 = this.LLJJIJI;
            if (c0fg7 != null) {
                int visibility = c0fg7.getVisibility();
                c0fg7.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c0fg7);
            }
            C0FG7 c0fg72 = this.LLJJIJI;
            if (c0fg72 == null) {
                return;
            }
            c0fg72.LIZ(listLIZ, true);
            return;
        }
        IMContactApi.LIZ.getClass();
        C1BGS c1bgsLJ = C069P.LIZ().LJ();
        C628930Olf c628930Olf2 = (C628930Olf) this.LLJJJIL.getValue();
        String uid2 = null;
        if (c628930Olf2 != null) {
            str = c628930Olf2.LL;
        } else {
            str = null;
        }
        IMUser iMUserLJ = c1bgsLJ.LJ(str, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initData curUserId:");
        sbLIZ.append(C1575440r6E.LIZ());
        sbLIZ.append(" mine:");
        if (curUser != null) {
            uid = curUser.getUid();
        } else {
            uid = null;
        }
        sbLIZ.append(uid);
        sbLIZ.append(" toUser:");
        if (iMUserLJ != null) {
            uid2 = iMUserLJ.getUid();
        }
        sbLIZ.append(uid2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (iMUserLJ == null || iMUserLJ.getAvatarThumb() == null || curUser == null || curUser.getAvatarThumb() == null) {
            return;
        }
        UrlModel avatarThumb2 = iMUserLJ.getAvatarThumb();
        if (avatarThumb2 == null || (listLJIIJJI = C1697810uHb.LJIIJJI(avatarThumb2, curUser.getAvatarThumb())) == null) {
            listLJIIJJI = C13BV.INSTANCE;
        }
        hp(listLJIIJJI);
    }
}
