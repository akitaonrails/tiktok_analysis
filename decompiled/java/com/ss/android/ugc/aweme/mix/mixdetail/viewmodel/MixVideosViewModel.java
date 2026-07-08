package com.ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C080U;
import X.C09JN;
import X.C0COU;
import X.C1164000gOc;
import X.C1164030gOf;
import X.C1164120gOo;
import X.C1169360gXG;
import X.C118300cf;
import X.C11S5;
import X.C1202980hPU;
import X.C1440005kM;
import X.C1701940uOG;
import X.C297190Bkr;
import X.C452501pT;
import X.EnumC1163900gOS;
import X.InterfaceC0148002o;
import X.InterfaceC1164020gOe;
import X.InterfaceC1364105Vn;
import X.InterfaceC736910SvR;
import Y.AfS0S0000100_4;
import Y.AfS187S0100000_18;
import Y.AfS2S0100100_4;
import android.os.SystemClock;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.favorites.business.playlist.ability.IPlaylistCollectionState;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.api.response.MixDetailResponse;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.state.ability.IState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS102S0201000_18;
import kotlin.jvm.internal.AwS115S0400000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MixVideosViewModel extends AssemViewModel<C1164120gOo> {
    public final String LL;
    public final String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public Aweme LLILZIL;
    public Aweme LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public long LLJI;
    public long LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public long LLJJ;
    public MixStruct LLJJI;
    public MixVideosResponse LLJJIII;
    public final C01GW LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public int LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public String LLJJJJLIIL;
    public final C01GW LLJJL;

    public final String BQ2() {
        String authorUid;
        Aweme aweme = this.LLILZIL;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
            if (authorUid == null) {
                return "";
            }
        } else {
            authorUid = this.LLJILJIL;
            if (authorUid == null) {
                return "";
            }
        }
        return authorUid;
    }

    public final String CQ2() {
        return (String) this.LLJJIJI.getValue();
    }

    public final void GQ2() {
        MixFeedApi.LIZ.getClass();
        disposeOnClear(C1169360gXG.LIZ().manageMixFeed(EnumC1163900gOS.MIXDELETE.getOperation(), this.LLILLL, null, null, null, "", null).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS187S0100000_18(this, 21), new AfS187S0100000_18(this, 22)));
    }

    public final void HQ2() {
        MixStruct mixStruct = this.LLJJI;
        if (mixStruct != null && Intrinsics.LJFF(mixStruct.mixId, this.LLILLL)) {
            withState(new AwS227S0300000_18(this.LLJJI, this, (Long) null, 47));
            return;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        MixFeedApi.LIZ.getClass();
        disposeOnClear(C1169360gXG.LIZ().getMixDetail(this.LLILLL, BQ2(), zQ2(), this.LLJJIJIIJIL, true, C0COU.LIZ(), null, Collections.singletonList(new C080U("check_preload", "true"))).LJIIL(new C09JN() { // from class: X.0D2W
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MixVideosViewModel@67cc.requestMixDetail$1");
                C1C7U.LIZIZ("MixVideosViewModel@67cc.requestMixDetail$1");
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0gOk
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MixVideosViewModel@67cc.requestMixDetail$2");
                MixDetailResponse mixDetailResponse = (MixDetailResponse) obj;
                C05FZ c05fz = C05FZ.LIZ;
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("duration_ms", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)), new Pair("reason", "success"), new Pair(Scene.SCENE_SERVICE, "detail_page"));
                c05fz.getClass();
                C05FZ.LIZLLL(mapLJIIIIZZ);
                ((IState) ServiceManager.get().getService(IPlaylistCollectionState.class)).syncState(this.LLILLL, Boolean.valueOf(mixDetailResponse.isCollected), false);
                MixVideosViewModel mixVideosViewModel = this;
                MixStruct mixStruct2 = mixDetailResponse.mixDetail;
                Long lValueOf = Long.valueOf(jElapsedRealtime);
                mixVideosViewModel.getClass();
                mixVideosViewModel.withState(new AwS227S0300000_18(mixStruct2, mixVideosViewModel, lValueOf, 47));
                C1C7U.LIZIZ("MixVideosViewModel@67cc.requestMixDetail$2");
            }
        }, new AfS0S0000100_4(jCurrentTimeMillis, 5)));
        C1440005kM.LIZ(new C1164000gOc(this.LLILLL));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1164120gOo(0);
    }

    public final void wQ2() {
        setStateImmediate(AFwS256S0000000_18.get$arr$(190));
        this.LLJILJILJ = "";
        this.LLJILJIL = "";
        this.LLILZIL = null;
        this.LLJ = false;
        this.LLIZLLLIL = false;
        this.LLJIJIL = 0L;
        this.LLJI = 0L;
        this.LLILZ = "";
        this.LLILLL = "";
        onCleared();
    }

    public final String zQ2() {
        String secAuthorUid;
        Aweme aweme = this.LLILZIL;
        if (aweme != null) {
            secAuthorUid = AwemeExtKt.getSecAuthorUid(aweme);
            if (secAuthorUid == null) {
                return "";
            }
        } else {
            secAuthorUid = this.LLJILJILJ;
            if (secAuthorUid == null) {
                return "";
            }
        }
        return secAuthorUid;
    }

    public MixVideosViewModel() {
        new InterfaceC736910SvR<Object>() { // from class: X.0Ol0
            public static final C01GW<C0O4P<C0O3O>> LLILLJJLI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(588));
            public final C628530Ol1 LL = new InterfaceC149400hg() { // from class: X.0Ol1
            };

            @Override // X.InterfaceC736910SvR
            public final void release() {
            }

            @Override // X.InterfaceC736910SvR
            public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
                return this.LL;
            }
        };
        this.LL = "PLAYLIST_VIDEO_LIST";
        this.LLILLJJLI = "PLAYLIST_DETAIL";
        this.LLILLL = "";
        this.LLILZ = "";
        this.LLIZ = true;
        this.LLJILJIL = "";
        this.LLJILJILJ = "";
        this.LLJILLL = "";
        this.LLJJ = -1L;
        this.LLJJIJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 671));
        this.LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 670));
    }

    public final int AQ2(Aweme aweme) {
        String aid;
        List<Aweme> list = ((C1164120gOo) this.vmDispatcher.getState()).LL;
        if (list != null) {
            Iterator<Aweme> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String aid2 = it2.next().getAid();
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid2, aid)) {
                    if (i >= 0) {
                        return i;
                    }
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

    public final void IQ2(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        setState(new AwS597S0100000_18(aweme, 176));
    }

    public static List vQ2(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    public final void DQ2(Aweme aweme, String str) {
        this.LLILLL = str;
        if (aweme != null) {
            this.LLILZIL = aweme;
            String aid = aweme.getAid();
            aid.toString();
            this.LLILZ = aid;
        } else {
            this.LLILZ = CQ2();
        }
        ((PowerPageSource) this.LLJJL.getValue()).getOperator().refresh();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel.yQ2(java.lang.String, java.lang.String):void");
    }

    public final void FQ2(MixVideosResponse mixVideosResponse, int i, Long l) {
        withState(new AwS102S0201000_18(i, mixVideosResponse, this, 1));
        List<? extends Aweme> list = mixVideosResponse.mixVideos;
        if (list == null || list.isEmpty()) {
            setState(AFwS256S0000000_18.get$arr$(191));
        }
        if (this.LLJJ > 0 && l != null) {
            C1202980hPU.LIZ(this.LLJILLL, this.LL, this.LLJJ, l.longValue(), SystemClock.elapsedRealtime(), C297190Bkr.LIZ(), new InterfaceC1164020gOe() { // from class: X.0gOb
                @Override // X.InterfaceC1164020gOe
                public final void onEvent(Map map) {
                    C20684815ws.LJIILLIIL("power_preload_duration_key", map);
                }
            });
        }
    }

    public final void xQ2(Long l, String str, String str2) {
        if (l != null) {
            l.longValue();
            if (str == null || str2 == null) {
                return;
            }
            int iLIZ = C1164030gOf.LIZ();
            long jCurrentTimeMillis = System.currentTimeMillis();
            MixFeedApi.LIZ.getClass();
            disposeOnClear(C1169360gXG.LIZ().getMixVideos2(this.LLILLL, "", this.LLJIJIL, 3, BQ2(), zQ2(), this.LLJJIJIIJIL, Integer.valueOf(iLIZ), 1, null, null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS2S0100100_4(jCurrentTimeMillis, this, 0), new AfS0S0000100_4(jCurrentTimeMillis, 3)));
        }
    }

    public final void EQ2(MixVideosResponse mixVideosResponse, int i, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn, Long l) {
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = i;
        withState(new AwS115S0400000_18(mixVideosResponse, (MixVideosResponse) c118300cf, (C118300cf) this, (MixVideosViewModel) interfaceC1364105Vn, (InterfaceC1364105Vn<? super AbstractC316870CbV<Long>>) 4));
        if (this.LLJJ > 0 && l != null) {
            C1202980hPU.LIZ(this.LLJILLL, this.LL, this.LLJJ, l.longValue(), SystemClock.elapsedRealtime(), C297190Bkr.LIZ(), new InterfaceC1164020gOe() { // from class: X.0gOa
                @Override // X.InterfaceC1164020gOe
                public final void onEvent(Map map) {
                    C20684815ws.LJIILLIIL("power_preload_duration_key", map);
                }
            });
        }
    }
}
