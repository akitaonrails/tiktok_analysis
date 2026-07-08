package com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell;

import X.C01GW;
import X.C0OYG;
import X.C0OYS;
import X.C1196320hEk;
import X.C1220000hqw;
import X.C1235900iGa;
import X.C127G;
import X.C13LE;
import X.C1954807lC;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452070Ho5;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import Y.AObjectS62S0000000_9;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS81S0100000_9;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentMoreCell extends PowerCell<C0OYG> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public static final /* synthetic */ int LLJJI = 0;
    public View LLILLL;
    public LinearLayout LLILZ;
    public C1235900iGa LLILZIL;
    public TextView LLILZLL;
    public LinearLayout LLIZ;
    public ViewGroup LLIZLLLIL;
    public TuxIconView LLJ;
    public TuxIconView LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public C127G LLJJ;
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(139));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 503));
    public final C736950SvV LLJILLL = new C736950SvV(C13LE.LIZ(BulletinCommentListViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(292), null, null, null);

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class});
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a6j;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BulletinCommentListViewModel.class, new AObjectS62S0000000_9(this, 45)}, defaultViewModelProviderFactory);
                    this.LLJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = this.itemView.findViewById(R.id.hg3);
        this.LLILZ = (LinearLayout) this.itemView.findViewById(R.id.me9);
        this.LLJILJILJ = this.itemView.findViewById(R.id.ml4);
        this.LLILZIL = (C1235900iGa) this.itemView.findViewById(R.id.me_);
        this.LLILZLL = (TextView) this.itemView.findViewById(R.id.tv_reply_comment_title);
        this.LLIZ = (LinearLayout) this.itemView.findViewById(R.id.e62);
        this.LLJ = (TuxIconView) this.itemView.findViewById(R.id.kh9);
        this.LLJI = (TuxIconView) this.itemView.findViewById(R.id.e5z);
        this.LLJIJIL = this.itemView.findViewById(R.id.vro);
        this.LLIZLLLIL = (ViewGroup) this.itemView.findViewById(R.id.fzh);
        TuxIconView tuxIconView = this.LLJ;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        TuxIconView tuxIconView2 = this.LLJI;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        }
        View view = this.LLILLL;
        if (view != null) {
            C427690Gpr.LJI(view, null);
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            C786410Ut5.I7(new AkS81S0100000_9(this, 5), view2);
        }
        View view3 = this.LLJILJILJ;
        if (view3 != null) {
            C786410Ut5.I7(null, view3);
        }
        ViewGroup viewGroup = this.LLIZLLLIL;
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, null);
        }
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout != null) {
            C427690Gpr.LJI(linearLayout, null);
        }
        LinearLayout linearLayout2 = this.LLIZ;
        if (linearLayout2 != null) {
            C786410Ut5.I7(new AkS81S0100000_9(this, 6), linearLayout2);
        }
        C1235900iGa c1235900iGa = this.LLILZIL;
        if (c1235900iGa != null) {
            c1235900iGa.setProgressBarInfo(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        }
        C1235900iGa c1235900iGa2 = this.LLILZIL;
        View viewFindViewById = c1235900iGa2 != null ? c1235900iGa2.findViewById(R.id.g3w) : null;
        this.LLJILJIL = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setFocusable(true);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0OYG c0oyg = (C0OYG) interfaceC1891350zJl;
        super.onBindItemView(c0oyg);
        int i = C0OYS.LIZ[c0oyg.LLILZIL.ordinal()];
        String quantityString = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            this.itemView.getLayoutParams().height = 0;
                            this.itemView.requestLayout();
                            return;
                        }
                        throw new C1954807lC();
                    }
                    LinearLayout linearLayout = this.LLILZ;
                    if (linearLayout != null) {
                        C786410Ut5.LJZL(8, linearLayout);
                    }
                    C1235900iGa c1235900iGa = this.LLILZIL;
                    if (c1235900iGa == null) {
                        return;
                    }
                    C786410Ut5.LLLLIIL(c1235900iGa, 0);
                    return;
                }
                LinearLayout linearLayout2 = this.LLILZ;
                if (linearLayout2 != null) {
                    C786410Ut5.LJZL(0, linearLayout2);
                }
                C1235900iGa c1235900iGa2 = this.LLILZIL;
                if (c1235900iGa2 != null) {
                    C786410Ut5.LLLLIIL(c1235900iGa2, 8);
                }
                View view = this.LLILLL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                TuxIconView tuxIconView = this.LLJI;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                }
                LinearLayout linearLayout3 = this.LLIZ;
                if (linearLayout3 != null) {
                    linearLayout3.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), linearLayout3.getPaddingTop(), linearLayout3.getPaddingEnd(), linearLayout3.getPaddingBottom());
                }
                ViewGroup viewGroup = this.LLIZLLLIL;
                if (viewGroup != null) {
                    C786410Ut5.LJLZ(0, viewGroup);
                }
                ViewGroup viewGroup2 = this.LLIZLLLIL;
                if (viewGroup2 != null) {
                    C786410Ut5.R4(1.0f, viewGroup2);
                }
                View view2 = this.LLJIJIL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                LinearLayout linearLayout4 = this.LLIZ;
                if (linearLayout4 == null) {
                    return;
                }
                C786410Ut5.LJZL(0, linearLayout4);
                return;
            }
            LinearLayout linearLayout5 = this.LLILZ;
            if (linearLayout5 != null) {
                C786410Ut5.LJZL(0, linearLayout5);
            }
            C1235900iGa c1235900iGa3 = this.LLILZIL;
            if (c1235900iGa3 != null) {
                C786410Ut5.LLLLIIL(c1235900iGa3, 8);
            }
            View view3 = this.LLILLL;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            ViewGroup viewGroup3 = this.LLIZLLLIL;
            if (viewGroup3 != null) {
                C786410Ut5.LJLZ(0, viewGroup3);
            }
            TuxIconView tuxIconView2 = this.LLJ;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            }
            TuxIconView tuxIconView3 = this.LLJI;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
            }
            View view4 = this.LLJIJIL;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(0, view4);
            }
            LinearLayout linearLayout6 = this.LLIZ;
            if (linearLayout6 != null) {
                linearLayout6.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), linearLayout6.getPaddingTop(), linearLayout6.getPaddingEnd(), linearLayout6.getPaddingBottom());
            }
            LinearLayout linearLayout7 = this.LLIZ;
            if (linearLayout7 != null) {
                C786410Ut5.LJZL(0, linearLayout7);
            }
            int i2 = c0oyg.LLILZ - c0oyg.LLILLJJLI;
            if (i2 > 0) {
                TextView textView = this.LLILZLL;
                if (textView == null) {
                    return;
                }
                Resources resources = textView.getResources();
                if (resources != null) {
                    quantityString = resources.getQuantityString(2131756050, i2, Integer.valueOf(i2));
                }
                textView.setText(quantityString);
                return;
            }
            TextView textView2 = this.LLILZLL;
            if (textView2 == null) {
                return;
            }
            textView2.setText(2131829132);
            return;
        }
        LinearLayout linearLayout8 = this.LLILZ;
        if (linearLayout8 != null) {
            C786410Ut5.LJZL(0, linearLayout8);
        }
        C1235900iGa c1235900iGa4 = this.LLILZIL;
        if (c1235900iGa4 != null) {
            C786410Ut5.LLLLIIL(c1235900iGa4, 8);
        }
        View view5 = this.LLILLL;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
        }
        ViewGroup viewGroup4 = this.LLIZLLLIL;
        if (viewGroup4 != null) {
            C786410Ut5.LJLZ(0, viewGroup4);
        }
        TuxIconView tuxIconView4 = this.LLJ;
        if (tuxIconView4 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
        }
        TuxIconView tuxIconView5 = this.LLJI;
        if (tuxIconView5 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
        }
        View view6 = this.LLJIJIL;
        if (view6 != null) {
            C786410Ut5.LJLLLLLL(0, view6);
        }
        LinearLayout linearLayout9 = this.LLIZ;
        if (linearLayout9 != null) {
            linearLayout9.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), linearLayout9.getPaddingTop(), linearLayout9.getPaddingEnd(), linearLayout9.getPaddingBottom());
        }
        LinearLayout linearLayout10 = this.LLIZ;
        if (linearLayout10 != null) {
            C786410Ut5.LJZL(8, linearLayout10);
        }
        int i3 = c0oyg.LLILZ - c0oyg.LLILLJJLI;
        TextView textView3 = this.LLILZLL;
        if (textView3 == null) {
            return;
        }
        Resources resources2 = textView3.getResources();
        if (resources2 != null) {
            quantityString = resources2.getQuantityString(2131756050, i3, Integer.valueOf(i3));
        }
        textView3.setText(quantityString);
    }
}
