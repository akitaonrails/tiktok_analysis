package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.ui;

import X.C01GW;
import X.C03IJ;
import X.C09R3;
import X.C0BCN;
import X.C0BQO;
import X.C0BYD;
import X.C0BYX;
import X.C0PEM;
import X.C0QSJ;
import X.C13LE;
import X.C15438062q;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C301320BrW;
import X.C452501pT;
import X.C681540QoK;
import X.C681550QoL;
import X.C681610QoR;
import X.C681730Qod;
import X.C681840Qoo;
import X.C682050Qp9;
import X.C682080QpC;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC681560QoM;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC615300OBk;
import X.InterfaceC665370Q7z;
import X.InterfaceC681920Qow;
import X.InterfaceC682000Qp4;
import X.InterfaceC737790Swr;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.communication.SearchMusicMiddlePageScope;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.model.MusicSearchHistoryData;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.model.MusicSearchHistoryItem;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.model.MusicSearchTrendingData;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.viewmodel.MusicSearchTrendingVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxMiddlePageContentAssem extends UIContentAssem implements InterfaceC615300OBk, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final LynxMiddlePageContentAssem LLIZLLLIL = this;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public C681550QoL LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public final C681840Qoo LLJJIII;
    public volatile InterfaceC682000Qp4 LLJJIJI;
    public InterfaceC665370Q7z LLJJIJIIJIL;
    public C0QSJ LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LynxMiddlePageContentAssem.class, "mobAbility", "getMobAbility()Lcom/ss/android/ugc/aweme/search/pages/choosemusic/middlepage/core/lynx/communication/SearchMusicMiddleMobAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(LynxMiddlePageContentAssem.class, "trendingVM", "getTrendingVM()Lcom/ss/android/ugc/aweme/search/pages/choosemusic/middlepage/core/viewmodel/MusicSearchTrendingVM;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0Qoo] */
    public LynxMiddlePageContentAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicSearchTrendingVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 780), AFwS241S0000000_10.get$arr$(189), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 372));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(255));
        this.LLJILJILJ = C682080QpC.LIZIZ();
        this.LLJILLL = C0BYX.LIZ();
        this.LLJJIII = new InterfaceC681920Qow() { // from class: X.0Qoo
            @Override // X.InterfaceC681920Qow
            public final void pc(List<? extends MusicSearchHistory> list) {
                this.LL.Jo(list);
            }
        };
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchMusicMiddlePageScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchMusicMiddlePageScope.class);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC682000Qp4 Go() {
        /*
            r4 = this;
            X.0Qp4 r0 = r4.LLJJIJI
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0Qp4 r0 = r4.LLJJIJI     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJIJIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJIJIIJIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIJIIJIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.communication.SearchMusicMiddlePageScope> r1 = com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.communication.SearchMusicMiddlePageScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIJIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0Qp4> r0 = X.InterfaceC682000Qp4.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0Qp4 r0 = (X.InterfaceC682000Qp4) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJIJI = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.ui.LynxMiddlePageContentAssem.Go():X.0Qp4");
    }

    public final MusicSearchTrendingVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (MusicSearchTrendingVM) assemVMLazy.getValue();
    }

    public final boolean No() {
        Bundle arguments;
        if (!((Boolean) C0BCN.LIZIZ.getValue()).booleanValue()) {
            return false;
        }
        ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null);
        boolean z = iCommerceMediaService != null && iCommerceMediaService.LJIIJ();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        return z || (fragmentLJI != null && (arguments = fragmentLJI.getArguments()) != null && arguments.getBoolean("get_unlimited_music_only", false));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        ViewGroup viewGroup;
        MutableContextWrapper mutableContextWrapper;
        super.onDestroy();
        if (this.LLJILJILJ) {
            C681730Qod.LJIILIIL().LJIIIZ(this.LLJJIII);
        }
        if (this.LLJJ) {
            Lo(false);
        }
        if (C0BQO.LIZ()) {
            C681550QoL c681550QoL = this.LLJILJIL;
            if (c681550QoL != null) {
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                if (C0BQO.LIZ()) {
                    Context context = c681550QoL.LIZIZ.LIZ;
                    if ((context instanceof MutableContextWrapper) && (mutableContextWrapper = (MutableContextWrapper) context) != null) {
                        mutableContextWrapper.setBaseContext(contextLIZ);
                    }
                }
            }
        } else {
            C681550QoL c681550QoL2 = this.LLJILJIL;
            if (c681550QoL2 != null) {
                c681550QoL2.LIZIZ.LIZ();
            }
        }
        View viewLJJIJL = LJJIJL();
        if (!(viewLJJIJL instanceof ViewGroup) || (viewGroup = (ViewGroup) viewLJJIJL) == null) {
            return;
        }
        C786410Ut5.LJJJJI(viewGroup);
    }

    public final void Jo(List<? extends MusicSearchHistory> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(new MusicSearchHistoryItem(((MusicSearchHistory) it2.next()).keyword));
        }
        Oo(this, null, new MusicSearchHistoryData(arrayList), EnumC681560QoM.HISTORY, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[LOOP:0: B:18:0x0051->B:20:0x0057, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Lo(boolean r20) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.ui.LynxMiddlePageContentAssem.Lo(boolean):void");
    }

    @Override // X.InterfaceC615300OBk
    public final boolean T0(String str) {
        if (!C0BYX.LIZ() || No()) {
            return false;
        }
        Ho().vQ2(str);
        return true;
    }

    @Override // X.InterfaceC615300OBk
    public final void Vh(C682050Qp9 c682050Qp9) {
        String str;
        InterfaceC682000Qp4 interfaceC682000Qp4Go;
        C681610QoR c681610QoRBy;
        Long l;
        C681610QoR c681610QoRBy2;
        Long l2;
        if (!C301320BrW.LIZ() || (str = c682050Qp9.LIZJ) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("__lynx_timing_real_data_update");
        sbLIZ.append('_');
        sbLIZ.append(EnumC681560QoM.TRENDING.getProcessorName());
        sbLIZ.append('_');
        long jLongValue = 0;
        if (a0.LJJIIZI(str, C2188811AlT.LIZIZ(sbLIZ), false)) {
            InterfaceC682000Qp4 interfaceC682000Qp4Go2 = Go();
            if (interfaceC682000Qp4Go2 != null && (c681610QoRBy2 = interfaceC682000Qp4Go2.By()) != null) {
                Map<String, Long> map = c682050Qp9.LIZIZ;
                if (map != null && (l2 = map.get("draw_end")) != null) {
                    jLongValue = l2.longValue();
                }
                c681610QoRBy2.LIZIZ(jLongValue);
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("__lynx_timing_real_data_update");
        sbLIZ2.append('_');
        sbLIZ2.append(EnumC681560QoM.HISTORY.getProcessorName());
        sbLIZ2.append('_');
        if (!a0.LJJIIZI(str, C2188811AlT.LIZIZ(sbLIZ2), false) || (interfaceC682000Qp4Go = Go()) == null || (c681610QoRBy = interfaceC682000Qp4Go.By()) == null) {
            return;
        }
        Map<String, Long> map2 = c682050Qp9.LIZIZ;
        if (map2 != null && (l = map2.get("draw_end")) != null) {
            jLongValue = l.longValue();
        }
        c681610QoRBy.LIZ(jLongValue);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchMusicMiddlePageScope.class}).unbindAbility(this.LLIZLLLIL, InterfaceC615300OBk.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd A[PHI: r4
      0x00dd: PHI (r4v3 boolean) = (r4v1 boolean), (r4v0 boolean) binds: [B:91:0x017a, B:57:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.ui.LynxMiddlePageContentAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchMusicMiddlePageScope.class}).bindAbility(this.LLIZLLLIL, InterfaceC615300OBk.class);
    }

    public static void Oo(LynxMiddlePageContentAssem lynxMiddlePageContentAssem, MusicSearchTrendingData musicSearchTrendingData, MusicSearchHistoryData musicSearchHistoryData, EnumC681560QoM enumC681560QoM, int i) {
        MusicSearchHistoryData musicSearchHistoryData2 = musicSearchHistoryData;
        MusicSearchTrendingData musicSearchTrendingData2 = musicSearchTrendingData;
        if ((i & 1) != 0) {
            musicSearchTrendingData2 = null;
        }
        if ((i & 2) != 0) {
            musicSearchHistoryData2 = null;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lynxMiddlePageContentAssem), C0PEM.LIZJ, null, new C681540QoK(((Boolean) C0BYD.LIZIZ.getValue()).booleanValue(), musicSearchTrendingData2, lynxMiddlePageContentAssem, musicSearchHistoryData2, String.valueOf(lynxMiddlePageContentAssem.hashCode()), enumC681560QoM, null), 2);
    }
}
