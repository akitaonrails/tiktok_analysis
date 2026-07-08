package com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem;

import X.C1558520qew;
import X.C23271099x;
import X.C2828017q;
import X.C337180DJs;
import X.C446980Hfs;
import X.C656990Ppp;
import X.C687700QyG;
import X.C948503nH;
import X.EnumC656860Ppc;
import X.EnumC657070Ppx;
import X.InterfaceC1146704e9;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardScope;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLemon8CardBottomAssem extends SearchCardBottomBarAssem implements ICardVisitedAbility, InterfaceC737790Swr, InterfaceC1146704e9 {
    public final EnumC656860Ppc LLLIIIIL = EnumC656860Ppc.LIEK_COUNT;
    public final SearchLemon8CardBottomAssem LLLIIIL = this;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchCardScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchCardScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem
    public final EnumC656860Ppc yp() {
        return this.LLLIIIIL;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchCardScope.class}).unbindAbility(this.LLLIIIL, ICardVisitedAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.ICardVisitedAbility
    public final void la2(String str) {
        int iLIZ;
        C2828017q.LIZ().LIZIZ(str);
        TuxTextView tuxTextView = this.LLJLILLLLZIIL;
        if (tuxTextView != null) {
            TypedValue typedValue = new TypedValue();
            tuxTextView.getContext().getTheme().resolveAttribute(R.attr.a1k, typedValue, true);
            if (typedValue.resourceId != 0) {
                iLIZ = C446980Hfs.LIZ(tuxTextView.getContext(), typedValue.resourceId);
            } else {
                iLIZ = typedValue.data;
            }
            tuxTextView.setTextColor(iLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem
    public final void op(Aweme aweme) {
        String nickname;
        User author;
        if (aweme == null || (author = aweme.getAuthor()) == null || (nickname = author.getNickname()) == null) {
            nickname = "";
        }
        TuxTextView tuxTextView = this.LLJLL;
        if (tuxTextView != null) {
            tuxTextView.setText(nickname);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchCardScope.class}).bindAbility(this.LLLIIIL, ICardVisitedAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem
    public final void sp(Aweme aweme) {
        C337180DJs.LIZ(this.LLJLLL);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem
    public final void tp(Aweme aweme) {
        String searchDesc;
        String aid;
        int i;
        int iLIZ;
        if (aweme != null && (searchDesc = aweme.getSearchDesc()) != null && searchDesc.length() != 0) {
            C337180DJs.LIZJ(this.LLJLILLLLZIIL);
            TuxTextView tuxTextView = this.LLJLILLLLZIIL;
            if (tuxTextView != null) {
                tuxTextView.setText(searchDesc);
            }
            if (aweme != null && !aweme.isAd() && (aid = aweme.getAid()) != null) {
                boolean zLIZJ = C2828017q.LIZ().LIZJ(aid);
                TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
                if (tuxTextView2 != null) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = tuxTextView2.getContext().getTheme();
                    if (zLIZJ) {
                        i = R.attr.a1k;
                    } else {
                        i = R.attr.a1h;
                    }
                    theme.resolveAttribute(i, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        iLIZ = C446980Hfs.LIZ(tuxTextView2.getContext(), typedValue.resourceId);
                    } else {
                        iLIZ = typedValue.data;
                    }
                    tuxTextView2.setTextColor(iLIZ);
                }
            }
            TuxTextView tuxTextView3 = this.LLJLILLLLZIIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setMaxLines(2);
            }
            TuxTextView tuxTextView4 = this.LLJLILLLLZIIL;
            if (tuxTextView4 != null) {
                tuxTextView4.setTuxFont(41);
            }
            C948503nH.LJ(this, C23271099x.INSTANCE, new C656990Ppp(this, searchDesc, null));
            return;
        }
        C337180DJs.LIZ(this.LLJLILLLLZIIL);
        IAdjustAbility iAdjustAbility = (IAdjustAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IAdjustAbility.class, null);
        if (iAdjustAbility == null) {
            return;
        }
        iAdjustAbility.qw1(EnumC657070Ppx.DESC, null);
    }
}
