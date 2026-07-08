package com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.insertion.assem;

import X.AbstractC738140SxQ;
import X.C0H7Z;
import X.C0PCY;
import X.C0PRC;
import X.C0PU1;
import X.C0PUB;
import X.C0PUD;
import X.C0Q3E;
import X.C1202104n5;
import X.C1558520qew;
import X.C2188811AlT;
import X.C645570PTv;
import X.C646370PWx;
import X.C653660PkS;
import X.C724240Sb0;
import X.EnumC1999307sN;
import X.EnumC645590PTx;
import X.EnumC645610PTz;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.insertion.communicate.ClickSugAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* JADX INFO: loaded from: classes11.dex */
public final class ShowCSAssem extends AbstractC738140SxQ implements ClickSugAbility, InterfaceC1554640qYg {
    public C645570PTv LL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 138998795) {
            return null;
        }
        return this;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C645570PTv c645570PTv = this.LL;
        if (c645570PTv != null) {
            c645570PTv.LJIIJ = null;
        }
        this.LL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            this.LL = new C645570PTv((ClickSearchViewModel) ViewModelProviders.of(fragmentLJI).get(ClickSearchViewModel.class), fragmentLJI.getLifecycle());
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.insertion.communicate.ClickSugAbility
    public final void Ua(View view) {
        View viewLIZ;
        ISearchContextAbility iSearchContextAbilityLIZ;
        C0PCY<C646370PWx> c0pcyWO2;
        C646370PWx c646370PWx;
        if (view != null && (viewLIZ = C0H7Z.LIZ(view)) != null && (iSearchContextAbilityLIZ = C0Q3E.LIZ(viewLIZ)) != null && (c0pcyWO2 = iSearchContextAbilityLIZ.wO2()) != null && (c646370PWx = (C646370PWx) c0pcyWO2.LIZJ()) != null) {
            int i = c646370PWx.LLJIJIL;
            C645570PTv c645570PTv = this.LL;
            if (c645570PTv != null) {
                c645570PTv.LJI(c645570PTv.LJII.wQ2(i));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.insertion.communicate.ClickSugAbility
    public final void n61(Aweme aweme, View view, C653660PkS c653660PkS, EnumC645610PTz enumC645610PTz, boolean z, boolean z2) {
        String aid;
        String str;
        View viewLIZ;
        ISearchContextAbility iSearchContextAbilityLIZ;
        String str2;
        C0PUB c0pub;
        String aid2;
        EnumC645590PTx enumC645590PTxLIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try show cs ");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" scene ");
        sbLIZ.append(enumC645610PTz.getSceneName());
        sbLIZ.append(" keyword ");
        if (c653660PkS != null) {
            str = c653660PkS.LJFF;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" itemMobParam ");
        sbLIZ.append(c653660PkS);
        sbLIZ.append(" enteringDetail ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (view == null || (viewLIZ = C0H7Z.LIZ(view)) == null || (iSearchContextAbilityLIZ = C0Q3E.LIZ(viewLIZ)) == null || c653660PkS == null) {
            return;
        }
        EnumC1999307sN enumC1999307sN = EnumC1999307sN.CLICK;
        if (z2) {
            str2 = "hot_user";
        } else {
            str2 = "person";
        }
        String str3 = "video";
        switch (C0PU1.LIZ[enumC645610PTz.ordinal()]) {
            case 1:
                c0pub = new C0PUB("live_aggregation_card", "live", enumC1999307sN.getValue());
                break;
            case 2:
                c0pub = new C0PUB("mix", "live", enumC1999307sN.getValue());
                break;
            case 3:
                c0pub = new C0PUB("mix", "photo", enumC1999307sN.getValue());
                break;
            case 4:
                c0pub = new C0PUB("mix", "video", enumC1999307sN.getValue());
                break;
            case 5:
                c0pub = new C0PUB(str2, "personal_homepage", enumC1999307sN.getValue());
                break;
            case 6:
                c0pub = new C0PUB(str2, "live", enumC1999307sN.getValue());
                break;
            case 7:
                if (aweme != null) {
                    if (AwemeExtKt.isPhotoMode(aweme)) {
                        str3 = "photo";
                    } else if (AwemeSaaSExtKt.isLive(aweme)) {
                        str3 = "live";
                    }
                }
                c0pub = new C0PUB("hot_user", str3, enumC1999307sN.getValue());
                break;
            default:
                c0pub = new C0PUB(null, null, null);
                break;
        }
        C645570PTv c645570PTv = this.LL;
        if (c645570PTv != null) {
            if (aweme == null || (aid2 = aweme.getAid()) == null) {
                aid2 = "";
            }
            c645570PTv.LIZLLL = aweme;
            c645570PTv.LJIIIZ = c653660PkS;
            c645570PTv.LJIIJJI = enumC645610PTz;
            c645570PTv.LJIIJ = iSearchContextAbilityLIZ;
            int i = ((C646370PWx) iSearchContextAbilityLIZ.wO2().LIZJ()).LLJIJIL;
            if (z) {
                c645570PTv.LJI(c645570PTv.LJII.wQ2(i));
            }
            int iWQ2 = c645570PTv.LJII.wQ2(i);
            if (iWQ2 != -1) {
                c645570PTv.LJIIL = iWQ2;
                if (aweme != null && aweme.isAd()) {
                    C1202104n5.LIZ().LJJ(enumC645610PTz, aweme.getAid(), "fail", "aweme is ad", Boolean.TRUE);
                    return;
                }
                c645570PTv.LJII.getClass();
                if (!ClickSearchViewModel.AQ2(enumC645610PTz)) {
                    return;
                }
                if (aweme != null) {
                    enumC645590PTxLIZLLL = c645570PTv.LIZLLL(enumC645610PTz, aweme);
                } else {
                    enumC645590PTxLIZLLL = EnumC645590PTx.GENERAL;
                }
                if (enumC645590PTxLIZLLL != EnumC645590PTx.GENERAL) {
                    return;
                }
                c645570PTv.LJII.HQ2(iWQ2, true ^ C0PUD.LIZ(enumC645610PTz));
                c645570PTv.LJII.DQ2(iWQ2);
                if (c645570PTv.LJII.LLIZLLLIL) {
                    return;
                }
                c645570PTv.LJII.vQ2(enumC645610PTz, ((C0PRC) iSearchContextAbilityLIZ.Ph1().LIZJ()).LLIZLLLIL, aid2, iWQ2, null, enumC645590PTxLIZLLL, c0pub);
            }
        }
    }
}
