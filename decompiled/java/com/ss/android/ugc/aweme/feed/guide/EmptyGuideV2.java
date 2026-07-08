package com.ss.android.ugc.aweme.feed.guide;

import X.C086I;
import X.C0PSR;
import X.C10LZ;
import X.C1389340mG4;
import X.C1440005kM;
import X.C15O7;
import X.C1749280vcc;
import X.C1902600zbu;
import X.C19230810Li;
import X.C19231110Ll;
import X.C19231410Lo;
import X.C19252910Tv;
import X.C19EG;
import X.C296570Bjr;
import X.C419320GcM;
import X.C487960JBq;
import X.C726240SeE;
import X.C786410Ut5;
import X.InterfaceC1264650j0x;
import X.InterfaceC1565540qqG;
import X.InterfaceC1581880rGc;
import X.InterfaceC1588500rRI;
import X.InterfaceC2385309Wh;
import X.InterfaceC728660Si8;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnClickListenerC19230910Lj;
import X.ViewOnLongClickListenerC19332710kH;
import Y.AObserverS230S0100000_28;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class EmptyGuideV2 implements InterfaceC1588500rRI, InterfaceC728660Si8, InterfaceC1565540qqG, GenericLifecycleObserver {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final Fragment LL;
    public final View LLILLJJLI;
    public final C419320GcM LLILLL;
    public C1749280vcc LLILZ;
    public C10LZ LLILZIL;
    public TuxTextView LLILZLL;
    public final C19EG LLIZ;
    public String LLIZLLLIL;
    public C19230810Li LLJ;
    public final InterfaceC1264650j0x LLJI;
    public final ViewOnLongClickListenerC19332710kH LLJIJIL = new ViewOnLongClickListenerC19332710kH(this, 0);
    public InterfaceC1581880rGc LLJILJIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC1588500rRI
    public final void LIZIZ() {
        InterfaceC1581880rGc interfaceC1581880rGc = this.LLJILJIL;
        if (interfaceC1581880rGc != null) {
            interfaceC1581880rGc.setRefreshing(false);
        }
        this.LLJI.getClass();
        C10LZ c10lz = this.LLILZIL;
        if (c10lz != null) {
            c10lz.LLJJIJIL = false;
            C786410Ut5.T(c10lz, 8);
            C786410Ut5.U(this.LLILLL, 8);
            this.LLILZIL.LJ();
        }
        LJIIJJI();
        this.LLJI.getClass();
        C1440005kM.LIZ(new C487960JBq(false));
    }

    public final C10LZ LJII() {
        ViewGroup.LayoutParams layoutParams;
        C10LZ c10lz = this.LLILZIL;
        if (c10lz == null) {
            this.LLILZIL = (C10LZ) C726240SeE.LIZIZ(this.LLILLJJLI, c10lz, R.id.wps, R.id.vs_super_recommend);
            this.LLILZIL.setContainer(new WeakReference<>(this.LLIZ));
            if (C296570Bjr.LIZIZ()) {
                ViewGroup viewGroup = (ViewGroup) this.LLILZIL.getParent();
                if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                    layoutParams.height = 0;
                    C786410Ut5.X5(layoutParams, viewGroup);
                }
                ViewGroup.LayoutParams layoutParams2 = this.LLILZIL.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -1;
                    C10LZ c10lz2 = this.LLILZIL;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c10lz2);
                    c10lz2.setLayoutParams(layoutParams2);
                }
            } else if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 1) {
                ViewGroup.LayoutParams layoutParams3 = this.LLILZIL.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = (int) (((C1389340mG4.LIZJ(this.LLIZ, null).LIZIZ * 0.712f) * 1.34f) / 0.93f);
                }
                C10LZ c10lz3 = this.LLILZIL;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c10lz3);
                c10lz3.setLayoutParams(layoutParams3);
            }
        }
        return this.LLILZIL;
    }

    public final C1749280vcc LJIIIIZZ() {
        C1749280vcc c1749280vcc = this.LLILZ;
        if (c1749280vcc == null) {
            this.LLILZ = (C1749280vcc) C726240SeE.LIZIZ(this.LLILLJJLI, c1749280vcc, R.id.w28, R.id.vs_status_view);
        }
        return this.LLILZ;
    }

    public final void LJIIJJI() {
        C786410Ut5.LJZI(8, this.LLILLL.LLILLL);
        if (!C19231410Lo.LIZIZ.LIZ()) {
            LJIIIZ();
        } else if (SharePrefCache.inst().getIsContactsUploaded().LIZ().booleanValue()) {
            LJIIIZ();
        } else {
            LJIIIZ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C1749280vcc c1749280vcc = this.LLILZ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
    }

    @Override // X.InterfaceC1588500rRI
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C10LZ c10lz = this.LLILZIL;
        if (c10lz != null) {
            c10lz.LJ();
        }
    }

    @Override // X.InterfaceC1588500rRI
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C10LZ c10lz;
        if (((IMainService) ServiceManager.get().getService(IMainService.class)).isOnFollowPage(this.LLIZ, this.LL) && (c10lz = this.LLILZIL) != null && c10lz.getVisibility() == 0) {
            C10LZ c10lz2 = this.LLILZIL;
            if (c10lz2.LLILZIL) {
                C1440005kM.LIZ(new C487960JBq(true));
                return;
            }
            GalleryLayoutManager galleryLayoutManager = c10lz2.LLIZ;
            if (galleryLayoutManager != null) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c10lz2.getList().findViewHolderForAdapterPosition(galleryLayoutManager.LLILZ);
                if (viewHolderFindViewHolderForAdapterPosition != null) {
                    ((ViewOnClickListenerC19230910Lj) viewHolderFindViewHolderForAdapterPosition).a6();
                }
            }
            C1440005kM.LIZ(new C487960JBq(true));
        }
    }

    public final void LJIIIZ() {
        if (C296570Bjr.LIZIZ()) {
            return;
        }
        C419320GcM c419320GcM = this.LLILLL;
        c419320GcM.LL.setText(2131834741);
        c419320GcM.LL.setTuxFont(22);
        c419320GcM.LLILLJJLI.setText(2131834740);
    }

    public final void LJIIJ() {
        C10LZ c10lz;
        boolean zLJI = MethodIDManager.LJI(202523);
        LIZIZ();
        if (this.LLJILJIL != null && (c10lz = this.LLILZIL) != null && c10lz.getVisibility() == 0) {
            this.LLJILJIL.setRefreshing(true);
        }
        if (this.LLJ == null) {
            this.LLJ = new C19230810Li(new C19231110Ll(), this);
        }
        C19230810Li c19230810Li = this.LLJ;
        if ((c19230810Li instanceof C19230810Li) && !c19230810Li.LLILLL) {
            c19230810Li.LLILLL = true;
            String str = "";
            if (C296570Bjr.LIZIZ()) {
                C19231110Ll c19231110Ll = (C19231110Ll) c19230810Li.LL;
                if (C296570Bjr.LIZ() == 1) {
                    str = "none";
                } else if (C296570Bjr.LIZ() == 2) {
                    str = "identity";
                } else if (C296570Bjr.LIZ() == 3) {
                    str = "combined";
                }
                C15O7<SuperAccountList> c15o7LIZIZ = c19231110Ll.LLILZIL.LIZIZ(str);
                final WeakHandler weakHandler = c19231110Ll.LL;
                c15o7LIZIZ.LIZLLL(new InterfaceC2385309Wh<TTaskResult, Object>(weakHandler) { // from class: X.09Ub
                    public final Handler LIZ;

                    {
                        this.LIZ = weakHandler;
                    }

                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7<TTaskResult> c15o7) {
                        C1C7U.LIZ("HandlerContinuation@7ec7.then");
                        Handler handler = this.LIZ;
                        if (handler == null) {
                            C1C7U.LIZIZ("HandlerContinuation@7ec7.then");
                            return null;
                        }
                        Message messageObtainMessage = handler.obtainMessage(0);
                        if (c15o7.LJIILIIL()) {
                            messageObtainMessage.obj = null;
                        } else if (c15o7.LJIILL()) {
                            messageObtainMessage.obj = c15o7.LJIIJJI();
                        } else {
                            messageObtainMessage.obj = c15o7.LJIIL();
                        }
                        C786410Ut5.LJLJJL(this.LIZ, messageObtainMessage);
                        C1C7U.LIZIZ("HandlerContinuation@7ec7.then");
                        return null;
                    }
                });
            } else {
                C19231110Ll c19231110Ll2 = (C19231110Ll) c19230810Li.LL;
                C15O7<SuperAccountList> c15o7LIZIZ2 = c19231110Ll2.LLILZIL.LIZIZ("");
                final WeakHandler weakHandler2 = c19231110Ll2.LL;
                c15o7LIZIZ2.LIZLLL(new InterfaceC2385309Wh<TTaskResult, Object>(weakHandler2) { // from class: X.09Ub
                    public final Handler LIZ;

                    {
                        this.LIZ = weakHandler2;
                    }

                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7<TTaskResult> c15o7) {
                        C1C7U.LIZ("HandlerContinuation@7ec7.then");
                        Handler handler = this.LIZ;
                        if (handler == null) {
                            C1C7U.LIZIZ("HandlerContinuation@7ec7.then");
                            return null;
                        }
                        Message messageObtainMessage = handler.obtainMessage(0);
                        if (c15o7.LJIILIIL()) {
                            messageObtainMessage.obj = null;
                        } else if (c15o7.LJIILL()) {
                            messageObtainMessage.obj = c15o7.LJIIJJI();
                        } else {
                            messageObtainMessage.obj = c15o7.LJIIL();
                        }
                        C786410Ut5.LJLJJL(this.LIZ, messageObtainMessage);
                        C1C7U.LIZIZ("HandlerContinuation@7ec7.then");
                        return null;
                    }
                });
            }
        }
        if (LJIIIIZZ() != null) {
            LJIIIIZZ().LJ();
            C786410Ut5.LLLZLZ(LJIIIIZZ(), 0);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1588500rRI
    public final View LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1588500rRI
    public final void LIZLLL() {
        LJIIJ();
    }

    @Override // X.InterfaceC1588500rRI
    public final void LIZJ(User user) {
        C10LZ c10lz = this.LLILZIL;
        if (c10lz == null) {
            return;
        }
        List<UserWithAweme> mCardItems = c10lz.getMCardItems();
        if (!C086I.LIZIZ(mCardItems)) {
            ArrayList arrayList = new ArrayList();
            for (UserWithAweme userWithAweme : mCardItems) {
                if (!TextUtils.equals(userWithAweme.getUid(), user.getUid())) {
                    arrayList.add(userWithAweme);
                }
            }
            c10lz.setData(arrayList);
            if (this.LLJ instanceof C19230810Li) {
                c10lz.LJFF();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1588500rRI
    public final void LJ(InterfaceC1581880rGc interfaceC1581880rGc) {
        this.LLJILJIL = interfaceC1581880rGc;
        LJIIJJI();
        if (!((Boolean) ComplianceServiceProvider.LJI().LJJIII().getValue()).booleanValue()) {
            LJIIJ();
        }
    }

    @Override // X.InterfaceC1588500rRI
    public final void LJFF(C0PSR c0psr) {
        C10LZ c10lz;
        if ((c0psr.LIZIZ instanceof User) && (c10lz = this.LLILZIL) != null && !C086I.LIZIZ(c10lz.getMCardItems())) {
            List<UserWithAweme> mCardItems = this.LLILZIL.getMCardItems();
            User user = (User) c0psr.LIZIZ;
            int size = mCardItems.size();
            for (int i = 0; i < size; i++) {
                User user2 = ((UserWithAweme) ListProtector.get(mCardItems, i)).getUser();
                if (TextUtils.equals(user2.getUid(), user.getUid())) {
                    user2.setFollowStatus(c0psr.LIZ);
                    if (this.LLJ instanceof C19230810Li) {
                        this.LLILZIL.LJFF();
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC1588500rRI
    public final void LJI(FollowStatus followStatus) {
        C10LZ c10lz;
        String userId = followStatus.getUserId();
        if (!TextUtils.isEmpty(userId) && (c10lz = this.LLILZIL) != null && !C086I.LIZIZ(c10lz.getMCardItems())) {
            List<UserWithAweme> mCardItems = this.LLILZIL.getMCardItems();
            int size = mCardItems.size();
            for (int i = 0; i < size; i++) {
                User user = ((UserWithAweme) ListProtector.get(mCardItems, i)).getUser();
                if (TextUtils.equals(user.getUid(), userId)) {
                    int followStatus2 = followStatus.getFollowStatus();
                    if (user.getFollowStatus() == followStatus2) {
                        return;
                    }
                    user.setFollowStatus(followStatus2);
                    if (this.LLJ instanceof C19230810Li) {
                        this.LLILZIL.LJFF();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public EmptyGuideV2(Fragment fragment, InterfaceC1264650j0x interfaceC1264650j0x) {
        this.LL = fragment;
        C19EG activity = fragment.getActivity();
        this.LLIZ = activity;
        ((IOptimizerHelperService) ServiceManager.get().getService(IOptimizerHelperService.class)).LIZLLL();
        View viewSd = C786410Ut5.Sd(R.layout.c4_, C786410Ut5.ne(activity), null);
        this.LLILLJJLI = viewSd;
        this.LLILLL = (C419320GcM) viewSd.findViewById(R.id.fkd);
        LJIIJJI();
        this.LLJI = interfaceC1264650j0x;
        fragment.getLifecycle().addObserver(this);
        C1902600zbu.LIZ.getClass();
        if (C1902600zbu.LIZ()) {
            ComplianceServiceProvider.LJI().LJJIII().observe(fragment, new AObserverS230S0100000_28(this, 106));
        }
    }
}
