package com.ss.android.ugc.aweme.comment.photocomment;

import X.C098200Yq;
import X.C09R3;
import X.C0QSJ;
import X.C0R52;
import X.C0TVI;
import X.C1344550l5p;
import X.C1349280lDS;
import X.C1350430lFJ;
import X.C1350440lFK;
import X.C1365840leA;
import X.C1365870leD;
import X.C13LE;
import X.C1401780ma8;
import X.C1440005kM;
import X.C14EU;
import X.C14K9;
import X.C1554610qYd;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2035707yF;
import X.C2217381BqS;
import X.C294430BgP;
import X.C295360Bhu;
import X.C418440Gaw;
import X.C622680Oba;
import X.C673150Qan;
import X.C687700QyG;
import X.C722580SWa;
import X.C723850SaN;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1484830ok5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC687730QyJ;
import Y.AfS190S0100000_21;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.photocomment.util.CommentPhotoDetailScope;
import com.ss.android.ugc.aweme.comment.photocomment.util.PhotoDetailAnimProtocol;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class PhotoDetailFragmentV2 extends AbsFragment implements PhotoDetailAnimProtocol, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjFiOSHELIOSc8PCovJiI+LSs4Zx87JzEjDSonKSwgDz0yLygpJzsFeg==";
    public final C1350430lFJ LL = new C1350430lFJ();
    public final C722580SWa LLILLJJLI = new C722580SWa();
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public C0R52 LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoDetailFragmentV2.class, "source", "getSource()Lcom/ss/android/ugc/aweme/comment/photocomment/PhotoDetailContextSource;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PhotoDetailFragmentV2.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.comment.photocomment.util.PhotoDetailAnimProtocol
    public final void bq0(String str) {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentPhotoDetailScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentPhotoDetailScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentPhotoDetailScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final CommentContextSource GL() {
        C722580SWa c722580SWa = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return c722580SWa.LIZ(this);
    }

    public final C1344550l5p MR() {
        C1350430lFJ c1350430lFJ = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        if (c1350430lFJ.LIZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C1344550l5p.class, null);
            c1350430lFJ.LIZ = interfaceC1555100qZQLIZIZ != null ? (C1344550l5p) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return c1350430lFJ.LIZ;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        super.onDestroy();
        CommentContextSource commentContextSourceGL = GL();
        if (commentContextSourceGL != null && (commonModel2 = commentContextSourceGL.getCommonModel()) != null) {
            commonModel2.setInPhotoCommentDetailPage(false);
        }
        if (C295360Bhu.LIZ()) {
            CommentContextSource commentContextSourceGL2 = GL();
            C1440005kM.LIZ(new C2035707yF((commentContextSourceGL2 == null || (commonModel = commentContextSourceGL2.getCommonModel()) == null) ? null : commonModel.lastViewedPhotoComment));
        }
        synchronized (C1350440lFK.LIZ) {
            try {
                InterfaceC1484830ok5 interfaceC1484830ok5 = C1350440lFK.LIZIZ;
                if (interfaceC1484830ok5 != null) {
                    interfaceC1484830ok5.release();
                }
                C1350440lFK.LIZIZ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C622680Oba.LIZLLL(this);
        C1554610qYd.LIZLLL(C1558360qeg.LJFF(this, null), PhotoDetailFragmentV2.class, this);
    }

    @Override // com.ss.android.ugc.aweme.comment.photocomment.util.PhotoDetailAnimProtocol
    public final void CM0(String str) {
        String cid;
        Comment curSelectedComment;
        C1344550l5p c1344550l5pMR = MR();
        if (c1344550l5pMR != null && (curSelectedComment = c1344550l5pMR.getCurSelectedComment()) != null) {
            cid = curSelectedComment.getCid();
        } else {
            cid = null;
        }
        if (!Intrinsics.LJFF(str, cid)) {
            return;
        }
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (!ComplianceServiceProvider.LJFF().LIZJ(3) && !ComplianceServiceProvider.LJFF().LJFF()) {
            View view2 = this.LLILZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            View view3 = this.LLILZ;
            if (view3 != null) {
                C786410Ut5.T4(view3, 1.0f);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CommentCommonModel commonModel;
        super.onCreate(bundle);
        CommentContextSource commentContextSourceGL = GL();
        if (commentContextSourceGL != null && (commonModel = commentContextSourceGL.getCommonModel()) != null) {
            commonModel.setInPhotoCommentDetailPage(true);
        }
        C622680Oba.LIZJ(this);
    }

    @C14EU
    public final void onEvent(C1365870leD c1365870leD) {
        CommentContextSource commentContextSourceGL;
        CommentCommonModel commonModel;
        User author;
        if (TextUtils.equals("comment", c1365870leD.LIZLLL) && Intrinsics.LJFF("comment_share_panel", c1365870leD.LJFF) && (commentContextSourceGL = GL()) != null && (commonModel = commentContextSourceGL.getCommonModel()) != null && commonModel.isInPhotoCommentDetailPage()) {
            C0R52 c0r52 = this.LLILZLL;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            Aweme aweme = CommentContextSourceKt.aweme(GL());
            if (aweme != null) {
                author = aweme.getAuthor();
            } else {
                author = null;
            }
            C1349280lDS.LIZ(c0r52, iLIZIZ + C1349280lDS.LJIIIZ(author));
            C1365840leA.LJ(c1365870leD, this.LLILZLL, CommentContextSourceKt.aweme(GL()), 0L);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.photocomment.util.PhotoDetailAnimProtocol
    public final void yJ(String str) {
        String cid;
        Comment curSelectedComment;
        C1344550l5p c1344550l5pMR = MR();
        if (c1344550l5pMR != null && (curSelectedComment = c1344550l5pMR.getCurSelectedComment()) != null) {
            cid = curSelectedComment.getCid();
        } else {
            cid = null;
        }
        if (Intrinsics.LJFF(str, cid)) {
            View view = this.LLILZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = this.LLILZIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0lFI
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    view2.setPadding(0, 0, 0, c20246014Ju.LIZ(7).LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        C1554610qYd.LIZJ(C1558360qeg.LJFF(this, null), PhotoDetailAnimProtocol.class, C1697810uHb.LJIILJJIL(this));
        this.LLILLL = view.findViewById(R.id.boi);
        this.LLILZ = view.findViewById(R.id.kqb);
        this.LLILZIL = view.findViewById(R.id.ybn);
        C723850SaN.LIZ(this, false, null, new AwS387S0200000_21(this, view, 18), 3);
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C1344550l5p.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZ(new AfS190S0100000_21(this, 26));
        }
        BottomToastVM bottomToastVM = (BottomToastVM) ViewModelProviders.of(this).get(BottomToastVM.class);
        bottomToastVM.vQ2(this);
        this.LLILZLL = new C0R52(bottomToastVM);
        if (C294430BgP.LIZIZ) {
            C1401780ma8 c1401780ma8 = new C1401780ma8(this, 0);
            C19EG activity = getActivity();
            if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                onBackPressedDispatcher.LIZ(this, c1401780ma8);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a2b, viewGroup, false);
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
