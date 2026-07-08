package com.ss.android.ugc.aweme.vibefeed.feed.topbar.assem;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C019F;
import X.C01GW;
import X.C069P;
import X.C0FG6;
import X.C0XQ7;
import X.C1220000hqw;
import X.C13BV;
import X.C13DV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1559260qg8;
import X.C1575440r6E;
import X.C1575980r76;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1697820uHc;
import X.C19719912Dl;
import X.C1BGS;
import X.C2217381BqS;
import X.C430200Gtu;
import X.C438710HIf;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C636770OyJ;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C908580Zke;
import X.EnumC912680ZrG;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel;
import com.ss.android.ugc.aweme.vibefeed.viewmodel.VibeFeedUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class VibeFeedAvatarAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C636770OyJ.class, null), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final List<VibeFeedUser> LLJILJILJ;
    public final List<String> LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VibeFeedAvatarAssem.class, "consumeVM", "getConsumeVM()Lcom/ss/android/ugc/aweme/vibefeed/feed/viewmodel/VibeFeedConsumeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public VibeFeedAvatarAssem() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(405);
        this.LLJ = new C736950SvV(C13LE.LIZ(VibeFeedEntranceViewModel.class), aFwS213S0000000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(531), new AwS568S0100000_24((AbstractC738140SxQ) this, 1505), new C451610HnL(this, true, true), new C723700Sa8(this));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VibeFeedConsumeViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1504), AFwS264S0000000_24.get$arr$(530), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1502));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1503));
        this.LLJILJILJ = new ArrayList();
        this.LLJILLL = new ArrayList();
    }

    public final void Ho() {
        String strLIZ = C1575440r6E.LIZ();
        List<VibeFeedUser> list = this.LLJILJILJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (true ^ Intrinsics.LJFF(((VibeFeedUser) obj).userId, strLIZ)) {
                arrayList.add(obj);
            }
        }
        if (!((ArrayList) this.LLJILLL).isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((VibeFeedUser) it2.next()).userId);
            }
            if (C13LP.LJJL(arrayList2, this.LLJILLL).size() == ((ArrayList) this.LLJILLL).size()) {
                return;
            }
        }
        if (arrayList.size() <= 1) {
            C786410Ut5.LLLLLJLJLL((C430200Gtu) this.LLJIJIL.getValue(), 0);
            View view = (View) this.LLJILJIL.getValue();
            int visibility = view.getVisibility();
            view.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, view);
            ((ArrayList) this.LLJILLL).clear();
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            List<String> list2 = this.LLJILLL;
            if (strLIZ == null) {
                strLIZ = "";
            }
            ((ArrayList) list2).add(strLIZ);
            c13dvLIZIZ.add(C438710HIf.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAvatarThumb()));
            List<VibeFeedUser> listLL = C13LP.LL(arrayList, 1);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
            for (VibeFeedUser vibeFeedUser : listLL) {
                List<String> list3 = this.LLJILLL;
                String str = vibeFeedUser.userId;
                if (str == null) {
                    str = "";
                }
                ((ArrayList) list3).add(str);
                arrayList3.add(C438710HIf.LIZ(vibeFeedUser.avatarThumb));
            }
            c13dvLIZIZ.addAll(arrayList3);
            Go(C1697820uHc.LIZ(c13dvLIZIZ));
            return;
        }
        C786410Ut5.LLLLLJLJLL((C430200Gtu) this.LLJIJIL.getValue(), 8);
        View view2 = (View) this.LLJILJIL.getValue();
        int visibility2 = view2.getVisibility();
        view2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, view2);
        ((ArrayList) this.LLJILLL).clear();
        C0FG6 c0fg6 = (C0FG6) this.LLJILJIL.getValue();
        C13DV c13dvLIZIZ2 = C1697820uHc.LIZIZ();
        List<String> list4 = this.LLJILLL;
        if (strLIZ == null) {
            strLIZ = "";
        }
        ((ArrayList) list4).add(strLIZ);
        c13dvLIZIZ2.add(C438710HIf.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAvatarThumb()));
        List<VibeFeedUser> listLL2 = C13LP.LL(arrayList, 3);
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listLL2, 10));
        for (VibeFeedUser vibeFeedUser2 : listLL2) {
            List<String> list5 = this.LLJILLL;
            String str2 = vibeFeedUser2.userId;
            if (str2 == null) {
                str2 = "";
            }
            ((ArrayList) list5).add(str2);
            arrayList4.add(C438710HIf.LIZ(vibeFeedUser2.avatarThumb));
        }
        c13dvLIZIZ2.addAll(arrayList4);
        c0fg6.setAvatars(C1697820uHc.LIZ(c13dvLIZIZ2));
    }

    public final void Go(List<? extends ImageUrlModel> list) {
        Object imageUrlModel;
        Object imageUrlModel2;
        C430200Gtu c430200Gtu = (C430200Gtu) this.LLJIJIL.getValue();
        if (list == null || (imageUrlModel = C13LP.LJJJLZIJ(0, list)) == null) {
            imageUrlModel = new ImageUrlModel("", C13BV.INSTANCE);
        }
        C430200Gtu.LIZ(c430200Gtu, imageUrlModel);
        if (list == null || (imageUrlModel2 = C13LP.LJJJLZIJ(1, list)) == null) {
            imageUrlModel2 = new ImageUrlModel("", C13BV.INSTANCE);
        }
        C430200Gtu.LIZIZ(c430200Gtu, imageUrlModel2);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Boolean boolValueOf;
        String str;
        EnumC912680ZrG enumC912680ZrG;
        super.onViewCreated(view);
        C636770OyJ c636770OyJ = (C636770OyJ) this.LLIZLLLIL.getValue();
        String str2 = null;
        if (c636770OyJ != null && (enumC912680ZrG = c636770OyJ.LL) != null) {
            boolValueOf = Boolean.valueOf(enumC912680ZrG.isGroup());
        } else {
            boolValueOf = null;
        }
        if (C1575980r76.LIZLLL(boolValueOf)) {
            List<VibeFeedUser> list = ((C908580Zke) this.LLJ.getValue().getState()).LLILLL;
            if (list != null && !list.isEmpty()) {
                ((ArrayList) this.LLJILJILJ).clear();
                ((ArrayList) this.LLJILJILJ).addAll(list);
                Ho();
            }
            AssemVMLazy assemVMLazy = this.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0r14
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0P3X) obj).LLJIJIL;
                }
            }, null, new AwS638S0100000_24(this, 127), 6);
            C736680Sv4.LJIIIIZZ(this, this.LLJI.getValue(), new C2217381BqS() { // from class: X.0P3p
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C0P3X) obj).LLILZ);
                }
            }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 128), 4);
            return;
        }
        C786410Ut5.LLLLLJLJLL((C430200Gtu) this.LLJIJIL.getValue(), 0);
        View view2 = (View) this.LLJILJIL.getValue();
        int visibility = view2.getVisibility();
        view2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, view2);
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        c13dvLIZIZ.add(C438710HIf.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAvatarThumb()));
        IMContactApi.LIZ.getClass();
        C1BGS c1bgsLJ = C069P.LIZ().LJ();
        C636770OyJ c636770OyJ2 = (C636770OyJ) this.LLIZLLLIL.getValue();
        if (c636770OyJ2 != null) {
            str = c636770OyJ2.LLILLJJLI;
        } else {
            str = null;
        }
        C636770OyJ c636770OyJ3 = (C636770OyJ) this.LLIZLLLIL.getValue();
        if (c636770OyJ3 != null) {
            str2 = c636770OyJ3.LLILLL;
        }
        IMUser iMUserLIZLLL = c1bgsLJ.LIZLLL(str, str2, "shared_feed");
        if (iMUserLIZLLL != null) {
            c13dvLIZIZ.add(C438710HIf.LIZ(iMUserLIZLLL.getAvatarThumb()));
        }
        Go(C1697820uHc.LIZ(c13dvLIZIZ));
    }
}
