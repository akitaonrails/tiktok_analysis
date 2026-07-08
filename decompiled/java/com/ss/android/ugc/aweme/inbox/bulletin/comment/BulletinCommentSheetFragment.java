package com.ss.android.ugc.aweme.inbox.bulletin.comment;

import X.AbstractC316870CbV;
import X.C098200Yq;
import X.C0HWW;
import X.C0OJU;
import X.C0OPQ;
import X.C0OTL;
import X.C0OTS;
import X.C0OZB;
import X.C0QSJ;
import X.C1220000hqw;
import X.C127G;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C279150Awr;
import X.C316640Cb8;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C484220Iyq;
import X.C619000OPq;
import X.C622680Oba;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC620940OXc;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import X.InterfaceC617160OIo;
import X.InterfaceC617290OJb;
import X.InterfaceC622800Obm;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import Y.AObjectS384S0100000_9;
import Y.AObjectS62S0000000_9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.ability.BulletinCommentSheetAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentSheetFragment extends BaseFragment implements BulletinCommentSheetAbility, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static long LLJJIJIIJIL = 0;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiKyArZic5JSM2PCwiHELIOSZyw8JSgpJzt9CjAgJSonISsPJiI+LSs4Gic2LTEKOy40JSAiPQ==";
    public final C736950SvV LLIZ;
    public final C736950SvV LLIZLLLIL;
    public C0OTS LLJ;
    public C127G LLJI;
    public C0OTL LLJIJIL;
    public InterfaceC622800Obm LLJILJIL;
    public InterfaceC617290OJb LLJILJILJ;
    public C0OJU LLJILLL;
    public C0OZB LLJJ;
    public InterfaceC617160OIo LLJJI;
    public InterfaceC665370Q7z LLJJIII;
    public C0QSJ LLJJIJI;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == C0OTL.class) {
            this.LLJIJIL = (C0OTL) obj;
        } else if (cls == InterfaceC622800Obm.class) {
            this.LLJILJIL = (InterfaceC622800Obm) obj;
        } else if (cls == InterfaceC617290OJb.class) {
            this.LLJILJILJ = (InterfaceC617290OJb) obj;
        } else if (cls == C0OJU.class) {
            this.LLJILLL = (C0OJU) obj;
        } else if (cls == C0OZB.class) {
            this.LLJJ = (C0OZB) obj;
        } else if (cls == InterfaceC617160OIo.class) {
            this.LLJJI = (InterfaceC617160OIo) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class, BulletinFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == C0OTL.class) {
            return this.LLJIJIL;
        }
        if (cls == InterfaceC622800Obm.class) {
            return this.LLJILJIL;
        }
        if (cls == InterfaceC617290OJb.class) {
            return this.LLJILJILJ;
        }
        if (cls == C0OJU.class) {
            return this.LLJILLL;
        }
        if (cls == C0OZB.class) {
            return this.LLJJ;
        }
        if (cls == InterfaceC617160OIo.class) {
            return this.LLJJI;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), BulletinCommentSheetAbility.class, null);
        C622680Oba.LIZLLL(this);
        super.onDestroy();
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 349556117) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == C0OTL.class) {
            this.LLJIJIL = null;
        } else if (cls == InterfaceC622800Obm.class) {
            this.LLJILJIL = null;
        } else if (cls == InterfaceC617290OJb.class) {
            this.LLJILJILJ = null;
        } else if (cls == C0OJU.class) {
            this.LLJILLL = null;
        } else if (cls == C0OZB.class) {
            this.LLJJ = null;
        } else if (cls == InterfaceC617160OIo.class) {
            this.LLJJI = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public BulletinCommentSheetFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinCommentActionViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(283);
        C451460Hn6 c451460Hn6 = new C451460Hn6(this, false);
        C451620HnM c451620HnM = new C451620HnM(this, true);
        C338520DOw c338520DOw = new C338520DOw(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLIZ = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_9, c451460Hn6, c451620HnM, c338520DOw);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(BulletinCommentListViewModel.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(284), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    }

    public final Map<String, String> SR() {
        Serializable serializable;
        HashMap map;
        Bundle arguments = getArguments();
        return (arguments == null || (serializable = arguments.getSerializable("extra_event_params")) == null) ? C2097608Jq.LJ() : (!(serializable instanceof HashMap) || (map = (HashMap) serializable) == null) ? C2097608Jq.LJ() : map;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BulletinCommentActionViewModel.class, new AObjectS384S0100000_9(this, 31), BulletinCommentListViewModel.class, new AObjectS62S0000000_9(this, 29)}, defaultViewModelProviderFactory);
                    this.LLJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (C279150Awr.LIZ()) {
            BulletinCommentListViewModel bulletinCommentListViewModel = (BulletinCommentListViewModel) this.LLIZLLLIL.getValue();
            List<? extends InterfaceC1891350zJl> listLIZ = bulletinCommentListViewModel.getState().LL.LIZ();
            if (listLIZ != null) {
                BulletinCommentListViewModel.LLJILJILJ = bulletinCommentListViewModel.LLILLL;
                BulletinCommentListViewModel.LLJILLL = listLIZ;
                AbstractC316870CbV.LIZ.getClass();
                BulletinCommentListViewModel.LLJJ = new C316640Cb8(listLIZ);
            }
        }
        super.onDestroyView();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0119  */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.comment.ability.BulletinCommentSheetAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Pp0(X.C0OTS r20) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.comment.BulletinCommentSheetFragment.Pp0(X.0OTS):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        C0OTS c0ots;
        EnumC620940OXc enumC620940OXc;
        int i;
        String uid;
        if (Intrinsics.LJFF(JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"), "bulletinboard_comment_report_submit") && (c0ots = this.LLJ) != null) {
            if (Intrinsics.LJFF(c0ots.LL.getCid(), JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data").get("object_id"))) {
                C0OTL c0otl = ((BulletinCommentActionViewModel) this.LLIZ.getValue()).LL;
                if (C619000OPq.LJ(c0ots.LL)) {
                    enumC620940OXc = EnumC620940OXc.REMOVE_SECONDLY_COMMENT;
                } else {
                    enumC620940OXc = EnumC620940OXc.REMOVE_FIRSTLY_COMMENT;
                }
                c0otl.bs0(c0ots, null, enumC620940OXc);
                C0OPQ c0opq = C0OPQ.LIZ;
                String str = c0ots.LLJIJIL;
                if (str == null) {
                    str = "bulletin_board_page";
                }
                String strValueOf = String.valueOf(c0ots.LLILLJJLI);
                C0HWW c0hww = C0HWW.LIZ;
                boolean z = c0ots.LLILZ;
                c0hww.getClass();
                String strValueOf2 = String.valueOf(c0ots.LLILLL);
                String str2 = c0ots.LLJ;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String cid = c0ots.LL.getCid();
                if (cid == null) {
                    cid = "";
                }
                if (c0ots.LL.getStatus() == 11) {
                    i = 1;
                } else {
                    i = 0;
                }
                int i2 = c0ots.LLJI;
                String commentLanguage = c0ots.LL.getCommentLanguage();
                if (commentLanguage == null) {
                    commentLanguage = "";
                }
                User user = c0ots.LL.getUser();
                if (user != null && (uid = user.getUid()) != null) {
                    str3 = uid;
                }
                c0opq.getClass();
                C0OPQ.LJJII(str, "comment_panel", strValueOf, z ? 1 : 0, 1, strValueOf2, str2, cid, i, i2, commentLanguage, str3, "click", "report");
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, BulletinCommentSheetAbility.class, null, null);
        C622680Oba.LIZJ(this);
        C723850SaN.LIZ(this, false, null, new AwS588S0100000_9(this, 165), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd A[PHI: r4
      0x00dd: PHI (r4v1 int) = (r4v0 int), (r4v4 int), (r4v4 int) binds: [B:45:0x00d0, B:47:0x00d5, B:49:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0 A[PHI: r3 r4
      0x00e0: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:51:0x00de, B:49:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r4v3 int) = (r4v1 int), (r4v4 int) binds: [B:51:0x00de, B:49:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.09Gk] */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.comment.ability.BulletinCommentSheetAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EO(X.C0OTS r18, boolean r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.comment.BulletinCommentSheetFragment.EO(X.0OTS, boolean, java.lang.String):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a6i, viewGroup, false);
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
