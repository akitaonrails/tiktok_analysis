package com.ss.android.ugc.aweme.comment.viewerlist.ui;

import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.C098200Yq;
import X.C0XQ7;
import X.C1308910kAL;
import X.C1349280lDS;
import X.C1352190lI9;
import X.C1354730lMF;
import X.C1372520low;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1618440sDa;
import X.C1685300txQ;
import X.C189200o6;
import X.C1906580ziK;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C2217381BqS;
import X.C295780Bia;
import X.C295880Bik;
import X.C722580SWa;
import X.C729040Sik;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1344590l5t;
import X.InterfaceC1349750lED;
import X.InterfaceC2217461Bqa;
import X.InterfaceC330650Cxj;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.actionbar.ICommentPageActionBarVMAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS670S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class StoryViewerListFragment extends BaseFragment implements InterfaceC1344590l5t, InterfaceC1349750lED {
    public static final C1352190lI9 LLJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjFiPyY2HELIOSPyA+JSYgPGs5IGEAPCo+MBk6LTIpOwM6OzEKOy40JSAiPQ==";
    public Aweme LLIZLLLIL;
    public int LLJI;
    public int LLJIJIL;
    public InterfaceC330650Cxj LLJILJIL;
    public boolean LLJILJILJ;
    public int LLIZ = -1;
    public int LLJ = -1;
    public final C722580SWa LLJILLL = new C722580SWa();

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0lI9] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryViewerListFragment.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJ = new Object() { // from class: X.0lI9
        };
    }

    @Override // X.InterfaceC1349750lED
    public final void B7() {
    }

    @Override // X.InterfaceC1349750lED
    public final void BC(boolean z) {
    }

    @Override // X.InterfaceC1344590l5t
    public final Drawable Cw(boolean z) {
        return null;
    }

    @Override // X.InterfaceC1344590l5t
    public final Integer DJ() {
        return null;
    }

    @Override // X.InterfaceC1349750lED
    public final void Fv(String str) {
    }

    @Override // X.InterfaceC1349750lED
    public final void LJJJJLI() {
    }

    @Override // X.InterfaceC1349750lED
    public final void Pz(String str) {
    }

    @Override // X.InterfaceC1349750lED
    public final int Rc() {
        return 4;
    }

    @Override // X.InterfaceC1349750lED
    public final void ZC(View view, Function0<Unit> function0, Function0<Unit> function02, int i, int i2) {
    }

    @Override // X.InterfaceC1349750lED
    public final String getTabName() {
        return "story2viewer_list";
    }

    @Override // X.InterfaceC1349750lED
    public final void u5(String str, String str2, boolean z) {
    }

    public final Aweme SR() {
        Aweme aweme;
        C722580SWa c722580SWa = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        CommentContextSource commentContextSourceLIZ = c722580SWa.LIZ(this);
        return (commentContextSourceLIZ == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceLIZ)) == null) ? this.LLIZLLLIL : aweme;
    }

    @Override // X.InterfaceC1344590l5t
    public final Drawable aJ() {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        Aweme awemeSR = SR();
        if (!((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ(awemeSR != null ? AwemeExtKt.getAuthorUid(awemeSR) : null)) {
            return null;
        }
        Context context = getContext();
        if (context == null && ((abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) == null || (context = abstractC1387200mCcLIZIZ.LIZIZ()) == null)) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(C1354730lMF.LIZIZ(context), C1618440sDa.LIZIZ.LJJLIIIJJI().LIZ(SR()));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, C1354730lMF.LIZIZ(context));
        if (numLIZJ != null) {
            tuxIconDrawable.LJFF(numLIZJ.intValue());
        }
        return tuxIconDrawable;
    }

    @Override // X.InterfaceC1344590l5t
    public final Drawable GF(Context context) {
        String authorUid;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        Aweme awemeSR = SR();
        Activity activityLIZIZ = null;
        if (awemeSR != null) {
            authorUid = AwemeExtKt.getAuthorUid(awemeSR);
        } else {
            authorUid = null;
        }
        if (!((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ(authorUid)) {
            return null;
        }
        if (context == null) {
            Context context2 = getContext();
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null) {
                activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
            }
            boolean z = C1354730lMF.LIZ;
            if (context2 == null) {
                if (activityLIZIZ == null) {
                    C844470XAv.LIZ.getClass();
                    context2 = C844470XAv.LIZ();
                } else {
                    context2 = activityLIZIZ;
                }
            }
            context = C1354730lMF.LIZIZ(context2);
        }
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(context, C1618440sDa.LIZIZ.LJJLIIIJJI().LIZ(SR()));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ != null) {
            tuxIconDrawable.LJFF(numLIZJ.intValue());
        }
        return tuxIconDrawable;
    }

    @Override // X.InterfaceC1344590l5t
    public final CharSequence c4(Context context) {
        String authorUid;
        int iLj1;
        int i;
        Aweme aweme;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        C722580SWa c722580SWa = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        CommentContextSource commentContextSourceLIZ = c722580SWa.LIZ(this);
        if (commentContextSourceLIZ != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceLIZ)) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        boolean zLIZJ = ((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ(authorUid);
        ICommentPageActionBarVMAbility iCommentPageActionBarVMAbility = (ICommentPageActionBarVMAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ICommentPageActionBarVMAbility.class, null);
        if (iCommentPageActionBarVMAbility != null) {
            iLj1 = iCommentPageActionBarVMAbility.lj1();
        } else {
            iLj1 = 1;
        }
        if (zLIZJ && iLj1 > 1 && C1349280lDS.LJIIJJI()) {
            if (this.LLJ >= 0) {
                return C1372520low.LIZIZ(SR(), this.LLJ);
            }
            return "";
        }
        if (this.LLJ < 0) {
            i = this.LLJIJIL;
        } else {
            i = this.LLJI;
        }
        if (i != 0) {
            if (context == null) {
                C844470XAv.LIZ.getClass();
                context = C844470XAv.LIZ();
            }
            return C786410Ut5.j4(context.getResources().getString(i), Arrays.copyOf(new Object[]{C1372520low.LIZIZ(SR(), this.LLJ)}, 1));
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Fragment fragment;
        super.onViewCreated(view, bundle);
        Object objLJIIIZ = C1618440sDa.LIZIZ.LJJLIIIJJI().LJIIIZ(new C729040Sik(new AwS670S0100000_21(this, 9), this.LLJILJILJ));
        if ((objLJIIIZ instanceof Fragment) && (fragment = (Fragment) objLJIIIZ) != 0) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZJ(R.id.w_w, fragment, "story");
            c19ehLJIIJ.LJIIIZ();
            if (fragment instanceof InterfaceC330650Cxj) {
                this.LLJILJIL = (InterfaceC330650Cxj) fragment;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        Context contextLIZIZ;
        if (C295880Bik.LIZLLL) {
            if (!C295780Bia.LIZIZ || viewGroup == null || (contextLIZIZ = viewGroup.getContext()) == null) {
                boolean z = C1354730lMF.LIZ;
                contextLIZIZ = C1354730lMF.LIZIZ(layoutInflater.getContext());
            }
            viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(contextLIZIZ), R.layout.a4t, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.a4t, viewGroup, false);
        }
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
