package com.ss.android.ugc.profile.business.ur.socialavatar.review;

import X.AbstractC316870CbV;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0HFC;
import X.C0HFD;
import X.C0HFE;
import X.C0HFR;
import X.C0HFS;
import X.C0HNI;
import X.C0VSJ;
import X.C0XQ7;
import X.C1245160iVW;
import X.C1322200kVm;
import X.C1325710kbR;
import X.C13BV;
import X.C15438062q;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C1782840wUk;
import X.C20684815ws;
import X.C2296808zG;
import X.C2313911Fhl;
import X.C2344009Gk;
import X.C2354709Kn;
import X.C2388309Xl;
import X.C316640Cb8;
import X.C317290CcB;
import X.C436950HBl;
import X.C436960HBm;
import X.C436980HBo;
import X.C452501pT;
import X.C627660Ojc;
import X.C723600SZy;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1320200kSY;
import X.InterfaceC1364105Vn;
import android.os.Bundle;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarEditViewModel extends AssemListViewModel<C0HNI, C436950HBl, C2313911Fhl> {
    public static final /* synthetic */ int LLJ = 0;
    public Integer LLILLJJLI;
    public Integer LLILLL;
    public Long LLILZLL;
    public final List<C436950HBl> LL = new ArrayList();
    public final List<InterfaceC1320200kSY<Void>> LLILZ = new ArrayList();
    public C0HFE LLILZIL = C0HFE.UNPLAYED;
    public final C1559260qg8 LLIZ = new C1559260qg8(new C723600SZy(this, C0HFR.class, null), true);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(377));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0HNI(null, C13BV.INSTANCE, null, null, null, false, "", -1, false, false, false, null, null, new C627660Ojc(null, null, null, null, 15));
    }

    public final List<C0HFS> wQ2() {
        return (List) this.LLIZLLLIL.getValue();
    }

    public final C0HFR xQ2() {
        return (C0HFR) this.LLIZ.getValue();
    }

    public final boolean CQ2() {
        C0HFR c0hfrXQ2 = xQ2();
        return zQ2() || yQ2() || (c0hfrXQ2 != null ? c0hfrXQ2.LL : true) || !C1245160iVW.LIZ(C0XQ7.LJFF().getCurUser());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean yQ2() {
        C0HFS c0hfs;
        C0HFD c0hfd = ((C0HNI) getState()).LLILZ;
        return !Intrinsics.LJFF((c0hfd == null || (c0hfs = c0hfd.LIZ) == null) ? null : Integer.valueOf(c0hfs.LIZ), this.LLILLJJLI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zQ2() {
        return !Intrinsics.LJFF(((C0HNI) getState()).LLILLL != null ? Integer.valueOf(r0.LIZJ) : null, this.LLILLL);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C436950HBl> c627660Ojc) {
        setState(new AwS585S0100000_6(c627660Ojc, (C627660Ojc<C1782840wUk>) 228));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C2313911Fhl>> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C0HFC(this, null), interfaceC1364105Vn);
    }

    public final void AQ2(String str, Function1<? super C2344009Gk, Unit> function1) {
        String str2;
        String str3;
        C0HFR c0hfrXQ2 = xQ2();
        int i = 1;
        if (c0hfrXQ2 != null && c0hfrXQ2.LL) {
            str2 = "edit_social_avatar_page";
        } else {
            str2 = "edit_social_avatar_detail_page";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        C0HFR c0hfrXQ22 = xQ2();
        String str4 = null;
        if (c0hfrXQ22 != null) {
            str3 = c0hfrXQ22.LLILLJJLI;
        } else {
            str3 = null;
        }
        c2344009Gk.LJFF("enter_from", str3);
        C0HFR c0hfrXQ23 = xQ2();
        if (c0hfrXQ23 != null) {
            str4 = c0hfrXQ23.LLILLL;
        }
        c2344009Gk.LJFF("enter_method", str4);
        c2344009Gk.LJFF("source", "social_avatar");
        if (C1245160iVW.LIZ(curUser)) {
            i = 2;
        } else if (!C1245160iVW.LIZJ(curUser)) {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_has_social_avatar");
        if (function1 != null) {
            function1.invoke(c2344009Gk);
        }
        C20684815ws.LJIILLIIL(str2, c2344009Gk.LIZ);
    }

    public final void BQ2(int i, List<C436960HBm> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i2 = 0;
        for (C436960HBm c436960HBm : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C436960HBm c436960HBm2 = c436960HBm;
                if (i2 != i) {
                    ((ArrayList) this.LLILZ).add(C1322200kVm.LIZ().LJIIZILJ(C1325710kbR.LIZIZ(c436960HBm2.LIZIZ), null));
                }
                arrayList.add(Unit.LIZ);
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C2313911Fhl c2313911Fhl, InterfaceC1364105Vn<? super AbstractC316870CbV<C2313911Fhl>> interfaceC1364105Vn) {
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        List<C436950HBl> list = this.LL;
        c317290CcB.getClass();
        return new C316640Cb8(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle vQ2(C436980HBo c436980HBo, Function1<? super Bundle, Unit> function1) {
        int i;
        long jLongValue;
        String absolutePath;
        int i2;
        C0HFS c0hfs;
        C0HFS c0hfs2;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("creation_id", UUID.randomUUID().toString(), bundle);
        C786410Ut5.LJJJI("shoot_way", "social_avatar", bundle);
        bundle.putBoolean("is_social_avatar", true);
        bundle.putBoolean("change_avatar", true);
        C786410Ut5.LJJJI("origin_avatar_url", c436980HBo.LIZLLL, bundle);
        C786410Ut5.LJJJI("origin_no_crop_avatar_path", c436980HBo.LIZLLL, bundle);
        C0HFD c0hfd = ((C0HNI) getState()).LLILZ;
        int i3 = 0;
        if (c0hfd != null && (c0hfs2 = c0hfd.LIZ) != null) {
            i = c0hfs2.LIZ;
        } else {
            i = 0;
        }
        bundle.putInt("background_selection", i);
        C436960HBm c436960HBm = ((C0HNI) getState()).LLILLL;
        if (c436960HBm != null) {
            i3 = c436960HBm.LIZJ;
        }
        bundle.putInt("expression_selection", i3);
        Long l = ((C0HNI) getState()).LLILZIL;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        bundle.putLong("avatar_id", jLongValue);
        C786410Ut5.LJJJI("dynamic_social_avatar", c436980HBo.LIZIZ, bundle);
        C2388309Xl.LIZ.getClass();
        C0VSJ c0vsjLJIIL = C2354709Kn.LJIIL("profileHeader");
        if (c0vsjLJIIL == null || (absolutePath = c0vsjLJIIL.getAbsolutePath()) == null) {
            absolutePath = "";
        }
        C786410Ut5.LJJJI("static_social_avatar_gif", absolutePath, bundle);
        C786410Ut5.LJJJI("static_social_avatar", c436980HBo.LIZ, bundle);
        C786410Ut5.LJJJI("compiled_social_avatar", c436980HBo.LIZJ, bundle);
        C0HFD c0hfd2 = ((C0HNI) getState()).LLILZ;
        if (c0hfd2 != null && (c0hfs = c0hfd2.LIZ) != null) {
            i2 = c0hfs.LIZIZ;
        } else {
            i2 = -1;
        }
        bundle.putInt("social_avatar_text_color", i2);
        C786410Ut5.LJJJI("social_avatar_enter_method", "direct_post", bundle);
        function1.invoke(bundle);
        return bundle;
    }
}
