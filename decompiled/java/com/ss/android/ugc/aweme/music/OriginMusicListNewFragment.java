package com.ss.android.ugc.aweme.music;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C09R3;
import X.C0RPA;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1252710ihh;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C1537050q6J;
import X.C1551950qUL;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2022507w7;
import X.C2022607w8;
import X.C20533215Wg;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C2277881EDy;
import X.C259800zU;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C631600Opy;
import X.C631640Oq2;
import X.C632120Oqo;
import X.C632210Oqx;
import X.C633020OsG;
import X.C633860Otc;
import X.C634020Ots;
import X.C634030Ott;
import X.C723850SaN;
import X.C724710Sbl;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC633510Ot3;
import X.InterfaceC633870Otd;
import X.InterfaceC633970Otn;
import X.InterfaceC633980Oto;
import X.InterfaceC633990Otp;
import X.InterfaceC634000Otq;
import X.InterfaceC723730SaB;
import X.InterfaceC724720Sbm;
import X.InterfaceC724760Sbq;
import X.InterfaceC737090Svj;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS109S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import com.ss.android.ugc.aweme.music.vm.LegacyCommunicateViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.profile.model.MusicTabInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS97S0110000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public final class OriginMusicListNewFragment extends ProfileListFragment implements InterfaceC737090Svj, InterfaceC633870Otd, InterfaceC634000Otq {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5OiHELIOSYwZgo+ICg6Jgg5OiYwBCw/PQE2PwM+KCg+LSs4";
    public ViewOnAttachStateChangeListenerC20604515jv LLILZLL;
    public ComposeView LLIZ;
    public FrameLayout LLIZLLLIL;
    public final C01GW LLJ = RouteArgExtension.INSTANCE.navArg(this);
    public final AssemVMLazy LLJI;
    public String LLJIJIL;
    public InterfaceC633510Ot3 LLJILJIL;
    public InterfaceC633990Otp LLJILJILJ;
    public InterfaceC633980Oto LLJILLL;
    public InterfaceC633970Otn LLJJ;
    public View LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public List<Long> LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public User LLJJJ;
    public final AssemVMLazy LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OriginMusicListNewFragment.class, "legacyVM", "getLegacyVM()Lcom/ss/android/ugc/aweme/music/vm/LegacyCommunicateViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(OriginMusicListNewFragment.class, "musicListVM", "getMusicListVM()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJJJJIL = 8;
    }

    private final void clearFromXmlViewCache() {
        this.LLILZLL = null;
        this.LLIZLLLIL = null;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void Bp() {
    }

    public /* bridge */ /* synthetic */ int HS() {
        return 0;
    }

    @Override // X.InterfaceC634000Otq, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return BS(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/music/OriginMusicListNewFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOe9cJbNkh3/hv6sdHIzInXDzuLm6WaFbeKk40hllId+", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        zS(this, z);
    }

    public OriginMusicListNewFragment() {
        AssemVMLazy assemVMLazy;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LegacyCommunicateViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 906);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(410);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJI = new AssemVMLazy(function0LJIIJ, awS553S0100000_9, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 907), aFwS240S0000000_9);
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OriginMusicListViewModel.class);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9(c19719912DlLIZ2, 908);
        AFwS240S0000000_9 aFwS240S0000000_92 = AFwS240S0000000_9.get$arr$(411);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_92, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 909), aFwS240S0000000_92, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_92, new AwS553S0100000_9((Fragment) this, 910), aFwS240S0000000_92, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_92, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 911), aFwS240S0000000_92, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJIL = assemVMLazy;
    }

    private final LegacyCommunicateViewModel GS() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (LegacyCommunicateViewModel) assemVMLazy.getValue();
    }

    private final OriginMusicListViewModel NS() {
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (OriginMusicListViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: ES, reason: merged with bridge method [inline-methods] */
    public C631640Oq2 lt() {
        User user;
        MusicTabInfo musicTabInfo;
        User user2;
        OriginalMusician originalMusician;
        User user3;
        OriginalMusician originalMusician2;
        C632120Oqo c632120Oqo = C632120Oqo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OriginMusicListNewFragment defaultObservableData, uid: ");
        OriginMusicArg originMusicArgFS = FS();
        Boolean boolValueOf = null;
        sbLIZ.append(originMusicArgFS != null ? originMusicArgFS.getUserId() : null);
        sbLIZ.append(" ,secUid:");
        OriginMusicArg originMusicArgFS2 = FS();
        sbLIZ.append(originMusicArgFS2 != null ? originMusicArgFS2.getSecUserID() : null);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c632120Oqo.getClass();
        C632120Oqo.LIZ(strLIZIZ);
        OriginMusicArg originMusicArgFS3 = FS();
        String userId = originMusicArgFS3 != null ? originMusicArgFS3.getUserId() : null;
        OriginMusicArg originMusicArgFS4 = FS();
        String secUserID = originMusicArgFS4 != null ? originMusicArgFS4.getSecUserID() : null;
        OriginMusicArg originMusicArgFS5 = FS();
        boolean zIsMe = originMusicArgFS5 != null ? originMusicArgFS5.isMe() : false;
        OriginMusicArg originMusicArgFS6 = FS();
        String previousPage = originMusicArgFS6 != null ? originMusicArgFS6.getPreviousPage() : null;
        OriginMusicArg originMusicArgFS7 = FS();
        User user4 = originMusicArgFS7 != null ? originMusicArgFS7.getUser() : null;
        boolean zXS = XS();
        OriginMusicArg originMusicArgFS8 = FS();
        List<Long> list = (originMusicArgFS8 == null || (user3 = originMusicArgFS8.getUser()) == null || (originalMusician2 = user3.getOriginalMusician()) == null) ? null : originalMusician2.newReleaseClipIds;
        OriginMusicArg originMusicArgFS9 = FS();
        String string = (originMusicArgFS9 == null || (user2 = originMusicArgFS9.getUser()) == null || (originalMusician = user2.getOriginalMusician()) == null) ? null : Long.valueOf(originalMusician.highlightMusicId).toString();
        OriginMusicArg originMusicArgFS10 = FS();
        if (originMusicArgFS10 != null && (user = originMusicArgFS10.getUser()) != null && (musicTabInfo = user.getMusicTabInfo()) != null) {
            boolValueOf = Boolean.valueOf(musicTabInfo.showArtistPickVideos);
        }
        return new C631640Oq2(userId, secUserID, zIsMe, previousPage, user4, zXS, list, string, boolValueOf, 384);
    }

    public final OriginMusicArg FS() {
        return (OriginMusicArg) this.LLJ.getValue();
    }

    public final ComposeView JS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ovr) : null;
            this.LLIZ = (ComposeView) viewFindViewById;
        }
        return (ComposeView) viewFindViewById;
    }

    @Override // X.InterfaceC1258040iqI
    public View LJJLIIIJILLIZJL() {
        InterfaceC633980Oto interfaceC633980Oto = this.LLJILLL;
        if (interfaceC633980Oto != null) {
            return interfaceC633980Oto.LJJLIIIJILLIZJL();
        }
        return null;
    }

    @Override // X.InterfaceC1206550hVF
    public boolean LJLLL() {
        InterfaceC633980Oto interfaceC633980Oto = this.LLJILLL;
        if (interfaceC633980Oto != null) {
            return interfaceC633980Oto.LJLLL();
        }
        return true;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv PS() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.owv) : null;
            this.LLILZLL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final FrameLayout QS() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.owz) : null;
            this.LLIZLLLIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    @Override // X.InterfaceC737090Svj
    public boolean W0() {
        InterfaceC633980Oto interfaceC633980Oto = this.LLJILLL;
        if (interfaceC633980Oto != null) {
            return interfaceC633980Oto.W0();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public boolean isEmpty() {
        InterfaceC633980Oto interfaceC633980Oto = this.LLJILLL;
        if (interfaceC633980Oto != null) {
            return interfaceC633980Oto.isEmpty();
        }
        return false;
    }

    private final boolean XS() {
        OriginMusicArg originMusicArgFS = FS();
        if (originMusicArgFS == null || !originMusicArgFS.isMe()) {
            return false;
        }
        C632210Oqx.LIZ.getClass();
        return C632210Oqx.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public int UR() {
        if (!isAdded()) {
            return super.UR();
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvPS = PS();
        if (viewOnAttachStateChangeListenerC20604515jvPS != null && viewOnAttachStateChangeListenerC20604515jvPS.getChildCount() > 0) {
            return C2277881EDy.LIZIZ.getViewRawBottomY(PS().getChildAt(PS().getChildCount() - 1));
        }
        FrameLayout frameLayoutQS = QS();
        return (frameLayoutQS == null || frameLayoutQS.getVisibility() != 0) ? super.UR() : C2277881EDy.LIZIZ.getViewRawBottomY(QS());
    }

    @Override // X.InterfaceC633870Otd
    public void clearData() {
        if (isViewValid()) {
            LegacyCommunicateViewModel legacyCommunicateViewModelGS = GS();
            legacyCommunicateViewModelGS.getClass();
            legacyCommunicateViewModelGS.setState(AFwS240S0000000_9.get$arr$(894));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        EventBus.LIZLLL().LJJI(this);
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void HP(boolean z) {
        InterfaceC633970Otn interfaceC633970Otn = this.LLJJ;
        if (interfaceC633970Otn != null) {
            interfaceC633970Otn.HP(z);
        }
    }

    @Override // X.InterfaceC1206550hVF
    public void Ii(boolean z) {
        if (!isViewValid()) {
            return;
        }
        LegacyCommunicateViewModel legacyCommunicateViewModelGS = GS();
        legacyCommunicateViewModelGS.getClass();
        legacyCommunicateViewModelGS.setState(AFwS240S0000000_9.get$arr$(895));
    }

    public final void RS(ComposeView composeView) {
        this.LLIZ = composeView;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void Sl(boolean z) {
        InterfaceC633970Otn interfaceC633970Otn = this.LLJJ;
        if (interfaceC633970Otn != null) {
            interfaceC633970Otn.Sl(z);
        }
    }

    public final void US(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LLILZLL = viewOnAttachStateChangeListenerC20604515jv;
    }

    public final void VS(FrameLayout frameLayout) {
        this.LLIZLLLIL = frameLayout;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void Wb(boolean z) {
        InterfaceC633970Otn interfaceC633970Otn = this.LLJJ;
        if (interfaceC633970Otn != null) {
            interfaceC633970Otn.Wb(z);
        }
    }

    @Override // X.InterfaceC633870Otd
    public void ZM(InterfaceC633510Ot3 interfaceC633510Ot3) {
        this.LLJILJIL = interfaceC633510Ot3;
        if (isAdded()) {
            GS().LL = interfaceC633510Ot3;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, X.InterfaceC1206550hVF
    public void b(boolean z) {
        InterfaceC633970Otn interfaceC633970Otn = this.LLJJ;
        if (interfaceC633970Otn != null) {
            interfaceC633970Otn.b(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void cS(boolean z) {
        View viewLJJLIIIJILLIZJL;
        InterfaceC633980Oto interfaceC633980Oto = this.LLJILLL;
        if (interfaceC633980Oto != null) {
            viewLJJLIIIJILLIZJL = interfaceC633980Oto.LJJLIIIJILLIZJL();
        } else {
            viewLJJLIIIJILLIZJL = null;
        }
        if (viewLJJLIIIJILLIZJL instanceof RecyclerView) {
            if (z) {
                ((RecyclerView) viewLJJLIIIJILLIZJL).smoothScrollToPosition(0);
            } else {
                ((RecyclerView) viewLJJLIIIJILLIZJL).scrollToPosition(0);
            }
        }
    }

    @Override // X.InterfaceC633870Otd
    public void fl(String str) {
        this.LLJIJIL = str;
        if (isAdded()) {
            GS().getClass();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void mS(boolean z) {
        this.LL = z;
        if (isAdded()) {
            GS().LLILLJJLI = z;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        C631600Opy.LIZ.getClass();
        if (C631600Opy.LIZ() && XS()) {
            try {
                OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                optionCheckUpdateParams.setLazyUpdate(true);
                String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
                C1537050q6J.LIZ.getClass();
                C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
                if (c1551950qULLIZ != null) {
                    c1551950qULLIZ.LIZ(null, C2097908Jt.LIZJ(new Pair(accessKey, Collections.singletonList(new CheckRequestBodyModel.TargetChannel("music_artist_release")))), optionCheckUpdateParams);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String userId;
        String secUserID;
        List<Long> list;
        boolean z;
        User user;
        MusicTabInfo musicTabInfo;
        User user2;
        OriginalMusician originalMusician;
        super.onCreate(bundle);
        OriginMusicArg originMusicArgFS = FS();
        User user3 = null;
        if (originMusicArgFS != null) {
            userId = originMusicArgFS.getUserId();
        } else {
            userId = null;
        }
        this.LLJJIII = userId;
        OriginMusicArg originMusicArgFS2 = FS();
        if (originMusicArgFS2 != null) {
            secUserID = originMusicArgFS2.getSecUserID();
        } else {
            secUserID = null;
        }
        this.LLJJIJI = secUserID;
        OriginMusicArg originMusicArgFS3 = FS();
        if (originMusicArgFS3 != null && (user2 = originMusicArgFS3.getUser()) != null && (originalMusician = user2.getOriginalMusician()) != null) {
            list = originalMusician.newReleaseClipIds;
        } else {
            list = null;
        }
        this.LLJJIJIIJIL = list;
        OriginMusicArg originMusicArgFS4 = FS();
        if (originMusicArgFS4 != null && (user = originMusicArgFS4.getUser()) != null && (musicTabInfo = user.getMusicTabInfo()) != null) {
            z = musicTabInfo.showArtistPickVideos;
        } else {
            z = false;
        }
        this.LLJJIJIL = z;
        OriginMusicArg originMusicArgFS5 = FS();
        if (originMusicArgFS5 != null) {
            user3 = originMusicArgFS5.getUser();
        }
        this.LLJJJ = user3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, X.0Sbl] */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, X.0Sbl] */
    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) throws Throwable {
        InterfaceC633990Otp interfaceC633990Otp;
        Object obj;
        boolean zBooleanValue = z;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/ss/android/ugc/aweme/music/OriginMusicListNewFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(zBooleanValue)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOe9cJbNkh3/hv6sdHIzInXDzuLm6WaFbeKk40hllId+", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(zBooleanValue);
        if (!isAdded()) {
            return;
        }
        AwS97S0110000_9 awS97S0110000_9 = new AwS97S0110000_9(this, zBooleanValue, 2);
        C19EG activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            Class<OriginMusicListNewFragment> superclass = OriginMusicListNewFragment.class;
            Class<?>[] interfaces = superclass.getInterfaces();
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls : interfaces) {
                if (InterfaceC724720Sbm.class.isAssignableFrom(cls)) {
                    arrayList.add(cls);
                }
            }
            while (arrayList.isEmpty()) {
                superclass = superclass.getSuperclass();
                if (superclass != null) {
                    Class<?>[] interfaces2 = superclass.getInterfaces();
                    arrayList = new ArrayList();
                    for (Class<?> cls2 : interfaces2) {
                        if (InterfaceC724720Sbm.class.isAssignableFrom(cls2)) {
                            arrayList.add(cls2);
                        }
                    }
                } else {
                    throw new IllegalStateException("Can not find target interface.");
                }
            }
            final Assembler assemblerLIZ = C0RPA.LIZ(activity);
            final C259800zU c259800zU = new C259800zU();
            ?? BQ2 = Assembler.BQ2(assemblerLIZ, this);
            c259800zU.element = BQ2;
            if (BQ2 == 0) {
                LifecycleOwner parentFragment = getParentFragment();
                if (parentFragment == null) {
                    parentFragment = requireActivity();
                }
                ?? c724710Sbl = new C724710Sbl(Assembler.BQ2(assemblerLIZ, parentFragment));
                c259800zU.element = c724710Sbl;
                Class<?>[] interfaces3 = OriginMusicListNewFragment.class.getInterfaces();
                int length = interfaces3.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Class<?> cls3 = interfaces3[i];
                    if (InterfaceC723730SaB.class.isAssignableFrom(cls3)) {
                        if (cls3 == null || !c724710Sbl.LIZIZ.containsKey(new C634030Ott(cls3, LIZ()))) {
                            break;
                        }
                    } else {
                        i++;
                    }
                }
                C724710Sbl c724710Sbl2 = (C724710Sbl) c259800zU.element;
                Class<OriginMusicListNewFragment> superclass2 = OriginMusicListNewFragment.class;
                while (superclass2 != Object.class) {
                    Class<?>[] interfaces4 = superclass2.getInterfaces();
                    ArrayList arrayList2 = new ArrayList();
                    for (Class<?> cls4 : interfaces4) {
                        if (InterfaceC723730SaB.class.isAssignableFrom(cls4)) {
                            arrayList2.add(cls4);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        c724710Sbl2.LIZLLL((Class) it2.next(), this);
                    }
                    superclass2 = superclass2.getSuperclass();
                    if (superclass2 == null) {
                        break;
                    }
                }
                getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.music.OriginMusicListNewFragment$onHiddenChanged$$inlined$setAssemServiceState$default$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (C2022507w7.LIZ[event.ordinal()] == 1) {
                            C724710Sbl c724710Sbl3 = (C724710Sbl) c259800zU.element;
                            InterfaceC723730SaB interfaceC723730SaB = (InterfaceC723730SaB) this;
                            Class<?> superclass3 = interfaceC723730SaB.getClass();
                            Class<?>[] interfaces5 = superclass3.getInterfaces();
                            if (interfaces5 != null && interfaces5.length != 0) {
                                while (superclass3 != Object.class) {
                                    Class<?>[] interfaces6 = superclass3.getInterfaces();
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Class<?> cls5 : interfaces6) {
                                        if (InterfaceC723730SaB.class.isAssignableFrom(cls5)) {
                                            arrayList3.add(cls5);
                                        }
                                    }
                                    Iterator it3 = arrayList3.iterator();
                                    while (it3.hasNext()) {
                                        c724710Sbl3.LJ((Class) it3.next(), interfaceC723730SaB);
                                    }
                                    superclass3 = superclass3.getSuperclass();
                                    if (superclass3 == null) {
                                        break;
                                    }
                                }
                            }
                            assemblerLIZ.xQ2(this);
                        }
                    }
                });
                assemblerLIZ.OQ2(this, (C724710Sbl) c259800zU.element);
            }
            ((C724710Sbl) c259800zU.element).LJI((Class) C13LP.LJJJJZI(arrayList), awS97S0110000_9);
        }
        if (zBooleanValue && (interfaceC633990Otp = this.LLJILJILJ) != null) {
            interfaceC633990Otp.yK();
        }
    }

    @C14EU
    public final void onReceiveMusic2DspLinkChangeEvent(C634020Ots c634020Ots) {
        View view;
        if (!c634020Ots.LIZ && (view = this.LLJJI) != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS109S0100000_9(this, 100), 3000L);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void ro(boolean z) {
        InterfaceC633970Otn interfaceC633970Otn = this.LLJJ;
        if (interfaceC633970Otn != null) {
            interfaceC633970Otn.ro(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void vs(boolean z) {
        InterfaceC633970Otn interfaceC633970Otn = this.LLJJ;
        if (interfaceC633970Otn != null) {
            interfaceC633970Otn.vs(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, X.0Sbl] */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, X.0Sbl] */
    public void yS(boolean z) throws Throwable {
        IProfileMusicTabService iProfileMusicTabService;
        super.setUserVisibleHint(z);
        if (!isAdded()) {
            return;
        }
        AwS24S0010000_9 awS24S0010000_9 = new AwS24S0010000_9(z, 5);
        C19EG activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            Class<OriginMusicListNewFragment> superclass = OriginMusicListNewFragment.class;
            Class<?>[] interfaces = superclass.getInterfaces();
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls : interfaces) {
                if (InterfaceC724720Sbm.class.isAssignableFrom(cls)) {
                    arrayList.add(cls);
                }
            }
            while (arrayList.isEmpty()) {
                superclass = superclass.getSuperclass();
                if (superclass != null) {
                    Class<?>[] interfaces2 = superclass.getInterfaces();
                    arrayList = new ArrayList();
                    for (Class<?> cls2 : interfaces2) {
                        if (InterfaceC724720Sbm.class.isAssignableFrom(cls2)) {
                            arrayList.add(cls2);
                        }
                    }
                } else {
                    throw new IllegalStateException("Can not find target interface.");
                }
            }
            final Assembler assemblerLIZ = C0RPA.LIZ(activity);
            final C259800zU c259800zU = new C259800zU();
            ?? BQ2 = Assembler.BQ2(assemblerLIZ, this);
            c259800zU.element = BQ2;
            if (BQ2 == 0) {
                LifecycleOwner parentFragment = getParentFragment();
                if (parentFragment == null) {
                    parentFragment = requireActivity();
                }
                ?? c724710Sbl = new C724710Sbl(Assembler.BQ2(assemblerLIZ, parentFragment));
                c259800zU.element = c724710Sbl;
                Class<?>[] interfaces3 = OriginMusicListNewFragment.class.getInterfaces();
                int length = interfaces3.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Class<?> cls3 = interfaces3[i];
                    if (InterfaceC723730SaB.class.isAssignableFrom(cls3)) {
                        if (cls3 != null) {
                            if (!c724710Sbl.LIZIZ.containsKey(new C634030Ott(cls3, LIZ()))) {
                                break;
                            }
                        }
                    } else {
                        i++;
                    }
                }
                C724710Sbl c724710Sbl2 = (C724710Sbl) c259800zU.element;
                Class<OriginMusicListNewFragment> superclass2 = OriginMusicListNewFragment.class;
                while (superclass2 != Object.class) {
                    Class<?>[] interfaces4 = superclass2.getInterfaces();
                    ArrayList arrayList2 = new ArrayList();
                    for (Class<?> cls4 : interfaces4) {
                        if (InterfaceC723730SaB.class.isAssignableFrom(cls4)) {
                            arrayList2.add(cls4);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        c724710Sbl2.LIZLLL((Class) it2.next(), this);
                    }
                    superclass2 = superclass2.getSuperclass();
                    if (superclass2 == null) {
                        break;
                    }
                }
                getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.music.OriginMusicListNewFragment$setUserVisibleHint$$inlined$setAssemServiceState$default$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (C2022607w8.LIZ[event.ordinal()] == 1) {
                            C724710Sbl c724710Sbl3 = (C724710Sbl) c259800zU.element;
                            InterfaceC723730SaB interfaceC723730SaB = (InterfaceC723730SaB) this;
                            Class<?> superclass3 = interfaceC723730SaB.getClass();
                            Class<?>[] interfaces5 = superclass3.getInterfaces();
                            if (interfaces5 != null && interfaces5.length != 0) {
                                while (superclass3 != Object.class) {
                                    Class<?>[] interfaces6 = superclass3.getInterfaces();
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Class<?> cls5 : interfaces6) {
                                        if (InterfaceC723730SaB.class.isAssignableFrom(cls5)) {
                                            arrayList3.add(cls5);
                                        }
                                    }
                                    Iterator it3 = arrayList3.iterator();
                                    while (it3.hasNext()) {
                                        c724710Sbl3.LJ((Class) it3.next(), interfaceC723730SaB);
                                    }
                                    superclass3 = superclass3.getSuperclass();
                                    if (superclass3 == null) {
                                        break;
                                    }
                                }
                            }
                            assemblerLIZ.xQ2(this);
                        }
                    }
                });
                assemblerLIZ.OQ2(this, (C724710Sbl) c259800zU.element);
            }
            ((C724710Sbl) c259800zU.element).LJI((Class) C13LP.LJJJJZI(arrayList), awS24S0010000_9);
        }
        if (z && XS()) {
            C633860Otc.LIZ.getClass();
            if (C633860Otc.LIZ().count > 0 && (iProfileMusicTabService = (IProfileMusicTabService) PluggableExtentionKt.pluggableSpi$default(IProfileMusicTabService.class, false, false, false, 14, null)) != null) {
                iProfileMusicTabService.LIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        EventBus.LIZLLL().LJIJJ(this);
        GS().LL = this.LLJILJIL;
        GS().LLILLJJLI = this.LL;
        GS().getClass();
    }

    public static void zS(OriginMusicListNewFragment originMusicListNewFragment, boolean z) throws Throwable {
        originMusicListNewFragment.yS(z);
        C2200821BBo.LIZ.getClass();
        if (C2200821BBo.LIZ() || !C2200821BBo.LJI || !z) {
            return;
        }
        C20533215Wg.LIZ(OriginMusicListNewFragment.class);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void nS(String str, String str2) {
        super.nS(str, str2);
        C632120Oqo c632120Oqo = C632120Oqo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OriginMusicListNewFragment setUserId, uid:");
        sbLIZ.append(str);
        sbLIZ.append(", secUid:");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c632120Oqo.getClass();
        C632120Oqo.LIZ(strLIZIZ);
        this.LLJJIII = str;
        this.LLJJIJI = str2;
        if (isViewValid()) {
            NS().MQ2(str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS588S0100000_9(this, 251), 3);
        this.LLJILJILJ = (InterfaceC633990Otp) C1252710ihh.LJII(this, C13LE.LIZ(InterfaceC633990Otp.class));
        this.LLJILLL = (InterfaceC633980Oto) C1252710ihh.LJII(this, C13LE.LIZ(InterfaceC633980Oto.class));
        this.LLJJ = (InterfaceC633970Otn) C1252710ihh.LJII(this, C13LE.LIZ(InterfaceC633970Otn.class));
        C2211631BhB.LJ(view.findViewById(R.id.owx), new AwS588S0100000_9(this, 252));
        NS().MQ2(this.LLJJIII, this.LLJJIJI);
        NS().LQ2(this.LLJJJ);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void P5(int i, float f, int i2) {
        InterfaceC633990Otp interfaceC633990Otp = this.LLJILJILJ;
        if (interfaceC633990Otp != null) {
            interfaceC633990Otp.P5(i, f, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!C633020OsG.LIZIZ.LJII(getActivity(), this, i, i2, intent, null)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void rS(List<Long> list, boolean z, User user) {
        this.LLJJIJIIJIL = list;
        this.LLJJIJIL = z;
        this.LLJJJ = user;
        if (isViewValid()) {
            NS().LQ2(user);
        }
    }

    public View wS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int bottomBarHeight;
        EventBus.LIZLLL().LJIJJ(this);
        OriginMusicArg originMusicArgFS = FS();
        if (originMusicArgFS != null && originMusicArgFS.isNewTabEnabled()) {
            i = R.layout.ehr;
        } else {
            i = R.layout.ehq;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        if (viewTd != null) {
            OriginMusicArg originMusicArgFS2 = FS();
            if (originMusicArgFS2 != null && (bottomBarHeight = originMusicArgFS2.getBottomBarHeight()) > 0) {
                viewTd.setPadding(0, 0, 0, bottomBarHeight);
            }
        } else {
            viewTd = null;
        }
        this.LLJJI = viewTd;
        return viewTd;
    }

    public static View BS(OriginMusicListNewFragment originMusicListNewFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewWS = originMusicListNewFragment.wS(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewWS instanceof View)) {
            viewWS = null;
        }
        if (viewWS != null) {
            try {
                ViewTreeLifecycleOwner.set(viewWS, originMusicListNewFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewWS, originMusicListNewFragment);
                viewWS.setTag(R.id.view_tree_saved_state_registry_owner, originMusicListNewFragment);
                C19EG activity = originMusicListNewFragment.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewWS;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewWS;
    }
}
