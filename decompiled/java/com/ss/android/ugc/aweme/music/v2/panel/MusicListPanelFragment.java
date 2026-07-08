package com.ss.android.ugc.aweme.music.v2.panel;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0FNV;
import X.C0OM1;
import X.C0WZX;
import X.C0XPD;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1398110mUD;
import X.C13LE;
import X.C13LP;
import X.C15L9;
import X.C15LG;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C16H4;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19576911iZ;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C635920Oww;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C810560Vqw;
import X.C987103tV;
import X.ExecutorC1592406Li;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ProgressDialogC1399760mWs;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS100S0200000_31;
import Y.ARunnableS131S0100000_31;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.FusedMusic;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicFusion;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.music.v2.panel.MusicListPanelFragment;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.ReshootConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS63S0210000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicListPanelFragment extends BaseFragment implements InterfaceC724530SbT, InterfaceC344240DeY, ShootAbility, ViewMusicDetailAbility, C15LG {
    public static final C635920Oww LLLJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5OiYwZjHELIOSN+Zz8yJiAgZwImOywvBSYgPBUtJyo/DjctLiI2JjE=";
    public ViewOnAttachStateChangeListenerC20604515jv LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1350));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1337));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1338));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1342));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1344));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1340));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1336));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 915));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1341));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1343));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 910));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1335));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 908));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 916));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 902));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1334));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1346));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1349));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1348));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 903));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1351));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 912));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 913));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 914));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 911));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1345));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1347));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 909));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 907));
    public final ICommerceMusicLogger LLLF = (ICommerceMusicLogger) ServiceManager.get().getService(ICommerceMusicLogger.class);
    public final Map<String, C15L9> LLLFF = new LinkedHashMap();
    public final AssemVMLazy LLLFFI;
    public AwS63S0210000_9 LLLFZ;
    public LiveData<Long> LLLI;
    public LiveData<Boolean> LLLII;
    public Music LLLIIII;
    public boolean LLLIIIIL;
    public long LLLIIIL;
    public long LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public ProgressDialogC1399760mWs LLLILZ;
    public boolean LLLILZJ;
    public CreativeDialogWrapper LLLILZLLLI;
    public ProgressDialogC1399760mWs LLLIZZ;
    public final C01GW LLLJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Oww] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicListPanelFragment.class, "multiSongsViewModel", "getMultiSongsViewModel()Lcom/ss/android/ugc/aweme/music/v2/panel/MusicListPanelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLJIL = new Object() { // from class: X.0Oww
        };
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

    @Override // X.C15LG
    public final void k8() {
        C0XPD.LIZJ(this, "single_song", "click_music_shoot", null, null);
    }

    public MusicListPanelFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicListPanelViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 1339);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(161);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 904), aFwS276S0000000_31, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new AwS575S0100000_31((Fragment) this, 905), aFwS276S0000000_31, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 906), aFwS276S0000000_31, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLLFFI = assemVMLazy;
        this.LLLIIIL = -1L;
        this.LLLJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(236));
    }

    public final MusicListPanelViewModel WR() {
        AssemVMLazy assemVMLazy = this.LLLFFI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLJL;
        return (MusicListPanelViewModel) assemVMLazy.getValue();
    }

    public final String aS() {
        if (TextUtils.isEmpty((String) this.LLJJJJJIL.getValue())) {
            return null;
        }
        try {
            return JSONObjectProtectorUtils.getString(new JSONObject((String) this.LLJJJJJIL.getValue()), "shoot_from");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final String bS() {
        return (String) this.LLJJIII.getValue();
    }

    public final String getCreationId() {
        return (String) this.LLLJ.getValue();
    }

    public final String getFrom() {
        return (String) this.LLJILJILJ.getValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        List<FusedMusic> list;
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("music_fusion") : null;
        MusicFusion musicFusion = serializable instanceof MusicFusion ? (MusicFusion) serializable : null;
        int size = (musicFusion == null || (list = musicFusion.fusedMusicInfos) == null) ? 0 : list.size();
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getResources().getQuantityString(2131755710, size, Integer.valueOf(size));
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS562S0100000_18(this, 714));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // X.C15LG
    public final boolean h4() {
        return isAdded();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:250:0x0700  */
    @Override // com.ss.android.ugc.aweme.music.v2.panel.ShootAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AS0(com.ss.android.ugc.aweme.music.model.Music r28) {
        /*
            Method dump skipped, instruction units count: 1795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.v2.panel.MusicListPanelFragment.AS0(com.ss.android.ugc.aweme.music.model.Music):void");
    }

    public final void SR(C2344009Gk c2344009Gk) {
        if (!TextUtils.isEmpty(bS())) {
            ArrayList<String> arrayListUR = UR(bS());
            if (!arrayListUR.isEmpty()) {
                c2344009Gk.LJFF("prop_id", (String) ListProtector.get(arrayListUR, 0));
            }
        }
    }

    @Override // X.C15LG
    public final void Sx(MusicModel musicModel) {
        String musicId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (musicModel != null) {
            musicId = musicModel.getMusicId();
        } else {
            musicId = null;
        }
        c2344009Gk.LJIIIIZZ("music_id", musicId);
        c2344009Gk.LJIIIIZZ("enter_from", "single_song");
        c2344009Gk.LJIIIIZZ("enter_method", "click_shoot");
        C20684815ws.LJIILLIIL("download_music", c2344009Gk.LIZ);
    }

    public final ArrayList<String> UR(String str) {
        Set setLLIIJI;
        List listLJJLIIIJILLIZJL;
        if (str != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) != null) {
            setLLIIJI = C13LP.LLIIJI(listLJJLIIIJILLIZJL);
        } else {
            setLLIIJI = null;
        }
        return new ArrayList<>(setLLIIJI);
    }

    public final void VR(boolean z) {
        if (z) {
            this.LLLILZJ = false;
            ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LLLIZZ;
            if (progressDialogC1399760mWs != null) {
                C0FNV.LIZ(progressDialogC1399760mWs);
            }
            this.LLLIZZ = null;
        }
        CreativeDialogWrapper creativeDialogWrapper = this.LLLILZLLLI;
        if (creativeDialogWrapper != null && creativeDialogWrapper.isShowing()) {
            CreativeDialogWrapper creativeDialogWrapper2 = this.LLLILZLLLI;
            if (creativeDialogWrapper2 != null) {
                creativeDialogWrapper2.dismiss();
            }
            this.LLLILZLLLI = null;
        }
        ProgressDialogC1399760mWs progressDialogC1399760mWs2 = this.LLLILZ;
        if (progressDialogC1399760mWs2 != null && progressDialogC1399760mWs2.isShowing()) {
            ProgressDialogC1399760mWs progressDialogC1399760mWs3 = this.LLLILZ;
            if ((progressDialogC1399760mWs3 instanceof Dialog) && progressDialogC1399760mWs3 != null) {
                C0FNV.LIZ(progressDialogC1399760mWs3);
            }
            this.LLLILZ = null;
        }
    }

    public final C15L9 ZR(MusicModel musicModel) {
        Map<String, C15L9> map = this.LLLFF;
        String musicId = musicModel.getMusicId();
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object c15l9 = linkedHashMap.get(musicId);
        if (c15l9 == null) {
            c15l9 = new C15L9((Activity) getActivity(), (C15LG) this, false);
            linkedHashMap.put(musicId, c15l9);
        }
        return (C15L9) c15l9;
    }

    public final void cS(Function0<Unit> function0) {
        C19EG activity = getActivity();
        if (activity != null) {
            C19576911iZ c19576911iZ = C19576911iZ.LIZ;
            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
            creativeLoadingDialogBuilder.showProgress(false);
            creativeLoadingDialogBuilder.backCanCancel(false);
            creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
            creativeLoadingDialogBuilder.loadingMessage(activity.getString(R.string.txr));
            creativeLoadingDialogBuilder.clickCancelListener(new AwS610S0100000_31(function0, (Function0<Unit>) 227));
            CreativeDialogWrapper creativeDialogWrapper = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(activity, 1020, creativeLoadingDialogBuilder);
            creativeDialogWrapper.show();
            this.LLLILZLLLI = creativeDialogWrapper;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            X.01GW r0 = r12.LLIZLLLIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.music.model.MusicFusion r0 = (com.ss.android.ugc.aweme.music.model.MusicFusion) r0
            if (r0 == 0) goto L98
            com.ss.android.ugc.aweme.music.v2.panel.MusicListPanelViewModel r6 = r12.WR()
            java.util.List<com.ss.android.ugc.aweme.music.model.FusedMusic> r1 = r0.fusedMusicInfos
            java.util.ArrayList r3 = new java.util.ArrayList
            r2 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r2)
            r3.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.music.model.FusedMusic r0 = (com.ss.android.ugc.aweme.music.model.FusedMusic) r0
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.music
            r3.add(r0)
            goto L22
        L34:
            java.util.List r1 = X.C13LP.LJJJJLI(r3)
            java.util.ArrayList r9 = new java.util.ArrayList
            int r0 = X.C15438062q.LJIJJ(r1, r2)
            r9.<init>(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r11 = r1.iterator()
        L47:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r8 = r11.next()
            com.ss.android.ugc.aweme.music.model.Music r8 = (com.ss.android.ugc.aweme.music.model.Music) r8
            X.0Omy r7 = new X.0Omy
            boolean r5 = r8.isCollected()
            androidx.lifecycle.LiveData<java.lang.Long> r0 = r12.LLLI
            r10 = 0
            if (r0 == 0) goto L88
            java.lang.Object r0 = r0.getValue()
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r8.getId()
            if (r0 == 0) goto L88
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L88
            r2 = 1
        L73:
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r12.LLLII
            if (r0 == 0) goto L81
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r10 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        L81:
            r7.<init>(r8, r5, r2, r10)
            r9.add(r7)
            goto L47
        L88:
            r2 = 0
            goto L73
        L8a:
            java.util.List r2 = X.C13LP.LLIIII(r9)
            kotlin.jvm.internal.AwS597S0100000_18 r1 = new kotlin.jvm.internal.AwS597S0100000_18
            r0 = 820(0x334, float:1.149E-42)
            r1.<init>(r2, r0)
            r6.setState(r1)
        L98:
            androidx.lifecycle.LiveData<java.lang.Long> r2 = r12.LLLI
            if (r2 == 0) goto La5
            Y.AObserverS222S0100000_18 r1 = new Y.AObserverS222S0100000_18
            r0 = 7
            r1.<init>(r12, r0)
            r2.observe(r12, r1)
        La5:
            androidx.lifecycle.LiveData<java.lang.Boolean> r2 = r12.LLLII
            if (r2 == 0) goto Lb3
            Y.AObserverS222S0100000_18 r1 = new Y.AObserverS222S0100000_18
            r0 = 8
            r1.<init>(r12, r0)
            r2.observe(r12, r1)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.v2.panel.MusicListPanelFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.music.v2.panel.ViewMusicDetailAbility
    public final void sM0(Music music) {
        AwS63S0210000_9 awS63S0210000_9 = this.LLLFZ;
        if (awS63S0210000_9 != null) {
            awS63S0210000_9.invoke(music);
        }
    }

    @Override // X.C15LG
    public final void Nw(MusicModel musicModel, boolean z) {
        if (musicModel == null || getActivity() == null) {
            return;
        }
        this.LLLIILIL = false;
        C19576911iZ.LIZJ = getCreationId();
        if (z) {
            this.LLLILZJ = true;
            new SafeHandler(this).postDelayed(new ARunnableS100S0200000_31(this, musicModel, 31), 300L);
        } else {
            AwS432S0200000_31 awS432S0200000_31 = new AwS432S0200000_31(this, musicModel, 62);
            this.LLLIL = true;
            ExecutorC1592406Li.LLILLJJLI.LIZ(300L, new ARunnableS100S0200000_31(this, awS432S0200000_31, 32));
        }
    }

    @Override // X.C15LG
    public final void fB(Effect effect, MusicModel musicModel) {
        if (musicModel == null) {
            return;
        }
        C20684815ws.LJIJI("music_detail_trace", new Pair("skip_to_video_progress", "stage"));
        VR(true);
        C1398110mUD.LIZ = "single_song";
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("MusicDetailFragment", new C16H4(this, effect, musicModel, 1));
    }

    @Override // X.C15LG
    public final void hb(boolean z, boolean z2) {
        if (z) {
            VR(true);
        } else {
            C810560Vqw.LIZJ(new ARunnableS131S0100000_31(this, 84));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.music.v2.panel.MusicListPanelFragment for r16v4 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.v2.panel.MusicListPanelFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C15LG
    public final void sa(int i, boolean z) {
        if (z) {
            return;
        }
        CreativeDialogWrapper creativeDialogWrapper = this.LLLILZLLLI;
        if (creativeDialogWrapper != null) {
            CreativeLoadingDialog.DefaultImpls.updateProgress$default(creativeDialogWrapper, i, false, 2, null);
        }
        ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LLLILZ;
        if (progressDialogC1399760mWs != null) {
            progressDialogC1399760mWs.setProgress(i);
            if (i >= 98 && this.LLLILZ != null) {
                progressDialogC1399760mWs.setCancelable(true);
            }
        }
    }

    @Override // X.C15LG
    public final void eL(final int i, final MusicModel musicModel, final String str) throws Throwable {
        C19EG activity;
        if (getActivity() == null || this.LLLIILIL) {
            return;
        }
        C20684815ws.LJIJI("music_detail_trace", new Pair("to_video_progress", "stage"));
        C1398110mUD.LIZ = "single_song";
        boolean zIsRecording = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig().isRecording();
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.LLLIIL;
        if (zIsRecording) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().addMusic(musicModel, 0);
            Intent intent = new Intent();
            intent.putExtra("path", str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", "");
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                C2204961BRm.LLJJIJIL(-1, intent, activity2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOe9cJbNkiQm9OaBF1hub+y2V10B58MrtBW9PfmLrLRcVtebCaY=", null));
            }
            C19EG activity3 = getActivity();
            if (activity3 != null) {
                activity3.finish();
            }
            if (TextUtils.equals(getFrom(), "choose_music_with_banner") && (activity = getActivity()) != null) {
                C786410Ut5.ce(activity, 0, R.anim.ao);
                return;
            }
            return;
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("MusicDetailFragment", new SimpleServiceLoadCallback() { // from class: X.15Ln
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                String str2;
                Integer numValueOf;
                Map<String, Object> params;
                boolean z;
                Music music;
                Intent intent2;
                C20684815ws.LJIJI("music_detail_trace", new Pair("video_progress_start_record", "stage"));
                String str3 = "share_from_resso";
                if (Intrinsics.LJFF("share_from_resso", this.LIZ.getFrom())) {
                    str2 = "share_from_resso";
                } else {
                    str2 = "music_chart_list";
                    if (!TextUtils.equals(this.LIZ.getFrom(), "music_chart_list")) {
                        str2 = "profile_favorite_recommend";
                        if (!TextUtils.equals(this.LIZ.getFrom(), "profile_favorite_recommend")) {
                            str2 = "single_song";
                        }
                    }
                }
                HashMap<String, HashMap<String, String>> map = new HashMap<>();
                MusicListPanelFragment musicListPanelFragment = this.LIZ;
                HashMap<String, String> map2 = new HashMap<>();
                map2.put("action_originated_from", musicListPanelFragment.getFrom());
                map.put("shoot", map2);
                RecordConfig.Builder builder = new RecordConfig.Builder();
                builder.creationId(this.LIZ.getCreationId());
                builder.startRecordTime(this.LIZ.LLLIIL);
                builder.decompressTime(j);
                builder.musicDownloadDuration(jCurrentTimeMillis);
                builder.reshootConfig(new ReshootConfig(true, Boolean.TRUE));
                if (!Intrinsics.LJFF("share_from_resso", this.LIZ.getFrom())) {
                    str3 = "single_song";
                }
                builder.shootWay(str3);
                builder.enterFrom("single_song");
                builder.enterMethod("click_play_music");
                builder.translationType(16);
                builder.musicWithSticker(this.LIZ.ZR(musicModel).LJI);
                builder.musicOrigin(str2);
                builder.videoLength(Integer.valueOf(i));
                C1850180yFM c1850180yFM = C1850180yFM.LIZ;
                String str4 = (String) this.LIZ.LLJJIJIIJIL.getValue();
                String str5 = (String) this.LIZ.LLJJI.getValue();
                Boolean boolValueOf = Boolean.valueOf(this.LIZ.LLLIIIIL);
                C19EG activity4 = this.LIZ.getActivity();
                if (activity4 != null && (intent2 = activity4.getIntent()) != null) {
                    numValueOf = Integer.valueOf(intent2.getIntExtra("aweme_type", -1));
                } else {
                    numValueOf = null;
                }
                ShootExtraData shootExtraData = new ShootExtraData(str4, str5, 0, boolValueOf, null, null, null, null, null, null, null, numValueOf, null, null, null, null, null, null, null, null, null, null, null, null, 16775152, null);
                if (!((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZLLL()) {
                    params = C2097608Jq.LJ();
                } else {
                    ICommerceMusicLogger iCommerceMusicLogger = this.LIZ.LLLF;
                    c1850180yFM.getClass();
                    params = iCommerceMusicLogger.getParams(C1850180yFM.LJIILIIL.LIZIZ, new AwS610S0100000_31(musicModel, 400));
                }
                c1850180yFM.getClass();
                C1850180yFM.LIZJ(shootExtraData, params);
                builder.shootExtraData(shootExtraData);
                builder.extraEventParams(map);
                builder.recordFromFeed(((Boolean) this.LIZ.LLJJLIIIJLLLLLLLZ.getValue()).booleanValue());
                builder.ttsVoiceIDs((ArrayList) this.LIZ.LLJL.getValue());
                builder.ttsVoiceRefIDs((ArrayList) this.LIZ.LLJLIL.getValue());
                Music music2 = this.LIZ.LLLIIII;
                if (music2 == null || !music2.isOriginalSound() || ((music = this.LIZ.LLLIIII) != null && music.getMatchedSongInfo() != null)) {
                    z = true;
                } else {
                    z = false;
                }
                builder.originMusicRemoveTTS(z);
                builder.vcVoiceIDs((ArrayList) this.LIZ.LLJLILLLLZIIL.getValue());
                builder.vcVoiceRefIDs((ArrayList) this.LIZ.LLJLL.getValue());
                builder.ttsVoiceInfo((TtsVoiceInfo) this.LIZ.LLJLLIL.getValue());
                builder.musicDownloadComplete(musicModel.getDownloadComplete());
                builder.needAddRecentMusic(true);
                builder.isUsedFullSong(((Boolean) this.LIZ.LLJLLL.getValue()).booleanValue());
                String strAS = this.LIZ.aS();
                if (!TextUtils.isEmpty(strAS)) {
                    builder.shootFrom(strAS);
                }
                if (!TextUtils.isEmpty(this.LIZ.bS())) {
                    MusicListPanelFragment musicListPanelFragment2 = this.LIZ;
                    builder.stickers(musicListPanelFragment2.UR(musicListPanelFragment2.bS()));
                    MusicListPanelFragment musicListPanelFragment3 = this.LIZ;
                    ArrayList<String> arrayListUR = musicListPanelFragment3.UR(musicListPanelFragment3.bS());
                    if (!arrayListUR.isEmpty()) {
                        builder.musicSticker((String) ListProtector.get(arrayListUR, 0));
                    }
                }
                MusicStickerStruct musicStickerStruct = (MusicStickerStruct) this.LIZ.LLJJIJI.getValue();
                if (musicStickerStruct != null) {
                    builder.musicStickerStruct(musicStickerStruct);
                }
                HashMap mapLJLILLLLZI = C1ER1.LIZIZ.LJLILLLLZI(this.LIZ.getFrom(), (String) this.LIZ.LLJJJJ.getValue());
                if (mapLJLILLLLZI != null && mapLJLILLLLZI.size() > 0) {
                    builder.extraLogParams(mapLJLILLLLZI);
                }
                Effect effect = this.LIZ.ZR(musicModel).LJI;
                if (effect != null && ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService().isEffectControlGame(effect)) {
                    C19EG activity5 = this.LIZ.getActivity();
                    if (activity5 != null) {
                        asyncAVService.uiService().recordService().startRecord(activity5, builder.build());
                    }
                } else {
                    builder.musicPath(str);
                    musicModel.setMusicBeginTime(((Number) this.LIZ.LLJZ.getValue()).intValue());
                    musicModel.setMusicStart(((Number) this.LIZ.LLJZ.getValue()).intValue());
                    musicModel.setMusicStartFromCut(((Number) this.LIZ.LLJZ.getValue()).intValue());
                    musicModel.setMusicEndTime(((Number) this.LIZ.LLJZIJLIL.getValue()).intValue());
                    musicModel.isFeedPreDownloadMdp = ((Number) this.LIZ.LLL.getValue()).intValue();
                    C19EG activity6 = this.LIZ.getActivity();
                    if (activity6 != null) {
                        asyncAVService.uiService().recordService().startRecord(activity6, builder.build(), musicModel, true);
                    }
                    MusicListPanelFragment musicListPanelFragment4 = this.LIZ;
                    C1398280mUU.LJIIL(musicListPanelFragment4.LLLIIIL, musicListPanelFragment4.getCreationId());
                }
                C1398280mUU.LJIILL(jCurrentTimeMillis, musicModel.getMusicId(), (String) this.LIZ.LLJJJJ.getValue(), this.LIZ.getCreationId(), (String) this.LIZ.LLJILLL.getValue());
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dqw, viewGroup, false);
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
