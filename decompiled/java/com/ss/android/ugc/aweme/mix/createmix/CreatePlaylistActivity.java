package com.ss.android.ugc.aweme.mix.createmix;

import X.AbstractActivityC446870Hfh;
import X.C03H5;
import X.C09R3;
import X.C0TYL;
import X.C0XQ7;
import X.C0ZP4;
import X.C1167310gTx;
import X.C1167740gUe;
import X.C1167750gUf;
import X.C1169160gWw;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1308910kAL;
import X.C13LE;
import X.C14EU;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C298660BnE;
import X.C299020Bno;
import X.C335910DEv;
import X.C442680HXm;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC335920DEw;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameFragment;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS41S2100000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS69S1000000_18;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes19.dex */
public final class CreatePlaylistActivity extends AbstractActivityC446870Hfh implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglMWEwOiHELIOSAtPSo+IT1iCj02KTEpGSMyMSklOjsSKzElPyYnMQ==";
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public int LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;
    public Aweme LLJ;
    public UrlModel LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CreatePlaylistActivity.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mix/createmix/viewmodel/MixCreateViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CreatePlaylistActivity.class, "manageVm", "getManageVm()Lcom/ss/android/ugc/aweme/mix/mixdetail/viewmodel/MixVideosManageViewModel;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.AbstractActivityC446870Hfh
    public final Fragment LLLLLZL() {
        int i = this.LLILZIL;
        if (i == 1) {
            LLLLZI().setState(new AwS32S0010000_18(true, 29));
            LLLLZI().setState(new AwS32S0010000_18(this.LLIZ, 30));
            C1167750gUf.LIZ.getClass();
            if (!C1167750gUf.LIZLLL() || C298660BnE.LIZ() || this.LLIZ) {
                C1169160gWw c1169160gWw = C1169160gWw.LIZ;
                String str = LLLLZI().LLILLJJLI;
                String str2 = LLLLZI().LLILLL;
                c1169160gWw.getClass();
                C1169160gWw.LJIJI(str, str2);
                C0TYL c0tyl = EditPlayListNameFragment.LLILZIL;
                String str3 = this.LLIZLLLIL;
                c0tyl.getClass();
                return C0TYL.LIZ(1, "", "", 0, null, null, "", null, str3, null);
            }
            C1169160gWw c1169160gWw2 = C1169160gWw.LIZ;
            String str4 = this.LLILLL;
            String str5 = this.LLILZ;
            c1169160gWw2.getClass();
            C1169160gWw.LJIJ(str4, str5);
            C442680HXm c442680HXm = GuideCreateFragment.LLJ;
            String str6 = this.LLILLL;
            String str7 = LLLLZI().LLILLL;
            c442680HXm.getClass();
            return C442680HXm.LIZ(str6, str7);
        }
        if (i != 2) {
            if (i != 4) {
                LLLLZI().setState(new AwS32S0010000_18(true, 29));
                C1169160gWw c1169160gWw3 = C1169160gWw.LIZ;
                String str8 = LLLLZI().LLILLJJLI;
                String str9 = LLLLZI().LLILLL;
                c1169160gWw3.getClass();
                C1169160gWw.LJIJI(str8, str9);
                C0TYL c0tyl2 = EditPlayListNameFragment.LLILZIL;
                Aweme aweme = this.LLJ;
                c0tyl2.getClass();
                return C0TYL.LIZ(3, "", "", 0, aweme, null, "", null, null, null);
            }
            AssemVMLazy assemVMLazy = this.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
            MixVideosManageViewModel mixVideosManageViewModel = (MixVideosManageViewModel) assemVMLazy.getValue();
            String str10 = this.LLILZLL;
            String str11 = this.LLILLL;
            mixVideosManageViewModel.LLILLJJLI = str10;
            mixVideosManageViewModel.LLILLL = "";
            mixVideosManageViewModel.LL = str11;
            MixCreateViewModel mixCreateViewModelLLLLZI = LLLLZI();
            String str12 = this.LLILZLL;
            mixCreateViewModelLLLLZI.setState(new AwS69S1000000_18(str12, 32));
            mixCreateViewModelLLLLZI.LL = str12;
            LLLLZI().LLILZLL = this.LLJI;
            LLLLZI().setState(new AwS32S0010000_18(false, 29));
            LLLLZI().LLILZIL = true;
            C1169160gWw c1169160gWw4 = C1169160gWw.LIZ;
            String str13 = ((MixVideosManageViewModel) this.LLILLJJLI.getValue()).LL;
            c1169160gWw4.getClass();
            C1169160gWw.LJIIZILJ(str13, "manage_video");
            AddMultiVideoFragment.LLJILLL.getClass();
            return C1167310gTx.LIZ(false);
        }
        LLLLZI().setState(new AwS32S0010000_18(true, 29));
        AssemVMLazy assemVMLazy2 = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJIJIL;
        MixVideosManageViewModel mixVideosManageViewModel2 = (MixVideosManageViewModel) assemVMLazy2.getValue();
        String str14 = this.LLILZLL;
        String str15 = this.LLILLL;
        mixVideosManageViewModel2.LLILLJJLI = str14;
        mixVideosManageViewModel2.LLILLL = "";
        mixVideosManageViewModel2.LL = str15;
        MixCreateViewModel mixCreateViewModelLLLLZI2 = LLLLZI();
        String str16 = this.LLILZLL;
        mixCreateViewModelLLLLZI2.setState(new AwS69S1000000_18(str16, 32));
        mixCreateViewModelLLLLZI2.LL = str16;
        LLLLZI().LLILZLL = this.LLJI;
        C1167750gUf.LIZ.getClass();
        if (!C1167750gUf.LIZLLL() || C298660BnE.LIZ()) {
            C1169160gWw c1169160gWw5 = C1169160gWw.LIZ;
            String str17 = LLLLZI().LLILLJJLI;
            String str18 = LLLLZI().LLILLL;
            c1169160gWw5.getClass();
            C1169160gWw.LJFF(str17, str18);
            C1169160gWw.LJIIZILJ(LLLLZI().LLILLJJLI, LLLLZI().LLILLL);
            C1167310gTx c1167310gTx = AddMultiVideoFragment.LLJILLL;
            boolean z = this.LLIZ;
            c1167310gTx.getClass();
            return C1167310gTx.LIZ(z);
        }
        C1169160gWw c1169160gWw6 = C1169160gWw.LIZ;
        String str19 = this.LLILLL;
        String str20 = this.LLILZ;
        c1169160gWw6.getClass();
        C1169160gWw.LJIJ(str19, str20);
        C442680HXm c442680HXm2 = GuideCreateFragment.LLJ;
        String str21 = this.LLILLL;
        String str22 = LLLLZI().LLILLL;
        c442680HXm2.getClass();
        return C442680HXm.LIZ(str21, str22);
    }

    public final MixCreateViewModel LLLLZI() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (MixCreateViewModel) assemVMLazy.getValue();
    }

    public CreatePlaylistActivity() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixCreateViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 444);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(142);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LL = new AssemVMLazy(function0LJIIJ, awS562S0100000_18, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 445), aFwS256S0000000_18);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MixVideosManageViewModel.class);
        this.LLILLJJLI = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), new AwS562S0100000_18(c19719912DlLIZ2, 446), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 447), AFwS256S0000000_18.get$arr$(143));
        this.LLILLL = "";
        this.LLILZ = "";
        this.LLILZIL = 1;
        this.LLILZLL = "";
        this.LLIZLLLIL = "";
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.AbstractActivityC446870Hfh, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onCreate", true);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("enter_from")) {
            UrlModel urlModel = null;
            try {
                stringExtra = intent.getStringExtra("enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            String str = "";
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.LLILLL = stringExtra;
            try {
                stringExtra2 = intent.getStringExtra("enter_method");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.LLILZ = stringExtra2;
            MixCreateViewModel mixCreateViewModelLLLLZI = LLLLZI();
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            mixCreateViewModelLLLLZI.LLILLJJLI = str2;
            mixCreateViewModelLLLLZI.LLILLL = str3;
            this.LLILZIL = intent.getIntExtra("open_fragment_type", 1);
            try {
                stringExtra3 = intent.getStringExtra("key_manage_mix_id");
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            this.LLILZLL = stringExtra3;
            this.LLIZ = intent.getBooleanExtra("key_is_from_live_replay", false);
            try {
                String stringExtra4 = intent.getStringExtra("default_playlist_name");
                if (stringExtra4 != null) {
                    str = stringExtra4;
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            this.LLIZLLLIL = str;
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && extras.getSerializable("key_mix_add_aweme_info") != null) {
                    this.LLJ = (Aweme) intent.getSerializableExtra("key_mix_add_aweme_info");
                }
            } catch (Exception e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            Serializable serializableExtra = intent.getSerializableExtra("playlist_cover");
            if (serializableExtra instanceof UrlModel) {
                urlModel = (UrlModel) serializableExtra;
            }
            this.LLJI = urlModel;
        }
        super.onCreate(bundle);
        C736680Sv4.LJIIIIZZ(this, LLLLZI(), new C2217381BqS() { // from class: X.0gU3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163880gOQ) obj).LLILZLL;
            }
        }, null, new AwS632S0100000_18(this, 45), 6);
        EventBus.LIZLLL().LJIJJ(this);
        C0XQ7.LJ();
        String curUserId = C0XQ7.LIZ.LJIIJ().getCurUserId();
        C0XQ7.LJ();
        String curSecUserId = C0XQ7.LIZ.LJIIJ().getCurSecUserId();
        AssemViewModel.asyncSubscribe$default(LLLLZI(), new C2217381BqS() { // from class: X.0gU2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163880gOQ) obj).LLIZ;
            }
        }, null, new AwS597S0100000_18(this, 128), AFwS206S0000000_18.get$arr$(185), new AwS41S2100000_18(this, curUserId, curSecUserId, 2), 2, null);
        AssemViewModel.asyncSubscribe$default(LLLLZI(), new C2217381BqS() { // from class: X.0gU1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163880gOQ) obj).LLIZLLLIL;
            }
        }, null, new AwS597S0100000_18(this, 129), AFwS206S0000000_18.get$arr$(184), new AwS41S2100000_18(this, curUserId, curSecUserId, 1), 2, null);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onCreate", false);
    }

    @C14EU
    public final void onCreateMixListSuccess(C1167740gUe c1167740gUe) {
        finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
