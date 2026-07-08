package com.ss.android.ugc.aweme.search.pages.result.weakentity.ui;

import X.AbstractC654180PlI;
import X.C01GW;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1558520qew;
import X.C1744700vVE;
import X.C19EG;
import X.C2211631BhB;
import X.C427690Gpr;
import X.C452501pT;
import X.C645910PVd;
import X.C648880Pck;
import X.C650240Pew;
import X.C654040Pl4;
import X.C654050Pl5;
import X.C654080Pl8;
import X.C654380Plc;
import X.C786410Ut5;
import X.EnumC654440Pli;
import X.InterfaceC1587906Jp;
import X.InterfaceC654140PlE;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.GameInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard;
import com.ss.android.ugc.aweme.search.pages.result.weakentity.WeakEntityAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import wh6.AbS692S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchWeakEntityAssem extends ReusedUISlotAssem<SearchWeakEntityAssem> implements InterfaceC712990Rxx<C645910PVd>, WeakEntityAbility {
    public static final /* synthetic */ int LLLFF = 0;
    public RadiusLayout LLJJLIIIJLLLLLLLZ;
    public SmartImageView LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public View LLJLL;
    public C645910PVd LLJLLIL;
    public InterfaceC654140PlE LLJZIJLIL;
    public C654080Pl8 LLLF;
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 835));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 834));
    public final List<InterfaceC654140PlE> LLL = new ArrayList();

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f4j;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final InterfaceC665370Q7z LLIIJLIL() {
        return (InterfaceC665370Q7z) this.LLJLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1558520qew.LJIIJJI(LLIIJLIL(), WeakEntityAbility.class, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Context context;
        Integer numLIZJ;
        Integer numLIZJ2;
        C1558520qew.LJII(LLIIJLIL(), this, WeakEntityAbility.class, null, null);
        C2211631BhB.LJ(getContentView(), new AwS376S0200000_10(this, (SearchWeakEntityAssem) C452501pT.LIZIZ(new AwS554S0100000_10(this, 1216)), (C01GW<? extends SearchTopFragmentAbility>) 135));
        if (C650240Pew.LIZ()) {
            View viewFindViewById = view.findViewById(R.id.y_s);
            C648880Pck.LIZIZ(viewFindViewById);
            C650240Pew.LIZ.getClass();
            C1744700vVE.LJIIIIZZ(C650240Pew.LIZJ, viewFindViewById);
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.ccv));
        }
        this.LLJL = (SmartImageView) view.findViewById(R.id.jk5);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.jkv);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.z6);
        this.LLJJLIIIJLLLLLLLZ = (RadiusLayout) view.findViewById(R.id.jk6);
        this.LLJLL = view.findViewById(R.id.y_s);
        List<InterfaceC654140PlE> list = this.LLL;
        final View viewFindViewById2 = getContentView().findViewById(R.id.kft);
        final InterfaceC665370Q7z interfaceC665370Q7zLLIIJLIL = LLIIJLIL();
        ((ArrayList) list).add(new AbstractC654180PlI(viewFindViewById2, interfaceC665370Q7zLLIIJLIL) { // from class: X.0PlH
            public final TuxTextView LIZJ;
            public final TuxTextView LIZLLL;
            public final C01GW LJ;

            @Override // X.InterfaceC654140PlE
            public final boolean LIZ(C645910PVd c645910PVd) {
                EntityCardTitle entityCardTitle;
                SearchHubEntityCard entityCard = c645910PVd.LL.getEntityCard();
                if (entityCard != null && (entityCardTitle = entityCard.topCardInfo) != null && entityCardTitle.imdbInfo != null) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC654140PlE
            public final boolean LIZIZ(C645910PVd c645910PVd) {
                EntityCardTitle entityCardTitle;
                C654190PlJ subTitle;
                C654120PlC c654120PlC;
                Float f;
                SearchHubEntityCard entityCard = c645910PVd.LL.getEntityCard();
                if (entityCard != null && (entityCardTitle = entityCard.topCardInfo) != null && (subTitle = entityCardTitle.getSubTitle()) != null && (c654120PlC = subTitle.LIZJ) != null && (f = c654120PlC.LIZ) != null) {
                    f.floatValue();
                    Long l = c654120PlC.LIZIZ;
                    if (l != null) {
                        l.longValue();
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC654140PlE
            public final void LIZJ(C645910PVd c645910PVd) {
                SpannableString spannableStringLIZ;
                EntityCardTitle entityCardTitle;
                C654190PlJ subTitle;
                SearchHubEntityCard entityCard;
                EntityCardTitle entityCardTitle2;
                C654190PlJ subTitle2;
                C654120PlC c654120PlC;
                TuxTextView tuxTextView = this.LIZJ;
                String str = null;
                if (LIZIZ(c645910PVd) && (entityCard = c645910PVd.LL.getEntityCard()) != null && (entityCardTitle2 = entityCard.topCardInfo) != null && (subTitle2 = entityCardTitle2.getSubTitle()) != null && (c654120PlC = subTitle2.LIZJ) != null) {
                    spannableStringLIZ = C654250PlP.LIZ(this.LIZ.getContext(), c654120PlC);
                } else {
                    spannableStringLIZ = null;
                }
                AbstractC654180PlI.LIZLLL(tuxTextView, spannableStringLIZ);
                TuxTextView tuxTextView2 = this.LIZLLL;
                SearchHubEntityCard entityCard2 = c645910PVd.LL.getEntityCard();
                if (entityCard2 != null && (entityCardTitle = entityCard2.topCardInfo) != null && (subTitle = entityCardTitle.getSubTitle()) != null) {
                    str = subTitle.LIZ;
                }
                AbstractC654180PlI.LIZLLL(tuxTextView2, str);
            }

            {
                super(viewFindViewById2, interfaceC665370Q7zLLIIJLIL);
                TuxTextView tuxTextView = (TuxTextView) viewFindViewById2.findViewById(R.id.jkk);
                this.LIZJ = tuxTextView;
                TuxTextView tuxTextView2 = (TuxTextView) viewFindViewById2.findViewById(R.id.jkn);
                this.LIZLLL = tuxTextView2;
                this.LJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(690));
                C786410Ut5.I7(new AbS692S0100000_10(interfaceC665370Q7zLLIIJLIL, 35), tuxTextView);
                C786410Ut5.I7(new AbS692S0100000_10(interfaceC665370Q7zLLIIJLIL, 36), tuxTextView2);
            }
        });
        List<InterfaceC654140PlE> list2 = this.LLL;
        final View viewFindViewById3 = view.findViewById(R.id.fiu);
        final InterfaceC665370Q7z interfaceC665370Q7zLLIIJLIL2 = LLIIJLIL();
        ((ArrayList) list2).add(new AbstractC654180PlI(viewFindViewById3, interfaceC665370Q7zLLIIJLIL2) { // from class: X.0PlG
            public final TuxTextView LIZJ;
            public final TuxTextView LIZLLL;

            @Override // X.InterfaceC654140PlE
            public final boolean LIZ(C645910PVd c645910PVd) {
                EntityCardTitle entityCardTitle;
                SearchHubEntityCard entityCard = c645910PVd.LL.getEntityCard();
                if (entityCard != null && (entityCardTitle = entityCard.topCardInfo) != null && entityCardTitle.imdbInfo != null) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC654140PlE
            public final boolean LIZIZ(C645910PVd c645910PVd) {
                boolean z;
                EntityCardTitle entityCardTitle;
                List<String> list3;
                String str;
                SearchHubEntityCard entityCard = c645910PVd.LL.getEntityCard();
                if (entityCard != null && (entityCardTitle = entityCard.topCardInfo) != null && (list3 = entityCardTitle.entityDescList) != null && (str = (String) C13LP.LJJJLL(list3)) != null && str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                return !z;
            }

            @Override // X.InterfaceC654140PlE
            public final void LIZJ(C645910PVd c645910PVd) {
                String str;
                EntityCardTitle entityCardTitle;
                List<String> list3;
                EntityCardTitle entityCardTitle2;
                C654190PlJ subTitle;
                TuxTextView tuxTextView = this.LIZJ;
                SearchHubEntityCard entityCard = c645910PVd.LL.getEntityCard();
                String str2 = null;
                if (entityCard != null && (entityCardTitle2 = entityCard.topCardInfo) != null && (subTitle = entityCardTitle2.getSubTitle()) != null) {
                    str = subTitle.LIZ;
                } else {
                    str = null;
                }
                AbstractC654180PlI.LIZLLL(tuxTextView, str);
                TuxTextView tuxTextView2 = this.LIZLLL;
                SearchHubEntityCard entityCard2 = c645910PVd.LL.getEntityCard();
                if (entityCard2 != null && (entityCardTitle = entityCard2.topCardInfo) != null && (list3 = entityCardTitle.entityDescList) != null) {
                    str2 = (String) C13LP.LJJJLL(list3);
                }
                AbstractC654180PlI.LIZLLL(tuxTextView2, str2);
            }

            {
                super(viewFindViewById3, interfaceC665370Q7zLLIIJLIL2);
                TuxTextView tuxTextView = (TuxTextView) viewFindViewById3.findViewById(R.id.jkm);
                this.LIZJ = tuxTextView;
                TuxTextView tuxTextView2 = (TuxTextView) viewFindViewById3.findViewById(R.id.jkj);
                this.LIZLLL = tuxTextView2;
                C786410Ut5.I7(new AbS692S0100000_10(interfaceC665370Q7zLLIIJLIL2, 33), tuxTextView);
                C786410Ut5.I7(new AbS692S0100000_10(interfaceC665370Q7zLLIIJLIL2, 34), tuxTextView2);
            }
        });
        RadiusLayout radiusLayout = this.LLJJLIIIJLLLLLLLZ;
        if (radiusLayout != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, radiusLayout.getContext())) != null) {
            radiusLayout.LIZIZ(numLIZJ2.intValue(), 2, 0, 0);
        }
        View viewFindViewById4 = view.findViewById(R.id.jit);
        if (viewFindViewById4 != null) {
            C427690Gpr.LJ(viewFindViewById4, 0.0f);
            C786410Ut5.I7(new AbS692S0100000_10(this, 20), viewFindViewById4);
        }
        SmartImageView smartImageView = this.LLJL;
        if (smartImageView != null) {
            C786410Ut5.I7(new AbS692S0100000_10(this, 19), smartImageView);
        }
        if (C654380Plc.LIZ().fixEntityUi && (context = getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            SmartImageView smartImageView2 = this.LLJL;
            if (smartImageView2 != null) {
                smartImageView2.setBackgroundColor(iIntValue);
            }
        }
        View viewFindViewById5 = view.findViewById(R.id.z5);
        if (viewFindViewById5 != null) {
            C427690Gpr.LJ(viewFindViewById5, 0.0f);
            C786410Ut5.I7(new AbS692S0100000_10(this, 21), viewFindViewById5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0143  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C645910PVd r13) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.weakentity.ui.SearchWeakEntityAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C645910PVd c645910PVd) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C645910PVd c645910PVd) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.weakentity.WeakEntityAbility
    public final void Ht2(View view, String str) {
        GameInfo gameInfo;
        SearchMixFeed searchMixFeed;
        SearchHubEntityCard entityCard;
        EntityCardTitle entityCardTitle;
        SearchMixFeed searchMixFeed2;
        SearchHubEntityCard entityCard2;
        EntityCardTitle entityCardTitle2;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
        if (c19egLIZIZ != null && LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ) != null) {
            C645910PVd c645910PVd = this.LLJLLIL;
            if (c645910PVd != null && (searchMixFeed2 = c645910PVd.LL) != null && (entityCard2 = searchMixFeed2.getEntityCard()) != null && (entityCardTitle2 = entityCard2.topCardInfo) != null) {
                C654040Pl4.LIZIZ(view.getContext(), EnumC654440Pli.COMMON, entityCardTitle2);
            }
            C654050Pl5 c654050Pl5 = C654050Pl5.LIZ;
            C654080Pl8 c654080Pl8 = this.LLLF;
            C645910PVd c645910PVd2 = this.LLJLLIL;
            if (c645910PVd2 != null && (searchMixFeed = c645910PVd2.LL) != null && (entityCard = searchMixFeed.getEntityCard()) != null && (entityCardTitle = entityCard.topCardInfo) != null) {
                gameInfo = entityCardTitle.gameInfo;
            } else {
                gameInfo = null;
            }
            C654050Pl5.LJ(c654050Pl5, c654080Pl8, gameInfo, str, null, null, 52);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
