package com.ss.android.ugc.profile.business.profile.edit.list;

import X.C01GW;
import X.C1158850gGJ;
import X.C11NJ;
import X.C1214430hhx;
import X.C15438062q;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.C736460Sui;
import X.EnumC1216830hlp;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.edit.IProfileEditLinkAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileLinksOrderViewModel extends AssemViewModel<C1158850gGJ> {
    public C11NJ LLILLL;
    public IProfileEditLinkAbility LLILZ;
    public final List<Integer> LL = new ArrayList();
    public final List<Integer> LLILLJJLI = new ArrayList();
    public final List<Integer> LLILZIL = new ArrayList();
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(359));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158850gGJ(0);
    }

    public final String vQ2(int i) {
        Integer numValueOf;
        List<Integer> listGv1;
        IProfileEditLinkAbility iProfileEditLinkAbility = this.LLILZ;
        if (iProfileEditLinkAbility != null && (listGv1 = iProfileEditLinkAbility.Gv1()) != null) {
            numValueOf = Integer.valueOf(listGv1.indexOf(Integer.valueOf(i)) + 1);
        } else {
            numValueOf = null;
        }
        return String.valueOf(numValueOf);
    }

    public final String wQ2(int i) {
        String str;
        User userIx;
        Map<Integer, String> profileLinksMap;
        List<Integer> listGv1;
        IProfileEditLinkAbility iProfileEditLinkAbility = this.LLILZ;
        if (iProfileEditLinkAbility != null && (listGv1 = iProfileEditLinkAbility.Gv1()) != null && !listGv1.contains(Integer.valueOf(i))) {
            return "not_shown";
        }
        IProfileEditLinkAbility iProfileEditLinkAbility2 = this.LLILZ;
        if (iProfileEditLinkAbility2 != null && (userIx = iProfileEditLinkAbility2.Ix()) != null && (profileLinksMap = userIx.getProfileLinksMap()) != null) {
            str = profileLinksMap.get(Integer.valueOf(i));
        } else {
            str = null;
        }
        if (C736460Sui.LIZIZ(str)) {
            return "bold";
        }
        return "blank";
    }

    public final void xQ2(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        EnumC1216830hlp enumC1216830hlp = EnumC1216830hlp.WEBSITE;
        c2344009Gk.LJIIIIZZ("website", wQ2(enumC1216830hlp.getType()));
        EnumC1216830hlp enumC1216830hlp2 = EnumC1216830hlp.INSTAGRAM;
        c2344009Gk.LJIIIIZZ("instagram", wQ2(enumC1216830hlp2.getType()));
        EnumC1216830hlp enumC1216830hlp3 = EnumC1216830hlp.TWITTER;
        c2344009Gk.LJIIIIZZ("twitter", wQ2(enumC1216830hlp3.getType()));
        EnumC1216830hlp enumC1216830hlp4 = EnumC1216830hlp.LEMON8;
        c2344009Gk.LJIIIIZZ("lemon8", wQ2(enumC1216830hlp4.getType()));
        EnumC1216830hlp enumC1216830hlp5 = EnumC1216830hlp.YOUTUBE;
        c2344009Gk.LJIIIIZZ("youtube", wQ2(enumC1216830hlp5.getType()));
        c2344009Gk.LJIIIIZZ("website_order", vQ2(enumC1216830hlp.getType()));
        c2344009Gk.LJIIIIZZ("instagram_order", vQ2(enumC1216830hlp2.getType()));
        c2344009Gk.LJIIIIZZ("twitter_order", vQ2(enumC1216830hlp3.getType()));
        c2344009Gk.LJIIIIZZ("lemon8_order", vQ2(enumC1216830hlp4.getType()));
        c2344009Gk.LJIIIIZZ("youtube_order", vQ2(enumC1216830hlp5.getType()));
        c2344009Gk.LJIIIIZZ("enter_from", "profile_edit_page");
        c2344009Gk.LJIIIIZZ("enter_method", "click_link");
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public final void yQ2(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        ((ArrayList) this.LL).clear();
        List<Integer> list = this.LL;
        List<InterfaceC1891350zJl> listLJII = viewOnAttachStateChangeListenerC20604515jv.getState().LJII();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJII, 10));
        Iterator<InterfaceC1891350zJl> it2 = listLJII.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((C1214430hhx) it2.next()).LL));
        }
        ((ArrayList) list).addAll(new ArrayList(arrayList));
        if (((ArrayList) this.LLILZIL).isEmpty()) {
            ((ArrayList) this.LLILZIL).addAll(this.LL);
        }
    }
}
