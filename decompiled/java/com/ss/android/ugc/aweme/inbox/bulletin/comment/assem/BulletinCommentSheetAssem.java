package com.ss.android.ugc.aweme.inbox.bulletin.comment.assem;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C0OTL;
import X.C0OWY;
import X.C0OY4;
import X.C0OY7;
import X.C0XQ7;
import X.C1220000hqw;
import X.C127G;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C339190DRl;
import X.C419910GdJ;
import X.C451610HnL;
import X.C452070Ho5;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.AObjectS384S0100000_9;
import Y.AObjectS62S0000000_9;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.ability.BulletinCommentSheetAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS24S0001000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentSheetAssem extends UIContentAssem implements InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C0OY4.class, "BulletinCommentSheetHierarchyData"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public final C736950SvV LLJI;
    public C127G LLJIJIL;

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

    public final C0OY4 Go() {
        return (C0OY4) this.LLIZLLLIL.getValue();
    }

    public BulletinCommentSheetAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinCommentListViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(287);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9((AbstractC738140SxQ) this, 499);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJ = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_9, awS553S0100000_9, c451610HnL, c723700Sa8);
        this.LLJI = new C736950SvV(C13LE.LIZ(BulletinCommentActionViewModel.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(288), new AwS553S0100000_9((AbstractC738140SxQ) this, 500), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BulletinCommentListViewModel.class, new AObjectS62S0000000_9(this, 32), BulletinCommentActionViewModel.class, new AObjectS384S0100000_9(this, 32)}, defaultViewModelProviderFactory);
                    this.LLJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final void Ho(int i) {
        Resources resources;
        String string;
        Resources resources2;
        TextView textView = (TextView) LJJIJL().findViewById(R.id.czy);
        if (textView != null) {
            String str = "";
            if (i <= 0 ? !((resources = LJJIJL().getResources()) == null || (string = resources.getString(2131825067)) == null) : !((resources2 = LJJIJL().getResources()) == null || (string = resources2.getQuantityString(2131755167, i, Integer.valueOf(i))) == null)) {
                str = string;
            }
            textView.setText(str);
        }
    }

    public final void Jo(String str) {
        boolean z;
        Integer numLIZJ;
        Integer numLIZJ2;
        String string;
        int iIntValue = 0;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TextView textView = (TextView) LJJIJL().findViewById(R.id.d04);
            if (textView != null) {
                Context context = getContext();
                if (context != null) {
                    string = context.getString(2131829129);
                } else {
                    string = null;
                }
                textView.setText(string);
            }
            TextView textView2 = (TextView) LJJIJL().findViewById(R.id.d04);
            if (textView2 != null) {
                Context context2 = getContext();
                if (context2 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.ua, context2)) != null) {
                    iIntValue = numLIZJ2.intValue();
                }
                textView2.setTextColor(iIntValue);
            }
            View viewFindViewById = LJJIJL().findViewById(R.id.d01);
            if (viewFindViewById != null) {
                C339190DRl.LIZLLL(viewFindViewById);
            }
            View viewFindViewById2 = LJJIJL().findViewById(R.id.d08);
            if (viewFindViewById2 != null) {
                C339190DRl.LIZIZ(viewFindViewById2);
                return;
            }
            return;
        }
        TextView textView3 = (TextView) LJJIJL().findViewById(R.id.d04);
        if (textView3 != null) {
            textView3.setText(str);
        }
        TextView textView4 = (TextView) LJJIJL().findViewById(R.id.d04);
        if (textView4 != null) {
            Context context3 = getContext();
            if (context3 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context3)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            textView4.setTextColor(iIntValue);
        }
        View viewFindViewById3 = LJJIJL().findViewById(R.id.d01);
        if (viewFindViewById3 != null) {
            C339190DRl.LIZIZ(viewFindViewById3);
        }
        View viewFindViewById4 = LJJIJL().findViewById(R.id.d08);
        if (viewFindViewById4 == null) {
            return;
        }
        C339190DRl.LIZLLL(viewFindViewById4);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BulletinFragmentScope.class}).unbindAbility(this.LLJ.getValue(), C0OTL.class);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        long j;
        long j2;
        boolean z;
        UrlModel urlModel;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        Map<String, String> mapLJ;
        long j3;
        long j4;
        boolean z5;
        UrlModel urlModel2;
        boolean z6;
        boolean z7;
        boolean z8;
        String str2;
        String str3;
        int i;
        boolean z9;
        int i2;
        boolean z10;
        BulletinCommentSheetAbility bulletinCommentSheetAbility;
        String str4;
        C0OY4 c0oy4Go;
        super.onViewCreated(view);
        BulletinCommentActionViewModel bulletinCommentActionViewModel = (BulletinCommentActionViewModel) this.LLJI.getValue();
        C0OY4 c0oy4Go2 = Go();
        if (c0oy4Go2 != null) {
            j = c0oy4Go2.LL;
        } else {
            j = 0;
        }
        C0OY4 c0oy4Go3 = Go();
        if (c0oy4Go3 != null) {
            j2 = c0oy4Go3.LLILLJJLI;
        } else {
            j2 = 0;
        }
        C0OY4 c0oy4Go4 = Go();
        if (c0oy4Go4 != null) {
            z = c0oy4Go4.LLILLL;
        } else {
            z = false;
        }
        C0OY4 c0oy4Go5 = Go();
        if (c0oy4Go5 != null) {
            urlModel = c0oy4Go5.LLILZ;
        } else {
            urlModel = null;
        }
        C0OY4 c0oy4Go6 = Go();
        if (c0oy4Go6 != null) {
            z2 = c0oy4Go6.LLILZLL;
        } else {
            z2 = false;
        }
        C0OY4 c0oy4Go7 = Go();
        if (c0oy4Go7 != null) {
            z3 = c0oy4Go7.LLIZ;
        } else {
            z3 = false;
        }
        C0OY4 c0oy4Go8 = Go();
        if (c0oy4Go8 != null) {
            z4 = c0oy4Go8.LLIZLLLIL;
        } else {
            z4 = false;
        }
        C0OY4 c0oy4Go9 = Go();
        if (c0oy4Go9 == null || (str = c0oy4Go9.LLJ) == null) {
            str = "";
        }
        Go();
        C0OY4 c0oy4Go10 = Go();
        if (c0oy4Go10 == null || (mapLJ = c0oy4Go10.LLJILJILJ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        bulletinCommentActionViewModel.LLILLJJLI = j;
        bulletinCommentActionViewModel.LLILLL = j2;
        bulletinCommentActionViewModel.LLILZ = z;
        bulletinCommentActionViewModel.LLILZIL = urlModel;
        bulletinCommentActionViewModel.LLILZLL = z2;
        bulletinCommentActionViewModel.LLIZ = z3;
        bulletinCommentActionViewModel.LLIZLLLIL = z4;
        bulletinCommentActionViewModel.LLJ = str;
        bulletinCommentActionViewModel.LLJI = mapLJ;
        BulletinCommentListViewModel bulletinCommentListViewModel = (BulletinCommentListViewModel) this.LLJ.getValue();
        C0OY4 c0oy4Go11 = Go();
        if (c0oy4Go11 != null) {
            j3 = c0oy4Go11.LL;
        } else {
            j3 = 0;
        }
        C0OY4 c0oy4Go12 = Go();
        if (c0oy4Go12 != null) {
            j4 = c0oy4Go12.LLILLJJLI;
        } else {
            j4 = 0;
        }
        C0OY4 c0oy4Go13 = Go();
        if (c0oy4Go13 != null) {
            z5 = c0oy4Go13.LLILLL;
        } else {
            z5 = false;
        }
        C0OY4 c0oy4Go14 = Go();
        if (c0oy4Go14 != null) {
            urlModel2 = c0oy4Go14.LLILZ;
        } else {
            urlModel2 = null;
        }
        C0OY4 c0oy4Go15 = Go();
        if (c0oy4Go15 != null) {
            z6 = c0oy4Go15.LLILZLL;
        } else {
            z6 = false;
        }
        C0OY4 c0oy4Go16 = Go();
        if (c0oy4Go16 != null) {
            z7 = c0oy4Go16.LLIZ;
        } else {
            z7 = false;
        }
        C0OY4 c0oy4Go17 = Go();
        if (c0oy4Go17 != null) {
            z8 = c0oy4Go17.LLIZLLLIL;
        } else {
            z8 = false;
        }
        C0OY4 c0oy4Go18 = Go();
        if (c0oy4Go18 == null || (str2 = c0oy4Go18.LLJ) == null) {
            str2 = "";
        }
        C0OY4 c0oy4Go19 = Go();
        if (c0oy4Go19 != null) {
            str3 = c0oy4Go19.LLJIJIL;
        } else {
            str3 = null;
        }
        C0OY4 c0oy4Go20 = Go();
        if (c0oy4Go20 != null) {
            i = c0oy4Go20.LLILZIL;
        } else {
            i = 0;
        }
        C0OY4 c0oy4Go21 = Go();
        if (c0oy4Go21 != null) {
            z9 = c0oy4Go21.LLJILJIL;
        } else {
            z9 = false;
        }
        bulletinCommentListViewModel.LLILLJJLI = j3;
        bulletinCommentListViewModel.LLILLL = j4;
        bulletinCommentListViewModel.LLILZ = z5;
        bulletinCommentListViewModel.LLILZIL = urlModel2;
        bulletinCommentListViewModel.LLILZLL = z6;
        bulletinCommentListViewModel.LLIZ = z7;
        bulletinCommentListViewModel.LLIZLLLIL = z8;
        bulletinCommentListViewModel.LLJ = str2;
        bulletinCommentListViewModel.LLJI = str3;
        bulletinCommentListViewModel.LLJIJIL = z9;
        bulletinCommentListViewModel.setState(new AwS24S0001000_9(i, 17));
        bulletinCommentListViewModel.xQ2(C0OY7.DEFAULT, null);
        C0OY4 c0oy4Go22 = Go();
        if (c0oy4Go22 != null) {
            i2 = c0oy4Go22.LLILZIL;
        } else {
            i2 = 0;
        }
        Ho(i2);
        View viewFindViewById = LJJIJL().findViewById(R.id.czx);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 55, 42), viewFindViewById);
        }
        C0OY4 c0oy4Go23 = Go();
        if (c0oy4Go23 != null && c0oy4Go23.LLIZ) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (c0oy4Go = Go()) != null && c0oy4Go.LLILZLL) {
            View viewFindViewById2 = LJJIJL().findViewById(R.id.d05);
            if (viewFindViewById2 != null) {
                C339190DRl.LIZIZ(viewFindViewById2);
            }
            View viewFindViewById3 = LJJIJL().findViewById(R.id.czz);
            if (viewFindViewById3 != null) {
                C339190DRl.LIZLLL(viewFindViewById3);
            }
            View viewFindViewById4 = LJJIJL().findViewById(R.id.d03);
            if (viewFindViewById4 != null) {
                C786410Ut5.I7(new AbS691S0100000_9(this, 56, 42), viewFindViewById4);
            }
            View viewFindViewById5 = LJJIJL().findViewById(R.id.d01);
            if (viewFindViewById5 != null) {
                C786410Ut5.I7(new AbS691S0100000_9(this, 57, 42), viewFindViewById5);
            }
            SmartImageView smartImageView = (SmartImageView) LJJIJL().findViewById(R.id.d00);
            if (smartImageView != null) {
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
            }
            View viewFindViewById6 = LJJIJL().findViewById(R.id.d08);
            if (viewFindViewById6 != null) {
                C786410Ut5.I7(new AbS691S0100000_9(this, 58, 42), viewFindViewById6);
            }
            Jo(((C0OWY) ((AssemViewModel) this.LLJI.getValue()).getState()).LLILZLL);
        } else {
            View viewFindViewById7 = LJJIJL().findViewById(R.id.d05);
            if (viewFindViewById7 != null) {
                C339190DRl.LIZLLL(viewFindViewById7);
            }
            View viewFindViewById8 = LJJIJL().findViewById(R.id.czz);
            if (viewFindViewById8 != null) {
                C339190DRl.LIZIZ(viewFindViewById8);
            }
        }
        C0OY4 c0oy4Go24 = Go();
        if (c0oy4Go24 != null && c0oy4Go24.LLJI && (bulletinCommentSheetAbility = (BulletinCommentSheetAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinCommentSheetAbility.class, null)) != null) {
            C0OY4 c0oy4Go25 = Go();
            if (c0oy4Go25 != null) {
                str4 = c0oy4Go25.LLJIJIL;
            } else {
                str4 = null;
            }
            bulletinCommentSheetAbility.EO(null, false, str4);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJI.getValue(), new C2217381BqS() { // from class: X.0OY3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OWY) obj).LLILZLL;
            }
        }, null, new AwS623S0100000_9(this, 217), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJI.getValue(), new C2217381BqS() { // from class: X.0OWb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OWY) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(67), 4);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLJ.getValue(), new C2217371BqR() { // from class: X.0OY9
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OYC) obj).LLILLL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C0OYC) obj).LLILLL = (AbstractC1623806Xk) obj2;
            }
        }, this, C736820SvI.LIZLLL(), null, null, new AwS588S0100000_9(this, 609), 24, null);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BulletinFragmentScope.class}).bindAbility(this.LLJ.getValue(), C0OTL.class);
    }
}
