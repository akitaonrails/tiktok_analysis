package com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel;

import X.C11NJ;
import X.C11RK;
import X.C11RO;
import X.C11S5;
import X.C1239300iM4;
import X.C1605650rsx;
import X.C19EG;
import X.C2201941BFw;
import X.C356901a3;
import X.EnumC1615506Uf;
import X.InterfaceC1398730mVD;
import X.InterfaceC19483011Ki;
import X.InterfaceC350201Xo;
import X.InterfaceC888500YtM;
import Y.AkS476S0100000_14;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.common.experiment.DmNowQueryConfigSettings;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.chat.InboxSocPubStatusViewModel;
import com.ss.android.ugc.aweme.model.StoryStatusResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class InboxSocPubStatusViewModelImpl extends ViewModel implements InboxSocPubStatusViewModel, DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final Set<String> LLIZ = new CopyOnWriteArraySet();
    public final InterfaceC350201Xo LL;
    public final C11RK<String> LLILLJJLI;
    public final Set<String> LLILLL;
    public final Map<String, Serializable> LLILZ;
    public final Set<String> LLILZIL;
    public final C11NJ LLILZLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.im.service.chat.InboxSocPubStatusViewModel
    public final void Jk2() {
        String[] strArr = (String[]) this.LLILLL.toArray(new String[0]);
        vQ2(false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public InboxSocPubStatusViewModelImpl() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        DmNowQueryConfigSettings.DmNowQueryConfigModel dmNowQueryConfigModel = DmNowQueryConfigSettings.LIZ;
        DmNowQueryConfigSettings.DmNowQueryConfigModel dmNowQueryConfigModel2 = (DmNowQueryConfigSettings.DmNowQueryConfigModel) settingsManagerLIZLLL.LJIIIIZZ("dm_now_query_config", DmNowQueryConfigSettings.DmNowQueryConfigModel.class, dmNowQueryConfigModel);
        dmNowQueryConfigModel = dmNowQueryConfigModel2 != null ? dmNowQueryConfigModel2 : dmNowQueryConfigModel;
        InterfaceC350201Xo interfaceC350201Xo = new InterfaceC350201Xo() { // from class: X.01Xk
            @Override // X.InterfaceC350201Xo
            public final C11KS LIZ(final List list) {
                return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.01Xj
                    @Override // X.InterfaceC300801Eo
                    public final void subscribe(InterfaceC2329309At<StoryStatusResponse> interfaceC2329309At) {
                        C349801Xk c349801Xk = this.LL;
                        List<String> list2 = list;
                        c349801Xk.getClass();
                        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
                            C1AF0.LIZJ("DMNowStatusRepositoryImpl: send request in main thread");
                        }
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C349601Xi(interfaceC2329309At, list2, null), 3);
                    }
                });
            }
        };
        C11RK<String> c11rk = new C11RK<>();
        C11RO c11ro = C11S5.LIZIZ;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.LL = interfaceC350201Xo;
        this.LLILLJJLI = c11rk;
        this.LLILLL = copyOnWriteArraySet;
        this.LLILZ = new LinkedHashMap();
        this.LLILZIL = new LinkedHashSet();
        C11NJ c11nj = new C11NJ();
        this.LLILZLL = c11nj;
        c11nj.LIZ(C1239300iM4.LJ(c11rk.LJII(dmNowQueryConfigModel.nowQueryCheckInterval, TimeUnit.MILLISECONDS, c11ro, dmNowQueryConfigModel.nowQueryOnceMaxSize).LJJIL(new InterfaceC19483011Ki() { // from class: X.08Bq
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return !((List) obj).isEmpty();
            }
        }).LJJJIL(new AkS476S0100000_14(this, 1)), AFwS229S0000000_2.get$arr$(821), C1239300iM4.LIZJ, new AwS603S0100000_24(this, 607)));
    }

    @Override // com.ss.android.ugc.aweme.im.service.chat.InboxSocPubStatusViewModel
    public final Set<String> lg0() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.im.service.chat.InboxSocPubStatusViewModel
    public final Map<String, Serializable> tR0() {
        return this.LLILZ;
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Factory implements InboxSocPubStatusViewModel.Factory {
        @Override // com.ss.android.ugc.aweme.im.service.chat.InboxSocPubStatusViewModel.Factory
        public final InboxSocPubStatusViewModelImpl LIZ(C19EG c19eg) {
            if (c19eg == null) {
                return null;
            }
            return (InboxSocPubStatusViewModelImpl) ViewModelProviders.of(c19eg).get(InboxSocPubStatusViewModelImpl.class);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.LLILZLL.LJ();
        this.LLILZIL.clear();
        ((LinkedHashMap) this.LLILZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.im.service.chat.InboxSocPubStatusViewModel
    public final void qb1(List<String> list) {
        this.LLILLL.clear();
        String[] strArr = (String[]) ((ArrayList) list).toArray(new String[0]);
        vQ2(true, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // com.ss.android.ugc.aweme.im.service.chat.InboxSocPubStatusViewModel
    public final void gk2(String str, boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) LLIZ;
        if (copyOnWriteArraySet.contains(str)) {
            return;
        }
        this.LLILLJJLI.onNext(str);
        if (z) {
            this.LLILLL.add(str);
        }
        copyOnWriteArraySet.add(str);
    }

    @Override // com.ss.android.ugc.aweme.im.service.chat.InboxSocPubStatusViewModel
    public final void i72(InterfaceC1398730mVD interfaceC1398730mVD, IMUser iMUser) {
        if (iMUser != null && interfaceC1398730mVD != null) {
            IMUser.Companion.getClass();
            User userLJII = C2201941BFw.LJII(iMUser);
            C1605650rsx c1605650rsx = C1605650rsx.LIZIZ;
            EnumC1615506Uf enumC1615506Uf = EnumC1615506Uf.STORY;
            userLJII.setStoryStatus(c1605650rsx.LJIIZILJ(enumC1615506Uf, userLJII.getUid()));
            userLJII.setAllStoryMetadata(c1605650rsx.LJIJI(enumC1615506Uf, userLJII.getUid()));
            interfaceC1398730mVD.LIZLLL(userLJII);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.chat.InboxSocPubStatusViewModel
    public final void jo1(InterfaceC1398730mVD interfaceC1398730mVD, User user) {
        if (interfaceC1398730mVD != null) {
            C1605650rsx c1605650rsx = C1605650rsx.LIZIZ;
            EnumC1615506Uf enumC1615506Uf = EnumC1615506Uf.STORY;
            user.setStoryStatus(c1605650rsx.LJIIZILJ(enumC1615506Uf, user.getUid()));
            user.setAllStoryMetadata(c1605650rsx.LJIJI(enumC1615506Uf, user.getUid()));
            interfaceC1398730mVD.LIZLLL(user);
        }
    }

    public final void vQ2(boolean z, String[] strArr) {
        for (String str : strArr) {
            this.LLILLJJLI.onNext(str);
            if (z) {
                this.LLILLL.add(str);
            }
            ((CopyOnWriteArraySet) LLIZ).add(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.chat.InboxSocPubStatusViewModel
    public final void yb2(InterfaceC888500YtM interfaceC888500YtM, InterfaceC1398730mVD interfaceC1398730mVD) {
        if (interfaceC888500YtM.getSessionType() != 0 && (interfaceC1398730mVD instanceof InterfaceC1398730mVD) && interfaceC1398730mVD != null) {
            interfaceC1398730mVD.reset();
        }
    }
}
