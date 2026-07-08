package com.ss.android.ugc.aweme.music.vm;

import X.AbstractC316870CbV;
import X.C005K;
import X.C005L;
import X.C005M;
import X.C005N;
import X.C01GW;
import X.C036E;
import X.C07X7;
import X.C07X8;
import X.C07X9;
import X.C0XKC;
import X.C1252710ihh;
import X.C1357705Tb;
import X.C1389890mGx;
import X.C13LE;
import X.C14EU;
import X.C15438062q;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C1954807lC;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C317290CcB;
import X.C452501pT;
import X.C598130Nd5;
import X.C598150Nd7;
import X.C608360Nta;
import X.C610430Nwv;
import X.C615950ODx;
import X.C623470Ocr;
import X.C627660Ojc;
import X.C631510Opp;
import X.C631530Opr;
import X.C631540Ops;
import X.C631560Opu;
import X.C631600Opy;
import X.C631630Oq1;
import X.C631640Oq2;
import X.C631680Oq6;
import X.C632050Oqh;
import X.C632070Oqj;
import X.C632090Oql;
import X.C632120Oqo;
import X.C632210Oqx;
import X.C632540OrU;
import X.C633020OsG;
import X.C633710OtN;
import X.C634020Ots;
import X.C723600SZy;
import X.C844470XAv;
import X.EnumC631610Opz;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC615940ODw;
import X.InterfaceC634000Otq;
import X.InterfaceC736910SvR;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.fanspotlight.service.IMusicFanSpotlightService;
import com.ss.android.ugc.aweme.music.model.ArtistHonorLabel;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public final class OriginMusicListViewModel extends AssemListViewModel<C632540OrU, InterfaceC1891350zJl, C610430Nwv> {
    public final InterfaceC736910SvR<InterfaceC615940ODw> LL;
    public C631640Oq2 LLILLJJLI;
    public List<Long> LLILLL;
    public boolean LLILZ;
    public boolean LLIZ;
    public volatile PinnedMusicList LLIZLLLIL;
    public boolean LLJ;
    public long LLJI;
    public volatile boolean LLJIJIL;
    public volatile boolean LLJILJIL;
    public volatile String LLJJI;
    public volatile C07X8 LLJJIII;
    public volatile int LLJJIJI;
    public ArtistHonorLabel LLJJIJIL;
    public int LLJJJIL;
    public final C1559260qg8 LLILZIL = new C1559260qg8(new C723600SZy(this, OriginMusicArg.class, null), true);
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(524));
    public boolean LLJILJILJ = true;
    public final CopyOnWriteArrayList<MusicGroup> LLJILLL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<MusicGroup> LLJJ = new CopyOnWriteArrayList<>();
    public boolean LLJJIJIIJIL = true;
    public volatile DspPlatform LLJJJ = DspPlatform.UNKNOWN;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        AssemViewModel.asyncSubscribe$default(this, new C2217381BqS() { // from class: X.0Opt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C632540OrU c632540OrU = (C632540OrU) obj;
                c632540OrU.getClass();
                return C627260Oiy.LIZLLL(c632540OrU);
            }
        }, null, new AwS588S0100000_9(this, 345), new AwS553S0100000_9(this, 1355), new AwS588S0100000_9(this, 346), 2, null);
        this.LLILLJJLI = (C631640Oq2) C1252710ihh.LJIIIZ(this, C13LE.LIZ(InterfaceC634000Otq.class));
        C1252710ihh.LJIIL(this, C13LE.LIZ(InterfaceC634000Otq.class), new C2217381BqS() { // from class: X.0Opv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C631640Oq2) obj).LJII;
            }
        }, new AwS588S0100000_9(this, 347));
        EventBus.LIZLLL().LJIJJ(this);
    }

    public final OriginMusicArg AQ2() {
        return (OriginMusicArg) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C632540OrU(false, 254);
    }

    public final void refresh() {
        boolean zLIZIZ;
        C631640Oq2 c631640Oq2;
        String str;
        C632120Oqo c632120Oqo = C632120Oqo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refresh isAbnormal:");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", userId:");
        C631640Oq2 c631640Oq22 = this.LLILLJJLI;
        sbLIZ.append(c631640Oq22 != null ? c631640Oq22.LIZ : null);
        sbLIZ.append(", isNetworkAvailable:");
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        sbLIZ.append(zLIZIZ);
        sbLIZ.append(", isRefreshing: ");
        sbLIZ.append(this.LLJIJIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c632120Oqo.getClass();
        C632120Oqo.LIZ(strLIZIZ);
        if (!this.LLIZ && (c631640Oq2 = this.LLILLJJLI) != null && (str = c631640Oq2.LIZ) != null && str.length() != 0) {
            C844470XAv.LIZ();
            try {
                if (C036E.LIZ.LIZIZ()) {
                    if (this.LLJIJIL) {
                        return;
                    }
                    this.LLJIJIL = true;
                    manualListRefresh();
                    setState(AFwS240S0000000_9.get$arr$(556));
                    return;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (!((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).isStandardUIEnable()) {
            C1389890mGx c1389890mGx = new C1389890mGx(ActivityStack.getTopActivity());
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
        }
        setState(AFwS240S0000000_9.get$arr$(555));
        listClear();
    }

    public final boolean wQ2() {
        ServiceManager serviceManager;
        IAccountService iAccountService;
        AccountUserService accountUserServiceLJIIJ;
        C631640Oq2 c631640Oq2 = this.LLILLJJLI;
        if (c631640Oq2 != null && c631640Oq2.LIZJ) {
            C632210Oqx.LIZ.getClass();
            if (C632210Oqx.LJIIJ() && ((serviceManager = ServiceManager.get()) == null || (iAccountService = (IAccountService) serviceManager.getService(IAccountService.class)) == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || !accountUserServiceLJIIJ.getCurUser().isAccuratePrivateAccount())) {
                return true;
            }
        }
        return false;
    }

    public final void GQ2() {
        C632070Oqj.LIZIZ().storeBoolean("fan_spotlight_section_expanded", !C632070Oqj.LIZIZ().getBoolean("fan_spotlight_section_expanded", true));
        listSetItems(vQ2(this, null, null, null, null, null, null, 63));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZLLL().LJJI(this);
    }

    public OriginMusicListViewModel(C615950ODx c615950ODx) {
        this.LL = c615950ODx;
    }

    public final int EQ2(Aweme aweme) {
        C07X7 c07x7;
        String mid;
        C07X8 c07x8 = this.LLJJIII;
        if (c07x8 instanceof C07X7) {
            c07x7 = (C07X7) c07x8;
        } else {
            c07x7 = null;
        }
        if (c07x7 == null) {
            return -1;
        }
        C632120Oqo c632120Oqo = C632120Oqo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeFanSpotlight id: ");
        sbLIZ.append(aweme.getAid());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c632120Oqo.getClass();
        C632120Oqo.LIZ(strLIZIZ);
        int i = 0;
        int i2 = -1;
        for (Aweme aweme2 : c07x7.LIZ) {
            int i3 = i + 1;
            if (i >= 0) {
                if (Intrinsics.LJFF(aweme2.getAid(), aweme.getAid())) {
                    i2 = i;
                }
                i = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        ArrayList arrayList = new ArrayList(c07x7.LIZ);
        ListProtector.remove(arrayList, i2);
        this.LLJJIII = new C07X7(arrayList);
        setState(new AwS588S0100000_9(arrayList, (List<InterfaceC1891350zJl>) 601));
        listSetItems(vQ2(this, null, null, null, null, null, null, 63));
        C633710OtN.LIZ.getClass();
        IMusicFanSpotlightService iMusicFanSpotlightService = C633710OtN.LIZJ;
        Music music = aweme.getMusic();
        if (music != null) {
            mid = music.getMid();
        } else {
            mid = null;
        }
        iMusicFanSpotlightService.LJ(arrayList.size(), mid, aweme.getAid(), "delete");
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C598150Nd7(this, aweme, null), 3);
        return i2;
    }

    public final void HQ2(C632090Oql c632090Oql) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C631510Opp(this, c632090Oql, null), 3);
    }

    public final void IQ2(C632090Oql c632090Oql) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C631540Ops(this, c632090Oql, null), 3);
    }

    public final void KQ2(List<? extends Aweme> list) {
        C632120Oqo c632120Oqo = C632120Oqo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateFanSpotlightedVideos list: ");
        sbLIZ.append(list);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c632120Oqo.getClass();
        C632120Oqo.LIZ(strLIZIZ);
        this.LLJJIII = new C07X7(list);
        setState(new AwS588S0100000_9(list, (List<InterfaceC1891350zJl>) 601));
        listSetItems(vQ2(this, null, null, null, null, null, null, 63));
    }

    public final void LQ2(User user) {
        C631640Oq2 c631640Oq2LIZ;
        C631640Oq2 c631640Oq2 = this.LLILLJJLI;
        if (c631640Oq2 != null) {
            c631640Oq2LIZ = C631640Oq2.LIZ(c631640Oq2, null, null, user, null, 4079);
        } else {
            c631640Oq2LIZ = null;
        }
        this.LLILLJJLI = c631640Oq2LIZ;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 344));
    }

    @C14EU
    public final void onAntiCrawlerEvent(C0XKC c0xkc) {
        String str = c0xkc.LIZ;
        if (str != null && a0.LJJIIZI(str, "/aweme/v1/original/music/list/?", false)) {
            EventBus.LIZLLL().LIZIZ(c0xkc);
            refresh();
        }
    }

    @C14EU
    public final void onReceiveMusic2DspAuthEvent(C608360Nta c608360Nta) {
        this.LLJJJ = C633020OsG.LIZIZ.LJIILJJIL(null);
    }

    @C14EU
    public final void onReceiveMusic2DspLinkChangeEvent(C634020Ots c634020Ots) {
        this.LLJJJ = C633020OsG.LIZIZ.LJIILJJIL(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C610430Nwv>> r9) {
        /*
            r8 = this;
            int r0 = r8.LLJJIJI
            int r0 = r0 + 1
            r8.LLJJIJI = r0
            X.0Oq2 r0 = r8.LLILLJJLI
            r7 = 0
            if (r0 == 0) goto L6a
            java.lang.String r0 = r0.LIZ
            if (r0 == 0) goto L6a
            int r0 = r0.length()
            if (r0 == 0) goto L6a
            X.0Oq2 r0 = r8.LLILLJJLI
            if (r0 == 0) goto L77
            java.lang.String r3 = r0.LIZ
        L1b:
            X.0Oq2 r0 = r8.LLILLJJLI
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.LIZIZ
            if (r0 == 0) goto L5d
            int r0 = r0.length()
            if (r0 == 0) goto L5d
            X.0Oq2 r0 = r8.LLILLJJLI
            if (r0 == 0) goto L2f
            java.lang.String r7 = r0.LIZIZ
        L2f:
            X.0Oqo r2 = X.C632120Oqo.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "OriginMusicListViewModel onRefresh, uid:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", secUid:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C632120Oqo.LIZ(r0)
            X.0Nwv r2 = new X.0Nwv
            int r4 = r8.LLJJIJI
            r6 = 0
            r5 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r0 = r8.FQ2(r2, r9)
            return r0
        L5d:
            X.0Oq2 r0 = r8.LLILLJJLI
            if (r0 == 0) goto L2f
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LJ
            if (r0 == 0) goto L2f
            java.lang.String r7 = r0.getSecUid()
            goto L2f
        L6a:
            X.0Oq2 r0 = r8.LLILLJJLI
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LJ
            if (r0 == 0) goto L77
            java.lang.String r3 = r0.getUid()
            goto L1b
        L77:
            r3 = r7
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    public final void xQ2(C632090Oql c632090Oql) {
        List listVQ2;
        if (c632090Oql.getMusicItemModel().unFoldStatus) {
            listVQ2 = vQ2(this, null, null, null, null, c632090Oql.getMusicModel().getMusicId(), null, 47);
        } else {
            listVQ2 = vQ2(this, null, null, null, null, null, c632090Oql.getMusicModel().getMusicId(), 31);
        }
        listSetItems(listVQ2);
    }

    public final Music yQ2(MusicModel musicModel) {
        Music musicConvertToMusic = musicModel.convertToMusic();
        musicConvertToMusic.setDuration(musicConvertToMusic.getDuration() / LSPassThroughRecordSizeConfig.DEFAULT);
        musicConvertToMusic.setShootDuration(Integer.valueOf(musicConvertToMusic.getShootDuration() / LSPassThroughRecordSizeConfig.DEFAULT));
        musicConvertToMusic.setAuditionDuration(Integer.valueOf(musicConvertToMusic.getAuditionDuration() / LSPassThroughRecordSizeConfig.DEFAULT));
        return musicConvertToMusic;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a3 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(X.C610430Nwv r12, X.InterfaceC1364105Vn<? super X.C0O7A<X.C615970ODz>> r13) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel.BQ2(X.0Nwv, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.music.model.PinnedMusicList> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C610410Nwt
            if (r0 == 0) goto L56
            r5 = r8
            X.0Nwt r5 = (X.C610410Nwt) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 == r1) goto L48
            if (r0 != r2) goto L6c
            X.C155000ia.LIZIZ(r4)
        L25:
            X.0O7A r4 = (X.C0O7A) r4
            boolean r0 = r4 instanceof X.C0O79
            if (r0 == 0) goto L5c
            X.0O79 r4 = (X.C0O79) r4
            D extends X.0O5h r0 = r4.LJ
            X.0OE0 r0 = (X.C0OE0) r0
            com.ss.android.ugc.aweme.music.model.PinnedMusicList r0 = r0.LIZ
            return r0
        L34:
            X.C155000ia.LIZIZ(r4)
            X.0SvR<X.0ODw> r0 = r6.LL
            X.00hg r0 = r0.getOperator()
            X.0ODw r0 = (X.InterfaceC615940ODw) r0
            r5.LLILLL = r1
            java.lang.Object r4 = r0.LIZIZ(r7, r5)
            if (r4 != r3) goto L4b
            return r3
        L48:
            X.C155000ia.LIZIZ(r4)
        L4b:
            X.01Wa r4 = (X.InterfaceC346201Wa) r4
            r5.LLILLL = r2
            java.lang.Object r4 = X.C09IC.LJJIJ(r4, r5)
            if (r4 != r3) goto L25
            return r3
        L56:
            X.0Nwt r5 = new X.0Nwt
            r5.<init>(r6, r8)
            goto L12
        L5c:
            boolean r0 = r4 instanceof X.C0O7B
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.music.model.PinnedMusicList r0 = new com.ss.android.ugc.aweme.music.model.PinnedMusicList
            r0.<init>()
            return r0
        L66:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel.CQ2(java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void DQ2(C632090Oql c632090Oql, int i) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C631560Opu(this, c632090Oql, i, null), 3);
    }

    public final Object FQ2(C610430Nwv c610430Nwv, InterfaceC1364105Vn<? super AbstractC316870CbV<C610430Nwv>> interfaceC1364105Vn) {
        boolean z;
        if (this.LLIZ) {
            return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
        }
        C259800zU c259800zU = new C259800zU();
        if (c610430Nwv.LIZ == this.LLJJIJI && c610430Nwv.LJFF) {
            z = true;
        } else {
            z = false;
        }
        return C2296808zG.LJ(new C631530Opr(c259800zU, z, this, c610430Nwv, null), interfaceC1364105Vn);
    }

    public final void JQ2(int i, Aweme aweme) {
        C07X7 c07x7;
        String mid;
        C07X8 c07x8 = this.LLJJIII;
        if ((c07x8 instanceof C07X7) && (c07x7 = (C07X7) c07x8) != null) {
            ArrayList arrayList = new ArrayList(c07x7.LIZ);
            ListProtector.add(arrayList, i, aweme);
            this.LLJJIII = new C07X7(arrayList);
            setState(new AwS588S0100000_9(arrayList, (List<InterfaceC1891350zJl>) 601));
            listSetItems(vQ2(this, null, null, null, null, null, null, 63));
            setState(AFwS240S0000000_9.get$arr$(893));
            C633710OtN.LIZ.getClass();
            IMusicFanSpotlightService iMusicFanSpotlightService = C633710OtN.LIZJ;
            Music music = aweme.getMusic();
            if (music != null) {
                mid = music.getMid();
            } else {
                mid = null;
            }
            iMusicFanSpotlightService.LJ(arrayList.size(), mid, aweme.getAid(), "undo");
            C632120Oqo c632120Oqo = C632120Oqo.LIZ;
            StringBuilder sb = new StringBuilder("undoRemoveFanSpotlightAt newList: ");
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Aweme) it2.next()).getAid());
            }
            sb.append(arrayList2);
            String string = sb.toString();
            c632120Oqo.getClass();
            C632120Oqo.LIZ(string);
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C598130Nd5(this, arrayList, null), 3);
        }
    }

    public final void MQ2(String str, String str2) {
        C631640Oq2 c631640Oq2 = this.LLILLJJLI;
        if (c631640Oq2 == null) {
            return;
        }
        String str3 = c631640Oq2.LIZ;
        String str4 = c631640Oq2.LIZIZ;
        if (Intrinsics.LJFF(str3, str) && Intrinsics.LJFF(str4, str2)) {
            return;
        }
        this.LLILLJJLI = C631640Oq2.LIZ(c631640Oq2, str, str2, null, null, 4092);
        setState(AFwS240S0000000_9.get$arr$(557));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C610430Nwv c610430Nwv, InterfaceC1364105Vn<? super AbstractC316870CbV<C610430Nwv>> interfaceC1364105Vn) {
        return FQ2(c610430Nwv, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(java.lang.String r8, X.InterfaceC1364105Vn<? super X.C07X8> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C610400Nws
            if (r0 == 0) goto L99
            r6 = r9
            X.0Nws r6 = (X.C610400Nws) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L99
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 0
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L69
            if (r0 == r1) goto L87
            if (r0 != r2) goto La0
            X.C155000ia.LIZIZ(r5)
        L26:
            X.0O7A r5 = (X.C0O7A) r5
        L28:
            boolean r0 = r5 instanceof X.C0O79
            if (r0 == 0) goto L5b
            X.0O79 r5 = (X.C0O79) r5
            D extends X.0O5h r0 = r5.LJ
            X.0O9c r0 = (X.C614700O9c) r0
            com.ss.android.ugc.aweme.music.model.FanSpotlightPickedVideosResponse r0 = r0.LIZ
            java.util.List r1 = r0.getAwemeList()
            if (r1 != 0) goto L3c
            X.13BV r1 = X.C13BV.INSTANCE
        L3c:
            D extends X.0O5h r0 = r5.LJ
            X.0O9c r0 = (X.C614700O9c) r0
            com.ss.android.ugc.aweme.music.model.FanSpotlightPickedVideosResponse r0 = r0.LIZ
            java.lang.Boolean r0 = r0.getShowArtistPickVideos()
            if (r0 == 0) goto L59
            boolean r0 = r0.booleanValue()
        L4c:
            r7.LLILZ = r0
            X.07X7 r3 = new X.07X7
            r0 = 5
            java.util.List r0 = X.C13LP.LL(r1, r0)
            r3.<init>(r0)
        L58:
            return r3
        L59:
            r0 = 0
            goto L4c
        L5b:
            boolean r0 = r5 instanceof X.C0O7B
            if (r0 == 0) goto L58
            X.07X9 r3 = new X.07X9
            X.0O7B r5 = (X.C0O7B) r5
            X.0O6t r0 = r5.LIZLLL
            r3.<init>(r0)
            return r3
        L69:
            X.C155000ia.LIZIZ(r5)
            X.01GW r0 = r7.LLILZLL
            java.lang.Object r0 = r0.getValue()
            X.0SvR r0 = (X.InterfaceC736910SvR) r0
            if (r0 == 0) goto L97
            X.00hg r0 = r0.getOperator()
            X.0Nd6 r0 = (X.InterfaceC598140Nd6) r0
            if (r0 == 0) goto L97
            r6.LLILLL = r1
            X.01Wa r5 = r0.LJIJJ(r8)
            if (r5 != r4) goto L8a
            return r4
        L87:
            X.C155000ia.LIZIZ(r5)
        L8a:
            X.01Wa r5 = (X.InterfaceC346201Wa) r5
            if (r5 == 0) goto L97
            r6.LLILLL = r2
            java.lang.Object r5 = X.C09IC.LJIIZILJ(r5, r6)
            if (r5 != r4) goto L26
            return r4
        L97:
            r5 = r3
            goto L28
        L99:
            X.0Nws r6 = new X.0Nws
            r6.<init>(r7, r9)
            goto L12
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel.zQ2(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v142 */
    /* JADX WARN: Type inference failed for: r1v143 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Boolean, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean, java.util.List] */
    public static List vQ2(OriginMusicListViewModel originMusicListViewModel, MusicGroup musicGroup, Music music, Music music2, Music music3, String str, String str2, int i) {
        Boolean boolValueOf;
        MusicGroup highlightedGroup;
        EnumC631610Opz enumC631610Opz;
        boolean z;
        ?? highlightedGroup2;
        ?? spotlightGroup;
        MusicGroup highlightedGroup3;
        MusicGroup spotlightGroup2;
        MusicGroup spotlightGroup3;
        C631640Oq2 c631640Oq2;
        List<Long> list;
        PinnedMusicList pinnedMusicList;
        C07X8 c07x8;
        String str3 = str2;
        ?? r7 = 0;
        if ((i & 1) != 0) {
            musicGroup = null;
        }
        if ((i & 2) != 0) {
            music = null;
        }
        if ((i & 4) != 0) {
            music2 = null;
        }
        if ((i & 8) != 0) {
            music3 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        originMusicListViewModel.LLJJJIL = 0;
        if (musicGroup != null) {
            PinnedMusicList pinnedMusicList2 = originMusicListViewModel.LLIZLLLIL;
            if (pinnedMusicList2 != null) {
                pinnedMusicList2.setHighlightedGroup(musicGroup);
                Iterator<MusicGroup> it2 = originMusicListViewModel.LLJJ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    MusicGroup next = it2.next();
                    if (Intrinsics.LJFF(next, musicGroup)) {
                        if (next != null) {
                            originMusicListViewModel.LLJJ.remove(next);
                            pinnedMusicList2.setAvalibleCapicity(pinnedMusicList2.getAvalibleCapicity() + 1);
                        }
                    }
                }
            }
            if (C632050Oqh.LIZ(musicGroup, originMusicListViewModel.LLJJI)) {
                originMusicListViewModel.LLJJI = null;
            }
        } else if (music != null) {
            PinnedMusicList pinnedMusicList3 = originMusicListViewModel.LLIZLLLIL;
            if (pinnedMusicList3 != null) {
                pinnedMusicList3.setHighlightedGroup(null);
            }
            PinnedMusicList pinnedMusicList4 = originMusicListViewModel.LLIZLLLIL;
            if (pinnedMusicList4 != null) {
                MusicGroup musicGroupLIZIZ = C632050Oqh.LIZIZ(music.getIdStr(), originMusicListViewModel.LLJJ);
                if (musicGroupLIZIZ != null) {
                    originMusicListViewModel.LLJJ.remove(musicGroupLIZIZ);
                    pinnedMusicList4.setAvalibleCapicity(pinnedMusicList4.getAvalibleCapicity() + 1);
                }
            }
            if (Intrinsics.LJFF(music.getIdStr(), originMusicListViewModel.LLJJI)) {
                originMusicListViewModel.LLJJI = null;
            }
        } else if (music2 != null) {
            PinnedMusicList pinnedMusicList5 = originMusicListViewModel.LLIZLLLIL;
            if (pinnedMusicList5 != null) {
                MusicGroup musicGroupLIZIZ2 = C632050Oqh.LIZIZ(music2.getIdStr(), originMusicListViewModel.LLJILLL);
                if (musicGroupLIZIZ2 != null) {
                    originMusicListViewModel.LLJJ.add(0, musicGroupLIZIZ2);
                }
                pinnedMusicList5.setAvalibleCapicity(pinnedMusicList5.getAvalibleCapicity() - 1);
            }
            if (Intrinsics.LJFF(music2.getIdStr(), originMusicListViewModel.LLJJI)) {
                originMusicListViewModel.LLJJI = null;
            }
        } else if (music3 != null) {
            PinnedMusicList pinnedMusicList6 = originMusicListViewModel.LLIZLLLIL;
            if (pinnedMusicList6 != null) {
                MusicGroup musicGroupLIZIZ3 = C632050Oqh.LIZIZ(music3.getIdStr(), originMusicListViewModel.LLJJ);
                if (musicGroupLIZIZ3 != null) {
                    originMusicListViewModel.LLJJ.remove(musicGroupLIZIZ3);
                    pinnedMusicList6.setAvalibleCapicity(pinnedMusicList6.getAvalibleCapicity() + 1);
                }
            }
            if (Intrinsics.LJFF(music3.getIdStr(), originMusicListViewModel.LLJJI)) {
                originMusicListViewModel.LLJJI = null;
            }
        } else if (str != null) {
            originMusicListViewModel.LLJJI = null;
        } else if (str3 != null) {
            originMusicListViewModel.LLJJI = str3;
        }
        ArrayList arrayList = new ArrayList();
        if (originMusicListViewModel.LLILZ && (c07x8 = originMusicListViewModel.LLJJIII) != null) {
            if (c07x8 instanceof C07X7) {
                C07X7 c07x7 = (C07X7) c07x8;
                if (c07x7.LIZ.isEmpty()) {
                    if (originMusicListViewModel.wQ2()) {
                        arrayList.add(new C631680Oq6(C632070Oqj.LIZIZ().getBoolean("fan_spotlight_section_expanded", true), true));
                        if (C632070Oqj.LIZIZ().getBoolean("fan_spotlight_section_expanded", true)) {
                            arrayList.add(new C005K(0));
                        }
                        arrayList.add(new C631630Oq1());
                    }
                } else {
                    arrayList.add(new C631680Oq6(true, false));
                    arrayList.add(new C1357705Tb(c07x7.LIZ, originMusicListViewModel.wQ2()));
                    arrayList.add(new C631630Oq1());
                }
            } else if (c07x8 instanceof C07X9) {
                C631640Oq2 c631640Oq22 = originMusicListViewModel.LLILLJJLI;
                if (c631640Oq22 != null && c631640Oq22.LIZJ) {
                    arrayList.add(new C631680Oq6(false, false));
                    arrayList.add(new C005L(0));
                    arrayList.add(new C631630Oq1());
                }
            } else {
                throw new C1954807lC();
            }
        }
        C632120Oqo c632120Oqo = C632120Oqo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldShowHighlightEntry enableHighlightEntrance:");
        C631600Opy.LIZ.getClass();
        sbLIZ.append(C631600Opy.LIZ());
        sbLIZ.append(",isMe:");
        C631640Oq2 c631640Oq23 = originMusicListViewModel.LLILLJJLI;
        if (c631640Oq23 != null) {
            boolValueOf = Boolean.valueOf(c631640Oq23.LIZJ);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(",notSpecialAccount:");
        C632210Oqx.LIZ.getClass();
        sbLIZ.append(C632210Oqx.LJIIJ());
        sbLIZ.append(",newReleaseIds:");
        sbLIZ.append(originMusicListViewModel.LLILLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c632120Oqo.getClass();
        C632120Oqo.LIZ(strLIZIZ);
        if (C631600Opy.LIZ() && (c631640Oq2 = originMusicListViewModel.LLILLJJLI) != null && c631640Oq2.LIZJ && C632210Oqx.LJIIJ() && (list = originMusicListViewModel.LLILLL) != null && !list.isEmpty() && (((pinnedMusicList = originMusicListViewModel.LLIZLLLIL) == null || pinnedMusicList.getHighlightedGroup() == null) && (!originMusicListViewModel.LLJILLL.isEmpty()))) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof C631630Oq1) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new C005N(0));
            } else {
                arrayList.add(new C005M(0));
            }
        } else {
            PinnedMusicList pinnedMusicList7 = originMusicListViewModel.LLIZLLLIL;
            if (pinnedMusicList7 != null && (highlightedGroup = pinnedMusicList7.getHighlightedGroup()) != null) {
                originMusicListViewModel.LLJJJIL++;
                EnumC631610Opz enumC631610Opz2 = EnumC631610Opz.PINNED;
                Boolean bool = Boolean.TRUE;
                C632090Oql c632090OqlLJIIL = C632050Oqh.LJIIL(highlightedGroup, enumC631610Opz2, bool, Boolean.valueOf(C632050Oqh.LIZ(highlightedGroup, originMusicListViewModel.LLJJI)), null, Integer.valueOf(originMusicListViewModel.LLJJJIL), null, null, 104);
                if (c632090OqlLJIIL != null) {
                    arrayList.add(c632090OqlLJIIL);
                }
                if (C632050Oqh.LIZ(highlightedGroup, originMusicListViewModel.LLJJI)) {
                    arrayList.addAll(C632050Oqh.LJIIJ(highlightedGroup, bool, Integer.valueOf(originMusicListViewModel.LLJJJIL)));
                }
            }
        }
        PinnedMusicList pinnedMusicList8 = originMusicListViewModel.LLIZLLLIL;
        if (pinnedMusicList8 != null && (spotlightGroup3 = pinnedMusicList8.getSpotlightGroup()) != null) {
            originMusicListViewModel.LLJJJIL++;
            EnumC631610Opz enumC631610Opz3 = EnumC631610Opz.PINNED;
            Boolean bool2 = Boolean.FALSE;
            C632090Oql c632090OqlLJIIL2 = C632050Oqh.LJIIL(spotlightGroup3, enumC631610Opz3, bool2, Boolean.valueOf(C632050Oqh.LIZ(spotlightGroup3, originMusicListViewModel.LLJJI)), null, Integer.valueOf(originMusicListViewModel.LLJJJIL), Boolean.TRUE, spotlightGroup3.getAwemeList(), 8);
            if (c632090OqlLJIIL2 != null) {
                arrayList.add(c632090OqlLJIIL2);
            }
            if (C632050Oqh.LIZ(spotlightGroup3, originMusicListViewModel.LLJJI)) {
                arrayList.addAll(C632050Oqh.LJIIJ(spotlightGroup3, bool2, Integer.valueOf(originMusicListViewModel.LLJJJIL)));
            }
        }
        CopyOnWriteArrayList<MusicGroup> copyOnWriteArrayList = originMusicListViewModel.LLJJ;
        ArrayList<MusicGroup> arrayList3 = new ArrayList();
        for (MusicGroup musicGroup2 : copyOnWriteArrayList) {
            PinnedMusicList pinnedMusicList9 = originMusicListViewModel.LLIZLLLIL;
            if (pinnedMusicList9 != null) {
                highlightedGroup3 = pinnedMusicList9.getHighlightedGroup();
            } else {
                highlightedGroup3 = null;
            }
            boolean zLJFF = Intrinsics.LJFF(highlightedGroup3, musicGroup2);
            PinnedMusicList pinnedMusicList10 = originMusicListViewModel.LLIZLLLIL;
            if (pinnedMusicList10 != null) {
                spotlightGroup2 = pinnedMusicList10.getSpotlightGroup();
            } else {
                spotlightGroup2 = null;
            }
            boolean zLJFF2 = Intrinsics.LJFF(spotlightGroup2, musicGroup2);
            if (!zLJFF && !zLJFF2) {
                arrayList3.add(musicGroup2);
            }
        }
        for (MusicGroup musicGroup3 : arrayList3) {
            originMusicListViewModel.LLJJJIL++;
            ?? r5 = r7;
            r7 = r7;
            C632090Oql c632090OqlLJIIL3 = C632050Oqh.LJIIL(musicGroup3, EnumC631610Opz.PINNED, r5, Boolean.valueOf(C632050Oqh.LIZ(musicGroup3, originMusicListViewModel.LLJJI)), r7, Integer.valueOf(originMusicListViewModel.LLJJJIL), r7, r7, 106);
            if (c632090OqlLJIIL3 != null) {
                arrayList.add(c632090OqlLJIIL3);
            }
            if (C632050Oqh.LIZ(musicGroup3, originMusicListViewModel.LLJJI)) {
                arrayList.addAll(C632050Oqh.LJIIJ(musicGroup3, r7, Integer.valueOf(originMusicListViewModel.LLJJJIL)));
            }
        }
        CopyOnWriteArrayList<MusicGroup> copyOnWriteArrayList2 = originMusicListViewModel.LLJILLL;
        ArrayList<MusicGroup> arrayList4 = new ArrayList();
        for (MusicGroup musicGroup4 : copyOnWriteArrayList2) {
            Iterator<MusicGroup> it3 = originMusicListViewModel.LLJJ.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                MusicGroup next2 = it3.next();
                if (Intrinsics.LJFF(next2, musicGroup4)) {
                    if (next2 != null) {
                        z = true;
                    }
                }
            }
            z = false;
            PinnedMusicList pinnedMusicList11 = originMusicListViewModel.LLIZLLLIL;
            if (pinnedMusicList11 != null) {
                highlightedGroup2 = pinnedMusicList11.getHighlightedGroup();
            } else {
                highlightedGroup2 = r7;
            }
            boolean zLJFF3 = Intrinsics.LJFF(highlightedGroup2, musicGroup4);
            PinnedMusicList pinnedMusicList12 = originMusicListViewModel.LLIZLLLIL;
            if (pinnedMusicList12 != null) {
                spotlightGroup = pinnedMusicList12.getSpotlightGroup();
            } else {
                spotlightGroup = r7;
            }
            boolean zLJFF4 = Intrinsics.LJFF(spotlightGroup, musicGroup4);
            if (!z && !zLJFF3 && !zLJFF4) {
                arrayList4.add(musicGroup4);
            }
        }
        for (MusicGroup musicGroup5 : arrayList4) {
            originMusicListViewModel.LLJJJIL++;
            PinnedMusicList pinnedMusicList13 = originMusicListViewModel.LLIZLLLIL;
            if (pinnedMusicList13 != null && pinnedMusicList13.getAvalibleCapicity() > 0) {
                enumC631610Opz = EnumC631610Opz.ENABLE_PINNED;
            } else {
                enumC631610Opz = EnumC631610Opz.DISABLE_PINNED;
            }
            ?? r52 = r7;
            r7 = r7;
            C632090Oql c632090OqlLJIIL4 = C632050Oqh.LJIIL(musicGroup5, enumC631610Opz, r52, Boolean.valueOf(C632050Oqh.LIZ(musicGroup5, originMusicListViewModel.LLJJI)), r7, Integer.valueOf(originMusicListViewModel.LLJJJIL), r7, r7, 106);
            if (c632090OqlLJIIL4 != null) {
                arrayList.add(c632090OqlLJIIL4);
            }
            if (C632050Oqh.LIZ(musicGroup5, originMusicListViewModel.LLJJI)) {
                arrayList.addAll(C632050Oqh.LJIIJ(musicGroup5, r7, Integer.valueOf(originMusicListViewModel.LLJJJIL)));
            }
        }
        C632120Oqo c632120Oqo2 = C632120Oqo.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("assembleList ");
        sbLIZ2.append(arrayList);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c632120Oqo2.getClass();
        C632120Oqo.LIZ(strLIZIZ2);
        return arrayList;
    }
}
